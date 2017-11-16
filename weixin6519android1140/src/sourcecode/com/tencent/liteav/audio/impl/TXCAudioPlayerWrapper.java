package com.tencent.liteav.audio.impl;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.liteav.audio.TXCAudioPlayer;
import com.tencent.liteav.audio.TXCAudioRecorder;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.audio.TXIAudioPlayListener;
import com.tencent.liteav.audio.impl.Decoder.TXCAudioHWDecoder;
import com.tencent.liteav.audio.impl.Decoder.TXIAudioDecoder;
import com.tencent.liteav.audio.impl.Render.TXCAudioRender;
import com.tencent.liteav.audio.impl.Render.TXIAudioRenderListener;
import com.tencent.liteav.basic.enums.TXEAudioTypeDef;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.structs.TXSAudioPacket;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class TXCAudioPlayerWrapper
  implements TXIAudioPlayListener, TXIAudioRenderListener
{
  public static final String TAG = "TXCAudioPlay";
  Runnable getInfoRunnable = new Runnable()
  {
    public void run()
    {
      if (TXCAudioPlayerWrapper.this.mIsPlaying)
      {
        TXCAudioPlayerWrapper.this.mReportInfo = TXCAudioJNI.nativeGetPlayLoadingInfo(TXCAudioPlayerWrapper.this.mNativeProcessor);
        if (TXCAudioPlayerWrapper.this.mPlayHandler != null) {
          TXCAudioPlayerWrapper.this.mPlayHandler.postDelayed(TXCAudioPlayerWrapper.this.getInfoRunnable, 1000L);
        }
      }
    }
  };
  public int mAECType = TXCAudioPlayer.DEFAULT_AEC_TYPE;
  public TXSAudioPacket mAudioSeq;
  public float mAutoAdjustMaxCache = TXCAudioPlayer.DEFAULT_AUTO_ADJUST_MAX_CACHE;
  public float mAutoAdjustMinCache = TXCAudioPlayer.DEFAULT_AUTO_ADJUST_MIN_CACHE;
  public boolean mAutojustCache = TXCAudioPlayer.DEFAULT_IS_AUTO_AJUST_CACHE;
  public long mCacheDuration = 0L;
  public float mCacheTime = TXCAudioPlayer.DEFAULT_CACHE_TIME;
  public Context mContext;
  public int mDecType = TXEAudioDef.TXE_AUDIO_TYPE_INVALID;
  public TXIAudioDecoder mDecoder;
  public boolean mIsHWAcceleration = false;
  public boolean mIsMute = false;
  public volatile boolean mIsPause = false;
  public volatile boolean mIsPlaying = false;
  public boolean mIsRealTimePlay = false;
  public TXIAudioPlayListener mListener;
  public long mNativeProcessor = 0L;
  public Handler mPlayHandler;
  private float mPlayRate = 1.0F;
  public HandlerThread mPlayThread;
  public TXCAudioRender mRender;
  public TXAudioJitterBufferReportInfo mReportInfo;
  private long mSampleRate = TXCAudioRecorder.DEFAULT_SAMPLE_RATE;
  Runnable traePlayAudioTask = new Runnable()
  {
    public void run()
    {
      if (TXCAudioPlayerWrapper.this.mIsPlaying)
      {
        TXCAudioJNI.nativeQueryData(TXCAudioPlayerWrapper.this.mNativeProcessor);
        TXCAudioPlayerWrapper.this.mCacheDuration = TXCAudioJNI.nativeGetCacheSize(TXCAudioPlayerWrapper.this.mNativeProcessor);
        if (TXCAudioPlayerWrapper.this.mPlayHandler != null)
        {
          long l = (21.0F / TXCAudioJNI.nativeGetPlaySpeed(TXCAudioPlayerWrapper.this.mNativeProcessor));
          TXCAudioPlayerWrapper.this.mPlayHandler.postDelayed(TXCAudioPlayerWrapper.this.traePlayAudioTask, l);
        }
      }
    }
  };
  
  public TXCAudioPlayerWrapper(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  public static byte[] getAacHeader(int paramInt1, int paramInt2, int paramInt3)
  {
    return TXCAudioJNI.nativeGetAacHeader(paramInt1, paramInt2, paramInt3);
  }
  
  public static void setSpeakerphoneOn(Context paramContext, boolean paramBoolean)
  {
    if (paramContext != null)
    {
      paramContext = (AudioManager)paramContext.getSystemService("audio");
      if (paramBoolean) {
        paramContext.setSpeakerphoneOn(true);
      }
    }
    else
    {
      return;
    }
    paramContext.setSpeakerphoneOn(false);
    paramContext.setMode(3);
  }
  
  public void OnAudioNeedRender()
  {
    if ((this.mIsPlaying) && (this.mPlayHandler != null)) {
      this.mPlayHandler.post(new Runnable()
      {
        public void run()
        {
          byte[] arrayOfByte = TXCAudioJNI.nativeQueryData(TXCAudioPlayerWrapper.this.mNativeProcessor);
          TXCAudioPlayerWrapper.this.mCacheDuration = TXCAudioJNI.nativeGetCacheSize(TXCAudioPlayerWrapper.this.mNativeProcessor);
          if (arrayOfByte != null)
          {
            if (TXCAudioPlayerWrapper.this.mIsPause) {
              Arrays.fill(arrayOfByte, (byte)0);
            }
            if (TXCAudioPlayerWrapper.this.mListener != null) {
              TXCAudioPlayerWrapper.this.mListener.onPlayPcmData(arrayOfByte, 0L);
            }
            if (TXCAudioPlayerWrapper.this.mRender != null) {
              TXCAudioPlayerWrapper.this.mRender.play(arrayOfByte, 0L);
            }
          }
        }
      });
    }
  }
  
  public void destoryAudioProcessors()
  {
    if (this.mRender != null)
    {
      this.mRender.stop();
      this.mRender.unInit();
      this.mRender = null;
    }
    if (this.mDecoder != null)
    {
      this.mDecoder.unInit();
      this.mDecoder = null;
    }
    if (this.mNativeProcessor != 0L)
    {
      TXCAudioJNI.nativeDestoryPlayProcessor(this.mNativeProcessor);
      this.mNativeProcessor = 0L;
      this.mCacheDuration = 0L;
    }
  }
  
  public void enableRealTimePlay(final boolean paramBoolean)
  {
    if (this.mIsPlaying)
    {
      if (this.mPlayHandler != null) {
        this.mPlayHandler.post(new Runnable()
        {
          public void run()
          {
            if (paramBoolean != TXCAudioPlayerWrapper.this.mIsRealTimePlay) {
              TXCAudioJNI.nativeSetRealTimePlay(TXCAudioPlayerWrapper.this.mNativeProcessor, paramBoolean);
            }
            TXCAudioPlayerWrapper.this.mIsRealTimePlay = paramBoolean;
          }
        });
      }
      return;
    }
    this.mIsRealTimePlay = paramBoolean;
  }
  
  protected void finalize()
  {
    if (this.mNativeProcessor != 0L)
    {
      TXCAudioJNI.nativeDestoryPlayProcessor(this.mNativeProcessor);
      this.mNativeProcessor = 0L;
    }
  }
  
  public int getAECType()
  {
    return this.mAECType;
  }
  
  public long getCacheDuration()
  {
    long l2 = 0L;
    long l1 = l2;
    if (this.mIsPlaying)
    {
      l1 = l2;
      if (this.mRender != null) {
        l1 = this.mRender.getRenderCache();
      }
    }
    return (l1 + this.mCacheDuration) * 1000L * 1024L / this.mSampleRate;
  }
  
  public float getPlayCache()
  {
    return 0.0F;
  }
  
  public float getPlayRate()
  {
    return this.mPlayRate;
  }
  
  public TXAudioJitterBufferReportInfo getReportInfo()
  {
    if (this.mIsPlaying) {
      return this.mReportInfo;
    }
    return null;
  }
  
  public void initNativeProcessor(boolean paramBoolean)
  {
    if (this.mNativeProcessor != 0L) {}
    do
    {
      do
      {
        return;
        this.mNativeProcessor = TXCAudioJNI.nativeCreatePlayProcessor(this);
        TXCAudioJNI.nativeSetAutoAdjust(this.mNativeProcessor, this.mAutojustCache);
        TXCAudioJNI.nativeSetCacheTime(this.mNativeProcessor, this.mCacheTime);
        TXCAudioJNI.nativeSetAutoAdjustMinCache(this.mNativeProcessor, this.mAutoAdjustMaxCache);
        TXCAudioJNI.nativeSetAutoAdjustMinCache(this.mNativeProcessor, this.mAutoAdjustMinCache);
        TXCAudioJNI.nativeSetRealTimePlay(this.mNativeProcessor, this.mIsRealTimePlay);
        this.mCacheDuration = 0L;
      } while ((!paramBoolean) || (!this.mIsPlaying));
      TXCAudioJNI.nativeQueryData(this.mNativeProcessor);
      this.mCacheDuration = TXCAudioJNI.nativeGetCacheSize(this.mNativeProcessor);
    } while (this.mPlayHandler == null);
    this.mPlayHandler.postDelayed(this.traePlayAudioTask, (21.0F / TXCAudioJNI.nativeGetPlaySpeed(this.mNativeProcessor)));
  }
  
  public boolean isHWAcceleration()
  {
    return this.mIsHWAcceleration;
  }
  
  public boolean isIsPlaying()
  {
    return this.mIsPlaying;
  }
  
  public boolean isPause()
  {
    return this.mIsPause;
  }
  
  public boolean isRealTimePlay()
  {
    return this.mIsRealTimePlay;
  }
  
  public void onPlayAudioInfoChanged(TXSAudioPacket paramTXSAudioPacket)
  {
    this.mSampleRate = paramTXSAudioPacket.sampleRate;
    if (this.mListener != null) {
      this.mListener.onPlayAudioInfoChanged(paramTXSAudioPacket);
    }
    TXCAudioJNI.nativePlayProcessorSetAudioInfo(this.mNativeProcessor, paramTXSAudioPacket.sampleRate, paramTXSAudioPacket.channelsPerSample, paramTXSAudioPacket.bitsPerChannel);
    if (this.mRender != null)
    {
      this.mRender.init(paramTXSAudioPacket.sampleRate, paramTXSAudioPacket.channelsPerSample, paramTXSAudioPacket.bitsPerChannel);
      this.mRender.start();
    }
  }
  
  public void onPlayError(int paramInt, String paramString) {}
  
  public void onPlayJitterStateNotify(int paramInt)
  {
    if (this.mListener != null) {
      this.mListener.onPlayJitterStateNotify(paramInt);
    }
  }
  
  public void onPlayPcmData(final byte[] paramArrayOfByte, final long paramLong)
  {
    if ((this.mIsPlaying) && (this.mPlayHandler != null)) {
      this.mPlayHandler.post(new Runnable()
      {
        public void run()
        {
          if (TXCAudioPlayerWrapper.this.mListener != null) {
            TXCAudioPlayerWrapper.this.mListener.onPlayPcmData(paramArrayOfByte, paramLong);
          }
          TXCAudioJNI.nativePlayProcess(TXCAudioPlayerWrapper.this.mNativeProcessor, paramArrayOfByte, TXEAudioTypeDef.TXE_AUDIO_PACKET_TYPE_PCM_DATA, paramLong);
          TXCAudioPlayerWrapper.this.mCacheDuration = TXCAudioJNI.nativeGetCacheSize(TXCAudioPlayerWrapper.this.mNativeProcessor);
        }
      });
    }
  }
  
  public void onPlaySpeedPcmData(byte[] paramArrayOfByte, long paramLong)
  {
    if (this.mListener != null) {
      this.mListener.onPlaySpeedPcmData(paramArrayOfByte, paramLong);
    }
  }
  
  public int pausePlay()
  {
    this.mIsPause = true;
    return TXEAudioDef.TXE_AUDIO_PLAY_ERR_OK;
  }
  
  public int playData(final TXSAudioPacket paramTXSAudioPacket)
  {
    if ((!this.mIsPlaying) || (this.mIsPause))
    {
      TXCLog.w("TXCAudioPlay", "invalid state. isPlaying = " + this.mIsPlaying + ", isPause = " + this.mIsPause);
      return TXEAudioDef.TXE_AUDIO_PLAY_ERR_INVALID_STATE;
    }
    if (this.mPlayHandler != null) {
      this.mPlayHandler.post(new Runnable()
      {
        public void run()
        {
          if (TXCAudioPlayerWrapper.this.mAECType == TXEAudioDef.TXE_AEC_TRAE) {}
          for (boolean bool = true;; bool = false)
          {
            Object localObject;
            if ((TXEAudioTypeDef.TXE_AUDIO_PACKET_TYPE_AAC_SEQ == paramTXSAudioPacket.packetType) || (TXEAudioTypeDef.TXE_AUDIO_PACKET_TYPE_AAC_DATA == paramTXSAudioPacket.packetType))
            {
              if (TXEAudioTypeDef.TXE_AUDIO_PACKET_TYPE_AAC_SEQ == paramTXSAudioPacket.packetType)
              {
                TXCAudioPlayerWrapper.this.mDecType = TXEAudioDef.TXE_AUDIO_TYPE_AAC;
                TXCAudioJNI.nativePlayPorcessorInit(TXCAudioPlayerWrapper.this.mNativeProcessor, TXCAudioPlayerWrapper.this.mContext, TXCAudioPlayerWrapper.this.mDecType, bool, TXCAudioPlayerWrapper.this.mIsHWAcceleration);
                if (TXCAudioPlayerWrapper.this.mDecoder != null) {
                  TXCAudioPlayerWrapper.this.mDecoder.init(TXCAudioPlayerWrapper.this.mDecType, new WeakReference(jdField_this));
                }
                TXCAudioPlayerWrapper.this.mAudioSeq = paramTXSAudioPacket;
              }
              if (TXCAudioPlayerWrapper.this.mIsHWAcceleration) {
                break label594;
              }
              localObject = TXCAudioJNI.nativePlayProcess(TXCAudioPlayerWrapper.this.mNativeProcessor, paramTXSAudioPacket.audioData, paramTXSAudioPacket.packetType, paramTXSAudioPacket.timestamp);
              TXCAudioPlayerWrapper.this.mCacheDuration = TXCAudioJNI.nativeGetCacheSize(TXCAudioPlayerWrapper.this.mNativeProcessor);
              if (localObject != null)
              {
                int i = TXCAudioUtil.byteArrayToInt(Arrays.copyOfRange((byte[])localObject, 0, 4));
                int j = TXCAudioUtil.byteArrayToInt(Arrays.copyOfRange((byte[])localObject, 4, 8));
                int k = Arrays.copyOfRange(localObject, 8, 9)[0];
                localObject = new TXSAudioPacket();
                ((TXSAudioPacket)localObject).sampleRate = i;
                ((TXSAudioPacket)localObject).channelsPerSample = j;
                ((TXSAudioPacket)localObject).bitsPerChannel = k;
                TXCAudioPlayerWrapper.this.onPlayAudioInfoChanged((TXSAudioPacket)localObject);
              }
            }
            for (;;)
            {
              if ((TXEAudioTypeDef.TXE_AUDIO_PACKET_MP3_DATA == paramTXSAudioPacket.packetType) && (TXCAudioPlayerWrapper.this.mDecType == TXEAudioDef.TXE_AUDIO_TYPE_INVALID))
              {
                localObject = new TXSAudioPacket();
                ((TXSAudioPacket)localObject).sampleRate = TXCAudioJNI.nativeGetPlaySamplerate(TXCAudioPlayerWrapper.this.mNativeProcessor);
                ((TXSAudioPacket)localObject).channelsPerSample = TXCAudioJNI.nativeGetPlayChannel(TXCAudioPlayerWrapper.this.mNativeProcessor);
                ((TXSAudioPacket)localObject).bitsPerChannel = TXCAudioRecorder.DEFAULT_BITS_PER_CHANNEL;
                ((TXSAudioPacket)localObject).packetType = TXEAudioTypeDef.TXE_AUDIO_PACKET_MP3_DATA;
                TXCAudioPlayerWrapper.this.onPlayAudioInfoChanged((TXSAudioPacket)localObject);
                TXCAudioPlayerWrapper.this.mDecType = TXEAudioDef.TXE_AUDIO_TYPE_MP3;
              }
              return;
              if (TXEAudioTypeDef.TXE_AUDIO_PACKET_TYPE_PCM_DATA == paramTXSAudioPacket.packetType)
              {
                if (TXCAudioPlayerWrapper.this.mDecType != TXEAudioDef.TXE_AUDIO_TYPE_INVALID) {
                  break;
                }
                TXCAudioPlayerWrapper.this.mDecType = TXEAudioDef.TXE_AUDIO_TYPE_PCM;
                TXCAudioJNI.nativePlayPorcessorInit(TXCAudioPlayerWrapper.this.mNativeProcessor, TXCAudioPlayerWrapper.this.mContext, TXCAudioPlayerWrapper.this.mDecType, bool, TXCAudioPlayerWrapper.this.mIsHWAcceleration);
                TXCAudioPlayerWrapper.this.onPlayAudioInfoChanged(paramTXSAudioPacket);
                break;
              }
              if (TXEAudioTypeDef.TXE_AUDIO_PACKET_MP3_DATA == paramTXSAudioPacket.packetType)
              {
                if (TXCAudioPlayerWrapper.this.mDecType != TXEAudioDef.TXE_AUDIO_TYPE_INVALID) {
                  break;
                }
                if ((TXCAudioPlayerWrapper.this.mIsHWAcceleration) || (TXCAudioPlayerWrapper.this.mAECType == TXEAudioDef.TXE_AEC_TRAE))
                {
                  TXCAudioPlayerWrapper.this.mDecType = TXEAudioDef.TXE_AUDIO_TYPE_MP3;
                  return;
                }
                TXCAudioJNI.nativePlayPorcessorInit(TXCAudioPlayerWrapper.this.mNativeProcessor, TXCAudioPlayerWrapper.this.mContext, TXEAudioDef.TXE_AUDIO_TYPE_MP3, bool, TXCAudioPlayerWrapper.this.mIsHWAcceleration);
                break;
              }
              TXCAudioPlayerWrapper.this.onPlayError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_AUDIO_TYPE_NOT_SUPPORT, "不支持的音频包格式 : " + paramTXSAudioPacket.packetType);
              return;
              label594:
              if (TXCAudioPlayerWrapper.this.mDecoder != null) {
                TXCAudioPlayerWrapper.this.mDecoder.doDecodec(paramTXSAudioPacket);
              }
            }
          }
        }
      });
    }
    for (;;)
    {
      return TXEAudioDef.TXE_AUDIO_PLAY_ERR_OK;
      TXCLog.w("TXCAudioPlay", "play handler is null");
    }
  }
  
  public int resetPlay()
  {
    return TXEAudioDef.TXE_AUDIO_PLAY_ERR_OK;
  }
  
  public int resumePlay()
  {
    this.mIsPause = false;
    return TXEAudioDef.TXE_AUDIO_PLAY_ERR_OK;
  }
  
  public void setAECType(int paramInt, Context paramContext)
  {
    final int i = paramInt;
    if (TXEAudioDef.TXE_AEC_TRAE == paramInt)
    {
      i = paramInt;
      if (!TXCAudioJNI.nativeCheckTraeEngine(paramContext))
      {
        TXCLog.e("TXCAudioPlay", "start trae aec failed");
        i = TXEAudioDef.TXE_AEC_SYSTEM;
      }
    }
    TXCLog.i("TXCAudioPlay", "player setAECType: " + i);
    if ((this.mIsPlaying) && (this.mPlayHandler != null)) {
      this.mPlayHandler.post(new Runnable()
      {
        public void run()
        {
          if (TXCAudioPlayerWrapper.this.mAECType != i)
          {
            TXCAudioPlayerWrapper.this.mAECType = i;
            TXCAudioPlayerWrapper.this.destoryAudioProcessors();
            if (TXEAudioDef.TXE_AEC_TRAE != TXCAudioPlayerWrapper.this.mAECType) {
              break label54;
            }
            TXCAudioPlayerWrapper.this.initNativeProcessor(true);
          }
          label54:
          do
          {
            return;
            if (TXCAudioPlayerWrapper.this.mRender == null)
            {
              TXCAudioPlayerWrapper.this.mRender = new TXCAudioRender(jdField_this);
              TXCAudioPlayerWrapper.this.mRender.setMute(TXCAudioPlayerWrapper.this.mIsMute);
            }
            TXCAudioPlayerWrapper.this.initNativeProcessor(false);
          } while (!TXCAudioPlayerWrapper.this.mIsHWAcceleration);
          TXCAudioPlayerWrapper.this.mDecoder = new TXCAudioHWDecoder();
        }
      });
    }
    this.mAECType = i;
  }
  
  public void setAutoAdjustMaxCache(final float paramFloat)
  {
    if (this.mIsPlaying)
    {
      if (this.mPlayHandler != null) {
        this.mPlayHandler.post(new Runnable()
        {
          public void run()
          {
            TXCAudioJNI.nativeSetAutoAdjustMaxCache(TXCAudioPlayerWrapper.this.mNativeProcessor, paramFloat);
            TXCAudioPlayerWrapper.this.mAutoAdjustMaxCache = paramFloat;
          }
        });
      }
      return;
    }
    this.mAutoAdjustMaxCache = paramFloat;
  }
  
  public void setAutoAdjustMinCache(final float paramFloat)
  {
    if (this.mIsPlaying)
    {
      if (this.mPlayHandler != null) {
        this.mPlayHandler.post(new Runnable()
        {
          public void run()
          {
            TXCAudioJNI.nativeSetAutoAdjustMinCache(TXCAudioPlayerWrapper.this.mNativeProcessor, paramFloat);
            TXCAudioPlayerWrapper.this.mAutoAdjustMinCache = paramFloat;
          }
        });
      }
      return;
    }
    this.mAutoAdjustMinCache = paramFloat;
  }
  
  public void setAutojust(final boolean paramBoolean)
  {
    if (this.mIsPlaying)
    {
      if (this.mPlayHandler != null) {
        this.mPlayHandler.post(new Runnable()
        {
          public void run()
          {
            TXCAudioJNI.nativeSetAutoAdjust(TXCAudioPlayerWrapper.this.mNativeProcessor, paramBoolean);
            TXCAudioPlayerWrapper.this.mAutojustCache = paramBoolean;
          }
        });
      }
      return;
    }
    this.mAutojustCache = paramBoolean;
  }
  
  public void setCacheTime(final float paramFloat)
  {
    if (this.mIsPlaying)
    {
      if (this.mPlayHandler != null) {
        this.mPlayHandler.post(new Runnable()
        {
          public void run()
          {
            TXCAudioJNI.nativeSetCacheTime(TXCAudioPlayerWrapper.this.mNativeProcessor, paramFloat);
            TXCAudioPlayerWrapper.this.mCacheTime = paramFloat;
          }
        });
      }
      return;
    }
    this.mCacheTime = paramFloat;
  }
  
  public void setHWAcceleration(final boolean paramBoolean)
  {
    if (this.mIsPlaying)
    {
      if (this.mPlayHandler != null) {
        this.mPlayHandler.post(new Runnable()
        {
          public void run()
          {
            if ((TXCAudioPlayerWrapper.this.mAECType != TXEAudioDef.TXE_AEC_TRAE) && (TXCAudioPlayerWrapper.this.mIsHWAcceleration != paramBoolean))
            {
              TXCAudioPlayerWrapper.this.mIsHWAcceleration = paramBoolean;
              if (!TXCAudioPlayerWrapper.this.mIsHWAcceleration) {
                break label144;
              }
              if (TXCAudioPlayerWrapper.this.mNativeProcessor != 0L)
              {
                TXCAudioJNI.nativeDestoryPlayProcessor(TXCAudioPlayerWrapper.this.mNativeProcessor);
                TXCAudioPlayerWrapper.this.mCacheDuration = 0L;
                TXCAudioPlayerWrapper.this.mNativeProcessor = 0L;
              }
              TXCAudioPlayerWrapper.this.initNativeProcessor(false);
              if (TXCAudioPlayerWrapper.this.mDecoder == null) {
                TXCAudioPlayerWrapper.this.mDecoder = new TXCAudioHWDecoder();
              }
            }
            for (;;)
            {
              if (TXCAudioPlayerWrapper.this.mAudioSeq != null) {
                TXCAudioPlayerWrapper.this.playData(TXCAudioPlayerWrapper.this.mAudioSeq);
              }
              return;
              label144:
              if (TXCAudioPlayerWrapper.this.mDecoder != null)
              {
                TXCAudioPlayerWrapper.this.mDecoder.unInit();
                TXCAudioPlayerWrapper.this.mDecoder = null;
              }
              TXCAudioPlayerWrapper.this.initNativeProcessor(false);
            }
          }
        });
      }
      return;
    }
    this.mIsHWAcceleration = paramBoolean;
  }
  
  public void setListener(final TXIAudioPlayListener paramTXIAudioPlayListener)
  {
    if (this.mIsPlaying)
    {
      if (this.mPlayHandler != null) {
        this.mPlayHandler.post(new Runnable()
        {
          public void run()
          {
            TXCAudioPlayerWrapper.this.mListener = paramTXIAudioPlayListener;
          }
        });
      }
      return;
    }
    this.mListener = paramTXIAudioPlayListener;
  }
  
  public void setMute(final boolean paramBoolean)
  {
    if (this.mIsPlaying)
    {
      if (this.mPlayHandler != null) {
        this.mPlayHandler.post(new Runnable()
        {
          public void run()
          {
            TXCAudioPlayerWrapper.this.mIsMute = paramBoolean;
            if (TXCAudioPlayerWrapper.this.mRender != null) {
              TXCAudioPlayerWrapper.this.mRender.setMute(paramBoolean);
            }
          }
        });
      }
      return;
    }
    this.mIsMute = paramBoolean;
  }
  
  public void setPlayRate(float paramFloat)
  {
    this.mPlayRate = paramFloat;
  }
  
  public void setSystemAudioState(Context paramContext)
  {
    if (paramContext == null) {}
    do
    {
      return;
      paramContext = (AudioManager)paramContext.getSystemService("audio");
    } while ((paramContext == null) || (paramContext.getMode() == 0));
    paramContext.setMode(0);
  }
  
  public int startPlay()
  {
    if (!this.mIsPlaying)
    {
      if (this.mPlayThread == null) {
        this.mPlayThread = new HandlerThread("TXCAudioPlay");
      }
      if (this.mPlayThread != null)
      {
        this.mPlayThread.start();
        if (this.mPlayHandler == null) {
          this.mPlayHandler = new Handler(this.mPlayThread.getLooper());
        }
      }
      this.mPlayHandler.post(new Runnable()
      {
        public void run()
        {
          if (TXCAudioPlayerWrapper.this.mAECType == TXEAudioDef.TXE_AEC_TRAE) {
            TXCAudioPlayerWrapper.this.initNativeProcessor(true);
          }
          for (;;)
          {
            TXCAudioPlayerWrapper.this.mCacheDuration = 0L;
            return;
            TXCAudioPlayerWrapper.this.mRender = new TXCAudioRender(jdField_this);
            TXCAudioPlayerWrapper.this.mRender.setMute(TXCAudioPlayerWrapper.this.mIsMute);
            TXCAudioPlayerWrapper.this.initNativeProcessor(false);
            if (TXCAudioPlayerWrapper.this.mIsHWAcceleration) {
              TXCAudioPlayerWrapper.this.mDecoder = new TXCAudioHWDecoder();
            }
          }
        }
      });
      this.mPlayHandler.postDelayed(this.getInfoRunnable, 1000L);
      this.mSampleRate = TXCAudioRecorder.DEFAULT_SAMPLE_RATE;
      this.mIsPause = false;
      this.mIsPlaying = true;
      TXCLog.i("TXCAudioPlay", "audioKey startPlay complete");
      return TXEAudioDef.TXE_AUDIO_PLAY_ERR_OK;
    }
    return TXEAudioDef.TXE_AUDIO_PLAY_ERR_REPEAT_OPTION;
  }
  
  public int stopPlay()
  {
    if (this.mIsPlaying)
    {
      this.mIsPlaying = false;
      if (this.mPlayHandler != null)
      {
        this.mPlayHandler.removeCallbacksAndMessages(null);
        this.mPlayHandler.post(new Runnable()
        {
          public void run()
          {
            if (TXCAudioPlayerWrapper.this.mRender != null)
            {
              TXCAudioPlayerWrapper.this.mRender.stop();
              TXCAudioPlayerWrapper.this.mRender.unInit();
              TXCAudioPlayerWrapper.this.mRender = null;
            }
            if (TXCAudioPlayerWrapper.this.mDecoder != null)
            {
              TXCAudioPlayerWrapper.this.mDecoder.unInit();
              TXCAudioPlayerWrapper.this.mDecoder = null;
            }
            TXCAudioPlayerWrapper.this.mDecType = TXEAudioDef.TXE_AUDIO_TYPE_INVALID;
            if (TXCAudioPlayerWrapper.this.mNativeProcessor != 0L)
            {
              TXCAudioJNI.nativeDestoryPlayProcessor(TXCAudioPlayerWrapper.this.mNativeProcessor);
              TXCAudioPlayerWrapper.this.mNativeProcessor = 0L;
              TXCAudioPlayerWrapper.this.mCacheDuration = 0L;
            }
            TXCAudioPlayerWrapper.this.mCacheDuration = 0L;
            TXCAudioPlayerWrapper.this.mAudioSeq = null;
            TXCAudioPlayerWrapper.this.setSystemAudioState(TXCAudioPlayerWrapper.this.mContext);
            TXCAudioPlayerWrapper.this.mIsMute = false;
            TXCAudioPlayerWrapper.this.mIsPause = false;
            TXCAudioPlayerWrapper.this.mPlayHandler = null;
            if (TXCAudioPlayerWrapper.this.mPlayThread != null)
            {
              TXCAudioPlayerWrapper.this.mPlayThread.quit();
              TXCAudioPlayerWrapper.this.mPlayThread = null;
            }
          }
        });
      }
      return TXEAudioDef.TXE_AUDIO_PLAY_ERR_OK;
    }
    return TXEAudioDef.TXE_AUDIO_PLAY_ERR_REPEAT_OPTION;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\audio\impl\TXCAudioPlayerWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */