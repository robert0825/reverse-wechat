package com.tencent.qqmusic.mediaplayer.util;

import android.media.AudioTrack;
import java.lang.ref.WeakReference;

public class AudioTrackMonitor
{
  private static final boolean ENABLE = false;
  private static final String TAG = "AudioTrackMonitor";
  public WeakReference<AudioTrack> mAudioTrackRef = null;
  public StringBuilder mBuilder = new StringBuilder(100);
  public long mLastPosition = 0L;
  public long mLastTime = System.nanoTime();
  public int mLooperTime = 200;
  private Thread mMonitorThread = new Thread("Monitor-AudioTrack")
  {
    public void run()
    {
      super.run();
      for (;;)
      {
        if (!AudioTrackMonitor.this.mStop) {
          try
          {
            Thread.currentThread();
            Thread.sleep(AudioTrackMonitor.this.mLooperTime);
            try
            {
              if ((AudioTrackMonitor.this.mAudioTrackRef != null) && (AudioTrackMonitor.this.mAudioTrackRef.get() != null))
              {
                AudioTrack localAudioTrack = (AudioTrack)AudioTrackMonitor.this.mAudioTrackRef.get();
                if (localAudioTrack != null)
                {
                  int i = localAudioTrack.getPlaybackHeadPosition();
                  long l1 = i;
                  long l2 = AudioTrackMonitor.this.mLastPosition;
                  AudioTrackMonitor.this.mLastPosition = i;
                  long l3 = System.nanoTime();
                  long l4 = AudioTrackMonitor.this.mLastTime;
                  AudioTrackMonitor.this.mLastTime = System.nanoTime();
                  AudioTrackMonitor.this.mBuilder.append("play-speedTime-").append(l3 - l4).append(",play-speedPosition-").append(l1 - l2);
                  AudioTrackMonitor.this.mBuilder.append(",playstate-").append(localAudioTrack.getPlayState());
                  Logger.e("AudioTrackMonitor", AudioTrackMonitor.this.mBuilder.toString());
                  AudioTrackMonitor.this.mBuilder.delete(0, AudioTrackMonitor.this.mBuilder.length());
                }
              }
            }
            catch (Throwable localThrowable1)
            {
              Logger.e("AudioTrackMonitor", localThrowable1);
            }
          }
          catch (Throwable localThrowable2)
          {
            for (;;)
            {
              Logger.e("AudioTrackMonitor", localThrowable2);
            }
          }
        }
      }
    }
  };
  public boolean mStop = false;
  
  public AudioTrackMonitor(AudioTrack paramAudioTrack)
  {
    this.mAudioTrackRef = new WeakReference(paramAudioTrack);
  }
  
  public void start() {}
  
  public void stop() {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\util\AudioTrackMonitor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */