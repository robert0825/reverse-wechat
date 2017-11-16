package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.af.f;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.dh;
import com.tencent.mm.g.a.dh.b;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

final class ce
  extends ah.b
{
  private En_5b8fbb1e.a wvE;
  
  public ce(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2277674844160L, 16970);
    GMTrace.o(2277674844160L, 16970);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2277809061888L, 16971);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csx);
      ((View)localObject).setTag(new el(this.jHw).r((View)localObject, true));
    }
    GMTrace.o(2277809061888L, 16971);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2277943279616L, 16972);
    this.wvE = parama1;
    parama = (el)parama;
    el.a(parama, paramau, true, paramInt, parama1, R.g.aVi);
    paramau = paramau.fwt;
    if ((paramau == null) || (paramau.length() == 0))
    {
      parama.wsb.setVisibility(8);
      GMTrace.o(2277943279616L, 16972);
      return;
    }
    parama.wsb.setVisibility(0);
    b(parama1, parama.wsb, dr.Wm(paramau));
    GMTrace.o(2277943279616L, 16972);
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2278077497344L, 16973);
    at.AR();
    if (c.isSDCardAvailable())
    {
      int i = ((dr)paramView.getTag()).position;
      r localr = o.Nh().mh(paramau.field_imgPath);
      paramContextMenu.add(i, 129, 0, paramView.getContext().getString(R.l.dgh));
      paramContextMenu.add(i, 107, 0, paramView.getContext().getString(R.l.dSi));
      if (d.LL("favorite")) {
        paramContextMenu.add(i, 116, 0, paramView.getContext().getString(R.l.dNH));
      }
      dh localdh = new dh();
      localdh.eEV.eDr = paramau.field_msgId;
      a.vgX.m(localdh);
      if (localdh.eEW.eEu) {
        paramContextMenu.add(i, 128, 0, paramView.getContext().getString(R.l.dgi));
      }
      if ((localr != null) && ((localr.status == 199) || (localr.status == 199)) && (f.Fp()) && (!this.wvE.ceh())) {
        paramContextMenu.add(i, 114, 0, paramView.getContext().getString(R.l.dfZ));
      }
      if (!this.wvE.ceh()) {
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(R.l.dge));
      }
    }
    GMTrace.o(2278077497344L, 16973);
    return true;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2278211715072L, 16974);
    GMTrace.o(2278211715072L, 16974);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2278345932800L, 16975);
    GMTrace.o(2278345932800L, 16975);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */