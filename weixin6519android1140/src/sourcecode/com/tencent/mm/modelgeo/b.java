package com.tencent.mm.modelgeo;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.comm.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.sdk.platformtools.ar.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public final class b
  implements e
{
  public static String TAG;
  private static b gEL;
  public c gEM;
  private LinkedList<c> gEN;
  private HashMap<String, LinkedList<WeakReference<a>>> gEO;
  private ar gEP;
  public boolean gEQ;
  
  static
  {
    GMTrace.i(490968449024L, 3658);
    TAG = "MicroMsg.LocationAddr";
    GMTrace.o(490968449024L, 3658);
  }
  
  private b()
  {
    GMTrace.i(488820965376L, 3642);
    this.gEM = null;
    this.gEN = new LinkedList();
    this.gEO = new HashMap();
    this.gEP = new ar(1, "addr_worker");
    this.gEQ = true;
    GMTrace.o(488820965376L, 3642);
  }
  
  public static b Ip()
  {
    GMTrace.i(488955183104L, 3643);
    if (gEL == null) {
      gEL = new b();
    }
    b localb = gEL;
    GMTrace.o(488955183104L, 3643);
    return localb;
  }
  
  private void Iq()
  {
    GMTrace.i(489760489472L, 3649);
    if ((this.gEM == null) && (this.gEN != null) && (this.gEN.size() > 0))
    {
      this.gEM = ((c)this.gEN.removeFirst());
      if (bg.Jw())
      {
        this.gEP.c(new b());
        GMTrace.o(489760489472L, 3649);
        return;
      }
      h.wS().a(655, this);
      h.wS().a(new d(this.gEM.lat, this.gEM.lng), 0);
    }
    GMTrace.o(489760489472L, 3649);
  }
  
  /* Error */
  public static Addr a(double paramDouble1, double paramDouble2, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc2_w 139
    //   3: sipush 3651
    //   6: invokestatic 41	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: invokestatic 146	com/tencent/mm/sdk/platformtools/v:bPK	()Ljava/lang/String;
    //   12: astore 7
    //   14: new 148	com/tencent/mm/modelgeo/Addr
    //   17: dup
    //   18: invokespecial 149	com/tencent/mm/modelgeo/Addr:<init>	()V
    //   21: astore 11
    //   23: iload 4
    //   25: ifeq +279 -> 304
    //   28: ldc -105
    //   30: iconst_3
    //   31: anewarray 4	java/lang/Object
    //   34: dup
    //   35: iconst_0
    //   36: dload_0
    //   37: invokestatic 157	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   40: aastore
    //   41: dup
    //   42: iconst_1
    //   43: dload_2
    //   44: invokestatic 157	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   47: aastore
    //   48: dup
    //   49: iconst_2
    //   50: aload 7
    //   52: aastore
    //   53: invokestatic 163	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   56: astore 6
    //   58: getstatic 45	com/tencent/mm/modelgeo/b:TAG	Ljava/lang/String;
    //   61: new 165	java/lang/StringBuilder
    //   64: dup
    //   65: ldc -89
    //   67: invokespecial 170	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   70: aload 6
    //   72: invokevirtual 174	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: invokevirtual 177	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   78: invokestatic 183	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   81: aload 6
    //   83: aconst_null
    //   84: invokestatic 188	com/tencent/mm/network/b:a	(Ljava/lang/String;Lcom/tencent/mm/network/b$b;)Lcom/tencent/mm/network/u;
    //   87: astore 6
    //   89: aload 6
    //   91: astore 9
    //   93: aload 6
    //   95: sipush 10000
    //   98: invokevirtual 194	com/tencent/mm/network/u:setConnectTimeout	(I)V
    //   101: aload 6
    //   103: astore 9
    //   105: aload 6
    //   107: ldc -60
    //   109: invokevirtual 199	com/tencent/mm/network/u:setRequestMethod	(Ljava/lang/String;)V
    //   112: aload 6
    //   114: astore 9
    //   116: getstatic 45	com/tencent/mm/modelgeo/b:TAG	Ljava/lang/String;
    //   119: new 165	java/lang/StringBuilder
    //   122: dup
    //   123: ldc -55
    //   125: invokespecial 170	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   128: aload 6
    //   130: invokevirtual 204	com/tencent/mm/network/u:getResponseCode	()I
    //   133: invokevirtual 207	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   136: invokevirtual 177	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   139: invokestatic 183	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   142: aload 6
    //   144: astore 9
    //   146: new 209	java/io/InputStreamReader
    //   149: dup
    //   150: aload 6
    //   152: invokevirtual 213	com/tencent/mm/network/u:getInputStream	()Ljava/io/InputStream;
    //   155: invokespecial 216	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   158: astore 8
    //   160: aload 6
    //   162: astore 9
    //   164: new 218	java/io/BufferedReader
    //   167: dup
    //   168: aload 8
    //   170: invokespecial 221	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   173: astore 10
    //   175: aload 6
    //   177: astore 9
    //   179: new 223	java/lang/StringBuffer
    //   182: dup
    //   183: invokespecial 224	java/lang/StringBuffer:<init>	()V
    //   186: astore 12
    //   188: aload 6
    //   190: astore 9
    //   192: aload 10
    //   194: invokevirtual 227	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   197: astore 13
    //   199: aload 13
    //   201: ifnull +137 -> 338
    //   204: aload 6
    //   206: astore 9
    //   208: aload 12
    //   210: aload 13
    //   212: invokevirtual 230	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   215: pop
    //   216: goto -28 -> 188
    //   219: astore 9
    //   221: aload 6
    //   223: astore 7
    //   225: aload 8
    //   227: astore 6
    //   229: aload 9
    //   231: astore 8
    //   233: getstatic 45	com/tencent/mm/modelgeo/b:TAG	Ljava/lang/String;
    //   236: ldc -24
    //   238: invokestatic 183	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   241: getstatic 45	com/tencent/mm/modelgeo/b:TAG	Ljava/lang/String;
    //   244: ldc -22
    //   246: iconst_1
    //   247: anewarray 4	java/lang/Object
    //   250: dup
    //   251: iconst_0
    //   252: aload 8
    //   254: invokestatic 238	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   257: aastore
    //   258: invokestatic 242	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   261: aload 6
    //   263: astore 8
    //   265: aload 7
    //   267: ifnull +15 -> 282
    //   270: aload 7
    //   272: getfield 246	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
    //   275: invokevirtual 251	java/net/HttpURLConnection:disconnect	()V
    //   278: aload 6
    //   280: astore 8
    //   282: aload 8
    //   284: ifnull +8 -> 292
    //   287: aload 8
    //   289: invokevirtual 254	java/io/InputStreamReader:close	()V
    //   292: ldc2_w 139
    //   295: sipush 3651
    //   298: invokestatic 48	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   301: aload 11
    //   303: areturn
    //   304: ldc -105
    //   306: iconst_3
    //   307: anewarray 4	java/lang/Object
    //   310: dup
    //   311: iconst_0
    //   312: dload_0
    //   313: invokestatic 157	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   316: aastore
    //   317: dup
    //   318: iconst_1
    //   319: dload_2
    //   320: invokestatic 157	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   323: aastore
    //   324: dup
    //   325: iconst_2
    //   326: ldc_w 256
    //   329: aastore
    //   330: invokestatic 163	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   333: astore 6
    //   335: goto -277 -> 58
    //   338: aload 6
    //   340: astore 9
    //   342: getstatic 45	com/tencent/mm/modelgeo/b:TAG	Ljava/lang/String;
    //   345: new 165	java/lang/StringBuilder
    //   348: dup
    //   349: ldc_w 258
    //   352: invokespecial 170	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   355: aload 12
    //   357: invokevirtual 259	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   360: invokevirtual 174	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   363: invokevirtual 177	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   366: invokestatic 183	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   369: aload 6
    //   371: astore 9
    //   373: new 261	org/json/JSONObject
    //   376: dup
    //   377: aload 12
    //   379: invokevirtual 259	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   382: invokespecial 262	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   385: ldc_w 264
    //   388: invokevirtual 268	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   391: astore 12
    //   393: aload 6
    //   395: astore 9
    //   397: aload 12
    //   399: iconst_0
    //   400: invokevirtual 274	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   403: astore 10
    //   405: aload 6
    //   407: astore 9
    //   409: aload 11
    //   411: aload 10
    //   413: ldc_w 276
    //   416: invokevirtual 280	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   419: putfield 283	com/tencent/mm/modelgeo/Addr:gEy	Ljava/lang/String;
    //   422: aload 6
    //   424: astore 9
    //   426: aload 12
    //   428: iconst_0
    //   429: invokevirtual 274	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   432: ldc_w 285
    //   435: invokevirtual 268	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   438: astore 13
    //   440: iconst_0
    //   441: istore 5
    //   443: aload 6
    //   445: astore 9
    //   447: iload 5
    //   449: aload 13
    //   451: invokevirtual 288	org/json/JSONArray:length	()I
    //   454: if_icmpge +269 -> 723
    //   457: aload 6
    //   459: astore 9
    //   461: aload 13
    //   463: iload 5
    //   465: invokevirtual 274	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   468: astore 14
    //   470: aload 6
    //   472: astore 9
    //   474: aload 14
    //   476: ldc_w 290
    //   479: invokevirtual 280	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   482: astore 12
    //   484: aload 6
    //   486: astore 9
    //   488: aload 14
    //   490: ldc_w 292
    //   493: invokevirtual 268	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   496: iconst_0
    //   497: invokevirtual 295	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   500: astore 14
    //   502: aload 6
    //   504: astore 9
    //   506: aload 14
    //   508: ldc_w 297
    //   511: invokevirtual 301	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   514: ifeq +17 -> 531
    //   517: aload 6
    //   519: astore 9
    //   521: aload 11
    //   523: aload 12
    //   525: putfield 304	com/tencent/mm/modelgeo/Addr:gEz	Ljava/lang/String;
    //   528: goto +605 -> 1133
    //   531: aload 6
    //   533: astore 9
    //   535: aload 14
    //   537: ldc_w 306
    //   540: invokevirtual 301	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   543: ifeq +17 -> 560
    //   546: aload 6
    //   548: astore 9
    //   550: aload 11
    //   552: aload 12
    //   554: putfield 309	com/tencent/mm/modelgeo/Addr:gEA	Ljava/lang/String;
    //   557: goto +576 -> 1133
    //   560: aload 6
    //   562: astore 9
    //   564: aload 14
    //   566: ldc_w 311
    //   569: invokevirtual 301	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   572: ifeq +35 -> 607
    //   575: aload 6
    //   577: astore 9
    //   579: aload 11
    //   581: aload 12
    //   583: putfield 314	com/tencent/mm/modelgeo/Addr:gEC	Ljava/lang/String;
    //   586: goto +547 -> 1133
    //   589: astore 6
    //   591: aload 9
    //   593: ifnull +11 -> 604
    //   596: aload 9
    //   598: getfield 246	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
    //   601: invokevirtual 251	java/net/HttpURLConnection:disconnect	()V
    //   604: aload 6
    //   606: athrow
    //   607: aload 6
    //   609: astore 9
    //   611: aload 14
    //   613: ldc_w 316
    //   616: invokevirtual 301	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   619: ifeq +17 -> 636
    //   622: aload 6
    //   624: astore 9
    //   626: aload 11
    //   628: aload 12
    //   630: putfield 319	com/tencent/mm/modelgeo/Addr:gED	Ljava/lang/String;
    //   633: goto +500 -> 1133
    //   636: aload 6
    //   638: astore 9
    //   640: aload 14
    //   642: ldc_w 321
    //   645: invokevirtual 301	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   648: ifeq +17 -> 665
    //   651: aload 6
    //   653: astore 9
    //   655: aload 11
    //   657: aload 12
    //   659: putfield 324	com/tencent/mm/modelgeo/Addr:gEE	Ljava/lang/String;
    //   662: goto +471 -> 1133
    //   665: aload 6
    //   667: astore 9
    //   669: aload 14
    //   671: ldc_w 326
    //   674: invokevirtual 301	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   677: ifeq +17 -> 694
    //   680: aload 6
    //   682: astore 9
    //   684: aload 11
    //   686: aload 12
    //   688: putfield 329	com/tencent/mm/modelgeo/Addr:gEF	Ljava/lang/String;
    //   691: goto +442 -> 1133
    //   694: aload 6
    //   696: astore 9
    //   698: aload 14
    //   700: ldc_w 331
    //   703: invokevirtual 301	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   706: ifeq +427 -> 1133
    //   709: aload 6
    //   711: astore 9
    //   713: aload 11
    //   715: aload 12
    //   717: putfield 333	com/tencent/mm/modelgeo/Addr:country	Ljava/lang/String;
    //   720: goto +413 -> 1133
    //   723: aload 6
    //   725: astore 9
    //   727: aload 11
    //   729: getfield 283	com/tencent/mm/modelgeo/Addr:gEy	Ljava/lang/String;
    //   732: ldc_w 335
    //   735: invokestatic 341	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   738: astore 12
    //   740: aload 6
    //   742: astore 9
    //   744: aload 13
    //   746: invokevirtual 342	org/json/JSONArray:toString	()Ljava/lang/String;
    //   749: ldc_w 335
    //   752: invokestatic 341	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   755: astore 13
    //   757: aload 6
    //   759: astore 9
    //   761: aload 10
    //   763: ldc_w 344
    //   766: invokevirtual 347	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   769: invokevirtual 348	org/json/JSONObject:toString	()Ljava/lang/String;
    //   772: ldc_w 335
    //   775: invokestatic 341	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   778: astore 14
    //   780: aload 6
    //   782: astore 9
    //   784: aload 10
    //   786: ldc_w 350
    //   789: invokevirtual 280	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   792: ldc_w 335
    //   795: invokestatic 341	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   798: astore 15
    //   800: aload 6
    //   802: astore 9
    //   804: aload 10
    //   806: ldc_w 292
    //   809: invokevirtual 268	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   812: invokevirtual 342	org/json/JSONArray:toString	()Ljava/lang/String;
    //   815: ldc_w 335
    //   818: invokestatic 341	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   821: astore 10
    //   823: aload 6
    //   825: astore 9
    //   827: ldc_w 352
    //   830: iconst_2
    //   831: anewarray 4	java/lang/Object
    //   834: dup
    //   835: iconst_0
    //   836: dload_0
    //   837: invokestatic 157	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   840: aastore
    //   841: dup
    //   842: iconst_1
    //   843: dload_2
    //   844: invokestatic 157	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   847: aastore
    //   848: invokestatic 163	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   851: ldc_w 335
    //   854: invokestatic 341	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   857: astore 16
    //   859: aload 6
    //   861: astore 9
    //   863: getstatic 45	com/tencent/mm/modelgeo/b:TAG	Ljava/lang/String;
    //   866: ldc_w 354
    //   869: bipush 7
    //   871: anewarray 4	java/lang/Object
    //   874: dup
    //   875: iconst_0
    //   876: aload 12
    //   878: aastore
    //   879: dup
    //   880: iconst_1
    //   881: aload 13
    //   883: aastore
    //   884: dup
    //   885: iconst_2
    //   886: aload 14
    //   888: aastore
    //   889: dup
    //   890: iconst_3
    //   891: aload 15
    //   893: aastore
    //   894: dup
    //   895: iconst_4
    //   896: aload 10
    //   898: aastore
    //   899: dup
    //   900: iconst_5
    //   901: aload 16
    //   903: aastore
    //   904: dup
    //   905: bipush 6
    //   907: aload 7
    //   909: aastore
    //   910: invokestatic 356	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   913: aload 6
    //   915: astore 9
    //   917: getstatic 362	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   920: sipush 12886
    //   923: bipush 7
    //   925: anewarray 4	java/lang/Object
    //   928: dup
    //   929: iconst_0
    //   930: aload 13
    //   932: aastore
    //   933: dup
    //   934: iconst_1
    //   935: aload 12
    //   937: aastore
    //   938: dup
    //   939: iconst_2
    //   940: aload 14
    //   942: aastore
    //   943: dup
    //   944: iconst_3
    //   945: aload 15
    //   947: aastore
    //   948: dup
    //   949: iconst_4
    //   950: aload 10
    //   952: aastore
    //   953: dup
    //   954: iconst_5
    //   955: aload 16
    //   957: aastore
    //   958: dup
    //   959: bipush 6
    //   961: aload 7
    //   963: aastore
    //   964: invokevirtual 365	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
    //   967: aload 6
    //   969: getfield 246	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
    //   972: invokevirtual 251	java/net/HttpURLConnection:disconnect	()V
    //   975: goto -693 -> 282
    //   978: astore 10
    //   980: aconst_null
    //   981: astore 6
    //   983: aconst_null
    //   984: astore 7
    //   986: aload 6
    //   988: astore 9
    //   990: getstatic 45	com/tencent/mm/modelgeo/b:TAG	Ljava/lang/String;
    //   993: ldc_w 367
    //   996: invokestatic 183	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   999: aload 6
    //   1001: astore 9
    //   1003: getstatic 45	com/tencent/mm/modelgeo/b:TAG	Ljava/lang/String;
    //   1006: ldc -22
    //   1008: iconst_1
    //   1009: anewarray 4	java/lang/Object
    //   1012: dup
    //   1013: iconst_0
    //   1014: aload 10
    //   1016: invokestatic 238	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1019: aastore
    //   1020: invokestatic 242	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1023: aload 7
    //   1025: astore 8
    //   1027: aload 6
    //   1029: ifnull -747 -> 282
    //   1032: aload 6
    //   1034: getfield 246	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
    //   1037: invokevirtual 251	java/net/HttpURLConnection:disconnect	()V
    //   1040: aload 7
    //   1042: astore 8
    //   1044: goto -762 -> 282
    //   1047: astore 6
    //   1049: getstatic 45	com/tencent/mm/modelgeo/b:TAG	Ljava/lang/String;
    //   1052: ldc -22
    //   1054: iconst_1
    //   1055: anewarray 4	java/lang/Object
    //   1058: dup
    //   1059: iconst_0
    //   1060: aload 6
    //   1062: invokestatic 238	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1065: aastore
    //   1066: invokestatic 242	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1069: goto -777 -> 292
    //   1072: astore 6
    //   1074: aconst_null
    //   1075: astore 9
    //   1077: goto -486 -> 591
    //   1080: astore 6
    //   1082: aload 7
    //   1084: astore 9
    //   1086: goto -495 -> 591
    //   1089: astore 10
    //   1091: aconst_null
    //   1092: astore 7
    //   1094: goto -108 -> 986
    //   1097: astore 10
    //   1099: aload 8
    //   1101: astore 7
    //   1103: goto -117 -> 986
    //   1106: astore 8
    //   1108: aconst_null
    //   1109: astore 7
    //   1111: aconst_null
    //   1112: astore 6
    //   1114: goto -881 -> 233
    //   1117: astore 8
    //   1119: aconst_null
    //   1120: astore 9
    //   1122: aload 6
    //   1124: astore 7
    //   1126: aload 9
    //   1128: astore 6
    //   1130: goto -897 -> 233
    //   1133: iload 5
    //   1135: iconst_1
    //   1136: iadd
    //   1137: istore 5
    //   1139: goto -696 -> 443
    //   1142: astore 9
    //   1144: goto -11 -> 1133
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1147	0	paramDouble1	double
    //   0	1147	2	paramDouble2	double
    //   0	1147	4	paramBoolean	boolean
    //   441	697	5	i	int
    //   56	520	6	localObject1	Object
    //   589	379	6	localObject2	Object
    //   981	52	6	localObject3	Object
    //   1047	14	6	localIOException1	java.io.IOException
    //   1072	1	6	localObject4	Object
    //   1080	1	6	localObject5	Object
    //   1112	17	6	localObject6	Object
    //   12	1113	7	localObject7	Object
    //   158	942	8	localObject8	Object
    //   1106	1	8	localIOException2	java.io.IOException
    //   1117	1	8	localIOException3	java.io.IOException
    //   91	116	9	localObject9	Object
    //   219	11	9	localIOException4	java.io.IOException
    //   340	787	9	localObject10	Object
    //   1142	1	9	localException1	Exception
    //   173	778	10	localObject11	Object
    //   978	37	10	localException2	Exception
    //   1089	1	10	localException3	Exception
    //   1097	1	10	localException4	Exception
    //   21	707	11	localAddr	Addr
    //   186	750	12	localObject12	Object
    //   197	734	13	localObject13	Object
    //   468	473	14	localObject14	Object
    //   798	148	15	str1	String
    //   857	99	16	str2	String
    // Exception table:
    //   from	to	target	type
    //   164	175	219	java/io/IOException
    //   179	188	219	java/io/IOException
    //   192	199	219	java/io/IOException
    //   208	216	219	java/io/IOException
    //   342	369	219	java/io/IOException
    //   373	393	219	java/io/IOException
    //   397	405	219	java/io/IOException
    //   409	422	219	java/io/IOException
    //   426	440	219	java/io/IOException
    //   447	457	219	java/io/IOException
    //   461	470	219	java/io/IOException
    //   474	484	219	java/io/IOException
    //   488	502	219	java/io/IOException
    //   506	517	219	java/io/IOException
    //   521	528	219	java/io/IOException
    //   535	546	219	java/io/IOException
    //   550	557	219	java/io/IOException
    //   564	575	219	java/io/IOException
    //   579	586	219	java/io/IOException
    //   611	622	219	java/io/IOException
    //   626	633	219	java/io/IOException
    //   640	651	219	java/io/IOException
    //   655	662	219	java/io/IOException
    //   669	680	219	java/io/IOException
    //   684	691	219	java/io/IOException
    //   698	709	219	java/io/IOException
    //   713	720	219	java/io/IOException
    //   727	740	219	java/io/IOException
    //   744	757	219	java/io/IOException
    //   761	780	219	java/io/IOException
    //   784	800	219	java/io/IOException
    //   804	823	219	java/io/IOException
    //   827	859	219	java/io/IOException
    //   863	913	219	java/io/IOException
    //   917	967	219	java/io/IOException
    //   93	101	589	finally
    //   105	112	589	finally
    //   116	142	589	finally
    //   146	160	589	finally
    //   164	175	589	finally
    //   179	188	589	finally
    //   192	199	589	finally
    //   208	216	589	finally
    //   342	369	589	finally
    //   373	393	589	finally
    //   397	405	589	finally
    //   409	422	589	finally
    //   426	440	589	finally
    //   447	457	589	finally
    //   461	470	589	finally
    //   474	484	589	finally
    //   488	502	589	finally
    //   506	517	589	finally
    //   521	528	589	finally
    //   535	546	589	finally
    //   550	557	589	finally
    //   564	575	589	finally
    //   579	586	589	finally
    //   611	622	589	finally
    //   626	633	589	finally
    //   640	651	589	finally
    //   655	662	589	finally
    //   669	680	589	finally
    //   684	691	589	finally
    //   698	709	589	finally
    //   713	720	589	finally
    //   727	740	589	finally
    //   744	757	589	finally
    //   761	780	589	finally
    //   784	800	589	finally
    //   804	823	589	finally
    //   827	859	589	finally
    //   863	913	589	finally
    //   917	967	589	finally
    //   990	999	589	finally
    //   1003	1023	589	finally
    //   81	89	978	java/lang/Exception
    //   287	292	1047	java/io/IOException
    //   81	89	1072	finally
    //   233	261	1080	finally
    //   93	101	1089	java/lang/Exception
    //   105	112	1089	java/lang/Exception
    //   116	142	1089	java/lang/Exception
    //   146	160	1089	java/lang/Exception
    //   164	175	1097	java/lang/Exception
    //   179	188	1097	java/lang/Exception
    //   192	199	1097	java/lang/Exception
    //   208	216	1097	java/lang/Exception
    //   342	369	1097	java/lang/Exception
    //   373	393	1097	java/lang/Exception
    //   397	405	1097	java/lang/Exception
    //   409	422	1097	java/lang/Exception
    //   426	440	1097	java/lang/Exception
    //   447	457	1097	java/lang/Exception
    //   461	470	1097	java/lang/Exception
    //   727	740	1097	java/lang/Exception
    //   744	757	1097	java/lang/Exception
    //   761	780	1097	java/lang/Exception
    //   784	800	1097	java/lang/Exception
    //   804	823	1097	java/lang/Exception
    //   827	859	1097	java/lang/Exception
    //   863	913	1097	java/lang/Exception
    //   917	967	1097	java/lang/Exception
    //   81	89	1106	java/io/IOException
    //   93	101	1117	java/io/IOException
    //   105	112	1117	java/io/IOException
    //   116	142	1117	java/io/IOException
    //   146	160	1117	java/io/IOException
    //   474	484	1142	java/lang/Exception
    //   488	502	1142	java/lang/Exception
    //   506	517	1142	java/lang/Exception
    //   521	528	1142	java/lang/Exception
    //   535	546	1142	java/lang/Exception
    //   550	557	1142	java/lang/Exception
    //   564	575	1142	java/lang/Exception
    //   579	586	1142	java/lang/Exception
    //   611	622	1142	java/lang/Exception
    //   626	633	1142	java/lang/Exception
    //   640	651	1142	java/lang/Exception
    //   655	662	1142	java/lang/Exception
    //   669	680	1142	java/lang/Exception
    //   684	691	1142	java/lang/Exception
    //   698	709	1142	java/lang/Exception
    //   713	720	1142	java/lang/Exception
  }
  
  private static boolean a(LinkedList<WeakReference<a>> paramLinkedList, a parama)
  {
    GMTrace.i(489223618560L, 3645);
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)paramLinkedList.next();
      if ((localWeakReference != null) && (localWeakReference.get() != null) && (((a)localWeakReference.get()).equals(parama)))
      {
        GMTrace.o(489223618560L, 3645);
        return true;
      }
    }
    GMTrace.o(489223618560L, 3645);
    return false;
  }
  
  private static boolean b(LinkedList<WeakReference<a>> paramLinkedList, a parama)
  {
    GMTrace.i(489357836288L, 3646);
    if (paramLinkedList == null)
    {
      GMTrace.o(489357836288L, 3646);
      return false;
    }
    Iterator localIterator = paramLinkedList.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      if ((localWeakReference != null) && (localWeakReference.get() != null) && (((a)localWeakReference.get()).equals(parama)))
      {
        paramLinkedList.remove(localWeakReference);
        GMTrace.o(489357836288L, 3646);
        return true;
      }
    }
    GMTrace.o(489357836288L, 3646);
    return false;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(490163142656L, 3652);
    if (paramk.getType() == 655)
    {
      paramString = ((d)paramk).Iu();
      if ((paramString == null) || (paramString.gEy == null) || (paramString.gEy.equals("")))
      {
        this.gEP.c(new b());
        GMTrace.o(490163142656L, 3652);
        return;
      }
      a(paramString);
    }
    GMTrace.o(490163142656L, 3652);
  }
  
  public final void a(Addr paramAddr)
  {
    GMTrace.i(489894707200L, 3650);
    if (this.gEM == null)
    {
      GMTrace.o(489894707200L, 3650);
      return;
    }
    Addr localAddr = paramAddr;
    if (paramAddr == null) {
      localAddr = new Addr();
    }
    if (this.gEM.tag == null)
    {
      paramAddr = new Object();
      localAddr.tag = paramAddr;
      localAddr.gEJ = ((float)this.gEM.lat);
      localAddr.gEK = ((float)this.gEM.lng);
      if (!bg.nm(localAddr.gEA))
      {
        paramAddr = ab.getContext().getResources().getString(a.h.kcb);
        w.d(TAG, "city %s", new Object[] { paramAddr });
        if ((bg.Jw()) || (bg.nm(paramAddr)) || (!localAddr.gEA.endsWith(paramAddr))) {
          break label267;
        }
        localAddr.gEB = localAddr.gEA;
        localAddr.gEA = localAddr.gEA.substring(0, localAddr.gEA.length() - paramAddr.length());
      }
    }
    for (;;)
    {
      paramAddr = (LinkedList)this.gEO.get(this.gEM.toString());
      if (paramAddr == null) {
        break label330;
      }
      paramAddr = paramAddr.iterator();
      while (paramAddr.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)paramAddr.next();
        if ((localWeakReference != null) && (localWeakReference.get() != null)) {
          ((a)localWeakReference.get()).b(localAddr);
        }
      }
      paramAddr = this.gEM.tag;
      break;
      label267:
      if ((!bg.Jw()) && (!bg.nm(paramAddr)) && (localAddr.gEy.indexOf(paramAddr) >= 0)) {
        localAddr.gEB = (localAddr.gEA + paramAddr);
      } else {
        localAddr.gEB = localAddr.gEA;
      }
    }
    label330:
    this.gEO.remove(this.gEM.toString());
    w.d(TAG, "postexecute2 listeners %d", new Object[] { Integer.valueOf(this.gEO.size()) });
    this.gEM = null;
    Iq();
    if ((this.gEM == null) && (this.gEN.size() > 0)) {
      h.wS().b(655, this);
    }
    GMTrace.o(489894707200L, 3650);
  }
  
  public final boolean a(double paramDouble1, double paramDouble2, a parama)
  {
    GMTrace.i(489626271744L, 3648);
    boolean bool = a(paramDouble1, paramDouble2, parama, null);
    GMTrace.o(489626271744L, 3648);
    return bool;
  }
  
  public final boolean a(double paramDouble1, double paramDouble2, a parama, Object paramObject)
  {
    GMTrace.i(489492054016L, 3647);
    if (paramObject != null)
    {
      localObject = this.gEN.iterator();
      while (((Iterator)localObject).hasNext())
      {
        localc = (c)((Iterator)localObject).next();
        if ((localc != null) && (localc.tag != null) && (localc.tag.equals(paramObject))) {
          this.gEN.remove(localc);
        }
      }
    }
    c localc = new c(paramDouble1, paramDouble2, paramObject);
    Object localObject = (LinkedList)this.gEO.get(localc.toString());
    paramObject = localObject;
    if (localObject == null) {
      paramObject = new LinkedList();
    }
    if (!a((LinkedList)paramObject, parama)) {
      ((LinkedList)paramObject).add(new WeakReference(parama));
    }
    this.gEO.put(localc.toString(), paramObject);
    parama = this.gEN.iterator();
    while (parama.hasNext()) {
      if (((c)parama.next()).equals(localc))
      {
        Iq();
        GMTrace.o(489492054016L, 3647);
        return false;
      }
    }
    if ((this.gEM != null) && (localc.equals(this.gEM)))
    {
      GMTrace.o(489492054016L, 3647);
      return false;
    }
    this.gEN.add(localc);
    w.i(TAG, "push task size %d listeners %d", new Object[] { Integer.valueOf(this.gEN.size()), Integer.valueOf(this.gEO.size()) });
    while (this.gEN.size() > 30)
    {
      w.i(TAG, "force remove task");
      parama = (c)this.gEN.removeFirst();
      if (parama != null) {
        this.gEO.remove(parama.toString());
      }
    }
    Iq();
    GMTrace.o(489492054016L, 3647);
    return true;
  }
  
  public final boolean a(a parama)
  {
    GMTrace.i(489089400832L, 3644);
    Object localObject1 = new LinkedList();
    Object localObject2 = new LinkedList();
    Object localObject3 = this.gEO.keySet().iterator();
    while (((Iterator)localObject3).hasNext())
    {
      String str = (String)((Iterator)localObject3).next();
      LinkedList localLinkedList = (LinkedList)this.gEO.get(str);
      b(localLinkedList, parama);
      this.gEO.put(str, localLinkedList);
      if ((localLinkedList == null) || (localLinkedList.size() == 0)) {
        ((LinkedList)localObject2).add(str);
      }
    }
    parama = ((LinkedList)localObject2).iterator();
    while (parama.hasNext())
    {
      localObject2 = (String)parama.next();
      this.gEO.remove(localObject2);
    }
    parama = this.gEN.iterator();
    while (parama.hasNext())
    {
      localObject2 = (c)parama.next();
      localObject3 = (LinkedList)this.gEO.get(((c)localObject2).toString());
      if ((localObject3 == null) || (((LinkedList)localObject3).size() == 0))
      {
        ((LinkedList)localObject1).add(localObject2);
        this.gEO.remove(((c)localObject2).toString());
      }
    }
    parama = ((LinkedList)localObject1).iterator();
    while (parama.hasNext())
    {
      localObject1 = (c)parama.next();
      this.gEN.remove(localObject1);
    }
    w.i(TAG, "remove taskLists %d listeners size %d", new Object[] { Integer.valueOf(this.gEN.size()), Integer.valueOf(this.gEO.size()) });
    GMTrace.o(489089400832L, 3644);
    return true;
  }
  
  public static abstract interface a
  {
    public abstract void b(Addr paramAddr);
  }
  
  private final class b
    implements ar.a
  {
    private Addr gER;
    
    public b()
    {
      GMTrace.i(483183820800L, 3600);
      this.gER = null;
      GMTrace.o(483183820800L, 3600);
    }
    
    public final boolean Dj()
    {
      GMTrace.i(483318038528L, 3601);
      if (b.this.gEM == null)
      {
        GMTrace.o(483318038528L, 3601);
        return false;
      }
      if ((this.gER == null) || (this.gER.gEy == null) || (this.gER.gEy.equals(""))) {
        this.gER = b.a(b.this.gEM.lat, b.this.gEM.lng, b.this.gEQ);
      }
      GMTrace.o(483318038528L, 3601);
      return true;
    }
    
    public final boolean Dk()
    {
      GMTrace.i(483452256256L, 3602);
      b.this.gEQ = true;
      b.this.a(this.gER);
      GMTrace.o(483452256256L, 3602);
      return true;
    }
  }
  
  final class c
  {
    double lat;
    double lng;
    Object tag;
    
    public c(double paramDouble1, double paramDouble2, Object paramObject)
    {
      GMTrace.i(485331304448L, 3616);
      this.tag = "";
      this.lat = paramDouble1;
      this.lng = paramDouble2;
      this.tag = paramObject;
      GMTrace.o(485331304448L, 3616);
    }
    
    public final boolean equals(Object paramObject)
    {
      GMTrace.i(485599739904L, 3618);
      if ((paramObject == null) || (!(paramObject instanceof c)))
      {
        GMTrace.o(485599739904L, 3618);
        return false;
      }
      boolean bool = ((c)paramObject).toString().equals(toString());
      GMTrace.o(485599739904L, 3618);
      return bool;
    }
    
    public final String toString()
    {
      GMTrace.i(485465522176L, 3617);
      StringBuilder localStringBuilder = new StringBuilder().append((int)(this.lat * 1000000.0D)).append((int)(this.lng * 1000000.0D));
      String str;
      if (this.tag == null) {
        str = "";
      }
      for (;;)
      {
        str = str;
        GMTrace.o(485465522176L, 3617);
        return str;
        if (((this.tag instanceof Integer)) || ((this.tag instanceof Long)) || ((this.tag instanceof Double)) || ((this.tag instanceof Float)) || ((this.tag instanceof String))) {
          str = this.tag;
        } else {
          str = this.tag.toString();
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelgeo\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */