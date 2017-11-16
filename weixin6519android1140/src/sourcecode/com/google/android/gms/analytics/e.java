package com.google.android.gms.analytics;

public final class e
{
  static String f(String paramString, int paramInt)
  {
    if (paramInt <= 0)
    {
      com.google.android.gms.analytics.internal.e.b("index out of range for prefix", paramString);
      return "";
    }
    return paramString + paramInt;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */