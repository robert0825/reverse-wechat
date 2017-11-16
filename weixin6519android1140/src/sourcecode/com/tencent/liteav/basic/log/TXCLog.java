package com.tencent.liteav.basic.log;

import com.tencent.liteav.basic.util.TXCSystemUtil;

public class TXCLog
{
  public static final int LOG_ASYNC = 0;
  public static final int LOG_DEBUG = 1;
  public static final int LOG_ERROR = 4;
  public static final int LOG_FATAL = 5;
  public static final int LOG_INFO = 2;
  public static final int LOG_NONE = 6;
  public static final int LOG_SYNC = 1;
  public static final int LOG_VERBOSE = 0;
  public static final int LOG_WARNING = 3;
  private static boolean mConsoleEnable;
  private static boolean mHasInit;
  private static ITXLogListener mListener;
  private static int mLogLevel;
  private static final Object mLogLock = new Object();
  
  static
  {
    mHasInit = false;
    mLogLevel = 0;
    mConsoleEnable = true;
    mListener = null;
    TXCSystemUtil.loadLiteAVLibrary();
  }
  
  public static void d(String paramString1, String paramString2)
  {
    log(1, paramString1, paramString2);
  }
  
  public static void e(String paramString1, String paramString2)
  {
    log(4, paramString1, paramString2);
  }
  
  public static void i(String paramString1, String paramString2)
  {
    log(2, paramString1, paramString2);
  }
  
  public static void init()
  {
    synchronized (mLogLock)
    {
      if (!mHasInit)
      {
        nativeLogInit();
        mHasInit = true;
      }
      return;
    }
  }
  
  public static void log(int paramInt, String paramString1, String paramString2)
  {
    init();
    log_impl(paramInt, paramString1, paramString2);
  }
  
  private static void log_impl(int paramInt, String paramString1, String paramString2)
  {
    if (mListener != null) {
      mListener.OnLog(paramInt, paramString1, paramString2);
    }
  }
  
  private static native void nativeLogInit();
  
  public static void setConsoleEnabled(boolean paramBoolean)
  {
    init();
    mConsoleEnable = paramBoolean;
  }
  
  public static void setLevel(int paramInt)
  {
    init();
    mLogLevel = paramInt;
  }
  
  public static void setListener(ITXLogListener paramITXLogListener)
  {
    init();
    mListener = paramITXLogListener;
  }
  
  public static void v(String paramString1, String paramString2)
  {
    log(0, paramString1, paramString2);
  }
  
  public static void w(String paramString1, String paramString2)
  {
    log(3, paramString1, paramString2);
  }
  
  public static abstract interface ITXLogListener
  {
    public abstract void OnLog(int paramInt, String paramString1, String paramString2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\basic\log\TXCLog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */