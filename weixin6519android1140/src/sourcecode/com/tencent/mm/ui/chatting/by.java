package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ag.a;
import com.tencent.mm.ag.a.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.storage.au;

final class by
  extends cc
{
  private En_5b8fbb1e.a wvE;
  
  public by()
  {
    super(36);
    GMTrace.i(2282104029184L, 17003);
    GMTrace.o(2282104029184L, 17003);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2282238246912L, 17004);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csI);
      ((View)localObject).setTag(new eb(this.jHw).dx((View)localObject));
    }
    GMTrace.o(2282238246912L, 17004);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2282372464640L, 17005);
    this.wvE = parama1;
    parama = (eb)parama;
    paramString = a.a.jq(paramau.field_content);
    String str = paramString.eMI;
    a(parama, parama1, paramau, str);
    a(parama, parama1, str, paramau);
    h.a(parama.wxX.getContext(), a.a(paramString), (int)parama.wxX.getTextSize(), null, "");
    parama.wxX.setTag(new dr(paramau, parama1.wqK, paramInt, null, 0, (byte)0));
    parama.wxX.setOnClickListener(parama1.wvd.wyW);
    parama.wxX.setOnLongClickListener(parama1.wvd.wyY);
    GMTrace.o(2282372464640L, 17005);
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2282640900096L, 17007);
    if (paramau.bTM())
    {
      int i = ((dr)paramView.getTag()).position;
      if (paramau.field_status == 5) {
        paramContextMenu.add(i, 103, 0, paramView.getContext().getString(R.l.dhc));
      }
      if (!this.wvE.ceh()) {
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(R.l.dgd));
      }
    }
    GMTrace.o(2282640900096L, 17007);
    return true;
  }
  
  protected final boolean ccr()
  {
    GMTrace.i(2282506682368L, 17006);
    GMTrace.o(2282506682368L, 17006);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\by.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */