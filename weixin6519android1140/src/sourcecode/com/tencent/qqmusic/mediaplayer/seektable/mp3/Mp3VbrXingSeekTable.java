package com.tencent.qqmusic.mediaplayer.seektable.mp3;

import com.tencent.qqmusic.mediaplayer.codec.mp3.MP3Information;

public class Mp3VbrXingSeekTable
  extends Mp3SeekTable
{
  public long getPosition(long paramLong)
  {
    float f2 = 256.0F;
    float f3 = 0.0F;
    if (this.mInfo == null) {
      return 0L;
    }
    long[] arrayOfLong = this.mInfo.getTocTable();
    if (arrayOfLong == null) {
      return this.mFirstAudioFramePosition;
    }
    float f4 = (float)paramLong * 100.0F / (float)this.mDuration;
    if (f4 <= 0.0F) {
      f1 = 0.0F;
    }
    do
    {
      return Math.min(Math.round(f1 * 0.00390625D * this.mFileLength) + this.mFirstAudioFramePosition, this.mFirstAudioFramePosition - this.mId3Size + this.mFileLength - 1L);
      f1 = f2;
    } while (f4 >= 100.0F);
    int i = (int)f4;
    if (i == 0) {}
    for (float f1 = f3;; f1 = (float)arrayOfLong[(i - 1)])
    {
      if (i < 99) {
        f2 = (float)arrayOfLong[i];
      }
      f1 = (f2 - f1) * (f4 - i) + f1;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\seektable\mp3\Mp3VbrXingSeekTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */