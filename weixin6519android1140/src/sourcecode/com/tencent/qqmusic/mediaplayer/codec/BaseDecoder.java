package com.tencent.qqmusic.mediaplayer.codec;

import android.text.TextUtils;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.AudioInformation;
import com.tencent.qqmusic.mediaplayer.AudioPlayerConfigure;
import com.tencent.qqmusic.mediaplayer.ISoLibraryLoader;
import com.tencent.qqmusic.mediaplayer.SoNotFindException;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import com.tencent.qqmusic.mediaplayer.util.Util4Phone;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class BaseDecoder
{
  private static final String TAG = "BaseDecoder";
  private AudioFormat.AudioType mAudioType = null;
  private final boolean mHasLoadSoSuccess;
  public int mNativeApeDecoderRef = 0;
  
  public BaseDecoder()
  {
    Object localObject;
    boolean bool1;
    if (Util4Phone.isSupportNeon())
    {
      localObject = getSoNameListForV7a();
      if ((localObject != null) && (!((List)localObject).isEmpty())) {
        localObject = ((List)localObject).iterator();
      }
      while (((Iterator)localObject).hasNext()) {
        if (!loadLibrary((String)((Iterator)localObject).next())) {
          bool1 = false;
        }
      }
    }
    for (;;)
    {
      if (!bool1)
      {
        localObject = getSoNameList();
        if ((localObject != null) && (!((List)localObject).isEmpty()))
        {
          localObject = ((List)localObject).iterator();
          do
          {
            bool1 = bool2;
            if (!((Iterator)localObject).hasNext()) {
              break;
            }
          } while (loadLibrary((String)((Iterator)localObject).next()));
        }
        bool1 = false;
      }
      for (;;)
      {
        this.mHasLoadSoSuccess = bool1;
        return;
        bool1 = true;
        break;
      }
      bool1 = false;
    }
  }
  
  private boolean loadLibrary(String paramString)
  {
    boolean bool1 = false;
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    try
    {
      boolean bool2 = AudioPlayerConfigure.getSoLibraryLoader().load(paramString);
      bool1 = bool2;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        Logger.e("BaseDecoder", "load library exception ", localThrowable);
      }
    }
    Logger.d("BaseDecoder", "loadLibrary  mHasLoadSoSuccess = " + this.mHasLoadSoSuccess + ",soName = " + paramString);
    return bool1;
  }
  
  public boolean checkFormatBySoftDecoder(String paramString)
  {
    throwIfSoNotLoadSuccess();
    try
    {
      if (init(paramString, false) == 0)
      {
        paramString = getAudioInformation();
        if ((paramString != null) && (paramString.getSampleRate() > 0L))
        {
          long l = paramString.getDuration();
          if (l > 0L) {
            try
            {
              release();
              return true;
            }
            catch (Throwable paramString)
            {
              for (;;)
              {
                Logger.e("BaseDecoder", paramString);
              }
            }
          }
        }
      }
      try
      {
        release();
        return false;
      }
      catch (Throwable paramString)
      {
        Logger.e("BaseDecoder", paramString);
        return false;
      }
      try
      {
        release();
        throw paramString;
      }
      catch (Throwable localThrowable)
      {
        for (;;)
        {
          Logger.e("BaseDecoder", localThrowable);
        }
      }
    }
    catch (Throwable paramString)
    {
      paramString = paramString;
      Logger.e("BaseDecoder", paramString);
      try
      {
        release();
        return false;
      }
      catch (Throwable paramString)
      {
        Logger.e("BaseDecoder", paramString);
        return false;
      }
    }
    finally {}
  }
  
  public int decodeData(int paramInt, short[] paramArrayOfShort)
  {
    throwIfSoNotLoadSuccess();
    return -1;
  }
  
  public AudioInformation getAudioInformation()
  {
    throwIfSoNotLoadSuccess();
    return null;
  }
  
  public AudioFormat.AudioType getAudioType()
  {
    return this.mAudioType;
  }
  
  public abstract AudioFormat.AudioType getAudioType(String paramString, byte[] paramArrayOfByte);
  
  public long getCurrentTime()
  {
    throwIfSoNotLoadSuccess();
    return -1L;
  }
  
  public int getErrorCodeMask()
  {
    return -1;
  }
  
  public abstract List<String> getSoNameList();
  
  public List<String> getSoNameListForV7a()
  {
    return new ArrayList();
  }
  
  public abstract AudioFormat.AudioType guessAudioType(String paramString);
  
  public int init(IDataSource paramIDataSource)
  {
    throwIfSoNotLoadSuccess();
    return -1;
  }
  
  public int init(INativeDataSource paramINativeDataSource)
  {
    throwIfSoNotLoadSuccess();
    return -1;
  }
  
  public int init(String paramString, boolean paramBoolean)
  {
    throwIfSoNotLoadSuccess();
    return -1;
  }
  
  public int release()
  {
    throwIfSoNotLoadSuccess();
    return -1;
  }
  
  public int seekTo(int paramInt)
  {
    throwIfSoNotLoadSuccess();
    return -1;
  }
  
  public void setAudioType(AudioFormat.AudioType paramAudioType)
  {
    this.mAudioType = paramAudioType;
  }
  
  public void throwIfSoNotLoadSuccess()
  {
    if (!this.mHasLoadSoSuccess) {
      throw new SoNotFindException("has't load so success , can't call native funcation");
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\codec\BaseDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */