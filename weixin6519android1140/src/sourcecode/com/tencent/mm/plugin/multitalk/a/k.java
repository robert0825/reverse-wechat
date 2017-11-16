package com.tencent.mm.plugin.multitalk.a;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.pluginsdk.i.l;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.concurrent.LinkedBlockingQueue;

public final class k
  implements Runnable
{
  protected volatile a nmx;
  protected LinkedBlockingQueue<c> nnh;
  protected ae[] nni;
  volatile l nnj;
  private int nnk;
  private int nnl;
  private int nnm;
  private int nnn;
  boolean running;
  
  public k(a parama)
  {
    GMTrace.i(4748757434368L, 35381);
    this.nnj = new l("multitalk_network");
    this.nnl = 5;
    this.nnh = new LinkedBlockingQueue();
    this.nmx = parama;
    GMTrace.o(4748757434368L, 35381);
  }
  
  /* Error */
  private boolean a(c paramc)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_0
    //   3: monitorenter
    //   4: ldc2_w 71
    //   7: ldc 73
    //   9: invokestatic 45	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: aload_1
    //   13: ifnull +438 -> 451
    //   16: aload_1
    //   17: getfield 77	com/tencent/mm/plugin/multitalk/a/k$c:nnq	[I
    //   20: ifnonnull +11 -> 31
    //   23: aload_1
    //   24: ldc 78
    //   26: newarray <illegal type>
    //   28: putfield 77	com/tencent/mm/plugin/multitalk/a/k$c:nnq	[I
    //   31: aload_1
    //   32: getfield 77	com/tencent/mm/plugin/multitalk/a/k$c:nnq	[I
    //   35: iconst_0
    //   36: iconst_0
    //   37: iastore
    //   38: invokestatic 84	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   41: invokevirtual 88	java/lang/Thread:getName	()Ljava/lang/String;
    //   44: ldc 90
    //   46: invokevirtual 96	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   49: ifeq +10 -> 59
    //   52: aload_1
    //   53: getfield 77	com/tencent/mm/plugin/multitalk/a/k$c:nnq	[I
    //   56: iconst_0
    //   57: iconst_1
    //   58: iastore
    //   59: invokestatic 102	com/tencent/mm/plugin/multitalk/a/o:aRQ	()Lcom/tencent/mm/plugin/multitalk/a/c;
    //   62: getfield 108	com/tencent/mm/plugin/multitalk/a/c:nlX	Lcom/tencent/pb/talkroom/sdk/d;
    //   65: aload_1
    //   66: getfield 77	com/tencent/mm/plugin/multitalk/a/k$c:nnq	[I
    //   69: invokeinterface 114 2 0
    //   74: astore 4
    //   76: aload_0
    //   77: getfield 63	com/tencent/mm/plugin/multitalk/a/k:nmx	Lcom/tencent/mm/plugin/multitalk/a/a;
    //   80: ifnull +231 -> 311
    //   83: aload 4
    //   85: getfield 119	com/tencent/pb/talkroom/sdk/f:ret	I
    //   88: ifle +223 -> 311
    //   91: aload 4
    //   93: getfield 123	com/tencent/pb/talkroom/sdk/f:xOC	Ljava/lang/String;
    //   96: invokestatic 129	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   99: ifne +212 -> 311
    //   102: aload_0
    //   103: getfield 63	com/tencent/mm/plugin/multitalk/a/k:nmx	Lcom/tencent/mm/plugin/multitalk/a/a;
    //   106: aload 4
    //   108: getfield 123	com/tencent/pb/talkroom/sdk/f:xOC	Ljava/lang/String;
    //   111: invokeinterface 135 2 0
    //   116: istore_2
    //   117: aload_1
    //   118: aload 4
    //   120: getfield 123	com/tencent/pb/talkroom/sdk/f:xOC	Ljava/lang/String;
    //   123: putfield 138	com/tencent/mm/plugin/multitalk/a/k$c:username	Ljava/lang/String;
    //   126: aload_1
    //   127: aload 4
    //   129: getfield 141	com/tencent/pb/talkroom/sdk/f:xOG	I
    //   132: putfield 144	com/tencent/mm/plugin/multitalk/a/k$c:nns	I
    //   135: aload_1
    //   136: aload 4
    //   138: getfield 147	com/tencent/pb/talkroom/sdk/f:xOH	I
    //   141: putfield 150	com/tencent/mm/plugin/multitalk/a/k$c:nnt	I
    //   144: aload_1
    //   145: aload 4
    //   147: getfield 153	com/tencent/pb/talkroom/sdk/f:xOF	I
    //   150: putfield 156	com/tencent/mm/plugin/multitalk/a/k$c:nnr	I
    //   153: ldc -98
    //   155: ldc -96
    //   157: iconst_2
    //   158: anewarray 4	java/lang/Object
    //   161: dup
    //   162: iconst_0
    //   163: aload_1
    //   164: getfield 138	com/tencent/mm/plugin/multitalk/a/k$c:username	Ljava/lang/String;
    //   167: aastore
    //   168: dup
    //   169: iconst_1
    //   170: iload_2
    //   171: invokestatic 166	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   174: aastore
    //   175: invokestatic 172	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   178: iload_2
    //   179: iflt +35 -> 214
    //   182: aload_0
    //   183: getfield 174	com/tencent/mm/plugin/multitalk/a/k:nni	[Lcom/tencent/mm/sdk/platformtools/ae;
    //   186: iload_2
    //   187: iconst_2
    //   188: irem
    //   189: aaload
    //   190: ifnull +24 -> 214
    //   193: aload_0
    //   194: getfield 174	com/tencent/mm/plugin/multitalk/a/k:nni	[Lcom/tencent/mm/sdk/platformtools/ae;
    //   197: iload_2
    //   198: iconst_2
    //   199: irem
    //   200: aaload
    //   201: new 11	com/tencent/mm/plugin/multitalk/a/k$b
    //   204: dup
    //   205: aload_0
    //   206: aload_1
    //   207: invokespecial 177	com/tencent/mm/plugin/multitalk/a/k$b:<init>	(Lcom/tencent/mm/plugin/multitalk/a/k;Lcom/tencent/mm/plugin/multitalk/a/k$c;)V
    //   210: invokevirtual 183	com/tencent/mm/sdk/platformtools/ae:post	(Ljava/lang/Runnable;)Z
    //   213: pop
    //   214: aload_0
    //   215: getfield 54	com/tencent/mm/plugin/multitalk/a/k:nnj	Lcom/tencent/mm/pluginsdk/i/l;
    //   218: ldc -71
    //   220: invokevirtual 188	com/tencent/mm/pluginsdk/i/l:OG	(Ljava/lang/String;)V
    //   223: aload_0
    //   224: aload_0
    //   225: getfield 190	com/tencent/mm/plugin/multitalk/a/k:nnn	I
    //   228: iconst_1
    //   229: iadd
    //   230: putfield 190	com/tencent/mm/plugin/multitalk/a/k:nnn	I
    //   233: aload_0
    //   234: getfield 192	com/tencent/mm/plugin/multitalk/a/k:nnm	I
    //   237: aload_0
    //   238: getfield 190	com/tencent/mm/plugin/multitalk/a/k:nnn	I
    //   241: iadd
    //   242: bipush 100
    //   244: irem
    //   245: ifne +54 -> 299
    //   248: ldc -98
    //   250: ldc -62
    //   252: iconst_2
    //   253: anewarray 4	java/lang/Object
    //   256: dup
    //   257: iconst_0
    //   258: aload_0
    //   259: getfield 192	com/tencent/mm/plugin/multitalk/a/k:nnm	I
    //   262: aload_0
    //   263: getfield 192	com/tencent/mm/plugin/multitalk/a/k:nnm	I
    //   266: aload_0
    //   267: getfield 190	com/tencent/mm/plugin/multitalk/a/k:nnn	I
    //   270: iadd
    //   271: idiv
    //   272: invokestatic 166	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   275: aastore
    //   276: dup
    //   277: iconst_1
    //   278: aload_0
    //   279: getfield 190	com/tencent/mm/plugin/multitalk/a/k:nnn	I
    //   282: aload_0
    //   283: getfield 192	com/tencent/mm/plugin/multitalk/a/k:nnm	I
    //   286: aload_0
    //   287: getfield 190	com/tencent/mm/plugin/multitalk/a/k:nnn	I
    //   290: iadd
    //   291: idiv
    //   292: invokestatic 166	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   295: aastore
    //   296: invokestatic 197	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   299: ldc2_w 71
    //   302: ldc 73
    //   304: invokestatic 66	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   307: aload_0
    //   308: monitorexit
    //   309: iload_3
    //   310: ireturn
    //   311: aload 4
    //   313: getfield 119	com/tencent/pb/talkroom/sdk/f:ret	I
    //   316: ifne +13 -> 329
    //   319: aload_0
    //   320: aload_0
    //   321: getfield 192	com/tencent/mm/plugin/multitalk/a/k:nnm	I
    //   324: iconst_1
    //   325: iadd
    //   326: putfield 192	com/tencent/mm/plugin/multitalk/a/k:nnm	I
    //   329: aload_0
    //   330: getfield 54	com/tencent/mm/plugin/multitalk/a/k:nnj	Lcom/tencent/mm/pluginsdk/i/l;
    //   333: ldc -57
    //   335: invokevirtual 188	com/tencent/mm/pluginsdk/i/l:OG	(Ljava/lang/String;)V
    //   338: ldc -98
    //   340: ldc -55
    //   342: iconst_1
    //   343: anewarray 4	java/lang/Object
    //   346: dup
    //   347: iconst_0
    //   348: aload 4
    //   350: getfield 119	com/tencent/pb/talkroom/sdk/f:ret	I
    //   353: invokestatic 166	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   356: aastore
    //   357: invokestatic 197	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   360: aload_0
    //   361: getfield 192	com/tencent/mm/plugin/multitalk/a/k:nnm	I
    //   364: aload_0
    //   365: getfield 190	com/tencent/mm/plugin/multitalk/a/k:nnn	I
    //   368: iadd
    //   369: bipush 100
    //   371: irem
    //   372: ifne +58 -> 430
    //   375: ldc -98
    //   377: ldc -53
    //   379: iconst_2
    //   380: anewarray 4	java/lang/Object
    //   383: dup
    //   384: iconst_0
    //   385: aload_0
    //   386: getfield 192	com/tencent/mm/plugin/multitalk/a/k:nnm	I
    //   389: i2f
    //   390: aload_0
    //   391: getfield 192	com/tencent/mm/plugin/multitalk/a/k:nnm	I
    //   394: aload_0
    //   395: getfield 190	com/tencent/mm/plugin/multitalk/a/k:nnn	I
    //   398: iadd
    //   399: i2f
    //   400: fdiv
    //   401: invokestatic 208	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   404: aastore
    //   405: dup
    //   406: iconst_1
    //   407: aload_0
    //   408: getfield 190	com/tencent/mm/plugin/multitalk/a/k:nnn	I
    //   411: i2f
    //   412: aload_0
    //   413: getfield 192	com/tencent/mm/plugin/multitalk/a/k:nnm	I
    //   416: aload_0
    //   417: getfield 190	com/tencent/mm/plugin/multitalk/a/k:nnn	I
    //   420: iadd
    //   421: i2f
    //   422: fdiv
    //   423: invokestatic 208	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   426: aastore
    //   427: invokestatic 197	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   430: aload_0
    //   431: getfield 61	com/tencent/mm/plugin/multitalk/a/k:nnh	Ljava/util/concurrent/LinkedBlockingQueue;
    //   434: aload_1
    //   435: invokevirtual 212	java/util/concurrent/LinkedBlockingQueue:put	(Ljava/lang/Object;)V
    //   438: ldc2_w 71
    //   441: ldc 73
    //   443: invokestatic 66	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   446: iconst_0
    //   447: istore_3
    //   448: goto -141 -> 307
    //   451: ldc2_w 71
    //   454: ldc 73
    //   456: invokestatic 66	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   459: iconst_0
    //   460: istore_3
    //   461: goto -154 -> 307
    //   464: astore_1
    //   465: aload_0
    //   466: monitorexit
    //   467: aload_1
    //   468: athrow
    //   469: astore_1
    //   470: goto -32 -> 438
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	473	0	this	k
    //   0	473	1	paramc	c
    //   116	84	2	i	int
    //   1	460	3	bool	boolean
    //   74	275	4	localf	com.tencent.pb.talkroom.sdk.f
    // Exception table:
    //   from	to	target	type
    //   4	12	464	finally
    //   16	31	464	finally
    //   31	59	464	finally
    //   59	178	464	finally
    //   182	214	464	finally
    //   214	299	464	finally
    //   299	307	464	finally
    //   311	329	464	finally
    //   329	430	464	finally
    //   430	438	464	finally
    //   438	446	464	finally
    //   451	459	464	finally
    //   430	438	469	java/lang/InterruptedException
  }
  
  public final void rf(int paramInt)
  {
    GMTrace.i(4749294305280L, 35385);
    this.nnk = paramInt;
    w.i("MicroMsg.MT.MultiTalkVideoNetworkReceiver", "memberSize " + paramInt);
    GMTrace.o(4749294305280L, 35385);
  }
  
  public final void run()
  {
    GMTrace.i(4749160087552L, 35384);
    w.i("MicroMsg.MT.MultiTalkVideoNetworkReceiver", "start run receiver sleepTime: " + this.nnl);
    while (this.running)
    {
      this.nnj.OG("_total");
      Object localObject = null;
      try
      {
        c localc = (c)this.nnh.take();
        localObject = localc;
      }
      catch (InterruptedException localInterruptedException2)
      {
        boolean bool;
        for (;;) {}
      }
      bool = false;
      if (localObject != null)
      {
        if (((c)localObject).gpJ) {
          break;
        }
        bool = a((c)localObject);
      }
      if (!bool) {
        try
        {
          Thread.sleep(this.nnl);
        }
        catch (InterruptedException localInterruptedException1) {}
      }
    }
    w.i("MicroMsg.MT.MultiTalkVideoNetworkReceiver", "stop run receiver");
    GMTrace.o(4749160087552L, 35384);
  }
  
  public final void start()
  {
    GMTrace.i(4748891652096L, 35382);
    w.i("MicroMsg.MT.MultiTalkVideoNetworkReceiver", "current member size %d", new Object[] { Integer.valueOf(this.nnk) });
    this.running = true;
    e.d(this, "MultiTalk_videoReceiver1", 1).start();
    e.d(this, "MultiTalk_videoReceiver2", 1).start();
    this.nni = new ae[2];
    int i = 0;
    while (i < this.nni.length)
    {
      e.d(new a(i), "MultiTalkVideoTaskManager_drawer_handler", 1).start();
      i += 1;
    }
    i = 0;
    while (i < 36)
    {
      this.nnh.add(new c(false));
      i += 1;
    }
    GMTrace.o(4748891652096L, 35382);
  }
  
  public final void stop()
  {
    int i = 0;
    GMTrace.i(4749025869824L, 35383);
    this.nmx = null;
    this.running = false;
    this.nnk = 0;
    if (this.nni != null) {
      while (i < this.nni.length)
      {
        if (this.nni[i] != null)
        {
          this.nni[i].removeCallbacksAndMessages(null);
          this.nni[i].getLooper().quit();
          this.nni[i] = null;
        }
        i += 1;
      }
    }
    this.nnh.clear();
    this.nnh.add(new c(true));
    this.nnh.add(new c(true));
    GMTrace.o(4749025869824L, 35383);
  }
  
  private final class a
    implements Runnable
  {
    int index;
    
    a(int paramInt)
    {
      GMTrace.i(4763521384448L, 35491);
      this.index = paramInt;
      GMTrace.o(4763521384448L, 35491);
    }
    
    public final void run()
    {
      GMTrace.i(4763655602176L, 35492);
      Looper.prepare();
      w.i("MicroMsg.MT.MultiTalkVideoNetworkReceiver", "start drawer handler");
      k.this.nni[this.index] = new ae();
      Looper.loop();
      GMTrace.o(4763655602176L, 35492);
    }
  }
  
  protected final class b
    implements Runnable
  {
    private k.c nnp;
    
    public b(k.c paramc)
    {
      GMTrace.i(4748488998912L, 35379);
      this.nnp = paramc;
      GMTrace.o(4748488998912L, 35379);
    }
    
    public final void run()
    {
      GMTrace.i(4748623216640L, 35380);
      if (this.nnp != null)
      {
        w.d("MicroMsg.MT.MultiTalkVideoNetworkReceiver", "draw user %s threadId %d", new Object[] { this.nnp.username, Long.valueOf(Thread.currentThread().getId()) });
        if (k.this.nmx != null) {
          k.this.nmx.a(this.nnp.username, this.nnp.nnq, this.nnp.nns, this.nnp.nnt, OpenGlRender.qPq);
        }
        try
        {
          k.this.nnh.put(this.nnp);
          GMTrace.o(4748623216640L, 35380);
          return;
        }
        catch (InterruptedException localInterruptedException) {}
      }
      GMTrace.o(4748623216640L, 35380);
    }
  }
  
  public final class c
  {
    boolean gpJ;
    int[] nnq;
    int nnr;
    int nns;
    int nnt;
    String username;
    
    c(boolean paramBoolean)
    {
      GMTrace.i(4750770700288L, 35396);
      this.gpJ = paramBoolean;
      GMTrace.o(4750770700288L, 35396);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */