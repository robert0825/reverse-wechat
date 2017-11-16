package com.tencent.qqmusic.mediaplayer.codec.ape;

import android.text.TextUtils;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.AudioInformation;
import com.tencent.qqmusic.mediaplayer.codec.BaseDecoder;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.util.ArrayList;
import java.util.List;

public class ApeDecoder
  extends BaseDecoder
{
  private static final String APE_SO_NAME = "ape";
  private static final String APE_SO_NEON_NAME = "apev7a";
  public static final String TAG = "ApeDecoder";
  private volatile boolean mHasRelease = false;
  
  private native void nCleanupApeLib();
  
  private native int nDecodeApe(int paramInt, short[] paramArrayOfShort);
  
  private native AudioInformation nGetAudioInformation();
  
  private native int nGetCurPosition();
  
  private native int nGetDuration();
  
  private native int nInitApeLib(String paramString, int paramInt);
  
  private native boolean nIsApeFormat(String paramString);
  
  private native int nSeekTo(int paramInt);
  
  public int decodeData(int paramInt, short[] paramArrayOfShort)
  {
    super.decodeData(paramInt, paramArrayOfShort);
    return nDecodeApe(paramInt, paramArrayOfShort);
  }
  
  public AudioInformation getAudioInformation()
  {
    super.getAudioInformation();
    return nGetAudioInformation();
  }
  
  public AudioFormat.AudioType getAudioType(String paramString, byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0) && (new String(paramArrayOfByte).startsWith("MAC"))) {
      return AudioFormat.AudioType.APE;
    }
    throwIfSoNotLoadSuccess();
    if (nIsApeFormat(paramString)) {
      return AudioFormat.AudioType.APE;
    }
    return AudioFormat.AudioType.UNSUPPORT;
  }
  
  public long getCurrentTime()
  {
    super.getCurrentTime();
    return nGetCurPosition();
  }
  
  public int getErrorCodeMask()
  {
    return 50331647;
  }
  
  protected List<String> getSoNameList()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add("ape");
    return localArrayList;
  }
  
  protected List<String> getSoNameListForV7a()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add("apev7a");
    return localArrayList;
  }
  
  public AudioFormat.AudioType guessAudioType(String paramString)
  {
    if ((!TextUtils.isEmpty(paramString)) && ((paramString.toLowerCase().contains(".ape")) || (paramString.toLowerCase().contains(".mac")))) {
      return AudioFormat.AudioType.APE;
    }
    return AudioFormat.AudioType.UNSUPPORT;
  }
  
  public int init(String paramString, boolean paramBoolean)
  {
    super.init(paramString, paramBoolean);
    if (paramBoolean) {}
    for (int i = 0;; i = 1) {
      return nInitApeLib(paramString, i);
    }
  }
  
  public native int nSeekToExactly(int paramInt);
  
  public int release()
  {
    super.release();
    if (!this.mHasRelease)
    {
      this.mHasRelease = true;
      Logger.w("ApeDecoder", this + "release");
      nCleanupApeLib();
    }
    return 0;
  }
  
  public int seekTo(int paramInt)
  {
    super.seekTo(paramInt);
    return nSeekTo(paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\codec\ape\ApeDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */