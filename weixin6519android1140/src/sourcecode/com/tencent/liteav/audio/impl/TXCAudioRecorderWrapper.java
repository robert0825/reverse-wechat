package com.tencent.liteav.audio.impl;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.liteav.audio.TXCAudioRecorder;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.audio.TXIAudioRecordListener;
import com.tencent.liteav.audio.impl.Capturer.TXCSysAudioCapturer;
import com.tencent.liteav.audio.impl.Capturer.TXIAudioCapturer;
import com.tencent.liteav.audio.impl.Encoder.TXCAudioHWEncoder;
import com.tencent.liteav.audio.impl.Encoder.TXCAudioSoftEncoder;
import com.tencent.liteav.audio.impl.Encoder.TXIAudioEncoder;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class TXCAudioRecorderWrapper
  implements TXIAudioRecordListener
{
  private static final int BLOCK_TIME_OUT_MS = 2000;
  public static final String TAG = "TXCAudioRecord";
  static TXCAudioRecorderWrapper instance = new TXCAudioRecorderWrapper();
  public int mAECType = TXCAudioRecorder.DEFAULT_AEC_TYPE;
  public int mBitsPerChannel = TXCAudioRecorder.DEFAULT_BITS_PER_CHANNEL;
  public TXIAudioCapturer mCapturer;
  public int mChannelsPerSample = TXCAudioRecorder.DEFAULT_CHANNELS_PER_SAMPLE;
  public Context mContext;
  public boolean mEnableAgc = false;
  public int mEncType = TXCAudioRecorder.DEFAULT_ENC_TYPE;
  public TXIAudioEncoder mEncoder;
  private TXCHeadsetMgr mHeadsetMgr;
  public boolean mIsAudioPreview = false;
  public boolean mIsCustomRecord = false;
  public boolean mIsHWAcceleration = false;
  public volatile boolean mIsPause = false;
  private volatile boolean mIsRecording = false;
  public volatile boolean mIsStopping = false;
  public TXIAudioRecordListener mListener;
  public boolean mMute = false;
  public long mNativeProcessor = 0L;
  public float mPlayRate = 1.0F;
  public Handler mRecordHanlder;
  public HandlerThread mRecordThread;
  public int mResampleRate = 0;
  public int mReverbType = TXCAudioRecorder.DEFAULT_REVERB_TYPE;
  public int mSampleRate = TXCAudioRecorder.DEFAULT_SAMPLE_RATE;
  Object mStopLock = new Object();
  
  public static TXCAudioRecorderWrapper getInstance()
  {
    return instance;
  }
  
  public void appendAACData(final byte[] paramArrayOfByte, final long paramLong)
  {
    if ((this.mIsRecording) && (this.mRecordHanlder != null)) {
      this.mRecordHanlder.post(new Runnable()
      {
        public void run()
        {
          TXCAudioRecorderWrapper.this.onRecordEncData(paramArrayOfByte, paramLong);
        }
      });
    }
  }
  
  public void creatEncoder(WeakReference<TXIAudioRecordListener> paramWeakReference, int paramInt)
  {
    TXIAudioEncoder localTXIAudioEncoder;
    if (TXEAudioDef.TXE_AUDIO_TYPE_PCM != paramInt) {
      if (this.mAECType != TXEAudioDef.TXE_AEC_TRAE)
      {
        if (this.mIsHWAcceleration) {
          this.mEncoder = new TXCAudioHWEncoder();
        }
      }
      else if (this.mEncoder != null)
      {
        localTXIAudioEncoder = this.mEncoder;
        if (this.mResampleRate != 0) {
          break label101;
        }
      }
    }
    label101:
    for (int i = this.mSampleRate;; i = this.mResampleRate)
    {
      localTXIAudioEncoder.init(paramInt, i, this.mChannelsPerSample, this.mBitsPerChannel, paramWeakReference);
      return;
      this.mEncoder = new TXCAudioSoftEncoder();
      break;
      this.mEncoder = null;
      break;
    }
  }
  
  public void enableAgc(boolean paramBoolean)
  {
    this.mEnableAgc = paramBoolean;
    if ((this.mCapturer != null) && ((this.mCapturer instanceof TXCSysAudioCapturer))) {
      ((TXCSysAudioCapturer)this.mCapturer).enalbeAgc(this.mEnableAgc);
    }
  }
  
  public void enableAudioPreview(boolean paramBoolean)
  {
    this.mIsAudioPreview = paramBoolean;
  }
  
  public int getAECType()
  {
    return this.mAECType;
  }
  
  public int getBitsPerChannel()
  {
    return this.mBitsPerChannel;
  }
  
  public int getChannelsPerSample()
  {
    return this.mChannelsPerSample;
  }
  
  public int getEncType()
  {
    return this.mEncType;
  }
  
  public float getPlayRate()
  {
    return this.mPlayRate;
  }
  
  public int getReverbType()
  {
    return this.mReverbType;
  }
  
  public int getSampleRate()
  {
    return this.mSampleRate;
  }
  
  public boolean isAudioPreview()
  {
    return this.mIsAudioPreview;
  }
  
  public boolean isHWAcceleration()
  {
    return this.mIsHWAcceleration;
  }
  
  public boolean isPause()
  {
    return this.mIsPause;
  }
  
  public boolean isRecording()
  {
    return this.mIsRecording;
  }
  
  public void onRecordEncData(byte[] paramArrayOfByte, long paramLong)
  {
    if (this.mListener != null) {
      this.mListener.onRecordEncData(paramArrayOfByte, paramLong);
    }
  }
  
  public void onRecordError(int paramInt, String paramString)
  {
    if (this.mListener != null) {
      this.mListener.onRecordError(paramInt, paramString);
    }
  }
  
  public void onRecordPcmData(final byte[] paramArrayOfByte, final long paramLong)
  {
    paramArrayOfByte = Arrays.copyOf(paramArrayOfByte, paramArrayOfByte.length);
    if ((this.mIsRecording) && (this.mRecordHanlder != null)) {
      this.mRecordHanlder.post(new Runnable()
      {
        public void run()
        {
          if (TXCAudioRecorderWrapper.this.mListener != null) {
            TXCAudioRecorderWrapper.this.mListener.onRecordPcmData(paramArrayOfByte, paramLong);
          }
          if ((1.0F == TXCAudioRecorderWrapper.this.mPlayRate) && (TXCAudioRecorderWrapper.this.mEncoder != null)) {
            TXCAudioRecorderWrapper.this.mEncoder.doEncodec(paramArrayOfByte, paramLong);
          }
        }
      });
    }
  }
  
  public void onRecordSpeedPcmData(byte[] paramArrayOfByte, long paramLong)
  {
    if (this.mListener != null) {
      this.mListener.onRecordSpeedPcmData(paramArrayOfByte, paramLong);
    }
    if (this.mEncoder != null) {
      this.mEncoder.doEncodec(paramArrayOfByte, paramLong);
    }
  }
  
  public int pauseRecord()
  {
    if (!this.mIsRecording) {
      return TXEAudioDef.TXE_AUDIO_RECORD_ERR_NOT_START;
    }
    if (!this.mIsPause)
    {
      if (this.mRecordHanlder != null) {
        this.mRecordHanlder.post(new Runnable()
        {
          public void run()
          {
            if (TXCAudioRecorderWrapper.this.mCapturer != null) {
              TXCAudioRecorderWrapper.this.mCapturer.pause();
            }
          }
        });
      }
      this.mIsPause = true;
      return TXEAudioDef.TXE_AUDIO_RECORD_ERR_OK;
    }
    return TXEAudioDef.TXE_AUDIO_RECORD_ERR_REPEAT_OPTION;
  }
  
  public int resetRecord()
  {
    return TXEAudioDef.TXE_AUDIO_RECORD_ERR_OK;
  }
  
  public int resumeRecord()
  {
    if (!this.mIsRecording) {
      return TXEAudioDef.TXE_AUDIO_RECORD_ERR_NOT_START;
    }
    if (this.mIsPause)
    {
      if (this.mRecordHanlder != null) {
        this.mRecordHanlder.post(new Runnable()
        {
          public void run()
          {
            if (TXCAudioRecorderWrapper.this.mCapturer != null) {
              TXCAudioRecorderWrapper.this.mCapturer.resume();
            }
          }
        });
      }
      this.mIsPause = false;
      return TXEAudioDef.TXE_AUDIO_RECORD_ERR_OK;
    }
    return TXEAudioDef.TXE_AUDIO_RECORD_ERR_REPEAT_OPTION;
  }
  
  public void sendCustomPCMData(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {}
    long l;
    do
    {
      do
      {
        return;
      } while ((!this.mIsRecording) || (!this.mIsCustomRecord) || ((paramArrayOfByte.length != 2048) && (paramArrayOfByte.length != 4096)));
      l = TXCTimeUtil.getTimeTick();
      if (this.mListener != null) {
        this.mListener.onRecordPcmData(paramArrayOfByte, l);
      }
    } while ((1.0F != this.mPlayRate) || (this.mEncoder == null));
    this.mEncoder.doEncodec(paramArrayOfByte, l);
  }
  
  public void setAECType(int paramInt, final Context paramContext)
  {
    final int i = paramInt;
    if (paramInt == TXEAudioDef.TXE_AEC_TRAE)
    {
      i = paramInt;
      if (!TXCAudioJNI.nativeCheckTraeEngine(paramContext))
      {
        TXCLog.e("TXCAudioRecord", "start trae aec failed");
        i = TXEAudioDef.TXE_AEC_SYSTEM;
      }
    }
    TXCLog.i("TXCAudioRecord", "recorder setAECType: " + i);
    if (this.mIsRecording)
    {
      paramContext = new WeakReference(this);
      if (this.mRecordHanlder != null) {
        this.mRecordHanlder.post(new Runnable()
        {
          public void run()
          {
            if (TXCAudioRecorderWrapper.this.mAECType != i)
            {
              TXCAudioRecorderWrapper.this.mAECType = i;
              if (TXCAudioRecorderWrapper.this.mAECType == TXEAudioDef.TXE_AEC_TRAE)
              {
                if (TXCAudioRecorderWrapper.this.mCapturer != null) {
                  TXCAudioRecorderWrapper.this.mCapturer.stop();
                }
                TXCAudioRecorderWrapper.this.mCapturer = null;
                if (TXCAudioRecorderWrapper.this.mEncoder != null) {
                  TXCAudioRecorderWrapper.this.mEncoder.unInit();
                }
                TXCAudioRecorderWrapper.this.mEncoder = null;
                TXCAudioRecorderWrapper.this.mRecordHanlder.postDelayed(new Runnable()
                {
                  public void run()
                  {
                    if (TXCAudioRecorderWrapper.this.mNativeProcessor == 0L)
                    {
                      TXCAudioRecorderWrapper.this.mNativeProcessor = TXCAudioJNI.nativeCreateRecordProcessor();
                      TXCAudioJNI.nativeRecordProcessorInit(TXCAudioRecorderWrapper.this.mNativeProcessor, TXCAudioRecorderWrapper.this.mContext, TXCAudioRecorderWrapper.this.mAECType, true, TXCAudioRecorderWrapper.this.mSampleRate, TXCAudioRecorderWrapper.this.mChannelsPerSample, TXCAudioRecorderWrapper.this.mBitsPerChannel);
                      TXCAudioRecorderWrapper.this.setReverbType(TXCAudioRecorderWrapper.this.mReverbType);
                      TXCAudioJNI.nativeTraeRecordSetMute(TXCAudioRecorderWrapper.this.mMute);
                    }
                  }
                }, 800L);
              }
            }
            else
            {
              return;
            }
            if (TXCAudioRecorderWrapper.this.mNativeProcessor != 0L)
            {
              TXCAudioJNI.nativeDestoryRecordProcessor(TXCAudioRecorderWrapper.this.mNativeProcessor);
              TXCAudioRecorderWrapper.this.mNativeProcessor = 0L;
            }
            TXCAudioRecorderWrapper.this.mRecordHanlder.postDelayed(new Runnable()
            {
              public void run()
              {
                if (TXCAudioRecorderWrapper.this.mEncoder == null) {
                  TXCAudioRecorderWrapper.this.creatEncoder(TXCAudioRecorderWrapper.4.this.val$listener, TXCAudioRecorderWrapper.this.mEncType);
                }
                if (TXCAudioRecorderWrapper.this.mCapturer != null) {
                  TXCAudioRecorderWrapper.this.mCapturer.stop();
                }
                TXCAudioRecorderWrapper.this.mCapturer = null;
                if (!TXCAudioRecorderWrapper.this.mIsCustomRecord) {
                  TXCAudioRecorderWrapper.this.mCapturer = new TXCSysAudioCapturer();
                }
                if ((TXCAudioRecorderWrapper.this.mCapturer != null) && ((TXCAudioRecorderWrapper.this.mCapturer instanceof TXCSysAudioCapturer)))
                {
                  ((TXCSysAudioCapturer)TXCAudioRecorderWrapper.this.mCapturer).enalbeAgc(TXCAudioRecorderWrapper.this.mEnableAgc);
                  ((TXCSysAudioCapturer)TXCAudioRecorderWrapper.this.mCapturer).setResampleRate(TXCAudioRecorderWrapper.this.mResampleRate);
                }
                if (TXCAudioRecorderWrapper.this.mCapturer != null)
                {
                  TXCAudioRecorderWrapper.this.mCapturer.setMute(TXCAudioRecorderWrapper.this.mMute);
                  TXCAudioRecorderWrapper.this.mCapturer.start(TXCAudioRecorderWrapper.this.mContext, TXCAudioRecorderWrapper.this.mSampleRate, TXCAudioRecorderWrapper.this.mChannelsPerSample, TXCAudioRecorderWrapper.this.mBitsPerChannel, TXCAudioRecorderWrapper.this.mAECType, TXCAudioRecorderWrapper.4.this.val$listener);
                }
                TXCAudioRecorderWrapper.this.setReverbType(TXCAudioRecorderWrapper.this.mReverbType);
              }
            }, 800L);
          }
        });
      }
      return;
    }
    this.mAECType = i;
  }
  
  public void setBitsPerChannel(int paramInt)
  {
    this.mBitsPerChannel = paramInt;
  }
  
  public void setChannelsPerSample(int paramInt)
  {
    this.mChannelsPerSample = paramInt;
  }
  
  public void setEncType(final int paramInt)
  {
    if (this.mIsRecording)
    {
      final WeakReference localWeakReference = new WeakReference(this);
      if (this.mRecordHanlder != null) {
        this.mRecordHanlder.post(new Runnable()
        {
          public void run()
          {
            if (TXCAudioRecorderWrapper.this.mAECType != TXEAudioDef.TXE_AEC_TRAE) {
              TXCAudioRecorderWrapper.this.creatEncoder(localWeakReference, paramInt);
            }
          }
        });
      }
    }
    this.mEncType = paramInt;
  }
  
  public void setHWAcceleration(final boolean paramBoolean)
  {
    if (this.mIsRecording)
    {
      final WeakReference localWeakReference = new WeakReference(this);
      if (this.mRecordHanlder != null) {
        this.mRecordHanlder.post(new Runnable()
        {
          public void run()
          {
            if ((TXCAudioRecorderWrapper.this.mAECType != TXEAudioDef.TXE_AEC_TRAE) && (paramBoolean != TXCAudioRecorderWrapper.this.mIsHWAcceleration)) {
              TXCAudioRecorderWrapper.this.creatEncoder(localWeakReference, TXCAudioRecorderWrapper.this.mEncType);
            }
          }
        });
      }
    }
    this.mIsHWAcceleration = paramBoolean;
  }
  
  public void setIsCustomRecord(boolean paramBoolean)
  {
    if (!this.mIsRecording) {
      this.mIsCustomRecord = paramBoolean;
    }
  }
  
  public void setListener(final TXIAudioRecordListener paramTXIAudioRecordListener)
  {
    if (this.mIsRecording)
    {
      if (this.mRecordHanlder != null) {
        this.mRecordHanlder.post(new Runnable()
        {
          public void run()
          {
            TXCAudioRecorderWrapper.this.mListener = paramTXIAudioRecordListener;
          }
        });
      }
      return;
    }
    this.mListener = paramTXIAudioRecordListener;
  }
  
  public void setMute(final boolean paramBoolean)
  {
    this.mMute = paramBoolean;
    TXCLog.i("TXCAudioRecord", "setMute = " + this.mMute);
    if ((this.mIsRecording) && (this.mRecordHanlder != null)) {
      this.mRecordHanlder.post(new Runnable()
      {
        public void run()
        {
          if (TXCAudioRecorderWrapper.this.mAECType == TXEAudioDef.TXE_AEC_TRAE) {
            TXCAudioJNI.nativeTraeRecordSetMute(paramBoolean);
          }
          while (TXCAudioRecorderWrapper.this.mCapturer == null) {
            return;
          }
          TXCAudioRecorderWrapper.this.mCapturer.setMute(paramBoolean);
        }
      });
    }
  }
  
  public void setPlayRate(float paramFloat)
  {
    this.mPlayRate = paramFloat;
  }
  
  public void setResampleRate(int paramInt)
  {
    this.mResampleRate = paramInt;
  }
  
  public void setReverbType(final int paramInt)
  {
    if (this.mIsRecording)
    {
      if (this.mRecordHanlder != null) {
        this.mRecordHanlder.post(new Runnable()
        {
          public void run()
          {
            TXCAudioRecorderWrapper.this.mReverbType = paramInt;
            if (TXCAudioRecorderWrapper.this.mEncoder != null) {
              TXCAudioRecorderWrapper.this.mEncoder.setReverbType(paramInt);
            }
            TXCAudioJNI.nativeTraeSetReverb(paramInt);
          }
        });
      }
      return;
    }
    this.mReverbType = paramInt;
  }
  
  public void setSampleRate(int paramInt)
  {
    this.mSampleRate = paramInt;
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
  
  public int startRecord(final Context paramContext)
  {
    if (this.mHeadsetMgr == null) {
      this.mHeadsetMgr = new TXCHeadsetMgr(paramContext);
    }
    this.mHeadsetMgr.register();
    if (this.mIsStopping) {}
    try
    {
      synchronized (this.mStopLock)
      {
        this.mStopLock.wait(2000L);
        TXCAudioJNI.nativeInitTraeEngine(paramContext);
        if (!this.mIsRecording)
        {
          if (this.mRecordThread == null) {
            this.mRecordThread = new HandlerThread("TXCAudioRecord");
          }
          if (this.mRecordThread != null)
          {
            this.mRecordThread.start();
            this.mRecordHanlder = new Handler(this.mRecordThread.getLooper());
          }
          ??? = new WeakReference(this);
          if (this.mRecordHanlder != null) {
            this.mRecordHanlder.post(new Runnable()
            {
              public void run()
              {
                if (TXEAudioDef.TXE_AEC_TRAE == TXCAudioRecorderWrapper.this.mAECType)
                {
                  TXCAudioRecorderWrapper.this.mNativeProcessor = TXCAudioJNI.nativeCreateRecordProcessor();
                  TXCAudioJNI.nativeRecordProcessorInit(TXCAudioRecorderWrapper.this.mNativeProcessor, paramContext, TXCAudioRecorderWrapper.this.mAECType, true, TXCAudioRecorderWrapper.this.mSampleRate, TXCAudioRecorderWrapper.this.mChannelsPerSample, TXCAudioRecorderWrapper.this.mBitsPerChannel);
                  TXCAudioJNI.nativeTraeRecordSetMute(TXCAudioRecorderWrapper.this.mMute);
                }
                do
                {
                  return;
                  if (!TXCAudioRecorderWrapper.this.mIsCustomRecord) {
                    TXCAudioRecorderWrapper.this.mCapturer = new TXCSysAudioCapturer();
                  }
                  TXCAudioRecorderWrapper.this.creatEncoder(localObject, TXCAudioRecorderWrapper.this.mEncType);
                  if ((TXCAudioRecorderWrapper.this.mCapturer != null) && ((TXCAudioRecorderWrapper.this.mCapturer instanceof TXCSysAudioCapturer)))
                  {
                    ((TXCSysAudioCapturer)TXCAudioRecorderWrapper.this.mCapturer).enalbeAgc(TXCAudioRecorderWrapper.this.mEnableAgc);
                    ((TXCSysAudioCapturer)TXCAudioRecorderWrapper.this.mCapturer).setResampleRate(TXCAudioRecorderWrapper.this.mResampleRate);
                  }
                } while (TXCAudioRecorderWrapper.this.mCapturer == null);
                TXCAudioRecorderWrapper.this.mCapturer.setMute(TXCAudioRecorderWrapper.this.mMute);
                TXCAudioRecorderWrapper.this.mCapturer.start(paramContext, TXCAudioRecorderWrapper.this.mSampleRate, TXCAudioRecorderWrapper.this.mChannelsPerSample, TXCAudioRecorderWrapper.this.mBitsPerChannel, TXCAudioRecorderWrapper.this.mAECType, localObject);
              }
            });
          }
          this.mContext = paramContext;
          this.mIsPause = false;
          this.mIsRecording = true;
          return TXEAudioDef.TXE_AUDIO_RECORD_ERR_OK;
        }
      }
      return TXEAudioDef.TXE_AUDIO_RECORD_ERR_REPEAT_OPTION;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  public int stopRecord()
  {
    if (this.mHeadsetMgr != null)
    {
      this.mHeadsetMgr.unRegister();
      this.mHeadsetMgr = null;
    }
    if (this.mIsRecording)
    {
      this.mIsStopping = true;
      this.mIsRecording = false;
      if (this.mRecordHanlder != null)
      {
        this.mRecordHanlder.removeCallbacksAndMessages(null);
        this.mRecordHanlder.post(new Runnable()
        {
          public void run()
          {
            TXCAudioRecorderWrapper.this.mSampleRate = TXCAudioRecorder.DEFAULT_SAMPLE_RATE;
            TXCAudioRecorderWrapper.this.mResampleRate = 0;
            TXCAudioRecorderWrapper.this.mChannelsPerSample = TXCAudioRecorder.DEFAULT_CHANNELS_PER_SAMPLE;
            TXCAudioRecorderWrapper.this.mBitsPerChannel = TXCAudioRecorder.DEFAULT_BITS_PER_CHANNEL;
            TXCAudioRecorderWrapper.this.mReverbType = TXCAudioRecorder.DEFAULT_REVERB_TYPE;
            TXCAudioRecorderWrapper.this.mAECType = TXCAudioRecorder.DEFAULT_AEC_TYPE;
            TXCAudioRecorderWrapper.this.mIsAudioPreview = false;
            TXCAudioRecorderWrapper.this.mEncType = TXCAudioRecorder.DEFAULT_ENC_TYPE;
            TXCAudioRecorderWrapper.this.mIsHWAcceleration = false;
            TXCAudioRecorderWrapper.this.mPlayRate = 1.0F;
            TXCAudioRecorderWrapper.this.mIsCustomRecord = false;
            TXCAudioRecorderWrapper.this.mMute = false;
            if (TXCAudioRecorderWrapper.this.mCapturer != null)
            {
              TXCAudioRecorderWrapper.this.mCapturer.stop();
              TXCAudioRecorderWrapper.this.mCapturer = null;
            }
            if (TXCAudioRecorderWrapper.this.mEncoder != null)
            {
              TXCAudioRecorderWrapper.this.mEncoder.unInit();
              TXCAudioRecorderWrapper.this.mEncoder = null;
            }
            if (TXCAudioRecorderWrapper.this.mNativeProcessor != 0L)
            {
              TXCAudioJNI.nativeDestoryRecordProcessor(TXCAudioRecorderWrapper.this.mNativeProcessor);
              TXCAudioRecorderWrapper.this.mNativeProcessor = 0L;
            }
            TXCAudioRecorderWrapper.this.setSystemAudioState(TXCAudioRecorderWrapper.this.mContext);
            TXCAudioRecorderWrapper.this.mContext = null;
            TXCAudioRecorderWrapper.this.mIsPause = false;
            TXCAudioRecorderWrapper.this.mRecordHanlder = null;
            if (TXCAudioRecorderWrapper.this.mRecordThread != null)
            {
              TXCAudioRecorderWrapper.this.mRecordThread.quit();
              TXCAudioRecorderWrapper.this.mRecordThread = null;
            }
            try
            {
              synchronized (TXCAudioRecorderWrapper.this.mStopLock)
              {
                TXCAudioRecorderWrapper.this.mStopLock.notify();
                TXCAudioRecorderWrapper.this.mIsStopping = false;
                return;
              }
            }
            catch (IllegalMonitorStateException localIllegalMonitorStateException)
            {
              for (;;) {}
            }
          }
        });
      }
      return TXEAudioDef.TXE_AUDIO_RECORD_ERR_OK;
    }
    return TXEAudioDef.TXE_AUDIO_RECORD_ERR_REPEAT_OPTION;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\audio\impl\TXCAudioRecorderWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */