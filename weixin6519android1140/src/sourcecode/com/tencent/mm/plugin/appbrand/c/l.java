package com.tencent.mm.plugin.appbrand.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.a;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.protocal.c.agc;
import com.tencent.mm.protocal.c.agd;

class l
  extends a<agd>
{
  l(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(10017205911552L, 74634);
    b.a locala = new b.a();
    agc localagc = new agc();
    localagc.eMw = paramInt1;
    localagc.condition = paramInt2;
    localagc.uvP = paramInt3;
    localagc.uvQ = paramInt4;
    locala.gtF = localagc;
    locala.gtG = new agd();
    locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/getwxausagerecord";
    locala.gtE = 1148;
    this.fUa = locala.DA();
    GMTrace.o(10017205911552L, 74634);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\c\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */