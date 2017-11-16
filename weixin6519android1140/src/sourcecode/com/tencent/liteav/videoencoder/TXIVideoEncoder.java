package com.tencent.liteav.videoencoder;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import com.tencent.liteav.basic.module.TXCModule;
import com.tencent.liteav.basic.opengl.TXCGPUFilter;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGLContext;

public class TXIVideoEncoder
  extends TXCModule
{
  protected volatile WeakReference<TXIVideoEncoderListener> listenerWeakReference = null;
  protected TXCGPUFilter mEncodeFilter;
  protected EGLContext mGLContextExternal = null;
  protected boolean mInit;
  protected TXCGPUFilter mInputFilter;
  protected int mInputHeight = 0;
  protected int mInputWidth = 0;
  protected int mOutputHeight = 0;
  protected int mOutputWidth = 0;
  
  protected void callDelegate(int paramInt)
  {
    callDelegate(null, 0, 0L, 0L, 0L, 0L, 0L, 0L, paramInt, null, null);
  }
  
  protected void callDelegate(MediaFormat paramMediaFormat)
  {
    if (this.listenerWeakReference != null)
    {
      TXIVideoEncoderListener localTXIVideoEncoderListener = (TXIVideoEncoderListener)this.listenerWeakReference.get();
      if (localTXIVideoEncoderListener != null) {
        localTXIVideoEncoderListener.onEncodeFormat(paramMediaFormat);
      }
    }
  }
  
  protected void callDelegate(byte[] paramArrayOfByte, int paramInt1, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt2, ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    if (paramByteBuffer == null)
    {
      paramByteBuffer = null;
      if (paramBufferInfo != null) {
        break label200;
      }
    }
    label200:
    for (MediaCodec.BufferInfo localBufferInfo = null;; localBufferInfo = new MediaCodec.BufferInfo())
    {
      if (localBufferInfo != null) {
        localBufferInfo.set(paramBufferInfo.offset, paramBufferInfo.size, paramBufferInfo.presentationTimeUs, paramBufferInfo.flags);
      }
      if (this.listenerWeakReference != null)
      {
        paramBufferInfo = (TXIVideoEncoderListener)this.listenerWeakReference.get();
        if (paramBufferInfo != null)
        {
          TXSNALPacket localTXSNALPacket = new TXSNALPacket();
          localTXSNALPacket.nalData = paramArrayOfByte;
          localTXSNALPacket.nalType = paramInt1;
          localTXSNALPacket.gopIndex = paramLong1;
          localTXSNALPacket.gopFrameIndex = paramLong2;
          localTXSNALPacket.frameIndex = paramLong3;
          localTXSNALPacket.refFremeIndex = paramLong4;
          localTXSNALPacket.pts = paramLong5;
          localTXSNALPacket.dts = paramLong6;
          localTXSNALPacket.buffer = paramByteBuffer;
          localTXSNALPacket.info = localBufferInfo;
          paramBufferInfo.onEncodeNAL(localTXSNALPacket, paramInt2);
          setStatusValue(4002, Integer.valueOf((int)getRealBitrate()));
          setStatusValue(4001, Double.valueOf(getRealFPS()));
        }
      }
      return;
      paramByteBuffer = paramByteBuffer.asReadOnlyBuffer();
      break;
    }
  }
  
  public long getRealBitrate()
  {
    return 0L;
  }
  
  public long getRealFPS()
  {
    return 0L;
  }
  
  public int getVideoHeight()
  {
    return this.mOutputHeight;
  }
  
  public int getVideoWidth()
  {
    return this.mOutputWidth;
  }
  
  public long pushVideoFrame(int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    return 10000002L;
  }
  
  public void setBitrate(int paramInt) {}
  
  public void setFPS(int paramInt) {}
  
  public void setListener(TXIVideoEncoderListener paramTXIVideoEncoderListener)
  {
    this.listenerWeakReference = new WeakReference(paramTXIVideoEncoderListener);
  }
  
  public int start(TXSVideoEncoderParam paramTXSVideoEncoderParam)
  {
    if (paramTXSVideoEncoderParam != null)
    {
      this.mOutputWidth = paramTXSVideoEncoderParam.width;
      this.mOutputHeight = paramTXSVideoEncoderParam.height;
      this.mGLContextExternal = paramTXSVideoEncoderParam.glContext;
    }
    return 10000002;
  }
  
  public void stop() {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\videoencoder\TXIVideoEncoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */