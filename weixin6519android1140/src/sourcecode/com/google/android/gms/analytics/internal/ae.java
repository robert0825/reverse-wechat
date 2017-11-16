package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.c.ah;
import com.google.android.gms.c.v;
import com.google.android.gms.common.internal.w;

abstract class ae
{
  private static volatile Handler aeg;
  public final q ack;
  final Runnable aeh;
  public volatile long aei;
  public boolean aej;
  
  ae(q paramq)
  {
    w.aa(paramq);
    this.ack = paramq;
    this.aeh = new Runnable()
    {
      public final void run()
      {
        if (Looper.myLooper() == Looper.getMainLooper()) {
          ae.this.ack.iF().c(this);
        }
        boolean bool;
        do
        {
          return;
          bool = ae.this.jt();
          ae.this.aei = 0L;
        } while ((!bool) || (ae.this.aej));
        ae.this.run();
      }
    };
  }
  
  public final void cancel()
  {
    this.aei = 0L;
    getHandler().removeCallbacks(this.aeh);
  }
  
  final Handler getHandler()
  {
    if (aeg != null) {
      return aeg;
    }
    try
    {
      if (aeg == null) {
        aeg = new Handler(this.ack.mContext.getMainLooper());
      }
      Handler localHandler = aeg;
      return localHandler;
    }
    finally {}
  }
  
  public final boolean jt()
  {
    return this.aei != 0L;
  }
  
  public final void m(long paramLong)
  {
    cancel();
    if (paramLong >= 0L)
    {
      this.aei = this.ack.acz.currentTimeMillis();
      if (!getHandler().postDelayed(this.aeh, paramLong)) {
        this.ack.iE().f("Failed to schedule delayed post. time", Long.valueOf(paramLong));
      }
    }
  }
  
  public abstract void run();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */