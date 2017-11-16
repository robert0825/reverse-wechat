package com.google.android.gms.analytics.internal;

import android.os.Build.VERSION;

public final class ai
{
  public static int version()
  {
    try
    {
      int i = Integer.parseInt(Build.VERSION.SDK);
      return i;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      e.b("Invalid version number", Build.VERSION.SDK);
    }
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */