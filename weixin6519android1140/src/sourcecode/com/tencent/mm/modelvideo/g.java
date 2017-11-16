package com.tencent.mm.modelvideo;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.a;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.protocal.c.anf;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bhr;
import com.tencent.mm.protocal.c.bmi;
import com.tencent.mm.protocal.c.bmj;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.be;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import java.util.Vector;
import junit.framework.Assert;

public final class g
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private static int haZ;
  private final int MAX_TIMES;
  private String eTZ;
  public String euR;
  private com.tencent.mm.ad.b fUa;
  public com.tencent.mm.ad.e fUd;
  public boolean gIH;
  public String gIp;
  private i.a gIz;
  g.a gMa;
  aj gsj;
  public r haE;
  public int haG;
  private boolean haH;
  private final long hba;
  boolean hbb;
  private int hbc;
  public boolean hbd;
  public boolean hbe;
  public int hbf;
  private int hbg;
  int hbh;
  public int retCode;
  public long startTime;
  
  static
  {
    GMTrace.i(337557585920L, 2515);
    haZ = 32000;
    GMTrace.o(337557585920L, 2515);
  }
  
  public g(String paramString)
  {
    GMTrace.i(334202142720L, 2490);
    this.eTZ = "";
    this.hba = 1800000L;
    this.retCode = 0;
    this.haH = false;
    this.hbb = false;
    this.gMa = null;
    this.gIH = true;
    this.gIp = "";
    this.startTime = 0L;
    this.hbc = -1;
    this.haG = com.tencent.mm.modelcdntran.b.MediaType_VIDEO;
    this.hbd = false;
    this.hbe = false;
    this.hbf = 0;
    this.hbg = 0;
    this.gIz = new i.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, final keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
      {
        GMTrace.i(332457312256L, 2477);
        w.d("MicroMsg.NetSceneUploadVideo", "%s cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { g.this.MY(), g.this.gIp, Integer.valueOf(paramAnonymousInt), paramAnonymouskeep_ProgressInfo, paramAnonymouskeep_SceneResult });
        if (paramAnonymousInt == 44531)
        {
          w.d("MicroMsg.NetSceneUploadVideo", "cdntra  ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", new Object[] { g.this.gIp });
          GMTrace.o(332457312256L, 2477);
          return 0;
        }
        if (paramAnonymousInt != 0)
        {
          t.mp(g.this.euR);
          com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(1), Long.valueOf(g.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(g.this.haG), Integer.valueOf(0), "" });
          g.this.fUd.a(3, paramAnonymousInt, "", g.this);
          GMTrace.o(332457312256L, 2477);
          return 0;
        }
        g.this.haE = t.mw(g.this.euR);
        int i;
        if ((g.this.haE == null) || (g.this.haE.status == 105))
        {
          if (g.this.haE == null) {}
          for (i = -1;; i = g.this.haE.status)
          {
            w.i("MicroMsg.NetSceneUploadVideo", "%s info is null or has paused, status:%d", new Object[] { g.this.MY(), Integer.valueOf(i) });
            com.tencent.mm.modelcdntran.g.Gk().jy(g.this.gIp);
            g.this.fUd.a(3, paramAnonymousInt, "info is null or has paused, status" + i, g.this);
            GMTrace.o(332457312256L, 2477);
            return 0;
          }
        }
        if (paramAnonymouskeep_ProgressInfo != null)
        {
          if (g.this.haE.hbc > paramAnonymouskeep_ProgressInfo.field_finishedLength)
          {
            w.w("MicroMsg.NetSceneUploadVideo", "%s cdntra cdnEndProc error oldpos:%d newpos:%d", new Object[] { g.this.MY(), Integer.valueOf(g.this.haE.hbc), Integer.valueOf(paramAnonymouskeep_ProgressInfo.field_finishedLength) });
            GMTrace.o(332457312256L, 2477);
            return 0;
          }
          g.this.haE.hct = bg.Pu();
          g.this.haE.hbc = paramAnonymouskeep_ProgressInfo.field_finishedLength;
          g.this.haE.eQl = 1032;
          t.e(g.this.haE);
          GMTrace.o(332457312256L, 2477);
          return 0;
        }
        if (paramAnonymouskeep_SceneResult != null)
        {
          if (paramAnonymouskeep_SceneResult.field_retCode != 0)
          {
            w.e("MicroMsg.NetSceneUploadVideo", "%s cdntra sceneResult.retCode :%d arg[%s] info[%s]", new Object[] { g.this.MY(), Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), paramAnonymouskeep_SceneResult.field_arg, paramAnonymouskeep_SceneResult.field_transInfo });
            t.mp(g.this.euR);
            com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), Integer.valueOf(1), Long.valueOf(g.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(g.this.haG), Integer.valueOf(paramAnonymouskeep_SceneResult.field_fileLength), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", paramAnonymouskeep_SceneResult.report_Part2 });
            com.tencent.mm.plugin.report.service.g.ork.i(13937, new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), Integer.valueOf(1), Long.valueOf(g.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(g.this.haG), Integer.valueOf(paramAnonymouskeep_SceneResult.field_fileLength), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", paramAnonymouskeep_SceneResult.report_Part2 });
            g.this.fUd.a(3, paramAnonymouskeep_SceneResult.field_retCode, "", g.this);
          }
        }
        else
        {
          GMTrace.o(332457312256L, 2477);
          return 0;
        }
        w.i("MicroMsg.NetSceneUploadVideo", "%s summersafecdn uploadvideo by cdn, videohash isHitCacheUpload: %d, enableHitcheck:%b", new Object[] { g.this.MY(), Integer.valueOf(paramAnonymouskeep_SceneResult.field_UploadHitCacheType), Boolean.valueOf(g.this.gIH) });
        paramAnonymousString = com.tencent.mm.plugin.report.service.g.ork;
        if (g.this.hbe)
        {
          paramAnonymousInt = 810;
          label1002:
          paramAnonymousString.i(12696, new Object[] { Integer.valueOf(paramAnonymousInt + paramAnonymouskeep_SceneResult.field_UploadHitCacheType), Integer.valueOf(g.this.haE.gsL) });
          paramAnonymousBoolean = paramAnonymouskeep_SceneResult.field_isVideoReduced;
          w.i("MicroMsg.NetSceneUploadVideo", "%s it video was reduced by cdn %b %s", new Object[] { g.this.MY(), Boolean.valueOf(paramAnonymousBoolean), g.this.euR });
          if (paramAnonymousBoolean) {
            break label1759;
          }
          com.tencent.mm.plugin.report.service.g.ork.a(106L, 205L, 1L, false);
          if ((g.this.hbf > 0) && (paramAnonymouskeep_SceneResult.field_thumbimgLength > 0))
          {
            w.i("MicroMsg.NetSceneUploadVideo", "%s send video thumb too big thumb length [%d, %d] ", new Object[] { g.this.MY(), Integer.valueOf(g.this.hbf), Integer.valueOf(paramAnonymouskeep_SceneResult.field_thumbimgLength) });
            if (g.this.hbf * 2 <= paramAnonymouskeep_SceneResult.field_thumbimgLength) {
              break label1725;
            }
            com.tencent.mm.plugin.report.service.g.ork.a(106L, 206L, 1L, false);
          }
          label1201:
          o.Nh();
          paramAnonymousInt = com.tencent.mm.a.e.aY(s.mk(g.this.euR));
          w.i("MicroMsg.NetSceneUploadVideo", "%s send video too big thumb length [%d, %d] ", new Object[] { g.this.MY(), Integer.valueOf(g.this.haE.gsL), Integer.valueOf(paramAnonymousInt) });
          if (g.this.haE.gsL == paramAnonymousInt) {
            break label1742;
          }
          com.tencent.mm.plugin.report.service.g.ork.a(106L, 208L, 1L, false);
          label1292:
          g.this.haE = t.mw(g.this.euR);
          if (bg.nm(g.this.haE.Nt()))
          {
            paramAnonymousString = "<msg><videomsg aeskey=\"" + paramAnonymouskeep_SceneResult.field_aesKey + "\" cdnthumbaeskey=\"" + paramAnonymouskeep_SceneResult.field_aesKey + "\" cdnvideourl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" ";
            paramAnonymousString = paramAnonymousString + "cdnthumburl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" ";
            paramAnonymousString = paramAnonymousString + "length=\"" + paramAnonymouskeep_SceneResult.field_fileLength + "\" ";
            paramAnonymousString = paramAnonymousString + "cdnthumblength=\"" + paramAnonymouskeep_SceneResult.field_thumbimgLength + "\"/></msg>";
            w.i("MicroMsg.NetSceneUploadVideo", "%s cdn callback new build cdnInfo:%s", new Object[] { g.this.MY(), paramAnonymousString });
            g.this.haE.hcB = paramAnonymousString;
            t.e(g.this.haE);
          }
          paramAnonymousString = bh.q(g.this.haE.Nt(), "msg");
          if (paramAnonymousString != null)
          {
            paramAnonymouskeep_ProgressInfo = o.Nh();
            o.Nh();
            boolean bool = paramAnonymouskeep_ProgressInfo.o(s.mk(g.this.euR), (String)paramAnonymousString.get(".msg.videomsg.$cdnvideourl"), (String)paramAnonymousString.get(".msg.videomsg.$aeskey"));
            paramAnonymousString = com.tencent.mm.plugin.report.service.g.ork;
            if (!bool) {
              break label1776;
            }
            paramAnonymousInt = 1;
            label1614:
            paramAnonymousString.i(12696, new Object[] { Integer.valueOf(paramAnonymousInt + 900), Integer.valueOf(g.this.haE.gsL) });
          }
          paramAnonymousString = com.tencent.mm.kernel.h.wS();
          paramAnonymouskeep_ProgressInfo = g.this.euR;
          if (!paramAnonymousBoolean) {
            break label1781;
          }
          paramAnonymousInt = 0;
        }
        for (;;)
        {
          paramAnonymousString.a(new h(paramAnonymouskeep_ProgressInfo, paramAnonymousInt, paramAnonymouskeep_SceneResult, new h.a()
          {
            public final void bb(int paramAnonymous2Int1, int paramAnonymous2Int2)
            {
              GMTrace.i(354737455104L, 2643);
              if ((paramAnonymous2Int1 == 4) && (paramAnonymous2Int2 == 102))
              {
                com.tencent.mm.kernel.h.xB().A(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(326014861312L, 2429);
                    g.this.gIH = false;
                    g.this.haE.status = 104;
                    g.this.haE.hcs = bg.Pu();
                    g.this.haE.hct = bg.Pu();
                    g.this.haE.hbc = 0;
                    g.this.haE.eQl = 1800;
                    boolean bool = t.e(g.this.haE);
                    w.i("MicroMsg.NetSceneUploadVideo", "%s summersafecdn MM_ERR_GET_AESKEY_FAILED doScene again enableHitcheck[%b], ret[%b] new createtime:%d", new Object[] { g.this.MY(), Boolean.valueOf(g.this.gIH), Boolean.valueOf(bool), Long.valueOf(g.this.haE.hcs) });
                    g.this.a(g.a(g.this), g.this.fUd);
                    GMTrace.o(326014861312L, 2429);
                  }
                });
                GMTrace.o(354737455104L, 2643);
                return;
              }
              com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(paramAnonymous2Int2), Integer.valueOf(1), Long.valueOf(g.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(g.this.haG), Integer.valueOf(paramAnonymouskeep_SceneResult.field_fileLength), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", paramAnonymouskeep_SceneResult.report_Part2 });
              a.a(g.this.haE, 0);
              g localg = g.this;
              keep_SceneResult localkeep_SceneResult = paramAnonymouskeep_SceneResult;
              n localn = n.Nf();
              o.Nh();
              localn.a(localkeep_SceneResult, s.mk(localg.euR));
              g.this.fUd.a(paramAnonymous2Int1, paramAnonymous2Int2, "", g.this);
              GMTrace.o(354737455104L, 2643);
            }
          }), 0);
          break;
          if (g.this.hbd)
          {
            paramAnonymousInt = 820;
            break label1002;
          }
          paramAnonymousInt = 830;
          break label1002;
          label1725:
          com.tencent.mm.plugin.report.service.g.ork.a(106L, 207L, 1L, false);
          break label1201;
          label1742:
          com.tencent.mm.plugin.report.service.g.ork.a(106L, 209L, 1L, false);
          break label1292;
          label1759:
          com.tencent.mm.plugin.report.service.g.ork.a(106L, 200L, 1L, false);
          break label1292;
          label1776:
          paramAnonymousInt = 2;
          break label1614;
          label1781:
          g localg = g.this;
          o.Nh();
          String str = s.mk(localg.haE.getFileName());
          if (!com.tencent.mm.plugin.a.c.np(str))
          {
            w.w("MicroMsg.NetSceneUploadVideo", "%s check preload length but it not mp4.", new Object[] { localg.MY() });
            paramAnonymousInt = 0;
          }
          else
          {
            i = 0;
            com.tencent.mm.plugin.a.b localb = new com.tencent.mm.plugin.a.b();
            long l1 = localb.no(str);
            long l2 = localb.hmR;
            paramAnonymousInt = i;
            if (l1 < 131072L)
            {
              paramAnonymousInt = i;
              if (l1 > 0L)
              {
                paramAnonymousInt = i;
                if (localg.haE.hcv > 5)
                {
                  paramAnonymousInt = i;
                  if (localb.hmS > 0L)
                  {
                    paramAnonymousInt = i;
                    if (l2 > 0L)
                    {
                      i = (int)l2 + (int)(localb.hmS * 5L / localg.haE.hcv);
                      paramAnonymousInt = i;
                      if (i <= 131072) {
                        paramAnonymousInt = i + 131072;
                      }
                    }
                  }
                }
              }
            }
            w.i("MicroMsg.NetSceneUploadVideo", "%s check preload length[%d] moovPos[%d %d] duration[%d] filelen[%d]", new Object[] { localg.MY(), Integer.valueOf(paramAnonymousInt), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(localg.haE.hcv), Long.valueOf(localb.hmS) });
          }
        }
      }
      
      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
        GMTrace.i(332591529984L, 2478);
        GMTrace.o(332591529984L, 2478);
      }
      
      public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(332725747712L, 2479);
        GMTrace.o(332725747712L, 2479);
        return null;
      }
    };
    this.hbh = 0;
    this.gsj = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(332188876800L, 2475);
        if (g.this.a(g.b(g.this), g.this.fUd) == -1)
        {
          g.this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
          g.this.fUd.a(3, -1, "doScene failed", g.this);
        }
        GMTrace.o(332188876800L, 2475);
        return false;
      }
    }, true);
    boolean bool;
    if (paramString != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      w.d("MicroMsg.NetSceneUploadVideo", "NetSceneUploadVideo:  file:" + paramString);
      this.euR = paramString;
      this.haE = t.mw(paramString);
      if (this.haE == null) {
        break label268;
      }
    }
    label268:
    for (this.MAX_TIMES = 2500;; this.MAX_TIMES = 0)
    {
      this.gMa = new g.a();
      if ((this.haE != null) && (3 == this.haE.hcC)) {
        this.haG = com.tencent.mm.modelcdntran.b.MediaType_TinyVideo;
      }
      w.i("MicroMsg.NetSceneUploadVideo", "%s NetSceneUploadVideo:  videoType:[%d]", new Object[] { MY(), Integer.valueOf(this.haG) });
      GMTrace.o(334202142720L, 2490);
      return;
      bool = false;
      break;
    }
  }
  
  private boolean MX()
  {
    GMTrace.i(334067924992L, 2489);
    if (com.tencent.mm.y.s.gn(this.haE.Nq()))
    {
      w.w("MicroMsg.NetSceneUploadVideo", "%s cdntra not use cdn user:%s", new Object[] { MY(), this.haE.Nq() });
      GMTrace.o(334067924992L, 2489);
      return false;
    }
    com.tencent.mm.modelcdntran.g.Gk();
    if ((!com.tencent.mm.modelcdntran.c.fT(2)) && (this.haE.hcA != 1))
    {
      localObject1 = MY();
      com.tencent.mm.modelcdntran.g.Gk();
      w.w("MicroMsg.NetSceneUploadVideo", "%s cdntra not use cdn flag:%b getCdnInfo:%d", new Object[] { localObject1, Boolean.valueOf(com.tencent.mm.modelcdntran.c.fT(2)), Integer.valueOf(this.haE.hcA) });
      GMTrace.o(334067924992L, 2489);
      return false;
    }
    this.gIp = com.tencent.mm.modelcdntran.d.a("upvideo", this.haE.hcs, this.haE.Nq(), this.haE.getFileName());
    if (bg.nm(this.gIp))
    {
      w.w("MicroMsg.NetSceneUploadVideo", "%s cdntra genClientId failed not use cdn file:%s", new Object[] { MY(), this.haE.getFileName() });
      GMTrace.o(334067924992L, 2489);
      return false;
    }
    o.Nh();
    Object localObject1 = s.ml(this.euR);
    o.Nh();
    String str2 = s.mk(this.euR);
    i locali = new i();
    locali.gAB = this.gIz;
    locali.field_mediaId = this.gIp;
    locali.field_fullpath = str2;
    locali.field_thumbpath = lZ((String)localObject1);
    locali.field_fileType = com.tencent.mm.modelcdntran.b.MediaType_VIDEO;
    locali.field_enable_hitcheck = this.gIH;
    locali.field_largesvideo = com.tencent.mm.modelcontrol.d.Gv().jF(str2);
    if ((this.haE != null) && (3 == this.haE.hcC)) {
      locali.field_smallVideoFlag = 1;
    }
    localObject1 = MY();
    boolean bool1;
    String str1;
    Object localObject3;
    if (this.haE.hcF == null)
    {
      bool1 = true;
      w.i("MicroMsg.NetSceneUploadVideo", "%s upload video MMSightExtInfo is null? %b %s", new Object[] { localObject1, Boolean.valueOf(bool1), this.euR });
      if ((this.haE.hcF != null) && (this.haE.hcF.uBZ))
      {
        w.i("MicroMsg.NetSceneUploadVideo", "%s local capture video, mark use large video", new Object[] { MY() });
        localObject1 = n.Nf();
        o.Nh();
        ((n)localObject1).a("", s.mk(this.euR), this.haE.Nq(), "", "", 2, 2);
        locali.field_largesvideo = true;
      }
      str1 = MY();
      localObject3 = this.haE.getFileName();
      if (this.haE.hcE != null) {
        break label718;
      }
      localObject1 = "null";
      label512:
      w.i("MicroMsg.NetSceneUploadVideo", "%s checkAD file:%s adinfo:%s", new Object[] { str1, localObject3, localObject1 });
      if ((this.haE.hcE != null) && (!bg.nm(this.haE.hcE.gkO))) {
        locali.field_advideoflag = 1;
      }
      locali.field_talker = this.haE.Nq();
      if (!com.tencent.mm.y.s.eb(this.haE.Nq())) {
        break label733;
      }
    }
    label718:
    label733:
    for (int i = 1;; i = 0)
    {
      locali.field_chattype = i;
      locali.field_priority = com.tencent.mm.modelcdntran.b.gzd;
      locali.field_needStorage = false;
      locali.field_isStreamMedia = false;
      locali.field_trysafecdn = true;
      this.hbg = com.tencent.mm.a.e.aY(locali.field_fullpath);
      this.hbf = com.tencent.mm.a.e.aY(locali.field_thumbpath);
      if (this.hbf < com.tencent.mm.modelcdntran.b.gzs) {
        break label738;
      }
      w.w("MicroMsg.NetSceneUploadVideo", "%s cdntra thumb[%s][%d] Too Big Not Use CDN TRANS", new Object[] { MY(), locali.field_thumbpath, Integer.valueOf(this.hbf) });
      GMTrace.o(334067924992L, 2489);
      return false;
      bool1 = false;
      break;
      localObject1 = this.haE.hcE.gkO;
      break label512;
    }
    label738:
    localObject1 = bh.q(this.haE.Nt(), "msg");
    boolean bool2;
    label1177:
    int m;
    long l1;
    label1264:
    label1282:
    label1437:
    label1443:
    label1449:
    label1455:
    label1461:
    label1467:
    label1473:
    Object localObject2;
    Object localObject5;
    Object localObject4;
    label1890:
    int k;
    int j;
    label1953:
    int i2;
    if (localObject1 != null)
    {
      locali.field_fileId = ((String)((Map)localObject1).get(".msg.videomsg.$cdnvideourl"));
      locali.field_aesKey = ((String)((Map)localObject1).get(".msg.videomsg.$aeskey"));
      this.hbe = true;
      localObject1 = com.tencent.mm.plugin.report.service.g.ork;
      if (this.hbd)
      {
        i = 1;
        ((com.tencent.mm.plugin.report.service.g)localObject1).i(12696, new Object[] { Integer.valueOf(i + 700), Integer.valueOf(this.haE.gsL) });
        if ((bg.nm(locali.field_aesKey)) || (bg.nm(locali.field_aesKey)))
        {
          locali.field_aesKey = "";
          locali.field_fileId = "";
        }
        w.i("MicroMsg.NetSceneUploadVideo", "%s summersafecdn check hit cache VideoHash :%s %s %s %b %b", new Object[] { MY(), locali.field_mediaId, locali.field_fileId, locali.field_aesKey, Boolean.valueOf(this.gIH), Boolean.valueOf(locali.field_largesvideo) });
        if (com.tencent.mm.modelcdntran.g.Gk().c(locali)) {
          break label2879;
        }
        com.tencent.mm.plugin.report.service.g.ork.a(111L, 226L, 1L, false);
        w.e("MicroMsg.NetSceneUploadVideo", "%s cdntra addSendTask failed.", new Object[] { MY() });
        this.gIp = "";
        GMTrace.o(334067924992L, 2489);
        return false;
      }
    }
    else
    {
      w.i("MicroMsg.NetSceneUploadVideo", "%s cdntra parse video recv xml failed", new Object[] { MY() });
      int n;
      int i1;
      Vector localVector2;
      for (;;)
      {
        try
        {
          str1 = bg.nl(((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue("UseVideoHash"));
          localObject1 = str1.split(",");
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xw();
          i = com.tencent.mm.a.h.aw(com.tencent.mm.kernel.a.ww(), 100);
          if ((localObject1 == null) || (localObject1.length <= 0)) {
            break label1443;
          }
          if (bg.getInt(localObject1[0], 0) < i) {
            break label1437;
          }
          bool1 = true;
          if ((localObject1 == null) || (localObject1.length < 2)) {
            break label1455;
          }
          if (bg.getInt(localObject1[1], 0) < i) {
            break label1449;
          }
          bool2 = true;
          if ((localObject1 == null) || (localObject1.length < 3)) {
            break label1467;
          }
          if (bg.getInt(localObject1[2], 0) < i) {
            break label1461;
          }
          bool3 = true;
          if (!com.tencent.mm.sdk.a.b.bPq()) {
            break label2956;
          }
          bool1 = true;
          bool2 = true;
          bool3 = true;
          if (!bool2) {
            break label2856;
          }
          localObject3 = o.Nh();
          m = bg.getInt(localObject1[2], 0);
          w.i("MicroMsg.VideoInfoStorage", "checkVideoHash in fullCheckRatio:%s path:%s stack:%s", new Object[] { Integer.valueOf(m), str2, bg.bQW() });
          l1 = bg.Pv();
          if (!bg.nm(str2)) {
            break label1473;
          }
          w.e("MicroMsg.VideoInfoStorage", "checkVideoHash failed , path:%s ", new Object[] { str2 });
          localObject1 = "";
          if (bg.nm((String)localObject1)) {
            break label2856;
          }
          localObject1 = ((String)localObject1).split("##");
          if ((bool1) && (localObject1 != null) && (localObject1.length == 2))
          {
            locali.field_fileId = localObject1[0];
            locali.field_aesKey = localObject1[1];
            this.hbd = true;
          }
          w.i("MicroMsg.NetSceneUploadVideo", "%s CheckUseVideoHash debug:%s str:%s [%s,%s,%s] hasHash:%s [%s,%s]", new Object[] { MY(), Boolean.valueOf(com.tencent.mm.sdk.a.b.bPq()), str1, Boolean.valueOf(bool2), Boolean.valueOf(bool1), Boolean.valueOf(bool3), Boolean.valueOf(this.hbd), locali.field_fileId, locali.field_aesKey });
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.NetSceneUploadVideo", "Check use videohash :%s", new Object[] { bg.f(localException) });
        }
        break;
        bool1 = false;
        continue;
        bool1 = false;
        continue;
        bool2 = false;
        continue;
        bool2 = false;
        continue;
        boolean bool3 = false;
        continue;
        bool3 = false;
        continue;
        localObject2 = s.mn(str2);
        if ((localObject2 == null) || (localObject2.length < 33))
        {
          w.e("MicroMsg.VideoInfoStorage", "checkVideoHash  readHash failed :%s", new Object[] { str2 });
          localObject2 = "";
        }
        else
        {
          ((s)localObject3).goN.eZ("VideoHash", "delete from VideoHash where CreateTime < " + (bg.Pu() - 432000L));
          n = localObject2[32];
          StringBuffer localStringBuffer = new StringBuffer();
          i = 0;
          while (i < 32)
          {
            localStringBuffer.append(Integer.toHexString(localObject2[i]));
            i += 1;
          }
          i1 = localStringBuffer.length();
          localObject5 = new Vector();
          localObject4 = new Vector();
          Vector localVector1 = new Vector();
          localVector2 = new Vector();
          i = -1;
          Cursor localCursor = ((s)localObject3).goN.a("select size, CreateTime, hash, cdnxml, orgpath from VideoHash where size = " + n, null, 0);
          while (localCursor.moveToNext())
          {
            l2 = localCursor.getLong(1);
            String str3 = localCursor.getString(2);
            String str4 = localCursor.getString(3);
            String str5 = localCursor.getString(4);
            w.v("MicroMsg.VideoInfoStorage", "checkVideoHash select [%s][%s]", new Object[] { str3, str4 });
            if ((bg.nm(str3)) || (bg.nm(str4)))
            {
              com.tencent.mm.plugin.report.service.g.ork.i(12696, new Object[] { Integer.valueOf(104), Integer.valueOf(n) });
              w.w("MicroMsg.VideoInfoStorage", "checkVideoHash select error [%s][%s]", new Object[] { str3, str4 });
            }
            else
            {
              if (i1 == str3.length()) {
                break label2971;
              }
              com.tencent.mm.plugin.report.service.g.ork.i(12696, new Object[] { Integer.valueOf(105), Integer.valueOf(n) });
              w.w("MicroMsg.VideoInfoStorage", "checkVideoHash err length file:%d cursor:%d", new Object[] { Integer.valueOf(i1), Integer.valueOf(str3.length()) });
              continue;
              if (k < i1)
              {
                if (localStringBuffer.charAt(k) != str3.charAt(k)) {
                  break label2953;
                }
                j += 1;
                break label2978;
              }
              if ((i >= 0) && (localVector1.size() > i) && (((Integer)localVector1.get(i)).intValue() >= j)) {
                break label2950;
              }
              i = localVector1.size();
              localVector1.add(Integer.valueOf(j));
              ((Vector)localObject5).add(str4);
              ((Vector)localObject4).add(str5);
              localVector2.add(Long.valueOf(l2));
              w.d("MicroMsg.VideoInfoStorage", "checkVideoHash cursor hitCount:%d/%d ,max:%d vector:%d/%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i1), localVector1.get(i), Integer.valueOf(i), Integer.valueOf(localVector1.size()) });
            }
          }
          localCursor.close();
          if ((i < 0) || (localVector1.size() <= 0))
          {
            com.tencent.mm.plugin.report.service.g.ork.i(12696, new Object[] { Integer.valueOf(201), Integer.valueOf(n) });
            w.w("MicroMsg.VideoInfoStorage", "checkVideoHash cursor empty maxHitIndex:%d vector:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(localVector1.size()) });
            localObject2 = "";
          }
          else
          {
            i1 = ((Integer)localVector1.get(i)).intValue();
            i2 = i1 * 100 / 256;
            if (i2 < 77)
            {
              com.tencent.mm.plugin.report.service.g.ork.i(12696, new Object[] { Integer.valueOf(202), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(0), Integer.valueOf(localVector2.size()) });
              w.w("MicroMsg.VideoInfoStorage", "checkVideoHash NotEnoughHit. time:%d hit:%d percentMatch:%s arr:%d path:%s", new Object[] { Long.valueOf(bg.aH(l1)), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(localObject2.length - 1), str2 });
              localObject2 = "";
            }
            else
            {
              localObject2 = bg.nl((String)((Vector)localObject5).get(i));
              j = 0;
              k = 0;
              label2304:
              if (k < localVector1.size())
              {
                if ((k == i) || (((Integer)localVector1.get(k)).intValue() < i1) || (((String)localObject2).hashCode() == ((String)((Vector)localObject5).get(k)).hashCode())) {
                  break label2947;
                }
                j += 1;
                break label2985;
              }
              if (j <= 0) {
                break label2518;
              }
              ((s)localObject3).goN.eZ("VideoHash", "delete from VideoHash where size = " + n);
              com.tencent.mm.plugin.report.service.g.ork.i(12696, new Object[] { Integer.valueOf(203), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(0), Integer.valueOf(localVector2.size()), Integer.valueOf(0), "", "", "", Integer.valueOf(j) });
              w.e("MicroMsg.VideoInfoStorage", "checkVideoHash Not ONE hash hit this path, give up duplicate:%s path:%s", new Object[] { Integer.valueOf(j), str2 });
              localObject2 = "";
            }
          }
        }
      }
      label2518:
      l1 = bg.aH(l1);
      long l2 = bg.a((Long)localVector2.get(i), 0L);
      localObject5 = String.format("%s,%s,%s,%s,%s", new Object[] { Integer.valueOf(n), Integer.valueOf(i1), Long.valueOf(l2), Integer.valueOf(localVector2.size()), Long.valueOf(l1) });
      com.tencent.mm.plugin.report.service.g.ork.i(12696, new Object[] { Integer.valueOf(300), localObject5 });
      com.tencent.mm.plugin.report.service.g.ork.i(12696, new Object[] { Integer.valueOf(i2 + 3000), localObject5 });
      w.i("MicroMsg.VideoInfoStorage", "checkVideoHash Succ time:%s hit:%s match:%s%% savetime:%s path:%s xml:%s orgpath:%s", new Object[] { Long.valueOf(l1), Integer.valueOf(i1), Integer.valueOf(i2), Long.valueOf(l2), str2, localObject2, ((Vector)localObject4).get(i) });
      localObject4 = (String)((Vector)localObject4).get(i);
      l1 = bg.Pv() % 1000L;
      if (l1 < m * 10) {
        break label2992;
      }
      if (i2 < 90) {
        break label2992;
      }
    }
    for (;;)
    {
      w.i("MicroMsg.VideoInfoStorage", "checkVideoHashByteDiff should:%s now:%s ratio:%s percentMatch:%s debuger:%s", new Object[] { Boolean.valueOf(bool4), Long.valueOf(l1), Integer.valueOf(m), Integer.valueOf(i2), Boolean.valueOf(com.tencent.mm.sdk.a.b.bPq()) });
      if ((bool4) || (com.tencent.mm.sdk.a.b.bPq())) {
        com.tencent.mm.sdk.f.e.b(new s.2((s)localObject3, str2, (String)localObject4, (String)localObject5), "checkVideoHashByteDiff", 1);
      }
      break label1264;
      boolean bool4 = false;
      continue;
      label2856:
      localObject2 = null;
      break label1282;
      if (this.hbe)
      {
        i = 2;
        break;
      }
      i = 0;
      break;
      label2879:
      if (this.haE.hcA != 1)
      {
        this.haE.hcA = 1;
        this.haE.status = 104;
        this.haE.clientId = this.gIp;
        this.haE.eQl = 524544;
        t.e(this.haE);
      }
      GMTrace.o(334067924992L, 2489);
      return true;
      label2947:
      break label2985;
      label2950:
      break label1953;
      label2953:
      break label2978;
      label2956:
      bool4 = bool1;
      bool1 = bool2;
      bool2 = bool4;
      break label1177;
      label2971:
      j = 0;
      k = 0;
      break label1890;
      label2978:
      k += 1;
      break label1890;
      label2985:
      k += 1;
      break label2304;
      label2992:
      bool4 = true;
    }
  }
  
  /* Error */
  private String lZ(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 697
    //   3: sipush 2498
    //   6: invokestatic 58	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 700	java/io/File
    //   12: dup
    //   13: aload_1
    //   14: invokespecial 701	java/io/File:<init>	(Ljava/lang/String;)V
    //   17: astore 9
    //   19: new 700	java/io/File
    //   22: dup
    //   23: aload 9
    //   25: invokevirtual 705	java/io/File:getParentFile	()Ljava/io/File;
    //   28: new 134	java/lang/StringBuilder
    //   31: dup
    //   32: ldc_w 707
    //   35: invokespecial 138	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   38: aload 9
    //   40: invokevirtual 710	java/io/File:getName	()Ljava/lang/String;
    //   43: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   49: invokespecial 713	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   52: astore 10
    //   54: aconst_null
    //   55: astore 7
    //   57: aconst_null
    //   58: astore 8
    //   60: aconst_null
    //   61: astore 6
    //   63: aconst_null
    //   64: astore 5
    //   66: ldc -124
    //   68: ldc_w 715
    //   71: iconst_1
    //   72: anewarray 179	java/lang/Object
    //   75: dup
    //   76: iconst_0
    //   77: aload 9
    //   79: invokevirtual 717	java/io/File:length	()J
    //   82: invokestatic 620	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   85: aastore
    //   86: invokestatic 624	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   89: aload 9
    //   91: invokevirtual 717	java/io/File:length	()J
    //   94: ldc2_w 718
    //   97: lcmp
    //   98: ifle +563 -> 661
    //   101: aload 10
    //   103: invokevirtual 722	java/io/File:exists	()Z
    //   106: ifeq +112 -> 218
    //   109: ldc -124
    //   111: ldc_w 724
    //   114: iconst_1
    //   115: anewarray 179	java/lang/Object
    //   118: dup
    //   119: iconst_0
    //   120: aload 10
    //   122: invokevirtual 727	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   125: aastore
    //   126: invokestatic 624	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   129: iconst_1
    //   130: istore_2
    //   131: aload 8
    //   133: astore 4
    //   135: aload 4
    //   137: ifnull +8 -> 145
    //   140: aload 4
    //   142: invokevirtual 730	java/io/InputStream:close	()V
    //   145: iload_2
    //   146: istore_3
    //   147: aload 5
    //   149: ifnull +10 -> 159
    //   152: aload 5
    //   154: invokevirtual 733	java/io/OutputStream:close	()V
    //   157: iload_2
    //   158: istore_3
    //   159: iload_3
    //   160: ifeq +382 -> 542
    //   163: ldc -124
    //   165: ldc_w 735
    //   168: iconst_3
    //   169: anewarray 179	java/lang/Object
    //   172: dup
    //   173: iconst_0
    //   174: aload_0
    //   175: invokevirtual 182	com/tencent/mm/modelvideo/g:MY	()Ljava/lang/String;
    //   178: aastore
    //   179: dup
    //   180: iconst_1
    //   181: aload 10
    //   183: invokevirtual 717	java/io/File:length	()J
    //   186: invokestatic 620	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   189: aastore
    //   190: dup
    //   191: iconst_2
    //   192: aload 10
    //   194: invokevirtual 727	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   197: aastore
    //   198: invokestatic 191	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   201: aload 10
    //   203: invokevirtual 727	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   206: astore_1
    //   207: ldc2_w 697
    //   210: sipush 2498
    //   213: invokestatic 63	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   216: aload_1
    //   217: areturn
    //   218: aload 9
    //   220: invokevirtual 727	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   223: invokestatic 741	com/tencent/mm/sdk/platformtools/d:RB	(Ljava/lang/String;)Landroid/graphics/BitmapFactory$Options;
    //   226: astore 11
    //   228: aload 11
    //   230: ifnonnull +111 -> 341
    //   233: ldc_w 336
    //   236: astore 4
    //   238: ldc -124
    //   240: ldc_w 743
    //   243: iconst_1
    //   244: anewarray 179	java/lang/Object
    //   247: dup
    //   248: iconst_0
    //   249: aload 4
    //   251: aastore
    //   252: invokestatic 191	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   255: aload 11
    //   257: ifnull +121 -> 378
    //   260: aload 11
    //   262: getfield 748	android/graphics/BitmapFactory$Options:outWidth	I
    //   265: sipush 288
    //   268: if_icmpgt +14 -> 282
    //   271: aload 11
    //   273: getfield 751	android/graphics/BitmapFactory$Options:outHeight	I
    //   276: sipush 288
    //   279: if_icmple +99 -> 378
    //   282: aload 9
    //   284: invokevirtual 727	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   287: sipush 288
    //   290: sipush 288
    //   293: getstatic 757	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   296: bipush 60
    //   298: new 134	java/lang/StringBuilder
    //   301: dup
    //   302: invokespecial 758	java/lang/StringBuilder:<init>	()V
    //   305: aload 10
    //   307: invokevirtual 705	java/io/File:getParentFile	()Ljava/io/File;
    //   310: invokevirtual 727	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   313: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   316: ldc_w 760
    //   319: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   322: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   325: aload 10
    //   327: invokevirtual 710	java/io/File:getName	()Ljava/lang/String;
    //   330: invokestatic 763	com/tencent/mm/sdk/platformtools/d:a	(Ljava/lang/String;IILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;Ljava/lang/String;)Z
    //   333: istore_2
    //   334: aload 8
    //   336: astore 4
    //   338: goto -203 -> 135
    //   341: new 134	java/lang/StringBuilder
    //   344: dup
    //   345: invokespecial 758	java/lang/StringBuilder:<init>	()V
    //   348: aload 11
    //   350: getfield 748	android/graphics/BitmapFactory$Options:outWidth	I
    //   353: invokevirtual 572	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   356: ldc_w 765
    //   359: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   362: aload 11
    //   364: getfield 751	android/graphics/BitmapFactory$Options:outHeight	I
    //   367: invokevirtual 572	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   370: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   373: astore 4
    //   375: goto -137 -> 238
    //   378: new 767	java/io/FileInputStream
    //   381: dup
    //   382: aload 9
    //   384: invokespecial 770	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   387: astore 4
    //   389: aload 4
    //   391: fconst_0
    //   392: sipush 288
    //   395: sipush 288
    //   398: invokestatic 773	com/tencent/mm/sdk/platformtools/d:a	(Ljava/io/InputStream;FII)Landroid/graphics/Bitmap;
    //   401: astore 8
    //   403: aload 8
    //   405: ifnull +251 -> 656
    //   408: new 775	java/io/FileOutputStream
    //   411: dup
    //   412: aload 10
    //   414: invokespecial 776	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   417: astore 5
    //   419: aload 5
    //   421: astore 7
    //   423: aload 4
    //   425: astore 6
    //   427: aload 8
    //   429: getstatic 757	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   432: bipush 60
    //   434: aload 5
    //   436: invokevirtual 782	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   439: istore_2
    //   440: goto -305 -> 135
    //   443: astore 8
    //   445: aconst_null
    //   446: astore 5
    //   448: aconst_null
    //   449: astore 4
    //   451: aload 5
    //   453: astore 7
    //   455: aload 4
    //   457: astore 6
    //   459: ldc -124
    //   461: ldc_w 784
    //   464: iconst_1
    //   465: anewarray 179	java/lang/Object
    //   468: dup
    //   469: iconst_0
    //   470: aload 8
    //   472: invokestatic 523	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   475: aastore
    //   476: invokestatic 440	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   479: aload 4
    //   481: ifnull +8 -> 489
    //   484: aload 4
    //   486: invokevirtual 730	java/io/InputStream:close	()V
    //   489: aload 5
    //   491: ifnull +160 -> 651
    //   494: aload 5
    //   496: invokevirtual 733	java/io/OutputStream:close	()V
    //   499: iconst_0
    //   500: istore_3
    //   501: goto -342 -> 159
    //   504: astore 4
    //   506: iconst_0
    //   507: istore_3
    //   508: goto -349 -> 159
    //   511: astore_1
    //   512: aload 7
    //   514: astore 4
    //   516: aload 6
    //   518: astore 5
    //   520: aload 4
    //   522: ifnull +8 -> 530
    //   525: aload 4
    //   527: invokevirtual 730	java/io/InputStream:close	()V
    //   530: aload 5
    //   532: ifnull +8 -> 540
    //   535: aload 5
    //   537: invokevirtual 733	java/io/OutputStream:close	()V
    //   540: aload_1
    //   541: athrow
    //   542: ldc -124
    //   544: ldc_w 786
    //   547: iconst_3
    //   548: anewarray 179	java/lang/Object
    //   551: dup
    //   552: iconst_0
    //   553: aload_0
    //   554: invokevirtual 182	com/tencent/mm/modelvideo/g:MY	()Ljava/lang/String;
    //   557: aastore
    //   558: dup
    //   559: iconst_1
    //   560: aload 9
    //   562: invokevirtual 717	java/io/File:length	()J
    //   565: invokestatic 620	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   568: aastore
    //   569: dup
    //   570: iconst_2
    //   571: aload 9
    //   573: invokevirtual 727	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   576: aastore
    //   577: invokestatic 191	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   580: ldc2_w 697
    //   583: sipush 2498
    //   586: invokestatic 63	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   589: aload_1
    //   590: areturn
    //   591: astore 4
    //   593: goto -448 -> 145
    //   596: astore 4
    //   598: iload_2
    //   599: istore_3
    //   600: goto -441 -> 159
    //   603: astore 4
    //   605: goto -116 -> 489
    //   608: astore 4
    //   610: goto -80 -> 530
    //   613: astore 4
    //   615: goto -75 -> 540
    //   618: astore_1
    //   619: aload 6
    //   621: astore 5
    //   623: goto -103 -> 520
    //   626: astore_1
    //   627: aload 7
    //   629: astore 5
    //   631: aload 6
    //   633: astore 4
    //   635: goto -115 -> 520
    //   638: astore 8
    //   640: aconst_null
    //   641: astore 5
    //   643: goto -192 -> 451
    //   646: astore 8
    //   648: goto -197 -> 451
    //   651: iconst_0
    //   652: istore_3
    //   653: goto -494 -> 159
    //   656: iconst_0
    //   657: istore_2
    //   658: goto -523 -> 135
    //   661: iconst_0
    //   662: istore_2
    //   663: aload 8
    //   665: astore 4
    //   667: goto -532 -> 135
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	670	0	this	g
    //   0	670	1	paramString	String
    //   130	533	2	bool1	boolean
    //   146	507	3	bool2	boolean
    //   133	352	4	localObject1	Object
    //   504	1	4	localIOException1	java.io.IOException
    //   514	12	4	localObject2	Object
    //   591	1	4	localIOException2	java.io.IOException
    //   596	1	4	localIOException3	java.io.IOException
    //   603	1	4	localIOException4	java.io.IOException
    //   608	1	4	localIOException5	java.io.IOException
    //   613	1	4	localIOException6	java.io.IOException
    //   633	33	4	localObject3	Object
    //   64	578	5	localObject4	Object
    //   61	571	6	localObject5	Object
    //   55	573	7	localObject6	Object
    //   58	370	8	localBitmap	android.graphics.Bitmap
    //   443	28	8	localException1	Exception
    //   638	1	8	localException2	Exception
    //   646	18	8	localException3	Exception
    //   17	555	9	localFile1	java.io.File
    //   52	361	10	localFile2	java.io.File
    //   226	137	11	localOptions	android.graphics.BitmapFactory.Options
    // Exception table:
    //   from	to	target	type
    //   89	129	443	java/lang/Exception
    //   218	228	443	java/lang/Exception
    //   238	255	443	java/lang/Exception
    //   260	282	443	java/lang/Exception
    //   282	334	443	java/lang/Exception
    //   341	375	443	java/lang/Exception
    //   378	389	443	java/lang/Exception
    //   494	499	504	java/io/IOException
    //   89	129	511	finally
    //   218	228	511	finally
    //   238	255	511	finally
    //   260	282	511	finally
    //   282	334	511	finally
    //   341	375	511	finally
    //   378	389	511	finally
    //   140	145	591	java/io/IOException
    //   152	157	596	java/io/IOException
    //   484	489	603	java/io/IOException
    //   525	530	608	java/io/IOException
    //   535	540	613	java/io/IOException
    //   389	403	618	finally
    //   408	419	618	finally
    //   427	440	626	finally
    //   459	479	626	finally
    //   389	403	638	java/lang/Exception
    //   408	419	638	java/lang/Exception
    //   427	440	646	java/lang/Exception
  }
  
  public final boolean DF()
  {
    GMTrace.i(334873231360L, 2495);
    boolean bool = super.DF();
    if (bool) {
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 210L, 1L, false);
    }
    GMTrace.o(334873231360L, 2495);
    return bool;
  }
  
  public final String MY()
  {
    GMTrace.i(18679483858944L, 139173);
    String str = this.euR + "_" + hashCode();
    GMTrace.o(18679483858944L, 139173);
    return str;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(334336360448L, 2491);
    this.fUd = parame1;
    this.haE = t.mw(this.euR);
    if ((this.haE == null) || ((this.haE.status != 104) && (this.haE.status != 103)))
    {
      w.e("MicroMsg.NetSceneUploadVideo", "%s Get info Failed file:", new Object[] { MY(), this.euR });
      this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
      GMTrace.o(334336360448L, 2491);
      return -1;
    }
    parame1 = new StringBuilder("doscene file:").append(this.euR).append(" stat:").append(this.haE.status).append(" [").append(this.haE.hcq).append(",").append(this.haE.hcr).append("] [").append(this.haE.hbc).append(",").append(this.haE.gsL).append("]  netTimes:").append(this.haE.hcx).append(" times:");
    int i = this.hbh;
    this.hbh = (i + 1);
    w.d("MicroMsg.NetSceneUploadVideo", i);
    if (this.startTime == 0L)
    {
      this.startTime = bg.Pv();
      this.hbc = this.haE.hbc;
    }
    o.Nh();
    if (q.md(s.mk(this.euR)))
    {
      w.w("MicroMsg.NetSceneUploadVideo", "%s it is mm h265 video xml[%s]", new Object[] { MY(), this.haE.Nt() });
      com.tencent.mm.plugin.report.service.g.ork.a(354L, 139L, 1L, false);
    }
    if (MX())
    {
      w.d("MicroMsg.NetSceneUploadVideo", "cdntra use cdn return -1 for onGYNetEnd clientid:%s", new Object[] { this.euR });
      GMTrace.o(334336360448L, 2491);
      return 0;
    }
    bmi localbmi;
    if (this.haE.hcz == 1)
    {
      this.hbb = true;
      parame1 = new b.a();
      parame1.gtF = new bmi();
      parame1.gtG = new bmj();
      parame1.uri = "/cgi-bin/micromsg-bin/uploadvideo";
      parame1.gtE = 149;
      parame1.gtH = 39;
      parame1.gtI = 1000000039;
      this.fUa = parame1.DA();
      localbmi = (bmi)this.fUa.gtC.gtK;
      localbmi.lSY = ((String)com.tencent.mm.kernel.h.xy().xh().get(2, ""));
      localbmi.lSX = this.haE.Nq();
      localbmi.tQN = this.euR;
      if (this.hbb) {
        localbmi.uWj = 2;
      }
      if (this.haE.hcC == 3) {
        localbmi.uWj = 3;
      }
      localbmi.uWi = this.haE.hcv;
      localbmi.uCz = this.haE.hcr;
      localbmi.uWf = this.haE.gsL;
      if (!com.tencent.mm.network.ab.bv(com.tencent.mm.sdk.platformtools.ab.getContext())) {
        break label1208;
      }
      i = 1;
      label592:
      localbmi.ugj = i;
      localbmi.uCC = 2;
      localbmi.uWg = 0;
      localbmi.uWh = new azp().be(new byte[0]);
      localbmi.uCB = new azp().be(new byte[0]);
      if (!bg.nm(this.eTZ)) {
        break label1213;
      }
      o.Nh();
      parame1 = com.tencent.mm.a.g.bg(s.mk(this.euR));
      this.eTZ = parame1;
      label676:
      localbmi.uWm = parame1;
      localbmi.tQb = be.Br();
      localbmi.uWv = this.haE.eTv;
      parame1 = this.haE.hcE;
      if ((parame1 == null) || (bg.nm(parame1.gkI))) {
        break label1221;
      }
      localbmi.uWn = bg.aq(parame1.gkI, "");
      localbmi.uWo = parame1.ulk;
      localbmi.uWp = bg.aq(parame1.gkK, "");
      localbmi.uWr = bg.aq(parame1.gkM, "");
      localbmi.uWq = bg.aq(parame1.gkL, "");
      localbmi.uWs = bg.aq(parame1.gkN, "");
    }
    for (;;)
    {
      if (parame1 != null)
      {
        localbmi.uWu = bg.aq(parame1.gkO, "");
        localbmi.uWt = bg.aq(parame1.gkP, "");
      }
      w.d("MicroMsg.NetSceneUploadVideo", "upload video: play length %d, thumb totalLen %d, video totalLen %d, funcFlag %d, videoMd5: %s stream %s streamtime: %d title %s thumburl %s", new Object[] { Integer.valueOf(localbmi.uWi), Integer.valueOf(localbmi.uCA), Integer.valueOf(localbmi.uWf), Integer.valueOf(localbmi.uWj), localbmi.uWm, localbmi.uWn, Integer.valueOf(localbmi.uWo), localbmi.uWp, localbmi.uWs });
      if (this.haE.status != 103) {
        break label1520;
      }
      o.Nh();
      parame1 = s.h(s.ml(this.euR), this.haE.hcq, haZ);
      if ((parame1.ret >= 0) && (parame1.eyw != 0)) {
        break label1266;
      }
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 225L, 1L, false);
      t.mp(this.euR);
      w.e("MicroMsg.NetSceneUploadVideo", "doScene READ THUMB[" + this.euR + "]  Error ");
      this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
      GMTrace.o(334336360448L, 2491);
      return -1;
      if (this.haE.hcs + 600L < bg.Pu())
      {
        w.e("MicroMsg.NetSceneUploadVideo", "create time check error:" + this.euR);
        t.mp(this.euR);
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
        GMTrace.o(334336360448L, 2491);
        return -1;
      }
      if (t.mo(this.euR)) {
        break;
      }
      w.e("MicroMsg.NetSceneUploadVideo", "checkVoiceNetTimes Failed file:" + this.euR);
      t.mp(this.euR);
      this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
      GMTrace.o(334336360448L, 2491);
      return -1;
      label1208:
      i = 2;
      break label592;
      label1213:
      parame1 = this.eTZ;
      break label676;
      label1221:
      if ((parame1 != null) && (!bg.nm(parame1.gkM)) && (!bg.nm(parame1.gkL)))
      {
        localbmi.uWr = parame1.gkM;
        localbmi.uWq = parame1.gkL;
      }
    }
    label1266:
    w.d("MicroMsg.NetSceneUploadVideo", "doScene READ THUMB[" + this.euR + "] read ret:" + parame1.ret + " readlen:" + parame1.eyw + " newOff:" + parame1.hcV + " netOff:" + this.haE.hcq);
    if (parame1.hcV < this.haE.hcq)
    {
      w.e("MicroMsg.NetSceneUploadVideo", "Err doScene READ THUMB[" + this.euR + "] newOff:" + parame1.hcV + " OldtOff:" + this.haE.hcq);
      t.mp(this.euR);
      this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
      GMTrace.o(334336360448L, 2491);
      return -1;
    }
    byte[] arrayOfByte = new byte[parame1.eyw];
    System.arraycopy(parame1.buf, 0, arrayOfByte, 0, parame1.eyw);
    localbmi.uCA = this.haE.hcq;
    localbmi.uCB = new azp().be(arrayOfByte);
    for (;;)
    {
      i = a(parame, this.fUa, this);
      GMTrace.o(334336360448L, 2491);
      return i;
      label1520:
      o.Nh();
      parame1 = s.h(s.mk(this.euR), this.haE.hbc, haZ);
      if ((parame1.ret < 0) || (parame1.eyw == 0))
      {
        com.tencent.mm.plugin.report.service.g.ork.a(111L, 224L, 1L, false);
        t.mp(this.euR);
        w.e("MicroMsg.NetSceneUploadVideo", "doScene READ VIDEO[" + this.euR + "]  Error ");
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
        GMTrace.o(334336360448L, 2491);
        return -1;
      }
      w.d("MicroMsg.NetSceneUploadVideo", "doScene READ VIDEO[" + this.euR + "] read ret:" + parame1.ret + " readlen:" + parame1.eyw + " newOff:" + parame1.hcV + " netOff:" + this.haE.hbc);
      if (parame1.hcV < this.haE.hbc)
      {
        w.e("MicroMsg.NetSceneUploadVideo", "Err doScene READ VIDEO[" + this.euR + "] newOff:" + parame1.hcV + " OldtOff:" + this.haE.hbc);
        t.mp(this.euR);
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
        GMTrace.o(334336360448L, 2491);
        return -1;
      }
      if (parame1.hcV >= 20971520)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(111L, 222L, 1L, false);
        w.e("MicroMsg.NetSceneUploadVideo", "Err doScene READ VIDEO[" + this.euR + "] maxsize:20971520");
        t.mp(this.euR);
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
        GMTrace.o(334336360448L, 2491);
        return -1;
      }
      arrayOfByte = new byte[parame1.eyw];
      System.arraycopy(parame1.buf, 0, arrayOfByte, 0, parame1.eyw);
      localbmi.uWg = this.haE.hbc;
      localbmi.uCA = this.haE.hcq;
      localbmi.uWh = new azp().be(arrayOfByte);
    }
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    GMTrace.i(334470578176L, 2492);
    paramq = (bmi)((com.tencent.mm.ad.b)paramq).gtC.gtK;
    if ((bg.nm(paramq.tQN)) || (paramq.uCC <= 0) || (bg.nm(paramq.lSY)) || (bg.nm(paramq.lSX)) || (paramq.ugj <= 0) || (paramq.uCA > paramq.uCz) || (paramq.uCA < 0) || (paramq.uWg > paramq.uWf) || (paramq.uWg < 0) || ((paramq.uWg == paramq.uWf) && (paramq.uCA == paramq.uCz)) || (paramq.uCz <= 0) || (paramq.uWf <= 0) || ((paramq.uWh.uNN <= 0) && (paramq.uCB.uNN <= 0)))
    {
      w.e("MicroMsg.NetSceneUploadVideo", "ERR: Security Check Failed file:" + this.euR + " user:" + paramq.lSX);
      i = k.b.gun;
      GMTrace.o(334470578176L, 2492);
      return i;
    }
    int i = k.b.gum;
    GMTrace.o(334470578176L, 2492);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(335007449088L, 2496);
    w.d("MicroMsg.NetSceneUploadVideo", "cdntra onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " useCdnTransClientId:" + this.gIp);
    if (this.haH)
    {
      w.d("MicroMsg.NetSceneUploadVideo", "onGYNetEnd Call Stop by Service   file:" + this.euR + " user:" + this.haE.Nq());
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(335007449088L, 2496);
      return;
    }
    if ((paramInt2 == 3) && (paramInt3 == -1) && (!bg.nm(this.gIp)))
    {
      w.w("MicroMsg.NetSceneUploadVideo", "cdntra using cdn trans,  wait cdn service callback! clientid:%s", new Object[] { this.gIp });
      GMTrace.o(335007449088L, 2496);
      return;
    }
    paramArrayOfByte = (bmj)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    paramq = (bmi)((com.tencent.mm.ad.b)paramq).gtC.gtK;
    this.haE = t.mw(this.euR);
    if (this.haE == null)
    {
      w.e("MicroMsg.NetSceneUploadVideo", "ERR: onGYNetEnd Get INFO FAILED :" + this.euR);
      this.retCode = (0 - com.tencent.mm.compatible.util.g.tA() - 10000);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(335007449088L, 2496);
      return;
    }
    if (this.haE.status == 105)
    {
      w.w("MicroMsg.NetSceneUploadVideo", "onGYNetEnd STATUS PAUSE [" + this.euR + "," + this.haE.eSf + "," + this.haE.Nr() + "," + this.haE.Nq() + "] ");
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(335007449088L, 2496);
      return;
    }
    if ((this.haE.status != 104) && (this.haE.status != 103))
    {
      w.e("MicroMsg.NetSceneUploadVideo", "ERR: onGYNetEnd STATUS ERR: status:" + this.haE.status + " [" + this.euR + "," + this.haE.eSf + "," + this.haE.Nr() + "," + this.haE.Nq() + "] ");
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(335007449088L, 2496);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 == -22))
    {
      w.e("MicroMsg.NetSceneUploadVideo", "ERR: onGYNetEnd BLACK  errtype:" + paramInt2 + " errCode:" + paramInt3 + "  file:" + this.euR + " user:" + this.haE.Nq());
      t.mq(this.euR);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(335007449088L, 2496);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 != 0))
    {
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 220L, 1L, false);
      w.e("MicroMsg.NetSceneUploadVideo", "ERR: onGYNetEnd SERVER FAILED errtype:" + paramInt2 + " errCode:" + paramInt3 + "  file:" + this.euR + " user:" + this.haE.Nq());
      t.mp(this.euR);
      com.tencent.mm.plugin.report.service.g.ork.i(10420, new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(this.haG), Integer.valueOf(0) });
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(335007449088L, 2496);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 219L, 1L, false);
      w.e("MicroMsg.NetSceneUploadVideo", "ERR: onGYNetEnd FAILED (WILL RETRY) errtype:" + paramInt2 + " errCode:" + paramInt3 + "  file:" + this.euR + " user:" + this.haE.Nq());
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(335007449088L, 2496);
      return;
    }
    if ((!bg.bq(paramq.uCB.uNP.tJp)) && (paramq.uCA != paramArrayOfByte.uCA - paramq.uCB.uNN))
    {
      w.e("MicroMsg.NetSceneUploadVideo", "onGYNetEnd Err Thumb Pos:[" + paramq.uCA + "," + paramq.uCB.uNN + "," + paramArrayOfByte.uCA + "] file:" + this.euR + " user:" + paramq.lSX);
      t.mp(this.euR);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(335007449088L, 2496);
      return;
    }
    if ((!bg.bq(paramq.uWh.uNP.tJp)) && (paramq.uWg != paramArrayOfByte.uWg - paramq.uWh.uNN))
    {
      w.e("MicroMsg.NetSceneUploadVideo", "onGYNetEnd Err Thumb Pos:[" + paramq.uWg + "," + paramq.uWh.uNN + "," + paramArrayOfByte.uWg + "] file:" + this.euR + " user:" + paramq.lSX);
      t.mp(this.euR);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(335007449088L, 2496);
      return;
    }
    this.haE.hct = bg.Pu();
    this.haE.eSf = paramArrayOfByte.tQd;
    this.haE.eQl = 1028;
    w.d("MicroMsg.NetSceneUploadVideo", "dkmsgid  set svrmsgid %d -> %d", new Object[] { Long.valueOf(this.haE.eSf), Integer.valueOf(com.tencent.mm.platformtools.r.hkk) });
    if ((10007 == com.tencent.mm.platformtools.r.hkj) && (com.tencent.mm.platformtools.r.hkk != 0) && (this.haE.eSf != 0L))
    {
      this.haE.eSf = com.tencent.mm.platformtools.r.hkk;
      com.tencent.mm.platformtools.r.hkk = 0;
    }
    int i = 0;
    paramInt1 = this.haE.status;
    if (paramInt1 == 103)
    {
      paramArrayOfByte = this.haE;
      paramInt1 = paramq.uCA;
      paramArrayOfByte.hcq = (paramq.uCB.uNN + paramInt1);
      this.haE.eQl |= 0x40;
      paramInt1 = i;
      if (this.haE.hcq >= this.haE.hcr)
      {
        this.haE.status = 104;
        this.haE.eQl |= 0x100;
        paramInt1 = i;
      }
    }
    for (;;)
    {
      t.e(this.haE);
      if (!this.haH) {
        break label1708;
      }
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(335007449088L, 2496);
      return;
      if (paramInt1 != 104) {
        break;
      }
      paramArrayOfByte = this.haE;
      paramInt1 = paramq.uWg;
      paramArrayOfByte.hbc = (paramq.uWh.uNN + paramInt1);
      this.haE.eQl |= 0x8;
      paramInt1 = i;
      if (this.haE.hbc >= this.haE.gsL)
      {
        this.haE.status = 199;
        this.haE.eQl |= 0x100;
        t.c(this.haE);
        paramInt1 = 1;
      }
    }
    w.e("MicroMsg.NetSceneUploadVideo", "onGYNetEnd ERROR STATUS:" + paramInt1 + " file:" + this.euR + " user:" + paramq.lSX);
    t.mp(this.euR);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(335007449088L, 2496);
    return;
    label1708:
    if (paramInt1 == 0)
    {
      this.gsj.z(10L, 10L);
      GMTrace.o(335007449088L, 2496);
      return;
    }
    paramq = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(this.haE.hcw);
    com.tencent.mm.modelstat.b.gWv.f(paramq);
    com.tencent.mm.plugin.report.service.g.ork.i(10420, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(this.haG), Integer.valueOf(this.haE.gsL - this.hbc) });
    boolean bool;
    if (this.haE == null)
    {
      bool = false;
      if ((!bool) && (!com.tencent.mm.y.s.fP(this.haE.Nq()))) {
        break label2257;
      }
      w.i("MicroMsg.NetSceneUploadVideo", "upload to biz :%s", new Object[] { this.haE.Nq() });
      if (this.haE.eSf < 0L)
      {
        w.e("MicroMsg.NetSceneUploadVideo", "ERR: finish video invaild MSGSVRID :" + this.haE.eSf + " file:" + this.euR + " toUser:" + this.haE.Nq());
        t.mp(this.euR);
      }
      label1987:
      if (this.gMa == null) {
        break label2345;
      }
    }
    label2257:
    label2345:
    for (long l = this.gMa.tD();; l = 0L)
    {
      w.d("MicroMsg.NetSceneUploadVideo", "!!!FIN: file:" + this.euR + " toUser:" + this.haE.Nq() + " msgsvrid:" + this.haE.eSf + " thumbsize:" + this.haE.hcr + " videosize:" + this.haE.gsL + " useTime:" + l);
      w.d("MicroMsg.NetSceneUploadVideo", "FinishLogForTime file:" + this.euR + " packSize:" + haZ + " filesize:" + this.haE.gsL + " useTime:" + l);
      a.a(this.haE, 0);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(335007449088L, 2496);
      return;
      paramq = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(this.haE.Nq());
      if ((paramq == null) || ((int)paramq.fTq <= 0))
      {
        bool = false;
        break;
      }
      bool = paramq.bSA();
      break;
      w.i("MicroMsg.NetSceneUploadVideo", "not upload to biz");
      if (this.haE.eSf > 0L) {
        break label1987;
      }
      w.e("MicroMsg.NetSceneUploadVideo", "ERR: finish video invaild MSGSVRID :" + this.haE.eSf + " file:" + this.euR + " toUser:" + this.haE.Nq());
      t.mp(this.euR);
      break label1987;
    }
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(334739013632L, 2494);
    com.tencent.mm.plugin.report.service.g.ork.a(111L, 221L, 1L, false);
    t.mp(this.euR);
    GMTrace.o(334739013632L, 2494);
  }
  
  protected final void cancel()
  {
    GMTrace.i(20976083402752L, 156284);
    w.i("MicroMsg.NetSceneUploadVideo", "%s stop %s", new Object[] { MY(), this.gIp });
    if (!bg.nm(this.gIp)) {
      com.tencent.mm.modelcdntran.g.Gk().jy(this.gIp);
    }
    this.haH = true;
    super.cancel();
    GMTrace.o(20976083402752L, 156284);
  }
  
  public final int getType()
  {
    GMTrace.i(335141666816L, 2497);
    GMTrace.o(335141666816L, 2497);
    return 149;
  }
  
  protected final int vB()
  {
    GMTrace.i(334604795904L, 2493);
    int i = this.MAX_TIMES;
    GMTrace.o(334604795904L, 2493);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvideo\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */