package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.cf.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.h;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.pluginsdk.model.e;
import com.tencent.mm.pluginsdk.model.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.x.k;
import com.tencent.mm.x.l;
import com.tencent.mm.y.u.b;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.TimeZone;

final class bg
  extends ah.b
{
  public static final int wwt;
  public static final int wwu;
  private En_5b8fbb1e.a wvE;
  private int wwx;
  
  static
  {
    GMTrace.i(2189762232320L, 16315);
    wwt = com.tencent.mm.br.a.ef(ab.getContext()) - (int)(com.tencent.mm.br.a.getDensity(ab.getContext()) * 60.0F);
    wwu = (int)com.tencent.mm.br.a.getDensity(ab.getContext()) * 180;
    GMTrace.o(2189762232320L, 16315);
  }
  
  public bg()
  {
    super(65);
    GMTrace.i(2188822708224L, 16308);
    this.wwx = 0;
    GMTrace.o(2188822708224L, 16308);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2188956925952L, 16309);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.crY);
      paramLayoutInflater = new m(this.jHw);
      paramLayoutInflater.jRw = ((TextView)((View)localObject).findViewById(R.h.boA));
      paramLayoutInflater.qej = ((View)localObject).findViewById(R.h.bnk);
      paramLayoutInflater.lCA = ((CheckBox)((View)localObject).findViewById(R.h.bnd));
      paramLayoutInflater.npf = ((View)localObject).findViewById(R.h.bnX);
      paramLayoutInflater.odf = ((ImageView)((View)localObject).findViewById(R.h.bsp));
      paramLayoutInflater.ikm = ((TextView)((View)localObject).findViewById(R.h.title));
      paramLayoutInflater.kHx = ((TextView)((View)localObject).findViewById(R.h.cho));
      ((View)localObject).setTag(paramLayoutInflater);
    }
    GMTrace.o(2188956925952L, 16309);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2189225361408L, 16311);
    this.wvE = parama1;
    m localm = (m)parama;
    k localk = ((com.tencent.mm.plugin.biz.a.a)h.h(com.tencent.mm.plugin.biz.a.a.class)).tA(paramau.field_content);
    parama = localk.glr;
    if (parama.size() == 0)
    {
      localm.qej.setVisibility(8);
      GMTrace.o(2189225361408L, 16311);
      return;
    }
    localm.qej.setVisibility(0);
    l locall = (l)parama.get(0);
    if (!t.nm(locall.glx))
    {
      localm.odf.setVisibility(0);
      paramString = locall.glx;
      ImageView localImageView = localm.odf;
      int i = paramau.field_type;
      parama = paramString;
      if (com.tencent.mm.ao.p.Jh()) {
        parama = com.tencent.mm.ao.p.ko(paramString);
      }
      paramString = n.Jd();
      c.a locala = new c.a();
      locala.gKV = R.e.aOj;
      locala.gKC = true;
      locala = locala.aP(wwt, wwu);
      locala.gKs = new bf.b();
      locala.gKE = s.s(parama, i, "@T");
      paramString.b(parama, localImageView, locala.Jn(), new bf.a());
      localm.ikm.setText(locall.title);
      parama = parama1.Wl(locall.url);
      if (TextUtils.isEmpty(parama)) {
        break label468;
      }
      w.d("MicroMsg.ChattingItemBizVideoFrom", "productId:%s", new Object[] { parama });
      parama = new dr(paramau, false, paramInt, locall.url, 8, false, parama1.cel(), localk.eTo, localk.eTp, locall.title, parama, null, false, false);
      label328:
      paramInt = locall.glB;
      if ((paramInt > 0) && (paramInt < 86400L)) {
        break label510;
      }
      paramString = null;
      if (TextUtils.isEmpty(paramString)) {
        break label573;
      }
      localm.kHx.setVisibility(0);
      localm.kHx.setText(paramString);
    }
    for (;;)
    {
      parama.rFn = paramau.field_msgSvrId;
      parama.rFo = 0;
      localm.qej.setTag(parama);
      localm.qej.setOnClickListener(parama1.wvd.wyW);
      localm.qej.setOnLongClickListener(parama1.wvd.wyY);
      localm.qej.setOnTouchListener(parama1.wvd.wza);
      GMTrace.o(2189225361408L, 16311);
      return;
      localm.odf.setVisibility(8);
      break;
      label468:
      parama = new dr(paramau, false, paramInt, locall.url, 6, false, parama1.cel(), localk.eTo, localk.eTp, locall.title);
      break label328;
      label510:
      if (paramInt < 3600L) {}
      for (paramString = "mm:ss";; paramString = "HH:mm:ss")
      {
        paramString = new SimpleDateFormat(paramString);
        paramString.setTimeZone(TimeZone.getTimeZone("GMT+0:00"));
        paramString = paramString.format(Long.valueOf(paramInt * 1000L));
        break;
      }
      label573:
      localm.kHx.setVisibility(8);
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2189359579136L, 16312);
    dr localdr = (dr)paramView.getTag();
    if (localdr == null)
    {
      GMTrace.o(2189359579136L, 16312);
      return false;
    }
    this.wwx = localdr.rFo;
    int i = localdr.position;
    if ((!this.wvE.ceh()) && (!aa.aq(paramau))) {
      paramContextMenu.add(i, 111, 0, paramView.getContext().getString(R.l.dSi));
    }
    if (d.LL("favorite")) {
      paramContextMenu.add(i, 125, 0, paramView.getContext().getString(R.l.dNH));
    }
    GMTrace.o(2189359579136L, 16312);
    return true;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2189493796864L, 16313);
    switch (paramMenuItem.getItemId())
    {
    }
    for (;;)
    {
      GMTrace.o(2189493796864L, 16313);
      return false;
      Object localObject1 = bf.a(paramau, parama.vKB.vKW, this.wwx);
      if (!t.nm((String)localObject1))
      {
        paramMenuItem = new Intent(parama.vKB.vKW, MsgRetransmitUI.class);
        paramMenuItem.putExtra("Retr_Msg_content", (String)localObject1);
        paramMenuItem.putExtra("Retr_Msg_Type", 2);
        paramMenuItem.putExtra("Retr_Biz_Msg_Selected_Msg_Index", this.wwx);
        paramMenuItem.putExtra("Retr_Msg_Id", paramau.field_msgId);
        localObject1 = paramau.field_talker;
        Object localObject2 = com.tencent.mm.y.u.gy(paramau.field_msgSvrId);
        paramMenuItem.putExtra("reportSessionId", (String)localObject2);
        localObject2 = com.tencent.mm.y.u.Av().p((String)localObject2, true);
        ((u.b)localObject2).o("prePublishId", "msg_" + paramau.field_msgSvrId);
        ((u.b)localObject2).o("preUsername", localObject1);
        ((u.b)localObject2).o("preChatName", localObject1);
        ((u.b)localObject2).o("preMsgIndex", Integer.valueOf(this.wwx));
        ((u.b)localObject2).o("sendAppMsgScene", Integer.valueOf(1));
        parama.startActivity(paramMenuItem);
        continue;
        paramMenuItem = bf.a(paramau, parama.vKB.vKW, 0);
        if (!t.nm(paramMenuItem))
        {
          ef.c(paramau, paramMenuItem, parama.vKB.vKW);
          continue;
          localObject1 = paramau.field_talker;
          paramMenuItem = com.tencent.mm.y.u.gy(paramau.field_msgSvrId);
          localObject2 = com.tencent.mm.y.u.Av().p(paramMenuItem, true);
          ((u.b)localObject2).o("prePublishId", "msg_" + paramau.field_msgSvrId);
          ((u.b)localObject2).o("preUsername", localObject1);
          ((u.b)localObject2).o("preChatName", localObject1);
          ((u.b)localObject2).o("preMsgIndex", Integer.valueOf(this.wwx));
          ((u.b)localObject2).o("sendAppMsgScene", Integer.valueOf(1));
          localObject1 = new cf();
          ((cf)localObject1).eDv.eDz = this.wwx;
          ((cf)localObject1).eDv.eDA = paramMenuItem;
          ((cf)localObject1).eDv.nK = parama;
          ((cf)localObject1).eDv.eDC = 40;
          e.a((cf)localObject1, paramau);
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
          if (((cf)localObject1).eDw.ret == 0) {
            com.tencent.mm.modelstat.b.gWv.t(paramau);
          }
        }
      }
    }
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2189628014592L, 16314);
    GMTrace.o(2189628014592L, 16314);
    return false;
  }
  
  protected final boolean ccr()
  {
    GMTrace.i(2189091143680L, 16310);
    GMTrace.o(2189091143680L, 16310);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */