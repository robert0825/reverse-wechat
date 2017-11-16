package com.tencent.liteav.videodecoder;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.liteav.basic.listener.TXINotifyListener;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCSystemUtil;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class TXCVideoMediaCodecDecoder
  implements IVideoDecoder
{
  private static final long MAX_DEC_INTERVAL = 1000L;
  private static final String TAG = "MediaCodecDecoder";
  private MediaCodec.BufferInfo mBufferInfo = new MediaCodec.BufferInfo();
  private MediaCodec mDecoder = null;
  private int mDecoderCacheNum = 0;
  private ArrayList<byte[]> mListBuffer = new ArrayList();
  private TXIVideoDecoderListener mListener;
  private String mMimeType = "video/avc";
  private WeakReference<TXINotifyListener> mNotifyListener;
  private boolean mNotifyVideoResolution = true;
  private boolean mRecvKeyFrame = false;
  private SurfaceTexture mSurfaceTexture = null;
  private long mTSLastVideoFrame = 0L;
  private long mTSVideoLagWarning = 0L;
  private int mVideoHeight = 960;
  private int mVideoWidth = 540;
  
  private void checkPlaySmooth()
  {
    if (this.mTSLastVideoFrame == 0L) {
      TXCLog.w("MediaCodecDecoder", "decode first frame sucess");
    }
    long l = System.currentTimeMillis();
    if ((this.mTSLastVideoFrame > 0L) && (l > this.mTSLastVideoFrame + 1000L) && (l > this.mTSVideoLagWarning + 2000L) && (this.mTSVideoLagWarning != 0L))
    {
      TXCLog.e("MediaCodecDecoder", "frame interval[" + (l - this.mTSLastVideoFrame) + "] > 1000");
      this.mTSVideoLagWarning = l;
    }
    if (this.mTSVideoLagWarning == 0L) {
      this.mTSVideoLagWarning = l;
    }
    this.mTSLastVideoFrame = l;
  }
  
  @TargetApi(16)
  private void doDecode()
  {
    if (this.mDecoder == null) {
      TXCLog.e("MediaCodecDecoder", "null decoder");
    }
    int i;
    for (;;)
    {
      return;
      byte[] arrayOfByte = (byte[])this.mListBuffer.get(0);
      if ((arrayOfByte == null) || (arrayOfByte.length == 0))
      {
        TXCLog.e("MediaCodecDecoder", "empty buffer");
        this.mListBuffer.remove(0);
        if (this.mListener != null) {
          this.mListener.onDecodeFrame(1);
        }
      }
      else
      {
        long l = System.nanoTime() / 1000L;
        ByteBuffer[] arrayOfByteBuffer = this.mDecoder.getInputBuffers();
        if ((arrayOfByteBuffer == null) || (arrayOfByteBuffer.length == 0))
        {
          TXCLog.e("MediaCodecDecoder", "getInputBuffers failed");
          return;
        }
        try
        {
          i = this.mDecoder.dequeueInputBuffer(10000L);
          if (i >= 0)
          {
            arrayOfByteBuffer[i].put(arrayOfByte);
            this.mDecoder.queueInputBuffer(i, 0, arrayOfByte.length, l, 0);
            this.mListBuffer.remove(0);
            this.mDecoderCacheNum += 1;
            if (this.mTSLastVideoFrame == 0L) {
              TXCLog.w("MediaCodecDecoder", "input buffer available, dequeueInputBuffer index: " + i);
            }
          }
        }
        catch (Exception localException2)
        {
          try
          {
            for (;;)
            {
              i = this.mDecoder.dequeueOutputBuffer(this.mBufferInfo, 10000L);
              if (i < 0) {
                break label313;
              }
              renderOutputBuffer(i, l, l);
              if (this.mDecoderCacheNum <= 0) {
                break;
              }
              this.mDecoderCacheNum -= 1;
              return;
              localException2 = localException2;
              TXCLog.e("MediaCodecDecoder", "dequeueInputBuffer Exception!! " + localException2);
              i = 55536;
              continue;
              TXCLog.w("MediaCodecDecoder", "input buffer not available, dequeueInputBuffer failed");
            }
          }
          catch (Exception localException1)
          {
            for (;;)
            {
              TXCLog.e("MediaCodecDecoder", "dequeueOutputBuffer exception!!" + localException1);
              i = 55536;
            }
          }
        }
      }
    }
    label313:
    if (i == -1) {}
    try
    {
      Thread.sleep(10L);
      TXCLog.d("MediaCodecDecoder", "no output from decoder available");
      return;
      if (i == -3)
      {
        TXCLog.d("MediaCodecDecoder", "decoder output buffers changed");
        return;
      }
      if (i == -2)
      {
        outputFormatChange();
        return;
      }
      TXCLog.e("MediaCodecDecoder", "unexpected result from decoder.dequeueOutputBuffer: " + i);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  private int initDecoder(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2)
  {
    int i = 1;
    int j = 0;
    for (;;)
    {
      try
      {
        if ((this.mDecoder != null) || (this.mSurfaceTexture == null))
        {
          TXCLog.e("MediaCodecDecoder", "init decoder error, can not init for decoder=" + this.mDecoder + ",surface=" + this.mSurfaceTexture);
          return -1;
        }
        MediaFormat localMediaFormat = MediaFormat.createVideoFormat(this.mMimeType, this.mVideoWidth, this.mVideoHeight);
        if (paramByteBuffer1 != null) {
          localMediaFormat.setByteBuffer("csd-0", paramByteBuffer1);
        }
        if (paramByteBuffer2 != null) {
          localMediaFormat.setByteBuffer("csd-1", paramByteBuffer2);
        }
        this.mDecoder = MediaCodec.createDecoderByType(this.mMimeType);
        int k;
        TXCLog.e("MediaCodecDecoder", "vrender init decoder " + i + " step exception: " + paramByteBuffer1.toString());
      }
      catch (Exception paramByteBuffer1)
      {
        try
        {
          this.mDecoder.configure(localMediaFormat, new Surface(this.mSurfaceTexture), null, 0);
          k = 2;
          i = k;
          TXCLog.w("MediaCodecDecoder", "config decoder sucess");
          i = k;
          this.mDecoder.setVideoScalingMode(1);
          k = 3;
          i = k;
          TXCLog.w("MediaCodecDecoder", "set decoder scalingmod sucess");
          i = k;
          this.mDecoder.start();
          i = 4;
          TXCLog.w("MediaCodecDecoder", "vrender start decoder sucess");
          i = j;
          return i;
        }
        catch (Exception paramByteBuffer1)
        {
          for (;;) {}
        }
        paramByteBuffer1 = paramByteBuffer1;
        i = 0;
      }
      this.mDecoder = null;
      TXCSystemUtil.notifyEvent(this.mNotifyListener, 2106, "硬解启动失败，采用软解");
      i = -1;
    }
  }
  
  private void outputFormatChange()
  {
    MediaFormat localMediaFormat = this.mDecoder.getOutputFormat();
    TXCLog.d("MediaCodecDecoder", "decoder output format changed: " + localMediaFormat);
    int k = Math.abs(localMediaFormat.getInteger("crop-right") - localMediaFormat.getInteger("crop-left"));
    int i = Math.abs(localMediaFormat.getInteger("crop-bottom") - localMediaFormat.getInteger("crop-top"));
    int m = localMediaFormat.getInteger("width");
    int j = localMediaFormat.getInteger("height");
    k = Math.min(k + 1, m);
    i = Math.min(i + 1, j);
    if ((k != this.mVideoWidth) || (i != this.mVideoHeight))
    {
      this.mVideoWidth = k;
      this.mVideoHeight = i;
    }
    try
    {
      if (this.mListener != null) {
        this.mListener.onVideoSizeChange(this.mVideoWidth, this.mVideoHeight);
      }
      TXCLog.d("MediaCodecDecoder", "video size change to w:" + k + ",h:" + i);
      do
      {
        do
        {
          return;
        } while (!this.mNotifyVideoResolution);
        this.mNotifyVideoResolution = false;
      } while (this.mListener == null);
      this.mListener.onVideoSizeChange(this.mVideoWidth, this.mVideoHeight);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  private void releaseDecoder()
  {
    if (this.mDecoder != null) {}
    for (;;)
    {
      try
      {
        this.mDecoder.stop();
        TXCLog.w("MediaCodecDecoder", "stop decoder sucess");
      }
      catch (Exception localException2)
      {
        TXCLog.e("MediaCodecDecoder", "stop decoder Exception: " + localException2.toString());
        try
        {
          this.mDecoder.release();
          TXCLog.w("MediaCodecDecoder", "release decoder sucess");
          this.mDecoder = null;
          continue;
        }
        catch (Exception localException3)
        {
          TXCLog.e("MediaCodecDecoder", "release decoder exception: " + localException3.toString());
          this.mDecoder = null;
          continue;
        }
        finally
        {
          this.mDecoder = null;
        }
      }
      finally
      {
        try
        {
          this.mDecoder.release();
          TXCLog.w("MediaCodecDecoder", "release decoder sucess");
        }
        catch (Exception localException4)
        {
          TXCLog.e("MediaCodecDecoder", "release decoder exception: " + localException4.toString());
          this.mDecoder = null;
          continue;
        }
        finally
        {
          this.mDecoder = null;
        }
      }
      try
      {
        this.mDecoder.release();
        TXCLog.w("MediaCodecDecoder", "release decoder sucess");
      }
      catch (Exception localException1)
      {
        TXCLog.e("MediaCodecDecoder", "release decoder exception: " + localException1.toString());
        this.mDecoder = null;
      }
      finally
      {
        this.mDecoder = null;
      }
    }
    this.mListBuffer.clear();
    this.mTSLastVideoFrame = 0L;
    this.mNotifyVideoResolution = true;
    this.mRecvKeyFrame = false;
    this.mDecoderCacheNum = 0;
  }
  
  private void renderOutputBuffer(int paramInt, long paramLong1, long paramLong2)
  {
    this.mDecoder.releaseOutputBuffer(paramInt, true);
    if ((this.mBufferInfo.flags & 0x4) != 0) {
      TXCLog.d("MediaCodecDecoder", "output EOS");
    }
    try
    {
      if (this.mListener != null)
      {
        this.mListener.onDecodeFrame(this.mSurfaceTexture, this.mVideoWidth, this.mVideoHeight, paramLong1, paramLong2);
        this.mListener.onDecodeFrame(1);
      }
      checkPlaySmooth();
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public int config(SurfaceTexture paramSurfaceTexture)
  {
    if (paramSurfaceTexture == null) {
      return -1;
    }
    this.mSurfaceTexture = paramSurfaceTexture;
    return 0;
  }
  
  public void decode(byte[] paramArrayOfByte, long paramLong1, long paramLong2)
  {
    this.mListBuffer.add(paramArrayOfByte);
    int i;
    do
    {
      if (this.mListBuffer.isEmpty()) {
        break;
      }
      i = this.mListBuffer.size();
      doDecode();
    } while (i != this.mListBuffer.size());
  }
  
  public void setListener(TXIVideoDecoderListener paramTXIVideoDecoderListener)
  {
    this.mListener = paramTXIVideoDecoderListener;
  }
  
  public void setNotifyListener(WeakReference<TXINotifyListener> paramWeakReference)
  {
    this.mNotifyListener = paramWeakReference;
  }
  
  public int start(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2, boolean paramBoolean)
  {
    return initDecoder(paramByteBuffer1, paramByteBuffer2);
  }
  
  public void stop()
  {
    releaseDecoder();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\videodecoder\TXCVideoMediaCodecDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */