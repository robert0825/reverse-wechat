package com.tencent.mm.ui.chatting;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.storage.au;

final class co
  extends cl
{
  public co()
  {
    super(28);
    GMTrace.i(2376995962880L, 17710);
    GMTrace.o(2376995962880L, 17710);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2377130180608L, 17711);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.ctd);
      ((View)localObject).setTag(new eq(this.jHw).dx((View)localObject));
    }
    GMTrace.o(2377130180608L, 17711);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2377264398336L, 17712);
    eq.a((eq)parama, paramau, false, paramInt, parama1);
    GMTrace.o(2377264398336L, 17712);
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2377398616064L, 17713);
    GMTrace.o(2377398616064L, 17713);
    return false;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2377532833792L, 17714);
    GMTrace.o(2377532833792L, 17714);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2377667051520L, 17715);
    GMTrace.o(2377667051520L, 17715);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\co.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */