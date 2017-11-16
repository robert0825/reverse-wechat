package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.a;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.protocal.c.axw;
import com.tencent.mm.protocal.c.axx;

public final class f
  extends a<axx>
{
  public f(int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(18422993780736L, 137262);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new axw();
    ((b.a)localObject).gtG = new axx();
    ((b.a)localObject).gtE = 1338;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/redeemfund";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    localObject = ((b.a)localObject).DA();
    axw localaxw = (axw)((b)localObject).gtC.gtK;
    localaxw.uJF = paramInt;
    localaxw.ueg = paramString1;
    localaxw.uJG = paramString2;
    this.fUa = ((b)localObject);
    GMTrace.o(18422993780736L, 137262);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\balance\a\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */