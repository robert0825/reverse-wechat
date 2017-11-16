package com.tencent.mm.ay;

import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.plugin.ac.a;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.sdk.platformtools.ar.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.h;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

public final class c
{
  private static c gQU;
  private ar gQV;
  
  private c()
  {
    GMTrace.i(302526758912L, 2254);
    this.gQV = null;
    GMTrace.o(302526758912L, 2254);
  }
  
  public static c Kn()
  {
    GMTrace.i(302392541184L, 2253);
    if (gQU == null) {
      gQU = new c();
    }
    c localc = gQU;
    GMTrace.o(302392541184L, 2253);
    return localc;
  }
  
  public static String kF(String paramString)
  {
    GMTrace.i(302660976640L, 2255);
    if (bg.nm(paramString))
    {
      GMTrace.o(302660976640L, 2255);
      return null;
    }
    paramString = h.a(a.yW(), "remark_", g.n((paramString + "ZnVjaw==").getBytes()), ".png", 1);
    GMTrace.o(302660976640L, 2255);
    return paramString;
  }
  
  public static boolean kG(String paramString)
  {
    GMTrace.i(302795194368L, 2256);
    String str = kF(paramString);
    w.d("MicroMsg.RemarkImageStorage", "remove remark image: %s, path:%s", new Object[] { paramString, str });
    boolean bool = new File(str).exists();
    GMTrace.o(302795194368L, 2256);
    return bool;
  }
  
  public static boolean kH(String paramString)
  {
    GMTrace.i(302929412096L, 2257);
    String str = kF(paramString);
    w.d("MicroMsg.RemarkImageStorage", "remove remark image: %s, path:%s", new Object[] { paramString, str });
    boolean bool = b.deleteFile(str);
    GMTrace.o(302929412096L, 2257);
    return bool;
  }
  
  public final void a(String paramString1, String paramString2, a parama)
  {
    GMTrace.i(303197847552L, 2259);
    if ((!bg.nm(paramString2)) && (!kG(paramString1)))
    {
      if ((this.gQV == null) || (this.gQV.Yi())) {
        this.gQV = new ar(1, "download-remark-img", 1);
      }
      this.gQV.c(new b(paramString1, paramString2, parama));
    }
    GMTrace.o(303197847552L, 2259);
  }
  
  public final Bitmap kI(String paramString)
  {
    int j = 0;
    GMTrace.i(303063629824L, 2258);
    paramString = d.U(kF(paramString), 0, 0);
    int i = j;
    if (paramString != null)
    {
      i = j;
      if (!paramString.isRecycled()) {
        i = 1;
      }
    }
    if (i != 0)
    {
      GMTrace.o(303063629824L, 2258);
      return paramString;
    }
    GMTrace.o(303063629824L, 2258);
    return null;
  }
  
  public static abstract interface a
  {
    public abstract void by(boolean paramBoolean);
  }
  
  final class b
    implements ar.a
  {
    private String gKE;
    private String gQW;
    private c.a gQX;
    private boolean success;
    private String username;
    
    public b(String paramString1, String paramString2, c.a parama)
    {
      GMTrace.i(301989888000L, 2250);
      this.success = false;
      this.username = paramString1;
      this.gQW = paramString2;
      this.gQX = parama;
      GMTrace.o(301989888000L, 2250);
    }
    
    /* Error */
    public final boolean Dj()
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore 5
      //   3: aconst_null
      //   4: astore 4
      //   6: ldc2_w 51
      //   9: sipush 2251
      //   12: invokestatic 34	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   15: aload_0
      //   16: getfield 38	com/tencent/mm/ay/c$b:username	Ljava/lang/String;
      //   19: invokestatic 58	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
      //   22: ifeq +14 -> 36
      //   25: ldc2_w 51
      //   28: sipush 2251
      //   31: invokestatic 45	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   34: iconst_0
      //   35: ireturn
      //   36: aload_0
      //   37: aload_0
      //   38: getfield 38	com/tencent/mm/ay/c$b:username	Ljava/lang/String;
      //   41: invokestatic 62	com/tencent/mm/ay/c:kF	(Ljava/lang/String;)Ljava/lang/String;
      //   44: putfield 64	com/tencent/mm/ay/c$b:gKE	Ljava/lang/String;
      //   47: ldc 66
      //   49: astore_3
      //   50: invokestatic 72	com/tencent/mm/kernel/h:xw	()Lcom/tencent/mm/kernel/a;
      //   53: invokevirtual 77	com/tencent/mm/kernel/a:wL	()Z
      //   56: ifeq +61 -> 117
      //   59: getstatic 83	com/tencent/mm/protocal/d:tJC	I
      //   62: istore_1
      //   63: invokestatic 72	com/tencent/mm/kernel/h:xw	()Lcom/tencent/mm/kernel/a;
      //   66: pop
      //   67: ldc 85
      //   69: iconst_4
      //   70: anewarray 4	java/lang/Object
      //   73: dup
      //   74: iconst_0
      //   75: iload_1
      //   76: invokestatic 91	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   79: aastore
      //   80: dup
      //   81: iconst_1
      //   82: invokestatic 95	com/tencent/mm/kernel/a:ww	()I
      //   85: invokestatic 101	com/tencent/mm/a/o:getString	(I)Ljava/lang/String;
      //   88: aastore
      //   89: dup
      //   90: iconst_2
      //   91: invokestatic 107	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
      //   94: invokestatic 113	com/tencent/mm/sdk/platformtools/am:getNetTypeForStat	(Landroid/content/Context;)I
      //   97: invokestatic 91	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   100: aastore
      //   101: dup
      //   102: iconst_3
      //   103: invokestatic 107	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
      //   106: invokestatic 116	com/tencent/mm/sdk/platformtools/am:getStrength	(Landroid/content/Context;)I
      //   109: invokestatic 91	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   112: aastore
      //   113: invokestatic 122	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   116: astore_3
      //   117: ldc 124
      //   119: ldc 126
      //   121: iconst_3
      //   122: anewarray 4	java/lang/Object
      //   125: dup
      //   126: iconst_0
      //   127: aload_0
      //   128: getfield 38	com/tencent/mm/ay/c$b:username	Ljava/lang/String;
      //   131: aastore
      //   132: dup
      //   133: iconst_1
      //   134: aload_3
      //   135: aastore
      //   136: dup
      //   137: iconst_2
      //   138: aload_0
      //   139: getfield 40	com/tencent/mm/ay/c$b:gQW	Ljava/lang/String;
      //   142: aastore
      //   143: invokestatic 132	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   146: aload_0
      //   147: iconst_0
      //   148: putfield 36	com/tencent/mm/ay/c$b:success	Z
      //   151: aload_0
      //   152: getfield 40	com/tencent/mm/ay/c$b:gQW	Ljava/lang/String;
      //   155: aconst_null
      //   156: invokestatic 138	com/tencent/mm/network/b:a	(Ljava/lang/String;Lcom/tencent/mm/network/b$b;)Lcom/tencent/mm/network/u;
      //   159: astore_2
      //   160: aload_2
      //   161: ldc -116
      //   163: invokevirtual 146	com/tencent/mm/network/u:setRequestMethod	(Ljava/lang/String;)V
      //   166: aload_2
      //   167: ldc -108
      //   169: aload_3
      //   170: invokevirtual 152	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   173: aload_2
      //   174: sipush 5000
      //   177: invokevirtual 156	com/tencent/mm/network/u:setConnectTimeout	(I)V
      //   180: aload_2
      //   181: sipush 5000
      //   184: invokevirtual 159	com/tencent/mm/network/u:setReadTimeout	(I)V
      //   187: aload_2
      //   188: invokestatic 162	com/tencent/mm/network/b:a	(Lcom/tencent/mm/network/u;)I
      //   191: ifeq +61 -> 252
      //   194: ldc 124
      //   196: ldc -92
      //   198: iconst_1
      //   199: anewarray 4	java/lang/Object
      //   202: dup
      //   203: iconst_0
      //   204: aload_0
      //   205: getfield 40	com/tencent/mm/ay/c$b:gQW	Ljava/lang/String;
      //   208: aastore
      //   209: invokestatic 167	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   212: aload_2
      //   213: getfield 171	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
      //   216: invokevirtual 176	java/net/HttpURLConnection:disconnect	()V
      //   219: ldc2_w 51
      //   222: sipush 2251
      //   225: invokestatic 45	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   228: iconst_1
      //   229: ireturn
      //   230: astore_2
      //   231: ldc 124
      //   233: ldc -78
      //   235: iconst_1
      //   236: anewarray 4	java/lang/Object
      //   239: dup
      //   240: iconst_0
      //   241: aload_2
      //   242: invokestatic 182	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
      //   245: aastore
      //   246: invokestatic 167	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   249: goto -30 -> 219
      //   252: aload_2
      //   253: invokevirtual 186	com/tencent/mm/network/u:getInputStream	()Ljava/io/InputStream;
      //   256: astore_3
      //   257: aload_3
      //   258: ifnonnull +91 -> 349
      //   261: ldc 124
      //   263: ldc -68
      //   265: iconst_1
      //   266: anewarray 4	java/lang/Object
      //   269: dup
      //   270: iconst_0
      //   271: aload_0
      //   272: getfield 40	com/tencent/mm/ay/c$b:gQW	Ljava/lang/String;
      //   275: aastore
      //   276: invokestatic 132	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   279: aload_2
      //   280: getfield 171	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
      //   283: invokevirtual 176	java/net/HttpURLConnection:disconnect	()V
      //   286: aload_3
      //   287: ifnull +7 -> 294
      //   290: aload_3
      //   291: invokevirtual 193	java/io/InputStream:close	()V
      //   294: ldc2_w 51
      //   297: sipush 2251
      //   300: invokestatic 45	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   303: iconst_1
      //   304: ireturn
      //   305: astore_2
      //   306: ldc 124
      //   308: ldc -78
      //   310: iconst_1
      //   311: anewarray 4	java/lang/Object
      //   314: dup
      //   315: iconst_0
      //   316: aload_2
      //   317: invokestatic 182	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
      //   320: aastore
      //   321: invokestatic 167	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   324: goto -38 -> 286
      //   327: astore_2
      //   328: ldc 124
      //   330: ldc -78
      //   332: iconst_1
      //   333: anewarray 4	java/lang/Object
      //   336: dup
      //   337: iconst_0
      //   338: aload_2
      //   339: invokestatic 182	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
      //   342: aastore
      //   343: invokestatic 167	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   346: goto -52 -> 294
      //   349: sipush 1024
      //   352: newarray <illegal type>
      //   354: astore 5
      //   356: new 195	java/io/FileOutputStream
      //   359: dup
      //   360: new 197	java/lang/StringBuilder
      //   363: dup
      //   364: invokespecial 198	java/lang/StringBuilder:<init>	()V
      //   367: aload_0
      //   368: getfield 64	com/tencent/mm/ay/c$b:gKE	Ljava/lang/String;
      //   371: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   374: ldc -52
      //   376: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   379: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   382: invokespecial 210	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
      //   385: astore 4
      //   387: aload_3
      //   388: aload 5
      //   390: invokevirtual 214	java/io/InputStream:read	([B)I
      //   393: istore_1
      //   394: iload_1
      //   395: iconst_m1
      //   396: if_icmpeq +97 -> 493
      //   399: aload 4
      //   401: aload 5
      //   403: iconst_0
      //   404: iload_1
      //   405: invokevirtual 220	java/io/OutputStream:write	([BII)V
      //   408: goto -21 -> 387
      //   411: astore 6
      //   413: aload_3
      //   414: astore 5
      //   416: aload_2
      //   417: astore_3
      //   418: aload 4
      //   420: astore_2
      //   421: aload 5
      //   423: astore 4
      //   425: aload 6
      //   427: astore 5
      //   429: ldc 124
      //   431: ldc -78
      //   433: iconst_1
      //   434: anewarray 4	java/lang/Object
      //   437: dup
      //   438: iconst_0
      //   439: aload 5
      //   441: invokestatic 182	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
      //   444: aastore
      //   445: invokestatic 167	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   448: aload_0
      //   449: iconst_0
      //   450: putfield 36	com/tencent/mm/ay/c$b:success	Z
      //   453: aload_3
      //   454: ifnull +10 -> 464
      //   457: aload_3
      //   458: getfield 171	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
      //   461: invokevirtual 176	java/net/HttpURLConnection:disconnect	()V
      //   464: aload 4
      //   466: ifnull +8 -> 474
      //   469: aload 4
      //   471: invokevirtual 193	java/io/InputStream:close	()V
      //   474: aload_2
      //   475: ifnull +7 -> 482
      //   478: aload_2
      //   479: invokevirtual 221	java/io/OutputStream:close	()V
      //   482: ldc2_w 51
      //   485: sipush 2251
      //   488: invokestatic 45	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   491: iconst_1
      //   492: ireturn
      //   493: aload_0
      //   494: iconst_1
      //   495: putfield 36	com/tencent/mm/ay/c$b:success	Z
      //   498: aload_2
      //   499: getfield 171	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
      //   502: invokevirtual 176	java/net/HttpURLConnection:disconnect	()V
      //   505: aload_3
      //   506: ifnull +7 -> 513
      //   509: aload_3
      //   510: invokevirtual 193	java/io/InputStream:close	()V
      //   513: aload 4
      //   515: invokevirtual 221	java/io/OutputStream:close	()V
      //   518: goto -36 -> 482
      //   521: astore_2
      //   522: ldc 124
      //   524: ldc -78
      //   526: iconst_1
      //   527: anewarray 4	java/lang/Object
      //   530: dup
      //   531: iconst_0
      //   532: aload_2
      //   533: invokestatic 182	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
      //   536: aastore
      //   537: invokestatic 167	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   540: goto -58 -> 482
      //   543: astore_2
      //   544: ldc 124
      //   546: ldc -78
      //   548: iconst_1
      //   549: anewarray 4	java/lang/Object
      //   552: dup
      //   553: iconst_0
      //   554: aload_2
      //   555: invokestatic 182	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
      //   558: aastore
      //   559: invokestatic 167	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   562: goto -57 -> 505
      //   565: astore_2
      //   566: ldc 124
      //   568: ldc -78
      //   570: iconst_1
      //   571: anewarray 4	java/lang/Object
      //   574: dup
      //   575: iconst_0
      //   576: aload_2
      //   577: invokestatic 182	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
      //   580: aastore
      //   581: invokestatic 167	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   584: goto -71 -> 513
      //   587: astore_3
      //   588: ldc 124
      //   590: ldc -78
      //   592: iconst_1
      //   593: anewarray 4	java/lang/Object
      //   596: dup
      //   597: iconst_0
      //   598: aload_3
      //   599: invokestatic 182	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
      //   602: aastore
      //   603: invokestatic 167	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   606: goto -142 -> 464
      //   609: astore_3
      //   610: ldc 124
      //   612: ldc -78
      //   614: iconst_1
      //   615: anewarray 4	java/lang/Object
      //   618: dup
      //   619: iconst_0
      //   620: aload_3
      //   621: invokestatic 182	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
      //   624: aastore
      //   625: invokestatic 167	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   628: goto -154 -> 474
      //   631: astore_2
      //   632: ldc 124
      //   634: ldc -78
      //   636: iconst_1
      //   637: anewarray 4	java/lang/Object
      //   640: dup
      //   641: iconst_0
      //   642: aload_2
      //   643: invokestatic 182	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
      //   646: aastore
      //   647: invokestatic 167	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   650: goto -168 -> 482
      //   653: astore_3
      //   654: aconst_null
      //   655: astore 4
      //   657: aconst_null
      //   658: astore_2
      //   659: aload_2
      //   660: ifnull +10 -> 670
      //   663: aload_2
      //   664: getfield 171	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
      //   667: invokevirtual 176	java/net/HttpURLConnection:disconnect	()V
      //   670: aload 5
      //   672: ifnull +8 -> 680
      //   675: aload 5
      //   677: invokevirtual 193	java/io/InputStream:close	()V
      //   680: aload 4
      //   682: ifnull +8 -> 690
      //   685: aload 4
      //   687: invokevirtual 221	java/io/OutputStream:close	()V
      //   690: aload_3
      //   691: athrow
      //   692: astore_2
      //   693: ldc 124
      //   695: ldc -78
      //   697: iconst_1
      //   698: anewarray 4	java/lang/Object
      //   701: dup
      //   702: iconst_0
      //   703: aload_2
      //   704: invokestatic 182	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
      //   707: aastore
      //   708: invokestatic 167	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   711: goto -41 -> 670
      //   714: astore_2
      //   715: ldc 124
      //   717: ldc -78
      //   719: iconst_1
      //   720: anewarray 4	java/lang/Object
      //   723: dup
      //   724: iconst_0
      //   725: aload_2
      //   726: invokestatic 182	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
      //   729: aastore
      //   730: invokestatic 167	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   733: goto -53 -> 680
      //   736: astore_2
      //   737: ldc 124
      //   739: ldc -78
      //   741: iconst_1
      //   742: anewarray 4	java/lang/Object
      //   745: dup
      //   746: iconst_0
      //   747: aload_2
      //   748: invokestatic 182	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
      //   751: aastore
      //   752: invokestatic 167	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   755: goto -65 -> 690
      //   758: astore_3
      //   759: aconst_null
      //   760: astore 4
      //   762: goto -103 -> 659
      //   765: astore 6
      //   767: aconst_null
      //   768: astore 4
      //   770: aload_3
      //   771: astore 5
      //   773: aload 6
      //   775: astore_3
      //   776: goto -117 -> 659
      //   779: astore 6
      //   781: aload_3
      //   782: astore 5
      //   784: aload 6
      //   786: astore_3
      //   787: goto -128 -> 659
      //   790: astore 5
      //   792: aload_3
      //   793: astore 6
      //   795: aload 5
      //   797: astore_3
      //   798: aload 4
      //   800: astore 5
      //   802: aload_2
      //   803: astore 4
      //   805: aload 6
      //   807: astore_2
      //   808: goto -149 -> 659
      //   811: astore 5
      //   813: aconst_null
      //   814: astore_2
      //   815: aconst_null
      //   816: astore_3
      //   817: goto -388 -> 429
      //   820: astore 5
      //   822: aconst_null
      //   823: astore 6
      //   825: aload_2
      //   826: astore_3
      //   827: aload 6
      //   829: astore_2
      //   830: goto -401 -> 429
      //   833: astore 5
      //   835: aload_2
      //   836: astore 6
      //   838: aconst_null
      //   839: astore_2
      //   840: aload_3
      //   841: astore 4
      //   843: aload 6
      //   845: astore_3
      //   846: goto -417 -> 429
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	849	0	this	b
      //   62	343	1	i	int
      //   159	54	2	localu	com.tencent.mm.network.u
      //   230	50	2	localException1	Exception
      //   305	12	2	localException2	Exception
      //   327	90	2	localException3	Exception
      //   420	79	2	localObject1	Object
      //   521	12	2	localException4	Exception
      //   543	12	2	localException5	Exception
      //   565	12	2	localException6	Exception
      //   631	12	2	localException7	Exception
      //   658	6	2	localObject2	Object
      //   692	12	2	localException8	Exception
      //   714	12	2	localException9	Exception
      //   736	67	2	localException10	Exception
      //   807	33	2	localObject3	Object
      //   49	461	3	localObject4	Object
      //   587	12	3	localException11	Exception
      //   609	12	3	localException12	Exception
      //   653	38	3	localObject5	Object
      //   758	13	3	localObject6	Object
      //   775	71	3	localObject7	Object
      //   4	838	4	localObject8	Object
      //   1	782	5	localObject9	Object
      //   790	6	5	localObject10	Object
      //   800	1	5	localObject11	Object
      //   811	1	5	localException13	Exception
      //   820	1	5	localException14	Exception
      //   833	1	5	localException15	Exception
      //   411	15	6	localException16	Exception
      //   765	9	6	localObject12	Object
      //   779	6	6	localObject13	Object
      //   793	51	6	localObject14	Object
      // Exception table:
      //   from	to	target	type
      //   212	219	230	java/lang/Exception
      //   279	286	305	java/lang/Exception
      //   290	294	327	java/lang/Exception
      //   387	394	411	java/lang/Exception
      //   399	408	411	java/lang/Exception
      //   493	498	411	java/lang/Exception
      //   513	518	521	java/lang/Exception
      //   498	505	543	java/lang/Exception
      //   509	513	565	java/lang/Exception
      //   457	464	587	java/lang/Exception
      //   469	474	609	java/lang/Exception
      //   478	482	631	java/lang/Exception
      //   151	160	653	finally
      //   663	670	692	java/lang/Exception
      //   675	680	714	java/lang/Exception
      //   685	690	736	java/lang/Exception
      //   160	212	758	finally
      //   252	257	758	finally
      //   261	279	765	finally
      //   349	387	765	finally
      //   387	394	779	finally
      //   399	408	779	finally
      //   493	498	779	finally
      //   429	453	790	finally
      //   151	160	811	java/lang/Exception
      //   160	212	820	java/lang/Exception
      //   252	257	820	java/lang/Exception
      //   261	279	833	java/lang/Exception
      //   349	387	833	java/lang/Exception
    }
    
    public final boolean Dk()
    {
      GMTrace.i(302258323456L, 2252);
      if (!this.success)
      {
        this.gQX.by(false);
        GMTrace.o(302258323456L, 2252);
        return false;
      }
      b.deleteFile(this.gKE);
      new File(this.gKE + ".tmp").renameTo(new File(this.gKE));
      this.gQX.by(true);
      GMTrace.o(302258323456L, 2252);
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ay\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */