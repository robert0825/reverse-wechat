package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.a;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.protocal.c.afw;
import com.tencent.mm.protocal.c.afx;

public final class b
  extends a<afx>
{
  final String appId;
  public final com.tencent.mm.ad.b fUa;
  final String hIw;
  final int version;
  
  public b(String paramString1, int paramInt1, String paramString2, int paramInt2)
  {
    this(paramString1, paramInt1, paramString2, paramInt2, 0);
    GMTrace.i(17655268376576L, 131542);
    GMTrace.o(17655268376576L, 131542);
  }
  
  public b(String paramString1, int paramInt1, String paramString2, int paramInt2, int paramInt3)
  {
    GMTrace.i(19993072762880L, 148960);
    this.appId = paramString1;
    this.version = paramInt1;
    this.hIw = paramString2;
    b.a locala = new b.a();
    locala.gtE = 1139;
    locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/getwxacdndownloadurl";
    afw localafw = new afw();
    localafw.tWS = paramInt1;
    localafw.eSd = paramString1;
    localafw.uvw = paramString2;
    localafw.uvx = paramInt2;
    localafw.uvy = paramInt3;
    locala.gtF = localafw;
    locala.gtG = new afx();
    paramString1 = locala.DA();
    this.fUa = paramString1;
    this.fUa = paramString1;
    GMTrace.o(19993072762880L, 148960);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\appcache\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */