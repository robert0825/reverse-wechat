package com.tencent.mm.compatible.d;

import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.io.FileFilter;
import java.util.Map;
import java.util.regex.Pattern;

public final class m
{
  private static Map<String, String> fQn;
  
  static
  {
    GMTrace.i(13798656180224L, 102808);
    fQn = null;
    GMTrace.o(13798656180224L, 102808);
  }
  
  private static String b(Map<String, String> paramMap, String paramString)
  {
    GMTrace.i(13798387744768L, 102806);
    paramMap = (String)paramMap.get(paramString);
    GMTrace.o(13798387744768L, 102806);
    return paramMap;
  }
  
  private static String dM(String paramString)
  {
    GMTrace.i(13798119309312L, 102804);
    Object localObject = paramString;
    if (paramString != null)
    {
      String str = paramString;
      localObject = paramString;
      try
      {
        if (paramString.length() > 0) {
          for (;;)
          {
            str = paramString;
            localObject = paramString;
            if (e(paramString.charAt(0))) {
              break;
            }
            str = paramString;
            int i = paramString.length();
            if (i == 1)
            {
              GMTrace.o(13798119309312L, 102804);
              return null;
            }
            str = paramString;
            paramString = paramString.substring(1);
          }
        }
        GMTrace.o(13798119309312L, 102804);
      }
      catch (Exception paramString)
      {
        w.printErrStackTrace("CpuFeatures", paramString, "", new Object[0]);
        localObject = str;
      }
    }
    return (String)localObject;
  }
  
  private static String dN(String paramString)
  {
    GMTrace.i(13798253527040L, 102805);
    int j;
    for (int i = 0;; i = j)
    {
      j = i + 1;
      try
      {
        if ((!e(paramString.charAt(i))) || (paramString.length() <= j))
        {
          i = j - 1;
          String str = paramString;
          if (paramString.length() > i + 1)
          {
            str = paramString;
            if (i > 0) {
              str = paramString.substring(0, i);
            }
          }
          GMTrace.o(13798253527040L, 102805);
          return str;
        }
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("CpuFeatures", localException, "", new Object[0]);
        GMTrace.o(13798253527040L, 102805);
        return paramString;
      }
    }
  }
  
  private static boolean e(char paramChar)
  {
    GMTrace.i(13797985091584L, 102803);
    if ((paramChar >= '0') && (paramChar <= '9'))
    {
      GMTrace.o(13797985091584L, 102803);
      return true;
    }
    GMTrace.o(13797985091584L, 102803);
    return false;
  }
  
  public static Map<String, String> sO()
  {
    GMTrace.i(13797179785216L, 102797);
    if (fQn == null) {
      fQn = sU();
    }
    Map localMap = fQn;
    GMTrace.o(13797179785216L, 102797);
    return localMap;
  }
  
  public static String sP()
  {
    GMTrace.i(13797314002944L, 102798);
    if (fQn == null) {
      fQn = sU();
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(": ");
    ((StringBuilder)localObject).append(b(fQn, "Features"));
    ((StringBuilder)localObject).append(": ");
    ((StringBuilder)localObject).append(b(fQn, "Processor"));
    ((StringBuilder)localObject).append(": ");
    ((StringBuilder)localObject).append(b(fQn, "CPU architecture"));
    ((StringBuilder)localObject).append(": ");
    ((StringBuilder)localObject).append(b(fQn, "Hardware"));
    ((StringBuilder)localObject).append(": ");
    ((StringBuilder)localObject).append(b(fQn, "Serial"));
    localObject = ((StringBuilder)localObject).toString();
    GMTrace.o(13797314002944L, 102798);
    return (String)localObject;
  }
  
  public static boolean sQ()
  {
    GMTrace.i(13797448220672L, 102799);
    if (fQn == null) {
      fQn = sU();
    }
    if (fQn != null)
    {
      String str = b(fQn, "Features");
      if ((str != null) && (str.contains("neon")))
      {
        GMTrace.o(13797448220672L, 102799);
        return true;
      }
      if ((str != null) && (str.contains("asimd")))
      {
        GMTrace.o(13797448220672L, 102799);
        return true;
      }
    }
    GMTrace.o(13797448220672L, 102799);
    return false;
  }
  
  public static boolean sR()
  {
    GMTrace.i(13797582438400L, 102800);
    try
    {
      if (Build.VERSION.SDK_INT >= 4) {}
      for (int i = 1; (i != 0) && (sQ()); i = 0)
      {
        GMTrace.o(13797582438400L, 102800);
        return true;
      }
      GMTrace.o(13797582438400L, 102800);
      return false;
    }
    catch (IncompatibleClassChangeError localIncompatibleClassChangeError)
    {
      w.printErrStackTrace("MicroMsg.Crash", localIncompatibleClassChangeError, "May cause dvmFindCatchBlock crash!", new Object[0]);
      throw ((IncompatibleClassChangeError)new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(localIncompatibleClassChangeError));
    }
    catch (Throwable localThrowable)
    {
      GMTrace.o(13797582438400L, 102800);
    }
    return false;
  }
  
  public static boolean sS()
  {
    GMTrace.i(13797716656128L, 102801);
    if (fQn == null) {
      fQn = sU();
    }
    if (fQn != null)
    {
      String str = b(fQn, "CPU architecture");
      w.d("CpuFeatures", "arch " + str);
      if (str != null) {
        try
        {
          if (str.length() > 0)
          {
            int i = bg.getInt(dN(dM(str)), 0);
            w.d("CpuFeatures", "armarch " + i);
            if (i >= 6)
            {
              GMTrace.o(13797716656128L, 102801);
              return true;
            }
          }
        }
        catch (Exception localException)
        {
          w.printErrStackTrace("CpuFeatures", localException, "", new Object[0]);
        }
      }
    }
    GMTrace.o(13797716656128L, 102801);
    return false;
  }
  
  public static int sT()
  {
    GMTrace.i(13797850873856L, 102802);
    try
    {
      int i = new File("/sys/devices/system/cpu/").listFiles(new a()).length;
      GMTrace.o(13797850873856L, 102802);
      return i;
    }
    catch (Exception localException)
    {
      GMTrace.o(13797850873856L, 102802);
    }
    return 1;
  }
  
  /* Error */
  public static java.util.HashMap<String, String> sU()
  {
    // Byte code:
    //   0: ldc2_w 209
    //   3: ldc -45
    //   5: invokestatic 21	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 213	java/util/HashMap
    //   11: dup
    //   12: invokespecial 214	java/util/HashMap:<init>	()V
    //   15: astore_3
    //   16: aconst_null
    //   17: astore_1
    //   18: aconst_null
    //   19: astore_0
    //   20: new 216	java/lang/ProcessBuilder
    //   23: dup
    //   24: iconst_2
    //   25: anewarray 40	java/lang/String
    //   28: dup
    //   29: iconst_0
    //   30: ldc -38
    //   32: aastore
    //   33: dup
    //   34: iconst_1
    //   35: ldc -36
    //   37: aastore
    //   38: invokespecial 223	java/lang/ProcessBuilder:<init>	([Ljava/lang/String;)V
    //   41: invokevirtual 227	java/lang/ProcessBuilder:start	()Ljava/lang/Process;
    //   44: invokevirtual 233	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   47: astore_2
    //   48: aload_2
    //   49: astore_0
    //   50: aload_2
    //   51: astore_1
    //   52: new 235	java/io/BufferedReader
    //   55: dup
    //   56: new 237	java/io/InputStreamReader
    //   59: dup
    //   60: aload_2
    //   61: invokespecial 240	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   64: invokespecial 243	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   67: astore 4
    //   69: aload_2
    //   70: astore_0
    //   71: aload_2
    //   72: astore_1
    //   73: aload 4
    //   75: invokevirtual 246	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   78: astore 5
    //   80: aload 5
    //   82: ifnull +122 -> 204
    //   85: aload_2
    //   86: astore_0
    //   87: aload_2
    //   88: astore_1
    //   89: aload 5
    //   91: ldc -8
    //   93: iconst_2
    //   94: invokevirtual 252	java/lang/String:split	(Ljava/lang/String;I)[Ljava/lang/String;
    //   97: astore 6
    //   99: aload 6
    //   101: ifnull -32 -> 69
    //   104: aload_2
    //   105: astore_0
    //   106: aload_2
    //   107: astore_1
    //   108: aload 6
    //   110: arraylength
    //   111: iconst_2
    //   112: if_icmplt -43 -> 69
    //   115: aload_2
    //   116: astore_0
    //   117: aload_2
    //   118: astore_1
    //   119: aload 6
    //   121: iconst_0
    //   122: aaload
    //   123: invokevirtual 255	java/lang/String:trim	()Ljava/lang/String;
    //   126: astore 5
    //   128: aload_2
    //   129: astore_0
    //   130: aload_2
    //   131: astore_1
    //   132: aload 6
    //   134: iconst_1
    //   135: aaload
    //   136: invokevirtual 255	java/lang/String:trim	()Ljava/lang/String;
    //   139: astore 6
    //   141: aload_2
    //   142: astore_0
    //   143: aload_2
    //   144: astore_1
    //   145: aload_3
    //   146: aload 5
    //   148: invokevirtual 256	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   151: ifnonnull -82 -> 69
    //   154: aload_2
    //   155: astore_0
    //   156: aload_2
    //   157: astore_1
    //   158: aload_3
    //   159: aload 5
    //   161: aload 6
    //   163: invokevirtual 260	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   166: pop
    //   167: goto -98 -> 69
    //   170: astore_2
    //   171: aload_0
    //   172: astore_1
    //   173: ldc 67
    //   175: aload_2
    //   176: ldc_w 262
    //   179: iconst_0
    //   180: anewarray 4	java/lang/Object
    //   183: invokestatic 75	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   186: aload_0
    //   187: ifnull +7 -> 194
    //   190: aload_0
    //   191: invokevirtual 267	java/io/InputStream:close	()V
    //   194: ldc2_w 209
    //   197: ldc -45
    //   199: invokestatic 26	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   202: aload_3
    //   203: areturn
    //   204: aload_2
    //   205: ifnull -11 -> 194
    //   208: aload_2
    //   209: invokevirtual 267	java/io/InputStream:close	()V
    //   212: goto -18 -> 194
    //   215: astore_0
    //   216: goto -22 -> 194
    //   219: astore_0
    //   220: aload_1
    //   221: ifnull +7 -> 228
    //   224: aload_1
    //   225: invokevirtual 267	java/io/InputStream:close	()V
    //   228: aload_0
    //   229: athrow
    //   230: astore_0
    //   231: goto -37 -> 194
    //   234: astore_1
    //   235: goto -7 -> 228
    // Local variable table:
    //   start	length	slot	name	signature
    //   19	172	0	localObject1	Object
    //   215	1	0	localIOException1	java.io.IOException
    //   219	10	0	localObject2	Object
    //   230	1	0	localIOException2	java.io.IOException
    //   17	208	1	localObject3	Object
    //   234	1	1	localIOException3	java.io.IOException
    //   47	110	2	localInputStream	java.io.InputStream
    //   170	39	2	localIOException4	java.io.IOException
    //   15	188	3	localHashMap	java.util.HashMap
    //   67	7	4	localBufferedReader	java.io.BufferedReader
    //   78	82	5	str	String
    //   97	65	6	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   20	48	170	java/io/IOException
    //   52	69	170	java/io/IOException
    //   73	80	170	java/io/IOException
    //   89	99	170	java/io/IOException
    //   108	115	170	java/io/IOException
    //   119	128	170	java/io/IOException
    //   132	141	170	java/io/IOException
    //   145	154	170	java/io/IOException
    //   158	167	170	java/io/IOException
    //   208	212	215	java/io/IOException
    //   20	48	219	finally
    //   52	69	219	finally
    //   73	80	219	finally
    //   89	99	219	finally
    //   108	115	219	finally
    //   119	128	219	finally
    //   132	141	219	finally
    //   145	154	219	finally
    //   158	167	219	finally
    //   173	186	219	finally
    //   190	194	230	java/io/IOException
    //   224	228	234	java/io/IOException
  }
  
  final class a
    implements FileFilter
  {
    a()
    {
      GMTrace.i(13801072099328L, 102826);
      GMTrace.o(13801072099328L, 102826);
    }
    
    public final boolean accept(File paramFile)
    {
      GMTrace.i(13801206317056L, 102827);
      if (Pattern.matches("cpu[0-9]", paramFile.getName()))
      {
        GMTrace.o(13801206317056L, 102827);
        return true;
      }
      GMTrace.o(13801206317056L, 102827);
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\d\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */