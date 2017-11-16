package com.tencent.qqmusic.mediaplayer.formatdetector;

import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.AudioPlayerConfigure;
import com.tencent.qqmusic.mediaplayer.AudioRecognition;
import com.tencent.qqmusic.mediaplayer.ISoLibraryLoader;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.util.Logger;

public class FormatDetector
{
  private static final String SO_NAME = "FormatDetector";
  private static final String TAG = "FormatDetector";
  private static FormatDetector mInstance = new FormatDetector();
  public static boolean sIsLoadSuccess;
  
  static
  {
    boolean bool2 = false;
    sIsLoadSuccess = false;
    try
    {
      ISoLibraryLoader localISoLibraryLoader = AudioPlayerConfigure.getSoLibraryLoader();
      boolean bool1 = bool2;
      if (localISoLibraryLoader.load("audio_common"))
      {
        bool1 = bool2;
        if (localISoLibraryLoader.load("FormatDetector")) {
          bool1 = true;
        }
      }
      sIsLoadSuccess = bool1;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        Logger.e("FormatDetector", "failed to load so!", localThrowable);
      }
    }
  }
  
  public static AudioFormat.AudioType getAudioFormat(IDataSource paramIDataSource, boolean paramBoolean)
  {
    AudioFormat.AudioType localAudioType = AudioFormat.AudioType.UNSUPPORT;
    try
    {
      paramIDataSource = AudioFormat.getAudioType(mInstance.getFormatFromDataSource(paramIDataSource, paramBoolean));
      return paramIDataSource;
    }
    catch (UnsatisfiedLinkError paramIDataSource)
    {
      Logger.e("FormatDetector", paramIDataSource);
    }
    return localAudioType;
  }
  
  public static AudioFormat.AudioType getAudioFormat(String paramString)
  {
    return getAudioFormat(paramString, true);
  }
  
  public static AudioFormat.AudioType getAudioFormat(String paramString, boolean paramBoolean)
  {
    try
    {
      AudioFormat.AudioType localAudioType = AudioFormat.getAudioType(mInstance.getFormat(paramString, paramBoolean));
      return localAudioType;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      Logger.e("FormatDetector", localUnsatisfiedLinkError);
    }
    return AudioRecognition.guessFormat(paramString);
  }
  
  private native int getFormat(String paramString, boolean paramBoolean);
  
  private native int getFormatFromDataSource(IDataSource paramIDataSource, boolean paramBoolean);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\formatdetector\FormatDetector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */