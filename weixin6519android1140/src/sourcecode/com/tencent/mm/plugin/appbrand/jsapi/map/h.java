package com.tencent.mm.plugin.appbrand.jsapi.map;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class h
  extends c
{
  public static final int CTRL_INDEX = 136;
  public static final String NAME = "includeMapPoints";
  
  public h()
  {
    GMTrace.i(10448313253888L, 77846);
    GMTrace.o(10448313253888L, 77846);
  }
  
  /* Error */
  protected final boolean c(com.tencent.mm.plugin.appbrand.page.AppBrandPageView paramAppBrandPageView, int paramInt, android.view.View paramView, JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: ldc2_w 33
    //   3: ldc 35
    //   5: invokestatic 24	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_1
    //   9: getfield 41	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:ivh	Lcom/tencent/mm/plugin/appbrand/page/u;
    //   12: iload_2
    //   13: iconst_0
    //   14: invokevirtual 47	com/tencent/mm/plugin/appbrand/page/u:t	(IZ)Lcom/tencent/mm/y/u$b;
    //   17: ifnonnull +31 -> 48
    //   20: ldc 49
    //   22: ldc 51
    //   24: iconst_1
    //   25: anewarray 53	java/lang/Object
    //   28: dup
    //   29: iconst_0
    //   30: iload_2
    //   31: invokestatic 59	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   34: aastore
    //   35: invokestatic 64	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   38: ldc2_w 33
    //   41: ldc 35
    //   43: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   46: iconst_0
    //   47: ireturn
    //   48: aload_3
    //   49: instanceof 66
    //   52: ifne +31 -> 83
    //   55: ldc 49
    //   57: ldc 68
    //   59: iconst_1
    //   60: anewarray 53	java/lang/Object
    //   63: dup
    //   64: iconst_0
    //   65: iload_2
    //   66: invokestatic 59	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   69: aastore
    //   70: invokestatic 71	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   73: ldc2_w 33
    //   76: ldc 35
    //   78: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   81: iconst_0
    //   82: ireturn
    //   83: ldc 73
    //   85: invokestatic 79	com/tencent/mm/kernel/h:h	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   88: checkcast 73	com/tencent/mm/plugin/appbrand/compat/a/c
    //   91: aload_3
    //   92: checkcast 66	com/tencent/mm/plugin/appbrand/jsapi/coverview/CoverViewContainer
    //   95: ldc 81
    //   97: invokevirtual 85	com/tencent/mm/plugin/appbrand/jsapi/coverview/CoverViewContainer:J	(Ljava/lang/Class;)Landroid/view/View;
    //   100: invokeinterface 89 2 0
    //   105: astore_1
    //   106: ldc 49
    //   108: ldc 91
    //   110: invokestatic 94	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   113: aload 4
    //   115: ldc 96
    //   117: invokevirtual 102	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   120: ifeq +199 -> 319
    //   123: new 104	java/util/ArrayList
    //   126: dup
    //   127: invokespecial 105	java/util/ArrayList:<init>	()V
    //   130: astore_3
    //   131: aload 4
    //   133: ldc 96
    //   135: invokevirtual 109	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   138: astore 7
    //   140: aload 7
    //   142: invokestatic 114	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   145: ifne +121 -> 266
    //   148: new 116	org/json/JSONArray
    //   151: dup
    //   152: aload 7
    //   154: invokespecial 119	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   157: astore 7
    //   159: iconst_0
    //   160: istore_2
    //   161: iload_2
    //   162: aload 7
    //   164: invokevirtual 123	org/json/JSONArray:length	()I
    //   167: if_icmpge +99 -> 266
    //   170: aload 7
    //   172: iload_2
    //   173: invokevirtual 127	org/json/JSONArray:get	(I)Ljava/lang/Object;
    //   176: checkcast 98	org/json/JSONObject
    //   179: astore 8
    //   181: aload 8
    //   183: ldc -127
    //   185: invokevirtual 109	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   188: fconst_0
    //   189: invokestatic 133	com/tencent/mm/sdk/platformtools/bg:getFloat	(Ljava/lang/String;F)F
    //   192: fstore 5
    //   194: aload 8
    //   196: ldc -121
    //   198: invokevirtual 109	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   201: fconst_0
    //   202: invokestatic 133	com/tencent/mm/sdk/platformtools/bg:getFloat	(Ljava/lang/String;F)F
    //   205: fstore 6
    //   207: aload_3
    //   208: aload_1
    //   209: fload 5
    //   211: f2d
    //   212: fload 6
    //   214: f2d
    //   215: invokeinterface 141 5 0
    //   220: invokeinterface 147 2 0
    //   225: pop
    //   226: iload_2
    //   227: iconst_1
    //   228: iadd
    //   229: istore_2
    //   230: goto -69 -> 161
    //   233: astore_1
    //   234: ldc 49
    //   236: ldc -107
    //   238: iconst_2
    //   239: anewarray 53	java/lang/Object
    //   242: dup
    //   243: iconst_0
    //   244: iload_2
    //   245: invokestatic 59	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   248: aastore
    //   249: dup
    //   250: iconst_1
    //   251: aload_1
    //   252: aastore
    //   253: invokestatic 151	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   256: ldc2_w 33
    //   259: ldc 35
    //   261: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   264: iconst_0
    //   265: ireturn
    //   266: iconst_0
    //   267: istore_2
    //   268: aload 4
    //   270: ldc -103
    //   272: invokevirtual 109	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   275: astore 4
    //   277: aload 4
    //   279: invokestatic 114	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   282: ifne +20 -> 302
    //   285: new 116	org/json/JSONArray
    //   288: dup
    //   289: aload 4
    //   291: invokespecial 119	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   294: iconst_0
    //   295: invokevirtual 157	org/json/JSONArray:optInt	(I)I
    //   298: invokestatic 162	com/tencent/mm/plugin/appbrand/n/c:jM	(I)I
    //   301: istore_2
    //   302: aload_3
    //   303: invokeinterface 165 1 0
    //   308: ifle +11 -> 319
    //   311: aload_1
    //   312: aload_3
    //   313: iload_2
    //   314: invokeinterface 168 3 0
    //   319: ldc2_w 33
    //   322: ldc 35
    //   324: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   327: iconst_1
    //   328: ireturn
    //   329: astore_1
    //   330: ldc 49
    //   332: ldc -86
    //   334: iconst_1
    //   335: anewarray 53	java/lang/Object
    //   338: dup
    //   339: iconst_0
    //   340: aload_1
    //   341: aastore
    //   342: invokestatic 151	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   345: ldc2_w 33
    //   348: ldc 35
    //   350: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   353: iconst_0
    //   354: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	355	0	this	h
    //   0	355	1	paramAppBrandPageView	com.tencent.mm.plugin.appbrand.page.AppBrandPageView
    //   0	355	2	paramInt	int
    //   0	355	3	paramView	android.view.View
    //   0	355	4	paramJSONObject	JSONObject
    //   192	18	5	f1	float
    //   205	8	6	f2	float
    //   138	33	7	localObject	Object
    //   179	16	8	localJSONObject	JSONObject
    // Exception table:
    //   from	to	target	type
    //   83	106	233	java/lang/Exception
    //   113	159	329	java/lang/Exception
    //   161	226	329	java/lang/Exception
    //   268	277	329	java/lang/Exception
    //   277	302	329	java/lang/Exception
    //   302	319	329	java/lang/Exception
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(10448447471616L, 77847);
    try
    {
      int i = paramJSONObject.optInt("mapId");
      GMTrace.o(10448447471616L, 77847);
      return i;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiIncludeMapPoints", "get mapId error, exception : %s", new Object[] { paramJSONObject });
      GMTrace.o(10448447471616L, 77847);
    }
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\map\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */