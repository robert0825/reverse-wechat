package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bct;
import com.tencent.mm.protocal.c.bcu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class af
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public af(String paramString)
  {
    GMTrace.i(1348888166400L, 10050);
    b.a locala = new b.a();
    locala.gtF = new bct();
    locala.gtG = new bcu();
    locala.uri = "/cgi-bin/micromsg-bin/newsetemailpwd";
    locala.gtE = 382;
    locala.gtH = 181;
    locala.gtI = 1000000181;
    this.fUa = locala.DA();
    ((bct)this.fUa.gtC.gtK).tUR = bg.Sr(paramString);
    w.d("MicroMsg.NetSceneSetEmailPwd", "md5 " + paramString);
    GMTrace.o(1348888166400L, 10050);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1349022384128L, 10051);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(1349022384128L, 10051);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1349290819584L, 10053);
    w.d("MicroMsg.NetSceneSetEmailPwd", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1349290819584L, 10053);
  }
  
  public final int getType()
  {
    GMTrace.i(1349156601856L, 10052);
    GMTrace.o(1349156601856L, 10052);
    return 382;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\modelsimple\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */