package com.tencent.mm.plugin.wxcredit.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.h;
import com.tencent.mm.protocal.c.ayi;
import com.tencent.mm.protocal.c.ayj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.l;

public final class i
  extends l
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public i(String paramString1, String paramString2)
  {
    GMTrace.i(8989500768256L, 66977);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ayi();
    ((b.a)localObject).gtG = new ayj();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/removevirtualbankcard";
    ((b.a)localObject).gtE = 600;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ayi)this.fUa.gtC.gtK;
    ((ayi)localObject).uML = paramString1;
    ((ayi)localObject).uMK = bg.getInt(paramString2, 0);
    ((ayi)localObject).tYT = h.byp();
    GMTrace.o(8989500768256L, 66977);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(8989903421440L, 66980);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(8989903421440L, 66980);
    return i;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(8989634985984L, 66978);
    w.d("MicroMsg.NetSceneRemoveVirtualBankCard", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    this.fUd.a(paramInt1, paramInt2, paramString, this);
    GMTrace.o(8989634985984L, 66978);
  }
  
  public final int getType()
  {
    GMTrace.i(8989769203712L, 66979);
    GMTrace.o(8989769203712L, 66979);
    return 600;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wxcredit\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */