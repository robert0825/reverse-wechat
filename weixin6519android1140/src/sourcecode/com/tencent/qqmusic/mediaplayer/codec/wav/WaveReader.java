package com.tencent.qqmusic.mediaplayer.codec.wav;

public class WaveReader
{
  private static final String TAG = "WaveReader";
  private static final int WAV_FORMAT = 1463899717;
  private static final int WAV_FORMAT_CHUNK_ID = 1718449184;
  private static final int WAV_HEADER_CHUNK_ID = 1380533830;
  private static final int WAV_HEADER_SIZE = 50;
  
  private static short byteToShortLE(byte paramByte1, byte paramByte2)
  {
    return (short)(paramByte1 & 0xFF | (paramByte2 & 0xFF) << 8);
  }
  
  /* Error */
  public static boolean isWavFormat(String paramString)
  {
    // Byte code:
    //   0: bipush 50
    //   2: invokestatic 34	com/tencent/qqmusic/mediaplayer/CacheBytesManager:getStatic	(I)[B
    //   5: astore 4
    //   7: new 36	java/io/FileInputStream
    //   10: dup
    //   11: aload_0
    //   12: invokespecial 39	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   15: astore_2
    //   16: aload_2
    //   17: astore_0
    //   18: aload_2
    //   19: aload 4
    //   21: invokevirtual 45	java/io/InputStream:read	([B)I
    //   24: pop
    //   25: aload_2
    //   26: astore_0
    //   27: aload 4
    //   29: iconst_0
    //   30: invokestatic 49	com/tencent/qqmusic/mediaplayer/codec/wav/WaveReader:readUnsignedInt	([BI)I
    //   33: istore_1
    //   34: iload_1
    //   35: ldc 15
    //   37: if_icmpeq +48 -> 85
    //   40: aload_2
    //   41: astore_0
    //   42: ldc 8
    //   44: new 51	java/lang/StringBuilder
    //   47: dup
    //   48: ldc 53
    //   50: invokespecial 54	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   53: iload_1
    //   54: invokevirtual 58	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   57: invokevirtual 62	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   60: invokestatic 68	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   63: aload_2
    //   64: invokevirtual 71	java/io/InputStream:close	()V
    //   67: aload 4
    //   69: invokestatic 75	com/tencent/qqmusic/mediaplayer/CacheBytesManager:recycle	([B)[B
    //   72: pop
    //   73: iconst_0
    //   74: ireturn
    //   75: astore_0
    //   76: ldc 8
    //   78: aload_0
    //   79: invokestatic 79	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   82: goto -15 -> 67
    //   85: aload_2
    //   86: astore_0
    //   87: aload 4
    //   89: bipush 8
    //   91: invokestatic 49	com/tencent/qqmusic/mediaplayer/codec/wav/WaveReader:readUnsignedInt	([BI)I
    //   94: istore_1
    //   95: iload_1
    //   96: ldc 11
    //   98: if_icmpeq +48 -> 146
    //   101: aload_2
    //   102: astore_0
    //   103: ldc 8
    //   105: new 51	java/lang/StringBuilder
    //   108: dup
    //   109: ldc 81
    //   111: invokespecial 54	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   114: iload_1
    //   115: invokevirtual 58	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   118: invokevirtual 62	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   121: invokestatic 68	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   124: aload_2
    //   125: invokevirtual 71	java/io/InputStream:close	()V
    //   128: aload 4
    //   130: invokestatic 75	com/tencent/qqmusic/mediaplayer/CacheBytesManager:recycle	([B)[B
    //   133: pop
    //   134: iconst_0
    //   135: ireturn
    //   136: astore_0
    //   137: ldc 8
    //   139: aload_0
    //   140: invokestatic 79	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   143: goto -15 -> 128
    //   146: aload_2
    //   147: astore_0
    //   148: aload 4
    //   150: bipush 12
    //   152: invokestatic 49	com/tencent/qqmusic/mediaplayer/codec/wav/WaveReader:readUnsignedInt	([BI)I
    //   155: istore_1
    //   156: iload_1
    //   157: ldc 13
    //   159: if_icmpeq +48 -> 207
    //   162: aload_2
    //   163: astore_0
    //   164: ldc 8
    //   166: new 51	java/lang/StringBuilder
    //   169: dup
    //   170: ldc 83
    //   172: invokespecial 54	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   175: iload_1
    //   176: invokevirtual 58	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   179: invokevirtual 62	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   182: invokestatic 68	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   185: aload_2
    //   186: invokevirtual 71	java/io/InputStream:close	()V
    //   189: aload 4
    //   191: invokestatic 75	com/tencent/qqmusic/mediaplayer/CacheBytesManager:recycle	([B)[B
    //   194: pop
    //   195: iconst_0
    //   196: ireturn
    //   197: astore_0
    //   198: ldc 8
    //   200: aload_0
    //   201: invokestatic 79	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   204: goto -15 -> 189
    //   207: aload_2
    //   208: astore_0
    //   209: aload 4
    //   211: bipush 16
    //   213: invokestatic 86	com/tencent/qqmusic/mediaplayer/codec/wav/WaveReader:readUnsignedIntLE	([BI)I
    //   216: istore_1
    //   217: aload_2
    //   218: astore_0
    //   219: ldc 8
    //   221: new 51	java/lang/StringBuilder
    //   224: dup
    //   225: ldc 88
    //   227: invokespecial 54	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   230: iload_1
    //   231: invokevirtual 58	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   234: invokevirtual 62	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   237: invokestatic 68	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   240: aload_2
    //   241: astore_0
    //   242: aload 4
    //   244: bipush 20
    //   246: invokestatic 92	com/tencent/qqmusic/mediaplayer/codec/wav/WaveReader:readUnsignedShortLE	([BI)S
    //   249: istore_1
    //   250: aload_2
    //   251: astore_0
    //   252: ldc 8
    //   254: new 51	java/lang/StringBuilder
    //   257: dup
    //   258: ldc 94
    //   260: invokespecial 54	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   263: iload_1
    //   264: invokevirtual 58	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   267: invokevirtual 62	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   270: invokestatic 68	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   273: aload_2
    //   274: invokevirtual 71	java/io/InputStream:close	()V
    //   277: aload 4
    //   279: invokestatic 75	com/tencent/qqmusic/mediaplayer/CacheBytesManager:recycle	([B)[B
    //   282: pop
    //   283: iconst_1
    //   284: ireturn
    //   285: astore_0
    //   286: ldc 8
    //   288: aload_0
    //   289: invokestatic 79	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   292: goto -15 -> 277
    //   295: astore_3
    //   296: aconst_null
    //   297: astore_2
    //   298: aload_2
    //   299: astore_0
    //   300: ldc 8
    //   302: aload_3
    //   303: invokestatic 79	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   306: aload_2
    //   307: ifnull +7 -> 314
    //   310: aload_2
    //   311: invokevirtual 71	java/io/InputStream:close	()V
    //   314: aload 4
    //   316: invokestatic 75	com/tencent/qqmusic/mediaplayer/CacheBytesManager:recycle	([B)[B
    //   319: pop
    //   320: iconst_0
    //   321: ireturn
    //   322: astore_0
    //   323: ldc 8
    //   325: aload_0
    //   326: invokestatic 79	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   329: goto -15 -> 314
    //   332: astore_2
    //   333: aconst_null
    //   334: astore_0
    //   335: aload_0
    //   336: ifnull +7 -> 343
    //   339: aload_0
    //   340: invokevirtual 71	java/io/InputStream:close	()V
    //   343: aload 4
    //   345: invokestatic 75	com/tencent/qqmusic/mediaplayer/CacheBytesManager:recycle	([B)[B
    //   348: pop
    //   349: aload_2
    //   350: athrow
    //   351: astore_0
    //   352: ldc 8
    //   354: aload_0
    //   355: invokestatic 79	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   358: goto -15 -> 343
    //   361: astore_2
    //   362: goto -27 -> 335
    //   365: astore_3
    //   366: goto -68 -> 298
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	369	0	paramString	String
    //   33	231	1	i	int
    //   15	296	2	localFileInputStream	java.io.FileInputStream
    //   332	18	2	localObject1	Object
    //   361	1	2	localObject2	Object
    //   295	8	3	localException1	Exception
    //   365	1	3	localException2	Exception
    //   5	339	4	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   63	67	75	java/lang/Exception
    //   124	128	136	java/lang/Exception
    //   185	189	197	java/lang/Exception
    //   273	277	285	java/lang/Exception
    //   7	16	295	java/lang/Exception
    //   310	314	322	java/lang/Exception
    //   7	16	332	finally
    //   339	343	351	java/lang/Exception
    //   18	25	361	finally
    //   27	34	361	finally
    //   42	63	361	finally
    //   87	95	361	finally
    //   103	124	361	finally
    //   148	156	361	finally
    //   164	185	361	finally
    //   209	217	361	finally
    //   219	240	361	finally
    //   242	250	361	finally
    //   252	273	361	finally
    //   300	306	361	finally
    //   18	25	365	java/lang/Exception
    //   27	34	365	java/lang/Exception
    //   42	63	365	java/lang/Exception
    //   87	95	365	java/lang/Exception
    //   103	124	365	java/lang/Exception
    //   148	156	365	java/lang/Exception
    //   164	185	365	java/lang/Exception
    //   209	217	365	java/lang/Exception
    //   219	240	365	java/lang/Exception
    //   242	250	365	java/lang/Exception
    //   252	273	365	java/lang/Exception
  }
  
  private static int readUnsignedInt(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramInt + 4 > paramArrayOfByte.length) {
      return -1;
    }
    return (paramArrayOfByte[paramInt] & 0xFF) << 24 | (paramArrayOfByte[(paramInt + 1)] & 0xFF) << 16 | (paramArrayOfByte[(paramInt + 2)] & 0xFF) << 8 | paramArrayOfByte[(paramInt + 3)] & 0xFF;
  }
  
  private static int readUnsignedIntLE(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramInt + 4 > paramArrayOfByte.length) {
      return -1;
    }
    return paramArrayOfByte[0] & 0xFF | (paramArrayOfByte[(paramInt + 1)] & 0xFF) << 8 | (paramArrayOfByte[(paramInt + 2)] & 0xFF) << 16 | (paramArrayOfByte[(paramInt + 3)] & 0xFF) << 24;
  }
  
  private static short readUnsignedShortLE(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramInt + 2 > paramArrayOfByte.length) {
      return -1;
    }
    return byteToShortLE(paramArrayOfByte[paramInt], paramArrayOfByte[(paramInt + 1)]);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\codec\wav\WaveReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */