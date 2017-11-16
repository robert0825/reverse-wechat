package com.tencent.b.a.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Locale;
import java.util.TimeZone;

final class b
{
  static a aKt;
  Integer aKu = null;
  String aKv = null;
  
  public b(Context paramContext)
  {
    try
    {
      R(paramContext);
      TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
      if (localTelephonyManager != null) {
        this.aKu = Integer.valueOf(localTelephonyManager.getNetworkType());
      }
      this.aKv = s.ac(paramContext);
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  private static a R(Context paramContext)
  {
    try
    {
      if (aKt == null) {
        aKt = new a(paramContext.getApplicationContext());
      }
      paramContext = aKt;
      return paramContext;
    }
    finally {}
  }
  
  static final class a
  {
    String aKA = Build.MANUFACTURER;
    String aKB = Locale.getDefault().getLanguage();
    String aKC = "WX";
    String aKD;
    String aKE;
    int aKF = 0;
    String aKG = null;
    String aKH = null;
    String aKw;
    String aKx = "2.21";
    DisplayMetrics aKy;
    int aKz = Build.VERSION.SDK_INT;
    Context ctx = null;
    String imsi;
    String model = Build.MODEL;
    String packageName = null;
    String timezone;
    
    public a(Context paramContext)
    {
      this.ctx = paramContext.getApplicationContext();
      try
      {
        this.aKw = this.ctx.getPackageManager().getPackageInfo(this.ctx.getPackageName(), 0).versionName;
        this.aKy = new DisplayMetrics();
        ((WindowManager)this.ctx.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(this.aKy);
        if (s.k(paramContext, "android.permission.READ_PHONE_STATE"))
        {
          paramContext = (TelephonyManager)paramContext.getSystemService("phone");
          if (paramContext != null)
          {
            this.aKD = paramContext.getSimOperator();
            this.imsi = paramContext.getSubscriberId();
          }
        }
        this.timezone = TimeZone.getDefault().getID();
        this.aKE = s.ab(this.ctx);
        this.packageName = this.ctx.getPackageName();
        this.aKH = s.or();
        return;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\b\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */