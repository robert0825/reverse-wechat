package com.tencent.mm.pluginsdk.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.x.a.a.a;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.d;
import com.tencent.mm.pluginsdk.model.app.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.y.at;
import java.util.Map;

public final class i
  implements t
{
  public static boolean tmP;
  private static i tmQ;
  public a tmR;
  
  static
  {
    GMTrace.i(757524856832L, 5644);
    tmP = false;
    GMTrace.o(757524856832L, 5644);
  }
  
  private i()
  {
    GMTrace.i(756853768192L, 5639);
    GMTrace.o(756853768192L, 5639);
  }
  
  public static b Ok(String paramString)
  {
    GMTrace.i(757390639104L, 5643);
    if (paramString == null)
    {
      GMTrace.o(757390639104L, 5643);
      return null;
    }
    paramString = bh.q(paramString, "PersonalAppSetting");
    if (paramString == null)
    {
      GMTrace.o(757390639104L, 5643);
      return null;
    }
    paramString = (String)paramString.get(".PersonalAppSetting.OpenID");
    if (bg.nm(paramString))
    {
      GMTrace.o(757390639104L, 5643);
      return null;
    }
    b localb = new b();
    localb.tmS = paramString;
    GMTrace.o(757390639104L, 5643);
    return localb;
  }
  
  public static i bJf()
  {
    GMTrace.i(756987985920L, 5640);
    if (tmQ == null) {
      tmQ = new i();
    }
    i locali = tmQ;
    GMTrace.o(756987985920L, 5640);
    return locali;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.pluginsdk.model.app.w paramw)
  {
    GMTrace.i(757256421376L, 5642);
    if (!at.AU())
    {
      GMTrace.o(757256421376L, 5642);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GetUserInfoInAppLogic", "onSceneEnd errType=%s errCode=%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramw == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GetUserInfoInAppLogic", "scene == null");
      GMTrace.o(757256421376L, 5642);
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      switch (paramw.getType())
      {
      }
    }
    for (;;)
    {
      GMTrace.o(757256421376L, 5642);
      return;
      if ((ab.getContext() == null) || (a.a.aWD() == null))
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GetUserInfoInAppLogic", "wrong environment");
        GMTrace.o(757256421376L, 5642);
        return;
      }
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GetUserInfoInAppLogic", "NetSceneGetUserInfoInApp come back", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      paramString = (l)paramw;
      if (this.tmR != null) {
        this.tmR.a(paramString);
      }
    }
  }
  
  public final void bJg()
  {
    GMTrace.i(757122203648L, 5641);
    if (!at.AU())
    {
      GMTrace.o(757122203648L, 5641);
      return;
    }
    an.aGk().a(14, this);
    tmP = true;
    GMTrace.o(757122203648L, 5641);
  }
  
  public static abstract interface a
  {
    public abstract void a(l paraml);
  }
  
  public static final class b
  {
    public String tmS;
    
    public b()
    {
      GMTrace.i(768128057344L, 5723);
      GMTrace.o(768128057344L, 5723);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\model\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */