package com.tencent.mm.pluginsdk.model;

import com.tencent.gmtrace.GMTrace;

public final class p
{
  public String eEa;
  private int tne;
  public String tnf;
  public String tng;
  public String tnh;
  public int tni;
  
  p(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt2)
  {
    GMTrace.i(750277099520L, 5590);
    this.tne = paramInt1;
    this.eEa = paramString1;
    this.tnf = paramString2;
    this.tni = paramInt2;
    this.tng = paramString3;
    this.tnh = paramString4;
    GMTrace.o(750277099520L, 5590);
  }
  
  public final String toString()
  {
    GMTrace.i(750411317248L, 5591);
    String str = "id:" + this.tne + ";productId:" + this.eEa + ";full:" + this.tnf + ";productState:" + this.tni + ";priceCurrencyCode:" + this.tng + ";priceAmountMicros:" + this.tnh;
    GMTrace.o(750411317248L, 5591);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */