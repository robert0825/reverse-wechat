package com.tencent.qqmusic.mediaplayer.upstream;

import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;

public class DefaultNativeDataSource
  implements INativeDataSource
{
  private final AudioFormat.AudioType audioType;
  private final long nativeInstance;
  
  public DefaultNativeDataSource(long paramLong, AudioFormat.AudioType paramAudioType)
  {
    this.nativeInstance = paramLong;
    this.audioType = paramAudioType;
  }
  
  public AudioFormat.AudioType getAudioType()
  {
    return this.audioType;
  }
  
  public long getNativeInstance()
  {
    return this.nativeInstance;
  }
  
  public String toString()
  {
    return "DefaultNativeDataSource";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\upstream\DefaultNativeDataSource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */