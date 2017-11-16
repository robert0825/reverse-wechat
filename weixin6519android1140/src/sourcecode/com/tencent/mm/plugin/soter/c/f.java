package com.tencent.mm.plugin.soter.c;

import com.tencent.d.a.c.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class f
  implements b
{
  public f()
  {
    GMTrace.i(18503255982080L, 137860);
    GMTrace.o(18503255982080L, 137860);
  }
  
  public final void a(String paramString1, Exception paramException, String paramString2)
  {
    GMTrace.i(18504061288448L, 137866);
    w.printErrStackTrace(paramString1, paramException, paramString2, new Object[0]);
    GMTrace.o(18504061288448L, 137866);
  }
  
  public final void d(String paramString1, String paramString2, Object... paramVarArgs)
  {
    GMTrace.i(18503524417536L, 137862);
    w.d(paramString1, paramString2, paramVarArgs);
    GMTrace.o(18503524417536L, 137862);
  }
  
  public final void e(String paramString1, String paramString2, Object... paramVarArgs)
  {
    GMTrace.i(18503927070720L, 137865);
    w.e(paramString1, paramString2, paramVarArgs);
    GMTrace.o(18503927070720L, 137865);
  }
  
  public final void i(String paramString1, String paramString2, Object... paramVarArgs)
  {
    GMTrace.i(18503658635264L, 137863);
    w.i(paramString1, paramString2, paramVarArgs);
    GMTrace.o(18503658635264L, 137863);
  }
  
  public final void v(String paramString1, String paramString2, Object... paramVarArgs)
  {
    GMTrace.i(18503390199808L, 137861);
    w.v(paramString1, paramString2, paramVarArgs);
    GMTrace.o(18503390199808L, 137861);
  }
  
  public final void w(String paramString1, String paramString2, Object... paramVarArgs)
  {
    GMTrace.i(18503792852992L, 137864);
    w.w(paramString1, paramString2, paramVarArgs);
    GMTrace.o(18503792852992L, 137864);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\soter\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */