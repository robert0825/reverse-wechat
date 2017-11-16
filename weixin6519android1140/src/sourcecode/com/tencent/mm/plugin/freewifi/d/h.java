package com.tencent.mm.plugin.freewifi.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.protocal.c.aci;
import com.tencent.mm.protocal.c.acj;
import com.tencent.mm.protocal.c.ur;

public final class h
  extends c
{
  public h(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(7256347246592L, 54064);
    aBl();
    aci localaci = (aci)this.fUa.gtC.gtK;
    localaci.appId = paramString1;
    localaci.luj = paramInt;
    localaci.eEU = paramString2;
    GMTrace.o(7256347246592L, 54064);
  }
  
  protected final void aBl()
  {
    GMTrace.i(7256078811136L, 54062);
    b.a locala = new b.a();
    locala.gtF = new aci();
    locala.gtG = new acj();
    locala.uri = "/cgi-bin/mmo2o-bin/getpcfrontpage";
    locala.gtE = 1760;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    GMTrace.o(7256078811136L, 54062);
  }
  
  public final ur aBp()
  {
    GMTrace.i(7256481464320L, 54065);
    Object localObject = (acj)this.fUa.gtD.gtK;
    if (localObject != null)
    {
      localObject = ((acj)localObject).tNl;
      GMTrace.o(7256481464320L, 54065);
      return (ur)localObject;
    }
    GMTrace.o(7256481464320L, 54065);
    return null;
  }
  
  public final int getType()
  {
    GMTrace.i(7256213028864L, 54063);
    GMTrace.o(7256213028864L, 54063);
    return 1760;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\d\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */