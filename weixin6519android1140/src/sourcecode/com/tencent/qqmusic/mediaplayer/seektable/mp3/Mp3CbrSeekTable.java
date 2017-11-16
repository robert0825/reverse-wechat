package com.tencent.qqmusic.mediaplayer.seektable.mp3;

import com.tencent.qqmusic.mediaplayer.codec.mp3.MP3Information;

public class Mp3CbrSeekTable
  extends Mp3SeekTable
{
  public long getPosition(long paramLong)
  {
    long l1 = this.mInfo.getBitrate();
    long l2 = this.mId3Size;
    return l1 / 8L * paramLong + l2;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\seektable\mp3\Mp3CbrSeekTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */