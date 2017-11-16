package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.SparseArray;

public abstract class WakefulBroadcastReceiver
  extends BroadcastReceiver
{
  private static final SparseArray<PowerManager.WakeLock> sW = new SparseArray();
  private static int sX = 1;
  
  public static ComponentName a(Context paramContext, Intent paramIntent)
  {
    synchronized (sW)
    {
      int i = sX;
      int j = sX + 1;
      sX = j;
      if (j <= 0) {
        sX = 1;
      }
      paramIntent.putExtra("android.support.content.wakelockid", i);
      paramIntent = paramContext.startService(paramIntent);
      if (paramIntent == null) {
        return null;
      }
      paramContext = ((PowerManager)paramContext.getSystemService("power")).newWakeLock(1, "wake:" + paramIntent.flattenToShortString());
      paramContext.setReferenceCounted(false);
      paramContext.acquire(60000L);
      sW.put(i, paramContext);
      return paramIntent;
    }
  }
  
  public static boolean b(Intent arg0)
  {
    int i = ???.getIntExtra("android.support.content.wakelockid", 0);
    if (i == 0) {
      return false;
    }
    synchronized (sW)
    {
      PowerManager.WakeLock localWakeLock = (PowerManager.WakeLock)sW.get(i);
      if (localWakeLock != null)
      {
        localWakeLock.release();
        sW.remove(i);
        return true;
      }
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\android\support\v4\content\WakefulBroadcastReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */