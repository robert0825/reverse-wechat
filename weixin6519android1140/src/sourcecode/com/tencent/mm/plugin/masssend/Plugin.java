package com.tencent.mm.plugin.masssend;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.masssend.a.h;
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
    GMTrace.i(11251740573696L, 83832);
    this.joM = new b()
    {
      public final com.tencent.mm.pluginsdk.d.a N(Context paramAnonymousContext, String paramAnonymousString)
      {
        GMTrace.i(11211206819840L, 83530);
        paramAnonymousContext = new com.tencent.mm.plugin.masssend.ui.a(paramAnonymousContext);
        GMTrace.o(11211206819840L, 83530);
        return paramAnonymousContext;
      }
    };
    GMTrace.o(11251740573696L, 83832);
  }
  
  public o createApplication()
  {
    GMTrace.i(11251874791424L, 83833);
    a locala = new a();
    GMTrace.o(11251874791424L, 83833);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(11252143226880L, 83835);
    h localh = new h();
    GMTrace.o(11252143226880L, 83835);
    return localh;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(11252009009152L, 83834);
    b localb = this.joM;
    GMTrace.o(11252009009152L, 83834);
    return localb;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\masssend\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */