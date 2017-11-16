package com.tencent.qqmusic.mediaplayer.seektable.mp3;

import com.tencent.qqmusic.mediaplayer.codec.mp3.MP3Information;
import com.tencent.qqmusic.mediaplayer.seektable.SeekTable;
import java.io.InputStream;

public abstract class Mp3SeekTable
  implements SeekTable
{
  private static final String TAG = "Mp3SeekTable";
  protected long mDuration = 0L;
  protected long mFileLength = 0L;
  protected long mFirstAudioFramePosition = 0L;
  protected long mId3Size = -1L;
  protected MP3Information mInfo = null;
  
  public abstract long getPosition(long paramLong);
  
  public void parse(InputStream paramInputStream)
  {
    if (this.mInfo != null)
    {
      this.mId3Size = this.mInfo.getId3v2Size();
      this.mId3Size = Math.max(this.mId3Size, 0L);
      if (this.mInfo.getFileLengthInBytes() > 0L) {
        this.mFileLength = this.mInfo.getFileLengthInBytes();
      }
      if ((this.mInfo.getFirstFramePos() >= 0L) && (this.mInfo.getFirstFrameSize() >= 0L)) {
        this.mFirstAudioFramePosition = (this.mInfo.getFirstFramePos() + this.mInfo.getFirstFrameSize());
      }
      this.mDuration = this.mInfo.getDuration();
    }
  }
  
  public long seek(long paramLong)
  {
    return getPosition(paramLong);
  }
  
  public void setAudioInfomation(MP3Information paramMP3Information)
  {
    this.mInfo = paramMP3Information;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\seektable\mp3\Mp3SeekTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */