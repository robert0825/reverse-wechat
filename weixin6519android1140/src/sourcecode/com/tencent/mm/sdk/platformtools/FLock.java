package com.tencent.mm.sdk.platformtools;

import com.tencent.gmtrace.GMTrace;
import java.io.File;
import java.io.IOException;

public class FLock
{
  private File hJl;
  private volatile int vhx;
  
  public FLock(File paramFile, boolean paramBoolean)
  {
    GMTrace.i(13952603914240L, 103955);
    this.hJl = null;
    this.vhx = -1;
    if (!paramFile.exists()) {}
    while (paramFile.isFile()) {
      try
      {
        paramFile.createNewFile();
        this.hJl = paramFile;
        GMTrace.o(13952603914240L, 103955);
        return;
      }
      catch (IOException paramFile)
      {
        throw new IllegalStateException(paramFile);
      }
    }
    throw new IllegalArgumentException("target is not a file.");
  }
  
  public FLock(String paramString)
  {
    this(new File(paramString), true);
    GMTrace.i(13952469696512L, 103954);
    GMTrace.o(13952469696512L, 103954);
  }
  
  private void free()
  {
    try
    {
      GMTrace.i(13953006567424L, 103958);
      if (this.vhx != -1)
      {
        nativeFree(this.vhx);
        this.vhx = -1;
      }
      GMTrace.o(13953006567424L, 103958);
      return;
    }
    finally {}
  }
  
  /* Error */
  private int init()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 73
    //   5: ldc 75
    //   7: invokestatic 24	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: getfield 26	com/tencent/mm/sdk/platformtools/FLock:hJl	Ljava/io/File;
    //   14: invokevirtual 34	java/io/File:exists	()Z
    //   17: istore_2
    //   18: iload_2
    //   19: ifne +16 -> 35
    //   22: aload_0
    //   23: getfield 26	com/tencent/mm/sdk/platformtools/FLock:hJl	Ljava/io/File;
    //   26: invokevirtual 37	java/io/File:createNewFile	()Z
    //   29: pop
    //   30: aload_0
    //   31: iconst_m1
    //   32: putfield 28	com/tencent/mm/sdk/platformtools/FLock:vhx	I
    //   35: aload_0
    //   36: getfield 28	com/tencent/mm/sdk/platformtools/FLock:vhx	I
    //   39: iconst_m1
    //   40: if_icmpne +17 -> 57
    //   43: aload_0
    //   44: aload_0
    //   45: getfield 26	com/tencent/mm/sdk/platformtools/FLock:hJl	Ljava/io/File;
    //   48: invokevirtual 79	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   51: invokestatic 83	com/tencent/mm/sdk/platformtools/FLock:nativeInit	(Ljava/lang/String;)I
    //   54: putfield 28	com/tencent/mm/sdk/platformtools/FLock:vhx	I
    //   57: aload_0
    //   58: getfield 28	com/tencent/mm/sdk/platformtools/FLock:vhx	I
    //   61: istore_1
    //   62: ldc2_w 73
    //   65: ldc 75
    //   67: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   70: aload_0
    //   71: monitorexit
    //   72: iload_1
    //   73: ireturn
    //   74: astore_3
    //   75: aload_0
    //   76: monitorexit
    //   77: aload_3
    //   78: athrow
    //   79: astore_3
    //   80: goto -50 -> 30
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	83	0	this	FLock
    //   61	12	1	i	int
    //   17	2	2	bool	boolean
    //   74	4	3	localObject	Object
    //   79	1	3	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   2	18	74	finally
    //   22	30	74	finally
    //   30	35	74	finally
    //   35	57	74	finally
    //   57	70	74	finally
    //   22	30	79	java/io/IOException
  }
  
  private static native int nativeFree(int paramInt);
  
  private static native int nativeInit(String paramString);
  
  private static native int nativeLockRead(int paramInt, boolean paramBoolean);
  
  private static native int nativeLockWrite(int paramInt, boolean paramBoolean);
  
  private static native int nativeUnlock(int paramInt);
  
  public final void bPx()
  {
    for (;;)
    {
      try
      {
        GMTrace.i(16006672023552L, 119259);
        int i = init();
        switch (nativeLockRead(i, true))
        {
        case 9: 
          GMTrace.o(16006672023552L, 119259);
          return;
        }
      }
      finally {}
      throw new IllegalStateException("bad file descriptor.");
      throw new IllegalStateException("bad operation.");
      throw new IllegalStateException("kernel lock spaces ran out.");
      try
      {
        Thread.sleep(0L);
      }
      catch (InterruptedException localInterruptedException) {}
    }
  }
  
  public final boolean bPy()
  {
    boolean bool = false;
    for (;;)
    {
      try
      {
        GMTrace.i(16006806241280L, 119260);
        int i = init();
        switch (nativeLockWrite(i, false))
        {
        case 9: 
          bool = true;
          GMTrace.o(16006806241280L, 119260);
          return bool;
        }
      }
      finally {}
      throw new IllegalStateException("bad file descriptor.");
      throw new IllegalStateException("bad operation.");
      throw new IllegalStateException("kernel lock spaces ran out.");
      try
      {
        Thread.sleep(0L);
      }
      catch (InterruptedException localInterruptedException) {}
      continue;
      GMTrace.o(16006806241280L, 119260);
    }
  }
  
  public final void bPz()
  {
    for (;;)
    {
      try
      {
        GMTrace.i(16006940459008L, 119261);
        int i = init();
        switch (nativeLockWrite(i, true))
        {
        case 9: 
          GMTrace.o(16006940459008L, 119261);
          return;
        }
      }
      finally {}
      throw new IllegalStateException("bad file descriptor.");
      throw new IllegalStateException("bad operation.");
      throw new IllegalStateException("kernel lock spaces ran out.");
      try
      {
        Thread.sleep(0L);
      }
      catch (InterruptedException localInterruptedException) {}
    }
  }
  
  protected void finalize()
  {
    GMTrace.i(13952738131968L, 103956);
    super.finalize();
    unlock();
    GMTrace.o(13952738131968L, 103956);
  }
  
  public final void unlock()
  {
    for (;;)
    {
      try
      {
        GMTrace.i(13953409220608L, 103961);
        if (this.vhx == -1)
        {
          GMTrace.o(13953409220608L, 103961);
          return;
        }
        try
        {
          int i = nativeUnlock(this.vhx);
          switch (i)
          {
          case 9: 
            throw new IllegalStateException("other err: " + i);
          }
        }
        finally
        {
          free();
        }
        throw new IllegalArgumentException(this.vhx + " is not a valid fd.");
      }
      finally {}
      throw new IllegalStateException("bad operation.");
      free();
      GMTrace.o(13953409220608L, 103961);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\FLock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */