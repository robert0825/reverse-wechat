package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.google.android.gms.c.v;
import com.google.android.gms.common.internal.w;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class h
  extends o
{
  public static final byte[] acp = "\n".getBytes();
  private final String acn = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] { "GoogleAnalytics", p.VERSION, Build.VERSION.RELEASE, k.c(Locale.getDefault()), Build.MODEL, Build.ID });
  private final j aco;
  
  h(q paramq)
  {
    super(paramq);
    this.aco = new j(paramq.acz);
  }
  
  /* Error */
  private int a(URL paramURL, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore 7
    //   6: aconst_null
    //   7: astore 8
    //   9: aconst_null
    //   10: astore 6
    //   12: aload_1
    //   13: invokestatic 94	com/google/android/gms/common/internal/w:aa	(Ljava/lang/Object;)Ljava/lang/Object;
    //   16: pop
    //   17: aload_2
    //   18: invokestatic 94	com/google/android/gms/common/internal/w:aa	(Ljava/lang/Object;)Ljava/lang/Object;
    //   21: pop
    //   22: aload_0
    //   23: ldc 96
    //   25: aload_2
    //   26: arraylength
    //   27: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   30: aload_1
    //   31: invokevirtual 106	com/google/android/gms/analytics/internal/h:b	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   34: invokestatic 110	com/google/android/gms/analytics/internal/h:iB	()Z
    //   37: ifeq +17 -> 54
    //   40: aload_0
    //   41: ldc 112
    //   43: new 19	java/lang/String
    //   46: dup
    //   47: aload_2
    //   48: invokespecial 115	java/lang/String:<init>	([B)V
    //   51: invokevirtual 118	com/google/android/gms/analytics/internal/h:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   54: aload_0
    //   55: aload_1
    //   56: invokespecial 121	com/google/android/gms/analytics/internal/h:c	(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    //   59: astore_1
    //   60: aload_1
    //   61: astore 5
    //   63: aload 7
    //   65: astore_1
    //   66: aload 5
    //   68: astore 4
    //   70: aload 8
    //   72: astore 6
    //   74: aload 5
    //   76: iconst_1
    //   77: invokevirtual 127	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   80: aload 7
    //   82: astore_1
    //   83: aload 5
    //   85: astore 4
    //   87: aload 8
    //   89: astore 6
    //   91: aload 5
    //   93: aload_2
    //   94: arraylength
    //   95: invokevirtual 131	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   98: aload 7
    //   100: astore_1
    //   101: aload 5
    //   103: astore 4
    //   105: aload 8
    //   107: astore 6
    //   109: aload 5
    //   111: invokevirtual 134	java/net/HttpURLConnection:connect	()V
    //   114: aload 7
    //   116: astore_1
    //   117: aload 5
    //   119: astore 4
    //   121: aload 8
    //   123: astore 6
    //   125: aload 5
    //   127: invokevirtual 138	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   130: astore 7
    //   132: aload 7
    //   134: astore_1
    //   135: aload 5
    //   137: astore 4
    //   139: aload 7
    //   141: astore 6
    //   143: aload 7
    //   145: aload_2
    //   146: invokevirtual 143	java/io/OutputStream:write	([B)V
    //   149: aload 7
    //   151: astore_1
    //   152: aload 5
    //   154: astore 4
    //   156: aload 7
    //   158: astore 6
    //   160: aload_0
    //   161: aload 5
    //   163: invokespecial 146	com/google/android/gms/analytics/internal/h:a	(Ljava/net/HttpURLConnection;)V
    //   166: aload 7
    //   168: astore_1
    //   169: aload 5
    //   171: astore 4
    //   173: aload 7
    //   175: astore 6
    //   177: aload 5
    //   179: invokevirtual 150	java/net/HttpURLConnection:getResponseCode	()I
    //   182: istore_3
    //   183: iload_3
    //   184: sipush 200
    //   187: if_icmpne +24 -> 211
    //   190: aload 7
    //   192: astore_1
    //   193: aload 5
    //   195: astore 4
    //   197: aload 7
    //   199: astore 6
    //   201: aload_0
    //   202: getfield 156	com/google/android/gms/analytics/internal/n:ack	Lcom/google/android/gms/analytics/internal/q;
    //   205: invokevirtual 160	com/google/android/gms/analytics/internal/q:iG	()Lcom/google/android/gms/analytics/internal/m;
    //   208: invokevirtual 165	com/google/android/gms/analytics/internal/m:ix	()V
    //   211: aload 7
    //   213: astore_1
    //   214: aload 5
    //   216: astore 4
    //   218: aload 7
    //   220: astore 6
    //   222: aload_0
    //   223: ldc -89
    //   225: iload_3
    //   226: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   229: invokevirtual 170	com/google/android/gms/analytics/internal/h:d	(Ljava/lang/String;Ljava/lang/Object;)V
    //   232: aload 7
    //   234: ifnull +8 -> 242
    //   237: aload 7
    //   239: invokevirtual 173	java/io/OutputStream:close	()V
    //   242: aload 5
    //   244: ifnull +8 -> 252
    //   247: aload 5
    //   249: invokevirtual 176	java/net/HttpURLConnection:disconnect	()V
    //   252: iload_3
    //   253: ireturn
    //   254: astore_1
    //   255: aload_0
    //   256: ldc -78
    //   258: aload_1
    //   259: invokevirtual 181	com/google/android/gms/analytics/internal/h:f	(Ljava/lang/String;Ljava/lang/Object;)V
    //   262: goto -20 -> 242
    //   265: astore_2
    //   266: aconst_null
    //   267: astore 5
    //   269: aload 6
    //   271: astore_1
    //   272: aload 5
    //   274: astore 4
    //   276: aload_0
    //   277: ldc -73
    //   279: aload_2
    //   280: invokevirtual 186	com/google/android/gms/analytics/internal/h:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   283: aload 6
    //   285: ifnull +8 -> 293
    //   288: aload 6
    //   290: invokevirtual 173	java/io/OutputStream:close	()V
    //   293: aload 5
    //   295: ifnull +8 -> 303
    //   298: aload 5
    //   300: invokevirtual 176	java/net/HttpURLConnection:disconnect	()V
    //   303: iconst_0
    //   304: ireturn
    //   305: astore_1
    //   306: aload_0
    //   307: ldc -78
    //   309: aload_1
    //   310: invokevirtual 181	com/google/android/gms/analytics/internal/h:f	(Ljava/lang/String;Ljava/lang/Object;)V
    //   313: goto -20 -> 293
    //   316: astore_2
    //   317: aconst_null
    //   318: astore 4
    //   320: aload 5
    //   322: astore_1
    //   323: aload_1
    //   324: ifnull +7 -> 331
    //   327: aload_1
    //   328: invokevirtual 173	java/io/OutputStream:close	()V
    //   331: aload 4
    //   333: ifnull +8 -> 341
    //   336: aload 4
    //   338: invokevirtual 176	java/net/HttpURLConnection:disconnect	()V
    //   341: aload_2
    //   342: athrow
    //   343: astore_1
    //   344: aload_0
    //   345: ldc -78
    //   347: aload_1
    //   348: invokevirtual 181	com/google/android/gms/analytics/internal/h:f	(Ljava/lang/String;Ljava/lang/Object;)V
    //   351: goto -20 -> 331
    //   354: astore_2
    //   355: goto -32 -> 323
    //   358: astore_2
    //   359: goto -90 -> 269
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	362	0	this	h
    //   0	362	1	paramURL	URL
    //   0	362	2	paramArrayOfByte	byte[]
    //   182	71	3	i	int
    //   68	269	4	localURL1	URL
    //   1	320	5	localURL2	URL
    //   10	279	6	localObject1	Object
    //   4	234	7	localOutputStream	java.io.OutputStream
    //   7	115	8	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   237	242	254	java/io/IOException
    //   54	60	265	java/io/IOException
    //   288	293	305	java/io/IOException
    //   54	60	316	finally
    //   327	331	343	java/io/IOException
    //   74	80	354	finally
    //   91	98	354	finally
    //   109	114	354	finally
    //   125	132	354	finally
    //   143	149	354	finally
    //   160	166	354	finally
    //   177	183	354	finally
    //   201	211	354	finally
    //   222	232	354	finally
    //   276	283	354	finally
    //   74	80	358	java/io/IOException
    //   91	98	358	java/io/IOException
    //   109	114	358	java/io/IOException
    //   125	132	358	java/io/IOException
    //   143	149	358	java/io/IOException
    //   160	166	358	java/io/IOException
    //   177	183	358	java/io/IOException
    //   201	211	358	java/io/IOException
    //   222	232	358	java/io/IOException
  }
  
  private URL a(c paramc)
  {
    if (paramc.acc) {}
    for (paramc = ac.jo() + ac.jq();; paramc = ac.jp() + ac.jq()) {
      try
      {
        paramc = new URL(paramc);
        return paramc;
      }
      catch (MalformedURLException paramc)
      {
        f("Error trying to parse the hardcoded host url", paramc);
      }
    }
    return null;
  }
  
  private static void a(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    if (paramStringBuilder.length() != 0) {
      paramStringBuilder.append('&');
    }
    paramStringBuilder.append(URLEncoder.encode(paramString1, "UTF-8"));
    paramStringBuilder.append('=');
    paramStringBuilder.append(URLEncoder.encode(paramString2, "UTF-8"));
  }
  
  private void a(HttpURLConnection paramHttpURLConnection)
  {
    localHttpURLConnection = null;
    try
    {
      paramHttpURLConnection = paramHttpURLConnection.getInputStream();
      localHttpURLConnection = paramHttpURLConnection;
      byte[] arrayOfByte = new byte['Ѐ'];
      int i;
      do
      {
        localHttpURLConnection = paramHttpURLConnection;
        i = paramHttpURLConnection.read(arrayOfByte);
      } while (i > 0);
      if (paramHttpURLConnection != null) {}
      try
      {
        paramHttpURLConnection.close();
        return;
      }
      catch (IOException paramHttpURLConnection)
      {
        f("Error closing http connection input stream", paramHttpURLConnection);
        return;
      }
      try
      {
        localHttpURLConnection.close();
        throw paramHttpURLConnection;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          f("Error closing http connection input stream", localIOException);
        }
      }
    }
    finally
    {
      if (localHttpURLConnection == null) {}
    }
  }
  
  private int b(URL paramURL)
  {
    w.aa(paramURL);
    d("GET request", paramURL);
    Object localObject = null;
    URL localURL = null;
    try
    {
      paramURL = c(paramURL);
      localURL = paramURL;
      localObject = paramURL;
      paramURL.connect();
      localURL = paramURL;
      localObject = paramURL;
      a(paramURL);
      localURL = paramURL;
      localObject = paramURL;
      int i = paramURL.getResponseCode();
      if (i == 200)
      {
        localURL = paramURL;
        localObject = paramURL;
        this.ack.iG().ix();
      }
      localURL = paramURL;
      localObject = paramURL;
      d("GET status", Integer.valueOf(i));
      if (paramURL != null) {
        paramURL.disconnect();
      }
      return i;
    }
    catch (IOException paramURL)
    {
      localObject = localURL;
      e("Network GET connection error", paramURL);
      if (localURL != null) {
        localURL.disconnect();
      }
      return 0;
    }
    finally
    {
      if (localObject != null) {
        ((HttpURLConnection)localObject).disconnect();
      }
    }
  }
  
  /* Error */
  private int b(URL paramURL, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: aload_1
    //   7: invokestatic 94	com/google/android/gms/common/internal/w:aa	(Ljava/lang/Object;)Ljava/lang/Object;
    //   10: pop
    //   11: aload_2
    //   12: invokestatic 94	com/google/android/gms/common/internal/w:aa	(Ljava/lang/Object;)Ljava/lang/Object;
    //   15: pop
    //   16: new 262	java/io/ByteArrayOutputStream
    //   19: dup
    //   20: invokespecial 263	java/io/ByteArrayOutputStream:<init>	()V
    //   23: astore 6
    //   25: new 265	java/util/zip/GZIPOutputStream
    //   28: dup
    //   29: aload 6
    //   31: invokespecial 268	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   34: astore 7
    //   36: aload 7
    //   38: aload_2
    //   39: invokevirtual 269	java/util/zip/GZIPOutputStream:write	([B)V
    //   42: aload 7
    //   44: invokevirtual 270	java/util/zip/GZIPOutputStream:close	()V
    //   47: aload 6
    //   49: invokevirtual 271	java/io/ByteArrayOutputStream:close	()V
    //   52: aload 6
    //   54: invokevirtual 274	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   57: astore 6
    //   59: aload_0
    //   60: iconst_3
    //   61: ldc_w 276
    //   64: aload 6
    //   66: arraylength
    //   67: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   70: ldc2_w 277
    //   73: aload 6
    //   75: arraylength
    //   76: i2l
    //   77: lmul
    //   78: aload_2
    //   79: arraylength
    //   80: i2l
    //   81: ldiv
    //   82: invokestatic 283	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   85: aload_1
    //   86: invokespecial 286	com/google/android/gms/analytics/internal/n:a	(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   89: aload 6
    //   91: arraylength
    //   92: aload_2
    //   93: arraylength
    //   94: if_icmple +21 -> 115
    //   97: aload_0
    //   98: ldc_w 288
    //   101: aload 6
    //   103: arraylength
    //   104: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   107: aload_2
    //   108: arraylength
    //   109: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   112: invokevirtual 290	com/google/android/gms/analytics/internal/h:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   115: invokestatic 110	com/google/android/gms/analytics/internal/h:iB	()Z
    //   118: ifeq +33 -> 151
    //   121: aload_0
    //   122: ldc_w 292
    //   125: new 197	java/lang/StringBuilder
    //   128: dup
    //   129: ldc 17
    //   131: invokespecial 293	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   134: new 19	java/lang/String
    //   137: dup
    //   138: aload_2
    //   139: invokespecial 115	java/lang/String:<init>	([B)V
    //   142: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: invokevirtual 215	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   148: invokevirtual 118	com/google/android/gms/analytics/internal/h:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   151: aload_0
    //   152: aload_1
    //   153: invokespecial 121	com/google/android/gms/analytics/internal/h:c	(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    //   156: astore_1
    //   157: aload_1
    //   158: iconst_1
    //   159: invokevirtual 127	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   162: aload_1
    //   163: ldc_w 295
    //   166: ldc_w 297
    //   169: invokevirtual 301	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   172: aload_1
    //   173: aload 6
    //   175: arraylength
    //   176: invokevirtual 131	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   179: aload_1
    //   180: invokevirtual 134	java/net/HttpURLConnection:connect	()V
    //   183: aload_1
    //   184: invokevirtual 138	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   187: astore_2
    //   188: aload_2
    //   189: aload 6
    //   191: invokevirtual 143	java/io/OutputStream:write	([B)V
    //   194: aload_2
    //   195: invokevirtual 173	java/io/OutputStream:close	()V
    //   198: aload_0
    //   199: aload_1
    //   200: invokespecial 146	com/google/android/gms/analytics/internal/h:a	(Ljava/net/HttpURLConnection;)V
    //   203: aload_1
    //   204: invokevirtual 150	java/net/HttpURLConnection:getResponseCode	()I
    //   207: istore_3
    //   208: iload_3
    //   209: sipush 200
    //   212: if_icmpne +13 -> 225
    //   215: aload_0
    //   216: getfield 156	com/google/android/gms/analytics/internal/n:ack	Lcom/google/android/gms/analytics/internal/q;
    //   219: invokevirtual 160	com/google/android/gms/analytics/internal/q:iG	()Lcom/google/android/gms/analytics/internal/m;
    //   222: invokevirtual 165	com/google/android/gms/analytics/internal/m:ix	()V
    //   225: aload_0
    //   226: ldc -89
    //   228: iload_3
    //   229: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   232: invokevirtual 170	com/google/android/gms/analytics/internal/h:d	(Ljava/lang/String;Ljava/lang/Object;)V
    //   235: aload_1
    //   236: ifnull +7 -> 243
    //   239: aload_1
    //   240: invokevirtual 176	java/net/HttpURLConnection:disconnect	()V
    //   243: iload_3
    //   244: ireturn
    //   245: astore 4
    //   247: aconst_null
    //   248: astore_1
    //   249: aload 5
    //   251: astore_2
    //   252: aload_0
    //   253: ldc_w 303
    //   256: aload 4
    //   258: invokevirtual 186	com/google/android/gms/analytics/internal/h:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   261: aload_1
    //   262: ifnull +7 -> 269
    //   265: aload_1
    //   266: invokevirtual 173	java/io/OutputStream:close	()V
    //   269: aload_2
    //   270: ifnull +7 -> 277
    //   273: aload_2
    //   274: invokevirtual 176	java/net/HttpURLConnection:disconnect	()V
    //   277: iconst_0
    //   278: ireturn
    //   279: astore_1
    //   280: aload_0
    //   281: ldc_w 305
    //   284: aload_1
    //   285: invokevirtual 181	com/google/android/gms/analytics/internal/h:f	(Ljava/lang/String;Ljava/lang/Object;)V
    //   288: goto -19 -> 269
    //   291: astore_2
    //   292: aconst_null
    //   293: astore_1
    //   294: aload 4
    //   296: ifnull +8 -> 304
    //   299: aload 4
    //   301: invokevirtual 173	java/io/OutputStream:close	()V
    //   304: aload_1
    //   305: ifnull +7 -> 312
    //   308: aload_1
    //   309: invokevirtual 176	java/net/HttpURLConnection:disconnect	()V
    //   312: aload_2
    //   313: athrow
    //   314: astore 4
    //   316: aload_0
    //   317: ldc_w 305
    //   320: aload 4
    //   322: invokevirtual 181	com/google/android/gms/analytics/internal/h:f	(Ljava/lang/String;Ljava/lang/Object;)V
    //   325: goto -21 -> 304
    //   328: astore_2
    //   329: goto -35 -> 294
    //   332: astore 5
    //   334: aload_2
    //   335: astore 4
    //   337: aload 5
    //   339: astore_2
    //   340: goto -46 -> 294
    //   343: astore 6
    //   345: aload_2
    //   346: astore 4
    //   348: aload_1
    //   349: astore 5
    //   351: aload 6
    //   353: astore_2
    //   354: aload 4
    //   356: astore_1
    //   357: aload 5
    //   359: astore 4
    //   361: goto -67 -> 294
    //   364: astore 4
    //   366: aconst_null
    //   367: astore 5
    //   369: aload_1
    //   370: astore_2
    //   371: aload 5
    //   373: astore_1
    //   374: goto -122 -> 252
    //   377: astore 4
    //   379: aload_1
    //   380: astore 5
    //   382: aload_2
    //   383: astore_1
    //   384: aload 5
    //   386: astore_2
    //   387: goto -135 -> 252
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	390	0	this	h
    //   0	390	1	paramURL	URL
    //   0	390	2	paramArrayOfByte	byte[]
    //   207	37	3	i	int
    //   1	1	4	localObject1	Object
    //   245	55	4	localIOException1	IOException
    //   314	7	4	localIOException2	IOException
    //   335	25	4	localObject2	Object
    //   364	1	4	localIOException3	IOException
    //   377	1	4	localIOException4	IOException
    //   4	246	5	localObject3	Object
    //   332	6	5	localObject4	Object
    //   349	36	5	localURL	URL
    //   23	167	6	localObject5	Object
    //   343	9	6	localObject6	Object
    //   34	9	7	localGZIPOutputStream	java.util.zip.GZIPOutputStream
    // Exception table:
    //   from	to	target	type
    //   16	115	245	java/io/IOException
    //   115	151	245	java/io/IOException
    //   151	157	245	java/io/IOException
    //   265	269	279	java/io/IOException
    //   16	115	291	finally
    //   115	151	291	finally
    //   151	157	291	finally
    //   299	304	314	java/io/IOException
    //   157	188	328	finally
    //   198	208	328	finally
    //   215	225	328	finally
    //   225	235	328	finally
    //   188	198	332	finally
    //   252	261	343	finally
    //   157	188	364	java/io/IOException
    //   198	208	364	java/io/IOException
    //   215	225	364	java/io/IOException
    //   225	235	364	java/io/IOException
    //   188	198	377	java/io/IOException
  }
  
  private URL b(c paramc, String paramString)
  {
    if (paramc.acc) {}
    for (paramc = ac.jo() + ac.jq() + "?" + paramString;; paramc = ac.jp() + ac.jq() + "?" + paramString) {
      try
      {
        paramc = new URL(paramc);
        return paramc;
      }
      catch (MalformedURLException paramc)
      {
        f("Error trying to parse the hardcoded host url", paramc);
      }
    }
    return null;
  }
  
  private HttpURLConnection c(URL paramURL)
  {
    paramURL = paramURL.openConnection();
    if (!(paramURL instanceof HttpURLConnection)) {
      throw new IOException("Failed to obtain http connection");
    }
    paramURL = (HttpURLConnection)paramURL;
    paramURL.setDefaultUseCaches(false);
    paramURL.setConnectTimeout(((Integer)aj.aeS.get()).intValue());
    paramURL.setReadTimeout(((Integer)aj.aeT.get()).intValue());
    paramURL.setInstanceFollowRedirects(false);
    paramURL.setRequestProperty("User-Agent", this.acn);
    paramURL.setDoInput(true);
    return paramURL;
  }
  
  private URL id()
  {
    Object localObject = ac.jo() + (String)aj.aeH.get();
    try
    {
      localObject = new URL((String)localObject);
      return (URL)localObject;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      f("Error trying to parse the hardcoded host url", localMalformedURLException);
    }
    return null;
  }
  
  private List<Long> k(List<c> paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    paramList = paramList.iterator();
    c localc;
    boolean bool;
    label58:
    Object localObject;
    int i;
    if (paramList.hasNext())
    {
      localc = (c)paramList.next();
      w.aa(localc);
      if (localc.acc) {
        break label125;
      }
      bool = true;
      localObject = a(localc, bool);
      if (localObject != null) {
        break label130;
      }
      this.ack.iE().a(localc, "Error formatting hit for upload");
      i = 1;
    }
    for (;;)
    {
      if (i != 0)
      {
        localArrayList.add(Long.valueOf(localc.abZ));
        if (localArrayList.size() < ac.jm()) {
          break;
        }
      }
      return localArrayList;
      label125:
      bool = false;
      break label58;
      label130:
      if (((String)localObject).length() <= ((Integer)aj.aeI.get()).intValue())
      {
        localObject = b(localc, (String)localObject);
        if (localObject == null) {
          R("Failed to build collect GET endpoint url");
        }
      }
      URL localURL;
      label301:
      do
      {
        for (;;)
        {
          i = 0;
          break;
          if (b((URL)localObject) == 200)
          {
            i = 1;
            break;
          }
          i = 0;
          break;
          localObject = a(localc, false);
          if (localObject == null)
          {
            this.ack.iE().a(localc, "Error formatting hit for POST upload");
            i = 1;
            break;
          }
          localObject = ((String)localObject).getBytes();
          if (localObject.length > ((Integer)aj.aeN.get()).intValue())
          {
            this.ack.iE().a(localc, "Hit payload exceeds size limit");
            i = 1;
            break;
          }
          localURL = a(localc);
          if (localURL != null) {
            break label301;
          }
          R("Failed to build collect POST endpoint url");
        }
      } while (a(localURL, (byte[])localObject) != 200);
      i = 1;
    }
  }
  
  final String a(c paramc, boolean paramBoolean)
  {
    w.aa(paramc);
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      Iterator localIterator = paramc.abX.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        String str = (String)localEntry.getKey();
        if ((!"ht".equals(str)) && (!"qt".equals(str)) && (!"AppUID".equals(str)) && (!"z".equals(str)) && (!"_gmsv".equals(str))) {
          a(localStringBuilder, str, (String)localEntry.getValue());
        }
      }
      a(localStringBuilder, "ht", String.valueOf(paramc.aca));
    }
    catch (UnsupportedEncodingException paramc)
    {
      f("Failed to encode name or value", paramc);
      return null;
    }
    a(localStringBuilder, "qt", String.valueOf(this.ack.acz.currentTimeMillis() - paramc.aca));
    if (com.google.android.gms.common.internal.f.akn) {
      a(localStringBuilder, "_gmsv", p.VERSION);
    }
    long l;
    if (paramBoolean)
    {
      l = k.K(paramc.c("_s", "0"));
      if (l == 0L) {
        break label254;
      }
    }
    for (paramc = String.valueOf(l);; paramc = String.valueOf(l))
    {
      a(localStringBuilder, "z", paramc);
      return localStringBuilder.toString();
      label254:
      l = paramc.abZ;
    }
  }
  
  protected final void hS()
  {
    c("Network initialized. User agent", this.acn);
  }
  
  public final boolean ic()
  {
    q.iK();
    iC();
    Object localObject1 = (ConnectivityManager)this.ack.mContext.getSystemService("connectivity");
    try
    {
      localObject1 = ((ConnectivityManager)localObject1).getActiveNetworkInfo();
      if ((localObject1 == null) || (!((NetworkInfo)localObject1).isConnected()))
      {
        N("No network connectivity");
        return false;
      }
    }
    catch (SecurityException localSecurityException)
    {
      for (;;)
      {
        Object localObject2 = null;
      }
    }
    return true;
  }
  
  public final List<Long> j(List<c> paramList)
  {
    boolean bool2 = true;
    q.iK();
    iC();
    w.aa(paramList);
    int j;
    boolean bool1;
    int i;
    if ((this.ack.acS.jr().isEmpty()) || (!this.aco.i(((Integer)aj.aeQ.get()).intValue() * 1000L)))
    {
      j = 0;
      bool1 = false;
      i = j;
      label67:
      if (i == 0) {
        break label380;
      }
      if (paramList.isEmpty()) {
        break label232;
      }
    }
    a locala;
    ArrayList localArrayList;
    for (;;)
    {
      w.af(bool2);
      a("Uploading batched hits. compression, count", Boolean.valueOf(bool1), Integer.valueOf(paramList.size()));
      locala = new a();
      localArrayList = new ArrayList();
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        c localc = (c)paramList.next();
        if (!locala.b(localc)) {
          break;
        }
        localArrayList.add(Long.valueOf(localc.abZ));
      }
      if (x.X((String)aj.aeJ.get()) != x.adO) {}
      for (i = 1;; i = 0)
      {
        j = i;
        if (z.Y((String)aj.aeK.get()) != z.adY) {
          break;
        }
        bool1 = true;
        break label67;
      }
      label232:
      bool2 = false;
    }
    if (locala.acq == 0) {
      return localArrayList;
    }
    paramList = id();
    if (paramList == null) {
      R("Failed to build batching endpoint url");
    }
    for (;;)
    {
      return Collections.emptyList();
      if (bool1) {}
      for (i = b(paramList, locala.acr.toByteArray()); 200 == i; i = a(paramList, locala.acr.toByteArray()))
      {
        c("Batched upload completed. Hits batched", Integer.valueOf(locala.acq));
        return localArrayList;
      }
      c("Network error uploading hits. status code", Integer.valueOf(i));
      if (this.ack.acS.jr().contains(Integer.valueOf(i)))
      {
        Q("Server instructed the client to stop batching");
        this.aco.start();
      }
    }
    label380:
    return k(paramList);
  }
  
  private final class a
  {
    int acq;
    ByteArrayOutputStream acr = new ByteArrayOutputStream();
    
    public a() {}
    
    public final boolean b(c paramc)
    {
      w.aa(paramc);
      if (this.acq + 1 > ac.jn()) {
        return false;
      }
      Object localObject = h.this.a(paramc, false);
      if (localObject == null)
      {
        h.this.ack.iE().a(paramc, "Error formatting hit");
        return true;
      }
      localObject = ((String)localObject).getBytes();
      int j = localObject.length;
      if (j > ac.jj())
      {
        h.this.ack.iE().a(paramc, "Hit size exceeds the maximum size limit");
        return true;
      }
      int i = j;
      if (this.acr.size() > 0) {
        i = j + 1;
      }
      if (this.acr.size() + i > ((Integer)aj.aeO.get()).intValue()) {
        return false;
      }
      try
      {
        if (this.acr.size() > 0) {
          this.acr.write(h.acp);
        }
        this.acr.write((byte[])localObject);
        this.acq += 1;
        return true;
      }
      catch (IOException paramc)
      {
        h.this.f("Failed to write payload when batching hits", paramc);
      }
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */