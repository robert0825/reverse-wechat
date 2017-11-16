package com.tencent.mm.platformtools;

import android.os.Build.VERSION;
import android.view.View;
import com.tencent.gmtrace.GMTrace;

public final class e
{
  public static void bC(View paramView)
  {
    GMTrace.i(468554088448L, 3491);
    if (paramView == null)
    {
      GMTrace.o(468554088448L, 3491);
      return;
    }
    if (Build.VERSION.SDK_INT >= 11)
    {
      new h();
      if (Build.VERSION.SDK_INT >= 11) {
        paramView.setLayerType(1, null);
      }
    }
    GMTrace.o(468554088448L, 3491);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\platformtools\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */