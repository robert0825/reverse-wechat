package com.d.a.a;

import android.location.Location;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

final class s
{
  private long aHb;
  float aHc;
  private ArrayList<String> aHd = new ArrayList();
  private ArrayList<float[]> aHe = new ArrayList();
  private ArrayList<double[]> aHf = new ArrayList();
  public final d aHg;
  Handler aHh;
  
  public s(d paramd)
  {
    this.aHg = paramd;
  }
  
  private static void aN(String paramString)
  {
    o.l("post_processing_log_" + y.aJU, paramString);
  }
  
  private void al(boolean paramBoolean)
  {
    label134:
    label148:
    label222:
    label277:
    label340:
    label500:
    label610:
    label1076:
    label1077:
    label1305:
    label1428:
    label1433:
    label1436:
    label1454:
    label1455:
    label1457:
    label1467:
    label1476:
    label1483:
    label1490:
    label1512:
    label1538:
    label1561:
    for (;;)
    {
      int m;
      int i3;
      int i;
      int n;
      double[] arrayOfDouble1;
      double[] arrayOfDouble2;
      Object localObject1;
      double d2;
      double d3;
      double d4;
      double d5;
      double d1;
      double d6;
      double d7;
      double[] arrayOfDouble3;
      StringBuilder localStringBuilder;
      float f4;
      float f1;
      float f2;
      float f3;
      int k;
      int j;
      float[] arrayOfFloat;
      double[] arrayOfDouble4;
      int i1;
      for (;;)
      {
        int i2;
        try
        {
          if ((!this.aHe.isEmpty()) && (!this.aHf.isEmpty()))
          {
            if (!paramBoolean) {
              break label134;
            }
            m = this.aHf.size();
            i3 = this.aHe.size();
            if (m > 1)
            {
              i = 0;
              n = 1;
              if (n < m) {
                break label148;
              }
              this.aHd.subList(0, i).clear();
              this.aHd.trimToSize();
              this.aHe.subList(0, i).clear();
              this.aHe.trimToSize();
              this.aHf.subList(0, m - 1).clear();
              this.aHf.trimToSize();
            }
          }
          return;
          m = this.aHf.size() - 1;
          break;
          arrayOfDouble1 = (double[])this.aHf.get(n - 1);
          arrayOfDouble2 = (double[])this.aHf.get(n);
          localObject1 = new float[1];
          d2 = arrayOfDouble1[0];
          d3 = arrayOfDouble1[1];
          d4 = arrayOfDouble1[0];
          d5 = arrayOfDouble1[1];
          if (arrayOfDouble1[1] > 179.0D) {
            break label1476;
          }
          d1 = 1.0E-5D;
          Location.distanceBetween(d2, d3, d4, d1 + d5, (float[])localObject1);
          d3 = localObject1[0];
          d2 = arrayOfDouble1[0];
          d4 = arrayOfDouble1[1];
          d5 = arrayOfDouble1[0];
          if (arrayOfDouble1[0] > 89.0D) {
            break label1483;
          }
          d1 = 1.0E-5D;
          Location.distanceBetween(d2, d4, d1 + d5, arrayOfDouble1[1], (float[])localObject1);
          d4 = localObject1[0];
          d5 = arrayOfDouble2[0];
          d6 = arrayOfDouble1[0];
          d2 = arrayOfDouble2[1] - arrayOfDouble1[1];
          if (d2 <= 180.0D) {
            break label1490;
          }
          d1 = d2 - 360.0D;
          d1 = d1 / 1.0E-5D * d3;
          d5 = (d5 - d6) / 1.0E-5D * d4;
          d6 = arrayOfDouble2[4] - arrayOfDouble1[4];
          d7 = arrayOfDouble2[5] - arrayOfDouble1[5];
          d2 = Math.sqrt((d1 * d1 + d5 * d5) / (d6 * d6 + d7 * d7));
          if ((d2 < 1.0F / y.aJX) || (d2 > y.aJX)) {
            break label1454;
          }
          d5 = Math.atan2(d5, d1) - Math.atan2(d7, d6);
          d1 = Math.cos(d5);
          d5 = Math.sin(d5);
          arrayOfDouble3 = new double[4];
          arrayOfDouble3[0] = d1;
          arrayOfDouble3[1] = (-d5);
          arrayOfDouble3[2] = d5;
          arrayOfDouble3[3] = d1;
          if (d2 < 1.0D)
          {
            d1 = d2;
            d1 *= 10.0D;
            d5 = 1.0D + Math.abs(d5);
            localStringBuilder = new StringBuilder();
            f4 = 0.0F;
            if (!y.aJN) {
              break label1436;
            }
            aN("ref_point," + arrayOfDouble1[0] + ',' + arrayOfDouble1[1] + ',' + arrayOfDouble1[2] + ',' + arrayOfDouble1[8]);
            f1 = 0.0F;
            f2 = 0.0F;
            f3 = 0.0F;
            k = 0;
            j = 1;
            break label1457;
            if (y.aJN) {
              aN("ref_point," + arrayOfDouble2[0] + ',' + arrayOfDouble2[1] + ',' + arrayOfDouble2[2] + ',' + arrayOfDouble2[8]);
            }
            if (k > y.aJV) {
              break label1428;
            }
            f2 = f3 - f2;
            if ((f2 <= 0.0F) || ((f4 - f1) * d2 / f2 > y.aJW)) {
              break label1428;
            }
            r.nN().aK(localStringBuilder.toString());
            paramBoolean = true;
            if (y.aJN)
            {
              if (paramBoolean)
              {
                localObject1 = "buffered";
                aN((String)localObject1);
              }
            }
            else
            {
              d(new g(paramBoolean));
              break label1467;
            }
          }
          else
          {
            d1 = 1.0D / d2;
            break label500;
            arrayOfFloat = (float[])this.aHe.get(i);
            if (arrayOfFloat[2] > arrayOfDouble2[6]) {
              break label610;
            }
            arrayOfFloat[3] = Double.valueOf(Math.max(6.0D, Math.min(Math.abs((arrayOfFloat[2] - arrayOfDouble1[6]) / d1) * d5 + arrayOfDouble1[2], Math.abs((arrayOfFloat[2] - arrayOfDouble2[6]) / d1) * d5 + arrayOfDouble2[2]))).floatValue();
            arrayOfDouble4 = new double[2];
            arrayOfDouble4[0] = (arrayOfFloat[0] - arrayOfDouble1[4]);
            arrayOfDouble4[1] = (arrayOfFloat[1] - arrayOfDouble1[5]);
            localObject1 = new double[2];
            arrayOfDouble4[0] *= d2;
            arrayOfDouble4[1] *= d2;
            arrayOfDouble4 = new double[2];
            arrayOfDouble4[0] = (localObject1[0] * arrayOfDouble3[0] + localObject1[1] * arrayOfDouble3[1]);
            arrayOfDouble4[1] = (localObject1[0] * arrayOfDouble3[2] + localObject1[1] * arrayOfDouble3[3]);
            localObject1 = new double[2];
            arrayOfDouble4[0] += 0.0D;
            arrayOfDouble4[1] += 0.0D;
            arrayOfDouble4 = new double[2];
            arrayOfDouble4[0] = (1.0E-5D * localObject1[1] / d4 + arrayOfDouble1[0]);
            arrayOfDouble4[1] = (1.0E-5D * localObject1[0] / d3 + arrayOfDouble1[1]);
            if (arrayOfDouble4[0] > 90.0D)
            {
              arrayOfDouble4[0] = (180.0D - arrayOfDouble4[0]);
              break label1512;
              if (y.aJN) {
                aN("scan_point," + arrayOfDouble4[0] + ',' + arrayOfDouble4[1] + ',' + arrayOfFloat[3]);
              }
              localObject1 = (String)this.aHd.get(i);
              i2 = Math.round(arrayOfFloat[3]);
              i1 = k;
              if (i2 > k) {
                i1 = i2;
              }
              k = Math.round(arrayOfFloat[4]);
              if (localObject1 == null) {}
            }
          }
        }
        finally {}
        try
        {
          localStringBuilder.append((String)localObject1);
          d6 = arrayOfDouble4[0];
          d7 = arrayOfDouble4[1];
          if (v.c(d6, d7)) {
            break label1305;
          }
          localObject1 = "";
          localStringBuilder.append((String)localObject1);
        }
        catch (Error localError)
        {
          String str;
          continue;
        }
        if (j == 0) {
          break label1433;
        }
        f2 = arrayOfFloat[5];
        f1 = arrayOfFloat[2];
        j = 0;
        break label1538;
        if (arrayOfDouble4[0] >= -90.0D) {
          break label1512;
        }
        arrayOfDouble4[0] = (-180.0D - arrayOfDouble4[0]);
        break label1512;
        if (arrayOfDouble4[1] < -180.0D)
        {
          arrayOfDouble4[1] += 360.0D;
          continue;
          str = "|MD," + d6 + ',' + d7 + ',' + i2 + ',' + k + ',' + "";
        }
      }
      str = "discarded";
      continue;
      for (;;)
      {
        d1 = ((float[])this.aHe.get(i))[2];
        d2 = arrayOfDouble2[6];
        if (d1 <= d2) {
          i += 1;
        }
        for (;;)
        {
          if (i < i3) {
            break label1455;
          }
          break label1467;
          paramBoolean = false;
          break;
          break label1538;
          f1 = 0.0F;
          f2 = 0.0F;
          f3 = 0.0F;
          k = 0;
          j = 1;
          break label1457;
        }
      }
      for (;;)
      {
        if (i < i3) {
          break label1561;
        }
        break label610;
        n += 1;
        break;
        d1 = -1.0E-5D;
        break label222;
        d1 = -1.0E-5D;
        break label277;
        d1 = d2;
        if (d2 >= -180.0D) {
          break label340;
        }
        d1 = d2 + 360.0D;
        break label340;
        if (arrayOfDouble4[1] <= 180.0D) {
          break label1076;
        }
        arrayOfDouble4[1] -= 360.0D;
        break label1077;
        f3 = arrayOfFloat[5];
        f4 = arrayOfFloat[2];
        i += 1;
        k = i1;
      }
    }
  }
  
  private void d(p paramp)
  {
    if (this.aHh != null) {
      this.aHh.post(new d(paramp));
    }
  }
  
  private void nY()
  {
    try
    {
      this.aHf.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void nZ()
  {
    try
    {
      this.aHd.clear();
      this.aHe.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8)
  {
    for (;;)
    {
      try
      {
        int j = this.aHf.size();
        int i = this.aHd.size();
        if (j <= 0)
        {
          this.aHf.add(new double[] { paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, paramDouble7, i, paramDouble8 });
          i = 1;
          if (i != 0)
          {
            i = this.aHf.size();
            d(new e(i));
            if (i == 1) {
              nZ();
            }
          }
          return;
        }
        double[] arrayOfDouble1 = (double[])this.aHf.get(j - 1);
        float[] arrayOfFloat;
        if (paramDouble8 - arrayOfDouble1[8] < 30000.0D)
        {
          if (paramDouble4 >= arrayOfDouble1[3])
          {
            arrayOfFloat = new float[1];
            arrayOfFloat[0] = 30.0F;
            if (j > 1)
            {
              double[] arrayOfDouble2 = (double[])this.aHf.get(j - 2);
              Location.distanceBetween(arrayOfDouble2[0], arrayOfDouble2[1], paramDouble1, paramDouble2, arrayOfFloat);
            }
            if (arrayOfFloat[0] >= 30.0F)
            {
              double d = i;
              i = arrayOfDouble1.length;
              System.arraycopy(new double[] { paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, paramDouble7, d, paramDouble8 }, 0, arrayOfDouble1, 0, i);
              i = 1;
            }
          }
        }
        else
        {
          arrayOfFloat = new float[1];
          Location.distanceBetween(arrayOfDouble1[0], arrayOfDouble1[1], paramDouble1, paramDouble2, arrayOfFloat);
          if (arrayOfFloat[0] >= 30.0F)
          {
            this.aHf.add(new double[] { paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, paramDouble7, i, paramDouble8 });
            i = 1;
            if (j >= 8)
            {
              this.aHf.subList(0, 1).clear();
              this.aHf.trimToSize();
            }
            try
            {
              al(false);
            }
            catch (Exception localException) {}
            continue;
          }
        }
        i = 0;
      }
      finally {}
    }
  }
  
  public final void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt, String paramString)
  {
    try
    {
      this.aHd.add(paramString);
      this.aHe.add(new float[] { paramFloat1, paramFloat2, paramFloat3, 0.0F, paramInt, paramFloat4 });
      if (this.aHd.size() > 256)
      {
        this.aHd.subList(0, 1).clear();
        this.aHd.trimToSize();
        if (this.aHe.size() > 256)
        {
          this.aHe.subList(0, 1).clear();
          this.aHe.trimToSize();
        }
      }
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  final boolean a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, double paramDouble4, double paramDouble5, double paramDouble6, long paramLong)
  {
    if (paramFloat < y.aJY) {
      return false;
    }
    if ((paramLong - this.aHb < 1000L) && (paramFloat <= this.aHc)) {
      return false;
    }
    z.b(null).execute(new b(paramDouble1, paramDouble2, paramDouble3, paramFloat, paramDouble4, paramDouble5, paramDouble6, paramLong));
    this.aHb = paramLong;
    this.aHc = paramFloat;
    return true;
  }
  
  final void nV()
  {
    z.b(null).execute(new c());
  }
  
  public final void nW()
  {
    try
    {
      al(true);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException = localException;
      }
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  final void nX()
  {
    this.aHb = 0L;
    this.aHc = 0.0F;
    z.b(null).execute(new f());
  }
  
  public final void reset()
  {
    try
    {
      nY();
      nZ();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private final class a
    implements Runnable
  {
    final int aGl;
    final float aHi;
    final float aHj;
    final String aHk;
    final float x;
    final float y;
    
    public a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt, String paramString)
    {
      this.x = paramFloat1;
      this.y = paramFloat2;
      this.aHi = paramFloat3;
      this.aHj = paramFloat4;
      this.aGl = paramInt;
      this.aHk = paramString;
    }
    
    public final void run()
    {
      s.this.a(this.x, this.y, this.aHi, this.aHj, this.aGl, this.aHk);
    }
  }
  
  private final class b
    implements Runnable
  {
    final double aHm;
    final double aHn;
    final double aHo;
    final double aHp;
    final double aHq;
    final double aHr;
    final double lat;
    final double lng;
    
    public b(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8)
    {
      this.lat = paramDouble1;
      this.lng = paramDouble2;
      this.aHm = paramDouble3;
      this.aHn = paramDouble4;
      this.aHo = paramDouble5;
      this.aHp = paramDouble6;
      this.aHq = paramDouble7;
      this.aHr = paramDouble8;
    }
    
    public final void run()
    {
      s.this.a(this.lat, this.lng, this.aHm, this.aHn, this.aHo, this.aHp, this.aHq, this.aHr);
    }
  }
  
  private final class c
    implements Runnable
  {
    public c() {}
    
    public final void run()
    {
      s.this.nW();
    }
  }
  
  private final class d
    implements Runnable
  {
    private final p aDG;
    
    public d(p paramp)
    {
      this.aDG = paramp;
    }
    
    public final void run()
    {
      s.this.aHg.c(this.aDG);
    }
  }
  
  static final class e
    extends p
  {
    final int aHs;
    
    e(int paramInt)
    {
      super();
      this.aHs = paramInt;
    }
  }
  
  private final class f
    implements Runnable
  {
    public f() {}
    
    public final void run()
    {
      s.this.reset();
    }
  }
  
  static final class g
    extends p
  {
    final boolean aHt;
    
    g(boolean paramBoolean)
    {
      super();
      this.aHt = paramBoolean;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\d\a\a\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */