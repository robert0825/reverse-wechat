package com.tencent.mm.view;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.api.d;
import com.tencent.mm.api.m.a;

public final class b
  extends a
{
  public b(Context paramContext, m.a parama)
  {
    super(paramContext, parama);
    GMTrace.i(19628537413632L, 146244);
    GMTrace.o(19628537413632L, 146244);
  }
  
  public final d[] bNI()
  {
    GMTrace.i(19628940066816L, 146247);
    if (this.xyU == null) {
      this.xyU = new d[] { d.eqy, d.eqA, d.eqz, d.eqB, d.eqC };
    }
    d[] arrayOfd = this.xyU;
    GMTrace.o(19628940066816L, 146247);
    return arrayOfd;
  }
  
  protected final com.tencent.mm.view.b.a ckv()
  {
    GMTrace.i(19628671631360L, 146245);
    com.tencent.mm.view.b.b localb = new com.tencent.mm.view.b.b(getContext(), ckE());
    GMTrace.o(19628671631360L, 146245);
    return localb;
  }
  
  protected final com.tencent.mm.view.footer.a ckw()
  {
    GMTrace.i(19628805849088L, 146246);
    com.tencent.mm.view.footer.b localb = new com.tencent.mm.view.footer.b(getContext(), ckE());
    GMTrace.o(19628805849088L, 146246);
    return localb;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\view\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */