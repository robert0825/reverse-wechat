package com.tencent.mm.plugin.appbrand.config;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.a;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.protocal.c.buy;
import com.tencent.mm.protocal.c.fw;
import com.tencent.mm.protocal.c.fx;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class j
  extends a<fx>
{
  j(List<String> paramList)
  {
    GMTrace.i(15531943919616L, 115722);
    fw localfw = new fw();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if (!bg.nm(str))
      {
        buy localbuy = new buy();
        localbuy.vdq = str;
        localbuy.tVL = r.pB(str);
        localfw.tUf.add(localbuy);
      }
    }
    paramList = new b.a();
    paramList.gtF = localfw;
    paramList.gtG = new fx();
    paramList.gtE = 1192;
    paramList.uri = "/cgi-bin/mmbiz-bin/wxaattr/batchwxaattrsync";
    this.fUa = paramList.DA();
    GMTrace.o(15531943919616L, 115722);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\config\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */