package com.tencent.mm.plugin.sysvideo.ui.video;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Bundle;
import android.os.Message;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ad;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.video.VideoView;

public class VideoRecorderPreviewUI
  extends MMActivity
{
  private long duration;
  private VideoView qvG;
  private String qvH;
  private final int qvI;
  private ae qvJ;
  
  public VideoRecorderPreviewUI()
  {
    GMTrace.i(11883234983936L, 88537);
    this.qvH = null;
    this.duration = -1L;
    this.qvI = 3000;
    this.qvJ = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(11882563895296L, 88532);
        VideoRecorderPreviewUI.this.getWindow().setFlags(1024, 1024);
        VideoRecorderPreviewUI.this.vKB.bXF();
        GMTrace.o(11882563895296L, 88532);
      }
    };
    GMTrace.o(11883234983936L, 88537);
  }
  
  protected final void MP()
  {
    GMTrace.i(11883637637120L, 88540);
    this.qvG = ((VideoView)findViewById(R.h.ckz));
    this.qvG.hdQ = new MediaPlayer.OnErrorListener()
    {
      public final boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(11886456209408L, 88561);
        VideoRecorderPreviewUI.a(VideoRecorderPreviewUI.this).stopPlayback();
        h.h(VideoRecorderPreviewUI.this, R.l.egA, R.l.egy);
        GMTrace.o(11886456209408L, 88561);
        return false;
      }
    };
    this.qvG.xmK = new MediaPlayer.OnPreparedListener()
    {
      public final void onPrepared(MediaPlayer paramAnonymousMediaPlayer)
      {
        GMTrace.i(11894643490816L, 88622);
        w.d("MicroMsg.VideoRecorderPreviewUI", g.tB() + " onPrepared");
        w.d("MicroMsg.VideoRecorderPreviewUI", g.tB() + " onPrepared");
        paramAnonymousMediaPlayer = VideoRecorderPreviewUI.a(VideoRecorderPreviewUI.this);
        if ((paramAnonymousMediaPlayer.oWu != null) && (paramAnonymousMediaPlayer.tHH)) {
          paramAnonymousMediaPlayer.oWu.start();
        }
        for (paramAnonymousMediaPlayer.tHI = false;; paramAnonymousMediaPlayer.tHI = true)
        {
          VideoRecorderPreviewUI.b(VideoRecorderPreviewUI.this).sendEmptyMessageDelayed(0, 3000L);
          GMTrace.o(11894643490816L, 88622);
          return;
        }
      }
    };
    findViewById(R.h.cky).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11885650903040L, 88555);
        VideoRecorderPreviewUI.b(VideoRecorderPreviewUI.this).removeMessages(0);
        if (VideoRecorderPreviewUI.this.bXv())
        {
          VideoRecorderPreviewUI.this.getWindow().setFlags(1024, 1024);
          VideoRecorderPreviewUI.this.vKB.bXF();
          GMTrace.o(11885650903040L, 88555);
          return;
        }
        VideoRecorderPreviewUI.this.getWindow().clearFlags(1024);
        VideoRecorderPreviewUI.this.bXu();
        VideoRecorderPreviewUI.b(VideoRecorderPreviewUI.this).removeMessages(0);
        VideoRecorderPreviewUI.b(VideoRecorderPreviewUI.this).sendEmptyMessageDelayed(0, 3000L);
        GMTrace.o(11885650903040L, 88555);
      }
    });
    this.qvG.hdP = new MediaPlayer.OnCompletionListener()
    {
      public final void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
      {
        GMTrace.i(11882295459840L, 88530);
        VideoRecorderPreviewUI.this.finish();
        VideoRecorderPreviewUI.this.overridePendingTransition(0, 0);
        GMTrace.o(11882295459840L, 88530);
      }
    };
    if (this.qvH != null)
    {
      this.qvG.stopPlayback();
      VideoView localVideoView = this.qvG;
      localVideoView.tHG = this.qvH;
      localVideoView.tHI = false;
      localVideoView.xmM = 0;
      localVideoView.aze();
      localVideoView.requestLayout();
      localVideoView.invalidate();
    }
    GMTrace.o(11883637637120L, 88540);
  }
  
  protected final void bH(View paramView)
  {
    GMTrace.i(11883906072576L, 88542);
    ad.d(ad.a(getWindow(), null), this.vKB.vKI);
    ((ViewGroup)this.vKB.vKI.getParent()).removeView(this.vKB.vKI);
    ((ViewGroup)getWindow().getDecorView()).addView(this.vKB.vKI, 0);
    GMTrace.o(11883906072576L, 88542);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11884040290304L, 88543);
    int i = R.i.cHp;
    GMTrace.o(11884040290304L, 88543);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11883369201664L, 88538);
    super.onCreate(paramBundle);
    getWindow().setFlags(1024, 1024);
    this.vKB.bXF();
    this.qvH = getIntent().getStringExtra("VideoRecorder_VideoFullPath");
    oM(R.l.egB);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11885114032128L, 88551);
        VideoRecorderPreviewUI.this.finish();
        VideoRecorderPreviewUI.this.overridePendingTransition(0, 0);
        GMTrace.o(11885114032128L, 88551);
        return true;
      }
    });
    MP();
    GMTrace.o(11883369201664L, 88538);
  }
  
  protected void onPause()
  {
    GMTrace.i(11883771854848L, 88541);
    super.onPause();
    if (this.qvG.isPlaying())
    {
      VideoView localVideoView = this.qvG;
      if ((localVideoView.oWu != null) && (localVideoView.tHH) && (localVideoView.oWu.isPlaying())) {
        localVideoView.oWu.pause();
      }
      localVideoView.tHI = false;
    }
    finish();
    overridePendingTransition(0, 0);
    this.qvJ.removeMessages(0);
    GMTrace.o(11883771854848L, 88541);
  }
  
  public void onStart()
  {
    GMTrace.i(11883503419392L, 88539);
    super.onStart();
    GMTrace.o(11883503419392L, 88539);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sysvideo\ui\video\VideoRecorderPreviewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */