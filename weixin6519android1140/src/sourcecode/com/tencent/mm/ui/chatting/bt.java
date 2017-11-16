package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
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
import com.tencent.mm.ao.e;
import com.tencent.mm.ao.m;
import com.tencent.mm.ao.m.d;
import com.tencent.mm.ao.n;
import com.tencent.mm.g.a.dh;
import com.tencent.mm.g.a.dh.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.concurrent.ConcurrentHashMap;

public final class bt
  extends ah.c
{
  private En_5b8fbb1e.a wvE;
  
  public bt()
  {
    super(3);
    GMTrace.i(2116882006016L, 15772);
    GMTrace.o(2116882006016L, 15772);
  }
  
  public static void a(ah.a parama, int paramInt1, int paramInt2)
  {
    GMTrace.i(2117687312384L, 15778);
    if (paramInt2 > 0) {
      if (paramInt1 >= paramInt2) {
        paramInt1 = 100;
      }
    }
    for (;;)
    {
      parama = (dq)parama;
      if ((paramInt1 < 100) || (parama.wFs.getVisibility() == 0)) {
        break;
      }
      GMTrace.o(2117687312384L, 15778);
      return;
      paramInt1 = (int)(paramInt1 * 100L / paramInt2);
      continue;
      paramInt1 = 0;
    }
    parama.wFs.setText(paramInt1 + "%");
    if (ccs()) {
      parama.nWt.setVisibility(8);
    }
    for (;;)
    {
      parama.wFs.setVisibility(0);
      parama.wFu.setVisibility(0);
      GMTrace.o(2117687312384L, 15778);
      return;
      parama.nWt.setVisibility(0);
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2117016223744L, 15773);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csY);
      ((View)localObject).setTag(new dq(this.jHw).r((View)localObject, false));
    }
    GMTrace.o(2117016223744L, 15773);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2117150441472L, 15774);
    this.wvE = parama1;
    paramString = (dq)parama;
    parama = m.IQ();
    long l = paramau.field_msgId;
    boolean bool2 = parama.gJb.containsKey(Long.valueOf(l));
    Object localObject1 = n.IZ().n(paramau);
    int i;
    int j;
    boolean bool1;
    Object localObject2;
    Object localObject3;
    int k;
    if ((localObject1 != null) && (!bool2)) {
      if (m.IQ().at(((com.tencent.mm.ao.d)localObject1).gGR))
      {
        parama = m.IQ().au(((com.tencent.mm.ao.d)localObject1).gGR);
        i = (int)parama.eMG;
        j = (int)parama.mK;
        if (i == 0)
        {
          bool1 = true;
          localObject2 = n.IZ();
          localObject3 = paramString.wrU;
          String str = paramau.field_imgPath;
          float f = com.tencent.mm.br.a.getDensity(parama1.vKB.vKW);
          i = paramau.fww;
          j = paramau.fwx;
          k = R.g.aVk;
          ImageView localImageView = paramString.wFt;
          int m = R.g.aVl;
          if (!bool1) {
            break label604;
          }
          parama = null;
          label182:
          if ((!((com.tencent.mm.ao.f)localObject2).a((ImageView)localObject3, str, f, i, j, k, localImageView, m, 0, parama)) && (!this.tIv)) {
            paramString.wrU.setImageDrawable(com.tencent.mm.br.a.b(parama1.vKB.vKW, R.g.aYy));
          }
          if ((localObject1 == null) && (!bool2)) {
            break label854;
          }
          if ((!bool1) && (paramau.field_status != 5)) {
            break label613;
          }
          k = 1;
          label263:
          if (!bool2) {
            break label619;
          }
          paramString.wFs.setText("0%");
          parama = paramString.nWt;
          if (k == 0) {
            break label836;
          }
          i = 8;
          label293:
          parama.setVisibility(i);
          parama = paramString.wFs;
          if (k == 0) {
            break label842;
          }
          i = 8;
          label314:
          parama.setVisibility(i);
          parama = paramString.wFu;
          if (k == 0) {
            break label848;
          }
          i = 8;
          label335:
          parama.setVisibility(i);
          label341:
          paramString.wvA.setTag(new dr(paramau, parama1.wqK, paramInt, paramau.field_talker, 0, (byte)0));
          paramString.wvA.setOnClickListener(parama1.wvd.wyW);
          paramString.wvA.setOnTouchListener(parama1.wvd.wza);
          paramString.wvA.setOnLongClickListener(parama1.wvd.wyY);
          paramString.wrU.setContentDescription(parama1.getString(R.l.dfH));
          if (ccs())
          {
            paramString.nWt.setVisibility(8);
            w.d("MicroMsg.ContactInfoUI", "[oneliang]%s,%s", new Object[] { Long.valueOf(paramau.field_msgId), Integer.valueOf(paramau.field_status) });
            if (ccs())
            {
              if ((paramau.field_status != 2) || (!a(parama1.wvd, paramau.field_msgId))) {
                break label887;
              }
              if (paramString.wrV != null) {
                paramString.wrV.setVisibility(0);
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      a(paramInt, paramString, paramau, parama1.wvd.gtf, parama1.wqK, parama1.wvd.wyW);
      GMTrace.o(2117150441472L, 15774);
      return;
      if ((j == i) && (i != 0))
      {
        bool1 = true;
        break;
      }
      bool1 = false;
      break;
      bool1 = e.b((com.tencent.mm.ao.d)localObject1);
      break;
      bool1 = false;
      break;
      label604:
      parama = paramString.wFu;
      break label182;
      label613:
      k = 0;
      break label263;
      label619:
      parama = paramString.wFs;
      localObject2 = new StringBuilder();
      if (localObject1 != null)
      {
        j = ((com.tencent.mm.ao.d)localObject1).gsL;
        i = ((com.tencent.mm.ao.d)localObject1).offset;
        if (m.IQ().at(((com.tencent.mm.ao.d)localObject1).gGR))
        {
          localObject3 = m.IQ().au(((com.tencent.mm.ao.d)localObject1).gGR);
          j = (int)((m.d)localObject3).eMG;
          i = (int)((m.d)localObject3).mK;
        }
        if (((com.tencent.mm.ao.d)localObject1).II())
        {
          localObject3 = n.IZ().gr(((com.tencent.mm.ao.d)localObject1).gHb);
          if (m.IQ().at(((com.tencent.mm.ao.d)localObject1).gHb))
          {
            localObject1 = m.IQ().au(((com.tencent.mm.ao.d)localObject1).gHb);
            j = (int)((m.d)localObject1).eMG;
            i = (int)((m.d)localObject1).mK;
          }
        }
        else
        {
          label762:
          if (j <= 0) {
            break label830;
          }
          if (i < j) {
            break label817;
          }
          i = 100;
        }
      }
      for (;;)
      {
        parama.setText(i + "%");
        break;
        j = ((com.tencent.mm.ao.d)localObject3).gsL;
        i = ((com.tencent.mm.ao.d)localObject3).offset;
        break label762;
        label817:
        i = i * 100 / j;
        continue;
        label830:
        i = 0;
      }
      label836:
      i = 0;
      break label293;
      label842:
      i = 0;
      break label314;
      label848:
      i = 0;
      break label335;
      label854:
      paramString.wFu.setVisibility(8);
      paramString.nWt.setVisibility(8);
      paramString.wFs.setVisibility(8);
      break label341;
      label887:
      if (paramString.wrV != null) {
        paramString.wrV.setVisibility(8);
      }
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2117284659200L, 15775);
    at.AR();
    int k;
    Object localObject2;
    Object localObject1;
    int j;
    int i;
    if ((c.isSDCardAvailable()) && (paramView != null))
    {
      k = ((dr)paramView.getTag()).position;
      localObject2 = null;
      if (paramau.field_msgId > 0L) {
        localObject2 = n.IZ().aq(paramau.field_msgId);
      }
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (((com.tencent.mm.ao.d)localObject2).gGR > 0L) {}
      }
      else
      {
        localObject1 = localObject2;
        if (paramau.field_msgSvrId > 0L) {
          localObject1 = n.IZ().ap(paramau.field_msgSvrId);
        }
      }
      localObject2 = localObject1;
      if (((com.tencent.mm.ao.d)localObject1).II())
      {
        localObject2 = localObject1;
        if (((com.tencent.mm.ao.d)localObject1).gsL == 0) {
          localObject2 = n.IZ().gr(((com.tencent.mm.ao.d)localObject1).gHb);
        }
      }
      paramContextMenu.add(k, 110, 0, paramView.getContext().getString(R.l.dSi));
      if (paramau.field_status == 5) {
        paramContextMenu.add(k, 103, 0, paramView.getContext().getString(R.l.dhc));
      }
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
      if ((com.tencent.mm.bj.d.LL("photoedit")) && (((com.tencent.mm.ao.d)localObject2).status != -1))
      {
        localObject1 = paramContextMenu.add(k, 130, 0, paramView.getContext().getString(R.l.dfG));
        localObject2 = new int[2];
        if (paramView == null) {
          break label584;
        }
        j = paramView.getWidth();
        i = paramView.getHeight();
        paramView.getLocationInWindow((int[])localObject2);
      }
    }
    for (;;)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("img_gallery_width", j).putExtra("img_gallery_height", i).putExtra("img_gallery_left", localObject2[0]).putExtra("img_gallery_top", localObject2[1]);
      ((MenuItem)localObject1).setIntent(localIntent);
      if ((!paramau.bTs()) && (paramau.bTC()) && ((paramau.field_status == 2) || (paramau.fwz == 1)) && (av(paramau)) && (VU(paramau.field_talker))) {
        paramContextMenu.add(k, 123, 0, paramView.getContext().getString(R.l.dgl));
      }
      if (!this.wvE.ceh()) {
        paramContextMenu.add(k, 100, 0, paramView.getContext().getString(R.l.dgc));
      }
      GMTrace.o(2117284659200L, 15775);
      return true;
      label584:
      i = 0;
      j = 0;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2117418876928L, 15776);
    GMTrace.o(2117418876928L, 15776);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2117553094656L, 15777);
    GMTrace.o(2117553094656L, 15777);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */