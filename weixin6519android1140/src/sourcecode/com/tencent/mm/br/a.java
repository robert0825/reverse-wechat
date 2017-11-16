package com.tencent.mm.br;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.SparseIntArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  private static float density;
  private static float fWN;
  private static a vej;
  private static SparseIntArray vek;
  
  static
  {
    GMTrace.i(13990721748992L, 104239);
    vej = null;
    density = -1.0F;
    vek = new SparseIntArray();
    fWN = 0.0F;
    GMTrace.o(13990721748992L, 104239);
  }
  
  public static ColorStateList U(Context paramContext, int paramInt)
  {
    GMTrace.i(13988574265344L, 104223);
    if (vej == null)
    {
      if (paramContext == null)
      {
        w.e("MicroMsg.ResourceHelper", "get color state list, resId %d, but context is null", new Object[] { Integer.valueOf(paramInt) });
        GMTrace.o(13988574265344L, 104223);
        return null;
      }
      paramContext = paramContext.getResources().getColorStateList(paramInt);
      GMTrace.o(13988574265344L, 104223);
      return paramContext;
    }
    paramContext = vej.bOx();
    GMTrace.o(13988574265344L, 104223);
    return paramContext;
  }
  
  public static int V(Context paramContext, int paramInt)
  {
    float f1 = 1.625F;
    GMTrace.i(13988842700800L, 104225);
    float f2 = fWN;
    if (f2 > 1.625F) {}
    for (;;)
    {
      if (vej == null)
      {
        if (paramContext == null)
        {
          w.e("MicroMsg.ResourceHelper", "get dimension pixel size, resId %d, but context is null", new Object[] { Integer.valueOf(paramInt) });
          GMTrace.o(13988842700800L, 104225);
          return 0;
        }
        j = vek.get(paramInt, 0);
        i = j;
        if (j == 0)
        {
          i = paramContext.getResources().getDimensionPixelSize(paramInt);
          vek.put(paramInt, i);
        }
        paramInt = (int)(f1 * i);
        GMTrace.o(13988842700800L, 104225);
        return paramInt;
      }
      int j = vek.get(paramInt, 0);
      int i = j;
      if (j == 0)
      {
        i = vej.bOz();
        vek.put(paramInt, i);
      }
      paramInt = (int)(f1 * i);
      GMTrace.o(13988842700800L, 104225);
      return paramInt;
      f1 = f2;
    }
  }
  
  public static int W(Context paramContext, int paramInt)
  {
    GMTrace.i(13988976918528L, 104226);
    if (vej == null)
    {
      if (paramContext == null)
      {
        w.e("MicroMsg.ResourceHelper", "get dimension pixel size, resId %d, but context is null", new Object[] { Integer.valueOf(paramInt) });
        GMTrace.o(13988976918528L, 104226);
        return 0;
      }
      j = vek.get(paramInt, 0);
      i = j;
      if (j == 0)
      {
        i = paramContext.getResources().getDimensionPixelSize(paramInt);
        vek.put(paramInt, i);
      }
      GMTrace.o(13988976918528L, 104226);
      return i;
    }
    int j = vek.get(paramInt, 0);
    int i = j;
    if (j == 0)
    {
      i = vej.bOz();
      vek.put(paramInt, i);
    }
    GMTrace.o(13988976918528L, 104226);
    return i;
  }
  
  public static String X(Context paramContext, int paramInt)
  {
    GMTrace.i(13989111136256L, 104227);
    if (vej == null)
    {
      if (paramContext == null)
      {
        w.e("MicroMsg.ResourceHelper", "get string, resId %d, but context is null", new Object[] { Integer.valueOf(paramInt) });
        GMTrace.o(13989111136256L, 104227);
        return "";
      }
      paramContext = paramContext.getResources().getString(paramInt);
      GMTrace.o(13989111136256L, 104227);
      return paramContext;
    }
    paramContext = vej.bOA();
    GMTrace.o(13989111136256L, 104227);
    return paramContext;
  }
  
  public static int Y(Context paramContext, int paramInt)
  {
    GMTrace.i(13989513789440L, 104230);
    paramInt = Math.round(paramInt / getDensity(paramContext));
    GMTrace.o(13989513789440L, 104230);
    return paramInt;
  }
  
  public static Drawable b(Context paramContext, int paramInt)
  {
    GMTrace.i(13988708483072L, 104224);
    if (vej == null)
    {
      if (paramContext == null)
      {
        w.e("MicroMsg.ResourceHelper", "get drawable, resId %d, but context is null", new Object[] { Integer.valueOf(paramInt) });
        GMTrace.o(13988708483072L, 104224);
        return null;
      }
      paramContext = paramContext.getResources().getDrawable(paramInt);
      GMTrace.o(13988708483072L, 104224);
      return paramContext;
    }
    paramContext = vej.bOy();
    GMTrace.o(13988708483072L, 104224);
    return paramContext;
  }
  
  public static int c(Context paramContext, int paramInt)
  {
    GMTrace.i(13988440047616L, 104222);
    if (vej == null)
    {
      if (paramContext == null)
      {
        w.e("MicroMsg.ResourceHelper", "get color, resId %d, but context is null", new Object[] { Integer.valueOf(paramInt) });
        GMTrace.o(13988440047616L, 104222);
        return 0;
      }
      paramInt = paramContext.getResources().getColor(paramInt);
      GMTrace.o(13988440047616L, 104222);
      return paramInt;
    }
    paramInt = vej.bOw();
    GMTrace.o(13988440047616L, 104222);
    return paramInt;
  }
  
  public static float dZ(Context paramContext)
  {
    GMTrace.i(13989648007168L, 104231);
    if (fWN == 0.0F) {
      if (paramContext != null) {
        break label38;
      }
    }
    label38:
    for (fWN = 1.0F;; fWN = paramContext.getSharedPreferences(ab.bPU(), 0).getFloat("text_size_scale_key", 1.0F))
    {
      float f = fWN;
      GMTrace.o(13989648007168L, 104231);
      return f;
    }
  }
  
  public static void e(Context paramContext, float paramFloat)
  {
    GMTrace.i(13990050660352L, 104234);
    paramContext = paramContext.getSharedPreferences(ab.bPU(), 0).edit();
    paramContext.putFloat("text_size_scale_key", paramFloat);
    paramContext.commit();
    fWN = paramFloat;
    GMTrace.o(13990050660352L, 104234);
  }
  
  public static int ea(Context paramContext)
  {
    GMTrace.i(15300686774272L, 113999);
    float f = dZ(paramContext);
    if (f == 0.875F)
    {
      GMTrace.o(15300686774272L, 113999);
      return 1;
    }
    if (f == 1.0F)
    {
      GMTrace.o(15300686774272L, 113999);
      return 2;
    }
    if (f == 1.125F)
    {
      GMTrace.o(15300686774272L, 113999);
      return 3;
    }
    if (f == 1.25F)
    {
      GMTrace.o(15300686774272L, 113999);
      return 4;
    }
    if (f == 1.375F)
    {
      GMTrace.o(15300686774272L, 113999);
      return 5;
    }
    if (f == 1.625F)
    {
      GMTrace.o(15300686774272L, 113999);
      return 6;
    }
    if (f == 1.875F)
    {
      GMTrace.o(15300686774272L, 113999);
      return 7;
    }
    if (f == 2.025F)
    {
      GMTrace.o(15300686774272L, 113999);
      return 8;
    }
    GMTrace.o(15300686774272L, 113999);
    return 2;
  }
  
  public static float eb(Context paramContext)
  {
    GMTrace.i(13989782224896L, 104232);
    float f = 1.0F;
    if (ed(paramContext)) {
      f = 1.3F;
    }
    GMTrace.o(13989782224896L, 104232);
    return f;
  }
  
  public static float ec(Context paramContext)
  {
    GMTrace.i(13989916442624L, 104233);
    float f = 1.0F;
    if (ed(paramContext)) {
      f = 1.2F;
    }
    GMTrace.o(13989916442624L, 104233);
    return f;
  }
  
  public static boolean ed(Context paramContext)
  {
    GMTrace.i(13990184878080L, 104235);
    float f = dZ(paramContext);
    fWN = f;
    if (Float.compare(f, 1.125F) > 0)
    {
      GMTrace.o(13990184878080L, 104235);
      return true;
    }
    GMTrace.o(13990184878080L, 104235);
    return false;
  }
  
  public static boolean ee(Context paramContext)
  {
    GMTrace.i(13990319095808L, 104236);
    float f = dZ(paramContext);
    fWN = f;
    if (f == 0.875F)
    {
      GMTrace.o(13990319095808L, 104236);
      return true;
    }
    GMTrace.o(13990319095808L, 104236);
    return false;
  }
  
  public static int ef(Context paramContext)
  {
    GMTrace.i(13990453313536L, 104237);
    if (vej == null)
    {
      if (paramContext == null)
      {
        w.e("MicroMsg.ResourceHelper", "get widthPixels but context is null");
        GMTrace.o(13990453313536L, 104237);
        return 0;
      }
      int i = paramContext.getResources().getDisplayMetrics().widthPixels;
      GMTrace.o(13990453313536L, 104237);
      return i;
    }
    GMTrace.o(13990453313536L, 104237);
    return 0;
  }
  
  public static int eg(Context paramContext)
  {
    GMTrace.i(13990587531264L, 104238);
    if (vej == null)
    {
      if (paramContext == null)
      {
        w.e("MicroMsg.ResourceHelper", "get heightPixels but context is null");
        GMTrace.o(13990587531264L, 104238);
        return 0;
      }
      int i = paramContext.getResources().getDisplayMetrics().heightPixels;
      GMTrace.o(13990587531264L, 104238);
      return i;
    }
    GMTrace.o(13990587531264L, 104238);
    return 0;
  }
  
  public static int fromDPToPix(Context paramContext, int paramInt)
  {
    GMTrace.i(13989379571712L, 104229);
    paramInt = Math.round(getDensity(paramContext) * paramInt);
    GMTrace.o(13989379571712L, 104229);
    return paramInt;
  }
  
  public static float getDensity(Context paramContext)
  {
    GMTrace.i(13989245353984L, 104228);
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = ab.getContext();
    }
    if (density < 0.0F) {
      density = localContext.getResources().getDisplayMetrics().density;
    }
    float f = density;
    GMTrace.o(13989245353984L, 104228);
    return f;
  }
  
  public static abstract interface a
  {
    public abstract String bOA();
    
    public abstract int bOw();
    
    public abstract ColorStateList bOx();
    
    public abstract Drawable bOy();
    
    public abstract int bOz();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\br\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */