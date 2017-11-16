package com.tencent.qqmusic.mediaplayer;

import com.tencent.qqmusic.mediaplayer.codec.BaseDecoder;
import com.tencent.qqmusic.mediaplayer.codec.ape.ApeDecoder;
import com.tencent.qqmusic.mediaplayer.codec.ffmpeg.FfmpegPlayer;
import com.tencent.qqmusic.mediaplayer.codec.flac.FLACDecoder;
import com.tencent.qqmusic.mediaplayer.codec.mp3.MP3Decoder;
import com.tencent.qqmusic.mediaplayer.codec.ogg.VorbisDecoder;
import com.tencent.qqmusic.mediaplayer.codec.wav.WavDecoder;
import com.tencent.qqmusic.mediaplayer.codec.wma.WmaDecoder;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.util.ArrayList;
import java.util.HashMap;

public class MediaCodecFactory
{
  private static final String TAG = "MediaCodecFactory";
  private static HashMap<AudioFormat.AudioType, Class<? extends BaseDecoder>> mDecoderMap = new HashMap();
  private static ArrayList<AudioFormat.AudioType> mSupportAudioType = new ArrayList();
  
  static
  {
    registerDecoder(AudioFormat.AudioType.M4A, FfmpegPlayer.class);
    registerDecoder(AudioFormat.AudioType.OGG, VorbisDecoder.class);
    registerDecoder(AudioFormat.AudioType.FLAC, FLACDecoder.class);
    registerDecoder(AudioFormat.AudioType.MP3, MP3Decoder.class);
    registerDecoder(AudioFormat.AudioType.APE, ApeDecoder.class);
    registerDecoder(AudioFormat.AudioType.WAV, WavDecoder.class);
    registerDecoder(AudioFormat.AudioType.WMA, WmaDecoder.class);
    registerDecoder(AudioFormat.AudioType.MP4, FfmpegPlayer.class);
    registerDecoder(AudioFormat.AudioType.AAC, FfmpegPlayer.class);
  }
  
  public static BaseDecoder createDecoderByType(AudioFormat.AudioType paramAudioType)
  {
    if (!AudioFormat.isAudioType(paramAudioType)) {
      return null;
    }
    if (mDecoderMap.containsKey(paramAudioType)) {}
    for (;;)
    {
      try
      {
        BaseDecoder localBaseDecoder = (BaseDecoder)((Class)mDecoderMap.get(paramAudioType)).newInstance();
        Logger.e("MediaCodecFactory", "createDecoderByType error", localThrowable1);
      }
      catch (Throwable localThrowable1)
      {
        try
        {
          localBaseDecoder.setAudioType(paramAudioType);
          paramAudioType = localBaseDecoder;
          return paramAudioType;
        }
        catch (Throwable localThrowable2)
        {
          for (;;)
          {
            paramAudioType = localThrowable1;
            Object localObject = localThrowable2;
          }
        }
        localThrowable1 = localThrowable1;
        paramAudioType = null;
      }
      continue;
      paramAudioType = null;
    }
  }
  
  public static ArrayList<AudioFormat.AudioType> getSupportAudioType()
  {
    return new ArrayList(mSupportAudioType);
  }
  
  public static void registerDecoder(AudioFormat.AudioType paramAudioType, Class<? extends BaseDecoder> paramClass)
  {
    mDecoderMap.put(paramAudioType, paramClass);
    mSupportAudioType.add(paramAudioType);
  }
  
  public static void unRegisterDecoder(AudioFormat.AudioType paramAudioType)
  {
    mSupportAudioType.remove(paramAudioType);
    mDecoderMap.remove(paramAudioType);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\MediaCodecFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */