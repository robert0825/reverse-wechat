package com.tencent.mm.ui.contact;

import com.tencent.gmtrace.GMTrace;

public abstract class m
  extends n
{
  public a wSA;
  
  public m(l paraml, boolean paramBoolean, int paramInt)
  {
    super(paraml, paramBoolean, paramInt);
    GMTrace.i(1765231558656L, 13152);
    GMTrace.o(1765231558656L, 13152);
  }
  
  public abstract void Ty();
  
  public void a(a parama)
  {
    GMTrace.i(1765634211840L, 13155);
    this.wSA = parama;
    GMTrace.o(1765634211840L, 13155);
  }
  
  public abstract void a(String paramString, int[] paramArrayOfInt, boolean paramBoolean);
  
  public static abstract interface a
  {
    public abstract void r(String paramString, int paramInt, boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */