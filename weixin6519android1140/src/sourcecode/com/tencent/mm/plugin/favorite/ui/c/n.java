package com.tencent.mm.plugin.favorite.ui.c;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.c.g;

public final class n
  extends a
{
  public n(g paramg)
  {
    super(paramg);
    GMTrace.i(6427284340736L, 47887);
    GMTrace.o(6427284340736L, 47887);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, j paramj)
  {
    GMTrace.i(6427418558464L, 47888);
    paramView = new View(paramViewGroup.getContext());
    GMTrace.o(6427418558464L, 47888);
    return paramView;
  }
  
  public final void cj(View paramView)
  {
    GMTrace.i(6427552776192L, 47889);
    if (paramView != null) {
      Toast.makeText(paramView.getContext(), R.l.dvc, 0).show();
    }
    GMTrace.o(6427552776192L, 47889);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\c\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */