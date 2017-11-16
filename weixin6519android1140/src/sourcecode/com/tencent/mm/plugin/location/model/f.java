package com.tencent.mm.plugin.location.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.q;

public final class f
{
  private static double mwQ;
  private static double mwR;
  private static double mwS;
  private static double mwT;
  
  static
  {
    GMTrace.i(9635624910848L, 71791);
    mwQ = -85.0D;
    mwR = -1000.0D;
    mwS = -85.0D;
    mwT = -1000.0D;
    GMTrace.o(9635624910848L, 71791);
  }
  
  public static boolean a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt, double paramDouble5)
  {
    GMTrace.i(9635222257664L, 71788);
    boolean bool = false;
    if (paramInt == 0)
    {
      if (paramDouble5 == 0.0D) {
        bool = false;
      }
      while (paramDouble5 <= 0.0D)
      {
        GMTrace.o(9635222257664L, 71788);
        return bool;
      }
    }
    label136:
    for (;;)
    {
      bool = true;
      break;
      if (paramInt != 1) {
        break;
      }
      if ((paramDouble2 == -85.0D) || (paramDouble1 == -1000.0D)) {
        paramInt = 0;
      }
      for (;;)
      {
        if (paramInt != 0) {
          break label136;
        }
        bool = false;
        break;
        if ((paramDouble3 == -1000.0D) || (paramDouble4 == -85.0D)) {
          paramInt = 0;
        } else if (q.d(paramDouble2, paramDouble1, paramDouble4, paramDouble3) >= 5.0D) {
          paramInt = 1;
        } else {
          paramInt = 0;
        }
      }
    }
  }
  
  public static double i(double paramDouble1, double paramDouble2)
  {
    GMTrace.i(9635088039936L, 71787);
    mwS = paramDouble1;
    mwT = paramDouble2;
    if ((mwQ == -85.0D) || (mwR == -1000.0D)) {}
    for (paramDouble1 = 0.0D;; paramDouble1 = Math.atan2(mwT - mwR, mwS - mwQ) * 180.0D / 3.141592D)
    {
      mwQ = mwS;
      mwR = mwT;
      GMTrace.o(9635088039936L, 71787);
      return paramDouble1;
    }
  }
  
  public static double j(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(9635356475392L, 71789);
    double d = Math.sqrt((paramInt1 - paramInt3) * (paramInt1 - paramInt3) + (paramInt2 - paramInt4) * (paramInt2 - paramInt4));
    GMTrace.o(9635356475392L, 71789);
    return d;
  }
  
  public static boolean k(double paramDouble)
  {
    GMTrace.i(9635490693120L, 71790);
    if (paramDouble >= 4.0D)
    {
      GMTrace.o(9635490693120L, 71790);
      return true;
    }
    GMTrace.o(9635490693120L, 71790);
    return false;
  }
  
  public static float u(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(9634819604480L, 71785);
    if ((paramFloat1 >= 0.0F) && (paramFloat1 <= 45.0F) && (paramFloat2 >= 315.0F) && (paramFloat2 < 360.0F))
    {
      GMTrace.o(9634819604480L, 71785);
      return paramFloat2 - 360.0F;
    }
    if ((paramFloat1 >= 315.0F) && (paramFloat1 < 360.0F) && (paramFloat2 >= 0.0F) && (paramFloat2 <= 45.0F))
    {
      GMTrace.o(9634819604480L, 71785);
      return paramFloat2;
    }
    GMTrace.o(9634819604480L, 71785);
    return paramFloat2;
  }
  
  public static float v(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(9634953822208L, 71786);
    if ((paramFloat1 >= 0.0F) && (paramFloat1 <= 45.0F) && (paramFloat2 >= 315.0F) && (paramFloat2 < 360.0F))
    {
      GMTrace.o(9634953822208L, 71786);
      return paramFloat1;
    }
    if ((paramFloat1 >= 315.0F) && (paramFloat1 < 360.0F) && (paramFloat2 >= 0.0F) && (paramFloat2 <= 45.0F))
    {
      GMTrace.o(9634953822208L, 71786);
      return paramFloat1 - 360.0F;
    }
    GMTrace.o(9634953822208L, 71786);
    return paramFloat1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\model\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */