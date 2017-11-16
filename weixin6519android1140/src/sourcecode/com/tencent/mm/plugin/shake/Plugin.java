package com.tencent.mm.plugin.shake;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  private b oLT;
  
  public Plugin()
  {
    GMTrace.i(6618141949952L, 49309);
    this.oLT = new b()
    {
      public final com.tencent.mm.pluginsdk.d.a N(Context paramAnonymousContext, String paramAnonymousString)
      {
        GMTrace.i(6499896131584L, 48428);
        paramAnonymousContext = new com.tencent.mm.plugin.shake.ui.a(paramAnonymousContext);
        GMTrace.o(6499896131584L, 48428);
        return paramAnonymousContext;
      }
    };
    GMTrace.o(6618141949952L, 49309);
  }
  
  public o createApplication()
  {
    GMTrace.i(6618276167680L, 49310);
    a locala = new a();
    GMTrace.o(6618276167680L, 49310);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(6618544603136L, 49312);
    m localm = new m();
    GMTrace.o(6618544603136L, 49312);
    return localm;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(6618410385408L, 49311);
    b localb = this.oLT;
    GMTrace.o(6618410385408L, 49311);
    return localb;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\shake\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */