package com.tencent.mm.ui.video;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.b.i;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public class VideoView
  extends SurfaceView
{
  public MediaPlayer.OnCompletionListener hdP;
  public MediaPlayer.OnErrorListener hdQ;
  private int kE;
  private Context mContext;
  private int mVideoHeight;
  private int mVideoWidth;
  public MediaPlayer oWu;
  private SurfaceHolder qvM;
  public String tHG;
  public boolean tHH;
  public boolean tHI;
  MediaPlayer.OnVideoSizeChangedListener tHJ;
  MediaPlayer.OnPreparedListener tHK;
  private MediaPlayer.OnCompletionListener tHL;
  private MediaPlayer.OnErrorListener tHM;
  SurfaceHolder.Callback tHN;
  private int xmI;
  private int xmJ;
  public MediaPlayer.OnPreparedListener xmK;
  private int xmL;
  public int xmM;
  private MediaPlayer.OnBufferingUpdateListener xmN;
  
  public VideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3080431075328L, 22951);
    this.mContext = paramContext;
    ciT();
    GMTrace.o(3080431075328L, 22951);
  }
  
  public VideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3080565293056L, 22952);
    this.qvM = null;
    this.oWu = null;
    this.tHJ = new MediaPlayer.OnVideoSizeChangedListener()
    {
      public final void onVideoSizeChanged(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(3085128695808L, 22986);
        VideoView.a(VideoView.this, paramAnonymousMediaPlayer.getVideoWidth());
        VideoView.b(VideoView.this, paramAnonymousMediaPlayer.getVideoHeight());
        w.v("MicroMsg.VideoView", "on size change size:( " + VideoView.a(VideoView.this) + " , " + VideoView.b(VideoView.this) + " )");
        VideoView.this.ciS();
        GMTrace.o(3085128695808L, 22986);
      }
    };
    this.tHK = new MediaPlayer.OnPreparedListener()
    {
      public final void onPrepared(MediaPlayer paramAnonymousMediaPlayer)
      {
        GMTrace.i(3084323389440L, 22980);
        VideoView.c(VideoView.this);
        if (VideoView.d(VideoView.this) != null) {
          VideoView.d(VideoView.this).onPrepared(VideoView.e(VideoView.this));
        }
        VideoView.a(VideoView.this, paramAnonymousMediaPlayer.getVideoWidth());
        VideoView.b(VideoView.this, paramAnonymousMediaPlayer.getVideoHeight());
        VideoView.this.ciS();
        int i;
        if ((VideoView.a(VideoView.this) != 0) && (VideoView.b(VideoView.this) != 0))
        {
          if (VideoView.f(VideoView.this))
          {
            VideoView.e(VideoView.this).start();
            VideoView.g(VideoView.this);
          }
          if ((VideoView.h(VideoView.this) == VideoView.a(VideoView.this)) && (VideoView.i(VideoView.this) == VideoView.b(VideoView.this)))
          {
            if (VideoView.j(VideoView.this) != 0)
            {
              VideoView.e(VideoView.this).seekTo(VideoView.j(VideoView.this));
              VideoView.k(VideoView.this);
            }
            if ((!VideoView.f(VideoView.this)) && (!VideoView.this.isPlaying()) && (VideoView.j(VideoView.this) == 0))
            {
              paramAnonymousMediaPlayer = VideoView.this;
              if ((paramAnonymousMediaPlayer.oWu == null) || (!paramAnonymousMediaPlayer.tHH)) {
                break label276;
              }
              i = paramAnonymousMediaPlayer.oWu.getCurrentPosition();
              if (i <= 0) {}
            }
          }
        }
        for (;;)
        {
          VideoView.e(VideoView.this).isPlaying();
          GMTrace.o(3084323389440L, 22980);
          return;
          label276:
          i = 0;
          break;
          if (VideoView.j(VideoView.this) != 0)
          {
            VideoView.e(VideoView.this).seekTo(VideoView.j(VideoView.this));
            VideoView.k(VideoView.this);
          }
          if (VideoView.f(VideoView.this))
          {
            VideoView.e(VideoView.this).start();
            VideoView.g(VideoView.this);
          }
        }
      }
    };
    this.tHL = new MediaPlayer.OnCompletionListener()
    {
      public final void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
      {
        GMTrace.i(3085934002176L, 22992);
        if (VideoView.l(VideoView.this) != null) {
          VideoView.l(VideoView.this).onCompletion(VideoView.e(VideoView.this));
        }
        GMTrace.o(3085934002176L, 22992);
      }
    };
    this.tHM = new MediaPlayer.OnErrorListener()
    {
      public final boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(3085397131264L, 22988);
        w.d("MicroMsg.VideoView", "Error: " + paramAnonymousInt1 + "," + paramAnonymousInt2);
        if ((VideoView.m(VideoView.this) != null) && (VideoView.m(VideoView.this).onError(VideoView.e(VideoView.this), paramAnonymousInt1, paramAnonymousInt2)))
        {
          GMTrace.o(3085397131264L, 22988);
          return true;
        }
        VideoView.this.getWindowToken();
        GMTrace.o(3085397131264L, 22988);
        return true;
      }
    };
    this.xmN = new MediaPlayer.OnBufferingUpdateListener()
    {
      public final void onBufferingUpdate(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt)
      {
        GMTrace.i(3085665566720L, 22990);
        VideoView.c(VideoView.this, paramAnonymousInt);
        GMTrace.o(3085665566720L, 22990);
      }
    };
    this.tHN = new SurfaceHolder.Callback()
    {
      public final void surfaceChanged(SurfaceHolder paramAnonymousSurfaceHolder, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(3084591824896L, 22982);
        VideoView.d(VideoView.this, paramAnonymousInt2);
        VideoView.e(VideoView.this, paramAnonymousInt3);
        if ((VideoView.e(VideoView.this) != null) && (VideoView.n(VideoView.this)) && (VideoView.a(VideoView.this) == paramAnonymousInt2) && (VideoView.b(VideoView.this) == paramAnonymousInt3))
        {
          if (VideoView.j(VideoView.this) != 0)
          {
            VideoView.e(VideoView.this).seekTo(VideoView.j(VideoView.this));
            VideoView.k(VideoView.this);
          }
          VideoView.e(VideoView.this).start();
        }
        GMTrace.o(3084591824896L, 22982);
      }
      
      public final void surfaceCreated(SurfaceHolder paramAnonymousSurfaceHolder)
      {
        GMTrace.i(3084726042624L, 22983);
        VideoView.a(VideoView.this, paramAnonymousSurfaceHolder);
        VideoView.o(VideoView.this);
        GMTrace.o(3084726042624L, 22983);
      }
      
      public final void surfaceDestroyed(SurfaceHolder paramAnonymousSurfaceHolder)
      {
        GMTrace.i(3084860260352L, 22984);
        VideoView.a(VideoView.this, null);
        if (VideoView.e(VideoView.this) != null)
        {
          VideoView.e(VideoView.this).reset();
          VideoView.e(VideoView.this).release();
          VideoView.p(VideoView.this);
        }
        GMTrace.o(3084860260352L, 22984);
      }
    };
    this.mContext = paramContext;
    ciT();
    GMTrace.o(3080565293056L, 22952);
  }
  
  private void ciT()
  {
    GMTrace.i(3080699510784L, 22953);
    this.mVideoWidth = 0;
    this.mVideoHeight = 0;
    getHolder().addCallback(this.tHN);
    getHolder().setType(3);
    setFocusable(true);
    setFocusableInTouchMode(true);
    requestFocus();
    GMTrace.o(3080699510784L, 22953);
  }
  
  public final void aze()
  {
    GMTrace.i(3080967946240L, 22955);
    if ((this.tHG == null) || (this.qvM == null))
    {
      GMTrace.o(3080967946240L, 22955);
      return;
    }
    Intent localIntent = new Intent("com.android.music.musicservicecommand");
    localIntent.putExtra("command", "pause");
    this.mContext.sendBroadcast(localIntent);
    if (this.oWu != null)
    {
      this.oWu.reset();
      this.oWu.release();
      this.oWu = null;
    }
    try
    {
      this.oWu = new i();
      this.oWu.setOnPreparedListener(this.tHK);
      this.oWu.setOnVideoSizeChangedListener(this.tHJ);
      this.tHH = false;
      w.v("MicroMsg.VideoView", "reset duration to -1 in openVideo");
      this.kE = -1;
      this.oWu.setOnCompletionListener(this.tHL);
      this.oWu.setOnErrorListener(this.tHM);
      this.oWu.setOnBufferingUpdateListener(this.xmN);
      this.xmL = 0;
      this.oWu.setDataSource(this.tHG);
      this.oWu.setDisplay(this.qvM);
      this.oWu.setAudioStreamType(3);
      this.oWu.setScreenOnWhilePlaying(true);
      this.oWu.prepareAsync();
      this.mVideoHeight = this.oWu.getVideoHeight();
      this.mVideoWidth = this.oWu.getVideoWidth();
      GMTrace.o(3080967946240L, 22955);
      return;
    }
    catch (IOException localIOException)
    {
      GMTrace.o(3080967946240L, 22955);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      GMTrace.o(3080967946240L, 22955);
    }
  }
  
  public final void ciS()
  {
    GMTrace.i(3080296857600L, 22950);
    if ((this.mVideoHeight == 0) || (this.mVideoWidth == 0))
    {
      GMTrace.o(3080296857600L, 22950);
      return;
    }
    int k = this.mVideoWidth;
    int m = this.mVideoHeight;
    w.v("MicroMsg.VideoView", "video size before:" + k + "   " + m);
    w.v("MicroMsg.VideoView", "layout size before:" + getWidth() + "   " + getHeight());
    int i = getWidth();
    int j = getHeight();
    if (i <= 0) {
      i = k;
    }
    for (;;)
    {
      if (j <= 0) {
        j = m;
      }
      for (;;)
      {
        float f1 = i * 1.0F / k;
        float f2 = j * 1.0F / m;
        RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)getLayoutParams();
        if (f1 > f2) {
          localLayoutParams.width = ((int)(k * f2));
        }
        for (localLayoutParams.height = j;; localLayoutParams.height = ((int)(m * f1)))
        {
          localLayoutParams.addRule(13);
          setLayoutParams(localLayoutParams);
          invalidate();
          w.v("MicroMsg.VideoView", "video size after:" + this.oWu.getVideoWidth() + "   " + this.oWu.getVideoHeight());
          w.v("MicroMsg.VideoView", "layout size after:" + localLayoutParams.width + "   " + localLayoutParams.height);
          GMTrace.o(3080296857600L, 22950);
          return;
          localLayoutParams.width = i;
        }
      }
    }
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(3081102163968L, 22956);
    if ((this.oWu != null) && (this.tHH))
    {
      boolean bool = this.oWu.isPlaying();
      GMTrace.o(3081102163968L, 22956);
      return bool;
    }
    GMTrace.o(3081102163968L, 22956);
    return false;
  }
  
  public final void stopPlayback()
  {
    GMTrace.i(3080833728512L, 22954);
    if (this.oWu != null)
    {
      this.oWu.stop();
      this.oWu.release();
      this.oWu = null;
    }
    GMTrace.o(3080833728512L, 22954);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\video\VideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */