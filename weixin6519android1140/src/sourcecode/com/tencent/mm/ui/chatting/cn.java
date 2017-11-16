package com.tencent.mm.ui.chatting;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.storage.au;

final class cn
  extends ck
{
  public cn()
  {
    super(27);
    GMTrace.i(2391759912960L, 17820);
    GMTrace.o(2391759912960L, 17820);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2391894130688L, 17821);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csA);
      ((View)localObject).setTag(new eq(this.jHw).dx((View)localObject));
    }
    GMTrace.o(2391894130688L, 17821);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2392028348416L, 17822);
    eq.a((eq)parama, paramau, true, paramInt, parama1);
    GMTrace.o(2392028348416L, 17822);
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2392162566144L, 17823);
    GMTrace.o(2392162566144L, 17823);
    return false;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2392296783872L, 17824);
    GMTrace.o(2392296783872L, 17824);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2392431001600L, 17825);
    GMTrace.o(2392431001600L, 17825);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\cn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */