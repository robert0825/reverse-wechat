package com.tencent.liteav.audio.impl.Render;

import android.media.AudioTrack;
import com.tencent.liteav.basic.log.TXCLog;
import java.util.concurrent.LinkedBlockingQueue;

public class TXCAudioRender
{
  private static final int BLOCK_TIME_OUT_MS = 20;
  private static final int DROP_THRESHOLD_INTERVAL_MS = 350;
  private static final int STOP_DROP_THRESHOLD_INTERVAL_MS = 200;
  private static final String TAG = TXCAudioRender.class.getSimpleName();
  private Thread mAudioThread;
  public AudioTrack mAudioTrack;
  public int mBits = 16;
  public int mChannel = 1;
  private boolean mIsInit = false;
  public TXIAudioRenderListener mListener = null;
  public boolean mLoop = true;
  public int mMinBufferLength = 0;
  public long mMinCacheTime = 0L;
  public boolean mMute = false;
  public LinkedBlockingQueue<TXAudioData> mPCMQueue = new LinkedBlockingQueue();
  private int mPcmLen = 0;
  public int mSampleRate = 8000;
  public int m_nDropThreshold = 0;
  public int m_nStopDropThreshold = 0;
  
  public TXCAudioRender(TXIAudioRenderListener paramTXIAudioRenderListener)
  {
    this.mListener = paramTXIAudioRenderListener;
  }
  
  private void eraseAudioItemEx()
  {
    int i = 0;
    while (this.mPCMQueue.size() > this.m_nStopDropThreshold)
    {
      this.mPCMQueue.poll();
      i += 1;
    }
    TXCLog.i(TAG, "drop audio item:" + i + ", queue size:" + this.mPCMQueue.size());
  }
  
  public long getRenderCache()
  {
    return this.mPCMQueue.size();
  }
  
  public void init(int paramInt1, int paramInt2, int paramInt3)
  {
    this.mSampleRate = paramInt1;
    this.mChannel = paramInt2;
    this.mBits = paramInt3;
    this.mIsInit = true;
  }
  
  public boolean isIsInit()
  {
    return this.mIsInit;
  }
  
  public void play(byte[] paramArrayOfByte, long paramLong)
  {
    try
    {
      if ((this.m_nDropThreshold == 0) && (this.m_nStopDropThreshold == 0) && (paramArrayOfByte.length > 0) && (this.mChannel != 0) && (this.mSampleRate != 0))
      {
        int i = (int)(1000L / this.mChannel / 2L) * paramArrayOfByte.length / this.mSampleRate;
        this.mPcmLen = i;
        if (i != 0)
        {
          this.m_nDropThreshold = (350 / i);
          this.m_nStopDropThreshold = (200 / i);
        }
      }
      if (this.mPCMQueue.size() > this.m_nDropThreshold) {
        eraseAudioItemEx();
      }
      this.mPCMQueue.add(new TXAudioData(paramArrayOfByte, paramLong));
      return;
    }
    finally {}
  }
  
  public void setMute(boolean paramBoolean)
  {
    this.mMute = paramBoolean;
  }
  
  public void start()
  {
    if (!this.mIsInit) {}
    while (this.mAudioThread != null) {
      return;
    }
    this.mLoop = true;
    this.mAudioThread = new Thread("RTMP_AUDIO_PLAY")
    {
      /* Error */
      public void run()
      {
        // Byte code:
        //   0: iconst_3
        //   1: istore_2
        //   2: aload_0
        //   3: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   6: getfield 28	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mAudioTrack	Landroid/media/AudioTrack;
        //   9: ifnonnull +79 -> 88
        //   12: aload_0
        //   13: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   16: getfield 32	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mChannel	I
        //   19: iconst_1
        //   20: if_icmpne +544 -> 564
        //   23: iconst_2
        //   24: istore_1
        //   25: aload_0
        //   26: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   29: getfield 35	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mBits	I
        //   32: bipush 8
        //   34: if_icmpne +525 -> 559
        //   37: aload_0
        //   38: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   41: aload_0
        //   42: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   45: getfield 38	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mSampleRate	I
        //   48: iload_1
        //   49: iload_2
        //   50: invokestatic 44	android/media/AudioTrack:getMinBufferSize	(III)I
        //   53: putfield 47	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mMinBufferLength	I
        //   56: aload_0
        //   57: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   60: new 40	android/media/AudioTrack
        //   63: dup
        //   64: iconst_3
        //   65: aload_0
        //   66: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   69: getfield 38	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mSampleRate	I
        //   72: iload_1
        //   73: iload_2
        //   74: aload_0
        //   75: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   78: getfield 47	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mMinBufferLength	I
        //   81: iconst_1
        //   82: invokespecial 50	android/media/AudioTrack:<init>	(IIIIII)V
        //   85: putfield 28	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mAudioTrack	Landroid/media/AudioTrack;
        //   88: aload_0
        //   89: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   92: getfield 28	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mAudioTrack	Landroid/media/AudioTrack;
        //   95: invokevirtual 53	android/media/AudioTrack:play	()V
        //   98: bipush 100
        //   100: istore_1
        //   101: iconst_0
        //   102: istore_2
        //   103: aload_0
        //   104: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   107: getfield 57	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mLoop	Z
        //   110: ifeq +351 -> 461
        //   113: aload_0
        //   114: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   117: getfield 61	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mListener	Lcom/tencent/liteav/audio/impl/Render/TXIAudioRenderListener;
        //   120: ifnull +15 -> 135
        //   123: aload_0
        //   124: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   127: getfield 61	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mListener	Lcom/tencent/liteav/audio/impl/Render/TXIAudioRenderListener;
        //   130: invokeinterface 66 1 0
        //   135: aload_0
        //   136: monitorenter
        //   137: aload_0
        //   138: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   141: getfield 70	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mPCMQueue	Ljava/util/concurrent/LinkedBlockingQueue;
        //   144: ldc2_w 71
        //   147: getstatic 78	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
        //   150: invokevirtual 84	java/util/concurrent/LinkedBlockingQueue:poll	(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
        //   153: checkcast 86	com/tencent/liteav/audio/impl/Render/TXCAudioRender$TXAudioData
        //   156: astore 4
        //   158: aload_0
        //   159: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   162: getfield 70	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mPCMQueue	Ljava/util/concurrent/LinkedBlockingQueue;
        //   165: invokevirtual 90	java/util/concurrent/LinkedBlockingQueue:size	()I
        //   168: pop
        //   169: aload_0
        //   170: monitorexit
        //   171: aload 4
        //   173: ifnull -70 -> 103
        //   176: aload 4
        //   178: getfield 94	com/tencent/liteav/audio/impl/Render/TXCAudioRender$TXAudioData:mPCMData	[B
        //   181: ifnull -78 -> 103
        //   184: aload 4
        //   186: getfield 94	com/tencent/liteav/audio/impl/Render/TXCAudioRender$TXAudioData:mPCMData	[B
        //   189: arraylength
        //   190: ifle -87 -> 103
        //   193: aload_0
        //   194: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   197: getfield 97	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mMute	Z
        //   200: ifeq +12 -> 212
        //   203: aload 4
        //   205: getfield 94	com/tencent/liteav/audio/impl/Render/TXCAudioRender$TXAudioData:mPCMData	[B
        //   208: iconst_0
        //   209: invokestatic 103	java/util/Arrays:fill	([BB)V
        //   212: iload_1
        //   213: ifeq +343 -> 556
        //   216: iload_2
        //   217: sipush 800
        //   220: if_icmpge +336 -> 556
        //   223: aload 4
        //   225: getfield 94	com/tencent/liteav/audio/impl/Render/TXCAudioRender$TXAudioData:mPCMData	[B
        //   228: arraylength
        //   229: iconst_2
        //   230: idiv
        //   231: newarray <illegal type>
        //   233: astore 5
        //   235: aload 4
        //   237: getfield 94	com/tencent/liteav/audio/impl/Render/TXCAudioRender$TXAudioData:mPCMData	[B
        //   240: invokestatic 109	java/nio/ByteBuffer:wrap	([B)Ljava/nio/ByteBuffer;
        //   243: getstatic 115	java/nio/ByteOrder:LITTLE_ENDIAN	Ljava/nio/ByteOrder;
        //   246: invokevirtual 119	java/nio/ByteBuffer:order	(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
        //   249: invokevirtual 123	java/nio/ByteBuffer:asShortBuffer	()Ljava/nio/ShortBuffer;
        //   252: aload 5
        //   254: invokevirtual 129	java/nio/ShortBuffer:get	([S)Ljava/nio/ShortBuffer;
        //   257: pop
        //   258: iconst_0
        //   259: istore_3
        //   260: iload_3
        //   261: aload 5
        //   263: arraylength
        //   264: if_icmpge +36 -> 300
        //   267: aload 5
        //   269: iload_3
        //   270: aload 5
        //   272: iload_3
        //   273: saload
        //   274: iload_1
        //   275: idiv
        //   276: i2s
        //   277: sastore
        //   278: iload_3
        //   279: iconst_1
        //   280: iadd
        //   281: istore_3
        //   282: goto -22 -> 260
        //   285: astore 4
        //   287: aconst_null
        //   288: astore 4
        //   290: goto -132 -> 158
        //   293: astore 4
        //   295: aload_0
        //   296: monitorexit
        //   297: aload 4
        //   299: athrow
        //   300: aload 4
        //   302: getfield 94	com/tencent/liteav/audio/impl/Render/TXCAudioRender$TXAudioData:mPCMData	[B
        //   305: invokestatic 109	java/nio/ByteBuffer:wrap	([B)Ljava/nio/ByteBuffer;
        //   308: getstatic 115	java/nio/ByteOrder:LITTLE_ENDIAN	Ljava/nio/ByteOrder;
        //   311: invokevirtual 119	java/nio/ByteBuffer:order	(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
        //   314: invokevirtual 123	java/nio/ByteBuffer:asShortBuffer	()Ljava/nio/ShortBuffer;
        //   317: aload 5
        //   319: invokevirtual 132	java/nio/ShortBuffer:put	([S)Ljava/nio/ShortBuffer;
        //   322: pop
        //   323: iload_2
        //   324: aload 4
        //   326: getfield 94	com/tencent/liteav/audio/impl/Render/TXCAudioRender$TXAudioData:mPCMData	[B
        //   329: arraylength
        //   330: aload_0
        //   331: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   334: getfield 38	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mSampleRate	I
        //   337: iconst_2
        //   338: imul
        //   339: sipush 1000
        //   342: idiv
        //   343: idiv
        //   344: iadd
        //   345: istore_2
        //   346: sipush 800
        //   349: iload_2
        //   350: isub
        //   351: iload_1
        //   352: imul
        //   353: sipush 800
        //   356: idiv
        //   357: istore_1
        //   358: aload_0
        //   359: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   362: getfield 28	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mAudioTrack	Landroid/media/AudioTrack;
        //   365: aload 4
        //   367: getfield 94	com/tencent/liteav/audio/impl/Render/TXCAudioRender$TXAudioData:mPCMData	[B
        //   370: iconst_0
        //   371: aload 4
        //   373: getfield 94	com/tencent/liteav/audio/impl/Render/TXCAudioRender$TXAudioData:mPCMData	[B
        //   376: arraylength
        //   377: invokevirtual 136	android/media/AudioTrack:write	([BII)I
        //   380: pop
        //   381: aload_0
        //   382: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   385: getfield 32	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mChannel	I
        //   388: istore_3
        //   389: aload_0
        //   390: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   393: getfield 47	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mMinBufferLength	I
        //   396: istore_3
        //   397: aload_0
        //   398: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   401: getfield 38	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mSampleRate	I
        //   404: istore_3
        //   405: aload_0
        //   406: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   409: getfield 140	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mMinCacheTime	J
        //   412: lconst_0
        //   413: lcmp
        //   414: ifne +44 -> 458
        //   417: aload_0
        //   418: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   421: ldc2_w 141
        //   424: aload_0
        //   425: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   428: getfield 32	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mChannel	I
        //   431: i2l
        //   432: ldiv
        //   433: ldc2_w 143
        //   436: ldiv
        //   437: aload_0
        //   438: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   441: getfield 47	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mMinBufferLength	I
        //   444: i2l
        //   445: lmul
        //   446: aload_0
        //   447: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   450: getfield 38	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mSampleRate	I
        //   453: i2l
        //   454: ldiv
        //   455: putfield 140	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mMinCacheTime	J
        //   458: goto -355 -> 103
        //   461: aload_0
        //   462: monitorenter
        //   463: aload_0
        //   464: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   467: getfield 70	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mPCMQueue	Ljava/util/concurrent/LinkedBlockingQueue;
        //   470: invokevirtual 147	java/util/concurrent/LinkedBlockingQueue:clear	()V
        //   473: aload_0
        //   474: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   477: iconst_0
        //   478: putfield 150	com/tencent/liteav/audio/impl/Render/TXCAudioRender:m_nDropThreshold	I
        //   481: aload_0
        //   482: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   485: iconst_0
        //   486: putfield 153	com/tencent/liteav/audio/impl/Render/TXCAudioRender:m_nStopDropThreshold	I
        //   489: aload_0
        //   490: monitorexit
        //   491: aload_0
        //   492: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   495: getfield 28	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mAudioTrack	Landroid/media/AudioTrack;
        //   498: invokevirtual 156	android/media/AudioTrack:pause	()V
        //   501: aload_0
        //   502: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   505: getfield 28	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mAudioTrack	Landroid/media/AudioTrack;
        //   508: invokevirtual 159	android/media/AudioTrack:flush	()V
        //   511: aload_0
        //   512: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   515: getfield 28	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mAudioTrack	Landroid/media/AudioTrack;
        //   518: invokevirtual 162	android/media/AudioTrack:stop	()V
        //   521: aload_0
        //   522: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   525: getfield 28	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mAudioTrack	Landroid/media/AudioTrack;
        //   528: invokevirtual 165	android/media/AudioTrack:release	()V
        //   531: aload_0
        //   532: getfield 15	com/tencent/liteav/audio/impl/Render/TXCAudioRender$1:this$0	Lcom/tencent/liteav/audio/impl/Render/TXCAudioRender;
        //   535: aconst_null
        //   536: putfield 28	com/tencent/liteav/audio/impl/Render/TXCAudioRender:mAudioTrack	Landroid/media/AudioTrack;
        //   539: return
        //   540: astore 4
        //   542: aload_0
        //   543: monitorexit
        //   544: aload 4
        //   546: athrow
        //   547: astore 4
        //   549: return
        //   550: astore 4
        //   552: return
        //   553: astore 4
        //   555: return
        //   556: goto -198 -> 358
        //   559: iconst_2
        //   560: istore_2
        //   561: goto -524 -> 37
        //   564: iconst_3
        //   565: istore_1
        //   566: goto -541 -> 25
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	569	0	this	1
        //   24	542	1	i	int
        //   1	560	2	j	int
        //   259	146	3	k	int
        //   156	80	4	localTXAudioData	TXCAudioRender.TXAudioData
        //   285	1	4	localInterruptedException	InterruptedException
        //   288	1	4	localObject1	Object
        //   293	79	4	localObject2	Object
        //   540	5	4	localObject3	Object
        //   547	1	4	localException1	Exception
        //   550	1	4	localException2	Exception
        //   553	1	4	localException3	Exception
        //   233	85	5	arrayOfShort	short[]
        // Exception table:
        //   from	to	target	type
        //   137	158	285	java/lang/InterruptedException
        //   137	158	293	finally
        //   158	171	293	finally
        //   295	297	293	finally
        //   463	491	540	finally
        //   542	544	540	finally
        //   491	539	547	java/lang/Exception
        //   88	98	550	java/lang/Exception
        //   12	23	553	java/lang/Exception
        //   25	37	553	java/lang/Exception
        //   37	88	553	java/lang/Exception
      }
    };
    this.mAudioThread.start();
  }
  
  public void stop()
  {
    if (this.mAudioThread != null) {
      this.mLoop = false;
    }
    try
    {
      if (this.mPCMQueue.size() == 0) {
        this.mPCMQueue.add(new TXAudioData(null, 0L));
      }
      this.mMinCacheTime = 0L;
      this.mAudioThread = null;
      this.mPcmLen = 0;
      return;
    }
    finally {}
  }
  
  public void unInit()
  {
    this.mIsInit = false;
  }
  
  public class TXAudioData
  {
    public byte[] mPCMData;
    public long mPCMTS;
    
    public TXAudioData(byte[] paramArrayOfByte, long paramLong)
    {
      this.mPCMData = paramArrayOfByte;
      this.mPCMTS = paramLong;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\audio\impl\Render\TXCAudioRender.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */