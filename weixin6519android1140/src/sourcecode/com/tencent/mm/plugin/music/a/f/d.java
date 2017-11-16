package com.tencent.mm.plugin.music.a.f;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.b.i;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends b
{
  public MediaPlayer hey;
  public boolean mZM;
  public a nrD;
  
  public d()
  {
    GMTrace.i(4866734817280L, 36260);
    this.mZM = true;
    this.hey = new i();
    this.hey.setAudioStreamType(3);
    this.hey.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
    {
      public final void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
      {
        GMTrace.i(4866063728640L, 36255);
        w.e("MicroMsg.Music.MMMediaPlayer", "onCompletion, stop music");
        d.this.gq(true);
        GMTrace.o(4866063728640L, 36255);
      }
    });
    this.hey.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener()
    {
      public final void onSeekComplete(MediaPlayer paramAnonymousMediaPlayer)
      {
        GMTrace.i(4864587333632L, 36244);
        if ((d.this.hey != null) && (d.this.hey.isPlaying()))
        {
          w.i("MicroMsg.Music.MMMediaPlayer", "onSeekComplete");
          try
          {
            d.this.hey.start();
            GMTrace.o(4864587333632L, 36244);
            return;
          }
          catch (Exception paramAnonymousMediaPlayer)
          {
            w.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", paramAnonymousMediaPlayer, "start", new Object[0]);
          }
        }
        GMTrace.o(4864587333632L, 36244);
      }
    });
    this.hey.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
    {
      public final void onPrepared(MediaPlayer paramAnonymousMediaPlayer)
      {
        GMTrace.i(4861366108160L, 36220);
        if (d.this.hey != null) {
          w.i("MicroMsg.Music.MMMediaPlayer", "onPrepared");
        }
        try
        {
          d.this.hey.start();
          d.this.mZM = false;
          d.this.onStart();
          if (d.this.nrD != null) {
            d.this.nrD.isStop = true;
          }
          d.this.nrD = new d.a(d.this);
          paramAnonymousMediaPlayer = d.this.nrD;
          paramAnonymousMediaPlayer.isStop = false;
          e.post(paramAnonymousMediaPlayer, "music_play_progress_runnable");
          GMTrace.o(4861366108160L, 36220);
          return;
        }
        catch (Exception paramAnonymousMediaPlayer)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", paramAnonymousMediaPlayer, "start", new Object[0]);
          }
        }
      }
    });
    this.hey.setOnErrorListener(new MediaPlayer.OnErrorListener()
    {
      public final boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(4866332164096L, 36257);
        w.e("MicroMsg.Music.MMMediaPlayer", "onError, what:%d, extra:%d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        d.this.gp(false);
        GMTrace.o(4866332164096L, 36257);
        return false;
      }
    });
    GMTrace.o(4866734817280L, 36260);
  }
  
  public final void DM(String paramString)
  {
    GMTrace.i(4867137470464L, 36263);
    w.i("MicroMsg.Music.MMMediaPlayer", "setSourcePath, sourcePath:%s", new Object[] { paramString });
    try
    {
      this.hey.setDataSource(paramString);
      GMTrace.o(4867137470464L, 36263);
      return;
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", paramString, "setSourcePath", new Object[0]);
      GMTrace.o(4867137470464L, 36263);
    }
  }
  
  public final boolean aTg()
  {
    GMTrace.i(4867003252736L, 36262);
    if (!this.mZM)
    {
      GMTrace.o(4867003252736L, 36262);
      return true;
    }
    GMTrace.o(4867003252736L, 36262);
    return false;
  }
  
  public final int aTh()
  {
    GMTrace.i(4867271688192L, 36264);
    int i = this.hey.getCurrentPosition();
    GMTrace.o(4867271688192L, 36264);
    return i;
  }
  
  public final String aTi()
  {
    GMTrace.i(18371185737728L, 136876);
    GMTrace.o(18371185737728L, 136876);
    return null;
  }
  
  public final int getDuration()
  {
    GMTrace.i(4867405905920L, 36265);
    int i = this.hey.getDuration();
    GMTrace.o(4867405905920L, 36265);
    return i;
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(4866869035008L, 36261);
    try
    {
      boolean bool = this.hey.isPlaying();
      GMTrace.o(4866869035008L, 36261);
      return bool;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", localException, "setSourcePath", new Object[0]);
      GMTrace.o(4866869035008L, 36261);
    }
    return false;
  }
  
  public final void pause()
  {
    GMTrace.i(4867808559104L, 36268);
    w.i("MicroMsg.Music.MMMediaPlayer", "pause");
    if (!aTg())
    {
      GMTrace.o(4867808559104L, 36268);
      return;
    }
    this.hey.pause();
    GMTrace.o(4867808559104L, 36268);
  }
  
  public final void play()
  {
    GMTrace.i(4867540123648L, 36266);
    w.i("MicroMsg.Music.MMMediaPlayer", "play");
    if (aTg()) {
      try
      {
        if (!this.hey.isPlaying())
        {
          this.hey.start();
          GMTrace.o(4867540123648L, 36266);
          return;
        }
        GMTrace.o(4867540123648L, 36266);
        return;
      }
      catch (Exception localException1)
      {
        w.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", localException1, "start", new Object[0]);
        GMTrace.o(4867540123648L, 36266);
        return;
      }
    }
    try
    {
      this.hey.prepareAsync();
      GMTrace.o(4867540123648L, 36266);
      return;
    }
    catch (Exception localException2)
    {
      w.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", localException2, "prepareAsync", new Object[0]);
      GMTrace.o(4867540123648L, 36266);
    }
  }
  
  public final void seek(long paramLong)
  {
    GMTrace.i(4867942776832L, 36269);
    w.i("MicroMsg.Music.MMMediaPlayer", "seek %d", new Object[] { Long.valueOf(paramLong) });
    this.hey.seekTo((int)paramLong);
    GMTrace.o(4867942776832L, 36269);
  }
  
  public final void stop()
  {
    GMTrace.i(4867674341376L, 36267);
    w.i("MicroMsg.Music.MMMediaPlayer", "stop");
    this.mZM = true;
    try
    {
      if (this.hey != null)
      {
        this.hey.stop();
        this.hey.release();
      }
      if (this.nrD != null)
      {
        this.nrD.isStop = true;
        this.nrD = null;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", localException, "stop", new Object[0]);
      }
    }
    gq(false);
    GMTrace.o(4867674341376L, 36267);
  }
  
  private final class a
    implements Runnable
  {
    boolean isStop;
    
    public a()
    {
      GMTrace.i(4860829237248L, 36216);
      this.isStop = true;
      GMTrace.o(4860829237248L, 36216);
    }
    
    public final void run()
    {
      GMTrace.i(4860963454976L, 36217);
      w.i("MicroMsg.Music.MMMediaPlayer", "start run play progress task");
      while (!this.isStop)
      {
        try
        {
          if ((d.this.hey != null) && (d.this.hey.isPlaying()))
          {
            int i = d.this.hey.getCurrentPosition();
            int j = d.this.hey.getDuration();
            if ((i > 0) && (j > 0))
            {
              i = i * 100 / j;
              d.this.rz(i);
            }
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", localException, "onPlayUpdate", new Object[0]);
          }
        }
        try
        {
          Thread.sleep(200L);
        }
        catch (InterruptedException localInterruptedException)
        {
          w.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", localInterruptedException, "sleep", new Object[0]);
        }
      }
      GMTrace.o(4860963454976L, 36217);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\f\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */