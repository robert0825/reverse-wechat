package com.tencent.mm.plugin.card.sharecard.a;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.bu.g;
import com.tencent.mm.plugin.card.base.d;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.sharecard.model.h;
import com.tencent.mm.plugin.card.sharecard.model.o;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
  implements com.tencent.mm.ad.e
{
  public byte[] gCf;
  public com.tencent.mm.plugin.card.sharecard.model.e jAM;
  private int jAN;
  public int jAO;
  public List<com.tencent.mm.plugin.card.sharecard.model.n> jwH;
  public List<com.tencent.mm.plugin.card.sharecard.model.n> jwI;
  private List<WeakReference<d>> jwK;
  public ae mHandler;
  private Runnable mRunnable;
  
  public a()
  {
    GMTrace.i(5099065704448L, 37991);
    this.gCf = new byte[0];
    this.jwK = new ArrayList();
    this.jAN = 0;
    this.jAO = 5;
    this.mHandler = new ae(Looper.getMainLooper());
    this.mRunnable = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5097857744896L, 37982);
        w.i("MicroMsg.ShareCardBatchGetCardMgr", "doShareCardSyncNetScene after 5s");
        h localh = new h();
        at.wS().a(localh, 0);
        GMTrace.o(5097857744896L, 37982);
      }
    };
    this.jwH = al.akw().akk();
    this.jwI = new ArrayList();
    w.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr <init>, init pending list size = %d", new Object[] { Integer.valueOf(this.jwH.size()) });
    at.wS().a(903, this);
    GMTrace.o(5099065704448L, 37991);
  }
  
  private ArrayList<com.tencent.mm.plugin.card.sharecard.model.n> F(LinkedList<String> paramLinkedList)
  {
    GMTrace.i(5099468357632L, 37994);
    ArrayList localArrayList = new ArrayList();
    LinkedList localLinkedList = new LinkedList();
    for (;;)
    {
      int i;
      synchronized (this.gCf)
      {
        if (this.jwH.size() == 0)
        {
          w.e("MicroMsg.ShareCardBatchGetCardMgr", "getSuccessShareCardSyncItem pendingList size is 0");
          GMTrace.o(5099468357632L, 37994);
          return localArrayList;
        }
        localLinkedList.addAll(this.jwH);
        i = 0;
        if (i >= paramLinkedList.size()) {
          break;
        }
        ??? = (String)paramLinkedList.get(i);
        int j = 0;
        if (j < localLinkedList.size())
        {
          if ((??? != null) && (localLinkedList.get(j) != null) && (((String)???).equals(((com.tencent.mm.plugin.card.sharecard.model.n)localLinkedList.get(j)).field_card_id))) {
            localArrayList.add(localLinkedList.get(j));
          }
          j += 1;
        }
      }
      i += 1;
    }
    GMTrace.o(5099468357632L, 37994);
    return localArrayList;
  }
  
  public final void a(int paramInt1, int paramInt2, String arg3, k paramk)
  {
    GMTrace.i(5099334139904L, 37993);
    w.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr onSceneEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.jAM = null;
    com.tencent.mm.plugin.card.sharecard.model.n localn;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      w.e("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr onSceneEnd fail, stop batch get, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      paramk = F(((com.tencent.mm.plugin.card.sharecard.model.e)paramk).jzL);
      synchronized (this.gCf)
      {
        if (paramk.size() > 0)
        {
          this.jwH.removeAll(paramk);
          this.jwI.addAll(paramk);
        }
        ??? = al.akw();
        if (paramk.size() == 0)
        {
          w.e("MicroMsg.ShareCardSyncItemInfoStorage", "increaseRetryCount fail, share card list is empty");
          GMTrace.o(5099334139904L, 37993);
          return;
        }
      }
      paramk = paramk.iterator();
      while (paramk.hasNext())
      {
        localn = (com.tencent.mm.plugin.card.sharecard.model.n)paramk.next();
        if (localn != null)
        {
          localn.field_retryCount += 1;
          ???.c(localn, new String[0]);
        }
      }
      GMTrace.o(5099334139904L, 37993);
      return;
    }
    paramk = F(((com.tencent.mm.plugin.card.sharecard.model.e)paramk).jzM);
    w.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr onSceneEnd, batch get succ, remove succ id list, size = %d", new Object[] { Integer.valueOf(paramk.size()) });
    for (;;)
    {
      synchronized (this.gCf)
      {
        this.jwH.removeAll(paramk);
        long l1 = System.currentTimeMillis();
        at.AR();
        long l2 = c.yH().cE(Thread.currentThread().getId());
        ??? = al.akw();
        if (paramk.size() == 0)
        {
          w.e("MicroMsg.ShareCardSyncItemInfoStorage", "deleteList fail, share card list is empty");
          at.AR();
          c.yH().aL(l2);
          w.i("MicroMsg.ShareCardBatchGetCardMgr", "onSceneEnd do transaction use time %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
          ajI();
          aic();
          GMTrace.o(5099334139904L, 37993);
          return;
        }
      }
      paramk = paramk.iterator();
      while (paramk.hasNext())
      {
        localn = (com.tencent.mm.plugin.card.sharecard.model.n)paramk.next();
        if (localn != null) {
          ???.a(localn, new String[0]);
        }
      }
    }
  }
  
  public final void a(d paramd)
  {
    GMTrace.i(5099871010816L, 37997);
    if (this.jwK == null) {
      this.jwK = new ArrayList();
    }
    if (paramd != null) {
      this.jwK.add(new WeakReference(paramd));
    }
    GMTrace.o(5099871010816L, 37997);
  }
  
  public final void aic()
  {
    GMTrace.i(5099736793088L, 37996);
    if (this.jwK == null)
    {
      GMTrace.o(5099736793088L, 37996);
      return;
    }
    int i = 0;
    while (i < this.jwK.size())
    {
      Object localObject = (WeakReference)this.jwK.get(i);
      if (localObject != null)
      {
        localObject = (d)((WeakReference)localObject).get();
        if (localObject != null) {
          ((d)localObject).ajG();
        }
      }
      i += 1;
    }
    GMTrace.o(5099736793088L, 37996);
  }
  
  public final void ajI()
  {
    GMTrace.i(5099199922176L, 37992);
    LinkedList localLinkedList1 = new LinkedList();
    synchronized (this.gCf)
    {
      if (this.jwH.size() == 0)
      {
        w.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr getNow, no pending cardinfo ,no need to get");
        GMTrace.o(5099199922176L, 37992);
        return;
      }
      localLinkedList1.addAll(this.jwH);
      if (this.jAM != null)
      {
        w.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr getNow, already doing scene, not trigger now");
        GMTrace.o(5099199922176L, 37992);
        return;
      }
    }
    ??? = new LinkedList();
    if (localCollection.size() <= 10) {
      ((LinkedList)???).addAll(localCollection);
    }
    LinkedList localLinkedList2;
    for (;;)
    {
      localLinkedList2 = new LinkedList();
      int i = 0;
      while (i < ((LinkedList)???).size())
      {
        localLinkedList2.add(((com.tencent.mm.plugin.card.sharecard.model.n)((LinkedList)???).get(i)).field_card_id);
        i += 1;
      }
      ((LinkedList)???).addAll(localLinkedList2.subList(0, 10));
    }
    this.jAM = new com.tencent.mm.plugin.card.sharecard.model.e(localLinkedList2);
    at.wS().a(this.jAM, 0);
    GMTrace.o(5099199922176L, 37992);
  }
  
  public final void akE()
  {
    GMTrace.i(5099602575360L, 37995);
    w.i("MicroMsg.ShareCardBatchGetCardMgr", "doShareCardSyncNetScene");
    int j = (int)(System.currentTimeMillis() / 1000L);
    int k = j - this.jAN;
    int i;
    if (this.jAO <= 0)
    {
      i = 5;
      if (k < i) {
        break label89;
      }
      h localh = new h();
      at.wS().a(localh, 0);
    }
    for (;;)
    {
      this.jAN = j;
      GMTrace.o(5099602575360L, 37995);
      return;
      i = this.jAO;
      break;
      label89:
      w.i("MicroMsg.ShareCardBatchGetCardMgr", "sync interval is " + k);
      this.mHandler.removeCallbacks(this.mRunnable);
      this.mHandler.postDelayed(this.mRunnable, i * 1000);
    }
  }
  
  public final void b(d paramd)
  {
    GMTrace.i(5100005228544L, 37998);
    if ((this.jwK == null) || (paramd == null))
    {
      GMTrace.o(5100005228544L, 37998);
      return;
    }
    int i = 0;
    while (i < this.jwK.size())
    {
      WeakReference localWeakReference = (WeakReference)this.jwK.get(i);
      if (localWeakReference != null)
      {
        d locald = (d)localWeakReference.get();
        if ((locald != null) && (locald.equals(paramd)))
        {
          this.jwK.remove(localWeakReference);
          GMTrace.o(5100005228544L, 37998);
          return;
        }
      }
      i += 1;
    }
    GMTrace.o(5100005228544L, 37998);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\sharecard\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */