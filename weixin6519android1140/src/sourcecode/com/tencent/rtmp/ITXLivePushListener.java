package com.tencent.rtmp;

import android.os.Bundle;

public abstract interface ITXLivePushListener
{
  public abstract void onNetStatus(Bundle paramBundle);
  
  public abstract void onPushEvent(int paramInt, Bundle paramBundle);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\rtmp\ITXLivePushListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */