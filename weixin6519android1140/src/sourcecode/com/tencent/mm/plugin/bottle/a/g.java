package com.tencent.mm.plugin.bottle.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.a;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.modelvoice.o;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bix;
import com.tencent.mm.protocal.c.biy;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class g
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  int joX;
  private com.tencent.mm.modelvoice.b jpa;
  int msgType;
  
  public g(String paramString)
  {
    GMTrace.i(7598736670720L, 56615);
    this.msgType = -1;
    this.joX = 0;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bix();
    ((b.a)localObject).gtG = new biy();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/throwbottle";
    ((b.a)localObject).gtE = 154;
    ((b.a)localObject).gtH = 53;
    ((b.a)localObject).gtI = 1000000053;
    this.fUa = ((b.a)localObject).DA();
    if (!bg.nm(paramString))
    {
      this.msgType = 1;
      localObject = (bix)this.fUa.gtC.gtK;
      ((bix)localObject).uJj = 0;
      ((bix)localObject).lQc = this.msgType;
      ((bix)localObject).tRD = 0;
      ((bix)localObject).tRC = paramString.getBytes().length;
      ((bix)localObject).ugn = 0;
      ((bix)localObject).ueU = n.H(paramString.getBytes());
      ((bix)localObject).uCu = com.tencent.mm.a.g.n((paramString + bg.Pv()).getBytes());
    }
    GMTrace.o(7598736670720L, 56615);
  }
  
  public g(String paramString, int paramInt)
  {
    GMTrace.i(7598870888448L, 56616);
    this.msgType = -1;
    this.joX = 0;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bix();
    ((b.a)localObject).gtG = new biy();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/throwbottle";
    ((b.a)localObject).gtE = 154;
    ((b.a)localObject).gtH = 53;
    ((b.a)localObject).gtI = 1000000053;
    this.fUa = ((b.a)localObject).DA();
    if ((!bg.nm(paramString)) && (paramInt > 0))
    {
      this.msgType = 3;
      localObject = (bix)this.fUa.gtC.gtK;
      ((bix)localObject).ugn = paramInt;
      ((bix)localObject).uCu = paramString;
      ((bix)localObject).uJj = 0;
      ((bix)localObject).lQc = this.msgType;
    }
    GMTrace.o(7598870888448L, 56616);
  }
  
  private int lf(int paramInt)
  {
    GMTrace.i(7599810412544L, 56623);
    a locala = new a();
    locala.msgType = paramInt;
    Object localObject = (bix)this.fUa.gtC.gtK;
    biy localbiy = (biy)this.fUa.gtD.gtK;
    locala.joP = localbiy.uTY.size();
    locala.joR = 1;
    if (paramInt == 3)
    {
      locala.content = ((bix)localObject).uCu;
      locala.joS = ((bix)localObject).ugn;
    }
    for (;;)
    {
      localObject = "";
      paramInt = 0;
      while (paramInt < localbiy.uTY.size())
      {
        localObject = (String)localObject + localbiy.uTY.get(paramInt);
        paramInt += 1;
      }
      locala.content = new String(n.a(((bix)localObject).ueU));
    }
    locala.joO = com.tencent.mm.a.g.n(((String)localObject).getBytes());
    locala.joT = bg.Pv();
    paramInt = 0;
    while (paramInt < localbiy.uTY.size())
    {
      localObject = c.tC(n.a((azq)localbiy.uTY.get(paramInt)));
      if (!bg.nm((String)localObject))
      {
        locala.joQ = ((String)localObject);
        i.ahz().a(locala);
      }
      paramInt += 1;
    }
    GMTrace.o(7599810412544L, 56623);
    return 0;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7599005106176L, 56617);
    this.fUd = parame1;
    if (this.msgType == 1) {
      this.msgType = (0 - this.msgType);
    }
    for (;;)
    {
      int i = a(parame, this.fUa, this);
      GMTrace.o(7599005106176L, 56617);
      return i;
      if (this.msgType != 3) {
        break;
      }
      parame1 = (bix)this.fUa.gtC.gtK;
      parame1.lQc = 3;
      parame1.uJj = 0;
      if (this.jpa == null)
      {
        this.jpa = com.tencent.mm.modelvoice.q.mK(parame1.uCu);
        this.joX = 0;
        parame1.tRC = o.mm(parame1.uCu);
      }
      com.tencent.mm.modelvoice.g localg = this.jpa.bd(this.joX, 6000);
      w.d("MicroMsg.NetSceneThrowBottle", "doScene READ file[" + parame1.uCu + "] read ret:" + localg.ret + " readlen:" + localg.eyw + " newOff:" + localg.hcV + " netOff:" + this.joX + " line:" + com.tencent.mm.compatible.util.g.tA());
      if ((localg.ret < 0) || (localg.eyw == 0))
      {
        w.e("MicroMsg.NetSceneThrowBottle", "Err doScene READ file[" + parame1.uCu + "] read ret:" + localg.ret + " readlen:" + localg.eyw + " newOff:" + localg.hcV + " netOff:" + this.joX);
        com.tencent.mm.modelvoice.q.mL(parame1.uCu);
        GMTrace.o(7599005106176L, 56617);
        return -1;
      }
      byte[] arrayOfByte = new byte[localg.eyw];
      System.arraycopy(localg.buf, 0, arrayOfByte, 0, localg.eyw);
      parame1.ueU = n.H(arrayOfByte);
      parame1.tRD = this.joX;
    }
    w.e("MicroMsg.NetSceneThrowBottle", "doScene Error Msg type: " + this.msgType);
    GMTrace.o(7599005106176L, 56617);
    return -1;
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    GMTrace.i(7599139323904L, 56618);
    paramq = (bix)((com.tencent.mm.ad.b)paramq).gtC.gtK;
    if (paramq.lQc == 1)
    {
      i = k.b.gum;
      GMTrace.o(7599139323904L, 56618);
      return i;
    }
    if (paramq.lQc != 3)
    {
      i = k.b.gun;
      GMTrace.o(7599139323904L, 56618);
      return i;
    }
    if ((paramq.tRC == 0) || (paramq.tRC <= paramq.tRD) || (bg.nm(paramq.uCu)) || (bg.bq(n.a(paramq.ueU))))
    {
      i = k.b.gun;
      GMTrace.o(7599139323904L, 56618);
      return i;
    }
    int i = k.b.gum;
    GMTrace.o(7599139323904L, 56618);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(7599541977088L, 56621);
    w.d("MicroMsg.NetSceneThrowBottle", "onGYNetEnd errtype:" + paramInt2 + " errCode:" + paramInt3);
    paramq = (bix)this.fUa.gtC.gtK;
    paramArrayOfByte = (biy)this.fUa.gtD.gtK;
    if (paramInt2 == 4) {
      switch (paramInt3)
      {
      default: 
        c.ld(paramArrayOfByte.upm);
        c.lc(paramArrayOfByte.upl);
      }
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.d("MicroMsg.NetSceneThrowBottle", "ERR: onGYNetEnd errtype:" + paramInt2 + " errCode:" + paramInt3);
      com.tencent.mm.modelvoice.q.mL(paramq.uCu);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(7599541977088L, 56621);
      return;
    }
    w.d("MicroMsg.NetSceneThrowBottle", "getStartPos " + paramArrayOfByte.tRD);
    w.d("MicroMsg.NetSceneThrowBottle", "getTotalLen " + paramArrayOfByte.tRC);
    w.d("MicroMsg.NetSceneThrowBottle", "getThrowCount " + paramArrayOfByte.upl);
    w.d("MicroMsg.NetSceneThrowBottle", "getPickCount " + paramArrayOfByte.upm);
    w.d("MicroMsg.NetSceneThrowBottle", "getDistance " + paramArrayOfByte.uJl);
    w.d("MicroMsg.NetSceneThrowBottle", "getBottleList " + paramArrayOfByte.uTY.size());
    paramInt1 = 0;
    while (paramInt1 < paramArrayOfByte.uTY.size())
    {
      w.d("MicroMsg.NetSceneThrowBottle", "bott id:" + paramArrayOfByte.uTY.get(paramInt1));
      paramInt1 += 1;
    }
    if (paramq.lQc == 1)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      lf(1);
      GMTrace.o(7599541977088L, 56621);
      return;
    }
    this.joX += paramq.ueU.uNN;
    if (this.joX >= paramq.tRC)
    {
      c.ld(paramArrayOfByte.upm);
      c.lc(paramArrayOfByte.upl);
      lf(3);
      com.tencent.mm.modelvoice.q.mL(paramq.uCu);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(7599541977088L, 56621);
      return;
    }
    if (a(this.gtW, this.fUd) == -1)
    {
      this.fUd.a(3, -1, "doScene failed", this);
      GMTrace.o(7599541977088L, 56621);
      return;
    }
    GMTrace.o(7599541977088L, 56621);
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(7599407759360L, 56620);
    w.e("MicroMsg.NetSceneThrowBottle", "setSecurityCheckError:" + parama + " type:" + this.msgType);
    GMTrace.o(7599407759360L, 56620);
  }
  
  public final int ahx()
  {
    GMTrace.i(7599676194816L, 56622);
    int i = ((biy)this.fUa.gtD.gtK).uJl;
    GMTrace.o(7599676194816L, 56622);
    return i;
  }
  
  public final int getType()
  {
    GMTrace.i(7599944630272L, 56624);
    GMTrace.o(7599944630272L, 56624);
    return 154;
  }
  
  protected final int vB()
  {
    GMTrace.i(7599273541632L, 56619);
    GMTrace.o(7599273541632L, 56619);
    return 10;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */