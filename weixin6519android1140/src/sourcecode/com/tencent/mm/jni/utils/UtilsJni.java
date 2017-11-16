package com.tencent.mm.jni.utils;

import com.tencent.gmtrace.GMTrace;

public class UtilsJni
{
  public UtilsJni()
  {
    GMTrace.i(13824291766272L, 102999);
    GMTrace.o(13824291766272L, 102999);
  }
  
  public static native byte[] cryptGenRandom(int paramInt);
  
  public static native int doEcdsaSHAVerify(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3);
  
  public static native int doEcdsaVerify(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\jni\utils\UtilsJni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */