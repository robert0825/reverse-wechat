package com.tencent.mm.ao;

import android.graphics.BitmapFactory.Options;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bma;
import com.tencent.mm.protocal.c.bmb;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class l
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private int fUJ;
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  private d gIW;
  private a gIX;
  
  public l(int paramInt, bma parambma, d paramd, keep_SceneResult paramkeep_SceneResult, a parama)
  {
    GMTrace.i(3506572361728L, 26126);
    b.a locala = new b.a();
    locala.gtF = new bma();
    locala.gtG = new bmb();
    locala.uri = "/cgi-bin/micromsg-bin/uploadmsgimg";
    locala.gtE = 110;
    locala.gtH = 9;
    locala.gtI = 1000000009;
    this.fUa = locala.DA();
    this.gIX = parama;
    this.fUJ = paramInt;
    this.gIW = paramd;
    parama = (bma)this.fUa.gtC.gtK;
    parama.tPW = parambma.tPW;
    parama.tPX = parambma.tPX;
    parama.uVR = parambma.uVR;
    parama.lQc = parambma.lQc;
    parama.tQb = parambma.tQb;
    parama.tYI = parambma.tYI;
    paramd = com.tencent.mm.sdk.platformtools.d.RB(n.IZ().l(paramd.gGU, "", ""));
    if (paramd != null)
    {
      paramInt = paramd.outWidth;
      parama.uVZ = paramInt;
      if (paramd == null) {
        break label517;
      }
      paramInt = paramd.outHeight;
      label213:
      parama.uVY = paramInt;
      parama.uVW = paramkeep_SceneResult.field_fileId;
      parama.uVX = paramkeep_SceneResult.field_thumbimgLength;
      parama.tRC = paramkeep_SceneResult.field_thumbimgLength;
      parama.tRD = 0;
      parama.tRE = paramkeep_SceneResult.field_thumbimgLength;
      parama.ues = new azp().be(new byte[0]);
      parama.tYG = 1;
      if (!paramkeep_SceneResult.isUploadBySafeCDNWithMD5()) {
        break label522;
      }
      w.i("MicroMsg.NetSceneUploadMsgImgForCdn", "summersafecdn isUploadBySafeCDNWithMD5 field_upload_by_safecdn[%b], field_UploadHitCacheType[%d], crc[%d], aeskey[%s]", new Object[] { Boolean.valueOf(paramkeep_SceneResult.field_upload_by_safecdn), Integer.valueOf(paramkeep_SceneResult.field_UploadHitCacheType), Integer.valueOf(paramkeep_SceneResult.field_filecrc), paramkeep_SceneResult.field_aesKey });
      parama.uOI = 1;
      parama.tYF = "";
      parama.uxt = "";
      label369:
      parama.usj = parambma.usj;
      if (parambma.usj != 1) {
        break label545;
      }
      parama.uVU = paramkeep_SceneResult.field_fileLength;
      parama.uVV = paramkeep_SceneResult.field_midimgLength;
      parama.uVS = paramkeep_SceneResult.field_fileId;
    }
    for (parama.uVT = paramkeep_SceneResult.field_fileId;; parama.uVT = paramkeep_SceneResult.field_fileId)
    {
      parama.tYH = paramkeep_SceneResult.field_filecrc;
      parama.ugy = paramkeep_SceneResult.field_filemd5;
      w.i("MicroMsg.NetSceneUploadMsgImgForCdn", "summersafecdn NetSceneUploadMsgImgForCdn MsgForwardType[%d], hitmd5[%d], key[%s], crc[%d]", new Object[] { Integer.valueOf(parama.tYI), Integer.valueOf(parama.uOI), bg.SJ(parama.tYF), Integer.valueOf(parama.tYH) });
      GMTrace.o(3506572361728L, 26126);
      return;
      paramInt = 0;
      break;
      label517:
      paramInt = 0;
      break label213;
      label522:
      parama.tYF = paramkeep_SceneResult.field_aesKey;
      parama.uxt = paramkeep_SceneResult.field_aesKey;
      break label369;
      label545:
      parama.uVU = 0;
      parama.uVV = paramkeep_SceneResult.field_fileLength;
      parama.uVS = "";
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(3506706579456L, 26127);
    w.i("MicroMsg.NetSceneUploadMsgImgForCdn", "cdntra req[%s]", new Object[] { ((bma)(bma)this.fUa.gtC.gtK).toString() });
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(3506706579456L, 26127);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(3506840797184L, 26128);
    w.i("MicroMsg.NetSceneUploadMsgImgForCdn", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3);
    paramString = (bmb)((b)paramq).gtD.gtK;
    w.i("MicroMsg.NetSceneUploadMsgImgForCdn", "onGYNetEnd createtime:%d msgId:%d ", new Object[] { Integer.valueOf(paramString.nFd), Long.valueOf(paramString.tQd) });
    if (this.gIX != null) {
      this.gIX.a(paramString.tQd, paramString.nFd, paramInt2, paramInt3);
    }
    this.fUd.a(0, 0, "", this);
    GMTrace.o(3506840797184L, 26128);
  }
  
  public final int getType()
  {
    GMTrace.i(3506975014912L, 26129);
    GMTrace.o(3506975014912L, 26129);
    return 110;
  }
  
  static abstract interface a
  {
    public abstract void a(long paramLong, int paramInt1, int paramInt2, int paramInt3);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */