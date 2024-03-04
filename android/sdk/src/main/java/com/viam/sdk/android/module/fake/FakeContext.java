package com.viam.sdk.android.module.fake;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import android.view.Display;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.function.Function;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @noinspection NullableProblems
 */
public class FakeContext extends Context {

  private final String filesDir;
  private final ContentResolver resolver;
  static Context systemContext = null;

  public FakeContext(final String filesDir,
      final Function<Context, ContentResolver> resolverFactory) {
    this.filesDir = filesDir;
    this.resolver = resolverFactory.apply(this);
  }

  @Override
  public AssetManager getAssets() {
    throw new UnsupportedOperationException("getAssets");
  }

  @Override
  public Resources getResources() {
    throw new UnsupportedOperationException("getResources");
  }

  // create a ContextImpl instance with reflection.
  public static Context createContextImpl() {
    try {
      Class ContextImpl = Class.forName("android.app.ContextImpl");
      Class ActivityThread = Class.forName("android.app.ActivityThread");
      Object thread = ActivityThread.getDeclaredConstructors()[0].newInstance();
      Method createSystemContext = ContextImpl.getDeclaredMethod("createSystemContext", ActivityThread);
      createSystemContext.setAccessible(true);
      return (Context) createSystemContext.invoke(null, new Object[]{thread});
    } catch (ClassNotFoundException | InvocationTargetException | UnsupportedOperationException | NoSuchMethodException | IllegalAccessException | InstantiationException e) {
       throw new UnsupportedOperationException("getPackageManager, " + e + ", cause " + e.getCause());
    }
  }

  public static Context getSystemContext() {
    // warning: race condition
    if (systemContext == null) {
      systemContext = createContextImpl();
    }
    return systemContext;
  }

  @Override
  public PackageManager getPackageManager() {
    return getSystemContext().getPackageManager();
  }

  @Override
  public String getOpPackageName() {
    return "com.nothing";
  }

  @Override
  public ContentResolver getContentResolver() {
    return resolver;
  }

  @Override
  public Looper getMainLooper() {
    throw new UnsupportedOperationException("getMainLooper");
  }

  @Override
  public Context getApplicationContext() {
    return this;
  }

  @Override
  public void setTheme(int resId) {

  }

  @Override
  public Theme getTheme() {
    throw new UnsupportedOperationException("getTheme");
  }

  @Override
  public ClassLoader getClassLoader() {
    return getClass().getClassLoader();
  }

  @Override
  public String getPackageName() {
    return Objects.requireNonNull(getClass().getPackage()).getName();
  }

  public static class FakeApplicationInfo extends ApplicationInfo {

    public FakeApplicationInfo() {
      this.nativeLibraryDir = System.getProperty("java.library.path");
    }
  }

  @Override
  public ApplicationInfo getApplicationInfo() {
    return new FakeApplicationInfo();
  }

  @Override
  public String getPackageResourcePath() {
    throw new UnsupportedOperationException("getPackageResourcePath");
  }

  @Override
  public String getPackageCodePath() {
    throw new UnsupportedOperationException("getPackageCodePath");
  }

  @Override
  public SharedPreferences getSharedPreferences(String name, int mode) {
    throw new UnsupportedOperationException("getSharedPreferences");
  }

  @Override
  public boolean moveSharedPreferencesFrom(Context sourceContext, String name) {
    return false;
  }

  @Override
  public boolean deleteSharedPreferences(String name) {
    return false;
  }

  @Override
  public FileInputStream openFileInput(String name) throws FileNotFoundException {
    throw new UnsupportedOperationException("openFileInput");
  }

  @Override
  public FileOutputStream openFileOutput(String name, int mode) throws FileNotFoundException {
    throw new UnsupportedOperationException("openFileOutput");
  }

  @Override
  public boolean deleteFile(String name) {
    return false;
  }

  @Override
  public File getFileStreamPath(String name) {
    throw new UnsupportedOperationException("getFileStreamPath");
  }

  @Override
  public File getDataDir() {
    throw new UnsupportedOperationException("getDataDir");
  }

  @Override
  public File getFilesDir() {
    return new File(filesDir);
  }

  @Override
  public File getNoBackupFilesDir() {
    throw new UnsupportedOperationException("getNoBackupFilesDir");
  }

  @Override
  public File getExternalFilesDir(String type) {
    throw new UnsupportedOperationException("getExternalFilesDir");
  }

  @Override
  public File[] getExternalFilesDirs(String type) {
    return new File[0];
  }

  @Override
  public File getObbDir() {
    throw new UnsupportedOperationException("getObbDir");
  }

  @Override
  public File[] getObbDirs() {
    return new File[0];
  }

  @Override
  public File getCacheDir() {
    throw new UnsupportedOperationException("getCacheDir");
  }

  @Override
  public File getCodeCacheDir() {
    throw new UnsupportedOperationException("getCodeCacheDir");
  }

  @Override
  public File getExternalCacheDir() {
    throw new UnsupportedOperationException("getExternalCacheDir");
  }

  @Override
  public File[] getExternalCacheDirs() {
    return new File[0];
  }

  @Override
  public File[] getExternalMediaDirs() {
    return new File[0];
  }

  @Override
  public String[] fileList() {
    return new String[0];
  }

  @Override
  public File getDir(String name, int ignored) {
    final File file = Paths.get(filesDir, name).toFile();
    //noinspection ResultOfMethodCallIgnored
    file.mkdirs();
    return file;
  }

  @Override
  public SQLiteDatabase openOrCreateDatabase(String name, int mode, CursorFactory factory) {
    throw new UnsupportedOperationException("openOrCreateDatabase");
  }

  @Override
  public SQLiteDatabase openOrCreateDatabase(String name, int mode, CursorFactory factory,
      DatabaseErrorHandler errorHandler) {
    throw new UnsupportedOperationException(" {");
  }

  @Override
  public boolean moveDatabaseFrom(Context sourceContext, String name) {
    return false;
  }

  @Override
  public boolean deleteDatabase(String name) {
    return false;
  }

  @Override
  public File getDatabasePath(String name) {
    throw new UnsupportedOperationException("getDatabasePath");
  }

  @Override
  public String[] databaseList() {
    return new String[0];
  }

  @Override
  public Drawable getWallpaper() {
    throw new UnsupportedOperationException("getWallpaper");
  }

  @Override
  public Drawable peekWallpaper() {
    throw new UnsupportedOperationException("peekWallpaper");
  }

  @Override
  public int getWallpaperDesiredMinimumWidth() {
    return 0;
  }

  @Override
  public int getWallpaperDesiredMinimumHeight() {
    return 0;
  }

  @Override
  public void setWallpaper(Bitmap bitmap) throws IOException {

  }

  @Override
  public void setWallpaper(InputStream data) throws IOException {

  }

  @Override
  public void clearWallpaper() throws IOException {

  }

  @Override
  public void startActivity(Intent intent) {

  }

  @Override
  public void startActivity(Intent intent, Bundle options) {

  }

  @Override
  public void startActivities(Intent[] intents) {

  }

  @Override
  public void startActivities(Intent[] intents, Bundle options) {

  }

  @Override
  public void startIntentSender(IntentSender intent, Intent fillInIntent, int flagsMask,
      int flagsValues, int extraFlags) {

  }

  @Override
  public void startIntentSender(IntentSender intent, Intent fillInIntent, int flagsMask,
      int flagsValues, int extraFlags, Bundle options) {

  }

  @Override
  public void sendBroadcast(Intent intent) {

  }

  @Override
  public void sendBroadcast(Intent intent, String receiverPermission) {

  }

  @Override
  public void sendBroadcast(Intent intent, String receiverPermission, Bundle options) {

  }

  @Override
  public void sendOrderedBroadcast(Intent intent, String receiverPermission) {

  }

  @Override
  public void sendOrderedBroadcast(Intent intent, String receiverPermission,
      BroadcastReceiver resultReceiver, Handler scheduler, int initialCode, String initialData,
      Bundle initialExtras) {

  }

  @Override
  public void sendOrderedBroadcast(Intent intent, String receiverPermission, Bundle options,
      BroadcastReceiver resultReceiver, Handler scheduler, int initialCode, String initialData,
      Bundle initialExtras) {

  }

  @Override
  public void sendBroadcastAsUser(Intent intent, UserHandle user) {

  }

  @Override
  public void sendBroadcastAsUser(Intent intent, UserHandle user, String receiverPermission) {

  }

  @Override
  public void sendOrderedBroadcastAsUser(Intent intent, UserHandle user, String receiverPermission,
      BroadcastReceiver resultReceiver, Handler scheduler, int initialCode, String initialData,
      Bundle initialExtras) {

  }

  @Override
  public void sendStickyBroadcast(Intent intent) {

  }

  @Override
  public void sendStickyOrderedBroadcast(Intent intent, BroadcastReceiver resultReceiver,
      Handler scheduler, int initialCode, String initialData, Bundle initialExtras) {

  }

  @Override
  public void removeStickyBroadcast(Intent intent) {

  }

  @Override
  public void sendStickyBroadcastAsUser(Intent intent, UserHandle user) {

  }

  @Override
  public void sendStickyOrderedBroadcastAsUser(Intent intent, UserHandle user,
      BroadcastReceiver resultReceiver, Handler scheduler, int initialCode, String initialData,
      Bundle initialExtras) {

  }

  @Override
  public void removeStickyBroadcastAsUser(Intent intent, UserHandle user) {

  }

  @Override
  public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter) {
    throw new UnsupportedOperationException("registerReceiver");
  }

  @Override
  public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter, int flags) {
    throw new UnsupportedOperationException("registerReceiver");
  }

  @Override
  public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter,
      String broadcastPermission, Handler scheduler) {
    throw new UnsupportedOperationException(" Handler");
  }

  @Override
  public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter,
      String broadcastPermission, Handler scheduler, int flags) {
    throw new UnsupportedOperationException(" Handler");
  }

  @Override
  public void unregisterReceiver(BroadcastReceiver receiver) {

  }

  @Override
  public ComponentName startService(Intent service) {
    throw new UnsupportedOperationException("startService");
  }

  @Override
  public ComponentName startForegroundService(Intent service) {
    throw new UnsupportedOperationException("startForegroundService");
  }

  @Override
  public boolean stopService(Intent service) {
    return false;
  }

  @Override
  public boolean bindService(Intent service, ServiceConnection conn, int flags) {
    return false;
  }

  @Override
  public void unbindService(ServiceConnection conn) {

  }

  @Override
  public boolean startInstrumentation(ComponentName className, String profileFile,
      Bundle arguments) {
    return false;
  }

  @Override
  public Object getSystemService(String name) {
    throw new UnsupportedOperationException("getSystemService");
  }

  @Override
  public String getSystemServiceName(Class<?> serviceClass) {
    throw new UnsupportedOperationException("getSystemServiceName");
  }

  @Override
  public int checkPermission(String permission, int pid, int uid) {
    return PackageManager.PERMISSION_GRANTED;
  }

  @Override
  public int checkCallingPermission(String permission) {
    return PackageManager.PERMISSION_GRANTED;
  }

  @Override
  public int checkCallingOrSelfPermission(String permission) {
    return PackageManager.PERMISSION_GRANTED;
  }

  @Override
  public int checkSelfPermission(String permission) {
    return PackageManager.PERMISSION_GRANTED;
  }

  @Override
  public void enforcePermission(String permission, int pid, int uid, String message) {

  }

  @Override
  public void enforceCallingPermission(String permission, String message) {

  }

  @Override
  public void enforceCallingOrSelfPermission(String permission, String message) {

  }

  @Override
  public void grantUriPermission(String toPackage, Uri uri, int modeFlags) {

  }

  @Override
  public void revokeUriPermission(Uri uri, int modeFlags) {

  }

  @Override
  public void revokeUriPermission(String toPackage, Uri uri, int modeFlags) {

  }

  @Override
  public int checkUriPermission(Uri uri, int pid, int uid, int modeFlags) {
    return PackageManager.PERMISSION_GRANTED;
  }

  @Override
  public int checkCallingUriPermission(Uri uri, int modeFlags) {
    return PackageManager.PERMISSION_GRANTED;
  }

  @Override
  public int checkCallingOrSelfUriPermission(Uri uri, int modeFlags) {
    return PackageManager.PERMISSION_GRANTED;
  }

  @Override
  public int checkUriPermission(Uri uri, String readPermission, String writePermission, int pid,
      int uid, int modeFlags) {
    return PackageManager.PERMISSION_GRANTED;
  }

  @Override
  public void enforceUriPermission(Uri uri, int pid, int uid, int modeFlags, String message) {

  }

  @Override
  public void enforceCallingUriPermission(Uri uri, int modeFlags, String message) {

  }

  @Override
  public void enforceCallingOrSelfUriPermission(Uri uri, int modeFlags, String message) {

  }

  @Override
  public void enforceUriPermission(Uri uri, String readPermission, String writePermission, int pid,
      int uid, int modeFlags, String message) {

  }

  @Override
  public Context createPackageContext(String packageName, int flags) {
    throw new UnsupportedOperationException("createPackageContext");
  }

  @Override
  public Context createContextForSplit(String splitName) {
    throw new UnsupportedOperationException("createContextForSplit");
  }

  @Override
  public Context createConfigurationContext(Configuration overrideConfiguration) {
    throw new UnsupportedOperationException("createConfigurationContext");
  }

  @Override
  public Context createDisplayContext(Display display) {
    throw new UnsupportedOperationException("createDisplayContext");
  }

  @Override
  public Context createDeviceProtectedStorageContext() {
    throw new UnsupportedOperationException("createDeviceProtectedStorageContext");
  }

  @Override
  public boolean isDeviceProtectedStorage() {
    return false;
  }
}
