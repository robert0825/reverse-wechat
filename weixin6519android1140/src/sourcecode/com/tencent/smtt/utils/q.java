package com.tencent.smtt.utils;

import android.annotation.TargetApi;
import android.content.Context;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;

public final class q
{
  private static q xYW = null;
  private Context mContext = null;
  private File xYV = null;
  public String xYX = "http://log.tbs.qq.com/ajax?c=pu&v=2&k=";
  public String xYY = "http://log.tbs.qq.com/ajax?c=pu&tk=";
  private String xYZ = "http://wup.imtt.qq.com:8080";
  public String xZa = "http://log.tbs.qq.com/ajax?c=dl&k=";
  public String xZb = "http://cfg.imtt.qq.com/tbs?v=2&mk=";
  public String xZc = "http://log.tbs.qq.com/ajax?c=ul&v=2&k=";
  private String xZd = "http://mqqad.html5.qq.com/adjs";
  private String xZe = "http://log.tbs.qq.com/ajax?c=ucfu&k=";
  
  @TargetApi(11)
  private q(Context paramContext)
  {
    TbsLog.w("TbsCommonConfig", "TbsCommonConfig constructing...");
    this.mContext = paramContext.getApplicationContext();
    cps();
  }
  
  public static q cpr()
  {
    try
    {
      q localq = xYW;
      return localq;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  private void cps()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aconst_null
    //   3: astore_1
    //   4: aload_0
    //   5: invokespecial 97	com/tencent/smtt/utils/q:cpt	()Ljava/io/File;
    //   8: astore_2
    //   9: aload_2
    //   10: ifnonnull +13 -> 23
    //   13: ldc 69
    //   15: ldc 99
    //   17: invokestatic 102	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: new 104	java/io/BufferedInputStream
    //   26: dup
    //   27: new 106	java/io/FileInputStream
    //   30: dup
    //   31: aload_2
    //   32: invokespecial 109	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   35: invokespecial 112	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   38: astore_2
    //   39: new 114	java/util/Properties
    //   42: dup
    //   43: invokespecial 115	java/util/Properties:<init>	()V
    //   46: astore_1
    //   47: aload_1
    //   48: aload_2
    //   49: invokevirtual 118	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   52: aload_1
    //   53: ldc 120
    //   55: ldc 122
    //   57: invokevirtual 126	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   60: astore_3
    //   61: ldc 122
    //   63: aload_3
    //   64: invokevirtual 132	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   67: ifne +8 -> 75
    //   70: aload_0
    //   71: aload_3
    //   72: putfield 39	com/tencent/smtt/utils/q:xYX	Ljava/lang/String;
    //   75: aload_1
    //   76: ldc -122
    //   78: ldc 122
    //   80: invokevirtual 126	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   83: astore_3
    //   84: ldc 122
    //   86: aload_3
    //   87: invokevirtual 132	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   90: ifne +8 -> 98
    //   93: aload_0
    //   94: aload_3
    //   95: putfield 47	com/tencent/smtt/utils/q:xYZ	Ljava/lang/String;
    //   98: aload_1
    //   99: ldc -120
    //   101: ldc 122
    //   103: invokevirtual 126	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   106: astore_3
    //   107: ldc 122
    //   109: aload_3
    //   110: invokevirtual 132	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   113: ifne +8 -> 121
    //   116: aload_0
    //   117: aload_3
    //   118: putfield 51	com/tencent/smtt/utils/q:xZa	Ljava/lang/String;
    //   121: aload_1
    //   122: ldc -118
    //   124: ldc 122
    //   126: invokevirtual 126	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   129: astore_3
    //   130: ldc 122
    //   132: aload_3
    //   133: invokevirtual 132	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   136: ifne +8 -> 144
    //   139: aload_0
    //   140: aload_3
    //   141: putfield 55	com/tencent/smtt/utils/q:xZb	Ljava/lang/String;
    //   144: aload_1
    //   145: ldc -116
    //   147: ldc 122
    //   149: invokevirtual 126	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   152: astore_3
    //   153: ldc 122
    //   155: aload_3
    //   156: invokevirtual 132	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   159: ifne +8 -> 167
    //   162: aload_0
    //   163: aload_3
    //   164: putfield 59	com/tencent/smtt/utils/q:xZc	Ljava/lang/String;
    //   167: aload_1
    //   168: ldc -114
    //   170: ldc 122
    //   172: invokevirtual 126	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   175: astore_3
    //   176: ldc 122
    //   178: aload_3
    //   179: invokevirtual 132	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   182: ifne +8 -> 190
    //   185: aload_0
    //   186: aload_3
    //   187: putfield 63	com/tencent/smtt/utils/q:xZd	Ljava/lang/String;
    //   190: aload_1
    //   191: ldc -112
    //   193: ldc 122
    //   195: invokevirtual 126	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   198: astore_3
    //   199: ldc 122
    //   201: aload_3
    //   202: invokevirtual 132	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   205: ifne +8 -> 213
    //   208: aload_0
    //   209: aload_3
    //   210: putfield 67	com/tencent/smtt/utils/q:xZe	Ljava/lang/String;
    //   213: aload_1
    //   214: ldc -110
    //   216: ldc 122
    //   218: invokevirtual 126	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   221: astore_1
    //   222: ldc 122
    //   224: aload_1
    //   225: invokevirtual 132	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   228: ifne +8 -> 236
    //   231: aload_0
    //   232: aload_1
    //   233: putfield 43	com/tencent/smtt/utils/q:xYY	Ljava/lang/String;
    //   236: aload_2
    //   237: invokevirtual 149	java/io/BufferedInputStream:close	()V
    //   240: goto -220 -> 20
    //   243: astore_1
    //   244: goto -224 -> 20
    //   247: astore_2
    //   248: new 151	java/io/StringWriter
    //   251: dup
    //   252: invokespecial 152	java/io/StringWriter:<init>	()V
    //   255: astore_3
    //   256: aload_2
    //   257: new 154	java/io/PrintWriter
    //   260: dup
    //   261: aload_3
    //   262: invokespecial 157	java/io/PrintWriter:<init>	(Ljava/io/Writer;)V
    //   265: invokevirtual 161	java/lang/Throwable:printStackTrace	(Ljava/io/PrintWriter;)V
    //   268: ldc 69
    //   270: new 163	java/lang/StringBuilder
    //   273: dup
    //   274: ldc -91
    //   276: invokespecial 168	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   279: aload_3
    //   280: invokevirtual 172	java/io/StringWriter:toString	()Ljava/lang/String;
    //   283: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   286: invokevirtual 177	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   289: invokestatic 102	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   292: aload_1
    //   293: ifnull -273 -> 20
    //   296: aload_1
    //   297: invokevirtual 149	java/io/BufferedInputStream:close	()V
    //   300: goto -280 -> 20
    //   303: astore_1
    //   304: goto -284 -> 20
    //   307: astore_1
    //   308: aconst_null
    //   309: astore_2
    //   310: aload_2
    //   311: ifnull +7 -> 318
    //   314: aload_2
    //   315: invokevirtual 149	java/io/BufferedInputStream:close	()V
    //   318: aload_1
    //   319: athrow
    //   320: astore_1
    //   321: aload_0
    //   322: monitorexit
    //   323: aload_1
    //   324: athrow
    //   325: astore_2
    //   326: goto -8 -> 318
    //   329: astore_1
    //   330: goto -20 -> 310
    //   333: astore_3
    //   334: aload_1
    //   335: astore_2
    //   336: aload_3
    //   337: astore_1
    //   338: goto -28 -> 310
    //   341: astore_3
    //   342: aload_2
    //   343: astore_1
    //   344: aload_3
    //   345: astore_2
    //   346: goto -98 -> 248
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	349	0	this	q
    //   3	230	1	localObject1	Object
    //   243	54	1	localIOException1	java.io.IOException
    //   303	1	1	localIOException2	java.io.IOException
    //   307	12	1	localObject2	Object
    //   320	4	1	localObject3	Object
    //   329	6	1	localObject4	Object
    //   337	7	1	localObject5	Object
    //   8	229	2	localObject6	Object
    //   247	10	2	localThrowable1	Throwable
    //   309	6	2	localObject7	Object
    //   325	1	2	localIOException3	java.io.IOException
    //   335	11	2	localObject8	Object
    //   60	220	3	localObject9	Object
    //   333	4	3	localObject10	Object
    //   341	4	3	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   236	240	243	java/io/IOException
    //   4	9	247	java/lang/Throwable
    //   13	20	247	java/lang/Throwable
    //   23	39	247	java/lang/Throwable
    //   296	300	303	java/io/IOException
    //   4	9	307	finally
    //   13	20	307	finally
    //   23	39	307	finally
    //   236	240	320	finally
    //   296	300	320	finally
    //   314	318	320	finally
    //   318	320	320	finally
    //   314	318	325	java/io/IOException
    //   39	75	329	finally
    //   75	98	329	finally
    //   98	121	329	finally
    //   121	144	329	finally
    //   144	167	329	finally
    //   167	190	329	finally
    //   190	213	329	finally
    //   213	236	329	finally
    //   248	292	333	finally
    //   39	75	341	java/lang/Throwable
    //   75	98	341	java/lang/Throwable
    //   98	121	341	java/lang/Throwable
    //   121	144	341	java/lang/Throwable
    //   144	167	341	java/lang/Throwable
    //   167	190	341	java/lang/Throwable
    //   190	213	341	java/lang/Throwable
    //   213	236	341	java/lang/Throwable
  }
  
  private File cpt()
  {
    try
    {
      if (this.xYV == null)
      {
        this.xYV = new File(f.an(this.mContext, 5));
        if ((this.xYV == null) || (!this.xYV.isDirectory())) {
          break label177;
        }
      }
      localFile = new File(this.xYV, "tbsnet.conf");
      if (!localFile.exists())
      {
        TbsLog.e("TbsCommonConfig", "Get file(" + localFile.getCanonicalPath() + ") failed!");
        return null;
      }
      try
      {
        TbsLog.w("TbsCommonConfig", "pathc:" + localFile.getCanonicalPath());
        return localFile;
      }
      catch (Throwable localThrowable1) {}
    }
    catch (Throwable localThrowable2)
    {
      for (;;)
      {
        StringWriter localStringWriter;
        File localFile = null;
      }
    }
    localStringWriter = new StringWriter();
    localThrowable1.printStackTrace(new PrintWriter(localStringWriter));
    TbsLog.e("TbsCommonConfig", "exceptions occurred2:" + localStringWriter.toString());
    return localFile;
    label177:
    return null;
  }
  
  public static q hA(Context paramContext)
  {
    try
    {
      if (xYW == null) {
        xYW = new q(paramContext);
      }
      paramContext = xYW;
      return paramContext;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\utils\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */