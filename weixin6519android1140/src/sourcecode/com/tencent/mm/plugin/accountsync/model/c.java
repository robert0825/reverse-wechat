package com.tencent.mm.plugin.accountsync.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bbt;
import com.tencent.mm.protocal.c.bbu;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public c(bbt parambbt)
  {
    GMTrace.i(14699257135104L, 109518);
    this.fUd = null;
    b.a locala = new b.a();
    locala.gtF = parambbt;
    locala.gtG = new bbu();
    locala.uri = "/cgi-bin/micromsg-bin/sendphoto2fbwall";
    locala.gtE = 433;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    GMTrace.o(14699257135104L, 109518);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(14699391352832L, 109519);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(14699391352832L, 109519);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(14699659788288L, 109521);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(14699659788288L, 109521);
  }
  
  public final int getType()
  {
    GMTrace.i(14699525570560L, 109520);
    GMTrace.o(14699525570560L, 109520);
    return 433;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\accountsync\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */