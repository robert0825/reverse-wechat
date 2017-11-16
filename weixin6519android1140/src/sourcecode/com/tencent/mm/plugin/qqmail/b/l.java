package com.tencent.mm.plugin.qqmail.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.lu;
import com.tencent.mm.protocal.c.lv;
import com.tencent.mm.protocal.c.oc;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class l
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  b fUa;
  private com.tencent.mm.ad.e fUd;
  private ArrayList<Long> nSL;
  
  public l(ArrayList<Long> paramArrayList)
  {
    GMTrace.i(5475143778304L, 40793);
    this.nSL = paramArrayList;
    paramArrayList = new b.a();
    paramArrayList.gtF = new lu();
    paramArrayList.gtG = new lv();
    paramArrayList.uri = "/cgi-bin/micromsg-bin/checkconversationfile";
    paramArrayList.gtE = 483;
    paramArrayList.gtH = 0;
    paramArrayList.gtI = 0;
    this.fUa = paramArrayList.DA();
    GMTrace.o(5475143778304L, 40793);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5475546431488L, 40796);
    this.fUd = parame1;
    parame1 = (lu)this.fUa.gtC.gtK;
    parame1.jhc = this.nSL.size();
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.nSL.iterator();
    while (localIterator.hasNext())
    {
      long l = ((Long)localIterator.next()).longValue();
      oc localoc = new oc();
      localoc.tQd = l;
      localLinkedList.add(localoc);
      w.i("MicroMsg.NetSceneCheckConversationFile", "MsgId: %d", new Object[] { Long.valueOf(l) });
    }
    parame1.ucx = localLinkedList;
    w.i("MicroMsg.NetSceneCheckConversationFile", "Count = %d, MsgInfoList.size = %d", new Object[] { Integer.valueOf(parame1.jhc), Integer.valueOf(parame1.ucx.size()) });
    int i = a(parame, this.fUa, this);
    GMTrace.o(5475546431488L, 40796);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5475277996032L, 40794);
    w.i("MicroMsg.NetSceneCheckConversationFile", "onGYNetEnd, netId: %d, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (((paramInt2 != 0) || (paramInt3 != 0)) && (this.fUd != null))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5475277996032L, 40794);
      return;
    }
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(5475277996032L, 40794);
  }
  
  public final int getType()
  {
    GMTrace.i(5475412213760L, 40795);
    GMTrace.o(5475412213760L, 40795);
    return 483;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\b\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */