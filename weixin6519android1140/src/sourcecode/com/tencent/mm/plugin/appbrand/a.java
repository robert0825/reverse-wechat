package com.tencent.mm.plugin.appbrand;

import android.support.v4.app.a.a;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  private static final Map<String, e> hye;
  private static Map<String, a.a> hyf;
  private static Map<String, AppBrandStatObject> hyg;
  private static Map<String, com.tencent.mm.plugin.appbrand.ui.e> hyh;
  
  static
  {
    GMTrace.i(10669369851904L, 79493);
    hye = new HashMap();
    hyf = new HashMap();
    hyg = new HashMap();
    hyh = new HashMap();
    GMTrace.o(10669369851904L, 79493);
  }
  
  public static void a(String paramString, int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(10668161892352L, 79484);
    if (!hyf.containsKey(paramString))
    {
      GMTrace.o(10668161892352L, 79484);
      return;
    }
    ((a.a)hyf.remove(paramString)).onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    GMTrace.o(10668161892352L, 79484);
  }
  
  public static void a(String paramString, a.a parama)
  {
    GMTrace.i(10668027674624L, 79483);
    hyf.put(paramString, parama);
    GMTrace.o(10668027674624L, 79483);
  }
  
  public static void a(String paramString, e parame)
  {
    GMTrace.i(15562679779328L, 115951);
    if (bg.nm(paramString))
    {
      GMTrace.o(15562679779328L, 115951);
      return;
    }
    synchronized (hye)
    {
      hye.put(paramString, parame);
      GMTrace.o(15562679779328L, 115951);
      return;
    }
  }
  
  public static void a(String paramString, AppBrandStatObject paramAppBrandStatObject)
  {
    GMTrace.i(19685043077120L, 146665);
    hyg.put(paramString, paramAppBrandStatObject);
    GMTrace.o(19685043077120L, 146665);
  }
  
  public static void a(String paramString, com.tencent.mm.plugin.appbrand.ui.e parame)
  {
    GMTrace.i(15562813997056L, 115952);
    hyh.put(paramString, parame);
    GMTrace.o(15562813997056L, 115952);
  }
  
  public static e nI(String paramString)
  {
    GMTrace.i(16168404385792L, 120464);
    if (bg.nm(paramString))
    {
      GMTrace.o(16168404385792L, 120464);
      return null;
    }
    synchronized (hye)
    {
      paramString = (e)hye.get(paramString);
      GMTrace.o(16168404385792L, 120464);
      return paramString;
    }
  }
  
  public static void nJ(String paramString)
  {
    GMTrace.i(10668296110080L, 79485);
    hyf.remove(paramString);
    GMTrace.o(10668296110080L, 79485);
  }
  
  public static AppBrandSysConfig nK(String paramString)
  {
    GMTrace.i(10668564545536L, 79487);
    if (nI(paramString) == null)
    {
      GMTrace.o(10668564545536L, 79487);
      return null;
    }
    paramString = nI(paramString).hyG;
    GMTrace.o(10668564545536L, 79487);
    return paramString;
  }
  
  public static AppBrandStatObject nL(String paramString)
  {
    GMTrace.i(10668832980992L, 79489);
    paramString = (AppBrandStatObject)hyg.get(paramString);
    GMTrace.o(10668832980992L, 79489);
    return paramString;
  }
  
  public static com.tencent.mm.plugin.appbrand.ui.e nM(String paramString)
  {
    GMTrace.i(15562948214784L, 115953);
    paramString = (com.tencent.mm.plugin.appbrand.ui.e)hyh.get(paramString);
    GMTrace.o(15562948214784L, 115953);
    return paramString;
  }
  
  public static void nN(String paramString)
  {
    GMTrace.i(17402267959296L, 129657);
    hyh.remove(paramString);
    GMTrace.o(17402267959296L, 129657);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */