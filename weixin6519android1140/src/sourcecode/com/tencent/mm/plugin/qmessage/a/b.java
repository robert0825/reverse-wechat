package com.tencent.mm.plugin.qmessage.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.g.a.qy;
import com.tencent.mm.g.b.af;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.ff;
import com.tencent.mm.protocal.c.fg;
import com.tencent.mm.protocal.c.nx;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private Set<String> nRk;
  
  public b(Set<String> paramSet)
  {
    GMTrace.i(8941048168448L, 66616);
    Assert.assertTrue(true);
    this.nRk = paramSet;
    GMTrace.o(8941048168448L, 66616);
  }
  
  private boolean g(q paramq)
  {
    GMTrace.i(8941853474816L, 66622);
    Object localObject1 = (fg)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    if (localObject1 == null)
    {
      w.e("MicroMsg.NetSceneBatchGetContactProfile", "dealResp: resp is null");
      GMTrace.o(8941853474816L, 66622);
      return false;
    }
    if (paramq.AZ().tKs == 1)
    {
      w.e("MicroMsg.NetSceneBatchGetContactProfile", "dealResp : endless loop, should stop");
      GMTrace.o(8941853474816L, 66622);
      return false;
    }
    if (paramq.AZ().tKs == -1)
    {
      w.e("MicroMsg.NetSceneBatchGetContactProfile", "dealResp : server err, can try again");
      GMTrace.o(8941853474816L, 66622);
      return true;
    }
    localObject1 = ((fg)localObject1).tTP;
    if (localObject1 == null)
    {
      GMTrace.o(8941853474816L, 66622);
      return false;
    }
    int j = 0;
    while (j < ((List)localObject1).size()) {
      try
      {
        paramq = (nx)new nx().aD(n.a((azp)((List)localObject1).get(j)));
        if ((paramq == null) || (paramq.jhi == null))
        {
          w.e("MicroMsg.NetSceneBatchGetContactProfile", "processContactProfile: profile name is null");
          i = 0;
          if (i != 0) {
            break label657;
          }
          GMTrace.o(8941853474816L, 66622);
          return false;
        }
      }
      catch (IOException paramq)
      {
        for (;;)
        {
          int i;
          w.printErrStackTrace("MicroMsg.NetSceneBatchGetContactProfile", paramq, "", new Object[0]);
          w.e("MicroMsg.NetSceneBatchGetContactProfile", "ContactProfile.parseFrom fail");
          paramq = null;
          continue;
          if (!this.nRk.contains(paramq.jhi))
          {
            w.e("MicroMsg.NetSceneBatchGetContactProfile", "processContactProfile: resp data not in req");
            i = 0;
          }
          else
          {
            this.nRk.remove(paramq.jhi);
            at.AR();
            Object localObject2 = c.yK().TE(paramq.jhi);
            if ((localObject2 == null) || ((int)((com.tencent.mm.l.a)localObject2).fTq == 0))
            {
              w.e("MicroMsg.NetSceneBatchGetContactProfile", "processContactProfile: did not find this contact");
              i = 0;
            }
            else
            {
              ((x)localObject2).setUsername(paramq.jhi);
              ((x)localObject2).ci(paramq.gCC);
              ((x)localObject2).setType(paramq.ueF & paramq.ueG);
              ((x)localObject2).cl(paramq.jio);
              ((x)localObject2).cm(paramq.ueD);
              ((x)localObject2).cn(paramq.ueE);
              ((x)localObject2).jdMethod_do(paramq.gCx);
              ((x)localObject2).cj(paramq.ueH);
              ((x)localObject2).cp(paramq.ueK);
              ((x)localObject2).cq(paramq.ueJ);
              ((x)localObject2).dr(paramq.ueL);
              ((x)localObject2).ck(paramq.ueO);
              ((x)localObject2).ds(paramq.ueP);
              at.AR();
              if (c.yK().a(((af)localObject2).field_username, (x)localObject2) == -1) {
                w.e("MicroMsg.NetSceneBatchGetContactProfile", "processContactProfile:update contact failed");
              }
              if (x.Tq(paramq.jhi))
              {
                localObject2 = g.aYk().EQ(paramq.jhi);
                if ((localObject2 == null) || (bg.nl(((d)localObject2).getUsername()).length() <= 0))
                {
                  w.e("MicroMsg.NetSceneBatchGetContactProfile", "processContactProfile: did not find qcontact");
                  i = 0;
                  continue;
                }
                ((d)localObject2).extInfo = paramq.lTj;
                ((d)localObject2).nRn = paramq.ueR;
                ((d)localObject2).nRo = paramq.ueS;
                ((d)localObject2).eQl = 52;
                if (!g.aYk().a(paramq.jhi, (d)localObject2)) {
                  w.e("MicroMsg.NetSceneBatchGetContactProfile", "processContactProfile:update qcontact failed");
                }
              }
              if (x.To(paramq.jhi))
              {
                localObject2 = new qy();
                ((qy)localObject2).eVL.opType = 0;
                ((qy)localObject2).eVL.eQu = paramq.jhi;
                ((qy)localObject2).eVL.eQv = paramq.ueR;
                ((qy)localObject2).eVL.eQw = paramq.ueI;
                com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
              }
              i = 1;
            }
          }
        }
        label657:
        j += 1;
      }
    }
    GMTrace.o(8941853474816L, 66622);
    return true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(8941182386176L, 66617);
    this.fUd = parame1;
    parame1 = new LinkedList();
    Object localObject = this.nRk.iterator();
    while (((Iterator)localObject).hasNext()) {
      parame1.add((String)((Iterator)localObject).next());
    }
    if (parame1.size() == 0)
    {
      w.e("MicroMsg.NetSceneBatchGetContactProfile", com.tencent.mm.compatible.util.g.tC() + "doScene reqSize ==0");
      GMTrace.o(8941182386176L, 66617);
      return -1;
    }
    localObject = new b.a();
    ((b.a)localObject).gtF = new ff();
    ((b.a)localObject).gtG = new fg();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/batchgetcontactprofile";
    ((b.a)localObject).gtE = 140;
    ((b.a)localObject).gtH = 28;
    ((b.a)localObject).gtI = 1000000028;
    localObject = ((b.a)localObject).DA();
    LinkedList localLinkedList = new LinkedList();
    parame1 = parame1.iterator();
    while (parame1.hasNext()) {
      localLinkedList.add(n.ni((String)parame1.next()));
    }
    ((ff)((com.tencent.mm.ad.b)localObject).gtC.gtK).tTO = localLinkedList;
    ((ff)((com.tencent.mm.ad.b)localObject).gtC.gtK).tTN = 1;
    ((ff)((com.tencent.mm.ad.b)localObject).gtC.gtK).jhc = localLinkedList.size();
    int i = a(parame, (q)localObject, this);
    GMTrace.o(8941182386176L, 66617);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(8941316603904L, 66618);
    int i = k.b.gum;
    GMTrace.o(8941316603904L, 66618);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(8941719257088L, 66621);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8941719257088L, 66621);
      return;
    }
    if ((g(paramq)) && (this.nRk.size() > 0)) {
      a(this.gtW, this.fUd);
    }
    w.d("MicroMsg.NetSceneBatchGetContactProfile", "left cnt = " + this.nRk.size());
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(8941719257088L, 66621);
  }
  
  public final int getType()
  {
    GMTrace.i(8941450821632L, 66619);
    GMTrace.o(8941450821632L, 66619);
    return 140;
  }
  
  protected final int vB()
  {
    GMTrace.i(8941585039360L, 66620);
    GMTrace.o(8941585039360L, 66620);
    return 50;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qmessage\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */