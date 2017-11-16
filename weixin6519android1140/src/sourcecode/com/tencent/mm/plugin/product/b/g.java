package com.tencent.mm.plugin.product.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.abd;
import com.tencent.mm.protocal.c.abe;
import com.tencent.mm.protocal.c.bz;
import com.tencent.mm.protocal.c.rz;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class g
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public LinkedList<rz> nHP;
  public String nHX;
  
  public g(String paramString1, String paramString2, bz parambz)
  {
    GMTrace.i(5996042780672L, 44674);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new abd();
    ((b.a)localObject).gtG = new abe();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getlastestexpressinfo";
    ((b.a)localObject).gtE = 578;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (abd)this.fUa.gtC.gtK;
    this.nHX = paramString1;
    ((abd)localObject).tXF = paramString1;
    w.d("MicroMsg.NetSceneMallGetLastestExpressInfo", "pid " + paramString1);
    ((abd)localObject).tYP = paramString2;
    ((abd)localObject).urB = parambz;
    GMTrace.o(5996042780672L, 44674);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5996445433856L, 44677);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5996445433856L, 44677);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5996176998400L, 44675);
    paramArrayOfByte = (abe)((b)paramq).gtD.gtK;
    if ((paramInt2 == 0) && (paramInt3 == 0) && (paramArrayOfByte.tYQ == 0))
    {
      w.d("MicroMsg.NetSceneMallGetLastestExpressInfo", "resp.ExpressCount " + paramArrayOfByte.urD);
      this.nHP = paramArrayOfByte.urC;
    }
    paramInt1 = paramInt3;
    paramq = paramString;
    if (paramInt3 == 0)
    {
      paramInt1 = paramInt3;
      paramq = paramString;
      if (paramArrayOfByte.tYQ != 0)
      {
        paramInt1 = paramArrayOfByte.tYQ;
        paramq = paramArrayOfByte.tYR;
      }
    }
    w.d("MicroMsg.NetSceneMallGetLastestExpressInfo", "errCode " + paramInt1 + ", errMsg " + paramq);
    this.fUd.a(paramInt2, paramInt1, paramq, this);
    GMTrace.o(5996176998400L, 44675);
  }
  
  public final int getType()
  {
    GMTrace.i(5996311216128L, 44676);
    GMTrace.o(5996311216128L, 44676);
    return 578;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */