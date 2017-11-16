package com.tencent.liteav.audio.impl.Decoder;

import com.tencent.liteav.audio.TXIAudioPlayListener;
import com.tencent.liteav.basic.structs.TXSAudioPacket;
import java.lang.ref.WeakReference;

public abstract interface TXIAudioDecoder
{
  public abstract void doDecodec(TXSAudioPacket paramTXSAudioPacket);
  
  public abstract void init(int paramInt, WeakReference<TXIAudioPlayListener> paramWeakReference);
  
  public abstract void unInit();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\audio\impl\Decoder\TXIAudioDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */