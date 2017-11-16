package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

import com.tencent.qqmusic.mediaplayer.seektable.Parsable;

public class Stsz
  extends FullBox
{
  int[] entrySize;
  int sampleCount;
  int sampleSize;
  
  public int[] getEntrySize()
  {
    return this.entrySize;
  }
  
  public int getSampleCount()
  {
    return this.sampleCount;
  }
  
  public int getSampleSize()
  {
    return this.sampleSize;
  }
  
  public void parse(Parsable paramParsable, Box paramBox)
  {
    super.parse(paramParsable, paramBox);
    this.sampleSize = paramParsable.readInt();
    this.sampleCount = paramParsable.readInt();
    if (this.sampleSize == 0) {
      this.entrySize = paramParsable.readIntArray(this.sampleCount);
    }
    if ((this.sampleSize == 0) && (this.sampleCount == 0)) {
      throw new InvalidBoxException("invalide stsz: both [sample_count] and [sample_size] is 0!");
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\seektable\mpeg4\boxes\Stsz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */