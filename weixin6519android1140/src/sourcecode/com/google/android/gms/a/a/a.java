package com.google.android.gms.a.a;

import android.content.Context;
import com.google.android.gms.c.d;
import com.google.android.gms.c.d.a;
import com.google.android.gms.common.h;
import com.google.android.gms.common.internal.w;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class a
{
  private static boolean abl = false;
  h abf;
  d abg;
  boolean abh;
  Object abi = new Object();
  b abj;
  final long abk;
  private final Context mContext;
  
  private a(Context paramContext)
  {
    w.aa(paramContext);
    this.mContext = paramContext;
    this.abh = false;
    this.abk = -1L;
  }
  
  private static d a(h paramh)
  {
    try
    {
      paramh = d.a.n(paramh.kW());
      return paramh;
    }
    catch (InterruptedException paramh)
    {
      throw new IOException("Interrupted exception");
    }
    catch (Throwable paramh)
    {
      throw new IOException(paramh);
    }
  }
  
  private void hN()
  {
    w.ah("Calling this from your main thread can lead to deadlock");
    try
    {
      if (this.abh) {
        finish();
      }
      this.abf = r(this.mContext);
      this.abg = a(this.abf);
      this.abh = true;
      return;
    }
    finally {}
  }
  
  /* Error */
  private a hO()
  {
    // Byte code:
    //   0: ldc 80
    //   2: invokestatic 83	com/google/android/gms/common/internal/w:ah	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 46	com/google/android/gms/a/a/a:abh	Z
    //   11: ifne +82 -> 93
    //   14: aload_0
    //   15: getfield 36	com/google/android/gms/a/a/a:abi	Ljava/lang/Object;
    //   18: astore_1
    //   19: aload_1
    //   20: monitorenter
    //   21: aload_0
    //   22: getfield 104	com/google/android/gms/a/a/a:abj	Lcom/google/android/gms/a/a/a$b;
    //   25: ifnull +13 -> 38
    //   28: aload_0
    //   29: getfield 104	com/google/android/gms/a/a/a:abj	Lcom/google/android/gms/a/a/a$b;
    //   32: getfield 107	com/google/android/gms/a/a/a$b:abr	Z
    //   35: ifne +23 -> 58
    //   38: new 69	java/io/IOException
    //   41: dup
    //   42: ldc 109
    //   44: invokespecial 74	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   47: athrow
    //   48: astore_2
    //   49: aload_1
    //   50: monitorexit
    //   51: aload_2
    //   52: athrow
    //   53: astore_1
    //   54: aload_0
    //   55: monitorexit
    //   56: aload_1
    //   57: athrow
    //   58: aload_1
    //   59: monitorexit
    //   60: aload_0
    //   61: invokespecial 111	com/google/android/gms/a/a/a:hN	()V
    //   64: aload_0
    //   65: getfield 46	com/google/android/gms/a/a/a:abh	Z
    //   68: ifne +25 -> 93
    //   71: new 69	java/io/IOException
    //   74: dup
    //   75: ldc 113
    //   77: invokespecial 74	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   80: athrow
    //   81: astore_1
    //   82: new 69	java/io/IOException
    //   85: dup
    //   86: ldc 113
    //   88: aload_1
    //   89: invokespecial 116	java/io/IOException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   92: athrow
    //   93: aload_0
    //   94: getfield 92	com/google/android/gms/a/a/a:abf	Lcom/google/android/gms/common/h;
    //   97: invokestatic 42	com/google/android/gms/common/internal/w:aa	(Ljava/lang/Object;)Ljava/lang/Object;
    //   100: pop
    //   101: aload_0
    //   102: getfield 96	com/google/android/gms/a/a/a:abg	Lcom/google/android/gms/c/d;
    //   105: invokestatic 42	com/google/android/gms/common/internal/w:aa	(Ljava/lang/Object;)Ljava/lang/Object;
    //   108: pop
    //   109: new 6	com/google/android/gms/a/a/a$a
    //   112: dup
    //   113: aload_0
    //   114: getfield 96	com/google/android/gms/a/a/a:abg	Lcom/google/android/gms/c/d;
    //   117: invokeinterface 122 1 0
    //   122: aload_0
    //   123: getfield 96	com/google/android/gms/a/a/a:abg	Lcom/google/android/gms/c/d;
    //   126: iconst_1
    //   127: invokeinterface 126 2 0
    //   132: invokespecial 129	com/google/android/gms/a/a/a$a:<init>	(Ljava/lang/String;Z)V
    //   135: astore_2
    //   136: aload_0
    //   137: monitorexit
    //   138: aload_0
    //   139: getfield 36	com/google/android/gms/a/a/a:abi	Ljava/lang/Object;
    //   142: astore_1
    //   143: aload_1
    //   144: monitorenter
    //   145: aload_0
    //   146: getfield 104	com/google/android/gms/a/a/a:abj	Lcom/google/android/gms/a/a/a$b;
    //   149: ifnull +20 -> 169
    //   152: aload_0
    //   153: getfield 104	com/google/android/gms/a/a/a:abj	Lcom/google/android/gms/a/a/a$b;
    //   156: getfield 133	com/google/android/gms/a/a/a$b:abq	Ljava/util/concurrent/CountDownLatch;
    //   159: invokevirtual 138	java/util/concurrent/CountDownLatch:countDown	()V
    //   162: aload_0
    //   163: getfield 104	com/google/android/gms/a/a/a:abj	Lcom/google/android/gms/a/a/a$b;
    //   166: invokevirtual 141	com/google/android/gms/a/a/a$b:join	()V
    //   169: aload_0
    //   170: getfield 50	com/google/android/gms/a/a/a:abk	J
    //   173: lconst_0
    //   174: lcmp
    //   175: ifle +19 -> 194
    //   178: aload_0
    //   179: new 9	com/google/android/gms/a/a/a$b
    //   182: dup
    //   183: aload_0
    //   184: aload_0
    //   185: getfield 50	com/google/android/gms/a/a/a:abk	J
    //   188: invokespecial 144	com/google/android/gms/a/a/a$b:<init>	(Lcom/google/android/gms/a/a/a;J)V
    //   191: putfield 104	com/google/android/gms/a/a/a:abj	Lcom/google/android/gms/a/a/a$b;
    //   194: aload_1
    //   195: monitorexit
    //   196: aload_2
    //   197: areturn
    //   198: astore_1
    //   199: new 69	java/io/IOException
    //   202: dup
    //   203: ldc -110
    //   205: invokespecial 74	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   208: athrow
    //   209: astore_2
    //   210: aload_1
    //   211: monitorexit
    //   212: aload_2
    //   213: athrow
    //   214: astore_3
    //   215: goto -46 -> 169
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	218	0	this	a
    //   18	32	1	localObject1	Object
    //   53	6	1	localObject2	Object
    //   81	8	1	localException	Exception
    //   198	13	1	localRemoteException	android.os.RemoteException
    //   48	4	2	localObject4	Object
    //   135	62	2	locala	a
    //   209	4	2	localObject5	Object
    //   214	1	3	localInterruptedException	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   21	38	48	finally
    //   38	48	48	finally
    //   49	51	48	finally
    //   58	60	48	finally
    //   7	21	53	finally
    //   51	53	53	finally
    //   54	56	53	finally
    //   60	64	53	finally
    //   64	81	53	finally
    //   82	93	53	finally
    //   93	109	53	finally
    //   109	136	53	finally
    //   136	138	53	finally
    //   199	209	53	finally
    //   60	64	81	java/lang/Exception
    //   109	136	198	android/os/RemoteException
    //   145	162	209	finally
    //   162	169	209	finally
    //   169	194	209	finally
    //   194	196	209	finally
    //   210	212	209	finally
    //   162	169	214	java/lang/InterruptedException
  }
  
  /* Error */
  private static h r(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 156	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   4: ldc -98
    //   6: iconst_0
    //   7: invokevirtual 164	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   10: pop
    //   11: getstatic 29	com/google/android/gms/a/a/a:abl	Z
    //   14: ifeq +59 -> 73
    //   17: invokestatic 170	com/google/android/gms/common/b:jE	()Lcom/google/android/gms/common/b;
    //   20: pop
    //   21: aload_0
    //   22: invokestatic 174	com/google/android/gms/common/b:x	(Landroid/content/Context;)I
    //   25: tableswitch	default:+27->52, 0:+52->77, 1:+27->52, 2:+52->77
    //   52: new 69	java/io/IOException
    //   55: dup
    //   56: ldc -80
    //   58: invokespecial 74	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   61: athrow
    //   62: astore_0
    //   63: new 150	com/google/android/gms/common/c
    //   66: dup
    //   67: bipush 9
    //   69: invokespecial 179	com/google/android/gms/common/c:<init>	(I)V
    //   72: athrow
    //   73: aload_0
    //   74: invokestatic 184	com/google/android/gms/common/e:z	(Landroid/content/Context;)V
    //   77: new 57	com/google/android/gms/common/h
    //   80: dup
    //   81: invokespecial 185	com/google/android/gms/common/h:<init>	()V
    //   84: astore_2
    //   85: new 187	android/content/Intent
    //   88: dup
    //   89: ldc -67
    //   91: invokespecial 190	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   94: astore_3
    //   95: aload_3
    //   96: ldc -64
    //   98: invokevirtual 196	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   101: pop
    //   102: invokestatic 202	com/google/android/gms/common/stats/b:kU	()Lcom/google/android/gms/common/stats/b;
    //   105: aload_0
    //   106: aload_3
    //   107: aload_2
    //   108: iconst_1
    //   109: invokevirtual 205	com/google/android/gms/common/stats/b:a	(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   112: istore_1
    //   113: iload_1
    //   114: ifeq +25 -> 139
    //   117: aload_2
    //   118: areturn
    //   119: astore_0
    //   120: new 69	java/io/IOException
    //   123: dup
    //   124: aload_0
    //   125: invokespecial 77	java/io/IOException:<init>	(Ljava/lang/Throwable;)V
    //   128: athrow
    //   129: astore_0
    //   130: new 69	java/io/IOException
    //   133: dup
    //   134: aload_0
    //   135: invokespecial 77	java/io/IOException:<init>	(Ljava/lang/Throwable;)V
    //   138: athrow
    //   139: new 69	java/io/IOException
    //   142: dup
    //   143: ldc -49
    //   145: invokespecial 74	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   148: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	149	0	paramContext	Context
    //   112	2	1	bool	boolean
    //   84	34	2	localh	h
    //   94	13	3	localIntent	android.content.Intent
    // Exception table:
    //   from	to	target	type
    //   0	11	62	android/content/pm/PackageManager$NameNotFoundException
    //   73	77	119	com/google/android/gms/common/c
    //   102	113	129	java/lang/Throwable
  }
  
  public static a s(Context paramContext)
  {
    paramContext = new a(paramContext);
    try
    {
      paramContext.hN();
      a locala = paramContext.hO();
      return locala;
    }
    finally
    {
      paramContext.finish();
    }
  }
  
  protected final void finalize()
  {
    finish();
    super.finalize();
  }
  
  /* Error */
  public final void finish()
  {
    // Byte code:
    //   0: ldc 80
    //   2: invokestatic 83	com/google/android/gms/common/internal/w:ah	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 44	com/google/android/gms/a/a/a:mContext	Landroid/content/Context;
    //   11: ifnull +10 -> 21
    //   14: aload_0
    //   15: getfield 92	com/google/android/gms/a/a/a:abf	Lcom/google/android/gms/common/h;
    //   18: ifnonnull +6 -> 24
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: aload_0
    //   25: getfield 46	com/google/android/gms/a/a/a:abh	Z
    //   28: ifeq +17 -> 45
    //   31: invokestatic 202	com/google/android/gms/common/stats/b:kU	()Lcom/google/android/gms/common/stats/b;
    //   34: aload_0
    //   35: getfield 44	com/google/android/gms/a/a/a:mContext	Landroid/content/Context;
    //   38: aload_0
    //   39: getfield 92	com/google/android/gms/a/a/a:abf	Lcom/google/android/gms/common/h;
    //   42: invokevirtual 221	com/google/android/gms/common/stats/b:a	(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    //   45: aload_0
    //   46: iconst_0
    //   47: putfield 46	com/google/android/gms/a/a/a:abh	Z
    //   50: aload_0
    //   51: aconst_null
    //   52: putfield 96	com/google/android/gms/a/a/a:abg	Lcom/google/android/gms/c/d;
    //   55: aload_0
    //   56: aconst_null
    //   57: putfield 92	com/google/android/gms/a/a/a:abf	Lcom/google/android/gms/common/h;
    //   60: aload_0
    //   61: monitorexit
    //   62: return
    //   63: astore_1
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_1
    //   67: athrow
    //   68: astore_1
    //   69: goto -24 -> 45
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	72	0	this	a
    //   63	4	1	localObject	Object
    //   68	1	1	localIllegalArgumentException	IllegalArgumentException
    // Exception table:
    //   from	to	target	type
    //   7	21	63	finally
    //   21	23	63	finally
    //   24	45	63	finally
    //   45	62	63	finally
    //   64	66	63	finally
    //   24	45	68	java/lang/IllegalArgumentException
  }
  
  public static final class a
  {
    public final String abm;
    public final boolean abn;
    
    public a(String paramString, boolean paramBoolean)
    {
      this.abm = paramString;
      this.abn = paramBoolean;
    }
    
    public final String toString()
    {
      return "{" + this.abm + "}" + this.abn;
    }
  }
  
  static final class b
    extends Thread
  {
    private WeakReference<a> abo;
    private long abp;
    CountDownLatch abq;
    boolean abr;
    
    public b(a parama, long paramLong)
    {
      this.abo = new WeakReference(parama);
      this.abp = paramLong;
      this.abq = new CountDownLatch(1);
      this.abr = false;
      start();
    }
    
    private void disconnect()
    {
      a locala = (a)this.abo.get();
      if (locala != null)
      {
        locala.finish();
        this.abr = true;
      }
    }
    
    public final void run()
    {
      try
      {
        if (!this.abq.await(this.abp, TimeUnit.MILLISECONDS)) {
          disconnect();
        }
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        disconnect();
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */