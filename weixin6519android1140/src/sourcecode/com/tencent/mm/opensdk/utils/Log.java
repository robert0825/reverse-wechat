package com.tencent.mm.opensdk.utils;

import com.tencent.gmtrace.GMTrace;

public class Log
{
  private static ILog logImpl;
  
  public Log()
  {
    GMTrace.i(14617786974208L, 108911);
    GMTrace.o(14617786974208L, 108911);
  }
  
  public static void d(String paramString1, String paramString2)
  {
    GMTrace.i(14618189627392L, 108914);
    if (logImpl == null)
    {
      GMTrace.o(14618189627392L, 108914);
      return;
    }
    logImpl.d(paramString1, paramString2);
    GMTrace.o(14618189627392L, 108914);
  }
  
  public static void e(String paramString1, String paramString2)
  {
    GMTrace.i(14618592280576L, 108917);
    if (logImpl == null)
    {
      GMTrace.o(14618592280576L, 108917);
      return;
    }
    logImpl.e(paramString1, paramString2);
    GMTrace.o(14618592280576L, 108917);
  }
  
  public static void i(String paramString1, String paramString2)
  {
    GMTrace.i(14618323845120L, 108915);
    if (logImpl == null)
    {
      GMTrace.o(14618323845120L, 108915);
      return;
    }
    logImpl.i(paramString1, paramString2);
    GMTrace.o(14618323845120L, 108915);
  }
  
  public static void setLogImpl(ILog paramILog)
  {
    GMTrace.i(14617921191936L, 108912);
    logImpl = paramILog;
    GMTrace.o(14617921191936L, 108912);
  }
  
  public static void v(String paramString1, String paramString2)
  {
    GMTrace.i(14618055409664L, 108913);
    if (logImpl == null)
    {
      GMTrace.o(14618055409664L, 108913);
      return;
    }
    logImpl.v(paramString1, paramString2);
    GMTrace.o(14618055409664L, 108913);
  }
  
  public static void w(String paramString1, String paramString2)
  {
    GMTrace.i(14618458062848L, 108916);
    if (logImpl == null)
    {
      GMTrace.o(14618458062848L, 108916);
      return;
    }
    logImpl.w(paramString1, paramString2);
    GMTrace.o(14618458062848L, 108916);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\opensdk\utils\Log.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */