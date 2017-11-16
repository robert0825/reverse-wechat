package com.tencent.mm.modelvoice;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.b.c;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.compatible.util.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.qqpinyin.voicerecoapi.TRSpeexNative;
import java.io.FileInputStream;

public final class j
  implements d
{
  private int ePH;
  public String euR;
  public b ezj;
  public String hdF;
  public String hdG;
  public MediaPlayer.OnCompletionListener hdP;
  public MediaPlayer.OnErrorListener hdQ;
  public AudioTrack hdT;
  public d.a hdU;
  public d.b hdV;
  private int hdW;
  private int hdX;
  private int hdY;
  private Runnable hdZ;
  public com.tencent.qqpinyin.voicerecoapi.a hea;
  private int heb;
  int hec;
  public boolean hed;
  public byte[] hee;
  public int hef;
  public FileInputStream heg;
  public int heh;
  public int status;
  
  public j()
  {
    GMTrace.i(560493232128L, 4176);
    this.euR = "";
    this.hdU = null;
    this.hdV = null;
    this.status = 0;
    this.hdW = 2;
    this.hdX = 16000;
    this.ePH = 1;
    this.hdY = 20;
    this.hea = null;
    this.hec = 0;
    this.hed = false;
    this.hdF = "";
    this.hdG = "";
    this.hee = new byte[com.tencent.qqpinyin.voicerecoapi.a.MAX_FRAME_SIZE];
    this.hef = 0;
    this.heg = null;
    this.heh = 314;
    this.hdP = new MediaPlayer.OnCompletionListener()
    {
      public final void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
      {
        GMTrace.i(559151054848L, 4166);
        if (j.this.ezj != null) {
          j.this.ezj.tx();
        }
        try
        {
          j.this.status = 0;
          j.this.bor();
          try
          {
            j.this.join();
            GMTrace.o(559151054848L, 4166);
            return;
          }
          catch (InterruptedException paramAnonymousMediaPlayer)
          {
            w.e("MicroMsg.SpeexPlayer", "exception:%s", new Object[] { bg.f(paramAnonymousMediaPlayer) });
            GMTrace.o(559151054848L, 4166);
            return;
          }
          return;
        }
        catch (Exception paramAnonymousMediaPlayer)
        {
          w.e("MicroMsg.SpeexPlayer", "exception:%s", new Object[] { bg.f(paramAnonymousMediaPlayer) });
          w.e("MicroMsg.SpeexPlayer", "setCompletion File[" + j.this.euR + "] ErrMsg[" + paramAnonymousMediaPlayer.getStackTrace() + "]");
          GMTrace.o(559151054848L, 4166);
        }
      }
    };
    this.hdQ = new MediaPlayer.OnErrorListener()
    {
      public final boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(537542000640L, 4005);
        w.d("MicroMsg.SpeexPlayer", "onError");
        if (j.this.ezj != null) {
          j.this.ezj.tx();
        }
        if (j.this.hdV != null) {
          j.this.hdV.onError();
        }
        for (;;)
        {
          try
          {
            j.this.status = -1;
            j.this.bor();
          }
          catch (Exception paramAnonymousMediaPlayer)
          {
            w.e("MicroMsg.SpeexPlayer", "setErrorListener File[" + j.this.euR + "] ErrMsg[" + paramAnonymousMediaPlayer.getStackTrace() + "]");
            continue;
          }
          try
          {
            j.this.join();
            GMTrace.o(537542000640L, 4005);
            return false;
          }
          catch (InterruptedException paramAnonymousMediaPlayer)
          {
            w.e("MicroMsg.SpeexPlayer", "exception:%s", new Object[] { bg.f(paramAnonymousMediaPlayer) });
          }
        }
      }
    };
    this.hea = new com.tencent.qqpinyin.voicerecoapi.a();
    com.tencent.qqpinyin.voicerecoapi.a locala = this.hea;
    if (locala.xOV != 0) {
      i = -103;
    }
    for (;;)
    {
      if (i != 0) {
        w.e("speex", "res: " + i);
      }
      GMTrace.o(560493232128L, 4176);
      return;
      int j = locala.xOW.nativeTRSpeexDecodeInit();
      if ((j == -1) || (j == -100) || (j == -101) || (j == -102))
      {
        i = j;
      }
      else
      {
        locala.xOV = j;
        locala.xOT = new byte[com.tencent.qqpinyin.voicerecoapi.a.MAX_FRAME_SIZE * 15];
      }
    }
  }
  
  public j(Context paramContext)
  {
    this();
    GMTrace.i(560627449856L, 4177);
    this.ezj = new b(paramContext);
    GMTrace.o(560627449856L, 4177);
  }
  
  private boolean G(String paramString, boolean paramBoolean)
  {
    GMTrace.i(561432756224L, 4183);
    if (this.status != 0)
    {
      w.e("MicroMsg.SpeexPlayer", "startPlay error status:" + this.status);
      GMTrace.o(561432756224L, 4183);
      return false;
    }
    w.i("MicroMsg.SpeexPlayer", "startPlay");
    this.status = 1;
    this.euR = paramString;
    try
    {
      bJ(paramBoolean);
      GMTrace.o(561432756224L, 4183);
      return true;
    }
    catch (Exception paramString)
    {
      try
      {
        bJ(true);
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.SpeexPlayer", "startPlay File[" + this.euR + "] failed");
        w.e("MicroMsg.SpeexPlayer", "exception:%s", new Object[] { bg.f(paramString) });
        this.status = -1;
        GMTrace.o(561432756224L, 4183);
      }
    }
    return false;
  }
  
  private void bJ(boolean paramBoolean)
  {
    GMTrace.i(561566973952L, 4184);
    if (!com.tencent.mm.a.e.aZ(this.euR))
    {
      GMTrace.o(561566973952L, 4184);
      return;
    }
    int i;
    if (paramBoolean) {
      i = 3;
    }
    for (;;)
    {
      int j = i;
      try
      {
        if (p.fQD.fNp)
        {
          p.fQD.dump();
          j = i;
          if (p.fQD.fNw == 1) {
            j = 3;
          }
        }
        this.heb = AudioTrack.getMinBufferSize(this.hdX, this.hdW, 2);
        bor();
        this.hdT = new c(j, this.hdX, this.hdW, 2, this.heb * 8);
        this.heh = (this.hdX / 1000 * this.ePH * this.hdY * 2);
        if (this.ezj != null) {
          this.ezj.requestFocus();
        }
        AudioTrack localAudioTrack = this.hdT;
        if (localAudioTrack != null) {}
        try
        {
          this.hdT.play();
          this.hdZ = new Runnable()
          {
            /* Error */
            public final void run()
            {
              // Byte code:
              //   0: ldc2_w 35
              //   3: sipush 4211
              //   6: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
              //   9: bipush -16
              //   11: invokestatic 42	android/os/Process:setThreadPriority	(I)V
              //   14: aload_0
              //   15: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   18: new 44	java/io/FileInputStream
              //   21: dup
              //   22: aload_0
              //   23: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   26: getfield 48	com/tencent/mm/modelvoice/j:euR	Ljava/lang/String;
              //   29: invokespecial 51	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
              //   32: putfield 55	com/tencent/mm/modelvoice/j:heg	Ljava/io/FileInputStream;
              //   35: aload_0
              //   36: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   39: getfield 59	com/tencent/mm/modelvoice/j:status	I
              //   42: iconst_1
              //   43: if_icmpeq +14 -> 57
              //   46: aload_0
              //   47: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   50: getfield 59	com/tencent/mm/modelvoice/j:status	I
              //   53: iconst_2
              //   54: if_icmpne +718 -> 772
              //   57: aload_0
              //   58: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   61: aload_0
              //   62: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   65: getfield 55	com/tencent/mm/modelvoice/j:heg	Ljava/io/FileInputStream;
              //   68: aload_0
              //   69: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   72: getfield 63	com/tencent/mm/modelvoice/j:hee	[B
              //   75: invokevirtual 67	java/io/FileInputStream:read	([B)I
              //   78: putfield 70	com/tencent/mm/modelvoice/j:hef	I
              //   81: aload_0
              //   82: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   85: getfield 70	com/tencent/mm/modelvoice/j:hef	I
              //   88: iconst_m1
              //   89: if_icmpeq +561 -> 650
              //   92: aload_0
              //   93: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   96: getfield 74	com/tencent/mm/modelvoice/j:hea	Lcom/tencent/qqpinyin/voicerecoapi/a;
              //   99: astore 4
              //   101: aload_0
              //   102: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   105: getfield 63	com/tencent/mm/modelvoice/j:hee	[B
              //   108: astore_3
              //   109: aload_0
              //   110: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   113: getfield 70	com/tencent/mm/modelvoice/j:hef	I
              //   116: istore_1
              //   117: aload 4
              //   119: getfield 79	com/tencent/qqpinyin/voicerecoapi/a:xOV	I
              //   122: ifne +203 -> 325
              //   125: new 81	com/tencent/qqpinyin/voicerecoapi/b
              //   128: dup
              //   129: bipush -102
              //   131: invokespecial 83	com/tencent/qqpinyin/voicerecoapi/b:<init>	(I)V
              //   134: athrow
              //   135: astore_3
              //   136: ldc 85
              //   138: ldc 87
              //   140: iconst_1
              //   141: anewarray 4	java/lang/Object
              //   144: dup
              //   145: iconst_0
              //   146: aload_3
              //   147: invokestatic 93	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
              //   150: aastore
              //   151: invokestatic 99	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
              //   154: aload_0
              //   155: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   158: getfield 103	com/tencent/mm/modelvoice/j:hdQ	Landroid/media/MediaPlayer$OnErrorListener;
              //   161: ifnull +19 -> 180
              //   164: aload_0
              //   165: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   168: getfield 103	com/tencent/mm/modelvoice/j:hdQ	Landroid/media/MediaPlayer$OnErrorListener;
              //   171: aconst_null
              //   172: iconst_0
              //   173: iconst_0
              //   174: invokeinterface 109 4 0
              //   179: pop
              //   180: aload_0
              //   181: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   184: iconst_0
              //   185: putfield 59	com/tencent/mm/modelvoice/j:status	I
              //   188: aload_0
              //   189: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   192: getfield 55	com/tencent/mm/modelvoice/j:heg	Ljava/io/FileInputStream;
              //   195: ifnull +21 -> 216
              //   198: aload_0
              //   199: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   202: getfield 55	com/tencent/mm/modelvoice/j:heg	Ljava/io/FileInputStream;
              //   205: invokevirtual 112	java/io/FileInputStream:close	()V
              //   208: aload_0
              //   209: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   212: aconst_null
              //   213: putfield 55	com/tencent/mm/modelvoice/j:heg	Ljava/io/FileInputStream;
              //   216: aload_0
              //   217: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   220: getfield 74	com/tencent/mm/modelvoice/j:hea	Lcom/tencent/qqpinyin/voicerecoapi/a;
              //   223: astore_3
              //   224: aload_3
              //   225: getfield 79	com/tencent/qqpinyin/voicerecoapi/a:xOV	I
              //   228: ifne +586 -> 814
              //   231: bipush -102
              //   233: istore_1
              //   234: aload_0
              //   235: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   238: getfield 59	com/tencent/mm/modelvoice/j:status	I
              //   241: iconst_3
              //   242: if_icmpeq +597 -> 839
              //   245: aload_0
              //   246: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   249: getfield 116	com/tencent/mm/modelvoice/j:hdU	Lcom/tencent/mm/modelvoice/d$a;
              //   252: ifnull +15 -> 267
              //   255: aload_0
              //   256: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   259: getfield 116	com/tencent/mm/modelvoice/j:hdU	Lcom/tencent/mm/modelvoice/d$a;
              //   262: invokeinterface 121 1 0
              //   267: aload_0
              //   268: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   271: getfield 125	com/tencent/mm/modelvoice/j:hdP	Landroid/media/MediaPlayer$OnCompletionListener;
              //   274: ifnull +16 -> 290
              //   277: aload_0
              //   278: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   281: getfield 125	com/tencent/mm/modelvoice/j:hdP	Landroid/media/MediaPlayer$OnCompletionListener;
              //   284: aconst_null
              //   285: invokeinterface 130 2 0
              //   290: iload_1
              //   291: ifeq +24 -> 315
              //   294: ldc 85
              //   296: new 132	java/lang/StringBuilder
              //   299: dup
              //   300: ldc -122
              //   302: invokespecial 135	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
              //   305: iload_1
              //   306: invokevirtual 139	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
              //   309: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
              //   312: invokestatic 146	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
              //   315: ldc2_w 35
              //   318: sipush 4211
              //   321: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
              //   324: return
              //   325: aload_3
              //   326: ifnull +8 -> 334
              //   329: aload_3
              //   330: arraylength
              //   331: ifne +13 -> 344
              //   334: new 81	com/tencent/qqpinyin/voicerecoapi/b
              //   337: dup
              //   338: bipush -104
              //   340: invokespecial 83	com/tencent/qqpinyin/voicerecoapi/b:<init>	(I)V
              //   343: athrow
              //   344: aload 4
              //   346: getfield 150	com/tencent/qqpinyin/voicerecoapi/a:xOW	Lcom/tencent/qqpinyin/voicerecoapi/TRSpeexNative;
              //   349: aload 4
              //   351: getfield 79	com/tencent/qqpinyin/voicerecoapi/a:xOV	I
              //   354: aload_3
              //   355: iconst_0
              //   356: iload_1
              //   357: aload 4
              //   359: getfield 153	com/tencent/qqpinyin/voicerecoapi/a:xOT	[B
              //   362: invokevirtual 159	com/tencent/qqpinyin/voicerecoapi/TRSpeexNative:nativeTRSpeexDecode	(I[BII[B)I
              //   365: istore_1
              //   366: iload_1
              //   367: ifge +486 -> 853
              //   370: new 81	com/tencent/qqpinyin/voicerecoapi/b
              //   373: dup
              //   374: iload_1
              //   375: invokespecial 83	com/tencent/qqpinyin/voicerecoapi/b:<init>	(I)V
              //   378: athrow
              //   379: aload_0
              //   380: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   383: iconst_0
              //   384: putfield 59	com/tencent/mm/modelvoice/j:status	I
              //   387: goto -352 -> 35
              //   390: iload_1
              //   391: newarray <illegal type>
              //   393: astore_3
              //   394: aload 4
              //   396: getfield 153	com/tencent/qqpinyin/voicerecoapi/a:xOT	[B
              //   399: iconst_0
              //   400: aload_3
              //   401: iconst_0
              //   402: iload_1
              //   403: invokestatic 165	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
              //   406: goto +453 -> 859
              //   409: aload_3
              //   410: arraylength
              //   411: istore_1
              //   412: iconst_0
              //   413: istore_2
              //   414: iload_1
              //   415: aload_0
              //   416: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   419: getfield 168	com/tencent/mm/modelvoice/j:heh	I
              //   422: if_icmplt +96 -> 518
              //   425: aload_0
              //   426: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   429: getfield 59	com/tencent/mm/modelvoice/j:status	I
              //   432: iconst_1
              //   433: if_icmpne +85 -> 518
              //   436: aload_0
              //   437: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   440: getfield 172	com/tencent/mm/modelvoice/j:hed	Z
              //   443: ifeq +12 -> 455
              //   446: ldc2_w 173
              //   449: invokestatic 180	java/lang/Thread:sleep	(J)V
              //   452: goto -38 -> 414
              //   455: aload_0
              //   456: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   459: getfield 184	com/tencent/mm/modelvoice/j:hdT	Landroid/media/AudioTrack;
              //   462: ifnull -48 -> 414
              //   465: aload_0
              //   466: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   469: getfield 172	com/tencent/mm/modelvoice/j:hed	Z
              //   472: ifne -58 -> 414
              //   475: aload_0
              //   476: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   479: getfield 184	com/tencent/mm/modelvoice/j:hdT	Landroid/media/AudioTrack;
              //   482: aload_3
              //   483: iload_2
              //   484: aload_0
              //   485: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   488: getfield 168	com/tencent/mm/modelvoice/j:heh	I
              //   491: invokevirtual 190	android/media/AudioTrack:write	([BII)I
              //   494: pop
              //   495: iload_2
              //   496: aload_0
              //   497: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   500: getfield 168	com/tencent/mm/modelvoice/j:heh	I
              //   503: iadd
              //   504: istore_2
              //   505: iload_1
              //   506: aload_0
              //   507: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   510: getfield 168	com/tencent/mm/modelvoice/j:heh	I
              //   513: isub
              //   514: istore_1
              //   515: goto -101 -> 414
              //   518: iload_1
              //   519: aload_0
              //   520: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   523: getfield 168	com/tencent/mm/modelvoice/j:heh	I
              //   526: if_icmpge +31 -> 557
              //   529: iload_1
              //   530: ifle +27 -> 557
              //   533: aload_0
              //   534: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   537: getfield 184	com/tencent/mm/modelvoice/j:hdT	Landroid/media/AudioTrack;
              //   540: ifnull +17 -> 557
              //   543: aload_0
              //   544: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   547: getfield 184	com/tencent/mm/modelvoice/j:hdT	Landroid/media/AudioTrack;
              //   550: aload_3
              //   551: iload_2
              //   552: iload_1
              //   553: invokevirtual 190	android/media/AudioTrack:write	([BII)I
              //   556: pop
              //   557: aload_0
              //   558: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   561: getfield 59	com/tencent/mm/modelvoice/j:status	I
              //   564: iconst_2
              //   565: if_icmpne +151 -> 716
              //   568: aload_0
              //   569: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   572: getfield 193	com/tencent/mm/modelvoice/j:hdG	Ljava/lang/String;
              //   575: astore_3
              //   576: aload_3
              //   577: monitorenter
              //   578: ldc 85
              //   580: ldc -61
              //   582: invokestatic 198	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;)V
              //   585: aload_0
              //   586: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   589: getfield 193	com/tencent/mm/modelvoice/j:hdG	Ljava/lang/String;
              //   592: invokevirtual 201	java/lang/Object:notify	()V
              //   595: ldc 85
              //   597: ldc -53
              //   599: invokestatic 198	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;)V
              //   602: aload_3
              //   603: monitorexit
              //   604: aload_0
              //   605: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   608: getfield 206	com/tencent/mm/modelvoice/j:hdF	Ljava/lang/String;
              //   611: astore_3
              //   612: aload_3
              //   613: monitorenter
              //   614: ldc 85
              //   616: ldc -48
              //   618: invokestatic 198	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;)V
              //   621: aload_0
              //   622: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   625: getfield 206	com/tencent/mm/modelvoice/j:hdF	Ljava/lang/String;
              //   628: invokevirtual 211	java/lang/Object:wait	()V
              //   631: ldc 85
              //   633: ldc -43
              //   635: invokestatic 198	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;)V
              //   638: aload_3
              //   639: monitorexit
              //   640: goto -605 -> 35
              //   643: astore 4
              //   645: aload_3
              //   646: monitorexit
              //   647: aload 4
              //   649: athrow
              //   650: aload_0
              //   651: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   654: iconst_0
              //   655: putfield 59	com/tencent/mm/modelvoice/j:status	I
              //   658: goto -101 -> 557
              //   661: astore 4
              //   663: ldc 85
              //   665: ldc 87
              //   667: iconst_1
              //   668: anewarray 4	java/lang/Object
              //   671: dup
              //   672: iconst_0
              //   673: aload 4
              //   675: invokestatic 93	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
              //   678: aastore
              //   679: invokestatic 99	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
              //   682: goto -80 -> 602
              //   685: astore 4
              //   687: aload_3
              //   688: monitorexit
              //   689: aload 4
              //   691: athrow
              //   692: astore 4
              //   694: ldc 85
              //   696: ldc 87
              //   698: iconst_1
              //   699: anewarray 4	java/lang/Object
              //   702: dup
              //   703: iconst_0
              //   704: aload 4
              //   706: invokestatic 93	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
              //   709: aastore
              //   710: invokestatic 99	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
              //   713: goto -75 -> 638
              //   716: aload_0
              //   717: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   720: getfield 193	com/tencent/mm/modelvoice/j:hdG	Ljava/lang/String;
              //   723: astore_3
              //   724: aload_3
              //   725: monitorenter
              //   726: aload_0
              //   727: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   730: getfield 193	com/tencent/mm/modelvoice/j:hdG	Ljava/lang/String;
              //   733: invokevirtual 201	java/lang/Object:notify	()V
              //   736: aload_3
              //   737: monitorexit
              //   738: goto -703 -> 35
              //   741: astore 4
              //   743: aload_3
              //   744: monitorexit
              //   745: aload 4
              //   747: athrow
              //   748: astore 4
              //   750: ldc 85
              //   752: ldc 87
              //   754: iconst_1
              //   755: anewarray 4	java/lang/Object
              //   758: dup
              //   759: iconst_0
              //   760: aload 4
              //   762: invokestatic 93	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
              //   765: aastore
              //   766: invokestatic 99	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
              //   769: goto -33 -> 736
              //   772: aload_0
              //   773: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   776: getfield 59	com/tencent/mm/modelvoice/j:status	I
              //   779: iconst_3
              //   780: if_icmpeq -592 -> 188
              //   783: ldc2_w 214
              //   786: invokestatic 180	java/lang/Thread:sleep	(J)V
              //   789: goto -601 -> 188
              //   792: astore_3
              //   793: ldc 85
              //   795: ldc 87
              //   797: iconst_1
              //   798: anewarray 4	java/lang/Object
              //   801: dup
              //   802: iconst_0
              //   803: aload_3
              //   804: invokestatic 93	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
              //   807: aastore
              //   808: invokestatic 99	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
              //   811: goto -603 -> 208
              //   814: aload_3
              //   815: aconst_null
              //   816: putfield 153	com/tencent/qqpinyin/voicerecoapi/a:xOT	[B
              //   819: aload_3
              //   820: getfield 150	com/tencent/qqpinyin/voicerecoapi/a:xOW	Lcom/tencent/qqpinyin/voicerecoapi/TRSpeexNative;
              //   823: aload_3
              //   824: getfield 79	com/tencent/qqpinyin/voicerecoapi/a:xOV	I
              //   827: invokevirtual 219	com/tencent/qqpinyin/voicerecoapi/TRSpeexNative:nativeTRSpeexDecodeRelease	(I)I
              //   830: istore_1
              //   831: aload_3
              //   832: iconst_0
              //   833: putfield 79	com/tencent/qqpinyin/voicerecoapi/a:xOV	I
              //   836: goto -602 -> 234
              //   839: aload_0
              //   840: getfield 14	com/tencent/mm/modelvoice/j$3:hei	Lcom/tencent/mm/modelvoice/j;
              //   843: invokevirtual 222	com/tencent/mm/modelvoice/j:bor	()V
              //   846: goto -556 -> 290
              //   849: astore_3
              //   850: goto -560 -> 290
              //   853: iload_1
              //   854: ifne -464 -> 390
              //   857: aconst_null
              //   858: astore_3
              //   859: aload_3
              //   860: ifnull -481 -> 379
              //   863: iload_1
              //   864: ifne -455 -> 409
              //   867: goto -488 -> 379
              // Local variable table:
              //   start	length	slot	name	signature
              //   0	870	0	this	3
              //   116	748	1	i	int
              //   413	139	2	j	int
              //   108	1	3	arrayOfByte	byte[]
              //   135	12	3	localException1	Exception
              //   792	40	3	localIOException	java.io.IOException
              //   849	1	3	localException2	Exception
              //   858	2	3	localObject2	Object
              //   99	296	4	locala	com.tencent.qqpinyin.voicerecoapi.a
              //   643	5	4	localObject3	Object
              //   661	13	4	localException3	Exception
              //   685	5	4	localObject4	Object
              //   692	13	4	localException4	Exception
              //   741	5	4	localObject5	Object
              //   748	13	4	localException5	Exception
              // Exception table:
              //   from	to	target	type
              //   9	35	135	java/lang/Exception
              //   35	57	135	java/lang/Exception
              //   57	135	135	java/lang/Exception
              //   329	334	135	java/lang/Exception
              //   334	344	135	java/lang/Exception
              //   344	366	135	java/lang/Exception
              //   370	379	135	java/lang/Exception
              //   379	387	135	java/lang/Exception
              //   390	406	135	java/lang/Exception
              //   409	412	135	java/lang/Exception
              //   414	452	135	java/lang/Exception
              //   455	515	135	java/lang/Exception
              //   518	529	135	java/lang/Exception
              //   533	557	135	java/lang/Exception
              //   557	578	135	java/lang/Exception
              //   604	614	135	java/lang/Exception
              //   647	650	135	java/lang/Exception
              //   650	658	135	java/lang/Exception
              //   689	692	135	java/lang/Exception
              //   716	726	135	java/lang/Exception
              //   745	748	135	java/lang/Exception
              //   772	789	135	java/lang/Exception
              //   614	638	643	finally
              //   638	640	643	finally
              //   645	647	643	finally
              //   694	713	643	finally
              //   578	602	661	java/lang/Exception
              //   578	602	685	finally
              //   602	604	685	finally
              //   663	682	685	finally
              //   687	689	685	finally
              //   614	638	692	java/lang/Exception
              //   726	736	741	finally
              //   736	738	741	finally
              //   743	745	741	finally
              //   750	769	741	finally
              //   726	736	748	java/lang/Exception
              //   198	208	792	java/io/IOException
              //   839	846	849	java/lang/Exception
            }
          };
          com.tencent.mm.sdk.f.e.post(this.hdZ, "SpeexPlayer_play");
          GMTrace.o(561566973952L, 4184);
          return;
        }
        catch (Exception localException1)
        {
          w.e("MicroMsg.SpeexPlayer", "audioTrack error:%s", new Object[] { localException1.getMessage() });
          GMTrace.o(561566973952L, 4184);
          return;
        }
        i = 0;
      }
      catch (Exception localException2)
      {
        if (this.ezj != null) {
          this.ezj.tx();
        }
        w.e("MicroMsg.SpeexPlayer", "playImp : fail, exception = " + localException2.getMessage());
        w.e("MicroMsg.SpeexPlayer", "exception:%s", new Object[] { bg.f(localException2) });
        GMTrace.o(561566973952L, 4184);
      }
    }
  }
  
  public final boolean F(String paramString, boolean paramBoolean)
  {
    GMTrace.i(561164320768L, 4181);
    paramBoolean = G(paramString, paramBoolean);
    GMTrace.o(561164320768L, 4181);
    return paramBoolean;
  }
  
  public final void a(d.a parama)
  {
    GMTrace.i(560761667584L, 4178);
    this.hdU = parama;
    GMTrace.o(560761667584L, 4178);
  }
  
  public final void a(d.b paramb)
  {
    GMTrace.i(560895885312L, 4179);
    this.hdV = paramb;
    GMTrace.o(560895885312L, 4179);
  }
  
  /* Error */
  public final boolean aw(boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc2_w 285
    //   3: ldc_w 287
    //   6: invokestatic 60	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: getfield 70	com/tencent/mm/modelvoice/j:status	I
    //   13: iconst_1
    //   14: if_icmpeq +14 -> 28
    //   17: ldc2_w 285
    //   20: ldc_w 287
    //   23: invokestatic 139	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   26: iconst_0
    //   27: ireturn
    //   28: aload_0
    //   29: iconst_2
    //   30: putfield 70	com/tencent/mm/modelvoice/j:status	I
    //   33: aload_0
    //   34: getfield 88	com/tencent/mm/modelvoice/j:hdG	Ljava/lang/String;
    //   37: astore 4
    //   39: aload 4
    //   41: monitorenter
    //   42: ldc -85
    //   44: ldc_w 289
    //   47: invokestatic 292	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   50: invokestatic 298	java/lang/System:currentTimeMillis	()J
    //   53: lstore_2
    //   54: aload_0
    //   55: getfield 88	com/tencent/mm/modelvoice/j:hdG	Ljava/lang/String;
    //   58: invokevirtual 301	java/lang/Object:wait	()V
    //   61: ldc -85
    //   63: new 117	java/lang/StringBuilder
    //   66: dup
    //   67: ldc_w 303
    //   70: invokespecial 122	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   73: invokestatic 298	java/lang/System:currentTimeMillis	()J
    //   76: lload_2
    //   77: lsub
    //   78: invokevirtual 306	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   81: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   84: invokestatic 292	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   87: aload_0
    //   88: getfield 163	com/tencent/mm/modelvoice/j:ezj	Lcom/tencent/mm/compatible/util/b;
    //   91: ifnull +15 -> 106
    //   94: iload_1
    //   95: ifeq +11 -> 106
    //   98: aload_0
    //   99: getfield 163	com/tencent/mm/modelvoice/j:ezj	Lcom/tencent/mm/compatible/util/b;
    //   102: invokevirtual 268	com/tencent/mm/compatible/util/b:tx	()Z
    //   105: pop
    //   106: aload 4
    //   108: monitorexit
    //   109: ldc2_w 285
    //   112: ldc_w 287
    //   115: invokestatic 139	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   118: iconst_1
    //   119: ireturn
    //   120: astore 5
    //   122: ldc -85
    //   124: ldc -66
    //   126: iconst_1
    //   127: anewarray 4	java/lang/Object
    //   130: dup
    //   131: iconst_0
    //   132: aload 5
    //   134: invokestatic 196	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   137: aastore
    //   138: invokestatic 199	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   141: aload_0
    //   142: getfield 163	com/tencent/mm/modelvoice/j:ezj	Lcom/tencent/mm/compatible/util/b;
    //   145: ifnull +15 -> 160
    //   148: iload_1
    //   149: ifeq +11 -> 160
    //   152: aload_0
    //   153: getfield 163	com/tencent/mm/modelvoice/j:ezj	Lcom/tencent/mm/compatible/util/b;
    //   156: invokevirtual 268	com/tencent/mm/compatible/util/b:tx	()Z
    //   159: pop
    //   160: aload 4
    //   162: monitorexit
    //   163: ldc2_w 285
    //   166: ldc_w 287
    //   169: invokestatic 139	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   172: iconst_0
    //   173: ireturn
    //   174: astore 5
    //   176: aload_0
    //   177: getfield 163	com/tencent/mm/modelvoice/j:ezj	Lcom/tencent/mm/compatible/util/b;
    //   180: ifnull +15 -> 195
    //   183: iload_1
    //   184: ifeq +11 -> 195
    //   187: aload_0
    //   188: getfield 163	com/tencent/mm/modelvoice/j:ezj	Lcom/tencent/mm/compatible/util/b;
    //   191: invokevirtual 268	com/tencent/mm/compatible/util/b:tx	()Z
    //   194: pop
    //   195: aload 5
    //   197: athrow
    //   198: astore 5
    //   200: aload 4
    //   202: monitorexit
    //   203: aload 5
    //   205: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	206	0	this	j
    //   0	206	1	paramBoolean	boolean
    //   53	24	2	l	long
    //   37	164	4	str	String
    //   120	13	5	localException	Exception
    //   174	22	5	localObject1	Object
    //   198	6	5	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   42	87	120	java/lang/Exception
    //   42	87	174	finally
    //   122	141	174	finally
    //   87	94	198	finally
    //   98	106	198	finally
    //   106	109	198	finally
    //   141	148	198	finally
    //   152	160	198	finally
    //   160	163	198	finally
    //   176	183	198	finally
    //   187	195	198	finally
    //   195	198	198	finally
    //   200	203	198	finally
  }
  
  /* Error */
  public final void ay(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_3
    //   1: istore_3
    //   2: ldc2_w 308
    //   5: sipush 4180
    //   8: invokestatic 60	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: iconst_1
    //   13: putfield 84	com/tencent/mm/modelvoice/j:hed	Z
    //   16: aload_0
    //   17: getfield 76	com/tencent/mm/modelvoice/j:ePH	I
    //   20: iconst_2
    //   21: if_icmpne +133 -> 154
    //   24: aload_0
    //   25: iconst_3
    //   26: putfield 72	com/tencent/mm/modelvoice/j:hdW	I
    //   29: aload_0
    //   30: aload_0
    //   31: getfield 74	com/tencent/mm/modelvoice/j:hdX	I
    //   34: aload_0
    //   35: getfield 72	com/tencent/mm/modelvoice/j:hdW	I
    //   38: iconst_2
    //   39: invokestatic 230	android/media/AudioTrack:getMinBufferSize	(III)I
    //   42: putfield 232	com/tencent/mm/modelvoice/j:heb	I
    //   45: aload_0
    //   46: getfield 242	com/tencent/mm/modelvoice/j:hdT	Landroid/media/AudioTrack;
    //   49: ifnull +22 -> 71
    //   52: aload_0
    //   53: getfield 242	com/tencent/mm/modelvoice/j:hdT	Landroid/media/AudioTrack;
    //   56: invokevirtual 312	android/media/AudioTrack:stop	()V
    //   59: aload_0
    //   60: getfield 242	com/tencent/mm/modelvoice/j:hdT	Landroid/media/AudioTrack;
    //   63: invokevirtual 315	android/media/AudioTrack:release	()V
    //   66: aload_0
    //   67: aconst_null
    //   68: putfield 242	com/tencent/mm/modelvoice/j:hdT	Landroid/media/AudioTrack;
    //   71: iload_1
    //   72: ifeq +120 -> 192
    //   75: iconst_3
    //   76: istore_2
    //   77: getstatic 213	com/tencent/mm/compatible/d/p:fQD	Lcom/tencent/mm/compatible/d/a;
    //   80: getfield 218	com/tencent/mm/compatible/d/a:fNp	Z
    //   83: ifeq +139 -> 222
    //   86: getstatic 213	com/tencent/mm/compatible/d/p:fQD	Lcom/tencent/mm/compatible/d/a;
    //   89: invokevirtual 221	com/tencent/mm/compatible/d/a:dump	()V
    //   92: getstatic 213	com/tencent/mm/compatible/d/p:fQD	Lcom/tencent/mm/compatible/d/a;
    //   95: getfield 224	com/tencent/mm/compatible/d/a:fNw	I
    //   98: iconst_1
    //   99: if_icmpne +123 -> 222
    //   102: iload_3
    //   103: istore_2
    //   104: aload_0
    //   105: new 237	com/tencent/mm/compatible/b/c
    //   108: dup
    //   109: iload_2
    //   110: aload_0
    //   111: getfield 74	com/tencent/mm/modelvoice/j:hdX	I
    //   114: aload_0
    //   115: getfield 72	com/tencent/mm/modelvoice/j:hdW	I
    //   118: iconst_2
    //   119: aload_0
    //   120: getfield 232	com/tencent/mm/modelvoice/j:heb	I
    //   123: bipush 8
    //   125: imul
    //   126: invokespecial 240	com/tencent/mm/compatible/b/c:<init>	(IIIII)V
    //   129: putfield 242	com/tencent/mm/modelvoice/j:hdT	Landroid/media/AudioTrack;
    //   132: aload_0
    //   133: getfield 242	com/tencent/mm/modelvoice/j:hdT	Landroid/media/AudioTrack;
    //   136: invokevirtual 249	android/media/AudioTrack:play	()V
    //   139: aload_0
    //   140: iconst_0
    //   141: putfield 84	com/tencent/mm/modelvoice/j:hed	Z
    //   144: ldc2_w 308
    //   147: sipush 4180
    //   150: invokestatic 139	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   153: return
    //   154: aload_0
    //   155: iconst_2
    //   156: putfield 72	com/tencent/mm/modelvoice/j:hdW	I
    //   159: goto -130 -> 29
    //   162: astore 4
    //   164: ldc -85
    //   166: aload 4
    //   168: invokevirtual 265	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   171: invokestatic 136	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   174: aload_0
    //   175: aconst_null
    //   176: putfield 242	com/tencent/mm/modelvoice/j:hdT	Landroid/media/AudioTrack;
    //   179: goto -108 -> 71
    //   182: astore 4
    //   184: aload_0
    //   185: aconst_null
    //   186: putfield 242	com/tencent/mm/modelvoice/j:hdT	Landroid/media/AudioTrack;
    //   189: aload 4
    //   191: athrow
    //   192: iconst_0
    //   193: istore_2
    //   194: goto -117 -> 77
    //   197: astore 4
    //   199: ldc -85
    //   201: ldc_w 262
    //   204: iconst_1
    //   205: anewarray 4	java/lang/Object
    //   208: dup
    //   209: iconst_0
    //   210: aload 4
    //   212: invokevirtual 265	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   215: aastore
    //   216: invokestatic 199	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   219: goto -80 -> 139
    //   222: goto -118 -> 104
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	225	0	this	j
    //   0	225	1	paramBoolean	boolean
    //   76	118	2	i	int
    //   1	102	3	j	int
    //   162	5	4	localException1	Exception
    //   182	8	4	localObject	Object
    //   197	14	4	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   52	66	162	java/lang/Exception
    //   52	66	182	finally
    //   164	174	182	finally
    //   132	139	197	java/lang/Exception
  }
  
  public final void b(b.a parama)
  {
    GMTrace.i(17481456418816L, 130247);
    if ((parama != null) && (this.ezj != null)) {
      this.ezj.a(parama);
    }
    GMTrace.o(17481456418816L, 130247);
  }
  
  public final void bor()
  {
    GMTrace.i(21067754110976L, 156967);
    if (this.hdT != null)
    {
      this.hdT.stop();
      this.hdT.release();
      this.hdT = null;
    }
    GMTrace.o(21067754110976L, 156967);
  }
  
  public final boolean c(String paramString, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(561298538496L, 4182);
    paramBoolean = G(paramString, paramBoolean);
    GMTrace.o(561298538496L, 4182);
    return paramBoolean;
  }
  
  public final int getStatus()
  {
    GMTrace.i(560359014400L, 4175);
    int i = this.status;
    GMTrace.o(560359014400L, 4175);
    return i;
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(561969627136L, 4187);
    if (this.status == 1)
    {
      GMTrace.o(561969627136L, 4187);
      return true;
    }
    GMTrace.o(561969627136L, 4187);
    return false;
  }
  
  public final void join()
  {
    GMTrace.i(16085457829888L, 119846);
    if (this.hdZ != null)
    {
      com.tencent.mm.sdk.f.e.N(this.hdZ);
      this.hdZ = null;
    }
    GMTrace.o(16085457829888L, 119846);
  }
  
  /* Error */
  public final boolean qj()
  {
    // Byte code:
    //   0: ldc2_w 345
    //   3: sipush 4186
    //   6: invokestatic 60	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: getfield 70	com/tencent/mm/modelvoice/j:status	I
    //   13: iconst_2
    //   14: if_icmpeq +14 -> 28
    //   17: ldc2_w 345
    //   20: sipush 4186
    //   23: invokestatic 139	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   26: iconst_0
    //   27: ireturn
    //   28: aload_0
    //   29: iconst_1
    //   30: putfield 70	com/tencent/mm/modelvoice/j:status	I
    //   33: aload_0
    //   34: getfield 86	com/tencent/mm/modelvoice/j:hdF	Ljava/lang/String;
    //   37: astore_1
    //   38: aload_1
    //   39: monitorenter
    //   40: ldc -85
    //   42: ldc_w 348
    //   45: invokestatic 292	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   48: aload_0
    //   49: getfield 86	com/tencent/mm/modelvoice/j:hdF	Ljava/lang/String;
    //   52: invokevirtual 351	java/lang/Object:notify	()V
    //   55: ldc -85
    //   57: ldc_w 353
    //   60: invokestatic 292	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   63: aload_0
    //   64: getfield 163	com/tencent/mm/modelvoice/j:ezj	Lcom/tencent/mm/compatible/util/b;
    //   67: ifnull +11 -> 78
    //   70: aload_0
    //   71: getfield 163	com/tencent/mm/modelvoice/j:ezj	Lcom/tencent/mm/compatible/util/b;
    //   74: invokevirtual 246	com/tencent/mm/compatible/util/b:requestFocus	()Z
    //   77: pop
    //   78: aload_1
    //   79: monitorexit
    //   80: ldc2_w 345
    //   83: sipush 4186
    //   86: invokestatic 139	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   89: iconst_1
    //   90: ireturn
    //   91: astore_2
    //   92: ldc -85
    //   94: ldc -66
    //   96: iconst_1
    //   97: anewarray 4	java/lang/Object
    //   100: dup
    //   101: iconst_0
    //   102: aload_2
    //   103: invokestatic 196	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   106: aastore
    //   107: invokestatic 199	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   110: aload_0
    //   111: getfield 163	com/tencent/mm/modelvoice/j:ezj	Lcom/tencent/mm/compatible/util/b;
    //   114: ifnull +11 -> 125
    //   117: aload_0
    //   118: getfield 163	com/tencent/mm/modelvoice/j:ezj	Lcom/tencent/mm/compatible/util/b;
    //   121: invokevirtual 246	com/tencent/mm/compatible/util/b:requestFocus	()Z
    //   124: pop
    //   125: aload_1
    //   126: monitorexit
    //   127: ldc2_w 345
    //   130: sipush 4186
    //   133: invokestatic 139	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   136: iconst_0
    //   137: ireturn
    //   138: astore_2
    //   139: aload_0
    //   140: getfield 163	com/tencent/mm/modelvoice/j:ezj	Lcom/tencent/mm/compatible/util/b;
    //   143: ifnull +11 -> 154
    //   146: aload_0
    //   147: getfield 163	com/tencent/mm/modelvoice/j:ezj	Lcom/tencent/mm/compatible/util/b;
    //   150: invokevirtual 246	com/tencent/mm/compatible/util/b:requestFocus	()Z
    //   153: pop
    //   154: aload_2
    //   155: athrow
    //   156: astore_2
    //   157: aload_1
    //   158: monitorexit
    //   159: aload_2
    //   160: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	161	0	this	j
    //   37	121	1	str	String
    //   91	12	2	localException	Exception
    //   138	17	2	localObject1	Object
    //   156	4	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   40	63	91	java/lang/Exception
    //   40	63	138	finally
    //   92	110	138	finally
    //   63	78	156	finally
    //   78	80	156	finally
    //   110	125	156	finally
    //   125	127	156	finally
    //   139	154	156	finally
    //   154	156	156	finally
    //   157	159	156	finally
  }
  
  public final double qm()
  {
    GMTrace.i(562238062592L, 4189);
    GMTrace.o(562238062592L, 4189);
    return 0.0D;
  }
  
  /* Error */
  public final boolean qt()
  {
    // Byte code:
    //   0: ldc2_w 359
    //   3: sipush 4188
    //   6: invokestatic 60	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: ldc -85
    //   11: new 117	java/lang/StringBuilder
    //   14: dup
    //   15: ldc_w 362
    //   18: invokespecial 122	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   21: aload_0
    //   22: getfield 70	com/tencent/mm/modelvoice/j:status	I
    //   25: invokevirtual 126	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   28: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   31: invokestatic 136	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   34: aload_0
    //   35: getfield 70	com/tencent/mm/modelvoice/j:status	I
    //   38: iconst_1
    //   39: if_icmpeq +47 -> 86
    //   42: aload_0
    //   43: getfield 70	com/tencent/mm/modelvoice/j:status	I
    //   46: iconst_2
    //   47: if_icmpeq +39 -> 86
    //   50: ldc -85
    //   52: new 117	java/lang/StringBuilder
    //   55: dup
    //   56: ldc_w 364
    //   59: invokespecial 122	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   62: aload_0
    //   63: getfield 70	com/tencent/mm/modelvoice/j:status	I
    //   66: invokevirtual 126	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   69: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   72: invokestatic 136	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   75: ldc2_w 359
    //   78: sipush 4188
    //   81: invokestatic 139	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   84: iconst_0
    //   85: ireturn
    //   86: aload_0
    //   87: iconst_3
    //   88: putfield 70	com/tencent/mm/modelvoice/j:status	I
    //   91: aload_0
    //   92: getfield 86	com/tencent/mm/modelvoice/j:hdF	Ljava/lang/String;
    //   95: astore_1
    //   96: aload_1
    //   97: monitorenter
    //   98: aload_0
    //   99: getfield 86	com/tencent/mm/modelvoice/j:hdF	Ljava/lang/String;
    //   102: invokevirtual 351	java/lang/Object:notify	()V
    //   105: aload_0
    //   106: getfield 163	com/tencent/mm/modelvoice/j:ezj	Lcom/tencent/mm/compatible/util/b;
    //   109: ifnull +11 -> 120
    //   112: aload_0
    //   113: getfield 163	com/tencent/mm/modelvoice/j:ezj	Lcom/tencent/mm/compatible/util/b;
    //   116: invokevirtual 268	com/tencent/mm/compatible/util/b:tx	()Z
    //   119: pop
    //   120: aload_1
    //   121: monitorexit
    //   122: ldc2_w 359
    //   125: sipush 4188
    //   128: invokestatic 139	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   131: iconst_1
    //   132: ireturn
    //   133: astore_2
    //   134: ldc -85
    //   136: ldc -66
    //   138: iconst_1
    //   139: anewarray 4	java/lang/Object
    //   142: dup
    //   143: iconst_0
    //   144: aload_2
    //   145: invokestatic 196	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   148: aastore
    //   149: invokestatic 199	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   152: aload_0
    //   153: getfield 163	com/tencent/mm/modelvoice/j:ezj	Lcom/tencent/mm/compatible/util/b;
    //   156: ifnull +11 -> 167
    //   159: aload_0
    //   160: getfield 163	com/tencent/mm/modelvoice/j:ezj	Lcom/tencent/mm/compatible/util/b;
    //   163: invokevirtual 268	com/tencent/mm/compatible/util/b:tx	()Z
    //   166: pop
    //   167: aload_1
    //   168: monitorexit
    //   169: ldc2_w 359
    //   172: sipush 4188
    //   175: invokestatic 139	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   178: iconst_0
    //   179: ireturn
    //   180: astore_2
    //   181: aload_0
    //   182: getfield 163	com/tencent/mm/modelvoice/j:ezj	Lcom/tencent/mm/compatible/util/b;
    //   185: ifnull +11 -> 196
    //   188: aload_0
    //   189: getfield 163	com/tencent/mm/modelvoice/j:ezj	Lcom/tencent/mm/compatible/util/b;
    //   192: invokevirtual 268	com/tencent/mm/compatible/util/b:tx	()Z
    //   195: pop
    //   196: aload_2
    //   197: athrow
    //   198: astore_2
    //   199: aload_1
    //   200: monitorexit
    //   201: aload_2
    //   202: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	203	0	this	j
    //   95	105	1	str	String
    //   133	12	2	localException	Exception
    //   180	17	2	localObject1	Object
    //   198	4	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   98	105	133	java/lang/Exception
    //   98	105	180	finally
    //   134	152	180	finally
    //   105	120	198	finally
    //   120	122	198	finally
    //   152	167	198	finally
    //   167	169	198	finally
    //   181	196	198	finally
    //   196	198	198	finally
    //   199	201	198	finally
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvoice\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */