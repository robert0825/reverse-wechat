package com.tencent.liteav.audio.impl.Encoder;

import com.tencent.liteav.audio.TXIAudioRecordListener;
import java.lang.ref.WeakReference;

public abstract interface TXIAudioEncoder
{
  public abstract void doEncodec(byte[] paramArrayOfByte, long paramLong);
  
  public abstract void init(int paramInt1, int paramInt2, int paramInt3, int paramInt4, WeakReference<TXIAudioRecordListener> paramWeakReference);
  
  public abstract void setReverbType(int paramInt);
  
  public abstract void unInit();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\audio\impl\Encoder\TXIAudioEncoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */