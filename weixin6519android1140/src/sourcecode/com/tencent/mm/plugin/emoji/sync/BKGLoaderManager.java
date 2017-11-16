package com.tencent.mm.plugin.emoji.sync;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.os.Looper;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.g.a.cq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.Executor;

public final class BKGLoaderManager
  implements e
{
  public int gGv;
  public Vector<d> kmA;
  public Vector<d> kmB;
  public Set<c> kmC;
  public ConnectivityReceiver kmD;
  public int kmE;
  public long kmF;
  public long kmG;
  public aj kmH;
  public com.tencent.mm.sdk.b.c kmI;
  public com.tencent.mm.sdk.b.c kmJ;
  public int kmn;
  private int kmo;
  public boolean kmp;
  public boolean kmq;
  public boolean kmr;
  public boolean kms;
  public boolean kmt;
  private boolean kmu;
  boolean kmv;
  boolean kmw;
  d kmx;
  private b kmy;
  public Vector<d> kmz;
  
  public BKGLoaderManager(b paramb)
  {
    GMTrace.i(11320460050432L, 84344);
    this.kmn = 0;
    this.kmo = 0;
    this.kmp = false;
    this.kmq = false;
    this.kmr = false;
    this.kms = false;
    this.kmt = false;
    this.kmu = false;
    this.kmv = false;
    this.kmw = false;
    this.kmx = null;
    this.kmz = new Vector();
    this.kmA = new Vector();
    this.kmB = new Vector();
    this.kmC = new HashSet();
    this.kmE = -1;
    this.kmF = 0L;
    this.kmG = 0L;
    this.kmH = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(11324620800000L, 84375);
        long l1;
        long l2;
        if ((BKGLoaderManager.this.kmq) || (BKGLoaderManager.this.kmr) || (BKGLoaderManager.this.kms))
        {
          l1 = TrafficStats.getUidTxBytes(BKGLoaderManager.this.gGv);
          l2 = TrafficStats.getUidRxBytes(BKGLoaderManager.this.gGv);
          long l3 = l1 - BKGLoaderManager.this.kmF + (l2 - BKGLoaderManager.this.kmG);
          w.d("MicroMsg.BKGLoader.BKGLoaderManager", "delta of data: " + l3 / 1024L);
          if (l3 > 20480L) {
            break label133;
          }
          BKGLoaderManager.this.arG();
        }
        for (;;)
        {
          GMTrace.o(11324620800000L, 84375);
          return false;
          label133:
          BKGLoaderManager.this.kmF = l1;
          BKGLoaderManager.this.kmG = l2;
          BKGLoaderManager.this.kmH.z(1000L, 1000L);
        }
      }
    }, false);
    this.kmI = new com.tencent.mm.sdk.b.c() {};
    this.kmJ = new com.tencent.mm.sdk.b.c() {};
    this.kmy = paramb;
    this.gGv = Process.myUid();
    this.kmE = am.getNetType(ab.getContext());
    GMTrace.o(11320460050432L, 84344);
  }
  
  public static boolean aqu()
  {
    GMTrace.i(11321533792256L, 84352);
    if ((am.is3G(ab.getContext())) || (am.is4G(ab.getContext())) || (am.is2G(ab.getContext())))
    {
      GMTrace.o(11321533792256L, 84352);
      return true;
    }
    GMTrace.o(11321533792256L, 84352);
    return false;
  }
  
  public static boolean arJ()
  {
    GMTrace.i(11321399574528L, 84351);
    NetworkInfo localNetworkInfo = ((ConnectivityManager)ab.getContext().getSystemService("connectivity")).getNetworkInfo(1);
    if (localNetworkInfo != null)
    {
      boolean bool = localNetworkInfo.isConnected();
      GMTrace.o(11321399574528L, 84351);
      return bool;
    }
    GMTrace.o(11321399574528L, 84351);
    return false;
  }
  
  public final void ar(List<d> paramList)
  {
    GMTrace.i(11320594268160L, 84345);
    if (this.kmA == null) {
      this.kmA = new Vector();
    }
    if (paramList.size() > 0)
    {
      int j = paramList.size();
      int i = 0;
      if (i < j)
      {
        d locald = (d)paramList.get(i);
        if ((locald != null) && (!this.kmA.contains(locald))) {
          this.kmA.add(locald);
        }
        for (;;)
        {
          i += 1;
          break;
          w.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is has exist:%s", new Object[] { locald.getKey() });
        }
      }
    }
    GMTrace.o(11320594268160L, 84345);
  }
  
  public final void arG()
  {
    for (;;)
    {
      try
      {
        GMTrace.i(11320728485888L, 84346);
        if ((!am.isWifi(ab.getContext())) && (!this.kmp)) {
          break label593;
        }
        if ((this.kmz != null) && (this.kmz.size() > 0))
        {
          this.kmv = f.tz();
          this.kmq = true;
          this.kmr = false;
          this.kmt = false;
          this.kms = false;
          if (!this.kmv)
          {
            this.kmx = ((d)this.kmz.remove(0));
            this.kmx.a(this);
            this.kmy.kml.execute(this.kmx);
            w.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] tryToStart task is ruing. key:%s donwload list size:%d", new Object[] { this.kmx.getKey(), Integer.valueOf(this.kmz.size()) });
            arI();
            if ((this.kmr) || (this.kmq)) {
              break label650;
            }
            if ((this.kmB == null) || (this.kmB.size() <= 0)) {
              break label577;
            }
            this.kms = true;
            this.kmx = ((d)this.kmB.remove(0));
            this.kmx.a(this);
            this.kmy.kml.execute(this.kmx);
            w.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] tryToStart download store emoji task is runing. productID:%s size:%d", new Object[] { this.kmx.getKey(), Integer.valueOf(this.kmB.size()) });
            GMTrace.o(11320728485888L, 84346);
            return;
          }
          w.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] sdcard is full.");
          continue;
        }
        if (this.kmA == null) {
          break label410;
        }
      }
      finally {}
      if (this.kmA.size() > 0)
      {
        this.kmr = true;
        this.kmq = false;
        this.kmu = false;
        this.kms = false;
        this.kmx = ((d)this.kmA.remove(0));
        this.kmx.a(this);
        this.kmy.kml.execute(this.kmx);
        w.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] tryToStart task is ruing. key:%s upload list size:%d", new Object[] { this.kmx.getKey(), Integer.valueOf(this.kmA.size()) });
        arI();
      }
      else
      {
        label410:
        w.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] tryToStart no task list .");
        if ((this.kmz == null) || (this.kmz.size() <= 0))
        {
          if ((this.kmq) && (this.kmw)) {
            this.kmt = true;
          }
          this.kmq = false;
        }
        if ((this.kmA == null) || (this.kmA.size() <= 0))
        {
          if ((this.kmr) && (this.kmw)) {
            this.kmu = true;
          }
          this.kmr = false;
        }
        if (((this.kmz == null) || (this.kmz.size() <= 0)) && ((this.kmA == null) || (this.kmA.size() <= 0)) && ((this.kmq) || (this.kmr)) && (this.kmw))
        {
          this.kmr = false;
          this.kmq = false;
        }
        this.kmp = false;
        arI();
        continue;
        label577:
        this.kms = false;
        GMTrace.o(11320728485888L, 84346);
        continue;
        label593:
        if (aqu())
        {
          w.i("MicroMsg.BKGLoader.BKGLoaderManager", "[dz tryToStart is 3g or 4g]");
          this.kmq = false;
          this.kmr = false;
          this.kmt = false;
          this.kms = false;
          arI();
          GMTrace.o(11320728485888L, 84346);
        }
        else
        {
          w.i("MicroMsg.BKGLoader.BKGLoaderManager", "[dz tryToStart is not wifi, 3g nor 4g]");
          label650:
          GMTrace.o(11320728485888L, 84346);
        }
      }
    }
  }
  
  public final void arH()
  {
    GMTrace.i(11320862703616L, 84347);
    this.kmq = false;
    this.kmr = false;
    this.kmp = false;
    arI();
    if (this.kmx != null) {
      this.kmx.cancel();
    }
    GMTrace.o(11320862703616L, 84347);
  }
  
  public final void arI()
  {
    GMTrace.i(11320996921344L, 84348);
    if ((this.kmC != null) && (this.kmC.size() > 0))
    {
      Iterator localIterator = this.kmC.iterator();
      while (localIterator.hasNext()) {
        ((c)localIterator.next()).arK();
      }
    }
    GMTrace.o(11320996921344L, 84348);
  }
  
  public final void k(String paramString, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(11321265356800L, 84350);
    w.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is finish. key:%s success:%b", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    if ((this.kmx == null) || (bg.nm(paramString)))
    {
      w.e("MicroMsg.BKGLoader.BKGLoaderManager", "CurrentTask or key is null. or key is no equal crrentkey ");
      GMTrace.o(11321265356800L, 84350);
      return;
    }
    if (this.kmz.contains(this.kmx)) {
      this.kmz.remove(this.kmx);
    }
    while (paramBoolean)
    {
      if ((paramInt == 2) || (this.kmC == null) || (this.kmC.size() <= 0)) {
        break label220;
      }
      paramString = this.kmC.iterator();
      while (paramString.hasNext()) {
        ((c)paramString.next()).arL();
      }
      if (this.kmA.contains(this.kmx)) {
        this.kmA.remove(this.kmx);
      } else if (this.kmB.contains(this.kmx)) {
        this.kmB.remove(this.kmx);
      }
    }
    w.i("MicroMsg.BKGLoader.BKGLoaderManager", "retry later.");
    label220:
    if (paramInt == 2)
    {
      this.kmH.z(5000L, 5000L);
      GMTrace.o(11321265356800L, 84350);
      return;
    }
    this.kmH.z(1000L, 1000L);
    GMTrace.o(11321265356800L, 84350);
  }
  
  public final void wp(String paramString)
  {
    GMTrace.i(11321131139072L, 84349);
    w.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is ruing. key:%s", new Object[] { paramString });
    GMTrace.o(11321131139072L, 84349);
  }
  
  public final class ConnectivityReceiver
    extends BroadcastReceiver
  {
    public ConnectivityReceiver()
    {
      GMTrace.i(11319654744064L, 84338);
      GMTrace.o(11319654744064L, 84338);
    }
    
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      GMTrace.i(11319788961792L, 84339);
      int i = am.getNetType(paramContext);
      if (BKGLoaderManager.this.kmE == i)
      {
        GMTrace.o(11319788961792L, 84339);
        return;
      }
      w.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] network change type:%d", new Object[] { Integer.valueOf(i) });
      if (BKGLoaderManager.aqu()) {
        BKGLoaderManager.this.arH();
      }
      for (;;)
      {
        BKGLoaderManager.this.kmE = i;
        GMTrace.o(11319788961792L, 84339);
        return;
        if (BKGLoaderManager.arJ()) {
          BKGLoaderManager.this.arG();
        } else if (!am.isConnected(ab.getContext())) {
          BKGLoaderManager.this.arH();
        } else {
          BKGLoaderManager.this.arI();
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\sync\BKGLoaderManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */