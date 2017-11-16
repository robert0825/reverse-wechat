package com.tencent.qqmusic.mediaplayer.upstream;

import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;

public abstract interface INativeDataSource
{
  public abstract AudioFormat.AudioType getAudioType();
  
  public abstract long getNativeInstance();
  
  public static abstract interface Factory
  {
    public abstract INativeDataSource createDataSource();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\upstream\INativeDataSource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */