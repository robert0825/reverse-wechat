package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

import com.tencent.qqmusic.mediaplayer.seektable.Parsable;

public class Mdhd
  extends FullBox
{
  long creationTime;
  long duration;
  long modificationTime;
  byte[] remaining;
  int timeScale;
  
  public long getCreationTime()
  {
    return this.creationTime;
  }
  
  public long getDuration()
  {
    return this.duration;
  }
  
  public long getModificationTime()
  {
    return this.modificationTime;
  }
  
  public int getTimeScale()
  {
    return this.timeScale;
  }
  
  public void parse(Parsable paramParsable, Box paramBox)
  {
    super.parse(paramParsable, paramBox);
    if (this.version == 1)
    {
      this.creationTime = paramParsable.readLong();
      this.modificationTime = paramParsable.readLong();
      this.timeScale = paramParsable.readInt();
    }
    for (this.duration = paramParsable.readLong();; this.duration = paramParsable.readInt())
    {
      this.remaining = new byte[4];
      paramParsable.readBytes(this.remaining, 0, this.remaining.length);
      return;
      this.creationTime = paramParsable.readInt();
      this.modificationTime = paramParsable.readInt();
      this.timeScale = paramParsable.readInt();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\seektable\mpeg4\boxes\Mdhd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */