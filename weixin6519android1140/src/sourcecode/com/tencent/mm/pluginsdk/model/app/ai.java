package com.tencent.mm.pluginsdk.model.app;

import android.graphics.BitmapFactory.Options;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.g.a.tm;
import com.tencent.mm.g.a.tm.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.protocal.c.bbh;
import com.tencent.mm.protocal.c.bbi;
import com.tencent.mm.protocal.c.bhd;
import com.tencent.mm.protocal.c.bhf;
import com.tencent.mm.protocal.c.cv;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.x;
import com.tencent.mm.x.f.a;
import com.tencent.mm.x.g;
import com.tencent.mm.y.at;
import com.tencent.mm.y.be;
import com.tencent.mm.y.m;
import com.tencent.mm.y.t;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import java.util.Locale;

public final class ai
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private long eDr;
  private au eRz;
  private keep_SceneResult fUP;
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private String hNz;
  private tm psv;
  private b toC;
  private boolean toD;
  private a toE;
  private com.tencent.mm.g.a.n toz;
  
  public ai(long paramLong, boolean paramBoolean, keep_SceneResult paramkeep_SceneResult, a parama, String paramString, b paramb)
  {
    GMTrace.i(807856504832L, 6019);
    this.eDr = 0L;
    this.fUP = null;
    this.toC = null;
    this.eRz = null;
    this.toD = false;
    this.toE = null;
    this.eDr = paramLong;
    this.hNz = paramString;
    this.fUP = paramkeep_SceneResult;
    this.toE = parama;
    this.toD = paramBoolean;
    this.toC = paramb;
    parama = new b.a();
    parama.gtF = new bbh();
    parama.gtG = new bbi();
    parama.uri = "/cgi-bin/micromsg-bin/sendappmsg";
    parama.gtE = 222;
    parama.gtH = 107;
    parama.gtI = 1000000107;
    this.fUa = parama.DA();
    w.i("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig NetSceneSendAppMsgForCdn msgId[%d], sceneResult[%s], sessionId[%s], attachInfo[%s]. stack[%s]", new Object[] { Long.valueOf(paramLong), paramkeep_SceneResult, paramString, paramb, bg.bQW() });
    GMTrace.o(807856504832L, 6019);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(808259158016L, 6022);
    this.fUd = parame1;
    at.AR();
    this.eRz = com.tencent.mm.y.c.yM().cM(this.eDr);
    if ((this.eRz == null) || (this.eRz.field_msgId != this.eDr))
    {
      w.e("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig cdntra doscene msginfo null id:%d", new Object[] { Long.valueOf(this.eDr) });
      this.toE.bb(3, -1);
      GMTrace.o(808259158016L, 6022);
      return -1;
    }
    f.a locala = f.a.eS(this.eRz.field_content);
    if (locala == null)
    {
      w.e("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig cdntra doscene AppMessage.Content.parse null id:%d", new Object[] { Long.valueOf(this.eDr) });
      this.toE.bb(3, -1);
    }
    bbh localbbh = (bbh)this.fUa.gtC.gtK;
    cv localcv = new cv();
    localcv.lQa = locala.appId;
    localcv.tQN = (this.eRz.field_talker + this.eRz.field_msgId + "T" + this.eRz.field_createTime);
    localcv.nFd = ((int)bg.Pu());
    localcv.lSX = this.eRz.field_talker;
    localcv.lSY = com.tencent.mm.y.q.zE();
    localcv.jib = locala.type;
    localcv.tQM = locala.sdkVer;
    localcv.tQP = locala.giy;
    u.b localb;
    bhf localbhf;
    if (com.tencent.mm.af.f.dL(this.eRz.field_talker))
    {
      localcv.tQb = com.tencent.mm.af.a.e.jj(this.eRz.fwv);
      localcv.tQR = locala.eTr;
      localcv.tQS = locala.eTs;
      localcv.tQT = locala.eTt;
      localb = u.Av().gx(this.hNz);
      if (localb != null)
      {
        this.psv = new tm();
        this.psv.eZa.url = locala.url;
        this.psv.eZa.eZb = localb.getString("prePublishId", "");
        this.psv.eZa.eZd = localb.getString("preUsername", "");
        this.psv.eZa.eZe = localb.getString("preChatName", "");
        this.psv.eZa.eZf = localb.getInt("preMsgIndex", 0);
        this.psv.eZa.eZj = localb.getInt("sendAppMsgScene", 0);
        this.psv.eZa.eZk = localb.getInt("getA8KeyScene", 0);
        this.psv.eZa.eZl = localb.getString("referUrl", null);
        this.psv.eZa.eZm = localb.getString("adExtStr", null);
        this.psv.eZa.eZg = this.eRz.field_talker;
        this.psv.eZa.eZn = locala.title;
        at.AR();
        parame1 = com.tencent.mm.y.c.yK().TE(this.eRz.field_talker);
        if (parame1 != null) {
          this.psv.eZa.eZh = parame1.vj();
        }
        this.psv.eZa.eZi = m.fk(this.eRz.field_talker);
        str = "";
        parame1 = str;
        if (locala.eTv != null)
        {
          localbhf = new bhf();
          parame1 = Base64.decode(locala.eTv, 0);
        }
      }
    }
    try
    {
      localbhf.aD(parame1);
      parame1 = str;
      if (localbhf.uTd != null) {
        parame1 = localbhf.uTd.lMv;
      }
    }
    catch (Exception parame1)
    {
      for (;;)
      {
        int i;
        label921:
        boolean bool;
        label965:
        int k;
        int m;
        int j;
        label1541:
        label1546:
        label1574:
        parame1 = str;
      }
    }
    localbbh.uOH = String.format(Locale.US, "prePublishId=%s&preUserName=%s&preChatName=%s&preChatType=%d&getA8KeyScene=%d&sourceAppId=%s", new Object[] { this.psv.eZa.eZb, this.psv.eZa.eZd, this.psv.eZa.eZe, Integer.valueOf(t.H(this.psv.eZa.eZd, this.psv.eZa.eZe)), Integer.valueOf(this.psv.eZa.eZk), parame1 });
    if ((localb != null) && (locala.type == 33))
    {
      this.toz = new com.tencent.mm.g.a.n();
      i = localb.getInt("fromScene", 1);
      this.toz.eAt.scene = i;
      parame1 = localb.getString("preChatName", "");
      if (2 == i)
      {
        str = localb.getString("preUsername", "");
        this.toz.eAt.eAv = (parame1 + ":" + str);
        parame1 = this.eRz.field_talker;
        bool = localb.getBoolean("moreRetrAction", false);
        if (!parame1.endsWith("@chatroom")) {
          break label1546;
        }
        parame1 = this.toz.eAt;
        if (!bool) {
          break label1541;
        }
        i = 5;
        parame1.action = i;
        this.toz.eAt.eAu = (locala.gkY + 1);
        this.toz.eAt.eAw = locala.gkQ;
        this.toz.eAt.eAr = locala.gkR;
        this.toz.eAt.appId = locala.gkS;
        this.toz.eAt.eAy = bg.Pu();
        this.toz.eAt.eAz = 1;
      }
    }
    else
    {
      w.d("MicroMsg.NetSceneSendAppMsgForCdn", "stev summerbig SnsPostOperationFields: ShareUrlOriginal=%s, ShareUrlOpen=%s, JsAppId=%s", new Object[] { locala.eTr, locala.eTs, locala.eTt });
      k = 0;
      m = 0;
      j = m;
      i = k;
      if (!bg.nm(this.eRz.field_imgPath))
      {
        parame1 = d.RB(com.tencent.mm.ao.n.IZ().ke(this.eRz.field_imgPath));
        j = m;
        i = k;
        if (parame1 != null)
        {
          i = parame1.outWidth;
          j = parame1.outHeight;
        }
      }
      if (this.fUP.isUploadBySafeCDNWithMD5())
      {
        w.i("MicroMsg.NetSceneSendAppMsgForCdn", "summersafecdn app sceneResult crc[%d], safecdn[%b], hitcachetype[%d], aeskey[%s]", new Object[] { Integer.valueOf(this.fUP.field_filecrc), Boolean.valueOf(this.fUP.field_upload_by_safecdn), Integer.valueOf(this.fUP.field_UploadHitCacheType), this.fUP.field_aesKey });
        this.fUP.field_aesKey = "";
        localbbh.uOI = 1;
      }
      localbbh.tYH = this.fUP.field_filecrc;
      parame1 = null;
      if (this.toD) {
        parame1 = "@cdn_" + this.fUP.field_fileId + "_" + this.fUP.field_aesKey + "_1";
      }
      localcv.nIp = f.a.a(locala, parame1, this.fUP, i, j);
      localbbh.uOF = localcv;
      if ((this.toC != null) && ((locala.giz != 0) || (locala.giv > 26214400)))
      {
        localbbh.gCA = this.toC.field_signature;
        localbbh.tRF = com.tencent.mm.modelcdntran.b.gzf;
      }
      localbbh.ugy = locala.filemd5;
      if (!bg.nm(this.fUP.field_filemd5)) {
        break label1574;
      }
      w.i("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig sceneResult filemd5 is null use content.filemd5[%s]", new Object[] { locala.filemd5 });
    }
    for (;;)
    {
      w.i("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig file md5[%s], HitMd5[%d], signature[%s], type[%d], sceneResult[%s], fromScene[%s]", new Object[] { localbbh.ugy, Integer.valueOf(localbbh.uOI), bg.SJ(localbbh.gCA), Integer.valueOf(localbbh.tRF), this.fUP, localbbh.uOH });
      i = a(parame, this.fUa, this);
      GMTrace.o(808259158016L, 6022);
      return i;
      localcv.tQb = be.Br();
      break;
      this.toz.eAt.eAv = parame1;
      break label921;
      i = 2;
      break label965;
      parame1 = this.toz.eAt;
      if (bool) {}
      for (i = 4;; i = 1)
      {
        parame1.action = i;
        break;
      }
      localbbh.ugy = this.fUP.field_filemd5;
    }
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    GMTrace.i(808124940288L, 6021);
    int i = k.b.gum;
    GMTrace.o(808124940288L, 6021);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(808393375744L, 6023);
    paramArrayOfByte = (bbh)((com.tencent.mm.ad.b)paramq).gtC.gtK;
    w.i("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig cdntra onGYNetEnd [%d,%d,%s] msgId:%d, oldContent[%s], newContent[%s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Long.valueOf(this.eDr), this.eRz.field_content, paramArrayOfByte.uOF.nIp });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if ((paramInt2 == 4) && (paramInt3 == 102))
      {
        w.w("MicroMsg.NetSceneSendAppMsgForCdn", "summersafecdn MM_ERR_GET_AESKEY_FAILED");
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        this.toE.bb(paramInt2, paramInt3);
        GMTrace.o(808393375744L, 6023);
        return;
      }
      this.eRz.dB(5);
      at.AR();
      com.tencent.mm.y.c.yM().a(this.eRz.field_msgId, this.eRz);
      w.e("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig send app msg failed, err=" + paramInt2 + "," + paramInt3);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      this.toE.bb(paramInt2, paramInt3);
      GMTrace.o(808393375744L, 6023);
      return;
    }
    paramq = (bbi)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    w.i("MicroMsg.NetSceneSendAppMsgForCdn", "summersafecdn svrid[%d]. aeskey[%s], old content[%s]", new Object[] { Long.valueOf(paramq.tQd), paramq.tYF, this.eRz.field_content });
    if ((this.fUP != null) && (this.fUP.isUploadBySafeCDNWithMD5()))
    {
      if (bg.nm(paramq.tYF)) {
        break label613;
      }
      paramArrayOfByte = f.a.eS(this.eRz.field_content);
      paramArrayOfByte.giJ = paramq.tYF;
      this.eRz.setContent(f.a.a(paramArrayOfByte, null, null));
      w.i("MicroMsg.NetSceneSendAppMsgForCdn", "summersafecdn aeskey[%s], new content[%s]", new Object[] { paramq.tYF, this.eRz.field_content });
    }
    for (;;)
    {
      this.eRz.dB(2);
      this.eRz.D(paramq.tQd);
      at.AR();
      com.tencent.mm.y.c.yM().a(this.eRz.field_msgId, this.eRz);
      com.tencent.mm.modelstat.b.gWv.a(this.eRz, g.g(this.eRz));
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      this.toE.bb(paramInt2, paramInt3);
      if ((this.psv != null) && (!bg.nm(this.psv.eZa.url)))
      {
        this.psv.eZa.eZc = ("msg_" + Long.toString(paramq.tQd));
        a.vgX.m(this.psv);
      }
      if (this.toz != null)
      {
        this.toz.eAt.eAx = ("msg_" + this.eRz.field_msgSvrId);
        a.vgX.m(this.toz);
      }
      GMTrace.o(808393375744L, 6023);
      return;
      label613:
      w.w("MicroMsg.NetSceneSendAppMsgForCdn", "summersafecdn need aeskey but ret null");
    }
  }
  
  public final int getType()
  {
    GMTrace.i(807990722560L, 6020);
    GMTrace.o(807990722560L, 6020);
    return 222;
  }
  
  static abstract interface a
  {
    public abstract void bb(int paramInt1, int paramInt2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */