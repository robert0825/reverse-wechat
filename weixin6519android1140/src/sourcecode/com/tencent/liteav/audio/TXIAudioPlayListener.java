package com.tencent.liteav.audio;

import com.tencent.liteav.basic.structs.TXSAudioPacket;

public abstract interface TXIAudioPlayListener
{
  public abstract void onPlayAudioInfoChanged(TXSAudioPacket paramTXSAudioPacket);
  
  public abstract void onPlayError(int paramInt, String paramString);
  
  public abstract void onPlayJitterStateNotify(int paramInt);
  
  public abstract void onPlayPcmData(byte[] paramArrayOfByte, long paramLong);
  
  public abstract void onPlaySpeedPcmData(byte[] paramArrayOfByte, long paramLong);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\audio\TXIAudioPlayListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */