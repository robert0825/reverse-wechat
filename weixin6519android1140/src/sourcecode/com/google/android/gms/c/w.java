package com.google.android.gms.c;

import android.os.SystemClock;

public final class w
  implements v
{
  private static w auK;
  
  public static v lt()
  {
    try
    {
      if (auK == null) {
        auK = new w();
      }
      w localw = auK;
      return localw;
    }
    finally {}
  }
  
  public final long currentTimeMillis()
  {
    return System.currentTimeMillis();
  }
  
  public final long elapsedRealtime()
  {
    return SystemClock.elapsedRealtime();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\c\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */