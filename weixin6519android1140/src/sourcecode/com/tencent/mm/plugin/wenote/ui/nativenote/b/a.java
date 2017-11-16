package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.support.v7.widget.RecyclerView.t;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wenote.model.a.b;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;

public abstract class a
  extends RecyclerView.t
{
  protected k shJ;
  
  public a(View paramView, k paramk)
  {
    super(paramView);
    GMTrace.i(17160407613440L, 127855);
    this.shJ = paramk;
    GMTrace.o(17160407613440L, 127855);
  }
  
  public abstract void a(b paramb, int paramInt1, int paramInt2);
  
  public abstract int bIG();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\ui\nativenote\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */