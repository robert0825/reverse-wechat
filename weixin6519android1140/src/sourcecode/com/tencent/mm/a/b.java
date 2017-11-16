package com.tencent.mm.a;

import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class b
{
  static ae epK;
  File epH;
  public ReentrantLock epI;
  public Condition epJ;
  
  public b(final String paramString)
  {
    GMTrace.i(13859054157824L, 103258);
    this.epI = new ReentrantLock();
    this.epJ = this.epI.newCondition();
    try
    {
      if (epK == null)
      {
        localObject = new HandlerThread("I/O Worker");
        ((HandlerThread)localObject).start();
        epK = new ae(((HandlerThread)localObject).getLooper());
      }
      Object localObject = new File(paramString);
      if (((File)localObject).exists())
      {
        this.epH = ((File)localObject);
        GMTrace.o(13859054157824L, 103258);
        return;
      }
    }
    finally {}
    w.i("MicroMsg.ConcurrentFileBuilder", "create new file %s", new Object[] { paramString });
    epK.post(new Runnable()
    {
      /* Error */
      public final void run()
      {
        // Byte code:
        //   0: ldc2_w 38
        //   3: ldc 40
        //   5: invokestatic 30	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: new 42	java/io/File
        //   11: dup
        //   12: aload_0
        //   13: getfield 18	com/tencent/mm/a/b$1:epL	Ljava/lang/String;
        //   16: invokespecial 45	java/io/File:<init>	(Ljava/lang/String;)V
        //   19: astore_3
        //   20: aload_3
        //   21: invokevirtual 49	java/io/File:exists	()Z
        //   24: ifne +67 -> 91
        //   27: invokestatic 55	java/lang/System:currentTimeMillis	()J
        //   30: lstore_1
        //   31: aload_0
        //   32: getfield 18	com/tencent/mm/a/b$1:epL	Ljava/lang/String;
        //   35: invokestatic 60	com/tencent/mm/a/e:bf	(Ljava/lang/String;)V
        //   38: ldc 62
        //   40: ldc 64
        //   42: iconst_1
        //   43: anewarray 4	java/lang/Object
        //   46: dup
        //   47: iconst_0
        //   48: invokestatic 55	java/lang/System:currentTimeMillis	()J
        //   51: lload_1
        //   52: lsub
        //   53: invokestatic 70	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   56: aastore
        //   57: invokestatic 75	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   60: invokestatic 55	java/lang/System:currentTimeMillis	()J
        //   63: lstore_1
        //   64: aload_3
        //   65: invokevirtual 78	java/io/File:createNewFile	()Z
        //   68: pop
        //   69: ldc 62
        //   71: ldc 80
        //   73: iconst_1
        //   74: anewarray 4	java/lang/Object
        //   77: dup
        //   78: iconst_0
        //   79: invokestatic 55	java/lang/System:currentTimeMillis	()J
        //   82: lload_1
        //   83: lsub
        //   84: invokestatic 70	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   87: aastore
        //   88: invokestatic 75	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   91: aload_0
        //   92: getfield 16	com/tencent/mm/a/b$1:epM	Lcom/tencent/mm/a/b;
        //   95: getfield 84	com/tencent/mm/a/b:epI	Ljava/util/concurrent/locks/ReentrantLock;
        //   98: invokevirtual 89	java/util/concurrent/locks/ReentrantLock:lock	()V
        //   101: aload_0
        //   102: getfield 16	com/tencent/mm/a/b$1:epM	Lcom/tencent/mm/a/b;
        //   105: aload_3
        //   106: putfield 93	com/tencent/mm/a/b:epH	Ljava/io/File;
        //   109: aload_0
        //   110: getfield 16	com/tencent/mm/a/b$1:epM	Lcom/tencent/mm/a/b;
        //   113: getfield 97	com/tencent/mm/a/b:epJ	Ljava/util/concurrent/locks/Condition;
        //   116: invokeinterface 102 1 0
        //   121: ldc 62
        //   123: ldc 104
        //   125: iconst_1
        //   126: anewarray 4	java/lang/Object
        //   129: dup
        //   130: iconst_0
        //   131: aload_3
        //   132: invokevirtual 108	java/io/File:getAbsoluteFile	()Ljava/io/File;
        //   135: aastore
        //   136: invokestatic 75	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   139: aload_0
        //   140: getfield 16	com/tencent/mm/a/b$1:epM	Lcom/tencent/mm/a/b;
        //   143: getfield 84	com/tencent/mm/a/b:epI	Ljava/util/concurrent/locks/ReentrantLock;
        //   146: invokevirtual 111	java/util/concurrent/locks/ReentrantLock:unlock	()V
        //   149: ldc2_w 38
        //   152: ldc 40
        //   154: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   157: return
        //   158: astore 4
        //   160: ldc 62
        //   162: aload 4
        //   164: ldc 113
        //   166: iconst_0
        //   167: anewarray 4	java/lang/Object
        //   170: invokestatic 117	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
        //   173: ldc 62
        //   175: aload 4
        //   177: ldc 118
        //   179: iconst_0
        //   180: anewarray 4	java/lang/Object
        //   183: invokestatic 117	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
        //   186: goto -117 -> 69
        //   189: astore_3
        //   190: aload_0
        //   191: getfield 16	com/tencent/mm/a/b$1:epM	Lcom/tencent/mm/a/b;
        //   194: getfield 84	com/tencent/mm/a/b:epI	Ljava/util/concurrent/locks/ReentrantLock;
        //   197: invokevirtual 111	java/util/concurrent/locks/ReentrantLock:unlock	()V
        //   200: aload_3
        //   201: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	202	0	this	1
        //   30	53	1	l	long
        //   19	113	3	localFile	File
        //   189	12	3	localObject	Object
        //   158	18	4	localIOException	java.io.IOException
        // Exception table:
        //   from	to	target	type
        //   64	69	158	java/io/IOException
        //   101	139	189	finally
      }
    });
    GMTrace.o(13859054157824L, 103258);
  }
  
  /* Error */
  public final File ov()
  {
    // Byte code:
    //   0: ldc2_w 93
    //   3: ldc 95
    //   5: invokestatic 28	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: getfield 33	com/tencent/mm/a/b:epI	Ljava/util/concurrent/locks/ReentrantLock;
    //   12: invokevirtual 98	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   15: aload_0
    //   16: getfield 68	com/tencent/mm/a/b:epH	Ljava/io/File;
    //   19: ifnonnull +45 -> 64
    //   22: ldc 73
    //   24: ldc 100
    //   26: invokestatic 103	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   29: aload_0
    //   30: getfield 39	com/tencent/mm/a/b:epJ	Ljava/util/concurrent/locks/Condition;
    //   33: invokeinterface 108 1 0
    //   38: goto -23 -> 15
    //   41: astore_1
    //   42: aload_0
    //   43: getfield 33	com/tencent/mm/a/b:epI	Ljava/util/concurrent/locks/ReentrantLock;
    //   46: invokevirtual 111	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   49: aload_0
    //   50: getfield 68	com/tencent/mm/a/b:epH	Ljava/io/File;
    //   53: astore_1
    //   54: ldc2_w 93
    //   57: ldc 95
    //   59: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   62: aload_1
    //   63: areturn
    //   64: aload_0
    //   65: getfield 33	com/tencent/mm/a/b:epI	Ljava/util/concurrent/locks/ReentrantLock;
    //   68: invokevirtual 111	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   71: goto -22 -> 49
    //   74: astore_1
    //   75: aload_0
    //   76: getfield 33	com/tencent/mm/a/b:epI	Ljava/util/concurrent/locks/ReentrantLock;
    //   79: invokevirtual 111	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   82: aload_1
    //   83: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	this	b
    //   41	1	1	localException	Exception
    //   53	10	1	localFile	File
    //   74	9	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   15	38	41	java/lang/Exception
    //   15	38	74	finally
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */