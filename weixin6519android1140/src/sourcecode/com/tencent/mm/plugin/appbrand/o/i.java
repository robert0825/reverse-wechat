package com.tencent.mm.plugin.appbrand.o;

import com.tencent.gmtrace.GMTrace;

public final class i
  implements k
{
  final k iGF;
  int iGG;
  int iGH;
  int iGI;
  Object iGJ;
  
  public i(k paramk)
  {
    GMTrace.i(10012910944256L, 74602);
    this.iGG = 0;
    this.iGH = -1;
    this.iGI = -1;
    this.iGJ = null;
    this.iGF = paramk;
    GMTrace.o(10012910944256L, 74602);
  }
  
  public final void abD()
  {
    GMTrace.i(10013045161984L, 74603);
    if (this.iGG == 0)
    {
      GMTrace.o(10013045161984L, 74603);
      return;
    }
    switch (this.iGG)
    {
    }
    for (;;)
    {
      this.iGJ = null;
      this.iGG = 0;
      GMTrace.o(10013045161984L, 74603);
      return;
      this.iGF.bw(this.iGH, this.iGI);
      continue;
      this.iGF.bx(this.iGH, this.iGI);
      continue;
      this.iGF.d(this.iGH, this.iGI, this.iGJ);
    }
  }
  
  public final void bw(int paramInt1, int paramInt2)
  {
    GMTrace.i(10013179379712L, 74604);
    if ((this.iGG == 1) && (paramInt1 >= this.iGH) && (paramInt1 <= this.iGH + this.iGI))
    {
      this.iGI += paramInt2;
      this.iGH = Math.min(paramInt1, this.iGH);
      GMTrace.o(10013179379712L, 74604);
      return;
    }
    abD();
    this.iGH = paramInt1;
    this.iGI = paramInt2;
    this.iGG = 1;
    GMTrace.o(10013179379712L, 74604);
  }
  
  public final void bx(int paramInt1, int paramInt2)
  {
    GMTrace.i(10013313597440L, 74605);
    if ((this.iGG == 2) && (this.iGH >= paramInt1) && (this.iGH <= paramInt1 + paramInt2))
    {
      this.iGI += paramInt2;
      this.iGH = paramInt1;
      GMTrace.o(10013313597440L, 74605);
      return;
    }
    abD();
    this.iGH = paramInt1;
    this.iGI = paramInt2;
    this.iGG = 2;
    GMTrace.o(10013313597440L, 74605);
  }
  
  public final void by(int paramInt1, int paramInt2)
  {
    GMTrace.i(10013447815168L, 74606);
    abD();
    this.iGF.by(paramInt1, paramInt2);
    GMTrace.o(10013447815168L, 74606);
  }
  
  public final void d(int paramInt1, int paramInt2, Object paramObject)
  {
    GMTrace.i(10013582032896L, 74607);
    if ((this.iGG == 3) && (paramInt1 <= this.iGH + this.iGI) && (paramInt1 + paramInt2 >= this.iGH) && (this.iGJ == paramObject))
    {
      int i = this.iGH;
      int j = this.iGI;
      this.iGH = Math.min(paramInt1, this.iGH);
      this.iGI = (Math.max(i + j, paramInt1 + paramInt2) - this.iGH);
      GMTrace.o(10013582032896L, 74607);
      return;
    }
    abD();
    this.iGH = paramInt1;
    this.iGI = paramInt2;
    this.iGJ = paramObject;
    this.iGG = 3;
    GMTrace.o(10013582032896L, 74607);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\o\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */