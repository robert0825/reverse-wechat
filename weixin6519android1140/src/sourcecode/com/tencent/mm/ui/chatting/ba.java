package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.g.a.dh;
import com.tencent.mm.g.a.dh.b;
import com.tencent.mm.g.a.hv;
import com.tencent.mm.g.a.le;
import com.tencent.mm.g.a.mn;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelappbrand.a.b.h;
import com.tencent.mm.modelappbrand.a.e;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams.a;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.tools.ShowImageUI;
import com.tencent.mm.x.f.a;
import com.tencent.mm.x.j;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.s;
import com.tencent.mm.y.t;

final class ba
  extends ah.c
{
  public En_5b8fbb1e.a wvE;
  private com.tencent.mm.ao.a.a.c wvN;
  
  public ba(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2518461448192L, 18764);
    c.a locala = new c.a();
    locala.gKR = R.k.cJu;
    locala.aP(com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 20), com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 20)).gKA = true;
    this.wvN = locala.Jn();
    GMTrace.o(2518461448192L, 18764);
  }
  
  private static void a(n paramn, cv paramcv, au paramau)
  {
    GMTrace.i(2518864101376L, 18767);
    if ((paramau.field_status == 2) && (a(paramcv, paramau.field_msgId)))
    {
      if (paramn.wrV != null)
      {
        paramn.wrV.setVisibility(0);
        GMTrace.o(2518864101376L, 18767);
      }
    }
    else if (paramn.wrV != null) {
      paramn.wrV.setVisibility(8);
    }
    GMTrace.o(2518864101376L, 18767);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2518595665920L, 18765);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null) && ((paramView.getTag() instanceof n)))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csL);
      ((View)localObject).setTag(new n(this.jHw).s((View)localObject, false));
    }
    GMTrace.o(2518595665920L, 18765);
    return (View)localObject;
  }
  
  public final void a(final ah.a parama, int paramInt, final En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2518729883648L, 18766);
    final n localn = (n)parama;
    this.wvE = parama1;
    parama1.wCp.aT(paramau);
    localn.reset();
    String str = paramau.field_content;
    parama1.wCp.aR(paramau);
    f.a locala;
    Object localObject2;
    if (str != null)
    {
      locala = f.a.C(str, paramau.field_reserved);
      localObject2 = j.eW(str);
    }
    for (;;)
    {
      paramString = new dr(paramau, parama1.wqK, paramInt, null, 0, (byte)0);
      final Object localObject1 = paramString;
      Object localObject3;
      boolean bool;
      label590:
      label604:
      label701:
      label734:
      int i;
      if (locala != null)
      {
        localObject3 = com.tencent.mm.pluginsdk.model.app.g.cB(locala.appId, locala.eVc);
        localn.hqH.setText(locala.title);
        localn.hqI.setText(locala.description);
        localn.lVH.setMaxLines(1);
        localn.hqH.setTextColor(parama1.vKB.vKW.getResources().getColor(R.e.aOE));
        localn.hqI.setTextColor(parama1.vKB.vKW.getResources().getColor(R.e.aOa));
        localn.wsz.setBackgroundResource(R.g.aVs);
        localn.wsz.setPadding(0, parama1.vKB.vKW.getResources().getDimensionPixelSize(R.f.aQw), 0, 0);
        localn.wrM.setVisibility(0);
        localn.wsx.setVisibility(0);
        localn.hqI.setVisibility(0);
        localn.wsB.setVisibility(8);
        localn.wsC.setVisibility(8);
        localn.wsp.setVisibility(8);
        localn.wso.setVisibility(8);
        localn.wsm.setVisibility(8);
        localn.wsk.setVisibility(8);
        localn.wsj.setVisibility(8);
        localn.wsL.setVisibility(8);
        localn.wsE.setVisibility(8);
        localn.wsz.setVisibility(0);
        n.I(localn.wsy, localn.wrJ);
        if ((localObject3 != null) && (((com.tencent.mm.pluginsdk.model.app.f)localObject3).field_appName != null) && (((com.tencent.mm.pluginsdk.model.app.f)localObject3).field_appName.trim().length() > 0)) {
          break label1199;
        }
        localObject1 = locala.appName;
        bool = true;
        com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 12);
        if ((locala.type == 20) || ("wxaf060266bfa9a35c".equals(locala.appId))) {
          bool = p.a.bIQ().bfi();
        }
        if ((!bool) || (locala.appId == null) || (locala.appId.length() <= 0) || (!com.tencent.mm.pluginsdk.model.app.g.bI((String)localObject1))) {
          break label1226;
        }
        localn.ljO.setText(com.tencent.mm.pluginsdk.model.app.g.a(parama1.vKB.vKW, (com.tencent.mm.pluginsdk.model.app.f)localObject3, (String)localObject1));
        localn.wsl.setVisibility(0);
        localn.ljO.setVisibility(0);
        localn.ljO.setCompoundDrawables(null, null, null, null);
        localn.wsi.setVisibility(0);
        if ((localObject3 == null) || (!((com.tencent.mm.pluginsdk.model.app.f)localObject3).bJs())) {
          break label1209;
        }
        a(parama1, localn.ljO, paramau, locala, ((com.tencent.mm.pluginsdk.model.app.f)localObject3).field_packageName, paramau.field_msgSvrId);
        a(parama1, localn.wsi, locala.appId);
        bool = false;
        localn.wrM.setVisibility(0);
        if (!this.tIv) {
          break label1391;
        }
        localObject3 = null;
        localObject1 = localObject3;
        if (locala.type != 33)
        {
          localObject1 = localObject3;
          if (locala.type != 36) {
            localObject1 = com.tencent.mm.ao.n.IZ().a(paramau.field_imgPath, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW), false);
          }
        }
        if ((localObject1 == null) || (((Bitmap)localObject1).isRecycled())) {
          break label1385;
        }
        localn.wrM.setImageBitmap((Bitmap)localObject1);
        if (locala.type == 3) {
          localn.wsz.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
          {
            public final boolean onPreDraw()
            {
              GMTrace.i(2273245659136L, 16937);
              localn.wsz.getViewTreeObserver().removeOnPreDrawListener(this);
              int i = com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 24);
              Bitmap localBitmap = localObject1;
              Object localObject;
              if (localBitmap != null)
              {
                localObject = localBitmap;
                if (!localBitmap.isRecycled()) {}
              }
              else
              {
                localObject = com.tencent.mm.sdk.platformtools.d.X(parama1.vKB.vKW.getResources().getColor(R.e.aNl), i, i);
              }
              int j = ((Bitmap)localObject).getHeight();
              if (i > j) {
                i = j;
              }
              for (;;)
              {
                localObject = com.tencent.mm.sdk.platformtools.d.c(com.tencent.mm.sdk.platformtools.d.R(Bitmap.createScaledBitmap((Bitmap)localObject, i, i, true)), 20);
                j = localn.wsz.getHeight();
                int k = localn.wsz.getWidth();
                i = j;
                if (j == 0) {
                  i = com.tencent.mm.br.a.V(parama1.vKB.vKW, R.f.aRI);
                }
                j = k;
                if (k == 0) {
                  j = com.tencent.mm.br.a.V(parama1.vKB.vKW, R.f.aRJ);
                }
                localObject = new BitmapDrawable(com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject, R.g.aVs, j, i));
                localn.wsz.setBackgroundDrawable((Drawable)localObject);
                GMTrace.o(2273245659136L, 16937);
                return true;
              }
            }
          });
        }
        localn.wsq.setOnClickListener(null);
        switch (locala.type)
        {
        case 1: 
        case 2: 
        case 8: 
        case 9: 
        case 11: 
        case 12: 
        case 14: 
        case 17: 
        case 18: 
        case 21: 
        case 22: 
        case 23: 
        case 28: 
        case 29: 
        case 30: 
        case 31: 
        case 32: 
        case 35: 
        case 37: 
        case 38: 
        case 39: 
        default: 
          parama = paramString;
          i = 1;
        }
      }
      for (;;)
      {
        label934:
        if (i != 0) {
          if ((locala.title != null) && (locala.title.length() > 0))
          {
            localn.lVH.setVisibility(0);
            localn.lVH.setMaxLines(2);
            localn.lVH.setText(locala.title);
            label989:
            localn.hqH.setVisibility(8);
            if (!bool) {
              break label6433;
            }
            if ((locala.type != 33) && (locala.type != 36)) {
              break label6329;
            }
            paramString = com.tencent.mm.ao.n.IZ().kf(paramau.field_imgPath);
            localn.wrM.setImageResource(R.k.cJr);
            com.tencent.mm.modelappbrand.a.b.CT().a(localn.wrM, "file://" + paramString, null, null, ((com.tencent.mm.modelappbrand.g)com.tencent.mm.kernel.h.h(com.tencent.mm.modelappbrand.g.class)).aM(50, 50));
            localObject1 = parama;
          }
        }
        for (;;)
        {
          localn.wsy.setTag(localObject1);
          localn.wsy.setOnClickListener(parama1.wvd.wyW);
          if (this.tIv)
          {
            localn.wsy.setOnLongClickListener(parama1.wvd.wyY);
            localn.wsy.setOnTouchListener(parama1.wvd.wza);
          }
          a(paramInt, localn, paramau, parama1.wvd.gtf, parama1.wqK, parama1.wvd.wyW);
          GMTrace.o(2518729883648L, 18766);
          return;
          label1199:
          localObject1 = ((com.tencent.mm.pluginsdk.model.app.f)localObject3).field_appName;
          break;
          label1209:
          a(parama1, localn.ljO, locala.appId);
          break label590;
          label1226:
          if (locala.type == 24)
          {
            localn.ljO.setText(ab.getContext().getString(R.l.dsQ));
            localn.wsl.setVisibility(0);
            localn.ljO.setVisibility(0);
            localn.wsi.setVisibility(8);
            break label604;
          }
          if ((locala.type == 19) || (((j)localObject2).glu == 19))
          {
            localn.ljO.setText(ab.getContext().getString(R.l.dfS));
            localn.wsl.setVisibility(0);
            localn.ljO.setVisibility(0);
            localn.wsi.setVisibility(8);
            break label604;
          }
          localn.wsl.setVisibility(8);
          localn.ljO.setVisibility(8);
          localn.wsi.setVisibility(8);
          break label604;
          label1385:
          bool = true;
          break label701;
          label1391:
          localn.wrM.setImageBitmap(BitmapFactory.decodeResource(parama1.getResources(), R.g.aYu));
          bool = false;
          break label734;
          if ((locala.title != null) && (locala.title.length() > 0))
          {
            localn.hqH.setVisibility(0);
            localn.hqH.setTextColor(parama1.vKB.vKW.getResources().getColor(R.e.white));
            label1467:
            localn.hqI.setVisibility(0);
            localn.hqI.setTextColor(parama1.vKB.vKW.getResources().getColor(R.e.white));
            localn.lVH.setVisibility(8);
            localn.wsm.setVisibility(4);
            localn.hqI.setMaxLines(2);
            localn.wsq.setVisibility(0);
            if (parama.wvC != paramau.field_msgId) {
              break label1713;
            }
            localn.wsq.setImageResource(R.g.aYe);
            label1561:
            parama = new cv.b();
            parama.eDr = paramau.field_msgId;
            parama.ePi = paramau.field_content;
            parama.eMk = paramau.field_imgPath;
            localn.wsq.setTag(parama);
            localn.wsq.setOnClickListener(parama1.wvd.wzg);
            if (bool)
            {
              parama = com.tencent.mm.pluginsdk.model.app.g.b(locala.appId, 1, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW));
              if ((parama != null) && (!parama.isRecycled())) {
                break label1727;
              }
              localn.wrM.setImageResource(R.k.cJd);
            }
          }
          for (;;)
          {
            if (!ccs()) {
              break label1739;
            }
            if (localn.nWt == null) {
              break label6439;
            }
            localn.nWt.setVisibility(8);
            parama = paramString;
            i = 0;
            break;
            localn.hqH.setVisibility(8);
            break label1467;
            label1713:
            localn.wsq.setImageResource(R.g.aYf);
            break label1561;
            label1727:
            localn.wrM.setImageBitmap(parama);
          }
          label1739:
          if (localn.nWt == null) {
            break label6439;
          }
          localn.nWt.setVisibility(0);
          if (paramau.field_status < 2) {
            break label6439;
          }
          localn.nWt.setVisibility(8);
          parama = paramString;
          i = 0;
          break label934;
          if ((locala.title != null) && (locala.title.length() > 0))
          {
            localn.hqH.setVisibility(0);
            localn.hqH.setMaxLines(2);
          }
          for (;;)
          {
            localn.hqI.setVisibility(0);
            localn.lVH.setVisibility(8);
            localn.wsm.setVisibility(4);
            localn.hqI.setMaxLines(2);
            localn.hqI.setText(bg.aF(locala.giv));
            localn.wsq.setVisibility(8);
            n.a(localn, str, locala.giv);
            n.a(localn, Boolean.valueOf(false), paramau, locala.eAE, locala.title);
            if (!bool) {
              break label6439;
            }
            if (!bg.SM(locala.giw)) {
              break label1967;
            }
            localn.wrM.setImageResource(R.g.aTN);
            parama = paramString;
            i = 0;
            break;
            localn.hqH.setVisibility(8);
          }
          label1967:
          localn.wrM.setImageResource(com.tencent.mm.pluginsdk.model.q.Oo(locala.giw));
          parama = paramString;
          i = 0;
          break label934;
          if ((locala.title != null) && (locala.title.length() > 0))
          {
            localn.hqH.setVisibility(0);
            label2020:
            localn.hqI.setVisibility(0);
            localn.lVH.setVisibility(8);
            localn.hqI.setMaxLines(2);
            localn.wsm.setVisibility(4);
            localn.wsq.setVisibility(0);
            localn.wsq.setImageResource(R.g.bbn);
            if (!bool) {
              break label6439;
            }
            parama = com.tencent.mm.pluginsdk.model.app.g.b(locala.appId, 1, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW));
            if ((parama != null) && (!parama.isRecycled())) {
              break label2156;
            }
            localn.wrM.setImageResource(R.k.cJo);
          }
          for (;;)
          {
            localn.wsq.setVisibility(8);
            parama = paramString;
            i = 0;
            break;
            localn.hqH.setVisibility(8);
            break label2020;
            label2156:
            localn.wrM.setImageBitmap(parama);
          }
          localObject1 = ((com.tencent.mm.plugin.appbrand.k.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.b.class)).pn(locala.gkR);
          if (localObject1 != null)
          {
            parama = ((WxaAttributes)localObject1).field_nickname;
            label2200:
            if (localObject1 == null) {
              break label2465;
            }
            localObject1 = ((WxaAttributes)localObject1).field_brandIconURL;
            label2212:
            localn.wsz.setVisibility(8);
            localn.wsL.setVisibility(0);
            localn.wsE.setVisibility(8);
            localn.wsH.setVisibility(8);
            localn.wsO.setText(locala.title);
            localn.wsH.setText(locala.description);
            localn.wsJ.setText(parama);
            switch (locala.gkY)
            {
            default: 
              localn.wsK.setText(R.l.cRT);
            }
          }
          for (;;)
          {
            com.tencent.mm.ao.n.Jd().a((String)localObject1, localn.wsI, this.wvN);
            parama = com.tencent.mm.ao.n.IZ().kf(paramau.field_imgPath);
            localn.wsM.setImageBitmap(null);
            com.tencent.mm.modelappbrand.a.b.CT().a(localn.wsM, "file://" + parama, null, null, ((com.tencent.mm.modelappbrand.g)com.tencent.mm.kernel.h.h(com.tencent.mm.modelappbrand.g.class)).aM(215, 172));
            if (!ccs()) {
              break label2503;
            }
            a(localn, parama1.wvd, paramau);
            if (localn.nWt == null) {
              break label6439;
            }
            localn.nWt.setVisibility(8);
            parama = paramString;
            i = 0;
            break;
            parama = locala.eTp;
            break label2200;
            label2465:
            localObject1 = locala.gla;
            break label2212;
            localn.wsK.setText(R.l.cSi);
            continue;
            localn.wsK.setText(R.l.cSh);
          }
          label2503:
          if (localn.nWt == null) {
            break label6439;
          }
          localn.nWt.setVisibility(0);
          if (paramau.field_status < 2) {
            break label6439;
          }
          localn.nWt.setVisibility(8);
          parama = paramString;
          i = 0;
          break label934;
          localn.hqH.setVisibility(8);
          if ((locala.title != null) && (locala.title.length() > 0))
          {
            localn.lVH.setMaxLines(2);
            localn.lVH.setVisibility(0);
            localn.lVH.setText(locala.title);
            label2608:
            localn.hqI.setMaxLines(3);
            localn.wsm.setVisibility(4);
            localn.wsq.setVisibility(8);
            if (bool)
            {
              parama = com.tencent.mm.pluginsdk.model.app.g.b(locala.appId, 1, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW));
              if (parama != null) {
                break label2781;
              }
              parama = new c.a();
              parama.gKR = R.k.cJr;
              parama.aP(com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 50), com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 50)).gKA = true;
              com.tencent.mm.ao.n.Jd().a(locala.thumburl, localn.wrM, parama.Jn());
            }
          }
          for (;;)
          {
            if (!ccs()) {
              break label2814;
            }
            a(localn, parama1.wvd, paramau);
            if (localn.nWt == null) {
              break label6439;
            }
            localn.nWt.setVisibility(8);
            parama = paramString;
            i = 0;
            break;
            localn.lVH.setVisibility(8);
            break label2608;
            label2781:
            if (parama.isRecycled()) {
              localn.wrM.setImageResource(R.k.cJr);
            } else {
              localn.wrM.setImageBitmap(parama);
            }
          }
          label2814:
          if (localn.nWt == null) {
            break label6439;
          }
          localn.nWt.setVisibility(0);
          if (paramau.field_status < 2) {
            break label6439;
          }
          localn.nWt.setVisibility(8);
          parama = paramString;
          i = 0;
          break label934;
          localObject1 = ((com.tencent.mm.plugin.appbrand.k.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.b.class)).pn(locala.gkR);
          switch (locala.gkT)
          {
          default: 
            i = 1;
          }
          for (;;)
          {
            if (i != 0) {
              break label6448;
            }
            if (!ccs()) {
              break label3404;
            }
            a(localn, parama1.wvd, paramau);
            if (localn.nWt == null) {
              break label6448;
            }
            localn.nWt.setVisibility(8);
            parama = paramString;
            break;
            if (localObject1 != null)
            {
              parama = ((WxaAttributes)localObject1).field_nickname;
              label2972:
              if (localObject1 == null) {
                break label3203;
              }
              localObject1 = ((WxaAttributes)localObject1).field_brandIconURL;
              label2984:
              localn.wsz.setVisibility(8);
              localn.wsL.setVisibility(0);
              localn.wsE.setVisibility(8);
              localn.wsH.setVisibility(8);
              localn.wsO.setText(locala.title);
              localn.wsH.setText(locala.description);
              localn.wsJ.setText(parama);
              switch (locala.gkY)
              {
              default: 
                localn.wsK.setText(R.l.cRT);
              }
            }
            for (;;)
            {
              com.tencent.mm.ao.n.Jd().a((String)localObject1, localn.wsI, this.wvN);
              parama = com.tencent.mm.ao.n.IZ().kf(paramau.field_imgPath);
              localn.wsM.setImageBitmap(null);
              com.tencent.mm.modelappbrand.a.b.CT().a(new b.h()
              {
                public final void CV()
                {
                  GMTrace.i(17910416277504L, 133443);
                  GMTrace.o(17910416277504L, 133443);
                }
                
                public final void CW()
                {
                  GMTrace.i(17910684712960L, 133445);
                  GMTrace.o(17910684712960L, 133445);
                }
                
                public final String CX()
                {
                  GMTrace.i(17910818930688L, 133446);
                  String str = "CHAT#" + com.tencent.mm.plugin.appbrand.n.g.aQ(this);
                  GMTrace.o(17910818930688L, 133446);
                  return str;
                }
                
                public final void j(Bitmap paramAnonymousBitmap)
                {
                  GMTrace.i(17910550495232L, 133444);
                  if ((paramAnonymousBitmap != null) && (!paramAnonymousBitmap.isRecycled()))
                  {
                    localn.wsM.setImageBitmap(paramAnonymousBitmap);
                    localn.wsM.setVisibility(0);
                    localn.wsN.setVisibility(4);
                    GMTrace.o(17910550495232L, 133444);
                    return;
                  }
                  localn.wsM.setVisibility(4);
                  localn.wsN.setVisibility(0);
                  GMTrace.o(17910550495232L, 133444);
                }
              }, "file://" + parama, null, ((com.tencent.mm.modelappbrand.g)com.tencent.mm.kernel.h.h(com.tencent.mm.modelappbrand.g.class)).aM(215, 172));
              i = 0;
              break;
              parama = locala.eTp;
              break label2972;
              label3203:
              localObject1 = locala.gla;
              break label2984;
              localn.wsK.setText(R.l.cSi);
              continue;
              localn.wsK.setText(R.l.cSh);
            }
            if (localObject1 != null)
            {
              parama = ((WxaAttributes)localObject1).field_nickname;
              label3252:
              if (localObject1 == null) {
                break label3372;
              }
            }
            label3372:
            for (localObject1 = ((WxaAttributes)localObject1).field_brandIconURL;; localObject1 = null)
            {
              localn.wsz.setVisibility(8);
              localn.wsL.setVisibility(8);
              localn.wsE.setVisibility(0);
              localn.wsG.setText(parama);
              if (!bg.nm((String)localObject1)) {
                break label3378;
              }
              parama = com.tencent.mm.ao.n.IZ().kf(paramau.field_imgPath);
              com.tencent.mm.modelappbrand.a.b.CT().a(localn.wsF, "file://" + parama, com.tencent.mm.modelappbrand.a.a.CS(), e.grO);
              i = 0;
              break;
              parama = locala.title;
              break label3252;
            }
            label3378:
            com.tencent.mm.modelappbrand.a.b.CT().a(localn.wsF, (String)localObject1, com.tencent.mm.modelappbrand.a.a.CS(), e.grO);
            i = 0;
          }
          label3404:
          if (localn.nWt == null) {
            break label6448;
          }
          localn.nWt.setVisibility(0);
          if (paramau.field_status < 2) {
            break label6448;
          }
          localn.nWt.setVisibility(8);
          parama = paramString;
          break label934;
          localn.hqH.setVisibility(8);
          if ((locala.title != null) && (locala.title.length() > 0))
          {
            localn.lVH.setVisibility(0);
            localn.lVH.setText(locala.title);
            label3497:
            localn.hqI.setMaxLines(3);
            localn.wsm.setVisibility(0);
            localn.wsq.setVisibility(8);
            if (bool)
            {
              parama = com.tencent.mm.pluginsdk.model.app.g.b(locala.appId, 1, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW));
              if ((parama != null) && (!parama.isRecycled())) {
                break label3618;
              }
              localn.wrM.setImageResource(R.k.cJr);
            }
          }
          for (;;)
          {
            if (!ccs()) {
              break label3630;
            }
            if (localn.nWt == null) {
              break label6439;
            }
            localn.nWt.setVisibility(8);
            parama = paramString;
            i = 0;
            break;
            localn.lVH.setVisibility(8);
            break label3497;
            label3618:
            localn.wrM.setImageBitmap(parama);
          }
          label3630:
          if (localn.nWt == null) {
            break label6439;
          }
          localn.nWt.setVisibility(0);
          if (paramau.field_status < 2) {
            break label6439;
          }
          localn.nWt.setVisibility(8);
          parama = paramString;
          i = 0;
          break label934;
          localn.lVH.setVisibility(0);
          if (locala.giQ == 1) {
            localn.lVH.setText(R.l.dVA);
          }
          for (;;)
          {
            if ((locala.title != null) && (locala.title.length() > 0))
            {
              localn.hqH.setVisibility(0);
              localn.hqH.setText(locala.title);
            }
            localn.hqI.setMaxLines(4);
            localn.wsm.setVisibility(4);
            localn.wsq.setVisibility(8);
            if (!bool) {
              break label6439;
            }
            parama = com.tencent.mm.ao.n.IZ().a(paramau.field_imgPath, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW));
            if ((parama == null) || (parama.isRecycled())) {
              break label3889;
            }
            localn.wrM.setImageBitmap(parama);
            parama = paramString;
            i = 0;
            break;
            if (locala.giQ == 2) {
              localn.lVH.setText(R.l.dVC);
            } else if (locala.giQ == 3) {
              localn.lVH.setText(R.l.dVB);
            } else {
              localn.lVH.setText(R.l.dVD);
            }
          }
          label3889:
          localn.wrM.setImageResource(R.k.cJr);
          parama = paramString;
          i = 0;
          break label934;
          localn.hqH.setVisibility(0);
          localn.hqH.setText(locala.title);
          localn.lVH.setVisibility(0);
          localn.lVH.setText(R.l.dgw);
          localn.hqI.setMaxLines(4);
          localn.wsm.setVisibility(4);
          localn.wsq.setVisibility(8);
          if (!bool) {
            break label6439;
          }
          parama = com.tencent.mm.ao.n.IZ().a(paramau.field_imgPath, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW));
          if ((parama != null) && (!parama.isRecycled()))
          {
            localn.wrM.setImageBitmap(parama);
            parama = paramString;
            i = 0;
            break label934;
          }
          localn.wrM.setImageResource(R.k.cJr);
          parama = paramString;
          i = 0;
          break label934;
          if ((locala.title != null) && (locala.title.length() > 0))
          {
            localn.hqH.setVisibility(0);
            localn.hqH.setText(locala.title);
            localn.lVH.setVisibility(8);
          }
          localn.hqI.setMaxLines(4);
          localn.wsm.setVisibility(4);
          localn.wsq.setVisibility(8);
          if (!bool) {
            break label6439;
          }
          parama = com.tencent.mm.ao.n.IZ().a(paramau.field_imgPath, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW));
          if ((parama != null) && (!parama.isRecycled()))
          {
            localn.wrM.setImageBitmap(parama);
            parama = paramString;
            i = 0;
            break label934;
          }
          localn.wrM.setImageResource(R.k.cJr);
          parama = paramString;
          i = 0;
          break label934;
          if ((locala.title != null) && (locala.title.length() > 0)) {
            localn.hqH.setVisibility(0);
          }
          for (;;)
          {
            localn.hqI.setVisibility(0);
            localn.lVH.setVisibility(8);
            localn.wsm.setVisibility(8);
            localn.wsq.setVisibility(4);
            localn.hqI.setMaxLines(2);
            if (!bool) {
              break label6439;
            }
            parama = com.tencent.mm.pluginsdk.model.app.g.b(locala.appId, 1, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW));
            if ((parama != null) && (!parama.isRecycled())) {
              break label4354;
            }
            localn.wrM.setImageResource(R.k.cJr);
            parama = paramString;
            i = 0;
            break;
            localn.hqH.setVisibility(8);
          }
          label4354:
          localn.wrM.setImageBitmap(parama);
          parama = paramString;
          i = 0;
          break label934;
          if ((locala.title != null) && (locala.title.length() > 0))
          {
            localn.hqH.setVisibility(0);
            label4400:
            localn.hqI.setVisibility(0);
            localn.lVH.setVisibility(8);
            localn.wsq.setVisibility(8);
            localn.wsm.setVisibility(4);
            localn.hqI.setMaxLines(2);
            if (bool)
            {
              parama = com.tencent.mm.ao.n.IZ().a(paramau.field_imgPath, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW));
              if ((parama != null) && (!parama.isRecycled())) {
                break label4573;
              }
              localn.wrM.setImageResource(R.k.cJr);
            }
          }
          for (;;)
          {
            parama = new dr(paramau, false, paramInt, "", 8, false, parama1.cel(), locala.eTo, locala.eTp, locala.title, locala.giY, locala.url, false, false);
            localn.wsy.setTag(parama);
            i = 0;
            break;
            localn.hqH.setVisibility(8);
            break label4400;
            label4573:
            localn.wrM.setImageBitmap(parama);
          }
          if ((locala.title != null) && (locala.title.length() > 0))
          {
            localn.hqH.setVisibility(0);
            label4613:
            localn.hqI.setVisibility(0);
            localn.lVH.setVisibility(8);
            localn.wsq.setVisibility(8);
            localn.wsm.setVisibility(4);
            localn.hqI.setMaxLines(2);
            if (bool)
            {
              parama = com.tencent.mm.ao.n.IZ().a(paramau.field_imgPath, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW));
              if ((parama != null) && (!parama.isRecycled())) {
                break label4790;
              }
              localn.wrM.setImageResource(R.k.cJr);
            }
          }
          for (;;)
          {
            parama = new dr(paramau, paramInt, "", parama1.cel(), locala.eTo, locala.eTp, locala.title, locala.gkF, locala.designerName, locala.designerRediretctUrl, locala.url);
            localn.wsy.setTag(parama);
            i = 0;
            break;
            localn.hqH.setVisibility(8);
            break label4613;
            label4790:
            localn.wrM.setImageBitmap(parama);
          }
          if ((locala.title != null) && (locala.title.length() > 0))
          {
            localn.hqH.setVisibility(0);
            label4830:
            localn.hqI.setVisibility(0);
            localn.lVH.setVisibility(8);
            localn.wsq.setVisibility(8);
            localn.wsm.setVisibility(4);
            localn.hqI.setMaxLines(2);
            if (bool)
            {
              if (!bg.nm(paramau.field_imgPath)) {
                break label5071;
              }
              com.tencent.mm.ao.n.Jd().a(locala.thumburl, localn.wrM);
            }
            label4909:
            parama = new dr();
            parama.eRz = paramau;
            parama.wqK = false;
            parama.position = paramInt;
            parama.wFv = false;
            parama.title = parama1.cel();
            parama.eTo = locala.eTo;
            parama.eTp = locala.eTp;
            parama.wFw = locala.title;
            if (locala.type != 26) {
              break label5130;
            }
            parama.jHw = 12;
            parama.tid = locala.tid;
            parama.gkG = locala.gkG;
            parama.desc = locala.desc;
            parama.iconUrl = locala.iconUrl;
            parama.secondUrl = locala.secondUrl;
            parama.pageType = locala.pageType;
          }
          for (;;)
          {
            localn.wsy.setTag(parama);
            i = 0;
            break;
            localn.hqH.setVisibility(8);
            break label4830;
            label5071:
            parama = com.tencent.mm.ao.n.IZ().a(paramau.field_imgPath, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW));
            if ((parama == null) || (parama.isRecycled()))
            {
              localn.wrM.setImageResource(R.k.cJr);
              break label4909;
            }
            localn.wrM.setImageBitmap(parama);
            break label4909;
            label5130:
            if (locala.type == 27)
            {
              parama.jHw = 13;
              parama.tid = locala.tid;
              parama.gkG = locala.gkG;
              parama.desc = locala.desc;
              parama.iconUrl = locala.iconUrl;
              parama.secondUrl = locala.secondUrl;
              parama.pageType = locala.pageType;
            }
            else
            {
              w.i("MicroMsg.ChattingItemAppMsgTo", "unknow view type");
            }
          }
          localn.hqH.setVisibility(0);
          localn.hqH.setText(locala.description);
          localn.hqI.setText(locala.gjE);
          if ((locala.title != null) && (locala.title.length() > 0))
          {
            localn.lVH.setVisibility(0);
            localn.lVH.setText(locala.title);
          }
          for (;;)
          {
            localn.hqI.setMaxLines(4);
            localn.wsm.setVisibility(4);
            localn.wsq.setVisibility(8);
            if (!bool) {
              break label6439;
            }
            parama = com.tencent.mm.ao.n.IZ().a(paramau.field_imgPath, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW));
            if (parama == null) {
              break label5381;
            }
            localn.wrM.setImageBitmap(parama);
            parama = paramString;
            i = 0;
            break;
            localn.lVH.setVisibility(8);
          }
          label5381:
          localn.wrM.setImageResource(R.k.cJr);
          parama = paramString;
          i = 0;
          break label934;
          localn.hqH.setVisibility(8);
          localn.lVH.setVisibility(0);
          if ((locala.title != null) && (locala.title.length() > 0)) {
            localn.lVH.setText(com.tencent.mm.pluginsdk.ui.d.h.c(localn.lVH.getContext(), locala.title, (int)localn.lVH.getTextSize()));
          }
          for (;;)
          {
            localn.hqI.setMaxLines(3);
            localn.wsm.setVisibility(4);
            localn.wsq.setVisibility(8);
            if (bool) {
              localn.wrM.setVisibility(8);
            }
            n.a(parama1, localn, locala, paramau, bool);
            if (!ccs()) {
              break label5611;
            }
            a(localn, parama1.wvd, paramau);
            if (localn.nWt == null) {
              break label6439;
            }
            localn.nWt.setVisibility(8);
            parama = paramString;
            i = 0;
            break;
            localn.lVH.setText(com.tencent.mm.pluginsdk.ui.d.h.c(localn.lVH.getContext(), ab.getContext().getString(R.l.dvi), (int)localn.lVH.getTextSize()));
          }
          label5611:
          if (localn.nWt == null) {
            break label6439;
          }
          localn.nWt.setVisibility(0);
          if (paramau.field_status < 2) {
            break label6439;
          }
          localn.nWt.setVisibility(8);
          parama = paramString;
          i = 0;
          break label934;
          n.a(parama1, localn, locala, bool);
          if (ccs())
          {
            a(localn, parama1.wvd, paramau);
            if (localn.nWt == null) {
              break label6439;
            }
            localn.nWt.setVisibility(8);
            parama = paramString;
            i = 0;
            break label934;
          }
          if (localn.nWt == null) {
            break label6439;
          }
          localn.nWt.setVisibility(0);
          if (paramau.field_status < 2) {
            break label6439;
          }
          localn.nWt.setVisibility(8);
          parama = paramString;
          i = 0;
          break label934;
          if ((locala.title != null) && (locala.title.length() > 0))
          {
            localn.hqH.setVisibility(0);
            if (!bg.nm(locala.gjN)) {
              if (!bg.nm(locala.gjN))
              {
                localn.hqH.setTextColor(bg.aL(locala.gjN, parama1.vKB.vKW.getResources().getColor(R.e.black)));
                label5837:
                localn.hqI.setMaxLines(2);
                localn.hqI.setVisibility(0);
                if (bg.nm(locala.gjO)) {
                  break label6187;
                }
                localn.hqI.setTextColor(bg.aL(locala.gjO, parama1.vKB.vKW.getResources().getColor(R.e.aNR)));
                label5898:
                localn.lVH.setVisibility(8);
                localn.wsm.setVisibility(4);
                localn.wsq.setVisibility(8);
                localn.wsl.setVisibility(0);
                localn.ljO.setVisibility(0);
                if (bg.nm(locala.gjJ)) {
                  break label6214;
                }
                localn.ljO.setText(locala.gjJ);
              }
            }
          }
          for (;;)
          {
            if (this.tIv)
            {
              parama = com.tencent.mm.ao.n.IZ().a(paramau.field_imgPath, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW), false);
              if ((parama != null) && (!parama.isRecycled()))
              {
                localObject1 = com.tencent.mm.sdk.platformtools.d.a(parama, false, parama.getWidth() / 2);
                localn.wrM.setImageBitmap((Bitmap)localObject1);
              }
              if (!bg.nm(locala.gjM))
              {
                parama = com.tencent.mm.ao.n.Jd();
                localObject1 = locala.gjM;
                localObject2 = new ImageView(parama1.vKB.vKW);
                localObject3 = new c.a();
                ((c.a)localObject3).gKC = true;
                parama.a((String)localObject1, (ImageView)localObject2, ((c.a)localObject3).Jn(), new com.tencent.mm.ao.a.c.g()
                {
                  public final void a(final String paramAnonymousString, View paramAnonymousView, com.tencent.mm.ao.a.d.b paramAnonymousb)
                  {
                    GMTrace.i(17894444367872L, 133324);
                    if (paramAnonymousb.bitmap != null)
                    {
                      paramAnonymousString = paramAnonymousb.bitmap;
                      localn.wsz.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
                      {
                        public final boolean onPreDraw()
                        {
                          GMTrace.i(17909745188864L, 133438);
                          ba.3.this.wvO.wsz.getViewTreeObserver().removeOnPreDrawListener(this);
                          int j = ba.3.this.wvO.wsz.getHeight();
                          int k = ba.3.this.wvO.wsz.getWidth();
                          int i = j;
                          if (j == 0) {
                            i = com.tencent.mm.br.a.V(ba.3.this.wrC.vKB.vKW, R.f.aRI);
                          }
                          j = k;
                          if (k == 0) {
                            j = com.tencent.mm.br.a.V(ba.3.this.wrC.vKB.vKW, R.f.aRJ);
                          }
                          BitmapDrawable localBitmapDrawable = new BitmapDrawable(com.tencent.mm.sdk.platformtools.d.a(paramAnonymousString, R.g.aVs, j, i));
                          ba.3.this.wvO.wsz.setBackgroundDrawable(localBitmapDrawable);
                          GMTrace.o(17909745188864L, 133438);
                          return true;
                        }
                      });
                    }
                    GMTrace.o(17894444367872L, 133324);
                  }
                  
                  public final void ku(String paramAnonymousString)
                  {
                    GMTrace.i(17894310150144L, 133323);
                    GMTrace.o(17894310150144L, 133323);
                  }
                });
                parama = paramString;
                i = 0;
                break;
                localn.hqH.setTextColor(parama1.vKB.vKW.getResources().getColor(R.e.black));
                break label5837;
                localn.hqH.setTextColor(parama1.vKB.vKW.getResources().getColor(R.e.black));
                break label5837;
                localn.hqH.setVisibility(8);
                break label5837;
                label6187:
                localn.hqI.setTextColor(parama1.vKB.vKW.getResources().getColor(R.e.aNR));
                break label5898;
                label6214:
                localn.ljO.setText(R.l.dfR);
                continue;
              }
              localn.wsz.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
              {
                public final boolean onPreDraw()
                {
                  GMTrace.i(17894847021056L, 133327);
                  localn.wsz.getViewTreeObserver().removeOnPreDrawListener(this);
                  int i = com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 24);
                  Bitmap localBitmap = parama;
                  Object localObject;
                  if (localBitmap != null)
                  {
                    localObject = localBitmap;
                    if (!localBitmap.isRecycled()) {}
                  }
                  else
                  {
                    localObject = com.tencent.mm.sdk.platformtools.d.X(parama1.vKB.vKW.getResources().getColor(R.e.aNl), i, i);
                  }
                  int j = ((Bitmap)localObject).getHeight();
                  if (i > j) {
                    i = j;
                  }
                  for (;;)
                  {
                    localObject = com.tencent.mm.sdk.platformtools.d.c(com.tencent.mm.sdk.platformtools.d.R(Bitmap.createScaledBitmap((Bitmap)localObject, i, i, true)), 20);
                    j = localn.wsz.getHeight();
                    int k = localn.wsz.getWidth();
                    i = j;
                    if (j == 0) {
                      i = com.tencent.mm.br.a.V(parama1.vKB.vKW, R.f.aRI);
                    }
                    j = k;
                    if (k == 0) {
                      j = com.tencent.mm.br.a.V(parama1.vKB.vKW, R.f.aRJ);
                    }
                    localObject = new BitmapDrawable(com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject, R.g.aVs, j, i));
                    localn.wsz.setBackgroundDrawable((Drawable)localObject);
                    GMTrace.o(17894847021056L, 133327);
                    return true;
                  }
                }
              });
              parama = paramString;
              i = 0;
              break;
            }
          }
          localn.wrM.setImageBitmap(BitmapFactory.decodeResource(parama1.getResources(), R.g.aYu));
          parama = paramString;
          i = 0;
          break label934;
          if (((j)localObject2).glu != 19) {
            break label6439;
          }
          n.a(parama1, localn, locala, bool);
          parama = paramString;
          i = 0;
          break label934;
          localn.lVH.setVisibility(8);
          break label989;
          label6329:
          localObject1 = com.tencent.mm.ao.n.IZ().a(paramau.field_imgPath, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW));
          if (localObject1 != null)
          {
            paramString = (String)localObject1;
            if (!((Bitmap)localObject1).isRecycled()) {}
          }
          else
          {
            paramString = com.tencent.mm.ao.n.IZ().a(paramau.field_imgPath, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW), false);
          }
          if ((paramString != null) && (!paramString.isRecycled()))
          {
            localn.wrM.setImageBitmap(paramString);
            localObject1 = parama;
          }
          else
          {
            localn.wrM.setImageResource(R.g.aTN);
            label6433:
            localObject1 = parama;
          }
        }
        label6439:
        parama = paramString;
        i = 0;
        continue;
        label6448:
        parama = paramString;
      }
      localObject2 = null;
      locala = null;
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2518998319104L, 18768);
    int i = ((dr)paramView.getTag()).position;
    Object localObject1 = paramau.field_content;
    if (localObject1 == null)
    {
      GMTrace.o(2518998319104L, 18768);
      return true;
    }
    localObject1 = f.a.eS(this.wvE.cV((String)localObject1, paramau.field_isSend));
    if (localObject1 == null)
    {
      GMTrace.o(2518998319104L, 18768);
      return true;
    }
    Object localObject2 = com.tencent.mm.pluginsdk.model.app.g.aP(((f.a)localObject1).appId, false);
    if ((com.tencent.mm.pluginsdk.model.app.g.h((com.tencent.mm.pluginsdk.model.app.f)localObject2)) && (!aa.am(paramau))) {
      paramContextMenu.add(i, 111, 0, this.wvE.getString(R.l.dSi));
    }
    if (((paramau.field_status == 2) || (paramau.fwz == 1)) && (av(paramau)) && (VU(paramau.field_talker))) {
      paramContextMenu.add(i, 123, 0, paramView.getContext().getString(R.l.dgl));
    }
    boolean bool;
    switch (((f.a)localObject1).type)
    {
    default: 
      bool = false;
    }
    for (;;)
    {
      if ((bool) && (!this.wvE.ceh())) {
        paramContextMenu.add(i, 114, 0, paramView.getContext().getString(R.l.dfZ));
      }
      if ((com.tencent.mm.bj.d.LL("favorite")) && ((localObject2 == null) || (!((com.tencent.mm.pluginsdk.model.app.f)localObject2).bJs()))) {
        switch (((f.a)localObject1).type)
        {
        }
      }
      for (;;)
      {
        localObject2 = new dh();
        ((dh)localObject2).eEV.eDr = paramau.field_msgId;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
        if ((((dh)localObject2).eEW.eEu) || (d.a(this.wvE.vKB.vKW, (f.a)localObject1))) {
          paramContextMenu.add(i, 128, 0, paramView.getContext().getString(R.l.dgi));
        }
        if (!this.wvE.ceh()) {
          paramContextMenu.add(i, 100, 0, this.wvE.getString(R.l.dgd));
        }
        GMTrace.o(2518998319104L, 18768);
        return true;
        bool = com.tencent.mm.af.f.Fx();
        break;
        bool = com.tencent.mm.af.f.Ft();
        break;
        bool = com.tencent.mm.af.f.Fw();
        break;
        bool = com.tencent.mm.af.f.Fo();
        break;
        bool = com.tencent.mm.af.f.Fm();
        break;
        bool = com.tencent.mm.af.f.Fv();
        break;
        bool = com.tencent.mm.af.f.Fp();
        break;
        if ((((f.a)localObject1).gjF != 5) && (((f.a)localObject1).gjF != 6) && (((f.a)localObject1).gjF != 2)) {
          break label765;
        }
        if (((f.a)localObject1).gjF != 2) {
          paramContextMenu.clear();
        }
        paramContextMenu.add(i, 100, 0, this.wvE.getString(R.l.dgd));
        GMTrace.o(2518998319104L, 18768);
        return false;
        paramContextMenu.clear();
        paramContextMenu.add(i, 100, 0, this.wvE.getString(R.l.dgd));
        GMTrace.o(2518998319104L, 18768);
        return false;
        paramContextMenu.add(i, 116, 0, paramView.getContext().getString(R.l.dNH));
      }
      label765:
      bool = false;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2519132536832L, 18769);
    switch (paramMenuItem.getItemId())
    {
    }
    for (;;)
    {
      GMTrace.o(2519132536832L, 18769);
      return false;
      Object localObject = paramau.field_content;
      paramMenuItem = null;
      if (localObject != null) {
        paramMenuItem = f.a.eS((String)localObject);
      }
      if ((paramMenuItem != null) && (19 == paramMenuItem.type))
      {
        localObject = new mn();
        ((mn)localObject).eRu.type = 3;
        ((mn)localObject).eRu.eDr = paramau.field_msgId;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      }
      bc.S(paramau.field_msgId);
      if (paramMenuItem != null)
      {
        localObject = com.tencent.mm.pluginsdk.model.app.g.aP(paramMenuItem.appId, false);
        if ((localObject != null) && (((com.tencent.mm.pluginsdk.model.app.f)localObject).bJs())) {
          a(parama, paramMenuItem, paramau, (com.tencent.mm.pluginsdk.model.app.f)localObject);
        }
      }
      GMTrace.o(2519132536832L, 18769);
      return false;
      d.a(parama, paramau, a(parama, paramau));
      GMTrace.o(2519132536832L, 18769);
      return false;
      paramMenuItem = paramau.field_content;
      if (paramMenuItem == null)
      {
        GMTrace.o(2519132536832L, 18769);
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
        GMTrace.o(2519132536832L, 18769);
        return false;
        ef.a(paramau, parama.cV(paramau.field_content, paramau.field_isSend), parama.vKB.vKW);
        continue;
        ef.b(paramau, parama.vKB.vKW);
        continue;
        ef.b(paramau, parama.cV(paramau.field_content, paramau.field_isSend), parama.vKB.vKW);
        continue;
        ef.a(paramau, parama.vKB.vKW, a(parama, paramau), parama.wvi);
        continue;
        ef.k(parama.cV(paramau.field_content, paramau.field_isSend), parama.vKB.vKW);
        continue;
        ef.c(paramau, parama.cV(paramau.field_content, paramau.field_isSend), parama.vKB.vKW);
        continue;
        ef.a(paramau, parama.vKB.vKW);
      }
      paramMenuItem = paramau.field_content;
      if (paramMenuItem == null)
      {
        GMTrace.o(2519132536832L, 18769);
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
          com.tencent.mm.sdk.b.a.vgX.m(parama);
        }
      }
    }
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, final au paramau)
  {
    GMTrace.i(2519266754560L, 18770);
    if ((((dr)paramView.getTag()).jHw == 5) && (paramau.field_isSend == 1))
    {
      if (paramau != null) {
        com.tencent.mm.ui.base.h.a(this.wvE.vKB.vKW, this.wvE.getString(R.l.dhb), "", this.wvE.getString(R.l.cUn), this.wvE.getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(2310826622976L, 17217);
            ed.Z(paramau);
            ba.this.wvE.me(true);
            GMTrace.o(2310826622976L, 17217);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(17911087366144L, 133448);
            GMTrace.o(17911087366144L, 133448);
          }
        });
      }
      GMTrace.o(2519266754560L, 18770);
      return true;
    }
    paramView = paramau.field_content;
    if (paramView == null)
    {
      GMTrace.o(2519266754560L, 18770);
      return false;
    }
    Object localObject1 = f.a.eS(paramView);
    if (localObject1 == null)
    {
      GMTrace.o(2519266754560L, 18770);
      return false;
    }
    paramView = com.tencent.mm.pluginsdk.model.app.g.aP(((f.a)localObject1).appId, true);
    if ((paramView != null) && (!bg.nm(paramView.field_appId)) && (paramView.bJs())) {
      a(parama, (f.a)localObject1, com.tencent.mm.y.q.zE(), paramView, paramau.field_msgSvrId);
    }
    int i;
    Object localObject3;
    Object localObject4;
    switch (((f.a)localObject1).type)
    {
    case 8: 
    case 9: 
    case 11: 
    case 12: 
    case 14: 
    case 15: 
    case 17: 
    case 18: 
    case 21: 
    case 22: 
    case 23: 
    case 25: 
    case 26: 
    case 27: 
    case 28: 
    case 29: 
    case 30: 
    case 31: 
    case 32: 
    case 35: 
    default: 
      if ((((f.a)localObject1).url == null) || (((f.a)localObject1).url.equals(""))) {
        break label4005;
      }
      if (!bg.nm(((f.a)localObject1).canvasPageXml))
      {
        paramView = new Intent();
        paramView.putExtra("sns_landig_pages_from_source", 5);
        paramView.putExtra("msg_id", paramau.field_msgId);
        paramView.putExtra("sns_landing_pages_xml", ((f.a)localObject1).canvasPageXml);
        paramView.putExtra("sns_landing_pages_share_thumb_url", paramau.field_imgPath);
        paramView.addFlags(268435456);
        com.tencent.mm.bj.d.b(parama.vKB.vKW, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", paramView);
        GMTrace.o(2519266754560L, 18770);
        return true;
      }
      break;
    case 6: 
      at.AR();
      if (!com.tencent.mm.y.c.isSDCardAvailable())
      {
        com.tencent.mm.ui.base.u.fo(parama.vKB.vKW);
        GMTrace.o(2519266754560L, 18770);
        return true;
      }
      if (bg.SM(((f.a)localObject1).giw))
      {
        long l = paramau.field_msgId;
        localObject1 = ((f.a)localObject1).eAE;
        paramView = an.afP().Op((String)localObject1);
        if ((paramView == null) || (!paramView.aDI())) {
          i = 0;
        }
        while (i != 0)
        {
          GMTrace.o(2519266754560L, 18770);
          return true;
          at.AR();
          localObject2 = com.tencent.mm.y.c.yM().cM(l);
          if (((au)localObject2).bTO())
          {
            w.i("MicroMsg.ChattingItemAppMsgTo", "openImg:: msg is clean, attachId %s, msgId: %d, msgSvrId: %d, imgPath: %s", new Object[] { localObject1, Long.valueOf(l), Long.valueOf(((ce)localObject2).field_msgSvrId), ((ce)localObject2).field_imgPath });
            paramView = new Intent();
            paramView.setClassName(this.wvE.vKB.vKW, "com.tencent.mm.ui.chatting.ResourcesExceedUI");
            paramView.putExtra("clean_view_type", 1);
            this.wvE.startActivity(paramView);
            i = 1;
          }
          else
          {
            localObject1 = new Intent(this.wvE.vKB.vKW, ShowImageUI.class);
            ((Intent)localObject1).putExtra("key_image_path", paramView.field_fileFullPath);
            ((Intent)localObject1).putExtra("key_message_id", l);
            ((Intent)localObject1).putExtra("key_favorite", true);
            this.wvE.startActivity((Intent)localObject1);
            i = 1;
          }
        }
      }
      paramView = new Intent();
      paramView.setClassName(parama.vKB.vKW, "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
      paramView.putExtra("app_msg_id", paramau.field_msgId);
      parama.startActivity(paramView);
      GMTrace.o(2519266754560L, 18770);
      return true;
    case 3: 
      com.tencent.mm.plugin.report.service.g.ork.i(13043, new Object[] { Integer.valueOf(2), ((f.a)localObject1).description, ((f.a)localObject1).appId });
    case 4: 
      if (a(parama, (f.a)localObject1, paramau))
      {
        GMTrace.o(2519266754560L, 18770);
        return true;
      }
      localObject2 = com.tencent.mm.pluginsdk.model.app.p.s(((f.a)localObject1).url, "message");
      localObject3 = com.tencent.mm.pluginsdk.model.app.p.s(((f.a)localObject1).giu, "message");
      localObject4 = getPackageInfo(parama.vKB.vKW, ((f.a)localObject1).appId);
      if (localObject4 == null)
      {
        paramView = null;
        if (localObject4 != null) {
          break label972;
        }
      }
      for (i = 0;; i = ((PackageInfo)localObject4).versionCode)
      {
        a(parama, (String)localObject2, (String)localObject3, paramView, i, ((f.a)localObject1).appId, true, paramau.field_msgId, paramau.field_msgSvrId, paramau);
        GMTrace.o(2519266754560L, 18770);
        return true;
        paramView = ((PackageInfo)localObject4).versionName;
        break;
      }
    case 5: 
      if (!bg.nm(((f.a)localObject1).canvasPageXml))
      {
        paramView = new Intent();
        paramView.putExtra("sns_landig_pages_from_source", 5);
        paramView.putExtra("msg_id", paramau.field_msgId);
        paramView.putExtra("sns_landing_pages_xml", ((f.a)localObject1).canvasPageXml);
        paramView.putExtra("sns_landing_pages_share_thumb_url", paramau.field_imgPath);
        paramView.addFlags(268435456);
        com.tencent.mm.bj.d.b(parama.vKB.vKW, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", paramView);
        GMTrace.o(2519266754560L, 18770);
        return true;
      }
      if ((((f.a)localObject1).url != null) && (!((f.a)localObject1).url.equals("")))
      {
        localObject2 = ((f.a)localObject1).url;
        if (!parama.wvi) {
          break label1744;
        }
        paramView = "groupmessage";
        localObject4 = com.tencent.mm.pluginsdk.model.app.p.s((String)localObject2, paramView);
        paramView = ((f.a)localObject1).giu;
        localObject2 = getPackageInfo(parama.vKB.vKW, ((f.a)localObject1).appId);
        localObject3 = new Intent();
        ((Intent)localObject3).putExtra("rawUrl", (String)localObject4);
        ((Intent)localObject3).putExtra("webpageTitle", ((f.a)localObject1).title);
        localObject4 = new Bundle();
        ((Bundle)localObject4).putString("key_snsad_statextstr", ((f.a)localObject1).eTv);
        if ((((f.a)localObject1).appId != null) && (("wx751a1acca5688ba3".equals(((f.a)localObject1).appId)) || ("wxfbc915ff7c30e335".equals(((f.a)localObject1).appId)) || ("wx482a4001c37e2b74".equals(((f.a)localObject1).appId)))) {
          ((Bundle)localObject4).putString("jsapi_args_appid", ((f.a)localObject1).appId);
        }
        ((Intent)localObject3).putExtra("jsapiargs", (Bundle)localObject4);
        if (bg.nm(paramView)) {
          break label1751;
        }
        ((Intent)localObject3).putExtra("shortUrl", paramView);
        if (localObject2 != null) {
          break label1768;
        }
        paramView = null;
        ((Intent)localObject3).putExtra("version_name", paramView);
        if (localObject2 != null) {
          break label1777;
        }
        i = 0;
        ((Intent)localObject3).putExtra("version_code", i);
        if (!bg.nm(((f.a)localObject1).eTo))
        {
          ((Intent)localObject3).putExtra("srcUsername", ((f.a)localObject1).eTo);
          ((Intent)localObject3).putExtra("srcDisplayname", ((f.a)localObject1).eTp);
        }
        ((Intent)localObject3).putExtra("msg_id", paramau.field_msgId);
        ((Intent)localObject3).putExtra("KPublisherId", "msg_" + Long.toString(paramau.field_msgSvrId));
        ((Intent)localObject3).putExtra("KAppId", ((f.a)localObject1).appId);
        ((Intent)localObject3).putExtra("geta8key_username", parama.cci());
        ((Intent)localObject3).putExtra("pre_username", a(parama, paramau));
        ((Intent)localObject3).putExtra("from_scence", 2);
        i = t.H(a(parama, paramau), parama.cci());
        ((Intent)localObject3).putExtra("prePublishId", "msg_" + Long.toString(paramau.field_msgSvrId));
        ((Intent)localObject3).putExtra("preUsername", a(parama, paramau));
        ((Intent)localObject3).putExtra("preChatName", parama.cci());
        ((Intent)localObject3).putExtra("preChatTYPE", i);
        ((Intent)localObject3).putExtra("preMsgIndex", 0);
        switch (i)
        {
        case 3: 
        case 4: 
        case 5: 
        default: 
          i = 0;
        }
      }
      for (;;)
      {
        ((Intent)localObject3).putExtra("share_report_pre_msg_url", ((f.a)localObject1).url);
        ((Intent)localObject3).putExtra("share_report_pre_msg_title", ((f.a)localObject1).title);
        ((Intent)localObject3).putExtra("share_report_pre_msg_desc", ((f.a)localObject1).description);
        ((Intent)localObject3).putExtra("share_report_pre_msg_icon_url", ((f.a)localObject1).thumburl);
        ((Intent)localObject3).putExtra("share_report_pre_msg_appid", ((f.a)localObject1).appId);
        ((Intent)localObject3).putExtra("share_report_from_scene", i);
        if (i == 5) {
          ((Intent)localObject3).putExtra("share_report_biz_username", parama.cci());
        }
        com.tencent.mm.bj.d.b(parama.vKB.vKW, "webview", ".ui.tools.WebViewUI", (Intent)localObject3);
        GMTrace.o(2519266754560L, 18770);
        return true;
        paramView = "singlemessage";
        break;
        ((Intent)localObject3).putExtra("shortUrl", ((f.a)localObject1).url);
        break label1301;
        paramView = ((PackageInfo)localObject2).versionName;
        break label1308;
        i = ((PackageInfo)localObject2).versionCode;
        break label1326;
        i = 2;
        continue;
        i = 3;
        continue;
        i = 5;
      }
    case 33: 
      w.i("MicroMsg.ChattingItemAppMsgTo", "username: %s , path: %s ,appid %s ,url : %s, pkgType : %s, md5 : %s", new Object[] { ((f.a)localObject1).gkR, ((f.a)localObject1).gkQ, ((f.a)localObject1).gkS, ((f.a)localObject1).url, Integer.valueOf(((f.a)localObject1).gkY), ((f.a)localObject1).gkU });
      localObject2 = parama.cci();
      localObject3 = a(parama, paramau);
      localObject4 = new Bundle();
      if ((parama instanceof AppBrandServiceChattingUI.a))
      {
        i = 10;
        ((Bundle)localObject4).putInt("stat_scene", i);
        ((Bundle)localObject4).putString("stat_msg_id", "msg_" + Long.toString(paramau.field_msgSvrId));
        ((Bundle)localObject4).putString("stat_chat_talker_username", (String)localObject2);
        ((Bundle)localObject4).putString("stat_send_msg_user", (String)localObject3);
        switch (((f.a)localObject1).gkT)
        {
        default: 
          i = 1;
        }
      }
      while (i == 0)
      {
        GMTrace.o(2519266754560L, 18770);
        return true;
        if (parama.wvi)
        {
          i = 2;
          break label1904;
        }
        if (s.fD((String)localObject2))
        {
          i = 7;
          break label1904;
        }
        i = 1;
        break label1904;
        paramView = new Intent();
        paramView.putExtra("key_username", ((f.a)localObject1).gkR);
        if (parama.wvi)
        {
          paramView.putExtra("key_from_scene", 1);
          paramView.putExtra("key_scene_note", parama.cci() + ":" + (String)localObject3);
        }
        for (;;)
        {
          paramView.putExtra("_stat_obj", (Bundle)localObject4);
          localObject2 = new WxaExposedParams.a();
          ((WxaExposedParams.a)localObject2).appId = ((f.a)localObject1).gkS;
          ((WxaExposedParams.a)localObject2).eDj = 6;
          ((WxaExposedParams.a)localObject2).hKB = ((f.a)localObject1).gkY;
          ((WxaExposedParams.a)localObject2).hKC = ((f.a)localObject1).gkV;
          paramView.putExtra("key_scene_exposed_params", ((WxaExposedParams.a)localObject2).UI());
          com.tencent.mm.bj.d.b(parama.vKB.vKW, "appbrand", ".ui.AppBrandProfileUI", paramView);
          i = 0;
          break;
          paramView.putExtra("key_from_scene", 2);
          paramView.putExtra("key_scene_note", (String)localObject2);
        }
        if ((parama instanceof AppBrandServiceChattingUI.a))
        {
          com.tencent.mm.modelappbrand.a.a((String)localObject2, 1073, (f.a)localObject1, (Bundle)localObject4);
          i = 0;
        }
        else if (s.fD((String)localObject2))
        {
          com.tencent.mm.modelappbrand.a.a((String)localObject2, 1074, (f.a)localObject1, (Bundle)localObject4);
          i = 0;
        }
        else
        {
          com.tencent.mm.modelappbrand.a.a((String)localObject2, (String)localObject3, parama.wvi, (f.a)localObject1, (Bundle)localObject4);
          i = 0;
          continue;
          com.tencent.mm.modelappbrand.a.b((String)localObject2, (String)localObject3, parama.wvi, (f.a)localObject1, (Bundle)localObject4);
          i = 0;
        }
      }
    case 36: 
      if ((bg.nm(((f.a)localObject1).gkS)) && (bg.nm(((f.a)localObject1).gkR)))
      {
        paramau = ((f.a)localObject1).url;
        if (parama.wvi) {}
        for (paramView = "groupmessage";; paramView = "singlemessage")
        {
          paramView = com.tencent.mm.pluginsdk.model.app.p.s(paramau, paramView);
          paramau = new Intent();
          paramau.putExtra("rawUrl", paramView);
          paramau.putExtra("webpageTitle", ((f.a)localObject1).title);
          paramau.putExtra("shortUrl", ((f.a)localObject1).url);
          com.tencent.mm.bj.d.b(parama.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramau);
          GMTrace.o(2519266754560L, 18770);
          return true;
        }
      }
      paramView = parama.cci();
      localObject2 = a(parama, paramau);
      localObject3 = new Bundle();
      if (parama.wvi) {
        i = 2;
      }
      for (;;)
      {
        ((Bundle)localObject3).putInt("stat_scene", i);
        ((Bundle)localObject3).putString("stat_msg_id", "msg_" + Long.toString(paramau.field_msgSvrId));
        ((Bundle)localObject3).putString("stat_chat_talker_username", paramView);
        ((Bundle)localObject3).putString("stat_send_msg_user", (String)localObject2);
        ((com.tencent.mm.plugin.appbrand.k.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.c.class)).a(parama.vKB.vKW, parama.cci(), a(parama, paramau), parama.wvi, (f.a)localObject1);
        GMTrace.o(2519266754560L, 18770);
        return true;
        if (s.fD(paramView)) {
          i = 7;
        } else {
          i = 1;
        }
      }
    case 7: 
      if ((paramView != null) && (paramView.bJs()) && (a(parama, paramView)))
      {
        GMTrace.o(2519266754560L, 18770);
        return true;
      }
      parama.aB(paramau);
      GMTrace.o(2519266754560L, 18770);
      return true;
    case 10: 
      if (bg.nm(((f.a)localObject1).giR))
      {
        GMTrace.o(2519266754560L, 18770);
        return false;
      }
      paramView = new Intent();
      paramView.setFlags(65536);
      paramView.putExtra("key_Product_xml", ((f.a)localObject1).giR);
      paramView.putExtra("key_ProductUI_getProductInfoScene", 1);
      if (paramau.field_imgPath == null) {
        paramView.putExtra("key_ProductUI_chatting_msgId", paramau.field_msgId);
      }
      com.tencent.mm.bj.d.b(parama.vKB.vKW, "scanner", ".ui.ProductUI", paramView);
      GMTrace.o(2519266754560L, 18770);
      return true;
    case 20: 
      if (bg.nm(((f.a)localObject1).giU))
      {
        GMTrace.o(2519266754560L, 18770);
        return false;
      }
      paramView = new Intent();
      paramView.setFlags(65536);
      paramView.putExtra("key_TV_xml", ((f.a)localObject1).giU);
      paramView.putExtra("key_TV_getProductInfoScene", 1);
      if (paramau.field_imgPath == null) {
        paramView.putExtra("key_TVInfoUI_chatting_msgId", paramau.field_msgId);
      }
      com.tencent.mm.bj.d.b(parama.vKB.vKW, "shake", ".ui.TVInfoUI", paramView);
      GMTrace.o(2519266754560L, 18770);
      return true;
    case 13: 
      if (bg.nm(((f.a)localObject1).giX))
      {
        GMTrace.o(2519266754560L, 18770);
        return false;
      }
      paramView = new Intent();
      paramView.setFlags(65536);
      paramView.putExtra("key_product_info", ((f.a)localObject1).giX);
      paramView.putExtra("key_product_scene", 1);
      com.tencent.mm.bj.d.b(parama.vKB.vKW, "product", ".ui.MallProductUI", paramView);
      GMTrace.o(2519266754560L, 18770);
      return true;
    case 16: 
      if (bg.nm(((f.a)localObject1).eLl))
      {
        GMTrace.o(2519266754560L, 18770);
        return false;
      }
      paramView = new Intent();
      paramView.setFlags(65536);
      paramView.putExtra("key_card_app_msg", ((f.a)localObject1).eLl);
      paramView.putExtra("key_from_scene", ((f.a)localObject1).gjF);
      com.tencent.mm.bj.d.b(parama.vKB.vKW, "card", ".ui.CardDetailUI", paramView);
      GMTrace.o(2519266754560L, 18770);
      return true;
    case 19: 
      paramView = new Intent();
      paramView.putExtra("message_id", paramau.field_msgId);
      paramView.putExtra("record_xml", ((f.a)localObject1).giV);
      b.a(paramView, parama, paramau, this);
      com.tencent.mm.bj.d.b(parama.vKB.vKW, "record", ".ui.RecordMsgDetailUI", paramView);
      GMTrace.o(2519266754560L, 18770);
      return true;
    case 24: 
      paramView = new le();
      paramView.ePv.context = parama.vKB.vKW;
      paramView.ePv.eDr = paramau.field_msgId;
      paramView.ePv.eON = parama.wvi;
      paramView.ePv.ePw = ((f.a)localObject1).giV;
      com.tencent.mm.sdk.b.a.vgX.m(paramView);
      GMTrace.o(2519266754560L, 18770);
      return true;
    case 34: 
      label972:
      label1301:
      label1308:
      label1326:
      label1744:
      label1751:
      label1768:
      label1777:
      label1904:
      paramView = new Intent();
      paramView.putExtra("key_biz_uin", ((f.a)localObject1).gjH);
      paramView.putExtra("key_order_id", ((f.a)localObject1).gjI);
      if ((paramau.field_talker != null) && (!paramau.field_talker.equals("")) && (paramau.field_talker.endsWith("@chatroom"))) {
        paramView.putExtra("key_chatroom_name", paramau.field_talker);
      }
      com.tencent.mm.bj.d.b(parama.vKB.vKW, "card", ".ui.CardGiftAcceptUI", paramView);
      GMTrace.o(2519266754560L, 18770);
      return true;
    }
    Object localObject2 = ((f.a)localObject1).url;
    if (parama.wvi)
    {
      paramView = "groupmessage";
      localObject4 = com.tencent.mm.pluginsdk.model.app.p.s((String)localObject2, paramView);
      paramView = ((f.a)localObject1).url;
      localObject2 = getPackageInfo(parama.vKB.vKW, ((f.a)localObject1).appId);
      localObject3 = new Intent();
      ((Intent)localObject3).putExtra("rawUrl", (String)localObject4);
      ((Intent)localObject3).putExtra("webpageTitle", ((f.a)localObject1).title);
      if ((((f.a)localObject1).appId != null) && (("wx751a1acca5688ba3".equals(((f.a)localObject1).appId)) || ("wxfbc915ff7c30e335".equals(((f.a)localObject1).appId)) || ("wx482a4001c37e2b74".equals(((f.a)localObject1).appId))))
      {
        localObject4 = new Bundle();
        ((Bundle)localObject4).putString("jsapi_args_appid", ((f.a)localObject1).appId);
        ((Intent)localObject3).putExtra("jsapiargs", (Bundle)localObject4);
      }
      if (bg.nm(paramView)) {
        break label3951;
      }
      ((Intent)localObject3).putExtra("shortUrl", paramView);
      label3485:
      if (localObject2 != null) {
        break label3968;
      }
      paramView = null;
      label3492:
      ((Intent)localObject3).putExtra("version_name", paramView);
      if (localObject2 != null) {
        break label3977;
      }
      i = 0;
      label3510:
      ((Intent)localObject3).putExtra("version_code", i);
      if (!bg.nm(((f.a)localObject1).eTo))
      {
        ((Intent)localObject3).putExtra("srcUsername", ((f.a)localObject1).eTo);
        ((Intent)localObject3).putExtra("srcDisplayname", ((f.a)localObject1).eTp);
      }
      ((Intent)localObject3).putExtra("msg_id", paramau.field_msgId);
      ((Intent)localObject3).putExtra("KPublisherId", "msg_" + Long.toString(paramau.field_msgSvrId));
      ((Intent)localObject3).putExtra("KAppId", ((f.a)localObject1).appId);
      ((Intent)localObject3).putExtra("geta8key_username", parama.cci());
      ((Intent)localObject3).putExtra("pre_username", a(parama, paramau));
      ((Intent)localObject3).putExtra("from_scence", 2);
      ((Intent)localObject3).putExtra("expid_str", paramau.fwE);
      i = t.H(a(parama, paramau), parama.cci());
      ((Intent)localObject3).putExtra("prePublishId", "msg_" + Long.toString(paramau.field_msgSvrId));
      ((Intent)localObject3).putExtra("preUsername", a(parama, paramau));
      ((Intent)localObject3).putExtra("preChatName", parama.cci());
      ((Intent)localObject3).putExtra("preChatTYPE", i);
      ((Intent)localObject3).putExtra("preMsgIndex", 0);
      switch (i)
      {
      case 3: 
      case 4: 
      case 5: 
      default: 
        i = 0;
      }
    }
    for (;;)
    {
      ((Intent)localObject3).putExtra("share_report_pre_msg_url", ((f.a)localObject1).url);
      ((Intent)localObject3).putExtra("share_report_pre_msg_title", ((f.a)localObject1).title);
      ((Intent)localObject3).putExtra("share_report_pre_msg_desc", ((f.a)localObject1).description);
      ((Intent)localObject3).putExtra("share_report_pre_msg_icon_url", ((f.a)localObject1).thumburl);
      ((Intent)localObject3).putExtra("share_report_pre_msg_appid", ((f.a)localObject1).appId);
      ((Intent)localObject3).putExtra("share_report_from_scene", i);
      if (i == 5) {
        ((Intent)localObject3).putExtra("share_report_biz_username", parama.cci());
      }
      com.tencent.mm.bj.d.b(parama.vKB.vKW, "webview", ".ui.tools.WebViewUI", (Intent)localObject3);
      GMTrace.o(2519266754560L, 18770);
      return true;
      paramView = "singlemessage";
      break;
      label3951:
      ((Intent)localObject3).putExtra("shortUrl", ((f.a)localObject1).url);
      break label3485;
      label3968:
      paramView = ((PackageInfo)localObject2).versionName;
      break label3492;
      label3977:
      i = ((PackageInfo)localObject2).versionCode;
      break label3510;
      i = 2;
      continue;
      i = 3;
      continue;
      i = 5;
    }
    label4005:
    GMTrace.o(2519266754560L, 18770);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */