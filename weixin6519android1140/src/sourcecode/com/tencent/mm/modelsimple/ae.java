package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bcb;
import com.tencent.mm.protocal.c.bcc;

public final class ae
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public ae(String paramString)
  {
    GMTrace.i(1361101979648L, 10141);
    b.a locala = new b.a();
    locala.gtF = new bcb();
    locala.gtG = new bcc();
    locala.uri = "/cgi-bin/micromsg-bin/sendverifyemail";
    locala.gtE = 108;
    locala.gtH = 43;
    locala.gtI = 1000000043;
    this.fUa = locala.DA();
    ((bcb)this.fUa.gtC.gtK).ufy = new azq().Rq(paramString);
    GMTrace.o(1361101979648L, 10141);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1361236197376L, 10142);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(1361236197376L, 10142);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1361504632832L, 10144);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1361504632832L, 10144);
  }
  
  public final int getType()
  {
    GMTrace.i(1361370415104L, 10143);
    GMTrace.o(1361370415104L, 10143);
    return 108;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\modelsimple\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */