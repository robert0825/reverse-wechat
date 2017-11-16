package com.tencent.mm.plugin.order.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.h;
import com.tencent.mm.protocal.c.asi;
import com.tencent.mm.protocal.c.asj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.l;

public final class g
  extends l
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public g(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(6622034264064L, 49338);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new asi();
    ((b.a)localObject).gtG = new asj();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/paydeluserroll";
    ((b.a)localObject).gtE = 389;
    ((b.a)localObject).gtH = 187;
    ((b.a)localObject).gtI = 1000000187;
    this.fUa = ((b.a)localObject).DA();
    localObject = (asi)this.fUa.gtC.gtK;
    ((asi)localObject).uIo = 1;
    if (!bg.nm(paramString1)) {
      ((asi)localObject).nFa = paramString1;
    }
    if (!bg.nm(paramString2)) {
      ((asi)localObject).nFt = paramString2;
    }
    ((asi)localObject).tYT = h.byp();
    GMTrace.o(6622034264064L, 49338);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6622705352704L, 49343);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6622705352704L, 49343);
    return i;
  }
  
  public final int aWM()
  {
    GMTrace.i(6622302699520L, 49340);
    int i = ((asi)this.fUa.gtC.gtK).uIo;
    GMTrace.o(6622302699520L, 49340);
    return i;
  }
  
  public final String aWN()
  {
    GMTrace.i(6622436917248L, 49341);
    String str = ((asi)this.fUa.gtC.gtK).nFa;
    GMTrace.o(6622436917248L, 49341);
    return str;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(6622168481792L, 49339);
    w.d("MicroMsg.NetScenePayDelUserRoll", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    this.fUd.a(paramInt1, paramInt2, paramString, this);
    GMTrace.o(6622168481792L, 49339);
  }
  
  public final int getType()
  {
    GMTrace.i(6622571134976L, 49342);
    GMTrace.o(6622571134976L, 49342);
    return 389;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */