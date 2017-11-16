package com.tencent.qqmusic.mediaplayer;

import android.annotation.SuppressLint;
import android.media.AudioTrack;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener;
import com.tencent.qqmusic.mediaplayer.codec.BaseDecoder;
import com.tencent.qqmusic.mediaplayer.codec.ffmpeg.FfmpegPlayer;
import com.tencent.qqmusic.mediaplayer.codec.flac.FLACDecoder;
import com.tencent.qqmusic.mediaplayer.codec.mp3.MP3Decoder;
import com.tencent.qqmusic.mediaplayer.formatdetector.FormatDetector;
import com.tencent.qqmusic.mediaplayer.network.IMediaHTTPService;
import com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer;
import com.tencent.qqmusic.mediaplayer.seektable.SeekTable;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource;
import com.tencent.qqmusic.mediaplayer.util.AudioTrackMonitor;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import com.tencent.qqmusic.mediaplayer.util.ReferenceTimer;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"DefaultLocale"})
class CorePlayer
  implements PlayerException, Runnable
{
  private static final int BIT_RATE_FLAC = 700;
  private static final int CALL_PREPARED_DELAY_TIME = 20;
  private static final int DTS_OPTIMAL_FRAME_BYTE = 2048;
  private static final int MAX_AUDIO_TRACK_BUFFER_TIME = 1;
  private static final int MIN_AUDIO_TRACK_BUFFER_TIMES = 1;
  private static final int MIN_FIRST_PIECE_SIZE = 102400;
  private static final int MSG_BUFFER_READ_TO_PLAY = 50;
  private static final int MSG_SEEK = 49;
  private static final AtomicInteger PLAYER_ID_CREATOR = new AtomicInteger(0);
  private static final int SHORT_AUDIO_FILE_LENGTH_THRESHOLD = 102400;
  private static final String TAG = "CorePlayer";
  private final List<IAudioListener> audioEffects = new ArrayList(3);
  public final Object bufferLock = new Object();
  private long bufferWaitingPosition;
  private int bufferWaitingTime;
  private boolean isBuffering;
  private BufferInfo m24BitBufferInfo = new BufferInfo();
  public long mAdjustLength = 0L;
  private int mAudioStreamType = 3;
  private AudioTrack mAudioTrack;
  public AudioFormat.AudioType mAudioType = AudioFormat.AudioType.UNSUPPORT;
  private int mBuffSize;
  public PlayerCallback mCallback;
  private boolean mCreateAudioTrackFail = false;
  private long mCurPosition = 0L;
  private long mCurrentFrameCount = 0L;
  private BufferInfo mDTSBufferInfo = new BufferInfo();
  private IDataSource mDataSource;
  private BufferInfo mDecodeBufferInfo = new BufferInfo();
  public BaseDecoder mDecoder;
  public long mFileLength = 0L;
  public String mFileName;
  public Handler mHandler = null;
  public boolean mHasDecode = false;
  private boolean mHasDecodeSuccess = false;
  private boolean mHasInit = false;
  private AudioInformation mInformation;
  private volatile boolean mIsExit = false;
  public final MediaHTTPManager mMediaHTTPManager;
  private INativeDataSource mNativeDataSource;
  private volatile boolean mNeedChangePlayThreadPriority = false;
  private boolean mNeedFlush = false;
  private OnlineSeekHandler mOnlineSeekHandler = null;
  private HandlerThread mOnlineSeekHandlerThread = null;
  private long mPlaySample;
  private int mPlayerID = PLAYER_ID_CREATOR.addAndGet(1);
  private BufferInfo mReSampleBufferInfo = new BufferInfo();
  private final Stack<Integer> mSeekRecord = new Stack();
  public SeekTable mSeekTable = null;
  private WaitNotify mSignalControl = new WaitNotify();
  public StateRunner<Integer> mStateRunner = new StateRunner(Integer.valueOf(0));
  private final List<IAudioListener> mTerminalAudioEffectList = new ArrayList();
  private String mThreadName = "Unnamed";
  private ReferenceTimer mTimer = new ReferenceTimer();
  private int mTrackBufferSizeInByte;
  private AudioTrackMonitor monitor = null;
  private final PerformanceTracer performanceTracer = new PerformanceTracer();
  
  CorePlayer(IMediaHTTPService paramIMediaHTTPService, URL paramURL, PlayerCallback paramPlayerCallback)
  {
    initThreadHandler();
    this.mCallback = paramPlayerCallback;
    try
    {
      this.mFileName = File.createTempFile("mediaHttpCommonPlayer", "tmp").getAbsolutePath();
    }
    catch (Throwable localThrowable)
    {
      try
      {
        for (;;)
        {
          paramIMediaHTTPService = new MediaHTTPManager(paramIMediaHTTPService, this.mFileName, paramURL);
          this.mMediaHTTPManager = paramIMediaHTTPService;
          if (this.mMediaHTTPManager == null) {
            break;
          }
          this.mMediaHTTPManager.setBufferListener(new MediaHTTPManager.OnBufferListener()
          {
            public void onBufferProgress(long paramAnonymousLong1, long paramAnonymousLong2)
            {
              CorePlayer.this.notifyDownloadProgress(paramAnonymousLong1, paramAnonymousLong2);
            }
            
            public void onBufferReadyToPlay()
            {
              if (!CorePlayer.this.mHasDecode)
              {
                AudioFormat.AudioType localAudioType = FormatDetector.getAudioFormat(CorePlayer.this.mFileName, false);
                if (AudioFormat.isAudioType(localAudioType))
                {
                  CorePlayer.this.mAudioType = localAudioType;
                  CorePlayer.this.mDecoder = MediaCodecFactory.createDecoderByType(localAudioType);
                  if ((CorePlayer.this.mDecoder instanceof MP3Decoder)) {
                    ((MP3Decoder)CorePlayer.this.mDecoder).setFileTotalLength(CorePlayer.this.mFileLength);
                  }
                  CorePlayer.this.mSeekTable = CorePlayer.createSeekTable(localAudioType, CorePlayer.this.mFileName);
                  new Thread(CorePlayer.this, "decoder-" + CorePlayer.this.mFileName).start();
                }
              }
              else
              {
                return;
              }
              CorePlayer.this.callExceptionCallback(91, 55);
            }
          });
          this.mMediaHTTPManager.setConnectionListener(new MediaHTTPManager.OnConnectionListener()
          {
            public void onConnected(long paramAnonymousLong, String paramAnonymousString)
            {
              CorePlayer.this.setFileLength(paramAnonymousLong);
            }
            
            public void onError(int paramAnonymousInt1, int paramAnonymousInt2)
            {
              synchronized (CorePlayer.this.bufferLock)
              {
                CorePlayer.this.bufferLock.notifyAll();
                CorePlayer.this.callExceptionCallback(paramAnonymousInt1, paramAnonymousInt2);
                return;
              }
            }
          });
          this.mMediaHTTPManager.setSniffListener(new MediaHTTPManager.OnSniffListener()
          {
            public boolean sniff()
            {
              boolean bool2 = false;
              boolean bool1 = false;
              Object localObject = FormatDetector.getAudioFormat(CorePlayer.this.mFileName, false);
              if (AudioFormat.isAudioType((AudioFormat.AudioType)localObject))
              {
                localObject = MediaCodecFactory.createDecoderByType((AudioFormat.AudioType)localObject);
                if (((BaseDecoder)localObject).init(CorePlayer.this.mFileName, false) == 0) {
                  bool1 = true;
                }
                bool2 = bool1;
                if (bool1)
                {
                  ((BaseDecoder)localObject).release();
                  bool2 = bool1;
                }
              }
              return bool2;
            }
          });
          return;
          localThrowable = localThrowable;
          Logger.e("CorePlayer", "createTempFile", localThrowable);
        }
      }
      catch (Exception paramIMediaHTTPService)
      {
        do
        {
          for (;;)
          {
            Logger.e("CorePlayer", "init MediaHTTPManager", paramIMediaHTTPService);
            paramIMediaHTTPService = null;
          }
        } while (paramPlayerCallback == null);
        paramPlayerCallback.playerException(90, 70, 0);
      }
    }
  }
  
  CorePlayer(IDataSource paramIDataSource, AudioFormat.AudioType paramAudioType, PlayerCallback paramPlayerCallback)
  {
    initThreadHandler();
    this.mAudioType = paramAudioType;
    this.mCallback = paramPlayerCallback;
    this.mDataSource = paramIDataSource;
    this.mNativeDataSource = null;
    this.mFileName = null;
    this.mMediaHTTPManager = null;
    this.mDecoder = MediaCodecFactory.createDecoderByType(paramAudioType);
    this.mStateRunner.transfer(Integer.valueOf(1));
    Logger.i("CorePlayer", axiliary("audioType: " + paramAudioType + ", dataSource: " + paramIDataSource));
  }
  
  CorePlayer(INativeDataSource paramINativeDataSource, AudioFormat.AudioType paramAudioType, PlayerCallback paramPlayerCallback)
  {
    initThreadHandler();
    this.mAudioType = paramAudioType;
    this.mCallback = paramPlayerCallback;
    this.mNativeDataSource = paramINativeDataSource;
    this.mDataSource = null;
    this.mFileName = null;
    this.mMediaHTTPManager = null;
    this.mDecoder = MediaCodecFactory.createDecoderByType(paramAudioType);
    this.mStateRunner.transfer(Integer.valueOf(1));
    Logger.i("CorePlayer", axiliary("audioType: " + paramAudioType + ", dataSource: " + paramINativeDataSource));
  }
  
  CorePlayer(String paramString, AudioFormat.AudioType paramAudioType, PlayerCallback paramPlayerCallback)
  {
    initThreadHandler();
    this.mAudioType = paramAudioType;
    this.mCallback = paramPlayerCallback;
    this.mFileName = paramString;
    this.mDecoder = MediaCodecFactory.createDecoderByType(paramAudioType);
    this.mStateRunner.transfer(Integer.valueOf(1));
    this.mMediaHTTPManager = null;
    Logger.i("CorePlayer", axiliary("audioType: " + paramAudioType + ", filepath: " + paramString));
  }
  
  private String axiliary(String paramString)
  {
    return "ID: " + this.mPlayerID + ". " + paramString;
  }
  
  private int calcBitDept(long paramLong1, long paramLong2, int paramInt, long paramLong3)
  {
    return AudioRecognition.calcBitDept(paramLong1, paramLong2, paramInt, paramLong3);
  }
  
  private void callExceptionCallback(int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.mCallback != null) {
      this.mCallback.playerException(paramInt1, paramInt2, paramInt3);
    }
  }
  
  private boolean createAudioTrack()
  {
    Logger.d("CorePlayer", axiliary("createAudioTrack"));
    if (!this.mStateRunner.isEqual(new Integer[] { Integer.valueOf(3) }))
    {
      Logger.e("CorePlayer", "mState is not preparing");
      callExceptionCallback(91, 54);
      return false;
    }
    if (this.mInformation.getSampleRate() <= 0L)
    {
      Logger.e("CorePlayer", "mInformation.getSampleRate() failed");
      callExceptionCallback(91, 64);
      return false;
    }
    int i = 12;
    int i2 = this.mInformation.getChannels();
    if (i2 == 1) {
      i = 4;
    }
    try
    {
      for (;;)
      {
        if (!(this.mDecoder instanceof FLACDecoder)) {
          break label905;
        }
        j = ((FLACDecoder)this.mDecoder).getminBufferSize() / 2;
        k = 92;
        m = 66;
        Logger.d("CorePlayer", axiliary(this.mInformation.toString()));
        for (this.mPlaySample = this.mInformation.getSampleRate(); this.mPlaySample > 48000L; this.mPlaySample /= 2L) {}
        if (i2 == 2) {
          i = 12;
        } else if (i2 == 6) {
          i = 252;
        } else if (i2 == 8) {
          i = 1020;
        }
      }
    }
    catch (SoNotFindException localSoNotFindException)
    {
      for (;;)
      {
        Logger.e("CorePlayer", localSoNotFindException);
        int k = 91;
        int m = 62;
        int j = 0;
        continue;
        this.mInformation.setPlaySample(this.mPlaySample);
        int n = this.mInformation.getBitDept();
        if (n == 0) {
          n = 2;
        }
        for (;;)
        {
          int i3 = (int)this.mPlaySample;
          if (n == 1) {}
          for (int i1 = 3;; i1 = 2)
          {
            i1 = AudioTrack.getMinBufferSize(i3, i, i1);
            if (i1 >= 0) {
              break;
            }
            callExceptionCallback(92, 66);
            return false;
          }
          long l;
          if (AudioFormat.AudioType.FLAC.equals(this.mAudioType))
          {
            this.mBuffSize = j;
            if ((this.mDecoder instanceof FfmpegPlayer)) {
              this.mBuffSize = Math.max(4096, this.mBuffSize);
            }
            if ((this.mDecoder instanceof MP3Decoder)) {
              ((MP3Decoder)this.mDecoder).initInputBuffer(this.mBuffSize);
            }
            Logger.i("CorePlayer", axiliary(String.format("playback_bufsize: %d, mBuffSize: %d, mPlaySample: %d, playChannel: %d", new Object[] { Integer.valueOf(i1), Integer.valueOf(this.mBuffSize), Long.valueOf(this.mPlaySample), Integer.valueOf(i2) })));
            l = 1L * this.mPlaySample * i2 * 2L;
            if ((this.mFileLength == 0L) || ((this.mFileLength * 6L >= l) && (this.mFileLength >= 102400L))) {
              break label812;
            }
            j = Math.max(1, 1);
            Logger.i("CorePlayer", "[createAudioTrack] short audio. set times to: " + j);
            label520:
            Logger.i("CorePlayer", axiliary("mFileLength: " + this.mFileLength + ", times: " + j + ", MIN_AUDIO_TRACK_BUFFER_TIMES: 1"));
            label565:
            if (j <= 0) {}
          }
          for (;;)
          {
            try
            {
              this.mTrackBufferSizeInByte = (i1 * j);
              i3 = this.mAudioStreamType;
              int i4 = (int)this.mPlaySample;
              if (n == 1)
              {
                i2 = 3;
                this.mAudioTrack = new AudioTrack(i3, i4, i, i2, this.mTrackBufferSizeInByte, 1);
                Logger.d("CorePlayer", axiliary("new AudioTrack, sampleRate: " + this.mPlaySample + ", channels: " + i + ", bitDepth: " + n + ", buffer: " + this.mTrackBufferSizeInByte));
                if (this.mAudioTrack.getState() != 1) {
                  continue;
                }
                Logger.d("CorePlayer", axiliary("new AudioTrack succeed"));
                if ((this.mAudioTrack == null) || (this.mAudioTrack.getState() != 1)) {
                  continue;
                }
                Logger.d("CorePlayer", axiliary("create audioTrack success times = " + j));
                return true;
                if (i1 % 2048 == 0) {
                  break label896;
                }
                j = (i1 / 2048 + 1) * 2048;
                this.mBuffSize = j;
                this.mBuffSize /= PlayerConfigManager.getInstance().getBufRatio();
                this.mBuffSize *= 2;
                i1 = j;
                break;
                label812:
                j = Math.max((int)(Math.floor(l / i1) + 1.0D), 1);
                break label520;
              }
              i2 = 2;
              continue;
              this.mAudioTrack.release();
            }
            catch (Throwable localThrowable)
            {
              Logger.e("CorePlayer", localThrowable);
              continue;
              this.mCreateAudioTrackFail = true;
              Logger.e("CorePlayer", axiliary("create audioTrack fail mCreateAudioTrackFail = true"));
              this.mAudioTrack = null;
              callExceptionCallback(k, m);
              return false;
            }
            j -= 2;
            break label565;
            label896:
            j = i1;
          }
        }
        label905:
        j = 0;
      }
    }
  }
  
  /* Error */
  public static SeekTable createSeekTable(AudioFormat.AudioType paramAudioType, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: aload_0
    //   6: getstatic 530	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:M4A	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   9: if_acmpne +73 -> 82
    //   12: new 532	com/tencent/qqmusic/mediaplayer/seektable/mpeg4/Mp4SeekTable
    //   15: dup
    //   16: invokespecial 533	com/tencent/qqmusic/mediaplayer/seektable/mpeg4/Mp4SeekTable:<init>	()V
    //   19: astore 4
    //   21: new 535	java/io/FileInputStream
    //   24: dup
    //   25: aload_1
    //   26: invokespecial 536	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   29: astore_2
    //   30: new 538	java/io/BufferedInputStream
    //   33: dup
    //   34: aload_2
    //   35: invokespecial 541	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   38: astore_1
    //   39: aload 4
    //   41: aload_1
    //   42: invokeinterface 546 2 0
    //   47: aconst_null
    //   48: astore_0
    //   49: aload_1
    //   50: astore_3
    //   51: aload_2
    //   52: astore_1
    //   53: aload 4
    //   55: astore_2
    //   56: aload_0
    //   57: ifnull +8 -> 65
    //   60: aload_0
    //   61: invokevirtual 550	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   64: pop
    //   65: iconst_2
    //   66: anewarray 552	java/io/Closeable
    //   69: dup
    //   70: iconst_0
    //   71: aload_3
    //   72: aastore
    //   73: dup
    //   74: iconst_1
    //   75: aload_1
    //   76: aastore
    //   77: invokestatic 556	com/tencent/qqmusic/mediaplayer/CorePlayer:safeClose	([Ljava/io/Closeable;)V
    //   80: aload_2
    //   81: areturn
    //   82: aload_0
    //   83: getstatic 559	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:MP3	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   86: if_acmpne +687 -> 773
    //   89: new 448	com/tencent/qqmusic/mediaplayer/codec/mp3/MP3Decoder
    //   92: dup
    //   93: invokespecial 560	com/tencent/qqmusic/mediaplayer/codec/mp3/MP3Decoder:<init>	()V
    //   96: astore_0
    //   97: aload_0
    //   98: aload_1
    //   99: iconst_0
    //   100: invokevirtual 564	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:init	(Ljava/lang/String;Z)I
    //   103: pop
    //   104: aload_0
    //   105: invokevirtual 568	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:getAudioInformation	()Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   108: checkcast 570	com/tencent/qqmusic/mediaplayer/codec/mp3/MP3Information
    //   111: astore 5
    //   113: aload 5
    //   115: invokevirtual 573	com/tencent/qqmusic/mediaplayer/codec/mp3/MP3Information:isVbr	()Z
    //   118: ifeq +99 -> 217
    //   121: aload 5
    //   123: invokevirtual 576	com/tencent/qqmusic/mediaplayer/codec/mp3/MP3Information:getVbrType	()I
    //   126: iconst_2
    //   127: if_icmpne +42 -> 169
    //   130: new 578	com/tencent/qqmusic/mediaplayer/seektable/mp3/Mp3VbrXingSeekTable
    //   133: dup
    //   134: invokespecial 579	com/tencent/qqmusic/mediaplayer/seektable/mp3/Mp3VbrXingSeekTable:<init>	()V
    //   137: astore_2
    //   138: aload_2
    //   139: checkcast 578	com/tencent/qqmusic/mediaplayer/seektable/mp3/Mp3VbrXingSeekTable
    //   142: aload 5
    //   144: invokevirtual 583	com/tencent/qqmusic/mediaplayer/seektable/mp3/Mp3VbrXingSeekTable:setAudioInfomation	(Lcom/tencent/qqmusic/mediaplayer/codec/mp3/MP3Information;)V
    //   147: new 535	java/io/FileInputStream
    //   150: dup
    //   151: aload_1
    //   152: invokespecial 536	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   155: astore_1
    //   156: aload_2
    //   157: aload_1
    //   158: invokeinterface 546 2 0
    //   163: aload 4
    //   165: astore_3
    //   166: goto -110 -> 56
    //   169: aload 5
    //   171: invokevirtual 576	com/tencent/qqmusic/mediaplayer/codec/mp3/MP3Information:getVbrType	()I
    //   174: iconst_3
    //   175: if_icmpne +588 -> 763
    //   178: new 585	com/tencent/qqmusic/mediaplayer/seektable/mp3/Mp3VbrVBRISeekTable
    //   181: dup
    //   182: invokespecial 586	com/tencent/qqmusic/mediaplayer/seektable/mp3/Mp3VbrVBRISeekTable:<init>	()V
    //   185: astore_2
    //   186: aload_2
    //   187: checkcast 585	com/tencent/qqmusic/mediaplayer/seektable/mp3/Mp3VbrVBRISeekTable
    //   190: aload 5
    //   192: invokevirtual 587	com/tencent/qqmusic/mediaplayer/seektable/mp3/Mp3VbrVBRISeekTable:setAudioInfomation	(Lcom/tencent/qqmusic/mediaplayer/codec/mp3/MP3Information;)V
    //   195: new 535	java/io/FileInputStream
    //   198: dup
    //   199: aload_1
    //   200: invokespecial 536	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   203: astore_1
    //   204: aload_2
    //   205: aload_1
    //   206: invokeinterface 546 2 0
    //   211: aload 4
    //   213: astore_3
    //   214: goto -158 -> 56
    //   217: aload 5
    //   219: invokevirtual 590	com/tencent/qqmusic/mediaplayer/codec/mp3/MP3Information:isCbr	()Z
    //   222: ifeq +541 -> 763
    //   225: new 592	com/tencent/qqmusic/mediaplayer/seektable/mp3/Mp3CbrSeekTable
    //   228: dup
    //   229: invokespecial 593	com/tencent/qqmusic/mediaplayer/seektable/mp3/Mp3CbrSeekTable:<init>	()V
    //   232: astore_2
    //   233: aload_2
    //   234: checkcast 592	com/tencent/qqmusic/mediaplayer/seektable/mp3/Mp3CbrSeekTable
    //   237: aload 5
    //   239: invokevirtual 594	com/tencent/qqmusic/mediaplayer/seektable/mp3/Mp3CbrSeekTable:setAudioInfomation	(Lcom/tencent/qqmusic/mediaplayer/codec/mp3/MP3Information;)V
    //   242: new 535	java/io/FileInputStream
    //   245: dup
    //   246: aload_1
    //   247: invokespecial 536	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   250: astore_1
    //   251: aload_2
    //   252: aload_1
    //   253: invokeinterface 546 2 0
    //   258: aload 4
    //   260: astore_3
    //   261: goto -205 -> 56
    //   264: astore_3
    //   265: aconst_null
    //   266: astore_0
    //   267: aconst_null
    //   268: astore_1
    //   269: aconst_null
    //   270: astore_2
    //   271: ldc 51
    //   273: ldc_w 596
    //   276: aload_3
    //   277: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   280: aload_0
    //   281: ifnull +8 -> 289
    //   284: aload_0
    //   285: invokevirtual 550	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   288: pop
    //   289: iconst_2
    //   290: anewarray 552	java/io/Closeable
    //   293: dup
    //   294: iconst_0
    //   295: aload_1
    //   296: aastore
    //   297: dup
    //   298: iconst_1
    //   299: aload_2
    //   300: aastore
    //   301: invokestatic 556	com/tencent/qqmusic/mediaplayer/CorePlayer:safeClose	([Ljava/io/Closeable;)V
    //   304: aconst_null
    //   305: areturn
    //   306: astore_3
    //   307: aconst_null
    //   308: astore_0
    //   309: aconst_null
    //   310: astore_1
    //   311: aconst_null
    //   312: astore_2
    //   313: aload_1
    //   314: astore 6
    //   316: aload_2
    //   317: astore 5
    //   319: aload_0
    //   320: astore 4
    //   322: ldc 51
    //   324: ldc_w 598
    //   327: aload_3
    //   328: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   331: aload_0
    //   332: ifnull +8 -> 340
    //   335: aload_0
    //   336: invokevirtual 550	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   339: pop
    //   340: iconst_2
    //   341: anewarray 552	java/io/Closeable
    //   344: dup
    //   345: iconst_0
    //   346: aload_1
    //   347: aastore
    //   348: dup
    //   349: iconst_1
    //   350: aload_2
    //   351: aastore
    //   352: invokestatic 556	com/tencent/qqmusic/mediaplayer/CorePlayer:safeClose	([Ljava/io/Closeable;)V
    //   355: aconst_null
    //   356: areturn
    //   357: astore_3
    //   358: aconst_null
    //   359: astore_0
    //   360: aconst_null
    //   361: astore_1
    //   362: aconst_null
    //   363: astore_2
    //   364: aload_1
    //   365: astore 6
    //   367: aload_2
    //   368: astore 5
    //   370: aload_0
    //   371: astore 4
    //   373: ldc 51
    //   375: ldc_w 600
    //   378: aload_3
    //   379: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   382: aload_0
    //   383: ifnull +8 -> 391
    //   386: aload_0
    //   387: invokevirtual 550	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   390: pop
    //   391: iconst_2
    //   392: anewarray 552	java/io/Closeable
    //   395: dup
    //   396: iconst_0
    //   397: aload_1
    //   398: aastore
    //   399: dup
    //   400: iconst_1
    //   401: aload_2
    //   402: aastore
    //   403: invokestatic 556	com/tencent/qqmusic/mediaplayer/CorePlayer:safeClose	([Ljava/io/Closeable;)V
    //   406: aconst_null
    //   407: areturn
    //   408: astore_3
    //   409: aconst_null
    //   410: astore_0
    //   411: aconst_null
    //   412: astore_1
    //   413: aconst_null
    //   414: astore_2
    //   415: aload_1
    //   416: astore 6
    //   418: aload_2
    //   419: astore 5
    //   421: aload_0
    //   422: astore 4
    //   424: ldc 51
    //   426: ldc_w 602
    //   429: aload_3
    //   430: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   433: aload_0
    //   434: ifnull +8 -> 442
    //   437: aload_0
    //   438: invokevirtual 550	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   441: pop
    //   442: iconst_2
    //   443: anewarray 552	java/io/Closeable
    //   446: dup
    //   447: iconst_0
    //   448: aload_1
    //   449: aastore
    //   450: dup
    //   451: iconst_1
    //   452: aload_2
    //   453: aastore
    //   454: invokestatic 556	com/tencent/qqmusic/mediaplayer/CorePlayer:safeClose	([Ljava/io/Closeable;)V
    //   457: aconst_null
    //   458: areturn
    //   459: astore_1
    //   460: aconst_null
    //   461: astore_0
    //   462: aconst_null
    //   463: astore_2
    //   464: aload_0
    //   465: ifnull +8 -> 473
    //   468: aload_0
    //   469: invokevirtual 550	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   472: pop
    //   473: iconst_2
    //   474: anewarray 552	java/io/Closeable
    //   477: dup
    //   478: iconst_0
    //   479: aload_3
    //   480: aastore
    //   481: dup
    //   482: iconst_1
    //   483: aload_2
    //   484: aastore
    //   485: invokestatic 556	com/tencent/qqmusic/mediaplayer/CorePlayer:safeClose	([Ljava/io/Closeable;)V
    //   488: aload_1
    //   489: athrow
    //   490: astore_1
    //   491: aconst_null
    //   492: astore_0
    //   493: goto -29 -> 464
    //   496: astore 4
    //   498: aconst_null
    //   499: astore_0
    //   500: aload_1
    //   501: astore_3
    //   502: aload 4
    //   504: astore_1
    //   505: goto -41 -> 464
    //   508: astore_1
    //   509: aconst_null
    //   510: astore_2
    //   511: goto -47 -> 464
    //   514: astore 4
    //   516: aload_1
    //   517: astore_2
    //   518: aload 4
    //   520: astore_1
    //   521: goto -57 -> 464
    //   524: astore 4
    //   526: aload_1
    //   527: astore_2
    //   528: aload 4
    //   530: astore_1
    //   531: goto -67 -> 464
    //   534: astore 4
    //   536: aload_1
    //   537: astore_2
    //   538: aload 4
    //   540: astore_1
    //   541: goto -77 -> 464
    //   544: astore 4
    //   546: aload_1
    //   547: astore_3
    //   548: aload 4
    //   550: astore_1
    //   551: goto -87 -> 464
    //   554: astore_1
    //   555: aload 6
    //   557: astore_3
    //   558: aload 5
    //   560: astore_2
    //   561: aload 4
    //   563: astore_0
    //   564: goto -100 -> 464
    //   567: astore_3
    //   568: aconst_null
    //   569: astore_0
    //   570: aconst_null
    //   571: astore_1
    //   572: goto -157 -> 415
    //   575: astore_3
    //   576: aconst_null
    //   577: astore_0
    //   578: goto -163 -> 415
    //   581: astore_3
    //   582: aconst_null
    //   583: astore_1
    //   584: aconst_null
    //   585: astore_2
    //   586: goto -171 -> 415
    //   589: astore_3
    //   590: aload_1
    //   591: astore_2
    //   592: aconst_null
    //   593: astore_1
    //   594: goto -179 -> 415
    //   597: astore_3
    //   598: aload_1
    //   599: astore_2
    //   600: aconst_null
    //   601: astore_1
    //   602: goto -187 -> 415
    //   605: astore_3
    //   606: aload_1
    //   607: astore_2
    //   608: aconst_null
    //   609: astore_1
    //   610: goto -195 -> 415
    //   613: astore_3
    //   614: aconst_null
    //   615: astore_0
    //   616: aconst_null
    //   617: astore_1
    //   618: goto -254 -> 364
    //   621: astore_3
    //   622: aconst_null
    //   623: astore_0
    //   624: goto -260 -> 364
    //   627: astore_3
    //   628: aconst_null
    //   629: astore_1
    //   630: aconst_null
    //   631: astore_2
    //   632: goto -268 -> 364
    //   635: astore_3
    //   636: aload_1
    //   637: astore_2
    //   638: aconst_null
    //   639: astore_1
    //   640: goto -276 -> 364
    //   643: astore_3
    //   644: aload_1
    //   645: astore_2
    //   646: aconst_null
    //   647: astore_1
    //   648: goto -284 -> 364
    //   651: astore_3
    //   652: aload_1
    //   653: astore_2
    //   654: aconst_null
    //   655: astore_1
    //   656: goto -292 -> 364
    //   659: astore_3
    //   660: aconst_null
    //   661: astore_0
    //   662: aconst_null
    //   663: astore_1
    //   664: goto -351 -> 313
    //   667: astore_3
    //   668: aconst_null
    //   669: astore_0
    //   670: goto -357 -> 313
    //   673: astore_3
    //   674: aconst_null
    //   675: astore_1
    //   676: aconst_null
    //   677: astore_2
    //   678: goto -365 -> 313
    //   681: astore_3
    //   682: aload_1
    //   683: astore_2
    //   684: aconst_null
    //   685: astore_1
    //   686: goto -373 -> 313
    //   689: astore_3
    //   690: aload_1
    //   691: astore_2
    //   692: aconst_null
    //   693: astore_1
    //   694: goto -381 -> 313
    //   697: astore_3
    //   698: aload_1
    //   699: astore_2
    //   700: aconst_null
    //   701: astore_1
    //   702: goto -389 -> 313
    //   705: astore_3
    //   706: aconst_null
    //   707: astore_0
    //   708: aconst_null
    //   709: astore_1
    //   710: goto -439 -> 271
    //   713: astore_3
    //   714: aconst_null
    //   715: astore_0
    //   716: goto -445 -> 271
    //   719: astore_3
    //   720: aconst_null
    //   721: astore_1
    //   722: aconst_null
    //   723: astore_2
    //   724: goto -453 -> 271
    //   727: astore_3
    //   728: aconst_null
    //   729: astore 4
    //   731: aload_1
    //   732: astore_2
    //   733: aload 4
    //   735: astore_1
    //   736: goto -465 -> 271
    //   739: astore_3
    //   740: aconst_null
    //   741: astore 4
    //   743: aload_1
    //   744: astore_2
    //   745: aload 4
    //   747: astore_1
    //   748: goto -477 -> 271
    //   751: astore_3
    //   752: aconst_null
    //   753: astore 4
    //   755: aload_1
    //   756: astore_2
    //   757: aload 4
    //   759: astore_1
    //   760: goto -489 -> 271
    //   763: aconst_null
    //   764: astore_1
    //   765: aconst_null
    //   766: astore_2
    //   767: aload 4
    //   769: astore_3
    //   770: goto -714 -> 56
    //   773: aconst_null
    //   774: astore_0
    //   775: aconst_null
    //   776: astore_1
    //   777: aconst_null
    //   778: astore_2
    //   779: aload 4
    //   781: astore_3
    //   782: goto -726 -> 56
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	785	0	paramAudioType	AudioFormat.AudioType
    //   0	785	1	paramString	String
    //   29	750	2	localObject1	Object
    //   1	260	3	localObject2	Object
    //   264	13	3	localFileNotFoundException1	java.io.FileNotFoundException
    //   306	22	3	localIOException1	java.io.IOException
    //   357	22	3	localInvalidBoxException1	com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.InvalidBoxException
    //   408	72	3	localThrowable1	Throwable
    //   501	57	3	localObject3	Object
    //   567	1	3	localThrowable2	Throwable
    //   575	1	3	localThrowable3	Throwable
    //   581	1	3	localThrowable4	Throwable
    //   589	1	3	localThrowable5	Throwable
    //   597	1	3	localThrowable6	Throwable
    //   605	1	3	localThrowable7	Throwable
    //   613	1	3	localInvalidBoxException2	com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.InvalidBoxException
    //   621	1	3	localInvalidBoxException3	com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.InvalidBoxException
    //   627	1	3	localInvalidBoxException4	com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.InvalidBoxException
    //   635	1	3	localInvalidBoxException5	com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.InvalidBoxException
    //   643	1	3	localInvalidBoxException6	com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.InvalidBoxException
    //   651	1	3	localInvalidBoxException7	com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.InvalidBoxException
    //   659	1	3	localIOException2	java.io.IOException
    //   667	1	3	localIOException3	java.io.IOException
    //   673	1	3	localIOException4	java.io.IOException
    //   681	1	3	localIOException5	java.io.IOException
    //   689	1	3	localIOException6	java.io.IOException
    //   697	1	3	localIOException7	java.io.IOException
    //   705	1	3	localFileNotFoundException2	java.io.FileNotFoundException
    //   713	1	3	localFileNotFoundException3	java.io.FileNotFoundException
    //   719	1	3	localFileNotFoundException4	java.io.FileNotFoundException
    //   727	1	3	localFileNotFoundException5	java.io.FileNotFoundException
    //   739	1	3	localFileNotFoundException6	java.io.FileNotFoundException
    //   751	1	3	localFileNotFoundException7	java.io.FileNotFoundException
    //   769	13	3	localObject4	Object
    //   3	420	4	localObject5	Object
    //   496	7	4	localObject6	Object
    //   514	5	4	localObject7	Object
    //   524	5	4	localObject8	Object
    //   534	5	4	localObject9	Object
    //   544	18	4	localObject10	Object
    //   729	51	4	localObject11	Object
    //   111	448	5	localObject12	Object
    //   314	242	6	str	String
    // Exception table:
    //   from	to	target	type
    //   5	30	264	java/io/FileNotFoundException
    //   82	97	264	java/io/FileNotFoundException
    //   5	30	306	java/io/IOException
    //   82	97	306	java/io/IOException
    //   5	30	357	com/tencent/qqmusic/mediaplayer/seektable/mpeg4/boxes/InvalidBoxException
    //   82	97	357	com/tencent/qqmusic/mediaplayer/seektable/mpeg4/boxes/InvalidBoxException
    //   5	30	408	java/lang/Throwable
    //   82	97	408	java/lang/Throwable
    //   5	30	459	finally
    //   82	97	459	finally
    //   30	39	490	finally
    //   39	47	496	finally
    //   97	156	508	finally
    //   169	204	508	finally
    //   217	251	508	finally
    //   156	163	514	finally
    //   204	211	524	finally
    //   251	258	534	finally
    //   271	280	544	finally
    //   322	331	554	finally
    //   373	382	554	finally
    //   424	433	554	finally
    //   30	39	567	java/lang/Throwable
    //   39	47	575	java/lang/Throwable
    //   97	156	581	java/lang/Throwable
    //   169	204	581	java/lang/Throwable
    //   217	251	581	java/lang/Throwable
    //   156	163	589	java/lang/Throwable
    //   204	211	597	java/lang/Throwable
    //   251	258	605	java/lang/Throwable
    //   30	39	613	com/tencent/qqmusic/mediaplayer/seektable/mpeg4/boxes/InvalidBoxException
    //   39	47	621	com/tencent/qqmusic/mediaplayer/seektable/mpeg4/boxes/InvalidBoxException
    //   97	156	627	com/tencent/qqmusic/mediaplayer/seektable/mpeg4/boxes/InvalidBoxException
    //   169	204	627	com/tencent/qqmusic/mediaplayer/seektable/mpeg4/boxes/InvalidBoxException
    //   217	251	627	com/tencent/qqmusic/mediaplayer/seektable/mpeg4/boxes/InvalidBoxException
    //   156	163	635	com/tencent/qqmusic/mediaplayer/seektable/mpeg4/boxes/InvalidBoxException
    //   204	211	643	com/tencent/qqmusic/mediaplayer/seektable/mpeg4/boxes/InvalidBoxException
    //   251	258	651	com/tencent/qqmusic/mediaplayer/seektable/mpeg4/boxes/InvalidBoxException
    //   30	39	659	java/io/IOException
    //   39	47	667	java/io/IOException
    //   97	156	673	java/io/IOException
    //   169	204	673	java/io/IOException
    //   217	251	673	java/io/IOException
    //   156	163	681	java/io/IOException
    //   204	211	689	java/io/IOException
    //   251	258	697	java/io/IOException
    //   30	39	705	java/io/FileNotFoundException
    //   39	47	713	java/io/FileNotFoundException
    //   97	156	719	java/io/FileNotFoundException
    //   169	204	719	java/io/FileNotFoundException
    //   217	251	719	java/io/FileNotFoundException
    //   156	163	727	java/io/FileNotFoundException
    //   204	211	739	java/io/FileNotFoundException
    //   251	258	751	java/io/FileNotFoundException
  }
  
  private boolean decodeEndOrFailed(int paramInt)
  {
    Logger.d("CorePlayer", axiliary("decodeEndOrFaild"));
    int i = paramInt;
    label380:
    label459:
    for (;;)
    {
      try
      {
        if (this.mDecoder != null)
        {
          i = paramInt;
          if (this.mInformation != null)
          {
            Logger.i("CorePlayer", axiliary(String.format("current: %d, duration: %d, isExit: %b, decodeSucc: %b", new Object[] { Long.valueOf(this.mDecoder.getCurrentTime()), Long.valueOf(this.mInformation.getDuration()), Boolean.valueOf(this.mIsExit), Boolean.valueOf(this.mHasDecodeSuccess) })));
            i = paramInt & this.mDecoder.getErrorCodeMask();
          }
        }
        if ((this.mIsExit) || (!this.mHasDecodeSuccess))
        {
          Logger.i("CorePlayer", axiliary("不留痕迹的退出 时机：解码时退出  step = 4"));
          exitNotCallback();
          this.mStateRunner.transfer(Integer.valueOf(9));
          callExceptionCallback(92, 67, i);
          return true;
        }
        if ((getCurPositionByDecoder() <= 0L) || (this.mFileName == null) || (this.mFileName.contains("/qqmusic/")) || (this.mFileName.contains("/com.tencent.qqmusic/"))) {
          break label380;
        }
        Logger.i("CorePlayer", axiliary("Decode ended! Exiting. mFileName = " + this.mFileName + ",is't qqmusic file."));
        if ((this.mInformation != null) && (this.mMediaHTTPManager != null) && (!this.mMediaHTTPManager.isDownloadFinished()))
        {
          paramInt = this.mInformation.getBitrate();
          if (paramInt != 0) {
            break label459;
          }
          paramInt = 320;
          long l2 = getDuration();
          long l1 = l2;
          if (l2 == 0L) {
            l1 = 300000L;
          }
          this.bufferWaitingTime = ((int)getCurPositionByDecoder());
          l2 = this.mMediaHTTPManager.getBufferedFileLength();
          this.bufferWaitingPosition = (getFirstPieceSize(5, paramInt, l1) + l2);
          Logger.i("CorePlayer", "[decodeEndOrFailed] lack of data. setting bufferWaitingPosition to " + this.bufferWaitingPosition);
          return false;
        }
      }
      catch (Throwable localThrowable)
      {
        Logger.e("CorePlayer", localThrowable);
        return true;
      }
      this.mStateRunner.transfer(Integer.valueOf(7));
      return true;
      if (getCurPositionByDecoder() < getDuration() - 5000L)
      {
        Logger.e("CorePlayer", axiliary("Decode failed! Exiting."));
        callExceptionCallback(92, 67, i);
        this.mStateRunner.transfer(Integer.valueOf(6));
        return false;
      }
      Logger.i("CorePlayer", axiliary("Decode ended! Exiting."));
      this.mStateRunner.transfer(Integer.valueOf(7));
      return true;
    }
  }
  
  private void destroyAudioListeners()
  {
    synchronized (this.audioEffects)
    {
      Iterator localIterator1 = this.audioEffects.iterator();
      if (localIterator1.hasNext()) {
        ((IAudioListener)localIterator1.next()).onPlayerStopped();
      }
    }
    synchronized (this.mTerminalAudioEffectList)
    {
      Iterator localIterator2 = this.mTerminalAudioEffectList.iterator();
      if (localIterator2.hasNext()) {
        ((IAudioListener)localIterator2.next()).onPlayerStopped();
      }
    }
  }
  
  private static int getAudioTrackPosition(long paramLong, AudioTrack paramAudioTrack)
  {
    return (int)Math.round((paramAudioTrack.getPlaybackHeadPosition() + paramLong) / paramAudioTrack.getSampleRate() * 1000.0D);
  }
  
  private long getCalcBitMinSize(AudioInformation paramAudioInformation)
  {
    if (paramAudioInformation != null) {
      return ((float)(paramAudioInformation.getSampleRate() * paramAudioInformation.getChannels()) * 2.0F * 5.0F / 1000.0F);
    }
    return 0L;
  }
  
  private static long getFirstPieceSize(int paramInt1, int paramInt2, long paramLong)
  {
    int i = paramInt2;
    if (paramInt2 >= 700) {
      i = paramInt2 + 200;
    }
    if (i > 48) {}
    for (paramLong = paramLong / 1000L / 60L * 10L * 1024L;; paramLong = paramLong / 1000L / 60L * 5L * 1024L) {
      return Math.max(102400L, paramLong + i / 8 * paramInt1 * 1000);
    }
  }
  
  private void handleHighBitdept(BufferInfo paramBufferInfo1, BufferInfo paramBufferInfo2)
  {
    int i = 0;
    if ((paramBufferInfo1 == null) || (paramBufferInfo1.shortBuffer == null) || (paramBufferInfo1.bufferSize <= 0) || (paramBufferInfo2 == null)) {
      return;
    }
    if (this.mInformation.getBitDept() != 3)
    {
      paramBufferInfo1.copy(paramBufferInfo2);
      return;
    }
    for (;;)
    {
      int j;
      try
      {
        int m = paramBufferInfo1.bufferSize;
        paramBufferInfo2.setTempByteBufferCapacity(this.mBuffSize * 2);
        j = 0;
        if (j < m)
        {
          if (j * 2 % 3 == 0) {
            break label175;
          }
          byte[] arrayOfByte = paramBufferInfo2.tempByteBuffer;
          int k = i + 1;
          arrayOfByte[i] = ((byte)paramBufferInfo1.shortBuffer[j]);
          i = k;
          if ((j * 2 + 1) % 3 != 0)
          {
            arrayOfByte = paramBufferInfo2.tempByteBuffer;
            k = i + 1;
            arrayOfByte[i] = ((byte)(paramBufferInfo1.shortBuffer[j] >> 8));
            i = k;
            break label178;
          }
        }
        else
        {
          paramBufferInfo2.fillShort(paramBufferInfo2.tempByteBuffer, i);
          paramBufferInfo2.bufferSize = (i / 2);
          return;
        }
      }
      catch (Throwable paramBufferInfo1)
      {
        Logger.e("CorePlayer", paramBufferInfo1);
        return;
      }
      break label178;
      label175:
      continue;
      label178:
      j += 1;
    }
  }
  
  private void handleHighSample(BufferInfo paramBufferInfo1, BufferInfo paramBufferInfo2)
  {
    if ((paramBufferInfo1 == null) || (paramBufferInfo1.shortBuffer == null) || (paramBufferInfo1.bufferSize <= 0) || (paramBufferInfo2 == null)) {
      return;
    }
    if (this.mInformation.getSampleRate() == this.mPlaySample)
    {
      paramBufferInfo1.copy(paramBufferInfo2);
      return;
    }
    try
    {
      ReSample.reSample(paramBufferInfo1, paramBufferInfo2, this.mInformation.getSampleRate(), this.mPlaySample);
      return;
    }
    catch (Throwable paramBufferInfo1)
    {
      Logger.e("CorePlayer", paramBufferInfo1);
    }
  }
  
  private void initAudioListeners(long paramLong, int paramInt1, int paramInt2)
  {
    synchronized (this.audioEffects)
    {
      Iterator localIterator1 = this.audioEffects.iterator();
      if (localIterator1.hasNext()) {
        ((IAudioListener)localIterator1.next()).onPlayerReady(paramLong, paramInt1, paramInt2);
      }
    }
    synchronized (this.mTerminalAudioEffectList)
    {
      Iterator localIterator2 = this.mTerminalAudioEffectList.iterator();
      if (localIterator2.hasNext()) {
        ((IAudioListener)localIterator2.next()).onPlayerReady(paramLong, paramInt1, paramInt2);
      }
    }
  }
  
  private void initHandler()
  {
    if (this.mHandler == null)
    {
      this.mHandler = new Handler(Looper.getMainLooper());
      Logger.e("CorePlayer", "initHandler mHandler with getMainLooper");
    }
  }
  
  private void initThreadHandler()
  {
    try
    {
      Logger.i("CorePlayer", "static initializer CommonPlayer_Handler");
      new Thread("CommonPlayer_Handler")
      {
        public void run()
        {
          super.run();
          Logger.i("CorePlayer", "CommonPlayer_Handler thread is run");
          Looper.prepare();
          CorePlayer.this.mHandler = new Handler(Looper.myLooper());
          Looper.loop();
        }
      }.start();
      return;
    }
    catch (Throwable localThrowable)
    {
      Logger.e("CorePlayer", localThrowable);
    }
  }
  
  private boolean isCompleted()
  {
    try
    {
      boolean bool = this.mStateRunner.isEqual(new Integer[] { Integer.valueOf(7) });
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private boolean isError()
  {
    try
    {
      boolean bool = this.mStateRunner.isEqual(new Integer[] { Integer.valueOf(9) });
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private boolean isIdle()
  {
    try
    {
      boolean bool = this.mStateRunner.isEqual(new Integer[] { Integer.valueOf(0) });
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private boolean isStopped()
  {
    try
    {
      boolean bool = this.mStateRunner.isEqual(new Integer[] { Integer.valueOf(6) });
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void notifySeekCompleteForAudioListeners(long paramLong)
  {
    synchronized (this.audioEffects)
    {
      Iterator localIterator1 = this.audioEffects.iterator();
      if (localIterator1.hasNext()) {
        ((IAudioListener)localIterator1.next()).onPlayerSeekComplete(paramLong);
      }
    }
    synchronized (this.mTerminalAudioEffectList)
    {
      Iterator localIterator2 = this.mTerminalAudioEffectList.iterator();
      if (localIterator2.hasNext()) {
        ((IAudioListener)localIterator2.next()).onPlayerSeekComplete(paramLong);
      }
    }
  }
  
  private void postRunnable(Runnable paramRunnable, int paramInt)
  {
    if (this.mHandler == null)
    {
      Logger.e("CorePlayer", "postRunnable mHandler == null");
      initHandler();
    }
    if (this.mHandler != null) {
      this.mHandler.postDelayed(paramRunnable, paramInt);
    }
  }
  
  private static boolean processAudioListener(IAudioListener paramIAudioListener, BufferInfo paramBufferInfo1, BufferInfo paramBufferInfo2)
  {
    try
    {
      paramBufferInfo2.setShortBufferCapacity(paramBufferInfo1.bufferSize);
      boolean bool = paramIAudioListener.onPcm(paramBufferInfo1, paramBufferInfo2);
      return bool;
    }
    catch (Throwable paramBufferInfo1)
    {
      Logger.e("CorePlayer", "[processAudioListener] failed. audio: " + paramIAudioListener, paramBufferInfo1);
    }
    return false;
  }
  
  private static void safeClose(Closeable... paramVarArgs)
  {
    int j = paramVarArgs.length;
    int i = 0;
    for (;;)
    {
      if (i < j)
      {
        Closeable localCloseable = paramVarArgs[i];
        if (localCloseable != null) {}
        try
        {
          localCloseable.close();
          i += 1;
        }
        catch (Throwable localThrowable)
        {
          for (;;)
          {
            Logger.e("CorePlayer", "[safeClose] failed.", localThrowable);
          }
        }
      }
    }
  }
  
  void addAudioListener(IAudioListener paramIAudioListener)
  {
    if (paramIAudioListener.isTerminal()) {
      synchronized (this.mTerminalAudioEffectList)
      {
        if (!this.mTerminalAudioEffectList.contains(paramIAudioListener))
        {
          this.mTerminalAudioEffectList.add(paramIAudioListener);
          Logger.i("CorePlayer", "[addAudioListener] terminal audio added: " + paramIAudioListener);
        }
        if ((this.mInformation == null) || (this.mInformation.getPlaySample() <= 0L) || (this.mInformation.getChannels() <= 0)) {
          break label258;
        }
      }
    }
    try
    {
      l = paramIAudioListener.onPlayerReady(this.mInformation.getPlaySample(), this.mInformation.getBitDept(), this.mInformation.getChannels());
      if (l != 0L) {
        Logger.e("CorePlayer", "[addAudioListener] failed to init audio %s, ret: %d", new Object[] { paramIAudioListener, Long.valueOf(l) });
      }
      return;
      paramIAudioListener = finally;
      throw paramIAudioListener;
      synchronized (this.audioEffects)
      {
        if (!this.audioEffects.contains(paramIAudioListener))
        {
          this.audioEffects.add(paramIAudioListener);
          Logger.i("CorePlayer", "[addAudioListener] audio added: " + paramIAudioListener);
        }
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        Logger.e("CorePlayer", "[addAudioListener] failed to init audio: " + paramIAudioListener, localThrowable);
        long l = 0L;
      }
    }
    label258:
    Logger.i("CorePlayer", "[addAudioListener] audio information not ready. init will be delayed.");
  }
  
  public void addSeekRecord(int paramInt)
  {
    synchronized (this.mSeekRecord)
    {
      Logger.i("CorePlayer", "add seek: " + paramInt);
      this.mSeekRecord.push(Integer.valueOf(paramInt));
      return;
    }
  }
  
  public void callExceptionCallback(int paramInt1, int paramInt2)
  {
    callExceptionCallback(paramInt1, paramInt2, 0);
  }
  
  void changePlayThreadPriorityImmediately()
  {
    Logger.d("CorePlayer", axiliary("changePlayThreadPriorityImmediately"));
    this.mNeedChangePlayThreadPriority = true;
  }
  
  void copyPlayerStatus(CorePlayer paramCorePlayer) {}
  
  void exitNotCallback()
  {
    Logger.i("CorePlayer", axiliary("exitNotCallback"));
    this.mIsExit = true;
  }
  
  void flush()
  {
    this.mNeedFlush = true;
  }
  
  int getBufferedPercentage()
  {
    if ((this.mMediaHTTPManager != null) && (this.mFileLength > 0L)) {
      return (int)Math.round(this.mMediaHTTPManager.getBufferedFileLength() / this.mFileLength * 100.0D);
    }
    return 100;
  }
  
  long getCurPosition()
  {
    if (this.mDecoder == null) {
      return this.mCurPosition;
    }
    if (this.isBuffering) {
      return this.mCurPosition;
    }
    if ((isPlaying()) || (isCompleted())) {
      this.mCurPosition = this.mTimer.getTimeInMs();
    }
    return this.mCurPosition;
  }
  
  long getCurPositionByDecoder()
  {
    if (this.mDecoder == null) {
      return this.mCurPosition;
    }
    try
    {
      long l = this.mDecoder.getCurrentTime();
      return l;
    }
    catch (SoNotFindException localSoNotFindException)
    {
      Logger.e("CorePlayer", localSoNotFindException);
      return 0L;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        Logger.e("CorePlayer", "Strange Exception!", localThrowable);
      }
    }
  }
  
  AudioInformation getCurrentAudioInformation()
  {
    if (this.mInformation != null) {
      this.mInformation.setAudioType(this.mAudioType);
    }
    return this.mInformation;
  }
  
  long getDuration()
  {
    if (this.mInformation != null) {
      try
      {
        long l = this.mInformation.getDuration();
        return l;
      }
      catch (Throwable localThrowable)
      {
        Logger.e("CorePlayer", localThrowable);
      }
    }
    return 0L;
  }
  
  public long getFileOffsetAndUpdateAdjustLength(long paramLong, int paramInt)
  {
    long l2 = -1L;
    long l1 = l2;
    if (this.mSeekTable != null) {}
    try
    {
      l1 = this.mSeekTable.seek(paramLong);
      int i = paramInt;
      if (paramInt <= 0)
      {
        l2 = getDuration() / 1000L;
        i = paramInt;
        if (l2 > 0L) {
          i = (int)(this.mFileLength * 8.0D / 1024.0D / l2);
        }
      }
      if (l1 < 0L)
      {
        paramLong = getFirstPieceSize((int)(paramLong / 1000L), i, getDuration());
        this.mAdjustLength = (i / 8 * 15 * 1000);
        return paramLong;
      }
      this.mAdjustLength = (i / 8 * 2 * 1000);
      return l1;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        l1 = l2;
      }
    }
  }
  
  int getPlayerState()
  {
    return ((Integer)this.mStateRunner.get()).intValue();
  }
  
  String getPlayingFilePath()
  {
    return this.mFileName;
  }
  
  int getSessionId()
  {
    if ((this.mAudioTrack != null) && (Build.VERSION.SDK_INT >= 9)) {
      return this.mAudioTrack.getAudioSessionId();
    }
    return 0;
  }
  
  boolean hasDecodeData()
  {
    try
    {
      boolean bool = this.mHasDecode;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  boolean hasDecodeDataSuccess()
  {
    try
    {
      boolean bool = this.mHasDecodeSuccess;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  boolean isCreateAudioTrackFail()
  {
    return this.mCreateAudioTrackFail;
  }
  
  boolean isDownloadFinished()
  {
    return (this.mMediaHTTPManager == null) || (this.mMediaHTTPManager.isDownloadFinished());
  }
  
  boolean isInit()
  {
    return this.mHasInit;
  }
  
  public boolean isPaused()
  {
    try
    {
      boolean bool = this.mStateRunner.isEqual(new Integer[] { Integer.valueOf(5) });
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean isPlaying()
  {
    try
    {
      boolean bool = this.mStateRunner.isEqual(new Integer[] { Integer.valueOf(4) });
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void notifyDownloadProgress(long paramLong1, long paramLong2)
  {
    synchronized (this.bufferLock)
    {
      if (this.bufferWaitingPosition == 0L) {
        return;
      }
      if ((paramLong1 >= this.bufferWaitingPosition) || (paramLong1 == paramLong2 - 1L))
      {
        Logger.i("CorePlayer", "[onBufferProgress] notify buffer position: " + this.bufferWaitingPosition);
        this.bufferLock.notifyAll();
      }
      return;
    }
  }
  
  void pause()
  {
    Logger.i("CorePlayer", axiliary("pause"));
    this.mStateRunner.transfer(Integer.valueOf(5), new Integer[] { Integer.valueOf(4), Integer.valueOf(2) });
  }
  
  void play()
  {
    Logger.i("CorePlayer", axiliary("play"));
    this.mTimer.refreshTimeInMs(this.mCurPosition);
    this.mStateRunner.transfer(Integer.valueOf(4));
    if (this.mSignalControl.isWaiting())
    {
      Logger.d("CorePlayer", axiliary("lock is Waiting, event: play, doNotify"));
      this.mSignalControl.doNotify();
    }
  }
  
  public void prepare()
  {
    Logger.i("CorePlayer", axiliary("prepare"));
    this.mStateRunner.transfer(Integer.valueOf(3));
    if (this.mMediaHTTPManager != null)
    {
      this.mMediaHTTPManager.prepare();
      return;
    }
    new Thread(this, "decoder-" + this.mThreadName).start();
  }
  
  void processAudioListeners(BufferInfo paramBufferInfo1, BufferInfo paramBufferInfo2)
  {
    for (;;)
    {
      Object localObject1;
      Object localObject2;
      synchronized (this.audioEffects)
      {
        if (this.audioEffects.size() == 0)
        {
          paramBufferInfo1.copy(paramBufferInfo2);
          return;
        }
        Iterator localIterator = this.audioEffects.iterator();
        localObject1 = paramBufferInfo2;
        localObject2 = paramBufferInfo1;
        if (!localIterator.hasNext()) {
          break label129;
        }
        Object localObject3 = (IAudioListener)localIterator.next();
        if (((IAudioListener)localObject3).isEnabled())
        {
          if (processAudioListener((IAudioListener)localObject3, (BufferInfo)localObject2, (BufferInfo)localObject1))
          {
            localObject3 = localObject1;
            localObject1 = localObject2;
            localObject2 = localObject3;
            continue;
          }
          ((BufferInfo)localObject2).copy((BufferInfo)localObject1);
        }
      }
      ((BufferInfo)localObject2).copy((BufferInfo)localObject1);
      continue;
      label129:
      if (localObject2 == paramBufferInfo1) {
        paramBufferInfo1.copy(paramBufferInfo2);
      }
    }
  }
  
  public void refreshTimeAndNotify(int paramInt)
  {
    this.mTimer.refreshTimeInMs(paramInt);
    if (this.mSignalControl.isWaiting())
    {
      Logger.d("CorePlayer", axiliary("lock is Waiting, event: seek, doNotify"));
      this.mSignalControl.doNotify();
    }
  }
  
  public void release()
  {
    Logger.i("CorePlayer", axiliary("release"));
    if (this.mMediaHTTPManager != null) {
      this.mMediaHTTPManager.release();
    }
    if (this.mOnlineSeekHandler != null) {
      this.mOnlineSeekHandler.removeCallbacksAndMessages(null);
    }
    Looper localLooper;
    if (this.mOnlineSeekHandlerThread != null)
    {
      if (Build.VERSION.SDK_INT >= 19) {
        this.mOnlineSeekHandlerThread.quitSafely();
      }
    }
    else if (this.mHandler != null)
    {
      localLooper = this.mHandler.getLooper();
      if (localLooper != null)
      {
        if (Build.VERSION.SDK_INT < 19) {
          break label153;
        }
        localLooper.quitSafely();
      }
    }
    for (;;)
    {
      exitNotCallback();
      if (this.mSignalControl.isWaiting())
      {
        Logger.d("CorePlayer", axiliary("lock is Waiting, event: release, doNotify"));
        this.mSignalControl.doNotify();
      }
      this.mStateRunner.transfer(Integer.valueOf(8));
      return;
      this.mOnlineSeekHandlerThread.quit();
      break;
      label153:
      localLooper.quit();
    }
  }
  
  void removeAudioListener(IAudioListener paramIAudioListener)
  {
    synchronized (this.audioEffects)
    {
      if (this.audioEffects.remove(paramIAudioListener)) {
        Logger.i("CorePlayer", "[removeAudioListener] audio removed: " + paramIAudioListener);
      }
    }
    synchronized (this.mTerminalAudioEffectList)
    {
      if (this.mTerminalAudioEffectList.remove(paramIAudioListener)) {
        Logger.i("CorePlayer", "[removeAudioListener] terminal audio removed: " + paramIAudioListener);
      }
      return;
      paramIAudioListener = finally;
      throw paramIAudioListener;
    }
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: invokestatic 994	com/tencent/qqmusic/mediaplayer/util/CpuInfoUtil:startProcessInfoOutput	()V
    //   3: ldc 51
    //   5: aload_0
    //   6: new 325	java/lang/StringBuilder
    //   9: dup
    //   10: ldc_w 996
    //   13: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   16: invokestatic 1000	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   19: invokevirtual 1003	java/lang/Thread:getName	()Ljava/lang/String;
    //   22: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   28: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   31: invokestatic 350	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   34: invokestatic 507	com/tencent/qqmusic/mediaplayer/PlayerConfigManager:getInstance	()Lcom/tencent/qqmusic/mediaplayer/PlayerConfigManager;
    //   37: invokevirtual 1006	com/tencent/qqmusic/mediaplayer/PlayerConfigManager:changeDecodeThreadPriorityIfNeed	()V
    //   40: aload_0
    //   41: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   44: astore 20
    //   46: aload 20
    //   48: ifnull +881 -> 929
    //   51: aload_0
    //   52: getfield 251	com/tencent/qqmusic/mediaplayer/CorePlayer:mCallback	Lcom/tencent/qqmusic/mediaplayer/PlayerCallback;
    //   55: invokeinterface 1009 1 0
    //   60: aload_0
    //   61: getfield 309	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   64: ifnull +222 -> 286
    //   67: aload_0
    //   68: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   71: aload_0
    //   72: getfield 309	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   75: invokevirtual 1012	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:init	(Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;)I
    //   78: istore_1
    //   79: ldc 51
    //   81: aload_0
    //   82: new 325	java/lang/StringBuilder
    //   85: dup
    //   86: ldc_w 1014
    //   89: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   92: iload_1
    //   93: invokevirtual 359	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   96: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   99: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   102: invokestatic 350	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   105: iload_1
    //   106: ifeq +758 -> 864
    //   109: aload_0
    //   110: getfield 175	com/tencent/qqmusic/mediaplayer/CorePlayer:mIsExit	Z
    //   113: ifne +751 -> 864
    //   116: ldc 51
    //   118: aload_0
    //   119: ldc_w 1016
    //   122: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   125: invokestatic 384	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   128: aload_0
    //   129: getfield 161	com/tencent/qqmusic/mediaplayer/CorePlayer:mStateRunner	Lcom/tencent/qqmusic/mediaplayer/StateRunner;
    //   132: bipush 9
    //   134: invokestatic 156	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   137: invokevirtual 323	com/tencent/qqmusic/mediaplayer/StateRunner:transfer	(Ljava/lang/Object;)Ljava/lang/Object;
    //   140: pop
    //   141: aload_0
    //   142: bipush 91
    //   144: bipush 62
    //   146: invokevirtual 387	com/tencent/qqmusic/mediaplayer/CorePlayer:callExceptionCallback	(II)V
    //   149: ldc 51
    //   151: aload_0
    //   152: new 325	java/lang/StringBuilder
    //   155: dup
    //   156: ldc_w 1018
    //   159: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   162: aload_0
    //   163: getfield 175	com/tencent/qqmusic/mediaplayer/CorePlayer:mIsExit	Z
    //   166: invokevirtual 1021	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   169: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   172: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   175: invokestatic 350	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   178: aload_0
    //   179: getfield 192	com/tencent/qqmusic/mediaplayer/CorePlayer:monitor	Lcom/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor;
    //   182: ifnull +10 -> 192
    //   185: aload_0
    //   186: getfield 192	com/tencent/qqmusic/mediaplayer/CorePlayer:monitor	Lcom/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor;
    //   189: invokevirtual 1026	com/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor:stop	()V
    //   192: invokestatic 1029	com/tencent/qqmusic/mediaplayer/util/CpuInfoUtil:stopProcessInfoOutput	()V
    //   195: aload_0
    //   196: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   199: ifnull +16 -> 215
    //   202: aload_0
    //   203: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   206: invokevirtual 550	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   209: pop
    //   210: aload_0
    //   211: aconst_null
    //   212: putfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   215: aload_0
    //   216: getfield 309	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   219: ifnull +12 -> 231
    //   222: aload_0
    //   223: getfield 309	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   226: invokeinterface 1032 1 0
    //   231: aload_0
    //   232: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   235: ifnull +50 -> 285
    //   238: aload_0
    //   239: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   242: invokevirtual 1033	android/media/AudioTrack:stop	()V
    //   245: aload_0
    //   246: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   249: invokevirtual 1035	android/media/AudioTrack:flush	()V
    //   252: aload_0
    //   253: lconst_0
    //   254: putfield 196	com/tencent/qqmusic/mediaplayer/CorePlayer:mCurrentFrameCount	J
    //   257: aload_0
    //   258: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   261: invokevirtual 517	android/media/AudioTrack:release	()V
    //   264: aload_0
    //   265: invokespecial 1037	com/tencent/qqmusic/mediaplayer/CorePlayer:destroyAudioListeners	()V
    //   268: aload_0
    //   269: aconst_null
    //   270: putfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   273: ldc 51
    //   275: aload_0
    //   276: ldc_w 1039
    //   279: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   282: invokestatic 376	com/tencent/qqmusic/mediaplayer/util/Logger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   285: return
    //   286: aload_0
    //   287: getfield 311	com/tencent/qqmusic/mediaplayer/CorePlayer:mNativeDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/INativeDataSource;
    //   290: ifnull +266 -> 556
    //   293: aload_0
    //   294: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   297: aload_0
    //   298: getfield 311	com/tencent/qqmusic/mediaplayer/CorePlayer:mNativeDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/INativeDataSource;
    //   301: invokevirtual 1042	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:init	(Lcom/tencent/qqmusic/mediaplayer/upstream/INativeDataSource;)I
    //   304: istore_1
    //   305: ldc 51
    //   307: aload_0
    //   308: new 325	java/lang/StringBuilder
    //   311: dup
    //   312: ldc_w 1044
    //   315: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   318: iload_1
    //   319: invokevirtual 359	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   322: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   325: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   328: invokestatic 350	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   331: goto -226 -> 105
    //   334: astore 20
    //   336: bipush 62
    //   338: istore_1
    //   339: aload 20
    //   341: instanceof 372
    //   344: ifeq +6 -> 350
    //   347: bipush 69
    //   349: istore_1
    //   350: aload_0
    //   351: getfield 175	com/tencent/qqmusic/mediaplayer/CorePlayer:mIsExit	Z
    //   354: ifne +58 -> 412
    //   357: ldc 51
    //   359: aload_0
    //   360: new 325	java/lang/StringBuilder
    //   363: dup
    //   364: ldc_w 1046
    //   367: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   370: aload_0
    //   371: getfield 267	com/tencent/qqmusic/mediaplayer/CorePlayer:mFileName	Ljava/lang/String;
    //   374: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   377: ldc_w 1048
    //   380: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   383: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   386: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   389: invokestatic 384	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   392: aload_0
    //   393: getfield 161	com/tencent/qqmusic/mediaplayer/CorePlayer:mStateRunner	Lcom/tencent/qqmusic/mediaplayer/StateRunner;
    //   396: bipush 9
    //   398: invokestatic 156	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   401: invokevirtual 323	com/tencent/qqmusic/mediaplayer/StateRunner:transfer	(Ljava/lang/Object;)Ljava/lang/Object;
    //   404: pop
    //   405: aload_0
    //   406: bipush 91
    //   408: iload_1
    //   409: invokevirtual 387	com/tencent/qqmusic/mediaplayer/CorePlayer:callExceptionCallback	(II)V
    //   412: ldc 51
    //   414: aload 20
    //   416: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   419: ldc 51
    //   421: aload_0
    //   422: new 325	java/lang/StringBuilder
    //   425: dup
    //   426: ldc_w 1018
    //   429: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   432: aload_0
    //   433: getfield 175	com/tencent/qqmusic/mediaplayer/CorePlayer:mIsExit	Z
    //   436: invokevirtual 1021	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   439: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   442: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   445: invokestatic 350	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   448: aload_0
    //   449: getfield 192	com/tencent/qqmusic/mediaplayer/CorePlayer:monitor	Lcom/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor;
    //   452: ifnull +10 -> 462
    //   455: aload_0
    //   456: getfield 192	com/tencent/qqmusic/mediaplayer/CorePlayer:monitor	Lcom/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor;
    //   459: invokevirtual 1026	com/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor:stop	()V
    //   462: invokestatic 1029	com/tencent/qqmusic/mediaplayer/util/CpuInfoUtil:stopProcessInfoOutput	()V
    //   465: aload_0
    //   466: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   469: ifnull +16 -> 485
    //   472: aload_0
    //   473: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   476: invokevirtual 550	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   479: pop
    //   480: aload_0
    //   481: aconst_null
    //   482: putfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   485: aload_0
    //   486: getfield 309	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   489: ifnull +12 -> 501
    //   492: aload_0
    //   493: getfield 309	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   496: invokeinterface 1032 1 0
    //   501: aload_0
    //   502: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   505: ifnull -220 -> 285
    //   508: aload_0
    //   509: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   512: invokevirtual 1033	android/media/AudioTrack:stop	()V
    //   515: aload_0
    //   516: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   519: invokevirtual 1035	android/media/AudioTrack:flush	()V
    //   522: aload_0
    //   523: lconst_0
    //   524: putfield 196	com/tencent/qqmusic/mediaplayer/CorePlayer:mCurrentFrameCount	J
    //   527: aload_0
    //   528: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   531: invokevirtual 517	android/media/AudioTrack:release	()V
    //   534: aload_0
    //   535: invokespecial 1037	com/tencent/qqmusic/mediaplayer/CorePlayer:destroyAudioListeners	()V
    //   538: aload_0
    //   539: aconst_null
    //   540: putfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   543: ldc 51
    //   545: aload_0
    //   546: ldc_w 1039
    //   549: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   552: invokestatic 376	com/tencent/qqmusic/mediaplayer/util/Logger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   555: return
    //   556: aload_0
    //   557: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   560: aload_0
    //   561: getfield 267	com/tencent/qqmusic/mediaplayer/CorePlayer:mFileName	Ljava/lang/String;
    //   564: iconst_0
    //   565: invokevirtual 564	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:init	(Ljava/lang/String;Z)I
    //   568: istore_1
    //   569: ldc 51
    //   571: aload_0
    //   572: new 325	java/lang/StringBuilder
    //   575: dup
    //   576: ldc_w 1050
    //   579: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   582: iload_1
    //   583: invokevirtual 359	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   586: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   589: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   592: invokestatic 350	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   595: goto -490 -> 105
    //   598: astore 20
    //   600: ldc 51
    //   602: aload_0
    //   603: new 325	java/lang/StringBuilder
    //   606: dup
    //   607: ldc_w 1018
    //   610: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   613: aload_0
    //   614: getfield 175	com/tencent/qqmusic/mediaplayer/CorePlayer:mIsExit	Z
    //   617: invokevirtual 1021	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   620: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   623: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   626: invokestatic 350	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   629: aload_0
    //   630: getfield 192	com/tencent/qqmusic/mediaplayer/CorePlayer:monitor	Lcom/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor;
    //   633: ifnull +10 -> 643
    //   636: aload_0
    //   637: getfield 192	com/tencent/qqmusic/mediaplayer/CorePlayer:monitor	Lcom/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor;
    //   640: invokevirtual 1026	com/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor:stop	()V
    //   643: invokestatic 1029	com/tencent/qqmusic/mediaplayer/util/CpuInfoUtil:stopProcessInfoOutput	()V
    //   646: aload_0
    //   647: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   650: ifnull +16 -> 666
    //   653: aload_0
    //   654: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   657: invokevirtual 550	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   660: pop
    //   661: aload_0
    //   662: aconst_null
    //   663: putfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   666: aload_0
    //   667: getfield 309	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   670: ifnull +12 -> 682
    //   673: aload_0
    //   674: getfield 309	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   677: invokeinterface 1032 1 0
    //   682: aload_0
    //   683: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   686: ifnull +50 -> 736
    //   689: aload_0
    //   690: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   693: invokevirtual 1033	android/media/AudioTrack:stop	()V
    //   696: aload_0
    //   697: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   700: invokevirtual 1035	android/media/AudioTrack:flush	()V
    //   703: aload_0
    //   704: lconst_0
    //   705: putfield 196	com/tencent/qqmusic/mediaplayer/CorePlayer:mCurrentFrameCount	J
    //   708: aload_0
    //   709: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   712: invokevirtual 517	android/media/AudioTrack:release	()V
    //   715: aload_0
    //   716: invokespecial 1037	com/tencent/qqmusic/mediaplayer/CorePlayer:destroyAudioListeners	()V
    //   719: aload_0
    //   720: aconst_null
    //   721: putfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   724: ldc 51
    //   726: aload_0
    //   727: ldc_w 1039
    //   730: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   733: invokestatic 376	com/tencent/qqmusic/mediaplayer/util/Logger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   736: aload 20
    //   738: athrow
    //   739: astore 20
    //   741: ldc 51
    //   743: aload_0
    //   744: new 325	java/lang/StringBuilder
    //   747: dup
    //   748: ldc_w 1052
    //   751: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   754: aload 20
    //   756: invokevirtual 1055	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   759: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   762: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   765: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   768: aload 20
    //   770: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   773: goto -558 -> 215
    //   776: astore 20
    //   778: ldc 51
    //   780: aload_0
    //   781: new 325	java/lang/StringBuilder
    //   784: dup
    //   785: ldc_w 1057
    //   788: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   791: aload 20
    //   793: invokevirtual 1058	java/io/IOException:getMessage	()Ljava/lang/String;
    //   796: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   799: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   802: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   805: aload 20
    //   807: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   810: goto -579 -> 231
    //   813: astore 20
    //   815: ldc 51
    //   817: aload 20
    //   819: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   822: goto -577 -> 245
    //   825: astore 20
    //   827: ldc 51
    //   829: aload 20
    //   831: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   834: goto -582 -> 252
    //   837: astore 20
    //   839: ldc 51
    //   841: aload 20
    //   843: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   846: goto -582 -> 264
    //   849: astore 20
    //   851: ldc 51
    //   853: ldc_w 1060
    //   856: aload 20
    //   858: invokestatic 1062	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   861: goto -593 -> 268
    //   864: aload_0
    //   865: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   868: instanceof 448
    //   871: ifeq +17 -> 888
    //   874: aload_0
    //   875: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   878: checkcast 448	com/tencent/qqmusic/mediaplayer/codec/mp3/MP3Decoder
    //   881: aload_0
    //   882: getfield 240	com/tencent/qqmusic/mediaplayer/CorePlayer:mFileLength	J
    //   885: invokevirtual 1065	com/tencent/qqmusic/mediaplayer/codec/mp3/MP3Decoder:setFileTotalLength	(J)V
    //   888: aload_0
    //   889: aload_0
    //   890: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   893: invokevirtual 568	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:getAudioInformation	()Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   896: putfield 389	com/tencent/qqmusic/mediaplayer/CorePlayer:mInformation	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   899: aload_0
    //   900: getfield 389	com/tencent/qqmusic/mediaplayer/CorePlayer:mInformation	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   903: ifnull +15 -> 918
    //   906: lconst_0
    //   907: aload_0
    //   908: getfield 389	com/tencent/qqmusic/mediaplayer/CorePlayer:mInformation	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   911: invokevirtual 395	com/tencent/qqmusic/mediaplayer/AudioInformation:getSampleRate	()J
    //   914: lcmp
    //   915: ifne +14 -> 929
    //   918: aload_0
    //   919: aload_0
    //   920: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   923: invokevirtual 568	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:getAudioInformation	()Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   926: putfield 389	com/tencent/qqmusic/mediaplayer/CorePlayer:mInformation	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   929: aload_0
    //   930: getfield 389	com/tencent/qqmusic/mediaplayer/CorePlayer:mInformation	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   933: ifnull +1294 -> 2227
    //   936: aload_0
    //   937: getfield 175	com/tencent/qqmusic/mediaplayer/CorePlayer:mIsExit	Z
    //   940: istore 7
    //   942: iload 7
    //   944: ifne +1283 -> 2227
    //   947: lconst_0
    //   948: aload_0
    //   949: getfield 389	com/tencent/qqmusic/mediaplayer/CorePlayer:mInformation	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   952: invokevirtual 395	com/tencent/qqmusic/mediaplayer/AudioInformation:getSampleRate	()J
    //   955: lcmp
    //   956: ifne +419 -> 1375
    //   959: ldc 51
    //   961: ldc_w 1067
    //   964: invokestatic 384	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   967: aload_0
    //   968: getfield 161	com/tencent/qqmusic/mediaplayer/CorePlayer:mStateRunner	Lcom/tencent/qqmusic/mediaplayer/StateRunner;
    //   971: bipush 9
    //   973: invokestatic 156	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   976: invokevirtual 323	com/tencent/qqmusic/mediaplayer/StateRunner:transfer	(Ljava/lang/Object;)Ljava/lang/Object;
    //   979: pop
    //   980: aload_0
    //   981: bipush 91
    //   983: bipush 63
    //   985: invokevirtual 387	com/tencent/qqmusic/mediaplayer/CorePlayer:callExceptionCallback	(II)V
    //   988: ldc 51
    //   990: aload_0
    //   991: new 325	java/lang/StringBuilder
    //   994: dup
    //   995: ldc_w 1018
    //   998: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1001: aload_0
    //   1002: getfield 175	com/tencent/qqmusic/mediaplayer/CorePlayer:mIsExit	Z
    //   1005: invokevirtual 1021	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   1008: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1011: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   1014: invokestatic 350	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1017: aload_0
    //   1018: getfield 192	com/tencent/qqmusic/mediaplayer/CorePlayer:monitor	Lcom/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor;
    //   1021: ifnull +10 -> 1031
    //   1024: aload_0
    //   1025: getfield 192	com/tencent/qqmusic/mediaplayer/CorePlayer:monitor	Lcom/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor;
    //   1028: invokevirtual 1026	com/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor:stop	()V
    //   1031: invokestatic 1029	com/tencent/qqmusic/mediaplayer/util/CpuInfoUtil:stopProcessInfoOutput	()V
    //   1034: aload_0
    //   1035: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   1038: ifnull +16 -> 1054
    //   1041: aload_0
    //   1042: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   1045: invokevirtual 550	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   1048: pop
    //   1049: aload_0
    //   1050: aconst_null
    //   1051: putfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   1054: aload_0
    //   1055: getfield 309	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   1058: ifnull +12 -> 1070
    //   1061: aload_0
    //   1062: getfield 309	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   1065: invokeinterface 1032 1 0
    //   1070: aload_0
    //   1071: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   1074: ifnull -789 -> 285
    //   1077: aload_0
    //   1078: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   1081: invokevirtual 1033	android/media/AudioTrack:stop	()V
    //   1084: aload_0
    //   1085: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   1088: invokevirtual 1035	android/media/AudioTrack:flush	()V
    //   1091: aload_0
    //   1092: lconst_0
    //   1093: putfield 196	com/tencent/qqmusic/mediaplayer/CorePlayer:mCurrentFrameCount	J
    //   1096: aload_0
    //   1097: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   1100: invokevirtual 517	android/media/AudioTrack:release	()V
    //   1103: aload_0
    //   1104: invokespecial 1037	com/tencent/qqmusic/mediaplayer/CorePlayer:destroyAudioListeners	()V
    //   1107: aload_0
    //   1108: aconst_null
    //   1109: putfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   1112: ldc 51
    //   1114: aload_0
    //   1115: ldc_w 1039
    //   1118: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   1121: invokestatic 376	com/tencent/qqmusic/mediaplayer/util/Logger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1124: return
    //   1125: astore 20
    //   1127: ldc 51
    //   1129: aload_0
    //   1130: new 325	java/lang/StringBuilder
    //   1133: dup
    //   1134: ldc_w 1052
    //   1137: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1140: aload 20
    //   1142: invokevirtual 1055	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   1145: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1148: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1151: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   1154: aload 20
    //   1156: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1159: goto -674 -> 485
    //   1162: astore 20
    //   1164: ldc 51
    //   1166: aload_0
    //   1167: new 325	java/lang/StringBuilder
    //   1170: dup
    //   1171: ldc_w 1057
    //   1174: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1177: aload 20
    //   1179: invokevirtual 1058	java/io/IOException:getMessage	()Ljava/lang/String;
    //   1182: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1185: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1188: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   1191: aload 20
    //   1193: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1196: goto -695 -> 501
    //   1199: astore 20
    //   1201: ldc 51
    //   1203: aload 20
    //   1205: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1208: goto -693 -> 515
    //   1211: astore 20
    //   1213: ldc 51
    //   1215: aload 20
    //   1217: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1220: goto -698 -> 522
    //   1223: astore 20
    //   1225: ldc 51
    //   1227: aload 20
    //   1229: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1232: goto -698 -> 534
    //   1235: astore 20
    //   1237: ldc 51
    //   1239: ldc_w 1060
    //   1242: aload 20
    //   1244: invokestatic 1062	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1247: goto -709 -> 538
    //   1250: astore 20
    //   1252: ldc 51
    //   1254: aload_0
    //   1255: new 325	java/lang/StringBuilder
    //   1258: dup
    //   1259: ldc_w 1052
    //   1262: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1265: aload 20
    //   1267: invokevirtual 1055	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   1270: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1273: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1276: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   1279: aload 20
    //   1281: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1284: goto -230 -> 1054
    //   1287: astore 20
    //   1289: ldc 51
    //   1291: aload_0
    //   1292: new 325	java/lang/StringBuilder
    //   1295: dup
    //   1296: ldc_w 1057
    //   1299: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1302: aload 20
    //   1304: invokevirtual 1058	java/io/IOException:getMessage	()Ljava/lang/String;
    //   1307: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1310: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1313: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   1316: aload 20
    //   1318: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1321: goto -251 -> 1070
    //   1324: astore 20
    //   1326: ldc 51
    //   1328: aload 20
    //   1330: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1333: goto -249 -> 1084
    //   1336: astore 20
    //   1338: ldc 51
    //   1340: aload 20
    //   1342: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1345: goto -254 -> 1091
    //   1348: astore 20
    //   1350: ldc 51
    //   1352: aload 20
    //   1354: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1357: goto -254 -> 1103
    //   1360: astore 20
    //   1362: ldc 51
    //   1364: ldc_w 1060
    //   1367: aload 20
    //   1369: invokestatic 1062	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1372: goto -265 -> 1107
    //   1375: aload_0
    //   1376: iconst_1
    //   1377: putfield 181	com/tencent/qqmusic/mediaplayer/CorePlayer:mHasInit	Z
    //   1380: aload_0
    //   1381: invokespecial 1069	com/tencent/qqmusic/mediaplayer/CorePlayer:createAudioTrack	()Z
    //   1384: ifne +295 -> 1679
    //   1387: ldc 51
    //   1389: ldc_w 1071
    //   1392: invokestatic 384	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1395: aload_0
    //   1396: getfield 161	com/tencent/qqmusic/mediaplayer/CorePlayer:mStateRunner	Lcom/tencent/qqmusic/mediaplayer/StateRunner;
    //   1399: bipush 9
    //   1401: invokestatic 156	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1404: invokevirtual 323	com/tencent/qqmusic/mediaplayer/StateRunner:transfer	(Ljava/lang/Object;)Ljava/lang/Object;
    //   1407: pop
    //   1408: ldc 51
    //   1410: aload_0
    //   1411: new 325	java/lang/StringBuilder
    //   1414: dup
    //   1415: ldc_w 1018
    //   1418: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1421: aload_0
    //   1422: getfield 175	com/tencent/qqmusic/mediaplayer/CorePlayer:mIsExit	Z
    //   1425: invokevirtual 1021	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   1428: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1431: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   1434: invokestatic 350	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1437: aload_0
    //   1438: getfield 192	com/tencent/qqmusic/mediaplayer/CorePlayer:monitor	Lcom/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor;
    //   1441: ifnull +10 -> 1451
    //   1444: aload_0
    //   1445: getfield 192	com/tencent/qqmusic/mediaplayer/CorePlayer:monitor	Lcom/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor;
    //   1448: invokevirtual 1026	com/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor:stop	()V
    //   1451: invokestatic 1029	com/tencent/qqmusic/mediaplayer/util/CpuInfoUtil:stopProcessInfoOutput	()V
    //   1454: aload_0
    //   1455: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   1458: ifnull +16 -> 1474
    //   1461: aload_0
    //   1462: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   1465: invokevirtual 550	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   1468: pop
    //   1469: aload_0
    //   1470: aconst_null
    //   1471: putfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   1474: aload_0
    //   1475: getfield 309	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   1478: ifnull +12 -> 1490
    //   1481: aload_0
    //   1482: getfield 309	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   1485: invokeinterface 1032 1 0
    //   1490: aload_0
    //   1491: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   1494: ifnull -1209 -> 285
    //   1497: aload_0
    //   1498: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   1501: invokevirtual 1033	android/media/AudioTrack:stop	()V
    //   1504: aload_0
    //   1505: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   1508: invokevirtual 1035	android/media/AudioTrack:flush	()V
    //   1511: aload_0
    //   1512: lconst_0
    //   1513: putfield 196	com/tencent/qqmusic/mediaplayer/CorePlayer:mCurrentFrameCount	J
    //   1516: aload_0
    //   1517: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   1520: invokevirtual 517	android/media/AudioTrack:release	()V
    //   1523: aload_0
    //   1524: invokespecial 1037	com/tencent/qqmusic/mediaplayer/CorePlayer:destroyAudioListeners	()V
    //   1527: aload_0
    //   1528: aconst_null
    //   1529: putfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   1532: ldc 51
    //   1534: aload_0
    //   1535: ldc_w 1039
    //   1538: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   1541: invokestatic 376	com/tencent/qqmusic/mediaplayer/util/Logger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1544: return
    //   1545: astore 20
    //   1547: ldc 51
    //   1549: aload_0
    //   1550: new 325	java/lang/StringBuilder
    //   1553: dup
    //   1554: ldc_w 1052
    //   1557: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1560: aload 20
    //   1562: invokevirtual 1055	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   1565: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1568: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1571: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   1574: aload 20
    //   1576: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1579: goto -105 -> 1474
    //   1582: astore 20
    //   1584: ldc 51
    //   1586: aload_0
    //   1587: new 325	java/lang/StringBuilder
    //   1590: dup
    //   1591: ldc_w 1057
    //   1594: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1597: aload 20
    //   1599: invokevirtual 1058	java/io/IOException:getMessage	()Ljava/lang/String;
    //   1602: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1605: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1608: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   1611: aload 20
    //   1613: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1616: goto -126 -> 1490
    //   1619: astore 20
    //   1621: ldc 51
    //   1623: aload 20
    //   1625: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1628: goto -124 -> 1504
    //   1631: astore 20
    //   1633: ldc 51
    //   1635: aload 20
    //   1637: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1640: goto -129 -> 1511
    //   1643: astore 20
    //   1645: ldc 51
    //   1647: aload 20
    //   1649: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1652: goto -129 -> 1523
    //   1655: astore 20
    //   1657: ldc 51
    //   1659: ldc_w 1060
    //   1662: aload 20
    //   1664: invokestatic 1062	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1667: goto -140 -> 1527
    //   1670: astore 20
    //   1672: ldc 51
    //   1674: aload 20
    //   1676: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1679: aload_0
    //   1680: getfield 161	com/tencent/qqmusic/mediaplayer/CorePlayer:mStateRunner	Lcom/tencent/qqmusic/mediaplayer/StateRunner;
    //   1683: iconst_2
    //   1684: invokestatic 156	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1687: invokevirtual 323	com/tencent/qqmusic/mediaplayer/StateRunner:transfer	(Ljava/lang/Object;)Ljava/lang/Object;
    //   1690: pop
    //   1691: aload_0
    //   1692: aload_0
    //   1693: getfield 389	com/tencent/qqmusic/mediaplayer/CorePlayer:mInformation	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   1696: invokevirtual 835	com/tencent/qqmusic/mediaplayer/AudioInformation:getPlaySample	()J
    //   1699: aload_0
    //   1700: getfield 389	com/tencent/qqmusic/mediaplayer/CorePlayer:mInformation	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   1703: invokevirtual 423	com/tencent/qqmusic/mediaplayer/AudioInformation:getBitDept	()I
    //   1706: aload_0
    //   1707: getfield 389	com/tencent/qqmusic/mediaplayer/CorePlayer:mInformation	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   1710: invokevirtual 401	com/tencent/qqmusic/mediaplayer/AudioInformation:getChannels	()I
    //   1713: invokespecial 1073	com/tencent/qqmusic/mediaplayer/CorePlayer:initAudioListeners	(JII)V
    //   1716: aload_0
    //   1717: new 18	com/tencent/qqmusic/mediaplayer/CorePlayer$5
    //   1720: dup
    //   1721: aload_0
    //   1722: invokespecial 1074	com/tencent/qqmusic/mediaplayer/CorePlayer$5:<init>	(Lcom/tencent/qqmusic/mediaplayer/CorePlayer;)V
    //   1725: bipush 20
    //   1727: invokespecial 1076	com/tencent/qqmusic/mediaplayer/CorePlayer:postRunnable	(Ljava/lang/Runnable;I)V
    //   1730: aload_0
    //   1731: invokevirtual 866	com/tencent/qqmusic/mediaplayer/CorePlayer:isPlaying	()Z
    //   1734: ifne +41 -> 1775
    //   1737: aload_0
    //   1738: getfield 175	com/tencent/qqmusic/mediaplayer/CorePlayer:mIsExit	Z
    //   1741: ifne +34 -> 1775
    //   1744: ldc 51
    //   1746: aload_0
    //   1747: ldc_w 1078
    //   1750: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   1753: invokestatic 350	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1756: aload_0
    //   1757: getfield 166	com/tencent/qqmusic/mediaplayer/CorePlayer:mSignalControl	Lcom/tencent/qqmusic/mediaplayer/WaitNotify;
    //   1760: invokevirtual 1081	com/tencent/qqmusic/mediaplayer/WaitNotify:doWait	()V
    //   1763: ldc 51
    //   1765: aload_0
    //   1766: ldc_w 1083
    //   1769: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   1772: invokestatic 350	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1775: invokestatic 507	com/tencent/qqmusic/mediaplayer/PlayerConfigManager:getInstance	()Lcom/tencent/qqmusic/mediaplayer/PlayerConfigManager;
    //   1778: aload_0
    //   1779: invokevirtual 1086	com/tencent/qqmusic/mediaplayer/PlayerConfigManager:setCommonPlayerRef	(Lcom/tencent/qqmusic/mediaplayer/CorePlayer;)V
    //   1782: aload_0
    //   1783: new 1023	com/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor
    //   1786: dup
    //   1787: aload_0
    //   1788: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   1791: invokespecial 1089	com/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor:<init>	(Landroid/media/AudioTrack;)V
    //   1794: putfield 192	com/tencent/qqmusic/mediaplayer/CorePlayer:monitor	Lcom/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor;
    //   1797: aload_0
    //   1798: getfield 192	com/tencent/qqmusic/mediaplayer/CorePlayer:monitor	Lcom/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor;
    //   1801: invokevirtual 1090	com/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor:start	()V
    //   1804: aload_0
    //   1805: getfield 224	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecodeBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   1808: aload_0
    //   1809: getfield 438	com/tencent/qqmusic/mediaplayer/CorePlayer:mBuffSize	I
    //   1812: invokevirtual 809	com/tencent/qqmusic/mediaplayer/BufferInfo:setShortBufferCapacity	(I)V
    //   1815: iconst_0
    //   1816: istore_1
    //   1817: lconst_0
    //   1818: lstore 12
    //   1820: invokestatic 1095	java/lang/System:currentTimeMillis	()J
    //   1823: lstore 8
    //   1825: lconst_0
    //   1826: lstore 10
    //   1828: iconst_0
    //   1829: istore_2
    //   1830: iconst_0
    //   1831: istore_3
    //   1832: aload_0
    //   1833: getfield 175	com/tencent/qqmusic/mediaplayer/CorePlayer:mIsExit	Z
    //   1836: ifne +1380 -> 3216
    //   1839: iconst_m1
    //   1840: istore 4
    //   1842: aload_0
    //   1843: getfield 173	com/tencent/qqmusic/mediaplayer/CorePlayer:mSeekRecord	Ljava/util/Stack;
    //   1846: astore 20
    //   1848: aload 20
    //   1850: monitorenter
    //   1851: aload_0
    //   1852: getfield 173	com/tencent/qqmusic/mediaplayer/CorePlayer:mSeekRecord	Ljava/util/Stack;
    //   1855: invokevirtual 1098	java/util/Stack:empty	()Z
    //   1858: ifne +54 -> 1912
    //   1861: aload_0
    //   1862: getfield 173	com/tencent/qqmusic/mediaplayer/CorePlayer:mSeekRecord	Ljava/util/Stack;
    //   1865: invokevirtual 1101	java/util/Stack:pop	()Ljava/lang/Object;
    //   1868: checkcast 152	java/lang/Integer
    //   1871: invokevirtual 897	java/lang/Integer:intValue	()I
    //   1874: istore 4
    //   1876: aload_0
    //   1877: getfield 173	com/tencent/qqmusic/mediaplayer/CorePlayer:mSeekRecord	Ljava/util/Stack;
    //   1880: invokevirtual 1104	java/util/Stack:clear	()V
    //   1883: ldc 51
    //   1885: new 325	java/lang/StringBuilder
    //   1888: dup
    //   1889: ldc_w 1106
    //   1892: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1895: iload 4
    //   1897: invokevirtual 359	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1900: ldc_w 1108
    //   1903: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1906: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1909: invokestatic 350	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1912: aload 20
    //   1914: monitorexit
    //   1915: iload 4
    //   1917: istore 5
    //   1919: iload 4
    //   1921: ifge +59 -> 1980
    //   1924: iload 4
    //   1926: istore 5
    //   1928: aload_0
    //   1929: getfield 198	com/tencent/qqmusic/mediaplayer/CorePlayer:mNeedFlush	Z
    //   1932: ifeq +48 -> 1980
    //   1935: aload_0
    //   1936: getfield 196	com/tencent/qqmusic/mediaplayer/CorePlayer:mCurrentFrameCount	J
    //   1939: aload_0
    //   1940: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   1943: invokestatic 1110	com/tencent/qqmusic/mediaplayer/CorePlayer:getAudioTrackPosition	(JLandroid/media/AudioTrack;)I
    //   1946: istore 5
    //   1948: ldc 51
    //   1950: aload_0
    //   1951: new 325	java/lang/StringBuilder
    //   1954: dup
    //   1955: ldc_w 1112
    //   1958: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1961: iload 5
    //   1963: invokevirtual 359	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1966: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1969: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   1972: invokestatic 350	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1975: aload_0
    //   1976: iconst_0
    //   1977: putfield 198	com/tencent/qqmusic/mediaplayer/CorePlayer:mNeedFlush	Z
    //   1980: iload_2
    //   1981: istore 4
    //   1983: iload 5
    //   1985: iflt +993 -> 2978
    //   1988: aload_0
    //   1989: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   1992: iload 5
    //   1994: invokevirtual 1115	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:seekTo	(I)I
    //   1997: istore 4
    //   1999: ldc 51
    //   2001: aload_0
    //   2002: new 325	java/lang/StringBuilder
    //   2005: dup
    //   2006: ldc_w 1117
    //   2009: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2012: iload 4
    //   2014: invokevirtual 359	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2017: ldc_w 1119
    //   2020: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2023: iload 5
    //   2025: invokevirtual 359	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2028: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2031: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   2034: invokestatic 376	com/tencent/qqmusic/mediaplayer/util/Logger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   2037: iload 4
    //   2039: ifge +838 -> 2877
    //   2042: ldc 51
    //   2044: aload_0
    //   2045: new 325	java/lang/StringBuilder
    //   2048: dup
    //   2049: ldc_w 1121
    //   2052: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2055: iload 4
    //   2057: invokevirtual 359	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2060: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2063: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   2066: invokestatic 384	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   2069: aload_0
    //   2070: getfield 161	com/tencent/qqmusic/mediaplayer/CorePlayer:mStateRunner	Lcom/tencent/qqmusic/mediaplayer/StateRunner;
    //   2073: bipush 9
    //   2075: invokestatic 156	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2078: invokevirtual 323	com/tencent/qqmusic/mediaplayer/StateRunner:transfer	(Ljava/lang/Object;)Ljava/lang/Object;
    //   2081: pop
    //   2082: aload_0
    //   2083: bipush 95
    //   2085: bipush 74
    //   2087: invokevirtual 387	com/tencent/qqmusic/mediaplayer/CorePlayer:callExceptionCallback	(II)V
    //   2090: ldc 51
    //   2092: aload_0
    //   2093: new 325	java/lang/StringBuilder
    //   2096: dup
    //   2097: ldc_w 1018
    //   2100: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2103: aload_0
    //   2104: getfield 175	com/tencent/qqmusic/mediaplayer/CorePlayer:mIsExit	Z
    //   2107: invokevirtual 1021	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   2110: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2113: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   2116: invokestatic 350	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2119: aload_0
    //   2120: getfield 192	com/tencent/qqmusic/mediaplayer/CorePlayer:monitor	Lcom/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor;
    //   2123: ifnull +10 -> 2133
    //   2126: aload_0
    //   2127: getfield 192	com/tencent/qqmusic/mediaplayer/CorePlayer:monitor	Lcom/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor;
    //   2130: invokevirtual 1026	com/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor:stop	()V
    //   2133: invokestatic 1029	com/tencent/qqmusic/mediaplayer/util/CpuInfoUtil:stopProcessInfoOutput	()V
    //   2136: aload_0
    //   2137: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   2140: ifnull +16 -> 2156
    //   2143: aload_0
    //   2144: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   2147: invokevirtual 550	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   2150: pop
    //   2151: aload_0
    //   2152: aconst_null
    //   2153: putfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   2156: aload_0
    //   2157: getfield 309	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   2160: ifnull +12 -> 2172
    //   2163: aload_0
    //   2164: getfield 309	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   2167: invokeinterface 1032 1 0
    //   2172: aload_0
    //   2173: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   2176: ifnull -1891 -> 285
    //   2179: aload_0
    //   2180: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   2183: invokevirtual 1033	android/media/AudioTrack:stop	()V
    //   2186: aload_0
    //   2187: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   2190: invokevirtual 1035	android/media/AudioTrack:flush	()V
    //   2193: aload_0
    //   2194: lconst_0
    //   2195: putfield 196	com/tencent/qqmusic/mediaplayer/CorePlayer:mCurrentFrameCount	J
    //   2198: aload_0
    //   2199: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   2202: invokevirtual 517	android/media/AudioTrack:release	()V
    //   2205: aload_0
    //   2206: invokespecial 1037	com/tencent/qqmusic/mediaplayer/CorePlayer:destroyAudioListeners	()V
    //   2209: aload_0
    //   2210: aconst_null
    //   2211: putfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   2214: ldc 51
    //   2216: aload_0
    //   2217: ldc_w 1039
    //   2220: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   2223: invokestatic 376	com/tencent/qqmusic/mediaplayer/util/Logger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   2226: return
    //   2227: aload_0
    //   2228: getfield 175	com/tencent/qqmusic/mediaplayer/CorePlayer:mIsExit	Z
    //   2231: ifne +36 -> 2267
    //   2234: ldc 51
    //   2236: aload_0
    //   2237: ldc_w 1123
    //   2240: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   2243: invokestatic 384	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   2246: aload_0
    //   2247: getfield 161	com/tencent/qqmusic/mediaplayer/CorePlayer:mStateRunner	Lcom/tencent/qqmusic/mediaplayer/StateRunner;
    //   2250: bipush 9
    //   2252: invokestatic 156	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2255: invokevirtual 323	com/tencent/qqmusic/mediaplayer/StateRunner:transfer	(Ljava/lang/Object;)Ljava/lang/Object;
    //   2258: pop
    //   2259: aload_0
    //   2260: bipush 91
    //   2262: bipush 63
    //   2264: invokevirtual 387	com/tencent/qqmusic/mediaplayer/CorePlayer:callExceptionCallback	(II)V
    //   2267: ldc 51
    //   2269: aload_0
    //   2270: new 325	java/lang/StringBuilder
    //   2273: dup
    //   2274: ldc_w 1018
    //   2277: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2280: aload_0
    //   2281: getfield 175	com/tencent/qqmusic/mediaplayer/CorePlayer:mIsExit	Z
    //   2284: invokevirtual 1021	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   2287: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2290: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   2293: invokestatic 350	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2296: aload_0
    //   2297: getfield 192	com/tencent/qqmusic/mediaplayer/CorePlayer:monitor	Lcom/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor;
    //   2300: ifnull +10 -> 2310
    //   2303: aload_0
    //   2304: getfield 192	com/tencent/qqmusic/mediaplayer/CorePlayer:monitor	Lcom/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor;
    //   2307: invokevirtual 1026	com/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor:stop	()V
    //   2310: invokestatic 1029	com/tencent/qqmusic/mediaplayer/util/CpuInfoUtil:stopProcessInfoOutput	()V
    //   2313: aload_0
    //   2314: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   2317: ifnull +16 -> 2333
    //   2320: aload_0
    //   2321: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   2324: invokevirtual 550	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   2327: pop
    //   2328: aload_0
    //   2329: aconst_null
    //   2330: putfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   2333: aload_0
    //   2334: getfield 309	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   2337: ifnull +12 -> 2349
    //   2340: aload_0
    //   2341: getfield 309	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   2344: invokeinterface 1032 1 0
    //   2349: aload_0
    //   2350: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   2353: ifnull -2068 -> 285
    //   2356: aload_0
    //   2357: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   2360: invokevirtual 1033	android/media/AudioTrack:stop	()V
    //   2363: aload_0
    //   2364: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   2367: invokevirtual 1035	android/media/AudioTrack:flush	()V
    //   2370: aload_0
    //   2371: lconst_0
    //   2372: putfield 196	com/tencent/qqmusic/mediaplayer/CorePlayer:mCurrentFrameCount	J
    //   2375: aload_0
    //   2376: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   2379: invokevirtual 517	android/media/AudioTrack:release	()V
    //   2382: aload_0
    //   2383: invokespecial 1037	com/tencent/qqmusic/mediaplayer/CorePlayer:destroyAudioListeners	()V
    //   2386: aload_0
    //   2387: aconst_null
    //   2388: putfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   2391: ldc 51
    //   2393: aload_0
    //   2394: ldc_w 1039
    //   2397: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   2400: invokestatic 376	com/tencent/qqmusic/mediaplayer/util/Logger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   2403: return
    //   2404: astore 20
    //   2406: ldc 51
    //   2408: aload_0
    //   2409: new 325	java/lang/StringBuilder
    //   2412: dup
    //   2413: ldc_w 1052
    //   2416: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2419: aload 20
    //   2421: invokevirtual 1055	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   2424: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2427: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2430: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   2433: aload 20
    //   2435: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2438: goto -105 -> 2333
    //   2441: astore 20
    //   2443: ldc 51
    //   2445: aload_0
    //   2446: new 325	java/lang/StringBuilder
    //   2449: dup
    //   2450: ldc_w 1057
    //   2453: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2456: aload 20
    //   2458: invokevirtual 1058	java/io/IOException:getMessage	()Ljava/lang/String;
    //   2461: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2464: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2467: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   2470: aload 20
    //   2472: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2475: goto -126 -> 2349
    //   2478: astore 20
    //   2480: ldc 51
    //   2482: aload 20
    //   2484: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2487: goto -124 -> 2363
    //   2490: astore 20
    //   2492: ldc 51
    //   2494: aload 20
    //   2496: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2499: goto -129 -> 2370
    //   2502: astore 20
    //   2504: ldc 51
    //   2506: aload 20
    //   2508: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2511: goto -129 -> 2382
    //   2514: astore 20
    //   2516: ldc 51
    //   2518: ldc_w 1060
    //   2521: aload 20
    //   2523: invokestatic 1062	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2526: goto -140 -> 2386
    //   2529: astore 21
    //   2531: aload 20
    //   2533: monitorexit
    //   2534: aload 21
    //   2536: athrow
    //   2537: astore 20
    //   2539: ldc 51
    //   2541: aload 20
    //   2543: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2546: ldc 51
    //   2548: aload_0
    //   2549: new 325	java/lang/StringBuilder
    //   2552: dup
    //   2553: ldc_w 1018
    //   2556: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2559: aload_0
    //   2560: getfield 175	com/tencent/qqmusic/mediaplayer/CorePlayer:mIsExit	Z
    //   2563: invokevirtual 1021	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   2566: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2569: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   2572: invokestatic 350	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2575: aload_0
    //   2576: getfield 192	com/tencent/qqmusic/mediaplayer/CorePlayer:monitor	Lcom/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor;
    //   2579: ifnull +10 -> 2589
    //   2582: aload_0
    //   2583: getfield 192	com/tencent/qqmusic/mediaplayer/CorePlayer:monitor	Lcom/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor;
    //   2586: invokevirtual 1026	com/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor:stop	()V
    //   2589: invokestatic 1029	com/tencent/qqmusic/mediaplayer/util/CpuInfoUtil:stopProcessInfoOutput	()V
    //   2592: aload_0
    //   2593: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   2596: ifnull +16 -> 2612
    //   2599: aload_0
    //   2600: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   2603: invokevirtual 550	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   2606: pop
    //   2607: aload_0
    //   2608: aconst_null
    //   2609: putfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   2612: aload_0
    //   2613: getfield 309	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   2616: ifnull +12 -> 2628
    //   2619: aload_0
    //   2620: getfield 309	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   2623: invokeinterface 1032 1 0
    //   2628: aload_0
    //   2629: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   2632: ifnull +50 -> 2682
    //   2635: aload_0
    //   2636: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   2639: invokevirtual 1033	android/media/AudioTrack:stop	()V
    //   2642: aload_0
    //   2643: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   2646: invokevirtual 1035	android/media/AudioTrack:flush	()V
    //   2649: aload_0
    //   2650: lconst_0
    //   2651: putfield 196	com/tencent/qqmusic/mediaplayer/CorePlayer:mCurrentFrameCount	J
    //   2654: aload_0
    //   2655: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   2658: invokevirtual 517	android/media/AudioTrack:release	()V
    //   2661: aload_0
    //   2662: invokespecial 1037	com/tencent/qqmusic/mediaplayer/CorePlayer:destroyAudioListeners	()V
    //   2665: aload_0
    //   2666: aconst_null
    //   2667: putfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   2670: ldc 51
    //   2672: aload_0
    //   2673: ldc_w 1039
    //   2676: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   2679: invokestatic 376	com/tencent/qqmusic/mediaplayer/util/Logger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   2682: aload_0
    //   2683: getfield 175	com/tencent/qqmusic/mediaplayer/CorePlayer:mIsExit	Z
    //   2686: ifne +34 -> 2720
    //   2689: aload_0
    //   2690: getfield 161	com/tencent/qqmusic/mediaplayer/CorePlayer:mStateRunner	Lcom/tencent/qqmusic/mediaplayer/StateRunner;
    //   2693: iconst_1
    //   2694: anewarray 152	java/lang/Integer
    //   2697: dup
    //   2698: iconst_0
    //   2699: bipush 7
    //   2701: invokestatic 156	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2704: aastore
    //   2705: invokevirtual 380	com/tencent/qqmusic/mediaplayer/StateRunner:isEqual	([Ljava/lang/Object;)Z
    //   2708: ifeq +2954 -> 5662
    //   2711: aload_0
    //   2712: getfield 251	com/tencent/qqmusic/mediaplayer/CorePlayer:mCallback	Lcom/tencent/qqmusic/mediaplayer/PlayerCallback;
    //   2715: invokeinterface 1126 1 0
    //   2720: ldc 51
    //   2722: aload_0
    //   2723: new 325	java/lang/StringBuilder
    //   2726: dup
    //   2727: ldc_w 1128
    //   2730: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2733: invokestatic 1000	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   2736: invokevirtual 1003	java/lang/Thread:getName	()Ljava/lang/String;
    //   2739: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2742: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2745: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   2748: invokestatic 350	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2751: return
    //   2752: astore 20
    //   2754: ldc 51
    //   2756: aload_0
    //   2757: new 325	java/lang/StringBuilder
    //   2760: dup
    //   2761: ldc_w 1052
    //   2764: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2767: aload 20
    //   2769: invokevirtual 1055	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   2772: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2775: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2778: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   2781: aload 20
    //   2783: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2786: goto -630 -> 2156
    //   2789: astore 20
    //   2791: ldc 51
    //   2793: aload_0
    //   2794: new 325	java/lang/StringBuilder
    //   2797: dup
    //   2798: ldc_w 1057
    //   2801: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2804: aload 20
    //   2806: invokevirtual 1058	java/io/IOException:getMessage	()Ljava/lang/String;
    //   2809: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2812: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2815: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   2818: aload 20
    //   2820: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2823: goto -651 -> 2172
    //   2826: astore 20
    //   2828: ldc 51
    //   2830: aload 20
    //   2832: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2835: goto -649 -> 2186
    //   2838: astore 20
    //   2840: ldc 51
    //   2842: aload 20
    //   2844: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2847: goto -654 -> 2193
    //   2850: astore 20
    //   2852: ldc 51
    //   2854: aload 20
    //   2856: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2859: goto -654 -> 2205
    //   2862: astore 20
    //   2864: ldc 51
    //   2866: ldc_w 1060
    //   2869: aload 20
    //   2871: invokestatic 1062	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2874: goto -665 -> 2209
    //   2877: aload_0
    //   2878: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   2881: ifnull +61 -> 2942
    //   2884: aload_0
    //   2885: iload 5
    //   2887: i2d
    //   2888: ldc2_w 701
    //   2891: ddiv
    //   2892: aload_0
    //   2893: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   2896: invokevirtual 700	android/media/AudioTrack:getSampleRate	()I
    //   2899: i2d
    //   2900: dmul
    //   2901: invokestatic 706	java/lang/Math:round	(D)J
    //   2904: putfield 196	com/tencent/qqmusic/mediaplayer/CorePlayer:mCurrentFrameCount	J
    //   2907: aload_0
    //   2908: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   2911: invokevirtual 1131	android/media/AudioTrack:getPlayState	()I
    //   2914: iconst_3
    //   2915: if_icmpne +139 -> 3054
    //   2918: aload_0
    //   2919: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   2922: invokevirtual 1133	android/media/AudioTrack:pause	()V
    //   2925: aload_0
    //   2926: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   2929: invokevirtual 1035	android/media/AudioTrack:flush	()V
    //   2932: aload_0
    //   2933: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   2936: invokevirtual 1135	android/media/AudioTrack:play	()V
    //   2939: goto +2771 -> 5710
    //   2942: aload_0
    //   2943: iload 5
    //   2945: i2l
    //   2946: putfield 168	com/tencent/qqmusic/mediaplayer/CorePlayer:mCurPosition	J
    //   2949: aload_0
    //   2950: getfield 186	com/tencent/qqmusic/mediaplayer/CorePlayer:mTimer	Lcom/tencent/qqmusic/mediaplayer/util/ReferenceTimer;
    //   2953: iload 5
    //   2955: i2l
    //   2956: invokevirtual 929	com/tencent/qqmusic/mediaplayer/util/ReferenceTimer:refreshTimeInMs	(J)V
    //   2959: aload_0
    //   2960: iload 5
    //   2962: i2l
    //   2963: invokespecial 1137	com/tencent/qqmusic/mediaplayer/CorePlayer:notifySeekCompleteForAudioListeners	(J)V
    //   2966: aload_0
    //   2967: getfield 251	com/tencent/qqmusic/mediaplayer/CorePlayer:mCallback	Lcom/tencent/qqmusic/mediaplayer/PlayerCallback;
    //   2970: invokeinterface 1140 1 0
    //   2975: iload_2
    //   2976: istore 4
    //   2978: aload_0
    //   2979: invokevirtual 1142	com/tencent/qqmusic/mediaplayer/CorePlayer:isPaused	()Z
    //   2982: ifeq +82 -> 3064
    //   2985: aload_0
    //   2986: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   2989: invokevirtual 1131	android/media/AudioTrack:getPlayState	()I
    //   2992: iconst_2
    //   2993: if_icmpeq +10 -> 3003
    //   2996: aload_0
    //   2997: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   3000: invokevirtual 1133	android/media/AudioTrack:pause	()V
    //   3003: aload_0
    //   3004: new 20	com/tencent/qqmusic/mediaplayer/CorePlayer$6
    //   3007: dup
    //   3008: aload_0
    //   3009: invokespecial 1143	com/tencent/qqmusic/mediaplayer/CorePlayer$6:<init>	(Lcom/tencent/qqmusic/mediaplayer/CorePlayer;)V
    //   3012: bipush 20
    //   3014: invokespecial 1076	com/tencent/qqmusic/mediaplayer/CorePlayer:postRunnable	(Ljava/lang/Runnable;I)V
    //   3017: ldc 51
    //   3019: aload_0
    //   3020: ldc_w 1145
    //   3023: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   3026: invokestatic 350	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   3029: aload_0
    //   3030: getfield 166	com/tencent/qqmusic/mediaplayer/CorePlayer:mSignalControl	Lcom/tencent/qqmusic/mediaplayer/WaitNotify;
    //   3033: invokevirtual 1081	com/tencent/qqmusic/mediaplayer/WaitNotify:doWait	()V
    //   3036: ldc 51
    //   3038: aload_0
    //   3039: ldc_w 1147
    //   3042: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   3045: invokestatic 350	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   3048: iload 4
    //   3050: istore_2
    //   3051: goto -1219 -> 1832
    //   3054: aload_0
    //   3055: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   3058: invokevirtual 1035	android/media/AudioTrack:flush	()V
    //   3061: goto +2649 -> 5710
    //   3064: aload_0
    //   3065: invokespecial 1149	com/tencent/qqmusic/mediaplayer/CorePlayer:isIdle	()Z
    //   3068: ifne +148 -> 3216
    //   3071: aload_0
    //   3072: invokespecial 1151	com/tencent/qqmusic/mediaplayer/CorePlayer:isError	()Z
    //   3075: ifne +141 -> 3216
    //   3078: aload_0
    //   3079: invokespecial 1153	com/tencent/qqmusic/mediaplayer/CorePlayer:isStopped	()Z
    //   3082: ifne +134 -> 3216
    //   3085: aload_0
    //   3086: invokespecial 868	com/tencent/qqmusic/mediaplayer/CorePlayer:isCompleted	()Z
    //   3089: ifeq +283 -> 3372
    //   3092: iload 4
    //   3094: aload_0
    //   3095: getfield 389	com/tencent/qqmusic/mediaplayer/CorePlayer:mInformation	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   3098: invokevirtual 401	com/tencent/qqmusic/mediaplayer/AudioInformation:getChannels	()I
    //   3101: idiv
    //   3102: iload_3
    //   3103: isub
    //   3104: istore_1
    //   3105: iload_1
    //   3106: ifle +249 -> 3355
    //   3109: aload_0
    //   3110: getfield 481	com/tencent/qqmusic/mediaplayer/CorePlayer:mTrackBufferSizeInByte	I
    //   3113: aload_0
    //   3114: getfield 389	com/tencent/qqmusic/mediaplayer/CorePlayer:mInformation	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   3117: invokevirtual 423	com/tencent/qqmusic/mediaplayer/AudioInformation:getBitDept	()I
    //   3120: idiv
    //   3121: aload_0
    //   3122: getfield 389	com/tencent/qqmusic/mediaplayer/CorePlayer:mInformation	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   3125: invokevirtual 401	com/tencent/qqmusic/mediaplayer/AudioInformation:getChannels	()I
    //   3128: idiv
    //   3129: istore_2
    //   3130: iload_1
    //   3131: iload_2
    //   3132: if_icmpge +228 -> 3360
    //   3135: iload_1
    //   3136: sipush 1000
    //   3139: imul
    //   3140: i2l
    //   3141: aload_0
    //   3142: getfield 389	com/tencent/qqmusic/mediaplayer/CorePlayer:mInformation	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   3145: invokevirtual 395	com/tencent/qqmusic/mediaplayer/AudioInformation:getSampleRate	()J
    //   3148: ldiv
    //   3149: l2i
    //   3150: istore_1
    //   3151: ldc 51
    //   3153: aload_0
    //   3154: new 325	java/lang/StringBuilder
    //   3157: dup
    //   3158: ldc_w 1155
    //   3161: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   3164: iload 4
    //   3166: invokevirtual 359	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   3169: ldc_w 1157
    //   3172: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3175: iload_3
    //   3176: invokevirtual 359	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   3179: ldc_w 1159
    //   3182: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3185: iload_1
    //   3186: invokevirtual 359	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   3189: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3192: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   3195: invokestatic 350	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   3198: iload_1
    //   3199: ifle +17 -> 3216
    //   3202: aload_0
    //   3203: monitorenter
    //   3204: iload_1
    //   3205: i2l
    //   3206: lstore 8
    //   3208: aload_0
    //   3209: lload 8
    //   3211: invokevirtual 1162	java/lang/Object:wait	(J)V
    //   3214: aload_0
    //   3215: monitorexit
    //   3216: ldc 51
    //   3218: aload_0
    //   3219: new 325	java/lang/StringBuilder
    //   3222: dup
    //   3223: ldc_w 1018
    //   3226: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   3229: aload_0
    //   3230: getfield 175	com/tencent/qqmusic/mediaplayer/CorePlayer:mIsExit	Z
    //   3233: invokevirtual 1021	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   3236: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3239: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   3242: invokestatic 350	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   3245: aload_0
    //   3246: getfield 192	com/tencent/qqmusic/mediaplayer/CorePlayer:monitor	Lcom/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor;
    //   3249: ifnull +10 -> 3259
    //   3252: aload_0
    //   3253: getfield 192	com/tencent/qqmusic/mediaplayer/CorePlayer:monitor	Lcom/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor;
    //   3256: invokevirtual 1026	com/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor:stop	()V
    //   3259: invokestatic 1029	com/tencent/qqmusic/mediaplayer/util/CpuInfoUtil:stopProcessInfoOutput	()V
    //   3262: aload_0
    //   3263: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   3266: ifnull +16 -> 3282
    //   3269: aload_0
    //   3270: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   3273: invokevirtual 550	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   3276: pop
    //   3277: aload_0
    //   3278: aconst_null
    //   3279: putfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   3282: aload_0
    //   3283: getfield 309	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   3286: ifnull +12 -> 3298
    //   3289: aload_0
    //   3290: getfield 309	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   3293: invokeinterface 1032 1 0
    //   3298: aload_0
    //   3299: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   3302: ifnull -620 -> 2682
    //   3305: aload_0
    //   3306: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   3309: invokevirtual 1033	android/media/AudioTrack:stop	()V
    //   3312: aload_0
    //   3313: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   3316: invokevirtual 1035	android/media/AudioTrack:flush	()V
    //   3319: aload_0
    //   3320: lconst_0
    //   3321: putfield 196	com/tencent/qqmusic/mediaplayer/CorePlayer:mCurrentFrameCount	J
    //   3324: aload_0
    //   3325: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   3328: invokevirtual 517	android/media/AudioTrack:release	()V
    //   3331: aload_0
    //   3332: invokespecial 1037	com/tencent/qqmusic/mediaplayer/CorePlayer:destroyAudioListeners	()V
    //   3335: aload_0
    //   3336: aconst_null
    //   3337: putfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   3340: ldc 51
    //   3342: aload_0
    //   3343: ldc_w 1039
    //   3346: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   3349: invokestatic 376	com/tencent/qqmusic/mediaplayer/util/Logger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   3352: goto -670 -> 2682
    //   3355: iconst_0
    //   3356: istore_1
    //   3357: goto -248 -> 3109
    //   3360: iload_2
    //   3361: istore_1
    //   3362: goto -227 -> 3135
    //   3365: astore 20
    //   3367: aload_0
    //   3368: monitorexit
    //   3369: aload 20
    //   3371: athrow
    //   3372: aload_0
    //   3373: invokevirtual 866	com/tencent/qqmusic/mediaplayer/CorePlayer:isPlaying	()Z
    //   3376: ifeq +21 -> 3397
    //   3379: aload_0
    //   3380: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   3383: invokevirtual 1131	android/media/AudioTrack:getPlayState	()I
    //   3386: iconst_3
    //   3387: if_icmpeq +10 -> 3397
    //   3390: aload_0
    //   3391: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   3394: invokevirtual 1135	android/media/AudioTrack:play	()V
    //   3397: aload_0
    //   3398: getfield 200	com/tencent/qqmusic/mediaplayer/CorePlayer:bufferLock	Ljava/lang/Object;
    //   3401: astore 20
    //   3403: aload 20
    //   3405: monitorenter
    //   3406: aload_0
    //   3407: getfield 664	com/tencent/qqmusic/mediaplayer/CorePlayer:bufferWaitingPosition	J
    //   3410: lconst_0
    //   3411: lcmp
    //   3412: ifle +99 -> 3511
    //   3415: ldc 51
    //   3417: new 325	java/lang/StringBuilder
    //   3420: dup
    //   3421: ldc_w 1164
    //   3424: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   3427: aload_0
    //   3428: getfield 664	com/tencent/qqmusic/mediaplayer/CorePlayer:bufferWaitingPosition	J
    //   3431: invokevirtual 475	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   3434: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3437: invokestatic 350	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   3440: aload_0
    //   3441: iconst_1
    //   3442: putfield 863	com/tencent/qqmusic/mediaplayer/CorePlayer:isBuffering	Z
    //   3445: aload_0
    //   3446: getfield 200	com/tencent/qqmusic/mediaplayer/CorePlayer:bufferLock	Ljava/lang/Object;
    //   3449: invokevirtual 1166	java/lang/Object:wait	()V
    //   3452: ldc 51
    //   3454: new 325	java/lang/StringBuilder
    //   3457: dup
    //   3458: ldc_w 1168
    //   3461: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   3464: aload_0
    //   3465: getfield 655	com/tencent/qqmusic/mediaplayer/CorePlayer:bufferWaitingTime	I
    //   3468: invokevirtual 359	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   3471: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3474: invokestatic 350	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   3477: aload_0
    //   3478: getfield 186	com/tencent/qqmusic/mediaplayer/CorePlayer:mTimer	Lcom/tencent/qqmusic/mediaplayer/util/ReferenceTimer;
    //   3481: aload_0
    //   3482: getfield 655	com/tencent/qqmusic/mediaplayer/CorePlayer:bufferWaitingTime	I
    //   3485: i2l
    //   3486: invokevirtual 929	com/tencent/qqmusic/mediaplayer/util/ReferenceTimer:refreshTimeInMs	(J)V
    //   3489: aload_0
    //   3490: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   3493: aload_0
    //   3494: getfield 655	com/tencent/qqmusic/mediaplayer/CorePlayer:bufferWaitingTime	I
    //   3497: invokevirtual 1115	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:seekTo	(I)I
    //   3500: pop
    //   3501: aload_0
    //   3502: iconst_0
    //   3503: putfield 863	com/tencent/qqmusic/mediaplayer/CorePlayer:isBuffering	Z
    //   3506: aload_0
    //   3507: iconst_0
    //   3508: putfield 655	com/tencent/qqmusic/mediaplayer/CorePlayer:bufferWaitingTime	I
    //   3511: aload_0
    //   3512: lconst_0
    //   3513: putfield 664	com/tencent/qqmusic/mediaplayer/CorePlayer:bufferWaitingPosition	J
    //   3516: aload 20
    //   3518: monitorexit
    //   3519: aload_0
    //   3520: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   3523: astore 20
    //   3525: aload 20
    //   3527: ifnull +2163 -> 5690
    //   3530: aload_0
    //   3531: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   3534: aload_0
    //   3535: getfield 438	com/tencent/qqmusic/mediaplayer/CorePlayer:mBuffSize	I
    //   3538: iconst_2
    //   3539: imul
    //   3540: aload_0
    //   3541: getfield 224	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecodeBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   3544: getfield 729	com/tencent/qqmusic/mediaplayer/BufferInfo:shortBuffer	[S
    //   3547: invokevirtual 1172	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:decodeData	(I[S)I
    //   3550: istore_2
    //   3551: aload_0
    //   3552: getfield 224	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecodeBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   3555: iload_2
    //   3556: iconst_2
    //   3557: idiv
    //   3558: putfield 732	com/tencent/qqmusic/mediaplayer/BufferInfo:bufferSize	I
    //   3561: lload 12
    //   3563: aload_0
    //   3564: getfield 224	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecodeBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   3567: getfield 732	com/tencent/qqmusic/mediaplayer/BufferInfo:bufferSize	I
    //   3570: iconst_2
    //   3571: imul
    //   3572: i2l
    //   3573: ladd
    //   3574: lstore 12
    //   3576: lload 10
    //   3578: aload_0
    //   3579: getfield 224	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecodeBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   3582: getfield 732	com/tencent/qqmusic/mediaplayer/BufferInfo:bufferSize	I
    //   3585: iconst_2
    //   3586: imul
    //   3587: i2l
    //   3588: ladd
    //   3589: lstore 10
    //   3591: aload_0
    //   3592: iconst_1
    //   3593: putfield 179	com/tencent/qqmusic/mediaplayer/CorePlayer:mHasDecode	Z
    //   3596: iload_2
    //   3597: istore 6
    //   3599: iload_1
    //   3600: istore 5
    //   3602: lload 10
    //   3604: lstore 14
    //   3606: lload 12
    //   3608: lstore 16
    //   3610: iload_1
    //   3611: ifne +566 -> 4177
    //   3614: bipush 10
    //   3616: istore 5
    //   3618: aload_0
    //   3619: aload_0
    //   3620: getfield 389	com/tencent/qqmusic/mediaplayer/CorePlayer:mInformation	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   3623: invokespecial 1174	com/tencent/qqmusic/mediaplayer/CorePlayer:getCalcBitMinSize	(Lcom/tencent/qqmusic/mediaplayer/AudioInformation;)J
    //   3626: lstore 18
    //   3628: ldc 51
    //   3630: aload_0
    //   3631: new 325	java/lang/StringBuilder
    //   3634: dup
    //   3635: ldc_w 1176
    //   3638: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   3641: lload 18
    //   3643: invokevirtual 475	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   3646: ldc_w 1178
    //   3649: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3652: aload_0
    //   3653: getfield 224	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecodeBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   3656: getfield 732	com/tencent/qqmusic/mediaplayer/BufferInfo:bufferSize	I
    //   3659: invokevirtual 359	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   3662: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3665: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   3668: invokestatic 350	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   3671: lload 18
    //   3673: lconst_0
    //   3674: lcmp
    //   3675: ifle +376 -> 4051
    //   3678: iload_2
    //   3679: istore_1
    //   3680: lload 12
    //   3682: lstore 16
    //   3684: lload 10
    //   3686: lstore 14
    //   3688: aload_0
    //   3689: getfield 224	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecodeBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   3692: getfield 732	com/tencent/qqmusic/mediaplayer/BufferInfo:bufferSize	I
    //   3695: i2l
    //   3696: lload 18
    //   3698: lcmp
    //   3699: ifge +362 -> 4061
    //   3702: iload_2
    //   3703: istore_1
    //   3704: lload 12
    //   3706: lstore 16
    //   3708: lload 10
    //   3710: lstore 14
    //   3712: iload 5
    //   3714: iflt +347 -> 4061
    //   3717: aload_0
    //   3718: getfield 224	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecodeBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   3721: aload_0
    //   3722: getfield 438	com/tencent/qqmusic/mediaplayer/CorePlayer:mBuffSize	I
    //   3725: invokevirtual 1181	com/tencent/qqmusic/mediaplayer/BufferInfo:setTempShortBufferCapacity	(I)V
    //   3728: aload_0
    //   3729: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   3732: aload_0
    //   3733: getfield 438	com/tencent/qqmusic/mediaplayer/CorePlayer:mBuffSize	I
    //   3736: iconst_2
    //   3737: imul
    //   3738: aload_0
    //   3739: getfield 224	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecodeBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   3742: getfield 1184	com/tencent/qqmusic/mediaplayer/BufferInfo:tempShortBuffer	[S
    //   3745: invokevirtual 1172	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:decodeData	(I[S)I
    //   3748: istore_2
    //   3749: iload_2
    //   3750: iconst_2
    //   3751: idiv
    //   3752: istore_1
    //   3753: lload 12
    //   3755: lstore 16
    //   3757: lload 10
    //   3759: lstore 14
    //   3761: iload_1
    //   3762: ifle +55 -> 3817
    //   3765: aload_0
    //   3766: getfield 224	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecodeBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   3769: aload_0
    //   3770: getfield 224	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecodeBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   3773: getfield 1184	com/tencent/qqmusic/mediaplayer/BufferInfo:tempShortBuffer	[S
    //   3776: iconst_0
    //   3777: iload_1
    //   3778: invokevirtual 1188	com/tencent/qqmusic/mediaplayer/BufferInfo:appendShort	([SII)V
    //   3781: aload_0
    //   3782: getfield 224	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecodeBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   3785: astore 20
    //   3787: aload 20
    //   3789: aload 20
    //   3791: getfield 732	com/tencent/qqmusic/mediaplayer/BufferInfo:bufferSize	I
    //   3794: iload_1
    //   3795: iadd
    //   3796: putfield 732	com/tencent/qqmusic/mediaplayer/BufferInfo:bufferSize	I
    //   3799: lload 12
    //   3801: iload_1
    //   3802: iconst_2
    //   3803: imul
    //   3804: i2l
    //   3805: ladd
    //   3806: lstore 16
    //   3808: lload 10
    //   3810: iload_1
    //   3811: iconst_2
    //   3812: imul
    //   3813: i2l
    //   3814: ladd
    //   3815: lstore 14
    //   3817: iload 5
    //   3819: iconst_1
    //   3820: isub
    //   3821: istore 5
    //   3823: ldc 51
    //   3825: aload_0
    //   3826: new 325	java/lang/StringBuilder
    //   3829: dup
    //   3830: ldc_w 1190
    //   3833: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   3836: iload_1
    //   3837: invokevirtual 359	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   3840: ldc_w 1178
    //   3843: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3846: aload_0
    //   3847: getfield 224	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecodeBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   3850: getfield 732	com/tencent/qqmusic/mediaplayer/BufferInfo:bufferSize	I
    //   3853: invokevirtual 359	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   3856: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3859: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   3862: invokestatic 376	com/tencent/qqmusic/mediaplayer/util/Logger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   3865: lload 16
    //   3867: lstore 12
    //   3869: lload 14
    //   3871: lstore 10
    //   3873: goto -195 -> 3678
    //   3876: astore 20
    //   3878: ldc 51
    //   3880: aload 20
    //   3882: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   3885: aload_0
    //   3886: getfield 161	com/tencent/qqmusic/mediaplayer/CorePlayer:mStateRunner	Lcom/tencent/qqmusic/mediaplayer/StateRunner;
    //   3889: bipush 9
    //   3891: invokestatic 156	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   3894: invokevirtual 323	com/tencent/qqmusic/mediaplayer/StateRunner:transfer	(Ljava/lang/Object;)Ljava/lang/Object;
    //   3897: pop
    //   3898: aload_0
    //   3899: bipush 92
    //   3901: bipush 62
    //   3903: invokevirtual 387	com/tencent/qqmusic/mediaplayer/CorePlayer:callExceptionCallback	(II)V
    //   3906: ldc 51
    //   3908: aload_0
    //   3909: new 325	java/lang/StringBuilder
    //   3912: dup
    //   3913: ldc_w 1018
    //   3916: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   3919: aload_0
    //   3920: getfield 175	com/tencent/qqmusic/mediaplayer/CorePlayer:mIsExit	Z
    //   3923: invokevirtual 1021	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   3926: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3929: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   3932: invokestatic 350	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   3935: aload_0
    //   3936: getfield 192	com/tencent/qqmusic/mediaplayer/CorePlayer:monitor	Lcom/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor;
    //   3939: ifnull +10 -> 3949
    //   3942: aload_0
    //   3943: getfield 192	com/tencent/qqmusic/mediaplayer/CorePlayer:monitor	Lcom/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor;
    //   3946: invokevirtual 1026	com/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor:stop	()V
    //   3949: invokestatic 1029	com/tencent/qqmusic/mediaplayer/util/CpuInfoUtil:stopProcessInfoOutput	()V
    //   3952: aload_0
    //   3953: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   3956: ifnull +16 -> 3972
    //   3959: aload_0
    //   3960: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   3963: invokevirtual 550	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   3966: pop
    //   3967: aload_0
    //   3968: aconst_null
    //   3969: putfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   3972: aload_0
    //   3973: getfield 309	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   3976: ifnull +12 -> 3988
    //   3979: aload_0
    //   3980: getfield 309	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   3983: invokeinterface 1032 1 0
    //   3988: aload_0
    //   3989: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   3992: ifnull -3707 -> 285
    //   3995: aload_0
    //   3996: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   3999: invokevirtual 1033	android/media/AudioTrack:stop	()V
    //   4002: aload_0
    //   4003: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   4006: invokevirtual 1035	android/media/AudioTrack:flush	()V
    //   4009: aload_0
    //   4010: lconst_0
    //   4011: putfield 196	com/tencent/qqmusic/mediaplayer/CorePlayer:mCurrentFrameCount	J
    //   4014: aload_0
    //   4015: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   4018: invokevirtual 517	android/media/AudioTrack:release	()V
    //   4021: aload_0
    //   4022: invokespecial 1037	com/tencent/qqmusic/mediaplayer/CorePlayer:destroyAudioListeners	()V
    //   4025: aload_0
    //   4026: aconst_null
    //   4027: putfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   4030: ldc 51
    //   4032: aload_0
    //   4033: ldc_w 1039
    //   4036: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   4039: invokestatic 376	com/tencent/qqmusic/mediaplayer/util/Logger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   4042: return
    //   4043: astore 21
    //   4045: aload 20
    //   4047: monitorexit
    //   4048: aload 21
    //   4050: athrow
    //   4051: lload 10
    //   4053: lstore 14
    //   4055: lload 12
    //   4057: lstore 16
    //   4059: iload_2
    //   4060: istore_1
    //   4061: aload_0
    //   4062: getfield 389	com/tencent/qqmusic/mediaplayer/CorePlayer:mInformation	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   4065: invokevirtual 423	com/tencent/qqmusic/mediaplayer/AudioInformation:getBitDept	()I
    //   4068: ifne +34 -> 4102
    //   4071: aload_0
    //   4072: getfield 389	com/tencent/qqmusic/mediaplayer/CorePlayer:mInformation	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   4075: aload_0
    //   4076: lload 16
    //   4078: aload_0
    //   4079: invokevirtual 632	com/tencent/qqmusic/mediaplayer/CorePlayer:getCurPositionByDecoder	()J
    //   4082: aload_0
    //   4083: getfield 389	com/tencent/qqmusic/mediaplayer/CorePlayer:mInformation	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   4086: invokevirtual 401	com/tencent/qqmusic/mediaplayer/AudioInformation:getChannels	()I
    //   4089: aload_0
    //   4090: getfield 389	com/tencent/qqmusic/mediaplayer/CorePlayer:mInformation	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   4093: invokevirtual 395	com/tencent/qqmusic/mediaplayer/AudioInformation:getSampleRate	()J
    //   4096: invokespecial 1191	com/tencent/qqmusic/mediaplayer/CorePlayer:calcBitDept	(JJIJ)I
    //   4099: invokevirtual 1194	com/tencent/qqmusic/mediaplayer/AudioInformation:setBitDept	(I)V
    //   4102: aload_0
    //   4103: getfield 389	com/tencent/qqmusic/mediaplayer/CorePlayer:mInformation	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   4106: invokevirtual 423	com/tencent/qqmusic/mediaplayer/AudioInformation:getBitDept	()I
    //   4109: istore_2
    //   4110: iload_2
    //   4111: iconst_3
    //   4112: if_icmpge +10 -> 4122
    //   4115: iload_2
    //   4116: istore 5
    //   4118: iload_2
    //   4119: ifgt +28 -> 4147
    //   4122: ldc 51
    //   4124: new 325	java/lang/StringBuilder
    //   4127: dup
    //   4128: ldc_w 1196
    //   4131: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   4134: iload_2
    //   4135: invokevirtual 359	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   4138: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4141: invokestatic 1199	com/tencent/qqmusic/mediaplayer/util/Logger:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   4144: iconst_2
    //   4145: istore 5
    //   4147: ldc 51
    //   4149: aload_0
    //   4150: new 325	java/lang/StringBuilder
    //   4153: dup
    //   4154: ldc_w 1201
    //   4157: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   4160: iload 5
    //   4162: invokevirtual 359	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   4165: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4168: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   4171: invokestatic 376	com/tencent/qqmusic/mediaplayer/util/Logger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   4174: iload_1
    //   4175: istore 6
    //   4177: lload 16
    //   4179: lstore 10
    //   4181: iload 5
    //   4183: istore_1
    //   4184: lload 14
    //   4186: lstore 12
    //   4188: aload_0
    //   4189: getfield 194	com/tencent/qqmusic/mediaplayer/CorePlayer:mNeedChangePlayThreadPriority	Z
    //   4192: ifeq +14 -> 4206
    //   4195: aload_0
    //   4196: iconst_0
    //   4197: putfield 194	com/tencent/qqmusic/mediaplayer/CorePlayer:mNeedChangePlayThreadPriority	Z
    //   4200: invokestatic 507	com/tencent/qqmusic/mediaplayer/PlayerConfigManager:getInstance	()Lcom/tencent/qqmusic/mediaplayer/PlayerConfigManager;
    //   4203: invokevirtual 1006	com/tencent/qqmusic/mediaplayer/PlayerConfigManager:changeDecodeThreadPriorityIfNeed	()V
    //   4206: invokestatic 1095	java/lang/System:currentTimeMillis	()J
    //   4209: lstore 14
    //   4211: lload 14
    //   4213: lload 8
    //   4215: lsub
    //   4216: lstore 16
    //   4218: lload 16
    //   4220: ldc2_w 711
    //   4223: lcmp
    //   4224: ifle +1463 -> 5687
    //   4227: invokestatic 507	com/tencent/qqmusic/mediaplayer/PlayerConfigManager:getInstance	()Lcom/tencent/qqmusic/mediaplayer/PlayerConfigManager;
    //   4230: lload 12
    //   4232: l2f
    //   4233: fconst_1
    //   4234: fmul
    //   4235: lload 16
    //   4237: l2f
    //   4238: fdiv
    //   4239: f2l
    //   4240: invokevirtual 1204	com/tencent/qqmusic/mediaplayer/PlayerConfigManager:updateDecodeSpeed	(J)V
    //   4243: lconst_0
    //   4244: lstore 12
    //   4246: lload 14
    //   4248: lstore 8
    //   4250: aload_0
    //   4251: getfield 224	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecodeBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   4254: getfield 732	com/tencent/qqmusic/mediaplayer/BufferInfo:bufferSize	I
    //   4257: ifle +1005 -> 5262
    //   4260: aload_0
    //   4261: getfield 177	com/tencent/qqmusic/mediaplayer/CorePlayer:mHasDecodeSuccess	Z
    //   4264: ifne +17 -> 4281
    //   4267: aload_0
    //   4268: getfield 251	com/tencent/qqmusic/mediaplayer/CorePlayer:mCallback	Lcom/tencent/qqmusic/mediaplayer/PlayerCallback;
    //   4271: invokeinterface 1207 1 0
    //   4276: aload_0
    //   4277: iconst_1
    //   4278: putfield 177	com/tencent/qqmusic/mediaplayer/CorePlayer:mHasDecodeSuccess	Z
    //   4281: aload_0
    //   4282: aload_0
    //   4283: getfield 224	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecodeBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   4286: aload_0
    //   4287: getfield 226	com/tencent/qqmusic/mediaplayer/CorePlayer:m24BitBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   4290: invokespecial 1209	com/tencent/qqmusic/mediaplayer/CorePlayer:handleHighBitdept	(Lcom/tencent/qqmusic/mediaplayer/BufferInfo;Lcom/tencent/qqmusic/mediaplayer/BufferInfo;)V
    //   4293: aload_0
    //   4294: aload_0
    //   4295: getfield 226	com/tencent/qqmusic/mediaplayer/CorePlayer:m24BitBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   4298: aload_0
    //   4299: getfield 230	com/tencent/qqmusic/mediaplayer/CorePlayer:mReSampleBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   4302: invokespecial 1211	com/tencent/qqmusic/mediaplayer/CorePlayer:handleHighSample	(Lcom/tencent/qqmusic/mediaplayer/BufferInfo;Lcom/tencent/qqmusic/mediaplayer/BufferInfo;)V
    //   4305: aload_0
    //   4306: aload_0
    //   4307: getfield 230	com/tencent/qqmusic/mediaplayer/CorePlayer:mReSampleBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   4310: aload_0
    //   4311: getfield 228	com/tencent/qqmusic/mediaplayer/CorePlayer:mDTSBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   4314: invokevirtual 1213	com/tencent/qqmusic/mediaplayer/CorePlayer:processAudioListeners	(Lcom/tencent/qqmusic/mediaplayer/BufferInfo;Lcom/tencent/qqmusic/mediaplayer/BufferInfo;)V
    //   4317: aload_0
    //   4318: getfield 228	com/tencent/qqmusic/mediaplayer/CorePlayer:mDTSBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   4321: ifnull +948 -> 5269
    //   4324: aload_0
    //   4325: getfield 228	com/tencent/qqmusic/mediaplayer/CorePlayer:mDTSBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   4328: getfield 729	com/tencent/qqmusic/mediaplayer/BufferInfo:shortBuffer	[S
    //   4331: ifnull +938 -> 5269
    //   4334: aload_0
    //   4335: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   4338: ifnull +931 -> 5269
    //   4341: aload_0
    //   4342: invokevirtual 866	com/tencent/qqmusic/mediaplayer/CorePlayer:isPlaying	()Z
    //   4345: ifeq +924 -> 5269
    //   4348: aload_0
    //   4349: getfield 219	com/tencent/qqmusic/mediaplayer/CorePlayer:mTerminalAudioEffectList	Ljava/util/List;
    //   4352: invokeinterface 950 1 0
    //   4357: iconst_1
    //   4358: isub
    //   4359: istore_2
    //   4360: iload_2
    //   4361: iflt +1321 -> 5682
    //   4364: aload_0
    //   4365: getfield 219	com/tencent/qqmusic/mediaplayer/CorePlayer:mTerminalAudioEffectList	Ljava/util/List;
    //   4368: iload_2
    //   4369: invokeinterface 1216 2 0
    //   4374: checkcast 690	com/tencent/qqmusic/mediaplayer/audiofx/IAudioListener
    //   4377: astore 20
    //   4379: aload 20
    //   4381: invokeinterface 953 1 0
    //   4386: ifeq +669 -> 5055
    //   4389: aload 20
    //   4391: aload_0
    //   4392: getfield 230	com/tencent/qqmusic/mediaplayer/CorePlayer:mReSampleBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   4395: aload_0
    //   4396: getfield 228	com/tencent/qqmusic/mediaplayer/CorePlayer:mDTSBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   4399: invokeinterface 813 3 0
    //   4404: pop
    //   4405: iconst_1
    //   4406: istore_2
    //   4407: iload_2
    //   4408: ifne +1266 -> 5674
    //   4411: aload_0
    //   4412: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   4415: aload_0
    //   4416: getfield 228	com/tencent/qqmusic/mediaplayer/CorePlayer:mDTSBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   4419: getfield 729	com/tencent/qqmusic/mediaplayer/BufferInfo:shortBuffer	[S
    //   4422: iconst_0
    //   4423: aload_0
    //   4424: getfield 228	com/tencent/qqmusic/mediaplayer/CorePlayer:mDTSBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   4427: getfield 732	com/tencent/qqmusic/mediaplayer/BufferInfo:bufferSize	I
    //   4430: invokevirtual 1220	android/media/AudioTrack:write	([SII)I
    //   4433: istore_2
    //   4434: iload_2
    //   4435: ifge +752 -> 5187
    //   4438: ldc 51
    //   4440: aload_0
    //   4441: new 325	java/lang/StringBuilder
    //   4444: dup
    //   4445: ldc_w 1222
    //   4448: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   4451: iload_2
    //   4452: invokevirtual 359	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   4455: ldc_w 1224
    //   4458: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4461: aload_0
    //   4462: getfield 228	com/tencent/qqmusic/mediaplayer/CorePlayer:mDTSBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   4465: getfield 732	com/tencent/qqmusic/mediaplayer/BufferInfo:bufferSize	I
    //   4468: invokevirtual 359	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   4471: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4474: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   4477: invokestatic 384	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   4480: aload_0
    //   4481: getfield 161	com/tencent/qqmusic/mediaplayer/CorePlayer:mStateRunner	Lcom/tencent/qqmusic/mediaplayer/StateRunner;
    //   4484: bipush 9
    //   4486: invokestatic 156	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   4489: invokevirtual 323	com/tencent/qqmusic/mediaplayer/StateRunner:transfer	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4492: pop
    //   4493: aload_0
    //   4494: bipush 92
    //   4496: bipush 102
    //   4498: invokevirtual 387	com/tencent/qqmusic/mediaplayer/CorePlayer:callExceptionCallback	(II)V
    //   4501: ldc 51
    //   4503: aload_0
    //   4504: new 325	java/lang/StringBuilder
    //   4507: dup
    //   4508: ldc_w 1018
    //   4511: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   4514: aload_0
    //   4515: getfield 175	com/tencent/qqmusic/mediaplayer/CorePlayer:mIsExit	Z
    //   4518: invokevirtual 1021	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   4521: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4524: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   4527: invokestatic 350	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   4530: aload_0
    //   4531: getfield 192	com/tencent/qqmusic/mediaplayer/CorePlayer:monitor	Lcom/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor;
    //   4534: ifnull +10 -> 4544
    //   4537: aload_0
    //   4538: getfield 192	com/tencent/qqmusic/mediaplayer/CorePlayer:monitor	Lcom/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor;
    //   4541: invokevirtual 1026	com/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor:stop	()V
    //   4544: invokestatic 1029	com/tencent/qqmusic/mediaplayer/util/CpuInfoUtil:stopProcessInfoOutput	()V
    //   4547: aload_0
    //   4548: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   4551: ifnull +16 -> 4567
    //   4554: aload_0
    //   4555: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   4558: invokevirtual 550	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   4561: pop
    //   4562: aload_0
    //   4563: aconst_null
    //   4564: putfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   4567: aload_0
    //   4568: getfield 309	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   4571: ifnull +12 -> 4583
    //   4574: aload_0
    //   4575: getfield 309	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   4578: invokeinterface 1032 1 0
    //   4583: aload_0
    //   4584: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   4587: ifnull -4302 -> 285
    //   4590: aload_0
    //   4591: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   4594: invokevirtual 1033	android/media/AudioTrack:stop	()V
    //   4597: aload_0
    //   4598: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   4601: invokevirtual 1035	android/media/AudioTrack:flush	()V
    //   4604: aload_0
    //   4605: lconst_0
    //   4606: putfield 196	com/tencent/qqmusic/mediaplayer/CorePlayer:mCurrentFrameCount	J
    //   4609: aload_0
    //   4610: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   4613: invokevirtual 517	android/media/AudioTrack:release	()V
    //   4616: aload_0
    //   4617: invokespecial 1037	com/tencent/qqmusic/mediaplayer/CorePlayer:destroyAudioListeners	()V
    //   4620: aload_0
    //   4621: aconst_null
    //   4622: putfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   4625: ldc 51
    //   4627: aload_0
    //   4628: ldc_w 1039
    //   4631: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   4634: invokestatic 376	com/tencent/qqmusic/mediaplayer/util/Logger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   4637: return
    //   4638: astore 20
    //   4640: ldc 51
    //   4642: aload_0
    //   4643: new 325	java/lang/StringBuilder
    //   4646: dup
    //   4647: ldc_w 1052
    //   4650: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   4653: aload 20
    //   4655: invokevirtual 1055	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   4658: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4661: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4664: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   4667: aload 20
    //   4669: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   4672: goto -700 -> 3972
    //   4675: astore 20
    //   4677: ldc 51
    //   4679: aload_0
    //   4680: new 325	java/lang/StringBuilder
    //   4683: dup
    //   4684: ldc_w 1057
    //   4687: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   4690: aload 20
    //   4692: invokevirtual 1058	java/io/IOException:getMessage	()Ljava/lang/String;
    //   4695: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4698: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4701: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   4704: aload 20
    //   4706: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   4709: goto -721 -> 3988
    //   4712: astore 20
    //   4714: ldc 51
    //   4716: aload 20
    //   4718: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   4721: goto -719 -> 4002
    //   4724: astore 20
    //   4726: ldc 51
    //   4728: aload 20
    //   4730: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   4733: goto -724 -> 4009
    //   4736: astore 20
    //   4738: ldc 51
    //   4740: aload 20
    //   4742: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   4745: goto -724 -> 4021
    //   4748: astore 20
    //   4750: ldc 51
    //   4752: ldc_w 1060
    //   4755: aload 20
    //   4757: invokestatic 1062	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   4760: goto -735 -> 4025
    //   4763: astore 20
    //   4765: ldc 51
    //   4767: aload 20
    //   4769: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   4772: aload_0
    //   4773: getfield 161	com/tencent/qqmusic/mediaplayer/CorePlayer:mStateRunner	Lcom/tencent/qqmusic/mediaplayer/StateRunner;
    //   4776: bipush 9
    //   4778: invokestatic 156	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   4781: invokevirtual 323	com/tencent/qqmusic/mediaplayer/StateRunner:transfer	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4784: pop
    //   4785: aload_0
    //   4786: bipush 92
    //   4788: bipush 67
    //   4790: invokevirtual 387	com/tencent/qqmusic/mediaplayer/CorePlayer:callExceptionCallback	(II)V
    //   4793: ldc 51
    //   4795: aload_0
    //   4796: new 325	java/lang/StringBuilder
    //   4799: dup
    //   4800: ldc_w 1018
    //   4803: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   4806: aload_0
    //   4807: getfield 175	com/tencent/qqmusic/mediaplayer/CorePlayer:mIsExit	Z
    //   4810: invokevirtual 1021	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   4813: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4816: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   4819: invokestatic 350	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   4822: aload_0
    //   4823: getfield 192	com/tencent/qqmusic/mediaplayer/CorePlayer:monitor	Lcom/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor;
    //   4826: ifnull +10 -> 4836
    //   4829: aload_0
    //   4830: getfield 192	com/tencent/qqmusic/mediaplayer/CorePlayer:monitor	Lcom/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor;
    //   4833: invokevirtual 1026	com/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor:stop	()V
    //   4836: invokestatic 1029	com/tencent/qqmusic/mediaplayer/util/CpuInfoUtil:stopProcessInfoOutput	()V
    //   4839: aload_0
    //   4840: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   4843: ifnull +16 -> 4859
    //   4846: aload_0
    //   4847: getfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   4850: invokevirtual 550	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   4853: pop
    //   4854: aload_0
    //   4855: aconst_null
    //   4856: putfield 319	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   4859: aload_0
    //   4860: getfield 309	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   4863: ifnull +12 -> 4875
    //   4866: aload_0
    //   4867: getfield 309	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   4870: invokeinterface 1032 1 0
    //   4875: aload_0
    //   4876: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   4879: ifnull -4594 -> 285
    //   4882: aload_0
    //   4883: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   4886: invokevirtual 1033	android/media/AudioTrack:stop	()V
    //   4889: aload_0
    //   4890: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   4893: invokevirtual 1035	android/media/AudioTrack:flush	()V
    //   4896: aload_0
    //   4897: lconst_0
    //   4898: putfield 196	com/tencent/qqmusic/mediaplayer/CorePlayer:mCurrentFrameCount	J
    //   4901: aload_0
    //   4902: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   4905: invokevirtual 517	android/media/AudioTrack:release	()V
    //   4908: aload_0
    //   4909: invokespecial 1037	com/tencent/qqmusic/mediaplayer/CorePlayer:destroyAudioListeners	()V
    //   4912: aload_0
    //   4913: aconst_null
    //   4914: putfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   4917: ldc 51
    //   4919: aload_0
    //   4920: ldc_w 1039
    //   4923: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   4926: invokestatic 376	com/tencent/qqmusic/mediaplayer/util/Logger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   4929: return
    //   4930: astore 20
    //   4932: ldc 51
    //   4934: aload_0
    //   4935: new 325	java/lang/StringBuilder
    //   4938: dup
    //   4939: ldc_w 1052
    //   4942: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   4945: aload 20
    //   4947: invokevirtual 1055	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   4950: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4953: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4956: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   4959: aload 20
    //   4961: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   4964: goto -105 -> 4859
    //   4967: astore 20
    //   4969: ldc 51
    //   4971: aload_0
    //   4972: new 325	java/lang/StringBuilder
    //   4975: dup
    //   4976: ldc_w 1057
    //   4979: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   4982: aload 20
    //   4984: invokevirtual 1058	java/io/IOException:getMessage	()Ljava/lang/String;
    //   4987: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4990: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4993: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   4996: aload 20
    //   4998: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5001: goto -126 -> 4875
    //   5004: astore 20
    //   5006: ldc 51
    //   5008: aload 20
    //   5010: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5013: goto -124 -> 4889
    //   5016: astore 20
    //   5018: ldc 51
    //   5020: aload 20
    //   5022: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5025: goto -129 -> 4896
    //   5028: astore 20
    //   5030: ldc 51
    //   5032: aload 20
    //   5034: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5037: goto -129 -> 4908
    //   5040: astore 20
    //   5042: ldc 51
    //   5044: ldc_w 1060
    //   5047: aload 20
    //   5049: invokestatic 1062	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5052: goto -140 -> 4912
    //   5055: iload_2
    //   5056: iconst_1
    //   5057: isub
    //   5058: istore_2
    //   5059: goto -699 -> 4360
    //   5062: astore 20
    //   5064: ldc 51
    //   5066: aload_0
    //   5067: new 325	java/lang/StringBuilder
    //   5070: dup
    //   5071: ldc_w 1052
    //   5074: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   5077: aload 20
    //   5079: invokevirtual 1055	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   5082: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5085: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5088: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   5091: aload 20
    //   5093: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5096: goto -529 -> 4567
    //   5099: astore 20
    //   5101: ldc 51
    //   5103: aload_0
    //   5104: new 325	java/lang/StringBuilder
    //   5107: dup
    //   5108: ldc_w 1057
    //   5111: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   5114: aload 20
    //   5116: invokevirtual 1058	java/io/IOException:getMessage	()Ljava/lang/String;
    //   5119: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5122: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5125: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   5128: aload 20
    //   5130: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5133: goto -550 -> 4583
    //   5136: astore 20
    //   5138: ldc 51
    //   5140: aload 20
    //   5142: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5145: goto -548 -> 4597
    //   5148: astore 20
    //   5150: ldc 51
    //   5152: aload 20
    //   5154: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5157: goto -553 -> 4604
    //   5160: astore 20
    //   5162: ldc 51
    //   5164: aload 20
    //   5166: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5169: goto -553 -> 4616
    //   5172: astore 20
    //   5174: ldc 51
    //   5176: ldc_w 1060
    //   5179: aload 20
    //   5181: invokestatic 1062	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5184: goto -564 -> 4620
    //   5187: iload_2
    //   5188: aload_0
    //   5189: getfield 228	com/tencent/qqmusic/mediaplayer/CorePlayer:mDTSBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   5192: getfield 732	com/tencent/qqmusic/mediaplayer/BufferInfo:bufferSize	I
    //   5195: if_icmpeq +45 -> 5240
    //   5198: ldc 51
    //   5200: aload_0
    //   5201: new 325	java/lang/StringBuilder
    //   5204: dup
    //   5205: ldc_w 1226
    //   5208: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   5211: iload_2
    //   5212: invokevirtual 359	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   5215: ldc_w 1224
    //   5218: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5221: aload_0
    //   5222: getfield 228	com/tencent/qqmusic/mediaplayer/CorePlayer:mDTSBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   5225: getfield 732	com/tencent/qqmusic/mediaplayer/BufferInfo:bufferSize	I
    //   5228: invokevirtual 359	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   5231: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5234: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   5237: invokestatic 1199	com/tencent/qqmusic/mediaplayer/util/Logger:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   5240: iload 4
    //   5242: aload_0
    //   5243: getfield 228	com/tencent/qqmusic/mediaplayer/CorePlayer:mDTSBufferInfo	Lcom/tencent/qqmusic/mediaplayer/BufferInfo;
    //   5246: getfield 732	com/tencent/qqmusic/mediaplayer/BufferInfo:bufferSize	I
    //   5249: iadd
    //   5250: istore_3
    //   5251: aload_0
    //   5252: getfield 486	com/tencent/qqmusic/mediaplayer/CorePlayer:mAudioTrack	Landroid/media/AudioTrack;
    //   5255: invokevirtual 698	android/media/AudioTrack:getPlaybackHeadPosition	()I
    //   5258: istore_2
    //   5259: goto +456 -> 5715
    //   5262: aload_0
    //   5263: iload 6
    //   5265: invokespecial 1228	com/tencent/qqmusic/mediaplayer/CorePlayer:decodeEndOrFailed	(I)Z
    //   5268: pop
    //   5269: lload 10
    //   5271: lstore 14
    //   5273: lload 12
    //   5275: lstore 10
    //   5277: lload 14
    //   5279: lstore 12
    //   5281: iload 4
    //   5283: istore_2
    //   5284: goto -3452 -> 1832
    //   5287: astore 20
    //   5289: ldc 51
    //   5291: aload_0
    //   5292: new 325	java/lang/StringBuilder
    //   5295: dup
    //   5296: ldc_w 1052
    //   5299: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   5302: aload 20
    //   5304: invokevirtual 1055	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   5307: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5310: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5313: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   5316: aload 20
    //   5318: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5321: goto -2039 -> 3282
    //   5324: astore 20
    //   5326: ldc 51
    //   5328: aload_0
    //   5329: new 325	java/lang/StringBuilder
    //   5332: dup
    //   5333: ldc_w 1057
    //   5336: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   5339: aload 20
    //   5341: invokevirtual 1058	java/io/IOException:getMessage	()Ljava/lang/String;
    //   5344: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5347: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5350: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   5353: aload 20
    //   5355: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5358: goto -2060 -> 3298
    //   5361: astore 20
    //   5363: ldc 51
    //   5365: aload 20
    //   5367: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5370: goto -2058 -> 3312
    //   5373: astore 20
    //   5375: ldc 51
    //   5377: aload 20
    //   5379: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5382: goto -2063 -> 3319
    //   5385: astore 20
    //   5387: ldc 51
    //   5389: aload 20
    //   5391: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5394: goto -2063 -> 3331
    //   5397: astore 20
    //   5399: ldc 51
    //   5401: ldc_w 1060
    //   5404: aload 20
    //   5406: invokestatic 1062	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5409: goto -2074 -> 3335
    //   5412: astore 20
    //   5414: ldc 51
    //   5416: aload_0
    //   5417: new 325	java/lang/StringBuilder
    //   5420: dup
    //   5421: ldc_w 1052
    //   5424: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   5427: aload 20
    //   5429: invokevirtual 1055	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   5432: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5435: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5438: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   5441: aload 20
    //   5443: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5446: goto -2834 -> 2612
    //   5449: astore 20
    //   5451: ldc 51
    //   5453: aload_0
    //   5454: new 325	java/lang/StringBuilder
    //   5457: dup
    //   5458: ldc_w 1057
    //   5461: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   5464: aload 20
    //   5466: invokevirtual 1058	java/io/IOException:getMessage	()Ljava/lang/String;
    //   5469: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5472: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5475: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   5478: aload 20
    //   5480: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5483: goto -2855 -> 2628
    //   5486: astore 20
    //   5488: ldc 51
    //   5490: aload 20
    //   5492: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5495: goto -2853 -> 2642
    //   5498: astore 20
    //   5500: ldc 51
    //   5502: aload 20
    //   5504: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5507: goto -2858 -> 2649
    //   5510: astore 20
    //   5512: ldc 51
    //   5514: aload 20
    //   5516: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5519: goto -2858 -> 2661
    //   5522: astore 20
    //   5524: ldc 51
    //   5526: ldc_w 1060
    //   5529: aload 20
    //   5531: invokestatic 1062	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5534: goto -2869 -> 2665
    //   5537: astore 21
    //   5539: ldc 51
    //   5541: aload_0
    //   5542: new 325	java/lang/StringBuilder
    //   5545: dup
    //   5546: ldc_w 1052
    //   5549: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   5552: aload 21
    //   5554: invokevirtual 1055	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   5557: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5560: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5563: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   5566: aload 21
    //   5568: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5571: goto -4905 -> 666
    //   5574: astore 21
    //   5576: ldc 51
    //   5578: aload_0
    //   5579: new 325	java/lang/StringBuilder
    //   5582: dup
    //   5583: ldc_w 1057
    //   5586: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   5589: aload 21
    //   5591: invokevirtual 1058	java/io/IOException:getMessage	()Ljava/lang/String;
    //   5594: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5597: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5600: invokespecial 346	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   5603: aload 21
    //   5605: invokestatic 298	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5608: goto -4926 -> 682
    //   5611: astore 21
    //   5613: ldc 51
    //   5615: aload 21
    //   5617: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5620: goto -4924 -> 696
    //   5623: astore 21
    //   5625: ldc 51
    //   5627: aload 21
    //   5629: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5632: goto -4929 -> 703
    //   5635: astore 21
    //   5637: ldc 51
    //   5639: aload 21
    //   5641: invokestatic 416	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5644: goto -4929 -> 715
    //   5647: astore 21
    //   5649: ldc 51
    //   5651: ldc_w 1060
    //   5654: aload 21
    //   5656: invokestatic 1062	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   5659: goto -4940 -> 719
    //   5662: aload_0
    //   5663: getfield 251	com/tencent/qqmusic/mediaplayer/CorePlayer:mCallback	Lcom/tencent/qqmusic/mediaplayer/PlayerCallback;
    //   5666: invokeinterface 1231 1 0
    //   5671: goto -2951 -> 2720
    //   5674: iload_3
    //   5675: istore_2
    //   5676: iload 4
    //   5678: istore_3
    //   5679: goto +36 -> 5715
    //   5682: iconst_0
    //   5683: istore_2
    //   5684: goto -1277 -> 4407
    //   5687: goto -1437 -> 4250
    //   5690: ldc_w 1232
    //   5693: istore 6
    //   5695: lload 12
    //   5697: lstore 14
    //   5699: lload 10
    //   5701: lstore 12
    //   5703: lload 14
    //   5705: lstore 10
    //   5707: goto -1519 -> 4188
    //   5710: iconst_0
    //   5711: istore_2
    //   5712: goto -2770 -> 2942
    //   5715: iload_3
    //   5716: istore 4
    //   5718: lload 10
    //   5720: lstore 14
    //   5722: lload 12
    //   5724: lstore 10
    //   5726: lload 14
    //   5728: lstore 12
    //   5730: iload_2
    //   5731: istore_3
    //   5732: iload 4
    //   5734: istore_2
    //   5735: goto -3903 -> 1832
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	5738	0	this	CorePlayer
    //   78	4106	1	i	int
    //   1829	3906	2	j	int
    //   1831	3901	3	k	int
    //   1840	3893	4	m	int
    //   1917	2265	5	n	int
    //   3597	2097	6	i1	int
    //   940	3	7	bool	boolean
    //   1823	2426	8	l1	long
    //   1826	3899	10	l2	long
    //   1818	3911	12	l3	long
    //   3604	2123	14	l4	long
    //   3608	628	16	l5	long
    //   3626	71	18	l6	long
    //   44	3	20	localBaseDecoder	BaseDecoder
    //   334	81	20	localThrowable1	Throwable
    //   598	139	20	localObject1	Object
    //   739	30	20	localThrowable2	Throwable
    //   776	30	20	localIOException1	java.io.IOException
    //   813	5	20	localThrowable3	Throwable
    //   825	5	20	localThrowable4	Throwable
    //   837	5	20	localThrowable5	Throwable
    //   849	8	20	localThrowable6	Throwable
    //   1125	30	20	localThrowable7	Throwable
    //   1162	30	20	localIOException2	java.io.IOException
    //   1199	5	20	localThrowable8	Throwable
    //   1211	5	20	localThrowable9	Throwable
    //   1223	5	20	localThrowable10	Throwable
    //   1235	8	20	localThrowable11	Throwable
    //   1250	30	20	localThrowable12	Throwable
    //   1287	30	20	localIOException3	java.io.IOException
    //   1324	5	20	localThrowable13	Throwable
    //   1336	5	20	localThrowable14	Throwable
    //   1348	5	20	localThrowable15	Throwable
    //   1360	8	20	localThrowable16	Throwable
    //   1545	30	20	localThrowable17	Throwable
    //   1582	30	20	localIOException4	java.io.IOException
    //   1619	5	20	localThrowable18	Throwable
    //   1631	5	20	localThrowable19	Throwable
    //   1643	5	20	localThrowable20	Throwable
    //   1655	8	20	localThrowable21	Throwable
    //   1670	5	20	localSoNotFindException1	SoNotFindException
    //   1846	67	20	localStack	Stack
    //   2404	30	20	localThrowable22	Throwable
    //   2441	30	20	localIOException5	java.io.IOException
    //   2478	5	20	localThrowable23	Throwable
    //   2490	5	20	localThrowable24	Throwable
    //   2502	5	20	localThrowable25	Throwable
    //   2514	18	20	localThrowable26	Throwable
    //   2537	5	20	localThrowable27	Throwable
    //   2752	30	20	localThrowable28	Throwable
    //   2789	30	20	localIOException6	java.io.IOException
    //   2826	5	20	localThrowable29	Throwable
    //   2838	5	20	localThrowable30	Throwable
    //   2850	5	20	localThrowable31	Throwable
    //   2862	8	20	localThrowable32	Throwable
    //   3365	5	20	localObject2	Object
    //   3401	389	20	localObject3	Object
    //   3876	170	20	localSoNotFindException2	SoNotFindException
    //   4377	13	20	localIAudioListener	IAudioListener
    //   4638	30	20	localThrowable33	Throwable
    //   4675	30	20	localIOException7	java.io.IOException
    //   4712	5	20	localThrowable34	Throwable
    //   4724	5	20	localThrowable35	Throwable
    //   4736	5	20	localThrowable36	Throwable
    //   4748	8	20	localThrowable37	Throwable
    //   4763	5	20	localThrowable38	Throwable
    //   4930	30	20	localThrowable39	Throwable
    //   4967	30	20	localIOException8	java.io.IOException
    //   5004	5	20	localThrowable40	Throwable
    //   5016	5	20	localThrowable41	Throwable
    //   5028	5	20	localThrowable42	Throwable
    //   5040	8	20	localThrowable43	Throwable
    //   5062	30	20	localThrowable44	Throwable
    //   5099	30	20	localIOException9	java.io.IOException
    //   5136	5	20	localThrowable45	Throwable
    //   5148	5	20	localThrowable46	Throwable
    //   5160	5	20	localThrowable47	Throwable
    //   5172	8	20	localThrowable48	Throwable
    //   5287	30	20	localThrowable49	Throwable
    //   5324	30	20	localIOException10	java.io.IOException
    //   5361	5	20	localThrowable50	Throwable
    //   5373	5	20	localThrowable51	Throwable
    //   5385	5	20	localThrowable52	Throwable
    //   5397	8	20	localThrowable53	Throwable
    //   5412	30	20	localThrowable54	Throwable
    //   5449	30	20	localIOException11	java.io.IOException
    //   5486	5	20	localThrowable55	Throwable
    //   5498	5	20	localThrowable56	Throwable
    //   5510	5	20	localThrowable57	Throwable
    //   5522	8	20	localThrowable58	Throwable
    //   2529	6	21	localObject4	Object
    //   4043	6	21	localObject5	Object
    //   5537	30	21	localThrowable59	Throwable
    //   5574	30	21	localIOException12	java.io.IOException
    //   5611	5	21	localThrowable60	Throwable
    //   5623	5	21	localThrowable61	Throwable
    //   5635	5	21	localThrowable62	Throwable
    //   5647	8	21	localThrowable63	Throwable
    // Exception table:
    //   from	to	target	type
    //   51	105	334	java/lang/Throwable
    //   109	149	334	java/lang/Throwable
    //   286	331	334	java/lang/Throwable
    //   556	595	334	java/lang/Throwable
    //   864	888	334	java/lang/Throwable
    //   888	918	334	java/lang/Throwable
    //   918	929	334	java/lang/Throwable
    //   34	46	598	finally
    //   51	105	598	finally
    //   109	149	598	finally
    //   286	331	598	finally
    //   339	347	598	finally
    //   350	412	598	finally
    //   412	419	598	finally
    //   556	595	598	finally
    //   864	888	598	finally
    //   888	918	598	finally
    //   918	929	598	finally
    //   929	942	598	finally
    //   947	988	598	finally
    //   1375	1408	598	finally
    //   1672	1679	598	finally
    //   1679	1775	598	finally
    //   1775	1815	598	finally
    //   1820	1825	598	finally
    //   1832	1839	598	finally
    //   1842	1851	598	finally
    //   1928	1980	598	finally
    //   1988	2037	598	finally
    //   2042	2090	598	finally
    //   2227	2267	598	finally
    //   2534	2537	598	finally
    //   2539	2546	598	finally
    //   2877	2939	598	finally
    //   2942	2975	598	finally
    //   2978	3003	598	finally
    //   3003	3048	598	finally
    //   3054	3061	598	finally
    //   3064	3105	598	finally
    //   3109	3130	598	finally
    //   3135	3198	598	finally
    //   3202	3204	598	finally
    //   3369	3372	598	finally
    //   3372	3397	598	finally
    //   3397	3406	598	finally
    //   3519	3525	598	finally
    //   3530	3596	598	finally
    //   3618	3671	598	finally
    //   3688	3702	598	finally
    //   3717	3753	598	finally
    //   3765	3799	598	finally
    //   3823	3865	598	finally
    //   3878	3906	598	finally
    //   4048	4051	598	finally
    //   4061	4102	598	finally
    //   4102	4110	598	finally
    //   4122	4144	598	finally
    //   4147	4174	598	finally
    //   4188	4206	598	finally
    //   4206	4211	598	finally
    //   4227	4243	598	finally
    //   4250	4281	598	finally
    //   4281	4360	598	finally
    //   4364	4405	598	finally
    //   4411	4434	598	finally
    //   4438	4501	598	finally
    //   4765	4793	598	finally
    //   5187	5240	598	finally
    //   5240	5259	598	finally
    //   5262	5269	598	finally
    //   202	215	739	java/lang/Throwable
    //   222	231	776	java/io/IOException
    //   238	245	813	java/lang/Throwable
    //   245	252	825	java/lang/Throwable
    //   257	264	837	java/lang/Throwable
    //   264	268	849	java/lang/Throwable
    //   472	485	1125	java/lang/Throwable
    //   492	501	1162	java/io/IOException
    //   508	515	1199	java/lang/Throwable
    //   515	522	1211	java/lang/Throwable
    //   527	534	1223	java/lang/Throwable
    //   534	538	1235	java/lang/Throwable
    //   1041	1054	1250	java/lang/Throwable
    //   1061	1070	1287	java/io/IOException
    //   1077	1084	1324	java/lang/Throwable
    //   1084	1091	1336	java/lang/Throwable
    //   1096	1103	1348	java/lang/Throwable
    //   1103	1107	1360	java/lang/Throwable
    //   1461	1474	1545	java/lang/Throwable
    //   1481	1490	1582	java/io/IOException
    //   1497	1504	1619	java/lang/Throwable
    //   1504	1511	1631	java/lang/Throwable
    //   1516	1523	1643	java/lang/Throwable
    //   1523	1527	1655	java/lang/Throwable
    //   947	988	1670	com/tencent/qqmusic/mediaplayer/SoNotFindException
    //   1375	1408	1670	com/tencent/qqmusic/mediaplayer/SoNotFindException
    //   2320	2333	2404	java/lang/Throwable
    //   2340	2349	2441	java/io/IOException
    //   2356	2363	2478	java/lang/Throwable
    //   2363	2370	2490	java/lang/Throwable
    //   2375	2382	2502	java/lang/Throwable
    //   2382	2386	2514	java/lang/Throwable
    //   1851	1912	2529	finally
    //   1912	1915	2529	finally
    //   2531	2534	2529	finally
    //   34	46	2537	java/lang/Throwable
    //   339	347	2537	java/lang/Throwable
    //   350	412	2537	java/lang/Throwable
    //   412	419	2537	java/lang/Throwable
    //   929	942	2537	java/lang/Throwable
    //   947	988	2537	java/lang/Throwable
    //   1375	1408	2537	java/lang/Throwable
    //   1672	1679	2537	java/lang/Throwable
    //   1679	1775	2537	java/lang/Throwable
    //   1775	1815	2537	java/lang/Throwable
    //   1820	1825	2537	java/lang/Throwable
    //   1832	1839	2537	java/lang/Throwable
    //   1842	1851	2537	java/lang/Throwable
    //   1928	1980	2537	java/lang/Throwable
    //   1988	2037	2537	java/lang/Throwable
    //   2042	2090	2537	java/lang/Throwable
    //   2227	2267	2537	java/lang/Throwable
    //   2534	2537	2537	java/lang/Throwable
    //   2877	2939	2537	java/lang/Throwable
    //   2942	2975	2537	java/lang/Throwable
    //   2978	3003	2537	java/lang/Throwable
    //   3003	3048	2537	java/lang/Throwable
    //   3054	3061	2537	java/lang/Throwable
    //   3064	3105	2537	java/lang/Throwable
    //   3109	3130	2537	java/lang/Throwable
    //   3135	3198	2537	java/lang/Throwable
    //   3202	3204	2537	java/lang/Throwable
    //   3369	3372	2537	java/lang/Throwable
    //   3372	3397	2537	java/lang/Throwable
    //   3397	3406	2537	java/lang/Throwable
    //   3519	3525	2537	java/lang/Throwable
    //   3878	3906	2537	java/lang/Throwable
    //   4048	4051	2537	java/lang/Throwable
    //   4188	4206	2537	java/lang/Throwable
    //   4206	4211	2537	java/lang/Throwable
    //   4227	4243	2537	java/lang/Throwable
    //   4250	4281	2537	java/lang/Throwable
    //   4281	4360	2537	java/lang/Throwable
    //   4364	4405	2537	java/lang/Throwable
    //   4411	4434	2537	java/lang/Throwable
    //   4438	4501	2537	java/lang/Throwable
    //   4765	4793	2537	java/lang/Throwable
    //   5187	5240	2537	java/lang/Throwable
    //   5240	5259	2537	java/lang/Throwable
    //   5262	5269	2537	java/lang/Throwable
    //   2143	2156	2752	java/lang/Throwable
    //   2163	2172	2789	java/io/IOException
    //   2179	2186	2826	java/lang/Throwable
    //   2186	2193	2838	java/lang/Throwable
    //   2198	2205	2850	java/lang/Throwable
    //   2205	2209	2862	java/lang/Throwable
    //   3208	3216	3365	finally
    //   3367	3369	3365	finally
    //   3530	3596	3876	com/tencent/qqmusic/mediaplayer/SoNotFindException
    //   3618	3671	3876	com/tencent/qqmusic/mediaplayer/SoNotFindException
    //   3688	3702	3876	com/tencent/qqmusic/mediaplayer/SoNotFindException
    //   3717	3753	3876	com/tencent/qqmusic/mediaplayer/SoNotFindException
    //   3765	3799	3876	com/tencent/qqmusic/mediaplayer/SoNotFindException
    //   3823	3865	3876	com/tencent/qqmusic/mediaplayer/SoNotFindException
    //   4061	4102	3876	com/tencent/qqmusic/mediaplayer/SoNotFindException
    //   4102	4110	3876	com/tencent/qqmusic/mediaplayer/SoNotFindException
    //   4122	4144	3876	com/tencent/qqmusic/mediaplayer/SoNotFindException
    //   4147	4174	3876	com/tencent/qqmusic/mediaplayer/SoNotFindException
    //   3406	3511	4043	finally
    //   3511	3519	4043	finally
    //   4045	4048	4043	finally
    //   3959	3972	4638	java/lang/Throwable
    //   3979	3988	4675	java/io/IOException
    //   3995	4002	4712	java/lang/Throwable
    //   4002	4009	4724	java/lang/Throwable
    //   4014	4021	4736	java/lang/Throwable
    //   4021	4025	4748	java/lang/Throwable
    //   3530	3596	4763	java/lang/Throwable
    //   3618	3671	4763	java/lang/Throwable
    //   3688	3702	4763	java/lang/Throwable
    //   3717	3753	4763	java/lang/Throwable
    //   3765	3799	4763	java/lang/Throwable
    //   3823	3865	4763	java/lang/Throwable
    //   4061	4102	4763	java/lang/Throwable
    //   4102	4110	4763	java/lang/Throwable
    //   4122	4144	4763	java/lang/Throwable
    //   4147	4174	4763	java/lang/Throwable
    //   4846	4859	4930	java/lang/Throwable
    //   4866	4875	4967	java/io/IOException
    //   4882	4889	5004	java/lang/Throwable
    //   4889	4896	5016	java/lang/Throwable
    //   4901	4908	5028	java/lang/Throwable
    //   4908	4912	5040	java/lang/Throwable
    //   4554	4567	5062	java/lang/Throwable
    //   4574	4583	5099	java/io/IOException
    //   4590	4597	5136	java/lang/Throwable
    //   4597	4604	5148	java/lang/Throwable
    //   4609	4616	5160	java/lang/Throwable
    //   4616	4620	5172	java/lang/Throwable
    //   3269	3282	5287	java/lang/Throwable
    //   3289	3298	5324	java/io/IOException
    //   3305	3312	5361	java/lang/Throwable
    //   3312	3319	5373	java/lang/Throwable
    //   3324	3331	5385	java/lang/Throwable
    //   3331	3335	5397	java/lang/Throwable
    //   2599	2612	5412	java/lang/Throwable
    //   2619	2628	5449	java/io/IOException
    //   2635	2642	5486	java/lang/Throwable
    //   2642	2649	5498	java/lang/Throwable
    //   2654	2661	5510	java/lang/Throwable
    //   2661	2665	5522	java/lang/Throwable
    //   653	666	5537	java/lang/Throwable
    //   673	682	5574	java/io/IOException
    //   689	696	5611	java/lang/Throwable
    //   696	703	5623	java/lang/Throwable
    //   708	715	5635	java/lang/Throwable
    //   715	719	5647	java/lang/Throwable
  }
  
  public void seek(int paramInt)
  {
    if (this.mMediaHTTPManager != null)
    {
      if ((this.mOnlineSeekHandler == null) || (this.mOnlineSeekHandlerThread == null) || (!this.mOnlineSeekHandlerThread.isAlive()))
      {
        this.mOnlineSeekHandlerThread = new HandlerThread("CorePlayer_online_seek_handler_thread");
        this.mOnlineSeekHandlerThread.start();
        this.mOnlineSeekHandler = new OnlineSeekHandler(this.mOnlineSeekHandlerThread.getLooper(), this);
      }
      this.mOnlineSeekHandler.removeMessages(49);
      Message.obtain(this.mOnlineSeekHandler, 49, Long.valueOf(paramInt)).sendToTarget();
      return;
    }
    addSeekRecord(paramInt);
    refreshTimeAndNotify(paramInt);
  }
  
  void setAudioStreamType(int paramInt)
  {
    if (paramInt == this.mAudioStreamType) {}
    for (;;)
    {
      return;
      try
      {
        this.mAudioStreamType = paramInt;
        if (this.mAudioTrack == null) {
          continue;
        }
        AudioTrack localAudioTrack = new AudioTrack(paramInt, this.mAudioTrack.getSampleRate(), this.mAudioTrack.getChannelConfiguration(), this.mAudioTrack.getAudioFormat(), this.mTrackBufferSizeInByte, 1);
        int i = this.mAudioTrack.getPlayState();
        if (i == 3) {
          pause();
        }
        this.mAudioTrack.release();
        this.mAudioTrack = localAudioTrack;
        if (i != 3) {
          continue;
        }
        play();
        return;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        Logger.e("CorePlayer", "failed in setting audio stream type to :" + paramInt, localIllegalArgumentException);
        return;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        for (;;) {}
      }
    }
  }
  
  void setFileLength(long paramLong)
  {
    Logger.i("CorePlayer", "[setFileLength] length: " + paramLong);
    this.mFileLength = paramLong;
    try
    {
      if ((this.mDecoder != null) && ((this.mDecoder instanceof MP3Decoder)))
      {
        ((MP3Decoder)this.mDecoder).setFileTotalLength(paramLong);
        this.mInformation = this.mDecoder.getAudioInformation();
      }
      return;
    }
    catch (Throwable localThrowable)
    {
      Logger.e("CorePlayer", localThrowable);
    }
  }
  
  void setThreadName(String paramString)
  {
    this.mThreadName = paramString;
  }
  
  void setVolume(float paramFloat1, float paramFloat2)
  {
    if (this.mAudioTrack != null) {
      this.mAudioTrack.setStereoVolume(paramFloat1, paramFloat2);
    }
  }
  
  void stop()
  {
    Logger.i("CorePlayer", axiliary("stop"));
    if ((this.mStateRunner.transfer(Integer.valueOf(6), new Integer[] { Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(2) })) && (this.mSignalControl.isWaiting()))
    {
      Logger.d("CorePlayer", axiliary("lock is Waiting, event: stop, doNotify"));
      this.mSignalControl.doNotify();
    }
    synchronized (this.bufferLock)
    {
      this.bufferLock.notifyAll();
      return;
    }
  }
  
  private static class OnlineSeekHandler
    extends Handler
  {
    private boolean mIsLastSeekPlaying = false;
    private final WeakReference<CorePlayer> mPlayer;
    
    OnlineSeekHandler(Looper paramLooper, CorePlayer paramCorePlayer)
    {
      super();
      this.mPlayer = new WeakReference(paramCorePlayer);
    }
    
    public void handleMessage(Message paramMessage)
    {
      final CorePlayer localCorePlayer = (CorePlayer)this.mPlayer.get();
      if (localCorePlayer != null) {
        switch (paramMessage.what)
        {
        }
      }
      label220:
      int i;
      do
      {
        do
        {
          AudioInformation localAudioInformation;
          do
          {
            return;
            localAudioInformation = localCorePlayer.getCurrentAudioInformation();
          } while ((!(paramMessage.obj instanceof Long)) || (localAudioInformation == null) || (localCorePlayer.mMediaHTTPManager == null));
          final long l3 = ((Long)paramMessage.obj).longValue();
          boolean bool = localCorePlayer.isPlaying();
          if (!localCorePlayer.isPaused())
          {
            if (bool)
            {
              this.mIsLastSeekPlaying = true;
              localCorePlayer.pause();
            }
          }
          else
          {
            long l2 = localCorePlayer.getFileOffsetAndUpdateAdjustLength(l3, (int)localCorePlayer.getCurrentAudioInformation().getBitrate());
            l1 = l2;
            if (l2 >= localCorePlayer.mFileLength) {
              l1 = localCorePlayer.mFileLength - localCorePlayer.mAdjustLength;
            }
            if (l1 - localCorePlayer.mAdjustLength >= 0L) {
              break label220;
            }
          }
          for (long l1 = 0L;; l1 -= localCorePlayer.mAdjustLength)
          {
            localCorePlayer.mMediaHTTPManager.seekByBytePosition(l1);
            localCorePlayer.mMediaHTTPManager.setBufferListener(new MediaHTTPManager.OnBufferListener()
            {
              public void onBufferProgress(long paramAnonymousLong1, long paramAnonymousLong2)
              {
                localCorePlayer.notifyDownloadProgress(paramAnonymousLong1, paramAnonymousLong2);
              }
              
              public void onBufferReadyToPlay()
              {
                CorePlayer.OnlineSeekHandler.this.removeMessages(50);
                localCorePlayer.addSeekRecord((int)l3);
                Message localMessage = Message.obtain(CorePlayer.OnlineSeekHandler.this, 50);
                localMessage.arg1 = ((int)l3);
                localMessage.obj = Boolean.valueOf(CorePlayer.OnlineSeekHandler.this.mIsLastSeekPlaying);
                CorePlayer.OnlineSeekHandler.this.sendMessageDelayed(localMessage, 100L);
              }
            });
            removeMessages(50);
            return;
            this.mIsLastSeekPlaying = false;
            break;
          }
        } while (!(paramMessage.obj instanceof Boolean));
        i = paramMessage.arg1;
        if (((Boolean)paramMessage.obj).booleanValue())
        {
          this.mIsLastSeekPlaying = false;
          localCorePlayer.play();
          localCorePlayer.refreshTimeAndNotify(i);
          return;
        }
      } while (!localCorePlayer.mStateRunner.transfer(Integer.valueOf(5), new Integer[] { Integer.valueOf(4), Integer.valueOf(2) }));
      localCorePlayer.refreshTimeAndNotify(i);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\CorePlayer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */