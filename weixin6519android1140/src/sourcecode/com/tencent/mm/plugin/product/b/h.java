package com.tencent.mm.plugin.product.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aco;
import com.tencent.mm.protocal.c.acp;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;

public final class h
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public String nHX;
  public m nHY;
  public List<n> nHZ;
  
  public h(m paramm, String paramString)
  {
    GMTrace.i(5996579651584L, 44678);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new aco();
    ((b.a)localObject).gtG = new acp();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getproductdetail";
    ((b.a)localObject).gtE = 553;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (aco)this.fUa.gtC.gtK;
    this.nHX = paramString;
    ((aco)localObject).usG = paramString;
    w.d("MicroMsg.NetSceneMallGetProductDetail", "pid " + paramString);
    ((aco)localObject).jia = 0;
    this.nHY = paramm;
    GMTrace.o(5996579651584L, 44678);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5996982304768L, 44681);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5996982304768L, 44681);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5996713869312L, 44679);
    paramArrayOfByte = (acp)((b)paramq).gtD.gtK;
    if (!bg.nm(paramArrayOfByte.usI))
    {
      w.d("MicroMsg.NetSceneMallGetProductDetail", "resp.ProductInfo " + paramArrayOfByte.usI);
      this.nHY = m.a(this.nHY, paramArrayOfByte.usI);
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
    if (!bg.nm(paramArrayOfByte.usJ))
    {
      w.d("MicroMsg.NetSceneMallGetProductDetail", "resp.RecommendInfo " + paramArrayOfByte.usJ);
      this.nHZ = n.parse(paramArrayOfByte.usJ);
    }
    w.d("MicroMsg.NetSceneMallGetProductDetail", "errCode " + paramInt1 + ", errMsg " + paramq);
    this.fUd.a(paramInt2, paramInt1, paramq, this);
    GMTrace.o(5996713869312L, 44679);
  }
  
  public final int getType()
  {
    GMTrace.i(5996848087040L, 44680);
    GMTrace.o(5996848087040L, 44680);
    return 553;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */