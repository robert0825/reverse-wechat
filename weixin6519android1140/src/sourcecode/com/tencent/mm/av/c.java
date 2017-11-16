package com.tencent.mm.av;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.b;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.ou;
import com.tencent.mm.sdk.platformtools.bg;

@Deprecated
public final class c
  extends e.b
{
  private ou gPp;
  public String username;
  
  public c(String paramString)
  {
    this(paramString, 0);
    GMTrace.i(300781928448L, 2241);
    this.username = paramString;
    GMTrace.o(300781928448L, 2241);
  }
  
  public c(String paramString, int paramInt)
  {
    super(4);
    GMTrace.i(300916146176L, 2242);
    this.gPp = new ou();
    this.gPp.ufy = new azq().Rq(bg.nl(paramString));
    this.gPp.ufA = paramInt;
    this.mVj = this.gPp;
    GMTrace.o(300916146176L, 2242);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\av\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */