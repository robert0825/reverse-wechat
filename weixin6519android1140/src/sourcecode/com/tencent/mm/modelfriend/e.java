package com.tencent.mm.modelfriend;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.h;
import com.tencent.mm.ac.i;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.au.a;

public final class e
  extends com.tencent.mm.y.e
{
  public e()
  {
    GMTrace.i(4456431222784L, 33203);
    GMTrace.o(4456431222784L, 33203);
  }
  
  protected final au a(bu parambu, String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(4456565440512L, 33204);
    Object localObject = com.tencent.mm.platformtools.n.a(parambu.tPY);
    if ((localObject == null) || (((String)localObject).length() <= 0))
    {
      w.e("MicroMsg.CardMsgExtension", "possible friend msg : content is null");
      GMTrace.o(4456565440512L, 33204);
      return null;
    }
    localObject = au.a.Uh((String)localObject);
    if (bg.nl(((au.a)localObject).rAP).length() > 0)
    {
      h localh = new h();
      localh.username = ((au.a)localObject).rAP;
      localh.fiZ = 3;
      localh.bi(true);
      localh.gsU = ((au.a)localObject).vBu;
      localh.gsT = ((au.a)localObject).vBv;
      localh.eQl = -1;
      w.d("MicroMsg.CardMsgExtension", "dkhurl user:[%s] big:[%s] sm:[%s]", new Object[] { ((au.a)localObject).rAP, localh.Do(), localh.Dp() });
      com.tencent.mm.ac.n.Di().a(localh);
    }
    parambu = super.a(parambu, paramString1, paramString2, paramString3);
    GMTrace.o(4456565440512L, 33204);
    return parambu;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelfriend\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */