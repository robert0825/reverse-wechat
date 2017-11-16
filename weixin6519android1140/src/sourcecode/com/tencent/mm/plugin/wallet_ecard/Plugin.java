package com.tencent.mm.plugin.wallet_ecard;

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
    GMTrace.i(19578742636544L, 145873);
    GMTrace.o(19578742636544L, 145873);
  }
  
  public o createApplication()
  {
    GMTrace.i(19578876854272L, 145874);
    GMTrace.o(19578876854272L, 145874);
    return null;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(19579145289728L, 145876);
    a locala = new a();
    GMTrace.o(19579145289728L, 145876);
    return locala;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(19579011072000L, 145875);
    GMTrace.o(19579011072000L, 145875);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\wallet_ecard\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */