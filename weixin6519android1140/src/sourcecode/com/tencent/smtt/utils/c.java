package com.tencent.smtt.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public final class c
{
  public static String aGO = "";
  public static String aKJ = "";
  public static String xYb = "";
  public static String xYc = "";
  public static String xYd = "";
  
  private static String M(File paramFile)
  {
    for (;;)
    {
      try
      {
        JarFile localJarFile = new JarFile(paramFile);
        paramFile = localJarFile.getJarEntry("AndroidManifest.xml");
        byte[] arrayOfByte = new byte[' '];
        String str1 = bE(a(localJarFile, paramFile, arrayOfByte)[0].getEncoded());
        Enumeration localEnumeration = localJarFile.entries();
        if (localEnumeration.hasMoreElements())
        {
          paramFile = (JarEntry)localEnumeration.nextElement();
          String str2 = paramFile.getName();
          if (str2 == null) {
            continue;
          }
          paramFile = a(localJarFile, paramFile, arrayOfByte);
          if (paramFile != null)
          {
            paramFile = bE(paramFile[0].getEncoded());
            if (paramFile == null)
            {
              if (str2.startsWith("META-INF/")) {
                continue;
              }
              return null;
            }
            boolean bool = paramFile.equals(str1);
            if (bool) {
              continue;
            }
            return null;
          }
        }
        else
        {
          return str1;
        }
      }
      catch (Exception paramFile)
      {
        return null;
      }
      paramFile = null;
    }
  }
  
  public static String W(Context paramContext)
  {
    if (!TextUtils.isEmpty(aGO)) {
      return aGO;
    }
    try
    {
      paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
      return paramContext;
    }
    catch (Exception paramContext) {}
    return "";
  }
  
  private static String Yg(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
  
  private static PackageInfo Yl(String paramString)
  {
    for (;;)
    {
      int i;
      try
      {
        Object localObject2 = Class.forName("android.content.pm.PackageParser");
        Object localObject1 = ((Class)localObject2).getDeclaredClasses();
        int j = localObject1.length;
        i = 0;
        if (i < j)
        {
          localMethod1 = localObject1[i];
          if (localMethod1.getName().compareTo("android.content.pm.PackageParser$Package") != 0) {
            break label327;
          }
          Object localObject3 = ((Class)localObject2).getConstructor(new Class[] { String.class });
          Method localMethod2 = ((Class)localObject2).getDeclaredMethod("parsePackage", new Class[] { File.class, String.class, DisplayMetrics.class, Integer.TYPE });
          localObject1 = ((Class)localObject2).getDeclaredMethod("collectCertificates", new Class[] { localMethod1, Integer.TYPE });
          localMethod1 = ((Class)localObject2).getDeclaredMethod("generatePackageInfo", new Class[] { localMethod1, int[].class, Integer.TYPE, Long.TYPE, Long.TYPE });
          ((Constructor)localObject3).setAccessible(true);
          localMethod2.setAccessible(true);
          ((Method)localObject1).setAccessible(true);
          localMethod1.setAccessible(true);
          localObject2 = ((Constructor)localObject3).newInstance(new Object[] { paramString });
          localObject3 = new DisplayMetrics();
          ((DisplayMetrics)localObject3).setToDefaults();
          paramString = localMethod2.invoke(localObject2, new Object[] { new File(paramString), paramString, localObject3, Integer.valueOf(0) });
          if (paramString == null) {
            return null;
          }
          ((Method)localObject1).invoke(localObject2, new Object[] { paramString, Integer.valueOf(0) });
          paramString = (PackageInfo)localMethod1.invoke(null, new Object[] { paramString, null, Integer.valueOf(65), Integer.valueOf(0), Integer.valueOf(0) });
          return paramString;
        }
      }
      catch (Exception paramString)
      {
        return null;
      }
      Method localMethod1 = null;
      continue;
      label327:
      i += 1;
    }
  }
  
  private static Certificate[] a(JarFile paramJarFile, JarEntry paramJarEntry, byte[] paramArrayOfByte)
  {
    paramJarFile = paramJarFile.getInputStream(paramJarEntry);
    while (paramJarFile.read(paramArrayOfByte, 0, 8192) != -1) {}
    paramJarFile.close();
    if (paramJarEntry != null) {
      return paramJarEntry.getCertificates();
    }
    return null;
  }
  
  private static String b(Context paramContext, File paramFile, boolean paramBoolean)
  {
    Object localObject = null;
    if (paramBoolean)
    {
      paramContext = Yl(paramFile.getAbsolutePath());
      if (paramContext == null) {
        break label77;
      }
      if ((paramContext.signatures == null) || (paramContext.signatures.length <= 0)) {
        break label70;
      }
    }
    label70:
    label77:
    for (paramContext = paramContext.signatures[0];; paramContext = null)
    {
      paramFile = (File)localObject;
      if (paramContext != null) {
        paramFile = paramContext.toCharsString();
      }
      return paramFile;
      paramContext = paramContext.getPackageManager().getPackageArchiveInfo(paramFile.getAbsolutePath(), 65);
      break;
      TbsLog.w("AppUtil", "[getSignatureFromApk] pkgInfo is not null BUT signatures is null!");
    }
  }
  
  private static String bE(byte[] paramArrayOfByte)
  {
    int k = paramArrayOfByte.length;
    char[] arrayOfChar = new char[k * 2];
    int i = 0;
    if (i < k)
    {
      int m = paramArrayOfByte[i];
      int j = m >> 4 & 0xF;
      if (j >= 10)
      {
        j = j + 97 - 10;
        label44:
        arrayOfChar[(i * 2)] = ((char)j);
        j = m & 0xF;
        if (j < 10) {
          break label97;
        }
        j = j + 97 - 10;
      }
      for (;;)
      {
        arrayOfChar[(i * 2 + 1)] = ((char)j);
        i += 1;
        break;
        j += 48;
        break label44;
        label97:
        j += 48;
      }
    }
    return new String(arrayOfChar);
  }
  
  /* Error */
  public static String bG(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 252	android/content/Context:getPackageName	()Ljava/lang/String;
    //   4: astore_2
    //   5: aload_0
    //   6: invokevirtual 228	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   9: aload_2
    //   10: sipush 128
    //   13: invokevirtual 256	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   16: getfield 262	android/content/pm/ApplicationInfo:metaData	Landroid/os/Bundle;
    //   19: aload_1
    //   20: invokevirtual 267	android/os/Bundle:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   23: invokestatic 270	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   26: astore_0
    //   27: aload_0
    //   28: invokestatic 273	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   31: invokestatic 277	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   34: invokestatic 270	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   37: astore_1
    //   38: aload_1
    //   39: areturn
    //   40: astore_0
    //   41: aconst_null
    //   42: areturn
    //   43: astore_1
    //   44: aload_0
    //   45: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	46	0	paramContext	Context
    //   0	46	1	paramString	String
    //   4	6	2	str	String
    // Exception table:
    //   from	to	target	type
    //   0	27	40	java/lang/Exception
    //   27	38	43	java/lang/Exception
  }
  
  /* Error */
  public static String cpb()
  {
    // Byte code:
    //   0: getstatic 20	com/tencent/smtt/utils/c:xYc	Ljava/lang/String;
    //   3: invokestatic 95	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   6: ifne +9 -> 15
    //   9: getstatic 20	com/tencent/smtt/utils/c:xYc	Ljava/lang/String;
    //   12: astore_0
    //   13: aload_0
    //   14: areturn
    //   15: new 284	java/io/InputStreamReader
    //   18: dup
    //   19: invokestatic 290	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   22: ldc_w 292
    //   25: invokevirtual 296	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   28: invokevirtual 301	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   31: invokespecial 304	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   34: astore_1
    //   35: new 306	java/io/BufferedReader
    //   38: dup
    //   39: aload_1
    //   40: invokespecial 309	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   43: astore_0
    //   44: aload_0
    //   45: astore_3
    //   46: aload_1
    //   47: astore_2
    //   48: aload_0
    //   49: invokevirtual 312	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   52: ldc_w 314
    //   55: invokevirtual 317	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   58: ifeq +31 -> 89
    //   61: aload_0
    //   62: astore_3
    //   63: aload_1
    //   64: astore_2
    //   65: ldc_w 319
    //   68: invokestatic 321	com/tencent/smtt/utils/c:Yg	(Ljava/lang/String;)Ljava/lang/String;
    //   71: astore 4
    //   73: aload 4
    //   75: astore_2
    //   76: aload_0
    //   77: invokevirtual 322	java/io/BufferedReader:close	()V
    //   80: aload_1
    //   81: invokevirtual 323	java/io/InputStreamReader:close	()V
    //   84: aload_2
    //   85: areturn
    //   86: astore_0
    //   87: aload_2
    //   88: areturn
    //   89: aload_0
    //   90: astore_3
    //   91: aload_1
    //   92: astore_2
    //   93: ldc_w 325
    //   96: invokestatic 330	java/lang/System:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   99: invokestatic 321	com/tencent/smtt/utils/c:Yg	(Ljava/lang/String;)Ljava/lang/String;
    //   102: astore 4
    //   104: aload 4
    //   106: astore_2
    //   107: goto -31 -> 76
    //   110: astore_0
    //   111: aconst_null
    //   112: astore_0
    //   113: aconst_null
    //   114: astore_1
    //   115: aload_0
    //   116: astore_3
    //   117: aload_1
    //   118: astore_2
    //   119: ldc_w 325
    //   122: invokestatic 330	java/lang/System:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   125: invokestatic 321	com/tencent/smtt/utils/c:Yg	(Ljava/lang/String;)Ljava/lang/String;
    //   128: astore 4
    //   130: aload 4
    //   132: astore_2
    //   133: aload_0
    //   134: ifnull +7 -> 141
    //   137: aload_0
    //   138: invokevirtual 322	java/io/BufferedReader:close	()V
    //   141: aload_2
    //   142: astore_0
    //   143: aload_1
    //   144: ifnull -131 -> 13
    //   147: aload_1
    //   148: invokevirtual 323	java/io/InputStreamReader:close	()V
    //   151: aload_2
    //   152: areturn
    //   153: astore_0
    //   154: aload_2
    //   155: areturn
    //   156: astore_0
    //   157: aconst_null
    //   158: astore_1
    //   159: aconst_null
    //   160: astore_3
    //   161: aload_3
    //   162: ifnull +7 -> 169
    //   165: aload_3
    //   166: invokevirtual 322	java/io/BufferedReader:close	()V
    //   169: aload_1
    //   170: ifnull +7 -> 177
    //   173: aload_1
    //   174: invokevirtual 323	java/io/InputStreamReader:close	()V
    //   177: aload_0
    //   178: athrow
    //   179: astore_0
    //   180: goto -100 -> 80
    //   183: astore_0
    //   184: goto -43 -> 141
    //   187: astore_2
    //   188: goto -19 -> 169
    //   191: astore_1
    //   192: goto -15 -> 177
    //   195: astore_0
    //   196: aconst_null
    //   197: astore_3
    //   198: goto -37 -> 161
    //   201: astore_0
    //   202: aload_2
    //   203: astore_1
    //   204: goto -43 -> 161
    //   207: astore_0
    //   208: aconst_null
    //   209: astore_0
    //   210: goto -95 -> 115
    //   213: astore_2
    //   214: goto -99 -> 115
    // Local variable table:
    //   start	length	slot	name	signature
    //   12	65	0	localObject1	Object
    //   86	4	0	localIOException1	java.io.IOException
    //   110	1	0	localThrowable1	Throwable
    //   112	31	0	localObject2	Object
    //   153	1	0	localIOException2	java.io.IOException
    //   156	22	0	localObject3	Object
    //   179	1	0	localIOException3	java.io.IOException
    //   183	1	0	localIOException4	java.io.IOException
    //   195	1	0	localObject4	Object
    //   201	1	0	localObject5	Object
    //   207	1	0	localThrowable2	Throwable
    //   209	1	0	localObject6	Object
    //   34	140	1	localInputStreamReader	java.io.InputStreamReader
    //   191	1	1	localIOException5	java.io.IOException
    //   203	1	1	localObject7	Object
    //   47	108	2	localObject8	Object
    //   187	16	2	localIOException6	java.io.IOException
    //   213	1	2	localThrowable3	Throwable
    //   45	153	3	localObject9	Object
    //   71	60	4	str	String
    // Exception table:
    //   from	to	target	type
    //   80	84	86	java/io/IOException
    //   15	35	110	java/lang/Throwable
    //   147	151	153	java/io/IOException
    //   15	35	156	finally
    //   76	80	179	java/io/IOException
    //   137	141	183	java/io/IOException
    //   165	169	187	java/io/IOException
    //   173	177	191	java/io/IOException
    //   35	44	195	finally
    //   48	61	201	finally
    //   65	73	201	finally
    //   93	104	201	finally
    //   119	130	201	finally
    //   35	44	207	java/lang/Throwable
    //   48	61	213	java/lang/Throwable
    //   65	73	213	java/lang/Throwable
    //   93	104	213	java/lang/Throwable
  }
  
  public static String d(Context paramContext, File paramFile)
  {
    Object localObject2 = b(paramContext, paramFile, false);
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = M(paramFile);
    }
    localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = b(paramContext, paramFile, true);
    }
    return (String)localObject2;
  }
  
  public static int getAppVersionCode(Context paramContext)
  {
    try
    {
      String str = paramContext.getPackageName();
      int i = paramContext.getPackageManager().getPackageInfo(str, 0).versionCode;
      return i;
    }
    catch (Exception paramContext) {}
    return 0;
  }
  
  public static String getAppVersionName(Context paramContext)
  {
    try
    {
      String str = paramContext.getPackageName();
      paramContext = paramContext.getPackageManager().getPackageInfo(str, 0).versionName;
      return paramContext;
    }
    catch (Exception paramContext) {}
    return null;
  }
  
  public static String hq(Context paramContext)
  {
    if (!TextUtils.isEmpty(xYb)) {
      return xYb;
    }
    try
    {
      paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getSubscriberId();
      return paramContext;
    }
    catch (Exception paramContext) {}
    return "";
  }
  
  public static String hr(Context paramContext)
  {
    if (!TextUtils.isEmpty(aKJ)) {
      return aKJ;
    }
    do
    {
      try
      {
        paramContext = (WifiManager)paramContext.getApplicationContext().getSystemService("wifi");
        if (paramContext == null) {
          paramContext = null;
        } else {
          paramContext = paramContext.getConnectionInfo();
        }
      }
      catch (Exception paramContext)
      {
        return "";
      }
      paramContext = paramContext.getMacAddress();
      return paramContext;
    } while (paramContext != null);
    return "";
  }
  
  public static String hs(Context paramContext)
  {
    if (!TextUtils.isEmpty(xYd)) {
      return xYd;
    }
    try
    {
      xYd = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
      return xYd;
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\utils\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */