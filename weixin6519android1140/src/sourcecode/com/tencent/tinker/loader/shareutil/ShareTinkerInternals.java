package com.tencent.tinker.loader.shareutil;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShareTinkerInternals
{
  private static String processName = null;
  private static final boolean yiX = YL(System.getProperty("java.vm.version"));
  private static final boolean yiY = cqQ();
  private static Boolean yiZ = null;
  private static String yja = null;
  private static String yjb = null;
  
  public static boolean Gd(int paramInt)
  {
    return (paramInt & 0x1) != 0;
  }
  
  public static boolean Ge(int paramInt)
  {
    return (paramInt & 0x2) != 0;
  }
  
  public static boolean Gf(int paramInt)
  {
    return (paramInt & 0x4) != 0;
  }
  
  public static String Gg(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "unknown";
    case 3: 
      return "dex";
    case 4: 
      return "dex_opt";
    case 5: 
      return "lib";
    case 1: 
      return "patch_file";
    case 2: 
      return "patch_info";
    }
    return "resource";
  }
  
  public static boolean Gh(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static String RW(String paramString)
  {
    if (paramString == null) {
      paramString = null;
    }
    label66:
    for (;;)
    {
      return paramString;
      char[] arrayOfChar = paramString.toCharArray();
      if (arrayOfChar == null) {
        return null;
      }
      int i = 0;
      if (i < arrayOfChar.length) {
        if (arrayOfChar[i] > '') {
          arrayOfChar[i] = '\000';
        }
      }
      for (int j = 1;; j = 0)
      {
        if (j == 0) {
          break label66;
        }
        return new String(arrayOfChar, 0, i);
        i += 1;
        break;
      }
    }
  }
  
  public static boolean YK(String paramString)
  {
    String str = Build.FINGERPRINT;
    if ((paramString == null) || (paramString.equals("")) || (str == null) || (str.equals(""))) {
      new StringBuilder("fingerprint empty:").append(paramString).append(",current:").append(str);
    }
    while (paramString.equals(str)) {
      return false;
    }
    new StringBuilder("system OTA,fingerprint not equal:").append(paramString).append(",").append(str);
    return true;
  }
  
  private static boolean YL(String paramString)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramString != null)
    {
      paramString = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(paramString);
      bool1 = bool2;
      if (!paramString.matches()) {}
    }
    try
    {
      int i = Integer.parseInt(paramString.group(1));
      int j = Integer.parseInt(paramString.group(2));
      if (i <= 2)
      {
        bool1 = bool2;
        if (i == 2)
        {
          bool1 = bool2;
          if (j <= 0) {}
        }
      }
      else
      {
        bool1 = true;
      }
      return bool1;
    }
    catch (NumberFormatException paramString) {}
    return false;
  }
  
  public static int a(Context paramContext, int paramInt, File paramFile, ShareSecurityCheck paramShareSecurityCheck)
  {
    int i;
    int j;
    if (!paramShareSecurityCheck.af(paramFile))
    {
      i = -1;
      j = i;
      if (i == 0)
      {
        if (paramInt != 7) {
          break label159;
        }
        i = 1;
      }
    }
    for (;;)
    {
      if (i == 0)
      {
        paramContext = paramShareSecurityCheck.yiV;
        if ((!Gd(paramInt)) && (paramContext.containsKey("assets/dex_meta.txt")))
        {
          j = -9;
          return j;
          paramContext = ic(paramContext);
          if (paramContext == null)
          {
            i = -5;
            break;
          }
          paramFile = paramShareSecurityCheck.cqL();
          if (paramFile == null)
          {
            i = -2;
            break;
          }
          paramFile = (String)paramFile.get("TINKER_ID");
          if (paramFile == null)
          {
            i = -6;
            break;
          }
          if (!paramContext.equals(paramFile))
          {
            new StringBuilder("tinkerId is not equal, base is ").append(paramContext).append(", but patch is ").append(paramFile);
            i = -7;
            break;
          }
          i = 0;
          break;
          label159:
          i = 0;
          continue;
        }
        if ((!Ge(paramInt)) && (paramContext.containsKey("assets/so_meta.txt"))) {
          return -9;
        }
        if ((!Gf(paramInt)) && (paramContext.containsKey("assets/res_meta.txt"))) {
          return -9;
        }
      }
    }
    return 0;
  }
  
  public static ShareDexDiffPatchInfo a(ShareDexDiffPatchInfo paramShareDexDiffPatchInfo, int paramInt)
  {
    if (paramShareDexDiffPatchInfo.yhD.startsWith("test.dex"))
    {
      if (paramInt != 1) {}
      for (String str = "classes" + paramInt + ".dex";; str = "classes.dex") {
        return new ShareDexDiffPatchInfo(str, paramShareDexDiffPatchInfo.path, paramShareDexDiffPatchInfo.yhE, paramShareDexDiffPatchInfo.yhF, paramShareDexDiffPatchInfo.yhI, paramShareDexDiffPatchInfo.yhG, paramShareDexDiffPatchInfo.yhH, paramShareDexDiffPatchInfo.yhJ);
      }
    }
    return null;
  }
  
  /* Error */
  public static java.util.Properties ag(File paramFile)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 239	java/io/File:isFile	()Z
    //   4: ifeq +12 -> 16
    //   7: aload_0
    //   8: invokevirtual 243	java/io/File:length	()J
    //   11: lconst_0
    //   12: lcmp
    //   13: ifne +5 -> 18
    //   16: aconst_null
    //   17: areturn
    //   18: new 245	java/util/zip/ZipFile
    //   21: dup
    //   22: aload_0
    //   23: invokespecial 248	java/util/zip/ZipFile:<init>	(Ljava/io/File;)V
    //   26: astore_1
    //   27: aload_1
    //   28: ldc -6
    //   30: invokevirtual 254	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   33: astore_0
    //   34: aload_0
    //   35: ifnonnull +9 -> 44
    //   38: aload_1
    //   39: invokestatic 259	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   42: aconst_null
    //   43: areturn
    //   44: aload_1
    //   45: aload_0
    //   46: invokevirtual 263	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   49: astore_0
    //   50: new 265	java/util/Properties
    //   53: dup
    //   54: invokespecial 266	java/util/Properties:<init>	()V
    //   57: astore_2
    //   58: aload_2
    //   59: aload_0
    //   60: invokevirtual 270	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   63: aload_0
    //   64: invokestatic 274	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   67: aload_1
    //   68: invokestatic 259	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   71: aload_2
    //   72: areturn
    //   73: astore_2
    //   74: aconst_null
    //   75: astore_0
    //   76: aload_0
    //   77: invokestatic 274	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   80: aload_2
    //   81: athrow
    //   82: astore_2
    //   83: aload_1
    //   84: astore_0
    //   85: aload_2
    //   86: astore_1
    //   87: new 92	java/lang/StringBuilder
    //   90: dup
    //   91: ldc_w 276
    //   94: invokespecial 97	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   97: aload_1
    //   98: invokevirtual 279	java/io/IOException:getMessage	()Ljava/lang/String;
    //   101: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: pop
    //   105: aload_0
    //   106: invokestatic 259	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   109: aconst_null
    //   110: areturn
    //   111: astore_0
    //   112: aconst_null
    //   113: astore_1
    //   114: aload_1
    //   115: invokestatic 259	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   118: aload_0
    //   119: athrow
    //   120: astore_0
    //   121: goto -7 -> 114
    //   124: astore_2
    //   125: aload_0
    //   126: astore_1
    //   127: aload_2
    //   128: astore_0
    //   129: goto -15 -> 114
    //   132: astore_1
    //   133: aconst_null
    //   134: astore_0
    //   135: goto -48 -> 87
    //   138: astore_2
    //   139: goto -63 -> 76
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	paramFile	File
    //   26	101	1	localObject1	Object
    //   132	1	1	localIOException1	java.io.IOException
    //   57	15	2	localProperties	java.util.Properties
    //   73	8	2	localObject2	Object
    //   82	4	2	localIOException2	java.io.IOException
    //   124	4	2	localObject3	Object
    //   138	1	2	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   44	50	73	finally
    //   27	34	82	java/io/IOException
    //   63	67	82	java/io/IOException
    //   76	82	82	java/io/IOException
    //   18	27	111	finally
    //   27	34	120	finally
    //   63	67	120	finally
    //   76	82	120	finally
    //   87	105	124	finally
    //   18	27	132	java/io/IOException
    //   50	63	138	finally
  }
  
  public static String bO(Context paramContext, String paramString)
  {
    String str = paramString;
    if (paramString.equals("changing"))
    {
      if (jdMethod_if(paramContext)) {
        str = "odex";
      }
    }
    else {
      return str;
    }
    return "interpet";
  }
  
  public static boolean cqM()
  {
    return (yiX) || (Build.VERSION.SDK_INT >= 21);
  }
  
  public static boolean cqN()
  {
    return (yiY) && (Build.VERSION.SDK_INT < 24);
  }
  
  public static boolean cqO()
  {
    return Build.VERSION.SDK_INT > 25;
  }
  
  public static String cqP()
  {
    if (yjb != null) {
      return yjb;
    }
    yjb = (String)Class.forName("dalvik.system.VMRuntime").getDeclaredMethod("getCurrentInstructionSet", new Class[0]).invoke(null, new Object[0]);
    new StringBuilder("getCurrentInstructionSet:").append(yjb);
    return yjb;
  }
  
  private static boolean cqQ()
  {
    try
    {
      Object localObject = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[] { String.class });
      String str = (String)((Method)localObject).invoke(null, new Object[] { "dalvik.vm.usejit" });
      localObject = (String)((Method)localObject).invoke(null, new Object[] { "dalvik.vm.usejitprofiles" });
      if ((!nm(str)) && (nm((String)localObject)))
      {
        boolean bool = str.equals("true");
        if (bool) {
          return true;
        }
      }
    }
    catch (Throwable localThrowable)
    {
      new StringBuilder("isVmJitInternal ex:").append(localThrowable);
    }
    return false;
  }
  
  /* Error */
  public static String g(Throwable paramThrowable)
  {
    // Byte code:
    //   0: new 346	java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial 347	java/io/ByteArrayOutputStream:<init>	()V
    //   7: astore_1
    //   8: new 349	java/io/PrintStream
    //   11: dup
    //   12: aload_1
    //   13: invokespecial 352	java/io/PrintStream:<init>	(Ljava/io/OutputStream;)V
    //   16: astore_2
    //   17: aload_0
    //   18: invokevirtual 356	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
    //   21: ifnull +11 -> 32
    //   24: aload_0
    //   25: invokevirtual 356	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
    //   28: astore_0
    //   29: goto -12 -> 17
    //   32: aload_0
    //   33: aload_2
    //   34: invokevirtual 360	java/lang/Throwable:printStackTrace	(Ljava/io/PrintStream;)V
    //   37: aload_1
    //   38: invokevirtual 361	java/io/ByteArrayOutputStream:toString	()Ljava/lang/String;
    //   41: invokestatic 363	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:RW	(Ljava/lang/String;)Ljava/lang/String;
    //   44: astore_0
    //   45: aload_1
    //   46: invokevirtual 366	java/io/ByteArrayOutputStream:close	()V
    //   49: aload_0
    //   50: areturn
    //   51: astore_0
    //   52: aload_1
    //   53: invokevirtual 366	java/io/ByteArrayOutputStream:close	()V
    //   56: aload_0
    //   57: athrow
    //   58: astore_1
    //   59: aload_0
    //   60: areturn
    //   61: astore_1
    //   62: goto -6 -> 56
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	paramThrowable	Throwable
    //   7	46	1	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   58	1	1	localIOException1	java.io.IOException
    //   61	1	1	localIOException2	java.io.IOException
    //   16	18	2	localPrintStream	java.io.PrintStream
    // Exception table:
    //   from	to	target	type
    //   17	29	51	finally
    //   32	45	51	finally
    //   45	49	58	java/io/IOException
    //   52	56	61	java/io/IOException
  }
  
  private static String ic(Context paramContext)
  {
    if (yja != null) {
      return yja;
    }
    try
    {
      paramContext = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128).metaData.get("TINKER_ID");
      if (paramContext != null) {}
      for (yja = String.valueOf(paramContext);; yja = null) {
        return yja;
      }
      return null;
    }
    catch (Exception paramContext)
    {
      new StringBuilder("getManifestTinkerID exception:").append(paramContext.getMessage());
    }
  }
  
  public static void id(Context paramContext)
  {
    paramContext.getSharedPreferences("tinker_share_config", 4).edit().putBoolean("tinker_enable_1.8.3", false).commit();
  }
  
  public static boolean ie(Context paramContext)
  {
    if (paramContext == null) {
      return false;
    }
    return paramContext.getSharedPreferences("tinker_share_config", 4).getBoolean("tinker_enable_1.8.3", true);
  }
  
  public static boolean jdMethod_if(Context paramContext)
  {
    String str2 = paramContext.getPackageName();
    String str1 = ii(paramContext);
    if (str1 != null)
    {
      paramContext = str1;
      if (str1.length() != 0) {}
    }
    else
    {
      paramContext = "";
    }
    return str2.equals(paramContext);
  }
  
  public static boolean ig(Context paramContext)
  {
    if (yiZ != null) {
      return yiZ.booleanValue();
    }
    paramContext = Boolean.valueOf(ii(paramContext).endsWith(":patch"));
    yiZ = paramContext;
    return paramContext.booleanValue();
  }
  
  public static void ih(Context paramContext)
  {
    paramContext = (ActivityManager)paramContext.getSystemService("activity");
    if (paramContext == null) {}
    for (;;)
    {
      return;
      paramContext = paramContext.getRunningAppProcesses();
      if (paramContext != null)
      {
        paramContext = paramContext.iterator();
        while (paramContext.hasNext())
        {
          ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)paramContext.next();
          if ((localRunningAppProcessInfo.uid == Process.myUid()) && (localRunningAppProcessInfo.pid != Process.myPid())) {
            Process.killProcess(localRunningAppProcessInfo.pid);
          }
        }
      }
    }
  }
  
  public static String ii(Context paramContext)
  {
    if (processName != null) {
      return processName;
    }
    paramContext = ij(paramContext);
    processName = paramContext;
    return paramContext;
  }
  
  /* Error */
  private static String ij(Context paramContext)
  {
    // Byte code:
    //   0: invokestatic 494	android/os/Process:myPid	()I
    //   3: istore_1
    //   4: aload_0
    //   5: ifnull +7 -> 12
    //   8: iload_1
    //   9: ifgt +6 -> 15
    //   12: ldc 86
    //   14: areturn
    //   15: aload_0
    //   16: ldc_w 454
    //   19: invokevirtual 457	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   22: checkcast 459	android/app/ActivityManager
    //   25: astore_0
    //   26: aload_0
    //   27: ifnull +89 -> 116
    //   30: aload_0
    //   31: invokevirtual 463	android/app/ActivityManager:getRunningAppProcesses	()Ljava/util/List;
    //   34: astore_0
    //   35: aload_0
    //   36: ifnull +80 -> 116
    //   39: aload_0
    //   40: invokeinterface 469 1 0
    //   45: astore 4
    //   47: aload 4
    //   49: invokeinterface 474 1 0
    //   54: ifeq +33 -> 87
    //   57: aload 4
    //   59: invokeinterface 478 1 0
    //   64: checkcast 480	android/app/ActivityManager$RunningAppProcessInfo
    //   67: astore_0
    //   68: aload_0
    //   69: getfield 491	android/app/ActivityManager$RunningAppProcessInfo:pid	I
    //   72: istore_2
    //   73: iload_2
    //   74: iload_1
    //   75: if_icmpne -28 -> 47
    //   78: aload_0
    //   79: ifnull +37 -> 116
    //   82: aload_0
    //   83: getfield 502	android/app/ActivityManager$RunningAppProcessInfo:processName	Ljava/lang/String;
    //   86: areturn
    //   87: aconst_null
    //   88: astore_0
    //   89: goto -11 -> 78
    //   92: astore_0
    //   93: new 92	java/lang/StringBuilder
    //   96: dup
    //   97: ldc_w 504
    //   100: invokespecial 97	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   103: aload_0
    //   104: invokevirtual 401	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   107: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: pop
    //   111: aconst_null
    //   112: astore_0
    //   113: goto -35 -> 78
    //   116: sipush 128
    //   119: newarray <illegal type>
    //   121: astore 5
    //   123: new 506	java/io/FileInputStream
    //   126: dup
    //   127: new 92	java/lang/StringBuilder
    //   130: dup
    //   131: ldc_w 508
    //   134: invokespecial 97	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   137: iload_1
    //   138: invokevirtual 198	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   141: ldc_w 510
    //   144: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: invokevirtual 204	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   150: invokespecial 511	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   153: astore 4
    //   155: aload 4
    //   157: astore_0
    //   158: aload 4
    //   160: aload 5
    //   162: invokevirtual 515	java/io/FileInputStream:read	([B)I
    //   165: istore_3
    //   166: iload_3
    //   167: ifle +43 -> 210
    //   170: iconst_0
    //   171: istore_1
    //   172: goto +123 -> 295
    //   175: aload 4
    //   177: astore_0
    //   178: new 71	java/lang/String
    //   181: dup
    //   182: aload 5
    //   184: iconst_0
    //   185: iload_2
    //   186: invokespecial 518	java/lang/String:<init>	([BII)V
    //   189: astore 5
    //   191: aload 4
    //   193: invokevirtual 519	java/io/FileInputStream:close	()V
    //   196: aload 5
    //   198: areturn
    //   199: astore_0
    //   200: aload 5
    //   202: areturn
    //   203: iload_1
    //   204: iconst_1
    //   205: iadd
    //   206: istore_1
    //   207: goto +88 -> 295
    //   210: aload 4
    //   212: invokevirtual 519	java/io/FileInputStream:close	()V
    //   215: ldc 86
    //   217: areturn
    //   218: astore 5
    //   220: aconst_null
    //   221: astore 4
    //   223: aload 4
    //   225: astore_0
    //   226: new 92	java/lang/StringBuilder
    //   229: dup
    //   230: ldc_w 504
    //   233: invokespecial 97	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   236: aload 5
    //   238: invokevirtual 401	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   241: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   244: pop
    //   245: aload 4
    //   247: ifnull -32 -> 215
    //   250: aload 4
    //   252: invokevirtual 519	java/io/FileInputStream:close	()V
    //   255: goto -40 -> 215
    //   258: astore_0
    //   259: goto -44 -> 215
    //   262: astore 4
    //   264: aconst_null
    //   265: astore_0
    //   266: aload_0
    //   267: ifnull +7 -> 274
    //   270: aload_0
    //   271: invokevirtual 519	java/io/FileInputStream:close	()V
    //   274: aload 4
    //   276: athrow
    //   277: astore_0
    //   278: goto -63 -> 215
    //   281: astore_0
    //   282: goto -8 -> 274
    //   285: astore 4
    //   287: goto -21 -> 266
    //   290: astore 5
    //   292: goto -69 -> 223
    //   295: iload_3
    //   296: istore_2
    //   297: iload_1
    //   298: iload_3
    //   299: if_icmpge -124 -> 175
    //   302: aload 5
    //   304: iload_1
    //   305: baload
    //   306: sipush 128
    //   309: if_icmpgt +10 -> 319
    //   312: aload 5
    //   314: iload_1
    //   315: baload
    //   316: ifgt -113 -> 203
    //   319: iload_1
    //   320: istore_2
    //   321: goto -146 -> 175
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	324	0	paramContext	Context
    //   3	317	1	i	int
    //   72	249	2	j	int
    //   165	135	3	k	int
    //   45	206	4	localObject1	Object
    //   262	13	4	localObject2	Object
    //   285	1	4	localObject3	Object
    //   121	80	5	localObject4	Object
    //   218	19	5	localException1	Exception
    //   290	23	5	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   39	47	92	java/lang/Exception
    //   47	73	92	java/lang/Exception
    //   191	196	199	java/lang/Exception
    //   123	155	218	java/lang/Exception
    //   250	255	258	java/lang/Exception
    //   123	155	262	finally
    //   210	215	277	java/lang/Exception
    //   270	274	281	java/lang/Exception
    //   158	166	285	finally
    //   178	191	285	finally
    //   226	245	285	finally
    //   158	166	290	java/lang/Exception
    //   178	191	290	java/lang/Exception
  }
  
  public static boolean nm(String paramString)
  {
    return (paramString == null) || (paramString.length() <= 0);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\tinker\loader\shareutil\ShareTinkerInternals.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */