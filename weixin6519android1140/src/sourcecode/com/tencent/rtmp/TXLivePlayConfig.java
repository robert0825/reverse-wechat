package com.tencent.rtmp;

public class TXLivePlayConfig
{
  boolean mAutoAdjustCacheTime = true;
  String mCacheFolderPath;
  float mCacheTime = 5.0F;
  int mConnectRetryCount = 3;
  int mConnectRetryInterval = 3;
  boolean mEnableAec = false;
  boolean mEnableNearestIP = true;
  float mMaxAutoAdjustCacheTime = 5.0F;
  int mMaxCacheItems;
  float mMinAutoAdjustCacheTime = 1.0F;
  int mRtmpChannelType = 0;
  
  public void enableAEC(boolean paramBoolean)
  {
    this.mEnableAec = paramBoolean;
  }
  
  public void setAutoAdjustCacheTime(boolean paramBoolean)
  {
    this.mAutoAdjustCacheTime = paramBoolean;
  }
  
  public void setCacheFolderPath(String paramString)
  {
    this.mCacheFolderPath = paramString;
  }
  
  public void setCacheTime(float paramFloat)
  {
    this.mCacheTime = paramFloat;
  }
  
  public void setConnectRetryCount(int paramInt)
  {
    this.mConnectRetryCount = paramInt;
  }
  
  public void setConnectRetryInterval(int paramInt)
  {
    this.mConnectRetryInterval = paramInt;
  }
  
  public void setEnableNearestIP(boolean paramBoolean)
  {
    this.mEnableNearestIP = paramBoolean;
  }
  
  public void setMaxAutoAdjustCacheTime(float paramFloat)
  {
    this.mMaxAutoAdjustCacheTime = paramFloat;
  }
  
  public void setMaxCacheItems(int paramInt)
  {
    this.mMaxCacheItems = paramInt;
  }
  
  public void setMinAutoAdjustCacheTime(float paramFloat)
  {
    this.mMinAutoAdjustCacheTime = paramFloat;
  }
  
  public void setRtmpChannelType(int paramInt)
  {
    this.mRtmpChannelType = paramInt;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\rtmp\TXLivePlayConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */