package com.tencent.mm.plugin.offline;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.offline.a.f;
import com.tencent.mm.plugin.offline.a.l;
import com.tencent.mm.plugin.offline.a.m;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;

public final class i
  implements e
{
  public ae mHandler;
  private m nAa;
  public b nAb;
  public int nAc;
  public aj nAd;
  private boolean nzU;
  private boolean nzV;
  private int nzW;
  private int nzX;
  private String nzY;
  a nzZ;
  
  public i()
  {
    GMTrace.i(6239916392448L, 46491);
    this.nzU = false;
    this.nzV = false;
    this.nzW = 10;
    this.nzX = 0;
    this.nzY = "";
    this.mHandler = new ae();
    this.nAb = new b();
    this.nAc = 14400000;
    this.nAd = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(6253338165248L, 46591);
        if (!com.tencent.mm.kernel.h.xw().wL())
        {
          localaj = i.this.nAd;
          l = i.this.nAc;
          localaj.z(l, l);
          GMTrace.o(6253338165248L, 46591);
          return false;
        }
        i.this.cG(5, 5);
        aj localaj = i.this.nAd;
        i locali = i.this;
        long l = com.tencent.mm.plugin.offline.c.a.aWo();
        if (l <= 0L) {}
        for (l = locali.nAc;; l = 1000L * l)
        {
          localaj.z(l, l);
          GMTrace.o(6253338165248L, 46591);
          return false;
          w.i("MicroMsg.OfflineTokensMgr", "OfflineTokensMgr updateInterval:" + l);
        }
      }
    }, false);
    try
    {
      com.tencent.mm.wallet_core.c.a.clF();
      com.tencent.mm.wallet_core.c.a.init(ab.getContext());
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a(385, this);
      k.aVi();
      Object localObject = k.sf(196649);
      if ((TextUtils.isEmpty((CharSequence)localObject)) || (!com.tencent.mm.plugin.offline.c.a.uE((String)localObject)))
      {
        w.i("MicroMsg.OfflineTokensMgr", "genInitInterval: update_interval is empty or is not number,update token");
        w.i("MicroMsg.OfflineTokensMgr", "autoPusher startTimer interval=" + l1);
        localObject = this.nAd;
        l1 *= 1000L;
        ((aj)localObject).z(l1, l1);
        GMTrace.o(6239916392448L, 46491);
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.OfflineTokensMgr", "NO MPERMISSION for READ_PHONE_STATE:%s.", new Object[] { localException });
        continue;
        String str = com.tencent.mm.plugin.offline.c.a.aWa();
        w.i("MicroMsg.OfflineTokensMgr", "genInitInterval: token is not over update interval,lastUpdate is " + str);
        long l2 = Long.valueOf(localException).longValue();
        if (TextUtils.isEmpty(str))
        {
          w.i("MicroMsg.OfflineTokensMgr", "genInitInterval lastUpdate is empty, update token");
        }
        else
        {
          l1 = Long.valueOf(str).longValue();
          long l3 = System.currentTimeMillis() / 1000L;
          w.i("MicroMsg.OfflineTokensMgr", "genInitInterval token is not over update interval,curTime = " + l3 + ";");
          l1 = l2 - (l3 - l1);
        }
      }
    }
  }
  
  public static int aVh()
  {
    GMTrace.i(6240050610176L, 46492);
    k.aVi();
    String str = k.sf(196617);
    com.tencent.mm.wallet_core.c.a.clF();
    int i = com.tencent.mm.wallet_core.c.a.getTokenCount(str, true);
    w.i("MicroMsg.OfflineTokensMgr", "offline tokens count:" + i);
    GMTrace.o(6240050610176L, 46492);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(6240721698816L, 46497);
    if ((!(paramk instanceof com.tencent.mm.plugin.offline.a.h)) && (!(paramk instanceof f)))
    {
      GMTrace.o(6240721698816L, 46497);
      return;
    }
    paramString = new ArrayList();
    if ((paramk instanceof m))
    {
      IDKey localIDKey = new IDKey();
      localIDKey.SetID(135);
      localIDKey.SetValue(1L);
      localIDKey.SetKey(2);
      paramString.add(localIDKey);
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        localIDKey = new IDKey();
        localIDKey.SetID(135);
        localIDKey.SetValue(1L);
        localIDKey.SetKey(3);
        paramString.add(localIDKey);
      }
      g.ork.b(paramString, true);
    }
    if (((paramk instanceof f)) && (((paramInt1 == 0) && (paramInt2 == 0)) || (paramInt1 != 0)))
    {
      w.i("MicroMsg.OfflineTokensMgr", "onSceneEnd NetSceneOfflineVerifyToken errType %d errCode %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (this.nAa != null)
      {
        this.nAa.aVp();
        this.nAa = null;
        if (this.nzZ != null) {
          this.nzZ.aVc();
        }
      }
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof m))
      {
        this.nzX = 0;
        this.nzU = false;
        this.mHandler.removeCallbacks(this.nAb);
        this.nAa = ((m)paramk);
        paramString = this.nAa.nBa;
        k.aVi();
        paramString = new f(paramString, k.sf(196617));
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(paramString, 0);
        GMTrace.o(6240721698816L, 46497);
        return;
      }
      if ((paramk instanceof l))
      {
        this.nzV = false;
        this.nzY = ((l)paramk).nzY;
        if (this.nzZ != null) {
          this.nzZ.aVc();
        }
        GMTrace.o(6240721698816L, 46497);
        return;
      }
      if ((paramk instanceof f)) {
        GMTrace.o(6240721698816L, 46497);
      }
    }
    else
    {
      if ((paramk instanceof m))
      {
        w.e("MicroMsg.OfflineTokensMgr", "gettoken is failed!");
        this.nzX += 1;
        this.nzU = false;
        if (paramInt2 == 411)
        {
          w.i("MicroMsg.OfflineTokensMgr", "errcode is  411, do clearAllOfflineData");
          com.tencent.mm.plugin.offline.c.a.aWd();
          GMTrace.o(6240721698816L, 46497);
          return;
        }
        if (this.nzX < this.nzW)
        {
          this.mHandler.removeCallbacks(this.nAb);
          paramInt2 = this.nzX - 1;
          paramInt1 = paramInt2;
          if (paramInt2 > 6) {
            paramInt1 = 6;
          }
          paramInt1 = (int)Math.pow(2.0D, paramInt1);
          this.mHandler.postDelayed(this.nAb, paramInt1 * 60 * 1000);
        }
        GMTrace.o(6240721698816L, 46497);
        return;
      }
      if ((paramk instanceof l))
      {
        this.nzV = false;
        GMTrace.o(6240721698816L, 46497);
        return;
      }
      if ((paramk instanceof f)) {
        this.nAa = null;
      }
    }
    GMTrace.o(6240721698816L, 46497);
  }
  
  public final void cG(int paramInt1, int paramInt2)
  {
    GMTrace.i(14312038989824L, 106633);
    if ((am.isNetworkConnected(ab.getContext())) && (com.tencent.mm.plugin.offline.c.a.aVS()))
    {
      w.i("MicroMsg.OfflineTokensMgr", "onNotify return false, token is invalid, do doNetSceneToken");
      cI(paramInt1, paramInt2);
      GMTrace.o(14312038989824L, 106633);
      return;
    }
    GMTrace.o(14312038989824L, 106633);
  }
  
  public final void cH(int paramInt1, final int paramInt2)
  {
    GMTrace.i(14312307425280L, 106635);
    if (aVh() > 2)
    {
      this.mHandler.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6253069729792L, 46589);
          i.this.cI(this.nAf, paramInt2);
          GMTrace.o(6253069729792L, 46589);
        }
      }, 3000L);
      GMTrace.o(14312307425280L, 106635);
      return;
    }
    cI(2, paramInt2);
    GMTrace.o(14312307425280L, 106635);
  }
  
  public final void cI(int paramInt1, int paramInt2)
  {
    int j = 0;
    GMTrace.i(14312441643008L, 106636);
    if (this.nzU)
    {
      GMTrace.o(14312441643008L, 106636);
      return;
    }
    this.nzU = true;
    Object localObject = new m(System.currentTimeMillis() / 1000L, paramInt1, paramInt2);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a((com.tencent.mm.ad.k)localObject, 0);
    boolean bool1 = com.tencent.mm.plugin.offline.c.a.cR(ab.getContext());
    boolean bool2 = am.isNetworkConnected(ab.getContext());
    localObject = g.ork;
    int i;
    if (bool1)
    {
      paramInt2 = 0;
      if (!bool2) {
        break label492;
      }
      i = 1;
      label117:
      if (k.nAn) {
        j = 1;
      }
      ((g)localObject).i(14163, new Object[] { Integer.valueOf(4), Integer.valueOf(paramInt2), Integer.valueOf(i), Integer.valueOf(0), Integer.valueOf(paramInt1), Integer.valueOf(j) });
      localObject = new ArrayList();
      localIDKey = new IDKey();
      localIDKey.SetID(135);
      localIDKey.SetValue(1L);
      if (!bool2) {
        break label497;
      }
      paramInt2 = 36;
      label222:
      localIDKey.SetKey(paramInt2);
      ((ArrayList)localObject).add(localIDKey);
      localIDKey = new IDKey();
      localIDKey.SetID(135);
      localIDKey.SetValue(1L);
      if (!bool1) {
        break label503;
      }
      paramInt2 = 38;
      label267:
      localIDKey.SetKey(paramInt2);
      ((ArrayList)localObject).add(localIDKey);
      localIDKey = new IDKey();
      localIDKey.SetID(135);
      localIDKey.SetValue(1L);
      if (!k.nAn) {
        break label509;
      }
      paramInt2 = 40;
      label313:
      localIDKey.SetKey(paramInt2);
      ((ArrayList)localObject).add(localIDKey);
      if (paramInt1 != 2) {
        break label533;
      }
      localIDKey = new IDKey();
      localIDKey.SetID(135);
      localIDKey.SetValue(1L);
      if (!k.nAn) {
        break label515;
      }
      paramInt1 = 42;
      label364:
      localIDKey.SetKey(paramInt1);
      ((ArrayList)localObject).add(localIDKey);
      localIDKey = new IDKey();
      localIDKey.SetID(135);
      localIDKey.SetValue(1L);
      if (!bool1) {
        break label521;
      }
      paramInt1 = 44;
      label409:
      localIDKey.SetKey(paramInt1);
      ((ArrayList)localObject).add(localIDKey);
      localIDKey = new IDKey();
      localIDKey.SetID(135);
      localIDKey.SetValue(1L);
      if (!bool2) {
        break label527;
      }
      paramInt1 = 46;
      label454:
      localIDKey.SetKey(paramInt1);
      ((ArrayList)localObject).add(localIDKey);
    }
    label492:
    label497:
    label503:
    label509:
    label515:
    label521:
    label527:
    label533:
    label571:
    label616:
    label684:
    label690:
    do
    {
      g.ork.b((ArrayList)localObject, true);
      GMTrace.o(14312441643008L, 106636);
      return;
      paramInt2 = 1;
      break;
      i = 0;
      break label117;
      paramInt2 = 37;
      break label222;
      paramInt2 = 39;
      break label267;
      paramInt2 = 41;
      break label313;
      paramInt1 = 43;
      break label364;
      paramInt1 = 45;
      break label409;
      paramInt1 = 47;
      break label454;
      if (paramInt1 == 6)
      {
        localIDKey = new IDKey();
        localIDKey.SetID(135);
        localIDKey.SetValue(1L);
        if (k.nAn)
        {
          paramInt1 = 48;
          localIDKey.SetKey(paramInt1);
          ((ArrayList)localObject).add(localIDKey);
          localIDKey = new IDKey();
          localIDKey.SetID(135);
          localIDKey.SetValue(1L);
          if (!bool1) {
            break label684;
          }
          paramInt1 = 50;
          localIDKey.SetKey(paramInt1);
          ((ArrayList)localObject).add(localIDKey);
          localIDKey = new IDKey();
          localIDKey.SetID(135);
          localIDKey.SetValue(1L);
          if (!bool2) {
            break label690;
          }
        }
        for (paramInt1 = 52;; paramInt1 = 53)
        {
          localIDKey.SetKey(paramInt1);
          ((ArrayList)localObject).add(localIDKey);
          break;
          paramInt1 = 49;
          break label571;
          paramInt1 = 51;
          break label616;
        }
      }
    } while (paramInt1 != 6);
    IDKey localIDKey = new IDKey();
    localIDKey.SetID(135);
    localIDKey.SetValue(1L);
    if (bool1) {}
    for (paramInt1 = 54;; paramInt1 = 55)
    {
      localIDKey.SetKey(paramInt1);
      ((ArrayList)localObject).add(localIDKey);
      break;
    }
  }
  
  public final boolean gw(boolean paramBoolean)
  {
    GMTrace.i(14312173207552L, 106634);
    if (!com.tencent.mm.plugin.offline.c.a.aVS())
    {
      w.e("MicroMsg.OfflineTokensMgr", "offline is not create!");
      GMTrace.o(14312173207552L, 106634);
      return false;
    }
    if (aVh() < k.nAo)
    {
      w.i("MicroMsg.OfflineTokensMgr", "getTokenCount < %s, do doNetSceneToken", new Object[] { Integer.valueOf(k.nAo) });
      com.tencent.mm.wallet_core.c.a.clF();
      int i = com.tencent.mm.wallet_core.c.a.getLastError();
      if (i != 0)
      {
        w.e("MicroMsg.OfflineTokensMgr", "getTokenCount occurs error, the error is " + i + ", don't  doNetSceneToken");
        GMTrace.o(14312173207552L, 106634);
        return false;
      }
      w.i("MicroMsg.OfflineTokensMgr", "getTokenCount is success! do doNetSceneToken");
      if (paramBoolean) {
        cH(2, 9);
      }
      for (;;)
      {
        GMTrace.o(14312173207552L, 106634);
        return true;
        cH(2, 2);
      }
    }
    if (com.tencent.mm.plugin.offline.c.a.aWp())
    {
      w.i("MicroMsg.OfflineTokensMgr", "WalletOfflineUtil.isTokenOverUpdateInterval() return false, token is over update_interval, do doNetSceneToken");
      if (paramBoolean) {
        cI(5, 9);
      }
      for (;;)
      {
        GMTrace.o(14312173207552L, 106634);
        return true;
        cI(5, 5);
      }
    }
    if (!com.tencent.mm.plugin.offline.c.a.aWm())
    {
      w.i("MicroMsg.OfflineTokensMgr", "WalletOfflineUtil.isSameMD5ForBindSerial() return false, bindserial is change, do doNetSceneToken");
      if (paramBoolean) {
        cI(3, 9);
      }
      for (;;)
      {
        GMTrace.o(14312173207552L, 106634);
        return true;
        cI(3, 3);
      }
    }
    GMTrace.o(14312173207552L, 106634);
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void aVc();
  }
  
  private final class b
    implements Runnable
  {
    public b()
    {
      GMTrace.i(6187839913984L, 46103);
      GMTrace.o(6187839913984L, 46103);
    }
    
    public final void run()
    {
      GMTrace.i(6187974131712L, 46104);
      w.i("MicroMsg.OfflineTokensMgr", "mUpdateTokenRunnable, do doNetSceneToken");
      i.this.cI(6, 6);
      GMTrace.o(6187974131712L, 46104);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\offline\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */