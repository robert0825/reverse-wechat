package com.tencent.mm.av;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.b;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.pd;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.LinkedList;

@Deprecated
public final class e
  extends e.b
{
  private pd gPr;
  
  public e(String paramString, long paramLong)
  {
    super(9);
    GMTrace.i(301721452544L, 2248);
    this.gPr = new pd();
    this.gPr.ufy = new azq().Rq(bg.nl(paramString));
    this.gPr.ufF.add(Integer.valueOf((int)paramLong));
    this.gPr.jhc = 1;
    this.mVj = this.gPr;
    GMTrace.o(301721452544L, 2248);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\av\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */