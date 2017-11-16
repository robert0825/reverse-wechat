package com.tencent.mm.plugin.appbrand.media.encode;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.k;

public class Mp3EncodeJni
{
  static
  {
    GMTrace.i(19852278366208L, 147911);
    k.b("mp3lame", Mp3EncodeJni.class.getClassLoader());
    GMTrace.o(19852278366208L, 147911);
  }
  
  public Mp3EncodeJni()
  {
    GMTrace.i(19851204624384L, 147903);
    GMTrace.o(19851204624384L, 147903);
  }
  
  public static native void close();
  
  public static native int encode(short[] paramArrayOfShort1, short[] paramArrayOfShort2, int paramInt, byte[] paramArrayOfByte);
  
  public static native int encodeBufferInterleaved(short[] paramArrayOfShort, int paramInt, byte[] paramArrayOfByte);
  
  public static native int flush(byte[] paramArrayOfByte);
  
  public static native int getVersion();
  
  public static native int init(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  
  public static native void setMode(int paramInt);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\media\encode\Mp3EncodeJni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */