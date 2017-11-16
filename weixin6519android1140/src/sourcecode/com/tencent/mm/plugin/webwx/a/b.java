package com.tencent.mm.plugin.webwx.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.sc;
import com.tencent.mm.protocal.c.sd;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private final com.tencent.mm.ad.b gMj;
  
  public b(String paramString)
  {
    GMTrace.i(7657389817856L, 57052);
    b.a locala = new b.a();
    sc localsc = new sc();
    sd localsd = new sd();
    locala.gtF = localsc;
    locala.gtG = localsd;
    locala.uri = "/cgi-bin/micromsg-bin/extdeviceloginconfirmcancel";
    locala.gtE = 973;
    locala.gtH = 0;
    locala.gtI = 0;
    localsc.uih = paramString;
    this.gMj = locala.DA();
    GMTrace.o(7657389817856L, 57052);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7657658253312L, 57054);
    this.fUd = parame1;
    int i = a(parame, this.gMj, this);
    GMTrace.o(7657658253312L, 57054);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(7657792471040L, 57055);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(7657792471040L, 57055);
  }
  
  public final int getType()
  {
    GMTrace.i(7657524035584L, 57053);
    GMTrace.o(7657524035584L, 57053);
    return 973;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webwx\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */