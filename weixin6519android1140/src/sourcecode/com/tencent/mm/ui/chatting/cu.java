package com.tencent.mm.ui.chatting;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelappbrand.d;
import com.tencent.mm.modelappbrand.e;
import com.tencent.mm.plugin.appbrand.n.g;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u;
import java.lang.ref.WeakReference;

final class cu
  implements En_5b8fbb1e.b
{
  private WeakReference<En_5b8fbb1e.a> wyO;
  
  cu()
  {
    GMTrace.i(17592186044416L, 131072);
    GMTrace.o(17592186044416L, 131072);
  }
  
  final void b(En_5b8fbb1e.a parama)
  {
    GMTrace.i(17592320262144L, 131073);
    this.wyO = new WeakReference(parama);
    parama.a(this);
    GMTrace.o(17592320262144L, 131073);
  }
  
  public final void cct()
  {
    GMTrace.i(17592454479872L, 131074);
    if (this.wyO == null)
    {
      GMTrace.o(17592454479872L, 131074);
      return;
    }
    En_5b8fbb1e.a locala = (En_5b8fbb1e.a)this.wyO.get();
    if (locala != null) {
      ((e)h.h(e.class)).CG().hq(g.aQ(locala));
    }
    GMTrace.o(17592454479872L, 131074);
  }
  
  public final void ccu()
  {
    GMTrace.i(17592588697600L, 131075);
    if (this.wyO == null)
    {
      GMTrace.o(17592588697600L, 131075);
      return;
    }
    En_5b8fbb1e.a locala = (En_5b8fbb1e.a)this.wyO.get();
    if (locala != null) {
      ((e)h.h(e.class)).CG().hr(g.aQ(locala));
    }
    GMTrace.o(17592588697600L, 131075);
  }
  
  public final void ccv()
  {
    GMTrace.i(17592722915328L, 131076);
    w.i("MicroMsg.ChattingLifecycleChangedListener", "onChattingExit, then detach DynamicPageView.");
    if (this.wyO == null)
    {
      GMTrace.o(17592722915328L, 131076);
      return;
    }
    En_5b8fbb1e.a locala = (En_5b8fbb1e.a)this.wyO.get();
    if (locala != null)
    {
      u.Av().gx(g.aQ(locala));
      locala.b(this);
      ((e)h.h(e.class)).hs(g.aQ(locala));
    }
    GMTrace.o(17592722915328L, 131076);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\cu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */