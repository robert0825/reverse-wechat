package com.google.android.gms.analytics.internal;

import com.google.android.gms.analytics.b;

@Deprecated
public final class e
{
  private static volatile b acf = new ad();
  
  public static void b(String paramString, Object paramObject)
  {
    int j = 0;
    f localf = f.ia();
    if (localf != null) {
      localf.f(paramString, paramObject);
    }
    for (;;)
    {
      paramString = acf;
      return;
      int i = j;
      if (acf != null)
      {
        i = j;
        if (acf.getLogLevel() <= 3) {
          i = 1;
        }
      }
      if (i != 0)
      {
        if (paramObject != null) {
          new StringBuilder().append(paramString).append(":").append(paramObject);
        }
        aj.aeq.get();
      }
    }
  }
  
  public static b hZ()
  {
    return acf;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */