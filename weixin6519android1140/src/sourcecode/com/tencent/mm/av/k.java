package com.tencent.mm.av;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.b;
import com.tencent.mm.protocal.c.aoq;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.sdk.platformtools.bg;

@Deprecated
public final class k
  extends e.b
{
  private aoq gPx;
  
  public k(String paramString, int paramInt)
  {
    super(20);
    GMTrace.i(300513492992L, 2239);
    this.gPx = new aoq();
    this.gPx.tPF = new azq().Rq(bg.nl(paramString));
    this.gPx.jhA = paramInt;
    this.mVj = this.gPx;
    GMTrace.o(300513492992L, 2239);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\av\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */