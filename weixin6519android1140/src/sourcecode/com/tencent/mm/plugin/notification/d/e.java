package com.tencent.mm.plugin.notification.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.fp;
import com.tencent.mm.g.a.kp;
import com.tencent.mm.g.a.kq;
import com.tencent.mm.g.a.ni;
import com.tencent.mm.g.a.nj;
import com.tencent.mm.k.f;
import com.tencent.mm.plugin.notification.ui.FailSendMsgNotification;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.aj;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class e
  implements aq
{
  private static e nyO;
  public com.tencent.mm.plugin.notification.c.c nyP;
  public com.tencent.mm.plugin.notification.c.c nyQ;
  private com.tencent.mm.plugin.notification.a.a nyR;
  public boolean nyS;
  private com.tencent.mm.sdk.b.c nyT;
  private com.tencent.mm.sdk.b.c nyU;
  private com.tencent.mm.sdk.b.c nyV;
  private com.tencent.mm.sdk.b.c nyW;
  private com.tencent.mm.sdk.b.c nyX;
  private com.tencent.mm.sdk.b.c nyY;
  
  static
  {
    GMTrace.i(10726680821760L, 79920);
    nyO = null;
    GMTrace.o(10726680821760L, 79920);
  }
  
  private e()
  {
    GMTrace.i(10724935991296L, 79907);
    this.nyP = null;
    this.nyQ = null;
    this.nyR = null;
    this.nyS = false;
    this.nyT = new com.tencent.mm.sdk.b.c() {};
    this.nyU = new com.tencent.mm.sdk.b.c() {};
    this.nyV = new com.tencent.mm.sdk.b.c() {};
    this.nyW = new com.tencent.mm.sdk.b.c() {};
    this.nyX = new com.tencent.mm.sdk.b.c() {};
    this.nyY = new com.tencent.mm.sdk.b.c() {};
    a.init();
    if (this.nyQ == null) {
      this.nyQ = new d();
    }
    if (this.nyP == null) {
      this.nyP = new c();
    }
    GMTrace.o(10724935991296L, 79907);
  }
  
  public static ArrayList<Long> T(au paramau)
  {
    GMTrace.i(10726143950848L, 79916);
    if (paramau == null)
    {
      GMTrace.o(10726143950848L, 79916);
      return null;
    }
    at.AR();
    com.tencent.mm.y.c.yM().a(paramau.field_msgId, paramau);
    Object localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().aOm();
    paramau = new ArrayList();
    localObject = ((ArrayList)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      paramau.add(Long.valueOf(((au)((Iterator)localObject).next()).field_msgId));
    }
    GMTrace.o(10726143950848L, 79916);
    return paramau;
  }
  
  public static e aUS()
  {
    GMTrace.i(10725204426752L, 79909);
    if (nyO == null)
    {
      nyO = new e();
      at.AK().a("plugin.notification", nyO);
    }
    e locale = nyO;
    GMTrace.o(10725204426752L, 79909);
    return locale;
  }
  
  public static boolean aUT()
  {
    GMTrace.i(10726009733120L, 79915);
    boolean bool = aUS().nyS;
    GMTrace.o(10726009733120L, 79915);
    return bool;
  }
  
  public static FailSendMsgNotification sd(int paramInt)
  {
    GMTrace.i(10725070209024L, 79908);
    FailSendMsgNotification localFailSendMsgNotification;
    if ((paramInt == 2) && (aUS().nyQ != null))
    {
      w.d("MicroMsg.SubCoreNotification", "get sns notificaiton");
      localFailSendMsgNotification = aUS().nyQ.aUE();
      GMTrace.o(10725070209024L, 79908);
      return localFailSendMsgNotification;
    }
    if ((paramInt == 1) && (aUS().nyP != null))
    {
      w.d("MicroMsg.SubCoreNotification", "get msg notificaiton");
      localFailSendMsgNotification = aUS().nyP.aUE();
      GMTrace.o(10725070209024L, 79908);
      return localFailSendMsgNotification;
    }
    GMTrace.o(10725070209024L, 79908);
    return null;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(10725607079936L, 79912);
    this.nyP.aUN();
    this.nyP.aUO();
    this.nyQ.aUN();
    this.nyQ.aUO();
    if (this.nyR == null) {
      this.nyR = new com.tencent.mm.plugin.notification.a.a();
    }
    com.tencent.mm.plugin.notification.a.a locala = this.nyR;
    if (!at.AU()) {
      w.e("MicroMsg.NotificationObserver", "account not ready!");
    }
    for (;;)
    {
      com.tencent.mm.sdk.b.a.vgX.b(this.nyT);
      com.tencent.mm.sdk.b.a.vgX.b(this.nyU);
      com.tencent.mm.sdk.b.a.vgX.b(this.nyV);
      com.tencent.mm.sdk.b.a.vgX.b(this.nyW);
      com.tencent.mm.sdk.b.a.vgX.b(this.nyX);
      com.tencent.mm.sdk.b.a.vgX.b(this.nyY);
      f.um();
      at.getNotification().dU(f.up());
      at.getNotification().aF(false);
      w.d("MicroMsg.SubCoreNotification", "onAccountPostReset");
      GMTrace.o(10725607079936L, 79912);
      return;
      w.d("MicroMsg.NotificationObserver", "added");
      try
      {
        at.AR();
        com.tencent.mm.y.c.yP().a(locala);
        locala.nxY = true;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.NotificationObserver", "exception:%s", new Object[] { bg.f(localException) });
      }
    }
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(10725741297664L, 79913);
    GMTrace.o(10725741297664L, 79913);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(10725472862208L, 79911);
    GMTrace.o(10725472862208L, 79911);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(10725875515392L, 79914);
    this.nyP.aUP();
    this.nyP.aUQ();
    this.nyQ.aUP();
    this.nyQ.aUQ();
    com.tencent.mm.plugin.notification.a.a locala;
    if (this.nyR != null)
    {
      locala = this.nyR;
      if (!at.AU()) {}
    }
    try
    {
      at.AR();
      com.tencent.mm.y.c.yP().b(locala);
      com.tencent.mm.sdk.b.a.vgX.c(this.nyT);
      com.tencent.mm.sdk.b.a.vgX.c(this.nyU);
      com.tencent.mm.sdk.b.a.vgX.c(this.nyV);
      com.tencent.mm.sdk.b.a.vgX.c(this.nyW);
      com.tencent.mm.sdk.b.a.vgX.c(this.nyX);
      com.tencent.mm.sdk.b.a.vgX.c(this.nyY);
      at.getNotification().dU(0);
      at.getNotification().aF(true);
      w.d("MicroMsg.SubCoreNotification", "onAccountRelease");
      GMTrace.o(10725875515392L, 79914);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.NotificationObserver", "exception:%s", new Object[] { bg.f(localException) });
      }
    }
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(10725338644480L, 79910);
    GMTrace.o(10725338644480L, 79910);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\notification\d\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */