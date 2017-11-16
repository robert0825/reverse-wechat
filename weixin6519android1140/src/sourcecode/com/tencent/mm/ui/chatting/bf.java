package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.cf.b;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.pluginsdk.model.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.x.f.a;
import com.tencent.mm.x.k;
import com.tencent.mm.x.l;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.u.b;
import java.io.InputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class bf
  extends ah.b
{
  public static final int wwt;
  public static final int wwu;
  public static final int wwv;
  private int oda;
  private int odb;
  public En_5b8fbb1e.a wvE;
  private boolean www;
  private int wwx;
  private long wwy;
  private boolean wwz;
  
  static
  {
    GMTrace.i(2259287015424L, 16833);
    wwt = com.tencent.mm.br.a.ef(ab.getContext()) - (int)(com.tencent.mm.br.a.getDensity(ab.getContext()) * 60.0F);
    wwu = (int)com.tencent.mm.br.a.getDensity(ab.getContext()) * 167;
    wwv = (int)com.tencent.mm.br.a.getDensity(ab.getContext()) * 50;
    GMTrace.o(2259287015424L, 16833);
  }
  
  public bf()
  {
    super(26);
    GMTrace.i(2257944838144L, 16823);
    this.www = false;
    this.oda = 0;
    this.odb = 0;
    this.wwx = 0;
    this.wwy = 0L;
    this.wwz = false;
    GMTrace.o(2257944838144L, 16823);
  }
  
  protected static String a(au paramau, Context paramContext, int paramInt)
  {
    GMTrace.i(2259018579968L, 16831);
    if (paramContext == null)
    {
      w.w("MicroMsg.ChattingItemBizFrom", "getReaderAppMsgContent: context is null");
      GMTrace.o(2259018579968L, 16831);
      return null;
    }
    if (paramau == null)
    {
      w.w("MicroMsg.ChattingItemBizFrom", "getReaderAppMsgContent: msg is null");
      GMTrace.o(2259018579968L, 16831);
      return null;
    }
    at.AR();
    if (!c.isSDCardAvailable())
    {
      com.tencent.mm.ui.base.u.fo(paramContext);
      GMTrace.o(2259018579968L, 16831);
      return null;
    }
    try
    {
      paramContext = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.biz.a.a.class)).tA(paramau.field_content);
      Object localObject = paramContext.glr;
      if ((localObject != null) && (((List)localObject).size() > 0) && (paramInt < ((List)localObject).size()))
      {
        l locall = (l)((List)localObject).get(paramInt);
        localObject = new f.a();
        ((f.a)localObject).title = locall.title;
        ((f.a)localObject).description = locall.glz;
        ((f.a)localObject).action = "view";
        ((f.a)localObject).type = 5;
        ((f.a)localObject).url = locall.url;
        ((f.a)localObject).eTo = paramContext.eTo;
        ((f.a)localObject).eTp = paramContext.eTp;
        ((f.a)localObject).fwt = paramContext.fwt;
        ((f.a)localObject).thumburl = locall.glx;
        if (com.tencent.mm.platformtools.t.nm(((f.a)localObject).thumburl))
        {
          paramau = com.tencent.mm.ac.n.Di().ig(paramau.field_talker);
          if (paramau != null) {
            ((f.a)localObject).thumburl = paramau.Do();
          }
        }
        paramau = f.a.a((f.a)localObject, null, null);
        GMTrace.o(2259018579968L, 16831);
        return paramau;
      }
    }
    catch (Exception paramau)
    {
      w.printErrStackTrace("MicroMsg.ChattingItemBizFrom", paramau, "", new Object[0]);
      w.e("MicroMsg.ChattingItemBizFrom", "retransmit app msg error : %s", new Object[] { paramau.getLocalizedMessage() });
      GMTrace.o(2259018579968L, 16831);
    }
    return null;
  }
  
  private void a(dr paramdr, l paraml, au paramau)
  {
    GMTrace.i(2258750144512L, 16829);
    Bundle localBundle = new Bundle();
    int i;
    switch (com.tencent.mm.y.t.H(a(this.wvE, paramau), this.wvE.cci()))
    {
    case 3: 
    case 4: 
    case 5: 
    default: 
      i = 0;
    }
    for (;;)
    {
      localBundle.putString("share_report_pre_msg_url", paraml.url);
      localBundle.putString("share_report_pre_msg_title", paraml.title);
      localBundle.putString("share_report_pre_msg_desc", paraml.glz);
      localBundle.putString("share_report_pre_msg_icon_url", paraml.glx);
      localBundle.putString("share_report_pre_msg_appid", "");
      localBundle.putInt("share_report_from_scene", i);
      if (i == 5) {
        localBundle.putString("share_report_biz_username", this.wvE.cci());
      }
      paramdr.wFC = localBundle;
      GMTrace.o(2258750144512L, 16829);
      return;
      i = 2;
      continue;
      i = 3;
      continue;
      i = 5;
    }
  }
  
  private void a(final l paraml, View paramView)
  {
    GMTrace.i(19183874080768L, 142931);
    if ((paramView == null) || (paraml == null))
    {
      GMTrace.o(19183874080768L, 142931);
      return;
    }
    paramView.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(19187497959424L, 142958);
        paramAnonymousView = (dr)paramAnonymousView.getTag();
        w.i("MicroMsg.ChattingItemBizFrom", "on app brand(%s) button1 click", new Object[] { paraml.glC });
        qi localqi = new qi();
        localqi.eUY.userName = paraml.glC;
        localqi.eUY.eVa = paraml.glD;
        localqi.eUY.eVb = paraml.glF;
        localqi.eUY.eVc = paraml.glE;
        localqi.eUY.eVe = true;
        localqi.eUY.scene = 1076;
        localqi.eUY.eAv = (bf.this.wvE.cci() + ":" + paramAnonymousView.eRz.field_msgSvrId + ":" + paramAnonymousView.rFo);
        com.tencent.mm.sdk.b.a.vgX.m(localqi);
        GMTrace.o(19187497959424L, 142958);
      }
    });
    GMTrace.o(19183874080768L, 142931);
  }
  
  private void fu(Context paramContext)
  {
    GMTrace.i(2258213273600L, 16825);
    this.oda = paramContext.getResources().getDimensionPixelSize(R.f.aQN);
    this.odb = paramContext.getResources().getDimensionPixelSize(R.f.aPT);
    GMTrace.o(2258213273600L, 16825);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2258079055872L, 16824);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csa);
      paramView = new r(this.jHw);
      paramView.jRw = ((TextView)((View)localObject).findViewById(R.h.boA));
      paramView.wvz = ((View)localObject).findViewById(R.h.bnH);
      paramView.wtq = ((LinearLayout)((View)localObject).findViewById(R.h.bnk));
      paramView.wtr.odd = ((View)localObject).findViewById(R.h.chY);
      paramView.wtr.ikm = ((TextView)paramView.wtr.odd.findViewById(R.h.title));
      paramView.wtr.lWz = ((TextView)paramView.wtr.odd.findViewById(R.h.time));
      paramView.wtr.odf = ((ImageView)paramView.wtr.odd.findViewById(R.h.bsp));
      paramView.wtr.wts = paramView.wtr.odd.findViewById(R.h.bss);
      paramView.wtr.wtt = ((TextView)paramView.wtr.odd.findViewById(R.h.chS));
      paramView.wtr.odz = ((TextView)paramView.wtr.odd.findViewById(R.h.buu));
      paramView.wtr.wtu = ((TextView)paramView.wtq.findViewById(R.h.btA));
      paramView.wtr.lho = ((ProgressBar)((View)localObject).findViewById(R.h.bIR));
      paramView.wtr.odh = ((View)localObject).findViewById(R.h.buV);
      paramView.lCA = ((CheckBox)((View)localObject).findViewById(R.h.bnd));
      paramView.npf = ((View)localObject).findViewById(R.h.bnX);
      paramView.wsb = ((TextView)((View)localObject).findViewById(R.h.bmy));
      paramView.wsr = ((ChattingItemFooter)((View)localObject).findViewById(R.h.bAZ));
      ((View)localObject).setTag(paramView);
    }
    fu(paramLayoutInflater.getContext());
    GMTrace.o(2258079055872L, 16824);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2258481709056L, 16827);
    this.wvE = parama1;
    fu(parama1.vKB.vKW);
    r localr = (r)parama;
    parama = localr.odp.iterator();
    if (parama.hasNext())
    {
      paramString = (q)parama.next();
      if (localr.odp.indexOf(paramString) != localr.odp.size() - 1) {
        em.J(paramString.odd, 1);
      }
      for (;;)
      {
        localr.wtq.removeView(paramString.odd);
        break;
        em.J(paramString.odd, 2);
      }
    }
    localr.odp.clear();
    k localk = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.biz.a.a.class)).tA(paramau.field_content);
    parama = localk.fwt;
    if ((parama == null) || (parama.length() == 0)) {
      localr.wsb.setVisibility(8);
    }
    LinkedList localLinkedList;
    int k;
    for (;;)
    {
      localLinkedList = localk.glr;
      k = localLinkedList.size();
      if (k != 0) {
        break;
      }
      localr.wtq.setVisibility(8);
      localr.wtr.odd.setVisibility(8);
      GMTrace.o(2258481709056L, 16827);
      return;
      localr.wsb.setVisibility(0);
      b(parama1, localr.wsb, dr.Wm(parama));
    }
    localr.wtq.setVisibility(0);
    localr.wtr.odd.setVisibility(0);
    boolean bool = localr.wsr.b(localk.gir, paramau.field_talker, true);
    Object localObject1 = parama1.bWQ().getLayoutInflater();
    int i = localr.odp.size() + 2;
    while (i < k)
    {
      paramString = em.CT(1);
      parama = paramString;
      if (paramString == null) {
        parama = ((LayoutInflater)localObject1).inflate(R.i.csb, null);
      }
      localr.dp(parama);
      i += 1;
    }
    if (k > 1)
    {
      if (bool)
      {
        paramString = em.CT(1);
        parama = paramString;
        if (paramString == null) {
          parama = ((LayoutInflater)localObject1).inflate(R.i.csb, null);
        }
        localr.dp(parama);
      }
      for (;;)
      {
        localr.wtr.odd.setBackgroundResource(R.g.aZq);
        localr.wtr.odd.setPadding(this.odb, this.odb, this.odb, this.oda);
        this.www = true;
        i = 0;
        while (i < localr.odp.size())
        {
          ((q)localr.odp.get(i)).odd.setVisibility(8);
          i += 1;
        }
        paramString = em.CT(2);
        parama = paramString;
        if (paramString == null) {
          parama = ((LayoutInflater)localObject1).inflate(R.i.csc, null);
        }
        localr.dp(parama);
      }
    }
    if (bool)
    {
      localr.wtr.odd.setBackgroundResource(R.g.aZq);
      localr.wtr.odd.setPadding(this.odb, this.odb, this.odb, this.oda);
    }
    for (;;)
    {
      this.www = false;
      break;
      localr.wtr.odd.setBackgroundResource(R.g.aZs);
      localr.wtr.odd.setPadding(this.odb, this.odb, this.odb, 0);
    }
    int j = 0;
    if (j < k)
    {
      localObject1 = (l)localLinkedList.get(j);
      label689:
      label714:
      label739:
      label763:
      Object localObject2;
      Object localObject3;
      if (j == 0)
      {
        parama = localr.wtr.wtu;
        if (k > 1)
        {
          i = 8;
          parama.setVisibility(i);
          parama = localr.wtr.ikm;
          if (k <= 1) {
            break label1333;
          }
          i = 8;
          parama.setVisibility(i);
          parama = localr.wtr.lWz;
          if (k <= 1) {
            break label1339;
          }
          i = 8;
          parama.setVisibility(i);
          parama = localr.wtr.wtt;
          if (k <= 1) {
            break label1345;
          }
          i = 0;
          parama.setVisibility(i);
          localr.wtr.lho.setVisibility(8);
          localr.wtr.odh.setVisibility(8);
          if (com.tencent.mm.platformtools.t.nm(((l)localObject1).glx)) {
            break label1358;
          }
          localr.wtr.wts.setVisibility(0);
          localr.wtr.odf.setVisibility(0);
          paramString = ((l)localObject1).glx;
          localObject2 = localr.wtr.odf;
          i = paramau.field_type;
          parama = paramString;
          if (com.tencent.mm.ao.p.Jh()) {
            parama = com.tencent.mm.ao.p.ko(paramString);
          }
          paramString = com.tencent.mm.ao.n.Jd();
          localObject3 = new c.a();
          ((c.a)localObject3).gKV = R.e.aOj;
          ((c.a)localObject3).gKC = true;
          localObject3 = ((c.a)localObject3).aP(wwt, wwu);
          ((c.a)localObject3).gKs = new b();
          ((c.a)localObject3).gKE = s.s(parama, i, "@T");
          paramString.b(parama, (ImageView)localObject2, ((c.a)localObject3).Jn(), new a());
          parama = localr.wtr.odz;
          if ((k <= 1) && (!com.tencent.mm.platformtools.t.nm(((l)localObject1).glz))) {
            break label1352;
          }
          i = 8;
          label986:
          parama.setVisibility(i);
          parama = localr.wtr.odz;
          i = this.odb;
          label1007:
          parama.setPadding(0, i, 0, 0);
          localr.wtr.odz.setText(((l)localObject1).glz);
          localr.wtr.ikm.setText(((l)localObject1).title);
          localr.wtr.lWz.setText(com.tencent.mm.pluginsdk.i.n.ac(parama1.getString(R.l.dwA), ((l)localObject1).time));
          localr.wtr.wtt.setText(((l)localObject1).title);
          localr.wtr.wtt.setContentDescription(((l)localObject1).title);
          if ((((l)localObject1).glA != 0) && (((l)localObject1).glA != 1)) {
            localr.wtr.wtt.setVisibility(4);
          }
          parama = parama1.Wl(((l)localObject1).url);
          if (TextUtils.isEmpty(parama)) {
            break label1475;
          }
          w.d("MicroMsg.ChattingItemBizFrom", "productId:%s", new Object[] { parama });
          parama = new dr(paramau, false, paramInt, ((l)localObject1).url, 8, this.www, parama1.cel(), localk.eTo, localk.eTp, ((l)localObject1).title, parama, null, false, true);
          label1214:
          parama.rFn = paramau.field_msgSvrId;
          parama.rFo = 0;
          localr.wtr.odd.setTag(parama);
          if (!com.tencent.mm.x.h.eU(((l)localObject1).glC)) {
            break label1529;
          }
          a((l)localObject1, localr.wtr.odd);
        }
        for (;;)
        {
          localr.wtr.odd.setOnLongClickListener(parama1.wvd.wyY);
          localr.wtr.odd.setOnTouchListener(parama1.wvd.wza);
          j += 1;
          break;
          if (com.tencent.mm.platformtools.t.nm(((l)localObject1).url))
          {
            i = 4;
            break label689;
          }
          i = 0;
          break label689;
          label1333:
          i = 0;
          break label714;
          label1339:
          i = 0;
          break label739;
          label1345:
          i = 8;
          break label763;
          label1352:
          i = 0;
          break label986;
          label1358:
          localr.wtr.wts.setVisibility(8);
          localr.wtr.odf.setVisibility(8);
          localr.wtr.wtt.setVisibility(8);
          localr.wtr.ikm.setVisibility(0);
          parama = localr.wtr.odz;
          if (com.tencent.mm.platformtools.t.nm(((l)localObject1).glz)) {}
          for (i = 8;; i = 0)
          {
            parama.setVisibility(i);
            parama = localr.wtr.odz;
            if (k <= 1) {
              break label1469;
            }
            i = this.oda;
            break;
          }
          label1469:
          i = 0;
          break label1007;
          label1475:
          parama = new dr(paramau, false, paramInt, ((l)localObject1).url, 6, this.www, parama1.cel(), localk.eTo, localk.eTp, ((l)localObject1).title);
          a(parama, (l)localObject1, paramau);
          break label1214;
          label1529:
          localr.wtr.odd.setOnClickListener(parama1.wvd.wyW);
        }
      }
      paramString = (q)localr.odp.get(j - 1);
      paramString.ikm.setText(((l)localObject1).title);
      paramString.lho.setVisibility(8);
      paramString.odh.setVisibility(8);
      paramString.ikm.setTextColor(parama1.getResources().getColor(R.e.black));
      if (!com.tencent.mm.platformtools.t.nm(((l)localObject1).glx))
      {
        paramString.odf.setVisibility(0);
        parama = ((l)localObject1).glx;
        if (com.tencent.mm.ao.p.Jh()) {
          parama = com.tencent.mm.ao.p.ko(((l)localObject1).glx);
        }
        localObject2 = com.tencent.mm.ao.n.Jd();
        localObject3 = paramString.odf;
        c.a locala = new c.a();
        locala.gKE = s.s(parama, paramau.field_type, "@S");
        locala.gKC = true;
        locala.gKs = new b();
        locala.gKV = R.e.aOj;
        ((com.tencent.mm.ao.a.a)localObject2).a(parama, (ImageView)localObject3, locala.aP(wwv, wwv).Jn(), new a());
        if ((((l)localObject1).glA == 0) || (((l)localObject1).glA == 1))
        {
          paramString.ode.setVisibility(0);
          label1780:
          if ((!com.tencent.mm.platformtools.t.nm(((l)localObject1).glz)) && (((l)localObject1).type == 3))
          {
            paramString.wtp.setText(((l)localObject1).glz);
            paramString.wtp.setVisibility(0);
          }
          paramString.odd.setVisibility(0);
          parama = parama1.Wl(((l)localObject1).url);
          if (TextUtils.isEmpty(parama)) {
            break label2033;
          }
          w.d("MicroMsg.ChattingItemBizFrom", "productId:%s", new Object[] { parama });
          parama = new dr(paramau, false, paramInt, ((l)localObject1).url, 8, this.www, parama1.cel(), localk.eTo, localk.eTp, ((l)localObject1).title, parama, null, false, true);
          label1910:
          parama.rFn = paramau.field_msgSvrId;
          parama.rFo = j;
          paramString.odd.setTag(parama);
          if (!com.tencent.mm.x.h.eU(((l)localObject1).glC)) {
            break label2082;
          }
          a((l)localObject1, paramString.odd);
        }
      }
      for (;;)
      {
        paramString.odd.setOnLongClickListener(parama1.wvd.wyY);
        paramString.odd.setOnTouchListener(parama1.wvd.wza);
        break;
        paramString.ode.setVisibility(8);
        paramString.ikm.setTextColor(parama1.getResources().getColor(R.e.aOa));
        break label1780;
        paramString.ode.setVisibility(8);
        break label1780;
        label2033:
        parama = new dr(paramau, false, paramInt, ((l)localObject1).url, 6, this.www, parama1.cel(), localk.eTo, localk.eTp);
        a(parama, (l)localObject1, paramau);
        break label1910;
        label2082:
        paramString.odd.setOnClickListener(parama1.wvd.wyW);
      }
    }
    GMTrace.o(2258481709056L, 16827);
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2258615926784L, 16828);
    Object localObject = (dr)paramView.getTag();
    if (localObject == null)
    {
      GMTrace.o(2258615926784L, 16828);
      return false;
    }
    this.wwx = ((dr)localObject).rFo;
    int i = ((dr)localObject).position;
    localObject = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.biz.a.a.class)).tA(paramau.field_content);
    if (localObject == null)
    {
      w.w("MicroMsg.ChattingItemBizFrom", "onCreateContextMenu reader is null");
      GMTrace.o(2258615926784L, 16828);
      return false;
    }
    this.wwz = false;
    if ((this.wwx >= 0) && (this.wwx < ((k)localObject).glr.size()) && (com.tencent.mm.x.h.eU(((l)((k)localObject).glr.get(this.wwx)).glC))) {
      this.wwz = true;
    }
    if ((!this.wvE.ceh()) && (!aa.aq(paramau))) {
      paramContextMenu.add(i, 111, 0, paramView.getContext().getString(R.l.dSi));
    }
    if ((com.tencent.mm.bj.d.LL("favorite")) && (!this.wwz)) {
      paramContextMenu.add(i, 125, 0, paramView.getContext().getString(R.l.dNH));
    }
    GMTrace.o(2258615926784L, 16828);
    return true;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2258884362240L, 16830);
    this.wwy = com.tencent.mm.platformtools.t.Pu();
    switch (paramMenuItem.getItemId())
    {
    }
    label1052:
    label1219:
    for (;;)
    {
      GMTrace.o(2258884362240L, 16830);
      return false;
      Object localObject2;
      if (this.wwz)
      {
        if (!this.wwz) {
          w.w("MicroMsg.ChattingItemBizFrom", "transmitAppBrandMsg not AppBrandMsg!");
        }
        for (;;)
        {
          GMTrace.o(2258884362240L, 16830);
          return false;
          paramMenuItem = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.biz.a.a.class)).tA(paramau.field_content);
          if (paramMenuItem == null)
          {
            w.w("MicroMsg.ChattingItemBizFrom", "transmitAppBrandMsg reader is null");
          }
          else if ((this.wwx >= 0) && (this.wwx < paramMenuItem.glr.size()))
          {
            paramMenuItem = (l)paramMenuItem.glr.get(this.wwx);
            localObject1 = f.a.a(ac.a(paramau.field_talker, paramMenuItem), null, null);
            if (!com.tencent.mm.platformtools.t.nm((String)localObject1))
            {
              localObject2 = new HashMap();
              ((HashMap)localObject2).put("desc", paramMenuItem.glz);
              ((HashMap)localObject2).put("type", Integer.valueOf(2));
              ((HashMap)localObject2).put("title", paramMenuItem.title);
              ((HashMap)localObject2).put("app_id", paramMenuItem.glG);
              ((HashMap)localObject2).put("pkg_type", Integer.valueOf(paramMenuItem.glF));
              ((HashMap)localObject2).put("pkg_version", Integer.valueOf(paramMenuItem.glE));
              ((HashMap)localObject2).put("img_url", paramMenuItem.glH);
              ((HashMap)localObject2).put("is_dynamic", Boolean.valueOf(false));
              ((HashMap)localObject2).put("cache_key", "");
              ((HashMap)localObject2).put("path", paramMenuItem.glD);
              paramMenuItem = new Intent(parama.vKB.vKW, MsgRetransmitUI.class);
              paramMenuItem.putExtra("appbrand_params", (Serializable)localObject2);
              paramMenuItem.putExtra("Retr_Msg_content", (String)localObject1);
              paramMenuItem.putExtra("Retr_Msg_Type", 2);
              paramMenuItem.putExtra("Retr_Biz_Msg_Selected_Msg_Index", this.wwx);
              paramMenuItem.putExtra("Retr_Msg_Id", paramau.field_msgId);
              paramMenuItem.putExtra("Retr_MsgFromScene", 3);
              localObject1 = paramau.field_talker;
              localObject2 = com.tencent.mm.y.u.gy(paramau.field_msgSvrId);
              paramMenuItem.putExtra("reportSessionId", (String)localObject2);
              localObject2 = com.tencent.mm.y.u.Av().p((String)localObject2, true);
              ((u.b)localObject2).o("prePublishId", "msg_" + paramau.field_msgSvrId);
              ((u.b)localObject2).o("preUsername", localObject1);
              ((u.b)localObject2).o("preChatName", localObject1);
              ((u.b)localObject2).o("preMsgIndex", Integer.valueOf(this.wwx));
              ((u.b)localObject2).o("sendAppMsgScene", Integer.valueOf(1));
              parama.startActivity(paramMenuItem);
            }
          }
        }
      }
      Object localObject1 = a(paramau, parama.vKB.vKW, this.wwx);
      if (!com.tencent.mm.platformtools.t.nm((String)localObject1))
      {
        paramMenuItem = new Intent(parama.vKB.vKW, MsgRetransmitUI.class);
        paramMenuItem.putExtra("Retr_Msg_content", (String)localObject1);
        paramMenuItem.putExtra("Retr_Msg_Type", 2);
        paramMenuItem.putExtra("Retr_Biz_Msg_Selected_Msg_Index", this.wwx);
        paramMenuItem.putExtra("Retr_Msg_Id", paramau.field_msgId);
        paramMenuItem.putExtra("Retr_MsgFromScene", 1);
        localObject1 = paramau.field_talker;
        localObject2 = com.tencent.mm.y.u.gy(paramau.field_msgSvrId);
        paramMenuItem.putExtra("reportSessionId", (String)localObject2);
        localObject2 = com.tencent.mm.y.u.Av().p((String)localObject2, true);
        ((u.b)localObject2).o("prePublishId", "msg_" + paramau.field_msgSvrId);
        ((u.b)localObject2).o("preUsername", localObject1);
        ((u.b)localObject2).o("preChatName", localObject1);
        ((u.b)localObject2).o("preMsgIndex", Integer.valueOf(this.wwx));
        ((u.b)localObject2).o("sendAppMsgScene", Integer.valueOf(1));
        parama.startActivity(paramMenuItem);
        continue;
        paramMenuItem = a(paramau, parama.vKB.vKW, 0);
        if (!com.tencent.mm.platformtools.t.nm(paramMenuItem))
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
          com.tencent.mm.pluginsdk.model.e.a((cf)localObject1, paramau);
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
          if (((cf)localObject1).eDw.ret == 0)
          {
            parama = f.a.eS(a(paramau, parama.vKB.vKW, this.wwx));
            int i;
            if (paramau.aCp())
            {
              paramMenuItem = com.tencent.mm.modelstat.b.gWv;
              if (parama != null)
              {
                i = parama.type;
                paramMenuItem.c(paramau, i);
              }
            }
            for (;;)
            {
              if ((parama == null) || (parama.type != 5) || (parama.url == null)) {
                break label1219;
              }
              w.d("MicroMsg.ChattingItemBizFrom", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), parama.url, Long.valueOf(this.wwy), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(1) });
              paramMenuItem = "";
              try
              {
                parama = URLEncoder.encode(parama.url, "UTF-8");
                paramMenuItem = parama;
              }
              catch (UnsupportedEncodingException parama)
              {
                for (;;)
                {
                  w.printErrStackTrace("MicroMsg.ChattingItemBizFrom", parama, "", new Object[0]);
                }
              }
              com.tencent.mm.plugin.report.service.g.ork.i(13378, new Object[] { paramMenuItem, Long.valueOf(this.wwy), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(1) });
              break;
              i = 0;
              break label1052;
              com.tencent.mm.modelstat.b.gWv.t(paramau);
            }
          }
        }
      }
    }
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2259152797696L, 16832);
    GMTrace.o(2259152797696L, 16832);
    return false;
  }
  
  protected final boolean ccr()
  {
    GMTrace.i(2258347491328L, 16826);
    GMTrace.o(2258347491328L, 16826);
    return false;
  }
  
  public static final class a
    implements com.tencent.mm.ao.a.c.g
  {
    public a()
    {
      GMTrace.i(2267340079104L, 16893);
      GMTrace.o(2267340079104L, 16893);
    }
    
    public final void a(String paramString, View paramView, com.tencent.mm.ao.a.d.b paramb)
    {
      GMTrace.i(2267608514560L, 16895);
      if (paramb.eDj != 2)
      {
        GMTrace.o(2267608514560L, 16895);
        return;
      }
      w.d("MicroMsg.ChattingItemBizFrom", "onImageLoadFinish, url:%s, contentType: %s", new Object[] { paramString, paramb.eYU });
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (com.tencent.mm.ao.p.Jh())
      {
        bool1 = bool2;
        if (!bg.nm(paramb.eYU))
        {
          bool1 = bool2;
          if (com.tencent.mm.ao.p.kp(paramString))
          {
            bool1 = bool2;
            if (paramb.eYU.equals("image/webp")) {
              bool1 = true;
            }
          }
        }
      }
      int i = paramb.status;
      w.d("MicroMsg.ChattingItemBizFrom", "onImageLoadFinish, isDownloadWebp: %b, status: %d", new Object[] { Boolean.valueOf(bool1), Integer.valueOf(i) });
      switch (i)
      {
      }
      for (;;)
      {
        GMTrace.o(2267608514560L, 16895);
        return;
        if (bool1)
        {
          com.tencent.mm.plugin.report.service.g.ork.a(86L, 13L, 1L, false);
          GMTrace.o(2267608514560L, 16895);
          return;
          com.tencent.mm.plugin.report.service.g.ork.a(86L, 2L, 1L, false);
          if (bool1)
          {
            com.tencent.mm.plugin.report.service.g.ork.a(86L, 15L, 1L, false);
            GMTrace.o(2267608514560L, 16895);
            return;
            if (bool1) {
              com.tencent.mm.plugin.report.service.g.ork.a(86L, 14L, 1L, false);
            }
          }
        }
      }
    }
    
    public final void ku(String paramString)
    {
      GMTrace.i(2267474296832L, 16894);
      w.d("MicroMsg.ChattingItemBizFrom", "onImageLoadStart, url: %s", new Object[] { paramString });
      com.tencent.mm.plugin.report.service.g.ork.a(86L, 0L, 1L, false);
      GMTrace.o(2267474296832L, 16894);
    }
  }
  
  public static final class b
    implements com.tencent.mm.ao.a.c.b
  {
    public b()
    {
      GMTrace.i(2241570275328L, 16701);
      GMTrace.o(2241570275328L, 16701);
    }
    
    public final com.tencent.mm.ao.a.d.b ks(String paramString)
    {
      GMTrace.i(2241704493056L, 16702);
      w.d("MicroMsg.ChattingBizImgDownloader", "get image data from url:%s", new Object[] { paramString });
      label318:
      for (;;)
      {
        try
        {
          long l1 = System.currentTimeMillis();
          Object localObject2 = (HttpURLConnection)new URL(paramString).openConnection();
          ((HttpURLConnection)localObject2).setConnectTimeout(15000);
          ((HttpURLConnection)localObject2).setReadTimeout(20000);
          if (com.tencent.mm.ao.p.kp(paramString)) {
            ((HttpURLConnection)localObject2).setRequestProperty("Referer", com.tencent.mm.ao.p.gA(com.tencent.mm.protocal.d.tJC));
          }
          Object localObject1;
          if (((HttpURLConnection)localObject2).getResponseCode() >= 300)
          {
            ((HttpURLConnection)localObject2).disconnect();
            w.w("MicroMsg.ChattingBizImgDownloader.HttpClientFactory", "httpURLConnectionGet 300");
            localObject1 = null;
            if (localObject1 != null)
            {
              long l2 = System.currentTimeMillis();
              if ((!com.tencent.mm.ao.p.Jh()) || (bg.nm(((com.tencent.mm.ao.a.d.b)localObject1).eYU)) || (!com.tencent.mm.ao.p.kp(paramString)) || (!((com.tencent.mm.ao.a.d.b)localObject1).eYU.equals("image/webp"))) {
                break label318;
              }
              bool = true;
              w.d("MicroMsg.ChattingBizImgDownloader", "getImageData, isDownloadWebp: %b", new Object[] { Boolean.valueOf(bool) });
              l1 = l2 - l1;
              w.d("MicroMsg.ChattingBizImgDownloader", "download used %d ms", new Object[] { Long.valueOf(l1) });
              com.tencent.mm.plugin.report.service.g.ork.a(86L, 4L, l1, false);
              if (bool) {
                com.tencent.mm.plugin.report.service.g.ork.a(86L, 17L, l1, false);
              }
            }
            GMTrace.o(2241704493056L, 16702);
            return (com.tencent.mm.ao.a.d.b)localObject1;
          }
          else
          {
            localObject1 = ((HttpURLConnection)localObject2).getInputStream();
            localObject2 = ((HttpURLConnection)localObject2).getContentType();
            localObject1 = new com.tencent.mm.ao.a.d.b(com.tencent.mm.ao.a.b.e.h((InputStream)localObject1), (String)localObject2, (byte)0);
            continue;
          }
          boolean bool = false;
        }
        catch (Exception paramString)
        {
          w.e("MicroMsg.ChattingBizImgDownloader", "get image data failed.:%s", new Object[] { paramString.toString() });
          paramString = new com.tencent.mm.ao.a.d.b(null, null, (byte)0);
          GMTrace.o(2241704493056L, 16702);
          return paramString;
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */