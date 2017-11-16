package com.tencent.liteav.muxer;

import android.annotation.TargetApi;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;

@TargetApi(18)
public class TXCMP4Muxer
{
  private static final int AUDIO_CACHE_SIZE = 300;
  private static final String TAG = "TXCMP4Muxer";
  private static final int VIDEO_CACHE_SIZE = 200;
  private ConcurrentLinkedQueue<Frame> mAudioCache = new ConcurrentLinkedQueue();
  private MediaFormat mAudioFormat = null;
  private int mAudioTrackId = 0;
  private long mFirstFrameOffsetUs = -1L;
  private boolean mHasVideoKeyFrame = false;
  private long mLastFramePtsUs = -1L;
  private long mLastSamplePtsUs = -1L;
  private MediaMuxer mMediaMuxer;
  private int mSpeed = 1;
  private boolean mStartFlag = false;
  private String mTargetPath = null;
  private ConcurrentLinkedQueue<Frame> mVideoCache = new ConcurrentLinkedQueue();
  private MediaFormat mVideoFormat = null;
  private int mVideoTrackId = 0;
  
  private void cache(boolean paramBoolean, ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    if ((paramByteBuffer == null) || (paramBufferInfo == null)) {
      return;
    }
    ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(paramByteBuffer.capacity());
    paramByteBuffer.rewind();
    if (paramBufferInfo.size > 0)
    {
      paramByteBuffer.position(paramBufferInfo.offset);
      paramByteBuffer.limit(paramBufferInfo.size);
    }
    localByteBuffer.rewind();
    localByteBuffer.put(paramByteBuffer);
    paramByteBuffer = new MediaCodec.BufferInfo();
    paramByteBuffer.set(paramBufferInfo.offset, paramBufferInfo.size, paramBufferInfo.presentationTimeUs, paramBufferInfo.flags);
    paramByteBuffer = new Frame(localByteBuffer, paramByteBuffer);
    if (paramBoolean)
    {
      if (this.mVideoCache.size() < 200)
      {
        this.mVideoCache.add(paramByteBuffer);
        return;
      }
      TXCLog.e("TXCMP4Muxer", "drop video frame. video cache size is larger than 200");
      return;
    }
    if (this.mAudioCache.size() < 300)
    {
      this.mAudioCache.add(paramByteBuffer);
      return;
    }
    TXCLog.e("TXCMP4Muxer", "drop audio frame. audio cache size is larger than 300");
  }
  
  private long caculateFirstFrameOffsetTime()
  {
    if (this.mVideoCache.size() > 0) {}
    for (long l1 = ((Frame)this.mVideoCache.peek()).getBufferInfo().presentationTimeUs;; l1 = 0L)
    {
      long l2 = l1;
      if (this.mAudioCache.size() > 0)
      {
        long l3 = ((Frame)this.mAudioCache.peek()).getBufferInfo().presentationTimeUs;
        l2 = l1;
        if (l1 > l3) {
          l2 = l3;
        }
      }
      return l2;
    }
  }
  
  private void flushCache()
  {
    Frame localFrame;
    while (this.mVideoCache.size() > 0)
    {
      localFrame = (Frame)this.mVideoCache.poll();
      writeVideoImpl(localFrame.getByteBuffer(), localFrame.getBufferInfo());
    }
    while (this.mAudioCache.size() > 0)
    {
      localFrame = (Frame)this.mAudioCache.poll();
      writeAudioImpl(localFrame.getByteBuffer(), localFrame.getBufferInfo());
    }
  }
  
  private void writeAudioImpl(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    long l = paramBufferInfo.presentationTimeUs - this.mFirstFrameOffsetUs;
    if ((this.mFirstFrameOffsetUs < 0L) || (l < 0L))
    {
      TXCLog.w("TXCMP4Muxer", "drop sample. first frame offset timeus = " + this.mFirstFrameOffsetUs + ", current sample timeus = " + paramBufferInfo.presentationTimeUs);
      return;
    }
    if (l < this.mLastSamplePtsUs)
    {
      TXCLog.e("TXCMP4Muxer", "audio is not in chronological order. current audio's pts pts(" + l + ") must larger than pre audio's pts(" + this.mLastSamplePtsUs + ")");
      l = this.mLastSamplePtsUs + 1L;
    }
    for (;;)
    {
      paramBufferInfo.presentationTimeUs = l;
      try
      {
        this.mMediaMuxer.writeSampleData(this.mAudioTrackId, paramByteBuffer, paramBufferInfo);
        return;
      }
      catch (IllegalStateException paramByteBuffer)
      {
        TXCLog.e("TXCMP4Muxer", "write sample IllegalStateException: " + paramByteBuffer);
        return;
        this.mLastSamplePtsUs = l;
      }
      catch (IllegalArgumentException paramByteBuffer)
      {
        TXCLog.e("TXCMP4Muxer", "write sample IllegalArgumentException: " + paramByteBuffer);
      }
    }
  }
  
  private void writeVideoImpl(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    long l2 = 0L;
    long l1 = paramBufferInfo.presentationTimeUs - this.mFirstFrameOffsetUs;
    if (l1 < 0L)
    {
      TXCLog.e("TXCMP4Muxer", "pts error! first frame offset timeus = " + this.mFirstFrameOffsetUs + ", current timeus = " + paramBufferInfo.presentationTimeUs);
      if (this.mLastFramePtsUs <= 0L) {}
    }
    for (l2 = this.mLastFramePtsUs;; l2 = l1)
    {
      if (l2 < this.mLastFramePtsUs)
      {
        TXCLog.w("TXCMP4Muxer", "video is not in chronological order. current frame's pts(" + l2 + ") smaller than pre frame's pts(" + this.mLastFramePtsUs + ")");
        l1 = l2;
        if (this.mSpeed != 1)
        {
          if (this.mSpeed != 2) {
            break label210;
          }
          l1 = l2 / 2L;
        }
      }
      for (;;)
      {
        paramBufferInfo.presentationTimeUs = l1;
        try
        {
          paramByteBuffer.position(paramBufferInfo.offset);
          paramByteBuffer.limit(paramBufferInfo.offset + paramBufferInfo.size);
          this.mMediaMuxer.writeSampleData(this.mVideoTrackId, paramByteBuffer, paramBufferInfo);
          if ((paramBufferInfo.flags & 0x1) != 0) {
            this.mHasVideoKeyFrame = true;
          }
          return;
        }
        catch (IllegalStateException paramByteBuffer)
        {
          TXCLog.e("TXCMP4Muxer", "write frame IllegalStateException: " + paramByteBuffer);
          return;
        }
        catch (IllegalArgumentException paramByteBuffer)
        {
          TXCLog.e("TXCMP4Muxer", "write frame IllegalArgumentException: " + paramByteBuffer);
          return;
        }
        this.mLastFramePtsUs = l2;
        break;
        label210:
        if (this.mSpeed == 4)
        {
          l1 = l2 / 4L;
        }
        else if (this.mSpeed == -2)
        {
          l1 = l2 * 2L;
        }
        else
        {
          l1 = l2;
          if (this.mSpeed == -4) {
            l1 = l2 * 4L;
          }
        }
      }
    }
  }
  
  public void addAudioTrack(MediaFormat paramMediaFormat)
  {
    try
    {
      TXCLog.d("TXCMP4Muxer", "addAudioTrack:" + paramMediaFormat);
      this.mAudioFormat = paramMediaFormat;
      this.mAudioCache.clear();
      return;
    }
    finally
    {
      paramMediaFormat = finally;
      throw paramMediaFormat;
    }
  }
  
  public void addVideoTrack(MediaFormat paramMediaFormat)
  {
    try
    {
      TXCLog.d("TXCMP4Muxer", "addVideoTrack:" + paramMediaFormat);
      this.mVideoFormat = paramMediaFormat;
      this.mVideoCache.clear();
      return;
    }
    finally
    {
      paramMediaFormat = finally;
      throw paramMediaFormat;
    }
  }
  
  public long getLastFramePtsUs()
  {
    return this.mLastFramePtsUs;
  }
  
  /* Error */
  public boolean hasAddAudioTrack()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 51	com/tencent/liteav/muxer/TXCMP4Muxer:mAudioFormat	Landroid/media/MediaFormat;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull +9 -> 17
    //   11: iconst_1
    //   12: istore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_1
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_1
    //   19: goto -6 -> 13
    //   22: astore_2
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_2
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	TXCMP4Muxer
    //   12	7	1	bool	boolean
    //   6	2	2	localMediaFormat	MediaFormat
    //   22	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  /* Error */
  public boolean hasAddVideoTrack()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 49	com/tencent/liteav/muxer/TXCMP4Muxer:mVideoFormat	Landroid/media/MediaFormat;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull +9 -> 17
    //   11: iconst_1
    //   12: istore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_1
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_1
    //   19: goto -6 -> 13
    //   22: astore_2
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_2
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	TXCMP4Muxer
    //   12	7	1	bool	boolean
    //   6	2	2	localMediaFormat	MediaFormat
    //   22	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  public void setSpeed(int paramInt)
  {
    this.mSpeed = paramInt;
  }
  
  public void setTargetPath(String paramString)
  {
    try
    {
      this.mTargetPath = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  /* Error */
  public int start()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 47	com/tencent/liteav/muxer/TXCMP4Muxer:mTargetPath	Ljava/lang/String;
    //   8: ifnull +13 -> 21
    //   11: aload_0
    //   12: getfield 47	com/tencent/liteav/muxer/TXCMP4Muxer:mTargetPath	Ljava/lang/String;
    //   15: invokevirtual 256	java/lang/String:isEmpty	()Z
    //   18: ifeq +17 -> 35
    //   21: ldc 17
    //   23: ldc_w 258
    //   26: invokestatic 138	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   29: iconst_m1
    //   30: istore_1
    //   31: aload_0
    //   32: monitorexit
    //   33: iload_1
    //   34: ireturn
    //   35: aload_0
    //   36: invokevirtual 260	com/tencent/liteav/muxer/TXCMP4Muxer:hasAddVideoTrack	()Z
    //   39: ifne +17 -> 56
    //   42: ldc 17
    //   44: ldc_w 262
    //   47: invokestatic 138	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   50: bipush -2
    //   52: istore_1
    //   53: goto -22 -> 31
    //   56: aload_0
    //   57: getfield 199	com/tencent/liteav/muxer/TXCMP4Muxer:mMediaMuxer	Landroid/media/MediaMuxer;
    //   60: ifnull +19 -> 79
    //   63: ldc 17
    //   65: ldc_w 264
    //   68: invokestatic 191	com/tencent/liteav/basic/log/TXCLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   71: goto -40 -> 31
    //   74: astore_2
    //   75: aload_0
    //   76: monitorexit
    //   77: aload_2
    //   78: athrow
    //   79: ldc 17
    //   81: ldc_w 265
    //   84: invokestatic 235	com/tencent/liteav/basic/log/TXCLog:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   87: aload_0
    //   88: new 201	android/media/MediaMuxer
    //   91: dup
    //   92: aload_0
    //   93: getfield 47	com/tencent/liteav/muxer/TXCMP4Muxer:mTargetPath	Ljava/lang/String;
    //   96: iconst_0
    //   97: invokespecial 268	android/media/MediaMuxer:<init>	(Ljava/lang/String;I)V
    //   100: putfield 199	com/tencent/liteav/muxer/TXCMP4Muxer:mMediaMuxer	Landroid/media/MediaMuxer;
    //   103: aload_0
    //   104: getfield 49	com/tencent/liteav/muxer/TXCMP4Muxer:mVideoFormat	Landroid/media/MediaFormat;
    //   107: astore_2
    //   108: aload_2
    //   109: ifnull +18 -> 127
    //   112: aload_0
    //   113: aload_0
    //   114: getfield 199	com/tencent/liteav/muxer/TXCMP4Muxer:mMediaMuxer	Landroid/media/MediaMuxer;
    //   117: aload_0
    //   118: getfield 49	com/tencent/liteav/muxer/TXCMP4Muxer:mVideoFormat	Landroid/media/MediaFormat;
    //   121: invokevirtual 272	android/media/MediaMuxer:addTrack	(Landroid/media/MediaFormat;)I
    //   124: putfield 55	com/tencent/liteav/muxer/TXCMP4Muxer:mVideoTrackId	I
    //   127: aload_0
    //   128: getfield 51	com/tencent/liteav/muxer/TXCMP4Muxer:mAudioFormat	Landroid/media/MediaFormat;
    //   131: astore_2
    //   132: aload_2
    //   133: ifnull +18 -> 151
    //   136: aload_0
    //   137: aload_0
    //   138: getfield 199	com/tencent/liteav/muxer/TXCMP4Muxer:mMediaMuxer	Landroid/media/MediaMuxer;
    //   141: aload_0
    //   142: getfield 51	com/tencent/liteav/muxer/TXCMP4Muxer:mAudioFormat	Landroid/media/MediaFormat;
    //   145: invokevirtual 272	android/media/MediaMuxer:addTrack	(Landroid/media/MediaFormat;)I
    //   148: putfield 53	com/tencent/liteav/muxer/TXCMP4Muxer:mAudioTrackId	I
    //   151: aload_0
    //   152: getfield 199	com/tencent/liteav/muxer/TXCMP4Muxer:mMediaMuxer	Landroid/media/MediaMuxer;
    //   155: invokevirtual 274	android/media/MediaMuxer:start	()V
    //   158: aload_0
    //   159: ldc2_w 67
    //   162: putfield 70	com/tencent/liteav/muxer/TXCMP4Muxer:mFirstFrameOffsetUs	J
    //   165: aload_0
    //   166: iconst_1
    //   167: putfield 57	com/tencent/liteav/muxer/TXCMP4Muxer:mStartFlag	Z
    //   170: aload_0
    //   171: iconst_0
    //   172: putfield 59	com/tencent/liteav/muxer/TXCMP4Muxer:mHasVideoKeyFrame	Z
    //   175: aload_0
    //   176: ldc2_w 67
    //   179: putfield 72	com/tencent/liteav/muxer/TXCMP4Muxer:mLastFramePtsUs	J
    //   182: aload_0
    //   183: ldc2_w 67
    //   186: putfield 74	com/tencent/liteav/muxer/TXCMP4Muxer:mLastSamplePtsUs	J
    //   189: goto -158 -> 31
    //   192: astore_2
    //   193: ldc 17
    //   195: new 170	java/lang/StringBuilder
    //   198: dup
    //   199: ldc_w 276
    //   202: invokespecial 175	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   205: aload_2
    //   206: invokevirtual 210	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   209: invokevirtual 188	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   212: invokestatic 138	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   215: bipush -4
    //   217: istore_1
    //   218: goto -187 -> 31
    //   221: astore_2
    //   222: ldc 17
    //   224: new 170	java/lang/StringBuilder
    //   227: dup
    //   228: ldc_w 278
    //   231: invokespecial 175	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   234: aload_2
    //   235: invokevirtual 210	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   238: invokevirtual 188	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   241: invokestatic 138	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   244: bipush -5
    //   246: istore_1
    //   247: goto -216 -> 31
    //   250: astore_2
    //   251: ldc 17
    //   253: new 170	java/lang/StringBuilder
    //   256: dup
    //   257: ldc_w 280
    //   260: invokespecial 175	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   263: aload_2
    //   264: invokevirtual 210	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   267: invokevirtual 188	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   270: invokestatic 138	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   273: bipush -6
    //   275: istore_1
    //   276: goto -245 -> 31
    //   279: astore_2
    //   280: ldc 17
    //   282: new 170	java/lang/StringBuilder
    //   285: dup
    //   286: ldc_w 282
    //   289: invokespecial 175	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   292: aload_2
    //   293: invokevirtual 210	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   296: invokevirtual 188	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   299: invokestatic 138	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   302: bipush -7
    //   304: istore_1
    //   305: goto -274 -> 31
    //   308: astore_2
    //   309: ldc 17
    //   311: new 170	java/lang/StringBuilder
    //   314: dup
    //   315: ldc_w 284
    //   318: invokespecial 175	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   321: aload_2
    //   322: invokevirtual 210	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   325: invokevirtual 188	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   328: invokestatic 138	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   331: bipush -8
    //   333: istore_1
    //   334: goto -303 -> 31
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	337	0	this	TXCMP4Muxer
    //   1	333	1	i	int
    //   74	4	2	localObject	Object
    //   107	26	2	localMediaFormat	MediaFormat
    //   192	14	2	localIOException	java.io.IOException
    //   221	14	2	localIllegalArgumentException1	IllegalArgumentException
    //   250	14	2	localIllegalStateException1	IllegalStateException
    //   279	14	2	localIllegalArgumentException2	IllegalArgumentException
    //   308	14	2	localIllegalStateException2	IllegalStateException
    // Exception table:
    //   from	to	target	type
    //   4	21	74	finally
    //   21	29	74	finally
    //   35	50	74	finally
    //   56	71	74	finally
    //   79	87	74	finally
    //   87	103	74	finally
    //   103	108	74	finally
    //   112	127	74	finally
    //   127	132	74	finally
    //   136	151	74	finally
    //   151	189	74	finally
    //   193	215	74	finally
    //   222	244	74	finally
    //   251	273	74	finally
    //   280	302	74	finally
    //   309	331	74	finally
    //   87	103	192	java/io/IOException
    //   112	127	221	java/lang/IllegalArgumentException
    //   112	127	250	java/lang/IllegalStateException
    //   136	151	279	java/lang/IllegalArgumentException
    //   136	151	308	java/lang/IllegalStateException
  }
  
  public int stop()
  {
    int j = 0;
    int i = j;
    try
    {
      if (this.mMediaMuxer != null) {
        TXCLog.d("TXCMP4Muxer", "stop. start flag = " + this.mStartFlag + ", video key frame set = " + this.mHasVideoKeyFrame);
      }
      try
      {
        if ((this.mStartFlag) && (this.mHasVideoKeyFrame)) {
          this.mMediaMuxer.stop();
        }
        this.mMediaMuxer.release();
        this.mStartFlag = false;
        this.mMediaMuxer = null;
        this.mHasVideoKeyFrame = false;
        this.mVideoCache.clear();
        this.mAudioCache.clear();
        this.mVideoFormat = null;
        this.mAudioFormat = null;
        this.mLastFramePtsUs = -1L;
        this.mLastSamplePtsUs = -1L;
        i = j;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          TXCLog.e("TXCMP4Muxer", "muxer stop/release exception: " + localException);
          this.mStartFlag = false;
          this.mMediaMuxer = null;
          this.mHasVideoKeyFrame = false;
          this.mVideoCache.clear();
          this.mAudioCache.clear();
          this.mVideoFormat = null;
          this.mAudioFormat = null;
          this.mLastFramePtsUs = -1L;
          this.mLastSamplePtsUs = -1L;
          i = -1;
        }
      }
      finally
      {
        this.mStartFlag = false;
        this.mMediaMuxer = null;
        this.mHasVideoKeyFrame = false;
        this.mVideoCache.clear();
        this.mAudioCache.clear();
        this.mVideoFormat = null;
        this.mAudioFormat = null;
        this.mLastFramePtsUs = -1L;
        this.mLastSamplePtsUs = -1L;
      }
      return i;
    }
    finally {}
  }
  
  /* Error */
  public void writeAudioData(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 199	com/tencent/liteav/muxer/TXCMP4Muxer:mMediaMuxer	Landroid/media/MediaMuxer;
    //   6: ifnull +12 -> 18
    //   9: aload_0
    //   10: getfield 70	com/tencent/liteav/muxer/TXCMP4Muxer:mFirstFrameOffsetUs	J
    //   13: lconst_0
    //   14: lcmp
    //   15: ifge +38 -> 53
    //   18: ldc 17
    //   20: new 170	java/lang/StringBuilder
    //   23: dup
    //   24: ldc_w 304
    //   27: invokespecial 175	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   30: aload_2
    //   31: getfield 114	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   34: invokevirtual 179	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   37: invokevirtual 188	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   40: invokestatic 191	com/tencent/liteav/basic/log/TXCLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   43: aload_0
    //   44: iconst_0
    //   45: aload_1
    //   46: aload_2
    //   47: invokespecial 306	com/tencent/liteav/muxer/TXCMP4Muxer:cache	(ZLjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V
    //   50: aload_0
    //   51: monitorexit
    //   52: return
    //   53: aload_0
    //   54: aload_1
    //   55: aload_2
    //   56: invokespecial 164	com/tencent/liteav/muxer/TXCMP4Muxer:writeAudioImpl	(Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V
    //   59: goto -9 -> 50
    //   62: astore_1
    //   63: aload_0
    //   64: monitorexit
    //   65: aload_1
    //   66: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	67	0	this	TXCMP4Muxer
    //   0	67	1	paramByteBuffer	ByteBuffer
    //   0	67	2	paramBufferInfo	MediaCodec.BufferInfo
    // Exception table:
    //   from	to	target	type
    //   2	18	62	finally
    //   18	50	62	finally
    //   53	59	62	finally
  }
  
  public void writeAudioData(byte[] paramArrayOfByte, int paramInt1, int paramInt2, long paramLong, int paramInt3)
  {
    try
    {
      ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(paramInt2);
      localByteBuffer.put(paramArrayOfByte, paramInt1, paramInt2);
      paramArrayOfByte = new MediaCodec.BufferInfo();
      paramArrayOfByte.presentationTimeUs = paramLong;
      paramArrayOfByte.offset = 0;
      paramArrayOfByte.size = paramInt2;
      paramArrayOfByte.flags = paramInt3;
      writeAudioData(localByteBuffer, paramArrayOfByte);
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
      throw paramArrayOfByte;
    }
  }
  
  public void writeVideoData(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    for (;;)
    {
      try
      {
        if (this.mMediaMuxer == null)
        {
          cache(true, paramByteBuffer, paramBufferInfo);
          TXCLog.w("TXCMP4Muxer", "cache frame before muexer ready. ptsUs: " + paramBufferInfo.presentationTimeUs);
          return;
        }
        if (this.mFirstFrameOffsetUs < 0L)
        {
          cache(true, paramByteBuffer, paramBufferInfo);
          this.mFirstFrameOffsetUs = caculateFirstFrameOffsetTime();
          TXCLog.d("TXCMP4Muxer", "first frame offset = " + this.mFirstFrameOffsetUs);
          flushCache();
        }
        else
        {
          writeVideoImpl(paramByteBuffer, paramBufferInfo);
        }
      }
      finally {}
    }
  }
  
  public void writeVideoData(byte[] paramArrayOfByte, int paramInt1, int paramInt2, long paramLong, int paramInt3)
  {
    try
    {
      ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(paramInt2);
      localByteBuffer.put(paramArrayOfByte, paramInt1, paramInt2);
      paramArrayOfByte = new MediaCodec.BufferInfo();
      paramArrayOfByte.presentationTimeUs = paramLong;
      paramArrayOfByte.offset = 0;
      paramArrayOfByte.size = paramInt2;
      paramArrayOfByte.flags = paramInt3;
      writeVideoData(localByteBuffer, paramArrayOfByte);
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
      throw paramArrayOfByte;
    }
  }
  
  private static class Frame
  {
    ByteBuffer mBuffer;
    MediaCodec.BufferInfo mInfo;
    
    public Frame(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
    {
      this.mBuffer = paramByteBuffer;
      this.mInfo = paramBufferInfo;
    }
    
    public MediaCodec.BufferInfo getBufferInfo()
    {
      return this.mInfo;
    }
    
    public ByteBuffer getByteBuffer()
    {
      return this.mBuffer;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\muxer\TXCMP4Muxer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */