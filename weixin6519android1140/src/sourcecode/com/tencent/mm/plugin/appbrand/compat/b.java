package com.tencent.mm.plugin.appbrand.compat;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.g.a;
import com.tencent.mm.ad.g.b;
import com.tencent.mm.g.a.ez;
import com.tencent.mm.plugin.appbrand.compat.a.e;
import com.tencent.mm.sdk.b.a;

final class b
  implements e
{
  b()
  {
    GMTrace.i(19481166348288L, 145146);
    GMTrace.o(19481166348288L, 145146);
  }
  
  public final void a(String paramString, g.a parama, g.b paramb)
  {
    GMTrace.i(19481300566016L, 145147);
    ez localez = new ez();
    localez.eGZ.op = 1;
    localez.eGZ.euR = paramString;
    localez.eGZ.eHb = true;
    localez.eGZ.ewD = true;
    localez.eGZ.eHc = parama;
    localez.eGZ.eHd = paramb;
    a.vgX.m(localez);
    GMTrace.o(19481300566016L, 145147);
  }
  
  public final void pause()
  {
    GMTrace.i(19481434783744L, 145148);
    ez localez = new ez();
    localez.eGZ.op = 4;
    a.vgX.m(localez);
    GMTrace.o(19481434783744L, 145148);
  }
  
  public final void stop()
  {
    GMTrace.i(19481569001472L, 145149);
    ez localez = new ez();
    localez.eGZ.op = 2;
    a.vgX.m(localez);
    GMTrace.o(19481569001472L, 145149);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\appbrand\compat\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */