package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.internal.k;
import com.google.android.gms.analytics.internal.q;
import com.google.android.gms.c.as;
import com.google.android.gms.common.internal.w;

public final class AnalyticsReceiver
  extends BroadcastReceiver
{
  static Object abs = new Object();
  static as abt;
  static Boolean abu;
  
  public static boolean t(Context paramContext)
  {
    w.aa(paramContext);
    if (abu != null) {
      return abu.booleanValue();
    }
    boolean bool = k.a(paramContext, AnalyticsReceiver.class, false);
    abu = Boolean.valueOf(bool);
    return bool;
  }
  
  public final void onReceive(Context paramContext, Intent arg2)
  {
    localf = q.v(paramContext).iE();
    ??? = ???.getAction();
    if (com.google.android.gms.common.internal.f.akn) {
      localf.c("Device AnalyticsReceiver got", ???);
    }
    for (;;)
    {
      boolean bool;
      Intent localIntent;
      if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(???))
      {
        bool = AnalyticsService.u(paramContext);
        localIntent = new Intent(paramContext, AnalyticsService.class);
        localIntent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
      }
      synchronized (abs)
      {
        paramContext.startService(localIntent);
        if (!bool)
        {
          return;
          localf.c("Local AnalyticsReceiver got", ???);
          continue;
        }
        try
        {
          if (abt == null)
          {
            paramContext = new as(paramContext, "Analytics WakeLock");
            abt = paramContext;
            paramContext.lG();
          }
          abt.lF();
        }
        catch (SecurityException paramContext)
        {
          for (;;)
          {
            localf.Q("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
          }
        }
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\AnalyticsReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */