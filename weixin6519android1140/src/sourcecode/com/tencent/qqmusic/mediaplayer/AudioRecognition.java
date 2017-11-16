package com.tencent.qqmusic.mediaplayer;

import android.media.AudioTrack;
import android.text.TextUtils;
import com.tencent.qqmusic.mediaplayer.codec.BaseDecoder;
import com.tencent.qqmusic.mediaplayer.codec.flac.FLACDecoder;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class AudioRecognition
{
  private static final int READ_FILE_HEADER_SIZE = 64;
  private static String TAG = "AudioRecognition";
  private static HashMap<String, AudioFormat.AudioType> mGuessFormatResultCache = new HashMap();
  private static HashMap<String, AudioFormat.AudioType> mRecognitionResultCache = new HashMap();
  
  public static int calcBitDept(long paramLong1, long paramLong2, int paramInt, long paramLong3)
  {
    if ((0L == paramLong2) || (paramInt == 0)) {
      return 0;
    }
    double d = 1000.0F * (float)paramLong1 / (float)(paramInt * paramLong2 * paramLong3);
    int i = (int)Math.round(d);
    Logger.i(TAG, "byteNumbers = " + paramLong1 + ",time = " + paramLong2 + ",channels = " + paramInt + ",sampleRate = " + paramLong3 + ",bitDept = " + d);
    return i;
  }
  
  public static int getAudioBitDept(BaseDecoder paramBaseDecoder, AudioInformation paramAudioInformation)
  {
    try
    {
      if ((paramBaseDecoder instanceof FLACDecoder))
      {
        i = ((FLACDecoder)paramBaseDecoder).getminBufferSize();
        j = AudioTrack.getMinBufferSize((int)paramAudioInformation.getSampleRate(), paramAudioInformation.getChannels(), 2);
        if (!(paramBaseDecoder instanceof FLACDecoder)) {
          break label88;
        }
        j = paramBaseDecoder.decodeData(i * 2, new short[i]);
        if (j > 0) {
          break label111;
        }
        i *= 2;
        return calcBitDept(i, paramBaseDecoder.getCurrentTime(), paramAudioInformation.getChannels(), paramAudioInformation.getSampleRate());
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        int j;
        Logger.e(TAG, localThrowable);
        int i = 0;
        continue;
        label88:
        if (j % 2048 != 0)
        {
          i = (j / 2048 + 1) * 2048;
          continue;
          label111:
          i = j;
        }
        else
        {
          i = j;
        }
      }
    }
  }
  
  public static BaseDecoder getDecoderFormFile(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    if (TextUtils.isEmpty(paramString)) {
      localObject1 = localObject2;
    }
    do
    {
      return (BaseDecoder)localObject1;
      try
      {
        localObject2 = recognitionAudioFormatExactly(paramString);
        localObject1 = localObject2;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          Logger.e(TAG, localIOException);
        }
      }
      localObject2 = MediaCodecFactory.createDecoderByType((AudioFormat.AudioType)localObject1);
      localObject1 = localObject2;
    } while (localObject2 == null);
    ((BaseDecoder)localObject2).init(paramString, false);
    return (BaseDecoder)localObject2;
  }
  
  public static AudioFormat.AudioType guessFormat(String paramString)
  {
    if ((mGuessFormatResultCache != null) && (mGuessFormatResultCache.containsKey(paramString))) {
      return (AudioFormat.AudioType)mGuessFormatResultCache.get(paramString);
    }
    Iterator localIterator = MediaCodecFactory.getSupportAudioType().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = MediaCodecFactory.createDecoderByType((AudioFormat.AudioType)localIterator.next());
      if (localObject != null)
      {
        localObject = ((BaseDecoder)localObject).guessAudioType(paramString);
        if (AudioFormat.isAudioType((AudioFormat.AudioType)localObject))
        {
          mGuessFormatResultCache.put(paramString, localObject);
          return (AudioFormat.AudioType)localObject;
        }
      }
    }
    return AudioFormat.AudioType.UNSUPPORT;
  }
  
  public static AudioFormat.AudioType recognitionAudioFormatByExtensions(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    if (mRecognitionResultCache.containsKey(paramString))
    {
      localObject1 = (AudioFormat.AudioType)mRecognitionResultCache.get(paramString);
      Logger.w(TAG, "Get from cache " + localObject1 + ",checkFilePath = " + paramString + ",retType = " + localObject1);
      return (AudioFormat.AudioType)localObject1;
    }
    AudioFormat.AudioType localAudioType = guessFormat(paramString);
    Object localObject1 = localAudioType;
    if (!AudioFormat.isAudioType(localAudioType)) {
      Logger.i(TAG, "recognitionAudioFormatByExtensions guessAudioType = null,so recognitionAudioFormatExactly checkFilePath = " + paramString);
    }
    try
    {
      localObject1 = recognitionAudioFormatExactly(paramString);
      Logger.i(TAG, "recognitionAudioFormatByExtensions checkFilePath = " + paramString + ",guessAudioType = " + localObject1);
      return (AudioFormat.AudioType)localObject1;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Logger.e(TAG, localIOException);
        Object localObject2 = localAudioType;
      }
    }
  }
  
  /* Error */
  public static AudioFormat.AudioType recognitionAudioFormatExactly(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: getstatic 28	com/tencent/qqmusic/mediaplayer/AudioRecognition:mGuessFormatResultCache	Ljava/util/HashMap;
    //   9: aload_0
    //   10: invokevirtual 217	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   13: pop
    //   14: getstatic 19	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   17: new 41	java/lang/StringBuilder
    //   20: dup
    //   21: ldc -37
    //   23: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   26: aload_0
    //   27: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   33: invokestatic 77	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   36: new 221	java/io/File
    //   39: dup
    //   40: aload_0
    //   41: invokespecial 222	java/io/File:<init>	(Ljava/lang/String;)V
    //   44: astore 4
    //   46: aload 4
    //   48: invokevirtual 225	java/io/File:exists	()Z
    //   51: ifne +27 -> 78
    //   54: new 227	java/io/FileNotFoundException
    //   57: dup
    //   58: new 41	java/lang/StringBuilder
    //   61: dup
    //   62: ldc -27
    //   64: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   67: aload_0
    //   68: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   74: invokespecial 230	java/io/FileNotFoundException:<init>	(Ljava/lang/String;)V
    //   77: athrow
    //   78: aload 4
    //   80: invokevirtual 233	java/io/File:canRead	()Z
    //   83: ifne +27 -> 110
    //   86: new 121	java/io/IOException
    //   89: dup
    //   90: new 41	java/lang/StringBuilder
    //   93: dup
    //   94: ldc -21
    //   96: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   99: aload_0
    //   100: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   106: invokespecial 236	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   109: athrow
    //   110: getstatic 19	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   113: new 41	java/lang/StringBuilder
    //   116: dup
    //   117: ldc -18
    //   119: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   122: aload 4
    //   124: invokevirtual 241	java/io/File:length	()J
    //   127: invokevirtual 50	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   130: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   133: invokestatic 77	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   136: invokestatic 246	java/lang/System:currentTimeMillis	()J
    //   139: lstore_2
    //   140: aload_0
    //   141: invokestatic 204	com/tencent/qqmusic/mediaplayer/AudioRecognition:guessFormat	(Ljava/lang/String;)Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   144: astore 8
    //   146: invokestatic 156	com/tencent/qqmusic/mediaplayer/MediaCodecFactory:getSupportAudioType	()Ljava/util/ArrayList;
    //   149: astore 9
    //   151: aload 8
    //   153: ifnull +58 -> 211
    //   156: aload 9
    //   158: aload 8
    //   160: invokevirtual 249	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
    //   163: ifeq +48 -> 211
    //   166: aload 9
    //   168: aload 8
    //   170: invokevirtual 251	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   173: pop
    //   174: aload 9
    //   176: iconst_0
    //   177: aload 8
    //   179: invokevirtual 255	java/util/ArrayList:add	(ILjava/lang/Object;)V
    //   182: getstatic 258	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:MP3	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   185: aload 8
    //   187: invokevirtual 261	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:equals	(Ljava/lang/Object;)Z
    //   190: ifeq +21 -> 211
    //   193: aload 9
    //   195: getstatic 264	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:FLAC	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   198: invokevirtual 251	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   201: pop
    //   202: aload 9
    //   204: iconst_0
    //   205: getstatic 264	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:FLAC	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   208: invokevirtual 255	java/util/ArrayList:add	(ILjava/lang/Object;)V
    //   211: new 266	java/io/FileInputStream
    //   214: dup
    //   215: aload_0
    //   216: invokespecial 267	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   219: astore 7
    //   221: aload 7
    //   223: astore 6
    //   225: sipush 1024
    //   228: invokestatic 273	com/tencent/qqmusic/mediaplayer/CacheBytesManager:getStatic	(I)[B
    //   231: astore 5
    //   233: aload 7
    //   235: astore 6
    //   237: aload 7
    //   239: aload 5
    //   241: invokevirtual 279	java/io/InputStream:read	([B)I
    //   244: istore_1
    //   245: iload_1
    //   246: bipush 64
    //   248: if_icmplt +458 -> 706
    //   251: aload 7
    //   253: astore 6
    //   255: bipush 64
    //   257: newarray <illegal type>
    //   259: astore 4
    //   261: aload 7
    //   263: astore 6
    //   265: aload 5
    //   267: iconst_0
    //   268: aload 4
    //   270: iconst_0
    //   271: bipush 64
    //   273: invokestatic 283	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   276: aload 7
    //   278: astore 6
    //   280: aload 5
    //   282: invokestatic 287	com/tencent/qqmusic/mediaplayer/CacheBytesManager:recycle	([B)[B
    //   285: pop
    //   286: aload 7
    //   288: astore 6
    //   290: getstatic 19	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   293: new 41	java/lang/StringBuilder
    //   296: dup
    //   297: ldc_w 289
    //   300: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   303: new 291	java/lang/String
    //   306: dup
    //   307: aload 5
    //   309: iconst_0
    //   310: iload_1
    //   311: invokespecial 294	java/lang/String:<init>	([BII)V
    //   314: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   317: ldc_w 296
    //   320: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   323: aload_0
    //   324: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   327: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   330: invokestatic 77	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   333: aload 7
    //   335: invokevirtual 299	java/io/InputStream:close	()V
    //   338: aload 9
    //   340: invokevirtual 162	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   343: astore 6
    //   345: aload 6
    //   347: invokeinterface 168 1 0
    //   352: ifeq +345 -> 697
    //   355: aload 6
    //   357: invokeinterface 172 1 0
    //   362: checkcast 152	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType
    //   365: invokestatic 137	com/tencent/qqmusic/mediaplayer/MediaCodecFactory:createDecoderByType	(Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;)Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   368: astore 5
    //   370: aload 5
    //   372: ifnull -27 -> 345
    //   375: aload 5
    //   377: aload_0
    //   378: aload 4
    //   380: invokevirtual 303	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:getAudioType	(Ljava/lang/String;[B)Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   383: astore 5
    //   385: aload 5
    //   387: invokestatic 181	com/tencent/qqmusic/mediaplayer/AudioFormat:isAudioType	(Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;)Z
    //   390: ifeq -45 -> 345
    //   393: getstatic 19	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   396: new 41	java/lang/StringBuilder
    //   399: dup
    //   400: ldc_w 305
    //   403: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   406: aload 5
    //   408: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   411: ldc_w 307
    //   414: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   417: aload_0
    //   418: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   421: ldc_w 309
    //   424: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   427: invokestatic 246	java/lang/System:currentTimeMillis	()J
    //   430: lload_2
    //   431: lsub
    //   432: invokevirtual 50	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   435: ldc_w 311
    //   438: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   441: aload 5
    //   443: aload 8
    //   445: invokevirtual 261	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:equals	(Ljava/lang/Object;)Z
    //   448: invokevirtual 314	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   451: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   454: invokestatic 202	com/tencent/qqmusic/mediaplayer/util/Logger:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   457: aload 5
    //   459: ifnonnull +153 -> 612
    //   462: getstatic 189	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:UNSUPPORT	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   465: astore 5
    //   467: getstatic 19	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   470: new 41	java/lang/StringBuilder
    //   473: dup
    //   474: ldc_w 316
    //   477: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   480: aload_0
    //   481: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   484: ldc -57
    //   486: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   489: aload 5
    //   491: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   494: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   497: invokestatic 77	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   500: aload 5
    //   502: areturn
    //   503: astore 5
    //   505: getstatic 19	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   508: aload 5
    //   510: invokestatic 117	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   513: goto -175 -> 338
    //   516: astore 5
    //   518: aconst_null
    //   519: astore 7
    //   521: aconst_null
    //   522: astore 4
    //   524: aload 7
    //   526: astore 6
    //   528: getstatic 19	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   531: aload 5
    //   533: invokestatic 117	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   536: aload 7
    //   538: ifnull +165 -> 703
    //   541: aload 7
    //   543: invokevirtual 299	java/io/InputStream:close	()V
    //   546: goto -208 -> 338
    //   549: astore 5
    //   551: getstatic 19	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   554: aload 5
    //   556: invokestatic 117	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   559: goto -221 -> 338
    //   562: astore_0
    //   563: aconst_null
    //   564: astore 6
    //   566: aload 6
    //   568: ifnull +8 -> 576
    //   571: aload 6
    //   573: invokevirtual 299	java/io/InputStream:close	()V
    //   576: aload_0
    //   577: athrow
    //   578: astore 4
    //   580: getstatic 19	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   583: aload 4
    //   585: invokestatic 117	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   588: goto -12 -> 576
    //   591: astore 5
    //   593: getstatic 19	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   596: ldc_w 318
    //   599: aload 5
    //   601: invokestatic 321	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   604: getstatic 189	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:UNSUPPORT	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   607: astore 5
    //   609: goto -224 -> 385
    //   612: getstatic 19	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   615: new 41	java/lang/StringBuilder
    //   618: dup
    //   619: ldc_w 323
    //   622: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   625: aload_0
    //   626: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   629: ldc_w 325
    //   632: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   635: aload 5
    //   637: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   640: ldc_w 327
    //   643: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   646: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   649: invokestatic 77	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   652: getstatic 26	com/tencent/qqmusic/mediaplayer/AudioRecognition:mRecognitionResultCache	Ljava/util/HashMap;
    //   655: aload_0
    //   656: aload 5
    //   658: invokevirtual 185	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   661: pop
    //   662: getstatic 28	com/tencent/qqmusic/mediaplayer/AudioRecognition:mGuessFormatResultCache	Ljava/util/HashMap;
    //   665: aload_0
    //   666: aload 5
    //   668: invokevirtual 185	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   671: pop
    //   672: goto -205 -> 467
    //   675: astore_0
    //   676: goto -110 -> 566
    //   679: astore 5
    //   681: aconst_null
    //   682: astore 4
    //   684: goto -160 -> 524
    //   687: astore 5
    //   689: goto -165 -> 524
    //   692: astore 5
    //   694: goto -170 -> 524
    //   697: aconst_null
    //   698: astore 5
    //   700: goto -243 -> 457
    //   703: goto -365 -> 338
    //   706: aconst_null
    //   707: astore 4
    //   709: goto -433 -> 276
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	712	0	paramString	String
    //   244	67	1	i	int
    //   139	292	2	l	long
    //   44	479	4	localObject1	Object
    //   578	6	4	localException1	Exception
    //   682	26	4	localObject2	Object
    //   231	270	5	localObject3	Object
    //   503	6	5	localException2	Exception
    //   516	16	5	localException3	Exception
    //   549	6	5	localException4	Exception
    //   591	9	5	localSoNotFindException	SoNotFindException
    //   607	60	5	localAudioType1	AudioFormat.AudioType
    //   679	1	5	localException5	Exception
    //   687	1	5	localException6	Exception
    //   692	1	5	localException7	Exception
    //   698	1	5	localObject4	Object
    //   223	349	6	localObject5	Object
    //   219	323	7	localFileInputStream	java.io.FileInputStream
    //   144	300	8	localAudioType2	AudioFormat.AudioType
    //   149	190	9	localArrayList	ArrayList
    // Exception table:
    //   from	to	target	type
    //   333	338	503	java/lang/Exception
    //   211	221	516	java/lang/Exception
    //   541	546	549	java/lang/Exception
    //   211	221	562	finally
    //   571	576	578	java/lang/Exception
    //   375	385	591	com/tencent/qqmusic/mediaplayer/SoNotFindException
    //   225	233	675	finally
    //   237	245	675	finally
    //   255	261	675	finally
    //   265	276	675	finally
    //   280	286	675	finally
    //   290	333	675	finally
    //   528	536	675	finally
    //   225	233	679	java/lang/Exception
    //   237	245	679	java/lang/Exception
    //   255	261	679	java/lang/Exception
    //   265	276	687	java/lang/Exception
    //   280	286	692	java/lang/Exception
    //   290	333	692	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\AudioRecognition.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */