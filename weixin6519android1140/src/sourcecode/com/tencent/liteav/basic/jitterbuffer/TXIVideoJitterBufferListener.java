package com.tencent.liteav.basic.jitterbuffer;

import com.tencent.liteav.basic.structs.TXSNALPacket;

public abstract interface TXIVideoJitterBufferListener
{
  public abstract void onNALAvaliable(TXSNALPacket paramTXSNALPacket);
  
  public abstract long onRequestAudioBufferDuration();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\basic\jitterbuffer\TXIVideoJitterBufferListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */