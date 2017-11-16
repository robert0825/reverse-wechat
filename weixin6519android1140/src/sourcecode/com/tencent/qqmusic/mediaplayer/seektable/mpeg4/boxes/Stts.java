package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

import com.tencent.qqmusic.mediaplayer.seektable.Parsable;

public class Stts
  extends FullBox
{
  int entryCount;
  int[] sampleCount;
  int[] sampleDelta;
  
  public int getEntryCount()
  {
    return this.entryCount;
  }
  
  public int[] getSampleCount()
  {
    return this.sampleCount;
  }
  
  public int[] getSampleDelta()
  {
    return this.sampleDelta;
  }
  
  public void parse(Parsable paramParsable, Box paramBox)
  {
    super.parse(paramParsable, paramBox);
    this.entryCount = paramParsable.readInt();
    this.sampleCount = new int[this.entryCount];
    this.sampleDelta = new int[this.entryCount];
    paramParsable.readIntArrayInterleaved(this.entryCount, new int[][] { this.sampleCount, this.sampleDelta });
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\seektable\mpeg4\boxes\Stts.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */