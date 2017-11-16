package com.tencent.liteav.network;

import com.tencent.liteav.basic.enums.TXEAudioTypeDef;
import com.tencent.liteav.basic.listener.TXINotifyListener;
import com.tencent.liteav.basic.structs.TXSAudioPacket;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import java.util.Vector;

public abstract class TXIStreamDownloader
{
  public int connectRetryInterval = 3;
  public int connectRetryLimit = 3;
  public int connectRetryTimes = 0;
  protected boolean mIsRunning = false;
  protected TXIStreamDownloaderListener mListener = null;
  protected TXINotifyListener mNotifyListener = null;
  
  public String getCurrentStreamUrl()
  {
    return null;
  }
  
  public TXCStreamDownloader.DownloadStats getDownloadStats()
  {
    return null;
  }
  
  public boolean isQuicChannel()
  {
    return false;
  }
  
  public void onRecvAudioData(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    TXSAudioPacket localTXSAudioPacket;
    if (this.mListener != null)
    {
      localTXSAudioPacket = new TXSAudioPacket();
      localTXSAudioPacket.audioData = paramArrayOfByte;
      localTXSAudioPacket.timestamp = paramInt1;
      if (paramInt2 == 10) {
        if (paramInt3 != 1) {
          break label93;
        }
      }
    }
    label93:
    for (localTXSAudioPacket.packetType = TXEAudioTypeDef.TXE_AUDIO_PACKET_TYPE_AAC_SEQ;; localTXSAudioPacket.packetType = TXEAudioTypeDef.TXE_AUDIO_PACKET_TYPE_AAC_DATA)
    {
      if (localTXSAudioPacket.packetType == TXEAudioTypeDef.TXE_AUDIO_PACKET_TYPE_AAC_SEQ) {
        localTXSAudioPacket.bitsPerChannel = TXEAudioTypeDef.TXE_BITS_PER_CHANNEL_16;
      }
      if (paramInt2 == 2) {
        localTXSAudioPacket.packetType = TXEAudioTypeDef.TXE_AUDIO_PACKET_MP3_DATA;
      }
      this.mListener.onPullAudio(localTXSAudioPacket);
      return;
    }
  }
  
  public void onRecvVideoData(byte[] paramArrayOfByte, int paramInt, long paramLong1, long paramLong2)
  {
    if (this.mListener != null)
    {
      TXSNALPacket localTXSNALPacket = new TXSNALPacket();
      localTXSNALPacket.nalData = paramArrayOfByte;
      localTXSNALPacket.nalType = paramInt;
      localTXSNALPacket.dts = paramLong1;
      localTXSNALPacket.pts = paramLong2;
      this.mListener.onPullNAL(localTXSNALPacket);
    }
  }
  
  public void sendNotifyEvent(int paramInt)
  {
    if (this.mNotifyListener != null) {
      this.mNotifyListener.onNotifyEvent(paramInt, null);
    }
  }
  
  public void setListener(TXIStreamDownloaderListener paramTXIStreamDownloaderListener)
  {
    this.mListener = paramTXIStreamDownloaderListener;
  }
  
  public void setNotifyListener(TXINotifyListener paramTXINotifyListener)
  {
    this.mNotifyListener = paramTXINotifyListener;
  }
  
  public abstract void startDownload(Vector<TXCStreamPlayUrl> paramVector, boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract void stopDownload();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\network\TXIStreamDownloader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */