package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.hv;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.card.a.h;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.ui.u;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.bc;

final class ap
  extends ah.c
{
  private En_5b8fbb1e.a wvE;
  
  public ap()
  {
    super(62);
    GMTrace.i(2373506301952L, 17684);
    GMTrace.o(2373506301952L, 17684);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2373640519680L, 17685);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null) && ((paramView.getTag() instanceof g)))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csV);
      ((View)localObject).setTag(new g(this.jHw).q((View)localObject, false));
    }
    GMTrace.o(2373640519680L, 17685);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2373774737408L, 17686);
    this.wvE = parama1;
    g localg = (g)parama;
    paramString = paramau.field_content;
    if (paramString != null) {}
    for (paramString = f.a.C(paramString, paramau.field_reserved);; paramString = null)
    {
      if ((localg != null) && (paramString != null)) {
        localg.a(parama1.vKB.vKW, paramString, paramau.field_imgPath, this.tIv);
      }
      paramau = new dr(paramau, parama1.wqK, paramInt, null, 0, (byte)0);
      parama.wvA.setTag(paramau);
      parama.wvA.setOnClickListener(parama1.wvd.wyW);
      if (this.tIv)
      {
        parama.wvA.setOnLongClickListener(parama1.wvd.wyY);
        parama.wvA.setOnTouchListener(parama1.wvd.wza);
      }
      GMTrace.o(2373774737408L, 17686);
      return;
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2373908955136L, 17687);
    int i = ((dr)paramView.getTag()).position;
    paramView = paramau.field_content;
    if (paramView == null)
    {
      GMTrace.o(2373908955136L, 17687);
      return true;
    }
    paramView = f.a.eS(this.wvE.cV(paramView, paramau.field_isSend));
    if (paramView == null)
    {
      GMTrace.o(2373908955136L, 17687);
      return true;
    }
    switch (paramView.type)
    {
    default: 
    case 16: 
      do
      {
        GMTrace.o(2373908955136L, 17687);
        return true;
      } while ((paramView.gjF != 5) && (paramView.gjF != 6) && (paramView.gjF != 2));
      if (paramView.gjF != 2) {
        paramContextMenu.clear();
      }
      paramContextMenu.add(i, 100, 0, this.wvE.getString(R.l.dgd));
      GMTrace.o(2373908955136L, 17687);
      return false;
    }
    paramContextMenu.clear();
    paramContextMenu.add(i, 100, 0, this.wvE.getString(R.l.dgd));
    GMTrace.o(2373908955136L, 17687);
    return false;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2374043172864L, 17688);
    switch (paramMenuItem.getItemId())
    {
    }
    for (;;)
    {
      GMTrace.o(2374043172864L, 17688);
      return false;
      parama = paramau.field_content;
      paramMenuItem = null;
      if (parama != null) {
        paramMenuItem = f.a.eS(parama);
      }
      if (paramMenuItem != null) {
        l.es(paramau.field_msgId);
      }
      bc.S(paramau.field_msgId);
      GMTrace.o(2374043172864L, 17688);
      return false;
      Object localObject = parama.cV(paramau.field_content, paramau.field_isSend);
      paramMenuItem = new Intent(parama.vKB.vKW, MsgRetransmitUI.class);
      paramMenuItem.putExtra("Retr_Msg_content", (String)localObject);
      localObject = f.a.eS((String)localObject);
      if ((localObject != null) && (16 == ((f.a)localObject).type)) {
        paramMenuItem.putExtra("Retr_Msg_Type", 14);
      }
      for (;;)
      {
        paramMenuItem.putExtra("Retr_Msg_Id", paramau.field_msgId);
        parama.startActivity(paramMenuItem);
        GMTrace.o(2374043172864L, 17688);
        return false;
        paramMenuItem.putExtra("Retr_Msg_Type", 2);
      }
      paramMenuItem = paramau.field_content;
      if (paramMenuItem == null)
      {
        GMTrace.o(2374043172864L, 17688);
        return false;
      }
      paramMenuItem = f.a.eS(paramMenuItem);
      if (paramMenuItem != null) {
        switch (paramMenuItem.type)
        {
        default: 
          break;
        case 16: 
          parama = new hv();
          parama.eLk.eLl = paramMenuItem.eLl;
          parama.eLk.eCL = paramau.field_msgId;
          parama.eLk.eLm = paramau.field_talker;
          a.vgX.m(parama);
        }
      }
    }
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2374177390592L, 17689);
    paramView = paramau.field_content;
    if (paramView == null)
    {
      GMTrace.o(2374177390592L, 17689);
      return false;
    }
    Object localObject = f.a.eS(paramView);
    if (localObject == null)
    {
      GMTrace.o(2374177390592L, 17689);
      return false;
    }
    switch (((f.a)localObject).type)
    {
    default: 
      GMTrace.o(2374177390592L, 17689);
      return false;
    case 16: 
      if (bg.nm(((f.a)localObject).eLl))
      {
        GMTrace.o(2374177390592L, 17689);
        return false;
      }
      paramView = new Intent();
      paramView.setFlags(65536);
      paramView.putExtra("key_card_app_msg", ((f.a)localObject).eLl);
      paramView.putExtra("key_from_scene", ((f.a)localObject).gjF);
      d.b(parama.vKB.vKW, "card", ".ui.CardDetailUI", paramView);
      GMTrace.o(2374177390592L, 17689);
      return true;
    }
    paramView = h.b((f.a)localObject);
    PackageInfo localPackageInfo;
    int i;
    if (1 < paramView.ver)
    {
      String str = com.tencent.mm.pluginsdk.model.app.p.s(((f.a)localObject).giu, "message");
      localPackageInfo = getPackageInfo(parama.vKB.vKW, ((f.a)localObject).appId);
      if (localPackageInfo == null)
      {
        paramView = null;
        if (localPackageInfo != null) {
          break label293;
        }
        i = 0;
        label246:
        a(parama, str, str, paramView, i, ((f.a)localObject).appId, true, paramau.field_msgId, paramau.field_msgSvrId, paramau);
      }
    }
    for (;;)
    {
      GMTrace.o(2374177390592L, 17689);
      return true;
      paramView = localPackageInfo.versionName;
      break;
      label293:
      i = localPackageInfo.versionCode;
      break label246;
      localObject = new Intent();
      ((Intent)localObject).putExtra("key_from_user_name", a(parama, paramau));
      ((Intent)localObject).putExtra("key_biz_uin", paramView.gjH);
      ((Intent)localObject).putExtra("key_order_id", paramView.gjI);
      if ((paramau.field_talker != null) && (!paramau.field_talker.equals("")) && (paramau.field_talker.endsWith("@chatroom"))) {
        ((Intent)localObject).putExtra("key_chatroom_name", paramau.field_talker);
      }
      d.b(parama.vKB.vKW, "card", ".ui.CardGiftAcceptUI", (Intent)localObject);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */