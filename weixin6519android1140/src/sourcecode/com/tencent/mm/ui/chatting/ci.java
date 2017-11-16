package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.g;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.subapp.c.h;
import com.tencent.mm.pluginsdk.model.app.ab;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;

final class ci
  extends ah.b
{
  public com.tencent.mm.ad.e gWn;
  public En_5b8fbb1e.a wvE;
  
  public ci()
  {
    super(35);
    GMTrace.i(2220363874304L, 16543);
    GMTrace.o(2220363874304L, 16543);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2220498092032L, 16544);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null) && ((paramView.getTag() instanceof ec)))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.ctf);
      ((View)localObject).setTag(new ec(this.jHw).dy((View)localObject));
    }
    GMTrace.o(2220498092032L, 16544);
    return (View)localObject;
  }
  
  protected final String a(En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2220632309760L, 16545);
    parama = parama.wvd.eDs;
    GMTrace.o(2220632309760L, 16545);
    return parama;
  }
  
  public final void a(ah.a parama, final int paramInt, En_5b8fbb1e.a parama1, final au paramau, String paramString)
  {
    GMTrace.i(2220900745216L, 16547);
    localec = (ec)parama;
    this.wvE = parama1;
    Object localObject2 = an.bJI().er(paramau.field_msgId);
    Object localObject1 = paramau.field_content;
    parama = null;
    paramString = parama;
    if (localObject2 != null)
    {
      paramString = parama;
      if (localObject1 != null) {
        paramString = f.a.C((String)localObject1, paramau.field_reserved);
      }
    }
    localObject2 = com.tencent.mm.plugin.subapp.c.e.Jw((String)localObject1);
    if ((localObject2 != null) && (((com.tencent.mm.plugin.subapp.c.e)localObject2).qsm != 0)) {}
    try
    {
      localObject3 = com.tencent.mm.pluginsdk.i.n.O(parama1.vKB.vKW, ((com.tencent.mm.plugin.subapp.c.e)localObject2).qsm);
      localObject1 = "";
      parama = (ah.a)localObject1;
      if (localObject3 != null)
      {
        parama = (ah.a)localObject1;
        if (((String)localObject3).length() > 0)
        {
          localObject3 = ((String)localObject3).split(";");
          localObject1 = "" + localObject3[0].replace(" ", "");
          parama = (ah.a)localObject1;
          if (localObject3.length > 1) {
            parama = (String)localObject1 + localObject3[1];
          }
        }
      }
      localObject1 = parama;
      if (paramString != null)
      {
        localObject1 = parama;
        if (paramString.description != null) {
          localObject1 = parama + " " + paramString.description;
        }
      }
      localec.hqI.setText((CharSequence)localObject1);
    }
    catch (Exception parama)
    {
      for (;;)
      {
        Object localObject3;
        long l;
        w.printErrStackTrace("MicroMsg.ChattingItemVoiceRemindRemind", parama, "", new Object[0]);
        continue;
        int i = 0;
        continue;
        localec.wGI.setImageResource(R.g.aYf);
      }
    }
    w.d("MicroMsg.ChattingItemVoiceRemindRemind", "content remind " + paramau.field_content);
    if ((com.tencent.mm.platformtools.t.nm(paramau.field_imgPath)) && (((com.tencent.mm.plugin.subapp.c.e)localObject2).qss > 0))
    {
      at.AR();
      parama = com.tencent.mm.y.c.yM().B(paramau.field_talker, ((com.tencent.mm.plugin.subapp.c.e)localObject2).qss);
      if (!com.tencent.mm.platformtools.t.nm(parama.field_imgPath))
      {
        localObject1 = com.tencent.mm.plugin.subapp.c.k.mj(com.tencent.mm.y.q.zE());
        localObject3 = h.aA((String)localObject1, false);
        if (j.r(h.aA(parama.field_imgPath, false), (String)localObject3, false))
        {
          paramau.dc((String)localObject1);
          at.AR();
          com.tencent.mm.y.c.yM().a(paramau.field_msgId, paramau);
        }
      }
    }
    if ((com.tencent.mm.platformtools.t.nm(paramau.field_imgPath)) && (localObject2 != null) && (((com.tencent.mm.plugin.subapp.c.e)localObject2).eAE != null) && (((com.tencent.mm.plugin.subapp.c.e)localObject2).eAE.length() > 0) && (((com.tencent.mm.plugin.subapp.c.e)localObject2).giv > 0) && (this.gWn == null))
    {
      parama = com.tencent.mm.plugin.subapp.c.k.mj(com.tencent.mm.y.q.zE());
      localObject1 = h.aA(parama, false);
      if (com.tencent.mm.platformtools.t.nm(paramau.field_imgPath))
      {
        paramau.dc(parama);
        at.AR();
        com.tencent.mm.y.c.yM().a(paramau.field_msgId, paramau);
        w.d("MicroMsg.ChattingItemVoiceRemindRemind", "content.attachid " + paramString.eAE);
        parama = l.a((String)localObject1, paramau.field_msgId, paramString.sdkVer, paramString.appId, paramString.eAE, paramString.giv);
        w.d("MicroMsg.ChattingItemVoiceRemindRemind", "ainfo.field_mediaSvrId " + parama.field_mediaSvrId);
        if (parama.field_mediaSvrId != null)
        {
          paramString = at.wS();
          localObject1 = new com.tencent.mm.ad.e()
          {
            public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
            {
              GMTrace.i(2111513296896L, 15732);
              w.d("MicroMsg.ChattingItemVoiceRemindRemind", "errType " + paramAnonymousInt1 + " errCode " + paramAnonymousInt2 + "  scene " + paramAnonymousk.getType());
              at.wS().b(221, ci.this.gWn);
              ci.this.gWn = null;
              GMTrace.o(2111513296896L, 15732);
            }
          };
          this.gWn = ((com.tencent.mm.ad.e)localObject1);
          paramString.a(221, (com.tencent.mm.ad.e)localObject1);
          w.d("MicroMsg.ChattingItemVoiceRemindRemind", "doscene");
          parama = new ab(parama);
          at.wS().a(parama, 0);
        }
      }
    }
    localec.wGI.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2368271810560L, 17645);
        if (com.tencent.mm.platformtools.t.nm(paramau.field_imgPath))
        {
          w.d("MicroMsg.ChattingItemVoiceRemindRemind", "filename is null");
          GMTrace.o(2368271810560L, 17645);
          return;
        }
        paramAnonymousView = ci.this.wvE.wvd.wyS;
        int i = paramInt;
        au localau = paramau;
        if (localau != null)
        {
          paramAnonymousView.cbN();
          at.AR();
          Boolean localBoolean = (Boolean)com.tencent.mm.y.c.xh().get(4115, null);
          if ((localBoolean == null) || (!localBoolean.booleanValue()))
          {
            at.AR();
            com.tencent.mm.y.c.xh().set(4115, Boolean.valueOf(true));
            paramAnonymousView.cbU();
            paramAnonymousView.wtf = com.tencent.mm.ui.base.u.a(paramAnonymousView.wtc.bWQ(), paramAnonymousView.wtc.getString(R.l.dgD), 4000L);
          }
          if ((paramAnonymousView.lbS.isPlaying()) && (localau.field_msgId == paramAnonymousView.wta))
          {
            paramAnonymousView.lV(true);
            GMTrace.o(2368271810560L, 17645);
            return;
          }
          paramAnonymousView.ag(localau);
          if ((localau.field_isSend == 0) && (!com.tencent.mm.modelvoice.q.B(localau))) {
            paramAnonymousView.CC(i + 1);
          }
          paramAnonymousView.cbQ();
        }
        GMTrace.o(2368271810560L, 17645);
      }
    });
    l = paramau.field_msgId;
    if ((this.wvE.wvd.wyS.isPlaying()) && (this.wvE.wvd.wyS.wta == l))
    {
      i = 1;
      if (i == 0) {
        break label821;
      }
      localec.wGI.setImageResource(R.g.aYe);
      localec.wvA.setTag(new dr(paramau, parama1.wqK, paramInt, null, 0, (byte)0));
      localec.wvA.setOnClickListener(parama1.wvd.wyW);
      at.AR();
      if (com.tencent.mm.y.c.isSDCardAvailable()) {
        localec.wvA.setOnLongClickListener(parama1.wvd.wyY);
      }
      GMTrace.o(2220900745216L, 16547);
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2221034962944L, 16548);
    int i = ((dr)paramView.getTag()).position;
    int j = l.Oz(this.wvE.cV(paramau.field_content, paramau.field_isSend));
    paramView = f.a.eS(this.wvE.cV(paramau.field_content, paramau.field_isSend));
    if ((paramView.giv <= 0) || ((paramView.giv > 0) && (j >= 100))) {
      paramContextMenu.add(i, 111, 0, this.wvE.getString(R.l.dSi));
    }
    if (!this.wvE.ceh()) {
      paramContextMenu.add(i, 100, 0, this.wvE.getString(R.l.dgd));
    }
    GMTrace.o(2221034962944L, 16548);
    return true;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2221169180672L, 16549);
    switch (paramMenuItem.getItemId())
    {
    default: 
      GMTrace.o(2221169180672L, 16549);
      return false;
    case 100: 
      parama = paramau.field_content;
      paramMenuItem = null;
      if (parama != null) {
        paramMenuItem = f.a.eS(parama);
      }
      if (paramMenuItem != null) {
        l.es(paramau.field_msgId);
      }
      bc.S(paramau.field_msgId);
      GMTrace.o(2221169180672L, 16549);
      return false;
    }
    paramMenuItem = new Intent(parama.vKB.vKW, MsgRetransmitUI.class);
    paramMenuItem.putExtra("Retr_Msg_content", parama.cV(paramau.field_content, paramau.field_isSend));
    paramMenuItem.putExtra("Retr_Msg_Type", 2);
    paramMenuItem.putExtra("Retr_Msg_Id", paramau.field_msgId);
    parama.startActivity(paramMenuItem);
    GMTrace.o(2221169180672L, 16549);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2221303398400L, 16550);
    GMTrace.o(2221303398400L, 16550);
    return true;
  }
  
  protected final boolean a(En_5b8fbb1e.a parama)
  {
    GMTrace.i(2220766527488L, 16546);
    GMTrace.o(2220766527488L, 16546);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */