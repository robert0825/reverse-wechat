package com.tencent.mm.plugin.biz;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.af.l;
import com.tencent.mm.af.x;
import com.tencent.mm.api.f;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.plugin.biz.a.b;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.y.j;
import com.tencent.mm.y.p;
import java.util.HashMap;

public class PluginBiz
  extends com.tencent.mm.kernel.b.d
  implements com.tencent.mm.kernel.api.bucket.a, b
{
  public PluginBiz()
  {
    GMTrace.i(14588661727232L, 108694);
    GMTrace.o(14588661727232L, 108694);
  }
  
  public HashMap<Integer, g.d> collectDatabaseFactory()
  {
    GMTrace.i(16386239758336L, 122087);
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf("BIZ_MESSAGE_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(16386105540608L, 122086);
        String[] arrayOfString = com.tencent.mm.storage.o.fTX;
        GMTrace.o(16386105540608L, 122086);
        return arrayOfString;
      }
    });
    GMTrace.o(16386239758336L, 122087);
    return localHashMap;
  }
  
  public void configure(e parame)
  {
    GMTrace.i(14589064380416L, 108697);
    if (parame.eR(""))
    {
      com.tencent.mm.kernel.h.a(com.tencent.mm.af.o.class, new com.tencent.mm.kernel.c.d(new l()));
      com.tencent.mm.kernel.h.a(com.tencent.mm.plugin.biz.a.a.class, new a());
    }
    com.tencent.mm.pluginsdk.ui.applet.n.a.txR = new com.tencent.mm.pluginsdk.ui.applet.d();
    GMTrace.o(14589064380416L, 108697);
  }
  
  public void dependency()
  {
    GMTrace.i(14588930162688L, 108696);
    dependsOn(n.class);
    GMTrace.o(14588930162688L, 108696);
  }
  
  public void execute(e parame)
  {
    GMTrace.i(14589198598144L, 108698);
    if (parame.eR(""))
    {
      pin(new p(x.class));
      com.tencent.mm.kernel.h.a(f.class, new com.tencent.mm.y.g());
      com.tencent.mm.kernel.h.a(com.tencent.mm.api.g.class, new com.tencent.mm.y.h());
      com.tencent.mm.kernel.h.a(com.tencent.mm.api.h.class, new j());
    }
    GMTrace.o(14589198598144L, 108698);
  }
  
  public void installed()
  {
    GMTrace.i(14588795944960L, 108695);
    alias(b.class);
    GMTrace.o(14588795944960L, 108695);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\biz\PluginBiz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */