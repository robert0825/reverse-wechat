package com.tencent.qqmusic.mediaplayer.codec.mp3;

import android.text.TextUtils;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.AudioInformation;
import com.tencent.qqmusic.mediaplayer.codec.BaseDecoder;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.util.ArrayList;
import java.util.List;

public class MP3Decoder
  extends BaseDecoder
{
  private static final String TAG = "MP3_DECODER";
  private long mFileLength = 0L;
  private String mFilePath = null;
  private long mFirstAudioFramePosition = -1L;
  private volatile boolean mHasRelease = false;
  private long mId3Size = -1L;
  private AudioInformation mInfo = null;
  
  private native void nCleanupLib();
  
  private native int nDecodeMP3(int paramInt, short[] paramArrayOfShort);
  
  private native MP3Information nGetAudioInformation();
  
  private native int nGetCurPosition();
  
  private native int nInitInputBuffer(int paramInt);
  
  private native int nInitMp3(String paramString, int paramInt);
  
  private native int nInitMp3WithDataSource(IDataSource paramIDataSource);
  
  private native int nInitMp3WithNativeDataSource(long paramLong);
  
  private native int nSeekTo(int paramInt);
  
  public int decodeData(int paramInt, short[] paramArrayOfShort)
  {
    throwIfSoNotLoadSuccess();
    return nDecodeMP3(paramInt, paramArrayOfShort);
  }
  
  public AudioInformation getAudioInformation()
  {
    throwIfSoNotLoadSuccess();
    if ((this.mInfo == null) || (this.mInfo.getDuration() <= 0L) || (this.mInfo.getBitrate() <= 0) || (this.mInfo.getSampleRate() <= 0L)) {
      this.mInfo = nGetAudioInformation();
    }
    if ((!TextUtils.isEmpty(this.mFilePath)) && (this.mInfo != null) && (this.mId3Size == -1L))
    {
      this.mId3Size = ((MP3Information)this.mInfo).getId3v2Size();
      this.mId3Size = Math.max(this.mId3Size, 0L);
    }
    if ((this.mInfo != null) && (!this.mInfo.durationIsCorrect()))
    {
      MP3Information localMP3Information = (MP3Information)this.mInfo;
      long l;
      if ((localMP3Information.getFirstFramePos() >= 0L) && (localMP3Information.getFirstFrameSize() >= 0L))
      {
        l = localMP3Information.getFirstFramePos();
        this.mFirstAudioFramePosition = (localMP3Information.getFirstFrameSize() + l);
      }
      if (!this.mInfo.isCbr())
      {
        l = nGetFileLengthInVBRFrame();
        if (l > 0L) {
          this.mFileLength = l;
        }
        ((MP3Information)this.mInfo).setTocTable(nGetVBRTOCTable());
        if (((MP3Information)this.mInfo).getTocTable() == null) {
          Logger.e("MP3_DECODER", "dont have toc tables");
        }
      }
    }
    return this.mInfo;
  }
  
  public AudioFormat.AudioType getAudioType(String paramString, byte[] paramArrayOfByte)
  {
    if (MP3FileCheck.isMp3File(paramString)) {
      return AudioFormat.AudioType.MP3;
    }
    return AudioFormat.AudioType.UNSUPPORT;
  }
  
  public long getCurrentTime()
  {
    throwIfSoNotLoadSuccess();
    return nGetCurPosition();
  }
  
  public long getDuration(String paramString, long paramLong)
  {
    paramString = new MP3FileCheck(paramString);
    paramString.fileCheck();
    int i = paramString.getFrameSize();
    return ((float)paramLong / i * 26.0F);
  }
  
  public int getErrorCodeMask()
  {
    return 134217727;
  }
  
  protected List<String> getSoNameList()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add("qmmpg123");
    return localArrayList;
  }
  
  public AudioFormat.AudioType guessAudioType(String paramString)
  {
    if ((!TextUtils.isEmpty(paramString)) && ((paramString.toLowerCase().endsWith(".mp3")) || (paramString.endsWith(".mp3.tmp")) || (paramString.endsWith(".mp3.mqcc")) || (paramString.endsWith(".ofl")) || (paramString.endsWith(".efe")))) {
      return AudioFormat.AudioType.MP3;
    }
    return AudioFormat.AudioType.UNSUPPORT;
  }
  
  public int init(IDataSource paramIDataSource)
  {
    throwIfSoNotLoadSuccess();
    return nInitMp3WithDataSource(paramIDataSource);
  }
  
  public int init(INativeDataSource paramINativeDataSource)
  {
    throwIfSoNotLoadSuccess();
    return nInitMp3WithNativeDataSource(paramINativeDataSource.getNativeInstance());
  }
  
  public int init(String paramString, boolean paramBoolean)
  {
    throwIfSoNotLoadSuccess();
    this.mFilePath = paramString;
    if (paramBoolean) {}
    for (int i = 0;; i = 1) {
      return nInitMp3(paramString, i);
    }
  }
  
  public int initInputBuffer(int paramInt)
  {
    throwIfSoNotLoadSuccess();
    return nInitInputBuffer(paramInt);
  }
  
  public native long nGetFileLengthInVBRFrame();
  
  public native long[] nGetVBRTOCTable();
  
  public native void nSetNativeFileLength(long paramLong);
  
  public int release()
  {
    throwIfSoNotLoadSuccess();
    if (!this.mHasRelease)
    {
      this.mHasRelease = true;
      Logger.i("MP3Decoder", this + "release");
    }
    try
    {
      nCleanupLib();
      return 0;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        Logger.e("MP3_DECODER", localThrowable);
        Logger.e("MP3Decoder", localThrowable);
      }
    }
  }
  
  public int seekTo(int paramInt)
  {
    throwIfSoNotLoadSuccess();
    return nSeekTo(paramInt);
  }
  
  public void setFileTotalLength(long paramLong)
  {
    this.mFileLength = paramLong;
    Logger.i("MP3_DECODER", "setFileTotalLength mFileLength = " + this.mFileLength);
    nSetNativeFileLength(paramLong);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\codec\mp3\MP3Decoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */