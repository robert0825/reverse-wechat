package com.tencent.mm.plugin.mmsight.model.a;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.ByteBuffer;

@TargetApi(16)
public class h
  implements c
{
  private final int TIMEOUT_USEC;
  int audioSampleRate;
  public com.tencent.mm.e.b.c exi;
  private int gBk;
  public int irw;
  private MediaFormat mAudioFormat;
  public c.a naA;
  o naB;
  public ae naC;
  protected boolean naD;
  public boolean naE;
  public final Object naF;
  public c.b naG;
  public boolean naH;
  public ae naI;
  public Runnable naJ;
  private com.tencent.mm.e.b.c.a naK;
  public MediaCodec naq;
  private MediaCodec.BufferInfo nar;
  long nas;
  int nat;
  int nau;
  long nav;
  long naw;
  private int nax;
  public boolean nay;
  public boolean naz;
  private long startTime;
  
  public h(int paramInt1, int paramInt2)
  {
    GMTrace.i(7364660953088L, 54871);
    this.nas = 0L;
    this.TIMEOUT_USEC = 100;
    this.nay = false;
    this.naz = false;
    this.naA = null;
    this.startTime = 0L;
    this.naC = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(7369492791296L, 54907);
        if (h.this.naA != null)
        {
          h.this.naA.aPr();
          h.this.naA = null;
        }
        GMTrace.o(7369492791296L, 54907);
      }
    };
    this.exi = null;
    this.naF = new byte[0];
    this.naH = false;
    this.naJ = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7348286390272L, 54749);
        if (h.this.exi == null)
        {
          GMTrace.o(7348286390272L, 54749);
          return;
        }
        h.this.naH = true;
        h.this.exi.qn();
        GMTrace.o(7348286390272L, 54749);
      }
    };
    this.naK = new com.tencent.mm.e.b.c.a()
    {
      public final void ax(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(7351239180288L, 54771);
        w.w("MicroMsg.MMSightAACMediaCodecRecorder", "on rec error, %d, %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        GMTrace.o(7351239180288L, 54771);
      }
      
      public final void d(byte[] arg1, int paramAnonymousInt)
      {
        GMTrace.i(7351104962560L, 54770);
        h.this.naC.sendEmptyMessage(0);
        paramAnonymousInt = 0;
        if (!h.this.nay) {
          paramAnonymousInt = 1;
        }
        if (paramAnonymousInt == 0) {
          h.this.irw += 128;
        }
        boolean bool = h.this.naD;
        h localh;
        if (paramAnonymousInt == 0)
        {
          localh = h.this;
          if (0L == localh.nas) {
            localh.nas = System.nanoTime();
          }
          if ((localh.naB != null) && (localh.naB.nbW <= 0L)) {
            localh.naB.nbW = System.nanoTime();
          }
          if (localh.naq != null)
          {
            if (localh.naq != null) {
              break label290;
            }
            w.w("MicroMsg.MMSightAACMediaCodecRecorder", "send audio to encoder error, encoder is null, end:" + bool);
          }
        }
        for (;;)
        {
          localh.fX(bool);
          if ((bool) && (!h.this.naH)) {}
          synchronized (h.this.naF)
          {
            if (h.this.naG != null)
            {
              w.i("MicroMsg.MMSightAACMediaCodecRecorder", "do aac stop callback");
              h.this.naG.aPs();
              h.this.naG = null;
              h.this.naE = true;
              h.this.naH = true;
              h.this.naI.removeCallbacks(h.this.naJ);
              h.this.naI.post(h.this.naJ);
              GMTrace.o(7351104962560L, 54770);
              return;
              try
              {
                label290:
                localObject2 = localh.naq.getInputBuffers();
                paramAnonymousInt = localh.naq.dequeueInputBuffer(100L);
                localh.nat = paramAnonymousInt;
                if (paramAnonymousInt < 0)
                {
                  w.d("MicroMsg.MMSightAACMediaCodecRecorder", "audio no input available, drain first");
                  localh.fX(false);
                }
                if (localh.naq != null) {
                  break label395;
                }
                w.w("MicroMsg.MMSightAACMediaCodecRecorder", "send audio to encoder error, encoder is null, end:" + bool);
              }
              catch (Throwable ???)
              {
                w.e("MicroMsg.MMSightAACMediaCodecRecorder", "_offerAudioEncoder exception " + ???.getMessage());
              }
              continue;
              label395:
              if (localh.nat < 0) {
                continue;
              }
              Object localObject2 = localObject2[localh.nat];
              ((ByteBuffer)localObject2).clear();
              ((ByteBuffer)localObject2).put(???);
              ((ByteBuffer)localObject2).position(0);
              localh.nau = ???.length;
              localh.nav = System.nanoTime();
              localh.nav -= localh.nau / localh.audioSampleRate / 1000000000;
              if (localh.nau == -3) {
                w.e("MicroMsg.MMSightAACMediaCodecRecorder", "Audio read error");
              }
              long l2 = localh.nav;
              if (localh.naB != null) {}
              for (long l1 = localh.naB.nbW;; l1 = localh.nas)
              {
                localh.naw = ((l2 - l1) / 1000L);
                w.v("MicroMsg.MMSightAACMediaCodecRecorder", "queueing " + localh.nau + " audio bytes with pts " + localh.naw + ", end:" + bool + ", enqueue:" + localh.nat);
                if (!bool) {
                  break label639;
                }
                w.i("MicroMsg.MMSightAACMediaCodecRecorder", "EOS received in sendAudioToEncoder");
                localh.naq.queueInputBuffer(localh.nat, 0, localh.nau, localh.naw, 4);
                break;
              }
              label639:
              localh.naq.queueInputBuffer(localh.nat, 0, localh.nau, localh.naw, 0);
              continue;
            }
            w.w("MicroMsg.MMSightAACMediaCodecRecorder", "aac stop callback is null");
          }
        }
      }
    };
    this.gBk = paramInt2;
    this.audioSampleRate = paramInt1;
    this.naB = null;
    w.i("MicroMsg.MMSightAACMediaCodecRecorder", "create MMSightAACMediaCodecRecorder, audioBitrate: %s, audioSampleRate: %s", new Object[] { Integer.valueOf(this.gBk), Integer.valueOf(this.audioSampleRate) });
    GMTrace.o(7364660953088L, 54871);
  }
  
  public final int a(c.a parama)
  {
    int j = 0;
    GMTrace.i(7364929388544L, 54873);
    w.i("MicroMsg.MMSightAACMediaCodecRecorder", "start, onPcmReady: %s", new Object[] { parama });
    this.naA = parama;
    int i = j;
    if (!this.naz)
    {
      if (this.exi == null)
      {
        w.i("MicroMsg.MMSightAACMediaCodecRecorder", "start, pcmrecorder is null");
        GMTrace.o(7364929388544L, 54873);
        return -1;
      }
      if (!this.exi.qw()) {
        break label85;
      }
    }
    label85:
    for (i = j;; i = -1)
    {
      GMTrace.o(7364929388544L, 54873);
      return i;
    }
  }
  
  public final int a(c.b paramb)
  {
    GMTrace.i(7365063606272L, 54874);
    boolean bool1;
    boolean bool2;
    if (this.exi == null)
    {
      bool1 = true;
      if (this.naG != null) {
        break label105;
      }
      bool2 = true;
      label26:
      if (paramb != null) {
        break label110;
      }
    }
    label105:
    label110:
    for (boolean bool3 = true;; bool3 = false)
    {
      w.i("MicroMsg.MMSightAACMediaCodecRecorder", "call stop, pcmRecorder null[%B], old stopCallback null[%B]new stopCallback null[%B], pcmMarkStop[%B]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(this.naD) });
      if ((this.exi != null) || (this.naz)) {
        break label116;
      }
      GMTrace.o(7365063606272L, 54874);
      return -1;
      bool1 = false;
      break;
      bool2 = false;
      break label26;
    }
    label116:
    this.naD = true;
    synchronized (this.naF)
    {
      this.naG = paramb;
      if ((this.naE) && (paramb != null))
      {
        w.i("MicroMsg.MMSightAACMediaCodecRecorder", "has stop, directly call stop callback");
        paramb.aPs();
        this.naG = null;
      }
      af.i(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7348823261184L, 54753);
          try
          {
            if (h.this.naq != null)
            {
              w.i("MicroMsg.MMSightAACMediaCodecRecorder", "delay to stop encoder");
              h.this.naq.stop();
              h.this.naq.release();
              h.this.naq = null;
            }
            if ((h.this.exi != null) && (!h.this.naz))
            {
              h.this.exi.qn();
              h.this.exi = null;
            }
            GMTrace.o(7348823261184L, 54753);
            return;
          }
          catch (Exception localException)
          {
            w.e("MicroMsg.MMSightAACMediaCodecRecorder", "delay to stop encoder error: %s", new Object[] { localException.getMessage() });
            GMTrace.o(7348823261184L, 54753);
          }
        }
      }, 500L);
      GMTrace.o(7365063606272L, 54874);
      return 0;
    }
  }
  
  protected void a(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    GMTrace.i(7365868912640L, 54880);
    if ((this.naB != null) && ((paramBufferInfo.flags & 0x4) == 0)) {
      this.naB.b(paramByteBuffer, paramBufferInfo);
    }
    GMTrace.o(7365868912640L, 54880);
  }
  
  protected boolean aPH()
  {
    GMTrace.i(7366003130368L, 54881);
    GMTrace.o(7366003130368L, 54881);
    return false;
  }
  
  public final void aPp()
  {
    GMTrace.i(7365332041728L, 54876);
    this.nay = true;
    GMTrace.o(7365332041728L, 54876);
  }
  
  public final com.tencent.mm.e.b.c.a aPq()
  {
    GMTrace.i(7365466259456L, 54877);
    com.tencent.mm.e.b.c.a locala = this.naK;
    GMTrace.o(7365466259456L, 54877);
    return locala;
  }
  
  /* Error */
  public int af(int paramInt, String paramString)
  {
    // Byte code:
    //   0: ldc2_w 219
    //   3: ldc -35
    //   5: invokestatic 73	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: getfield 81	com/tencent/mm/plugin/mmsight/model/a/h:naz	Z
    //   12: ifne +45 -> 57
    //   15: aload_0
    //   16: getfield 98	com/tencent/mm/plugin/mmsight/model/a/h:exi	Lcom/tencent/mm/e/b/c;
    //   19: ifnull +38 -> 57
    //   22: aload_0
    //   23: getfield 159	com/tencent/mm/plugin/mmsight/model/a/h:naG	Lcom/tencent/mm/plugin/mmsight/model/a/c$b;
    //   26: ifnonnull +389 -> 415
    //   29: iconst_1
    //   30: istore_3
    //   31: ldc 118
    //   33: ldc -33
    //   35: iconst_1
    //   36: anewarray 4	java/lang/Object
    //   39: dup
    //   40: iconst_0
    //   41: iload_3
    //   42: invokestatic 166	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   45: aastore
    //   46: invokestatic 226	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   49: aload_0
    //   50: getfield 98	com/tencent/mm/plugin/mmsight/model/a/h:exi	Lcom/tencent/mm/e/b/c;
    //   53: invokevirtual 229	com/tencent/mm/e/b/c:qn	()Z
    //   56: pop
    //   57: aload_0
    //   58: getfield 231	com/tencent/mm/plugin/mmsight/model/a/h:naq	Landroid/media/MediaCodec;
    //   61: ifnull +70 -> 131
    //   64: aload_0
    //   65: getfield 159	com/tencent/mm/plugin/mmsight/model/a/h:naG	Lcom/tencent/mm/plugin/mmsight/model/a/c$b;
    //   68: ifnonnull +352 -> 420
    //   71: iconst_1
    //   72: istore_3
    //   73: ldc 118
    //   75: ldc -23
    //   77: iconst_1
    //   78: anewarray 4	java/lang/Object
    //   81: dup
    //   82: iconst_0
    //   83: iload_3
    //   84: invokestatic 166	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   87: aastore
    //   88: invokestatic 226	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   91: aload_0
    //   92: getfield 231	com/tencent/mm/plugin/mmsight/model/a/h:naq	Landroid/media/MediaCodec;
    //   95: invokevirtual 238	android/media/MediaCodec:stop	()V
    //   98: aload_0
    //   99: getfield 231	com/tencent/mm/plugin/mmsight/model/a/h:naq	Landroid/media/MediaCodec;
    //   102: invokevirtual 241	android/media/MediaCodec:release	()V
    //   105: aload_0
    //   106: aconst_null
    //   107: putfield 231	com/tencent/mm/plugin/mmsight/model/a/h:naq	Landroid/media/MediaCodec;
    //   110: aload_0
    //   111: getfield 159	com/tencent/mm/plugin/mmsight/model/a/h:naG	Lcom/tencent/mm/plugin/mmsight/model/a/c$b;
    //   114: ifnull +17 -> 131
    //   117: aload_0
    //   118: getfield 159	com/tencent/mm/plugin/mmsight/model/a/h:naG	Lcom/tencent/mm/plugin/mmsight/model/a/c$b;
    //   121: invokeinterface 177 1 0
    //   126: aload_0
    //   127: aconst_null
    //   128: putfield 159	com/tencent/mm/plugin/mmsight/model/a/h:naG	Lcom/tencent/mm/plugin/mmsight/model/a/c$b;
    //   131: aload_0
    //   132: iconst_0
    //   133: putfield 243	com/tencent/mm/plugin/mmsight/model/a/h:irw	I
    //   136: aload_0
    //   137: iconst_0
    //   138: putfield 168	com/tencent/mm/plugin/mmsight/model/a/h:naD	Z
    //   141: aload_0
    //   142: getfield 100	com/tencent/mm/plugin/mmsight/model/a/h:naF	Ljava/lang/Object;
    //   145: astore_2
    //   146: aload_2
    //   147: monitorenter
    //   148: aload_0
    //   149: iconst_0
    //   150: putfield 170	com/tencent/mm/plugin/mmsight/model/a/h:naE	Z
    //   153: aload_0
    //   154: aconst_null
    //   155: putfield 159	com/tencent/mm/plugin/mmsight/model/a/h:naG	Lcom/tencent/mm/plugin/mmsight/model/a/c$b;
    //   158: aload_2
    //   159: monitorexit
    //   160: aload_0
    //   161: getfield 81	com/tencent/mm/plugin/mmsight/model/a/h:naz	Z
    //   164: ifne +49 -> 213
    //   167: aload_0
    //   168: new 149	com/tencent/mm/e/b/c
    //   171: dup
    //   172: aload_0
    //   173: getfield 114	com/tencent/mm/plugin/mmsight/model/a/h:audioSampleRate	I
    //   176: iconst_1
    //   177: iconst_5
    //   178: invokespecial 246	com/tencent/mm/e/b/c:<init>	(III)V
    //   181: putfield 98	com/tencent/mm/plugin/mmsight/model/a/h:exi	Lcom/tencent/mm/e/b/c;
    //   184: aload_0
    //   185: getfield 98	com/tencent/mm/plugin/mmsight/model/a/h:exi	Lcom/tencent/mm/e/b/c;
    //   188: sipush 128
    //   191: invokevirtual 250	com/tencent/mm/e/b/c:de	(I)V
    //   194: aload_0
    //   195: getfield 98	com/tencent/mm/plugin/mmsight/model/a/h:exi	Lcom/tencent/mm/e/b/c;
    //   198: iconst_0
    //   199: invokevirtual 254	com/tencent/mm/e/b/c:aA	(Z)V
    //   202: aload_0
    //   203: getfield 98	com/tencent/mm/plugin/mmsight/model/a/h:exi	Lcom/tencent/mm/e/b/c;
    //   206: aload_0
    //   207: getfield 110	com/tencent/mm/plugin/mmsight/model/a/h:naK	Lcom/tencent/mm/e/b/c$a;
    //   210: putfield 257	com/tencent/mm/e/b/c:exR	Lcom/tencent/mm/e/b/c$a;
    //   213: aload_0
    //   214: getfield 259	com/tencent/mm/plugin/mmsight/model/a/h:naI	Lcom/tencent/mm/sdk/platformtools/ae;
    //   217: ifnonnull +215 -> 432
    //   220: ldc 118
    //   222: ldc_w 261
    //   225: invokestatic 147	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   228: aload_0
    //   229: new 263	com/tencent/mm/sdk/platformtools/ae
    //   232: dup
    //   233: invokespecial 264	com/tencent/mm/sdk/platformtools/ae:<init>	()V
    //   236: putfield 259	com/tencent/mm/plugin/mmsight/model/a/h:naI	Lcom/tencent/mm/sdk/platformtools/ae;
    //   239: ldc 118
    //   241: ldc_w 266
    //   244: iconst_2
    //   245: anewarray 4	java/lang/Object
    //   248: dup
    //   249: iconst_0
    //   250: aload_0
    //   251: getfield 114	com/tencent/mm/plugin/mmsight/model/a/h:audioSampleRate	I
    //   254: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   257: aastore
    //   258: dup
    //   259: iconst_1
    //   260: aload_0
    //   261: getfield 112	com/tencent/mm/plugin/mmsight/model/a/h:gBk	I
    //   264: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   267: aastore
    //   268: invokestatic 131	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   271: aload_0
    //   272: new 191	android/media/MediaCodec$BufferInfo
    //   275: dup
    //   276: invokespecial 267	android/media/MediaCodec$BufferInfo:<init>	()V
    //   279: putfield 269	com/tencent/mm/plugin/mmsight/model/a/h:nar	Landroid/media/MediaCodec$BufferInfo;
    //   282: aload_0
    //   283: new 271	android/media/MediaFormat
    //   286: dup
    //   287: invokespecial 272	android/media/MediaFormat:<init>	()V
    //   290: putfield 274	com/tencent/mm/plugin/mmsight/model/a/h:mAudioFormat	Landroid/media/MediaFormat;
    //   293: aload_0
    //   294: getfield 274	com/tencent/mm/plugin/mmsight/model/a/h:mAudioFormat	Landroid/media/MediaFormat;
    //   297: ldc_w 276
    //   300: ldc_w 278
    //   303: invokevirtual 281	android/media/MediaFormat:setString	(Ljava/lang/String;Ljava/lang/String;)V
    //   306: aload_0
    //   307: getfield 274	com/tencent/mm/plugin/mmsight/model/a/h:mAudioFormat	Landroid/media/MediaFormat;
    //   310: ldc_w 283
    //   313: iconst_2
    //   314: invokevirtual 287	android/media/MediaFormat:setInteger	(Ljava/lang/String;I)V
    //   317: aload_0
    //   318: getfield 274	com/tencent/mm/plugin/mmsight/model/a/h:mAudioFormat	Landroid/media/MediaFormat;
    //   321: ldc_w 289
    //   324: aload_0
    //   325: getfield 114	com/tencent/mm/plugin/mmsight/model/a/h:audioSampleRate	I
    //   328: invokevirtual 287	android/media/MediaFormat:setInteger	(Ljava/lang/String;I)V
    //   331: aload_0
    //   332: getfield 274	com/tencent/mm/plugin/mmsight/model/a/h:mAudioFormat	Landroid/media/MediaFormat;
    //   335: ldc_w 291
    //   338: iconst_1
    //   339: invokevirtual 287	android/media/MediaFormat:setInteger	(Ljava/lang/String;I)V
    //   342: aload_0
    //   343: getfield 274	com/tencent/mm/plugin/mmsight/model/a/h:mAudioFormat	Landroid/media/MediaFormat;
    //   346: ldc_w 293
    //   349: aload_0
    //   350: getfield 112	com/tencent/mm/plugin/mmsight/model/a/h:gBk	I
    //   353: invokevirtual 287	android/media/MediaFormat:setInteger	(Ljava/lang/String;I)V
    //   356: aload_0
    //   357: getfield 274	com/tencent/mm/plugin/mmsight/model/a/h:mAudioFormat	Landroid/media/MediaFormat;
    //   360: ldc_w 295
    //   363: sipush 16384
    //   366: invokevirtual 287	android/media/MediaFormat:setInteger	(Ljava/lang/String;I)V
    //   369: aload_0
    //   370: ldc_w 278
    //   373: invokestatic 299	android/media/MediaCodec:createEncoderByType	(Ljava/lang/String;)Landroid/media/MediaCodec;
    //   376: putfield 231	com/tencent/mm/plugin/mmsight/model/a/h:naq	Landroid/media/MediaCodec;
    //   379: aload_0
    //   380: getfield 231	com/tencent/mm/plugin/mmsight/model/a/h:naq	Landroid/media/MediaCodec;
    //   383: aload_0
    //   384: getfield 274	com/tencent/mm/plugin/mmsight/model/a/h:mAudioFormat	Landroid/media/MediaFormat;
    //   387: aconst_null
    //   388: aconst_null
    //   389: iconst_1
    //   390: invokevirtual 303	android/media/MediaCodec:configure	(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    //   393: aload_0
    //   394: getfield 231	com/tencent/mm/plugin/mmsight/model/a/h:naq	Landroid/media/MediaCodec;
    //   397: invokevirtual 306	android/media/MediaCodec:start	()V
    //   400: aload_0
    //   401: iconst_0
    //   402: putfield 79	com/tencent/mm/plugin/mmsight/model/a/h:nay	Z
    //   405: ldc2_w 219
    //   408: ldc -35
    //   410: invokestatic 134	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   413: iconst_0
    //   414: ireturn
    //   415: iconst_0
    //   416: istore_3
    //   417: goto -386 -> 31
    //   420: iconst_0
    //   421: istore_3
    //   422: goto -349 -> 73
    //   425: astore 4
    //   427: aload_2
    //   428: monitorexit
    //   429: aload 4
    //   431: athrow
    //   432: aload_0
    //   433: getfield 259	com/tencent/mm/plugin/mmsight/model/a/h:naI	Lcom/tencent/mm/sdk/platformtools/ae;
    //   436: invokevirtual 309	com/tencent/mm/sdk/platformtools/ae:getLooper	()Landroid/os/Looper;
    //   439: invokestatic 312	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   442: if_acmpeq -203 -> 239
    //   445: ldc 118
    //   447: ldc_w 314
    //   450: iconst_2
    //   451: anewarray 4	java/lang/Object
    //   454: dup
    //   455: iconst_0
    //   456: aload_0
    //   457: getfield 259	com/tencent/mm/plugin/mmsight/model/a/h:naI	Lcom/tencent/mm/sdk/platformtools/ae;
    //   460: invokevirtual 309	com/tencent/mm/sdk/platformtools/ae:getLooper	()Landroid/os/Looper;
    //   463: aastore
    //   464: dup
    //   465: iconst_1
    //   466: invokestatic 312	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   469: aastore
    //   470: invokestatic 317	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   473: aload_0
    //   474: new 263	com/tencent/mm/sdk/platformtools/ae
    //   477: dup
    //   478: invokespecial 264	com/tencent/mm/sdk/platformtools/ae:<init>	()V
    //   481: putfield 259	com/tencent/mm/plugin/mmsight/model/a/h:naI	Lcom/tencent/mm/sdk/platformtools/ae;
    //   484: goto -245 -> 239
    //   487: astore_2
    //   488: ldc 118
    //   490: aload_2
    //   491: ldc_w 319
    //   494: iconst_1
    //   495: anewarray 4	java/lang/Object
    //   498: dup
    //   499: iconst_0
    //   500: aload_2
    //   501: invokevirtual 323	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   504: aastore
    //   505: invokestatic 327	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   508: aload_0
    //   509: getfield 231	com/tencent/mm/plugin/mmsight/model/a/h:naq	Landroid/media/MediaCodec;
    //   512: astore 4
    //   514: aload 4
    //   516: ifnull +22 -> 538
    //   519: aload_0
    //   520: getfield 231	com/tencent/mm/plugin/mmsight/model/a/h:naq	Landroid/media/MediaCodec;
    //   523: invokevirtual 238	android/media/MediaCodec:stop	()V
    //   526: aload_0
    //   527: getfield 231	com/tencent/mm/plugin/mmsight/model/a/h:naq	Landroid/media/MediaCodec;
    //   530: invokevirtual 241	android/media/MediaCodec:release	()V
    //   533: aload_0
    //   534: aconst_null
    //   535: putfield 231	com/tencent/mm/plugin/mmsight/model/a/h:naq	Landroid/media/MediaCodec;
    //   538: ldc_w 329
    //   541: ldc_w 331
    //   544: invokestatic 147	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   547: getstatic 337	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   550: ldc2_w 338
    //   553: ldc2_w 340
    //   556: lconst_1
    //   557: iconst_0
    //   558: invokevirtual 344	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   561: aload_0
    //   562: iconst_0
    //   563: putfield 79	com/tencent/mm/plugin/mmsight/model/a/h:nay	Z
    //   566: ldc2_w 219
    //   569: ldc -35
    //   571: invokestatic 134	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   574: iconst_m1
    //   575: ireturn
    //   576: astore 4
    //   578: ldc 118
    //   580: aload_2
    //   581: ldc_w 346
    //   584: iconst_1
    //   585: anewarray 4	java/lang/Object
    //   588: dup
    //   589: iconst_0
    //   590: aload 4
    //   592: invokevirtual 347	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   595: aastore
    //   596: invokestatic 327	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   599: aload_0
    //   600: aconst_null
    //   601: putfield 231	com/tencent/mm/plugin/mmsight/model/a/h:naq	Landroid/media/MediaCodec;
    //   604: goto -66 -> 538
    //   607: astore_2
    //   608: aload_0
    //   609: iconst_0
    //   610: putfield 79	com/tencent/mm/plugin/mmsight/model/a/h:nay	Z
    //   613: aload_2
    //   614: athrow
    //   615: astore_2
    //   616: aload_0
    //   617: aconst_null
    //   618: putfield 231	com/tencent/mm/plugin/mmsight/model/a/h:naq	Landroid/media/MediaCodec;
    //   621: aload_2
    //   622: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	623	0	this	h
    //   0	623	1	paramInt	int
    //   0	623	2	paramString	String
    //   30	392	3	bool	boolean
    //   425	5	4	localObject	Object
    //   512	3	4	localMediaCodec	MediaCodec
    //   576	15	4	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   148	160	425	finally
    //   427	429	425	finally
    //   271	400	487	java/lang/Throwable
    //   519	533	576	java/lang/Exception
    //   271	400	607	finally
    //   488	514	607	finally
    //   533	538	607	finally
    //   538	561	607	finally
    //   599	604	607	finally
    //   616	623	607	finally
    //   519	533	615	finally
    //   578	599	615	finally
  }
  
  public final void clear()
  {
    GMTrace.i(7365197824000L, 54875);
    w.i("MicroMsg.MMSightAACMediaCodecRecorder", "clear");
    try
    {
      if (this.naq != null)
      {
        w.i("MicroMsg.MMSightAACMediaCodecRecorder", "stop encoder");
        this.naq.stop();
        this.naq.release();
        this.naq = null;
      }
      if ((this.exi != null) && (!this.naz))
      {
        w.i("MicroMsg.MMSightAACMediaCodecRecorder", "stop pcm recorder");
        this.exi.qn();
        this.exi = null;
      }
      GMTrace.o(7365197824000L, 54875);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MMSightAACMediaCodecRecorder", "clear error: %s", new Object[] { localException.getMessage() });
      GMTrace.o(7365197824000L, 54875);
    }
  }
  
  public final void fW(boolean paramBoolean)
  {
    GMTrace.i(15396652449792L, 114714);
    this.naz = paramBoolean;
    GMTrace.o(15396652449792L, 114714);
  }
  
  final void fX(boolean paramBoolean)
  {
    GMTrace.i(7365734694912L, 54879);
    if (this.naq == null)
    {
      w.w("MicroMsg.MMSightAACMediaCodecRecorder", "drain audio encoder error, encoder is null, end:" + paramBoolean);
      GMTrace.o(7365734694912L, 54879);
      return;
    }
    do
    {
      ByteBuffer[] arrayOfByteBuffer2;
      for (;;)
      {
        try
        {
          ByteBuffer[] arrayOfByteBuffer1 = this.naq.getOutputBuffers();
          this.nax = this.naq.dequeueOutputBuffer(this.nar, 100L);
          w.v("MicroMsg.MMSightAACMediaCodecRecorder", "outputBufferIndex-->%s", new Object[] { Integer.valueOf(this.nax) });
          if (this.nax == -1)
          {
            w.d("MicroMsg.MMSightAACMediaCodecRecorder", "no output available, break");
            GMTrace.o(7365734694912L, 54879);
            return;
          }
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.MMSightAACMediaCodecRecorder", "drainEncoder error: %s", new Object[] { localException.getMessage() });
          GMTrace.o(7365734694912L, 54879);
          return;
        }
        if (this.nax == -3)
        {
          arrayOfByteBuffer2 = this.naq.getOutputBuffers();
        }
        else if (this.nax == -2)
        {
          localObject = this.naq.getOutputFormat();
          w.d("MicroMsg.MMSightAACMediaCodecRecorder", "encoder output format changed: " + localObject);
          if (this.naB != null) {
            this.naB.b((MediaFormat)localObject);
          }
        }
        else
        {
          if (this.nax >= 0) {
            break;
          }
          w.v("MicroMsg.MMSightAACMediaCodecRecorder", "unexpected result from encoder.dequeueOutputBuffer: %s", new Object[] { Integer.valueOf(this.nax) });
        }
      }
      w.v("MicroMsg.MMSightAACMediaCodecRecorder", "perform encoding");
      Object localObject = arrayOfByteBuffer2[this.nax];
      if (localObject == null) {
        throw new RuntimeException("encoderOutputBuffer " + this.nax + " was null");
      }
      if ((this.nar.flags & 0x2) != 0)
      {
        w.v("MicroMsg.MMSightAACMediaCodecRecorder", "ignoring BUFFER_FLAG_CODEC_CONFIG,size: %s, %s", new Object[] { Integer.valueOf(this.nar.size), Boolean.valueOf(aPH()) });
        if (aPH()) {
          this.nar.size = 0;
        }
      }
      if (this.nar.size != 0)
      {
        if ((this.naB != null) && (!this.naB.isStart))
        {
          MediaFormat localMediaFormat = this.naq.getOutputFormat();
          this.naB.b(localMediaFormat);
        }
        ((ByteBuffer)localObject).position(this.nar.offset);
        ((ByteBuffer)localObject).limit(this.nar.offset + this.nar.size);
        a((ByteBuffer)localObject, this.nar);
      }
      this.naq.releaseOutputBuffer(this.nax, false);
    } while ((this.nar.flags & 0x4) == 0);
    if (!paramBoolean)
    {
      w.w("MicroMsg.MMSightAACMediaCodecRecorder", "reached end of stream unexpectedly");
      GMTrace.o(7365734694912L, 54879);
      return;
    }
    w.w("MicroMsg.MMSightAACMediaCodecRecorder", "do stop audio encoder");
    this.naq.stop();
    this.naq.release();
    this.naq = null;
    GMTrace.o(7365734694912L, 54879);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */