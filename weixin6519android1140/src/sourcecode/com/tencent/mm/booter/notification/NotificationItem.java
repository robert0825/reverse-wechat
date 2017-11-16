package com.tencent.mm.booter.notification;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.af;
import android.support.v4.app.af.b;
import android.support.v4.app.af.f;
import android.support.v4.app.y;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.booter.notification.a.e;
import com.tencent.mm.booter.notification.a.g;
import com.tencent.mm.booter.notification.queue.NotificationQueue;
import com.tencent.mm.booter.notification.queue.a;
import com.tencent.mm.booter.notification.queue.b;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;

public class NotificationItem
  implements Parcelable
{
  public static final Parcelable.Creator<NotificationItem> CREATOR;
  private final String TAG;
  private Bitmap b;
  PendingIntent fKO;
  public String fKP;
  public long fKQ;
  public int fKR;
  public boolean fKS;
  public int fKT;
  public int fKU;
  public int id;
  Notification rC;
  
  static
  {
    GMTrace.i(521435873280L, 3885);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(521435873280L, 3885);
  }
  
  public NotificationItem(int paramInt, Notification paramNotification, boolean paramBoolean)
  {
    this(paramInt, null, paramNotification, paramBoolean);
    GMTrace.i(520093696000L, 3875);
    GMTrace.o(520093696000L, 3875);
  }
  
  public NotificationItem(int paramInt, String paramString, Notification paramNotification)
  {
    this(paramInt, paramString, paramNotification, true);
    GMTrace.i(519959478272L, 3874);
    GMTrace.o(519959478272L, 3874);
  }
  
  @TargetApi(11)
  private NotificationItem(int paramInt, String paramString, Notification paramNotification, boolean paramBoolean)
  {
    GMTrace.i(520362131456L, 3877);
    this.TAG = "MicroMsg.NotificationItem";
    this.id = -1;
    this.fKQ = 0L;
    this.fKR = 0;
    this.fKS = true;
    this.fKT = 0;
    this.fKU = 0;
    this.id = paramInt;
    this.fKP = paramString;
    if (Build.VERSION.SDK_INT >= 11) {
      this.b = paramNotification.largeIcon;
    }
    this.rC = paramNotification;
    this.fKS = paramBoolean;
    this.fKT = 0;
    GMTrace.o(520362131456L, 3877);
  }
  
  public NotificationItem(Notification paramNotification, boolean paramBoolean)
  {
    this(-1, paramNotification, paramBoolean);
    GMTrace.i(520227913728L, 3876);
    GMTrace.o(520227913728L, 3876);
  }
  
  public NotificationItem(Parcel paramParcel)
  {
    GMTrace.i(520764784640L, 3880);
    this.TAG = "MicroMsg.NotificationItem";
    this.id = -1;
    this.fKQ = 0L;
    this.fKR = 0;
    this.fKS = true;
    this.fKT = 0;
    this.fKU = 0;
    if (paramParcel == null)
    {
      GMTrace.o(520764784640L, 3880);
      return;
    }
    this.id = paramParcel.readInt();
    this.fKP = paramParcel.readString();
    this.b = ((Bitmap)paramParcel.readParcelable(Bitmap.class.getClassLoader()));
    this.rC = ((Notification)paramParcel.readParcelable(Notification.class.getClassLoader()));
    this.fKO = ((PendingIntent)paramParcel.readParcelable(PendingIntent.class.getClassLoader()));
    if (paramParcel.readByte() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.fKS = bool;
      this.fKQ = paramParcel.readLong();
      this.fKR = paramParcel.readInt();
      GMTrace.o(520764784640L, 3880);
      return;
    }
  }
  
  public final int a(g paramg)
  {
    Object localObject2 = null;
    Bundle localBundle = null;
    for (;;)
    {
      int i;
      Object localObject3;
      try
      {
        GMTrace.i(520630566912L, 3879);
        Context localContext;
        if (this.id == -1)
        {
          i = b.rH().aH(this.fKS);
          this.id = i;
          localContext = ab.getContext();
          if (localContext == null)
          {
            w.e("MicroMsg.NotificationItem", "error, show notification but MMApplicationContext.getContext() == null");
            GMTrace.o(520630566912L, 3879);
            i = -1;
            return i;
          }
        }
        else
        {
          i = this.id;
          continue;
        }
        if (this.rC == null)
        {
          w.e("MicroMsg.NotificationItem", "error, show notification but mNotification == null");
          GMTrace.o(520630566912L, 3879);
          i = -1;
          continue;
        }
        localObject1 = b.rH();
        localObject3 = this.fKP;
        if (t.nm((String)localObject3))
        {
          localObject1 = null;
          if (localObject1 != null)
          {
            localObject3 = b.rH();
            i = ((NotificationItem)localObject1).id;
            w.d("MicroMsg.Notification.Queue", "mark: %d", new Object[] { Integer.valueOf(i) });
            ((b)localObject3).mark = i;
          }
          if ((localObject1 != null) && (((NotificationItem)localObject1).rC.tickerText != null) && (this.rC.tickerText != null) && (((NotificationItem)localObject1).rC.tickerText.equals(this.rC.tickerText))) {
            this.rC.tickerText += " ";
          }
          localObject3 = b.rH();
          if (this == null)
          {
            w.e("MicroMsg.Notification.Queue", "notification item null when put");
            localObject1 = localBundle;
            label270:
            if (localObject1 != null) {
              b.rH().cancel(((NotificationItem)localObject1).id);
            }
            this.fKU = d.a(this.rC, paramg);
            if (localContext != null)
            {
              if (this.rC != null) {
                break label561;
              }
              w.e("MicroMsg.NotificationItem", "error, notify but mNotification == null");
            }
            i = this.id;
            GMTrace.o(520630566912L, 3879);
          }
        }
        else
        {
          localIterator = ((b)localObject1).iterator();
        }
      }
      finally {}
      for (;;)
      {
        Iterator localIterator;
        if (localIterator.hasNext())
        {
          localObject1 = (NotificationItem)localIterator.next();
          if ((localObject1 != null) && (((NotificationItem)localObject1).fKP != null) && (((NotificationItem)localObject1).fKP.equals(localObject3)))
          {
            break;
            if (this.id == -1)
            {
              w.e("MicroMsg.Notification.Queue", "notification id = -1(NotificationItem.INVALID_ID) when put");
              localObject1 = localBundle;
              break label270;
            }
            if (((b)localObject3).mark > 0)
            {
              if (((b)localObject3).mark == this.id)
              {
                w.d("MicroMsg.Notification.Queue", "remove mark: %d", new Object[] { Integer.valueOf(((b)localObject3).mark) });
                ((b)localObject3).remove(((b)localObject3).mark);
              }
              ((b)localObject3).mark = -1;
            }
            ((b)localObject3).remove(this.id);
            localObject1 = localObject2;
            if (((b)localObject3).size() >= 5) {
              localObject1 = ((b)localObject3).rI();
            }
            ((b)localObject3).fLb.d(this);
            ((b)localObject3).fLc.b(this);
            w.i("MicroMsg.Notification.Queue", "put item: %d, queuesize: %d", new Object[] { Integer.valueOf(this.id), Integer.valueOf(((b)localObject3).size()) });
            break label270;
            label561:
            paramg = ab.getContext();
            if (paramg == null)
            {
              w.e("MicroMsg.NotificationItem", "error, safeCheck but MMApplicationContext.getContext() == null");
              label577:
              w.i("MicroMsg.NotificationItem", "notificaiton.defaults: %d, notification.sound: %s, notification.vibrate: %s", new Object[] { Integer.valueOf(this.rC.defaults), this.rC.sound, g.a(this.rC.vibrate) });
            }
            for (;;)
            {
              try
              {
                if ((e.rP() == 1) && (this.rC.defaults != 2) && (this.rC.vibrate == null))
                {
                  this.rC.defaults = 0;
                  this.rC.sound = null;
                  w.i("MicroMsg.NotificationItem", "mode == vibrate & wechat shake is close, so notification switch to silent");
                }
                paramg = af.i(ab.getContext());
                j = this.id;
                localObject1 = this.rC;
                localBundle = y.a((Notification)localObject1);
                if ((localBundle == null) || (!localBundle.getBoolean("android.support.useSideChannel"))) {
                  continue;
                }
                i = 1;
                if (i == 0) {
                  continue;
                }
                paramg.a(new af.f(paramg.mContext.getPackageName(), j, null, (Notification)localObject1));
                af.sg.a(paramg.sd, null, j);
              }
              catch (Exception paramg)
              {
                int j;
                w.printErrStackTrace("MicroMsg.NotificationItem", paramg, "Notification Exception?", new Object[0]);
                continue;
              }
              if (this.fKQ == 0L) {
                break;
              }
              c.J(this.fKQ);
              break;
              if (this.rC == null)
              {
                w.e("MicroMsg.NotificationItem", "error, safeCheck but mNotification == null");
                break label577;
              }
              i = this.rC.icon;
              if (paramg.getResources().getDrawable(i) != null) {
                break label577;
              }
              this.rC.icon = R.g.icon;
              break label577;
              i = 0;
              continue;
              af.sg.a(paramg.sd, null, j, (Notification)localObject1);
            }
          }
        }
      }
      Object localObject1 = null;
    }
  }
  
  public final void clear()
  {
    try
    {
      GMTrace.i(520496349184L, 3878);
      if ((this.b != null) && (!this.b.isRecycled()))
      {
        w.i("MicroMsg.NotificationItem", "recycle bitmap:%s", new Object[] { this.b.toString() });
        this.b.recycle();
      }
      this.rC = null;
      this.b = null;
      this.fKO = null;
      GMTrace.o(520496349184L, 3878);
      return;
    }
    finally {}
  }
  
  public int describeContents()
  {
    GMTrace.i(520899002368L, 3881);
    GMTrace.o(520899002368L, 3881);
    return 0;
  }
  
  public String toString()
  {
    GMTrace.i(521167437824L, 3883);
    String str = "id: " + this.id + ",msgId: " + this.fKQ + ",userName: " + this.fKP + ",unreadCount: " + this.fKR;
    GMTrace.o(521167437824L, 3883);
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(521033220096L, 3882);
    paramParcel.writeInt(this.id);
    String str;
    if (this.fKP == null)
    {
      str = "";
      paramParcel.writeString(str);
      paramParcel.writeParcelable(this.b, 0);
      paramParcel.writeParcelable(this.rC, 0);
      paramParcel.writeParcelable(this.fKO, 0);
      if (!this.fKS) {
        break label109;
      }
    }
    label109:
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeLong(this.fKQ);
      paramParcel.writeInt(this.fKR);
      GMTrace.o(521033220096L, 3882);
      return;
      str = this.fKP;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\booter\notification\NotificationItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */