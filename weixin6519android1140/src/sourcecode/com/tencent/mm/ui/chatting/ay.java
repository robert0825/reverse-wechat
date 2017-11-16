package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Intent;
import android.text.ClipboardManager;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.av.e;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.secinforeport.a.a;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.ui.d.h;
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

final class ay
  extends ah.b
{
  private En_5b8fbb1e.a wvE;
  
  public ay()
  {
    super(22);
    GMTrace.i(2247610073088L, 16746);
    GMTrace.o(2247610073088L, 16746);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2247744290816L, 16747);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null) && ((paramView.getTag() instanceof n)))
    {
      localObject = paramView;
      if (((n)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csn);
      ((View)localObject).setTag(new l(this.jHw).jdMethod_do((View)localObject));
    }
    GMTrace.o(2247744290816L, 16747);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2247878508544L, 16748);
    this.wvE = parama1;
    parama1.wCp.aT(paramau);
    l locall = (l)parama;
    paramString = paramau.field_content;
    parama = paramString;
    if (parama1.wvi)
    {
      int i = paramau.field_content.indexOf(':');
      parama = paramString;
      if (i != -1) {
        parama = paramau.field_content.substring(i + 1);
      }
    }
    if (parama != null) {}
    for (parama = f.a.C(parama, paramau.field_reserved);; parama = null)
    {
      f localf;
      if ((parama != null) && (parama.type == 1))
      {
        localf = g.aP(parama.appId, true);
        if ((localf != null) && (localf.field_appName != null) && (localf.field_appName.trim().length() > 0)) {
          break label420;
        }
        paramString = parama.appName;
        if ((parama.appId == null) || (parama.appId.length() <= 0) || (!g.bI(paramString))) {
          break label430;
        }
        locall.ljO.setText(parama1.getString(R.l.dhv, new Object[] { g.a(parama1.vKB.vKW, localf, paramString) }));
        locall.ljO.setVisibility(0);
        a(parama1, locall.ljO, parama.appId);
        a(parama1, locall.ljO, parama.appId);
        label245:
        if ((parama.fwt == null) || (parama.fwt.length() <= 0)) {
          break label443;
        }
        b(parama1, locall.wsb, dr.Wm(parama.fwt));
        locall.wsb.setVisibility(0);
      }
      for (;;)
      {
        locall.jRv.setText(parama.title);
        locall.jRv.setClickable(true);
        h.e(locall.jRv, 1);
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
        GMTrace.o(2247878508544L, 16748);
        return;
        label420:
        paramString = localf.field_appName;
        break;
        label430:
        locall.ljO.setVisibility(8);
        break label245;
        label443:
        locall.wsb.setVisibility(8);
      }
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2248012726272L, 16749);
    int i = ((dr)paramView.getTag()).position;
    paramContextMenu.add(i, 111, 0, this.wvE.getString(R.l.dSi));
    if (com.tencent.mm.bj.d.LL("favorite")) {
      paramContextMenu.add(i, 116, 0, this.wvE.getString(R.l.dNH));
    }
    if (!this.wvE.ceh()) {
      paramContextMenu.add(i, 100, 0, this.wvE.getString(R.l.dgd));
    }
    GMTrace.o(2248012726272L, 16749);
    return true;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2248146944000L, 16750);
    switch (paramMenuItem.getItemId())
    {
    default: 
      GMTrace.o(2248146944000L, 16750);
      return false;
    case 100: 
      bc.S(paramau.field_msgId);
      at.AR();
      c.yJ().b(new e(paramau.field_talker, paramau.field_msgSvrId));
      GMTrace.o(2248146944000L, 16750);
      return false;
    case 102: 
      paramMenuItem = (ClipboardManager)parama.vKB.vKW.getSystemService("clipboard");
      parama = parama.cV(f.a.eS(parama.cV(paramau.field_content, paramau.field_isSend)).title, paramau.field_isSend);
      paramMenuItem.setText(parama);
      int i = a.oEY;
      a.c(1, paramau.field_msgSvrId, bg.So(parama));
      GMTrace.o(2248146944000L, 16750);
      return false;
    }
    paramMenuItem = new Intent(parama.vKB.vKW, MsgRetransmitUI.class);
    paramMenuItem.putExtra("Retr_Msg_content", parama.cV(paramau.field_content, paramau.field_isSend));
    paramMenuItem.putExtra("Retr_Msg_Type", 2);
    paramMenuItem.putExtra("Retr_Msg_Id", paramau.field_msgId);
    parama.startActivity(paramMenuItem);
    GMTrace.o(2248146944000L, 16750);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2248281161728L, 16751);
    GMTrace.o(2248281161728L, 16751);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */