package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.r;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.chatting.b.s;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.ui.u;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.bc;

final class au
  extends ah.b
{
  private En_5b8fbb1e.a wvE;
  
  public au()
  {
    super(48);
    GMTrace.i(2177145765888L, 16221);
    GMTrace.o(2177145765888L, 16221);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2177279983616L, 16222);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null) && ((paramView.getTag() instanceof j)))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csl);
      ((View)localObject).setTag(new j(this.jHw).dm((View)localObject));
    }
    GMTrace.o(2177279983616L, 16222);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, com.tencent.mm.storage.au paramau, String paramString)
  {
    GMTrace.i(2177414201344L, 16223);
    j localj = (j)parama;
    this.wvE = parama1;
    com.tencent.mm.x.f localf = an.bJI().er(paramau.field_msgId);
    parama = paramau.field_content;
    if (parama1.wvi)
    {
      int i = paramau.field_content.indexOf(':');
      if (i != -1) {
        parama = paramau.field_content.substring(i + 1);
      }
    }
    for (;;)
    {
      if ((localf != null) && (parama != null))
      {
        parama = f.a.C(parama, paramau.field_reserved);
        if (parama != null)
        {
          localj.wsd.setText(parama.title);
          parama = new dr(paramau, parama1.wqK, paramInt, null, 0, (byte)0);
          localj.wvA.setTag(parama);
          localj.wvA.setOnClickListener(parama1.wvd.wyW);
          if (this.tIv)
          {
            localj.wvA.setOnLongClickListener(parama1.wvd.wyY);
            localj.wvA.setOnTouchListener(parama1.wvd.wza);
          }
        }
        if ((p.a.tmc != null) && (p.a.tmc.Bj(parama1.cci())))
        {
          localj.wsd.setTextColor(parama1.bWQ().getResources().getColor(R.e.aOE));
          localj.wvA.setClickable(true);
          localj.wvA.setEnabled(true);
          GMTrace.o(2177414201344L, 16223);
        }
      }
      else
      {
        if (localf == null) {}
        for (boolean bool = true;; bool = false)
        {
          w.e("MicroMsg.ChattingItemAppMsgLocationShareFrom", "amessage:%b, %s, %s", new Object[] { Boolean.valueOf(bool), parama, Long.valueOf(paramau.field_msgId), paramString });
          parama = null;
          break;
        }
      }
      localj.wsd.setTextColor(-8750470);
      localj.wvA.setClickable(false);
      localj.wvA.setEnabled(false);
      GMTrace.o(2177414201344L, 16223);
      return;
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, com.tencent.mm.storage.au paramau)
  {
    GMTrace.i(2177548419072L, 16224);
    int i = ((dr)paramView.getTag()).position;
    l.Oz(this.wvE.cV(paramau.field_content, paramau.field_isSend));
    paramau = f.a.eS(this.wvE.cV(paramau.field_content, paramau.field_isSend));
    com.tencent.mm.pluginsdk.model.app.f localf = g.aP(paramau.appId, false);
    if ((d.LL("favorite")) && ((localf == null) || (!localf.bJs()))) {
      switch (paramau.type)
      {
      }
    }
    for (;;)
    {
      if (!this.wvE.ceh()) {
        paramContextMenu.add(i, 100, 0, this.wvE.getString(R.l.dgd));
      }
      GMTrace.o(2177548419072L, 16224);
      return true;
      paramContextMenu.add(i, 116, 0, paramView.getContext().getString(R.l.dNH));
    }
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, com.tencent.mm.storage.au paramau)
  {
    GMTrace.i(2177682636800L, 16225);
    switch (paramMenuItem.getItemId())
    {
    default: 
      GMTrace.o(2177682636800L, 16225);
      return false;
    case 100: 
      Object localObject = paramau.field_content;
      paramMenuItem = null;
      if (localObject != null) {
        paramMenuItem = f.a.eS((String)localObject);
      }
      if (paramMenuItem == null)
      {
        GMTrace.o(2177682636800L, 16225);
        return false;
      }
      l.es(paramau.field_msgId);
      bc.S(paramau.field_msgId);
      localObject = g.aP(paramMenuItem.appId, false);
      if ((localObject != null) && (((com.tencent.mm.pluginsdk.model.app.f)localObject).bJs())) {
        a(parama, paramMenuItem, paramau, (com.tencent.mm.pluginsdk.model.app.f)localObject);
      }
      GMTrace.o(2177682636800L, 16225);
      return false;
    }
    paramMenuItem = new Intent(parama.vKB.vKW, MsgRetransmitUI.class);
    paramMenuItem.putExtra("Retr_Msg_content", parama.cV(paramau.field_content, paramau.field_isSend));
    paramMenuItem.putExtra("Retr_Msg_Type", 2);
    paramMenuItem.putExtra("Retr_Msg_Id", paramau.field_msgId);
    parama.startActivity(paramMenuItem);
    GMTrace.o(2177682636800L, 16225);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, com.tencent.mm.storage.au paramau)
  {
    GMTrace.i(2177816854528L, 16226);
    paramView = parama.wCm;
    parama.cci();
    paramView.be("fromMessage", true);
    GMTrace.o(2177816854528L, 16226);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */