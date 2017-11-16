package com.tencent.mm.modelvideo;

import android.os.HandlerThread;
import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelcdntran.b;
import com.tencent.mm.modelcdntran.d;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.bc;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class m
{
  public static int ezb;
  public boolean eyY;
  public int eyZ;
  public g.a ezd;
  public aj eze;
  public LinkedList<Long> hbA;
  public Map<Long, g.a> hbB;
  public Map<Long, String> hbC;
  public Object hbD;
  public String hbE;
  public boolean running;
  
  static
  {
    GMTrace.i(319840845824L, 2383);
    ezb = 0;
    GMTrace.o(319840845824L, 2383);
  }
  
  public m()
  {
    GMTrace.i(316485402624L, 2358);
    this.hbA = new LinkedList();
    this.hbB = new HashMap();
    this.hbC = new HashMap();
    this.hbD = new Object();
    this.eyY = false;
    this.running = false;
    this.eyZ = 0;
    this.ezd = new g.a();
    this.eze = new aj(com.tencent.mm.kernel.h.xB().ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(331115134976L, 2467);
        m.this.qG();
        GMTrace.o(331115134976L, 2467);
        return false;
      }
      
      public final String toString()
      {
        GMTrace.i(331249352704L, 2468);
        String str = super.toString() + "|scenePusher";
        GMTrace.o(331249352704L, 2468);
        return str;
      }
    }, false);
    GMTrace.o(316485402624L, 2358);
  }
  
  public static void O(List<r> paramList)
  {
    GMTrace.i(316619620352L, 2359);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      GMTrace.o(316619620352L, 2359);
      return;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      t.mp(((r)paramList.next()).getFileName());
    }
    GMTrace.o(316619620352L, 2359);
  }
  
  public static void P(List<r> paramList)
  {
    GMTrace.i(316753838080L, 2360);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      GMTrace.o(316753838080L, 2360);
      return;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      t.mq(((r)paramList.next()).getFileName());
    }
    GMTrace.o(316753838080L, 2360);
  }
  
  private String az(long paramLong)
  {
    GMTrace.i(316888055808L, 2361);
    Object localObject2 = o.Nh().aB(paramLong);
    if (((List)localObject2).isEmpty())
    {
      w.e("MicroMsg.SightMassSendService", "check use cdn fail: mass send video list empty");
      GMTrace.o(316888055808L, 2361);
      return null;
    }
    Object localObject1 = ((List)localObject2).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = (r)((Iterator)localObject1).next();
      if (com.tencent.mm.y.s.gn(((r)localObject3).Nq()))
      {
        w.w("MicroMsg.SightMassSendService", "cdntra not use cdn user:%s, list %s, massSendId %d", new Object[] { ((r)localObject3).Nq(), ((r)localObject3).hcD, Long.valueOf(paramLong) });
        GMTrace.o(316888055808L, 2361);
        return null;
      }
      com.tencent.mm.modelcdntran.g.Gk();
      if ((!com.tencent.mm.modelcdntran.c.fT(2)) && (((r)localObject3).hcA != 1))
      {
        com.tencent.mm.modelcdntran.g.Gk();
        w.w("MicroMsg.SightMassSendService", "cdntra not use cdn flag:%b getCdnInfo:%d, list %s, massSendId %d", new Object[] { Boolean.valueOf(com.tencent.mm.modelcdntran.c.fT(2)), Integer.valueOf(((r)localObject3).hcA), ((r)localObject3).hcD, Long.valueOf(paramLong) });
        GMTrace.o(316888055808L, 2361);
        return null;
      }
    }
    if ((localObject2 == null) || (((List)localObject2).isEmpty())) {
      localObject1 = null;
    }
    while (localObject1 == null)
    {
      w.w("MicroMsg.SightMassSendService", "check use cdn fail: no valid info");
      GMTrace.o(316888055808L, 2361);
      return null;
      int i = 0;
      for (;;)
      {
        if (i >= ((List)localObject2).size()) {
          break label435;
        }
        localObject3 = (r)((List)localObject2).get(i);
        localObject1 = t.mw(((r)localObject3).getFileName());
        if (localObject1 != null)
        {
          w.i("MicroMsg.SightMassSendService", "check %s ok, index %d, size %d, massSendId %d, massSendList %s", new Object[] { ((r)localObject3).getFileName(), Integer.valueOf(i), Integer.valueOf(((List)localObject2).size()), Long.valueOf(paramLong), ((r)localObject3).hcD });
          ((List)localObject2).remove(i);
          ((List)localObject2).add(i, localObject1);
          break;
        }
        w.w("MicroMsg.SightMassSendService", "check %s fail, index %d, size %d, massSendId %d, massSendList %s", new Object[] { ((r)localObject3).getFileName(), Integer.valueOf(i), Integer.valueOf(((List)localObject2).size()), Long.valueOf(paramLong), ((r)localObject3).hcD });
        i += 1;
      }
      label435:
      localObject1 = null;
    }
    Object localObject3 = d.a("upvideo", ((r)localObject1).hcs, ((r)localObject1).hcD, ((r)localObject1).getFileName());
    if (bg.nm((String)localObject3))
    {
      w.w("MicroMsg.SightMassSendService", "cdntra genClientId failed not use cdn file:%s, massSendId %d, massSendList %s", new Object[] { ((r)localObject1).getFileName(), Long.valueOf(((r)localObject1).haN), ((r)localObject1).hcD });
      GMTrace.o(316888055808L, 2361);
      return null;
    }
    Object localObject4 = ((r)localObject1).getFileName();
    o.Nh();
    String str1 = s.ml((String)localObject4);
    o.Nh();
    String str2 = s.mk((String)localObject4);
    a locala = new a();
    locala.gpV = ((List)localObject2);
    locala.haN = paramLong;
    locala.hbH = ((String)localObject3);
    locala.startTime = bg.Pv();
    locala.haO = ((r)localObject1);
    localObject4 = new i();
    ((i)localObject4).gAB = locala;
    ((i)localObject4).field_mediaId = ((String)localObject3);
    ((i)localObject4).field_fullpath = str2;
    ((i)localObject4).field_thumbpath = str1;
    ((i)localObject4).field_fileType = b.MediaType_VIDEO;
    ((i)localObject4).field_smallVideoFlag = 1;
    ((i)localObject4).field_talker = ((r)localObject1).hcD;
    ((i)localObject4).field_priority = b.gzd;
    ((i)localObject4).field_needStorage = false;
    ((i)localObject4).field_isStreamMedia = false;
    localObject1 = bh.q(((r)localObject1).Nt(), "msg");
    if (localObject1 != null)
    {
      ((i)localObject4).field_fileId = ((String)((Map)localObject1).get(".msg.videomsg.$cdnvideourl"));
      ((i)localObject4).field_aesKey = ((String)((Map)localObject1).get(".msg.videomsg.$aeskey"));
    }
    while (!com.tencent.mm.modelcdntran.g.Gk().c((i)localObject4))
    {
      w.e("MicroMsg.SightMassSendService", "cdntra addSendTask failed.");
      GMTrace.o(316888055808L, 2361);
      return null;
      w.i("MicroMsg.SightMassSendService", "cdntra parse video recv xml failed");
    }
    localObject1 = ((List)localObject2).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (r)((Iterator)localObject1).next();
      if (((r)localObject2).hcA != 1)
      {
        ((r)localObject2).hcA = 1;
        ((r)localObject2).eQl = 524288;
        boolean bool = t.e((r)localObject2);
        w.i("MicroMsg.SightMassSendService", "update %s useCDN, result %B", new Object[] { ((r)localObject2).getFileName(), Boolean.valueOf(bool) });
      }
    }
    GMTrace.o(316888055808L, 2361);
    return (String)localObject3;
  }
  
  public final void c(final long paramLong, int paramInt1, final int paramInt2)
  {
    GMTrace.i(317022273536L, 2362);
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(329236086784L, 2453);
        m.ezb += 1;
        m.this.eyY = false;
        m.this.hbE = "";
        long l2 = 0L;
        long l1 = l2;
        if (paramLong > 0L)
        {
          l1 = l2;
          if (m.this.hbB.get(Long.valueOf(paramLong)) != null) {
            l1 = ((g.a)m.this.hbB.get(Long.valueOf(paramLong))).tD();
          }
        }
        w.i("MicroMsg.SightMassSendService", "on ERROR massSendId: %d time: %d errType %d errCode %d", new Object[] { Long.valueOf(paramLong), Long.valueOf(l1), Integer.valueOf(paramInt2), Integer.valueOf(this.val$errCode) });
        if ((paramInt2 != 0) || (this.val$errCode != 0))
        {
          localObject1 = m.this;
          ((m)localObject1).eyZ -= 1;
        }
        w.i("MicroMsg.SightMassSendService", "onSceneEnd  inCnt: %d stop: %d running: %B sending: %B", new Object[] { Integer.valueOf(m.ezb), Integer.valueOf(m.this.eyZ), Boolean.valueOf(m.this.running), Boolean.valueOf(m.this.eyY) });
        if (m.this.eyZ > 0) {
          m.this.qG();
        }
        while (m.this.eyY)
        {
          m.ezb -= 1;
          GMTrace.o(329236086784L, 2453);
          return;
        }
        w.w("MicroMsg.SightMassSendService", "StopFlag ERROR force do stop, fail all job");
        Object localObject1 = o.Nh();
        Object localObject3 = m.this.hbA;
        if ((localObject3 == null) || (((List)localObject3).isEmpty())) {}
        for (;;)
        {
          m.this.qH();
          break;
          l1 = System.currentTimeMillis() / 1000L;
          Object localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append('(');
          int i = 0;
          while (i < ((List)localObject3).size() - 1)
          {
            ((StringBuilder)localObject2).append((Long)((List)localObject3).get(i));
            ((StringBuilder)localObject2).append(',');
            i += 1;
          }
          localObject3 = (Long)((List)localObject3).get(((List)localObject3).size() - 1);
          if (localObject3 != null) {
            ((StringBuilder)localObject2).append(localObject3);
          }
          ((StringBuilder)localObject2).append(')');
          localObject2 = ((StringBuilder)localObject2).toString();
          localObject2 = "UPDATE videoinfo2 SET status=198, lastmodifytime=" + l1 + " WHERE masssendid IN " + (String)localObject2;
          w.i("MicroMsg.VideoInfoStorage", "fail all massSendInfos, sql %s", new Object[] { localObject2 });
          ((s)localObject1).goN.eZ("videoinfo2", (String)localObject2);
        }
      }
      
      public final String toString()
      {
        GMTrace.i(329370304512L, 2454);
        String str = super.toString() + "|onSceneEnd";
        GMTrace.o(329370304512L, 2454);
        return str;
      }
    });
    GMTrace.o(317022273536L, 2362);
  }
  
  public final void qG()
  {
    GMTrace.i(16008416854016L, 119272);
    Object localObject;
    if ((!this.eyY) && (this.hbA.isEmpty()))
    {
      localObject = o.Nh().Ny();
      if (!((List)localObject).isEmpty()) {
        break label89;
      }
      w.d("MicroMsg.SightMassSendService", "unfinish massinfo count 0");
    }
    while ((!this.eyY) && (this.hbA.isEmpty()))
    {
      qH();
      w.d("MicroMsg.SightMassSendService", "No Data Any More , Stop Service");
      GMTrace.o(16008416854016L, 119272);
      return;
      label89:
      long l = System.currentTimeMillis() / 1000L;
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        r localr = (r)((Iterator)localObject).next();
        if (this.hbB.containsKey(Long.valueOf(localr.haN)))
        {
          w.d("MicroMsg.SightMassSendService", "Mass Send File is Already running %s, massSendId %d", new Object[] { localr.getFileName(), Long.valueOf(localr.haN) });
        }
        else
        {
          w.d("MicroMsg.SightMassSendService", "Get file:" + localr.getFileName() + " status:" + localr.status + " user" + localr.Nq() + " human:" + localr.Nr() + " massSendId:" + localr.haN + " massSendList:" + localr.hcD + " create:" + bg.eK(localr.hcs) + " last:" + bg.eK(localr.hct) + " now:" + bg.eK(l) + " " + (l - localr.hct));
          if (localr.status == 200)
          {
            this.hbA.offer(Long.valueOf(localr.haN));
            this.hbB.put(Long.valueOf(localr.haN), null);
          }
        }
      }
      w.d("MicroMsg.SightMassSendService", "GetNeedRun procing:" + this.hbB.size() + " [send:" + this.hbA.size() + "]");
      this.hbA.size();
    }
    if ((!this.eyY) && (this.hbA.size() > 0))
    {
      localObject = (Long)this.hbA.poll();
      w.d("MicroMsg.SightMassSendService", "Start Mass Send, ID: %s", new Object[] { localObject });
      if (localObject != null)
      {
        this.hbB.put(localObject, new g.a());
        this.eyY = true;
        this.hbE = az(((Long)localObject).longValue());
        if (this.hbE == null)
        {
          this.eyY = false;
          this.eze.z(10L, 10L);
          GMTrace.o(16008416854016L, 119272);
          return;
        }
        this.hbC.put(localObject, this.hbE);
      }
    }
    GMTrace.o(16008416854016L, 119272);
  }
  
  public final void qH()
  {
    GMTrace.i(317156491264L, 2363);
    this.hbC.clear();
    this.hbB.clear();
    this.hbA.clear();
    this.eyY = false;
    this.running = false;
    w.d("MicroMsg.SightMassSendService", "Finish service use time(ms):" + this.ezd.tD());
    GMTrace.o(317156491264L, 2363);
  }
  
  private final class a
    implements com.tencent.mm.ad.e, i.a
  {
    List<r> gpV;
    long haN;
    r haO;
    String hbH;
    long startTime;
    
    public a()
    {
      GMTrace.i(353797931008L, 2636);
      GMTrace.o(353797931008L, 2636);
    }
    
    public final int a(String arg1, int paramInt, keep_ProgressInfo paramkeep_ProgressInfo, keep_SceneResult paramkeep_SceneResult, boolean paramBoolean)
    {
      GMTrace.i(353932148736L, 2637);
      w.d("MicroMsg.SightMassSendService", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { this.hbH, Integer.valueOf(paramInt), paramkeep_ProgressInfo, paramkeep_SceneResult });
      if (paramInt == 44531)
      {
        w.d("MicroMsg.SightMassSendService", "cdntra  ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", new Object[] { this.hbH });
        GMTrace.o(353932148736L, 2637);
        return 0;
      }
      if (paramInt != 0)
      {
        m.O(this.gpV);
        w.e("MicroMsg.SightMassSendService", "upload to CDN error, massSendId %d, errCode %d", new Object[] { Long.valueOf(this.haN), Integer.valueOf(paramInt) });
        com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(d.bc(ab.getContext())), Integer.valueOf(b.MediaType_TinyVideo), Integer.valueOf(0), "" });
        m.this.c(this.haN, 3, paramInt);
        GMTrace.o(353932148736L, 2637);
        return 0;
      }
      if (paramkeep_ProgressInfo != null)
      {
        w.v("MicroMsg.SightMassSendService", "progress length %d", new Object[] { Integer.valueOf(paramkeep_ProgressInfo.field_finishedLength) });
        ??? = this.gpV.iterator();
        while (???.hasNext())
        {
          paramkeep_SceneResult = (r)???.next();
          paramkeep_SceneResult.hct = bg.Pu();
          paramkeep_SceneResult.hbc = paramkeep_ProgressInfo.field_finishedLength;
          paramkeep_SceneResult.eQl = 1032;
          t.e(paramkeep_SceneResult);
        }
        GMTrace.o(353932148736L, 2637);
        return 0;
      }
      if (paramkeep_SceneResult != null)
      {
        if (paramkeep_SceneResult.field_retCode != 0)
        {
          w.e("MicroMsg.SightMassSendService", "cdntra sceneResult.retCode :%d arg[%s] info[%s], massSendId[%d]", new Object[] { Integer.valueOf(paramkeep_SceneResult.field_retCode), paramkeep_SceneResult.field_arg, paramkeep_SceneResult.field_transInfo, Long.valueOf(this.haN) });
          m.O(this.gpV);
          com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(paramkeep_SceneResult.field_retCode), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(d.bc(ab.getContext())), Integer.valueOf(b.MediaType_TinyVideo), Integer.valueOf(paramkeep_SceneResult.field_fileLength), paramkeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", paramkeep_SceneResult.report_Part2 });
          com.tencent.mm.plugin.report.service.g.ork.i(13937, new Object[] { Integer.valueOf(paramkeep_SceneResult.field_retCode), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(d.bc(ab.getContext())), Integer.valueOf(b.MediaType_TinyVideo), Integer.valueOf(paramkeep_SceneResult.field_fileLength), paramkeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", paramkeep_SceneResult.report_Part2 });
          m.this.c(this.haN, 3, paramkeep_SceneResult.field_retCode);
        }
      }
      else
      {
        GMTrace.o(353932148736L, 2637);
        return 0;
      }
      w.i("MicroMsg.SightMassSendService", "uploadvideo by cdn, isHitCacheUpload[%d] massSendId[%d]", new Object[] { Integer.valueOf(paramkeep_SceneResult.field_UploadHitCacheType), Long.valueOf(this.haN) });
      ??? = "<msg><videomsg aeskey=\"" + paramkeep_SceneResult.field_aesKey + "\" cdnthumbaeskey=\"" + paramkeep_SceneResult.field_aesKey + "\" cdnvideourl=\"" + paramkeep_SceneResult.field_fileId + "\" ";
      ??? = ??? + "cdnthumburl=\"" + paramkeep_SceneResult.field_fileId + "\" ";
      ??? = ??? + "length=\"" + paramkeep_SceneResult.field_fileLength + "\" ";
      ??? = ??? + "cdnthumblength=\"" + paramkeep_SceneResult.field_thumbimgLength + "\"/></msg>";
      w.i("MicroMsg.SightMassSendService", "cdn callback new build cdnInfo:%s", new Object[] { ??? });
      paramkeep_ProgressInfo = this.gpV.iterator();
      while (paramkeep_ProgressInfo.hasNext())
      {
        r localr = (r)paramkeep_ProgressInfo.next();
        if (bg.nm(localr.Nt()))
        {
          localr.hcB = ???;
          localr.eQl = 2097152;
          paramBoolean = t.e(localr);
          w.i("MicroMsg.SightMassSendService", "massSendId[%d] info %s, update recv xml ret %B", new Object[] { Long.valueOf(this.haN), localr.getFileName(), Boolean.valueOf(paramBoolean) });
        }
      }
      for (;;)
      {
        synchronized (m.this.hbD)
        {
          paramkeep_ProgressInfo = (String)m.this.hbC.get(Long.valueOf(this.haN));
          if (bg.nm(paramkeep_ProgressInfo)) {
            w.i("MicroMsg.SightMassSendService", "check cdn client id FAIL do NOTHING, massSendId %d, oldClientId %s, selfClientId %s", new Object[] { Long.valueOf(this.haN), paramkeep_ProgressInfo, this.hbH });
          }
        }
        w.i("MicroMsg.SightMassSendService", "check cdn client id ok do MASS SEND, massSendId %d, oldClientId %s, selfClientId %s", new Object[] { Long.valueOf(this.haN), paramkeep_ProgressInfo, this.hbH });
        m.this.hbC.put(Long.valueOf(this.haN), "done_upload_cdn_client_id");
        com.tencent.mm.kernel.h.wS().a(245, this);
        paramkeep_ProgressInfo = new e(this.haN, this.haO, paramkeep_SceneResult, this.hbH);
        if (!com.tencent.mm.kernel.h.wS().a(paramkeep_ProgressInfo, 0))
        {
          w.e("MicroMsg.SightMassSendService", "try to do NetSceneMassUploadSight fail");
          com.tencent.mm.kernel.h.wS().b(245, this);
          m.this.c(this.haN, 3, 0);
        }
      }
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
    {
      GMTrace.i(354334801920L, 2640);
      com.tencent.mm.kernel.h.wS().b(245, this);
      if ((paramInt1 == 4) && (paramInt2 == -22))
      {
        w.e("MicroMsg.SightMassSendService", "ERR: onGYNetEnd BLACK  errtype:" + paramInt1 + " errCode:" + paramInt2 + " massSendId:" + this.haN);
        m.P(this.gpV);
        m.this.c(this.haN, paramInt1, paramInt2);
        GMTrace.o(354334801920L, 2640);
        return;
      }
      if ((paramInt1 == 4) && (paramInt2 != 0))
      {
        w.e("MicroMsg.SightMassSendService", "ERR: onGYNetEnd SERVER FAILED errtype:" + paramInt1 + " errCode:" + paramInt2 + "  massSendId:" + this.haN);
        m.O(this.gpV);
        m.this.c(this.haN, paramInt1, paramInt2);
        GMTrace.o(354334801920L, 2640);
        return;
      }
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        w.e("MicroMsg.SightMassSendService", "ERR: onGYNetEnd FAILED (WILL RETRY) errtype:" + paramInt1 + " errCode:" + paramInt2 + "  massSendId:" + this.haN);
        m.O(this.gpV);
        m.this.c(this.haN, paramInt1, paramInt2);
        GMTrace.o(354334801920L, 2640);
        return;
      }
      paramString = this.gpV.iterator();
      if (paramString.hasNext())
      {
        paramk = (r)paramString.next();
        paramk.hct = bg.Pu();
        paramk.status = 199;
        paramk.eQl = 1280;
        if (t.e(paramk))
        {
          if (paramk != null) {
            break label390;
          }
          w.e("MicroMsg.VideoLogic", "video info is null");
        }
        for (;;)
        {
          w.v("MicroMsg.SightMassSendService", "massSendId %d, file %s, set status %d", new Object[] { Long.valueOf(this.haN), paramk.getFileName(), Integer.valueOf(199) });
          break;
          label390:
          au localau;
          if (paramk.hcw > 0)
          {
            localau = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(paramk.hcw);
            paramInt1 = localau.field_type;
            w.i("MicroMsg.VideoLogic", "ashutest::updateWriteFinMassMsgInfo, msg type %d", new Object[] { Integer.valueOf(paramInt1) });
            if ((43 == paramInt1) || (62 == paramInt1))
            {
              localau.dC(1);
              localau.db(paramk.Nq());
              localau.D(paramk.eSf);
              localau.dB(2);
              localau.setContent(p.b(paramk.Nr(), paramk.hcv, false));
              ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(paramk.hcw, localau);
              w.d("MicroMsg.VideoLogic", "updateWriteFinMassMsgInfo msgId:%d", new Object[] { Long.valueOf(localau.field_msgId) });
            }
          }
          else
          {
            localau = new au();
            localau.db(paramk.Nq());
            localau.setType(62);
            localau.dC(1);
            localau.dc(paramk.getFileName());
            localau.dB(2);
            localau.E(bc.gR(paramk.Nq()));
            paramk.hcw = ((int)bc.i(localau));
            paramk.eQl = 8192;
            t.e(paramk);
            w.d("MicroMsg.VideoLogic", "updateWriteFinMassMsgInfo insert msgId:%d", new Object[] { Long.valueOf(localau.field_msgId) });
          }
        }
      }
      paramString = m.this;
      long l = this.haN;
      com.tencent.mm.kernel.h.xB().A(new m.1(paramString, l));
      GMTrace.o(354334801920L, 2640);
    }
    
    public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
    {
      GMTrace.i(354066366464L, 2638);
      GMTrace.o(354066366464L, 2638);
    }
    
    public final byte[] h(String paramString, byte[] paramArrayOfByte)
    {
      GMTrace.i(354200584192L, 2639);
      GMTrace.o(354200584192L, 2639);
      return null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvideo\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */