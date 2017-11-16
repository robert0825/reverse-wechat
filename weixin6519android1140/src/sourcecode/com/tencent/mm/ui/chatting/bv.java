package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
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

final class bv
  extends ah.c
{
  private En_5b8fbb1e.a wvE;
  
  public bv()
  {
    super(17);
    GMTrace.i(2252710346752L, 16784);
    GMTrace.o(2252710346752L, 16784);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2252844564480L, 16785);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csX);
      ((View)localObject).setTag(new du(this.jHw).r((View)localObject, false));
    }
    GMTrace.o(2252844564480L, 16785);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2252978782208L, 16786);
    this.wvE = parama1;
    du.a((du)parama, paramau, false, paramInt, parama1);
    parama = (du)parama;
    if (ccs())
    {
      if ((paramau.field_status != 2) || (!a(parama1.wvd, paramau.field_msgId))) {
        break label111;
      }
      if (parama.wrV != null) {
        parama.wrV.setVisibility(0);
      }
    }
    for (;;)
    {
      a(paramInt, parama, paramau, parama1.wvd.gtf, parama1.wqK, parama1.wvd.wyW);
      GMTrace.o(2252978782208L, 16786);
      return;
      label111:
      if (parama.wrV != null) {
        parama.wrV.setVisibility(8);
      }
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2253112999936L, 16787);
    if (paramau.field_type == 48)
    {
      int i = ((dr)paramView.getTag()).position;
      if (paramau.field_status == 5) {
        paramContextMenu.add(i, 103, 0, paramView.getContext().getString(R.l.dhc));
      }
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
      if ((!paramau.bTs()) && (paramau.bTE()) && ((paramau.field_status == 2) || (paramau.fwz == 1)) && (av(paramau)) && (VU(paramau.field_talker))) {
        paramContextMenu.add(i, 123, 0, paramView.getContext().getString(R.l.dgl));
      }
      if (!this.wvE.ceh()) {
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(R.l.dgd));
      }
    }
    GMTrace.o(2253112999936L, 16787);
    return true;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2253247217664L, 16788);
    GMTrace.o(2253247217664L, 16788);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2253381435392L, 16789);
    GMTrace.o(2253381435392L, 16789);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */