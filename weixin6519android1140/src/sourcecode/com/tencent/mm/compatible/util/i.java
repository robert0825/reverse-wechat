package com.tencent.mm.compatible.util;

import com.tencent.gmtrace.GMTrace;
import java.security.PrivilegedAction;

public final class i
  implements PrivilegedAction
{
  private String fSq;
  private String fSr;
  
  public i(String paramString)
  {
    GMTrace.i(13779865698304L, 102668);
    this.fSq = paramString;
    GMTrace.o(13779865698304L, 102668);
  }
  
  public final Object run()
  {
    GMTrace.i(13779999916032L, 102669);
    String str = System.getProperty(this.fSq);
    if (str == null)
    {
      str = this.fSr;
      GMTrace.o(13779999916032L, 102669);
      return str;
    }
    GMTrace.o(13779999916032L, 102669);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\util\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */