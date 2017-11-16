package com.tencent.mm.pluginsdk.j.a.c;

import com.tencent.gmtrace.GMTrace;
import java.io.IOException;

public final class f
  extends IOException
{
  public final int httpStatusCode;
  public final IOException tqV;
  
  public f(int paramInt, IOException paramIOException)
  {
    GMTrace.i(885300133888L, 6596);
    this.httpStatusCode = paramInt;
    this.tqV = paramIOException;
    GMTrace.o(885300133888L, 6596);
  }
  
  public final String toString()
  {
    GMTrace.i(885434351616L, 6597);
    String str = "UnknownConnectionError{httpStatusCode=" + this.httpStatusCode + ", realException=" + this.tqV + '}';
    GMTrace.o(885434351616L, 6597);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\j\a\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */