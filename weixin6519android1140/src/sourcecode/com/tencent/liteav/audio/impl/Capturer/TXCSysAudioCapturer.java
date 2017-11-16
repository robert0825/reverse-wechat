package com.tencent.liteav.audio.impl.Capturer;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import com.tencent.liteav.audio.TXCAudioRecorder;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.audio.TXIAudioRecordListener;
import com.tencent.liteav.audio.impl.Effects.TXCAudioEffector;
import com.tencent.liteav.audio.impl.TXCAudioJNI;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class TXCSysAudioCapturer
  implements TXIAudioCapturer
{
  private static final int ABITRATE_KBPS = 24;
  private static final String ACODEC = "audio/mp4a-latm";
  private static final String TAG = TXCSysAudioCapturer.class.getSimpleName();
  private int mAECType = TXCAudioRecorder.DEFAULT_AEC_TYPE;
  private int mBits = TXCAudioRecorder.DEFAULT_BITS_PER_CHANNEL;
  private int mChannel = TXCAudioRecorder.DEFAULT_CHANNELS_PER_SAMPLE;
  private Context mContext = null;
  private boolean mEnableAgc = false;
  private byte[] mFrameBuffer;
  private byte[] mLeftBuffer;
  private WeakReference<TXIAudioRecordListener> mListener;
  private boolean mLoop;
  private AudioRecord mMic;
  private boolean mMicPermit = false;
  private boolean mMute = false;
  private byte[] mRecordBuffer;
  private byte[] mResampleBuf = null;
  private int mResampleRate = 0;
  private int mSampleRate = TXCAudioRecorder.DEFAULT_SAMPLE_RATE;
  private Thread mWorker;
  private boolean mbPause = false;
  
  private void agcProcess(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if ((paramInt == 0) || (paramArrayOfByte1 == null) || (paramArrayOfByte2 == null) || (paramArrayOfByte1.length != paramArrayOfByte2.length)) {
      return;
    }
    TXCAudioJNI.webrtcAgcProcessBytes(paramInt, paramArrayOfByte1, paramArrayOfByte2);
  }
  
  private AudioRecord chooseAudioDevice()
  {
    if (this.mChannel == 1) {}
    for (int i = 2;; i = 3)
    {
      if (this.mBits == 8) {}
      for (int j = 3;; j = 2)
      {
        int k = AudioRecord.getMinBufferSize(this.mSampleRate, i, j);
        try
        {
          if (this.mAECType == TXEAudioDef.TXE_AEC_NONE) {
            this.mMic = new AudioRecord(1, this.mSampleRate, i, j, k * 2);
          }
          while ((this.mMic == null) || (this.mMic.getState() != 1))
          {
            TXCLog.e(TAG, "initialize the mic failed.");
            onCaptureError(TXEAudioDef.TXE_AUDIO_RECORD_ERR_NO_MIC_PERMIT, "open mic failed when start recording!");
            this.mMicPermit = false;
            return null;
            if (this.mAECType == TXEAudioDef.TXE_AEC_SYSTEM)
            {
              if (this.mContext != null)
              {
                AudioManager localAudioManager = (AudioManager)this.mContext.getSystemService("audio");
                localAudioManager.setMode(3);
                if (!localAudioManager.isWiredHeadsetOn()) {
                  localAudioManager.setSpeakerphoneOn(true);
                }
              }
              this.mMic = new AudioRecord(7, this.mSampleRate, i, j, k * 2);
              if (this.mContext != null) {
                ((AudioManager)this.mContext.getSystemService("audio")).setMode(0);
              }
            }
          }
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          for (;;) {}
          this.mRecordBuffer = new byte[this.mBits * 960 * this.mChannel / 8];
          this.mFrameBuffer = new byte[this.mBits * 1024 * this.mChannel / 8];
          this.mLeftBuffer = new byte[this.mFrameBuffer.length];
          if ((this.mResampleRate > 0) && (this.mResampleRate != this.mSampleRate)) {
            this.mResampleBuf = new byte[this.mRecordBuffer.length * this.mSampleRate / this.mResampleRate];
          }
          TXCLog.i(TAG, String.format("mic open rate=%dHZ, channels=%d, bits=%d, buffer=%d/%d, state=%d", new Object[] { Integer.valueOf(this.mSampleRate), Integer.valueOf(this.mChannel), Integer.valueOf(this.mBits), Integer.valueOf(k), Integer.valueOf(this.mFrameBuffer.length), Integer.valueOf(this.mMic.getState()) }));
          return this.mMic;
        }
      }
    }
  }
  
  private void onCaptureError(int paramInt, String paramString)
  {
    if (this.mListener != null)
    {
      TXIAudioRecordListener localTXIAudioRecordListener = (TXIAudioRecordListener)this.mListener.get();
      if (localTXIAudioRecordListener != null) {
        localTXIAudioRecordListener.onRecordError(paramInt, paramString);
      }
    }
  }
  
  private void onCapturePcmData(byte[] paramArrayOfByte, long paramLong)
  {
    if (this.mListener != null)
    {
      TXIAudioRecordListener localTXIAudioRecordListener = (TXIAudioRecordListener)this.mListener.get();
      if (localTXIAudioRecordListener != null) {
        localTXIAudioRecordListener.onRecordPcmData(paramArrayOfByte, paramLong);
      }
    }
  }
  
  private void onGetPcmFrame(byte[] paramArrayOfByte, long paramLong)
  {
    if (this.mMute) {
      Arrays.fill(paramArrayOfByte, (byte)0);
    }
    if (!this.mbPause) {
      onCapturePcmData(paramArrayOfByte, paramLong);
    }
  }
  
  public boolean checkPermission()
  {
    return this.mMicPermit;
  }
  
  public void enalbeAgc(boolean paramBoolean)
  {
    this.mEnableAgc = paramBoolean;
  }
  
  public void fetchAudioFromDevice()
  {
    byte[] arrayOfByte1;
    int i;
    if ((this.mEnableAgc) && (((this.mResampleRate == 0) && (this.mSampleRate <= 16000)) || ((this.mResampleRate != 0) && (this.mResampleRate <= 16000))))
    {
      arrayOfByte1 = new byte[this.mRecordBuffer.length];
      if (this.mResampleRate == 0) {
        i = this.mSampleRate;
      }
    }
    for (int k = TXCAudioJNI.webrtcAgcCreate(i);; k = 0)
    {
      TXCAudioEffector localTXCAudioEffector;
      int j;
      if (this.mResampleBuf != null)
      {
        localTXCAudioEffector = new TXCAudioEffector();
        localTXCAudioEffector.initEffector();
        localTXCAudioEffector.initOneTrack(0, this.mResampleRate, this.mChannel, this.mBits);
        localTXCAudioEffector.initOneTrack(1, this.mSampleRate, this.mChannel, this.mBits);
        TXCLog.w(TAG, "sampleRate = " + this.mSampleRate + ", resampleRate = " + this.mResampleRate + ", channels = " + this.mChannel + ", bits = " + this.mBits);
        i = 0;
        j = 0;
      }
      for (;;)
      {
        int m;
        byte[] arrayOfByte2;
        if ((this.mLoop) && (this.mMic != null) && (!Thread.interrupted()) && (i <= 5)) {
          if (this.mResampleBuf != null)
          {
            m = this.mMic.read(this.mResampleBuf, 0, this.mResampleBuf.length);
            if (m != this.mResampleBuf.length)
            {
              if (m > 0) {
                continue;
              }
              TXCLog.e(TAG, "read pcm eror, len =" + m);
              i += 1;
              continue;
              i = this.mResampleRate;
              break;
            }
            if (localTXCAudioEffector != null)
            {
              arrayOfByte2 = localTXCAudioEffector.resampleData(1, this.mResampleBuf);
              if ((arrayOfByte2 == null) || (arrayOfByte2.length != this.mRecordBuffer.length)) {
                break label480;
              }
              if (arrayOfByte1 != null)
              {
                System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte1.length);
                agcProcess(k, arrayOfByte1, this.mRecordBuffer);
              }
            }
            else
            {
              label355:
              i = this.mRecordBuffer.length;
            }
          }
        }
        for (;;)
        {
          label361:
          if (i + j >= this.mFrameBuffer.length)
          {
            if (j > 0) {
              System.arraycopy(this.mLeftBuffer, 0, this.mFrameBuffer, 0, j);
            }
            m = this.mFrameBuffer.length - j;
            System.arraycopy(this.mRecordBuffer, 0, this.mFrameBuffer, j, m);
            if (i > m)
            {
              System.arraycopy(this.mRecordBuffer, m, this.mLeftBuffer, 0, i - m);
              i -= m;
            }
            for (;;)
            {
              onGetPcmFrame(this.mFrameBuffer, TXCTimeUtil.getTimeTick());
              j = i;
              i = 0;
              break;
              System.arraycopy(arrayOfByte2, 0, this.mRecordBuffer, 0, this.mRecordBuffer.length);
              break label355;
              label480:
              String str = TAG;
              StringBuilder localStringBuilder = new StringBuilder("resample error: retData size = ");
              if (arrayOfByte2 == null) {}
              for (i = 0;; i = arrayOfByte2.length)
              {
                TXCLog.e(str, i + ", needed size = " + this.mRecordBuffer.length + ", resample size = " + this.mResampleBuf.length);
                break;
              }
              if (arrayOfByte1 != null)
              {
                m = this.mMic.read(arrayOfByte1, 0, arrayOfByte1.length);
                if (m != arrayOfByte1.length)
                {
                  if (m > 0) {
                    break;
                  }
                  TXCLog.e(TAG, "read pcm eror, len =" + m);
                  i += 1;
                  break;
                }
                agcProcess(k, arrayOfByte1, this.mRecordBuffer);
                i = m;
                break label361;
              }
              if (arrayOfByte1 != null)
              {
                m = this.mMic.read(arrayOfByte1, 0, arrayOfByte1.length);
                if (m != arrayOfByte1.length)
                {
                  if (m > 0) {
                    break;
                  }
                  TXCLog.e(TAG, "read pcm eror, len =" + m);
                  i += 1;
                  break;
                }
                if (this.mEnableAgc)
                {
                  agcProcess(k, arrayOfByte1, this.mRecordBuffer);
                  i = m;
                  break label361;
                }
                System.arraycopy(arrayOfByte1, 0, this.mRecordBuffer, 0, this.mRecordBuffer.length);
                i = m;
                break label361;
              }
              m = this.mMic.read(this.mRecordBuffer, 0, this.mRecordBuffer.length);
              if (m == this.mRecordBuffer.length) {
                break label888;
              }
              if (m > 0) {
                break;
              }
              TXCLog.e(TAG, "read pcm eror, len =" + m);
              i += 1;
              break;
              i = 0;
            }
          }
          System.arraycopy(this.mRecordBuffer, 0, this.mLeftBuffer, j, i);
          j = i + j;
          i = 0;
          break;
          if (k != 0) {
            TXCAudioJNI.webrtcAgcFree(k);
          }
          if (localTXCAudioEffector != null)
          {
            localTXCAudioEffector.unInitAllTracks();
            localTXCAudioEffector.destoryEffector();
          }
          this.mListener = null;
          if (i > 5)
          {
            onCaptureError(TXEAudioDef.TXE_AUDIO_RECORD_ERR_NO_MIC_PERMIT, "open mic failed when start recording!");
            this.mMicPermit = false;
          }
          return;
          label888:
          i = m;
        }
        localTXCAudioEffector = null;
        i = 0;
        j = 0;
      }
      arrayOfByte1 = null;
    }
  }
  
  public void pause()
  {
    this.mbPause = true;
  }
  
  public void resume()
  {
    this.mbPause = false;
  }
  
  public void setMute(boolean paramBoolean)
  {
    this.mMute = paramBoolean;
  }
  
  public void setResampleRate(int paramInt)
  {
    this.mResampleRate = paramInt;
  }
  
  public void start(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, WeakReference<TXIAudioRecordListener> paramWeakReference)
  {
    stop();
    this.mContext = paramContext.getApplicationContext();
    this.mSampleRate = paramInt1;
    this.mChannel = paramInt2;
    this.mBits = paramInt3;
    this.mListener = paramWeakReference;
    this.mAECType = paramInt4;
    paramContext = chooseAudioDevice();
    this.mMic = paramContext;
    if (paramContext == null)
    {
      TXCLog.e(TAG, String.format("mic find device mode failed.", new Object[0]));
      this.mMicPermit = false;
      return;
    }
    this.mMicPermit = true;
    try
    {
      this.mMic.startRecording();
      this.mWorker = new Thread(new Runnable()
      {
        public void run()
        {
          TXCSysAudioCapturer.this.fetchAudioFromDevice();
        }
      });
      this.mWorker.setName("AudioSysRecord");
      TXCLog.i(TAG, "start audio worker thread.");
      this.mLoop = true;
      this.mWorker.start();
      return;
    }
    catch (Exception paramContext)
    {
      TXCLog.e(TAG, "mic startRecording failed.");
      onCaptureError(TXEAudioDef.TXE_AUDIO_RECORD_ERR_NO_MIC_PERMIT, "open mic failed when start recording!");
      this.mMicPermit = false;
    }
  }
  
  public void stop()
  {
    this.mSampleRate = TXCAudioRecorder.DEFAULT_SAMPLE_RATE;
    this.mChannel = TXCAudioRecorder.DEFAULT_CHANNELS_PER_SAMPLE;
    this.mBits = TXCAudioRecorder.DEFAULT_BITS_PER_CHANNEL;
    this.mAECType = TXCAudioRecorder.DEFAULT_AEC_TYPE;
    this.mLoop = false;
    if (this.mWorker != null) {
      TXCLog.i(TAG, "stop audio worker thread");
    }
    try
    {
      this.mWorker.join();
      this.mWorker = null;
      if (this.mMic != null) {
        TXCLog.i(TAG, "stop mic");
      }
      try
      {
        this.mMic.setRecordPositionUpdateListener(null);
        this.mMic.stop();
        this.mMic.release();
        this.mMic = null;
        if (this.mContext != null)
        {
          AudioManager localAudioManager = (AudioManager)this.mContext.getSystemService("audio");
          localAudioManager.setMode(0);
          localAudioManager.setSpeakerphoneOn(false);
        }
        return;
      }
      catch (Exception localException1)
      {
        for (;;) {}
      }
    }
    catch (Exception localException2)
    {
      for (;;) {}
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\audio\impl\Capturer\TXCSysAudioCapturer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */