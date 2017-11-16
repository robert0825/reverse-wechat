package com.tencent.mm.bk;

import android.content.Context;
import android.content.res.Resources;
import android.os.StatFs;
import android.util.DisplayMetrics;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import java.io.File;

public final class c
{
  private static String PZ(String paramString)
  {
    GMTrace.i(13044889419776L, 97192);
    if (bg.nm(paramString))
    {
      GMTrace.o(13044889419776L, 97192);
      return "";
    }
    paramString = paramString.replaceAll(" ", "").trim().replaceAll("kB", "").trim().replaceAll("\\t", "").trim();
    GMTrace.o(13044889419776L, 97192);
    return paramString;
  }
  
  /* Error */
  public static String bNC()
  {
    // Byte code:
    //   0: ldc2_w 47
    //   3: ldc 49
    //   5: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 51	java/lang/ProcessBuilder
    //   11: dup
    //   12: iconst_2
    //   13: anewarray 30	java/lang/String
    //   16: dup
    //   17: iconst_0
    //   18: ldc 53
    //   20: aastore
    //   21: dup
    //   22: iconst_1
    //   23: ldc 55
    //   25: aastore
    //   26: invokespecial 59	java/lang/ProcessBuilder:<init>	([Ljava/lang/String;)V
    //   29: invokevirtual 63	java/lang/ProcessBuilder:start	()Ljava/lang/Process;
    //   32: invokevirtual 69	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   35: astore_1
    //   36: aload_1
    //   37: astore_2
    //   38: new 71	java/io/BufferedReader
    //   41: dup
    //   42: new 73	java/io/InputStreamReader
    //   45: dup
    //   46: aload_1
    //   47: invokespecial 76	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   50: invokespecial 79	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   53: astore 4
    //   55: ldc 26
    //   57: astore_0
    //   58: aload_1
    //   59: astore_2
    //   60: aload 4
    //   62: invokevirtual 82	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   65: astore_3
    //   66: aload_3
    //   67: ifnull +46 -> 113
    //   70: aload_1
    //   71: astore_2
    //   72: aload_3
    //   73: invokestatic 21	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   76: ifne -18 -> 58
    //   79: aload_1
    //   80: astore_2
    //   81: new 84	java/lang/StringBuilder
    //   84: dup
    //   85: invokespecial 87	java/lang/StringBuilder:<init>	()V
    //   88: aload_0
    //   89: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: aload_3
    //   93: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: ldc 93
    //   98: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: invokevirtual 96	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   104: invokestatic 98	com/tencent/mm/bk/c:PZ	(Ljava/lang/String;)Ljava/lang/String;
    //   107: astore_3
    //   108: aload_3
    //   109: astore_0
    //   110: goto -52 -> 58
    //   113: aload_0
    //   114: astore_2
    //   115: aload_1
    //   116: ifnull +9 -> 125
    //   119: aload_1
    //   120: invokevirtual 103	java/io/InputStream:close	()V
    //   123: aload_0
    //   124: astore_2
    //   125: aload_2
    //   126: ldc 105
    //   128: ldc 107
    //   130: invokevirtual 111	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   133: astore_0
    //   134: ldc2_w 47
    //   137: ldc 49
    //   139: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   142: aload_0
    //   143: areturn
    //   144: astore_1
    //   145: ldc 113
    //   147: ldc 115
    //   149: iconst_1
    //   150: anewarray 4	java/lang/Object
    //   153: dup
    //   154: iconst_0
    //   155: aload_1
    //   156: invokestatic 119	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   159: aastore
    //   160: invokestatic 125	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   163: aload_0
    //   164: astore_2
    //   165: goto -40 -> 125
    //   168: astore_3
    //   169: aconst_null
    //   170: astore_1
    //   171: ldc 26
    //   173: astore_0
    //   174: aload_1
    //   175: astore_2
    //   176: ldc 113
    //   178: ldc 115
    //   180: iconst_1
    //   181: anewarray 4	java/lang/Object
    //   184: dup
    //   185: iconst_0
    //   186: aload_3
    //   187: invokestatic 119	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   190: aastore
    //   191: invokestatic 125	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   194: aload_0
    //   195: astore_2
    //   196: aload_1
    //   197: ifnull -72 -> 125
    //   200: aload_1
    //   201: invokevirtual 103	java/io/InputStream:close	()V
    //   204: aload_0
    //   205: astore_2
    //   206: goto -81 -> 125
    //   209: astore_1
    //   210: ldc 113
    //   212: ldc 115
    //   214: iconst_1
    //   215: anewarray 4	java/lang/Object
    //   218: dup
    //   219: iconst_0
    //   220: aload_1
    //   221: invokestatic 119	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   224: aastore
    //   225: invokestatic 125	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   228: aload_0
    //   229: astore_2
    //   230: goto -105 -> 125
    //   233: astore_0
    //   234: aconst_null
    //   235: astore_2
    //   236: aload_2
    //   237: ifnull +7 -> 244
    //   240: aload_2
    //   241: invokevirtual 103	java/io/InputStream:close	()V
    //   244: aload_0
    //   245: athrow
    //   246: astore_1
    //   247: ldc 113
    //   249: ldc 115
    //   251: iconst_1
    //   252: anewarray 4	java/lang/Object
    //   255: dup
    //   256: iconst_0
    //   257: aload_1
    //   258: invokestatic 119	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   261: aastore
    //   262: invokestatic 125	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   265: goto -21 -> 244
    //   268: astore_0
    //   269: goto -33 -> 236
    //   272: astore_3
    //   273: ldc 26
    //   275: astore_0
    //   276: goto -102 -> 174
    //   279: astore_3
    //   280: goto -106 -> 174
    // Local variable table:
    //   start	length	slot	name	signature
    //   57	172	0	localObject1	Object
    //   233	12	0	localObject2	Object
    //   268	1	0	localObject3	Object
    //   275	1	0	str1	String
    //   35	85	1	localInputStream	java.io.InputStream
    //   144	12	1	localIOException1	java.io.IOException
    //   170	31	1	localObject4	Object
    //   209	12	1	localIOException2	java.io.IOException
    //   246	12	1	localIOException3	java.io.IOException
    //   37	204	2	localObject5	Object
    //   65	44	3	str2	String
    //   168	19	3	localIOException4	java.io.IOException
    //   272	1	3	localIOException5	java.io.IOException
    //   279	1	3	localIOException6	java.io.IOException
    //   53	8	4	localBufferedReader	java.io.BufferedReader
    // Exception table:
    //   from	to	target	type
    //   119	123	144	java/io/IOException
    //   8	36	168	java/io/IOException
    //   200	204	209	java/io/IOException
    //   8	36	233	finally
    //   240	244	246	java/io/IOException
    //   38	55	268	finally
    //   60	66	268	finally
    //   72	79	268	finally
    //   81	108	268	finally
    //   176	194	268	finally
    //   38	55	272	java/io/IOException
    //   60	66	279	java/io/IOException
    //   72	79	279	java/io/IOException
    //   81	108	279	java/io/IOException
  }
  
  /* Error */
  public static String bND()
  {
    // Byte code:
    //   0: ldc2_w 127
    //   3: ldc -127
    //   5: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 51	java/lang/ProcessBuilder
    //   11: dup
    //   12: iconst_2
    //   13: anewarray 30	java/lang/String
    //   16: dup
    //   17: iconst_0
    //   18: ldc 53
    //   20: aastore
    //   21: dup
    //   22: iconst_1
    //   23: ldc -125
    //   25: aastore
    //   26: invokespecial 59	java/lang/ProcessBuilder:<init>	([Ljava/lang/String;)V
    //   29: invokevirtual 63	java/lang/ProcessBuilder:start	()Ljava/lang/Process;
    //   32: invokevirtual 69	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   35: astore_1
    //   36: aload_1
    //   37: astore_2
    //   38: new 71	java/io/BufferedReader
    //   41: dup
    //   42: new 73	java/io/InputStreamReader
    //   45: dup
    //   46: aload_1
    //   47: invokespecial 76	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   50: invokespecial 79	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   53: astore 4
    //   55: ldc 26
    //   57: astore_0
    //   58: aload_1
    //   59: astore_2
    //   60: aload 4
    //   62: invokevirtual 82	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   65: astore_3
    //   66: aload_3
    //   67: ifnull +46 -> 113
    //   70: aload_1
    //   71: astore_2
    //   72: aload_3
    //   73: invokestatic 21	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   76: ifne -18 -> 58
    //   79: aload_1
    //   80: astore_2
    //   81: new 84	java/lang/StringBuilder
    //   84: dup
    //   85: invokespecial 87	java/lang/StringBuilder:<init>	()V
    //   88: aload_0
    //   89: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: aload_3
    //   93: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: ldc 93
    //   98: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: invokevirtual 96	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   104: invokestatic 98	com/tencent/mm/bk/c:PZ	(Ljava/lang/String;)Ljava/lang/String;
    //   107: astore_3
    //   108: aload_3
    //   109: astore_0
    //   110: goto -52 -> 58
    //   113: aload_0
    //   114: astore_2
    //   115: aload_1
    //   116: ifnull +9 -> 125
    //   119: aload_1
    //   120: invokevirtual 103	java/io/InputStream:close	()V
    //   123: aload_0
    //   124: astore_2
    //   125: aload_2
    //   126: ldc 105
    //   128: ldc 107
    //   130: invokevirtual 111	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   133: astore_0
    //   134: ldc2_w 127
    //   137: ldc -127
    //   139: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   142: aload_0
    //   143: areturn
    //   144: astore_1
    //   145: ldc 113
    //   147: ldc 115
    //   149: iconst_1
    //   150: anewarray 4	java/lang/Object
    //   153: dup
    //   154: iconst_0
    //   155: aload_1
    //   156: invokestatic 119	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   159: aastore
    //   160: invokestatic 125	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   163: aload_0
    //   164: astore_2
    //   165: goto -40 -> 125
    //   168: astore_3
    //   169: aconst_null
    //   170: astore_1
    //   171: ldc 26
    //   173: astore_0
    //   174: aload_1
    //   175: astore_2
    //   176: ldc 113
    //   178: ldc 115
    //   180: iconst_1
    //   181: anewarray 4	java/lang/Object
    //   184: dup
    //   185: iconst_0
    //   186: aload_3
    //   187: invokestatic 119	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   190: aastore
    //   191: invokestatic 125	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   194: aload_0
    //   195: astore_2
    //   196: aload_1
    //   197: ifnull -72 -> 125
    //   200: aload_1
    //   201: invokevirtual 103	java/io/InputStream:close	()V
    //   204: aload_0
    //   205: astore_2
    //   206: goto -81 -> 125
    //   209: astore_1
    //   210: ldc 113
    //   212: ldc 115
    //   214: iconst_1
    //   215: anewarray 4	java/lang/Object
    //   218: dup
    //   219: iconst_0
    //   220: aload_1
    //   221: invokestatic 119	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   224: aastore
    //   225: invokestatic 125	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   228: aload_0
    //   229: astore_2
    //   230: goto -105 -> 125
    //   233: astore_0
    //   234: aconst_null
    //   235: astore_2
    //   236: aload_2
    //   237: ifnull +7 -> 244
    //   240: aload_2
    //   241: invokevirtual 103	java/io/InputStream:close	()V
    //   244: aload_0
    //   245: athrow
    //   246: astore_1
    //   247: ldc 113
    //   249: ldc 115
    //   251: iconst_1
    //   252: anewarray 4	java/lang/Object
    //   255: dup
    //   256: iconst_0
    //   257: aload_1
    //   258: invokestatic 119	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   261: aastore
    //   262: invokestatic 125	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   265: goto -21 -> 244
    //   268: astore_0
    //   269: goto -33 -> 236
    //   272: astore_3
    //   273: ldc 26
    //   275: astore_0
    //   276: goto -102 -> 174
    //   279: astore_3
    //   280: goto -106 -> 174
    // Local variable table:
    //   start	length	slot	name	signature
    //   57	172	0	localObject1	Object
    //   233	12	0	localObject2	Object
    //   268	1	0	localObject3	Object
    //   275	1	0	str1	String
    //   35	85	1	localInputStream	java.io.InputStream
    //   144	12	1	localIOException1	java.io.IOException
    //   170	31	1	localObject4	Object
    //   209	12	1	localIOException2	java.io.IOException
    //   246	12	1	localIOException3	java.io.IOException
    //   37	204	2	localObject5	Object
    //   65	44	3	str2	String
    //   168	19	3	localIOException4	java.io.IOException
    //   272	1	3	localIOException5	java.io.IOException
    //   279	1	3	localIOException6	java.io.IOException
    //   53	8	4	localBufferedReader	java.io.BufferedReader
    // Exception table:
    //   from	to	target	type
    //   119	123	144	java/io/IOException
    //   8	36	168	java/io/IOException
    //   200	204	209	java/io/IOException
    //   8	36	233	finally
    //   240	244	246	java/io/IOException
    //   38	55	268	finally
    //   60	66	268	finally
    //   72	79	268	finally
    //   81	108	268	finally
    //   176	194	268	finally
    //   38	55	272	java/io/IOException
    //   60	66	279	java/io/IOException
    //   72	79	279	java/io/IOException
    //   81	108	279	java/io/IOException
  }
  
  public static String bNE()
  {
    GMTrace.i(13045292072960L, 97195);
    Object localObject1 = "";
    try
    {
      new DisplayMetrics();
      Object localObject2 = ab.getContext().getResources().getDisplayMetrics();
      int i = ((DisplayMetrics)localObject2).widthPixels;
      int j = ((DisplayMetrics)localObject2).heightPixels;
      float f1 = ((DisplayMetrics)localObject2).density;
      float f2 = ((DisplayMetrics)localObject2).xdpi;
      float f3 = ((DisplayMetrics)localObject2).ydpi;
      localObject2 = "" + "width:" + String.valueOf(i) + ";";
      localObject2 = (String)localObject2 + "height:" + String.valueOf(j) + ";";
      localObject2 = (String)localObject2 + "density:" + String.valueOf(f1) + ";";
      localObject2 = (String)localObject2 + "xd:" + String.valueOf(f2) + ";";
      localObject2 = (String)localObject2 + "yd:" + String.valueOf(f3) + ";";
      localObject1 = localObject2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.PostTaskHardwareInfo", "exception:%s", new Object[] { bg.f(localException) });
      }
    }
    localObject1 = ((String)localObject1).replace(",", "_");
    GMTrace.o(13045292072960L, 97195);
    return (String)localObject1;
  }
  
  public static String bNF()
  {
    GMTrace.i(13045560508416L, 97197);
    String str2 = "";
    String str1 = str2;
    try
    {
      StatFs localStatFs = new StatFs(h.getExternalStorageDirectory().getPath());
      str1 = str2;
      long l = localStatFs.getBlockSize();
      str1 = str2;
      str2 = "" + "AvailableSizes:" + localStatFs.getAvailableBlocks() * l + ";";
      str1 = str2;
      str2 = str2 + "FreeSizes:" + localStatFs.getFreeBlocks() * l + ";";
      str1 = str2;
      str2 = str2 + "AllSize:" + localStatFs.getBlockCount() * l + ";";
      str1 = str2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.PostTaskHardwareInfo", "exception:%s", new Object[] { bg.f(localException) });
      }
    }
    str1 = str1.replace(",", "_");
    GMTrace.o(13045560508416L, 97197);
    return str1;
  }
  
  public static String bNG()
  {
    GMTrace.i(13045694726144L, 97198);
    at.AR();
    String str = (String)com.tencent.mm.y.c.xh().get(71, null);
    GMTrace.o(13045694726144L, 97198);
    return str;
  }
  
  public static String getRomInfo()
  {
    GMTrace.i(13045426290688L, 97196);
    String str2 = "";
    String str1 = str2;
    try
    {
      StatFs localStatFs = new StatFs(h.getDataDirectory().getPath());
      str1 = str2;
      long l = localStatFs.getBlockSize();
      str1 = str2;
      str2 = "" + "AvailableSizes:" + localStatFs.getAvailableBlocks() * l + ";";
      str1 = str2;
      str2 = str2 + "FreeSizes:" + localStatFs.getFreeBlocks() * l + ";";
      str1 = str2;
      str2 = str2 + "AllSize:" + localStatFs.getBlockCount() * l + ";";
      str1 = str2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.PostTaskHardwareInfo", "exception:%s", new Object[] { bg.f(localException) });
      }
    }
    str1 = str1.replace(",", "_");
    GMTrace.o(13045426290688L, 97196);
    return str1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\bk\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */