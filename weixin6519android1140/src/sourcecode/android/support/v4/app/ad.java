package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.Notification.InboxStyle;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class ad
{
  private static final Object rT = new Object();
  private static Field rU;
  private static boolean rV;
  private static final Object rW = new Object();
  
  public static Bundle a(Notification paramNotification)
  {
    Object localObject1;
    Bundle localBundle;
    synchronized (rT)
    {
      if (rV) {
        return null;
      }
    }
  }
  
  public static void a(x paramx, CharSequence paramCharSequence1, boolean paramBoolean1, CharSequence paramCharSequence2, Bitmap paramBitmap1, Bitmap paramBitmap2, boolean paramBoolean2)
  {
    paramx = new Notification.BigPictureStyle(paramx.bj()).setBigContentTitle(paramCharSequence1).bigPicture(paramBitmap1);
    if (paramBoolean2) {
      paramx.bigLargeIcon(paramBitmap2);
    }
    if (paramBoolean1) {
      paramx.setSummaryText(paramCharSequence2);
    }
  }
  
  public static void a(x paramx, CharSequence paramCharSequence1, boolean paramBoolean, CharSequence paramCharSequence2, CharSequence paramCharSequence3)
  {
    paramx = new Notification.BigTextStyle(paramx.bj()).setBigContentTitle(paramCharSequence1).bigText(paramCharSequence3);
    if (paramBoolean) {
      paramx.setSummaryText(paramCharSequence2);
    }
  }
  
  public static void a(x paramx, CharSequence paramCharSequence1, boolean paramBoolean, CharSequence paramCharSequence2, ArrayList<CharSequence> paramArrayList)
  {
    paramx = new Notification.InboxStyle(paramx.bj()).setBigContentTitle(paramCharSequence1);
    if (paramBoolean) {
      paramx.setSummaryText(paramCharSequence2);
    }
    paramCharSequence1 = paramArrayList.iterator();
    while (paramCharSequence1.hasNext()) {
      paramx.addLine((CharSequence)paramCharSequence1.next());
    }
  }
  
  public static Bundle b(Notification.Builder paramBuilder, ab.a parama)
  {
    paramBuilder.addAction(parama.getIcon(), parama.getTitle(), parama.bk());
    paramBuilder = new Bundle(parama.getExtras());
    if (parama.bl() != null) {
      paramBuilder.putParcelableArray("android.support.remoteInputs", aj.b(parama.bl()));
    }
    return paramBuilder;
  }
  
  public static SparseArray<Bundle> f(List<Bundle> paramList)
  {
    Object localObject1 = null;
    int j = paramList.size();
    int i = 0;
    while (i < j)
    {
      Bundle localBundle = (Bundle)paramList.get(i);
      Object localObject2 = localObject1;
      if (localBundle != null)
      {
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new SparseArray();
        }
        ((SparseArray)localObject2).put(i, localBundle);
      }
      i += 1;
      localObject1 = localObject2;
    }
    return (SparseArray<Bundle>)localObject1;
  }
  
  public static final class a
    implements w, x
  {
    private final Bundle mExtras;
    private Notification.Builder rS;
    private List<Bundle> rX = new ArrayList();
    
    public a(Context paramContext, Notification paramNotification, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, RemoteViews paramRemoteViews, int paramInt1, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2, Bitmap paramBitmap, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, int paramInt4, CharSequence paramCharSequence4, boolean paramBoolean3, Bundle paramBundle, String paramString1, boolean paramBoolean4, String paramString2)
    {
      paramContext = new Notification.Builder(paramContext).setWhen(paramNotification.when).setSmallIcon(paramNotification.icon, paramNotification.iconLevel).setContent(paramNotification.contentView).setTicker(paramNotification.tickerText, paramRemoteViews).setSound(paramNotification.sound, paramNotification.audioStreamType).setVibrate(paramNotification.vibrate).setLights(paramNotification.ledARGB, paramNotification.ledOnMS, paramNotification.ledOffMS);
      boolean bool;
      if ((paramNotification.flags & 0x2) != 0)
      {
        bool = true;
        paramContext = paramContext.setOngoing(bool);
        if ((paramNotification.flags & 0x8) == 0) {
          break label337;
        }
        bool = true;
        label123:
        paramContext = paramContext.setOnlyAlertOnce(bool);
        if ((paramNotification.flags & 0x10) == 0) {
          break label343;
        }
        bool = true;
        label143:
        paramContext = paramContext.setAutoCancel(bool).setDefaults(paramNotification.defaults).setContentTitle(paramCharSequence1).setContentText(paramCharSequence2).setSubText(paramCharSequence4).setContentInfo(paramCharSequence3).setContentIntent(paramPendingIntent1).setDeleteIntent(paramNotification.deleteIntent);
        if ((paramNotification.flags & 0x80) == 0) {
          break label349;
        }
        bool = true;
        label202:
        this.rS = paramContext.setFullScreenIntent(paramPendingIntent2, bool).setLargeIcon(paramBitmap).setNumber(paramInt1).setUsesChronometer(paramBoolean2).setPriority(paramInt4).setProgress(paramInt2, paramInt3, paramBoolean1);
        this.mExtras = new Bundle();
        if (paramBundle != null) {
          this.mExtras.putAll(paramBundle);
        }
        if (paramBoolean3) {
          this.mExtras.putBoolean("android.support.localOnly", true);
        }
        if (paramString1 != null)
        {
          this.mExtras.putString("android.support.groupKey", paramString1);
          if (!paramBoolean4) {
            break label355;
          }
          this.mExtras.putBoolean("android.support.isGroupSummary", true);
        }
      }
      for (;;)
      {
        if (paramString2 != null) {
          this.mExtras.putString("android.support.sortKey", paramString2);
        }
        return;
        bool = false;
        break;
        label337:
        bool = false;
        break label123;
        label343:
        bool = false;
        break label143;
        label349:
        bool = false;
        break label202;
        label355:
        this.mExtras.putBoolean("android.support.useSideChannel", true);
      }
    }
    
    public final void a(ab.a parama)
    {
      this.rX.add(ad.b(this.rS, parama));
    }
    
    public final Notification.Builder bj()
    {
      return this.rS;
    }
    
    public final Notification build()
    {
      Notification localNotification = this.rS.build();
      Object localObject = ad.a(localNotification);
      Bundle localBundle = new Bundle(this.mExtras);
      Iterator localIterator = this.mExtras.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (((Bundle)localObject).containsKey(str)) {
          localBundle.remove(str);
        }
      }
      ((Bundle)localObject).putAll(localBundle);
      localObject = ad.f(this.rX);
      if (localObject != null) {
        ad.a(localNotification).putSparseParcelableArray("android.support.actionExtras", (SparseArray)localObject);
      }
      return localNotification;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\app\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */