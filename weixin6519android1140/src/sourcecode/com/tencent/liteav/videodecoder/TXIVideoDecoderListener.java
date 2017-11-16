package com.tencent.liteav.videodecoder;

import android.graphics.SurfaceTexture;

public abstract interface TXIVideoDecoderListener
{
  public abstract void onDecodeFrame(int paramInt);
  
  public abstract void onDecodeFrame(long paramLong1, int paramInt1, int paramInt2, long paramLong2, long paramLong3);
  
  public abstract void onDecodeFrame(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public abstract void onVideoSizeChange(int paramInt1, int paramInt2);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\videodecoder\TXIVideoDecoderListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */