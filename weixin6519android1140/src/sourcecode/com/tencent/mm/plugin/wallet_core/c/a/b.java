package com.tencent.mm.plugin.wallet_core.c.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.asp;
import com.tencent.mm.protocal.c.asq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.wallet_core.c.l;

public final class b
  extends l
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public String jumpUrl;
  public int rcM;
  
  public b()
  {
    GMTrace.i(7031666769920L, 52390);
    this.rcM = 0;
    b.a locala = new b.a();
    asp localasp = new asp();
    h.xz();
    Object localObject = h.xy().xh().get(w.a.vtq, Boolean.valueOf(false));
    if (localObject != null) {}
    for (boolean bool = ((Boolean)localObject).booleanValue();; bool = false)
    {
      if (bool) {}
      for (int i = 1;; i = 0)
      {
        localasp.uIt = i;
        locala.gtF = localasp;
        locala.gtG = new asq();
        locala.uri = "/cgi-bin/mmpay-bin/payibggetjumpurl";
        locala.gtE = 1564;
        locala.gtH = 0;
        locala.gtI = 0;
        this.fUa = locala.DA();
        GMTrace.o(7031666769920L, 52390);
        return;
      }
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7032069423104L, 52393);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(7032069423104L, 52393);
    return i;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(7031800987648L, 52391);
    w.i("MicroMsg.NetSceneIbgPayGetJumpUrl", "hy: get ibg jump url raw net errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    paramq = (asq)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      w.i("MicroMsg.NetSceneIbgPayGetJumpUrl", "hy: get ibg pay jump url. biz_errcode: %d, biz_errmsg: %s", new Object[] { Integer.valueOf(paramq.kBk), paramq.kBl });
      paramString = paramq.kBl;
      paramInt2 = paramq.kBk;
      this.jumpUrl = paramq.lPE;
      this.rcM = paramq.uIu;
    }
    for (;;)
    {
      paramq = paramString;
      if (bg.nm(paramString)) {
        paramq = ab.getContext().getString(a.i.tbj);
      }
      this.fUd.a(paramInt1, paramInt2, paramq, this);
      GMTrace.o(7031800987648L, 52391);
      return;
      w.e("MicroMsg.NetSceneIbgPayGetJumpUrl", "hy: get ibg pay jump url failed");
      this.jumpUrl = null;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(7031935205376L, 52392);
    GMTrace.o(7031935205376L, 52392);
    return 1564;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\c\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */