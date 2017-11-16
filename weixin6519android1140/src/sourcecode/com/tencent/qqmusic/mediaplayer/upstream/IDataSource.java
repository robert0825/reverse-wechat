package com.tencent.qqmusic.mediaplayer.upstream;

import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import java.io.Closeable;

public abstract interface IDataSource
  extends Closeable
{
  public abstract AudioFormat.AudioType getAudioType();
  
  public abstract long getSize();
  
  public abstract void open();
  
  public abstract int readAt(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public static abstract interface Factory
  {
    public abstract IDataSource createDataSource();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\upstream\IDataSource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */