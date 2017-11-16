package com.tencent.mm.plugin.welab;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.kernel.e.f;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.protocal.i.f;
import com.tencent.mm.protocal.i.g;
import com.tencent.mm.protocal.y.b;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.bt;
import java.util.HashMap;

public class PluginWelab
  extends com.tencent.mm.kernel.b.d
  implements com.tencent.mm.kernel.api.bucket.a, com.tencent.mm.kernel.api.bucket.c, com.tencent.mm.kernel.api.bucket.d, com.tencent.mm.plugin.welab.a.a
{
  private c sai;
  public boolean saj;
  
  public PluginWelab()
  {
    GMTrace.i(15672469880832L, 116769);
    this.sai = new c();
    GMTrace.o(15672469880832L, 116769);
  }
  
  public HashMap<Integer, g.d> collectDatabaseFactory()
  {
    GMTrace.i(15674214711296L, 116782);
    w.v("PluginWelab", "collectDatabaseFactory");
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf("LabAppInfo".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(16003585015808L, 119236);
        String str = i.a(com.tencent.mm.plugin.welab.c.a.a.fTp, "LabAppInfo");
        GMTrace.o(16003585015808L, 119236);
        return new String[] { str };
      }
    });
    GMTrace.o(15674214711296L, 116782);
    return localHashMap;
  }
  
  public void configure(e parame)
  {
    GMTrace.i(15672872534016L, 116772);
    if (!parame.eR(""))
    {
      GMTrace.o(15672872534016L, 116772);
      return;
    }
    w.v("PluginWelab", "configure");
    h.a(com.tencent.mm.plugin.welab.a.a.d.class, new com.tencent.mm.kernel.c.d(new d()));
    ((com.tencent.mm.plugin.auth.a.b)h.j(com.tencent.mm.plugin.auth.a.b.class)).addHandleAuthResponse(new com.tencent.mm.plugin.auth.a.a()
    {
      public final void a(i.f paramAnonymousf, i.g paramAnonymousg, boolean paramAnonymousBoolean)
      {
        GMTrace.i(16003853451264L, 119238);
        b.bGu();
        boolean bool = PluginWelab.this.saj;
        if (!paramAnonymousBoolean) {}
        for (paramAnonymousBoolean = true;; paramAnonymousBoolean = false)
        {
          b.E(bool, paramAnonymousBoolean);
          GMTrace.o(16003853451264L, 119238);
          return;
        }
      }
      
      public final void a(y.b paramAnonymousb, String paramAnonymousString1, int paramAnonymousInt1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt2)
      {
        GMTrace.i(16003987668992L, 119239);
        GMTrace.o(16003987668992L, 119239);
      }
    });
    GMTrace.o(15672872534016L, 116772);
  }
  
  public void dependency()
  {
    GMTrace.i(15672738316288L, 116771);
    dependsOn(n.class);
    GMTrace.o(15672738316288L, 116771);
  }
  
  public void execute(e parame)
  {
    GMTrace.i(15673006751744L, 116773);
    w.v("PluginWelab", "execute");
    GMTrace.o(15673006751744L, 116773);
  }
  
  public void installed()
  {
    GMTrace.i(15672604098560L, 116770);
    alias(com.tencent.mm.plugin.welab.a.a.class);
    GMTrace.o(15672604098560L, 116770);
  }
  
  public void onAccountInitialized(e.f paramf)
  {
    GMTrace.i(15673946275840L, 116780);
    w.v("PluginWelab", "onAccountInitialized");
    h.a(com.tencent.mm.plugin.welab.a.a.a.class, new com.tencent.mm.plugin.welab.a.b());
    h.a(com.tencent.mm.plugin.welab.a.a.c.class, new com.tencent.mm.plugin.welab.a.c());
    this.saj = paramf.fZo;
    ((n)h.j(n.class)).getSysCmdMsgExtension().a("newabtestlabs", this.sai, true);
    GMTrace.o(15673946275840L, 116780);
  }
  
  public void onAccountRelease()
  {
    GMTrace.i(15674080493568L, 116781);
    w.v("PluginWelab", "onAccountRelease");
    ((n)h.j(n.class)).getSysCmdMsgExtension().b("newabtestlabs", this.sai, true);
    GMTrace.o(15674080493568L, 116781);
  }
  
  public void onDataBaseClosed(g paramg1, g paramg2)
  {
    GMTrace.i(15673812058112L, 116779);
    GMTrace.o(15673812058112L, 116779);
  }
  
  public void onDataBaseOpened(g paramg1, g paramg2)
  {
    GMTrace.i(15673409404928L, 116776);
    w.v("PluginWelab", "onDataBaseOpened");
    b.bGu().saK = new com.tencent.mm.plugin.welab.c.a(paramg1);
    GMTrace.o(15673409404928L, 116776);
  }
  
  public String toString()
  {
    GMTrace.i(15673140969472L, 116774);
    GMTrace.o(15673140969472L, 116774);
    return "plugin-welab";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\welab\PluginWelab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */