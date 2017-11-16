package com.tencent.mm.offlineutil;

import com.tencent.gmtrace.GMTrace;

public class OfflineUtilJni
{
  public OfflineUtilJni()
  {
    GMTrace.i(14018370600960L, 104445);
    GMTrace.o(14018370600960L, 104445);
  }
  
  public static native char[] CheckSumWithBase91(String paramString);
  
  public static native String DecodeBase91(String paramString);
  
  public static native String EncodeBase91(String paramString);
  
  public static native String GenOffLineQrcode(String paramString, byte[] paramArrayOfByte);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\offlineutil\OfflineUtilJni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */