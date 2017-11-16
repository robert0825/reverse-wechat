package com.tencent.mapsdk.rastercore.e.a;

public final class e
{
  private static double[][] a;
  
  private static double a(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    return Math.sin(paramDouble2 * paramDouble3 * 0.0174532925199433D) * paramDouble1;
  }
  
  protected static double[] a(double paramDouble1, double paramDouble2)
  {
    int i = (int)((paramDouble1 - 71.0D) / 3.0D) * 19 + (int)(paramDouble2 / 3.0D);
    double d15 = a[i][8];
    double d1 = a[i][7];
    double d2 = a[i][6];
    double d3 = a[i][5];
    double d8 = a[i][4];
    double d7 = a[i][3];
    double d4 = a[i][2];
    double d5 = a[i][1];
    double d6 = a[i][0];
    d7 = d7 * paramDouble2 / 1.0E9D;
    d8 /= 1000000.0D;
    double d9 = paramDouble1 - 105.0D;
    double d10 = a(150.0D, 15.0D, d9);
    double d11 = a(40.0D, 60.0D, d9);
    double d12 = a(20.0D, 180.0D, d9);
    double d13 = a(20.0D, 360.0D, d9);
    double d14 = a(20.0D, 1080.0D, d9);
    d15 = d15 * paramDouble2 / 1.0E9D;
    double d18 = paramDouble2 - 35.0D;
    double d16 = a(160.0D, 15.0D, d18);
    double d17 = a(40.0D, 60.0D, d18);
    d18 = a(20.0D, 180.0D, d18);
    double d19 = a(20.0D, 360.0D, d9);
    return new double[] { paramDouble1 + ((d14 + (d10 + d11 + d12 + d13)) * 0.6666666666666666D + (d4 + (d6 * paramDouble1 + d5 * paramDouble2))) * (d7 + d8), ((a(20.0D, 1080.0D, d9) + (d16 + d17 + d18 + d19)) * 0.6666666666666666D + (d3 * paramDouble1 + d2 * paramDouble2 + d1)) * (d15 + 9.0539664E-6D) + paramDouble2 };
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\rastercore\e\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */