package com.tencent.liteav;

import android.content.Context;
import android.view.TextureView;
import com.tencent.liteav.basic.listener.TXINotifyListener;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.rtmp.TXLivePlayer.ITXAudioRawDataListener;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon.ITXVideoRecordListener;
import java.lang.ref.WeakReference;

public abstract class TXIPlayer
{
  public static final String TAG = "TXIPlayer";
  protected Context mApplicationContext = null;
  protected TXCloudVideoView mCloudVideoView = null;
  protected TXCPlayerConfig mConfig = null;
  protected WeakReference<TXINotifyListener> mNotifyListener;
  
  public TXIPlayer(Context paramContext)
  {
    if (paramContext != null) {
      this.mApplicationContext = paramContext.getApplicationContext();
    }
  }
  
  public TXCPlayerConfig getConfig()
  {
    return this.mConfig;
  }
  
  public TextureView getTextureView()
  {
    return null;
  }
  
  public abstract boolean isPlaying();
  
  public void pause()
  {
    TXCLog.w("TXIPlayer", "pause not implement");
  }
  
  public void resume()
  {
    TXCLog.w("TXIPlayer", "resume not implement");
  }
  
  public void seek(int paramInt)
  {
    TXCLog.w("TXIPlayer", "seek not implement");
  }
  
  public void setAudioRawDataListener(TXLivePlayer.ITXAudioRawDataListener paramITXAudioRawDataListener) {}
  
  public void setAutoPlay(boolean paramBoolean)
  {
    TXCLog.w("TXIPlayer", "autoPlay not implement");
  }
  
  public void setConfig(TXCPlayerConfig paramTXCPlayerConfig)
  {
    this.mConfig = paramTXCPlayerConfig;
    if (this.mConfig == null) {
      this.mConfig = new TXCPlayerConfig();
    }
  }
  
  public abstract void setMute(boolean paramBoolean);
  
  public void setNotifyListener(TXINotifyListener paramTXINotifyListener)
  {
    this.mNotifyListener = new WeakReference(paramTXINotifyListener);
  }
  
  public void setPlayerView(TXCloudVideoView paramTXCloudVideoView)
  {
    this.mCloudVideoView = paramTXCloudVideoView;
  }
  
  public void setRate(float paramFloat)
  {
    TXCLog.w("TXIPlayer", "rate not implement");
  }
  
  public abstract void setRenderMode(int paramInt);
  
  public abstract void setRenderRotation(int paramInt);
  
  public void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener paramITXVideoRecordListener) {}
  
  public abstract int startPlay(String paramString, int paramInt);
  
  public abstract int startRecord(int paramInt);
  
  public abstract int stopPlay(boolean paramBoolean);
  
  public abstract int stopRecord();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\TXIPlayer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */