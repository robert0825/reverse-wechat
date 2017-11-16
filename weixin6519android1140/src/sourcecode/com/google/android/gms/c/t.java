package com.google.android.gms.c;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.regex.Pattern;

public final class t
{
  private static Pattern auJ = null;
  
  public static boolean K(Context paramContext)
  {
    return paramContext.getPackageManager().hasSystemFeature("android.hardware.type.watch");
  }
  
  public static int cd(int paramInt)
  {
    return paramInt / 1000;
  }
  
  public static boolean ce(int paramInt)
  {
    return paramInt % 1000 / 100 == 3;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\c\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */