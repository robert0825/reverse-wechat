package com.tencent.mm.plugin.talkroom.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bis;
import com.tencent.mm.protocal.c.bit;
import com.tencent.mm.protocal.c.biu;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class g
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public g(LinkedList<bis> paramLinkedList, int paramInt)
  {
    GMTrace.i(5205366145024L, 38783);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bit();
    ((b.a)localObject).gtG = new biu();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/talkstatreport";
    ((b.a)localObject).gtE = 373;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bit)this.fUa.gtC.gtK;
    ((bit)localObject).uTU = paramLinkedList.size();
    ((bit)localObject).uTV = paramLinkedList;
    ((bit)localObject).tOG = paramInt;
    GMTrace.o(5205366145024L, 38783);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5205500362752L, 38784);
    w.d("MicroMsg.NetSceneTalkStatReport", "doScene");
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5205500362752L, 38784);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5205768798208L, 38786);
    w.d("MicroMsg.NetSceneTalkStatReport", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5205768798208L, 38786);
      return;
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(5205768798208L, 38786);
  }
  
  public final int getType()
  {
    GMTrace.i(5205634580480L, 38785);
    GMTrace.o(5205634580480L, 38785);
    return 373;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */