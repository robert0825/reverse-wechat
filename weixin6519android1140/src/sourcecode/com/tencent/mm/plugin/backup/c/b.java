package com.tencent.mm.plugin.backup.c;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public final class b
  extends com.tencent.mm.plugin.backup.a.e
{
  private static b iXt;
  private d iXu;
  private c iXv;
  private a iXw;
  private com.tencent.mm.plugin.backup.b.a iXx;
  String iXy;
  public PowerManager.WakeLock wakeLock;
  
  public b()
  {
    GMTrace.i(14823811186688L, 110446);
    this.iXy = "tickit";
    this.wakeLock = null;
    GMTrace.o(14823811186688L, 110446);
  }
  
  public static b aeH()
  {
    GMTrace.i(14823945404416L, 110447);
    if (iXt == null)
    {
      localb = new b();
      iXt = localb;
      a(localb);
    }
    b localb = iXt;
    GMTrace.o(14823945404416L, 110447);
    return localb;
  }
  
  public final com.tencent.mm.plugin.backup.b.a aeI()
  {
    GMTrace.i(14824348057600L, 110450);
    if (this.iXx == null) {
      this.iXx = new com.tencent.mm.plugin.backup.b.a();
    }
    com.tencent.mm.plugin.backup.b.a locala = this.iXx;
    GMTrace.o(14824348057600L, 110450);
    return locala;
  }
  
  public final d aeJ()
  {
    GMTrace.i(14824482275328L, 110451);
    if (this.iXu == null) {
      this.iXu = new d();
    }
    d locald = this.iXu;
    GMTrace.o(14824482275328L, 110451);
    return locald;
  }
  
  public final c aeK()
  {
    GMTrace.i(14824616493056L, 110452);
    if (this.iXv == null) {
      this.iXv = new c();
    }
    c localc = this.iXv;
    GMTrace.o(14824616493056L, 110452);
    return localc;
  }
  
  public final a aeL()
  {
    GMTrace.i(14824750710784L, 110453);
    if (this.iXw == null) {
      this.iXw = new a();
    }
    a locala = this.iXw;
    GMTrace.o(14824750710784L, 110453);
    return locala;
  }
  
  public final void aec()
  {
    GMTrace.i(14824079622144L, 110448);
    iXt = null;
    GMTrace.o(14824079622144L, 110448);
  }
  
  public final void aej()
  {
    GMTrace.i(14824884928512L, 110454);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14823274315776L, 110442);
        try
        {
          if (b.this.wakeLock == null)
          {
            PowerManager localPowerManager = (PowerManager)ab.getContext().getSystemService("power");
            b.this.wakeLock = localPowerManager.newWakeLock(26, "BackupMove Lock");
          }
          if (!b.this.wakeLock.isHeld()) {
            b.this.wakeLock.acquire();
          }
          GMTrace.o(14823274315776L, 110442);
          return;
        }
        catch (Throwable localThrowable)
        {
          GMTrace.o(14823274315776L, 110442);
        }
      }
    });
    GMTrace.o(14824884928512L, 110454);
  }
  
  public final void aek()
  {
    GMTrace.i(14825019146240L, 110455);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14828911460352L, 110484);
        try
        {
          if ((b.this.wakeLock != null) && (b.this.wakeLock.isHeld())) {
            b.this.wakeLock.release();
          }
          GMTrace.o(14828911460352L, 110484);
          return;
        }
        catch (Throwable localThrowable)
        {
          GMTrace.o(14828911460352L, 110484);
        }
      }
    });
    GMTrace.o(14825019146240L, 110455);
  }
  
  public final void i(Object... paramVarArgs)
  {
    GMTrace.i(14824213839872L, 110449);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14823676968960L, 110445);
        Object localObject = b.aeH().aeK();
        String str = this.val$url;
        w.w("MicroMsg.BackupMoveRecoverServer", "~~~~~~~~~~~~  start by url:%s", new Object[] { str });
        at.wS().a(595, ((c)localObject).iYb);
        localObject = new com.tencent.mm.plugin.backup.f.e(str);
        at.wS().a((k)localObject, 0);
        GMTrace.o(14823676968960L, 110445);
      }
    });
    GMTrace.o(14824213839872L, 110449);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */