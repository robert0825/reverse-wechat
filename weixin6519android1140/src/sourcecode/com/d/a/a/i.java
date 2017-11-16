package com.d.a.a;

import android.location.Location;

final class i
{
  static i aEp;
  double aEq;
  double aEr;
  float aEs;
  float aEt;
  float aEu;
  float aEv;
  float aEw;
  float aEx;
  boolean aEy = false;
  
  final void a(double paramDouble1, double paramDouble2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    float[] arrayOfFloat = new float[1];
    if (paramDouble2 > 179.0D)
    {
      d = -1.0E-5D;
      Location.distanceBetween(paramDouble1, paramDouble2, paramDouble1, paramDouble2 + d, arrayOfFloat);
      this.aEx = arrayOfFloat[0];
      if (paramDouble1 <= 89.0D) {
        break label119;
      }
    }
    label119:
    for (double d = -1.0E-5D;; d = 1.0E-5D)
    {
      Location.distanceBetween(d + paramDouble1, paramDouble2, paramDouble1, paramDouble2, arrayOfFloat);
      this.aEw = arrayOfFloat[0];
      this.aEq = paramDouble1;
      this.aEr = paramDouble2;
      this.aEs = paramFloat2;
      this.aEt = paramFloat3;
      this.aEv = paramFloat1;
      this.aEu = paramFloat4;
      this.aEy = true;
      return;
      d = 1.0E-5D;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\d\a\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */