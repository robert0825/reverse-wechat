package com.google.android.gms.common.stats;

import android.os.SystemClock;
import android.support.v4.e.j;

public final class e
{
  private final long amZ;
  private final int ana;
  private final j<String, Long> anb;
  
  public e()
  {
    this.amZ = 60000L;
    this.ana = 10;
    this.anb = new j(10);
  }
  
  public e(long paramLong)
  {
    this.amZ = paramLong;
    this.ana = 1024;
    this.anb = new j();
  }
  
  public final Long aj(String paramString)
  {
    long l2 = SystemClock.elapsedRealtime();
    long l1 = this.amZ;
    for (;;)
    {
      int i;
      try
      {
        if (this.anb.size() >= this.ana)
        {
          i = this.anb.size() - 1;
          if (i >= 0)
          {
            if (l2 - ((Long)this.anb.valueAt(i)).longValue() > l1) {
              this.anb.removeAt(i);
            }
          }
          else
          {
            l1 /= 2L;
            new StringBuilder("The max capacity ").append(this.ana).append(" is not enough. Current durationThreshold is: ").append(l1);
          }
        }
        else
        {
          paramString = (Long)this.anb.put(paramString, Long.valueOf(l2));
          return paramString;
        }
      }
      finally {}
      i -= 1;
    }
  }
  
  public final boolean ak(String paramString)
  {
    for (;;)
    {
      try
      {
        if (this.anb.remove(paramString) != null)
        {
          bool = true;
          return bool;
        }
      }
      finally {}
      boolean bool = false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\stats\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */