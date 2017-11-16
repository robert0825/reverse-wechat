package com.tencent.mm.booter.notification.queue;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.booter.notification.NotificationItem;
import com.tencent.mm.k.f;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public final class NotificationQueue
{
  public ParcelNotificationQueue fLa;
  
  public NotificationQueue()
  {
    GMTrace.i(510430019584L, 3803);
    GMTrace.o(510430019584L, 3803);
  }
  
  private void save()
  {
    GMTrace.i(510564237312L, 3804);
    if (this.fLa == null)
    {
      GMTrace.o(510564237312L, 3804);
      return;
    }
    w.d("MicroMsg.NotificationCustomQueue", "jacks save: %d", new Object[] { Integer.valueOf(this.fLa.size()) });
    if (this.fLa.isEmpty())
    {
      f.tI().edit().putString("com.tencent.preference.notification.queue", "").apply();
      if (this.fLa == null) {
        restore();
      }
      w.d("MicroMsg.NotificationCustomQueue", "jacks _reset: %d", new Object[] { Integer.valueOf(this.fLa.size()) });
      GMTrace.o(510564237312L, 3804);
      return;
    }
    GMTrace.o(510564237312L, 3804);
  }
  
  public final boolean c(NotificationItem paramNotificationItem)
  {
    try
    {
      GMTrace.i(510832672768L, 3806);
      if (this.fLa == null) {
        restore();
      }
      boolean bool = this.fLa.remove(paramNotificationItem);
      if (bool) {
        save();
      }
      GMTrace.o(510832672768L, 3806);
      return bool;
    }
    finally {}
  }
  
  public final boolean d(NotificationItem paramNotificationItem)
  {
    try
    {
      GMTrace.i(511101108224L, 3808);
      if (this.fLa == null) {
        restore();
      }
      boolean bool = this.fLa.add(paramNotificationItem);
      if (bool) {
        save();
      }
      GMTrace.o(511101108224L, 3808);
      return bool;
    }
    finally {}
  }
  
  public final NotificationItem dZ(int paramInt)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(510966890496L, 3807);
        if (this.fLa == null) {
          restore();
        }
        Iterator localIterator = this.fLa.iterator();
        if (localIterator.hasNext())
        {
          NotificationItem localNotificationItem = (NotificationItem)localIterator.next();
          if (localNotificationItem.id != paramInt) {
            continue;
          }
          if ((localNotificationItem != null) && (this.fLa.remove(localNotificationItem))) {
            save();
          }
          GMTrace.o(510966890496L, 3807);
          return localNotificationItem;
        }
      }
      finally {}
      Object localObject2 = null;
    }
  }
  
  public final void restore()
  {
    try
    {
      GMTrace.i(510698455040L, 3805);
      w.d("MicroMsg.NotificationCustomQueue", "jacks _restore");
      if (this.fLa == null) {
        this.fLa = new ParcelNotificationQueue();
      }
      w.d("MicroMsg.NotificationCustomQueue", "jacks _restore: %d", new Object[] { Integer.valueOf(this.fLa.size()) });
      GMTrace.o(510698455040L, 3805);
      return;
    }
    finally {}
  }
  
  public static class ParcelNotificationQueue
    extends LinkedList<NotificationItem>
    implements Parcelable
  {
    public static final Parcelable.Creator<ParcelNotificationQueue> CREATOR;
    
    static
    {
      GMTrace.i(512174850048L, 3816);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(512174850048L, 3816);
    }
    
    public ParcelNotificationQueue()
    {
      GMTrace.i(511772196864L, 3813);
      GMTrace.o(511772196864L, 3813);
    }
    
    public int describeContents()
    {
      GMTrace.i(511906414592L, 3814);
      GMTrace.o(511906414592L, 3814);
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(512040632320L, 3815);
      paramParcel.writeInt(size());
      Iterator localIterator = iterator();
      while (localIterator.hasNext()) {
        paramParcel.writeParcelable((NotificationItem)localIterator.next(), 0);
      }
      GMTrace.o(512040632320L, 3815);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\booter\notification\queue\NotificationQueue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */