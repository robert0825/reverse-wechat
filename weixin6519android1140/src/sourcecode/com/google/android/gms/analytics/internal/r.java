package com.google.android.gms.analytics.internal;

import android.content.Context;

public final class r
{
  final Context adf;
  final Context adg;
  
  public r(Context paramContext)
  {
    com.google.android.gms.common.internal.w.aa(paramContext);
    paramContext = paramContext.getApplicationContext();
    com.google.android.gms.common.internal.w.j(paramContext, "Application context can't be null");
    this.adf = paramContext;
    this.adg = paramContext;
  }
  
  protected static y a(q paramq)
  {
    return new y(paramq);
  }
  
  protected static ac b(q paramq)
  {
    return new ac(paramq);
  }
  
  public static t d(q paramq)
  {
    return new t(paramq);
  }
  
  public static ag e(q paramq)
  {
    return new ag(paramq);
  }
  
  public static i f(q paramq)
  {
    return new i(paramq);
  }
  
  final w c(q paramq)
  {
    return new w(paramq, this);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */