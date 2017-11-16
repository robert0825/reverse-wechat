package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.a;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.protocal.c.auh;
import com.tencent.mm.protocal.c.aui;

public final class b
  extends a<aui>
{
  public b(int paramInt)
  {
    GMTrace.i(18416148676608L, 137211);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new auh();
    ((b.a)localObject).gtG = new aui();
    ((b.a)localObject).gtE = 1324;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/preredeemfund";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    localObject = ((b.a)localObject).DA();
    ((auh)((com.tencent.mm.ad.b)localObject).gtC.gtK).uJF = paramInt;
    this.fUa = ((com.tencent.mm.ad.b)localObject);
    GMTrace.o(18416148676608L, 137211);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\balance\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */