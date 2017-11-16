package com.tencent.mm.plugin.webview.modelcache;

import android.net.Uri;
import android.webkit.URLUtil;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class p
{
  public static String Lt(String paramString)
  {
    GMTrace.i(12361989619712L, 92104);
    if (!sA(paramString))
    {
      GMTrace.o(12361989619712L, 92104);
      return null;
    }
    Object localObject1 = paramString;
    localObject2 = paramString;
    try
    {
      Object localObject3 = new URI(paramString);
      localObject1 = paramString;
      localObject2 = paramString;
      String str3 = bg.nl(((URI)localObject3).getScheme()).toLowerCase();
      localObject1 = paramString;
      localObject2 = paramString;
      String str4 = bg.nl(((URI)localObject3).getHost()).toLowerCase();
      localObject1 = paramString;
      localObject2 = paramString;
      boolean bool = bg.nm(str4);
      if (bool)
      {
        GMTrace.o(12361989619712L, 92104);
        return null;
      }
      localObject1 = paramString;
      localObject2 = paramString;
      int i;
      String str1;
      if (((URI)localObject3).getPort() == -1)
      {
        localObject1 = paramString;
        localObject2 = paramString;
        if (str3.equalsIgnoreCase("http"))
        {
          i = 80;
          localObject1 = paramString;
          localObject2 = paramString;
          if (!bg.nm(((URI)localObject3).getQuery())) {
            break label338;
          }
          str1 = "";
          label153:
          localObject1 = paramString;
          localObject2 = paramString;
          if (!bg.nm(((URI)localObject3).getFragment())) {
            break label368;
          }
        }
      }
      for (String str2 = "";; str2 = "#" + ((URI)localObject3).getFragment())
      {
        localObject1 = paramString;
        localObject2 = paramString;
        localObject3 = bg.nl(((URI)localObject3).getPath());
        localObject1 = paramString;
        localObject2 = paramString;
        str1 = str3 + "://" + str4 + ":" + i + "/" + (String)localObject3 + str1 + str2;
        paramString = str1;
        localObject1 = str1;
        localObject2 = str1;
        if (str1.endsWith("/"))
        {
          localObject1 = str1;
          localObject2 = str1;
          paramString = str1 + "/";
        }
        localObject1 = paramString;
        localObject2 = paramString;
        paramString = Lu(paramString);
        GMTrace.o(12361989619712L, 92104);
        return paramString;
        i = 443;
        break;
        localObject1 = paramString;
        localObject2 = paramString;
        i = ((URI)localObject3).getPort();
        break;
        label338:
        localObject1 = paramString;
        localObject2 = paramString;
        str1 = "?" + ((URI)localObject3).getQuery();
        break label153;
        label368:
        localObject1 = paramString;
        localObject2 = paramString;
      }
      return (String)localObject2;
    }
    catch (URISyntaxException paramString)
    {
      w.e("MicroMsg.WebViewCacheUtils", "getFormattedHttpURL URISyntaxException : %s", new Object[] { paramString.getMessage() });
      GMTrace.o(12361989619712L, 92104);
      return (String)localObject1;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.WebViewCacheUtils", "getFormattedHttpURL normal : %s", new Object[] { paramString.getMessage() });
      GMTrace.o(12361989619712L, 92104);
    }
  }
  
  private static String Lu(String paramString)
  {
    GMTrace.i(12362123837440L, 92105);
    Uri localUri = Uri.parse(paramString);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(localUri.getScheme()).append("://");
    localStringBuilder.append(localUri.getHost()).append(":").append(localUri.getPort());
    if (bg.cc(localUri.getPathSegments())) {
      localStringBuilder.append("/");
    }
    for (;;)
    {
      if (!bg.nm(localUri.getQuery())) {
        localStringBuilder.append("?").append(localUri.getQuery());
      }
      if (!bg.nm(localUri.getFragment())) {
        localStringBuilder.append("#").append(localUri.getFragment());
      }
      if (paramString.endsWith("/")) {
        localStringBuilder.append("/");
      }
      paramString = localStringBuilder.toString();
      GMTrace.o(12362123837440L, 92105);
      return paramString;
      Iterator localIterator = localUri.getPathSegments().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localStringBuilder.append("/").append(str);
      }
    }
  }
  
  public static String Lv(String paramString)
  {
    GMTrace.i(16926734548992L, 126114);
    paramString = Lt(paramString);
    if (bg.nm(paramString))
    {
      GMTrace.o(16926734548992L, 126114);
      return null;
    }
    paramString = Uri.parse(paramString).getHost();
    GMTrace.o(16926734548992L, 126114);
    return paramString;
  }
  
  public static String Lw(String paramString)
  {
    GMTrace.i(12362258055168L, 92106);
    paramString = Lx(paramString);
    if (bg.nm(paramString))
    {
      GMTrace.o(12362258055168L, 92106);
      return null;
    }
    paramString = paramString.replaceAll("http://", "").replaceAll("https://", "");
    GMTrace.o(12362258055168L, 92106);
    return paramString;
  }
  
  public static String Lx(String paramString)
  {
    GMTrace.i(12362392272896L, 92107);
    Object localObject1 = Lt(paramString);
    if (bg.nm((String)localObject1))
    {
      w.e("MicroMsg.WebViewCacheUtils", "evaluateResURLWithScheme, original url is invalid = %s", new Object[] { paramString });
      GMTrace.o(12362392272896L, 92107);
      return null;
    }
    Object localObject2 = Uri.parse((String)localObject1);
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append(((Uri)localObject2).getScheme()).append("://").append(((Uri)localObject2).getHost()).append(":").append(((Uri)localObject2).getPort());
    if (!bg.cc(((Uri)localObject2).getPathSegments()))
    {
      localObject2 = ((Uri)localObject2).getPathSegments().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        String str = (String)((Iterator)localObject2).next();
        ((StringBuilder)localObject1).append("/").append(bg.nl(str));
      }
    }
    if (paramString.endsWith("/")) {
      ((StringBuilder)localObject1).append("/");
    }
    paramString = ((StringBuilder)localObject1).toString();
    GMTrace.o(12362392272896L, 92107);
    return paramString;
  }
  
  /* Error */
  public static byte[] Ly(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc2_w 188
    //   5: ldc -66
    //   7: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: new 192	java/io/ByteArrayOutputStream
    //   13: dup
    //   14: invokespecial 193	java/io/ByteArrayOutputStream:<init>	()V
    //   17: astore_3
    //   18: new 195	java/net/URL
    //   21: dup
    //   22: aload_0
    //   23: invokespecial 196	java/net/URL:<init>	(Ljava/lang/String;)V
    //   26: invokevirtual 200	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   29: checkcast 202	java/net/HttpURLConnection
    //   32: astore 4
    //   34: aload 4
    //   36: ldc -52
    //   38: invokevirtual 207	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   41: ldc 106
    //   43: ldc -47
    //   45: iconst_3
    //   46: anewarray 4	java/lang/Object
    //   49: dup
    //   50: iconst_0
    //   51: aload_0
    //   52: aastore
    //   53: dup
    //   54: iconst_1
    //   55: aload 4
    //   57: invokevirtual 212	java/net/HttpURLConnection:getResponseCode	()I
    //   60: invokestatic 218	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   63: aastore
    //   64: dup
    //   65: iconst_2
    //   66: aload 4
    //   68: invokevirtual 221	java/net/HttpURLConnection:getContentLength	()I
    //   71: invokestatic 218	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   74: aastore
    //   75: invokestatic 224	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   78: aload 4
    //   80: invokevirtual 228	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   83: astore 4
    //   85: aload 4
    //   87: astore_2
    //   88: aload_2
    //   89: ifnull +128 -> 217
    //   92: aload_3
    //   93: astore 4
    //   95: aload_2
    //   96: astore 5
    //   98: sipush 1024
    //   101: newarray <illegal type>
    //   103: astore 6
    //   105: aload_3
    //   106: astore 4
    //   108: aload_2
    //   109: astore 5
    //   111: aload_2
    //   112: aload 6
    //   114: invokevirtual 234	java/io/InputStream:read	([B)I
    //   117: istore_1
    //   118: iload_1
    //   119: iconst_m1
    //   120: if_icmpeq +66 -> 186
    //   123: aload_3
    //   124: astore 4
    //   126: aload_2
    //   127: astore 5
    //   129: aload_3
    //   130: aload 6
    //   132: iconst_0
    //   133: iload_1
    //   134: invokevirtual 238	java/io/ByteArrayOutputStream:write	([BII)V
    //   137: goto -32 -> 105
    //   140: astore 6
    //   142: aload_3
    //   143: astore 4
    //   145: aload_2
    //   146: astore 5
    //   148: ldc 106
    //   150: ldc -16
    //   152: iconst_2
    //   153: anewarray 4	java/lang/Object
    //   156: dup
    //   157: iconst_0
    //   158: aload_0
    //   159: aastore
    //   160: dup
    //   161: iconst_1
    //   162: aload 6
    //   164: aastore
    //   165: invokestatic 117	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   168: aload_2
    //   169: invokestatic 244	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   172: aload_3
    //   173: invokestatic 244	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   176: ldc2_w 188
    //   179: ldc -66
    //   181: invokestatic 26	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   184: aconst_null
    //   185: areturn
    //   186: aload_3
    //   187: astore 4
    //   189: aload_2
    //   190: astore 5
    //   192: aload_3
    //   193: invokevirtual 248	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   196: astore 6
    //   198: aload_2
    //   199: invokestatic 244	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   202: aload_3
    //   203: invokestatic 244	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   206: ldc2_w 188
    //   209: ldc -66
    //   211: invokestatic 26	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   214: aload 6
    //   216: areturn
    //   217: aload_2
    //   218: invokestatic 244	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   221: aload_3
    //   222: invokestatic 244	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   225: goto -49 -> 176
    //   228: astore_0
    //   229: aconst_null
    //   230: astore_3
    //   231: aload_2
    //   232: invokestatic 244	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   235: aload_3
    //   236: invokestatic 244	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   239: aload_0
    //   240: athrow
    //   241: astore_0
    //   242: goto -11 -> 231
    //   245: astore_0
    //   246: aload 5
    //   248: astore_2
    //   249: aload 4
    //   251: astore_3
    //   252: goto -21 -> 231
    //   255: astore 6
    //   257: aconst_null
    //   258: astore_3
    //   259: aconst_null
    //   260: astore_2
    //   261: goto -119 -> 142
    //   264: astore 6
    //   266: aconst_null
    //   267: astore_2
    //   268: goto -126 -> 142
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	271	0	paramString	String
    //   117	17	1	i	int
    //   1	267	2	localObject1	Object
    //   17	242	3	localObject2	Object
    //   32	218	4	localObject3	Object
    //   96	151	5	localObject4	Object
    //   103	28	6	arrayOfByte1	byte[]
    //   140	23	6	localException1	Exception
    //   196	19	6	arrayOfByte2	byte[]
    //   255	1	6	localException2	Exception
    //   264	1	6	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   98	105	140	java/lang/Exception
    //   111	118	140	java/lang/Exception
    //   129	137	140	java/lang/Exception
    //   192	198	140	java/lang/Exception
    //   10	18	228	finally
    //   18	85	241	finally
    //   98	105	245	finally
    //   111	118	245	finally
    //   129	137	245	finally
    //   148	168	245	finally
    //   192	198	245	finally
    //   10	18	255	java/lang/Exception
    //   18	85	264	java/lang/Exception
  }
  
  /* Error */
  public static String Lz(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 252
    //   3: ldc -2
    //   5: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: invokestatic 259	com/tencent/mm/modelsfs/FileOp:aZ	(Ljava/lang/String;)Z
    //   12: ifne +13 -> 25
    //   15: ldc2_w 252
    //   18: ldc -2
    //   20: invokestatic 26	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   23: aconst_null
    //   24: areturn
    //   25: aload_0
    //   26: invokestatic 263	com/tencent/mm/modelsfs/FileOp:kX	(Ljava/lang/String;)J
    //   29: l2i
    //   30: istore_1
    //   31: aload_0
    //   32: invokestatic 267	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   35: astore_3
    //   36: aload_3
    //   37: astore_2
    //   38: aload_3
    //   39: iload_1
    //   40: invokestatic 273	com/tencent/mm/a/g:a	(Ljava/io/InputStream;I)Ljava/lang/String;
    //   43: astore 4
    //   45: aload_3
    //   46: invokestatic 244	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   49: ldc2_w 252
    //   52: ldc -2
    //   54: invokestatic 26	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   57: aload 4
    //   59: areturn
    //   60: astore 4
    //   62: aconst_null
    //   63: astore_3
    //   64: aload_3
    //   65: astore_2
    //   66: ldc 106
    //   68: ldc_w 275
    //   71: iconst_2
    //   72: anewarray 4	java/lang/Object
    //   75: dup
    //   76: iconst_0
    //   77: aload_0
    //   78: aastore
    //   79: dup
    //   80: iconst_1
    //   81: aload 4
    //   83: aastore
    //   84: invokestatic 117	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   87: aload_3
    //   88: invokestatic 244	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   91: ldc2_w 252
    //   94: ldc -2
    //   96: invokestatic 26	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   99: aconst_null
    //   100: areturn
    //   101: astore 4
    //   103: aconst_null
    //   104: astore_3
    //   105: aload_3
    //   106: astore_2
    //   107: ldc 106
    //   109: ldc_w 275
    //   112: iconst_2
    //   113: anewarray 4	java/lang/Object
    //   116: dup
    //   117: iconst_0
    //   118: aload_0
    //   119: aastore
    //   120: dup
    //   121: iconst_1
    //   122: aload 4
    //   124: aastore
    //   125: invokestatic 117	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   128: aload_3
    //   129: invokestatic 244	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   132: ldc2_w 252
    //   135: ldc -2
    //   137: invokestatic 26	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   140: aconst_null
    //   141: areturn
    //   142: astore_0
    //   143: aconst_null
    //   144: astore_2
    //   145: aload_2
    //   146: invokestatic 244	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   149: aload_0
    //   150: athrow
    //   151: astore_0
    //   152: goto -7 -> 145
    //   155: astore 4
    //   157: goto -52 -> 105
    //   160: astore 4
    //   162: goto -98 -> 64
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	165	0	paramString	String
    //   30	10	1	i	int
    //   37	109	2	localInputStream1	java.io.InputStream
    //   35	94	3	localInputStream2	java.io.InputStream
    //   43	15	4	str	String
    //   60	22	4	localFileNotFoundException1	java.io.FileNotFoundException
    //   101	22	4	localException1	Exception
    //   155	1	4	localException2	Exception
    //   160	1	4	localFileNotFoundException2	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   25	36	60	java/io/FileNotFoundException
    //   25	36	101	java/lang/Exception
    //   25	36	142	finally
    //   38	45	151	finally
    //   66	87	151	finally
    //   107	128	151	finally
    //   38	45	155	java/lang/Exception
    //   38	45	160	java/io/FileNotFoundException
  }
  
  public static int a(i parami)
  {
    GMTrace.i(12362794926080L, 92110);
    if (!bg.nl(parami.rUU).equals("cache"))
    {
      GMTrace.o(12362794926080L, 92110);
      return -1;
    }
    if ((Boolean.parseBoolean((String)parami.nSp.get("async"))) && (!bg.nm((String)parami.nSp.get("src"))))
    {
      GMTrace.o(12362794926080L, 92110);
      return 2;
    }
    if (!bg.nm((String)parami.nSp.get("resourceList")))
    {
      GMTrace.o(12362794926080L, 92110);
      return 1;
    }
    GMTrace.o(12362794926080L, 92110);
    return -1;
  }
  
  public static boolean sA(String paramString)
  {
    GMTrace.i(12361855401984L, 92103);
    if ((!bg.nm(paramString)) && ((URLUtil.isHttpsUrl(paramString)) || (URLUtil.isHttpUrl(paramString))))
    {
      GMTrace.o(12361855401984L, 92103);
      return true;
    }
    GMTrace.o(12361855401984L, 92103);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\modelcache\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */