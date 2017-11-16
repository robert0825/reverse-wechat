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
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.r;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.chatting.b.s;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.ui.u;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.bc;

final class av
  extends ah.c
{
  private En_5b8fbb1e.a wvE;
  
  public av()
  {
    super(49);
    GMTrace.i(2380754059264L, 17738);
    GMTrace.o(2380754059264L, 17738);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2380888276992L, 17739);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null) && ((paramView.getTag() instanceof j)))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csQ);
      ((View)localObject).setTag(new j(this.jHw).dm((View)localObject));
    }
    GMTrace.o(2380888276992L, 17739);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2381022494720L, 17740);
    paramString = (j)parama;
    this.wvE = parama1;
    parama = paramau.field_content;
    if (parama != null) {}
    for (parama = f.a.C(parama, paramau.field_reserved);; parama = null)
    {
      if (parama != null)
      {
        paramau = new dr(paramau, parama1.wqK, paramInt, null, 0, (byte)0);
        paramString.wvA.setTag(paramau);
        paramString.wvA.setOnClickListener(parama1.wvd.wyW);
        if (this.tIv)
        {
          paramString.wvA.setOnLongClickListener(parama1.wvd.wyY);
          paramString.wvA.setOnTouchListener(parama1.wvd.wza);
        }
        paramString.wsd.setText(parama.title);
      }
      if ((p.a.tmc != null) && (p.a.tmc.Bj(parama1.cci())))
      {
        paramString.wsd.setTextColor(parama1.bWQ().getResources().getColor(R.e.aOE));
        paramString.wvA.setClickable(true);
        paramString.wvA.setEnabled(true);
        GMTrace.o(2381022494720L, 17740);
        return;
      }
      paramString.wsd.setTextColor(-8750470);
      paramString.wvA.setClickable(false);
      paramString.wvA.setEnabled(false);
      GMTrace.o(2381022494720L, 17740);
      return;
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2381156712448L, 17741);
    int i = ((dr)paramView.getTag()).position;
    l.Oz(this.wvE.cV(paramau.field_content, paramau.field_isSend));
    f.a locala = f.a.eS(this.wvE.cV(paramau.field_content, paramau.field_isSend));
    f localf = g.aP(locala.appId, false);
    if ((d.LL("favorite")) && ((localf == null) || (!localf.bJs()))) {
      switch (locala.type)
      {
      }
    }
    for (;;)
    {
      if ((!paramau.bTs()) && (paramau.bTE()) && ((paramau.field_status == 2) || (paramau.fwz == 1)) && (av(paramau)) && (VU(paramau.field_talker))) {
        paramContextMenu.add(i, 123, 0, paramView.getContext().getString(R.l.dgl));
      }
      if (!this.wvE.ceh()) {
        paramContextMenu.add(i, 100, 0, this.wvE.getString(R.l.dgd));
      }
      GMTrace.o(2381156712448L, 17741);
      return true;
      paramContextMenu.add(i, 116, 0, paramView.getContext().getString(R.l.dNH));
    }
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2381290930176L, 17742);
    switch (paramMenuItem.getItemId())
    {
    default: 
      GMTrace.o(2381290930176L, 17742);
      return false;
    case 100: 
      Object localObject = paramau.field_content;
      paramMenuItem = null;
      if (localObject != null) {
        paramMenuItem = f.a.eS((String)localObject);
      }
      if (paramMenuItem == null)
      {
        GMTrace.o(2381290930176L, 17742);
        return false;
      }
      l.es(paramau.field_msgId);
      bc.S(paramau.field_msgId);
      localObject = g.aP(paramMenuItem.appId, false);
      if ((localObject != null) && (((f)localObject).bJs())) {
        a(parama, paramMenuItem, paramau, (f)localObject);
      }
      GMTrace.o(2381290930176L, 17742);
      return false;
    }
    paramMenuItem = new Intent(parama.vKB.vKW, MsgRetransmitUI.class);
    paramMenuItem.putExtra("Retr_Msg_content", parama.cV(paramau.field_content, paramau.field_isSend));
    paramMenuItem.putExtra("Retr_Msg_Type", 2);
    paramMenuItem.putExtra("Retr_Msg_Id", paramau.field_msgId);
    parama.startActivity(paramMenuItem);
    GMTrace.o(2381290930176L, 17742);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2381425147904L, 17743);
    paramView = parama.wCm;
    parama.cci();
    paramView.be("fromMessage", true);
    GMTrace.o(2381425147904L, 17743);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */