package com.tencent.mm.bo.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.DisplayMetrics;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.qbar.QbarNative;
import java.util.Arrays;

public final class a
{
  public static Bitmap a(Context paramContext, Bitmap paramBitmap, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt)
  {
    GMTrace.i(20352642056192L, 151639);
    paramInt = paramBitmap.getWidth();
    int j = BackwardSupportUtil.b.a(paramContext, 197.0F);
    int i = j;
    if (j < paramInt) {
      i = paramInt;
    }
    j = (int)(paramArrayOfInt[0] * 0.1D);
    i /= (paramArrayOfInt[0] + j * 2);
    if (i == 0) {
      i = 1;
    }
    for (;;)
    {
      int i4 = j * i;
      int k = i * (paramArrayOfInt[0] + j * 2);
      int m = paramArrayOfInt[1] * i + j * (i * 2);
      j = k;
      if (k < paramInt) {
        j = paramInt;
      }
      k = m;
      if (m < paramInt) {
        k = paramInt;
      }
      paramContext = Bitmap.createBitmap(j, k, Bitmap.Config.ARGB_8888);
      int[] arrayOfInt = new int[j * k];
      m = (j - paramInt) / 2;
      int i1 = 0;
      int n = m;
      while ((n < j - m) && (i1 < paramInt))
      {
        int i2 = 0;
        int i3 = m;
        while ((i3 < k - m) && (i2 < paramInt))
        {
          arrayOfInt[(n * j + i3)] = paramBitmap.getPixel(i2, i1);
          i3 += 1;
          i2 += 1;
        }
        i1 += 1;
        n += 1;
      }
      paramInt = 0;
      while (paramInt < paramArrayOfInt[1])
      {
        m = 0;
        while (m < paramArrayOfInt[0])
        {
          if (paramArrayOfByte[(paramArrayOfInt[0] * paramInt + m)] == 1)
          {
            n = 0;
            while (n < i)
            {
              i1 = 0;
              while (i1 < i)
              {
                if (arrayOfInt[((paramInt * i + i4 + n) * j + m * i + i4 + i1)] == 0) {
                  arrayOfInt[((paramInt * i + i4 + n) * j + m * i + i4 + i1)] = -16777216;
                }
                i1 += 1;
              }
              n += 1;
            }
          }
          n = 0;
          while (n < i)
          {
            i1 = 0;
            while (i1 < i)
            {
              if (arrayOfInt[((paramInt * i + i4 + n) * j + m * i + i4 + i1)] == 0) {
                arrayOfInt[((paramInt * i + i4 + n) * j + m * i + i4 + i1)] = -1;
              }
              i1 += 1;
            }
            n += 1;
          }
          m += 1;
        }
        paramInt += 1;
      }
      paramContext.setPixels(arrayOfInt, 0, j, 0, 0, j, k);
      GMTrace.o(20352642056192L, 151639);
      return paramContext;
    }
  }
  
  public static Bitmap b(Context paramContext, String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(1425660706816L, 10622);
    byte[] arrayOfByte = new byte[40000];
    int[] arrayOfInt = new int[2];
    int n = QbarNative.a(arrayOfByte, arrayOfInt, paramString, paramInt1, paramInt2, "UTF-8");
    QbarNative.nativeRelease();
    int i;
    int j;
    if (n > 0)
    {
      paramContext = paramContext.getResources().getDisplayMetrics();
      paramInt2 = paramContext.widthPixels;
      i = paramContext.heightPixels;
      if (paramInt2 < i)
      {
        i = (int)(paramInt2 * 0.8D);
        j = (int)(arrayOfInt[0] * 0.1D);
        paramInt2 = 0;
        if (paramInt1 != 0) {
          break label278;
        }
        paramInt2 = i / (arrayOfInt[0] + j * 2);
        paramInt1 = paramInt2;
        if (paramInt2 == 0) {
          paramInt1 = 1;
        }
        paramInt2 = paramInt1;
      }
    }
    for (;;)
    {
      label118:
      int i1 = j * paramInt2;
      int i2 = (arrayOfInt[0] + j * 2) * paramInt2;
      int i3 = arrayOfInt[1] * paramInt1 + j * (paramInt2 * 2);
      paramContext = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
      paramString = new int[i2 * i3];
      Arrays.fill(paramString, -1);
      i = 0;
      for (;;)
      {
        if (i >= arrayOfInt[1]) {
          break label415;
        }
        j = 0;
        for (;;)
        {
          if (j >= arrayOfInt[0]) {
            break label406;
          }
          int m;
          if (arrayOfByte[(arrayOfInt[0] * i + j)] == 1)
          {
            k = 0;
            for (;;)
            {
              if (k >= paramInt1) {
                break label397;
              }
              m = 0;
              for (;;)
              {
                if (m < paramInt2)
                {
                  paramString[((i * paramInt1 + i1 + k) * i2 + j * paramInt2 + i1 + m)] = -16777216;
                  m += 1;
                  continue;
                  paramInt2 = i;
                  break;
                  label278:
                  if (paramInt1 != 5) {
                    break label529;
                  }
                  paramInt2 = i / (arrayOfInt[0] + j * 2);
                  paramInt1 = paramInt2;
                  if (paramInt2 == 0) {
                    paramInt1 = 1;
                  }
                  i = arrayOfInt[0] * paramInt1 / arrayOfInt[1];
                  paramInt2 = paramInt1;
                  paramInt1 = i;
                  break label118;
                }
              }
              k += 1;
            }
          }
          int k = 0;
          while (k < paramInt1)
          {
            m = 0;
            while (m < paramInt2)
            {
              paramString[((i * paramInt1 + i1 + k) * i2 + j * paramInt2 + i1 + m)] = -1;
              m += 1;
            }
            k += 1;
          }
          label397:
          j += 1;
        }
        label406:
        i += 1;
      }
      label415:
      paramContext.setPixels(paramString, 0, i2, 0, 0, i2, i3);
      if (paramContext == null) {
        w.i("MicroMsg.QRCodeBitmapFactory", "createBitmap bm is error result %d %s", new Object[] { Integer.valueOf(n), bg.bQW().toString() });
      }
      for (;;)
      {
        GMTrace.o(1425660706816L, 10622);
        return paramContext;
        w.i("MicroMsg.QRCodeBitmapFactory", "createBitmap %s", new Object[] { paramContext });
      }
      w.i("MicroMsg.QRCodeBitmapFactory", "result %d %s", new Object[] { Integer.valueOf(n), bg.bQW().toString() });
      GMTrace.o(1425660706816L, 10622);
      return null;
      label529:
      i = 0;
      paramInt1 = paramInt2;
      paramInt2 = i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\bo\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */