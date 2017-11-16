package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.ipcall.b.c;
import com.tencent.mm.protocal.c.avd;
import com.tencent.mm.protocal.c.ave;
import com.tencent.mm.sdk.platformtools.w;

public final class l
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private avd mlT;
  private ave mlU;
  
  public l(int paramInt, long paramLong, boolean paramBoolean)
  {
    GMTrace.i(11581916184576L, 86292);
    this.fUa = null;
    this.mlT = null;
    this.mlU = null;
    Object localObject1 = new b.a();
    ((b.a)localObject1).gtF = new avd();
    ((b.a)localObject1).gtG = new ave();
    ((b.a)localObject1).gtE = 227;
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/pstnreport";
    ((b.a)localObject1).gtH = 0;
    ((b.a)localObject1).gtI = 0;
    this.fUa = ((b.a)localObject1).DA();
    this.mlT = ((avd)this.fUa.gtC.gtK);
    this.mlT.uhU = paramInt;
    this.mlT.uKh = paramLong;
    localObject1 = this.mlT;
    if (paramBoolean) {}
    for (paramInt = 1;; paramInt = 0)
    {
      ((avd)localObject1).uKA = paramInt;
      w.d("MicroMsg.NetSceneIPCallReport", "NetSceneIPCallReport, roomId: %d, callseq: %d, gotAnswer: %d", new Object[] { Integer.valueOf(this.mlT.uhU), Long.valueOf(this.mlT.uKh), Integer.valueOf(this.mlT.uKA) });
      localObject1 = this.mlT;
      Object localObject2 = i.aIq();
      localObject2 = ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mjF + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mjG + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mlf + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).htr + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mlg + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mkV + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mkW + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mkX + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mkY + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mkZ + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mla + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mlb + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mlc + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mld + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mle + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mlh + "," + c.aJF() + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mlq + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).countryCode + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mlr + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mls + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mlt + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mlo + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mlv;
      w.i("MicroMsg.IPCallReportHelper", "getPstnClientReportString, result: %s", new Object[] { localObject2 });
      ((avd)localObject1).uKx = n.ni((String)localObject2);
      localObject1 = this.mlT;
      localObject2 = i.aIq();
      localObject2 = ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mjF + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mjG + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mlf + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mln;
      w.i("MicroMsg.IPCallReportHelper", "getPstnChannelReportString, result: %s", new Object[] { localObject2 });
      ((avd)localObject1).uKy = n.ni((String)localObject2);
      localObject1 = this.mlT;
      localObject2 = i.aIq();
      localObject2 = ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mjF + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mjG + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mlf + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mlm;
      w.i("MicroMsg.IPCallReportHelper", "getPstnEngineReport, result: %s", new Object[] { localObject2 });
      ((avd)localObject1).uKz = n.ni((String)localObject2);
      GMTrace.o(11581916184576L, 86292);
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11582184620032L, 86294);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11582184620032L, 86294);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11582318837760L, 86295);
    w.i("MicroMsg.NetSceneIPCallReport", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mlU = ((ave)((com.tencent.mm.ad.b)paramq).gtD.gtK);
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(11582318837760L, 86295);
  }
  
  public final int getType()
  {
    GMTrace.i(11582050402304L, 86293);
    GMTrace.o(11582050402304L, 86293);
    return 227;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\d\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */