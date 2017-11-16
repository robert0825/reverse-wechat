package com.tencent.mm.plugin.location_soso;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import com.tencent.tencentmap.mapsdk.map.g.b;

public class Plugin
  implements c
{
  public static final String TAG = "MicroMsg.Plugin";
  
  public Plugin()
  {
    GMTrace.i(5444273700864L, 40563);
    w.d("MicroMsg.Plugin", "initLoctionInit");
    com.tencent.tencentmap.mapsdk.map.g.ybS = new g.b()
    {
      public void collectErrorInfo(String paramAnonymousString)
      {
        GMTrace.i(5443334176768L, 40556);
        w.i("MicroMsg.Plugin", "error by map " + paramAnonymousString);
        GMTrace.o(5443334176768L, 40556);
      }
    };
    GMTrace.o(5444273700864L, 40563);
  }
  
  public o createApplication()
  {
    GMTrace.i(5444407918592L, 40564);
    GMTrace.o(5444407918592L, 40564);
    return null;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(5444676354048L, 40566);
    GMTrace.o(5444676354048L, 40566);
    return null;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(5444542136320L, 40565);
    GMTrace.o(5444542136320L, 40565);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\location_soso\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */