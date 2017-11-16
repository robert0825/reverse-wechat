package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.a;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.protocal.c.avw;
import com.tencent.mm.protocal.c.avx;

public final class d
  extends a<avx>
{
  public d(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(18418564595712L, 137229);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new avw();
    ((b.a)localObject).gtG = new avx();
    ((b.a)localObject).gtE = 1283;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/qrypurchaseresult";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    localObject = ((b.a)localObject).DA();
    avw localavw = (avw)((b)localObject).gtC.gtK;
    localavw.uLd = paramString1;
    localavw.omN = paramString2;
    localavw.uKK = paramInt;
    this.fUa = ((b)localObject);
    GMTrace.o(18418564595712L, 137229);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\balance\a\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */