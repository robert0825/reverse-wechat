package com.tencent.mm.plugin.chatroom.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.agr;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.protocal.c.no;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.m;
import java.util.Iterator;
import java.util.LinkedList;

public final class e
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private LinkedList<agr> eNx;
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public e(LinkedList<agr> paramLinkedList)
  {
    GMTrace.i(9060636164096L, 67507);
    this.eNx = paramLinkedList;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new nn();
    ((b.a)localObject).gtG = new no();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/collectchatroom";
    ((b.a)localObject).gtE = 181;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (nn)this.fUa.gtC.gtK;
    ((nn)localObject).ueo = paramLinkedList;
    ((nn)localObject).uen = paramLinkedList.size();
    GMTrace.o(9060636164096L, 67507);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9060770381824L, 67508);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(9060770381824L, 67508);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(9061038817280L, 67510);
    w.d("MicroMsg.NetSceneCollectChatRoom", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if (paramq.AZ().tKs != 0)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(9061038817280L, 67510);
      return;
    }
    if (this.eNx != null)
    {
      paramq = this.eNx.iterator();
      while (paramq.hasNext())
      {
        paramArrayOfByte = (agr)paramq.next();
        w.d("MicroMsg.NetSceneCollectChatRoom", "del groupcard Name :" + paramArrayOfByte.uwg);
        m.ff(paramArrayOfByte.uwg);
      }
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(9061038817280L, 67510);
  }
  
  public final int getType()
  {
    GMTrace.i(9060904599552L, 67509);
    GMTrace.o(9060904599552L, 67509);
    return 181;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\d\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */