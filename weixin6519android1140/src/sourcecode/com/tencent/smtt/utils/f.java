package com.tencent.smtt.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import com.tencent.smtt.sdk.k;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;

@SuppressLint({"NewApi"})
public final class f
{
  private static final int xYs = 4;
  public static String xYt = null;
  public static final a xYu = new a()
  {
    public final boolean j(File paramAnonymousFile1, File paramAnonymousFile2)
    {
      return (paramAnonymousFile1.length() == paramAnonymousFile2.length()) && (paramAnonymousFile1.lastModified() == paramAnonymousFile2.lastModified());
    }
  };
  
  public static boolean N(File paramFile)
  {
    if (paramFile == null) {
      return false;
    }
    if ((paramFile.exists()) && (paramFile.isDirectory())) {
      return true;
    }
    c(paramFile, false);
    return paramFile.mkdirs();
  }
  
  public static void O(File paramFile)
  {
    c(paramFile, false);
  }
  
  public static boolean P(File paramFile)
  {
    return (paramFile != null) && (paramFile.exists()) && (paramFile.isFile()) && (paramFile.length() > 0L);
  }
  
  public static FileOutputStream Q(File paramFile)
  {
    if (paramFile.exists())
    {
      if (paramFile.isDirectory()) {
        throw new IOException("File '" + paramFile + "' exists but is a directory");
      }
      if (!paramFile.canWrite()) {
        throw new IOException("File '" + paramFile + "' cannot be written to");
      }
    }
    else
    {
      File localFile = paramFile.getParentFile();
      if ((localFile != null) && (!localFile.exists()) && (!localFile.mkdirs())) {
        throw new IOException("File '" + paramFile + "' could not be created");
      }
    }
    return new FileOutputStream(paramFile);
  }
  
  public static String a(Context paramContext, String paramString, int paramInt, boolean paramBoolean)
  {
    Object localObject1;
    if (paramContext == null) {
      localObject1 = "";
    }
    Object localObject2;
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  return (String)localObject1;
                  localObject2 = "";
                  try
                  {
                    localObject1 = Environment.getExternalStorageDirectory() + File.separator;
                    localObject2 = localObject1;
                  }
                  catch (Exception localException)
                  {
                    for (;;) {}
                  }
                  switch (paramInt)
                  {
                  default: 
                    return "";
                  case 1: 
                    localObject1 = localObject2;
                  }
                } while (((String)localObject2).equals(""));
                return (String)localObject2 + "tencent" + File.separator + "tbs" + File.separator + paramString;
                localObject1 = localObject2;
              } while (((String)localObject2).equals(""));
              return (String)localObject2 + "tbs" + File.separator + "backup" + File.separator + paramString;
              localObject1 = localObject2;
            } while (((String)localObject2).equals(""));
            return (String)localObject2 + "tencent" + File.separator + "tbs" + File.separator + "backup" + File.separator + paramString;
            if (((String)localObject2).equals("")) {
              return bH(paramContext, "backup");
            }
            paramString = (String)localObject2 + "tencent" + File.separator + "tbs" + File.separator + "backup" + File.separator + paramString;
            localObject1 = paramString;
          } while (!paramBoolean);
          localObject2 = new File(paramString);
          if (!((File)localObject2).exists()) {
            break;
          }
          localObject1 = paramString;
        } while (((File)localObject2).canWrite());
        if (((File)localObject2).exists()) {
          break;
        }
        ((File)localObject2).mkdirs();
        localObject1 = paramString;
      } while (((File)localObject2).canWrite());
      return bH(paramContext, "backup");
      return bH(paramContext, "backup");
      localObject1 = localObject2;
    } while (((String)localObject2).equals(""));
    return (String)localObject2 + "tencent" + File.separator + "tbs" + File.separator + paramString;
    if (xYt != null) {
      return xYt;
    }
    paramContext = bH(paramContext, "tbslog");
    xYt = paramContext;
    return paramContext;
  }
  
  public static FileLock a(FileOutputStream paramFileOutputStream)
  {
    if (paramFileOutputStream == null) {}
    for (;;)
    {
      return null;
      try
      {
        paramFileOutputStream = paramFileOutputStream.getChannel().tryLock();
        boolean bool = paramFileOutputStream.isValid();
        if (bool) {
          return paramFileOutputStream;
        }
      }
      catch (Exception paramFileOutputStream)
      {
        return null;
      }
      catch (OverlappingFileLockException paramFileOutputStream) {}
    }
    return null;
  }
  
  public static void a(FileLock paramFileLock, FileOutputStream paramFileOutputStream)
  {
    if (paramFileLock != null) {}
    try
    {
      FileChannel localFileChannel = paramFileLock.channel();
      if ((localFileChannel != null) && (localFileChannel.isOpen())) {
        paramFileLock.release();
      }
    }
    catch (Exception paramFileLock)
    {
      for (;;) {}
    }
    if (paramFileOutputStream != null) {}
    try
    {
      paramFileOutputStream.close();
      return;
    }
    catch (Exception paramFileLock) {}
  }
  
  public static boolean a(File paramFile1, File paramFile2, FileFilter paramFileFilter)
  {
    a locala = xYu;
    if ((paramFile1 == null) || (paramFile2 == null)) {}
    do
    {
      do
      {
        return false;
      } while (!paramFile1.exists());
      if (paramFile1.isFile()) {
        return a(paramFile1, paramFile2, paramFileFilter, locala);
      }
      paramFile1 = paramFile1.listFiles();
    } while (paramFile1 == null);
    boolean bool = true;
    int j = paramFile1.length;
    int i = 0;
    while (i < j)
    {
      locala = paramFile1[i];
      if (!a(locala, new File(paramFile2, locala.getName()), paramFileFilter)) {
        bool = false;
      }
      i += 1;
    }
    return bool;
  }
  
  /* Error */
  private static boolean a(File paramFile1, File paramFile2, FileFilter paramFileFilter, a parama)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aload_0
    //   4: ifnull +7 -> 11
    //   7: aload_1
    //   8: ifnonnull +5 -> 13
    //   11: iconst_0
    //   12: ireturn
    //   13: aload_2
    //   14: ifnull +15 -> 29
    //   17: aload_2
    //   18: aload_0
    //   19: invokeinterface 188 2 0
    //   24: ifne +5 -> 29
    //   27: iconst_0
    //   28: ireturn
    //   29: aload_0
    //   30: invokevirtual 43	java/io/File:exists	()Z
    //   33: ifeq +197 -> 230
    //   36: aload_0
    //   37: invokevirtual 59	java/io/File:isFile	()Z
    //   40: ifne +6 -> 46
    //   43: goto +187 -> 230
    //   46: aload_1
    //   47: invokevirtual 43	java/io/File:exists	()Z
    //   50: ifeq +25 -> 75
    //   53: aload_3
    //   54: ifnull +16 -> 70
    //   57: aload_3
    //   58: aload_0
    //   59: aload_1
    //   60: invokeinterface 192 3 0
    //   65: ifeq +5 -> 70
    //   68: iconst_1
    //   69: ireturn
    //   70: aload_1
    //   71: iconst_0
    //   72: invokestatic 50	com/tencent/smtt/utils/f:c	(Ljava/io/File;Z)V
    //   75: aload_1
    //   76: invokevirtual 97	java/io/File:getParentFile	()Ljava/io/File;
    //   79: astore_2
    //   80: aload_2
    //   81: invokevirtual 59	java/io/File:isFile	()Z
    //   84: ifeq +8 -> 92
    //   87: aload_2
    //   88: iconst_0
    //   89: invokestatic 50	com/tencent/smtt/utils/f:c	(Ljava/io/File;Z)V
    //   92: aload_2
    //   93: invokevirtual 43	java/io/File:exists	()Z
    //   96: ifne +12 -> 108
    //   99: aload_2
    //   100: invokevirtual 53	java/io/File:mkdirs	()Z
    //   103: ifne +5 -> 108
    //   106: iconst_0
    //   107: ireturn
    //   108: new 194	java/io/FileInputStream
    //   111: dup
    //   112: aload_0
    //   113: invokespecial 195	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   116: invokevirtual 196	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   119: astore_2
    //   120: new 101	java/io/FileOutputStream
    //   123: dup
    //   124: aload_1
    //   125: invokespecial 103	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   128: invokevirtual 143	java/io/FileOutputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   131: astore_0
    //   132: aload_2
    //   133: invokevirtual 199	java/nio/channels/FileChannel:size	()J
    //   136: lstore 4
    //   138: aload_0
    //   139: aload_2
    //   140: lconst_0
    //   141: lload 4
    //   143: invokevirtual 203	java/nio/channels/FileChannel:transferFrom	(Ljava/nio/channels/ReadableByteChannel;JJ)J
    //   146: lload 4
    //   148: lcmp
    //   149: ifeq +49 -> 198
    //   152: aload_1
    //   153: invokestatic 205	com/tencent/smtt/utils/f:O	(Ljava/io/File;)V
    //   156: aload_2
    //   157: ifnull +7 -> 164
    //   160: aload_2
    //   161: invokevirtual 206	java/nio/channels/FileChannel:close	()V
    //   164: aload_0
    //   165: ifnull +7 -> 172
    //   168: aload_0
    //   169: invokevirtual 206	java/nio/channels/FileChannel:close	()V
    //   172: iconst_0
    //   173: ireturn
    //   174: astore_0
    //   175: aconst_null
    //   176: astore_1
    //   177: aload 6
    //   179: astore_2
    //   180: aload_2
    //   181: ifnull +7 -> 188
    //   184: aload_2
    //   185: invokevirtual 206	java/nio/channels/FileChannel:close	()V
    //   188: aload_1
    //   189: ifnull +7 -> 196
    //   192: aload_1
    //   193: invokevirtual 206	java/nio/channels/FileChannel:close	()V
    //   196: aload_0
    //   197: athrow
    //   198: aload_2
    //   199: ifnull +7 -> 206
    //   202: aload_2
    //   203: invokevirtual 206	java/nio/channels/FileChannel:close	()V
    //   206: aload_0
    //   207: ifnull +7 -> 214
    //   210: aload_0
    //   211: invokevirtual 206	java/nio/channels/FileChannel:close	()V
    //   214: iconst_1
    //   215: ireturn
    //   216: astore_0
    //   217: aconst_null
    //   218: astore_1
    //   219: goto -39 -> 180
    //   222: astore_3
    //   223: aload_0
    //   224: astore_1
    //   225: aload_3
    //   226: astore_0
    //   227: goto -47 -> 180
    //   230: iconst_0
    //   231: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	232	0	paramFile1	File
    //   0	232	1	paramFile2	File
    //   0	232	2	paramFileFilter	FileFilter
    //   0	232	3	parama	a
    //   136	11	4	l	long
    //   1	177	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   29	43	174	finally
    //   46	53	174	finally
    //   57	68	174	finally
    //   70	75	174	finally
    //   75	92	174	finally
    //   92	106	174	finally
    //   108	120	174	finally
    //   120	132	216	finally
    //   132	156	222	finally
  }
  
  /* Error */
  @SuppressLint({"NewApi"})
  public static boolean a(InputStream paramInputStream, ZipEntry paramZipEntry, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: new 39	java/io/File
    //   3: dup
    //   4: aload_2
    //   5: invokespecial 134	java/io/File:<init>	(Ljava/lang/String;)V
    //   8: invokestatic 209	com/tencent/smtt/utils/f:N	(Ljava/io/File;)Z
    //   11: pop
    //   12: new 69	java/lang/StringBuilder
    //   15: dup
    //   16: invokespecial 109	java/lang/StringBuilder:<init>	()V
    //   19: aload_2
    //   20: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: getstatic 117	java/io/File:separator	Ljava/lang/String;
    //   26: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: aload_3
    //   30: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   36: astore 8
    //   38: new 39	java/io/File
    //   41: dup
    //   42: aload 8
    //   44: invokespecial 134	java/io/File:<init>	(Ljava/lang/String;)V
    //   47: astore 7
    //   49: new 101	java/io/FileOutputStream
    //   52: dup
    //   53: aload 7
    //   55: invokespecial 103	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   58: astore_3
    //   59: aload_3
    //   60: astore_2
    //   61: sipush 8192
    //   64: newarray <illegal type>
    //   66: astore 9
    //   68: aload_3
    //   69: astore_2
    //   70: aload_0
    //   71: aload 9
    //   73: invokevirtual 215	java/io/InputStream:read	([B)I
    //   76: istore 4
    //   78: iload 4
    //   80: ifle +66 -> 146
    //   83: aload_3
    //   84: astore_2
    //   85: aload_3
    //   86: aload 9
    //   88: iconst_0
    //   89: iload 4
    //   91: invokevirtual 219	java/io/FileOutputStream:write	([BII)V
    //   94: goto -26 -> 68
    //   97: astore_1
    //   98: aload_3
    //   99: astore_0
    //   100: aload_0
    //   101: astore_2
    //   102: aload 7
    //   104: invokestatic 205	com/tencent/smtt/utils/f:O	(Ljava/io/File;)V
    //   107: aload_0
    //   108: astore_2
    //   109: new 67	java/io/IOException
    //   112: dup
    //   113: new 69	java/lang/StringBuilder
    //   116: dup
    //   117: ldc -35
    //   119: invokespecial 74	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   122: aload 7
    //   124: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   127: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   130: aload_1
    //   131: invokespecial 224	java/io/IOException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   134: athrow
    //   135: astore_0
    //   136: aload_2
    //   137: ifnull +7 -> 144
    //   140: aload_2
    //   141: invokevirtual 167	java/io/FileOutputStream:close	()V
    //   144: aload_0
    //   145: athrow
    //   146: aload_3
    //   147: invokevirtual 167	java/io/FileOutputStream:close	()V
    //   150: aload_1
    //   151: invokevirtual 229	java/util/zip/ZipEntry:getSize	()J
    //   154: lstore 5
    //   156: aload_1
    //   157: invokevirtual 232	java/util/zip/ZipEntry:getTime	()J
    //   160: pop2
    //   161: aload 8
    //   163: lload 5
    //   165: aload_1
    //   166: invokevirtual 235	java/util/zip/ZipEntry:getCrc	()J
    //   169: invokestatic 239	com/tencent/smtt/utils/f:t	(Ljava/lang/String;JJ)Z
    //   172: ifeq +27 -> 199
    //   175: ldc -15
    //   177: new 69	java/lang/StringBuilder
    //   180: dup
    //   181: ldc -13
    //   183: invokespecial 74	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   186: aload 8
    //   188: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   191: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   194: invokestatic 249	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   197: iconst_0
    //   198: ireturn
    //   199: aload 7
    //   201: aload_1
    //   202: invokevirtual 232	java/util/zip/ZipEntry:getTime	()J
    //   205: invokevirtual 253	java/io/File:setLastModified	(J)Z
    //   208: ifne +25 -> 233
    //   211: ldc -15
    //   213: new 69	java/lang/StringBuilder
    //   216: dup
    //   217: ldc -1
    //   219: invokespecial 74	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   222: aload 7
    //   224: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   227: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   230: invokestatic 249	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   233: iconst_1
    //   234: ireturn
    //   235: astore_0
    //   236: aconst_null
    //   237: astore_2
    //   238: goto -102 -> 136
    //   241: astore_1
    //   242: aconst_null
    //   243: astore_0
    //   244: goto -144 -> 100
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	247	0	paramInputStream	InputStream
    //   0	247	1	paramZipEntry	ZipEntry
    //   0	247	2	paramString1	String
    //   0	247	3	paramString2	String
    //   76	14	4	i	int
    //   154	10	5	l	long
    //   47	176	7	localFile	File
    //   36	151	8	str	String
    //   66	21	9	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   61	68	97	java/io/IOException
    //   70	78	97	java/io/IOException
    //   85	94	97	java/io/IOException
    //   61	68	135	finally
    //   70	78	135	finally
    //   85	94	135	finally
    //   102	107	135	finally
    //   109	135	135	finally
    //   49	59	235	finally
    //   49	59	241	java/io/IOException
  }
  
  /* Error */
  private static boolean a(String paramString1, String paramString2, String paramString3, String paramString4, b paramb)
  {
    // Byte code:
    //   0: new 259	java/util/zip/ZipFile
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 260	java/util/zip/ZipFile:<init>	(Ljava/lang/String;)V
    //   8: astore_0
    //   9: iconst_0
    //   10: istore 6
    //   12: iconst_0
    //   13: istore 5
    //   15: aload_0
    //   16: invokevirtual 264	java/util/zip/ZipFile:entries	()Ljava/util/Enumeration;
    //   19: astore 10
    //   21: aload 10
    //   23: invokeinterface 269 1 0
    //   28: ifeq +317 -> 345
    //   31: aload 10
    //   33: invokeinterface 273 1 0
    //   38: checkcast 226	java/util/zip/ZipEntry
    //   41: astore 11
    //   43: aload 11
    //   45: invokevirtual 274	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   48: astore 13
    //   50: aload 13
    //   52: ifnull -31 -> 21
    //   55: aload 13
    //   57: ldc_w 276
    //   60: invokevirtual 280	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   63: ifne +14 -> 77
    //   66: aload 13
    //   68: ldc_w 282
    //   71: invokevirtual 280	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   74: ifeq -53 -> 21
    //   77: aload 13
    //   79: aload 13
    //   81: bipush 47
    //   83: invokevirtual 286	java/lang/String:lastIndexOf	(I)I
    //   86: invokevirtual 290	java/lang/String:substring	(I)Ljava/lang/String;
    //   89: astore 12
    //   91: iload 5
    //   93: istore 7
    //   95: iload 6
    //   97: istore 8
    //   99: aload 12
    //   101: ldc_w 292
    //   104: invokevirtual 295	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   107: ifeq +45 -> 152
    //   110: aload 13
    //   112: getstatic 27	com/tencent/smtt/utils/f:xYs	I
    //   115: aload_1
    //   116: iconst_0
    //   117: aload_1
    //   118: invokevirtual 298	java/lang/String:length	()I
    //   121: invokevirtual 302	java/lang/String:regionMatches	(ILjava/lang/String;II)Z
    //   124: ifeq +76 -> 200
    //   127: aload 13
    //   129: getstatic 27	com/tencent/smtt/utils/f:xYs	I
    //   132: aload_1
    //   133: invokevirtual 298	java/lang/String:length	()I
    //   136: iadd
    //   137: invokevirtual 306	java/lang/String:charAt	(I)C
    //   140: bipush 47
    //   142: if_icmpne +58 -> 200
    //   145: iconst_1
    //   146: istore 8
    //   148: iload 5
    //   150: istore 7
    //   152: aload_0
    //   153: aload 11
    //   155: invokevirtual 310	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   158: astore 13
    //   160: aload 4
    //   162: aload 13
    //   164: aload 11
    //   166: aload 12
    //   168: iconst_1
    //   169: invokevirtual 290	java/lang/String:substring	(I)Ljava/lang/String;
    //   172: invokeinterface 313 4 0
    //   177: istore 9
    //   179: iload 9
    //   181: ifne +170 -> 351
    //   184: aload 13
    //   186: ifnull +8 -> 194
    //   189: aload 13
    //   191: invokevirtual 314	java/io/InputStream:close	()V
    //   194: aload_0
    //   195: invokevirtual 315	java/util/zip/ZipFile:close	()V
    //   198: iconst_0
    //   199: ireturn
    //   200: aload_2
    //   201: ifnull +56 -> 257
    //   204: aload 13
    //   206: getstatic 27	com/tencent/smtt/utils/f:xYs	I
    //   209: aload_2
    //   210: iconst_0
    //   211: aload_2
    //   212: invokevirtual 298	java/lang/String:length	()I
    //   215: invokevirtual 302	java/lang/String:regionMatches	(ILjava/lang/String;II)Z
    //   218: ifeq +39 -> 257
    //   221: aload 13
    //   223: getstatic 27	com/tencent/smtt/utils/f:xYs	I
    //   226: aload_2
    //   227: invokevirtual 298	java/lang/String:length	()I
    //   230: iadd
    //   231: invokevirtual 306	java/lang/String:charAt	(I)C
    //   234: bipush 47
    //   236: if_icmpne +21 -> 257
    //   239: iconst_1
    //   240: istore 7
    //   242: iconst_1
    //   243: istore 5
    //   245: iload 6
    //   247: istore 8
    //   249: iload 6
    //   251: ifeq -99 -> 152
    //   254: goto -233 -> 21
    //   257: aload_3
    //   258: ifnull -237 -> 21
    //   261: aload 13
    //   263: getstatic 27	com/tencent/smtt/utils/f:xYs	I
    //   266: aload_3
    //   267: iconst_0
    //   268: aload_3
    //   269: invokevirtual 298	java/lang/String:length	()I
    //   272: invokevirtual 302	java/lang/String:regionMatches	(ILjava/lang/String;II)Z
    //   275: ifeq -254 -> 21
    //   278: aload 13
    //   280: getstatic 27	com/tencent/smtt/utils/f:xYs	I
    //   283: aload_3
    //   284: invokevirtual 298	java/lang/String:length	()I
    //   287: iadd
    //   288: invokevirtual 306	java/lang/String:charAt	(I)C
    //   291: bipush 47
    //   293: if_icmpne -272 -> 21
    //   296: iload 6
    //   298: ifne -277 -> 21
    //   301: iload 5
    //   303: ifne -282 -> 21
    //   306: iload 5
    //   308: istore 7
    //   310: iload 6
    //   312: istore 8
    //   314: goto -162 -> 152
    //   317: astore_1
    //   318: aload 13
    //   320: ifnull +8 -> 328
    //   323: aload 13
    //   325: invokevirtual 314	java/io/InputStream:close	()V
    //   328: aload_1
    //   329: athrow
    //   330: astore_2
    //   331: aload_0
    //   332: astore_1
    //   333: aload_2
    //   334: astore_0
    //   335: aload_1
    //   336: ifnull +7 -> 343
    //   339: aload_1
    //   340: invokevirtual 315	java/util/zip/ZipFile:close	()V
    //   343: aload_0
    //   344: athrow
    //   345: aload_0
    //   346: invokevirtual 315	java/util/zip/ZipFile:close	()V
    //   349: iconst_1
    //   350: ireturn
    //   351: iload 7
    //   353: istore 5
    //   355: iload 8
    //   357: istore 6
    //   359: aload 13
    //   361: ifnull -340 -> 21
    //   364: aload 13
    //   366: invokevirtual 314	java/io/InputStream:close	()V
    //   369: iload 7
    //   371: istore 5
    //   373: iload 8
    //   375: istore 6
    //   377: goto -356 -> 21
    //   380: astore_0
    //   381: aconst_null
    //   382: astore_1
    //   383: goto -48 -> 335
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	386	0	paramString1	String
    //   0	386	1	paramString2	String
    //   0	386	2	paramString3	String
    //   0	386	3	paramString4	String
    //   0	386	4	paramb	b
    //   13	359	5	i	int
    //   10	366	6	j	int
    //   93	277	7	k	int
    //   97	277	8	m	int
    //   177	3	9	bool	boolean
    //   19	13	10	localEnumeration	java.util.Enumeration
    //   41	124	11	localZipEntry	ZipEntry
    //   89	78	12	str	String
    //   48	317	13	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   160	179	317	finally
    //   15	21	330	finally
    //   21	50	330	finally
    //   55	77	330	finally
    //   77	91	330	finally
    //   99	145	330	finally
    //   152	160	330	finally
    //   189	194	330	finally
    //   204	239	330	finally
    //   261	296	330	finally
    //   323	328	330	finally
    //   328	330	330	finally
    //   364	369	330	finally
    //   0	9	380	finally
  }
  
  public static String an(Context paramContext, int paramInt)
  {
    return a(paramContext, paramContext.getApplicationInfo().packageName, paramInt, true);
  }
  
  private static File b(Context paramContext, boolean paramBoolean, String paramString)
  {
    if (paramBoolean)
    {
      paramContext = new File(paramContext.getDir("tbs", 0), "core_private");
      if ((!paramContext.isDirectory()) && (!paramContext.mkdir()))
      {
        paramContext = null;
        if (paramContext != null) {
          break label95;
        }
      }
    }
    label95:
    do
    {
      return null;
      paramContext = paramContext.getAbsolutePath();
      break;
      paramContext = Environment.getExternalStorageDirectory() + File.separator + "tbs" + File.separator + "file_locks";
      break;
      paramContext = new File(paramContext);
      if (!paramContext.exists()) {
        paramContext.mkdirs();
      }
    } while (!paramContext.canWrite());
    paramContext = new File(paramContext, paramString);
    if (!paramContext.exists()) {}
    try
    {
      paramContext.createNewFile();
      return paramContext;
    }
    catch (IOException paramContext) {}
    return null;
  }
  
  private static String bH(Context paramContext, String paramString)
  {
    if (paramContext == null) {
      return "";
    }
    paramContext = paramContext.getApplicationContext();
    try
    {
      String str = paramContext.getExternalFilesDir(paramString).getAbsolutePath();
      return str;
    }
    catch (Throwable localThrowable)
    {
      try
      {
        paramContext = Environment.getExternalStorageDirectory() + File.separator + "Android" + File.separator + "data" + File.separator + paramContext.getApplicationInfo().packageName + File.separator + "files" + File.separator + paramString;
        return paramContext;
      }
      catch (Exception paramContext) {}
    }
    return "";
  }
  
  private static int c(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    long l2;
    if (paramInputStream == null)
    {
      l2 = -1L;
      if (l2 > 2147483647L) {
        return -1;
      }
    }
    else
    {
      byte[] arrayOfByte = new byte['က'];
      int i;
      for (long l1 = 0L;; l1 += i)
      {
        i = paramInputStream.read(arrayOfByte);
        l2 = l1;
        if (-1 == i) {
          break;
        }
        paramOutputStream.write(arrayOfByte, 0, i);
      }
    }
    return (int)l2;
  }
  
  public static FileOutputStream c(Context paramContext, boolean paramBoolean, String paramString)
  {
    paramContext = b(paramContext, paramBoolean, paramString);
    if (paramContext != null) {
      try
      {
        paramContext = new FileOutputStream(paramContext);
        return paramContext;
      }
      catch (FileNotFoundException paramContext) {}
    }
    return null;
  }
  
  public static void c(File paramFile, boolean paramBoolean)
  {
    if ((paramFile == null) || (!paramFile.exists())) {}
    do
    {
      File[] arrayOfFile;
      do
      {
        return;
        if (paramFile.isFile())
        {
          paramFile.delete();
          return;
        }
        arrayOfFile = paramFile.listFiles();
      } while (arrayOfFile == null);
      int j = arrayOfFile.length;
      int i = 0;
      while (i < j)
      {
        c(arrayOfFile[i], paramBoolean);
        i += 1;
      }
    } while (paramBoolean);
    paramFile.delete();
  }
  
  private static File cpe()
  {
    try
    {
      File localFile = Environment.getExternalStorageDirectory();
      return localFile;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public static boolean cpf()
  {
    try
    {
      boolean bool = "mounted".equals(Environment.getExternalStorageState());
      return bool;
    }
    catch (Exception localException) {}
    return false;
  }
  
  public static File cpg()
  {
    File localFile = new File(cpe().getAbsolutePath() + "/.tbs");
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    return localFile;
  }
  
  public static void e(File paramFile, String paramString)
  {
    if ((paramFile == null) || (!paramFile.exists())) {}
    File[] arrayOfFile;
    do
    {
      return;
      if (paramFile.isFile())
      {
        paramFile.delete();
        return;
      }
      arrayOfFile = paramFile.listFiles();
    } while (arrayOfFile == null);
    int j = arrayOfFile.length;
    int i = 0;
    while (i < j)
    {
      File localFile = arrayOfFile[i];
      if (!localFile.getName().equals(paramString)) {
        c(localFile, false);
      }
      i += 1;
    }
    paramFile.delete();
  }
  
  public static boolean h(File paramFile1, File paramFile2)
  {
    String str1 = paramFile1.getPath();
    paramFile2 = paramFile2.getPath();
    String str2 = Build.CPU_ABI;
    if (Build.VERSION.SDK_INT >= 8) {}
    for (paramFile1 = Build.CPU_ABI2;; paramFile1 = null) {
      a(str1, str2, paramFile1, l.fD("ro.product.cpu.upgradeabi", "armeabi"), new b()
      {
        public final boolean a(InputStream paramAnonymousInputStream, ZipEntry paramAnonymousZipEntry, String paramAnonymousString)
        {
          try
          {
            boolean bool = f.a(paramAnonymousInputStream, paramAnonymousZipEntry, this.xYv, paramAnonymousString);
            return bool;
          }
          catch (Exception paramAnonymousInputStream)
          {
            throw new Exception("copyFileIfChanged Exception", paramAnonymousInputStream);
          }
        }
      });
    }
  }
  
  public static boolean hu(Context paramContext)
  {
    if (Build.VERSION.SDK_INT < 23) {}
    do
    {
      return true;
      if (paramContext == null) {
        break;
      }
    } while (paramContext.getApplicationContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0);
    return false;
    return false;
  }
  
  public static boolean hv(Context paramContext)
  {
    long l = u.cpv();
    if (l >= k.gl(paramContext).cof()) {}
    for (boolean bool = true;; bool = false)
    {
      if (!bool) {
        TbsLog.e("TbsDownload", "[TbsApkDwonloader.hasEnoughFreeSpace] freeSpace too small,  freeSpace = " + l);
      }
      return bool;
    }
  }
  
  public static boolean i(File paramFile1, File paramFile2)
  {
    return a(paramFile1, paramFile2, null);
  }
  
  public static byte[] q(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    c(paramInputStream, localByteArrayOutputStream);
    return localByteArrayOutputStream.toByteArray();
  }
  
  private static boolean t(String paramString, long paramLong1, long paramLong2)
  {
    paramString = new File(paramString);
    if (paramString.length() != paramLong1)
    {
      TbsLog.e("FileHelper", "file size doesn't match: " + paramString.length() + " vs " + paramLong1);
      return true;
    }
    try
    {
      localFileInputStream = new FileInputStream(paramString);
      try
      {
        localCRC32 = new CRC32();
        byte[] arrayOfByte = new byte[' '];
        for (;;)
        {
          int i = localFileInputStream.read(arrayOfByte);
          if (i <= 0) {
            break;
          }
          localCRC32.update(arrayOfByte, 0, i);
        }
        if (localFileInputStream == null) {
          break label119;
        }
      }
      finally {}
    }
    finally
    {
      for (;;)
      {
        CRC32 localCRC32;
        FileInputStream localFileInputStream = null;
      }
    }
    localFileInputStream.close();
    label119:
    throw paramString;
    paramLong1 = localCRC32.getValue();
    TbsLog.i("FileHelper", paramString.getName() + ": crc = " + paramLong1 + ", zipCrc = " + paramLong2);
    if (paramLong1 != paramLong2)
    {
      localFileInputStream.close();
      return true;
    }
    localFileInputStream.close();
    return false;
  }
  
  public static abstract interface a
  {
    public abstract boolean j(File paramFile1, File paramFile2);
  }
  
  public static abstract interface b
  {
    public abstract boolean a(InputStream paramInputStream, ZipEntry paramZipEntry, String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\utils\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */