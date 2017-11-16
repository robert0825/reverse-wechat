package com.tencent.mm.plugin.photoedit;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(9966740045824L, 74258);
    GMTrace.o(9966740045824L, 74258);
  }
  
  public o createApplication()
  {
    GMTrace.i(9966874263552L, 74259);
    o local1 = new o()
    {
      public final void a(l paramAnonymousl)
      {
        GMTrace.i(9916676833280L, 73885);
        GMTrace.o(9916676833280L, 73885);
      }
      
      public final void a(m paramAnonymousm)
      {
        GMTrace.i(9916542615552L, 73884);
        GMTrace.o(9916542615552L, 73884);
      }
    };
    GMTrace.o(9966874263552L, 74259);
    return local1;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(9967142699008L, 74261);
    a locala = new a();
    GMTrace.o(9967142699008L, 74261);
    return locala;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(9967008481280L, 74260);
    GMTrace.o(9967008481280L, 74260);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\photoedit\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */