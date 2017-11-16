package com.tencent.mm.pluginsdk.model.app;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.g.a.n.a;
import com.tencent.mm.g.a.tm;
import com.tencent.mm.g.a.tm.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bbh;
import com.tencent.mm.protocal.c.bbi;
import com.tencent.mm.protocal.c.bhd;
import com.tencent.mm.protocal.c.bhf;
import com.tencent.mm.protocal.c.cv;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aj;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.x;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.be;
import com.tencent.mm.y.m;
import com.tencent.mm.y.t;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;
import junit.framework.Assert;

public final class ah
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public long eDr;
  public au eRz;
  private com.tencent.mm.ad.b fUa;
  public com.tencent.mm.ad.e fUd;
  public String gIp;
  private i.a gIz;
  public String hNz;
  public int hbf;
  private tm psv;
  private String qiS;
  public long startTime;
  private com.tencent.mm.g.a.n toz;
  
  public ah(long paramLong, String paramString1, String paramString2)
  {
    GMTrace.i(807051198464L, 6013);
    this.eRz = null;
    this.eDr = 0L;
    this.startTime = 0L;
    this.gIp = "";
    this.hbf = 0;
    this.gIz = new i.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, final keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
      {
        GMTrace.i(826646986752L, 6159);
        w.d("MicroMsg.NetSceneSendAppMsg", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { ah.this.gIp, Integer.valueOf(paramAnonymousInt), paramAnonymouskeep_ProgressInfo, paramAnonymouskeep_SceneResult });
        if (paramAnonymousInt == 44531)
        {
          w.d("MicroMsg.NetSceneSendAppMsg", "cdntra  ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", new Object[] { ah.this.gIp });
          GMTrace.o(826646986752L, 6159);
          return 0;
        }
        if (paramAnonymousInt != 0)
        {
          ah.this.eRz.dB(5);
          com.tencent.mm.plugin.report.d.oqe.a(111L, 34L, 1L, true);
          at.AR();
          com.tencent.mm.y.c.yM().a(ah.this.eRz.field_msgId, ah.this.eRz);
          com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(1), Long.valueOf(ah.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(ab.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_FILE), Integer.valueOf(0), "" });
          ah.this.fUd.a(3, paramAnonymousInt, "", ah.this);
          GMTrace.o(826646986752L, 6159);
          return 0;
        }
        if (paramAnonymouskeep_SceneResult != null)
        {
          if (paramAnonymouskeep_SceneResult.field_retCode != 0)
          {
            w.e("MicroMsg.NetSceneSendAppMsg", "cdntra sceneResult.retCode :%d arg[%s] info[%s]", new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), paramAnonymouskeep_SceneResult.field_arg, paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", paramAnonymouskeep_SceneResult.report_Part2 });
            ah.this.eRz.dB(5);
            com.tencent.mm.plugin.report.d.oqe.a(111L, 34L, 1L, true);
            at.AR();
            com.tencent.mm.y.c.yM().a(ah.this.eRz.field_msgId, ah.this.eRz);
            com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), Integer.valueOf(1), Long.valueOf(ah.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(ab.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_FILE), Integer.valueOf(paramAnonymouskeep_SceneResult.field_fileLength), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", paramAnonymouskeep_SceneResult.report_Part2 });
            com.tencent.mm.plugin.report.service.g.ork.i(13937, new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), Integer.valueOf(1), Long.valueOf(ah.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(ab.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_FILE), Integer.valueOf(paramAnonymouskeep_SceneResult.field_fileLength), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", paramAnonymouskeep_SceneResult.report_Part2 });
            ah.this.fUd.a(3, paramAnonymouskeep_SceneResult.field_retCode, "", ah.this);
          }
        }
        else
        {
          GMTrace.o(826646986752L, 6159);
          return 0;
        }
        if ((ah.this.hbf > 0) && (paramAnonymouskeep_SceneResult.field_fileLength > 0))
        {
          paramAnonymousString = ah.this.hbf + "," + paramAnonymouskeep_SceneResult.field_fileLength + "," + paramAnonymouskeep_SceneResult.field_fileId;
          if (ah.this.hbf * 2 <= paramAnonymouskeep_SceneResult.field_fileLength) {
            break label941;
          }
        }
        label941:
        for (boolean bool = true;; bool = false)
        {
          com.tencent.mm.sdk.platformtools.ai.s("SendAppMsgThumbTooBig", paramAnonymousString, bool);
          w.i("MicroMsg.NetSceneSendAppMsg", "summersafecdn cdnCallback upload attach by cdn, isHitCacheUpload: %d, onlyCheckExist[%b], exist[%b], aesKey[%s], md5[%s]", new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_UploadHitCacheType), Boolean.valueOf(paramAnonymousBoolean), Boolean.valueOf(paramAnonymouskeep_SceneResult.field_exist_whencheck), bg.SJ(paramAnonymouskeep_SceneResult.field_aesKey), paramAnonymouskeep_SceneResult.field_filemd5 });
          at.wS().a(new ai(ah.this.eDr, false, paramAnonymouskeep_SceneResult, new ai.a()
          {
            public final void bb(int paramAnonymous2Int1, int paramAnonymous2Int2)
            {
              GMTrace.i(803427319808L, 5986);
              w.d("MicroMsg.NetSceneSendAppMsg", "summersafecdn cdntra NetSceneSendAppMsgForCdn callback %d,%d", new Object[] { Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2) });
              com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(paramAnonymous2Int2), Integer.valueOf(1), Long.valueOf(ah.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(ab.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_FILE), Integer.valueOf(paramAnonymouskeep_SceneResult.field_fileLength), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", paramAnonymouskeep_SceneResult.report_Part2 });
              ah.this.fUd.a(paramAnonymous2Int1, paramAnonymous2Int2, "", ah.this);
              GMTrace.o(803427319808L, 5986);
            }
          }, ah.this.hNz, null), 0);
          break;
        }
      }
      
      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
        GMTrace.i(826781204480L, 6160);
        GMTrace.o(826781204480L, 6160);
      }
      
      public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(826915422208L, 6161);
        GMTrace.o(826915422208L, 6161);
        return null;
      }
    };
    this.eDr = paramLong;
    this.hNz = paramString1;
    this.qiS = paramString2;
    b.a locala = new b.a();
    locala.gtF = new bbh();
    locala.gtG = new bbi();
    locala.uri = "/cgi-bin/micromsg-bin/sendappmsg";
    locala.gtE = 222;
    locala.gtH = 107;
    locala.gtI = 1000000107;
    this.fUa = locala.DA();
    w.i("MicroMsg.NetSceneSendAppMsg", "summersafecdn NetSceneSendAppMsg msgid[%d], sessionid[%s], signature[%s], stack[%s]", new Object[] { Long.valueOf(paramLong), paramString1, bg.SJ(paramString2), bg.bQW() });
    GMTrace.o(807051198464L, 6013);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(807185416192L, 6014);
    this.fUd = parame1;
    if (this.startTime == 0L) {
      this.startTime = bg.Pv();
    }
    at.AR();
    this.eRz = com.tencent.mm.y.c.yM().cM(this.eDr);
    if ((this.eRz == null) || (this.eRz.field_msgId != this.eDr))
    {
      GMTrace.o(807185416192L, 6014);
      return -1;
    }
    parame1 = f.a.eS(this.eRz.field_content);
    Object localObject1;
    if (parame1 == null)
    {
      localObject1 = aj.Uf(this.eRz.field_content);
      if (bg.nm(((aj)localObject1).vAJ))
      {
        parame1 = new f.a();
        parame1.gix = ((aj)localObject1).eDW;
        parame1.type = 8;
        w.i("MicroMsg.NetSceneSendAppMsg", "create new content. loss appid");
      }
    }
    for (;;)
    {
      localObject1 = "content != null [[" + this.eRz.field_content + "]]";
      if (parame1 != null) {}
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue((String)localObject1, bool);
        if (parame1 != null) {
          break label232;
        }
        this.eRz = null;
        GMTrace.o(807185416192L, 6014);
        return -1;
        parame1 = f.a.eS(((aj)localObject1).vAJ);
        break;
      }
      label232:
      if (!bg.nm(this.eRz.field_imgPath)) {}
      String str;
      for (localObject1 = com.tencent.mm.ao.n.IZ().ke(this.eRz.field_imgPath);; localObject1 = "")
      {
        if ((parame1.type == 8) || (parame1.type == 9) || (parame1.type == 6))
        {
          w.i("MicroMsg.NetSceneSendAppMsg", "cdntra cdn not support Emoji or voiceremind now type:%d", new Object[] { Integer.valueOf(parame1.type) });
          i = 0;
        }
        Object localObject2;
        while (i != 0)
        {
          w.d("MicroMsg.NetSceneSendAppMsg", "cdntra use cdn return -1 for onGYNetEnd clientId:%s", new Object[] { this.gIp });
          GMTrace.o(807185416192L, 6014);
          return 0;
          if (bg.nm((String)localObject1))
          {
            w.i("MicroMsg.NetSceneSendAppMsg", "cdntra cdn not support no thumb msg type:%d", new Object[] { Integer.valueOf(parame1.type) });
            i = 0;
          }
          else
          {
            this.hbf = com.tencent.mm.a.e.aY((String)localObject1);
            if ((parame1.type != 33) && (parame1.type != 36) && (this.hbf >= 262144))
            {
              w.w("MicroMsg.NetSceneSendAppMsg", "cdntra thumb[%s][%d] Too Big Not Use CDN TRANS", new Object[] { localObject1, Integer.valueOf(this.hbf) });
              i = 0;
            }
            else
            {
              w.i("MicroMsg.NetSceneSendAppMsg", "cdntra content.type:%d  thumbPath:%s,  thumbLength:%d ", new Object[] { Integer.valueOf(parame1.type), localObject1, Integer.valueOf(this.hbf) });
              if (!bg.nm(parame1.eAE))
              {
                w.w("MicroMsg.NetSceneSendAppMsg", "cdntra attach has been upload by cdn msgid:%d", new Object[] { Long.valueOf(this.eDr) });
                i = 0;
              }
              else
              {
                com.tencent.mm.modelcdntran.g.Gk();
                if (!com.tencent.mm.modelcdntran.c.fT(4))
                {
                  com.tencent.mm.modelcdntran.g.Gk();
                  w.w("MicroMsg.NetSceneSendAppMsg", "cdntra not use cdn flag:%b ", new Object[] { Boolean.valueOf(com.tencent.mm.modelcdntran.c.fT(4)) });
                  i = 0;
                }
                else
                {
                  this.gIp = com.tencent.mm.modelcdntran.d.a("upappmsg", this.eRz.field_createTime, this.eRz.field_talker, this.eRz.field_msgId);
                  if (bg.nm(this.gIp))
                  {
                    w.w("MicroMsg.NetSceneSendAppMsg", "cdntra genClientId failed not use cdn msgid:%d", new Object[] { Long.valueOf(this.eRz.field_msgId) });
                    i = 0;
                  }
                  else
                  {
                    localObject2 = new i();
                    ((i)localObject2).gAB = this.gIz;
                    ((i)localObject2).field_mediaId = this.gIp;
                    ((i)localObject2).field_fullpath = "";
                    ((i)localObject2).field_thumbpath = ((String)localObject1);
                    ((i)localObject2).field_fileType = com.tencent.mm.modelcdntran.b.MediaType_THUMBIMAGE;
                    ((i)localObject2).field_talker = this.eRz.field_talker;
                    ((i)localObject2).field_priority = com.tencent.mm.modelcdntran.b.gzd;
                    ((i)localObject2).field_needStorage = false;
                    ((i)localObject2).field_isStreamMedia = false;
                    ((i)localObject2).gAB = this.gIz;
                    ((i)localObject2).field_force_aeskeycdn = true;
                    ((i)localObject2).field_trysafecdn = false;
                    w.i("MicroMsg.NetSceneSendAppMsg", "summersafecdn cdntra checkUseCdn content.type[%d], thumb[%s], useCdnTransClientId[%s], fileType[%d], enable_hitcheck[%b], onlycheckexist[%b], force_aeskeycdn[%b], trysafecdn[%b]", new Object[] { Integer.valueOf(parame1.type), localObject1, this.gIp, Integer.valueOf(((i)localObject2).field_fileType), Boolean.valueOf(((i)localObject2).field_enable_hitcheck), Boolean.valueOf(((i)localObject2).field_onlycheckexist), Boolean.valueOf(((i)localObject2).field_force_aeskeycdn), Boolean.valueOf(((i)localObject2).field_trysafecdn) });
                    if (!com.tencent.mm.modelcdntran.g.Gk().c((i)localObject2))
                    {
                      w.e("MicroMsg.NetSceneSendAppMsg", "cdntra addSendTask failed.");
                      this.gIp = "";
                      i = 0;
                    }
                    else
                    {
                      i = 1;
                    }
                  }
                }
              }
            }
          }
        }
        bbh localbbh = (bbh)this.fUa.gtC.gtK;
        cv localcv = new cv();
        localcv.lQa = parame1.appId;
        localcv.tQN = (this.eRz.field_talker + this.eRz.field_msgId + "T" + this.eRz.field_createTime);
        localcv.nIp = f.a.a(parame1, null, null, 0, 0);
        localcv.nFd = ((int)bg.Pu());
        localcv.lSX = this.eRz.field_talker;
        localcv.lSY = com.tencent.mm.y.q.zE();
        localcv.jib = parame1.type;
        localcv.tQM = parame1.sdkVer;
        localcv.tQP = parame1.giy;
        u.b localb;
        bhf localbhf;
        if (com.tencent.mm.af.f.dL(this.eRz.field_talker))
        {
          localcv.tQb = com.tencent.mm.af.a.e.jj(this.eRz.fwv);
          localcv.tQR = parame1.eTr;
          localcv.tQS = parame1.eTs;
          localcv.tQT = parame1.eTt;
          localb = u.Av().gx(this.hNz);
          if (localb != null)
          {
            this.psv = new tm();
            this.psv.eZa.url = parame1.url;
            this.psv.eZa.eZb = localb.getString("prePublishId", "");
            this.psv.eZa.eZd = localb.getString("preUsername", "");
            this.psv.eZa.eZe = localb.getString("preChatName", "");
            this.psv.eZa.eZf = localb.getInt("preMsgIndex", 0);
            this.psv.eZa.eZj = localb.getInt("sendAppMsgScene", 0);
            this.psv.eZa.eZk = localb.getInt("getA8KeyScene", 0);
            this.psv.eZa.eZl = localb.getString("referUrl", null);
            this.psv.eZa.eZm = localb.getString("adExtStr", null);
            this.psv.eZa.eZg = this.eRz.field_talker;
            this.psv.eZa.eZn = parame1.title;
            at.AR();
            localObject2 = com.tencent.mm.y.c.yK().TE(this.eRz.field_talker);
            if (localObject2 != null) {
              this.psv.eZa.eZh = ((x)localObject2).vj();
            }
            this.psv.eZa.eZi = m.fk(this.eRz.field_talker);
            str = "";
            localObject2 = str;
            if (parame1.eTv != null)
            {
              localbhf = new bhf();
              localObject2 = Base64.decode(parame1.eTv, 0);
            }
          }
        }
        try
        {
          localbhf.aD((byte[])localObject2);
          localObject2 = str;
          if (localbhf.uTd != null) {
            localObject2 = localbhf.uTd.lMv;
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            Object localObject3 = str;
          }
        }
        localbbh.uOH = String.format(Locale.US, "prePublishId=%s&preUserName=%s&preChatName=%s&preChatType=%d&getA8KeyScene=%d&sourceAppId=%s", new Object[] { this.psv.eZa.eZb, this.psv.eZa.eZd, this.psv.eZa.eZe, Integer.valueOf(t.H(this.psv.eZa.eZd, this.psv.eZa.eZe)), Integer.valueOf(this.psv.eZa.eZk), localObject2 });
        if ((localb != null) && (parame1.type == 33))
        {
          this.toz = new com.tencent.mm.g.a.n();
          i = localb.getInt("fromScene", 1);
          this.toz.eAt.scene = i;
          localObject2 = localb.getString("preChatName", "");
          if (2 == i)
          {
            str = localb.getString("preUsername", "");
            this.toz.eAt.eAv = ((String)localObject2 + ":" + str);
            label1656:
            localObject2 = this.eRz.field_talker;
            bool = localb.getBoolean("moreRetrAction", false);
            if (!((String)localObject2).endsWith("@chatroom")) {
              break label2060;
            }
            localObject2 = this.toz.eAt;
            if (!bool) {
              break label2055;
            }
            i = 5;
            label1703:
            ((n.a)localObject2).action = i;
            this.toz.eAt.eAu = (parame1.gkY + 1);
            this.toz.eAt.eAw = parame1.gkQ;
            this.toz.eAt.eAr = parame1.gkR;
            this.toz.eAt.appId = parame1.gkS;
            this.toz.eAt.eAy = bg.Pu();
            this.toz.eAt.eAz = 1;
          }
        }
        else
        {
          w.d("MicroMsg.NetSceneSendAppMsg", "SnsPostOperationFields: ShareUrlOriginal=%s, ShareUrlOpen=%s, JsAppId=%s", new Object[] { parame1.eTr, parame1.eTs, parame1.eTt });
          if (!bg.nm((String)localObject1))
          {
            localObject2 = com.tencent.mm.a.e.c((String)localObject1, 0, -1);
            if (!bg.bq((byte[])localObject2)) {
              localcv.tQO = new azp().be((byte[])localObject2);
            }
          }
          if (localcv.tQO == null) {
            break label2090;
          }
        }
        label2055:
        label2060:
        label2090:
        for (int i = localcv.tQO.uNN;; i = -1)
        {
          w.d("MicroMsg.NetSceneSendAppMsg", "doScene thumbFile:[%s] thumbdata:%d", new Object[] { localObject1, Integer.valueOf(i) });
          localbbh.uOF = localcv;
          if ((parame1.giz != 0) || (parame1.giv > 26214400)) {
            localbbh.tRF = com.tencent.mm.modelcdntran.b.gzf;
          }
          localbbh.ugy = parame1.filemd5;
          localbbh.gCA = this.qiS;
          w.i("MicroMsg.NetSceneSendAppMsg", "summersafecdn file md5[%s], signature[%s], type[%d], fromScene[%s]", new Object[] { localbbh.ugy, bg.SJ(localbbh.gCA), Integer.valueOf(localbbh.tRF), localbbh.uOH });
          i = a(parame, this.fUa, this);
          GMTrace.o(807185416192L, 6014);
          return i;
          localcv.tQb = be.Br();
          break;
          this.toz.eAt.eAv = ((String)localObject2);
          break label1656;
          i = 2;
          break label1703;
          localObject2 = this.toz.eAt;
          if (bool) {}
          for (i = 4;; i = 1)
          {
            ((n.a)localObject2).action = i;
            break;
          }
        }
      }
    }
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    GMTrace.i(807588069376L, 6017);
    int i = k.b.gum;
    GMTrace.o(807588069376L, 6017);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(807319633920L, 6015);
    w.i("MicroMsg.NetSceneSendAppMsg", "summersafecdn cdntra onGYNetEnd [%d,%d,%s] msgId:%d, oldContent[%s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Long.valueOf(this.eDr), this.eRz.field_content });
    if ((paramInt2 == 3) && (paramInt3 == -1) && (!bg.nm(this.gIp)))
    {
      w.w("MicroMsg.NetSceneSendAppMsg", "cdntra using cdn trans,  wait cdn service callback! clientid:%s", new Object[] { this.gIp });
      GMTrace.o(807319633920L, 6015);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.eRz.dB(5);
      com.tencent.mm.plugin.report.d.oqe.a(111L, 34L, 1L, true);
      at.AR();
      com.tencent.mm.y.c.yM().a(this.eRz.field_msgId, this.eRz);
      w.e("MicroMsg.NetSceneSendAppMsg", "send app msg failed, err=" + paramInt2 + "," + paramInt3 + ", msgId " + this.eRz.field_msgId);
      if (paramInt2 == 4) {
        com.tencent.mm.plugin.report.service.g.ork.i(10420, new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(ab.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_THUMBIMAGE), Integer.valueOf(0) });
      }
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(807319633920L, 6015);
      return;
    }
    paramArrayOfByte = (bbi)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    bbh localbbh = (bbh)((com.tencent.mm.ad.b)paramq).gtC.gtK;
    this.eRz.dB(2);
    this.eRz.D(paramArrayOfByte.tQd);
    at.AR();
    com.tencent.mm.y.c.yM().a(this.eRz.field_msgId, this.eRz);
    com.tencent.mm.modelstat.b.gWv.a(this.eRz, com.tencent.mm.x.g.g(this.eRz));
    if ((this.psv != null) && (!bg.nm(this.psv.eZa.url)))
    {
      this.psv.eZa.eZc = ("msg_" + Long.toString(paramArrayOfByte.tQd));
      a.vgX.m(this.psv);
    }
    paramArrayOfByte = f.a.eS(this.eRz.field_content);
    if ((paramArrayOfByte != null) && ("wx4310bbd51be7d979".equals(paramArrayOfByte.appId))) {
      if ((bg.nm(this.eRz.field_talker)) || (!this.eRz.field_talker.endsWith("@chatroom"))) {
        break label798;
      }
    }
    label798:
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      paramq = "";
      try
      {
        paramArrayOfByte = URLEncoder.encode(paramArrayOfByte.description, "UTF-8");
        paramq = paramArrayOfByte;
      }
      catch (UnsupportedEncodingException paramArrayOfByte)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.NetSceneSendAppMsg", paramArrayOfByte, "", new Object[0]);
          continue;
          paramInt1 = 1;
        }
      }
      paramArrayOfByte = new StringBuilder("1,");
      if (paramInt1 == 0) {
        break;
      }
      paramInt1 = 2;
      paramq = paramInt1 + ",," + paramq;
      w.i("MicroMsg.NetSceneSendAppMsg", "androidSystemShareFixed(13717) %s", new Object[] { paramq });
      com.tencent.mm.plugin.report.service.g.ork.A(13717, paramq);
      if (this.toz != null)
      {
        this.toz.eAt.eAx = ("msg_" + this.eRz.field_msgSvrId);
        a.vgX.m(this.toz);
      }
      if (localbbh.uOF.tQO != null) {
        com.tencent.mm.plugin.report.service.g.ork.i(10420, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(ab.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_THUMBIMAGE), Integer.valueOf(localbbh.uOF.tQO.uNN) });
      }
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(807319633920L, 6015);
      return;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(807453851648L, 6016);
    GMTrace.o(807453851648L, 6016);
    return 222;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */