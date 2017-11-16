package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.text.ClipboardManager;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.av.e;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.secinforeport.a.a;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.chatting.b.q;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.ui.u;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.c;

final class az
  extends ah.c
{
  public En_5b8fbb1e.a wvE;
  
  public az()
  {
    super(23);
    GMTrace.i(2243180888064L, 16713);
    GMTrace.o(2243180888064L, 16713);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2243315105792L, 16714);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null) && ((paramView.getTag() instanceof n)))
    {
      localObject = paramView;
      if (((n)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csS);
      ((View)localObject).setTag(new l(this.jHw).jdMethod_do((View)localObject));
    }
    GMTrace.o(2243315105792L, 16714);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2243449323520L, 16715);
    l locall = (l)parama;
    this.wvE = parama1;
    parama1.wCp.aT(paramau);
    parama = paramau.field_content;
    if (parama != null) {}
    for (parama = f.a.C(parama, paramau.field_reserved);; parama = null)
    {
      f localf;
      if ((parama != null) && (parama.type == 1))
      {
        locall.jRv.setText(parama.title);
        locall.jRv.setClickable(true);
        com.tencent.mm.pluginsdk.ui.d.h.e(locall.jRv, 1);
        localf = g.aP(parama.appId, true);
        if ((localf != null) && (localf.field_appName != null) && (localf.field_appName.trim().length() > 0)) {
          break label387;
        }
        paramString = parama.appName;
        if ((parama.appId == null) || (parama.appId.length() <= 0) || (!g.bI(paramString))) {
          break label397;
        }
        locall.ljO.setText(parama1.getString(R.l.dhv, new Object[] { g.a(parama1.vKB.vKW, localf, paramString) }));
        locall.ljO.setVisibility(0);
        a(parama1, locall.ljO, parama.appId);
        a(parama1, locall.ljO, parama.appId);
        label231:
        if ((paramau.field_status != 2) && (paramau.field_status != 5)) {
          break label410;
        }
        locall.nWt.setVisibility(8);
      }
      for (;;)
      {
        a(paramInt, locall, paramau, parama1.wvd.gtf, parama1.wqK, parama1.wvd.wyW);
        locall.jRv.setTag(new dr(paramau, parama1.wqK, paramInt, null, 0, (byte)0));
        locall.jRv.setOnClickListener(parama1.wvd.wyW);
        at.AR();
        if (c.isSDCardAvailable())
        {
          locall.jRv.setOnLongClickListener(parama1.wvd.wyY);
          if ((parama != null) && (parama.type != 1)) {
            locall.jRv.setOnTouchListener(parama1.wvd.wza);
          }
        }
        GMTrace.o(2243449323520L, 16715);
        return;
        label387:
        paramString = localf.field_appName;
        break;
        label397:
        locall.ljO.setVisibility(8);
        break label231;
        label410:
        locall.nWt.setVisibility(0);
      }
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2243583541248L, 16716);
    int i = ((dr)paramView.getTag()).position;
    paramContextMenu.add(i, 111, 0, this.wvE.getString(R.l.dSi));
    if (com.tencent.mm.bj.d.LL("favorite")) {
      paramContextMenu.add(i, 116, 0, this.wvE.getString(R.l.dNH));
    }
    if ((!paramau.bTs()) && ((paramau.field_status == 2) || (paramau.fwz == 1)) && (av(paramau)) && (VU(paramau.field_talker))) {
      paramContextMenu.add(i, 123, 0, paramView.getContext().getString(R.l.dgl));
    }
    if (!this.wvE.ceh()) {
      paramContextMenu.add(i, 100, 0, this.wvE.getString(R.l.dgd));
    }
    GMTrace.o(2243583541248L, 16716);
    return true;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2243717758976L, 16717);
    switch (paramMenuItem.getItemId())
    {
    default: 
      GMTrace.o(2243717758976L, 16717);
      return false;
    case 100: 
      bc.S(paramau.field_msgId);
      at.AR();
      c.yJ().b(new e(paramau.field_talker, paramau.field_msgSvrId));
      GMTrace.o(2243717758976L, 16717);
      return false;
    case 102: 
      paramMenuItem = (ClipboardManager)parama.vKB.vKW.getSystemService("clipboard");
      parama = parama.cV(f.a.eS(paramau.field_content).title, paramau.field_isSend);
      paramMenuItem.setText(parama);
      int i = a.oEY;
      a.c(1, paramau.field_msgSvrId, bg.So(parama));
      GMTrace.o(2243717758976L, 16717);
      return false;
    }
    paramMenuItem = new Intent(parama.vKB.vKW, MsgRetransmitUI.class);
    paramMenuItem.putExtra("Retr_Msg_content", paramau.field_content);
    paramMenuItem.putExtra("Retr_Msg_Type", 2);
    paramMenuItem.putExtra("Retr_Msg_Id", paramau.field_msgId);
    parama.startActivity(paramMenuItem);
    GMTrace.o(2243717758976L, 16717);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, final au paramau)
  {
    GMTrace.i(2243851976704L, 16718);
    if ((((dr)paramView.getTag()).jHw == 5) && (paramau.field_isSend == 1))
    {
      if (paramau != null) {
        com.tencent.mm.ui.base.h.a(this.wvE.vKB.vKW, this.wvE.getString(R.l.dhb), "", this.wvE.getString(R.l.cUn), this.wvE.getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(2257005314048L, 16816);
            com.tencent.mm.pluginsdk.model.app.l.Z(paramau);
            bc.S(paramau.field_msgId);
            az.this.wvE.me(true);
            GMTrace.o(2257005314048L, 16816);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(2266803208192L, 16889);
            GMTrace.o(2266803208192L, 16889);
          }
        });
      }
      GMTrace.o(2243851976704L, 16718);
      return true;
    }
    GMTrace.o(2243851976704L, 16718);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */