package com.tencent.recovery.storage;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;

public class MMappedFileStorage
{
  private int currentIndex;
  private int xPS;
  private File xPT;
  private File xPU;
  private MappedByteBuffer xPV;
  private RandomAccessFile xPW;
  
  public MMappedFileStorage(String paramString)
  {
    this.xPT = new File(paramString);
    this.xPU = new File(this.xPT.getParentFile(), "temp-" + this.xPT.getName());
    this.xPS = 153600;
    if (!this.xPT.getParentFile().exists()) {
      this.xPT.getParentFile().mkdirs();
    }
    if (this.xPU.exists())
    {
      g(this.xPU, this.xPT);
      this.xPU.delete();
    }
  }
  
  /* Error */
  private static void g(File paramFile1, File paramFile2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aconst_null
    //   4: astore 5
    //   6: new 74	java/io/DataInputStream
    //   9: dup
    //   10: new 76	java/io/FileInputStream
    //   13: dup
    //   14: aload_0
    //   15: invokespecial 79	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   18: invokespecial 82	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   21: astore_0
    //   22: aload_0
    //   23: invokevirtual 86	java/io/DataInputStream:readInt	()I
    //   26: istore 4
    //   28: new 88	java/io/FileOutputStream
    //   31: dup
    //   32: aload_1
    //   33: iconst_1
    //   34: invokespecial 91	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   37: astore_1
    //   38: sipush 1024
    //   41: newarray <illegal type>
    //   43: astore 5
    //   45: iconst_0
    //   46: istore_2
    //   47: goto +185 -> 232
    //   50: iload_3
    //   51: ifle +38 -> 89
    //   54: aload_0
    //   55: aload 5
    //   57: iconst_0
    //   58: iload_3
    //   59: invokevirtual 95	java/io/DataInputStream:read	([BII)I
    //   62: istore_3
    //   63: iload_3
    //   64: ifle +25 -> 89
    //   67: aload_1
    //   68: aload 5
    //   70: iconst_0
    //   71: iload_3
    //   72: invokevirtual 99	java/io/FileOutputStream:write	([BII)V
    //   75: iload_3
    //   76: iload_2
    //   77: iadd
    //   78: istore_2
    //   79: goto +153 -> 232
    //   82: sipush 1024
    //   85: istore_3
    //   86: goto -36 -> 50
    //   89: aload_0
    //   90: invokevirtual 102	java/io/DataInputStream:close	()V
    //   93: aload_1
    //   94: invokevirtual 103	java/io/FileOutputStream:close	()V
    //   97: return
    //   98: astore_0
    //   99: aconst_null
    //   100: astore_1
    //   101: ldc 105
    //   103: aload_0
    //   104: ldc 107
    //   106: iconst_0
    //   107: anewarray 4	java/lang/Object
    //   110: invokestatic 113	com/tencent/recovery/log/RecoveryLog:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   113: aload 5
    //   115: ifnull +8 -> 123
    //   118: aload 5
    //   120: invokevirtual 102	java/io/DataInputStream:close	()V
    //   123: aload_1
    //   124: ifnull -27 -> 97
    //   127: aload_1
    //   128: invokevirtual 103	java/io/FileOutputStream:close	()V
    //   131: return
    //   132: astore_0
    //   133: return
    //   134: astore_0
    //   135: aconst_null
    //   136: astore_1
    //   137: aload 6
    //   139: astore 5
    //   141: aload 5
    //   143: ifnull +8 -> 151
    //   146: aload 5
    //   148: invokevirtual 102	java/io/DataInputStream:close	()V
    //   151: aload_1
    //   152: ifnull +7 -> 159
    //   155: aload_1
    //   156: invokevirtual 103	java/io/FileOutputStream:close	()V
    //   159: aload_0
    //   160: athrow
    //   161: astore_0
    //   162: goto -69 -> 93
    //   165: astore_0
    //   166: return
    //   167: astore_0
    //   168: goto -45 -> 123
    //   171: astore 5
    //   173: goto -22 -> 151
    //   176: astore_1
    //   177: goto -18 -> 159
    //   180: astore 6
    //   182: aconst_null
    //   183: astore_1
    //   184: aload_0
    //   185: astore 5
    //   187: aload 6
    //   189: astore_0
    //   190: goto -49 -> 141
    //   193: astore 6
    //   195: aload_0
    //   196: astore 5
    //   198: aload 6
    //   200: astore_0
    //   201: goto -60 -> 141
    //   204: astore_0
    //   205: goto -64 -> 141
    //   208: astore 6
    //   210: aconst_null
    //   211: astore_1
    //   212: aload_0
    //   213: astore 5
    //   215: aload 6
    //   217: astore_0
    //   218: goto -117 -> 101
    //   221: astore 6
    //   223: aload_0
    //   224: astore 5
    //   226: aload 6
    //   228: astore_0
    //   229: goto -128 -> 101
    //   232: iload_2
    //   233: sipush 1024
    //   236: iadd
    //   237: iload 4
    //   239: if_icmple -157 -> 82
    //   242: iload 4
    //   244: iload_2
    //   245: isub
    //   246: istore_3
    //   247: goto -197 -> 50
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	250	0	paramFile1	File
    //   0	250	1	paramFile2	File
    //   46	200	2	i	int
    //   50	197	3	j	int
    //   26	220	4	k	int
    //   4	143	5	localObject1	Object
    //   171	1	5	localIOException	java.io.IOException
    //   185	40	5	localFile	File
    //   1	137	6	localObject2	Object
    //   180	8	6	localObject3	Object
    //   193	6	6	localObject4	Object
    //   208	8	6	localException1	Exception
    //   221	6	6	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   6	22	98	java/lang/Exception
    //   127	131	132	java/io/IOException
    //   6	22	134	finally
    //   89	93	161	java/io/IOException
    //   93	97	165	java/io/IOException
    //   118	123	167	java/io/IOException
    //   146	151	171	java/io/IOException
    //   155	159	176	java/io/IOException
    //   22	38	180	finally
    //   38	45	193	finally
    //   54	63	193	finally
    //   67	75	193	finally
    //   101	113	204	finally
    //   22	38	208	java/lang/Exception
    //   38	45	221	java/lang/Exception
    //   54	63	221	java/lang/Exception
    //   67	75	221	java/lang/Exception
  }
  
  /* Error */
  public final void e(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 117	com/tencent/recovery/storage/MMappedFileStorage:xPW	Ljava/io/RandomAccessFile;
    //   6: ifnonnull +38 -> 44
    //   9: aload_0
    //   10: getfield 50	com/tencent/recovery/storage/MMappedFileStorage:xPU	Ljava/io/File;
    //   13: invokevirtual 57	java/io/File:exists	()Z
    //   16: ifne +11 -> 27
    //   19: aload_0
    //   20: getfield 50	com/tencent/recovery/storage/MMappedFileStorage:xPU	Ljava/io/File;
    //   23: invokevirtual 120	java/io/File:createNewFile	()Z
    //   26: pop
    //   27: aload_0
    //   28: new 122	java/io/RandomAccessFile
    //   31: dup
    //   32: aload_0
    //   33: getfield 50	com/tencent/recovery/storage/MMappedFileStorage:xPU	Ljava/io/File;
    //   36: ldc 124
    //   38: invokespecial 125	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   41: putfield 117	com/tencent/recovery/storage/MMappedFileStorage:xPW	Ljava/io/RandomAccessFile;
    //   44: aload_0
    //   45: getfield 127	com/tencent/recovery/storage/MMappedFileStorage:xPV	Ljava/nio/MappedByteBuffer;
    //   48: ifnonnull +26 -> 74
    //   51: aload_0
    //   52: aload_0
    //   53: getfield 117	com/tencent/recovery/storage/MMappedFileStorage:xPW	Ljava/io/RandomAccessFile;
    //   56: invokevirtual 131	java/io/RandomAccessFile:getChannel	()Ljava/nio/channels/FileChannel;
    //   59: getstatic 137	java/nio/channels/FileChannel$MapMode:READ_WRITE	Ljava/nio/channels/FileChannel$MapMode;
    //   62: lconst_0
    //   63: aload_0
    //   64: getfield 53	com/tencent/recovery/storage/MMappedFileStorage:xPS	I
    //   67: i2l
    //   68: invokevirtual 143	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   71: putfield 127	com/tencent/recovery/storage/MMappedFileStorage:xPV	Ljava/nio/MappedByteBuffer;
    //   74: aload_0
    //   75: getfield 50	com/tencent/recovery/storage/MMappedFileStorage:xPU	Ljava/io/File;
    //   78: ifnull +12 -> 90
    //   81: aload_0
    //   82: getfield 127	com/tencent/recovery/storage/MMappedFileStorage:xPV	Ljava/nio/MappedByteBuffer;
    //   85: astore_3
    //   86: aload_3
    //   87: ifnonnull +6 -> 93
    //   90: aload_0
    //   91: monitorexit
    //   92: return
    //   93: aload_0
    //   94: getfield 145	com/tencent/recovery/storage/MMappedFileStorage:currentIndex	I
    //   97: aload_1
    //   98: arraylength
    //   99: iadd
    //   100: aload_0
    //   101: getfield 53	com/tencent/recovery/storage/MMappedFileStorage:xPS	I
    //   104: if_icmpgt +7 -> 111
    //   107: iload_2
    //   108: ifeq +104 -> 212
    //   111: aload_0
    //   112: getfield 127	com/tencent/recovery/storage/MMappedFileStorage:xPV	Ljava/nio/MappedByteBuffer;
    //   115: invokevirtual 151	java/nio/MappedByteBuffer:force	()Ljava/nio/MappedByteBuffer;
    //   118: pop
    //   119: aload_0
    //   120: getfield 117	com/tencent/recovery/storage/MMappedFileStorage:xPW	Ljava/io/RandomAccessFile;
    //   123: invokevirtual 152	java/io/RandomAccessFile:close	()V
    //   126: aload_0
    //   127: getfield 50	com/tencent/recovery/storage/MMappedFileStorage:xPU	Ljava/io/File;
    //   130: aload_0
    //   131: getfield 25	com/tencent/recovery/storage/MMappedFileStorage:xPT	Ljava/io/File;
    //   134: invokestatic 64	com/tencent/recovery/storage/MMappedFileStorage:g	(Ljava/io/File;Ljava/io/File;)V
    //   137: aload_0
    //   138: iconst_4
    //   139: putfield 145	com/tencent/recovery/storage/MMappedFileStorage:currentIndex	I
    //   142: aload_0
    //   143: getfield 50	com/tencent/recovery/storage/MMappedFileStorage:xPU	Ljava/io/File;
    //   146: invokevirtual 67	java/io/File:delete	()Z
    //   149: pop
    //   150: aload_0
    //   151: getfield 50	com/tencent/recovery/storage/MMappedFileStorage:xPU	Ljava/io/File;
    //   154: invokevirtual 120	java/io/File:createNewFile	()Z
    //   157: pop
    //   158: aload_0
    //   159: new 122	java/io/RandomAccessFile
    //   162: dup
    //   163: aload_0
    //   164: getfield 50	com/tencent/recovery/storage/MMappedFileStorage:xPU	Ljava/io/File;
    //   167: ldc 124
    //   169: invokespecial 125	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   172: putfield 117	com/tencent/recovery/storage/MMappedFileStorage:xPW	Ljava/io/RandomAccessFile;
    //   175: aload_0
    //   176: aload_0
    //   177: getfield 117	com/tencent/recovery/storage/MMappedFileStorage:xPW	Ljava/io/RandomAccessFile;
    //   180: invokevirtual 131	java/io/RandomAccessFile:getChannel	()Ljava/nio/channels/FileChannel;
    //   183: getstatic 137	java/nio/channels/FileChannel$MapMode:READ_WRITE	Ljava/nio/channels/FileChannel$MapMode;
    //   186: lconst_0
    //   187: aload_0
    //   188: getfield 53	com/tencent/recovery/storage/MMappedFileStorage:xPS	I
    //   191: i2l
    //   192: invokevirtual 143	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   195: putfield 127	com/tencent/recovery/storage/MMappedFileStorage:xPV	Ljava/nio/MappedByteBuffer;
    //   198: aload_0
    //   199: getfield 127	com/tencent/recovery/storage/MMappedFileStorage:xPV	Ljava/nio/MappedByteBuffer;
    //   202: aload_0
    //   203: getfield 145	com/tencent/recovery/storage/MMappedFileStorage:currentIndex	I
    //   206: iconst_4
    //   207: isub
    //   208: invokevirtual 156	java/nio/MappedByteBuffer:putInt	(I)Ljava/nio/ByteBuffer;
    //   211: pop
    //   212: aload_1
    //   213: arraylength
    //   214: iflt -124 -> 90
    //   217: aload_0
    //   218: getfield 127	com/tencent/recovery/storage/MMappedFileStorage:xPV	Ljava/nio/MappedByteBuffer;
    //   221: aload_0
    //   222: getfield 145	com/tencent/recovery/storage/MMappedFileStorage:currentIndex	I
    //   225: invokevirtual 160	java/nio/MappedByteBuffer:position	(I)Ljava/nio/Buffer;
    //   228: pop
    //   229: aload_0
    //   230: getfield 127	com/tencent/recovery/storage/MMappedFileStorage:xPV	Ljava/nio/MappedByteBuffer;
    //   233: aload_1
    //   234: invokevirtual 164	java/nio/MappedByteBuffer:put	([B)Ljava/nio/ByteBuffer;
    //   237: pop
    //   238: aload_0
    //   239: getfield 127	com/tencent/recovery/storage/MMappedFileStorage:xPV	Ljava/nio/MappedByteBuffer;
    //   242: iconst_0
    //   243: invokevirtual 160	java/nio/MappedByteBuffer:position	(I)Ljava/nio/Buffer;
    //   246: pop
    //   247: aload_0
    //   248: aload_0
    //   249: getfield 145	com/tencent/recovery/storage/MMappedFileStorage:currentIndex	I
    //   252: aload_1
    //   253: arraylength
    //   254: iadd
    //   255: putfield 145	com/tencent/recovery/storage/MMappedFileStorage:currentIndex	I
    //   258: aload_0
    //   259: getfield 127	com/tencent/recovery/storage/MMappedFileStorage:xPV	Ljava/nio/MappedByteBuffer;
    //   262: aload_0
    //   263: getfield 145	com/tencent/recovery/storage/MMappedFileStorage:currentIndex	I
    //   266: iconst_4
    //   267: isub
    //   268: invokevirtual 156	java/nio/MappedByteBuffer:putInt	(I)Ljava/nio/ByteBuffer;
    //   271: pop
    //   272: goto -182 -> 90
    //   275: astore_1
    //   276: ldc 105
    //   278: aload_1
    //   279: ldc -90
    //   281: iconst_0
    //   282: anewarray 4	java/lang/Object
    //   285: invokestatic 113	com/tencent/recovery/log/RecoveryLog:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   288: goto -198 -> 90
    //   291: astore_1
    //   292: aload_0
    //   293: monitorexit
    //   294: aload_1
    //   295: athrow
    //   296: astore_3
    //   297: goto -171 -> 126
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	300	0	this	MMappedFileStorage
    //   0	300	1	paramArrayOfByte	byte[]
    //   0	300	2	paramBoolean	boolean
    //   85	2	3	localMappedByteBuffer	MappedByteBuffer
    //   296	1	3	localIOException	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   2	27	275	java/lang/Exception
    //   27	44	275	java/lang/Exception
    //   44	74	275	java/lang/Exception
    //   74	86	275	java/lang/Exception
    //   93	107	275	java/lang/Exception
    //   111	119	275	java/lang/Exception
    //   119	126	275	java/lang/Exception
    //   126	212	275	java/lang/Exception
    //   212	272	275	java/lang/Exception
    //   2	27	291	finally
    //   27	44	291	finally
    //   44	74	291	finally
    //   74	86	291	finally
    //   93	107	291	finally
    //   111	119	291	finally
    //   119	126	291	finally
    //   126	212	291	finally
    //   212	272	291	finally
    //   276	288	291	finally
    //   119	126	296	java/io/IOException
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\recovery\storage\MMappedFileStorage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */