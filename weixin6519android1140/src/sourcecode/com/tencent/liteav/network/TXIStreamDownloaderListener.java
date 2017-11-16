package com.tencent.liteav.network;

import com.tencent.liteav.basic.structs.TXSAudioPacket;
import com.tencent.liteav.basic.structs.TXSNALPacket;

public abstract interface TXIStreamDownloaderListener
{
  public abstract void onPullAudio(TXSAudioPacket paramTXSAudioPacket);
  
  public abstract void onPullNAL(TXSNALPacket paramTXSNALPacket);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\network\TXIStreamDownloaderListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */