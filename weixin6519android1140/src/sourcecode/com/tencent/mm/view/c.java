package com.tencent.mm.view;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.api.d;
import com.tencent.mm.api.m.a;

public final class c
  extends a
{
  public c(Context paramContext, m.a parama)
  {
    super(paramContext, parama);
    GMTrace.i(19637395783680L, 146310);
    GMTrace.o(19637395783680L, 146310);
  }
  
  public final d[] bNI()
  {
    GMTrace.i(19637798436864L, 146313);
    if (this.xyU == null) {
      this.xyU = new d[] { d.eqy, d.eqA, d.eqz, d.eqD };
    }
    d[] arrayOfd = this.xyU;
    GMTrace.o(19637798436864L, 146313);
    return arrayOfd;
  }
  
  protected final com.tencent.mm.view.b.a ckv()
  {
    GMTrace.i(19637530001408L, 146311);
    com.tencent.mm.view.b.c localc = new com.tencent.mm.view.b.c(getContext(), ckE());
    GMTrace.o(19637530001408L, 146311);
    return localc;
  }
  
  protected final com.tencent.mm.view.footer.a ckw()
  {
    GMTrace.i(19637664219136L, 146312);
    com.tencent.mm.view.footer.c localc = new com.tencent.mm.view.footer.c(getContext(), ckE());
    GMTrace.o(19637664219136L, 146312);
    return localc;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\view\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */