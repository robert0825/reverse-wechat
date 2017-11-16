package com.tencent.mars;

public class BaseEvent
{
  public static native void onCreate();
  
  public static native void onDestroy();
  
  public static native void onExceptionCrash();
  
  public static native void onForeground(boolean paramBoolean);
  
  public static native void onNetworkChange();
  
  public static native void onSingalCrash(int paramInt);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mars\BaseEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */