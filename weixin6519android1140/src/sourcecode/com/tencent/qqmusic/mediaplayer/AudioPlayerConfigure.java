package com.tencent.qqmusic.mediaplayer;

import com.tencent.qqmusic.mediaplayer.util.Logger;

public class AudioPlayerConfigure
{
  private static final String TAG = "AudioPlayerConfigure";
  private static ISoLibraryLoader mISoLibraryLoader = new ISoLibraryLoader()
  {
    public final boolean load(String paramAnonymousString)
    {
      System.loadLibrary(paramAnonymousString);
      return true;
    }
  };
  
  public static ISoLibraryLoader getSoLibraryLoader()
  {
    return mISoLibraryLoader;
  }
  
  public static void setLog(ILog paramILog)
  {
    if (paramILog != null) {
      paramILog.i("AudioPlayerConfigure", "QQMusicAudioPlayer version name:0.5.7");
    }
    Logger.setLog(paramILog);
  }
  
  public static void setSoLibraryLoader(ISoLibraryLoader paramISoLibraryLoader)
  {
    if (paramISoLibraryLoader != null) {
      mISoLibraryLoader = paramISoLibraryLoader;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\AudioPlayerConfigure.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */