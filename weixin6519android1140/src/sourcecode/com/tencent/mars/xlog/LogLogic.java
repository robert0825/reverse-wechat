package com.tencent.mars.xlog;

public class LogLogic
{
  public static native int getAppenderModeFromCfg();
  
  public static native int getIPxxLogLevel();
  
  public static native int getLogLevelFromCfg();
  
  public static native void initIPxxLogInfo();
  
  public static native void setIPxxLogML(int paramInt1, int paramInt2);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mars\xlog\LogLogic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */