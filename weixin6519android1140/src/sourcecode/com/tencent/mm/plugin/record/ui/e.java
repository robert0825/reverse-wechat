package com.tencent.mm.plugin.record.ui;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.record.a.g;
import com.tencent.mm.plugin.record.a.i.a;
import com.tencent.mm.plugin.record.ui.a.b;
import java.util.List;

public final class e
  extends h
  implements i.a
{
  public e(Context paramContext, h.a parama)
  {
    super(paramContext, parama);
    GMTrace.i(7555921215488L, 56296);
    GMTrace.o(7555921215488L, 56296);
  }
  
  public final void a(int paramInt, g paramg)
  {
    GMTrace.i(7556323868672L, 56299);
    baX();
    GMTrace.o(7556323868672L, 56299);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(7556055433216L, 56297);
    this.ohV = parama;
    this.ohD.clear();
    this.ohD.addAll(parama.ohD);
    notifyDataSetChanged();
    GMTrace.o(7556055433216L, 56297);
  }
  
  public final void d(b paramb)
  {
    GMTrace.i(7556189650944L, 56298);
    paramb.aGU = 0;
    paramb.eDr = ((f)this.ohV).eDr;
    paramb.eRw = ((f)this.ohV).eRw;
    GMTrace.o(7556189650944L, 56298);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\record\ui\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */