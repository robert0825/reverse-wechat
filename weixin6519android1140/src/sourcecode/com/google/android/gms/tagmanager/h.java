package com.google.android.gms.tagmanager;

import android.os.Build.VERSION;

final class h
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
      new StringBuilder("Invalid version number: ").append(Build.VERSION.SDK);
      m.mo();
    }
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\tagmanager\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */