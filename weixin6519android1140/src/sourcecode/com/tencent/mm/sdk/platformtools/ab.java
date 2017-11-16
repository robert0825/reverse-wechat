package com.tencent.mm.sdk.platformtools;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.tencent.gmtrace.GMTrace;
import java.util.Iterator;
import java.util.List;

public final class ab
{
  private static Context context;
  private static String esM;
  private static Resources mResources;
  private static String processName;
  private static String vik;
  private static String vil;
  private static boolean vim;
  public static boolean vin;
  private static ActivityManager vio;
  
  static
  {
    GMTrace.i(14001996038144L, 104323);
    context = null;
    vik = "com.tencent.mm";
    esM = "com.tencent.mm";
    vil = "com.tencent.mm.ui.LauncherUI";
    processName = esM;
    vim = false;
    vin = false;
    mResources = null;
    vio = null;
    GMTrace.o(14001996038144L, 104323);
  }
  
  public static void RQ(String paramString)
  {
    GMTrace.i(14000788078592L, 104314);
    processName = paramString;
    GMTrace.o(14000788078592L, 104314);
  }
  
  private static boolean RR(String paramString)
  {
    GMTrace.i(14001593384960L, 104320);
    if ((context == null) || (esM == null))
    {
      GMTrace.o(14001593384960L, 104320);
      return false;
    }
    if (vio == null) {
      vio = (ActivityManager)context.getSystemService("activity");
    }
    try
    {
      Iterator localIterator = vio.getRunningAppProcesses().iterator();
      while (localIterator.hasNext())
      {
        boolean bool = ((ActivityManager.RunningAppProcessInfo)localIterator.next()).processName.equals(paramString);
        if (bool)
        {
          GMTrace.o(14001593384960L, 104320);
          return true;
        }
      }
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.MMApplicationContext", "isMMProcessExist Exception: " + paramString.toString());
      GMTrace.o(14001593384960L, 104320);
      return false;
    }
    catch (Error paramString)
    {
      w.e("MicroMsg.MMApplicationContext", "isMMProcessExist Error: " + paramString.toString());
      GMTrace.o(14001593384960L, 104320);
      return false;
    }
    GMTrace.o(14001593384960L, 104320);
    return false;
  }
  
  public static void a(Resources paramResources)
  {
    GMTrace.i(14001861820416L, 104322);
    mResources = paramResources;
    GMTrace.o(14001861820416L, 104322);
  }
  
  public static boolean bPR()
  {
    GMTrace.i(13999043248128L, 104301);
    boolean bool = vim;
    GMTrace.o(13999043248128L, 104301);
    return bool;
  }
  
  public static String bPS()
  {
    GMTrace.i(13999177465856L, 104302);
    String str = vil;
    GMTrace.o(13999177465856L, 104302);
    return str;
  }
  
  public static String bPT()
  {
    GMTrace.i(13999714336768L, 104306);
    String str = vik;
    GMTrace.o(13999714336768L, 104306);
    return str;
  }
  
  public static String bPU()
  {
    GMTrace.i(13999848554496L, 104307);
    String str = esM + "_preferences";
    GMTrace.o(13999848554496L, 104307);
    return str;
  }
  
  public static SharedPreferences bPV()
  {
    GMTrace.i(14000116989952L, 104309);
    if (context != null)
    {
      SharedPreferences localSharedPreferences = context.getSharedPreferences(bPU(), 0);
      GMTrace.o(14000116989952L, 104309);
      return localSharedPreferences;
    }
    GMTrace.o(14000116989952L, 104309);
    return null;
  }
  
  public static SharedPreferences bPW()
  {
    GMTrace.i(14000251207680L, 104310);
    if (context != null)
    {
      SharedPreferences localSharedPreferences = context.getSharedPreferences(esM + "_preferences_tools", 0);
      GMTrace.o(14000251207680L, 104310);
      return localSharedPreferences;
    }
    GMTrace.o(14000251207680L, 104310);
    return null;
  }
  
  public static String bPX()
  {
    GMTrace.i(14000519643136L, 104312);
    String str = esM + "_tmp_preferences";
    GMTrace.o(14000519643136L, 104312);
    return str;
  }
  
  public static boolean bPY()
  {
    GMTrace.i(14000922296320L, 104315);
    String str2 = processName;
    String str1;
    if (str2 != null)
    {
      str1 = str2;
      if (str2.length() != 0) {}
    }
    else
    {
      str1 = esM;
    }
    boolean bool = esM.equals(str1);
    GMTrace.o(14000922296320L, 104315);
    return bool;
  }
  
  public static boolean bPZ()
  {
    GMTrace.i(14001056514048L, 104316);
    String str2 = processName;
    String str1;
    if (str2 != null)
    {
      str1 = str2;
      if (str2.length() != 0) {}
    }
    else
    {
      str1 = esM;
    }
    boolean bool = "com.tencent.mm:push".equalsIgnoreCase(str1);
    GMTrace.o(14001056514048L, 104316);
    return bool;
  }
  
  public static boolean bQa()
  {
    GMTrace.i(14001190731776L, 104317);
    String str2 = processName;
    String str1;
    if (str2 != null)
    {
      str1 = str2;
      if (str2.length() != 0) {}
    }
    else
    {
      str1 = esM;
    }
    boolean bool = "com.tencent.mm:tools".equalsIgnoreCase(str1);
    GMTrace.o(14001190731776L, 104317);
    return bool;
  }
  
  public static boolean bQb()
  {
    GMTrace.i(14001324949504L, 104318);
    String str2 = processName;
    String str1;
    if (str2 != null)
    {
      str1 = str2;
      if (str2.length() != 0) {}
    }
    else
    {
      str1 = esM;
    }
    boolean bool = "com.tencent.mm:exdevice".equalsIgnoreCase(str1);
    GMTrace.o(14001324949504L, 104318);
    return bool;
  }
  
  public static boolean bQc()
  {
    GMTrace.i(14001459167232L, 104319);
    boolean bool = RR(esM);
    GMTrace.o(14001459167232L, 104319);
    return bool;
  }
  
  public static Context getContext()
  {
    GMTrace.i(13999445901312L, 104304);
    Context localContext = context;
    GMTrace.o(13999445901312L, 104304);
    return localContext;
  }
  
  public static String getPackageName()
  {
    GMTrace.i(13999580119040L, 104305);
    String str = esM;
    GMTrace.o(13999580119040L, 104305);
    return str;
  }
  
  public static Resources getResources()
  {
    GMTrace.i(14001727602688L, 104321);
    Resources localResources = mResources;
    GMTrace.o(14001727602688L, 104321);
    return localResources;
  }
  
  public static void kE(boolean paramBoolean)
  {
    GMTrace.i(13998909030400L, 104300);
    vim = paramBoolean;
    GMTrace.o(13998909030400L, 104300);
  }
  
  public static void setContext(Context paramContext)
  {
    GMTrace.i(13999311683584L, 104303);
    context = paramContext;
    esM = paramContext.getPackageName();
    w.d("MicroMsg.MMApplicationContext", "setup application context for package: " + esM);
    GMTrace.o(13999311683584L, 104303);
  }
  
  public static String vM()
  {
    GMTrace.i(14000653860864L, 104313);
    String str = processName;
    GMTrace.o(14000653860864L, 104313);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */