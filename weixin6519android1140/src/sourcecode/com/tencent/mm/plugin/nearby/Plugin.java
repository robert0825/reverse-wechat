package com.tencent.mm.plugin.nearby;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.nearby.a.f;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  private b joM;
  
  public Plugin()
  {
    GMTrace.i(6716120891392L, 50039);
    this.joM = new b()
    {
      public final com.tencent.mm.pluginsdk.d.a N(Context paramAnonymousContext, String paramAnonymousString)
      {
        GMTrace.i(6674244960256L, 49727);
        paramAnonymousContext = new com.tencent.mm.plugin.nearby.ui.a(paramAnonymousContext);
        GMTrace.o(6674244960256L, 49727);
        return paramAnonymousContext;
      }
    };
    GMTrace.o(6716120891392L, 50039);
  }
  
  public o createApplication()
  {
    GMTrace.i(6716255109120L, 50040);
    a locala = new a();
    GMTrace.o(6716255109120L, 50040);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(6716523544576L, 50042);
    f localf = new f();
    GMTrace.o(6716523544576L, 50042);
    return localf;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(6716389326848L, 50041);
    b localb = this.joM;
    GMTrace.o(6716389326848L, 50041);
    return localb;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nearby\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */