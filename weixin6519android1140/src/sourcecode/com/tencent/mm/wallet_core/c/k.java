package com.tencent.mm.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bni;
import com.tencent.mm.protocal.c.bnj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class k
  extends l
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public String klt;
  public int xDs;
  
  public k(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    GMTrace.i(1453980647424L, 10833);
    this.klt = null;
    this.xDs = 0;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bni();
    ((b.a)localObject).gtG = new bnj();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/verifypurchase";
    ((b.a)localObject).gtE = 414;
    ((b.a)localObject).gtH = 215;
    ((b.a)localObject).gtI = 1000000215;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bni)this.fUa.gtC.gtK;
    this.klt = paramString1;
    ((bni)localObject).tRS = paramString1;
    ((bni)localObject).uXk = 1;
    ((bni)localObject).uJN = paramInt2;
    ((bni)localObject).nFi = paramInt1;
    if (!bg.nm(paramString6))
    {
      ((bni)localObject).uJL = paramString6;
      ((bni)localObject).uJM = paramString5;
    }
    ((bni)localObject).uJO = paramString2;
    ((bni)localObject).uXm = paramString4;
    if (paramString3 != null) {
      paramString1 = paramString3.getBytes();
    }
    for (((bni)localObject).uXj = new azp().be(paramString1);; ((bni)localObject).uXj = new azp())
    {
      ((bni)localObject).uXl = ((int)bg.Pu());
      w.i("MicroMsg.NetSceneVerifyPurchase", "productId:" + this.klt + ",verifyType:1,palyType:" + paramInt1 + ",payload:" + paramString2 + ",purchaseData:" + paramString3 + ",dataSignature:" + paramString4);
      GMTrace.o(1453980647424L, 10833);
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1454517518336L, 10837);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(1454517518336L, 10837);
    return i;
  }
  
  public final String clJ()
  {
    GMTrace.i(1454249082880L, 10835);
    Object localObject = (bnj)this.fUa.gtD.gtK;
    if (localObject != null)
    {
      w.d("MicroMsg.NetSceneVerifyPurchase", " Get Series ID is " + ((bnj)localObject).uib);
      w.d("MicroMsg.NetSceneVerifyPurchase", " Get Biz Type is " + ((bnj)localObject).lQp);
      localObject = ((bnj)localObject).uib;
      GMTrace.o(1454249082880L, 10835);
      return (String)localObject;
    }
    GMTrace.o(1454249082880L, 10835);
    return "";
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(1454114865152L, 10834);
    w.e("MicroMsg.NetSceneVerifyPurchase", "ErrType:" + paramInt1 + "   errCode:" + paramInt2);
    paramq = (bnj)((b)paramq).gtD.gtK;
    if (paramq.uND != null) {
      this.xDs = paramq.uXn;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      this.fUd.a(paramInt1, paramInt2, paramString, this);
      GMTrace.o(1454114865152L, 10834);
      return;
    }
    this.fUd.a(paramInt1, paramInt2, paramString, this);
    GMTrace.o(1454114865152L, 10834);
  }
  
  public final int getType()
  {
    GMTrace.i(1454383300608L, 10836);
    GMTrace.o(1454383300608L, 10836);
    return 414;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\wallet_core\c\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */