package com.tencent.mm.modelvideo;

import android.graphics.BitmapFactory.Options;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.a;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.l.a;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bhr;
import com.tencent.mm.protocal.c.bmi;
import com.tencent.mm.protocal.c.bmj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.be;
import java.util.HashMap;
import junit.framework.Assert;

public final class h
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  String euR;
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private int hbl;
  private keep_SceneResult hbm;
  private a hbn;
  
  public h(String paramString, int paramInt, keep_SceneResult paramkeep_SceneResult, a parama)
  {
    GMTrace.i(14625303166976L, 108967);
    this.euR = null;
    this.hbl = 0;
    this.hbm = null;
    this.hbn = null;
    if (paramString != null) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      Assert.assertTrue(bool1);
      bool1 = bool2;
      if (paramkeep_SceneResult != null) {
        bool1 = true;
      }
      Assert.assertTrue(bool1);
      Assert.assertTrue(true);
      this.euR = paramString;
      this.hbm = paramkeep_SceneResult;
      this.hbn = parama;
      this.hbl = paramInt;
      GMTrace.o(14625303166976L, 108967);
      return;
    }
  }
  
  private String MY()
  {
    GMTrace.i(18680691818496L, 139182);
    String str = this.euR + "_" + hashCode();
    GMTrace.o(18680691818496L, 139182);
    return str;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(338631327744L, 2523);
    this.fUd = parame1;
    Object localObject = t.mw(this.euR);
    if (localObject == null)
    {
      w.e("MicroMsg.NetSceneUploadVideoForCdn", "Get info Failed file:" + this.euR);
      this.hbn.bb(3, -1);
      GMTrace.o(338631327744L, 2523);
      return -1;
    }
    parame1 = new b.a();
    parame1.gtF = new bmi();
    parame1.gtG = new bmj();
    parame1.uri = "/cgi-bin/micromsg-bin/uploadvideo";
    parame1.gtE = 149;
    parame1.gtH = 39;
    parame1.gtI = 1000000039;
    this.fUa = parame1.DA();
    bmi localbmi = (bmi)this.fUa.gtC.gtK;
    localbmi.uWg = 0;
    localbmi.uWf = this.hbm.field_fileLength;
    localbmi.uWh = new azp().be(new byte[0]);
    localbmi.uCA = 0;
    localbmi.uCz = this.hbm.field_thumbimgLength;
    localbmi.uCB = new azp().be(new byte[0]);
    localbmi.lSY = com.tencent.mm.y.q.zE();
    localbmi.lSX = this.hbm.field_toUser;
    localbmi.tQN = this.euR;
    if (((r)localObject).hcz == 1) {
      localbmi.uWj = 2;
    }
    if (((r)localObject).hcC == 3) {
      localbmi.uWj = 3;
    }
    localbmi.uWi = ((r)localObject).hcv;
    label461:
    label518:
    label638:
    label715:
    label761:
    label820:
    String str;
    if (com.tencent.mm.network.ab.bv(com.tencent.mm.sdk.platformtools.ab.getContext()))
    {
      i = 1;
      localbmi.ugj = i;
      localbmi.uCC = 2;
      localbmi.uVX = this.hbm.field_thumbimgLength;
      localbmi.uWk = this.hbm.field_fileId;
      localbmi.uxr = this.hbm.field_fileId;
      localbmi.tYG = 1;
      if (!this.hbm.isUploadBySafeCDNWithMD5()) {
        break label1110;
      }
      w.i("MicroMsg.NetSceneUploadVideoForCdn", "%s summersafecdn isUploadBySafeCDNWithMD5 field_upload_by_safecdn[%b], field_UploadHitCacheType[%d], crc[%d], aeskey[%s]", new Object[] { MY(), Boolean.valueOf(this.hbm.field_upload_by_safecdn), Integer.valueOf(this.hbm.field_UploadHitCacheType), Integer.valueOf(this.hbm.field_filecrc), this.hbm.field_aesKey });
      localbmi.uOI = 1;
      localbmi.tYF = "";
      localbmi.uxt = "";
      localbmi.uWm = this.hbm.field_filemd5;
      localbmi.uWw = this.hbm.field_mp4identifymd5;
      localbmi.tYH = this.hbm.field_filecrc;
      if ((this.hbl > 0) && (this.hbl <= 1048576)) {
        break label1137;
      }
      parame1 = be.Br();
      localbmi.tQb = parame1;
      localbmi.uWv = ((r)localObject).eTv;
      parame1 = ((r)localObject).hcE;
      if ((parame1 == null) || (bg.nm(parame1.gkI))) {
        break label1204;
      }
      localbmi.uWn = bg.aq(parame1.gkI, "");
      localbmi.uWo = parame1.ulk;
      localbmi.uWp = bg.aq(parame1.gkK, "");
      localbmi.uWr = bg.aq(parame1.gkM, "");
      localbmi.uWq = bg.aq(parame1.gkL, "");
      localbmi.uWs = bg.aq(parame1.gkN, "");
      if (parame1 != null)
      {
        localbmi.uWu = bg.aq(parame1.gkO, "");
        localbmi.uWt = bg.aq(parame1.gkP, "");
      }
      o.Nh();
      parame1 = s.ml(this.euR);
      localObject = d.RB(parame1);
      if (localObject == null) {
        break label1249;
      }
      localbmi.uVZ = ((BitmapFactory.Options)localObject).outWidth;
      localbmi.uVY = ((BitmapFactory.Options)localObject).outHeight;
      o.Nh();
      parame1 = s.mk(this.euR);
      localObject = n.Nf();
      if (bg.nm(parame1)) {
        break label1268;
      }
      parame1 = (n.a)((n)localObject).hbI.get(parame1);
      if (parame1 == null) {
        break label1268;
      }
      i = parame1.hbY;
      switch (i)
      {
      case 4: 
      case 5: 
      default: 
        localbmi.tYI = 0;
        localbmi.tQP = 0;
        parame1 = MY();
        localObject = this.euR;
        str = this.hbm.field_toUser;
        if (this.hbm.field_aesKey != null) {
          break;
        }
      }
    }
    for (int i = -1;; i = this.hbm.field_aesKey.length())
    {
      w.i("MicroMsg.NetSceneUploadVideoForCdn", "%s summersafecdn cdntra doscene file:%s touser:%s aes:%d fileid:%s thumb:[%d %d %d], thumbaeskey [%s] funcFlag: %d, md5:%s HitMd5:%d CRC32:%d, VideoNewMd5:%s AESKey:%s stream %s streamtime: %d title %s thumburl %s msgSource[%s] msgForwardType[%d] Source[%d]", new Object[] { parame1, localObject, str, Integer.valueOf(i), this.hbm.field_fileId, Integer.valueOf(this.hbm.field_thumbimgLength), Integer.valueOf(localbmi.uVZ), Integer.valueOf(localbmi.uVY), bg.SJ(localbmi.uxt), Integer.valueOf(localbmi.uWj), localbmi.uWm, Integer.valueOf(localbmi.uOI), Integer.valueOf(localbmi.tYH), localbmi.uWw, bg.SJ(localbmi.tYF), localbmi.uWn, Integer.valueOf(localbmi.uWo), localbmi.uWp, localbmi.uWs, localbmi.tQb, Integer.valueOf(localbmi.tYI), Integer.valueOf(localbmi.tQP) });
      i = a(parame, this.fUa, this);
      GMTrace.o(338631327744L, 2523);
      return i;
      i = 2;
      break;
      label1110:
      localbmi.tYF = this.hbm.field_aesKey;
      localbmi.uxt = this.hbm.field_aesKey;
      break label461;
      label1137:
      parame1 = new StringBuilder();
      parame1.append("<msgsource>");
      parame1.append("<videopreloadlen>").append(this.hbl).append("</videopreloadlen>");
      parame1.append("</msgsource>");
      g.ork.a(354L, 35L, 1L, false);
      parame1 = parame1.toString();
      break label518;
      label1204:
      if ((parame1 == null) || (bg.nm(parame1.gkM)) || (bg.nm(parame1.gkL))) {
        break label638;
      }
      localbmi.uWr = parame1.gkM;
      localbmi.uWq = parame1.gkL;
      break label638;
      label1249:
      w.w("MicroMsg.NetSceneUploadVideoForCdn", "cdntra getImageOptions for thumb failed path:%s", new Object[] { parame1 });
      break label715;
      label1268:
      i = 0;
      break label761;
      localbmi.tYI = 1;
      localbmi.tQP = 2;
      break label820;
      localbmi.tYI = 1;
      localbmi.tQP = 1;
      break label820;
      localbmi.tYI = 2;
      localbmi.tQP = 3;
      break label820;
      localbmi.tYI = 3;
      localbmi.tQP = 4;
      break label820;
      localbmi.tYI = 1;
      localbmi.tQP = 5;
      break label820;
    }
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    GMTrace.i(338765545472L, 2524);
    int i = k.b.gum;
    GMTrace.o(338765545472L, 2524);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(339168198656L, 2527);
    w.i("MicroMsg.NetSceneUploadVideoForCdn", "%s cdntra onGYNetEnd errtype[%d %d]", new Object[] { MY(), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    paramArrayOfByte = (bmj)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    paramq = t.mw(this.euR);
    if (paramq == null)
    {
      w.e("MicroMsg.NetSceneUploadVideoForCdn", "ERR: onGYNetEnd Get INFO FAILED :" + this.euR);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      this.hbn.bb(3, -1);
      GMTrace.o(339168198656L, 2527);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 == 102))
    {
      w.e("MicroMsg.NetSceneUploadVideoForCdn", "summersafecdn ERR: MM_ERR_GET_AESKEY_FAILED errtype:" + paramInt2 + " errCode:" + paramInt3 + "  file:" + this.euR + " user:" + paramq.Nq());
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      this.hbn.bb(paramInt2, paramInt3);
      GMTrace.o(339168198656L, 2527);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 == -22))
    {
      w.e("MicroMsg.NetSceneUploadVideoForCdn", "ERR: onGYNetEnd BLACK  errtype:" + paramInt2 + " errCode:" + paramInt3 + "  file:" + this.euR + " user:" + paramq.Nq());
      t.mq(this.euR);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      this.hbn.bb(paramInt2, paramInt3);
      GMTrace.o(339168198656L, 2527);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneUploadVideoForCdn", "ERR: onGYNetEnd SERVER FAILED errtype:" + paramInt2 + " errCode:" + paramInt3 + "  file:" + this.euR + " user:" + paramq.Nq());
      t.mp(this.euR);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      this.hbn.bb(paramInt2, paramInt3);
      GMTrace.o(339168198656L, 2527);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneUploadVideoForCdn", "ERR: onGYNetEnd FAILED (WILL RETRY) errtype:" + paramInt2 + " errCode:" + paramInt3 + "  file:" + this.euR + " user:" + paramq.Nq());
      t.mp(this.euR);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      this.hbn.bb(paramInt2, paramInt3);
      GMTrace.o(339168198656L, 2527);
      return;
    }
    paramq.hct = bg.Pu();
    paramq.eSf = paramArrayOfByte.tQd;
    w.i("MicroMsg.NetSceneUploadVideoForCdn", "%s dkmsgid  set svrmsgid %d -> %d", new Object[] { MY(), Long.valueOf(paramq.eSf), Integer.valueOf(com.tencent.mm.platformtools.r.hkk) });
    if ((10007 == com.tencent.mm.platformtools.r.hkj) && (com.tencent.mm.platformtools.r.hkk != 0) && (paramq.eSf != 0L))
    {
      paramq.eSf = com.tencent.mm.platformtools.r.hkk;
      com.tencent.mm.platformtools.r.hkk = 0;
    }
    paramq.status = 199;
    paramq.eQl = 1284;
    boolean bool;
    if (this.hbm.isUploadBySafeCDNWithMD5())
    {
      w.i("MicroMsg.NetSceneUploadVideoForCdn", "%s summersafecdn aeskey[%s], old RecvXml[%s]", new Object[] { MY(), paramArrayOfByte.tYF, paramq.Nt() });
      if (bg.nm(paramArrayOfByte.tYF)) {
        break label1320;
      }
      Object localObject = "<msg><videomsg aeskey=\"" + paramArrayOfByte.tYF + "\" cdnthumbaeskey=\"" + paramArrayOfByte.tYF + "\" cdnvideourl=\"" + this.hbm.field_fileId + "\" ";
      localObject = (String)localObject + "cdnthumburl=\"" + this.hbm.field_fileId + "\" ";
      localObject = (String)localObject + "length=\"" + this.hbm.field_fileLength + "\" ";
      localObject = (String)localObject + "cdnthumblength=\"" + this.hbm.field_thumbimgLength + "\"/></msg>";
      w.i("MicroMsg.NetSceneUploadVideoForCdn", "cdn callback new build cdnInfo:%s", new Object[] { localObject });
      paramq.hcB = ((String)localObject);
      localObject = o.Nh();
      o.Nh();
      bool = ((s)localObject).o(s.mk(this.euR), this.hbm.field_fileId, paramArrayOfByte.tYF);
      localObject = g.ork;
      if (bool)
      {
        paramInt1 = 1;
        ((g)localObject).i(12696, new Object[] { Integer.valueOf(paramInt1 + 900), Integer.valueOf(paramq.gsL) });
        w.i("MicroMsg.NetSceneUploadVideoForCdn", "%s summersafecdn aeskey[%s], new RecvXml[%s], saveret[%b]", new Object[] { MY(), paramArrayOfByte.tYF, paramq.Nt(), Boolean.valueOf(bool) });
      }
    }
    else
    {
      label1062:
      t.e(paramq);
      t.c(paramq);
      paramArrayOfByte = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(paramq.hcw);
      com.tencent.mm.modelstat.b.gWv.f(paramArrayOfByte);
      paramArrayOfByte = paramq.Nq();
      paramArrayOfByte = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramArrayOfByte);
      if ((paramArrayOfByte != null) && ((int)paramArrayOfByte.fTq > 0)) {
        break label1342;
      }
      bool = false;
      label1155:
      if ((!bool) && (!com.tencent.mm.y.s.fP(paramq.Nq()))) {
        break label1352;
      }
      w.i("MicroMsg.NetSceneUploadVideoForCdn", "%s upload to biz :%s", new Object[] { MY(), paramq.Nq() });
      if (paramq.eSf < 0L)
      {
        w.e("MicroMsg.NetSceneUploadVideoForCdn", "ERR: finish video invaild MSGSVRID :" + paramq.eSf + " file:" + this.euR + " toUser:" + paramq.Nq());
        t.mp(this.euR);
        this.hbn.bb(3, -1);
      }
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      this.hbn.bb(0, 0);
      GMTrace.o(339168198656L, 2527);
      return;
      paramInt1 = 2;
      break;
      label1320:
      w.w("MicroMsg.NetSceneUploadVideoForCdn", "%s summersafecdn need aeskey but ret null", new Object[] { MY() });
      break label1062;
      label1342:
      bool = paramArrayOfByte.bSA();
      break label1155;
      label1352:
      w.i("MicroMsg.NetSceneUploadVideoForCdn", "%s not upload to biz", new Object[] { MY() });
      if (paramq.eSf <= 0L)
      {
        w.e("MicroMsg.NetSceneUploadVideoForCdn", "ERR: finish video invaild MSGSVRID :" + paramq.eSf + " file:" + this.euR + " toUser:" + paramq.Nq());
        t.mp(this.euR);
        this.hbn.bb(3, -1);
      }
    }
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(339033980928L, 2526);
    t.mp(this.euR);
    GMTrace.o(339033980928L, 2526);
  }
  
  public final int getType()
  {
    GMTrace.i(339302416384L, 2528);
    GMTrace.o(339302416384L, 2528);
    return 149;
  }
  
  protected final int vB()
  {
    GMTrace.i(338899763200L, 2525);
    GMTrace.o(338899763200L, 2525);
    return 1;
  }
  
  static abstract interface a
  {
    public abstract void bb(int paramInt1, int paramInt2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvideo\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */