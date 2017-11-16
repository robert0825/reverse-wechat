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
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.l.a;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.ui.u;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;

final class bi
  extends ah.c
{
  private En_5b8fbb1e.a wvE;
  private String wwB;
  
  public bi()
  {
    super(13);
    GMTrace.i(2265326813184L, 16878);
    GMTrace.o(2265326813184L, 16878);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2265461030912L, 16879);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csU);
      ((View)localObject).setTag(new x(this.jHw).r((View)localObject, false));
    }
    GMTrace.o(2265461030912L, 16879);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2265595248640L, 16880);
    this.wvE = parama1;
    x localx = (x)parama;
    at.AR();
    au.a locala = com.tencent.mm.y.c.yM().Cn(paramau.field_content);
    if ((locala.rAP == null) || (locala.rAP.length() <= 0)) {
      w.e("MicroMsg.ChattingItemCardTo", "getView : parse possible friend msg failed");
    }
    this.wwB = locala.rAP;
    w.d("MicroMsg.ChattingItemCardTo", "dancy is biz: %s, userName: %s ", new Object[] { Boolean.valueOf(s.fD(this.wwB)), this.wwB });
    x.I(localx.wvA, localx.wrJ);
    label179:
    int i;
    if (s.fp(locala.rCC))
    {
      localx.wtG.setText(R.l.deY);
      localx.wtH.setVisibility(8);
      if (d.et(16))
      {
        localx.wtF.setBackground(null);
        q(localx.wtF, this.wwB);
        localx.jpV.setText(h.b(parama1.vKB.vKW, locala.eCQ, localx.jpV.getTextSize()));
        i = 0;
        paramString = locala.fsF;
        if (t.nm(this.wwB)) {
          break label595;
        }
        at.AR();
        parama = com.tencent.mm.y.c.yK().TE(this.wwB);
        if ((parama == null) || (!a.eE(parama.field_type))) {
          break label595;
        }
        com.tencent.mm.storage.x.bSz();
        label265:
        parama = paramString;
        int j = i;
        if (i == 0)
        {
          parama = paramString;
          j = i;
          if (t.nm(paramString))
          {
            parama = this.wwB;
            if ((!t.nm(parama)) && (!com.tencent.mm.storage.x.aV(parama, true)) && (!s.fB(parama))) {
              break label601;
            }
            i = 1;
            label322:
            j = i;
          }
        }
        boolean bool = s.fp(locala.rCC);
        if ((j != 0) || (bool)) {
          parama = "";
        }
        if (t.nm(parama)) {
          break label607;
        }
        localx.wtH.setVisibility(0);
        localx.wtH.setText(parama);
        label375:
        localx.wvA.setTag(new dr(paramau, parama1.wqK, paramInt, null, 0, (byte)0));
        localx.wvA.setOnClickListener(parama1.wvd.wyW);
        localx.wvA.setOnLongClickListener(parama1.wvd.wyY);
        localx.wvA.setOnTouchListener(parama1.wvd.wza);
        if (!ccs()) {
          break label641;
        }
        if (localx.nWt != null) {
          localx.nWt.setVisibility(8);
        }
        if ((paramau.field_status != 2) || (!a(parama1.wvd, paramau.field_msgId))) {
          break label620;
        }
        if (localx.wrV != null) {
          localx.wrV.setVisibility(0);
        }
      }
    }
    for (;;)
    {
      a(paramInt, localx, paramau, parama1.wvd.gtf, parama1.wqK, parama1.wvd.wyW);
      GMTrace.o(2265595248640L, 16880);
      return;
      localx.wtF.setBackgroundDrawable(null);
      break;
      localx.wtG.setText(R.l.dgI);
      localx.wtF.setBackgroundResource(R.g.aVS);
      p(localx.wtF, this.wwB);
      break label179;
      label595:
      i = 1;
      break label265;
      label601:
      i = 0;
      break label322;
      label607:
      localx.wtH.setVisibility(8);
      break label375;
      label620:
      if (localx.wrV != null)
      {
        localx.wrV.setVisibility(8);
        continue;
        label641:
        if (localx.nWt != null)
        {
          localx.nWt.setVisibility(0);
          if (paramau.field_status >= 2) {
            localx.nWt.setVisibility(8);
          }
        }
      }
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2265729466368L, 16881);
    int i = ((dr)paramView.getTag()).position;
    at.AR();
    au.a locala = com.tencent.mm.y.c.yM().Cn(paramau.field_content);
    if ((locala.rAP == null) || (locala.rAP.length() <= 0)) {
      w.e("MicroMsg.ChattingItemCardTo", "getView : parse possible friend msg failed");
    }
    this.wwB = locala.rAP;
    if (s.fp(locala.rCC)) {
      paramContextMenu.add(i, 118, 0, paramView.getContext().getString(R.l.dSi));
    }
    if ((!paramau.bTs()) && ((paramau.field_status == 2) || (paramau.fwz == 1)) && (paramau.bTD()) && (av(paramau)) && (VU(paramau.field_talker))) {
      paramContextMenu.add(i, 123, 0, paramView.getContext().getString(R.l.dgl));
    }
    if (!this.wvE.ceh()) {
      paramContextMenu.add(i, 100, 0, paramView.getContext().getString(R.l.dgd));
    }
    GMTrace.o(2265729466368L, 16881);
    return true;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2265863684096L, 16882);
    switch (paramMenuItem.getItemId())
    {
    default: 
      GMTrace.o(2265863684096L, 16882);
      return false;
    }
    paramMenuItem = new Intent(parama.vKB.vKW, MsgRetransmitUI.class);
    paramMenuItem.putExtra("Retr_Msg_content", parama.cV(paramau.field_content, paramau.field_isSend));
    paramMenuItem.putExtra("Retr_Msg_Type", 8);
    paramMenuItem.putExtra("Retr_Msg_Id", paramau.field_msgId);
    parama.startActivity(paramMenuItem);
    GMTrace.o(2265863684096L, 16882);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2265997901824L, 16883);
    GMTrace.o(2265997901824L, 16883);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */