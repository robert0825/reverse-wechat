package com.tencent.mm.plugin.appbrand.h.a;

import com.tencent.gmtrace.GMTrace;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Map;
import javax.net.ssl.SSLContext;

public final class b
  implements Runnable
{
  public volatile boolean aDI;
  private String appId;
  private String filename;
  public String hXm;
  public SSLContext isJ;
  private final String isK;
  private final a itG;
  public Map<String, String> itH;
  public int itI;
  public volatile int itJ;
  private HttpURLConnection itK;
  public ArrayList<String> itf;
  private int itg;
  public String itj;
  private long startTime;
  private String uri;
  
  public b(String paramString1, String paramString2, String paramString3, String paramString4, a parama)
  {
    GMTrace.i(19901804707840L, 148280);
    this.itg = 15;
    this.aDI = false;
    this.itI = 60000;
    this.appId = paramString1;
    this.uri = paramString2;
    this.filename = paramString3;
    this.itG = parama;
    this.startTime = System.currentTimeMillis();
    this.isK = paramString4;
    GMTrace.o(19901804707840L, 148280);
  }
  
  private int YQ()
  {
    GMTrace.i(18360179884032L, 136794);
    int i = (int)(System.currentTimeMillis() - this.startTime);
    GMTrace.o(18360179884032L, 136794);
    return i;
  }
  
  public final void YX()
  {
    GMTrace.i(17694459953152L, 131834);
    this.aDI = false;
    if (this.itK != null) {
      this.itK.disconnect();
    }
    GMTrace.o(17694459953152L, 131834);
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: ldc2_w 110
    //   3: ldc 112
    //   5: invokestatic 49	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   12: invokestatic 118	android/webkit/URLUtil:isHttpsUrl	(Ljava/lang/String;)Z
    //   15: ifne +41 -> 56
    //   18: aload_0
    //   19: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   22: invokestatic 121	android/webkit/URLUtil:isHttpUrl	(Ljava/lang/String;)Z
    //   25: ifne +31 -> 56
    //   28: aload_0
    //   29: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   32: aload_0
    //   33: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   36: aload_0
    //   37: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   40: ldc 123
    //   42: invokeinterface 129 4 0
    //   47: ldc2_w 110
    //   50: ldc 112
    //   52: invokestatic 77	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   55: return
    //   56: aload_0
    //   57: getfield 131	com/tencent/mm/plugin/appbrand/h/a/b:itf	Ljava/util/ArrayList;
    //   60: ifnull +63 -> 123
    //   63: aload_0
    //   64: getfield 131	com/tencent/mm/plugin/appbrand/h/a/b:itf	Ljava/util/ArrayList;
    //   67: aload_0
    //   68: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   71: invokestatic 137	com/tencent/mm/plugin/appbrand/h/i:a	(Ljava/util/ArrayList;Ljava/lang/String;)Z
    //   74: ifne +49 -> 123
    //   77: aload_0
    //   78: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   81: aload_0
    //   82: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   85: aload_0
    //   86: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   89: ldc -117
    //   91: invokeinterface 129 4 0
    //   96: ldc -115
    //   98: ldc -113
    //   100: iconst_1
    //   101: anewarray 4	java/lang/Object
    //   104: dup
    //   105: iconst_0
    //   106: aload_0
    //   107: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   110: aastore
    //   111: invokestatic 148	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   114: ldc2_w 110
    //   117: ldc 112
    //   119: invokestatic 77	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   122: return
    //   123: iconst_0
    //   124: istore_3
    //   125: iconst_0
    //   126: istore 5
    //   128: iconst_0
    //   129: istore 6
    //   131: iconst_0
    //   132: istore 7
    //   134: iconst_0
    //   135: istore 4
    //   137: iconst_0
    //   138: istore_2
    //   139: iconst_0
    //   140: istore 8
    //   142: iconst_0
    //   143: istore 9
    //   145: iconst_0
    //   146: istore_1
    //   147: lconst_0
    //   148: lstore 11
    //   150: aload_0
    //   151: getfield 53	com/tencent/mm/plugin/appbrand/h/a/b:aDI	Z
    //   154: ifne +56 -> 210
    //   157: aload_0
    //   158: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   161: aload_0
    //   162: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   165: aload_0
    //   166: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   169: ldc -106
    //   171: invokeinterface 129 4 0
    //   176: aload_0
    //   177: getfield 58	com/tencent/mm/plugin/appbrand/h/a/b:appId	Ljava/lang/String;
    //   180: aload_0
    //   181: getfield 152	com/tencent/mm/plugin/appbrand/h/a/b:itj	Ljava/lang/String;
    //   184: ldc -102
    //   186: aload_0
    //   187: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   190: lconst_0
    //   191: lconst_0
    //   192: iconst_0
    //   193: iconst_2
    //   194: aload_0
    //   195: invokespecial 156	com/tencent/mm/plugin/appbrand/h/a/b:YQ	()I
    //   198: invokestatic 161	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   201: ldc2_w 110
    //   204: ldc 112
    //   206: invokestatic 77	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   209: return
    //   210: aload_0
    //   211: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   214: aload_0
    //   215: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   218: aload_0
    //   219: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   222: invokeinterface 165 3 0
    //   227: getstatic 171	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   230: ldc2_w 172
    //   233: lconst_0
    //   234: lconst_1
    //   235: iconst_0
    //   236: invokevirtual 176	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   239: new 178	java/net/URL
    //   242: dup
    //   243: aload_0
    //   244: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   247: invokespecial 181	java/net/URL:<init>	(Ljava/lang/String;)V
    //   250: astore 15
    //   252: ldc -115
    //   254: ldc -73
    //   256: iconst_2
    //   257: anewarray 4	java/lang/Object
    //   260: dup
    //   261: iconst_0
    //   262: aload_0
    //   263: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   266: aastore
    //   267: dup
    //   268: iconst_1
    //   269: aload_0
    //   270: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   273: aastore
    //   274: invokestatic 148	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   277: aload_0
    //   278: aload 15
    //   280: invokevirtual 187	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   283: checkcast 91	java/net/HttpURLConnection
    //   286: putfield 89	com/tencent/mm/plugin/appbrand/h/a/b:itK	Ljava/net/HttpURLConnection;
    //   289: aload_0
    //   290: getfield 89	com/tencent/mm/plugin/appbrand/h/a/b:itK	Ljava/net/HttpURLConnection;
    //   293: instanceof 189
    //   296: ifeq +38 -> 334
    //   299: aload_0
    //   300: getfield 191	com/tencent/mm/plugin/appbrand/h/a/b:isJ	Ljavax/net/ssl/SSLContext;
    //   303: ifnull +31 -> 334
    //   306: aload_0
    //   307: getfield 89	com/tencent/mm/plugin/appbrand/h/a/b:itK	Ljava/net/HttpURLConnection;
    //   310: checkcast 189	javax/net/ssl/HttpsURLConnection
    //   313: aload_0
    //   314: getfield 191	com/tencent/mm/plugin/appbrand/h/a/b:isJ	Ljavax/net/ssl/SSLContext;
    //   317: invokevirtual 197	javax/net/ssl/SSLContext:getSocketFactory	()Ljavax/net/ssl/SSLSocketFactory;
    //   320: invokevirtual 201	javax/net/ssl/HttpsURLConnection:setSSLSocketFactory	(Ljavax/net/ssl/SSLSocketFactory;)V
    //   323: aload_0
    //   324: getfield 89	com/tencent/mm/plugin/appbrand/h/a/b:itK	Ljava/net/HttpURLConnection;
    //   327: aload_0
    //   328: getfield 131	com/tencent/mm/plugin/appbrand/h/a/b:itf	Ljava/util/ArrayList;
    //   331: invokestatic 204	com/tencent/mm/plugin/appbrand/h/i:a	(Ljava/net/HttpURLConnection;Ljava/util/ArrayList;)V
    //   334: aload_0
    //   335: getfield 89	com/tencent/mm/plugin/appbrand/h/a/b:itK	Ljava/net/HttpURLConnection;
    //   338: iconst_1
    //   339: invokevirtual 208	java/net/HttpURLConnection:setDoInput	(Z)V
    //   342: aload_0
    //   343: getfield 89	com/tencent/mm/plugin/appbrand/h/a/b:itK	Ljava/net/HttpURLConnection;
    //   346: aload_0
    //   347: getfield 56	com/tencent/mm/plugin/appbrand/h/a/b:itI	I
    //   350: invokevirtual 212	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   353: aload_0
    //   354: getfield 89	com/tencent/mm/plugin/appbrand/h/a/b:itK	Ljava/net/HttpURLConnection;
    //   357: aload_0
    //   358: getfield 56	com/tencent/mm/plugin/appbrand/h/a/b:itI	I
    //   361: invokevirtual 215	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   364: aload_0
    //   365: getfield 89	com/tencent/mm/plugin/appbrand/h/a/b:itK	Ljava/net/HttpURLConnection;
    //   368: iconst_0
    //   369: invokevirtual 218	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   372: aload_0
    //   373: getfield 89	com/tencent/mm/plugin/appbrand/h/a/b:itK	Ljava/net/HttpURLConnection;
    //   376: ldc -36
    //   378: ldc -34
    //   380: invokevirtual 225	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   383: aload_0
    //   384: getfield 227	com/tencent/mm/plugin/appbrand/h/a/b:itH	Ljava/util/Map;
    //   387: ifnull +283 -> 670
    //   390: ldc -115
    //   392: ldc -27
    //   394: iconst_1
    //   395: anewarray 4	java/lang/Object
    //   398: dup
    //   399: iconst_0
    //   400: aload 15
    //   402: aastore
    //   403: invokestatic 148	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   406: aload_0
    //   407: getfield 227	com/tencent/mm/plugin/appbrand/h/a/b:itH	Ljava/util/Map;
    //   410: invokeinterface 235 1 0
    //   415: invokeinterface 241 1 0
    //   420: astore 16
    //   422: aload 16
    //   424: invokeinterface 247 1 0
    //   429: ifeq +241 -> 670
    //   432: aload 16
    //   434: invokeinterface 251 1 0
    //   439: checkcast 253	java/util/Map$Entry
    //   442: astore 17
    //   444: aload_0
    //   445: getfield 89	com/tencent/mm/plugin/appbrand/h/a/b:itK	Ljava/net/HttpURLConnection;
    //   448: aload 17
    //   450: invokeinterface 256 1 0
    //   455: checkcast 258	java/lang/String
    //   458: aload 17
    //   460: invokeinterface 261 1 0
    //   465: checkcast 258	java/lang/String
    //   468: invokevirtual 225	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   471: ldc -115
    //   473: ldc_w 263
    //   476: iconst_3
    //   477: anewarray 4	java/lang/Object
    //   480: dup
    //   481: iconst_0
    //   482: aload_0
    //   483: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   486: aastore
    //   487: dup
    //   488: iconst_1
    //   489: aload 17
    //   491: invokeinterface 256 1 0
    //   496: aastore
    //   497: dup
    //   498: iconst_2
    //   499: aload 17
    //   501: invokeinterface 261 1 0
    //   506: aastore
    //   507: invokestatic 148	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   510: goto -88 -> 422
    //   513: astore 17
    //   515: iconst_0
    //   516: istore_1
    //   517: lconst_0
    //   518: lstore 11
    //   520: aconst_null
    //   521: astore 15
    //   523: iconst_0
    //   524: istore_2
    //   525: aconst_null
    //   526: astore 16
    //   528: getstatic 171	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   531: ldc2_w 172
    //   534: lconst_1
    //   535: lconst_1
    //   536: iconst_0
    //   537: invokevirtual 176	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   540: ldc -115
    //   542: ldc_w 265
    //   545: iconst_3
    //   546: anewarray 4	java/lang/Object
    //   549: dup
    //   550: iconst_0
    //   551: aload_0
    //   552: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   555: aastore
    //   556: dup
    //   557: iconst_1
    //   558: aload_0
    //   559: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   562: aastore
    //   563: dup
    //   564: iconst_2
    //   565: aload 17
    //   567: invokevirtual 269	java/io/UnsupportedEncodingException:toString	()Ljava/lang/String;
    //   570: aastore
    //   571: invokestatic 272	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   574: aload_0
    //   575: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   578: aload_0
    //   579: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   582: aload_0
    //   583: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   586: ldc_w 274
    //   589: invokeinterface 129 4 0
    //   594: iload_1
    //   595: ifeq +1953 -> 2548
    //   598: aload_0
    //   599: getfield 58	com/tencent/mm/plugin/appbrand/h/a/b:appId	Ljava/lang/String;
    //   602: aload_0
    //   603: getfield 152	com/tencent/mm/plugin/appbrand/h/a/b:itj	Ljava/lang/String;
    //   606: ldc -102
    //   608: aload_0
    //   609: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   612: lconst_0
    //   613: lload 11
    //   615: iload_2
    //   616: iconst_1
    //   617: aload_0
    //   618: invokespecial 156	com/tencent/mm/plugin/appbrand/h/a/b:YQ	()I
    //   621: invokestatic 161	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   624: aload 16
    //   626: ifnull +8 -> 634
    //   629: aload 16
    //   631: invokevirtual 279	java/io/FileOutputStream:close	()V
    //   634: aload 15
    //   636: ifnull +8 -> 644
    //   639: aload 15
    //   641: invokevirtual 282	java/io/InputStream:close	()V
    //   644: aload_0
    //   645: invokevirtual 284	com/tencent/mm/plugin/appbrand/h/a/b:YX	()V
    //   648: aload_0
    //   649: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   652: aload_0
    //   653: getfield 286	com/tencent/mm/plugin/appbrand/h/a/b:hXm	Ljava/lang/String;
    //   656: invokeinterface 289 2 0
    //   661: ldc2_w 110
    //   664: ldc 112
    //   666: invokestatic 77	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   669: return
    //   670: aload_0
    //   671: getfield 89	com/tencent/mm/plugin/appbrand/h/a/b:itK	Ljava/net/HttpURLConnection;
    //   674: ldc_w 291
    //   677: invokestatic 297	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   680: aload_0
    //   681: getfield 74	com/tencent/mm/plugin/appbrand/h/a/b:isK	Ljava/lang/String;
    //   684: invokestatic 303	com/tencent/mm/pluginsdk/ui/tools/s:aZ	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   687: invokevirtual 225	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   690: aload_0
    //   691: getfield 89	com/tencent/mm/plugin/appbrand/h/a/b:itK	Ljava/net/HttpURLConnection;
    //   694: invokevirtual 306	java/net/HttpURLConnection:getContentLength	()I
    //   697: i2l
    //   698: lstore 13
    //   700: aload_0
    //   701: getfield 89	com/tencent/mm/plugin/appbrand/h/a/b:itK	Ljava/net/HttpURLConnection;
    //   704: ldc_w 308
    //   707: invokevirtual 312	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   710: astore 16
    //   712: aload 15
    //   714: invokevirtual 313	java/net/URL:toString	()Ljava/lang/String;
    //   717: astore 15
    //   719: aload 16
    //   721: invokestatic 319	com/tencent/mm/pluginsdk/ui/tools/s$a:PS	(Ljava/lang/String;)Lcom/tencent/mm/pluginsdk/ui/tools/s$a;
    //   724: astore 16
    //   726: aload 16
    //   728: ifnonnull +193 -> 921
    //   731: aload 15
    //   733: invokestatic 322	com/tencent/mm/pluginsdk/ui/tools/s:PQ	(Ljava/lang/String;)Ljava/lang/String;
    //   736: astore 18
    //   738: aload_0
    //   739: getfield 89	com/tencent/mm/plugin/appbrand/h/a/b:itK	Ljava/net/HttpURLConnection;
    //   742: invokevirtual 325	java/net/HttpURLConnection:getResponseCode	()I
    //   745: istore 10
    //   747: iload 10
    //   749: istore_1
    //   750: iload_1
    //   751: sipush 200
    //   754: if_icmpeq +304 -> 1058
    //   757: ldc -115
    //   759: ldc_w 327
    //   762: iconst_3
    //   763: anewarray 4	java/lang/Object
    //   766: dup
    //   767: iconst_0
    //   768: iload_1
    //   769: invokestatic 333	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   772: aastore
    //   773: dup
    //   774: iconst_1
    //   775: aload_0
    //   776: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   779: aastore
    //   780: dup
    //   781: iconst_2
    //   782: aload_0
    //   783: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   786: aastore
    //   787: invokestatic 272	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   790: iload_1
    //   791: invokestatic 337	com/tencent/mm/plugin/appbrand/h/i:jd	(I)Z
    //   794: ifeq +264 -> 1058
    //   797: aload_0
    //   798: getfield 89	com/tencent/mm/plugin/appbrand/h/a/b:itK	Ljava/net/HttpURLConnection;
    //   801: invokestatic 341	com/tencent/mm/plugin/appbrand/h/i:c	(Ljava/net/HttpURLConnection;)Ljava/lang/String;
    //   804: astore 15
    //   806: aload 15
    //   808: invokestatic 347	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   811: ifne +247 -> 1058
    //   814: aload_0
    //   815: getfield 51	com/tencent/mm/plugin/appbrand/h/a/b:itg	I
    //   818: istore_2
    //   819: aload_0
    //   820: iload_2
    //   821: iconst_1
    //   822: isub
    //   823: putfield 51	com/tencent/mm/plugin/appbrand/h/a/b:itg	I
    //   826: iload_2
    //   827: ifgt +136 -> 963
    //   830: ldc -115
    //   832: ldc_w 349
    //   835: iconst_1
    //   836: anewarray 4	java/lang/Object
    //   839: dup
    //   840: iconst_0
    //   841: bipush 15
    //   843: invokestatic 333	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   846: aastore
    //   847: invokestatic 352	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   850: aload_0
    //   851: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   854: aload_0
    //   855: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   858: aload 18
    //   860: aload_0
    //   861: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   864: iload_1
    //   865: invokeinterface 355 5 0
    //   870: aload_0
    //   871: getfield 58	com/tencent/mm/plugin/appbrand/h/a/b:appId	Ljava/lang/String;
    //   874: aload_0
    //   875: getfield 152	com/tencent/mm/plugin/appbrand/h/a/b:itj	Ljava/lang/String;
    //   878: ldc -102
    //   880: aload_0
    //   881: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   884: lconst_0
    //   885: lconst_0
    //   886: iload_1
    //   887: iconst_1
    //   888: aload_0
    //   889: invokespecial 156	com/tencent/mm/plugin/appbrand/h/a/b:YQ	()I
    //   892: invokestatic 161	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   895: aload_0
    //   896: invokevirtual 284	com/tencent/mm/plugin/appbrand/h/a/b:YX	()V
    //   899: aload_0
    //   900: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   903: aload_0
    //   904: getfield 286	com/tencent/mm/plugin/appbrand/h/a/b:hXm	Ljava/lang/String;
    //   907: invokeinterface 289 2 0
    //   912: ldc2_w 110
    //   915: ldc 112
    //   917: invokestatic 77	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   920: return
    //   921: aload 16
    //   923: getfield 358	com/tencent/mm/pluginsdk/ui/tools/s$a:mimeType	Ljava/lang/String;
    //   926: ldc_w 360
    //   929: invokevirtual 363	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   932: ifeq +21 -> 953
    //   935: aload 15
    //   937: invokestatic 322	com/tencent/mm/pluginsdk/ui/tools/s:PQ	(Ljava/lang/String;)Ljava/lang/String;
    //   940: astore 18
    //   942: aload 18
    //   944: invokestatic 368	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   947: ifne +6 -> 953
    //   950: goto -212 -> 738
    //   953: aload 16
    //   955: getfield 358	com/tencent/mm/pluginsdk/ui/tools/s$a:mimeType	Ljava/lang/String;
    //   958: astore 18
    //   960: goto -222 -> 738
    //   963: ldc -115
    //   965: ldc_w 370
    //   968: iconst_3
    //   969: anewarray 4	java/lang/Object
    //   972: dup
    //   973: iconst_0
    //   974: aload_0
    //   975: getfield 51	com/tencent/mm/plugin/appbrand/h/a/b:itg	I
    //   978: invokestatic 333	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   981: aastore
    //   982: dup
    //   983: iconst_1
    //   984: aload_0
    //   985: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   988: aastore
    //   989: dup
    //   990: iconst_2
    //   991: aload 15
    //   993: aastore
    //   994: invokestatic 148	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   997: aload_0
    //   998: aload 15
    //   1000: putfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   1003: aload_0
    //   1004: invokevirtual 372	com/tencent/mm/plugin/appbrand/h/a/b:run	()V
    //   1007: aload_0
    //   1008: getfield 58	com/tencent/mm/plugin/appbrand/h/a/b:appId	Ljava/lang/String;
    //   1011: aload_0
    //   1012: getfield 152	com/tencent/mm/plugin/appbrand/h/a/b:itj	Ljava/lang/String;
    //   1015: ldc -102
    //   1017: aload_0
    //   1018: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   1021: lconst_0
    //   1022: lconst_0
    //   1023: iload_1
    //   1024: iconst_2
    //   1025: aload_0
    //   1026: invokespecial 156	com/tencent/mm/plugin/appbrand/h/a/b:YQ	()I
    //   1029: invokestatic 161	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   1032: aload_0
    //   1033: invokevirtual 284	com/tencent/mm/plugin/appbrand/h/a/b:YX	()V
    //   1036: aload_0
    //   1037: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   1040: aload_0
    //   1041: getfield 286	com/tencent/mm/plugin/appbrand/h/a/b:hXm	Ljava/lang/String;
    //   1044: invokeinterface 289 2 0
    //   1049: ldc2_w 110
    //   1052: ldc 112
    //   1054: invokestatic 77	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1057: return
    //   1058: aload_0
    //   1059: getfield 89	com/tencent/mm/plugin/appbrand/h/a/b:itK	Ljava/net/HttpURLConnection;
    //   1062: invokevirtual 306	java/net/HttpURLConnection:getContentLength	()I
    //   1065: istore_2
    //   1066: iload_2
    //   1067: ifle +112 -> 1179
    //   1070: aload_0
    //   1071: getfield 374	com/tencent/mm/plugin/appbrand/h/a/b:itJ	I
    //   1074: ifle +105 -> 1179
    //   1077: iload_2
    //   1078: aload_0
    //   1079: getfield 374	com/tencent/mm/plugin/appbrand/h/a/b:itJ	I
    //   1082: ldc_w 375
    //   1085: imul
    //   1086: if_icmplt +93 -> 1179
    //   1089: ldc -115
    //   1091: ldc_w 377
    //   1094: iconst_1
    //   1095: anewarray 4	java/lang/Object
    //   1098: dup
    //   1099: iconst_0
    //   1100: iload_2
    //   1101: invokestatic 333	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1104: aastore
    //   1105: invokestatic 148	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1108: aload_0
    //   1109: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   1112: aload_0
    //   1113: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   1116: aload_0
    //   1117: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   1120: ldc_w 379
    //   1123: invokeinterface 129 4 0
    //   1128: aload_0
    //   1129: getfield 58	com/tencent/mm/plugin/appbrand/h/a/b:appId	Ljava/lang/String;
    //   1132: aload_0
    //   1133: getfield 152	com/tencent/mm/plugin/appbrand/h/a/b:itj	Ljava/lang/String;
    //   1136: ldc -102
    //   1138: aload_0
    //   1139: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   1142: lconst_0
    //   1143: lconst_0
    //   1144: iload_1
    //   1145: iconst_2
    //   1146: aload_0
    //   1147: invokespecial 156	com/tencent/mm/plugin/appbrand/h/a/b:YQ	()I
    //   1150: invokestatic 161	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   1153: aload_0
    //   1154: invokevirtual 284	com/tencent/mm/plugin/appbrand/h/a/b:YX	()V
    //   1157: aload_0
    //   1158: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   1161: aload_0
    //   1162: getfield 286	com/tencent/mm/plugin/appbrand/h/a/b:hXm	Ljava/lang/String;
    //   1165: invokeinterface 289 2 0
    //   1170: ldc2_w 110
    //   1173: ldc 112
    //   1175: invokestatic 77	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1178: return
    //   1179: ldc -34
    //   1181: aload_0
    //   1182: getfield 89	com/tencent/mm/plugin/appbrand/h/a/b:itK	Ljava/net/HttpURLConnection;
    //   1185: invokevirtual 382	java/net/HttpURLConnection:getContentEncoding	()Ljava/lang/String;
    //   1188: invokevirtual 386	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1191: ifeq +167 -> 1358
    //   1194: new 388	java/util/zip/GZIPInputStream
    //   1197: dup
    //   1198: aload_0
    //   1199: getfield 89	com/tencent/mm/plugin/appbrand/h/a/b:itK	Ljava/net/HttpURLConnection;
    //   1202: invokevirtual 392	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   1205: invokespecial 395	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   1208: astore 15
    //   1210: new 397	java/io/File
    //   1213: dup
    //   1214: aload_0
    //   1215: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   1218: invokespecial 398	java/io/File:<init>	(Ljava/lang/String;)V
    //   1221: astore 16
    //   1223: aload 16
    //   1225: invokevirtual 401	java/io/File:exists	()Z
    //   1228: ifeq +316 -> 1544
    //   1231: ldc -115
    //   1233: ldc_w 403
    //   1236: iconst_1
    //   1237: anewarray 4	java/lang/Object
    //   1240: dup
    //   1241: iconst_0
    //   1242: aload_0
    //   1243: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   1246: aastore
    //   1247: invokestatic 148	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1250: aload 16
    //   1252: invokevirtual 406	java/io/File:delete	()Z
    //   1255: ifne +289 -> 1544
    //   1258: ldc -115
    //   1260: ldc_w 408
    //   1263: iconst_1
    //   1264: anewarray 4	java/lang/Object
    //   1267: dup
    //   1268: iconst_0
    //   1269: aload_0
    //   1270: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   1273: aastore
    //   1274: invokestatic 272	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1277: aload_0
    //   1278: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   1281: aload_0
    //   1282: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   1285: aload_0
    //   1286: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   1289: ldc_w 410
    //   1292: invokeinterface 129 4 0
    //   1297: aload_0
    //   1298: getfield 58	com/tencent/mm/plugin/appbrand/h/a/b:appId	Ljava/lang/String;
    //   1301: aload_0
    //   1302: getfield 152	com/tencent/mm/plugin/appbrand/h/a/b:itj	Ljava/lang/String;
    //   1305: ldc -102
    //   1307: aload_0
    //   1308: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   1311: lconst_0
    //   1312: lconst_0
    //   1313: iload_1
    //   1314: iconst_2
    //   1315: aload_0
    //   1316: invokespecial 156	com/tencent/mm/plugin/appbrand/h/a/b:YQ	()I
    //   1319: invokestatic 161	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   1322: aload 15
    //   1324: ifnull +8 -> 1332
    //   1327: aload 15
    //   1329: invokevirtual 282	java/io/InputStream:close	()V
    //   1332: aload_0
    //   1333: invokevirtual 284	com/tencent/mm/plugin/appbrand/h/a/b:YX	()V
    //   1336: aload_0
    //   1337: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   1340: aload_0
    //   1341: getfield 286	com/tencent/mm/plugin/appbrand/h/a/b:hXm	Ljava/lang/String;
    //   1344: invokeinterface 289 2 0
    //   1349: ldc2_w 110
    //   1352: ldc 112
    //   1354: invokestatic 77	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1357: return
    //   1358: ldc_w 412
    //   1361: aload_0
    //   1362: getfield 89	com/tencent/mm/plugin/appbrand/h/a/b:itK	Ljava/net/HttpURLConnection;
    //   1365: invokevirtual 382	java/net/HttpURLConnection:getContentEncoding	()Ljava/lang/String;
    //   1368: invokevirtual 386	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1371: ifeq +111 -> 1482
    //   1374: new 414	java/util/zip/InflaterInputStream
    //   1377: dup
    //   1378: aload_0
    //   1379: getfield 89	com/tencent/mm/plugin/appbrand/h/a/b:itK	Ljava/net/HttpURLConnection;
    //   1382: invokevirtual 392	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   1385: new 416	java/util/zip/Inflater
    //   1388: dup
    //   1389: iconst_1
    //   1390: invokespecial 418	java/util/zip/Inflater:<init>	(Z)V
    //   1393: invokespecial 421	java/util/zip/InflaterInputStream:<init>	(Ljava/io/InputStream;Ljava/util/zip/Inflater;)V
    //   1396: astore 15
    //   1398: goto -188 -> 1210
    //   1401: astore 15
    //   1403: ldc -115
    //   1405: ldc_w 423
    //   1408: iconst_1
    //   1409: anewarray 4	java/lang/Object
    //   1412: dup
    //   1413: iconst_0
    //   1414: aload 15
    //   1416: aastore
    //   1417: invokestatic 272	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1420: ldc -34
    //   1422: aload_0
    //   1423: getfield 89	com/tencent/mm/plugin/appbrand/h/a/b:itK	Ljava/net/HttpURLConnection;
    //   1426: invokevirtual 382	java/net/HttpURLConnection:getContentEncoding	()Ljava/lang/String;
    //   1429: invokevirtual 386	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1432: ifeq +62 -> 1494
    //   1435: new 388	java/util/zip/GZIPInputStream
    //   1438: dup
    //   1439: aload_0
    //   1440: getfield 89	com/tencent/mm/plugin/appbrand/h/a/b:itK	Ljava/net/HttpURLConnection;
    //   1443: invokevirtual 426	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   1446: invokespecial 395	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   1449: astore 15
    //   1451: goto -241 -> 1210
    //   1454: astore 15
    //   1456: ldc -115
    //   1458: ldc_w 428
    //   1461: iconst_1
    //   1462: anewarray 4	java/lang/Object
    //   1465: dup
    //   1466: iconst_0
    //   1467: aload 15
    //   1469: invokevirtual 429	java/lang/Exception:toString	()Ljava/lang/String;
    //   1472: aastore
    //   1473: invokestatic 272	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1476: aconst_null
    //   1477: astore 15
    //   1479: goto -269 -> 1210
    //   1482: aload_0
    //   1483: getfield 89	com/tencent/mm/plugin/appbrand/h/a/b:itK	Ljava/net/HttpURLConnection;
    //   1486: invokevirtual 392	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   1489: astore 15
    //   1491: goto -281 -> 1210
    //   1494: aload_0
    //   1495: getfield 89	com/tencent/mm/plugin/appbrand/h/a/b:itK	Ljava/net/HttpURLConnection;
    //   1498: invokevirtual 426	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   1501: astore 15
    //   1503: goto -293 -> 1210
    //   1506: astore 15
    //   1508: ldc -115
    //   1510: aload 15
    //   1512: ldc_w 431
    //   1515: iconst_0
    //   1516: anewarray 4	java/lang/Object
    //   1519: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1522: goto -190 -> 1332
    //   1525: astore 15
    //   1527: ldc -115
    //   1529: aload 15
    //   1531: ldc_w 431
    //   1534: iconst_0
    //   1535: anewarray 4	java/lang/Object
    //   1538: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1541: goto -209 -> 1332
    //   1544: aload 16
    //   1546: invokevirtual 439	java/io/File:getParentFile	()Ljava/io/File;
    //   1549: invokevirtual 401	java/io/File:exists	()Z
    //   1552: ifne +171 -> 1723
    //   1555: ldc -115
    //   1557: ldc_w 441
    //   1560: iconst_1
    //   1561: anewarray 4	java/lang/Object
    //   1564: dup
    //   1565: iconst_0
    //   1566: aload_0
    //   1567: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   1570: aastore
    //   1571: invokestatic 148	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1574: aload 16
    //   1576: invokevirtual 439	java/io/File:getParentFile	()Ljava/io/File;
    //   1579: invokevirtual 444	java/io/File:mkdirs	()Z
    //   1582: ifne +141 -> 1723
    //   1585: ldc -115
    //   1587: ldc_w 446
    //   1590: iconst_1
    //   1591: anewarray 4	java/lang/Object
    //   1594: dup
    //   1595: iconst_0
    //   1596: aload_0
    //   1597: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   1600: aastore
    //   1601: invokestatic 272	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1604: aload_0
    //   1605: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   1608: aload_0
    //   1609: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   1612: aload_0
    //   1613: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   1616: ldc_w 448
    //   1619: invokeinterface 129 4 0
    //   1624: aload_0
    //   1625: getfield 58	com/tencent/mm/plugin/appbrand/h/a/b:appId	Ljava/lang/String;
    //   1628: aload_0
    //   1629: getfield 152	com/tencent/mm/plugin/appbrand/h/a/b:itj	Ljava/lang/String;
    //   1632: ldc -102
    //   1634: aload_0
    //   1635: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   1638: lconst_0
    //   1639: lconst_0
    //   1640: iload_1
    //   1641: iconst_2
    //   1642: aload_0
    //   1643: invokespecial 156	com/tencent/mm/plugin/appbrand/h/a/b:YQ	()I
    //   1646: invokestatic 161	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   1649: aload 15
    //   1651: ifnull +8 -> 1659
    //   1654: aload 15
    //   1656: invokevirtual 282	java/io/InputStream:close	()V
    //   1659: aload_0
    //   1660: invokevirtual 284	com/tencent/mm/plugin/appbrand/h/a/b:YX	()V
    //   1663: aload_0
    //   1664: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   1667: aload_0
    //   1668: getfield 286	com/tencent/mm/plugin/appbrand/h/a/b:hXm	Ljava/lang/String;
    //   1671: invokeinterface 289 2 0
    //   1676: ldc2_w 110
    //   1679: ldc 112
    //   1681: invokestatic 77	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1684: return
    //   1685: astore 15
    //   1687: ldc -115
    //   1689: aload 15
    //   1691: ldc_w 431
    //   1694: iconst_0
    //   1695: anewarray 4	java/lang/Object
    //   1698: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1701: goto -42 -> 1659
    //   1704: astore 15
    //   1706: ldc -115
    //   1708: aload 15
    //   1710: ldc_w 431
    //   1713: iconst_0
    //   1714: anewarray 4	java/lang/Object
    //   1717: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1720: goto -61 -> 1659
    //   1723: aload 15
    //   1725: ifnull +2911 -> 4636
    //   1728: new 276	java/io/FileOutputStream
    //   1731: dup
    //   1732: aload 16
    //   1734: invokespecial 451	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   1737: astore 17
    //   1739: sipush 1024
    //   1742: newarray <illegal type>
    //   1744: astore 19
    //   1746: lconst_0
    //   1747: lstore 11
    //   1749: aload 15
    //   1751: aload 19
    //   1753: invokevirtual 455	java/io/InputStream:read	([B)I
    //   1756: istore 8
    //   1758: iload 8
    //   1760: iconst_m1
    //   1761: if_icmpeq +530 -> 2291
    //   1764: aload_0
    //   1765: getfield 53	com/tencent/mm/plugin/appbrand/h/a/b:aDI	Z
    //   1768: ifeq +523 -> 2291
    //   1771: aload_0
    //   1772: getfield 58	com/tencent/mm/plugin/appbrand/h/a/b:appId	Ljava/lang/String;
    //   1775: invokestatic 461	com/tencent/mm/plugin/appbrand/a:nI	(Ljava/lang/String;)Lcom/tencent/mm/plugin/appbrand/e;
    //   1778: astore 20
    //   1780: aload 20
    //   1782: ifnonnull +96 -> 1878
    //   1785: iconst_1
    //   1786: istore_2
    //   1787: iload_2
    //   1788: ifeq +199 -> 1987
    //   1791: aload_0
    //   1792: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   1795: aload_0
    //   1796: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   1799: aload_0
    //   1800: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   1803: ldc_w 463
    //   1806: invokeinterface 129 4 0
    //   1811: aload_0
    //   1812: getfield 58	com/tencent/mm/plugin/appbrand/h/a/b:appId	Ljava/lang/String;
    //   1815: aload_0
    //   1816: getfield 152	com/tencent/mm/plugin/appbrand/h/a/b:itj	Ljava/lang/String;
    //   1819: ldc -102
    //   1821: aload_0
    //   1822: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   1825: lconst_0
    //   1826: lload 11
    //   1828: iload_1
    //   1829: iconst_2
    //   1830: aload_0
    //   1831: invokespecial 156	com/tencent/mm/plugin/appbrand/h/a/b:YQ	()I
    //   1834: invokestatic 161	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   1837: aload 17
    //   1839: invokevirtual 279	java/io/FileOutputStream:close	()V
    //   1842: aload 15
    //   1844: ifnull +8 -> 1852
    //   1847: aload 15
    //   1849: invokevirtual 282	java/io/InputStream:close	()V
    //   1852: aload_0
    //   1853: invokevirtual 284	com/tencent/mm/plugin/appbrand/h/a/b:YX	()V
    //   1856: aload_0
    //   1857: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   1860: aload_0
    //   1861: getfield 286	com/tencent/mm/plugin/appbrand/h/a/b:hXm	Ljava/lang/String;
    //   1864: invokeinterface 289 2 0
    //   1869: ldc2_w 110
    //   1872: ldc 112
    //   1874: invokestatic 77	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1877: return
    //   1878: getstatic 467	com/tencent/mm/plugin/appbrand/h/a/b$1:hKS	[I
    //   1881: aload 20
    //   1883: getfield 473	com/tencent/mm/plugin/appbrand/e:hyU	Lcom/tencent/mm/plugin/appbrand/b/b;
    //   1886: getfield 479	com/tencent/mm/plugin/appbrand/b/b:hKO	Lcom/tencent/mm/plugin/appbrand/b/c;
    //   1889: invokevirtual 485	com/tencent/mm/plugin/appbrand/b/c:Tc	()Lcom/tencent/mm/plugin/appbrand/b/a;
    //   1892: invokevirtual 490	com/tencent/mm/plugin/appbrand/b/a:ordinal	()I
    //   1895: iaload
    //   1896: istore_2
    //   1897: iload_2
    //   1898: tableswitch	default:+22->1920, 1:+27->1925, 2:+27->1925
    //   1920: iconst_0
    //   1921: istore_2
    //   1922: goto -135 -> 1787
    //   1925: iconst_1
    //   1926: istore_2
    //   1927: goto -140 -> 1787
    //   1930: astore 16
    //   1932: ldc -115
    //   1934: aload 16
    //   1936: ldc_w 431
    //   1939: iconst_0
    //   1940: anewarray 4	java/lang/Object
    //   1943: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1946: goto -104 -> 1842
    //   1949: astore 15
    //   1951: ldc -115
    //   1953: aload 15
    //   1955: ldc_w 431
    //   1958: iconst_0
    //   1959: anewarray 4	java/lang/Object
    //   1962: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1965: goto -113 -> 1852
    //   1968: astore 15
    //   1970: ldc -115
    //   1972: aload 15
    //   1974: ldc_w 431
    //   1977: iconst_0
    //   1978: anewarray 4	java/lang/Object
    //   1981: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1984: goto -132 -> 1852
    //   1987: aload 17
    //   1989: aload 19
    //   1991: iconst_0
    //   1992: iload 8
    //   1994: invokevirtual 494	java/io/FileOutputStream:write	([BII)V
    //   1997: lload 11
    //   1999: iload 8
    //   2001: i2l
    //   2002: ladd
    //   2003: lstore 11
    //   2005: lload 13
    //   2007: lconst_0
    //   2008: lcmp
    //   2009: ifle +70 -> 2079
    //   2012: aload_0
    //   2013: getfield 53	com/tencent/mm/plugin/appbrand/h/a/b:aDI	Z
    //   2016: ifeq +63 -> 2079
    //   2019: ldc2_w 495
    //   2022: lload 11
    //   2024: lmul
    //   2025: lload 13
    //   2027: ldiv
    //   2028: l2i
    //   2029: istore_2
    //   2030: aload_0
    //   2031: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   2034: iload_2
    //   2035: lload 11
    //   2037: lload 13
    //   2039: invokeinterface 499 6 0
    //   2044: ldc -115
    //   2046: ldc_w 501
    //   2049: iconst_3
    //   2050: anewarray 4	java/lang/Object
    //   2053: dup
    //   2054: iconst_0
    //   2055: lload 11
    //   2057: invokestatic 506	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2060: aastore
    //   2061: dup
    //   2062: iconst_1
    //   2063: lload 13
    //   2065: invokestatic 506	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2068: aastore
    //   2069: dup
    //   2070: iconst_2
    //   2071: iload_2
    //   2072: invokestatic 333	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2075: aastore
    //   2076: invokestatic 509	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2079: lload 11
    //   2081: lconst_0
    //   2082: lcmp
    //   2083: ifle +2550 -> 4633
    //   2086: aload_0
    //   2087: getfield 374	com/tencent/mm/plugin/appbrand/h/a/b:itJ	I
    //   2090: ifle +2543 -> 4633
    //   2093: lload 11
    //   2095: aload_0
    //   2096: getfield 374	com/tencent/mm/plugin/appbrand/h/a/b:itJ	I
    //   2099: i2l
    //   2100: ldc2_w 510
    //   2103: lmul
    //   2104: lcmp
    //   2105: iflt +2528 -> 4633
    //   2108: ldc -115
    //   2110: ldc_w 513
    //   2113: iconst_1
    //   2114: anewarray 4	java/lang/Object
    //   2117: dup
    //   2118: iconst_0
    //   2119: lload 11
    //   2121: invokestatic 506	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2124: aastore
    //   2125: invokestatic 148	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2128: aload_0
    //   2129: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   2132: aload_0
    //   2133: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   2136: aload_0
    //   2137: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   2140: ldc_w 379
    //   2143: invokeinterface 129 4 0
    //   2148: aload 17
    //   2150: invokestatic 517	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   2153: aload 15
    //   2155: invokestatic 517	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   2158: aload 16
    //   2160: invokevirtual 520	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   2163: invokestatic 525	com/tencent/mm/loader/stub/b:deleteFile	(Ljava/lang/String;)Z
    //   2166: pop
    //   2167: aload_0
    //   2168: getfield 58	com/tencent/mm/plugin/appbrand/h/a/b:appId	Ljava/lang/String;
    //   2171: aload_0
    //   2172: getfield 152	com/tencent/mm/plugin/appbrand/h/a/b:itj	Ljava/lang/String;
    //   2175: ldc -102
    //   2177: aload_0
    //   2178: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   2181: lconst_0
    //   2182: lload 11
    //   2184: iload_1
    //   2185: iconst_2
    //   2186: aload_0
    //   2187: invokespecial 156	com/tencent/mm/plugin/appbrand/h/a/b:YQ	()I
    //   2190: invokestatic 161	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   2193: aload 17
    //   2195: invokevirtual 279	java/io/FileOutputStream:close	()V
    //   2198: aload 15
    //   2200: ifnull +8 -> 2208
    //   2203: aload 15
    //   2205: invokevirtual 282	java/io/InputStream:close	()V
    //   2208: aload_0
    //   2209: invokevirtual 284	com/tencent/mm/plugin/appbrand/h/a/b:YX	()V
    //   2212: aload_0
    //   2213: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   2216: aload_0
    //   2217: getfield 286	com/tencent/mm/plugin/appbrand/h/a/b:hXm	Ljava/lang/String;
    //   2220: invokeinterface 289 2 0
    //   2225: ldc2_w 110
    //   2228: ldc 112
    //   2230: invokestatic 77	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   2233: return
    //   2234: astore 16
    //   2236: ldc -115
    //   2238: aload 16
    //   2240: ldc_w 431
    //   2243: iconst_0
    //   2244: anewarray 4	java/lang/Object
    //   2247: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2250: goto -52 -> 2198
    //   2253: astore 15
    //   2255: ldc -115
    //   2257: aload 15
    //   2259: ldc_w 431
    //   2262: iconst_0
    //   2263: anewarray 4	java/lang/Object
    //   2266: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2269: goto -61 -> 2208
    //   2272: astore 15
    //   2274: ldc -115
    //   2276: aload 15
    //   2278: ldc_w 431
    //   2281: iconst_0
    //   2282: anewarray 4	java/lang/Object
    //   2285: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2288: goto -80 -> 2208
    //   2291: aload 17
    //   2293: invokevirtual 528	java/io/FileOutputStream:flush	()V
    //   2296: aload 17
    //   2298: astore 16
    //   2300: aload_0
    //   2301: getfield 53	com/tencent/mm/plugin/appbrand/h/a/b:aDI	Z
    //   2304: ifeq +134 -> 2438
    //   2307: aload_0
    //   2308: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   2311: aload_0
    //   2312: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   2315: aload 18
    //   2317: aload_0
    //   2318: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   2321: iload_1
    //   2322: invokeinterface 355 5 0
    //   2327: iconst_1
    //   2328: istore_2
    //   2329: ldc -115
    //   2331: ldc_w 530
    //   2334: iconst_2
    //   2335: anewarray 4	java/lang/Object
    //   2338: dup
    //   2339: iconst_0
    //   2340: aload_0
    //   2341: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   2344: aastore
    //   2345: dup
    //   2346: iconst_1
    //   2347: aload_0
    //   2348: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   2351: aastore
    //   2352: invokestatic 509	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2355: aload_0
    //   2356: getfield 89	com/tencent/mm/plugin/appbrand/h/a/b:itK	Ljava/net/HttpURLConnection;
    //   2359: invokevirtual 94	java/net/HttpURLConnection:disconnect	()V
    //   2362: iload_2
    //   2363: ifeq +99 -> 2462
    //   2366: aload_0
    //   2367: getfield 58	com/tencent/mm/plugin/appbrand/h/a/b:appId	Ljava/lang/String;
    //   2370: aload_0
    //   2371: getfield 152	com/tencent/mm/plugin/appbrand/h/a/b:itj	Ljava/lang/String;
    //   2374: ldc -102
    //   2376: aload_0
    //   2377: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   2380: lconst_0
    //   2381: lload 11
    //   2383: iload_1
    //   2384: iconst_1
    //   2385: aload_0
    //   2386: invokespecial 156	com/tencent/mm/plugin/appbrand/h/a/b:YQ	()I
    //   2389: invokestatic 161	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   2392: aload 16
    //   2394: ifnull +8 -> 2402
    //   2397: aload 16
    //   2399: invokevirtual 279	java/io/FileOutputStream:close	()V
    //   2402: aload 15
    //   2404: ifnull +8 -> 2412
    //   2407: aload 15
    //   2409: invokevirtual 282	java/io/InputStream:close	()V
    //   2412: aload_0
    //   2413: invokevirtual 284	com/tencent/mm/plugin/appbrand/h/a/b:YX	()V
    //   2416: aload_0
    //   2417: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   2420: aload_0
    //   2421: getfield 286	com/tencent/mm/plugin/appbrand/h/a/b:hXm	Ljava/lang/String;
    //   2424: invokeinterface 289 2 0
    //   2429: ldc2_w 110
    //   2432: ldc 112
    //   2434: invokestatic 77	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   2437: return
    //   2438: aload_0
    //   2439: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   2442: aload_0
    //   2443: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   2446: aload_0
    //   2447: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   2450: ldc -106
    //   2452: invokeinterface 129 4 0
    //   2457: iconst_0
    //   2458: istore_2
    //   2459: goto -130 -> 2329
    //   2462: aload_0
    //   2463: getfield 58	com/tencent/mm/plugin/appbrand/h/a/b:appId	Ljava/lang/String;
    //   2466: aload_0
    //   2467: getfield 152	com/tencent/mm/plugin/appbrand/h/a/b:itj	Ljava/lang/String;
    //   2470: ldc -102
    //   2472: aload_0
    //   2473: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   2476: lconst_0
    //   2477: lload 11
    //   2479: iload_1
    //   2480: iconst_2
    //   2481: aload_0
    //   2482: invokespecial 156	com/tencent/mm/plugin/appbrand/h/a/b:YQ	()I
    //   2485: invokestatic 161	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   2488: goto -96 -> 2392
    //   2491: astore 16
    //   2493: ldc -115
    //   2495: aload 16
    //   2497: ldc_w 431
    //   2500: iconst_0
    //   2501: anewarray 4	java/lang/Object
    //   2504: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2507: goto -105 -> 2402
    //   2510: astore 15
    //   2512: ldc -115
    //   2514: aload 15
    //   2516: ldc_w 431
    //   2519: iconst_0
    //   2520: anewarray 4	java/lang/Object
    //   2523: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2526: goto -114 -> 2412
    //   2529: astore 15
    //   2531: ldc -115
    //   2533: aload 15
    //   2535: ldc_w 431
    //   2538: iconst_0
    //   2539: anewarray 4	java/lang/Object
    //   2542: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2545: goto -133 -> 2412
    //   2548: aload_0
    //   2549: getfield 58	com/tencent/mm/plugin/appbrand/h/a/b:appId	Ljava/lang/String;
    //   2552: aload_0
    //   2553: getfield 152	com/tencent/mm/plugin/appbrand/h/a/b:itj	Ljava/lang/String;
    //   2556: ldc -102
    //   2558: aload_0
    //   2559: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   2562: lconst_0
    //   2563: lload 11
    //   2565: iload_2
    //   2566: iconst_2
    //   2567: aload_0
    //   2568: invokespecial 156	com/tencent/mm/plugin/appbrand/h/a/b:YQ	()I
    //   2571: invokestatic 161	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   2574: goto -1950 -> 624
    //   2577: astore 16
    //   2579: ldc -115
    //   2581: aload 16
    //   2583: ldc_w 431
    //   2586: iconst_0
    //   2587: anewarray 4	java/lang/Object
    //   2590: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2593: goto -1959 -> 634
    //   2596: astore 15
    //   2598: ldc -115
    //   2600: aload 15
    //   2602: ldc_w 431
    //   2605: iconst_0
    //   2606: anewarray 4	java/lang/Object
    //   2609: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2612: goto -1968 -> 644
    //   2615: astore 15
    //   2617: ldc -115
    //   2619: aload 15
    //   2621: ldc_w 431
    //   2624: iconst_0
    //   2625: anewarray 4	java/lang/Object
    //   2628: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2631: goto -1987 -> 644
    //   2634: astore 16
    //   2636: aconst_null
    //   2637: astore 17
    //   2639: aconst_null
    //   2640: astore 19
    //   2642: iload_1
    //   2643: istore_3
    //   2644: lload 11
    //   2646: lstore 13
    //   2648: iload 4
    //   2650: istore_2
    //   2651: aload 17
    //   2653: astore 18
    //   2655: aload 19
    //   2657: astore 15
    //   2659: getstatic 171	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   2662: ldc2_w 172
    //   2665: ldc2_w 531
    //   2668: lconst_1
    //   2669: iconst_0
    //   2670: invokevirtual 176	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   2673: iload_1
    //   2674: istore_3
    //   2675: lload 11
    //   2677: lstore 13
    //   2679: iload 4
    //   2681: istore_2
    //   2682: aload 17
    //   2684: astore 18
    //   2686: aload 19
    //   2688: astore 15
    //   2690: ldc -115
    //   2692: ldc_w 265
    //   2695: iconst_3
    //   2696: anewarray 4	java/lang/Object
    //   2699: dup
    //   2700: iconst_0
    //   2701: aload_0
    //   2702: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   2705: aastore
    //   2706: dup
    //   2707: iconst_1
    //   2708: aload_0
    //   2709: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   2712: aastore
    //   2713: dup
    //   2714: iconst_2
    //   2715: aload 16
    //   2717: invokevirtual 533	java/io/FileNotFoundException:toString	()Ljava/lang/String;
    //   2720: aastore
    //   2721: invokestatic 272	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2724: iload_1
    //   2725: istore_3
    //   2726: lload 11
    //   2728: lstore 13
    //   2730: iload 4
    //   2732: istore_2
    //   2733: aload 17
    //   2735: astore 18
    //   2737: aload 19
    //   2739: astore 15
    //   2741: aload_0
    //   2742: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   2745: aload_0
    //   2746: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   2749: aload_0
    //   2750: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   2753: ldc_w 535
    //   2756: invokeinterface 129 4 0
    //   2761: iload 4
    //   2763: ifeq +75 -> 2838
    //   2766: aload_0
    //   2767: getfield 58	com/tencent/mm/plugin/appbrand/h/a/b:appId	Ljava/lang/String;
    //   2770: aload_0
    //   2771: getfield 152	com/tencent/mm/plugin/appbrand/h/a/b:itj	Ljava/lang/String;
    //   2774: ldc -102
    //   2776: aload_0
    //   2777: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   2780: lconst_0
    //   2781: lload 11
    //   2783: iload_1
    //   2784: iconst_1
    //   2785: aload_0
    //   2786: invokespecial 156	com/tencent/mm/plugin/appbrand/h/a/b:YQ	()I
    //   2789: invokestatic 161	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   2792: aload 17
    //   2794: ifnull +8 -> 2802
    //   2797: aload 17
    //   2799: invokevirtual 279	java/io/FileOutputStream:close	()V
    //   2802: aload 19
    //   2804: ifnull +8 -> 2812
    //   2807: aload 19
    //   2809: invokevirtual 282	java/io/InputStream:close	()V
    //   2812: aload_0
    //   2813: invokevirtual 284	com/tencent/mm/plugin/appbrand/h/a/b:YX	()V
    //   2816: aload_0
    //   2817: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   2820: aload_0
    //   2821: getfield 286	com/tencent/mm/plugin/appbrand/h/a/b:hXm	Ljava/lang/String;
    //   2824: invokeinterface 289 2 0
    //   2829: ldc2_w 110
    //   2832: ldc 112
    //   2834: invokestatic 77	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   2837: return
    //   2838: aload_0
    //   2839: getfield 58	com/tencent/mm/plugin/appbrand/h/a/b:appId	Ljava/lang/String;
    //   2842: aload_0
    //   2843: getfield 152	com/tencent/mm/plugin/appbrand/h/a/b:itj	Ljava/lang/String;
    //   2846: ldc -102
    //   2848: aload_0
    //   2849: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   2852: lconst_0
    //   2853: lload 11
    //   2855: iload_1
    //   2856: iconst_2
    //   2857: aload_0
    //   2858: invokespecial 156	com/tencent/mm/plugin/appbrand/h/a/b:YQ	()I
    //   2861: invokestatic 161	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   2864: goto -72 -> 2792
    //   2867: astore 15
    //   2869: ldc -115
    //   2871: aload 15
    //   2873: ldc_w 431
    //   2876: iconst_0
    //   2877: anewarray 4	java/lang/Object
    //   2880: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2883: goto -81 -> 2802
    //   2886: astore 15
    //   2888: ldc -115
    //   2890: aload 15
    //   2892: ldc_w 431
    //   2895: iconst_0
    //   2896: anewarray 4	java/lang/Object
    //   2899: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2902: goto -90 -> 2812
    //   2905: astore 15
    //   2907: ldc -115
    //   2909: aload 15
    //   2911: ldc_w 431
    //   2914: iconst_0
    //   2915: anewarray 4	java/lang/Object
    //   2918: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2921: goto -109 -> 2812
    //   2924: astore 16
    //   2926: aconst_null
    //   2927: astore 17
    //   2929: aconst_null
    //   2930: astore 19
    //   2932: iload_3
    //   2933: istore 4
    //   2935: iload_2
    //   2936: istore_1
    //   2937: iload_1
    //   2938: istore_3
    //   2939: lload 11
    //   2941: lstore 13
    //   2943: iload 4
    //   2945: istore_2
    //   2946: aload 17
    //   2948: astore 18
    //   2950: aload 19
    //   2952: astore 15
    //   2954: getstatic 171	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   2957: ldc2_w 172
    //   2960: ldc2_w 536
    //   2963: lconst_1
    //   2964: iconst_0
    //   2965: invokevirtual 176	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   2968: iload_1
    //   2969: istore_3
    //   2970: lload 11
    //   2972: lstore 13
    //   2974: iload 4
    //   2976: istore_2
    //   2977: aload 17
    //   2979: astore 18
    //   2981: aload 19
    //   2983: astore 15
    //   2985: ldc -115
    //   2987: ldc_w 265
    //   2990: iconst_3
    //   2991: anewarray 4	java/lang/Object
    //   2994: dup
    //   2995: iconst_0
    //   2996: aload_0
    //   2997: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   3000: aastore
    //   3001: dup
    //   3002: iconst_1
    //   3003: aload_0
    //   3004: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   3007: aastore
    //   3008: dup
    //   3009: iconst_2
    //   3010: aload 16
    //   3012: invokevirtual 538	javax/net/ssl/SSLHandshakeException:toString	()Ljava/lang/String;
    //   3015: aastore
    //   3016: invokestatic 272	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3019: iload_1
    //   3020: istore_3
    //   3021: lload 11
    //   3023: lstore 13
    //   3025: iload 4
    //   3027: istore_2
    //   3028: aload 17
    //   3030: astore 18
    //   3032: aload 19
    //   3034: astore 15
    //   3036: aload_0
    //   3037: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   3040: aload_0
    //   3041: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   3044: aload_0
    //   3045: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   3048: ldc_w 540
    //   3051: invokeinterface 129 4 0
    //   3056: iload 4
    //   3058: ifeq +75 -> 3133
    //   3061: aload_0
    //   3062: getfield 58	com/tencent/mm/plugin/appbrand/h/a/b:appId	Ljava/lang/String;
    //   3065: aload_0
    //   3066: getfield 152	com/tencent/mm/plugin/appbrand/h/a/b:itj	Ljava/lang/String;
    //   3069: ldc -102
    //   3071: aload_0
    //   3072: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   3075: lconst_0
    //   3076: lload 11
    //   3078: iload_1
    //   3079: iconst_1
    //   3080: aload_0
    //   3081: invokespecial 156	com/tencent/mm/plugin/appbrand/h/a/b:YQ	()I
    //   3084: invokestatic 161	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   3087: aload 17
    //   3089: ifnull +8 -> 3097
    //   3092: aload 17
    //   3094: invokevirtual 279	java/io/FileOutputStream:close	()V
    //   3097: aload 19
    //   3099: ifnull +8 -> 3107
    //   3102: aload 19
    //   3104: invokevirtual 282	java/io/InputStream:close	()V
    //   3107: aload_0
    //   3108: invokevirtual 284	com/tencent/mm/plugin/appbrand/h/a/b:YX	()V
    //   3111: aload_0
    //   3112: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   3115: aload_0
    //   3116: getfield 286	com/tencent/mm/plugin/appbrand/h/a/b:hXm	Ljava/lang/String;
    //   3119: invokeinterface 289 2 0
    //   3124: ldc2_w 110
    //   3127: ldc 112
    //   3129: invokestatic 77	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   3132: return
    //   3133: aload_0
    //   3134: getfield 58	com/tencent/mm/plugin/appbrand/h/a/b:appId	Ljava/lang/String;
    //   3137: aload_0
    //   3138: getfield 152	com/tencent/mm/plugin/appbrand/h/a/b:itj	Ljava/lang/String;
    //   3141: ldc -102
    //   3143: aload_0
    //   3144: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   3147: lconst_0
    //   3148: lload 11
    //   3150: iload_1
    //   3151: iconst_2
    //   3152: aload_0
    //   3153: invokespecial 156	com/tencent/mm/plugin/appbrand/h/a/b:YQ	()I
    //   3156: invokestatic 161	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   3159: goto -72 -> 3087
    //   3162: astore 15
    //   3164: ldc -115
    //   3166: aload 15
    //   3168: ldc_w 431
    //   3171: iconst_0
    //   3172: anewarray 4	java/lang/Object
    //   3175: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3178: goto -81 -> 3097
    //   3181: astore 15
    //   3183: ldc -115
    //   3185: aload 15
    //   3187: ldc_w 431
    //   3190: iconst_0
    //   3191: anewarray 4	java/lang/Object
    //   3194: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3197: goto -90 -> 3107
    //   3200: astore 15
    //   3202: ldc -115
    //   3204: aload 15
    //   3206: ldc_w 431
    //   3209: iconst_0
    //   3210: anewarray 4	java/lang/Object
    //   3213: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3216: goto -109 -> 3107
    //   3219: astore 16
    //   3221: aconst_null
    //   3222: astore 17
    //   3224: aconst_null
    //   3225: astore 19
    //   3227: iload 5
    //   3229: istore 4
    //   3231: iload 8
    //   3233: istore_1
    //   3234: iload_1
    //   3235: istore_3
    //   3236: lload 11
    //   3238: lstore 13
    //   3240: iload 4
    //   3242: istore_2
    //   3243: aload 17
    //   3245: astore 18
    //   3247: aload 19
    //   3249: astore 15
    //   3251: getstatic 171	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   3254: ldc2_w 172
    //   3257: ldc2_w 541
    //   3260: lconst_1
    //   3261: iconst_0
    //   3262: invokevirtual 176	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   3265: iload_1
    //   3266: istore_3
    //   3267: lload 11
    //   3269: lstore 13
    //   3271: iload 4
    //   3273: istore_2
    //   3274: aload 17
    //   3276: astore 18
    //   3278: aload 19
    //   3280: astore 15
    //   3282: ldc -115
    //   3284: ldc_w 265
    //   3287: iconst_3
    //   3288: anewarray 4	java/lang/Object
    //   3291: dup
    //   3292: iconst_0
    //   3293: aload_0
    //   3294: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   3297: aastore
    //   3298: dup
    //   3299: iconst_1
    //   3300: aload_0
    //   3301: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   3304: aastore
    //   3305: dup
    //   3306: iconst_2
    //   3307: aload 16
    //   3309: invokevirtual 543	java/net/SocketTimeoutException:toString	()Ljava/lang/String;
    //   3312: aastore
    //   3313: invokestatic 272	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3316: iload_1
    //   3317: istore_3
    //   3318: lload 11
    //   3320: lstore 13
    //   3322: iload 4
    //   3324: istore_2
    //   3325: aload 17
    //   3327: astore 18
    //   3329: aload 19
    //   3331: astore 15
    //   3333: aload_0
    //   3334: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   3337: aload_0
    //   3338: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   3341: aload_0
    //   3342: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   3345: ldc_w 545
    //   3348: invokeinterface 129 4 0
    //   3353: iload 4
    //   3355: ifeq +75 -> 3430
    //   3358: aload_0
    //   3359: getfield 58	com/tencent/mm/plugin/appbrand/h/a/b:appId	Ljava/lang/String;
    //   3362: aload_0
    //   3363: getfield 152	com/tencent/mm/plugin/appbrand/h/a/b:itj	Ljava/lang/String;
    //   3366: ldc -102
    //   3368: aload_0
    //   3369: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   3372: lconst_0
    //   3373: lload 11
    //   3375: iload_1
    //   3376: iconst_1
    //   3377: aload_0
    //   3378: invokespecial 156	com/tencent/mm/plugin/appbrand/h/a/b:YQ	()I
    //   3381: invokestatic 161	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   3384: aload 17
    //   3386: ifnull +8 -> 3394
    //   3389: aload 17
    //   3391: invokevirtual 279	java/io/FileOutputStream:close	()V
    //   3394: aload 19
    //   3396: ifnull +8 -> 3404
    //   3399: aload 19
    //   3401: invokevirtual 282	java/io/InputStream:close	()V
    //   3404: aload_0
    //   3405: invokevirtual 284	com/tencent/mm/plugin/appbrand/h/a/b:YX	()V
    //   3408: aload_0
    //   3409: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   3412: aload_0
    //   3413: getfield 286	com/tencent/mm/plugin/appbrand/h/a/b:hXm	Ljava/lang/String;
    //   3416: invokeinterface 289 2 0
    //   3421: ldc2_w 110
    //   3424: ldc 112
    //   3426: invokestatic 77	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   3429: return
    //   3430: aload_0
    //   3431: getfield 58	com/tencent/mm/plugin/appbrand/h/a/b:appId	Ljava/lang/String;
    //   3434: aload_0
    //   3435: getfield 152	com/tencent/mm/plugin/appbrand/h/a/b:itj	Ljava/lang/String;
    //   3438: ldc -102
    //   3440: aload_0
    //   3441: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   3444: lconst_0
    //   3445: lload 11
    //   3447: iload_1
    //   3448: iconst_2
    //   3449: aload_0
    //   3450: invokespecial 156	com/tencent/mm/plugin/appbrand/h/a/b:YQ	()I
    //   3453: invokestatic 161	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   3456: goto -72 -> 3384
    //   3459: astore 15
    //   3461: ldc -115
    //   3463: aload 15
    //   3465: ldc_w 431
    //   3468: iconst_0
    //   3469: anewarray 4	java/lang/Object
    //   3472: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3475: goto -81 -> 3394
    //   3478: astore 15
    //   3480: ldc -115
    //   3482: aload 15
    //   3484: ldc_w 431
    //   3487: iconst_0
    //   3488: anewarray 4	java/lang/Object
    //   3491: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3494: goto -90 -> 3404
    //   3497: astore 15
    //   3499: ldc -115
    //   3501: aload 15
    //   3503: ldc_w 431
    //   3506: iconst_0
    //   3507: anewarray 4	java/lang/Object
    //   3510: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3513: goto -109 -> 3404
    //   3516: astore 16
    //   3518: aconst_null
    //   3519: astore 17
    //   3521: aconst_null
    //   3522: astore 19
    //   3524: iload 6
    //   3526: istore 4
    //   3528: iload 9
    //   3530: istore_1
    //   3531: iload_1
    //   3532: istore_3
    //   3533: lload 11
    //   3535: lstore 13
    //   3537: iload 4
    //   3539: istore_2
    //   3540: aload 17
    //   3542: astore 18
    //   3544: aload 19
    //   3546: astore 15
    //   3548: getstatic 171	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   3551: ldc2_w 172
    //   3554: ldc2_w 546
    //   3557: lconst_1
    //   3558: iconst_0
    //   3559: invokevirtual 176	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   3562: iload_1
    //   3563: istore_3
    //   3564: lload 11
    //   3566: lstore 13
    //   3568: iload 4
    //   3570: istore_2
    //   3571: aload 17
    //   3573: astore 18
    //   3575: aload 19
    //   3577: astore 15
    //   3579: ldc -115
    //   3581: ldc_w 265
    //   3584: iconst_3
    //   3585: anewarray 4	java/lang/Object
    //   3588: dup
    //   3589: iconst_0
    //   3590: aload_0
    //   3591: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   3594: aastore
    //   3595: dup
    //   3596: iconst_1
    //   3597: aload_0
    //   3598: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   3601: aastore
    //   3602: dup
    //   3603: iconst_2
    //   3604: aload 16
    //   3606: invokevirtual 429	java/lang/Exception:toString	()Ljava/lang/String;
    //   3609: aastore
    //   3610: invokestatic 272	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3613: iload_1
    //   3614: istore_3
    //   3615: lload 11
    //   3617: lstore 13
    //   3619: iload 4
    //   3621: istore_2
    //   3622: aload 17
    //   3624: astore 18
    //   3626: aload 19
    //   3628: astore 15
    //   3630: aload_0
    //   3631: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   3634: aload_0
    //   3635: getfield 62	com/tencent/mm/plugin/appbrand/h/a/b:filename	Ljava/lang/String;
    //   3638: aload_0
    //   3639: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   3642: ldc_w 549
    //   3645: invokeinterface 129 4 0
    //   3650: iload 4
    //   3652: ifeq +75 -> 3727
    //   3655: aload_0
    //   3656: getfield 58	com/tencent/mm/plugin/appbrand/h/a/b:appId	Ljava/lang/String;
    //   3659: aload_0
    //   3660: getfield 152	com/tencent/mm/plugin/appbrand/h/a/b:itj	Ljava/lang/String;
    //   3663: ldc -102
    //   3665: aload_0
    //   3666: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   3669: lconst_0
    //   3670: lload 11
    //   3672: iload_1
    //   3673: iconst_1
    //   3674: aload_0
    //   3675: invokespecial 156	com/tencent/mm/plugin/appbrand/h/a/b:YQ	()I
    //   3678: invokestatic 161	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   3681: aload 17
    //   3683: ifnull +8 -> 3691
    //   3686: aload 17
    //   3688: invokevirtual 279	java/io/FileOutputStream:close	()V
    //   3691: aload 19
    //   3693: ifnull +8 -> 3701
    //   3696: aload 19
    //   3698: invokevirtual 282	java/io/InputStream:close	()V
    //   3701: aload_0
    //   3702: invokevirtual 284	com/tencent/mm/plugin/appbrand/h/a/b:YX	()V
    //   3705: aload_0
    //   3706: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   3709: aload_0
    //   3710: getfield 286	com/tencent/mm/plugin/appbrand/h/a/b:hXm	Ljava/lang/String;
    //   3713: invokeinterface 289 2 0
    //   3718: ldc2_w 110
    //   3721: ldc 112
    //   3723: invokestatic 77	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   3726: return
    //   3727: aload_0
    //   3728: getfield 58	com/tencent/mm/plugin/appbrand/h/a/b:appId	Ljava/lang/String;
    //   3731: aload_0
    //   3732: getfield 152	com/tencent/mm/plugin/appbrand/h/a/b:itj	Ljava/lang/String;
    //   3735: ldc -102
    //   3737: aload_0
    //   3738: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   3741: lconst_0
    //   3742: lload 11
    //   3744: iload_1
    //   3745: iconst_2
    //   3746: aload_0
    //   3747: invokespecial 156	com/tencent/mm/plugin/appbrand/h/a/b:YQ	()I
    //   3750: invokestatic 161	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   3753: goto -72 -> 3681
    //   3756: astore 15
    //   3758: ldc -115
    //   3760: aload 15
    //   3762: ldc_w 431
    //   3765: iconst_0
    //   3766: anewarray 4	java/lang/Object
    //   3769: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3772: goto -81 -> 3691
    //   3775: astore 15
    //   3777: ldc -115
    //   3779: aload 15
    //   3781: ldc_w 431
    //   3784: iconst_0
    //   3785: anewarray 4	java/lang/Object
    //   3788: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3791: goto -90 -> 3701
    //   3794: astore 15
    //   3796: ldc -115
    //   3798: aload 15
    //   3800: ldc_w 431
    //   3803: iconst_0
    //   3804: anewarray 4	java/lang/Object
    //   3807: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3810: goto -109 -> 3701
    //   3813: astore 16
    //   3815: aconst_null
    //   3816: astore 17
    //   3818: aconst_null
    //   3819: astore 15
    //   3821: lconst_0
    //   3822: lstore 11
    //   3824: iconst_0
    //   3825: istore_1
    //   3826: iload 7
    //   3828: istore_2
    //   3829: iload_2
    //   3830: ifeq +69 -> 3899
    //   3833: aload_0
    //   3834: getfield 58	com/tencent/mm/plugin/appbrand/h/a/b:appId	Ljava/lang/String;
    //   3837: aload_0
    //   3838: getfield 152	com/tencent/mm/plugin/appbrand/h/a/b:itj	Ljava/lang/String;
    //   3841: ldc -102
    //   3843: aload_0
    //   3844: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   3847: lconst_0
    //   3848: lload 11
    //   3850: iload_1
    //   3851: iconst_1
    //   3852: aload_0
    //   3853: invokespecial 156	com/tencent/mm/plugin/appbrand/h/a/b:YQ	()I
    //   3856: invokestatic 161	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   3859: aload 17
    //   3861: ifnull +8 -> 3869
    //   3864: aload 17
    //   3866: invokevirtual 279	java/io/FileOutputStream:close	()V
    //   3869: aload 15
    //   3871: ifnull +8 -> 3879
    //   3874: aload 15
    //   3876: invokevirtual 282	java/io/InputStream:close	()V
    //   3879: aload_0
    //   3880: invokevirtual 284	com/tencent/mm/plugin/appbrand/h/a/b:YX	()V
    //   3883: aload_0
    //   3884: getfield 64	com/tencent/mm/plugin/appbrand/h/a/b:itG	Lcom/tencent/mm/plugin/appbrand/h/a/a;
    //   3887: aload_0
    //   3888: getfield 286	com/tencent/mm/plugin/appbrand/h/a/b:hXm	Ljava/lang/String;
    //   3891: invokeinterface 289 2 0
    //   3896: aload 16
    //   3898: athrow
    //   3899: aload_0
    //   3900: getfield 58	com/tencent/mm/plugin/appbrand/h/a/b:appId	Ljava/lang/String;
    //   3903: aload_0
    //   3904: getfield 152	com/tencent/mm/plugin/appbrand/h/a/b:itj	Ljava/lang/String;
    //   3907: ldc -102
    //   3909: aload_0
    //   3910: getfield 60	com/tencent/mm/plugin/appbrand/h/a/b:uri	Ljava/lang/String;
    //   3913: lconst_0
    //   3914: lload 11
    //   3916: iload_1
    //   3917: iconst_2
    //   3918: aload_0
    //   3919: invokespecial 156	com/tencent/mm/plugin/appbrand/h/a/b:YQ	()I
    //   3922: invokestatic 161	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   3925: goto -66 -> 3859
    //   3928: astore 17
    //   3930: ldc -115
    //   3932: aload 17
    //   3934: ldc_w 431
    //   3937: iconst_0
    //   3938: anewarray 4	java/lang/Object
    //   3941: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3944: goto -75 -> 3869
    //   3947: astore 15
    //   3949: ldc -115
    //   3951: aload 15
    //   3953: ldc_w 431
    //   3956: iconst_0
    //   3957: anewarray 4	java/lang/Object
    //   3960: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3963: goto -84 -> 3879
    //   3966: astore 15
    //   3968: ldc -115
    //   3970: aload 15
    //   3972: ldc_w 431
    //   3975: iconst_0
    //   3976: anewarray 4	java/lang/Object
    //   3979: invokestatic 435	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3982: goto -103 -> 3879
    //   3985: astore 16
    //   3987: aconst_null
    //   3988: astore 17
    //   3990: aconst_null
    //   3991: astore 15
    //   3993: lconst_0
    //   3994: lstore 11
    //   3996: iload 7
    //   3998: istore_2
    //   3999: goto -170 -> 3829
    //   4002: astore 16
    //   4004: aconst_null
    //   4005: astore 17
    //   4007: lconst_0
    //   4008: lstore 11
    //   4010: iload 7
    //   4012: istore_2
    //   4013: goto -184 -> 3829
    //   4016: astore 16
    //   4018: lconst_0
    //   4019: lstore 11
    //   4021: iload 7
    //   4023: istore_2
    //   4024: goto -195 -> 3829
    //   4027: astore 16
    //   4029: iload 7
    //   4031: istore_2
    //   4032: goto -203 -> 3829
    //   4035: astore 16
    //   4037: iload 7
    //   4039: istore_2
    //   4040: goto -211 -> 3829
    //   4043: astore 18
    //   4045: aload 16
    //   4047: astore 17
    //   4049: aload 18
    //   4051: astore 16
    //   4053: iload 7
    //   4055: istore_2
    //   4056: goto -227 -> 3829
    //   4059: astore 18
    //   4061: aload 16
    //   4063: astore 17
    //   4065: aload 18
    //   4067: astore 16
    //   4069: goto -240 -> 3829
    //   4072: astore 18
    //   4074: aload 16
    //   4076: astore 17
    //   4078: aload 18
    //   4080: astore 16
    //   4082: iload_1
    //   4083: istore_3
    //   4084: iload_2
    //   4085: istore_1
    //   4086: iload_3
    //   4087: istore_2
    //   4088: goto -259 -> 3829
    //   4091: astore 16
    //   4093: lload 13
    //   4095: lstore 11
    //   4097: iload_3
    //   4098: istore_1
    //   4099: aload 18
    //   4101: astore 17
    //   4103: goto -274 -> 3829
    //   4106: astore 16
    //   4108: aconst_null
    //   4109: astore 17
    //   4111: aconst_null
    //   4112: astore 19
    //   4114: iload 6
    //   4116: istore 4
    //   4118: goto -587 -> 3531
    //   4121: astore 16
    //   4123: aconst_null
    //   4124: astore 17
    //   4126: iload 6
    //   4128: istore 4
    //   4130: aload 15
    //   4132: astore 19
    //   4134: goto -603 -> 3531
    //   4137: astore 16
    //   4139: iload 6
    //   4141: istore 4
    //   4143: aload 15
    //   4145: astore 19
    //   4147: goto -616 -> 3531
    //   4150: astore 16
    //   4152: iload 6
    //   4154: istore 4
    //   4156: aload 15
    //   4158: astore 19
    //   4160: goto -629 -> 3531
    //   4163: astore 16
    //   4165: iload 6
    //   4167: istore 4
    //   4169: aload 15
    //   4171: astore 19
    //   4173: goto -642 -> 3531
    //   4176: astore 18
    //   4178: aload 16
    //   4180: astore 17
    //   4182: aload 18
    //   4184: astore 16
    //   4186: iload 6
    //   4188: istore 4
    //   4190: aload 15
    //   4192: astore 19
    //   4194: goto -663 -> 3531
    //   4197: astore 18
    //   4199: aload 16
    //   4201: astore 17
    //   4203: aload 18
    //   4205: astore 16
    //   4207: iload_2
    //   4208: istore 4
    //   4210: aload 15
    //   4212: astore 19
    //   4214: goto -683 -> 3531
    //   4217: astore 16
    //   4219: aconst_null
    //   4220: astore 17
    //   4222: aconst_null
    //   4223: astore 19
    //   4225: iload 5
    //   4227: istore 4
    //   4229: goto -995 -> 3234
    //   4232: astore 16
    //   4234: aconst_null
    //   4235: astore 17
    //   4237: iload 5
    //   4239: istore 4
    //   4241: aload 15
    //   4243: astore 19
    //   4245: goto -1011 -> 3234
    //   4248: astore 16
    //   4250: iload 5
    //   4252: istore 4
    //   4254: aload 15
    //   4256: astore 19
    //   4258: goto -1024 -> 3234
    //   4261: astore 16
    //   4263: iload 5
    //   4265: istore 4
    //   4267: aload 15
    //   4269: astore 19
    //   4271: goto -1037 -> 3234
    //   4274: astore 16
    //   4276: iload 5
    //   4278: istore 4
    //   4280: aload 15
    //   4282: astore 19
    //   4284: goto -1050 -> 3234
    //   4287: astore 18
    //   4289: aload 16
    //   4291: astore 17
    //   4293: aload 18
    //   4295: astore 16
    //   4297: iload 5
    //   4299: istore 4
    //   4301: aload 15
    //   4303: astore 19
    //   4305: goto -1071 -> 3234
    //   4308: astore 18
    //   4310: aload 16
    //   4312: astore 17
    //   4314: aload 18
    //   4316: astore 16
    //   4318: iload_2
    //   4319: istore 4
    //   4321: aload 15
    //   4323: astore 19
    //   4325: goto -1091 -> 3234
    //   4328: astore 16
    //   4330: aconst_null
    //   4331: astore 17
    //   4333: aconst_null
    //   4334: astore 19
    //   4336: iload_3
    //   4337: istore 4
    //   4339: goto -1402 -> 2937
    //   4342: astore 16
    //   4344: aconst_null
    //   4345: astore 17
    //   4347: iload_3
    //   4348: istore 4
    //   4350: aload 15
    //   4352: astore 19
    //   4354: goto -1417 -> 2937
    //   4357: astore 16
    //   4359: iload_3
    //   4360: istore 4
    //   4362: aload 15
    //   4364: astore 19
    //   4366: goto -1429 -> 2937
    //   4369: astore 16
    //   4371: iload_3
    //   4372: istore 4
    //   4374: aload 15
    //   4376: astore 19
    //   4378: goto -1441 -> 2937
    //   4381: astore 16
    //   4383: iload_3
    //   4384: istore 4
    //   4386: aload 15
    //   4388: astore 19
    //   4390: goto -1453 -> 2937
    //   4393: astore 18
    //   4395: aload 16
    //   4397: astore 17
    //   4399: aload 18
    //   4401: astore 16
    //   4403: iload_3
    //   4404: istore 4
    //   4406: aload 15
    //   4408: astore 19
    //   4410: goto -1473 -> 2937
    //   4413: astore 18
    //   4415: aload 16
    //   4417: astore 17
    //   4419: aload 18
    //   4421: astore 16
    //   4423: iload_2
    //   4424: istore 4
    //   4426: aload 15
    //   4428: astore 19
    //   4430: goto -1493 -> 2937
    //   4433: astore 16
    //   4435: aconst_null
    //   4436: astore 17
    //   4438: aconst_null
    //   4439: astore 19
    //   4441: goto -1799 -> 2642
    //   4444: astore 16
    //   4446: aconst_null
    //   4447: astore 17
    //   4449: aload 15
    //   4451: astore 19
    //   4453: goto -1811 -> 2642
    //   4456: astore 16
    //   4458: aload 15
    //   4460: astore 19
    //   4462: goto -1820 -> 2642
    //   4465: astore 16
    //   4467: aload 15
    //   4469: astore 19
    //   4471: goto -1829 -> 2642
    //   4474: astore 16
    //   4476: aload 15
    //   4478: astore 19
    //   4480: goto -1838 -> 2642
    //   4483: astore 18
    //   4485: aload 16
    //   4487: astore 17
    //   4489: aload 18
    //   4491: astore 16
    //   4493: aload 15
    //   4495: astore 19
    //   4497: goto -1855 -> 2642
    //   4500: astore 18
    //   4502: aload 16
    //   4504: astore 17
    //   4506: aload 18
    //   4508: astore 16
    //   4510: iload_2
    //   4511: istore 4
    //   4513: aload 15
    //   4515: astore 19
    //   4517: goto -1875 -> 2642
    //   4520: astore 17
    //   4522: aconst_null
    //   4523: astore 16
    //   4525: iconst_0
    //   4526: istore_3
    //   4527: lconst_0
    //   4528: lstore 11
    //   4530: iload_1
    //   4531: istore_2
    //   4532: aconst_null
    //   4533: astore 15
    //   4535: iload_3
    //   4536: istore_1
    //   4537: goto -4009 -> 528
    //   4540: astore 17
    //   4542: aconst_null
    //   4543: astore 16
    //   4545: iconst_0
    //   4546: istore_3
    //   4547: lconst_0
    //   4548: lstore 11
    //   4550: iload_1
    //   4551: istore_2
    //   4552: iload_3
    //   4553: istore_1
    //   4554: goto -4026 -> 528
    //   4557: astore 18
    //   4559: aload 17
    //   4561: astore 16
    //   4563: iconst_0
    //   4564: istore_3
    //   4565: lconst_0
    //   4566: lstore 11
    //   4568: iload_1
    //   4569: istore_2
    //   4570: aload 18
    //   4572: astore 17
    //   4574: iload_3
    //   4575: istore_1
    //   4576: goto -4048 -> 528
    //   4579: astore 18
    //   4581: aload 17
    //   4583: astore 16
    //   4585: iload_1
    //   4586: istore_2
    //   4587: iconst_0
    //   4588: istore_1
    //   4589: aload 18
    //   4591: astore 17
    //   4593: goto -4065 -> 528
    //   4596: astore 18
    //   4598: aload 17
    //   4600: astore 16
    //   4602: iload_1
    //   4603: istore_2
    //   4604: iconst_0
    //   4605: istore_1
    //   4606: aload 18
    //   4608: astore 17
    //   4610: goto -4082 -> 528
    //   4613: astore 17
    //   4615: iload_1
    //   4616: istore_2
    //   4617: iconst_0
    //   4618: istore_1
    //   4619: goto -4091 -> 528
    //   4622: astore 17
    //   4624: iload_1
    //   4625: istore_3
    //   4626: iload_2
    //   4627: istore_1
    //   4628: iload_3
    //   4629: istore_2
    //   4630: goto -4102 -> 528
    //   4633: goto -2884 -> 1749
    //   4636: aconst_null
    //   4637: astore 16
    //   4639: lconst_0
    //   4640: lstore 11
    //   4642: goto -2342 -> 2300
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	4645	0	this	b
    //   146	4482	1	i	int
    //   138	4492	2	j	int
    //   124	4505	3	k	int
    //   135	4377	4	m	int
    //   126	4172	5	n	int
    //   129	4058	6	i1	int
    //   132	3922	7	i2	int
    //   140	3092	8	i3	int
    //   143	3386	9	i4	int
    //   745	3	10	i5	int
    //   148	4493	11	l1	long
    //   698	3396	13	l2	long
    //   250	1147	15	localObject1	Object
    //   1401	14	15	localException1	Exception
    //   1449	1	15	localGZIPInputStream	java.util.zip.GZIPInputStream
    //   1454	14	15	localException2	Exception
    //   1477	25	15	localInputStream	java.io.InputStream
    //   1506	5	15	localIOException1	java.io.IOException
    //   1525	130	15	localArrayIndexOutOfBoundsException1	ArrayIndexOutOfBoundsException
    //   1685	5	15	localIOException2	java.io.IOException
    //   1704	144	15	localArrayIndexOutOfBoundsException2	ArrayIndexOutOfBoundsException
    //   1949	5	15	localIOException3	java.io.IOException
    //   1968	236	15	localArrayIndexOutOfBoundsException3	ArrayIndexOutOfBoundsException
    //   2253	5	15	localIOException4	java.io.IOException
    //   2272	136	15	localArrayIndexOutOfBoundsException4	ArrayIndexOutOfBoundsException
    //   2510	5	15	localIOException5	java.io.IOException
    //   2529	5	15	localArrayIndexOutOfBoundsException5	ArrayIndexOutOfBoundsException
    //   2596	5	15	localIOException6	java.io.IOException
    //   2615	5	15	localArrayIndexOutOfBoundsException6	ArrayIndexOutOfBoundsException
    //   2657	83	15	localObject2	Object
    //   2867	5	15	localIOException7	java.io.IOException
    //   2886	5	15	localIOException8	java.io.IOException
    //   2905	5	15	localArrayIndexOutOfBoundsException7	ArrayIndexOutOfBoundsException
    //   2952	83	15	localObject3	Object
    //   3162	5	15	localIOException9	java.io.IOException
    //   3181	5	15	localIOException10	java.io.IOException
    //   3200	5	15	localArrayIndexOutOfBoundsException8	ArrayIndexOutOfBoundsException
    //   3249	83	15	localObject4	Object
    //   3459	5	15	localIOException11	java.io.IOException
    //   3478	5	15	localIOException12	java.io.IOException
    //   3497	5	15	localArrayIndexOutOfBoundsException9	ArrayIndexOutOfBoundsException
    //   3546	83	15	localObject5	Object
    //   3756	5	15	localIOException13	java.io.IOException
    //   3775	5	15	localIOException14	java.io.IOException
    //   3794	5	15	localArrayIndexOutOfBoundsException10	ArrayIndexOutOfBoundsException
    //   3819	56	15	localObject6	Object
    //   3947	5	15	localIOException15	java.io.IOException
    //   3966	5	15	localArrayIndexOutOfBoundsException11	ArrayIndexOutOfBoundsException
    //   3991	543	15	localObject7	Object
    //   420	1313	16	localObject8	Object
    //   1930	229	16	localIOException16	java.io.IOException
    //   2234	5	16	localIOException17	java.io.IOException
    //   2298	100	16	localObject9	Object
    //   2491	5	16	localIOException18	java.io.IOException
    //   2577	5	16	localIOException19	java.io.IOException
    //   2634	82	16	localFileNotFoundException1	java.io.FileNotFoundException
    //   2924	87	16	localSSLHandshakeException1	javax.net.ssl.SSLHandshakeException
    //   3219	89	16	localSocketTimeoutException1	java.net.SocketTimeoutException
    //   3516	89	16	localException3	Exception
    //   3813	84	16	localObject10	Object
    //   3985	1	16	localObject11	Object
    //   4002	1	16	localObject12	Object
    //   4016	1	16	localObject13	Object
    //   4027	1	16	localObject14	Object
    //   4035	11	16	localObject15	Object
    //   4051	30	16	localObject16	Object
    //   4091	1	16	localObject17	Object
    //   4106	1	16	localException4	Exception
    //   4121	1	16	localException5	Exception
    //   4137	1	16	localException6	Exception
    //   4150	1	16	localException7	Exception
    //   4163	16	16	localException8	Exception
    //   4184	22	16	localObject18	Object
    //   4217	1	16	localSocketTimeoutException2	java.net.SocketTimeoutException
    //   4232	1	16	localSocketTimeoutException3	java.net.SocketTimeoutException
    //   4248	1	16	localSocketTimeoutException4	java.net.SocketTimeoutException
    //   4261	1	16	localSocketTimeoutException5	java.net.SocketTimeoutException
    //   4274	16	16	localSocketTimeoutException6	java.net.SocketTimeoutException
    //   4295	22	16	localObject19	Object
    //   4328	1	16	localSSLHandshakeException2	javax.net.ssl.SSLHandshakeException
    //   4342	1	16	localSSLHandshakeException3	javax.net.ssl.SSLHandshakeException
    //   4357	1	16	localSSLHandshakeException4	javax.net.ssl.SSLHandshakeException
    //   4369	1	16	localSSLHandshakeException5	javax.net.ssl.SSLHandshakeException
    //   4381	15	16	localSSLHandshakeException6	javax.net.ssl.SSLHandshakeException
    //   4401	21	16	localObject20	Object
    //   4433	1	16	localFileNotFoundException2	java.io.FileNotFoundException
    //   4444	1	16	localFileNotFoundException3	java.io.FileNotFoundException
    //   4456	1	16	localFileNotFoundException4	java.io.FileNotFoundException
    //   4465	1	16	localFileNotFoundException5	java.io.FileNotFoundException
    //   4474	12	16	localFileNotFoundException6	java.io.FileNotFoundException
    //   4491	147	16	localObject21	Object
    //   442	58	17	localEntry	java.util.Map.Entry
    //   513	53	17	localUnsupportedEncodingException1	java.io.UnsupportedEncodingException
    //   1737	2128	17	localFileOutputStream	java.io.FileOutputStream
    //   3928	5	17	localIOException20	java.io.IOException
    //   3988	517	17	localObject22	Object
    //   4520	1	17	localUnsupportedEncodingException2	java.io.UnsupportedEncodingException
    //   4540	20	17	localUnsupportedEncodingException3	java.io.UnsupportedEncodingException
    //   4572	37	17	localObject23	Object
    //   4613	1	17	localUnsupportedEncodingException4	java.io.UnsupportedEncodingException
    //   4622	1	17	localUnsupportedEncodingException5	java.io.UnsupportedEncodingException
    //   736	2889	18	localObject24	Object
    //   4043	7	18	localObject25	Object
    //   4059	7	18	localObject26	Object
    //   4072	28	18	localObject27	Object
    //   4176	7	18	localException9	Exception
    //   4197	7	18	localException10	Exception
    //   4287	7	18	localSocketTimeoutException7	java.net.SocketTimeoutException
    //   4308	7	18	localSocketTimeoutException8	java.net.SocketTimeoutException
    //   4393	7	18	localSSLHandshakeException7	javax.net.ssl.SSLHandshakeException
    //   4413	7	18	localSSLHandshakeException8	javax.net.ssl.SSLHandshakeException
    //   4483	7	18	localFileNotFoundException7	java.io.FileNotFoundException
    //   4500	7	18	localFileNotFoundException8	java.io.FileNotFoundException
    //   4557	14	18	localUnsupportedEncodingException6	java.io.UnsupportedEncodingException
    //   4579	11	18	localUnsupportedEncodingException7	java.io.UnsupportedEncodingException
    //   4596	11	18	localUnsupportedEncodingException8	java.io.UnsupportedEncodingException
    //   1744	2772	19	localObject28	Object
    //   1778	104	20	locale	com.tencent.mm.plugin.appbrand.e
    // Exception table:
    //   from	to	target	type
    //   227	334	513	java/io/UnsupportedEncodingException
    //   334	422	513	java/io/UnsupportedEncodingException
    //   422	510	513	java/io/UnsupportedEncodingException
    //   670	726	513	java/io/UnsupportedEncodingException
    //   731	738	513	java/io/UnsupportedEncodingException
    //   738	747	513	java/io/UnsupportedEncodingException
    //   921	950	513	java/io/UnsupportedEncodingException
    //   953	960	513	java/io/UnsupportedEncodingException
    //   1179	1210	1401	java/lang/Exception
    //   1358	1398	1401	java/lang/Exception
    //   1482	1491	1401	java/lang/Exception
    //   1420	1451	1454	java/lang/Exception
    //   1494	1503	1454	java/lang/Exception
    //   1327	1332	1506	java/io/IOException
    //   1327	1332	1525	java/lang/ArrayIndexOutOfBoundsException
    //   1654	1659	1685	java/io/IOException
    //   1654	1659	1704	java/lang/ArrayIndexOutOfBoundsException
    //   1837	1842	1930	java/io/IOException
    //   1847	1852	1949	java/io/IOException
    //   1847	1852	1968	java/lang/ArrayIndexOutOfBoundsException
    //   2193	2198	2234	java/io/IOException
    //   2203	2208	2253	java/io/IOException
    //   2203	2208	2272	java/lang/ArrayIndexOutOfBoundsException
    //   2397	2402	2491	java/io/IOException
    //   2407	2412	2510	java/io/IOException
    //   2407	2412	2529	java/lang/ArrayIndexOutOfBoundsException
    //   629	634	2577	java/io/IOException
    //   639	644	2596	java/io/IOException
    //   639	644	2615	java/lang/ArrayIndexOutOfBoundsException
    //   227	334	2634	java/io/FileNotFoundException
    //   334	422	2634	java/io/FileNotFoundException
    //   422	510	2634	java/io/FileNotFoundException
    //   670	726	2634	java/io/FileNotFoundException
    //   731	738	2634	java/io/FileNotFoundException
    //   738	747	2634	java/io/FileNotFoundException
    //   921	950	2634	java/io/FileNotFoundException
    //   953	960	2634	java/io/FileNotFoundException
    //   2797	2802	2867	java/io/IOException
    //   2807	2812	2886	java/io/IOException
    //   2807	2812	2905	java/lang/ArrayIndexOutOfBoundsException
    //   227	334	2924	javax/net/ssl/SSLHandshakeException
    //   334	422	2924	javax/net/ssl/SSLHandshakeException
    //   422	510	2924	javax/net/ssl/SSLHandshakeException
    //   670	726	2924	javax/net/ssl/SSLHandshakeException
    //   731	738	2924	javax/net/ssl/SSLHandshakeException
    //   738	747	2924	javax/net/ssl/SSLHandshakeException
    //   921	950	2924	javax/net/ssl/SSLHandshakeException
    //   953	960	2924	javax/net/ssl/SSLHandshakeException
    //   3092	3097	3162	java/io/IOException
    //   3102	3107	3181	java/io/IOException
    //   3102	3107	3200	java/lang/ArrayIndexOutOfBoundsException
    //   227	334	3219	java/net/SocketTimeoutException
    //   334	422	3219	java/net/SocketTimeoutException
    //   422	510	3219	java/net/SocketTimeoutException
    //   670	726	3219	java/net/SocketTimeoutException
    //   731	738	3219	java/net/SocketTimeoutException
    //   738	747	3219	java/net/SocketTimeoutException
    //   921	950	3219	java/net/SocketTimeoutException
    //   953	960	3219	java/net/SocketTimeoutException
    //   3389	3394	3459	java/io/IOException
    //   3399	3404	3478	java/io/IOException
    //   3399	3404	3497	java/lang/ArrayIndexOutOfBoundsException
    //   227	334	3516	java/lang/Exception
    //   334	422	3516	java/lang/Exception
    //   422	510	3516	java/lang/Exception
    //   670	726	3516	java/lang/Exception
    //   731	738	3516	java/lang/Exception
    //   738	747	3516	java/lang/Exception
    //   921	950	3516	java/lang/Exception
    //   953	960	3516	java/lang/Exception
    //   3686	3691	3756	java/io/IOException
    //   3696	3701	3775	java/io/IOException
    //   3696	3701	3794	java/lang/ArrayIndexOutOfBoundsException
    //   227	334	3813	finally
    //   334	422	3813	finally
    //   422	510	3813	finally
    //   670	726	3813	finally
    //   731	738	3813	finally
    //   738	747	3813	finally
    //   921	950	3813	finally
    //   953	960	3813	finally
    //   3864	3869	3928	java/io/IOException
    //   3874	3879	3947	java/io/IOException
    //   3874	3879	3966	java/lang/ArrayIndexOutOfBoundsException
    //   757	826	3985	finally
    //   830	870	3985	finally
    //   963	1007	3985	finally
    //   1058	1066	3985	finally
    //   1070	1128	3985	finally
    //   1179	1210	3985	finally
    //   1358	1398	3985	finally
    //   1403	1420	3985	finally
    //   1420	1451	3985	finally
    //   1456	1476	3985	finally
    //   1482	1491	3985	finally
    //   1494	1503	3985	finally
    //   1210	1297	4002	finally
    //   1544	1624	4002	finally
    //   1728	1739	4002	finally
    //   1739	1746	4016	finally
    //   1749	1758	4027	finally
    //   1764	1780	4027	finally
    //   1791	1811	4027	finally
    //   1878	1897	4027	finally
    //   1987	1997	4027	finally
    //   2291	2296	4027	finally
    //   2012	2079	4035	finally
    //   2086	2167	4035	finally
    //   2300	2327	4043	finally
    //   2438	2457	4043	finally
    //   2329	2362	4059	finally
    //   528	594	4072	finally
    //   2659	2673	4091	finally
    //   2690	2724	4091	finally
    //   2741	2761	4091	finally
    //   2954	2968	4091	finally
    //   2985	3019	4091	finally
    //   3036	3056	4091	finally
    //   3251	3265	4091	finally
    //   3282	3316	4091	finally
    //   3333	3353	4091	finally
    //   3548	3562	4091	finally
    //   3579	3613	4091	finally
    //   3630	3650	4091	finally
    //   757	826	4106	java/lang/Exception
    //   830	870	4106	java/lang/Exception
    //   963	1007	4106	java/lang/Exception
    //   1058	1066	4106	java/lang/Exception
    //   1070	1128	4106	java/lang/Exception
    //   1403	1420	4106	java/lang/Exception
    //   1456	1476	4106	java/lang/Exception
    //   1210	1297	4121	java/lang/Exception
    //   1544	1624	4121	java/lang/Exception
    //   1728	1739	4121	java/lang/Exception
    //   1739	1746	4137	java/lang/Exception
    //   1749	1758	4150	java/lang/Exception
    //   1764	1780	4150	java/lang/Exception
    //   1791	1811	4150	java/lang/Exception
    //   1878	1897	4150	java/lang/Exception
    //   1987	1997	4150	java/lang/Exception
    //   2291	2296	4150	java/lang/Exception
    //   2012	2079	4163	java/lang/Exception
    //   2086	2167	4163	java/lang/Exception
    //   2300	2327	4176	java/lang/Exception
    //   2438	2457	4176	java/lang/Exception
    //   2329	2362	4197	java/lang/Exception
    //   757	826	4217	java/net/SocketTimeoutException
    //   830	870	4217	java/net/SocketTimeoutException
    //   963	1007	4217	java/net/SocketTimeoutException
    //   1058	1066	4217	java/net/SocketTimeoutException
    //   1070	1128	4217	java/net/SocketTimeoutException
    //   1179	1210	4217	java/net/SocketTimeoutException
    //   1358	1398	4217	java/net/SocketTimeoutException
    //   1403	1420	4217	java/net/SocketTimeoutException
    //   1420	1451	4217	java/net/SocketTimeoutException
    //   1456	1476	4217	java/net/SocketTimeoutException
    //   1482	1491	4217	java/net/SocketTimeoutException
    //   1494	1503	4217	java/net/SocketTimeoutException
    //   1210	1297	4232	java/net/SocketTimeoutException
    //   1544	1624	4232	java/net/SocketTimeoutException
    //   1728	1739	4232	java/net/SocketTimeoutException
    //   1739	1746	4248	java/net/SocketTimeoutException
    //   1749	1758	4261	java/net/SocketTimeoutException
    //   1764	1780	4261	java/net/SocketTimeoutException
    //   1791	1811	4261	java/net/SocketTimeoutException
    //   1878	1897	4261	java/net/SocketTimeoutException
    //   1987	1997	4261	java/net/SocketTimeoutException
    //   2291	2296	4261	java/net/SocketTimeoutException
    //   2012	2079	4274	java/net/SocketTimeoutException
    //   2086	2167	4274	java/net/SocketTimeoutException
    //   2300	2327	4287	java/net/SocketTimeoutException
    //   2438	2457	4287	java/net/SocketTimeoutException
    //   2329	2362	4308	java/net/SocketTimeoutException
    //   757	826	4328	javax/net/ssl/SSLHandshakeException
    //   830	870	4328	javax/net/ssl/SSLHandshakeException
    //   963	1007	4328	javax/net/ssl/SSLHandshakeException
    //   1058	1066	4328	javax/net/ssl/SSLHandshakeException
    //   1070	1128	4328	javax/net/ssl/SSLHandshakeException
    //   1179	1210	4328	javax/net/ssl/SSLHandshakeException
    //   1358	1398	4328	javax/net/ssl/SSLHandshakeException
    //   1403	1420	4328	javax/net/ssl/SSLHandshakeException
    //   1420	1451	4328	javax/net/ssl/SSLHandshakeException
    //   1456	1476	4328	javax/net/ssl/SSLHandshakeException
    //   1482	1491	4328	javax/net/ssl/SSLHandshakeException
    //   1494	1503	4328	javax/net/ssl/SSLHandshakeException
    //   1210	1297	4342	javax/net/ssl/SSLHandshakeException
    //   1544	1624	4342	javax/net/ssl/SSLHandshakeException
    //   1728	1739	4342	javax/net/ssl/SSLHandshakeException
    //   1739	1746	4357	javax/net/ssl/SSLHandshakeException
    //   1749	1758	4369	javax/net/ssl/SSLHandshakeException
    //   1764	1780	4369	javax/net/ssl/SSLHandshakeException
    //   1791	1811	4369	javax/net/ssl/SSLHandshakeException
    //   1878	1897	4369	javax/net/ssl/SSLHandshakeException
    //   1987	1997	4369	javax/net/ssl/SSLHandshakeException
    //   2291	2296	4369	javax/net/ssl/SSLHandshakeException
    //   2012	2079	4381	javax/net/ssl/SSLHandshakeException
    //   2086	2167	4381	javax/net/ssl/SSLHandshakeException
    //   2300	2327	4393	javax/net/ssl/SSLHandshakeException
    //   2438	2457	4393	javax/net/ssl/SSLHandshakeException
    //   2329	2362	4413	javax/net/ssl/SSLHandshakeException
    //   757	826	4433	java/io/FileNotFoundException
    //   830	870	4433	java/io/FileNotFoundException
    //   963	1007	4433	java/io/FileNotFoundException
    //   1058	1066	4433	java/io/FileNotFoundException
    //   1070	1128	4433	java/io/FileNotFoundException
    //   1179	1210	4433	java/io/FileNotFoundException
    //   1358	1398	4433	java/io/FileNotFoundException
    //   1403	1420	4433	java/io/FileNotFoundException
    //   1420	1451	4433	java/io/FileNotFoundException
    //   1456	1476	4433	java/io/FileNotFoundException
    //   1482	1491	4433	java/io/FileNotFoundException
    //   1494	1503	4433	java/io/FileNotFoundException
    //   1210	1297	4444	java/io/FileNotFoundException
    //   1544	1624	4444	java/io/FileNotFoundException
    //   1728	1739	4444	java/io/FileNotFoundException
    //   1739	1746	4456	java/io/FileNotFoundException
    //   1749	1758	4465	java/io/FileNotFoundException
    //   1764	1780	4465	java/io/FileNotFoundException
    //   1791	1811	4465	java/io/FileNotFoundException
    //   1878	1897	4465	java/io/FileNotFoundException
    //   1987	1997	4465	java/io/FileNotFoundException
    //   2291	2296	4465	java/io/FileNotFoundException
    //   2012	2079	4474	java/io/FileNotFoundException
    //   2086	2167	4474	java/io/FileNotFoundException
    //   2300	2327	4483	java/io/FileNotFoundException
    //   2438	2457	4483	java/io/FileNotFoundException
    //   2329	2362	4500	java/io/FileNotFoundException
    //   757	826	4520	java/io/UnsupportedEncodingException
    //   830	870	4520	java/io/UnsupportedEncodingException
    //   963	1007	4520	java/io/UnsupportedEncodingException
    //   1058	1066	4520	java/io/UnsupportedEncodingException
    //   1070	1128	4520	java/io/UnsupportedEncodingException
    //   1179	1210	4520	java/io/UnsupportedEncodingException
    //   1358	1398	4520	java/io/UnsupportedEncodingException
    //   1403	1420	4520	java/io/UnsupportedEncodingException
    //   1420	1451	4520	java/io/UnsupportedEncodingException
    //   1456	1476	4520	java/io/UnsupportedEncodingException
    //   1482	1491	4520	java/io/UnsupportedEncodingException
    //   1494	1503	4520	java/io/UnsupportedEncodingException
    //   1210	1297	4540	java/io/UnsupportedEncodingException
    //   1544	1624	4540	java/io/UnsupportedEncodingException
    //   1728	1739	4540	java/io/UnsupportedEncodingException
    //   1739	1746	4557	java/io/UnsupportedEncodingException
    //   1749	1758	4579	java/io/UnsupportedEncodingException
    //   1764	1780	4579	java/io/UnsupportedEncodingException
    //   1791	1811	4579	java/io/UnsupportedEncodingException
    //   1878	1897	4579	java/io/UnsupportedEncodingException
    //   1987	1997	4579	java/io/UnsupportedEncodingException
    //   2291	2296	4579	java/io/UnsupportedEncodingException
    //   2012	2079	4596	java/io/UnsupportedEncodingException
    //   2086	2167	4596	java/io/UnsupportedEncodingException
    //   2300	2327	4613	java/io/UnsupportedEncodingException
    //   2438	2457	4613	java/io/UnsupportedEncodingException
    //   2329	2362	4622	java/io/UnsupportedEncodingException
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\h\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */