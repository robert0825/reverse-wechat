package com.tencent.qqmusic.mediaplayer.util;

public class CpuInfoUtil
{
  private static final String CUR_CPU_FREQ = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq";
  private static final String TAG = "CpuInfoUtil";
  private static OutputCpuThread mCurrThread = null;
  
  public static void outputCpuHZToLog() {}
  
  public static void outputThreadInfoToLog() {}
  
  public static void startProcessInfoOutput() {}
  
  public static void stopProcessInfoOutput()
  {
    try
    {
      mCurrThread = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private static class OutputCpuThread
    extends Thread
  {
    public boolean isStop = false;
    
    public OutputCpuThread(String paramString)
    {
      super();
    }
    
    /* Error */
    public void run()
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore 4
      //   3: aload_0
      //   4: invokespecial 24	java/lang/Thread:run	()V
      //   7: new 26	java/lang/StringBuilder
      //   10: dup
      //   11: invokespecial 28	java/lang/StringBuilder:<init>	()V
      //   14: astore_2
      //   15: invokestatic 34	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
      //   18: ldc 36
      //   20: invokevirtual 40	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
      //   23: astore_3
      //   24: new 42	java/io/BufferedReader
      //   27: dup
      //   28: new 44	java/io/InputStreamReader
      //   31: dup
      //   32: aload_3
      //   33: invokevirtual 50	java/lang/Process:getInputStream	()Ljava/io/InputStream;
      //   36: invokespecial 53	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
      //   39: invokespecial 56	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
      //   42: astore 5
      //   44: iconst_0
      //   45: istore_1
      //   46: aload 5
      //   48: invokevirtual 60	java/io/BufferedReader:readLine	()Ljava/lang/String;
      //   51: astore 4
      //   53: aload 4
      //   55: ifnull +76 -> 131
      //   58: aload_0
      //   59: getfield 15	com/tencent/qqmusic/mediaplayer/util/CpuInfoUtil$OutputCpuThread:isStop	Z
      //   62: ifne +69 -> 131
      //   65: iload_1
      //   66: iconst_1
      //   67: iadd
      //   68: istore_1
      //   69: aload_2
      //   70: aload 4
      //   72: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   75: ldc 66
      //   77: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   80: pop
      //   81: iload_1
      //   82: bipush 15
      //   84: if_icmple +194 -> 278
      //   87: ldc 68
      //   89: aload_2
      //   90: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   93: invokestatic 77	com/tencent/qqmusic/mediaplayer/util/Logger:d	(Ljava/lang/String;Ljava/lang/String;)V
      //   96: aload_2
      //   97: iconst_0
      //   98: aload_2
      //   99: invokevirtual 81	java/lang/StringBuilder:length	()I
      //   102: iconst_1
      //   103: isub
      //   104: invokevirtual 85	java/lang/StringBuilder:delete	(II)Ljava/lang/StringBuilder;
      //   107: pop
      //   108: ldc2_w 86
      //   111: invokestatic 91	com/tencent/qqmusic/mediaplayer/util/CpuInfoUtil$OutputCpuThread:sleep	(J)V
      //   114: iconst_0
      //   115: istore_1
      //   116: goto -70 -> 46
      //   119: astore 4
      //   121: ldc 68
      //   123: aload 4
      //   125: invokestatic 95	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   128: goto -82 -> 46
      //   131: aload 5
      //   133: invokevirtual 98	java/io/BufferedReader:close	()V
      //   136: aload_3
      //   137: ifnull +7 -> 144
      //   140: aload_3
      //   141: invokevirtual 101	java/lang/Process:destroy	()V
      //   144: return
      //   145: astore_2
      //   146: ldc 68
      //   148: aload_2
      //   149: invokestatic 95	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   152: goto -16 -> 136
      //   155: astore_2
      //   156: aconst_null
      //   157: astore_3
      //   158: ldc 68
      //   160: aload_2
      //   161: invokestatic 95	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   164: aload 4
      //   166: ifnull +8 -> 174
      //   169: aload 4
      //   171: invokevirtual 98	java/io/BufferedReader:close	()V
      //   174: aload_3
      //   175: ifnull -31 -> 144
      //   178: aload_3
      //   179: invokevirtual 101	java/lang/Process:destroy	()V
      //   182: return
      //   183: astore_2
      //   184: ldc 68
      //   186: aload_2
      //   187: invokestatic 95	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   190: goto -16 -> 174
      //   193: astore_2
      //   194: aconst_null
      //   195: astore 4
      //   197: aconst_null
      //   198: astore_3
      //   199: aload_3
      //   200: ifnull +7 -> 207
      //   203: aload_3
      //   204: invokevirtual 98	java/io/BufferedReader:close	()V
      //   207: aload 4
      //   209: ifnull +8 -> 217
      //   212: aload 4
      //   214: invokevirtual 101	java/lang/Process:destroy	()V
      //   217: aload_2
      //   218: athrow
      //   219: astore_3
      //   220: ldc 68
      //   222: aload_3
      //   223: invokestatic 95	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   226: goto -19 -> 207
      //   229: astore_2
      //   230: aconst_null
      //   231: astore 5
      //   233: aload_3
      //   234: astore 4
      //   236: aload 5
      //   238: astore_3
      //   239: goto -40 -> 199
      //   242: astore_2
      //   243: aload_3
      //   244: astore 4
      //   246: aload 5
      //   248: astore_3
      //   249: goto -50 -> 199
      //   252: astore_2
      //   253: aload 4
      //   255: astore 5
      //   257: aload_3
      //   258: astore 4
      //   260: aload 5
      //   262: astore_3
      //   263: goto -64 -> 199
      //   266: astore_2
      //   267: goto -109 -> 158
      //   270: astore_2
      //   271: aload 5
      //   273: astore 4
      //   275: goto -117 -> 158
      //   278: goto -232 -> 46
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	281	0	this	OutputCpuThread
      //   45	71	1	i	int
      //   14	85	2	localStringBuilder	StringBuilder
      //   145	4	2	localIOException1	java.io.IOException
      //   155	6	2	localException1	Exception
      //   183	4	2	localIOException2	java.io.IOException
      //   193	25	2	localObject1	Object
      //   229	1	2	localObject2	Object
      //   242	1	2	localObject3	Object
      //   252	1	2	localObject4	Object
      //   266	1	2	localException2	Exception
      //   270	1	2	localException3	Exception
      //   23	181	3	localProcess	Process
      //   219	15	3	localIOException3	java.io.IOException
      //   238	25	3	localObject5	Object
      //   1	70	4	str	String
      //   119	51	4	localException4	Exception
      //   195	79	4	localObject6	Object
      //   42	230	5	localObject7	Object
      // Exception table:
      //   from	to	target	type
      //   87	114	119	java/lang/Exception
      //   131	136	145	java/io/IOException
      //   15	24	155	java/lang/Exception
      //   169	174	183	java/io/IOException
      //   15	24	193	finally
      //   203	207	219	java/io/IOException
      //   24	44	229	finally
      //   46	53	242	finally
      //   58	65	242	finally
      //   69	81	242	finally
      //   87	114	242	finally
      //   121	128	242	finally
      //   158	164	252	finally
      //   24	44	266	java/lang/Exception
      //   46	53	270	java/lang/Exception
      //   58	65	270	java/lang/Exception
      //   69	81	270	java/lang/Exception
      //   121	128	270	java/lang/Exception
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\util\CpuInfoUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */