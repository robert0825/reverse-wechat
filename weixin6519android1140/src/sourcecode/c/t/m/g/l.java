package c.t.m.g;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;

public final class l
{
  public static String a;
  public static String b;
  public static String c;
  public static String d;
  public static boolean e = true;
  public static boolean f;
  private static Context g = null;
  private static String h;
  private static long i;
  private static int j = 0;
  private static boolean k = false;
  private static String l = "";
  private static String m;
  private static String n;
  private static boolean o;
  private static String p;
  private static Handler q;
  private static volatile boolean r;
  
  static
  {
    a = "null";
    b = "";
    c = "";
    d = "";
    m = "3.4.0.7";
    n = "";
    o = false;
    p = "";
    r = false;
  }
  
  public static Context a()
  {
    return g;
  }
  
  public static void a(int paramInt, boolean paramBoolean, Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    i = SystemClock.elapsedRealtime();
    g = paramContext.getApplicationContext();
    l = paramContext.getPackageName();
    j = paramInt;
    k = paramBoolean;
    String str = paramString1;
    if (ce.a(paramString1)) {
      str = "";
    }
    c = str;
    paramString1 = paramString2;
    if (ce.a(paramString2)) {
      paramString1 = "";
    }
    d = paramString1;
    m = "3.4.0.7";
    new Handler(g.getMainLooper());
    try
    {
      paramString1 = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0);
      a = paramString1.versionName;
      paramInt = paramString1.versionCode;
      b = paramString1.applicationInfo.loadLabel(paramContext.getPackageManager()).toString();
      n = paramString3;
      o = l.equals(n);
      h = ce.d();
      paramContext = new HandlerThread("HalleyTempTaskThread");
      paramContext.start();
      q = new Handler(paramContext.getLooper());
      o.a();
      return;
    }
    catch (Throwable paramContext)
    {
      for (;;) {}
    }
  }
  
  public static int b()
  {
    return j;
  }
  
  public static String c()
  {
    return h;
  }
  
  public static int d()
  {
    return (int)(SystemClock.elapsedRealtime() - i);
  }
  
  public static String e()
  {
    return l;
  }
  
  public static boolean f()
  {
    return k;
  }
  
  public static String g()
  {
    return m;
  }
  
  public static boolean h()
  {
    return o;
  }
  
  public static String i()
  {
    if (!TextUtils.isEmpty(p)) {
      return p;
    }
    if ((!TextUtils.isEmpty(n)) && (n.contains(":")))
    {
      int i1 = n.indexOf(":");
      return n.substring(i1 + 1);
    }
    return "";
  }
  
  public static Handler j()
  {
    return q;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */