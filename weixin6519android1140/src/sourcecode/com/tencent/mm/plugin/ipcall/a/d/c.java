package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.afe;
import com.tencent.mm.protocal.c.aff;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  private afe mlA;
  public aff mlB;
  
  public c()
  {
    GMTrace.i(15066208403456L, 112252);
    this.fUa = null;
    this.mlA = null;
    this.mlB = null;
    this.fUd = null;
    b.a locala = new b.a();
    locala.gtF = new afe();
    locala.gtG = new aff();
    locala.gtE = 746;
    locala.uri = "/cgi-bin/micromsg-bin/getwcocallinfo";
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.mlA = ((afe)this.fUa.gtC.gtK);
    w.i("MicroMsg.NetSceneIPCallGetCallInfo", "NetSceneIPCallGetCallInfo");
    GMTrace.o(15066208403456L, 112252);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(15066476838912L, 112254);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(15066476838912L, 112254);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(15066611056640L, 112255);
    w.i("MicroMsg.NetSceneIPCallGetCallInfo", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mlB = ((aff)((b)paramq).gtD.gtK);
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(15066611056640L, 112255);
  }
  
  public final int getType()
  {
    GMTrace.i(15066342621184L, 112253);
    GMTrace.o(15066342621184L, 112253);
    return 746;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */