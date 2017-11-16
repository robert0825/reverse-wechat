package com.google.android.gms.common.stats;

import android.os.PowerManager.WakeLock;
import android.os.Process;
import android.text.TextUtils;

public final class f
{
  public static String a(PowerManager.WakeLock paramWakeLock, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder().append(String.valueOf(Process.myPid() << 32 | System.identityHashCode(paramWakeLock)));
    paramWakeLock = paramString;
    if (TextUtils.isEmpty(paramString)) {
      paramWakeLock = "";
    }
    return paramWakeLock;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\common\stats\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */