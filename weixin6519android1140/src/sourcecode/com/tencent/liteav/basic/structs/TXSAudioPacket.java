package com.tencent.liteav.basic.structs;

public class TXSAudioPacket
  implements Cloneable
{
  public byte[] audioData;
  public int bitsPerChannel;
  public int channelsPerSample;
  public int packetType;
  public int sampleRate;
  public long timestamp;
  
  public Object clone()
  {
    try
    {
      TXSAudioPacket localTXSAudioPacket = (TXSAudioPacket)super.clone();
      return localTXSAudioPacket;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException) {}
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\basic\structs\TXSAudioPacket.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */