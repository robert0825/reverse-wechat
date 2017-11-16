package com.tencent.mm.plugin.order.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.h;
import com.tencent.mm.protocal.c.rq;
import com.tencent.mm.protocal.c.rr;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.l;

public final class f
  extends l
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public f(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(6626060795904L, 49368);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new rq();
    ((b.a)localObject).gtG = new rr();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/evaluateorder";
    ((b.a)localObject).gtE = 583;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (rq)this.fUa.gtC.gtK;
    ((rq)localObject).uia = paramString1;
    ((rq)localObject).lQa = paramString2;
    ((rq)localObject).oqH = paramInt;
    ((rq)localObject).tYT = h.byp();
    GMTrace.o(6626060795904L, 49368);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6626463449088L, 49371);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6626463449088L, 49371);
    return i;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(6626195013632L, 49369);
    w.d("MicroMsg.NetSceneEvaluateOrder", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    this.fUd.a(paramInt1, paramInt2, paramString, this);
    GMTrace.o(6626195013632L, 49369);
  }
  
  public final int getType()
  {
    GMTrace.i(6626329231360L, 49370);
    GMTrace.o(6626329231360L, 49370);
    return 583;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\model\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */