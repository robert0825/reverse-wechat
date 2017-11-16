package com.tencent.qqmusic.mediaplayer;

import android.media.AudioTrack;
import com.tencent.qqmusic.mediaplayer.codec.BaseDecoder;
import com.tencent.qqmusic.mediaplayer.codec.ffmpeg.FfmpegPlayer;
import com.tencent.qqmusic.mediaplayer.codec.flac.FLACDecoder;
import com.tencent.qqmusic.mediaplayer.util.Logger;

class PCMDataCut
{
  private static final String TAG = "PCMDataCut";
  private AudioCut mAudioCut = null;
  private BaseDecoder mDecoder = null;
  private String mFileName = null;
  
  public PCMDataCut(String paramString)
  {
    this.mFileName = paramString;
    prepareDecoder();
  }
  
  private boolean calculateBufferSize()
  {
    if (this.mDecoder == null) {
      return false;
    }
    int i;
    if (this.mAudioCut.information.getChannels() == 1) {
      i = 4;
    }
    for (;;)
    {
      int j = AudioTrack.getMinBufferSize((int)this.mAudioCut.information.getSampleRate(), i, 2);
      try
      {
        if ((this.mDecoder instanceof FLACDecoder))
        {
          i = ((FLACDecoder)this.mDecoder).getminBufferSize();
          Logger.i("PCMDataCut", "decoder_buf_size = " + i + ", playback_buf_size = " + j);
          if (!AudioFormat.AudioType.FLAC.equals(this.mAudioCut.audioType)) {
            break label161;
          }
          this.mAudioCut.bufferSize = i;
          if ((this.mDecoder instanceof FfmpegPlayer)) {
            this.mAudioCut.bufferSize = Math.max(4096, j);
          }
          return true;
          i = 12;
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Logger.e("PCMDataCut", localException);
          i = 0;
          continue;
          label161:
          this.mAudioCut.bufferSize = j;
        }
      }
    }
  }
  
  private boolean getAudioFormation()
  {
    boolean bool = false;
    if (this.mDecoder != null) {}
    try
    {
      this.mAudioCut.information = this.mDecoder.getAudioInformation();
      if (this.mAudioCut.information != null) {
        bool = true;
      }
      return bool;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      for (;;)
      {
        Logger.e("PCMDataCut", localUnsatisfiedLinkError);
      }
    }
  }
  
  private boolean initDecoder()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.mDecoder != null) {}
    try
    {
      int j = this.mDecoder.init(this.mFileName, false);
      Logger.i("PCMDataCut", "nativeOpen return=" + j);
      int i = j;
      if (j != 0) {
        i = this.mDecoder.init(this.mFileName, false);
      }
      bool1 = bool2;
      if (i == 0) {
        bool1 = true;
      }
      return bool1;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      Logger.e("PCMDataCut", localUnsatisfiedLinkError);
    }
    return false;
  }
  
  private void prepareDecoder()
  {
    if (this.mFileName == null) {
      throw new NullPointerException("the path is null!");
    }
    this.mAudioCut = new AudioCut();
    try
    {
      this.mAudioCut.audioType = AudioRecognition.recognitionAudioFormatExactly(this.mFileName);
      this.mDecoder = MediaCodecFactory.createDecoderByType(this.mAudioCut.audioType);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Logger.e("PCMDataCut", localException);
      }
    }
  }
  
  /* Error */
  boolean cutPCMData(String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 12
    //   3: iconst_0
    //   4: istore 13
    //   6: aconst_null
    //   7: astore 18
    //   9: aconst_null
    //   10: astore 19
    //   12: aconst_null
    //   13: astore 17
    //   15: aload_0
    //   16: invokespecial 156	com/tencent/qqmusic/mediaplayer/PCMDataCut:initDecoder	()Z
    //   19: istore 14
    //   21: iload 14
    //   23: istore 11
    //   25: iload 14
    //   27: ifeq +15 -> 42
    //   30: iconst_0
    //   31: istore 12
    //   33: iconst_0
    //   34: istore 13
    //   36: aload_0
    //   37: invokespecial 158	com/tencent/qqmusic/mediaplayer/PCMDataCut:getAudioFormation	()Z
    //   40: istore 11
    //   42: iload 11
    //   44: istore 13
    //   46: iload 11
    //   48: ifeq +19 -> 67
    //   51: iconst_0
    //   52: istore 12
    //   54: iconst_0
    //   55: istore 13
    //   57: aload_0
    //   58: invokespecial 160	com/tencent/qqmusic/mediaplayer/PCMDataCut:calculateBufferSize	()Z
    //   61: istore 11
    //   63: iload 11
    //   65: istore 13
    //   67: iload 13
    //   69: istore 12
    //   71: aload_0
    //   72: getfield 29	com/tencent/qqmusic/mediaplayer/PCMDataCut:mAudioCut	Lcom/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut;
    //   75: getfield 41	com/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut:information	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   78: ifnull +28 -> 106
    //   81: iload 13
    //   83: istore 11
    //   85: iload 13
    //   87: istore 12
    //   89: aload_0
    //   90: getfield 29	com/tencent/qqmusic/mediaplayer/PCMDataCut:mAudioCut	Lcom/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut;
    //   93: getfield 41	com/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut:information	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   96: invokevirtual 163	com/tencent/qqmusic/mediaplayer/AudioInformation:getDuration	()J
    //   99: ldc2_w 164
    //   102: lcmp
    //   103: ifge +28 -> 131
    //   106: iload 13
    //   108: istore 12
    //   110: ldc 13
    //   112: ldc -89
    //   114: invokestatic 170	com/tencent/qqmusic/mediaplayer/util/Logger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   117: iload 13
    //   119: istore 12
    //   121: ldc -84
    //   123: ldc -82
    //   125: invokestatic 87	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   128: iconst_0
    //   129: istore 11
    //   131: iload_2
    //   132: sipush 1000
    //   135: imul
    //   136: istore 9
    //   138: iload_3
    //   139: sipush 1000
    //   142: imul
    //   143: istore 10
    //   145: iload 11
    //   147: ifeq +1049 -> 1196
    //   150: iload 11
    //   152: istore 13
    //   154: iload 11
    //   156: istore 12
    //   158: iload 10
    //   160: iload 9
    //   162: isub
    //   163: sipush 1000
    //   166: idiv
    //   167: i2l
    //   168: aload_0
    //   169: getfield 29	com/tencent/qqmusic/mediaplayer/PCMDataCut:mAudioCut	Lcom/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut;
    //   172: getfield 41	com/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut:information	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   175: invokevirtual 51	com/tencent/qqmusic/mediaplayer/AudioInformation:getSampleRate	()J
    //   178: lmul
    //   179: aload_0
    //   180: getfield 29	com/tencent/qqmusic/mediaplayer/PCMDataCut:mAudioCut	Lcom/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut;
    //   183: getfield 41	com/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut:information	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   186: invokevirtual 47	com/tencent/qqmusic/mediaplayer/AudioInformation:getChannels	()I
    //   189: i2l
    //   190: lmul
    //   191: l2i
    //   192: istore_3
    //   193: iload 11
    //   195: istore 13
    //   197: iload 11
    //   199: istore 12
    //   201: aload_0
    //   202: getfield 29	com/tencent/qqmusic/mediaplayer/PCMDataCut:mAudioCut	Lcom/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut;
    //   205: getfield 104	com/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut:bufferSize	I
    //   208: newarray <illegal type>
    //   210: astore 20
    //   212: iload 11
    //   214: istore 13
    //   216: iload 11
    //   218: istore 12
    //   220: aload_0
    //   221: getfield 27	com/tencent/qqmusic/mediaplayer/PCMDataCut:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   224: instanceof 176
    //   227: ifeq +198 -> 425
    //   230: iload 11
    //   232: istore 13
    //   234: iload 11
    //   236: istore 12
    //   238: aload_0
    //   239: getfield 27	com/tencent/qqmusic/mediaplayer/PCMDataCut:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   242: checkcast 176	com/tencent/qqmusic/mediaplayer/codec/ape/ApeDecoder
    //   245: iload 9
    //   247: sipush 1000
    //   250: idiv
    //   251: invokevirtual 180	com/tencent/qqmusic/mediaplayer/codec/ape/ApeDecoder:nSeekToExactly	(I)I
    //   254: pop
    //   255: iconst_0
    //   256: istore 7
    //   258: iload 11
    //   260: istore 13
    //   262: iload 11
    //   264: istore 12
    //   266: new 182	java/io/File
    //   269: dup
    //   270: aload_1
    //   271: invokespecial 183	java/io/File:<init>	(Ljava/lang/String;)V
    //   274: astore_1
    //   275: new 185	com/tencent/qqmusic/mediaplayer/WaveWriter
    //   278: dup
    //   279: aload_1
    //   280: aload_0
    //   281: getfield 29	com/tencent/qqmusic/mediaplayer/PCMDataCut:mAudioCut	Lcom/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut;
    //   284: getfield 41	com/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut:information	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   287: invokevirtual 51	com/tencent/qqmusic/mediaplayer/AudioInformation:getSampleRate	()J
    //   290: l2i
    //   291: aload_0
    //   292: getfield 29	com/tencent/qqmusic/mediaplayer/PCMDataCut:mAudioCut	Lcom/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut;
    //   295: getfield 41	com/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut:information	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   298: invokevirtual 47	com/tencent/qqmusic/mediaplayer/AudioInformation:getChannels	()I
    //   301: aload_0
    //   302: getfield 29	com/tencent/qqmusic/mediaplayer/PCMDataCut:mAudioCut	Lcom/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut;
    //   305: getfield 188	com/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut:sampleBit	I
    //   308: invokespecial 191	com/tencent/qqmusic/mediaplayer/WaveWriter:<init>	(Ljava/io/File;III)V
    //   311: astore 17
    //   313: aload 17
    //   315: invokevirtual 194	com/tencent/qqmusic/mediaplayer/WaveWriter:createWaveFile	()Z
    //   318: pop
    //   319: iconst_0
    //   320: istore 4
    //   322: iconst_m1
    //   323: istore_2
    //   324: iload 4
    //   326: iload_3
    //   327: if_icmpgt +593 -> 920
    //   330: aload_0
    //   331: getfield 27	com/tencent/qqmusic/mediaplayer/PCMDataCut:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   334: invokevirtual 197	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:getCurrentTime	()J
    //   337: lstore 15
    //   339: lload 15
    //   341: iload 10
    //   343: sipush 2000
    //   346: iadd
    //   347: i2l
    //   348: lcmp
    //   349: ifge +571 -> 920
    //   352: aload_0
    //   353: getfield 27	com/tencent/qqmusic/mediaplayer/PCMDataCut:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   356: aload_0
    //   357: getfield 29	com/tencent/qqmusic/mediaplayer/PCMDataCut:mAudioCut	Lcom/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut;
    //   360: getfield 104	com/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut:bufferSize	I
    //   363: iconst_2
    //   364: imul
    //   365: aload 20
    //   367: invokevirtual 201	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:decodeData	(I[S)I
    //   370: istore 8
    //   372: iload 8
    //   374: ifgt +166 -> 540
    //   377: aload_0
    //   378: getfield 27	com/tencent/qqmusic/mediaplayer/PCMDataCut:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   381: ifnull +16 -> 397
    //   384: aload_0
    //   385: getfield 27	com/tencent/qqmusic/mediaplayer/PCMDataCut:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   388: invokevirtual 204	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   391: pop
    //   392: aload_0
    //   393: aconst_null
    //   394: putfield 27	com/tencent/qqmusic/mediaplayer/PCMDataCut:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   397: aload 17
    //   399: invokevirtual 207	com/tencent/qqmusic/mediaplayer/WaveWriter:closeWaveFile	()V
    //   402: iload 11
    //   404: ifne +15 -> 419
    //   407: aload_1
    //   408: invokevirtual 210	java/io/File:exists	()Z
    //   411: ifeq +8 -> 419
    //   414: aload_1
    //   415: invokevirtual 213	java/io/File:delete	()Z
    //   418: pop
    //   419: iconst_0
    //   420: istore 11
    //   422: iload 11
    //   424: ireturn
    //   425: iload 11
    //   427: istore 13
    //   429: iload 11
    //   431: istore 12
    //   433: aload_0
    //   434: getfield 27	com/tencent/qqmusic/mediaplayer/PCMDataCut:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   437: iload 9
    //   439: invokevirtual 216	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:seekTo	(I)I
    //   442: pop
    //   443: goto -188 -> 255
    //   446: astore 18
    //   448: iload 13
    //   450: istore 5
    //   452: aconst_null
    //   453: astore_1
    //   454: ldc 13
    //   456: aload 18
    //   458: invokestatic 116	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   461: iconst_0
    //   462: istore 5
    //   464: aload_0
    //   465: getfield 27	com/tencent/qqmusic/mediaplayer/PCMDataCut:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   468: ifnull +16 -> 484
    //   471: aload_0
    //   472: getfield 27	com/tencent/qqmusic/mediaplayer/PCMDataCut:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   475: invokevirtual 204	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   478: pop
    //   479: aload_0
    //   480: aconst_null
    //   481: putfield 27	com/tencent/qqmusic/mediaplayer/PCMDataCut:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   484: aload_1
    //   485: ifnull +7 -> 492
    //   488: aload_1
    //   489: invokevirtual 207	com/tencent/qqmusic/mediaplayer/WaveWriter:closeWaveFile	()V
    //   492: iload 5
    //   494: istore 11
    //   496: aload 17
    //   498: ifnull -76 -> 422
    //   501: iload 5
    //   503: istore 11
    //   505: aload 17
    //   507: invokevirtual 210	java/io/File:exists	()Z
    //   510: ifeq -88 -> 422
    //   513: aload 17
    //   515: invokevirtual 213	java/io/File:delete	()Z
    //   518: pop
    //   519: iconst_0
    //   520: ireturn
    //   521: astore_1
    //   522: ldc 13
    //   524: aload_1
    //   525: invokestatic 116	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   528: iconst_0
    //   529: ireturn
    //   530: astore_1
    //   531: ldc 13
    //   533: aload_1
    //   534: invokestatic 116	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   537: goto -118 -> 419
    //   540: iload 8
    //   542: istore 7
    //   544: aload_0
    //   545: getfield 27	com/tencent/qqmusic/mediaplayer/PCMDataCut:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   548: invokevirtual 197	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:getCurrentTime	()J
    //   551: iload 9
    //   553: iload 10
    //   555: iadd
    //   556: iconst_2
    //   557: idiv
    //   558: i2l
    //   559: lcmp
    //   560: ifle +625 -> 1185
    //   563: iload_2
    //   564: iconst_m1
    //   565: if_icmpne +620 -> 1185
    //   568: aload_0
    //   569: getfield 27	com/tencent/qqmusic/mediaplayer/PCMDataCut:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   572: invokevirtual 197	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:getCurrentTime	()J
    //   575: iload 9
    //   577: i2l
    //   578: lsub
    //   579: l2f
    //   580: ldc -39
    //   582: fdiv
    //   583: fstore 6
    //   585: ldc 13
    //   587: new 64	java/lang/StringBuilder
    //   590: dup
    //   591: ldc -37
    //   593: invokespecial 68	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   596: fload 6
    //   598: invokevirtual 222	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   601: ldc -32
    //   603: invokevirtual 77	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   606: iload 4
    //   608: invokevirtual 72	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   611: invokevirtual 81	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   614: invokestatic 170	com/tencent/qqmusic/mediaplayer/util/Logger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   617: fconst_2
    //   618: iload 4
    //   620: i2f
    //   621: fmul
    //   622: fload 6
    //   624: aload_0
    //   625: getfield 29	com/tencent/qqmusic/mediaplayer/PCMDataCut:mAudioCut	Lcom/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut;
    //   628: getfield 41	com/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut:information	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   631: invokevirtual 51	com/tencent/qqmusic/mediaplayer/AudioInformation:getSampleRate	()J
    //   634: l2f
    //   635: fmul
    //   636: aload_0
    //   637: getfield 29	com/tencent/qqmusic/mediaplayer/PCMDataCut:mAudioCut	Lcom/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut;
    //   640: getfield 41	com/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut:information	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   643: invokevirtual 47	com/tencent/qqmusic/mediaplayer/AudioInformation:getChannels	()I
    //   646: i2f
    //   647: fmul
    //   648: fdiv
    //   649: fstore 6
    //   651: aload_0
    //   652: getfield 29	com/tencent/qqmusic/mediaplayer/PCMDataCut:mAudioCut	Lcom/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut;
    //   655: fload 6
    //   657: invokestatic 228	java/lang/Math:round	(F)I
    //   660: bipush 8
    //   662: imul
    //   663: putfield 188	com/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut:sampleBit	I
    //   666: ldc 13
    //   668: new 64	java/lang/StringBuilder
    //   671: dup
    //   672: ldc -26
    //   674: invokespecial 68	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   677: aload_0
    //   678: getfield 29	com/tencent/qqmusic/mediaplayer/PCMDataCut:mAudioCut	Lcom/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut;
    //   681: getfield 188	com/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut:sampleBit	I
    //   684: invokevirtual 72	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   687: invokevirtual 81	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   690: invokestatic 170	com/tencent/qqmusic/mediaplayer/util/Logger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   693: aload_0
    //   694: getfield 29	com/tencent/qqmusic/mediaplayer/PCMDataCut:mAudioCut	Lcom/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut;
    //   697: getfield 188	com/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut:sampleBit	I
    //   700: bipush 8
    //   702: if_icmpge +115 -> 817
    //   705: ldc 13
    //   707: new 64	java/lang/StringBuilder
    //   710: dup
    //   711: ldc -26
    //   713: invokespecial 68	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   716: aload_0
    //   717: getfield 29	com/tencent/qqmusic/mediaplayer/PCMDataCut:mAudioCut	Lcom/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut;
    //   720: getfield 188	com/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut:sampleBit	I
    //   723: invokevirtual 72	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   726: invokevirtual 81	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   729: invokestatic 232	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   732: aload_0
    //   733: getfield 27	com/tencent/qqmusic/mediaplayer/PCMDataCut:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   736: ifnull +16 -> 752
    //   739: aload_0
    //   740: getfield 27	com/tencent/qqmusic/mediaplayer/PCMDataCut:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   743: invokevirtual 204	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   746: pop
    //   747: aload_0
    //   748: aconst_null
    //   749: putfield 27	com/tencent/qqmusic/mediaplayer/PCMDataCut:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   752: aload 17
    //   754: invokevirtual 207	com/tencent/qqmusic/mediaplayer/WaveWriter:closeWaveFile	()V
    //   757: iload 11
    //   759: ifne +15 -> 774
    //   762: aload_1
    //   763: invokevirtual 210	java/io/File:exists	()Z
    //   766: ifeq +8 -> 774
    //   769: aload_1
    //   770: invokevirtual 213	java/io/File:delete	()Z
    //   773: pop
    //   774: iconst_0
    //   775: ireturn
    //   776: astore 18
    //   778: ldc 13
    //   780: aload 18
    //   782: invokestatic 116	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   785: goto -241 -> 544
    //   788: astore 18
    //   790: iload 11
    //   792: istore 5
    //   794: aload 17
    //   796: astore 19
    //   798: aload_1
    //   799: astore 17
    //   801: aload 19
    //   803: astore_1
    //   804: goto -350 -> 454
    //   807: astore_1
    //   808: ldc 13
    //   810: aload_1
    //   811: invokestatic 116	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   814: goto -40 -> 774
    //   817: iload 10
    //   819: iload 9
    //   821: isub
    //   822: sipush 1000
    //   825: idiv
    //   826: i2l
    //   827: aload_0
    //   828: getfield 29	com/tencent/qqmusic/mediaplayer/PCMDataCut:mAudioCut	Lcom/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut;
    //   831: getfield 41	com/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut:information	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   834: invokevirtual 51	com/tencent/qqmusic/mediaplayer/AudioInformation:getSampleRate	()J
    //   837: lmul
    //   838: aload_0
    //   839: getfield 29	com/tencent/qqmusic/mediaplayer/PCMDataCut:mAudioCut	Lcom/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut;
    //   842: getfield 41	com/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut:information	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   845: invokevirtual 47	com/tencent/qqmusic/mediaplayer/AudioInformation:getChannels	()I
    //   848: i2l
    //   849: lmul
    //   850: aload_0
    //   851: getfield 29	com/tencent/qqmusic/mediaplayer/PCMDataCut:mAudioCut	Lcom/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut;
    //   854: getfield 188	com/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut:sampleBit	I
    //   857: i2l
    //   858: lmul
    //   859: ldc2_w 233
    //   862: ldiv
    //   863: l2i
    //   864: istore_2
    //   865: aload 17
    //   867: aload_0
    //   868: getfield 29	com/tencent/qqmusic/mediaplayer/PCMDataCut:mAudioCut	Lcom/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut;
    //   871: getfield 188	com/tencent/qqmusic/mediaplayer/PCMDataCut$AudioCut:sampleBit	I
    //   874: invokevirtual 238	com/tencent/qqmusic/mediaplayer/WaveWriter:setSampleByte	(I)V
    //   877: iload_2
    //   878: istore_3
    //   879: iload 7
    //   881: iconst_2
    //   882: idiv
    //   883: iload 4
    //   885: iadd
    //   886: istore 4
    //   888: iload 7
    //   890: iconst_2
    //   891: idiv
    //   892: istore 8
    //   894: iload_3
    //   895: iconst_m1
    //   896: if_icmpeq +111 -> 1007
    //   899: iload 4
    //   901: iload_3
    //   902: if_icmplt +105 -> 1007
    //   905: aload 17
    //   907: aload 20
    //   909: iconst_0
    //   910: iload 8
    //   912: iload 4
    //   914: iload_3
    //   915: isub
    //   916: isub
    //   917: invokevirtual 242	com/tencent/qqmusic/mediaplayer/WaveWriter:write	([SII)V
    //   920: iload 5
    //   922: ifeq +106 -> 1028
    //   925: aload 17
    //   927: invokevirtual 245	com/tencent/qqmusic/mediaplayer/WaveWriter:reSamplerTo8K	()Z
    //   930: istore 5
    //   932: aload_0
    //   933: getfield 27	com/tencent/qqmusic/mediaplayer/PCMDataCut:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   936: ifnull +16 -> 952
    //   939: aload_0
    //   940: getfield 27	com/tencent/qqmusic/mediaplayer/PCMDataCut:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   943: invokevirtual 204	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   946: pop
    //   947: aload_0
    //   948: aconst_null
    //   949: putfield 27	com/tencent/qqmusic/mediaplayer/PCMDataCut:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   952: aload 17
    //   954: ifnull +8 -> 962
    //   957: aload 17
    //   959: invokevirtual 207	com/tencent/qqmusic/mediaplayer/WaveWriter:closeWaveFile	()V
    //   962: iload 5
    //   964: istore 11
    //   966: iload 5
    //   968: ifne -546 -> 422
    //   971: iload 5
    //   973: istore 11
    //   975: aload_1
    //   976: ifnull -554 -> 422
    //   979: iload 5
    //   981: istore 11
    //   983: aload_1
    //   984: invokevirtual 210	java/io/File:exists	()Z
    //   987: ifeq -565 -> 422
    //   990: aload_1
    //   991: invokevirtual 213	java/io/File:delete	()Z
    //   994: pop
    //   995: iload 5
    //   997: ireturn
    //   998: astore_1
    //   999: ldc 13
    //   1001: aload_1
    //   1002: invokestatic 116	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1005: iconst_0
    //   1006: ireturn
    //   1007: aload 17
    //   1009: aload 20
    //   1011: iconst_0
    //   1012: iload 8
    //   1014: invokevirtual 242	com/tencent/qqmusic/mediaplayer/WaveWriter:write	([SII)V
    //   1017: iload_3
    //   1018: istore 8
    //   1020: iload_2
    //   1021: istore_3
    //   1022: iload 8
    //   1024: istore_2
    //   1025: goto -701 -> 324
    //   1028: aload 17
    //   1030: invokevirtual 248	com/tencent/qqmusic/mediaplayer/WaveWriter:reSampler	()Z
    //   1033: istore 5
    //   1035: goto -103 -> 932
    //   1038: astore_1
    //   1039: iload 12
    //   1041: istore 11
    //   1043: aload 19
    //   1045: astore 17
    //   1047: aload_0
    //   1048: getfield 27	com/tencent/qqmusic/mediaplayer/PCMDataCut:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   1051: ifnull +16 -> 1067
    //   1054: aload_0
    //   1055: getfield 27	com/tencent/qqmusic/mediaplayer/PCMDataCut:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   1058: invokevirtual 204	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   1061: pop
    //   1062: aload_0
    //   1063: aconst_null
    //   1064: putfield 27	com/tencent/qqmusic/mediaplayer/PCMDataCut:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   1067: aload 18
    //   1069: ifnull +8 -> 1077
    //   1072: aload 18
    //   1074: invokevirtual 207	com/tencent/qqmusic/mediaplayer/WaveWriter:closeWaveFile	()V
    //   1077: iload 11
    //   1079: ifne +22 -> 1101
    //   1082: aload 17
    //   1084: ifnull +17 -> 1101
    //   1087: aload 17
    //   1089: invokevirtual 210	java/io/File:exists	()Z
    //   1092: ifeq +9 -> 1101
    //   1095: aload 17
    //   1097: invokevirtual 213	java/io/File:delete	()Z
    //   1100: pop
    //   1101: aload_1
    //   1102: athrow
    //   1103: astore 17
    //   1105: ldc 13
    //   1107: aload 17
    //   1109: invokestatic 116	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1112: goto -11 -> 1101
    //   1115: astore 19
    //   1117: aload_1
    //   1118: astore 17
    //   1120: aload 19
    //   1122: astore_1
    //   1123: goto -76 -> 1047
    //   1126: astore 19
    //   1128: aload 17
    //   1130: astore 18
    //   1132: aload_1
    //   1133: astore 17
    //   1135: aload 19
    //   1137: astore_1
    //   1138: goto -91 -> 1047
    //   1141: astore 19
    //   1143: aload_1
    //   1144: astore 18
    //   1146: aload 19
    //   1148: astore_1
    //   1149: iload 5
    //   1151: istore 11
    //   1153: goto -106 -> 1047
    //   1156: astore 18
    //   1158: iload 13
    //   1160: istore 5
    //   1162: aconst_null
    //   1163: astore_1
    //   1164: goto -710 -> 454
    //   1167: astore 18
    //   1169: iload 11
    //   1171: istore 5
    //   1173: aconst_null
    //   1174: astore 19
    //   1176: aload_1
    //   1177: astore 17
    //   1179: aload 19
    //   1181: astore_1
    //   1182: goto -728 -> 454
    //   1185: iload_2
    //   1186: istore 8
    //   1188: iload_3
    //   1189: istore_2
    //   1190: iload 8
    //   1192: istore_3
    //   1193: goto -314 -> 879
    //   1196: aconst_null
    //   1197: astore_1
    //   1198: aconst_null
    //   1199: astore 17
    //   1201: iload 11
    //   1203: istore 5
    //   1205: goto -273 -> 932
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1208	0	this	PCMDataCut
    //   0	1208	1	paramString	String
    //   0	1208	2	paramInt1	int
    //   0	1208	3	paramInt2	int
    //   0	1208	4	paramInt3	int
    //   0	1208	5	paramBoolean	boolean
    //   583	73	6	f	float
    //   256	636	7	i	int
    //   370	821	8	j	int
    //   136	686	9	k	int
    //   143	679	10	m	int
    //   23	1179	11	bool1	boolean
    //   1	1039	12	bool2	boolean
    //   4	1155	13	bool3	boolean
    //   19	7	14	bool4	boolean
    //   337	3	15	l	long
    //   13	1083	17	localObject1	Object
    //   1103	5	17	localIOException	java.io.IOException
    //   1118	82	17	str	String
    //   7	1	18	localObject2	Object
    //   446	11	18	localException1	Exception
    //   776	5	18	localUnsatisfiedLinkError	UnsatisfiedLinkError
    //   788	285	18	localException2	Exception
    //   1130	15	18	localObject3	Object
    //   1156	1	18	localException3	Exception
    //   1167	1	18	localException4	Exception
    //   10	1034	19	localObject4	Object
    //   1115	6	19	localObject5	Object
    //   1126	10	19	localObject6	Object
    //   1141	6	19	localObject7	Object
    //   1174	6	19	localObject8	Object
    //   210	800	20	arrayOfShort	short[]
    // Exception table:
    //   from	to	target	type
    //   15	21	446	java/lang/Exception
    //   36	42	446	java/lang/Exception
    //   57	63	446	java/lang/Exception
    //   158	193	446	java/lang/Exception
    //   201	212	446	java/lang/Exception
    //   220	230	446	java/lang/Exception
    //   238	255	446	java/lang/Exception
    //   266	275	446	java/lang/Exception
    //   433	443	446	java/lang/Exception
    //   488	492	521	java/io/IOException
    //   505	519	521	java/io/IOException
    //   397	402	530	java/io/IOException
    //   407	419	530	java/io/IOException
    //   352	372	776	java/lang/UnsatisfiedLinkError
    //   313	319	788	java/lang/Exception
    //   330	339	788	java/lang/Exception
    //   352	372	788	java/lang/Exception
    //   544	563	788	java/lang/Exception
    //   568	732	788	java/lang/Exception
    //   778	785	788	java/lang/Exception
    //   817	877	788	java/lang/Exception
    //   879	894	788	java/lang/Exception
    //   905	920	788	java/lang/Exception
    //   925	932	788	java/lang/Exception
    //   1007	1017	788	java/lang/Exception
    //   1028	1035	788	java/lang/Exception
    //   752	757	807	java/io/IOException
    //   762	774	807	java/io/IOException
    //   957	962	998	java/io/IOException
    //   983	995	998	java/io/IOException
    //   15	21	1038	finally
    //   36	42	1038	finally
    //   57	63	1038	finally
    //   71	81	1038	finally
    //   89	106	1038	finally
    //   110	117	1038	finally
    //   121	128	1038	finally
    //   158	193	1038	finally
    //   201	212	1038	finally
    //   220	230	1038	finally
    //   238	255	1038	finally
    //   266	275	1038	finally
    //   433	443	1038	finally
    //   1072	1077	1103	java/io/IOException
    //   1087	1101	1103	java/io/IOException
    //   275	313	1115	finally
    //   313	319	1126	finally
    //   330	339	1126	finally
    //   352	372	1126	finally
    //   544	563	1126	finally
    //   568	732	1126	finally
    //   778	785	1126	finally
    //   817	877	1126	finally
    //   879	894	1126	finally
    //   905	920	1126	finally
    //   925	932	1126	finally
    //   1007	1017	1126	finally
    //   1028	1035	1126	finally
    //   454	461	1141	finally
    //   71	81	1156	java/lang/Exception
    //   89	106	1156	java/lang/Exception
    //   110	117	1156	java/lang/Exception
    //   121	128	1156	java/lang/Exception
    //   275	313	1167	java/lang/Exception
  }
  
  private static class AudioCut
  {
    AudioFormat.AudioType audioType;
    int bufferSize;
    AudioInformation information;
    int sampleBit = 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\PCMDataCut.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */