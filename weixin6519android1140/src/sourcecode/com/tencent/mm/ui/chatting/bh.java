package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.b;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.ui.u;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.s;
import java.util.Map;

final class bh
  extends ah.b
{
  private En_5b8fbb1e.a wvE;
  private String wwB;
  private String wwC;
  
  public bh()
  {
    super(12);
    GMTrace.i(2392833654784L, 17828);
    GMTrace.o(2392833654784L, 17828);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2392967872512L, 17829);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csp);
      ((View)localObject).setTag(new x(this.jHw).r((View)localObject, true));
    }
    GMTrace.o(2392967872512L, 17829);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2393236307968L, 17831);
    this.wvE = parama1;
    x localx = (x)parama;
    au.a locala;
    if (parama1.wqK)
    {
      parama = bc.gQ(paramau.field_content);
      at.AR();
      locala = com.tencent.mm.y.c.yM().Cn(parama);
      if ((locala.rAP == null) || (locala.rAP.length() <= 0)) {
        w.e("MicroMsg.ChattingItemCardFrom", "getView : parse possible friend msg failed");
      }
      this.wwB = locala.rAP;
      this.wwC = "";
      if (!t.nm(parama))
      {
        parama = com.tencent.mm.sdk.platformtools.bh.q(parama, "msg");
        if (parama.containsKey(".msg.$wechatid")) {
          this.wwC = ((String)parama.get(".msg.$wechatid"));
        }
      }
      b.y(this.wwB, locala.vBr);
      x.I(localx.wvA, localx.wrJ);
      if (!s.fp(locala.rCC)) {
        break label431;
      }
      localx.wtG.setText(R.l.deY);
      localx.wtH.setVisibility(8);
      if (!d.et(16)) {
        break label419;
      }
      localx.wtF.setBackground(null);
      label207:
      q(localx.wtF, this.wwB);
      label219:
      parama = this.wwC;
      if ((!t.nm(parama)) && (!com.tencent.mm.storage.x.aV(parama, true)) && (!s.fB(parama))) {
        break label484;
      }
    }
    label272:
    label419:
    label431:
    label471:
    label484:
    for (int i = 1;; i = 0)
    {
      boolean bool = s.fp(locala.rCC);
      if ((i != 0) || (bool))
      {
        parama = "";
        if (t.nm(parama)) {
          break label471;
        }
        localx.wtH.setVisibility(0);
        localx.wtH.setText(parama);
      }
      for (;;)
      {
        localx.jpV.setText(h.c(parama1.vKB.vKW, locala.eCQ, (int)localx.jpV.getTextSize()));
        localx.wvA.setTag(new dr(paramau, parama1.wqK, paramInt, paramString, 0, (byte)0));
        localx.wvA.setOnClickListener(parama1.wvd.wyW);
        localx.wvA.setOnLongClickListener(parama1.wvd.wyY);
        localx.wvA.setOnTouchListener(parama1.wvd.wza);
        GMTrace.o(2393236307968L, 17831);
        return;
        parama = paramau.field_content;
        break;
        localx.wtF.setBackgroundDrawable(null);
        break label207;
        localx.wtG.setText(R.l.dgI);
        localx.wtF.setBackgroundResource(R.g.aVS);
        p(localx.wtF, this.wwB);
        break label219;
        break label272;
        localx.wtH.setVisibility(8);
      }
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2393370525696L, 17832);
    int i = ((dr)paramView.getTag()).position;
    at.AR();
    paramau = com.tencent.mm.y.c.yM().Cn(paramau.field_content);
    if ((paramau.rAP == null) || (paramau.rAP.length() <= 0)) {
      w.e("MicroMsg.ChattingItemCardFrom", "getView : parse possible friend msg failed");
    }
    this.wwB = paramau.rAP;
    if (s.fp(paramau.rCC)) {
      paramContextMenu.add(i, 118, 0, paramView.getContext().getString(R.l.dSi));
    }
    if (!this.wvE.ceh()) {
      paramContextMenu.add(i, 100, 0, paramView.getContext().getString(R.l.dgd));
    }
    GMTrace.o(2393370525696L, 17832);
    return true;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2393504743424L, 17833);
    switch (paramMenuItem.getItemId())
    {
    default: 
      GMTrace.o(2393504743424L, 17833);
      return false;
    }
    paramMenuItem = new Intent(parama.vKB.vKW, MsgRetransmitUI.class);
    paramMenuItem.putExtra("Retr_Msg_content", parama.cV(paramau.field_content, paramau.field_isSend));
    paramMenuItem.putExtra("Retr_Msg_Type", 8);
    paramMenuItem.putExtra("Retr_Msg_Id", paramau.field_msgId);
    parama.startActivity(paramMenuItem);
    GMTrace.o(2393504743424L, 17833);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2393638961152L, 17834);
    GMTrace.o(2393638961152L, 17834);
    return false;
  }
  
  protected final boolean a(En_5b8fbb1e.a parama)
  {
    GMTrace.i(2393102090240L, 17830);
    boolean bool = parama.wqK;
    GMTrace.o(2393102090240L, 17830);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */