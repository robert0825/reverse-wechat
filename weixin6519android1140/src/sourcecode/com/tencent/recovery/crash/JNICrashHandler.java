package com.tencent.recovery.crash;

import com.tencent.recovery.Recovery;
import com.tencent.recovery.log.RecoveryLog;

public class JNICrashHandler
{
  private static final String TAG = "Recovery.JNICrashHandler";
  
  private static void onCrash()
  {
    RecoveryLog.i("Recovery.JNICrashHandler", "onCrash", new Object[0]);
    Recovery.cnf();
  }
  
  public static native void testSignal(int paramInt);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\recovery\crash\JNICrashHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */