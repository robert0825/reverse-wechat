package com.tencent.mm.ui.chatting;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.storage.au;

final class cm
  extends ck
{
  public cm()
  {
    super(24);
    GMTrace.i(2393773178880L, 17835);
    GMTrace.o(2393773178880L, 17835);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2393907396608L, 17836);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csz);
      ((View)localObject).setTag(new eq(this.jHw).dx((View)localObject));
    }
    GMTrace.o(2393907396608L, 17836);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2394041614336L, 17837);
    eq.a((eq)parama, paramau, true, paramInt, parama1);
    GMTrace.o(2394041614336L, 17837);
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2394175832064L, 17838);
    GMTrace.o(2394175832064L, 17838);
    return false;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2394310049792L, 17839);
    GMTrace.o(2394310049792L, 17839);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2394444267520L, 17840);
    GMTrace.o(2394444267520L, 17840);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\cm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */