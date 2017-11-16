package com.tencent.mm.plugin.voiceprint;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.voiceprint.a.a;
import com.tencent.mm.plugin.voiceprint.model.k;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(12537680625664L, 93413);
    GMTrace.o(12537680625664L, 93413);
  }
  
  public o createApplication()
  {
    GMTrace.i(12537814843392L, 93414);
    a locala = new a();
    GMTrace.o(12537814843392L, 93414);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(12538083278848L, 93416);
    k localk = new k();
    GMTrace.o(12538083278848L, 93416);
    return localk;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(12537949061120L, 93415);
    GMTrace.o(12537949061120L, 93415);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */