package com.tencent.liteav.audio.impl.Decoder;

import com.tencent.liteav.audio.TXIAudioPlayListener;
import com.tencent.liteav.audio.impl.TXCAudioUtil;
import com.tencent.liteav.basic.structs.TXSAudioPacket;
import com.tencent.liteav.basic.util.TXCSystemUtil;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class TXCAudioSoftDecoder
  implements TXIAudioDecoder
{
  private static final int TXE_AUDIO_DATA_TYPE_AAC_HEADER = 2;
  private static final int TXE_AUDIO_DATA_TYPE_AAC_RAWDATA = 3;
  private WeakReference<TXIAudioPlayListener> mListener = null;
  private long mNativeCodec = 0L;
  
  static {}
  
  private native byte[] nativeDecodec(long paramLong1, byte[] paramArrayOfByte, int paramInt, long paramLong2);
  
  private native long nativeInit(int paramInt);
  
  private native void nativeUnInit(long paramLong);
  
  public void doDecodec(TXSAudioPacket paramTXSAudioPacket)
  {
    byte[] arrayOfByte;
    if (0L != this.mNativeCodec)
    {
      arrayOfByte = nativeDecodec(this.mNativeCodec, paramTXSAudioPacket.audioData, paramTXSAudioPacket.packetType + 1, paramTXSAudioPacket.timestamp);
      if ((arrayOfByte != null) && (arrayOfByte.length == 9))
      {
        int i = TXCAudioUtil.byteArrayToInt(Arrays.copyOfRange(arrayOfByte, 0, 4));
        int j = TXCAudioUtil.byteArrayToInt(Arrays.copyOfRange(arrayOfByte, 4, 8));
        int k = Arrays.copyOfRange(arrayOfByte, 8, 9)[0];
        paramTXSAudioPacket = new TXSAudioPacket();
        paramTXSAudioPacket.sampleRate = i;
        paramTXSAudioPacket.channelsPerSample = j;
        paramTXSAudioPacket.bitsPerChannel = k;
        onPlayAudioInfoChanged(paramTXSAudioPacket);
      }
    }
    else
    {
      return;
    }
    onPlayPcmData(arrayOfByte, paramTXSAudioPacket.timestamp);
  }
  
  public void init(int paramInt, WeakReference<TXIAudioPlayListener> paramWeakReference)
  {
    this.mListener = paramWeakReference;
    this.mNativeCodec = nativeInit(paramInt);
  }
  
  void onPlayAudioInfoChanged(TXSAudioPacket paramTXSAudioPacket)
  {
    if (this.mListener != null) {
      ((TXIAudioPlayListener)this.mListener.get()).onPlayAudioInfoChanged(paramTXSAudioPacket);
    }
  }
  
  void onPlayPcmData(byte[] paramArrayOfByte, long paramLong)
  {
    if (this.mListener != null) {
      ((TXIAudioPlayListener)this.mListener.get()).onPlayPcmData(paramArrayOfByte, paramLong);
    }
  }
  
  public void unInit()
  {
    this.mListener = null;
    nativeUnInit(this.mNativeCodec);
    this.mNativeCodec = 0L;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\liteav\audio\impl\Decoder\TXCAudioSoftDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */