package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.analytics.AnalyticsService;

public final class m
  extends o
{
  public final w acG;
  
  public m(q paramq, r paramr)
  {
    super(paramq);
    com.google.android.gms.common.internal.w.aa(paramr);
    this.acG = paramr.c(paramq);
  }
  
  public final long a(s params)
  {
    iC();
    com.google.android.gms.common.internal.w.aa(params);
    q.iK();
    long l = this.acG.d(params);
    if (l == 0L) {
      this.acG.c(params);
    }
    return l;
  }
  
  public final void a(final ah paramah)
  {
    iC();
    this.ack.iF().c(new Runnable()
    {
      public final void run()
      {
        m.this.acG.b(paramah);
      }
    });
  }
  
  public final void c(final c paramc)
  {
    com.google.android.gms.common.internal.w.aa(paramc);
    iC();
    d("Hit delivery requested", paramc);
    this.ack.iF().c(new Runnable()
    {
      public final void run()
      {
        m.this.acG.c(paramc);
      }
    });
  }
  
  protected final void hS()
  {
    this.acG.iD();
  }
  
  public final void iv()
  {
    iC();
    Context localContext = this.ack.mContext;
    if ((AnalyticsReceiver.t(localContext)) && (AnalyticsService.u(localContext)))
    {
      Intent localIntent = new Intent(localContext, AnalyticsService.class);
      localIntent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
      localContext.startService(localIntent);
      return;
    }
    a(null);
  }
  
  public final void iw()
  {
    iC();
    com.google.android.gms.c.ah.iK();
    this.acG.iw();
  }
  
  final void ix()
  {
    q.iK();
    this.acG.ix();
  }
  
  final void onServiceConnected()
  {
    q.iK();
    this.acG.onServiceConnected();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */