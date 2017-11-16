package com.tencent.mm.plugin.sns.model;

import android.os.Build.VERSION;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.kernel.h;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.a.d;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.e;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class b
  implements com.tencent.mm.ad.e, com.tencent.mm.plugin.sns.model.a.b.a
{
  static int pqL;
  private static final int pqM;
  Set<b> fMZ;
  LinkedList<com.tencent.mm.plugin.sns.data.f> fMv;
  com.tencent.mm.sdk.platformtools.ae handler;
  public long pqN;
  private int pqO;
  private int pqP;
  LinkedList<com.tencent.mm.plugin.sns.data.g> pqQ;
  public HashMap<String, Long> pqR;
  public boolean pqS;
  public Set<a> pqT;
  Map<String, Long> pqU;
  Map<String, com.tencent.mm.plugin.sns.data.c> pqV;
  
  static
  {
    GMTrace.i(8130507309056L, 60577);
    pqL = 0;
    if (Build.VERSION.SDK_INT >= 14) {}
    for (int i = 100;; i = 25)
    {
      pqM = i;
      GMTrace.o(8130507309056L, 60577);
      return;
    }
  }
  
  public b()
  {
    GMTrace.i(8128494043136L, 60562);
    this.handler = null;
    this.pqN = 0L;
    this.pqO = 0;
    this.pqP = 2;
    this.pqQ = new LinkedList();
    this.pqR = new HashMap();
    this.pqS = true;
    this.fMZ = new HashSet();
    this.pqT = new HashSet();
    this.fMv = new LinkedList();
    this.pqU = new ConcurrentHashMap();
    this.pqV = new HashMap();
    this.handler = ae.aDa();
    bii();
    GMTrace.o(8128494043136L, 60562);
  }
  
  public static void big()
  {
    GMTrace.i(8128091389952L, 60559);
    GMTrace.o(8128091389952L, 60559);
  }
  
  public static boolean bih()
  {
    GMTrace.i(8128225607680L, 60560);
    GMTrace.o(8128225607680L, 60560);
    return false;
  }
  
  private void bii()
  {
    GMTrace.i(8128628260864L, 60563);
    this.fMv.clear();
    this.pqV.clear();
    this.pqU.clear();
    this.pqQ.clear();
    this.pqR.clear();
    GMTrace.o(8128628260864L, 60563);
  }
  
  public final void E(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(8128359825408L, 60561);
    this.pqP = paramInt;
    for (;;)
    {
      label126:
      int i;
      try
      {
        String str;
        if (com.tencent.mm.sdk.platformtools.am.isWifi(ab.getContext()))
        {
          str = com.tencent.mm.k.g.ut().getValue("SnsImgDownloadConcurrentCountForWifi");
          if ((!bg.nm(str)) || (!com.tencent.mm.sdk.a.b.bPq())) {
            break label451;
          }
          str = "00:00-18:30-1-3;19:30-23:00-1-2;23:00-23:59-1-3;18:30-19:30-3-5;";
          if (bg.nm(str)) {
            continue;
          }
          localObject = new SimpleDateFormat("HH:mm").format(new Date()).split(":");
          paramInt = bg.Sy(localObject[0]);
          paramInt = bg.Sy(localObject[1]) + paramInt * 60 - ((int)i.Gr() - 8) * 60;
          if (paramInt >= 0) {
            break label461;
          }
          paramInt += 1440;
          String[] arrayOfString1 = str.split(";");
          i = 0;
          label137:
          if (i >= arrayOfString1.length) {
            continue;
          }
          if (bg.nm(arrayOfString1[i])) {
            break label454;
          }
          localObject = arrayOfString1[i].split("-");
          if ((localObject == null) || (localObject.length < 4))
          {
            w.e("MicroMsg.DownloadManager", "setMaxThread Err i%d :%s", new Object[] { Integer.valueOf(i), str });
            break label454;
          }
        }
        else
        {
          str = com.tencent.mm.k.g.ut().getValue("SnsImgDownloadConcurrentCountForNotWifi");
          continue;
        }
        String[] arrayOfString2 = localObject[0].split(":");
        int j = bg.Sy(arrayOfString2[0]);
        j = bg.Sy(arrayOfString2[1]) + j * 60;
        arrayOfString2 = localObject[1].split(":");
        int k = bg.Sy(arrayOfString2[0]);
        k = bg.Sy(arrayOfString2[1]) + k * 60;
        w.i("MicroMsg.DownloadManager", "setMaxThread i:%d [%d,%d] now:%d threadcnt:[%s,%s]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(paramInt), localObject[2], localObject[3] });
        if ((paramInt > k) || (paramInt <= j)) {
          break label454;
        }
        if (paramBoolean)
        {
          localObject = localObject[2];
          j = bg.Sy((String)localObject);
          if (j <= 0) {
            break label454;
          }
          this.pqP = j;
        }
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.DownloadManager", "setMaxThread :%s", new Object[] { bg.f(localException) });
        w.i("MicroMsg.DownloadManager", "setMaxThread Res:%d ", new Object[] { Integer.valueOf(this.pqP) });
        GMTrace.o(8128359825408L, 60561);
        return;
      }
      Object localObject = localObject[3];
      continue;
      label451:
      label454:
      label461:
      do
      {
        break label126;
        break;
        i += 1;
        break label137;
      } while (paramInt < 1440);
      paramInt -= 1440;
    }
  }
  
  public final void Hg(String paramString)
  {
    GMTrace.i(8129165131776L, 60567);
    w.d("MicroMsg.DownloadManager", "unLockDownLoad the thread id is %s %s", new Object[] { Long.valueOf(Thread.currentThread().getId()), paramString });
    Object localObject1 = (com.tencent.mm.plugin.sns.data.c)this.pqV.get(paramString);
    com.tencent.mm.plugin.sns.data.e locale;
    g localg;
    Object localObject2;
    int i;
    if (localObject1 != null)
    {
      locale = ((com.tencent.mm.plugin.sns.data.c)localObject1).ppb;
      if (locale != null)
      {
        localg = ae.bja();
        localObject2 = (anu)locale.ePZ.get(0);
        i = 1;
        if (i >= locale.ePZ.size()) {
          break label328;
        }
        localObject1 = (anu)locale.ePZ.get(i);
        if ((paramString == null) || (paramString.indexOf(((anu)localObject1).mmR) < 0)) {
          break label276;
        }
        localObject2 = localObject1;
      }
    }
    label276:
    label328:
    for (;;)
    {
      String str1 = am.dE(ae.getAccSnsPath(), ((anu)localObject2).mmR);
      if (locale.pph == 0) {
        localObject1 = i.f((anu)localObject2);
      }
      for (;;)
      {
        String str2 = i.ar(locale.pph, ((anu)localObject2).mmR);
        if (!localg.prf.ba(str2)) {
          new g.b(localg, i.ar(locale.pph, ((anu)localObject2).mmR), str1 + (String)localObject1, str1, (anu)localObject2, locale.pph).m(new String[] { "" });
        }
        this.pqV.remove(paramString);
        GMTrace.o(8129165131776L, 60567);
        return;
        i += 1;
        break;
        if (locale.pph == 4) {
          localObject1 = i.g((anu)localObject2);
        } else if (locale.pph == 5) {
          localObject1 = i.g((anu)localObject2);
        } else {
          localObject1 = i.e((anu)localObject2);
        }
      }
    }
  }
  
  public final void Hh(final String paramString)
  {
    GMTrace.i(8129567784960L, 60570);
    ae.aDa().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8072793686016L, 60147);
        b localb = b.this;
        String str = paramString;
        w.d("MicroMsg.DownloadManager", "onDownLoadFinish by scene %s", new Object[] { str });
        ae.bjc().Hs(str);
        localb.qG();
        b.this.Hg(paramString);
        GMTrace.o(8072793686016L, 60147);
      }
    });
    GMTrace.o(8129567784960L, 60570);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8129702002688L, 60571);
    w.i("MicroMsg.DownloadManager", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " type = " + paramk.getType() + " @" + hashCode());
    if (paramk.getType() != 208)
    {
      GMTrace.o(8129702002688L, 60571);
      return;
    }
    paramString = (o)paramk;
    b localb;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      if (paramString.psj == 2)
      {
        paramk = this.fMZ.iterator();
        while (paramk.hasNext())
        {
          localb = (b)paramk.next();
          if (localb != null) {
            localb.av(paramString.mediaId, false);
          }
        }
      }
      GMTrace.o(8129702002688L, 60571);
      return;
    }
    if (paramk.getType() == 208)
    {
      paramk = this.fMZ.iterator();
      while (paramk.hasNext())
      {
        localb = (b)paramk.next();
        if (localb != null) {
          if (paramString.psj == 3) {
            localb.bhV();
          } else if ((paramString.psj == 1) || (paramString.psj == 5) || (paramString.psj == 7)) {
            localb.Hd(paramString.mediaId);
          } else if (paramString.psj == 2) {
            localb.av(paramString.mediaId, true);
          }
        }
      }
    }
    GMTrace.o(8129702002688L, 60571);
  }
  
  public final void a(int paramInt1, anu paramanu, int paramInt2, boolean paramBoolean, String paramString, int paramInt3)
  {
    GMTrace.i(8129433567232L, 60569);
    if (!ae.biM())
    {
      h.xz();
      if (h.xw().wL()) {}
    }
    else
    {
      bii();
      GMTrace.o(8129433567232L, 60569);
      return;
    }
    this.pqO += paramInt3;
    if ((this.pqO > 512000) && (this.fMv.size() == 0))
    {
      w.d("MicroMsg.DownloadManager", "netSizeAdd %s", new Object[] { Integer.valueOf(this.pqO) });
      ak.a.gmY.aI(this.pqO, 0);
      this.pqO = 0;
    }
    if ((paramInt1 == 1) || (paramInt1 == 3)) {
      this.pqR.put(paramString, Long.valueOf(System.currentTimeMillis()));
    }
    Object localObject2;
    if ((paramInt1 != 3) && (paramInt1 == 1) && (paramInt2 != 3))
    {
      localObject1 = ae.bja();
      w.d("MicroMsg.LazyerImageLoader2", "updateCache " + paramanu.mmR);
      localObject2 = i.ar(1, paramanu.mmR);
      localObject2 = (com.tencent.mm.memory.n)((g)localObject1).prf.get(localObject2);
      if (i.a((com.tencent.mm.memory.n)localObject2))
      {
        ((com.tencent.mm.memory.n)localObject2).yr();
        w.d("MicroMsg.LazyerImageLoader2", "force update");
        ae.biQ().post(new g.9((g)localObject1, paramanu));
      }
    }
    Object localObject1 = this.fMZ.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (b)((Iterator)localObject1).next();
      if (localObject2 != null) {
        if (paramInt1 != 2)
        {
          if (paramInt2 == 3) {
            ((b)localObject2).bhV();
          } else if ((paramInt2 == 1) || (paramInt2 == 5) || (paramInt2 == 7)) {
            ((b)localObject2).Hd(paramanu.mmR);
          } else if (paramInt2 == 2) {
            ((b)localObject2).av(paramanu.mmR, true);
          } else if ((paramInt2 == 4) || (paramInt2 == 6)) {
            ((b)localObject2).aw(paramanu.mmR, true);
          }
        }
        else if (paramInt2 == 2) {
          ((b)localObject2).av(paramanu.mmR, false);
        } else if ((paramInt2 == 4) || (paramInt2 == 6)) {
          ((b)localObject2).aw(paramanu.mmR, false);
        }
      }
    }
    w.d("MicroMsg.DownloadManager", "onDownLoadFinish by cdn %s", new Object[] { paramString });
    this.pqU.remove(paramString);
    qG();
    Hg(paramString);
    GMTrace.o(8129433567232L, 60569);
  }
  
  public final void a(final b paramb)
  {
    GMTrace.i(8128762478592L, 60564);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8091449950208L, 60286);
        b localb = b.this;
        b.b localb1 = paramb;
        localb.fMZ.add(localb1);
        int i = b.pqL + 1;
        b.pqL = i;
        if (i <= 1)
        {
          h.xz();
          h.xx().fYr.a(208, localb);
        }
        GMTrace.o(8091449950208L, 60286);
      }
    });
    GMTrace.o(8128762478592L, 60564);
  }
  
  public final boolean a(final anu paramanu, final int paramInt, final com.tencent.mm.plugin.sns.data.e parame, final an paraman)
  {
    GMTrace.i(8129030914048L, 60566);
    if (paramanu == null)
    {
      w.e("MicroMsg.DownloadManager", "unknow case media is null " + bg.bQW().toString());
      GMTrace.o(8129030914048L, 60566);
      return false;
    }
    ae.aDa().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8070377766912L, 60129);
        au.HE(paramanu.mmR);
        b localb = b.this;
        Object localObject1 = paramanu;
        int i = paramInt;
        Object localObject2 = parame;
        Object localObject3 = paraman;
        if (!i.GY(ae.zo()))
        {
          w.i("MicroMsg.DownloadManager", "isHasSdcard is false accpath %s sdcard: %s", new Object[] { ae.zo(), com.tencent.mm.compatible.util.e.ghx });
          GMTrace.o(8070377766912L, 60129);
          return;
        }
        if ((((anu)localObject1).mmR.startsWith("Locall_path")) || (((anu)localObject1).mmR.startsWith("pre_temp_sns_pic")))
        {
          w.d("MicroMsg.DownloadManager", "is a local img not need download");
          GMTrace.o(8070377766912L, 60129);
          return;
        }
        String str = i.as(i, ((anu)localObject1).mmR);
        if (!localb.pqV.containsKey(str))
        {
          w.d("MicroMsg.DownloadManager", "add list %s", new Object[] { ((anu)localObject1).mmR });
          localb.pqV.put(str, new com.tencent.mm.plugin.sns.data.c((com.tencent.mm.plugin.sns.data.e)localObject2, i));
          localb.fMv.add(new com.tencent.mm.plugin.sns.data.f((anu)localObject1, i, str, (an)localObject3));
        }
        for (;;)
        {
          w.d("MicroMsg.DownloadManager", "tryStartNetscene size %s Tsize : %s", new Object[] { Integer.valueOf(ae.bjc().biH()), Integer.valueOf(localb.pqU.size()) });
          w.v("MicroMsg.DownloadManager", "lockwaitdownload. %s * %s memeryFiles.size() ", new Object[] { Integer.valueOf(localb.pqV.size()), Integer.valueOf(localb.pqV.size()), Integer.valueOf(localb.pqQ.size()) });
          if (Looper.myLooper() != null) {
            break label414;
          }
          w.w("MicroMsg.DownloadManager", "Looper.myLooper() == null");
          GMTrace.o(8070377766912L, 60129);
          return;
          localObject2 = localb.fMv.iterator();
          if (((Iterator)localObject2).hasNext())
          {
            localObject3 = (com.tencent.mm.plugin.sns.data.f)((Iterator)localObject2).next();
            if ((!((com.tencent.mm.plugin.sns.data.f)localObject3).eUs.mmR.equals(((anu)localObject1).mmR)) || (((com.tencent.mm.plugin.sns.data.f)localObject3).requestType != i)) {
              break;
            }
            if (localb.fMv.remove(localObject3)) {
              localb.fMv.addLast(localObject3);
            }
            w.v("MicroMsg.DownloadManager", "update the donwload list ");
          }
        }
        label414:
        Looper.myQueue().addIdleHandler(new b.c(localb));
        if (bg.aG(localb.pqN) * 1000L > 300000L) {}
        for (i = 1;; i = 0)
        {
          if (i != 0) {
            localb.handler.postDelayed(new b.6(localb), 500L);
          }
          localObject1 = new LinkedList();
          localObject2 = localb.pqU.entrySet().iterator();
          while (((Iterator)localObject2).hasNext()) {
            ((List)localObject1).add(((Map.Entry)((Iterator)localObject2).next()).getKey());
          }
        }
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (String)((Iterator)localObject1).next();
          if ((localb.pqU.containsKey(localObject2)) && (bg.aG(((Long)localb.pqU.get(localObject2)).longValue()) * 1000L > 300000L))
          {
            w.d("MicroMsg.DownloadManager", "too long to download");
            localb.pqU.remove(localObject2);
            localb.pqV.remove(localObject2);
          }
        }
        if (localb.fMv.size() > 0) {
          localb.handler.postDelayed(new b.4(localb), 500L);
        }
        GMTrace.o(8070377766912L, 60129);
      }
    });
    GMTrace.o(8129030914048L, 60566);
    return true;
  }
  
  public final void b(final b paramb)
  {
    GMTrace.i(8128896696320L, 60565);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8150371532800L, 60725);
        b localb = b.this;
        b.b localb1 = paramb;
        localb.fMZ.remove(localb1);
        int i = b.pqL - 1;
        b.pqL = i;
        if (i <= 0)
        {
          h.xz();
          h.xx().fYr.b(208, localb);
        }
        GMTrace.o(8150371532800L, 60725);
      }
    });
    GMTrace.o(8128896696320L, 60565);
  }
  
  public final boolean bij()
  {
    GMTrace.i(16041837068288L, 119521);
    if ((this.pqQ != null) && (this.pqQ.size() > 0))
    {
      com.tencent.mm.plugin.sns.data.g localg = (com.tencent.mm.plugin.sns.data.g)this.pqQ.remove();
      new ar().m(new com.tencent.mm.plugin.sns.data.g[] { localg });
      GMTrace.o(16041837068288L, 119521);
      return true;
    }
    GMTrace.o(16041837068288L, 119521);
    return false;
  }
  
  public final void qG()
  {
    GMTrace.i(8129299349504L, 60568);
    if (!this.pqS)
    {
      GMTrace.o(8129299349504L, 60568);
      return;
    }
    if (ae.biM())
    {
      bii();
      GMTrace.o(8129299349504L, 60568);
      return;
    }
    if (!i.GY(ae.zo()))
    {
      GMTrace.o(8129299349504L, 60568);
      return;
    }
    int i = this.pqP;
    if (r.hjO > 0) {
      i = r.hjO;
    }
    com.tencent.mm.plugin.sns.data.f localf;
    anu localanu;
    int k;
    String str;
    com.tencent.mm.plugin.sns.data.e locale;
    boolean bool;
    Object localObject2;
    Object localObject1;
    if ((this.fMv.size() > 0) && (ae.bjc().biH() + this.pqU.size() <= i))
    {
      w.d("MicroMsg.DownloadManager", "tryStartNetscene size %s Tsize : %s listsize %s max_thread_downloading: %s", new Object[] { Integer.valueOf(ae.bjc().biH()), Integer.valueOf(this.pqU.size()), Integer.valueOf(this.fMv.size()), Integer.valueOf(this.pqP) });
      localf = (com.tencent.mm.plugin.sns.data.f)this.fMv.removeLast();
      localanu = localf.eUs;
      k = localf.requestType;
      str = localf.amf;
      if ((!this.pqV.containsKey(str)) || (this.pqV.get(str) == null))
      {
        this.pqV.remove(str);
        GMTrace.o(8129299349504L, 60568);
        return;
      }
      locale = ((com.tencent.mm.plugin.sns.data.c)this.pqV.get(str)).ppb;
      if ((k == 1) || (k == 5) || (k == 7))
      {
        bool = true;
        localObject2 = localanu.uCO;
        localObject1 = localObject2;
        if (k == 7)
        {
          localObject1 = localObject2;
          if (!bg.nm(localanu.uCY)) {
            localObject1 = localanu.uCY;
          }
        }
        i = localanu.uCP;
        if ((!bg.nm((String)localObject1)) || (localanu.jib != 2)) {
          break label1161;
        }
        localObject1 = localanu.lPM;
        i = localanu.uCN;
      }
    }
    label483:
    label1045:
    label1161:
    for (;;)
    {
      if ((localObject1 == null) || (((String)localObject1).equals(""))) {
        w.d("MicroMsg.DownloadManager", "url  " + (String)localObject1);
      }
      for (int j = 0;; j = 1)
      {
        if (j != 0) {
          break label483;
        }
        this.pqV.remove(str);
        GMTrace.o(8129299349504L, 60568);
        return;
        if (k == 6)
        {
          bool = false;
          localObject1 = localanu.uCV;
          i = localanu.uCN;
          break;
        }
        bool = false;
        localObject1 = localanu.lPM;
        i = localanu.uCN;
        break;
      }
      if (i == 2)
      {
        if (!ae.bjc().isDownloading(str))
        {
          w.d("MicroMsg.DownloadManager", "to downLoad scene " + localanu.mmR + "  " + (String)localObject1);
          h.xz();
          h.xx().fYr.a(new o(localanu, localanu.mmR, (String)localObject1, localanu.jib, bool, k, str), 0);
          ae.bjc().Hr(str);
          GMTrace.o(8129299349504L, 60568);
        }
      }
      else if ((i == 1) || (i == 0))
      {
        if (i == 0) {
          w.e("MicroMsg.DownloadManager", "others http: urlType" + i + " -- url : " + (String)localObject1 + " isThumb :" + bool);
        }
        if (!this.pqU.containsKey(str))
        {
          w.d("MicroMsg.DownloadManager", "to downLoad cdn " + localanu.mmR + "  " + (String)localObject1);
          if ((localanu != null) && (k != 6) && (this.pqR.containsKey(str)))
          {
            long l = ((Long)this.pqR.get(str)).longValue();
            if (System.currentTimeMillis() - l < 300000L)
            {
              this.pqV.remove(str);
              w.w("MicroMsg.DownloadManager", "download error pass " + l + " url " + (String)localObject1 + " id: " + localanu.mmR);
              GMTrace.o(8129299349504L, 60568);
              return;
            }
          }
          this.pqU.put(str, Long.valueOf(bg.Pu()));
          if (k == 2)
          {
            h.xz();
            i = bg.a((Integer)h.xy().xh().get(68391, null), 0);
            h.xz();
            h.xy().xh().set(68391, Integer.valueOf(i + 1));
          }
          localObject2 = new com.tencent.mm.plugin.sns.model.a.a(localanu.mmR);
          ((com.tencent.mm.plugin.sns.model.a.a)localObject2).psm = localanu;
          ((com.tencent.mm.plugin.sns.model.a.a)localObject2).pwU = localf.ppi;
          if (k == 4)
          {
            ((com.tencent.mm.plugin.sns.model.a.a)localObject2).pwS = true;
            ((com.tencent.mm.plugin.sns.model.a.a)localObject2).url = ((String)localObject1);
            i = localanu.jib;
            ((com.tencent.mm.plugin.sns.model.a.a)localObject2).pwR = bool;
            ((com.tencent.mm.plugin.sns.model.a.a)localObject2).pwT = k;
            ((com.tencent.mm.plugin.sns.model.a.a)localObject2).psl = str;
            ((com.tencent.mm.plugin.sns.model.a.a)localObject2).ppb = locale;
            localObject1 = null;
            if ((k != 1) && (k != 5) && (k != 7)) {
              break label1045;
            }
            localObject1 = new com.tencent.mm.plugin.sns.model.a.g(this, (com.tencent.mm.plugin.sns.model.a.a)localObject2);
          }
          for (;;)
          {
            ((com.tencent.mm.plugin.sns.model.a.b)localObject1).m(new String[] { "" });
            GMTrace.o(8129299349504L, 60568);
            return;
            ((com.tencent.mm.plugin.sns.model.a.a)localObject2).pwS = false;
            break;
            if (k == 4)
            {
              w.w("MicroMsg.DownloadManager", "it can not download sight, may be something warn here.");
              localObject1 = new com.tencent.mm.plugin.sns.model.a.f(this, (com.tencent.mm.plugin.sns.model.a.a)localObject2);
            }
            else if ((k == 2) || (k == 3))
            {
              localObject1 = new d(this, (com.tencent.mm.plugin.sns.model.a.a)localObject2);
            }
            else if (k == 6)
            {
              ((com.tencent.mm.plugin.sns.model.a.a)localObject2).url = localanu.uCV;
              ((com.tencent.mm.plugin.sns.model.a.a)localObject2).eDW = localanu.uCX;
              localObject1 = new com.tencent.mm.plugin.sns.model.a.c(this, (com.tencent.mm.plugin.sns.model.a.a)localObject2);
            }
          }
        }
      }
      else
      {
        this.pqV.remove(str);
      }
      GMTrace.o(8129299349504L, 60568);
      return;
    }
  }
  
  public static abstract interface a
  {
    public abstract void dB(String paramString1, String paramString2);
  }
  
  public static abstract interface b
  {
    public abstract void Hd(String paramString);
    
    public abstract void av(String paramString, boolean paramBoolean);
    
    public abstract void aw(String paramString, boolean paramBoolean);
    
    public abstract void bhV();
  }
  
  final class c
    implements MessageQueue.IdleHandler
  {
    c()
    {
      GMTrace.i(8091047297024L, 60283);
      GMTrace.o(8091047297024L, 60283);
    }
    
    public final boolean queueIdle()
    {
      GMTrace.i(8091181514752L, 60284);
      w.d("MicroMsg.DownloadManager", "I run idleHandler ");
      b.this.pqN = bg.Pu();
      boolean bool = b.this.bij();
      GMTrace.o(8091181514752L, 60284);
      return bool;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */