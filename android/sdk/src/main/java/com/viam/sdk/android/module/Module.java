package com.viam.sdk.android.module;

import android.content.ContentResolver;
import android.content.Context;
import android.net.LocalSocketAddress;
import android.os.Looper;
import com.viam.sdk.android.module.fake.FakeContext;
import com.viam.sdk.core.module.BaseModule;
import com.viam.sdk.core.robot.RobotClient;
import com.viam.sdk.core.robot.RobotClient.Options;
import com.viam.sdk.core.rpc.BasicManagedChannel;
import dalvik.system.InMemoryDexClassLoader;
import io.grpc.ManagedChannel;
import io.grpc.ServerBuilder;
import io.grpc.android.UdsChannelBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.function.Supplier;
import org.apache.commons.io.IOUtils;
import org.webrtc.MediaStream;

public class Module extends BaseModule {

  private static Supplier<Context> parentContext;

  RobotClient parent;

  /**
   * Create a new Module with the args provided in the command line. The first argument after the
   * command must be the socket path. If the second argument after the command is
   * "--log-level=debug", the Module's logger will be DEBUG level. Otherwise, it will be INFO level.
   * See LogLevel documentation in the RDK for more information on how to start modules with a
   * "log-level" commandline argument.
   */
  public Module(final String[] args) {
    super(args);

    // if we're running out of process, we may need this. noop otherwise
    try {
      if (Looper.getMainLooper() == null) {
        Looper.prepareMainLooper();
      }
    } catch (IllegalStateException ignored) {
    }

  }

  public static Context getParentContext() {
    if (parentContext == null) {
      throw new RuntimeException(
          "invalid module state with no parent context (not running as in-process module?)");
    }
    return parentContext.get();
  }

  /**
   * @noinspection SameParameterValue
   */
  private ByteBuffer readResourceFile(final String name) {
    final InputStream is = getClass().getResourceAsStream(name);
    final byte[] data;
    try {
      assert is != null;
      data = IOUtils.toByteArray(is);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return ByteBuffer.wrap(data);
  }

  public Context buildFakeContext(final String filesDir) {
    // NOTE: this must be updated as FakeContentResolver is updated. See the file docstring for more details
    final List<ByteBuffer> dexBuffers = List.of(
        readResourceFile("/com/viam/sdk/android/module/fake/FakeContentResolver.dex")
    );
    final ByteBuffer[] dexBuffersArray = dexBuffers.toArray(new ByteBuffer[0]);
    final ClassLoader loader = new InMemoryDexClassLoader(dexBuffersArray,
        System.getProperty("java.library.path"),
        getClass().getClassLoader());
    try {
      final Class<?> cls = loader.loadClass("com.viam.sdk.android.module.fake.FakeContentResolver");
      return new FakeContext(filesDir, ctx -> {
        try {
          return (ContentResolver) cls.getConstructor(Context.class).newInstance(ctx);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException |
                 NoSuchMethodException e) {
          throw new RuntimeException(e);
        }
      });
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  protected void setParentAddress(final String parentAddress) {
    final ManagedChannel chan = UdsChannelBuilder.forPath(parentAddress,
        LocalSocketAddress.Namespace.FILESYSTEM).build();
    parent = new RobotClient(new BasicManagedChannel(chan),
        new Options.Builder<MediaStream>().setLogLevel(getLogLevel()).build());
  }

  @Override
  protected RobotClient getParent() {
    return parent;
  }

  @Override
  public ServerBuilder<?> getServerBuilder() {
    return UdsServerBuilder.
        forPath(address, LocalSocketAddress.Namespace.FILESYSTEM);
  }
}
