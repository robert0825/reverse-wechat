package com.google.android.gms.analytics.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.c.v;
import com.google.android.gms.common.internal.w;

public final class ag
  extends o
{
  boolean ael;
  boolean aem;
  private AlarmManager aen = (AlarmManager)this.ack.mContext.getSystemService("alarm");
  
  protected ag(q paramq)
  {
    super(paramq);
  }
  
  private PendingIntent jw()
  {
    Intent localIntent = new Intent(this.ack.mContext, AnalyticsReceiver.class);
    localIntent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
    return PendingIntent.getBroadcast(this.ack.mContext, 0, localIntent, 0);
  }
  
  public final void cancel()
  {
    iC();
    this.aem = false;
    this.aen.cancel(jw());
  }
  
  protected final void hS()
  {
    try
    {
      this.aen.cancel(jw());
      if (ac.jl() > 0L)
      {
        ActivityInfo localActivityInfo = this.ack.mContext.getPackageManager().getReceiverInfo(new ComponentName(this.ack.mContext, AnalyticsReceiver.class), 2);
        if ((localActivityInfo != null) && (localActivityInfo.enabled))
        {
          N("Receiver registered. Using alarm for local dispatch.");
          this.ael = true;
        }
      }
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
  }
  
  public final void jv()
  {
    iC();
    w.b(this.ael, "Receiver not registered");
    long l1 = ac.jl();
    if (l1 > 0L)
    {
      cancel();
      long l2 = this.ack.acz.elapsedRealtime();
      this.aem = true;
      this.aen.setInexactRepeating(2, l2 + l1, 0L, jw());
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */