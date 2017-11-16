package com.tencent.mm.plugin.chatroom.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.any;
import com.tencent.mm.protocal.c.anz;
import com.tencent.mm.protocal.c.bj;
import com.tencent.mm.protocal.c.bk;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public String chatroomName;
  public int eMK;
  public final List<String> eNC;
  public final List<String> eNF;
  public final List<String> eNH;
  public final List<String> eNI;
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public final List<String> jMY;
  public final List<String> jMZ;
  public final List<String> jNa;
  
  public d(String paramString1, List<String> paramList, String paramString2)
  {
    GMTrace.i(9066675961856L, 67552);
    this.fUd = null;
    this.eMK = 0;
    this.chatroomName = null;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bj();
    ((b.a)localObject).gtG = new bk();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/addchatroommember";
    ((b.a)localObject).gtE = 120;
    ((b.a)localObject).gtH = 36;
    ((b.a)localObject).gtI = 1000000036;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bj)this.fUa.gtC.gtK;
    ((bj)localObject).tPF = n.ni(paramString1);
    this.chatroomName = paramString1;
    paramString1 = new LinkedList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      any localany = new any();
      localany.ufE = n.ni(str);
      paramString1.add(localany);
    }
    ((bj)localObject).tPE = paramString1;
    ((bj)localObject).jNj = paramString1.size();
    this.jMY = new ArrayList();
    this.eNF = new LinkedList();
    this.jMZ = new LinkedList();
    this.eNH = new LinkedList();
    this.eNI = new LinkedList();
    this.jNa = new ArrayList();
    this.eNC = paramList;
    ((bj)localObject).tPH = paramString2;
    GMTrace.o(9066675961856L, 67552);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9066810179584L, 67553);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(9066810179584L, 67553);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(9067078615040L, 67555);
    paramq = (bj)this.fUa.gtC.gtK;
    paramArrayOfByte = (bk)this.fUa.gtD.gtK;
    this.eMK = paramArrayOfByte.jNj;
    LinkedList localLinkedList = paramArrayOfByte.tPE;
    paramInt1 = 0;
    if (paramInt1 < localLinkedList.size())
    {
      int i = ((anz)localLinkedList.get(paramInt1)).uDQ;
      if (i == 0) {
        this.jMY.add(n.a(((anz)localLinkedList.get(paramInt1)).ufE));
      }
      for (;;)
      {
        paramInt1 += 1;
        break;
        if (i == 3)
        {
          w.d("MicroMsg.NetSceneAddChatRoomMember", " blacklist : " + ((anz)localLinkedList.get(paramInt1)).ufE);
          this.jMZ.add(n.a(((anz)localLinkedList.get(paramInt1)).ufE));
        }
        else if (i == 1)
        {
          w.d("MicroMsg.NetSceneAddChatRoomMember", " not user : " + ((anz)localLinkedList.get(paramInt1)).ufE);
          this.eNH.add(n.a(((anz)localLinkedList.get(paramInt1)).ufE));
        }
        else if (i == 2)
        {
          w.d("MicroMsg.NetSceneAddChatRoomMember", " invalid username : " + ((anz)localLinkedList.get(paramInt1)).ufE);
          this.eNF.add(n.a(((anz)localLinkedList.get(paramInt1)).ufE));
        }
        else if (i == 4)
        {
          w.d("MicroMsg.NetSceneAddChatRoomMember", " verify user : " + ((anz)localLinkedList.get(paramInt1)).ufE);
          this.eNI.add(n.a(((anz)localLinkedList.get(paramInt1)).ufE));
        }
        else if (i != 5)
        {
          if (i == 6) {
            this.jNa.add(n.a(((anz)localLinkedList.get(paramInt1)).ufE));
          } else {
            w.w("MicroMsg.NetSceneAddChatRoomMember", "unknown member status : status = " + i);
          }
        }
      }
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      m.a(n.a(paramq.tPF), paramArrayOfByte);
    }
    GMTrace.o(9067078615040L, 67555);
  }
  
  public final int getType()
  {
    GMTrace.i(9066944397312L, 67554);
    GMTrace.o(9066944397312L, 67554);
    return 120;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\chatroom\d\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */