package com.tencent.mm.plugin.appbrand.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.a;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.protocal.c.bla;
import com.tencent.mm.protocal.c.blb;

public final class m
  extends a<blb>
{
  private final bla hNk;
  private final b hNl;
  public volatile u.a hNm;
  private final String hzG;
  
  public m(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, String paramString1, int paramInt5, String paramString2)
  {
    GMTrace.i(19887577628672L, 148174);
    this.hzG = paramString2;
    b.a locala = new b.a();
    bla localbla = new bla();
    int i = paramInt1;
    if (paramInt1 == 0) {
      i = 1000;
    }
    localbla.scene = i;
    if (paramBoolean) {}
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      localbla.uVl = paramInt1;
      localbla.tWR = paramInt2;
      localbla.uVm = paramInt3;
      localbla.uVn = paramInt4;
      localbla.username = paramString1;
      localbla.eMw = paramInt5;
      localbla.uVo = paramString2;
      this.hNk = localbla;
      locala.gtF = localbla;
      locala.gtG = new blb();
      locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/updatewxausagerecord";
      locala.gtE = 1149;
      paramString1 = locala.DA();
      this.hNl = paramString1;
      this.fUa = paramString1;
      GMTrace.o(19887577628672L, 148174);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\c\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */