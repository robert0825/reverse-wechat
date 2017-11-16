package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

import com.tencent.qqmusic.mediaplayer.seektable.Parsable;

public class Co64
  extends FullBox
{
  private long[] chunkOffset;
  private int entryCount;
  
  public long[] getChunkOffset()
  {
    return this.chunkOffset;
  }
  
  public int getEntryCount()
  {
    return this.entryCount;
  }
  
  public void parse(Parsable paramParsable, Box paramBox)
  {
    super.parse(paramParsable, paramBox);
    this.entryCount = paramParsable.readInt();
    this.chunkOffset = paramParsable.readLongArray(this.entryCount);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\seektable\mpeg4\boxes\Co64.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */