package com.tencent.mm.af;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.protocal.c.nb;
import com.tencent.mm.protocal.c.nc;
import com.tencent.mm.protocal.c.nd;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.be;
import java.util.LinkedList;

public final class q
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public q(String paramString1, int paramInt, String paramString2, LinkedList<nb> paramLinkedList)
  {
    GMTrace.i(19905697021952L, 148309);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new nc();
    ((b.a)localObject).gtG = new nd();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/clickcommand";
    ((b.a)localObject).gtE = 359;
    ((b.a)localObject).gtH = 176;
    ((b.a)localObject).gtI = 1000000176;
    this.fUa = ((b.a)localObject).DA();
    localObject = (nc)this.fUa.gtC.gtK;
    ((nc)localObject).udW = paramInt;
    ((nc)localObject).udX = paramString2;
    ((nc)localObject).tVK = paramString1;
    ((nc)localObject).tQb = be.Br();
    if (paramLinkedList != null) {
      ((nc)localObject).udY = paramLinkedList;
    }
    w.i("MicroMsg.NetSceneBizClickCommand", "click command : %s, type: %s, info: %s, MsgSource : %s, MsgReport size %d", new Object[] { paramString1, Integer.valueOf(paramInt), paramString2, ((nc)localObject).tQb, Integer.valueOf(((nc)localObject).udY.size()) });
    GMTrace.o(19905697021952L, 148309);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4528774578176L, 33742);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4528774578176L, 33742);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4528506142720L, 33740);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4528506142720L, 33740);
  }
  
  public final int getType()
  {
    GMTrace.i(4528640360448L, 33741);
    GMTrace.o(4528640360448L, 33741);
    return 359;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */