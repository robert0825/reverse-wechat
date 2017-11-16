package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.media.PlaybackParams;
import android.opengl.GLES20;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.b.i;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMTextureView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public class VideoTextureView
  extends MMTextureView
  implements f
{
  private float aFH;
  private boolean isLoop;
  private boolean jGN;
  private int jsh;
  private int jsi;
  private int kE;
  private Surface mSurface;
  private int mVideoHeight;
  private int mVideoWidth;
  private f.a oTm;
  private MediaPlayer oWu;
  private long startTime;
  private String tHG;
  private boolean tHH;
  private boolean tHI;
  MediaPlayer.OnVideoSizeChangedListener tHJ;
  MediaPlayer.OnPreparedListener tHK;
  private MediaPlayer.OnCompletionListener tHL;
  private MediaPlayer.OnErrorListener tHM;
  private f.b tHP;
  private long tHQ;
  public int tHR;
  private MediaPlayer.OnSeekCompleteListener tHS;
  private MediaPlayer.OnBufferingUpdateListener tHT;
  private MediaPlayer.OnInfoListener tHU;
  private boolean tHV;
  private long tHm;
  private boolean tHn;
  private f.e tHp;
  private f.c tHq;
  private f.d tHr;
  private boolean tHt;
  private boolean tHu;
  TextureView.SurfaceTextureListener tHw;
  public o tHx;
  
  public VideoTextureView(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(1086358290432L, 8094);
    GMTrace.o(1086358290432L, 8094);
  }
  
  public VideoTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(1086492508160L, 8095);
    GMTrace.o(1086492508160L, 8095);
  }
  
  public VideoTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1086626725888L, 8096);
    this.mSurface = null;
    this.oWu = null;
    this.startTime = 0L;
    this.tHQ = 0L;
    this.jsh = 0;
    this.jsi = 0;
    this.tHR = 0;
    this.isLoop = false;
    this.tHn = false;
    this.tHJ = new MediaPlayer.OnVideoSizeChangedListener()
    {
      public final void onVideoSizeChanged(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(1095619313664L, 8163);
        try
        {
          if (paramAnonymousMediaPlayer != VideoTextureView.a(VideoTextureView.this))
          {
            w.w("MicroMsg.VideoTextureView", "another player on video size changed, return now.[%s, %s]", new Object[] { paramAnonymousMediaPlayer, VideoTextureView.a(VideoTextureView.this) });
            GMTrace.o(1095619313664L, 8163);
            return;
          }
          VideoTextureView.a(VideoTextureView.this, paramAnonymousMediaPlayer.getVideoWidth());
          VideoTextureView.b(VideoTextureView.this, paramAnonymousMediaPlayer.getVideoHeight());
          w.i("MicroMsg.VideoTextureView", "on size change size:( " + VideoTextureView.b(VideoTextureView.this) + " , " + VideoTextureView.c(VideoTextureView.this) + " )");
          if (VideoTextureView.d(VideoTextureView.this) != null) {
            VideoTextureView.d(VideoTextureView.this).bs(VideoTextureView.b(VideoTextureView.this), VideoTextureView.c(VideoTextureView.this));
          }
        }
        catch (Exception paramAnonymousMediaPlayer)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.VideoTextureView", paramAnonymousMediaPlayer, "on video size changed error[%d, %d]", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
          }
        }
        VideoTextureView.e(VideoTextureView.this);
        GMTrace.o(1095619313664L, 8163);
      }
    };
    this.tHK = new MediaPlayer.OnPreparedListener()
    {
      public final void onPrepared(MediaPlayer paramAnonymousMediaPlayer)
      {
        GMTrace.i(1109175304192L, 8264);
        if ((paramAnonymousMediaPlayer != VideoTextureView.a(VideoTextureView.this)) && (paramAnonymousMediaPlayer != null))
        {
          w.w("MicroMsg.VideoTextureView", "another player callback, release now.[%s, %s]", new Object[] { paramAnonymousMediaPlayer, VideoTextureView.a(VideoTextureView.this) });
          VideoTextureView.a(VideoTextureView.this, paramAnonymousMediaPlayer);
          GMTrace.o(1109175304192L, 8264);
          return;
        }
        VideoTextureView.f(VideoTextureView.this);
        VideoTextureView localVideoTextureView = VideoTextureView.this;
        int i;
        if (paramAnonymousMediaPlayer != null)
        {
          i = paramAnonymousMediaPlayer.getVideoWidth();
          VideoTextureView.a(localVideoTextureView, i);
          localVideoTextureView = VideoTextureView.this;
          if (paramAnonymousMediaPlayer == null) {
            break label274;
          }
          i = paramAnonymousMediaPlayer.getVideoHeight();
          label109:
          VideoTextureView.b(localVideoTextureView, i);
          w.i("MicroMsg.VideoTextureView", "on prepared. size [%d, %d] mStartWhenPrepared %b ", new Object[] { Integer.valueOf(VideoTextureView.b(VideoTextureView.this)), Integer.valueOf(VideoTextureView.c(VideoTextureView.this)), Boolean.valueOf(VideoTextureView.g(VideoTextureView.this)) });
          VideoTextureView.e(VideoTextureView.this);
          if ((VideoTextureView.b(VideoTextureView.this) == 0) || (VideoTextureView.c(VideoTextureView.this) == 0)) {
            break label279;
          }
          if (VideoTextureView.g(VideoTextureView.this))
          {
            VideoTextureView.a(VideoTextureView.this).start();
            VideoTextureView.a(VideoTextureView.this).setLooping(VideoTextureView.h(VideoTextureView.this));
            VideoTextureView.i(VideoTextureView.this);
          }
        }
        for (;;)
        {
          if (VideoTextureView.d(VideoTextureView.this) != null) {
            VideoTextureView.d(VideoTextureView.this).Xq();
          }
          GMTrace.o(1109175304192L, 8264);
          return;
          i = 0;
          break;
          label274:
          i = 0;
          break label109;
          label279:
          if (VideoTextureView.g(VideoTextureView.this))
          {
            VideoTextureView.a(VideoTextureView.this).start();
            VideoTextureView.i(VideoTextureView.this);
            VideoTextureView.a(VideoTextureView.this).setLooping(VideoTextureView.h(VideoTextureView.this));
          }
        }
      }
    };
    this.tHS = new MediaPlayer.OnSeekCompleteListener()
    {
      public final void onSeekComplete(MediaPlayer paramAnonymousMediaPlayer)
      {
        GMTrace.i(1105014554624L, 8233);
        if (paramAnonymousMediaPlayer != null) {}
        for (int i = paramAnonymousMediaPlayer.getCurrentPosition();; i = -1)
        {
          w.i("MicroMsg.VideoTextureView", "video seek complete curPos[%d] mStartWhenPrepared[%b] pauseWhenUpdated[%b]", new Object[] { Integer.valueOf(i), Boolean.valueOf(VideoTextureView.g(VideoTextureView.this)), Boolean.valueOf(VideoTextureView.j(VideoTextureView.this)) });
          if (!VideoTextureView.g(VideoTextureView.this)) {
            break label153;
          }
          if (!VideoTextureView.j(VideoTextureView.this)) {
            break;
          }
          GMTrace.o(1105014554624L, 8233);
          return;
        }
        VideoTextureView.this.start();
        for (;;)
        {
          if (VideoTextureView.k(VideoTextureView.this) != null) {
            VideoTextureView.k(VideoTextureView.this).bE(VideoTextureView.g(VideoTextureView.this));
          }
          VideoTextureView.a(VideoTextureView.this, 0L);
          GMTrace.o(1105014554624L, 8233);
          return;
          label153:
          VideoTextureView.this.pause();
        }
      }
    };
    this.tHT = new MediaPlayer.OnBufferingUpdateListener()
    {
      public final void onBufferingUpdate(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt)
      {
        GMTrace.i(16403016974336L, 122212);
        w.d("MicroMsg.VideoTextureView", "onBufferingUpdate percent[%d]", new Object[] { Integer.valueOf(paramAnonymousInt) });
        VideoTextureView.c(VideoTextureView.this, paramAnonymousInt);
        GMTrace.o(16403016974336L, 122212);
      }
    };
    this.tHU = new MediaPlayer.OnInfoListener()
    {
      public final boolean onInfo(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(16406640852992L, 122239);
        w.d("MicroMsg.VideoTextureView", "onInfo [%d %d]", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        if (VideoTextureView.l(VideoTextureView.this) != null) {
          VideoTextureView.l(VideoTextureView.this).dV(paramAnonymousInt1, paramAnonymousInt2);
        }
        GMTrace.o(16406640852992L, 122239);
        return false;
      }
    };
    this.tHL = new MediaPlayer.OnCompletionListener()
    {
      public final void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
      {
        GMTrace.i(16404090716160L, 122220);
        w.i("MicroMsg.VideoTextureView", "video on completion");
        VideoTextureView.b(VideoTextureView.this, bg.Pu());
        if (VideoTextureView.d(VideoTextureView.this) != null) {
          VideoTextureView.d(VideoTextureView.this).onCompletion();
        }
        GMTrace.o(16404090716160L, 122220);
      }
    };
    this.tHM = new MediaPlayer.OnErrorListener()
    {
      public final boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(16403956498432L, 122219);
        w.w("MicroMsg.VideoTextureView", "Error: " + paramAnonymousInt1 + "," + paramAnonymousInt2);
        if (VideoTextureView.d(VideoTextureView.this) != null) {
          VideoTextureView.d(VideoTextureView.this).onError(paramAnonymousInt1, paramAnonymousInt2);
        }
        GMTrace.o(16403956498432L, 122219);
        return true;
      }
    };
    this.tHm = 0L;
    this.tHt = false;
    this.tHu = false;
    this.tHV = false;
    this.tHw = new TextureView.SurfaceTextureListener()
    {
      public final void onSurfaceTextureAvailable(SurfaceTexture paramAnonymousSurfaceTexture, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(16403688062976L, 122217);
        VideoTextureView.d(VideoTextureView.this, paramAnonymousInt1);
        VideoTextureView.e(VideoTextureView.this, paramAnonymousInt2);
        VideoTextureView.this.cau();
        VideoTextureView.a(VideoTextureView.this, new Surface(paramAnonymousSurfaceTexture));
        w.i("MicroMsg.VideoTextureView", "%d on texture available %d*%d mIsPrepared[%b] mSurface[%d] ", new Object[] { Integer.valueOf(VideoTextureView.this.hashCode()), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Boolean.valueOf(VideoTextureView.s(VideoTextureView.this)), Integer.valueOf(VideoTextureView.u(VideoTextureView.this).hashCode()) });
        if ((VideoTextureView.a(VideoTextureView.this) == null) || (!VideoTextureView.s(VideoTextureView.this)))
        {
          VideoTextureView.v(VideoTextureView.this);
          if (VideoTextureView.x(VideoTextureView.this) != null) {
            VideoTextureView.x(VideoTextureView.this).MV();
          }
          GMTrace.o(16403688062976L, 122217);
          return;
        }
        VideoTextureView.a(VideoTextureView.this).setSurface(VideoTextureView.u(VideoTextureView.this));
        if (VideoTextureView.w(VideoTextureView.this)) {
          VideoTextureView.a(VideoTextureView.this).start();
        }
        for (;;)
        {
          VideoTextureView.b(VideoTextureView.this, false);
          break;
          VideoTextureView.a(VideoTextureView.this, true);
          VideoTextureView.a(VideoTextureView.this).setVolume(0.0F, 0.0F);
          VideoTextureView.a(VideoTextureView.this).start();
        }
      }
      
      public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramAnonymousSurfaceTexture)
      {
        GMTrace.i(16403553845248L, 122216);
        w.i("MicroMsg.VideoTextureView", "%d on texture destroyed mIsPrepared[%b]", new Object[] { Integer.valueOf(VideoTextureView.this.hashCode()), Boolean.valueOf(VideoTextureView.s(VideoTextureView.this)) });
        VideoTextureView.a(VideoTextureView.this, null);
        if ((VideoTextureView.a(VideoTextureView.this) != null) && (VideoTextureView.s(VideoTextureView.this))) {
          if (VideoTextureView.this.isPlaying())
          {
            VideoTextureView.b(VideoTextureView.this, true);
            VideoTextureView.a(VideoTextureView.this).pause();
          }
        }
        for (;;)
        {
          GMTrace.o(16403553845248L, 122216);
          return false;
          VideoTextureView.t(VideoTextureView.this);
          VideoTextureView.b(VideoTextureView.this, false);
        }
      }
      
      public final void onSurfaceTextureSizeChanged(SurfaceTexture paramAnonymousSurfaceTexture, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(16403419627520L, 122215);
        w.i("MicroMsg.VideoTextureView", "on texture size changed width : " + paramAnonymousInt1 + " height : " + paramAnonymousInt2);
        if ((VideoTextureView.a(VideoTextureView.this) != null) && (VideoTextureView.s(VideoTextureView.this)) && (VideoTextureView.b(VideoTextureView.this) == paramAnonymousInt1) && (VideoTextureView.c(VideoTextureView.this) == paramAnonymousInt2)) {
          VideoTextureView.a(VideoTextureView.this).start();
        }
        GMTrace.o(16403419627520L, 122215);
      }
      
      public final void onSurfaceTextureUpdated(SurfaceTexture paramAnonymousSurfaceTexture)
      {
        GMTrace.i(16403285409792L, 122214);
        if (VideoTextureView.j(VideoTextureView.this)) {
          if (VideoTextureView.a(VideoTextureView.this) != null)
          {
            VideoTextureView.a(VideoTextureView.this).pause();
            if (!VideoTextureView.m(VideoTextureView.this)) {
              break label220;
            }
            VideoTextureView.a(VideoTextureView.this).setVolume(0.0F, 0.0F);
          }
        }
        for (;;)
        {
          VideoTextureView.a(VideoTextureView.this, false);
          if ((VideoTextureView.n(VideoTextureView.this) > 0L) && (VideoTextureView.o(VideoTextureView.this) != null))
          {
            VideoTextureView.o(VideoTextureView.this).aQG();
            VideoTextureView.p(VideoTextureView.this);
          }
          VideoTextureView.a(VideoTextureView.this, System.currentTimeMillis());
          if (VideoTextureView.q(VideoTextureView.this))
          {
            w.i("MicroMsg.VideoTextureView", "%d flush surface pause now time[%d]", new Object[] { Integer.valueOf(VideoTextureView.this.hashCode()), Integer.valueOf(VideoTextureView.this.getCurrentPosition()) });
            if (VideoTextureView.a(VideoTextureView.this) != null)
            {
              VideoTextureView.a(VideoTextureView.this).pause();
              VideoTextureView.this.setMute(VideoTextureView.m(VideoTextureView.this));
            }
            VideoTextureView.r(VideoTextureView.this);
          }
          GMTrace.o(16403285409792L, 122214);
          return;
          label220:
          VideoTextureView.a(VideoTextureView.this).setVolume(1.0F, 1.0F);
        }
      }
    };
    this.jGN = false;
    this.tHx = new o();
    this.aFH = -1.0F;
    this.mVideoWidth = 0;
    this.mVideoHeight = 0;
    setSurfaceTextureListener(this.tHw);
    setFocusable(true);
    setFocusableInTouchMode(true);
    GMTrace.o(1086626725888L, 8096);
  }
  
  private boolean au(float paramFloat)
  {
    GMTrace.i(17473000701952L, 130184);
    if (Build.VERSION.SDK_INT >= 23) {}
    try
    {
      if ((this.oWu != null) && (d.et(23)))
      {
        PlaybackParams localPlaybackParams2 = this.oWu.getPlaybackParams();
        PlaybackParams localPlaybackParams1 = localPlaybackParams2;
        if (localPlaybackParams2 == null) {
          localPlaybackParams1 = new PlaybackParams();
        }
        this.oWu.setPlaybackParams(localPlaybackParams1.setSpeed(paramFloat));
      }
      GMTrace.o(17473000701952L, 130184);
      return true;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.VideoTextureView", localException, "%s handle play rate error", new Object[] { Integer.valueOf(hashCode()) });
      GMTrace.o(17473000701952L, 130184);
    }
    return false;
  }
  
  private void aze()
  {
    GMTrace.i(1087566249984L, 8103);
    if ((bg.nm(this.tHG)) || (this.mSurface == null))
    {
      GMTrace.o(1087566249984L, 8103);
      return;
    }
    bNs();
    w.i("MicroMsg.VideoTextureView", "%d open video %s", new Object[] { Integer.valueOf(hashCode()), this.tHG });
    try
    {
      this.oWu = new i();
      this.oWu.setOnPreparedListener(this.tHK);
      this.oWu.setOnVideoSizeChangedListener(this.tHJ);
      this.tHH = false;
      w.v("MicroMsg.VideoTextureView", "reset duration to -1 in openVideo");
      this.kE = -1;
      this.tHR = 0;
      this.oWu.setOnCompletionListener(this.tHL);
      this.oWu.setOnErrorListener(this.tHM);
      this.oWu.setOnSeekCompleteListener(this.tHS);
      this.oWu.setOnBufferingUpdateListener(this.tHT);
      this.oWu.setOnInfoListener(this.tHU);
      this.oWu.setDataSource(this.tHG);
      this.oWu.setSurface(this.mSurface);
      this.oWu.setAudioStreamType(3);
      this.oWu.setScreenOnWhilePlaying(true);
      this.oWu.prepareAsync();
      this.mVideoHeight = this.oWu.getVideoHeight();
      this.mVideoWidth = this.oWu.getVideoWidth();
      setMute(this.jGN);
      T(this.aFH);
      w.i("MicroMsg.VideoTextureView", "%d open video success player[%s] ", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.oWu.hashCode()) });
      GMTrace.o(1087566249984L, 8103);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.VideoTextureView", localException, "prepare async error path", new Object[0]);
      if (this.oTm != null) {
        this.oTm.onError(-1, -1);
      }
      GMTrace.o(1087566249984L, 8103);
    }
  }
  
  private void bNs()
  {
    boolean bool1 = true;
    GMTrace.i(1087297814528L, 8101);
    int i = hashCode();
    boolean bool2 = this.tHH;
    if (this.oWu == null) {}
    for (;;)
    {
      w.i("MicroMsg.VideoTextureView", "%d release media player isPrepared[%b] player is null[%b] ", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      if (this.oWu != null)
      {
        this.oWu.setOnErrorListener(null);
        this.oWu.setOnVideoSizeChangedListener(null);
      }
      try
      {
        this.oWu.stop();
      }
      catch (Exception localException1)
      {
        try
        {
          for (;;)
          {
            this.oWu.reset();
            this.oWu.release();
            this.oWu = null;
            GMTrace.o(1087297814528L, 8101);
            return;
            bool1 = false;
            break;
            localException1 = localException1;
            w.printErrStackTrace("MicroMsg.VideoTextureView", localException1, "stop media player error", new Object[0]);
          }
        }
        catch (Exception localException2)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.VideoTextureView", localException2, "reset media player error", new Object[0]);
          }
        }
      }
    }
  }
  
  public final String NE()
  {
    GMTrace.i(1087029379072L, 8099);
    String str = this.tHG;
    GMTrace.o(1087029379072L, 8099);
    return str;
  }
  
  public final boolean T(float paramFloat)
  {
    GMTrace.i(17472866484224L, 130183);
    if (paramFloat <= 0.0F)
    {
      GMTrace.o(17472866484224L, 130183);
      return false;
    }
    this.aFH = paramFloat;
    if (d.et(23))
    {
      boolean bool = au(this.aFH);
      GMTrace.o(17472866484224L, 130183);
      return bool;
    }
    GMTrace.o(17472866484224L, 130183);
    return false;
  }
  
  public final void a(f.a parama)
  {
    GMTrace.i(1088371556352L, 8109);
    this.oTm = parama;
    GMTrace.o(1088371556352L, 8109);
  }
  
  public final void a(f.b paramb)
  {
    GMTrace.i(16404493369344L, 122223);
    this.tHP = paramb;
    GMTrace.o(16404493369344L, 122223);
  }
  
  public final void a(f.c paramc)
  {
    GMTrace.i(16404359151616L, 122222);
    this.tHq = paramc;
    GMTrace.o(16404359151616L, 122222);
  }
  
  public final void a(f.d paramd)
  {
    GMTrace.i(17472598048768L, 130181);
    this.tHr = paramd;
    GMTrace.o(17472598048768L, 130181);
  }
  
  public final void a(f.e parame)
  {
    GMTrace.i(1086760943616L, 8097);
    this.tHp = parame;
    GMTrace.o(1086760943616L, 8097);
  }
  
  public final void aOJ()
  {
    GMTrace.i(17472732266496L, 130182);
    if ((this.oWu != null) && (this.tHH) && (this.mSurface != null) && (this.mSurface.isValid()))
    {
      w.i("MicroMsg.VideoTextureView", "%d flush surface start time[%d] ", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(getCurrentPosition()) });
      this.tHV = true;
      this.oWu.setVolume(0.0F, 0.0F);
      this.oWu.start();
    }
    GMTrace.o(17472732266496L, 130182);
  }
  
  public final double bgO()
  {
    GMTrace.i(1088908427264L, 8113);
    GMTrace.o(1088908427264L, 8113);
    return 0.0D;
  }
  
  public final long bgP()
  {
    GMTrace.i(1089445298176L, 8117);
    long l = this.tHm;
    GMTrace.o(1089445298176L, 8117);
    return l;
  }
  
  public final void c(double paramDouble, boolean paramBoolean)
  {
    GMTrace.i(1089176862720L, 8115);
    o(paramDouble);
    this.tHI = paramBoolean;
    GMTrace.o(1089176862720L, 8115);
  }
  
  public final void ci(boolean paramBoolean)
  {
    GMTrace.i(1088237338624L, 8108);
    if (this.oWu != null) {
      this.oWu.setLooping(paramBoolean);
    }
    this.isLoop = true;
    GMTrace.o(1088237338624L, 8108);
  }
  
  public final int getCurrentPosition()
  {
    GMTrace.i(1087968903168L, 8106);
    if ((this.oWu != null) && (this.tHH))
    {
      int i = this.oWu.getCurrentPosition();
      GMTrace.o(1087968903168L, 8106);
      return i;
    }
    if (this.oWu == null)
    {
      GMTrace.o(1087968903168L, 8106);
      return -1;
    }
    GMTrace.o(1087968903168L, 8106);
    return 0;
  }
  
  public final int getDuration()
  {
    GMTrace.i(1087834685440L, 8105);
    if ((this.oWu != null) && (this.tHH))
    {
      if (this.kE > 0)
      {
        i = this.kE;
        GMTrace.o(1087834685440L, 8105);
        return i;
      }
      this.kE = this.oWu.getDuration();
      i = this.kE;
      GMTrace.o(1087834685440L, 8105);
      return i;
    }
    this.kE = -1;
    int i = this.kE;
    GMTrace.o(1087834685440L, 8105);
    return i;
  }
  
  public final void hw(boolean paramBoolean)
  {
    GMTrace.i(1089311080448L, 8116);
    GMTrace.o(1089311080448L, 8116);
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(1088103120896L, 8107);
    if ((this.oWu != null) && (this.tHH) && (!this.tHu)) {}
    for (boolean bool = this.oWu.isPlaying();; bool = false)
    {
      w.d("MicroMsg.VideoTextureView", "%d is playing result [%b] pauseWhenUpdated[%b] mIsPrepared[%b]", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(bool), Boolean.valueOf(this.tHu), Boolean.valueOf(this.tHH) });
      GMTrace.o(1088103120896L, 8107);
      return bool;
    }
  }
  
  public final boolean j(Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(1088774209536L, 8112);
    paramBoolean = start();
    GMTrace.o(1088774209536L, 8112);
    return paramBoolean;
  }
  
  public final void o(double paramDouble)
  {
    GMTrace.i(1089042644992L, 8114);
    if (this.oWu != null)
    {
      this.oWu.seekTo((int)paramDouble);
      this.tHI = true;
      w.d("MicroMsg.VideoTextureView", "seek to time: " + paramDouble + " curr pos : " + this.oWu.getCurrentPosition());
    }
    GMTrace.o(1089042644992L, 8114);
  }
  
  public final void onDetach()
  {
    GMTrace.i(1088505774080L, 8110);
    GMTrace.o(1088505774080L, 8110);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(1089713733632L, 8119);
    if ((this.mVideoWidth == 0) || (this.mVideoHeight == 0))
    {
      setMeasuredDimension(1, 1);
      GMTrace.o(1089713733632L, 8119);
      return;
    }
    paramInt1 = getDefaultSize(1, paramInt1);
    paramInt2 = getDefaultSize(1, paramInt2);
    int i = this.mVideoWidth;
    int j = this.mVideoHeight;
    this.tHx.s(paramInt1, paramInt2, i, j);
    setMeasuredDimension(this.tHx.tHX, this.tHx.tHY);
    GMTrace.o(1089713733632L, 8119);
  }
  
  public final void pause()
  {
    GMTrace.i(1087700467712L, 8104);
    if ((this.oWu != null) && (this.tHH) && (this.oWu.isPlaying()))
    {
      w.d("MicroMsg.VideoTextureView", "pause video.");
      this.oWu.pause();
    }
    this.tHI = false;
    GMTrace.o(1087700467712L, 8104);
  }
  
  public final void setMute(boolean paramBoolean)
  {
    GMTrace.i(1089579515904L, 8118);
    w.i("MicroMsg.VideoTextureView", "%d set mute %b", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(paramBoolean) });
    this.jGN = paramBoolean;
    if (this.oWu != null)
    {
      if (this.jGN)
      {
        this.oWu.setVolume(0.0F, 0.0F);
        GMTrace.o(1089579515904L, 8118);
        return;
      }
      this.oWu.setVolume(1.0F, 1.0F);
    }
    GMTrace.o(1089579515904L, 8118);
  }
  
  public final void setVideoPath(String paramString)
  {
    GMTrace.i(1086895161344L, 8098);
    this.tHG = paramString;
    this.tHI = false;
    aze();
    requestLayout();
    GMTrace.o(1086895161344L, 8098);
  }
  
  public final boolean start()
  {
    GMTrace.i(1088639991808L, 8111);
    if (this.mSurface == null)
    {
      w.w("MicroMsg.VideoTextureView", "%d it surface not ready, do not start", new Object[] { Integer.valueOf(hashCode()) });
      this.tHt = true;
      this.tHI = true;
      GMTrace.o(1088639991808L, 8111);
      return false;
    }
    if (this.startTime == 0L) {}
    for (long l = bg.Pu();; l = this.startTime)
    {
      this.startTime = l;
      w.i("MicroMsg.VideoTextureView", "start %d mIsPrepared %b pauseWhenUpdated %b", new Object[] { Long.valueOf(this.startTime), Boolean.valueOf(this.tHH), Boolean.valueOf(this.tHu) });
      if ((this.oWu == null) || (!this.tHH)) {
        break;
      }
      if (this.tHu)
      {
        this.tHu = false;
        setMute(this.jGN);
      }
      this.oWu.start();
      this.tHI = true;
      GMTrace.o(1088639991808L, 8111);
      return true;
    }
    if ((this.oWu == null) && (this.tHH))
    {
      this.tHI = true;
      aze();
      requestLayout();
      GMTrace.o(1088639991808L, 8111);
      return true;
    }
    this.tHI = true;
    GMTrace.o(1088639991808L, 8111);
    return false;
  }
  
  public final void stop()
  {
    GMTrace.i(1087163596800L, 8100);
    long l1;
    long l3;
    if (this.tHQ > 0L)
    {
      l1 = this.tHQ - this.startTime;
      l3 = bg.Pu() - this.startTime;
      if (l1 <= l3) {
        break label530;
      }
    }
    label530:
    for (long l2 = l3;; l2 = l1)
    {
      int j = (int)l2 * 1000;
      int i = j;
      if (j > getDuration()) {
        i = getDuration();
      }
      w.i("MicroMsg.VideoTextureView", "stop : dur:%d stop:%d comp:%d", new Object[] { Integer.valueOf(getDuration()), Long.valueOf(l3), Long.valueOf(l1) });
      if (this.oTm != null) {
        this.oTm.bM(i, getDuration());
      }
      bNs();
      this.tHx.reset();
      try
      {
        if ((this.mSurface != null) && (this.tHH))
        {
          Object localObject1 = getSurfaceTexture();
          if (localObject1 != null)
          {
            w.i("MicroMsg.VideoTextureView", "%d releaseSurface", new Object[] { Integer.valueOf(hashCode()) });
            EGL10 localEGL10 = (EGL10)EGLContext.getEGL();
            EGLDisplay localEGLDisplay = localEGL10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            localEGL10.eglInitialize(localEGLDisplay, null);
            Object localObject2 = new EGLConfig[1];
            int[] arrayOfInt = new int[1];
            localEGL10.eglChooseConfig(localEGLDisplay, new int[] { 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344 }, (EGLConfig[])localObject2, 1, arrayOfInt);
            arrayOfInt = localObject2[0];
            localObject2 = localEGL10.eglCreateContext(localEGLDisplay, arrayOfInt, EGL10.EGL_NO_CONTEXT, new int[] { 12440, 2, 12344 });
            localObject1 = localEGL10.eglCreateWindowSurface(localEGLDisplay, arrayOfInt, localObject1, new int[] { 12344 });
            localEGL10.eglMakeCurrent(localEGLDisplay, (EGLSurface)localObject1, (EGLSurface)localObject1, (EGLContext)localObject2);
            GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
            GLES20.glClear(16384);
            localEGL10.eglSwapBuffers(localEGLDisplay, (EGLSurface)localObject1);
            localEGL10.eglDestroySurface(localEGLDisplay, (EGLSurface)localObject1);
            localEGL10.eglMakeCurrent(localEGLDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            localEGL10.eglDestroyContext(localEGLDisplay, (EGLContext)localObject2);
            localEGL10.eglTerminate(localEGLDisplay);
          }
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.VideoTextureView", localException, "release surface", new Object[0]);
        }
      }
      this.tHG = "";
      this.tHR = 0;
      this.tHH = false;
      this.tHI = false;
      this.tHm = 0L;
      GMTrace.o(1087163596800L, 8100);
      return;
      l1 = 2147483647L;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\tools\VideoTextureView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */