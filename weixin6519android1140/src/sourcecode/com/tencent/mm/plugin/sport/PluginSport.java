package com.tencent.mm.plugin.sport;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.booter.MMReceivers.ExdeviceProcessReceiver;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.kernel.e.f;
import com.tencent.mm.plugin.sport.c.f;
import com.tencent.mm.plugin.sport.c.f.a;
import com.tencent.mm.plugin.sport.c.g;
import com.tencent.mm.plugin.sport.c.i;
import com.tencent.mm.plugin.sport.c.k;
import com.tencent.mm.plugin.sport.service.SportService;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Calendar;
import java.util.Random;

public class PluginSport
  extends com.tencent.mm.kernel.b.d
  implements com.tencent.mm.kernel.api.bucket.c, a
{
  private g qql;
  private com.tencent.mm.plugin.sport.b.b qqm;
  public com.tencent.mm.plugin.sport.c.a qqn;
  private com.tencent.mm.plugin.sport.c.b qqo;
  private f.a qqp;
  
  public PluginSport()
  {
    GMTrace.i(16727823876096L, 124632);
    this.qqp = new f.a()
    {
      public final void bqN()
      {
        GMTrace.i(17852031565824L, 133008);
        if (PluginSport.this.qqn != null) {
          PluginSport.this.qqn.bqW();
        }
        Object localObject3;
        if ((k.dh(ab.getContext())) && (k.bqR()))
        {
          Context localContext = ab.getContext();
          localObject2 = (AlarmManager)ab.getContext().getSystemService("alarm");
          localObject3 = Calendar.getInstance();
          ((Calendar)localObject3).set(12, 0);
          ((Calendar)localObject3).set(13, 0);
          ((Calendar)localObject3).set(14, 0);
          Random localRandom = new Random();
          ((Calendar)localObject3).set(11, 6);
          long l1 = ((Calendar)localObject3).getTimeInMillis() + localRandom.nextInt(1800000);
          ((Calendar)localObject3).set(11, 12);
          long l2 = ((Calendar)localObject3).getTimeInMillis() + localRandom.nextInt(1800000);
          ((Calendar)localObject3).set(11, 18);
          long l3 = ((Calendar)localObject3).getTimeInMillis() + localRandom.nextInt(1800000);
          ((Calendar)localObject3).set(11, 21);
          long l4 = ((Calendar)localObject3).getTimeInMillis() + localRandom.nextInt(1800000);
          ((Calendar)localObject3).set(11, 24);
          long l5 = ((Calendar)localObject3).getTimeInMillis() + localRandom.nextInt(1800000);
          localObject3 = new Intent(localContext, SportService.class);
          ((Intent)localObject3).setFlags(268435456);
          try
          {
            ((AlarmManager)localObject2).setRepeating(0, l1, 86400000L, PendingIntent.getService(localContext, 20481, (Intent)localObject3, 134217728));
            ((AlarmManager)localObject2).setRepeating(0, l2, 86400000L, PendingIntent.getService(localContext, 20482, (Intent)localObject3, 134217728));
            ((AlarmManager)localObject2).setRepeating(0, l3, 86400000L, PendingIntent.getService(localContext, 20483, (Intent)localObject3, 134217728));
            ((AlarmManager)localObject2).setRepeating(0, l4, 86400000L, PendingIntent.getService(localContext, 20484, (Intent)localObject3, 134217728));
            ((AlarmManager)localObject2).setRepeating(0, l5, 86400000L, PendingIntent.getService(localContext, 20485, (Intent)localObject3, 134217728));
            w.i("MicroMsg.Sport.SportAlarmLogic", "start sport alarm %s %s %s %s %s", new Object[] { k.ax(l1), k.ax(l2), k.ax(l3), k.ax(l4), k.ax(l5) });
            GMTrace.o(17852031565824L, 133008);
            return;
          }
          catch (Exception localException1)
          {
            w.printErrStackTrace("MicroMsg.Sport.SportAlarmLogic", localException1, "startSportAlarm", new Object[0]);
            GMTrace.o(17852031565824L, 133008);
            return;
          }
        }
        Object localObject1 = ab.getContext();
        w.i("MicroMsg.Sport.SportAlarmLogic", "stop sport alarm");
        Object localObject2 = new Intent((Context)localObject1, SportService.class);
        try
        {
          localObject3 = PendingIntent.getService((Context)localObject1, 20481, (Intent)localObject2, 134217728);
          if (localObject3 != null) {
            ((PendingIntent)localObject3).cancel();
          }
          localObject3 = PendingIntent.getService((Context)localObject1, 20482, (Intent)localObject2, 134217728);
          if (localObject3 != null) {
            ((PendingIntent)localObject3).cancel();
          }
          localObject3 = PendingIntent.getService((Context)localObject1, 20483, (Intent)localObject2, 134217728);
          if (localObject3 != null) {
            ((PendingIntent)localObject3).cancel();
          }
          localObject3 = PendingIntent.getService((Context)localObject1, 20484, (Intent)localObject2, 134217728);
          if (localObject3 != null) {
            ((PendingIntent)localObject3).cancel();
          }
          localObject1 = PendingIntent.getService((Context)localObject1, 20485, (Intent)localObject2, 134217728);
          if (localObject1 != null) {
            ((PendingIntent)localObject1).cancel();
          }
          GMTrace.o(17852031565824L, 133008);
          return;
        }
        catch (Exception localException2)
        {
          w.printErrStackTrace("MicroMsg.Sport.SportAlarmLogic", localException2, "stopSportAlarm", new Object[0]);
          GMTrace.o(17852031565824L, 133008);
        }
      }
    };
    GMTrace.o(16727823876096L, 124632);
  }
  
  public void configure(e parame)
  {
    GMTrace.i(16728226529280L, 124635);
    MMReceivers.ExdeviceProcessReceiver.a(new i());
    GMTrace.o(16728226529280L, 124635);
  }
  
  public void dependency()
  {
    GMTrace.i(16728092311552L, 124634);
    dependsOn(com.tencent.mm.plugin.zero.a.d.class);
    GMTrace.o(16728092311552L, 124634);
  }
  
  public void execute(e parame)
  {
    GMTrace.i(16728360747008L, 124636);
    if (this.qql == null) {
      this.qql = com.tencent.mm.plugin.sport.c.h.brc();
    }
    if (parame.eR(""))
    {
      this.qqm = new com.tencent.mm.plugin.sport.b.c();
      com.tencent.mm.kernel.h.a(com.tencent.mm.plugin.sport.b.b.class, new com.tencent.mm.kernel.c.d(this.qqm));
    }
    GMTrace.o(16728360747008L, 124636);
  }
  
  public com.tencent.mm.plugin.sport.c.a getDeviceStepManager()
  {
    GMTrace.i(16728763400192L, 124639);
    com.tencent.mm.plugin.sport.c.a locala = this.qqn;
    GMTrace.o(16728763400192L, 124639);
    return locala;
  }
  
  public com.tencent.mm.plugin.sport.c.b getExtApiStepManager()
  {
    GMTrace.i(16728897617920L, 124640);
    com.tencent.mm.plugin.sport.c.b localb = this.qqo;
    GMTrace.o(16728897617920L, 124640);
    return localb;
  }
  
  public g getSportFileStorage()
  {
    GMTrace.i(16728629182464L, 124638);
    if (this.qql == null) {
      this.qql = com.tencent.mm.plugin.sport.c.h.brc();
    }
    g localg = this.qql;
    GMTrace.o(16728629182464L, 124638);
    return localg;
  }
  
  public void installed()
  {
    GMTrace.i(16727958093824L, 124633);
    alias(a.class);
    GMTrace.o(16727958093824L, 124633);
  }
  
  public void onAccountInitialized(e.f paramf)
  {
    GMTrace.i(16728494964736L, 124637);
    this.qqn = new com.tencent.mm.plugin.sport.c.a();
    this.qqo = new com.tencent.mm.plugin.sport.c.b();
    f.a(this.qqp);
    this.qqp.bqN();
    GMTrace.o(16728494964736L, 124637);
  }
  
  public void onAccountRelease()
  {
    GMTrace.i(16729031835648L, 124641);
    f.a(null);
    Object localObject;
    if (this.qqn != null)
    {
      localObject = this.qqn;
      ((com.tencent.mm.plugin.sport.c.a)localObject).qqt.dead();
      if (((com.tencent.mm.plugin.sport.c.a)localObject).qqu != null) {
        com.tencent.mm.kernel.h.wS().c(((com.tencent.mm.plugin.sport.c.a)localObject).qqu);
      }
      this.qqn = null;
    }
    if (this.qqo != null)
    {
      localObject = this.qqo;
      ((com.tencent.mm.plugin.sport.c.b)localObject).qqA.dead();
      ((com.tencent.mm.plugin.sport.c.b)localObject).qqt.dead();
      if (((com.tencent.mm.plugin.sport.c.b)localObject).qqu != null) {
        com.tencent.mm.kernel.h.wS().c(((com.tencent.mm.plugin.sport.c.b)localObject).qqu);
      }
      this.qqo = null;
    }
    GMTrace.o(16729031835648L, 124641);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sport\PluginSport.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */