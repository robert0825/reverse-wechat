package com.tencent.mm.ui.chatting;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.storage.au;

final class cs
  extends cr
{
  public cs()
  {
    super(39);
    GMTrace.i(2197949513728L, 16376);
    GMTrace.o(2197949513728L, 16376);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2198083731456L, 16377);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csz);
      ((View)localObject).setTag(new er(this.jHw).dx((View)localObject));
    }
    GMTrace.o(2198083731456L, 16377);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2198217949184L, 16378);
    er.a((er)parama, paramau, paramInt, parama1);
    GMTrace.o(2198217949184L, 16378);
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2198352166912L, 16379);
    GMTrace.o(2198352166912L, 16379);
    return false;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2198486384640L, 16380);
    GMTrace.o(2198486384640L, 16380);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2198620602368L, 16381);
    GMTrace.o(2198620602368L, 16381);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\cs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */