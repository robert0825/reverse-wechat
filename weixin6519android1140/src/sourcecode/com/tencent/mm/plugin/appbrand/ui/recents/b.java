package com.tencent.mm.plugin.appbrand.ui.recents;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;

final class b
{
  View UU;
  ThreeDotsLoadingView iEW;
  View iEX;
  View iEY;
  
  b(Context paramContext, ViewGroup paramViewGroup)
  {
    GMTrace.i(16367046623232L, 121944);
    this.UU = LayoutInflater.from(paramContext).inflate(o.g.hDd, paramViewGroup, false);
    this.iEW = ((ThreeDotsLoadingView)this.UU.findViewById(o.f.bKL));
    this.iEX = this.UU.findViewById(o.f.hBP);
    this.iEY = this.UU.findViewById(o.f.hBO);
    GMTrace.o(16367046623232L, 121944);
  }
  
  final void setLoading(boolean paramBoolean)
  {
    GMTrace.i(16366912405504L, 121943);
    if (paramBoolean)
    {
      if (this.iEW != null)
      {
        this.iEW.setVisibility(0);
        this.iEW.cju();
      }
      if (this.iEY != null)
      {
        this.iEY.setVisibility(8);
        GMTrace.o(16366912405504L, 121943);
      }
    }
    else
    {
      if (this.iEW != null)
      {
        this.iEW.ZI();
        this.iEW.setVisibility(8);
      }
      if (this.iEY != null) {
        this.iEY.setVisibility(0);
      }
    }
    GMTrace.o(16366912405504L, 121943);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\recents\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */