package com.tencent.mm.compatible.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.InputStream;

public final class l
{
  static int fQl;
  static String fQm;
  
  static
  {
    GMTrace.i(13795703390208L, 102786);
    fQl = 0;
    fQm = null;
    GMTrace.o(13795703390208L, 102786);
  }
  
  public static int sK()
  {
    int m = 15;
    GMTrace.i(13795166519296L, 102782);
    int i;
    int j;
    int k;
    if (m.sR())
    {
      i = 7;
      j = i;
      if (p.fQB.fQo)
      {
        j = i;
        if (p.fQB.fQq == 0)
        {
          w.d("MicroMsg.CpuChecker", "disable armv6 by server ");
          j = i & 0xFFFFFFFD;
        }
      }
      k = j;
      if (p.fQB.fQo)
      {
        k = j;
        if (p.fQB.fQp == 0)
        {
          w.d("MicroMsg.CpuChecker", "disable armv7 by server ");
          k = j & 0xFFFFFFFB;
        }
      }
      i = m.sT();
      if (i <= 16) {
        break label191;
      }
      j = 15;
      label101:
      i = bg.getInt(sL(), 0) / 1000;
      if (j <= 4) {
        break label202;
      }
      i *= 4;
    }
    label122:
    label138:
    label191:
    label202:
    label242:
    label245:
    for (;;)
    {
      int n = i / 100;
      if (n > 30)
      {
        i = 30;
        if ((i > 5) || (j < 4)) {
          break label242;
        }
        i = m;
      }
      for (;;)
      {
        i = (k + (j << 4) << 8) + i;
        fQl = i;
        GMTrace.o(13795166519296L, 102782);
        return i;
        if (m.sS())
        {
          i = 3;
          break;
        }
        i = 1;
        break;
        j = i;
        if (i > 0) {
          break label101;
        }
        j = 1;
        break label101;
        if (j > 2)
        {
          i *= 2;
          break label122;
        }
        if (j <= 1) {
          break label245;
        }
        i = i * 3 >> 1;
        break label122;
        i = n;
        if (n >= 5) {
          break label138;
        }
        i = 5;
        break label138;
      }
    }
  }
  
  public static String sL()
  {
    GMTrace.i(13795300737024L, 102783);
    try
    {
      InputStream localInputStream = new ProcessBuilder(new String[] { "/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq" }).start().getInputStream();
      byte[] arrayOfByte = new byte[24];
      for (str1 = ""; localInputStream.read(arrayOfByte) != -1; str1 = str1 + new String(arrayOfByte)) {}
      localInputStream.close();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        String str1;
        w.printErrStackTrace("MicroMsg.CpuChecker", localIOException, "", new Object[0]);
        str2 = "0";
      }
      String str2 = str2.trim();
      GMTrace.o(13795300737024L, 102783);
      return str2;
    }
    if (str1.length() == 0)
    {
      GMTrace.o(13795300737024L, 102783);
      return "0";
    }
  }
  
  public static String sM()
  {
    GMTrace.i(13795434954752L, 102784);
    try
    {
      InputStream localInputStream = new ProcessBuilder(new String[] { "/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq" }).start().getInputStream();
      byte[] arrayOfByte = new byte[24];
      for (str1 = ""; localInputStream.read(arrayOfByte) != -1; str1 = str1 + new String(arrayOfByte)) {}
      localInputStream.close();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        String str1;
        w.printErrStackTrace("MicroMsg.CpuChecker", localIOException, "", new Object[0]);
        str2 = "0";
      }
      String str2 = str2.trim();
      GMTrace.o(13795434954752L, 102784);
      return str2;
    }
    if (str1.length() == 0)
    {
      GMTrace.o(13795434954752L, 102784);
      return "0";
    }
  }
  
  /* Error */
  public static String sN()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_1
    //   4: ldc2_w 158
    //   7: ldc -96
    //   9: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: new 162	java/io/FileReader
    //   15: dup
    //   16: ldc -92
    //   18: invokespecial 167	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   21: astore_0
    //   22: new 169	java/io/BufferedReader
    //   25: dup
    //   26: aload_0
    //   27: invokespecial 172	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   30: astore_2
    //   31: aload_2
    //   32: invokevirtual 175	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   35: astore_1
    //   36: aload_2
    //   37: invokevirtual 176	java/io/BufferedReader:close	()V
    //   40: aload_0
    //   41: invokevirtual 177	java/io/FileReader:close	()V
    //   44: aload_1
    //   45: invokevirtual 139	java/lang/String:length	()I
    //   48: ifne +90 -> 138
    //   51: ldc2_w 158
    //   54: ldc -96
    //   56: invokestatic 26	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   59: ldc -115
    //   61: areturn
    //   62: astore_3
    //   63: aconst_null
    //   64: astore_2
    //   65: aload_1
    //   66: astore_0
    //   67: aload_3
    //   68: astore_1
    //   69: ldc 55
    //   71: aload_1
    //   72: ldc 113
    //   74: iconst_0
    //   75: anewarray 4	java/lang/Object
    //   78: invokestatic 145	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   81: ldc -115
    //   83: astore_3
    //   84: aload_2
    //   85: ifnull +7 -> 92
    //   88: aload_2
    //   89: invokevirtual 176	java/io/BufferedReader:close	()V
    //   92: aload_3
    //   93: astore_1
    //   94: aload_0
    //   95: ifnull -51 -> 44
    //   98: aload_0
    //   99: invokevirtual 177	java/io/FileReader:close	()V
    //   102: aload_3
    //   103: astore_1
    //   104: goto -60 -> 44
    //   107: astore_0
    //   108: aload_3
    //   109: astore_1
    //   110: goto -66 -> 44
    //   113: astore_1
    //   114: aconst_null
    //   115: astore_3
    //   116: aload_2
    //   117: astore_0
    //   118: aload_3
    //   119: astore_2
    //   120: aload_2
    //   121: ifnull +7 -> 128
    //   124: aload_2
    //   125: invokevirtual 176	java/io/BufferedReader:close	()V
    //   128: aload_0
    //   129: ifnull +7 -> 136
    //   132: aload_0
    //   133: invokevirtual 177	java/io/FileReader:close	()V
    //   136: aload_1
    //   137: athrow
    //   138: aload_1
    //   139: invokevirtual 148	java/lang/String:trim	()Ljava/lang/String;
    //   142: astore_0
    //   143: ldc2_w 158
    //   146: ldc -96
    //   148: invokestatic 26	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   151: aload_0
    //   152: areturn
    //   153: astore_0
    //   154: goto -18 -> 136
    //   157: astore_1
    //   158: aconst_null
    //   159: astore_2
    //   160: goto -40 -> 120
    //   163: astore_1
    //   164: goto -44 -> 120
    //   167: astore_1
    //   168: goto -48 -> 120
    //   171: astore_1
    //   172: aconst_null
    //   173: astore_2
    //   174: goto -105 -> 69
    //   177: astore_1
    //   178: goto -109 -> 69
    //   181: astore_0
    //   182: goto -138 -> 44
    // Local variable table:
    //   start	length	slot	name	signature
    //   21	78	0	localObject1	Object
    //   107	1	0	localException1	Exception
    //   117	35	0	localObject2	Object
    //   153	1	0	localException2	Exception
    //   181	1	0	localException3	Exception
    //   3	107	1	localObject3	Object
    //   113	26	1	localObject4	Object
    //   157	1	1	localObject5	Object
    //   163	1	1	localObject6	Object
    //   167	1	1	localObject7	Object
    //   171	1	1	localException4	Exception
    //   177	1	1	localException5	Exception
    //   1	173	2	localObject8	Object
    //   62	6	3	localException6	Exception
    //   83	36	3	str	String
    // Exception table:
    //   from	to	target	type
    //   12	22	62	java/lang/Exception
    //   88	92	107	java/lang/Exception
    //   98	102	107	java/lang/Exception
    //   12	22	113	finally
    //   124	128	153	java/lang/Exception
    //   132	136	153	java/lang/Exception
    //   22	31	157	finally
    //   31	36	163	finally
    //   69	81	167	finally
    //   22	31	171	java/lang/Exception
    //   31	36	177	java/lang/Exception
    //   36	44	181	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\d\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */