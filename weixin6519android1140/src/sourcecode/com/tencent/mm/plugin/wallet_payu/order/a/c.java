package com.tencent.mm.plugin.wallet_payu.order.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.asz;
import com.tencent.mm.protocal.c.atj;
import com.tencent.mm.protocal.c.atk;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.l;

public final class c
  extends l
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public asz ruh;
  
  public c(String paramString)
  {
    GMTrace.i(7938307522560L, 59145);
    this.ruh = null;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new atj();
    ((b.a)localObject).gtG = new atk();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/payuqueryuserroll";
    ((b.a)localObject).gtE = 1520;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (atj)this.fUa.gtC.gtK;
    if (!bg.nm(paramString)) {
      ((atj)localObject).nFa = paramString;
    }
    GMTrace.o(7938307522560L, 59145);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7938575958016L, 59147);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(7938575958016L, 59147);
    return i;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(7938710175744L, 59148);
    w.w("MicroMsg.NetScenePayUQueryUserRoll", "errType = " + paramInt1 + " errCode " + paramInt2 + " errMsg " + paramString);
    this.fUd.a(paramInt1, paramInt2, paramString, this);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = (atk)((b)paramq).gtD.gtK;
      this.ruh = paramString.uJb;
      if (paramString.uJb != null)
      {
        w.d("MicroMsg.NetScenePayUQueryUserRoll", "rr" + paramString.uJb.nFa);
        GMTrace.o(7938710175744L, 59148);
        return;
      }
      w.e("MicroMsg.NetScenePayUQueryUserRoll", "hy: user roll is null!!!");
    }
    GMTrace.o(7938710175744L, 59148);
  }
  
  public final int getType()
  {
    GMTrace.i(7938441740288L, 59146);
    GMTrace.o(7938441740288L, 59146);
    return 1520;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\order\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */