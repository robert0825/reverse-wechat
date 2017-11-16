package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.card.b.f;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.protocal.c.fd;
import com.tencent.mm.protocal.c.fe;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class s
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  private LinkedList<aj> jzL;
  public LinkedList<aj> jzM;
  
  public s(LinkedList<aj> paramLinkedList)
  {
    GMTrace.i(4911563538432L, 36594);
    this.jzM = new LinkedList();
    this.jzL = paramLinkedList;
    b.a locala = new b.a();
    locala.gtF = new fd();
    locala.gtG = new fe();
    locala.uri = "/cgi-bin/micromsg-bin/batchgetcarditem";
    locala.gtE = 559;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((fd)this.fUa.gtC.gtK).tTF = E(paramLinkedList);
    GMTrace.o(4911563538432L, 36594);
  }
  
  private static LinkedList<String> E(LinkedList<aj> paramLinkedList)
  {
    GMTrace.i(4912100409344L, 36598);
    LinkedList localLinkedList = new LinkedList();
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
    {
      GMTrace.o(4912100409344L, 36598);
      return localLinkedList;
    }
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      aj localaj = (aj)paramLinkedList.next();
      if (localaj != null) {
        localLinkedList.add(localaj.field_cardUserId);
      }
    }
    GMTrace.o(4912100409344L, 36598);
    return localLinkedList;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4911831973888L, 36596);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4911831973888L, 36596);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4911966191616L, 36597);
    w.d("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, batch get fail, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4911966191616L, 36597);
      return;
    }
    paramq = ((fe)this.fUa.gtD.gtK).jzG;
    if (TextUtils.isEmpty(paramq))
    {
      w.e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd fail, resp json_ret is null");
      this.fUd.a(4, -1, null, this);
      GMTrace.o(4911966191616L, 36597);
      return;
    }
    long l1 = System.currentTimeMillis();
    paramq = f.uw(paramq);
    if (paramq != null)
    {
      if (this.jzL != null) {
        this.jzM.addAll(this.jzL);
      }
      long l2 = System.currentTimeMillis();
      at.AR();
      long l3 = c.yH().cE(Thread.currentThread().getId());
      paramInt1 = 0;
      paramArrayOfByte = paramq.iterator();
      Object localObject1;
      Object localObject2;
      Object localObject3;
      for (paramInt2 = 0; paramArrayOfByte.hasNext(); paramInt2 = paramInt3)
      {
        localObject1 = (CardInfo)paramArrayOfByte.next();
        paramInt3 = paramInt2 + 1;
        paramInt2 = paramInt1;
        if (!l.b((CardInfo)localObject1))
        {
          paramInt1 += 1;
          localObject2 = this.jzM;
          paramInt2 = paramInt1;
          if (localObject1 != null)
          {
            localObject3 = new aj();
            ((aj)localObject3).field_cardUserId = ((CardInfo)localObject1).field_card_id;
            ((LinkedList)localObject2).remove(localObject3);
            paramInt2 = paramInt1;
          }
        }
        paramInt1 = paramInt2;
      }
      at.AR();
      c.yH().aL(l3);
      w.i("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd do transaction use time %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
      w.e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, deal CardObject %d fail of %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      l.amU();
      if (paramq.size() > 0)
      {
        paramInt1 = (int)(System.currentTimeMillis() - l1);
        paramArrayOfByte = new ArrayList();
        localObject1 = new IDKey();
        ((IDKey)localObject1).SetID(281);
        ((IDKey)localObject1).SetKey(43);
        ((IDKey)localObject1).SetValue(1L);
        localObject2 = new IDKey();
        ((IDKey)localObject2).SetID(281);
        ((IDKey)localObject2).SetKey(44);
        ((IDKey)localObject2).SetValue(paramInt1);
        localObject3 = new IDKey();
        ((IDKey)localObject3).SetID(281);
        ((IDKey)localObject3).SetKey(45);
        ((IDKey)localObject3).SetValue(paramq.size());
        IDKey localIDKey = new IDKey();
        localIDKey.SetID(281);
        localIDKey.SetKey(47);
        localIDKey.SetValue(paramInt1 / paramq.size());
        paramArrayOfByte.add(localObject1);
        paramArrayOfByte.add(localObject2);
        paramArrayOfByte.add(localObject3);
        paramArrayOfByte.add(localIDKey);
        com.tencent.mm.plugin.report.service.g.ork.b(paramArrayOfByte, true);
      }
    }
    this.fUd.a(0, 0, paramString, this);
    GMTrace.o(4911966191616L, 36597);
  }
  
  public final int getType()
  {
    GMTrace.i(4911697756160L, 36595);
    GMTrace.o(4911697756160L, 36595);
    return 559;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */