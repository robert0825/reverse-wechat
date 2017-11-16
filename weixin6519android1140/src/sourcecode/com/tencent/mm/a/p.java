package com.tencent.mm.a;

import com.tencent.gmtrace.GMTrace;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.zip.ZipOutputStream;

public final class p
{
  public static String a(File paramFile, boolean paramBoolean, String paramString)
  {
    int j = 0;
    GMTrace.i(13856772456448L, 103241);
    Object localObject;
    if (paramString != null)
    {
      localObject = new File(paramString).getParentFile();
      if ((localObject != null) && (!((File)localObject).exists())) {
        ((File)localObject).mkdirs();
      }
    }
    ArrayList localArrayList = new ArrayList();
    int i;
    if (paramFile.isDirectory())
    {
      localObject = paramFile.listFiles();
      if (localObject == null)
      {
        GMTrace.o(13856772456448L, 103241);
        return null;
      }
      i = 0;
      while (i < localObject.length)
      {
        localArrayList.add(localObject[i]);
        i += 1;
      }
      localObject = paramString;
      if (paramString == null) {
        localObject = paramFile.getAbsolutePath() + File.separator + paramFile.getName() + ".zip";
      }
    }
    for (;;)
    {
      paramFile = new File((String)localObject);
      if (paramFile.exists()) {
        paramFile.delete();
      }
      try
      {
        a(localArrayList, paramFile);
        if (paramBoolean)
        {
          i = j;
          for (;;)
          {
            if (i < localArrayList.size())
            {
              ((File)localArrayList.get(i)).delete();
              i += 1;
              continue;
              localArrayList.add(paramFile);
              localObject = paramString;
              if (paramString != null) {
                break;
              }
              localObject = paramFile.getAbsoluteFile().getParentFile().getAbsolutePath() + File.separator + paramFile.getName() + ".zip";
            }
          }
        }
      }
      catch (Exception paramFile)
      {
        GMTrace.o(13856772456448L, 103241);
        return null;
      }
    }
    paramFile = paramFile.getAbsolutePath();
    GMTrace.o(13856772456448L, 103241);
    return paramFile;
  }
  
  /* Error */
  private static void a(File paramFile, ZipOutputStream paramZipOutputStream, String paramString)
  {
    // Byte code:
    //   0: ldc2_w 96
    //   3: ldc 98
    //   5: invokestatic 17	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 55	java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial 56	java/lang/StringBuilder:<init>	()V
    //   15: aload_2
    //   16: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   19: astore 5
    //   21: aload_2
    //   22: invokevirtual 103	java/lang/String:trim	()Ljava/lang/String;
    //   25: invokevirtual 106	java/lang/String:length	()I
    //   28: ifne +64 -> 92
    //   31: ldc 108
    //   33: astore_2
    //   34: aload 5
    //   36: aload_2
    //   37: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: aload_0
    //   41: invokevirtual 71	java/io/File:getName	()Ljava/lang/String;
    //   44: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: invokevirtual 76	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   50: astore 5
    //   52: aload_0
    //   53: invokevirtual 42	java/io/File:isDirectory	()Z
    //   56: ifeq +52 -> 108
    //   59: aload_0
    //   60: invokevirtual 46	java/io/File:listFiles	()[Ljava/io/File;
    //   63: astore_0
    //   64: aload_0
    //   65: arraylength
    //   66: istore 4
    //   68: iconst_0
    //   69: istore_3
    //   70: iload_3
    //   71: iload 4
    //   73: if_icmpge +26 -> 99
    //   76: aload_0
    //   77: iload_3
    //   78: aaload
    //   79: aload_1
    //   80: aload 5
    //   82: invokestatic 110	com/tencent/mm/a/p:a	(Ljava/io/File;Ljava/util/zip/ZipOutputStream;Ljava/lang/String;)V
    //   85: iload_3
    //   86: iconst_1
    //   87: iadd
    //   88: istore_3
    //   89: goto -19 -> 70
    //   92: getstatic 68	java/io/File:separator	Ljava/lang/String;
    //   95: astore_2
    //   96: goto -62 -> 34
    //   99: ldc2_w 96
    //   102: ldc 98
    //   104: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   107: return
    //   108: ldc 111
    //   110: newarray <illegal type>
    //   112: astore 6
    //   114: new 113	java/io/BufferedInputStream
    //   117: dup
    //   118: new 115	java/io/FileInputStream
    //   121: dup
    //   122: aload_0
    //   123: invokespecial 118	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   126: ldc 111
    //   128: invokespecial 121	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;I)V
    //   131: astore_2
    //   132: aload_2
    //   133: astore_0
    //   134: aload_1
    //   135: new 123	java/util/zip/ZipEntry
    //   138: dup
    //   139: aload 5
    //   141: invokespecial 124	java/util/zip/ZipEntry:<init>	(Ljava/lang/String;)V
    //   144: invokevirtual 130	java/util/zip/ZipOutputStream:putNextEntry	(Ljava/util/zip/ZipEntry;)V
    //   147: aload_2
    //   148: astore_0
    //   149: aload_2
    //   150: aload 6
    //   152: invokevirtual 134	java/io/BufferedInputStream:read	([B)I
    //   155: istore_3
    //   156: iload_3
    //   157: iconst_m1
    //   158: if_icmpeq +58 -> 216
    //   161: aload_2
    //   162: astore_0
    //   163: aload_1
    //   164: aload 6
    //   166: iconst_0
    //   167: iload_3
    //   168: invokevirtual 138	java/util/zip/ZipOutputStream:write	([BII)V
    //   171: goto -24 -> 147
    //   174: astore 5
    //   176: aload_2
    //   177: astore_0
    //   178: ldc -116
    //   180: aload 5
    //   182: ldc 108
    //   184: iconst_0
    //   185: anewarray 4	java/lang/Object
    //   188: invokestatic 146	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   191: aload_2
    //   192: ifnull +7 -> 199
    //   195: aload_2
    //   196: invokevirtual 149	java/io/BufferedInputStream:close	()V
    //   199: aload_1
    //   200: invokevirtual 152	java/util/zip/ZipOutputStream:flush	()V
    //   203: aload_1
    //   204: invokevirtual 155	java/util/zip/ZipOutputStream:closeEntry	()V
    //   207: ldc2_w 96
    //   210: ldc 98
    //   212: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   215: return
    //   216: aload_2
    //   217: invokevirtual 149	java/io/BufferedInputStream:close	()V
    //   220: goto -21 -> 199
    //   223: astore_1
    //   224: aconst_null
    //   225: astore_0
    //   226: aload_0
    //   227: ifnull +7 -> 234
    //   230: aload_0
    //   231: invokevirtual 149	java/io/BufferedInputStream:close	()V
    //   234: aload_1
    //   235: athrow
    //   236: astore_1
    //   237: goto -11 -> 226
    //   240: astore 5
    //   242: aconst_null
    //   243: astore_2
    //   244: goto -68 -> 176
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	247	0	paramFile	File
    //   0	247	1	paramZipOutputStream	ZipOutputStream
    //   0	247	2	paramString	String
    //   69	99	3	i	int
    //   66	8	4	j	int
    //   19	121	5	localObject	Object
    //   174	7	5	localException1	Exception
    //   240	1	5	localException2	Exception
    //   112	53	6	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   134	147	174	java/lang/Exception
    //   149	156	174	java/lang/Exception
    //   163	171	174	java/lang/Exception
    //   114	132	223	finally
    //   134	147	236	finally
    //   149	156	236	finally
    //   163	171	236	finally
    //   178	191	236	finally
    //   114	132	240	java/lang/Exception
  }
  
  public static void a(Collection<File> paramCollection, File paramFile)
  {
    GMTrace.i(13856504020992L, 103239);
    paramFile = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(paramFile), 131072));
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      File localFile = (File)paramCollection.next();
      if (localFile.exists()) {
        a(localFile, paramFile, "");
      }
    }
    paramFile.close();
    GMTrace.o(13856504020992L, 103239);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\a\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */