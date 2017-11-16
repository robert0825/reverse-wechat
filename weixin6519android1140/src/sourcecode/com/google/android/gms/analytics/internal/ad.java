package com.google.android.gms.analytics.internal;

import com.google.android.gms.analytics.b;

final class ad
  implements b
{
  private int acD = 2;
  private boolean aef;
  
  public final int getLogLevel()
  {
    return this.acD;
  }
  
  public final void setLogLevel(int paramInt)
  {
    this.acD = paramInt;
    if (!this.aef)
    {
      aj.aeq.get();
      new StringBuilder("Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.").append((String)aj.aeq.get()).append(" DEBUG");
      this.aef = true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */