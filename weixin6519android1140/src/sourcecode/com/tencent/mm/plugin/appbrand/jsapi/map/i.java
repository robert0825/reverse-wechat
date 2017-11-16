package com.tencent.mm.plugin.appbrand.jsapi.map;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.compat.a.b;
import com.tencent.mm.plugin.appbrand.compat.a.b.k;
import com.tencent.mm.plugin.appbrand.compat.a.b.l;
import com.tencent.mm.plugin.appbrand.compat.a.b.m;
import com.tencent.mm.plugin.appbrand.compat.a.c;
import com.tencent.mm.plugin.appbrand.compat.a.d;
import com.tencent.mm.plugin.appbrand.compat.a.d.a;
import com.tencent.mm.plugin.appbrand.compat.a.d.b;
import com.tencent.mm.plugin.appbrand.jsapi.base.a;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.o.e;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.c;
import com.tencent.mm.pluginsdk.q;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class i
  extends a
{
  public static final int CTRL_INDEX = 2;
  public static final String NAME = "insertMap";
  
  public i()
  {
    GMTrace.i(10441602367488L, 77796);
    GMTrace.o(10441602367488L, 77796);
  }
  
  protected final View a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject)
  {
    GMTrace.i(10441736585216L, 77797);
    float f1 = bg.getFloat(paramJSONObject.optString("centerLatitude"), 0.0F);
    float f2 = bg.getFloat(paramJSONObject.optString("centerLongitude"), 0.0F);
    if ((Math.abs(f1) > 90.0F) || (Math.abs(f2) > 180.0F))
    {
      w.d("MicroMsg.JsApiInsertMap", "centerLatitude or centerLongitude value is error!");
      GMTrace.o(10441736585216L, 77797);
      return null;
    }
    paramAppBrandPageView = paramAppBrandPageView.mContext;
    paramJSONObject = ((c)h.h(c.class)).bH(paramAppBrandPageView);
    paramJSONObject.getView().setVisibility(0);
    paramAppBrandPageView = new CoverViewContainer(paramAppBrandPageView, paramJSONObject.getView());
    GMTrace.o(10441736585216L, 77797);
    return paramAppBrandPageView;
  }
  
  /* Error */
  protected final void a(final AppBrandPageView paramAppBrandPageView, final int paramInt, final View paramView, final JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: ldc2_w 132
    //   3: ldc -122
    //   5: invokestatic 51	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: ldc 101
    //   10: invokestatic 107	com/tencent/mm/kernel/h:h	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   13: checkcast 101	com/tencent/mm/plugin/appbrand/compat/a/c
    //   16: aload_3
    //   17: checkcast 125	com/tencent/mm/plugin/appbrand/jsapi/coverview/CoverViewContainer
    //   20: ldc 119
    //   22: invokevirtual 138	com/tencent/mm/plugin/appbrand/jsapi/coverview/CoverViewContainer:J	(Ljava/lang/Class;)Landroid/view/View;
    //   25: invokeinterface 142 2 0
    //   30: astore_3
    //   31: aload_1
    //   32: getfield 146	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:ivh	Lcom/tencent/mm/plugin/appbrand/page/u;
    //   35: iload_2
    //   36: iconst_1
    //   37: invokevirtual 152	com/tencent/mm/plugin/appbrand/page/u:t	(IZ)Lcom/tencent/mm/y/u$b;
    //   40: astore 8
    //   42: aload 4
    //   44: ldc -102
    //   46: invokevirtual 158	org/json/JSONObject:optBoolean	(Ljava/lang/String;)Z
    //   49: ifeq +362 -> 411
    //   52: aload_1
    //   53: getfield 146	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:ivh	Lcom/tencent/mm/plugin/appbrand/page/u;
    //   56: iload_2
    //   57: iconst_1
    //   58: invokevirtual 152	com/tencent/mm/plugin/appbrand/page/u:t	(IZ)Lcom/tencent/mm/y/u$b;
    //   61: astore 9
    //   63: new 16	com/tencent/mm/plugin/appbrand/jsapi/map/i$5
    //   66: dup
    //   67: aload_0
    //   68: aload 9
    //   70: iload_2
    //   71: aload_1
    //   72: aload_3
    //   73: invokespecial 161	com/tencent/mm/plugin/appbrand/jsapi/map/i$5:<init>	(Lcom/tencent/mm/plugin/appbrand/jsapi/map/i;Lcom/tencent/mm/y/u$b;ILcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;Lcom/tencent/mm/plugin/appbrand/compat/a/b;)V
    //   76: astore 10
    //   78: ldc -93
    //   80: invokestatic 107	com/tencent/mm/kernel/h:h	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   83: checkcast 163	com/tencent/mm/plugin/appbrand/compat/a/d
    //   86: aload 10
    //   88: invokeinterface 166 2 0
    //   93: new 27	com/tencent/mm/plugin/appbrand/jsapi/map/i$b
    //   96: dup
    //   97: aload_0
    //   98: iload_2
    //   99: aload 9
    //   101: invokespecial 169	com/tencent/mm/plugin/appbrand/jsapi/map/i$b:<init>	(Lcom/tencent/mm/plugin/appbrand/jsapi/map/i;ILcom/tencent/mm/y/u$b;)V
    //   104: astore 11
    //   106: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   109: ldc -79
    //   111: invokevirtual 183	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   114: checkcast 185	android/hardware/SensorManager
    //   117: astore 12
    //   119: aload 12
    //   121: aload 11
    //   123: aload 12
    //   125: iconst_3
    //   126: invokevirtual 189	android/hardware/SensorManager:getDefaultSensor	(I)Landroid/hardware/Sensor;
    //   129: iconst_1
    //   130: invokevirtual 193	android/hardware/SensorManager:registerListener	(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
    //   133: pop
    //   134: aload 9
    //   136: ldc -61
    //   138: aconst_null
    //   139: invokevirtual 201	com/tencent/mm/y/u$b:get	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   142: checkcast 203	com/tencent/mm/plugin/appbrand/page/AppBrandPageView$c
    //   145: ifnonnull +39 -> 184
    //   148: new 20	com/tencent/mm/plugin/appbrand/jsapi/map/i$6
    //   151: dup
    //   152: aload_0
    //   153: aload_1
    //   154: aload_3
    //   155: aload 12
    //   157: aload 11
    //   159: aload 10
    //   161: aload 9
    //   163: invokespecial 206	com/tencent/mm/plugin/appbrand/jsapi/map/i$6:<init>	(Lcom/tencent/mm/plugin/appbrand/jsapi/map/i;Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;Lcom/tencent/mm/plugin/appbrand/compat/a/b;Landroid/hardware/SensorManager;Lcom/tencent/mm/plugin/appbrand/jsapi/map/i$b;Lcom/tencent/mm/plugin/appbrand/compat/a/d$a;Lcom/tencent/mm/y/u$b;)V
    //   166: astore 10
    //   168: aload 9
    //   170: ldc -61
    //   172: aload 10
    //   174: invokevirtual 209	com/tencent/mm/y/u$b:o	(Ljava/lang/String;Ljava/lang/Object;)Lcom/tencent/mm/y/u$b;
    //   177: pop
    //   178: aload_1
    //   179: aload 10
    //   181: invokevirtual 212	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:a	(Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView$c;)V
    //   184: aload_3
    //   185: new 10	com/tencent/mm/plugin/appbrand/jsapi/map/i$2
    //   188: dup
    //   189: aload_0
    //   190: aload 4
    //   192: aload_3
    //   193: invokespecial 215	com/tencent/mm/plugin/appbrand/jsapi/map/i$2:<init>	(Lcom/tencent/mm/plugin/appbrand/jsapi/map/i;Lorg/json/JSONObject;Lcom/tencent/mm/plugin/appbrand/compat/a/b;)V
    //   196: invokeinterface 218 2 0
    //   201: aload_3
    //   202: new 12	com/tencent/mm/plugin/appbrand/jsapi/map/i$3
    //   205: dup
    //   206: aload_0
    //   207: iload_2
    //   208: aload_1
    //   209: invokespecial 221	com/tencent/mm/plugin/appbrand/jsapi/map/i$3:<init>	(Lcom/tencent/mm/plugin/appbrand/jsapi/map/i;ILcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;)V
    //   212: invokeinterface 224 2 0
    //   217: aload_3
    //   218: new 14	com/tencent/mm/plugin/appbrand/jsapi/map/i$4
    //   221: dup
    //   222: aload_0
    //   223: iload_2
    //   224: aload_1
    //   225: invokespecial 225	com/tencent/mm/plugin/appbrand/jsapi/map/i$4:<init>	(Lcom/tencent/mm/plugin/appbrand/jsapi/map/i;ILcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;)V
    //   228: invokeinterface 228 2 0
    //   233: aload 4
    //   235: ldc -26
    //   237: invokevirtual 233	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   240: ifeq +228 -> 468
    //   243: new 235	java/util/ArrayList
    //   246: dup
    //   247: invokespecial 236	java/util/ArrayList:<init>	()V
    //   250: astore 9
    //   252: new 238	org/json/JSONArray
    //   255: dup
    //   256: aload 4
    //   258: ldc -26
    //   260: invokevirtual 67	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   263: invokespecial 241	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   266: astore 10
    //   268: iconst_0
    //   269: istore_2
    //   270: iload_2
    //   271: aload 10
    //   273: invokevirtual 245	org/json/JSONArray:length	()I
    //   276: if_icmpge +182 -> 458
    //   279: aload 10
    //   281: iload_2
    //   282: invokevirtual 248	org/json/JSONArray:get	(I)Ljava/lang/Object;
    //   285: checkcast 63	org/json/JSONObject
    //   288: astore 12
    //   290: aload 12
    //   292: ldc -6
    //   294: invokevirtual 67	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   297: fconst_0
    //   298: invokestatic 73	com/tencent/mm/sdk/platformtools/bg:getFloat	(Ljava/lang/String;F)F
    //   301: fstore 5
    //   303: aload 12
    //   305: ldc -4
    //   307: invokevirtual 67	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   310: fconst_0
    //   311: invokestatic 73	com/tencent/mm/sdk/platformtools/bg:getFloat	(Ljava/lang/String;F)F
    //   314: fstore 6
    //   316: aload 12
    //   318: ldc -2
    //   320: invokevirtual 67	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   323: invokestatic 259	com/tencent/mm/plugin/appbrand/o/d:sy	(Ljava/lang/String;)Ljava/lang/String;
    //   326: astore 11
    //   328: aload 12
    //   330: ldc_w 261
    //   333: invokevirtual 67	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   336: invokestatic 259	com/tencent/mm/plugin/appbrand/o/d:sy	(Ljava/lang/String;)Ljava/lang/String;
    //   339: astore 12
    //   341: aload_3
    //   342: invokeinterface 265 1 0
    //   347: astore 13
    //   349: aload 13
    //   351: fload 5
    //   353: f2d
    //   354: fload 6
    //   356: f2d
    //   357: invokeinterface 271 5 0
    //   362: aload 13
    //   364: aload 11
    //   366: invokeinterface 274 2 0
    //   371: aload 12
    //   373: invokestatic 277	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   376: ifne +12 -> 388
    //   379: aload 13
    //   381: aload 12
    //   383: invokeinterface 280 2 0
    //   388: aload 9
    //   390: aload_3
    //   391: aload 13
    //   393: invokeinterface 283 2 0
    //   398: invokeinterface 289 2 0
    //   403: pop
    //   404: iload_2
    //   405: iconst_1
    //   406: iadd
    //   407: istore_2
    //   408: goto -138 -> 270
    //   411: aload 8
    //   413: ldc -61
    //   415: aconst_null
    //   416: invokevirtual 201	com/tencent/mm/y/u$b:get	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   419: checkcast 203	com/tencent/mm/plugin/appbrand/page/AppBrandPageView$c
    //   422: ifnonnull -238 -> 184
    //   425: new 6	com/tencent/mm/plugin/appbrand/jsapi/map/i$1
    //   428: dup
    //   429: aload_0
    //   430: aload_1
    //   431: aload_3
    //   432: aload 8
    //   434: invokespecial 292	com/tencent/mm/plugin/appbrand/jsapi/map/i$1:<init>	(Lcom/tencent/mm/plugin/appbrand/jsapi/map/i;Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;Lcom/tencent/mm/plugin/appbrand/compat/a/b;Lcom/tencent/mm/y/u$b;)V
    //   437: astore 9
    //   439: aload 8
    //   441: ldc -61
    //   443: aload 9
    //   445: invokevirtual 209	com/tencent/mm/y/u$b:o	(Ljava/lang/String;Ljava/lang/Object;)Lcom/tencent/mm/y/u$b;
    //   448: pop
    //   449: aload_1
    //   450: aload 9
    //   452: invokevirtual 212	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:a	(Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView$c;)V
    //   455: goto -271 -> 184
    //   458: aload 8
    //   460: ldc -26
    //   462: aload 9
    //   464: invokevirtual 209	com/tencent/mm/y/u$b:o	(Ljava/lang/String;Ljava/lang/Object;)Lcom/tencent/mm/y/u$b;
    //   467: pop
    //   468: aload 4
    //   470: ldc_w 294
    //   473: invokevirtual 233	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   476: ifeq +236 -> 712
    //   479: new 235	java/util/ArrayList
    //   482: dup
    //   483: invokespecial 236	java/util/ArrayList:<init>	()V
    //   486: astore 9
    //   488: new 238	org/json/JSONArray
    //   491: dup
    //   492: aload 4
    //   494: ldc_w 294
    //   497: invokevirtual 67	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   500: invokespecial 241	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   503: astore 4
    //   505: iconst_0
    //   506: istore_2
    //   507: iload_2
    //   508: aload 4
    //   510: invokevirtual 245	org/json/JSONArray:length	()I
    //   513: if_icmpge +188 -> 701
    //   516: aload 4
    //   518: iload_2
    //   519: invokevirtual 248	org/json/JSONArray:get	(I)Ljava/lang/Object;
    //   522: checkcast 63	org/json/JSONObject
    //   525: astore 11
    //   527: aload 11
    //   529: ldc -6
    //   531: invokevirtual 67	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   534: fconst_0
    //   535: invokestatic 73	com/tencent/mm/sdk/platformtools/bg:getFloat	(Ljava/lang/String;F)F
    //   538: fstore 5
    //   540: aload 11
    //   542: ldc -4
    //   544: invokevirtual 67	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   547: fconst_0
    //   548: invokestatic 73	com/tencent/mm/sdk/platformtools/bg:getFloat	(Ljava/lang/String;F)F
    //   551: fstore 6
    //   553: aload 11
    //   555: ldc_w 296
    //   558: invokevirtual 67	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   561: astore 10
    //   563: aload 11
    //   565: ldc_w 298
    //   568: dconst_0
    //   569: invokevirtual 302	org/json/JSONObject:optDouble	(Ljava/lang/String;D)D
    //   572: d2f
    //   573: fstore 7
    //   575: aload_3
    //   576: invokeinterface 265 1 0
    //   581: astore 11
    //   583: aload 11
    //   585: fload 5
    //   587: f2d
    //   588: fload 6
    //   590: f2d
    //   591: invokeinterface 271 5 0
    //   596: aload_1
    //   597: getfield 306	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:hzM	Lcom/tencent/mm/plugin/appbrand/e;
    //   600: aload 10
    //   602: invokestatic 312	com/tencent/mm/plugin/appbrand/page/o:g	(Lcom/tencent/mm/plugin/appbrand/e;Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   605: astore 10
    //   607: aload 10
    //   609: ifnull +20 -> 629
    //   612: aload 10
    //   614: invokevirtual 318	android/graphics/Bitmap:isRecycled	()Z
    //   617: ifne +12 -> 629
    //   620: aload 11
    //   622: aload 10
    //   624: invokeinterface 322 2 0
    //   629: aload 11
    //   631: fload 7
    //   633: invokeinterface 326 2 0
    //   638: aload_3
    //   639: aload 11
    //   641: invokeinterface 283 2 0
    //   646: astore 10
    //   648: aload 10
    //   650: ldc_w 328
    //   653: invokeinterface 333 2 0
    //   658: aload 9
    //   660: aload 10
    //   662: invokeinterface 289 2 0
    //   667: pop
    //   668: iload_2
    //   669: iconst_1
    //   670: iadd
    //   671: istore_2
    //   672: goto -165 -> 507
    //   675: astore_1
    //   676: ldc 85
    //   678: ldc_w 335
    //   681: iconst_1
    //   682: anewarray 337	java/lang/Object
    //   685: dup
    //   686: iconst_0
    //   687: aload_1
    //   688: aastore
    //   689: invokestatic 341	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   692: ldc2_w 132
    //   695: ldc -122
    //   697: invokestatic 54	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   700: return
    //   701: aload 8
    //   703: ldc_w 343
    //   706: aload 9
    //   708: invokevirtual 209	com/tencent/mm/y/u$b:o	(Ljava/lang/String;Ljava/lang/Object;)Lcom/tencent/mm/y/u$b;
    //   711: pop
    //   712: ldc2_w 132
    //   715: ldc -122
    //   717: invokestatic 54	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   720: return
    //   721: astore_1
    //   722: ldc 85
    //   724: ldc_w 345
    //   727: iconst_1
    //   728: anewarray 337	java/lang/Object
    //   731: dup
    //   732: iconst_0
    //   733: aload_1
    //   734: aastore
    //   735: invokestatic 341	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   738: ldc2_w 132
    //   741: ldc -122
    //   743: invokestatic 54	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   746: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	747	0	this	i
    //   0	747	1	paramAppBrandPageView	AppBrandPageView
    //   0	747	2	paramInt	int
    //   0	747	3	paramView	View
    //   0	747	4	paramJSONObject	JSONObject
    //   301	285	5	f1	float
    //   314	275	6	f2	float
    //   573	59	7	f3	float
    //   40	662	8	localb	u.b
    //   61	646	9	localObject1	Object
    //   76	585	10	localObject2	Object
    //   104	536	11	localObject3	Object
    //   117	265	12	localObject4	Object
    //   347	45	13	locali	com.tencent.mm.plugin.appbrand.compat.a.b.i
    // Exception table:
    //   from	to	target	type
    //   233	268	675	java/lang/Exception
    //   270	388	675	java/lang/Exception
    //   388	404	675	java/lang/Exception
    //   458	468	675	java/lang/Exception
    //   468	505	721	java/lang/Exception
    //   507	607	721	java/lang/Exception
    //   612	629	721	java/lang/Exception
    //   629	668	721	java/lang/Exception
    //   701	712	721	java/lang/Exception
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(10442005020672L, 77799);
    int i = paramJSONObject.getInt("mapId");
    GMTrace.o(10442005020672L, 77799);
    return i;
  }
  
  public static final class a
    extends e
  {
    private static final int CTRL_INDEX = 147;
    private static final String NAME = "onMapRegionChange";
    
    public a()
    {
      GMTrace.i(10444689375232L, 77819);
      GMTrace.o(10444689375232L, 77819);
    }
  }
  
  private final class b
    implements SensorEventListener
  {
    int eMA;
    u.b hTC;
    private float igL;
    private long timestamp;
    
    public b(int paramInt, u.b paramb)
    {
      GMTrace.i(10445628899328L, 77826);
      this.igL = 0.0F;
      this.timestamp = 200L;
      this.eMA = paramInt;
      this.hTC = paramb;
      GMTrace.o(10445628899328L, 77826);
    }
    
    public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
    {
      GMTrace.i(10445897334784L, 77828);
      GMTrace.o(10445897334784L, 77828);
    }
    
    public final void onSensorChanged(SensorEvent paramSensorEvent)
    {
      GMTrace.i(10445763117056L, 77827);
      float f3;
      float f4;
      if (paramSensorEvent.sensor.getType() == 3)
      {
        long l1 = System.currentTimeMillis();
        long l2 = this.timestamp;
        f3 = q.at(paramSensorEvent.values[0]);
        if ((l1 - l2 > 200L) && (Math.abs(f3 - this.igL) > 3.0F))
        {
          paramSensorEvent = (AppbrandMapLocationPoint)this.hTC.get(this.eMA, null);
          if (paramSensorEvent != null)
          {
            f4 = this.igL;
            if ((f4 < 0.0F) || (f4 > 45.0F) || (f3 < 315.0F) || (f3 >= 360.0F)) {
              break label290;
            }
          }
        }
      }
      label290:
      for (float f1 = f3 - 360.0F;; f1 = f3)
      {
        float f2;
        if ((f4 >= 0.0F) && (f4 <= 45.0F) && (f3 >= 315.0F))
        {
          f2 = f4;
          if (f3 < 360.0F) {}
        }
        else
        {
          f2 = f4;
          if (f4 >= 315.0F)
          {
            f2 = f4;
            if (f4 < 360.0F)
            {
              f2 = f4;
              if (f3 >= 0.0F)
              {
                f2 = f4;
                if (f3 <= 45.0F) {
                  f2 = f4 - 360.0F;
                }
              }
            }
          }
        }
        RotateAnimation localRotateAnimation = new RotateAnimation(f2, f1, 1, 0.5F, 1, 0.5F);
        localRotateAnimation.setDuration(200L);
        localRotateAnimation.setFillAfter(true);
        paramSensorEvent.ign.startAnimation(localRotateAnimation);
        this.igL = f3;
        this.timestamp = System.currentTimeMillis();
        GMTrace.o(10445763117056L, 77827);
        return;
      }
    }
  }
  
  public static final class c
    extends e
  {
    private static final int CTRL_INDEX = 151;
    private static final String NAME = "onMapClick";
    
    public c()
    {
      GMTrace.i(10448984342528L, 77851);
      GMTrace.o(10448984342528L, 77851);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\map\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */