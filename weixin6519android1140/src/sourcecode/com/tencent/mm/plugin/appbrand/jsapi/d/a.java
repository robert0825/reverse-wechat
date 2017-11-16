package com.tencent.mm.plugin.appbrand.jsapi.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.input.b.f;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import java.lang.ref.WeakReference;

abstract class a<P extends f>
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  a()
  {
    GMTrace.i(10366440439808L, 77236);
    GMTrace.o(10366440439808L, 77236);
  }
  
  protected static void aZ(String paramString1, String paramString2)
  {
    GMTrace.i(10366843092992L, 77239);
    u.Av().p("AppBrandJsInput@" + paramString1, true).I("passing_data", paramString2);
    GMTrace.o(10366843092992L, 77239);
  }
  
  protected static AppBrandPageView qt(String paramString)
  {
    GMTrace.i(10366977310720L, 77240);
    paramString = u.Av().gw("AppBrandJsInput@" + paramString);
    if (paramString == null)
    {
      GMTrace.o(10366977310720L, 77240);
      return null;
    }
    paramString = (WeakReference)paramString.get("webview_reference", null);
    if (paramString == null)
    {
      GMTrace.o(10366977310720L, 77240);
      return null;
    }
    paramString = (AppBrandPageView)paramString.get();
    GMTrace.o(10366977310720L, 77240);
    return paramString;
  }
  
  protected boolean WK()
  {
    GMTrace.i(10366708875264L, 77238);
    GMTrace.o(10366708875264L, 77238);
    return false;
  }
  
  /* Error */
  protected boolean a(P paramP, org.json.JSONObject paramJSONObject, AppBrandPageView paramAppBrandPageView, int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 92
    //   3: ldc 94
    //   5: invokestatic 18	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 96	org/json/JSONObject
    //   11: dup
    //   12: aload_2
    //   13: ldc 98
    //   15: invokevirtual 102	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   18: invokespecial 103	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   21: astore 5
    //   23: aload_1
    //   24: aload 5
    //   26: ldc 105
    //   28: invokevirtual 109	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   31: invokestatic 115	com/tencent/mm/plugin/appbrand/n/c:jM	(I)I
    //   34: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   37: putfield 127	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQl	Ljava/lang/Integer;
    //   40: aload_1
    //   41: aload 5
    //   43: ldc -127
    //   45: invokevirtual 109	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   48: invokestatic 115	com/tencent/mm/plugin/appbrand/n/c:jM	(I)I
    //   51: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   54: putfield 132	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQm	Ljava/lang/Integer;
    //   57: aload_1
    //   58: aload 5
    //   60: ldc -122
    //   62: invokevirtual 109	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   65: invokestatic 115	com/tencent/mm/plugin/appbrand/n/c:jM	(I)I
    //   68: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   71: putfield 137	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQn	Ljava/lang/Integer;
    //   74: aload_1
    //   75: aload 5
    //   77: ldc -117
    //   79: invokevirtual 109	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   82: invokestatic 115	com/tencent/mm/plugin/appbrand/n/c:jM	(I)I
    //   85: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   88: putfield 142	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQo	Ljava/lang/Integer;
    //   91: aload 5
    //   93: ifnonnull +94 -> 187
    //   96: aload_0
    //   97: invokevirtual 144	com/tencent/mm/plugin/appbrand/jsapi/d/a:WK	()Z
    //   100: ifne +289 -> 389
    //   103: ldc -110
    //   105: ldc -108
    //   107: invokestatic 153	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   110: aload_3
    //   111: iload 4
    //   113: aload_0
    //   114: ldc -101
    //   116: aconst_null
    //   117: invokevirtual 161	com/tencent/mm/plugin/appbrand/jsapi/d:d	(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    //   120: invokevirtual 165	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:v	(ILjava/lang/String;)V
    //   123: ldc2_w 92
    //   126: ldc 94
    //   128: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   131: iconst_0
    //   132: ireturn
    //   133: astore 6
    //   135: aconst_null
    //   136: astore 5
    //   138: aload_0
    //   139: invokevirtual 144	com/tencent/mm/plugin/appbrand/jsapi/d/a:WK	()Z
    //   142: ifne -51 -> 91
    //   145: ldc -110
    //   147: ldc -89
    //   149: iconst_1
    //   150: anewarray 169	java/lang/Object
    //   153: dup
    //   154: iconst_0
    //   155: aload 6
    //   157: invokestatic 175	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   160: aastore
    //   161: invokestatic 178	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   164: aload_3
    //   165: iload 4
    //   167: aload_0
    //   168: ldc -101
    //   170: aconst_null
    //   171: invokevirtual 161	com/tencent/mm/plugin/appbrand/jsapi/d:d	(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    //   174: invokevirtual 165	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:v	(ILjava/lang/String;)V
    //   177: ldc2_w 92
    //   180: ldc 94
    //   182: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   185: iconst_0
    //   186: ireturn
    //   187: aload_1
    //   188: aload 5
    //   190: ldc -76
    //   192: aconst_null
    //   193: invokevirtual 184	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   196: putfield 188	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQw	Ljava/lang/String;
    //   199: aload_1
    //   200: aload 5
    //   202: ldc -66
    //   204: invokevirtual 109	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   207: invokestatic 115	com/tencent/mm/plugin/appbrand/n/c:jM	(I)I
    //   210: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   213: putfield 193	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQp	Ljava/lang/Integer;
    //   216: aload_1
    //   217: aload 5
    //   219: ldc -61
    //   221: invokevirtual 109	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   224: invokestatic 115	com/tencent/mm/plugin/appbrand/n/c:jM	(I)I
    //   227: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   230: putfield 198	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQq	Ljava/lang/Integer;
    //   233: aload_1
    //   234: aload 5
    //   236: ldc -56
    //   238: aconst_null
    //   239: invokevirtual 184	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   242: putfield 203	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQr	Ljava/lang/String;
    //   245: aload_1
    //   246: aload 5
    //   248: ldc -51
    //   250: invokevirtual 102	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   253: invokestatic 210	android/graphics/Color:parseColor	(Ljava/lang/String;)I
    //   256: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   259: putfield 213	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQt	Ljava/lang/Integer;
    //   262: aload_1
    //   263: aload 5
    //   265: ldc -41
    //   267: invokevirtual 102	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   270: invokestatic 210	android/graphics/Color:parseColor	(Ljava/lang/String;)I
    //   273: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   276: putfield 218	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQs	Ljava/lang/Integer;
    //   279: aload_1
    //   280: aload 5
    //   282: ldc -36
    //   284: invokevirtual 109	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   287: invokestatic 115	com/tencent/mm/plugin/appbrand/n/c:jM	(I)I
    //   290: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   293: putfield 223	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQu	Ljava/lang/Integer;
    //   296: aload_1
    //   297: aload 5
    //   299: ldc -31
    //   301: invokevirtual 109	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   304: invokestatic 115	com/tencent/mm/plugin/appbrand/n/c:jM	(I)I
    //   307: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   310: putfield 228	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQI	Ljava/lang/Integer;
    //   313: aload_1
    //   314: aload 5
    //   316: ldc -26
    //   318: invokevirtual 234	org/json/JSONObject:opt	(Ljava/lang/String;)Ljava/lang/Object;
    //   321: invokestatic 240	com/tencent/mm/plugin/appbrand/widget/input/b/d:aU	(Ljava/lang/Object;)Ljava/lang/Integer;
    //   324: putfield 243	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQL	Ljava/lang/Integer;
    //   327: aload_1
    //   328: getfield 243	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQL	Ljava/lang/Integer;
    //   331: ifnull +20 -> 351
    //   334: aload_1
    //   335: aload_1
    //   336: getfield 243	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQL	Ljava/lang/Integer;
    //   339: invokevirtual 247	java/lang/Integer:intValue	()I
    //   342: invokestatic 115	com/tencent/mm/plugin/appbrand/n/c:jM	(I)I
    //   345: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   348: putfield 243	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQL	Ljava/lang/Integer;
    //   351: aload_1
    //   352: aload 5
    //   354: ldc -7
    //   356: invokevirtual 234	org/json/JSONObject:opt	(Ljava/lang/String;)Ljava/lang/Object;
    //   359: invokestatic 240	com/tencent/mm/plugin/appbrand/widget/input/b/d:aU	(Ljava/lang/Object;)Ljava/lang/Integer;
    //   362: putfield 252	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQM	Ljava/lang/Integer;
    //   365: aload_1
    //   366: getfield 252	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQM	Ljava/lang/Integer;
    //   369: ifnull +20 -> 389
    //   372: aload_1
    //   373: aload_1
    //   374: getfield 252	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQM	Ljava/lang/Integer;
    //   377: invokevirtual 247	java/lang/Integer:intValue	()I
    //   380: invokestatic 115	com/tencent/mm/plugin/appbrand/n/c:jM	(I)I
    //   383: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   386: putfield 252	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQM	Ljava/lang/Integer;
    //   389: aload_1
    //   390: aload_2
    //   391: ldc -2
    //   393: invokevirtual 258	org/json/JSONObject:getBoolean	(Ljava/lang/String;)Z
    //   396: invokestatic 263	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   399: putfield 267	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQG	Ljava/lang/Boolean;
    //   402: aload_1
    //   403: aload_2
    //   404: ldc_w 269
    //   407: aload_2
    //   408: ldc_w 271
    //   411: aconst_null
    //   412: invokevirtual 184	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   415: invokevirtual 184	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   418: putfield 274	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQk	Ljava/lang/String;
    //   421: aload_1
    //   422: aload_2
    //   423: ldc_w 276
    //   426: invokevirtual 109	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   429: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   432: putfield 279	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQx	Ljava/lang/Integer;
    //   435: aload_1
    //   436: aload_2
    //   437: ldc_w 281
    //   440: invokevirtual 283	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   443: putfield 286	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQy	Ljava/lang/String;
    //   446: new 96	org/json/JSONObject
    //   449: dup
    //   450: aload_2
    //   451: ldc_w 288
    //   454: invokevirtual 102	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   457: invokespecial 103	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   460: astore_3
    //   461: aload_1
    //   462: aload_3
    //   463: ldc -51
    //   465: invokevirtual 102	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   468: invokestatic 210	android/graphics/Color:parseColor	(Ljava/lang/String;)I
    //   471: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   474: putfield 291	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQB	Ljava/lang/Integer;
    //   477: aload_1
    //   478: aload_3
    //   479: ldc -36
    //   481: invokevirtual 109	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   484: invokestatic 115	com/tencent/mm/plugin/appbrand/n/c:jM	(I)I
    //   487: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   490: putfield 294	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQA	Ljava/lang/Integer;
    //   493: aload_1
    //   494: aload_3
    //   495: ldc -76
    //   497: ldc_w 296
    //   500: invokevirtual 184	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   503: putfield 299	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQz	Ljava/lang/String;
    //   506: aload_1
    //   507: aload_2
    //   508: ldc_w 301
    //   511: iconst_0
    //   512: invokevirtual 305	org/json/JSONObject:optBoolean	(Ljava/lang/String;Z)Z
    //   515: invokestatic 263	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   518: putfield 308	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQD	Ljava/lang/Boolean;
    //   521: aload_1
    //   522: aload_2
    //   523: ldc_w 310
    //   526: invokevirtual 258	org/json/JSONObject:getBoolean	(Ljava/lang/String;)Z
    //   529: invokestatic 263	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   532: putfield 313	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQC	Ljava/lang/Boolean;
    //   535: aload_1
    //   536: aload_2
    //   537: ldc_w 315
    //   540: invokevirtual 258	org/json/JSONObject:getBoolean	(Ljava/lang/String;)Z
    //   543: invokestatic 263	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   546: putfield 318	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQH	Ljava/lang/Boolean;
    //   549: aload_1
    //   550: aload_2
    //   551: ldc_w 320
    //   554: invokevirtual 283	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   557: invokestatic 326	com/tencent/mm/plugin/appbrand/widget/input/b/b:sV	(Ljava/lang/String;)Lcom/tencent/mm/plugin/appbrand/widget/input/b/b;
    //   560: putfield 330	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQJ	Lcom/tencent/mm/plugin/appbrand/widget/input/b/b;
    //   563: aload_1
    //   564: aload_2
    //   565: ldc_w 332
    //   568: invokevirtual 258	org/json/JSONObject:getBoolean	(Ljava/lang/String;)Z
    //   571: invokestatic 263	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   574: putfield 335	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQK	Ljava/lang/Boolean;
    //   577: ldc2_w 92
    //   580: ldc 94
    //   582: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   585: iconst_1
    //   586: ireturn
    //   587: astore_3
    //   588: aload_1
    //   589: aconst_null
    //   590: putfield 228	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQI	Ljava/lang/Integer;
    //   593: goto -280 -> 313
    //   596: astore_3
    //   597: aload_1
    //   598: aconst_null
    //   599: putfield 313	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQC	Ljava/lang/Boolean;
    //   602: goto -67 -> 535
    //   605: astore_3
    //   606: aload_1
    //   607: aconst_null
    //   608: putfield 318	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQH	Ljava/lang/Boolean;
    //   611: goto -62 -> 549
    //   614: astore_2
    //   615: aload_1
    //   616: aconst_null
    //   617: putfield 335	com/tencent/mm/plugin/appbrand/widget/input/b/f:iQK	Ljava/lang/Boolean;
    //   620: goto -43 -> 577
    //   623: astore_3
    //   624: goto -118 -> 506
    //   627: astore_3
    //   628: goto -193 -> 435
    //   631: astore_3
    //   632: goto -230 -> 402
    //   635: astore_3
    //   636: goto -340 -> 296
    //   639: astore_3
    //   640: goto -361 -> 279
    //   643: astore_3
    //   644: goto -382 -> 262
    //   647: astore_3
    //   648: goto -415 -> 233
    //   651: astore_3
    //   652: goto -436 -> 216
    //   655: astore 6
    //   657: goto -519 -> 138
    //   660: astore 6
    //   662: goto -605 -> 57
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	665	0	this	a
    //   0	665	1	paramP	P
    //   0	665	2	paramJSONObject	org.json.JSONObject
    //   0	665	3	paramAppBrandPageView	AppBrandPageView
    //   0	665	4	paramInt	int
    //   21	332	5	localJSONObject	org.json.JSONObject
    //   133	23	6	localException1	Exception
    //   655	1	6	localException2	Exception
    //   660	1	6	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   8	23	133	java/lang/Exception
    //   296	313	587	java/lang/Exception
    //   521	535	596	java/lang/Exception
    //   535	549	605	java/lang/Exception
    //   563	577	614	java/lang/Exception
    //   446	506	623	java/lang/Exception
    //   421	435	627	java/lang/Exception
    //   389	402	631	java/lang/Exception
    //   279	296	635	java/lang/Exception
    //   262	279	639	java/lang/Exception
    //   245	262	643	java/lang/Exception
    //   216	233	647	java/lang/Exception
    //   199	216	651	java/lang/Exception
    //   23	40	655	java/lang/Exception
    //   57	91	655	java/lang/Exception
    //   40	57	660	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */