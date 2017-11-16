package com.tencent.mm.ae;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bke;
import com.tencent.mm.protocal.c.bkf;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public b(String paramString)
  {
    GMTrace.i(4496562323456L, 33502);
    b.a locala = new b.a();
    locala.gtF = new bke();
    locala.gtG = new bkf();
    locala.uri = "/cgi-bin/micromsg-bin/unbindqq";
    locala.gtE = 253;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((bke)this.fUa.gtC.gtK).ugx = paramString;
    GMTrace.o(4496562323456L, 33502);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4496696541184L, 33503);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4496696541184L, 33503);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4496964976640L, 33505);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4496964976640L, 33505);
  }
  
  public final int getType()
  {
    GMTrace.i(4496830758912L, 33504);
    GMTrace.o(4496830758912L, 33504);
    return 253;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ae\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */