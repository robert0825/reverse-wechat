package com.tencent.mm.jsapi.core;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jsapi.b.e;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.HashMap;
import java.util.Map;

public final class f
{
  private final Map<String, e> fXJ;
  
  public f()
  {
    GMTrace.i(20021526921216L, 149172);
    this.fXJ = new HashMap();
    GMTrace.o(20021526921216L, 149172);
  }
  
  public final void a(e parame)
  {
    GMTrace.i(20021661138944L, 149173);
    this.fXJ.put(parame.getName(), parame);
    GMTrace.o(20021661138944L, 149173);
  }
  
  public final e ew(String paramString)
  {
    GMTrace.i(20021795356672L, 149174);
    if (bg.nm(paramString))
    {
      GMTrace.o(20021795356672L, 149174);
      return null;
    }
    paramString = (e)this.fXJ.get(paramString);
    GMTrace.o(20021795356672L, 149174);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\jsapi\core\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */