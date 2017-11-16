package com.tencent.mm.pluginsdk.ui.applet;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.af.a.e;
import com.tencent.mm.af.a.j;
import com.tencent.mm.af.a.k;
import com.tencent.mm.af.f;
import com.tencent.mm.af.x;
import com.tencent.mm.ao.a.a.c;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.plugin.biz.b.a;
import com.tencent.mm.sdk.platformtools.bg;

public final class d
  implements n
{
  public d()
  {
    GMTrace.i(18486478766080L, 137735);
    GMTrace.o(18486478766080L, 137735);
  }
  
  public final boolean Pf(String paramString)
  {
    GMTrace.i(18486612983808L, 137736);
    boolean bool = f.dL(paramString);
    GMTrace.o(18486612983808L, 137736);
    return bool;
  }
  
  public final Object Pg(String paramString)
  {
    GMTrace.i(18486747201536L, 137737);
    j localj2 = x.FK().bl(paramString);
    j localj1;
    if ((localj2 != null) && (!bg.nm(localj2.field_userId)))
    {
      localj1 = localj2;
      if (localj2.field_userId.equals(paramString)) {}
    }
    else
    {
      localj1 = new j();
      localj1.field_userId = paramString;
    }
    GMTrace.o(18486747201536L, 137737);
    return localj1;
  }
  
  public final c Ph(String paramString)
  {
    GMTrace.i(18486881419264L, 137738);
    c.a locala = new c.a();
    locala.gKF = e.jm(paramString);
    locala.gKC = true;
    locala.gKY = true;
    locala.gKR = b.a.aVS;
    paramString = locala.Jn();
    GMTrace.o(18486881419264L, 137738);
    return paramString;
  }
  
  public final String bx(Object paramObject)
  {
    GMTrace.i(18487015636992L, 137739);
    paramObject = ((j)paramObject).field_userName;
    GMTrace.o(18487015636992L, 137739);
    return (String)paramObject;
  }
  
  public final String by(Object paramObject)
  {
    GMTrace.i(18487149854720L, 137740);
    paramObject = ((j)paramObject).field_headImageUrl;
    GMTrace.o(18487149854720L, 137740);
    return (String)paramObject;
  }
  
  public final String bz(Object paramObject)
  {
    GMTrace.i(18487284072448L, 137741);
    paramObject = ((j)paramObject).field_userId;
    GMTrace.o(18487284072448L, 137741);
    return (String)paramObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\applet\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */