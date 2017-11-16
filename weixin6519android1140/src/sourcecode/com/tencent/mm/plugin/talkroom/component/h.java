package com.tencent.mm.plugin.talkroom.component;

import android.media.AudioTrack;
import android.os.Looper;
import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.talkroom.model.a;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;

public final class h
  extends e.a
  implements Runnable
{
  private static final int qwC;
  private int bufferSize;
  private boolean eIE;
  private boolean euV;
  private ae handler;
  private AudioTrack hdT;
  private boolean hed;
  private boolean hfI;
  private final Object lock;
  private int mxR;
  private int qwD;
  private final c qwE;
  private boolean qwF;
  private long qwG;
  private int qwH;
  private long qwI;
  private v2engine qwn;
  private short qwo;
  private short qwp;
  
  static
  {
    GMTrace.i(5191675936768L, 38681);
    qwC = a.qwC;
    GMTrace.o(5191675936768L, 38681);
  }
  
  public h(v2engine paramv2engine, c paramc)
  {
    GMTrace.i(5190467977216L, 38672);
    this.qwD = qwC;
    this.bufferSize = (qwC / 1000 * 20 * 2);
    this.handler = new ae(Looper.getMainLooper());
    this.lock = new Object();
    this.euV = false;
    this.hed = false;
    this.eIE = true;
    this.qwF = false;
    this.qwG = 0L;
    this.hfI = true;
    this.mxR = 0;
    this.qwI = 0L;
    this.qwn = paramv2engine;
    this.qwE = paramc;
    this.hed = true;
    if ((this.hdT != null) && (this.hdT.getState() == 1))
    {
      this.hdT.stop();
      this.hdT.release();
    }
    v2engine.AS().e(true, false);
    int i = v2engine.AS().aK(true);
    int j = AudioTrack.getMinBufferSize(this.qwD, 2, 2);
    if ((j == -2) || (j == -1))
    {
      GMTrace.o(5190467977216L, 38672);
      return;
    }
    this.hdT = new com.tencent.mm.compatible.b.c(i, this.qwD, 2, 2, j * 8);
    this.hed = false;
    GMTrace.o(5190467977216L, 38672);
  }
  
  public final void blb()
  {
    GMTrace.i(5190602194944L, 38673);
    this.eIE = true;
    if ((this.hdT != null) && (this.hdT.getState() == 1)) {
      this.hdT.pause();
    }
    GMTrace.o(5190602194944L, 38673);
  }
  
  public final int bsc()
  {
    GMTrace.i(5191139065856L, 38677);
    if (this.qwp < this.qwo) {
      this.qwp = this.qwo;
    }
    if (this.qwp == 0)
    {
      GMTrace.o(5191139065856L, 38677);
      return 0;
    }
    int i = (short)(this.qwo * 100 / this.qwp);
    this.qwo = 0;
    GMTrace.o(5191139065856L, 38677);
    return i;
  }
  
  public final void bsd()
  {
    GMTrace.i(5190736412672L, 38674);
    if ((this.hdT != null) && (this.hdT.getState() == 1)) {
      this.hdT.play();
    }
    synchronized (this.lock)
    {
      this.eIE = false;
      this.lock.notify();
      this.qwp = 0;
      this.qwo = 0;
      GMTrace.o(5190736412672L, 38674);
      return;
    }
  }
  
  public final void release()
  {
    GMTrace.i(5190870630400L, 38675);
    w.i("MicroMsg.TalkRoomPlayer", "release");
    this.euV = true;
    if ((this.hdT != null) && (this.hdT.getState() == 1))
    {
      this.hdT.stop();
      this.hdT.release();
    }
    synchronized (this.lock)
    {
      this.eIE = false;
      this.lock.notify();
      GMTrace.o(5190870630400L, 38675);
      return;
    }
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: ldc2_w 195
    //   3: ldc -59
    //   5: invokestatic 47	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: getfield 87	com/tencent/mm/plugin/talkroom/component/h:euV	Z
    //   12: ifeq +12 -> 24
    //   15: ldc2_w 195
    //   18: ldc -59
    //   20: invokestatic 55	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   23: return
    //   24: aload_0
    //   25: getfield 89	com/tencent/mm/plugin/talkroom/component/h:hed	Z
    //   28: ifeq +30 -> 58
    //   31: ldc2_w 198
    //   34: invokestatic 205	java/lang/Thread:sleep	(J)V
    //   37: goto -29 -> 8
    //   40: astore 8
    //   42: ldc -73
    //   44: aload 8
    //   46: ldc -49
    //   48: iconst_0
    //   49: anewarray 82	java/lang/Object
    //   52: invokestatic 211	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   55: goto -47 -> 8
    //   58: aload_0
    //   59: getfield 85	com/tencent/mm/plugin/talkroom/component/h:lock	Ljava/lang/Object;
    //   62: astore 8
    //   64: aload 8
    //   66: monitorenter
    //   67: aload_0
    //   68: getfield 91	com/tencent/mm/plugin/talkroom/component/h:eIE	Z
    //   71: istore 5
    //   73: iload 5
    //   75: ifeq +10 -> 85
    //   78: aload_0
    //   79: getfield 85	com/tencent/mm/plugin/talkroom/component/h:lock	Ljava/lang/Object;
    //   82: invokevirtual 214	java/lang/Object:wait	()V
    //   85: aload 8
    //   87: monitorexit
    //   88: aload_0
    //   89: getfield 101	com/tencent/mm/plugin/talkroom/component/h:qwI	J
    //   92: lstore 6
    //   94: aload_0
    //   95: invokestatic 220	com/tencent/mm/sdk/platformtools/bg:Pw	()J
    //   98: putfield 101	com/tencent/mm/plugin/talkroom/component/h:qwI	J
    //   101: aload_0
    //   102: getfield 101	com/tencent/mm/plugin/talkroom/component/h:qwI	J
    //   105: lload 6
    //   107: lsub
    //   108: lstore 6
    //   110: lload 6
    //   112: ldc2_w 221
    //   115: lcmp
    //   116: ifge +31 -> 147
    //   119: lload 6
    //   121: lconst_0
    //   122: lcmp
    //   123: ifle +24 -> 147
    //   126: aload_0
    //   127: getfield 85	com/tencent/mm/plugin/talkroom/component/h:lock	Ljava/lang/Object;
    //   130: astore 8
    //   132: aload 8
    //   134: monitorenter
    //   135: aload_0
    //   136: getfield 85	com/tencent/mm/plugin/talkroom/component/h:lock	Ljava/lang/Object;
    //   139: lload 6
    //   141: invokevirtual 224	java/lang/Object:wait	(J)V
    //   144: aload 8
    //   146: monitorexit
    //   147: new 226	com/tencent/mm/pointers/PByteArray
    //   150: dup
    //   151: invokespecial 227	com/tencent/mm/pointers/PByteArray:<init>	()V
    //   154: astore 8
    //   156: new 229	com/tencent/mm/pointers/PInt
    //   159: dup
    //   160: invokespecial 230	com/tencent/mm/pointers/PInt:<init>	()V
    //   163: astore 9
    //   165: new 229	com/tencent/mm/pointers/PInt
    //   168: dup
    //   169: invokespecial 230	com/tencent/mm/pointers/PInt:<init>	()V
    //   172: astore 10
    //   174: aload_0
    //   175: getfield 103	com/tencent/mm/plugin/talkroom/component/h:qwn	Lcom/tencent/mm/plugin/talkroom/component/v2engine;
    //   178: invokevirtual 233	com/tencent/mm/plugin/talkroom/component/v2engine:IsSilenceFrame	()I
    //   181: istore_3
    //   182: iload_3
    //   183: ifne +437 -> 620
    //   186: aload_0
    //   187: getfield 103	com/tencent/mm/plugin/talkroom/component/h:qwn	Lcom/tencent/mm/plugin/talkroom/component/v2engine;
    //   190: aload 8
    //   192: aload_0
    //   193: getfield 67	com/tencent/mm/plugin/talkroom/component/h:bufferSize	I
    //   196: aload 9
    //   198: aload 10
    //   200: invokevirtual 237	com/tencent/mm/plugin/talkroom/component/v2engine:GetAudioData	(Lcom/tencent/mm/pointers/PByteArray;ILcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;)I
    //   203: istore_2
    //   204: iload_2
    //   205: ifge +143 -> 348
    //   208: aload_0
    //   209: aload_0
    //   210: getfield 99	com/tencent/mm/plugin/talkroom/component/h:mxR	I
    //   213: iconst_1
    //   214: iadd
    //   215: putfield 99	com/tencent/mm/plugin/talkroom/component/h:mxR	I
    //   218: ldc -73
    //   220: ldc -17
    //   222: iconst_2
    //   223: anewarray 82	java/lang/Object
    //   226: dup
    //   227: iconst_0
    //   228: iload_2
    //   229: invokestatic 245	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   232: aastore
    //   233: dup
    //   234: iconst_1
    //   235: aload_0
    //   236: getfield 99	com/tencent/mm/plugin/talkroom/component/h:mxR	I
    //   239: invokestatic 245	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   242: aastore
    //   243: invokestatic 248	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   246: aload_0
    //   247: getfield 99	com/tencent/mm/plugin/talkroom/component/h:mxR	I
    //   250: bipush 100
    //   252: if_icmplt -244 -> 8
    //   255: aload_0
    //   256: iconst_0
    //   257: putfield 99	com/tencent/mm/plugin/talkroom/component/h:mxR	I
    //   260: aload_0
    //   261: iconst_1
    //   262: putfield 91	com/tencent/mm/plugin/talkroom/component/h:eIE	Z
    //   265: goto -257 -> 8
    //   268: astore 8
    //   270: ldc -73
    //   272: aload 8
    //   274: ldc -49
    //   276: iconst_0
    //   277: anewarray 82	java/lang/Object
    //   280: invokestatic 211	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   283: ldc -73
    //   285: aload 8
    //   287: invokevirtual 252	java/lang/Exception:toString	()Ljava/lang/String;
    //   290: invokestatic 254	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   293: goto -285 -> 8
    //   296: astore 9
    //   298: ldc -73
    //   300: aload 9
    //   302: ldc -49
    //   304: iconst_0
    //   305: anewarray 82	java/lang/Object
    //   308: invokestatic 211	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   311: goto -226 -> 85
    //   314: astore 9
    //   316: aload 8
    //   318: monitorexit
    //   319: aload 9
    //   321: athrow
    //   322: astore 9
    //   324: aload 8
    //   326: monitorexit
    //   327: aload 9
    //   329: athrow
    //   330: astore 8
    //   332: ldc -73
    //   334: aload 8
    //   336: ldc -49
    //   338: iconst_0
    //   339: anewarray 82	java/lang/Object
    //   342: invokestatic 211	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   345: goto -198 -> 147
    //   348: iload_3
    //   349: ifne +224 -> 573
    //   352: aload_0
    //   353: getfield 107	com/tencent/mm/plugin/talkroom/component/h:hdT	Landroid/media/AudioTrack;
    //   356: invokevirtual 257	android/media/AudioTrack:getPlayState	()I
    //   359: iconst_3
    //   360: if_icmpeq +10 -> 370
    //   363: aload_0
    //   364: getfield 107	com/tencent/mm/plugin/talkroom/component/h:hdT	Landroid/media/AudioTrack;
    //   367: invokevirtual 175	android/media/AudioTrack:play	()V
    //   370: aload 8
    //   372: getfield 261	com/tencent/mm/pointers/PByteArray:value	[B
    //   375: astore 11
    //   377: aload 8
    //   379: getfield 261	com/tencent/mm/pointers/PByteArray:value	[B
    //   382: arraylength
    //   383: istore 4
    //   385: iconst_0
    //   386: istore_2
    //   387: iload_2
    //   388: iload 4
    //   390: iconst_2
    //   391: idiv
    //   392: if_icmpge +43 -> 435
    //   395: aload 11
    //   397: iload_2
    //   398: iconst_2
    //   399: imul
    //   400: baload
    //   401: sipush 255
    //   404: iand
    //   405: aload 11
    //   407: iload_2
    //   408: iconst_2
    //   409: imul
    //   410: iconst_1
    //   411: iadd
    //   412: baload
    //   413: bipush 8
    //   415: ishl
    //   416: ior
    //   417: i2s
    //   418: istore_1
    //   419: iload_1
    //   420: aload_0
    //   421: getfield 168	com/tencent/mm/plugin/talkroom/component/h:qwo	S
    //   424: if_icmple +201 -> 625
    //   427: aload_0
    //   428: iload_1
    //   429: putfield 168	com/tencent/mm/plugin/talkroom/component/h:qwo	S
    //   432: goto +193 -> 625
    //   435: aload_0
    //   436: getfield 107	com/tencent/mm/plugin/talkroom/component/h:hdT	Landroid/media/AudioTrack;
    //   439: aload 8
    //   441: getfield 261	com/tencent/mm/pointers/PByteArray:value	[B
    //   444: iconst_0
    //   445: aload 8
    //   447: getfield 261	com/tencent/mm/pointers/PByteArray:value	[B
    //   450: arraylength
    //   451: invokevirtual 265	android/media/AudioTrack:write	([BII)I
    //   454: pop
    //   455: iload_3
    //   456: ifne +134 -> 590
    //   459: aload_0
    //   460: invokestatic 220	com/tencent/mm/sdk/platformtools/bg:Pw	()J
    //   463: putfield 95	com/tencent/mm/plugin/talkroom/component/h:qwG	J
    //   466: iconst_0
    //   467: istore 5
    //   469: aload_0
    //   470: getfield 97	com/tencent/mm/plugin/talkroom/component/h:hfI	Z
    //   473: ifne +15 -> 488
    //   476: aload_0
    //   477: getfield 267	com/tencent/mm/plugin/talkroom/component/h:qwH	I
    //   480: aload 10
    //   482: getfield 269	com/tencent/mm/pointers/PInt:value	I
    //   485: if_icmpeq +16 -> 501
    //   488: iload 5
    //   490: ifne +11 -> 501
    //   493: aload 9
    //   495: getfield 269	com/tencent/mm/pointers/PInt:value	I
    //   498: ifne +15 -> 513
    //   501: aload_0
    //   502: getfield 97	com/tencent/mm/plugin/talkroom/component/h:hfI	Z
    //   505: ifne -497 -> 8
    //   508: iload 5
    //   510: ifeq -502 -> 8
    //   513: aload_0
    //   514: getfield 93	com/tencent/mm/plugin/talkroom/component/h:qwF	Z
    //   517: ifne -509 -> 8
    //   520: iload 5
    //   522: ifne +20 -> 542
    //   525: aload 10
    //   527: getfield 269	com/tencent/mm/pointers/PInt:value	I
    //   530: ifeq +12 -> 542
    //   533: aload_0
    //   534: aload 10
    //   536: getfield 269	com/tencent/mm/pointers/PInt:value	I
    //   539: putfield 267	com/tencent/mm/plugin/talkroom/component/h:qwH	I
    //   542: aload_0
    //   543: getfield 80	com/tencent/mm/plugin/talkroom/component/h:handler	Lcom/tencent/mm/sdk/platformtools/ae;
    //   546: new 8	com/tencent/mm/plugin/talkroom/component/h$1
    //   549: dup
    //   550: aload_0
    //   551: aload 9
    //   553: aload 10
    //   555: iload 5
    //   557: invokespecial 272	com/tencent/mm/plugin/talkroom/component/h$1:<init>	(Lcom/tencent/mm/plugin/talkroom/component/h;Lcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;Z)V
    //   560: invokevirtual 276	com/tencent/mm/sdk/platformtools/ae:postAtFrontOfQueueV2	(Ljava/lang/Runnable;)Z
    //   563: pop
    //   564: aload_0
    //   565: iload 5
    //   567: putfield 97	com/tencent/mm/plugin/talkroom/component/h:hfI	Z
    //   570: goto -562 -> 8
    //   573: aload_0
    //   574: getfield 97	com/tencent/mm/plugin/talkroom/component/h:hfI	Z
    //   577: ifeq -122 -> 455
    //   580: aload_0
    //   581: getfield 107	com/tencent/mm/plugin/talkroom/component/h:hdT	Landroid/media/AudioTrack;
    //   584: invokevirtual 160	android/media/AudioTrack:pause	()V
    //   587: goto -132 -> 455
    //   590: aload_0
    //   591: getfield 95	com/tencent/mm/plugin/talkroom/component/h:qwG	J
    //   594: invokestatic 280	com/tencent/mm/sdk/platformtools/bg:aI	(J)J
    //   597: lstore 6
    //   599: lload 6
    //   601: ldc2_w 281
    //   604: lcmp
    //   605: ifge +9 -> 614
    //   608: iconst_0
    //   609: istore 5
    //   611: goto -142 -> 469
    //   614: iconst_1
    //   615: istore 5
    //   617: goto -148 -> 469
    //   620: iconst_0
    //   621: istore_2
    //   622: goto -418 -> 204
    //   625: iload_2
    //   626: iconst_1
    //   627: iadd
    //   628: istore_2
    //   629: goto -242 -> 387
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	632	0	this	h
    //   418	11	1	s	short
    //   203	426	2	i	int
    //   181	275	3	j	int
    //   383	9	4	k	int
    //   71	545	5	bool	boolean
    //   92	508	6	l	long
    //   40	5	8	localInterruptedException1	InterruptedException
    //   268	57	8	localException	Exception
    //   330	116	8	localInterruptedException2	InterruptedException
    //   163	34	9	localPInt1	PInt
    //   296	5	9	localInterruptedException3	InterruptedException
    //   314	6	9	localObject2	Object
    //   322	230	9	localPInt2	PInt
    //   172	382	10	localPInt3	PInt
    //   375	31	11	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   31	37	40	java/lang/InterruptedException
    //   147	182	268	java/lang/Exception
    //   186	204	268	java/lang/Exception
    //   208	265	268	java/lang/Exception
    //   352	370	268	java/lang/Exception
    //   370	385	268	java/lang/Exception
    //   387	395	268	java/lang/Exception
    //   419	432	268	java/lang/Exception
    //   435	455	268	java/lang/Exception
    //   459	466	268	java/lang/Exception
    //   469	488	268	java/lang/Exception
    //   493	501	268	java/lang/Exception
    //   501	508	268	java/lang/Exception
    //   513	520	268	java/lang/Exception
    //   525	542	268	java/lang/Exception
    //   542	570	268	java/lang/Exception
    //   573	587	268	java/lang/Exception
    //   590	599	268	java/lang/Exception
    //   78	85	296	java/lang/InterruptedException
    //   67	73	314	finally
    //   78	85	314	finally
    //   85	88	314	finally
    //   298	311	314	finally
    //   316	319	314	finally
    //   135	147	322	finally
    //   324	327	322	finally
    //   126	135	330	java/lang/InterruptedException
    //   327	330	330	java/lang/InterruptedException
  }
  
  public final void start()
  {
    GMTrace.i(5191273283584L, 38678);
    com.tencent.mm.sdk.f.e.b(this, "TalkRoomPlayer_start").start();
    GMTrace.o(5191273283584L, 38678);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\component\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */