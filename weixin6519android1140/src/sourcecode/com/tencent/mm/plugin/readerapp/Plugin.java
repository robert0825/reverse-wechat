package com.tencent.mm.plugin.readerapp;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.readerapp.b.g;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;

public final class Plugin
  implements c
{
  private com.tencent.mm.pluginsdk.d.b joM;
  
  public Plugin()
  {
    GMTrace.i(11771163181056L, 87702);
    this.joM = new com.tencent.mm.pluginsdk.d.b()
    {
      public final com.tencent.mm.pluginsdk.d.a N(Context paramAnonymousContext, String paramAnonymousString)
      {
        GMTrace.i(11744185417728L, 87501);
        w.i("MicroMsg.ReaderApp.Plugin", "create contact widget type[%s]", new Object[] { paramAnonymousString });
        if ("widget_type_news".equals(paramAnonymousString))
        {
          paramAnonymousContext = new com.tencent.mm.plugin.readerapp.ui.b(paramAnonymousContext);
          GMTrace.o(11744185417728L, 87501);
          return paramAnonymousContext;
        }
        GMTrace.o(11744185417728L, 87501);
        return null;
      }
    };
    GMTrace.o(11771163181056L, 87702);
  }
  
  public final o createApplication()
  {
    GMTrace.i(11771297398784L, 87703);
    com.tencent.mm.plugin.readerapp.a.a locala = new com.tencent.mm.plugin.readerapp.a.a();
    GMTrace.o(11771297398784L, 87703);
    return locala;
  }
  
  public final aq createSubCore()
  {
    GMTrace.i(11771565834240L, 87705);
    g localg = new g();
    GMTrace.o(11771565834240L, 87705);
    return localg;
  }
  
  public final com.tencent.mm.pluginsdk.d.b getContactWidgetFactory()
  {
    GMTrace.i(11771431616512L, 87704);
    com.tencent.mm.pluginsdk.d.b localb = this.joM;
    GMTrace.o(11771431616512L, 87704);
    return localb;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\readerapp\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */