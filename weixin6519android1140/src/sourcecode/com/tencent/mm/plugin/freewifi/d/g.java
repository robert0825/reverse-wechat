package com.tencent.mm.plugin.freewifi.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.protocal.c.aaz;
import com.tencent.mm.protocal.c.aba;

public final class g
  extends c
{
  public g(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(7255810375680L, 54060);
    aBl();
    aaz localaaz = (aaz)this.fUa.gtC.gtK;
    localaaz.lqh = paramString1;
    localaaz.lqi = paramString2;
    localaaz.lqj = paramString3;
    localaaz.tNr = m.aAJ();
    GMTrace.o(7255810375680L, 54060);
  }
  
  protected final void aBl()
  {
    GMTrace.i(7255541940224L, 54058);
    b.a locala = new b.a();
    locala.gtF = new aaz();
    locala.gtG = new aba();
    locala.uri = "/cgi-bin/mmo2o-bin/getprotocol31schemaurl";
    locala.gtE = 1746;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    GMTrace.o(7255541940224L, 54058);
  }
  
  public final String aBv()
  {
    GMTrace.i(7255944593408L, 54061);
    String str = ((aba)this.fUa.gtD.gtK).urx;
    GMTrace.o(7255944593408L, 54061);
    return str;
  }
  
  public final int getType()
  {
    GMTrace.i(7255676157952L, 54059);
    GMTrace.o(7255676157952L, 54059);
    return 1746;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\d\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */