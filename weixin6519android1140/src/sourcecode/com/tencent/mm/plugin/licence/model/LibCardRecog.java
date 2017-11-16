package com.tencent.mm.plugin.licence.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.k;

public final class LibCardRecog
{
  static
  {
    GMTrace.i(8933263540224L, 66558);
    k.b("IDCardRecog", LibCardRecog.class.getClassLoader());
    GMTrace.o(8933263540224L, 66558);
  }
  
  public LibCardRecog()
  {
    GMTrace.i(8932726669312L, 66554);
    GMTrace.o(8932726669312L, 66554);
  }
  
  public static native int recognizeBankCardGetVersion();
  
  public static native int recognizeBankCardInit(int paramInt1, int paramInt2, boolean paramBoolean);
  
  public static native int recognizeBankCardProcess(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, BankCardInfo paramBankCardInfo, boolean[] paramArrayOfBoolean);
  
  public static native int recognizeBankCardRelease();
  
  public static native String recognizeBankCardSegmentNumber(String paramString, int paramInt, int[] paramArrayOfInt);
  
  public static native int recognizeCardInit(int paramInt1, int paramInt2, int paramInt3);
  
  public static native int recognizeCardProcess(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, CardInfo paramCardInfo, boolean[] paramArrayOfBoolean);
  
  public static native int recognizeCardRelease();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\licence\model\LibCardRecog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */