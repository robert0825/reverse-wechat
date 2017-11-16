package com.tencent.mm.ac;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aih;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.fj;
import com.tencent.mm.protocal.c.fk;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class j
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  LinkedList<azq> gsY;
  LinkedList<aih> gsZ;
  
  public j(LinkedList<azq> paramLinkedList)
  {
    GMTrace.i(381044129792L, 2839);
    this.gsY = null;
    this.gsZ = null;
    this.gsY = paramLinkedList;
    GMTrace.o(381044129792L, 2839);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(381178347520L, 2840);
    if ((this.gsY == null) || (this.gsY.size() <= 0))
    {
      w.e("MicroMsg.NetSceneBatchGetHeadImg", g.tC() + "doScene ReqSize==0");
      GMTrace.o(381178347520L, 2840);
      return -1;
    }
    this.fUd = parame1;
    parame1 = new b.a();
    parame1.gtF = new fj();
    parame1.gtG = new fk();
    parame1.uri = "/cgi-bin/micromsg-bin/batchgetheadimg";
    parame1.gtE = 123;
    parame1.gtH = 15;
    parame1.gtI = 1000000015;
    parame1 = parame1.DA();
    fj localfj = (fj)parame1.gtC.gtK;
    localfj.tTO = this.gsY;
    localfj.jhc = this.gsY.size();
    int i = a(parame, parame1, this);
    GMTrace.o(381178347520L, 2840);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(381312565248L, 2841);
    int i = k.b.gum;
    GMTrace.o(381312565248L, 2841);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(381581000704L, 2843);
    w.d("MicroMsg.NetSceneBatchGetHeadImg", "errType:" + paramInt2 + " errCode:" + paramInt3);
    this.gsZ = ((fk)((b)paramq).gtD.gtK).tTR;
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(381581000704L, 2843);
  }
  
  public final int getType()
  {
    GMTrace.i(381715218432L, 2844);
    GMTrace.o(381715218432L, 2844);
    return 123;
  }
  
  protected final int vB()
  {
    GMTrace.i(381446782976L, 2842);
    GMTrace.o(381446782976L, 2842);
    return 20;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ac\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */