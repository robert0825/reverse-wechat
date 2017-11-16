package com.tencent.mm.plugin.label.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.apl;
import com.tencent.mm.protocal.c.apm;
import com.tencent.mm.protocal.c.bmt;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  private LinkedList<bmt> muP;
  
  public d(LinkedList<bmt> paramLinkedList)
  {
    GMTrace.i(7277150994432L, 54219);
    this.muP = new LinkedList();
    b.a locala = new b.a();
    locala.gtF = new apl();
    locala.gtG = new apm();
    locala.uri = "/cgi-bin/micromsg-bin/modifycontactlabellist";
    locala.gtE = 638;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.muP = paramLinkedList;
    GMTrace.o(7277150994432L, 54219);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7277553647616L, 54222);
    w.d("MicroMsg.Label.NetSceneModifyContactLabelList", "cpan[doScene].");
    this.fUd = parame1;
    parame1 = (apl)this.fUa.gtC.gtK;
    parame1.uFl = this.muP;
    parame1.uqd = this.muP.size();
    int i = a(parame, this.fUa, this);
    GMTrace.o(7277553647616L, 54222);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(7277285212160L, 54220);
    w.d("MicroMsg.Label.NetSceneModifyContactLabelList", "cpan[onGYNetEnd] netId:%d errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(7277285212160L, 54220);
  }
  
  public final int getType()
  {
    GMTrace.i(7277419429888L, 54221);
    GMTrace.o(7277419429888L, 54221);
    return 638;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\label\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */