package com.tencent.liteav.screencapture;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjection.Callback;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.tencent.liteav.basic.listener.TXINotifyListener;
import com.tencent.rtmp.video.TXScreenCapture.TXScreenCaptureAssistantActivity;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

@TargetApi(21)
public class TXCScreenCaptureImplSingleton
{
  private static TXCScreenCaptureImplSingleton INSTANCE = new TXCScreenCaptureImplSingleton();
  private static final int RUNNING_STATE_RUNNING = 3;
  private static final int RUNNING_STATE_STARTING = 2;
  private static final int RUNNING_STATE_STOP = 1;
  private static final int RUNNING_STATE_STOPING = 4;
  private static final String TAG = TXCScreenCaptureImplSingleton.class.getSimpleName();
  private Context mApplicationContext = null;
  private BroadcastReceiver mBroadCastReceiver = new BroadcastReceiver()
  {
    public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      if ((paramAnonymousIntent != null) && (paramAnonymousIntent.getAction().equalsIgnoreCase("TXScreenCapture.OnAssistantActivityResult"))) {
        TXCScreenCaptureImplSingleton.this.onActivityResultCallback(paramAnonymousIntent.getIntExtra("TXScreenCapture.RequestCode", 0), paramAnonymousIntent.getIntExtra("TXScreenCapture.ResultCode", 0), (Intent)paramAnonymousIntent.getParcelableExtra("TXScreenCapture.ResultData"));
      }
    }
  };
  private HashSet<Object> mHoldSet = new HashSet();
  private Handler mMainLoopHandler = null;
  private MediaProjection mMediaProjection = null;
  MediaProjection.Callback mMediaProjectionCallback = new MediaProjection.Callback()
  {
    public void onStop()
    {
      if (!TXCScreenCaptureImplSingleton.this.mbStarted) {
        return;
      }
      TXCScreenCaptureImplSingleton.this.mbStarted = false;
    }
  };
  public WeakReference<TXINotifyListener> mNotifyListener = null;
  private MediaProjectionManager mProjectionManager = null;
  private int mRunningState = 1;
  public HashMap<Surface, VirtualDisplay> mVirtualDisplayMap = new HashMap();
  private HashSet<WaitOpenCaptureParam> mWaitOpenCaptureSurfaceSet = new HashSet();
  public boolean mbStarted = false;
  
  private void closeAllCaptureInternal()
  {
    Iterator localIterator = this.mVirtualDisplayMap.values().iterator();
    while (localIterator.hasNext())
    {
      VirtualDisplay localVirtualDisplay = (VirtualDisplay)localIterator.next();
      if (localVirtualDisplay != null) {
        localVirtualDisplay.release();
      }
    }
    this.mVirtualDisplayMap.clear();
    this.mHoldSet.clear();
    stopScreenCaptureInternal();
  }
  
  public static TXCScreenCaptureImplSingleton getInstance()
  {
    return INSTANCE;
  }
  
  @TargetApi(21)
  private boolean startScreenCaptureInternal()
  {
    if (this.mRunningState != 1) {
      return true;
    }
    if ((this.mApplicationContext == null) || (this.mProjectionManager == null)) {
      return false;
    }
    this.mRunningState = 2;
    Object localObject = new IntentFilter();
    ((IntentFilter)localObject).addAction("TXScreenCapture.OnAssistantActivityResult");
    this.mApplicationContext.registerReceiver(this.mBroadCastReceiver, (IntentFilter)localObject);
    localObject = new Intent(this.mApplicationContext, TXScreenCapture.TXScreenCaptureAssistantActivity.class);
    ((Intent)localObject).addFlags(268435456);
    ((Intent)localObject).putExtra("TXScreenCapture.ScreenCaptureIntent", this.mProjectionManager.createScreenCaptureIntent());
    this.mApplicationContext.startActivity((Intent)localObject);
    return true;
  }
  
  private void stopScreenCapture()
  {
    this.mRunningState = 4;
    this.mMainLoopHandler.postDelayed(new Runnable()
    {
      public void run()
      {
        synchronized (TXCScreenCaptureImplSingleton.this)
        {
          if (TXCScreenCaptureImplSingleton.this.mVirtualDisplayMap.size() == 0) {
            TXCScreenCaptureImplSingleton.this.stopScreenCaptureInternal();
          }
          return;
        }
      }
    }, 1000L);
  }
  
  public void closeAllCapture()
  {
    try
    {
      closeAllCaptureInternal();
      return;
    }
    finally {}
  }
  
  public void closeCapture(Surface paramSurface)
  {
    try
    {
      Iterator localIterator = this.mWaitOpenCaptureSurfaceSet.iterator();
      while (localIterator.hasNext())
      {
        WaitOpenCaptureParam localWaitOpenCaptureParam = (WaitOpenCaptureParam)localIterator.next();
        if ((localWaitOpenCaptureParam != null) && (localWaitOpenCaptureParam.mSurface != null) && (localWaitOpenCaptureParam.mWidth != 0) && (localWaitOpenCaptureParam.mHeight != 0) && (localWaitOpenCaptureParam.mSurface == paramSurface)) {
          this.mWaitOpenCaptureSurfaceSet.remove(localWaitOpenCaptureParam);
        }
      }
      if (!this.mVirtualDisplayMap.containsKey(paramSurface)) {
        return;
      }
      ((VirtualDisplay)this.mVirtualDisplayMap.get(paramSurface)).release();
      this.mVirtualDisplayMap.remove(paramSurface);
      stopScreenCapture();
      return;
    }
    finally {}
  }
  
  public int getRotationAngle()
  {
    try
    {
      if (this.mApplicationContext == null) {
        return 0;
      }
      int i = this.mApplicationContext.getResources().getConfiguration().orientation;
      if ((i != 1) && (i == 2)) {
        return 90;
      }
    }
    finally {}
    return 0;
  }
  
  /* Error */
  public void holdMediaProjection(boolean paramBoolean, Object paramObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_1
    //   3: ifeq +40 -> 43
    //   6: aload_0
    //   7: getfield 96	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mHoldSet	Ljava/util/HashSet;
    //   10: aload_2
    //   11: invokevirtual 260	java/util/HashSet:contains	(Ljava/lang/Object;)Z
    //   14: ifne +29 -> 43
    //   17: aload_0
    //   18: getfield 96	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mHoldSet	Ljava/util/HashSet;
    //   21: aload_2
    //   22: invokevirtual 263	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   25: pop
    //   26: aload_0
    //   27: getfield 96	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mHoldSet	Ljava/util/HashSet;
    //   30: invokevirtual 266	java/util/HashSet:isEmpty	()Z
    //   33: ifeq +7 -> 40
    //   36: aload_0
    //   37: invokespecial 238	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:stopScreenCapture	()V
    //   40: aload_0
    //   41: monitorexit
    //   42: return
    //   43: iload_1
    //   44: ifne -18 -> 26
    //   47: aload_0
    //   48: getfield 96	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mHoldSet	Ljava/util/HashSet;
    //   51: aload_2
    //   52: invokevirtual 227	java/util/HashSet:remove	(Ljava/lang/Object;)Z
    //   55: pop
    //   56: goto -30 -> 26
    //   59: astore_2
    //   60: aload_0
    //   61: monitorexit
    //   62: aload_2
    //   63: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	64	0	this	TXCScreenCaptureImplSingleton
    //   0	64	1	paramBoolean	boolean
    //   0	64	2	paramObject	Object
    // Exception table:
    //   from	to	target	type
    //   6	26	59	finally
    //   26	40	59	finally
    //   40	42	59	finally
    //   47	56	59	finally
    //   60	62	59	finally
  }
  
  /* Error */
  @TargetApi(21)
  public void onActivityResultCallback(int paramInt1, int paramInt2, Intent paramIntent)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 81	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mApplicationContext	Landroid/content/Context;
    //   6: ifnull +14 -> 20
    //   9: aload_0
    //   10: getfield 81	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mApplicationContext	Landroid/content/Context;
    //   13: aload_0
    //   14: getfield 108	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mBroadCastReceiver	Landroid/content/BroadcastReceiver;
    //   17: invokevirtual 274	android/content/Context:unregisterReceiver	(Landroid/content/BroadcastReceiver;)V
    //   20: iload_1
    //   21: sipush 1001
    //   24: if_icmpeq +6 -> 30
    //   27: aload_0
    //   28: monitorexit
    //   29: return
    //   30: iload_2
    //   31: iconst_m1
    //   32: if_icmpeq +13 -> 45
    //   35: aload_0
    //   36: monitorexit
    //   37: return
    //   38: astore_3
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_3
    //   42: athrow
    //   43: astore_3
    //   44: return
    //   45: aload_0
    //   46: getfield 92	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mRunningState	I
    //   49: iconst_2
    //   50: if_icmpeq +6 -> 56
    //   53: aload_0
    //   54: monitorexit
    //   55: return
    //   56: aload_0
    //   57: aload_0
    //   58: getfield 83	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mProjectionManager	Landroid/media/projection/MediaProjectionManager;
    //   61: iload_2
    //   62: aload_3
    //   63: invokevirtual 278	android/media/projection/MediaProjectionManager:getMediaProjection	(ILandroid/content/Intent;)Landroid/media/projection/MediaProjection;
    //   66: putfield 85	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mMediaProjection	Landroid/media/projection/MediaProjection;
    //   69: aload_0
    //   70: getfield 85	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mMediaProjection	Landroid/media/projection/MediaProjection;
    //   73: aload_0
    //   74: getfield 105	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mMediaProjectionCallback	Landroid/media/projection/MediaProjection$Callback;
    //   77: aload_0
    //   78: getfield 94	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mMainLoopHandler	Landroid/os/Handler;
    //   81: invokevirtual 284	android/media/projection/MediaProjection:registerCallback	(Landroid/media/projection/MediaProjection$Callback;Landroid/os/Handler;)V
    //   84: aload_0
    //   85: iconst_1
    //   86: putfield 98	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mbStarted	Z
    //   89: aload_0
    //   90: getfield 90	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mWaitOpenCaptureSurfaceSet	Ljava/util/HashSet;
    //   93: invokevirtual 287	java/util/HashSet:size	()I
    //   96: ifne +6 -> 102
    //   99: aload_0
    //   100: monitorexit
    //   101: return
    //   102: aload_0
    //   103: getfield 90	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mWaitOpenCaptureSurfaceSet	Ljava/util/HashSet;
    //   106: invokevirtual 213	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   109: astore_3
    //   110: aload_3
    //   111: invokeinterface 136 1 0
    //   116: ifeq +100 -> 216
    //   119: aload_3
    //   120: invokeinterface 140 1 0
    //   125: checkcast 14	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton$WaitOpenCaptureParam
    //   128: astore 4
    //   130: aload 4
    //   132: ifnull -22 -> 110
    //   135: aload 4
    //   137: getfield 217	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton$WaitOpenCaptureParam:mSurface	Landroid/view/Surface;
    //   140: ifnull -30 -> 110
    //   143: aload 4
    //   145: getfield 220	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton$WaitOpenCaptureParam:mWidth	I
    //   148: ifeq -38 -> 110
    //   151: aload 4
    //   153: getfield 223	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton$WaitOpenCaptureParam:mHeight	I
    //   156: ifeq -46 -> 110
    //   159: aload_0
    //   160: getfield 85	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mMediaProjection	Landroid/media/projection/MediaProjection;
    //   163: ldc_w 289
    //   166: aload 4
    //   168: getfield 220	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton$WaitOpenCaptureParam:mWidth	I
    //   171: aload 4
    //   173: getfield 223	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton$WaitOpenCaptureParam:mHeight	I
    //   176: iconst_1
    //   177: iconst_1
    //   178: aload 4
    //   180: getfield 217	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton$WaitOpenCaptureParam:mSurface	Landroid/view/Surface;
    //   183: aconst_null
    //   184: aconst_null
    //   185: invokevirtual 293	android/media/projection/MediaProjection:createVirtualDisplay	(Ljava/lang/String;IIIILandroid/view/Surface;Landroid/hardware/display/VirtualDisplay$Callback;Landroid/os/Handler;)Landroid/hardware/display/VirtualDisplay;
    //   188: astore 5
    //   190: aload 5
    //   192: ifnonnull +6 -> 198
    //   195: aload_0
    //   196: monitorexit
    //   197: return
    //   198: aload_0
    //   199: getfield 79	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mVirtualDisplayMap	Ljava/util/HashMap;
    //   202: aload 4
    //   204: getfield 217	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton$WaitOpenCaptureParam:mSurface	Landroid/view/Surface;
    //   207: aload 5
    //   209: invokevirtual 297	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   212: pop
    //   213: goto -103 -> 110
    //   216: aload_0
    //   217: getfield 90	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mWaitOpenCaptureSurfaceSet	Ljava/util/HashSet;
    //   220: invokevirtual 149	java/util/HashSet:clear	()V
    //   223: aload_0
    //   224: iconst_3
    //   225: putfield 92	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mRunningState	I
    //   228: aload_0
    //   229: monitorexit
    //   230: aload_0
    //   231: getfield 100	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mNotifyListener	Ljava/lang/ref/WeakReference;
    //   234: ifnull +31 -> 265
    //   237: new 110	android/os/Handler
    //   240: dup
    //   241: invokestatic 116	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   244: invokespecial 119	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   247: new 10	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton$3
    //   250: dup
    //   251: aload_0
    //   252: invokespecial 298	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton$3:<init>	(Lcom/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton;)V
    //   255: invokevirtual 302	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   258: pop
    //   259: return
    //   260: astore 4
    //   262: goto -242 -> 20
    //   265: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	266	0	this	TXCScreenCaptureImplSingleton
    //   0	266	1	paramInt1	int
    //   0	266	2	paramInt2	int
    //   0	266	3	paramIntent	Intent
    //   128	75	4	localWaitOpenCaptureParam	WaitOpenCaptureParam
    //   260	1	4	localException	Exception
    //   188	20	5	localVirtualDisplay	VirtualDisplay
    // Exception table:
    //   from	to	target	type
    //   2	20	38	finally
    //   27	29	38	finally
    //   35	37	38	finally
    //   39	41	38	finally
    //   45	55	38	finally
    //   56	101	38	finally
    //   102	110	38	finally
    //   110	130	38	finally
    //   135	190	38	finally
    //   195	197	38	finally
    //   198	213	38	finally
    //   216	230	38	finally
    //   0	2	43	java/lang/Exception
    //   41	43	43	java/lang/Exception
    //   2	20	260	java/lang/Exception
  }
  
  /* Error */
  @TargetApi(21)
  public boolean openCaptureToSurface(Surface paramSurface, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 92	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mRunningState	I
    //   6: iconst_3
    //   7: if_icmpeq +11 -> 18
    //   10: aload_0
    //   11: getfield 92	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mRunningState	I
    //   14: iconst_4
    //   15: if_icmpne +71 -> 86
    //   18: aload_0
    //   19: getfield 85	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mMediaProjection	Landroid/media/projection/MediaProjection;
    //   22: astore 5
    //   24: aload 5
    //   26: ifnonnull +7 -> 33
    //   29: aload_0
    //   30: monitorexit
    //   31: iconst_0
    //   32: ireturn
    //   33: aload_0
    //   34: iconst_1
    //   35: putfield 98	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mbStarted	Z
    //   38: aload_0
    //   39: getfield 85	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mMediaProjection	Landroid/media/projection/MediaProjection;
    //   42: ldc_w 289
    //   45: iload_2
    //   46: iload_3
    //   47: iconst_1
    //   48: iconst_1
    //   49: aload_1
    //   50: aconst_null
    //   51: aconst_null
    //   52: invokevirtual 293	android/media/projection/MediaProjection:createVirtualDisplay	(Ljava/lang/String;IIIILandroid/view/Surface;Landroid/hardware/display/VirtualDisplay$Callback;Landroid/os/Handler;)Landroid/hardware/display/VirtualDisplay;
    //   55: astore 5
    //   57: aload 5
    //   59: ifnonnull +7 -> 66
    //   62: aload_0
    //   63: monitorexit
    //   64: iconst_0
    //   65: ireturn
    //   66: aload_0
    //   67: iconst_3
    //   68: putfield 92	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mRunningState	I
    //   71: aload_0
    //   72: getfield 79	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mVirtualDisplayMap	Ljava/util/HashMap;
    //   75: aload_1
    //   76: aload 5
    //   78: invokevirtual 297	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   81: pop
    //   82: aload_0
    //   83: monitorexit
    //   84: iconst_1
    //   85: ireturn
    //   86: new 14	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton$WaitOpenCaptureParam
    //   89: dup
    //   90: aload_0
    //   91: invokespecial 305	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton$WaitOpenCaptureParam:<init>	(Lcom/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton;)V
    //   94: astore 5
    //   96: aload 5
    //   98: iload_3
    //   99: putfield 223	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton$WaitOpenCaptureParam:mHeight	I
    //   102: aload 5
    //   104: iload_2
    //   105: putfield 220	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton$WaitOpenCaptureParam:mWidth	I
    //   108: aload 5
    //   110: aload_1
    //   111: putfield 217	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton$WaitOpenCaptureParam:mSurface	Landroid/view/Surface;
    //   114: aload_0
    //   115: getfield 90	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:mWaitOpenCaptureSurfaceSet	Ljava/util/HashSet;
    //   118: aload 5
    //   120: invokevirtual 263	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   123: pop
    //   124: aload_0
    //   125: invokespecial 307	com/tencent/liteav/screencapture/TXCScreenCaptureImplSingleton:startScreenCaptureInternal	()Z
    //   128: istore 4
    //   130: aload_0
    //   131: monitorexit
    //   132: iload 4
    //   134: ireturn
    //   135: astore_1
    //   136: aload_0
    //   137: monitorexit
    //   138: aload_1
    //   139: athrow
    //   140: astore_1
    //   141: aload_0
    //   142: monitorexit
    //   143: iconst_0
    //   144: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	145	0	this	TXCScreenCaptureImplSingleton
    //   0	145	1	paramSurface	Surface
    //   0	145	2	paramInt1	int
    //   0	145	3	paramInt2	int
    //   128	5	4	bool	boolean
    //   22	97	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	18	135	finally
    //   18	24	135	finally
    //   29	31	135	finally
    //   33	57	135	finally
    //   62	64	135	finally
    //   66	82	135	finally
    //   82	84	135	finally
    //   86	130	135	finally
    //   130	132	135	finally
    //   136	138	135	finally
    //   141	143	135	finally
    //   2	18	140	java/lang/Exception
    //   18	24	140	java/lang/Exception
    //   33	57	140	java/lang/Exception
    //   66	82	140	java/lang/Exception
    //   86	130	140	java/lang/Exception
  }
  
  public void setContext(Context paramContext)
  {
    try
    {
      if (this.mApplicationContext != paramContext)
      {
        closeAllCapture();
        this.mProjectionManager = null;
        this.mApplicationContext = paramContext;
        if (this.mApplicationContext == null) {
          return;
        }
        if (this.mProjectionManager == null) {
          this.mProjectionManager = ((MediaProjectionManager)this.mApplicationContext.getSystemService("media_projection"));
        }
      }
      return;
    }
    finally {}
  }
  
  public void setNotifyListener(TXINotifyListener paramTXINotifyListener)
  {
    if (paramTXINotifyListener == null)
    {
      this.mNotifyListener = null;
      return;
    }
    this.mNotifyListener = new WeakReference(paramTXINotifyListener);
  }
  
  @TargetApi(21)
  public void stopScreenCaptureInternal()
  {
    if (!this.mHoldSet.isEmpty()) {
      return;
    }
    this.mbStarted = false;
    if (this.mMediaProjection != null)
    {
      this.mMediaProjection.stop();
      this.mMediaProjection.unregisterCallback(this.mMediaProjectionCallback);
    }
    try
    {
      if (this.mApplicationContext != null) {
        this.mApplicationContext.unregisterReceiver(this.mBroadCastReceiver);
      }
      this.mMediaProjection = null;
      this.mRunningState = 1;
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  private class WaitOpenCaptureParam
  {
    int mHeight;
    Surface mSurface;
    int mWidth;
    
    public WaitOpenCaptureParam() {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\liteav\screencapture\TXCScreenCaptureImplSingleton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */