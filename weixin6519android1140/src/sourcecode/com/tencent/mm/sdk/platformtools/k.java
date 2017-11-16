package com.tencent.mm.sdk.platformtools;

import android.os.Build.VERSION;
import android.view.View;
import com.tencent.gmtrace.GMTrace;

public final class k
{
  public static void bC(View paramView)
  {
    GMTrace.i(13926699892736L, 103762);
    if (paramView == null)
    {
      GMTrace.o(13926699892736L, 103762);
      return;
    }
    w.j("MicroMsg.ForceGpuUtil", "setLayerType, view: %s", new Object[] { Integer.valueOf(paramView.hashCode()) });
    if (Build.VERSION.SDK_INT >= 11)
    {
      new m();
      if (paramView.getLayerType() != 1) {
        paramView.setLayerType(1, null);
      }
    }
    GMTrace.o(13926699892736L, 103762);
  }
  
  public static void i(View paramView, int paramInt1, int paramInt2)
  {
    GMTrace.i(13926834110464L, 103763);
    if (paramView == null)
    {
      GMTrace.o(13926834110464L, 103763);
      return;
    }
    if (Build.VERSION.SDK_INT >= 11)
    {
      new m();
      if ((paramInt1 < 2048) && (paramInt2 < 2048)) {
        break label76;
      }
    }
    label76:
    for (paramInt1 = 1;; paramInt1 = 2)
    {
      if (paramView.getLayerType() != paramInt1) {
        paramView.setLayerType(paramInt1, null);
      }
      GMTrace.o(13926834110464L, 103763);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */