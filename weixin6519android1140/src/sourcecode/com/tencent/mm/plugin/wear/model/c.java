package com.tencent.mm.plugin.wear.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wear.model.e.i;
import com.tencent.mm.pluginsdk.p.w.a;
import com.tencent.mm.protocal.c.bsb;
import com.tencent.mm.sdk.platformtools.bg;

public final class c
  implements p.w.a
{
  public c()
  {
    GMTrace.i(9176734498816L, 68372);
    GMTrace.o(9176734498816L, 68372);
  }
  
  public final String bBo()
  {
    GMTrace.i(9176868716544L, 68373);
    Object localObject = a.bBm().rzt.rzK.rAy;
    if (localObject != null)
    {
      localObject = ((bsb)localObject).vbr + "\n" + ((bsb)localObject).vbs + "\n" + ((bsb)localObject).vbt;
      GMTrace.o(9176868716544L, 68373);
      return (String)localObject;
    }
    GMTrace.o(9176868716544L, 68373);
    return "Not Connect";
  }
  
  public final void bBp()
  {
    GMTrace.i(9177002934272L, 68374);
    a.bBm().rzz.a(new com.tencent.mm.plugin.wear.model.f.a());
    GMTrace.o(9177002934272L, 68374);
  }
  
  public final boolean bBq()
  {
    GMTrace.i(9177137152000L, 68375);
    Object localObject = a.bBm().rzt.rzK.rAy;
    if ((bg.nm(null)) && (bg.nm(null)))
    {
      if (localObject != null)
      {
        GMTrace.o(9177137152000L, 68375);
        return true;
      }
      GMTrace.o(9177137152000L, 68375);
      return false;
    }
    if (bg.nm(null))
    {
      if (localObject != null) {
        throw new NullPointerException();
      }
      GMTrace.o(9177137152000L, 68375);
      return false;
    }
    if (bg.nm(null))
    {
      if (localObject != null)
      {
        localObject = ((bsb)localObject).vbo;
        throw new NullPointerException();
      }
      GMTrace.o(9177137152000L, 68375);
      return false;
    }
    if (localObject != null) {
      throw new NullPointerException();
    }
    GMTrace.o(9177137152000L, 68375);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */