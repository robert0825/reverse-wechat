package com.tencent.mm.plugin.card.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bu.g;
import com.tencent.mm.plugin.card.base.d;
import com.tencent.mm.plugin.card.model.aj;
import com.tencent.mm.plugin.card.model.ak;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.s;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b
  implements e
{
  public byte[] gCf;
  public List<aj> jwH;
  public List<aj> jwI;
  private s jwJ;
  public List<WeakReference<d>> jwK;
  
  public b()
  {
    GMTrace.i(5124567072768L, 38181);
    this.gCf = new byte[0];
    this.jwK = new ArrayList();
    this.jwH = al.ako().akk();
    this.jwI = new ArrayList();
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BatchGetCardMgr", "<init>, init pending list size = %d", new Object[] { Integer.valueOf(this.jwH.size()) });
    at.wS().a(559, this);
    GMTrace.o(5124567072768L, 38181);
  }
  
  public static void lD(int paramInt)
  {
    GMTrace.i(5125103943680L, 38185);
    com.tencent.mm.plugin.card.model.w localw = new com.tencent.mm.plugin.card.model.w(paramInt);
    at.wS().a(localw, 0);
    GMTrace.o(5125103943680L, 38185);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k arg4)
  {
    GMTrace.i(5124969725952L, 38184);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BatchGetCardMgr", "onSceneEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.jwJ = null;
    paramString = ((s)???).jzM;
    aj localaj;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BatchGetCardMgr", "onSceneEnd fail, stop batch get, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      ??? = this.gCf;
      if (paramString != null) {}
      try
      {
        if (paramString.size() > 0)
        {
          this.jwH.removeAll(paramString);
          this.jwI.addAll(paramString);
        }
        ??? = al.ako();
        if ((paramString == null) || (paramString.size() == 0))
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.PendingCardIdInfoStorage", "increaseRetryCount fail, list is empty");
          GMTrace.o(5124969725952L, 38184);
          return;
        }
      }
      finally {}
      paramString = paramString.iterator();
      while (paramString.hasNext())
      {
        localaj = (aj)paramString.next();
        if (localaj != null)
        {
          localaj.field_retryCount += 1;
          ???.c(localaj, new String[0]);
        }
      }
      GMTrace.o(5124969725952L, 38184);
      return;
    }
    if (paramString == null)
    {
      paramInt1 = 0;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BatchGetCardMgr", "onSceneEnd, batch get succ, remove succ id list, size = %d", new Object[] { Integer.valueOf(paramInt1) });
      if (paramString == null) {}
    }
    for (;;)
    {
      synchronized (this.gCf)
      {
        this.jwH.removeAll(paramString);
        long l1 = System.currentTimeMillis();
        at.AR();
        long l2 = c.yH().cE(Thread.currentThread().getId());
        ??? = al.ako();
        if ((paramString == null) || (paramString.size() == 0))
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.PendingCardIdInfoStorage", "deleteList fail, list is empty");
          at.AR();
          c.yH().aL(l2);
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BatchGetCardMgr", "onSceneEnd do transaction use time %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
          ajI();
          if (this.jwK == null) {
            break;
          }
          paramInt1 = 0;
          if (paramInt1 >= this.jwK.size()) {
            break;
          }
          paramString = (WeakReference)this.jwK.get(paramInt1);
          if (paramString != null)
          {
            paramString = (d)paramString.get();
            if (paramString != null) {
              paramString.ajG();
            }
          }
          paramInt1 += 1;
          continue;
          paramInt1 = paramString.size();
        }
      }
      paramString = paramString.iterator();
      while (paramString.hasNext())
      {
        localaj = (aj)paramString.next();
        if (localaj != null) {
          ???.a(localaj, new String[0]);
        }
      }
    }
    GMTrace.o(5124969725952L, 38184);
  }
  
  public final void ajI()
  {
    GMTrace.i(5124835508224L, 38183);
    if (this.jwH.size() == 0)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BatchGetCardMgr", "getNow, no pending cardinfo ,no need to get");
      GMTrace.o(5124835508224L, 38183);
      return;
    }
    if (this.jwJ != null)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BatchGetCardMgr", "getNow, already doing scene, not trigger now");
      GMTrace.o(5124835508224L, 38183);
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    if (this.jwH.size() <= 10) {
      localLinkedList.addAll(this.jwH);
    }
    for (;;)
    {
      this.jwJ = new s(localLinkedList);
      at.wS().a(this.jwJ, 0);
      GMTrace.o(5124835508224L, 38183);
      return;
      localLinkedList.addAll(this.jwH.subList(0, 10));
    }
  }
  
  public final void detach()
  {
    GMTrace.i(5124701290496L, 38182);
    this.jwH.clear();
    this.jwI.clear();
    if (this.jwJ != null) {
      at.wS().c(this.jwJ);
    }
    at.wS().b(559, this);
    GMTrace.o(5124701290496L, 38182);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */