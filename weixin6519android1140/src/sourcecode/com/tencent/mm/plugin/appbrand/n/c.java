package com.tencent.mm.plugin.appbrand.n;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.DisplayMetrics;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c
{
  private static DisplayMetrics iGo;
  
  static
  {
    GMTrace.i(20014413381632L, 149119);
    iGo = ab.getContext().getResources().getDisplayMetrics();
    GMTrace.o(20014413381632L, 149119);
  }
  
  public static float V(float paramFloat)
  {
    GMTrace.i(20013071204352L, 149109);
    if (iGo == null)
    {
      GMTrace.o(20013071204352L, 149109);
      return paramFloat;
    }
    paramFloat /= iGo.density;
    GMTrace.o(20013071204352L, 149109);
    return paramFloat;
  }
  
  public static float W(float paramFloat)
  {
    GMTrace.i(20013339639808L, 149111);
    if (iGo == null)
    {
      GMTrace.o(20013339639808L, 149111);
      return paramFloat;
    }
    float f = iGo.density;
    GMTrace.o(20013339639808L, 149111);
    return paramFloat * f;
  }
  
  public static float a(JSONArray paramJSONArray, int paramInt, float paramFloat)
  {
    GMTrace.i(20014279163904L, 149118);
    if (paramJSONArray == null)
    {
      GMTrace.o(20014279163904L, 149118);
      return paramFloat;
    }
    try
    {
      float f = W((float)paramJSONArray.getDouble(paramInt));
      GMTrace.o(20014279163904L, 149118);
      return f;
    }
    catch (Exception paramJSONArray)
    {
      GMTrace.o(20014279163904L, 149118);
    }
    return paramFloat;
  }
  
  public static float a(JSONObject paramJSONObject, String paramString, float paramFloat)
  {
    GMTrace.i(20013742292992L, 149114);
    if (paramJSONObject == null)
    {
      GMTrace.o(20013742292992L, 149114);
      return paramFloat;
    }
    double d = paramFloat;
    try
    {
      float f = W((float)paramJSONObject.optDouble(paramString, d));
      GMTrace.o(20013742292992L, 149114);
      return f;
    }
    catch (Exception paramJSONObject)
    {
      GMTrace.o(20013742292992L, 149114);
    }
    return paramFloat;
  }
  
  private static int a(JSONArray paramJSONArray, int paramInt)
  {
    GMTrace.i(20014010728448L, 149116);
    if (paramJSONArray == null)
    {
      GMTrace.o(20014010728448L, 149116);
      return 0;
    }
    try
    {
      paramInt = Math.round(W((float)paramJSONArray.getDouble(paramInt)));
      GMTrace.o(20014010728448L, 149116);
      return paramInt;
    }
    catch (Exception paramJSONArray)
    {
      GMTrace.o(20014010728448L, 149116);
    }
    return 0;
  }
  
  public static int az(String paramString, int paramInt)
  {
    GMTrace.i(20012668551168L, 149106);
    try
    {
      int i = su(paramString);
      GMTrace.o(20012668551168L, 149106);
      return i;
    }
    catch (Exception paramString)
    {
      GMTrace.o(20012668551168L, 149106);
    }
    return paramInt;
  }
  
  public static float b(JSONArray paramJSONArray, int paramInt)
  {
    GMTrace.i(20014144946176L, 149117);
    float f = a(paramJSONArray, paramInt, 0.0F);
    GMTrace.o(20014144946176L, 149117);
    return f;
  }
  
  public static int b(JSONObject paramJSONObject, String paramString)
  {
    GMTrace.i(20372372062208L, 151786);
    if (paramJSONObject == null)
    {
      GMTrace.o(20372372062208L, 151786);
      return 0;
    }
    try
    {
      int i = Math.round(W((float)paramJSONObject.getDouble(paramString)));
      GMTrace.o(20372372062208L, 151786);
      return i;
    }
    catch (Exception paramJSONObject)
    {
      GMTrace.o(20372372062208L, 151786);
    }
    return 0;
  }
  
  public static float c(JSONObject paramJSONObject, String paramString)
  {
    GMTrace.i(20372506279936L, 151787);
    float f = a(paramJSONObject, paramString, 0.0F);
    GMTrace.o(20372506279936L, 151787);
    return f;
  }
  
  public static int c(JSONArray paramJSONArray, int paramInt)
  {
    GMTrace.i(21063996014592L, 156939);
    paramInt = a(paramJSONArray, paramInt);
    GMTrace.o(21063996014592L, 156939);
    return paramInt;
  }
  
  public static int i(JSONArray paramJSONArray)
  {
    GMTrace.i(20012534333440L, 149105);
    if ((paramJSONArray == null) || (paramJSONArray.length() < 3))
    {
      GMTrace.o(20012534333440L, 149105);
      return 0;
    }
    if (paramJSONArray.length() == 3) {}
    for (int i = Color.rgb(paramJSONArray.optInt(0) & 0xFF, paramJSONArray.optInt(1) & 0xFF, paramJSONArray.optInt(2) & 0xFF);; i = Color.argb(paramJSONArray.optInt(3) & 0xFF, paramJSONArray.optInt(0) & 0xFF, paramJSONArray.optInt(1) & 0xFF, paramJSONArray.optInt(2) & 0xFF))
    {
      GMTrace.o(20012534333440L, 149105);
      return i;
    }
  }
  
  public static int jL(int paramInt)
  {
    GMTrace.i(20012936986624L, 149108);
    if (iGo == null)
    {
      GMTrace.o(20012936986624L, 149108);
      return paramInt;
    }
    paramInt = (int)(paramInt / iGo.density);
    GMTrace.o(20012936986624L, 149108);
    return paramInt;
  }
  
  public static int jM(int paramInt)
  {
    GMTrace.i(20013205422080L, 149110);
    if (iGo == null)
    {
      GMTrace.o(20013205422080L, 149110);
      return paramInt;
    }
    paramInt = (int)(iGo.density * paramInt);
    GMTrace.o(20013205422080L, 149110);
    return paramInt;
  }
  
  public static int su(String paramString)
  {
    GMTrace.i(20012802768896L, 149107);
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(20012802768896L, 149107);
      return 0;
    }
    int i;
    if (paramString.charAt(0) == '#')
    {
      if (paramString.length() == 7) {}
      for (long l = Long.parseLong(paramString.substring(1), 16) | 0xFFFFFFFFFF000000;; l = Long.parseLong(paramString.substring(1, 7), 16) | Long.parseLong(paramString.substring(7, 9), 16) << 24)
      {
        i = (int)l;
        GMTrace.o(20012802768896L, 149107);
        return i;
        if (paramString.length() != 9) {
          throw new IllegalArgumentException("Unknown color");
        }
      }
    }
    try
    {
      i = Color.parseColor(paramString);
      GMTrace.o(20012802768896L, 149107);
      return i;
    }
    catch (IllegalArgumentException paramString)
    {
      GMTrace.o(20012802768896L, 149107);
    }
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\n\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */