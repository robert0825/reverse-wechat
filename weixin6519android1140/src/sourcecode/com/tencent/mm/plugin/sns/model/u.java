package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bgb;
import com.tencent.mm.protocal.c.bgc;
import com.tencent.mm.protocal.c.bgd;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class u
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private String eDW;
  private int eHz;
  private b fUa;
  public com.tencent.mm.ad.e fUd;
  public LinkedList<bgb> psQ;
  public int psR;
  
  public u(int paramInt)
  {
    GMTrace.i(18585531449344L, 138473);
    this.psQ = null;
    this.eHz = paramInt;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bgc();
    ((b.a)localObject).gtG = new bgd();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnstaglist";
    ((b.a)localObject).gtE = 292;
    ((b.a)localObject).gtH = 116;
    ((b.a)localObject).gtI = 1000000116;
    this.fUa = ((b.a)localObject).DA();
    localObject = ae.bjh().Iw("@__weixintsnstag").field_md5;
    if (localObject == null) {
      localObject = "";
    }
    for (;;)
    {
      this.eDW = ((String)localObject);
      bgc localbgc = (bgc)this.fUa.gtC.gtK;
      localbgc.tMX = paramInt;
      localbgc.uRU = ((String)localObject);
      GMTrace.o(18585531449344L, 138473);
      return;
    }
  }
  
  public static s a(s params, bgb parambgb)
  {
    GMTrace.i(8071451508736L, 60137);
    params.field_tagId = parambgb.uRT;
    params.field_tagName = bg.aq(parambgb.lRR, "");
    params.field_count = parambgb.jhc;
    params.bA(parambgb.jhd);
    w.d("MicroMsg.NetSceneSnsTagList", "tagInfo getList: " + parambgb.toString());
    GMTrace.o(8071451508736L, 60137);
    return params;
  }
  
  private static boolean a(List<Long> paramList, Long paramLong)
  {
    GMTrace.i(8071585726464L, 60138);
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      if (((Long)paramList.next()).longValue() == paramLong.longValue())
      {
        GMTrace.o(8071585726464L, 60138);
        return true;
      }
    }
    GMTrace.o(8071585726464L, 60138);
    return false;
  }
  
  private static boolean b(s params, bgb parambgb)
  {
    boolean bool2 = false;
    GMTrace.i(8071988379648L, 60141);
    params = params.field_memberList.split(",");
    parambgb = parambgb.jhd.iterator();
    label89:
    label96:
    label99:
    for (;;)
    {
      boolean bool1 = bool2;
      if (parambgb.hasNext())
      {
        azq localazq = (azq)parambgb.next();
        i = 0;
        if (i >= params.length) {
          break label96;
        }
        if (!params[i].equals(localazq)) {
          break label89;
        }
      }
      for (int i = 1;; i = 0)
      {
        if (i != 0) {
          break label99;
        }
        bool1 = true;
        GMTrace.o(8071988379648L, 60141);
        return bool1;
        i += 1;
        break;
      }
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(8071183073280L, 60135);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(8071183073280L, 60135);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(8071854161920L, 60140);
    w.d("MicroMsg.NetSceneSnsTagList", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8071854161920L, 60140);
      return;
    }
    Object localObject1 = (bgd)((b)paramq).gtD.gtK;
    w.d("MicroMsg.NetSceneSnsTagList", "[onGYNetEnd]State：%s", new Object[] { Integer.valueOf(this.psR) });
    this.psR = ((bgd)localObject1).psR;
    this.psQ = ((bgd)localObject1).jhd;
    paramq = ((bgd)localObject1).uRU;
    if (this.eDW.equals(paramq))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8071854161920L, 60140);
      return;
    }
    paramArrayOfByte = ae.bjj().bmA();
    Object localObject2;
    if (this.eHz != 3) {
      localObject2 = paramArrayOfByte.iterator();
    }
    label519:
    for (;;)
    {
      Object localObject3;
      if (((Iterator)localObject2).hasNext())
      {
        localObject3 = (Long)((Iterator)localObject2).next();
        Iterator localIterator = ((bgd)localObject1).jhd.iterator();
        bgb localbgb;
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
          localbgb = (bgb)localIterator.next();
        } while (((Long)localObject3).longValue() != localbgb.uRT);
      }
      for (paramInt1 = 1;; paramInt1 = 0)
      {
        if (paramInt1 != 0) {
          break label519;
        }
        ((Iterator)localObject2).remove();
        ae.bjj().dX(((Long)localObject3).longValue());
        break;
        localObject1 = ((bgd)localObject1).jhd.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (bgb)((Iterator)localObject1).next();
          if (!a(paramArrayOfByte, Long.valueOf(((bgb)localObject2).uRT)))
          {
            localObject3 = new s();
            a((s)localObject3, (bgb)localObject2);
            ae.bjj().a((s)localObject3);
          }
          else
          {
            localObject3 = ae.bjj().dW(((bgb)localObject2).uRT);
            if (((((s)localObject3).field_tagName != null) && (!((s)localObject3).field_tagName.equals(((bgb)localObject2).lRR))) || (((s)localObject3).field_count != ((bgb)localObject2).jhc) || (b((s)localObject3, (bgb)localObject2)))
            {
              a((s)localObject3, (bgb)localObject2);
              ae.bjj().a((s)localObject3);
            }
          }
        }
        paramArrayOfByte = ae.bjh().Iw("@__weixintsnstag");
        paramArrayOfByte.field_md5 = paramq;
        ae.bjh().a(paramArrayOfByte);
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(8071854161920L, 60140);
        return;
      }
    }
  }
  
  public final List<String> dE(long paramLong)
  {
    GMTrace.i(8071719944192L, 60139);
    LinkedList localLinkedList = new LinkedList();
    if (this.psQ == null)
    {
      GMTrace.o(8071719944192L, 60139);
      return localLinkedList;
    }
    Iterator localIterator = this.psQ.iterator();
    while (localIterator.hasNext())
    {
      bgb localbgb = (bgb)localIterator.next();
      if (localbgb.uRT == paramLong)
      {
        localIterator = localbgb.jhd.iterator();
        while (localIterator.hasNext()) {
          localLinkedList.add(((azq)localIterator.next()).uNR);
        }
        GMTrace.o(8071719944192L, 60139);
        return localLinkedList;
      }
    }
    GMTrace.o(8071719944192L, 60139);
    return localLinkedList;
  }
  
  public final int getType()
  {
    GMTrace.i(8071317291008L, 60136);
    GMTrace.o(8071317291008L, 60136);
    return 292;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */