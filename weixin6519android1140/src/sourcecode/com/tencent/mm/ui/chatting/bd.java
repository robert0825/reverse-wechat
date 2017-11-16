package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.n;
import com.tencent.mm.g.a.dh;
import com.tencent.mm.g.a.dh.b;
import com.tencent.mm.g.a.hv;
import com.tencent.mm.g.a.mn;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.g.a.qi.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelappbrand.e;
import com.tencent.mm.modelappbrand.r;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.u.b;

final class bd
  extends ah.c
  implements com.tencent.mm.modelappbrand.f
{
  private com.tencent.mm.modelappbrand.q hVT;
  public En_5b8fbb1e.a wvE;
  
  public bd()
  {
    super(73);
    GMTrace.i(17606413123584L, 131178);
    this.hVT = new r(this);
    GMTrace.o(17606413123584L, 131178);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(17606547341312L, 131179);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csT);
      paramLayoutInflater = new ep(this.jHw).u((View)localObject, false);
      paramView = ((e)com.tencent.mm.kernel.h.h(e.class)).aZ(((View)localObject).getContext());
      paramLayoutInflater.wHD = paramView;
      paramLayoutInflater.wHC.addView(paramView, new ViewGroup.LayoutParams(-1, -1));
      ((View)localObject).setTag(paramLayoutInflater);
    }
    GMTrace.o(17606547341312L, 131179);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(17606681559040L, 131180);
    ep localep = (ep)parama;
    this.wvE = parama1;
    parama1.wCp.aT(paramau);
    parama = paramau.field_content;
    parama1.wCp.aR(paramau);
    if (parama != null) {}
    for (parama = f.a.C(parama, paramau.field_reserved);; parama = null)
    {
      dr localdr = new dr(paramau, parama1.wqK, paramInt, null, 0, (byte)0);
      Object localObject;
      if (parama != null)
      {
        localep.wsp.setVisibility(8);
        localep.wso.setVisibility(8);
        localep.wsm.setVisibility(8);
        localep.wsL.setVisibility(8);
        localObject = ((com.tencent.mm.plugin.appbrand.k.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.b.class)).pn(parama.gkR);
        if (localObject == null) {
          break label701;
        }
        paramString = ((WxaAttributes)localObject).field_nickname;
        if (localObject == null) {
          break label710;
        }
        localObject = ((WxaAttributes)localObject).field_brandIconURL;
        label163:
        localep.wsL.setVisibility(0);
        localep.wsH.setVisibility(8);
        localep.wsO.setText(parama.title);
        localep.wsH.setText(parama.description);
        localep.wsJ.setText(paramString);
        switch (parama.gkY)
        {
        default: 
          localep.wsK.setText(R.l.cRT);
          label255:
          n.Jd().a((String)localObject, localep.wsI, ep.wHA);
          if (ccs())
          {
            paramString = parama1.wvd;
            if ((paramau.field_status == 2) && (a(paramString, paramau.field_msgId)))
            {
              if (localep.wrV != null) {
                localep.wrV.setVisibility(0);
              }
              label322:
              if (localep.nWt != null) {
                localep.nWt.setVisibility(8);
              }
              label340:
              paramString = (com.tencent.mm.x.a)parama.n(com.tencent.mm.x.a.class);
              localObject = new Bundle();
              ((Bundle)localObject).putString("app_id", parama.gkS);
              ((Bundle)localObject).putString("msg_id", paramau.field_msgId);
              if (paramString == null) {
                break label807;
              }
              paramString = paramString.gio;
              label411:
              ((Bundle)localObject).putString("cache_key", paramString);
              ((Bundle)localObject).putString("msg_title", parama.title);
              ((Bundle)localObject).putString("msg_path", parama.gkQ);
              ((Bundle)localObject).putInt("msg_pkg_type", parama.gkY);
              ((Bundle)localObject).putInt("pkg_version", parama.eVc);
              ((Bundle)localObject).putInt("widget_type", 0);
              if (!parama1.wvi) {
                break label813;
              }
            }
          }
          break;
        }
      }
      label701:
      label710:
      label807:
      label813:
      for (int i = 1008;; i = 1007)
      {
        ((Bundle)localObject).putInt("scene", i);
        ((Bundle)localObject).putInt("view_init_width", ep.wHy);
        ((Bundle)localObject).putInt("view_init_height", ep.wHz);
        localep.wHD.setTag(localep);
        ((e)com.tencent.mm.kernel.h.h(e.class)).a(com.tencent.mm.plugin.appbrand.n.g.aQ(parama1), localep.wHD, (Bundle)localObject, this.hVT);
        localep.wvA.setTag(localdr);
        localep.wvA.setOnClickListener(parama1.wvd.wyW);
        localObject = com.tencent.mm.y.u.Av().p(com.tencent.mm.plugin.appbrand.n.g.aQ(parama1), true);
        paramString = (cu)((u.b)localObject).get("listener", null);
        parama = paramString;
        if (paramString == null)
        {
          parama = new cu();
          ((u.b)localObject).o("listener", parama);
        }
        parama.b(parama1);
        if (this.tIv) {
          localep.wvA.setOnLongClickListener(parama1.wvd.wyY);
        }
        a(paramInt, localep, paramau, parama1.wvd.gtf, parama1.wqK, parama1.wvd.wyW);
        GMTrace.o(17606681559040L, 131180);
        return;
        paramString = parama.eTp;
        break;
        localObject = parama.gla;
        break label163;
        localep.wsK.setText(R.l.cSi);
        break label255;
        localep.wsK.setText(R.l.cSh);
        break label255;
        if (localep.wrV == null) {
          break label322;
        }
        localep.wrV.setVisibility(8);
        break label322;
        if (localep.nWt == null) {
          break label340;
        }
        localep.nWt.setVisibility(0);
        if (paramau.field_status < 2) {
          break label340;
        }
        localep.nWt.setVisibility(8);
        break label340;
        paramString = null;
        break label411;
      }
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(17606815776768L, 131181);
    int i = ((dr)paramView.getTag()).position;
    Object localObject = paramau.field_content;
    if (localObject == null)
    {
      GMTrace.o(17606815776768L, 131181);
      return true;
    }
    localObject = f.a.eS(this.wvE.cV((String)localObject, paramau.field_isSend));
    if (localObject == null)
    {
      GMTrace.o(17606815776768L, 131181);
      return true;
    }
    if ((com.tencent.mm.pluginsdk.model.app.g.h(com.tencent.mm.pluginsdk.model.app.g.aP(((f.a)localObject).appId, false))) && (!aa.am(paramau))) {
      paramContextMenu.add(i, 111, 0, this.wvE.getString(R.l.dSi));
    }
    if (((paramau.field_status == 2) || (paramau.fwz == 1)) && (av(paramau)) && (VU(paramau.field_talker))) {
      paramContextMenu.add(i, 123, 0, paramView.getContext().getString(R.l.dgl));
    }
    dh localdh = new dh();
    localdh.eEV.eDr = paramau.field_msgId;
    com.tencent.mm.sdk.b.a.vgX.m(localdh);
    if ((localdh.eEW.eEu) || (d.a(this.wvE.vKB.vKW, (f.a)localObject))) {
      paramContextMenu.add(i, 128, 0, paramView.getContext().getString(R.l.dgi));
    }
    if (!this.wvE.ceh()) {
      paramContextMenu.add(i, 100, 0, this.wvE.getString(R.l.dgd));
    }
    paramView = ((e)com.tencent.mm.kernel.h.h(e.class)).CH();
    if ((paramView.CJ()) || (paramView.fI(((f.a)localObject).gkY))) {
      paramContextMenu.add(i, 131, 0, this.wvE.getString(R.l.dgj));
    }
    GMTrace.o(17606815776768L, 131181);
    return true;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    String str = null;
    Object localObject = null;
    GMTrace.i(17606949994496L, 131182);
    switch (paramMenuItem.getItemId())
    {
    default: 
      GMTrace.o(17606949994496L, 131182);
      return false;
    case 100: 
      str = paramau.field_content;
      paramMenuItem = (MenuItem)localObject;
      if (str != null) {
        paramMenuItem = f.a.eS(str);
      }
      if (paramMenuItem != null)
      {
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
      bc.S(paramau.field_msgId);
      GMTrace.o(17606949994496L, 131182);
      return false;
    case 111: 
      d.a(parama, paramau, a(parama, paramau));
      GMTrace.o(17606949994496L, 131182);
      return false;
    case 103: 
      paramMenuItem = paramau.field_content;
      if (paramMenuItem == null)
      {
        GMTrace.o(17606949994496L, 131182);
        return false;
      }
      paramMenuItem = f.a.eS(paramMenuItem);
      if (paramMenuItem != null) {
        switch (paramMenuItem.type)
        {
        }
      }
      for (;;)
      {
        GMTrace.o(17606949994496L, 131182);
        return false;
        parama = new hv();
        parama.eLk.eLl = paramMenuItem.eLl;
        parama.eLk.eCL = paramau.field_msgId;
        parama.eLk.eLm = paramau.field_talker;
        com.tencent.mm.sdk.b.a.vgX.m(parama);
      }
    }
    localObject = paramau.field_content;
    paramMenuItem = str;
    if (localObject != null) {
      paramMenuItem = f.a.eS((String)localObject);
    }
    if (paramMenuItem == null)
    {
      GMTrace.o(17606949994496L, 131182);
      return false;
    }
    localObject = new Bundle();
    ((Bundle)localObject).putString("app_id", paramMenuItem.gkS);
    ((Bundle)localObject).putString("msg_id", paramau.field_msgId);
    ((Bundle)localObject).putInt("pkg_type", paramMenuItem.gkY);
    ((Bundle)localObject).putInt("pkg_version", paramMenuItem.gkV);
    ((e)com.tencent.mm.kernel.h.h(e.class)).CH().b(parama.vKB.vKW, (Bundle)localObject);
    GMTrace.o(17606949994496L, 131182);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, final au paramau)
  {
    GMTrace.i(17607084212224L, 131183);
    if ((((dr)paramView.getTag()).jHw == 5) && (paramau.field_isSend == 1))
    {
      if (paramau != null) {
        com.tencent.mm.ui.base.h.a(this.wvE.vKB.vKW, this.wvE.getString(R.l.dhb), "", this.wvE.getString(R.l.cUn), this.wvE.getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(17585206722560L, 131020);
            ed.Z(paramau);
            bd.this.wvE.me(true);
            GMTrace.o(17585206722560L, 131020);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(17597420535808L, 131111);
            GMTrace.o(17597420535808L, 131111);
          }
        });
      }
      GMTrace.o(17607084212224L, 131183);
      return true;
    }
    paramView = paramau.field_content;
    if (paramView == null)
    {
      GMTrace.o(17607084212224L, 131183);
      return false;
    }
    paramView = f.a.eS(paramView);
    if (paramView == null)
    {
      GMTrace.o(17607084212224L, 131183);
      return false;
    }
    Object localObject1 = com.tencent.mm.pluginsdk.model.app.g.aP(paramView.appId, true);
    if ((localObject1 != null) && (!bg.nm(((com.tencent.mm.pluginsdk.model.app.f)localObject1).field_appId)) && (((com.tencent.mm.pluginsdk.model.app.f)localObject1).bJs())) {
      a(parama, paramView, com.tencent.mm.y.q.zE(), (com.tencent.mm.pluginsdk.model.app.f)localObject1, paramau.field_msgSvrId);
    }
    localObject1 = new qi();
    ((qi)localObject1).eUY.appId = paramView.gkS;
    ((qi)localObject1).eUY.userName = paramView.gkR;
    ((qi)localObject1).eUY.eVa = paramView.gkQ;
    ((qi)localObject1).eUY.eVb = paramView.gkY;
    ((qi)localObject1).eUY.eVd = paramView.gkU;
    ((qi)localObject1).eUY.eVc = paramView.gkZ;
    Object localObject2 = ((qi)localObject1).eUY;
    boolean bool;
    StringBuilder localStringBuilder;
    if (paramView.gkY != 0)
    {
      bool = true;
      ((qi.a)localObject2).eVe = bool;
      localObject2 = paramView.gkW;
      if (!parama.wvi) {
        break label447;
      }
      ((qi)localObject1).eUY.scene = 1008;
      localStringBuilder = new StringBuilder(parama.cci());
      localStringBuilder.append(":");
      localStringBuilder.append(a(parama, paramau));
      localStringBuilder.append(":");
      localStringBuilder.append((String)localObject2);
    }
    for (((qi)localObject1).eUY.eAv = localStringBuilder.toString();; ((qi)localObject1).eUY.eAv = paramau.toString())
    {
      ((qi)localObject1).eUY.eVg.gqY = parama.cci();
      ((qi)localObject1).eUY.eVg.gqZ = paramView.gkX;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
      GMTrace.o(17607084212224L, 131183);
      return true;
      bool = false;
      break;
      label447:
      ((qi)localObject1).eUY.scene = 1007;
      paramau = new StringBuilder(a(parama, paramau));
      paramau.append(":");
      paramau.append((String)localObject2);
    }
  }
  
  public final void q(View paramView, int paramInt)
  {
    GMTrace.i(17828677681152L, 132834);
    Object localObject = paramView.getTag();
    if (!(localObject instanceof ep))
    {
      GMTrace.o(17828677681152L, 132834);
      return;
    }
    w.i("MicroMsg.ChattingItemAppMsgWxaDynamicTo", "onWidgetStateChanged(%s, state : %d)", new Object[] { Integer.valueOf(paramView.hashCode()), Integer.valueOf(paramInt) });
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
      GMTrace.o(17828677681152L, 132834);
      return;
    case 0: 
      paramView.iEW.setVisibility(0);
      paramView.iEW.cju();
      paramView.wHD.setVisibility(4);
      paramView.wHB.setVisibility(4);
      GMTrace.o(17828677681152L, 132834);
      return;
    case 1: 
      paramView.iEW.ZI();
      paramView.iEW.setVisibility(4);
      paramView.wHD.setVisibility(4);
      paramView.wHB.setVisibility(0);
      paramView.wHB.setImageResource(R.k.cLZ);
      GMTrace.o(17828677681152L, 132834);
      return;
    }
    paramView.iEW.ZI();
    paramView.iEW.setVisibility(4);
    paramView.wHD.setVisibility(0);
    paramView.wHB.setVisibility(4);
    GMTrace.o(17828677681152L, 132834);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */