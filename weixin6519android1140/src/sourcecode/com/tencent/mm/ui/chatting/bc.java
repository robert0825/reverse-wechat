package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.n;
import com.tencent.mm.g.a.dh;
import com.tencent.mm.g.a.dh.b;
import com.tencent.mm.g.a.mn;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.g.a.qi.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelappbrand.e;
import com.tencent.mm.modelappbrand.r;
import com.tencent.mm.modelstat.a.a;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.u.b;

final class bc
  extends ah.b
  implements com.tencent.mm.modelappbrand.f
{
  private com.tencent.mm.modelappbrand.q hVT;
  private En_5b8fbb1e.a wvE;
  
  public bc()
  {
    super(72);
    GMTrace.i(17602789244928L, 131151);
    this.hVT = new r(this);
    GMTrace.o(17602789244928L, 131151);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(17602923462656L, 131152);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.cso);
      paramLayoutInflater = new ep(this.jHw).u((View)localObject, true);
      paramView = ((e)com.tencent.mm.kernel.h.h(e.class)).aZ(((View)localObject).getContext());
      paramLayoutInflater.wHD = paramView;
      paramLayoutInflater.wHC.addView(paramView, new ViewGroup.LayoutParams(-1, -1));
      ((View)localObject).setTag(paramLayoutInflater);
    }
    GMTrace.o(17602923462656L, 131152);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(17603057680384L, 131153);
    this.wvE = parama1;
    ep localep = (ep)parama;
    parama = paramau.field_content;
    parama1.wCp.aR(paramau);
    parama1.wCp.aS(paramau);
    parama1.wCp.aT(paramau);
    w.d("MicroMsg.ChattingItemAppMsgWxaDynamicFrom", "filling Wxa dynamic from ChattingItem(%s)", new Object[] { paramString });
    dr localdr;
    Object localObject;
    if (parama != null)
    {
      parama = f.a.C(parama, paramau.field_reserved);
      localdr = new dr(paramau, parama1.wqK, paramInt, null, 0, (byte)0);
      if (parama != null)
      {
        localep.wsp.setVisibility(8);
        localep.wso.setVisibility(8);
        localep.wsL.setVisibility(8);
        paramString = (com.tencent.mm.x.d)parama.n(com.tencent.mm.x.d.class);
        localObject = localep.wsr;
        if (paramString != null) {
          break label840;
        }
        paramString = null;
        label161:
        if (!((ChattingItemFooter)localObject).b(paramString, paramau.field_talker, false)) {
          break label850;
        }
        localep.wvA.setBackgroundResource(R.g.aVz);
        label188:
        com.tencent.mm.pluginsdk.model.app.f localf = com.tencent.mm.pluginsdk.model.app.g.cB(parama.appId, parama.eVc);
        if ((localf != null) && (localf.bJs())) {
          b(parama1, parama, paramau);
        }
        if ((parama.fwt != null) && (parama.fwt.length() != 0)) {
          break label864;
        }
        localep.wsb.setVisibility(8);
        label248:
        localObject = ((com.tencent.mm.plugin.appbrand.k.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.b.class)).pn(parama.gkR);
        localep.wst.setVisibility(0);
        localep.wsm.setVisibility(8);
        localep.wsw.setVisibility(0);
        localep.wsu.setVisibility(8);
        if (localObject == null) {
          break label892;
        }
        paramString = ((WxaAttributes)localObject).field_nickname;
        label318:
        if (localObject == null) {
          break label901;
        }
        localObject = ((WxaAttributes)localObject).field_brandIconURL;
        label330:
        localep.wsL.setVisibility(0);
        localep.wsH.setVisibility(8);
        localep.wsO.setText(parama.title);
        localep.wsH.setText(parama.description);
        localep.wsJ.setText(paramString);
        switch (parama.gkY)
        {
        default: 
          localep.wsK.setText(R.l.cRT);
          label419:
          n.Jd().a((String)localObject, localep.wsI, ep.wHA);
          if (!parama1.wqK) {
            if (com.tencent.mm.pluginsdk.model.app.g.g(localf))
            {
              localep.wss.setVisibility(0);
              c(parama1, localep.wss, dr.a(parama, paramau));
              label474:
              localObject = (com.tencent.mm.x.a)parama.n(com.tencent.mm.x.a.class);
              paramString = new Bundle();
              paramString.putString("app_id", parama.gkS);
              paramString.putString("msg_id", paramau.field_msgId);
              if (localObject == null) {
                break label964;
              }
              paramau = ((com.tencent.mm.x.a)localObject).gio;
              label545:
              paramString.putString("cache_key", paramau);
              paramString.putString("msg_title", parama.title);
              paramString.putString("msg_path", parama.gkQ);
              paramString.putInt("msg_pkg_type", parama.gkY);
              paramString.putInt("pkg_version", parama.eVc);
              paramString.putInt("widget_type", 0);
              if (!parama1.wvi) {
                break label970;
              }
            }
          }
          break;
        }
      }
    }
    label840:
    label850:
    label864:
    label892:
    label901:
    label964:
    label970:
    for (paramInt = 1008;; paramInt = 1007)
    {
      paramString.putInt("scene", paramInt);
      paramString.putInt("view_init_width", ep.wHy);
      paramString.putInt("view_init_height", ep.wHz);
      localep.wHD.setTag(localep);
      ((e)com.tencent.mm.kernel.h.h(e.class)).a(com.tencent.mm.plugin.appbrand.n.g.aQ(parama1), localep.wHD, paramString, this.hVT);
      localep.wvA.setTag(localdr);
      localep.wvA.setOnClickListener(parama1.wvd.wyW);
      paramString = com.tencent.mm.y.u.Av().p(com.tencent.mm.plugin.appbrand.n.g.aQ(parama1), true);
      paramau = (cu)paramString.get("listener", null);
      parama = paramau;
      if (paramau == null)
      {
        parama = new cu();
        paramString.o("listener", parama);
      }
      parama.b(parama1);
      if (this.tIv) {
        localep.wvA.setOnLongClickListener(parama1.wvd.wyY);
      }
      GMTrace.o(17603057680384L, 131153);
      return;
      w.e("MicroMsg.ChattingItemAppMsgWxaDynamicFrom", "amessage, msgid:%s, user:%s", new Object[] { Long.valueOf(paramau.field_msgId), paramString });
      parama = null;
      break;
      paramString = paramString.gir;
      break label161;
      localep.wvA.setBackgroundResource(R.g.aVv);
      break label188;
      localep.wsb.setVisibility(0);
      b(parama1, localep.wsb, dr.Wm(parama.fwt));
      break label248;
      paramString = parama.eTp;
      break label318;
      localObject = parama.gla;
      break label330;
      localep.wsK.setText(R.l.cSi);
      break label419;
      localep.wsK.setText(R.l.cSh);
      break label419;
      localep.wss.setVisibility(8);
      break label474;
      localep.wss.setVisibility(8);
      break label474;
      paramau = null;
      break label545;
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(17603191898112L, 131154);
    int i = ((dr)paramView.getTag()).position;
    f.a locala = f.a.eS(this.wvE.cV(paramau.field_content, paramau.field_isSend));
    Object localObject;
    if ((com.tencent.mm.pluginsdk.model.app.g.h(com.tencent.mm.pluginsdk.model.app.g.aP(locala.appId, false))) && (!aa.am(paramau)))
    {
      if (locala.type != 6) {
        break label314;
      }
      localObject = l.OA(locala.eAE);
      if (((localObject == null) || (!d.c(paramau, ((com.tencent.mm.pluginsdk.model.app.b)localObject).field_fileFullPath))) && (!paramau.bTO())) {
        paramContextMenu.add(i, 111, 0, this.wvE.getString(R.l.dSi));
      }
    }
    for (;;)
    {
      localObject = new dh();
      ((dh)localObject).eEV.eDr = paramau.field_msgId;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      if ((((dh)localObject).eEW.eEu) || (d.a(this.wvE.vKB.vKW, locala))) {
        paramContextMenu.add(i, 128, 0, paramView.getContext().getString(R.l.dgi));
      }
      if (!this.wvE.ceh()) {
        paramContextMenu.add(i, 100, 0, this.wvE.getString(R.l.dgd));
      }
      paramView = ((e)com.tencent.mm.kernel.h.h(e.class)).CH();
      if ((paramView.CJ()) || (paramView.fI(locala.gkY))) {
        paramContextMenu.add(i, 131, 0, this.wvE.getString(R.l.dgj));
      }
      GMTrace.o(17603191898112L, 131154);
      return true;
      label314:
      paramContextMenu.add(i, 111, 0, this.wvE.getString(R.l.dSi));
    }
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    String str = null;
    Object localObject = null;
    GMTrace.i(17603326115840L, 131155);
    switch (paramMenuItem.getItemId())
    {
    default: 
      GMTrace.o(17603326115840L, 131155);
      return false;
    case 100: 
      str = paramau.field_content;
      paramMenuItem = (MenuItem)localObject;
      if (str != null) {
        paramMenuItem = f.a.eS(str);
      }
      if (paramMenuItem != null)
      {
        l.es(paramau.field_msgId);
        if (19 == paramMenuItem.type)
        {
          localObject = new mn();
          ((mn)localObject).eRu.type = 3;
          ((mn)localObject).eRu.eDr = paramau.field_msgId;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
        }
        localObject = com.tencent.mm.pluginsdk.model.app.g.aP(paramMenuItem.appId, false);
        if ((localObject != null) && (((com.tencent.mm.pluginsdk.model.app.f)localObject).bJs())) {
          a(parama, paramMenuItem, paramau, (com.tencent.mm.pluginsdk.model.app.f)localObject);
        }
      }
      com.tencent.mm.y.bc.S(paramau.field_msgId);
      GMTrace.o(17603326115840L, 131155);
      return false;
    case 111: 
      d.a(parama, paramau, a(parama, paramau));
      GMTrace.o(17603326115840L, 131155);
      return false;
    }
    localObject = paramau.field_content;
    paramMenuItem = str;
    if (localObject != null) {
      paramMenuItem = f.a.eS((String)localObject);
    }
    if (paramMenuItem == null)
    {
      GMTrace.o(17603326115840L, 131155);
      return false;
    }
    localObject = new Bundle();
    ((Bundle)localObject).putString("app_id", paramMenuItem.gkS);
    ((Bundle)localObject).putString("msg_id", paramau.field_msgId);
    ((Bundle)localObject).putInt("pkg_type", paramMenuItem.gkY);
    ((Bundle)localObject).putInt("pkg_version", paramMenuItem.gkV);
    ((e)com.tencent.mm.kernel.h.h(e.class)).CH().b(parama.vKB.vKW, (Bundle)localObject);
    GMTrace.o(17603326115840L, 131155);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(17603460333568L, 131156);
    com.tencent.mm.modelstat.a.a(paramau, a.a.gWs);
    paramView = paramau.field_content;
    if (paramView == null)
    {
      GMTrace.o(17603460333568L, 131156);
      return false;
    }
    Object localObject1 = f.a.eS(parama.cV(paramView, paramau.field_isSend));
    if (localObject1 == null)
    {
      GMTrace.o(17603460333568L, 131156);
      return false;
    }
    paramView = com.tencent.mm.pluginsdk.model.app.g.aP(((f.a)localObject1).appId, false);
    if ((paramView != null) && (paramView.bJs())) {
      a(parama, (f.a)localObject1, c(parama, paramau), paramView, paramau.field_msgSvrId);
    }
    w.i("MicroMsg.ChattingItemAppMsgWxaDynamicFrom", "username: %s , path: %s ,appid %s ,url : %s, pkgType : %s, md5 : %s", new Object[] { ((f.a)localObject1).gkR, ((f.a)localObject1).gkQ, ((f.a)localObject1).gkS, ((f.a)localObject1).url, Integer.valueOf(((f.a)localObject1).gkY), ((f.a)localObject1).gkU });
    paramView = new qi();
    paramView.eUY.appId = ((f.a)localObject1).gkS;
    paramView.eUY.userName = ((f.a)localObject1).gkR;
    paramView.eUY.eVa = ((f.a)localObject1).gkQ;
    paramView.eUY.eVb = ((f.a)localObject1).gkY;
    paramView.eUY.eVd = ((f.a)localObject1).gkU;
    paramView.eUY.eVc = ((f.a)localObject1).gkZ;
    Object localObject2 = paramView.eUY;
    boolean bool;
    if (((f.a)localObject1).gkY != 0)
    {
      bool = true;
      ((qi.a)localObject2).eVe = bool;
      paramView.eUY.eVg.gqY = parama.cci();
      paramView.eUY.eVg.gqZ = ((f.a)localObject1).gkX;
      localObject1 = ((f.a)localObject1).gkW;
      if (!parama.wvi) {
        break label412;
      }
      paramView.eUY.scene = 1008;
      localObject2 = new StringBuilder(parama.cci());
      ((StringBuilder)localObject2).append(":");
      ((StringBuilder)localObject2).append(a(parama, paramau));
      ((StringBuilder)localObject2).append(":");
      ((StringBuilder)localObject2).append((String)localObject1);
    }
    for (paramView.eUY.eAv = ((StringBuilder)localObject2).toString();; paramView.eUY.eAv = parama.toString())
    {
      com.tencent.mm.sdk.b.a.vgX.m(paramView);
      GMTrace.o(17603460333568L, 131156);
      return true;
      bool = false;
      break;
      label412:
      paramView.eUY.scene = 1007;
      parama = new StringBuilder(a(parama, paramau));
      parama.append(":");
      parama.append((String)localObject1);
    }
  }
  
  public final void q(View paramView, int paramInt)
  {
    GMTrace.i(17828543463424L, 132833);
    Object localObject = paramView.getTag();
    if (!(localObject instanceof ep))
    {
      GMTrace.o(17828543463424L, 132833);
      return;
    }
    w.i("MicroMsg.ChattingItemAppMsgWxaDynamicFrom", "onWidgetStateChanged(%s, state : %d)", new Object[] { Integer.valueOf(paramView.hashCode()), Integer.valueOf(paramInt) });
    paramView = (ep)localObject;
    switch (paramInt)
    {
    case 2: 
    case 3: 
    default: 
      paramView.iEW.ZI();
      paramView.iEW.setVisibility(4);
      paramView.wHD.setVisibility(4);
      paramView.wHB.setVisibility(0);
      paramView.wHB.setImageResource(R.k.cJx);
      GMTrace.o(17828543463424L, 132833);
      return;
    case 0: 
      paramView.iEW.setVisibility(0);
      paramView.iEW.cju();
      paramView.wHB.setVisibility(4);
      paramView.wHD.setVisibility(4);
      GMTrace.o(17828543463424L, 132833);
      return;
    case 1: 
      paramView.iEW.ZI();
      paramView.iEW.setVisibility(4);
      paramView.wHD.setVisibility(4);
      paramView.wHB.setVisibility(0);
      paramView.wHB.setImageResource(R.k.cLZ);
      GMTrace.o(17828543463424L, 132833);
      return;
    }
    paramView.iEW.ZI();
    paramView.iEW.setVisibility(4);
    paramView.wHD.setVisibility(0);
    paramView.wHB.setVisibility(4);
    GMTrace.o(17828543463424L, 132833);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */