package com.tencent.liteav.audio.impl.Capturer;

import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import com.tencent.liteav.audio.impl.TXCAudioRecorderWrapper;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class TXAudioRecorder
{
  private static final int ABITRATE_KBPS = 24;
  private static final String ACODEC = "audio/mp4a-latm";
  private static final String TAG = TXAudioRecorder.class.getSimpleName();
  private static boolean mHasPrivilege = false;
  private int mBits = 16;
  private int mChannel = 1;
  private MediaCodec.BufferInfo mEncodeInfo;
  private MediaCodec mEncoder;
  private byte[] mFrameBuffer;
  private boolean mHWEncode = false;
  private byte[] mLeftBuffer;
  private boolean mLoop;
  private AudioRecord mMic;
  private boolean mMute = false;
  private long mPresentationTimeUs;
  private byte[] mRecordBuffer;
  RecordListener mRecordListener = null;
  private int mSampleRate = 48000;
  private Thread mWorker;
  private boolean mbPause = false;
  
  public static boolean checkPermission(int paramInt)
  {
    if (mHasPrivilege) {
      return mHasPrivilege;
    }
    long l = TXCTimeUtil.getTimeTick();
    Object localObject = new TXAudioRecorder();
    ((TXAudioRecorder)localObject).setAudioParam(paramInt, 1, 16);
    localObject = ((TXAudioRecorder)localObject).chooseAudioDevice();
    if (localObject != null) {}
    try
    {
      ((AudioRecord)localObject).release();
      TXCLog.d(TAG, "checkPermission cost=" + (TXCTimeUtil.getTimeTick() - l));
      if (localObject != null) {
        mHasPrivilege = true;
      }
      return mHasPrivilege;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  private void initEncoder()
  {
    this.mPresentationTimeUs = TXCTimeUtil.getTimeTick();
    try
    {
      this.mEncoder = MediaCodec.createEncoderByType("audio/mp4a-latm");
      this.mEncodeInfo = new MediaCodec.BufferInfo();
      MediaFormat localMediaFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", this.mSampleRate, this.mChannel);
      localMediaFormat.setInteger("bitrate", 24000);
      localMediaFormat.setInteger("max-input-size", 0);
      this.mEncoder.configure(localMediaFormat, null, null, 1);
      TXCLog.i(TAG, "start aac aencoder");
      this.mEncoder.start();
      return;
    }
    catch (IOException localIOException)
    {
      TXCLog.e(TAG, "create aencoder failed.");
    }
  }
  
  private void onGetPcmFrameH(byte[] paramArrayOfByte)
  {
    Object localObject = this.mEncoder.getInputBuffers();
    ByteBuffer[] arrayOfByteBuffer = this.mEncoder.getOutputBuffers();
    int i = this.mEncoder.dequeueInputBuffer(-1L);
    if (i >= 0)
    {
      localObject = localObject[i];
      ((ByteBuffer)localObject).clear();
      ((ByteBuffer)localObject).put(paramArrayOfByte, 0, paramArrayOfByte.length);
      long l1 = TXCTimeUtil.getTimeTick();
      long l2 = this.mPresentationTimeUs;
      this.mEncoder.queueInputBuffer(i, 0, paramArrayOfByte.length, l1 - l2, 0);
    }
    for (;;)
    {
      i = this.mEncoder.dequeueOutputBuffer(this.mEncodeInfo, 0L);
      if (i < 0) {
        break;
      }
      paramArrayOfByte = arrayOfByteBuffer[i];
      localObject = new byte[this.mEncodeInfo.size];
      paramArrayOfByte.get((byte[])localObject, 0, localObject.length);
      if (this.mMute) {
        Arrays.fill((byte[])localObject, (byte)0);
      }
      this.mEncoder.releaseOutputBuffer(i, false);
    }
  }
  
  private void onGetPcmFrameS(byte[] paramArrayOfByte)
  {
    if (this.mMute) {
      Arrays.fill(paramArrayOfByte, (byte)0);
    }
    if ((this.mbPause) || (this.mRecordListener != null)) {}
    try
    {
      this.mRecordListener.onPcmData(paramArrayOfByte, this.mSampleRate, this.mChannel);
      return;
    }
    catch (Exception paramArrayOfByte) {}
    TXCAudioRecorderWrapper.getInstance().onRecordPcmData(paramArrayOfByte, TXCTimeUtil.getTimeTick());
    return;
  }
  
  public void Pause()
  {
    this.mbPause = true;
  }
  
  public void Resume()
  {
    this.mbPause = false;
  }
  
  public AudioRecord chooseAudioDevice()
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
          this.mMic = new AudioRecord(1, this.mSampleRate, i, j, k * 2);
          if ((this.mMic == null) || (this.mMic.getState() != 1))
          {
            TXCLog.e(TAG, "initialize the mic failed.");
            return null;
          }
          this.mRecordBuffer = new byte[k];
          this.mFrameBuffer = new byte[this.mBits * 1024 * this.mChannel / 8];
          this.mLeftBuffer = new byte[this.mFrameBuffer.length];
          TXCLog.i(TAG, String.format("mic open rate=%dHZ, channels=%d, bits=%d, buffer=%d/%d, state=%d", new Object[] { Integer.valueOf(this.mSampleRate), Integer.valueOf(this.mChannel), Integer.valueOf(this.mBits), Integer.valueOf(k), Integer.valueOf(this.mFrameBuffer.length), Integer.valueOf(this.mMic.getState()) }));
          return this.mMic;
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          for (;;) {}
        }
      }
    }
  }
  
  public void fetchAudioFromDevice()
  {
    int i = 0;
    int j = 0;
    while ((this.mLoop) && (this.mMic != null) && (!Thread.interrupted()) && (i <= 5))
    {
      int k;
      if (this.mRecordBuffer.length >= this.mFrameBuffer.length)
      {
        k = this.mMic.read(this.mFrameBuffer, 0, this.mFrameBuffer.length);
        if (k != this.mFrameBuffer.length)
        {
          if (k <= 0)
          {
            TXCLog.e(TAG, "read pcm eror, len =" + k);
            i += 1;
          }
        }
        else if (this.mHWEncode)
        {
          onGetPcmFrameH(this.mFrameBuffer);
          i = 0;
        }
        else
        {
          onGetPcmFrameS(this.mFrameBuffer);
          i = 0;
        }
      }
      else
      {
        k = this.mMic.read(this.mRecordBuffer, 0, this.mRecordBuffer.length);
        if (k != this.mRecordBuffer.length)
        {
          if (k <= 0)
          {
            TXCLog.e(TAG, "read pcm eror, len =" + k);
            i += 1;
          }
        }
        else if (k + j >= this.mFrameBuffer.length)
        {
          if (j > 0) {
            System.arraycopy(this.mLeftBuffer, 0, this.mFrameBuffer, 0, j);
          }
          i = this.mFrameBuffer.length - j;
          System.arraycopy(this.mRecordBuffer, 0, this.mFrameBuffer, j, i);
          if (k > i) {
            System.arraycopy(this.mRecordBuffer, i, this.mLeftBuffer, 0, k - i);
          }
          for (i = k - i;; i = 0)
          {
            if (!this.mHWEncode) {
              break label300;
            }
            onGetPcmFrameH(this.mFrameBuffer);
            j = i;
            i = 0;
            break;
          }
          label300:
          onGetPcmFrameS(this.mFrameBuffer);
          j = i;
          i = 0;
        }
        else
        {
          System.arraycopy(this.mRecordBuffer, 0, this.mLeftBuffer, j, k);
          j += k;
          i = 0;
        }
      }
    }
  }
  
  public void setAudioParam(int paramInt1, int paramInt2, int paramInt3)
  {
    this.mSampleRate = paramInt1;
    this.mChannel = paramInt2;
    this.mBits = paramInt3;
  }
  
  public void setMute(boolean paramBoolean)
  {
    this.mMute = paramBoolean;
  }
  
  public void setRecordListener(RecordListener paramRecordListener)
  {
    this.mRecordListener = paramRecordListener;
  }
  
  public void start()
  {
    stop();
    AudioRecord localAudioRecord = chooseAudioDevice();
    this.mMic = localAudioRecord;
    if (localAudioRecord == null)
    {
      TXCLog.e(TAG, String.format("mic find device mode failed.", new Object[0]));
      return;
    }
    if (this.mHWEncode) {
      initEncoder();
    }
    try
    {
      this.mMic.startRecording();
      this.mWorker = new Thread(new Runnable()
      {
        public void run()
        {
          TXAudioRecorder.this.fetchAudioFromDevice();
        }
      });
      this.mWorker.setName("AudioRecord");
      TXCLog.i(TAG, "start audio worker thread.");
      this.mLoop = true;
      this.mWorker.start();
      return;
    }
    catch (Exception localException)
    {
      TXCLog.e(TAG, "mic startRecording failed.");
    }
  }
  
  public void stop()
  {
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
        if (this.mEncoder != null)
        {
          TXCLog.i(TAG, "stop aencoder");
          this.mEncoder.stop();
          this.mEncoder.release();
          this.mEncoder = null;
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
  
  public static abstract interface RecordListener
  {
    public abstract void onPcmData(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\liteav\audio\impl\Capturer\TXAudioRecorder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */