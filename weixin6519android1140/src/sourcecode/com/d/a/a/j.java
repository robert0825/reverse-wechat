package com.d.a.a;

import java.lang.reflect.Array;

final class j
{
  final b aEA = new b();
  private final b aEB = new b();
  private double[] aEz = new double[4];
  
  private void a(double paramDouble, boolean paramBoolean)
  {
    double d3 = paramDouble - this.aEA.aEC;
    double d4 = d3 * d3;
    double d2;
    double d1;
    label97:
    Object localObject;
    if (paramBoolean)
    {
      this.aEA.aFm[2][2] = this.aEA.aFg;
      this.aEA.aFm[2][3] = 0L;
      this.aEA.aFm[3][2] = 0L;
      this.aEA.aFm[3][3] = this.aEA.aFg;
      if (d3 > 0.5D)
      {
        d2 = 1.0D;
        d1 = 0.0D;
        if (d1 < d3) {
          break label500;
        }
        localObject = this.aEA;
        ((b)localObject).aFo = (d2 * ((b)localObject).aFo);
      }
      this.aEA.aFl[0] += this.aEA.aFl[2] * d3;
      this.aEA.aFl[1] += this.aEA.aFl[3] * d3;
      if (!this.aEA.aFq) {
        break label521;
      }
      this.aEA.aFm[0][0] += this.aEA.aFm[2][2] * d4;
      this.aEA.aFm[0][1] += this.aEA.aFm[2][3] * d4;
      this.aEA.aFm[1][0] += this.aEA.aFm[3][2] * d4;
      this.aEA.aFm[1][1] += this.aEA.aFm[3][3] * d4;
    }
    for (;;)
    {
      this.aEA.aEC = paramDouble;
      return;
      d1 = 1.0D;
      d2 = d1;
      if (d3 > 0.5D) {
        d2 = 0.0D;
      }
      for (;;)
      {
        if (d2 >= d3)
        {
          d2 = d1;
          localObject = this.aEA.aFm[2];
          localObject[2] *= d2;
          localObject = this.aEA.aFm[2];
          localObject[3] *= d2;
          localObject = this.aEA.aFm[3];
          localObject[2] *= d2;
          localObject = this.aEA.aFm[3];
          localObject[3] = (d2 * localObject[3]);
          break;
        }
        double d5 = this.aEA.aEP;
        d2 = 1.0D + d2;
        d1 = d5 * d1;
      }
      label500:
      d2 *= this.aEA.aFp;
      d1 += 1.0D;
      break label97;
      label521:
      this.aEA.aFm[0][0] = (this.aEA.aFm[0][0] + (this.aEA.aFm[0][2] + this.aEA.aFm[2][0]) * d3 + this.aEA.aFm[2][2] * d4);
      this.aEA.aFm[1][1] = (this.aEA.aFm[1][1] + (this.aEA.aFm[1][3] + this.aEA.aFm[3][1]) * d3 + this.aEA.aFm[3][3] * d4);
      this.aEA.aFm[0][2] += this.aEA.aFm[2][2] * d3;
      this.aEA.aFm[2][0] += this.aEA.aFm[2][2] * d3;
      this.aEA.aFm[1][3] += this.aEA.aFm[3][3] * d3;
      this.aEA.aFm[3][1] += this.aEA.aFm[3][3] * d3;
    }
  }
  
  private void a(double[] paramArrayOfDouble)
  {
    double d3;
    double d1;
    double d4;
    int i;
    if ((this.aEA.aFj) && (this.aEA.aET))
    {
      Object localObject = new double[2];
      double[] arrayOfDouble = new double[2];
      double d5 = this.aEA.aFv;
      localObject[0] = (this.aEA.aFl[0] - this.aEA.aEU[0]);
      localObject[1] = (this.aEA.aFl[1] - this.aEA.aEU[1]);
      paramArrayOfDouble[0] -= this.aEA.aEU[0];
      paramArrayOfDouble[1] -= this.aEA.aEU[1];
      double d2 = Math.sqrt(localObject[0] * localObject[0] + localObject[1] * localObject[1]);
      d3 = Math.sqrt(arrayOfDouble[0] * arrayOfDouble[0] + arrayOfDouble[1] * arrayOfDouble[1]);
      if ((d2 > this.aEA.aFb) && (d3 > this.aEA.aFb))
      {
        d1 = Math.atan2(localObject[1], localObject[0]);
        d4 = Math.atan2(arrayOfDouble[1], arrayOfDouble[0]) - d1;
        if (d4 <= 3.141592653589793D) {
          break label370;
        }
        d1 = d4 - 6.283185307179586D;
        localObject = this.aEA;
        ((b)localObject).aFn = (d5 * d1 + ((b)localObject).aFn);
        if (d1 * d1 <= 4.0D * this.aEA.aFo) {
          break label392;
        }
        i = 1;
        label278:
        d4 = Math.sqrt(this.aEA.aFm[0][0] + this.aEA.aFm[1][1]);
        if (d2 >= d3) {
          break label398;
        }
        d1 = d2;
        label317:
        d1 = d4 / d1;
        if (i == 0) {
          break label404;
        }
      }
    }
    label370:
    label392:
    label398:
    label404:
    for (this.aEA.aFo = (d1 * d1);; this.aEA.aFo = (1.0D / (1.0D / (d1 * d1) + 1.0D / this.aEA.aFo)))
    {
      this.aEA.aEU[0] = paramArrayOfDouble[0];
      this.aEA.aEU[1] = paramArrayOfDouble[1];
      this.aEA.aET = true;
      return;
      d1 = d4;
      if (d4 >= -3.141592653589793D) {
        break;
      }
      d1 = d4 + 6.283185307179586D;
      break;
      i = 0;
      break label278;
      d1 = d3;
      break label317;
    }
  }
  
  private static void a(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    double d = 1.0D / (paramArrayOfDouble1[0] * paramArrayOfDouble1[3] - paramArrayOfDouble1[1] * paramArrayOfDouble1[2]);
    paramArrayOfDouble2[0] = (paramArrayOfDouble1[3] * d);
    paramArrayOfDouble2[3] = (paramArrayOfDouble1[0] * d);
    paramArrayOfDouble2[1] = (-paramArrayOfDouble1[1] * d);
    paramArrayOfDouble2[2] = (d * -paramArrayOfDouble1[2]);
  }
  
  private static boolean a(double[][] paramArrayOfDouble1, double[][] paramArrayOfDouble2)
  {
    double[][] arrayOfDouble = (double[][])Array.newInstance(Double.TYPE, new int[] { 4, 4 });
    arrayOfDouble[0][0] = (paramArrayOfDouble1[1][1] * paramArrayOfDouble1[2][2] * paramArrayOfDouble1[3][3] - paramArrayOfDouble1[1][1] * paramArrayOfDouble1[2][3] * paramArrayOfDouble1[3][2] - paramArrayOfDouble1[2][1] * paramArrayOfDouble1[1][2] * paramArrayOfDouble1[3][3] + paramArrayOfDouble1[2][1] * paramArrayOfDouble1[1][3] * paramArrayOfDouble1[3][2] + paramArrayOfDouble1[3][1] * paramArrayOfDouble1[1][2] * paramArrayOfDouble1[2][3] - paramArrayOfDouble1[3][1] * paramArrayOfDouble1[1][3] * paramArrayOfDouble1[2][2]);
    arrayOfDouble[1][0] = (-paramArrayOfDouble1[1][0] * paramArrayOfDouble1[2][2] * paramArrayOfDouble1[3][3] + paramArrayOfDouble1[1][0] * paramArrayOfDouble1[2][3] * paramArrayOfDouble1[3][2] + paramArrayOfDouble1[2][0] * paramArrayOfDouble1[1][2] * paramArrayOfDouble1[3][3] - paramArrayOfDouble1[2][0] * paramArrayOfDouble1[1][3] * paramArrayOfDouble1[3][2] - paramArrayOfDouble1[3][0] * paramArrayOfDouble1[1][2] * paramArrayOfDouble1[2][3] + paramArrayOfDouble1[3][0] * paramArrayOfDouble1[1][3] * paramArrayOfDouble1[2][2]);
    arrayOfDouble[2][0] = (paramArrayOfDouble1[1][0] * paramArrayOfDouble1[2][1] * paramArrayOfDouble1[3][3] - paramArrayOfDouble1[1][0] * paramArrayOfDouble1[2][3] * paramArrayOfDouble1[3][1] - paramArrayOfDouble1[2][0] * paramArrayOfDouble1[1][1] * paramArrayOfDouble1[3][3] + paramArrayOfDouble1[2][0] * paramArrayOfDouble1[1][3] * paramArrayOfDouble1[3][1] + paramArrayOfDouble1[3][0] * paramArrayOfDouble1[1][1] * paramArrayOfDouble1[2][3] - paramArrayOfDouble1[3][0] * paramArrayOfDouble1[1][3] * paramArrayOfDouble1[2][1]);
    arrayOfDouble[3][0] = (-paramArrayOfDouble1[1][0] * paramArrayOfDouble1[2][1] * paramArrayOfDouble1[3][2] + paramArrayOfDouble1[1][0] * paramArrayOfDouble1[2][2] * paramArrayOfDouble1[3][1] + paramArrayOfDouble1[2][0] * paramArrayOfDouble1[1][1] * paramArrayOfDouble1[3][2] - paramArrayOfDouble1[2][0] * paramArrayOfDouble1[1][2] * paramArrayOfDouble1[3][1] - paramArrayOfDouble1[3][0] * paramArrayOfDouble1[1][1] * paramArrayOfDouble1[2][2] + paramArrayOfDouble1[3][0] * paramArrayOfDouble1[1][2] * paramArrayOfDouble1[2][1]);
    arrayOfDouble[0][1] = (-paramArrayOfDouble1[0][1] * paramArrayOfDouble1[2][2] * paramArrayOfDouble1[3][3] + paramArrayOfDouble1[0][1] * paramArrayOfDouble1[2][3] * paramArrayOfDouble1[3][2] + paramArrayOfDouble1[2][1] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[3][3] - paramArrayOfDouble1[2][1] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[3][2] - paramArrayOfDouble1[3][1] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[2][3] + paramArrayOfDouble1[3][1] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[2][2]);
    arrayOfDouble[1][1] = (paramArrayOfDouble1[0][0] * paramArrayOfDouble1[2][2] * paramArrayOfDouble1[3][3] - paramArrayOfDouble1[0][0] * paramArrayOfDouble1[2][3] * paramArrayOfDouble1[3][2] - paramArrayOfDouble1[2][0] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[3][3] + paramArrayOfDouble1[2][0] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[3][2] + paramArrayOfDouble1[3][0] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[2][3] - paramArrayOfDouble1[3][0] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[2][2]);
    arrayOfDouble[2][1] = (-paramArrayOfDouble1[0][0] * paramArrayOfDouble1[2][1] * paramArrayOfDouble1[3][3] + paramArrayOfDouble1[0][0] * paramArrayOfDouble1[2][3] * paramArrayOfDouble1[3][1] + paramArrayOfDouble1[2][0] * paramArrayOfDouble1[0][1] * paramArrayOfDouble1[3][3] - paramArrayOfDouble1[2][0] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[3][1] - paramArrayOfDouble1[3][0] * paramArrayOfDouble1[0][1] * paramArrayOfDouble1[2][3] + paramArrayOfDouble1[3][0] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[2][1]);
    arrayOfDouble[3][1] = (paramArrayOfDouble1[0][0] * paramArrayOfDouble1[2][1] * paramArrayOfDouble1[3][2] - paramArrayOfDouble1[0][0] * paramArrayOfDouble1[2][2] * paramArrayOfDouble1[3][1] - paramArrayOfDouble1[2][0] * paramArrayOfDouble1[0][1] * paramArrayOfDouble1[3][2] + paramArrayOfDouble1[2][0] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[3][1] + paramArrayOfDouble1[3][0] * paramArrayOfDouble1[0][1] * paramArrayOfDouble1[2][2] - paramArrayOfDouble1[3][0] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[2][1]);
    arrayOfDouble[0][2] = (paramArrayOfDouble1[0][1] * paramArrayOfDouble1[1][2] * paramArrayOfDouble1[3][3] - paramArrayOfDouble1[0][1] * paramArrayOfDouble1[1][3] * paramArrayOfDouble1[3][2] - paramArrayOfDouble1[1][1] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[3][3] + paramArrayOfDouble1[1][1] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[3][2] + paramArrayOfDouble1[3][1] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[1][3] - paramArrayOfDouble1[3][1] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[1][2]);
    arrayOfDouble[1][2] = (-paramArrayOfDouble1[0][0] * paramArrayOfDouble1[1][2] * paramArrayOfDouble1[3][3] + paramArrayOfDouble1[0][0] * paramArrayOfDouble1[1][3] * paramArrayOfDouble1[3][2] + paramArrayOfDouble1[1][0] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[3][3] - paramArrayOfDouble1[1][0] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[3][2] - paramArrayOfDouble1[3][0] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[1][3] + paramArrayOfDouble1[3][0] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[1][2]);
    arrayOfDouble[2][2] = (paramArrayOfDouble1[0][0] * paramArrayOfDouble1[1][1] * paramArrayOfDouble1[3][3] - paramArrayOfDouble1[0][0] * paramArrayOfDouble1[1][3] * paramArrayOfDouble1[3][1] - paramArrayOfDouble1[1][0] * paramArrayOfDouble1[0][1] * paramArrayOfDouble1[3][3] + paramArrayOfDouble1[1][0] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[3][1] + paramArrayOfDouble1[3][0] * paramArrayOfDouble1[0][1] * paramArrayOfDouble1[1][3] - paramArrayOfDouble1[3][0] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[1][1]);
    arrayOfDouble[3][2] = (-paramArrayOfDouble1[0][0] * paramArrayOfDouble1[1][1] * paramArrayOfDouble1[3][2] + paramArrayOfDouble1[0][0] * paramArrayOfDouble1[1][2] * paramArrayOfDouble1[3][1] + paramArrayOfDouble1[1][0] * paramArrayOfDouble1[0][1] * paramArrayOfDouble1[3][2] - paramArrayOfDouble1[1][0] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[3][1] - paramArrayOfDouble1[3][0] * paramArrayOfDouble1[0][1] * paramArrayOfDouble1[1][2] + paramArrayOfDouble1[3][0] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[1][1]);
    arrayOfDouble[0][3] = (-paramArrayOfDouble1[0][1] * paramArrayOfDouble1[1][2] * paramArrayOfDouble1[2][3] + paramArrayOfDouble1[0][1] * paramArrayOfDouble1[1][3] * paramArrayOfDouble1[2][2] + paramArrayOfDouble1[1][1] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[2][3] - paramArrayOfDouble1[1][1] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[2][2] - paramArrayOfDouble1[2][1] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[1][3] + paramArrayOfDouble1[2][1] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[1][2]);
    arrayOfDouble[1][3] = (paramArrayOfDouble1[0][0] * paramArrayOfDouble1[1][2] * paramArrayOfDouble1[2][3] - paramArrayOfDouble1[0][0] * paramArrayOfDouble1[1][3] * paramArrayOfDouble1[2][2] - paramArrayOfDouble1[1][0] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[2][3] + paramArrayOfDouble1[1][0] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[2][2] + paramArrayOfDouble1[2][0] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[1][3] - paramArrayOfDouble1[2][0] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[1][2]);
    arrayOfDouble[2][3] = (-paramArrayOfDouble1[0][0] * paramArrayOfDouble1[1][1] * paramArrayOfDouble1[2][3] + paramArrayOfDouble1[0][0] * paramArrayOfDouble1[1][3] * paramArrayOfDouble1[2][1] + paramArrayOfDouble1[1][0] * paramArrayOfDouble1[0][1] * paramArrayOfDouble1[2][3] - paramArrayOfDouble1[1][0] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[2][1] - paramArrayOfDouble1[2][0] * paramArrayOfDouble1[0][1] * paramArrayOfDouble1[1][3] + paramArrayOfDouble1[2][0] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[1][1]);
    arrayOfDouble[3][3] = (paramArrayOfDouble1[0][0] * paramArrayOfDouble1[1][1] * paramArrayOfDouble1[2][2] - paramArrayOfDouble1[0][0] * paramArrayOfDouble1[1][2] * paramArrayOfDouble1[2][1] - paramArrayOfDouble1[1][0] * paramArrayOfDouble1[0][1] * paramArrayOfDouble1[2][2] + paramArrayOfDouble1[1][0] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[2][1] + paramArrayOfDouble1[2][0] * paramArrayOfDouble1[0][1] * paramArrayOfDouble1[1][2] - paramArrayOfDouble1[2][0] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[1][1]);
    double d = paramArrayOfDouble1[0][0] * arrayOfDouble[0][0] + paramArrayOfDouble1[0][1] * arrayOfDouble[1][0] + paramArrayOfDouble1[0][2] * arrayOfDouble[2][0] + paramArrayOfDouble1[0][3] * arrayOfDouble[3][0];
    if (d == 0.0D) {
      return false;
    }
    d = 1.0D / d;
    int i = 0;
    if (i >= 4) {
      return true;
    }
    int j = 0;
    for (;;)
    {
      if (j >= 4)
      {
        i += 1;
        break;
      }
      arrayOfDouble[i][j] *= d;
      j += 1;
    }
  }
  
  private void b(double paramDouble, boolean paramBoolean)
  {
    double d3 = paramDouble - this.aEB.aEC;
    double d4 = d3 * d3;
    double d2;
    double d1;
    label97:
    Object localObject;
    if (paramBoolean)
    {
      this.aEB.aFm[2][2] = this.aEB.aFg;
      this.aEB.aFm[2][3] = 0L;
      this.aEB.aFm[3][2] = 0L;
      this.aEB.aFm[3][3] = this.aEB.aFg;
      if (d3 > 0.5D)
      {
        d2 = 1.0D;
        d1 = 0.0D;
        if (d1 < d3) {
          break label500;
        }
        localObject = this.aEB;
        ((b)localObject).aFo = (d2 * ((b)localObject).aFo);
      }
      this.aEB.aFl[0] += this.aEB.aFl[2] * d3;
      this.aEB.aFl[1] += this.aEB.aFl[3] * d3;
      if (!this.aEB.aFq) {
        break label521;
      }
      this.aEB.aFm[0][0] += this.aEB.aFm[2][2] * d4;
      this.aEB.aFm[0][1] += this.aEB.aFm[2][3] * d4;
      this.aEB.aFm[1][0] += this.aEB.aFm[3][2] * d4;
      this.aEB.aFm[1][1] += this.aEB.aFm[3][3] * d4;
    }
    for (;;)
    {
      this.aEB.aEC = paramDouble;
      return;
      d1 = 1.0D;
      d2 = d1;
      if (d3 > 0.5D) {
        d2 = 0.0D;
      }
      for (;;)
      {
        if (d2 >= d3)
        {
          d2 = d1;
          localObject = this.aEB.aFm[2];
          localObject[2] *= d2;
          localObject = this.aEB.aFm[2];
          localObject[3] *= d2;
          localObject = this.aEB.aFm[3];
          localObject[2] *= d2;
          localObject = this.aEB.aFm[3];
          localObject[3] = (d2 * localObject[3]);
          break;
        }
        double d5 = this.aEB.aEP;
        d2 = 1.0D + d2;
        d1 = d5 * d1;
      }
      label500:
      d2 *= this.aEB.aFp;
      d1 += 1.0D;
      break label97;
      label521:
      this.aEB.aFm[0][0] = (this.aEB.aFm[0][0] + (this.aEB.aFm[0][2] + this.aEB.aFm[2][0]) * d3 + this.aEB.aFm[2][2] * d4);
      this.aEB.aFm[1][1] = (this.aEB.aFm[1][1] + (this.aEB.aFm[1][3] + this.aEB.aFm[3][1]) * d3 + this.aEB.aFm[3][3] * d4);
      this.aEB.aFm[0][2] += this.aEB.aFm[2][2] * d3;
      this.aEB.aFm[2][0] += this.aEB.aFm[2][2] * d3;
      this.aEB.aFm[1][3] += this.aEB.aFm[3][3] * d3;
      this.aEB.aFm[3][1] += this.aEB.aFm[3][3] * d3;
    }
  }
  
  void a(int paramInt, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      paramArrayOfDouble2[0] = ((paramArrayOfDouble1[1] - this.aEA.aFh[1]) * 6378137.0D * Math.cos(this.aEA.aFh[0]));
      paramArrayOfDouble2[1] = ((paramArrayOfDouble1[0] - this.aEA.aFh[0]) * 6378137.0D);
      return;
    }
    paramArrayOfDouble2[0] = (paramArrayOfDouble1[1] / 6378137.0D + this.aEA.aFh[0]);
    paramArrayOfDouble2[1] = (paramArrayOfDouble1[0] / (Math.cos(this.aEA.aFh[0]) * 6378137.0D) + this.aEA.aFh[1]);
  }
  
  protected final void a(long paramLong, double paramDouble1, double paramDouble2, float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
  {
    double d1 = paramLong;
    double d2 = paramFloat * paramFloat;
    double[] arrayOfDouble1 = new double[2];
    double[] tmp19_17 = arrayOfDouble1;
    tmp19_17[0] = 0.0D;
    double[] tmp23_19 = tmp19_17;
    tmp23_19[1] = 0.0D;
    tmp23_19;
    if (paramBoolean1) {}
    for (int i = 3;; i = 5)
    {
      double[] arrayOfDouble2 = new double[2];
      arrayOfDouble2[0] = paramDouble1;
      arrayOfDouble2[1] = paramDouble2;
      this.aEA.aFq = true;
      this.aEA.aFx[0] = 3.0D;
      this.aEA.aFx[1] = 1.2D;
      this.aEA.aFv = 0.5D;
      this.aEA.aEP = 1.2D;
      this.aEA.aEV = 4.0D;
      this.aEA.aEW = 0;
      this.aEA.aEY = true;
      this.aEA.aEX = i;
      this.aEA.aEQ = false;
      this.aEA.aET = false;
      this.aEA.aFe = 40.0D;
      this.aEA.aFf = 0.15707963267948966D;
      this.aEA.aFg = 1.0D;
      this.aEA.aFw[0] = 400.0D;
      this.aEA.aFw[1] = 1.0D;
      this.aEA.aFj = paramBoolean2;
      this.aEA.aFk = false;
      this.aEA.aEZ = true;
      this.aEA.aFa = 0.3333333333333333D;
      this.aEA.aFb = 5.0D;
      this.aEA.aFc = 0.5D;
      this.aEA.aFd = 1.0D;
      this.aEA.aFr = 0.5D;
      this.aEA.aFs = 1.0D;
      this.aEA.aFt = 0;
      this.aEA.aFu = 2;
      this.aEA.aFy = false;
      this.aEA.aFh[0] = arrayOfDouble2[0];
      this.aEA.aFh[1] = arrayOfDouble2[1];
      arrayOfDouble2 = new double[2];
      a(0, new double[] { paramDouble1, paramDouble2 }, arrayOfDouble2);
      this.aEA.aEC = d1;
      this.aEA.aFl[0] = arrayOfDouble2[0];
      this.aEA.aFl[1] = arrayOfDouble2[1];
      this.aEA.aFl[2] = arrayOfDouble1[0];
      this.aEA.aFl[3] = arrayOfDouble1[1];
      this.aEA.aFn = 0.0D;
      this.aEA.aFo = 1.0D;
      this.aEA.aFp = 1.005D;
      this.aEA.aFm[0][0] = tmp19_17;
      this.aEA.aFm[0][1] = 0L;
      this.aEA.aFm[0][2] = 0L;
      this.aEA.aFm[0][3] = 0L;
      this.aEA.aFm[1][0] = 0L;
      this.aEA.aFm[1][1] = tmp19_17;
      this.aEA.aFm[1][2] = 0L;
      this.aEA.aFm[1][3] = 0L;
      this.aEA.aFm[2][0] = 0L;
      this.aEA.aFm[2][1] = 0L;
      this.aEA.aFm[2][2] = 4607182418800017408L;
      this.aEA.aFm[2][3] = 0L;
      this.aEA.aFm[3][0] = 0L;
      this.aEA.aFm[3][1] = 0L;
      this.aEA.aFm[3][2] = 0L;
      this.aEA.aFm[3][3] = 4607182418800017408L;
      ak(paramBoolean1);
      return;
    }
  }
  
  protected final void a(a parama)
  {
    if (parama.aEH <= 0.0D) {}
    double[] arrayOfDouble1;
    Object localObject1;
    label1101:
    label1155:
    label1163:
    label1171:
    int i;
    for (;;)
    {
      return;
      if (this.aEA.aEQ)
      {
        d1 = parama.aEC - this.aEA.aES;
        if (d1 < -10.0D) {
          continue;
        }
        if (d1 <= 0.0D) {
          parama.aEC = (this.aEA.aES + 0.5D);
        }
      }
      arrayOfDouble1 = new double[2];
      a(0, new double[] { parama.aED, parama.aEE }, arrayOfDouble1);
      parama.aEF[0] = arrayOfDouble1[0];
      parama.aEF[1] = arrayOfDouble1[1];
      if (this.aEA.aFq)
      {
        double d5;
        if ((parama.mType != 3) || (this.aEA.aEQ))
        {
          if (parama.mType != 3) {
            break label1171;
          }
          d5 = parama.aEC - this.aEA.aES;
          if (d5 > 0.0D)
          {
            localObject2 = (double[][])Array.newInstance(Double.TYPE, new int[] { 2, 2 });
            localObject1 = new double[2];
            d4 = arrayOfDouble1[0] - this.aEA.aER[0];
            d3 = arrayOfDouble1[1] - this.aEA.aER[1];
            d1 = d3;
            d2 = d4;
            if (this.aEA.aFj)
            {
              d2 = d4 * Math.cos(this.aEA.aFn) - Math.sin(this.aEA.aFn) * d3;
              d1 = Math.sin(this.aEA.aFn);
              d1 = d3 * Math.cos(this.aEA.aFn) + d1 * d2;
            }
            d4 = Math.sqrt(d2 * d2 + d1 * d1);
            d3 = d4 / this.aEA.aFe;
            d3 *= d3;
            if (d3 <= 0.0625D) {
              break label1155;
            }
            d4 *= this.aEA.aFf;
            d4 *= d4;
            if (d4 <= 0.0625D) {
              break label1163;
            }
          }
        }
        for (;;)
        {
          d3 = (d3 + d4) / d5;
          d4 = this.aEA.aFm[2][2];
          double d6 = this.aEA.aFm[2][3];
          double d7 = this.aEA.aFm[3][2];
          double d8 = this.aEA.aFm[3][3];
          localObject3 = this.aEz;
          a(new double[] { d4, d6, d7, d8 }, (double[])localObject3);
          localObject2[0][0] = this.aEz[0];
          localObject2[0][1] = this.aEz[1];
          localObject2[1][0] = this.aEz[2];
          localObject2[1][1] = this.aEz[3];
          d4 = d2 / d5 - this.aEA.aFl[2];
          d6 = d1 / d5 - this.aEA.aFl[3];
          d7 = localObject2[0][0];
          d8 = localObject2[0][1];
          if (Math.sqrt(d4 * d6 * localObject2[1][0] + (d4 * d4 * d7 + d4 * d6 * d8) + d6 * d6 * localObject2[1][1]) > 2.0D)
          {
            this.aEA.aFm[2][2] = this.aEA.aFg;
            this.aEA.aFm[2][3] = 0L;
            this.aEA.aFm[3][2] = 0L;
            this.aEA.aFm[3][3] = this.aEA.aFg;
            localObject2[0][0] = (1.0D / this.aEA.aFg);
            localObject2[0][1] = 0L;
            localObject2[1][0] = 0L;
            localObject2[1][1] = (1.0D / this.aEA.aFg);
          }
          localObject1[0] = (localObject2[0][0] * this.aEA.aFl[2] + localObject2[0][1] * this.aEA.aFl[3]);
          localObject1[1] = (localObject2[1][0] * this.aEA.aFl[2] + localObject2[1][1] * this.aEA.aFl[3]);
          localObject3 = localObject2[0];
          localObject3[0] += 1.0D / d3;
          localObject3 = localObject2[1];
          localObject3[1] += 1.0D / d3;
          d4 = localObject1[0];
          localObject1[0] = (d2 / (d5 * d3) + d4);
          d2 = localObject1[1];
          localObject1[1] = (d1 / (d3 * d5) + d2);
          d1 = localObject2[0][0];
          d2 = localObject2[0][1];
          d3 = localObject2[1][0];
          d4 = localObject2[1][1];
          localObject2 = this.aEz;
          a(new double[] { d1, d2, d3, d4 }, (double[])localObject2);
          this.aEA.aFm[2][2] = this.aEz[0];
          this.aEA.aFm[2][3] = this.aEz[1];
          this.aEA.aFm[3][2] = this.aEz[2];
          this.aEA.aFm[3][3] = this.aEz[3];
          this.aEA.aFl[2] = (this.aEA.aFm[2][2] * localObject1[0] + this.aEA.aFm[2][3] * localObject1[1]);
          this.aEA.aFl[3] = (this.aEA.aFm[3][2] * localObject1[0] + this.aEA.aFm[3][3] * localObject1[1]);
          a(parama.aEC, false);
          if (parama.mType != 3) {
            break label2484;
          }
          this.aEA.aER[0] = arrayOfDouble1[0];
          this.aEA.aER[1] = arrayOfDouble1[1];
          this.aEA.aES = parama.aEC;
          this.aEA.aEQ = true;
          return;
          d3 = 0.0625D;
          break;
          d4 = 0.0625D;
        }
        localObject2 = new double[2];
        localObject1 = new double[2];
        a(parama.aEC, false);
        if (this.aEA.aEZ)
        {
          if (!this.aEA.aET)
          {
            j = 1;
            d1 = 0.0D;
            i = 1;
            d2 = 0.0D;
            label1221:
            if (i == 0) {
              break label2056;
            }
            if (this.aEA.aET)
            {
              if (d2 >= d1) {
                break label2058;
              }
              d3 = this.aEA.aFc;
              label1252:
              d1 = d3 + d1 / d2 * (1.0D - d3);
              arrayOfDouble1[0] = (this.aEA.aEU[0] + localObject1[0] * d1);
              d2 = this.aEA.aEU[1];
              arrayOfDouble1[1] = (d1 * localObject1[1] + d2);
            }
            if (j == 0) {
              break label2070;
            }
            a(arrayOfDouble1);
          }
          for (;;)
          {
            this.aEA.aFl[0] = arrayOfDouble1[0];
            this.aEA.aFl[1] = arrayOfDouble1[1];
            this.aEA.aFm[0][0] = (parama.aEH * parama.aEH);
            this.aEA.aFm[0][1] = 0L;
            this.aEA.aFm[1][0] = 0L;
            this.aEA.aFm[1][1] = (parama.aEH * parama.aEH);
            break;
            localObject2[0] = (this.aEA.aFl[0] - this.aEA.aEU[0]);
            localObject2[1] = (this.aEA.aFl[1] - this.aEA.aEU[1]);
            arrayOfDouble1[0] -= this.aEA.aEU[0];
            arrayOfDouble1[1] -= this.aEA.aEU[1];
            d2 = Math.sqrt(localObject2[0] * localObject2[0] + localObject2[1] * localObject2[1]);
            d1 = Math.sqrt(localObject1[0] * localObject1[0] + localObject1[1] * localObject1[1]);
            if ((d1 > this.aEA.aFb) && (d2 > this.aEA.aFb))
            {
              d3 = d1 / d2;
              d4 = d1 - d2;
              d5 = Math.sqrt(this.aEA.aFm[0][0] + this.aEA.aFm[1][1]);
              if (d2 > 3.0D * this.aEA.aFb)
              {
                d3 = d4;
                if (d4 < 0.0D) {
                  d3 = -d4;
                }
                d5 = d3 / d5;
                d3 = Math.atan2(localObject2[1], localObject2[0]);
                d4 = Math.atan2(localObject1[1], localObject1[0]) - d3;
                if (d4 > 3.141592653589793D)
                {
                  d3 = d4 - 6.283185307179586D;
                  label1693:
                  d4 = d3;
                  if (d3 < 0.0D) {
                    d4 = -d3;
                  }
                  d3 = d4 / Math.sqrt(this.aEA.aFo);
                  d4 = Math.sqrt(d3 * d3 + d5 * d5);
                  if (d4 >= this.aEA.aEV) {
                    break label1821;
                  }
                  this.aEA.aFt = 0;
                  d3 = d4;
                }
                for (;;)
                {
                  if (d3 <= this.aEA.aEV) {
                    break label1891;
                  }
                  d3 = d1;
                  j = 0;
                  i = 0;
                  d1 = d2;
                  d2 = d3;
                  break;
                  d3 = d4;
                  if (d4 >= -3.141592653589793D) {
                    break label1693;
                  }
                  d3 = d4 + 6.283185307179586D;
                  break label1693;
                  label1821:
                  d3 = d4;
                  if (d5 < this.aEA.aEV)
                  {
                    localObject2 = this.aEA;
                    i = ((b)localObject2).aFt + 1;
                    ((b)localObject2).aFt = i;
                    d3 = d4;
                    if (i >= this.aEA.aFu)
                    {
                      this.aEA.aFt = 0;
                      d3 = d5;
                    }
                  }
                }
                label1891:
                d3 = d1;
                j = 1;
                i = 1;
                d1 = d2;
                d2 = d3;
                break label1221;
              }
              if ((d3 < this.aEA.aFa) || (1.0D / d3 < this.aEA.aFa))
              {
                d3 = d1;
                j = 0;
                i = 0;
                d1 = d2;
                d2 = d3;
                break label1221;
              }
              d3 = d1;
              j = 0;
              i = 1;
              d1 = d2;
              d2 = d3;
              break label1221;
            }
            if (((d1 < this.aEA.aFb) && (parama.mType == 2)) || ((d1 < this.aEA.aFb * 0.5D) && (parama.mType == 1)))
            {
              d3 = d1;
              j = 0;
              i = 0;
              d1 = d2;
              d2 = d3;
              break label1221;
            }
            d3 = d1;
            j = 0;
            i = 1;
            d1 = d2;
            d2 = d3;
            break label1221;
            label2056:
            break;
            label2058:
            d3 = this.aEA.aFd;
            break label1252;
            label2070:
            this.aEA.aEU[0] = arrayOfDouble1[0];
            this.aEA.aEU[1] = arrayOfDouble1[1];
          }
        }
        this.aEB.a(this.aEA);
        b(parama.aEC, false);
        if (this.aEB.aEY) {
          if (!this.aEA.aET)
          {
            d1 = 0.0D;
            label2141:
            if (d1 <= this.aEA.aEV) {
              break label3184;
            }
            this.aEB.a(this.aEA);
            b(parama.aEC, true);
            if (!this.aEA.aEY) {
              break label2894;
            }
            d3 = this.aEA.aEU[0] - this.aEB.aFl[0];
            d4 = this.aEA.aEU[1] - this.aEB.aFl[1];
            d1 = this.aEA.aEU[0] - arrayOfDouble1[0];
            d2 = this.aEA.aEU[1] - arrayOfDouble1[1];
            d3 = Math.sqrt(d3 * d3 + d4 * d4);
            d1 = Math.sqrt(d1 * d1 + d2 * d2);
            d2 = Math.sqrt(this.aEB.aFm[0][0] * this.aEB.aFm[0][0] + this.aEB.aFm[1][1] * this.aEB.aFm[1][1]);
            d1 = Math.abs(d3 - d1) / d2;
            label2348:
            if (d1 <= this.aEB.aEV) {
              break label3156;
            }
            if (this.aEA.aEW >= this.aEA.aEX) {
              break label3134;
            }
            this.aEA.aEW += 1;
          }
        }
        for (;;)
        {
          this.aEA.aFl[0] = arrayOfDouble1[0];
          this.aEA.aFl[1] = arrayOfDouble1[1];
          this.aEA.aFm[0][0] = (parama.aEH * parama.aEH);
          this.aEA.aFm[0][1] = 0L;
          this.aEA.aFm[1][0] = 0L;
          this.aEA.aFm[1][1] = (parama.aEH * parama.aEH);
          break label1101;
          label2484:
          break;
          d3 = this.aEA.aEU[0] - this.aEB.aFl[0];
          d4 = this.aEA.aEU[1] - this.aEB.aFl[1];
          d1 = this.aEA.aEU[0] - arrayOfDouble1[0];
          d2 = this.aEA.aEU[1] - arrayOfDouble1[1];
          d3 = Math.sqrt(d3 * d3 + d4 * d4);
          d1 = Math.sqrt(d1 * d1 + d2 * d2);
          d2 = Math.sqrt(this.aEA.aFm[0][0] * this.aEA.aFm[0][0] + this.aEA.aFm[1][1] * this.aEA.aFm[1][1]);
          d1 = Math.abs(d3 - d1) / d2;
          break label2141;
          d1 = arrayOfDouble1[0] - this.aEB.aFl[0];
          d2 = arrayOfDouble1[1] - this.aEB.aFl[1];
          localObject1 = (double[][])Array.newInstance(Double.TYPE, new int[] { 2, 2 });
          d3 = 1.0D / (this.aEB.aFm[0][0] * this.aEB.aFm[1][1] - this.aEB.aFm[0][1] * this.aEB.aFm[1][0]);
          localObject1[0][0] = (this.aEB.aFm[1][1] * d3);
          localObject1[1][1] = (this.aEB.aFm[0][0] * d3);
          localObject1[0][1] = (-this.aEB.aFm[0][1] * d3);
          localObject1[1][0] = (d3 * -this.aEB.aFm[1][0]);
          d3 = localObject1[0][0];
          d4 = localObject1[1][0];
          d1 = Math.sqrt(localObject1[1][1] * (d2 * d2) + (d1 * 2.0D * d2 * d4 + d1 * d1 * d3));
          break label2141;
          label2894:
          d1 = arrayOfDouble1[0] - this.aEB.aFl[0];
          d2 = arrayOfDouble1[1] - this.aEB.aFl[1];
          localObject1 = (double[][])Array.newInstance(Double.TYPE, new int[] { 2, 2 });
          d3 = 1.0D / (this.aEB.aFm[0][0] * this.aEB.aFm[1][1] - this.aEB.aFm[0][1] * this.aEB.aFm[1][0]);
          localObject1[0][0] = (this.aEB.aFm[1][1] * d3);
          localObject1[1][1] = (this.aEB.aFm[0][0] * d3);
          localObject1[0][1] = (-this.aEB.aFm[0][1] * d3);
          localObject1[1][0] = (d3 * -this.aEB.aFm[1][0]);
          d3 = localObject1[0][0];
          d4 = localObject1[1][0];
          d1 = Math.sqrt(localObject1[1][1] * (d2 * d2) + (d1 * 2.0D * d2 * d4 + d1 * d1 * d3));
          break label2348;
          label3134:
          this.aEA.a(this.aEB);
          this.aEA.aEW = 0;
          continue;
          label3156:
          this.aEA.a(this.aEB);
          this.aEA.aEW = 0;
          a(arrayOfDouble1);
          continue;
          label3184:
          this.aEA.a(this.aEB);
          this.aEA.aEW = 0;
          a(arrayOfDouble1);
        }
      }
      if (parama.mType != 3)
      {
        localObject2 = new double[2];
        localObject1 = new double[2];
        arrayOfDouble1 = new double[2];
        a(parama.aEC, false);
        if (!this.aEA.aET)
        {
          j = 1;
          i = 0;
          this.aEA.aEW = 0;
        }
        while (j != 0)
        {
          if (i != 0) {
            break label3928;
          }
          this.aEA.aFl[0] = parama.aEF[0];
          this.aEA.aFl[1] = parama.aEF[1];
          this.aEA.aFl[2] = 0.0D;
          this.aEA.aFl[3] = 0.0D;
          this.aEA.aFm[0][0] = (parama.aEH * parama.aEH);
          this.aEA.aFm[0][1] = 0L;
          this.aEA.aFm[0][2] = 0L;
          this.aEA.aFm[0][3] = 0L;
          this.aEA.aFm[1][0] = 0L;
          this.aEA.aFm[1][1] = this.aEA.aFm[0][0];
          this.aEA.aFm[1][2] = 0L;
          this.aEA.aFm[1][2] = 0L;
          this.aEA.aFm[2][0] = 0L;
          this.aEA.aFm[2][1] = 0L;
          this.aEA.aFm[2][2] = this.aEA.aFg;
          this.aEA.aFm[2][3] = 0L;
          this.aEA.aFm[3][0] = 0L;
          this.aEA.aFm[3][1] = 0L;
          this.aEA.aFm[3][2] = 0L;
          this.aEA.aFm[3][3] = this.aEA.aFg;
          this.aEA.aEU[0] = parama.aEF[0];
          this.aEA.aEU[1] = parama.aEF[1];
          this.aEA.aET = true;
          return;
          localObject3 = (double[][])Array.newInstance(Double.TYPE, new int[] { 2, 2 });
          localObject2[0] = (parama.aEF[0] - this.aEA.aFl[0]);
          localObject2[1] = (parama.aEF[1] - this.aEA.aFl[1]);
          d1 = this.aEA.aFm[0][0];
          d2 = this.aEA.aFm[0][1];
          d3 = this.aEA.aFm[1][0];
          d4 = this.aEA.aFm[1][1];
          double[] arrayOfDouble2 = this.aEz;
          a(new double[] { d1, d2, d3, d4 }, arrayOfDouble2);
          localObject3[0][0] = this.aEz[0];
          localObject3[0][1] = this.aEz[1];
          localObject3[1][0] = this.aEz[2];
          localObject3[1][1] = this.aEz[3];
          if (Math.sqrt(localObject2[0] * localObject2[0] * localObject3[0][0] + 2.0D * localObject2[0] * localObject2[1] * localObject3[1][0] + localObject2[1] * localObject2[1] * localObject3[1][1]) > this.aEA.aEV)
          {
            localObject2 = this.aEA;
            i = ((b)localObject2).aEW + 1;
            ((b)localObject2).aEW = i;
            if (i >= this.aEA.aEX)
            {
              j = 1;
              i = 0;
              this.aEA.aEW = 0;
            }
            else
            {
              j = 0;
              i = 0;
            }
          }
          else
          {
            this.aEA.aEW = 0;
            j = 1;
            i = 1;
          }
        }
      }
    }
    label3928:
    Object localObject3 = (double[][])Array.newInstance(Double.TYPE, new int[] { 4, 4 });
    Object localObject2 = new double[2];
    localObject1[0] = (this.aEA.aFl[0] - this.aEA.aEU[0]);
    localObject1[1] = (this.aEA.aFl[1] - this.aEA.aEU[1]);
    arrayOfDouble1[0] = (parama.aEF[0] - this.aEA.aEU[0]);
    arrayOfDouble1[1] = (parama.aEF[1] - this.aEA.aEU[1]);
    double d2 = Math.sqrt(arrayOfDouble1[0] * arrayOfDouble1[0] + arrayOfDouble1[1] * arrayOfDouble1[1]);
    double d1 = localObject1[0];
    double d3 = localObject1[0];
    double d4 = localObject1[1];
    d4 = Math.sqrt(localObject1[1] * d4 + d1 * d3);
    if (d2 < d4)
    {
      d1 = this.aEA.aFr;
      label4115:
      if (!a(this.aEA.aFm, (double[][])localObject3)) {
        break label4343;
      }
      d3 = 1.0D / (parama.aEH * parama.aEH);
      localObject1 = new double[4];
      if (!this.aEA.aFy) {
        break label4345;
      }
      d1 += d4 / d2 * (1.0D - d1);
      localObject2[0] = (this.aEA.aEU[0] + arrayOfDouble1[0] * d1);
      d2 = this.aEA.aEU[1];
      localObject2[1] = (d1 * arrayOfDouble1[1] + d2);
    }
    for (;;)
    {
      i = 0;
      if (i < 4) {
        break label4404;
      }
      parama = localObject3[0];
      parama[0] += d3;
      parama = localObject3[1];
      parama[1] += d3;
      if (!a((double[][])localObject3, this.aEA.aFm)) {
        break;
      }
      localObject1[0] += localObject2[0] * d3;
      localObject1[1] += localObject2[1] * d3;
      i = 0;
      if (i < 4) {
        break label4467;
      }
      this.aEA.aEU[0] = localObject2[0];
      this.aEA.aEU[1] = localObject2[1];
      return;
      d1 = this.aEA.aFs;
      break label4115;
      label4343:
      break;
      label4345:
      localObject2[0] = (this.aEA.aFl[0] * (1.0D - d1) + parama.aEF[0] * d1);
      d2 = this.aEA.aFl[1];
      localObject2[1] = (d1 * parama.aEF[1] + d2 * (1.0D - d1));
    }
    label4404:
    localObject1[i] = 0.0D;
    int j = 0;
    for (;;)
    {
      if (j >= 4)
      {
        i += 1;
        break;
      }
      localObject1[i] += localObject3[i][j] * this.aEA.aFl[j];
      j += 1;
    }
    label4467:
    this.aEA.aFl[i] = 0.0D;
    j = 0;
    for (;;)
    {
      if (j >= 4)
      {
        i += 1;
        break;
      }
      parama = this.aEA.aFl;
      parama[i] += this.aEA.aFm[i][j] * localObject1[j];
      j += 1;
    }
  }
  
  protected final void ak(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (paramBoolean = false;; paramBoolean = true)
    {
      if (this.aEA.aFq != paramBoolean)
      {
        this.aEA.aFq = paramBoolean;
        if (!paramBoolean) {
          break;
        }
        this.aEA.aEP = this.aEA.aFx[1];
        this.aEA.aFg = this.aEA.aFw[1];
        a(this.aEA.aEC, true);
      }
      return;
    }
    this.aEA.aEP = this.aEA.aFx[0];
    this.aEA.aFg = this.aEA.aFw[0];
    a(this.aEA.aEC, true);
  }
  
  protected static final class a
  {
    double aEC;
    double aED;
    double aEE;
    double[] aEF = new double[2];
    double aEG;
    double aEH;
    int aEI;
    double aEJ;
    double aEK;
    int aEL;
    double aEM;
    double aEN;
    double aEO;
    int mType;
    
    protected a(int paramInt1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, int paramInt2, double paramDouble6, int paramInt3, double paramDouble7, double paramDouble8)
    {
      this.mType = paramInt1;
      this.aEC = paramDouble1;
      this.aED = paramDouble2;
      this.aEE = paramDouble3;
      this.aEG = paramDouble4;
      this.aEH = paramDouble5;
      this.aEI = paramInt2;
      this.aEJ = paramDouble6;
      this.aEK = 0.0D;
      this.aEL = paramInt3;
      this.aEM = 0.0D;
      this.aEN = paramDouble7;
      this.aEO = paramDouble8;
    }
    
    public final String toString()
    {
      return String.valueOf(this.mType) + ',' + this.aEC + ',' + this.aED + ',' + this.aEE + ',' + this.aEG + ',' + this.aEH + ',' + this.aEI + ',' + this.aEJ + ',' + this.aEK + ',' + this.aEL + ',' + this.aEN + ',' + this.aEO;
    }
  }
  
  private static final class b
  {
    public double aEC;
    public double aEP;
    public boolean aEQ;
    public double[] aER = new double[2];
    public double aES;
    public boolean aET;
    public double[] aEU = new double[2];
    public double aEV;
    public int aEW;
    public int aEX;
    public boolean aEY;
    public boolean aEZ;
    public double aFa;
    public double aFb;
    public double aFc;
    public double aFd;
    public double aFe;
    public double aFf;
    public double aFg;
    public double[] aFh = new double[2];
    private boolean aFi;
    public boolean aFj;
    public boolean aFk;
    public double[] aFl = new double[4];
    public double[][] aFm = (double[][])Array.newInstance(Double.TYPE, new int[] { 4, 4 });
    public double aFn;
    public double aFo;
    public double aFp;
    public boolean aFq;
    public double aFr;
    public double aFs;
    public int aFt;
    public int aFu;
    public double aFv;
    public double[] aFw = new double[2];
    public double[] aFx = new double[2];
    public boolean aFy;
    
    public final void a(b paramb)
    {
      this.aEP = paramb.aEP;
      this.aEQ = paramb.aEQ;
      this.aER = ((double[])paramb.aER.clone());
      this.aES = paramb.aES;
      this.aET = paramb.aET;
      this.aEU = ((double[])paramb.aEU.clone());
      this.aEV = paramb.aEV;
      this.aEW = paramb.aEW;
      this.aEX = paramb.aEX;
      this.aEY = paramb.aEY;
      this.aEZ = paramb.aEZ;
      this.aFa = paramb.aFa;
      this.aFb = paramb.aFb;
      this.aFc = paramb.aFc;
      this.aFd = paramb.aFd;
      this.aFe = paramb.aFe;
      this.aFf = paramb.aFf;
      this.aFg = paramb.aFg;
      this.aFh = ((double[])paramb.aFh.clone());
      this.aFi = paramb.aFi;
      this.aFj = paramb.aFj;
      this.aFk = paramb.aFk;
      this.aEC = paramb.aEC;
      this.aFl = ((double[])paramb.aFl.clone());
      this.aFm[0] = ((double[])paramb.aFm[0].clone());
      this.aFm[1] = ((double[])paramb.aFm[1].clone());
      this.aFm[2] = ((double[])paramb.aFm[2].clone());
      this.aFm[3] = ((double[])paramb.aFm[3].clone());
      this.aFn = paramb.aFn;
      this.aFo = paramb.aFo;
      this.aFp = paramb.aFp;
      this.aFq = paramb.aFq;
      this.aFr = paramb.aFr;
      this.aFs = paramb.aFs;
      this.aFt = paramb.aFt;
      this.aFu = paramb.aFu;
      this.aFv = paramb.aFv;
      this.aFw = ((double[])paramb.aFw.clone());
      this.aFx = ((double[])paramb.aFx.clone());
      this.aFy = paramb.aFy;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\d\a\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */