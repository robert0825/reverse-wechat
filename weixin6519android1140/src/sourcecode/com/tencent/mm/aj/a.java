package com.tencent.mm.aj;

import android.content.Context;
import android.content.res.AssetManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class a
{
  public static int gBU;
  private static String ghw;
  
  static
  {
    GMTrace.i(4458041835520L, 33215);
    gBU = 1;
    ghw = "";
    GMTrace.o(4458041835520L, 33215);
  }
  
  private static String GI()
  {
    GMTrace.i(4456699658240L, 33205);
    if (bg.nm(ghw)) {
      ghw = com.tencent.mm.compatible.util.e.ghw.replace("/data/user/0", "/data/data");
    }
    String str = ghw;
    GMTrace.o(4456699658240L, 33205);
    return str;
  }
  
  public static String GJ()
  {
    GMTrace.i(4456833875968L, 33206);
    Object localObject = new File(GI(), "emoji/res");
    if (!((File)localObject).exists()) {
      ((File)localObject).mkdir();
    }
    localObject = ((File)localObject).getAbsolutePath();
    GMTrace.o(4456833875968L, 33206);
    return (String)localObject;
  }
  
  public static String GK()
  {
    GMTrace.i(4456968093696L, 33207);
    String str = GI() + "emoji/newemoji";
    GMTrace.o(4456968093696L, 33207);
    return str;
  }
  
  /* Error */
  public static int GL()
  {
    // Byte code:
    //   0: ldc2_w 99
    //   3: ldc 101
    //   5: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 103	java/io/FileInputStream
    //   11: dup
    //   12: new 59	java/io/File
    //   15: dup
    //   16: invokestatic 105	com/tencent/mm/aj/a:GJ	()Ljava/lang/String;
    //   19: ldc 107
    //   21: invokespecial 67	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   24: invokespecial 110	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   27: astore_2
    //   28: aload_2
    //   29: astore_1
    //   30: new 112	java/io/BufferedReader
    //   33: dup
    //   34: new 114	java/io/InputStreamReader
    //   37: dup
    //   38: aload_2
    //   39: invokespecial 117	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   42: invokespecial 120	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   45: astore 4
    //   47: ldc 23
    //   49: astore_3
    //   50: aload_2
    //   51: astore_1
    //   52: aload 4
    //   54: invokevirtual 123	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   57: astore 5
    //   59: aload 5
    //   61: ifnull +28 -> 89
    //   64: aload_2
    //   65: astore_1
    //   66: new 83	java/lang/StringBuilder
    //   69: dup
    //   70: invokespecial 85	java/lang/StringBuilder:<init>	()V
    //   73: aload_3
    //   74: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: aload 5
    //   79: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   85: astore_3
    //   86: goto -36 -> 50
    //   89: aload_2
    //   90: astore_1
    //   91: new 125	org/json/JSONObject
    //   94: dup
    //   95: aload_3
    //   96: invokespecial 128	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   99: ldc -126
    //   101: invokevirtual 134	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   104: istore_0
    //   105: aload_2
    //   106: astore_1
    //   107: ldc -120
    //   109: ldc -118
    //   111: iconst_2
    //   112: anewarray 4	java/lang/Object
    //   115: dup
    //   116: iconst_0
    //   117: aload_3
    //   118: aastore
    //   119: dup
    //   120: iconst_1
    //   121: iload_0
    //   122: invokestatic 144	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   125: aastore
    //   126: invokestatic 150	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   129: aload_2
    //   130: invokestatic 155	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   133: ldc2_w 99
    //   136: ldc 101
    //   138: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   141: iload_0
    //   142: ireturn
    //   143: astore_3
    //   144: aconst_null
    //   145: astore_2
    //   146: aload_2
    //   147: astore_1
    //   148: ldc -120
    //   150: aload_3
    //   151: aload_3
    //   152: invokevirtual 158	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   155: iconst_0
    //   156: anewarray 4	java/lang/Object
    //   159: invokestatic 162	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   162: aload_2
    //   163: invokestatic 155	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   166: ldc2_w 99
    //   169: ldc 101
    //   171: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   174: iconst_1
    //   175: ireturn
    //   176: astore_2
    //   177: aconst_null
    //   178: astore_1
    //   179: aload_1
    //   180: invokestatic 155	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   183: aload_2
    //   184: athrow
    //   185: astore_2
    //   186: goto -7 -> 179
    //   189: astore_3
    //   190: goto -44 -> 146
    // Local variable table:
    //   start	length	slot	name	signature
    //   104	38	0	i	int
    //   29	151	1	localFileInputStream1	java.io.FileInputStream
    //   27	136	2	localFileInputStream2	java.io.FileInputStream
    //   176	8	2	localObject1	Object
    //   185	1	2	localObject2	Object
    //   49	69	3	str1	String
    //   143	9	3	localException1	Exception
    //   189	1	3	localException2	Exception
    //   45	8	4	localBufferedReader	java.io.BufferedReader
    //   57	21	5	str2	String
    // Exception table:
    //   from	to	target	type
    //   8	28	143	java/lang/Exception
    //   8	28	176	finally
    //   30	47	185	finally
    //   52	59	185	finally
    //   66	86	185	finally
    //   91	105	185	finally
    //   107	129	185	finally
    //   148	162	185	finally
    //   30	47	189	java/lang/Exception
    //   52	59	189	java/lang/Exception
    //   66	86	189	java/lang/Exception
    //   91	105	189	java/lang/Exception
    //   107	129	189	java/lang/Exception
  }
  
  /* Error */
  private static int GM()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: ldc2_w 164
    //   6: ldc -90
    //   8: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: invokestatic 172	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   14: invokevirtual 178	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   17: astore_1
    //   18: aload_1
    //   19: ldc -76
    //   21: invokevirtual 186	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   24: astore_1
    //   25: new 114	java/io/InputStreamReader
    //   28: dup
    //   29: aload_1
    //   30: invokespecial 117	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   33: astore 4
    //   35: new 112	java/io/BufferedReader
    //   38: dup
    //   39: aload 4
    //   41: invokespecial 120	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   44: astore 5
    //   46: ldc 23
    //   48: astore_2
    //   49: aload 5
    //   51: invokevirtual 123	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   54: astore_3
    //   55: aload_3
    //   56: ifnull +25 -> 81
    //   59: new 83	java/lang/StringBuilder
    //   62: dup
    //   63: invokespecial 85	java/lang/StringBuilder:<init>	()V
    //   66: aload_2
    //   67: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: aload_3
    //   71: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   77: astore_2
    //   78: goto -29 -> 49
    //   81: new 125	org/json/JSONObject
    //   84: dup
    //   85: aload_2
    //   86: invokespecial 128	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   89: ldc -126
    //   91: invokevirtual 134	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   94: istore_0
    //   95: ldc -120
    //   97: ldc -118
    //   99: iconst_2
    //   100: anewarray 4	java/lang/Object
    //   103: dup
    //   104: iconst_0
    //   105: aload_2
    //   106: aastore
    //   107: dup
    //   108: iconst_1
    //   109: iload_0
    //   110: invokestatic 144	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   113: aastore
    //   114: invokestatic 150	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   117: aload_1
    //   118: invokestatic 155	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   121: aload 4
    //   123: invokestatic 189	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   126: aload 5
    //   128: invokestatic 189	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   131: ldc2_w 164
    //   134: ldc -90
    //   136: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   139: iload_0
    //   140: ireturn
    //   141: astore_3
    //   142: aconst_null
    //   143: astore_1
    //   144: aconst_null
    //   145: astore_2
    //   146: aload 5
    //   148: astore 4
    //   150: ldc -120
    //   152: aload_3
    //   153: aload_3
    //   154: invokevirtual 158	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   157: iconst_0
    //   158: anewarray 4	java/lang/Object
    //   161: invokestatic 162	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   164: aload_2
    //   165: invokestatic 155	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   168: aload 4
    //   170: invokestatic 189	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   173: aload_1
    //   174: invokestatic 189	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   177: ldc2_w 164
    //   180: ldc -90
    //   182: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   185: iconst_1
    //   186: ireturn
    //   187: astore_2
    //   188: aconst_null
    //   189: astore_3
    //   190: aconst_null
    //   191: astore 4
    //   193: aconst_null
    //   194: astore_1
    //   195: aload_1
    //   196: invokestatic 155	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   199: aload 4
    //   201: invokestatic 189	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   204: aload_3
    //   205: invokestatic 189	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   208: aload_2
    //   209: athrow
    //   210: astore_2
    //   211: aconst_null
    //   212: astore_3
    //   213: aconst_null
    //   214: astore 4
    //   216: goto -21 -> 195
    //   219: astore_2
    //   220: aconst_null
    //   221: astore_3
    //   222: goto -27 -> 195
    //   225: astore_2
    //   226: aload 5
    //   228: astore_3
    //   229: goto -34 -> 195
    //   232: astore_3
    //   233: aload_2
    //   234: astore 5
    //   236: aload_3
    //   237: astore_2
    //   238: aload_1
    //   239: astore_3
    //   240: aload 5
    //   242: astore_1
    //   243: goto -48 -> 195
    //   246: astore_3
    //   247: aconst_null
    //   248: astore 4
    //   250: aload_1
    //   251: astore_2
    //   252: aload 4
    //   254: astore_1
    //   255: aload 5
    //   257: astore 4
    //   259: goto -109 -> 150
    //   262: astore_3
    //   263: aconst_null
    //   264: astore 5
    //   266: aload_1
    //   267: astore_2
    //   268: aload 5
    //   270: astore_1
    //   271: goto -121 -> 150
    //   274: astore_3
    //   275: aload_1
    //   276: astore_2
    //   277: aload 5
    //   279: astore_1
    //   280: goto -130 -> 150
    // Local variable table:
    //   start	length	slot	name	signature
    //   94	46	0	i	int
    //   17	263	1	localObject1	Object
    //   48	117	2	str1	String
    //   187	22	2	localObject2	Object
    //   210	1	2	localObject3	Object
    //   219	1	2	localObject4	Object
    //   225	9	2	localObject5	Object
    //   237	40	2	localObject6	Object
    //   54	17	3	str2	String
    //   141	13	3	localException1	Exception
    //   189	40	3	localObject7	Object
    //   232	5	3	localObject8	Object
    //   239	1	3	localObject9	Object
    //   246	1	3	localException2	Exception
    //   262	1	3	localException3	Exception
    //   274	1	3	localException4	Exception
    //   33	225	4	localObject10	Object
    //   1	277	5	localObject11	Object
    // Exception table:
    //   from	to	target	type
    //   18	25	141	java/lang/Exception
    //   18	25	187	finally
    //   25	35	210	finally
    //   35	46	219	finally
    //   49	55	225	finally
    //   59	78	225	finally
    //   81	117	225	finally
    //   150	164	232	finally
    //   25	35	246	java/lang/Exception
    //   35	46	262	java/lang/Exception
    //   49	55	274	java/lang/Exception
    //   59	78	274	java/lang/Exception
    //   81	117	274	java/lang/Exception
  }
  
  private static void a(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    GMTrace.i(4457504964608L, 33211);
    byte[] arrayOfByte = new byte['Ѐ'];
    for (;;)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1) {
        break;
      }
      paramOutputStream.write(arrayOfByte, 0, i);
    }
    GMTrace.o(4457504964608L, 33211);
  }
  
  public static void bt(boolean paramBoolean)
  {
    GMTrace.i(4457639182336L, 33212);
    File localFile = new File(GJ());
    w.i("MicroMsg.emoji.EmojiStoreExportLogic", "copy search template file to path: %s", new Object[] { localFile.getAbsoluteFile() });
    if ((d.tJF) || (d.tJG))
    {
      w.i("MicroMsg.emoji.EmojiStoreExportLogic", "need to init search template folder %b", new Object[] { Boolean.valueOf(paramBoolean) });
      com.tencent.mm.a.e.f(localFile);
      l(localFile);
    }
    for (;;)
    {
      com.tencent.mm.a.e.f(new File(com.tencent.mm.compatible.util.e.ghz, "emoji"));
      GMTrace.o(4457639182336L, 33212);
      return;
      gBU = GL();
      if (paramBoolean)
      {
        int i = GM();
        w.i("MicroMsg.emoji.EmojiStoreExportLogic", "need update assetVersion=%d currentVersion=%d", new Object[] { Integer.valueOf(i), Integer.valueOf(gBU) });
        if (gBU < i)
        {
          com.tencent.mm.a.e.f(localFile);
          l(localFile);
        }
      }
      else if (gBU == 1)
      {
        w.i("MicroMsg.emoji.EmojiStoreExportLogic", "no need update currentVersion=%d", new Object[] { Integer.valueOf(gBU) });
        com.tencent.mm.a.e.f(localFile);
        l(localFile);
      }
    }
  }
  
  private static boolean jG(String paramString)
  {
    GMTrace.i(4457370746880L, 33210);
    Object localObject1 = ab.getContext().getAssets();
    try
    {
      localObject1 = ((AssetManager)localObject1).open("emoji_template.zip");
      if (localObject1 == null)
      {
        w.e("MicroMsg.emoji.EmojiStoreExportLogic", "file inputStream not found");
        GMTrace.o(4457370746880L, 33210);
        return false;
      }
    }
    catch (IOException localIOException1)
    {
      InputStream localInputStream;
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.emoji.EmojiStoreExportLogic", localIOException1, "", new Object[0]);
        localInputStream = null;
      }
      paramString = new File(paramString);
      if (paramString.exists()) {
        paramString.delete();
      }
      paramString.getParentFile().mkdirs();
      try
      {
        paramString = new FileOutputStream(paramString);
        if (paramString == null) {}
      }
      catch (FileNotFoundException paramString)
      {
        for (;;)
        {
          try
          {
            a(localInputStream, paramString);
            com.tencent.mm.a.e.b(localInputStream);
            com.tencent.mm.a.e.a(paramString);
            GMTrace.o(4457370746880L, 33210);
            return true;
          }
          catch (IOException localIOException2)
          {
            w.printErrStackTrace("MicroMsg.emoji.EmojiStoreExportLogic", localIOException2, "", new Object[0]);
            com.tencent.mm.a.e.b(localInputStream);
            com.tencent.mm.a.e.a(paramString);
            GMTrace.o(4457370746880L, 33210);
            return false;
          }
          finally
          {
            com.tencent.mm.a.e.b(localInputStream);
            com.tencent.mm.a.e.a(paramString);
          }
          paramString = paramString;
          w.printErrStackTrace("MicroMsg.emoji.EmojiStoreExportLogic", paramString, "", new Object[0]);
          paramString = null;
        }
      }
      com.tencent.mm.a.e.b(localInputStream);
      GMTrace.o(4457370746880L, 33210);
    }
    return false;
  }
  
  private static void l(File paramFile)
  {
    GMTrace.i(4457773400064L, 33213);
    if (!paramFile.exists()) {
      paramFile.mkdirs();
    }
    File localFile = new File(paramFile, ".nomedia");
    if (!localFile.exists()) {}
    try
    {
      localFile.createNewFile();
      paramFile = new File(paramFile, "emoji_template.zip");
      if (jG(paramFile.getAbsolutePath()))
      {
        int i = bg.eV(paramFile.getAbsolutePath(), paramFile.getParent());
        if (i < 0)
        {
          w.e("MicroMsg.emoji.EmojiStoreExportLogic", "unzip fail, ret = " + i + ", zipFilePath = " + paramFile.getAbsolutePath() + ", unzipPath = " + paramFile.getParent());
          GMTrace.o(4457773400064L, 33213);
          return;
        }
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.emoji.EmojiStoreExportLogic", localIOException, "create nomedia file error", new Object[0]);
      }
      gBU = GL();
      w.i("MicroMsg.emoji.EmojiStoreExportLogic", "Unzip Path%s version=%d", new Object[] { paramFile.getParent(), Integer.valueOf(gBU) });
      GMTrace.o(4457773400064L, 33213);
      return;
    }
    w.i("MicroMsg.emoji.EmojiStoreExportLogic", "copy template file from asset fail %s", new Object[] { paramFile.getAbsolutePath() });
    GMTrace.o(4457773400064L, 33213);
  }
  
  public static void m(File paramFile)
  {
    GMTrace.i(4457907617792L, 33214);
    File localFile1 = new File(GJ());
    com.tencent.mm.a.e.f(localFile1);
    localFile1.mkdirs();
    File localFile2 = new File(localFile1, ".nomedia");
    if (!localFile2.exists()) {}
    try
    {
      localFile2.createNewFile();
      localFile1 = new File(localFile1, "emoji_template.zip");
      com.tencent.mm.a.e.o(paramFile.getAbsolutePath(), localFile1.getAbsolutePath());
      int i = bg.eV(localFile1.getAbsolutePath(), localFile1.getParent());
      if (i < 0)
      {
        w.e("MicroMsg.emoji.EmojiStoreExportLogic", "unzip fail, ret = " + i + ", zipFilePath = " + localFile1.getAbsolutePath() + ", unzipPath = " + localFile1.getParent());
        GMTrace.o(4457907617792L, 33214);
        return;
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.emoji.EmojiStoreExportLogic", localIOException, "create nomedia file error", new Object[0]);
      }
      gBU = GL();
      w.i("MicroMsg.emoji.EmojiStoreExportLogic", "Unzip Path%s version=%d", new Object[] { localFile1.getParent(), Integer.valueOf(gBU) });
      GMTrace.o(4457907617792L, 33214);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\aj\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */