package com.tencent.mm.ui.chatting;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.storage.au;

final class cq
  extends cl
{
  public cq()
  {
    super(43);
    GMTrace.i(2166676783104L, 16143);
    GMTrace.o(2166676783104L, 16143);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2166811000832L, 16144);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.ctc);
      ((View)localObject).setTag(new eq(this.jHw).dx((View)localObject));
    }
    GMTrace.o(2166811000832L, 16144);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2166945218560L, 16145);
    eq.a((eq)parama, paramau, false, paramInt, parama1);
    GMTrace.o(2166945218560L, 16145);
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2167079436288L, 16146);
    GMTrace.o(2167079436288L, 16146);
    return false;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2167213654016L, 16147);
    GMTrace.o(2167213654016L, 16147);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2167347871744L, 16148);
    GMTrace.o(2167347871744L, 16148);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\cq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */