package com.tencent.mm.plugin.voip.b;

import android.app.Notification;
import android.app.Notification.Builder;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.av;
import com.tencent.mm.g.a.av.a;
import com.tencent.mm.g.a.ay;
import com.tencent.mm.g.a.ay.a;
import com.tencent.mm.g.a.bg.a;
import com.tencent.mm.g.a.si;
import com.tencent.mm.g.a.si.b;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class d
{
  public static Context qNP;
  private static final String qNQ;
  private static final Uri qNR;
  
  static
  {
    GMTrace.i(5377433272320L, 40065);
    qNP = null;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("VERSION.RELEASE:[" + Build.VERSION.RELEASE);
    localStringBuilder.append("] VERSION.CODENAME:[" + Build.VERSION.CODENAME);
    localStringBuilder.append("] VERSION.INCREMENTAL:[" + Build.VERSION.INCREMENTAL);
    localStringBuilder.append("] BOARD:[" + Build.BOARD);
    localStringBuilder.append("] DEVICE:[" + Build.DEVICE);
    localStringBuilder.append("] DISPLAY:[" + Build.DISPLAY);
    localStringBuilder.append("] FINGERPRINT:[" + Build.FINGERPRINT);
    localStringBuilder.append("] HOST:[" + Build.HOST);
    localStringBuilder.append("] MANUFACTURER:[" + Build.MANUFACTURER);
    localStringBuilder.append("] MODEL:[" + Build.MODEL);
    localStringBuilder.append("] PRODUCT:[" + Build.PRODUCT);
    localStringBuilder.append("] TAGS:[" + Build.TAGS);
    localStringBuilder.append("] TYPE:[" + Build.TYPE);
    localStringBuilder.append("] USER:[" + Build.USER + "]");
    qNQ = localStringBuilder.toString();
    qNR = Uri.parse("content://com.lbe.security.miui.permmgr/active");
    GMTrace.o(5377433272320L, 40065);
  }
  
  public static void H(Context paramContext, int paramInt)
  {
    GMTrace.i(5376493748224L, 40058);
    Toast.makeText(paramContext, paramInt, 0).show();
    GMTrace.o(5376493748224L, 40058);
  }
  
  public static Notification a(Notification.Builder paramBuilder)
  {
    GMTrace.i(5377299054592L, 40064);
    if (com.tencent.mm.compatible.util.d.eu(16))
    {
      paramBuilder = paramBuilder.getNotification();
      GMTrace.o(5377299054592L, 40064);
      return paramBuilder;
    }
    paramBuilder = paramBuilder.build();
    GMTrace.o(5377299054592L, 40064);
    return paramBuilder;
  }
  
  public static boolean bvJ()
  {
    GMTrace.i(14524371435520L, 108215);
    GMTrace.o(14524371435520L, 108215);
    return true;
  }
  
  public static int bvK()
  {
    GMTrace.i(5375688441856L, 40052);
    int i = Build.VERSION.SDK_INT;
    GMTrace.o(5375688441856L, 40052);
    return i;
  }
  
  private static boolean bvL()
  {
    boolean bool2 = false;
    GMTrace.i(5375822659584L, 40053);
    for (;;)
    {
      try
      {
        Object localObject2 = new Properties();
        FileInputStream localFileInputStream = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
        boolean bool3;
        bool1 = bool2;
      }
      catch (IOException localIOException1)
      {
        try
        {
          ((Properties)localObject2).load(localFileInputStream);
          localObject2 = ((Properties)localObject2).getProperty("ro.miui.ui.version.name", null);
          bool1 = bool2;
          if (localObject2 != null)
          {
            bool3 = ((String)localObject2).equals("V6");
            bool1 = bool2;
            if (bool3) {
              bool1 = true;
            }
          }
          w.d("VoipUtil", "isMIUIv6 " + bool1);
          GMTrace.o(5375822659584L, 40053);
          return bool1;
        }
        catch (IOException localIOException3)
        {
          boolean bool1;
          Object localObject1;
          for (;;) {}
        }
        localIOException1 = localIOException1;
        localObject1 = null;
      }
      if (localObject1 != null) {
        try
        {
          ((FileInputStream)localObject1).close();
          bool1 = bool2;
        }
        catch (IOException localIOException2)
        {
          bool1 = bool2;
        }
      }
    }
  }
  
  public static boolean bvM()
  {
    GMTrace.i(5376762183680L, 40060);
    ay localay = new ay();
    a.vgX.m(localay);
    boolean bool = localay.eCi.eqj;
    GMTrace.o(5376762183680L, 40060);
    return bool;
  }
  
  public static boolean bvN()
  {
    GMTrace.i(5376896401408L, 40061);
    si localsi = new si();
    localsi.eXf.eHJ = 2;
    a.vgX.m(localsi);
    boolean bool = localsi.eXg.eXh;
    GMTrace.o(5376896401408L, 40061);
    return bool;
  }
  
  public static boolean bvO()
  {
    GMTrace.i(5377030619136L, 40062);
    com.tencent.mm.g.a.bg localbg = new com.tencent.mm.g.a.bg();
    a.vgX.m(localbg);
    boolean bool = localbg.eCA.eqj;
    GMTrace.o(5377030619136L, 40062);
    return bool;
  }
  
  public static boolean bvP()
  {
    GMTrace.i(5377164836864L, 40063);
    av localav = new av();
    a.vgX.m(localav);
    boolean bool = localav.eCc.eCd;
    GMTrace.o(5377164836864L, 40063);
    return bool;
  }
  
  public static boolean dk(Context paramContext)
  {
    GMTrace.i(5375956877312L, 40054);
    boolean bool = false;
    if (bvL() == true) {
      bool = dn(paramContext);
    }
    w.d("VoipUtil", "isLbePermissionEnable ret:" + bool);
    GMTrace.o(5375956877312L, 40054);
    return bool;
  }
  
  public static boolean dl(Context paramContext)
  {
    GMTrace.i(5376091095040L, 40055);
    boolean bool = false;
    if (bvL() == true) {
      bool = dm(paramContext);
    }
    w.d("VoipUtil", "setLbePermissionEnable ret:" + bool);
    GMTrace.o(5376091095040L, 40055);
    return bool;
  }
  
  /* Error */
  private static boolean dm(Context paramContext)
  {
    // Byte code:
    //   0: ldc2_w 346
    //   3: ldc_w 348
    //   6: invokestatic 21	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: invokevirtual 354	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   13: astore_0
    //   14: aload_0
    //   15: getstatic 127	com/tencent/mm/plugin/voip/b/d:qNR	Landroid/net/Uri;
    //   18: iconst_1
    //   19: anewarray 220	java/lang/String
    //   22: dup
    //   23: iconst_0
    //   24: ldc_w 356
    //   27: aastore
    //   28: ldc_w 358
    //   31: aconst_null
    //   32: aconst_null
    //   33: invokevirtual 364	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   36: astore 4
    //   38: aload 4
    //   40: ifnull +352 -> 392
    //   43: aload 4
    //   45: astore 5
    //   47: aload 4
    //   49: invokeinterface 369 1 0
    //   54: ifle +338 -> 392
    //   57: aload 4
    //   59: astore 5
    //   61: aload 4
    //   63: invokeinterface 372 1 0
    //   68: ifeq +324 -> 392
    //   71: aload 4
    //   73: astore 5
    //   75: aload 4
    //   77: iconst_0
    //   78: invokeinterface 376 2 0
    //   83: istore_1
    //   84: aload 4
    //   86: ifnull +303 -> 389
    //   89: aload 4
    //   91: invokeinterface 377 1 0
    //   96: ldc -30
    //   98: ldc_w 379
    //   101: iconst_3
    //   102: anewarray 4	java/lang/Object
    //   105: dup
    //   106: iconst_0
    //   107: iload_1
    //   108: invokestatic 385	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   111: aastore
    //   112: dup
    //   113: iconst_1
    //   114: ldc_w 387
    //   117: aastore
    //   118: dup
    //   119: iconst_2
    //   120: ldc_w 388
    //   123: invokestatic 385	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   126: aastore
    //   127: invokestatic 391	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   130: iconst_m1
    //   131: istore_2
    //   132: iload_1
    //   133: iconst_m1
    //   134: if_icmpeq +245 -> 379
    //   137: aload_0
    //   138: ifnull +241 -> 379
    //   141: iload_1
    //   142: ldc_w 388
    //   145: ior
    //   146: istore_3
    //   147: new 393	android/content/ContentValues
    //   150: dup
    //   151: invokespecial 394	android/content/ContentValues:<init>	()V
    //   154: astore 4
    //   156: aload 4
    //   158: ldc_w 356
    //   161: iload_3
    //   162: invokestatic 385	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   165: invokevirtual 398	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   168: aload_0
    //   169: getstatic 127	com/tencent/mm/plugin/voip/b/d:qNR	Landroid/net/Uri;
    //   172: aload 4
    //   174: ldc_w 358
    //   177: aconst_null
    //   178: invokevirtual 402	android/content/ContentResolver:update	(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   181: istore_1
    //   182: ldc -30
    //   184: ldc_w 404
    //   187: iconst_5
    //   188: anewarray 4	java/lang/Object
    //   191: dup
    //   192: iconst_0
    //   193: iload_3
    //   194: invokestatic 385	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   197: aastore
    //   198: dup
    //   199: iconst_1
    //   200: ldc_w 387
    //   203: aastore
    //   204: dup
    //   205: iconst_2
    //   206: ldc_w 388
    //   209: invokestatic 385	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   212: aastore
    //   213: dup
    //   214: iconst_3
    //   215: ldc_w 406
    //   218: aastore
    //   219: dup
    //   220: iconst_4
    //   221: iload_1
    //   222: invokestatic 385	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   225: aastore
    //   226: invokestatic 391	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   229: iload_1
    //   230: ifle +117 -> 347
    //   233: ldc2_w 346
    //   236: ldc_w 348
    //   239: invokestatic 130	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   242: iconst_1
    //   243: ireturn
    //   244: astore 6
    //   246: aconst_null
    //   247: astore 4
    //   249: aconst_null
    //   250: astore_0
    //   251: aload 4
    //   253: astore 5
    //   255: ldc -30
    //   257: ldc_w 408
    //   260: iconst_2
    //   261: anewarray 4	java/lang/Object
    //   264: dup
    //   265: iconst_0
    //   266: aload 6
    //   268: aastore
    //   269: dup
    //   270: iconst_1
    //   271: ldc_w 388
    //   274: invokestatic 385	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   277: aastore
    //   278: invokestatic 411	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   281: aload 4
    //   283: ifnull +101 -> 384
    //   286: aload 4
    //   288: invokeinterface 377 1 0
    //   293: iconst_m1
    //   294: istore_1
    //   295: goto -199 -> 96
    //   298: astore_0
    //   299: aconst_null
    //   300: astore 5
    //   302: aload 5
    //   304: ifnull +10 -> 314
    //   307: aload 5
    //   309: invokeinterface 377 1 0
    //   314: aload_0
    //   315: athrow
    //   316: astore_0
    //   317: iload_2
    //   318: istore_1
    //   319: ldc -30
    //   321: ldc_w 413
    //   324: iconst_2
    //   325: anewarray 4	java/lang/Object
    //   328: dup
    //   329: iconst_0
    //   330: aload_0
    //   331: aastore
    //   332: dup
    //   333: iconst_1
    //   334: ldc_w 388
    //   337: invokestatic 385	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   340: aastore
    //   341: invokestatic 411	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   344: goto -115 -> 229
    //   347: ldc2_w 346
    //   350: ldc_w 348
    //   353: invokestatic 130	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   356: iconst_0
    //   357: ireturn
    //   358: astore_0
    //   359: goto -40 -> 319
    //   362: astore_0
    //   363: goto -61 -> 302
    //   366: astore 6
    //   368: aconst_null
    //   369: astore 4
    //   371: goto -120 -> 251
    //   374: astore 6
    //   376: goto -125 -> 251
    //   379: iconst_m1
    //   380: istore_1
    //   381: goto -152 -> 229
    //   384: iconst_m1
    //   385: istore_1
    //   386: goto -290 -> 96
    //   389: goto -293 -> 96
    //   392: iconst_m1
    //   393: istore_1
    //   394: goto -310 -> 84
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	397	0	paramContext	Context
    //   83	311	1	i	int
    //   131	187	2	j	int
    //   146	48	3	k	int
    //   36	334	4	localObject1	Object
    //   45	263	5	localObject2	Object
    //   244	23	6	localThrowable1	Throwable
    //   366	1	6	localThrowable2	Throwable
    //   374	1	6	localThrowable3	Throwable
    // Exception table:
    //   from	to	target	type
    //   9	14	244	java/lang/Throwable
    //   9	14	298	finally
    //   14	38	298	finally
    //   147	182	316	java/lang/Throwable
    //   182	229	358	java/lang/Throwable
    //   47	57	362	finally
    //   61	71	362	finally
    //   75	84	362	finally
    //   255	281	362	finally
    //   14	38	366	java/lang/Throwable
    //   47	57	374	java/lang/Throwable
    //   61	71	374	java/lang/Throwable
    //   75	84	374	java/lang/Throwable
  }
  
  /* Error */
  private static boolean dn(Context paramContext)
  {
    // Byte code:
    //   0: ldc2_w 414
    //   3: ldc_w 416
    //   6: invokestatic 21	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: invokevirtual 354	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   13: getstatic 127	com/tencent/mm/plugin/voip/b/d:qNR	Landroid/net/Uri;
    //   16: iconst_4
    //   17: anewarray 220	java/lang/String
    //   20: dup
    //   21: iconst_0
    //   22: ldc_w 418
    //   25: aastore
    //   26: dup
    //   27: iconst_1
    //   28: ldc_w 356
    //   31: aastore
    //   32: dup
    //   33: iconst_2
    //   34: ldc_w 420
    //   37: aastore
    //   38: dup
    //   39: iconst_3
    //   40: ldc_w 422
    //   43: aastore
    //   44: ldc_w 358
    //   47: aconst_null
    //   48: aconst_null
    //   49: invokevirtual 364	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   52: astore 6
    //   54: aload 6
    //   56: ifnull +150 -> 206
    //   59: aload 6
    //   61: astore_0
    //   62: aload 6
    //   64: invokeinterface 369 1 0
    //   69: ifle +137 -> 206
    //   72: aload 6
    //   74: astore_0
    //   75: aload 6
    //   77: invokeinterface 372 1 0
    //   82: ifeq +124 -> 206
    //   85: aload 6
    //   87: astore_0
    //   88: aload 6
    //   90: iconst_0
    //   91: invokeinterface 376 2 0
    //   96: istore_1
    //   97: aload 6
    //   99: astore_0
    //   100: aload 6
    //   102: iconst_1
    //   103: invokeinterface 376 2 0
    //   108: istore_2
    //   109: aload 6
    //   111: astore_0
    //   112: aload 6
    //   114: iconst_2
    //   115: invokeinterface 376 2 0
    //   120: istore_3
    //   121: aload 6
    //   123: astore_0
    //   124: aload 6
    //   126: iconst_3
    //   127: invokeinterface 376 2 0
    //   132: istore 4
    //   134: iload_1
    //   135: ldc_w 388
    //   138: iand
    //   139: ldc_w 388
    //   142: if_icmpne +20 -> 162
    //   145: iload_3
    //   146: ldc_w 388
    //   149: iand
    //   150: ifne +12 -> 162
    //   153: iload 4
    //   155: ldc_w 388
    //   158: iand
    //   159: ifeq +14 -> 173
    //   162: iload_2
    //   163: ldc_w 388
    //   166: iand
    //   167: ldc_w 388
    //   170: if_icmpne +30 -> 200
    //   173: iconst_1
    //   174: istore 5
    //   176: aload 6
    //   178: ifnull +10 -> 188
    //   181: aload 6
    //   183: invokeinterface 377 1 0
    //   188: ldc2_w 414
    //   191: ldc_w 416
    //   194: invokestatic 130	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   197: iload 5
    //   199: ireturn
    //   200: iconst_0
    //   201: istore 5
    //   203: goto -27 -> 176
    //   206: aload 6
    //   208: ifnull +10 -> 218
    //   211: aload 6
    //   213: invokeinterface 377 1 0
    //   218: ldc2_w 414
    //   221: ldc_w 416
    //   224: invokestatic 130	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   227: iconst_0
    //   228: ireturn
    //   229: astore 7
    //   231: aconst_null
    //   232: astore 6
    //   234: aload 6
    //   236: astore_0
    //   237: ldc_w 424
    //   240: ldc_w 426
    //   243: iconst_2
    //   244: anewarray 4	java/lang/Object
    //   247: dup
    //   248: iconst_0
    //   249: aload 7
    //   251: aastore
    //   252: dup
    //   253: iconst_1
    //   254: ldc_w 388
    //   257: invokestatic 385	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   260: aastore
    //   261: invokestatic 411	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   264: aload 6
    //   266: ifnull -48 -> 218
    //   269: aload 6
    //   271: invokeinterface 377 1 0
    //   276: goto -58 -> 218
    //   279: astore 6
    //   281: aconst_null
    //   282: astore_0
    //   283: aload_0
    //   284: ifnull +9 -> 293
    //   287: aload_0
    //   288: invokeinterface 377 1 0
    //   293: aload 6
    //   295: athrow
    //   296: astore 6
    //   298: goto -15 -> 283
    //   301: astore 7
    //   303: goto -69 -> 234
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	306	0	paramContext	Context
    //   96	43	1	i	int
    //   108	59	2	j	int
    //   120	30	3	k	int
    //   132	27	4	m	int
    //   174	28	5	bool	boolean
    //   52	218	6	localCursor	android.database.Cursor
    //   279	15	6	localObject1	Object
    //   296	1	6	localObject2	Object
    //   229	21	7	localThrowable1	Throwable
    //   301	1	7	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   9	54	229	java/lang/Throwable
    //   9	54	279	finally
    //   62	72	296	finally
    //   75	85	296	finally
    //   88	97	296	finally
    //   100	109	296	finally
    //   112	121	296	finally
    //   124	134	296	finally
    //   237	264	296	finally
    //   62	72	301	java/lang/Throwable
    //   75	85	301	java/lang/Throwable
    //   88	97	301	java/lang/Throwable
    //   100	109	301	java/lang/Throwable
    //   112	121	301	java/lang/Throwable
    //   124	134	301	java/lang/Throwable
  }
  
  public static int na(String paramString)
  {
    int i = 0;
    GMTrace.i(5376627965952L, 40059);
    try
    {
      int j = com.tencent.mm.sdk.platformtools.bg.getInt(g.ut().getValue(paramString), 0);
      i = j;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("VoipUtil", "getIntValFromDynamicConfig parseInt failed, val: " + paramString);
      }
    }
    GMTrace.o(5376627965952L, 40059);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */