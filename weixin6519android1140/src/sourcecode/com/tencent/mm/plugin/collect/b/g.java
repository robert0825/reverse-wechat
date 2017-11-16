package com.tencent.mm.plugin.collect.b;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.os.Build.VERSION;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.bm.b;
import com.tencent.mm.g.a.bs;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.kf;
import com.tencent.mm.protocal.c.km;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class g
  extends c<bs>
  implements com.tencent.mm.ad.e
{
  private static final String jVW;
  private static final b jVX;
  public MediaPlayer jVY;
  public MediaPlayer jVZ;
  public ConcurrentLinkedQueue<b> jWa;
  public boolean jWb;
  private int jWc;
  private int jWd;
  private long jWe;
  
  static
  {
    GMTrace.i(17426829803520L, 129840);
    jVW = com.tencent.mm.compatible.util.e.ghz + "wallet/voice/";
    jVX = b.Qb("元");
    GMTrace.o(17426829803520L, 129840);
  }
  
  public g()
  {
    GMTrace.i(17426158714880L, 129835);
    this.jWb = false;
    this.vhf = bs.class.getName().hashCode();
    GMTrace.o(17426158714880L, 129835);
  }
  
  public static boolean aox()
  {
    GMTrace.i(17426292932608L, 129836);
    w.i("MicroMsg.F2fRcvVoiceListener", "delete files");
    boolean bool = com.tencent.mm.a.e.ba(jVW);
    GMTrace.o(17426292932608L, 129836);
    return bool;
  }
  
  private static boolean l(String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(18062350745600L, 134575);
    h.xz();
    if (!h.xy().isSDCardAvailable())
    {
      w.i("MicroMsg.F2fRcvVoiceListener", "sd card not available");
      GMTrace.o(18062350745600L, 134575);
      return false;
    }
    if (FileOp.j(paramString, paramArrayOfByte) == 0)
    {
      GMTrace.o(18062350745600L, 134575);
      return true;
    }
    GMTrace.o(18062350745600L, 134575);
    return false;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(17426561368064L, 129838);
    b localb;
    if ((paramk instanceof i))
    {
      paramString = (i)paramk;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (paramString.jWp.jWs == 0)
        {
          paramk = new File(jVW);
          if ((!paramk.exists()) && (!paramk.mkdirs()))
          {
            w.i("MicroMsg.F2fRcvVoiceListener", "mk dir fail");
            GMTrace.o(17426561368064L, 129838);
            return;
          }
          paramk = jVW + UUID.randomUUID().toString() + ".tmp";
          w.i("MicroMsg.F2fRcvVoiceListener", "fileName: %s", new Object[] { paramk });
          if (l(paramk, paramString.jWp.uaV.tJp))
          {
            localb = new b();
            localb.euR = paramk;
            localb.eIv = paramString.jWp.uaU;
            localb.jWl = 1;
            this.jWa.add(localb);
            aoy();
            GMTrace.o(17426561368064L, 129838);
            return;
          }
          w.i("MicroMsg.F2fRcvVoiceListener", "save file fail");
          GMTrace.o(17426561368064L, 129838);
          return;
        }
        if (paramString.jWp.jWs <= 100)
        {
          w.i("MicroMsg.F2fRcvVoiceListener", "play default sound only");
          paramString = new b();
          paramString.jWl = 1;
          this.jWa.add(paramString);
          aoy();
          GMTrace.o(17426561368064L, 129838);
          return;
        }
        w.w("MicroMsg.F2fRcvVoiceListener", "retcode > 100, don't play");
        GMTrace.o(17426561368064L, 129838);
        return;
      }
      w.e("MicroMsg.F2fRcvVoiceListener", "net error: %s", new Object[] { paramString });
      paramString = new b();
      paramString.jWl = 1;
      this.jWa.add(paramString);
      aoy();
      GMTrace.o(17426561368064L, 129838);
      return;
    }
    if ((paramk instanceof m))
    {
      paramString = (m)paramk;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (paramString.jWI.jWs == 0)
        {
          paramk = new File(jVW);
          if ((!paramk.exists()) && (!paramk.mkdirs()))
          {
            w.i("MicroMsg.F2fRcvVoiceListener", "mk dir fail");
            GMTrace.o(17426561368064L, 129838);
            return;
          }
          paramk = jVW + UUID.randomUUID().toString() + ".tmp";
          w.i("MicroMsg.F2fRcvVoiceListener", "fileName: %s", new Object[] { paramk });
          if (l(paramk, paramString.jWI.uaV.tJp))
          {
            localb = new b();
            localb.euR = paramk;
            localb.eIv = paramString.jWI.uaU;
            localb.jWl = 2;
            this.jWa.add(localb);
            aoy();
            GMTrace.o(17426561368064L, 129838);
            return;
          }
          w.i("MicroMsg.F2fRcvVoiceListener", "save file fail");
          GMTrace.o(17426561368064L, 129838);
        }
      }
      else {
        w.e("MicroMsg.F2fRcvVoiceListener", "net error: %s", new Object[] { paramString });
      }
    }
    GMTrace.o(17426561368064L, 129838);
  }
  
  public final void aoy()
  {
    boolean bool = false;
    for (;;)
    {
      try
      {
        GMTrace.i(17426427150336L, 129837);
        if (System.currentTimeMillis() - this.jWe > 10000L)
        {
          w.i("MicroMsg.F2fRcvVoiceListener", "last has outdate: %s", new Object[] { Long.valueOf(this.jWe) });
          this.jWb = false;
        }
        if (this.jWb)
        {
          w.i("MicroMsg.F2fRcvVoiceListener", "is playing, return");
          GMTrace.o(17426427150336L, 129837);
          return;
        }
        this.jWe = System.currentTimeMillis();
        final b localb = (b)this.jWa.poll();
        com.tencent.mm.compatible.b.e locale = com.tencent.mm.compatible.b.e.sd();
        int i = locale.getStreamMaxVolume(3);
        this.jWc = locale.getStreamVolume(3);
        this.jWd = Math.round(i * 0.4F);
        w.i("MicroMsg.F2fRcvVoiceListener", "curVol: %s, maxVol: %s, minVol: %s", new Object[] { Integer.valueOf(this.jWc), Integer.valueOf(i), Integer.valueOf(this.jWd) });
        if (Build.VERSION.SDK_INT >= 23)
        {
          bool = locale.fMS.isStreamMute(3);
          w.i("MicroMsg.F2fRcvVoiceListener", "isMute: %s", new Object[] { Boolean.valueOf(bool) });
        }
        if ((this.jWc > 0) && (this.jWc < this.jWd) && (!bool)) {
          locale.az(3, this.jWd);
        }
        if (localb == null) {
          break label443;
        }
        i = a.i.sSZ;
        int j = localb.jWl;
        if (j == 2) {
          i = a.i.sWq;
        }
        if (!bg.nm(localb.euR))
        {
          this.jWb = true;
          w.i("MicroMsg.F2fRcvVoiceListener", "play prefix voice: %d", new Object[] { Integer.valueOf(j) });
          this.jVY = a.a(ab.getContext(), i, new MediaPlayer.OnCompletionListener()new MediaPlayer.OnErrorListener
          {
            public final void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
            {
              GMTrace.i(19346009096192L, 144139);
              w.i("MicroMsg.F2fRcvVoiceListener", "start play money");
              if ((g.this.jVY != null) && (g.this.jWb) && (g.this.jVZ == null)) {
                g.this.jVZ = g.a.a(localb.euR, new MediaPlayer.OnCompletionListener()new MediaPlayer.OnErrorListener
                {
                  public final void onCompletion(MediaPlayer paramAnonymous2MediaPlayer)
                  {
                    GMTrace.i(19346411749376L, 144142);
                    w.i("MicroMsg.F2fRcvVoiceListener", "play done");
                    g.this.jWb = false;
                    g.this.jVZ = null;
                    g.this.aoz();
                    if (!g.this.jWa.isEmpty())
                    {
                      g.this.aoy();
                      GMTrace.o(19346411749376L, 144142);
                      return;
                    }
                    g.aox();
                    GMTrace.o(19346411749376L, 144142);
                  }
                }, new MediaPlayer.OnErrorListener()
                {
                  public final boolean onError(MediaPlayer paramAnonymous2MediaPlayer, int paramAnonymous2Int1, int paramAnonymous2Int2)
                  {
                    GMTrace.i(19345203789824L, 144133);
                    w.e("MicroMsg.F2fRcvVoiceListener", "play money error: %s, %s", new Object[] { Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2) });
                    g.this.jWb = false;
                    g.this.jVZ = null;
                    g.this.aoz();
                    if (!g.this.jWa.isEmpty()) {
                      g.this.aoy();
                    }
                    for (;;)
                    {
                      GMTrace.o(19345203789824L, 144133);
                      return false;
                      g.aox();
                    }
                  }
                });
              }
              for (;;)
              {
                g.this.jVY = null;
                GMTrace.o(19346009096192L, 144139);
                return;
                w.i("MicroMsg.F2fRcvVoiceListener", "has played");
              }
            }
          }, new MediaPlayer.OnErrorListener()
          {
            public final boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
            {
              GMTrace.i(19346143313920L, 144140);
              w.e("MicroMsg.F2fRcvVoiceListener", "prefix play error");
              g.this.jWb = false;
              g.this.jVY = null;
              g.this.aoz();
              if (!g.this.jWa.isEmpty()) {
                g.this.aoy();
              }
              for (;;)
              {
                GMTrace.o(19346143313920L, 144140);
                return false;
                g.aox();
              }
            }
          });
          if (this.jVY != null)
          {
            i = this.jVY.getDuration();
            w.i("MicroMsg.F2fRcvVoiceListener", "prefix duration: %s", new Object[] { Integer.valueOf(i) });
            af.i(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(19347217055744L, 144148);
                if ((g.this.jVY != null) && (g.this.jWb) && (g.this.jVZ == null))
                {
                  w.i("MicroMsg.F2fRcvVoiceListener", "this play may error");
                  com.tencent.mm.plugin.report.service.g.ork.a(699L, 1L, 1L, false);
                }
                GMTrace.o(19347217055744L, 144148);
              }
            }, i + 1000);
          }
          GMTrace.o(17426427150336L, 129837);
          continue;
        }
        this.jVY = a.a(ab.getContext(), i, new MediaPlayer.OnCompletionListener()new MediaPlayer.OnErrorListener
        {
          public final void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
          {
            GMTrace.i(19344935354368L, 144131);
            w.i("MicroMsg.F2fRcvVoiceListener", "no need to play money this time");
            g.this.aoz();
            g.this.jWb = false;
            g.this.jVY = null;
            if (!g.this.jWa.isEmpty())
            {
              g.this.aoy();
              GMTrace.o(19344935354368L, 144131);
              return;
            }
            g.aox();
            GMTrace.o(19344935354368L, 144131);
          }
        }, new MediaPlayer.OnErrorListener()
        {
          public final boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
          {
            GMTrace.i(19344398483456L, 144127);
            w.e("MicroMsg.F2fRcvVoiceListener", "no need play money error");
            g.this.aoz();
            g.this.jWb = false;
            g.this.jVY = null;
            GMTrace.o(19344398483456L, 144127);
            return false;
          }
        });
      }
      finally {}
      com.tencent.mm.plugin.report.service.g.ork.a(699L, 2L, 1L, false);
      label443:
      GMTrace.o(17426427150336L, 129837);
    }
  }
  
  public final void aoz()
  {
    GMTrace.i(19344801136640L, 144130);
    w.i("MicroMsg.F2fRcvVoiceListener", "reset user vol: %s", new Object[] { Integer.valueOf(this.jWc) });
    com.tencent.mm.compatible.b.e.sd().az(3, this.jWc);
    GMTrace.o(19344801136640L, 144130);
  }
  
  private static final class a
  {
    /* Error */
    public static MediaPlayer a(android.content.Context paramContext, int paramInt, final MediaPlayer.OnCompletionListener paramOnCompletionListener, final MediaPlayer.OnErrorListener paramOnErrorListener)
    {
      // Byte code:
      //   0: ldc2_w 21
      //   3: ldc 23
      //   5: invokestatic 29	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: aload_0
      //   9: ifnonnull +35 -> 44
      //   12: ldc 31
      //   14: ldc 33
      //   16: iconst_2
      //   17: anewarray 4	java/lang/Object
      //   20: dup
      //   21: iconst_0
      //   22: aload_0
      //   23: aastore
      //   24: dup
      //   25: iconst_1
      //   26: iload_1
      //   27: invokestatic 39	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   30: aastore
      //   31: invokestatic 45	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   34: ldc2_w 21
      //   37: ldc 23
      //   39: invokestatic 48	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   42: aconst_null
      //   43: areturn
      //   44: aload_0
      //   45: iload_1
      //   46: invokevirtual 54	android/content/Context:getString	(I)Ljava/lang/String;
      //   49: astore 9
      //   51: new 56	android/media/MediaPlayer
      //   54: dup
      //   55: invokespecial 60	android/media/MediaPlayer:<init>	()V
      //   58: astore 8
      //   60: aload 8
      //   62: iconst_3
      //   63: invokevirtual 64	android/media/MediaPlayer:setAudioStreamType	(I)V
      //   66: ldc 31
      //   68: ldc 66
      //   70: iconst_4
      //   71: anewarray 4	java/lang/Object
      //   74: dup
      //   75: iconst_0
      //   76: aload 8
      //   78: invokevirtual 70	java/lang/Object:hashCode	()I
      //   81: invokestatic 39	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   84: aastore
      //   85: dup
      //   86: iconst_1
      //   87: aload 9
      //   89: aastore
      //   90: dup
      //   91: iconst_2
      //   92: aload_0
      //   93: aastore
      //   94: dup
      //   95: iconst_3
      //   96: iload_1
      //   97: invokestatic 39	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   100: aastore
      //   101: invokestatic 72	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   104: aconst_null
      //   105: astore 7
      //   107: aload_0
      //   108: invokevirtual 76	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
      //   111: aload 9
      //   113: invokevirtual 82	android/content/res/AssetManager:openFd	(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
      //   116: astore_0
      //   117: aload 8
      //   119: aload_0
      //   120: invokevirtual 88	android/content/res/AssetFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
      //   123: aload_0
      //   124: invokevirtual 92	android/content/res/AssetFileDescriptor:getStartOffset	()J
      //   127: aload_0
      //   128: invokevirtual 95	android/content/res/AssetFileDescriptor:getLength	()J
      //   131: invokevirtual 99	android/media/MediaPlayer:setDataSource	(Ljava/io/FileDescriptor;JJ)V
      //   134: aload 8
      //   136: iconst_0
      //   137: invokevirtual 103	android/media/MediaPlayer:setLooping	(Z)V
      //   140: aload 8
      //   142: new 9	com/tencent/mm/plugin/collect/b/g$a$1
      //   145: dup
      //   146: aload 8
      //   148: aload_3
      //   149: invokespecial 106	com/tencent/mm/plugin/collect/b/g$a$1:<init>	(Landroid/media/MediaPlayer;Landroid/media/MediaPlayer$OnErrorListener;)V
      //   152: invokevirtual 110	android/media/MediaPlayer:setOnErrorListener	(Landroid/media/MediaPlayer$OnErrorListener;)V
      //   155: aload 8
      //   157: new 11	com/tencent/mm/plugin/collect/b/g$a$2
      //   160: dup
      //   161: aload 9
      //   163: aload 8
      //   165: aload_2
      //   166: invokespecial 113	com/tencent/mm/plugin/collect/b/g$a$2:<init>	(Ljava/lang/String;Landroid/media/MediaPlayer;Landroid/media/MediaPlayer$OnCompletionListener;)V
      //   169: invokevirtual 117	android/media/MediaPlayer:setOnCompletionListener	(Landroid/media/MediaPlayer$OnCompletionListener;)V
      //   172: aload 8
      //   174: invokevirtual 120	android/media/MediaPlayer:prepare	()V
      //   177: aload 8
      //   179: invokevirtual 123	android/media/MediaPlayer:start	()V
      //   182: aload 8
      //   184: invokevirtual 70	java/lang/Object:hashCode	()I
      //   187: istore 4
      //   189: invokestatic 129	android/os/Looper:myLooper	()Landroid/os/Looper;
      //   192: ifnull +69 -> 261
      //   195: iconst_1
      //   196: istore 5
      //   198: invokestatic 132	android/os/Looper:getMainLooper	()Landroid/os/Looper;
      //   201: ifnull +66 -> 267
      //   204: iconst_1
      //   205: istore 6
      //   207: ldc 31
      //   209: ldc -122
      //   211: iconst_3
      //   212: anewarray 4	java/lang/Object
      //   215: dup
      //   216: iconst_0
      //   217: iload 4
      //   219: invokestatic 39	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   222: aastore
      //   223: dup
      //   224: iconst_1
      //   225: iload 5
      //   227: invokestatic 139	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   230: aastore
      //   231: dup
      //   232: iconst_2
      //   233: iload 6
      //   235: invokestatic 139	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   238: aastore
      //   239: invokestatic 72	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   242: aload_0
      //   243: ifnull +7 -> 250
      //   246: aload_0
      //   247: invokevirtual 142	android/content/res/AssetFileDescriptor:close	()V
      //   250: ldc2_w 21
      //   253: ldc 23
      //   255: invokestatic 48	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   258: aload 8
      //   260: areturn
      //   261: iconst_0
      //   262: istore 5
      //   264: goto -66 -> 198
      //   267: iconst_0
      //   268: istore 6
      //   270: goto -63 -> 207
      //   273: astore_0
      //   274: ldc 31
      //   276: aload_0
      //   277: ldc -112
      //   279: iconst_0
      //   280: anewarray 4	java/lang/Object
      //   283: invokestatic 148	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   286: goto -36 -> 250
      //   289: astore_2
      //   290: aload 7
      //   292: astore_0
      //   293: ldc 31
      //   295: ldc -106
      //   297: iconst_2
      //   298: anewarray 4	java/lang/Object
      //   301: dup
      //   302: iconst_0
      //   303: iload_1
      //   304: invokestatic 39	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   307: aastore
      //   308: dup
      //   309: iconst_1
      //   310: aload_2
      //   311: invokevirtual 154	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   314: aastore
      //   315: invokestatic 45	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   318: ldc 31
      //   320: aload_2
      //   321: ldc -112
      //   323: iconst_0
      //   324: anewarray 4	java/lang/Object
      //   327: invokestatic 148	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   330: aload 8
      //   332: invokevirtual 157	android/media/MediaPlayer:release	()V
      //   335: aload_0
      //   336: ifnull +7 -> 343
      //   339: aload_0
      //   340: invokevirtual 142	android/content/res/AssetFileDescriptor:close	()V
      //   343: ldc2_w 21
      //   346: ldc 23
      //   348: invokestatic 48	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   351: aconst_null
      //   352: areturn
      //   353: astore_0
      //   354: ldc 31
      //   356: aload_0
      //   357: ldc -112
      //   359: iconst_0
      //   360: anewarray 4	java/lang/Object
      //   363: invokestatic 148	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   366: goto -23 -> 343
      //   369: astore_2
      //   370: aconst_null
      //   371: astore_0
      //   372: aload_0
      //   373: ifnull +7 -> 380
      //   376: aload_0
      //   377: invokevirtual 142	android/content/res/AssetFileDescriptor:close	()V
      //   380: aload_2
      //   381: athrow
      //   382: astore_0
      //   383: ldc 31
      //   385: aload_0
      //   386: ldc -112
      //   388: iconst_0
      //   389: anewarray 4	java/lang/Object
      //   392: invokestatic 148	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   395: goto -15 -> 380
      //   398: astore_2
      //   399: goto -27 -> 372
      //   402: astore_2
      //   403: goto -31 -> 372
      //   406: astore_2
      //   407: goto -114 -> 293
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	410	0	paramContext	android.content.Context
      //   0	410	1	paramInt	int
      //   0	410	2	paramOnCompletionListener	MediaPlayer.OnCompletionListener
      //   0	410	3	paramOnErrorListener	MediaPlayer.OnErrorListener
      //   187	31	4	i	int
      //   196	67	5	bool1	boolean
      //   205	64	6	bool2	boolean
      //   105	186	7	localObject	Object
      //   58	273	8	localMediaPlayer	MediaPlayer
      //   49	113	9	str	String
      // Exception table:
      //   from	to	target	type
      //   246	250	273	java/io/IOException
      //   107	117	289	java/lang/Exception
      //   339	343	353	java/io/IOException
      //   107	117	369	finally
      //   376	380	382	java/io/IOException
      //   117	195	398	finally
      //   198	204	398	finally
      //   207	242	398	finally
      //   293	335	402	finally
      //   117	195	406	java/lang/Exception
      //   198	204	406	java/lang/Exception
      //   207	242	406	java/lang/Exception
    }
    
    public static MediaPlayer a(String paramString, final MediaPlayer.OnCompletionListener paramOnCompletionListener, final MediaPlayer.OnErrorListener paramOnErrorListener)
    {
      GMTrace.i(19345740660736L, 144137);
      final MediaPlayer localMediaPlayer = new MediaPlayer();
      localMediaPlayer.setAudioStreamType(3);
      w.i("MicroMsg.F2fRcvVoiceListener", "play start mp:%d path:%s", new Object[] { Integer.valueOf(localMediaPlayer.hashCode()), paramString });
      try
      {
        localMediaPlayer.setDataSource(paramString);
        localMediaPlayer.setLooping(false);
        localMediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener()
        {
          public final boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
          {
            GMTrace.i(19344666918912L, 144129);
            w.i("MicroMsg.F2fRcvVoiceListener", "onError, what: %d, extra: %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
            if (paramAnonymousMediaPlayer != null) {}
            try
            {
              paramAnonymousMediaPlayer.release();
              if (this.jWi != null) {
                this.jWi.release();
              }
            }
            catch (Exception localException)
            {
              for (;;) {}
            }
            if (paramOnErrorListener != null) {
              paramOnErrorListener.onError(paramAnonymousMediaPlayer, paramAnonymousInt1, paramAnonymousInt2);
            }
            GMTrace.o(19344666918912L, 144129);
            return false;
          }
        });
        localMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
        {
          public final void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
          {
            GMTrace.i(19345472225280L, 144135);
            if (paramAnonymousMediaPlayer == null) {}
            for (int i = -1;; i = paramAnonymousMediaPlayer.hashCode())
            {
              w.i("MicroMsg.F2fRcvVoiceListener", "play completion mp:%d  path:%s", new Object[] { Integer.valueOf(i), this.fMt });
              if (paramAnonymousMediaPlayer != null) {
                paramAnonymousMediaPlayer.release();
              }
              if (localMediaPlayer != null) {
                localMediaPlayer.release();
              }
              if (paramOnCompletionListener != null) {
                paramOnCompletionListener.onCompletion(paramAnonymousMediaPlayer);
              }
              GMTrace.o(19345472225280L, 144135);
              return;
            }
          }
        });
        localMediaPlayer.prepare();
        localMediaPlayer.start();
        int i = localMediaPlayer.hashCode();
        boolean bool1;
        if (Looper.myLooper() != null)
        {
          bool1 = true;
          if (Looper.getMainLooper() == null) {
            break label177;
          }
        }
        label177:
        for (boolean bool2 = true;; bool2 = false)
        {
          w.i("MicroMsg.F2fRcvVoiceListener", "play start mp finish [%d], myLooper[%b] mainLooper[%b]", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
          GMTrace.o(19345740660736L, 144137);
          return localMediaPlayer;
          bool1 = false;
          break;
        }
        return null;
      }
      catch (Exception paramOnCompletionListener)
      {
        w.e("MicroMsg.F2fRcvVoiceListener", "play failed path:%s e:%s", new Object[] { paramString, paramOnCompletionListener.getMessage() });
        w.printErrStackTrace("MicroMsg.F2fRcvVoiceListener", paramOnCompletionListener, "", new Object[0]);
        localMediaPlayer.release();
        GMTrace.o(19345740660736L, 144137);
      }
    }
  }
  
  private final class b
  {
    int eIv;
    String euR;
    int jWl;
    
    public b()
    {
      GMTrace.i(17426964021248L, 129841);
      GMTrace.o(17426964021248L, 129841);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */