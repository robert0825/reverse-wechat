package com.tencent.mm.plugin.voip.video;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Looper;
import android.os.Vibrator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.k;
import com.tencent.mm.compatible.b.e;
import com.tencent.mm.compatible.b.i;
import com.tencent.mm.compatible.d.a;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class h
{
  public boolean eqj;
  private AudioManager fRS;
  public ae ghS;
  private b hez;
  private Vibrator jZM;
  public Context mContext;
  public MediaPlayer qPM;
  public int qPN;
  public long qPO;
  public long qPP;
  public a qPQ;
  
  public h(Context paramContext)
  {
    GMTrace.i(5380654497792L, 40089);
    this.eqj = false;
    this.qPN = 65536;
    this.ghS = new ae(Looper.getMainLooper());
    this.mContext = paramContext;
    if (this.mContext != null)
    {
      this.fRS = at.AS().fMS;
      if (this.fRS == null) {
        this.fRS = ((AudioManager)this.mContext.getSystemService("audio"));
      }
      this.jZM = ((Vibrator)this.mContext.getSystemService("vibrator"));
    }
    this.hez = new b(ab.getContext());
    GMTrace.o(5380654497792L, 40089);
  }
  
  private void bwc()
  {
    GMTrace.i(5381594021888L, 40096);
    if (this.mContext.getSharedPreferences(ab.bPU(), 0).getBoolean("settings_shake", true))
    {
      int i = this.fRS.getRingerMode();
      if ((i == 1) || (i == 2))
      {
        this.jZM = ((Vibrator)this.mContext.getSystemService("vibrator"));
        if (this.jZM == null)
        {
          GMTrace.o(5381594021888L, 40096);
          return;
        }
        this.jZM.vibrate(new long[] { 1000L, 1000L, 1000L, 1000L }, 0);
      }
    }
    GMTrace.o(5381594021888L, 40096);
  }
  
  public final void a(final int paramInt1, final long paramLong, boolean paramBoolean, final int paramInt2)
  {
    GMTrace.i(5381459804160L, 40095);
    this.qPO = System.currentTimeMillis();
    this.qPM = new i();
    try
    {
      this.qPM.setDataSource(this.mContext, Uri.parse("android.resource://" + this.mContext.getPackageName() + "/" + paramInt1));
      this.qPM.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
      {
        public final void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
        {
          GMTrace.i(5385486336000L, 40125);
          if (System.currentTimeMillis() - h.this.qPO > 70000L) {
            h.this.qPN = 4;
          }
          if (h.this.eqj)
          {
            h.this.qPQ = new h.a(h.this, paramInt1, paramLong, paramInt2, this.qPU);
            h.this.ghS.postDelayed(h.this.qPQ, paramLong);
          }
          GMTrace.o(5385486336000L, 40125);
        }
      });
      this.qPM.setOnErrorListener(new MediaPlayer.OnErrorListener()
      {
        public final boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(5390989262848L, 40166);
          h.this.qPN = 1;
          w.w("MicroMsg.RingPlayer", "RingPlayer startPlayCustomRing MediaPlayer onError, what: " + paramAnonymousInt1 + ":extra:" + paramAnonymousInt2);
          GMTrace.o(5390989262848L, 40166);
          return false;
        }
      });
      this.qPM.setAudioStreamType(paramInt2);
      if (paramBoolean) {
        this.qPM.setVolume(0.6F, 0.6F);
      }
      for (;;)
      {
        this.qPM.setLooping(false);
        this.qPM.prepare();
        this.qPM.start();
        if (System.currentTimeMillis() - this.qPO > 2000L) {
          this.qPN = 3;
        }
        GMTrace.o(5381459804160L, 40095);
        return;
        bwc();
      }
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.RingPlayer", "new MediaPlayer failed, " + localException.toString());
      GMTrace.o(5381459804160L, 40095);
    }
  }
  
  public final void b(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    GMTrace.i(5381862457344L, 40098);
    if ((paramInt1 == R.k.cOi) && (!at.AS().sh()) && (!at.AS().sn()) && ((this.fRS.getRingerMode() == 0) || (this.fRS.getRingerMode() == 1)))
    {
      GMTrace.o(5381862457344L, 40098);
      return;
    }
    boolean bool = this.mContext.getSharedPreferences(ab.bPU(), 0).getBoolean("settings_shake", true);
    if (paramBoolean1) {
      bg.l(this.mContext, bool);
    }
    if (paramInt2 == 0) {}
    try
    {
      at.AR();
      for (paramBoolean1 = ((Boolean)c.xh().get(73217, Boolean.valueOf(true))).booleanValue();; paramBoolean1 = ((Boolean)c.xh().get(73218, Boolean.valueOf(true))).booleanValue())
      {
        if (paramBoolean1) {
          break label206;
        }
        GMTrace.o(5381862457344L, 40098);
        return;
        if (paramInt2 != 1) {
          break;
        }
        at.AR();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.RingPlayer", "get voip sound failed: " + localException.getMessage());
        paramBoolean1 = true;
      }
      label206:
      this.qPP = System.currentTimeMillis();
      i locali = new i();
      try
      {
        locali.setDataSource(this.mContext, Uri.parse("android.resource://" + this.mContext.getPackageName() + "/" + paramInt1));
        locali.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
        {
          public final void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
          {
            GMTrace.i(5390720827392L, 40164);
            paramAnonymousMediaPlayer.release();
            if (System.currentTimeMillis() - h.this.qPP > 5000L) {
              h.this.qPN = 8;
            }
            GMTrace.o(5390720827392L, 40164);
          }
        });
        locali.setOnErrorListener(new MediaPlayer.OnErrorListener()
        {
          public final boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
          {
            GMTrace.i(5385217900544L, 40123);
            if (paramAnonymousMediaPlayer != null)
            {
              paramAnonymousMediaPlayer.release();
              h.this.qPN = 5;
              w.w("MicroMsg.RingPlayer", "RingPlayer playSound :onError", new Object[] { paramAnonymousMediaPlayer, Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
            }
            GMTrace.o(5385217900544L, 40123);
            return false;
          }
        });
        if (paramBoolean2) {
          if (!at.AS().sh()) {
            break label401;
          }
        }
        label401:
        for (paramInt2 = at.AS().st();; paramInt2 = 0)
        {
          locali.setAudioStreamType(paramInt2);
          if ((paramInt1 == R.k.cOi) && ((at.AS().sh()) || (at.AS().sn()))) {
            locali.setVolume(0.5F, 0.5F);
          }
          locali.prepare();
          locali.setLooping(false);
          locali.start();
          if (System.currentTimeMillis() - this.qPP > 2000L) {
            this.qPN = 7;
          }
          GMTrace.o(5381862457344L, 40098);
          return;
        }
        return;
      }
      catch (Throwable localThrowable)
      {
        w.w("MicroMsg.RingPlayer", "playSound Failed Throwable t = ", new Object[] { localThrowable });
        this.qPN = 6;
        GMTrace.o(5381862457344L, 40098);
      }
    }
  }
  
  public final boolean bwb()
  {
    GMTrace.i(5381191368704L, 40093);
    if (!this.eqj)
    {
      GMTrace.o(5381191368704L, 40093);
      return true;
    }
    GMTrace.o(5381191368704L, 40093);
    return false;
  }
  
  public final int bwd()
  {
    GMTrace.i(5382130892800L, 40100);
    w.d("MicroMsg.RingPlayer", "RingPlayer  mRingPlayerErrState:" + this.qPN);
    int i = this.qPN;
    GMTrace.o(5382130892800L, 40100);
    return i;
  }
  
  public final void d(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    GMTrace.i(5381996675072L, 40099);
    b(paramInt1, false, paramInt2, true);
    GMTrace.o(5381996675072L, 40099);
  }
  
  public final void iG(boolean paramBoolean)
  {
    int i = 0;
    GMTrace.i(5380788715520L, 40090);
    w.i("MicroMsg.RingPlayer", "setSpeakerStatus, isSpeakerOn: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    int j;
    if (paramBoolean)
    {
      if ((!paramBoolean) || (p.fQD.fNX < 0)) {
        break label120;
      }
      j = p.fQD.fNX;
    }
    for (;;)
    {
      if (j != this.fRS.getMode()) {
        this.fRS.setMode(j);
      }
      if (paramBoolean != this.fRS.isSpeakerphoneOn()) {
        this.fRS.setSpeakerphoneOn(paramBoolean);
      }
      GMTrace.o(5380788715520L, 40090);
      return;
      if (d.et(21))
      {
        i = 3;
        break;
      }
      i = 2;
      break;
      label120:
      j = i;
      if (!paramBoolean)
      {
        j = i;
        if (p.fQD.fNV >= 0) {
          j = p.fQD.fNV;
        }
      }
    }
  }
  
  public final void iH(boolean paramBoolean)
  {
    GMTrace.i(5380922933248L, 40091);
    if (this.eqj)
    {
      GMTrace.o(5380922933248L, 40091);
      return;
    }
    w.i("MicroMsg.RingPlayer", "now we start play ");
    for (;;)
    {
      try
      {
        Object localObject = RingtoneManager.getActualDefaultRingtoneUri(this.mContext, 1);
        this.qPM = i.a(this.mContext, (Uri)localObject);
        localObject = this.qPM;
        if (localObject == null)
        {
          GMTrace.o(5380922933248L, 40091);
          return;
        }
        this.qPM.stop();
        this.qPM.prepare();
        this.qPM.setLooping(true);
        iG(true);
        if (paramBoolean) {
          this.qPM.setVolume(0.6F, 0.6F);
        }
        switch (this.fRS.getRingerMode())
        {
        case 2: 
          this.eqj = true;
          GMTrace.o(5380922933248L, 40091);
          return;
          bwc();
          continue;
          if (this.qPM == null) {
            continue;
          }
        }
      }
      catch (Exception localException)
      {
        w.e("ex", localException.getMessage());
        GMTrace.o(5380922933248L, 40091);
        return;
      }
      this.qPM.start();
    }
  }
  
  /* Error */
  public final void l(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc2_w 410
    //   3: ldc_w 412
    //   6: invokestatic 58	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: iload_2
    //   10: ifne +43 -> 53
    //   13: invokestatic 283	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   16: pop
    //   17: invokestatic 289	com/tencent/mm/y/c:xh	()Lcom/tencent/mm/storage/t;
    //   20: ldc_w 290
    //   23: iconst_1
    //   24: invokestatic 296	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   27: invokevirtual 302	com/tencent/mm/storage/t:get	(ILjava/lang/Object;)Ljava/lang/Object;
    //   30: checkcast 292	java/lang/Boolean
    //   33: invokevirtual 305	java/lang/Boolean:booleanValue	()Z
    //   36: istore 6
    //   38: iload 6
    //   40: ifne +85 -> 125
    //   43: ldc2_w 410
    //   46: ldc_w 412
    //   49: invokestatic 122	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   52: return
    //   53: iload_2
    //   54: iconst_1
    //   55: if_icmpeq +8 -> 63
    //   58: iload_2
    //   59: iconst_2
    //   60: if_icmpne +59 -> 119
    //   63: invokestatic 283	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   66: pop
    //   67: invokestatic 289	com/tencent/mm/y/c:xh	()Lcom/tencent/mm/storage/t;
    //   70: ldc_w 306
    //   73: iconst_1
    //   74: invokestatic 296	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   77: invokevirtual 302	com/tencent/mm/storage/t:get	(ILjava/lang/Object;)Ljava/lang/Object;
    //   80: checkcast 292	java/lang/Boolean
    //   83: invokevirtual 305	java/lang/Boolean:booleanValue	()Z
    //   86: istore 6
    //   88: goto -50 -> 38
    //   91: astore 8
    //   93: ldc -11
    //   95: new 174	java/lang/StringBuilder
    //   98: dup
    //   99: ldc_w 308
    //   102: invokespecial 179	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   105: aload 8
    //   107: invokevirtual 311	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   110: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   116: invokestatic 254	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   119: iconst_1
    //   120: istore 6
    //   122: goto -84 -> 38
    //   125: aload_0
    //   126: getfield 60	com/tencent/mm/plugin/voip/video/h:eqj	Z
    //   129: ifeq +13 -> 142
    //   132: ldc2_w 410
    //   135: ldc_w 412
    //   138: invokestatic 122	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   141: return
    //   142: aload_0
    //   143: invokestatic 165	java/lang/System:currentTimeMillis	()J
    //   146: putfield 167	com/tencent/mm/plugin/voip/video/h:qPO	J
    //   149: aload_0
    //   150: new 169	com/tencent/mm/compatible/b/i
    //   153: dup
    //   154: invokespecial 170	com/tencent/mm/compatible/b/i:<init>	()V
    //   157: putfield 172	com/tencent/mm/plugin/voip/video/h:qPM	Landroid/media/MediaPlayer;
    //   160: aload_0
    //   161: getfield 172	com/tencent/mm/plugin/voip/video/h:qPM	Landroid/media/MediaPlayer;
    //   164: aload_0
    //   165: getfield 78	com/tencent/mm/plugin/voip/video/h:mContext	Landroid/content/Context;
    //   168: new 174	java/lang/StringBuilder
    //   171: dup
    //   172: ldc -80
    //   174: invokespecial 179	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   177: aload_0
    //   178: getfield 78	com/tencent/mm/plugin/voip/video/h:mContext	Landroid/content/Context;
    //   181: invokevirtual 182	android/content/Context:getPackageName	()Ljava/lang/String;
    //   184: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: ldc -68
    //   189: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: iload_1
    //   193: invokevirtual 191	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   196: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   199: invokestatic 200	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   202: invokevirtual 206	android/media/MediaPlayer:setDataSource	(Landroid/content/Context;Landroid/net/Uri;)V
    //   205: aload_0
    //   206: getfield 172	com/tencent/mm/plugin/voip/video/h:qPM	Landroid/media/MediaPlayer;
    //   209: new 6	com/tencent/mm/plugin/voip/video/h$1
    //   212: dup
    //   213: aload_0
    //   214: invokespecial 413	com/tencent/mm/plugin/voip/video/h$1:<init>	(Lcom/tencent/mm/plugin/voip/video/h;)V
    //   217: invokevirtual 213	android/media/MediaPlayer:setOnCompletionListener	(Landroid/media/MediaPlayer$OnCompletionListener;)V
    //   220: aload_0
    //   221: getfield 172	com/tencent/mm/plugin/voip/video/h:qPM	Landroid/media/MediaPlayer;
    //   224: new 8	com/tencent/mm/plugin/voip/video/h$2
    //   227: dup
    //   228: aload_0
    //   229: invokespecial 414	com/tencent/mm/plugin/voip/video/h$2:<init>	(Lcom/tencent/mm/plugin/voip/video/h;)V
    //   232: invokevirtual 220	android/media/MediaPlayer:setOnErrorListener	(Landroid/media/MediaPlayer$OnErrorListener;)V
    //   235: invokestatic 84	com/tencent/mm/y/at:AS	()Lcom/tencent/mm/compatible/b/e;
    //   238: invokevirtual 270	com/tencent/mm/compatible/b/e:sh	()Z
    //   241: istore 6
    //   243: invokestatic 84	com/tencent/mm/y/at:AS	()Lcom/tencent/mm/compatible/b/e;
    //   246: invokevirtual 273	com/tencent/mm/compatible/b/e:sn	()Z
    //   249: istore 7
    //   251: ldc -11
    //   253: ldc_w 416
    //   256: iconst_2
    //   257: anewarray 4	java/lang/Object
    //   260: dup
    //   261: iconst_0
    //   262: iload 6
    //   264: invokestatic 296	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   267: aastore
    //   268: dup
    //   269: iconst_1
    //   270: iload 7
    //   272: invokestatic 296	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   275: aastore
    //   276: invokestatic 418	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   279: iload 6
    //   281: ifeq +137 -> 418
    //   284: invokestatic 84	com/tencent/mm/y/at:AS	()Lcom/tencent/mm/compatible/b/e;
    //   287: invokevirtual 318	com/tencent/mm/compatible/b/e:st	()I
    //   290: istore_1
    //   291: aload_0
    //   292: iconst_0
    //   293: invokevirtual 406	com/tencent/mm/plugin/voip/video/h:iG	(Z)V
    //   296: aload_0
    //   297: getfield 172	com/tencent/mm/plugin/voip/video/h:qPM	Landroid/media/MediaPlayer;
    //   300: iload_1
    //   301: invokevirtual 224	android/media/MediaPlayer:setAudioStreamType	(I)V
    //   304: iload 7
    //   306: ifne +8 -> 314
    //   309: iload 6
    //   311: ifeq +173 -> 484
    //   314: aload_0
    //   315: getfield 91	com/tencent/mm/plugin/voip/video/h:fRS	Landroid/media/AudioManager;
    //   318: iload_1
    //   319: invokevirtual 422	android/media/AudioManager:getStreamMaxVolume	(I)I
    //   322: istore 5
    //   324: aload_0
    //   325: getfield 91	com/tencent/mm/plugin/voip/video/h:fRS	Landroid/media/AudioManager;
    //   328: iload_1
    //   329: invokevirtual 425	android/media/AudioManager:getStreamVolume	(I)I
    //   332: istore 4
    //   334: iload 4
    //   336: istore_2
    //   337: iload 4
    //   339: iload 5
    //   341: iconst_2
    //   342: idiv
    //   343: if_icmple +8 -> 351
    //   346: iload 5
    //   348: iconst_2
    //   349: idiv
    //   350: istore_2
    //   351: aload_0
    //   352: getfield 91	com/tencent/mm/plugin/voip/video/h:fRS	Landroid/media/AudioManager;
    //   355: iload_1
    //   356: iload_2
    //   357: iconst_0
    //   358: invokevirtual 429	android/media/AudioManager:setStreamVolume	(III)V
    //   361: aload_0
    //   362: getfield 172	com/tencent/mm/plugin/voip/video/h:qPM	Landroid/media/MediaPlayer;
    //   365: iconst_1
    //   366: invokevirtual 233	android/media/MediaPlayer:setLooping	(Z)V
    //   369: aload_0
    //   370: getfield 172	com/tencent/mm/plugin/voip/video/h:qPM	Landroid/media/MediaPlayer;
    //   373: invokevirtual 236	android/media/MediaPlayer:prepare	()V
    //   376: aload_0
    //   377: getfield 172	com/tencent/mm/plugin/voip/video/h:qPM	Landroid/media/MediaPlayer;
    //   380: invokevirtual 239	android/media/MediaPlayer:start	()V
    //   383: invokestatic 165	java/lang/System:currentTimeMillis	()J
    //   386: aload_0
    //   387: getfield 167	com/tencent/mm/plugin/voip/video/h:qPO	J
    //   390: lsub
    //   391: ldc2_w 240
    //   394: lcmp
    //   395: ifle +8 -> 403
    //   398: aload_0
    //   399: iconst_3
    //   400: putfield 63	com/tencent/mm/plugin/voip/video/h:qPN	I
    //   403: aload_0
    //   404: iconst_1
    //   405: putfield 60	com/tencent/mm/plugin/voip/video/h:eqj	Z
    //   408: ldc2_w 410
    //   411: ldc_w 412
    //   414: invokestatic 122	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   417: return
    //   418: iload_3
    //   419: ifne +8 -> 427
    //   422: iload 7
    //   424: ifeq +27 -> 451
    //   427: getstatic 358	com/tencent/mm/compatible/d/p:fQD	Lcom/tencent/mm/compatible/d/a;
    //   430: getfield 432	com/tencent/mm/compatible/d/a:fNU	I
    //   433: iflt +275 -> 708
    //   436: getstatic 358	com/tencent/mm/compatible/d/p:fQD	Lcom/tencent/mm/compatible/d/a;
    //   439: getfield 432	com/tencent/mm/compatible/d/a:fNU	I
    //   442: istore_1
    //   443: aload_0
    //   444: iconst_0
    //   445: invokevirtual 406	com/tencent/mm/plugin/voip/video/h:iG	(Z)V
    //   448: goto -152 -> 296
    //   451: invokestatic 84	com/tencent/mm/y/at:AS	()Lcom/tencent/mm/compatible/b/e;
    //   454: invokevirtual 270	com/tencent/mm/compatible/b/e:sh	()Z
    //   457: ifne +246 -> 703
    //   460: getstatic 358	com/tencent/mm/compatible/d/p:fQD	Lcom/tencent/mm/compatible/d/a;
    //   463: getfield 435	com/tencent/mm/compatible/d/a:fNW	I
    //   466: iflt +237 -> 703
    //   469: getstatic 358	com/tencent/mm/compatible/d/p:fQD	Lcom/tencent/mm/compatible/d/a;
    //   472: getfield 435	com/tencent/mm/compatible/d/a:fNW	I
    //   475: istore_1
    //   476: aload_0
    //   477: iconst_1
    //   478: invokevirtual 406	com/tencent/mm/plugin/voip/video/h:iG	(Z)V
    //   481: goto -185 -> 296
    //   484: iload_3
    //   485: ifeq +94 -> 579
    //   488: aload_0
    //   489: getfield 172	com/tencent/mm/plugin/voip/video/h:qPM	Landroid/media/MediaPlayer;
    //   492: ldc -31
    //   494: ldc -31
    //   496: invokevirtual 229	android/media/MediaPlayer:setVolume	(FF)V
    //   499: goto -138 -> 361
    //   502: astore 8
    //   504: ldc -11
    //   506: new 174	java/lang/StringBuilder
    //   509: dup
    //   510: ldc_w 437
    //   513: invokespecial 179	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   516: aload 8
    //   518: invokevirtual 438	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   521: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   524: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   527: invokestatic 254	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   530: aload_0
    //   531: iconst_2
    //   532: putfield 63	com/tencent/mm/plugin/voip/video/h:qPN	I
    //   535: aload_0
    //   536: getfield 78	com/tencent/mm/plugin/voip/video/h:mContext	Landroid/content/Context;
    //   539: iconst_1
    //   540: invokestatic 398	android/media/RingtoneManager:getActualDefaultRingtoneUri	(Landroid/content/Context;I)Landroid/net/Uri;
    //   543: astore 8
    //   545: aload_0
    //   546: aload_0
    //   547: getfield 78	com/tencent/mm/plugin/voip/video/h:mContext	Landroid/content/Context;
    //   550: aload 8
    //   552: invokestatic 401	com/tencent/mm/compatible/b/i:a	(Landroid/content/Context;Landroid/net/Uri;)Lcom/tencent/mm/compatible/b/i;
    //   555: putfield 172	com/tencent/mm/plugin/voip/video/h:qPM	Landroid/media/MediaPlayer;
    //   558: aload_0
    //   559: getfield 172	com/tencent/mm/plugin/voip/video/h:qPM	Landroid/media/MediaPlayer;
    //   562: astore 8
    //   564: aload 8
    //   566: ifnonnull +57 -> 623
    //   569: ldc2_w 410
    //   572: ldc_w 412
    //   575: invokestatic 122	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   578: return
    //   579: aload_0
    //   580: invokespecial 243	com/tencent/mm/plugin/voip/video/h:bwc	()V
    //   583: goto -222 -> 361
    //   586: astore 8
    //   588: ldc -11
    //   590: new 174	java/lang/StringBuilder
    //   593: dup
    //   594: ldc -9
    //   596: invokespecial 179	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   599: aload 8
    //   601: invokevirtual 248	java/lang/Exception:toString	()Ljava/lang/String;
    //   604: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   607: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   610: invokestatic 254	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   613: ldc2_w 410
    //   616: ldc_w 412
    //   619: invokestatic 122	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   622: return
    //   623: aload_0
    //   624: getfield 172	com/tencent/mm/plugin/voip/video/h:qPM	Landroid/media/MediaPlayer;
    //   627: invokevirtual 404	android/media/MediaPlayer:stop	()V
    //   630: aload_0
    //   631: getfield 172	com/tencent/mm/plugin/voip/video/h:qPM	Landroid/media/MediaPlayer;
    //   634: invokevirtual 236	android/media/MediaPlayer:prepare	()V
    //   637: aload_0
    //   638: getfield 172	com/tencent/mm/plugin/voip/video/h:qPM	Landroid/media/MediaPlayer;
    //   641: iconst_1
    //   642: invokevirtual 233	android/media/MediaPlayer:setLooping	(Z)V
    //   645: iload_3
    //   646: ifeq +50 -> 696
    //   649: aload_0
    //   650: getfield 172	com/tencent/mm/plugin/voip/video/h:qPM	Landroid/media/MediaPlayer;
    //   653: ldc -31
    //   655: ldc -31
    //   657: invokevirtual 229	android/media/MediaPlayer:setVolume	(FF)V
    //   660: aload_0
    //   661: getfield 172	com/tencent/mm/plugin/voip/video/h:qPM	Landroid/media/MediaPlayer;
    //   664: invokevirtual 239	android/media/MediaPlayer:start	()V
    //   667: aload_0
    //   668: iconst_0
    //   669: putfield 63	com/tencent/mm/plugin/voip/video/h:qPN	I
    //   672: goto -269 -> 403
    //   675: astore 8
    //   677: ldc_w 408
    //   680: aload 8
    //   682: invokevirtual 311	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   685: invokestatic 254	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   688: aload_0
    //   689: iconst_2
    //   690: putfield 63	com/tencent/mm/plugin/voip/video/h:qPN	I
    //   693: goto -290 -> 403
    //   696: aload_0
    //   697: invokespecial 243	com/tencent/mm/plugin/voip/video/h:bwc	()V
    //   700: goto -40 -> 660
    //   703: iconst_2
    //   704: istore_1
    //   705: goto -229 -> 476
    //   708: iconst_0
    //   709: istore_1
    //   710: goto -267 -> 443
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	713	0	this	h
    //   0	713	1	paramInt1	int
    //   0	713	2	paramInt2	int
    //   0	713	3	paramBoolean	boolean
    //   332	12	4	i	int
    //   322	28	5	j	int
    //   36	274	6	bool1	boolean
    //   249	174	7	bool2	boolean
    //   91	15	8	localException1	Exception
    //   502	15	8	localThrowable	Throwable
    //   543	22	8	localObject	Object
    //   586	14	8	localException2	Exception
    //   675	6	8	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   13	38	91	java/lang/Exception
    //   63	88	91	java/lang/Exception
    //   160	279	502	java/lang/Throwable
    //   284	296	502	java/lang/Throwable
    //   296	304	502	java/lang/Throwable
    //   314	334	502	java/lang/Throwable
    //   337	351	502	java/lang/Throwable
    //   351	361	502	java/lang/Throwable
    //   361	403	502	java/lang/Throwable
    //   427	443	502	java/lang/Throwable
    //   443	448	502	java/lang/Throwable
    //   451	476	502	java/lang/Throwable
    //   476	481	502	java/lang/Throwable
    //   488	499	502	java/lang/Throwable
    //   579	583	502	java/lang/Throwable
    //   142	160	586	java/lang/Exception
    //   160	279	586	java/lang/Exception
    //   284	296	586	java/lang/Exception
    //   296	304	586	java/lang/Exception
    //   314	334	586	java/lang/Exception
    //   337	351	586	java/lang/Exception
    //   351	361	586	java/lang/Exception
    //   361	403	586	java/lang/Exception
    //   403	408	586	java/lang/Exception
    //   427	443	586	java/lang/Exception
    //   443	448	586	java/lang/Exception
    //   451	476	586	java/lang/Exception
    //   476	481	586	java/lang/Exception
    //   488	499	586	java/lang/Exception
    //   504	535	586	java/lang/Exception
    //   579	583	586	java/lang/Exception
    //   677	693	586	java/lang/Exception
    //   535	564	675	java/lang/Exception
    //   623	645	675	java/lang/Exception
    //   649	660	675	java/lang/Exception
    //   660	672	675	java/lang/Exception
    //   696	700	675	java/lang/Exception
  }
  
  public final void m(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(5381728239616L, 40097);
    this.qPN = 0;
    if (paramInt1 == 0)
    {
      iH(paramBoolean);
      GMTrace.o(5381728239616L, 40097);
      return;
    }
    l(paramInt1, paramInt2, paramBoolean);
    GMTrace.o(5381728239616L, 40097);
  }
  
  public final void stop()
  {
    GMTrace.i(5381057150976L, 40092);
    w.d("MicroMsg.RingPlayer", "stop, isStarted: %b", new Object[] { Boolean.valueOf(this.eqj) });
    if (this.jZM != null)
    {
      this.jZM.cancel();
      this.jZM = null;
    }
    if ((this.qPM == null) || (!this.eqj))
    {
      GMTrace.o(5381057150976L, 40092);
      return;
    }
    try
    {
      this.qPM.stop();
      this.qPM.release();
      if (this.qPQ != null) {
        this.ghS.removeCallbacks(this.qPQ);
      }
      this.eqj = false;
      at.AS().setMode(0);
      GMTrace.o(5381057150976L, 40092);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.RingPlayer", localException.toString());
      GMTrace.o(5381057150976L, 40092);
    }
  }
  
  private final class a
    implements Runnable
  {
    private int qPV;
    private long qPW;
    private boolean qPX;
    private int streamType;
    
    public a(int paramInt1, long paramLong, boolean paramBoolean, int paramInt2)
    {
      GMTrace.i(5391391916032L, 40169);
      this.qPV = paramInt1;
      this.qPW = paramLong;
      this.qPX = paramBoolean;
      this.streamType = paramInt2;
      GMTrace.o(5391391916032L, 40169);
    }
    
    public final void run()
    {
      GMTrace.i(5391526133760L, 40170);
      h.this.a(this.qPV, this.qPW, this.qPX, this.streamType);
      GMTrace.o(5391526133760L, 40170);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\video\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */