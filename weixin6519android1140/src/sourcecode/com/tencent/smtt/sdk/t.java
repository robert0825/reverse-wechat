package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.smtt.utils.TbsLog;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public final class t
{
  private static Context aHu;
  private static String mAppVersion = null;
  private static boolean xWC;
  private static String xWD = null;
  public static boolean xWE = false;
  private static String xWF = null;
  private static int xWG = 0;
  private static String xWH = null;
  private static boolean xWI = false;
  private static boolean xWJ = false;
  private static boolean xWK = false;
  private static boolean xWL = false;
  
  private static void a(Context paramContext, TbsLinuxToolsJni paramTbsLinuxToolsJni, File paramFile)
  {
    if ((paramFile == null) || (!paramFile.exists()) || (!paramFile.isDirectory())) {
      return;
    }
    paramTbsLinuxToolsJni.fz(paramFile.getAbsolutePath(), "755");
    paramFile = paramFile.listFiles();
    int j = paramFile.length;
    int i = 0;
    label41:
    File localFile;
    if (i < j)
    {
      localFile = paramFile[i];
      if (!localFile.isFile()) {
        break label107;
      }
      if (localFile.getAbsolutePath().indexOf(".so") <= 0) {
        break label92;
      }
      paramTbsLinuxToolsJni.fz(localFile.getAbsolutePath(), "755");
    }
    for (;;)
    {
      i += 1;
      break label41;
      break;
      label92:
      paramTbsLinuxToolsJni.fz(localFile.getAbsolutePath(), "644");
      continue;
      label107:
      if (localFile.isDirectory()) {
        a(paramContext, paramTbsLinuxToolsJni, localFile);
      } else {
        TbsLog.e("TbsShareManager", "unknown file type.", true);
      }
    }
  }
  
  private static File bE(Context paramContext, String paramString)
  {
    p.cov();
    paramContext = p.gL(paramContext);
    if (paramContext == null) {
      return null;
    }
    paramContext = new File(paramContext, paramString);
    if (paramContext.exists()) {
      return paramContext;
    }
    try
    {
      paramContext.createNewFile();
      return paramContext;
    }
    catch (IOException paramContext) {}
    return null;
  }
  
  private static Context bF(Context paramContext, String paramString)
  {
    try
    {
      paramContext = paramContext.createPackageContext(paramString, 2);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      return null;
    }
    catch (Exception paramContext) {}
    return null;
  }
  
  /* Error */
  public static void c(Context paramContext, int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 8
    //   3: ldc 2
    //   5: monitorenter
    //   6: iload_1
    //   7: ifne +24 -> 31
    //   10: aload_0
    //   11: invokestatic 138	com/tencent/smtt/sdk/t:gV	(Landroid/content/Context;)Z
    //   14: pop
    //   15: getstatic 140	com/tencent/smtt/sdk/t:aHu	Landroid/content/Context;
    //   18: invokestatic 146	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   21: sipush 65135
    //   24: invokevirtual 150	com/tencent/smtt/sdk/k:Ff	(I)V
    //   27: ldc 2
    //   29: monitorexit
    //   30: return
    //   31: aload_0
    //   32: invokestatic 154	com/tencent/smtt/sdk/t:gX	(Landroid/content/Context;)I
    //   35: istore_3
    //   36: iload_3
    //   37: ifge +24 -> 61
    //   40: getstatic 140	com/tencent/smtt/sdk/t:aHu	Landroid/content/Context;
    //   43: invokestatic 146	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   46: sipush 65134
    //   49: invokevirtual 150	com/tencent/smtt/sdk/k:Ff	(I)V
    //   52: goto -25 -> 27
    //   55: astore_0
    //   56: ldc 2
    //   58: monitorexit
    //   59: aload_0
    //   60: athrow
    //   61: iload_1
    //   62: iload_3
    //   63: if_icmpne +242 -> 305
    //   66: aload_0
    //   67: ldc -100
    //   69: invokestatic 158	com/tencent/smtt/sdk/t:bE	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   72: astore 7
    //   74: aload 7
    //   76: ifnonnull +18 -> 94
    //   79: getstatic 140	com/tencent/smtt/sdk/t:aHu	Landroid/content/Context;
    //   82: invokestatic 146	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   85: sipush 65133
    //   88: invokevirtual 150	com/tencent/smtt/sdk/k:Ff	(I)V
    //   91: goto -64 -> 27
    //   94: new 160	java/io/BufferedInputStream
    //   97: dup
    //   98: new 162	java/io/FileInputStream
    //   101: dup
    //   102: aload 7
    //   104: invokespecial 165	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   107: invokespecial 168	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   110: astore 6
    //   112: new 170	java/util/Properties
    //   115: dup
    //   116: invokespecial 172	java/util/Properties:<init>	()V
    //   119: astore 9
    //   121: aload 9
    //   123: aload 6
    //   125: invokevirtual 175	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   128: aload 9
    //   130: ldc -79
    //   132: ldc -77
    //   134: invokevirtual 183	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   137: pop
    //   138: iload_2
    //   139: ifeq +62 -> 201
    //   142: invokestatic 107	com/tencent/smtt/sdk/p:cov	()Lcom/tencent/smtt/sdk/p;
    //   145: pop
    //   146: aload_0
    //   147: invokestatic 186	com/tencent/smtt/sdk/p:gK	(Landroid/content/Context;)Ljava/io/File;
    //   150: invokevirtual 60	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   153: astore 10
    //   155: aload_0
    //   156: invokevirtual 190	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   159: invokevirtual 193	android/content/Context:getPackageName	()Ljava/lang/String;
    //   162: astore 11
    //   164: aload_0
    //   165: invokestatic 198	com/tencent/smtt/utils/c:getAppVersionCode	(Landroid/content/Context;)I
    //   168: istore_1
    //   169: aload 9
    //   171: ldc -56
    //   173: aload 11
    //   175: invokevirtual 183	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   178: pop
    //   179: aload 9
    //   181: ldc -54
    //   183: aload 10
    //   185: invokevirtual 183	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   188: pop
    //   189: aload 9
    //   191: ldc -52
    //   193: iload_1
    //   194: invokestatic 208	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   197: invokevirtual 183	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   200: pop
    //   201: new 210	java/io/BufferedOutputStream
    //   204: dup
    //   205: new 212	java/io/FileOutputStream
    //   208: dup
    //   209: aload 7
    //   211: invokespecial 213	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   214: invokespecial 216	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   217: astore 7
    //   219: aload 9
    //   221: aload 7
    //   223: aconst_null
    //   224: invokevirtual 220	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   227: aload 6
    //   229: invokevirtual 223	java/io/BufferedInputStream:close	()V
    //   232: aload 7
    //   234: invokevirtual 224	java/io/BufferedOutputStream:close	()V
    //   237: goto -158 -> 79
    //   240: astore_0
    //   241: goto -162 -> 79
    //   244: astore_0
    //   245: aconst_null
    //   246: astore 6
    //   248: aconst_null
    //   249: astore 7
    //   251: aload 6
    //   253: ifnull +8 -> 261
    //   256: aload 6
    //   258: invokevirtual 223	java/io/BufferedInputStream:close	()V
    //   261: aload 7
    //   263: ifnull +8 -> 271
    //   266: aload 7
    //   268: invokevirtual 224	java/io/BufferedOutputStream:close	()V
    //   271: aload_0
    //   272: athrow
    //   273: astore_0
    //   274: aconst_null
    //   275: astore_0
    //   276: aload 8
    //   278: astore 6
    //   280: aload_0
    //   281: ifnull +7 -> 288
    //   284: aload_0
    //   285: invokevirtual 223	java/io/BufferedInputStream:close	()V
    //   288: aload 6
    //   290: ifnull -211 -> 79
    //   293: aload 6
    //   295: invokevirtual 224	java/io/BufferedOutputStream:close	()V
    //   298: goto -219 -> 79
    //   301: astore_0
    //   302: goto -223 -> 79
    //   305: iload_1
    //   306: iload_3
    //   307: if_icmpge +29 -> 336
    //   310: iload_1
    //   311: ldc -31
    //   313: if_icmpge +23 -> 336
    //   316: aload_0
    //   317: invokestatic 138	com/tencent/smtt/sdk/t:gV	(Landroid/content/Context;)Z
    //   320: pop
    //   321: getstatic 140	com/tencent/smtt/sdk/t:aHu	Landroid/content/Context;
    //   324: invokestatic 146	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   327: sipush 65132
    //   330: invokevirtual 150	com/tencent/smtt/sdk/k:Ff	(I)V
    //   333: goto -306 -> 27
    //   336: invokestatic 229	com/tencent/smtt/sdk/t:coG	()[Ljava/lang/String;
    //   339: astore 6
    //   341: iload_2
    //   342: ifeq +823 -> 1165
    //   345: iconst_1
    //   346: anewarray 79	java/lang/String
    //   349: dup
    //   350: iconst_0
    //   351: aload_0
    //   352: invokevirtual 190	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   355: invokevirtual 193	android/content/Context:getPackageName	()Ljava/lang/String;
    //   358: aastore
    //   359: astore 6
    //   361: getstatic 26	com/tencent/smtt/sdk/t:xWD	Ljava/lang/String;
    //   364: ifnull +324 -> 688
    //   367: invokestatic 107	com/tencent/smtt/sdk/p:cov	()Lcom/tencent/smtt/sdk/p;
    //   370: pop
    //   371: iload_1
    //   372: getstatic 26	com/tencent/smtt/sdk/t:xWD	Ljava/lang/String;
    //   375: invokestatic 232	com/tencent/smtt/sdk/p:Yh	(Ljava/lang/String;)I
    //   378: if_icmpne +94 -> 472
    //   381: aload_0
    //   382: iload_1
    //   383: invokestatic 237	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   386: ldc -17
    //   388: getstatic 26	com/tencent/smtt/sdk/t:xWD	Ljava/lang/String;
    //   391: iconst_1
    //   392: invokestatic 237	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   395: invokestatic 242	com/tencent/smtt/sdk/t:c	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   398: aload_0
    //   399: ldc -100
    //   401: invokestatic 158	com/tencent/smtt/sdk/t:bE	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   404: astore 6
    //   406: getstatic 38	com/tencent/smtt/sdk/t:xWJ	Z
    //   409: ifne -382 -> 27
    //   412: aload 6
    //   414: ifnull -387 -> 27
    //   417: new 64	com/tencent/smtt/sdk/TbsLinuxToolsJni
    //   420: dup
    //   421: getstatic 140	com/tencent/smtt/sdk/t:aHu	Landroid/content/Context;
    //   424: invokespecial 245	com/tencent/smtt/sdk/TbsLinuxToolsJni:<init>	(Landroid/content/Context;)V
    //   427: astore 7
    //   429: aload 7
    //   431: aload 6
    //   433: invokevirtual 60	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   436: ldc 85
    //   438: invokevirtual 68	com/tencent/smtt/sdk/TbsLinuxToolsJni:fz	(Ljava/lang/String;Ljava/lang/String;)I
    //   441: pop
    //   442: invokestatic 107	com/tencent/smtt/sdk/p:cov	()Lcom/tencent/smtt/sdk/p;
    //   445: pop
    //   446: aload 7
    //   448: aload_0
    //   449: invokestatic 111	com/tencent/smtt/sdk/p:gL	(Landroid/content/Context;)Ljava/io/File;
    //   452: invokevirtual 60	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   455: ldc 62
    //   457: invokevirtual 68	com/tencent/smtt/sdk/TbsLinuxToolsJni:fz	(Ljava/lang/String;Ljava/lang/String;)I
    //   460: pop
    //   461: iconst_1
    //   462: putstatic 38	com/tencent/smtt/sdk/t:xWJ	Z
    //   465: goto -438 -> 27
    //   468: astore_0
    //   469: goto -442 -> 27
    //   472: invokestatic 107	com/tencent/smtt/sdk/p:cov	()Lcom/tencent/smtt/sdk/p;
    //   475: pop
    //   476: iload_1
    //   477: getstatic 26	com/tencent/smtt/sdk/t:xWD	Ljava/lang/String;
    //   480: invokestatic 232	com/tencent/smtt/sdk/p:Yh	(Ljava/lang/String;)I
    //   483: if_icmple +205 -> 688
    //   486: aload 6
    //   488: arraylength
    //   489: istore 4
    //   491: iconst_0
    //   492: istore_3
    //   493: iload_3
    //   494: iload 4
    //   496: if_icmpge +192 -> 688
    //   499: aload 6
    //   501: iload_3
    //   502: aaload
    //   503: astore 7
    //   505: iload_1
    //   506: ifne +175 -> 681
    //   509: aload_0
    //   510: aload 7
    //   512: invokestatic 247	com/tencent/smtt/sdk/t:bF	(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Context;
    //   515: astore 8
    //   517: invokestatic 107	com/tencent/smtt/sdk/p:cov	()Lcom/tencent/smtt/sdk/p;
    //   520: pop
    //   521: aload 8
    //   523: invokestatic 186	com/tencent/smtt/sdk/p:gK	(Landroid/content/Context;)Ljava/io/File;
    //   526: invokevirtual 60	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   529: astore 7
    //   531: aload_0
    //   532: invokestatic 198	com/tencent/smtt/utils/c:getAppVersionCode	(Landroid/content/Context;)I
    //   535: pop
    //   536: invokestatic 107	com/tencent/smtt/sdk/p:cov	()Lcom/tencent/smtt/sdk/p;
    //   539: pop
    //   540: aload 8
    //   542: invokestatic 250	com/tencent/smtt/sdk/p:gx	(Landroid/content/Context;)Z
    //   545: ifeq +136 -> 681
    //   548: new 49	java/io/File
    //   551: dup
    //   552: getstatic 26	com/tencent/smtt/sdk/t:xWD	Ljava/lang/String;
    //   555: invokespecial 253	java/io/File:<init>	(Ljava/lang/String;)V
    //   558: astore 6
    //   560: new 49	java/io/File
    //   563: dup
    //   564: aload 7
    //   566: invokespecial 253	java/io/File:<init>	(Ljava/lang/String;)V
    //   569: astore 7
    //   571: new 6	com/tencent/smtt/sdk/t$1
    //   574: dup
    //   575: invokespecial 254	com/tencent/smtt/sdk/t$1:<init>	()V
    //   578: astore 8
    //   580: aload 7
    //   582: aload 6
    //   584: aload 8
    //   586: invokestatic 259	com/tencent/smtt/utils/f:a	(Ljava/io/File;Ljava/io/File;Ljava/io/FileFilter;)Z
    //   589: pop
    //   590: aload_0
    //   591: iload_1
    //   592: invokestatic 237	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   595: ldc -17
    //   597: getstatic 26	com/tencent/smtt/sdk/t:xWD	Ljava/lang/String;
    //   600: iconst_1
    //   601: invokestatic 237	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   604: invokestatic 242	com/tencent/smtt/sdk/t:c	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   607: aload_0
    //   608: ldc -100
    //   610: invokestatic 158	com/tencent/smtt/sdk/t:bE	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   613: astore 6
    //   615: getstatic 38	com/tencent/smtt/sdk/t:xWJ	Z
    //   618: ifne -591 -> 27
    //   621: aload 6
    //   623: ifnull -596 -> 27
    //   626: new 64	com/tencent/smtt/sdk/TbsLinuxToolsJni
    //   629: dup
    //   630: getstatic 140	com/tencent/smtt/sdk/t:aHu	Landroid/content/Context;
    //   633: invokespecial 245	com/tencent/smtt/sdk/TbsLinuxToolsJni:<init>	(Landroid/content/Context;)V
    //   636: astore 7
    //   638: aload 7
    //   640: aload 6
    //   642: invokevirtual 60	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   645: ldc 85
    //   647: invokevirtual 68	com/tencent/smtt/sdk/TbsLinuxToolsJni:fz	(Ljava/lang/String;Ljava/lang/String;)I
    //   650: pop
    //   651: invokestatic 107	com/tencent/smtt/sdk/p:cov	()Lcom/tencent/smtt/sdk/p;
    //   654: pop
    //   655: aload 7
    //   657: aload_0
    //   658: invokestatic 111	com/tencent/smtt/sdk/p:gL	(Landroid/content/Context;)Ljava/io/File;
    //   661: invokevirtual 60	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   664: ldc 62
    //   666: invokevirtual 68	com/tencent/smtt/sdk/TbsLinuxToolsJni:fz	(Ljava/lang/String;Ljava/lang/String;)I
    //   669: pop
    //   670: iconst_1
    //   671: putstatic 38	com/tencent/smtt/sdk/t:xWJ	Z
    //   674: goto -647 -> 27
    //   677: astore_0
    //   678: goto -651 -> 27
    //   681: iload_3
    //   682: iconst_1
    //   683: iadd
    //   684: istore_3
    //   685: goto -192 -> 493
    //   688: aload 6
    //   690: arraylength
    //   691: istore 4
    //   693: iconst_0
    //   694: istore_3
    //   695: iload_3
    //   696: iload 4
    //   698: if_icmpge -671 -> 27
    //   701: aload 6
    //   703: iload_3
    //   704: aaload
    //   705: astore 7
    //   707: iload_1
    //   708: ifne +194 -> 902
    //   711: aload_0
    //   712: aload 7
    //   714: invokestatic 247	com/tencent/smtt/sdk/t:bF	(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Context;
    //   717: astore 9
    //   719: invokestatic 107	com/tencent/smtt/sdk/p:cov	()Lcom/tencent/smtt/sdk/p;
    //   722: pop
    //   723: aload 9
    //   725: invokestatic 186	com/tencent/smtt/sdk/p:gK	(Landroid/content/Context;)Ljava/io/File;
    //   728: invokevirtual 60	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   731: astore 8
    //   733: aload_0
    //   734: invokestatic 198	com/tencent/smtt/utils/c:getAppVersionCode	(Landroid/content/Context;)I
    //   737: istore 5
    //   739: invokestatic 107	com/tencent/smtt/sdk/p:cov	()Lcom/tencent/smtt/sdk/p;
    //   742: pop
    //   743: aload 9
    //   745: invokestatic 250	com/tencent/smtt/sdk/p:gx	(Landroid/content/Context;)Z
    //   748: ifeq +349 -> 1097
    //   751: aload 7
    //   753: aload_0
    //   754: invokevirtual 190	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   757: invokevirtual 193	android/content/Context:getPackageName	()Ljava/lang/String;
    //   760: invokevirtual 263	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   763: ifne +48 -> 811
    //   766: ldc 89
    //   768: new 265	java/lang/StringBuilder
    //   771: dup
    //   772: ldc_w 267
    //   775: invokespecial 268	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   778: iload_1
    //   779: invokevirtual 272	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   782: invokevirtual 274	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   785: invokestatic 278	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   788: invokestatic 107	com/tencent/smtt/sdk/p:cov	()Lcom/tencent/smtt/sdk/p;
    //   791: pop
    //   792: aload_0
    //   793: invokestatic 186	com/tencent/smtt/sdk/p:gK	(Landroid/content/Context;)Ljava/io/File;
    //   796: astore 6
    //   798: aload 6
    //   800: invokestatic 281	com/tencent/smtt/utils/f:O	(Ljava/io/File;)V
    //   803: ldc 89
    //   805: ldc_w 283
    //   808: invokestatic 278	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   811: aload_0
    //   812: iload_1
    //   813: invokestatic 237	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   816: aload 7
    //   818: aload 8
    //   820: iload 5
    //   822: invokestatic 237	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   825: invokestatic 242	com/tencent/smtt/sdk/t:c	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   828: aload_0
    //   829: ldc -100
    //   831: invokestatic 158	com/tencent/smtt/sdk/t:bE	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   834: astore 6
    //   836: getstatic 38	com/tencent/smtt/sdk/t:xWJ	Z
    //   839: ifne -812 -> 27
    //   842: aload 6
    //   844: ifnull -817 -> 27
    //   847: new 64	com/tencent/smtt/sdk/TbsLinuxToolsJni
    //   850: dup
    //   851: getstatic 140	com/tencent/smtt/sdk/t:aHu	Landroid/content/Context;
    //   854: invokespecial 245	com/tencent/smtt/sdk/TbsLinuxToolsJni:<init>	(Landroid/content/Context;)V
    //   857: astore 7
    //   859: aload 7
    //   861: aload 6
    //   863: invokevirtual 60	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   866: ldc 85
    //   868: invokevirtual 68	com/tencent/smtt/sdk/TbsLinuxToolsJni:fz	(Ljava/lang/String;Ljava/lang/String;)I
    //   871: pop
    //   872: invokestatic 107	com/tencent/smtt/sdk/p:cov	()Lcom/tencent/smtt/sdk/p;
    //   875: pop
    //   876: aload 7
    //   878: aload_0
    //   879: invokestatic 111	com/tencent/smtt/sdk/p:gL	(Landroid/content/Context;)Ljava/io/File;
    //   882: invokevirtual 60	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   885: ldc 62
    //   887: invokevirtual 68	com/tencent/smtt/sdk/TbsLinuxToolsJni:fz	(Ljava/lang/String;Ljava/lang/String;)I
    //   890: pop
    //   891: iconst_1
    //   892: putstatic 38	com/tencent/smtt/sdk/t:xWJ	Z
    //   895: goto -868 -> 27
    //   898: astore_0
    //   899: goto -872 -> 27
    //   902: iload_1
    //   903: ifne +194 -> 1097
    //   906: aload_0
    //   907: aload 7
    //   909: invokestatic 247	com/tencent/smtt/sdk/t:bF	(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Context;
    //   912: astore 9
    //   914: invokestatic 107	com/tencent/smtt/sdk/p:cov	()Lcom/tencent/smtt/sdk/p;
    //   917: pop
    //   918: aload 9
    //   920: invokestatic 286	com/tencent/smtt/sdk/p:gJ	(Landroid/content/Context;)Ljava/io/File;
    //   923: invokevirtual 60	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   926: astore 8
    //   928: aload_0
    //   929: invokestatic 198	com/tencent/smtt/utils/c:getAppVersionCode	(Landroid/content/Context;)I
    //   932: istore 5
    //   934: invokestatic 107	com/tencent/smtt/sdk/p:cov	()Lcom/tencent/smtt/sdk/p;
    //   937: pop
    //   938: aload 9
    //   940: invokestatic 250	com/tencent/smtt/sdk/p:gx	(Landroid/content/Context;)Z
    //   943: ifeq +154 -> 1097
    //   946: aload 7
    //   948: aload_0
    //   949: invokevirtual 190	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   952: invokevirtual 193	android/content/Context:getPackageName	()Ljava/lang/String;
    //   955: invokevirtual 263	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   958: ifne +48 -> 1006
    //   961: ldc 89
    //   963: new 265	java/lang/StringBuilder
    //   966: dup
    //   967: ldc_w 267
    //   970: invokespecial 268	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   973: iload_1
    //   974: invokevirtual 272	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   977: invokevirtual 274	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   980: invokestatic 278	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   983: invokestatic 107	com/tencent/smtt/sdk/p:cov	()Lcom/tencent/smtt/sdk/p;
    //   986: pop
    //   987: aload_0
    //   988: invokestatic 186	com/tencent/smtt/sdk/p:gK	(Landroid/content/Context;)Ljava/io/File;
    //   991: astore 6
    //   993: aload 6
    //   995: invokestatic 281	com/tencent/smtt/utils/f:O	(Ljava/io/File;)V
    //   998: ldc 89
    //   1000: ldc_w 283
    //   1003: invokestatic 278	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1006: aload_0
    //   1007: iload_1
    //   1008: invokestatic 237	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   1011: aload 7
    //   1013: aload 8
    //   1015: iload 5
    //   1017: invokestatic 237	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   1020: invokestatic 242	com/tencent/smtt/sdk/t:c	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   1023: aload_0
    //   1024: ldc -100
    //   1026: invokestatic 158	com/tencent/smtt/sdk/t:bE	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   1029: astore 6
    //   1031: getstatic 38	com/tencent/smtt/sdk/t:xWJ	Z
    //   1034: ifne -1007 -> 27
    //   1037: aload 6
    //   1039: ifnull -1012 -> 27
    //   1042: new 64	com/tencent/smtt/sdk/TbsLinuxToolsJni
    //   1045: dup
    //   1046: getstatic 140	com/tencent/smtt/sdk/t:aHu	Landroid/content/Context;
    //   1049: invokespecial 245	com/tencent/smtt/sdk/TbsLinuxToolsJni:<init>	(Landroid/content/Context;)V
    //   1052: astore 7
    //   1054: aload 7
    //   1056: aload 6
    //   1058: invokevirtual 60	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1061: ldc 85
    //   1063: invokevirtual 68	com/tencent/smtt/sdk/TbsLinuxToolsJni:fz	(Ljava/lang/String;Ljava/lang/String;)I
    //   1066: pop
    //   1067: invokestatic 107	com/tencent/smtt/sdk/p:cov	()Lcom/tencent/smtt/sdk/p;
    //   1070: pop
    //   1071: aload 7
    //   1073: aload_0
    //   1074: invokestatic 111	com/tencent/smtt/sdk/p:gL	(Landroid/content/Context;)Ljava/io/File;
    //   1077: invokevirtual 60	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1080: ldc 62
    //   1082: invokevirtual 68	com/tencent/smtt/sdk/TbsLinuxToolsJni:fz	(Ljava/lang/String;Ljava/lang/String;)I
    //   1085: pop
    //   1086: iconst_1
    //   1087: putstatic 38	com/tencent/smtt/sdk/t:xWJ	Z
    //   1090: goto -1063 -> 27
    //   1093: astore_0
    //   1094: goto -1067 -> 27
    //   1097: iload_3
    //   1098: iconst_1
    //   1099: iadd
    //   1100: istore_3
    //   1101: goto -406 -> 695
    //   1104: astore_0
    //   1105: goto -873 -> 232
    //   1108: astore_0
    //   1109: goto -821 -> 288
    //   1112: astore 6
    //   1114: goto -853 -> 261
    //   1117: astore 6
    //   1119: goto -848 -> 271
    //   1122: astore 6
    //   1124: goto -118 -> 1006
    //   1127: astore 6
    //   1129: goto -318 -> 811
    //   1132: astore_0
    //   1133: aconst_null
    //   1134: astore 7
    //   1136: goto -885 -> 251
    //   1139: astore_0
    //   1140: goto -889 -> 251
    //   1143: astore_0
    //   1144: aload 6
    //   1146: astore_0
    //   1147: aload 8
    //   1149: astore 6
    //   1151: goto -871 -> 280
    //   1154: astore_0
    //   1155: aload 6
    //   1157: astore_0
    //   1158: aload 7
    //   1160: astore 6
    //   1162: goto -882 -> 280
    //   1165: goto -804 -> 361
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1168	0	paramContext	Context
    //   0	1168	1	paramInt	int
    //   0	1168	2	paramBoolean	boolean
    //   35	1066	3	i	int
    //   489	210	4	j	int
    //   737	279	5	k	int
    //   110	947	6	localObject1	Object
    //   1112	1	6	localException1	Exception
    //   1117	1	6	localException2	Exception
    //   1122	1	6	localThrowable1	Throwable
    //   1127	18	6	localThrowable2	Throwable
    //   1149	12	6	localObject2	Object
    //   72	1087	7	localObject3	Object
    //   1	1147	8	localObject4	Object
    //   119	820	9	localObject5	Object
    //   153	31	10	str1	String
    //   162	12	11	str2	String
    // Exception table:
    //   from	to	target	type
    //   10	27	55	finally
    //   31	36	55	finally
    //   40	52	55	finally
    //   79	91	55	finally
    //   227	232	55	finally
    //   232	237	55	finally
    //   256	261	55	finally
    //   266	271	55	finally
    //   271	273	55	finally
    //   284	288	55	finally
    //   293	298	55	finally
    //   316	333	55	finally
    //   336	341	55	finally
    //   345	361	55	finally
    //   361	398	55	finally
    //   398	412	55	finally
    //   417	465	55	finally
    //   472	491	55	finally
    //   509	580	55	finally
    //   580	621	55	finally
    //   626	674	55	finally
    //   688	693	55	finally
    //   711	798	55	finally
    //   798	811	55	finally
    //   811	828	55	finally
    //   828	842	55	finally
    //   847	895	55	finally
    //   906	993	55	finally
    //   993	1006	55	finally
    //   1006	1023	55	finally
    //   1023	1037	55	finally
    //   1042	1090	55	finally
    //   232	237	240	java/lang/Exception
    //   66	74	244	finally
    //   94	112	244	finally
    //   66	74	273	java/lang/Throwable
    //   94	112	273	java/lang/Throwable
    //   293	298	301	java/lang/Exception
    //   398	412	468	java/lang/Throwable
    //   417	465	468	java/lang/Throwable
    //   580	621	677	java/lang/Throwable
    //   626	674	677	java/lang/Throwable
    //   828	842	898	java/lang/Throwable
    //   847	895	898	java/lang/Throwable
    //   1023	1037	1093	java/lang/Throwable
    //   1042	1090	1093	java/lang/Throwable
    //   227	232	1104	java/lang/Exception
    //   284	288	1108	java/lang/Exception
    //   256	261	1112	java/lang/Exception
    //   266	271	1117	java/lang/Exception
    //   993	1006	1122	java/lang/Throwable
    //   798	811	1127	java/lang/Throwable
    //   112	138	1132	finally
    //   142	201	1132	finally
    //   201	219	1132	finally
    //   219	227	1139	finally
    //   112	138	1143	java/lang/Throwable
    //   142	201	1143	java/lang/Throwable
    //   201	219	1143	java/lang/Throwable
    //   219	227	1154	java/lang/Throwable
  }
  
  /* Error */
  private static void c(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: aconst_null
    //   4: astore 7
    //   6: aload_0
    //   7: ldc -100
    //   9: invokestatic 158	com/tencent/smtt/sdk/t:bE	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   12: astore 9
    //   14: aload 9
    //   16: ifnonnull +16 -> 32
    //   19: getstatic 140	com/tencent/smtt/sdk/t:aHu	Landroid/content/Context;
    //   22: invokestatic 146	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   25: sipush 65131
    //   28: invokevirtual 150	com/tencent/smtt/sdk/k:Ff	(I)V
    //   31: return
    //   32: new 160	java/io/BufferedInputStream
    //   35: dup
    //   36: new 162	java/io/FileInputStream
    //   39: dup
    //   40: aload 9
    //   42: invokespecial 165	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   45: invokespecial 168	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   48: astore_0
    //   49: new 170	java/util/Properties
    //   52: dup
    //   53: invokespecial 172	java/util/Properties:<init>	()V
    //   56: astore 8
    //   58: aload 8
    //   60: aload_0
    //   61: invokevirtual 175	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   64: aload_1
    //   65: invokestatic 289	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   68: istore 6
    //   70: iload 6
    //   72: istore 5
    //   74: iload 5
    //   76: ifeq +102 -> 178
    //   79: aload 8
    //   81: ldc_w 291
    //   84: aload_1
    //   85: invokevirtual 183	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   88: pop
    //   89: aload 8
    //   91: ldc -79
    //   93: ldc -77
    //   95: invokevirtual 183	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   98: pop
    //   99: aload 8
    //   101: ldc -56
    //   103: aload_2
    //   104: invokevirtual 183	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   107: pop
    //   108: aload 8
    //   110: ldc -54
    //   112: aload_3
    //   113: invokevirtual 183	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   116: pop
    //   117: aload 8
    //   119: ldc -52
    //   121: aload 4
    //   123: invokevirtual 183	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   126: pop
    //   127: new 210	java/io/BufferedOutputStream
    //   130: dup
    //   131: new 212	java/io/FileOutputStream
    //   134: dup
    //   135: aload 9
    //   137: invokespecial 213	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   140: invokespecial 216	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   143: astore_2
    //   144: aload 8
    //   146: aload_2
    //   147: aconst_null
    //   148: invokevirtual 220	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   151: iconst_0
    //   152: putstatic 44	com/tencent/smtt/sdk/t:xWL	Z
    //   155: getstatic 140	com/tencent/smtt/sdk/t:aHu	Landroid/content/Context;
    //   158: invokestatic 146	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   161: sipush 65130
    //   164: invokevirtual 150	com/tencent/smtt/sdk/k:Ff	(I)V
    //   167: aload_0
    //   168: invokevirtual 223	java/io/BufferedInputStream:close	()V
    //   171: aload_2
    //   172: invokevirtual 224	java/io/BufferedOutputStream:close	()V
    //   175: return
    //   176: astore_0
    //   177: return
    //   178: aload 8
    //   180: ldc -79
    //   182: ldc_w 293
    //   185: invokevirtual 183	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   188: pop
    //   189: goto -62 -> 127
    //   192: astore_1
    //   193: aload 7
    //   195: astore_1
    //   196: aload_0
    //   197: ifnull +7 -> 204
    //   200: aload_0
    //   201: invokevirtual 223	java/io/BufferedInputStream:close	()V
    //   204: aload_1
    //   205: ifnull +79 -> 284
    //   208: aload_1
    //   209: invokevirtual 224	java/io/BufferedOutputStream:close	()V
    //   212: return
    //   213: astore_0
    //   214: return
    //   215: astore_1
    //   216: aconst_null
    //   217: astore_0
    //   218: aconst_null
    //   219: astore_2
    //   220: aload_0
    //   221: ifnull +7 -> 228
    //   224: aload_0
    //   225: invokevirtual 223	java/io/BufferedInputStream:close	()V
    //   228: aload_2
    //   229: ifnull +7 -> 236
    //   232: aload_2
    //   233: invokevirtual 224	java/io/BufferedOutputStream:close	()V
    //   236: aload_1
    //   237: athrow
    //   238: astore 10
    //   240: goto -166 -> 74
    //   243: astore_0
    //   244: goto -73 -> 171
    //   247: astore_0
    //   248: goto -44 -> 204
    //   251: astore_0
    //   252: goto -24 -> 228
    //   255: astore_0
    //   256: goto -20 -> 236
    //   259: astore_1
    //   260: aconst_null
    //   261: astore_2
    //   262: goto -42 -> 220
    //   265: astore_1
    //   266: goto -46 -> 220
    //   269: astore_0
    //   270: aconst_null
    //   271: astore_0
    //   272: aload 7
    //   274: astore_1
    //   275: goto -79 -> 196
    //   278: astore_1
    //   279: aload_2
    //   280: astore_1
    //   281: goto -85 -> 196
    //   284: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	285	0	paramContext	Context
    //   0	285	1	paramString1	String
    //   0	285	2	paramString2	String
    //   0	285	3	paramString3	String
    //   0	285	4	paramString4	String
    //   1	74	5	i	int
    //   68	3	6	j	int
    //   4	269	7	localObject	Object
    //   56	123	8	localProperties	java.util.Properties
    //   12	124	9	localFile	File
    //   238	1	10	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   171	175	176	java/lang/Exception
    //   49	64	192	java/lang/Throwable
    //   64	70	192	java/lang/Throwable
    //   79	127	192	java/lang/Throwable
    //   127	144	192	java/lang/Throwable
    //   178	189	192	java/lang/Throwable
    //   208	212	213	java/lang/Exception
    //   6	14	215	finally
    //   19	31	215	finally
    //   32	49	215	finally
    //   64	70	238	java/lang/Exception
    //   167	171	243	java/lang/Exception
    //   200	204	247	java/lang/Exception
    //   224	228	251	java/lang/Exception
    //   232	236	255	java/lang/Exception
    //   49	64	259	finally
    //   64	70	259	finally
    //   79	127	259	finally
    //   127	144	259	finally
    //   178	189	259	finally
    //   144	167	265	finally
    //   6	14	269	java/lang/Throwable
    //   19	31	269	java/lang/Throwable
    //   32	49	269	java/lang/Throwable
    //   144	167	278	java/lang/Throwable
  }
  
  public static String coF()
  {
    return xWD;
  }
  
  public static String[] coG()
  {
    return new String[] { "com.tencent.tbs", "com.tencent.mm", "com.tencent.mobileqq", "com.qzone" };
  }
  
  public static long coH()
  {
    String[] arrayOfString = coG();
    int i = 0;
    while (i < 4)
    {
      String str = arrayOfString[i];
      if ((!str.equalsIgnoreCase("com.tencent.mm")) && (!str.equalsIgnoreCase("com.tencent.mobileqq"))) {
        str.equalsIgnoreCase("com.qzone");
      }
      i += 1;
    }
    return 0L;
  }
  
  public static boolean coI()
  {
    return xWI;
  }
  
  static String coJ()
  {
    return xWF;
  }
  
  static int coK()
  {
    return xWG;
  }
  
  static int coL()
  {
    return xWG;
  }
  
  public static int coM()
  {
    return xWG;
  }
  
  public static boolean coN()
  {
    return xWK;
  }
  
  static boolean coO()
  {
    TbsLog.addLog(992, null, new Object[0]);
    return false;
  }
  
  static void gS(Context paramContext)
  {
    try
    {
      TbsLinuxToolsJni localTbsLinuxToolsJni = new TbsLinuxToolsJni(paramContext);
      p.cov();
      a(paramContext, localTbsLinuxToolsJni, p.gK(paramContext));
      p.cov();
      localTbsLinuxToolsJni.fz(p.gL(paramContext).getAbsolutePath(), "755");
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  static void gT(Context paramContext)
  {
    try
    {
      TbsLinuxToolsJni localTbsLinuxToolsJni = new TbsLinuxToolsJni(paramContext);
      p.cov();
      a(paramContext, localTbsLinuxToolsJni, p.gJ(paramContext));
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public static boolean gU(Context paramContext)
  {
    for (;;)
    {
      int i;
      try
      {
        if ((aHu != null) && (aHu.equals(paramContext.getApplicationContext()))) {
          return xWC;
        }
        paramContext = paramContext.getApplicationContext();
        aHu = paramContext;
        paramContext = paramContext.getPackageName();
        String[] arrayOfString = coG();
        i = 0;
        if (i < 4)
        {
          if (!paramContext.equals(arrayOfString[i])) {
            break label71;
          }
          xWC = false;
          return false;
        }
      }
      catch (Throwable paramContext)
      {
        xWC = true;
        return true;
      }
      label71:
      i += 1;
    }
  }
  
  private static boolean gV(Context paramContext)
  {
    if (paramContext == null) {
      return false;
    }
    c(paramContext, Integer.toString(0), "", "", Integer.toString(0));
    return true;
  }
  
  /* Error */
  static String gW(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc 2
    //   4: monitorenter
    //   5: aload_0
    //   6: ldc -100
    //   8: invokestatic 158	com/tencent/smtt/sdk/t:bE	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   11: astore_0
    //   12: aload_0
    //   13: ifnonnull +10 -> 23
    //   16: aload_3
    //   17: astore_0
    //   18: ldc 2
    //   20: monitorexit
    //   21: aload_0
    //   22: areturn
    //   23: new 160	java/io/BufferedInputStream
    //   26: dup
    //   27: new 162	java/io/FileInputStream
    //   30: dup
    //   31: aload_0
    //   32: invokespecial 165	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   35: invokespecial 168	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   38: astore_0
    //   39: new 170	java/util/Properties
    //   42: dup
    //   43: invokespecial 172	java/util/Properties:<init>	()V
    //   46: astore_2
    //   47: aload_2
    //   48: aload_0
    //   49: invokevirtual 175	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   52: aload_2
    //   53: ldc -56
    //   55: ldc_w 328
    //   58: invokevirtual 334	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   61: astore_2
    //   62: ldc_w 328
    //   65: aload_2
    //   66: invokevirtual 263	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   69: istore_1
    //   70: iload_1
    //   71: ifne +31 -> 102
    //   74: aload_0
    //   75: invokevirtual 223	java/io/BufferedInputStream:close	()V
    //   78: aload_2
    //   79: astore_0
    //   80: goto -62 -> 18
    //   83: astore_2
    //   84: aconst_null
    //   85: astore_0
    //   86: aload_0
    //   87: ifnull +7 -> 94
    //   90: aload_0
    //   91: invokevirtual 223	java/io/BufferedInputStream:close	()V
    //   94: aload_2
    //   95: athrow
    //   96: astore_0
    //   97: ldc 2
    //   99: monitorexit
    //   100: aload_0
    //   101: athrow
    //   102: aload_0
    //   103: invokevirtual 223	java/io/BufferedInputStream:close	()V
    //   106: aload_3
    //   107: astore_0
    //   108: goto -90 -> 18
    //   111: astore_0
    //   112: aload_3
    //   113: astore_0
    //   114: goto -96 -> 18
    //   117: astore_0
    //   118: aconst_null
    //   119: astore_2
    //   120: aload_3
    //   121: astore_0
    //   122: aload_2
    //   123: ifnull -105 -> 18
    //   126: aload_2
    //   127: invokevirtual 223	java/io/BufferedInputStream:close	()V
    //   130: aload_3
    //   131: astore_0
    //   132: goto -114 -> 18
    //   135: astore_0
    //   136: aload_3
    //   137: astore_0
    //   138: goto -120 -> 18
    //   141: astore_0
    //   142: goto -64 -> 78
    //   145: astore_0
    //   146: goto -52 -> 94
    //   149: astore_2
    //   150: goto -64 -> 86
    //   153: astore_2
    //   154: aload_0
    //   155: astore_2
    //   156: goto -36 -> 120
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	159	0	paramContext	Context
    //   69	2	1	bool	boolean
    //   46	33	2	localObject1	Object
    //   83	12	2	localObject2	Object
    //   119	8	2	localObject3	Object
    //   149	1	2	localObject4	Object
    //   153	1	2	localThrowable	Throwable
    //   155	1	2	localContext	Context
    //   1	136	3	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   5	12	83	finally
    //   23	39	83	finally
    //   74	78	96	finally
    //   90	94	96	finally
    //   94	96	96	finally
    //   102	106	96	finally
    //   126	130	96	finally
    //   102	106	111	java/lang/Exception
    //   5	12	117	java/lang/Throwable
    //   23	39	117	java/lang/Throwable
    //   126	130	135	java/lang/Exception
    //   74	78	141	java/lang/Exception
    //   90	94	145	java/lang/Exception
    //   39	70	149	finally
    //   39	70	153	java/lang/Throwable
  }
  
  /* Error */
  private static int gX(Context paramContext)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc 2
    //   4: monitorenter
    //   5: aload_0
    //   6: ldc -100
    //   8: invokestatic 158	com/tencent/smtt/sdk/t:bE	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   11: astore_0
    //   12: aload_0
    //   13: ifnonnull +8 -> 21
    //   16: ldc 2
    //   18: monitorexit
    //   19: iload_1
    //   20: ireturn
    //   21: new 160	java/io/BufferedInputStream
    //   24: dup
    //   25: new 162	java/io/FileInputStream
    //   28: dup
    //   29: aload_0
    //   30: invokespecial 165	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   33: invokespecial 168	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   36: astore_0
    //   37: new 170	java/util/Properties
    //   40: dup
    //   41: invokespecial 172	java/util/Properties:<init>	()V
    //   44: astore_2
    //   45: aload_2
    //   46: aload_0
    //   47: invokevirtual 175	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   50: aload_2
    //   51: ldc_w 291
    //   54: ldc_w 328
    //   57: invokevirtual 334	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   60: astore_2
    //   61: ldc_w 328
    //   64: aload_2
    //   65: invokevirtual 263	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   68: ifne +59 -> 127
    //   71: aload_2
    //   72: invokestatic 289	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   75: iconst_0
    //   76: invokestatic 340	java/lang/Math:max	(II)I
    //   79: istore_1
    //   80: aload_0
    //   81: invokevirtual 223	java/io/BufferedInputStream:close	()V
    //   84: goto -68 -> 16
    //   87: astore_0
    //   88: goto -72 -> 16
    //   91: astore_2
    //   92: aconst_null
    //   93: astore_0
    //   94: aload_0
    //   95: ifnull +7 -> 102
    //   98: aload_0
    //   99: invokevirtual 223	java/io/BufferedInputStream:close	()V
    //   102: aload_2
    //   103: athrow
    //   104: astore_0
    //   105: ldc 2
    //   107: monitorexit
    //   108: aload_0
    //   109: athrow
    //   110: astore_0
    //   111: aconst_null
    //   112: astore_0
    //   113: aload_0
    //   114: ifnull +7 -> 121
    //   117: aload_0
    //   118: invokevirtual 223	java/io/BufferedInputStream:close	()V
    //   121: bipush -2
    //   123: istore_1
    //   124: goto -108 -> 16
    //   127: aload_0
    //   128: invokevirtual 223	java/io/BufferedInputStream:close	()V
    //   131: goto -115 -> 16
    //   134: astore_0
    //   135: goto -119 -> 16
    //   138: astore_0
    //   139: goto -18 -> 121
    //   142: astore_0
    //   143: goto -41 -> 102
    //   146: astore_2
    //   147: goto -53 -> 94
    //   150: astore_2
    //   151: goto -38 -> 113
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	154	0	paramContext	Context
    //   1	123	1	i	int
    //   44	28	2	localObject1	Object
    //   91	12	2	localObject2	Object
    //   146	1	2	localObject3	Object
    //   150	1	2	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   80	84	87	java/lang/Exception
    //   5	12	91	finally
    //   21	37	91	finally
    //   80	84	104	finally
    //   98	102	104	finally
    //   102	104	104	finally
    //   117	121	104	finally
    //   127	131	104	finally
    //   5	12	110	java/lang/Throwable
    //   21	37	110	java/lang/Throwable
    //   127	131	134	java/lang/Exception
    //   117	121	138	java/lang/Exception
    //   98	102	142	java/lang/Exception
    //   37	80	146	finally
    //   37	80	150	java/lang/Throwable
  }
  
  /* Error */
  private static void gY(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 44	com/tencent/smtt/sdk/t:xWL	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +7 -> 15
    //   11: ldc 2
    //   13: monitorexit
    //   14: return
    //   15: aconst_null
    //   16: astore_2
    //   17: aload_0
    //   18: ldc -100
    //   20: invokestatic 158	com/tencent/smtt/sdk/t:bE	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   23: astore_0
    //   24: aload_0
    //   25: ifnull -14 -> 11
    //   28: new 160	java/io/BufferedInputStream
    //   31: dup
    //   32: new 162	java/io/FileInputStream
    //   35: dup
    //   36: aload_0
    //   37: invokespecial 165	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   40: invokespecial 168	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   43: astore_0
    //   44: new 170	java/util/Properties
    //   47: dup
    //   48: invokespecial 172	java/util/Properties:<init>	()V
    //   51: astore_2
    //   52: aload_2
    //   53: aload_0
    //   54: invokevirtual 175	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   57: aload_2
    //   58: ldc_w 291
    //   61: ldc_w 328
    //   64: invokevirtual 334	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   67: astore_3
    //   68: ldc_w 328
    //   71: aload_3
    //   72: invokevirtual 263	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   75: ifne +14 -> 89
    //   78: aload_3
    //   79: invokestatic 289	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   82: iconst_0
    //   83: invokestatic 340	java/lang/Math:max	(II)I
    //   86: putstatic 32	com/tencent/smtt/sdk/t:xWG	I
    //   89: aload_2
    //   90: ldc -56
    //   92: ldc_w 328
    //   95: invokevirtual 334	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   98: astore_3
    //   99: ldc_w 328
    //   102: aload_3
    //   103: invokevirtual 263	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   106: ifne +7 -> 113
    //   109: aload_3
    //   110: putstatic 34	com/tencent/smtt/sdk/t:xWH	Ljava/lang/String;
    //   113: getstatic 34	com/tencent/smtt/sdk/t:xWH	Ljava/lang/String;
    //   116: ifnull +28 -> 144
    //   119: getstatic 140	com/tencent/smtt/sdk/t:aHu	Landroid/content/Context;
    //   122: ifnull +22 -> 144
    //   125: getstatic 34	com/tencent/smtt/sdk/t:xWH	Ljava/lang/String;
    //   128: getstatic 140	com/tencent/smtt/sdk/t:aHu	Landroid/content/Context;
    //   131: invokevirtual 193	android/content/Context:getPackageName	()Ljava/lang/String;
    //   134: invokevirtual 263	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   137: ifeq +84 -> 221
    //   140: iconst_1
    //   141: putstatic 42	com/tencent/smtt/sdk/t:xWK	Z
    //   144: aload_2
    //   145: ldc -54
    //   147: ldc_w 328
    //   150: invokevirtual 334	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   153: astore_3
    //   154: ldc_w 328
    //   157: aload_3
    //   158: invokevirtual 263	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   161: ifne +7 -> 168
    //   164: aload_3
    //   165: putstatic 30	com/tencent/smtt/sdk/t:xWF	Ljava/lang/String;
    //   168: aload_2
    //   169: ldc -52
    //   171: ldc_w 328
    //   174: invokevirtual 334	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   177: astore_3
    //   178: ldc_w 328
    //   181: aload_3
    //   182: invokevirtual 263	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   185: ifne +7 -> 192
    //   188: aload_3
    //   189: putstatic 40	com/tencent/smtt/sdk/t:mAppVersion	Ljava/lang/String;
    //   192: aload_2
    //   193: ldc -79
    //   195: ldc -77
    //   197: invokevirtual 334	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   200: invokestatic 346	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
    //   203: putstatic 36	com/tencent/smtt/sdk/t:xWI	Z
    //   206: iconst_1
    //   207: putstatic 44	com/tencent/smtt/sdk/t:xWL	Z
    //   210: aload_0
    //   211: invokevirtual 223	java/io/BufferedInputStream:close	()V
    //   214: goto -203 -> 11
    //   217: astore_0
    //   218: goto -207 -> 11
    //   221: iconst_0
    //   222: putstatic 42	com/tencent/smtt/sdk/t:xWK	Z
    //   225: goto -81 -> 144
    //   228: astore_2
    //   229: aload_0
    //   230: ifnull -219 -> 11
    //   233: aload_0
    //   234: invokevirtual 223	java/io/BufferedInputStream:close	()V
    //   237: goto -226 -> 11
    //   240: astore_0
    //   241: goto -230 -> 11
    //   244: astore_0
    //   245: aload_2
    //   246: ifnull +7 -> 253
    //   249: aload_2
    //   250: invokevirtual 223	java/io/BufferedInputStream:close	()V
    //   253: aload_0
    //   254: athrow
    //   255: astore_0
    //   256: ldc 2
    //   258: monitorexit
    //   259: aload_0
    //   260: athrow
    //   261: astore_2
    //   262: goto -9 -> 253
    //   265: astore_3
    //   266: aload_0
    //   267: astore_2
    //   268: aload_3
    //   269: astore_0
    //   270: goto -25 -> 245
    //   273: astore_0
    //   274: aconst_null
    //   275: astore_0
    //   276: goto -47 -> 229
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	279	0	paramContext	Context
    //   6	2	1	bool	boolean
    //   16	177	2	localProperties	java.util.Properties
    //   228	22	2	localThrowable	Throwable
    //   261	1	2	localException	Exception
    //   267	1	2	localContext	Context
    //   67	122	3	str	String
    //   265	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   210	214	217	java/lang/Exception
    //   44	89	228	java/lang/Throwable
    //   89	113	228	java/lang/Throwable
    //   113	144	228	java/lang/Throwable
    //   144	168	228	java/lang/Throwable
    //   168	192	228	java/lang/Throwable
    //   192	210	228	java/lang/Throwable
    //   221	225	228	java/lang/Throwable
    //   233	237	240	java/lang/Exception
    //   17	24	244	finally
    //   28	44	244	finally
    //   3	7	255	finally
    //   210	214	255	finally
    //   233	237	255	finally
    //   249	253	255	finally
    //   253	255	255	finally
    //   249	253	261	java/lang/Exception
    //   44	89	265	finally
    //   89	113	265	finally
    //   113	144	265	finally
    //   144	168	265	finally
    //   168	192	265	finally
    //   192	210	265	finally
    //   221	225	265	finally
    //   17	24	273	java/lang/Throwable
    //   28	44	273	java/lang/Throwable
  }
  
  static String getTbsResourcesPath(Context paramContext)
  {
    try
    {
      gY(paramContext);
      if (xWF != null)
      {
        if (TextUtils.isEmpty(xWF)) {
          return null;
        }
        paramContext = new StringBuilder(xWF);
        paramContext.append(File.separator);
        paramContext.append("res.apk");
        return paramContext.toString();
      }
    }
    catch (Throwable paramContext)
    {
      new StringBuilder("getTbsResourcesPath exception: ").append(Log.getStackTraceString(paramContext));
    }
    return null;
  }
  
  public static void x(Context paramContext, boolean paramBoolean)
  {
    try
    {
      if (!gU(paramContext)) {
        return;
      }
      p.cov();
      File localFile = p.gL(paramContext);
      if ((localFile != null) && ((!paramBoolean) || (!new File(localFile, "core_info").exists())))
      {
        if (xWD != null)
        {
          p.cov();
          int i = p.Yh(xWD);
          if (i > 0)
          {
            xWF = xWD;
            xWH = "AppDefined";
            xWG = i;
            c(paramContext, Integer.toString(xWG), xWH, xWF, Integer.toString(1));
            return;
          }
        }
        coG();
      }
      return;
    }
    catch (Exception paramContext) {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */