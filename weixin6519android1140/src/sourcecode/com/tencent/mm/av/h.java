package com.tencent.mm.av;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.b;
import com.tencent.mm.protocal.c.aip;
import com.tencent.mm.sdk.platformtools.bg;

@Deprecated
public final class h
  extends e.b
{
  private aip gPu;
  
  public h(String paramString, int paramInt)
  {
    super(22);
    GMTrace.i(300110839808L, 2236);
    this.gPu = new aip();
    this.gPu.jhi = bg.nl(paramString);
    this.gPu.uxU = paramInt;
    this.mVj = this.gPu;
    GMTrace.o(300110839808L, 2236);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\av\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */