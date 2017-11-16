package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.bfi;
import com.tencent.mm.protocal.c.bfj;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;
import java.util.Vector;

public final class p
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public static List<Long> psa;
  public b fUa;
  public com.tencent.mm.ad.e fUd;
  private long poZ;
  
  static
  {
    GMTrace.i(8050781978624L, 59983);
    psa = new Vector();
    GMTrace.o(8050781978624L, 59983);
  }
  
  public p(long paramLong)
  {
    GMTrace.i(8050245107712L, 59979);
    this.poZ = paramLong;
    b.a locala = new b.a();
    locala.gtF = new bfi();
    locala.gtG = new bfj();
    locala.uri = "/cgi-bin/micromsg-bin/mmsnsobjectdetail";
    locala.gtE = 210;
    locala.gtH = 101;
    locala.gtI = 1000000101;
    this.fUa = locala.DA();
    ((bfi)this.fUa.gtC.gtK).tXT = paramLong;
    w.d("MicroMsg.NetSceneSnsObjectDetial", "req snsId " + paramLong);
    GMTrace.o(8050245107712L, 59979);
  }
  
  public static boolean dy(long paramLong)
  {
    GMTrace.i(8049976672256L, 59977);
    if (psa.contains(Long.valueOf(paramLong)))
    {
      GMTrace.o(8049976672256L, 59977);
      return false;
    }
    psa.add(Long.valueOf(paramLong));
    GMTrace.o(8049976672256L, 59977);
    return true;
  }
  
  private static boolean dz(long paramLong)
  {
    GMTrace.i(8050110889984L, 59978);
    psa.remove(Long.valueOf(paramLong));
    GMTrace.o(8050110889984L, 59978);
    return true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(8050379325440L, 59980);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(8050379325440L, 59980);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(8050647760896L, 59982);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      dz(this.poZ);
      GMTrace.o(8050647760896L, 59982);
      return;
    }
    paramq = ((bfj)this.fUa.gtD.gtK).uRi;
    if (paramq != null) {
      w.i("MicroMsg.NetSceneSnsObjectDetial", "snsdetail xml " + n.b(paramq.uQM));
    }
    ai.d(paramq);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    dz(this.poZ);
    GMTrace.o(8050647760896L, 59982);
  }
  
  public final int getType()
  {
    GMTrace.i(8050513543168L, 59981);
    GMTrace.o(8050513543168L, 59981);
    return 210;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */