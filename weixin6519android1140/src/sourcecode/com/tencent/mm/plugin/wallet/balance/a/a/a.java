package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.protocal.c.nh;
import com.tencent.mm.protocal.c.ni;

public final class a
  extends com.tencent.mm.ad.a<ni>
{
  public a(String paramString)
  {
    GMTrace.i(18415343370240L, 137205);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new nh();
    ((b.a)localObject).gtG = new ni();
    ((b.a)localObject).gtE = 1386;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/closefundaccount";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    localObject = ((b.a)localObject).DA();
    ((nh)((b)localObject).gtC.gtK).ueg = paramString;
    this.fUa = ((b)localObject);
    GMTrace.o(18415343370240L, 137205);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\balance\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */