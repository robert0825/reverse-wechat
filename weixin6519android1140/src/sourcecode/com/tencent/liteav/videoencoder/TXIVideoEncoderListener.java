package com.tencent.liteav.videoencoder;

import android.media.MediaFormat;
import com.tencent.liteav.basic.structs.TXSNALPacket;

public abstract interface TXIVideoEncoderListener
{
  public abstract void onEncodeFormat(MediaFormat paramMediaFormat);
  
  public abstract void onEncodeNAL(TXSNALPacket paramTXSNALPacket, int paramInt);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\videoencoder\TXIVideoEncoderListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */