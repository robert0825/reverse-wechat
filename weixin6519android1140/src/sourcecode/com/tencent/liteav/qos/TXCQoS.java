package com.tencent.liteav.qos;

import android.os.Bundle;
import android.os.Handler;
import com.tencent.liteav.basic.listener.TXINotifyListener;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCSystemUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;

public class TXCQoS
{
  static final String TAG = "TXCQos";
  public int mBitrate = 0;
  public Handler mHandler = new Handler();
  public int mHeight = 0;
  public long mInstance;
  public long mInterval = 1000L;
  public boolean mIsEnableDrop = false;
  public TXIQoSListener mListener;
  public TXINotifyListener mNotifyListener;
  private Runnable mRunnable = new Runnable()
  {
    public void run()
    {
      int i;
      int j;
      int k;
      Bundle localBundle;
      if (TXCQoS.this.mListener != null)
      {
        i = TXCQoS.this.mListener.onGetEncoderRealBitrate();
        j = TXCQoS.this.mListener.onGetQueueInputSize();
        k = TXCQoS.this.mListener.onGetQueueOutputSize();
        int m = TXCQoS.this.mListener.onGetVideoQueueMaxCount();
        int n = TXCQoS.this.mListener.onGetVideoQueueCurrentCount();
        int i1 = TXCQoS.this.mListener.onGetVideoDropCount();
        TXCQoS.this.nativeSetVideoRealBitrate(TXCQoS.this.mInstance, i);
        TXCQoS.this.nativeAdjustBitrate(TXCQoS.this.mInstance, m, n, i1, k, j);
        boolean bool = TXCQoS.this.nativeIsEnableDrop(TXCQoS.this.mInstance);
        if (TXCQoS.this.mIsEnableDrop != bool)
        {
          TXCQoS.this.mIsEnableDrop = bool;
          TXCQoS.this.mListener.onEnableDropStatusChanged(bool);
        }
        i = TXCQoS.this.nativeGetBitrate(TXCQoS.this.mInstance);
        j = TXCQoS.this.nativeGetWidth(TXCQoS.this.mInstance);
        k = TXCQoS.this.nativeGetHeight(TXCQoS.this.mInstance);
        if ((j == TXCQoS.this.mWidth) && (k == TXCQoS.this.mHeight)) {
          break label392;
        }
        TXCQoS.this.mListener.onEncoderParamsChanged(i, j, k);
        if (TXCQoS.this.mNotifyListener != null)
        {
          localBundle = new Bundle();
          localBundle.putCharSequence("EVT_MSG", "调整分辨率:new bitrate:" + i + " new resolution:" + j + "*" + k);
          localBundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
          TXCQoS.this.mNotifyListener.onNotifyEvent(1005, localBundle);
        }
      }
      for (;;)
      {
        TXCQoS.this.mBitrate = i;
        TXCQoS.this.mWidth = j;
        TXCQoS.this.mHeight = k;
        TXCQoS.this.mHandler.postDelayed(this, TXCQoS.this.mInterval);
        return;
        label392:
        if (i != TXCQoS.this.mBitrate)
        {
          TXCQoS.this.mListener.onEncoderParamsChanged(i, 0, 0);
          if (TXCQoS.this.mNotifyListener != null)
          {
            localBundle = new Bundle();
            localBundle.putCharSequence("EVT_MSG", "调整编码码率:new bitrate:" + i);
            localBundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
            localBundle.putLong("EVT_USERID", TXCQoS.this.mUserID);
            TXCQoS.this.mNotifyListener.onNotifyEvent(1006, localBundle);
          }
        }
      }
    }
  };
  public long mUserID = 0L;
  public int mWidth = 0;
  
  static {}
  
  public TXCQoS(boolean paramBoolean)
  {
    this.mInstance = nativeInit(paramBoolean);
  }
  
  private native void nativeAddQueueInputSize(long paramLong, int paramInt);
  
  private native void nativeAddQueueOutputSize(long paramLong, int paramInt);
  
  private native void nativeDeinit(long paramLong);
  
  public static native int nativeGetProperResolutionByVideoBitrate(boolean paramBoolean, int paramInt1, int paramInt2);
  
  private native long nativeInit(boolean paramBoolean);
  
  private native void nativeReset(long paramLong, boolean paramBoolean);
  
  private native void nativeSetAutoAdjustBitrate(long paramLong, boolean paramBoolean);
  
  private native void nativeSetAutoAdjustStrategy(long paramLong, int paramInt);
  
  private native void nativeSetHasVideo(long paramLong, boolean paramBoolean);
  
  private native void nativeSetVideoDefaultResolution(long paramLong, int paramInt, boolean paramBoolean);
  
  private native void nativeSetVideoEncBitrate(long paramLong, int paramInt1, int paramInt2, int paramInt3);
  
  private native void nativeSetVideoExpectBitrate(long paramLong, int paramInt);
  
  protected void finalize()
  {
    try
    {
      nativeDeinit(this.mInstance);
      return;
    }
    finally
    {
      super.finalize();
    }
  }
  
  public long getUserID()
  {
    return this.mUserID;
  }
  
  public boolean isEnableDrop()
  {
    return nativeIsEnableDrop(this.mInstance);
  }
  
  public native void nativeAdjustBitrate(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  
  public native int nativeGetBitrate(long paramLong);
  
  public native int nativeGetHeight(long paramLong);
  
  public native int nativeGetWidth(long paramLong);
  
  public native boolean nativeIsEnableDrop(long paramLong);
  
  public native void nativeSetVideoRealBitrate(long paramLong, int paramInt);
  
  public void reset(boolean paramBoolean)
  {
    nativeReset(this.mInstance, paramBoolean);
  }
  
  public void setAutoAdjustBitrate(boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder("autoAdjustBitrate is ");
    if (paramBoolean) {}
    for (String str = "yes";; str = "no")
    {
      TXCLog.d("TXCQos", str);
      nativeSetAutoAdjustBitrate(this.mInstance, paramBoolean);
      return;
    }
  }
  
  public void setAutoAdjustStrategy(int paramInt)
  {
    TXCLog.d("TXCQos", "autoAdjustStrategy is " + paramInt);
    nativeSetAutoAdjustStrategy(this.mInstance, paramInt);
  }
  
  public void setDefaultVideoResolution(int paramInt, boolean paramBoolean)
  {
    TXCLog.d("TXCQos", "DefaultVideoResolution is " + paramInt);
    this.mWidth = 0;
    this.mHeight = 0;
    nativeSetVideoDefaultResolution(this.mInstance, paramInt, paramBoolean);
  }
  
  public void setHasVideo(boolean paramBoolean)
  {
    nativeSetHasVideo(this.mInstance, paramBoolean);
  }
  
  public void setListener(TXIQoSListener paramTXIQoSListener)
  {
    this.mListener = paramTXIQoSListener;
  }
  
  public void setNotifyListener(TXINotifyListener paramTXINotifyListener)
  {
    this.mNotifyListener = paramTXINotifyListener;
  }
  
  public void setUserID(long paramLong)
  {
    this.mUserID = paramLong;
  }
  
  public void setVideoEncBitrate(int paramInt1, int paramInt2, int paramInt3)
  {
    this.mBitrate = 0;
    nativeSetVideoEncBitrate(this.mInstance, paramInt1, paramInt2, paramInt3);
  }
  
  public void setVideoExpectBitrate(int paramInt)
  {
    nativeSetVideoExpectBitrate(this.mInstance, paramInt);
  }
  
  public void start(long paramLong)
  {
    this.mInterval = paramLong;
    this.mHandler.postDelayed(this.mRunnable, this.mInterval);
  }
  
  public void stop()
  {
    this.mHandler.removeCallbacks(this.mRunnable);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\qos\TXCQoS.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */