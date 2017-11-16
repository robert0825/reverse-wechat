package com.tencent.liteav.record;

import android.content.Context;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.liteav.audio.TXCAudioRecorder;
import com.tencent.liteav.audio.TXIAudioRecordListener;
import com.tencent.liteav.audio.impl.Encoder.TXCAudioHWEncoder;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.muxer.TXCMP4Muxer;
import com.tencent.liteav.videoencoder.TXCHWVideoEncoder;
import com.tencent.liteav.videoencoder.TXIVideoEncoderListener;
import com.tencent.liteav.videoencoder.TXSVideoEncoderParam;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.microedition.khronos.egl.EGLContext;

public class TXCStreamRecord
  implements TXIAudioRecordListener, TXIVideoEncoderListener
{
  private static final int RECORD_WHAT_COMPLETE = 2;
  private static final int RECORD_WHAT_PROGRESS = 1;
  private static final String TAG = "TXCStreamRecord";
  private TXCAudioHWEncoder mAudioEncoder = new TXCAudioHWEncoder();
  private boolean mAudioInit = false;
  private Handler mCallbackHandler = new Handler(Looper.getMainLooper())
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      if (TXCStreamRecord.this.mStreamRecordListener != null) {}
      switch (paramAnonymousMessage.what)
      {
      default: 
        return;
      case 1: 
        TXCStreamRecord.this.mStreamRecordListener.onRecordProgress(((Long)paramAnonymousMessage.obj).longValue());
        return;
      }
      TXCLog.d("TXCStreamRecord", "record complete. errcode = " + paramAnonymousMessage.arg1 + ", errmsg = " + (String)paramAnonymousMessage.obj + ", outputPath = " + TXCStreamRecord.this.mParams.mOutputFilePath + ", coverImage = " + TXCStreamRecord.this.mParams.mCoverImagePath);
      if ((paramAnonymousMessage.arg1 == 0) && (TXCStreamRecord.this.mParams.mCoverImagePath != null) && (!TXCStreamRecord.this.mParams.mCoverImagePath.isEmpty()) && (!TXCStreamRecord.saveVideoThumb(TXCStreamRecord.this.mParams.mOutputFilePath, TXCStreamRecord.this.mParams.mCoverImagePath))) {
        TXCLog.e("TXCStreamRecord", "saveVideoThumb error. sourcePath = " + TXCStreamRecord.this.mParams.mOutputFilePath + ", coverImagePath = " + TXCStreamRecord.this.mParams.mCoverImagePath);
      }
      if (paramAnonymousMessage.arg1 != 0)
      {
        File localFile = new File(TXCStreamRecord.this.mParams.mOutputFilePath);
        if (localFile.exists()) {
          localFile.delete();
        }
      }
      TXCStreamRecord.this.mStreamRecordListener.onRecordComplete(paramAnonymousMessage.arg1, (String)paramAnonymousMessage.obj, TXCStreamRecord.this.mParams.mOutputFilePath, TXCStreamRecord.this.mParams.mCoverImagePath);
    }
  };
  private long mFirstFrameTimeMs = -1L;
  private TXCMP4Muxer mMuxer = new TXCMP4Muxer();
  public TXCStreamRecordParams mParams;
  private long mRecordTimeMs = 0L;
  public TXIStreamRecordListener mStreamRecordListener;
  private TXCHWVideoEncoder mVideoEncoder = new TXCHWVideoEncoder();
  
  private String callbackVideoEncodeError(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default: 
      str = "";
    }
    for (;;)
    {
      this.mCallbackHandler.sendMessage(Message.obtain(this.mCallbackHandler, 2, 1, 0, str));
      return str;
      str = "视频编码失败";
      continue;
      str = "视频编码初始化失败";
      continue;
      str = "非法视频输入参数";
      continue;
      str = "未启动视频编码器";
    }
  }
  
  private MediaFormat genAudioFormat(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = getSampleRateIndex(paramInt1);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(2);
    localByteBuffer.put(0, (byte)(paramInt3 << 3 | i >> 1));
    localByteBuffer.put(1, (byte)((i & 0x1) << 7 | paramInt2 << 3));
    MediaFormat localMediaFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", paramInt1, paramInt2);
    localMediaFormat.setInteger("channel-count", paramInt2);
    localMediaFormat.setInteger("sample-rate", paramInt1);
    localMediaFormat.setByteBuffer("csd-0", localByteBuffer);
    return localMediaFormat;
  }
  
  public static String genFilePath(Context paramContext, String paramString)
  {
    if (paramContext == null) {
      return null;
    }
    try
    {
      long l = System.currentTimeMillis() / 1000L;
      String str = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date(Long.valueOf(String.valueOf(l) + "000").longValue()));
      paramContext = new File(getDiskFileDir(paramContext), String.format("TXUGC_%s" + paramString, new Object[] { str })).getAbsolutePath();
      return paramContext;
    }
    catch (Exception paramContext) {}
    return null;
  }
  
  private static String getDiskFileDir(Context paramContext)
  {
    if (("mounted".equals(Environment.getExternalStorageState())) || (!Environment.isExternalStorageRemovable())) {
      return paramContext.getExternalFilesDir(Environment.DIRECTORY_MOVIES).getPath();
    }
    return paramContext.getFilesDir().getPath();
  }
  
  private int getSampleRateIndex(int paramInt)
  {
    int i = 0;
    while (i < 13)
    {
      if (new int[] { 96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350 }[i] == paramInt) {
        return i;
      }
      i += 1;
    }
    return -1;
  }
  
  /* Error */
  public static boolean saveVideoThumb(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore_3
    //   5: aload_0
    //   6: ifnull +7 -> 13
    //   9: aload_1
    //   10: ifnonnull +13 -> 23
    //   13: ldc 25
    //   15: ldc_w 258
    //   18: invokestatic 263	com/tencent/liteav/basic/log/TXCLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: iconst_0
    //   22: ireturn
    //   23: new 200	java/io/File
    //   26: dup
    //   27: aload_0
    //   28: invokespecial 264	java/io/File:<init>	(Ljava/lang/String;)V
    //   31: invokevirtual 267	java/io/File:exists	()Z
    //   34: ifne +36 -> 70
    //   37: ldc 25
    //   39: ldc_w 269
    //   42: invokestatic 263	com/tencent/liteav/basic/log/TXCLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   45: iconst_0
    //   46: ireturn
    //   47: astore_0
    //   48: aconst_null
    //   49: astore_1
    //   50: aload_3
    //   51: astore_0
    //   52: aload_1
    //   53: ifnull +7 -> 60
    //   56: aload_1
    //   57: invokevirtual 274	java/io/FileOutputStream:close	()V
    //   60: aload_0
    //   61: ifnull +152 -> 213
    //   64: aload_0
    //   65: invokevirtual 279	android/media/MediaMetadataRetriever:release	()V
    //   68: iconst_0
    //   69: ireturn
    //   70: new 276	android/media/MediaMetadataRetriever
    //   73: dup
    //   74: invokespecial 280	android/media/MediaMetadataRetriever:<init>	()V
    //   77: astore_2
    //   78: aload_2
    //   79: aload_0
    //   80: invokevirtual 283	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   83: aload_2
    //   84: invokevirtual 287	android/media/MediaMetadataRetriever:getFrameAtTime	()Landroid/graphics/Bitmap;
    //   87: astore_0
    //   88: new 200	java/io/File
    //   91: dup
    //   92: aload_1
    //   93: invokespecial 264	java/io/File:<init>	(Ljava/lang/String;)V
    //   96: astore_1
    //   97: aload_1
    //   98: invokevirtual 267	java/io/File:exists	()Z
    //   101: ifeq +8 -> 109
    //   104: aload_1
    //   105: invokevirtual 290	java/io/File:delete	()Z
    //   108: pop
    //   109: new 271	java/io/FileOutputStream
    //   112: dup
    //   113: aload_1
    //   114: invokespecial 293	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   117: astore_3
    //   118: aload_0
    //   119: getstatic 299	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   122: bipush 100
    //   124: aload_3
    //   125: invokevirtual 305	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   128: pop
    //   129: aload_3
    //   130: invokevirtual 308	java/io/FileOutputStream:flush	()V
    //   133: aload_3
    //   134: invokevirtual 274	java/io/FileOutputStream:close	()V
    //   137: aload_2
    //   138: invokevirtual 279	android/media/MediaMetadataRetriever:release	()V
    //   141: iconst_1
    //   142: ireturn
    //   143: astore_0
    //   144: aconst_null
    //   145: astore_2
    //   146: aload 4
    //   148: astore_1
    //   149: aload_2
    //   150: ifnull +7 -> 157
    //   153: aload_2
    //   154: invokevirtual 274	java/io/FileOutputStream:close	()V
    //   157: aload_1
    //   158: ifnull +7 -> 165
    //   161: aload_1
    //   162: invokevirtual 279	android/media/MediaMetadataRetriever:release	()V
    //   165: aload_0
    //   166: athrow
    //   167: astore_0
    //   168: goto -31 -> 137
    //   171: astore_1
    //   172: goto -112 -> 60
    //   175: astore_2
    //   176: goto -19 -> 157
    //   179: astore_0
    //   180: aconst_null
    //   181: astore_3
    //   182: aload_2
    //   183: astore_1
    //   184: aload_3
    //   185: astore_2
    //   186: goto -37 -> 149
    //   189: astore_0
    //   190: aload_2
    //   191: astore_1
    //   192: aload_3
    //   193: astore_2
    //   194: goto -45 -> 149
    //   197: astore_0
    //   198: aconst_null
    //   199: astore_1
    //   200: aload_2
    //   201: astore_0
    //   202: goto -150 -> 52
    //   205: astore_0
    //   206: aload_2
    //   207: astore_0
    //   208: aload_3
    //   209: astore_1
    //   210: goto -158 -> 52
    //   213: iconst_0
    //   214: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	215	0	paramString1	String
    //   0	215	1	paramString2	String
    //   77	77	2	localMediaMetadataRetriever	android.media.MediaMetadataRetriever
    //   175	8	2	localIOException	java.io.IOException
    //   185	22	2	localFileOutputStream1	java.io.FileOutputStream
    //   4	205	3	localFileOutputStream2	java.io.FileOutputStream
    //   1	146	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   13	21	47	java/lang/Exception
    //   23	45	47	java/lang/Exception
    //   70	78	47	java/lang/Exception
    //   13	21	143	finally
    //   23	45	143	finally
    //   70	78	143	finally
    //   133	137	167	java/io/IOException
    //   56	60	171	java/io/IOException
    //   153	157	175	java/io/IOException
    //   78	109	179	finally
    //   109	118	179	finally
    //   118	133	189	finally
    //   78	109	197	java/lang/Exception
    //   109	118	197	java/lang/Exception
    //   118	133	205	java/lang/Exception
  }
  
  public void drainAudio(byte[] paramArrayOfByte, long paramLong)
  {
    if (this.mAudioInit)
    {
      this.mAudioEncoder.doEncodec(paramArrayOfByte, paramLong);
      return;
    }
    TXCLog.e("TXCStreamRecord", "drainAudio fail because of not init yet!");
  }
  
  public void drainVideo(int paramInt, long paramLong)
  {
    this.mVideoEncoder.pushVideoFrame(paramInt, this.mParams.mWidth, this.mParams.mHeight, paramLong);
  }
  
  public void onEncodeFormat(MediaFormat paramMediaFormat)
  {
    this.mMuxer.addVideoTrack(paramMediaFormat);
    if ((this.mMuxer.hasAddVideoTrack()) && (this.mMuxer.start() < 0)) {
      this.mCallbackHandler.sendMessage(Message.obtain(this.mCallbackHandler, 2, 1, 0, "mp4封装器启动失败"));
    }
  }
  
  public void onEncodeNAL(TXSNALPacket paramTXSNALPacket, int paramInt)
  {
    if (paramInt == 0)
    {
      this.mMuxer.writeVideoData(paramTXSNALPacket.nalData, 0, paramTXSNALPacket.nalData.length, paramTXSNALPacket.pts * 1000L, paramTXSNALPacket.info.flags);
      if (this.mFirstFrameTimeMs < 0L) {
        this.mFirstFrameTimeMs = paramTXSNALPacket.pts;
      }
      if (paramTXSNALPacket.pts > this.mRecordTimeMs + 500L)
      {
        this.mCallbackHandler.sendMessage(Message.obtain(this.mCallbackHandler, 1, new Long(paramTXSNALPacket.pts - this.mFirstFrameTimeMs)));
        this.mRecordTimeMs = paramTXSNALPacket.pts;
      }
      return;
    }
    paramTXSNALPacket = callbackVideoEncodeError(paramInt);
    TXCLog.e("TXCStreamRecord", "video encode error! errmsg: " + paramTXSNALPacket);
  }
  
  public void onRecordEncData(byte[] paramArrayOfByte, long paramLong)
  {
    this.mMuxer.writeAudioData(paramArrayOfByte, 0, paramArrayOfByte.length, 1000L * paramLong, 1);
  }
  
  public void onRecordError(int paramInt, String paramString) {}
  
  public void onRecordPcmData(byte[] paramArrayOfByte, long paramLong) {}
  
  public void onRecordSpeedPcmData(byte[] paramArrayOfByte, long paramLong) {}
  
  public void setStreamRecordListener(TXIStreamRecordListener paramTXIStreamRecordListener)
  {
    this.mStreamRecordListener = paramTXIStreamRecordListener;
  }
  
  public void start(TXCStreamRecordParams paramTXCStreamRecordParams)
  {
    this.mParams = paramTXCStreamRecordParams;
    this.mRecordTimeMs = 0L;
    this.mFirstFrameTimeMs = -1L;
    this.mVideoEncoder.setListener(this);
    TXSVideoEncoderParam localTXSVideoEncoderParam = new TXSVideoEncoderParam();
    localTXSVideoEncoderParam.width = this.mParams.mWidth;
    localTXSVideoEncoderParam.height = this.mParams.mHeight;
    localTXSVideoEncoderParam.fps = this.mParams.mFPS;
    localTXSVideoEncoderParam.glContext = this.mParams.mEglContext;
    localTXSVideoEncoderParam.annexb = true;
    localTXSVideoEncoderParam.appendSpsPps = false;
    this.mVideoEncoder.setBitrate(this.mParams.mBitRateKb);
    this.mVideoEncoder.start(localTXSVideoEncoderParam);
    this.mMuxer.setTargetPath(this.mParams.mOutputFilePath);
    if ((paramTXCStreamRecordParams.mChannels > 0) && (paramTXCStreamRecordParams.mSampleRate > 0) && (paramTXCStreamRecordParams.mBits > 0))
    {
      this.mAudioEncoder.init(TXCAudioRecorder.DEFAULT_ENC_TYPE, paramTXCStreamRecordParams.mSampleRate, paramTXCStreamRecordParams.mChannels, paramTXCStreamRecordParams.mBits, new WeakReference(this));
      paramTXCStreamRecordParams = genAudioFormat(this.mParams.mSampleRate, this.mParams.mChannels, 2);
      this.mMuxer.addAudioTrack(paramTXCStreamRecordParams);
      this.mAudioInit = true;
    }
  }
  
  public void stop()
  {
    this.mAudioInit = false;
    this.mAudioEncoder.unInit();
    this.mVideoEncoder.stop();
    if (this.mMuxer.stop() < 0)
    {
      this.mCallbackHandler.sendMessage(Message.obtain(this.mCallbackHandler, 2, 1, 0, "mp4合成失败"));
      return;
    }
    this.mCallbackHandler.sendMessage(Message.obtain(this.mCallbackHandler, 2, 0, 0, ""));
  }
  
  public static class TXCStreamRecordParams
  {
    public int mBitRateKb = 1000;
    public int mBits = 16;
    public int mChannels = 0;
    public String mCoverImagePath;
    public EGLContext mEglContext;
    public int mFPS = 20;
    public int mHeight = 960;
    public String mOutputFilePath;
    public int mSampleRate = 0;
    public int mWidth = 544;
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("TXCStreamRecordParams: [width=" + this.mWidth);
      localStringBuilder.append("; height=" + this.mHeight);
      localStringBuilder.append("; fps=" + this.mFPS);
      localStringBuilder.append("; bitrate=" + this.mBitRateKb);
      localStringBuilder.append("; channels=" + this.mChannels);
      localStringBuilder.append("; samplerate=" + this.mSampleRate);
      localStringBuilder.append("; bits=" + this.mBits);
      localStringBuilder.append("; EGLContext=" + this.mEglContext);
      localStringBuilder.append("; coveriamge=" + this.mCoverImagePath);
      localStringBuilder.append("; outputpath=" + this.mOutputFilePath + "]");
      return localStringBuilder.toString();
    }
  }
  
  public static abstract interface TXIStreamRecordListener
  {
    public static final int RECORD_ERR = 1;
    public static final int RECORD_SUCC = 0;
    
    public abstract void onRecordComplete(int paramInt, String paramString1, String paramString2, String paramString3);
    
    public abstract void onRecordProgress(long paramLong);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\record\TXCStreamRecord.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */