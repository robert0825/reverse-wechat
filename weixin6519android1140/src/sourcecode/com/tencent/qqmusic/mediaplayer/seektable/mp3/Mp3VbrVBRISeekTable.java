package com.tencent.qqmusic.mediaplayer.seektable.mp3;

import com.tencent.qqmusic.mediaplayer.codec.mp3.MP3Information;

public class Mp3VbrVBRISeekTable
  extends Mp3SeekTable
{
  public long getPosition(long paramLong)
  {
    if (this.mInfo == null) {
      return 0L;
    }
    long[] arrayOfLong = this.mInfo.getTocTable();
    if ((arrayOfLong == null) || (arrayOfLong.length <= 0)) {
      return this.mFirstAudioFramePosition;
    }
    int i = (int)(paramLong * 1.0D / this.mDuration * (arrayOfLong.length - 1));
    long l1;
    long l2;
    label78:
    long l3;
    long l4;
    if (i < 0)
    {
      l1 = this.mFirstAudioFramePosition;
      if (i < arrayOfLong.length - 1) {
        break label136;
      }
      l2 = this.mFileLength;
      l3 = i * this.mDuration / (arrayOfLong.length - 1);
      l4 = (i + 1) * this.mDuration / (arrayOfLong.length - 1);
      if (l2 != l1) {
        break label147;
      }
    }
    label136:
    label147:
    for (paramLong = 0L;; paramLong = ((l2 - l1) * 1.0D * (paramLong - l3) / (l4 - l3)))
    {
      return l1 + paramLong;
      l1 = arrayOfLong[i];
      break;
      l2 = arrayOfLong[(i + 1)];
      break label78;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\seektable\mp3\Mp3VbrVBRISeekTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */