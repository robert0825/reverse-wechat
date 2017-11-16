package com.tencent.mm.plugin.wenote.ui.nativenote.a;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.k;
import com.tencent.gmtrace.GMTrace;

public abstract class b
  extends RecyclerView.k
{
  private int sjk;
  
  public b()
  {
    GMTrace.i(17162420879360L, 127870);
    GMTrace.o(17162420879360L, 127870);
  }
  
  public abstract void bID();
  
  public abstract void bIE();
  
  public final void c(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    GMTrace.i(17162823532544L, 127873);
    if (Math.abs(paramInt2) > this.sjk) {
      paramInt1 = 1;
    }
    while ((paramInt1 != 0) && (paramRecyclerView.canScrollVertically(-1)) && (paramRecyclerView.canScrollVertically(1))) {
      if (paramInt2 < 0)
      {
        bID();
        GMTrace.o(17162823532544L, 127873);
        return;
        paramInt1 = 0;
      }
      else if (paramInt2 > 0)
      {
        bIE();
      }
    }
    GMTrace.o(17162823532544L, 127873);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\ui\nativenote\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */