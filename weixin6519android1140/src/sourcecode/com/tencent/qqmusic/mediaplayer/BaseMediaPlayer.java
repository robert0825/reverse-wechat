package com.tencent.qqmusic.mediaplayer;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener;
import com.tencent.qqmusic.mediaplayer.network.IMediaHTTPService;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource.Factory;
import com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource.Factory;
import java.io.FileDescriptor;

public abstract class BaseMediaPlayer
{
  private static final String TAG = "BaseMediaPlayer";
  private static int mMaxDurationForRecent = 10;
  private long duration = 0L;
  private boolean isPaused = false;
  private Context mContext;
  private long startTime = 0L;
  
  public static int getDurationForRecent()
  {
    return mMaxDurationForRecent;
  }
  
  public static void setDurationForRecent(int paramInt)
  {
    mMaxDurationForRecent = paramInt;
  }
  
  protected abstract void TransferStateTo(int paramInt);
  
  public abstract void addAudioListener(IAudioListener paramIAudioListener);
  
  public abstract void flush();
  
  public long getCurPlayTime()
  {
    if (this.startTime == 0L) {
      return 0L;
    }
    if (this.isPaused) {
      return this.duration;
    }
    return this.duration + SystemClock.elapsedRealtime() - this.startTime;
  }
  
  public abstract AudioInformation getCurrentAudioInformation();
  
  public abstract long getCurrentPosition();
  
  public abstract long getCurrentPositionFromFile();
  
  public abstract int getDuration();
  
  public abstract int getPlayerState();
  
  public abstract int getSessionId();
  
  public abstract boolean isPlaying();
  
  public abstract boolean isSoftDecoder();
  
  protected void notifyPauseSong()
  {
    this.isPaused = true;
    this.duration += SystemClock.elapsedRealtime() - this.startTime;
  }
  
  protected void notifyStartPlaySong()
  {
    this.isPaused = false;
    this.startTime = SystemClock.elapsedRealtime();
  }
  
  public abstract void pause();
  
  public abstract void prepare();
  
  public abstract void prepareAsync();
  
  public abstract void release();
  
  public abstract void removeAudioListener(IAudioListener paramIAudioListener);
  
  public abstract void reset();
  
  public abstract void seekTo(int paramInt);
  
  public abstract void setAudioStreamType(int paramInt);
  
  public void setContext(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  public abstract void setDataSource(Context paramContext, Uri paramUri);
  
  public abstract void setDataSource(IMediaHTTPService paramIMediaHTTPService, Uri paramUri);
  
  public abstract void setDataSource(IDataSource.Factory paramFactory);
  
  public abstract void setDataSource(INativeDataSource.Factory paramFactory);
  
  public abstract void setDataSource(FileDescriptor paramFileDescriptor);
  
  public abstract void setDataSource(String paramString);
  
  public abstract void setFileTotalLength(long paramLong);
  
  public abstract void setPlayerListenerCallback(PlayerListenerCallback paramPlayerListenerCallback);
  
  public abstract void setVolume(float paramFloat1, float paramFloat2);
  
  public abstract void setWakeMode(Context paramContext, int paramInt);
  
  public abstract void start();
  
  public abstract void stop();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\BaseMediaPlayer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */