package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import com.tencent.gmtrace.GMTrace;

public final class a
{
  public final q sgO;
  public int sgP;
  public int sgQ;
  
  public a(q paramq, int paramInt1, int paramInt2)
  {
    GMTrace.i(20629399011328L, 153701);
    this.sgO = paramq;
    this.sgP = paramInt1;
    this.sgQ = paramInt2;
    GMTrace.o(20629399011328L, 153701);
  }
  
  public final String toString()
  {
    GMTrace.i(20629533229056L, 153702);
    String str = this.sgO.name() + " - " + this.sgP + "/" + this.sgQ;
    GMTrace.o(20629533229056L, 153702);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\spans\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */