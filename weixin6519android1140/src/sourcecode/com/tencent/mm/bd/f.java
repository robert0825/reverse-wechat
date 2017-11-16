package com.tencent.mm.bd;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.compatible.d.j;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.d;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

public final class f
  implements com.tencent.mm.ad.e
{
  public static int ezm;
  public static final String heY;
  public com.tencent.mm.e.b.c.a exR;
  public com.tencent.mm.e.b.c exi;
  public int hfa;
  public int hfb;
  public boolean hfc;
  public com.tencent.mm.e.c.a hfg;
  public a hfi;
  public boolean hfk;
  private b hfl;
  public com.tencent.mm.bd.a.c hfm;
  public com.tencent.mm.bd.a.c.a hfn;
  
  static
  {
    GMTrace.i(4396435898368L, 32756);
    heY = com.tencent.mm.storage.w.ghv + "voice_temp.silk";
    ezm = 5000;
    GMTrace.o(4396435898368L, 32756);
  }
  
  public f(b paramb)
  {
    GMTrace.i(4393214672896L, 32732);
    this.hfa = 0;
    this.hfb = 0;
    this.hfc = false;
    this.hfk = false;
    this.hfl = null;
    this.hfi = null;
    this.exR = new com.tencent.mm.e.b.c.a()
    {
      short[] hfo;
      
      public final void ax(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(4400999301120L, 32790);
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SceneVoiceInputAddr", "onRecError state = %s detailState = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        f.this.be(10, -1);
        GMTrace.o(4400999301120L, 32790);
      }
      
      public final void d(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        GMTrace.i(4400865083392L, 32789);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SceneVoiceInputAddr", "OnRecPcmDataReady len: %s time: %s", new Object[] { Integer.valueOf(paramAnonymousInt), Long.valueOf(System.currentTimeMillis()) });
        if ((this.hfo == null) || (this.hfo.length < paramAnonymousInt / 2)) {
          this.hfo = new short[paramAnonymousInt / 2];
        }
        int i = 0;
        while (i < paramAnonymousInt / 2)
        {
          this.hfo[i] = ((short)(paramAnonymousArrayOfByte[(i * 2)] & 0xFF | paramAnonymousArrayOfByte[(i * 2 + 1)] << 8));
          i += 1;
        }
        paramAnonymousArrayOfByte = f.this;
        short[] arrayOfShort = this.hfo;
        int j = paramAnonymousInt / 2;
        i = 0;
        while (i < j)
        {
          int k = arrayOfShort[i];
          if (k > paramAnonymousArrayOfByte.hfa) {
            paramAnonymousArrayOfByte.hfa = k;
          }
          i += 1;
        }
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SceneVoiceInputAddr", "setCurAmplitude mMaxAmpSinceLastCall = %s", new Object[] { Integer.valueOf(paramAnonymousArrayOfByte.hfa) });
        if (f.this.hfm != null)
        {
          f.this.hfm.c(this.hfo, paramAnonymousInt / 2);
          GMTrace.o(4400865083392L, 32789);
          return;
        }
        f.this.be(9, -1);
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SceneVoiceInputAddr", "mVoiceSilentDetectAPI is null");
        GMTrace.o(4400865083392L, 32789);
      }
    };
    this.hfn = new com.tencent.mm.bd.a.c.a()
    {
      byte[] hfq;
      
      public final void Od()
      {
        GMTrace.i(4401401954304L, 32793);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SceneVoiceInputAddr", "onSpeakToSilent");
        if ((f.this.hfi instanceof b))
        {
          int i = com.tencent.mm.a.e.aY(f.Oc());
          try
          {
            ((b)f.this.hfi).hs(i);
            GMTrace.o(4401401954304L, 32793);
            return;
          }
          catch (Exception localException)
          {
            com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.SceneVoiceInputAddr", localException, "cutShortSentence error", new Object[0]);
            f.this.be(6, -1);
          }
        }
        GMTrace.o(4401401954304L, 32793);
      }
      
      public final void Oe()
      {
        GMTrace.i(4401536172032L, 32794);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SceneVoiceInputAddr", "onSilentToSpeak");
        if ((f.this.hfi instanceof b)) {
          try
          {
            g localg = ((b)f.this.hfi).heH;
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ShortSentenceContainer", "createNewShortSentence");
            localg.hfu.writeLock().lock();
            g.a locala = new g.a(localg);
            localg.hft.put(locala.hfw, locala);
            localg.hfu.writeLock().unlock();
            if (!f.this.hfg.qJ())
            {
              f.this.be(5, -1);
              GMTrace.o(4401536172032L, 32794);
              return;
            }
            GMTrace.o(4401536172032L, 32794);
            return;
          }
          catch (Exception localException)
          {
            com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.SceneVoiceInputAddr", localException, "createShortSentence error", new Object[0]);
            f.this.be(6, -1);
          }
        }
        GMTrace.o(4401536172032L, 32794);
      }
      
      public final void a(short[] paramAnonymousArrayOfShort, int paramAnonymousInt)
      {
        GMTrace.i(4401267736576L, 32792);
        if (paramAnonymousArrayOfShort == null)
        {
          GMTrace.o(4401267736576L, 32792);
          return;
        }
        if ((this.hfq == null) || (this.hfq.length < paramAnonymousInt * 2)) {
          this.hfq = new byte[paramAnonymousInt * 2];
        }
        int i = 0;
        while (i < paramAnonymousInt)
        {
          this.hfq[(i * 2)] = ((byte)(paramAnonymousArrayOfShort[i] & 0xFF));
          this.hfq[(i * 2 + 1)] = ((byte)((paramAnonymousArrayOfShort[i] & 0xFF00) >> 8));
          i += 1;
        }
        if (f.this.hfg != null) {}
        for (paramAnonymousInt = f.this.hfg.a(new com.tencent.mm.e.b.g.a(this.hfq, paramAnonymousInt * 2), 0, true);; paramAnonymousInt = -1)
        {
          if (-1 == paramAnonymousInt)
          {
            f.this.be(4, -1);
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SceneVoiceInputAddr", "write to file failed");
            GMTrace.o(4401267736576L, 32792);
            return;
          }
          f.this.hfb = (paramAnonymousInt + f.this.hfb);
          if ((!f.this.hfk) && (f.this.hfb > 200) && (!f.this.hfc))
          {
            h.xB().A(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(4391067189248L, 32716);
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SceneVoiceInputAddr", "run NetSceneNewVoiceInput mWroteBytesCnt %s time %s", new Object[] { Integer.valueOf(f.this.hfb), Long.valueOf(System.currentTimeMillis()) });
                if ((f.this.hfk) || (f.this.hfi == null) || (f.this.hfb == 0))
                {
                  com.tencent.mm.sdk.platformtools.w.w("MicroMsg.SceneVoiceInputAddr", "WorkerThread too busy can not do work");
                  GMTrace.o(4391067189248L, 32716);
                  return;
                }
                h.wS().a(235, f.this);
                if ((!((b)f.this.hfi).NW()) || (!h.wS().a(f.this.hfi, 0))) {
                  f.this.be(13, 131);
                }
                GMTrace.o(4391067189248L, 32716);
              }
            });
            f.this.hfc = true;
          }
          GMTrace.o(4401267736576L, 32792);
          return;
        }
      }
      
      public final void qf()
      {
        GMTrace.i(4401670389760L, 32795);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SceneVoiceInputAddr", "Silent enough to finish time %s", new Object[] { Long.valueOf(System.currentTimeMillis()) });
        f.this.ax(false);
        GMTrace.o(4401670389760L, 32795);
      }
    };
    this.hfl = paramb;
    GMTrace.o(4393214672896L, 32732);
  }
  
  public static String Oc()
  {
    GMTrace.i(16023046586368L, 119381);
    String str = heY;
    GMTrace.o(16023046586368L, 119381);
    return str;
  }
  
  /* Error */
  private void f(boolean paramBoolean1, boolean paramBoolean2)
  {
    // Byte code:
    //   0: ldc2_w 112
    //   3: sipush 32737
    //   6: invokestatic 51	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: ldc 115
    //   11: ldc 117
    //   13: iconst_2
    //   14: anewarray 4	java/lang/Object
    //   17: dup
    //   18: iconst_0
    //   19: iload_1
    //   20: invokestatic 123	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   23: aastore
    //   24: dup
    //   25: iconst_1
    //   26: iload_2
    //   27: invokestatic 123	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   30: aastore
    //   31: invokestatic 128	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   34: aload_0
    //   35: monitorenter
    //   36: aload_0
    //   37: iconst_1
    //   38: putfield 91	com/tencent/mm/bd/f:hfk	Z
    //   41: aload_0
    //   42: getfield 130	com/tencent/mm/bd/f:exi	Lcom/tencent/mm/e/b/c;
    //   45: ifnull +16 -> 61
    //   48: aload_0
    //   49: getfield 130	com/tencent/mm/bd/f:exi	Lcom/tencent/mm/e/b/c;
    //   52: invokevirtual 136	com/tencent/mm/e/b/c:qn	()Z
    //   55: pop
    //   56: aload_0
    //   57: aconst_null
    //   58: putfield 130	com/tencent/mm/bd/f:exi	Lcom/tencent/mm/e/b/c;
    //   61: aload_0
    //   62: getfield 138	com/tencent/mm/bd/f:hfg	Lcom/tencent/mm/e/c/a;
    //   65: ifnull +17 -> 82
    //   68: aload_0
    //   69: getfield 138	com/tencent/mm/bd/f:hfg	Lcom/tencent/mm/e/c/a;
    //   72: invokeinterface 143 1 0
    //   77: aload_0
    //   78: aconst_null
    //   79: putfield 138	com/tencent/mm/bd/f:hfg	Lcom/tencent/mm/e/c/a;
    //   82: aload_0
    //   83: getfield 145	com/tencent/mm/bd/f:hfm	Lcom/tencent/mm/bd/a/c;
    //   86: astore 4
    //   88: aload 4
    //   90: ifnull +15 -> 105
    //   93: aload_0
    //   94: getfield 145	com/tencent/mm/bd/f:hfm	Lcom/tencent/mm/bd/a/c;
    //   97: invokevirtual 150	com/tencent/mm/bd/a/c:release	()V
    //   100: aload_0
    //   101: aconst_null
    //   102: putfield 145	com/tencent/mm/bd/f:hfm	Lcom/tencent/mm/bd/a/c;
    //   105: aload_0
    //   106: iconst_0
    //   107: putfield 87	com/tencent/mm/bd/f:hfb	I
    //   110: aload_0
    //   111: getfield 95	com/tencent/mm/bd/f:hfi	Lcom/tencent/mm/bd/a;
    //   114: ifnull +38 -> 152
    //   117: aload_0
    //   118: getfield 95	com/tencent/mm/bd/f:hfi	Lcom/tencent/mm/bd/a;
    //   121: instanceof 152
    //   124: ifeq +28 -> 152
    //   127: aload_0
    //   128: getfield 95	com/tencent/mm/bd/f:hfi	Lcom/tencent/mm/bd/a;
    //   131: invokevirtual 157	com/tencent/mm/bd/a:NS	()V
    //   134: getstatic 73	com/tencent/mm/bd/f:heY	Ljava/lang/String;
    //   137: invokestatic 163	com/tencent/mm/a/e:aY	(Ljava/lang/String;)I
    //   140: istore_3
    //   141: aload_0
    //   142: getfield 95	com/tencent/mm/bd/f:hfi	Lcom/tencent/mm/bd/a;
    //   145: checkcast 152	com/tencent/mm/bd/b
    //   148: iload_3
    //   149: invokevirtual 167	com/tencent/mm/bd/b:hs	(I)V
    //   152: iload_1
    //   153: ifne +10 -> 163
    //   156: aload_0
    //   157: getfield 89	com/tencent/mm/bd/f:hfc	Z
    //   160: ifne +65 -> 225
    //   163: aload_0
    //   164: monitorexit
    //   165: ldc2_w 112
    //   168: sipush 32737
    //   171: invokestatic 78	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   174: return
    //   175: astore 4
    //   177: ldc 115
    //   179: aload 4
    //   181: ldc -87
    //   183: iconst_0
    //   184: anewarray 4	java/lang/Object
    //   187: invokestatic 173	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   190: goto -85 -> 105
    //   193: astore 4
    //   195: aload_0
    //   196: monitorexit
    //   197: aload 4
    //   199: athrow
    //   200: astore 4
    //   202: ldc 115
    //   204: aload 4
    //   206: ldc -81
    //   208: iconst_0
    //   209: anewarray 4	java/lang/Object
    //   212: invokestatic 173	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   215: aload_0
    //   216: bipush 6
    //   218: iconst_m1
    //   219: invokevirtual 179	com/tencent/mm/bd/f:be	(II)V
    //   222: goto -70 -> 152
    //   225: aload_0
    //   226: getfield 95	com/tencent/mm/bd/f:hfi	Lcom/tencent/mm/bd/a;
    //   229: ifnull +55 -> 284
    //   232: aload_0
    //   233: getfield 95	com/tencent/mm/bd/f:hfi	Lcom/tencent/mm/bd/a;
    //   236: instanceof 152
    //   239: ifeq +45 -> 284
    //   242: ldc 115
    //   244: ldc -75
    //   246: iconst_1
    //   247: anewarray 4	java/lang/Object
    //   250: dup
    //   251: iconst_0
    //   252: iload_2
    //   253: invokestatic 123	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   256: aastore
    //   257: invokestatic 128	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   260: iload_2
    //   261: ifeq +13 -> 274
    //   264: aload_0
    //   265: getfield 95	com/tencent/mm/bd/f:hfi	Lcom/tencent/mm/bd/a;
    //   268: checkcast 152	com/tencent/mm/bd/b
    //   271: invokevirtual 184	com/tencent/mm/bd/b:NX	()V
    //   274: invokestatic 190	com/tencent/mm/kernel/h:wS	()Lcom/tencent/mm/ad/n;
    //   277: sipush 235
    //   280: aload_0
    //   281: invokevirtual 195	com/tencent/mm/ad/n:b	(ILcom/tencent/mm/ad/e;)V
    //   284: aload_0
    //   285: aconst_null
    //   286: putfield 95	com/tencent/mm/bd/f:hfi	Lcom/tencent/mm/bd/a;
    //   289: aload_0
    //   290: iconst_0
    //   291: putfield 89	com/tencent/mm/bd/f:hfc	Z
    //   294: aload_0
    //   295: monitorexit
    //   296: ldc2_w 112
    //   299: sipush 32737
    //   302: invokestatic 78	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   305: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	306	0	this	f
    //   0	306	1	paramBoolean1	boolean
    //   0	306	2	paramBoolean2	boolean
    //   140	9	3	i	int
    //   86	3	4	localc	com.tencent.mm.bd.a.c
    //   175	5	4	localException1	Exception
    //   193	5	4	localObject	Object
    //   200	5	4	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   93	105	175	java/lang/Exception
    //   36	61	193	finally
    //   61	82	193	finally
    //   82	88	193	finally
    //   93	105	193	finally
    //   105	141	193	finally
    //   141	152	193	finally
    //   156	163	193	finally
    //   163	165	193	finally
    //   177	190	193	finally
    //   195	197	193	finally
    //   202	222	193	finally
    //   225	260	193	finally
    //   264	274	193	finally
    //   274	284	193	finally
    //   284	296	193	finally
    //   141	152	200	java/lang/Exception
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(4393348890624L, 32733);
    String[] arrayOfString = ((a)paramk).NT();
    Set localSet = ((a)paramk).NV();
    long l = System.currentTimeMillis();
    int i;
    int k;
    if (arrayOfString == null)
    {
      i = -1;
      k = paramk.hashCode();
      if (this.hfi != null) {
        break label164;
      }
    }
    label164:
    for (int j = -1;; j = this.hfi.hashCode())
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SceneVoiceInputAddr", "onSceneEnd time %s errType:%s errCode:%s list:%s scene.hashCode():%s,this.hashCode():%s", new Object[] { Long.valueOf(l), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(j) });
      if ((this.hfi != null) && (paramk.hashCode() == this.hfi.hashCode())) {
        break label176;
      }
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SceneVoiceInputAddr", "onSceneEnd scene.hashCode() != mVoiceRecogScene.hashCode()");
      GMTrace.o(4393348890624L, 32733);
      return;
      i = arrayOfString.length;
      break;
    }
    label176:
    if (this.hfl != null)
    {
      if ((paramInt2 != 0) || (paramInt1 != 0))
      {
        if ((paramString != null) && (paramString.equalsIgnoreCase("SecurityCheckError"))) {
          this.hfl.v(13, 132, -1);
        }
        for (;;)
        {
          bK(false);
          GMTrace.o(4393348890624L, 32733);
          return;
          if ((paramString != null) && (paramString.equalsIgnoreCase("ReadFileLengthError"))) {
            this.hfl.v(13, 133, -1);
          } else {
            this.hfl.v(11, paramInt1, paramInt2);
          }
        }
      }
      this.hfl.a(arrayOfString, localSet);
      if (((paramk instanceof b)) && (this.hfb == 0) && (((b)paramk).heH.Oi()))
      {
        this.hfl.Of();
        bK(false);
      }
    }
    GMTrace.o(4393348890624L, 32733);
  }
  
  public final void ax(boolean paramBoolean)
  {
    GMTrace.i(4393617326080L, 32735);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SceneVoiceInputAddr", "stop fromUI = %s", new Object[] { Boolean.valueOf(paramBoolean) });
    if ((!paramBoolean) && (this.hfl != null)) {
      this.hfl.Ob();
    }
    f(true, true);
    GMTrace.o(4393617326080L, 32735);
  }
  
  public final void bK(boolean paramBoolean)
  {
    GMTrace.i(4393751543808L, 32736);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SceneVoiceInputAddr", "cancel fromUI = %s", new Object[] { Boolean.valueOf(paramBoolean) });
    this.hfl = null;
    f(false, paramBoolean);
    GMTrace.o(4393751543808L, 32736);
  }
  
  public final void be(int paramInt1, int paramInt2)
  {
    GMTrace.i(4393483108352L, 32734);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SceneVoiceInputAddr", "error localCode = %s,errType = %s,errCode = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(-1) });
    if (this.hfl != null) {
      this.hfl.v(paramInt1, paramInt2, -1);
    }
    f(false, true);
    GMTrace.o(4393483108352L, 32734);
  }
  
  private final class a
    implements Runnable
  {
    public a()
    {
      GMTrace.i(4388382834688L, 32696);
      GMTrace.o(4388382834688L, 32696);
    }
    
    public final void run()
    {
      GMTrace.i(4388517052416L, 32697);
      long l1;
      synchronized (f.this)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SceneVoiceInputAddr", "initDeviceInLock time %s", new Object[] { Long.valueOf(System.currentTimeMillis()) });
        long l2 = System.nanoTime() & 0xFFFFFFFF;
        l1 = l2;
        if (l2 < 0L) {
          l1 = Math.abs(l2);
        }
        try
        {
          File localFile = new File(f.heY);
          if (!localFile.exists()) {
            localFile.mkdir();
          }
          localFile = new File(f.Oc());
          if (!localFile.exists()) {
            localFile.createNewFile();
          }
          localFile.delete();
        }
        catch (Exception localException)
        {
          for (;;)
          {
            com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.SceneVoiceInputAddr", localException, "delete file failed", new Object[0]);
          }
        }
        f.this.exi = new com.tencent.mm.e.b.c(16000, 1, 3);
        f.this.exi.exG = -19;
        f.this.exi.aA(false);
        f.this.hfg = new com.tencent.mm.e.c.c(16000, 23900);
        if (!f.this.hfg.bU(f.Oc()))
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SceneVoiceInputAddr", "init speex writer failed");
          f.this.hfg.qI();
          f.this.hfg = null;
          f.this.be(5, -1);
          GMTrace.o(4388517052416L, 32697);
          return;
        }
      }
      if (p.fQL.fPy > 0)
      {
        f.this.exi.j(p.fQL.fPy, true);
        label302:
        f.this.exi.de(50);
        f.this.exi.aB(false);
      }
      for (;;)
      {
        try
        {
          f.this.hfm = new com.tencent.mm.bd.a.c();
          f.this.hfm.hfR = f.this.hfn;
          com.tencent.mm.storage.c localc = com.tencent.mm.y.c.c.Ct().er("100235");
          if (!localc.isValid()) {
            break label512;
          }
          i = bg.getInt((String)localc.bSg().get("MMVoipVadOn"), 0);
          f.this.hfi = new b(f.Oc(), String.valueOf(l1), String.valueOf(i));
          f.this.exi.exR = f.this.exR;
          if (f.this.exi.qw()) {
            break;
          }
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SceneVoiceInputAddr", "start record failed");
          f.this.be(8, -1);
        }
        catch (Throwable localThrowable)
        {
          com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.SceneVoiceInputAddr", localThrowable, "init VoiceDetectAPI failed", new Object[0]);
          f.this.be(7, -1);
        }
        f.this.exi.j(5, false);
        break label302;
        break;
        label512:
        int i = 0;
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract void Ob();
    
    public abstract void Of();
    
    public abstract void a(String[] paramArrayOfString, Set<String> paramSet);
    
    public abstract void v(int paramInt1, int paramInt2, int paramInt3);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bd\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */