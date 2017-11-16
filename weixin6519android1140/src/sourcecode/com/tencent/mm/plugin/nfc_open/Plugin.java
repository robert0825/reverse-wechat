package com.tencent.mm.plugin.nfc_open;

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
    GMTrace.i(12483322445824L, 93008);
    GMTrace.o(12483322445824L, 93008);
  }
  
  public o createApplication()
  {
    GMTrace.i(12483456663552L, 93009);
    GMTrace.o(12483456663552L, 93009);
    return null;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(12483725099008L, 93011);
    a locala = new a();
    GMTrace.o(12483725099008L, 93011);
    return locala;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(12483590881280L, 93010);
    GMTrace.o(12483590881280L, 93010);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\nfc_open\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */