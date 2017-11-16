package com.tencent.mm.plugin.wenote.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import android.text.Spanned;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.wenote.model.a.h;
import com.tencent.mm.plugin.wenote.model.a.j;
import com.tencent.mm.plugin.wenote.model.a.k;
import com.tencent.mm.plugin.wenote.model.a.n;
import com.tencent.mm.plugin.wenote.model.a.q;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b
{
  public static HashMap<String, String> shF;
  public static HashMap<String, q> shG;
  public static b shH;
  private static com.tencent.mm.a.f<String, Integer> shI;
  
  static
  {
    GMTrace.i(5663451250688L, 42196);
    shF = new HashMap();
    shG = new HashMap();
    shH = null;
    shI = new com.tencent.mm.a.f(30);
    GMTrace.o(5663451250688L, 42196);
  }
  
  public static Bitmap NM(String paramString)
  {
    GMTrace.i(17255836418048L, 128566);
    paramString = com.tencent.mm.pluginsdk.model.c.aO(paramString, false);
    if (paramString != null)
    {
      GMTrace.o(17255836418048L, 128566);
      return paramString;
    }
    if (bg.nm(null))
    {
      GMTrace.o(17255836418048L, 128566);
      return null;
    }
    paramString = com.tencent.mm.pluginsdk.model.c.aO(null, false);
    GMTrace.o(17255836418048L, 128566);
    return paramString;
  }
  
  public static int NN(String paramString)
  {
    GMTrace.i(17256373288960L, 128570);
    if (bg.nm(paramString))
    {
      GMTrace.o(17256373288960L, 128570);
      return 0;
    }
    int i = NP(a.NL(paramString));
    GMTrace.o(17256373288960L, 128570);
    return i;
  }
  
  public static int NO(String paramString)
  {
    GMTrace.i(20647518404608L, 153836);
    if (bg.nm(paramString))
    {
      GMTrace.o(20647518404608L, 153836);
      return 0;
    }
    if (shI.ba(paramString))
    {
      i = ((Integer)shI.get(paramString)).intValue();
      GMTrace.o(20647518404608L, 153836);
      return i;
    }
    int i = NP(paramString);
    shI.put(paramString, Integer.valueOf(i));
    GMTrace.o(20647518404608L, 153836);
    return i;
  }
  
  private static int NP(String paramString)
  {
    int i = 0;
    GMTrace.i(20647652622336L, 153837);
    if (bg.nm(paramString))
    {
      GMTrace.o(20647652622336L, 153837);
      return 0;
    }
    int j = 0;
    if (i < paramString.length())
    {
      if (paramString.charAt(i) <= '') {}
      for (int k = 1;; k = 2)
      {
        j += k;
        i += 1;
        break;
      }
    }
    GMTrace.o(20647652622336L, 153837);
    return j;
  }
  
  public static String NQ(String paramString)
  {
    GMTrace.i(20647921057792L, 153839);
    paramString = Pattern.compile("wx-b>", 2).matcher(paramString).replaceAll("wa-b>");
    paramString = Pattern.compile("</wx-li>", 2).matcher(paramString).replaceAll("<br/>");
    paramString = Pattern.compile("</wn-todo>", 2).matcher(paramString).replaceAll("<br/>");
    paramString = Pattern.compile("<[/]?w(x|n)-[^>]*>", 2).matcher(paramString).replaceAll("");
    paramString = Pattern.compile("wa-b>", 2).matcher(paramString).replaceAll("wx-b>");
    GMTrace.o(20647921057792L, 153839);
    return paramString;
  }
  
  /* Error */
  public static String NR(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 157
    //   3: ldc -97
    //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 161	java/io/FileInputStream
    //   11: dup
    //   12: new 163	java/io/File
    //   15: dup
    //   16: aload_0
    //   17: invokespecial 166	java/io/File:<init>	(Ljava/lang/String;)V
    //   20: invokespecial 169	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   23: astore_1
    //   24: aload_1
    //   25: astore_0
    //   26: aload_1
    //   27: invokevirtual 172	java/io/FileInputStream:available	()I
    //   30: newarray <illegal type>
    //   32: astore_2
    //   33: aload_1
    //   34: astore_0
    //   35: aload_1
    //   36: aload_2
    //   37: invokevirtual 176	java/io/FileInputStream:read	([B)I
    //   40: pop
    //   41: aload_1
    //   42: astore_0
    //   43: new 109	java/lang/String
    //   46: dup
    //   47: aload_2
    //   48: ldc -78
    //   50: invokespecial 181	java/lang/String:<init>	([BLjava/lang/String;)V
    //   53: astore_2
    //   54: aload_1
    //   55: invokevirtual 184	java/io/FileInputStream:close	()V
    //   58: ldc2_w 157
    //   61: ldc -97
    //   63: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   66: aload_2
    //   67: areturn
    //   68: astore_0
    //   69: ldc -70
    //   71: aload_0
    //   72: ldc -107
    //   74: iconst_0
    //   75: anewarray 4	java/lang/Object
    //   78: invokestatic 192	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   81: goto -23 -> 58
    //   84: astore_2
    //   85: aconst_null
    //   86: astore_1
    //   87: aload_1
    //   88: astore_0
    //   89: ldc -70
    //   91: ldc -62
    //   93: iconst_1
    //   94: anewarray 4	java/lang/Object
    //   97: dup
    //   98: iconst_0
    //   99: aload_2
    //   100: invokevirtual 198	java/io/FileNotFoundException:toString	()Ljava/lang/String;
    //   103: aastore
    //   104: invokestatic 202	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   107: aload_1
    //   108: ifnull +7 -> 115
    //   111: aload_1
    //   112: invokevirtual 184	java/io/FileInputStream:close	()V
    //   115: ldc2_w 157
    //   118: ldc -97
    //   120: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   123: ldc -107
    //   125: areturn
    //   126: astore_0
    //   127: ldc -70
    //   129: aload_0
    //   130: ldc -107
    //   132: iconst_0
    //   133: anewarray 4	java/lang/Object
    //   136: invokestatic 192	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   139: goto -24 -> 115
    //   142: astore_2
    //   143: aconst_null
    //   144: astore_1
    //   145: aload_1
    //   146: astore_0
    //   147: ldc -70
    //   149: ldc -52
    //   151: iconst_1
    //   152: anewarray 4	java/lang/Object
    //   155: dup
    //   156: iconst_0
    //   157: aload_2
    //   158: invokevirtual 205	java/io/IOException:toString	()Ljava/lang/String;
    //   161: aastore
    //   162: invokestatic 202	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   165: aload_1
    //   166: ifnull -51 -> 115
    //   169: aload_1
    //   170: invokevirtual 184	java/io/FileInputStream:close	()V
    //   173: goto -58 -> 115
    //   176: astore_0
    //   177: ldc -70
    //   179: aload_0
    //   180: ldc -107
    //   182: iconst_0
    //   183: anewarray 4	java/lang/Object
    //   186: invokestatic 192	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   189: goto -74 -> 115
    //   192: astore_2
    //   193: aconst_null
    //   194: astore_1
    //   195: aload_1
    //   196: astore_0
    //   197: ldc -70
    //   199: ldc -49
    //   201: iconst_1
    //   202: anewarray 4	java/lang/Object
    //   205: dup
    //   206: iconst_0
    //   207: aload_2
    //   208: invokevirtual 208	java/lang/Exception:toString	()Ljava/lang/String;
    //   211: aastore
    //   212: invokestatic 202	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   215: aload_1
    //   216: ifnull -101 -> 115
    //   219: aload_1
    //   220: invokevirtual 184	java/io/FileInputStream:close	()V
    //   223: goto -108 -> 115
    //   226: astore_0
    //   227: ldc -70
    //   229: aload_0
    //   230: ldc -107
    //   232: iconst_0
    //   233: anewarray 4	java/lang/Object
    //   236: invokestatic 192	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   239: goto -124 -> 115
    //   242: astore_1
    //   243: aconst_null
    //   244: astore_0
    //   245: aload_0
    //   246: ifnull +7 -> 253
    //   249: aload_0
    //   250: invokevirtual 184	java/io/FileInputStream:close	()V
    //   253: aload_1
    //   254: athrow
    //   255: astore_0
    //   256: ldc -70
    //   258: aload_0
    //   259: ldc -107
    //   261: iconst_0
    //   262: anewarray 4	java/lang/Object
    //   265: invokestatic 192	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   268: goto -15 -> 253
    //   271: astore_1
    //   272: goto -27 -> 245
    //   275: astore_2
    //   276: goto -81 -> 195
    //   279: astore_2
    //   280: goto -135 -> 145
    //   283: astore_2
    //   284: goto -197 -> 87
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	287	0	paramString	String
    //   23	197	1	localFileInputStream	java.io.FileInputStream
    //   242	12	1	localObject1	Object
    //   271	1	1	localObject2	Object
    //   32	35	2	localObject3	Object
    //   84	16	2	localFileNotFoundException1	java.io.FileNotFoundException
    //   142	16	2	localIOException1	java.io.IOException
    //   192	16	2	localException1	Exception
    //   275	1	2	localException2	Exception
    //   279	1	2	localIOException2	java.io.IOException
    //   283	1	2	localFileNotFoundException2	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   54	58	68	java/io/IOException
    //   8	24	84	java/io/FileNotFoundException
    //   111	115	126	java/io/IOException
    //   8	24	142	java/io/IOException
    //   169	173	176	java/io/IOException
    //   8	24	192	java/lang/Exception
    //   219	223	226	java/io/IOException
    //   8	24	242	finally
    //   249	253	255	java/io/IOException
    //   26	33	271	finally
    //   35	41	271	finally
    //   43	54	271	finally
    //   89	107	271	finally
    //   147	165	271	finally
    //   197	215	271	finally
    //   26	33	275	java/lang/Exception
    //   35	41	275	java/lang/Exception
    //   43	54	275	java/lang/Exception
    //   26	33	279	java/io/IOException
    //   35	41	279	java/io/IOException
    //   43	54	279	java/io/IOException
    //   26	33	283	java/io/FileNotFoundException
    //   35	41	283	java/io/FileNotFoundException
    //   43	54	283	java/io/FileNotFoundException
  }
  
  public static String a(Context paramContext, com.tencent.mm.plugin.wenote.model.a.b paramb)
  {
    GMTrace.i(20647786840064L, 153838);
    if (paramb == null)
    {
      GMTrace.o(20647786840064L, 153838);
      return "";
    }
    int i = paramb.getType();
    if (i == 1)
    {
      paramContext = ((h)paramb).content;
      GMTrace.o(20647786840064L, 153838);
      return paramContext;
    }
    if (i == 3)
    {
      paramContext = paramContext.getString(R.l.ekW);
      GMTrace.o(20647786840064L, 153838);
      return paramContext;
    }
    if (i == 2)
    {
      paramContext = paramContext.getString(R.l.ekV);
      GMTrace.o(20647786840064L, 153838);
      return paramContext;
    }
    if (i == 6)
    {
      paramContext = paramContext.getString(R.l.ekX);
      GMTrace.o(20647786840064L, 153838);
      return paramContext;
    }
    if (i == 4)
    {
      paramContext = paramContext.getString(R.l.ekY);
      GMTrace.o(20647786840064L, 153838);
      return paramContext;
    }
    if (i == 5)
    {
      paramContext = paramContext.getString(R.l.ekU);
      GMTrace.o(20647786840064L, 153838);
      return paramContext;
    }
    GMTrace.o(20647786840064L, 153838);
    return "";
  }
  
  public static com.tencent.mm.plugin.wenote.model.a.b c(com.tencent.mm.plugin.wenote.model.a.b paramb)
  {
    GMTrace.i(17255970635776L, 128567);
    if (paramb == null)
    {
      GMTrace.o(17255970635776L, 128567);
      return null;
    }
    Object localObject1;
    switch (paramb.getType())
    {
    case 0: 
    default: 
      localObject1 = null;
    }
    while (localObject1 == null)
    {
      GMTrace.o(17255970635776L, 128567);
      return null;
      localObject1 = new h();
      ((h)localObject1).content = ((h)paramb).content;
      continue;
      localObject1 = new com.tencent.mm.plugin.wenote.model.a.f();
      Object localObject2 = (com.tencent.mm.plugin.wenote.model.a.f)localObject1;
      Object localObject3 = (com.tencent.mm.plugin.wenote.model.a.f)paramb;
      ((com.tencent.mm.plugin.wenote.model.a.f)localObject2).lat = ((com.tencent.mm.plugin.wenote.model.a.f)localObject3).lat;
      ((com.tencent.mm.plugin.wenote.model.a.f)localObject2).lng = ((com.tencent.mm.plugin.wenote.model.a.f)localObject3).lng;
      ((com.tencent.mm.plugin.wenote.model.a.f)localObject2).sds = ((com.tencent.mm.plugin.wenote.model.a.f)localObject3).sds;
      ((com.tencent.mm.plugin.wenote.model.a.f)localObject2).gEy = ((com.tencent.mm.plugin.wenote.model.a.f)localObject3).gEy;
      ((com.tencent.mm.plugin.wenote.model.a.f)localObject2).mzo = ((com.tencent.mm.plugin.wenote.model.a.f)localObject3).mzo;
      continue;
      localObject1 = new com.tencent.mm.plugin.wenote.model.a.e();
      ((com.tencent.mm.plugin.wenote.model.a.e)localObject1).sdg = ((com.tencent.mm.plugin.wenote.model.a.e)paramb).sdg;
      continue;
      localObject1 = new j();
      localObject2 = (j)localObject1;
      localObject3 = (j)paramb;
      ((j)localObject2).eIy = ((j)localObject3).eIy;
      ((j)localObject2).duration = ((j)localObject3).duration;
      ((j)localObject2).scT = ((j)localObject3).scT;
      continue;
      localObject1 = new k();
      localObject2 = (k)localObject1;
      localObject3 = (k)paramb;
      ((k)localObject2).sdv = ((k)localObject3).sdv;
      ((k)localObject2).length = ((k)localObject3).length;
      ((k)localObject2).sdu = ((k)localObject3).sdu;
      ((k)localObject2).sdc = ((k)localObject3).sdc;
      ((k)localObject2).eIw = ((k)localObject3).eIw;
      ((k)localObject2).eIv = ((k)localObject3).eIv;
      ((k)localObject2).scT = ((k)localObject3).scT;
      continue;
      localObject1 = new com.tencent.mm.plugin.wenote.model.a.c();
      localObject2 = (com.tencent.mm.plugin.wenote.model.a.c)localObject1;
      localObject3 = (com.tencent.mm.plugin.wenote.model.a.c)paramb;
      ((com.tencent.mm.plugin.wenote.model.a.c)localObject2).title = ((com.tencent.mm.plugin.wenote.model.a.c)localObject3).title;
      ((com.tencent.mm.plugin.wenote.model.a.c)localObject2).content = ((com.tencent.mm.plugin.wenote.model.a.c)localObject3).content;
      ((com.tencent.mm.plugin.wenote.model.a.c)localObject2).sdc = ((com.tencent.mm.plugin.wenote.model.a.c)localObject3).sdc;
      ((com.tencent.mm.plugin.wenote.model.a.c)localObject2).scT = ((com.tencent.mm.plugin.wenote.model.a.c)localObject3).scT;
      continue;
      localObject1 = new com.tencent.mm.plugin.wenote.model.a.g();
    }
    ((n)localObject1).type = ((n)paramb).type;
    ((n)localObject1).sdf = ((n)paramb).sdf;
    ((n)localObject1).eOR = ((n)paramb).eOR;
    GMTrace.o(17255970635776L, 128567);
    return (com.tencent.mm.plugin.wenote.model.a.b)localObject1;
  }
  
  public static int d(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(20647384186880L, 153835);
    if (bg.nm(paramString))
    {
      GMTrace.o(20647384186880L, 153835);
      return 0;
    }
    paramString = com.tencent.mm.plugin.wenote.model.nativenote.a.a.NF(paramString);
    if (paramString == null)
    {
      GMTrace.o(20647384186880L, 153835);
      return 0;
    }
    if (paramBoolean) {
      paramInt2 = paramString.length();
    }
    if ((paramInt1 < 0) || (paramInt1 > paramString.length()) || (paramInt2 < 0) || (paramInt2 > paramString.length()) || (paramInt1 > paramInt2))
    {
      GMTrace.o(20647384186880L, 153835);
      return 0;
    }
    paramString = (Spanned)paramString.subSequence(paramInt1, paramInt2);
    if (paramString == null)
    {
      GMTrace.o(20647384186880L, 153835);
      return 0;
    }
    paramInt1 = NP(paramString.toString());
    GMTrace.o(20647384186880L, 153835);
    return paramInt1;
  }
  
  public static String d(com.tencent.mm.plugin.wenote.model.a.b paramb)
  {
    GMTrace.i(17256104853504L, 128568);
    if (paramb == null)
    {
      GMTrace.o(17256104853504L, 128568);
      return "";
    }
    if (paramb.getType() == 2)
    {
      paramb = ((com.tencent.mm.plugin.wenote.model.a.e)paramb).sdg;
      GMTrace.o(17256104853504L, 128568);
      return paramb;
    }
    paramb = ((n)paramb).eOR;
    GMTrace.o(17256104853504L, 128568);
    return paramb;
  }
  
  public static String e(com.tencent.mm.plugin.wenote.model.a.b paramb)
  {
    GMTrace.i(17256239071232L, 128569);
    if (paramb == null)
    {
      GMTrace.o(17256239071232L, 128569);
      return "";
    }
    if (paramb.getType() == 2)
    {
      paramb = ((com.tencent.mm.plugin.wenote.model.a.e)paramb).eOR;
      GMTrace.o(17256239071232L, 128569);
      return paramb;
    }
    if (paramb.getType() == 6)
    {
      paramb = ((j)paramb).eIy;
      GMTrace.o(17256239071232L, 128569);
      return paramb;
    }
    GMTrace.o(17256239071232L, 128569);
    return "";
  }
  
  public static String eA(String paramString1, String paramString2)
  {
    int m = 800;
    GMTrace.i(17255567982592L, 128564);
    if (bg.nm(paramString2))
    {
      paramString2 = com.tencent.mm.a.g.n(new StringBuilder().append(paramString1).append(System.currentTimeMillis()).toString().getBytes()) + "_TH";
      paramString2 = com.tencent.mm.bf.a.Ot() + "/" + paramString2;
    }
    for (;;)
    {
      BitmapFactory.Options localOptions;
      int j;
      int k;
      int i;
      if (!com.tencent.mm.a.e.aZ(paramString2))
      {
        localOptions = d.RB(paramString1);
        if ((localOptions == null) || (localOptions.outWidth <= 0) || (localOptions.outHeight <= 0))
        {
          w.e("MicroMsg.WNNoteUtil", "GetImageOptions Error,use orignal file");
          GMTrace.o(17255567982592L, 128564);
          return null;
        }
        j = localOptions.outHeight;
        k = localOptions.outWidth;
        while (k * j > 2764800)
        {
          k >>= 1;
          j >>= 1;
        }
        i = k;
        if (k > 800) {
          i = 800;
        }
        if (j <= 800) {
          break label257;
        }
        j = m;
      }
      label257:
      for (;;)
      {
        if (localOptions.outHeight < localOptions.outWidth)
        {
          k = j;
          j = i;
        }
        for (;;)
        {
          d.b(paramString1, j, k, Bitmap.CompressFormat.JPEG, 95, paramString2);
          GMTrace.o(17255567982592L, 128564);
          return paramString2;
          k = i;
        }
      }
    }
  }
  
  public static String ez(String paramString1, String paramString2)
  {
    int j = 1280;
    GMTrace.i(17255433764864L, 128563);
    if (bg.nm(paramString2))
    {
      paramString2 = com.tencent.mm.a.g.n(new StringBuilder().append(paramString1).append(System.currentTimeMillis()).toString().getBytes()) + "_HD";
      paramString2 = com.tencent.mm.bf.a.Ot() + "/" + paramString2;
    }
    for (;;)
    {
      BitmapFactory.Options localOptions;
      int k;
      int i;
      if (!com.tencent.mm.a.e.aZ(paramString2))
      {
        localOptions = d.RB(paramString1);
        if ((localOptions == null) || (localOptions.outWidth <= 0) || (localOptions.outHeight <= 0))
        {
          w.e("MicroMsg.WNNoteUtil", "GetImageOptions Error");
          GMTrace.o(17255433764864L, 128563);
          return null;
        }
        k = localOptions.outHeight;
        int m = localOptions.outWidth;
        i = m;
        if (m > 1280) {
          i = 1280;
        }
        if (k <= 1280) {
          break label253;
        }
      }
      for (;;)
      {
        if (localOptions.outHeight < localOptions.outWidth) {}
        for (;;)
        {
          if (d.RC(paramString1) > 0)
          {
            i = localOptions.outHeight;
            j = localOptions.outWidth;
          }
          for (;;)
          {
            d.b(paramString1, i, j, Bitmap.CompressFormat.JPEG, 95, paramString2);
            GMTrace.o(17255433764864L, 128563);
            return paramString2;
          }
          k = j;
          j = i;
          i = k;
        }
        label253:
        j = k;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */