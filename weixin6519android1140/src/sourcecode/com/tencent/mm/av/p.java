package com.tencent.mm.av;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.b;
import com.tencent.mm.protocal.c.awp;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.sdk.platformtools.bg;

@Deprecated
public final class p
  extends e.b
{
  private awp gPC;
  
  public p(String paramString1, String paramString2)
  {
    super(16);
    GMTrace.i(299976622080L, 2235);
    this.gPC = new awp();
    this.gPC.ufy = new azq().Rq(bg.nl(paramString1));
    this.gPC.tPF = new azq().Rq(bg.nl(paramString2));
    this.mVj = this.gPC;
    GMTrace.o(299976622080L, 2235);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\av\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */