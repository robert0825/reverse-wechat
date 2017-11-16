package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.c.j;
import com.google.android.gms.c.u;
import com.google.android.gms.c.z;
import java.util.List;

public final class h
{
  private static String TAG = "WakeLockTracker";
  private static final ComponentName amJ = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
  private static Integer amL;
  private static h anc = new h();
  private static IntentFilter and = new IntentFilter("android.intent.action.BATTERY_CHANGED");
  
  public static void a(Context paramContext, String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, List<String> paramList)
  {
    if (amL == null) {
      amL = Integer.valueOf(getLogLevel());
    }
    int i;
    if (amL.intValue() != d.LOG_LEVEL_OFF)
    {
      i = 1;
      if (i != 0) {
        break label42;
      }
    }
    label42:
    long l1;
    do
    {
      do
      {
        return;
        i = 0;
        break;
      } while (TextUtils.isEmpty(paramString1));
      l1 = System.currentTimeMillis();
    } while ((7 != paramInt1) && (8 != paramInt1) && (10 != paramInt1) && (11 != paramInt1));
    long l2 = SystemClock.elapsedRealtime();
    Object localObject1 = paramContext.getApplicationContext().registerReceiver(null, and);
    label115:
    boolean bool;
    if (localObject1 == null)
    {
      i = 0;
      if ((i & 0x7) == 0) {
        break label300;
      }
      j = 1;
      if (!z.cf(20)) {
        break label306;
      }
      bool = ((PowerManager)paramContext.getSystemService("power")).isInteractive();
      label137:
      if (!bool) {
        break label323;
      }
      i = 1;
      label145:
      if (j == 0) {
        break label329;
      }
    }
    label300:
    label306:
    label323:
    label329:
    for (int j = 1;; j = 0)
    {
      localObject1 = paramContext.getPackageName();
      Object localObject2 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
      localObject2 = paramContext.getApplicationContext().registerReceiver(null, (IntentFilter)localObject2);
      float f = NaN.0F;
      if (localObject2 != null)
      {
        int k = ((Intent)localObject2).getIntExtra("level", -1);
        int m = ((Intent)localObject2).getIntExtra("scale", -1);
        f = k / m;
      }
      paramString1 = new WakeLockEvent(l1, paramInt1, paramString2, paramInt2, paramList, paramString1, l2, i << 1 | j, paramString3, (String)localObject1, f);
      try
      {
        paramContext.startService(new Intent().setComponent(amJ).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", paramString1));
        return;
      }
      catch (Exception paramContext)
      {
        Log.wtf(TAG, paramContext);
        return;
      }
      i = ((Intent)localObject1).getIntExtra("plugged", 0);
      break;
      j = 0;
      break label115;
      bool = ((PowerManager)paramContext.getSystemService("power")).isScreenOn();
      break label137;
      i = 0;
      break label145;
    }
  }
  
  private static int getLogLevel()
  {
    try
    {
      if (u.ls()) {
        return ((Integer)c.b.amN.get()).intValue();
      }
      int i = d.LOG_LEVEL_OFF;
      return i;
    }
    catch (SecurityException localSecurityException) {}
    return d.LOG_LEVEL_OFF;
  }
  
  public static h kV()
  {
    return anc;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\common\stats\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */