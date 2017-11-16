package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.af.f;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.dh;
import com.tencent.mm.g.a.dh.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

final class cf
  extends ah.c
{
  private En_5b8fbb1e.a wvE;
  
  public cf(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2288949133312L, 17054);
    GMTrace.o(2288949133312L, 17054);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2289083351040L, 17055);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.cta);
      ((View)localObject).setTag(new el(this.jHw).r((View)localObject, false));
    }
    GMTrace.o(2289083351040L, 17055);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2289217568768L, 17056);
    this.wvE = parama1;
    parama = (el)parama;
    el.a(parama, paramau, false, paramInt, parama1, R.g.aVk);
    if (ccs())
    {
      paramString = t.mw(paramau.field_imgPath);
      if ((paramString != null) && (paramString.status == 199) && (a(parama1.wvd, paramau.field_msgId)))
      {
        if (parama.wrV != null)
        {
          parama.wrV.setVisibility(0);
          GMTrace.o(2289217568768L, 17056);
        }
      }
      else if (parama.wrV != null) {
        parama.wrV.setVisibility(8);
      }
    }
    GMTrace.o(2289217568768L, 17056);
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2289351786496L, 17057);
    at.AR();
    if (c.isSDCardAvailable())
    {
      if (paramView == null)
      {
        GMTrace.o(2289351786496L, 17057);
        return false;
      }
      int i = ((dr)paramView.getTag()).position;
      r localr = o.Nh().mh(paramau.field_imgPath);
      Object localObject = paramContextMenu.add(i, 129, 0, paramView.getContext().getString(R.l.dgh));
      int j = paramView.getWidth();
      int k = paramView.getHeight();
      int[] arrayOfInt = new int[2];
      paramView.getLocationInWindow(arrayOfInt);
      Intent localIntent = new Intent();
      localIntent.putExtra("img_gallery_width", j).putExtra("img_gallery_height", k).putExtra("img_gallery_left", arrayOfInt[0]).putExtra("img_gallery_top", arrayOfInt[1]);
      ((MenuItem)localObject).setIntent(localIntent);
      if (localr != null)
      {
        j = localr.status;
        if ((104 != j) && (103 != j) && (105 != j) && (106 != j)) {
          paramContextMenu.add(i, 107, 0, paramView.getContext().getString(R.l.dSi));
        }
      }
      if ((localr != null) && ((localr.status == 199) || (localr.status == 199)))
      {
        if (d.LL("favorite")) {
          paramContextMenu.add(i, 116, 0, paramView.getContext().getString(R.l.dNH));
        }
        localObject = new dh();
        ((dh)localObject).eEV.eDr = paramau.field_msgId;
        a.vgX.m((b)localObject);
        if (((dh)localObject).eEW.eEu) {
          paramContextMenu.add(i, 128, 0, paramView.getContext().getString(R.l.dgi));
        }
        if ((!paramau.bTs()) && ((paramau.bTG()) || (paramau.bTH())) && (av(paramau)) && ((localr.status == 199) || (localr.status == 199) || (paramau.fwz == 1)) && (VU(paramau.field_talker))) {
          paramContextMenu.add(i, 123, 0, paramView.getContext().getString(R.l.dgl));
        }
        if ((f.Fp()) && (!this.wvE.ceh())) {
          paramContextMenu.add(i, 114, 0, paramView.getContext().getString(R.l.dfZ));
        }
      }
      if (!this.wvE.ceh()) {
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(R.l.dge));
      }
    }
    GMTrace.o(2289351786496L, 17057);
    return true;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2289486004224L, 17058);
    GMTrace.o(2289486004224L, 17058);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2289620221952L, 17059);
    GMTrace.o(2289620221952L, 17059);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\cf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */