package com.tencent.mm.booter.notification;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.booter.notification.queue.b;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;

public class NotificationDeleteReceive
  extends BroadcastReceiver
{
  private NotificationDeleteReceive()
  {
    GMTrace.i(505866616832L, 3769);
    GMTrace.o(505866616832L, 3769);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(506000834560L, 3770);
    int i;
    try
    {
      i = paramIntent.getIntExtra("com.tencent.notification.id.key", -1);
      w.d("MicroMsg.Notification.Delete.Receive", "receive: %d", new Object[] { Integer.valueOf(i) });
      if (i == -1)
      {
        GMTrace.o(506000834560L, 3770);
        return;
      }
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.Notification.Delete.Receive", paramContext, "", new Object[0]);
        i = -1;
      }
      paramIntent = b.rH().iterator();
    }
    do
    {
      if (!paramIntent.hasNext()) {
        break;
      }
      paramContext = (NotificationItem)paramIntent.next();
    } while ((paramContext == null) || (paramContext.id != i));
    for (;;)
    {
      if (paramContext == null)
      {
        w.w("MicroMsg.Notification.Delete.Receive", "receive delete notification: %d, but no item in queue", new Object[] { Integer.valueOf(i) });
        GMTrace.o(506000834560L, 3770);
        return;
      }
      if (paramContext.fKO != null) {}
      try
      {
        paramContext.fKO.send();
        b.rH().remove(i);
        GMTrace.o(506000834560L, 3770);
        return;
      }
      catch (PendingIntent.CanceledException paramContext)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.NotificationItem", paramContext, "Delete intent send Exception?", new Object[0]);
        }
      }
      paramContext = null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\booter\notification\NotificationDeleteReceive.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */