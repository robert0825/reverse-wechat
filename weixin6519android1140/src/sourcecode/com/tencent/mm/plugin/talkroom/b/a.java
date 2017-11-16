package com.tencent.mm.plugin.talkroom.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.biq;
import com.tencent.mm.protocal.c.bir;
import com.tencent.mm.protocal.c.rl;
import com.tencent.mm.protocal.c.rm;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
  extends f
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  private final String mAH;
  public int mjF;
  public long mjG;
  private int nvM;
  public int qxP;
  public int qxQ;
  public LinkedList<biq> qxS;
  public LinkedList<bir> qyl;
  
  public a(String paramString, int paramInt)
  {
    GMTrace.i(5207110975488L, 38796);
    this.nvM = 0;
    b.a locala = new b.a();
    this.nvM = paramInt;
    locala.gtF = new rl();
    locala.gtG = new rm();
    locala.uri = "/cgi-bin/micromsg-bin/entertalkroom";
    locala.gtE = 332;
    locala.gtH = 147;
    locala.gtI = 1000000147;
    this.fUa = locala.DA();
    ((rl)this.fUa.gtC.gtK).uhT = paramString;
    ((rl)this.fUa.gtC.gtK).tOG = paramInt;
    this.mAH = paramString;
    GMTrace.o(5207110975488L, 38796);
  }
  
  private static LinkedList<bir> al(LinkedList<bir> paramLinkedList)
  {
    GMTrace.i(5207782064128L, 38801);
    LinkedList localLinkedList = new LinkedList();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      bir localbir = (bir)paramLinkedList.next();
      if (!bg.nm(localbir.jhi)) {
        localLinkedList.add(localbir);
      }
    }
    GMTrace.o(5207782064128L, 38801);
    return localLinkedList;
  }
  
  private static LinkedList<biq> am(LinkedList<biq> paramLinkedList)
  {
    GMTrace.i(5207916281856L, 38802);
    LinkedList localLinkedList = new LinkedList();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext()) {
      localLinkedList.add((biq)paramLinkedList.next());
    }
    GMTrace.o(5207916281856L, 38802);
    return localLinkedList;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5207245193216L, 38797);
    w.d("MicroMsg.NetSceneEnterTalkRoom", "doScene %d", new Object[] { Integer.valueOf(this.nvM) });
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5207245193216L, 38797);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5207647846400L, 38800);
    w.d("MicroMsg.NetSceneEnterTalkRoom", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5207647846400L, 38800);
      return;
    }
    paramq = (rm)this.fUa.gtD.gtK;
    w.i("MicroMsg.NetSceneEnterTalkRoom", "resp %s", new Object[] { paramq.toString() });
    this.mjF = paramq.uhU;
    this.mjG = paramq.uhV;
    this.qxP = paramq.uhW;
    this.qxQ = paramq.uhY;
    this.qyl = al(paramq.tPE);
    this.qxS = am(paramq.tSO);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(5207647846400L, 38800);
  }
  
  public final String bsB()
  {
    GMTrace.i(5207513628672L, 38799);
    String str = this.mAH;
    GMTrace.o(5207513628672L, 38799);
    return str;
  }
  
  public final int bsC()
  {
    GMTrace.i(5208050499584L, 38803);
    int i = this.nvM;
    GMTrace.o(5208050499584L, 38803);
    return i;
  }
  
  public final int getType()
  {
    GMTrace.i(5207379410944L, 38798);
    GMTrace.o(5207379410944L, 38798);
    return 332;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */