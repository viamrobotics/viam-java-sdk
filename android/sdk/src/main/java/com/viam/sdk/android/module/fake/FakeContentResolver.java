/*
  We only compile this file manually into a JAR to use hidden Android APIs for ContentResolvers.
  See https://github.com/anggrayudi/android-hidden-api?tab=readme-ov-file
  javac -cp ./tools/android-30.jar ./android/sdk/src/main/java/com/viam/sdk/android/module/fake/FakeContentResolver.java
  d8 --lib ./tools/android-30.jar --file-per-class --output ./android/sdk/src/main/resources/ \
    ./android/sdk/src/main/java/com/viam/sdk/android/module/fake/FakeContentResolver.class
 */
package com.viam.sdk.android.module.fake;

import android.content.ContentResolver;
import android.content.Context;
import android.content.IContentProvider;

/**
 * @noinspection SameReturnValue
 */
public class FakeContentResolver extends ContentResolver {

  public FakeContentResolver(Context context) {
    super(context);
  }

  @Override
  protected IContentProvider acquireProvider(Context c, String name) {
    return null;
  }

  @Override
  public boolean releaseProvider(IContentProvider icp) {
    return false;
  }

  @Override
  protected IContentProvider acquireUnstableProvider(Context c, String name) {
    return null;
  }

  @Override
  public boolean releaseUnstableProvider(IContentProvider icp) {
    return false;
  }

  @Override
  public void unstableProviderDied(IContentProvider icp) {

  }
}
