package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.af.f;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.dh;
import com.tencent.mm.g.a.dh.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;

final class bu
  extends ah.b
{
  private En_5b8fbb1e.a wvE;
  
  public bu()
  {
    super(16);
    GMTrace.i(2528393560064L, 18838);
    GMTrace.o(2528393560064L, 18838);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2528527777792L, 18839);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.cst);
      ((View)localObject).setTag(new du(this.jHw).r((View)localObject, true));
    }
    GMTrace.o(2528527777792L, 18839);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2528661995520L, 18840);
    this.wvE = parama1;
    du.a((du)parama, paramau, true, paramInt, parama1);
    GMTrace.o(2528661995520L, 18840);
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2528796213248L, 18841);
    if (paramau.field_type == 48)
    {
      int i = ((dr)paramView.getTag()).position;
      paramContextMenu.add(i, 126, 0, paramView.getContext().getString(R.l.dSi));
      if ((f.Fr()) && (!this.wvE.ceh())) {
        paramContextMenu.add(i, 114, 0, paramView.getContext().getString(R.l.dfZ));
      }
      if (d.LL("favorite")) {
        paramContextMenu.add(i, 116, 0, paramView.getContext().getString(R.l.dNH));
      }
      dh localdh = new dh();
      localdh.eEV.eDr = paramau.field_msgId;
      a.vgX.m(localdh);
      if ((localdh.eEW.eEu) || (g.N(this.wvE.vKB.vKW, paramau.field_type))) {
        paramContextMenu.add(i, 128, 0, paramView.getContext().getString(R.l.dgi));
      }
      if (!this.wvE.ceh()) {
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(R.l.dgd));
      }
    }
    GMTrace.o(2528796213248L, 18841);
    return true;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2528930430976L, 18842);
    GMTrace.o(2528930430976L, 18842);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2529064648704L, 18843);
    GMTrace.o(2529064648704L, 18843);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\bu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */