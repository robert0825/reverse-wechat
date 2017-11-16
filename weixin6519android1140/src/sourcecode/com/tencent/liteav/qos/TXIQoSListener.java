package com.tencent.liteav.qos;

public abstract interface TXIQoSListener
{
  public abstract void onEnableDropStatusChanged(boolean paramBoolean);
  
  public abstract void onEncoderParamsChanged(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract int onGetEncoderRealBitrate();
  
  public abstract int onGetQueueInputSize();
  
  public abstract int onGetQueueOutputSize();
  
  public abstract int onGetVideoDropCount();
  
  public abstract int onGetVideoQueueCurrentCount();
  
  public abstract int onGetVideoQueueMaxCount();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\qos\TXIQoSListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */