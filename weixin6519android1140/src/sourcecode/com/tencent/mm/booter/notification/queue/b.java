package com.tencent.mm.booter.notification.queue;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.app.af;
import android.support.v4.app.af.a;
import android.support.v4.app.af.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.booter.notification.NotificationItem;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public final class b
  implements Iterable<NotificationItem>
{
  public NotificationQueue fLb;
  public a fLc;
  public int mark;
  
  public b()
  {
    GMTrace.i(508550971392L, 3789);
    this.mark = -1;
    this.fLb = new NotificationQueue();
    this.fLc = new a();
    restore();
    GMTrace.o(508550971392L, 3789);
  }
  
  public static final b rH()
  {
    GMTrace.i(508416753664L, 3788);
    b localb = a.fLd;
    GMTrace.o(508416753664L, 3788);
    return localb;
  }
  
  private Queue<Integer> rK()
  {
    GMTrace.i(509356277760L, 3795);
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    Object localObject1 = this.fLb;
    if (((NotificationQueue)localObject1).fLa == null) {
      ((NotificationQueue)localObject1).restore();
    }
    localLinkedList2.addAll(((NotificationQueue)localObject1).fLa);
    localObject1 = localLinkedList2.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (NotificationItem)((Iterator)localObject1).next();
      if (((NotificationItem)localObject2).fKS)
      {
        localLinkedList1.add(Integer.valueOf(((NotificationItem)localObject2).id));
        w.d("MicroMsg.Notification.Queue", "remove allcustom: %d", new Object[] { Integer.valueOf(((NotificationItem)localObject2).id) });
      }
    }
    localLinkedList2.clear();
    localLinkedList2 = new LinkedList();
    localObject1 = this.fLc;
    if (((a)localObject1).fKX == null) {
      ((a)localObject1).restore();
    }
    localLinkedList2.addAll(((a)localObject1).fKX);
    localObject1 = localLinkedList2.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (a.a)((Iterator)localObject1).next();
      if (((a.a)localObject2).fKS)
      {
        localLinkedList1.add(Integer.valueOf(((a.a)localObject2).fKY));
        w.d("MicroMsg.Notification.Queue", "remove allcustom: %d", new Object[] { Integer.valueOf(((a.a)localObject2).fKY) });
      }
    }
    localLinkedList2.clear();
    GMTrace.o(509356277760L, 3795);
    return localLinkedList1;
  }
  
  public final void a(af paramaf, int paramInt)
  {
    GMTrace.i(509758930944L, 3798);
    af.sg.a(paramaf.sd, null, paramInt);
    if (Build.VERSION.SDK_INT <= 19) {
      paramaf.a(new af.a(paramaf.mContext.getPackageName(), paramInt, null));
    }
    remove(paramInt);
    GMTrace.o(509758930944L, 3798);
  }
  
  public final int aH(boolean paramBoolean)
  {
    GMTrace.i(510027366400L, 3800);
    long l = System.currentTimeMillis();
    Iterator localIterator = this.fLc.iterator();
    a.a locala;
    for (String str = ""; localIterator.hasNext(); str = str + locala.fKY + ",") {
      locala = (a.a)localIterator.next();
    }
    int i;
    if (paramBoolean) {
      i = 4097;
    }
    while (str.contains(String.valueOf(i)))
    {
      i += 1;
      continue;
      i = 4102;
    }
    int j = i;
    if (i >= 4102)
    {
      j = i;
      if (paramBoolean) {
        j = 4097;
      }
    }
    w.d("MicroMsg.Notification.Queue", "create id spend: %d, id: %d, isCustomControl: %B", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Integer.valueOf(j), Boolean.valueOf(paramBoolean) });
    GMTrace.o(510027366400L, 3800);
    return j;
  }
  
  public final void cancel(int paramInt)
  {
    GMTrace.i(509624713216L, 3797);
    a(af.i(ab.getContext()), paramInt);
    GMTrace.o(509624713216L, 3797);
  }
  
  public final int dy(String paramString)
  {
    GMTrace.i(509893148672L, 3799);
    int i = getId(paramString);
    if (i > 0)
    {
      GMTrace.o(509893148672L, 3799);
      return i;
    }
    i = aH(true);
    GMTrace.o(509893148672L, 3799);
    return i;
  }
  
  public final int getId(String paramString)
  {
    GMTrace.i(509490495488L, 3796);
    if (t.nm(paramString))
    {
      GMTrace.o(509490495488L, 3796);
      return -1;
    }
    Iterator localIterator = this.fLc.iterator();
    while (localIterator.hasNext())
    {
      a.a locala = (a.a)localIterator.next();
      if (locala.userName.equals(paramString))
      {
        int i = locala.fKY;
        GMTrace.o(509490495488L, 3796);
        return i;
      }
    }
    GMTrace.o(509490495488L, 3796);
    return -1;
  }
  
  public final Iterator<NotificationItem> iterator()
  {
    GMTrace.i(510161584128L, 3801);
    Object localObject = this.fLb;
    if (((NotificationQueue)localObject).fLa == null) {
      ((NotificationQueue)localObject).restore();
    }
    localObject = ((NotificationQueue)localObject).fLa.iterator();
    GMTrace.o(510161584128L, 3801);
    return (Iterator<NotificationItem>)localObject;
  }
  
  public final NotificationItem rI()
  {
    GMTrace.i(508953624576L, 3792);
    int i = 0;
    Object localObject;
    if (i < size())
    {
      localObject = this.fLb;
      if (((NotificationQueue)localObject).fLa == null) {
        ((NotificationQueue)localObject).restore();
      }
      localObject = (NotificationItem)((NotificationQueue)localObject).fLa.get(i);
      if (((NotificationItem)localObject).fKS)
      {
        if (this.fLc.aO(((NotificationItem)localObject).id)) {
          w.d("MicroMsg.NotificationAppMsgQueue", "remove: [%s]", new Object[] { ((NotificationItem)localObject).toString() });
        }
        this.fLb.c((NotificationItem)localObject);
      }
    }
    for (;;)
    {
      GMTrace.o(508953624576L, 3792);
      return (NotificationItem)localObject;
      i += 1;
      break;
      localObject = null;
    }
  }
  
  public final Queue<Integer> rJ()
  {
    GMTrace.i(509222060032L, 3794);
    LinkedList localLinkedList = new LinkedList();
    int i = 4097;
    while (i < 4102)
    {
      localLinkedList.add(Integer.valueOf(i));
      i += 1;
    }
    localLinkedList.addAll(rK());
    GMTrace.o(509222060032L, 3794);
    return localLinkedList;
  }
  
  public final void remove(int paramInt)
  {
    GMTrace.i(509087842304L, 3793);
    this.fLc.aO(paramInt);
    NotificationItem localNotificationItem = this.fLb.dZ(paramInt);
    if (localNotificationItem != null) {
      localNotificationItem.clear();
    }
    GMTrace.o(509087842304L, 3793);
  }
  
  public final void restore()
  {
    GMTrace.i(508685189120L, 3790);
    this.fLb.restore();
    this.fLc.restore();
    GMTrace.o(508685189120L, 3790);
  }
  
  public final int size()
  {
    GMTrace.i(508819406848L, 3791);
    NotificationQueue localNotificationQueue = this.fLb;
    if (localNotificationQueue.fLa == null) {
      localNotificationQueue.restore();
    }
    int i = localNotificationQueue.fLa.size();
    GMTrace.o(508819406848L, 3791);
    return i;
  }
  
  private static final class a
  {
    public static final b fLd;
    
    static
    {
      GMTrace.i(513651245056L, 3827);
      fLd = new b();
      GMTrace.o(513651245056L, 3827);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\booter\notification\queue\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */