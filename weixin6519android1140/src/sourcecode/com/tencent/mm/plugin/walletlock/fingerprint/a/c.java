package com.tencent.mm.plugin.walletlock.fingerprint.a;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.tencent.d.b.a;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  implements com.tencent.mm.ad.e, d
{
  private String llG;
  public boolean nSm;
  public d.a rxg;
  private d.a rxh;
  private boolean rxi;
  
  public c()
  {
    GMTrace.i(20264595226624L, 150983);
    this.rxg = null;
    this.rxh = null;
    this.llG = null;
    this.rxi = false;
    this.nSm = false;
    GMTrace.o(20264595226624L, 150983);
  }
  
  public static void ef(String paramString1, String paramString2)
  {
    GMTrace.i(20264997879808L, 150986);
    paramString1 = new e(paramString1, paramString2);
    com.tencent.mm.kernel.h.wS().a(paramString1, 0);
    GMTrace.o(20264997879808L, 150986);
  }
  
  private void jf(boolean paramBoolean)
  {
    GMTrace.i(20264863662080L, 150985);
    w.i("MicroMsg.FingerprintLockOpenDelegate", "alvinluo prepareAuthKey isNeedChangeAuthKey: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    com.tencent.d.b.a.b local1 = new com.tencent.d.b.a.b() {};
    if (this.rxi) {}
    for (Object localObject = null;; localObject = new g(this.llG))
    {
      a.a(local1, paramBoolean, 3, (com.tencent.d.b.e.e)localObject, new com.tencent.mm.plugin.soter.b.e());
      GMTrace.o(20264863662080L, 150985);
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(20265400532992L, 150989);
    w.i("MicroMsg.FingerprintLockOpenDelegate", "alvinluo fingerprint wallet lock open delegate errType: %d, errCode: %d, errMsg: %s, cgi type: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(paramk.getType()) });
    if (this.nSm)
    {
      GMTrace.o(20265400532992L, 150989);
      return;
    }
    if ((paramk instanceof e))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (e)paramk;
        paramk = paramString.llD;
        com.tencent.mm.plugin.walletlock.b.g.rza.rzb = paramk;
        jf(paramString.rxl);
        GMTrace.o(20265400532992L, 150989);
        return;
      }
      if (this.rxg != null)
      {
        this.rxg.R(7, "get challenge failed");
        GMTrace.o(20265400532992L, 150989);
      }
    }
    else if ((paramk instanceof f))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        com.tencent.mm.plugin.walletlock.b.h.jk(true);
        if (this.rxh != null)
        {
          this.rxh.R(0, "open touch lock ok");
          GMTrace.o(20265400532992L, 150989);
        }
      }
      else
      {
        com.tencent.mm.plugin.walletlock.b.h.jk(false);
        if (this.rxh != null) {
          this.rxh.R(6, "open touch lock failed");
        }
      }
    }
    GMTrace.o(20265400532992L, 150989);
  }
  
  public final void a(final d.a parama, Bundle paramBundle)
  {
    GMTrace.i(20264729444352L, 150984);
    this.llG = paramBundle.getString("key_pay_passwd");
    this.rxi = paramBundle.getBoolean("key_fp_lock_offline_mode");
    w.i("MicroMsg.FingerprintLockOpenDelegate", "alvinluo prepare pwd: %s, isOfflineMode: %b", new Object[] { this.llG, Boolean.valueOf(this.rxi) });
    this.rxg = parama;
    this.nSm = false;
    com.tencent.mm.plugin.walletlock.b.g.rza.rzb = null;
    com.tencent.mm.plugin.walletlock.b.g.rza.rzc = null;
    com.tencent.mm.kernel.h.wS().a(1967, this);
    com.tencent.mm.kernel.h.wS().a(1548, this);
    if (this.rxi)
    {
      long l = System.currentTimeMillis();
      com.tencent.mm.plugin.walletlock.b.g.rza.rzb = String.valueOf(l);
      jf(false);
      GMTrace.o(20264729444352L, 150984);
      return;
    }
    parama = ab.bPV();
    if (parama == null)
    {
      if (this.rxg != null) {
        this.rxg.R(2, "system error");
      }
      GMTrace.o(20264729444352L, 150984);
      return;
    }
    paramBundle = parama.getString("cpu_id", null);
    String str = parama.getString("uid", null);
    w.i("MicroMsg.FingerprintLockOpenDelegate", "alvinluo cpuId: %s, uid: %s", new Object[] { paramBundle, str });
    if ((bg.nm(paramBundle)) || (bg.nm(str)))
    {
      com.tencent.mm.plugin.soter.d.b.a(true, true, new com.tencent.mm.plugin.soter.c.e()
      {
        public final void vN(int paramAnonymousInt)
        {
          GMTrace.i(20265668968448L, 150991);
          if (c.this.nSm)
          {
            GMTrace.o(20265668968448L, 150991);
            return;
          }
          if (paramAnonymousInt == 0)
          {
            c.ef(parama.getString("cpu_id", null), parama.getString("uid", null));
            GMTrace.o(20265668968448L, 150991);
            return;
          }
          if (c.this.rxg != null) {
            c.this.rxg.R(2, "init soter failed");
          }
          GMTrace.o(20265668968448L, 150991);
        }
      });
      GMTrace.o(20264729444352L, 150984);
      return;
    }
    ef(paramBundle, str);
    GMTrace.o(20264729444352L, 150984);
  }
  
  public final void a(d.a parama, String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(20265132097536L, 150987);
    w.i("MicroMsg.FingerprintLockOpenDelegate", "alvinluo do open fingerprint lock");
    this.rxh = parama;
    com.tencent.mm.kernel.h.wS().a(new f(paramString2, paramString3, paramString1), 0);
    GMTrace.o(20265132097536L, 150987);
  }
  
  public final void release()
  {
    GMTrace.i(20265266315264L, 150988);
    w.d("MicroMsg.FingerprintLockOpenDelegate", "alvinluo release open delegate");
    this.rxg = null;
    this.rxh = null;
    this.nSm = true;
    com.tencent.mm.kernel.h.wS().b(1967, this);
    com.tencent.mm.kernel.h.wS().b(1548, this);
    GMTrace.o(20265266315264L, 150988);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\walletlock\fingerprint\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */