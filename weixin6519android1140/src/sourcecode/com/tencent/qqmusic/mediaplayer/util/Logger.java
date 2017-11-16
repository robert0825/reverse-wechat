package com.tencent.qqmusic.mediaplayer.util;

import com.tencent.qqmusic.mediaplayer.ILog;

public class Logger
{
  private static ILog mILog = null;
  
  public static void d(String paramString1, String paramString2)
  {
    if (mILog != null) {
      mILog.d(paramString1, paramString2);
    }
  }
  
  public static void e(String paramString1, String paramString2)
  {
    if (mILog != null) {
      mILog.e(paramString1, paramString2);
    }
  }
  
  public static void e(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (mILog != null) {
      mILog.e(paramString1, paramString2, paramThrowable);
    }
  }
  
  public static void e(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (mILog != null) {
      mILog.e(paramString1, paramString2, paramVarArgs);
    }
  }
  
  public static void e(String paramString, Throwable paramThrowable)
  {
    if (mILog != null) {
      mILog.e(paramString, paramThrowable);
    }
  }
  
  public static void i(String paramString1, String paramString2)
  {
    if (mILog != null) {
      mILog.i(paramString1, paramString2);
    }
  }
  
  public static void i(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (mILog != null) {
      mILog.i(paramString1, paramString2, paramThrowable);
    }
  }
  
  public static void setLog(ILog paramILog)
  {
    mILog = paramILog;
  }
  
  public static void w(String paramString1, String paramString2)
  {
    if (mILog != null) {
      mILog.w(paramString1, paramString2);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\util\Logger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */