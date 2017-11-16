package com.tencent.mm.ui.chatting;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.subapp.c.h;
import com.tencent.mm.pluginsdk.model.app.ab;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.f;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.q;

final class cj
  extends ah.b
{
  public com.tencent.mm.ad.e gWn;
  public En_5b8fbb1e.a wvE;
  
  public cj()
  {
    super(33);
    GMTrace.i(2210431762432L, 16469);
    GMTrace.o(2210431762432L, 16469);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2210565980160L, 16470);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null) && ((paramView.getTag() instanceof ei)))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.ctg);
      ((View)localObject).setTag(new ei(this.jHw).dz((View)localObject));
    }
    GMTrace.o(2210565980160L, 16470);
    return (View)localObject;
  }
  
  public final void a(final ah.a parama, final int paramInt, En_5b8fbb1e.a parama1, final au paramau, String paramString)
  {
    GMTrace.i(2210700197888L, 16471);
    ei localei = (ei)parama;
    this.wvE = parama1;
    Object localObject2 = an.bJI().er(paramau.field_msgId);
    Object localObject1 = paramau.field_content;
    paramString = null;
    parama = paramString;
    if (localObject2 != null)
    {
      parama = paramString;
      if (localObject1 != null) {
        parama = f.a.C((String)localObject1, paramau.field_reserved);
      }
    }
    if (parama != null) {
      localei.hqI.setText(parama.description);
    }
    w.d("MicroMsg.ChattingItemVoiceRemindsys", "content sys " + paramau.field_content);
    localObject1 = com.tencent.mm.plugin.subapp.c.e.Jw((String)localObject1);
    if ((localObject1 != null) && (((com.tencent.mm.plugin.subapp.c.e)localObject1).qso != null) && (((com.tencent.mm.plugin.subapp.c.e)localObject1).qso.length() > 0) && (((com.tencent.mm.plugin.subapp.c.e)localObject1).qsp > 0) && (this.gWn == null) && (parama != null) && (bg.nm(paramau.field_imgPath)))
    {
      localObject2 = com.tencent.mm.plugin.subapp.c.k.mj(q.zE());
      paramString = h.aA((String)localObject2, false);
      paramau.dc((String)localObject2);
      at.AR();
      com.tencent.mm.y.c.yM().a(paramau.field_msgId, paramau);
      long l = paramau.field_msgId;
      int i = parama.sdkVer;
      localObject2 = parama.appId;
      String str = ((com.tencent.mm.plugin.subapp.c.e)localObject1).qso;
      int j = ((com.tencent.mm.plugin.subapp.c.e)localObject1).qsp;
      int k = parama.type;
      localObject1 = parama.giJ;
      parama = l.a(paramString, l, i, (String)localObject2, str, j, k, parama.giz);
      if (parama != null)
      {
        paramString = at.wS();
        localObject1 = new com.tencent.mm.ad.e()
        {
          public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
          {
            GMTrace.i(2153255010304L, 16043);
            w.d("MicroMsg.ChattingItemVoiceRemindsys", "errType " + paramAnonymousInt1 + " errCode " + paramAnonymousInt2 + "  scene " + paramAnonymousk.getType());
            boolean bool = false;
            if (ak.a.gna != null) {
              bool = ak.a.gna.R(paramau.field_msgId);
            }
            if ((!bool) && (paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0) && (((ab)paramAnonymousk).getMediaId().equals(parama))) {
              cj.this.wvE.wvd.wyS.b(paramInt, paramau);
            }
            at.wS().b(221, cj.this.gWn);
            cj.this.gWn = null;
            GMTrace.o(2153255010304L, 16043);
          }
        };
        this.gWn = ((com.tencent.mm.ad.e)localObject1);
        paramString.a(221, (com.tencent.mm.ad.e)localObject1);
        parama = new ab(parama);
        parama.bJD();
        at.wS().a(parama, 0);
      }
    }
    localei.hqI.setTag(new dr(paramau, parama1.wqK, paramInt, null, 0, (byte)0));
    localei.hqI.setOnClickListener(parama1.wvd.wyW);
    at.AR();
    if (com.tencent.mm.y.c.isSDCardAvailable()) {
      localei.hqI.setOnLongClickListener(parama1.wvd.wyY);
    }
    GMTrace.o(2210700197888L, 16471);
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2210834415616L, 16472);
    int i = ((dr)paramView.getTag()).position;
    if (!this.wvE.ceh()) {
      paramContextMenu.add(i, 100, 0, this.wvE.getString(R.l.dgd));
    }
    GMTrace.o(2210834415616L, 16472);
    return true;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2210968633344L, 16473);
    switch (paramMenuItem.getItemId())
    {
    default: 
      GMTrace.o(2210968633344L, 16473);
      return false;
    }
    parama = paramau.field_content;
    paramMenuItem = null;
    if (parama != null) {
      paramMenuItem = f.a.eS(parama);
    }
    if (paramMenuItem != null) {
      l.es(paramau.field_msgId);
    }
    bc.S(paramau.field_msgId);
    GMTrace.o(2210968633344L, 16473);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2211102851072L, 16474);
    GMTrace.o(2211102851072L, 16474);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\cj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */