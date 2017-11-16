package com.tencent.mm.x;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Map;

public final class j
{
  public int glt;
  public int glu;
  
  public j()
  {
    GMTrace.i(17446694027264L, 129988);
    GMTrace.o(17446694027264L, 129988);
  }
  
  public static final j eW(String paramString)
  {
    GMTrace.i(17446828244992L, 129989);
    j localj = new j();
    paramString = f.a.C(paramString, null);
    if (paramString != null)
    {
      paramString = paramString.gle;
      if (paramString != null)
      {
        localj.glt = bg.getInt((String)paramString.get(".msg.appmsg.xmlfulllen"), 0);
        localj.glu = bg.getInt((String)paramString.get(".msg.appmsg.realinnertype"), 0);
      }
    }
    GMTrace.o(17446828244992L, 129989);
    return localj;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\x\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */