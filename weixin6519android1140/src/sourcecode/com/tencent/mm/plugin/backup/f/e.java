package com.tencent.mm.plugin.backup.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.zd;
import com.tencent.mm.protocal.c.ze;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public e(String paramString)
  {
    GMTrace.i(9511473512448L, 70866);
    w.i("MicroMsg.NetSceneGetConnectInfo", "summerbak NetSceneGetConnectInfo init, url[%s], stack[%s]", new Object[] { paramString, bg.bQW() });
    b.a locala = new b.a();
    locala.gtF = new zd();
    locala.gtG = new ze();
    locala.uri = "/cgi-bin/micromsg-bin/getconnectinfo";
    locala.gtH = 0;
    locala.gtI = 0;
    locala.gtE = 595;
    this.fUa = locala.DA();
    ((zd)this.fUa.gtC.gtK).URL = paramString;
    GMTrace.o(9511473512448L, 70866);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9511741947904L, 70868);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(9511741947904L, 70868);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(9512010383360L, 70870);
    w.i("MicroMsg.NetSceneGetConnectInfo", "onGYNetEnd errType[%d], errCode[%d]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = afC();
      com.tencent.mm.plugin.backup.a.e.P(paramq.tSB.uNP.tJp);
      w.i("MicroMsg.NetSceneGetConnectInfo", "onGYNetEnd id[%s], hello[%s], ok[%s], PCName[%s], PCAcctName[%s], scene[%d], resource[%s]", new Object[] { paramq.ID, paramq.tSX, paramq.tSY, paramq.tSP, paramq.tSQ, Integer.valueOf(paramq.tOG), paramq.uqc });
      paramq = paramq.tSB.uNP;
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(9512010383360L, 70870);
  }
  
  public final ze afC()
  {
    GMTrace.i(18462319575040L, 137555);
    ze localze = (ze)this.fUa.gtD.gtK;
    GMTrace.o(18462319575040L, 137555);
    return localze;
  }
  
  public final int getType()
  {
    GMTrace.i(9511607730176L, 70867);
    GMTrace.o(9511607730176L, 70867);
    return 595;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\f\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */