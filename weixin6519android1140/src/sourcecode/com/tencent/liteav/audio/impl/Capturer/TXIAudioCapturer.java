package com.tencent.liteav.audio.impl.Capturer;

import android.content.Context;
import com.tencent.liteav.audio.TXIAudioRecordListener;
import java.lang.ref.WeakReference;

public abstract interface TXIAudioCapturer
{
  public abstract void pause();
  
  public abstract void resume();
  
  public abstract void setMute(boolean paramBoolean);
  
  public abstract void start(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, WeakReference<TXIAudioRecordListener> paramWeakReference);
  
  public abstract void stop();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\audio\impl\Capturer\TXIAudioCapturer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */