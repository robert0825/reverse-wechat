package com.tencent.mm.plugin.recharge.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.mall.c;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.c.bhx;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.l;

public final class g
  extends l
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public String hyD;
  public PayInfo oek;
  
  public g(MallRechargeProduct paramMallRechargeProduct, String paramString)
  {
    this(paramMallRechargeProduct.appId, paramMallRechargeProduct.odH, paramMallRechargeProduct.eEa, paramString);
    GMTrace.i(7856971579392L, 58539);
    GMTrace.o(7856971579392L, 58539);
  }
  
  public g(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(7857105797120L, 58540);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bhx();
    ((b.a)localObject).gtG = new bhy();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/submitpayproductbuyinfo";
    ((b.a)localObject).gtE = 498;
    ((b.a)localObject).gtH = 230;
    ((b.a)localObject).gtI = 1000000230;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bhx)this.fUa.gtC.gtK;
    w.d("MicroMsg.NetSceneSubmitPayProductBuyInfo", "remark: %s", new Object[] { paramString4 });
    this.hyD = paramString1;
    ((bhx)localObject).umG = paramString1;
    ((bhx)localObject).umF = paramString2;
    ((bhx)localObject).urE = paramString3;
    ((bhx)localObject).umH = paramString4;
    ((bhx)localObject).ugx = c.bzi().Km(paramString2);
    GMTrace.o(7857105797120L, 58540);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7857508450304L, 58543);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(7857508450304L, 58543);
    return i;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(7857240014848L, 58541);
    this.oek = new PayInfo();
    Object localObject = (bhy)((b)paramq).gtD.gtK;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      w.d("MicroMsg.NetSceneSubmitPayProductBuyInfo", "resp.ReqKey " + ((bhy)localObject).tRU);
      this.oek.appId = this.hyD;
      this.oek.rse = ((bhy)localObject).unF;
      this.oek.eHG = ((bhy)localObject).tRU;
    }
    int i = paramInt2;
    if (paramInt2 == 0) {
      i = ((bhy)localObject).umI;
    }
    paramq = paramString;
    if (bg.nm(paramString)) {
      paramq = ((bhy)localObject).umJ;
    }
    this.oek.tIB = String.valueOf(i);
    localObject = this.oek;
    if (paramq != null) {}
    for (paramString = paramq;; paramString = "")
    {
      ((PayInfo)localObject).eAR = paramString;
      w.d("MicroMsg.NetSceneSubmitPayProductBuyInfo", "errCode " + i + ", errMsg " + paramq);
      this.fUd.a(paramInt1, i, paramq, this);
      GMTrace.o(7857240014848L, 58541);
      return;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(7857374232576L, 58542);
    GMTrace.o(7857374232576L, 58542);
    return 498;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\recharge\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */