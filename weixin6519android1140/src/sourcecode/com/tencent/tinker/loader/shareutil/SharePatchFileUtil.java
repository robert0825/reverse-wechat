package com.tencent.tinker.loader.shareutil;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.tencent.tinker.loader.TinkerRuntimeException;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipFile;

public class SharePatchFileUtil
{
  private static char[] vii = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  
  public static File YE(String paramString)
  {
    return new File(paramString + "/patch.info");
  }
  
  public static File YF(String paramString)
  {
    return new File(paramString + "/info.lock");
  }
  
  public static String YG(String paramString)
  {
    if ((paramString == null) || (paramString.length() != 32)) {
      return null;
    }
    return "patch-" + paramString.substring(0, 8);
  }
  
  public static String YH(String paramString)
  {
    if ((paramString == null) || (paramString.length() != 32)) {
      return null;
    }
    return YG(paramString) + ".apk";
  }
  
  public static boolean YI(String paramString)
  {
    return (paramString != null) && (paramString.length() == 32);
  }
  
  public static boolean YJ(String paramString)
  {
    if (paramString == null) {
      return false;
    }
    return paramString.endsWith(".dex");
  }
  
  public static final boolean Z(File paramFile)
  {
    return (paramFile != null) && (paramFile.exists()) && (paramFile.canRead()) && (paramFile.isFile()) && (paramFile.length() > 0L);
  }
  
  public static String a(JarFile paramJarFile, JarEntry paramJarEntry)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      paramJarEntry = paramJarFile.getInputStream(paramJarEntry);
      paramJarFile = new byte['䀀'];
      paramJarEntry = new BufferedInputStream(paramJarEntry);
      try
      {
        for (;;)
        {
          int i = paramJarEntry.read(paramJarFile);
          if (i <= 0) {
            break;
          }
          localStringBuilder.append(new String(paramJarFile, 0, i));
        }
        b(paramJarEntry);
      }
      finally {}
    }
    finally
    {
      for (;;)
      {
        paramJarEntry = null;
      }
    }
    throw paramJarFile;
    b(paramJarEntry);
    return localStringBuilder.toString();
  }
  
  public static void a(ZipFile paramZipFile)
  {
    if (paramZipFile != null) {}
    try
    {
      paramZipFile.close();
      return;
    }
    catch (IOException paramZipFile) {}
  }
  
  public static long aa(File paramFile)
  {
    long l1 = 0L;
    long l2 = l1;
    if (paramFile != null)
    {
      if (paramFile.exists()) {
        break label22;
      }
      l2 = l1;
    }
    label22:
    int j;
    int i;
    do
    {
      do
      {
        return l2;
        if (paramFile.isFile()) {
          return paramFile.length();
        }
        paramFile = paramFile.listFiles();
        l2 = l1;
      } while (paramFile == null);
      j = paramFile.length;
      i = 0;
      l2 = l1;
    } while (i >= j);
    File localFile = paramFile[i];
    if (localFile.isDirectory()) {}
    for (l1 += aa(localFile);; l1 += localFile.length())
    {
      i += 1;
      break;
    }
  }
  
  public static final boolean ab(File paramFile)
  {
    boolean bool1 = true;
    if (paramFile == null) {}
    boolean bool2;
    do
    {
      do
      {
        return bool1;
      } while (!paramFile.exists());
      new StringBuilder("safeDeleteFile, try to delete path: ").append(paramFile.getPath());
      bool2 = paramFile.delete();
      bool1 = bool2;
    } while (bool2);
    new StringBuilder("Failed to delete file, try to delete when exit. path: ").append(paramFile.getPath());
    paramFile.deleteOnExit();
    return bool2;
  }
  
  /* Error */
  public static String ac(File paramFile)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +10 -> 11
    //   4: aload_0
    //   5: invokevirtual 87	java/io/File:exists	()Z
    //   8: ifne +5 -> 13
    //   11: aconst_null
    //   12: areturn
    //   13: new 161	java/io/FileInputStream
    //   16: dup
    //   17: aload_0
    //   18: invokespecial 164	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   21: astore_0
    //   22: aload_0
    //   23: invokestatic 168	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:t	(Ljava/io/InputStream;)Ljava/lang/String;
    //   26: astore_1
    //   27: aload_0
    //   28: invokestatic 122	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   31: aload_1
    //   32: areturn
    //   33: astore_0
    //   34: aconst_null
    //   35: astore_0
    //   36: aload_0
    //   37: invokestatic 122	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   40: aconst_null
    //   41: areturn
    //   42: astore_0
    //   43: aconst_null
    //   44: astore_2
    //   45: aload_0
    //   46: astore_1
    //   47: aload_2
    //   48: invokestatic 122	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   51: aload_1
    //   52: athrow
    //   53: astore_1
    //   54: aload_0
    //   55: astore_2
    //   56: goto -9 -> 47
    //   59: astore_1
    //   60: goto -24 -> 36
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	63	0	paramFile	File
    //   26	26	1	localObject1	Object
    //   53	1	1	localObject2	Object
    //   59	1	1	localException	Exception
    //   44	12	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   13	22	33	java/lang/Exception
    //   13	22	42	finally
    //   22	27	53	finally
    //   22	27	59	java/lang/Exception
  }
  
  public static void ad(File paramFile)
  {
    if (paramFile == null) {}
    do
    {
      return;
      paramFile = paramFile.getParentFile();
    } while (paramFile.exists());
    paramFile.mkdirs();
  }
  
  public static void b(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable) {}
  }
  
  /* Error */
  public static boolean b(File paramFile, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +11 -> 12
    //   4: aload_2
    //   5: ifnull +7 -> 12
    //   8: aload_1
    //   9: ifnonnull +5 -> 14
    //   12: iconst_0
    //   13: ireturn
    //   14: aload_0
    //   15: invokevirtual 185	java/io/File:getName	()Ljava/lang/String;
    //   18: invokestatic 187	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:YJ	(Ljava/lang/String;)Z
    //   21: ifeq +14 -> 35
    //   24: aload_0
    //   25: invokestatic 189	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ac	(Ljava/io/File;)Ljava/lang/String;
    //   28: astore_0
    //   29: aload_2
    //   30: aload_0
    //   31: invokevirtual 193	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   34: ireturn
    //   35: new 127	java/util/zip/ZipFile
    //   38: dup
    //   39: aload_0
    //   40: invokespecial 194	java/util/zip/ZipFile:<init>	(Ljava/io/File;)V
    //   43: astore 4
    //   45: aload 4
    //   47: astore_3
    //   48: aload 4
    //   50: aload_1
    //   51: invokevirtual 198	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   54: astore_1
    //   55: aload_1
    //   56: ifnonnull +33 -> 89
    //   59: aload 4
    //   61: astore_3
    //   62: new 36	java/lang/StringBuilder
    //   65: dup
    //   66: ldc -56
    //   68: invokespecial 64	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   71: aload_0
    //   72: invokevirtual 203	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   75: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: pop
    //   79: aload 4
    //   81: invokevirtual 130	java/util/zip/ZipFile:close	()V
    //   84: iconst_0
    //   85: ireturn
    //   86: astore_0
    //   87: iconst_0
    //   88: ireturn
    //   89: aload 4
    //   91: astore_3
    //   92: aload 4
    //   94: aload_1
    //   95: invokevirtual 204	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   98: invokestatic 168	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:t	(Ljava/io/InputStream;)Ljava/lang/String;
    //   101: astore_1
    //   102: aload_1
    //   103: astore_0
    //   104: aload 4
    //   106: invokevirtual 130	java/util/zip/ZipFile:close	()V
    //   109: goto -80 -> 29
    //   112: astore_1
    //   113: goto -84 -> 29
    //   116: astore_1
    //   117: aconst_null
    //   118: astore_1
    //   119: aload_1
    //   120: astore_3
    //   121: new 36	java/lang/StringBuilder
    //   124: dup
    //   125: ldc -50
    //   127: invokespecial 64	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   130: aload_0
    //   131: invokevirtual 203	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   134: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: pop
    //   138: aload_1
    //   139: ifnull -127 -> 12
    //   142: aload_1
    //   143: invokevirtual 130	java/util/zip/ZipFile:close	()V
    //   146: iconst_0
    //   147: ireturn
    //   148: astore_0
    //   149: iconst_0
    //   150: ireturn
    //   151: astore_0
    //   152: aconst_null
    //   153: astore_3
    //   154: aload_3
    //   155: ifnull +7 -> 162
    //   158: aload_3
    //   159: invokevirtual 130	java/util/zip/ZipFile:close	()V
    //   162: aload_0
    //   163: athrow
    //   164: astore_1
    //   165: goto -3 -> 162
    //   168: astore_0
    //   169: goto -15 -> 154
    //   172: astore_1
    //   173: aload 4
    //   175: astore_1
    //   176: goto -57 -> 119
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	179	0	paramFile	File
    //   0	179	1	paramString1	String
    //   0	179	2	paramString2	String
    //   47	112	3	localObject	Object
    //   43	131	4	localZipFile	ZipFile
    // Exception table:
    //   from	to	target	type
    //   79	84	86	java/lang/Throwable
    //   104	109	112	java/lang/Throwable
    //   35	45	116	java/lang/Throwable
    //   142	146	148	java/lang/Throwable
    //   35	45	151	finally
    //   158	162	164	java/lang/Throwable
    //   48	55	168	finally
    //   62	79	168	finally
    //   92	102	168	finally
    //   121	138	168	finally
    //   48	55	172	java/lang/Throwable
    //   62	79	172	java/lang/Throwable
    //   92	102	172	java/lang/Throwable
  }
  
  public static String bK(byte[] paramArrayOfByte)
  {
    int i = 0;
    try
    {
      Object localObject = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject).update(paramArrayOfByte);
      paramArrayOfByte = ((MessageDigest)localObject).digest();
      int k = paramArrayOfByte.length;
      localObject = new char[k * 2];
      int j = 0;
      while (i < k)
      {
        int m = paramArrayOfByte[i];
        int n = j + 1;
        localObject[j] = vii[(m >>> 4 & 0xF)];
        j = n + 1;
        localObject[n] = vii[(m & 0xF)];
        i += 1;
      }
      paramArrayOfByte = new String((char[])localObject);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte) {}
    return null;
  }
  
  public static final boolean ba(String paramString)
  {
    if (paramString == null) {
      return false;
    }
    return f(new File(paramString));
  }
  
  public static final boolean f(File paramFile)
  {
    int i = 0;
    if ((paramFile == null) || (!paramFile.exists())) {
      return false;
    }
    if (paramFile.isFile()) {
      ab(paramFile);
    }
    for (;;)
    {
      return true;
      if (paramFile.isDirectory())
      {
        File[] arrayOfFile = paramFile.listFiles();
        if (arrayOfFile != null)
        {
          int j = arrayOfFile.length;
          while (i < j)
          {
            f(arrayOfFile[i]);
            i += 1;
          }
          ab(paramFile);
        }
      }
    }
  }
  
  public static boolean f(File paramFile, String paramString)
  {
    if (paramString == null) {}
    do
    {
      return false;
      paramFile = ac(paramFile);
    } while (paramFile == null);
    return paramString.equals(paramFile);
  }
  
  public static boolean g(File paramFile, String paramString)
  {
    return b(paramFile, "classes.dex", paramString);
  }
  
  /* Error */
  public static boolean h(File paramFile, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore_3
    //   5: aconst_null
    //   6: astore 5
    //   8: new 127	java/util/zip/ZipFile
    //   11: dup
    //   12: aload_0
    //   13: invokespecial 194	java/util/zip/ZipFile:<init>	(Ljava/io/File;)V
    //   16: astore_0
    //   17: aload_0
    //   18: ldc -14
    //   20: invokevirtual 198	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   23: astore 4
    //   25: aload 4
    //   27: ifnonnull +9 -> 36
    //   30: aload_0
    //   31: invokestatic 244	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   34: iconst_0
    //   35: ireturn
    //   36: aload 5
    //   38: astore_3
    //   39: aload_0
    //   40: aload 4
    //   42: invokevirtual 204	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   45: astore 4
    //   47: aload 4
    //   49: astore_3
    //   50: aload 4
    //   52: invokestatic 168	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:t	(Ljava/io/InputStream;)Ljava/lang/String;
    //   55: astore 5
    //   57: aload 5
    //   59: ifnull +28 -> 87
    //   62: aload 4
    //   64: astore_3
    //   65: aload 5
    //   67: aload_1
    //   68: invokevirtual 193	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   71: istore_2
    //   72: iload_2
    //   73: ifeq +14 -> 87
    //   76: aload 4
    //   78: invokestatic 122	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   81: aload_0
    //   82: invokestatic 244	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   85: iconst_1
    //   86: ireturn
    //   87: aload 4
    //   89: invokestatic 122	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   92: aload_0
    //   93: invokestatic 244	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   96: iconst_0
    //   97: ireturn
    //   98: astore_1
    //   99: aload_3
    //   100: invokestatic 122	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   103: aload_1
    //   104: athrow
    //   105: astore_1
    //   106: aload_0
    //   107: astore_3
    //   108: new 36	java/lang/StringBuilder
    //   111: dup
    //   112: ldc -10
    //   114: invokespecial 64	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   117: aload_1
    //   118: invokevirtual 249	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   121: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: pop
    //   125: aload_0
    //   126: invokestatic 244	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   129: iconst_0
    //   130: ireturn
    //   131: astore_0
    //   132: aload_3
    //   133: invokestatic 244	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   136: aload_0
    //   137: athrow
    //   138: astore_1
    //   139: aload_0
    //   140: astore_3
    //   141: aload_1
    //   142: astore_0
    //   143: goto -11 -> 132
    //   146: astore_1
    //   147: aload 4
    //   149: astore_0
    //   150: goto -44 -> 106
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	153	0	paramFile	File
    //   0	153	1	paramString	String
    //   71	2	2	bool	boolean
    //   4	137	3	localObject1	Object
    //   1	147	4	localObject2	Object
    //   6	60	5	str	String
    // Exception table:
    //   from	to	target	type
    //   39	47	98	finally
    //   50	57	98	finally
    //   65	72	98	finally
    //   17	25	105	java/lang/Throwable
    //   76	81	105	java/lang/Throwable
    //   87	92	105	java/lang/Throwable
    //   99	105	105	java/lang/Throwable
    //   8	17	131	finally
    //   108	125	131	finally
    //   17	25	138	finally
    //   76	81	138	finally
    //   87	92	138	finally
    //   99	105	138	finally
    //   8	17	146	java/lang/Throwable
  }
  
  public static File hY(Context paramContext)
  {
    paramContext = paramContext.getApplicationInfo();
    if (paramContext == null) {
      return null;
    }
    return new File(paramContext.dataDir, "tinker");
  }
  
  public static File hZ(Context paramContext)
  {
    paramContext = paramContext.getApplicationInfo();
    if (paramContext == null) {
      return null;
    }
    return new File(paramContext.dataDir, "tinker_temp");
  }
  
  public static File ia(Context paramContext)
  {
    paramContext = hZ(paramContext);
    if (paramContext == null) {
      return null;
    }
    return new File(paramContext, "tinker_last_crash");
  }
  
  /* Error */
  public static String ib(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 283	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ia	(Landroid/content/Context;)Ljava/io/File;
    //   4: astore_0
    //   5: aload_0
    //   6: invokestatic 285	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:Z	(Ljava/io/File;)Z
    //   9: ifne +5 -> 14
    //   12: aconst_null
    //   13: areturn
    //   14: new 287	java/lang/StringBuffer
    //   17: dup
    //   18: invokespecial 288	java/lang/StringBuffer:<init>	()V
    //   21: astore_2
    //   22: new 290	java/io/BufferedReader
    //   25: dup
    //   26: new 292	java/io/InputStreamReader
    //   29: dup
    //   30: new 161	java/io/FileInputStream
    //   33: dup
    //   34: aload_0
    //   35: invokespecial 164	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   38: invokespecial 293	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   41: invokespecial 296	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   44: astore_1
    //   45: aload_1
    //   46: astore_0
    //   47: aload_1
    //   48: invokevirtual 299	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   51: astore_3
    //   52: aload_3
    //   53: ifnull +48 -> 101
    //   56: aload_1
    //   57: astore_0
    //   58: aload_2
    //   59: aload_3
    //   60: invokevirtual 302	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   63: pop
    //   64: aload_1
    //   65: astore_0
    //   66: aload_2
    //   67: ldc_w 304
    //   70: invokevirtual 302	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   73: pop
    //   74: goto -29 -> 45
    //   77: astore_2
    //   78: aload_1
    //   79: astore_0
    //   80: new 36	java/lang/StringBuilder
    //   83: dup
    //   84: ldc_w 306
    //   87: invokespecial 64	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   90: aload_2
    //   91: invokevirtual 309	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   94: pop
    //   95: aload_1
    //   96: invokestatic 122	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   99: aconst_null
    //   100: areturn
    //   101: aload_1
    //   102: invokestatic 122	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   105: aload_2
    //   106: invokevirtual 310	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   109: areturn
    //   110: astore_0
    //   111: aconst_null
    //   112: astore_2
    //   113: aload_0
    //   114: astore_1
    //   115: aload_2
    //   116: invokestatic 122	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   119: aload_1
    //   120: athrow
    //   121: astore_1
    //   122: aload_0
    //   123: astore_2
    //   124: goto -9 -> 115
    //   127: astore_2
    //   128: aconst_null
    //   129: astore_1
    //   130: goto -52 -> 78
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	133	0	paramContext	Context
    //   44	76	1	localObject1	Object
    //   121	1	1	localObject2	Object
    //   129	1	1	localObject3	Object
    //   21	46	2	localStringBuffer	StringBuffer
    //   77	29	2	localException1	Exception
    //   112	12	2	localObject4	Object
    //   127	1	2	localException2	Exception
    //   51	9	3	str	String
    // Exception table:
    //   from	to	target	type
    //   47	52	77	java/lang/Exception
    //   58	64	77	java/lang/Exception
    //   66	74	77	java/lang/Exception
    //   22	45	110	finally
    //   47	52	121	finally
    //   58	64	121	finally
    //   66	74	121	finally
    //   80	95	121	finally
    //   22	45	127	java/lang/Exception
  }
  
  /* Error */
  public static void l(File paramFile1, File paramFile2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: invokestatic 285	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:Z	(Ljava/io/File;)Z
    //   6: ifeq +7 -> 13
    //   9: aload_1
    //   10: ifnonnull +4 -> 14
    //   13: return
    //   14: aload_0
    //   15: invokevirtual 203	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   18: aload_1
    //   19: invokevirtual 203	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   22: invokevirtual 193	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   25: ifne -12 -> 13
    //   28: aload_1
    //   29: invokevirtual 173	java/io/File:getParentFile	()Ljava/io/File;
    //   32: astore 4
    //   34: aload 4
    //   36: ifnull +17 -> 53
    //   39: aload 4
    //   41: invokevirtual 87	java/io/File:exists	()Z
    //   44: ifne +9 -> 53
    //   47: aload 4
    //   49: invokevirtual 176	java/io/File:mkdirs	()Z
    //   52: pop
    //   53: new 161	java/io/FileInputStream
    //   56: dup
    //   57: aload_0
    //   58: invokespecial 164	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   61: astore_0
    //   62: new 314	java/io/FileOutputStream
    //   65: dup
    //   66: aload_1
    //   67: iconst_0
    //   68: invokespecial 317	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   71: astore_1
    //   72: sipush 16384
    //   75: newarray <illegal type>
    //   77: astore_3
    //   78: aload_0
    //   79: aload_3
    //   80: invokevirtual 318	java/io/FileInputStream:read	([B)I
    //   83: istore_2
    //   84: iload_2
    //   85: ifle +30 -> 115
    //   88: aload_1
    //   89: aload_3
    //   90: iconst_0
    //   91: iload_2
    //   92: invokevirtual 321	java/io/FileOutputStream:write	([BII)V
    //   95: goto -17 -> 78
    //   98: astore 4
    //   100: aload_0
    //   101: astore_3
    //   102: aload 4
    //   104: astore_0
    //   105: aload_3
    //   106: invokestatic 122	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   109: aload_1
    //   110: invokestatic 122	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   113: aload_0
    //   114: athrow
    //   115: aload_0
    //   116: invokestatic 122	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   119: aload_1
    //   120: invokestatic 122	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   123: return
    //   124: astore_0
    //   125: aconst_null
    //   126: astore_1
    //   127: goto -22 -> 105
    //   130: astore 4
    //   132: aconst_null
    //   133: astore_1
    //   134: aload_0
    //   135: astore_3
    //   136: aload 4
    //   138: astore_0
    //   139: goto -34 -> 105
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	paramFile1	File
    //   0	142	1	paramFile2	File
    //   83	9	2	i	int
    //   1	135	3	localObject1	Object
    //   32	16	4	localFile	File
    //   98	5	4	localObject2	Object
    //   130	7	4	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   72	78	98	finally
    //   78	84	98	finally
    //   88	95	98	finally
    //   53	62	124	finally
    //   62	72	130	finally
  }
  
  public static String m(File paramFile1, File paramFile2)
  {
    int i;
    if (ShareTinkerInternals.cqO()) {
      try
      {
        str = ShareTinkerInternals.cqP();
        File localFile = paramFile1.getParentFile();
        paramFile2 = paramFile1.getName();
        i = paramFile2.lastIndexOf('.');
        paramFile1 = paramFile2;
        if (i > 0) {
          paramFile1 = paramFile2.substring(0, i);
        }
        return localFile.getAbsolutePath() + "/oat/" + str + "/" + paramFile1 + ".odex";
      }
      catch (Exception paramFile1)
      {
        throw new TinkerRuntimeException("getCurrentInstructionSet fail:", paramFile1);
      }
    }
    String str = paramFile1.getName();
    paramFile1 = str;
    if (!str.endsWith(".dex"))
    {
      i = str.lastIndexOf(".");
      if (i >= 0) {
        break label160;
      }
    }
    for (paramFile1 = str + ".dex";; paramFile1 = paramFile1.toString())
    {
      return new File(paramFile2, paramFile1).getPath();
      label160:
      paramFile1 = new StringBuilder(i + 4);
      paramFile1.append(str, 0, i);
      paramFile1.append(".dex");
    }
  }
  
  private static String t(InputStream paramInputStream)
  {
    int i = 0;
    if (paramInputStream == null) {
      return null;
    }
    try
    {
      Object localObject = new BufferedInputStream(paramInputStream);
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      paramInputStream = new StringBuilder(32);
      byte[] arrayOfByte = new byte[102400];
      for (;;)
      {
        int j = ((BufferedInputStream)localObject).read(arrayOfByte);
        if (j == -1) {
          break;
        }
        localMessageDigest.update(arrayOfByte, 0, j);
      }
      localObject = localMessageDigest.digest();
      while (i < localObject.length)
      {
        paramInputStream.append(Integer.toString((localObject[i] & 0xFF) + 256, 16).substring(1));
        i += 1;
      }
      paramInputStream = paramInputStream.toString();
      return paramInputStream;
    }
    catch (Exception paramInputStream) {}
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\tinker\loader\shareutil\SharePatchFileUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */