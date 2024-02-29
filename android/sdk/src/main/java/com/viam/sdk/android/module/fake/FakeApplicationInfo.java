package com.viam.sdk.android.module.fake;

import android.content.pm.ApplicationInfo;

public class FakeApplicationInfo extends ApplicationInfo {

  public FakeApplicationInfo() {
    this.nativeLibraryDir = System.getProperty("java.library.path");
  }
}
