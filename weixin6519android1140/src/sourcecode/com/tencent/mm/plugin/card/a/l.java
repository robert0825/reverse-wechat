package com.tencent.mm.plugin.card.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.card.model.u;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public final class l
  implements e
{
  public float fJn;
  public float fJo;
  private long hMN;
  
  public l()
  {
    GMTrace.i(5129398910976L, 38217);
    this.fJn = -85.0F;
    this.fJo = -1000.0F;
    this.hMN = 0L;
    GMTrace.o(5129398910976L, 38217);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5129801564160L, 38220);
    w.i("MicroMsg.CardReportLBSManager", "rplbs onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    at.wS().b(1253, this);
    GMTrace.o(5129801564160L, 38220);
  }
  
  public final void m(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(5129667346432L, 38219);
    if (System.currentTimeMillis() / 1000L - this.hMN > 1800L)
    {
      this.fJn = -85.0F;
      this.fJo = -1000.0F;
      w.i("MicroMsg.CardReportLBSManager", "checkDataValid time is out");
    }
    if (this.fJn == -85.0F) {
      w.i("MicroMsg.CardReportLBSManager", "checkDataValid lbsLatitude ==  LocationGeo.INVALID_LAT");
    }
    if (this.fJo == -1000.0F) {
      w.i("MicroMsg.CardReportLBSManager", "checkDataValid lbsLongitude ==  LocationGeo.INVALID_LNG");
    }
    at.wS().a(1253, this);
    paramString1 = new u(this.fJn, this.fJo, paramString1, paramString2, paramInt);
    at.wS().a(paramString1, 0);
    GMTrace.o(5129667346432L, 38219);
  }
  
  public final void s(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(5129533128704L, 38218);
    this.fJn = paramFloat1;
    this.fJo = paramFloat2;
    this.hMN = (System.currentTimeMillis() / 1000L);
    GMTrace.o(5129533128704L, 38218);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */