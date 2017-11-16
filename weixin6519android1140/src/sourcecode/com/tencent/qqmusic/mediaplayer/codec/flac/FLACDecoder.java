package com.tencent.qqmusic.mediaplayer.codec.flac;

import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.AudioInformation;
import com.tencent.qqmusic.mediaplayer.codec.BaseDecoder;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.util.Arrays;
import java.util.List;

public class FLACDecoder
  extends BaseDecoder
{
  public static final String TAG = "FLACDecoder";
  private volatile boolean mHasRelease = false;
  
  private native int nCleanup();
  
  private native int nDecodeData(int paramInt, short[] paramArrayOfShort);
  
  private native FLACInformation nGetAudioInformation();
  
  private native int nGetCurrentTime();
  
  private native int nGetminBufferSize();
  
  private native int nInitDataSource(IDataSource paramIDataSource);
  
  private native int nInitNativeDataSource(INativeDataSource paramINativeDataSource);
  
  private native int nOpen(String paramString);
  
  private native int nSeekTo(int paramInt);
  
  public int decodeData(int paramInt, short[] paramArrayOfShort)
  {
    super.decodeData(paramInt, paramArrayOfShort);
    return nDecodeData(paramInt, paramArrayOfShort);
  }
  
  public AudioInformation getAudioInformation()
  {
    super.getAudioInformation();
    return nGetAudioInformation();
  }
  
  public AudioFormat.AudioType getAudioType(String paramString, byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0) && (new String(paramArrayOfByte).startsWith("flaC"))) {
      return AudioFormat.AudioType.FLAC;
    }
    if (checkFormatBySoftDecoder(paramString)) {
      return AudioFormat.AudioType.FLAC;
    }
    return AudioFormat.AudioType.UNSUPPORT;
  }
  
  public long getCurrentTime()
  {
    super.getCurrentTime();
    return nGetCurrentTime();
  }
  
  public int getErrorCodeMask()
  {
    return 33554431;
  }
  
  protected List<String> getSoNameList()
  {
    return Arrays.asList(new String[] { "audio_common", "qmflac" });
  }
  
  public int getminBufferSize()
  {
    super.throwIfSoNotLoadSuccess();
    return nGetminBufferSize();
  }
  
  /* Error */
  public AudioFormat.AudioType guessAudioType(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 107	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   4: ifne +91 -> 95
    //   7: aload_1
    //   8: invokevirtual 111	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   11: ldc 113
    //   13: invokevirtual 116	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   16: ifeq +7 -> 23
    //   19: getstatic 63	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:FLAC	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   22: areturn
    //   23: new 118	java/io/FileInputStream
    //   26: dup
    //   27: aload_1
    //   28: invokespecial 121	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   31: astore_3
    //   32: aload_3
    //   33: astore_2
    //   34: bipush 64
    //   36: newarray <illegal type>
    //   38: astore 4
    //   40: aload_3
    //   41: astore_2
    //   42: aload_3
    //   43: aload 4
    //   45: invokevirtual 127	java/io/InputStream:read	([B)I
    //   48: pop
    //   49: aload_3
    //   50: astore_2
    //   51: aload_0
    //   52: aload_1
    //   53: aload 4
    //   55: invokevirtual 129	com/tencent/qqmusic/mediaplayer/codec/flac/FLACDecoder:getAudioType	(Ljava/lang/String;[B)Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   58: astore_1
    //   59: aload_3
    //   60: invokevirtual 132	java/io/InputStream:close	()V
    //   63: aload_1
    //   64: areturn
    //   65: astore_2
    //   66: ldc 8
    //   68: aload_2
    //   69: invokestatic 138	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   72: aload_1
    //   73: areturn
    //   74: astore 4
    //   76: aconst_null
    //   77: astore_1
    //   78: aload_1
    //   79: astore_2
    //   80: ldc 8
    //   82: aload 4
    //   84: invokestatic 138	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   87: aload_1
    //   88: ifnull +7 -> 95
    //   91: aload_1
    //   92: invokevirtual 132	java/io/InputStream:close	()V
    //   95: getstatic 69	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:UNSUPPORT	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   98: areturn
    //   99: astore_1
    //   100: ldc 8
    //   102: aload_1
    //   103: invokestatic 138	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   106: goto -11 -> 95
    //   109: astore_1
    //   110: aconst_null
    //   111: astore_2
    //   112: aload_2
    //   113: ifnull +7 -> 120
    //   116: aload_2
    //   117: invokevirtual 132	java/io/InputStream:close	()V
    //   120: aload_1
    //   121: athrow
    //   122: astore_2
    //   123: ldc 8
    //   125: aload_2
    //   126: invokestatic 138	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   129: goto -9 -> 120
    //   132: astore_1
    //   133: goto -21 -> 112
    //   136: astore 4
    //   138: aload_3
    //   139: astore_1
    //   140: goto -62 -> 78
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	143	0	this	FLACDecoder
    //   0	143	1	paramString	String
    //   33	18	2	localFileInputStream1	java.io.FileInputStream
    //   65	4	2	localException1	Exception
    //   79	38	2	str	String
    //   122	4	2	localException2	Exception
    //   31	108	3	localFileInputStream2	java.io.FileInputStream
    //   38	16	4	arrayOfByte	byte[]
    //   74	9	4	localException3	Exception
    //   136	1	4	localException4	Exception
    // Exception table:
    //   from	to	target	type
    //   59	63	65	java/lang/Exception
    //   23	32	74	java/lang/Exception
    //   91	95	99	java/lang/Exception
    //   23	32	109	finally
    //   116	120	122	java/lang/Exception
    //   34	40	132	finally
    //   42	49	132	finally
    //   51	59	132	finally
    //   80	87	132	finally
    //   34	40	136	java/lang/Exception
    //   42	49	136	java/lang/Exception
    //   51	59	136	java/lang/Exception
  }
  
  public int init(IDataSource paramIDataSource)
  {
    super.init(paramIDataSource);
    return nInitDataSource(paramIDataSource);
  }
  
  public int init(INativeDataSource paramINativeDataSource)
  {
    super.init(paramINativeDataSource);
    return nInitNativeDataSource(paramINativeDataSource);
  }
  
  public int init(String paramString, boolean paramBoolean)
  {
    super.init(paramString, paramBoolean);
    return nOpen(paramString);
  }
  
  public int release()
  {
    super.release();
    if (!this.mHasRelease)
    {
      this.mHasRelease = true;
      Logger.w("FLACDecoder", this + "release");
      nCleanup();
    }
    return 0;
  }
  
  public int seekTo(int paramInt)
  {
    super.seekTo(paramInt);
    return nSeekTo(paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\codec\flac\FLACDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */