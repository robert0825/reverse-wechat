package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelstat.b;
import com.tencent.mm.modelvoice.n;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.a.a.a;
import com.tencent.mm.ui.base.AnimImageView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.chatting.b.w;
import com.tencent.mm.ui.u;
import com.tencent.mm.ui.widget.MMTextView;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.s;

public final class cg
{
  static final class a
    extends ah.b
  {
    private SpannableStringBuilder tvp;
    private CharacterStyle tvs;
    private int tvv;
    private En_5b8fbb1e.a wvE;
    
    public a()
    {
      super();
      GMTrace.i(19045227167744L, 141898);
      this.tvv = 3;
      this.tvp = new SpannableStringBuilder();
      this.tvs = new ForegroundColorSpan(-5066062);
      GMTrace.o(19045227167744L, 141898);
    }
    
    public final View a(LayoutInflater paramLayoutInflater, View paramView)
    {
      GMTrace.i(19045361385472L, 141899);
      Object localObject;
      if ((paramView != null) && (paramView.getTag() != null))
      {
        localObject = paramView;
        if (((ah.a)paramView.getTag()).type == this.jHw) {}
      }
      else
      {
        localObject = new bj(paramLayoutInflater, R.i.csy);
        ((View)localObject).setTag(new cg.c(this.jHw).t((View)localObject, true));
      }
      GMTrace.o(19045361385472L, 141899);
      return (View)localObject;
    }
    
    public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
    {
      GMTrace.i(19045629820928L, 141901);
      this.wvE = parama1;
      parama = (cg.c)parama;
      parama.wyj.vYP = true;
      boolean bool = parama1.wqK;
      parama.wyk.vYP = true;
      bool = parama1.wqK;
      a(parama1.wvd, paramau.field_msgId);
      cg.c.a(parama, paramau, paramInt, parama1, true);
      if (paramau.bTW())
      {
        paramString = parama1.wCj.v(paramau.field_msgId, paramau.field_imgPath);
        if (!bg.nm(paramString))
        {
          parama.wyn.setText(paramString);
          parama.wyi.setMinWidth(com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 80));
          parama.wyk.setMinWidth(com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 80));
          parama.wyn.setMinWidth(com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 80));
          parama.wyi.setMaxWidth(com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 204));
          parama.wyk.setMaxWidth(com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 204));
          parama.wyn.setMaxWidth(com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 204));
          parama.wyn.setVisibility(0);
          parama.wyo.setVisibility(8);
          label246:
          paramString = new n(paramau.field_content);
          if (paramString.time != 0L) {
            break label759;
          }
          parama.wsh.setVisibility(8);
        }
      }
      for (;;)
      {
        paramau = paramau.fwt;
        if ((paramau != null) && (paramau.length() != 0)) {
          break label950;
        }
        parama.wsb.setVisibility(8);
        GMTrace.o(19045629820928L, 141901);
        return;
        paramau.dM(paramau.fwu & 0xFFFFFFBF);
        parama.wyp.setVisibility(0);
        parama.wyl.setVisibility(8);
        break label246;
        if (!parama1.wCj.ff(paramau.field_msgId)) {
          break;
        }
        paramString = parama1.wCj.v(paramau.field_msgId, paramau.field_imgPath);
        Object localObject = parama1.wCj.fe(paramau.field_msgId);
        SpannableStringBuilder localSpannableStringBuilder;
        if (!bg.nm(paramString)) {
          if (localObject == cg.c.a.wyz)
          {
            this.tvp.clear();
            localObject = parama.wyn;
            localSpannableStringBuilder = this.tvp;
            if ((localSpannableStringBuilder == null) || (paramString == null) || (paramString.length() == 0))
            {
              ((MMTextView)localObject).setText(localSpannableStringBuilder);
              label458:
              parama.wyn.setVisibility(0);
              parama.wyl.setVisibility(0);
              parama.wyp.setVisibility(8);
              parama.wyo.setVisibility(8);
            }
          }
        }
        for (;;)
        {
          parama.wyi.setMinWidth(com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 80));
          parama.wyk.setMinWidth(com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 80));
          parama.wyn.setMinWidth(com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 80));
          parama.wyi.setMaxWidth(com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 204));
          parama.wyk.setMaxWidth(com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 204));
          parama.wyn.setMaxWidth(com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 204));
          break;
          if (paramString.length() < this.tvv) {
            i = paramString.length();
          }
          for (paramInt = 0;; paramInt = i - this.tvv)
          {
            localSpannableStringBuilder.append(paramString).setSpan(this.tvs, paramInt, i, 33);
            break;
            i = paramString.length();
          }
          parama.wyn.setText(paramString);
          break label458;
          if (localObject != cg.c.a.wyx)
          {
            parama.wyl.setVisibility(0);
            parama.wyp.setVisibility(8);
            parama.wyn.setVisibility(8);
            parama.wyo.setVisibility(0);
          }
          else
          {
            parama.wyp.setVisibility(0);
            parama.wyl.setVisibility(8);
            parama.wyo.setVisibility(8);
          }
        }
        label759:
        if (((parama1.wvd.wyS != null) && (parama1.wvd.wyS.wta == paramau.field_msgId)) || (q.B(paramau)))
        {
          paramInt = 1;
          label798:
          localObject = parama.wsh;
          if (paramInt == 0) {
            break label877;
          }
        }
        label877:
        for (int i = 8;; i = 0)
        {
          ((ImageView)localObject).setVisibility(i);
          i = (int)q.aD(paramString.time);
          if (paramInt != 0) {
            break label883;
          }
          parama.wyh.setContentDescription(String.format(parama1.vKB.vKW.getString(R.l.egL), new Object[] { Integer.valueOf(i) }));
          break;
          paramInt = 0;
          break label798;
        }
        label883:
        paramString = a.a.vOX;
        localObject = parama.wyh;
        parama1.fs(parama1.wvd.eDs);
        paramString.F((View)localObject, i);
        paramString = a.a.vOX;
        localObject = parama.wyi;
        parama1.fs(parama1.wvd.eDs);
        paramString.F((View)localObject, i);
      }
      label950:
      parama.wsb.setVisibility(0);
      b(parama1, parama.wsb, dr.Wm(paramau));
      GMTrace.o(19045629820928L, 141901);
    }
    
    public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
    {
      GMTrace.i(19045764038656L, 141902);
      at.AR();
      int m;
      int i;
      label183:
      label232:
      int k;
      if (c.isSDCardAvailable())
      {
        m = ((dr)paramView.getTag()).position;
        if (((new n(paramau.field_content).time != 0L) || (paramau.field_isSend != 0)) && ((paramau.field_status != 1) || (paramau.field_isSend != 1)))
        {
          at.AR();
          Boolean localBoolean = (Boolean)c.xh().get(26, null);
          Object localObject = localBoolean;
          if (localBoolean == null) {
            localObject = Boolean.valueOf(false);
          }
          if (!((Boolean)localObject).booleanValue()) {
            break label433;
          }
          paramContextMenu.add(m, 120, 0, R.l.dew);
          at.AR();
          localObject = c.yK().TE(paramau.field_talker);
          if ((s.fP(paramau.field_talker)) || (s.gm(paramau.field_talker)) || (localObject == null) || (((com.tencent.mm.storage.x)localObject).bSA())) {
            break label451;
          }
          i = 1;
          if (d.LL("favorite")) {
            paramContextMenu.add(m, 116, 0, paramView.getContext().getString(R.l.dNH));
          }
          if (i != 0)
          {
            if (com.tencent.mm.af.x.FG().fQ(2) <= 0) {
              break label457;
            }
            i = 1;
            if ((i != 0) && (!this.wvE.ceh())) {
              paramContextMenu.add(m, 114, 0, paramView.getContext().getString(R.l.dfZ));
            }
          }
          k = 0;
          if (!paramau.bTW()) {
            break label471;
          }
          if (bg.nm(this.wvE.wCj.v(paramau.field_msgId, paramau.field_imgPath))) {
            break label463;
          }
          i = R.l.dgr;
        }
      }
      for (;;)
      {
        int j = k;
        if (s.fD(paramau.field_talker))
        {
          j = k;
          if (v.bPG())
          {
            j = k;
            if (i != -1)
            {
              paramContextMenu.add(m, 121, 0, i);
              j = 1;
            }
          }
        }
        if (!this.wvE.ceh()) {
          paramContextMenu.add(m, 100, 0, paramView.getContext().getString(R.l.dgf));
        }
        if ((j == 0) && (v.bPG()) && (i != -1)) {
          paramContextMenu.add(m, 121, 0, i);
        }
        GMTrace.o(19045764038656L, 141902);
        return true;
        label433:
        paramContextMenu.add(m, 119, 0, R.l.dev);
        break;
        label451:
        i = 0;
        break label183;
        label457:
        i = 0;
        break label232;
        label463:
        i = R.l.dgt;
        continue;
        label471:
        if (this.wvE.wCj.ff(paramau.field_msgId)) {
          i = R.l.dgp;
        } else {
          i = R.l.dgt;
        }
      }
    }
    
    public final boolean a(MenuItem paramMenuItem, final En_5b8fbb1e.a parama, final au paramau)
    {
      GMTrace.i(19045898256384L, 141903);
      switch (paramMenuItem.getItemId())
      {
      default: 
        GMTrace.o(19045898256384L, 141903);
        return false;
      case 119: 
        parama.wte.mi(true);
        GMTrace.o(19045898256384L, 141903);
        return true;
      case 120: 
        parama.wte.mi(false);
        GMTrace.o(19045898256384L, 141903);
        return true;
      }
      paramMenuItem = parama.wCj;
      if (com.tencent.mm.ui.chatting.b.t.ceL()) {
        h.a(parama.vKB.vKW, parama.vKB.vKW.getString(R.l.ehj), "", new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19043348119552L, 141884);
            paramAnonymousDialogInterface = parama.wCj;
            com.tencent.mm.ui.chatting.b.t.ceM();
            parama.wCj.aU(paramau);
            GMTrace.o(19043348119552L, 141884);
          }
        });
      }
      for (;;)
      {
        b.gWv.w(paramau);
        GMTrace.o(19045898256384L, 141903);
        return true;
        parama.wCj.aU(paramau);
      }
    }
    
    public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
    {
      GMTrace.i(19046032474112L, 141904);
      GMTrace.o(19046032474112L, 141904);
      return false;
    }
    
    protected final boolean a(En_5b8fbb1e.a parama)
    {
      GMTrace.i(19045495603200L, 141900);
      boolean bool = parama.wqK;
      GMTrace.o(19045495603200L, 141900);
      return bool;
    }
  }
  
  static final class b
    extends ah.c
  {
    private SpannableStringBuilder tvp;
    private CharacterStyle tvs;
    private int tvv;
    private En_5b8fbb1e.a wvE;
    
    public b()
    {
      super();
      GMTrace.i(19070862753792L, 142089);
      this.tvv = 3;
      this.tvp = new SpannableStringBuilder();
      this.tvs = new ForegroundColorSpan(-5066062);
      GMTrace.o(19070862753792L, 142089);
    }
    
    public final View a(LayoutInflater paramLayoutInflater, View paramView)
    {
      GMTrace.i(19070996971520L, 142090);
      Object localObject;
      if ((paramView != null) && (paramView.getTag() != null))
      {
        localObject = paramView;
        if (((ah.a)paramView.getTag()).type == this.jHw) {}
      }
      else
      {
        localObject = new bj(paramLayoutInflater, R.i.ctb);
        ((View)localObject).setTag(new cg.c(this.jHw).t((View)localObject, false));
      }
      GMTrace.o(19070996971520L, 142090);
      return (View)localObject;
    }
    
    public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
    {
      GMTrace.i(19071131189248L, 142091);
      this.wvE = parama1;
      parama = (cg.c)parama;
      parama.wyj.vYP = false;
      boolean bool = parama1.wqK;
      parama.wyk.vYP = false;
      bool = parama1.wqK;
      a(parama1.wvd, paramau.field_msgId);
      cg.c.a(parama, paramau, paramInt, parama1, false);
      if (paramau.bTW())
      {
        paramString = parama1.wCj.v(paramau.field_msgId, paramau.field_imgPath);
        if (!bg.nm(paramString))
        {
          parama.wyn.setText(paramString);
          parama.wyi.setMinWidth(com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 80));
          parama.wyk.setMinWidth(com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 80));
          parama.wyn.setMinWidth(com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 80));
          parama.wyi.setMaxWidth(com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 204));
          parama.wyk.setMaxWidth(com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 204));
          parama.wyn.setMaxWidth(com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 204));
          parama.wyn.setVisibility(0);
          parama.wyo.setVisibility(8);
          label246:
          if (!ccs()) {
            break label853;
          }
          if (parama.wyu != null) {
            parama.wyu.setVisibility(8);
          }
          if (parama.wrV != null) {
            parama.wrV.setVisibility(8);
          }
          if ((paramau.field_status != 1) && (paramau.field_status != 5)) {
            break label766;
          }
          parama.wyv.setBackgroundResource(R.g.aVL);
          paramau.vBn = true;
        }
      }
      for (;;)
      {
        a(paramInt, parama, paramau, parama1.wvd.gtf, parama1.wqK, parama1.wvd.wyW);
        GMTrace.o(19071131189248L, 142091);
        return;
        parama.wyp.setVisibility(0);
        parama.wyl.setVisibility(8);
        break label246;
        if (!parama1.wCj.ff(paramau.field_msgId)) {
          break;
        }
        paramString = parama1.wCj.v(paramau.field_msgId, paramau.field_imgPath);
        Object localObject = parama1.wCj.fe(paramau.field_msgId);
        parama.wyi.setMinWidth(com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 80));
        parama.wyk.setMinWidth(com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 80));
        parama.wyn.setMinWidth(com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 80));
        parama.wyi.setMaxWidth(com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 204));
        parama.wyk.setMaxWidth(com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 204));
        parama.wyn.setMaxWidth(com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 204));
        if (!bg.nm(paramString))
        {
          SpannableStringBuilder localSpannableStringBuilder;
          if (localObject == cg.c.a.wyz)
          {
            this.tvp.clear();
            localObject = parama.wyn;
            localSpannableStringBuilder = this.tvp;
            if ((localSpannableStringBuilder == null) || (paramString == null) || (paramString.length() == 0)) {
              ((MMTextView)localObject).setText(localSpannableStringBuilder);
            }
          }
          for (;;)
          {
            parama.wyn.setVisibility(0);
            parama.wyl.setVisibility(0);
            parama.wyp.setVisibility(8);
            break;
            int j;
            if (paramString.length() < this.tvv) {
              j = paramString.length();
            }
            for (int i = 0;; i = j - this.tvv)
            {
              localSpannableStringBuilder.append(paramString).setSpan(this.tvs, i, j, 33);
              break;
              j = paramString.length();
            }
            parama.wyn.setText(paramString);
          }
        }
        if (localObject != cg.c.a.wyx)
        {
          parama.wyl.setVisibility(0);
          parama.wyp.setVisibility(8);
          parama.wyo.setVisibility(0);
          parama.wyn.setVisibility(8);
          break label246;
        }
        parama.wyp.setVisibility(0);
        parama.wyl.setVisibility(8);
        break;
        label766:
        parama.wyv.setBackgroundResource(R.g.aVK);
        if ((parama.wrV != null) && (a(parama1.wvd, paramau.field_msgId)))
        {
          if (paramau.vBn)
          {
            paramString = new AlphaAnimation(0.5F, 1.0F);
            paramString.setDuration(300L);
            parama.wyv.startAnimation(paramString);
            paramau.vBn = false;
          }
          parama.wrV.setVisibility(0);
          continue;
          label853:
          if (parama.wyu != null)
          {
            parama.wyu.setVisibility(0);
            if (paramau.field_status >= 2) {
              parama.wyu.setVisibility(8);
            }
          }
        }
      }
    }
    
    public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
    {
      GMTrace.i(19071265406976L, 142092);
      at.AR();
      int m;
      n localn;
      int k;
      int i;
      if (c.isSDCardAvailable())
      {
        m = ((dr)paramView.getTag()).position;
        localn = new n(paramau.field_content);
        if (((localn.time != 0L) || (paramau.field_isSend != 0)) && ((paramau.field_status != 1) || (paramau.field_isSend != 1)))
        {
          if (!this.wvE.wte.jrl) {
            break label432;
          }
          paramContextMenu.add(m, 120, 0, R.l.dew);
        }
        if (paramau.field_status == 5) {
          paramContextMenu.add(m, 103, 0, paramView.getContext().getString(R.l.dhc));
        }
        if (d.LL("favorite")) {
          paramContextMenu.add(m, 116, 0, paramView.getContext().getString(R.l.dNH));
        }
        if ((!paramau.bTs()) && (paramau.bTu()) && ((paramau.field_status == 2) || (paramau.fwz == 1)) && (av(paramau)) && (VU(paramau.field_talker))) {
          paramContextMenu.add(m, 123, 0, paramView.getContext().getString(R.l.dgl));
        }
        k = 0;
        if (!paramau.bTW()) {
          break label458;
        }
        if (bg.nm(this.wvE.wCj.v(paramau.field_msgId, paramau.field_imgPath))) {
          break label450;
        }
        i = R.l.dgr;
      }
      for (;;)
      {
        int j = k;
        if (s.fD(paramau.field_talker))
        {
          j = k;
          if (v.bPG())
          {
            j = k;
            if (i != -1)
            {
              paramContextMenu.add(m, 121, 0, i);
              j = 1;
            }
          }
        }
        if (((localn.time != 0L) || (paramau.field_isSend != 0)) && ((paramau.field_status != 1) || (paramau.field_isSend != 1)) && (!this.wvE.ceh())) {
          paramContextMenu.add(m, 100, 0, paramView.getContext().getString(R.l.dgf));
        }
        if ((j == 0) && (v.bPG()) && (i != -1)) {
          paramContextMenu.add(m, 121, 0, i);
        }
        GMTrace.o(19071265406976L, 142092);
        return true;
        label432:
        paramContextMenu.add(m, 119, 0, R.l.dev);
        break;
        label450:
        i = R.l.dgt;
        continue;
        label458:
        if (this.wvE.wCj.ff(paramau.field_msgId)) {
          i = R.l.dgp;
        } else {
          i = R.l.dgt;
        }
      }
    }
    
    public final boolean a(MenuItem paramMenuItem, final En_5b8fbb1e.a parama, final au paramau)
    {
      GMTrace.i(19071399624704L, 142093);
      switch (paramMenuItem.getItemId())
      {
      default: 
        GMTrace.o(19071399624704L, 142093);
        return false;
      case 119: 
        parama.wte.mi(true);
        GMTrace.o(19071399624704L, 142093);
        return true;
      case 120: 
        parama.wte.mi(false);
        GMTrace.o(19071399624704L, 142093);
        return true;
      }
      paramMenuItem = parama.wCj;
      if (com.tencent.mm.ui.chatting.b.t.ceL()) {
        h.a(parama.vKB.vKW, parama.vKB.vKW.getString(R.l.ehj), "", new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19066165133312L, 142054);
            paramAnonymousDialogInterface = parama.wCj;
            com.tencent.mm.ui.chatting.b.t.ceM();
            parama.wCj.aU(paramau);
            GMTrace.o(19066165133312L, 142054);
          }
        });
      }
      for (;;)
      {
        b.gWv.w(paramau);
        GMTrace.o(19071399624704L, 142093);
        return true;
        parama.wCj.aU(paramau);
      }
    }
    
    public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
    {
      GMTrace.i(19071533842432L, 142094);
      GMTrace.o(19071533842432L, 142094);
      return false;
    }
  }
  
  public static final class c
    extends ah.a
  {
    ImageView wrV;
    TextView wsb;
    TextView wxX;
    TextView wyg;
    TextView wyh;
    TextView wyi;
    AnimImageView wyj;
    AnimImageView wyk;
    LinearLayout wyl;
    LinearLayout wym;
    MMTextView wyn;
    ProgressBar wyo;
    FrameLayout wyp;
    FrameLayout wyq;
    FrameLayout wyr;
    ImageView wys;
    AnimImageView wyt;
    ProgressBar wyu;
    TextView wyv;
    Animation wyw;
    
    public c(int paramInt)
    {
      super();
      GMTrace.i(19094887727104L, 142268);
      GMTrace.o(19094887727104L, 142268);
    }
    
    private static void a(c paramc, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
    {
      GMTrace.i(19095424598016L, 142272);
      paramc.wsh.setVisibility(paramInt2);
      paramc.wxX.setVisibility(paramInt2);
      if (paramBoolean1)
      {
        paramc.wyt.setVisibility(paramInt1);
        paramc.wsb.setVisibility(paramInt2);
      }
      while (paramInt2 == 0) {
        if (paramBoolean2)
        {
          paramc.wyp.setVisibility(8);
          paramc.wyl.setVisibility(0);
          paramc.wyo.setVisibility(0);
          GMTrace.o(19095424598016L, 142272);
          return;
          paramc.wyv.setVisibility(paramInt1);
        }
        else
        {
          paramc.wyp.setVisibility(0);
          paramc.wyl.setVisibility(8);
          paramc.wyo.setVisibility(8);
          GMTrace.o(19095424598016L, 142272);
          return;
        }
      }
      paramc.wyp.setVisibility(8);
      paramc.wyl.setVisibility(8);
      paramc.wyo.setVisibility(8);
      GMTrace.o(19095424598016L, 142272);
    }
    
    public static void a(c paramc, au paramau, int paramInt, En_5b8fbb1e.a parama, boolean paramBoolean)
    {
      GMTrace.i(19095156162560L, 142270);
      if (paramc == null)
      {
        GMTrace.o(19095156162560L, 142270);
        return;
      }
      Object localObject = new n(paramau.field_content);
      float f2 = q.aD(((n)localObject).time);
      float f1;
      if ((parama.wvd.wyS != null) && (paramau.field_msgId == parama.wvd.wyS.wta))
      {
        paramc.wyj.setVisibility(0);
        paramc.wyk.setVisibility(0);
        paramc.wyj.bZq();
        paramc.wyk.bZq();
        f1 = f2;
        if (paramau.field_isSend == 0)
        {
          if (((n)localObject).time != 0L) {
            break label709;
          }
          a(paramc, 8, 0, true, paramau.bTW());
          paramc.wyt.bbd();
          paramc.wyt.setVisibility(8);
          paramc.wsh.setVisibility(8);
          f1 = 0.0F;
          paramc.wyh.setWidth(com.tencent.mm.br.a.fromDPToPix(parama.vKB.vKW, ln(0)));
          paramc.wxX.setText(parama.getString(R.l.dxn, new Object[] { Integer.valueOf(0) }));
          paramc.wyj.setWidth(com.tencent.mm.br.a.fromDPToPix(parama.vKB.vKW, ln(0)));
        }
        label230:
        f2 = f1;
        if (1 != paramau.field_isSend) {
          break label1198;
        }
        if (paramau.field_status != 1) {
          break label913;
        }
        a(paramc, 0, 8, false, paramau.bTW());
        paramc.wyr.setVisibility(8);
        paramc.ccw();
        label275:
        if (parama.wvd.ocR != null)
        {
          paramc.wxX.setTextColor(parama.wvd.ocR.tsW);
          if (!parama.wvd.ocR.tsX) {
            break label1205;
          }
          paramc.wxX.setShadowLayer(2.0F, 1.2F, 1.2F, parama.wvd.ocR.tsY);
          label337:
          if (!parama.wvd.ocR.tsZ) {
            break label1219;
          }
          paramc.wxX.setBackgroundResource(R.g.aVJ);
        }
        label360:
        localObject = new dr(paramau, parama.wqK, paramInt, null, 0, (byte)0);
        paramc.wyh.setTag(localObject);
        paramc.wyi.setTag(localObject);
        paramc.wyh.setOnClickListener(parama.wvd.wyW);
        paramc.wyi.setOnClickListener(parama.wvd.wyW);
        paramc.wyh.setOnLongClickListener(parama.wvd.wyY);
        paramc.wyh.setOnTouchListener(parama.wvd.wza);
        paramc.wyi.setOnLongClickListener(parama.wvd.wyY);
        paramc.wyi.setOnTouchListener(parama.wvd.wza);
        paramc.wyn.setTag(localObject);
        paramc.wyn.setOnClickListener(null);
        paramc.wyn.xrM = parama.wvd.wzc;
        paramc.wyn.setOnLongClickListener(parama.wvd.wyY);
        paramc.wyn.setOnTouchListener(parama.wvd.wza);
        if ((paramau.fwu & 0x1) != 1) {
          break label1263;
        }
        paramc.wyg.setVisibility(0);
        if (paramau.field_isSend != 0) {
          break label1230;
        }
        paramc.wyj.setBackgroundResource(R.g.aVA);
        paramc.wyk.setBackgroundResource(R.g.aVA);
        label584:
        if (!paramBoolean) {
          break label1315;
        }
      }
      label709:
      label913:
      label1198:
      label1205:
      label1219:
      label1230:
      label1263:
      label1315:
      for (paramau = parama.wvd.eDs;; paramau = parama.wvd.gtf)
      {
        localObject = a.a.vOX;
        TextView localTextView = paramc.wyh;
        paramInt = (int)f1;
        parama.fs(paramau);
        ((com.tencent.mm.ui.a.a)localObject).F(localTextView, paramInt);
        localObject = a.a.vOX;
        localTextView = paramc.wyi;
        paramInt = (int)f1;
        parama.fs(paramau);
        ((com.tencent.mm.ui.a.a)localObject).F(localTextView, paramInt);
        paramc.wxX.setContentDescription(" ");
        GMTrace.o(19095156162560L, 142270);
        return;
        paramc.wyk.setVisibility(8);
        paramc.wyj.setVisibility(8);
        paramc.wyj.bbd();
        paramc.wyk.bbd();
        break;
        if (((n)localObject).time == -1L)
        {
          a(paramc, 8, 0, true, paramau.bTW());
          paramc.wyt.bbd();
          paramc.wyt.setVisibility(8);
          paramc.wyh.setWidth(80);
          paramc.wxX.setVisibility(8);
          paramc.wyj.setWidth(com.tencent.mm.br.a.fromDPToPix(parama.vKB.vKW, ln((int)f2)));
          f1 = f2;
          break label230;
        }
        a(paramc, 8, 0, true, paramau.bTW());
        paramc.wyt.bbd();
        paramc.wyt.setVisibility(8);
        paramc.wxX.setVisibility(0);
        paramc.wyh.setWidth(com.tencent.mm.br.a.fromDPToPix(parama.vKB.vKW, ln((int)f2)));
        paramc.wxX.setText(parama.getString(R.l.dxn, new Object[] { Integer.valueOf((int)f2) }));
        paramc.wyj.setWidth(com.tencent.mm.br.a.fromDPToPix(parama.vKB.vKW, ln((int)f2)));
        f1 = f2;
        break label230;
        if (((n)localObject).time == -1L)
        {
          a(paramc, 8, 0, false, paramau.bTW());
          paramc.wyh.setWidth(80);
          paramc.wxX.setVisibility(8);
          paramc.wyr.setVisibility(8);
          paramc.wyj.setWidth(com.tencent.mm.br.a.fromDPToPix(parama.vKB.vKW, ln((int)f1)));
          paramc.ccw();
          break label275;
        }
        if (paramau.field_status == 7)
        {
          a(paramc, 8, 8, false, paramau.bTW());
          paramc.wxX.setVisibility(8);
          paramc.wyr.setVisibility(0);
          paramc.ccw();
          if (paramc.wys != null)
          {
            paramc.wyw = AnimationUtils.loadAnimation(paramc.lFh.getContext(), R.a.aMi);
            paramc.wys.startAnimation(paramc.wyw);
          }
          break label275;
        }
        a(paramc, 8, 0, false, paramau.bTW());
        paramc.wyr.setVisibility(8);
        paramc.wxX.setVisibility(0);
        paramc.ccw();
        if (((n)localObject).time == 0L) {
          f1 = 0.0F;
        }
        paramc.wyh.setWidth(com.tencent.mm.br.a.fromDPToPix(parama.vKB.vKW, ln((int)f1)));
        paramc.wxX.setText(parama.getString(R.l.dxn, new Object[] { Integer.valueOf((int)f1) }));
        paramc.wyj.setWidth(com.tencent.mm.br.a.fromDPToPix(parama.vKB.vKW, ln((int)f1)));
        f2 = f1;
        f1 = f2;
        break label275;
        paramc.wxX.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
        break label337;
        paramc.wxX.setBackgroundColor(0);
        break label360;
        paramc.wyv.setBackgroundResource(R.g.aVM);
        paramc.wyj.setBackgroundResource(R.g.aVM);
        paramc.wyk.setBackgroundResource(R.g.aVM);
        break label584;
        paramc.wyg.setVisibility(8);
        if (paramau.field_isSend == 0)
        {
          paramc.wyj.setBackgroundResource(R.g.aVu);
          break label584;
        }
        paramc.wyv.setBackgroundResource(R.g.aVK);
        paramc.wyj.setBackgroundResource(R.g.aVK);
        break label584;
      }
    }
    
    private void ccw()
    {
      GMTrace.i(19095290380288L, 142271);
      if (this.wyw != null)
      {
        this.wyw.cancel();
        this.wyw = null;
      }
      GMTrace.o(19095290380288L, 142271);
    }
    
    private static int ln(int paramInt)
    {
      GMTrace.i(19095558815744L, 142273);
      if (paramInt <= 2)
      {
        GMTrace.o(19095558815744L, 142273);
        return 80;
      }
      if (paramInt < 10)
      {
        GMTrace.o(19095558815744L, 142273);
        return (paramInt - 2) * 9 + 80;
      }
      if (paramInt < 60)
      {
        paramInt /= 10;
        GMTrace.o(19095558815744L, 142273);
        return (paramInt + 7) * 9 + 80;
      }
      GMTrace.o(19095558815744L, 142273);
      return 204;
    }
    
    public final ah.a t(View paramView, boolean paramBoolean)
    {
      GMTrace.i(19095021944832L, 142269);
      super.dq(paramView);
      this.jRw = ((TextView)paramView.findViewById(R.h.boA));
      this.oGJ = ((TextView)paramView.findViewById(R.h.boF));
      this.wyh = ((TextView)paramView.findViewById(R.h.boN));
      this.wyi = ((TextView)paramView.findViewById(R.h.boO));
      this.lCA = ((CheckBox)paramView.findViewById(R.h.bnd));
      this.npf = paramView.findViewById(R.h.bnX);
      this.wsh = ((ImageView)paramView.findViewById(R.h.bow));
      this.wxX = ((TextView)paramView.findViewById(R.h.bni));
      this.wyp = ((FrameLayout)paramView.findViewById(R.h.boP));
      this.wyq = ((FrameLayout)paramView.findViewById(R.h.boQ));
      this.wyl = ((LinearLayout)paramView.findViewById(R.h.boR));
      this.wym = ((LinearLayout)paramView.findViewById(R.h.boS));
      this.wyn = ((MMTextView)paramView.findViewById(R.h.boT));
      this.wyo = ((ProgressBar)paramView.findViewById(R.h.boU));
      this.wyg = ((TextView)paramView.findViewById(R.h.boL));
      this.wyj = ((AnimImageView)paramView.findViewById(R.h.boJ));
      this.wyk = ((AnimImageView)paramView.findViewById(R.h.boK));
      this.wyj.setType(1);
      this.wyk.setType(2);
      if (paramBoolean)
      {
        this.type = 6;
        this.wyj.vYP = true;
        this.wyk.vYP = true;
        this.wsb = ((TextView)paramView.findViewById(R.h.bmy));
        this.wyt = ((AnimImageView)paramView.findViewById(R.h.boM));
        this.wyt.vYP = true;
        this.wyt.setType(0);
      }
      for (;;)
      {
        GMTrace.o(19095021944832L, 142269);
        return this;
        this.wyr = ((FrameLayout)paramView.findViewById(R.h.boV));
        this.wys = ((ImageView)paramView.findViewById(R.h.boW));
        this.wyu = ((ProgressBar)paramView.findViewById(R.h.boX));
        this.nWt = ((ProgressBar)paramView.findViewById(R.h.cjy));
        this.wyv = ((TextView)paramView.findViewById(R.h.boY));
        this.wyj.vYP = false;
        this.wyk.vYP = false;
        this.type = 7;
        this.wrV = ((ImageView)paramView.findViewById(R.h.boy));
      }
    }
    
    public static enum a
    {
      static
      {
        GMTrace.i(19048582610944L, 141923);
        wyx = new a("NoTransform", 0);
        wyy = new a("PreTransform", 1);
        wyz = new a("Transforming", 2);
        wyA = new a("Transformed", 3);
        wyB = new a[] { wyx, wyy, wyz, wyA };
        GMTrace.o(19048582610944L, 141923);
      }
      
      private a()
      {
        GMTrace.i(19048448393216L, 141922);
        GMTrace.o(19048448393216L, 141922);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\cg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */