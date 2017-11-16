package com.tencent.mm.modelcdntran;

import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.BaseEvent;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.iw;
import com.tencent.mm.network.n.a;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public final class c
  implements com.tencent.mm.ad.e, b.b, m.b
{
  public ae gzC;
  com.tencent.mm.sdk.b.c<iw> gzD;
  com.tencent.mm.network.n gzE;
  public Queue<String> gzF;
  public Map<String, i> gzG;
  public Map<String, i> gzH;
  public Map<String, Integer> gzI;
  private String gzJ;
  private long gzK;
  public HashSet<String> gzL;
  
  public c()
  {
    GMTrace.i(593242357760L, 4420);
    this.gzC = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(20994873884672L, 156424);
        if (am.isConnected(ab.getContext()))
        {
          w.i("MicroMsg.CdnTransportService", "cdntra mm on network change to get dns.");
          com.tencent.mm.plugin.report.service.g.ork.a(546L, 5L, 1L, true);
          g.Gh().Gm();
        }
        GMTrace.o(20994873884672L, 156424);
      }
    };
    this.gzD = new com.tencent.mm.sdk.b.c() {};
    this.gzE = new n.a()
    {
      public final void db(int paramAnonymousInt)
      {
        GMTrace.i(20995142320128L, 156426);
        w.d("MicroMsg.CdnTransportService", "cdntra onNetworkChange st:%d ", new Object[] { Integer.valueOf(paramAnonymousInt) });
        BaseEvent.onNetworkChange();
        if ((paramAnonymousInt != 4) && (paramAnonymousInt != 6))
        {
          GMTrace.o(20995142320128L, 156426);
          return;
        }
        if (!com.tencent.mm.kernel.h.xw().wL())
        {
          GMTrace.o(20995142320128L, 156426);
          return;
        }
        c.this.gzC.removeMessages(1);
        g.Gh().Gm();
        GMTrace.o(20995142320128L, 156426);
      }
    };
    this.gzF = new LinkedList();
    this.gzG = new HashMap();
    this.gzH = new HashMap();
    this.gzI = new HashMap();
    this.gzJ = "";
    this.gzK = 0L;
    this.gzL = new HashSet();
    com.tencent.mm.kernel.h.xx().a(this.gzE);
    if (com.tencent.mm.kernel.h.xw().wL()) {
      com.tencent.mm.kernel.h.xy().xh().a(this);
    }
    com.tencent.mm.kernel.h.wS().a(379, this);
    com.tencent.mm.sdk.b.a.vgX.b(this.gzD);
    GMTrace.o(593242357760L, 4420);
  }
  
  public static void Gf()
  {
    GMTrace.i(17505481392128L, 130426);
    com.tencent.mm.kernel.h.xw();
    b.c localc;
    String str1;
    String str2;
    String str3;
    String str4;
    String str5;
    String str6;
    String str7;
    String str8;
    if (com.tencent.mm.kernel.a.wK())
    {
      localc = new b.c(g.Gl());
      str1 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue("EnableCDNUploadImg");
      str2 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue("EnableCDNVerifyConnect");
      str3 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue("EnableCDNVideoRedirectOC");
      str4 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue("EnableStreamUploadVideo");
      str5 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue("C2COverloadDelaySeconds");
      str6 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue("SNSOverloadDelaySeconds");
      str7 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue("EnableSnsStreamDownload");
      str8 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue("EnableSnsImageDownload");
    }
    for (;;)
    {
      try
      {
        if (!bg.nm(str1)) {
          localc.field_UseStreamCDN = Integer.valueOf(str1).intValue();
        }
        if (!bg.nm(str2)) {
          localc.field_EnableCDNVerifyConnect = Integer.valueOf(str2).intValue();
        }
        if (!bg.nm(str3)) {
          localc.field_EnableCDNVideoRedirectOC = Integer.valueOf(str3).intValue();
        }
        if (!bg.nm(str4)) {
          localc.field_EnableStreamUploadVideo = Integer.valueOf(str4).intValue();
        }
        if (!bg.nm(str5)) {
          localc.field_C2COverloadDelaySeconds = Integer.valueOf(str5).intValue();
        }
        if (!bg.nm(str6)) {
          localc.field_SNSOverloadDelaySeconds = Integer.valueOf(str6).intValue();
        }
        if (!bg.nm(str7)) {
          localc.field_EnableSnsStreamDownload = Integer.valueOf(str7).intValue();
        }
        if (!bg.nm(str8)) {
          localc.field_EnableSnsImageDownload = Integer.valueOf(str8).intValue();
        }
        g.Gk();
        if (!fT(256)) {
          continue;
        }
        i = 1;
        localc.field_EnableSafeCDN = i;
        if (localc.field_UseStreamCDN != 0)
        {
          str1 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue("ProgJPEGUploadSizeLimitWifi");
          str2 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue("ProgJPEGUploadSizeLimit3G");
          str3 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue("ProgJPEGDownloadSizeLimit");
          str4 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue("ProgJPEGOnlyRecvPTL");
          str5 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue("EnableJPEGDyncmicETL");
          if (!bg.nm(str1)) {
            localc.field_WifiEtl = Integer.valueOf(str1).intValue();
          }
          if (!bg.nm(str2)) {
            localc.field_noWifiEtl = Integer.valueOf(str2).intValue();
          }
          if (!bg.nm(str3)) {
            localc.field_Ptl = Integer.valueOf(str3).intValue();
          }
          if (!bg.nm(str4))
          {
            if (Integer.valueOf(str4).intValue() == 0) {
              continue;
            }
            bool = true;
            localc.field_onlyrecvPtl = bool;
          }
          if (!bg.nm(str5)) {
            localc.field_UseDynamicETL = Integer.valueOf(str5).intValue();
          }
        }
        w.i("MicroMsg.CdnTransportService", "summersafecdn streamcdn config[SVR]:%s", new Object[] { localc });
        g.Gl();
        b.a(localc);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        boolean bool;
        w.e("MicroMsg.CdnTransportService", localNumberFormatException.toString());
        continue;
        int i = 0;
        continue;
        i = 0;
        continue;
        i = 0;
        continue;
      }
      if (r.hkC)
      {
        w.w("MicroMsg.CdnTransportService", "use cdn debug configure.");
        if (!r.hky) {
          continue;
        }
        i = 1;
        localc.field_UseStreamCDN = i;
        if (localc.field_UseStreamCDN != 0)
        {
          localc.field_onlysendETL = r.hkz;
          localc.field_onlyrecvPtl = r.hkA;
          if (!bg.nm(r.hkv)) {
            localc.field_WifiEtl = Integer.valueOf(r.hkv).intValue();
          }
          if (!bg.nm(r.hkw)) {
            localc.field_noWifiEtl = Integer.valueOf(r.hkw).intValue();
          }
          if (!bg.nm(r.hkx)) {
            localc.field_Ptl = Integer.valueOf(r.hkx).intValue();
          }
        }
        if (!r.hkD) {
          continue;
        }
        i = 1;
        localc.field_EnableCDNVerifyConnect = i;
        if (!r.hkE) {
          continue;
        }
        i = 1;
        localc.field_EnableCDNVideoRedirectOC = i;
        w.i("MicroMsg.CdnTransportService", "streamcdn config[DEBUG]:%s", new Object[] { localc });
        g.Gl();
        b.a(localc);
      }
      GMTrace.o(17505481392128L, 130426);
      return;
      i = 0;
      continue;
      bool = false;
    }
  }
  
  public static boolean fT(int paramInt)
  {
    GMTrace.i(593108140032L, 4419);
    com.tencent.mm.kernel.h.xw();
    if (com.tencent.mm.kernel.a.wK())
    {
      int i = bg.a((Integer)com.tencent.mm.kernel.h.xy().xh().get(144385, null), 0);
      w.d("MicroMsg.CdnTransportService", "summersafecdn cdntra cdnBitSet:%d grayScaleFlag:%d res:%d Test.forceCDNTrans:%b", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), Integer.valueOf(i & paramInt), Boolean.valueOf(r.hkd) });
      if (r.hkd)
      {
        GMTrace.o(593108140032L, 4419);
        return true;
      }
      if ((i & paramInt) > 0)
      {
        GMTrace.o(593108140032L, 4419);
        return true;
      }
      GMTrace.o(593108140032L, 4419);
      return false;
    }
    GMTrace.o(593108140032L, 4419);
    return true;
  }
  
  public final int a(final String paramString, final keep_ProgressInfo paramkeep_ProgressInfo, final keep_SceneResult paramkeep_SceneResult)
  {
    GMTrace.i(594047664128L, 4426);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.CdnTransportService", "cdn callback mediaid is null");
      GMTrace.o(594047664128L, 4426);
      return -1;
    }
    if ((paramkeep_ProgressInfo == null) && (paramkeep_SceneResult == null))
    {
      w.e("MicroMsg.CdnTransportService", "cdn callback info all null");
      GMTrace.o(594047664128L, 4426);
      return -2;
    }
    if (paramkeep_ProgressInfo != null) {
      w.d("MicroMsg.CdnTransportService", "CDN progress. total:%d, cur:%d, canshow:%b", new Object[] { Integer.valueOf(paramkeep_ProgressInfo.field_toltalLength), Integer.valueOf(paramkeep_ProgressInfo.field_finishedLength), Boolean.valueOf(paramkeep_ProgressInfo.field_mtlnotify) });
    }
    this.gzK = bg.Pv();
    this.gzJ = paramString;
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        int i = 0;
        GMTrace.i(20995544973312L, 156429);
        Object localObject = (i)c.this.gzH.get(paramString);
        if (localObject == null)
        {
          w.e("MicroMsg.CdnTransportService", " task in jni get info failed mediaid:%s", new Object[] { paramString });
          GMTrace.o(20995544973312L, 156429);
          return;
        }
        if (paramkeep_ProgressInfo != null)
        {
          paramkeep_ProgressInfo.mediaId = paramString;
          w.i("MicroMsg.CdnTransportService", "MTL: total:%d, cur:%d, mtl:%b", new Object[] { Integer.valueOf(paramkeep_ProgressInfo.field_toltalLength), Integer.valueOf(paramkeep_ProgressInfo.field_finishedLength), Boolean.valueOf(paramkeep_ProgressInfo.field_mtlnotify) });
        }
        if (paramkeep_SceneResult != null) {
          paramkeep_SceneResult.mediaId = paramString;
        }
        if (((i)localObject).gAB != null)
        {
          long l = bg.Pv();
          if ((paramkeep_SceneResult == null) && (paramkeep_ProgressInfo != null) && (!paramkeep_ProgressInfo.field_mtlnotify) && (am.getNetWorkType(ab.getContext()) == -1))
          {
            GMTrace.o(20995544973312L, 156429);
            return;
          }
          ((i)localObject).field_lastProgressCallbackTime = l;
          ((i)localObject).gAB.a(paramString, 0, paramkeep_ProgressInfo, paramkeep_SceneResult, ((i)localObject).field_onlycheckexist);
        }
        localObject = paramkeep_ProgressInfo;
        if ((localObject != null) && (((keep_ProgressInfo)localObject).field_finishedLength != ((keep_ProgressInfo)localObject).field_toltalLength)) {}
        for (;;)
        {
          if (i != 0) {
            c.this.gzI.remove(paramString);
          }
          if (paramkeep_SceneResult != null)
          {
            c.this.gzH.remove(paramString);
            if (paramkeep_SceneResult.field_retCode == -5103011)
            {
              w.i("MicroMsg.CdnTransportService", "summersafecdn ERR_VALIDATE_AUTHKEY");
              com.tencent.mm.plugin.report.service.g.ork.a(546L, 4L, 1L, true);
              g.Gl().keep_OnRequestDoGetCdnDnsInfo(999);
            }
          }
          GMTrace.o(20995544973312L, 156429);
          return;
          i = 1;
        }
      }
      
      public final String toString()
      {
        GMTrace.i(20995679191040L, 156430);
        String str = super.toString() + "|callback";
        GMTrace.o(20995679191040L, 156430);
        return str;
      }
    });
    GMTrace.o(594047664128L, 4426);
    return 0;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(592973922304L, 4418);
    if (paramk.getType() != 379)
    {
      GMTrace.o(592973922304L, 4418);
      return;
    }
    w.d("MicroMsg.CdnTransportService", "cdntra onSceneEnd it will tryStart sceneType:%d [%d,%d]", new Object[] { Integer.valueOf(paramk.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (com.tencent.mm.kernel.h.xw().wL()) {
      com.tencent.mm.kernel.h.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(578612625408L, 4311);
          c.this.br(true);
          GMTrace.o(578612625408L, 4311);
        }
        
        public final String toString()
        {
          GMTrace.i(578746843136L, 4312);
          String str = super.toString() + "|onSceneEnd";
          GMTrace.o(578746843136L, 4312);
          return str;
        }
      });
    }
    GMTrace.o(592973922304L, 4418);
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    GMTrace.i(592839704576L, 4417);
    if (!com.tencent.mm.kernel.h.xw().wL())
    {
      GMTrace.o(592839704576L, 4417);
      return;
    }
    int i = bg.m(paramObject, 0);
    w.d("MicroMsg.CdnTransportService", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    if ((paramm != com.tencent.mm.kernel.h.xy().xh()) || (i <= 0))
    {
      w.e("MicroMsg.CdnTransportService", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
      GMTrace.o(592839704576L, 4417);
      return;
    }
    if (i != 144385)
    {
      GMTrace.o(592839704576L, 4417);
      return;
    }
    g.Gh().Gm();
    GMTrace.o(592839704576L, 4417);
  }
  
  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    GMTrace.i(594181881856L, 4427);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.CdnTransportService", "cdn callback getauthbuf mediaid is null");
      GMTrace.o(594181881856L, 4427);
      return;
    }
    i locali = (i)this.gzH.get(paramString);
    if (locali == null)
    {
      w.e("MicroMsg.CdnTransportService", " getauthbuf task in jni get info failed mediaid:%s", new Object[] { paramString });
      GMTrace.o(594181881856L, 4427);
      return;
    }
    if (locali.gAB != null)
    {
      locali.gAB.a(paramString, paramByteArrayOutputStream);
      GMTrace.o(594181881856L, 4427);
      return;
    }
    w.e("MicroMsg.CdnTransportService", "getCdnAuthInfo fail, null taskcallback.");
    GMTrace.o(594181881856L, 4427);
  }
  
  public final void b(final String paramString, final keep_SceneResult paramkeep_SceneResult)
  {
    GMTrace.i(20994068578304L, 156418);
    if (bg.nm(paramString))
    {
      GMTrace.o(20994068578304L, 156418);
      return;
    }
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20994337013760L, 156420);
        i locali = (i)c.this.gzH.get(paramString);
        if (locali == null)
        {
          w.e("MicroMsg.CdnTransportService", " task in jni get info failed mediaid:%s", new Object[] { paramString });
          GMTrace.o(20994337013760L, 156420);
          return;
        }
        if (locali.gAO != null) {
          locali.gAO.b(paramString, paramkeep_SceneResult);
        }
        GMTrace.o(20994337013760L, 156420);
      }
    });
    GMTrace.o(20994068578304L, 156418);
  }
  
  public final boolean b(final i parami, final int paramInt)
  {
    GMTrace.i(593376575488L, 4421);
    if (parami == null)
    {
      w.e("MicroMsg.CdnTransportService", "addRecvTask task info is null");
      GMTrace.o(593376575488L, 4421);
      return false;
    }
    if (bg.nm(parami.field_mediaId))
    {
      w.e("MicroMsg.CdnTransportService", "addRecvTask mediaId is null");
      GMTrace.o(593376575488L, 4421);
      return false;
    }
    if (parami.field_fileId == null) {
      parami.field_fileId = "";
    }
    if (parami.field_aesKey == null) {
      parami.field_aesKey = "";
    }
    parami.eYr = false;
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(589618479104L, 4393);
        if (paramInt != -1) {
          c.this.gzI.put(parami.field_mediaId, Integer.valueOf(paramInt));
        }
        c.this.gzF.add(parami.field_mediaId);
        c.this.gzG.put(parami.field_mediaId, parami);
        c.this.br(false);
        GMTrace.o(589618479104L, 4393);
      }
      
      public final String toString()
      {
        GMTrace.i(589752696832L, 4394);
        String str = super.toString() + "|addRecvTask";
        GMTrace.o(589752696832L, 4394);
        return str;
      }
    });
    GMTrace.o(593376575488L, 4421);
    return true;
  }
  
  public final void br(boolean paramBoolean)
  {
    GMTrace.i(593913446400L, 4425);
    if ((!paramBoolean) && (g.Gl().Ge()))
    {
      com.tencent.mm.kernel.h.xw();
      if (com.tencent.mm.kernel.a.wK())
      {
        w.w("MicroMsg.CdnTransportService", "summersafecdn cdntra Not init cdn dnsinfo , will retry after set info");
        g.Gh().Gm();
        GMTrace.o(593913446400L, 4425);
        return;
      }
    }
    Gf();
    w.i("MicroMsg.CdnTransportService", "summersafecdn tryStart queue:%d", new Object[] { Integer.valueOf(this.gzF.size()) });
    Object localObject1;
    int i;
    label223:
    int j;
    for (;;)
    {
      if (!this.gzF.isEmpty())
      {
        localObject1 = (String)this.gzF.poll();
        localObject1 = (i)this.gzG.remove(localObject1);
        if (localObject1 == null)
        {
          w.e("MicroMsg.CdnTransportService", "summersafecdn task queue is empty , maybe bug here");
          GMTrace.o(593913446400L, 4425);
          return;
        }
        w.i("MicroMsg.CdnTransportService", "summersafecdn id:%s cdnautostart :%s chatroom:%s", new Object[] { ((i)localObject1).field_mediaId, Boolean.valueOf(((i)localObject1).field_autostart), Integer.valueOf(((i)localObject1).field_chattype) });
        ((i)localObject1).field_startTime = bg.Pv();
        if (((i)localObject1).eYr)
        {
          if (((i)localObject1).field_fullpath == null)
          {
            i = -1;
            if (((i)localObject1).field_thumbpath != null) {
              break label433;
            }
          }
          label433:
          for (j = -1;; j = ((i)localObject1).field_thumbpath.length())
          {
            w.i("MicroMsg.CdnTransportService", "summersafecdn tryStart send file:%d thumb:%d, field_svr_signature[%s], field_aesKey[%s], field_fileType[%d], field_mediaId[%s], onlycheckexist[%b]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), bg.SJ(((i)localObject1).field_svr_signature), bg.SJ(((i)localObject1).field_aesKey), Integer.valueOf(((i)localObject1).field_fileType), ((i)localObject1).field_mediaId, Boolean.valueOf(((i)localObject1).field_onlycheckexist) });
            if (((i)localObject1).field_fullpath == null) {
              ((i)localObject1).field_fullpath = "";
            }
            if (((i)localObject1).field_thumbpath == null) {
              ((i)localObject1).field_thumbpath = "";
            }
            g.Gl();
            i = b.b((i)localObject1);
            if (i == 0) {
              break label445;
            }
            w.e("MicroMsg.CdnTransportService", "summersafecdn startupUploadMedia error:%d clientid:%s", new Object[] { Integer.valueOf(i), ((i)localObject1).field_mediaId });
            if (((i)localObject1).gAB == null) {
              break;
            }
            ((i)localObject1).gAB.a(((i)localObject1).field_mediaId, i, null, null, ((i)localObject1).field_onlycheckexist);
            break;
            i = ((i)localObject1).field_fullpath.length();
            break label223;
          }
          label445:
          w.i("MicroMsg.CdnTransportService", "summersafecdn startupUploadMedia ok, field_mediaId[%s]", new Object[] { ((i)localObject1).field_mediaId });
          this.gzH.put(((i)localObject1).field_mediaId, localObject1);
        }
        else
        {
          i = -1;
          if (((i)localObject1).gAC)
          {
            j = i;
            if (((i)localObject1).field_fullpath != null)
            {
              j = i;
              if (!((i)localObject1).field_fullpath.isEmpty())
              {
                g.Gl();
                j = b.a(((i)localObject1).field_mediaId, ((i)localObject1).gAD, ((i)localObject1).field_fullpath, ((i)localObject1).gAE, ((i)localObject1).gAF, ((i)localObject1).gAG, ((i)localObject1).gAH);
              }
            }
            if (((i)localObject1).field_fullpath == null)
            {
              i = -1;
              label572:
              w.i("MicroMsg.CdnTransportService", "https download tryStart recv file:%d field_mediaId[%s], download_url[%s]", new Object[] { Integer.valueOf(i), ((i)localObject1).field_mediaId, ((i)localObject1).gAD });
              i = j;
            }
          }
        }
      }
    }
    for (;;)
    {
      if (i != 0)
      {
        w.e("MicroMsg.CdnTransportService", "summersafecdn startupDownloadMedia error:%d clientid:%s", new Object[] { Integer.valueOf(i), ((i)localObject1).field_mediaId });
        if (((i)localObject1).gAB == null) {
          break;
        }
        ((i)localObject1).gAB.a(((i)localObject1).field_mediaId, i, null, null, ((i)localObject1).field_onlycheckexist);
        break;
        i = ((i)localObject1).field_fullpath.length();
        break label572;
        if (((i)localObject1).gAI)
        {
          j = i;
          if (((i)localObject1).field_fullpath != null)
          {
            j = i;
            if (!((i)localObject1).field_fullpath.isEmpty())
            {
              g.Gl();
              j = b.a(((i)localObject1).field_mediaId, ((i)localObject1).field_fullpath, ((i)localObject1).gAD, ((i)localObject1).gAJ, ((i)localObject1).gAK, ((i)localObject1).allow_mobile_net_download, ((i)localObject1).gAE, ((i)localObject1).gAF, ((i)localObject1).is_resume_task, ((i)localObject1).gAG);
            }
          }
          if (((i)localObject1).field_fullpath == null) {}
          for (i = -1;; i = ((i)localObject1).field_fullpath.length())
          {
            w.i("MicroMsg.CdnTransportService", "game package download tryStart recv file:%d field_mediaId[%s], download_url[%s] https url[%s]", new Object[] { Integer.valueOf(i), ((i)localObject1).field_mediaId, ((i)localObject1).gAD, ((i)localObject1).gAJ });
            i = j;
            break;
          }
        }
        Object localObject2;
        if (((i)localObject1).gAL)
        {
          if (!(localObject1 instanceof h)) {
            break label1247;
          }
          localObject2 = (h)localObject1;
          g.Gl();
          i = b.a(((h)localObject2).field_mediaId, ((h)localObject2).url, ((h)localObject2).referer, ((h)localObject2).gAz, ((h)localObject2).iplist, ((h)localObject2).iplistSource, ((h)localObject2).isColdSnsData, ((h)localObject2).signalQuality, ((h)localObject2).snsScene, ((h)localObject2).snsCipherKey);
          continue;
        }
        if (((i)localObject1).field_fullpath == null)
        {
          j = -1;
          label943:
          if (((i)localObject1).field_thumbpath != null) {
            break label1088;
          }
        }
        label1088:
        for (int k = -1;; k = ((i)localObject1).field_thumbpath.length())
        {
          w.i("MicroMsg.CdnTransportService", "summersafecdn tryStart recv file:%d thumb:%d, field_svr_signature[%s], field_aesKey[%s], field_fileType[%d], field_mediaId[%s], onlycheckexist[%b]", new Object[] { Integer.valueOf(j), Integer.valueOf(k), ((i)localObject1).field_svr_signature, ((i)localObject1).field_aesKey, Integer.valueOf(((i)localObject1).field_fileType), ((i)localObject1).field_mediaId, Boolean.valueOf(((i)localObject1).field_onlycheckexist) });
          if (((i)localObject1).gAM != 2) {
            break label1180;
          }
          if (!(localObject1 instanceof j)) {
            break label1247;
          }
          localObject2 = (j)localObject1;
          if (!((j)localObject2).Go()) {
            break label1101;
          }
          g.Gl();
          i = b.a((i)localObject1, 2);
          break;
          j = ((i)localObject1).field_fullpath.length();
          break label943;
        }
        label1101:
        if (((j)localObject2).Gn())
        {
          g.Gl();
          i = b.a(((j)localObject2).field_mediaId, ((j)localObject2).url, ((j)localObject2).referer, ((j)localObject2).field_fullpath, ((j)localObject2).gAS, ((j)localObject2).iplist, ((j)localObject2).initialDownloadOffset, ((j)localObject2).initialDownloadLength, ((j)localObject2).isColdSnsData, ((j)localObject2).signalQuality, ((j)localObject2).snsScene, ((j)localObject2).field_preloadRatio);
        }
        continue;
        label1180:
        g.Gl();
        i = CdnLogic.startC2CDownload(b.a((i)localObject1));
        continue;
      }
      w.i("MicroMsg.CdnTransportService", "summersafecdn startupDownloadMedia ok, field_mediaId[%s]", new Object[] { ((i)localObject1).field_mediaId });
      this.gzH.put(((i)localObject1).field_mediaId, localObject1);
      break;
      GMTrace.o(593913446400L, 4425);
      return;
      label1247:
      i = -1;
    }
  }
  
  public final boolean c(final i parami)
  {
    GMTrace.i(593510793216L, 4422);
    if (bg.nm(parami.field_mediaId))
    {
      w.e("MicroMsg.CdnTransportService", "summersafecdn addSendTask mediaId is null");
      GMTrace.o(593510793216L, 4422);
      return false;
    }
    if (parami.field_fileId == null) {
      parami.field_fileId = "";
    }
    if (parami.field_aesKey == null) {
      parami.field_aesKey = "";
    }
    parami.eYr = true;
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17505884045312L, 130429);
        c.this.gzF.add(parami.field_mediaId);
        c.this.gzG.put(parami.field_mediaId, parami);
        c.this.br(false);
        GMTrace.o(17505884045312L, 130429);
      }
      
      public final String toString()
      {
        GMTrace.i(20993263271936L, 156412);
        String str = super.toString() + "|addSendTask";
        GMTrace.o(20993263271936L, 156412);
        return str;
      }
    });
    GMTrace.o(593510793216L, 4422);
    return true;
  }
  
  public final byte[] h(String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(594316099584L, 4428);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.CdnTransportService", "cdn callback decodePrepareResponse mediaid is null");
      GMTrace.o(594316099584L, 4428);
      return null;
    }
    i locali = (i)this.gzH.get(paramString);
    if (locali == null)
    {
      w.e("MicroMsg.CdnTransportService", " decodePrepareResponse task in jni get info failed mediaid:%s", new Object[] { paramString });
      GMTrace.o(594316099584L, 4428);
      return null;
    }
    if (locali.gAB != null)
    {
      paramString = locali.gAB.h(paramString, paramArrayOfByte);
      GMTrace.o(594316099584L, 4428);
      return paramString;
    }
    w.e("MicroMsg.CdnTransportService", "decodePrepareResponse fail, null taskcallback.");
    GMTrace.o(594316099584L, 4428);
    return null;
  }
  
  public final boolean jy(String paramString)
  {
    GMTrace.i(593645010944L, 4423);
    i locali = (i)this.gzH.remove(paramString);
    if (locali != null)
    {
      g.Gl();
      b.jr(paramString);
      com.tencent.mm.plugin.report.service.g.ork.i(10769, new Object[] { Integer.valueOf(d.gAc), Integer.valueOf(locali.field_fileType), Long.valueOf(bg.Pv() - locali.field_startTime) });
    }
    this.gzG.remove(paramString);
    w.i("MicroMsg.CdnTransportService", "summersafecdn cdntra cancelSendTask mediaid:%s mapremove:%s engine ret:%d", new Object[] { paramString, locali, Integer.valueOf(0) });
    GMTrace.o(593645010944L, 4423);
    return true;
  }
  
  public final boolean jz(String paramString)
  {
    GMTrace.i(593779228672L, 4424);
    i locali = (i)this.gzH.remove(paramString);
    if (locali != null)
    {
      if (!locali.gAC) {
        break label150;
      }
      g.Gl();
      b.jw(paramString);
    }
    for (;;)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(10769, new Object[] { Integer.valueOf(d.gAb), Integer.valueOf(locali.field_fileType), Long.valueOf(bg.Pv() - locali.field_startTime) });
      this.gzG.remove(paramString);
      this.gzI.remove(paramString);
      w.i("MicroMsg.CdnTransportService", "summersafecdn cdntra cancelRecvTask mediaid:%s mapremove:%s engine ret:%d", new Object[] { paramString, locali, Integer.valueOf(0) });
      GMTrace.o(593779228672L, 4424);
      return true;
      label150:
      if (locali.gAI)
      {
        g.Gl();
        b.jx(paramString);
      }
      else
      {
        g.Gl();
        b.js(paramString);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelcdntran\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */