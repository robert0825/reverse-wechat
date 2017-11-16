package com.tencent.qqmusic.mediaplayer.codec.wma;

import android.text.TextUtils;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.codec.ffmpeg.FfmpegPlayer;

public class WmaDecoder
  extends FfmpegPlayer
{
  public static String TAG = "WmaDecoder";
  private final int HEARER_LENGTH = 16;
  private final byte[] WMA_HEADER = { 48, 38, -78, 117, -114, 102, -49, 17, -90, -39, 0, -86, 0, 98, -50, 108 };
  
  /* Error */
  public AudioFormat.AudioType getAudioType(String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aconst_null
    //   4: astore 5
    //   6: aload_2
    //   7: ifnull +50 -> 57
    //   10: aload_2
    //   11: arraylength
    //   12: bipush 16
    //   14: if_icmplt +43 -> 57
    //   17: aload_2
    //   18: astore_1
    //   19: aload_1
    //   20: ifnull +183 -> 203
    //   23: aload_1
    //   24: arraylength
    //   25: bipush 16
    //   27: if_icmplt +176 -> 203
    //   30: iconst_0
    //   31: istore_3
    //   32: iload_3
    //   33: bipush 16
    //   35: if_icmpge +158 -> 193
    //   38: aload_1
    //   39: iload_3
    //   40: baload
    //   41: aload_0
    //   42: getfield 39	com/tencent/qqmusic/mediaplayer/codec/wma/WmaDecoder:WMA_HEADER	[B
    //   45: iload_3
    //   46: baload
    //   47: if_icmpne +146 -> 193
    //   50: iload_3
    //   51: iconst_1
    //   52: iadd
    //   53: istore_3
    //   54: goto -22 -> 32
    //   57: new 45	java/io/FileInputStream
    //   60: dup
    //   61: aload_1
    //   62: invokespecial 48	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   65: astore 4
    //   67: aload 4
    //   69: astore_1
    //   70: aload 6
    //   72: astore_2
    //   73: bipush 16
    //   75: newarray <illegal type>
    //   77: astore 5
    //   79: aload 4
    //   81: astore_1
    //   82: aload 5
    //   84: astore_2
    //   85: aload 4
    //   87: aload 5
    //   89: invokevirtual 54	java/io/InputStream:read	([B)I
    //   92: pop
    //   93: aload 4
    //   95: invokevirtual 57	java/io/InputStream:close	()V
    //   98: aload 5
    //   100: astore_1
    //   101: goto -82 -> 19
    //   104: astore_1
    //   105: getstatic 16	com/tencent/qqmusic/mediaplayer/codec/wma/WmaDecoder:TAG	Ljava/lang/String;
    //   108: aload_1
    //   109: invokestatic 63	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   112: aload 5
    //   114: astore_1
    //   115: goto -96 -> 19
    //   118: astore_1
    //   119: aconst_null
    //   120: astore 4
    //   122: aload 5
    //   124: astore_2
    //   125: aload_1
    //   126: astore 5
    //   128: aload 4
    //   130: astore_1
    //   131: getstatic 16	com/tencent/qqmusic/mediaplayer/codec/wma/WmaDecoder:TAG	Ljava/lang/String;
    //   134: aload 5
    //   136: invokestatic 63	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   139: aload_2
    //   140: astore_1
    //   141: aload 4
    //   143: ifnull -124 -> 19
    //   146: aload 4
    //   148: invokevirtual 57	java/io/InputStream:close	()V
    //   151: aload_2
    //   152: astore_1
    //   153: goto -134 -> 19
    //   156: astore_1
    //   157: getstatic 16	com/tencent/qqmusic/mediaplayer/codec/wma/WmaDecoder:TAG	Ljava/lang/String;
    //   160: aload_1
    //   161: invokestatic 63	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   164: aload_2
    //   165: astore_1
    //   166: goto -147 -> 19
    //   169: astore_2
    //   170: aconst_null
    //   171: astore_1
    //   172: aload_1
    //   173: ifnull +7 -> 180
    //   176: aload_1
    //   177: invokevirtual 57	java/io/InputStream:close	()V
    //   180: aload_2
    //   181: athrow
    //   182: astore_1
    //   183: getstatic 16	com/tencent/qqmusic/mediaplayer/codec/wma/WmaDecoder:TAG	Ljava/lang/String;
    //   186: aload_1
    //   187: invokestatic 63	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   190: goto -10 -> 180
    //   193: iload_3
    //   194: bipush 16
    //   196: if_icmpne +7 -> 203
    //   199: getstatic 69	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:WMA	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   202: areturn
    //   203: getstatic 72	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:UNSUPPORT	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   206: areturn
    //   207: astore_2
    //   208: goto -36 -> 172
    //   211: astore 5
    //   213: goto -85 -> 128
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	216	0	this	WmaDecoder
    //   0	216	1	paramString	String
    //   0	216	2	paramArrayOfByte	byte[]
    //   31	166	3	i	int
    //   65	82	4	localFileInputStream	java.io.FileInputStream
    //   4	131	5	localObject1	Object
    //   211	1	5	localIOException	java.io.IOException
    //   1	70	6	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   93	98	104	java/io/IOException
    //   57	67	118	java/io/IOException
    //   146	151	156	java/io/IOException
    //   57	67	169	finally
    //   176	180	182	java/io/IOException
    //   73	79	207	finally
    //   85	93	207	finally
    //   131	139	207	finally
    //   73	79	211	java/io/IOException
    //   85	93	211	java/io/IOException
  }
  
  public int getErrorCodeMask()
  {
    return 117440511;
  }
  
  public AudioFormat.AudioType guessAudioType(String paramString)
  {
    if ((!TextUtils.isEmpty(paramString)) && (paramString.toLowerCase().contains(".wma"))) {
      return AudioFormat.AudioType.WMA;
    }
    return AudioFormat.AudioType.UNSUPPORT;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\codec\wma\WmaDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */