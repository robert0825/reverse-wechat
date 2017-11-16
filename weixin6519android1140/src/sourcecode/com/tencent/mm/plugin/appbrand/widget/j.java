package com.tencent.mm.plugin.appbrand.widget;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.ui.g;

public final class j
{
  public static void d(View paramView, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(19884222185472L, 148149);
    if (paramView == null)
    {
      GMTrace.o(19884222185472L, 148149);
      return;
    }
    if (!q.iKf)
    {
      GMTrace.o(19884222185472L, 148149);
      return;
    }
    for (Object localObject = paramView;; localObject = (View)localObject)
    {
      if ((localObject instanceof k))
      {
        ((k)localObject).u(paramInt, paramBoolean);
        GMTrace.o(19884222185472L, 148149);
        return;
      }
      localObject = ((View)localObject).getParent();
      if ((localObject == null) || (!(localObject instanceof ViewGroup)))
      {
        if ((paramView.getContext() instanceof Activity))
        {
          ((Activity)paramView.getContext()).getWindow().setStatusBarColor(paramInt);
          g.a(((Activity)paramView.getContext()).getWindow(), paramBoolean);
        }
        GMTrace.o(19884222185472L, 148149);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */