package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.c.ah;
import com.google.android.gms.common.internal.w;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public final class y
  extends o
{
  private Future<String> adV;
  private volatile String adi;
  
  protected y(q paramq)
  {
    super(paramq);
  }
  
  private boolean f(Context paramContext, String paramString)
  {
    boolean bool = false;
    w.af(paramString);
    w.ah("ClientId should be saved from worker thread");
    Object localObject5 = null;
    Object localObject6 = null;
    Object localObject4 = null;
    Object localObject2 = localObject4;
    Object localObject3 = localObject5;
    Object localObject1 = localObject6;
    for (;;)
    {
      try
      {
        c("Storing clientId", paramString);
        localObject2 = localObject4;
        localObject3 = localObject5;
        localObject1 = localObject6;
        paramContext = paramContext.openFileOutput("gaClientId", 0);
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        paramContext.write(paramString.getBytes());
      }
      catch (FileNotFoundException paramContext)
      {
        localObject1 = localObject2;
        f("Error creating clientId file", paramContext);
        if (localObject2 == null) {
          continue;
        }
        try
        {
          ((FileOutputStream)localObject2).close();
          return false;
        }
        catch (IOException paramContext)
        {
          f("Failed to close clientId writing stream", paramContext);
          return false;
        }
      }
      catch (IOException paramContext)
      {
        localObject1 = localObject3;
        f("Error writing to clientId file", paramContext);
        if (localObject3 == null) {
          continue;
        }
        try
        {
          ((FileOutputStream)localObject3).close();
          return false;
        }
        catch (IOException paramContext)
        {
          f("Failed to close clientId writing stream", paramContext);
          return false;
        }
      }
      finally
      {
        if (localObject1 == null) {
          break label179;
        }
      }
      try
      {
        paramContext.close();
        bool = true;
        return bool;
      }
      catch (IOException paramContext)
      {
        f("Failed to close clientId writing stream", paramContext);
      }
    }
    try
    {
      ((FileOutputStream)localObject1).close();
      label179:
      throw paramContext;
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        f("Failed to close clientId writing stream", paramString);
      }
    }
  }
  
  protected final void hS() {}
  
  /* Error */
  public final String jd()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 84	com/google/android/gms/analytics/internal/y:iC	()V
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: getfield 86	com/google/android/gms/analytics/internal/y:adi	Ljava/lang/String;
    //   10: ifnonnull +25 -> 35
    //   13: aload_0
    //   14: aload_0
    //   15: getfield 92	com/google/android/gms/analytics/internal/n:ack	Lcom/google/android/gms/analytics/internal/q;
    //   18: invokevirtual 98	com/google/android/gms/analytics/internal/q:iF	()Lcom/google/android/gms/c/ah;
    //   21: new 6	com/google/android/gms/analytics/internal/y$1
    //   24: dup
    //   25: aload_0
    //   26: invokespecial 101	com/google/android/gms/analytics/internal/y$1:<init>	(Lcom/google/android/gms/analytics/internal/y;)V
    //   29: invokevirtual 107	com/google/android/gms/c/ah:a	(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   32: putfield 109	com/google/android/gms/analytics/internal/y:adV	Ljava/util/concurrent/Future;
    //   35: aload_0
    //   36: getfield 109	com/google/android/gms/analytics/internal/y:adV	Ljava/util/concurrent/Future;
    //   39: astore_1
    //   40: aload_1
    //   41: ifnull +47 -> 88
    //   44: aload_0
    //   45: aload_0
    //   46: getfield 109	com/google/android/gms/analytics/internal/y:adV	Ljava/util/concurrent/Future;
    //   49: invokeinterface 115 1 0
    //   54: checkcast 52	java/lang/String
    //   57: putfield 86	com/google/android/gms/analytics/internal/y:adi	Ljava/lang/String;
    //   60: aload_0
    //   61: getfield 86	com/google/android/gms/analytics/internal/y:adi	Ljava/lang/String;
    //   64: ifnonnull +9 -> 73
    //   67: aload_0
    //   68: ldc 117
    //   70: putfield 86	com/google/android/gms/analytics/internal/y:adi	Ljava/lang/String;
    //   73: aload_0
    //   74: ldc 119
    //   76: aload_0
    //   77: getfield 86	com/google/android/gms/analytics/internal/y:adi	Ljava/lang/String;
    //   80: invokevirtual 42	com/google/android/gms/analytics/internal/y:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   83: aload_0
    //   84: aconst_null
    //   85: putfield 109	com/google/android/gms/analytics/internal/y:adV	Ljava/util/concurrent/Future;
    //   88: aload_0
    //   89: getfield 86	com/google/android/gms/analytics/internal/y:adi	Ljava/lang/String;
    //   92: astore_1
    //   93: aload_0
    //   94: monitorexit
    //   95: aload_1
    //   96: areturn
    //   97: astore_1
    //   98: aload_0
    //   99: ldc 121
    //   101: aload_1
    //   102: invokevirtual 124	com/google/android/gms/analytics/internal/y:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   105: aload_0
    //   106: ldc 117
    //   108: putfield 86	com/google/android/gms/analytics/internal/y:adi	Ljava/lang/String;
    //   111: goto -51 -> 60
    //   114: astore_1
    //   115: aload_0
    //   116: monitorexit
    //   117: aload_1
    //   118: athrow
    //   119: astore_1
    //   120: aload_0
    //   121: ldc 126
    //   123: aload_1
    //   124: invokevirtual 70	com/google/android/gms/analytics/internal/y:f	(Ljava/lang/String;Ljava/lang/Object;)V
    //   127: aload_0
    //   128: ldc 117
    //   130: putfield 86	com/google/android/gms/analytics/internal/y:adi	Ljava/lang/String;
    //   133: goto -73 -> 60
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	136	0	this	y
    //   39	57	1	localObject1	Object
    //   97	5	1	localInterruptedException	InterruptedException
    //   114	4	1	localObject2	Object
    //   119	5	1	localExecutionException	java.util.concurrent.ExecutionException
    // Exception table:
    //   from	to	target	type
    //   44	60	97	java/lang/InterruptedException
    //   6	35	114	finally
    //   35	40	114	finally
    //   44	60	114	finally
    //   60	73	114	finally
    //   73	88	114	finally
    //   88	95	114	finally
    //   98	111	114	finally
    //   115	117	114	finally
    //   120	133	114	finally
    //   44	60	119	java/util/concurrent/ExecutionException
  }
  
  final String je()
  {
    try
    {
      this.adi = null;
      this.adV = this.ack.iF().a(new Callable() {});
      return jd();
    }
    finally {}
  }
  
  public final String jf()
  {
    String str2 = UUID.randomUUID().toString().toLowerCase();
    String str1 = str2;
    try
    {
      if (!f(this.ack.iF().mContext, str2)) {
        str1 = "0";
      }
      return str1;
    }
    catch (Exception localException)
    {
      f("Error saving clientId file", localException);
    }
    return "0";
  }
  
  /* Error */
  String w(Context paramContext)
  {
    // Byte code:
    //   0: ldc -99
    //   2: invokestatic 36	com/google/android/gms/common/internal/w:ah	(Ljava/lang/String;)V
    //   5: aload_1
    //   6: ldc 44
    //   8: invokevirtual 161	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   11: astore_3
    //   12: aload_3
    //   13: astore 4
    //   15: bipush 36
    //   17: newarray <illegal type>
    //   19: astore 5
    //   21: aload_3
    //   22: astore 4
    //   24: aload_3
    //   25: aload 5
    //   27: iconst_0
    //   28: bipush 36
    //   30: invokevirtual 167	java/io/FileInputStream:read	([BII)I
    //   33: istore_2
    //   34: aload_3
    //   35: astore 4
    //   37: aload_3
    //   38: invokevirtual 171	java/io/FileInputStream:available	()I
    //   41: ifle +49 -> 90
    //   44: aload_3
    //   45: astore 4
    //   47: aload_0
    //   48: ldc -83
    //   50: invokevirtual 176	com/google/android/gms/analytics/internal/y:Q	(Ljava/lang/String;)V
    //   53: aload_3
    //   54: astore 4
    //   56: aload_3
    //   57: invokevirtual 177	java/io/FileInputStream:close	()V
    //   60: aload_3
    //   61: astore 4
    //   63: aload_1
    //   64: ldc 44
    //   66: invokevirtual 181	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   69: pop
    //   70: aload_3
    //   71: ifnull +7 -> 78
    //   74: aload_3
    //   75: invokevirtual 177	java/io/FileInputStream:close	()V
    //   78: aconst_null
    //   79: areturn
    //   80: astore_1
    //   81: aload_0
    //   82: ldc -73
    //   84: aload_1
    //   85: invokevirtual 70	com/google/android/gms/analytics/internal/y:f	(Ljava/lang/String;Ljava/lang/Object;)V
    //   88: aconst_null
    //   89: areturn
    //   90: iload_2
    //   91: bipush 14
    //   93: if_icmpge +49 -> 142
    //   96: aload_3
    //   97: astore 4
    //   99: aload_0
    //   100: ldc -71
    //   102: invokevirtual 176	com/google/android/gms/analytics/internal/y:Q	(Ljava/lang/String;)V
    //   105: aload_3
    //   106: astore 4
    //   108: aload_3
    //   109: invokevirtual 177	java/io/FileInputStream:close	()V
    //   112: aload_3
    //   113: astore 4
    //   115: aload_1
    //   116: ldc 44
    //   118: invokevirtual 181	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   121: pop
    //   122: aload_3
    //   123: ifnull -45 -> 78
    //   126: aload_3
    //   127: invokevirtual 177	java/io/FileInputStream:close	()V
    //   130: aconst_null
    //   131: areturn
    //   132: astore_1
    //   133: aload_0
    //   134: ldc -73
    //   136: aload_1
    //   137: invokevirtual 70	com/google/android/gms/analytics/internal/y:f	(Ljava/lang/String;Ljava/lang/Object;)V
    //   140: aconst_null
    //   141: areturn
    //   142: aload_3
    //   143: astore 4
    //   145: aload_3
    //   146: invokevirtual 177	java/io/FileInputStream:close	()V
    //   149: aload_3
    //   150: astore 4
    //   152: new 52	java/lang/String
    //   155: dup
    //   156: aload 5
    //   158: iconst_0
    //   159: iload_2
    //   160: invokespecial 188	java/lang/String:<init>	([BII)V
    //   163: astore 5
    //   165: aload_3
    //   166: astore 4
    //   168: aload_0
    //   169: ldc -66
    //   171: aload 5
    //   173: invokevirtual 42	com/google/android/gms/analytics/internal/y:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   176: aload_3
    //   177: ifnull +7 -> 184
    //   180: aload_3
    //   181: invokevirtual 177	java/io/FileInputStream:close	()V
    //   184: aload 5
    //   186: areturn
    //   187: astore_1
    //   188: aload_0
    //   189: ldc -73
    //   191: aload_1
    //   192: invokevirtual 70	com/google/android/gms/analytics/internal/y:f	(Ljava/lang/String;Ljava/lang/Object;)V
    //   195: goto -11 -> 184
    //   198: astore_1
    //   199: aconst_null
    //   200: astore_1
    //   201: aload_1
    //   202: ifnull -124 -> 78
    //   205: aload_1
    //   206: invokevirtual 177	java/io/FileInputStream:close	()V
    //   209: aconst_null
    //   210: areturn
    //   211: astore_1
    //   212: aload_0
    //   213: ldc -73
    //   215: aload_1
    //   216: invokevirtual 70	com/google/android/gms/analytics/internal/y:f	(Ljava/lang/String;Ljava/lang/Object;)V
    //   219: aconst_null
    //   220: areturn
    //   221: astore 5
    //   223: aconst_null
    //   224: astore_3
    //   225: aload_3
    //   226: astore 4
    //   228: aload_0
    //   229: ldc -64
    //   231: aload 5
    //   233: invokevirtual 70	com/google/android/gms/analytics/internal/y:f	(Ljava/lang/String;Ljava/lang/Object;)V
    //   236: aload_3
    //   237: astore 4
    //   239: aload_1
    //   240: ldc 44
    //   242: invokevirtual 181	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   245: pop
    //   246: aload_3
    //   247: ifnull -169 -> 78
    //   250: aload_3
    //   251: invokevirtual 177	java/io/FileInputStream:close	()V
    //   254: aconst_null
    //   255: areturn
    //   256: astore_1
    //   257: aload_0
    //   258: ldc -73
    //   260: aload_1
    //   261: invokevirtual 70	com/google/android/gms/analytics/internal/y:f	(Ljava/lang/String;Ljava/lang/Object;)V
    //   264: aconst_null
    //   265: areturn
    //   266: astore_1
    //   267: aconst_null
    //   268: astore 4
    //   270: aload 4
    //   272: ifnull +8 -> 280
    //   275: aload 4
    //   277: invokevirtual 177	java/io/FileInputStream:close	()V
    //   280: aload_1
    //   281: athrow
    //   282: astore_3
    //   283: aload_0
    //   284: ldc -73
    //   286: aload_3
    //   287: invokevirtual 70	com/google/android/gms/analytics/internal/y:f	(Ljava/lang/String;Ljava/lang/Object;)V
    //   290: goto -10 -> 280
    //   293: astore_1
    //   294: goto -24 -> 270
    //   297: astore 5
    //   299: goto -74 -> 225
    //   302: astore_1
    //   303: aload_3
    //   304: astore_1
    //   305: goto -104 -> 201
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	308	0	this	y
    //   0	308	1	paramContext	Context
    //   33	127	2	i	int
    //   11	240	3	localFileInputStream1	java.io.FileInputStream
    //   282	22	3	localIOException1	IOException
    //   13	263	4	localFileInputStream2	java.io.FileInputStream
    //   19	166	5	localObject	Object
    //   221	11	5	localIOException2	IOException
    //   297	1	5	localIOException3	IOException
    // Exception table:
    //   from	to	target	type
    //   74	78	80	java/io/IOException
    //   126	130	132	java/io/IOException
    //   180	184	187	java/io/IOException
    //   5	12	198	java/io/FileNotFoundException
    //   205	209	211	java/io/IOException
    //   5	12	221	java/io/IOException
    //   250	254	256	java/io/IOException
    //   5	12	266	finally
    //   275	280	282	java/io/IOException
    //   15	21	293	finally
    //   24	34	293	finally
    //   37	44	293	finally
    //   47	53	293	finally
    //   56	60	293	finally
    //   63	70	293	finally
    //   99	105	293	finally
    //   108	112	293	finally
    //   115	122	293	finally
    //   145	149	293	finally
    //   152	165	293	finally
    //   168	176	293	finally
    //   228	236	293	finally
    //   239	246	293	finally
    //   15	21	297	java/io/IOException
    //   24	34	297	java/io/IOException
    //   37	44	297	java/io/IOException
    //   47	53	297	java/io/IOException
    //   56	60	297	java/io/IOException
    //   63	70	297	java/io/IOException
    //   99	105	297	java/io/IOException
    //   108	112	297	java/io/IOException
    //   115	122	297	java/io/IOException
    //   145	149	297	java/io/IOException
    //   152	165	297	java/io/IOException
    //   168	176	297	java/io/IOException
    //   15	21	302	java/io/FileNotFoundException
    //   24	34	302	java/io/FileNotFoundException
    //   37	44	302	java/io/FileNotFoundException
    //   47	53	302	java/io/FileNotFoundException
    //   56	60	302	java/io/FileNotFoundException
    //   63	70	302	java/io/FileNotFoundException
    //   99	105	302	java/io/FileNotFoundException
    //   108	112	302	java/io/FileNotFoundException
    //   115	122	302	java/io/FileNotFoundException
    //   145	149	302	java/io/FileNotFoundException
    //   152	165	302	java/io/FileNotFoundException
    //   168	176	302	java/io/FileNotFoundException
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */