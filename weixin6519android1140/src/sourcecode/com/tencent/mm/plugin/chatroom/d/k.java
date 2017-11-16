package com.tencent.mm.plugin.chatroom.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.ain;
import com.tencent.mm.protocal.c.aio;
import com.tencent.mm.protocal.c.any;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class k
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public au eRz;
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public int jNj;
  
  public k(String paramString, List<String> paramList)
  {
    GMTrace.i(9061441470464L, 67513);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ain();
    ((b.a)localObject).gtG = new aio();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/invitechatroommember";
    ((b.a)localObject).gtE = 610;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ain)this.fUa.gtC.gtK;
    LinkedList localLinkedList = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      any localany = new any();
      localany.ufE = n.ni(str);
      localLinkedList.add(localany);
    }
    ((ain)localObject).tPE = localLinkedList;
    ((ain)localObject).jNj = localLinkedList.size();
    ((ain)localObject).tPF = n.ni(paramString);
    ((ain)localObject).uxR = 0;
    GMTrace.o(9061441470464L, 67513);
  }
  
  public k(String paramString1, List<String> paramList, String paramString2, au paramau)
  {
    GMTrace.i(9061575688192L, 67514);
    this.eRz = paramau;
    paramau = new b.a();
    paramau.gtF = new ain();
    paramau.gtG = new aio();
    paramau.uri = "/cgi-bin/micromsg-bin/invitechatroommember";
    paramau.gtE = 610;
    paramau.gtH = 0;
    paramau.gtI = 0;
    this.fUa = paramau.DA();
    paramau = (ain)this.fUa.gtC.gtK;
    LinkedList localLinkedList = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      any localany = new any();
      localany.ufE = n.ni(str);
      localLinkedList.add(localany);
    }
    this.jNj = localLinkedList.size();
    paramau.tPE = localLinkedList;
    paramau.jNj = localLinkedList.size();
    paramau.tPF = n.ni(paramString1);
    paramau.uxR = 2;
    paramau.uxS = paramString2;
    GMTrace.o(9061575688192L, 67514);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9061709905920L, 67515);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(9061709905920L, 67515);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(9061978341376L, 67517);
    w.d("MicroMsg.NetSceneInviteChatRoomMember", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(9061978341376L, 67517);
  }
  
  public final int getType()
  {
    GMTrace.i(9061844123648L, 67516);
    GMTrace.o(9061844123648L, 67516);
    return 610;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\chatroom\d\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */