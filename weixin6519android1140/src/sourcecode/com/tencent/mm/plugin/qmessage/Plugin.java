package com.tencent.mm.plugin.qmessage;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.qmessage.a.g;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  private com.tencent.mm.pluginsdk.d.b joM;
  
  public Plugin()
  {
    GMTrace.i(8957422731264L, 66738);
    this.joM = new com.tencent.mm.pluginsdk.d.b()
    {
      public final com.tencent.mm.pluginsdk.d.a N(Context paramAnonymousContext, String paramAnonymousString)
      {
        GMTrace.i(8936753201152L, 66584);
        if ("widget_type_contact".equals(paramAnonymousString))
        {
          paramAnonymousContext = new com.tencent.mm.plugin.qmessage.ui.a(paramAnonymousContext);
          GMTrace.o(8936753201152L, 66584);
          return paramAnonymousContext;
        }
        paramAnonymousContext = new com.tencent.mm.plugin.qmessage.ui.b(paramAnonymousContext);
        GMTrace.o(8936753201152L, 66584);
        return paramAnonymousContext;
      }
    };
    GMTrace.o(8957422731264L, 66738);
  }
  
  public o createApplication()
  {
    GMTrace.i(8957556948992L, 66739);
    a locala = new a();
    GMTrace.o(8957556948992L, 66739);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(8957825384448L, 66741);
    g localg = new g();
    GMTrace.o(8957825384448L, 66741);
    return localg;
  }
  
  public com.tencent.mm.pluginsdk.d.b getContactWidgetFactory()
  {
    GMTrace.i(8957691166720L, 66740);
    com.tencent.mm.pluginsdk.d.b localb = this.joM;
    GMTrace.o(8957691166720L, 66740);
    return localb;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\qmessage\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */