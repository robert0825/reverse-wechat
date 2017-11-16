package com.tencent.mm.plugin.wallet_index.c.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.asn;
import com.tencent.mm.protocal.c.aso;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.l;

public final class a
  extends l
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public String jumpUrl;
  public String prepayId;
  public String rse;
  public String rsn;
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt)
  {
    GMTrace.i(7563437408256L, 56352);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new asn();
    ((b.a)localObject).gtG = new aso();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/payibggenprepay";
    ((b.a)localObject).gtE = 1563;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (asn)this.fUa.gtC.gtK;
    ((asn)localObject).lQa = paramString1;
    ((asn)localObject).udg = paramString4;
    ((asn)localObject).udf = paramString2;
    ((asn)localObject).udh = paramString5;
    ((asn)localObject).udi = paramString6;
    ((asn)localObject).tUz = paramString3;
    ((asn)localObject).ucv = paramString7;
    ((asn)localObject).unC = paramString8;
    ((asn)localObject).tMZ = paramInt;
    w.d("MicroMsg.NetSceneIbgPayGenPrepay", String.format("appid:%s,packageExt:%s,nonceStr:%s,paySignature:%s,signtype:%s,timeStamp:%s,url:%s,bizUsername:%s,", new Object[] { paramString1, paramString4, paramString2, paramString5, paramString6, paramString3, paramString7, paramString8 }));
    GMTrace.o(7563437408256L, 56352);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7563840061440L, 56355);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(7563840061440L, 56355);
    return i;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(7563571625984L, 56353);
    w.i("MicroMsg.NetSceneIbgPayGenPrepay", "hy: gen ibg prepay raw net errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    paramq = (aso)((b)paramq).gtD.gtK;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      w.i("MicroMsg.NetSceneIbgPayGenPrepay", "hy: gen ibg prepay jump url. biz_errcode: %d, biz_errmsg: %s", new Object[] { Integer.valueOf(paramq.kBk), paramq.kBl });
      paramString = paramq.kBl;
      paramInt2 = paramq.kBk;
      this.jumpUrl = paramq.lPE;
      this.prepayId = paramq.unE;
      this.rse = paramq.unF;
      this.rsn = paramq.uIs;
    }
    for (;;)
    {
      paramq = paramString;
      if (bg.nm(paramString)) {
        paramq = ab.getContext().getString(a.i.tbj);
      }
      this.fUd.a(paramInt1, paramInt2, paramq, this);
      GMTrace.o(7563571625984L, 56353);
      return;
      w.e("MicroMsg.NetSceneIbgPayGenPrepay", "hy: gen ibg prepay jump url failed");
      this.jumpUrl = null;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(7563705843712L, 56354);
    GMTrace.o(7563705843712L, 56354);
    return 1563;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_index\c\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */