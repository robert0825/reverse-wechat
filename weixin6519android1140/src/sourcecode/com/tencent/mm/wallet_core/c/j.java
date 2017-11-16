package com.tencent.mm.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aum;
import com.tencent.mm.protocal.c.aun;
import com.tencent.mm.sdk.platformtools.w;

public final class j
  extends l
{
  public final b fUa;
  private com.tencent.mm.ad.e fUd;
  public String klt;
  public String rsb;
  public String rsc;
  
  public j(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4)
  {
    GMTrace.i(1449954115584L, 10803);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new aum();
    ((b.a)localObject).gtG = new aun();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/preparepurchase";
    ((b.a)localObject).gtE = 422;
    ((b.a)localObject).gtH = 214;
    ((b.a)localObject).gtI = 1000000214;
    this.fUa = ((b.a)localObject).DA();
    localObject = (aum)this.fUa.gtC.gtK;
    this.klt = paramString1;
    ((aum)localObject).tRS = paramString1;
    this.rsc = paramString2;
    ((aum)localObject).uJL = paramString2;
    this.rsb = paramString3;
    ((aum)localObject).uJM = paramString3;
    ((aum)localObject).nFi = paramInt2;
    ((aum)localObject).uJN = paramInt1;
    ((aum)localObject).lTj = paramString4;
    w.d("MicroMsg.NetScenePreparePurchase", "productId:" + paramString1 + ",price:" + paramString2 + ",currencyType:" + paramString3 + ",payType:" + paramInt2);
    GMTrace.o(1449954115584L, 10803);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1450490986496L, 10807);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(1450490986496L, 10807);
    return i;
  }
  
  public final String clI()
  {
    GMTrace.i(1450222551040L, 10805);
    Object localObject = (aun)this.fUa.gtD.gtK;
    if (localObject != null)
    {
      w.d("MicroMsg.NetScenePreparePurchase", "get bill no is " + ((aun)localObject).uJO);
      localObject = ((aun)localObject).uJO;
      GMTrace.o(1450222551040L, 10805);
      return (String)localObject;
    }
    w.e("MicroMsg.NetScenePreparePurchase", "get bill no field.");
    GMTrace.o(1450222551040L, 10805);
    return "";
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(1450088333312L, 10804);
    w.e("MicroMsg.NetScenePreparePurchase", "ErrType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg:" + paramString);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      this.fUd.a(paramInt1, paramInt2, paramString, this);
      GMTrace.o(1450088333312L, 10804);
      return;
    }
    this.fUd.a(paramInt1, paramInt2, paramString, this);
    GMTrace.o(1450088333312L, 10804);
  }
  
  public final int getType()
  {
    GMTrace.i(1450356768768L, 10806);
    GMTrace.o(1450356768768L, 10806);
    return 422;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\wallet_core\c\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */