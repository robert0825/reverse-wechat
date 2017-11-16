package com.tencent.mm.plugin.fts.jni;

import com.tencent.gmtrace.GMTrace;

public class FTSJNIUtils
{
  public FTSJNIUtils()
  {
    GMTrace.i(16713999450112L, 124529);
    GMTrace.o(16713999450112L, 124529);
  }
  
  public static native int countTokens(String paramString);
  
  public static native String icuTokenizer(String paramString);
  
  public static native void nativeInitFts(long paramLong, byte[] paramArrayOfByte);
  
  public static native int stringCompareUtfBinary(String paramString1, String paramString2);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fts\jni\FTSJNIUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */