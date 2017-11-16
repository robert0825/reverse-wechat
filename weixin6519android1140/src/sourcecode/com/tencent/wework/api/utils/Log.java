package com.tencent.wework.api.utils;

public class Log
{
  private static int xOn = 8;
  private static ILogger ymH = new WWAPILogger(new LogcatLogger());
  
  public static void d(String paramString1, String paramString2)
  {
    if (xOn <= 3) {
      ymH.a(3, paramString1, paramString2, null);
    }
  }
  
  public static void e(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (xOn <= 6) {
      ymH.a(6, paramString1, paramString2, paramThrowable);
    }
  }
  
  public static void i(String paramString1, String paramString2)
  {
    if (xOn <= 4) {
      ymH.a(4, paramString1, paramString2, null);
    }
  }
  
  public static void w(String paramString1, String paramString2)
  {
    if (xOn <= 5) {
      ymH.a(5, paramString1, paramString2, null);
    }
  }
  
  public static void w(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (xOn <= 5) {
      ymH.a(5, paramString1, paramString2, paramThrowable);
    }
  }
  
  public static abstract interface ILogger
  {
    public abstract void a(int paramInt, String paramString1, String paramString2, Throwable paramThrowable);
  }
  
  private static class LogcatLogger
    implements Log.ILogger
  {
    public final void a(int paramInt, String paramString1, String paramString2, Throwable paramThrowable) {}
  }
  
  private static class WWAPILogger
    implements Log.ILogger
  {
    Log.ILogger ymI;
    
    WWAPILogger(Log.ILogger paramILogger)
    {
      this.ymI = paramILogger;
    }
    
    public final void a(int paramInt, String paramString1, String paramString2, Throwable paramThrowable)
    {
      this.ymI.a(paramInt, "WWAPI-" + paramString1, paramString2, paramThrowable);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\wework\api\utils\Log.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */