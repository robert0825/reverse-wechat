package com.tencent.liteav.audio;

import android.content.Context;
import com.tencent.liteav.audio.impl.Decoder.TXCAudioExtractor;
import com.tencent.liteav.audio.impl.Decoder.TXCAudioHWDecoder;
import com.tencent.liteav.audio.impl.Decoder.TXIAudioDecoder;
import com.tencent.liteav.audio.impl.Effects.TXCAudioEffector;
import com.tencent.liteav.basic.enums.TXEAudioTypeDef;
import com.tencent.liteav.basic.structs.TXSAudioPacket;
import java.lang.ref.WeakReference;
import java.util.LinkedList;

public class TXCMixPlayerEx
  implements TXIAudioPlayListener
{
  private static final int READ_NUM_PRE_QUERY = 6;
  private LinkedList<TXSAudioPacket> mAudioCache;
  private TXCAudioPlayer mAudioPlayer;
  private TXIAudioDecoder mDecoder;
  private TXSAudioPacket mDesInfo;
  private int mDesTrackIndex = -1;
  private TXCAudioEffector mEffector;
  private TXCAudioExtractor mExtrator;
  private boolean mIsPause;
  private boolean mIsStart;
  private TXIMixPlayListener mListener;
  private int mMixNum = 0;
  private boolean mMixPlay = false;
  private int mReadNum = 0;
  private TXSAudioPacket mSrcInfo;
  private int mSrcTrackIndex = -1;
  
  public static final TXCMixPlayerEx getInstance()
  {
    return TXCMixPlayerHolder.instance;
  }
  
  private void getMixData(int paramInt)
  {
    int i = 0;
    if (i < paramInt) {
      if (this.mExtrator == null) {
        break label160;
      }
    }
    label160:
    for (TXSAudioPacket localTXSAudioPacket1 = this.mExtrator.readAudioSampleData();; localTXSAudioPacket1 = null)
    {
      if (localTXSAudioPacket1 != null) {
        if (localTXSAudioPacket1.packetType == TXEAudioDef.TXE_AUDIO_TYPE_INVALID)
        {
          if (this.mListener != null)
          {
            this.mListener.onMixPlayComplete(TXEAudioDef.TXE_AUDIO_MIX_ERR_AUDIO_TYPE_NOT_SUPPORT);
            stopMixPlay();
          }
        }
        else if (this.mDecoder != null)
        {
          this.mReadNum += 1;
          if ((this.mReadNum == 0) && (localTXSAudioPacket1.packetType == TXEAudioTypeDef.TXE_AUDIO_PACKET_TYPE_AAC_DATA))
          {
            TXSAudioPacket localTXSAudioPacket2 = (TXSAudioPacket)localTXSAudioPacket1.clone();
            localTXSAudioPacket2.packetType = TXEAudioTypeDef.TXE_AUDIO_PACKET_TYPE_AAC_SEQ;
            localTXSAudioPacket2.audioData = TXCAudioPlayer.getAacHeader(localTXSAudioPacket1.sampleRate, localTXSAudioPacket1.channelsPerSample, localTXSAudioPacket1.bitsPerChannel);
            this.mDecoder.doDecodec(localTXSAudioPacket2);
          }
          this.mDecoder.doDecodec(localTXSAudioPacket1);
        }
      }
      i += 1;
      break;
    }
  }
  
  public long getMixAudioDuration(String paramString)
  {
    TXCAudioExtractor localTXCAudioExtractor = new TXCAudioExtractor();
    localTXCAudioExtractor.setDataSource(paramString);
    return localTXCAudioExtractor.getDuration();
  }
  
  public byte[] mixAudio(byte[] paramArrayOfByte)
  {
    for (;;)
    {
      try
      {
        this.mAudioCache.size();
        if (this.mAudioCache.isEmpty()) {
          break label259;
        }
        localTXSAudioPacket1 = (TXSAudioPacket)this.mAudioCache.remove();
        this.mMixNum += 1;
        if (localTXSAudioPacket1 != null)
        {
          this.mEffector.addAudio(this.mDesTrackIndex, paramArrayOfByte);
          this.mEffector.addAudio(this.mSrcTrackIndex, localTXSAudioPacket1.audioData);
          paramArrayOfByte = this.mEffector.mixAudio();
          if (this.mAudioPlayer != null)
          {
            TXSAudioPacket localTXSAudioPacket2 = (TXSAudioPacket)localTXSAudioPacket1.clone();
            if (this.mMixPlay) {
              localTXSAudioPacket2.audioData = paramArrayOfByte;
            }
            localTXSAudioPacket2.packetType = TXEAudioTypeDef.TXE_AUDIO_PACKET_TYPE_PCM_DATA;
            this.mAudioPlayer.playData(localTXSAudioPacket2);
          }
          long l = 0L;
          if (localTXSAudioPacket1.sampleRate != 0) {
            l = localTXSAudioPacket1.audioData.length * this.mMixNum * 1000 / localTXSAudioPacket1.sampleRate;
          }
          if ((this.mListener != null) && (this.mExtrator != null)) {
            this.mListener.onMixPlayProgress(l, this.mExtrator.getDuration());
          }
          if ((this.mReadNum == this.mMixNum) && (this.mListener != null)) {
            this.mListener.onMixPlayComplete(TXEAudioDef.TXE_AUDIO_MIX_ERR_OK);
          }
          if (this.mReadNum - this.mMixNum < 6) {
            getMixData(6);
          }
          return paramArrayOfByte;
        }
      }
      finally {}
      paramArrayOfByte = null;
      continue;
      label259:
      TXSAudioPacket localTXSAudioPacket1 = null;
    }
  }
  
  public void onPlayAudioInfoChanged(TXSAudioPacket paramTXSAudioPacket)
  {
    this.mSrcInfo = paramTXSAudioPacket;
    this.mSrcTrackIndex = 1;
    this.mEffector.initOneTrack(this.mSrcTrackIndex, paramTXSAudioPacket.sampleRate, paramTXSAudioPacket.channelsPerSample, paramTXSAudioPacket.bitsPerChannel);
  }
  
  public void onPlayError(int paramInt, String paramString) {}
  
  public void onPlayJitterStateNotify(int paramInt) {}
  
  public void onPlayPcmData(byte[] paramArrayOfByte, long paramLong)
  {
    if (this.mSrcInfo != null)
    {
      TXSAudioPacket localTXSAudioPacket = (TXSAudioPacket)this.mSrcInfo.clone();
      localTXSAudioPacket.audioData = paramArrayOfByte;
      localTXSAudioPacket.timestamp = paramLong;
      try
      {
        if (this.mAudioCache != null) {
          this.mAudioCache.add(localTXSAudioPacket);
        }
        return;
      }
      finally {}
    }
  }
  
  public void onPlaySpeedPcmData(byte[] paramArrayOfByte, long paramLong) {}
  
  public boolean pauseMixPlay()
  {
    if (!this.mIsPause) {
      this.mIsPause = true;
    }
    return true;
  }
  
  public boolean resumeMixPlay()
  {
    return true;
  }
  
  public void setDesAudioInfo(TXSAudioPacket paramTXSAudioPacket)
  {
    this.mDesInfo = paramTXSAudioPacket;
    this.mDesTrackIndex = 0;
    this.mEffector.initOneTrack(this.mDesTrackIndex, paramTXSAudioPacket.sampleRate, paramTXSAudioPacket.channelsPerSample, paramTXSAudioPacket.bitsPerChannel);
  }
  
  public boolean setMicVolume(float paramFloat)
  {
    return true;
  }
  
  public boolean setMixVolume(float paramFloat)
  {
    return true;
  }
  
  public boolean startMixPlay(Context paramContext, TXIMixPlayListener paramTXIMixPlayListener, String paramString, boolean paramBoolean)
  {
    if (!this.mIsStart)
    {
      this.mExtrator = new TXCAudioExtractor();
      if (!this.mExtrator.setDataSource(paramString))
      {
        this.mExtrator.release();
        this.mExtrator = null;
        if (paramTXIMixPlayListener != null) {
          paramTXIMixPlayListener.onMixPlayComplete(TXEAudioDef.TXE_AUDIO_MIX_ERR_OPEN_FILE_FAILED);
        }
        return false;
      }
      this.mEffector = new TXCAudioEffector();
      this.mEffector.initEffector();
      this.mDecoder = new TXCAudioHWDecoder();
      this.mDecoder.init(this.mExtrator.getAudioType(), new WeakReference(this));
      this.mAudioPlayer = new TXCAudioPlayer(paramContext);
      this.mAudioPlayer.startPlay();
    }
    try
    {
      this.mAudioCache = new LinkedList();
      this.mListener = paramTXIMixPlayListener;
      this.mSrcInfo = null;
      this.mDesInfo = null;
      this.mReadNum = 0;
      this.mMixNum = 0;
      this.mMixPlay = false;
      this.mIsStart = true;
      getMixData(6);
      return true;
    }
    finally {}
  }
  
  public boolean stopMixPlay()
  {
    if (this.mIsStart)
    {
      if (this.mExtrator != null) {
        this.mExtrator.release();
      }
      this.mExtrator = null;
      if (this.mDecoder != null) {
        this.mDecoder.unInit();
      }
      this.mDecoder = null;
    }
    try
    {
      if (this.mAudioCache != null) {
        this.mAudioCache.clear();
      }
      this.mAudioCache = null;
      this.mEffector.destoryEffector();
      this.mEffector = null;
      this.mSrcInfo = null;
      this.mDesInfo = null;
      this.mReadNum = 0;
      this.mMixNum = 0;
      this.mMixPlay = false;
      this.mDesTrackIndex = -1;
      this.mSrcTrackIndex = -1;
      this.mIsStart = false;
      this.mIsPause = false;
      return true;
    }
    finally {}
  }
  
  private static class TXCMixPlayerHolder
  {
    public static TXCMixPlayerEx instance = new TXCMixPlayerEx();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\liteav\audio\TXCMixPlayerEx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */