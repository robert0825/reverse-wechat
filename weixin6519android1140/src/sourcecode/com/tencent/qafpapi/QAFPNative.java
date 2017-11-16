package com.tencent.qafpapi;

import com.tencent.mm.compatible.util.k;

public class QAFPNative
{
  static
  {
    k.b("wechatQAFP", QAFPNative.class.getClassLoader());
  }
  
  public static native int QAFPGetAudioFingerPrint(byte[] paramArrayOfByte);
  
  public static native int QAFPGetAudioFingerPrintTV(byte[] paramArrayOfByte);
  
  public static native int QAFPGetVersion();
  
  public static native int QAFPInit();
  
  public static native int QAFPProcess(byte[] paramArrayOfByte, int paramInt);
  
  public static native int QAFPProcessTV(byte[] paramArrayOfByte, int paramInt);
  
  public static native int QAFPRelease();
  
  public static native int QAFPReset();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\qafpapi\QAFPNative.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */