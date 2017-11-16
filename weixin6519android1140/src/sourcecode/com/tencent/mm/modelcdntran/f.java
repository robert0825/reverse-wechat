package com.tencent.mm.modelcdntran;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.jf;
import com.tencent.mm.g.a.kw;
import com.tencent.mm.g.a.kw.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvideo.q;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.x.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.c.c;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.w.a;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public final class f
  implements com.tencent.mm.ad.e, b.a
{
  public Map<String, j> gAk;
  public Map<String, keep_SceneResult> gAl;
  public Queue<String> gzF;
  public Map<String, j> gzG;
  public Map<String, j> gzH;
  
  public f()
  {
    GMTrace.i(578881060864L, 4313);
    this.gzF = new LinkedList();
    this.gzG = new HashMap();
    this.gzH = new HashMap();
    this.gAk = new HashMap();
    this.gAl = new HashMap();
    com.tencent.mm.kernel.h.wS().a(379, this);
    GMTrace.o(578881060864L, 4313);
  }
  
  public static j a(an paraman, String paramString1, String paramString2, String paramString3, int paramInt)
  {
    GMTrace.i(17447767769088L, 129996);
    if (paraman == null)
    {
      w.w("MicroMsg.OnlineVideoService", "check can sns online video, scene is null.");
      GMTrace.o(17447767769088L, 129996);
      return null;
    }
    if (bg.nm(paramString1))
    {
      w.w("MicroMsg.OnlineVideoService", "check can sns online video, url is null.");
      GMTrace.o(17447767769088L, 129996);
      return null;
    }
    Object localObject = com.tencent.mm.modelvideo.t.mw(paramString3);
    if (localObject == null)
    {
      w.w("MicroMsg.OnlineVideoService", "check can sns online video, video info is null. %s", new Object[] { paramString3 });
      GMTrace.o(17447767769088L, 129996);
      return null;
    }
    String str = d.a("snsvideo", paraman.time, "sns", paramString1);
    if (bg.nm(str))
    {
      w.w("MicroMsg.OnlineVideoService", "check can http online video, can not create media id. url %s ", new Object[] { paramString1 });
      GMTrace.o(17447767769088L, 129996);
      return null;
    }
    j localj = new j();
    localj.filename = paramString3;
    localj.field_fullpath = paramString2;
    localj.field_mediaId = str;
    localj.gAN = 2;
    localj.gAS = paramInt;
    localj.gAU = ((r)localObject).gAU;
    if (paraman == null) {
      paramString2 = "";
    }
    for (;;)
    {
      paramInt = com.tencent.mm.protocal.d.tJC;
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xw();
      localObject = com.tencent.mm.a.o.getString(com.tencent.mm.kernel.a.ww());
      int i = am.getNetTypeForStat(ab.getContext());
      int j = am.getStrength(ab.getContext());
      label256:
      long l1;
      if (!bg.nm(paramString2))
      {
        paramString3 = "&scene=" + paramString2;
        localj.referer = String.format("http://weixin.qq.com/?version=%d&uin=%s&nettype=%d&signal=%d%s", new Object[] { Integer.valueOf(paramInt), localObject, Integer.valueOf(i), Integer.valueOf(j), paramString3 });
        localj.url = paramString1;
        paramString1 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue("SnsSightDomainList");
        long l2 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getInt("SnsSightMainStandbyIpSwitchTime", 0);
        w.i("MicroMsg.OnlineVideoService", "hostvalue %s dcipTime %s scene.time[%d]", new Object[] { paramString1, Long.valueOf(l2), Integer.valueOf(paraman.time) });
        l1 = l2;
        if (l2 <= 0L) {
          l1 = 259200L;
        }
      }
      for (boolean bool = a(paraman, localj.url, l1, paramString1);; bool = false)
      {
        try
        {
          localj.host = new URL(localj.url).getHost();
          paramString1 = new ArrayList();
          com.tencent.mm.network.b.a(bool, paramString1, localj.host);
          localj.iplist = new String[paramString1.size()];
          paramString1.toArray(localj.iplist);
          if (bg.aG(paraman.time) <= l1) {
            continue;
          }
          bool = true;
          localj.isColdSnsData = bool;
          localj.signalQuality = am.getStrength(ab.getContext());
          localj.snsScene = paramString2;
          GMTrace.o(17447767769088L, 129996);
          return localj;
        }
        catch (Exception paraman)
        {
          w.printErrStackTrace("MicroMsg.OnlineVideoService", paraman, "check can sns online video error taskInfo %s", new Object[] { localj });
          GMTrace.o(17447767769088L, 129996);
          return null;
        }
        if (paraman.equals(an.vBa))
        {
          paramString2 = "album_friend";
          break;
        }
        if (paraman.equals(an.vBb))
        {
          paramString2 = "album_self";
          break;
        }
        if (paraman.equals(an.vBc))
        {
          paramString2 = "album_stranger";
          break;
        }
        if (paraman.equals(an.vBd))
        {
          paramString2 = "profile_friend";
          break;
        }
        if (paraman.equals(an.vBe))
        {
          paramString2 = "profile_stranger";
          break;
        }
        if (paraman.equals(an.vBf))
        {
          paramString2 = "comment";
          break;
        }
        if (paraman.equals(an.vAZ))
        {
          paramString2 = "timeline";
          break;
        }
        if (!paraman.equals(an.vBi)) {
          break label722;
        }
        paramString2 = "snssight";
        break;
        paramString3 = "";
        break label256;
      }
      label722:
      paramString2 = "";
    }
  }
  
  public static void a(r paramr, int paramInt, String paramString)
  {
    GMTrace.i(580089020416L, 4322);
    w.i("MicroMsg.OnlineVideoService", "download finish. totalLen %d ", new Object[] { Integer.valueOf(paramInt) });
    if (paramr != null)
    {
      com.tencent.mm.modelvideo.t.N(paramr.getFileName(), paramInt);
      paramr = paramr.getFileName();
      if (!bg.nm(paramString))
      {
        com.tencent.mm.modelvideo.o.Nh();
        paramr = com.tencent.mm.modelvideo.s.mk(paramr);
        if ((bg.nm(paramString)) || (paramInt <= 0) || (bg.nm(paramr)))
        {
          w.w("MicroMsg.OnlineVideoService", "insert media duplication but args is error.[%d, %s, %s]", new Object[] { Integer.valueOf(paramInt), paramString, paramr });
          GMTrace.o(580089020416L, 4322);
          return;
        }
        ((com.tencent.mm.plugin.r.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.r.a.a.class)).yR().u(paramString, paramInt, paramr);
      }
    }
    GMTrace.o(580089020416L, 4322);
  }
  
  public static void a(Object[] paramArrayOfObject, keep_SceneResult paramkeep_SceneResult, j paramj, boolean paramBoolean)
  {
    GMTrace.i(580491673600L, 4325);
    if ((paramj == null) || (paramkeep_SceneResult == null))
    {
      w.w("MicroMsg.OnlineVideoService", "video task info is null or download result is null.");
      GMTrace.o(580491673600L, 4325);
      return;
    }
    if (paramj.Gp())
    {
      GMTrace.o(580491673600L, 4325);
      return;
    }
    w.i("MicroMsg.OnlineVideoService", "rpt online video format[%d]", new Object[] { Integer.valueOf(paramkeep_SceneResult.field_videoFormat) });
    if (paramkeep_SceneResult.field_videoFormat == 2)
    {
      localObject1 = paramj.filename;
      localObject2 = com.tencent.mm.modelvideo.t.mw((String)localObject1);
      if (localObject2 != null)
      {
        ((r)localObject2).videoFormat = 2;
        ((r)localObject2).eQl = 2;
        w.i("MicroMsg.VideoLogic", "set VideoFormat ret[%b] filename[%s] format[%d]", new Object[] { Boolean.valueOf(com.tencent.mm.modelvideo.o.Nh().b((r)localObject2)), localObject1, Integer.valueOf(2) });
      }
    }
    boolean bool = paramj.Go();
    Object localObject1 = new PInt();
    Object localObject2 = new PInt();
    ((PInt)localObject2).value = 0;
    ((PInt)localObject1).value = 0;
    com.tencent.mm.modelvideo.t.a(paramj.field_fullpath, (PInt)localObject1, (PInt)localObject2);
    int i6 = ((PInt)localObject1).value;
    int i5 = ((PInt)localObject2).value;
    int m = 0;
    int i1;
    int i2;
    int i3;
    int n;
    int j;
    int k;
    if (paramArrayOfObject != null)
    {
      i1 = ((Integer)paramArrayOfObject[0]).intValue() * 1000;
      i2 = ((Integer)paramArrayOfObject[1]).intValue();
      i3 = ((Integer)paramArrayOfObject[2]).intValue();
      m = ((Integer)paramArrayOfObject[3]).intValue();
      n = ((Integer)paramArrayOfObject[4]).intValue();
      j = ((Integer)paramArrayOfObject[5]).intValue();
      k = ((Integer)paramArrayOfObject[6]).intValue();
    }
    for (;;)
    {
      int i4 = paramj.gAU;
      int i = i4;
      if (i4 <= 0)
      {
        if (bool) {
          i = 10;
        }
      }
      else
      {
        i4 = am.ev(ab.getContext());
        localObject1 = new StringBuffer();
        if (!bool) {
          break label1047;
        }
        ((StringBuffer)localObject1).append(paramj.field_fileId).append(",").append(paramj.field_aesKey).append(",");
        label377:
        ((StringBuffer)localObject1).append(paramkeep_SceneResult.field_fileLength).append(",").append(i6 * 1000).append(",");
        ((StringBuffer)localObject1).append(paramkeep_SceneResult.field_recvedBytes).append(",");
        ((StringBuffer)localObject1).append(i1 + ",").append(i2 + ",").append(i3 + ",");
        ((StringBuffer)localObject1).append(m + ",").append(n + ",");
        ((StringBuffer)localObject1).append(i4).append(",");
        ((StringBuffer)localObject1).append(i).append(",");
        ((StringBuffer)localObject1).append(paramkeep_SceneResult.field_startTime).append(",");
        ((StringBuffer)localObject1).append(paramkeep_SceneResult.field_endTime).append(",");
        if (!bool) {
          break label1093;
        }
        if (paramj.gAT == null) {
          break label1079;
        }
        paramArrayOfObject = com.tencent.mm.a.g.n(paramj.gAT.getBytes());
        label633:
        ((StringBuffer)localObject1).append(paramArrayOfObject).append(",");
        if (!com.tencent.mm.y.s.eb(paramj.gAT)) {
          break label1087;
        }
        i = 1;
        label659:
        ((StringBuffer)localObject1).append(i).append(",");
        label673:
        ((StringBuffer)localObject1).append(paramkeep_SceneResult.field_retCode).append(",");
        ((StringBuffer)localObject1).append(paramkeep_SceneResult.field_enQueueTime).append(",");
        ((StringBuffer)localObject1).append(paramkeep_SceneResult.field_firstRequestCost).append(",");
        ((StringBuffer)localObject1).append(paramkeep_SceneResult.field_firstRequestSize).append(",");
        ((StringBuffer)localObject1).append(paramkeep_SceneResult.field_firstRequestDownloadSize).append(",");
        if (!paramkeep_SceneResult.field_firstRequestCompleted) {
          break label1125;
        }
        i = 1;
        label763:
        ((StringBuffer)localObject1).append(i).append(",");
        ((StringBuffer)localObject1).append(paramkeep_SceneResult.field_averageSpeed).append(",");
        ((StringBuffer)localObject1).append(paramkeep_SceneResult.field_averageConnectCost).append(",");
        ((StringBuffer)localObject1).append(paramkeep_SceneResult.field_firstConnectCost).append(",");
        ((StringBuffer)localObject1).append(paramkeep_SceneResult.field_netConnectTimes).append(",");
        ((StringBuffer)localObject1).append(paramkeep_SceneResult.field_moovRequestTimes).append(",");
        ((StringBuffer)localObject1).append(paramkeep_SceneResult.field_moovCost).append(",");
        ((StringBuffer)localObject1).append(paramkeep_SceneResult.field_moovSize).append(",");
        if (!paramkeep_SceneResult.field_moovCompleted) {
          break label1131;
        }
      }
      label1047:
      label1079:
      label1087:
      label1093:
      label1125:
      label1131:
      for (i = 1;; i = 0)
      {
        ((StringBuffer)localObject1).append(i).append(",");
        ((StringBuffer)localObject1).append(paramkeep_SceneResult.field_moovFailReason).append(",");
        ((StringBuffer)localObject1).append(j).append(",");
        ((StringBuffer)localObject1).append(k).append(",");
        if (!bool) {
          break label1137;
        }
        ((StringBuffer)localObject1).append(i5).append(",");
        paramArrayOfObject = "";
        if (paramkeep_SceneResult.field_usedSvrIps == null) {
          break label1198;
        }
        paramArrayOfObject = new StringBuffer();
        localObject2 = paramkeep_SceneResult.field_usedSvrIps;
        j = localObject2.length;
        i = 0;
        while (i < j)
        {
          paramArrayOfObject.append(localObject2[i]).append("|");
          i += 1;
        }
        i = 31;
        break;
        ((StringBuffer)localObject1).append(paramj.url).append(",").append(paramj.gAV).append(",");
        break label377;
        paramArrayOfObject = Integer.valueOf(0);
        break label633;
        i = 0;
        break label659;
        ((StringBuffer)localObject1).append(0).append(",");
        ((StringBuffer)localObject1).append(paramkeep_SceneResult.field_httpStatusCode).append(",");
        break label673;
        i = 0;
        break label763;
      }
      label1137:
      ((StringBuffer)localObject1).append(i5).append(",");
      if (paramj.gAT != null) {}
      for (paramArrayOfObject = com.tencent.mm.a.g.n(paramj.gAT.getBytes());; paramArrayOfObject = Integer.valueOf(0))
      {
        ((StringBuffer)localObject1).append(paramArrayOfObject).append(",");
        break;
      }
      paramArrayOfObject = paramArrayOfObject.toString();
      label1198:
      ((StringBuffer)localObject1).append(paramArrayOfObject).append(",");
      ((StringBuffer)localObject1).append(paramj.gAW).append(",");
      ((StringBuffer)localObject1).append(paramj.eSf).append(",");
      ((StringBuffer)localObject1).append(paramj.initialDownloadLength).append(",");
      ((StringBuffer)localObject1).append(paramkeep_SceneResult.field_videoFormat);
      long l1;
      long l2;
      String str1;
      String[] arrayOfString;
      String str2;
      Object localObject3;
      if (bool)
      {
        i = 13570;
        paramArrayOfObject = ((StringBuffer)localObject1).toString();
        w.i("MicroMsg.OnlineVideoService", "report online video %d:%s", new Object[] { Integer.valueOf(i), paramArrayOfObject });
        com.tencent.mm.plugin.report.service.g.ork.A(i, paramArrayOfObject);
        if (paramBoolean)
        {
          paramArrayOfObject = paramj.eMI;
          localObject1 = paramj.gAT;
          m = paramj.eMK;
          localObject2 = paramkeep_SceneResult.field_fileId;
          l1 = paramkeep_SceneResult.field_startTime;
          l2 = paramkeep_SceneResult.field_endTime;
          str1 = paramj.field_fullpath;
          arrayOfString = paramkeep_SceneResult.field_usedSvrIps;
          str2 = paramj.url;
          localObject3 = paramj.filename;
          n = paramj.gAX;
          localObject3 = com.tencent.mm.modelvideo.t.mw((String)localObject3);
          if (localObject3 == null) {
            break label1768;
          }
          j = ((r)localObject3).eMO;
        }
      }
      for (k = ((r)localObject3).gsL;; k = 0)
      {
        if (n <= 0)
        {
          i = 1;
          localObject3 = new jf();
          ((jf)localObject3).eMH.eMI = paramArrayOfObject;
          ((jf)localObject3).eMH.eMJ = ((String)localObject1);
          ((jf)localObject3).eMH.eMK = m;
          ((jf)localObject3).eMH.eML = ((String)localObject2);
          ((jf)localObject3).eMH.netType = i4;
          ((jf)localObject3).eMH.startTime = l1;
          ((jf)localObject3).eMH.endTime = l2;
          ((jf)localObject3).eMH.path = str1;
          ((jf)localObject3).eMH.eMM = arrayOfString;
          ((jf)localObject3).eMH.eMN = str2;
          ((jf)localObject3).eMH.eMO = j;
          ((jf)localObject3).eMH.eMP = i;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject3);
          if (bool)
          {
            if (paramkeep_SceneResult.field_videoFormat != 2) {
              break label1751;
            }
            com.tencent.mm.plugin.report.service.g.ork.a(354L, 132L, 1L, false);
          }
        }
        for (;;)
        {
          paramArrayOfObject = com.tencent.mm.modelvideo.t.mw(paramj.filename);
          if (paramArrayOfObject != null)
          {
            paramArrayOfObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(paramArrayOfObject.hcw);
            ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(new c.c(paramArrayOfObject.field_talker, "update", paramArrayOfObject));
          }
          GMTrace.o(580491673600L, 4325);
          return;
          i = 13790;
          break;
          i1 = (int)(n / 100.0F * k);
          if (j < i1) {}
          for (i = 2;; i = 3)
          {
            w.d("MicroMsg.OnlineVideoService", "rptMediaInfo %d * %d = configSize[%d] preloadSize[%d]", new Object[] { Integer.valueOf(n), Integer.valueOf(k), Integer.valueOf(i1), Integer.valueOf(j) });
            break;
          }
          label1751:
          com.tencent.mm.plugin.report.service.g.ork.a(354L, 133L, 1L, false);
        }
        label1768:
        j = 0;
      }
      j = 0;
      k = 0;
      i1 = 0;
      i2 = 0;
      i3 = 0;
      n = 0;
    }
  }
  
  private static boolean a(an paraman, String paramString1, long paramLong, String paramString2)
  {
    GMTrace.i(580357455872L, 4324);
    if (paramString1 == null)
    {
      GMTrace.o(580357455872L, 4324);
      return false;
    }
    try
    {
      paramString1 = new URL(paramString1);
      if (paraman == null)
      {
        GMTrace.o(580357455872L, 4324);
        return false;
      }
      if (paramString2 == null)
      {
        GMTrace.o(580357455872L, 4324);
        return false;
      }
      int i = paramString2.indexOf(paramString1.getHost());
      if (i == -1)
      {
        GMTrace.o(580357455872L, 4324);
        return false;
      }
      i = paraman.time;
      if (i == 0)
      {
        GMTrace.o(580357455872L, 4324);
        return false;
      }
      long l = bg.aG(paraman.time);
      if (l > paramLong)
      {
        GMTrace.o(580357455872L, 4324);
        return true;
      }
      GMTrace.o(580357455872L, 4324);
      return false;
    }
    catch (Exception paraman)
    {
      w.e("MicroMsg.OnlineVideoService", "error for check dcip %s", new Object[] { paraman.getMessage() });
      GMTrace.o(580357455872L, 4324);
    }
    return false;
  }
  
  public static int e(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(14627450650624L, 108983);
    g.Gl();
    int i = b.requestVideoData(paramString, paramInt1, paramInt2, 0);
    w.i("MicroMsg.OnlineVideoService", "request video video[%s], offset[%d], length[%d] duration[%d] ret[%d]", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(0), Integer.valueOf(i) });
    GMTrace.o(14627450650624L, 108983);
    return i;
  }
  
  public final int a(final String paramString, final keep_ProgressInfo paramkeep_ProgressInfo, final keep_SceneResult paramkeep_SceneResult)
  {
    GMTrace.i(579954802688L, 4321);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.OnlineVideoService", "cdn callback mediaid is null.");
      GMTrace.o(579954802688L, 4321);
      return -1;
    }
    if ((paramkeep_ProgressInfo == null) && (paramkeep_SceneResult == null))
    {
      w.e("MicroMsg.OnlineVideoService", "cdn callback info all null.");
      GMTrace.o(579954802688L, 4321);
      return -2;
    }
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17447230898176L, 129992);
        Object localObject = (j)f.this.gzH.get(paramString);
        if (localObject == null)
        {
          GMTrace.o(17447230898176L, 129992);
          return;
        }
        if (((j)localObject).gAY != null)
        {
          if (paramkeep_ProgressInfo != null)
          {
            ((j)localObject).gAY.f(paramString, paramkeep_ProgressInfo.field_finishedLength, paramkeep_ProgressInfo.field_toltalLength);
            GMTrace.o(17447230898176L, 129992);
            return;
          }
          if (paramkeep_SceneResult != null)
          {
            ((j)localObject).gAY.A(paramString, paramkeep_SceneResult.field_retCode);
            GMTrace.o(17447230898176L, 129992);
            return;
          }
          GMTrace.o(17447230898176L, 129992);
          return;
        }
        r localr = com.tencent.mm.modelvideo.t.mw(((j)localObject).filename);
        if (localr == null)
        {
          w.w("MicroMsg.OnlineVideoService", "stream download video callback, but video info is null.[%s]", new Object[] { ((j)localObject).filename });
          GMTrace.o(17447230898176L, 129992);
          return;
        }
        if (((j)localObject).gAB != null)
        {
          ((j)localObject).gAB.a(paramString, 0, paramkeep_ProgressInfo, paramkeep_SceneResult, ((j)localObject).field_onlycheckexist);
          if (paramkeep_SceneResult != null) {
            f.this.gzH.remove(paramString);
          }
          GMTrace.o(17447230898176L, 129992);
          return;
        }
        if (paramkeep_ProgressInfo != null)
        {
          if (paramkeep_ProgressInfo.field_finishedLength == localr.gsL)
          {
            w.i("MicroMsg.OnlineVideoService", "stream download finish.");
            GMTrace.o(17447230898176L, 129992);
            return;
          }
          if ((localr.status != 130) && (localr.hcp > paramkeep_ProgressInfo.field_finishedLength))
          {
            w.w("MicroMsg.OnlineVideoService", "set video error. db now size %d, cdn callback %d.", new Object[] { Integer.valueOf(localr.hcp), Integer.valueOf(paramkeep_ProgressInfo.field_finishedLength) });
            GMTrace.o(17447230898176L, 129992);
            return;
          }
          w.i("MicroMsg.OnlineVideoService", "callback progress info " + paramkeep_ProgressInfo.field_finishedLength);
          localr.hct = bg.Pu();
          localr.hcp = paramkeep_ProgressInfo.field_finishedLength;
          localr.eQl = 1040;
          com.tencent.mm.modelvideo.t.e(localr);
          localObject = new kw();
          ((kw)localObject).eOZ.eHJ = 5;
          ((kw)localObject).eOZ.mediaId = paramString;
          ((kw)localObject).eOZ.offset = paramkeep_ProgressInfo.field_finishedLength;
          ((kw)localObject).eOZ.length = paramkeep_ProgressInfo.field_toltalLength;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
          GMTrace.o(17447230898176L, 129992);
          return;
        }
        int i;
        int j;
        if (paramkeep_SceneResult != null)
        {
          w.i("MicroMsg.OnlineVideoService", "callback result info " + paramkeep_SceneResult.field_retCode + ", filesize:" + paramkeep_SceneResult.field_fileLength + ",recved:" + paramkeep_SceneResult.field_recvedBytes);
          if (paramkeep_SceneResult.field_retCode == 0) {
            break label1031;
          }
          if (paramkeep_SceneResult.field_retCode != 55524) {
            com.tencent.mm.modelvideo.t.mp(localr.getFileName());
          }
          boolean bool = ((j)localObject).Go();
          i = paramkeep_SceneResult.field_retCode;
          j = ((j)localObject).gAS;
          if (!bool) {
            break label940;
          }
          if (j != 1) {
            break label852;
          }
          if (i != -5103059) {
            break label787;
          }
          com.tencent.mm.plugin.report.service.g.ork.a(354L, 111L, 1L, false);
          com.tencent.mm.plugin.report.service.g.ork.i(13836, new Object[] { Integer.valueOf(101), Long.valueOf(bg.Pu()), Integer.valueOf(i) });
        }
        for (;;)
        {
          localObject = new kw();
          ((kw)localObject).eOZ.eHJ = 4;
          ((kw)localObject).eOZ.mediaId = paramString;
          ((kw)localObject).eOZ.offset = 0;
          ((kw)localObject).eOZ.retCode = paramkeep_SceneResult.field_retCode;
          ((kw)localObject).eOZ.length = paramkeep_SceneResult.field_fileLength;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
          f.this.gzH.remove(paramString);
          GMTrace.o(17447230898176L, 129992);
          return;
          label787:
          if (i == -5103087)
          {
            com.tencent.mm.plugin.report.service.g.ork.a(354L, 112L, 1L, false);
            break;
          }
          if (i == 55524)
          {
            com.tencent.mm.plugin.report.service.g.ork.a(354L, 113L, 1L, false);
            break;
          }
          com.tencent.mm.plugin.report.service.g.ork.a(354L, 114L, 1L, false);
          break;
          label852:
          if (i == -5103059)
          {
            com.tencent.mm.plugin.report.service.g.ork.a(354L, 116L, 1L, false);
            break;
          }
          if (i == -5103087)
          {
            com.tencent.mm.plugin.report.service.g.ork.a(354L, 117L, 1L, false);
            break;
          }
          if (i == 55524)
          {
            com.tencent.mm.plugin.report.service.g.ork.a(354L, 118L, 1L, false);
            break;
          }
          com.tencent.mm.plugin.report.service.g.ork.a(354L, 119L, 1L, false);
          break;
          label940:
          com.tencent.mm.plugin.report.service.g.ork.a(354L, 213L, 1L, false);
          if (j == 1) {
            com.tencent.mm.plugin.report.service.g.ork.a(354L, 214L, 1L, false);
          }
          for (;;)
          {
            com.tencent.mm.plugin.report.service.g.ork.i(13836, new Object[] { Integer.valueOf(201), Long.valueOf(bg.Pu()), Integer.valueOf(i) });
            break;
            com.tencent.mm.plugin.report.service.g.ork.a(354L, 215L, 1L, false);
          }
          label1031:
          f.a(localr, paramkeep_SceneResult.field_fileLength, ((j)localObject).gAQ);
          f.this.gAk.put(((j)localObject).field_mediaId, localObject);
          f.this.gAl.put(((j)localObject).field_mediaId, paramkeep_SceneResult);
        }
      }
    });
    if (this.gzH.get(paramString) != null)
    {
      GMTrace.o(579954802688L, 4321);
      return 1;
    }
    GMTrace.o(579954802688L, 4321);
    return 0;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(17447633551360L, 129995);
    if (paramk.getType() != 379)
    {
      GMTrace.o(17447633551360L, 129995);
      return;
    }
    w.i("MicroMsg.OnlineVideoService", "it get cdn dns success[%d, %d], try to start.", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (com.tencent.mm.kernel.h.xw().wL()) {
      com.tencent.mm.kernel.h.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(575525617664L, 4288);
          f.this.br(true);
          GMTrace.o(575525617664L, 4288);
        }
      });
    }
    GMTrace.o(17447633551360L, 129995);
  }
  
  public final boolean a(final j paramj, boolean paramBoolean)
  {
    GMTrace.i(579015278592L, 4314);
    if (paramj == null)
    {
      w.e("MicroMsg.OnlineVideoService", "add download task, but task is null.");
      GMTrace.o(579015278592L, 4314);
      return false;
    }
    if (bg.nm(paramj.field_mediaId))
    {
      w.e("MicroMsg.OnlineVideoService", "add download task, but task mediaId is null.");
      GMTrace.o(579015278592L, 4314);
      return false;
    }
    w.i("MicroMsg.OnlineVideoService", "add download task : " + paramj.field_mediaId + " delay : " + paramBoolean);
    if (paramj.field_fileId == null) {
      paramj.field_fileId = "";
    }
    if (paramj.field_aesKey == null) {
      paramj.field_aesKey = "";
    }
    paramj.eYr = false;
    if ((b(paramj.field_mediaId, null)) || (paramBoolean)) {
      com.tencent.mm.kernel.h.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(577673101312L, 4304);
          f.this.gzF.add(paramj.field_mediaId);
          f.this.gzG.put(paramj.field_mediaId, paramj);
          f.this.br(false);
          GMTrace.o(577673101312L, 4304);
        }
      });
    }
    for (;;)
    {
      GMTrace.o(579015278592L, 4314);
      return true;
      com.tencent.mm.kernel.h.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(591497527296L, 4407);
          f.this.gzF.add(paramj.field_mediaId);
          f.this.gzG.put(paramj.field_mediaId, paramj);
          f.this.br(false);
          GMTrace.o(591497527296L, 4407);
        }
      });
    }
  }
  
  public final boolean b(final String paramString, final Object[] paramArrayOfObject)
  {
    GMTrace.i(579149496320L, 4315);
    boolean bool1 = false;
    boolean bool2 = false;
    if (!bg.nm(paramString)) {
      if (!this.gzH.containsKey(paramString)) {
        break label96;
      }
    }
    for (bool1 = true;; bool1 = bool2)
    {
      com.tencent.mm.kernel.h.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(592034398208L, 4411);
          j localj = (j)f.this.gzH.remove(paramString);
          keep_SceneResult localkeep_SceneResult;
          int i;
          if (localj != null)
          {
            localkeep_SceneResult = new keep_SceneResult();
            g.Gl();
            i = b.a(localj.field_mediaId, localkeep_SceneResult);
            if (i == 0) {
              f.a(paramArrayOfObject, localkeep_SceneResult, localj, false);
            }
          }
          for (;;)
          {
            f.this.gzG.remove(paramString);
            GMTrace.o(592034398208L, 4411);
            return;
            w.w("MicroMsg.OnlineVideoService", "stop video stream download error. ret %d, mediaId %s", new Object[] { Integer.valueOf(i), localj.field_mediaId });
            continue;
            localj = (j)f.this.gAk.remove(paramString);
            localkeep_SceneResult = (keep_SceneResult)f.this.gAl.remove(paramString);
            if ((localj != null) && (localkeep_SceneResult != null)) {
              f.a(paramArrayOfObject, localkeep_SceneResult, localj, true);
            }
          }
        }
      });
      w.i("MicroMsg.OnlineVideoService", "cancelDownloadTask mediaId : " + paramString + " remove : " + bool1);
      GMTrace.o(579149496320L, 4315);
      return bool1;
      label96:
      g.Gk().jz(paramString);
    }
  }
  
  public final void br(boolean paramBoolean)
  {
    GMTrace.i(19010733211648L, 141641);
    if (!com.tencent.mm.kernel.h.xw().wL())
    {
      GMTrace.o(19010733211648L, 141641);
      return;
    }
    if ((!paramBoolean) && (g.Gl().Ge()))
    {
      com.tencent.mm.kernel.h.xw();
      if (com.tencent.mm.kernel.a.wK())
      {
        w.w("MicroMsg.OnlineVideoService", "cdn engine not init cdn dnsinfo , will retry after set info");
        g.Gk().br(paramBoolean);
        GMTrace.o(19010733211648L, 141641);
        return;
      }
    }
    c.Gf();
    while (!this.gzF.isEmpty())
    {
      Object localObject1 = (String)this.gzF.poll();
      Object localObject2 = (j)this.gzG.remove(localObject1);
      if (localObject2 != null)
      {
        ((j)localObject2).field_startTime = bg.Pv();
        if (!((j)localObject2).eYr)
        {
          if (((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vvc, Integer.valueOf(-1))).intValue() == 2) {
            w.i("MicroMsg.OnlineVideoService", "command set do not check media duplication.");
          }
          label176:
          int j;
          for (int i = 0;; i = 1)
          {
            if (i == 0) {
              break label418;
            }
            localObject2 = new kw();
            ((kw)localObject2).eOZ.eHJ = 6;
            ((kw)localObject2).eOZ.mediaId = ((String)localObject1);
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
            break;
            if (((j)localObject2).Gp()) {
              break label176;
            }
            Object localObject3 = ((j)localObject2).gAQ;
            i = ((j)localObject2).gAR;
            Object localObject4 = ((com.tencent.mm.plugin.r.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.r.a.a.class)).yR().cN((String)localObject3, i);
            j = i - com.tencent.mm.a.e.aY((String)localObject4);
            if ((bg.nm((String)localObject4)) || (j < 0) || (j > 16)) {
              break label176;
            }
            w.i("MicroMsg.OnlineVideoService", "it had download this video[%d, %s, %s].", new Object[] { Integer.valueOf(i), localObject3, localObject4 });
            com.tencent.mm.sdk.platformtools.j.eR((String)localObject4, ((j)localObject2).field_fullpath);
            localObject4 = com.tencent.mm.modelvideo.t.mw(((j)localObject2).filename);
            a((r)localObject4, i, (String)localObject3);
            localObject3 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(((r)localObject4).hcw);
            ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(new c.c(((ce)localObject3).field_talker, "update", (au)localObject3));
          }
          label418:
          if (((j)localObject2).Go())
          {
            g.Gl();
            i = b.a((i)localObject2, ((j)localObject2).gAS);
            label441:
            w.i("MicroMsg.OnlineVideoService", "start task %s streaming download. ret %d ", new Object[] { localObject2, Integer.valueOf(i) });
            if (i == 0) {
              break label929;
            }
            w.w("MicroMsg.OnlineVideoService", "start stream video error. ret : " + i + " media id: " + ((j)localObject2).field_mediaId);
            paramBoolean = ((j)localObject2).Go();
            j = ((j)localObject2).gAS;
            if (!paramBoolean) {
              break label840;
            }
            com.tencent.mm.plugin.report.service.g.ork.a(354L, 3L, 1L, false);
            if (j != 1) {
              break label775;
            }
            if (i != 44530) {
              break label734;
            }
            com.tencent.mm.plugin.report.service.g.ork.a(354L, 100L, 1L, false);
          }
          for (;;)
          {
            com.tencent.mm.plugin.report.service.g.ork.i(13836, new Object[] { Integer.valueOf(100), Long.valueOf(bg.Pu()), "" });
            break;
            if (((j)localObject2).Gn())
            {
              g.Gl();
              i = b.a(((j)localObject2).field_mediaId, ((j)localObject2).url, ((j)localObject2).referer, ((j)localObject2).field_fullpath, ((j)localObject2).gAS, ((j)localObject2).iplist, ((j)localObject2).initialDownloadOffset, ((j)localObject2).initialDownloadLength, ((j)localObject2).isColdSnsData, ((j)localObject2).signalQuality, ((j)localObject2).snsScene, ((j)localObject2).field_preloadRatio);
              break label441;
            }
            g.Gl();
            i = b.a(((j)localObject2).field_mediaId, ((j)localObject2).url, ((j)localObject2).referer, ((j)localObject2).field_fullpath, ((j)localObject2).gAS, ((j)localObject2).iplist, ((j)localObject2).initialDownloadOffset, ((j)localObject2).initialDownloadLength, ((j)localObject2).field_preloadRatio);
            break label441;
            label734:
            if (i == 45533)
            {
              com.tencent.mm.plugin.report.service.g.ork.a(354L, 101L, 1L, false);
            }
            else
            {
              com.tencent.mm.plugin.report.service.g.ork.a(354L, 102L, 1L, false);
              continue;
              label775:
              if (i == 44530) {
                com.tencent.mm.plugin.report.service.g.ork.a(354L, 106L, 1L, false);
              } else if (i == 45533) {
                com.tencent.mm.plugin.report.service.g.ork.a(354L, 107L, 1L, false);
              } else {
                com.tencent.mm.plugin.report.service.g.ork.a(354L, 108L, 1L, false);
              }
            }
          }
          label840:
          com.tencent.mm.plugin.report.service.g.ork.a(354L, 210L, 1L, false);
          if (j == 1) {
            com.tencent.mm.plugin.report.service.g.ork.a(354L, 211L, 1L, false);
          }
          for (;;)
          {
            com.tencent.mm.plugin.report.service.g.ork.i(13836, new Object[] { Integer.valueOf(200), Long.valueOf(bg.Pu()), "" });
            break;
            com.tencent.mm.plugin.report.service.g.ork.a(354L, 212L, 1L, false);
          }
          label929:
          ((j)localObject2).gAP = bg.Pv();
          if (((j)localObject2).Go())
          {
            localObject1 = com.tencent.mm.modelvideo.t.mw(((j)localObject2).filename);
            if (localObject1 != null)
            {
              i = ((r)localObject1).status;
              if ((i != 120) && (i != 122) && (i != 121))
              {
                ((r)localObject1).status = 120;
                ((r)localObject1).eQl = 256;
                com.tencent.mm.modelvideo.o.Nh().b((r)localObject1);
              }
            }
          }
          this.gzH.put(((j)localObject2).field_mediaId, localObject2);
        }
      }
    }
    GMTrace.o(19010733211648L, 141641);
  }
  
  public final boolean isVideoDataAvailable(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(579283714048L, 4316);
    if ((j)this.gzH.get(paramString) == null)
    {
      w.i("MicroMsg.OnlineVideoService", "this media[%s] don't download now.", new Object[] { paramString });
      GMTrace.o(579283714048L, 4316);
      return false;
    }
    g.Gl();
    boolean bool = b.isVideoDataAvailable(paramString, paramInt1, paramInt2);
    w.i("MicroMsg.OnlineVideoService", "is video[%s] data[%d, %d] available[%b]", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
    GMTrace.o(579283714048L, 4316);
    return bool;
  }
  
  public final void onDataAvailable(final String paramString, final int paramInt1, final int paramInt2)
  {
    GMTrace.i(579686367232L, 4319);
    w.i("MicroMsg.OnlineVideoService", "onDataAvailable. offset %d, length %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (bg.nm(paramString))
    {
      GMTrace.o(579686367232L, 4319);
      return;
    }
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(577404665856L, 4302);
        Object localObject = (j)f.this.gzH.get(paramString);
        if (localObject != null)
        {
          if (((j)localObject).gAY != null) {
            ((j)localObject).gAY.onDataAvailable(paramString, paramInt1, paramInt2);
          }
          localObject = new kw();
          ((kw)localObject).eOZ.eHJ = 2;
          ((kw)localObject).eOZ.retCode = 0;
          ((kw)localObject).eOZ.mediaId = paramString;
          ((kw)localObject).eOZ.offset = paramInt1;
          ((kw)localObject).eOZ.length = paramInt2;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
        }
        GMTrace.o(577404665856L, 4302);
      }
    });
    GMTrace.o(579686367232L, 4319);
  }
  
  public final void onDownloadToEnd(final String paramString, final int paramInt1, final int paramInt2)
  {
    GMTrace.i(579820584960L, 4320);
    w.i("MicroMsg.OnlineVideoService", "onDownloadToEnd. offset %d, length %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (bg.nm(paramString))
    {
      GMTrace.o(579820584960L, 4320);
      return;
    }
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(589350043648L, 4391);
        j localj = (j)f.this.gzH.get(paramString);
        if (localj != null)
        {
          if (localj.gAY != null)
          {
            localj.gAY.A(paramString, 0);
            GMTrace.o(589350043648L, 4391);
            return;
          }
          kw localkw = new kw();
          localkw.eOZ.eHJ = 3;
          localkw.eOZ.retCode = 0;
          localkw.eOZ.mediaId = paramString;
          localkw.eOZ.offset = paramInt1;
          localkw.eOZ.length = paramInt2;
          com.tencent.mm.sdk.b.a.vgX.m(localkw);
          if ((paramInt1 == 0) && (paramInt2 >= localj.gAR)) {
            f.a(com.tencent.mm.modelvideo.t.mw(localj.filename), localj.gAR, localj.gAQ);
          }
        }
        GMTrace.o(589350043648L, 4391);
      }
    });
    GMTrace.o(579820584960L, 4320);
  }
  
  public final void onMoovReady(final String paramString, final int paramInt1, final int paramInt2)
  {
    GMTrace.i(579552149504L, 4318);
    w.i("MicroMsg.OnlineVideoService", "onMoovReady mediaId[%s]", new Object[] { paramString });
    if (bg.nm(paramString))
    {
      GMTrace.o(579552149504L, 4318);
      return;
    }
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        boolean bool = false;
        GMTrace.i(581431197696L, 4332);
        j localj = (j)f.this.gzH.get(paramString);
        if (localj != null)
        {
          if (localj.gAY != null)
          {
            localj.gAY.onMoovReady(paramString, paramInt1, paramInt2);
            GMTrace.o(581431197696L, 4332);
            return;
          }
          if (q.mc(localj.field_fullpath))
          {
            w.w("MicroMsg.OnlineVideoService", "it is qt video, need finish all file. isPlayMode" + localj.gAS);
            if (localj.gAS == 1)
            {
              f.e(localj.field_mediaId, 0, localj.field_totalLen);
              com.tencent.mm.plugin.report.service.g.ork.a(354L, 19L, 1L, false);
            }
            GMTrace.o(581431197696L, 4332);
            return;
          }
          Object localObject = new kw();
          ((kw)localObject).eOZ.eHJ = 1;
          ((kw)localObject).eOZ.retCode = 0;
          ((kw)localObject).eOZ.mediaId = paramString;
          ((kw)localObject).eOZ.offset = paramInt1;
          ((kw)localObject).eOZ.length = paramInt2;
          ((kw)localObject).eOZ.ePa = localj.gAP;
          kw.a locala = ((kw)localObject).eOZ;
          if (localj.initialDownloadLength > 0) {
            bool = true;
          }
          locala.ePb = bool;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
          localObject = com.tencent.mm.modelvideo.t.mw(localj.filename);
          if (localObject != null)
          {
            w.i("MicroMsg.OnlineVideoService", "on moov ready info: " + ((r)localObject).getFileName() + " status : " + ((r)localObject).status);
            if (((r)localObject).status == 130)
            {
              GMTrace.o(581431197696L, 4332);
              return;
            }
            if (((r)localObject).status != 122)
            {
              localObject = com.tencent.mm.modelvideo.t.mw(localj.filename);
              if (localObject != null)
              {
                ((r)localObject).status = 121;
                ((r)localObject).eQl = 256;
                com.tencent.mm.modelvideo.o.Nh().b((r)localObject);
              }
              if (localj.gAS == 0)
              {
                w.i("MicroMsg.OnlineVideoService", "stop download video");
                com.tencent.mm.modelvideo.o.Nm().NF();
                com.tencent.mm.modelvideo.o.Nm().run();
              }
            }
          }
        }
        GMTrace.o(581431197696L, 4332);
      }
    });
    GMTrace.o(579552149504L, 4318);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelcdntran\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */