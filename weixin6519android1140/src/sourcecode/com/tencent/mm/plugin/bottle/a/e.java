package com.tencent.mm.plugin.bottle.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvoice.u;
import com.tencent.mm.protocal.c.ari;
import com.tencent.mm.protocal.c.arj;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.ny;
import com.tencent.mm.protocal.c.nz;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.at;

public final class e
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private String euR;
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private String joW;
  private int joX;
  private com.tencent.mm.modelvoice.a joY;
  private int msgType;
  
  public e(String paramString, int paramInt)
  {
    GMTrace.i(7600078848000L, 56625);
    this.joW = "";
    this.msgType = 0;
    this.joX = 0;
    this.joY = null;
    this.euR = "";
    b.a locala = new b.a();
    locala.gtF = new ari();
    locala.gtG = new arj();
    locala.uri = "/cgi-bin/micromsg-bin/openbottle";
    locala.gtE = 156;
    locala.gtH = 55;
    locala.gtI = 1000000055;
    this.fUa = locala.DA();
    this.joW = paramString;
    this.msgType = paramInt;
    GMTrace.o(7600078848000L, 56625);
  }
  
  private int ahv()
  {
    GMTrace.i(7600615718912L, 56629);
    ari localari = (ari)this.fUa.gtC.gtK;
    arj localarj = (arj)this.fUa.gtD.gtK;
    a locala = new a();
    locala.msgType = localari.lQc;
    locala.joP = 0;
    locala.joR = 2;
    locala.joQ = c.tC(localari.uHz);
    locala.joT = bg.Pv();
    locala.joO = g.n(localari.uHz.getBytes());
    if (this.msgType == 3)
    {
      locala.content = this.euR;
      locala.joS = localarj.ugn;
    }
    for (;;)
    {
      i.ahz().a(locala);
      GMTrace.o(7600615718912L, 56629);
      return 0;
      locala.content = new String(localarj.uHD.ueU.uNP.tJp);
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7600213065728L, 56626);
    this.fUd = parame1;
    parame1 = (ari)this.fUa.gtC.gtK;
    parame1.lQc = this.msgType;
    parame1.uHz = this.joW;
    if (parame1.uHA == null) {
      parame1.uHA = new nz();
    }
    if (parame1.uHB == null) {
      parame1.uHB = new nz();
    }
    if (this.msgType == 1)
    {
      parame1.uHA.tRD = 0;
      parame1.uHA.ueT = 0;
    }
    while (this.msgType == 3)
    {
      int i = a(parame, this.fUa, this);
      GMTrace.o(7600213065728L, 56626);
      return i;
    }
    w.e("MicroMsg.NetSceneOpenBottle", "doScene Error Msg type" + this.msgType);
    GMTrace.o(7600213065728L, 56626);
    return -1;
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    GMTrace.i(7600347283456L, 56627);
    paramq = (ari)((com.tencent.mm.ad.b)paramq).gtC.gtK;
    if (paramq.lQc == 1)
    {
      i = k.b.gum;
      GMTrace.o(7600347283456L, 56627);
      return i;
    }
    if (paramq.lQc != 3)
    {
      i = k.b.gun;
      GMTrace.o(7600347283456L, 56627);
      return i;
    }
    if (paramq.uHA == null)
    {
      w.d("MicroMsg.NetSceneOpenBottle", "ERR: securityVerificationChecked errtype: rImpl.getBigContentInfo() == null");
      i = k.b.gun;
      GMTrace.o(7600347283456L, 56627);
      return i;
    }
    if ((paramq.uHA.ueT == 0) && (paramq.uHA.tRD == 0))
    {
      i = k.b.gum;
      GMTrace.o(7600347283456L, 56627);
      return i;
    }
    if (paramq.uHA.ueT <= paramq.uHA.tRD)
    {
      i = k.b.gun;
      GMTrace.o(7600347283456L, 56627);
      return i;
    }
    int i = k.b.gum;
    GMTrace.o(7600347283456L, 56627);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(7600749936640L, 56630);
    w.d("MicroMsg.NetSceneOpenBottle", "onGYNetEnd errtype:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.d("MicroMsg.NetSceneOpenBottle", "ERR: onGYNetEnd errtype:" + paramInt2 + " errCode:" + paramInt3);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(7600749936640L, 56630);
      return;
    }
    paramq = (ari)this.fUa.gtC.gtK;
    paramArrayOfByte = (arj)this.fUa.gtD.gtK;
    if (this.msgType == 1)
    {
      ahv();
      localau = new au();
      localau.db(paramq.uHz);
      localau.setContent(com.tencent.mm.platformtools.n.b(paramArrayOfByte.uHD.ueU));
      localau.E(bg.Pv());
      localau.dC(0);
      localau.dB(3);
      localau.setType(c.le(paramq.lQc));
      at.AR();
      com.tencent.mm.y.c.yM().P(localau);
      w.d("MicroMsg.NetSceneOpenBottle", "onGYNetEnd :" + localau.field_content);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(7600749936640L, 56630);
      return;
    }
    if (bg.nm(this.euR))
    {
      this.euR = u.mU(this.joW);
      this.joY = new com.tencent.mm.modelvoice.a(com.tencent.mm.modelvoice.q.getFullPath(this.euR));
      this.joX = 0;
    }
    if (paramArrayOfByte.uHD.ueT < paramArrayOfByte.uHD.tRD + paramArrayOfByte.uHD.ueU.uNN)
    {
      w.e("MicroMsg.NetSceneOpenBottle", "onGYNetEnd tot:" + paramArrayOfByte.uHD.ueT + " start:" + paramArrayOfByte.uHD.tRD + " len:" + paramArrayOfByte.uHD.ueU.uNN);
      this.fUd.a(3, -1, paramString, this);
      GMTrace.o(7600749936640L, 56630);
      return;
    }
    if (paramArrayOfByte.uHD.tRD != this.joX)
    {
      w.e("MicroMsg.NetSceneOpenBottle", "onGYNetEnd start:" + paramArrayOfByte.uHD.tRD + " off:" + this.joX);
      this.fUd.a(3, -1, paramString, this);
      GMTrace.o(7600749936640L, 56630);
      return;
    }
    paramInt1 = this.joY.write(paramArrayOfByte.uHD.ueU.uNP.tJp, paramArrayOfByte.uHD.ueU.uNN, paramArrayOfByte.uHD.tRD);
    if (paramInt1 != paramArrayOfByte.uHD.ueU.uNN + paramArrayOfByte.uHD.tRD)
    {
      w.e("MicroMsg.NetSceneOpenBottle", "onGYNetEnd start:" + paramArrayOfByte.uHD.tRD + " len:" + paramArrayOfByte.uHD.ueU.uNN + " writeRet:" + paramInt1);
      this.fUd.a(3, -1, paramString, this);
      GMTrace.o(7600749936640L, 56630);
      return;
    }
    this.joX = paramInt1;
    if (paramArrayOfByte.uHD.ueT > this.joX)
    {
      if (a(this.gtW, this.fUd) == -1)
      {
        this.fUd.a(3, -1, "doScene failed", this);
        GMTrace.o(7600749936640L, 56630);
        return;
      }
      GMTrace.o(7600749936640L, 56630);
      return;
    }
    ahv();
    au localau = new au();
    localau.db(paramq.uHz);
    localau.setContent(com.tencent.mm.modelvoice.n.b("bottle", paramArrayOfByte.ugn, false));
    localau.dc(this.euR);
    localau.E(bg.Pv());
    localau.dC(0);
    localau.dB(3);
    localau.setType(c.le(paramq.lQc));
    at.AR();
    com.tencent.mm.y.c.yM().P(localau);
    w.d("MicroMsg.NetSceneOpenBottle", "voice :" + paramArrayOfByte.ugn + " file:" + this.euR);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(7600749936640L, 56630);
  }
  
  public final int getType()
  {
    GMTrace.i(7600884154368L, 56631);
    GMTrace.o(7600884154368L, 56631);
    return 156;
  }
  
  protected final int vB()
  {
    GMTrace.i(7600481501184L, 56628);
    GMTrace.o(7600481501184L, 56628);
    return 10;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */