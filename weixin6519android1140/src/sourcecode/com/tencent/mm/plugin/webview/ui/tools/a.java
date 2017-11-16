package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.gmtrace.GMTrace;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  private static final Map<String, Integer> lGg;
  private static final Map<Integer, Integer> rIe;
  private static final Map<Integer, Integer> rIf;
  private static final Map<Integer, Integer> rIg;
  
  static
  {
    GMTrace.i(12120397709312L, 90304);
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(-1), Integer.valueOf(5));
    localHashMap.put(Integer.valueOf(-2), Integer.valueOf(6));
    localHashMap.put(Integer.valueOf(-3), Integer.valueOf(7));
    localHashMap.put(Integer.valueOf(-4), Integer.valueOf(8));
    localHashMap.put(Integer.valueOf(-5), Integer.valueOf(9));
    localHashMap.put(Integer.valueOf(-6), Integer.valueOf(10));
    localHashMap.put(Integer.valueOf(-7), Integer.valueOf(11));
    localHashMap.put(Integer.valueOf(-8), Integer.valueOf(12));
    localHashMap.put(Integer.valueOf(-9), Integer.valueOf(13));
    localHashMap.put(Integer.valueOf(-10), Integer.valueOf(14));
    localHashMap.put(Integer.valueOf(-11), Integer.valueOf(15));
    localHashMap.put(Integer.valueOf(-12), Integer.valueOf(16));
    localHashMap.put(Integer.valueOf(-13), Integer.valueOf(17));
    localHashMap.put(Integer.valueOf(-14), Integer.valueOf(18));
    localHashMap.put(Integer.valueOf(-15), Integer.valueOf(19));
    rIe = Collections.unmodifiableMap(localHashMap);
    localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(-1), Integer.valueOf(4));
    localHashMap.put(Integer.valueOf(-2), Integer.valueOf(5));
    localHashMap.put(Integer.valueOf(-3), Integer.valueOf(6));
    localHashMap.put(Integer.valueOf(-4), Integer.valueOf(7));
    localHashMap.put(Integer.valueOf(-5), Integer.valueOf(8));
    localHashMap.put(Integer.valueOf(-6), Integer.valueOf(9));
    rIf = Collections.unmodifiableMap(localHashMap);
    localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(0), Integer.valueOf(0));
    localHashMap.put(Integer.valueOf(1), Integer.valueOf(1));
    localHashMap.put(Integer.valueOf(2), Integer.valueOf(2));
    rIg = Collections.unmodifiableMap(localHashMap);
    localHashMap = new HashMap();
    localHashMap.put("imagePreview", Integer.valueOf(2));
    localHashMap.put("profile", Integer.valueOf(3));
    localHashMap.put("addContact", Integer.valueOf(4));
    localHashMap.put("shareTimeline", Integer.valueOf(7));
    localHashMap.put("scanQRCode", Integer.valueOf(8));
    localHashMap.put("hideOptionMenu", Integer.valueOf(10));
    localHashMap.put("getBrandWCPayRequest", Integer.valueOf(11));
    localHashMap.put("editAddress", Integer.valueOf(12));
    localHashMap.put("getLatestAddress", Integer.valueOf(13));
    localHashMap.put("jumpWCMall", Integer.valueOf(14));
    localHashMap.put("geoLocation", Integer.valueOf(15));
    localHashMap.put("openProductView", Integer.valueOf(16));
    localHashMap.put("openProductViewWithPid", Integer.valueOf(16));
    localHashMap.put("openLocation", Integer.valueOf(17));
    localHashMap.put("hideMenuItems", Integer.valueOf(19));
    localHashMap.put("connectToFreeWifi", Integer.valueOf(20));
    localHashMap.put("startRecord", Integer.valueOf(21));
    localHashMap.put("chooseImage", Integer.valueOf(22));
    localHashMap.put("scanCover", Integer.valueOf(23));
    localHashMap.put("openGameWebView", Integer.valueOf(28));
    lGg = Collections.unmodifiableMap(localHashMap);
    GMTrace.o(12120397709312L, 90304);
  }
  
  public static int LT(String paramString)
  {
    GMTrace.i(12120129273856L, 90302);
    Integer localInteger = (Integer)lGg.get(paramString);
    paramString = localInteger;
    if (localInteger == null) {
      paramString = Integer.valueOf(-1);
    }
    int i = paramString.intValue();
    GMTrace.o(12120129273856L, 90302);
    return i;
  }
  
  public static int em(long paramLong)
  {
    GMTrace.i(12120263491584L, 90303);
    if (paramLong < 0L)
    {
      GMTrace.o(12120263491584L, 90303);
      return -1;
    }
    if (paramLong <= 2000L)
    {
      GMTrace.o(12120263491584L, 90303);
      return 1;
    }
    if (paramLong <= 6000L)
    {
      GMTrace.o(12120263491584L, 90303);
      return 2;
    }
    if (paramLong <= 12000L)
    {
      GMTrace.o(12120263491584L, 90303);
      return 3;
    }
    if (paramLong <= 60000L)
    {
      GMTrace.o(12120263491584L, 90303);
      return 4;
    }
    GMTrace.o(12120263491584L, 90303);
    return 5;
  }
  
  public static int xI(int paramInt)
  {
    GMTrace.i(12119726620672L, 90299);
    Integer localInteger2 = (Integer)rIe.get(Integer.valueOf(paramInt));
    Integer localInteger1 = localInteger2;
    if (localInteger2 == null) {
      localInteger1 = (Integer)rIe.get(Integer.valueOf(-1));
    }
    paramInt = localInteger1.intValue();
    GMTrace.o(12119726620672L, 90299);
    return paramInt;
  }
  
  public static int xJ(int paramInt)
  {
    GMTrace.i(12119860838400L, 90300);
    Integer localInteger2 = (Integer)rIf.get(Integer.valueOf(paramInt));
    Integer localInteger1 = localInteger2;
    if (localInteger2 == null) {
      localInteger1 = (Integer)rIf.get(Integer.valueOf(-1));
    }
    paramInt = localInteger1.intValue();
    GMTrace.o(12119860838400L, 90300);
    return paramInt;
  }
  
  public static int xK(int paramInt)
  {
    GMTrace.i(12119995056128L, 90301);
    Integer localInteger2 = (Integer)rIg.get(Integer.valueOf(paramInt));
    Integer localInteger1 = localInteger2;
    if (localInteger2 == null) {
      localInteger1 = Integer.valueOf(-1);
    }
    paramInt = localInteger1.intValue();
    GMTrace.o(12119995056128L, 90301);
    return paramInt;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */