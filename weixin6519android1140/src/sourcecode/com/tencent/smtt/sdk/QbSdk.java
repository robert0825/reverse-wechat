package com.tencent.smtt.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.webkit.ValueCallback;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.f;
import com.tencent.smtt.utils.o;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

@SuppressLint({"NewApi"})
public class QbSdk
{
  public static final int EXTENSION_INIT_FAILURE = -99999;
  public static final String LOGIN_TYPE_KEY_PARTNER_CALL_POS = "PosID";
  public static final String LOGIN_TYPE_KEY_PARTNER_ID = "ChannelID";
  public static final String PARAM_KEY_FEATUREID = "param_key_featureid";
  public static final String PARAM_KEY_FUNCTIONID = "param_key_functionid";
  public static final String PARAM_KEY_POSITIONID = "param_key_positionid";
  public static final int QBMODE = 2;
  public static final String SVNVERSION = "jnizz";
  public static final int TBSMODE = 1;
  public static final String TID_QQNumber_Prefix = "QQ:";
  public static final int VERSION = 1;
  public static q mTbsListener = null;
  public static q mTbsListenerForInit = null;
  public static boolean sIsVersionPrinted = false;
  static long sWifiConnectedTime;
  private static int xTD = 0;
  private static String xTE = "";
  private static Class<?> xTF;
  private static Object xTG;
  static boolean xTH = false;
  static boolean xTI = false;
  static boolean xTJ = true;
  private static boolean xTK = false;
  private static String[] xTL;
  private static String xTM = "NULL";
  private static String xTN = "UNKNOWN";
  static String xTO;
  static boolean xTP = false;
  static long xTQ = 0L;
  static Object xTR;
  static boolean xTS;
  private static int xTT;
  private static int xTU;
  private static String xTV;
  private static String xTW;
  static volatile boolean xTX;
  private static boolean xTY;
  private static boolean xTZ = false;
  private static boolean xUa = false;
  static q xUb = new q()
  {
    public final void jA(int paramAnonymousInt)
    {
      if (l.coj())
      {
        TbsLog.i("QbSdk", "onDownloadFinish needDownloadDecoupleCore is true", true);
        l.xVq = true;
      }
      do
      {
        return;
        TbsLog.i("QbSdk", "onDownloadFinish needDownloadDecoupleCore is false", true);
        l.xVq = false;
        if (QbSdk.mTbsListener != null) {
          QbSdk.mTbsListener.jA(paramAnonymousInt);
        }
      } while (QbSdk.mTbsListenerForInit == null);
      QbSdk.mTbsListenerForInit.jA(paramAnonymousInt);
    }
    
    public final void jB(int paramAnonymousInt)
    {
      QbSdk.setTBSInstallingStatus(false);
      l.xVq = false;
      if (l.cok()) {}
      for (l.xVq = true;; l.xVq = false)
      {
        if (QbSdk.mTbsListener != null) {
          QbSdk.mTbsListener.jB(paramAnonymousInt);
        }
        if (QbSdk.mTbsListenerForInit != null) {
          QbSdk.mTbsListenerForInit.jB(paramAnonymousInt);
        }
        return;
      }
    }
    
    public final void jC(int paramAnonymousInt)
    {
      if (QbSdk.mTbsListenerForInit != null) {
        QbSdk.mTbsListenerForInit.jC(paramAnonymousInt);
      }
      if (QbSdk.mTbsListener != null) {
        QbSdk.mTbsListener.jC(paramAnonymousInt);
      }
    }
  };
  static Map<String, Object> xUc = null;
  
  static
  {
    sWifiConnectedTime = 0L;
    xTR = new Object();
    xTS = true;
    xTT = 0;
    xTU = 170;
    xTV = null;
    xTW = null;
    xTX = xTH;
    xTY = true;
  }
  
  static boolean ai(Context paramContext, int paramInt)
  {
    if (gd(paramContext))
    {
      paramContext = o.a(xTG, "isX5Disabled", new Class[] { Integer.TYPE, Integer.TYPE, Integer.TYPE }, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(43601), Integer.valueOf(20000) });
      if (paramContext != null) {
        return ((Boolean)paramContext).booleanValue();
      }
      paramContext = o.a(xTG, "isX5Disabled", new Class[] { Integer.TYPE, Integer.TYPE }, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(43601) });
      if (paramContext != null) {
        return ((Boolean)paramContext).booleanValue();
      }
    }
    return true;
  }
  
  /* Error */
  static void by(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 105	com/tencent/smtt/sdk/QbSdk:xTH	Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq +7 -> 15
    //   11: ldc 2
    //   13: monitorexit
    //   14: return
    //   15: iconst_1
    //   16: putstatic 105	com/tencent/smtt/sdk/QbSdk:xTH	Z
    //   19: new 195	java/lang/StringBuilder
    //   22: dup
    //   23: ldc -59
    //   25: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   28: aload_1
    //   29: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   35: putstatic 119	com/tencent/smtt/sdk/QbSdk:xTN	Ljava/lang/String;
    //   38: ldc -46
    //   40: new 195	java/lang/StringBuilder
    //   43: dup
    //   44: ldc -44
    //   46: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   49: getstatic 119	com/tencent/smtt/sdk/QbSdk:xTN	Ljava/lang/String;
    //   52: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   58: invokestatic 218	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   61: invokestatic 224	com/tencent/smtt/sdk/i:cnZ	()Lcom/tencent/smtt/sdk/i;
    //   64: aload_0
    //   65: sipush 401
    //   68: new 226	java/lang/Throwable
    //   71: dup
    //   72: getstatic 119	com/tencent/smtt/sdk/QbSdk:xTN	Ljava/lang/String;
    //   75: invokespecial 227	java/lang/Throwable:<init>	(Ljava/lang/String;)V
    //   78: invokevirtual 230	com/tencent/smtt/sdk/i:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   81: goto -70 -> 11
    //   84: astore_0
    //   85: ldc 2
    //   87: monitorexit
    //   88: aload_0
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	paramContext	Context
    //   0	90	1	paramString	String
    //   6	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   3	7	84	finally
    //   15	81	84	finally
  }
  
  static Object c(Context paramContext, String paramString, Bundle paramBundle)
  {
    if (!gc(paramContext)) {
      paramContext = Integer.valueOf(-99999);
    }
    do
    {
      return paramContext;
      paramString = o.a(xTG, "miscCall", new Class[] { String.class, Bundle.class }, new Object[] { paramString, paramBundle });
      paramContext = paramString;
    } while (paramString != null);
    return null;
  }
  
  public static boolean canLoadVideo(Context paramContext)
  {
    Object localObject = o.a(xTG, "canLoadVideo", new Class[] { Integer.TYPE }, new Object[] { Integer.valueOf(0) });
    if (localObject != null) {
      if (!((Boolean)localObject).booleanValue()) {
        i.cnZ().ak(paramContext, 313);
      }
    }
    while (localObject == null)
    {
      return false;
      i.cnZ().ak(paramContext, 314);
    }
    return ((Boolean)localObject).booleanValue();
  }
  
  public static boolean canLoadX5(Context paramContext)
  {
    return q(paramContext, false);
  }
  
  public static boolean canLoadX5FirstTimeThirdApp(Context paramContext)
  {
    try
    {
      File localFile;
      if (xTF == null)
      {
        p.cov();
        localObject = p.gK(paramContext);
        if (localObject == null)
        {
          TbsLog.e("QbSdk", "QbSdk canLoadX5FirstTimeThirdApp (false) optDir == null");
          return false;
        }
        localFile = new File(t.coJ(), "tbs_sdk_extension_dex.jar");
        if (!localFile.exists())
        {
          TbsLog.e("QbSdk", "QbSdk canLoadX5FirstTimeThirdApp (false) dexFile.exists()=false", true);
          return false;
        }
        if (t.coF() == null) {
          break label153;
        }
      }
      label153:
      for (Object localObject = t.coF();; localObject = ((File)localObject).getAbsolutePath())
      {
        TbsLog.i("QbSdk", "QbSdk init optDirExtension #2 is " + (String)localObject);
        xTF = new DexClassLoader(localFile.getAbsolutePath(), (String)localObject, localFile.getAbsolutePath(), QbSdk.class.getClassLoader()).loadClass("com.tencent.tbs.sdk.extension.TbsSDKExtension");
        if (xTG != null) {
          break label235;
        }
        if (t.coF() != null) {
          break;
        }
        r.gR(paramContext.getApplicationContext()).aT(227, "host context is null!");
        return false;
      }
      xTF.getConstructor(new Class[] { Context.class, Context.class });
      xTG = xTF.getConstructor(new Class[] { Context.class, Context.class, String.class }).newInstance(new Object[] { paramContext, null, t.coF() });
      label235:
      paramContext = o.a(xTG, "canLoadX5CoreForThirdApp", new Class[0], new Object[0]);
      if ((paramContext != null) && ((paramContext instanceof Boolean)))
      {
        boolean bool = ((Boolean)paramContext).booleanValue();
        return bool;
      }
      return false;
    }
    catch (Throwable paramContext)
    {
      TbsLog.e("QbSdk", "canLoadX5FirstTimeThirdApp sys WebView: " + Log.getStackTraceString(paramContext));
    }
    return false;
  }
  
  public static void canOpenFile(Context paramContext, final String paramString, final x<Boolean> paramx)
  {
    new Thread()
    {
      public final void run()
      {
        Object localObject = ab.coW();
        ((ab)localObject).b(this.val$context, null);
        final boolean bool;
        if (((ab)localObject).coX())
        {
          localObject = ((ab)localObject).coY();
          Context localContext = this.val$context;
          String str = paramString;
          localObject = ((ac)localObject).xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "canOpenFile", new Class[] { Context.class, String.class }, new Object[] { localContext, str });
          if ((localObject instanceof Boolean)) {
            bool = ((Boolean)localObject).booleanValue();
          }
        }
        for (;;)
        {
          new Handler(Looper.getMainLooper()).post(new Runnable()
          {
            public final void run()
            {
              QbSdk.1.this.xUd.onReceiveValue(Boolean.valueOf(bool));
            }
          });
          return;
          bool = false;
          continue;
          bool = false;
        }
      }
    }.start();
  }
  
  public static boolean canOpenMimeFileType(Context paramContext, String paramString)
  {
    if (!p(paramContext, false)) {}
    return false;
  }
  
  /* Error */
  public static boolean canOpenWebPlus(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 7
    //   3: aconst_null
    //   4: astore 5
    //   6: getstatic 134	com/tencent/smtt/sdk/QbSdk:xTT	I
    //   9: ifne +9 -> 18
    //   12: invokestatic 373	com/tencent/smtt/sdk/a:cnM	()I
    //   15: putstatic 134	com/tencent/smtt/sdk/QbSdk:xTT	I
    //   18: ldc -46
    //   20: new 195	java/lang/StringBuilder
    //   23: dup
    //   24: ldc_w 375
    //   27: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   30: getstatic 134	com/tencent/smtt/sdk/QbSdk:xTT	I
    //   33: invokevirtual 378	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   36: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   39: invokestatic 294	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   42: getstatic 383	android/os/Build$VERSION:SDK_INT	I
    //   45: bipush 7
    //   47: if_icmplt +12 -> 59
    //   50: getstatic 134	com/tencent/smtt/sdk/QbSdk:xTT	I
    //   53: getstatic 136	com/tencent/smtt/sdk/QbSdk:xTU	I
    //   56: if_icmpge +5 -> 61
    //   59: iconst_0
    //   60: ireturn
    //   61: aload_0
    //   62: ifnull -3 -> 59
    //   65: invokestatic 261	com/tencent/smtt/sdk/p:cov	()Lcom/tencent/smtt/sdk/p;
    //   68: pop
    //   69: new 385	java/io/BufferedInputStream
    //   72: dup
    //   73: new 387	java/io/FileInputStream
    //   76: dup
    //   77: new 269	java/io/File
    //   80: dup
    //   81: aload_0
    //   82: invokestatic 265	com/tencent/smtt/sdk/p:gK	(Landroid/content/Context;)Ljava/io/File;
    //   85: ldc_w 389
    //   88: invokespecial 392	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   91: invokespecial 395	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   94: invokespecial 398	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   97: astore 6
    //   99: aload 6
    //   101: astore 5
    //   103: new 400	java/util/Properties
    //   106: dup
    //   107: invokespecial 401	java/util/Properties:<init>	()V
    //   110: astore 8
    //   112: aload 6
    //   114: astore 5
    //   116: aload 8
    //   118: aload 6
    //   120: invokevirtual 404	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   123: aload 6
    //   125: astore 5
    //   127: aload 8
    //   129: ldc_w 406
    //   132: invokevirtual 410	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   135: astore 9
    //   137: aload 6
    //   139: astore 5
    //   141: aload 8
    //   143: ldc_w 412
    //   146: invokevirtual 410	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   149: astore 10
    //   151: aload 6
    //   153: astore 5
    //   155: aload 9
    //   157: invokestatic 416	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   160: istore_1
    //   161: aload 6
    //   163: astore 5
    //   165: aload 10
    //   167: invokestatic 416	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   170: istore_2
    //   171: aload 6
    //   173: astore 5
    //   175: getstatic 419	android/os/Build$VERSION:SDK	Ljava/lang/String;
    //   178: invokestatic 416	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   181: istore_3
    //   182: iload_3
    //   183: iload_1
    //   184: if_icmpgt +8 -> 192
    //   187: iload_3
    //   188: iload_2
    //   189: if_icmpge +39 -> 228
    //   192: aload 6
    //   194: astore 5
    //   196: ldc -46
    //   198: new 195	java/lang/StringBuilder
    //   201: dup
    //   202: ldc_w 421
    //   205: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   208: iload_3
    //   209: invokevirtual 378	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   212: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   215: invokestatic 294	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   218: aload 6
    //   220: invokevirtual 424	java/io/BufferedInputStream:close	()V
    //   223: iconst_0
    //   224: ireturn
    //   225: astore_0
    //   226: iconst_0
    //   227: ireturn
    //   228: aload 6
    //   230: astore 5
    //   232: aload 8
    //   234: ldc_w 426
    //   237: invokevirtual 410	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   240: invokestatic 416	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   243: istore_1
    //   244: aload 6
    //   246: invokevirtual 424	java/io/BufferedInputStream:close	()V
    //   249: new 387	java/io/FileInputStream
    //   252: dup
    //   253: new 269	java/io/File
    //   256: dup
    //   257: aload_0
    //   258: invokestatic 429	com/tencent/smtt/sdk/p:gM	(Landroid/content/Context;)Ljava/io/File;
    //   261: ldc_w 431
    //   264: invokespecial 392	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   267: invokespecial 395	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   270: astore 5
    //   272: new 400	java/util/Properties
    //   275: dup
    //   276: invokespecial 401	java/util/Properties:<init>	()V
    //   279: astore 6
    //   281: aload 6
    //   283: aload 5
    //   285: invokevirtual 404	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   288: aload 6
    //   290: ldc_w 433
    //   293: invokevirtual 410	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   296: invokestatic 416	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   299: istore_2
    //   300: aload 6
    //   302: ldc_w 435
    //   305: invokevirtual 410	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   308: invokestatic 416	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   311: istore_3
    //   312: iload_1
    //   313: ldc_w 436
    //   316: if_icmpeq +10 -> 326
    //   319: iload_2
    //   320: ldc_w 436
    //   323: if_icmpne +56 -> 379
    //   326: iconst_0
    //   327: istore_1
    //   328: aload 5
    //   330: invokevirtual 439	java/io/InputStream:close	()V
    //   333: iload_1
    //   334: ifne -275 -> 59
    //   337: iconst_1
    //   338: ireturn
    //   339: astore_0
    //   340: aconst_null
    //   341: astore_0
    //   342: aload_0
    //   343: astore 5
    //   345: ldc -46
    //   347: ldc_w 441
    //   350: invokestatic 294	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   353: aload_0
    //   354: ifnull -295 -> 59
    //   357: aload_0
    //   358: invokevirtual 424	java/io/BufferedInputStream:close	()V
    //   361: iconst_0
    //   362: ireturn
    //   363: astore_0
    //   364: iconst_0
    //   365: ireturn
    //   366: astore_0
    //   367: aload 5
    //   369: ifnull +8 -> 377
    //   372: aload 5
    //   374: invokevirtual 424	java/io/BufferedInputStream:close	()V
    //   377: aload_0
    //   378: athrow
    //   379: iload_1
    //   380: iload_2
    //   381: if_icmple +8 -> 389
    //   384: iconst_0
    //   385: istore_1
    //   386: goto -58 -> 328
    //   389: iload_1
    //   390: iload_2
    //   391: if_icmpne +169 -> 560
    //   394: iload_3
    //   395: ifle +16 -> 411
    //   398: iload_3
    //   399: aload_0
    //   400: invokestatic 447	com/tencent/smtt/utils/c:getAppVersionCode	(Landroid/content/Context;)I
    //   403: if_icmpeq +8 -> 411
    //   406: iconst_0
    //   407: istore_1
    //   408: goto -80 -> 328
    //   411: aload 6
    //   413: ldc_w 449
    //   416: invokevirtual 410	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   419: invokestatic 453	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
    //   422: ifeq +34 -> 456
    //   425: aload_0
    //   426: invokevirtual 318	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   429: invokestatic 459	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   432: getfield 463	com/tencent/smtt/sdk/k:xVi	Landroid/content/SharedPreferences;
    //   435: ldc_w 465
    //   438: iconst_0
    //   439: invokeinterface 471 3 0
    //   444: istore 4
    //   446: iload 4
    //   448: ifne +8 -> 456
    //   451: iconst_1
    //   452: istore_1
    //   453: goto -125 -> 328
    //   456: iconst_0
    //   457: istore_1
    //   458: goto -130 -> 328
    //   461: astore_0
    //   462: aload 7
    //   464: astore_0
    //   465: ldc -46
    //   467: ldc_w 473
    //   470: invokestatic 294	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   473: aload_0
    //   474: ifnull +7 -> 481
    //   477: aload_0
    //   478: invokevirtual 439	java/io/InputStream:close	()V
    //   481: iconst_1
    //   482: istore_1
    //   483: goto -150 -> 333
    //   486: astore_0
    //   487: iconst_1
    //   488: istore_1
    //   489: goto -156 -> 333
    //   492: astore_0
    //   493: aconst_null
    //   494: astore 5
    //   496: aload 5
    //   498: ifnull +8 -> 506
    //   501: aload 5
    //   503: invokevirtual 439	java/io/InputStream:close	()V
    //   506: aload_0
    //   507: athrow
    //   508: astore 5
    //   510: goto -261 -> 249
    //   513: astore 5
    //   515: goto -138 -> 377
    //   518: astore_0
    //   519: goto -186 -> 333
    //   522: astore 5
    //   524: goto -18 -> 506
    //   527: astore_0
    //   528: goto -32 -> 496
    //   531: astore 6
    //   533: aload_0
    //   534: astore 5
    //   536: aload 6
    //   538: astore_0
    //   539: goto -43 -> 496
    //   542: astore_0
    //   543: aload 5
    //   545: astore_0
    //   546: goto -81 -> 465
    //   549: astore_0
    //   550: goto -183 -> 367
    //   553: astore_0
    //   554: aload 6
    //   556: astore_0
    //   557: goto -215 -> 342
    //   560: iconst_0
    //   561: istore_1
    //   562: goto -234 -> 328
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	565	0	paramContext	Context
    //   160	402	1	i	int
    //   170	222	2	j	int
    //   181	223	3	k	int
    //   444	3	4	bool	boolean
    //   4	498	5	localObject1	Object
    //   508	1	5	localException1	Exception
    //   513	1	5	localException2	Exception
    //   522	1	5	localException3	Exception
    //   534	10	5	localContext	Context
    //   97	315	6	localObject2	Object
    //   531	24	6	localObject3	Object
    //   1	462	7	localObject4	Object
    //   110	123	8	localProperties	java.util.Properties
    //   135	21	9	str1	String
    //   149	17	10	str2	String
    // Exception table:
    //   from	to	target	type
    //   218	223	225	java/lang/Exception
    //   65	99	339	java/lang/Throwable
    //   357	361	363	java/lang/Exception
    //   65	99	366	finally
    //   249	272	461	java/lang/Throwable
    //   477	481	486	java/lang/Exception
    //   249	272	492	finally
    //   244	249	508	java/lang/Exception
    //   372	377	513	java/lang/Exception
    //   328	333	518	java/lang/Exception
    //   501	506	522	java/lang/Exception
    //   272	312	527	finally
    //   398	406	527	finally
    //   411	446	527	finally
    //   465	473	531	finally
    //   272	312	542	java/lang/Throwable
    //   398	406	542	java/lang/Throwable
    //   411	446	542	java/lang/Throwable
    //   103	112	549	finally
    //   116	123	549	finally
    //   127	137	549	finally
    //   141	151	549	finally
    //   155	161	549	finally
    //   165	171	549	finally
    //   175	182	549	finally
    //   196	218	549	finally
    //   232	244	549	finally
    //   345	353	549	finally
    //   103	112	553	java/lang/Throwable
    //   116	123	553	java/lang/Throwable
    //   127	137	553	java/lang/Throwable
    //   141	151	553	java/lang/Throwable
    //   155	161	553	java/lang/Throwable
    //   165	171	553	java/lang/Throwable
    //   175	182	553	java/lang/Throwable
    //   196	218	553	java/lang/Throwable
    //   232	244	553	java/lang/Throwable
  }
  
  public static boolean canUseVideoFeatrue(Context paramContext, int paramInt)
  {
    paramContext = o.a(xTG, "canUseVideoFeatrue", new Class[] { Integer.TYPE }, new Object[] { Integer.valueOf(paramInt) });
    if ((paramContext != null) && ((paramContext instanceof Boolean))) {
      return ((Boolean)paramContext).booleanValue();
    }
    return false;
  }
  
  public static void clear(Context paramContext) {}
  
  /* Error */
  public static void clearAllWebViewCache(Context paramContext, boolean paramBoolean)
  {
    // Byte code:
    //   0: new 481	android/webkit/WebView
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 483	android/webkit/WebView:<init>	(Landroid/content/Context;)V
    //   8: astore_2
    //   9: getstatic 383	android/os/Build$VERSION:SDK_INT	I
    //   12: bipush 11
    //   14: if_icmplt +24 -> 38
    //   17: aload_2
    //   18: ldc_w 485
    //   21: invokevirtual 488	android/webkit/WebView:removeJavascriptInterface	(Ljava/lang/String;)V
    //   24: aload_2
    //   25: ldc_w 490
    //   28: invokevirtual 488	android/webkit/WebView:removeJavascriptInterface	(Ljava/lang/String;)V
    //   31: aload_2
    //   32: ldc_w 492
    //   35: invokevirtual 488	android/webkit/WebView:removeJavascriptInterface	(Ljava/lang/String;)V
    //   38: aload_2
    //   39: iconst_1
    //   40: invokevirtual 496	android/webkit/WebView:clearCache	(Z)V
    //   43: iload_1
    //   44: ifeq +14 -> 58
    //   47: aload_0
    //   48: invokestatic 502	android/webkit/CookieSyncManager:createInstance	(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;
    //   51: pop
    //   52: invokestatic 508	android/webkit/CookieManager:getInstance	()Landroid/webkit/CookieManager;
    //   55: invokevirtual 511	android/webkit/CookieManager:removeAllCookie	()V
    //   58: aload_0
    //   59: invokestatic 516	android/webkit/WebViewDatabase:getInstance	(Landroid/content/Context;)Landroid/webkit/WebViewDatabase;
    //   62: invokevirtual 519	android/webkit/WebViewDatabase:clearUsernamePassword	()V
    //   65: aload_0
    //   66: invokestatic 516	android/webkit/WebViewDatabase:getInstance	(Landroid/content/Context;)Landroid/webkit/WebViewDatabase;
    //   69: invokevirtual 522	android/webkit/WebViewDatabase:clearHttpAuthUsernamePassword	()V
    //   72: aload_0
    //   73: invokestatic 516	android/webkit/WebViewDatabase:getInstance	(Landroid/content/Context;)Landroid/webkit/WebViewDatabase;
    //   76: invokevirtual 525	android/webkit/WebViewDatabase:clearFormData	()V
    //   79: invokestatic 530	android/webkit/WebStorage:getInstance	()Landroid/webkit/WebStorage;
    //   82: invokevirtual 533	android/webkit/WebStorage:deleteAllData	()V
    //   85: invokestatic 538	android/webkit/WebIconDatabase:getInstance	()Landroid/webkit/WebIconDatabase;
    //   88: invokevirtual 541	android/webkit/WebIconDatabase:removeAllIcons	()V
    //   91: new 543	com/tencent/smtt/sdk/WebView
    //   94: dup
    //   95: aload_0
    //   96: invokespecial 544	com/tencent/smtt/sdk/WebView:<init>	(Landroid/content/Context;)V
    //   99: invokevirtual 548	com/tencent/smtt/sdk/WebView:getWebViewClientExtension	()Lcom/tencent/smtt/export/external/extension/interfaces/IX5WebViewClientExtension;
    //   102: ifnull +68 -> 170
    //   105: invokestatic 554	com/tencent/smtt/sdk/ab:coW	()Lcom/tencent/smtt/sdk/ab;
    //   108: astore_2
    //   109: aload_2
    //   110: ifnull +60 -> 170
    //   113: aload_2
    //   114: invokevirtual 557	com/tencent/smtt/sdk/ab:coX	()Z
    //   117: ifeq +53 -> 170
    //   120: aload_2
    //   121: invokevirtual 561	com/tencent/smtt/sdk/ab:coY	()Lcom/tencent/smtt/sdk/ac;
    //   124: astore_2
    //   125: ldc_w 563
    //   128: ldc_w 565
    //   131: invokestatic 568	com/tencent/smtt/utils/TbsLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   134: iload_1
    //   135: ifeq +65 -> 200
    //   138: aload_2
    //   139: getfield 574	com/tencent/smtt/sdk/ac:xWV	Lcom/tencent/smtt/export/external/DexLoader;
    //   142: ldc_w 576
    //   145: ldc_w 578
    //   148: iconst_1
    //   149: anewarray 170	java/lang/Class
    //   152: dup
    //   153: iconst_0
    //   154: ldc_w 314
    //   157: aastore
    //   158: iconst_1
    //   159: anewarray 4	java/lang/Object
    //   162: dup
    //   163: iconst_0
    //   164: aload_0
    //   165: aastore
    //   166: invokevirtual 584	com/tencent/smtt/export/external/DexLoader:invokeStaticMethod	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   169: pop
    //   170: return
    //   171: astore_2
    //   172: ldc -46
    //   174: new 195	java/lang/StringBuilder
    //   177: dup
    //   178: ldc_w 586
    //   181: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   184: aload_2
    //   185: invokestatic 350	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   188: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   191: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   194: invokestatic 218	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   197: goto -106 -> 91
    //   200: aload_2
    //   201: getfield 574	com/tencent/smtt/sdk/ac:xWV	Lcom/tencent/smtt/export/external/DexLoader;
    //   204: ldc_w 576
    //   207: ldc_w 578
    //   210: iconst_2
    //   211: anewarray 170	java/lang/Class
    //   214: dup
    //   215: iconst_0
    //   216: ldc_w 314
    //   219: aastore
    //   220: dup
    //   221: iconst_1
    //   222: getstatic 587	java/lang/Boolean:TYPE	Ljava/lang/Class;
    //   225: aastore
    //   226: iconst_2
    //   227: anewarray 4	java/lang/Object
    //   230: dup
    //   231: iconst_0
    //   232: aload_0
    //   233: aastore
    //   234: dup
    //   235: iconst_1
    //   236: iload_1
    //   237: invokestatic 590	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   240: aastore
    //   241: invokevirtual 584	com/tencent/smtt/export/external/DexLoader:invokeStaticMethod	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   244: pop
    //   245: return
    //   246: astore_3
    //   247: aload_2
    //   248: getfield 574	com/tencent/smtt/sdk/ac:xWV	Lcom/tencent/smtt/export/external/DexLoader;
    //   251: ldc_w 576
    //   254: ldc_w 592
    //   257: iconst_1
    //   258: anewarray 170	java/lang/Class
    //   261: dup
    //   262: iconst_0
    //   263: ldc_w 314
    //   266: aastore
    //   267: iconst_1
    //   268: anewarray 4	java/lang/Object
    //   271: dup
    //   272: iconst_0
    //   273: aload_0
    //   274: aastore
    //   275: invokevirtual 584	com/tencent/smtt/export/external/DexLoader:invokeStaticMethod	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   278: pop
    //   279: aload_2
    //   280: getfield 574	com/tencent/smtt/sdk/ac:xWV	Lcom/tencent/smtt/export/external/DexLoader;
    //   283: ldc_w 576
    //   286: ldc_w 594
    //   289: iconst_1
    //   290: anewarray 170	java/lang/Class
    //   293: dup
    //   294: iconst_0
    //   295: ldc_w 314
    //   298: aastore
    //   299: iconst_1
    //   300: anewarray 4	java/lang/Object
    //   303: dup
    //   304: iconst_0
    //   305: aload_0
    //   306: aastore
    //   307: invokevirtual 584	com/tencent/smtt/export/external/DexLoader:invokeStaticMethod	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   310: pop
    //   311: aload_2
    //   312: getfield 574	com/tencent/smtt/sdk/ac:xWV	Lcom/tencent/smtt/export/external/DexLoader;
    //   315: ldc_w 576
    //   318: ldc_w 596
    //   321: iconst_1
    //   322: anewarray 170	java/lang/Class
    //   325: dup
    //   326: iconst_0
    //   327: ldc_w 314
    //   330: aastore
    //   331: iconst_1
    //   332: anewarray 4	java/lang/Object
    //   335: dup
    //   336: iconst_0
    //   337: aload_0
    //   338: aastore
    //   339: invokevirtual 584	com/tencent/smtt/export/external/DexLoader:invokeStaticMethod	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   342: pop
    //   343: aload_2
    //   344: getfield 574	com/tencent/smtt/sdk/ac:xWV	Lcom/tencent/smtt/export/external/DexLoader;
    //   347: ldc_w 598
    //   350: ldc_w 600
    //   353: aconst_null
    //   354: iconst_0
    //   355: anewarray 4	java/lang/Object
    //   358: invokevirtual 584	com/tencent/smtt/export/external/DexLoader:invokeStaticMethod	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   361: pop
    //   362: aload_2
    //   363: getfield 574	com/tencent/smtt/sdk/ac:xWV	Lcom/tencent/smtt/export/external/DexLoader;
    //   366: ldc_w 598
    //   369: ldc_w 602
    //   372: aconst_null
    //   373: iconst_0
    //   374: anewarray 4	java/lang/Object
    //   377: invokevirtual 584	com/tencent/smtt/export/external/DexLoader:invokeStaticMethod	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   380: pop
    //   381: aload_2
    //   382: getfield 574	com/tencent/smtt/sdk/ac:xWV	Lcom/tencent/smtt/export/external/DexLoader;
    //   385: ldc_w 604
    //   388: ldc_w 605
    //   391: aconst_null
    //   392: iconst_0
    //   393: anewarray 4	java/lang/Object
    //   396: invokevirtual 584	com/tencent/smtt/export/external/DexLoader:invokeStaticMethod	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   399: astore_0
    //   400: aload_0
    //   401: ifnull +23 -> 424
    //   404: aload_2
    //   405: getfield 574	com/tencent/smtt/sdk/ac:xWV	Lcom/tencent/smtt/export/external/DexLoader;
    //   408: aload_0
    //   409: ldc_w 604
    //   412: ldc_w 607
    //   415: aconst_null
    //   416: iconst_0
    //   417: anewarray 4	java/lang/Object
    //   420: invokevirtual 611	com/tencent/smtt/export/external/DexLoader:invokeMethod	(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   423: pop
    //   424: aload_2
    //   425: getfield 574	com/tencent/smtt/sdk/ac:xWV	Lcom/tencent/smtt/export/external/DexLoader;
    //   428: ldc_w 613
    //   431: ldc_w 605
    //   434: aconst_null
    //   435: iconst_0
    //   436: anewarray 4	java/lang/Object
    //   439: invokevirtual 584	com/tencent/smtt/export/external/DexLoader:invokeStaticMethod	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   442: astore_0
    //   443: aload_0
    //   444: ifnull +23 -> 467
    //   447: aload_2
    //   448: getfield 574	com/tencent/smtt/sdk/ac:xWV	Lcom/tencent/smtt/export/external/DexLoader;
    //   451: aload_0
    //   452: ldc_w 613
    //   455: ldc_w 615
    //   458: aconst_null
    //   459: iconst_0
    //   460: anewarray 4	java/lang/Object
    //   463: invokevirtual 611	com/tencent/smtt/export/external/DexLoader:invokeMethod	(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   466: pop
    //   467: aload_2
    //   468: getfield 574	com/tencent/smtt/sdk/ac:xWV	Lcom/tencent/smtt/export/external/DexLoader;
    //   471: ldc_w 576
    //   474: ldc_w 616
    //   477: aconst_null
    //   478: iconst_0
    //   479: anewarray 4	java/lang/Object
    //   482: invokevirtual 584	com/tencent/smtt/export/external/DexLoader:invokeStaticMethod	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   485: pop
    //   486: return
    //   487: astore_0
    //   488: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	489	0	paramContext	Context
    //   0	489	1	paramBoolean	boolean
    //   8	131	2	localObject	Object
    //   171	297	2	localThrowable	Throwable
    //   246	1	3	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   0	38	171	java/lang/Throwable
    //   38	43	171	java/lang/Throwable
    //   47	58	171	java/lang/Throwable
    //   58	91	171	java/lang/Throwable
    //   200	245	246	java/lang/Exception
    //   91	109	487	java/lang/Throwable
    //   113	134	487	java/lang/Throwable
    //   138	170	487	java/lang/Throwable
    //   200	245	487	java/lang/Throwable
    //   247	400	487	java/lang/Throwable
    //   404	424	487	java/lang/Throwable
    //   424	443	487	java/lang/Throwable
    //   447	467	487	java/lang/Throwable
    //   467	486	487	java/lang/Throwable
  }
  
  public static void closeFileReader(Context paramContext)
  {
    ab localab = ab.coW();
    localab.b(paramContext, null);
    if (localab.coX()) {
      localab.coY().xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "closeFileReader", new Class[0], new Object[0]);
    }
  }
  
  static String cnN()
  {
    return xTE;
  }
  
  protected static String cnO()
  {
    Object localObject = ab.coW();
    if ((localObject != null) && (((ab)localObject).coX()))
    {
      localObject = ((ab)localObject).coY().xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "getGUID", new Class[0], new Object[0]);
      if ((localObject != null) && ((localObject instanceof String))) {
        return (String)localObject;
      }
    }
    return null;
  }
  
  public static boolean createMiniQBShortCut(Context paramContext, String paramString1, String paramString2, Drawable paramDrawable)
  {
    if (paramContext == null) {
      return false;
    }
    if (l.gp(paramContext)) {
      return false;
    }
    if (isMiniQBShortCutExist(paramContext, paramString1, paramString2) == true) {
      return false;
    }
    ab localab = ab.coW();
    if ((localab != null) && (localab.coX()))
    {
      Bitmap localBitmap = null;
      if ((paramDrawable instanceof BitmapDrawable)) {
        localBitmap = ((BitmapDrawable)paramDrawable).getBitmap();
      }
      paramDrawable = localab.coY().xWV;
      TbsLog.e("QbSdk", "qbsdk createMiniQBShortCut");
      paramContext = paramDrawable.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "createMiniQBShortCut", new Class[] { Context.class, String.class, String.class, Bitmap.class }, new Object[] { paramContext, paramString1, paramString2, localBitmap });
      TbsLog.e("QbSdk", "qbsdk after createMiniQBShortCut ret: " + paramContext);
      return paramContext != null;
    }
    return false;
  }
  
  public static boolean deleteMiniQBShortCut(Context paramContext, String paramString1, String paramString2)
  {
    if (paramContext == null) {}
    ab localab;
    do
    {
      do
      {
        do
        {
          return false;
        } while (l.gp(paramContext));
        localab = ab.coW();
      } while ((localab == null) || (!localab.coX()));
    } while (localab.coY().xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "deleteMiniQBShortCut", new Class[] { Context.class, String.class, String.class }, new Object[] { paramContext, paramString1, paramString2 }) == null);
    return true;
  }
  
  public static void disAllowThirdAppDownload()
  {
    xTJ = false;
  }
  
  static Bundle e(Context paramContext, Bundle paramBundle)
  {
    if (!gc(paramContext))
    {
      r.gR(paramContext).aS(216, "initForPatch return false!");
      return null;
    }
    paramBundle = o.a(xTG, "incrUpdate", new Class[] { Context.class, Bundle.class }, new Object[] { paramContext, paramBundle });
    if (paramBundle != null) {
      return (Bundle)paramBundle;
    }
    r.gR(paramContext).aS(216, "incrUpdate return null!");
    return null;
  }
  
  public static void fileInfoDetect(Context paramContext, String paramString, ValueCallback<String> paramValueCallback)
  {
    ab localab = ab.coW();
    if ((localab != null) && (localab.coX())) {}
    try
    {
      localab.coY().xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "fileInfoDetect", new Class[] { Context.class, String.class, ValueCallback.class }, new Object[] { paramContext, paramString, paramValueCallback });
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public static void forceSysWebView()
  {
    xTI = true;
    xTM = "SysWebViewForcedByOuter: " + Log.getStackTraceString(new Throwable());
    TbsLog.e("QbSdk", "sys WebView: SysWebViewForcedByOuter");
  }
  
  private static boolean gc(Context paramContext)
  {
    try
    {
      if (xTF != null) {
        return true;
      }
      p.cov();
      Object localObject = p.gK(paramContext);
      if (localObject == null)
      {
        TbsLog.e("QbSdk", "QbSdk initExtension (false) optDir == null");
        return false;
      }
      File localFile = new File((File)localObject, "tbs_sdk_extension_dex.jar");
      if (!localFile.exists())
      {
        TbsLog.e("QbSdk", "QbSdk initExtension (false) dexFile.exists()=false", true);
        return false;
      }
      localObject = new DexClassLoader(localFile.getAbsolutePath(), ((File)localObject).getAbsolutePath(), localFile.getAbsolutePath(), QbSdk.class.getClassLoader()).loadClass("com.tencent.tbs.sdk.extension.TbsSDKExtension");
      xTF = (Class)localObject;
      xTG = ((Class)localObject).getConstructor(new Class[] { Context.class, Context.class }).newInstance(new Object[] { paramContext, paramContext });
      return true;
    }
    catch (Throwable paramContext)
    {
      TbsLog.e("QbSdk", "initExtension sys WebView: " + Log.getStackTraceString(paramContext));
    }
    return false;
  }
  
  private static boolean gd(Context paramContext)
  {
    for (;;)
    {
      Object localObject1;
      try
      {
        if (xTF != null) {
          return true;
        }
        p.cov();
        localObject1 = p.gK(paramContext);
        if (localObject1 == null)
        {
          TbsLog.e("QbSdk", "QbSdk initForX5DisableConfig (false) optDir == null");
          return false;
        }
        if (t.gU(paramContext))
        {
          i.cnZ().ak(paramContext, 304);
          return false;
        }
        p.cov();
        Object localObject2 = new File(p.gK(paramContext), "tbs_sdk_extension_dex.jar");
        if (!((File)localObject2).exists())
        {
          i.cnZ().a(paramContext, 406, new Exception("initForX5DisableConfig failure -- tbs_sdk_extension_dex.jar is not exist!"));
          return false;
        }
        if (t.coF() != null)
        {
          localObject1 = t.coF();
          TbsLog.i("QbSdk", "QbSdk init optDirExtension #3 is " + (String)localObject1);
          localObject1 = new DexClassLoader(((File)localObject2).getAbsolutePath(), (String)localObject1, ((File)localObject2).getAbsolutePath(), QbSdk.class.getClassLoader()).loadClass("com.tencent.tbs.sdk.extension.TbsSDKExtension");
          xTF = (Class)localObject1;
          localObject1 = ((Class)localObject1).getConstructor(new Class[] { Context.class, Context.class });
          if (!t.gU(paramContext)) {
            break label408;
          }
          if (t.coF() == null)
          {
            r.gR(paramContext.getApplicationContext()).aT(227, "host context is null!");
            return false;
          }
        }
        else
        {
          localObject1 = ((File)localObject1).getAbsolutePath();
          continue;
        }
        xTG = xTF.getConstructor(new Class[] { Context.class, Context.class, String.class }).newInstance(new Object[] { paramContext, null, t.coF() });
        paramContext = xTG;
        localObject1 = com.tencent.smtt.utils.c.aGO;
        localObject2 = com.tencent.smtt.utils.c.xYb;
        String str1 = com.tencent.smtt.utils.c.xYc;
        String str2 = com.tencent.smtt.utils.c.aKJ;
        o.a(paramContext, "putInfo", new Class[] { String.class, String.class, String.class, String.class }, new Object[] { localObject1, localObject2, str1, str2 });
        o.a(xTG, "setClientVersion", new Class[] { Integer.TYPE }, new Object[] { Integer.valueOf(1) });
        return true;
      }
      catch (Throwable paramContext)
      {
        TbsLog.e("QbSdk", "initForX5DisableConfig sys WebView: " + Log.getStackTraceString(paramContext));
        return false;
      }
      label408:
      xTG = ((Constructor)localObject1).newInstance(new Object[] { paramContext, paramContext });
    }
  }
  
  public static long getApkFileSize(Context paramContext)
  {
    long l = 0L;
    if (paramContext != null) {
      l = k.gl(paramContext.getApplicationContext()).xVi.getLong("tbs_apkfilesize", 0L);
    }
    return l;
  }
  
  public static String[] getDexLoaderFileList(Context paramContext1, Context paramContext2, String paramString)
  {
    int i = 0;
    if ((xTL instanceof String[]))
    {
      int j = xTL.length;
      paramContext2 = new String[j];
      for (;;)
      {
        paramContext1 = paramContext2;
        if (i >= j) {
          break;
        }
        paramContext2[i] = (paramString + xTL[i]);
        i += 1;
      }
    }
    paramContext1 = o.a(xTG, "getJarFiles", new Class[] { Context.class, Context.class, String.class }, new Object[] { paramContext1, paramContext2, paramString });
    if ((paramContext1 instanceof String[])) {}
    for (;;)
    {
      paramContext1 = (String[])paramContext1;
      return paramContext1;
      paramContext1 = new String[1];
      paramContext1[0] = "";
    }
  }
  
  public static boolean getDownloadWithoutWifi()
  {
    return xTZ;
  }
  
  public static boolean getIsSysWebViewForcedByOuter()
  {
    return xTI;
  }
  
  public static String getMiniQBVersion(Context paramContext)
  {
    ab localab = ab.coW();
    localab.b(paramContext, null);
    if ((localab != null) && (localab.coX()))
    {
      paramContext = localab.coY().xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "getMiniQBVersion", new Class[0], new Object[0]);
      if (paramContext == null) {
        return null;
      }
      return (String)paramContext;
    }
    return null;
  }
  
  public static String getQQBuildNumber()
  {
    return xTW;
  }
  
  public static boolean getTBSInstalling()
  {
    return xUa;
  }
  
  public static String getTID()
  {
    return xTV;
  }
  
  public static String getTbsResourcesPath(Context paramContext)
  {
    return t.getTbsResourcesPath(paramContext);
  }
  
  public static int getTbsVersion(Context paramContext)
  {
    int i;
    if (t.gU(paramContext)) {
      i = t.coL();
    }
    int j;
    do
    {
      do
      {
        return i;
        j = p.cov().gC(paramContext);
        i = j;
      } while (j != 0);
      i = j;
    } while (j.gk(paramContext).Ye("install_status") != 3);
    reset(paramContext);
    return j;
  }
  
  public static void initBuglyAsync(boolean paramBoolean)
  {
    xTS = paramBoolean;
  }
  
  public static void initTbsSettings(Map<String, Object> paramMap)
  {
    if (xUc == null)
    {
      xUc = paramMap;
      return;
    }
    try
    {
      xUc.putAll(paramMap);
      return;
    }
    catch (Exception paramMap) {}
  }
  
  public static void initX5Environment(Context paramContext, final a parama)
  {
    if (paramContext == null) {
      return;
    }
    mTbsListenerForInit = new q()
    {
      public final void jA(int paramAnonymousInt) {}
      
      public final void jB(int paramAnonymousInt)
      {
        QbSdk.preInit(this.val$context, parama);
      }
      
      public final void jC(int paramAnonymousInt) {}
    };
    if (t.gU(paramContext)) {
      p.cov().v(paramContext, true);
    }
    l.a(paramContext, false, false, new l.a()
    {
      public final void g(boolean paramAnonymousBoolean, int paramAnonymousInt)
      {
        if ((t.coM() == 0) && (!t.coI()))
        {
          t.x(this.val$context, false);
          if ((QbSdk.xTS) && (t.gU(this.val$context))) {
            m.cot().gr(this.val$context);
          }
          return;
        }
        if ((QbSdk.xTS) && (t.gU(this.val$context))) {
          m.cot().gr(this.val$context);
        }
        QbSdk.preInit(this.val$context, parama);
      }
    });
  }
  
  public static boolean installLocalQbApk(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    d locald = d.mW(true);
    locald.a(paramContext, null);
    if ((locald != null) && (locald.xUj))
    {
      paramContext = locald.cnP().xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "installLocalQbApk", new Class[] { Context.class, String.class, String.class, Bundle.class }, new Object[] { paramContext, paramString1, paramString2, paramBundle });
      if (paramContext == null) {
        return false;
      }
      return ((Boolean)paramContext).booleanValue();
    }
    return false;
  }
  
  public static boolean intentDispatch(WebView paramWebView, Intent paramIntent, String paramString1, String paramString2)
  {
    if (paramWebView == null) {
      return false;
    }
    Context localContext;
    int i;
    if (paramString1.startsWith("mttbrowser://miniqb/ch=icon?"))
    {
      localContext = paramWebView.getContext();
      i = paramString1.indexOf("url=");
      if (i <= 0) {
        break label178;
      }
    }
    label178:
    for (paramIntent = paramString1.substring(i + 4);; paramIntent = null)
    {
      HashMap localHashMap = new HashMap();
      paramString1 = "unknown";
      try
      {
        String str = localContext.getApplicationInfo().packageName;
        paramString1 = str;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          continue;
          paramString1 = paramIntent;
        }
      }
      localHashMap.put("ChannelID", paramString1);
      localHashMap.put("PosID", "14004");
      if ("miniqb://home".equals(paramIntent))
      {
        paramString1 = "qb://navicard/addCard?cardId=168&cardName=168";
        if (com.tencent.smtt.sdk.a.c.a(localContext, paramString1, localHashMap, "QbSdk.startMiniQBToLoadUrl", null) != 0)
        {
          paramString1 = ab.coW();
          if ((paramString1 != null) && (paramString1.coX()) && (paramString1.coY().a(localContext, paramIntent, null, paramString2, null) == 0)) {
            return true;
          }
          paramWebView.loadUrl(paramIntent);
        }
        for (;;)
        {
          return false;
          paramWebView.loadUrl(paramString1);
        }
      }
    }
  }
  
  public static boolean isMiniQBShortCutExist(Context paramContext, String paramString1, String paramString2)
  {
    if (paramContext == null) {
      return false;
    }
    if (l.gp(paramContext)) {
      return false;
    }
    paramString2 = ab.coW();
    if ((paramString2 != null) && (paramString2.coX()))
    {
      paramContext = paramString2.coY().xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "isMiniQBShortCutExist", new Class[] { Context.class, String.class }, new Object[] { paramContext, paramString1 });
      if (paramContext != null) {
        if (!(paramContext instanceof Boolean)) {
          break label99;
        }
      }
    }
    label99:
    for (paramContext = (Boolean)paramContext;; paramContext = Boolean.valueOf(false))
    {
      return paramContext.booleanValue();
      return false;
      return false;
    }
  }
  
  public static boolean isTbsCoreInited()
  {
    boolean bool2 = false;
    d locald = d.mW(false);
    boolean bool1 = bool2;
    if (locald != null)
    {
      bool1 = bool2;
      if (locald.xUk) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public static boolean isX5DisabledSync(Context paramContext)
  {
    if (j.gk(paramContext).Ye("install_status") == 2) {}
    for (int i = 1; i != 0; i = 0) {
      return false;
    }
    if (!gd(paramContext)) {
      return true;
    }
    i = p.cov().gC(paramContext);
    paramContext = o.a(xTG, "isX5DisabledSync", new Class[] { Integer.TYPE, Integer.TYPE }, new Object[] { Integer.valueOf(i), Integer.valueOf(43601) });
    if (paramContext != null) {
      return ((Boolean)paramContext).booleanValue();
    }
    return true;
  }
  
  /* Error */
  @SuppressLint({"NewApi"})
  private static boolean p(Context paramContext, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: istore 7
    //   3: aload_0
    //   4: invokestatic 871	com/tencent/smtt/utils/TbsLog:initIfNeed	(Landroid/content/Context;)V
    //   7: getstatic 97	com/tencent/smtt/sdk/QbSdk:sIsVersionPrinted	Z
    //   10: ifne +15 -> 25
    //   13: ldc -46
    //   15: ldc_w 873
    //   18: invokestatic 294	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: iconst_1
    //   22: putstatic 97	com/tencent/smtt/sdk/QbSdk:sIsVersionPrinted	Z
    //   25: getstatic 105	com/tencent/smtt/sdk/QbSdk:xTH	Z
    //   28: ifeq +54 -> 82
    //   31: iload_1
    //   32: ifne +50 -> 82
    //   35: ldc -46
    //   37: new 195	java/lang/StringBuilder
    //   40: dup
    //   41: ldc_w 875
    //   44: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   47: getstatic 119	com/tencent/smtt/sdk/QbSdk:xTN	Ljava/lang/String;
    //   50: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   56: iconst_0
    //   57: invokestatic 286	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   60: invokestatic 224	com/tencent/smtt/sdk/i:cnZ	()Lcom/tencent/smtt/sdk/i;
    //   63: aload_0
    //   64: sipush 414
    //   67: new 226	java/lang/Throwable
    //   70: dup
    //   71: getstatic 119	com/tencent/smtt/sdk/QbSdk:xTN	Ljava/lang/String;
    //   74: invokespecial 227	java/lang/Throwable:<init>	(Ljava/lang/String;)V
    //   77: invokevirtual 230	com/tencent/smtt/sdk/i:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   80: iconst_0
    //   81: ireturn
    //   82: getstatic 107	com/tencent/smtt/sdk/QbSdk:xTI	Z
    //   85: ifeq +34 -> 119
    //   88: ldc -46
    //   90: ldc_w 877
    //   93: iconst_1
    //   94: invokestatic 286	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   97: invokestatic 224	com/tencent/smtt/sdk/i:cnZ	()Lcom/tencent/smtt/sdk/i;
    //   100: aload_0
    //   101: sipush 402
    //   104: new 226	java/lang/Throwable
    //   107: dup
    //   108: getstatic 115	com/tencent/smtt/sdk/QbSdk:xTM	Ljava/lang/String;
    //   111: invokespecial 227	java/lang/Throwable:<init>	(Ljava/lang/String;)V
    //   114: invokevirtual 230	com/tencent/smtt/sdk/i:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   117: iconst_0
    //   118: ireturn
    //   119: getstatic 144	com/tencent/smtt/sdk/QbSdk:xTY	Z
    //   122: ifne +53 -> 175
    //   125: iconst_1
    //   126: putstatic 144	com/tencent/smtt/sdk/QbSdk:xTY	Z
    //   129: getstatic 383	android/os/Build$VERSION:SDK_INT	I
    //   132: bipush 11
    //   134: if_icmplt +86 -> 220
    //   137: aload_0
    //   138: ldc_w 879
    //   141: iconst_4
    //   142: invokevirtual 883	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   145: astore 8
    //   147: aload 8
    //   149: ldc_w 885
    //   152: iconst_m1
    //   153: invokeinterface 889 3 0
    //   158: istore 4
    //   160: iload 4
    //   162: iflt +1351 -> 1513
    //   165: iload 4
    //   167: iconst_1
    //   168: iadd
    //   169: istore_2
    //   170: iload_2
    //   171: iconst_4
    //   172: if_icmple +61 -> 233
    //   175: invokestatic 261	com/tencent/smtt/sdk/p:cov	()Lcom/tencent/smtt/sdk/p;
    //   178: pop
    //   179: aload_0
    //   180: invokestatic 265	com/tencent/smtt/sdk/p:gK	(Landroid/content/Context;)Ljava/io/File;
    //   183: astore 8
    //   185: aload 8
    //   187: ifnonnull +529 -> 716
    //   190: ldc -46
    //   192: ldc_w 891
    //   195: invokestatic 218	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   198: invokestatic 224	com/tencent/smtt/sdk/i:cnZ	()Lcom/tencent/smtt/sdk/i;
    //   201: aload_0
    //   202: sipush 312
    //   205: new 226	java/lang/Throwable
    //   208: dup
    //   209: ldc_w 893
    //   212: invokespecial 227	java/lang/Throwable:<init>	(Ljava/lang/String;)V
    //   215: invokevirtual 230	com/tencent/smtt/sdk/i:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   218: iconst_0
    //   219: ireturn
    //   220: aload_0
    //   221: ldc_w 879
    //   224: iconst_0
    //   225: invokevirtual 883	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   228: astore 8
    //   230: goto -83 -> 147
    //   233: iload_2
    //   234: istore 4
    //   236: invokestatic 261	com/tencent/smtt/sdk/p:cov	()Lcom/tencent/smtt/sdk/p;
    //   239: aload_0
    //   240: invokevirtual 746	com/tencent/smtt/sdk/p:gC	(Landroid/content/Context;)I
    //   243: istore_3
    //   244: iload_3
    //   245: ifle -70 -> 175
    //   248: iload 4
    //   250: iconst_4
    //   251: if_icmpgt +26 -> 277
    //   254: aload 8
    //   256: invokeinterface 897 1 0
    //   261: ldc_w 885
    //   264: iload 4
    //   266: invokeinterface 903 3 0
    //   271: invokeinterface 906 1 0
    //   276: pop
    //   277: aload 8
    //   279: ldc_w 908
    //   282: iconst_m1
    //   283: invokeinterface 889 3 0
    //   288: istore 6
    //   290: iload_2
    //   291: istore 4
    //   293: aload 8
    //   295: astore 9
    //   297: iload_3
    //   298: istore 5
    //   300: iload 6
    //   302: iflt +226 -> 528
    //   305: aload 8
    //   307: invokeinterface 897 1 0
    //   312: astore 9
    //   314: iload 6
    //   316: iconst_1
    //   317: iadd
    //   318: istore 6
    //   320: aload 9
    //   322: ldc_w 908
    //   325: iload 6
    //   327: invokeinterface 903 3 0
    //   332: invokeinterface 906 1 0
    //   337: pop
    //   338: iload 6
    //   340: iconst_3
    //   341: if_icmple +238 -> 579
    //   344: aload 8
    //   346: ldc_w 910
    //   349: iconst_m1
    //   350: invokeinterface 889 3 0
    //   355: istore_2
    //   356: aload 8
    //   358: invokeinterface 897 1 0
    //   363: astore 8
    //   365: iload_2
    //   366: iload_3
    //   367: if_icmpne +177 -> 544
    //   370: invokestatic 261	com/tencent/smtt/sdk/p:cov	()Lcom/tencent/smtt/sdk/p;
    //   373: pop
    //   374: aload_0
    //   375: invokestatic 265	com/tencent/smtt/sdk/p:gK	(Landroid/content/Context;)Ljava/io/File;
    //   378: iconst_0
    //   379: invokestatic 915	com/tencent/smtt/utils/f:c	(Ljava/io/File;Z)V
    //   382: aload_0
    //   383: invokestatic 752	com/tencent/smtt/sdk/j:gk	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/j;
    //   386: pop
    //   387: invokestatic 919	com/tencent/smtt/sdk/j:coa	()Ljava/io/File;
    //   390: astore 9
    //   392: aload 9
    //   394: ifnull +9 -> 403
    //   397: aload 9
    //   399: iconst_0
    //   400: invokestatic 915	com/tencent/smtt/utils/f:c	(Ljava/io/File;Z)V
    //   403: ldc -46
    //   405: new 195	java/lang/StringBuilder
    //   408: dup
    //   409: ldc_w 921
    //   412: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   415: iload_3
    //   416: invokevirtual 378	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   419: ldc_w 923
    //   422: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   425: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   428: invokestatic 218	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   431: aload 8
    //   433: ldc_w 925
    //   436: iload_2
    //   437: invokeinterface 903 3 0
    //   442: pop
    //   443: aload 8
    //   445: invokeinterface 906 1 0
    //   450: pop
    //   451: goto -276 -> 175
    //   454: astore 8
    //   456: ldc -46
    //   458: new 195	java/lang/StringBuilder
    //   461: dup
    //   462: ldc_w 927
    //   465: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   468: aload 8
    //   470: invokestatic 350	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   473: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   476: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   479: invokestatic 218	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   482: goto -307 -> 175
    //   485: astore 9
    //   487: aconst_null
    //   488: astore 8
    //   490: iconst_m1
    //   491: istore_2
    //   492: iconst_m1
    //   493: istore 4
    //   495: ldc -46
    //   497: new 195	java/lang/StringBuilder
    //   500: dup
    //   501: ldc_w 929
    //   504: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   507: aload 9
    //   509: invokestatic 350	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   512: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   515: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   518: invokestatic 218	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   521: iload_2
    //   522: istore 5
    //   524: aload 8
    //   526: astore 9
    //   528: iconst_m1
    //   529: istore 6
    //   531: iload 4
    //   533: istore_2
    //   534: aload 9
    //   536: astore 8
    //   538: iload 5
    //   540: istore_3
    //   541: goto -203 -> 338
    //   544: ldc -46
    //   546: new 195	java/lang/StringBuilder
    //   549: dup
    //   550: ldc_w 931
    //   553: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   556: iload_3
    //   557: invokevirtual 378	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   560: ldc_w 933
    //   563: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   566: iload_2
    //   567: invokevirtual 378	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   570: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   573: invokestatic 218	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   576: goto -145 -> 431
    //   579: iload 7
    //   581: istore_3
    //   582: iload_2
    //   583: ifle +37 -> 620
    //   586: iload 7
    //   588: istore_3
    //   589: iload_2
    //   590: iconst_3
    //   591: if_icmpgt +29 -> 620
    //   594: ldc -46
    //   596: ldc_w 935
    //   599: invokestatic 294	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   602: invokestatic 554	com/tencent/smtt/sdk/ab:coW	()Lcom/tencent/smtt/sdk/ab;
    //   605: aload_0
    //   606: aconst_null
    //   607: invokevirtual 621	com/tencent/smtt/sdk/ab:b	(Landroid/content/Context;Lcom/tencent/smtt/sdk/o;)V
    //   610: ldc -46
    //   612: ldc_w 937
    //   615: invokestatic 294	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   618: iconst_0
    //   619: istore_3
    //   620: aload 8
    //   622: ldc_w 908
    //   625: iconst_m1
    //   626: invokeinterface 889 3 0
    //   631: istore_2
    //   632: iload_2
    //   633: ifle +27 -> 660
    //   636: aload 8
    //   638: invokeinterface 897 1 0
    //   643: ldc_w 908
    //   646: iload_2
    //   647: iconst_1
    //   648: isub
    //   649: invokeinterface 903 3 0
    //   654: invokeinterface 906 1 0
    //   659: pop
    //   660: ldc -46
    //   662: new 195	java/lang/StringBuilder
    //   665: dup
    //   666: ldc_w 939
    //   669: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   672: iload_3
    //   673: invokevirtual 378	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   676: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   679: invokestatic 294	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   682: goto -507 -> 175
    //   685: astore 8
    //   687: ldc -46
    //   689: new 195	java/lang/StringBuilder
    //   692: dup
    //   693: ldc_w 941
    //   696: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   699: aload 8
    //   701: invokestatic 350	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   704: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   707: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   710: invokestatic 218	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   713: goto -53 -> 660
    //   716: aload_0
    //   717: invokestatic 689	com/tencent/smtt/sdk/t:gU	(Landroid/content/Context;)Z
    //   720: ifne +135 -> 855
    //   723: getstatic 99	com/tencent/smtt/sdk/QbSdk:xTD	I
    //   726: ifeq +792 -> 1518
    //   729: invokestatic 261	com/tencent/smtt/sdk/p:cov	()Lcom/tencent/smtt/sdk/p;
    //   732: iconst_1
    //   733: aload_0
    //   734: invokevirtual 944	com/tencent/smtt/sdk/p:a	(ZLandroid/content/Context;)I
    //   737: istore_3
    //   738: iload_3
    //   739: istore_2
    //   740: getstatic 99	com/tencent/smtt/sdk/QbSdk:xTD	I
    //   743: iload_3
    //   744: if_icmpeq +107 -> 851
    //   747: aconst_null
    //   748: putstatic 255	com/tencent/smtt/sdk/QbSdk:xTF	Ljava/lang/Class;
    //   751: aconst_null
    //   752: putstatic 166	com/tencent/smtt/sdk/QbSdk:xTG	Ljava/lang/Object;
    //   755: ldc -46
    //   757: new 195	java/lang/StringBuilder
    //   760: dup
    //   761: ldc_w 946
    //   764: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   767: iload_3
    //   768: invokevirtual 378	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   771: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   774: iconst_1
    //   775: invokestatic 286	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   778: ldc -46
    //   780: new 195	java/lang/StringBuilder
    //   783: dup
    //   784: ldc_w 948
    //   787: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   790: getstatic 99	com/tencent/smtt/sdk/QbSdk:xTD	I
    //   793: invokevirtual 378	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   796: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   799: iconst_1
    //   800: invokestatic 286	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   803: invokestatic 224	com/tencent/smtt/sdk/i:cnZ	()Lcom/tencent/smtt/sdk/i;
    //   806: aload_0
    //   807: sipush 303
    //   810: new 226	java/lang/Throwable
    //   813: dup
    //   814: new 195	java/lang/StringBuilder
    //   817: dup
    //   818: ldc_w 950
    //   821: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   824: getstatic 99	com/tencent/smtt/sdk/QbSdk:xTD	I
    //   827: invokevirtual 378	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   830: ldc_w 952
    //   833: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   836: iload_3
    //   837: invokevirtual 378	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   840: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   843: invokespecial 227	java/lang/Throwable:<init>	(Ljava/lang/String;)V
    //   846: invokevirtual 230	com/tencent/smtt/sdk/i:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   849: iconst_0
    //   850: ireturn
    //   851: iload_2
    //   852: putstatic 99	com/tencent/smtt/sdk/QbSdk:xTD	I
    //   855: getstatic 255	com/tencent/smtt/sdk/QbSdk:xTF	Ljava/lang/Class;
    //   858: ifnull +5 -> 863
    //   861: iconst_1
    //   862: ireturn
    //   863: aload_0
    //   864: invokestatic 689	com/tencent/smtt/sdk/t:gU	(Landroid/content/Context;)Z
    //   867: ifeq +25 -> 892
    //   870: invokestatic 224	com/tencent/smtt/sdk/i:cnZ	()Lcom/tencent/smtt/sdk/i;
    //   873: aload_0
    //   874: sipush 304
    //   877: new 226	java/lang/Throwable
    //   880: dup
    //   881: ldc_w 954
    //   884: invokespecial 227	java/lang/Throwable:<init>	(Ljava/lang/String;)V
    //   887: invokevirtual 230	com/tencent/smtt/sdk/i:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   890: iconst_0
    //   891: ireturn
    //   892: invokestatic 261	com/tencent/smtt/sdk/p:cov	()Lcom/tencent/smtt/sdk/p;
    //   895: pop
    //   896: new 269	java/io/File
    //   899: dup
    //   900: aload_0
    //   901: invokestatic 265	com/tencent/smtt/sdk/p:gK	(Landroid/content/Context;)Ljava/io/File;
    //   904: ldc_w 276
    //   907: invokespecial 392	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   910: astore 9
    //   912: aload 9
    //   914: invokevirtual 281	java/io/File:exists	()Z
    //   917: istore_1
    //   918: iload_1
    //   919: ifne +196 -> 1115
    //   922: ldc -46
    //   924: ldc_w 956
    //   927: invokestatic 218	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   930: invokestatic 261	com/tencent/smtt/sdk/p:cov	()Lcom/tencent/smtt/sdk/p;
    //   933: aload_0
    //   934: invokevirtual 746	com/tencent/smtt/sdk/p:gC	(Landroid/content/Context;)I
    //   937: istore_2
    //   938: new 269	java/io/File
    //   941: dup
    //   942: aload 9
    //   944: invokevirtual 959	java/io/File:getParentFile	()Ljava/io/File;
    //   947: ldc_w 961
    //   950: invokespecial 392	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   953: invokevirtual 281	java/io/File:exists	()Z
    //   956: ifeq +81 -> 1037
    //   959: iload_2
    //   960: ifle +40 -> 1000
    //   963: invokestatic 224	com/tencent/smtt/sdk/i:cnZ	()Lcom/tencent/smtt/sdk/i;
    //   966: aload_0
    //   967: sipush 4131
    //   970: new 367	java/lang/Exception
    //   973: dup
    //   974: new 195	java/lang/StringBuilder
    //   977: dup
    //   978: ldc_w 963
    //   981: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   984: iload_2
    //   985: invokevirtual 378	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   988: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   991: invokespecial 692	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   994: invokevirtual 230	com/tencent/smtt/sdk/i:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   997: goto +526 -> 1523
    //   1000: invokestatic 224	com/tencent/smtt/sdk/i:cnZ	()Lcom/tencent/smtt/sdk/i;
    //   1003: aload_0
    //   1004: sipush 4132
    //   1007: new 367	java/lang/Exception
    //   1010: dup
    //   1011: new 195	java/lang/StringBuilder
    //   1014: dup
    //   1015: ldc_w 963
    //   1018: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1021: iload_2
    //   1022: invokevirtual 378	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1025: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1028: invokespecial 692	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   1031: invokevirtual 230	com/tencent/smtt/sdk/i:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   1034: goto +489 -> 1523
    //   1037: iload_2
    //   1038: ifle +40 -> 1078
    //   1041: invokestatic 224	com/tencent/smtt/sdk/i:cnZ	()Lcom/tencent/smtt/sdk/i;
    //   1044: aload_0
    //   1045: sipush 4121
    //   1048: new 367	java/lang/Exception
    //   1051: dup
    //   1052: new 195	java/lang/StringBuilder
    //   1055: dup
    //   1056: ldc_w 965
    //   1059: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1062: iload_2
    //   1063: invokevirtual 378	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1066: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1069: invokespecial 692	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   1072: invokevirtual 230	com/tencent/smtt/sdk/i:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   1075: goto +448 -> 1523
    //   1078: invokestatic 224	com/tencent/smtt/sdk/i:cnZ	()Lcom/tencent/smtt/sdk/i;
    //   1081: aload_0
    //   1082: sipush 4122
    //   1085: new 367	java/lang/Exception
    //   1088: dup
    //   1089: new 195	java/lang/StringBuilder
    //   1092: dup
    //   1093: ldc_w 965
    //   1096: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1099: iload_2
    //   1100: invokevirtual 378	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1103: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1106: invokespecial 692	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   1109: invokevirtual 230	com/tencent/smtt/sdk/i:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   1112: goto +411 -> 1523
    //   1115: invokestatic 289	com/tencent/smtt/sdk/t:coF	()Ljava/lang/String;
    //   1118: ifnull +122 -> 1240
    //   1121: invokestatic 289	com/tencent/smtt/sdk/t:coF	()Ljava/lang/String;
    //   1124: astore 8
    //   1126: ldc -46
    //   1128: new 195	java/lang/StringBuilder
    //   1131: dup
    //   1132: ldc_w 967
    //   1135: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1138: aload 8
    //   1140: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1143: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1146: invokestatic 294	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1149: new 296	dalvik/system/DexClassLoader
    //   1152: dup
    //   1153: aload 9
    //   1155: invokevirtual 299	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1158: aload 8
    //   1160: aload 9
    //   1162: invokevirtual 299	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1165: ldc 2
    //   1167: invokevirtual 303	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   1170: invokespecial 306	dalvik/system/DexClassLoader:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   1173: ldc_w 308
    //   1176: invokevirtual 312	dalvik/system/DexClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   1179: astore 8
    //   1181: aload 8
    //   1183: putstatic 255	com/tencent/smtt/sdk/QbSdk:xTF	Ljava/lang/Class;
    //   1186: aload 8
    //   1188: iconst_2
    //   1189: anewarray 170	java/lang/Class
    //   1192: dup
    //   1193: iconst_0
    //   1194: ldc_w 314
    //   1197: aastore
    //   1198: dup
    //   1199: iconst_1
    //   1200: ldc_w 314
    //   1203: aastore
    //   1204: invokevirtual 334	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   1207: astore 8
    //   1209: aload_0
    //   1210: invokestatic 689	com/tencent/smtt/sdk/t:gU	(Landroid/content/Context;)Z
    //   1213: ifeq +203 -> 1416
    //   1216: invokestatic 289	com/tencent/smtt/sdk/t:coF	()Ljava/lang/String;
    //   1219: ifnonnull +31 -> 1250
    //   1222: aload_0
    //   1223: invokevirtual 318	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   1226: invokestatic 324	com/tencent/smtt/sdk/r:gR	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/r;
    //   1229: sipush 227
    //   1232: ldc_w 326
    //   1235: invokevirtual 330	com/tencent/smtt/sdk/r:aT	(ILjava/lang/String;)V
    //   1238: iconst_0
    //   1239: ireturn
    //   1240: aload 8
    //   1242: invokevirtual 299	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1245: astore 8
    //   1247: goto -121 -> 1126
    //   1250: getstatic 255	com/tencent/smtt/sdk/QbSdk:xTF	Ljava/lang/Class;
    //   1253: iconst_3
    //   1254: anewarray 170	java/lang/Class
    //   1257: dup
    //   1258: iconst_0
    //   1259: ldc_w 314
    //   1262: aastore
    //   1263: dup
    //   1264: iconst_1
    //   1265: ldc_w 314
    //   1268: aastore
    //   1269: dup
    //   1270: iconst_2
    //   1271: ldc -17
    //   1273: aastore
    //   1274: invokevirtual 334	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   1277: iconst_3
    //   1278: anewarray 4	java/lang/Object
    //   1281: dup
    //   1282: iconst_0
    //   1283: aload_0
    //   1284: aastore
    //   1285: dup
    //   1286: iconst_1
    //   1287: aconst_null
    //   1288: aastore
    //   1289: dup
    //   1290: iconst_2
    //   1291: invokestatic 289	com/tencent/smtt/sdk/t:coF	()Ljava/lang/String;
    //   1294: aastore
    //   1295: invokevirtual 340	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   1298: putstatic 166	com/tencent/smtt/sdk/QbSdk:xTG	Ljava/lang/Object;
    //   1301: getstatic 166	com/tencent/smtt/sdk/QbSdk:xTG	Ljava/lang/Object;
    //   1304: astore 8
    //   1306: getstatic 697	com/tencent/smtt/utils/c:aGO	Ljava/lang/String;
    //   1309: astore 9
    //   1311: getstatic 700	com/tencent/smtt/utils/c:xYb	Ljava/lang/String;
    //   1314: astore 10
    //   1316: getstatic 703	com/tencent/smtt/utils/c:xYc	Ljava/lang/String;
    //   1319: astore 11
    //   1321: getstatic 706	com/tencent/smtt/utils/c:aKJ	Ljava/lang/String;
    //   1324: astore 12
    //   1326: aload 8
    //   1328: ldc_w 708
    //   1331: iconst_4
    //   1332: anewarray 170	java/lang/Class
    //   1335: dup
    //   1336: iconst_0
    //   1337: ldc -17
    //   1339: aastore
    //   1340: dup
    //   1341: iconst_1
    //   1342: ldc -17
    //   1344: aastore
    //   1345: dup
    //   1346: iconst_2
    //   1347: ldc -17
    //   1349: aastore
    //   1350: dup
    //   1351: iconst_3
    //   1352: ldc -17
    //   1354: aastore
    //   1355: iconst_4
    //   1356: anewarray 4	java/lang/Object
    //   1359: dup
    //   1360: iconst_0
    //   1361: aload 9
    //   1363: aastore
    //   1364: dup
    //   1365: iconst_1
    //   1366: aload 10
    //   1368: aastore
    //   1369: dup
    //   1370: iconst_2
    //   1371: aload 11
    //   1373: aastore
    //   1374: dup
    //   1375: iconst_3
    //   1376: aload 12
    //   1378: aastore
    //   1379: invokestatic 185	com/tencent/smtt/utils/o:a	(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1382: pop
    //   1383: getstatic 166	com/tencent/smtt/sdk/QbSdk:xTG	Ljava/lang/Object;
    //   1386: ldc_w 710
    //   1389: iconst_1
    //   1390: anewarray 170	java/lang/Class
    //   1393: dup
    //   1394: iconst_0
    //   1395: getstatic 175	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   1398: aastore
    //   1399: iconst_1
    //   1400: anewarray 4	java/lang/Object
    //   1403: dup
    //   1404: iconst_0
    //   1405: iconst_1
    //   1406: invokestatic 179	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1409: aastore
    //   1410: invokestatic 185	com/tencent/smtt/utils/o:a	(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1413: pop
    //   1414: iconst_1
    //   1415: ireturn
    //   1416: aload 8
    //   1418: iconst_2
    //   1419: anewarray 4	java/lang/Object
    //   1422: dup
    //   1423: iconst_0
    //   1424: aload_0
    //   1425: aastore
    //   1426: dup
    //   1427: iconst_1
    //   1428: aload_0
    //   1429: aastore
    //   1430: invokevirtual 340	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   1433: putstatic 166	com/tencent/smtt/sdk/QbSdk:xTG	Ljava/lang/Object;
    //   1436: goto -135 -> 1301
    //   1439: astore 8
    //   1441: ldc -46
    //   1443: new 195	java/lang/StringBuilder
    //   1446: dup
    //   1447: ldc_w 969
    //   1450: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1453: aload 8
    //   1455: invokestatic 350	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1458: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1461: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1464: invokestatic 218	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1467: invokestatic 224	com/tencent/smtt/sdk/i:cnZ	()Lcom/tencent/smtt/sdk/i;
    //   1470: aload_0
    //   1471: sipush 306
    //   1474: aload 8
    //   1476: invokevirtual 230	com/tencent/smtt/sdk/i:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   1479: iconst_0
    //   1480: ireturn
    //   1481: astore 9
    //   1483: iconst_m1
    //   1484: istore 4
    //   1486: iconst_m1
    //   1487: istore_2
    //   1488: goto -993 -> 495
    //   1491: astore 9
    //   1493: iconst_m1
    //   1494: istore_3
    //   1495: iload_2
    //   1496: istore 4
    //   1498: iload_3
    //   1499: istore_2
    //   1500: goto -1005 -> 495
    //   1503: astore 9
    //   1505: iload_2
    //   1506: istore 4
    //   1508: iload_3
    //   1509: istore_2
    //   1510: goto -1015 -> 495
    //   1513: iconst_m1
    //   1514: istore_2
    //   1515: goto -1279 -> 236
    //   1518: iconst_0
    //   1519: istore_2
    //   1520: goto -669 -> 851
    //   1523: iconst_0
    //   1524: ireturn
    //   1525: astore_0
    //   1526: goto -3 -> 1523
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1529	0	paramContext	Context
    //   0	1529	1	paramBoolean	boolean
    //   169	1351	2	i	int
    //   243	1266	3	j	int
    //   158	1349	4	k	int
    //   298	241	5	m	int
    //   288	242	6	n	int
    //   1	586	7	i1	int
    //   145	299	8	localObject1	Object
    //   454	15	8	localThrowable1	Throwable
    //   488	149	8	localObject2	Object
    //   685	15	8	localThrowable2	Throwable
    //   1124	293	8	localObject3	Object
    //   1439	36	8	localThrowable3	Throwable
    //   295	103	9	localObject4	Object
    //   485	23	9	localThrowable4	Throwable
    //   526	836	9	localObject5	Object
    //   1481	1	9	localThrowable5	Throwable
    //   1491	1	9	localThrowable6	Throwable
    //   1503	1	9	localThrowable7	Throwable
    //   1314	53	10	str1	String
    //   1319	53	11	str2	String
    //   1324	53	12	str3	String
    // Exception table:
    //   from	to	target	type
    //   344	365	454	java/lang/Throwable
    //   370	392	454	java/lang/Throwable
    //   397	403	454	java/lang/Throwable
    //   403	431	454	java/lang/Throwable
    //   431	451	454	java/lang/Throwable
    //   544	576	454	java/lang/Throwable
    //   129	147	485	java/lang/Throwable
    //   220	230	485	java/lang/Throwable
    //   620	632	685	java/lang/Throwable
    //   636	660	685	java/lang/Throwable
    //   175	185	1439	java/lang/Throwable
    //   190	218	1439	java/lang/Throwable
    //   716	738	1439	java/lang/Throwable
    //   740	849	1439	java/lang/Throwable
    //   851	855	1439	java/lang/Throwable
    //   855	861	1439	java/lang/Throwable
    //   863	890	1439	java/lang/Throwable
    //   892	918	1439	java/lang/Throwable
    //   1115	1126	1439	java/lang/Throwable
    //   1126	1238	1439	java/lang/Throwable
    //   1240	1247	1439	java/lang/Throwable
    //   1250	1301	1439	java/lang/Throwable
    //   1301	1414	1439	java/lang/Throwable
    //   1416	1436	1439	java/lang/Throwable
    //   147	160	1481	java/lang/Throwable
    //   236	244	1491	java/lang/Throwable
    //   254	277	1503	java/lang/Throwable
    //   277	290	1503	java/lang/Throwable
    //   305	314	1503	java/lang/Throwable
    //   320	338	1503	java/lang/Throwable
    //   922	959	1525	java/lang/Throwable
    //   963	997	1525	java/lang/Throwable
    //   1000	1034	1525	java/lang/Throwable
    //   1041	1075	1525	java/lang/Throwable
    //   1078	1112	1525	java/lang/Throwable
  }
  
  public static void preInit(Context paramContext)
  {
    try
    {
      preInit(paramContext, null);
      return;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  public static void preInit(final Context paramContext, final a parama)
  {
    try
    {
      TbsLog.initIfNeed(paramContext);
      xTX = xTH;
      if (!xTK)
      {
        paramContext = new Thread()
        {
          public final void handleMessage(Message paramAnonymousMessage)
          {
            switch (paramAnonymousMessage.what)
            {
            }
            do
            {
              return;
              if (parama != null) {
                parama.jV(false);
              }
              TbsLog.writeLogToDisk();
              return;
              paramAnonymousMessage = ab.coW().coY();
              if (paramAnonymousMessage != null) {
                paramAnonymousMessage.hh(paramContext);
              }
              if (parama != null) {
                parama.jV(true);
              }
              TbsLog.writeLogToDisk();
              return;
            } while (parama == null);
            parama.oR();
          }
        }
        {
          public final void run()
          {
            if (p.cov().a(true, this.val$context) == 0) {
              p.cov().v(this.val$context, true);
            }
            d.mW(true).a(this.val$context, null);
            ab localab = ab.coW();
            localab.b(this.val$context, null);
            boolean bool = localab.coX();
            this.xUg.sendEmptyMessage(3);
            if (!bool)
            {
              this.xUg.sendEmptyMessage(2);
              return;
            }
            this.xUg.sendEmptyMessage(1);
          }
        };
        paramContext.setName("tbs_preinit");
        paramContext.setPriority(10);
        paramContext.start();
        xTK = true;
      }
      return;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  static boolean q(Context paramContext, boolean paramBoolean)
  {
    int k = 1;
    paramBoolean = false;
    boolean bool2 = false;
    boolean bool1 = false;
    if (t.gU(paramContext))
    {
      t.coO();
      i.cnZ().ak(paramContext, 302);
    }
    for (;;)
    {
      return bool1;
      if (!p(paramContext, false))
      {
        TbsLog.e("QbSdk", "QbSdk.init failure!");
        return false;
      }
      Object localObject2 = o.a(xTG, "canLoadX5Core", new Class[] { Integer.TYPE }, new Object[] { Integer.valueOf(43601) });
      int i;
      label387:
      label619:
      Class localClass2;
      Object localObject1;
      if (localObject2 != null)
      {
        if (((localObject2 instanceof String)) && (((String)localObject2).equalsIgnoreCase("AuthenticationFail"))) {
          continue;
        }
        if (!(localObject2 instanceof Bundle))
        {
          i.cnZ().a(paramContext, 330, new Throwable(String.valueOf(localObject2)));
          TbsLog.e("loaderror", "ret not instance of bundle");
          return false;
        }
        Bundle localBundle = (Bundle)localObject2;
        if (localBundle.isEmpty())
        {
          i.cnZ().a(paramContext, 331, new Throwable(String.valueOf(localObject2)));
          TbsLog.e("loaderror", "empty bundle");
          return false;
        }
        try
        {
          i = localBundle.getInt("result_code", -1);
          if (i == 0)
          {
            paramBoolean = true;
            if (!t.gU(paramContext)) {
              break label387;
            }
            d.Fc(t.coK());
            localObject2 = String.valueOf(t.coK());
            xTE = (String)localObject2;
            if (((String)localObject2).length() == 5) {
              xTE = "0" + xTE;
            }
            if (xTE.length() != 6) {
              xTE = "";
            }
          }
        }
        catch (Exception localException2)
        {
          for (;;)
          {
            try
            {
              xTL = localBundle.getStringArray("tbs_jarfiles");
              if ((xTL instanceof String[])) {
                break label619;
              }
              i.cnZ().a(paramContext, 307, new Throwable("sJarFiles not instanceof String[]: " + xTL));
              return false;
            }
            catch (Throwable localThrowable)
            {
              i.cnZ().a(paramContext, 329, localThrowable);
              return false;
            }
            localException2 = localException2;
            TbsLog.e("QbSdk", "bundle.getInt(KEY_RESULT_CODE) error : " + localException2.toString());
            i = -1;
            continue;
            paramBoolean = false;
            continue;
            if (Build.VERSION.SDK_INT >= 12) {
              xTE = localBundle.getString("tbs_core_version", "0");
            }
            try
            {
              xTD = Integer.parseInt(xTE);
              d.Fc(xTD);
              if (xTD == 0)
              {
                i.cnZ().a(paramContext, 307, new Throwable("sTbsVersion is 0"));
                return false;
                String str = localBundle.getString("tbs_core_version");
                xTE = str;
                if (str != null) {
                  continue;
                }
                xTE = "0";
              }
            }
            catch (NumberFormatException localNumberFormatException)
            {
              xTD = 0;
              continue;
              int j;
              if (xTD > 0)
              {
                j = k;
                if (xTD <= 25442) {}
              }
              else
              {
                if (xTD != 25472) {
                  continue;
                }
                j = k;
              }
              if (j != 0)
              {
                TbsLog.e("TbsDownload", "is_obsolete --> delete old core:" + xTD);
                p.cov();
                f.O(p.gK(paramContext));
                i.cnZ().a(paramContext, 307, new Throwable("is_obsolete --> delete old core:" + xTD));
                return false;
                j = 0;
              }
            }
          }
        }
        xTO = localThrowable.getString("tbs_librarypath");
        localClass2 = null;
        localObject1 = localClass2;
        if (i == 0) {}
      }
      try
      {
        localObject1 = o.a(xTG, "getErrorCodeForLogReport", new Class[0], new Object[0]);
        switch (i)
        {
        default: 
          i.cnZ().a(paramContext, 415, new Throwable("detail: " + localObject1 + "errcode" + i));
        }
        for (;;)
        {
          bool1 = paramBoolean;
          if (paramBoolean) {
            break;
          }
          TbsLog.e("loaderror", "319");
          return paramBoolean;
          if ((localObject1 instanceof Integer))
          {
            i.cnZ().a(paramContext, ((Integer)localObject1).intValue(), new Throwable("detail: " + localObject1));
          }
          else
          {
            i.cnZ().a(paramContext, 307, new Throwable("detail: " + localObject1));
            continue;
            if ((localObject1 instanceof Integer))
            {
              i.cnZ().a(paramContext, ((Integer)localObject1).intValue(), new Throwable("detail: " + localObject1));
            }
            else
            {
              i.cnZ().a(paramContext, 404, new Throwable("detail: " + localObject1));
              continue;
              continue;
              localObject1 = xTG;
              localClass2 = Integer.TYPE;
              i = a.cnM();
              localObject1 = o.a(localObject1, "canLoadX5", new Class[] { localClass2 }, new Object[] { Integer.valueOf(i) });
              if (localObject1 != null)
              {
                if (((localObject1 instanceof String)) && (((String)localObject1).equalsIgnoreCase("AuthenticationFail"))) {
                  break;
                }
                if (!(localObject1 instanceof Boolean)) {
                  continue;
                }
                xTD = d.cnQ();
                boolean bool3 = ai(paramContext, d.cnQ());
                paramBoolean = bool2;
                if (((Boolean)localObject1).booleanValue())
                {
                  paramBoolean = bool2;
                  if (!bool3) {
                    paramBoolean = true;
                  }
                }
                bool1 = paramBoolean;
                if (paramBoolean) {
                  break;
                }
                TbsLog.e("loaderror", "318");
                TbsLog.w("loaderror", "isX5Disable:" + bool3);
                TbsLog.w("loaderror", "(Boolean) ret:" + (Boolean)localObject1);
                return paramBoolean;
              }
              i.cnZ().ak(paramContext, 308);
            }
          }
        }
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          Class localClass1 = localClass2;
        }
      }
    }
  }
  
  public static void reset(Context paramContext)
  {
    reset(paramContext, false);
  }
  
  public static void reset(Context paramContext, boolean paramBoolean)
  {
    int i = 1;
    TbsLog.e("QbSdk", "QbSdk reset!", true);
    for (;;)
    {
      try
      {
        l.stopDownload();
        if ((paramBoolean) && (!t.gU(paramContext)))
        {
          p.cov();
          int j = p.gB(paramContext);
          int k = p.cov().gC(paramContext);
          if ((j > 43300) && (j != k))
          {
            l.gq(paramContext);
            f.e(paramContext.getDir("tbs", 0), "core_share_decouple");
            TbsLog.i("QbSdk", "delete downloaded apk success", true);
            p.xVL.set(Integer.valueOf(0));
            File localFile = new File(paramContext.getFilesDir(), "bugly_switch.txt");
            if (localFile.exists()) {
              localFile.delete();
            }
            if (i != 0)
            {
              p.cov();
              localFile = p.gJ(paramContext);
              p.cov();
              f.i(localFile, p.gN(paramContext));
              p.cov();
              p.w(paramContext, true);
              j.gk(paramContext).eX(p.gB(paramContext), 2);
            }
            return;
          }
        }
      }
      catch (Throwable paramContext)
      {
        TbsLog.e("QbSdk", "QbSdk reset exception:" + Log.getStackTraceString(paramContext));
        return;
      }
      i = 0;
    }
  }
  
  public static void resetDecoupleCore(Context paramContext)
  {
    TbsLog.e("QbSdk", "QbSdk resetDecoupleCore!", true);
    try
    {
      p.cov();
      f.O(p.gJ(paramContext));
      return;
    }
    catch (Throwable paramContext)
    {
      TbsLog.e("QbSdk", "QbSdk resetDecoupleCore exception:" + Log.getStackTraceString(paramContext));
    }
  }
  
  public static void setCurrentID(String paramString)
  {
    if (paramString == null) {}
    while (!paramString.startsWith("QQ:")) {
      return;
    }
    paramString = paramString.substring(3);
    xTV = "0000000000000000".substring(paramString.length()) + paramString;
  }
  
  public static void setDeviceInfo(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    com.tencent.smtt.utils.c.aGO = paramString1;
    com.tencent.smtt.utils.c.xYb = paramString2;
    com.tencent.smtt.utils.c.xYc = paramString3;
    com.tencent.smtt.utils.c.aKJ = paramString4;
  }
  
  public static void setDownloadWithoutWifi(boolean paramBoolean)
  {
    xTZ = paramBoolean;
  }
  
  public static void setQQBuildNumber(String paramString)
  {
    xTW = paramString;
  }
  
  public static void setTBSInstallingStatus(boolean paramBoolean)
  {
    xUa = paramBoolean;
  }
  
  public static void setTbsListener(q paramq)
  {
    mTbsListener = paramq;
  }
  
  public static void setTbsLogClient(com.tencent.smtt.utils.t paramt)
  {
    TbsLog.setTbsLogClient(paramt);
  }
  
  public static int startMiniQBToLoadUrl(Context paramContext, String paramString, HashMap<String, String> paramHashMap, ValueCallback<String> paramValueCallback)
  {
    i.cnZ().ak(paramContext, 501);
    if (paramContext == null) {
      return -100;
    }
    ab localab = ab.coW();
    localab.b(paramContext, null);
    if (localab.coX())
    {
      if ((paramContext != null) && (paramContext.getApplicationInfo().packageName.equals("com.nd.android.pandahome2")) && (getTbsVersion(paramContext) < 25487)) {
        return -101;
      }
      int i = localab.coY().a(paramContext, paramString, paramHashMap, null, paramValueCallback);
      if (i == 0)
      {
        i.cnZ().ak(paramContext, 503);
        return i;
      }
      r.gR(paramContext).aT(504, String.valueOf(i));
      return i;
    }
    i.cnZ().ak(paramContext, 502);
    return -102;
  }
  
  public static boolean startQBForDoc(Context paramContext, String paramString1, int paramInt1, int paramInt2, String paramString2, Bundle paramBundle)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("ChannelID", paramContext.getApplicationContext().getApplicationInfo().processName);
    localHashMap.put("PosID", Integer.toString(paramInt1));
    return com.tencent.smtt.sdk.a.c.a(paramContext, paramString1, paramInt2, paramString2, localHashMap, paramBundle);
  }
  
  public static boolean startQBForVideo(Context paramContext, String paramString, int paramInt)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("ChannelID", paramContext.getApplicationInfo().processName);
    localHashMap.put("PosID", Integer.toString(paramInt));
    return com.tencent.smtt.sdk.a.c.a(paramContext, paramString, localHashMap);
  }
  
  public static boolean startQBToLoadurl(Context paramContext, String paramString, int paramInt, WebView paramWebView)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("ChannelID", paramContext.getApplicationInfo().processName);
    localHashMap.put("PosID", Integer.toString(paramInt));
    WebView localWebView1 = paramWebView;
    if (paramWebView == null) {}
    try
    {
      Object localObject = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).packageName;
      if (localObject != "com.tencent.mm")
      {
        localWebView1 = paramWebView;
        if (localObject != "com.tencent.mobileqq") {}
      }
      else
      {
        localObject = ab.coW();
        localWebView1 = paramWebView;
        if (localObject != null)
        {
          localWebView1 = paramWebView;
          if (((ab)localObject).coX())
          {
            localObject = ((ab)localObject).coY().xWV.invokeStaticMethod("com.tencent.smtt.webkit.WebViewList", "getCurrentMainWebviewJustForQQandWechat", new Class[0], new Object[0]);
            localWebView1 = paramWebView;
            if (localObject != null)
            {
              localObject = (IX5WebViewBase)localObject;
              localWebView1 = paramWebView;
              if (localObject != null) {
                localWebView1 = (WebView)((IX5WebViewBase)localObject).getView().getParent();
              }
            }
          }
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        WebView localWebView2 = paramWebView;
      }
    }
    return com.tencent.smtt.sdk.a.c.a(paramContext, paramString, localHashMap, "QbSdk.startQBToLoadurl", localWebView1) == 0;
  }
  
  public static boolean startQbOrMiniQBToLoadUrl(Context paramContext, String paramString, HashMap<String, String> paramHashMap, x<String> paramx)
  {
    if (paramContext == null) {
      return false;
    }
    ab localab = ab.coW();
    localab.b(paramContext, null);
    if ((paramHashMap != null) && ("5".equals(paramHashMap.get("PosID"))) && (localab.coX())) {
      localab.coY().xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "getAdWebViewInfoFromX5Core", new Class[0], new Object[0]);
    }
    if (com.tencent.smtt.sdk.a.c.a(paramContext, paramString, paramHashMap, "QbSdk.startMiniQBToLoadUrl", null) != 0)
    {
      if (localab.coX())
      {
        if ((paramContext != null) && (paramContext.getApplicationInfo().packageName.equals("com.nd.android.pandahome2")) && (getTbsVersion(paramContext) < 25487)) {
          return false;
        }
        if (localab.coY().a(paramContext, paramString, paramHashMap, null, paramx) == 0) {
          return true;
        }
      }
    }
    else {
      return true;
    }
    return false;
  }
  
  public static void unForceSysWebView()
  {
    xTI = false;
    TbsLog.e("QbSdk", "sys WebView: unForceSysWebView called");
  }
  
  public static boolean useSoftWare()
  {
    if (xTG == null) {
      return false;
    }
    Object localObject2 = o.a(xTG, "useSoftWare", new Class[0], new Object[0]);
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = xTG;
      localObject2 = Integer.TYPE;
      int i = a.cnM();
      localObject1 = o.a(localObject1, "useSoftWare", new Class[] { localObject2 }, new Object[] { Integer.valueOf(i) });
    }
    if (localObject1 == null) {
      return false;
    }
    return ((Boolean)localObject1).booleanValue();
  }
  
  public static abstract interface a
  {
    public abstract void jV(boolean paramBoolean);
    
    public abstract void oR();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\QbSdk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */