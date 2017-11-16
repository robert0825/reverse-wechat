package com.samsung.android.sdk;

import android.os.Build;

public class SsdkVendorCheck
{
  private static String strBrand = Build.BRAND;
  private static String strManufacturer = Build.MANUFACTURER;
  
  public static boolean isSamsungDevice()
  {
    if ((strBrand == null) || (strManufacturer == null)) {}
    while ((strBrand.compareToIgnoreCase("Samsung") != 0) && (strManufacturer.compareToIgnoreCase("Samsung") != 0)) {
      return false;
    }
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\samsung\android\sdk\SsdkVendorCheck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */