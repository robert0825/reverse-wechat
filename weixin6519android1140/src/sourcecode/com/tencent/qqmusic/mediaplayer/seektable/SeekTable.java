package com.tencent.qqmusic.mediaplayer.seektable;

import java.io.InputStream;

public abstract interface SeekTable
{
  public abstract void parse(InputStream paramInputStream);
  
  public abstract long seek(long paramLong);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\seektable\SeekTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */