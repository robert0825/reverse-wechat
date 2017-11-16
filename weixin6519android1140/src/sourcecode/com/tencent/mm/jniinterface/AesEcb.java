package com.tencent.mm.jniinterface;

import com.tencent.gmtrace.GMTrace;

public class AesEcb
{
  public AesEcb()
  {
    GMTrace.i(310714040320L, 2315);
    GMTrace.o(310714040320L, 2315);
  }
  
  public static native byte[] aesCryptEcb(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, boolean paramBoolean1, boolean paramBoolean2);
  
  public static native void test();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\jniinterface\AesEcb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */