package com.tencent.liteav.videodecoder;

import android.graphics.SurfaceTexture;
import com.tencent.liteav.basic.listener.TXINotifyListener;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

public abstract interface IVideoDecoder
{
  public abstract int config(SurfaceTexture paramSurfaceTexture);
  
  public abstract void decode(byte[] paramArrayOfByte, long paramLong1, long paramLong2);
  
  public abstract void setListener(TXIVideoDecoderListener paramTXIVideoDecoderListener);
  
  public abstract void setNotifyListener(WeakReference<TXINotifyListener> paramWeakReference);
  
  public abstract int start(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2, boolean paramBoolean);
  
  public abstract void stop();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\videodecoder\IVideoDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */