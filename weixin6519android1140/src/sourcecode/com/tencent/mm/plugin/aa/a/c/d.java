package com.tencent.mm.plugin.aa.a.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.aa.a.l;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.vending.app.a;

public final class d
  extends a
{
  l hpJ;
  com.tencent.mm.plugin.aa.a.e hpK;
  
  public d()
  {
    GMTrace.i(5590973677568L, 41656);
    this.hpJ = new l();
    this.hpK = new com.tencent.mm.plugin.aa.a.e();
    GMTrace.o(5590973677568L, 41656);
  }
  
  protected final void onCreate()
  {
    GMTrace.i(5591107895296L, 41657);
    super.onCreate();
    w.i("MicroMsg.LaunchAAInteractor", "LaunchAAInteractor, onCreate");
    Object localObject = this.hpJ.PR();
    h.xz();
    h.xx().fYr.a(1624, (com.tencent.mm.ad.e)localObject);
    h.xz();
    h.xx().fYr.a(1655, (com.tencent.mm.ad.e)localObject);
    localObject = this.hpK.PN();
    w.i("MicroMsg.AAOperationData", "init");
    h.xz();
    h.xx().fYr.a(1698, (com.tencent.mm.ad.e)localObject);
    GMTrace.o(5591107895296L, 41657);
  }
  
  protected final void onDestroy()
  {
    GMTrace.i(5591242113024L, 41658);
    super.onDestroy();
    w.i("MicroMsg.LaunchAAInteractor", "LaunchAAInteractor, onDestroy");
    Object localObject = this.hpJ.PR();
    h.xz();
    h.xx().fYr.b(1624, (com.tencent.mm.ad.e)localObject);
    h.xz();
    h.xx().fYr.b(1655, (com.tencent.mm.ad.e)localObject);
    localObject = this.hpK.PN();
    w.i("MicroMsg.AAOperationData", "uninit");
    h.xz();
    h.xx().fYr.b(1698, (com.tencent.mm.ad.e)localObject);
    GMTrace.o(5591242113024L, 41658);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\a\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */