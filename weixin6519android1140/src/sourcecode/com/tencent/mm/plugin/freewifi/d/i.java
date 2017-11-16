package com.tencent.mm.plugin.freewifi.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.protocal.c.acm;
import com.tencent.mm.protocal.c.acn;

public final class i
  extends c
{
  public i(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    GMTrace.i(7248294182912L, 54004);
    aBl();
    acm localacm = (acm)this.fUa.gtC.gtK;
    localacm.eCE = paramString1;
    localacm.lqh = paramString2;
    localacm.lqi = paramString3;
    localacm.lqj = paramString4;
    localacm.eEU = paramString5;
    localacm.tNa = paramString6;
    GMTrace.o(7248294182912L, 54004);
  }
  
  protected final void aBl()
  {
    GMTrace.i(7248025747456L, 54002);
    b.a locala = new b.a();
    locala.gtF = new acm();
    locala.gtG = new acn();
    locala.uri = "/cgi-bin/mmo2o-bin/getportalapinfo";
    locala.gtE = 1709;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    GMTrace.o(7248025747456L, 54002);
  }
  
  public final String aBw()
  {
    GMTrace.i(7248428400640L, 54005);
    String str = ((acn)this.fUa.gtD.gtK).lrp;
    GMTrace.o(7248428400640L, 54005);
    return str;
  }
  
  public final String aBx()
  {
    GMTrace.i(7248562618368L, 54006);
    String str = ((acn)this.fUa.gtD.gtK).lrq;
    GMTrace.o(7248562618368L, 54006);
    return str;
  }
  
  public final int getType()
  {
    GMTrace.i(7248159965184L, 54003);
    GMTrace.o(7248159965184L, 54003);
    return 1709;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\d\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */