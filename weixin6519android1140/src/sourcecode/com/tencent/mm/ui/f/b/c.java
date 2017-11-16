package com.tencent.mm.ui.f.b;

import android.graphics.drawable.Drawable;
import com.tencent.gmtrace.GMTrace;

public final class c
{
  private static b xaG;
  
  static
  {
    GMTrace.i(20294794215424L, 151208);
    xaG = null;
    GMTrace.o(20294794215424L, 151208);
  }
  
  public static void a(b paramb)
  {
    GMTrace.i(20294525779968L, 151206);
    xaG = paramb;
    GMTrace.o(20294525779968L, 151206);
  }
  
  public static Drawable fq(String paramString1, String paramString2)
  {
    GMTrace.i(20294659997696L, 151207);
    if (xaG != null)
    {
      paramString1 = xaG.bP(paramString1, paramString2);
      if ((paramString1 instanceof Drawable))
      {
        paramString1 = (Drawable)paramString1;
        GMTrace.o(20294659997696L, 151207);
        return paramString1;
      }
      GMTrace.o(20294659997696L, 151207);
      return null;
    }
    GMTrace.o(20294659997696L, 151207);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\f\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */