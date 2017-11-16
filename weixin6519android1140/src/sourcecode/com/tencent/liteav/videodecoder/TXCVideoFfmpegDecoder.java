package com.tencent.liteav.videodecoder;

import android.graphics.SurfaceTexture;
import com.tencent.liteav.basic.listener.TXINotifyListener;
import com.tencent.liteav.basic.util.TXCSystemUtil;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

public class TXCVideoFfmpegDecoder
  implements IVideoDecoder
{
  private boolean mFirstDec;
  private TXIVideoDecoderListener mListener;
  private long mNativeDecoder;
  private long mNativeNotify;
  private ByteBuffer mPps;
  private byte[] mRawData;
  private ByteBuffer mSps;
  private int mVideoHeight;
  private int mVideoWidth;
  
  static
  {
    TXCSystemUtil.loadLiteAVLibrary();
    nativeClassInit();
  }
  
  private static native void nativeClassInit();
  
  private native boolean nativeDecode(byte[] paramArrayOfByte, long paramLong1, long paramLong2);
  
  private native void nativeInit(WeakReference<TXCVideoFfmpegDecoder> paramWeakReference, boolean paramBoolean);
  
  private native void nativeLoadRawData(byte[] paramArrayOfByte, long paramLong, int paramInt);
  
  private native void nativeRelease();
  
  private static void postEventFromNative(WeakReference<TXCVideoFfmpegDecoder> paramWeakReference, long paramLong1, int paramInt1, int paramInt2, long paramLong2, long paramLong3)
  {
    paramWeakReference = (TXCVideoFfmpegDecoder)paramWeakReference.get();
    if (paramWeakReference != null)
    {
      TXIVideoDecoderListener localTXIVideoDecoderListener = paramWeakReference.mListener;
      if (localTXIVideoDecoderListener != null)
      {
        localTXIVideoDecoderListener.onDecodeFrame(paramLong1, paramInt1, paramInt2, paramLong2, paramLong3);
        localTXIVideoDecoderListener.onDecodeFrame(1);
        if ((paramWeakReference.mVideoWidth != paramInt1) || (paramWeakReference.mVideoHeight != paramInt2))
        {
          paramWeakReference.mVideoWidth = paramInt1;
          paramWeakReference.mVideoHeight = paramInt2;
          localTXIVideoDecoderListener.onVideoSizeChange(paramWeakReference.mVideoWidth, paramWeakReference.mVideoHeight);
        }
      }
    }
  }
  
  public int config(SurfaceTexture paramSurfaceTexture)
  {
    return 0;
  }
  
  public void decode(byte[] paramArrayOfByte, long paramLong1, long paramLong2)
  {
    if (this.mFirstDec)
    {
      if ((this.mSps != null) && (this.mPps != null))
      {
        byte[] arrayOfByte1 = this.mSps.array();
        byte[] arrayOfByte2 = this.mPps.array();
        byte[] arrayOfByte3 = new byte[arrayOfByte1.length + arrayOfByte2.length];
        System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 0, arrayOfByte1.length);
        System.arraycopy(arrayOfByte2, 0, arrayOfByte3, arrayOfByte1.length, arrayOfByte2.length);
        nativeDecode(arrayOfByte3, paramLong1 - 1L, paramLong2 - 1L);
      }
      this.mFirstDec = false;
    }
    if ((!nativeDecode(paramArrayOfByte, paramLong1, paramLong2)) && (this.mListener != null)) {
      this.mListener.onDecodeFrame(1);
    }
  }
  
  public void loadNativeData(byte[] paramArrayOfByte, long paramLong, int paramInt)
  {
    nativeLoadRawData(paramArrayOfByte, paramLong, paramInt);
  }
  
  public void setListener(TXIVideoDecoderListener paramTXIVideoDecoderListener)
  {
    this.mListener = paramTXIVideoDecoderListener;
  }
  
  public void setNotifyListener(WeakReference<TXINotifyListener> paramWeakReference) {}
  
  public int start(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2, boolean paramBoolean)
  {
    this.mSps = paramByteBuffer1;
    this.mPps = paramByteBuffer2;
    this.mFirstDec = true;
    this.mVideoWidth = 0;
    this.mVideoHeight = 0;
    nativeInit(new WeakReference(this), paramBoolean);
    return 0;
  }
  
  public void stop()
  {
    nativeRelease();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\videodecoder\TXCVideoFfmpegDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */