package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.util.AttributeSet;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.j;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.plugin.sight.decode.a.b.e;
import com.tencent.mm.plugin.sight.decode.a.b.f;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class VideoSightCenterView
  extends VideoSightView
{
  private boolean isStart;
  private int pHC;
  private MediaMetadataRetriever tHA;
  private volatile boolean tHz;
  
  public VideoSightCenterView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1063541276672L, 7924);
    this.tHz = false;
    this.pHC = 0;
    this.isStart = false;
    GMTrace.o(1063541276672L, 7924);
  }
  
  public VideoSightCenterView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1063407058944L, 7923);
    this.tHz = false;
    this.pHC = 0;
    this.isStart = false;
    GMTrace.o(1063407058944L, 7923);
  }
  
  private void bNr()
  {
    GMTrace.i(1063943929856L, 7927);
    if ((getLayoutParams() instanceof RelativeLayout.LayoutParams))
    {
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)getLayoutParams();
      localLayoutParams.addRule(13);
      setLayoutParams(localLayoutParams);
    }
    GMTrace.o(1063943929856L, 7927);
  }
  
  public final double bgO()
  {
    GMTrace.i(1065017671680L, 7935);
    double d = super.bgO();
    GMTrace.o(1065017671680L, 7935);
    return d;
  }
  
  public final void cV(int paramInt1, int paramInt2)
  {
    GMTrace.i(1063809712128L, 7926);
    super.cV(paramInt1, paramInt2);
    bNr();
    GMTrace.o(1063809712128L, 7926);
  }
  
  public final int getCurrentPosition()
  {
    GMTrace.i(1064480800768L, 7931);
    w.v("MicroMsg.VideoSightCenterView", "getCurrentPosition: %s", new Object[] { Integer.valueOf(this.pHC) });
    int i = this.pHC;
    GMTrace.o(1064480800768L, 7931);
    return i;
  }
  
  public final int getDuration()
  {
    GMTrace.i(1064346583040L, 7930);
    w.i("MicroMsg.VideoSightCenterView", "getDuration");
    if (!bg.nm(this.oRS)) {
      try
      {
        if (this.tHA == null)
        {
          this.tHA = new MediaMetadataRetriever();
          this.tHA.setDataSource(this.oRS);
        }
        i = Integer.valueOf(this.tHA.extractMetadata(9)).intValue();
        w.i("MicroMsg.VideoSightCenterView", "getDuration: %s", new Object[] { Integer.valueOf(i) });
        GMTrace.o(1064346583040L, 7930);
        return i;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.VideoSightCenterView", "getDuration error: %s", new Object[] { localException.getMessage() });
      }
    }
    int i = super.getDuration();
    GMTrace.o(1064346583040L, 7930);
    return i;
  }
  
  public final void hw(boolean paramBoolean)
  {
    GMTrace.i(1064212365312L, 7929);
    if (paramBoolean)
    {
      a(new b.f()
      {
        public final void a(b paramAnonymousb, long paramAnonymousLong)
        {
          GMTrace.i(1133468712960L, 8445);
          if (VideoSightCenterView.this.duration == 0) {
            VideoSightCenterView.this.duration = VideoSightCenterView.this.getDuration();
          }
          if (VideoSightCenterView.this.oTm != null)
          {
            w.v("MicroMsg.VideoSightCenterView", "onPlayTime, currentTime: %s, duration: %s", new Object[] { Long.valueOf(paramAnonymousLong), Integer.valueOf(VideoSightCenterView.this.duration) });
            VideoSightCenterView.a(VideoSightCenterView.this, (int)(1000L * paramAnonymousLong));
            VideoSightCenterView.this.oTm.bM((int)paramAnonymousLong, VideoSightCenterView.this.duration);
          }
          GMTrace.o(1133468712960L, 8445);
        }
      });
      GMTrace.o(1064212365312L, 7929);
      return;
    }
    a(null);
    GMTrace.o(1064212365312L, 7929);
  }
  
  protected final void init()
  {
    GMTrace.i(1064078147584L, 7928);
    if (bg.aq(p.fQL.fQd, "").equals("other")) {
      w.i("MicroMsg.VideoSightCenterView", "init::use other player");
    }
    for (;;)
    {
      a(new b.e()
      {
        public final void a(b paramAnonymousb, int paramAnonymousInt)
        {
          GMTrace.i(1067165155328L, 7951);
          if (-1 == paramAnonymousInt)
          {
            w.i("MicroMsg.VideoSightCenterView", "error stop, isCompletion: %s", new Object[] { Boolean.valueOf(VideoSightCenterView.a(VideoSightCenterView.this)) });
            if ((VideoSightCenterView.this.oTm != null) && (!VideoSightCenterView.a(VideoSightCenterView.this)))
            {
              VideoSightCenterView.this.oTm.onError(0, 0);
              GMTrace.o(1067165155328L, 7951);
            }
          }
          else if (paramAnonymousInt == 0)
          {
            w.i("MicroMsg.VideoSightCenterView", "normal stop");
            VideoSightCenterView.b(VideoSightCenterView.this);
            if (VideoSightCenterView.this.oTm != null) {
              VideoSightCenterView.this.oTm.onCompletion();
            }
          }
          GMTrace.o(1067165155328L, 7951);
        }
      });
      GMTrace.o(1064078147584L, 7928);
      return;
      ht(true);
    }
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(1065286107136L, 7937);
    w.v("MicroMsg.VideoSightCenterView", "isPlaying, isStart: %s, currentPosition: %s", new Object[] { Boolean.valueOf(this.isStart), Integer.valueOf(this.pHC) });
    boolean bool = this.isStart;
    GMTrace.o(1065286107136L, 7937);
    return bool;
  }
  
  public final void o(double paramDouble)
  {
    GMTrace.i(1065151889408L, 7936);
    w.v("MicroMsg.VideoSightCenterView", "seekTo, time: %s, isStart: %s, currentPosition: %s, getLastProgresstime: %s", new Object[] { Double.valueOf(paramDouble), Boolean.valueOf(this.isStart), Integer.valueOf(this.pHC), Double.valueOf(super.bgO()) });
    if ((this.isStart) && (super.bgO() > 0.0D)) {
      super.o(paramDouble / 1000.0D);
    }
    GMTrace.o(1065151889408L, 7936);
  }
  
  public final void pause()
  {
    GMTrace.i(1064883453952L, 7934);
    w.v("MicroMsg.VideoSightCenterView", "pause");
    super.pause();
    GMTrace.o(1064883453952L, 7934);
  }
  
  public final boolean start()
  {
    GMTrace.i(1064615018496L, 7932);
    w.v("MicroMsg.VideoSightCenterView", "start");
    this.isStart = true;
    boolean bool = super.start();
    GMTrace.o(1064615018496L, 7932);
    return bool;
  }
  
  public final void stop()
  {
    GMTrace.i(1064749236224L, 7933);
    w.v("MicroMsg.VideoSightCenterView", "stop");
    super.stop();
    this.pHC = 0;
    this.isStart = false;
    GMTrace.o(1064749236224L, 7933);
  }
  
  public final void tW(int paramInt)
  {
    GMTrace.i(1063675494400L, 7925);
    super.tW(paramInt);
    bNr();
    GMTrace.o(1063675494400L, 7925);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\tools\VideoSightCenterView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */