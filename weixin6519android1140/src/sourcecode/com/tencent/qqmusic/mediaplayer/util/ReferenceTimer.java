package com.tencent.qqmusic.mediaplayer.util;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;

public class ReferenceTimer
{
  private static final String TAG = "ReferenceTimer";
  private AtomicLong mBaseTime = new AtomicLong();
  
  public long getTimeInMs()
  {
    return SystemClock.uptimeMillis() - this.mBaseTime.get();
  }
  
  public void refreshTimeInMs(long paramLong)
  {
    this.mBaseTime.set(SystemClock.uptimeMillis());
    this.mBaseTime.addAndGet(-paramLong);
  }
  
  public void restart()
  {
    this.mBaseTime.set(SystemClock.uptimeMillis());
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\util\ReferenceTimer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */