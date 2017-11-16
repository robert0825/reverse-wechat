package com.tencent.mm.plugin.nearby.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.h;
import com.tencent.mm.ac.i;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.normsg.a.d;
import com.tencent.mm.protocal.c.ali;
import com.tencent.mm.protocal.c.alm;
import com.tencent.mm.protocal.c.aln;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.g;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public c(int paramInt1, float paramFloat1, float paramFloat2, int paramInt2, int paramInt3, String paramString1, String paramString2)
  {
    GMTrace.i(6674379177984L, 49728);
    if ((paramInt1 != 1) && (paramInt1 != 2) && (paramInt1 != 3) && (paramInt1 != 4)) {
      w.e("MicroMsg.NetSceneLbsP", "OpCode Error :" + paramInt1);
    }
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new alm();
    ((b.a)localObject).gtG = new aln();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/lbsfind";
    ((b.a)localObject).gtE = 148;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (alm)this.fUa.gtC.gtK;
    ((alm)localObject).tMX = paramInt1;
    ((alm)localObject).tYy = paramFloat1;
    ((alm)localObject).tYz = paramFloat2;
    ((alm)localObject).ujb = paramInt2;
    ((alm)localObject).ujc = paramString1;
    ((alm)localObject).ujd = paramString2;
    ((alm)localObject).uje = paramInt3;
    ((alm)localObject).uAI = new azp().be(d.nxJ.aUq());
    w.d("MicroMsg.NetSceneLbsP", "Req: opcode:" + paramInt1 + " lon:" + paramFloat1 + " lat:" + paramFloat2 + " pre:" + paramInt2 + " gpsSource:" + paramInt3 + " mac" + paramString1 + " cell:" + paramString2 + " ccdLen:" + ((alm)localObject).uAI.uNN);
    com.tencent.mm.modelstat.n.a(2001, paramFloat1, paramFloat2, paramInt2);
    GMTrace.o(6674379177984L, 49728);
  }
  
  public final int CD()
  {
    GMTrace.i(6674781831168L, 49731);
    int i = ((alm)this.fUa.gtC.gtK).tMX;
    GMTrace.o(6674781831168L, 49731);
    return i;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6674513395712L, 49729);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6674513395712L, 49729);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6674916048896L, 49732);
    w.d("MicroMsg.NetSceneLbsP", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramq = (aln)((b)paramq).gtD.gtK;
    paramArrayOfByte = new ArrayList();
    paramInt1 = 0;
    while (paramInt1 < paramq.uql.size())
    {
      h localh = new h();
      localh.username = ((ali)paramq.uql.get(paramInt1)).jhi;
      localh.fiZ = ((ali)paramq.uql.get(paramInt1)).tPZ;
      localh.gsU = ((ali)paramq.uql.get(paramInt1)).ubV;
      localh.gsT = ((ali)paramq.uql.get(paramInt1)).ubW;
      localh.bi(true);
      paramArrayOfByte.add(localh);
      paramInt1 += 1;
    }
    com.tencent.mm.ac.n.Di().A(paramArrayOfByte);
    if ((CD() == 1) || (CD() == 3) || (CD() == 4))
    {
      if ((paramInt2 != 0) && (paramInt3 == 63535))
      {
        at.AR();
        com.tencent.mm.y.c.xh().set(8210, Long.valueOf(0L));
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(6674916048896L, 49732);
        return;
      }
      at.AR();
      com.tencent.mm.y.c.xh().set(8210, Long.valueOf(System.currentTimeMillis() + paramq.uAJ * 1000));
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(6674916048896L, 49732);
      return;
      if (CD() == 2)
      {
        at.AR();
        com.tencent.mm.y.c.xh().set(8210, Long.valueOf(0L));
      }
    }
  }
  
  public final boolean aTF()
  {
    GMTrace.i(6675050266624L, 49733);
    if (((aln)this.fUa.gtD.gtK).uAK == 1)
    {
      GMTrace.o(6675050266624L, 49733);
      return true;
    }
    GMTrace.o(6675050266624L, 49733);
    return false;
  }
  
  public final int aTG()
  {
    GMTrace.i(6675184484352L, 49734);
    int i = ((aln)this.fUa.gtD.gtK).uAL;
    GMTrace.o(6675184484352L, 49734);
    return i;
  }
  
  public final List<ali> aTH()
  {
    GMTrace.i(6675318702080L, 49735);
    LinkedList localLinkedList = ((aln)this.fUa.gtD.gtK).uql;
    if (localLinkedList != null)
    {
      Iterator localIterator = localLinkedList.iterator();
      while (localIterator.hasNext())
      {
        ali localali = (ali)localIterator.next();
        at.AR();
        com.tencent.mm.y.c.zu().fd(localali.jhi, localali.uoe);
      }
    }
    GMTrace.o(6675318702080L, 49735);
    return localLinkedList;
  }
  
  public final int getType()
  {
    GMTrace.i(6674647613440L, 49730);
    GMTrace.o(6674647613440L, 49730);
    return 148;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nearby\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */