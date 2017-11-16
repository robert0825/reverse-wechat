package com.tencent.mapsdk.rastercore;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.tencent.mapsdk.rastercore.d.e;
import java.lang.ref.WeakReference;

public class a
{
  public static StringBuffer a = new StringBuffer(300);
  private static final String b = a.class.getSimpleName();
  public static boolean c = false;
  public static WeakReference<e> d = null;
  
  @SuppressLint({"NewApi"})
  public static String a()
  {
    Object localObject2 = "";
    Context localContext = e.a();
    Object localObject1;
    if (Build.VERSION.SDK_INT >= 23)
    {
      localObject1 = localObject2;
      if (localContext != null)
      {
        localObject1 = localObject2;
        if (localContext.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {}
      }
    }
    else
    {
      localObject1 = ((TelephonyManager)localContext.getSystemService("phone")).getDeviceId();
    }
    localObject2 = localObject1;
    if (TextUtils.isEmpty((CharSequence)localObject1)) {
      localObject2 = "noIMEI";
    }
    return (String)localObject2;
  }
  
  public static void a(e parame)
  {
    d = new WeakReference(parame);
    if (c) {
      return;
    }
    new Thread()
    {
      /* Error */
      public final void run()
      {
        // Byte code:
        //   0: iconst_1
        //   1: putstatic 21	com/tencent/mapsdk/rastercore/a:c	Z
        //   4: invokestatic 26	com/tencent/mapsdk/rastercore/d/e:a	()Landroid/content/Context;
        //   7: invokestatic 31	com/tencent/mapsdk/rastercore/f/a:a	(Landroid/content/Context;)Ljava/lang/String;
        //   10: astore 5
        //   12: aload 5
        //   14: ldc 33
        //   16: invokestatic 39	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   19: astore 5
        //   21: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   24: ldc 44
        //   26: invokevirtual 50	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   29: pop
        //   30: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   33: aload 5
        //   35: invokevirtual 50	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   38: pop
        //   39: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   42: ldc 52
        //   44: invokevirtual 50	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   47: pop
        //   48: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   51: ldc 54
        //   53: invokevirtual 50	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   56: pop
        //   57: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   60: ldc 56
        //   62: invokevirtual 50	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   65: pop
        //   66: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   69: ldc 58
        //   71: ldc 33
        //   73: invokestatic 39	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   76: invokevirtual 50	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   79: pop
        //   80: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   83: ldc 60
        //   85: invokevirtual 50	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   88: pop
        //   89: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   92: getstatic 66	android/os/Build:MODEL	Ljava/lang/String;
        //   95: ldc 33
        //   97: invokestatic 39	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   100: invokevirtual 50	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   103: pop
        //   104: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   107: ldc 68
        //   109: invokevirtual 50	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   112: pop
        //   113: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   116: getstatic 74	android/os/Build$VERSION:SDK_INT	I
        //   119: invokevirtual 77	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
        //   122: pop
        //   123: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   126: ldc 79
        //   128: invokevirtual 50	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   131: pop
        //   132: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   135: invokestatic 26	com/tencent/mapsdk/rastercore/d/e:a	()Landroid/content/Context;
        //   138: invokevirtual 85	android/content/Context:getPackageName	()Ljava/lang/String;
        //   141: ldc 33
        //   143: invokestatic 39	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   146: invokevirtual 50	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   149: pop
        //   150: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   153: ldc 87
        //   155: invokevirtual 50	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   158: pop
        //   159: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   162: invokestatic 90	com/tencent/mapsdk/rastercore/a:b	()Ljava/lang/String;
        //   165: invokestatic 93	java/net/URLEncoder:encode	(Ljava/lang/String;)Ljava/lang/String;
        //   168: invokevirtual 50	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   171: pop
        //   172: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   175: ldc 95
        //   177: invokevirtual 50	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   180: pop
        //   181: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   184: invokestatic 97	com/tencent/mapsdk/rastercore/a:a	()Ljava/lang/String;
        //   187: invokevirtual 50	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   190: pop
        //   191: invokestatic 26	com/tencent/mapsdk/rastercore/d/e:a	()Landroid/content/Context;
        //   194: invokevirtual 101	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
        //   197: astore 5
        //   199: aload 5
        //   201: invokestatic 26	com/tencent/mapsdk/rastercore/d/e:a	()Landroid/content/Context;
        //   204: invokevirtual 85	android/content/Context:getPackageName	()Ljava/lang/String;
        //   207: iconst_0
        //   208: invokevirtual 107	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //   211: astore 6
        //   213: aload 6
        //   215: getfield 113	android/content/pm/PackageInfo:applicationInfo	Landroid/content/pm/ApplicationInfo;
        //   218: aload 5
        //   220: invokevirtual 119	android/content/pm/ApplicationInfo:loadLabel	(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
        //   223: invokeinterface 124 1 0
        //   228: astore 5
        //   230: aload 6
        //   232: getfield 127	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
        //   235: astore 6
        //   237: aload 6
        //   239: invokestatic 133	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
        //   242: istore 4
        //   244: iload 4
        //   246: ifne +369 -> 615
        //   249: aload 5
        //   251: ifnull +26 -> 277
        //   254: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   257: ldc -121
        //   259: invokevirtual 50	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   262: pop
        //   263: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   266: aload 5
        //   268: ldc 33
        //   270: invokestatic 39	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   273: invokevirtual 50	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   276: pop
        //   277: aload 6
        //   279: ifnull +26 -> 305
        //   282: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   285: ldc -119
        //   287: invokevirtual 50	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   290: pop
        //   291: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   294: aload 6
        //   296: ldc 33
        //   298: invokestatic 39	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   301: invokevirtual 50	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   304: pop
        //   305: invokestatic 26	com/tencent/mapsdk/rastercore/d/e:a	()Landroid/content/Context;
        //   308: invokevirtual 141	android/content/Context:getResources	()Landroid/content/res/Resources;
        //   311: invokevirtual 147	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
        //   314: astore 5
        //   316: aload 5
        //   318: getfield 152	android/util/DisplayMetrics:densityDpi	I
        //   321: istore_1
        //   322: aload 5
        //   324: getfield 155	android/util/DisplayMetrics:widthPixels	I
        //   327: istore_2
        //   328: aload 5
        //   330: getfield 158	android/util/DisplayMetrics:heightPixels	I
        //   333: istore_3
        //   334: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   337: ldc -96
        //   339: invokevirtual 50	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   342: pop
        //   343: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   346: iload_1
        //   347: invokevirtual 77	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
        //   350: pop
        //   351: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   354: ldc -94
        //   356: invokevirtual 50	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   359: pop
        //   360: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   363: iload_2
        //   364: invokevirtual 77	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
        //   367: pop
        //   368: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   371: ldc -92
        //   373: invokevirtual 50	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   376: pop
        //   377: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   380: iload_3
        //   381: invokevirtual 77	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
        //   384: pop
        //   385: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   388: astore 5
        //   390: iconst_0
        //   391: istore_1
        //   392: iload_1
        //   393: iconst_2
        //   394: if_icmpge +139 -> 533
        //   397: new 166	java/net/URL
        //   400: dup
        //   401: new 168	java/lang/StringBuilder
        //   404: dup
        //   405: invokespecial 169	java/lang/StringBuilder:<init>	()V
        //   408: ldc -85
        //   410: invokevirtual 174	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   413: getstatic 42	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   416: invokevirtual 175	java/lang/StringBuffer:toString	()Ljava/lang/String;
        //   419: invokevirtual 174	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   422: invokevirtual 176	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   425: invokespecial 179	java/net/URL:<init>	(Ljava/lang/String;)V
        //   428: invokevirtual 183	java/net/URL:openConnection	()Ljava/net/URLConnection;
        //   431: checkcast 185	java/net/HttpURLConnection
        //   434: astore 5
        //   436: aload 5
        //   438: ldc -69
        //   440: ldc -67
        //   442: invokevirtual 193	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
        //   445: aload 5
        //   447: invokevirtual 197	java/net/HttpURLConnection:getResponseCode	()I
        //   450: sipush 200
        //   453: if_icmpne +120 -> 573
        //   456: aload 5
        //   458: ldc -57
        //   460: invokevirtual 202	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
        //   463: astore 6
        //   465: aload 6
        //   467: ifnull +82 -> 549
        //   470: aload 6
        //   472: invokevirtual 207	java/lang/String:length	()I
        //   475: ifle +74 -> 549
        //   478: aload 6
        //   480: invokevirtual 210	java/lang/String:toLowerCase	()Ljava/lang/String;
        //   483: ldc -67
        //   485: invokevirtual 213	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
        //   488: ifeq +61 -> 549
        //   491: iconst_1
        //   492: istore_2
        //   493: iload_2
        //   494: ifeq +60 -> 554
        //   497: new 215	java/io/BufferedInputStream
        //   500: dup
        //   501: new 217	java/util/zip/GZIPInputStream
        //   504: dup
        //   505: aload 5
        //   507: invokevirtual 221	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
        //   510: invokespecial 224	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
        //   513: invokespecial 225	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
        //   516: astore 5
        //   518: new 204	java/lang/String
        //   521: dup
        //   522: aload 5
        //   524: invokestatic 230	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/InputStream;)[B
        //   527: invokespecial 233	java/lang/String:<init>	([B)V
        //   530: invokestatic 235	com/tencent/mapsdk/rastercore/a:a	(Ljava/lang/String;)V
        //   533: iconst_0
        //   534: putstatic 21	com/tencent/mapsdk/rastercore/a:c	Z
        //   537: return
        //   538: astore 5
        //   540: aconst_null
        //   541: astore 5
        //   543: aconst_null
        //   544: astore 6
        //   546: goto -297 -> 249
        //   549: iconst_0
        //   550: istore_2
        //   551: goto -58 -> 493
        //   554: new 215	java/io/BufferedInputStream
        //   557: dup
        //   558: aload 5
        //   560: invokevirtual 221	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
        //   563: invokespecial 225	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
        //   566: astore 5
        //   568: goto -50 -> 518
        //   571: astore 5
        //   573: iload_1
        //   574: iconst_1
        //   575: iadd
        //   576: istore_1
        //   577: goto -185 -> 392
        //   580: astore 5
        //   582: goto -197 -> 385
        //   585: astore 5
        //   587: goto -282 -> 305
        //   590: astore 5
        //   592: goto -315 -> 277
        //   595: astore 6
        //   597: goto -54 -> 543
        //   600: astore 5
        //   602: goto -430 -> 172
        //   605: astore 5
        //   607: goto -527 -> 80
        //   610: astore 5
        //   612: goto -573 -> 39
        //   615: aconst_null
        //   616: astore 6
        //   618: goto -369 -> 249
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	621	0	this	1
        //   321	256	1	i	int
        //   327	224	2	j	int
        //   333	48	3	k	int
        //   242	3	4	bool	boolean
        //   10	513	5	localObject1	Object
        //   538	1	5	localException1	Exception
        //   541	26	5	localBufferedInputStream	java.io.BufferedInputStream
        //   571	1	5	localException2	Exception
        //   580	1	5	localException3	Exception
        //   585	1	5	localException4	Exception
        //   590	1	5	localException5	Exception
        //   600	1	5	localException6	Exception
        //   605	1	5	localException7	Exception
        //   610	1	5	localException8	Exception
        //   211	334	6	localObject2	Object
        //   595	1	6	localException9	Exception
        //   616	1	6	localObject3	Object
        // Exception table:
        //   from	to	target	type
        //   191	230	538	java/lang/Exception
        //   397	465	571	java/lang/Exception
        //   470	491	571	java/lang/Exception
        //   497	518	571	java/lang/Exception
        //   518	533	571	java/lang/Exception
        //   554	568	571	java/lang/Exception
        //   305	385	580	java/lang/Exception
        //   291	305	585	java/lang/Exception
        //   263	277	590	java/lang/Exception
        //   230	244	595	java/lang/Exception
        //   80	172	600	java/lang/Exception
        //   66	80	605	java/lang/Exception
        //   12	39	610	java/lang/Exception
      }
    }.start();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\rastercore\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */