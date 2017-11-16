package com.tencent.mm.plugin.appbrand.h;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.a;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.o.l;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.net.ssl.SSLContext;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
{
  private String hyD;
  public int isH;
  private SSLContext isJ;
  private final String isK;
  protected final ArrayList<String> isL;
  protected final ArrayList<d> isS;
  
  public c(String paramString1, String paramString2)
  {
    GMTrace.i(19902744231936L, 148287);
    this.isS = new ArrayList();
    this.isL = new ArrayList();
    this.hyD = paramString1;
    this.isH = a.nK(paramString1).hQR;
    this.isK = paramString2;
    GMTrace.o(19902744231936L, 148287);
  }
  
  private void a(String paramString, HttpURLConnection paramHttpURLConnection)
  {
    GMTrace.i(20767106400256L, 154727);
    rk(paramString);
    if (paramHttpURLConnection != null) {
      paramHttpURLConnection.disconnect();
    }
    GMTrace.o(20767106400256L, 154727);
  }
  
  private static JSONObject b(HttpURLConnection paramHttpURLConnection)
  {
    GMTrace.i(15564021956608L, 115961);
    JSONObject localJSONObject = new JSONObject();
    if (paramHttpURLConnection == null)
    {
      GMTrace.o(15564021956608L, 115961);
      return localJSONObject;
    }
    paramHttpURLConnection = paramHttpURLConnection.getHeaderFields();
    if (paramHttpURLConnection == null)
    {
      GMTrace.o(15564021956608L, 115961);
      return localJSONObject;
    }
    paramHttpURLConnection = paramHttpURLConnection.entrySet().iterator();
    while (paramHttpURLConnection.hasNext())
    {
      Object localObject = (Map.Entry)paramHttpURLConnection.next();
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = (List)((Map.Entry)localObject).getValue();
      if ((!bg.nm(str)) && (localObject != null) && (!((List)localObject).isEmpty()))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append((String)((List)localObject).get(0));
        int i = 1;
        while (i < ((List)localObject).size())
        {
          localStringBuilder.append(",");
          localStringBuilder.append((String)((List)localObject).get(i));
          i += 1;
        }
        try
        {
          localJSONObject.put(str, localStringBuilder.toString());
        }
        catch (JSONException localJSONException)
        {
          w.e("MicroMsg.AppBrandNetworkRequest", "put header error : %s", new Object[] { Log.getStackTraceString(localJSONException) });
        }
      }
    }
    GMTrace.o(15564021956608L, 115961);
    return localJSONObject;
  }
  
  /* Error */
  private void rk(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 177
    //   5: ldc -77
    //   7: invokestatic 37	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_1
    //   11: ifnonnull +14 -> 25
    //   14: ldc2_w 177
    //   17: ldc -77
    //   19: invokestatic 64	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   22: aload_0
    //   23: monitorexit
    //   24: return
    //   25: aload_0
    //   26: getfield 42	com/tencent/mm/plugin/appbrand/h/c:isS	Ljava/util/ArrayList;
    //   29: astore_2
    //   30: aload_2
    //   31: monitorenter
    //   32: aload_0
    //   33: getfield 42	com/tencent/mm/plugin/appbrand/h/c:isS	Ljava/util/ArrayList;
    //   36: invokevirtual 180	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   39: astore_3
    //   40: aload_3
    //   41: invokeinterface 110 1 0
    //   46: ifeq +36 -> 82
    //   49: aload_3
    //   50: invokeinterface 114 1 0
    //   55: checkcast 182	com/tencent/mm/plugin/appbrand/h/d
    //   58: astore 4
    //   60: aload_1
    //   61: aload 4
    //   63: getfield 185	com/tencent/mm/plugin/appbrand/h/d:hXm	Ljava/lang/String;
    //   66: invokevirtual 189	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   69: ifeq -29 -> 40
    //   72: aload_0
    //   73: getfield 42	com/tencent/mm/plugin/appbrand/h/c:isS	Ljava/util/ArrayList;
    //   76: aload 4
    //   78: invokevirtual 192	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   81: pop
    //   82: aload_2
    //   83: monitorexit
    //   84: ldc2_w 177
    //   87: ldc -77
    //   89: invokestatic 64	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   92: goto -70 -> 22
    //   95: astore_1
    //   96: aload_0
    //   97: monitorexit
    //   98: aload_1
    //   99: athrow
    //   100: astore_1
    //   101: aload_2
    //   102: monitorexit
    //   103: aload_1
    //   104: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	c
    //   0	105	1	paramString	String
    //   39	11	3	localIterator	Iterator
    //   58	19	4	locald	d
    // Exception table:
    //   from	to	target	type
    //   2	10	95	finally
    //   14	22	95	finally
    //   25	32	95	finally
    //   84	92	95	finally
    //   103	105	95	finally
    //   32	40	100	finally
    //   40	82	100	finally
    //   82	84	100	finally
    //   101	103	100	finally
  }
  
  public static boolean rp(String paramString)
  {
    GMTrace.i(10673262166016L, 79522);
    if ((paramString.equalsIgnoreCase("POST")) || (paramString.equalsIgnoreCase("PUT")) || (paramString.equalsIgnoreCase("DELETE")))
    {
      GMTrace.o(10673262166016L, 79522);
      return true;
    }
    GMTrace.o(10673262166016L, 79522);
    return false;
  }
  
  /* Error */
  public final void a(d paramd)
  {
    // Byte code:
    //   0: ldc2_w 221
    //   3: ldc -33
    //   5: invokestatic 37	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aconst_null
    //   9: astore 22
    //   11: aconst_null
    //   12: astore 23
    //   14: aconst_null
    //   15: astore 30
    //   17: aconst_null
    //   18: astore 31
    //   20: aconst_null
    //   21: astore 32
    //   23: aconst_null
    //   24: astore 33
    //   26: aconst_null
    //   27: astore 21
    //   29: aconst_null
    //   30: astore 24
    //   32: aconst_null
    //   33: astore 25
    //   35: aconst_null
    //   36: astore 26
    //   38: aconst_null
    //   39: astore 27
    //   41: aconst_null
    //   42: astore 28
    //   44: aconst_null
    //   45: astore 29
    //   47: aconst_null
    //   48: astore 18
    //   50: aconst_null
    //   51: astore 14
    //   53: aconst_null
    //   54: astore 17
    //   56: aconst_null
    //   57: astore 15
    //   59: aconst_null
    //   60: astore 19
    //   62: aconst_null
    //   63: astore 20
    //   65: aconst_null
    //   66: astore 16
    //   68: aconst_null
    //   69: astore 34
    //   71: aconst_null
    //   72: astore 35
    //   74: aconst_null
    //   75: astore 36
    //   77: aconst_null
    //   78: astore 37
    //   80: aconst_null
    //   81: astore 38
    //   83: aconst_null
    //   84: astore 13
    //   86: aload_1
    //   87: getfield 227	com/tencent/mm/plugin/appbrand/h/d:itd	Lcom/tencent/mm/plugin/appbrand/h/c$a;
    //   90: astore 39
    //   92: aload_1
    //   93: getfield 231	com/tencent/mm/plugin/appbrand/h/d:ite	Ljava/util/Map;
    //   96: astore 40
    //   98: iconst_0
    //   99: istore_3
    //   100: iconst_0
    //   101: istore 4
    //   103: iconst_0
    //   104: istore 6
    //   106: iconst_0
    //   107: istore 7
    //   109: iconst_0
    //   110: istore 5
    //   112: aload_1
    //   113: getfield 234	com/tencent/mm/plugin/appbrand/h/d:itf	Ljava/util/ArrayList;
    //   116: astore 41
    //   118: aload 41
    //   120: ifnull +79 -> 199
    //   123: aload 41
    //   125: aload_1
    //   126: getfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   129: invokestatic 242	com/tencent/mm/plugin/appbrand/h/i:a	(Ljava/util/ArrayList;Ljava/lang/String;)Z
    //   132: ifne +67 -> 199
    //   135: aload 39
    //   137: ldc -12
    //   139: invokeinterface 247 2 0
    //   144: aload_0
    //   145: getfield 46	com/tencent/mm/plugin/appbrand/h/c:hyD	Ljava/lang/String;
    //   148: aload_1
    //   149: getfield 250	com/tencent/mm/plugin/appbrand/h/d:itj	Ljava/lang/String;
    //   152: aload_1
    //   153: getfield 253	com/tencent/mm/plugin/appbrand/h/d:itc	Ljava/lang/String;
    //   156: aload_1
    //   157: getfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   160: lconst_0
    //   161: lconst_0
    //   162: iconst_0
    //   163: iconst_2
    //   164: aload_1
    //   165: invokevirtual 256	com/tencent/mm/plugin/appbrand/h/d:YQ	()I
    //   168: invokestatic 261	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   171: ldc -94
    //   173: ldc_w 263
    //   176: iconst_1
    //   177: anewarray 4	java/lang/Object
    //   180: dup
    //   181: iconst_0
    //   182: aload_1
    //   183: getfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   186: aastore
    //   187: invokestatic 265	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   190: ldc2_w 221
    //   193: ldc -33
    //   195: invokestatic 64	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   198: return
    //   199: getstatic 271	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   202: ldc2_w 272
    //   205: lconst_0
    //   206: lconst_1
    //   207: iconst_0
    //   208: invokevirtual 276	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   211: ldc -94
    //   213: ldc_w 278
    //   216: iconst_2
    //   217: anewarray 4	java/lang/Object
    //   220: dup
    //   221: iconst_0
    //   222: aload_1
    //   223: getfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   226: aastore
    //   227: dup
    //   228: iconst_1
    //   229: aload_1
    //   230: getfield 253	com/tencent/mm/plugin/appbrand/h/d:itc	Ljava/lang/String;
    //   233: aastore
    //   234: invokestatic 265	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   237: new 280	java/net/URL
    //   240: dup
    //   241: aload_1
    //   242: getfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   245: invokespecial 282	java/net/URL:<init>	(Ljava/lang/String;)V
    //   248: invokevirtual 286	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   251: checkcast 75	java/net/HttpURLConnection
    //   254: astore 12
    //   256: aload 13
    //   258: astore 16
    //   260: aload 34
    //   262: astore 15
    //   264: aload 35
    //   266: astore 17
    //   268: aload 36
    //   270: astore 18
    //   272: aload 37
    //   274: astore 19
    //   276: aload 38
    //   278: astore 20
    //   280: aload_1
    //   281: getfield 185	com/tencent/mm/plugin/appbrand/h/d:hXm	Ljava/lang/String;
    //   284: invokestatic 132	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   287: ifne +33 -> 320
    //   290: aload 13
    //   292: astore 16
    //   294: aload 34
    //   296: astore 15
    //   298: aload 35
    //   300: astore 17
    //   302: aload 36
    //   304: astore 18
    //   306: aload 37
    //   308: astore 19
    //   310: aload 38
    //   312: astore 20
    //   314: aload_1
    //   315: aload 12
    //   317: putfield 290	com/tencent/mm/plugin/appbrand/h/d:iti	Ljava/net/HttpURLConnection;
    //   320: aload 12
    //   322: ifnonnull +64 -> 386
    //   325: aload_0
    //   326: getfield 46	com/tencent/mm/plugin/appbrand/h/c:hyD	Ljava/lang/String;
    //   329: aload_1
    //   330: getfield 250	com/tencent/mm/plugin/appbrand/h/d:itj	Ljava/lang/String;
    //   333: aload_1
    //   334: getfield 253	com/tencent/mm/plugin/appbrand/h/d:itc	Ljava/lang/String;
    //   337: aload_1
    //   338: getfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   341: aload_1
    //   342: invokevirtual 294	com/tencent/mm/plugin/appbrand/h/d:getDataSize	()J
    //   345: lconst_0
    //   346: iconst_0
    //   347: iconst_2
    //   348: aload_1
    //   349: invokevirtual 256	com/tencent/mm/plugin/appbrand/h/d:YQ	()I
    //   352: invokestatic 261	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   355: aload_0
    //   356: aload_1
    //   357: getfield 185	com/tencent/mm/plugin/appbrand/h/d:hXm	Ljava/lang/String;
    //   360: aload 12
    //   362: invokespecial 296	com/tencent/mm/plugin/appbrand/h/c:a	(Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   365: aload_0
    //   366: getfield 44	com/tencent/mm/plugin/appbrand/h/c:isL	Ljava/util/ArrayList;
    //   369: aload_1
    //   370: getfield 185	com/tencent/mm/plugin/appbrand/h/d:hXm	Ljava/lang/String;
    //   373: invokevirtual 192	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   376: pop
    //   377: ldc2_w 221
    //   380: ldc -33
    //   382: invokestatic 64	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   385: return
    //   386: aload 13
    //   388: astore 16
    //   390: aload 34
    //   392: astore 15
    //   394: aload 35
    //   396: astore 17
    //   398: aload 36
    //   400: astore 18
    //   402: aload 37
    //   404: astore 19
    //   406: aload 38
    //   408: astore 20
    //   410: aload 12
    //   412: instanceof 298
    //   415: ifeq +217 -> 632
    //   418: aload 13
    //   420: astore 16
    //   422: aload 34
    //   424: astore 15
    //   426: aload 35
    //   428: astore 17
    //   430: aload 36
    //   432: astore 18
    //   434: aload 37
    //   436: astore 19
    //   438: aload 38
    //   440: astore 20
    //   442: aload_0
    //   443: getfield 300	com/tencent/mm/plugin/appbrand/h/c:isJ	Ljavax/net/ssl/SSLContext;
    //   446: ifnonnull +38 -> 484
    //   449: aload 13
    //   451: astore 16
    //   453: aload 34
    //   455: astore 15
    //   457: aload 35
    //   459: astore 17
    //   461: aload 36
    //   463: astore 18
    //   465: aload 37
    //   467: astore 19
    //   469: aload 38
    //   471: astore 20
    //   473: aload_0
    //   474: aload_0
    //   475: getfield 46	com/tencent/mm/plugin/appbrand/h/c:hyD	Ljava/lang/String;
    //   478: invokestatic 304	com/tencent/mm/plugin/appbrand/h/i:rv	(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
    //   481: putfield 300	com/tencent/mm/plugin/appbrand/h/c:isJ	Ljavax/net/ssl/SSLContext;
    //   484: aload 13
    //   486: astore 16
    //   488: aload 34
    //   490: astore 15
    //   492: aload 35
    //   494: astore 17
    //   496: aload 36
    //   498: astore 18
    //   500: aload 37
    //   502: astore 19
    //   504: aload 38
    //   506: astore 20
    //   508: aload_0
    //   509: getfield 300	com/tencent/mm/plugin/appbrand/h/c:isJ	Ljavax/net/ssl/SSLContext;
    //   512: ifnull +42 -> 554
    //   515: aload 13
    //   517: astore 16
    //   519: aload 34
    //   521: astore 15
    //   523: aload 35
    //   525: astore 17
    //   527: aload 36
    //   529: astore 18
    //   531: aload 37
    //   533: astore 19
    //   535: aload 38
    //   537: astore 20
    //   539: aload 12
    //   541: checkcast 298	javax/net/ssl/HttpsURLConnection
    //   544: aload_0
    //   545: getfield 300	com/tencent/mm/plugin/appbrand/h/c:isJ	Ljavax/net/ssl/SSLContext;
    //   548: invokevirtual 310	javax/net/ssl/SSLContext:getSocketFactory	()Ljavax/net/ssl/SSLSocketFactory;
    //   551: invokevirtual 314	javax/net/ssl/HttpsURLConnection:setSSLSocketFactory	(Ljavax/net/ssl/SSLSocketFactory;)V
    //   554: aload 13
    //   556: astore 16
    //   558: aload 34
    //   560: astore 15
    //   562: aload 35
    //   564: astore 17
    //   566: aload 36
    //   568: astore 18
    //   570: aload 37
    //   572: astore 19
    //   574: aload 38
    //   576: astore 20
    //   578: ldc -94
    //   580: new 137	java/lang/StringBuilder
    //   583: dup
    //   584: ldc_w 316
    //   587: invokespecial 317	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   590: aload 41
    //   592: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   595: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   598: invokestatic 322	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   601: aload 13
    //   603: astore 16
    //   605: aload 34
    //   607: astore 15
    //   609: aload 35
    //   611: astore 17
    //   613: aload 36
    //   615: astore 18
    //   617: aload 37
    //   619: astore 19
    //   621: aload 38
    //   623: astore 20
    //   625: aload 12
    //   627: aload 41
    //   629: invokestatic 325	com/tencent/mm/plugin/appbrand/h/i:a	(Ljava/net/HttpURLConnection;Ljava/util/ArrayList;)V
    //   632: aload 13
    //   634: astore 16
    //   636: aload 34
    //   638: astore 15
    //   640: aload 35
    //   642: astore 17
    //   644: aload 36
    //   646: astore 18
    //   648: aload 37
    //   650: astore 19
    //   652: aload 38
    //   654: astore 20
    //   656: aload 12
    //   658: aload_1
    //   659: getfield 328	com/tencent/mm/plugin/appbrand/h/d:ita	I
    //   662: invokevirtual 332	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   665: aload 13
    //   667: astore 16
    //   669: aload 34
    //   671: astore 15
    //   673: aload 35
    //   675: astore 17
    //   677: aload 36
    //   679: astore 18
    //   681: aload 37
    //   683: astore 19
    //   685: aload 38
    //   687: astore 20
    //   689: aload 12
    //   691: aload_1
    //   692: getfield 328	com/tencent/mm/plugin/appbrand/h/d:ita	I
    //   695: invokevirtual 335	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   698: aload 13
    //   700: astore 16
    //   702: aload 34
    //   704: astore 15
    //   706: aload 35
    //   708: astore 17
    //   710: aload 36
    //   712: astore 18
    //   714: aload 37
    //   716: astore 19
    //   718: aload 38
    //   720: astore 20
    //   722: aload 12
    //   724: ldc_w 337
    //   727: ldc_w 339
    //   730: invokevirtual 342	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   733: aload 13
    //   735: astore 16
    //   737: aload 34
    //   739: astore 15
    //   741: aload 35
    //   743: astore 17
    //   745: aload 36
    //   747: astore 18
    //   749: aload 37
    //   751: astore 19
    //   753: aload 38
    //   755: astore 20
    //   757: aload 12
    //   759: iconst_0
    //   760: invokevirtual 346	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   763: aload 13
    //   765: astore 16
    //   767: aload 34
    //   769: astore 15
    //   771: aload 35
    //   773: astore 17
    //   775: aload 36
    //   777: astore 18
    //   779: aload 37
    //   781: astore 19
    //   783: aload 38
    //   785: astore 20
    //   787: aload 12
    //   789: aload_1
    //   790: getfield 253	com/tencent/mm/plugin/appbrand/h/d:itc	Ljava/lang/String;
    //   793: invokevirtual 349	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   796: aload 13
    //   798: astore 16
    //   800: aload 34
    //   802: astore 15
    //   804: aload 35
    //   806: astore 17
    //   808: aload 36
    //   810: astore 18
    //   812: aload 37
    //   814: astore 19
    //   816: aload 38
    //   818: astore 20
    //   820: aload 12
    //   822: iconst_1
    //   823: invokevirtual 352	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   826: aload 13
    //   828: astore 16
    //   830: aload 34
    //   832: astore 15
    //   834: aload 35
    //   836: astore 17
    //   838: aload 36
    //   840: astore 18
    //   842: aload 37
    //   844: astore 19
    //   846: aload 38
    //   848: astore 20
    //   850: aload 12
    //   852: ldc_w 354
    //   855: ldc_w 356
    //   858: invokevirtual 342	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   861: aload 40
    //   863: ifnull +422 -> 1285
    //   866: aload 13
    //   868: astore 16
    //   870: aload 34
    //   872: astore 15
    //   874: aload 35
    //   876: astore 17
    //   878: aload 36
    //   880: astore 18
    //   882: aload 37
    //   884: astore 19
    //   886: aload 38
    //   888: astore 20
    //   890: ldc -94
    //   892: ldc_w 358
    //   895: iconst_1
    //   896: anewarray 4	java/lang/Object
    //   899: dup
    //   900: iconst_0
    //   901: aload_1
    //   902: getfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   905: aastore
    //   906: invokestatic 265	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   909: aload 13
    //   911: astore 16
    //   913: aload 34
    //   915: astore 15
    //   917: aload 35
    //   919: astore 17
    //   921: aload 36
    //   923: astore 18
    //   925: aload 37
    //   927: astore 19
    //   929: aload 38
    //   931: astore 20
    //   933: aload 40
    //   935: invokeinterface 98 1 0
    //   940: invokeinterface 104 1 0
    //   945: astore 40
    //   947: aload 13
    //   949: astore 16
    //   951: aload 34
    //   953: astore 15
    //   955: aload 35
    //   957: astore 17
    //   959: aload 36
    //   961: astore 18
    //   963: aload 37
    //   965: astore 19
    //   967: aload 38
    //   969: astore 20
    //   971: aload 40
    //   973: invokeinterface 110 1 0
    //   978: ifeq +307 -> 1285
    //   981: aload 13
    //   983: astore 16
    //   985: aload 34
    //   987: astore 15
    //   989: aload 35
    //   991: astore 17
    //   993: aload 36
    //   995: astore 18
    //   997: aload 37
    //   999: astore 19
    //   1001: aload 38
    //   1003: astore 20
    //   1005: aload 40
    //   1007: invokeinterface 114 1 0
    //   1012: checkcast 116	java/util/Map$Entry
    //   1015: astore 41
    //   1017: aload 13
    //   1019: astore 16
    //   1021: aload 34
    //   1023: astore 15
    //   1025: aload 35
    //   1027: astore 17
    //   1029: aload 36
    //   1031: astore 18
    //   1033: aload 37
    //   1035: astore 19
    //   1037: aload 38
    //   1039: astore 20
    //   1041: aload 12
    //   1043: aload 41
    //   1045: invokeinterface 119 1 0
    //   1050: checkcast 121	java/lang/String
    //   1053: aload 41
    //   1055: invokeinterface 124 1 0
    //   1060: checkcast 121	java/lang/String
    //   1063: invokevirtual 342	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   1066: aload 13
    //   1068: astore 16
    //   1070: aload 34
    //   1072: astore 15
    //   1074: aload 35
    //   1076: astore 17
    //   1078: aload 36
    //   1080: astore 18
    //   1082: aload 37
    //   1084: astore 19
    //   1086: aload 38
    //   1088: astore 20
    //   1090: ldc -94
    //   1092: ldc_w 360
    //   1095: iconst_3
    //   1096: anewarray 4	java/lang/Object
    //   1099: dup
    //   1100: iconst_0
    //   1101: aload_1
    //   1102: getfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   1105: aastore
    //   1106: dup
    //   1107: iconst_1
    //   1108: aload 41
    //   1110: invokeinterface 119 1 0
    //   1115: aastore
    //   1116: dup
    //   1117: iconst_2
    //   1118: aload 41
    //   1120: invokeinterface 124 1 0
    //   1125: aastore
    //   1126: invokestatic 265	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1129: goto -182 -> 947
    //   1132: astore 17
    //   1134: iconst_0
    //   1135: istore_3
    //   1136: iconst_0
    //   1137: istore_2
    //   1138: aload 12
    //   1140: astore 13
    //   1142: aload 29
    //   1144: astore 15
    //   1146: aload 16
    //   1148: astore 14
    //   1150: aload 17
    //   1152: astore 12
    //   1154: getstatic 271	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   1157: ldc2_w 272
    //   1160: lconst_1
    //   1161: lconst_1
    //   1162: iconst_0
    //   1163: invokevirtual 276	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   1166: ldc -94
    //   1168: ldc_w 362
    //   1171: iconst_2
    //   1172: anewarray 4	java/lang/Object
    //   1175: dup
    //   1176: iconst_0
    //   1177: aload_1
    //   1178: getfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   1181: aastore
    //   1182: dup
    //   1183: iconst_1
    //   1184: aload 12
    //   1186: invokevirtual 363	java/io/UnsupportedEncodingException:toString	()Ljava/lang/String;
    //   1189: aastore
    //   1190: invokestatic 176	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1193: aload 39
    //   1195: ldc_w 365
    //   1198: invokeinterface 247 2 0
    //   1203: aload_0
    //   1204: getfield 46	com/tencent/mm/plugin/appbrand/h/c:hyD	Ljava/lang/String;
    //   1207: aload_1
    //   1208: getfield 250	com/tencent/mm/plugin/appbrand/h/d:itj	Ljava/lang/String;
    //   1211: aload_1
    //   1212: getfield 253	com/tencent/mm/plugin/appbrand/h/d:itc	Ljava/lang/String;
    //   1215: aload_1
    //   1216: getfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   1219: aload_1
    //   1220: invokevirtual 294	com/tencent/mm/plugin/appbrand/h/d:getDataSize	()J
    //   1223: iload_2
    //   1224: i2l
    //   1225: iload_3
    //   1226: iconst_2
    //   1227: aload_1
    //   1228: invokevirtual 256	com/tencent/mm/plugin/appbrand/h/d:YQ	()I
    //   1231: invokestatic 261	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   1234: aload_0
    //   1235: aload_1
    //   1236: getfield 185	com/tencent/mm/plugin/appbrand/h/d:hXm	Ljava/lang/String;
    //   1239: aload 13
    //   1241: invokespecial 296	com/tencent/mm/plugin/appbrand/h/c:a	(Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   1244: aload 15
    //   1246: ifnull +8 -> 1254
    //   1249: aload 15
    //   1251: invokevirtual 370	java/io/InputStream:close	()V
    //   1254: aload 14
    //   1256: ifnull +8 -> 1264
    //   1259: aload 14
    //   1261: invokevirtual 373	java/io/DataOutputStream:close	()V
    //   1264: aload_0
    //   1265: getfield 44	com/tencent/mm/plugin/appbrand/h/c:isL	Ljava/util/ArrayList;
    //   1268: aload_1
    //   1269: getfield 185	com/tencent/mm/plugin/appbrand/h/d:hXm	Ljava/lang/String;
    //   1272: invokevirtual 192	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   1275: pop
    //   1276: ldc2_w 221
    //   1279: ldc -33
    //   1281: invokestatic 64	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1284: return
    //   1285: aload 13
    //   1287: astore 16
    //   1289: aload 34
    //   1291: astore 15
    //   1293: aload 35
    //   1295: astore 17
    //   1297: aload 36
    //   1299: astore 18
    //   1301: aload 37
    //   1303: astore 19
    //   1305: aload 38
    //   1307: astore 20
    //   1309: aload 12
    //   1311: ldc_w 375
    //   1314: invokestatic 381	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   1317: aload_0
    //   1318: getfield 61	com/tencent/mm/plugin/appbrand/h/c:isK	Ljava/lang/String;
    //   1321: invokestatic 387	com/tencent/mm/pluginsdk/ui/tools/s:aZ	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   1324: invokevirtual 342	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   1327: aload 13
    //   1329: astore 16
    //   1331: aload 34
    //   1333: astore 15
    //   1335: aload 35
    //   1337: astore 17
    //   1339: aload 36
    //   1341: astore 18
    //   1343: aload 37
    //   1345: astore 19
    //   1347: aload 38
    //   1349: astore 20
    //   1351: aload_1
    //   1352: getfield 253	com/tencent/mm/plugin/appbrand/h/d:itc	Ljava/lang/String;
    //   1355: invokestatic 389	com/tencent/mm/plugin/appbrand/h/c:rp	(Ljava/lang/String;)Z
    //   1358: ifeq +166 -> 1524
    //   1361: aload 13
    //   1363: astore 16
    //   1365: aload 34
    //   1367: astore 15
    //   1369: aload 35
    //   1371: astore 17
    //   1373: aload 36
    //   1375: astore 18
    //   1377: aload 37
    //   1379: astore 19
    //   1381: aload 38
    //   1383: astore 20
    //   1385: ldc -94
    //   1387: ldc_w 391
    //   1390: invokestatic 322	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1393: aload 13
    //   1395: astore 16
    //   1397: aload 34
    //   1399: astore 15
    //   1401: aload 35
    //   1403: astore 17
    //   1405: aload 36
    //   1407: astore 18
    //   1409: aload 37
    //   1411: astore 19
    //   1413: aload 38
    //   1415: astore 20
    //   1417: aload 12
    //   1419: ldc_w 393
    //   1422: aload_1
    //   1423: getfield 397	com/tencent/mm/plugin/appbrand/h/d:itb	[B
    //   1426: arraylength
    //   1427: invokestatic 402	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   1430: invokevirtual 342	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   1433: aload 13
    //   1435: astore 16
    //   1437: aload 34
    //   1439: astore 15
    //   1441: aload 35
    //   1443: astore 17
    //   1445: aload 36
    //   1447: astore 18
    //   1449: aload 37
    //   1451: astore 19
    //   1453: aload 38
    //   1455: astore 20
    //   1457: aload 12
    //   1459: iconst_1
    //   1460: invokevirtual 405	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   1463: aload 13
    //   1465: astore 16
    //   1467: aload 34
    //   1469: astore 15
    //   1471: aload 35
    //   1473: astore 17
    //   1475: aload 36
    //   1477: astore 18
    //   1479: aload 37
    //   1481: astore 19
    //   1483: aload 38
    //   1485: astore 20
    //   1487: new 372	java/io/DataOutputStream
    //   1490: dup
    //   1491: aload 12
    //   1493: invokevirtual 409	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   1496: invokespecial 412	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   1499: astore 13
    //   1501: aload 13
    //   1503: aload_1
    //   1504: getfield 397	com/tencent/mm/plugin/appbrand/h/d:itb	[B
    //   1507: invokevirtual 416	java/io/DataOutputStream:write	([B)V
    //   1510: aload 13
    //   1512: invokevirtual 419	java/io/DataOutputStream:flush	()V
    //   1515: aload 13
    //   1517: invokevirtual 373	java/io/DataOutputStream:close	()V
    //   1520: aload 13
    //   1522: astore 14
    //   1524: aload 14
    //   1526: astore 16
    //   1528: aload 14
    //   1530: astore 15
    //   1532: aload 14
    //   1534: astore 17
    //   1536: aload 14
    //   1538: astore 18
    //   1540: aload 14
    //   1542: astore 19
    //   1544: aload 14
    //   1546: astore 20
    //   1548: aload 12
    //   1550: invokevirtual 422	java/net/HttpURLConnection:getResponseCode	()I
    //   1553: istore_2
    //   1554: aload 23
    //   1556: astore 16
    //   1558: aload 24
    //   1560: astore 15
    //   1562: aload 25
    //   1564: astore 21
    //   1566: aload 26
    //   1568: astore 18
    //   1570: aload 27
    //   1572: astore 19
    //   1574: aload 28
    //   1576: astore 20
    //   1578: ldc -94
    //   1580: ldc_w 424
    //   1583: iconst_2
    //   1584: anewarray 4	java/lang/Object
    //   1587: dup
    //   1588: iconst_0
    //   1589: iload_2
    //   1590: invokestatic 428	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1593: aastore
    //   1594: dup
    //   1595: iconst_1
    //   1596: aload_1
    //   1597: getfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   1600: aastore
    //   1601: invokestatic 265	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1604: iload_2
    //   1605: sipush 200
    //   1608: if_icmpeq +642 -> 2250
    //   1611: aload 23
    //   1613: astore 16
    //   1615: aload 24
    //   1617: astore 15
    //   1619: aload 25
    //   1621: astore 21
    //   1623: aload 26
    //   1625: astore 18
    //   1627: aload 27
    //   1629: astore 19
    //   1631: aload 28
    //   1633: astore 20
    //   1635: ldc -94
    //   1637: ldc_w 430
    //   1640: iconst_2
    //   1641: anewarray 4	java/lang/Object
    //   1644: dup
    //   1645: iconst_0
    //   1646: aload_1
    //   1647: getfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   1650: aastore
    //   1651: dup
    //   1652: iconst_1
    //   1653: iload_2
    //   1654: invokestatic 428	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1657: aastore
    //   1658: invokestatic 176	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1661: aload 23
    //   1663: astore 16
    //   1665: aload 24
    //   1667: astore 15
    //   1669: aload 25
    //   1671: astore 21
    //   1673: aload 26
    //   1675: astore 18
    //   1677: aload 27
    //   1679: astore 19
    //   1681: aload 28
    //   1683: astore 20
    //   1685: iload_2
    //   1686: invokestatic 434	com/tencent/mm/plugin/appbrand/h/i:jd	(I)Z
    //   1689: ifeq +561 -> 2250
    //   1692: aload 23
    //   1694: astore 16
    //   1696: aload 24
    //   1698: astore 15
    //   1700: aload 25
    //   1702: astore 21
    //   1704: aload 26
    //   1706: astore 18
    //   1708: aload 27
    //   1710: astore 19
    //   1712: aload 28
    //   1714: astore 20
    //   1716: aload 12
    //   1718: invokestatic 438	com/tencent/mm/plugin/appbrand/h/i:c	(Ljava/net/HttpURLConnection;)Ljava/lang/String;
    //   1721: astore 13
    //   1723: aload 23
    //   1725: astore 16
    //   1727: aload 24
    //   1729: astore 15
    //   1731: aload 25
    //   1733: astore 21
    //   1735: aload 26
    //   1737: astore 18
    //   1739: aload 27
    //   1741: astore 19
    //   1743: aload 28
    //   1745: astore 20
    //   1747: aload_1
    //   1748: getfield 441	com/tencent/mm/plugin/appbrand/h/d:itg	I
    //   1751: istore 8
    //   1753: aload 23
    //   1755: astore 16
    //   1757: aload 24
    //   1759: astore 15
    //   1761: aload 25
    //   1763: astore 21
    //   1765: aload 26
    //   1767: astore 18
    //   1769: aload 27
    //   1771: astore 19
    //   1773: aload 28
    //   1775: astore 20
    //   1777: aload 13
    //   1779: invokestatic 446	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1782: ifne +468 -> 2250
    //   1785: iload 8
    //   1787: ifgt +180 -> 1967
    //   1790: aload 23
    //   1792: astore 16
    //   1794: aload 24
    //   1796: astore 15
    //   1798: aload 25
    //   1800: astore 21
    //   1802: aload 26
    //   1804: astore 18
    //   1806: aload 27
    //   1808: astore 19
    //   1810: aload 28
    //   1812: astore 20
    //   1814: ldc -94
    //   1816: ldc_w 448
    //   1819: iconst_1
    //   1820: anewarray 4	java/lang/Object
    //   1823: dup
    //   1824: iconst_0
    //   1825: bipush 15
    //   1827: invokestatic 428	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1830: aastore
    //   1831: invokestatic 451	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1834: aload 23
    //   1836: astore 16
    //   1838: aload 24
    //   1840: astore 15
    //   1842: aload 25
    //   1844: astore 21
    //   1846: aload 26
    //   1848: astore 18
    //   1850: aload 27
    //   1852: astore 19
    //   1854: aload 28
    //   1856: astore 20
    //   1858: aload 39
    //   1860: ldc_w 453
    //   1863: ldc_w 455
    //   1866: iload_2
    //   1867: aload 12
    //   1869: invokestatic 457	com/tencent/mm/plugin/appbrand/h/c:b	(Ljava/net/HttpURLConnection;)Lorg/json/JSONObject;
    //   1872: invokeinterface 460 5 0
    //   1877: aload_0
    //   1878: getfield 46	com/tencent/mm/plugin/appbrand/h/c:hyD	Ljava/lang/String;
    //   1881: aload_1
    //   1882: getfield 250	com/tencent/mm/plugin/appbrand/h/d:itj	Ljava/lang/String;
    //   1885: aload_1
    //   1886: getfield 253	com/tencent/mm/plugin/appbrand/h/d:itc	Ljava/lang/String;
    //   1889: aload_1
    //   1890: getfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   1893: aload_1
    //   1894: invokevirtual 294	com/tencent/mm/plugin/appbrand/h/d:getDataSize	()J
    //   1897: lconst_0
    //   1898: iload_2
    //   1899: iconst_1
    //   1900: aload_1
    //   1901: invokevirtual 256	com/tencent/mm/plugin/appbrand/h/d:YQ	()I
    //   1904: invokestatic 261	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   1907: aload_0
    //   1908: aload_1
    //   1909: getfield 185	com/tencent/mm/plugin/appbrand/h/d:hXm	Ljava/lang/String;
    //   1912: aload 12
    //   1914: invokespecial 296	com/tencent/mm/plugin/appbrand/h/c:a	(Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   1917: aload 14
    //   1919: ifnull +8 -> 1927
    //   1922: aload 14
    //   1924: invokevirtual 373	java/io/DataOutputStream:close	()V
    //   1927: aload_0
    //   1928: getfield 44	com/tencent/mm/plugin/appbrand/h/c:isL	Ljava/util/ArrayList;
    //   1931: aload_1
    //   1932: getfield 185	com/tencent/mm/plugin/appbrand/h/d:hXm	Ljava/lang/String;
    //   1935: invokevirtual 192	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   1938: pop
    //   1939: ldc2_w 221
    //   1942: ldc -33
    //   1944: invokestatic 64	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1947: return
    //   1948: astore 12
    //   1950: ldc -94
    //   1952: aload 12
    //   1954: ldc_w 462
    //   1957: iconst_0
    //   1958: anewarray 4	java/lang/Object
    //   1961: invokestatic 466	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1964: goto -37 -> 1927
    //   1967: aload 23
    //   1969: astore 16
    //   1971: aload 24
    //   1973: astore 15
    //   1975: aload 25
    //   1977: astore 21
    //   1979: aload 26
    //   1981: astore 18
    //   1983: aload 27
    //   1985: astore 19
    //   1987: aload 28
    //   1989: astore 20
    //   1991: ldc -94
    //   1993: ldc_w 468
    //   1996: iconst_3
    //   1997: anewarray 4	java/lang/Object
    //   2000: dup
    //   2001: iconst_0
    //   2002: iload 8
    //   2004: invokestatic 428	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2007: aastore
    //   2008: dup
    //   2009: iconst_1
    //   2010: aload_1
    //   2011: getfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   2014: aastore
    //   2015: dup
    //   2016: iconst_2
    //   2017: aload 13
    //   2019: aastore
    //   2020: invokestatic 265	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2023: aload 23
    //   2025: astore 16
    //   2027: aload 24
    //   2029: astore 15
    //   2031: aload 25
    //   2033: astore 21
    //   2035: aload 26
    //   2037: astore 18
    //   2039: aload 27
    //   2041: astore 19
    //   2043: aload 28
    //   2045: astore 20
    //   2047: aload_1
    //   2048: aload 13
    //   2050: putfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   2053: aload 23
    //   2055: astore 16
    //   2057: aload 24
    //   2059: astore 15
    //   2061: aload 25
    //   2063: astore 21
    //   2065: aload 26
    //   2067: astore 18
    //   2069: aload 27
    //   2071: astore 19
    //   2073: aload 28
    //   2075: astore 20
    //   2077: aload_1
    //   2078: iload 8
    //   2080: iconst_1
    //   2081: isub
    //   2082: putfield 441	com/tencent/mm/plugin/appbrand/h/d:itg	I
    //   2085: aload 23
    //   2087: astore 16
    //   2089: aload 24
    //   2091: astore 15
    //   2093: aload 25
    //   2095: astore 21
    //   2097: aload 26
    //   2099: astore 18
    //   2101: aload 27
    //   2103: astore 19
    //   2105: aload 28
    //   2107: astore 20
    //   2109: ldc -94
    //   2111: ldc_w 470
    //   2114: iconst_1
    //   2115: anewarray 4	java/lang/Object
    //   2118: dup
    //   2119: iconst_0
    //   2120: aload_1
    //   2121: getfield 441	com/tencent/mm/plugin/appbrand/h/d:itg	I
    //   2124: invokestatic 428	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2127: aastore
    //   2128: invokestatic 265	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2131: aload 23
    //   2133: astore 16
    //   2135: aload 24
    //   2137: astore 15
    //   2139: aload 25
    //   2141: astore 21
    //   2143: aload 26
    //   2145: astore 18
    //   2147: aload 27
    //   2149: astore 19
    //   2151: aload 28
    //   2153: astore 20
    //   2155: aload_0
    //   2156: aload_1
    //   2157: invokevirtual 472	com/tencent/mm/plugin/appbrand/h/c:a	(Lcom/tencent/mm/plugin/appbrand/h/d;)V
    //   2160: aload_0
    //   2161: getfield 46	com/tencent/mm/plugin/appbrand/h/c:hyD	Ljava/lang/String;
    //   2164: aload_1
    //   2165: getfield 250	com/tencent/mm/plugin/appbrand/h/d:itj	Ljava/lang/String;
    //   2168: aload_1
    //   2169: getfield 253	com/tencent/mm/plugin/appbrand/h/d:itc	Ljava/lang/String;
    //   2172: aload_1
    //   2173: getfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   2176: aload_1
    //   2177: invokevirtual 294	com/tencent/mm/plugin/appbrand/h/d:getDataSize	()J
    //   2180: lconst_0
    //   2181: iload_2
    //   2182: iconst_2
    //   2183: aload_1
    //   2184: invokevirtual 256	com/tencent/mm/plugin/appbrand/h/d:YQ	()I
    //   2187: invokestatic 261	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   2190: aload_0
    //   2191: aload_1
    //   2192: getfield 185	com/tencent/mm/plugin/appbrand/h/d:hXm	Ljava/lang/String;
    //   2195: aload 12
    //   2197: invokespecial 296	com/tencent/mm/plugin/appbrand/h/c:a	(Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   2200: aload 14
    //   2202: ifnull +8 -> 2210
    //   2205: aload 14
    //   2207: invokevirtual 373	java/io/DataOutputStream:close	()V
    //   2210: aload_0
    //   2211: getfield 44	com/tencent/mm/plugin/appbrand/h/c:isL	Ljava/util/ArrayList;
    //   2214: aload_1
    //   2215: getfield 185	com/tencent/mm/plugin/appbrand/h/d:hXm	Ljava/lang/String;
    //   2218: invokevirtual 192	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   2221: pop
    //   2222: ldc2_w 221
    //   2225: ldc -33
    //   2227: invokestatic 64	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   2230: return
    //   2231: astore 12
    //   2233: ldc -94
    //   2235: aload 12
    //   2237: ldc_w 462
    //   2240: iconst_0
    //   2241: anewarray 4	java/lang/Object
    //   2244: invokestatic 466	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2247: goto -37 -> 2210
    //   2250: aload 23
    //   2252: astore 16
    //   2254: aload 24
    //   2256: astore 15
    //   2258: aload 25
    //   2260: astore 21
    //   2262: aload 26
    //   2264: astore 18
    //   2266: aload 27
    //   2268: astore 19
    //   2270: aload 28
    //   2272: astore 20
    //   2274: new 474	java/io/ByteArrayOutputStream
    //   2277: dup
    //   2278: invokespecial 475	java/io/ByteArrayOutputStream:<init>	()V
    //   2281: astore 17
    //   2283: aload 23
    //   2285: astore 16
    //   2287: aload 24
    //   2289: astore 15
    //   2291: aload 26
    //   2293: astore 18
    //   2295: aload 27
    //   2297: astore 19
    //   2299: aload 28
    //   2301: astore 20
    //   2303: ldc_w 356
    //   2306: aload 12
    //   2308: invokevirtual 478	java/net/HttpURLConnection:getContentEncoding	()Ljava/lang/String;
    //   2311: invokevirtual 189	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2314: ifeq +261 -> 2575
    //   2317: aload 23
    //   2319: astore 16
    //   2321: aload 24
    //   2323: astore 15
    //   2325: aload 26
    //   2327: astore 18
    //   2329: aload 27
    //   2331: astore 19
    //   2333: aload 28
    //   2335: astore 20
    //   2337: new 480	java/util/zip/GZIPInputStream
    //   2340: dup
    //   2341: aload 12
    //   2343: invokevirtual 484	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   2346: invokespecial 487	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   2349: astore 13
    //   2351: aconst_null
    //   2352: astore 15
    //   2354: aload 13
    //   2356: ifnull +2739 -> 5095
    //   2359: aload 13
    //   2361: astore 16
    //   2363: aload 13
    //   2365: astore 15
    //   2367: aload 13
    //   2369: astore 21
    //   2371: aload 13
    //   2373: astore 18
    //   2375: aload 13
    //   2377: astore 19
    //   2379: aload 13
    //   2381: astore 20
    //   2383: sipush 1024
    //   2386: newarray <illegal type>
    //   2388: astore 22
    //   2390: iconst_0
    //   2391: istore_3
    //   2392: iload_3
    //   2393: istore 4
    //   2395: iload_3
    //   2396: istore 5
    //   2398: iload_3
    //   2399: istore 6
    //   2401: iload_3
    //   2402: istore 7
    //   2404: iload_3
    //   2405: istore 8
    //   2407: iload_3
    //   2408: istore 9
    //   2410: aload 13
    //   2412: aload 22
    //   2414: invokevirtual 491	java/io/InputStream:read	([B)I
    //   2417: istore 10
    //   2419: iload 10
    //   2421: iconst_m1
    //   2422: if_icmpeq +575 -> 2997
    //   2425: iload_3
    //   2426: istore 4
    //   2428: iload_3
    //   2429: istore 5
    //   2431: iload_3
    //   2432: istore 6
    //   2434: iload_3
    //   2435: istore 7
    //   2437: iload_3
    //   2438: istore 8
    //   2440: iload_3
    //   2441: istore 9
    //   2443: aload_0
    //   2444: getfield 46	com/tencent/mm/plugin/appbrand/h/c:hyD	Ljava/lang/String;
    //   2447: invokestatic 495	com/tencent/mm/plugin/appbrand/a:nI	(Ljava/lang/String;)Lcom/tencent/mm/plugin/appbrand/e;
    //   2450: astore 15
    //   2452: aload 15
    //   2454: ifnonnull +376 -> 2830
    //   2457: iconst_1
    //   2458: istore 4
    //   2460: iload 4
    //   2462: ifeq +499 -> 2961
    //   2465: iload_3
    //   2466: istore 4
    //   2468: iload_3
    //   2469: istore 5
    //   2471: iload_3
    //   2472: istore 6
    //   2474: iload_3
    //   2475: istore 7
    //   2477: iload_3
    //   2478: istore 8
    //   2480: iload_3
    //   2481: istore 9
    //   2483: aload 39
    //   2485: ldc_w 497
    //   2488: invokeinterface 247 2 0
    //   2493: aload_0
    //   2494: getfield 46	com/tencent/mm/plugin/appbrand/h/c:hyD	Ljava/lang/String;
    //   2497: aload_1
    //   2498: getfield 250	com/tencent/mm/plugin/appbrand/h/d:itj	Ljava/lang/String;
    //   2501: aload_1
    //   2502: getfield 253	com/tencent/mm/plugin/appbrand/h/d:itc	Ljava/lang/String;
    //   2505: aload_1
    //   2506: getfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   2509: aload_1
    //   2510: invokevirtual 294	com/tencent/mm/plugin/appbrand/h/d:getDataSize	()J
    //   2513: iload_3
    //   2514: i2l
    //   2515: iload_2
    //   2516: iconst_2
    //   2517: aload_1
    //   2518: invokevirtual 256	com/tencent/mm/plugin/appbrand/h/d:YQ	()I
    //   2521: invokestatic 261	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   2524: aload_0
    //   2525: aload_1
    //   2526: getfield 185	com/tencent/mm/plugin/appbrand/h/d:hXm	Ljava/lang/String;
    //   2529: aload 12
    //   2531: invokespecial 296	com/tencent/mm/plugin/appbrand/h/c:a	(Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   2534: aload 13
    //   2536: ifnull +8 -> 2544
    //   2539: aload 13
    //   2541: invokevirtual 370	java/io/InputStream:close	()V
    //   2544: aload 14
    //   2546: ifnull +8 -> 2554
    //   2549: aload 14
    //   2551: invokevirtual 373	java/io/DataOutputStream:close	()V
    //   2554: aload_0
    //   2555: getfield 44	com/tencent/mm/plugin/appbrand/h/c:isL	Ljava/util/ArrayList;
    //   2558: aload_1
    //   2559: getfield 185	com/tencent/mm/plugin/appbrand/h/d:hXm	Ljava/lang/String;
    //   2562: invokevirtual 192	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   2565: pop
    //   2566: ldc2_w 221
    //   2569: ldc -33
    //   2571: invokestatic 64	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   2574: return
    //   2575: aload 23
    //   2577: astore 16
    //   2579: aload 24
    //   2581: astore 15
    //   2583: aload 26
    //   2585: astore 18
    //   2587: aload 27
    //   2589: astore 19
    //   2591: aload 28
    //   2593: astore 20
    //   2595: aload 12
    //   2597: invokevirtual 484	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   2600: astore 13
    //   2602: goto -251 -> 2351
    //   2605: astore 13
    //   2607: aload 23
    //   2609: astore 16
    //   2611: aload 24
    //   2613: astore 15
    //   2615: aload 25
    //   2617: astore 21
    //   2619: aload 26
    //   2621: astore 18
    //   2623: aload 27
    //   2625: astore 19
    //   2627: aload 28
    //   2629: astore 20
    //   2631: ldc -94
    //   2633: ldc_w 499
    //   2636: iconst_1
    //   2637: anewarray 4	java/lang/Object
    //   2640: dup
    //   2641: iconst_0
    //   2642: aload 13
    //   2644: invokevirtual 500	java/lang/Exception:toString	()Ljava/lang/String;
    //   2647: aastore
    //   2648: invokestatic 176	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2651: aload 23
    //   2653: astore 16
    //   2655: aload 24
    //   2657: astore 15
    //   2659: aload 26
    //   2661: astore 18
    //   2663: aload 27
    //   2665: astore 19
    //   2667: aload 28
    //   2669: astore 20
    //   2671: ldc_w 356
    //   2674: aload 12
    //   2676: invokevirtual 478	java/net/HttpURLConnection:getContentEncoding	()Ljava/lang/String;
    //   2679: invokevirtual 189	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2682: ifeq +40 -> 2722
    //   2685: aload 23
    //   2687: astore 16
    //   2689: aload 24
    //   2691: astore 15
    //   2693: aload 26
    //   2695: astore 18
    //   2697: aload 27
    //   2699: astore 19
    //   2701: aload 28
    //   2703: astore 20
    //   2705: new 480	java/util/zip/GZIPInputStream
    //   2708: dup
    //   2709: aload 12
    //   2711: invokevirtual 503	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   2714: invokespecial 487	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   2717: astore 13
    //   2719: goto -368 -> 2351
    //   2722: aload 23
    //   2724: astore 16
    //   2726: aload 24
    //   2728: astore 15
    //   2730: aload 26
    //   2732: astore 18
    //   2734: aload 27
    //   2736: astore 19
    //   2738: aload 28
    //   2740: astore 20
    //   2742: aload 12
    //   2744: invokevirtual 503	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   2747: astore 13
    //   2749: goto -398 -> 2351
    //   2752: astore 13
    //   2754: aload 23
    //   2756: astore 16
    //   2758: aload 24
    //   2760: astore 15
    //   2762: aload 25
    //   2764: astore 21
    //   2766: aload 26
    //   2768: astore 18
    //   2770: aload 27
    //   2772: astore 19
    //   2774: aload 28
    //   2776: astore 20
    //   2778: ldc -94
    //   2780: ldc_w 505
    //   2783: iconst_1
    //   2784: anewarray 4	java/lang/Object
    //   2787: dup
    //   2788: iconst_0
    //   2789: aload 13
    //   2791: invokevirtual 500	java/lang/Exception:toString	()Ljava/lang/String;
    //   2794: aastore
    //   2795: invokestatic 176	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2798: aload 22
    //   2800: astore 13
    //   2802: goto -451 -> 2351
    //   2805: astore 15
    //   2807: iconst_0
    //   2808: istore 4
    //   2810: aload 12
    //   2812: astore 13
    //   2814: iload_2
    //   2815: istore_3
    //   2816: aload 15
    //   2818: astore 12
    //   2820: iload 4
    //   2822: istore_2
    //   2823: aload 16
    //   2825: astore 15
    //   2827: goto -1673 -> 1154
    //   2830: iload_3
    //   2831: istore 4
    //   2833: iload_3
    //   2834: istore 5
    //   2836: iload_3
    //   2837: istore 6
    //   2839: iload_3
    //   2840: istore 7
    //   2842: iload_3
    //   2843: istore 8
    //   2845: iload_3
    //   2846: istore 9
    //   2848: getstatic 509	com/tencent/mm/plugin/appbrand/h/c$2:hKS	[I
    //   2851: aload 15
    //   2853: getfield 515	com/tencent/mm/plugin/appbrand/e:hyU	Lcom/tencent/mm/plugin/appbrand/b/b;
    //   2856: getfield 521	com/tencent/mm/plugin/appbrand/b/b:hKO	Lcom/tencent/mm/plugin/appbrand/b/c;
    //   2859: invokevirtual 527	com/tencent/mm/plugin/appbrand/b/c:Tc	()Lcom/tencent/mm/plugin/appbrand/b/a;
    //   2862: invokevirtual 532	com/tencent/mm/plugin/appbrand/b/a:ordinal	()I
    //   2865: iaload
    //   2866: istore 11
    //   2868: iload 11
    //   2870: tableswitch	default:+22->2892, 1:+28->2898, 2:+28->2898
    //   2892: iconst_0
    //   2893: istore 4
    //   2895: goto -435 -> 2460
    //   2898: iconst_1
    //   2899: istore 4
    //   2901: goto -441 -> 2460
    //   2904: astore 12
    //   2906: ldc -94
    //   2908: aload 12
    //   2910: ldc_w 462
    //   2913: iconst_0
    //   2914: anewarray 4	java/lang/Object
    //   2917: invokestatic 466	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2920: goto -376 -> 2544
    //   2923: astore 12
    //   2925: ldc -94
    //   2927: aload 12
    //   2929: ldc_w 462
    //   2932: iconst_0
    //   2933: anewarray 4	java/lang/Object
    //   2936: invokestatic 466	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2939: goto -395 -> 2544
    //   2942: astore 12
    //   2944: ldc -94
    //   2946: aload 12
    //   2948: ldc_w 462
    //   2951: iconst_0
    //   2952: anewarray 4	java/lang/Object
    //   2955: invokestatic 466	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2958: goto -404 -> 2554
    //   2961: iload_3
    //   2962: istore 4
    //   2964: iload_3
    //   2965: istore 5
    //   2967: iload_3
    //   2968: istore 6
    //   2970: iload_3
    //   2971: istore 7
    //   2973: iload_3
    //   2974: istore 8
    //   2976: iload_3
    //   2977: istore 9
    //   2979: aload 17
    //   2981: aload 22
    //   2983: iconst_0
    //   2984: iload 10
    //   2986: invokevirtual 535	java/io/ByteArrayOutputStream:write	([BII)V
    //   2989: iload_3
    //   2990: iload 10
    //   2992: iadd
    //   2993: istore_3
    //   2994: goto -602 -> 2392
    //   2997: iload_3
    //   2998: istore 4
    //   3000: iload_3
    //   3001: istore 5
    //   3003: iload_3
    //   3004: istore 6
    //   3006: iload_3
    //   3007: istore 7
    //   3009: iload_3
    //   3010: istore 8
    //   3012: iload_3
    //   3013: istore 9
    //   3015: aload 17
    //   3017: invokevirtual 536	java/io/ByteArrayOutputStream:flush	()V
    //   3020: iload_3
    //   3021: istore 4
    //   3023: iload_3
    //   3024: istore 5
    //   3026: iload_3
    //   3027: istore 6
    //   3029: iload_3
    //   3030: istore 7
    //   3032: iload_3
    //   3033: istore 8
    //   3035: iload_3
    //   3036: istore 9
    //   3038: aload 13
    //   3040: invokevirtual 370	java/io/InputStream:close	()V
    //   3043: iload_3
    //   3044: istore 4
    //   3046: iload_3
    //   3047: istore 5
    //   3049: iload_3
    //   3050: istore 6
    //   3052: iload_3
    //   3053: istore 7
    //   3055: iload_3
    //   3056: istore 8
    //   3058: iload_3
    //   3059: istore 9
    //   3061: ldc_w 538
    //   3064: aload_1
    //   3065: getfield 541	com/tencent/mm/plugin/appbrand/h/d:ith	Ljava/lang/String;
    //   3068: invokevirtual 189	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   3071: ifeq +197 -> 3268
    //   3074: iload_3
    //   3075: istore 4
    //   3077: iload_3
    //   3078: istore 5
    //   3080: iload_3
    //   3081: istore 6
    //   3083: iload_3
    //   3084: istore 7
    //   3086: iload_3
    //   3087: istore 8
    //   3089: iload_3
    //   3090: istore 9
    //   3092: aload 17
    //   3094: invokevirtual 545	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   3097: invokestatic 551	java/nio/ByteBuffer:wrap	([B)Ljava/nio/ByteBuffer;
    //   3100: astore 15
    //   3102: iload_3
    //   3103: istore 4
    //   3105: iload_3
    //   3106: istore 5
    //   3108: iload_3
    //   3109: istore 6
    //   3111: iload_3
    //   3112: istore 7
    //   3114: iload_3
    //   3115: istore 8
    //   3117: iload_3
    //   3118: istore 9
    //   3120: ldc -94
    //   3122: ldc_w 553
    //   3125: iconst_2
    //   3126: anewarray 4	java/lang/Object
    //   3129: dup
    //   3130: iconst_0
    //   3131: aload_1
    //   3132: getfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   3135: aastore
    //   3136: dup
    //   3137: iconst_1
    //   3138: aload 17
    //   3140: invokevirtual 554	java/io/ByteArrayOutputStream:size	()I
    //   3143: invokestatic 428	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   3146: aastore
    //   3147: invokestatic 557	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3150: iload_3
    //   3151: istore 4
    //   3153: iload_3
    //   3154: istore 5
    //   3156: iload_3
    //   3157: istore 6
    //   3159: iload_3
    //   3160: istore 7
    //   3162: iload_3
    //   3163: istore 8
    //   3165: iload_3
    //   3166: istore 9
    //   3168: aload 39
    //   3170: ldc_w 453
    //   3173: aload 15
    //   3175: iload_2
    //   3176: aload 12
    //   3178: invokestatic 457	com/tencent/mm/plugin/appbrand/h/c:b	(Ljava/net/HttpURLConnection;)Lorg/json/JSONObject;
    //   3181: invokeinterface 460 5 0
    //   3186: aload_0
    //   3187: getfield 46	com/tencent/mm/plugin/appbrand/h/c:hyD	Ljava/lang/String;
    //   3190: aload_1
    //   3191: getfield 250	com/tencent/mm/plugin/appbrand/h/d:itj	Ljava/lang/String;
    //   3194: aload_1
    //   3195: getfield 253	com/tencent/mm/plugin/appbrand/h/d:itc	Ljava/lang/String;
    //   3198: aload_1
    //   3199: getfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   3202: aload_1
    //   3203: invokevirtual 294	com/tencent/mm/plugin/appbrand/h/d:getDataSize	()J
    //   3206: iload_3
    //   3207: i2l
    //   3208: iload_2
    //   3209: iconst_1
    //   3210: aload_1
    //   3211: invokevirtual 256	com/tencent/mm/plugin/appbrand/h/d:YQ	()I
    //   3214: invokestatic 261	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   3217: aload_0
    //   3218: aload_1
    //   3219: getfield 185	com/tencent/mm/plugin/appbrand/h/d:hXm	Ljava/lang/String;
    //   3222: aload 12
    //   3224: invokespecial 296	com/tencent/mm/plugin/appbrand/h/c:a	(Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   3227: aload 13
    //   3229: ifnull +8 -> 3237
    //   3232: aload 13
    //   3234: invokevirtual 370	java/io/InputStream:close	()V
    //   3237: aload 14
    //   3239: ifnull +8 -> 3247
    //   3242: aload 14
    //   3244: invokevirtual 373	java/io/DataOutputStream:close	()V
    //   3247: aload_0
    //   3248: getfield 44	com/tencent/mm/plugin/appbrand/h/c:isL	Ljava/util/ArrayList;
    //   3251: aload_1
    //   3252: getfield 185	com/tencent/mm/plugin/appbrand/h/d:hXm	Ljava/lang/String;
    //   3255: invokevirtual 192	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   3258: pop
    //   3259: ldc2_w 221
    //   3262: ldc -33
    //   3264: invokestatic 64	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   3267: return
    //   3268: iload_3
    //   3269: istore 4
    //   3271: iload_3
    //   3272: istore 5
    //   3274: iload_3
    //   3275: istore 6
    //   3277: iload_3
    //   3278: istore 7
    //   3280: iload_3
    //   3281: istore 8
    //   3283: iload_3
    //   3284: istore 9
    //   3286: aload 17
    //   3288: ldc_w 559
    //   3291: invokevirtual 562	java/io/ByteArrayOutputStream:toString	(Ljava/lang/String;)Ljava/lang/String;
    //   3294: invokestatic 567	com/tencent/mm/plugin/appbrand/o/d:sz	(Ljava/lang/String;)Ljava/lang/String;
    //   3297: astore 15
    //   3299: goto -197 -> 3102
    //   3302: astore 12
    //   3304: ldc -94
    //   3306: aload 12
    //   3308: ldc_w 462
    //   3311: iconst_0
    //   3312: anewarray 4	java/lang/Object
    //   3315: invokestatic 466	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3318: goto -81 -> 3237
    //   3321: astore 12
    //   3323: ldc -94
    //   3325: aload 12
    //   3327: ldc_w 462
    //   3330: iconst_0
    //   3331: anewarray 4	java/lang/Object
    //   3334: invokestatic 466	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3337: goto -100 -> 3237
    //   3340: astore 12
    //   3342: ldc -94
    //   3344: aload 12
    //   3346: ldc_w 462
    //   3349: iconst_0
    //   3350: anewarray 4	java/lang/Object
    //   3353: invokestatic 466	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3356: goto -109 -> 3247
    //   3359: astore 12
    //   3361: ldc -94
    //   3363: aload 12
    //   3365: ldc_w 462
    //   3368: iconst_0
    //   3369: anewarray 4	java/lang/Object
    //   3372: invokestatic 466	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3375: goto -2121 -> 1254
    //   3378: astore 12
    //   3380: ldc -94
    //   3382: aload 12
    //   3384: ldc_w 462
    //   3387: iconst_0
    //   3388: anewarray 4	java/lang/Object
    //   3391: invokestatic 466	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3394: goto -2140 -> 1254
    //   3397: astore 12
    //   3399: ldc -94
    //   3401: aload 12
    //   3403: ldc_w 462
    //   3406: iconst_0
    //   3407: anewarray 4	java/lang/Object
    //   3410: invokestatic 466	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3413: goto -2149 -> 1264
    //   3416: astore 16
    //   3418: aconst_null
    //   3419: astore 12
    //   3421: iconst_0
    //   3422: istore_2
    //   3423: aload 30
    //   3425: astore 18
    //   3427: iload 5
    //   3429: istore_3
    //   3430: iload_2
    //   3431: istore 4
    //   3433: aload 17
    //   3435: astore 14
    //   3437: aload 18
    //   3439: astore 15
    //   3441: aload 12
    //   3443: astore 13
    //   3445: getstatic 271	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   3448: ldc2_w 272
    //   3451: ldc2_w 568
    //   3454: lconst_1
    //   3455: iconst_0
    //   3456: invokevirtual 276	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   3459: iload 5
    //   3461: istore_3
    //   3462: iload_2
    //   3463: istore 4
    //   3465: aload 17
    //   3467: astore 14
    //   3469: aload 18
    //   3471: astore 15
    //   3473: aload 12
    //   3475: astore 13
    //   3477: ldc -94
    //   3479: ldc_w 571
    //   3482: iconst_2
    //   3483: anewarray 4	java/lang/Object
    //   3486: dup
    //   3487: iconst_0
    //   3488: aload_1
    //   3489: getfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   3492: aastore
    //   3493: dup
    //   3494: iconst_1
    //   3495: aload 16
    //   3497: invokevirtual 572	javax/net/ssl/SSLHandshakeException:toString	()Ljava/lang/String;
    //   3500: aastore
    //   3501: invokestatic 176	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3504: iload 5
    //   3506: istore_3
    //   3507: iload_2
    //   3508: istore 4
    //   3510: aload 17
    //   3512: astore 14
    //   3514: aload 18
    //   3516: astore 15
    //   3518: aload 12
    //   3520: astore 13
    //   3522: aload 39
    //   3524: ldc_w 574
    //   3527: invokeinterface 247 2 0
    //   3532: aload_0
    //   3533: getfield 46	com/tencent/mm/plugin/appbrand/h/c:hyD	Ljava/lang/String;
    //   3536: aload_1
    //   3537: getfield 250	com/tencent/mm/plugin/appbrand/h/d:itj	Ljava/lang/String;
    //   3540: aload_1
    //   3541: getfield 253	com/tencent/mm/plugin/appbrand/h/d:itc	Ljava/lang/String;
    //   3544: aload_1
    //   3545: getfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   3548: aload_1
    //   3549: invokevirtual 294	com/tencent/mm/plugin/appbrand/h/d:getDataSize	()J
    //   3552: iload 5
    //   3554: i2l
    //   3555: iload_2
    //   3556: iconst_2
    //   3557: aload_1
    //   3558: invokevirtual 256	com/tencent/mm/plugin/appbrand/h/d:YQ	()I
    //   3561: invokestatic 261	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   3564: aload_0
    //   3565: aload_1
    //   3566: getfield 185	com/tencent/mm/plugin/appbrand/h/d:hXm	Ljava/lang/String;
    //   3569: aload 12
    //   3571: invokespecial 296	com/tencent/mm/plugin/appbrand/h/c:a	(Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   3574: aload 18
    //   3576: ifnull +8 -> 3584
    //   3579: aload 18
    //   3581: invokevirtual 370	java/io/InputStream:close	()V
    //   3584: aload 17
    //   3586: ifnull +8 -> 3594
    //   3589: aload 17
    //   3591: invokevirtual 373	java/io/DataOutputStream:close	()V
    //   3594: aload_0
    //   3595: getfield 44	com/tencent/mm/plugin/appbrand/h/c:isL	Ljava/util/ArrayList;
    //   3598: aload_1
    //   3599: getfield 185	com/tencent/mm/plugin/appbrand/h/d:hXm	Ljava/lang/String;
    //   3602: invokevirtual 192	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   3605: pop
    //   3606: ldc2_w 221
    //   3609: ldc -33
    //   3611: invokestatic 64	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   3614: return
    //   3615: astore 12
    //   3617: ldc -94
    //   3619: aload 12
    //   3621: ldc_w 462
    //   3624: iconst_0
    //   3625: anewarray 4	java/lang/Object
    //   3628: invokestatic 466	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3631: goto -47 -> 3584
    //   3634: astore 12
    //   3636: ldc -94
    //   3638: aload 12
    //   3640: ldc_w 462
    //   3643: iconst_0
    //   3644: anewarray 4	java/lang/Object
    //   3647: invokestatic 466	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3650: goto -66 -> 3584
    //   3653: astore 12
    //   3655: ldc -94
    //   3657: aload 12
    //   3659: ldc_w 462
    //   3662: iconst_0
    //   3663: anewarray 4	java/lang/Object
    //   3666: invokestatic 466	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3669: goto -75 -> 3594
    //   3672: astore 16
    //   3674: aconst_null
    //   3675: astore 12
    //   3677: iconst_0
    //   3678: istore_2
    //   3679: aload 31
    //   3681: astore 18
    //   3683: aload 15
    //   3685: astore 17
    //   3687: iload_3
    //   3688: istore 5
    //   3690: iload 5
    //   3692: istore_3
    //   3693: iload_2
    //   3694: istore 4
    //   3696: aload 17
    //   3698: astore 14
    //   3700: aload 18
    //   3702: astore 15
    //   3704: aload 12
    //   3706: astore 13
    //   3708: getstatic 271	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   3711: ldc2_w 272
    //   3714: ldc2_w 575
    //   3717: lconst_1
    //   3718: iconst_0
    //   3719: invokevirtual 276	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   3722: iload 5
    //   3724: istore_3
    //   3725: iload_2
    //   3726: istore 4
    //   3728: aload 17
    //   3730: astore 14
    //   3732: aload 18
    //   3734: astore 15
    //   3736: aload 12
    //   3738: astore 13
    //   3740: ldc -94
    //   3742: ldc_w 578
    //   3745: iconst_2
    //   3746: anewarray 4	java/lang/Object
    //   3749: dup
    //   3750: iconst_0
    //   3751: aload_1
    //   3752: getfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   3755: aastore
    //   3756: dup
    //   3757: iconst_1
    //   3758: aload 16
    //   3760: invokevirtual 579	java/io/FileNotFoundException:toString	()Ljava/lang/String;
    //   3763: aastore
    //   3764: invokestatic 176	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3767: iload 5
    //   3769: istore_3
    //   3770: iload_2
    //   3771: istore 4
    //   3773: aload 17
    //   3775: astore 14
    //   3777: aload 18
    //   3779: astore 15
    //   3781: aload 12
    //   3783: astore 13
    //   3785: aload 39
    //   3787: ldc_w 581
    //   3790: invokeinterface 247 2 0
    //   3795: aload_0
    //   3796: getfield 46	com/tencent/mm/plugin/appbrand/h/c:hyD	Ljava/lang/String;
    //   3799: aload_1
    //   3800: getfield 250	com/tencent/mm/plugin/appbrand/h/d:itj	Ljava/lang/String;
    //   3803: aload_1
    //   3804: getfield 253	com/tencent/mm/plugin/appbrand/h/d:itc	Ljava/lang/String;
    //   3807: aload_1
    //   3808: getfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   3811: aload_1
    //   3812: invokevirtual 294	com/tencent/mm/plugin/appbrand/h/d:getDataSize	()J
    //   3815: iload 5
    //   3817: i2l
    //   3818: iload_2
    //   3819: iconst_2
    //   3820: aload_1
    //   3821: invokevirtual 256	com/tencent/mm/plugin/appbrand/h/d:YQ	()I
    //   3824: invokestatic 261	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   3827: aload_0
    //   3828: aload_1
    //   3829: getfield 185	com/tencent/mm/plugin/appbrand/h/d:hXm	Ljava/lang/String;
    //   3832: aload 12
    //   3834: invokespecial 296	com/tencent/mm/plugin/appbrand/h/c:a	(Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   3837: aload 18
    //   3839: ifnull +8 -> 3847
    //   3842: aload 18
    //   3844: invokevirtual 370	java/io/InputStream:close	()V
    //   3847: aload 17
    //   3849: ifnull +8 -> 3857
    //   3852: aload 17
    //   3854: invokevirtual 373	java/io/DataOutputStream:close	()V
    //   3857: aload_0
    //   3858: getfield 44	com/tencent/mm/plugin/appbrand/h/c:isL	Ljava/util/ArrayList;
    //   3861: aload_1
    //   3862: getfield 185	com/tencent/mm/plugin/appbrand/h/d:hXm	Ljava/lang/String;
    //   3865: invokevirtual 192	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   3868: pop
    //   3869: ldc2_w 221
    //   3872: ldc -33
    //   3874: invokestatic 64	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   3877: return
    //   3878: astore 12
    //   3880: ldc -94
    //   3882: aload 12
    //   3884: ldc_w 462
    //   3887: iconst_0
    //   3888: anewarray 4	java/lang/Object
    //   3891: invokestatic 466	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3894: goto -47 -> 3847
    //   3897: astore 12
    //   3899: ldc -94
    //   3901: aload 12
    //   3903: ldc_w 462
    //   3906: iconst_0
    //   3907: anewarray 4	java/lang/Object
    //   3910: invokestatic 466	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3913: goto -66 -> 3847
    //   3916: astore 12
    //   3918: ldc -94
    //   3920: aload 12
    //   3922: ldc_w 462
    //   3925: iconst_0
    //   3926: anewarray 4	java/lang/Object
    //   3929: invokestatic 466	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3932: goto -75 -> 3857
    //   3935: astore 16
    //   3937: aconst_null
    //   3938: astore 12
    //   3940: iconst_0
    //   3941: istore_2
    //   3942: aload 32
    //   3944: astore 18
    //   3946: aload 19
    //   3948: astore 17
    //   3950: iload 4
    //   3952: istore 5
    //   3954: iload 5
    //   3956: istore_3
    //   3957: iload_2
    //   3958: istore 4
    //   3960: aload 17
    //   3962: astore 14
    //   3964: aload 18
    //   3966: astore 15
    //   3968: aload 12
    //   3970: astore 13
    //   3972: getstatic 271	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   3975: ldc2_w 272
    //   3978: ldc2_w 582
    //   3981: lconst_1
    //   3982: iconst_0
    //   3983: invokevirtual 276	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   3986: iload 5
    //   3988: istore_3
    //   3989: iload_2
    //   3990: istore 4
    //   3992: aload 17
    //   3994: astore 14
    //   3996: aload 18
    //   3998: astore 15
    //   4000: aload 12
    //   4002: astore 13
    //   4004: ldc -94
    //   4006: ldc_w 585
    //   4009: iconst_2
    //   4010: anewarray 4	java/lang/Object
    //   4013: dup
    //   4014: iconst_0
    //   4015: aload_1
    //   4016: getfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   4019: aastore
    //   4020: dup
    //   4021: iconst_1
    //   4022: aload 16
    //   4024: invokevirtual 586	java/net/SocketTimeoutException:toString	()Ljava/lang/String;
    //   4027: aastore
    //   4028: invokestatic 176	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4031: iload 5
    //   4033: istore_3
    //   4034: iload_2
    //   4035: istore 4
    //   4037: aload 17
    //   4039: astore 14
    //   4041: aload 18
    //   4043: astore 15
    //   4045: aload 12
    //   4047: astore 13
    //   4049: aload 39
    //   4051: new 137	java/lang/StringBuilder
    //   4054: dup
    //   4055: ldc_w 588
    //   4058: invokespecial 317	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   4061: aload 16
    //   4063: invokevirtual 591	java/net/SocketTimeoutException:getMessage	()Ljava/lang/String;
    //   4066: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4069: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4072: invokeinterface 247 2 0
    //   4077: aload_0
    //   4078: getfield 46	com/tencent/mm/plugin/appbrand/h/c:hyD	Ljava/lang/String;
    //   4081: aload_1
    //   4082: getfield 250	com/tencent/mm/plugin/appbrand/h/d:itj	Ljava/lang/String;
    //   4085: aload_1
    //   4086: getfield 253	com/tencent/mm/plugin/appbrand/h/d:itc	Ljava/lang/String;
    //   4089: aload_1
    //   4090: getfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   4093: aload_1
    //   4094: invokevirtual 294	com/tencent/mm/plugin/appbrand/h/d:getDataSize	()J
    //   4097: iload 5
    //   4099: i2l
    //   4100: iload_2
    //   4101: iconst_2
    //   4102: aload_1
    //   4103: invokevirtual 256	com/tencent/mm/plugin/appbrand/h/d:YQ	()I
    //   4106: invokestatic 261	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   4109: aload_0
    //   4110: aload_1
    //   4111: getfield 185	com/tencent/mm/plugin/appbrand/h/d:hXm	Ljava/lang/String;
    //   4114: aload 12
    //   4116: invokespecial 296	com/tencent/mm/plugin/appbrand/h/c:a	(Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   4119: aload 18
    //   4121: ifnull +8 -> 4129
    //   4124: aload 18
    //   4126: invokevirtual 370	java/io/InputStream:close	()V
    //   4129: aload 17
    //   4131: ifnull +8 -> 4139
    //   4134: aload 17
    //   4136: invokevirtual 373	java/io/DataOutputStream:close	()V
    //   4139: aload_0
    //   4140: getfield 44	com/tencent/mm/plugin/appbrand/h/c:isL	Ljava/util/ArrayList;
    //   4143: aload_1
    //   4144: getfield 185	com/tencent/mm/plugin/appbrand/h/d:hXm	Ljava/lang/String;
    //   4147: invokevirtual 192	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   4150: pop
    //   4151: ldc2_w 221
    //   4154: ldc -33
    //   4156: invokestatic 64	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   4159: return
    //   4160: astore 12
    //   4162: ldc -94
    //   4164: aload 12
    //   4166: ldc_w 462
    //   4169: iconst_0
    //   4170: anewarray 4	java/lang/Object
    //   4173: invokestatic 466	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4176: goto -47 -> 4129
    //   4179: astore 12
    //   4181: ldc -94
    //   4183: aload 12
    //   4185: ldc_w 462
    //   4188: iconst_0
    //   4189: anewarray 4	java/lang/Object
    //   4192: invokestatic 466	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4195: goto -66 -> 4129
    //   4198: astore 12
    //   4200: ldc -94
    //   4202: aload 12
    //   4204: ldc_w 462
    //   4207: iconst_0
    //   4208: anewarray 4	java/lang/Object
    //   4211: invokestatic 466	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4214: goto -75 -> 4139
    //   4217: astore 16
    //   4219: aconst_null
    //   4220: astore 12
    //   4222: iconst_0
    //   4223: istore_2
    //   4224: aload 33
    //   4226: astore 18
    //   4228: aload 20
    //   4230: astore 17
    //   4232: iload 6
    //   4234: istore 5
    //   4236: iload 5
    //   4238: istore_3
    //   4239: iload_2
    //   4240: istore 4
    //   4242: aload 17
    //   4244: astore 14
    //   4246: aload 18
    //   4248: astore 15
    //   4250: aload 12
    //   4252: astore 13
    //   4254: getstatic 271	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   4257: ldc2_w 272
    //   4260: ldc2_w 592
    //   4263: lconst_1
    //   4264: iconst_0
    //   4265: invokevirtual 276	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   4268: iload 5
    //   4270: istore_3
    //   4271: iload_2
    //   4272: istore 4
    //   4274: aload 17
    //   4276: astore 14
    //   4278: aload 18
    //   4280: astore 15
    //   4282: aload 12
    //   4284: astore 13
    //   4286: ldc -94
    //   4288: ldc_w 595
    //   4291: iconst_2
    //   4292: anewarray 4	java/lang/Object
    //   4295: dup
    //   4296: iconst_0
    //   4297: aload_1
    //   4298: getfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   4301: aastore
    //   4302: dup
    //   4303: iconst_1
    //   4304: aload 16
    //   4306: invokevirtual 500	java/lang/Exception:toString	()Ljava/lang/String;
    //   4309: aastore
    //   4310: invokestatic 176	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4313: iload 5
    //   4315: istore_3
    //   4316: iload_2
    //   4317: istore 4
    //   4319: aload 17
    //   4321: astore 14
    //   4323: aload 18
    //   4325: astore 15
    //   4327: aload 12
    //   4329: astore 13
    //   4331: aload 39
    //   4333: new 137	java/lang/StringBuilder
    //   4336: dup
    //   4337: ldc_w 588
    //   4340: invokespecial 317	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   4343: aload 16
    //   4345: invokevirtual 596	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   4348: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4351: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4354: invokeinterface 247 2 0
    //   4359: aload_0
    //   4360: getfield 46	com/tencent/mm/plugin/appbrand/h/c:hyD	Ljava/lang/String;
    //   4363: aload_1
    //   4364: getfield 250	com/tencent/mm/plugin/appbrand/h/d:itj	Ljava/lang/String;
    //   4367: aload_1
    //   4368: getfield 253	com/tencent/mm/plugin/appbrand/h/d:itc	Ljava/lang/String;
    //   4371: aload_1
    //   4372: getfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   4375: aload_1
    //   4376: invokevirtual 294	com/tencent/mm/plugin/appbrand/h/d:getDataSize	()J
    //   4379: iload 5
    //   4381: i2l
    //   4382: iload_2
    //   4383: iconst_2
    //   4384: aload_1
    //   4385: invokevirtual 256	com/tencent/mm/plugin/appbrand/h/d:YQ	()I
    //   4388: invokestatic 261	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   4391: aload_0
    //   4392: aload_1
    //   4393: getfield 185	com/tencent/mm/plugin/appbrand/h/d:hXm	Ljava/lang/String;
    //   4396: aload 12
    //   4398: invokespecial 296	com/tencent/mm/plugin/appbrand/h/c:a	(Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   4401: aload 18
    //   4403: ifnull +8 -> 4411
    //   4406: aload 18
    //   4408: invokevirtual 370	java/io/InputStream:close	()V
    //   4411: aload 17
    //   4413: ifnull +8 -> 4421
    //   4416: aload 17
    //   4418: invokevirtual 373	java/io/DataOutputStream:close	()V
    //   4421: aload_0
    //   4422: getfield 44	com/tencent/mm/plugin/appbrand/h/c:isL	Ljava/util/ArrayList;
    //   4425: aload_1
    //   4426: getfield 185	com/tencent/mm/plugin/appbrand/h/d:hXm	Ljava/lang/String;
    //   4429: invokevirtual 192	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   4432: pop
    //   4433: ldc2_w 221
    //   4436: ldc -33
    //   4438: invokestatic 64	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   4441: return
    //   4442: astore 12
    //   4444: ldc -94
    //   4446: aload 12
    //   4448: ldc_w 462
    //   4451: iconst_0
    //   4452: anewarray 4	java/lang/Object
    //   4455: invokestatic 466	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4458: goto -47 -> 4411
    //   4461: astore 12
    //   4463: ldc -94
    //   4465: aload 12
    //   4467: ldc_w 462
    //   4470: iconst_0
    //   4471: anewarray 4	java/lang/Object
    //   4474: invokestatic 466	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4477: goto -66 -> 4411
    //   4480: astore 12
    //   4482: ldc -94
    //   4484: aload 12
    //   4486: ldc_w 462
    //   4489: iconst_0
    //   4490: anewarray 4	java/lang/Object
    //   4493: invokestatic 466	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4496: goto -75 -> 4421
    //   4499: astore 12
    //   4501: iconst_0
    //   4502: istore_2
    //   4503: aconst_null
    //   4504: astore 13
    //   4506: aload 21
    //   4508: astore 15
    //   4510: aload 16
    //   4512: astore 14
    //   4514: iload 7
    //   4516: istore_3
    //   4517: aload_0
    //   4518: getfield 46	com/tencent/mm/plugin/appbrand/h/c:hyD	Ljava/lang/String;
    //   4521: aload_1
    //   4522: getfield 250	com/tencent/mm/plugin/appbrand/h/d:itj	Ljava/lang/String;
    //   4525: aload_1
    //   4526: getfield 253	com/tencent/mm/plugin/appbrand/h/d:itc	Ljava/lang/String;
    //   4529: aload_1
    //   4530: getfield 237	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   4533: aload_1
    //   4534: invokevirtual 294	com/tencent/mm/plugin/appbrand/h/d:getDataSize	()J
    //   4537: iload_3
    //   4538: i2l
    //   4539: iload_2
    //   4540: iconst_2
    //   4541: aload_1
    //   4542: invokevirtual 256	com/tencent/mm/plugin/appbrand/h/d:YQ	()I
    //   4545: invokestatic 261	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   4548: aload_0
    //   4549: aload_1
    //   4550: getfield 185	com/tencent/mm/plugin/appbrand/h/d:hXm	Ljava/lang/String;
    //   4553: aload 13
    //   4555: invokespecial 296	com/tencent/mm/plugin/appbrand/h/c:a	(Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   4558: aload 15
    //   4560: ifnull +8 -> 4568
    //   4563: aload 15
    //   4565: invokevirtual 370	java/io/InputStream:close	()V
    //   4568: aload 14
    //   4570: ifnull +8 -> 4578
    //   4573: aload 14
    //   4575: invokevirtual 373	java/io/DataOutputStream:close	()V
    //   4578: aload_0
    //   4579: getfield 44	com/tencent/mm/plugin/appbrand/h/c:isL	Ljava/util/ArrayList;
    //   4582: aload_1
    //   4583: getfield 185	com/tencent/mm/plugin/appbrand/h/d:hXm	Ljava/lang/String;
    //   4586: invokevirtual 192	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   4589: pop
    //   4590: aload 12
    //   4592: athrow
    //   4593: astore 13
    //   4595: ldc -94
    //   4597: aload 13
    //   4599: ldc_w 462
    //   4602: iconst_0
    //   4603: anewarray 4	java/lang/Object
    //   4606: invokestatic 466	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4609: goto -41 -> 4568
    //   4612: astore 13
    //   4614: ldc -94
    //   4616: aload 13
    //   4618: ldc_w 462
    //   4621: iconst_0
    //   4622: anewarray 4	java/lang/Object
    //   4625: invokestatic 466	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4628: goto -60 -> 4568
    //   4631: astore 13
    //   4633: ldc -94
    //   4635: aload 13
    //   4637: ldc_w 462
    //   4640: iconst_0
    //   4641: anewarray 4	java/lang/Object
    //   4644: invokestatic 466	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4647: goto -69 -> 4578
    //   4650: astore 14
    //   4652: iconst_0
    //   4653: istore_2
    //   4654: aload 12
    //   4656: astore 13
    //   4658: aload 14
    //   4660: astore 12
    //   4662: iload 7
    //   4664: istore_3
    //   4665: aload 15
    //   4667: astore 14
    //   4669: aload 21
    //   4671: astore 15
    //   4673: goto -156 -> 4517
    //   4676: astore 15
    //   4678: iconst_0
    //   4679: istore_2
    //   4680: aload 13
    //   4682: astore 14
    //   4684: aload 12
    //   4686: astore 13
    //   4688: aload 15
    //   4690: astore 12
    //   4692: iload 7
    //   4694: istore_3
    //   4695: aload 21
    //   4697: astore 15
    //   4699: goto -182 -> 4517
    //   4702: astore 16
    //   4704: aload 12
    //   4706: astore 13
    //   4708: aload 16
    //   4710: astore 12
    //   4712: iload 7
    //   4714: istore_3
    //   4715: goto -198 -> 4517
    //   4718: astore 15
    //   4720: iload 4
    //   4722: istore_3
    //   4723: aload 12
    //   4725: astore 16
    //   4727: aload 15
    //   4729: astore 12
    //   4731: aload 13
    //   4733: astore 15
    //   4735: aload 16
    //   4737: astore 13
    //   4739: goto -222 -> 4517
    //   4742: astore 12
    //   4744: iload_2
    //   4745: istore 4
    //   4747: iload_3
    //   4748: istore_2
    //   4749: iload 4
    //   4751: istore_3
    //   4752: goto -235 -> 4517
    //   4755: astore 12
    //   4757: iload 4
    //   4759: istore_2
    //   4760: goto -243 -> 4517
    //   4763: astore 16
    //   4765: iconst_0
    //   4766: istore_2
    //   4767: iload 6
    //   4769: istore 5
    //   4771: aload 33
    //   4773: astore 18
    //   4775: goto -539 -> 4236
    //   4778: astore 16
    //   4780: iconst_0
    //   4781: istore_2
    //   4782: iload 6
    //   4784: istore 5
    //   4786: aload 13
    //   4788: astore 17
    //   4790: aload 33
    //   4792: astore 18
    //   4794: goto -558 -> 4236
    //   4797: astore 16
    //   4799: iload 6
    //   4801: istore 5
    //   4803: aload 14
    //   4805: astore 17
    //   4807: aload 21
    //   4809: astore 18
    //   4811: goto -575 -> 4236
    //   4814: astore 16
    //   4816: aload 14
    //   4818: astore 17
    //   4820: aload 13
    //   4822: astore 18
    //   4824: goto -588 -> 4236
    //   4827: astore 16
    //   4829: iconst_0
    //   4830: istore_2
    //   4831: iload 4
    //   4833: istore 5
    //   4835: aload 18
    //   4837: astore 17
    //   4839: aload 32
    //   4841: astore 18
    //   4843: goto -889 -> 3954
    //   4846: astore 16
    //   4848: iconst_0
    //   4849: istore_2
    //   4850: iload 4
    //   4852: istore 5
    //   4854: aload 13
    //   4856: astore 17
    //   4858: aload 32
    //   4860: astore 18
    //   4862: goto -908 -> 3954
    //   4865: astore 16
    //   4867: iload 4
    //   4869: istore 5
    //   4871: aload 14
    //   4873: astore 17
    //   4875: goto -921 -> 3954
    //   4878: astore 16
    //   4880: iload 6
    //   4882: istore 5
    //   4884: aload 14
    //   4886: astore 17
    //   4888: aload 13
    //   4890: astore 18
    //   4892: goto -938 -> 3954
    //   4895: astore 16
    //   4897: iconst_0
    //   4898: istore_2
    //   4899: iload_3
    //   4900: istore 5
    //   4902: aload 19
    //   4904: astore 17
    //   4906: aload 31
    //   4908: astore 18
    //   4910: goto -1220 -> 3690
    //   4913: astore 16
    //   4915: iconst_0
    //   4916: istore_2
    //   4917: iload_3
    //   4918: istore 5
    //   4920: aload 13
    //   4922: astore 17
    //   4924: aload 31
    //   4926: astore 18
    //   4928: goto -1238 -> 3690
    //   4931: astore 16
    //   4933: iload_3
    //   4934: istore 5
    //   4936: aload 14
    //   4938: astore 17
    //   4940: aload 19
    //   4942: astore 18
    //   4944: goto -1254 -> 3690
    //   4947: astore 16
    //   4949: iload 7
    //   4951: istore 5
    //   4953: aload 14
    //   4955: astore 17
    //   4957: aload 13
    //   4959: astore 18
    //   4961: goto -1271 -> 3690
    //   4964: astore 16
    //   4966: iconst_0
    //   4967: istore_2
    //   4968: aload 20
    //   4970: astore 17
    //   4972: aload 30
    //   4974: astore 18
    //   4976: goto -1549 -> 3427
    //   4979: astore 16
    //   4981: iconst_0
    //   4982: istore_2
    //   4983: aload 13
    //   4985: astore 17
    //   4987: aload 30
    //   4989: astore 18
    //   4991: goto -1564 -> 3427
    //   4994: astore 16
    //   4996: aload 14
    //   4998: astore 17
    //   5000: aload 20
    //   5002: astore 18
    //   5004: goto -1577 -> 3427
    //   5007: astore 16
    //   5009: iload 8
    //   5011: istore 5
    //   5013: aload 14
    //   5015: astore 17
    //   5017: aload 13
    //   5019: astore 18
    //   5021: goto -1594 -> 3427
    //   5024: astore 12
    //   5026: aconst_null
    //   5027: astore 13
    //   5029: iconst_0
    //   5030: istore_3
    //   5031: iconst_0
    //   5032: istore_2
    //   5033: aload 18
    //   5035: astore 14
    //   5037: aload 29
    //   5039: astore 15
    //   5041: goto -3887 -> 1154
    //   5044: astore 15
    //   5046: aload 13
    //   5048: astore 14
    //   5050: aload 12
    //   5052: astore 13
    //   5054: iconst_0
    //   5055: istore_3
    //   5056: iconst_0
    //   5057: istore_2
    //   5058: aload 15
    //   5060: astore 12
    //   5062: aload 29
    //   5064: astore 15
    //   5066: goto -3912 -> 1154
    //   5069: astore 15
    //   5071: aload 12
    //   5073: astore 16
    //   5075: iload_2
    //   5076: istore_3
    //   5077: aload 15
    //   5079: astore 12
    //   5081: iload 9
    //   5083: istore_2
    //   5084: aload 13
    //   5086: astore 15
    //   5088: aload 16
    //   5090: astore 13
    //   5092: goto -3938 -> 1154
    //   5095: iconst_0
    //   5096: istore_3
    //   5097: goto -1947 -> 3150
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	5100	0	this	c
    //   0	5100	1	paramd	d
    //   1137	3947	2	i	int
    //   99	4998	3	j	int
    //   101	4767	4	k	int
    //   110	4902	5	m	int
    //   104	4777	6	n	int
    //   107	4843	7	i1	int
    //   1751	3259	8	i2	int
    //   2408	2674	9	i3	int
    //   2417	576	10	i4	int
    //   2866	3	11	i5	int
    //   254	1659	12	localObject1	Object
    //   1948	248	12	localIOException1	java.io.IOException
    //   2231	580	12	localIOException2	java.io.IOException
    //   2818	1	12	localUnsupportedEncodingException1	java.io.UnsupportedEncodingException
    //   2904	5	12	localIOException3	java.io.IOException
    //   2923	5	12	localArrayIndexOutOfBoundsException1	ArrayIndexOutOfBoundsException
    //   2942	281	12	localIOException4	java.io.IOException
    //   3302	5	12	localIOException5	java.io.IOException
    //   3321	5	12	localArrayIndexOutOfBoundsException2	ArrayIndexOutOfBoundsException
    //   3340	5	12	localIOException6	java.io.IOException
    //   3359	5	12	localIOException7	java.io.IOException
    //   3378	5	12	localArrayIndexOutOfBoundsException3	ArrayIndexOutOfBoundsException
    //   3397	5	12	localIOException8	java.io.IOException
    //   3419	151	12	localHttpURLConnection1	HttpURLConnection
    //   3615	5	12	localIOException9	java.io.IOException
    //   3634	5	12	localArrayIndexOutOfBoundsException4	ArrayIndexOutOfBoundsException
    //   3653	5	12	localIOException10	java.io.IOException
    //   3675	158	12	localHttpURLConnection2	HttpURLConnection
    //   3878	5	12	localIOException11	java.io.IOException
    //   3897	5	12	localArrayIndexOutOfBoundsException5	ArrayIndexOutOfBoundsException
    //   3916	5	12	localIOException12	java.io.IOException
    //   3938	177	12	localHttpURLConnection3	HttpURLConnection
    //   4160	5	12	localIOException13	java.io.IOException
    //   4179	5	12	localArrayIndexOutOfBoundsException6	ArrayIndexOutOfBoundsException
    //   4198	5	12	localIOException14	java.io.IOException
    //   4220	177	12	localHttpURLConnection4	HttpURLConnection
    //   4442	5	12	localIOException15	java.io.IOException
    //   4461	5	12	localArrayIndexOutOfBoundsException7	ArrayIndexOutOfBoundsException
    //   4480	5	12	localIOException16	java.io.IOException
    //   4499	156	12	localObject2	Object
    //   4660	70	12	localObject3	Object
    //   4742	1	12	localObject4	Object
    //   4755	1	12	localObject5	Object
    //   5024	27	12	localUnsupportedEncodingException2	java.io.UnsupportedEncodingException
    //   5060	20	12	localUnsupportedEncodingException3	java.io.UnsupportedEncodingException
    //   84	2517	13	localObject6	Object
    //   2605	38	13	localException1	Exception
    //   2717	31	13	localObject7	Object
    //   2752	38	13	localException2	Exception
    //   2800	1754	13	localObject8	Object
    //   4593	5	13	localIOException17	java.io.IOException
    //   4612	5	13	localArrayIndexOutOfBoundsException8	ArrayIndexOutOfBoundsException
    //   4631	5	13	localIOException18	java.io.IOException
    //   4656	435	13	localObject9	Object
    //   51	4523	14	localObject10	Object
    //   4650	9	14	localObject11	Object
    //   4667	382	14	localObject12	Object
    //   57	2704	15	localObject13	Object
    //   2805	12	15	localUnsupportedEncodingException4	java.io.UnsupportedEncodingException
    //   2825	1847	15	localObject14	Object
    //   4676	13	15	localObject15	Object
    //   4697	1	15	localObject16	Object
    //   4718	10	15	localObject17	Object
    //   4733	307	15	localObject18	Object
    //   5044	15	15	localUnsupportedEncodingException5	java.io.UnsupportedEncodingException
    //   5064	1	15	localObject19	Object
    //   5069	9	15	localUnsupportedEncodingException6	java.io.UnsupportedEncodingException
    //   5086	1	15	localObject20	Object
    //   66	2758	16	localObject21	Object
    //   3416	80	16	localSSLHandshakeException1	javax.net.ssl.SSLHandshakeException
    //   3672	87	16	localFileNotFoundException1	java.io.FileNotFoundException
    //   3935	127	16	localSocketTimeoutException1	java.net.SocketTimeoutException
    //   4217	294	16	localException3	Exception
    //   4702	7	16	localObject22	Object
    //   4725	11	16	localObject23	Object
    //   4763	1	16	localException4	Exception
    //   4778	1	16	localException5	Exception
    //   4797	1	16	localException6	Exception
    //   4814	1	16	localException7	Exception
    //   4827	1	16	localSocketTimeoutException2	java.net.SocketTimeoutException
    //   4846	1	16	localSocketTimeoutException3	java.net.SocketTimeoutException
    //   4865	1	16	localSocketTimeoutException4	java.net.SocketTimeoutException
    //   4878	1	16	localSocketTimeoutException5	java.net.SocketTimeoutException
    //   4895	1	16	localFileNotFoundException2	java.io.FileNotFoundException
    //   4913	1	16	localFileNotFoundException3	java.io.FileNotFoundException
    //   4931	1	16	localFileNotFoundException4	java.io.FileNotFoundException
    //   4947	1	16	localFileNotFoundException5	java.io.FileNotFoundException
    //   4964	1	16	localSSLHandshakeException2	javax.net.ssl.SSLHandshakeException
    //   4979	1	16	localSSLHandshakeException3	javax.net.ssl.SSLHandshakeException
    //   4994	1	16	localSSLHandshakeException4	javax.net.ssl.SSLHandshakeException
    //   5007	1	16	localSSLHandshakeException5	javax.net.ssl.SSLHandshakeException
    //   5073	16	16	localObject24	Object
    //   54	1023	17	localObject25	Object
    //   1132	19	17	localUnsupportedEncodingException7	java.io.UnsupportedEncodingException
    //   1295	3721	17	localObject26	Object
    //   48	4986	18	localObject27	Object
    //   60	4881	19	localObject28	Object
    //   63	4938	20	localObject29	Object
    //   27	4781	21	localObject30	Object
    //   9	2973	22	arrayOfByte	byte[]
    //   12	2743	23	localObject31	Object
    //   30	2729	24	localObject32	Object
    //   33	2730	25	localObject33	Object
    //   36	2731	26	localObject34	Object
    //   39	2732	27	localObject35	Object
    //   42	2733	28	localObject36	Object
    //   45	5018	29	localObject37	Object
    //   15	4973	30	localObject38	Object
    //   18	4907	31	localObject39	Object
    //   21	4838	32	localObject40	Object
    //   24	4767	33	localObject41	Object
    //   69	1399	34	localObject42	Object
    //   72	1400	35	localObject43	Object
    //   75	1401	36	localObject44	Object
    //   78	1402	37	localObject45	Object
    //   81	1403	38	localObject46	Object
    //   90	4242	39	locala	a
    //   96	910	40	localObject47	Object
    //   116	1003	41	localObject48	Object
    // Exception table:
    //   from	to	target	type
    //   280	290	1132	java/io/UnsupportedEncodingException
    //   314	320	1132	java/io/UnsupportedEncodingException
    //   410	418	1132	java/io/UnsupportedEncodingException
    //   442	449	1132	java/io/UnsupportedEncodingException
    //   473	484	1132	java/io/UnsupportedEncodingException
    //   508	515	1132	java/io/UnsupportedEncodingException
    //   539	554	1132	java/io/UnsupportedEncodingException
    //   578	601	1132	java/io/UnsupportedEncodingException
    //   625	632	1132	java/io/UnsupportedEncodingException
    //   656	665	1132	java/io/UnsupportedEncodingException
    //   689	698	1132	java/io/UnsupportedEncodingException
    //   722	733	1132	java/io/UnsupportedEncodingException
    //   757	763	1132	java/io/UnsupportedEncodingException
    //   787	796	1132	java/io/UnsupportedEncodingException
    //   820	826	1132	java/io/UnsupportedEncodingException
    //   850	861	1132	java/io/UnsupportedEncodingException
    //   890	909	1132	java/io/UnsupportedEncodingException
    //   933	947	1132	java/io/UnsupportedEncodingException
    //   971	981	1132	java/io/UnsupportedEncodingException
    //   1005	1017	1132	java/io/UnsupportedEncodingException
    //   1041	1066	1132	java/io/UnsupportedEncodingException
    //   1090	1129	1132	java/io/UnsupportedEncodingException
    //   1309	1327	1132	java/io/UnsupportedEncodingException
    //   1351	1361	1132	java/io/UnsupportedEncodingException
    //   1385	1393	1132	java/io/UnsupportedEncodingException
    //   1417	1433	1132	java/io/UnsupportedEncodingException
    //   1457	1463	1132	java/io/UnsupportedEncodingException
    //   1487	1501	1132	java/io/UnsupportedEncodingException
    //   1548	1554	1132	java/io/UnsupportedEncodingException
    //   1922	1927	1948	java/io/IOException
    //   2205	2210	2231	java/io/IOException
    //   2303	2317	2605	java/lang/Exception
    //   2337	2351	2605	java/lang/Exception
    //   2595	2602	2605	java/lang/Exception
    //   2671	2685	2752	java/lang/Exception
    //   2705	2719	2752	java/lang/Exception
    //   2742	2749	2752	java/lang/Exception
    //   1578	1604	2805	java/io/UnsupportedEncodingException
    //   1635	1661	2805	java/io/UnsupportedEncodingException
    //   1685	1692	2805	java/io/UnsupportedEncodingException
    //   1716	1723	2805	java/io/UnsupportedEncodingException
    //   1747	1753	2805	java/io/UnsupportedEncodingException
    //   1777	1785	2805	java/io/UnsupportedEncodingException
    //   1814	1834	2805	java/io/UnsupportedEncodingException
    //   1858	1877	2805	java/io/UnsupportedEncodingException
    //   1991	2023	2805	java/io/UnsupportedEncodingException
    //   2047	2053	2805	java/io/UnsupportedEncodingException
    //   2077	2085	2805	java/io/UnsupportedEncodingException
    //   2109	2131	2805	java/io/UnsupportedEncodingException
    //   2155	2160	2805	java/io/UnsupportedEncodingException
    //   2274	2283	2805	java/io/UnsupportedEncodingException
    //   2303	2317	2805	java/io/UnsupportedEncodingException
    //   2337	2351	2805	java/io/UnsupportedEncodingException
    //   2383	2390	2805	java/io/UnsupportedEncodingException
    //   2595	2602	2805	java/io/UnsupportedEncodingException
    //   2631	2651	2805	java/io/UnsupportedEncodingException
    //   2671	2685	2805	java/io/UnsupportedEncodingException
    //   2705	2719	2805	java/io/UnsupportedEncodingException
    //   2742	2749	2805	java/io/UnsupportedEncodingException
    //   2778	2798	2805	java/io/UnsupportedEncodingException
    //   2539	2544	2904	java/io/IOException
    //   2539	2544	2923	java/lang/ArrayIndexOutOfBoundsException
    //   2549	2554	2942	java/io/IOException
    //   3232	3237	3302	java/io/IOException
    //   3232	3237	3321	java/lang/ArrayIndexOutOfBoundsException
    //   3242	3247	3340	java/io/IOException
    //   1249	1254	3359	java/io/IOException
    //   1249	1254	3378	java/lang/ArrayIndexOutOfBoundsException
    //   1259	1264	3397	java/io/IOException
    //   237	256	3416	javax/net/ssl/SSLHandshakeException
    //   3579	3584	3615	java/io/IOException
    //   3579	3584	3634	java/lang/ArrayIndexOutOfBoundsException
    //   3589	3594	3653	java/io/IOException
    //   237	256	3672	java/io/FileNotFoundException
    //   3842	3847	3878	java/io/IOException
    //   3842	3847	3897	java/lang/ArrayIndexOutOfBoundsException
    //   3852	3857	3916	java/io/IOException
    //   237	256	3935	java/net/SocketTimeoutException
    //   4124	4129	4160	java/io/IOException
    //   4124	4129	4179	java/lang/ArrayIndexOutOfBoundsException
    //   4134	4139	4198	java/io/IOException
    //   237	256	4217	java/lang/Exception
    //   4406	4411	4442	java/io/IOException
    //   4406	4411	4461	java/lang/ArrayIndexOutOfBoundsException
    //   4416	4421	4480	java/io/IOException
    //   237	256	4499	finally
    //   4563	4568	4593	java/io/IOException
    //   4563	4568	4612	java/lang/ArrayIndexOutOfBoundsException
    //   4573	4578	4631	java/io/IOException
    //   280	290	4650	finally
    //   314	320	4650	finally
    //   410	418	4650	finally
    //   442	449	4650	finally
    //   473	484	4650	finally
    //   508	515	4650	finally
    //   539	554	4650	finally
    //   578	601	4650	finally
    //   625	632	4650	finally
    //   656	665	4650	finally
    //   689	698	4650	finally
    //   722	733	4650	finally
    //   757	763	4650	finally
    //   787	796	4650	finally
    //   820	826	4650	finally
    //   850	861	4650	finally
    //   890	909	4650	finally
    //   933	947	4650	finally
    //   971	981	4650	finally
    //   1005	1017	4650	finally
    //   1041	1066	4650	finally
    //   1090	1129	4650	finally
    //   1309	1327	4650	finally
    //   1351	1361	4650	finally
    //   1385	1393	4650	finally
    //   1417	1433	4650	finally
    //   1457	1463	4650	finally
    //   1487	1501	4650	finally
    //   1548	1554	4650	finally
    //   1501	1520	4676	finally
    //   1578	1604	4702	finally
    //   1635	1661	4702	finally
    //   1685	1692	4702	finally
    //   1716	1723	4702	finally
    //   1747	1753	4702	finally
    //   1777	1785	4702	finally
    //   1814	1834	4702	finally
    //   1858	1877	4702	finally
    //   1991	2023	4702	finally
    //   2047	2053	4702	finally
    //   2077	2085	4702	finally
    //   2109	2131	4702	finally
    //   2155	2160	4702	finally
    //   2274	2283	4702	finally
    //   2303	2317	4702	finally
    //   2337	2351	4702	finally
    //   2383	2390	4702	finally
    //   2595	2602	4702	finally
    //   2631	2651	4702	finally
    //   2671	2685	4702	finally
    //   2705	2719	4702	finally
    //   2742	2749	4702	finally
    //   2778	2798	4702	finally
    //   2410	2419	4718	finally
    //   2443	2452	4718	finally
    //   2483	2493	4718	finally
    //   2848	2868	4718	finally
    //   2979	2989	4718	finally
    //   3015	3020	4718	finally
    //   3038	3043	4718	finally
    //   3061	3074	4718	finally
    //   3092	3102	4718	finally
    //   3120	3150	4718	finally
    //   3168	3186	4718	finally
    //   3286	3299	4718	finally
    //   1154	1203	4742	finally
    //   3445	3459	4755	finally
    //   3477	3504	4755	finally
    //   3522	3532	4755	finally
    //   3708	3722	4755	finally
    //   3740	3767	4755	finally
    //   3785	3795	4755	finally
    //   3972	3986	4755	finally
    //   4004	4031	4755	finally
    //   4049	4077	4755	finally
    //   4254	4268	4755	finally
    //   4286	4313	4755	finally
    //   4331	4359	4755	finally
    //   280	290	4763	java/lang/Exception
    //   314	320	4763	java/lang/Exception
    //   410	418	4763	java/lang/Exception
    //   442	449	4763	java/lang/Exception
    //   473	484	4763	java/lang/Exception
    //   508	515	4763	java/lang/Exception
    //   539	554	4763	java/lang/Exception
    //   578	601	4763	java/lang/Exception
    //   625	632	4763	java/lang/Exception
    //   656	665	4763	java/lang/Exception
    //   689	698	4763	java/lang/Exception
    //   722	733	4763	java/lang/Exception
    //   757	763	4763	java/lang/Exception
    //   787	796	4763	java/lang/Exception
    //   820	826	4763	java/lang/Exception
    //   850	861	4763	java/lang/Exception
    //   890	909	4763	java/lang/Exception
    //   933	947	4763	java/lang/Exception
    //   971	981	4763	java/lang/Exception
    //   1005	1017	4763	java/lang/Exception
    //   1041	1066	4763	java/lang/Exception
    //   1090	1129	4763	java/lang/Exception
    //   1309	1327	4763	java/lang/Exception
    //   1351	1361	4763	java/lang/Exception
    //   1385	1393	4763	java/lang/Exception
    //   1417	1433	4763	java/lang/Exception
    //   1457	1463	4763	java/lang/Exception
    //   1487	1501	4763	java/lang/Exception
    //   1548	1554	4763	java/lang/Exception
    //   1501	1520	4778	java/lang/Exception
    //   1578	1604	4797	java/lang/Exception
    //   1635	1661	4797	java/lang/Exception
    //   1685	1692	4797	java/lang/Exception
    //   1716	1723	4797	java/lang/Exception
    //   1747	1753	4797	java/lang/Exception
    //   1777	1785	4797	java/lang/Exception
    //   1814	1834	4797	java/lang/Exception
    //   1858	1877	4797	java/lang/Exception
    //   1991	2023	4797	java/lang/Exception
    //   2047	2053	4797	java/lang/Exception
    //   2077	2085	4797	java/lang/Exception
    //   2109	2131	4797	java/lang/Exception
    //   2155	2160	4797	java/lang/Exception
    //   2274	2283	4797	java/lang/Exception
    //   2383	2390	4797	java/lang/Exception
    //   2631	2651	4797	java/lang/Exception
    //   2778	2798	4797	java/lang/Exception
    //   2410	2419	4814	java/lang/Exception
    //   2443	2452	4814	java/lang/Exception
    //   2483	2493	4814	java/lang/Exception
    //   2848	2868	4814	java/lang/Exception
    //   2979	2989	4814	java/lang/Exception
    //   3015	3020	4814	java/lang/Exception
    //   3038	3043	4814	java/lang/Exception
    //   3061	3074	4814	java/lang/Exception
    //   3092	3102	4814	java/lang/Exception
    //   3120	3150	4814	java/lang/Exception
    //   3168	3186	4814	java/lang/Exception
    //   3286	3299	4814	java/lang/Exception
    //   280	290	4827	java/net/SocketTimeoutException
    //   314	320	4827	java/net/SocketTimeoutException
    //   410	418	4827	java/net/SocketTimeoutException
    //   442	449	4827	java/net/SocketTimeoutException
    //   473	484	4827	java/net/SocketTimeoutException
    //   508	515	4827	java/net/SocketTimeoutException
    //   539	554	4827	java/net/SocketTimeoutException
    //   578	601	4827	java/net/SocketTimeoutException
    //   625	632	4827	java/net/SocketTimeoutException
    //   656	665	4827	java/net/SocketTimeoutException
    //   689	698	4827	java/net/SocketTimeoutException
    //   722	733	4827	java/net/SocketTimeoutException
    //   757	763	4827	java/net/SocketTimeoutException
    //   787	796	4827	java/net/SocketTimeoutException
    //   820	826	4827	java/net/SocketTimeoutException
    //   850	861	4827	java/net/SocketTimeoutException
    //   890	909	4827	java/net/SocketTimeoutException
    //   933	947	4827	java/net/SocketTimeoutException
    //   971	981	4827	java/net/SocketTimeoutException
    //   1005	1017	4827	java/net/SocketTimeoutException
    //   1041	1066	4827	java/net/SocketTimeoutException
    //   1090	1129	4827	java/net/SocketTimeoutException
    //   1309	1327	4827	java/net/SocketTimeoutException
    //   1351	1361	4827	java/net/SocketTimeoutException
    //   1385	1393	4827	java/net/SocketTimeoutException
    //   1417	1433	4827	java/net/SocketTimeoutException
    //   1457	1463	4827	java/net/SocketTimeoutException
    //   1487	1501	4827	java/net/SocketTimeoutException
    //   1548	1554	4827	java/net/SocketTimeoutException
    //   1501	1520	4846	java/net/SocketTimeoutException
    //   1578	1604	4865	java/net/SocketTimeoutException
    //   1635	1661	4865	java/net/SocketTimeoutException
    //   1685	1692	4865	java/net/SocketTimeoutException
    //   1716	1723	4865	java/net/SocketTimeoutException
    //   1747	1753	4865	java/net/SocketTimeoutException
    //   1777	1785	4865	java/net/SocketTimeoutException
    //   1814	1834	4865	java/net/SocketTimeoutException
    //   1858	1877	4865	java/net/SocketTimeoutException
    //   1991	2023	4865	java/net/SocketTimeoutException
    //   2047	2053	4865	java/net/SocketTimeoutException
    //   2077	2085	4865	java/net/SocketTimeoutException
    //   2109	2131	4865	java/net/SocketTimeoutException
    //   2155	2160	4865	java/net/SocketTimeoutException
    //   2274	2283	4865	java/net/SocketTimeoutException
    //   2303	2317	4865	java/net/SocketTimeoutException
    //   2337	2351	4865	java/net/SocketTimeoutException
    //   2383	2390	4865	java/net/SocketTimeoutException
    //   2595	2602	4865	java/net/SocketTimeoutException
    //   2631	2651	4865	java/net/SocketTimeoutException
    //   2671	2685	4865	java/net/SocketTimeoutException
    //   2705	2719	4865	java/net/SocketTimeoutException
    //   2742	2749	4865	java/net/SocketTimeoutException
    //   2778	2798	4865	java/net/SocketTimeoutException
    //   2410	2419	4878	java/net/SocketTimeoutException
    //   2443	2452	4878	java/net/SocketTimeoutException
    //   2483	2493	4878	java/net/SocketTimeoutException
    //   2848	2868	4878	java/net/SocketTimeoutException
    //   2979	2989	4878	java/net/SocketTimeoutException
    //   3015	3020	4878	java/net/SocketTimeoutException
    //   3038	3043	4878	java/net/SocketTimeoutException
    //   3061	3074	4878	java/net/SocketTimeoutException
    //   3092	3102	4878	java/net/SocketTimeoutException
    //   3120	3150	4878	java/net/SocketTimeoutException
    //   3168	3186	4878	java/net/SocketTimeoutException
    //   3286	3299	4878	java/net/SocketTimeoutException
    //   280	290	4895	java/io/FileNotFoundException
    //   314	320	4895	java/io/FileNotFoundException
    //   410	418	4895	java/io/FileNotFoundException
    //   442	449	4895	java/io/FileNotFoundException
    //   473	484	4895	java/io/FileNotFoundException
    //   508	515	4895	java/io/FileNotFoundException
    //   539	554	4895	java/io/FileNotFoundException
    //   578	601	4895	java/io/FileNotFoundException
    //   625	632	4895	java/io/FileNotFoundException
    //   656	665	4895	java/io/FileNotFoundException
    //   689	698	4895	java/io/FileNotFoundException
    //   722	733	4895	java/io/FileNotFoundException
    //   757	763	4895	java/io/FileNotFoundException
    //   787	796	4895	java/io/FileNotFoundException
    //   820	826	4895	java/io/FileNotFoundException
    //   850	861	4895	java/io/FileNotFoundException
    //   890	909	4895	java/io/FileNotFoundException
    //   933	947	4895	java/io/FileNotFoundException
    //   971	981	4895	java/io/FileNotFoundException
    //   1005	1017	4895	java/io/FileNotFoundException
    //   1041	1066	4895	java/io/FileNotFoundException
    //   1090	1129	4895	java/io/FileNotFoundException
    //   1309	1327	4895	java/io/FileNotFoundException
    //   1351	1361	4895	java/io/FileNotFoundException
    //   1385	1393	4895	java/io/FileNotFoundException
    //   1417	1433	4895	java/io/FileNotFoundException
    //   1457	1463	4895	java/io/FileNotFoundException
    //   1487	1501	4895	java/io/FileNotFoundException
    //   1548	1554	4895	java/io/FileNotFoundException
    //   1501	1520	4913	java/io/FileNotFoundException
    //   1578	1604	4931	java/io/FileNotFoundException
    //   1635	1661	4931	java/io/FileNotFoundException
    //   1685	1692	4931	java/io/FileNotFoundException
    //   1716	1723	4931	java/io/FileNotFoundException
    //   1747	1753	4931	java/io/FileNotFoundException
    //   1777	1785	4931	java/io/FileNotFoundException
    //   1814	1834	4931	java/io/FileNotFoundException
    //   1858	1877	4931	java/io/FileNotFoundException
    //   1991	2023	4931	java/io/FileNotFoundException
    //   2047	2053	4931	java/io/FileNotFoundException
    //   2077	2085	4931	java/io/FileNotFoundException
    //   2109	2131	4931	java/io/FileNotFoundException
    //   2155	2160	4931	java/io/FileNotFoundException
    //   2274	2283	4931	java/io/FileNotFoundException
    //   2303	2317	4931	java/io/FileNotFoundException
    //   2337	2351	4931	java/io/FileNotFoundException
    //   2383	2390	4931	java/io/FileNotFoundException
    //   2595	2602	4931	java/io/FileNotFoundException
    //   2631	2651	4931	java/io/FileNotFoundException
    //   2671	2685	4931	java/io/FileNotFoundException
    //   2705	2719	4931	java/io/FileNotFoundException
    //   2742	2749	4931	java/io/FileNotFoundException
    //   2778	2798	4931	java/io/FileNotFoundException
    //   2410	2419	4947	java/io/FileNotFoundException
    //   2443	2452	4947	java/io/FileNotFoundException
    //   2483	2493	4947	java/io/FileNotFoundException
    //   2848	2868	4947	java/io/FileNotFoundException
    //   2979	2989	4947	java/io/FileNotFoundException
    //   3015	3020	4947	java/io/FileNotFoundException
    //   3038	3043	4947	java/io/FileNotFoundException
    //   3061	3074	4947	java/io/FileNotFoundException
    //   3092	3102	4947	java/io/FileNotFoundException
    //   3120	3150	4947	java/io/FileNotFoundException
    //   3168	3186	4947	java/io/FileNotFoundException
    //   3286	3299	4947	java/io/FileNotFoundException
    //   280	290	4964	javax/net/ssl/SSLHandshakeException
    //   314	320	4964	javax/net/ssl/SSLHandshakeException
    //   410	418	4964	javax/net/ssl/SSLHandshakeException
    //   442	449	4964	javax/net/ssl/SSLHandshakeException
    //   473	484	4964	javax/net/ssl/SSLHandshakeException
    //   508	515	4964	javax/net/ssl/SSLHandshakeException
    //   539	554	4964	javax/net/ssl/SSLHandshakeException
    //   578	601	4964	javax/net/ssl/SSLHandshakeException
    //   625	632	4964	javax/net/ssl/SSLHandshakeException
    //   656	665	4964	javax/net/ssl/SSLHandshakeException
    //   689	698	4964	javax/net/ssl/SSLHandshakeException
    //   722	733	4964	javax/net/ssl/SSLHandshakeException
    //   757	763	4964	javax/net/ssl/SSLHandshakeException
    //   787	796	4964	javax/net/ssl/SSLHandshakeException
    //   820	826	4964	javax/net/ssl/SSLHandshakeException
    //   850	861	4964	javax/net/ssl/SSLHandshakeException
    //   890	909	4964	javax/net/ssl/SSLHandshakeException
    //   933	947	4964	javax/net/ssl/SSLHandshakeException
    //   971	981	4964	javax/net/ssl/SSLHandshakeException
    //   1005	1017	4964	javax/net/ssl/SSLHandshakeException
    //   1041	1066	4964	javax/net/ssl/SSLHandshakeException
    //   1090	1129	4964	javax/net/ssl/SSLHandshakeException
    //   1309	1327	4964	javax/net/ssl/SSLHandshakeException
    //   1351	1361	4964	javax/net/ssl/SSLHandshakeException
    //   1385	1393	4964	javax/net/ssl/SSLHandshakeException
    //   1417	1433	4964	javax/net/ssl/SSLHandshakeException
    //   1457	1463	4964	javax/net/ssl/SSLHandshakeException
    //   1487	1501	4964	javax/net/ssl/SSLHandshakeException
    //   1548	1554	4964	javax/net/ssl/SSLHandshakeException
    //   1501	1520	4979	javax/net/ssl/SSLHandshakeException
    //   1578	1604	4994	javax/net/ssl/SSLHandshakeException
    //   1635	1661	4994	javax/net/ssl/SSLHandshakeException
    //   1685	1692	4994	javax/net/ssl/SSLHandshakeException
    //   1716	1723	4994	javax/net/ssl/SSLHandshakeException
    //   1747	1753	4994	javax/net/ssl/SSLHandshakeException
    //   1777	1785	4994	javax/net/ssl/SSLHandshakeException
    //   1814	1834	4994	javax/net/ssl/SSLHandshakeException
    //   1858	1877	4994	javax/net/ssl/SSLHandshakeException
    //   1991	2023	4994	javax/net/ssl/SSLHandshakeException
    //   2047	2053	4994	javax/net/ssl/SSLHandshakeException
    //   2077	2085	4994	javax/net/ssl/SSLHandshakeException
    //   2109	2131	4994	javax/net/ssl/SSLHandshakeException
    //   2155	2160	4994	javax/net/ssl/SSLHandshakeException
    //   2274	2283	4994	javax/net/ssl/SSLHandshakeException
    //   2303	2317	4994	javax/net/ssl/SSLHandshakeException
    //   2337	2351	4994	javax/net/ssl/SSLHandshakeException
    //   2383	2390	4994	javax/net/ssl/SSLHandshakeException
    //   2595	2602	4994	javax/net/ssl/SSLHandshakeException
    //   2631	2651	4994	javax/net/ssl/SSLHandshakeException
    //   2671	2685	4994	javax/net/ssl/SSLHandshakeException
    //   2705	2719	4994	javax/net/ssl/SSLHandshakeException
    //   2742	2749	4994	javax/net/ssl/SSLHandshakeException
    //   2778	2798	4994	javax/net/ssl/SSLHandshakeException
    //   2410	2419	5007	javax/net/ssl/SSLHandshakeException
    //   2443	2452	5007	javax/net/ssl/SSLHandshakeException
    //   2483	2493	5007	javax/net/ssl/SSLHandshakeException
    //   2848	2868	5007	javax/net/ssl/SSLHandshakeException
    //   2979	2989	5007	javax/net/ssl/SSLHandshakeException
    //   3015	3020	5007	javax/net/ssl/SSLHandshakeException
    //   3038	3043	5007	javax/net/ssl/SSLHandshakeException
    //   3061	3074	5007	javax/net/ssl/SSLHandshakeException
    //   3092	3102	5007	javax/net/ssl/SSLHandshakeException
    //   3120	3150	5007	javax/net/ssl/SSLHandshakeException
    //   3168	3186	5007	javax/net/ssl/SSLHandshakeException
    //   3286	3299	5007	javax/net/ssl/SSLHandshakeException
    //   237	256	5024	java/io/UnsupportedEncodingException
    //   1501	1520	5044	java/io/UnsupportedEncodingException
    //   2410	2419	5069	java/io/UnsupportedEncodingException
    //   2443	2452	5069	java/io/UnsupportedEncodingException
    //   2483	2493	5069	java/io/UnsupportedEncodingException
    //   2848	2868	5069	java/io/UnsupportedEncodingException
    //   2979	2989	5069	java/io/UnsupportedEncodingException
    //   3015	3020	5069	java/io/UnsupportedEncodingException
    //   3038	3043	5069	java/io/UnsupportedEncodingException
    //   3061	3074	5069	java/io/UnsupportedEncodingException
    //   3092	3102	5069	java/io/UnsupportedEncodingException
    //   3120	3150	5069	java/io/UnsupportedEncodingException
    //   3168	3186	5069	java/io/UnsupportedEncodingException
    //   3286	3299	5069	java/io/UnsupportedEncodingException
  }
  
  public final void a(final j paramj, final com.tencent.mm.plugin.appbrand.jsapi.d paramd, final int paramInt, final JSONObject paramJSONObject, final Map<String, String> paramMap, final ArrayList<String> paramArrayList, final a parama, final String paramString1, final String paramString2)
  {
    GMTrace.i(19902878449664L, 148288);
    e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10677825568768L, 79556);
        if (!l.a(paramj, paramJSONObject, paramd))
        {
          parama.qH(paramd.hXF);
          GMTrace.o(10677825568768L, 79556);
          return;
        }
        String str = paramJSONObject.optString("url");
        Object localObject6 = paramJSONObject.opt("data");
        ??? = paramJSONObject.optString("method");
        Object localObject3 = ???;
        if (bg.nm((String)???)) {
          localObject3 = "GET";
        }
        if (TextUtils.isEmpty(str))
        {
          parama.qH("url is null");
          GMTrace.o(10677825568768L, 79556);
          return;
        }
        if ((!URLUtil.isHttpsUrl(str)) && (!URLUtil.isHttpUrl(str)))
        {
          parama.qH("request protocol must be http or https");
          GMTrace.o(10677825568768L, 79556);
          return;
        }
        ??? = new byte[0];
        ??? = ???;
        if (localObject6 != null)
        {
          ??? = ???;
          if (c.rp((String)localObject3))
          {
            if (!(localObject6 instanceof String)) {
              break label260;
            }
            ??? = ((String)localObject6).getBytes(Charset.forName("UTF-8"));
          }
        }
        synchronized (c.this.isS)
        {
          while (c.this.isS.size() >= c.this.isH)
          {
            parama.qH("max connected");
            w.i("MicroMsg.AppBrandNetworkRequest", "max connected");
            GMTrace.o(10677825568768L, 79556);
            return;
            label260:
            ??? = ???;
            if ((localObject6 instanceof ByteBuffer)) {
              ??? = ((ByteBuffer)localObject6).array();
            }
          }
          w.i("MicroMsg.AppBrandNetworkRequest", "method %s ,url %s timeout %s", new Object[] { localObject3, str, Integer.valueOf(paramInt) });
          localObject3 = new d(str, (byte[])???, paramInt, parama, (String)localObject3);
          ((d)localObject3).ite = paramMap;
          ((d)localObject3).itf = paramArrayList;
          ((d)localObject3).itj = paramString2;
          ((d)localObject3).ith = paramJSONObject.optString("responseType", "text");
        }
        synchronized (c.this.isS)
        {
          c.this.isS.add(localObject3);
          ((d)localObject3).hXm = paramString1;
          c.this.a((d)localObject3);
          GMTrace.o(10677825568768L, 79556);
          return;
          localObject2 = finally;
          throw ((Throwable)localObject2);
        }
      }
    }, "appbrand_request_thread");
    GMTrace.o(19902878449664L, 148288);
  }
  
  public final void b(d paramd)
  {
    GMTrace.i(20766837964800L, 154725);
    w.d("MicroMsg.AppBrandNetworkRequest", "try to abortTask");
    this.isL.add(paramd.hXm);
    a(paramd.hXm, paramd.iti);
    GMTrace.o(20766837964800L, 154725);
  }
  
  public final boolean rm(String paramString)
  {
    GMTrace.i(20766972182528L, 154726);
    boolean bool = this.isL.contains(paramString);
    GMTrace.o(20766972182528L, 154726);
    return bool;
  }
  
  public final d rq(String paramString)
  {
    GMTrace.i(17693520429056L, 131827);
    if (paramString == null)
    {
      GMTrace.o(17693520429056L, 131827);
      return null;
    }
    synchronized (this.isS)
    {
      Iterator localIterator = this.isS.iterator();
      while (localIterator.hasNext())
      {
        d locald = (d)localIterator.next();
        if (paramString.equals(locald.hXm))
        {
          GMTrace.o(17693520429056L, 131827);
          return locald;
        }
      }
      GMTrace.o(17693520429056L, 131827);
      return null;
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(String paramString, Object paramObject, int paramInt, JSONObject paramJSONObject);
    
    public abstract void qH(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\h\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */