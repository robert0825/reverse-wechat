package com.tencent.mm.plugin.dbbackup;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(5141210071040L, 38305);
    GMTrace.o(5141210071040L, 38305);
  }
  
  public o createApplication()
  {
    GMTrace.i(5141344288768L, 38306);
    a locala = new a();
    GMTrace.o(5141344288768L, 38306);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(5141612724224L, 38308);
    d locald = new d();
    GMTrace.o(5141612724224L, 38308);
    return locald;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(5141478506496L, 38307);
    GMTrace.o(5141478506496L, 38307);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\dbbackup\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */