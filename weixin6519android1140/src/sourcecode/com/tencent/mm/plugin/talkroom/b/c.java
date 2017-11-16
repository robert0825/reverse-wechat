package com.tencent.mm.plugin.talkroom.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aeb;
import com.tencent.mm.protocal.c.aec;
import com.tencent.mm.protocal.c.bir;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public final class c
  extends f
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  private final String mAH;
  private int nvM;
  public int qxP;
  public LinkedList<bir> qyl;
  
  public c(int paramInt1, long paramLong, String paramString, int paramInt2)
  {
    GMTrace.i(5203084443648L, 38766);
    this.nvM = 0;
    this.nvM = paramInt2;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new aeb();
    ((b.a)localObject).gtG = new aec();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/gettalkroommember";
    ((b.a)localObject).gtE = 336;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (aeb)this.fUa.gtC.gtK;
    ((aeb)localObject).uhU = paramInt1;
    ((aeb)localObject).uhV = paramLong;
    this.mAH = paramString;
    ((aeb)localObject).tOG = paramInt2;
    GMTrace.o(5203084443648L, 38766);
  }
  
  private static LinkedList<bir> al(LinkedList<bir> paramLinkedList)
  {
    GMTrace.i(5203755532288L, 38771);
    LinkedList localLinkedList = new LinkedList();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      bir localbir = (bir)paramLinkedList.next();
      if (!bg.nm(localbir.jhi)) {
        localLinkedList.add(localbir);
      }
    }
    GMTrace.o(5203755532288L, 38771);
    return localLinkedList;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5203218661376L, 38767);
    w.d("MicroMsg.NetSceneGetTalkRoomMember", "doScene");
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5203218661376L, 38767);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5203621314560L, 38770);
    w.d("MicroMsg.NetSceneGetTalkRoomMember", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5203621314560L, 38770);
      return;
    }
    paramq = (aec)this.fUa.gtD.gtK;
    w.i("MicroMsg.NetSceneGetTalkRoomMember", "resp %s", new Object[] { paramq.toString() });
    this.qxP = paramq.uhW;
    this.qyl = al(paramq.tPE);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(5203621314560L, 38770);
  }
  
  public final String bsB()
  {
    GMTrace.i(5203487096832L, 38769);
    String str = this.mAH;
    GMTrace.o(5203487096832L, 38769);
    return str;
  }
  
  public final int bsC()
  {
    GMTrace.i(5203889750016L, 38772);
    int i = this.nvM;
    GMTrace.o(5203889750016L, 38772);
    return i;
  }
  
  public final int getType()
  {
    GMTrace.i(5203352879104L, 38768);
    GMTrace.o(5203352879104L, 38768);
    return 336;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */