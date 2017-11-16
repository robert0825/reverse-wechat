package com.tencent.liteav.videoencoder;

import android.opengl.GLES20;
import android.os.Bundle;
import com.tencent.liteav.basic.listener.TXINotifyListener;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCModule;
import com.tencent.liteav.basic.opengl.EGL10Helper;
import com.tencent.liteav.basic.opengl.TXCGPUFilter;
import com.tencent.liteav.basic.serverconfig.TXCConfigCenter;
import com.tencent.liteav.basic.util.TXCSystemUtil;
import com.tencent.liteav.basic.util.TXCThread;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.beauty.gpu_filters.TXCGPUI4202RGBAFilter;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import javax.microedition.khronos.egl.EGLContext;

public class TXCVideoEncoder
  extends TXCModule
{
  private static final boolean DEBUG = false;
  private static final String TAG = TXCVideoEncoder.class.getSimpleName();
  private static int count = 0;
  private static Integer mEGLThreadIdx = Integer.valueOf(1);
  private int fpsCount;
  private long fpsTick;
  public int mBitrate = 0;
  private boolean mCreateEGLContext;
  private LinkedList<Runnable> mDrawTasks = new LinkedList();
  public EGL10Helper mEGL10Helper;
  private TXCThread mEGLThread;
  private int mEncoderType = 2;
  private WeakReference<TXINotifyListener> mEventNotifyListener = null;
  public float mHWWhiteAppCPU = 0.0F;
  public int mHWWhiteCpuFpsCount = 0;
  public float mHWWhiteFPS = 0.0F;
  public float mHWWhiteTotalCPU = 0.0F;
  public TXIVideoEncoderListener mListen = null;
  public TXSVideoEncoderParam mParam;
  public TXCGPUI4202RGBAFilter mRawFrameFilter;
  public int mSWToHWThreshold_CheckCount = 0;
  private Timer mTimer = null;
  private TimerTask mTimerTask = null;
  public TXIVideoEncoder mVideoEncoder = null;
  
  public TXCVideoEncoder(int paramInt)
  {
    this.mEncoderType = paramInt;
  }
  
  private void eventNotify(int paramInt1, String paramString, int paramInt2)
  {
    if (this.mEventNotifyListener == null) {}
    TXINotifyListener localTXINotifyListener;
    do
    {
      return;
      localTXINotifyListener = (TXINotifyListener)this.mEventNotifyListener.get();
    } while (localTXINotifyListener == null);
    Bundle localBundle = new Bundle();
    localBundle.putInt("EVT_ID", paramInt1);
    localBundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
    localBundle.putCharSequence("EVT_MSG", paramString);
    localBundle.putInt("EVT_PARAM1", paramInt2);
    localTXINotifyListener.onNotifyEvent(paramInt1, localBundle);
  }
  
  private boolean runAll(Queue<Runnable> paramQueue)
  {
    try
    {
      if (paramQueue.isEmpty()) {
        return false;
      }
      Runnable localRunnable = (Runnable)paramQueue.poll();
      if (localRunnable == null) {
        return false;
      }
    }
    finally {}
    ((Runnable)localObject).run();
    return true;
  }
  
  private void startTimer()
  {
    if (this.mTimerTask == null) {
      this.mTimerTask = new SwitchTimerTask(this);
    }
    this.mTimer = new Timer();
    this.mTimer.schedule(this.mTimerTask, 1000L, 1000L);
  }
  
  public EGLContext createInputEGL()
  {
    EGLContext localEGLContext = null;
    if (!this.mCreateEGLContext) {
      this.mCreateEGLContext = true;
    }
    while (this.mEGL10Helper == null) {
      synchronized (mEGLThreadIdx)
      {
        StringBuilder localStringBuilder = new StringBuilder("CVGLThread");
        Integer localInteger = mEGLThreadIdx;
        mEGLThreadIdx = Integer.valueOf(mEGLThreadIdx.intValue() + 1);
        this.mEGLThread = new TXCThread(localInteger);
        ??? = new boolean[1];
        this.mEGLThread.runSync(new Runnable()
        {
          public void run()
          {
            int i = 1;
            TXCVideoEncoder.this.mEGL10Helper = EGL10Helper.createEGLSurface(null, null, null, 1, 1);
            boolean[] arrayOfBoolean = localObject2;
            if (TXCVideoEncoder.this.mEGL10Helper != null) {}
            for (;;)
            {
              arrayOfBoolean[0] = i;
              return;
              i = 0;
            }
          }
        });
        if (???[0] != 0) {
          localEGLContext = this.mEGL10Helper.getContext();
        }
        return localEGLContext;
      }
    }
    return this.mEGL10Helper.getContext();
  }
  
  public void eventNotify(int paramInt, String paramString)
  {
    if (this.mEventNotifyListener == null) {}
    TXINotifyListener localTXINotifyListener;
    do
    {
      return;
      localTXINotifyListener = (TXINotifyListener)this.mEventNotifyListener.get();
    } while (localTXINotifyListener == null);
    Bundle localBundle = new Bundle();
    localBundle.putInt("EVT_ID", paramInt);
    localBundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
    localBundle.putCharSequence("EVT_MSG", paramString);
    localTXINotifyListener.onNotifyEvent(paramInt, localBundle);
  }
  
  public long getRealBitrate()
  {
    long l = 0L;
    if (this.mVideoEncoder != null) {
      l = this.mVideoEncoder.getRealBitrate();
    }
    return l;
  }
  
  public long getRealFPS()
  {
    long l = 0L;
    if (this.mVideoEncoder != null) {
      l = this.mVideoEncoder.getRealFPS();
    }
    return l;
  }
  
  public int getVideoHeight()
  {
    int i = 0;
    if (this.mVideoEncoder != null) {
      i = this.mVideoEncoder.getVideoHeight();
    }
    return i;
  }
  
  public int getVideoWidth()
  {
    int i = 0;
    if (this.mVideoEncoder != null) {
      i = this.mVideoEncoder.getVideoWidth();
    }
    return i;
  }
  
  public long pushVideoFrame(int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    long l = 10000002L;
    while (runAll(this.mDrawTasks)) {}
    if (this.mVideoEncoder != null) {
      l = this.mVideoEncoder.pushVideoFrame(paramInt1, paramInt2, paramInt3, paramLong);
    }
    return l;
  }
  
  public long pushVideoFrame(final byte[] paramArrayOfByte, final int paramInt1, final int paramInt2, final int paramInt3, final long paramLong)
  {
    if (this.mEGL10Helper == null) {
      return -1L;
    }
    this.mEGLThread.runAsync(new Runnable()
    {
      public void run()
      {
        if ((TXCVideoEncoder.this.mRawFrameFilter == null) || (TXCVideoEncoder.this.mRawFrameFilter.getOutputWidth() != paramInt2) || (TXCVideoEncoder.this.mRawFrameFilter.getOutputHeight() != paramInt3))
        {
          if (TXCVideoEncoder.this.mRawFrameFilter != null)
          {
            TXCVideoEncoder.this.mRawFrameFilter.destroy();
            TXCVideoEncoder.this.mRawFrameFilter = null;
          }
          TXCVideoEncoder.this.mRawFrameFilter = new TXCGPUI4202RGBAFilter(paramInt1);
          if (!TXCVideoEncoder.this.mRawFrameFilter.init())
          {
            TXCVideoEncoder.this.mEGL10Helper.release();
            TXCVideoEncoder.this.mEGL10Helper = null;
            TXCVideoEncoder.this.mRawFrameFilter = null;
            return;
          }
          TXCVideoEncoder.this.mRawFrameFilter.setHasFrameBuffer(true);
          TXCVideoEncoder.this.mRawFrameFilter.onOutputSizeChanged(paramInt2, paramInt3);
        }
        TXCVideoEncoder.this.mRawFrameFilter.setRenderBuffer(paramArrayOfByte);
        GLES20.glViewport(0, 0, paramInt2, paramInt3);
        int i = TXCVideoEncoder.this.mRawFrameFilter.onDrawToTexture();
        GLES20.glFlush();
        TXCVideoEncoder.this.pushVideoFrame(i, TXCVideoEncoder.this.mParam.width, TXCVideoEncoder.this.mParam.height, paramLong);
      }
    });
    return 0L;
  }
  
  protected void runOnDraw(Runnable paramRunnable)
  {
    synchronized (this.mDrawTasks)
    {
      this.mDrawTasks.add(paramRunnable);
      return;
    }
  }
  
  public void setBitrate(int paramInt)
  {
    this.mBitrate = paramInt;
    runOnDraw(new Runnable()
    {
      public void run()
      {
        if (TXCVideoEncoder.this.mVideoEncoder != null) {
          TXCVideoEncoder.this.mVideoEncoder.setBitrate(TXCVideoEncoder.this.mBitrate);
        }
      }
    });
  }
  
  public void setEventNotifyListener(TXINotifyListener paramTXINotifyListener)
  {
    this.mEventNotifyListener = new WeakReference(paramTXINotifyListener);
  }
  
  public void setID(String paramString)
  {
    super.setID(paramString);
    if (this.mVideoEncoder != null) {
      this.mVideoEncoder.setID(paramString);
    }
  }
  
  public void setListener(TXIVideoEncoderListener paramTXIVideoEncoderListener)
  {
    this.mListen = paramTXIVideoEncoderListener;
    runOnDraw(new Runnable()
    {
      public void run()
      {
        if (TXCVideoEncoder.this.mVideoEncoder != null) {
          TXCVideoEncoder.this.mVideoEncoder.setListener(TXCVideoEncoder.this.mListen);
        }
      }
    });
  }
  
  public int start(TXSVideoEncoderParam paramTXSVideoEncoderParam)
  {
    this.mParam = paramTXSVideoEncoderParam;
    int i = 10000002;
    int j = TXCConfigCenter.getInstance().getHWEncValue();
    if ((this.mEncoderType == 1) && (j != 0))
    {
      this.mVideoEncoder = new TXCHWVideoEncoder();
      eventNotify(1008, "启动硬编", 1);
    }
    for (;;)
    {
      if (this.mVideoEncoder != null)
      {
        if (this.mListen != null) {
          this.mVideoEncoder.setListener(this.mListen);
        }
        if (this.mBitrate != 0) {
          this.mVideoEncoder.setBitrate(this.mBitrate);
        }
        this.mVideoEncoder.setID(getID());
        i = this.mVideoEncoder.start(paramTXSVideoEncoderParam);
      }
      if (this.mEncoderType == 3)
      {
        this.mHWWhiteAppCPU = 0.0F;
        this.mHWWhiteTotalCPU = 0.0F;
        this.mHWWhiteFPS = 0.0F;
        this.mHWWhiteCpuFpsCount = 0;
        this.mSWToHWThreshold_CheckCount = TXCConfigCenter.getInstance().getSWToHWThresholdCheckCount();
        startTimer();
      }
      return i;
      if ((this.mEncoderType == 3) && (paramTXSVideoEncoderParam.width == 720) && (paramTXSVideoEncoderParam.height == 1280) && (j != 0))
      {
        this.mVideoEncoder = new TXCHWVideoEncoder();
        eventNotify(1008, "启动硬编", 1);
      }
      else
      {
        this.mVideoEncoder = new TXCSWVideoEncoder();
        eventNotify(1008, "启动软编", 2);
      }
    }
  }
  
  public void stop()
  {
    this.mDrawTasks.clear();
    if (this.mVideoEncoder != null) {
      this.mVideoEncoder.stop();
    }
    if (this.mEGLThread != null)
    {
      final TXCGPUI4202RGBAFilter localTXCGPUI4202RGBAFilter = this.mRawFrameFilter;
      final EGL10Helper localEGL10Helper = this.mEGL10Helper;
      this.mEGLThread.runAsync(new Runnable()
      {
        public void run()
        {
          if (localTXCGPUI4202RGBAFilter != null) {
            localTXCGPUI4202RGBAFilter.destroy();
          }
          if (localEGL10Helper != null) {
            localEGL10Helper.release();
          }
        }
      });
      this.mEGLThread = null;
      this.mRawFrameFilter = null;
      this.mEGL10Helper = null;
    }
    if (this.mEncoderType == 3)
    {
      this.mHWWhiteAppCPU = 0.0F;
      this.mHWWhiteTotalCPU = 0.0F;
      this.mHWWhiteFPS = 0.0F;
      this.mHWWhiteCpuFpsCount = 0;
      stopTimer();
    }
    this.mListen = null;
    this.mBitrate = 0;
  }
  
  public void stopTimer()
  {
    if (this.mTimer != null)
    {
      this.mTimer.cancel();
      this.mTimer = null;
    }
    if (this.mTimerTask != null) {
      this.mTimerTask = null;
    }
  }
  
  public void switchSWToHW()
  {
    runOnDraw(new Runnable()
    {
      public void run()
      {
        TXCVideoEncoder.this.eventNotify(1107, "软编切硬编");
        if (TXCVideoEncoder.this.mVideoEncoder != null)
        {
          TXCVideoEncoder.this.mVideoEncoder.setListener(null);
          TXCVideoEncoder.this.mVideoEncoder.stop();
        }
        TXCVideoEncoder.this.mVideoEncoder = new TXCHWVideoEncoder();
        TXCVideoEncoder.this.mVideoEncoder.start(TXCVideoEncoder.this.mParam);
        if (TXCVideoEncoder.this.mListen != null) {
          TXCVideoEncoder.this.mVideoEncoder.setListener(TXCVideoEncoder.this.mListen);
        }
        if (TXCVideoEncoder.this.mBitrate != 0) {
          TXCVideoEncoder.this.mVideoEncoder.setBitrate(TXCVideoEncoder.this.mBitrate);
        }
        TXCVideoEncoder.this.mVideoEncoder.setID(TXCVideoEncoder.this.getID());
      }
    });
    TXCLog.w("TXCVideoEncoder", "switchSWToHW");
  }
  
  static class SwitchTimerTask
    extends TimerTask
  {
    private WeakReference<TXCVideoEncoder> mEncoder;
    
    public SwitchTimerTask(TXCVideoEncoder paramTXCVideoEncoder)
    {
      this.mEncoder = new WeakReference(paramTXCVideoEncoder);
    }
    
    public void run()
    {
      if (this.mEncoder == null) {}
      TXCVideoEncoder localTXCVideoEncoder;
      do
      {
        return;
        localTXCVideoEncoder = (TXCVideoEncoder)this.mEncoder.get();
      } while (localTXCVideoEncoder == null);
      if (localTXCVideoEncoder.mHWWhiteCpuFpsCount < localTXCVideoEncoder.mSWToHWThreshold_CheckCount)
      {
        int[] arrayOfInt = TXCSystemUtil.getProcessCPURate();
        localTXCVideoEncoder.mHWWhiteCpuFpsCount += 1;
        localTXCVideoEncoder.mHWWhiteAppCPU += arrayOfInt[0] / 10;
        float f = localTXCVideoEncoder.mHWWhiteTotalCPU;
        localTXCVideoEncoder.mHWWhiteTotalCPU = (arrayOfInt[1] / 10 + f);
        localTXCVideoEncoder.mHWWhiteFPS += (float)(localTXCVideoEncoder.getRealFPS() * 100L / localTXCVideoEncoder.mParam.fps);
        return;
      }
      if ((TXCConfigCenter.getInstance().getSWToHWChangeble(localTXCVideoEncoder.mHWWhiteAppCPU / localTXCVideoEncoder.mSWToHWThreshold_CheckCount, localTXCVideoEncoder.mHWWhiteTotalCPU / localTXCVideoEncoder.mSWToHWThreshold_CheckCount, localTXCVideoEncoder.mHWWhiteFPS / localTXCVideoEncoder.mSWToHWThreshold_CheckCount)) && (TXCConfigCenter.getInstance().getHWEncValue() != 0)) {
        localTXCVideoEncoder.switchSWToHW();
      }
      localTXCVideoEncoder.stopTimer();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\videoencoder\TXCVideoEncoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */