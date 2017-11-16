package com.tencent.mm.ui.chatting;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.pluginsdk.i.n;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;

final class ct
  extends ah
{
  public ct()
  {
    super(38);
    GMTrace.i(2271635046400L, 16925);
    GMTrace.o(2271635046400L, 16925);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2271769264128L, 16926);
    View localView;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localView = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localView = paramLayoutInflater.inflate(R.i.cth, null);
      localView.setTag(new er(this.jHw).dx(localView));
    }
    GMTrace.o(2271769264128L, 16926);
    return localView;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2272037699584L, 16928);
    parama.jRw.setVisibility(0);
    parama.jRw.setText(n.n(parama1.vKB.vKW, paramau.field_createTime));
    GMTrace.o(2272037699584L, 16928);
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2272171917312L, 16929);
    GMTrace.o(2272171917312L, 16929);
    return false;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2272306135040L, 16930);
    GMTrace.o(2272306135040L, 16930);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2272440352768L, 16931);
    GMTrace.o(2272440352768L, 16931);
    return false;
  }
  
  protected final boolean ccr()
  {
    GMTrace.i(2271903481856L, 16927);
    GMTrace.o(2271903481856L, 16927);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */