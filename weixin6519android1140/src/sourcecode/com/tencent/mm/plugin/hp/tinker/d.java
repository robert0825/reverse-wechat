package com.tencent.mm.plugin.hp.tinker;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.app.MMApplicationLike;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.tinker.lib.d.c;
import com.tencent.tinker.lib.e.a.a;
import com.tencent.tinker.loader.app.ApplicationLike;

public final class d
{
  private static boolean mhC;
  
  static
  {
    GMTrace.i(5752571822080L, 42860);
    mhC = false;
    GMTrace.o(5752571822080L, 42860);
  }
  
  public static void Af(String paramString)
  {
    GMTrace.i(5752437604352L, 42859);
    if (!mhC) {
      throw new RuntimeException("upgrade patch but tinker is not installed");
    }
    c.bM(MMApplicationLike.getTinkerApplicationLike().getApplication(), paramString);
    GMTrace.o(5752437604352L, 42859);
  }
  
  /* Error */
  public static void a(ApplicationLike paramApplicationLike)
  {
    // Byte code:
    //   0: ldc2_w 60
    //   3: ldc 62
    //   5: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: ldc 64
    //   10: ldc 66
    //   12: invokestatic 71	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   15: getstatic 21	com/tencent/mm/plugin/hp/tinker/d:mhC	Z
    //   18: ifeq +19 -> 37
    //   21: ldc 64
    //   23: ldc 73
    //   25: invokestatic 76	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   28: ldc2_w 60
    //   31: ldc 62
    //   33: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   36: return
    //   37: invokestatic 82	com/tencent/mm/kernel/a:wM	()I
    //   40: istore_1
    //   41: iload_1
    //   42: i2l
    //   43: ldc2_w 83
    //   46: land
    //   47: lstore_2
    //   48: ldc 64
    //   50: ldc 86
    //   52: iconst_1
    //   53: anewarray 4	java/lang/Object
    //   56: dup
    //   57: iconst_0
    //   58: lload_2
    //   59: invokestatic 92	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   62: invokestatic 98	com/tencent/mm/sdk/platformtools/bg:SJ	(Ljava/lang/String;)Ljava/lang/String;
    //   65: aastore
    //   66: invokestatic 101	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   69: new 103	com/tinkerboots/sdk/a$a
    //   72: dup
    //   73: aload_0
    //   74: invokespecial 105	com/tinkerboots/sdk/a$a:<init>	(Lcom/tencent/tinker/loader/app/ApplicationLike;)V
    //   77: astore 5
    //   79: new 107	com/tencent/mm/plugin/hp/tinker/c
    //   82: dup
    //   83: aload_0
    //   84: invokevirtual 49	com/tencent/tinker/loader/app/ApplicationLike:getApplication	()Landroid/app/Application;
    //   87: invokespecial 110	com/tencent/mm/plugin/hp/tinker/c:<init>	(Landroid/content/Context;)V
    //   90: astore 6
    //   92: aload 5
    //   94: getfield 114	com/tinkerboots/sdk/a$a:ygs	Lcom/tencent/tinker/lib/c/c;
    //   97: ifnull +33 -> 130
    //   100: new 116	com/tencent/tinker/loader/TinkerRuntimeException
    //   103: dup
    //   104: ldc 118
    //   106: invokespecial 119	com/tencent/tinker/loader/TinkerRuntimeException:<init>	(Ljava/lang/String;)V
    //   109: athrow
    //   110: astore 5
    //   112: lconst_0
    //   113: lstore_2
    //   114: ldc 64
    //   116: aload 5
    //   118: ldc 121
    //   120: iconst_0
    //   121: anewarray 4	java/lang/Object
    //   124: invokestatic 125	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   127: goto -58 -> 69
    //   130: aload 5
    //   132: aload 6
    //   134: putfield 114	com/tinkerboots/sdk/a$a:ygs	Lcom/tencent/tinker/lib/c/c;
    //   137: new 127	com/tencent/mm/plugin/hp/tinker/e
    //   140: dup
    //   141: aload_0
    //   142: invokevirtual 49	com/tencent/tinker/loader/app/ApplicationLike:getApplication	()Landroid/app/Application;
    //   145: invokespecial 128	com/tencent/mm/plugin/hp/tinker/e:<init>	(Landroid/content/Context;)V
    //   148: astore 6
    //   150: aload 5
    //   152: getfield 132	com/tinkerboots/sdk/a$a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   155: ifnull +13 -> 168
    //   158: new 116	com/tencent/tinker/loader/TinkerRuntimeException
    //   161: dup
    //   162: ldc -122
    //   164: invokespecial 119	com/tencent/tinker/loader/TinkerRuntimeException:<init>	(Ljava/lang/String;)V
    //   167: athrow
    //   168: aload 5
    //   170: aload 6
    //   172: putfield 132	com/tinkerboots/sdk/a$a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   175: new 136	com/tencent/mm/plugin/hp/tinker/b
    //   178: dup
    //   179: aload_0
    //   180: invokevirtual 49	com/tencent/tinker/loader/app/ApplicationLike:getApplication	()Landroid/app/Application;
    //   183: invokespecial 137	com/tencent/mm/plugin/hp/tinker/b:<init>	(Landroid/content/Context;)V
    //   186: astore_0
    //   187: aload 5
    //   189: getfield 141	com/tinkerboots/sdk/a$a:ygr	Lcom/tencent/tinker/lib/a/b;
    //   192: ifnull +13 -> 205
    //   195: new 116	com/tencent/tinker/loader/TinkerRuntimeException
    //   198: dup
    //   199: ldc -113
    //   201: invokespecial 119	com/tencent/tinker/loader/TinkerRuntimeException:<init>	(Ljava/lang/String;)V
    //   204: athrow
    //   205: aload 5
    //   207: aload_0
    //   208: putfield 141	com/tinkerboots/sdk/a$a:ygr	Lcom/tencent/tinker/lib/a/b;
    //   211: aload 5
    //   213: getfield 147	com/tinkerboots/sdk/a$a:yqD	Ljava/lang/Class;
    //   216: ifnull +13 -> 229
    //   219: new 116	com/tencent/tinker/loader/TinkerRuntimeException
    //   222: dup
    //   223: ldc -107
    //   225: invokespecial 119	com/tencent/tinker/loader/TinkerRuntimeException:<init>	(Ljava/lang/String;)V
    //   228: athrow
    //   229: aload 5
    //   231: ldc -105
    //   233: putfield 147	com/tinkerboots/sdk/a$a:yqD	Ljava/lang/Class;
    //   236: aload 5
    //   238: getfield 114	com/tinkerboots/sdk/a$a:ygs	Lcom/tencent/tinker/lib/c/c;
    //   241: ifnonnull +20 -> 261
    //   244: aload 5
    //   246: new 153	com/tinkerboots/sdk/tinker/b/a
    //   249: dup
    //   250: aload 5
    //   252: getfield 157	com/tinkerboots/sdk/a$a:context	Landroid/content/Context;
    //   255: invokespecial 158	com/tinkerboots/sdk/tinker/b/a:<init>	(Landroid/content/Context;)V
    //   258: putfield 114	com/tinkerboots/sdk/a$a:ygs	Lcom/tencent/tinker/lib/c/c;
    //   261: aload 5
    //   263: getfield 132	com/tinkerboots/sdk/a$a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   266: ifnonnull +20 -> 286
    //   269: aload 5
    //   271: new 160	com/tinkerboots/sdk/tinker/b/c
    //   274: dup
    //   275: aload 5
    //   277: getfield 157	com/tinkerboots/sdk/a$a:context	Landroid/content/Context;
    //   280: invokespecial 161	com/tinkerboots/sdk/tinker/b/c:<init>	(Landroid/content/Context;)V
    //   283: putfield 132	com/tinkerboots/sdk/a$a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   286: aload 5
    //   288: getfield 141	com/tinkerboots/sdk/a$a:ygr	Lcom/tencent/tinker/lib/a/b;
    //   291: ifnonnull +20 -> 311
    //   294: aload 5
    //   296: new 163	com/tinkerboots/sdk/tinker/b/b
    //   299: dup
    //   300: aload 5
    //   302: getfield 157	com/tinkerboots/sdk/a$a:context	Landroid/content/Context;
    //   305: invokespecial 164	com/tinkerboots/sdk/tinker/b/b:<init>	(Landroid/content/Context;)V
    //   308: putfield 141	com/tinkerboots/sdk/a$a:ygr	Lcom/tencent/tinker/lib/a/b;
    //   311: aload 5
    //   313: getfield 168	com/tinkerboots/sdk/a$a:yqC	Lcom/tencent/tinker/lib/b/a;
    //   316: ifnonnull +15 -> 331
    //   319: aload 5
    //   321: new 170	com/tencent/tinker/lib/b/f
    //   324: dup
    //   325: invokespecial 172	com/tencent/tinker/lib/b/f:<init>	()V
    //   328: putfield 168	com/tinkerboots/sdk/a$a:yqC	Lcom/tencent/tinker/lib/b/a;
    //   331: aload 5
    //   333: getfield 147	com/tinkerboots/sdk/a$a:yqD	Ljava/lang/Class;
    //   336: ifnonnull +10 -> 346
    //   339: aload 5
    //   341: ldc -82
    //   343: putfield 147	com/tinkerboots/sdk/a$a:yqD	Ljava/lang/Class;
    //   346: aload 5
    //   348: getfield 178	com/tinkerboots/sdk/a$a:yqE	Lcom/tinkerboots/sdk/a/a/b;
    //   351: ifnonnull +15 -> 366
    //   354: aload 5
    //   356: new 180	com/tinkerboots/sdk/a/a/a
    //   359: dup
    //   360: invokespecial 181	com/tinkerboots/sdk/a/a/a:<init>	()V
    //   363: putfield 178	com/tinkerboots/sdk/a$a:yqE	Lcom/tinkerboots/sdk/a/a/b;
    //   366: new 183	com/tinkerboots/sdk/a
    //   369: dup
    //   370: aload 5
    //   372: getfield 157	com/tinkerboots/sdk/a$a:context	Landroid/content/Context;
    //   375: aload 5
    //   377: getfield 187	com/tinkerboots/sdk/a$a:applicationLike	Lcom/tencent/tinker/loader/app/ApplicationLike;
    //   380: aload 5
    //   382: getfield 114	com/tinkerboots/sdk/a$a:ygs	Lcom/tencent/tinker/lib/c/c;
    //   385: aload 5
    //   387: getfield 132	com/tinkerboots/sdk/a$a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   390: aload 5
    //   392: getfield 141	com/tinkerboots/sdk/a$a:ygr	Lcom/tencent/tinker/lib/a/b;
    //   395: aload 5
    //   397: getfield 168	com/tinkerboots/sdk/a$a:yqC	Lcom/tencent/tinker/lib/b/a;
    //   400: aload 5
    //   402: getfield 147	com/tinkerboots/sdk/a$a:yqD	Ljava/lang/Class;
    //   405: aload 5
    //   407: getfield 178	com/tinkerboots/sdk/a$a:yqE	Lcom/tinkerboots/sdk/a/a/b;
    //   410: invokespecial 190	com/tinkerboots/sdk/a:<init>	(Landroid/content/Context;Lcom/tencent/tinker/loader/app/ApplicationLike;Lcom/tencent/tinker/lib/c/c;Lcom/tencent/tinker/lib/c/d;Lcom/tencent/tinker/lib/a/b;Lcom/tencent/tinker/lib/b/a;Ljava/lang/Class;Lcom/tinkerboots/sdk/a/a/b;)V
    //   413: astore_0
    //   414: getstatic 194	com/tinkerboots/sdk/a:yqx	Lcom/tinkerboots/sdk/a;
    //   417: ifnull +13 -> 430
    //   420: new 116	com/tencent/tinker/loader/TinkerRuntimeException
    //   423: dup
    //   424: ldc -60
    //   426: invokespecial 119	com/tencent/tinker/loader/TinkerRuntimeException:<init>	(Ljava/lang/String;)V
    //   429: athrow
    //   430: aload_0
    //   431: putstatic 194	com/tinkerboots/sdk/a:yqx	Lcom/tinkerboots/sdk/a;
    //   434: invokestatic 200	com/tinkerboots/sdk/a:csM	()Lcom/tinkerboots/sdk/a;
    //   437: invokestatic 206	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   440: invokestatic 212	com/tencent/mm/plugin/hp/tinker/g:cI	(Landroid/content/Context;)I
    //   443: invokevirtual 216	com/tinkerboots/sdk/a:Gt	(I)Lcom/tinkerboots/sdk/a;
    //   446: astore_0
    //   447: invokestatic 222	com/tencent/mm/sdk/a/b:bPq	()Z
    //   450: istore 4
    //   452: aload_0
    //   453: getfield 226	com/tinkerboots/sdk/a:yqz	Lcom/tinkerboots/sdk/a/a;
    //   456: ifnull +10 -> 466
    //   459: aload_0
    //   460: getfield 230	com/tinkerboots/sdk/a:yqy	Lcom/tencent/tinker/lib/d/a;
    //   463: ifnonnull +163 -> 626
    //   466: ldc -24
    //   468: ldc -22
    //   470: iconst_0
    //   471: anewarray 4	java/lang/Object
    //   474: invokestatic 239	com/tencent/tinker/lib/e/a:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   477: getstatic 194	com/tinkerboots/sdk/a:yqx	Lcom/tinkerboots/sdk/a;
    //   480: astore_0
    //   481: aload_0
    //   482: ldc -15
    //   484: lload_2
    //   485: invokestatic 92	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   488: invokevirtual 245	com/tinkerboots/sdk/a:fK	(Ljava/lang/String;Ljava/lang/String;)Lcom/tinkerboots/sdk/a;
    //   491: ldc -9
    //   493: getstatic 253	com/tencent/mm/sdk/platformtools/e:CLIENT_VERSION	Ljava/lang/String;
    //   496: invokevirtual 245	com/tinkerboots/sdk/a:fK	(Ljava/lang/String;Ljava/lang/String;)Lcom/tinkerboots/sdk/a;
    //   499: ldc -1
    //   501: getstatic 258	com/tencent/mm/sdk/platformtools/e:REV	Ljava/lang/String;
    //   504: invokevirtual 245	com/tinkerboots/sdk/a:fK	(Ljava/lang/String;Ljava/lang/String;)Lcom/tinkerboots/sdk/a;
    //   507: astore_0
    //   508: invokestatic 206	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   511: invokestatic 264	com/tencent/mm/sdk/platformtools/am:isWifi	(Landroid/content/Context;)Z
    //   514: ifeq +148 -> 662
    //   517: iconst_3
    //   518: istore_1
    //   519: aload_0
    //   520: ldc_w 266
    //   523: iload_1
    //   524: invokestatic 269	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   527: invokevirtual 245	com/tinkerboots/sdk/a:fK	(Ljava/lang/String;Ljava/lang/String;)Lcom/tinkerboots/sdk/a;
    //   530: ldc_w 271
    //   533: getstatic 277	android/os/Build$VERSION:SDK_INT	I
    //   536: invokestatic 269	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   539: invokevirtual 245	com/tinkerboots/sdk/a:fK	(Ljava/lang/String;Ljava/lang/String;)Lcom/tinkerboots/sdk/a;
    //   542: ldc_w 279
    //   545: getstatic 284	com/tencent/mm/protocal/d:tJy	Ljava/lang/String;
    //   548: invokevirtual 245	com/tinkerboots/sdk/a:fK	(Ljava/lang/String;Ljava/lang/String;)Lcom/tinkerboots/sdk/a;
    //   551: ldc_w 286
    //   554: getstatic 289	com/tencent/mm/protocal/d:tJv	Ljava/lang/String;
    //   557: invokevirtual 245	com/tinkerboots/sdk/a:fK	(Ljava/lang/String;Ljava/lang/String;)Lcom/tinkerboots/sdk/a;
    //   560: ldc_w 291
    //   563: getstatic 294	com/tencent/mm/protocal/d:tJA	Ljava/lang/String;
    //   566: invokevirtual 245	com/tinkerboots/sdk/a:fK	(Ljava/lang/String;Ljava/lang/String;)Lcom/tinkerboots/sdk/a;
    //   569: astore_0
    //   570: new 296	com/tencent/mm/plugin/hp/tinker/f
    //   573: dup
    //   574: invokespecial 297	com/tencent/mm/plugin/hp/tinker/f:<init>	()V
    //   577: astore 5
    //   579: aload_0
    //   580: getfield 226	com/tinkerboots/sdk/a:yqz	Lcom/tinkerboots/sdk/a/a;
    //   583: ifnull +10 -> 593
    //   586: aload_0
    //   587: getfield 230	com/tinkerboots/sdk/a:yqy	Lcom/tencent/tinker/lib/d/a;
    //   590: ifnonnull +77 -> 667
    //   593: ldc -24
    //   595: ldc_w 299
    //   598: iconst_0
    //   599: anewarray 4	java/lang/Object
    //   602: invokestatic 239	com/tencent/tinker/lib/e/a:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   605: ldc 64
    //   607: ldc_w 301
    //   610: invokestatic 71	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   613: iconst_1
    //   614: putstatic 21	com/tencent/mm/plugin/hp/tinker/d:mhC	Z
    //   617: ldc2_w 60
    //   620: ldc 62
    //   622: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   625: return
    //   626: ldc -24
    //   628: ldc_w 303
    //   631: iconst_1
    //   632: anewarray 4	java/lang/Object
    //   635: dup
    //   636: iconst_0
    //   637: iload 4
    //   639: invokestatic 308	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   642: aastore
    //   643: invokestatic 309	com/tencent/tinker/lib/e/a:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   646: aload_0
    //   647: getfield 226	com/tinkerboots/sdk/a:yqz	Lcom/tinkerboots/sdk/a/a;
    //   650: iload 4
    //   652: putfield 314	com/tinkerboots/sdk/a/a:yqI	Z
    //   655: getstatic 194	com/tinkerboots/sdk/a:yqx	Lcom/tinkerboots/sdk/a;
    //   658: astore_0
    //   659: goto -178 -> 481
    //   662: iconst_2
    //   663: istore_1
    //   664: goto -145 -> 519
    //   667: ldc -24
    //   669: ldc_w 316
    //   672: iconst_1
    //   673: anewarray 4	java/lang/Object
    //   676: dup
    //   677: iconst_0
    //   678: aload 5
    //   680: invokevirtual 319	java/lang/Object:hashCode	()I
    //   683: invokestatic 324	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   686: aastore
    //   687: invokestatic 309	com/tencent/tinker/lib/e/a:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   690: aload_0
    //   691: getfield 226	com/tinkerboots/sdk/a:yqz	Lcom/tinkerboots/sdk/a/a;
    //   694: aload 5
    //   696: putfield 325	com/tinkerboots/sdk/a/a:yqE	Lcom/tinkerboots/sdk/a/a/b;
    //   699: goto -94 -> 605
    //   702: astore 5
    //   704: goto -590 -> 114
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	707	0	paramApplicationLike	ApplicationLike
    //   40	624	1	i	int
    //   47	438	2	l	long
    //   450	201	4	bool	boolean
    //   77	16	5	locala	com.tinkerboots.sdk.a.a
    //   110	296	5	localException1	Exception
    //   577	118	5	localf	f
    //   702	1	5	localException2	Exception
    //   90	81	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   37	41	110	java/lang/Exception
    //   48	69	702	java/lang/Exception
  }
  
  public static void aHt()
  {
    GMTrace.i(5752169168896L, 42857);
    com.tencent.tinker.lib.e.a.a(new a.a()
    {
      public final void e(String paramAnonymousString1, String paramAnonymousString2, Object... paramAnonymousVarArgs)
      {
        GMTrace.i(5754987741184L, 42878);
        w.e(paramAnonymousString1, paramAnonymousString2, paramAnonymousVarArgs);
        GMTrace.o(5754987741184L, 42878);
      }
      
      public final void i(String paramAnonymousString1, String paramAnonymousString2, Object... paramAnonymousVarArgs)
      {
        GMTrace.i(5754719305728L, 42876);
        w.i(paramAnonymousString1, paramAnonymousString2, paramAnonymousVarArgs);
        GMTrace.o(5754719305728L, 42876);
      }
      
      public final void printErrStackTrace(String paramAnonymousString1, Throwable paramAnonymousThrowable, String paramAnonymousString2, Object... paramAnonymousVarArgs)
      {
        GMTrace.i(5755121958912L, 42879);
        w.printErrStackTrace(paramAnonymousString1, paramAnonymousThrowable, paramAnonymousString2, paramAnonymousVarArgs);
        GMTrace.o(5755121958912L, 42879);
      }
      
      public final void w(String paramAnonymousString1, String paramAnonymousString2, Object... paramAnonymousVarArgs)
      {
        GMTrace.i(5754853523456L, 42877);
        w.w(paramAnonymousString1, paramAnonymousString2, paramAnonymousVarArgs);
        GMTrace.o(5754853523456L, 42877);
      }
    });
    GMTrace.o(5752169168896L, 42857);
  }
  
  public static void aHu()
  {
    GMTrace.i(5752303386624L, 42858);
    if (!mhC) {
      throw new RuntimeException("cleanPatch but tinker is not installed");
    }
    com.tencent.tinker.lib.d.a.hQ(MMApplicationLike.getTinkerApplicationLike().getApplication()).aHu();
    GMTrace.o(5752303386624L, 42858);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\hp\tinker\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */