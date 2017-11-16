package com.tencent.mm.booter.notification;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.af;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.booter.notification.queue.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public final class e
  extends a
{
  public c fKN;
  private Context mContext;
  private NotificationManager sd;
  
  public e()
  {
    GMTrace.i(519019954176L, 3867);
    this.mContext = ab.getContext();
    this.sd = ((NotificationManager)this.mContext.getSystemService("notification"));
    this.fKN = new c();
    GMTrace.o(519019954176L, 3867);
  }
  
  public static void cancel()
  {
    GMTrace.i(519154171904L, 3868);
    af localaf = af.i(ab.getContext());
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = b.rH().rJ().iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      if (!localLinkedList.contains(localInteger))
      {
        b.rH().a(localaf, localInteger.intValue());
        localLinkedList.add(localInteger);
      }
    }
    GMTrace.o(519154171904L, 3868);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\booter\notification\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */