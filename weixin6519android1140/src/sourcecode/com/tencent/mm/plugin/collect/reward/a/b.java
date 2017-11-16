package com.tencent.mm.plugin.collect.reward.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.kg;
import com.tencent.mm.protocal.c.kh;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b
  extends a
{
  private final String TAG;
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public kh jWZ;
  public boolean jXa;
  
  public b(boolean paramBoolean)
  {
    GMTrace.i(19348290797568L, 144156);
    this.TAG = "MicroMsg.NetSceneQrRewardGetCode";
    b.a locala = new b.a();
    locala.gtF = new kg();
    locala.gtG = new kh();
    locala.gtE = 1323;
    locala.uri = "/cgi-bin/mmpay-bin/getrewardqrcode";
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((kg)this.fUa.gtC.gtK).uaW = paramBoolean;
    this.jXa = paramBoolean;
    GMTrace.o(19348290797568L, 144156);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(19348559233024L, 144158);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(19348559233024L, 144158);
    return i;
  }
  
  protected final boolean aoE()
  {
    GMTrace.i(19348693450752L, 144159);
    GMTrace.o(19348693450752L, 144159);
    return false;
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(19348827668480L, 144160);
    w.i("MicroMsg.NetSceneQrRewardGetCode", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.jWZ = ((kh)((com.tencent.mm.ad.b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneQrRewardGetCode", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.jWZ.jWs), this.jWZ.jWt });
    if ((!this.jWW) && (this.jWZ.jWs != 0)) {
      this.jWX = true;
    }
    if ((!this.jWW) && (!this.jWX))
    {
      h.xy().xh().a(w.a.vzz, Integer.valueOf(this.jWZ.ube));
      h.xy().xh().a(w.a.vzA, Integer.valueOf(this.jWZ.uba));
      h.xy().xh().a(w.a.vzC, this.jWZ.desc);
      h.xy().xh().a(w.a.vzB, this.jWZ.jvD);
      h.xy().xh().a(w.a.vzE, Integer.valueOf(this.jWZ.ubd));
      h.xy().xh().a(w.a.vzG, this.jWZ.jzt);
      h.xy().xh().a(w.a.vzH, this.jWZ.ubc);
      h.xy().xh().a(w.a.vzI, this.jWZ.uaY);
      paramq = new ArrayList();
      Iterator localIterator = this.jWZ.ubb.iterator();
      while (localIterator.hasNext()) {
        paramq.add(String.valueOf(((Integer)localIterator.next()).intValue()));
      }
      h.xy().xh().a(w.a.vzF, bg.c(paramq, ","));
      g.ork.a(724L, 2L, 1L, false);
    }
    for (;;)
    {
      if (this.fUd != null) {
        this.fUd.a(paramInt1, paramInt2, paramString, this);
      }
      GMTrace.o(19348827668480L, 144160);
      return;
      if (this.jWW) {
        g.ork.a(724L, 4L, 1L, false);
      } else {
        g.ork.a(724L, 3L, 1L, false);
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(19348425015296L, 144157);
    GMTrace.o(19348425015296L, 144157);
    return 1323;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\reward\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */