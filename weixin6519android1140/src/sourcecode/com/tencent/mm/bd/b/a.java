package com.tencent.mm.bd.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ayt;
import com.tencent.mm.protocal.c.ayu;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public a(int paramInt, LinkedList<azq> paramLinkedList, azq paramazq1, azq paramazq2)
  {
    GMTrace.i(14690935635968L, 109456);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ayt();
    ((b.a)localObject).gtG = new ayu();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/reportvoiceresult";
    ((b.a)localObject).gtE = 228;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ayt)this.fUa.gtC.gtK;
    ((ayt)localObject).uNb = paramInt;
    ((ayt)localObject).uNc = paramLinkedList;
    ((ayt)localObject).uNd = paramazq1;
    ((ayt)localObject).uNe = paramazq2;
    GMTrace.o(14690935635968L, 109456);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4399657123840L, 32780);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4399657123840L, 32780);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4399791341568L, 32781);
    w.d("MicroMsg.NetSceneNewVoiceInputReport", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4399791341568L, 32781);
  }
  
  public final int getType()
  {
    GMTrace.i(4399522906112L, 32779);
    GMTrace.o(4399522906112L, 32779);
    return 228;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bd\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */