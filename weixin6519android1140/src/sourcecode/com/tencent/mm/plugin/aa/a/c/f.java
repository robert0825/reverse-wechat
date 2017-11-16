package com.tencent.mm.plugin.aa.a.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.a.a;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.aa.a.c;
import com.tencent.mm.plugin.aa.a.g;
import com.tencent.mm.plugin.aa.a.i;
import com.tencent.mm.plugin.aa.a.j;
import com.tencent.mm.protocal.c.q;
import com.tencent.mm.protocal.c.s;
import com.tencent.mm.sdk.platformtools.w;

public class f
  extends com.tencent.mm.vending.app.a
{
  c hpQ;
  g hpR;
  j hpS;
  
  public f()
  {
    GMTrace.i(5594597556224L, 41683);
    this.hpQ = new c();
    this.hpR = new g();
    this.hpS = new j();
    GMTrace.o(5594597556224L, 41683);
  }
  
  protected final void onCreate()
  {
    GMTrace.i(5594731773952L, 41684);
    super.onCreate();
    Object localObject = this.hpQ.PH();
    w.i("MicroMsg.AAGetPaylistDetailLogic", "init");
    h.xz();
    h.xx().fYr.a(1695, (e)localObject);
    localObject = this.hpR.PO();
    h.xz();
    h.xx().fYr.a(1629, (e)localObject);
    this.hpS.PQ().init();
    GMTrace.o(5594731773952L, 41684);
  }
  
  protected final void onDestroy()
  {
    GMTrace.i(5594865991680L, 41685);
    super.onDestroy();
    Object localObject = this.hpQ.PH();
    w.i("MicroMsg.AAGetPaylistDetailLogic", "unInit");
    h.xz();
    h.xx().fYr.b(1695, (e)localObject);
    localObject = this.hpR.PO();
    h.xz();
    h.xx().fYr.b(1629, (e)localObject);
    this.hpS.PQ().unInit();
    GMTrace.o(5594865991680L, 41685);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\a\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */