package com.tencent.b.a.a;

import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.System;
import java.lang.reflect.Method;

public class p
{
  private static volatile p aLa = null;
  private boolean aLb = false;
  private Context context = null;
  
  private p(Context paramContext)
  {
    this.context = paramContext.getApplicationContext();
    this.aLb = s.k(this.context, "android.permission.WRITE_SETTINGS");
    if (Build.VERSION.SDK_INT >= 23) {}
    try
    {
      paramContext = Settings.System.class.getDeclaredMethod("canWrite", new Class[] { Context.class });
      paramContext.setAccessible(true);
      this.aLb = ((Boolean)paramContext.invoke(null, new Object[] { this.context })).booleanValue();
      return;
    }
    catch (Exception paramContext) {}
  }
  
  public static p T(Context paramContext)
  {
    if (aLa == null) {}
    try
    {
      if (aLa == null) {
        aLa = new p(paramContext);
      }
      return aLa;
    }
    finally {}
  }
  
  public final boolean m(String paramString1, String paramString2)
  {
    if (this.aLb) {
      try
      {
        boolean bool = Settings.System.putString(this.context.getContentResolver(), paramString1, paramString2);
        return bool;
      }
      catch (Exception paramString1) {}
    }
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\b\a\a\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */