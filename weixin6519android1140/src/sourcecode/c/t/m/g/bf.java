package c.t.m.g;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public final class bf
{
  public String a = "";
  public int b = 0;
  public String c = "";
  public String d = "";
  public int e;
  
  public bf()
  {
    try
    {
      this.a = l.a().getPackageName();
      PackageInfo localPackageInfo = l.a().getPackageManager().getPackageInfo(this.a, 0);
      this.b = localPackageInfo.versionCode;
      this.c = localPackageInfo.versionName;
      this.e = l.b();
      this.d = "";
      return;
    }
    catch (Throwable localThrowable) {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */