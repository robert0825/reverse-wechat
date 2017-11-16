package com.tencent.mm.plugin.imgenc;

import com.tencent.gmtrace.GMTrace;

public class MMIMAGEENCJNI
{
  public static final String TAG = "MMIMAGEENCJNI";
  
  public MMIMAGEENCJNI()
  {
    GMTrace.i(13850732658688L, 103196);
    GMTrace.o(13850732658688L, 103196);
  }
  
  public static native long free(long paramLong);
  
  public static native long open(long paramLong);
  
  public static native long open(String paramString);
  
  public static native byte[] readByte(long paramLong, byte[] paramArrayOfByte);
  
  public static native long seek(long paramLong1, long paramLong2, int paramInt);
  
  public static native long transFor(long paramLong1, byte[] paramArrayOfByte, long paramLong2, long paramLong3);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\imgenc\MMIMAGEENCJNI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */