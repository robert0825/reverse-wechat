package com.tencent.mm.plugin.mmsight.segment.a;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.view.Surface;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.b.i;

public final class d
  implements a
{
  private MediaPlayer hey;
  
  public d()
  {
    GMTrace.i(7455392137216L, 55547);
    this.hey = new i();
    GMTrace.o(7455392137216L, 55547);
  }
  
  public final void a(final a.a parama)
  {
    GMTrace.i(7457808056320L, 55565);
    if (parama == null)
    {
      this.hey.setOnErrorListener(null);
      GMTrace.o(7457808056320L, 55565);
      return;
    }
    this.hey.setOnErrorListener(new MediaPlayer.OnErrorListener()
    {
      public final boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(7455123701760L, 55545);
        boolean bool = parama.cv(paramAnonymousInt1, paramAnonymousInt2);
        GMTrace.o(7455123701760L, 55545);
        return bool;
      }
    });
    GMTrace.o(7457808056320L, 55565);
  }
  
  public final void a(final a.b paramb)
  {
    GMTrace.i(7457405403136L, 55562);
    if (paramb == null)
    {
      this.hey.setOnPreparedListener(null);
      GMTrace.o(7457405403136L, 55562);
      return;
    }
    this.hey.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
    {
      public final void onPrepared(MediaPlayer paramAnonymousMediaPlayer)
      {
        GMTrace.i(7467203297280L, 55635);
        paramb.bf(paramAnonymousMediaPlayer);
        GMTrace.o(7467203297280L, 55635);
      }
    });
    GMTrace.o(7457405403136L, 55562);
  }
  
  public final void a(final a.c paramc)
  {
    GMTrace.i(7457539620864L, 55563);
    if (paramc == null)
    {
      this.hey.setOnSeekCompleteListener(null);
      GMTrace.o(7457539620864L, 55563);
      return;
    }
    this.hey.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener()
    {
      public final void onSeekComplete(MediaPlayer paramAnonymousMediaPlayer)
      {
        GMTrace.i(7458076491776L, 55567);
        paramc.bg(paramAnonymousMediaPlayer);
        GMTrace.o(7458076491776L, 55567);
      }
    });
    GMTrace.o(7457539620864L, 55563);
  }
  
  public final void a(final a.d paramd)
  {
    GMTrace.i(7457673838592L, 55564);
    if (paramd == null)
    {
      this.hey.setOnVideoSizeChangedListener(null);
      GMTrace.o(7457673838592L, 55564);
      return;
    }
    this.hey.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener()
    {
      public final void onVideoSizeChanged(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(7466263773184L, 55628);
        paramd.H(paramAnonymousInt1, paramAnonymousInt2, 0);
        GMTrace.o(7466263773184L, 55628);
      }
    });
    GMTrace.o(7457673838592L, 55564);
  }
  
  public final int getCurrentPosition()
  {
    GMTrace.i(7456600096768L, 55556);
    int i = this.hey.getCurrentPosition();
    GMTrace.o(7456600096768L, 55556);
    return i;
  }
  
  public final int getDuration()
  {
    GMTrace.i(7456734314496L, 55557);
    int i = this.hey.getDuration();
    GMTrace.o(7456734314496L, 55557);
    return i;
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(7456331661312L, 55554);
    boolean bool = this.hey.isPlaying();
    GMTrace.o(7456331661312L, 55554);
    return bool;
  }
  
  public final void pause()
  {
    GMTrace.i(7456197443584L, 55553);
    this.hey.pause();
    GMTrace.o(7456197443584L, 55553);
  }
  
  public final void prepareAsync()
  {
    GMTrace.i(7455794790400L, 55550);
    this.hey.prepareAsync();
    GMTrace.o(7455794790400L, 55550);
  }
  
  public final void release()
  {
    GMTrace.i(7456868532224L, 55558);
    this.hey.release();
    GMTrace.o(7456868532224L, 55558);
  }
  
  public final void seekTo(int paramInt)
  {
    GMTrace.i(7456465879040L, 55555);
    this.hey.seekTo(paramInt);
    GMTrace.o(7456465879040L, 55555);
  }
  
  public final void setAudioStreamType(int paramInt)
  {
    GMTrace.i(7457002749952L, 55559);
    this.hey.setAudioStreamType(paramInt);
    GMTrace.o(7457002749952L, 55559);
  }
  
  public final void setDataSource(String paramString)
  {
    GMTrace.i(7455660572672L, 55549);
    this.hey.setDataSource(paramString);
    GMTrace.o(7455660572672L, 55549);
  }
  
  public final void setLoop(int paramInt1, int paramInt2)
  {
    GMTrace.i(7457271185408L, 55561);
    GMTrace.o(7457271185408L, 55561);
  }
  
  public final void setLooping(boolean paramBoolean)
  {
    GMTrace.i(7457136967680L, 55560);
    this.hey.setLooping(paramBoolean);
    GMTrace.o(7457136967680L, 55560);
  }
  
  public final void setSurface(Surface paramSurface)
  {
    GMTrace.i(7455526354944L, 55548);
    this.hey.setSurface(paramSurface);
    GMTrace.o(7455526354944L, 55548);
  }
  
  public final void start()
  {
    GMTrace.i(7455929008128L, 55551);
    this.hey.start();
    GMTrace.o(7455929008128L, 55551);
  }
  
  public final void stop()
  {
    GMTrace.i(7456063225856L, 55552);
    this.hey.stop();
    GMTrace.o(7456063225856L, 55552);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\segment\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */