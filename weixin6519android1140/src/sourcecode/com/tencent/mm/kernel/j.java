package com.tencent.mm.kernel;

import com.tencent.gmtrace.GMTrace;

public final class j
{
  private static volatile a fZZ;
  
  static
  {
    GMTrace.i(18792763621376L, 140017);
    fZZ = null;
    GMTrace.o(18792763621376L, 140017);
  }
  
  public static void a(a parama)
  {
    GMTrace.i(18792092532736L, 140012);
    fZZ = parama;
    GMTrace.o(18792092532736L, 140012);
  }
  
  public static void e(String paramString1, String paramString2, Object... paramVarArgs)
  {
    GMTrace.i(18792226750464L, 140013);
    if (fZZ != null) {
      fZZ.e(paramString1, paramString2, paramVarArgs);
    }
    GMTrace.o(18792226750464L, 140013);
  }
  
  public static void i(String paramString1, String paramString2, Object... paramVarArgs)
  {
    GMTrace.i(18792495185920L, 140015);
    if (fZZ != null) {
      fZZ.i(paramString1, paramString2, paramVarArgs);
    }
    GMTrace.o(18792495185920L, 140015);
  }
  
  public static void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object... paramVarArgs)
  {
    GMTrace.i(18792629403648L, 140016);
    if (fZZ != null) {
      fZZ.printErrStackTrace(paramString1, paramThrowable, paramString2, paramVarArgs);
    }
    GMTrace.o(18792629403648L, 140016);
  }
  
  public static void w(String paramString1, String paramString2, Object... paramVarArgs)
  {
    GMTrace.i(18792360968192L, 140014);
    if (fZZ != null) {
      fZZ.w(paramString1, paramString2, paramVarArgs);
    }
    GMTrace.o(18792360968192L, 140014);
  }
  
  public static abstract interface a
  {
    public abstract void e(String paramString1, String paramString2, Object... paramVarArgs);
    
    public abstract void i(String paramString1, String paramString2, Object... paramVarArgs);
    
    public abstract void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object... paramVarArgs);
    
    public abstract void w(String paramString1, String paramString2, Object... paramVarArgs);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\kernel\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */