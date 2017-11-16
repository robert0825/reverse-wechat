package com.tencent.mm.av;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.b;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.ox;
import com.tencent.mm.sdk.platformtools.bg;

@Deprecated
public final class d
  extends e.b
{
  private ox gPq;
  
  public d(String paramString, long paramLong)
  {
    super(8);
    GMTrace.i(301184581632L, 2244);
    this.gPq = new ox();
    this.gPq.ufy = new azq().Rq(bg.nl(paramString));
    this.gPq.tQd = paramLong;
    this.mVj = this.gPq;
    GMTrace.o(301184581632L, 2244);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\av\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */