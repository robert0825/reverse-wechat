package com.tencent.mm.plugin.chatroom.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.os;
import com.tencent.mm.protocal.c.ot;
import com.tencent.mm.protocal.c.pb;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class g
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public List<String> eNC;
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public g(String paramString, List<String> paramList)
  {
    this(paramString, paramList, 0);
    GMTrace.i(9067212832768L, 67556);
    GMTrace.o(9067212832768L, 67556);
  }
  
  public g(String paramString, List<String> paramList, int paramInt)
  {
    GMTrace.i(9067347050496L, 67557);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new os();
    ((b.a)localObject).gtG = new ot();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/delchatroommember";
    ((b.a)localObject).gtE = 179;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (os)this.fUa.gtC.gtK;
    ((os)localObject).ufz = paramString;
    paramString = new LinkedList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      pb localpb = new pb();
      localpb.ufE = n.ni(str);
      paramString.add(localpb);
    }
    ((os)localObject).tPE = paramString;
    ((os)localObject).jNj = paramString.size();
    ((os)localObject).tOG = paramInt;
    this.eNC = paramList;
    GMTrace.o(9067347050496L, 67557);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9067481268224L, 67558);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(9067481268224L, 67558);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(9067749703680L, 67560);
    w.d("MicroMsg.NetSceneDelChatRoomMember", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramq = (os)this.fUa.gtC.gtK;
    paramArrayOfByte = (ot)this.fUa.gtD.gtK;
    if (this.fUa.gtD.tKs != 0)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(9067749703680L, 67560);
      return;
    }
    m.a(paramq.ufz, paramArrayOfByte);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(9067749703680L, 67560);
  }
  
  public final int getType()
  {
    GMTrace.i(9067615485952L, 67559);
    GMTrace.o(9067615485952L, 67559);
    return 179;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\chatroom\d\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */