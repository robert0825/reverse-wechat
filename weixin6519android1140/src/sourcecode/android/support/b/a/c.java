package android.support.b.a;

import android.graphics.Path;
import java.util.ArrayList;

final class c
{
  private static void a(ArrayList<b> paramArrayList, char paramChar, float[] paramArrayOfFloat)
  {
    paramArrayList.add(new b(paramChar, paramArrayOfFloat));
  }
  
  public static float[] a(float[] paramArrayOfFloat, int paramInt)
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException();
    }
    int i = paramArrayOfFloat.length;
    if (i < 0) {
      throw new ArrayIndexOutOfBoundsException();
    }
    paramInt += 0;
    i = Math.min(paramInt, i + 0);
    float[] arrayOfFloat = new float[paramInt];
    System.arraycopy(paramArrayOfFloat, 0, arrayOfFloat, 0, i);
    return arrayOfFloat;
  }
  
  public static b[] a(b[] paramArrayOfb)
  {
    if (paramArrayOfb == null) {
      return null;
    }
    b[] arrayOfb = new b[paramArrayOfb.length];
    int i = 0;
    while (i < paramArrayOfb.length)
    {
      arrayOfb[i] = new b(paramArrayOfb[i]);
      i += 1;
    }
    return arrayOfb;
  }
  
  private static int b(String paramString, int paramInt)
  {
    for (;;)
    {
      if (paramInt < paramString.length())
      {
        int i = paramString.charAt(paramInt);
        if ((((i - 65) * (i - 90) > 0) && ((i - 97) * (i - 122) > 0)) || (i == 101) || (i == 69)) {}
      }
      else
      {
        return paramInt;
      }
      paramInt += 1;
    }
  }
  
  public static b[] g(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int j = 1;
    int i = 0;
    while (j < paramString.length())
    {
      j = b(paramString, j);
      String str = paramString.substring(i, j).trim();
      if (str.length() > 0)
      {
        float[] arrayOfFloat = h(str);
        a(localArrayList, str.charAt(0), arrayOfFloat);
      }
      int k = j + 1;
      i = j;
      j = k;
    }
    if ((j - i == 1) && (i < paramString.length())) {
      a(localArrayList, paramString.charAt(i), new float[0]);
    }
    return (b[])localArrayList.toArray(new b[localArrayList.size()]);
  }
  
  private static float[] h(String paramString)
  {
    int i;
    if (paramString.charAt(0) == 'z')
    {
      i = 1;
      if (paramString.charAt(0) != 'Z') {
        break label39;
      }
    }
    label39:
    for (int j = 1;; j = 0)
    {
      if ((i | j) == 0) {
        break label44;
      }
      return new float[0];
      i = 0;
      break;
    }
    for (;;)
    {
      label44:
      int i1;
      try
      {
        float[] arrayOfFloat = new float[paramString.length()];
        a locala = new a();
        int i3 = paramString.length();
        n = 1;
        m = 0;
        if (n < i3)
        {
          locala.lr = false;
          k = 0;
          i = 0;
          j = 0;
          i1 = n;
          if (i1 >= paramString.length()) {}
        }
        switch (paramString.charAt(i1))
        {
        case '-': 
          if ((i1 == n) || (k != 0)) {
            break label316;
          }
          locala.lr = true;
          j = i;
          k = 1;
          i = 0;
          break label326;
          label194:
          locala.lr = true;
          j = i;
          k = 1;
          i = 0;
          break label326;
          locala.lq = i1;
          j = locala.lq;
          if (n < j)
          {
            i = m + 1;
            arrayOfFloat[m] = Float.parseFloat(paramString.substring(n, j));
            if (!locala.lr) {
              break label384;
            }
            n = j;
            m = i;
            continue;
            arrayOfFloat = a(arrayOfFloat, m);
            return arrayOfFloat;
          }
          break;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new RuntimeException("error in parsing \"" + paramString + "\"", localNumberFormatException);
      }
      i = m;
      continue;
      label316:
      int i2 = 0;
      int k = j;
      j = i;
      i = i2;
      for (;;)
      {
        label326:
        if (k != 0) {
          break label382;
        }
        i2 = i1 + 1;
        i1 = i;
        i = j;
        j = k;
        k = i1;
        i1 = i2;
        break;
        j = i;
        k = 1;
        i = 0;
        continue;
        if (i != 0) {
          break label194;
        }
        i = 0;
        k = j;
        j = 1;
        continue;
        k = j;
        j = i;
        i = 1;
      }
      label382:
      continue;
      label384:
      int n = j + 1;
      int m = i;
    }
  }
  
  private static final class a
  {
    int lq;
    boolean lr;
  }
  
  public static final class b
  {
    char ls;
    float[] lt;
    
    public b(char paramChar, float[] paramArrayOfFloat)
    {
      this.ls = paramChar;
      this.lt = paramArrayOfFloat;
    }
    
    public b(b paramb)
    {
      this.ls = paramb.ls;
      this.lt = c.a(paramb.lt, paramb.lt.length);
    }
    
    private static void a(Path paramPath, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9)
    {
      int j = (int)Math.ceil(Math.abs(4.0D * paramDouble9 / 3.141592653589793D));
      double d6 = Math.cos(paramDouble7);
      double d7 = Math.sin(paramDouble7);
      paramDouble7 = Math.cos(paramDouble8);
      double d2 = Math.sin(paramDouble8);
      double d1 = -paramDouble3 * d6 * d2 - paramDouble4 * d7 * paramDouble7;
      d2 = paramDouble7 * (paramDouble4 * d6) + d2 * (-paramDouble3 * d7);
      double d8 = paramDouble9 / j;
      int i = 0;
      paramDouble9 = paramDouble8;
      paramDouble8 = paramDouble6;
      paramDouble7 = paramDouble5;
      paramDouble6 = d1;
      double d3;
      for (paramDouble5 = d2; i < j; paramDouble5 = d3)
      {
        double d4 = paramDouble9 + d8;
        d3 = Math.sin(d4);
        double d9 = Math.cos(d4);
        d1 = paramDouble3 * d6 * d9 + paramDouble1 - paramDouble4 * d7 * d3;
        d2 = paramDouble4 * d6 * d3 + (paramDouble3 * d7 * d9 + paramDouble2);
        double d5 = -paramDouble3 * d6 * d3 - paramDouble4 * d7 * d9;
        d3 = d9 * (paramDouble4 * d6) + d3 * (-paramDouble3 * d7);
        d9 = Math.tan((d4 - paramDouble9) / 2.0D);
        paramDouble9 = Math.sin(d4 - paramDouble9);
        paramDouble9 = (Math.sqrt(d9 * (3.0D * d9) + 4.0D) - 1.0D) * paramDouble9 / 3.0D;
        paramPath.cubicTo((float)(paramDouble6 * paramDouble9 + paramDouble7), (float)(paramDouble8 + paramDouble5 * paramDouble9), (float)(d1 - paramDouble9 * d5), (float)(d2 - paramDouble9 * d3), (float)d1, (float)d2);
        paramDouble6 = d5;
        paramDouble9 = d4;
        i += 1;
        paramDouble8 = d2;
        paramDouble7 = d1;
      }
    }
    
    static void a(Path paramPath, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, boolean paramBoolean1, boolean paramBoolean2)
    {
      double d5;
      double d6;
      double d7;
      double d8;
      double d9;
      double d4;
      double d11;
      double d10;
      double d3;
      double d2;
      double d13;
      for (;;)
      {
        d5 = Math.toRadians(paramFloat7);
        d6 = Math.cos(d5);
        d7 = Math.sin(d5);
        d8 = (paramFloat1 * d6 + paramFloat2 * d7) / paramFloat5;
        d9 = (-paramFloat1 * d7 + paramFloat2 * d6) / paramFloat6;
        d1 = (paramFloat3 * d6 + paramFloat4 * d7) / paramFloat5;
        d4 = (-paramFloat3 * d7 + paramFloat4 * d6) / paramFloat6;
        d11 = d8 - d1;
        d10 = d9 - d4;
        d3 = (d8 + d1) / 2.0D;
        d2 = (d9 + d4) / 2.0D;
        d12 = d11 * d11 + d10 * d10;
        if (d12 == 0.0D) {
          return;
        }
        d13 = 1.0D / d12 - 0.25D;
        if (d13 >= 0.0D) {
          break;
        }
        float f = (float)(Math.sqrt(d12) / 1.99999D);
        paramFloat5 *= f;
        paramFloat6 *= f;
      }
      double d12 = Math.sqrt(d13);
      d11 *= d12;
      d10 *= d12;
      if (paramBoolean1 == paramBoolean2)
      {
        d3 -= d10;
        d2 = d11 + d2;
        d8 = Math.atan2(d9 - d2, d8 - d3);
        d4 = Math.atan2(d4 - d2, d1 - d3) - d8;
        if (d4 < 0.0D) {
          break label384;
        }
        paramBoolean1 = true;
        label282:
        d1 = d4;
        if (paramBoolean2 != paramBoolean1) {
          if (d4 <= 0.0D) {
            break label390;
          }
        }
      }
      label384:
      label390:
      for (double d1 = d4 - 6.283185307179586D;; d1 = d4 + 6.283185307179586D)
      {
        d3 *= paramFloat5;
        d2 = paramFloat6 * d2;
        a(paramPath, d3 * d6 - d2 * d7, d3 * d7 + d6 * d2, paramFloat5, paramFloat6, paramFloat1, paramFloat2, d5, d8, d1);
        return;
        d3 = d10 + d3;
        d2 -= d11;
        break;
        paramBoolean1 = false;
        break label282;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\b\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */