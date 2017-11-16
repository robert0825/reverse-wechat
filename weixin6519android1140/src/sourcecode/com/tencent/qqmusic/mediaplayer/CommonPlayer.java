package com.tencent.qqmusic.mediaplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener;
import com.tencent.qqmusic.mediaplayer.network.DefaultMediaHTTPService;
import com.tencent.qqmusic.mediaplayer.network.IMediaHTTPService;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.net.URL;

public class CommonPlayer
  extends BaseMediaPlayer
  implements PlayerException
{
  private static final int INIT_STATE_CHECK_TIME = 5000;
  private static final String TAG = "CommonPlayer";
  private PlayerCallback callback = new PlayerCallback()
  {
    public void playThreadStart()
    {
      if (CommonPlayer.this.mRecognitionByExtensions)
      {
        Logger.i("CommonPlayer", "mCheckAudioInitSuccessHandler 开始检查，等待5S");
        CommonPlayer.this.checkPlayerAndRePlay(5000L);
      }
    }
    
    public void playerEnded()
    {
      Logger.i("CommonPlayer", "playerEnded() callback ended");
      CommonPlayer.this.TransferStateTo(7);
      CommonPlayer.this.mCheckAudioInitSuccessHandler.removeCallbacksAndMessages(null);
      if (CommonPlayer.this.mCallback != null) {
        CommonPlayer.this.mCallback.onCompletion(CommonPlayer.this);
      }
    }
    
    public void playerException(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
    {
      Logger.e("CommonPlayer", "playerException() callback exception what = " + paramAnonymousInt1 + ",extra = " + paramAnonymousInt2 + " mAudioPlayer:" + CommonPlayer.this.mAudioPlayer);
      if (CommonPlayer.this.mAudioPlayer != null)
      {
        int i = CommonPlayer.this.mAudioPlayer.getPlayerState();
        Logger.e("CommonPlayer", "handleMessage state = " + i);
        Logger.e("CommonPlayer", "handleMessage isInit = " + CommonPlayer.this.mAudioPlayer.isInit() + ",isStartDecode = " + CommonPlayer.this.mAudioPlayer.hasDecodeData() + ",decodeSuccess = " + CommonPlayer.this.mAudioPlayer.hasDecodeDataSuccess());
      }
      CommonPlayer.this.mCheckAudioInitSuccessHandler.removeMessages(1);
      if ((CommonPlayer.this.mRecognitionByExtensions) && (CommonPlayer.this.mAudioPlayer != null) && (!CommonPlayer.this.mAudioPlayer.hasDecodeDataSuccess()) && (paramAnonymousInt2 != 70) && (paramAnonymousInt2 != 66))
      {
        Logger.i("CommonPlayer", "playerException() path =" + CommonPlayer.this.mAudioPlayer.getPlayingFilePath() + "mCheckAudioInitSuccessHandler throw a exception so check immediately");
        CommonPlayer.this.checkPlayerAndRePlay(0L);
        return;
      }
      CommonPlayer.this.onError(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3);
    }
    
    public void playerPaused()
    {
      Logger.i("CommonPlayer", "playerPaused() callback paused");
    }
    
    public void playerPrepared()
    {
      Logger.i("CommonPlayer", "playerPrepared() callback prepared");
      CommonPlayer.this.TransferStateTo(2);
      CommonPlayer.this.mCheckAudioInitSuccessHandler.sendEmptyMessage(2);
      if (CommonPlayer.this.mCallback != null) {
        CommonPlayer.this.mCallback.onPrepared(CommonPlayer.this);
      }
    }
    
    public void playerSeeked()
    {
      Logger.i("CommonPlayer", "playerSeeked() callback seeked");
      if (CommonPlayer.this.mCallback != null) {
        CommonPlayer.this.mCallback.onSeekComplete(CommonPlayer.this);
      }
    }
    
    public void playerStarted()
    {
      Logger.i("CommonPlayer", "playerStarted() callback started");
      if (CommonPlayer.this.mCallback != null) {
        CommonPlayer.this.mCallback.onStarted(CommonPlayer.this);
      }
    }
    
    public void playerStopped()
    {
      Logger.i("CommonPlayer", "playerStopped() callback stopped");
      CommonPlayer.this.mCheckAudioInitSuccessHandler.removeCallbacksAndMessages(null);
    }
  };
  private final StateRunner<Integer> currentState = new StateRunner(Integer.valueOf(0));
  public CorePlayer mAudioPlayer = null;
  public AudioFormat.AudioType mAudioType = AudioFormat.AudioType.UNSUPPORT;
  public PlayerListenerCallback mCallback;
  public final Handler mCheckAudioInitSuccessHandler = new CheckAudioInitSuccessHandler(this);
  private long mDuration;
  private long mFileLength = 0L;
  public boolean mRecognitionByExtensions = true;
  
  public CommonPlayer(PlayerListenerCallback paramPlayerListenerCallback)
  {
    this.mCallback = paramPlayerListenerCallback;
    reset();
  }
  
  private String auxiliary(String paramString)
  {
    CorePlayer localCorePlayer = this.mAudioPlayer;
    if (localCorePlayer == null) {
      return "null";
    }
    return "[" + localCorePlayer.getPlayingFilePath() + "]" + paramString;
  }
  
  protected void TransferStateTo(int paramInt)
  {
    this.currentState.transfer(Integer.valueOf(paramInt));
    if (this.mCallback != null) {
      this.mCallback.onStateChanged(paramInt);
    }
    Logger.d("CommonPlayer", "TransferStateTo() CURSTATE:" + paramInt);
  }
  
  public void addAudioListener(IAudioListener paramIAudioListener)
  {
    if (this.mAudioPlayer != null) {
      this.mAudioPlayer.addAudioListener(paramIAudioListener);
    }
  }
  
  public void checkPlayerAndRePlay(long paramLong)
  {
    this.mCheckAudioInitSuccessHandler.removeMessages(1);
    int i = getPlayerState();
    if ((i != 8) && (i != 6) && (i != 7) && (i != 9)) {
      this.mCheckAudioInitSuccessHandler.sendEmptyMessageDelayed(1, paramLong);
    }
  }
  
  public void flush()
  {
    if (this.mAudioPlayer == null)
    {
      Logger.e("CommonPlayer", "[getCurrentFrame] mAudioPlayer is null!");
      return;
    }
    this.mAudioPlayer.flush();
  }
  
  public int getBufferedPercentage()
  {
    int i = 0;
    CorePlayer localCorePlayer = this.mAudioPlayer;
    if (localCorePlayer != null) {
      i = localCorePlayer.getBufferedPercentage();
    }
    return i;
  }
  
  public AudioInformation getCurrentAudioInformation()
  {
    if (this.mAudioPlayer != null) {
      return this.mAudioPlayer.getCurrentAudioInformation();
    }
    return null;
  }
  
  public long getCurrentPosition()
  {
    if (this.mAudioPlayer != null) {
      return this.mAudioPlayer.getCurPosition();
    }
    Logger.e("CommonPlayer", "getCurrentPosition() mAudioPlayer is null!");
    return 0L;
  }
  
  public long getCurrentPositionFromFile()
  {
    return 0L;
  }
  
  public long getDecodePosition()
  {
    if (this.mAudioPlayer != null) {
      return this.mAudioPlayer.getCurPositionByDecoder();
    }
    Logger.e("CommonPlayer", "getDecodePosition() ERROR : mAudioPlayer is null!");
    return 0L;
  }
  
  public int getDuration()
  {
    long l = 0L;
    if (this.mAudioPlayer != null)
    {
      this.mDuration = this.mAudioPlayer.getDuration();
      return (int)this.mDuration;
    }
    Logger.e("CommonPlayer", "getDuration() mAudioPlayer is null!");
    if (this.mDuration > 0L) {
      l = this.mDuration;
    }
    return (int)l;
  }
  
  public String getFilePath()
  {
    if (this.mAudioPlayer == null) {
      return "";
    }
    return this.mAudioPlayer.getPlayingFilePath();
  }
  
  public int getPlayerState()
  {
    return ((Integer)this.currentState.get()).intValue();
  }
  
  public int getSessionId()
  {
    if (this.mAudioPlayer != null) {
      return this.mAudioPlayer.getSessionId();
    }
    return 0;
  }
  
  public boolean isPlaying()
  {
    boolean bool = false;
    if (this.mAudioPlayer != null)
    {
      if (this.mAudioPlayer.getPlayerState() == 4) {
        bool = true;
      }
      return bool;
    }
    Logger.e("CommonPlayer", "isPlaying() mAudioPlayer is null!");
    return false;
  }
  
  public boolean isSoftDecoder()
  {
    return true;
  }
  
  public boolean newCommonPlayer(String paramString, AudioFormat.AudioType paramAudioType)
  {
    if (paramAudioType != null)
    {
      this.mAudioPlayer = new CorePlayer(paramString, paramAudioType, this.callback);
      this.mAudioPlayer.setThreadName(paramString);
      this.mAudioPlayer.setFileLength(this.mFileLength);
      return true;
    }
    return false;
  }
  
  public void onError(int paramInt1, int paramInt2)
  {
    onError(paramInt1, paramInt2, 0);
  }
  
  public void onError(int paramInt1, int paramInt2, int paramInt3)
  {
    TransferStateTo(9);
    if (this.mCallback != null)
    {
      this.mCallback.onError(this, paramInt1, paramInt2, paramInt3);
      return;
    }
    Logger.e("CommonPlayer", "onError() mOnErrorListener is null!");
  }
  
  public void pause()
  {
    TransferStateTo(5);
    Logger.i("CommonPlayer", auxiliary("[pause]"));
    if (this.mAudioPlayer != null) {
      this.mAudioPlayer.pause();
    }
    for (;;)
    {
      notifyPauseSong();
      return;
      Logger.e("CommonPlayer", "pause() mAudioPlayer is null!");
    }
  }
  
  public void prepare()
  {
    TransferStateTo(3);
    Logger.i("CommonPlayer", auxiliary("[prepare]"));
    if (this.mAudioPlayer != null)
    {
      this.mAudioPlayer.prepare();
      return;
    }
    Logger.e("CommonPlayer", "prepare() null mAudioPlayer!");
  }
  
  public void prepareAsync()
  {
    throw new UnSupportMethodException("Soft decode player cannot support prepareAsync");
  }
  
  public void release()
  {
    TransferStateTo(8);
    Logger.i("CommonPlayer", auxiliary("[release]"));
    this.mCheckAudioInitSuccessHandler.removeCallbacksAndMessages(null);
    if (this.mAudioPlayer != null)
    {
      this.mAudioPlayer.release();
      this.mAudioPlayer = null;
    }
    for (;;)
    {
      this.mCallback = null;
      return;
      Logger.w("CommonPlayer", "release() mAudioPlayer is null!");
    }
  }
  
  public void removeAudioListener(IAudioListener paramIAudioListener)
  {
    if (this.mAudioPlayer != null) {
      this.mAudioPlayer.removeAudioListener(paramIAudioListener);
    }
  }
  
  public void reset()
  {
    TransferStateTo(0);
    Logger.i("CommonPlayer", auxiliary("[reset]"));
    this.mCheckAudioInitSuccessHandler.removeCallbacksAndMessages(null);
    if (this.mAudioPlayer != null)
    {
      this.mAudioPlayer.release();
      this.mAudioPlayer = null;
    }
    this.mDuration = 0L;
    this.mAudioType = AudioFormat.AudioType.UNSUPPORT;
    this.mRecognitionByExtensions = true;
    this.mFileLength = 0L;
  }
  
  public void seekTo(int paramInt)
  {
    if (this.mAudioPlayer != null)
    {
      this.mAudioPlayer.seek(paramInt);
      return;
    }
    Logger.e("CommonPlayer", "seekTo() mAudioPlayer is null!");
  }
  
  public void setAudioStreamType(int paramInt)
  {
    if (this.mAudioPlayer != null) {
      this.mAudioPlayer.setAudioStreamType(paramInt);
    }
  }
  
  public void setDataSource(Context paramContext, Uri paramUri)
  {
    TransferStateTo(1);
    if (paramUri == null)
    {
      Logger.e("CommonPlayer", "setDataSource() ERROR:the path is null!");
      throw new IllegalArgumentException("the path is null!");
    }
    Logger.i("CommonPlayer", "setDataSource, uri: " + paramUri);
    try
    {
      this.mAudioPlayer = new CorePlayer(new DefaultMediaHTTPService(), new URL(paramUri.toString()), this.callback);
      this.mAudioPlayer.setThreadName(paramUri.toString());
      this.mRecognitionByExtensions = false;
      return;
    }
    catch (Exception paramContext)
    {
      Logger.e("CommonPlayer", paramContext);
      onError(90, 55);
    }
  }
  
  public void setDataSource(IMediaHTTPService paramIMediaHTTPService, Uri paramUri)
  {
    TransferStateTo(1);
    if (paramIMediaHTTPService == null) {
      throw new IllegalArgumentException("httpService can't be null!");
    }
    Logger.i("CommonPlayer", "[setDataSource] httpService: " + paramIMediaHTTPService);
    try
    {
      this.mAudioPlayer = new CorePlayer(paramIMediaHTTPService, new URL(paramUri.toString()), this.callback);
      this.mAudioPlayer.setThreadName(paramUri.toString());
      this.mRecognitionByExtensions = false;
      return;
    }
    catch (Exception paramIMediaHTTPService)
    {
      Logger.e("CommonPlayer", paramIMediaHTTPService);
      onError(90, 55);
    }
  }
  
  /* Error */
  public void setDataSource(com.tencent.qqmusic.mediaplayer.upstream.IDataSource.Factory paramFactory)
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: invokevirtual 221	com/tencent/qqmusic/mediaplayer/CommonPlayer:TransferStateTo	(I)V
    //   5: aload_1
    //   6: ifnonnull +22 -> 28
    //   9: ldc 18
    //   11: ldc_w 326
    //   14: invokestatic 154	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   17: new 328	java/lang/NullPointerException
    //   20: dup
    //   21: ldc_w 330
    //   24: invokespecial 331	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   27: athrow
    //   28: ldc 18
    //   30: new 87	java/lang/StringBuilder
    //   33: dup
    //   34: ldc_w 333
    //   37: invokespecial 92	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   40: aload_1
    //   41: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   44: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   47: invokestatic 234	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   50: aload_1
    //   51: invokeinterface 339 1 0
    //   56: astore_2
    //   57: aload_2
    //   58: invokeinterface 344 1 0
    //   63: aload_0
    //   64: aload_2
    //   65: invokeinterface 348 1 0
    //   70: putfield 48	com/tencent/qqmusic/mediaplayer/CommonPlayer:mAudioType	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   73: aload_0
    //   74: aload_2
    //   75: invokeinterface 351 1 0
    //   80: putfield 54	com/tencent/qqmusic/mediaplayer/CommonPlayer:mFileLength	J
    //   83: aload_0
    //   84: getfield 48	com/tencent/qqmusic/mediaplayer/CommonPlayer:mAudioType	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   87: invokestatic 357	com/tencent/qqmusic/mediaplayer/AudioFormat:isAudioType	(Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;)Z
    //   90: ifeq +149 -> 239
    //   93: aload_0
    //   94: new 94	com/tencent/qqmusic/mediaplayer/CorePlayer
    //   97: dup
    //   98: aload_2
    //   99: aload_0
    //   100: getfield 48	com/tencent/qqmusic/mediaplayer/CommonPlayer:mAudioType	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   103: aload_0
    //   104: getfield 75	com/tencent/qqmusic/mediaplayer/CommonPlayer:callback	Lcom/tencent/qqmusic/mediaplayer/PlayerCallback;
    //   107: invokespecial 360	com/tencent/qqmusic/mediaplayer/CorePlayer:<init>	(Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;Lcom/tencent/qqmusic/mediaplayer/PlayerCallback;)V
    //   110: putfield 50	com/tencent/qqmusic/mediaplayer/CommonPlayer:mAudioPlayer	Lcom/tencent/qqmusic/mediaplayer/CorePlayer;
    //   113: aload_0
    //   114: getfield 50	com/tencent/qqmusic/mediaplayer/CommonPlayer:mAudioPlayer	Lcom/tencent/qqmusic/mediaplayer/CorePlayer;
    //   117: aload_0
    //   118: getfield 54	com/tencent/qqmusic/mediaplayer/CommonPlayer:mFileLength	J
    //   121: invokevirtual 214	com/tencent/qqmusic/mediaplayer/CorePlayer:setFileLength	(J)V
    //   124: aload_0
    //   125: getfield 50	com/tencent/qqmusic/mediaplayer/CommonPlayer:mAudioPlayer	Lcom/tencent/qqmusic/mediaplayer/CorePlayer;
    //   128: aload_1
    //   129: invokevirtual 363	java/lang/Object:toString	()Ljava/lang/String;
    //   132: invokevirtual 211	com/tencent/qqmusic/mediaplayer/CorePlayer:setThreadName	(Ljava/lang/String;)V
    //   135: aload_0
    //   136: iconst_0
    //   137: putfield 52	com/tencent/qqmusic/mediaplayer/CommonPlayer:mRecognitionByExtensions	Z
    //   140: ldc 18
    //   142: new 87	java/lang/StringBuilder
    //   145: dup
    //   146: ldc_w 365
    //   149: invokespecial 92	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   152: aload_0
    //   153: getfield 48	com/tencent/qqmusic/mediaplayer/CommonPlayer:mAudioType	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   156: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   159: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   162: invokestatic 234	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   165: return
    //   166: astore_1
    //   167: ldc 18
    //   169: ldc_w 367
    //   172: aload_1
    //   173: invokestatic 370	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   176: aload_0
    //   177: bipush 90
    //   179: bipush 82
    //   181: aload_1
    //   182: invokevirtual 373	com/tencent/qqmusic/mediaplayer/upstream/DataSourceException:getErrorCode	()I
    //   185: invokevirtual 219	com/tencent/qqmusic/mediaplayer/CommonPlayer:onError	(III)V
    //   188: return
    //   189: astore_1
    //   190: ldc 18
    //   192: ldc_w 375
    //   195: aload_1
    //   196: invokestatic 370	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   199: aload_0
    //   200: bipush 90
    //   202: bipush 83
    //   204: invokevirtual 314	com/tencent/qqmusic/mediaplayer/CommonPlayer:onError	(II)V
    //   207: return
    //   208: astore_1
    //   209: ldc 18
    //   211: ldc_w 377
    //   214: aload_1
    //   215: invokestatic 370	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   218: aload_0
    //   219: bipush 90
    //   221: bipush 70
    //   223: invokevirtual 314	com/tencent/qqmusic/mediaplayer/CommonPlayer:onError	(II)V
    //   226: return
    //   227: astore_3
    //   228: ldc 18
    //   230: ldc_w 379
    //   233: invokestatic 267	com/tencent/qqmusic/mediaplayer/util/Logger:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   236: goto -153 -> 83
    //   239: aload_0
    //   240: bipush 90
    //   242: bipush 55
    //   244: invokevirtual 314	com/tencent/qqmusic/mediaplayer/CommonPlayer:onError	(II)V
    //   247: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	248	0	this	CommonPlayer
    //   0	248	1	paramFactory	com.tencent.qqmusic.mediaplayer.upstream.IDataSource.Factory
    //   56	43	2	localIDataSource	com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    //   227	1	3	localIOException	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   50	57	166	com/tencent/qqmusic/mediaplayer/upstream/DataSourceException
    //   57	63	189	java/io/IOException
    //   63	73	208	java/io/IOException
    //   73	83	227	java/io/IOException
  }
  
  /* Error */
  public void setDataSource(com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource.Factory paramFactory)
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: invokevirtual 221	com/tencent/qqmusic/mediaplayer/CommonPlayer:TransferStateTo	(I)V
    //   5: aload_1
    //   6: ifnonnull +22 -> 28
    //   9: ldc 18
    //   11: ldc_w 326
    //   14: invokestatic 154	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   17: new 328	java/lang/NullPointerException
    //   20: dup
    //   21: ldc_w 330
    //   24: invokespecial 331	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   27: athrow
    //   28: ldc 18
    //   30: new 87	java/lang/StringBuilder
    //   33: dup
    //   34: ldc_w 333
    //   37: invokespecial 92	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   40: aload_1
    //   41: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   44: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   47: invokestatic 234	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   50: aload_1
    //   51: invokeinterface 385 1 0
    //   56: astore_2
    //   57: aload_0
    //   58: aload_2
    //   59: invokeinterface 388 1 0
    //   64: putfield 48	com/tencent/qqmusic/mediaplayer/CommonPlayer:mAudioType	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   67: aload_0
    //   68: getfield 48	com/tencent/qqmusic/mediaplayer/CommonPlayer:mAudioType	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   71: invokestatic 357	com/tencent/qqmusic/mediaplayer/AudioFormat:isAudioType	(Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;)Z
    //   74: ifeq +107 -> 181
    //   77: aload_0
    //   78: new 94	com/tencent/qqmusic/mediaplayer/CorePlayer
    //   81: dup
    //   82: aload_2
    //   83: aload_0
    //   84: getfield 48	com/tencent/qqmusic/mediaplayer/CommonPlayer:mAudioType	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   87: aload_0
    //   88: getfield 75	com/tencent/qqmusic/mediaplayer/CommonPlayer:callback	Lcom/tencent/qqmusic/mediaplayer/PlayerCallback;
    //   91: invokespecial 391	com/tencent/qqmusic/mediaplayer/CorePlayer:<init>	(Lcom/tencent/qqmusic/mediaplayer/upstream/INativeDataSource;Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;Lcom/tencent/qqmusic/mediaplayer/PlayerCallback;)V
    //   94: putfield 50	com/tencent/qqmusic/mediaplayer/CommonPlayer:mAudioPlayer	Lcom/tencent/qqmusic/mediaplayer/CorePlayer;
    //   97: aload_0
    //   98: getfield 50	com/tencent/qqmusic/mediaplayer/CommonPlayer:mAudioPlayer	Lcom/tencent/qqmusic/mediaplayer/CorePlayer;
    //   101: aload_1
    //   102: invokevirtual 363	java/lang/Object:toString	()Ljava/lang/String;
    //   105: invokevirtual 211	com/tencent/qqmusic/mediaplayer/CorePlayer:setThreadName	(Ljava/lang/String;)V
    //   108: aload_0
    //   109: iconst_0
    //   110: putfield 52	com/tencent/qqmusic/mediaplayer/CommonPlayer:mRecognitionByExtensions	Z
    //   113: ldc 18
    //   115: new 87	java/lang/StringBuilder
    //   118: dup
    //   119: ldc_w 365
    //   122: invokespecial 92	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   125: aload_0
    //   126: getfield 48	com/tencent/qqmusic/mediaplayer/CommonPlayer:mAudioType	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   129: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   132: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   135: invokestatic 234	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   138: return
    //   139: astore_1
    //   140: ldc 18
    //   142: ldc_w 393
    //   145: aload_1
    //   146: invokestatic 370	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   149: aload_0
    //   150: bipush 90
    //   152: bipush 81
    //   154: aload_1
    //   155: invokevirtual 373	com/tencent/qqmusic/mediaplayer/upstream/DataSourceException:getErrorCode	()I
    //   158: invokevirtual 219	com/tencent/qqmusic/mediaplayer/CommonPlayer:onError	(III)V
    //   161: return
    //   162: astore_1
    //   163: ldc 18
    //   165: ldc_w 377
    //   168: aload_1
    //   169: invokestatic 370	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   172: aload_0
    //   173: bipush 90
    //   175: bipush 70
    //   177: invokevirtual 314	com/tencent/qqmusic/mediaplayer/CommonPlayer:onError	(II)V
    //   180: return
    //   181: aload_0
    //   182: bipush 90
    //   184: bipush 55
    //   186: invokevirtual 314	com/tencent/qqmusic/mediaplayer/CommonPlayer:onError	(II)V
    //   189: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	190	0	this	CommonPlayer
    //   0	190	1	paramFactory	com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource.Factory
    //   56	27	2	localINativeDataSource	com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource
    // Exception table:
    //   from	to	target	type
    //   50	57	139	com/tencent/qqmusic/mediaplayer/upstream/DataSourceException
    //   57	67	162	java/io/IOException
  }
  
  public void setDataSource(FileDescriptor paramFileDescriptor)
  {
    throw new UnSupportMethodException("Soft decode player cannot support setDataSource by FileDescriptor");
  }
  
  public void setDataSource(String paramString)
  {
    TransferStateTo(1);
    if (paramString == null)
    {
      Logger.e("CommonPlayer", "setDataSource() ERROR:the path is null!");
      throw new NullPointerException("the path is null!");
    }
    Logger.i("CommonPlayer", "setDataSource, path: " + paramString);
    try
    {
      this.mAudioType = AudioRecognition.recognitionAudioFormatByExtensions(paramString);
      if (AudioFormat.isAudioType(this.mAudioType))
      {
        this.mFileLength = new File(paramString).length();
        newCommonPlayer(paramString, this.mAudioType);
        this.mRecognitionByExtensions = true;
        Logger.i("CommonPlayer", "setDataSource() recognition audio format first result =  " + this.mAudioType);
      }
      for (;;)
      {
        this.mRecognitionByExtensions = true;
        return;
        onError(90, 55);
      }
      return;
    }
    catch (Exception paramString)
    {
      Logger.e("CommonPlayer", paramString);
    }
  }
  
  public void setFileTotalLength(long paramLong)
  {
    this.mFileLength = paramLong;
    if (this.mAudioPlayer != null)
    {
      this.mAudioPlayer.setFileLength(paramLong);
      Logger.i("CommonPlayer", "setFileLength length = " + paramLong);
    }
  }
  
  public void setPlayerListenerCallback(PlayerListenerCallback paramPlayerListenerCallback)
  {
    this.mCallback = paramPlayerListenerCallback;
  }
  
  public void setVolume(float paramFloat1, float paramFloat2)
  {
    if (this.mAudioPlayer != null) {
      this.mAudioPlayer.setVolume(paramFloat1, paramFloat2);
    }
  }
  
  public void setWakeMode(Context paramContext, int paramInt)
  {
    throw new UnSupportMethodException("Soft decode player cannot support setWakeMode");
  }
  
  public void start()
  {
    TransferStateTo(4);
    Logger.i("CommonPlayer", auxiliary("[start]"));
    if (this.mAudioPlayer != null) {
      this.mAudioPlayer.play();
    }
    for (;;)
    {
      notifyStartPlaySong();
      return;
      Logger.e("CommonPlayer", "start() mAudioPlayer is null!");
    }
  }
  
  public void stop()
  {
    try
    {
      TransferStateTo(6);
      Logger.i("CommonPlayer", auxiliary("[stop]"));
      this.mCheckAudioInitSuccessHandler.removeCallbacksAndMessages(null);
      if (this.mAudioPlayer != null)
      {
        this.mAudioPlayer.stop();
        return;
      }
      Logger.e("CommonPlayer", "stop() mAudioPlayer is null!");
      return;
    }
    catch (Exception localException)
    {
      Logger.e("CommonPlayer", localException);
    }
  }
  
  private static class CheckAudioInitSuccessHandler
    extends Handler
  {
    private static final int MSG_CHECK = 1;
    private static final int MSG_NOTIFY_BUFFER_PROGRESS = 2;
    private final WeakReference<CommonPlayer> mQQMediaPlayer;
    
    CheckAudioInitSuccessHandler(CommonPlayer paramCommonPlayer)
    {
      super();
      this.mQQMediaPlayer = new WeakReference(paramCommonPlayer);
    }
    
    @SuppressLint({"DefaultLocale"})
    private void check(Message paramMessage, CommonPlayer paramCommonPlayer)
    {
      Logger.i("CommonPlayer", "mCheckAudioInitSuccessHandler wait 5s");
      paramMessage = "null";
      CorePlayer localCorePlayer = paramCommonPlayer.mAudioPlayer;
      if (localCorePlayer != null)
      {
        Logger.i("CommonPlayer", String.format("handleMessage, init: %b, startDecode: %b, decode: %b, statue: %d ", new Object[] { Boolean.valueOf(localCorePlayer.isInit()), Boolean.valueOf(localCorePlayer.hasDecodeData()), Boolean.valueOf(localCorePlayer.hasDecodeDataSuccess()), Integer.valueOf(localCorePlayer.getPlayerState()) }));
        paramMessage = localCorePlayer.getPlayingFilePath();
        Logger.i("CommonPlayer", "handleMessage mFilePath = " + paramMessage);
      }
      if (paramMessage != null)
      {
        if ((localCorePlayer != null) && (localCorePlayer.isCreateAudioTrackFail()))
        {
          Logger.w("CommonPlayer", "create audiotrack fail,EXCEPTION_TYPE_CREATAUDIOTRACK");
          paramCommonPlayer.onError(92, 66);
        }
      }
      else {
        return;
      }
      if (((paramCommonPlayer.mRecognitionByExtensions) && (localCorePlayer != null) && (localCorePlayer.getPlayerState() == 5)) || ((localCorePlayer != null) && (localCorePlayer.isInit()) && (!localCorePlayer.hasDecodeData())))
      {
        paramCommonPlayer.checkPlayerAndRePlay(5000L);
        return;
      }
      if ((localCorePlayer != null) && (!localCorePlayer.hasDecodeDataSuccess()) && (paramCommonPlayer.mRecognitionByExtensions)) {
        try
        {
          paramCommonPlayer.mRecognitionByExtensions = false;
          localCorePlayer.exitNotCallback();
          localAudioType1 = AudioRecognition.recognitionAudioFormatExactly(paramMessage);
          AudioFormat.AudioType localAudioType2 = paramCommonPlayer.mAudioType;
          if ((AudioFormat.isAudioType(localAudioType1)) && (!localAudioType1.equals(localAudioType2)))
          {
            paramCommonPlayer.mAudioType = localAudioType1;
            paramCommonPlayer.newCommonPlayer(localCorePlayer.getPlayingFilePath(), localAudioType1);
            localCorePlayer.copyPlayerStatus(localCorePlayer);
            Logger.i("CommonPlayer", "recognition again, path =" + paramMessage + "recognition audio format second ,result =  " + paramCommonPlayer.mAudioType + "，init decoder again");
            paramCommonPlayer.prepare();
            return;
          }
        }
        catch (FileNotFoundException paramMessage)
        {
          AudioFormat.AudioType localAudioType1;
          paramCommonPlayer.onError(90, 53);
          Logger.e("CommonPlayer", paramMessage);
          return;
          Logger.w("CommonPlayer", "path =" + paramMessage + ", mAudioType = " + paramCommonPlayer.mAudioType + ",newAudioType = " + localAudioType1 + "recognition audio format second same with first  or is other，switch QQMediaplayer");
          paramCommonPlayer.onError(90, 101);
          return;
        }
        catch (Exception paramMessage)
        {
          paramCommonPlayer.onError(90, 90);
          Logger.e("CommonPlayer", paramMessage);
          return;
        }
      }
      Logger.i("CommonPlayer", "path =" + paramMessage + ", AudioPlayer exit check");
    }
    
    public void handleMessage(Message paramMessage)
    {
      CommonPlayer localCommonPlayer = (CommonPlayer)this.mQQMediaPlayer.get();
      if (localCommonPlayer == null) {}
      int i;
      do
      {
        CorePlayer localCorePlayer;
        do
        {
          do
          {
            do
            {
              return;
              if (paramMessage.what == 1)
              {
                check(paramMessage, localCommonPlayer);
                return;
              }
            } while (paramMessage.what != 2);
            paramMessage = localCommonPlayer.mCallback;
          } while (paramMessage == null);
          localCorePlayer = localCommonPlayer.mAudioPlayer;
        } while (localCorePlayer == null);
        i = localCorePlayer.getBufferedPercentage();
        paramMessage.onBufferingUpdate(localCommonPlayer, i);
      } while ((i == 100) || (localCommonPlayer.getPlayerState() == 9) || (localCommonPlayer.getPlayerState() == 8) || (localCommonPlayer.getPlayerState() == 7));
      sendEmptyMessageDelayed(2, 200L);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\CommonPlayer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */