package com.tencent.mm.plugin.wear.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.c;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.plugin.wear.model.e.f;
import com.tencent.mm.plugin.wear.model.e.h;
import com.tencent.mm.plugin.wear.model.e.k;
import com.tencent.mm.plugin.wear.model.e.l;
import com.tencent.mm.plugin.wear.model.e.m;
import com.tencent.mm.plugin.wear.model.e.n;
import com.tencent.mm.plugin.wear.model.e.o;
import com.tencent.mm.plugin.wear.model.e.p;
import com.tencent.mm.plugin.wear.model.e.q;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import java.util.HashMap;

public final class a
  implements aq
{
  public com.tencent.mm.plugin.wear.model.g.a rzA;
  private com.tencent.mm.ad.d rzB;
  q rzr;
  public r rzs;
  public d rzt;
  private e rzu;
  public g rzv;
  public b rzw;
  private WearMessageLogic rzx;
  private i rzy;
  public j rzz;
  
  public a()
  {
    GMTrace.i(9185190215680L, 68435);
    w.i("MicroMsg.Wear.SubCoreWear", "Create SubCore, classLoader=%s", new Object[] { getClass().getClassLoader() });
    GMTrace.o(9185190215680L, 68435);
  }
  
  public static a bBm()
  {
    GMTrace.i(9185458651136L, 68437);
    a locala2 = (a)at.AK().gZ("plugin.wear");
    a locala1 = locala2;
    if (locala2 == null)
    {
      locala1 = new a();
      at.AK().a("plugin.wear", locala1);
    }
    GMTrace.o(9185458651136L, 68437);
    return locala1;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(9185727086592L, 68439);
    com.tencent.mm.pluginsdk.p.aa.tmk = new c();
    w.i("MicroMsg.Wear.SubCoreWear", "onAccountPostReset, updated=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.rzr = new q();
    this.rzs = new r();
    this.rzz = new j();
    this.rzu = new e();
    this.rzv = new g();
    this.rzw = new b();
    this.rzt = new d();
    this.rzx = new WearMessageLogic();
    this.rzy = new i();
    this.rzA = new com.tencent.mm.plugin.wear.model.g.a();
    this.rzB = new com.tencent.mm.plugin.wear.model.g.b();
    d.c.a(Integer.valueOf(63), this.rzB);
    this.rzr.a(this.rzt.rzJ);
    this.rzr.a(this.rzt.rzK);
    this.rzr.a(this.rzt.rzL);
    this.rzr.a(new h());
    this.rzr.a(new com.tencent.mm.plugin.wear.model.e.g());
    this.rzr.a(new com.tencent.mm.plugin.wear.model.e.d());
    this.rzr.a(new com.tencent.mm.plugin.wear.model.e.c());
    this.rzr.a(new com.tencent.mm.plugin.wear.model.e.e());
    this.rzr.a(new f());
    this.rzr.a(new k());
    this.rzr.a(new m());
    this.rzr.a(new o());
    this.rzr.a(new n());
    this.rzr.a(new l());
    this.rzz.a(new com.tencent.mm.plugin.wear.model.f.c()
    {
      public final String getName()
      {
        GMTrace.i(9209483624448L, 68616);
        GMTrace.o(9209483624448L, 68616);
        return "PhoneStartTask";
      }
      
      protected final void send()
      {
        GMTrace.i(9209349406720L, 68615);
        r.a(20001, null, false);
        r.a(20008, null, false);
        GMTrace.o(9209349406720L, 68615);
      }
    });
    j localj = this.rzz;
    Object localObject = new com.tencent.mm.plugin.wear.model.f.c()
    {
      public final String getName()
      {
        GMTrace.i(18826049617920L, 140265);
        GMTrace.o(18826049617920L, 140265);
        return "SyncFileTask";
      }
      
      protected final void send()
      {
        GMTrace.i(18825915400192L, 140264);
        if (a.this.rzt.bBs() != null) {
          a.this.rzt.bBs().bBz();
        }
        r.a(20009, null, false);
        r.a(20017, null, false);
        GMTrace.o(18825915400192L, 140264);
      }
    };
    if (localj.irz != null)
    {
      localObject = localj.irz.obtainMessage(0, localObject);
      localj.irz.sendMessageDelayed((Message)localObject, 5000L);
    }
    GMTrace.o(9185727086592L, 68439);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(9185861304320L, 68440);
    w.i("MicroMsg.Wear.SubCoreWear", "onSdcardMount, mounted=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    GMTrace.o(9185861304320L, 68440);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(9185592868864L, 68438);
    w.i("MicroMsg.Wear.SubCoreWear", "clearPluginData, pluginFlag=%d", new Object[] { Integer.valueOf(paramInt) });
    GMTrace.o(9185592868864L, 68438);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(9185995522048L, 68441);
    d.c.aE(Integer.valueOf(63));
    this.rzB = null;
    w.i("MicroMsg.Wear.SubCoreWear", "onAccountRelease");
    this.rzr.rAL.clear();
    this.rzr = null;
    this.rzs = null;
    Object localObject = this.rzu;
    ((e)localObject).htb.stopTimer();
    ((e)localObject).pQv.dead();
    ((e)localObject).rzP.dead();
    ((e)localObject).rzQ.dead();
    ((e)localObject).rzR.dead();
    ((e)localObject).rzS.dead();
    ((e)localObject).rzT.dead();
    ((e)localObject).rzU.dead();
    ((e)localObject).fKu.dead();
    ((e)localObject).mKc.dead();
    at.AR();
    com.tencent.mm.y.c.yM().a(((e)localObject).kMi);
    this.rzu = null;
    this.rzv = null;
    localObject = this.rzw;
    com.tencent.mm.sdk.b.a.vgX.c(((b)localObject).rzE);
    at.AR();
    com.tencent.mm.y.c.yK().b(((b)localObject).lxD);
    ((b)localObject).rzF.stopTimer();
    this.rzw = null;
    localObject = this.rzt;
    ((d)localObject).rzI.finish();
    ((d)localObject).rzM.reset();
    this.rzt = null;
    localObject = this.rzx;
    ab.getContext().unregisterReceiver((BroadcastReceiver)localObject);
    this.rzx = null;
    localObject = this.rzz;
    if (((j)localObject).handlerThread != null) {
      ((j)localObject).handlerThread.quit();
    }
    this.rzz = null;
    localObject = this.rzy;
    ((i)localObject).fMS = null;
    ((i)localObject).bBu();
    ab.getContext().unregisterReceiver(((i)localObject).rAl);
    this.rzy = null;
    GMTrace.o(9185995522048L, 68441);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(9185324433408L, 68436);
    GMTrace.o(9185324433408L, 68436);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */