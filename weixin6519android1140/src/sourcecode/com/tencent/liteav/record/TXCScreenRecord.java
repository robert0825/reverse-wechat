package com.tencent.liteav.record;

import android.content.Context;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.liteav.audio.TXCAudioRecorder;
import com.tencent.liteav.audio.TXIAudioRecordListener;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.muxer.TXCMP4Muxer;
import com.tencent.liteav.screencapture.TXCScreenCapture;
import com.tencent.liteav.screencapture.TXIScreenCaptureListener;
import com.tencent.liteav.videoencoder.TXCVideoEncoder;
import com.tencent.liteav.videoencoder.TXIVideoEncoderListener;
import com.tencent.liteav.videoencoder.TXSVideoEncoderParam;
import java.io.File;
import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGLContext;

public class TXCScreenRecord
  implements TXIAudioRecordListener, TXIScreenCaptureListener, TXIVideoEncoderListener
{
  private static final int RECORD_WHAT_COMPLETE = 2;
  private static final int RECORD_WHAT_PROGRESS = 1;
  private static final String TAG = "TXCScreenRecord";
  int mBits = TXCAudioRecorder.DEFAULT_BITS_PER_CHANNEL;
  private Handler mCallbackHandler = new Handler(Looper.getMainLooper())
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      if (TXCScreenRecord.this.mScreenRecordListener != null) {}
      switch (paramAnonymousMessage.what)
      {
      default: 
        return;
      case 1: 
        TXCScreenRecord.this.mScreenRecordListener.onRecordProgress(((Long)paramAnonymousMessage.obj).longValue());
        return;
      }
      TXCLog.d("TXCScreenRecord", "record complete. errcode = " + paramAnonymousMessage.arg1 + ", errmsg = " + (String)paramAnonymousMessage.obj + ", outputPath = " + TXCScreenRecord.this.mParams.mOutputFilePath + ", coverImage = " + TXCScreenRecord.this.mParams.mCoverImagePath);
      if ((paramAnonymousMessage.arg1 == 0) && (TXCScreenRecord.this.mParams.mCoverImagePath != null) && (!TXCScreenRecord.this.mParams.mCoverImagePath.isEmpty()) && (!TXCScreenRecord.saveVideoThumb(TXCScreenRecord.this.mParams.mOutputFilePath, TXCScreenRecord.this.mParams.mCoverImagePath))) {
        TXCLog.e("TXCScreenRecord", "saveVideoThumb error. sourcePath = " + TXCScreenRecord.this.mParams.mOutputFilePath + ", coverImagePath = " + TXCScreenRecord.this.mParams.mCoverImagePath);
      }
      if (paramAnonymousMessage.arg1 != 0)
      {
        File localFile = new File(TXCScreenRecord.this.mParams.mOutputFilePath);
        if (localFile.exists()) {
          localFile.delete();
        }
      }
      TXCScreenRecord.this.mScreenRecordListener.onRecordComplete(paramAnonymousMessage.arg1, (String)paramAnonymousMessage.obj, TXCScreenRecord.this.mParams.mOutputFilePath, TXCScreenRecord.this.mParams.mCoverImagePath);
    }
  };
  int mChannels = TXCAudioRecorder.DEFAULT_CHANNELS_PER_SAMPLE;
  private Context mContext;
  private long mFirstFrameTimeMs = -1L;
  private TXCMP4Muxer mMuxer;
  public TXCScreenRecordParams mParams;
  private long mRecordTimeMs = 0L;
  int mSampleRate = TXCAudioRecorder.DEFAULT_SAMPLE_RATE;
  private TXCScreenCapture mScreenCapture;
  public TXIScreenRecordListener mScreenRecordListener;
  private boolean mStartRecordAudio = false;
  private TXCVideoEncoder mVideoEncoder;
  
  public TXCScreenRecord(Context paramContext)
  {
    this.mContext = paramContext;
    this.mScreenCapture = new TXCScreenCapture(paramContext);
    this.mVideoEncoder = new TXCVideoEncoder(1);
    this.mMuxer = new TXCMP4Muxer();
  }
  
  private String callbackScreenCaptureError(int paramInt)
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
      str = "初始化OpenGL环境失败";
      continue;
      str = "Android系统版本过低";
      continue;
      str = "获取录屏权限失败";
    }
  }
  
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
  
  private MediaFormat genAudioFormat()
  {
    int i = getSampleRateIndex(this.mSampleRate);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(2);
    localByteBuffer.put(0, (byte)(i >> 1 | 0x10));
    localByteBuffer.put(1, (byte)((i & 0x1) << 7 | this.mChannels << 3));
    MediaFormat localMediaFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", this.mSampleRate, this.mChannels);
    localMediaFormat.setInteger("channel-count", this.mChannels);
    localMediaFormat.setInteger("sample-rate", this.mSampleRate);
    localMediaFormat.setByteBuffer("csd-0", localByteBuffer);
    return localMediaFormat;
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
    //   10: ifnonnull +12 -> 22
    //   13: ldc 27
    //   15: ldc -68
    //   17: invokestatic 194	com/tencent/liteav/basic/log/TXCLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   20: iconst_0
    //   21: ireturn
    //   22: new 196	java/io/File
    //   25: dup
    //   26: aload_0
    //   27: invokespecial 199	java/io/File:<init>	(Ljava/lang/String;)V
    //   30: invokevirtual 203	java/io/File:exists	()Z
    //   33: ifne +35 -> 68
    //   36: ldc 27
    //   38: ldc -51
    //   40: invokestatic 194	com/tencent/liteav/basic/log/TXCLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   43: iconst_0
    //   44: ireturn
    //   45: astore_0
    //   46: aconst_null
    //   47: astore_1
    //   48: aload_3
    //   49: astore_0
    //   50: aload_1
    //   51: ifnull +7 -> 58
    //   54: aload_1
    //   55: invokevirtual 210	java/io/FileOutputStream:close	()V
    //   58: aload_0
    //   59: ifnull +152 -> 211
    //   62: aload_0
    //   63: invokevirtual 215	android/media/MediaMetadataRetriever:release	()V
    //   66: iconst_0
    //   67: ireturn
    //   68: new 212	android/media/MediaMetadataRetriever
    //   71: dup
    //   72: invokespecial 216	android/media/MediaMetadataRetriever:<init>	()V
    //   75: astore_2
    //   76: aload_2
    //   77: aload_0
    //   78: invokevirtual 219	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   81: aload_2
    //   82: invokevirtual 223	android/media/MediaMetadataRetriever:getFrameAtTime	()Landroid/graphics/Bitmap;
    //   85: astore_0
    //   86: new 196	java/io/File
    //   89: dup
    //   90: aload_1
    //   91: invokespecial 199	java/io/File:<init>	(Ljava/lang/String;)V
    //   94: astore_1
    //   95: aload_1
    //   96: invokevirtual 203	java/io/File:exists	()Z
    //   99: ifeq +8 -> 107
    //   102: aload_1
    //   103: invokevirtual 226	java/io/File:delete	()Z
    //   106: pop
    //   107: new 207	java/io/FileOutputStream
    //   110: dup
    //   111: aload_1
    //   112: invokespecial 229	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   115: astore_3
    //   116: aload_0
    //   117: getstatic 235	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   120: bipush 100
    //   122: aload_3
    //   123: invokevirtual 241	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   126: pop
    //   127: aload_3
    //   128: invokevirtual 244	java/io/FileOutputStream:flush	()V
    //   131: aload_3
    //   132: invokevirtual 210	java/io/FileOutputStream:close	()V
    //   135: aload_2
    //   136: invokevirtual 215	android/media/MediaMetadataRetriever:release	()V
    //   139: iconst_1
    //   140: ireturn
    //   141: astore_0
    //   142: aconst_null
    //   143: astore_2
    //   144: aload 4
    //   146: astore_1
    //   147: aload_2
    //   148: ifnull +7 -> 155
    //   151: aload_2
    //   152: invokevirtual 210	java/io/FileOutputStream:close	()V
    //   155: aload_1
    //   156: ifnull +7 -> 163
    //   159: aload_1
    //   160: invokevirtual 215	android/media/MediaMetadataRetriever:release	()V
    //   163: aload_0
    //   164: athrow
    //   165: astore_0
    //   166: goto -31 -> 135
    //   169: astore_1
    //   170: goto -112 -> 58
    //   173: astore_2
    //   174: goto -19 -> 155
    //   177: astore_0
    //   178: aconst_null
    //   179: astore_3
    //   180: aload_2
    //   181: astore_1
    //   182: aload_3
    //   183: astore_2
    //   184: goto -37 -> 147
    //   187: astore_0
    //   188: aload_2
    //   189: astore_1
    //   190: aload_3
    //   191: astore_2
    //   192: goto -45 -> 147
    //   195: astore_0
    //   196: aconst_null
    //   197: astore_1
    //   198: aload_2
    //   199: astore_0
    //   200: goto -150 -> 50
    //   203: astore_0
    //   204: aload_2
    //   205: astore_0
    //   206: aload_3
    //   207: astore_1
    //   208: goto -158 -> 50
    //   211: iconst_0
    //   212: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	213	0	paramString1	String
    //   0	213	1	paramString2	String
    //   75	77	2	localMediaMetadataRetriever	android.media.MediaMetadataRetriever
    //   173	8	2	localIOException	java.io.IOException
    //   183	22	2	localFileOutputStream1	java.io.FileOutputStream
    //   4	203	3	localFileOutputStream2	java.io.FileOutputStream
    //   1	144	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   13	20	45	java/lang/Exception
    //   22	43	45	java/lang/Exception
    //   68	76	45	java/lang/Exception
    //   13	20	141	finally
    //   22	43	141	finally
    //   68	76	141	finally
    //   131	135	165	java/io/IOException
    //   54	58	169	java/io/IOException
    //   151	155	173	java/io/IOException
    //   76	107	177	finally
    //   107	116	177	finally
    //   116	131	187	finally
    //   76	107	195	java/lang/Exception
    //   107	116	195	java/lang/Exception
    //   116	131	203	java/lang/Exception
  }
  
  protected int getSampleRateIndex(int paramInt)
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
      if (!this.mStartRecordAudio) {
        this.mStartRecordAudio = true;
      }
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
    TXCLog.e("TXCScreenRecord", "video encode error! errmsg: " + paramTXSNALPacket);
  }
  
  public void onRecordEncData(byte[] paramArrayOfByte, long paramLong)
  {
    if (this.mStartRecordAudio) {
      this.mMuxer.writeAudioData(paramArrayOfByte, 0, paramArrayOfByte.length, 1000L * paramLong, 1);
    }
  }
  
  public void onRecordError(int paramInt, String paramString) {}
  
  public void onRecordPcmData(byte[] paramArrayOfByte, long paramLong) {}
  
  public void onRecordSpeedPcmData(byte[] paramArrayOfByte, long paramLong) {}
  
  public void onScreenCaptureDestory(Object paramObject)
  {
    if ((paramObject instanceof TXCVideoEncoder)) {
      ((TXCVideoEncoder)paramObject).stop();
    }
  }
  
  public void onScreenCaptureFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong)
  {
    if (paramInt1 == 0)
    {
      this.mVideoEncoder.pushVideoFrame(paramInt2, paramInt3, paramInt4, paramLong);
      return;
    }
    String str = callbackScreenCaptureError(paramInt1);
    TXCLog.e("TXCScreenRecord", "screen capture frame fail! errmsg: " + str);
  }
  
  public void onStartResult(int paramInt, EGLContext paramEGLContext)
  {
    if (paramInt == 0)
    {
      TXSVideoEncoderParam localTXSVideoEncoderParam = new TXSVideoEncoderParam();
      localTXSVideoEncoderParam.width = this.mParams.mWidth;
      localTXSVideoEncoderParam.height = this.mParams.mHeight;
      localTXSVideoEncoderParam.fps = this.mParams.mFPS;
      localTXSVideoEncoderParam.glContext = paramEGLContext;
      this.mVideoEncoder.setBitrate(this.mParams.mBitRateKb);
      this.mVideoEncoder.start(localTXSVideoEncoderParam);
      return;
    }
    paramEGLContext = callbackScreenCaptureError(paramInt);
    TXCLog.e("TXCScreenRecord", "screen capture start fail! errmsg: " + paramEGLContext);
  }
  
  public void setScreenRecordListener(TXIScreenRecordListener paramTXIScreenRecordListener)
  {
    this.mScreenRecordListener = paramTXIScreenRecordListener;
  }
  
  public void start(TXCScreenRecordParams paramTXCScreenRecordParams)
  {
    this.mParams = paramTXCScreenRecordParams;
    this.mRecordTimeMs = 0L;
    this.mFirstFrameTimeMs = -1L;
    this.mStartRecordAudio = false;
    TXCAudioRecorder.getInstance().setListener(this);
    TXCAudioRecorder.getInstance().setIsHWAcceleration(true);
    TXCAudioRecorder.getInstance().startRecord(this.mContext);
    this.mScreenCapture.setListener(this);
    this.mScreenCapture.start(paramTXCScreenRecordParams.mWidth, paramTXCScreenRecordParams.mHeight, paramTXCScreenRecordParams.mFPS);
    this.mVideoEncoder.setListener(this);
    this.mMuxer.setTargetPath(paramTXCScreenRecordParams.mOutputFilePath);
    paramTXCScreenRecordParams = genAudioFormat();
    TXCLog.d("TXCScreenRecord", "audioFormat:" + paramTXCScreenRecordParams);
    if (paramTXCScreenRecordParams != null)
    {
      this.mMuxer.addAudioTrack(paramTXCScreenRecordParams);
      return;
    }
    TXCLog.e("TXCScreenRecord", "can not add audio track!");
  }
  
  public void stop()
  {
    TXCAudioRecorder.getInstance().setListener(null);
    TXCAudioRecorder.getInstance().stopRecord();
    this.mScreenCapture.stop(this.mVideoEncoder);
    this.mVideoEncoder = null;
    if (this.mMuxer.stop() < 0)
    {
      this.mCallbackHandler.sendMessage(Message.obtain(this.mCallbackHandler, 2, 1, 0, "mp4合成失败"));
      return;
    }
    this.mCallbackHandler.sendMessage(Message.obtain(this.mCallbackHandler, 2, 0, 0, ""));
    TXCLog.d("TXCScreenRecord", "screen record succ. output path = " + this.mParams.mOutputFilePath);
  }
  
  public static class TXCScreenRecordParams
  {
    public int mBitRateKb = 1000;
    public String mCoverImagePath;
    public int mFPS = 15;
    public int mHeight = 960;
    public String mOutputFilePath;
    public int mWidth = 544;
  }
  
  public static abstract interface TXIScreenRecordListener
  {
    public static final int RECORD_ERR = 1;
    public static final int RECORD_SUCC = 0;
    
    public abstract void onRecordComplete(int paramInt, String paramString1, String paramString2, String paramString3);
    
    public abstract void onRecordProgress(long paramLong);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\liteav\record\TXCScreenRecord.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */