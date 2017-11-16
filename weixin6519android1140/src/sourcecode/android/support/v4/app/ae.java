package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;

final class ae
{
  public static final class a
    implements w, x
  {
    private Bundle mExtras;
    private Notification.Builder rS;
    private List<Bundle> rX = new ArrayList();
    
    public a(Context paramContext, Notification paramNotification, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, RemoteViews paramRemoteViews, int paramInt1, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2, Bitmap paramBitmap, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt4, CharSequence paramCharSequence4, boolean paramBoolean4, ArrayList<String> paramArrayList, Bundle paramBundle, String paramString1, boolean paramBoolean5, String paramString2)
    {
      paramContext = new Notification.Builder(paramContext).setWhen(paramNotification.when).setShowWhen(paramBoolean2).setSmallIcon(paramNotification.icon, paramNotification.iconLevel).setContent(paramNotification.contentView).setTicker(paramNotification.tickerText, paramRemoteViews).setSound(paramNotification.sound, paramNotification.audioStreamType).setVibrate(paramNotification.vibrate).setLights(paramNotification.ledARGB, paramNotification.ledOnMS, paramNotification.ledOffMS);
      if ((paramNotification.flags & 0x2) != 0)
      {
        paramBoolean2 = true;
        paramContext = paramContext.setOngoing(paramBoolean2);
        if ((paramNotification.flags & 0x8) == 0) {
          break label380;
        }
        paramBoolean2 = true;
        label128:
        paramContext = paramContext.setOnlyAlertOnce(paramBoolean2);
        if ((paramNotification.flags & 0x10) == 0) {
          break label386;
        }
        paramBoolean2 = true;
        label148:
        paramContext = paramContext.setAutoCancel(paramBoolean2).setDefaults(paramNotification.defaults).setContentTitle(paramCharSequence1).setContentText(paramCharSequence2).setSubText(paramCharSequence4).setContentInfo(paramCharSequence3).setContentIntent(paramPendingIntent1).setDeleteIntent(paramNotification.deleteIntent);
        if ((paramNotification.flags & 0x80) == 0) {
          break label392;
        }
        paramBoolean2 = true;
        label207:
        this.rS = paramContext.setFullScreenIntent(paramPendingIntent2, paramBoolean2).setLargeIcon(paramBitmap).setNumber(paramInt1).setUsesChronometer(paramBoolean3).setPriority(paramInt4).setProgress(paramInt2, paramInt3, paramBoolean1);
        this.mExtras = new Bundle();
        if (paramBundle != null) {
          this.mExtras.putAll(paramBundle);
        }
        if ((paramArrayList != null) && (!paramArrayList.isEmpty())) {
          this.mExtras.putStringArray("android.people", (String[])paramArrayList.toArray(new String[paramArrayList.size()]));
        }
        if (paramBoolean4) {
          this.mExtras.putBoolean("android.support.localOnly", true);
        }
        if (paramString1 != null)
        {
          this.mExtras.putString("android.support.groupKey", paramString1);
          if (!paramBoolean5) {
            break label398;
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
        paramBoolean2 = false;
        break;
        label380:
        paramBoolean2 = false;
        break label128;
        label386:
        paramBoolean2 = false;
        break label148;
        label392:
        paramBoolean2 = false;
        break label207;
        label398:
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
      SparseArray localSparseArray = ad.f(this.rX);
      if (localSparseArray != null) {
        this.mExtras.putSparseParcelableArray("android.support.actionExtras", localSparseArray);
      }
      this.rS.setExtras(this.mExtras);
      return this.rS.build();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\app\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */