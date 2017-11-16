package com.tencent.tinker.lib.e;

import android.util.Log;

public final class a
{
  private static a ygR;
  private static a ygS;
  
  static
  {
    a local1 = new a()
    {
      public final void e(String paramAnonymousString1, String paramAnonymousString2, Object... paramAnonymousVarArgs)
      {
        if ((paramAnonymousVarArgs == null) || (paramAnonymousVarArgs.length == 0)) {
          return;
        }
        String.format(paramAnonymousString2, paramAnonymousVarArgs);
      }
      
      public final void i(String paramAnonymousString1, String paramAnonymousString2, Object... paramAnonymousVarArgs)
      {
        if ((paramAnonymousVarArgs == null) || (paramAnonymousVarArgs.length == 0)) {
          return;
        }
        String.format(paramAnonymousString2, paramAnonymousVarArgs);
      }
      
      public final void printErrStackTrace(String paramAnonymousString1, Throwable paramAnonymousThrowable, String paramAnonymousString2, Object... paramAnonymousVarArgs)
      {
        if ((paramAnonymousVarArgs == null) || (paramAnonymousVarArgs.length == 0)) {}
        for (paramAnonymousString1 = paramAnonymousString2;; paramAnonymousString1 = String.format(paramAnonymousString2, paramAnonymousVarArgs))
        {
          paramAnonymousString2 = paramAnonymousString1;
          if (paramAnonymousString1 == null) {
            paramAnonymousString2 = "";
          }
          new StringBuilder().append(paramAnonymousString2).append("  ").append(Log.getStackTraceString(paramAnonymousThrowable));
          return;
        }
      }
      
      public final void w(String paramAnonymousString1, String paramAnonymousString2, Object... paramAnonymousVarArgs)
      {
        if ((paramAnonymousVarArgs == null) || (paramAnonymousVarArgs.length == 0)) {
          return;
        }
        String.format(paramAnonymousString2, paramAnonymousVarArgs);
      }
    };
    ygR = local1;
    ygS = local1;
  }
  
  public static void a(a parama)
  {
    ygS = parama;
  }
  
  public static void e(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (ygS != null) {
      ygS.e(paramString1, paramString2, paramVarArgs);
    }
  }
  
  public static void i(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (ygS != null) {
      ygS.i(paramString1, paramString2, paramVarArgs);
    }
  }
  
  public static void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object... paramVarArgs)
  {
    if (ygS != null) {
      ygS.printErrStackTrace(paramString1, paramThrowable, paramString2, paramVarArgs);
    }
  }
  
  public static void w(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (ygS != null) {
      ygS.w(paramString1, paramString2, paramVarArgs);
    }
  }
  
  public static abstract interface a
  {
    public abstract void e(String paramString1, String paramString2, Object... paramVarArgs);
    
    public abstract void i(String paramString1, String paramString2, Object... paramVarArgs);
    
    public abstract void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object... paramVarArgs);
    
    public abstract void w(String paramString1, String paramString2, Object... paramVarArgs);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\tinker\lib\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */