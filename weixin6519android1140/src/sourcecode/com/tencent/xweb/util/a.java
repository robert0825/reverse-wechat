package com.tencent.xweb.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.xwalk.core.Log;

public final class a
{
  public static boolean Zh(String paramString)
  {
    try
    {
      ah(new File(paramString));
      return true;
    }
    catch (Exception localException)
    {
      Log.i("FileUtils", String.format("delete all files.(%s)", new Object[] { paramString }));
    }
    return false;
  }
  
  private static void ah(File paramFile)
  {
    if ((paramFile == null) || (!paramFile.exists())) {}
    do
    {
      return;
      if (paramFile.isFile())
      {
        paramFile.delete();
        return;
      }
    } while (!paramFile.isDirectory());
    File[] arrayOfFile = paramFile.listFiles();
    if ((arrayOfFile != null) && (arrayOfFile.length > 0))
    {
      int j = arrayOfFile.length;
      int i = 0;
      if (i < j)
      {
        File localFile = arrayOfFile[i];
        if ((localFile != null) && (localFile.exists()))
        {
          if (!localFile.isFile()) {
            break label95;
          }
          localFile.delete();
        }
        for (;;)
        {
          i += 1;
          break;
          label95:
          ah(localFile);
        }
      }
    }
    paramFile.delete();
  }
  
  public static boolean deleteFile(String paramString)
  {
    paramString = new File(paramString);
    if ((paramString.exists()) && (paramString.isFile()))
    {
      paramString.delete();
      return true;
    }
    return false;
  }
  
  /* Error */
  public static boolean eR(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore_3
    //   5: new 59	java/io/FileInputStream
    //   8: dup
    //   9: aload_0
    //   10: invokespecial 60	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   13: invokevirtual 64	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   16: astore_2
    //   17: new 66	java/io/FileOutputStream
    //   20: dup
    //   21: aload_1
    //   22: invokespecial 67	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   25: invokevirtual 68	java/io/FileOutputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   28: astore_3
    //   29: aload_3
    //   30: aload_2
    //   31: lconst_0
    //   32: aload_2
    //   33: invokevirtual 74	java/nio/channels/FileChannel:size	()J
    //   36: invokevirtual 78	java/nio/channels/FileChannel:transferFrom	(Ljava/nio/channels/ReadableByteChannel;JJ)J
    //   39: pop2
    //   40: aload_2
    //   41: ifnull +7 -> 48
    //   44: aload_2
    //   45: invokevirtual 82	java/nio/channels/FileChannel:close	()V
    //   48: aload_3
    //   49: ifnull +7 -> 56
    //   52: aload_3
    //   53: invokevirtual 82	java/nio/channels/FileChannel:close	()V
    //   56: iconst_1
    //   57: ireturn
    //   58: astore 4
    //   60: aconst_null
    //   61: astore_2
    //   62: ldc 20
    //   64: ldc 84
    //   66: iconst_4
    //   67: anewarray 4	java/lang/Object
    //   70: dup
    //   71: iconst_0
    //   72: aload 4
    //   74: invokevirtual 88	java/lang/Object:getClass	()Ljava/lang/Class;
    //   77: invokevirtual 94	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   80: aastore
    //   81: dup
    //   82: iconst_1
    //   83: aload 4
    //   85: invokevirtual 97	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   88: aastore
    //   89: dup
    //   90: iconst_2
    //   91: aload_0
    //   92: aastore
    //   93: dup
    //   94: iconst_3
    //   95: aload_1
    //   96: aastore
    //   97: invokestatic 28	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   100: invokestatic 100	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   103: aload_3
    //   104: ifnull +7 -> 111
    //   107: aload_3
    //   108: invokevirtual 82	java/nio/channels/FileChannel:close	()V
    //   111: aload_2
    //   112: ifnull +7 -> 119
    //   115: aload_2
    //   116: invokevirtual 82	java/nio/channels/FileChannel:close	()V
    //   119: iconst_0
    //   120: ireturn
    //   121: astore_0
    //   122: aconst_null
    //   123: astore_2
    //   124: aload 4
    //   126: astore_3
    //   127: aload_3
    //   128: ifnull +7 -> 135
    //   131: aload_3
    //   132: invokevirtual 82	java/nio/channels/FileChannel:close	()V
    //   135: aload_2
    //   136: ifnull +7 -> 143
    //   139: aload_2
    //   140: invokevirtual 82	java/nio/channels/FileChannel:close	()V
    //   143: aload_0
    //   144: athrow
    //   145: astore_0
    //   146: goto -98 -> 48
    //   149: astore_0
    //   150: goto -94 -> 56
    //   153: astore_0
    //   154: goto -43 -> 111
    //   157: astore_0
    //   158: goto -39 -> 119
    //   161: astore_1
    //   162: goto -27 -> 135
    //   165: astore_1
    //   166: goto -23 -> 143
    //   169: astore_0
    //   170: aload_2
    //   171: astore_3
    //   172: aconst_null
    //   173: astore_2
    //   174: goto -47 -> 127
    //   177: astore_0
    //   178: aload_2
    //   179: astore_1
    //   180: aload_3
    //   181: astore_2
    //   182: aload_1
    //   183: astore_3
    //   184: goto -57 -> 127
    //   187: astore_0
    //   188: goto -61 -> 127
    //   191: astore 4
    //   193: aload_2
    //   194: astore_3
    //   195: aconst_null
    //   196: astore_2
    //   197: goto -135 -> 62
    //   200: astore 4
    //   202: aload_2
    //   203: astore 5
    //   205: aload_3
    //   206: astore_2
    //   207: aload 5
    //   209: astore_3
    //   210: goto -148 -> 62
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	213	0	paramString1	String
    //   0	213	1	paramString2	String
    //   16	191	2	localObject1	Object
    //   4	206	3	localObject2	Object
    //   1	1	4	localObject3	Object
    //   58	67	4	localException1	Exception
    //   191	1	4	localException2	Exception
    //   200	1	4	localException3	Exception
    //   203	5	5	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   5	17	58	java/lang/Exception
    //   5	17	121	finally
    //   44	48	145	java/io/IOException
    //   52	56	149	java/io/IOException
    //   107	111	153	java/io/IOException
    //   115	119	157	java/io/IOException
    //   131	135	161	java/io/IOException
    //   139	143	165	java/io/IOException
    //   17	29	169	finally
    //   29	40	177	finally
    //   62	103	187	finally
    //   17	29	191	java/lang/Exception
    //   29	40	200	java/lang/Exception
  }
  
  public static boolean fI(String paramString1, String paramString2)
  {
    Object localObject = new File(paramString2);
    if ((!((File)localObject).isDirectory()) || (!((File)localObject).exists())) {
      ((File)localObject).mkdirs();
    }
    localObject = new File(paramString1).listFiles();
    int i = 0;
    while (i < localObject.length)
    {
      if ((localObject[i].isFile()) && (!o(localObject[i], new File(new File(paramString2).getAbsolutePath() + File.separator + localObject[i].getName())))) {}
      while ((localObject[i].isDirectory()) && (fI(paramString1 + "/" + localObject[i].getName(), paramString2 + "/" + localObject[i].getName()))) {
        return false;
      }
      i += 1;
    }
    return true;
  }
  
  private static boolean o(File paramFile1, File paramFile2)
  {
    BufferedInputStream localBufferedInputStream;
    BufferedOutputStream localBufferedOutputStream;
    try
    {
      paramFile1 = new FileInputStream(paramFile1);
      localBufferedInputStream = new BufferedInputStream(paramFile1);
      paramFile2 = new FileOutputStream(paramFile2);
      localBufferedOutputStream = new BufferedOutputStream(paramFile2);
      byte[] arrayOfByte = new byte['᐀'];
      for (;;)
      {
        int i = localBufferedInputStream.read(arrayOfByte);
        if (i == -1) {
          break;
        }
        localBufferedOutputStream.write(arrayOfByte, 0, i);
      }
      localBufferedOutputStream.flush();
    }
    catch (Exception paramFile1)
    {
      Log.e("FileUtils", "copyFile error:" + paramFile1.getMessage());
      return false;
    }
    localBufferedInputStream.close();
    localBufferedOutputStream.close();
    paramFile2.close();
    paramFile1.close();
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\xweb\util\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */