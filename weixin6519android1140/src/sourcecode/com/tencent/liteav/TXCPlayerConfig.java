package com.tencent.liteav;

public class TXCPlayerConfig
{
  public boolean autoAdjustCacheTime = true;
  public String cacheFolderPath;
  public float cacheTime = 5.0F;
  public int connectRetryCount = 3;
  public int connectRetryInterval = 3;
  public boolean enableAec = false;
  public boolean enableHWDec = false;
  public boolean enableNearestIP = true;
  public float maxAutoAdjustCacheTime = 5.0F;
  public int maxCacheItems;
  public float minAutoAdjustCacheTime = 1.0F;
  public int rtmpChannelType = 1;
  
  public void enableAEC(boolean paramBoolean)
  {
    this.enableAec = paramBoolean;
  }
  
  public void setAutoAdjustCacheTime(boolean paramBoolean)
  {
    this.autoAdjustCacheTime = paramBoolean;
  }
  
  public void setCacheTime(float paramFloat)
  {
    this.cacheTime = paramFloat;
  }
  
  public void setConnectRetryCount(int paramInt)
  {
    this.connectRetryCount = paramInt;
  }
  
  public void setConnectRetryInterval(int paramInt)
  {
    this.connectRetryInterval = paramInt;
  }
  
  public void setEnableNearestIP(boolean paramBoolean)
  {
    this.enableNearestIP = paramBoolean;
  }
  
  public void setMaxAutoAdjustCacheTime(float paramFloat)
  {
    this.maxAutoAdjustCacheTime = paramFloat;
  }
  
  public void setMinAutoAdjustCacheTime(float paramFloat)
  {
    this.minAutoAdjustCacheTime = paramFloat;
  }
  
  public void setRtmpChannelType(int paramInt)
  {
    this.rtmpChannelType = paramInt;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\TXCPlayerConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */