package com.tencent.qqmusic.mediaplayer.util;

import com.tencent.qqmusic.mediaplayer.AudioPlayerConfigure;
import com.tencent.qqmusic.mediaplayer.ISoLibraryLoader;

public class Util4NativeCommon
{
  private static final String TAG = "Util4NativeCommon";
  
  static
  {
    try
    {
      AudioPlayerConfigure.getSoLibraryLoader().load("audio_common");
      return;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      Logger.e("Util4NativeCommon", localUnsatisfiedLinkError);
      return;
    }
    catch (Throwable localThrowable)
    {
      Logger.e("Util4NativeCommon", localThrowable);
    }
  }
  
  public static native boolean isSupportNeon();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\util\Util4NativeCommon.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */