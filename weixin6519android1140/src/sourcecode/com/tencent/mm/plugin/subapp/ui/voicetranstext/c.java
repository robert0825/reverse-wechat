package com.tencent.mm.plugin.subapp.ui.voicetranstext;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.modelvoice.g;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bmk;
import com.tencent.mm.protocal.c.bml;
import com.tencent.mm.protocal.c.bmm;
import com.tencent.mm.protocal.c.bnv;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import junit.framework.Assert;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final String TAG;
  private com.tencent.mm.ad.b gtx;
  private String mFileName;
  private com.tencent.mm.ad.e nuY;
  private String quP;
  private bnv quR;
  public bmk quX;
  
  public c(c paramc)
  {
    GMTrace.i(5762369716224L, 42933);
    this.TAG = "MicroMsg.NetSceneUploadVoiceForTrans";
    this.quP = paramc.quP;
    this.quR = paramc.quR;
    this.quX = paramc.quX;
    this.mFileName = paramc.mFileName;
    brO();
    GMTrace.o(5762369716224L, 42933);
  }
  
  public c(String paramString1, bmk parambmk, int paramInt, String paramString2)
  {
    GMTrace.i(5762503933952L, 42934);
    this.TAG = "MicroMsg.NetSceneUploadVoiceForTrans";
    if (paramString2 != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      this.quP = paramString1;
      this.quX = parambmk;
      this.quR = d.av(paramInt, paramString2);
      this.mFileName = paramString2;
      brO();
      GMTrace.o(5762503933952L, 42934);
      return;
    }
  }
  
  private void brO()
  {
    GMTrace.i(5763040804864L, 42938);
    b.a locala = new b.a();
    locala.gtF = new bml();
    locala.gtG = new bmm();
    locala.uri = "/cgi-bin/micromsg-bin/uploadvoicefortrans";
    locala.gtE = 547;
    locala.gtH = 0;
    locala.gtI = 0;
    this.gtx = locala.DA();
    GMTrace.o(5763040804864L, 42938);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5762772369408L, 42936);
    this.nuY = parame1;
    if ((!bg.nm(this.mFileName)) && (!bg.nm(this.quP)) && (this.quX != null) && (this.quR != null)) {}
    for (int i = 1; i == 0; i = 0)
    {
      w.e("MicroMsg.NetSceneUploadVoiceForTrans", "doScene: Value not Valid, so, do nothing.");
      GMTrace.o(5762772369408L, 42936);
      return -1;
    }
    bml localbml = (bml)this.gtx.gtC.gtK;
    localbml.udw = this.quP;
    localbml.udx = this.quR;
    localbml.udz = this.quX;
    Object localObject = this.mFileName;
    i = this.quX.tRD;
    int j = this.quX.tRE;
    parame1 = new azp();
    localObject = com.tencent.mm.modelvoice.q.mK((String)localObject);
    if (localObject != null) {
      parame1 = n.H(((com.tencent.mm.modelvoice.b)localObject).bd(i, j).buf);
    }
    localbml.ues = parame1;
    i = a(parame, this.gtx, this);
    GMTrace.o(5762772369408L, 42936);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5762906587136L, 42937);
    brP();
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.quX = ((bmm)this.gtx.gtD.gtK).udz;
      this.nuY.a(paramInt2, paramInt3, paramString, this);
      if (!brP()) {
        break label137;
      }
      if (this.quX == null) {
        break label131;
      }
    }
    label131:
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.NetSceneUploadVoiceForTrans", "succeeed finish: %B", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(5762906587136L, 42937);
      return;
      w.d("MicroMsg.NetSceneUploadVoiceForTrans", "error upload: errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      break;
    }
    label137:
    GMTrace.o(5762906587136L, 42937);
  }
  
  public final boolean brP()
  {
    GMTrace.i(5763175022592L, 42939);
    if (this.quX != null)
    {
      if (this.quX.tRE <= 0)
      {
        GMTrace.o(5763175022592L, 42939);
        return true;
      }
      GMTrace.o(5763175022592L, 42939);
      return false;
    }
    GMTrace.o(5763175022592L, 42939);
    return true;
  }
  
  public final int getType()
  {
    GMTrace.i(5762638151680L, 42935);
    GMTrace.o(5762638151680L, 42935);
    return 547;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\subapp\ui\voicetranstext\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */