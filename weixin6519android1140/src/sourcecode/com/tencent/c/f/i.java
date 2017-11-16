package com.tencent.c.f;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.tencent.c.e.a.a.a;

public final class i
{
  public static a bx(Context paramContext, String paramString)
  {
    a locala = new a();
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 64);
      locala.esM = paramString;
      locala.versionName = paramContext.versionName;
      locala.versionCode = paramContext.versionCode;
      return locala;
    }
    catch (Throwable paramContext) {}
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\f\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */