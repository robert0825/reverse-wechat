package com.tencent.mm.plugin.order.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.HashMap;
import java.util.Map;

public final class h
  extends com.tencent.mm.wallet_core.g.a.h
{
  public MallOrderDetailObject nEY;
  private int nEZ;
  
  public h(String paramString)
  {
    this(paramString, null, -1);
    GMTrace.i(6629818892288L, 49396);
    GMTrace.o(6629818892288L, 49396);
  }
  
  public h(String paramString1, String paramString2)
  {
    this(paramString1, paramString2, -1);
    GMTrace.i(6629953110016L, 49397);
    GMTrace.o(6629953110016L, 49397);
  }
  
  public h(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(6630087327744L, 49398);
    this.nEY = null;
    this.nEZ = -1;
    HashMap localHashMap = new HashMap();
    localHashMap.put("trans_id", paramString1);
    if (!bg.nm(paramString2)) {
      localHashMap.put("bill_id", paramString2);
    }
    if (this.nEZ >= 0) {
      this.nEZ = paramInt;
    }
    x(localHashMap);
    GMTrace.o(6630087327744L, 49398);
  }
  
  /* Error */
  public final void a(int paramInt, String paramString, org.json.JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: ldc2_w 70
    //   3: ldc 72
    //   5: invokestatic 22	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_3
    //   9: ifnull +382 -> 391
    //   12: aload_0
    //   13: new 74	com/tencent/mm/plugin/order/model/MallOrderDetailObject
    //   16: dup
    //   17: invokespecial 75	com/tencent/mm/plugin/order/model/MallOrderDetailObject:<init>	()V
    //   20: putfield 38	com/tencent/mm/plugin/order/model/h:nEY	Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject;
    //   23: aload_0
    //   24: getfield 38	com/tencent/mm/plugin/order/model/h:nEY	Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject;
    //   27: astore 7
    //   29: aload_3
    //   30: ifnull +361 -> 391
    //   33: aload 7
    //   35: aload_3
    //   36: invokestatic 80	com/tencent/mm/plugin/order/model/MallTransactionObject:I	(Lorg/json/JSONObject;)Lcom/tencent/mm/plugin/order/model/MallTransactionObject;
    //   39: putfield 84	com/tencent/mm/plugin/order/model/MallOrderDetailObject:nDN	Lcom/tencent/mm/plugin/order/model/MallTransactionObject;
    //   42: aload_3
    //   43: ldc 86
    //   45: invokevirtual 92	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   48: astore 6
    //   50: aload 6
    //   52: ifnull +380 -> 432
    //   55: new 94	com/tencent/mm/plugin/order/model/MallOrderDetailObject$b
    //   58: dup
    //   59: invokespecial 95	com/tencent/mm/plugin/order/model/MallOrderDetailObject$b:<init>	()V
    //   62: astore_2
    //   63: aload_2
    //   64: aload 6
    //   66: ldc 97
    //   68: invokevirtual 101	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   71: putfield 105	com/tencent/mm/plugin/order/model/MallOrderDetailObject$b:nDW	Ljava/lang/String;
    //   74: aload_2
    //   75: aload 6
    //   77: ldc 107
    //   79: invokevirtual 111	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   82: putfield 113	com/tencent/mm/plugin/order/model/MallOrderDetailObject$b:time	I
    //   85: aload_2
    //   86: aload 6
    //   88: ldc 115
    //   90: invokevirtual 101	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   93: putfield 118	com/tencent/mm/plugin/order/model/MallOrderDetailObject$b:thumbUrl	Ljava/lang/String;
    //   96: aload_2
    //   97: aload 6
    //   99: ldc 120
    //   101: invokevirtual 101	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   104: putfield 123	com/tencent/mm/plugin/order/model/MallOrderDetailObject$b:lPE	Ljava/lang/String;
    //   107: aload_2
    //   108: aload 6
    //   110: ldc 125
    //   112: invokevirtual 101	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   115: putfield 128	com/tencent/mm/plugin/order/model/MallOrderDetailObject$b:nDX	Ljava/lang/String;
    //   118: aload 7
    //   120: aload_2
    //   121: putfield 132	com/tencent/mm/plugin/order/model/MallOrderDetailObject:nDO	Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$b;
    //   124: aload 7
    //   126: aload_3
    //   127: invokestatic 136	com/tencent/mm/plugin/order/model/MallOrderDetailObject:G	(Lorg/json/JSONObject;)Ljava/util/ArrayList;
    //   130: putfield 140	com/tencent/mm/plugin/order/model/MallOrderDetailObject:nDP	Ljava/util/ArrayList;
    //   133: aload_3
    //   134: ldc -114
    //   136: invokevirtual 146	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   139: astore 6
    //   141: aload 6
    //   143: ifnull +562 -> 705
    //   146: aload 6
    //   148: invokevirtual 152	org/json/JSONArray:length	()I
    //   151: ifne +350 -> 501
    //   154: goto +551 -> 705
    //   157: aload 7
    //   159: aload_2
    //   160: putfield 156	com/tencent/mm/plugin/order/model/MallOrderDetailObject:nDQ	Ljava/util/List;
    //   163: aload 7
    //   165: getfield 156	com/tencent/mm/plugin/order/model/MallOrderDetailObject:nDQ	Ljava/util/List;
    //   168: astore 6
    //   170: aload_3
    //   171: ldc -98
    //   173: invokevirtual 161	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   176: astore 8
    //   178: aload 8
    //   180: ifnull +89 -> 269
    //   183: aload 6
    //   185: astore_2
    //   186: aload 6
    //   188: ifnonnull +11 -> 199
    //   191: new 163	java/util/ArrayList
    //   194: dup
    //   195: invokespecial 164	java/util/ArrayList:<init>	()V
    //   198: astore_2
    //   199: new 166	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a
    //   202: dup
    //   203: invokespecial 167	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:<init>	()V
    //   206: astore 6
    //   208: aload 8
    //   210: ldc -87
    //   212: invokevirtual 172	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   215: ifeq +465 -> 680
    //   218: aload 6
    //   220: aload 8
    //   222: ldc -87
    //   224: invokevirtual 101	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   227: putfield 174	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:value	Ljava/lang/String;
    //   230: aload 6
    //   232: iconst_2
    //   233: putfield 177	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:type	I
    //   236: aload 8
    //   238: ldc -77
    //   240: iconst_0
    //   241: invokevirtual 182	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   244: istore_1
    //   245: iload_1
    //   246: iflt +23 -> 269
    //   249: iload_1
    //   250: aload 8
    //   252: invokevirtual 183	org/json/JSONObject:length	()I
    //   255: iconst_1
    //   256: iadd
    //   257: if_icmpgt +12 -> 269
    //   260: aload_2
    //   261: iload_1
    //   262: aload 6
    //   264: invokeinterface 189 3 0
    //   269: aload 7
    //   271: aload_3
    //   272: ldc -65
    //   274: invokevirtual 101	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   277: putfield 194	com/tencent/mm/plugin/order/model/MallOrderDetailObject:nDT	Ljava/lang/String;
    //   280: aload 7
    //   282: aload_3
    //   283: ldc -60
    //   285: invokevirtual 101	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   288: putfield 199	com/tencent/mm/plugin/order/model/MallOrderDetailObject:kIy	Ljava/lang/String;
    //   291: aload 7
    //   293: aload_3
    //   294: ldc -55
    //   296: invokevirtual 111	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   299: putfield 204	com/tencent/mm/plugin/order/model/MallOrderDetailObject:nDV	I
    //   302: aload 7
    //   304: getfield 132	com/tencent/mm/plugin/order/model/MallOrderDetailObject:nDO	Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$b;
    //   307: ifnull +24 -> 331
    //   310: aload 7
    //   312: getfield 204	com/tencent/mm/plugin/order/model/MallOrderDetailObject:nDV	I
    //   315: ifgt +16 -> 331
    //   318: aload 7
    //   320: aload 7
    //   322: getfield 132	com/tencent/mm/plugin/order/model/MallOrderDetailObject:nDO	Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$b;
    //   325: getfield 113	com/tencent/mm/plugin/order/model/MallOrderDetailObject$b:time	I
    //   328: putfield 204	com/tencent/mm/plugin/order/model/MallOrderDetailObject:nDV	I
    //   331: aload 7
    //   333: getfield 84	com/tencent/mm/plugin/order/model/MallOrderDetailObject:nDN	Lcom/tencent/mm/plugin/order/model/MallTransactionObject;
    //   336: ifnull +55 -> 391
    //   339: aload 7
    //   341: aload 7
    //   343: getfield 84	com/tencent/mm/plugin/order/model/MallOrderDetailObject:nDN	Lcom/tencent/mm/plugin/order/model/MallTransactionObject;
    //   346: getfield 207	com/tencent/mm/plugin/order/model/MallTransactionObject:nDU	Ljava/lang/String;
    //   349: putfield 208	com/tencent/mm/plugin/order/model/MallOrderDetailObject:nDU	Ljava/lang/String;
    //   352: aload 7
    //   354: aload 7
    //   356: getfield 84	com/tencent/mm/plugin/order/model/MallOrderDetailObject:nDN	Lcom/tencent/mm/plugin/order/model/MallTransactionObject;
    //   359: getfield 211	com/tencent/mm/plugin/order/model/MallTransactionObject:nEs	Ljava/lang/String;
    //   362: putfield 214	com/tencent/mm/plugin/order/model/MallOrderDetailObject:eIH	Ljava/lang/String;
    //   365: aload 7
    //   367: aload 7
    //   369: getfield 84	com/tencent/mm/plugin/order/model/MallOrderDetailObject:nDN	Lcom/tencent/mm/plugin/order/model/MallTransactionObject;
    //   372: getfield 217	com/tencent/mm/plugin/order/model/MallTransactionObject:nDS	I
    //   375: putfield 218	com/tencent/mm/plugin/order/model/MallOrderDetailObject:nDS	I
    //   378: aload 7
    //   380: aload 7
    //   382: getfield 84	com/tencent/mm/plugin/order/model/MallOrderDetailObject:nDN	Lcom/tencent/mm/plugin/order/model/MallTransactionObject;
    //   385: getfield 221	com/tencent/mm/plugin/order/model/MallTransactionObject:nDR	Ljava/util/List;
    //   388: putfield 222	com/tencent/mm/plugin/order/model/MallOrderDetailObject:nDR	Ljava/util/List;
    //   391: ldc2_w 70
    //   394: ldc 72
    //   396: invokestatic 25	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   399: return
    //   400: astore_2
    //   401: ldc -32
    //   403: aload_2
    //   404: ldc -30
    //   406: iconst_0
    //   407: anewarray 228	java/lang/Object
    //   410: invokestatic 234	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   413: goto -371 -> 42
    //   416: astore_2
    //   417: ldc -32
    //   419: aload_2
    //   420: ldc -30
    //   422: iconst_0
    //   423: anewarray 228	java/lang/Object
    //   426: invokestatic 234	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   429: goto -387 -> 42
    //   432: aconst_null
    //   433: astore_2
    //   434: goto -316 -> 118
    //   437: astore_2
    //   438: ldc -32
    //   440: aload_2
    //   441: ldc -30
    //   443: iconst_0
    //   444: anewarray 228	java/lang/Object
    //   447: invokestatic 234	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   450: goto -326 -> 124
    //   453: astore_2
    //   454: ldc -32
    //   456: aload_2
    //   457: ldc -30
    //   459: iconst_0
    //   460: anewarray 228	java/lang/Object
    //   463: invokestatic 234	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   466: goto -342 -> 124
    //   469: astore_2
    //   470: ldc -32
    //   472: aload_2
    //   473: ldc -30
    //   475: iconst_0
    //   476: anewarray 228	java/lang/Object
    //   479: invokestatic 234	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   482: goto -349 -> 133
    //   485: astore_2
    //   486: ldc -32
    //   488: aload_2
    //   489: ldc -30
    //   491: iconst_0
    //   492: anewarray 228	java/lang/Object
    //   495: invokestatic 234	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   498: goto -365 -> 133
    //   501: new 163	java/util/ArrayList
    //   504: dup
    //   505: invokespecial 164	java/util/ArrayList:<init>	()V
    //   508: astore_2
    //   509: iconst_0
    //   510: istore 4
    //   512: iconst_0
    //   513: istore_1
    //   514: iload_1
    //   515: aload 6
    //   517: invokevirtual 152	org/json/JSONArray:length	()I
    //   520: if_icmpge +157 -> 677
    //   523: aload 6
    //   525: iload_1
    //   526: invokevirtual 237	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   529: astore 8
    //   531: new 166	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a
    //   534: dup
    //   535: invokespecial 167	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:<init>	()V
    //   538: astore 9
    //   540: aload 8
    //   542: ldc -17
    //   544: invokevirtual 111	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   547: ifne +170 -> 717
    //   550: iconst_0
    //   551: istore 5
    //   553: aload 9
    //   555: iload 5
    //   557: putfield 243	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:jxU	Z
    //   560: aload 9
    //   562: aload 8
    //   564: ldc -11
    //   566: invokevirtual 101	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   569: putfield 247	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:name	Ljava/lang/String;
    //   572: aload 9
    //   574: getfield 247	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:name	Ljava/lang/String;
    //   577: invokestatic 253	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   580: ifeq +13 -> 593
    //   583: aload 9
    //   585: getfield 243	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:jxU	Z
    //   588: istore 4
    //   590: goto +120 -> 710
    //   593: iload 4
    //   595: ifeq +10 -> 605
    //   598: aload 9
    //   600: iload 4
    //   602: putfield 243	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:jxU	Z
    //   605: aload 9
    //   607: getfield 243	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:jxU	Z
    //   610: istore 4
    //   612: aload 9
    //   614: aload 8
    //   616: ldc -87
    //   618: invokevirtual 101	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   621: putfield 174	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:value	Ljava/lang/String;
    //   624: aload 9
    //   626: aload 8
    //   628: ldc 120
    //   630: invokevirtual 101	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   633: putfield 256	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:jumpUrl	Ljava/lang/String;
    //   636: aload 9
    //   638: aload 8
    //   640: ldc_w 258
    //   643: invokevirtual 111	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   646: putfield 261	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:jumpType	I
    //   649: aload_2
    //   650: aload 9
    //   652: invokeinterface 264 2 0
    //   657: pop
    //   658: goto +52 -> 710
    //   661: astore_2
    //   662: ldc -32
    //   664: aload_2
    //   665: ldc -30
    //   667: iconst_0
    //   668: anewarray 228	java/lang/Object
    //   671: invokestatic 234	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   674: goto -405 -> 269
    //   677: goto -520 -> 157
    //   680: aload 6
    //   682: iconst_1
    //   683: putfield 177	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:type	I
    //   686: goto -450 -> 236
    //   689: astore_2
    //   690: ldc -32
    //   692: aload_2
    //   693: ldc -30
    //   695: iconst_0
    //   696: anewarray 228	java/lang/Object
    //   699: invokestatic 234	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   702: goto -433 -> 269
    //   705: aconst_null
    //   706: astore_2
    //   707: goto -550 -> 157
    //   710: iload_1
    //   711: iconst_1
    //   712: iadd
    //   713: istore_1
    //   714: goto -200 -> 514
    //   717: iconst_1
    //   718: istore 5
    //   720: goto -167 -> 553
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	723	0	this	h
    //   0	723	1	paramInt	int
    //   0	723	2	paramString	String
    //   0	723	3	paramJSONObject	org.json.JSONObject
    //   510	101	4	bool1	boolean
    //   551	168	5	bool2	boolean
    //   48	633	6	localObject	Object
    //   27	354	7	localMallOrderDetailObject	MallOrderDetailObject
    //   176	463	8	localJSONObject	org.json.JSONObject
    //   538	113	9	locala	MallOrderDetailObject.a
    // Exception table:
    //   from	to	target	type
    //   33	42	400	org/json/JSONException
    //   33	42	416	java/lang/Exception
    //   42	50	437	org/json/JSONException
    //   55	118	437	org/json/JSONException
    //   118	124	437	org/json/JSONException
    //   42	50	453	java/lang/Exception
    //   55	118	453	java/lang/Exception
    //   118	124	453	java/lang/Exception
    //   124	133	469	org/json/JSONException
    //   124	133	485	java/lang/Exception
    //   133	141	661	org/json/JSONException
    //   146	154	661	org/json/JSONException
    //   157	178	661	org/json/JSONException
    //   191	199	661	org/json/JSONException
    //   199	236	661	org/json/JSONException
    //   236	245	661	org/json/JSONException
    //   249	269	661	org/json/JSONException
    //   501	509	661	org/json/JSONException
    //   514	550	661	org/json/JSONException
    //   553	590	661	org/json/JSONException
    //   598	605	661	org/json/JSONException
    //   605	658	661	org/json/JSONException
    //   680	686	661	org/json/JSONException
    //   133	141	689	java/lang/Exception
    //   146	154	689	java/lang/Exception
    //   157	178	689	java/lang/Exception
    //   191	199	689	java/lang/Exception
    //   199	236	689	java/lang/Exception
    //   236	245	689	java/lang/Exception
    //   249	269	689	java/lang/Exception
    //   501	509	689	java/lang/Exception
    //   514	550	689	java/lang/Exception
    //   553	590	689	java/lang/Exception
    //   598	605	689	java/lang/Exception
    //   605	658	689	java/lang/Exception
    //   680	686	689	java/lang/Exception
  }
  
  public final int aoD()
  {
    GMTrace.i(6630221545472L, 49399);
    GMTrace.o(6630221545472L, 49399);
    return 108;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\model\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */