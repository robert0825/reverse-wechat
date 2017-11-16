package com.tencent.mm.plugin.translate.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aed;
import com.tencent.mm.protocal.c.aee;
import com.tencent.mm.protocal.c.bjw;
import com.tencent.mm.protocal.c.bjx;
import java.util.LinkedList;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public LinkedList<bjx> qBk;
  
  public b(LinkedList<bjw> paramLinkedList)
  {
    GMTrace.i(7271782285312L, 54179);
    this.fUd = null;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new aed();
    ((b.a)localObject).gtG = new aee();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/gettranstext";
    ((b.a)localObject).gtE = 631;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (aed)this.fUa.gtC.gtK;
    ((aed)localObject).utS = paramLinkedList;
    ((aed)localObject).jhb = paramLinkedList.size();
    GMTrace.o(7271782285312L, 54179);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7271916503040L, 54180);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(7271916503040L, 54180);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(7272184938496L, 54182);
    paramq = (aee)this.fUa.gtD.gtK;
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    this.qBk = paramq.utS;
    GMTrace.o(7272184938496L, 54182);
  }
  
  public final int getType()
  {
    GMTrace.i(7272050720768L, 54181);
    GMTrace.o(7272050720768L, 54181);
    return 631;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\translate\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */