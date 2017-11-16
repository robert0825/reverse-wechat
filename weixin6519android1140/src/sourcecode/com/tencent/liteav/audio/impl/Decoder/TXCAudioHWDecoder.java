package com.tencent.liteav.audio.impl.Decoder;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.audio.TXIAudioPlayListener;
import com.tencent.liteav.basic.enums.TXEAudioTypeDef;
import com.tencent.liteav.basic.structs.TXSAudioPacket;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class TXCAudioHWDecoder
  implements TXIAudioDecoder, Runnable
{
  private static final String TAG = "TXCAudioHWDecoder";
  private static final int TIMEOUT_USEC = 10000;
  private Vector<TXSAudioPacket> mAudioDatas;
  private MediaCodec.BufferInfo mBufInfo;
  private int mDecType = 0;
  private MediaCodec mDecoder = null;
  private volatile boolean mIsStart = false;
  private WeakReference<TXIAudioPlayListener> mListener = null;
  private MediaFormat mMediaFormat;
  private Thread mThread = null;
  private List mTsCache;
  private long prevOutputPTSUs = 0L;
  
  private int decAAC(TXSAudioPacket paramTXSAudioPacket, ByteBuffer[] paramArrayOfByteBuffer, int paramInt)
  {
    if (paramInt >= 0) {}
    label386:
    for (;;)
    {
      try
      {
        if (paramTXSAudioPacket.audioData != null)
        {
          paramArrayOfByteBuffer = paramArrayOfByteBuffer[paramInt];
          paramArrayOfByteBuffer.clear();
          paramArrayOfByteBuffer.put(paramTXSAudioPacket.audioData);
        }
        if ((paramTXSAudioPacket == null) || (paramTXSAudioPacket.audioData.length <= 0)) {
          continue;
        }
        this.mDecoder.queueInputBuffer(paramInt, 0, paramTXSAudioPacket.audioData.length, getPTSUs(), 0);
        paramArrayOfByteBuffer = this.mDecoder.getOutputBuffers();
        paramTXSAudioPacket = paramArrayOfByteBuffer;
        if (this.mBufInfo == null)
        {
          this.mBufInfo = new MediaCodec.BufferInfo();
          paramTXSAudioPacket = paramArrayOfByteBuffer;
        }
        paramInt = this.mDecoder.dequeueOutputBuffer(this.mBufInfo, 10000L);
        if (paramInt != -3) {
          continue;
        }
        paramTXSAudioPacket = this.mDecoder.getOutputBuffers();
        if (paramInt >= 0) {
          continue;
        }
      }
      catch (Exception paramTXSAudioPacket)
      {
        Object localObject;
        long l;
        continue;
      }
      return TXEAudioDef.TXE_AUDIO_PLAY_ERR_OK;
      this.mDecoder.queueInputBuffer(paramInt, 0, 0, getPTSUs(), 4);
      continue;
      if (paramInt == -2)
      {
        this.mMediaFormat = this.mDecoder.getOutputFormat();
        if (this.mListener != null)
        {
          paramArrayOfByteBuffer = (TXIAudioPlayListener)this.mListener.get();
          localObject = new TXSAudioPacket();
          ((TXSAudioPacket)localObject).bitsPerChannel = TXEAudioTypeDef.TXE_BITS_PER_CHANNEL_16;
          ((TXSAudioPacket)localObject).channelsPerSample = this.mMediaFormat.getInteger("channel-count");
          ((TXSAudioPacket)localObject).sampleRate = this.mMediaFormat.getInteger("sample-rate");
          if (paramArrayOfByteBuffer == null) {
            break label386;
          }
          paramArrayOfByteBuffer.onPlayAudioInfoChanged((TXSAudioPacket)localObject);
          break label386;
        }
      }
      else if (paramInt >= 0)
      {
        localObject = paramTXSAudioPacket[paramInt];
        ((ByteBuffer)localObject).position(this.mBufInfo.offset);
        ((ByteBuffer)localObject).limit(this.mBufInfo.offset + this.mBufInfo.size);
        paramArrayOfByteBuffer = new byte[this.mBufInfo.size];
        ((ByteBuffer)localObject).get(paramArrayOfByteBuffer);
        l = ((Long)this.mTsCache.get(0)).longValue();
        this.mTsCache.remove(0);
        if (this.mListener != null)
        {
          localObject = (TXIAudioPlayListener)this.mListener.get();
          if (localObject != null) {
            ((TXIAudioPlayListener)localObject).onPlayPcmData(paramArrayOfByteBuffer, l);
          }
        }
        this.mDecoder.releaseOutputBuffer(paramInt, false);
      }
      continue;
      if (paramInt == -1) {
        return -1;
      }
    }
  }
  
  private long getPTSUs()
  {
    long l2 = TXCTimeUtil.getTimeTick();
    long l1 = l2;
    if (l2 < this.prevOutputPTSUs) {
      l1 = l2 + (this.prevOutputPTSUs - l2);
    }
    this.prevOutputPTSUs = l1;
    return l1;
  }
  
  /* Error */
  private int initAACCodec(TXSAudioPacket paramTXSAudioPacket)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 63	com/tencent/liteav/basic/structs/TXSAudioPacket:audioData	[B
    //   4: arraylength
    //   5: iconst_2
    //   6: if_icmpeq +28 -> 34
    //   9: ldc 12
    //   11: new 201	java/lang/StringBuilder
    //   14: dup
    //   15: ldc -53
    //   17: invokespecial 206	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   20: aload_1
    //   21: getfield 63	com/tencent/liteav/basic/structs/TXSAudioPacket:audioData	[B
    //   24: arraylength
    //   25: invokevirtual 210	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   28: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   31: invokestatic 220	com/tencent/liteav/basic/log/TXCLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   34: aload_1
    //   35: getfield 63	com/tencent/liteav/basic/structs/TXSAudioPacket:audioData	[B
    //   38: ifnull +601 -> 639
    //   41: aload_1
    //   42: getfield 63	com/tencent/liteav/basic/structs/TXSAudioPacket:audioData	[B
    //   45: iconst_0
    //   46: baload
    //   47: bipush 7
    //   49: iand
    //   50: iconst_1
    //   51: ishl
    //   52: aload_1
    //   53: getfield 63	com/tencent/liteav/basic/structs/TXSAudioPacket:audioData	[B
    //   56: iconst_1
    //   57: baload
    //   58: sipush 128
    //   61: iand
    //   62: bipush 7
    //   64: ishr
    //   65: ior
    //   66: invokestatic 226	com/tencent/liteav/audio/impl/TXCAudioUtil:getSampelRate	(I)I
    //   69: istore_2
    //   70: aload_1
    //   71: getfield 63	com/tencent/liteav/basic/structs/TXSAudioPacket:audioData	[B
    //   74: iconst_1
    //   75: baload
    //   76: bipush 120
    //   78: iand
    //   79: iconst_3
    //   80: ishr
    //   81: istore_3
    //   82: aload_0
    //   83: ldc -28
    //   85: iload_2
    //   86: iload_3
    //   87: invokestatic 232	android/media/MediaFormat:createAudioFormat	(Ljava/lang/String;II)Landroid/media/MediaFormat;
    //   90: putfield 109	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mMediaFormat	Landroid/media/MediaFormat;
    //   93: aload_0
    //   94: getfield 109	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mMediaFormat	Landroid/media/MediaFormat;
    //   97: ldc -22
    //   99: ldc -21
    //   101: invokevirtual 239	android/media/MediaFormat:setInteger	(Ljava/lang/String;I)V
    //   104: aload_0
    //   105: getfield 109	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mMediaFormat	Landroid/media/MediaFormat;
    //   108: ldc -15
    //   110: iconst_0
    //   111: invokevirtual 239	android/media/MediaFormat:setInteger	(Ljava/lang/String;I)V
    //   114: aload_0
    //   115: getfield 109	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mMediaFormat	Landroid/media/MediaFormat;
    //   118: ldc -13
    //   120: iconst_2
    //   121: invokevirtual 239	android/media/MediaFormat:setInteger	(Ljava/lang/String;I)V
    //   124: ldc 12
    //   126: new 201	java/lang/StringBuilder
    //   129: dup
    //   130: ldc -11
    //   132: invokespecial 206	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   135: aload_0
    //   136: getfield 109	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mMediaFormat	Landroid/media/MediaFormat;
    //   139: invokevirtual 248	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   142: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   145: invokestatic 251	com/tencent/liteav/basic/log/TXCLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   148: aload_0
    //   149: getfield 42	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mListener	Ljava/lang/ref/WeakReference;
    //   152: ifnull +58 -> 210
    //   155: aload_0
    //   156: getfield 42	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mListener	Ljava/lang/ref/WeakReference;
    //   159: invokevirtual 115	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   162: checkcast 117	com/tencent/liteav/audio/TXIAudioPlayListener
    //   165: astore 4
    //   167: new 59	com/tencent/liteav/basic/structs/TXSAudioPacket
    //   170: dup
    //   171: invokespecial 118	com/tencent/liteav/basic/structs/TXSAudioPacket:<init>	()V
    //   174: astore 5
    //   176: aload 5
    //   178: getstatic 123	com/tencent/liteav/basic/enums/TXEAudioTypeDef:TXE_BITS_PER_CHANNEL_16	I
    //   181: putfield 126	com/tencent/liteav/basic/structs/TXSAudioPacket:bitsPerChannel	I
    //   184: aload 5
    //   186: iload_3
    //   187: putfield 137	com/tencent/liteav/basic/structs/TXSAudioPacket:channelsPerSample	I
    //   190: aload 5
    //   192: iload_2
    //   193: putfield 142	com/tencent/liteav/basic/structs/TXSAudioPacket:sampleRate	I
    //   196: aload 4
    //   198: ifnull +12 -> 210
    //   201: aload 4
    //   203: aload 5
    //   205: invokeinterface 146 2 0
    //   210: aload_0
    //   211: getfield 46	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mDecoder	Landroid/media/MediaCodec;
    //   214: ifnull +17 -> 231
    //   217: aload_0
    //   218: getfield 46	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mDecoder	Landroid/media/MediaCodec;
    //   221: invokevirtual 254	android/media/MediaCodec:stop	()V
    //   224: aload_0
    //   225: getfield 46	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mDecoder	Landroid/media/MediaCodec;
    //   228: invokevirtual 257	android/media/MediaCodec:release	()V
    //   231: aload_0
    //   232: ldc -28
    //   234: invokestatic 261	android/media/MediaCodec:createDecoderByType	(Ljava/lang/String;)Landroid/media/MediaCodec;
    //   237: putfield 46	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mDecoder	Landroid/media/MediaCodec;
    //   240: getstatic 266	android/os/Build$VERSION:SDK_INT	I
    //   243: bipush 21
    //   245: if_icmplt +283 -> 528
    //   248: iconst_0
    //   249: istore_2
    //   250: aload_0
    //   251: getfield 46	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mDecoder	Landroid/media/MediaCodec;
    //   254: aload_0
    //   255: getfield 109	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mMediaFormat	Landroid/media/MediaFormat;
    //   258: aconst_null
    //   259: aconst_null
    //   260: iconst_0
    //   261: invokevirtual 270	android/media/MediaCodec:configure	(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    //   264: aload_0
    //   265: getfield 46	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mDecoder	Landroid/media/MediaCodec;
    //   268: invokevirtual 273	android/media/MediaCodec:start	()V
    //   271: aload_0
    //   272: getfield 46	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mDecoder	Landroid/media/MediaCodec;
    //   275: ifnull +26 -> 301
    //   278: aload_0
    //   279: aload_1
    //   280: aload_0
    //   281: getfield 46	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mDecoder	Landroid/media/MediaCodec;
    //   284: invokevirtual 276	android/media/MediaCodec:getInputBuffers	()[Ljava/nio/ByteBuffer;
    //   287: aload_0
    //   288: getfield 46	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mDecoder	Landroid/media/MediaCodec;
    //   291: ldc2_w 93
    //   294: invokevirtual 280	android/media/MediaCodec:dequeueInputBuffer	(J)I
    //   297: invokespecial 282	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:decAAC	(Lcom/tencent/liteav/basic/structs/TXSAudioPacket;[Ljava/nio/ByteBuffer;I)I
    //   300: pop
    //   301: getstatic 103	com/tencent/liteav/audio/TXEAudioDef:TXE_AUDIO_PLAY_ERR_OK	I
    //   304: ireturn
    //   305: astore 4
    //   307: iconst_0
    //   308: istore_2
    //   309: ldc 12
    //   311: new 201	java/lang/StringBuilder
    //   314: dup
    //   315: ldc_w 284
    //   318: invokespecial 206	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   321: iload_2
    //   322: invokevirtual 210	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   325: ldc_w 286
    //   328: invokevirtual 289	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   331: aload 4
    //   333: invokevirtual 248	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   336: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   339: invokestatic 292	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   342: goto -111 -> 231
    //   345: astore 4
    //   347: ldc 12
    //   349: new 201	java/lang/StringBuilder
    //   352: dup
    //   353: ldc_w 294
    //   356: invokespecial 206	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   359: aload 4
    //   361: invokevirtual 297	java/io/IOException:getMessage	()Ljava/lang/String;
    //   364: invokevirtual 289	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   367: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   370: invokestatic 292	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   373: goto -133 -> 240
    //   376: astore 4
    //   378: iconst_0
    //   379: istore_3
    //   380: ldc 12
    //   382: new 201	java/lang/StringBuilder
    //   385: dup
    //   386: ldc_w 299
    //   389: invokespecial 206	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   392: aload 4
    //   394: invokevirtual 248	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   397: ldc_w 301
    //   400: invokevirtual 289	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   403: iload_3
    //   404: invokevirtual 210	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   407: ldc_w 303
    //   410: invokevirtual 289	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   413: aload_0
    //   414: getfield 109	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mMediaFormat	Landroid/media/MediaFormat;
    //   417: invokevirtual 248	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   420: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   423: invokestatic 292	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   426: iload_2
    //   427: iconst_1
    //   428: iadd
    //   429: istore_2
    //   430: iload_2
    //   431: iconst_1
    //   432: if_icmple +27 -> 459
    //   435: ldc 12
    //   437: ldc_w 305
    //   440: invokestatic 292	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   443: aload_0
    //   444: getfield 46	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mDecoder	Landroid/media/MediaCodec;
    //   447: invokevirtual 257	android/media/MediaCodec:release	()V
    //   450: aload_0
    //   451: aconst_null
    //   452: putfield 46	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mDecoder	Landroid/media/MediaCodec;
    //   455: getstatic 308	com/tencent/liteav/audio/TXEAudioDef:TXE_AUDIO_PLAY_ERR_INVALID_STATE	I
    //   458: ireturn
    //   459: aload 4
    //   461: invokevirtual 312	android/media/MediaCodec$CodecException:isRecoverable	()Z
    //   464: ifeq +18 -> 482
    //   467: aload_0
    //   468: getfield 46	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mDecoder	Landroid/media/MediaCodec;
    //   471: invokevirtual 254	android/media/MediaCodec:stop	()V
    //   474: goto -224 -> 250
    //   477: astore 4
    //   479: goto -229 -> 250
    //   482: aload 4
    //   484: invokevirtual 315	android/media/MediaCodec$CodecException:isTransient	()Z
    //   487: ifeq +17 -> 504
    //   490: ldc2_w 316
    //   493: invokestatic 323	java/lang/Thread:sleep	(J)V
    //   496: goto -246 -> 250
    //   499: astore 4
    //   501: goto -251 -> 250
    //   504: ldc 12
    //   506: ldc_w 325
    //   509: invokestatic 292	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   512: aload_0
    //   513: getfield 46	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mDecoder	Landroid/media/MediaCodec;
    //   516: invokevirtual 257	android/media/MediaCodec:release	()V
    //   519: aload_0
    //   520: aconst_null
    //   521: putfield 46	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mDecoder	Landroid/media/MediaCodec;
    //   524: getstatic 308	com/tencent/liteav/audio/TXEAudioDef:TXE_AUDIO_PLAY_ERR_INVALID_STATE	I
    //   527: ireturn
    //   528: iconst_0
    //   529: istore_2
    //   530: aload_0
    //   531: getfield 46	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mDecoder	Landroid/media/MediaCodec;
    //   534: aload_0
    //   535: getfield 109	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mMediaFormat	Landroid/media/MediaFormat;
    //   538: aconst_null
    //   539: aconst_null
    //   540: iconst_0
    //   541: invokevirtual 270	android/media/MediaCodec:configure	(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    //   544: aload_0
    //   545: getfield 46	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mDecoder	Landroid/media/MediaCodec;
    //   548: invokevirtual 273	android/media/MediaCodec:start	()V
    //   551: goto -280 -> 271
    //   554: astore 4
    //   556: iconst_1
    //   557: istore_3
    //   558: ldc 12
    //   560: new 201	java/lang/StringBuilder
    //   563: dup
    //   564: ldc_w 327
    //   567: invokespecial 206	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   570: aload 4
    //   572: invokevirtual 248	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   575: ldc_w 301
    //   578: invokevirtual 289	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   581: iload_3
    //   582: invokevirtual 210	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   585: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   588: invokestatic 292	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   591: iload_2
    //   592: iconst_1
    //   593: iadd
    //   594: istore_2
    //   595: iload_2
    //   596: iconst_1
    //   597: if_icmple +27 -> 624
    //   600: ldc 12
    //   602: ldc_w 305
    //   605: invokestatic 292	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   608: aload_0
    //   609: getfield 46	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mDecoder	Landroid/media/MediaCodec;
    //   612: invokevirtual 257	android/media/MediaCodec:release	()V
    //   615: aload_0
    //   616: aconst_null
    //   617: putfield 46	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mDecoder	Landroid/media/MediaCodec;
    //   620: getstatic 308	com/tencent/liteav/audio/TXEAudioDef:TXE_AUDIO_PLAY_ERR_INVALID_STATE	I
    //   623: ireturn
    //   624: aload_0
    //   625: getfield 46	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mDecoder	Landroid/media/MediaCodec;
    //   628: invokevirtual 330	android/media/MediaCodec:reset	()V
    //   631: goto -101 -> 530
    //   634: astore 4
    //   636: goto -106 -> 530
    //   639: getstatic 333	com/tencent/liteav/audio/TXEAudioDef:TXE_AUDIO_COMMON_ERR_INVALID_DATA	I
    //   642: ireturn
    //   643: astore 4
    //   645: iconst_0
    //   646: istore_3
    //   647: goto -89 -> 558
    //   650: astore 4
    //   652: iconst_1
    //   653: istore_3
    //   654: goto -274 -> 380
    //   657: astore 4
    //   659: iconst_1
    //   660: istore_2
    //   661: goto -352 -> 309
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	664	0	this	TXCAudioHWDecoder
    //   0	664	1	paramTXSAudioPacket	TXSAudioPacket
    //   69	592	2	i	int
    //   81	573	3	j	int
    //   165	37	4	localTXIAudioPlayListener	TXIAudioPlayListener
    //   305	27	4	localException1	Exception
    //   345	15	4	localIOException	java.io.IOException
    //   376	84	4	localCodecException1	android.media.MediaCodec.CodecException
    //   477	6	4	localException2	Exception
    //   499	1	4	localInterruptedException	InterruptedException
    //   554	17	4	localIllegalStateException1	IllegalStateException
    //   634	1	4	localException3	Exception
    //   643	1	4	localIllegalStateException2	IllegalStateException
    //   650	1	4	localCodecException2	android.media.MediaCodec.CodecException
    //   657	1	4	localException4	Exception
    //   174	30	5	localTXSAudioPacket	TXSAudioPacket
    // Exception table:
    //   from	to	target	type
    //   217	224	305	java/lang/Exception
    //   231	240	345	java/io/IOException
    //   250	264	376	android/media/MediaCodec$CodecException
    //   467	474	477	java/lang/Exception
    //   490	496	499	java/lang/InterruptedException
    //   544	551	554	java/lang/IllegalStateException
    //   624	631	634	java/lang/Exception
    //   530	544	643	java/lang/IllegalStateException
    //   264	271	650	android/media/MediaCodec$CodecException
    //   224	231	657	java/lang/Exception
  }
  
  public void doDecodec(TXSAudioPacket paramTXSAudioPacket)
  {
    if (!this.mIsStart) {
      return;
    }
    synchronized (this.mAudioDatas)
    {
      if (this.mAudioDatas != null) {
        this.mAudioDatas.add(paramTXSAudioPacket);
      }
      return;
    }
  }
  
  public void init(int paramInt, WeakReference<TXIAudioPlayListener> paramWeakReference)
  {
    if (this.mIsStart) {
      unInit();
    }
    this.mListener = paramWeakReference;
    this.mDecType = paramInt;
    this.prevOutputPTSUs = 0L;
    this.mAudioDatas = new Vector();
    this.mTsCache = new ArrayList();
    this.mIsStart = true;
    this.mThread = new Thread(this);
    this.mThread.setName("TXCAudioHWDecoder");
    this.mThread.start();
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 50	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mIsStart	Z
    //   4: ifeq +234 -> 238
    //   7: aload_0
    //   8: getfield 336	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mAudioDatas	Ljava/util/Vector;
    //   11: astore 4
    //   13: aload 4
    //   15: monitorenter
    //   16: aload_0
    //   17: getfield 336	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mAudioDatas	Ljava/util/Vector;
    //   20: invokevirtual 364	java/util/Vector:isEmpty	()Z
    //   23: istore_3
    //   24: aload 4
    //   26: monitorexit
    //   27: iload_3
    //   28: ifeq +25 -> 53
    //   31: ldc2_w 365
    //   34: invokestatic 323	java/lang/Thread:sleep	(J)V
    //   37: goto -37 -> 0
    //   40: astore 4
    //   42: goto -42 -> 0
    //   45: astore 5
    //   47: aload 4
    //   49: monitorexit
    //   50: aload 5
    //   52: athrow
    //   53: aload_0
    //   54: getfield 46	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mDecoder	Landroid/media/MediaCodec;
    //   57: ifnull +213 -> 270
    //   60: aload_0
    //   61: getfield 46	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mDecoder	Landroid/media/MediaCodec;
    //   64: invokevirtual 276	android/media/MediaCodec:getInputBuffers	()[Ljava/nio/ByteBuffer;
    //   67: astore 4
    //   69: iconst_1
    //   70: istore_1
    //   71: aload_0
    //   72: getfield 46	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mDecoder	Landroid/media/MediaCodec;
    //   75: ldc2_w 93
    //   78: invokevirtual 280	android/media/MediaCodec:dequeueInputBuffer	(J)I
    //   81: istore_2
    //   82: iload_2
    //   83: ifge +4 -> 87
    //   86: return
    //   87: iload_2
    //   88: istore_1
    //   89: aload_0
    //   90: getfield 336	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mAudioDatas	Ljava/util/Vector;
    //   93: astore 5
    //   95: aload 5
    //   97: monitorenter
    //   98: aload_0
    //   99: getfield 336	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mAudioDatas	Ljava/util/Vector;
    //   102: iconst_0
    //   103: invokevirtual 367	java/util/Vector:remove	(I)Ljava/lang/Object;
    //   106: checkcast 59	com/tencent/liteav/basic/structs/TXSAudioPacket
    //   109: astore 6
    //   111: aload 5
    //   113: monitorexit
    //   114: aload 6
    //   116: getfield 370	com/tencent/liteav/basic/structs/TXSAudioPacket:packetType	I
    //   119: getstatic 373	com/tencent/liteav/basic/enums/TXEAudioTypeDef:TXE_AUDIO_PACKET_TYPE_AAC_SEQ	I
    //   122: if_icmpne +59 -> 181
    //   125: aload_0
    //   126: aload 6
    //   128: invokespecial 375	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:initAACCodec	(Lcom/tencent/liteav/basic/structs/TXSAudioPacket;)I
    //   131: pop
    //   132: goto -132 -> 0
    //   135: astore 4
    //   137: iconst_0
    //   138: istore_1
    //   139: ldc 12
    //   141: new 201	java/lang/StringBuilder
    //   144: dup
    //   145: ldc_w 377
    //   148: invokespecial 206	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   151: iload_1
    //   152: invokevirtual 210	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   155: ldc_w 379
    //   158: invokevirtual 289	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: aload 4
    //   163: invokevirtual 248	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   166: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   169: invokestatic 292	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   172: return
    //   173: astore 4
    //   175: aload 5
    //   177: monitorexit
    //   178: aload 4
    //   180: athrow
    //   181: aload 6
    //   183: getfield 370	com/tencent/liteav/basic/structs/TXSAudioPacket:packetType	I
    //   186: getstatic 382	com/tencent/liteav/basic/enums/TXEAudioTypeDef:TXE_AUDIO_PACKET_TYPE_AAC_DATA	I
    //   189: if_icmpne +38 -> 227
    //   192: aload_0
    //   193: getfield 163	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mTsCache	Ljava/util/List;
    //   196: new 170	java/lang/Long
    //   199: dup
    //   200: aload 6
    //   202: getfield 385	com/tencent/liteav/basic/structs/TXSAudioPacket:timestamp	J
    //   205: invokespecial 387	java/lang/Long:<init>	(J)V
    //   208: invokeinterface 388 2 0
    //   213: pop
    //   214: aload_0
    //   215: aload 6
    //   217: aload 4
    //   219: iload_1
    //   220: invokespecial 282	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:decAAC	(Lcom/tencent/liteav/basic/structs/TXSAudioPacket;[Ljava/nio/ByteBuffer;I)I
    //   223: pop
    //   224: goto -224 -> 0
    //   227: ldc 12
    //   229: ldc_w 390
    //   232: invokestatic 292	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   235: goto -235 -> 0
    //   238: aload_0
    //   239: getfield 46	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mDecoder	Landroid/media/MediaCodec;
    //   242: ifnull -156 -> 86
    //   245: aload_0
    //   246: getfield 46	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mDecoder	Landroid/media/MediaCodec;
    //   249: invokevirtual 254	android/media/MediaCodec:stop	()V
    //   252: aload_0
    //   253: getfield 46	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mDecoder	Landroid/media/MediaCodec;
    //   256: invokevirtual 257	android/media/MediaCodec:release	()V
    //   259: aload_0
    //   260: aconst_null
    //   261: putfield 46	com/tencent/liteav/audio/impl/Decoder/TXCAudioHWDecoder:mDecoder	Landroid/media/MediaCodec;
    //   264: return
    //   265: astore 4
    //   267: goto -128 -> 139
    //   270: aconst_null
    //   271: astore 4
    //   273: iconst_m1
    //   274: istore_1
    //   275: goto -186 -> 89
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	278	0	this	TXCAudioHWDecoder
    //   70	205	1	i	int
    //   81	7	2	j	int
    //   23	5	3	bool	boolean
    //   11	14	4	localVector1	Vector
    //   40	8	4	localException1	Exception
    //   67	1	4	arrayOfByteBuffer1	ByteBuffer[]
    //   135	27	4	localException2	Exception
    //   173	45	4	arrayOfByteBuffer2	ByteBuffer[]
    //   265	1	4	localException3	Exception
    //   271	1	4	localObject1	Object
    //   45	6	5	localObject2	Object
    //   109	107	6	localTXSAudioPacket	TXSAudioPacket
    // Exception table:
    //   from	to	target	type
    //   31	37	40	java/lang/Exception
    //   16	27	45	finally
    //   47	50	45	finally
    //   60	69	135	java/lang/Exception
    //   98	114	173	finally
    //   175	178	173	finally
    //   71	82	265	java/lang/Exception
  }
  
  public void unInit()
  {
    this.mIsStart = false;
    if (this.mThread != null) {}
    try
    {
      this.mThread.join(500L);
      this.mThread = null;
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\audio\impl\Decoder\TXCAudioHWDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */