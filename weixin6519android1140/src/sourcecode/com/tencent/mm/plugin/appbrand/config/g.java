package com.tencent.mm.plugin.appbrand.config;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.af;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;

public final class g
{
  public g()
  {
    GMTrace.i(15531272830976L, 115717);
    GMTrace.o(15531272830976L, 115717);
  }
  
  private static <T> JSONArray R(List<T> paramList)
  {
    GMTrace.i(15531675484160L, 115720);
    JSONArray localJSONArray = new JSONArray();
    if (!bg.cc(paramList))
    {
      paramList = paramList.iterator();
      while (paramList.hasNext()) {
        localJSONArray.put(paramList.next());
      }
    }
    GMTrace.o(15531675484160L, 115720);
    return localJSONArray;
  }
  
  /* Error */
  static WxaAttributes a(n paramn)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc2_w 64
    //   5: ldc 66
    //   7: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: new 68	com/tencent/mm/plugin/appbrand/config/WxaAttributes
    //   13: dup
    //   14: invokespecial 69	com/tencent/mm/plugin/appbrand/config/WxaAttributes:<init>	()V
    //   17: astore_3
    //   18: aload_3
    //   19: aload_0
    //   20: getfield 75	com/tencent/mm/plugin/appbrand/config/n:field_brandId	Ljava/lang/String;
    //   23: putfield 78	com/tencent/mm/plugin/appbrand/config/WxaAttributes:field_username	Ljava/lang/String;
    //   26: aload_3
    //   27: aload_0
    //   28: getfield 81	com/tencent/mm/plugin/appbrand/config/n:field_appId	Ljava/lang/String;
    //   31: putfield 82	com/tencent/mm/plugin/appbrand/config/WxaAttributes:field_appId	Ljava/lang/String;
    //   34: aload_3
    //   35: aload_0
    //   36: getfield 85	com/tencent/mm/plugin/appbrand/config/n:field_appName	Ljava/lang/String;
    //   39: putfield 88	com/tencent/mm/plugin/appbrand/config/WxaAttributes:field_nickname	Ljava/lang/String;
    //   42: aload_3
    //   43: aload_0
    //   44: getfield 91	com/tencent/mm/plugin/appbrand/config/n:field_appIcon	Ljava/lang/String;
    //   47: putfield 94	com/tencent/mm/plugin/appbrand/config/WxaAttributes:field_brandIconURL	Ljava/lang/String;
    //   50: aload_3
    //   51: aload_0
    //   52: getfield 97	com/tencent/mm/plugin/appbrand/config/n:field_roundedSquareIcon	Ljava/lang/String;
    //   55: putfield 100	com/tencent/mm/plugin/appbrand/config/WxaAttributes:field_roundedSquareIconURL	Ljava/lang/String;
    //   58: aload_3
    //   59: aload_0
    //   60: getfield 103	com/tencent/mm/plugin/appbrand/config/n:field_BigHeadImgUrl	Ljava/lang/String;
    //   63: putfield 106	com/tencent/mm/plugin/appbrand/config/WxaAttributes:field_bigHeadURL	Ljava/lang/String;
    //   66: aload_3
    //   67: aconst_null
    //   68: putfield 109	com/tencent/mm/plugin/appbrand/config/WxaAttributes:field_smallHeadURL	Ljava/lang/String;
    //   71: aload_3
    //   72: aload_0
    //   73: getfield 112	com/tencent/mm/plugin/appbrand/config/n:field_signature	Ljava/lang/String;
    //   76: putfield 113	com/tencent/mm/plugin/appbrand/config/WxaAttributes:field_signature	Ljava/lang/String;
    //   79: aload_3
    //   80: aload_0
    //   81: getfield 117	com/tencent/mm/plugin/appbrand/config/n:field_AppOpt	I
    //   84: putfield 120	com/tencent/mm/plugin/appbrand/config/WxaAttributes:field_appOpt	I
    //   87: new 122	org/json/JSONObject
    //   90: dup
    //   91: invokespecial 123	org/json/JSONObject:<init>	()V
    //   94: astore 4
    //   96: aload 4
    //   98: ldc 125
    //   100: aload_3
    //   101: getfield 82	com/tencent/mm/plugin/appbrand/config/WxaAttributes:field_appId	Ljava/lang/String;
    //   104: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   107: pop
    //   108: new 122	org/json/JSONObject
    //   111: dup
    //   112: invokespecial 123	org/json/JSONObject:<init>	()V
    //   115: astore_1
    //   116: aload_1
    //   117: ldc -125
    //   119: aload_0
    //   120: getfield 135	com/tencent/mm/plugin/appbrand/config/n:field_appInfo	Lcom/tencent/mm/protocal/c/buo;
    //   123: getfield 141	com/tencent/mm/protocal/c/buo:vcX	Lcom/tencent/mm/protocal/c/cx;
    //   126: getfield 147	com/tencent/mm/protocal/c/cx:tQW	J
    //   129: invokestatic 153	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   132: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   135: pop
    //   136: aload_1
    //   137: ldc -101
    //   139: aload_0
    //   140: getfield 135	com/tencent/mm/plugin/appbrand/config/n:field_appInfo	Lcom/tencent/mm/protocal/c/buo;
    //   143: getfield 141	com/tencent/mm/protocal/c/buo:vcX	Lcom/tencent/mm/protocal/c/cx;
    //   146: getfield 158	com/tencent/mm/protocal/c/cx:tRd	Ljava/lang/String;
    //   149: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   152: pop
    //   153: aload 4
    //   155: ldc -96
    //   157: aload_1
    //   158: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   161: pop
    //   162: new 122	org/json/JSONObject
    //   165: dup
    //   166: invokespecial 123	org/json/JSONObject:<init>	()V
    //   169: astore 5
    //   171: aload_0
    //   172: getfield 135	com/tencent/mm/plugin/appbrand/config/n:field_appInfo	Lcom/tencent/mm/protocal/c/buo;
    //   175: getfield 164	com/tencent/mm/protocal/c/buo:vcV	Lcom/tencent/mm/protocal/c/apy;
    //   178: astore 6
    //   180: aload 6
    //   182: ifnonnull +570 -> 752
    //   185: aconst_null
    //   186: astore_1
    //   187: aload 5
    //   189: ldc -90
    //   191: aload_1
    //   192: invokestatic 168	com/tencent/mm/plugin/appbrand/config/g:R	(Ljava/util/List;)Lorg/json/JSONArray;
    //   195: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   198: pop
    //   199: aload 6
    //   201: ifnonnull +560 -> 761
    //   204: aconst_null
    //   205: astore_1
    //   206: aload 5
    //   208: ldc -86
    //   210: aload_1
    //   211: invokestatic 168	com/tencent/mm/plugin/appbrand/config/g:R	(Ljava/util/List;)Lorg/json/JSONArray;
    //   214: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   217: pop
    //   218: aload 6
    //   220: ifnonnull +550 -> 770
    //   223: aconst_null
    //   224: astore_1
    //   225: aload 5
    //   227: ldc -84
    //   229: aload_1
    //   230: invokestatic 168	com/tencent/mm/plugin/appbrand/config/g:R	(Ljava/util/List;)Lorg/json/JSONArray;
    //   233: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   236: pop
    //   237: aload 6
    //   239: ifnonnull +540 -> 779
    //   242: aload_2
    //   243: astore_1
    //   244: aload 5
    //   246: ldc -82
    //   248: aload_1
    //   249: invokestatic 168	com/tencent/mm/plugin/appbrand/config/g:R	(Ljava/util/List;)Lorg/json/JSONArray;
    //   252: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   255: pop
    //   256: aload 4
    //   258: ldc -80
    //   260: aload 5
    //   262: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   265: pop
    //   266: aload_3
    //   267: aload 4
    //   269: invokevirtual 180	org/json/JSONObject:toString	()Ljava/lang/String;
    //   272: putfield 182	com/tencent/mm/plugin/appbrand/config/WxaAttributes:field_appInfo	Ljava/lang/String;
    //   275: new 122	org/json/JSONObject
    //   278: dup
    //   279: invokespecial 123	org/json/JSONObject:<init>	()V
    //   282: astore_1
    //   283: aload_0
    //   284: getfield 135	com/tencent/mm/plugin/appbrand/config/n:field_appInfo	Lcom/tencent/mm/protocal/c/buo;
    //   287: ifnull +188 -> 475
    //   290: aload_0
    //   291: getfield 135	com/tencent/mm/plugin/appbrand/config/n:field_appInfo	Lcom/tencent/mm/protocal/c/buo;
    //   294: getfield 186	com/tencent/mm/protocal/c/buo:vcU	Lcom/tencent/mm/protocal/c/cy;
    //   297: ifnull +178 -> 475
    //   300: new 122	org/json/JSONObject
    //   303: dup
    //   304: invokespecial 123	org/json/JSONObject:<init>	()V
    //   307: astore_2
    //   308: aload_0
    //   309: getfield 135	com/tencent/mm/plugin/appbrand/config/n:field_appInfo	Lcom/tencent/mm/protocal/c/buo;
    //   312: getfield 186	com/tencent/mm/protocal/c/buo:vcU	Lcom/tencent/mm/protocal/c/cy;
    //   315: astore 4
    //   317: aload_2
    //   318: ldc -68
    //   320: aload 4
    //   322: getfield 193	com/tencent/mm/protocal/c/cy:tRe	I
    //   325: invokestatic 198	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   328: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   331: pop
    //   332: aload_2
    //   333: ldc -56
    //   335: aload 4
    //   337: getfield 203	com/tencent/mm/protocal/c/cy:tRf	I
    //   340: invokestatic 198	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   343: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   346: pop
    //   347: aload_2
    //   348: ldc -51
    //   350: aload 4
    //   352: getfield 208	com/tencent/mm/protocal/c/cy:tRg	I
    //   355: invokestatic 198	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   358: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   361: pop
    //   362: aload_2
    //   363: ldc -46
    //   365: aload 4
    //   367: getfield 213	com/tencent/mm/protocal/c/cy:tRh	I
    //   370: invokestatic 198	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   373: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   376: pop
    //   377: aload_2
    //   378: ldc -41
    //   380: aload 4
    //   382: getfield 218	com/tencent/mm/protocal/c/cy:tRi	I
    //   385: invokestatic 198	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   388: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   391: pop
    //   392: aload_2
    //   393: ldc -36
    //   395: aload 4
    //   397: getfield 223	com/tencent/mm/protocal/c/cy:tRj	I
    //   400: invokestatic 198	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   403: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   406: pop
    //   407: aload_2
    //   408: ldc -31
    //   410: aload 4
    //   412: getfield 228	com/tencent/mm/protocal/c/cy:tRk	I
    //   415: invokestatic 198	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   418: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   421: pop
    //   422: aload_2
    //   423: ldc -26
    //   425: aload 4
    //   427: getfield 233	com/tencent/mm/protocal/c/cy:hQU	I
    //   430: invokestatic 198	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   433: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   436: pop
    //   437: aload_2
    //   438: ldc -21
    //   440: aload 4
    //   442: getfield 238	com/tencent/mm/protocal/c/cy:tRl	I
    //   445: invokestatic 198	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   448: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   451: pop
    //   452: aload_2
    //   453: ldc -16
    //   455: aload 4
    //   457: getfield 243	com/tencent/mm/protocal/c/cy:hQW	I
    //   460: invokestatic 198	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   463: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   466: pop
    //   467: aload_1
    //   468: ldc -11
    //   470: aload_2
    //   471: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   474: pop
    //   475: aload_0
    //   476: getfield 249	com/tencent/mm/plugin/appbrand/config/n:field_versionInfo	Lcom/tencent/mm/protocal/c/buu;
    //   479: ifnull +103 -> 582
    //   482: aload_0
    //   483: getfield 249	com/tencent/mm/plugin/appbrand/config/n:field_versionInfo	Lcom/tencent/mm/protocal/c/buu;
    //   486: getfield 255	com/tencent/mm/protocal/c/buu:uft	Ljava/util/LinkedList;
    //   489: ifnull +93 -> 582
    //   492: new 30	org/json/JSONArray
    //   495: dup
    //   496: invokespecial 31	org/json/JSONArray:<init>	()V
    //   499: astore_2
    //   500: aload_0
    //   501: getfield 249	com/tencent/mm/plugin/appbrand/config/n:field_versionInfo	Lcom/tencent/mm/protocal/c/buu;
    //   504: getfield 255	com/tencent/mm/protocal/c/buu:uft	Ljava/util/LinkedList;
    //   507: invokevirtual 258	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   510: astore 4
    //   512: aload 4
    //   514: invokeinterface 49 1 0
    //   519: ifeq +269 -> 788
    //   522: aload 4
    //   524: invokeinterface 53 1 0
    //   529: checkcast 260	com/tencent/mm/protocal/c/jx
    //   532: astore 5
    //   534: new 122	org/json/JSONObject
    //   537: dup
    //   538: invokespecial 123	org/json/JSONObject:<init>	()V
    //   541: astore 6
    //   543: aload 6
    //   545: ldc_w 262
    //   548: aload 5
    //   550: getfield 265	com/tencent/mm/protocal/c/jx:uau	Ljava/lang/String;
    //   553: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   556: pop
    //   557: aload 6
    //   559: ldc_w 267
    //   562: aload 5
    //   564: getfield 270	com/tencent/mm/protocal/c/jx:uav	Ljava/lang/String;
    //   567: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   570: pop
    //   571: aload_2
    //   572: aload 6
    //   574: invokevirtual 57	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   577: pop
    //   578: goto -66 -> 512
    //   581: astore_2
    //   582: aload_3
    //   583: aload_1
    //   584: invokevirtual 180	org/json/JSONObject:toString	()Ljava/lang/String;
    //   587: putfield 273	com/tencent/mm/plugin/appbrand/config/WxaAttributes:field_dynamicInfo	Ljava/lang/String;
    //   590: aload_0
    //   591: getfield 277	com/tencent/mm/plugin/appbrand/config/n:field_bindInfo	Lcom/tencent/mm/protocal/c/gr;
    //   594: ifnull +136 -> 730
    //   597: aload_0
    //   598: getfield 277	com/tencent/mm/plugin/appbrand/config/n:field_bindInfo	Lcom/tencent/mm/protocal/c/gr;
    //   601: getfield 282	com/tencent/mm/protocal/c/gr:tVr	Ljava/util/LinkedList;
    //   604: ifnull +126 -> 730
    //   607: new 122	org/json/JSONObject
    //   610: dup
    //   611: invokespecial 123	org/json/JSONObject:<init>	()V
    //   614: astore_1
    //   615: new 30	org/json/JSONArray
    //   618: dup
    //   619: invokespecial 31	org/json/JSONArray:<init>	()V
    //   622: astore_2
    //   623: aload_0
    //   624: getfield 277	com/tencent/mm/plugin/appbrand/config/n:field_bindInfo	Lcom/tencent/mm/protocal/c/gr;
    //   627: getfield 282	com/tencent/mm/protocal/c/gr:tVr	Ljava/util/LinkedList;
    //   630: invokevirtual 258	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   633: astore_0
    //   634: aload_0
    //   635: invokeinterface 49 1 0
    //   640: ifeq +160 -> 800
    //   643: aload_0
    //   644: invokeinterface 53 1 0
    //   649: checkcast 284	com/tencent/mm/protocal/c/bvb
    //   652: astore 4
    //   654: new 122	org/json/JSONObject
    //   657: dup
    //   658: invokespecial 123	org/json/JSONObject:<init>	()V
    //   661: astore 5
    //   663: aload 5
    //   665: ldc_w 286
    //   668: aload 4
    //   670: getfield 288	com/tencent/mm/protocal/c/bvb:username	Ljava/lang/String;
    //   673: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   676: pop
    //   677: aload 5
    //   679: ldc_w 290
    //   682: aload 4
    //   684: getfield 293	com/tencent/mm/protocal/c/bvb:nDw	Ljava/lang/String;
    //   687: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   690: pop
    //   691: aload 5
    //   693: ldc_w 295
    //   696: aload 4
    //   698: getfield 297	com/tencent/mm/protocal/c/bvb:title	Ljava/lang/String;
    //   701: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   704: pop
    //   705: aload 5
    //   707: ldc_w 299
    //   710: aload 4
    //   712: getfield 302	com/tencent/mm/protocal/c/bvb:gvO	Ljava/lang/String;
    //   715: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   718: pop
    //   719: aload_2
    //   720: aload 5
    //   722: invokevirtual 57	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   725: pop
    //   726: goto -92 -> 634
    //   729: astore_0
    //   730: aload_3
    //   731: lconst_0
    //   732: putfield 305	com/tencent/mm/plugin/appbrand/config/WxaAttributes:field_syncTimeSecond	J
    //   735: aload_3
    //   736: ldc_w 307
    //   739: putfield 310	com/tencent/mm/plugin/appbrand/config/WxaAttributes:field_syncVersion	Ljava/lang/String;
    //   742: ldc2_w 64
    //   745: ldc 66
    //   747: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   750: aload_3
    //   751: areturn
    //   752: aload 6
    //   754: getfield 315	com/tencent/mm/protocal/c/apy:uFT	Ljava/util/LinkedList;
    //   757: astore_1
    //   758: goto -571 -> 187
    //   761: aload 6
    //   763: getfield 318	com/tencent/mm/protocal/c/apy:uFU	Ljava/util/LinkedList;
    //   766: astore_1
    //   767: goto -561 -> 206
    //   770: aload 6
    //   772: getfield 321	com/tencent/mm/protocal/c/apy:uFV	Ljava/util/LinkedList;
    //   775: astore_1
    //   776: goto -551 -> 225
    //   779: aload 6
    //   781: getfield 324	com/tencent/mm/protocal/c/apy:uFW	Ljava/util/LinkedList;
    //   784: astore_1
    //   785: goto -541 -> 244
    //   788: aload_1
    //   789: ldc_w 326
    //   792: aload_2
    //   793: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   796: pop
    //   797: goto -215 -> 582
    //   800: aload_1
    //   801: ldc_w 328
    //   804: aload_2
    //   805: invokevirtual 129	org/json/JSONObject:putOpt	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   808: pop
    //   809: aload_3
    //   810: aload_1
    //   811: invokevirtual 180	org/json/JSONObject:toString	()Ljava/lang/String;
    //   814: putfield 331	com/tencent/mm/plugin/appbrand/config/WxaAttributes:field_bindWxaInfo	Ljava/lang/String;
    //   817: goto -87 -> 730
    //   820: astore_1
    //   821: goto -231 -> 590
    //   824: astore_2
    //   825: goto -350 -> 475
    //   828: astore_1
    //   829: goto -554 -> 275
    //   832: astore_1
    //   833: goto -567 -> 266
    //   836: astore_1
    //   837: goto -675 -> 162
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	840	0	paramn	n
    //   115	696	1	localObject1	Object
    //   820	1	1	localException1	Exception
    //   828	1	1	localException2	Exception
    //   832	1	1	localException3	Exception
    //   836	1	1	localException4	Exception
    //   1	571	2	localObject2	Object
    //   581	1	2	localException5	Exception
    //   622	183	2	localJSONArray	JSONArray
    //   824	1	2	localException6	Exception
    //   17	793	3	localWxaAttributes	WxaAttributes
    //   94	617	4	localObject3	Object
    //   169	552	5	localObject4	Object
    //   178	602	6	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   475	512	581	java/lang/Exception
    //   512	578	581	java/lang/Exception
    //   788	797	581	java/lang/Exception
    //   590	634	729	java/lang/Exception
    //   634	726	729	java/lang/Exception
    //   800	817	729	java/lang/Exception
    //   275	283	820	java/lang/Exception
    //   582	590	820	java/lang/Exception
    //   283	475	824	java/lang/Exception
    //   87	108	828	java/lang/Exception
    //   266	275	828	java/lang/Exception
    //   162	180	832	java/lang/Exception
    //   187	199	832	java/lang/Exception
    //   206	218	832	java/lang/Exception
    //   225	237	832	java/lang/Exception
    //   244	266	832	java/lang/Exception
    //   752	758	832	java/lang/Exception
    //   761	767	832	java/lang/Exception
    //   770	776	832	java/lang/Exception
    //   779	785	832	java/lang/Exception
    //   108	162	836	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\config\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */