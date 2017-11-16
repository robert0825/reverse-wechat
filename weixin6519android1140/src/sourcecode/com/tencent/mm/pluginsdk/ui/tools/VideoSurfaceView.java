package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.b.i;
import com.tencent.mm.sdk.platformtools.w;

public class VideoSurfaceView
  extends SurfaceView
  implements f
{
  private boolean jGN;
  private int kE;
  private int mVideoHeight;
  private int mVideoWidth;
  private f.a oTm;
  private MediaPlayer oWu;
  private SurfaceHolder qvM;
  private String tHG;
  private boolean tHH;
  private boolean tHI;
  MediaPlayer.OnVideoSizeChangedListener tHJ;
  MediaPlayer.OnPreparedListener tHK;
  private MediaPlayer.OnCompletionListener tHL;
  private MediaPlayer.OnErrorListener tHM;
  SurfaceHolder.Callback tHN;
  
  public VideoSurfaceView(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(1068641550336L, 7962);
    GMTrace.o(1068641550336L, 7962);
  }
  
  public VideoSurfaceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(1068775768064L, 7963);
    GMTrace.o(1068775768064L, 7963);
  }
  
  public VideoSurfaceView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1068909985792L, 7964);
    this.qvM = null;
    this.oWu = null;
    this.tHJ = new MediaPlayer.OnVideoSizeChangedListener()
    {
      public final void onVideoSizeChanged(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(1060588486656L, 7902);
        VideoSurfaceView.a(VideoSurfaceView.this, paramAnonymousMediaPlayer.getVideoWidth());
        VideoSurfaceView.b(VideoSurfaceView.this, paramAnonymousMediaPlayer.getVideoHeight());
        w.v("MicroMsg.VideoSurfaceView", "on size change size:( " + VideoSurfaceView.a(VideoSurfaceView.this) + " , " + VideoSurfaceView.b(VideoSurfaceView.this) + " )");
        VideoSurfaceView.c(VideoSurfaceView.this);
        GMTrace.o(1060588486656L, 7902);
      }
    };
    this.tHK = new MediaPlayer.OnPreparedListener()
    {
      public final void onPrepared(MediaPlayer paramAnonymousMediaPlayer)
      {
        GMTrace.i(1108906868736L, 8262);
        VideoSurfaceView.d(VideoSurfaceView.this);
        if (VideoSurfaceView.e(VideoSurfaceView.this) != null) {
          VideoSurfaceView.e(VideoSurfaceView.this).Xq();
        }
        VideoSurfaceView.a(VideoSurfaceView.this, paramAnonymousMediaPlayer.getVideoWidth());
        VideoSurfaceView.b(VideoSurfaceView.this, paramAnonymousMediaPlayer.getVideoHeight());
        VideoSurfaceView.c(VideoSurfaceView.this);
        if ((VideoSurfaceView.a(VideoSurfaceView.this) != 0) && (VideoSurfaceView.b(VideoSurfaceView.this) != 0))
        {
          if (VideoSurfaceView.f(VideoSurfaceView.this))
          {
            VideoSurfaceView.g(VideoSurfaceView.this).start();
            VideoSurfaceView.h(VideoSurfaceView.this);
            GMTrace.o(1108906868736L, 8262);
          }
        }
        else if (VideoSurfaceView.f(VideoSurfaceView.this))
        {
          VideoSurfaceView.g(VideoSurfaceView.this).start();
          VideoSurfaceView.h(VideoSurfaceView.this);
        }
        GMTrace.o(1108906868736L, 8262);
      }
    };
    this.tHL = new MediaPlayer.OnCompletionListener()
    {
      public final void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
      {
        GMTrace.i(1131589664768L, 8431);
        if (VideoSurfaceView.e(VideoSurfaceView.this) != null)
        {
          VideoSurfaceView.e(VideoSurfaceView.this).bM(VideoSurfaceView.g(VideoSurfaceView.this).getCurrentPosition(), VideoSurfaceView.g(VideoSurfaceView.this).getDuration());
          VideoSurfaceView.e(VideoSurfaceView.this).onCompletion();
        }
        GMTrace.o(1131589664768L, 8431);
      }
    };
    this.tHM = new MediaPlayer.OnErrorListener()
    {
      public final boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(1062735970304L, 7918);
        w.d("MicroMsg.VideoSurfaceView", "Error: " + paramAnonymousInt1 + "," + paramAnonymousInt2);
        if (VideoSurfaceView.e(VideoSurfaceView.this) != null) {
          VideoSurfaceView.e(VideoSurfaceView.this).onError(paramAnonymousInt1, paramAnonymousInt2);
        }
        GMTrace.o(1062735970304L, 7918);
        return true;
      }
    };
    this.tHN = new SurfaceHolder.Callback()
    {
      public final void surfaceChanged(SurfaceHolder paramAnonymousSurfaceHolder, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(1108369997824L, 8258);
        w.i("MicroMsg.VideoSurfaceView", "on surface changed %d*%d", new Object[] { Integer.valueOf(paramAnonymousInt2), Integer.valueOf(paramAnonymousInt3) });
        if ((VideoSurfaceView.g(VideoSurfaceView.this) != null) && (VideoSurfaceView.i(VideoSurfaceView.this)) && (VideoSurfaceView.a(VideoSurfaceView.this) == paramAnonymousInt2) && (VideoSurfaceView.b(VideoSurfaceView.this) == paramAnonymousInt3)) {
          VideoSurfaceView.g(VideoSurfaceView.this).start();
        }
        GMTrace.o(1108369997824L, 8258);
      }
      
      public final void surfaceCreated(SurfaceHolder paramAnonymousSurfaceHolder)
      {
        GMTrace.i(1108504215552L, 8259);
        w.i("MicroMsg.VideoSurfaceView", "on surface created");
        VideoSurfaceView.a(VideoSurfaceView.this, paramAnonymousSurfaceHolder);
        VideoSurfaceView.j(VideoSurfaceView.this);
        GMTrace.o(1108504215552L, 8259);
      }
      
      public final void surfaceDestroyed(SurfaceHolder paramAnonymousSurfaceHolder)
      {
        GMTrace.i(1108638433280L, 8260);
        w.i("MicroMsg.VideoSurfaceView", "on surface destroyed");
        VideoSurfaceView.a(VideoSurfaceView.this, null);
        if (VideoSurfaceView.g(VideoSurfaceView.this) != null)
        {
          VideoSurfaceView.e(VideoSurfaceView.this).bM(VideoSurfaceView.g(VideoSurfaceView.this).getCurrentPosition(), VideoSurfaceView.g(VideoSurfaceView.this).getDuration());
          VideoSurfaceView.g(VideoSurfaceView.this).reset();
          VideoSurfaceView.g(VideoSurfaceView.this).release();
          VideoSurfaceView.k(VideoSurfaceView.this);
        }
        GMTrace.o(1108638433280L, 8260);
      }
    };
    this.jGN = false;
    this.mVideoWidth = 0;
    this.mVideoHeight = 0;
    getHolder().addCallback(this.tHN);
    getHolder().setType(3);
    setFocusable(true);
    setFocusableInTouchMode(true);
    requestFocus();
    GMTrace.o(1068909985792L, 7964);
  }
  
  private void aze()
  {
    GMTrace.i(1069446856704L, 7968);
    if ((this.tHG == null) || (this.qvM == null))
    {
      GMTrace.o(1069446856704L, 7968);
      return;
    }
    if (this.oWu != null)
    {
      this.oWu.stop();
      this.oWu.release();
      this.oWu = null;
    }
    try
    {
      this.oWu = new i();
      this.oWu.setOnPreparedListener(this.tHK);
      this.oWu.setOnVideoSizeChangedListener(this.tHJ);
      this.tHH = false;
      w.v("MicroMsg.VideoSurfaceView", "reset duration to -1 in openVideo");
      this.kE = -1;
      this.oWu.setOnCompletionListener(this.tHL);
      this.oWu.setOnErrorListener(this.tHM);
      this.oWu.setDataSource(this.tHG);
      this.oWu.setDisplay(this.qvM);
      this.oWu.setAudioStreamType(3);
      this.oWu.setScreenOnWhilePlaying(true);
      this.oWu.prepareAsync();
      this.mVideoHeight = this.oWu.getVideoHeight();
      this.mVideoWidth = this.oWu.getVideoWidth();
      setMute(this.jGN);
      GMTrace.o(1069446856704L, 7968);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.VideoSurfaceView", localException, "prepare async error %s", new Object[] { localException.getMessage() });
      if (this.oTm != null) {
        this.oTm.onError(-1, -1);
      }
      GMTrace.o(1069446856704L, 7968);
    }
  }
  
  public final String NE()
  {
    GMTrace.i(1069178421248L, 7966);
    String str = this.tHG;
    GMTrace.o(1069178421248L, 7966);
    return str;
  }
  
  public final void a(f.a parama)
  {
    GMTrace.i(1070252163072L, 7974);
    this.oTm = parama;
    GMTrace.o(1070252163072L, 7974);
  }
  
  public final void a(f.b paramb)
  {
    GMTrace.i(16381542137856L, 122052);
    GMTrace.o(16381542137856L, 122052);
  }
  
  public final void a(f.c paramc)
  {
    GMTrace.i(16381407920128L, 122051);
    GMTrace.o(16381407920128L, 122051);
  }
  
  public final void a(f.d paramd)
  {
    GMTrace.i(17440251576320L, 129940);
    GMTrace.o(17440251576320L, 129940);
  }
  
  public final void a(f.e parame)
  {
    GMTrace.i(1071594340352L, 7984);
    GMTrace.o(1071594340352L, 7984);
  }
  
  public final double bgO()
  {
    GMTrace.i(1070789033984L, 7978);
    GMTrace.o(1070789033984L, 7978);
    return 0.0D;
  }
  
  public final long bgP()
  {
    GMTrace.i(1071191687168L, 7981);
    GMTrace.o(1071191687168L, 7981);
    return 0L;
  }
  
  public final void c(double paramDouble, boolean paramBoolean)
  {
    GMTrace.i(1071460122624L, 7983);
    o(paramDouble);
    GMTrace.o(1071460122624L, 7983);
  }
  
  public final void ci(boolean paramBoolean)
  {
    GMTrace.i(1070117945344L, 7973);
    if (this.oWu != null) {
      this.oWu.setLooping(paramBoolean);
    }
    GMTrace.o(1070117945344L, 7973);
  }
  
  public final int getCurrentPosition()
  {
    GMTrace.i(1069849509888L, 7971);
    if ((this.oWu != null) && (this.tHH))
    {
      int i = this.oWu.getCurrentPosition();
      GMTrace.o(1069849509888L, 7971);
      return i;
    }
    GMTrace.o(1069849509888L, 7971);
    return 0;
  }
  
  public final int getDuration()
  {
    GMTrace.i(1069715292160L, 7970);
    if ((this.oWu != null) && (this.tHH))
    {
      if (this.kE > 0)
      {
        i = this.kE;
        GMTrace.o(1069715292160L, 7970);
        return i;
      }
      this.kE = this.oWu.getDuration();
      i = this.kE;
      GMTrace.o(1069715292160L, 7970);
      return i;
    }
    this.kE = -1;
    int i = this.kE;
    GMTrace.o(1069715292160L, 7970);
    return i;
  }
  
  public final void hw(boolean paramBoolean)
  {
    GMTrace.i(1071057469440L, 7980);
    GMTrace.o(1071057469440L, 7980);
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(1069983727616L, 7972);
    if ((this.oWu != null) && (this.tHH))
    {
      boolean bool = this.oWu.isPlaying();
      GMTrace.o(1069983727616L, 7972);
      return bool;
    }
    GMTrace.o(1069983727616L, 7972);
    return false;
  }
  
  public final boolean j(Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(1070654816256L, 7977);
    paramBoolean = start();
    GMTrace.o(1070654816256L, 7977);
    return paramBoolean;
  }
  
  public final void o(double paramDouble)
  {
    GMTrace.i(1070923251712L, 7979);
    if (this.oWu != null)
    {
      w.d("MicroMsg.VideoSurfaceView", "seek to time: " + paramDouble);
      this.oWu.seekTo((int)paramDouble);
      start();
    }
    GMTrace.o(1070923251712L, 7979);
  }
  
  public final void onDetach()
  {
    GMTrace.i(1070386380800L, 7975);
    GMTrace.o(1070386380800L, 7975);
  }
  
  public final void pause()
  {
    GMTrace.i(1069581074432L, 7969);
    if ((this.oWu != null) && (this.tHH) && (this.oWu.isPlaying())) {
      this.oWu.pause();
    }
    this.tHI = false;
    GMTrace.o(1069581074432L, 7969);
  }
  
  public final void setMute(boolean paramBoolean)
  {
    GMTrace.i(1071325904896L, 7982);
    this.jGN = paramBoolean;
    if (this.oWu != null)
    {
      if (this.jGN)
      {
        this.oWu.setVolume(0.0F, 0.0F);
        GMTrace.o(1071325904896L, 7982);
        return;
      }
      this.oWu.setVolume(0.5F, 0.5F);
    }
    GMTrace.o(1071325904896L, 7982);
  }
  
  public final void setVideoPath(String paramString)
  {
    GMTrace.i(1069044203520L, 7965);
    this.tHG = paramString;
    this.tHI = false;
    aze();
    requestLayout();
    GMTrace.o(1069044203520L, 7965);
  }
  
  public final boolean start()
  {
    GMTrace.i(1070520598528L, 7976);
    if ((this.oWu != null) && (this.tHH)) {
      this.oWu.start();
    }
    for (this.tHI = false;; this.tHI = true)
    {
      GMTrace.o(1070520598528L, 7976);
      return true;
    }
  }
  
  public final void stop()
  {
    GMTrace.i(1069312638976L, 7967);
    if (this.oWu != null)
    {
      this.oWu.stop();
      this.oWu.release();
      this.oWu = null;
    }
    GMTrace.o(1069312638976L, 7967);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\tools\VideoSurfaceView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */