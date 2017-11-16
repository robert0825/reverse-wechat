package com.tencent.liteav.audio.impl.Effects;

import com.tencent.liteav.basic.util.TXCSystemUtil;

public class TXCAudioEffector
{
  private long mNativeEffector = 0L;
  
  static {}
  
  private static native void nativeAddAudio(long paramLong, int paramInt, byte[] paramArrayOfByte);
  
  private static native long nativeEffectorCreate();
  
  private static native long nativeEffectorDestory(long paramLong);
  
  private static native int nativeInitOneTrack(long paramLong, int paramInt1, int paramInt2, int paramInt3);
  
  private static native void nativeInitOneTrackEx(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  private static native byte[] nativeMixAudio(long paramLong);
  
  private static native byte[] nativeMixAudioEx(long paramLong, byte[] paramArrayOfByte);
  
  private static native byte[] nativeResampleData(long paramLong, int paramInt, byte[] paramArrayOfByte);
  
  private static native void nativeSetReverb(long paramLong, int paramInt1, int paramInt2);
  
  private static native void nativeSetVolume(long paramLong, int paramInt, float paramFloat);
  
  private static native void nativeUninitAllTracks(long paramLong);
  
  public void addAudio(int paramInt, byte[] paramArrayOfByte)
  {
    nativeAddAudio(this.mNativeEffector, paramInt, paramArrayOfByte);
  }
  
  public void destoryEffector()
  {
    nativeEffectorDestory(this.mNativeEffector);
  }
  
  public void initEffector()
  {
    this.mNativeEffector = nativeEffectorCreate();
  }
  
  public int initOneTrack(int paramInt1, int paramInt2, int paramInt3)
  {
    return nativeInitOneTrack(this.mNativeEffector, paramInt1, paramInt2, paramInt3);
  }
  
  public void initOneTrack(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    nativeInitOneTrackEx(this.mNativeEffector, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public byte[] mixAudio()
  {
    return nativeMixAudio(this.mNativeEffector);
  }
  
  public byte[] resampleData(int paramInt, byte[] paramArrayOfByte)
  {
    return nativeResampleData(this.mNativeEffector, paramInt, paramArrayOfByte);
  }
  
  public void setReverb(int paramInt)
  {
    nativeSetReverb(this.mNativeEffector, -1, paramInt);
  }
  
  public void setVolume(int paramInt, float paramFloat)
  {
    nativeSetVolume(this.mNativeEffector, paramInt, paramFloat);
  }
  
  public void unInitAllTracks()
  {
    nativeUninitAllTracks(this.mNativeEffector);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\audio\impl\Effects\TXCAudioEffector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */