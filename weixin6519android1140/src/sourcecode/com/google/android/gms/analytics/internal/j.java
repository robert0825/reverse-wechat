package com.google.android.gms.analytics.internal;

import com.google.android.gms.c.v;
import com.google.android.gms.common.internal.w;

final class j
{
  long acA;
  private final v acz;
  
  public j(v paramv)
  {
    w.aa(paramv);
    this.acz = paramv;
  }
  
  public j(v paramv, long paramLong)
  {
    w.aa(paramv);
    this.acz = paramv;
    this.acA = paramLong;
  }
  
  public final boolean i(long paramLong)
  {
    if (this.acA == 0L) {}
    while (this.acz.elapsedRealtime() - this.acA > paramLong) {
      return true;
    }
    return false;
  }
  
  public final void start()
  {
    this.acA = this.acz.elapsedRealtime();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */