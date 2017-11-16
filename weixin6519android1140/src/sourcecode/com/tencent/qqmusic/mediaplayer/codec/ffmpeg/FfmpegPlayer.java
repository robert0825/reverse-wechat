package com.tencent.qqmusic.mediaplayer.codec.ffmpeg;

import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.AudioInformation;
import com.tencent.qqmusic.mediaplayer.codec.BaseDecoder;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource;
import java.util.ArrayList;
import java.util.List;

public class FfmpegPlayer
  extends BaseDecoder
{
  private static final String SO_AUDIO_COMMON = "audio_common";
  private static final String SO_BASE_NAME = "FFmpeg";
  private static final String SO_NAME = "ffmpeg_decoder";
  private static final String SO_NEON_BASE_NAME = "FFmpeg_v7a";
  private static final String SO_NEON_NAME = "ffmpeg_decoder_v7a";
  private static final String TAG = "FfmpegPlayer";
  private boolean mHasRelease = false;
  
  private native int nativeDecode(int paramInt, short[] paramArrayOfShort);
  
  private native AudioInformation nativeGetAudioInformation();
  
  private native long nativeGetDuration();
  
  private native long nativeGetPosition();
  
  private native int nativeInit(String paramString);
  
  private native int nativeInitDataSource(IDataSource paramIDataSource);
  
  private native int nativeInitNativeDataSource(long paramLong);
  
  private native int nativeRelease();
  
  private native int nativeSeek(int paramInt);
  
  public int decodeData(int paramInt, short[] paramArrayOfShort)
  {
    super.decodeData(paramInt, paramArrayOfShort);
    return nativeDecode(paramInt, paramArrayOfShort);
  }
  
  public AudioInformation getAudioInformation()
  {
    super.getAudioInformation();
    return nativeGetAudioInformation();
  }
  
  /* Error */
  public AudioFormat.AudioType getAudioType(String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_2
    //   4: ifnull +8 -> 12
    //   7: aload_2
    //   8: arraylength
    //   9: ifne +137 -> 146
    //   12: new 65	java/io/FileInputStream
    //   15: dup
    //   16: aload_1
    //   17: invokespecial 68	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   20: astore_2
    //   21: aload_2
    //   22: astore_1
    //   23: bipush 64
    //   25: newarray <illegal type>
    //   27: astore_3
    //   28: aload_2
    //   29: astore_1
    //   30: aload_2
    //   31: aload_3
    //   32: invokevirtual 74	java/io/InputStream:read	([B)I
    //   35: pop
    //   36: aload_2
    //   37: astore_1
    //   38: new 76	java/lang/String
    //   41: dup
    //   42: aload_3
    //   43: invokespecial 79	java/lang/String:<init>	([B)V
    //   46: astore_3
    //   47: aload_2
    //   48: invokevirtual 82	java/io/InputStream:close	()V
    //   51: aload_3
    //   52: astore_1
    //   53: aload_1
    //   54: ifnull +104 -> 158
    //   57: aload_1
    //   58: ldc 84
    //   60: invokevirtual 88	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   63: ifeq +95 -> 158
    //   66: getstatic 94	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:M4A	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   69: areturn
    //   70: astore_1
    //   71: ldc 23
    //   73: aload_1
    //   74: invokestatic 100	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   77: aload_3
    //   78: astore_1
    //   79: goto -26 -> 53
    //   82: astore_3
    //   83: aconst_null
    //   84: astore_2
    //   85: aload_2
    //   86: astore_1
    //   87: ldc 23
    //   89: aload_3
    //   90: invokestatic 100	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   93: aload 4
    //   95: astore_1
    //   96: aload_2
    //   97: ifnull -44 -> 53
    //   100: aload_2
    //   101: invokevirtual 82	java/io/InputStream:close	()V
    //   104: aload 4
    //   106: astore_1
    //   107: goto -54 -> 53
    //   110: astore_1
    //   111: ldc 23
    //   113: aload_1
    //   114: invokestatic 100	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   117: aload 4
    //   119: astore_1
    //   120: goto -67 -> 53
    //   123: astore_2
    //   124: aconst_null
    //   125: astore_1
    //   126: aload_1
    //   127: ifnull +7 -> 134
    //   130: aload_1
    //   131: invokevirtual 82	java/io/InputStream:close	()V
    //   134: aload_2
    //   135: athrow
    //   136: astore_1
    //   137: ldc 23
    //   139: aload_1
    //   140: invokestatic 100	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   143: goto -9 -> 134
    //   146: new 76	java/lang/String
    //   149: dup
    //   150: aload_2
    //   151: invokespecial 79	java/lang/String:<init>	([B)V
    //   154: astore_1
    //   155: goto -102 -> 53
    //   158: getstatic 103	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:UNSUPPORT	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   161: areturn
    //   162: astore_2
    //   163: goto -37 -> 126
    //   166: astore_3
    //   167: goto -82 -> 85
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	170	0	this	FfmpegPlayer
    //   0	170	1	paramString	String
    //   0	170	2	paramArrayOfByte	byte[]
    //   27	51	3	localObject1	Object
    //   82	8	3	localException1	Exception
    //   166	1	3	localException2	Exception
    //   1	117	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   47	51	70	java/lang/Exception
    //   12	21	82	java/lang/Exception
    //   100	104	110	java/lang/Exception
    //   12	21	123	finally
    //   130	134	136	java/lang/Exception
    //   23	28	162	finally
    //   30	36	162	finally
    //   38	47	162	finally
    //   87	93	162	finally
    //   23	28	166	java/lang/Exception
    //   30	36	166	java/lang/Exception
    //   38	47	166	java/lang/Exception
  }
  
  public long getCurrentTime()
  {
    super.getCurrentTime();
    return nativeGetPosition();
  }
  
  public long getDuration()
  {
    return nativeGetDuration();
  }
  
  public int getErrorCodeMask()
  {
    return 67108863;
  }
  
  protected List<String> getSoNameList()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add("audio_common");
    localArrayList.add("FFmpeg");
    localArrayList.add("ffmpeg_decoder");
    return localArrayList;
  }
  
  protected List<String> getSoNameListForV7a()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add("audio_common");
    localArrayList.add("FFmpeg_v7a");
    localArrayList.add("ffmpeg_decoder_v7a");
    return localArrayList;
  }
  
  public AudioFormat.AudioType guessAudioType(String paramString)
  {
    return getAudioType(paramString, null);
  }
  
  public int init(IDataSource paramIDataSource)
  {
    super.init(paramIDataSource);
    return nativeInitDataSource(paramIDataSource);
  }
  
  public int init(INativeDataSource paramINativeDataSource)
  {
    super.init(paramINativeDataSource);
    long l = paramINativeDataSource.getNativeInstance();
    if (l == 0L) {
      return -1;
    }
    return nativeInitNativeDataSource(l);
  }
  
  public int init(String paramString, boolean paramBoolean)
  {
    super.init(paramString, paramBoolean);
    return nativeInit(paramString);
  }
  
  public int release()
  {
    super.release();
    if (!this.mHasRelease)
    {
      this.mHasRelease = true;
      nativeRelease();
    }
    return 0;
  }
  
  public int seekTo(int paramInt)
  {
    super.seekTo(paramInt);
    return nativeSeek(paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\codec\ffmpeg\FfmpegPlayer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */