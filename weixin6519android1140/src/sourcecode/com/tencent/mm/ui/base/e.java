package com.tencent.mm.ui.base;

import android.content.Context;
import android.support.v4.view.u;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.Queue;

public abstract class e
  extends u
{
  public Context context;
  private Queue<View> vZg;
  private int vZh;
  
  public e(Context paramContext)
  {
    GMTrace.i(3283368280064L, 24463);
    this.vZh = 0;
    this.context = paramContext;
    this.vZg = new LinkedList();
    GMTrace.o(3283368280064L, 24463);
  }
  
  public abstract View a(View paramView, ViewGroup paramViewGroup, int paramInt);
  
  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    GMTrace.i(3283770933248L, 24466);
    paramObject = (View)paramObject;
    paramViewGroup.removeView((View)paramObject);
    this.vZg.add(paramObject);
    rG(paramInt);
    w.d("MicroMsg.CustomPagerAdapter", "recycle queue size %d", new Object[] { Integer.valueOf(this.vZg.size()) });
    GMTrace.o(3283770933248L, 24466);
  }
  
  public final boolean a(View paramView, Object paramObject)
  {
    GMTrace.i(3283502497792L, 24464);
    boolean bool = paramView.equals(paramObject);
    GMTrace.o(3283502497792L, 24464);
    return bool;
  }
  
  public abstract int aTs();
  
  public final Object b(ViewGroup paramViewGroup, int paramInt)
  {
    GMTrace.i(3283636715520L, 24465);
    long l = System.currentTimeMillis();
    View localView = a((View)this.vZg.poll(), paramViewGroup, paramInt);
    if (localView.getLayoutParams() == null) {
      localView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }
    paramViewGroup.addView(localView);
    w.v("MicroMsg.CustomPagerAdapter", "instantiateItem usetime: %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    GMTrace.o(3283636715520L, 24465);
    return localView;
  }
  
  public final int j(Object paramObject)
  {
    GMTrace.i(3284442021888L, 24471);
    if (this.vZh > 0)
    {
      this.vZh -= 1;
      GMTrace.o(3284442021888L, 24471);
      return -2;
    }
    int i = super.j(paramObject);
    GMTrace.o(3284442021888L, 24471);
    return i;
  }
  
  public final void notifyDataSetChanged()
  {
    GMTrace.i(3284307804160L, 24470);
    this.vZh = aTs();
    super.notifyDataSetChanged();
    GMTrace.o(3284307804160L, 24470);
  }
  
  public abstract void rG(int paramInt);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\base\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */