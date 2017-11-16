package com.tencent.mm.plugin.fts;

import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.k;
import com.tencent.mm.sdk.platformtools.w;
import java.util.concurrent.PriorityBlockingQueue;

public final class f
  implements k
{
  a lvg;
  
  public f()
  {
    GMTrace.i(18510772174848L, 137916);
    this.lvg = new a();
    GMTrace.o(18510772174848L, 137916);
  }
  
  public final a a(int paramInt, a parama)
  {
    GMTrace.i(18511174828032L, 137919);
    if (this.lvg == null)
    {
      GMTrace.o(18511174828032L, 137919);
      return null;
    }
    parama.mPriority = paramInt;
    a locala = this.lvg;
    if (!locala.lvj)
    {
      paramInt = parama.getPriority();
      locala.lvi.put(parama);
      if (locala.lvk != null) {
        break label77;
      }
      locala.nW(paramInt);
    }
    for (;;)
    {
      GMTrace.o(18511174828032L, 137919);
      return parama;
      label77:
      if (paramInt < locala.lvh)
      {
        locala.interrupt();
        locala.nW(paramInt);
      }
    }
  }
  
  public final boolean aCe()
  {
    GMTrace.i(18510906392576L, 137917);
    if ((this.lvg != null) && (this.lvg.isAlive()))
    {
      GMTrace.o(18510906392576L, 137917);
      return true;
    }
    GMTrace.o(18510906392576L, 137917);
    return false;
  }
  
  public final void quit()
  {
    GMTrace.i(18511040610304L, 137918);
    if ((this.lvg == null) || (!this.lvg.isAlive()))
    {
      GMTrace.o(18511040610304L, 137918);
      return;
    }
    this.lvg.quit();
    try
    {
      this.lvg.join();
      this.lvg = null;
      w.i("MicroMsg.FTS.FTSTaskDaemon", "***** Search daemon quited.");
      GMTrace.o(18511040610304L, 137918);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  private final class a
    extends Thread
  {
    int lvh;
    PriorityBlockingQueue<a> lvi;
    volatile boolean lvj;
    a lvk;
    private boolean lvl;
    Runnable lvm;
    d lvn;
    boolean lvo;
    private int mTid;
    
    public a()
    {
      super();
      GMTrace.i(18509832650752L, 137909);
      this.mTid = 0;
      this.lvh = Integer.MAX_VALUE;
      this.lvi = new PriorityBlockingQueue();
      this.lvj = false;
      this.lvo = false;
      GMTrace.o(18509832650752L, 137909);
    }
    
    /* Error */
    public final void eJ(boolean paramBoolean)
    {
      // Byte code:
      //   0: iconst_0
      //   1: istore_2
      //   2: aload_0
      //   3: monitorenter
      //   4: ldc2_w 68
      //   7: ldc 70
      //   9: invokestatic 43	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   12: aload_0
      //   13: getfield 72	com/tencent/mm/plugin/fts/f$a:lvl	Z
      //   16: iload_1
      //   17: if_icmpne +14 -> 31
      //   20: ldc2_w 68
      //   23: ldc 70
      //   25: invokestatic 62	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   28: aload_0
      //   29: monitorexit
      //   30: return
      //   31: aload_0
      //   32: iload_1
      //   33: putfield 72	com/tencent/mm/plugin/fts/f$a:lvl	Z
      //   36: aload_0
      //   37: getfield 48	com/tencent/mm/plugin/fts/f$a:lvh	I
      //   40: iflt +124 -> 164
      //   43: aload_0
      //   44: invokevirtual 76	com/tencent/mm/plugin/fts/f$a:isAlive	()Z
      //   47: ifeq +117 -> 164
      //   50: aload_0
      //   51: getfield 45	com/tencent/mm/plugin/fts/f$a:mTid	I
      //   54: ifeq +110 -> 164
      //   57: aload_0
      //   58: getfield 72	com/tencent/mm/plugin/fts/f$a:lvl	Z
      //   61: istore_1
      //   62: iload_1
      //   63: ifeq +6 -> 69
      //   66: bipush 10
      //   68: istore_2
      //   69: aload_0
      //   70: getfield 45	com/tencent/mm/plugin/fts/f$a:mTid	I
      //   73: iload_2
      //   74: invokestatic 82	android/os/Process:setThreadPriority	(II)V
      //   77: new 84	java/lang/StringBuilder
      //   80: dup
      //   81: ldc 86
      //   83: invokespecial 87	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   86: astore 4
      //   88: aload_0
      //   89: getfield 72	com/tencent/mm/plugin/fts/f$a:lvl	Z
      //   92: ifeq +36 -> 128
      //   95: ldc 89
      //   97: astore_3
      //   98: ldc 91
      //   100: aload 4
      //   102: aload_3
      //   103: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   106: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   109: invokestatic 104	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   112: ldc2_w 68
      //   115: ldc 70
      //   117: invokestatic 62	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   120: goto -92 -> 28
      //   123: astore_3
      //   124: aload_0
      //   125: monitorexit
      //   126: aload_3
      //   127: athrow
      //   128: ldc 106
      //   130: astore_3
      //   131: goto -33 -> 98
      //   134: astore_3
      //   135: ldc 91
      //   137: aload_3
      //   138: ldc 108
      //   140: iconst_2
      //   141: anewarray 110	java/lang/Object
      //   144: dup
      //   145: iconst_0
      //   146: aload_0
      //   147: getfield 45	com/tencent/mm/plugin/fts/f$a:mTid	I
      //   150: invokestatic 116	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   153: aastore
      //   154: dup
      //   155: iconst_1
      //   156: iload_2
      //   157: invokestatic 116	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   160: aastore
      //   161: invokestatic 120	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   164: ldc2_w 68
      //   167: ldc 70
      //   169: invokestatic 62	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   172: goto -144 -> 28
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	175	0	this	a
      //   0	175	1	paramBoolean	boolean
      //   1	156	2	i	int
      //   97	6	3	str1	String
      //   123	4	3	localObject	Object
      //   130	1	3	str2	String
      //   134	4	3	localSecurityException	SecurityException
      //   86	15	4	localStringBuilder	StringBuilder
      // Exception table:
      //   from	to	target	type
      //   4	28	123	finally
      //   31	62	123	finally
      //   69	95	123	finally
      //   98	112	123	finally
      //   112	120	123	finally
      //   135	164	123	finally
      //   164	172	123	finally
      //   69	95	134	java/lang/SecurityException
      //   98	112	134	java/lang/SecurityException
    }
    
    final void nW(int paramInt)
    {
      do
      {
        try
        {
          GMTrace.i(18509966868480L, 137910);
          if ((this.lvh == paramInt) || (!isAlive()))
          {
            GMTrace.o(18509966868480L, 137910);
            return;
          }
          if ((paramInt < 0) && (this.lvh >= 0)) {
            Process.setThreadPriority(this.mTid, -8);
          }
          while (paramInt < 0)
          {
            this.lvh = paramInt;
            GMTrace.o(18509966868480L, 137910);
            break;
          }
        }
        finally {}
      } while (this.lvh >= 0);
      if (this.lvl) {}
      for (int i = 10;; i = 0)
      {
        Process.setThreadPriority(this.mTid, i);
        break;
      }
    }
    
    public final void quit()
    {
      try
      {
        GMTrace.i(18510101086208L, 137911);
        this.lvj = true;
        interrupt();
        GMTrace.o(18510101086208L, 137911);
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: ldc2_w 144
      //   3: ldc -110
      //   5: invokestatic 43	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: aload_0
      //   9: invokestatic 150	android/os/Process:myTid	()I
      //   12: putfield 45	com/tencent/mm/plugin/fts/f$a:mTid	I
      //   15: ldc2_w 151
      //   18: lstore_3
      //   19: ldc -102
      //   21: astore 9
      //   23: invokestatic 157	java/lang/Thread:interrupted	()Z
      //   26: pop
      //   27: aload_0
      //   28: getfield 57	com/tencent/mm/plugin/fts/f$a:lvj	Z
      //   31: istore 5
      //   33: iload 5
      //   35: ifeq +20 -> 55
      //   38: invokestatic 162	com/tencent/mm/plugin/fts/a:aCb	()V
      //   41: aload_0
      //   42: iconst_0
      //   43: putfield 45	com/tencent/mm/plugin/fts/f$a:mTid	I
      //   46: ldc2_w 144
      //   49: ldc -110
      //   51: invokestatic 62	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   54: return
      //   55: aload_0
      //   56: aconst_null
      //   57: putfield 164	com/tencent/mm/plugin/fts/f$a:lvk	Lcom/tencent/mm/plugin/fts/a/a/a;
      //   60: aload_0
      //   61: getfield 55	com/tencent/mm/plugin/fts/f$a:lvi	Ljava/util/concurrent/PriorityBlockingQueue;
      //   64: invokevirtual 168	java/util/concurrent/PriorityBlockingQueue:take	()Ljava/lang/Object;
      //   67: checkcast 170	com/tencent/mm/plugin/fts/a/a/a
      //   70: astore 6
      //   72: aload 6
      //   74: ifnonnull +9 -> 83
      //   77: invokestatic 162	com/tencent/mm/plugin/fts/a:aCb	()V
      //   80: goto -65 -> 15
      //   83: aload 9
      //   85: astore 7
      //   87: lload_3
      //   88: lstore_1
      //   89: aload_0
      //   90: aload 6
      //   92: putfield 164	com/tencent/mm/plugin/fts/f$a:lvk	Lcom/tencent/mm/plugin/fts/a/a/a;
      //   95: aload 9
      //   97: astore 7
      //   99: lload_3
      //   100: lstore_1
      //   101: aload_0
      //   102: aload 6
      //   104: invokevirtual 173	com/tencent/mm/plugin/fts/a/a/a:getPriority	()I
      //   107: invokevirtual 175	com/tencent/mm/plugin/fts/f$a:nW	(I)V
      //   110: aload 9
      //   112: astore 7
      //   114: lload_3
      //   115: lstore_1
      //   116: invokestatic 181	java/lang/System:currentTimeMillis	()J
      //   119: lstore_3
      //   120: aload 9
      //   122: astore 8
      //   124: aload 9
      //   126: astore 7
      //   128: lload_3
      //   129: lstore_1
      //   130: aload_0
      //   131: getfield 48	com/tencent/mm/plugin/fts/f$a:lvh	I
      //   134: ifge +7 -> 141
      //   137: ldc -73
      //   139: astore 8
      //   141: aload 8
      //   143: astore 7
      //   145: lload_3
      //   146: lstore_1
      //   147: aload 6
      //   149: invokevirtual 186	com/tencent/mm/plugin/fts/a/a/a:execute	()Z
      //   152: pop
      //   153: aload 8
      //   155: astore 7
      //   157: lload_3
      //   158: lstore_1
      //   159: invokestatic 181	java/lang/System:currentTimeMillis	()J
      //   162: lload_3
      //   163: lsub
      //   164: lstore_3
      //   165: aload 8
      //   167: astore 7
      //   169: lload_3
      //   170: lstore_1
      //   171: iconst_1
      //   172: invokestatic 191	com/tencent/mm/plugin/fts/a/e:nX	(I)V
      //   175: aload 8
      //   177: astore 7
      //   179: lload_3
      //   180: lstore_1
      //   181: aload 6
      //   183: invokevirtual 194	com/tencent/mm/plugin/fts/a/a/a:getId	()I
      //   186: lload_3
      //   187: invokestatic 198	com/tencent/mm/plugin/fts/a/e:t	(IJ)V
      //   190: aload 8
      //   192: astore 7
      //   194: lload_3
      //   195: lstore_1
      //   196: aload 6
      //   198: invokevirtual 194	com/tencent/mm/plugin/fts/a/a/a:getId	()I
      //   201: lload_3
      //   202: invokestatic 201	com/tencent/mm/plugin/fts/a/e:u	(IJ)V
      //   205: aload 8
      //   207: astore 7
      //   209: lload_3
      //   210: lstore_1
      //   211: aload 6
      //   213: invokevirtual 204	com/tencent/mm/plugin/fts/a/a/a:getName	()Ljava/lang/String;
      //   216: aload 6
      //   218: invokevirtual 194	com/tencent/mm/plugin/fts/a/a/a:getId	()I
      //   221: lload_3
      //   222: ldc -50
      //   224: invokestatic 209	com/tencent/mm/plugin/fts/a/e:a	(Ljava/lang/String;IJLjava/lang/String;)V
      //   227: aload 8
      //   229: astore 7
      //   231: lload_3
      //   232: lstore_1
      //   233: ldc 91
      //   235: ldc -45
      //   237: iconst_3
      //   238: anewarray 110	java/lang/Object
      //   241: dup
      //   242: iconst_0
      //   243: aload 8
      //   245: aastore
      //   246: dup
      //   247: iconst_1
      //   248: aload 6
      //   250: aastore
      //   251: dup
      //   252: iconst_2
      //   253: lload_3
      //   254: invokestatic 216	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   257: aastore
      //   258: invokestatic 219	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   261: invokestatic 162	com/tencent/mm/plugin/fts/a:aCb	()V
      //   264: goto -249 -> 15
      //   267: astore 6
      //   269: ldc -102
      //   271: astore 7
      //   273: aconst_null
      //   274: astore 6
      //   276: lload_3
      //   277: lstore_1
      //   278: aload 6
      //   280: ifnull +92 -> 372
      //   283: aload 6
      //   285: invokevirtual 222	com/tencent/mm/plugin/fts/a/a/a:isCancelled	()Z
      //   288: ifne +12 -> 300
      //   291: aload_0
      //   292: getfield 55	com/tencent/mm/plugin/fts/f$a:lvi	Ljava/util/concurrent/PriorityBlockingQueue;
      //   295: aload 6
      //   297: invokevirtual 226	java/util/concurrent/PriorityBlockingQueue:put	(Ljava/lang/Object;)V
      //   300: lload_1
      //   301: lconst_0
      //   302: lcmp
      //   303: ifle +69 -> 372
      //   306: invokestatic 181	java/lang/System:currentTimeMillis	()J
      //   309: lstore_3
      //   310: new 84	java/lang/StringBuilder
      //   313: dup
      //   314: invokespecial 227	java/lang/StringBuilder:<init>	()V
      //   317: aload 7
      //   319: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   322: ldc -27
      //   324: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   327: aload 6
      //   329: invokevirtual 232	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   332: astore 7
      //   334: aload 6
      //   336: invokevirtual 222	com/tencent/mm/plugin/fts/a/a/a:isCancelled	()Z
      //   339: ifeq +39 -> 378
      //   342: ldc -22
      //   344: astore 6
      //   346: ldc 91
      //   348: aload 7
      //   350: aload 6
      //   352: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   355: lload_3
      //   356: lload_1
      //   357: lsub
      //   358: invokevirtual 237	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
      //   361: ldc -17
      //   363: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   366: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   369: invokestatic 104	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   372: invokestatic 162	com/tencent/mm/plugin/fts/a:aCb	()V
      //   375: goto -360 -> 15
      //   378: ldc -15
      //   380: astore 6
      //   382: goto -36 -> 346
      //   385: ldc 91
      //   387: aload 6
      //   389: ldc -13
      //   391: iconst_1
      //   392: anewarray 110	java/lang/Object
      //   395: dup
      //   396: iconst_0
      //   397: aload 7
      //   399: aastore
      //   400: invokestatic 120	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   403: aload_0
      //   404: getfield 245	com/tencent/mm/plugin/fts/f$a:lvn	Lcom/tencent/mm/plugin/fts/d;
      //   407: ifnull +12 -> 419
      //   410: aload_0
      //   411: getfield 245	com/tencent/mm/plugin/fts/f$a:lvn	Lcom/tencent/mm/plugin/fts/d;
      //   414: invokeinterface 250 1 0
      //   419: bipush 18
      //   421: invokestatic 191	com/tencent/mm/plugin/fts/a/e:nX	(I)V
      //   424: aload_0
      //   425: getfield 59	com/tencent/mm/plugin/fts/f$a:lvo	Z
      //   428: ifne +50 -> 478
      //   431: new 84	java/lang/StringBuilder
      //   434: dup
      //   435: invokespecial 227	java/lang/StringBuilder:<init>	()V
      //   438: aload 7
      //   440: invokevirtual 232	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   443: ldc -4
      //   445: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   448: aload 6
      //   450: invokestatic 258	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
      //   453: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   456: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   459: astore 6
      //   461: getstatic 264	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   464: ldc_w 266
      //   467: aload 6
      //   469: aconst_null
      //   470: invokevirtual 270	com/tencent/mm/plugin/report/service/g:d	(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
      //   473: aload_0
      //   474: iconst_1
      //   475: putfield 59	com/tencent/mm/plugin/fts/f$a:lvo	Z
      //   478: invokestatic 162	com/tencent/mm/plugin/fts/a:aCb	()V
      //   481: goto -466 -> 15
      //   484: astore 7
      //   486: aconst_null
      //   487: astore 6
      //   489: ldc 91
      //   491: aload 7
      //   493: ldc_w 272
      //   496: iconst_1
      //   497: anewarray 110	java/lang/Object
      //   500: dup
      //   501: iconst_0
      //   502: aload 6
      //   504: aastore
      //   505: invokestatic 120	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   508: bipush 6
      //   510: invokestatic 191	com/tencent/mm/plugin/fts/a/e:nX	(I)V
      //   513: invokestatic 162	com/tencent/mm/plugin/fts/a:aCb	()V
      //   516: goto -501 -> 15
      //   519: astore 7
      //   521: aconst_null
      //   522: astore 6
      //   524: ldc 91
      //   526: aload 7
      //   528: ldc_w 272
      //   531: iconst_1
      //   532: anewarray 110	java/lang/Object
      //   535: dup
      //   536: iconst_0
      //   537: aload 6
      //   539: aastore
      //   540: invokestatic 120	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   543: bipush 7
      //   545: invokestatic 191	com/tencent/mm/plugin/fts/a/e:nX	(I)V
      //   548: invokestatic 162	com/tencent/mm/plugin/fts/a:aCb	()V
      //   551: goto -536 -> 15
      //   554: astore 7
      //   556: aconst_null
      //   557: astore 6
      //   559: aload 7
      //   561: instanceof 274
      //   564: ifeq +48 -> 612
      //   567: iconst_3
      //   568: invokestatic 191	com/tencent/mm/plugin/fts/a/e:nX	(I)V
      //   571: ldc 91
      //   573: aload 7
      //   575: ldc_w 272
      //   578: iconst_1
      //   579: anewarray 110	java/lang/Object
      //   582: dup
      //   583: iconst_0
      //   584: aload 6
      //   586: aastore
      //   587: invokestatic 120	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   590: aload_0
      //   591: getfield 276	com/tencent/mm/plugin/fts/f$a:lvm	Ljava/lang/Runnable;
      //   594: ifnull +12 -> 606
      //   597: aload_0
      //   598: getfield 276	com/tencent/mm/plugin/fts/f$a:lvm	Ljava/lang/Runnable;
      //   601: invokeinterface 280 1 0
      //   606: invokestatic 162	com/tencent/mm/plugin/fts/a:aCb	()V
      //   609: goto -594 -> 15
      //   612: aload 7
      //   614: instanceof 282
      //   617: ifeq +48 -> 665
      //   620: aload 7
      //   622: invokevirtual 285	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   625: ifnull +33 -> 658
      //   628: aload 7
      //   630: invokevirtual 285	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   633: ldc_w 287
      //   636: invokevirtual 293	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
      //   639: ifeq +19 -> 658
      //   642: bipush 17
      //   644: invokestatic 191	com/tencent/mm/plugin/fts/a/e:nX	(I)V
      //   647: goto -76 -> 571
      //   650: astore 6
      //   652: invokestatic 162	com/tencent/mm/plugin/fts/a:aCb	()V
      //   655: aload 6
      //   657: athrow
      //   658: iconst_4
      //   659: invokestatic 191	com/tencent/mm/plugin/fts/a/e:nX	(I)V
      //   662: goto -91 -> 571
      //   665: iconst_5
      //   666: invokestatic 191	com/tencent/mm/plugin/fts/a/e:nX	(I)V
      //   669: goto -98 -> 571
      //   672: astore 7
      //   674: goto -115 -> 559
      //   677: astore 7
      //   679: goto -155 -> 524
      //   682: astore 7
      //   684: goto -195 -> 489
      //   687: astore 8
      //   689: aload 6
      //   691: astore 7
      //   693: aload 8
      //   695: astore 6
      //   697: goto -312 -> 385
      //   700: astore 8
      //   702: goto -424 -> 278
      //   705: astore 6
      //   707: aconst_null
      //   708: astore 7
      //   710: goto -325 -> 385
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	713	0	this	a
      //   88	269	1	l1	long
      //   18	338	3	l2	long
      //   31	3	5	bool	boolean
      //   70	179	6	locala	a
      //   267	1	6	localInterruptedException1	InterruptedException
      //   274	311	6	localObject1	Object
      //   650	40	6	localObject2	Object
      //   695	1	6	localObject3	Object
      //   705	1	6	localSQLiteDatabaseCorruptException1	com.tencent.wcdb.database.SQLiteDatabaseCorruptException
      //   85	354	7	localObject4	Object
      //   484	8	7	localk1	com.tencent.mm.plugin.fts.a.a.k
      //   519	8	7	localSQLiteDiskIOException1	com.tencent.wcdb.database.SQLiteDiskIOException
      //   554	75	7	localException1	Exception
      //   672	1	7	localException2	Exception
      //   677	1	7	localSQLiteDiskIOException2	com.tencent.wcdb.database.SQLiteDiskIOException
      //   682	1	7	localk2	com.tencent.mm.plugin.fts.a.a.k
      //   691	18	7	localObject5	Object
      //   122	122	8	str1	String
      //   687	7	8	localSQLiteDatabaseCorruptException2	com.tencent.wcdb.database.SQLiteDatabaseCorruptException
      //   700	1	8	localInterruptedException2	InterruptedException
      //   21	104	9	str2	String
      // Exception table:
      //   from	to	target	type
      //   23	33	267	java/lang/InterruptedException
      //   55	72	267	java/lang/InterruptedException
      //   23	33	484	com/tencent/mm/plugin/fts/a/a/k
      //   55	72	484	com/tencent/mm/plugin/fts/a/a/k
      //   23	33	519	com/tencent/wcdb/database/SQLiteDiskIOException
      //   55	72	519	com/tencent/wcdb/database/SQLiteDiskIOException
      //   23	33	554	java/lang/Exception
      //   55	72	554	java/lang/Exception
      //   23	33	650	finally
      //   55	72	650	finally
      //   89	95	650	finally
      //   101	110	650	finally
      //   116	120	650	finally
      //   130	137	650	finally
      //   147	153	650	finally
      //   159	165	650	finally
      //   171	175	650	finally
      //   181	190	650	finally
      //   196	205	650	finally
      //   211	227	650	finally
      //   233	261	650	finally
      //   283	300	650	finally
      //   306	342	650	finally
      //   346	372	650	finally
      //   385	419	650	finally
      //   419	478	650	finally
      //   489	513	650	finally
      //   524	548	650	finally
      //   559	571	650	finally
      //   571	606	650	finally
      //   612	647	650	finally
      //   658	662	650	finally
      //   665	669	650	finally
      //   89	95	672	java/lang/Exception
      //   101	110	672	java/lang/Exception
      //   116	120	672	java/lang/Exception
      //   130	137	672	java/lang/Exception
      //   147	153	672	java/lang/Exception
      //   159	165	672	java/lang/Exception
      //   171	175	672	java/lang/Exception
      //   181	190	672	java/lang/Exception
      //   196	205	672	java/lang/Exception
      //   211	227	672	java/lang/Exception
      //   233	261	672	java/lang/Exception
      //   89	95	677	com/tencent/wcdb/database/SQLiteDiskIOException
      //   101	110	677	com/tencent/wcdb/database/SQLiteDiskIOException
      //   116	120	677	com/tencent/wcdb/database/SQLiteDiskIOException
      //   130	137	677	com/tencent/wcdb/database/SQLiteDiskIOException
      //   147	153	677	com/tencent/wcdb/database/SQLiteDiskIOException
      //   159	165	677	com/tencent/wcdb/database/SQLiteDiskIOException
      //   171	175	677	com/tencent/wcdb/database/SQLiteDiskIOException
      //   181	190	677	com/tencent/wcdb/database/SQLiteDiskIOException
      //   196	205	677	com/tencent/wcdb/database/SQLiteDiskIOException
      //   211	227	677	com/tencent/wcdb/database/SQLiteDiskIOException
      //   233	261	677	com/tencent/wcdb/database/SQLiteDiskIOException
      //   89	95	682	com/tencent/mm/plugin/fts/a/a/k
      //   101	110	682	com/tencent/mm/plugin/fts/a/a/k
      //   116	120	682	com/tencent/mm/plugin/fts/a/a/k
      //   130	137	682	com/tencent/mm/plugin/fts/a/a/k
      //   147	153	682	com/tencent/mm/plugin/fts/a/a/k
      //   159	165	682	com/tencent/mm/plugin/fts/a/a/k
      //   171	175	682	com/tencent/mm/plugin/fts/a/a/k
      //   181	190	682	com/tencent/mm/plugin/fts/a/a/k
      //   196	205	682	com/tencent/mm/plugin/fts/a/a/k
      //   211	227	682	com/tencent/mm/plugin/fts/a/a/k
      //   233	261	682	com/tencent/mm/plugin/fts/a/a/k
      //   89	95	687	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
      //   101	110	687	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
      //   116	120	687	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
      //   130	137	687	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
      //   147	153	687	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
      //   159	165	687	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
      //   171	175	687	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
      //   181	190	687	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
      //   196	205	687	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
      //   211	227	687	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
      //   233	261	687	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
      //   89	95	700	java/lang/InterruptedException
      //   101	110	700	java/lang/InterruptedException
      //   116	120	700	java/lang/InterruptedException
      //   130	137	700	java/lang/InterruptedException
      //   147	153	700	java/lang/InterruptedException
      //   159	165	700	java/lang/InterruptedException
      //   171	175	700	java/lang/InterruptedException
      //   181	190	700	java/lang/InterruptedException
      //   196	205	700	java/lang/InterruptedException
      //   211	227	700	java/lang/InterruptedException
      //   233	261	700	java/lang/InterruptedException
      //   23	33	705	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
      //   55	72	705	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fts\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */