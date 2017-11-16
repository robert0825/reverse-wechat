package com.tencent.mm.ao;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.c.c;
import com.tencent.mm.plugin.n.a;
import com.tencent.mm.protocal.c.abp;
import com.tencent.mm.protocal.c.abq;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.KVStatHelper;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.s;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import junit.framework.Assert;

public final class j
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public String TAG;
  public au eAH;
  private long eDr;
  public long fUI;
  private final com.tencent.mm.ad.b fUa;
  public com.tencent.mm.ad.e fUd;
  private int gGV;
  public final com.tencent.mm.ad.f gIl;
  public final long gIm;
  private int gIn;
  private com.tencent.mm.modelstat.g gIo;
  public String gIp;
  public int gIq;
  private String gIr;
  public String gIs;
  int gIt;
  public boolean gIu;
  private int gIv;
  private String gIw;
  private int gIx;
  public boolean gIy;
  private i.a gIz;
  public int gsL;
  private int startOffset;
  public long startTime;
  private int token;
  
  public j(long paramLong1, long paramLong2, int paramInt, com.tencent.mm.ad.f paramf)
  {
    this(paramLong1, paramLong2, paramInt, paramf, -1);
    GMTrace.i(3542945366016L, 26397);
    GMTrace.o(3542945366016L, 26397);
  }
  
  public j(long paramLong1, long paramLong2, int paramInt1, final com.tencent.mm.ad.f paramf, int paramInt2)
  {
    GMTrace.i(3543079583744L, 26398);
    this.TAG = "MicroMsg.NetSceneGetMsgImg";
    this.gIo = null;
    this.eDr = -1L;
    this.eAH = null;
    this.gIp = "";
    this.startTime = 0L;
    this.startOffset = -1;
    this.gIq = 0;
    this.gIr = "";
    this.gIs = "";
    this.gsL = 0;
    this.gIt = -1;
    this.gIu = false;
    this.gIv = -1;
    this.gIw = null;
    this.gIx = 0;
    this.token = -1;
    this.gIy = false;
    this.gIz = new i.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
      {
        GMTrace.i(3527107674112L, 26279);
        if (paramAnonymousInt == 44530)
        {
          w.i(j.this.TAG, "cdntra  ERR_CNDCOM_MEDIA_IS_DOWNLOADING clientid:%s", new Object[] { j.this.gIp });
          GMTrace.o(3527107674112L, 26279);
          return 0;
        }
        long l1;
        long l2;
        int i;
        int j;
        int k;
        if (paramAnonymousInt != 0)
        {
          h.gv((int)j.this.gIm);
          h.gu((int)j.this.gIm);
          localObject = com.tencent.mm.plugin.report.service.g.ork;
          l1 = j.this.startTime;
          l2 = bg.Pv();
          i = com.tencent.mm.modelcdntran.d.bc(ab.getContext());
          j = j.this.gIq;
          k = j.this.gsL;
          if (paramAnonymouskeep_SceneResult == null)
          {
            paramAnonymousString = "";
            if (paramAnonymouskeep_SceneResult != null) {
              break label482;
            }
            paramAnonymouskeep_ProgressInfo = "";
            label141:
            ((com.tencent.mm.plugin.report.service.g)localObject).i(10421, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(2), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), paramAnonymousString, "", "", "", "", "", "", "", paramAnonymouskeep_ProgressInfo });
            localObject = com.tencent.mm.plugin.report.service.g.ork;
            l1 = j.this.startTime;
            l2 = bg.Pv();
            i = com.tencent.mm.modelcdntran.d.bc(ab.getContext());
            j = j.this.gIq;
            k = j.this.gsL;
            if (paramAnonymouskeep_SceneResult != null) {
              break label491;
            }
            paramAnonymousString = "";
            label314:
            if (paramAnonymouskeep_SceneResult != null) {
              break label500;
            }
          }
          label482:
          label491:
          label500:
          for (paramAnonymouskeep_ProgressInfo = "";; paramAnonymouskeep_ProgressInfo = paramAnonymouskeep_SceneResult.report_Part2)
          {
            ((com.tencent.mm.plugin.report.service.g)localObject).i(13937, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(2), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), paramAnonymousString, "", "", "", "", "", "", "", paramAnonymouskeep_ProgressInfo });
            j.this.fUd.a(3, paramAnonymousInt, "", j.this);
            GMTrace.o(3527107674112L, 26279);
            return 0;
            paramAnonymousString = paramAnonymouskeep_SceneResult.field_transInfo;
            break;
            paramAnonymouskeep_ProgressInfo = paramAnonymouskeep_SceneResult.report_Part2;
            break label141;
            paramAnonymousString = paramAnonymouskeep_SceneResult.field_transInfo;
            break label314;
          }
        }
        Object localObject = n.IZ().b(Long.valueOf(j.this.fUI));
        if (paramAnonymouskeep_ProgressInfo != null)
        {
          if (paramAnonymouskeep_ProgressInfo.field_finishedLength == j.this.gsL)
          {
            w.d(j.this.TAG, "cdntra ignore progress 100%");
            GMTrace.o(3527107674112L, 26279);
            return 0;
          }
          j.this.gIy = true;
          if (!j.this.gIu) {
            j.this.gIu = paramAnonymouskeep_ProgressInfo.field_mtlnotify;
          }
          w.i(j.this.TAG, "cdntra progresscallback id:%s finish:%d total:%d,  canshowProgressimg:%b", new Object[] { j.this.gIp, Integer.valueOf(paramAnonymouskeep_ProgressInfo.field_finishedLength), Integer.valueOf(paramAnonymouskeep_ProgressInfo.field_toltalLength), Boolean.valueOf(j.this.gIu) });
          j.this.a((d)localObject, j.this.gsL, ((d)localObject).offset, paramAnonymouskeep_ProgressInfo.field_finishedLength - ((d)localObject).offset, null);
          GMTrace.o(3527107674112L, 26279);
          return 0;
        }
        if (paramAnonymouskeep_SceneResult != null)
        {
          if (paramAnonymouskeep_SceneResult.field_retCode == 0) {
            break label1169;
          }
          h.gu((int)j.this.gIm);
          w.e(j.this.TAG, "cdntra sceneResult.retCode :%d", new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode) });
          j.this.fUd.a(3, paramAnonymouskeep_SceneResult.field_retCode, "", j.this);
          localObject = com.tencent.mm.plugin.report.service.g.ork;
          paramAnonymousInt = paramAnonymouskeep_SceneResult.field_retCode;
          l1 = j.this.startTime;
          l2 = bg.Pv();
          i = com.tencent.mm.modelcdntran.d.bc(ab.getContext());
          j = j.this.gIq;
          k = j.this.gsL;
          if (paramAnonymouskeep_SceneResult != null) {
            break label1544;
          }
          paramAnonymousString = "";
          label835:
          if (paramAnonymouskeep_SceneResult != null) {
            break label1553;
          }
          paramAnonymouskeep_ProgressInfo = "";
          label843:
          ((com.tencent.mm.plugin.report.service.g)localObject).i(10421, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(2), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), paramAnonymousString, "", "", "", "", "", "", "", paramAnonymouskeep_ProgressInfo });
          if (paramAnonymouskeep_SceneResult.field_retCode != 0)
          {
            localObject = com.tencent.mm.plugin.report.service.g.ork;
            paramAnonymousInt = paramAnonymouskeep_SceneResult.field_retCode;
            l1 = j.this.startTime;
            l2 = bg.Pv();
            i = com.tencent.mm.modelcdntran.d.bc(ab.getContext());
            j = j.this.gIq;
            k = j.this.gsL;
            if (paramAnonymouskeep_SceneResult != null) {
              break label1562;
            }
            paramAnonymousString = "";
            label1030:
            if (paramAnonymouskeep_SceneResult != null) {
              break label1571;
            }
          }
        }
        label1169:
        label1263:
        label1399:
        label1465:
        label1497:
        label1505:
        label1544:
        label1553:
        label1562:
        label1571:
        for (paramAnonymouskeep_ProgressInfo = "";; paramAnonymouskeep_ProgressInfo = paramAnonymouskeep_SceneResult.report_Part2)
        {
          ((com.tencent.mm.plugin.report.service.g)localObject).i(13937, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(2), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), paramAnonymousString, "", "", "", "", "", "", "", paramAnonymouskeep_ProgressInfo });
          GMTrace.o(3527107674112L, 26279);
          return 0;
          w.i(j.this.TAG, "cdntra getimg ok. need convert:%b", new Object[] { Boolean.valueOf(paramAnonymouskeep_SceneResult.field_convert2baseline) });
          if (((d)localObject).gGV == 1)
          {
            com.tencent.mm.plugin.report.service.g.ork.a(198L, 26L, ((d)localObject).gsL, false);
            com.tencent.mm.plugin.report.service.g.ork.a(198L, 27L, 1L, false);
            paramAnonymouskeep_ProgressInfo = com.tencent.mm.plugin.report.service.g.ork;
            if (j.this.eAH != null)
            {
              paramAnonymousString = j.this.eAH.field_talker;
              if (!s.eb(paramAnonymousString)) {
                break label1399;
              }
            }
            for (l1 = 29L;; l1 = 28L)
            {
              paramAnonymouskeep_ProgressInfo.a(198L, l1, 1L, false);
              if (paramAnonymouskeep_SceneResult.field_convert2baseline)
              {
                w.i(j.this.TAG, "cdntra need convert2baseline. file:%s", new Object[] { j.this.gIs });
                paramAnonymousBoolean = MMNativeJpeg.Convert2Baseline(j.this.gIs, 60);
                w.i(j.this.TAG, "convert result:%b", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
              }
              if (!j.this.gIy) {
                break label1505;
              }
              j.this.a((d)localObject, ((d)localObject).offset, ((d)localObject).offset, 0, null);
              break;
              paramAnonymousString = "";
              break label1263;
            }
          }
          com.tencent.mm.plugin.report.service.g.ork.a(198L, 21L, ((d)localObject).gsL, false);
          com.tencent.mm.plugin.report.service.g.ork.a(198L, 22L, 1L, false);
          paramAnonymouskeep_ProgressInfo = com.tencent.mm.plugin.report.service.g.ork;
          if (j.this.eAH != null)
          {
            paramAnonymousString = j.this.eAH.field_talker;
            if (!s.eb(paramAnonymousString)) {
              break label1497;
            }
          }
          for (l1 = 24L;; l1 = 23L)
          {
            paramAnonymouskeep_ProgressInfo.a(198L, l1, 1L, false);
            break;
            paramAnonymousString = "";
            break label1465;
          }
          j.this.a((d)localObject, j.this.gsL, ((d)localObject).offset, j.this.gsL - ((d)localObject).offset, null);
          break;
          paramAnonymousString = paramAnonymouskeep_SceneResult.field_transInfo;
          break label835;
          paramAnonymouskeep_ProgressInfo = paramAnonymouskeep_SceneResult.report_Part2;
          break label843;
          paramAnonymousString = paramAnonymouskeep_SceneResult.field_transInfo;
          break label1030;
        }
      }
      
      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
        GMTrace.i(3527241891840L, 26280);
        GMTrace.o(3527241891840L, 26280);
      }
      
      public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(3527376109568L, 26281);
        GMTrace.o(3527376109568L, 26281);
        return null;
      }
    };
    boolean bool;
    d locald;
    if ((paramLong1 >= 0L) && (paramLong2 >= 0L) && (paramf != null))
    {
      bool = true;
      Assert.assertTrue(bool);
      this.gIl = paramf;
      this.gGV = paramInt1;
      this.gIm = paramLong1;
      this.fUI = paramLong1;
      this.eDr = paramLong2;
      this.gIv = paramInt2;
      locald = n.IZ().b(Long.valueOf(this.fUI));
      if (paramInt1 != 1) {
        break label584;
      }
      this.fUI = locald.gHb;
      locald = n.IZ().b(Long.valueOf(this.fUI));
    }
    label584:
    for (;;)
    {
      this.TAG = (this.TAG + "[" + this.fUI + "]");
      Object localObject = new b.a();
      ((b.a)localObject).gtF = new abp();
      ((b.a)localObject).gtG = new abq();
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getmsgimg";
      ((b.a)localObject).gtE = 109;
      ((b.a)localObject).gtH = 10;
      ((b.a)localObject).gtI = 1000000010;
      this.fUa = ((b.a)localObject).DA();
      localObject = (abp)this.fUa.gtC.gtK;
      this.eAH = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(paramLong2);
      ((abp)localObject).tRD = locald.offset;
      ((abp)localObject).tRC = locald.gsL;
      w.d(this.TAG, "cdntra offset:%d total:%d stack:[%s]", new Object[] { Integer.valueOf(locald.offset), Integer.valueOf(locald.gsL), bg.bQW() });
      ((abp)localObject).tQd = this.eAH.field_msgSvrId;
      ((abp)localObject).tPW = new azq().Rq(this.eAH.field_talker);
      ((abp)localObject).tPX = new azq().Rq((String)com.tencent.mm.kernel.h.xy().xh().get(2, null));
      ((abp)localObject).usj = paramInt1;
      if (locald.offset == 0) {
        this.gIo = new com.tencent.mm.modelstat.g(109, false, locald.gsL);
      }
      this.gIn = 8192;
      if (paramf != null) {
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(3530865770496L, 26307);
            paramf.a(this.gIB, this.gIC, j.this);
            GMTrace.o(3530865770496L, 26307);
          }
        });
      }
      GMTrace.o(3543079583744L, 26398);
      return;
      bool = false;
      break;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(3543616454656L, 26402);
    this.fUd = parame1;
    abp localabp = (abp)this.fUa.gtC.gtK;
    d locald = n.IZ().b(Long.valueOf(this.fUI));
    if (locald.gGR == 0L)
    {
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 195L, 1L, false);
      w.e(this.TAG, "doScene id:%d  img:%s", new Object[] { Long.valueOf(this.fUI), locald });
      GMTrace.o(3543616454656L, 26402);
      return -1;
    }
    if (locald.status != 0)
    {
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 194L, 1L, false);
      w.e(this.TAG, "doSceneError, id:%d, status:%d", new Object[] { Long.valueOf(locald.gGR), Integer.valueOf(locald.status) });
      GMTrace.o(3543616454656L, 26402);
      return -1;
    }
    parame1 = locald.gGS;
    if (parame1.startsWith("SERVERID://"))
    {
      this.gIr = com.tencent.mm.a.g.n(locald.gGS.getBytes());
      this.gIs = n.IZ().l(this.gIr, null, ".temp");
      locald.jZ(this.gIr + ".temp");
      n.IZ().a(Long.valueOf(this.fUI), locald);
      w.i(this.TAG, "doscene id:%d comp:%d off:%d total:%d name:%s tmp:%s full:%s", new Object[] { Long.valueOf(locald.gGR), Integer.valueOf(this.gGV), Integer.valueOf(locald.offset), Integer.valueOf(locald.gsL), parame1, this.gIr, this.gIs });
      if (this.startTime == 0L)
      {
        this.startTime = bg.Pv();
        this.startOffset = locald.offset;
        if (this.gGV != 1) {
          break label486;
        }
        i = com.tencent.mm.modelcdntran.b.MediaType_FULLSIZEIMAGE;
        label387:
        this.gIq = i;
      }
      parame1 = localabp.tPW.uNR;
      long l = localabp.tQd;
      if (!bg.nm(locald.gHc)) {
        break label493;
      }
      i = 0;
    }
    for (;;)
    {
      if (i == 0) {
        break label1558;
      }
      w.d(this.TAG, "cdntra this img use cdn : %s", new Object[] { this.gIp });
      GMTrace.o(3543616454656L, 26402);
      return 0;
      this.gIr = locald.gGS;
      this.gIs = n.IZ().l(this.gIr, null, "");
      break;
      label486:
      i = com.tencent.mm.modelcdntran.b.MediaType_IMAGE;
      break label387;
      label493:
      Object localObject = bh.q(locald.gHc, "msg");
      if (localObject == null)
      {
        w.e(this.TAG, "parse cdnInfo failed. [%s]", new Object[] { locald.gHc });
        i = 0;
      }
      else
      {
        this.gsL = 0;
        if (this.gGV != 1) {
          parame1 = (String)((Map)localObject).get(".msg.img.$cdnmidimgurl");
        }
        for (this.gsL = bg.getInt((String)((Map)localObject).get(".msg.img.$length"), 0);; this.gsL = bg.getInt((String)((Map)localObject).get(".msg.img.$hdlength"), 0))
        {
          w.d(this.TAG, "cdntra read xml  comptype:%d totallen:%d url:[%s]", new Object[] { Integer.valueOf(this.gGV), Integer.valueOf(this.gsL), parame1 });
          if (!bg.nm(parame1)) {
            break label684;
          }
          w.e(this.TAG, "cdntra get cdnUrlfailed.");
          i = 0;
          break;
          parame1 = (String)((Map)localObject).get(".msg.img.$cdnbigimgurl");
        }
        label684:
        String str1 = (String)((Map)localObject).get(".msg.img.$aeskey");
        if (bg.nm(str1))
        {
          w.e(this.TAG, "cdntra get aes key failed.");
          i = 0;
        }
        else
        {
          this.gIp = com.tencent.mm.modelcdntran.d.a("downimg", locald.gGY, this.eAH.field_talker, this.eAH.field_msgId);
          if (bg.nm(this.gIp))
          {
            w.w(this.TAG, "cdntra genClientId failed not use cdn imgLocalId:%d", new Object[] { Long.valueOf(this.fUI) });
            i = 0;
          }
          else
          {
            String str2 = (String)((Map)localObject).get(".msg.img.$md5");
            if ((!bg.nm(str2)) && ((bg.nm((String)((Map)localObject).get(".msg.img.$cdnbigimgurl"))) || (this.gGV == 1)))
            {
              a.aHB();
              String str3 = a.yR().cN(str2, this.gsL);
              i = com.tencent.mm.a.e.aY(str3);
              int j = this.gsL - i;
              String str4 = this.TAG;
              int k = this.gsL;
              localObject = ((Map)localObject).get(".msg.img.$cdnbigimgurl");
              if (this.gGV == 1) {}
              for (boolean bool = true;; bool = false)
              {
                w.i(str4, "MediaCheckDuplicationStorage: totallen:%s md5:%s big:%s NOcompress:%s  dup(len:%d path:%s) diffLen:%d to:%s", new Object[] { Integer.valueOf(k), str2, localObject, Boolean.valueOf(bool), Integer.valueOf(i), str3, Integer.valueOf(j), this.gIs });
                if (bg.nm(str3)) {
                  break label1206;
                }
                if ((j < 0) || (j > 16)) {
                  break label1220;
                }
                bool = com.tencent.mm.sdk.platformtools.j.eR(str3, this.gIs);
                w.i(this.TAG, "MediaCheckDuplicationStorage copy dup file now :%s -> %s [%b]", new Object[] { str3, this.gIs, Boolean.valueOf(bool) });
                a(locald, this.gsL, this.gsL, 0, null);
                if (this.eAH != null) {
                  ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(new c.c(this.eAH.field_talker, "update", this.eAH));
                }
                com.tencent.mm.plugin.report.service.g.ork.i(13267, new Object[] { parame1, Long.valueOf(this.eAH.field_msgSvrId), str2, Long.valueOf(this.eAH.field_createTime / 1000L), this.eAH.field_talker, Integer.valueOf(3), Integer.valueOf(i) });
                i = 1;
                break;
              }
              label1206:
              this.gIw = str2;
              this.gIx = this.gsL;
            }
            label1220:
            localObject = new i();
            ((i)localObject).field_mediaId = this.gIp;
            ((i)localObject).field_fullpath = this.gIs;
            ((i)localObject).field_fileType = this.gIq;
            ((i)localObject).field_totalLen = this.gsL;
            ((i)localObject).field_aesKey = str1;
            ((i)localObject).field_fileId = parame1;
            ((i)localObject).field_priority = com.tencent.mm.modelcdntran.b.gzd;
            ((i)localObject).gAB = this.gIz;
            if (s.eb(this.eAH.field_talker))
            {
              i = 1;
              label1310:
              ((i)localObject).field_chattype = i;
              w.i(this.TAG, "cdnautostart %s %b", new Object[] { "image_" + this.eAH.field_msgId, Boolean.valueOf(com.tencent.mm.modelcdntran.g.Gk().gzL.contains("image_" + this.eAH.field_msgId)) });
              if (!com.tencent.mm.modelcdntran.g.Gk().gzL.contains("image_" + this.eAH.field_msgId)) {
                break label1534;
              }
              com.tencent.mm.modelcdntran.g.Gk().gzL.remove("image_" + this.eAH.field_msgId);
            }
            label1534:
            for (((i)localObject).field_autostart = true;; ((i)localObject).field_autostart = false)
            {
              if (com.tencent.mm.modelcdntran.g.Gk().b((i)localObject, this.gIv)) {
                break label1543;
              }
              com.tencent.mm.plugin.report.service.g.ork.a(111L, 196L, 1L, false);
              w.e(this.TAG, "addRecvTask failed :%s", new Object[] { this.gIp });
              this.gIp = "";
              i = 0;
              break;
              i = 0;
              break label1310;
            }
            label1543:
            w.d(this.TAG, "add recv task");
            i = 1;
          }
        }
      }
    }
    label1558:
    w.d(this.TAG, "cdntra this img NOT USE CDN: %s", new Object[] { this.gIp });
    locald.kc("");
    locald.eQl = 4096;
    n.IZ().a(Long.valueOf(this.fUI), locald);
    localabp.tRD = locald.offset;
    localabp.tRE = this.gIn;
    localabp.tRC = locald.gsL;
    if (this.gIo != null) {
      this.gIo.Mn();
    }
    int i = a(parame, this.fUa, this);
    GMTrace.o(3543616454656L, 26402);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(3543348019200L, 26400);
    int i = k.b.gum;
    GMTrace.o(3543348019200L, 26400);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(3543884890112L, 26404);
    if ((paramInt2 == 3) && (paramInt3 == -1) && (!bg.nm(this.gIp)))
    {
      w.w(this.TAG, "cdntra using cdn trans,  wait cdn service callback! clientid:%s", new Object[] { this.gIp });
      GMTrace.o(3543884890112L, 26404);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if (paramInt2 == 4)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(111L, 193L, 1L, false);
        com.tencent.mm.plugin.report.service.g.ork.i(10420, new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(2), Long.valueOf(this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(ab.getContext())), Integer.valueOf(this.gIq), Integer.valueOf(this.gsL - this.startOffset) });
      }
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(3543884890112L, 26404);
      return;
    }
    paramString = (abq)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    paramq = n.IZ().b(Long.valueOf(this.fUI));
    paramInt1 = 0;
    if (paramString.tRE <= 0)
    {
      w.e(this.TAG, "flood control, malformed data_len");
      paramInt1 = -1;
    }
    while (paramInt1 != 0)
    {
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 192L, 1L, false);
      com.tencent.mm.plugin.report.service.g.ork.i(10420, new Object[] { Integer.valueOf(-1), Integer.valueOf(2), Long.valueOf(this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(ab.getContext())), Integer.valueOf(this.gIq), Integer.valueOf(this.gsL - this.startOffset) });
      this.fUd.a(4, -1, "", this);
      GMTrace.o(3543884890112L, 26404);
      return;
      if ((paramString.ues == null) || (paramString.tRE != paramString.ues.uNN))
      {
        w.e(this.TAG, "flood control, malformed data is null or dataLen not match with data buf length");
        paramInt1 = -1;
      }
      else if ((paramString.tRD < 0) || (paramString.tRD + paramString.tRE > paramString.tRC))
      {
        w.e(this.TAG, "flood control, malformed start pos");
        paramInt1 = -1;
      }
      else if (paramString.tRD != paramq.offset)
      {
        w.e(this.TAG, "flood control, malformed start_pos");
        paramInt1 = -1;
      }
      else if (paramString.tRC <= 0)
      {
        w.e(this.TAG, "flood control, malformed total_len");
        paramInt1 = -1;
      }
    }
    if ((a(paramq, paramString.tRC, paramString.tRD, paramString.tRE, paramString.ues.uNP.tJp)) && (a(this.gtW, this.fUd) < 0)) {
      this.fUd.a(3, -1, "", this);
    }
    GMTrace.o(3543884890112L, 26404);
  }
  
  public final boolean a(final d paramd, int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    GMTrace.i(3544019107840L, 26405);
    paramd.gm(paramInt1);
    paramd.setOffset(paramInt2 + paramInt3);
    this.gIn = paramInt3;
    if (paramArrayOfByte != null) {
      com.tencent.mm.a.e.d(this.gIs, paramArrayOfByte);
    }
    w.d(this.TAG, "onGYNetEnd : offset = " + paramd.offset + " totalLen = " + paramd.gsL + " stack:[%s]", new Object[] { bg.bQW() });
    if (paramd.IH())
    {
      paramArrayOfByte = this.gIs;
      if ((paramArrayOfByte == null) || (paramArrayOfByte.equals(""))) {
        paramArrayOfByte = "";
      }
    }
    for (;;)
    {
      Object localObject = new MMBitmapFactory.DecodeResultLogger();
      boolean bool = MMBitmapFactory.checkIsImageLegal(this.gIs, (MMBitmapFactory.DecodeResultLogger)localObject);
      File localFile = new File(this.gIs);
      if (bool)
      {
        localObject = n.IZ().l(this.gIr, null, paramArrayOfByte);
        w.i(this.TAG, "sceneEndproc ext:%s tmp:%s tmpfull:%s full:%s ", new Object[] { paramArrayOfByte, this.gIr, this.gIs, localObject });
        localFile.renameTo(new File((String)localObject));
        paramd.jZ(this.gIr + paramArrayOfByte);
        paramd.jY(FileOp.ld((String)localObject));
        paramd.gq(this.gGV);
      }
      for (paramArrayOfByte = (byte[])localObject;; paramArrayOfByte = null)
      {
        if (n.IZ().a(Long.valueOf(this.fUI), paramd) >= 0) {
          break label541;
        }
        w.e(this.TAG, "onGYNetEnd : update img fail");
        this.fUd.a(3, -1, "", this);
        GMTrace.o(3544019107840L, 26405);
        return false;
        paramArrayOfByte = com.tencent.mm.a.e.c(paramArrayOfByte, 0, 2);
        if ((paramArrayOfByte == null) || (paramArrayOfByte.length < 2))
        {
          paramArrayOfByte = "";
          break;
        }
        paramInt3 = paramArrayOfByte[0];
        paramInt2 = paramInt3;
        if (paramInt3 < 0) {
          paramInt2 = paramInt3 + 256;
        }
        int i = paramArrayOfByte[1];
        paramInt3 = i;
        if (i < 0) {
          paramInt3 = i + 256;
        }
        if ((paramInt2 == 66) && (paramInt3 == 77))
        {
          paramArrayOfByte = ".bmp";
          break;
        }
        if ((paramInt2 == 255) && (paramInt3 == 216))
        {
          paramArrayOfByte = ".jpg";
          break;
        }
        if ((paramInt2 == 137) && (paramInt3 == 80))
        {
          paramArrayOfByte = ".png";
          break;
        }
        if ((paramInt2 != 71) || (paramInt3 != 73)) {
          break label911;
        }
        paramArrayOfByte = ".gif";
        break;
        localFile.delete();
        if (((MMBitmapFactory.DecodeResultLogger)localObject).getDecodeResult() >= 2000)
        {
          paramArrayOfByte = MMBitmapFactory.KVStatHelper.getKVStatString(this.gIs, 2, (MMBitmapFactory.DecodeResultLogger)localObject);
          com.tencent.mm.plugin.report.service.g.ork.A(12712, paramArrayOfByte);
        }
      }
      label541:
      if (this.gIl != null) {
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(3529926246400L, 26300);
            j.this.gIl.a(paramd.offset, paramd.gsL, j.this);
            GMTrace.o(3529926246400L, 26300);
          }
        });
      }
      w.d(this.TAG, "cdntra check iscompleted :%b clientid:%s", new Object[] { Boolean.valueOf(paramd.IH()), this.gIp });
      if (paramd.IH())
      {
        if (bg.nm(this.gIp)) {
          com.tencent.mm.plugin.report.service.g.ork.i(10420, new Object[] { Integer.valueOf(0), Integer.valueOf(2), Long.valueOf(this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(ab.getContext())), Integer.valueOf(this.gIq), Integer.valueOf(paramInt1 - this.startOffset) });
        }
        bool = false;
        if (this.gIt > 0) {
          bool = n.IZ().a(paramArrayOfByte, paramd.gGU, this.gIt, 1);
        }
        if (bool)
        {
          paramd.fwA = 1;
          paramd.gHs = true;
          ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(this.eAH.field_msgId, this.eAH);
        }
        n.IZ().a(Long.valueOf(this.fUI), paramd);
        w.d(this.TAG, "cdntra ext:%s %s %s  MediaCheckDuplicationStorage md5:%s", new Object[] { this.gIs, paramArrayOfByte, paramd.gGS, this.gIw });
        if (this.gIo != null) {
          this.gIo.ay(paramd.gsL);
        }
        if ((!bg.nm(this.gIw)) && (this.gIx > 0))
        {
          a.aHB();
          a.yR().u(this.gIw, this.gIx, paramArrayOfByte);
        }
        this.fUd.a(0, 0, "", this);
        GMTrace.o(3544019107840L, 26405);
        return false;
      }
      GMTrace.o(3544019107840L, 26405);
      return true;
      label911:
      paramArrayOfByte = ".jpg";
    }
  }
  
  protected final void cancel()
  {
    GMTrace.i(3543482236928L, 26401);
    if ((!bg.nm(this.gIp)) && (com.tencent.mm.modelcdntran.g.Gk() != null))
    {
      w.d(this.TAG, "cancel recv task");
      com.tencent.mm.modelcdntran.g.Gk().jz(this.gIp);
    }
    super.cancel();
    GMTrace.o(3543482236928L, 26401);
  }
  
  public final int getType()
  {
    GMTrace.i(15343099576320L, 114315);
    GMTrace.o(15343099576320L, 114315);
    return 109;
  }
  
  protected final int vB()
  {
    GMTrace.i(3543213801472L, 26399);
    if (this.gGV == 0)
    {
      GMTrace.o(3543213801472L, 26399);
      return 100;
    }
    GMTrace.o(3543213801472L, 26399);
    return 1280;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */