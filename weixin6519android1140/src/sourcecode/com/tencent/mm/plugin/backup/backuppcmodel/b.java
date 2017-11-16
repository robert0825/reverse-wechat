package com.tencent.mm.plugin.backup.backuppcmodel;

import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;

public final class b
  extends com.tencent.mm.plugin.backup.a.e
{
  private static b jam;
  private com.tencent.mm.plugin.backup.b.a iXx;
  private c jan;
  private e jao;
  private d jap;
  private a jaq;
  public PowerManager.WakeLock wakeLock;
  
  public b()
  {
    GMTrace.i(14849580990464L, 110638);
    this.wakeLock = null;
    GMTrace.o(14849580990464L, 110638);
  }
  
  public static b afh()
  {
    GMTrace.i(14849715208192L, 110639);
    if (jam == null)
    {
      localb = new b();
      jam = localb;
      a(localb);
    }
    b localb = jam;
    GMTrace.o(14849715208192L, 110639);
    return localb;
  }
  
  public final com.tencent.mm.plugin.backup.b.a aeI()
  {
    GMTrace.i(14850117861376L, 110642);
    if (this.iXx == null) {
      this.iXx = new com.tencent.mm.plugin.backup.b.a();
    }
    com.tencent.mm.plugin.backup.b.a locala = this.iXx;
    GMTrace.o(14850117861376L, 110642);
    return locala;
  }
  
  public final void aec()
  {
    GMTrace.i(14849849425920L, 110640);
    jam = null;
    GMTrace.o(14849849425920L, 110640);
  }
  
  public final void aej()
  {
    GMTrace.i(14850788950016L, 110647);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14846762418176L, 110617);
        try
        {
          if (b.this.wakeLock == null)
          {
            PowerManager localPowerManager = (PowerManager)ab.getContext().getSystemService("power");
            b.this.wakeLock = localPowerManager.newWakeLock(26, "BackupPc Lock");
          }
          if (!b.this.wakeLock.isHeld()) {
            b.this.wakeLock.acquire();
          }
          GMTrace.o(14846762418176L, 110617);
          return;
        }
        catch (Throwable localThrowable)
        {
          GMTrace.o(14846762418176L, 110617);
        }
      }
    });
    GMTrace.o(14850788950016L, 110647);
  }
  
  public final void aek()
  {
    GMTrace.i(14850923167744L, 110648);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14849446772736L, 110637);
        try
        {
          if ((b.this.wakeLock != null) && (b.this.wakeLock.isHeld())) {
            b.this.wakeLock.release();
          }
          GMTrace.o(14849446772736L, 110637);
          return;
        }
        catch (Throwable localThrowable)
        {
          GMTrace.o(14849446772736L, 110637);
        }
      }
    });
    GMTrace.o(14850923167744L, 110648);
  }
  
  public final c afi()
  {
    GMTrace.i(14850252079104L, 110643);
    if (this.jan == null) {
      this.jan = new c();
    }
    c localc = this.jan;
    GMTrace.o(14850252079104L, 110643);
    return localc;
  }
  
  public final e afj()
  {
    GMTrace.i(14850386296832L, 110644);
    if (this.jao == null) {
      this.jao = new e();
    }
    e locale = this.jao;
    GMTrace.o(14850386296832L, 110644);
    return locale;
  }
  
  public final d afk()
  {
    GMTrace.i(14850520514560L, 110645);
    if (this.jap == null) {
      this.jap = new d();
    }
    d locald = this.jap;
    GMTrace.o(14850520514560L, 110645);
    return locald;
  }
  
  public final a afl()
  {
    GMTrace.i(18462588010496L, 137557);
    if (this.jaq == null) {
      this.jaq = new a();
    }
    a locala = this.jaq;
    GMTrace.o(18462588010496L, 137557);
    return locala;
  }
  
  public final void i(Object... paramVarArgs)
  {
    GMTrace.i(14849983643648L, 110641);
    ((Boolean)paramVarArgs[0]).booleanValue();
    paramVarArgs = afh().afi();
    new ae(Looper.getMainLooper()).postDelayed(new c.5(paramVarArgs), 100L);
    GMTrace.o(14849983643648L, 110641);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\backuppcmodel\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */