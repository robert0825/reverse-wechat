package com.tencent.mm.plugin.emoji.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.dq;
import com.tencent.mm.protocal.c.dr;
import com.tencent.mm.protocal.c.rf;
import com.tencent.mm.sdk.platformtools.w;
import java.text.DecimalFormat;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public static int klg;
  public static int klh;
  public static int kli;
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fXo;
  private String klj;
  private rf klk;
  
  static
  {
    GMTrace.i(11286771400704L, 84093);
    klg = 6;
    klh = 7;
    kli = 10;
    GMTrace.o(11286771400704L, 84093);
  }
  
  public b(String paramString, rf paramrf)
  {
    GMTrace.i(11286100312064L, 84088);
    b.a locala = new b.a();
    locala.gtF = new dq();
    locala.gtG = new dr();
    locala.uri = "/cgi-bin/micromsg-bin/mmaskforreward";
    locala.gtE = 830;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.klj = paramString;
    this.klk = paramrf;
    GMTrace.o(11286100312064L, 84088);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11286502965248L, 84091);
    this.fXo = parame1;
    parame1 = (dq)this.fUa.gtC.gtK;
    parame1.tRS = this.klj;
    rf localrf = new rf();
    localrf.lSG = this.klk.lSG;
    localrf.uhC = this.klk.uhC;
    localrf.uhB = new DecimalFormat("0.00").format(Float.valueOf(this.klk.uhB));
    parame1.tRT = localrf;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11286502965248L, 84091);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11286234529792L, 84089);
    w.d("MicroMsg.emoji.NetSceneAskForReward", "onGYNetEnd ErrType:%d, errCode:%d, errMsg", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fXo.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(11286234529792L, 84089);
  }
  
  public final dr aru()
  {
    GMTrace.i(11286637182976L, 84092);
    dr localdr = (dr)this.fUa.gtD.gtK;
    GMTrace.o(11286637182976L, 84092);
    return localdr;
  }
  
  public final int getType()
  {
    GMTrace.i(11286368747520L, 84090);
    GMTrace.o(11286368747520L, 84090);
    return 830;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\f\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */