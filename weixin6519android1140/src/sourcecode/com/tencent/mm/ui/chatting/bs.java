package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.n;
import com.tencent.mm.g.a.dh;
import com.tencent.mm.g.a.dh.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.chatting.b.q;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

final class bs
  extends ah.b
{
  En_5b8fbb1e.a wvE;
  
  public bs()
  {
    super(1);
    GMTrace.i(2522353762304L, 18793);
    GMTrace.o(2522353762304L, 18793);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2522487980032L, 18794);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csv);
      ((View)localObject).setTag(new dq(this.jHw).r((View)localObject, true));
    }
    GMTrace.o(2522487980032L, 18794);
    return (View)localObject;
  }
  
  protected final String a(En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2522622197760L, 18795);
    parama = super.a(parama, paramau);
    GMTrace.o(2522622197760L, 18795);
    return parama;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2522756415488L, 18796);
    this.wvE = parama1;
    parama1.wCp.aS(paramau);
    dq localdq = (dq)parama;
    boolean bool = n.IZ().a(localdq.wrU, paramau.field_imgPath, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW), paramau.fww, paramau.fwx, R.g.aVi, localdq.wFt, R.g.aVj, 1, null);
    localdq.wFu.setVisibility(0);
    localdq.nWt.setVisibility(8);
    if ((!bool) && (!this.tIv)) {
      localdq.wrU.setImageBitmap(BitmapFactory.decodeResource(parama1.getResources(), R.g.aYy));
    }
    parama = null;
    if (parama1.wqK) {
      parama = paramau.field_talker;
    }
    localdq.wvA.setTag(new dr(paramau, parama1.wqK, paramInt, paramString, parama));
    localdq.wvA.setOnClickListener(parama1.wvd.wyW);
    localdq.wvA.setOnLongClickListener(parama1.wvd.wyY);
    localdq.wvA.setOnTouchListener(parama1.wvd.wza);
    if ((paramau.field_content == null) || (paramau.field_content.length() == 0))
    {
      localdq.wsb.setVisibility(8);
      GMTrace.o(2522756415488L, 18796);
      return;
    }
    localdq.wsb.setVisibility(8);
    GMTrace.o(2522756415488L, 18796);
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2523024850944L, 18798);
    at.AR();
    int k;
    Object localObject1;
    Object localObject2;
    int j;
    int i;
    if ((c.isSDCardAvailable()) && (paramView != null) && (paramau != null))
    {
      k = ((dr)paramView.getTag()).position;
      localObject1 = null;
      if (paramau.field_msgId > 0L) {
        localObject1 = n.IZ().aq(paramau.field_msgId);
      }
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (((com.tencent.mm.ao.d)localObject1).gGR > 0L) {}
      }
      else
      {
        localObject2 = localObject1;
        if (paramau.field_msgSvrId > 0L) {
          localObject2 = n.IZ().ap(paramau.field_msgSvrId);
        }
      }
      paramContextMenu.add(k, 110, 0, paramView.getContext().getString(R.l.dSi));
      if ((com.tencent.mm.af.f.Fo()) && (!this.wvE.ceh())) {
        paramContextMenu.add(k, 114, 0, paramView.getContext().getString(R.l.dfZ));
      }
      if (com.tencent.mm.bj.d.LL("favorite")) {
        paramContextMenu.add(k, 116, 0, paramView.getContext().getString(R.l.dNH));
      }
      localObject1 = new dh();
      ((dh)localObject1).eEV.eDr = paramau.field_msgId;
      com.tencent.mm.sdk.b.a.vgX.m((b)localObject1);
      if ((((dh)localObject1).eEW.eEu) || (g.N(this.wvE.vKB.vKW, paramau.field_type))) {
        paramContextMenu.add(k, 128, 0, paramView.getContext().getString(R.l.dgi));
      }
      if ((com.tencent.mm.bj.d.LL("photoedit")) && (localObject2 != null) && (((com.tencent.mm.ao.d)localObject2).status != -1))
      {
        paramau = paramContextMenu.add(k, 130, 0, paramView.getContext().getString(R.l.dfG));
        localObject1 = new int[2];
        if (paramView == null) {
          break label455;
        }
        j = paramView.getWidth();
        i = paramView.getHeight();
        paramView.getLocationInWindow((int[])localObject1);
      }
    }
    for (;;)
    {
      localObject2 = new Intent();
      ((Intent)localObject2).putExtra("img_gallery_width", j).putExtra("img_gallery_height", i).putExtra("img_gallery_left", localObject1[0]).putExtra("img_gallery_top", localObject1[1]);
      paramau.setIntent((Intent)localObject2);
      if (!this.wvE.ceh()) {
        paramContextMenu.add(k, 100, 0, paramView.getContext().getString(R.l.dgc));
      }
      GMTrace.o(2523024850944L, 18798);
      return true;
      label455:
      i = 0;
      j = 0;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2523159068672L, 18799);
    GMTrace.o(2523159068672L, 18799);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2523293286400L, 18800);
    GMTrace.o(2523293286400L, 18800);
    return false;
  }
  
  protected final boolean a(En_5b8fbb1e.a parama)
  {
    GMTrace.i(2522890633216L, 18797);
    boolean bool = parama.wqK;
    GMTrace.o(2522890633216L, 18797);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */