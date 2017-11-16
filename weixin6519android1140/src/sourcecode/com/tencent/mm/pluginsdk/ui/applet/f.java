package com.tencent.mm.pluginsdk.ui.applet;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.h;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.ui.p;

public final class f
  implements h
{
  public f()
  {
    GMTrace.i(20406329147392L, 152039);
    GMTrace.o(20406329147392L, 152039);
  }
  
  public final q a(p paramp, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, o.a parama)
  {
    GMTrace.i(20406463365120L, 152040);
    paramp = e.a(paramp, null, paramString1, paramString2, paramString3, paramString4, paramString5, parama);
    GMTrace.o(20406463365120L, 152040);
    return paramp;
  }
  
  public final void a(p paramp, String paramString1, String paramString2, String paramString3, o.a parama)
  {
    GMTrace.i(20406597582848L, 152041);
    paramp = new e.a(paramp.vKW).bA(paramString1).Pi(paramString2).e(Boolean.valueOf(false));
    paramp.twR = paramString3;
    paramp.a(parama).oaD.show();
    GMTrace.o(20406597582848L, 152041);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\applet\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */