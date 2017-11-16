package com.tencent.mm.plugin.fingerprint;

import com.tencent.gmtrace.GMTrace;

public class FingerPrintAuth
{
  public FingerPrintAuth()
  {
    GMTrace.i(10770167365632L, 80244);
    GMTrace.o(10770167365632L, 80244);
  }
  
  public static native void clearData(String paramString1, String paramString2, int paramInt);
  
  public static native String genOpenFPEncrypt(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9);
  
  public static native String genOpenFPSign(String paramString1, String paramString2, String paramString3, String paramString4);
  
  public static native String genPayFPEncrypt(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7);
  
  public static native String genPayFPSign(String paramString1, String paramString2, String paramString3, String paramString4);
  
  public static native String genRsaKey(String paramString1, String paramString2, String paramString3);
  
  public static native String getFingerPrintId(String paramString1, String paramString2);
  
  public static native String getRsaKey(String paramString1, String paramString2, String paramString3);
  
  public static native String getX509Csr(String paramString);
  
  public static native boolean importCert(String paramString1, String paramString2);
  
  public static native int saveX509Csr(String paramString1, String paramString2);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fingerprint\FingerPrintAuth.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */