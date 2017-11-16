package com.tencent.mm.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.gmtrace.GMTrace;

public final class f
{
  public static int ai(Context paramContext)
  {
    GMTrace.i(14014209851392L, 104414);
    if (paramContext == null)
    {
      GMTrace.o(14014209851392L, 104414);
      return 0;
    }
    try
    {
      int i = paramContext.getSharedPreferences("crash_status_file", 4).getInt("channel", -1);
      GMTrace.o(14014209851392L, 104414);
      return i;
    }
    catch (Throwable paramContext)
    {
      GMTrace.o(14014209851392L, 104414);
    }
    return 0;
  }
  
  public static int aj(Context paramContext)
  {
    GMTrace.i(14014344069120L, 104415);
    if (paramContext == null)
    {
      GMTrace.o(14014344069120L, 104415);
      return 0;
    }
    try
    {
      int i = paramContext.getSharedPreferences("crash_status_file", 4).getInt("googleplaysizelimit", 3072);
      GMTrace.o(14014344069120L, 104415);
      return i;
    }
    catch (Throwable paramContext)
    {
      GMTrace.o(14014344069120L, 104415);
    }
    return 0;
  }
  
  public static void e(Context paramContext, String paramString1, String paramString2)
  {
    GMTrace.i(14014478286848L, 104416);
    try
    {
      Object localObject = paramContext.getSharedPreferences("crash_status_file", 4);
      paramContext = ((SharedPreferences)localObject).getString("crashlist", "");
      localObject = ((SharedPreferences)localObject).edit();
      ((SharedPreferences.Editor)localObject).putString("crashlist", paramContext + ";" + paramString1 + "," + paramString2);
      ((SharedPreferences.Editor)localObject).commit();
      GMTrace.o(14014478286848L, 104416);
      return;
    }
    catch (Throwable paramContext)
    {
      GMTrace.o(14014478286848L, 104416);
    }
  }
  
  public static abstract interface a
  {
    public abstract void cZ(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\app\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */