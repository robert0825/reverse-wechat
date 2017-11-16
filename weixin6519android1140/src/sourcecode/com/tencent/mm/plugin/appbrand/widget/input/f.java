package com.tencent.mm.plugin.appbrand.widget.input;

import android.support.v4.e.a;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.page.t;

public final class f
{
  private static final f iLp;
  private final a<t, Integer> iLo;
  
  static
  {
    GMTrace.i(15421214294016L, 114897);
    iLp = new f();
    GMTrace.o(15421214294016L, 114897);
  }
  
  public f()
  {
    GMTrace.i(15420543205376L, 114892);
    this.iLo = new a();
    GMTrace.o(15420543205376L, 114892);
  }
  
  public static f acq()
  {
    GMTrace.i(15420677423104L, 114893);
    f localf = iLp;
    GMTrace.o(15420677423104L, 114893);
    return localf;
  }
  
  final void n(t paramt)
  {
    GMTrace.i(15420811640832L, 114894);
    if (paramt == null)
    {
      GMTrace.o(15420811640832L, 114894);
      return;
    }
    this.iLo.remove(paramt);
    paramt.getView().setFocusable(true);
    paramt.getView().setFocusableInTouchMode(true);
    GMTrace.o(15420811640832L, 114894);
  }
  
  public final void o(t paramt)
  {
    GMTrace.i(15420945858560L, 114895);
    if (paramt == null)
    {
      GMTrace.o(15420945858560L, 114895);
      return;
    }
    Integer localInteger2 = (Integer)this.iLo.get(paramt);
    Integer localInteger1 = localInteger2;
    if (localInteger2 == null) {
      localInteger1 = Integer.valueOf(0);
    }
    int i = localInteger1.intValue();
    this.iLo.put(paramt, Integer.valueOf(i + 1));
    paramt.getView().setFocusable(false);
    paramt.getView().setFocusableInTouchMode(false);
    GMTrace.o(15420945858560L, 114895);
  }
  
  public final void p(t paramt)
  {
    GMTrace.i(15421080076288L, 114896);
    if (paramt == null)
    {
      GMTrace.o(15421080076288L, 114896);
      return;
    }
    Integer localInteger = (Integer)this.iLo.get(paramt);
    if (localInteger != null)
    {
      localInteger = Integer.valueOf(localInteger.intValue() - 1);
      if (localInteger.intValue() > 0) {}
    }
    else
    {
      n(paramt);
      GMTrace.o(15421080076288L, 114896);
      return;
    }
    this.iLo.put(paramt, localInteger);
    GMTrace.o(15421080076288L, 114896);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */