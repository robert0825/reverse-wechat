package com.tencent.mm.modelvoice;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.a;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.util.b.a;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

public final class i
  implements d
{
  public static Object hdH;
  private static int hdI;
  public static int hdJ;
  private static int hdO;
  public int exV;
  private a hdA;
  public com.tencent.mm.compatible.util.b hdB;
  public d.a hdC;
  public d.b hdD;
  public volatile boolean hdE;
  public String hdF;
  public String hdG;
  public int hdK;
  public int hdL;
  public com.tencent.mm.e.c.b hdM;
  private int hdN;
  public MediaPlayer.OnCompletionListener hdP;
  public MediaPlayer.OnErrorListener hdQ;
  public AudioTrack mAudioTrack;
  public String mFileName;
  public int mSampleRate;
  public int mStatus;
  
  static
  {
    GMTrace.i(558614183936L, 4162);
    hdH = new Object();
    hdI = -1;
    hdO = 100;
    GMTrace.o(558614183936L, 4162);
  }
  
  public i()
  {
    GMTrace.i(553245474816L, 4122);
    this.hdC = null;
    this.hdD = null;
    this.exV = 2;
    this.mSampleRate = 16000;
    this.mFileName = "";
    this.mStatus = 0;
    this.hdE = false;
    this.hdF = "";
    this.hdG = "";
    this.hdL = 0;
    this.hdM = null;
    this.hdN = 8;
    this.hdP = new MediaPlayer.OnCompletionListener()
    {
      public final void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
      {
        GMTrace.i(564922417152L, 4209);
        if (i.this.hdB != null)
        {
          w.i("MicroMsg.SilkPlayer", "silkPlayer play onCompletion abandonFocus");
          i.this.hdB.tx();
        }
        try
        {
          i.this.mStatus = 0;
          if (i.this.mAudioTrack != null)
          {
            w.i("MicroMsg.SilkPlayer", "mAudioTrack.stop()");
            i.this.mAudioTrack.stop();
            i.this.mAudioTrack.release();
            i.this.mAudioTrack = null;
          }
          GMTrace.o(564922417152L, 4209);
          return;
        }
        catch (Exception paramAnonymousMediaPlayer)
        {
          w.e("MicroMsg.SilkPlayer", "exception:%s", new Object[] { bg.f(paramAnonymousMediaPlayer) });
          w.e("MicroMsg.SilkPlayer", "setCompletion File[" + i.this.mFileName + "] ErrMsg[" + paramAnonymousMediaPlayer.getStackTrace() + "]");
          GMTrace.o(564922417152L, 4209);
        }
      }
    };
    this.hdQ = new MediaPlayer.OnErrorListener()
    {
      public final boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(552977039360L, 4120);
        w.i("MicroMsg.SilkPlayer", "onError");
        if (i.this.hdB != null) {
          i.this.hdB.tx();
        }
        if (i.this.hdD != null) {
          i.this.hdD.onError();
        }
        try
        {
          i.this.mStatus = -1;
          if (i.this.mAudioTrack != null)
          {
            w.i("MicroMsg.SilkPlayer", "mAudioTrack.stop()");
            i.this.mAudioTrack.stop();
            i.this.mAudioTrack.release();
            i.this.mAudioTrack = null;
          }
          GMTrace.o(552977039360L, 4120);
          return false;
        }
        catch (Exception paramAnonymousMediaPlayer)
        {
          for (;;)
          {
            w.e("MicroMsg.SilkPlayer", "setErrorListener File[" + i.this.mFileName + "] ErrMsg[" + paramAnonymousMediaPlayer.getStackTrace() + "]");
          }
        }
      }
    };
    hdI += 1;
    this.hdK = hdI;
    w.i("MicroMsg.SilkPlayer", "[%d] new Instance", new Object[] { Integer.valueOf(this.hdK) });
    GMTrace.o(553245474816L, 4122);
  }
  
  public i(Context paramContext)
  {
    this();
    GMTrace.i(553379692544L, 4123);
    this.hdB = new com.tencent.mm.compatible.util.b(paramContext);
    GMTrace.o(553379692544L, 4123);
  }
  
  private boolean G(String paramString, boolean paramBoolean)
  {
    int j = 2;
    GMTrace.i(554319216640L, 4130);
    if (this.mStatus != 0)
    {
      w.e("MicroMsg.SilkPlayer", "startPlay error status:" + this.mStatus);
      GMTrace.o(554319216640L, 4130);
      return false;
    }
    if (r.hkN) {
      ao(paramString, com.tencent.mm.e.b.g.eyv);
    }
    w.i("MicroMsg.SilkPlayer", "startPlay");
    this.mStatus = 1;
    this.mFileName = paramString;
    for (;;)
    {
      int i;
      synchronized (hdH)
      {
        mE(paramString);
        if (r.hkN)
        {
          paramString = com.tencent.mm.e.b.g.eyu;
          if (this.exV == 2)
          {
            i = 1;
            this.hdM = new com.tencent.mm.e.c.b(paramString, i, this.mSampleRate);
          }
        }
        else
        {
          int k = this.mSampleRate;
          i = j;
          if (this.exV == 2) {
            i = 1;
          }
          w.d("MicroMsg.SilkPlayer", "startPlay, sampleRate: %d, channelCnt: %d ", new Object[] { Integer.valueOf(k), Integer.valueOf(i) });
        }
      }
      try
      {
        bJ(paramBoolean);
        GMTrace.o(554319216640L, 4130);
        return true;
        paramString = finally;
        throw paramString;
        i = 2;
      }
      catch (Exception paramString)
      {
        try
        {
          bJ(true);
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.SilkPlayer", "startPlay File[" + this.mFileName + "] failed");
          w.e("MicroMsg.SilkPlayer", "exception:%s", new Object[] { bg.f(paramString) });
          this.mStatus = -1;
          GMTrace.o(554319216640L, 4130);
        }
      }
    }
    return false;
  }
  
  private void bI(boolean paramBoolean)
  {
    GMTrace.i(553916563456L, 4127);
    if (this.mAudioTrack != null) {
      w.i("MicroMsg.SilkPlayer", "mAudioTrack.stop()");
    }
    try
    {
      this.mAudioTrack.stop();
      this.mAudioTrack.release();
      this.mAudioTrack = null;
      int j = this.mSampleRate;
      int k = this.exV;
      int m = this.hdN;
      if (paramBoolean)
      {
        i = 3;
        if (!p.fQD.fNp) {
          break label378;
        }
        p.fQD.dump();
        if ((!paramBoolean) || (p.fQD.fNR < 0)) {
          break label350;
        }
        i = p.fQD.fNR;
        int n = AudioTrack.getMinBufferSize(j, k, 2);
        w.i("AudioDeviceFactory", "speakerOn: %b, type: %d, sampleRate: %d, channelConfig: %d, PlayBufSize: %d, bufTimes: %d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(n), Integer.valueOf(m) });
        com.tencent.mm.compatible.b.c localc2 = new com.tencent.mm.compatible.b.c(i, j, k, 2, m * n);
        com.tencent.mm.compatible.b.c localc1 = localc2;
        if (localc2.getState() == 0)
        {
          localc2.release();
          w.i("AudioDeviceFactory", "reconstruct AudioTrack");
          if (i != 0) {
            break label373;
          }
          i = 3;
          localc1 = new com.tencent.mm.compatible.b.c(i, j, k, 2, m * n);
        }
        w.i("AudioDeviceFactory", "AudioTrack state: " + localc1.getState());
        this.mAudioTrack = localc1;
        if ((this.mAudioTrack == null) || (this.mAudioTrack.getState() == 0))
        {
          com.tencent.mm.plugin.report.service.g.ork.a(161L, 0L, 1L, false);
          com.tencent.mm.plugin.report.service.g.ork.a(161L, 2L, 1L, false);
        }
        GMTrace.o(553916563456L, 4127);
      }
    }
    catch (Exception localException)
    {
      label350:
      label373:
      label378:
      for (;;)
      {
        w.e("MicroMsg.SilkPlayer", "mAudioTrack.stop() error: %s", new Object[] { localException.getMessage() });
        continue;
        int i = 0;
        continue;
        if ((!paramBoolean) && (p.fQD.fNS >= 0))
        {
          i = p.fQD.fNS;
          continue;
          i = 0;
        }
      }
    }
  }
  
  private void bJ(boolean paramBoolean)
  {
    GMTrace.i(554587652096L, 4132);
    if (!com.tencent.mm.a.e.aZ(this.mFileName))
    {
      GMTrace.o(554587652096L, 4132);
      return;
    }
    try
    {
      bI(paramBoolean);
      if (this.hdB != null) {
        this.hdB.requestFocus();
      }
      AudioTrack localAudioTrack = this.mAudioTrack;
      if (localAudioTrack != null) {}
      try
      {
        w.i("MicroMsg.SilkPlayer", "play");
        this.mAudioTrack.play();
        this.hdA = new a();
        com.tencent.mm.sdk.f.e.b(this.hdA, "SilkPlayer_play_" + this.hdK, 10);
        GMTrace.o(554587652096L, 4132);
        return;
      }
      catch (Exception localException1)
      {
        w.e("MicroMsg.SilkPlayer", "audioTrack error:%s", new Object[] { localException1.getMessage() });
        com.tencent.mm.plugin.report.service.g.ork.a(161L, 0L, 1L, false);
        com.tencent.mm.plugin.report.service.g.ork.a(161L, 3L, 1L, false);
        GMTrace.o(554587652096L, 4132);
        return;
      }
      return;
    }
    catch (Exception localException2)
    {
      if (this.hdB != null) {
        this.hdB.tx();
      }
      w.e("MicroMsg.SilkPlayer", "playImp : fail, exception = " + localException2.getMessage());
      w.e("MicroMsg.SilkPlayer", "exception:%s", new Object[] { bg.f(localException2) });
      GMTrace.o(554587652096L, 4132);
    }
  }
  
  /* Error */
  private String mF(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 337
    //   3: sipush 4139
    //   6: invokestatic 59	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: ldc 112
    //   11: ldc_w 340
    //   14: invokestatic 342	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   17: aload_0
    //   18: getfield 86	com/tencent/mm/modelvoice/i:mFileName	Ljava/lang/String;
    //   21: invokestatic 302	com/tencent/mm/a/e:aZ	(Ljava/lang/String;)Z
    //   24: ifne +33 -> 57
    //   27: ldc 112
    //   29: ldc_w 344
    //   32: iconst_1
    //   33: anewarray 4	java/lang/Object
    //   36: dup
    //   37: iconst_0
    //   38: aload_0
    //   39: getfield 86	com/tencent/mm/modelvoice/i:mFileName	Ljava/lang/String;
    //   42: aastore
    //   43: invokestatic 215	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   46: ldc2_w 337
    //   49: sipush 4139
    //   52: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   55: aconst_null
    //   56: areturn
    //   57: ldc 112
    //   59: ldc_w 346
    //   62: invokestatic 342	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   65: bipush -16
    //   67: invokestatic 352	android/os/Process:setThreadPriority	(I)V
    //   70: aload_0
    //   71: getfield 82	com/tencent/mm/modelvoice/i:mSampleRate	I
    //   74: iconst_2
    //   75: iconst_2
    //   76: invokestatic 251	android/media/AudioTrack:getMinBufferSize	(III)I
    //   79: iconst_1
    //   80: ishl
    //   81: newarray <illegal type>
    //   83: astore 5
    //   85: aload_0
    //   86: getfield 82	com/tencent/mm/modelvoice/i:mSampleRate	I
    //   89: bipush 20
    //   91: imul
    //   92: sipush 1000
    //   95: idiv
    //   96: i2s
    //   97: istore_2
    //   98: aload_1
    //   99: invokestatic 355	com/tencent/mm/modelvoice/i:mG	(Ljava/lang/String;)Z
    //   102: pop
    //   103: new 357	java/io/FileOutputStream
    //   106: dup
    //   107: aload_1
    //   108: invokespecial 358	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   111: astore 4
    //   113: aload_0
    //   114: getfield 88	com/tencent/mm/modelvoice/i:mStatus	I
    //   117: iconst_1
    //   118: if_icmpeq +11 -> 129
    //   121: aload_0
    //   122: getfield 88	com/tencent/mm/modelvoice/i:mStatus	I
    //   125: iconst_2
    //   126: if_icmpne +136 -> 262
    //   129: aload 5
    //   131: iload_2
    //   132: invokestatic 364	com/tencent/mm/modelvoice/MediaRecorder:SilkDoDec	([BS)I
    //   135: istore_3
    //   136: iload_3
    //   137: ifge +81 -> 218
    //   140: aload_0
    //   141: iconst_0
    //   142: putfield 88	com/tencent/mm/modelvoice/i:mStatus	I
    //   145: goto -32 -> 113
    //   148: astore_1
    //   149: ldc 112
    //   151: new 143	java/lang/StringBuilder
    //   154: dup
    //   155: ldc_w 366
    //   158: invokespecial 148	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   161: aload_1
    //   162: invokevirtual 291	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   165: invokevirtual 203	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   171: invokestatic 160	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   174: ldc 112
    //   176: ldc -49
    //   178: iconst_1
    //   179: anewarray 4	java/lang/Object
    //   182: dup
    //   183: iconst_0
    //   184: aload_1
    //   185: invokestatic 213	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   188: aastore
    //   189: invokestatic 215	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   192: aload_0
    //   193: iconst_0
    //   194: putfield 88	com/tencent/mm/modelvoice/i:mStatus	I
    //   197: aload 4
    //   199: ifnull +8 -> 207
    //   202: aload 4
    //   204: invokevirtual 369	java/io/FileOutputStream:close	()V
    //   207: ldc2_w 337
    //   210: sipush 4139
    //   213: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   216: aconst_null
    //   217: areturn
    //   218: aload_0
    //   219: getfield 90	com/tencent/mm/modelvoice/i:hdE	Z
    //   222: ifeq +12 -> 234
    //   225: ldc2_w 370
    //   228: invokestatic 377	java/lang/Thread:sleep	(J)V
    //   231: goto -13 -> 218
    //   234: aload 4
    //   236: aload 5
    //   238: iconst_0
    //   239: iload_2
    //   240: iconst_2
    //   241: imul
    //   242: invokevirtual 381	java/io/FileOutputStream:write	([BII)V
    //   245: aload 4
    //   247: invokevirtual 384	java/io/FileOutputStream:flush	()V
    //   250: iload_3
    //   251: ifne -138 -> 113
    //   254: aload_0
    //   255: iconst_0
    //   256: putfield 88	com/tencent/mm/modelvoice/i:mStatus	I
    //   259: goto -146 -> 113
    //   262: ldc 112
    //   264: ldc_w 386
    //   267: invokestatic 342	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   270: aload 4
    //   272: invokevirtual 369	java/io/FileOutputStream:close	()V
    //   275: invokestatic 389	com/tencent/mm/modelvoice/MediaRecorder:SilkDecUnInit	()I
    //   278: istore_3
    //   279: ldc 112
    //   281: ldc_w 391
    //   284: iconst_1
    //   285: anewarray 4	java/lang/Object
    //   288: dup
    //   289: iconst_0
    //   290: aload_0
    //   291: getfield 110	com/tencent/mm/modelvoice/i:hdK	I
    //   294: invokestatic 120	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   297: aastore
    //   298: invokestatic 125	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   301: iload_3
    //   302: ifeq +25 -> 327
    //   305: ldc 112
    //   307: new 143	java/lang/StringBuilder
    //   310: dup
    //   311: ldc_w 393
    //   314: invokespecial 148	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   317: iload_3
    //   318: invokevirtual 152	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   321: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   324: invokestatic 160	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   327: ldc2_w 337
    //   330: sipush 4139
    //   333: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   336: aload_1
    //   337: areturn
    //   338: astore_1
    //   339: ldc 112
    //   341: aload_1
    //   342: ldc 84
    //   344: iconst_0
    //   345: anewarray 4	java/lang/Object
    //   348: invokestatic 397	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   351: goto -144 -> 207
    //   354: astore_1
    //   355: ldc 112
    //   357: new 143	java/lang/StringBuilder
    //   360: dup
    //   361: ldc_w 399
    //   364: invokespecial 148	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   367: aload_1
    //   368: invokevirtual 291	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   371: invokevirtual 203	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   374: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   377: invokestatic 160	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   380: ldc 112
    //   382: ldc -49
    //   384: iconst_1
    //   385: anewarray 4	java/lang/Object
    //   388: dup
    //   389: iconst_0
    //   390: aload_1
    //   391: invokestatic 213	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   394: aastore
    //   395: invokestatic 215	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   398: ldc2_w 337
    //   401: sipush 4139
    //   404: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   407: aconst_null
    //   408: areturn
    //   409: astore_1
    //   410: aconst_null
    //   411: astore 4
    //   413: goto -264 -> 149
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	416	0	this	i
    //   0	416	1	paramString	String
    //   97	145	2	s	short
    //   135	183	3	i	int
    //   111	301	4	localFileOutputStream	java.io.FileOutputStream
    //   83	154	5	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   113	129	148	java/lang/Exception
    //   129	136	148	java/lang/Exception
    //   140	145	148	java/lang/Exception
    //   218	231	148	java/lang/Exception
    //   234	250	148	java/lang/Exception
    //   254	259	148	java/lang/Exception
    //   262	275	148	java/lang/Exception
    //   202	207	338	java/io/IOException
    //   149	197	354	java/lang/Exception
    //   202	207	354	java/lang/Exception
    //   275	301	354	java/lang/Exception
    //   305	327	354	java/lang/Exception
    //   339	351	354	java/lang/Exception
    //   57	113	409	java/lang/Exception
  }
  
  private static boolean mG(String paramString)
  {
    GMTrace.i(555661393920L, 4140);
    if (paramString == null)
    {
      GMTrace.o(555661393920L, 4140);
      return false;
    }
    label168:
    for (;;)
    {
      try
      {
        int i = paramString.lastIndexOf("/");
        if (i == -1)
        {
          w.w("MicroMsg.SilkPlayer", "ensureFileFloder end == -1");
          GMTrace.o(555661393920L, 4140);
          return false;
        }
        paramString = paramString.substring(0, i + 1);
        File localFile = new File(paramString);
        if (!localFile.exists())
        {
          if (localFile.mkdirs()) {
            break label168;
          }
          if (localFile.isDirectory())
          {
            break label168;
            w.i("MicroMsg.SilkPlayer", "ensureFileFloder mkdir:%s,sucess:%s", new Object[] { paramString, Boolean.valueOf(bool) });
          }
        }
        else
        {
          GMTrace.o(555661393920L, 4140);
          return true;
        }
        boolean bool = false;
        continue;
        bool = true;
      }
      catch (Exception paramString)
      {
        w.w("MicroMsg.SilkPlayer", "ensureFileFloder Exception:", new Object[] { paramString.getMessage() });
        GMTrace.o(555661393920L, 4140);
        return false;
      }
    }
  }
  
  public final boolean F(String paramString, boolean paramBoolean)
  {
    GMTrace.i(554050781184L, 4128);
    paramBoolean = G(paramString, paramBoolean);
    GMTrace.o(554050781184L, 4128);
    return paramBoolean;
  }
  
  public final void a(d.a parama)
  {
    GMTrace.i(553513910272L, 4124);
    this.hdC = parama;
    GMTrace.o(553513910272L, 4124);
  }
  
  public final void a(d.b paramb)
  {
    GMTrace.i(553648128000L, 4125);
    this.hdD = paramb;
    GMTrace.o(553648128000L, 4125);
  }
  
  public final String ao(String paramString1, String paramString2)
  {
    GMTrace.i(555392958464L, 4138);
    if (this.mStatus != 0)
    {
      w.e("MicroMsg.SilkPlayer", "startPlay error status:" + this.mStatus);
      GMTrace.o(555392958464L, 4138);
      return null;
    }
    this.mStatus = 1;
    this.mFileName = paramString1;
    try
    {
      localFileInputStream = new FileInputStream(paramString1);
      int i;
    }
    catch (Exception paramString1)
    {
      try
      {
        i = localFileInputStream.available();
        paramString1 = new byte[i];
        localFileInputStream.read(paramString1, 0, i);
        this.mSampleRate = MediaRecorder.SilkGetEncSampleRate(new byte[] { paramString1[0] });
        MediaRecorder.SilkDecInit(this.mSampleRate, paramString1, i);
        w.i("MicroMsg.SilkPlayer", "[%d] SilkDecInit in silkToPcm", new Object[] { Integer.valueOf(this.hdK) });
        localFileInputStream.close();
        paramString1 = mF(paramString2);
        GMTrace.o(555392958464L, 4138);
        return paramString1;
      }
      catch (Exception paramString1)
      {
        for (;;)
        {
          FileInputStream localFileInputStream;
          paramString2 = localFileInputStream;
        }
      }
      paramString1 = paramString1;
      paramString2 = null;
    }
    tmp172_169[0] = this.mFileName;
    Object[] tmp179_172 = tmp172_169;
    tmp179_172[1] = paramString1.getMessage();
    w.e("MicroMsg.SilkPlayer", "silkToPcm, file[%s], exception: %s", tmp179_172);
    w.e("MicroMsg.SilkPlayer", "exception:%s", new Object[] { bg.f(paramString1) });
    this.mStatus = -1;
    if (paramString2 != null) {}
    try
    {
      paramString2.close();
      GMTrace.o(555392958464L, 4138);
      return null;
    }
    catch (IOException paramString1)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.SilkPlayer", paramString1, "", new Object[0]);
      }
    }
  }
  
  public final boolean aw(boolean paramBoolean)
  {
    GMTrace.i(17481590636544L, 130248);
    if (this.mStatus != 1)
    {
      GMTrace.o(17481590636544L, 130248);
      return false;
    }
    this.mStatus = 2;
    synchronized (this.hdG)
    {
      try
      {
        w.v("MicroMsg.SilkPlayer", "before mOk.wait");
        long l = System.currentTimeMillis();
        this.hdG.wait();
        w.v("MicroMsg.SilkPlayer", "after mOk.wait time:" + (System.currentTimeMillis() - l));
        if ((this.hdB != null) && (paramBoolean)) {
          this.hdB.tx();
        }
        GMTrace.o(17481590636544L, 130248);
        return true;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.SilkPlayer", "exception:%s", new Object[] { bg.f(localException) });
        GMTrace.o(17481590636544L, 130248);
        return false;
      }
    }
  }
  
  public final void ay(boolean paramBoolean)
  {
    GMTrace.i(553782345728L, 4126);
    w.d("MicroMsg.SilkPlayer", "setSpeakerOn: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.hdE = true;
    this.exV = 2;
    bI(paramBoolean);
    try
    {
      this.mAudioTrack.play();
      this.hdE = false;
      GMTrace.o(553782345728L, 4126);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(161L, 0L, 1L, false);
        com.tencent.mm.plugin.report.service.g.ork.a(161L, 3L, 1L, false);
        w.e("MicroMsg.SilkPlayer", "audioTrack error:%s", new Object[] { localException.getMessage() });
      }
    }
  }
  
  public final void b(b.a parama)
  {
    GMTrace.i(17481724854272L, 130249);
    if ((parama != null) && (this.hdB != null)) {
      this.hdB.a(parama);
    }
    GMTrace.o(17481724854272L, 130249);
  }
  
  public final boolean c(String paramString, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(554184998912L, 4129);
    paramBoolean = G(paramString, paramBoolean);
    GMTrace.o(554184998912L, 4129);
    return paramBoolean;
  }
  
  public final int getStatus()
  {
    GMTrace.i(553111257088L, 4121);
    int i = this.mStatus;
    GMTrace.o(553111257088L, 4121);
    return i;
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(554990305280L, 4135);
    if (this.mStatus == 1)
    {
      GMTrace.o(554990305280L, 4135);
      return true;
    }
    GMTrace.o(554990305280L, 4135);
    return false;
  }
  
  public final void mE(String paramString)
  {
    GMTrace.i(554453434368L, 4131);
    hdJ = this.hdK;
    w.i("MicroMsg.SilkPlayer", "[%d] SilkDecInit", new Object[] { Integer.valueOf(this.hdK) });
    for (;;)
    {
      try
      {
        paramString = new FileInputStream(paramString);
        j = paramString.available();
        w.d("MicroMsg.SilkPlayer", "SilkDecInit streamlen:%d", new Object[] { Integer.valueOf(j) });
        if ((!com.tencent.mm.compatible.b.e.sd().sh()) || (j >= 5000)) {
          continue;
        }
        this.hdN = 1;
        Object localObject = new byte[j];
        paramString.read((byte[])localObject, 0, j);
        this.mSampleRate = MediaRecorder.SilkGetEncSampleRate(new byte[] { localObject[0] });
        MediaRecorder.SilkDecUnInit();
        MediaRecorder.SilkDecInit(this.mSampleRate, (byte[])localObject, j);
        j = -1;
        localObject = com.tencent.mm.y.c.c.Ct().er("100268");
        if (!((com.tencent.mm.storage.c)localObject).isValid()) {
          break label411;
        }
        j = bg.getInt((String)((com.tencent.mm.storage.c)localObject).bSg().get("SilkAudioPlayerAgcOn"), 0);
      }
      catch (Exception paramString)
      {
        int i;
        short s;
        int k;
        com.tencent.mm.plugin.report.service.g.ork.a(161L, 0L, 1L, false);
        com.tencent.mm.plugin.report.service.g.ork.a(161L, 1L, 1L, false);
        w.e("MicroMsg.SilkPlayer", "exception:%s", new Object[] { bg.f(paramString) });
        continue;
        j += 1;
        continue;
        GMTrace.o(554453434368L, 4131);
        return;
      }
      i = (byte)j;
      MediaRecorder.SetVoiceSilkDecControl(hdO, new byte[] { i }, 1);
      paramString.close();
      w.d("MicroMsg.SilkPlayer", "[%d] skip %d frames", new Object[] { Integer.valueOf(this.hdK), Integer.valueOf(this.hdL) });
      paramString = new byte[AudioTrack.getMinBufferSize(this.mSampleRate, 2, 2) * 2];
      s = (short)(this.mSampleRate * 20 / 1000);
      int j = 0;
      if (j < this.hdL)
      {
        k = MediaRecorder.SilkDoDec(paramString, s);
        if (k <= 0)
        {
          w.e("MicroMsg.SilkPlayer", "[%d], skip frame failed: %d", new Object[] { Integer.valueOf(this.hdK), Integer.valueOf(k) });
          GMTrace.o(554453434368L, 4131);
          return;
          this.hdN = 8;
          continue;
        }
      }
      label411:
      if (1 != j) {
        if (j != 0) {}
      }
    }
  }
  
  public final boolean qj()
  {
    GMTrace.i(554856087552L, 4134);
    if (this.mStatus != 2)
    {
      GMTrace.o(554856087552L, 4134);
      return false;
    }
    this.mStatus = 1;
    synchronized (this.hdF)
    {
      try
      {
        w.v("MicroMsg.SilkPlayer", "before mpause.notify");
        this.hdF.notify();
        w.v("MicroMsg.SilkPlayer", "after mpause.notify");
        if (this.hdB != null) {
          this.hdB.requestFocus();
        }
        GMTrace.o(554856087552L, 4134);
        return true;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.SilkPlayer", "exception:%s", new Object[] { bg.f(localException) });
        GMTrace.o(554856087552L, 4134);
        return false;
      }
    }
  }
  
  public final double qm()
  {
    GMTrace.i(555258740736L, 4137);
    GMTrace.o(555258740736L, 4137);
    return 0.0D;
  }
  
  public final boolean qt()
  {
    GMTrace.i(555124523008L, 4136);
    w.i("MicroMsg.SilkPlayer", "stop  status:" + this.mStatus);
    if (this.mStatus == 0)
    {
      w.i("MicroMsg.SilkPlayer", "alvinluo status is STATUS_STOP when stop");
      this.mStatus = 3;
    }
    do
    {
      this.mStatus = 3;
      String str = this.hdF;
      try
      {
        this.hdF.notify();
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.SilkPlayer", "exception:%s", new Object[] { bg.f(localException) });
        if (this.hdB != null) {
          this.hdB.tx();
        }
        GMTrace.o(555124523008L, 4136);
        return false;
      }
      finally
      {
        if (this.hdB != null) {
          this.hdB.tx();
        }
      }
      try
      {
        if (this.hdB != null) {
          this.hdB.tx();
        }
        GMTrace.o(555124523008L, 4136);
        return true;
      }
      finally {}
    } while ((this.mStatus == 1) || (this.mStatus == 2));
    w.e("MicroMsg.SilkPlayer", "stop  error status:" + this.mStatus);
    GMTrace.o(555124523008L, 4136);
    return false;
  }
  
  private final class a
    implements Runnable
  {
    public a()
    {
      GMTrace.i(539286831104L, 4018);
      GMTrace.o(539286831104L, 4018);
    }
    
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: ldc2_w 36
      //   3: sipush 4019
      //   6: invokestatic 28	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   9: bipush -16
      //   11: invokestatic 43	android/os/Process:setThreadPriority	(I)V
      //   14: aload_0
      //   15: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   18: getfield 47	com/tencent/mm/modelvoice/i:mSampleRate	I
      //   21: iconst_2
      //   22: iconst_2
      //   23: invokestatic 53	android/media/AudioTrack:getMinBufferSize	(III)I
      //   26: iconst_2
      //   27: imul
      //   28: istore_2
      //   29: iload_2
      //   30: newarray <illegal type>
      //   32: astore_3
      //   33: aload_0
      //   34: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   37: getfield 47	com/tencent/mm/modelvoice/i:mSampleRate	I
      //   40: bipush 20
      //   42: imul
      //   43: sipush 1000
      //   46: idiv
      //   47: i2s
      //   48: istore_1
      //   49: ldc 55
      //   51: ldc 57
      //   53: iconst_2
      //   54: anewarray 4	java/lang/Object
      //   57: dup
      //   58: iconst_0
      //   59: iload_1
      //   60: invokestatic 63	java/lang/Short:valueOf	(S)Ljava/lang/Short;
      //   63: aastore
      //   64: dup
      //   65: iconst_1
      //   66: iload_2
      //   67: invokestatic 68	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   70: aastore
      //   71: invokestatic 74	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   74: ldc 55
      //   76: ldc 76
      //   78: invokestatic 79	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   81: aload_0
      //   82: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   85: getfield 82	com/tencent/mm/modelvoice/i:mStatus	I
      //   88: iconst_1
      //   89: if_icmpeq +14 -> 103
      //   92: aload_0
      //   93: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   96: getfield 82	com/tencent/mm/modelvoice/i:mStatus	I
      //   99: iconst_2
      //   100: if_icmpne +796 -> 896
      //   103: getstatic 86	com/tencent/mm/modelvoice/i:hdH	Ljava/lang/Object;
      //   106: astore 4
      //   108: aload 4
      //   110: monitorenter
      //   111: getstatic 89	com/tencent/mm/modelvoice/i:hdJ	I
      //   114: aload_0
      //   115: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   118: getfield 92	com/tencent/mm/modelvoice/i:hdK	I
      //   121: if_icmpeq +50 -> 171
      //   124: ldc 55
      //   126: ldc 94
      //   128: iconst_2
      //   129: anewarray 4	java/lang/Object
      //   132: dup
      //   133: iconst_0
      //   134: aload_0
      //   135: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   138: getfield 92	com/tencent/mm/modelvoice/i:hdK	I
      //   141: invokestatic 68	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   144: aastore
      //   145: dup
      //   146: iconst_1
      //   147: getstatic 89	com/tencent/mm/modelvoice/i:hdJ	I
      //   150: invokestatic 68	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   153: aastore
      //   154: invokestatic 96	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   157: aload_0
      //   158: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   161: aload_0
      //   162: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   165: getfield 100	com/tencent/mm/modelvoice/i:mFileName	Ljava/lang/String;
      //   168: invokevirtual 104	com/tencent/mm/modelvoice/i:mE	(Ljava/lang/String;)V
      //   171: aload 4
      //   173: monitorexit
      //   174: aload_0
      //   175: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   178: getfield 108	com/tencent/mm/modelvoice/i:hdE	Z
      //   181: ifeq +209 -> 390
      //   184: ldc 55
      //   186: ldc 110
      //   188: invokestatic 112	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
      //   191: ldc2_w 113
      //   194: invokestatic 120	java/lang/Thread:sleep	(J)V
      //   197: goto -23 -> 174
      //   200: astore_3
      //   201: getstatic 126	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   204: ldc2_w 127
      //   207: lconst_0
      //   208: lconst_1
      //   209: iconst_0
      //   210: invokevirtual 131	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
      //   213: ldc 55
      //   215: ldc -123
      //   217: iconst_1
      //   218: anewarray 4	java/lang/Object
      //   221: dup
      //   222: iconst_0
      //   223: aload_3
      //   224: invokestatic 139	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
      //   227: aastore
      //   228: invokestatic 142	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   231: aload_0
      //   232: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   235: getfield 146	com/tencent/mm/modelvoice/i:hdQ	Landroid/media/MediaPlayer$OnErrorListener;
      //   238: ifnull +19 -> 257
      //   241: aload_0
      //   242: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   245: getfield 146	com/tencent/mm/modelvoice/i:hdQ	Landroid/media/MediaPlayer$OnErrorListener;
      //   248: aconst_null
      //   249: iconst_0
      //   250: iconst_0
      //   251: invokeinterface 152 4 0
      //   256: pop
      //   257: aload_0
      //   258: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   261: iconst_0
      //   262: putfield 82	com/tencent/mm/modelvoice/i:mStatus	I
      //   265: getstatic 86	com/tencent/mm/modelvoice/i:hdH	Ljava/lang/Object;
      //   268: astore_3
      //   269: aload_3
      //   270: monitorenter
      //   271: getstatic 89	com/tencent/mm/modelvoice/i:hdJ	I
      //   274: aload_0
      //   275: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   278: getfield 92	com/tencent/mm/modelvoice/i:hdK	I
      //   281: if_icmpne +35 -> 316
      //   284: invokestatic 158	com/tencent/mm/modelvoice/MediaRecorder:SilkDecUnInit	()I
      //   287: pop
      //   288: ldc 55
      //   290: ldc -96
      //   292: iconst_1
      //   293: anewarray 4	java/lang/Object
      //   296: dup
      //   297: iconst_0
      //   298: aload_0
      //   299: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   302: getfield 92	com/tencent/mm/modelvoice/i:hdK	I
      //   305: invokestatic 68	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   308: aastore
      //   309: invokestatic 96	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   312: iconst_m1
      //   313: putstatic 89	com/tencent/mm/modelvoice/i:hdJ	I
      //   316: aload_3
      //   317: monitorexit
      //   318: aload_0
      //   319: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   322: getfield 82	com/tencent/mm/modelvoice/i:mStatus	I
      //   325: iconst_3
      //   326: if_icmpeq +597 -> 923
      //   329: aload_0
      //   330: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   333: getfield 164	com/tencent/mm/modelvoice/i:hdC	Lcom/tencent/mm/modelvoice/d$a;
      //   336: ifnull +15 -> 351
      //   339: aload_0
      //   340: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   343: getfield 164	com/tencent/mm/modelvoice/i:hdC	Lcom/tencent/mm/modelvoice/d$a;
      //   346: invokeinterface 169 1 0
      //   351: aload_0
      //   352: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   355: getfield 173	com/tencent/mm/modelvoice/i:hdP	Landroid/media/MediaPlayer$OnCompletionListener;
      //   358: ifnull +611 -> 969
      //   361: aload_0
      //   362: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   365: getfield 173	com/tencent/mm/modelvoice/i:hdP	Landroid/media/MediaPlayer$OnCompletionListener;
      //   368: aconst_null
      //   369: invokeinterface 178 2 0
      //   374: ldc2_w 36
      //   377: sipush 4019
      //   380: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   383: return
      //   384: astore_3
      //   385: aload 4
      //   387: monitorexit
      //   388: aload_3
      //   389: athrow
      //   390: aload_3
      //   391: iload_1
      //   392: invokestatic 182	com/tencent/mm/modelvoice/MediaRecorder:SilkDoDec	([BS)I
      //   395: istore_2
      //   396: iload_2
      //   397: ifge +97 -> 494
      //   400: aload_0
      //   401: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   404: iconst_0
      //   405: putfield 82	com/tencent/mm/modelvoice/i:mStatus	I
      //   408: getstatic 126	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   411: ldc2_w 127
      //   414: lconst_0
      //   415: lconst_1
      //   416: iconst_0
      //   417: invokevirtual 131	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
      //   420: getstatic 126	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   423: ldc2_w 127
      //   426: ldc2_w 183
      //   429: lconst_1
      //   430: iconst_0
      //   431: invokevirtual 131	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
      //   434: ldc 55
      //   436: ldc -70
      //   438: iconst_2
      //   439: anewarray 4	java/lang/Object
      //   442: dup
      //   443: iconst_0
      //   444: aload_0
      //   445: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   448: getfield 92	com/tencent/mm/modelvoice/i:hdK	I
      //   451: invokestatic 68	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   454: aastore
      //   455: dup
      //   456: iconst_1
      //   457: iload_2
      //   458: invokestatic 68	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   461: aastore
      //   462: invokestatic 142	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   465: aload_0
      //   466: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   469: getfield 190	com/tencent/mm/modelvoice/i:hdM	Lcom/tencent/mm/e/c/b;
      //   472: ifnull -391 -> 81
      //   475: getstatic 195	com/tencent/mm/platformtools/r:hkN	Z
      //   478: ifeq -397 -> 81
      //   481: aload_0
      //   482: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   485: getfield 190	com/tencent/mm/modelvoice/i:hdM	Lcom/tencent/mm/e/c/b;
      //   488: invokevirtual 200	com/tencent/mm/e/c/b:qK	()V
      //   491: goto -410 -> 81
      //   494: getstatic 195	com/tencent/mm/platformtools/r:hkN	Z
      //   497: ifeq +28 -> 525
      //   500: aload_0
      //   501: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   504: getfield 190	com/tencent/mm/modelvoice/i:hdM	Lcom/tencent/mm/e/c/b;
      //   507: ifnull +18 -> 525
      //   510: aload_0
      //   511: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   514: getfield 190	com/tencent/mm/modelvoice/i:hdM	Lcom/tencent/mm/e/c/b;
      //   517: aload_3
      //   518: iload_1
      //   519: iconst_2
      //   520: imul
      //   521: invokevirtual 204	com/tencent/mm/e/c/b:h	([BI)Z
      //   524: pop
      //   525: aload_0
      //   526: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   529: getfield 208	com/tencent/mm/modelvoice/i:mAudioTrack	Landroid/media/AudioTrack;
      //   532: aload_3
      //   533: iconst_0
      //   534: iload_1
      //   535: iconst_2
      //   536: imul
      //   537: invokevirtual 212	android/media/AudioTrack:write	([BII)I
      //   540: pop
      //   541: aload_0
      //   542: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   545: astore 4
      //   547: aload 4
      //   549: aload 4
      //   551: getfield 215	com/tencent/mm/modelvoice/i:hdL	I
      //   554: iconst_1
      //   555: iadd
      //   556: putfield 215	com/tencent/mm/modelvoice/i:hdL	I
      //   559: iload_2
      //   560: ifne +125 -> 685
      //   563: aload_0
      //   564: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   567: iconst_0
      //   568: putfield 82	com/tencent/mm/modelvoice/i:mStatus	I
      //   571: ldc 55
      //   573: ldc -39
      //   575: iconst_1
      //   576: anewarray 4	java/lang/Object
      //   579: dup
      //   580: iconst_0
      //   581: aload_0
      //   582: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   585: getfield 92	com/tencent/mm/modelvoice/i:hdK	I
      //   588: invokestatic 68	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   591: aastore
      //   592: invokestatic 96	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   595: aload_0
      //   596: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   599: getfield 190	com/tencent/mm/modelvoice/i:hdM	Lcom/tencent/mm/e/c/b;
      //   602: ifnull -521 -> 81
      //   605: getstatic 195	com/tencent/mm/platformtools/r:hkN	Z
      //   608: ifeq -527 -> 81
      //   611: aload_0
      //   612: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   615: getfield 190	com/tencent/mm/modelvoice/i:hdM	Lcom/tencent/mm/e/c/b;
      //   618: invokevirtual 200	com/tencent/mm/e/c/b:qK	()V
      //   621: new 11	com/tencent/mm/modelvoice/i$a$1
      //   624: dup
      //   625: aload_0
      //   626: invokespecial 220	com/tencent/mm/modelvoice/i$a$1:<init>	(Lcom/tencent/mm/modelvoice/i$a;)V
      //   629: invokestatic 226	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
      //   632: goto -551 -> 81
      //   635: astore 4
      //   637: ldc 55
      //   639: ldc -28
      //   641: iconst_1
      //   642: anewarray 4	java/lang/Object
      //   645: dup
      //   646: iconst_0
      //   647: aload 4
      //   649: invokevirtual 232	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   652: aastore
      //   653: invokestatic 142	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   656: getstatic 126	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   659: ldc2_w 127
      //   662: lconst_0
      //   663: lconst_1
      //   664: iconst_0
      //   665: invokevirtual 131	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
      //   668: getstatic 126	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   671: ldc2_w 127
      //   674: ldc2_w 233
      //   677: lconst_1
      //   678: iconst_0
      //   679: invokevirtual 131	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
      //   682: goto -141 -> 541
      //   685: aload_0
      //   686: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   689: getfield 82	com/tencent/mm/modelvoice/i:mStatus	I
      //   692: iconst_2
      //   693: if_icmpne +145 -> 838
      //   696: aload_0
      //   697: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   700: getfield 237	com/tencent/mm/modelvoice/i:hdG	Ljava/lang/String;
      //   703: astore 4
      //   705: aload 4
      //   707: monitorenter
      //   708: ldc 55
      //   710: ldc -17
      //   712: invokestatic 242	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;)V
      //   715: aload_0
      //   716: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   719: getfield 237	com/tencent/mm/modelvoice/i:hdG	Ljava/lang/String;
      //   722: invokevirtual 245	java/lang/Object:notify	()V
      //   725: ldc 55
      //   727: ldc -9
      //   729: invokestatic 242	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;)V
      //   732: aload 4
      //   734: monitorexit
      //   735: aload_0
      //   736: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   739: getfield 250	com/tencent/mm/modelvoice/i:hdF	Ljava/lang/String;
      //   742: astore 4
      //   744: aload 4
      //   746: monitorenter
      //   747: ldc 55
      //   749: ldc -4
      //   751: invokestatic 242	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;)V
      //   754: aload_0
      //   755: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   758: getfield 250	com/tencent/mm/modelvoice/i:hdF	Ljava/lang/String;
      //   761: invokevirtual 255	java/lang/Object:wait	()V
      //   764: ldc 55
      //   766: ldc_w 257
      //   769: invokestatic 242	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;)V
      //   772: aload 4
      //   774: monitorexit
      //   775: goto -694 -> 81
      //   778: astore_3
      //   779: aload 4
      //   781: monitorexit
      //   782: aload_3
      //   783: athrow
      //   784: astore 5
      //   786: ldc 55
      //   788: ldc -123
      //   790: iconst_1
      //   791: anewarray 4	java/lang/Object
      //   794: dup
      //   795: iconst_0
      //   796: aload 5
      //   798: invokestatic 139	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
      //   801: aastore
      //   802: invokestatic 142	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   805: goto -73 -> 732
      //   808: astore_3
      //   809: aload 4
      //   811: monitorexit
      //   812: aload_3
      //   813: athrow
      //   814: astore 5
      //   816: ldc 55
      //   818: ldc -123
      //   820: iconst_1
      //   821: anewarray 4	java/lang/Object
      //   824: dup
      //   825: iconst_0
      //   826: aload 5
      //   828: invokestatic 139	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
      //   831: aastore
      //   832: invokestatic 142	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   835: goto -63 -> 772
      //   838: aload_0
      //   839: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   842: getfield 237	com/tencent/mm/modelvoice/i:hdG	Ljava/lang/String;
      //   845: astore 4
      //   847: aload 4
      //   849: monitorenter
      //   850: aload_0
      //   851: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   854: getfield 237	com/tencent/mm/modelvoice/i:hdG	Ljava/lang/String;
      //   857: invokevirtual 245	java/lang/Object:notify	()V
      //   860: aload 4
      //   862: monitorexit
      //   863: goto -782 -> 81
      //   866: astore_3
      //   867: aload 4
      //   869: monitorexit
      //   870: aload_3
      //   871: athrow
      //   872: astore 5
      //   874: ldc 55
      //   876: ldc -123
      //   878: iconst_1
      //   879: anewarray 4	java/lang/Object
      //   882: dup
      //   883: iconst_0
      //   884: aload 5
      //   886: invokestatic 139	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
      //   889: aastore
      //   890: invokestatic 142	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   893: goto -33 -> 860
      //   896: aload_0
      //   897: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   900: getfield 82	com/tencent/mm/modelvoice/i:mStatus	I
      //   903: iconst_3
      //   904: if_icmpeq -639 -> 265
      //   907: ldc2_w 258
      //   910: invokestatic 120	java/lang/Thread:sleep	(J)V
      //   913: goto -648 -> 265
      //   916: astore 4
      //   918: aload_3
      //   919: monitorexit
      //   920: aload 4
      //   922: athrow
      //   923: aload_0
      //   924: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   927: getfield 208	com/tencent/mm/modelvoice/i:mAudioTrack	Landroid/media/AudioTrack;
      //   930: ifnull +39 -> 969
      //   933: ldc 55
      //   935: ldc_w 261
      //   938: invokestatic 79	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   941: aload_0
      //   942: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   945: getfield 208	com/tencent/mm/modelvoice/i:mAudioTrack	Landroid/media/AudioTrack;
      //   948: invokevirtual 264	android/media/AudioTrack:stop	()V
      //   951: aload_0
      //   952: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   955: getfield 208	com/tencent/mm/modelvoice/i:mAudioTrack	Landroid/media/AudioTrack;
      //   958: invokevirtual 267	android/media/AudioTrack:release	()V
      //   961: aload_0
      //   962: getfield 17	com/tencent/mm/modelvoice/i$a:hdR	Lcom/tencent/mm/modelvoice/i;
      //   965: aconst_null
      //   966: putfield 208	com/tencent/mm/modelvoice/i:mAudioTrack	Landroid/media/AudioTrack;
      //   969: ldc2_w 36
      //   972: sipush 4019
      //   975: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   978: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	979	0	this	a
      //   48	489	1	s	short
      //   28	532	2	i	int
      //   32	1	3	arrayOfByte1	byte[]
      //   200	24	3	localException1	Exception
      //   268	49	3	localObject1	Object
      //   384	149	3	arrayOfByte2	byte[]
      //   778	5	3	localObject2	Object
      //   808	5	3	localObject3	Object
      //   866	53	3	localObject4	Object
      //   106	444	4	localObject5	Object
      //   635	13	4	localException2	Exception
      //   916	5	4	localObject6	Object
      //   784	13	5	localException3	Exception
      //   814	13	5	localException4	Exception
      //   872	13	5	localException5	Exception
      // Exception table:
      //   from	to	target	type
      //   9	81	200	java/lang/Exception
      //   81	103	200	java/lang/Exception
      //   103	111	200	java/lang/Exception
      //   174	197	200	java/lang/Exception
      //   388	390	200	java/lang/Exception
      //   390	396	200	java/lang/Exception
      //   400	491	200	java/lang/Exception
      //   494	525	200	java/lang/Exception
      //   541	559	200	java/lang/Exception
      //   563	632	200	java/lang/Exception
      //   637	682	200	java/lang/Exception
      //   685	708	200	java/lang/Exception
      //   735	747	200	java/lang/Exception
      //   782	784	200	java/lang/Exception
      //   812	814	200	java/lang/Exception
      //   838	850	200	java/lang/Exception
      //   870	872	200	java/lang/Exception
      //   896	913	200	java/lang/Exception
      //   111	171	384	finally
      //   171	174	384	finally
      //   385	388	384	finally
      //   525	541	635	java/lang/Exception
      //   747	772	778	finally
      //   772	775	778	finally
      //   779	782	778	finally
      //   816	835	778	finally
      //   708	732	784	java/lang/Exception
      //   708	732	808	finally
      //   732	735	808	finally
      //   786	805	808	finally
      //   809	812	808	finally
      //   747	772	814	java/lang/Exception
      //   850	860	866	finally
      //   860	863	866	finally
      //   867	870	866	finally
      //   874	893	866	finally
      //   850	860	872	java/lang/Exception
      //   271	316	916	finally
      //   316	318	916	finally
      //   918	920	916	finally
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvoice\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */