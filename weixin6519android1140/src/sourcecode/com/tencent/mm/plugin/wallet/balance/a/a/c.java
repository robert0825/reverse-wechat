package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.a;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.protocal.c.avl;
import com.tencent.mm.protocal.c.avm;

public final class c
  extends a<avm>
{
  public c(String paramString, int paramInt)
  {
    GMTrace.i(18419772555264L, 137238);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new avl();
    ((b.a)localObject).gtG = new avm();
    ((b.a)localObject).gtE = 1276;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/purchasefund";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    localObject = ((b.a)localObject).DA();
    avl localavl = (avl)((b)localObject).gtC.gtK;
    localavl.uKJ = paramString;
    localavl.uKK = paramInt;
    this.fUa = ((b)localObject);
    GMTrace.o(18419772555264L, 137238);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\balance\a\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */