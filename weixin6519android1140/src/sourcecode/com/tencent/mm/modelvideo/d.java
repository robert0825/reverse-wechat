package com.tencent.mm.modelvideo;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.a;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelcdntran.f;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.c.c;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.qf;
import com.tencent.mm.protocal.c.qg;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bc.b;
import com.tencent.mm.y.m;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import junit.framework.Assert;

public final class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public String euR;
  private com.tencent.mm.ad.b fUa;
  public com.tencent.mm.ad.e fUd;
  public String gIp;
  public String gIw;
  public int gIx;
  private i.a gIz;
  public int gsL;
  private aj gsj;
  public boolean haC;
  public boolean haD;
  public r haE;
  public com.tencent.mm.modelcdntran.j haF;
  public int haG;
  private boolean haH;
  public boolean haI;
  public long haJ;
  private String mediaId;
  int retCode;
  private int startOffset;
  public long startTime;
  
  public d(String paramString)
  {
    this(paramString, false);
    GMTrace.i(363058954240L, 2705);
    GMTrace.o(363058954240L, 2705);
  }
  
  public d(String paramString, boolean paramBoolean)
  {
    GMTrace.i(363193171968L, 2706);
    this.haE = null;
    this.gIp = "";
    this.startOffset = 0;
    this.startTime = 0L;
    this.gsL = 0;
    this.retCode = 0;
    this.haG = com.tencent.mm.modelcdntran.b.MediaType_VIDEO;
    this.haH = false;
    this.haI = true;
    this.gIw = null;
    this.gIx = 0;
    this.haJ = 0L;
    this.gIz = new i.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
      {
        GMTrace.i(355408543744L, 2648);
        if (paramAnonymousInt == 44530)
        {
          w.d("MicroMsg.NetSceneDownloadVideo", "%s cdntra  ERR_CNDCOM_MEDIA_IS_DOWNLOADING clientid:%s", new Object[] { d.this.MY(), d.this.gIp });
          GMTrace.o(355408543744L, 2648);
          return 0;
        }
        if (paramAnonymousInt != 0)
        {
          t.mp(d.this.euR);
          com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(2), Long.valueOf(d.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(d.this.haG), Integer.valueOf(d.this.gsL), "" });
          com.tencent.mm.plugin.report.service.g.ork.i(13937, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(2), Long.valueOf(d.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(d.this.haG), Integer.valueOf(d.this.gsL), "" });
          d.this.fUd.a(3, paramAnonymousInt, "", d.this);
          GMTrace.o(355408543744L, 2648);
          return 0;
        }
        d.this.haE = t.mw(d.this.euR);
        if ((d.this.haE == null) || (d.this.haE.status == 113))
        {
          if (d.this.haE == null) {}
          for (int i = -1;; i = d.this.haE.status)
          {
            w.i("MicroMsg.NetSceneDownloadVideo", "%s upload video info is null or has paused, status:%d", new Object[] { d.this.MY(), Integer.valueOf(i) });
            d.this.qt();
            d.this.fUd.a(3, paramAnonymousInt, "upload video info is null or has paused, status" + i, d.this);
            GMTrace.o(355408543744L, 2648);
            return 0;
          }
        }
        if (paramAnonymouskeep_ProgressInfo != null)
        {
          if (paramAnonymouskeep_ProgressInfo.field_finishedLength == d.this.gsL)
          {
            w.d("MicroMsg.NetSceneDownloadVideo", "cdntra ignore progress 100%");
            GMTrace.o(355408543744L, 2648);
            return 0;
          }
          if ((d.this.haE.hcp > paramAnonymouskeep_ProgressInfo.field_finishedLength) && (!d.this.haC))
          {
            w.e("MicroMsg.NetSceneDownloadVideo", "%s cdnEndProc error oldpos:%d newpos:%d", new Object[] { d.this.MY(), Integer.valueOf(d.this.haE.hcp), Integer.valueOf(paramAnonymouskeep_ProgressInfo.field_finishedLength) });
            t.mp(d.this.euR);
            d.this.fUd.a(3, paramAnonymousInt, "", d.this);
            GMTrace.o(355408543744L, 2648);
            return 0;
          }
          paramAnonymousInt = 1024;
          d.this.haE.hct = bg.Pu();
          if (d.this.haE.hcp < paramAnonymouskeep_ProgressInfo.field_finishedLength)
          {
            d.this.haE.hcp = paramAnonymouskeep_ProgressInfo.field_finishedLength;
            paramAnonymousInt = 1040;
          }
          d.this.haE.eQl = paramAnonymousInt;
          t.e(d.this.haE);
          w.d("MicroMsg.NetSceneDownloadVideo", "%s cdntra progresscallback id:%s finish:%d total:%d", new Object[] { d.this.MY(), d.this.gIp, Integer.valueOf(paramAnonymouskeep_ProgressInfo.field_finishedLength), Integer.valueOf(paramAnonymouskeep_ProgressInfo.field_toltalLength) });
          GMTrace.o(355408543744L, 2648);
          return 0;
        }
        if (paramAnonymouskeep_SceneResult != null)
        {
          w.i("MicroMsg.NetSceneDownloadVideo", "%s cdntra sceneResult.retCode:%d useTime:%d ", new Object[] { d.this.MY(), Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), Long.valueOf(bg.Pv() - d.this.haJ) });
          d.this.a(d.this.haF, paramAnonymouskeep_SceneResult);
          if (paramAnonymouskeep_SceneResult.field_retCode == 0) {
            break label1240;
          }
          t.mp(d.this.euR);
          if (d.this.haC) {
            com.tencent.mm.plugin.report.service.g.ork.a(354L, 13L, 1L, false);
          }
          if (d.this.haD) {
            com.tencent.mm.plugin.report.service.g.ork.a(354L, 136L, 1L, false);
          }
          d.this.fUd.a(3, paramAnonymouskeep_SceneResult.field_retCode, "", d.this);
        }
        for (;;)
        {
          com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), Integer.valueOf(2), Long.valueOf(d.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(d.this.haG), Integer.valueOf(d.this.gsL), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", paramAnonymouskeep_SceneResult.report_Part2 });
          if (paramAnonymouskeep_SceneResult.field_retCode != 0) {
            com.tencent.mm.plugin.report.service.g.ork.i(13937, new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), Integer.valueOf(2), Long.valueOf(d.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(d.this.haG), Integer.valueOf(d.this.gsL), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", paramAnonymouskeep_SceneResult.report_Part2 });
          }
          a.a(d.this.haE, 1);
          d.this.haF = null;
          GMTrace.o(355408543744L, 2648);
          return 0;
          label1240:
          if (d.this.haC) {
            com.tencent.mm.plugin.report.service.g.ork.a(354L, 12L, 1L, false);
          }
          if (d.this.haD) {
            com.tencent.mm.plugin.report.service.g.ork.a(354L, 137L, 1L, false);
          }
          d.this.ho(paramAnonymouskeep_SceneResult.field_fileLength);
        }
      }
      
      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
        GMTrace.i(355542761472L, 2649);
        GMTrace.o(355542761472L, 2649);
      }
      
      public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(355676979200L, 2650);
        GMTrace.o(355676979200L, 2650);
        return null;
      }
    };
    this.gsj = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(350039834624L, 2608);
        if (d.this.a(d.this.gtW, d.this.fUd) == -1) {
          d.this.fUd.a(3, -1, "doScene failed", d.this);
        }
        GMTrace.o(350039834624L, 2608);
        return false;
      }
    }, false);
    if (paramString != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      this.euR = paramString;
      this.haC = paramBoolean;
      w.i("MicroMsg.NetSceneDownloadVideo", "%s NetSceneDownloadVideo:  file [%s] isCompleteOnlineVideo [%b]", new Object[] { MY(), paramString, Boolean.valueOf(paramBoolean) });
      GMTrace.o(363193171968L, 2706);
      return;
    }
  }
  
  private boolean MX()
  {
    GMTrace.i(363327389696L, 2707);
    w.d("MicroMsg.NetSceneDownloadVideo", "%s parseVideoMsgXML content: %s", new Object[] { MY(), this.haE.Nt() });
    Object localObject2 = bh.q(this.haE.Nt(), "msg");
    if (localObject2 == null)
    {
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 214L, 1L, false);
      w.w("MicroMsg.NetSceneDownloadVideo", "%s cdntra parse video recv xml failed", new Object[] { MY() });
      GMTrace.o(363327389696L, 2707);
      return false;
    }
    String str = (String)((Map)localObject2).get(".msg.videomsg.$cdnvideourl");
    if (bg.nm(str))
    {
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 213L, 1L, false);
      w.w("MicroMsg.NetSceneDownloadVideo", "%s cdntra parse video recv xml failed", new Object[] { MY() });
      GMTrace.o(363327389696L, 2707);
      return false;
    }
    Object localObject1 = (String)((Map)localObject2).get(".msg.videomsg.$aeskey");
    this.gsL = Integer.valueOf((String)((Map)localObject2).get(".msg.videomsg.$length")).intValue();
    Object localObject4 = (String)((Map)localObject2).get(".msg.videomsg.$fileparam");
    this.gIp = com.tencent.mm.modelcdntran.d.a("downvideo", this.haE.hcs, this.haE.Nq(), this.haE.getFileName());
    if (bg.nm(this.gIp))
    {
      w.w("MicroMsg.NetSceneDownloadVideo", "%s cdntra genClientId failed not use cdn file:%s", new Object[] { MY(), this.haE.getFileName() });
      GMTrace.o(363327389696L, 2707);
      return false;
    }
    localObject2 = (String)((Map)localObject2).get(".msg.videomsg.$md5");
    Object localObject3 = new StringBuilder();
    o.Nh();
    localObject3 = s.mk(this.euR) + ".tmp";
    this.haF = new com.tencent.mm.modelcdntran.j();
    this.haF.filename = this.haE.getFileName();
    this.haF.gAQ = ((String)localObject2);
    this.haF.gAR = this.gsL;
    this.haF.gAS = 0;
    this.haF.eMI = this.haE.Nr();
    this.haF.gAT = this.haE.Nq();
    Object localObject5 = this.haF;
    int i;
    label570:
    label676:
    label713:
    label837:
    int k;
    if (com.tencent.mm.y.s.eb(this.haE.Nq()))
    {
      i = m.fk(this.haE.Nq());
      ((com.tencent.mm.modelcdntran.j)localObject5).eMK = i;
      this.haF.field_mediaId = this.gIp;
      this.haF.field_fullpath = ((String)localObject3);
      this.haF.field_fileType = com.tencent.mm.modelcdntran.b.MediaType_VIDEO;
      this.haF.field_totalLen = this.gsL;
      this.haF.field_aesKey = ((String)localObject1);
      this.haF.field_fileId = str;
      this.haF.field_priority = com.tencent.mm.modelcdntran.b.gzd;
      this.haF.gAB = this.gIz;
      this.haF.field_wxmsgparam = ((String)localObject4);
      localObject1 = this.haF;
      if (!com.tencent.mm.y.s.eb(this.haE.Nq())) {
        break label1545;
      }
      i = 1;
      ((com.tencent.mm.modelcdntran.j)localObject1).field_chattype = i;
      this.haF.gAU = this.haE.gAU;
      localObject4 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().B(this.haE.Nq(), this.haE.eSf);
      this.haF.gAW = ((ce)localObject4).field_createTime;
      this.haF.eSf = ((ce)localObject4).field_msgSvrId;
      localObject1 = bc.gT(((ce)localObject4).fwv);
      localObject5 = this.haF;
      if (localObject1 == null) {
        break label1550;
      }
      i = ((bc.b)localObject1).god;
      ((com.tencent.mm.modelcdntran.j)localObject5).gAX = i;
      if (this.haE.Nq().equals(((ce)localObject4).field_talker))
      {
        localObject5 = this.haF;
        if (localObject1 != null) {
          break label1555;
        }
        i = 0;
        ((com.tencent.mm.modelcdntran.j)localObject5).field_limitrate = i;
      }
      w.d("MicroMsg.NetSceneDownloadVideo", "%s limitrate:%d file:%s", new Object[] { MY(), Integer.valueOf(this.haF.field_limitrate), this.haE.getFileName() });
      if (!com.tencent.mm.modelcdntran.g.Gk().gzL.contains("video_" + this.haE.hcw)) {
        break label1567;
      }
      com.tencent.mm.modelcdntran.g.Gk().gzL.remove("video_" + this.haE.hcw);
      this.haF.field_autostart = true;
      if (3 == this.haE.hcC) {
        this.haF.field_smallVideoFlag = 1;
      }
      if ((bg.nm((String)localObject2)) || (this.haC)) {
        break label1598;
      }
      localObject1 = ((com.tencent.mm.plugin.r.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.r.a.a.class)).yR().cN((String)localObject2, this.gsL);
      j = com.tencent.mm.a.e.aY((String)localObject1);
      k = this.gsL - j;
      o.Nh();
      localObject5 = s.mk(this.euR);
      int m = com.tencent.mm.a.e.aY((String)localObject5);
      if (m > 0)
      {
        w.w("MicroMsg.NetSceneDownloadVideo", "%s already copy dup file, but download again, something error here.", new Object[] { MY() });
        bool = com.tencent.mm.loader.stub.b.deleteFile((String)localObject5);
        localObject1 = ((com.tencent.mm.plugin.r.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.r.a.a.class)).yR();
        int n = this.gsL;
        i = 0;
        if (!bg.nm((String)localObject2)) {
          i = ((at)localObject1).fTZ.delete("MediaDuplication", "md5=? AND size=? AND status!=?", new String[] { localObject2, String.valueOf(n), "100" });
        }
        localObject1 = t.mw(this.euR);
        ((r)localObject1).hcp = 0;
        ((r)localObject1).eQl = 16;
        t.e((r)localObject1);
        w.w("MicroMsg.NetSceneDownloadVideo", "%s don't copy dup file, go to download now. target video len %d, delete file:%b,delete db: %d", new Object[] { MY(), Integer.valueOf(m), Boolean.valueOf(bool), Integer.valueOf(i) });
        localObject1 = "";
      }
      w.i("MicroMsg.NetSceneDownloadVideo", "%s MediaCheckDuplicationStorage: totallen:%s md5:%s  dup(len:%d path:%s) diffLen:%d to:%s target video len %d", new Object[] { MY(), Integer.valueOf(this.gsL), localObject2, Integer.valueOf(j), localObject1, Integer.valueOf(k), localObject3, Integer.valueOf(m) });
      if (bg.nm((String)localObject1)) {
        break label1584;
      }
      if ((k < 0) || (k > 16)) {
        break label1598;
      }
      w.i("MicroMsg.NetSceneDownloadVideo", "%s MediaCheckDuplicationStorage copy dup file now :%s -> %s", new Object[] { MY(), localObject1, localObject3 });
      com.tencent.mm.sdk.platformtools.j.eR((String)localObject1, (String)localObject3);
      ho(this.gsL);
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(new c.c(((ce)localObject4).field_talker, "update", (au)localObject4));
      localObject1 = com.tencent.mm.plugin.report.service.g.ork;
      long l1 = this.haE.eSf;
      long l2 = this.haE.hcs;
      localObject3 = this.haE.Nq();
      if (3 == this.haE.hcC) {
        break label1578;
      }
      i = 43;
      label1320:
      ((com.tencent.mm.plugin.report.service.g)localObject1).i(13267, new Object[] { str, Long.valueOf(l1), localObject2, Long.valueOf(l2), localObject3, Integer.valueOf(i), Integer.valueOf(j) });
      i = 1;
      label1381:
      if (i != 0) {
        break label1630;
      }
      this.mediaId = this.haF.field_mediaId;
      this.haJ = bg.Pv();
      if (this.haE.videoFormat != 2) {
        break label1603;
      }
    }
    label1545:
    label1550:
    label1555:
    label1567:
    label1578:
    label1584:
    label1598:
    label1603:
    for (boolean bool = true;; bool = false)
    {
      this.haD = bool;
      w.i("MicroMsg.NetSceneDownloadVideo", "%s check use cdn isHadHevcLocalFile[%b] isCompleteOnlineVideo[%b]", new Object[] { MY(), Boolean.valueOf(this.haD), Boolean.valueOf(this.haC) });
      if ((!this.haD) && (this.haC)) {
        break label1852;
      }
      if (com.tencent.mm.modelcdntran.g.Gk().b(this.haF, -1)) {
        break label1609;
      }
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 212L, 1L, false);
      w.e("MicroMsg.NetSceneDownloadVideo", "%s cdntra addSendTask failed.", new Object[] { MY() });
      this.gIp = "";
      GMTrace.o(363327389696L, 2707);
      return false;
      i = 0;
      break;
      i = 0;
      break label570;
      i = 0;
      break label676;
      i = ((bc.b)localObject1).gob / 8;
      break label713;
      this.haF.field_autostart = false;
      break label837;
      i = 62;
      break label1320;
      this.gIw = ((String)localObject2);
      this.gIx = this.gsL;
      i = 0;
      break label1381;
    }
    label1609:
    if (this.haD) {
      com.tencent.mm.plugin.report.service.g.ork.a(354L, 135L, 1L, false);
    }
    label1630:
    if (this.haE.hcA != 1)
    {
      this.haE.hcA = 1;
      this.haE.eQl = 524288;
      t.e(this.haE);
    }
    if (3 != this.haE.hcC)
    {
      localObject1 = this.haE.Nq();
      if (!bg.nm((String)localObject1)) {
        if (!com.tencent.mm.y.s.eb((String)localObject1)) {
          break label1996;
        }
      }
    }
    label1852:
    label1996:
    for (int j = m.fk((String)localObject1);; j = 0) {
      for (;;)
      {
        try
        {
          localObject2 = ((ConnectivityManager)com.tencent.mm.sdk.platformtools.ab.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
          i = ((NetworkInfo)localObject2).getSubtype();
          k = ((NetworkInfo)localObject2).getType();
          if (k != 1) {
            continue;
          }
          i = 1;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.NetSceneDownloadVideo", "getNetType : %s", new Object[] { bg.f(localException) });
          i = 0;
          continue;
        }
        localObject1 = (String)localObject1 + "," + j + "," + str + "," + this.gsL + "," + i;
        w.i("MicroMsg.NetSceneDownloadVideo", "%s dk12024 report:%s", new Object[] { MY(), localObject1 });
        com.tencent.mm.plugin.report.service.g.ork.A(12024, (String)localObject1);
        GMTrace.o(363327389696L, 2707);
        return true;
        this.haI = false;
        localObject1 = this.haF;
        o.Nh();
        ((com.tencent.mm.modelcdntran.j)localObject1).field_fullpath = s.mk(this.euR);
        o.Ni().a(this.haF, false);
        break;
        if ((i == 13) || (i == 15) || (i == 14)) {
          i = 4;
        } else if ((i == 3) || (i == 4) || (i == 5) || (i == 6) || (i == 12)) {
          i = 3;
        } else if ((i == 1) || (i == 2)) {
          i = 2;
        } else {
          i = 0;
        }
      }
    }
  }
  
  public final boolean DF()
  {
    GMTrace.i(363998478336L, 2712);
    boolean bool = super.DF();
    if (bool) {
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 210L, 1L, false);
    }
    GMTrace.o(363998478336L, 2712);
    return bool;
  }
  
  public final String MY()
  {
    GMTrace.i(20975949185024L, 156283);
    String str = this.euR + "_" + hashCode();
    GMTrace.o(20975949185024L, 156283);
    return str;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    int i = 1;
    GMTrace.i(363595825152L, 2709);
    this.fUd = parame1;
    this.haE = t.mw(this.euR);
    if (this.haE == null)
    {
      w.e("MicroMsg.NetSceneDownloadVideo", "ERR: Get INFO FAILED :" + this.euR);
      this.retCode = (0 - com.tencent.mm.compatible.util.g.tA() - 10000);
      GMTrace.o(363595825152L, 2709);
      return -1;
    }
    if ((this.haE != null) && (3 == this.haE.hcC)) {
      this.haG = com.tencent.mm.modelcdntran.b.MediaType_TinyVideo;
    }
    if (this.startTime == 0L)
    {
      this.startTime = bg.Pv();
      this.startOffset = this.haE.hcp;
    }
    if (MX())
    {
      w.d("MicroMsg.NetSceneDownloadVideo", "cdntra use cdn return -1 for onGYNetEnd clientid:%s", new Object[] { this.euR });
      GMTrace.o(363595825152L, 2709);
      return 0;
    }
    if (this.haE.status != 112)
    {
      w.e("MicroMsg.NetSceneDownloadVideo", "ERR: STATUS: " + this.haE.status + " [" + this.euR + "," + this.haE.eSf + "," + this.haE.Nr() + "," + this.haE.Nq() + "]");
      this.retCode = (0 - com.tencent.mm.compatible.util.g.tA() - 10000);
      GMTrace.o(363595825152L, 2709);
      return -1;
    }
    w.d("MicroMsg.NetSceneDownloadVideo", "start doScene  [" + this.euR + "," + this.haE.eSf + "," + this.haE.Nr() + "," + this.haE.Nq() + "]  filesize:" + this.haE.hcp + " file:" + this.haE.gsL + " netTimes:" + this.haE.hcx);
    if (!t.mo(this.euR))
    {
      w.e("MicroMsg.NetSceneDownloadVideo", "ERR: NET TIMES: " + this.haE.hcx + " [" + this.euR + "," + this.haE.eSf + "," + this.haE.Nr() + "," + this.haE.Nq() + "] ");
      t.mp(this.euR);
      this.retCode = (0 - com.tencent.mm.compatible.util.g.tA() - 10000);
      GMTrace.o(363595825152L, 2709);
      return -1;
    }
    if (this.haE.eSf <= 0L)
    {
      w.e("MicroMsg.NetSceneDownloadVideo", "ERR: MSGSVRID: " + this.haE.eSf + " [" + this.euR + "," + this.haE.eSf + "," + this.haE.Nr() + "," + this.haE.Nq() + "] ");
      t.mp(this.euR);
      this.retCode = (0 - com.tencent.mm.compatible.util.g.tA() - 10000);
      GMTrace.o(363595825152L, 2709);
      return -1;
    }
    if ((this.haE.hcp < 0) || (this.haE.gsL <= this.haE.hcp) || (this.haE.gsL <= 0))
    {
      w.e("MicroMsg.NetSceneDownloadVideo", "ERR: fileSize:" + this.haE.hcp + " total:" + this.haE.gsL + " [" + this.euR + "," + this.haE.eSf + "," + this.haE.Nr() + "," + this.haE.Nq() + "] ");
      t.mp(this.euR);
      this.retCode = (0 - com.tencent.mm.compatible.util.g.tA() - 10000);
      GMTrace.o(363595825152L, 2709);
      return -1;
    }
    parame1 = new b.a();
    parame1.gtF = new qf();
    parame1.gtG = new qg();
    parame1.uri = "/cgi-bin/micromsg-bin/downloadvideo";
    parame1.gtE = 150;
    parame1.gtH = 40;
    parame1.gtI = 1000000040;
    this.fUa = parame1.DA();
    parame1 = (qf)this.fUa.gtC.gtK;
    parame1.tQd = this.haE.eSf;
    parame1.tRD = this.haE.hcp;
    parame1.tRC = this.haE.gsL;
    if (com.tencent.mm.network.ab.bv(com.tencent.mm.sdk.platformtools.ab.getContext())) {}
    for (;;)
    {
      parame1.ugj = i;
      i = a(parame, this.fUa, this);
      GMTrace.o(363595825152L, 2709);
      return i;
      i = 2;
    }
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(363730042880L, 2710);
    paramq = (qf)((com.tencent.mm.ad.b)paramq).gtC.gtK;
    if ((paramq.tQd <= 0L) || (paramq.tRD < 0) || (paramq.tRC <= 0) || (paramq.tRC <= paramq.tRD))
    {
      w.e("MicroMsg.NetSceneDownloadVideo", "ERR: SECURITY CHECK FAILED [" + this.euR + "," + this.haE.eSf + "," + this.haE.Nr() + "," + this.haE.Nq() + "] ");
      t.mp(this.euR);
      i = k.b.gun;
      GMTrace.o(363730042880L, 2710);
      return i;
    }
    int i = k.b.gum;
    GMTrace.o(363730042880L, 2710);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(364266913792L, 2714);
    if (this.haH)
    {
      w.d("MicroMsg.NetSceneDownloadVideo", "onGYNetEnd Call Stop by Service  [" + this.euR + "," + this.haE.eSf + "," + this.haE.Nr() + "," + this.haE.Nq() + "] ");
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(364266913792L, 2714);
      return;
    }
    if ((paramInt2 == 3) && (paramInt3 == -1) && (!bg.nm(this.gIp)))
    {
      w.w("MicroMsg.NetSceneDownloadVideo", "cdntra using cdn trans,  wait cdn service callback! clientid:%s", new Object[] { this.gIp });
      GMTrace.o(364266913792L, 2714);
      return;
    }
    paramArrayOfByte = (qg)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    paramq = (qf)((com.tencent.mm.ad.b)paramq).gtC.gtK;
    this.haE = t.mw(this.euR);
    if (this.haE == null)
    {
      w.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd Get INFO FAILED :" + this.euR);
      this.retCode = (0 - com.tencent.mm.compatible.util.g.tA() - 10000);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(364266913792L, 2714);
      return;
    }
    if (this.haE.status == 113)
    {
      w.w("MicroMsg.NetSceneDownloadVideo", "onGYNetEnd STATUS PAUSE [" + this.euR + "," + this.haE.eSf + "," + this.haE.Nr() + "," + this.haE.Nq() + "] ");
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(364266913792L, 2714);
      return;
    }
    if (this.haE.status != 112)
    {
      w.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd STATUS ERR: status:" + this.haE.status + " [" + this.euR + "," + this.haE.eSf + "," + this.haE.Nr() + "," + this.haE.Nq() + "] ");
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(364266913792L, 2714);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 != 0))
    {
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 208L, 1L, false);
      w.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd SERVER FAILED errtype:" + paramInt2 + " errCode:" + paramInt3 + " [" + this.euR + "," + this.haE.eSf + "," + this.haE.Nr() + "," + this.haE.Nq() + "] ");
      t.mp(this.euR);
      com.tencent.mm.plugin.report.service.g.ork.i(10420, new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(2), Long.valueOf(this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(this.haG), Integer.valueOf(this.gsL - this.startOffset) });
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(364266913792L, 2714);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 207L, 1L, false);
      w.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd SERVER FAILED (SET PAUSE) errtype:" + paramInt2 + " errCode:" + paramInt3 + " [" + this.euR + "," + this.haE.eSf + "," + this.haE.Nr() + "," + this.haE.Nq() + "] ");
      this.haE.status = 113;
      t.e(this.haE);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(364266913792L, 2714);
      return;
    }
    if (bg.bq(paramArrayOfByte.ues.uNP.tJp))
    {
      w.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd Recv BUF ZERO length  [" + this.euR + "," + this.haE.eSf + "," + this.haE.Nr() + "," + this.haE.Nq() + "] ");
      t.mp(this.euR);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(364266913792L, 2714);
      return;
    }
    if (paramArrayOfByte.tRD != paramq.tRD)
    {
      w.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd OFFSET ERROR respStartPos:" + paramArrayOfByte.tRD + " reqStartPos:" + paramq.tRD + " [" + this.euR + "," + this.haE.eSf + "," + this.haE.Nr() + "," + this.haE.Nq() + "] ");
      t.mp(this.euR);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(364266913792L, 2714);
      return;
    }
    if (paramArrayOfByte.tRC != paramq.tRC)
    {
      w.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd respTotal:" + paramArrayOfByte.tRC + " reqTotal:" + paramq.tRC + " [" + this.euR + "," + this.haE.eSf + "," + this.haE.Nr() + "," + this.haE.Nq() + "] ");
      t.mp(this.euR);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(364266913792L, 2714);
      return;
    }
    if (paramq.tRC < paramArrayOfByte.tRD)
    {
      w.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd respTotal:" + paramArrayOfByte.tRC + " respStartPos:" + paramq.tRD + " [" + this.euR + "," + this.haE.eSf + "," + this.haE.Nr() + "," + this.haE.Nq() + "] ");
      t.mp(this.euR);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(364266913792L, 2714);
      return;
    }
    if (paramArrayOfByte.tQd != paramq.tQd)
    {
      w.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd respMsgId:" + paramArrayOfByte.tQd + " reqMsgId:" + paramq.tQd + " [" + this.euR + "," + this.haE.eSf + "," + this.haE.Nr() + "," + this.haE.Nq() + "] ");
      t.mp(this.euR);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(364266913792L, 2714);
      return;
    }
    w.d("MicroMsg.NetSceneDownloadVideo", "onGYNetEnd respBuf:" + paramArrayOfByte.ues.uNN + " reqStartPos:" + paramq.tRD + " totallen:" + paramq.tRC + " [" + this.euR + "," + this.haE.eSf + "," + this.haE.Nr() + "," + this.haE.Nq() + "] ");
    o.Nh();
    int j = s.a(s.mk(this.euR), paramq.tRD, paramArrayOfByte.ues.uNP.toByteArray());
    if (j < 0)
    {
      w.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd WRITEFILE RET:" + j + " [" + this.euR + "," + this.haE.eSf + "," + this.haE.Nr() + "," + this.haE.Nq() + "] ");
      t.mp(this.euR);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(364266913792L, 2714);
      return;
    }
    if (j > this.haE.gsL)
    {
      w.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd WRITEFILE newOffset:" + j + " totalLen:" + this.haE.gsL + " [" + this.euR + "," + this.haE.eSf + "," + this.haE.Nr() + "," + this.haE.Nq() + "] ");
      t.mp(this.euR);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(364266913792L, 2714);
      return;
    }
    paramq = this.euR;
    paramArrayOfByte = t.mw(paramq);
    if (paramArrayOfByte == null)
    {
      w.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.tC() + " getinfo failed: " + paramq);
      paramInt1 = 0 - com.tencent.mm.compatible.util.g.tA();
    }
    while (paramInt1 < 0)
    {
      w.e("MicroMsg.NetSceneDownloadVideo", "ERR: onGYNetEnd updateAfterRecv Ret:" + paramInt1 + " newOffset :" + j + " [" + this.euR + "," + this.haE.eSf + "," + this.haE.Nr() + "," + this.haE.Nq() + "] ");
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(364266913792L, 2714);
      return;
      paramArrayOfByte.hcp = j;
      paramArrayOfByte.hct = bg.Pu();
      paramArrayOfByte.eQl = 1040;
      int i = 0;
      paramInt1 = i;
      if (paramArrayOfByte.gsL > 0)
      {
        paramInt1 = i;
        if (j >= paramArrayOfByte.gsL)
        {
          t.d(paramArrayOfByte);
          paramArrayOfByte.status = 199;
          paramArrayOfByte.eQl |= 0x100;
          w.i("MicroMsg.VideoLogic", "END!!!  updateRecv  file:" + paramq + " newsize:" + j + " total:" + paramArrayOfByte.gsL + " status:" + paramArrayOfByte.status + " netTimes:" + paramArrayOfByte.hcx);
          paramInt1 = 1;
        }
      }
      w.d("MicroMsg.VideoLogic", "updateRecv " + com.tencent.mm.compatible.util.g.tC() + " file:" + paramq + " newsize:" + j + " total:" + paramArrayOfByte.gsL + " status:" + paramArrayOfByte.status);
      if (!t.e(paramArrayOfByte)) {
        paramInt1 = 0 - com.tencent.mm.compatible.util.g.tA();
      }
    }
    if (paramInt1 == 1)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(10420, new Object[] { Integer.valueOf(0), Integer.valueOf(2), Long.valueOf(this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(this.haG), Integer.valueOf(this.gsL - this.startOffset) });
      a.a(this.haE, 1);
      w.i("MicroMsg.NetSceneDownloadVideo", "!!!FIN [" + this.euR + "," + this.haE.eSf + "," + this.haE.Nr() + "," + this.haE.Nq() + "]");
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(364266913792L, 2714);
      return;
    }
    if (this.haH)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(364266913792L, 2714);
      return;
    }
    this.gsj.z(0L, 0L);
    GMTrace.o(364266913792L, 2714);
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(364132696064L, 2713);
    com.tencent.mm.plugin.report.service.g.ork.a(111L, 211L, 1L, false);
    t.mp(this.euR);
    GMTrace.o(364132696064L, 2713);
  }
  
  public final void a(com.tencent.mm.modelcdntran.j paramj, keep_SceneResult paramkeep_SceneResult)
  {
    GMTrace.i(16008819507200L, 119275);
    if ((paramj == null) || (paramkeep_SceneResult == null))
    {
      w.w("MicroMsg.NetSceneDownloadVideo", "it had not task info or scene Result, don't report.");
      GMTrace.o(16008819507200L, 119275);
      return;
    }
    if (paramj.field_smallVideoFlag == 1)
    {
      w.i("MicroMsg.NetSceneDownloadVideo", "it download short video, don't report.");
      GMTrace.o(16008819507200L, 119275);
      return;
    }
    if ((paramj != null) && (paramkeep_SceneResult != null))
    {
      w.i("MicroMsg.NetSceneDownloadVideo", "%s sceneResult.field_recvedBytes %d, time [%d, %d]", new Object[] { MY(), Integer.valueOf(paramkeep_SceneResult.field_recvedBytes), Long.valueOf(paramkeep_SceneResult.field_startTime), Long.valueOf(paramkeep_SceneResult.field_endTime) });
      o.Ni();
      f.a(null, paramkeep_SceneResult, paramj, true);
    }
    GMTrace.o(16008819507200L, 119275);
  }
  
  protected final void cancel()
  {
    GMTrace.i(20975814967296L, 156282);
    qt();
    super.cancel();
    GMTrace.o(20975814967296L, 156282);
  }
  
  public final int getType()
  {
    GMTrace.i(364401131520L, 2715);
    GMTrace.o(364401131520L, 2715);
    return 150;
  }
  
  public final void ho(final int paramInt)
  {
    GMTrace.i(363461607424L, 2708);
    Object localObject;
    if (this.haI)
    {
      localObject = new StringBuilder();
      o.Nh();
      localObject = new File(s.mk(this.euR) + ".tmp");
      o.Nh();
    }
    for (final boolean bool = ((File)localObject).renameTo(new File(s.mk(this.euR)));; bool = true)
    {
      com.tencent.mm.kernel.h.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(337826021376L, 2517);
          Object localObject1 = bh.q(d.this.haE.Nt(), "msg");
          Object localObject2;
          if (localObject1 != null)
          {
            localObject2 = o.Nh();
            o.Nh();
            ((s)localObject2).o(s.mk(d.this.euR), (String)((Map)localObject1).get(".msg.videomsg.$cdnvideourl"), (String)((Map)localObject1).get(".msg.videomsg.$aeskey"));
          }
          boolean bool1 = false;
          if (bool)
          {
            boolean bool2 = t.N(d.this.euR, paramInt);
            bool1 = bool2;
            if (d.this.haD)
            {
              localObject1 = t.mw(d.this.euR);
              bool1 = bool2;
              if (localObject1 != null)
              {
                ((r)localObject1).videoFormat = 1;
                ((r)localObject1).eQl = 2;
                o.Nh().b((r)localObject1);
                bool1 = bool2;
              }
            }
            w.i("MicroMsg.NetSceneDownloadVideo", "%s ashutest::cdntra !FIN! file:%s svrid:%d human:%s user:%s updatedbsucc:%b  MediaCheckDuplicationStorage MD5:%s SIZE:%d renameFlag %b needRename %b", new Object[] { d.this.MY(), d.this.euR, Long.valueOf(d.this.haE.eSf), d.this.haE.Nr(), d.this.haE.Nq(), Boolean.valueOf(bool1), d.this.gIw, Integer.valueOf(d.this.gIx), Boolean.valueOf(bool), Boolean.valueOf(d.this.haI) });
            if ((!bg.nm(d.this.gIw)) && (d.this.gIx > 0))
            {
              localObject1 = ((com.tencent.mm.plugin.r.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.r.a.a.class)).yR();
              localObject2 = d.this.gIw;
              int i = d.this.gIx;
              o.Nh();
              ((at)localObject1).u((String)localObject2, i, s.mk(d.this.euR));
            }
            if (d.this.haE.hcC != 3) {
              break label575;
            }
            com.tencent.mm.plugin.report.service.g.ork.a(198L, 38L, d.this.haE.gsL, false);
            com.tencent.mm.plugin.report.service.g.ork.a(198L, 40L, d.this.haE.hcv, false);
            com.tencent.mm.plugin.report.service.g.ork.a(198L, 41L, 1L, false);
            localObject1 = com.tencent.mm.plugin.report.service.g.ork;
            if (!com.tencent.mm.y.s.eb(d.this.haE.Nq())) {
              break label567;
            }
          }
          label567:
          for (long l = 43L;; l = 42L)
          {
            ((com.tencent.mm.plugin.report.service.g)localObject1).a(198L, l, 1L, false);
            d.this.fUd.a(0, 0, "", d.this);
            GMTrace.o(337826021376L, 2517);
            return;
            if (d.this.haD)
            {
              t.mp(d.this.euR);
              com.tencent.mm.plugin.report.service.g.ork.a(354L, 138L, 1L, false);
              break;
            }
            bool1 = t.N(d.this.euR, paramInt);
            break;
          }
          label575:
          com.tencent.mm.plugin.report.service.g.ork.a(198L, 31L, d.this.haE.gsL, false);
          com.tencent.mm.plugin.report.service.g.ork.a(198L, 33L, d.this.haE.hcv, false);
          com.tencent.mm.plugin.report.service.g.ork.a(198L, 34L, 1L, false);
          localObject1 = com.tencent.mm.plugin.report.service.g.ork;
          if (com.tencent.mm.y.s.eb(d.this.haE.Nq())) {}
          for (l = 36L;; l = 35L)
          {
            ((com.tencent.mm.plugin.report.service.g)localObject1).a(198L, l, 1L, false);
            break;
          }
        }
      });
      GMTrace.o(363461607424L, 2708);
      return;
      localObject = new StringBuilder();
      o.Nh();
      com.tencent.mm.loader.stub.b.deleteFile(s.mk(this.euR) + ".tmp");
    }
  }
  
  public final boolean qt()
  {
    boolean bool = false;
    GMTrace.i(362924736512L, 2704);
    if (!bg.nm(this.mediaId))
    {
      if (!this.haC) {
        break label77;
      }
      w.i("MicroMsg.NetSceneDownloadVideo", "%s cancel online video task.", new Object[] { MY() });
      o.Ni().b(this.mediaId, null);
    }
    for (;;)
    {
      bool = true;
      this.haH = true;
      GMTrace.o(362924736512L, 2704);
      return bool;
      label77:
      w.i("MicroMsg.NetSceneDownloadVideo", "%s cancel offline video task.", new Object[] { MY() });
      com.tencent.mm.modelcdntran.g.Gk().jz(this.mediaId);
    }
  }
  
  protected final int vB()
  {
    GMTrace.i(363864260608L, 2711);
    GMTrace.o(363864260608L, 2711);
    return 2500;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvideo\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */