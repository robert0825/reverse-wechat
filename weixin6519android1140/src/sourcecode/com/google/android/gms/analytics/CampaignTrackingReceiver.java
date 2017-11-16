package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.k;
import com.google.android.gms.analytics.internal.q;
import com.google.android.gms.c.as;
import com.google.android.gms.common.internal.w;

public class CampaignTrackingReceiver
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
    boolean bool = k.a(paramContext, CampaignTrackingReceiver.class, true);
    abu = Boolean.valueOf(bool);
    return bool;
  }
  
  public void F(String paramString) {}
  
  public Class<? extends CampaignTrackingService> hQ()
  {
    return CampaignTrackingService.class;
  }
  
  public void onReceive(Context paramContext, Intent arg2)
  {
    localf = q.v(paramContext).iE();
    String str = ???.getStringExtra("referrer");
    ??? = ???.getAction();
    localf.c("CampaignTrackingReceiver received", ???);
    if ((!"com.android.vending.INSTALL_REFERRER".equals(???)) || (TextUtils.isEmpty(str)))
    {
      localf.Q("CampaignTrackingReceiver received unexpected intent without referrer extra");
      return;
    }
    boolean bool = CampaignTrackingService.u(paramContext);
    if (!bool) {
      localf.Q("CampaignTrackingService not registered or disabled. Installation tracking not possible. See http://goo.gl/8Rd3yj for instructions.");
    }
    F(str);
    if (com.google.android.gms.common.internal.f.akn)
    {
      localf.R("Received unexpected installation campaign on package side");
      return;
    }
    ??? = hQ();
    w.aa(???);
    Intent localIntent = new Intent(paramContext, ???);
    localIntent.putExtra("referrer", str);
    synchronized (abs)
    {
      paramContext.startService(localIntent);
      if (!bool) {
        return;
      }
    }
    try
    {
      if (abt == null)
      {
        paramContext = new as(paramContext, "Analytics campaign WakeLock");
        abt = paramContext;
        paramContext.lG();
      }
      abt.lF();
    }
    catch (SecurityException paramContext)
    {
      for (;;)
      {
        localf.Q("CampaignTrackingService service at risk of not starting. For more reliable installation campaign reports, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\CampaignTrackingReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */