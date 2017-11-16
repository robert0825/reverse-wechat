package com.tencent.mm.av;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.b;
import com.tencent.mm.protocal.c.aou;
import com.tencent.mm.protocal.c.py;
import com.tencent.mm.protocal.c.pz;

@Deprecated
public final class l
  extends e.b
{
  private aou gPy;
  
  public l()
  {
    this(false, 22, 8);
    GMTrace.i(300379275264L, 2238);
    GMTrace.o(300379275264L, 2238);
  }
  
  public l(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    super(31);
    GMTrace.i(300245057536L, 2237);
    this.gPy = new aou();
    py localpy = new py();
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      localpy.ufU = i;
      i = j;
      if (paramBoolean) {
        i = 0;
      }
      localpy.ufW = i;
      pz localpz = new pz();
      localpz.ufY = paramInt1;
      localpz.ufZ = paramInt2;
      localpy.ufV = localpz;
      localpz.ufY = 0;
      localpz.ufZ = 0;
      localpy.ufX = localpz;
      this.gPy.uEK = localpy;
      this.mVj = this.gPy;
      GMTrace.o(300245057536L, 2237);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\av\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */