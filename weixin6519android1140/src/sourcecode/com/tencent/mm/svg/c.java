package com.tencent.mm.svg;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;

public abstract class c
{
  public c()
  {
    GMTrace.i(3489795145728L, 26001);
    GMTrace.o(3489795145728L, 26001);
  }
  
  public static Paint a(Paint paramPaint, Looper paramLooper)
  {
    GMTrace.i(15700252950528L, 116976);
    paramPaint = b.a(paramLooper, paramPaint);
    GMTrace.o(15700252950528L, 116976);
    return paramPaint;
  }
  
  public static float[] a(float[] paramArrayOfFloat, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    GMTrace.i(15700789821440L, 116980);
    if (paramArrayOfFloat != null)
    {
      paramArrayOfFloat[0] = paramFloat1;
      paramArrayOfFloat[1] = paramFloat2;
      paramArrayOfFloat[2] = paramFloat3;
      paramArrayOfFloat[3] = paramFloat4;
      paramArrayOfFloat[4] = paramFloat5;
      paramArrayOfFloat[5] = paramFloat6;
      paramArrayOfFloat[6] = 0.0F;
      paramArrayOfFloat[7] = 0.0F;
      paramArrayOfFloat[8] = 1.0F;
    }
    GMTrace.o(15700789821440L, 116980);
    return paramArrayOfFloat;
  }
  
  public static float[] d(Looper paramLooper)
  {
    GMTrace.i(15700387168256L, 116977);
    paramLooper = b.d(paramLooper);
    GMTrace.o(15700387168256L, 116977);
    return paramLooper;
  }
  
  public static Matrix e(Looper paramLooper)
  {
    GMTrace.i(15700521385984L, 116978);
    paramLooper = b.e(paramLooper);
    GMTrace.o(15700521385984L, 116978);
    return paramLooper;
  }
  
  public static void g(Looper paramLooper)
  {
    GMTrace.i(15699984515072L, 116974);
    if (paramLooper != null) {
      b.c(paramLooper);
    }
    GMTrace.o(15699984515072L, 116974);
  }
  
  public static Paint h(Looper paramLooper)
  {
    GMTrace.i(15700118732800L, 116975);
    paramLooper = b.a(paramLooper, null);
    GMTrace.o(15700118732800L, 116975);
    return paramLooper;
  }
  
  public static Path i(Looper paramLooper)
  {
    GMTrace.i(15700655603712L, 116979);
    paramLooper = b.f(paramLooper);
    GMTrace.o(15700655603712L, 116979);
    return paramLooper;
  }
  
  public abstract int b(int paramInt, Object... paramVarArgs);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\svg\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */