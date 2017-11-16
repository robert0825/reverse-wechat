package com.tencent.qqmusic.mediaplayer;

public abstract interface ILog
{
  public abstract void d(String paramString1, String paramString2);
  
  public abstract void e(String paramString1, String paramString2);
  
  public abstract void e(String paramString1, String paramString2, Throwable paramThrowable);
  
  public abstract void e(String paramString1, String paramString2, Object... paramVarArgs);
  
  public abstract void e(String paramString, Throwable paramThrowable);
  
  public abstract void i(String paramString1, String paramString2);
  
  public abstract void i(String paramString1, String paramString2, Throwable paramThrowable);
  
  public abstract void w(String paramString1, String paramString2);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\ILog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */