package com.tencent.mm.plugin.appbrand.media.encode;

import com.tencent.gmtrace.GMTrace;

public class M4aAudioFormatJni
{
  public M4aAudioFormatJni()
  {
    GMTrace.i(19849996664832L, 147894);
    GMTrace.o(19849996664832L, 147894);
  }
  
  public static native void closeM4aFile();
  
  public static native int createM4aFile(String paramString, int paramInt1, int paramInt2, int paramInt3);
  
  public static native int writeAudioBuff(byte[] paramArrayOfByte, int paramInt);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\media\encode\M4aAudioFormatJni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */