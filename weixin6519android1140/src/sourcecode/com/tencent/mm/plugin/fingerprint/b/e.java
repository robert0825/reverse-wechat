package com.tencent.mm.plugin.fingerprint.b;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.plugin.fingerprint.a;
import com.tencent.mm.plugin.wallet_core.model.ad;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.io.File;

public final class e
{
  private static boolean llb;
  
  static
  {
    GMTrace.i(10779562606592L, 80314);
    llb = false;
    GMTrace.o(10779562606592L, 80314);
  }
  
  public static boolean azF()
  {
    GMTrace.i(10778891517952L, 80309);
    if ((c.azw()) && (azS()) && (llb))
    {
      GMTrace.o(10778891517952L, 80309);
      return true;
    }
    GMTrace.o(10778891517952L, 80309);
    return false;
  }
  
  public static String azN()
  {
    GMTrace.i(10777549340672L, 80299);
    String str = com.tencent.mm.plugin.soter.c.h.bqE();
    GMTrace.o(10777549340672L, 80299);
    return str;
  }
  
  public static void azO()
  {
    GMTrace.i(10777683558400L, 80300);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xy().xh().a(w.a.vrt, Boolean.valueOf(true));
    GMTrace.o(10777683558400L, 80300);
  }
  
  public static boolean azP()
  {
    GMTrace.i(10777817776128L, 80301);
    com.tencent.mm.kernel.h.xz();
    Object localObject = com.tencent.mm.kernel.h.xy().xh().get(w.a.vrt, Boolean.valueOf(false));
    if (localObject != null) {}
    for (boolean bool = ((Boolean)localObject).booleanValue();; bool = false)
    {
      GMTrace.o(10777817776128L, 80301);
      return bool;
    }
  }
  
  public static void azQ()
  {
    GMTrace.i(10777951993856L, 80302);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xy().xh().a(w.a.vru, Boolean.valueOf(true));
    GMTrace.o(10777951993856L, 80302);
  }
  
  public static boolean azR()
  {
    GMTrace.i(16567165255680L, 123435);
    com.tencent.mm.kernel.h.xz();
    Object localObject = com.tencent.mm.kernel.h.xy().xh().get(w.a.vrw, Boolean.FALSE);
    if (localObject != null) {}
    for (boolean bool = ((Boolean)localObject).booleanValue();; bool = false)
    {
      GMTrace.o(16567165255680L, 123435);
      return bool;
    }
  }
  
  public static boolean azS()
  {
    GMTrace.i(10778488864768L, 80306);
    com.tencent.mm.kernel.h.xz();
    Object localObject = com.tencent.mm.kernel.h.xy().xh().get(w.a.vrx, Boolean.valueOf(false));
    if (localObject != null) {}
    for (boolean bool = ((Boolean)localObject).booleanValue();; bool = false)
    {
      GMTrace.o(10778488864768L, 80306);
      return bool;
    }
  }
  
  public static boolean azT()
  {
    GMTrace.i(10778757300224L, 80308);
    boolean bool = llb;
    GMTrace.o(10778757300224L, 80308);
    return bool;
  }
  
  public static boolean azU()
  {
    GMTrace.i(10779025735680L, 80310);
    w.i("MicroMsg.FingerPrintUtil", "isShowFPOpenGuide");
    if (azR())
    {
      w.e("MicroMsg.FingerPrintUtil", "the fingerprint is open ready");
      GMTrace.o(10779025735680L, 80310);
      return false;
    }
    if (!c.azw())
    {
      w.e("MicroMsg.FingerPrintUtil", "device is not support");
      GMTrace.o(10779025735680L, 80310);
      return false;
    }
    if ((n.byx().byP()) || (n.byx().byT()))
    {
      w.e("MicroMsg.FingerPrintUtil", "user had not reg wxpay");
      GMTrace.o(10779025735680L, 80310);
      return false;
    }
    if (!n.byx().byW().byM())
    {
      w.e("MicroMsg.FingerPrintUtil", "isSupportTouchPay is false");
      GMTrace.o(10779025735680L, 80310);
      return false;
    }
    a.azq();
    a.azr();
    if (!c.azy())
    {
      GMTrace.o(10779025735680L, 80310);
      return false;
    }
    if (!azP())
    {
      w.i("MicroMsg.FingerPrintUtil", "will showOpenFingerPrintPayGuide()");
      GMTrace.o(10779025735680L, 80310);
      return true;
    }
    GMTrace.o(10779025735680L, 80310);
    return false;
  }
  
  public static boolean azV()
  {
    GMTrace.i(10779159953408L, 80311);
    w.i("MicroMsg.FingerPrintUtil", "isShowFPSettingGuide");
    if (azR())
    {
      w.e("MicroMsg.FingerPrintUtil", "the fingerprint is open ready");
      GMTrace.o(10779159953408L, 80311);
      return false;
    }
    if (!c.azw())
    {
      w.e("MicroMsg.FingerPrintUtil", "device is not support");
      GMTrace.o(10779159953408L, 80311);
      return false;
    }
    if ((n.byx().byP()) || (n.byx().byT()))
    {
      w.e("MicroMsg.FingerPrintUtil", "user had not reg wxpay");
      GMTrace.o(10779159953408L, 80311);
      return false;
    }
    if (!n.byx().byW().byM())
    {
      w.e("MicroMsg.FingerPrintUtil", "isSupportTouchPay is false");
      GMTrace.o(10779159953408L, 80311);
      return false;
    }
    new c();
    Object localObject;
    if (!c.azy())
    {
      com.tencent.mm.kernel.h.xz();
      localObject = com.tencent.mm.kernel.h.xy().xh().get(w.a.vru, Boolean.valueOf(false));
      if (localObject == null) {
        break label203;
      }
    }
    label203:
    for (boolean bool = ((Boolean)localObject).booleanValue();; bool = false)
    {
      if (!bool)
      {
        w.i("MicroMsg.FingerPrintUtil", "will call showSetFingerPrintGuide()");
        GMTrace.o(10779159953408L, 80311);
        return true;
      }
      GMTrace.o(10779159953408L, 80311);
      return false;
    }
  }
  
  public static final String cs(Context paramContext)
  {
    GMTrace.i(10779294171136L, 80312);
    paramContext = paramContext.getApplicationContext().getFilesDir().getAbsolutePath() + "/b7c9a7fd-851e-7761-07df-8ab7c0b02787.sec";
    GMTrace.o(10779294171136L, 80312);
    return paramContext;
  }
  
  /* Error */
  public static int ct(Context paramContext)
  {
    // Byte code:
    //   0: ldc2_w 239
    //   3: ldc -15
    //   5: invokestatic 17	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: invokestatic 243	com/tencent/mm/plugin/fingerprint/b/e:cs	(Landroid/content/Context;)Ljava/lang/String;
    //   12: astore 7
    //   14: new 220	java/io/File
    //   17: dup
    //   18: aload 7
    //   20: invokespecial 246	java/io/File:<init>	(Ljava/lang/String;)V
    //   23: astore 8
    //   25: aload 8
    //   27: invokevirtual 249	java/io/File:exists	()Z
    //   30: ifne +194 -> 224
    //   33: iconst_1
    //   34: istore_1
    //   35: aconst_null
    //   36: astore_2
    //   37: iload_1
    //   38: ifeq +832 -> 870
    //   41: aload_0
    //   42: invokevirtual 253	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   45: ldc -1
    //   47: invokevirtual 261	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   50: astore_0
    //   51: new 263	java/io/FileOutputStream
    //   54: dup
    //   55: aload 8
    //   57: invokespecial 266	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   60: astore_2
    //   61: aload_2
    //   62: astore 4
    //   64: aload_0
    //   65: astore_3
    //   66: sipush 1024
    //   69: newarray <illegal type>
    //   71: astore 5
    //   73: aload_2
    //   74: astore 4
    //   76: aload_0
    //   77: astore_3
    //   78: aload_0
    //   79: aload 5
    //   81: invokevirtual 272	java/io/InputStream:read	([B)I
    //   84: istore_1
    //   85: iload_1
    //   86: iconst_m1
    //   87: if_icmpeq +390 -> 477
    //   90: aload_2
    //   91: astore 4
    //   93: aload_0
    //   94: astore_3
    //   95: aload_2
    //   96: aload 5
    //   98: iconst_0
    //   99: iload_1
    //   100: invokevirtual 276	java/io/FileOutputStream:write	([BII)V
    //   103: goto -30 -> 73
    //   106: astore 5
    //   108: aload_2
    //   109: astore 4
    //   111: aload_0
    //   112: astore_3
    //   113: ldc -127
    //   115: aload 5
    //   117: ldc_w 278
    //   120: iconst_0
    //   121: anewarray 4	java/lang/Object
    //   124: invokestatic 282	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   127: aload_2
    //   128: astore 4
    //   130: aload_0
    //   131: astore_3
    //   132: ldc -127
    //   134: new 207	java/lang/StringBuilder
    //   137: dup
    //   138: ldc_w 284
    //   141: invokespecial 285	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   144: aload 5
    //   146: invokevirtual 288	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   149: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: invokevirtual 232	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   155: invokestatic 143	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   158: aload_0
    //   159: ifnull +7 -> 166
    //   162: aload_0
    //   163: invokevirtual 291	java/io/InputStream:close	()V
    //   166: aload_2
    //   167: ifnull +698 -> 865
    //   170: aload_2
    //   171: invokevirtual 292	java/io/FileOutputStream:close	()V
    //   174: iconst_m1
    //   175: istore_1
    //   176: invokestatic 298	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   179: new 207	java/lang/StringBuilder
    //   182: dup
    //   183: ldc_w 300
    //   186: invokespecial 285	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   189: aload 7
    //   191: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: invokevirtual 232	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   197: invokevirtual 304	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   200: invokevirtual 310	java/lang/Process:waitFor	()I
    //   203: ifne +584 -> 787
    //   206: ldc -127
    //   208: ldc_w 312
    //   211: invokestatic 136	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   214: ldc2_w 239
    //   217: ldc -15
    //   219: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   222: iload_1
    //   223: ireturn
    //   224: aload 8
    //   226: invokestatic 318	com/tencent/mm/a/g:h	(Ljava/io/File;)Ljava/lang/String;
    //   229: astore 9
    //   231: ldc_w 278
    //   234: astore 5
    //   236: aload_0
    //   237: invokevirtual 253	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   240: ldc -1
    //   242: invokevirtual 261	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   245: astore_2
    //   246: aload 5
    //   248: astore_3
    //   249: aload_2
    //   250: ifnull +17 -> 267
    //   253: aload_2
    //   254: astore_3
    //   255: aload_2
    //   256: sipush 1024
    //   259: invokestatic 321	com/tencent/mm/a/g:a	(Ljava/io/InputStream;I)Ljava/lang/String;
    //   262: astore 4
    //   264: aload 4
    //   266: astore_3
    //   267: aload_3
    //   268: astore 6
    //   270: aload_2
    //   271: astore 4
    //   273: aload_2
    //   274: ifnull +13 -> 287
    //   277: aload_2
    //   278: invokevirtual 291	java/io/InputStream:close	()V
    //   281: aload_2
    //   282: astore 4
    //   284: aload_3
    //   285: astore 6
    //   287: aload 9
    //   289: invokestatic 327	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   292: ifne +153 -> 445
    //   295: aload 6
    //   297: invokestatic 327	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   300: ifne +145 -> 445
    //   303: aload 9
    //   305: aload 6
    //   307: invokevirtual 333	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   310: ifeq +135 -> 445
    //   313: iconst_0
    //   314: istore_1
    //   315: aload 4
    //   317: astore_2
    //   318: goto -281 -> 37
    //   321: astore 4
    //   323: ldc -127
    //   325: aload 4
    //   327: ldc_w 278
    //   330: iconst_0
    //   331: anewarray 4	java/lang/Object
    //   334: invokestatic 282	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   337: aload_3
    //   338: astore 6
    //   340: aload_2
    //   341: astore 4
    //   343: goto -56 -> 287
    //   346: astore 4
    //   348: aconst_null
    //   349: astore_2
    //   350: aload_2
    //   351: astore_3
    //   352: ldc -127
    //   354: aload 4
    //   356: ldc_w 278
    //   359: iconst_0
    //   360: anewarray 4	java/lang/Object
    //   363: invokestatic 282	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   366: aload 5
    //   368: astore 6
    //   370: aload_2
    //   371: astore 4
    //   373: aload_2
    //   374: ifnull -87 -> 287
    //   377: aload_2
    //   378: invokevirtual 291	java/io/InputStream:close	()V
    //   381: aload 5
    //   383: astore 6
    //   385: aload_2
    //   386: astore 4
    //   388: goto -101 -> 287
    //   391: astore_3
    //   392: ldc -127
    //   394: aload_3
    //   395: ldc_w 278
    //   398: iconst_0
    //   399: anewarray 4	java/lang/Object
    //   402: invokestatic 282	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   405: aload 5
    //   407: astore 6
    //   409: aload_2
    //   410: astore 4
    //   412: goto -125 -> 287
    //   415: astore_0
    //   416: aconst_null
    //   417: astore_3
    //   418: aload_3
    //   419: ifnull +7 -> 426
    //   422: aload_3
    //   423: invokevirtual 291	java/io/InputStream:close	()V
    //   426: aload_0
    //   427: athrow
    //   428: astore_2
    //   429: ldc -127
    //   431: aload_2
    //   432: ldc_w 278
    //   435: iconst_0
    //   436: anewarray 4	java/lang/Object
    //   439: invokestatic 282	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   442: goto -16 -> 426
    //   445: aload 9
    //   447: invokestatic 327	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   450: ifne +19 -> 469
    //   453: aload 6
    //   455: invokestatic 327	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   458: ifeq +11 -> 469
    //   461: iconst_0
    //   462: istore_1
    //   463: aload 4
    //   465: astore_2
    //   466: goto -429 -> 37
    //   469: iconst_1
    //   470: istore_1
    //   471: aload 4
    //   473: astore_2
    //   474: goto -437 -> 37
    //   477: aload_2
    //   478: astore 4
    //   480: aload_0
    //   481: astore_3
    //   482: aload_2
    //   483: invokevirtual 336	java/io/FileOutputStream:flush	()V
    //   486: aload_0
    //   487: ifnull +7 -> 494
    //   490: aload_0
    //   491: invokevirtual 291	java/io/InputStream:close	()V
    //   494: aload_2
    //   495: invokevirtual 292	java/io/FileOutputStream:close	()V
    //   498: iconst_0
    //   499: istore_1
    //   500: goto -324 -> 176
    //   503: astore_0
    //   504: ldc -127
    //   506: aload_0
    //   507: ldc_w 278
    //   510: iconst_0
    //   511: anewarray 4	java/lang/Object
    //   514: invokestatic 282	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   517: ldc -127
    //   519: new 207	java/lang/StringBuilder
    //   522: dup
    //   523: ldc_w 338
    //   526: invokespecial 285	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   529: aload_0
    //   530: invokevirtual 339	java/io/IOException:getMessage	()Ljava/lang/String;
    //   533: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   536: invokevirtual 232	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   539: invokestatic 143	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   542: goto -48 -> 494
    //   545: astore_0
    //   546: ldc -127
    //   548: aload_0
    //   549: ldc_w 278
    //   552: iconst_0
    //   553: anewarray 4	java/lang/Object
    //   556: invokestatic 282	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   559: ldc -127
    //   561: new 207	java/lang/StringBuilder
    //   564: dup
    //   565: ldc_w 341
    //   568: invokespecial 285	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   571: aload_0
    //   572: invokevirtual 339	java/io/IOException:getMessage	()Ljava/lang/String;
    //   575: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   578: invokevirtual 232	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   581: invokestatic 143	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   584: iconst_0
    //   585: istore_1
    //   586: goto -410 -> 176
    //   589: astore_0
    //   590: ldc -127
    //   592: aload_0
    //   593: ldc_w 278
    //   596: iconst_0
    //   597: anewarray 4	java/lang/Object
    //   600: invokestatic 282	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   603: ldc -127
    //   605: new 207	java/lang/StringBuilder
    //   608: dup
    //   609: ldc_w 338
    //   612: invokespecial 285	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   615: aload_0
    //   616: invokevirtual 339	java/io/IOException:getMessage	()Ljava/lang/String;
    //   619: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   622: invokevirtual 232	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   625: invokestatic 143	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   628: goto -462 -> 166
    //   631: astore_0
    //   632: ldc -127
    //   634: aload_0
    //   635: ldc_w 278
    //   638: iconst_0
    //   639: anewarray 4	java/lang/Object
    //   642: invokestatic 282	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   645: ldc -127
    //   647: new 207	java/lang/StringBuilder
    //   650: dup
    //   651: ldc_w 341
    //   654: invokespecial 285	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   657: aload_0
    //   658: invokevirtual 339	java/io/IOException:getMessage	()Ljava/lang/String;
    //   661: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   664: invokevirtual 232	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   667: invokestatic 143	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   670: iconst_m1
    //   671: istore_1
    //   672: goto -496 -> 176
    //   675: astore_3
    //   676: aload_2
    //   677: astore_0
    //   678: aconst_null
    //   679: astore 4
    //   681: aload_3
    //   682: astore_2
    //   683: aload_0
    //   684: ifnull +7 -> 691
    //   687: aload_0
    //   688: invokevirtual 291	java/io/InputStream:close	()V
    //   691: aload 4
    //   693: ifnull +8 -> 701
    //   696: aload 4
    //   698: invokevirtual 292	java/io/FileOutputStream:close	()V
    //   701: aload_2
    //   702: athrow
    //   703: astore_0
    //   704: ldc -127
    //   706: aload_0
    //   707: ldc_w 278
    //   710: iconst_0
    //   711: anewarray 4	java/lang/Object
    //   714: invokestatic 282	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   717: ldc -127
    //   719: new 207	java/lang/StringBuilder
    //   722: dup
    //   723: ldc_w 338
    //   726: invokespecial 285	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   729: aload_0
    //   730: invokevirtual 339	java/io/IOException:getMessage	()Ljava/lang/String;
    //   733: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   736: invokevirtual 232	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   739: invokestatic 143	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   742: goto -51 -> 691
    //   745: astore_0
    //   746: ldc -127
    //   748: aload_0
    //   749: ldc_w 278
    //   752: iconst_0
    //   753: anewarray 4	java/lang/Object
    //   756: invokestatic 282	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   759: ldc -127
    //   761: new 207	java/lang/StringBuilder
    //   764: dup
    //   765: ldc_w 341
    //   768: invokespecial 285	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   771: aload_0
    //   772: invokevirtual 339	java/io/IOException:getMessage	()Ljava/lang/String;
    //   775: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   778: invokevirtual 232	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   781: invokestatic 143	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   784: goto -83 -> 701
    //   787: ldc -127
    //   789: ldc_w 343
    //   792: invokestatic 143	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   795: goto -581 -> 214
    //   798: astore_0
    //   799: ldc -127
    //   801: new 207	java/lang/StringBuilder
    //   804: dup
    //   805: ldc_w 345
    //   808: invokespecial 285	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   811: aload_0
    //   812: invokevirtual 288	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   815: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   818: invokevirtual 232	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   821: invokestatic 136	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   824: goto -610 -> 214
    //   827: astore_2
    //   828: aconst_null
    //   829: astore 4
    //   831: goto -148 -> 683
    //   834: astore_2
    //   835: aload_3
    //   836: astore_0
    //   837: goto -154 -> 683
    //   840: astore 5
    //   842: aload_2
    //   843: astore_0
    //   844: aconst_null
    //   845: astore_2
    //   846: goto -738 -> 108
    //   849: astore 5
    //   851: aconst_null
    //   852: astore_2
    //   853: goto -745 -> 108
    //   856: astore_0
    //   857: goto -439 -> 418
    //   860: astore 4
    //   862: goto -512 -> 350
    //   865: iconst_m1
    //   866: istore_1
    //   867: goto -691 -> 176
    //   870: iconst_0
    //   871: istore_1
    //   872: goto -658 -> 214
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	875	0	paramContext	Context
    //   34	838	1	i	int
    //   36	374	2	localObject1	Object
    //   428	4	2	localIOException1	java.io.IOException
    //   465	237	2	localObject2	Object
    //   827	1	2	localObject3	Object
    //   834	9	2	localObject4	Object
    //   845	8	2	localObject5	Object
    //   65	287	3	localObject6	Object
    //   391	4	3	localIOException2	java.io.IOException
    //   417	65	3	localContext	Context
    //   675	161	3	localObject7	Object
    //   62	254	4	localObject8	Object
    //   321	5	4	localIOException3	java.io.IOException
    //   341	1	4	localObject9	Object
    //   346	9	4	localIOException4	java.io.IOException
    //   371	459	4	localObject10	Object
    //   860	1	4	localIOException5	java.io.IOException
    //   71	26	5	arrayOfByte	byte[]
    //   106	39	5	localException1	Exception
    //   234	172	5	str1	String
    //   840	1	5	localException2	Exception
    //   849	1	5	localException3	Exception
    //   268	186	6	localObject11	Object
    //   12	178	7	str2	String
    //   23	202	8	localFile	File
    //   229	217	9	str3	String
    // Exception table:
    //   from	to	target	type
    //   66	73	106	java/lang/Exception
    //   78	85	106	java/lang/Exception
    //   95	103	106	java/lang/Exception
    //   482	486	106	java/lang/Exception
    //   277	281	321	java/io/IOException
    //   236	246	346	java/io/IOException
    //   377	381	391	java/io/IOException
    //   236	246	415	finally
    //   422	426	428	java/io/IOException
    //   490	494	503	java/io/IOException
    //   494	498	545	java/io/IOException
    //   162	166	589	java/io/IOException
    //   170	174	631	java/io/IOException
    //   41	51	675	finally
    //   687	691	703	java/io/IOException
    //   696	701	745	java/io/IOException
    //   176	214	798	java/lang/Exception
    //   787	795	798	java/lang/Exception
    //   51	61	827	finally
    //   66	73	834	finally
    //   78	85	834	finally
    //   95	103	834	finally
    //   113	127	834	finally
    //   132	158	834	finally
    //   482	486	834	finally
    //   41	51	840	java/lang/Exception
    //   51	61	849	java/lang/Exception
    //   255	264	856	finally
    //   352	366	856	finally
    //   255	264	860	java/io/IOException
  }
  
  public static void eE(boolean paramBoolean)
  {
    GMTrace.i(16567031037952L, 123434);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xy().xh().a(w.a.vrw, Boolean.valueOf(paramBoolean));
    GMTrace.o(16567031037952L, 123434);
  }
  
  public static void eF(boolean paramBoolean)
  {
    GMTrace.i(10778354647040L, 80305);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xy().xh().a(w.a.vrx, Boolean.valueOf(paramBoolean));
    GMTrace.o(10778354647040L, 80305);
  }
  
  public static void eG(boolean paramBoolean)
  {
    GMTrace.i(10778623082496L, 80307);
    llb = paramBoolean;
    GMTrace.o(10778623082496L, 80307);
  }
  
  public static String getUserId()
  {
    GMTrace.i(10777415122944L, 80298);
    String str = com.tencent.mm.wallet_core.ui.e.getUsername();
    str = aa.RP(aa.RP(str) + aa.RP(p.ta()));
    GMTrace.o(10777415122944L, 80298);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fingerprint\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */