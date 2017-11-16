package com.tencent.mm.y.a;

import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;

public final class b
{
  public String gpA;
  public String gpB;
  public String gpC;
  public String gpD;
  public HashMap<String, e> gpE;
  
  public b()
  {
    GMTrace.i(692026605568L, 5156);
    this.gpE = new HashMap();
    GMTrace.o(692026605568L, 5156);
  }
  
  public final e hb(String paramString)
  {
    GMTrace.i(692160823296L, 5157);
    if ((this.gpE != null) && (this.gpE.containsKey(paramString)))
    {
      paramString = (e)this.gpE.get(paramString);
      GMTrace.o(692160823296L, 5157);
      return paramString;
    }
    GMTrace.o(692160823296L, 5157);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */