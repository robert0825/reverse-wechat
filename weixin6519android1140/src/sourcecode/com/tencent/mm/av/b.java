package com.tencent.mm.av;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.b;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.or;
import com.tencent.mm.sdk.platformtools.bg;

@Deprecated
public final class b
  extends e.b
{
  private or gPo;
  
  public b(String paramString)
  {
    super(7);
    GMTrace.i(301318799360L, 2245);
    this.gPo = new or();
    this.gPo.ufy = new azq().Rq(bg.nl(paramString));
    this.mVj = this.gPo;
    GMTrace.o(301318799360L, 2245);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\av\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */