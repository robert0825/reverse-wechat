package com.tencent.mm.ipcinvoker;

import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.Map;

public class j
{
  private static volatile j fVx;
  Map<String, BaseIPCService> fVy;
  
  private j()
  {
    GMTrace.i(18688744882176L, 139242);
    this.fVy = new HashMap();
    GMTrace.o(18688744882176L, 139242);
  }
  
  public static j vQ()
  {
    GMTrace.i(18688879099904L, 139243);
    if (fVx == null) {}
    try
    {
      if (fVx == null) {
        fVx = new j();
      }
      j localj = fVx;
      GMTrace.o(18688879099904L, 139243);
      return localj;
    }
    finally {}
  }
  
  public final BaseIPCService eq(String paramString)
  {
    GMTrace.i(18689013317632L, 139244);
    paramString = (BaseIPCService)this.fVy.get(paramString);
    GMTrace.o(18689013317632L, 139244);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ipcinvoker\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */