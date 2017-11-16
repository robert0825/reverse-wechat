package com.tencent.liteav.beauty.gpu_filters;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import java.nio.ByteBuffer;

public class TXCGPUVideoPlayerFilter
{
  private static final String TAG = TXCGPUVideoPlayerFilter.class.getSimpleName();
  private int audioTrack = -1;
  private long currentPTS;
  private long currentVideoTS;
  OnDestroyListener destroyListener;
  private Handler extractorHandler;
  private AssetFileDescriptor fd;
  public Object handlerLock = new Object();
  private MediaCodec.BufferInfo infoVideo;
  private ByteBuffer[] inputBuffersVideo;
  private boolean isEOS;
  private boolean looping = false;
  SurfaceTexture.OnFrameAvailableListener mFrameListener;
  private String mimeType;
  private Surface playerSurface;
  private SurfaceTexture playerSurfaceTexture;
  private int playerTextureID = -1;
  private boolean running = false;
  private long startTS;
  private MediaCodec videoDecoder;
  private MediaExtractor videoExtractor;
  private MediaFormat videoFormat;
  private int videoHeight = -1;
  private int videoTrack = -1;
  private int videoWidth = -1;
  
  /* Error */
  private void extractInternal()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 92	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:isEOS	Z
    //   4: ifeq +44 -> 48
    //   7: aload_0
    //   8: getfield 83	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:looping	Z
    //   11: ifeq +209 -> 220
    //   14: aload_0
    //   15: getfield 75	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoTrack	I
    //   18: iconst_m1
    //   19: if_icmpeq +12 -> 31
    //   22: aload_0
    //   23: getfield 94	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoExtractor	Landroid/media/MediaExtractor;
    //   26: lconst_0
    //   27: iconst_2
    //   28: invokevirtual 100	android/media/MediaExtractor:seekTo	(JI)V
    //   31: aload_0
    //   32: lconst_0
    //   33: putfield 102	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:startTS	J
    //   36: aload_0
    //   37: iconst_0
    //   38: putfield 92	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:isEOS	Z
    //   41: aload_0
    //   42: getfield 104	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoDecoder	Landroid/media/MediaCodec;
    //   45: invokevirtual 109	android/media/MediaCodec:flush	()V
    //   48: aload_0
    //   49: getfield 102	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:startTS	J
    //   52: lconst_0
    //   53: lcmp
    //   54: ifne +14 -> 68
    //   57: aload_0
    //   58: invokestatic 115	java/lang/System:nanoTime	()J
    //   61: ldc2_w 116
    //   64: ldiv
    //   65: putfield 102	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:startTS	J
    //   68: aload_0
    //   69: getfield 75	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoTrack	I
    //   72: iconst_m1
    //   73: if_icmpeq +146 -> 219
    //   76: aload_0
    //   77: invokestatic 115	java/lang/System:nanoTime	()J
    //   80: ldc2_w 116
    //   83: ldiv
    //   84: aload_0
    //   85: getfield 102	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:startTS	J
    //   88: lsub
    //   89: putfield 119	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:currentVideoTS	J
    //   92: aload_0
    //   93: getfield 119	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:currentVideoTS	J
    //   96: aload_0
    //   97: getfield 94	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoExtractor	Landroid/media/MediaExtractor;
    //   100: invokevirtual 122	android/media/MediaExtractor:getSampleTime	()J
    //   103: lcmp
    //   104: ifle +115 -> 219
    //   107: aload_0
    //   108: getfield 104	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoDecoder	Landroid/media/MediaCodec;
    //   111: ldc2_w 123
    //   114: invokevirtual 128	android/media/MediaCodec:dequeueInputBuffer	(J)I
    //   117: istore_1
    //   118: iload_1
    //   119: iflt +56 -> 175
    //   122: aload_0
    //   123: getfield 130	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:inputBuffersVideo	[Ljava/nio/ByteBuffer;
    //   126: iload_1
    //   127: aaload
    //   128: astore 4
    //   130: aload_0
    //   131: getfield 94	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoExtractor	Landroid/media/MediaExtractor;
    //   134: aload 4
    //   136: iconst_0
    //   137: invokevirtual 134	android/media/MediaExtractor:readSampleData	(Ljava/nio/ByteBuffer;I)I
    //   140: istore_2
    //   141: iload_2
    //   142: ifge +99 -> 241
    //   145: aload_0
    //   146: iconst_1
    //   147: putfield 92	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:isEOS	Z
    //   150: aload_0
    //   151: getfield 83	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:looping	Z
    //   154: ifne +15 -> 169
    //   157: aload_0
    //   158: getfield 104	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoDecoder	Landroid/media/MediaCodec;
    //   161: iload_1
    //   162: iconst_0
    //   163: iconst_0
    //   164: lconst_0
    //   165: iconst_4
    //   166: invokevirtual 138	android/media/MediaCodec:queueInputBuffer	(IIIJI)V
    //   169: aload 4
    //   171: invokevirtual 144	java/nio/ByteBuffer:clear	()Ljava/nio/Buffer;
    //   174: pop
    //   175: aload_0
    //   176: getfield 104	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoDecoder	Landroid/media/MediaCodec;
    //   179: aload_0
    //   180: getfield 146	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:infoVideo	Landroid/media/MediaCodec$BufferInfo;
    //   183: ldc2_w 123
    //   186: invokevirtual 150	android/media/MediaCodec:dequeueOutputBuffer	(Landroid/media/MediaCodec$BufferInfo;J)I
    //   189: istore_2
    //   190: iload_2
    //   191: iflt +91 -> 282
    //   194: aload_0
    //   195: getfield 104	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoDecoder	Landroid/media/MediaCodec;
    //   198: astore 4
    //   200: aload_0
    //   201: getfield 146	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:infoVideo	Landroid/media/MediaCodec$BufferInfo;
    //   204: getfield 155	android/media/MediaCodec$BufferInfo:size	I
    //   207: ifeq +70 -> 277
    //   210: iconst_1
    //   211: istore_3
    //   212: aload 4
    //   214: iload_2
    //   215: iload_3
    //   216: invokevirtual 159	android/media/MediaCodec:releaseOutputBuffer	(IZ)V
    //   219: return
    //   220: aload_0
    //   221: getfield 161	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:destroyListener	Lcom/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter$OnDestroyListener;
    //   224: instanceof 13
    //   227: ifeq -8 -> 219
    //   230: aload_0
    //   231: getfield 161	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:destroyListener	Lcom/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter$OnDestroyListener;
    //   234: aload_0
    //   235: invokeinterface 165 2 0
    //   240: return
    //   241: aload_0
    //   242: getfield 104	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoDecoder	Landroid/media/MediaCodec;
    //   245: iload_1
    //   246: iconst_0
    //   247: iload_2
    //   248: aload_0
    //   249: getfield 94	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoExtractor	Landroid/media/MediaExtractor;
    //   252: invokevirtual 122	android/media/MediaExtractor:getSampleTime	()J
    //   255: iconst_0
    //   256: invokevirtual 138	android/media/MediaCodec:queueInputBuffer	(IIIJI)V
    //   259: aload_0
    //   260: getfield 94	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoExtractor	Landroid/media/MediaExtractor;
    //   263: invokevirtual 169	android/media/MediaExtractor:advance	()Z
    //   266: pop
    //   267: goto -98 -> 169
    //   270: astore 4
    //   272: aload_0
    //   273: invokevirtual 172	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:destroyInternal	()V
    //   276: return
    //   277: iconst_0
    //   278: istore_3
    //   279: goto -67 -> 212
    //   282: iload_2
    //   283: iconst_m1
    //   284: if_icmpne +17 -> 301
    //   287: bipush 10
    //   289: invokestatic 178	com/tencent/liteav/basic/util/TXCCommonUtil:sleep	(I)V
    //   292: return
    //   293: astore 4
    //   295: bipush 10
    //   297: invokestatic 178	com/tencent/liteav/basic/util/TXCCommonUtil:sleep	(I)V
    //   300: return
    //   301: iload_2
    //   302: bipush -2
    //   304: if_icmpne +8 -> 312
    //   307: aload_0
    //   308: invokespecial 181	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:outputFormatChange	()V
    //   311: return
    //   312: iload_2
    //   313: bipush -3
    //   315: if_icmpeq -96 -> 219
    //   318: getstatic 65	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:TAG	Ljava/lang/String;
    //   321: new 183	java/lang/StringBuilder
    //   324: dup
    //   325: ldc -71
    //   327: invokespecial 188	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   330: iload_1
    //   331: invokevirtual 192	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   334: invokevirtual 195	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   337: invokestatic 201	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   340: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	341	0	this	TXCGPUVideoPlayerFilter
    //   117	214	1	i	int
    //   140	176	2	j	int
    //   211	68	3	bool	boolean
    //   128	85	4	localObject	Object
    //   270	1	4	localException	Exception
    //   293	1	4	localIllegalStateException	IllegalStateException
    // Exception table:
    //   from	to	target	type
    //   107	118	270	java/lang/Exception
    //   122	141	270	java/lang/Exception
    //   145	169	270	java/lang/Exception
    //   169	175	270	java/lang/Exception
    //   175	190	270	java/lang/Exception
    //   194	210	270	java/lang/Exception
    //   212	219	270	java/lang/Exception
    //   241	267	270	java/lang/Exception
    //   287	292	270	java/lang/Exception
    //   295	300	270	java/lang/Exception
    //   307	311	270	java/lang/Exception
    //   318	340	270	java/lang/Exception
    //   175	190	293	java/lang/IllegalStateException
    //   194	210	293	java/lang/IllegalStateException
    //   212	219	293	java/lang/IllegalStateException
    //   287	292	293	java/lang/IllegalStateException
    //   307	311	293	java/lang/IllegalStateException
    //   318	340	293	java/lang/IllegalStateException
  }
  
  private void initSurface()
  {
    if (this.playerSurfaceTexture != null)
    {
      this.playerSurfaceTexture.release();
      this.playerSurfaceTexture = null;
    }
    this.playerSurfaceTexture = new SurfaceTexture(this.playerTextureID);
    this.playerSurfaceTexture.setOnFrameAvailableListener(this.mFrameListener);
    this.playerSurface = new Surface(this.playerSurfaceTexture);
  }
  
  private void initThread()
  {
    HandlerThread localHandlerThread = new HandlerThread("MediaExtractorThread");
    localHandlerThread.start();
    this.extractorHandler = new Handler(localHandlerThread.getLooper());
    extractTask();
  }
  
  private boolean initVideoDecoder()
  {
    try
    {
      this.videoDecoder = MediaCodec.createDecoderByType(this.mimeType);
      this.videoDecoder.configure(this.videoFormat, this.playerSurface, null, 0);
      this.playerSurface.release();
      this.playerSurface = null;
      this.videoDecoder.start();
      this.inputBuffersVideo = this.videoDecoder.getInputBuffers();
      this.infoVideo = new MediaCodec.BufferInfo();
      return true;
    }
    catch (Exception localException) {}
    return false;
  }
  
  private void outputFormatChange()
  {
    MediaFormat localMediaFormat = this.videoDecoder.getOutputFormat();
    int i = Math.abs(localMediaFormat.getInteger("crop-right") - localMediaFormat.getInteger("crop-left"));
    int j = Math.abs(localMediaFormat.getInteger("crop-bottom") - localMediaFormat.getInteger("crop-top"));
    int k = localMediaFormat.getInteger("width");
    int m = localMediaFormat.getInteger("height");
    this.videoWidth = Math.min(i + 1, k);
    this.videoHeight = Math.min(j + 1, m);
  }
  
  /* Error */
  private void stop()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 73	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:running	Z
    //   4: ifeq +46 -> 50
    //   7: aload_0
    //   8: iconst_0
    //   9: putfield 73	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:running	Z
    //   12: aload_0
    //   13: getfield 94	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoExtractor	Landroid/media/MediaExtractor;
    //   16: ifnull +15 -> 31
    //   19: aload_0
    //   20: getfield 94	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoExtractor	Landroid/media/MediaExtractor;
    //   23: invokevirtual 301	android/media/MediaExtractor:release	()V
    //   26: aload_0
    //   27: aconst_null
    //   28: putfield 94	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoExtractor	Landroid/media/MediaExtractor;
    //   31: aload_0
    //   32: getfield 104	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoDecoder	Landroid/media/MediaCodec;
    //   35: invokevirtual 303	android/media/MediaCodec:stop	()V
    //   38: aload_0
    //   39: getfield 104	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoDecoder	Landroid/media/MediaCodec;
    //   42: invokevirtual 304	android/media/MediaCodec:release	()V
    //   45: aload_0
    //   46: aconst_null
    //   47: putfield 104	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoDecoder	Landroid/media/MediaCodec;
    //   50: return
    //   51: astore_1
    //   52: aload_0
    //   53: aconst_null
    //   54: putfield 104	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoDecoder	Landroid/media/MediaCodec;
    //   57: return
    //   58: astore_1
    //   59: aload_0
    //   60: aconst_null
    //   61: putfield 104	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoDecoder	Landroid/media/MediaCodec;
    //   64: aload_1
    //   65: athrow
    //   66: astore_1
    //   67: aload_0
    //   68: getfield 104	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoDecoder	Landroid/media/MediaCodec;
    //   71: invokevirtual 304	android/media/MediaCodec:release	()V
    //   74: aload_0
    //   75: aconst_null
    //   76: putfield 104	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoDecoder	Landroid/media/MediaCodec;
    //   79: return
    //   80: astore_1
    //   81: aload_0
    //   82: aconst_null
    //   83: putfield 104	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoDecoder	Landroid/media/MediaCodec;
    //   86: return
    //   87: astore_1
    //   88: aload_0
    //   89: aconst_null
    //   90: putfield 104	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoDecoder	Landroid/media/MediaCodec;
    //   93: aload_1
    //   94: athrow
    //   95: astore_1
    //   96: aload_0
    //   97: getfield 104	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoDecoder	Landroid/media/MediaCodec;
    //   100: invokevirtual 304	android/media/MediaCodec:release	()V
    //   103: aload_0
    //   104: aconst_null
    //   105: putfield 104	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoDecoder	Landroid/media/MediaCodec;
    //   108: aload_1
    //   109: athrow
    //   110: astore_2
    //   111: aload_0
    //   112: aconst_null
    //   113: putfield 104	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoDecoder	Landroid/media/MediaCodec;
    //   116: goto -8 -> 108
    //   119: astore_1
    //   120: aload_0
    //   121: aconst_null
    //   122: putfield 104	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:videoDecoder	Landroid/media/MediaCodec;
    //   125: aload_1
    //   126: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	127	0	this	TXCGPUVideoPlayerFilter
    //   51	1	1	localException1	Exception
    //   58	7	1	localObject1	Object
    //   66	1	1	localException2	Exception
    //   80	1	1	localException3	Exception
    //   87	7	1	localObject2	Object
    //   95	14	1	localObject3	Object
    //   119	7	1	localObject4	Object
    //   110	1	2	localException4	Exception
    // Exception table:
    //   from	to	target	type
    //   38	45	51	java/lang/Exception
    //   38	45	58	finally
    //   31	38	66	java/lang/Exception
    //   67	74	80	java/lang/Exception
    //   67	74	87	finally
    //   31	38	95	finally
    //   96	103	110	java/lang/Exception
    //   96	103	119	finally
  }
  
  /* Error */
  void destroy()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 85	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:handlerLock	Ljava/lang/Object;
    //   6: astore_1
    //   7: aload_1
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield 244	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:extractorHandler	Landroid/os/Handler;
    //   13: ifnull +20 -> 33
    //   16: invokestatic 312	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   19: aload_0
    //   20: getfield 244	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:extractorHandler	Landroid/os/Handler;
    //   23: invokevirtual 313	android/os/Handler:getLooper	()Landroid/os/Looper;
    //   26: if_acmpne +12 -> 38
    //   29: aload_0
    //   30: invokevirtual 172	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:destroyInternal	()V
    //   33: aload_1
    //   34: monitorexit
    //   35: aload_0
    //   36: monitorexit
    //   37: return
    //   38: new 6	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter$1
    //   41: dup
    //   42: aload_0
    //   43: invokespecial 316	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter$1:<init>	(Lcom/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter;)V
    //   46: astore_2
    //   47: aload_0
    //   48: getfield 244	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:extractorHandler	Landroid/os/Handler;
    //   51: aconst_null
    //   52: invokevirtual 319	android/os/Handler:removeCallbacksAndMessages	(Ljava/lang/Object;)V
    //   55: aload_0
    //   56: getfield 244	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:extractorHandler	Landroid/os/Handler;
    //   59: aload_2
    //   60: invokevirtual 323	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   63: pop
    //   64: aload_0
    //   65: getfield 244	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:extractorHandler	Landroid/os/Handler;
    //   68: invokevirtual 313	android/os/Handler:getLooper	()Landroid/os/Looper;
    //   71: invokevirtual 326	android/os/Looper:quitSafely	()V
    //   74: aload_0
    //   75: getfield 85	com/tencent/liteav/beauty/gpu_filters/TXCGPUVideoPlayerFilter:handlerLock	Ljava/lang/Object;
    //   78: invokevirtual 329	java/lang/Object:wait	()V
    //   81: goto -48 -> 33
    //   84: astore_2
    //   85: goto -11 -> 74
    //   88: astore_2
    //   89: aload_1
    //   90: monitorexit
    //   91: aload_2
    //   92: athrow
    //   93: astore_1
    //   94: aload_0
    //   95: monitorexit
    //   96: aload_1
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	TXCGPUVideoPlayerFilter
    //   93	4	1	localObject2	Object
    //   46	14	2	local1	1
    //   84	1	2	localInterruptedException	InterruptedException
    //   88	4	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   74	81	84	java/lang/InterruptedException
    //   9	33	88	finally
    //   33	35	88	finally
    //   38	74	88	finally
    //   74	81	88	finally
    //   89	91	88	finally
    //   2	9	93	finally
    //   91	93	93	finally
  }
  
  public void destroyInternal()
  {
    stop();
    this.mFrameListener = null;
    this.startTS = 0L;
    this.isEOS = false;
    if (this.playerSurfaceTexture != null)
    {
      this.playerSurfaceTexture.release();
      this.playerSurfaceTexture = null;
    }
    synchronized (this.handlerLock)
    {
      if (this.extractorHandler != null)
      {
        this.extractorHandler.removeCallbacksAndMessages(null);
        this.extractorHandler.getLooper().quit();
        this.extractorHandler = null;
        this.handlerLock.notify();
      }
      if (this.fd == null) {}
    }
    try
    {
      this.fd.close();
      this.fd = null;
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public void extractTask()
  {
    synchronized (this.handlerLock)
    {
      if (this.extractorHandler != null) {
        this.extractorHandler.postDelayed(new Runnable()
        {
          public void run()
          {
            TXCGPUVideoPlayerFilter.this.extractTask();
          }
        }, 5L);
      }
      if (!this.running) {
        return;
      }
    }
    extractInternal();
  }
  
  SurfaceTexture getSurfaceTexture()
  {
    return this.playerSurfaceTexture;
  }
  
  boolean init(InitParam paramInitParam)
  {
    for (;;)
    {
      try
      {
        if (this.extractorHandler != null) {
          destroy();
        }
        String str = paramInitParam.greenScreenFile;
        if (str == null)
        {
          bool = false;
          return bool;
        }
        this.mFrameListener = paramInitParam.frameAvailableListener;
        this.destroyListener = paramInitParam.destroyListener;
        this.playerTextureID = paramInitParam.greenScreenTexture;
        this.looping = paramInitParam.isLoop;
        try
        {
          this.videoExtractor = new MediaExtractor();
          if (paramInitParam.greenScreenFile.startsWith("/"))
          {
            this.videoExtractor.setDataSource(paramInitParam.greenScreenFile);
            break label287;
            if (i >= this.videoExtractor.getTrackCount()) {
              break label282;
            }
            this.videoFormat = this.videoExtractor.getTrackFormat(i);
            paramInitParam = this.videoFormat.getString("mime");
            if (!paramInitParam.startsWith("video/")) {
              continue;
            }
            this.mimeType = paramInitParam;
            this.videoTrack = i;
            this.videoExtractor.selectTrack(i);
            i = 0;
            if (i == 0) {
              continue;
            }
            destroy();
            bool = false;
            continue;
          }
          this.fd = paramInitParam.context.getAssets().openFd(paramInitParam.greenScreenFile);
          this.videoExtractor.setDataSource(this.fd.getFileDescriptor(), this.fd.getStartOffset(), this.fd.getLength());
        }
        catch (Exception paramInitParam)
        {
          destroy();
          bool = false;
        }
        continue;
        i += 1;
        continue;
        initSurface();
        if (initVideoDecoder())
        {
          initThread();
          this.running = true;
          bool = true;
          continue;
        }
        destroy();
        boolean bool = false;
        continue;
        i = 1;
      }
      finally {}
      label282:
      continue;
      label287:
      int i = 0;
    }
  }
  
  static class InitParam
  {
    Context context;
    TXCGPUVideoPlayerFilter.OnDestroyListener destroyListener;
    SurfaceTexture.OnFrameAvailableListener frameAvailableListener;
    String greenScreenFile;
    int greenScreenTexture;
    boolean isLoop;
  }
  
  static abstract interface OnDestroyListener
  {
    public abstract void onDestroy(Object paramObject);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\gpu_filters\TXCGPUVideoPlayerFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */