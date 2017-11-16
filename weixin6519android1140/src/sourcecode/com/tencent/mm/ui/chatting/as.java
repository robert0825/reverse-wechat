package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
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
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import com.tencent.mm.g.a.le;
import com.tencent.mm.g.a.mn;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelappbrand.a.b.h;
import com.tencent.mm.modelappbrand.a.e;
import com.tencent.mm.modelstat.a.a;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams.a;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.x.f.a;
import com.tencent.mm.x.f.a.a;
import com.tencent.mm.x.j;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.s;
import com.tencent.mm.y.t;
import java.util.List;

final class as
  extends ah.b
{
  private boolean sdk;
  private En_5b8fbb1e.a wvE;
  private com.tencent.mm.ao.a.a.c wvN;
  
  public as(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2219021697024L, 16533);
    c.a locala = new c.a();
    locala.gKR = R.k.cJu;
    locala.aP(com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 20), com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 20)).gKA = true;
    this.wvN = locala.Jn();
    GMTrace.o(2219021697024L, 16533);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2219155914752L, 16534);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null) && ((paramView.getTag() instanceof n)))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csg);
      ((View)localObject).setTag(new n(this.jHw).s((View)localObject, true));
    }
    GMTrace.o(2219155914752L, 16534);
    return (View)localObject;
  }
  
  public final void a(final ah.a parama, int paramInt, final En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2219290132480L, 16535);
    final n localn = (n)parama;
    this.wvE = parama1;
    localn.reset();
    Object localObject2 = paramau.field_content;
    parama1.wCp.aR(paramau);
    parama1.wCp.aS(paramau);
    parama1.wCp.aT(paramau);
    int i;
    if (this.sdk)
    {
      i = paramau.field_content.indexOf(':');
      if (i != -1) {
        localObject2 = paramau.field_content.substring(i + 1);
      }
    }
    for (;;)
    {
      f.a locala;
      Object localObject3;
      final Object localObject1;
      label438:
      label465:
      com.tencent.mm.pluginsdk.model.app.f localf;
      label535:
      boolean bool;
      if (localObject2 != null)
      {
        locala = f.a.C((String)localObject2, paramau.field_reserved);
        localObject3 = j.eW((String)localObject2);
        paramString = new dr(paramau, parama1.wqK, paramInt, null, 0, (byte)0);
        localObject1 = paramString;
        if (locala != null)
        {
          localn.hqH.setText(locala.getTitle());
          localn.hqI.setText(locala.getDescription());
          localn.lVH.setMaxLines(1);
          localn.hqH.setTextColor(parama1.vKB.vKW.getResources().getColor(R.e.aOE));
          localn.hqI.setTextColor(parama1.vKB.vKW.getResources().getColor(R.e.aOa));
          localn.wsz.setBackgroundResource(R.g.aVh);
          localn.wsz.setPadding(0, parama1.vKB.vKW.getResources().getDimensionPixelSize(R.f.aQw), 0, 0);
          localn.wrM.setVisibility(0);
          localn.wsx.setVisibility(0);
          localn.hqI.setVisibility(0);
          localn.wsn.setVisibility(8);
          localn.wsp.setVisibility(8);
          localn.wso.setVisibility(8);
          localn.wsB.setVisibility(8);
          localn.wsC.setVisibility(8);
          localn.wsj.setVisibility(8);
          localn.wsk.setVisibility(8);
          localn.wsL.setVisibility(8);
          localn.wsE.setVisibility(8);
          localn.wsz.setVisibility(0);
          n.I(localn.wsy, localn.wrJ);
          localObject1 = (com.tencent.mm.x.d)locala.n(com.tencent.mm.x.d.class);
          ChattingItemFooter localChattingItemFooter = localn.wsr;
          if (localObject1 != null) {
            break label1505;
          }
          localObject1 = null;
          if (!localChattingItemFooter.b((List)localObject1, paramau.field_talker, false)) {
            break label1515;
          }
          localn.wsy.setBackgroundResource(R.g.aVz);
          localf = com.tencent.mm.pluginsdk.model.app.g.cB(locala.appId, locala.eVc);
          if ((localf != null) && (localf.bJs())) {
            b(parama1, locala, paramau);
          }
          if ((localf != null) && (localf.field_appName != null) && (localf.field_appName.trim().length() > 0)) {
            break label1529;
          }
          localObject1 = locala.appName;
          bool = true;
          com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 12);
          if ((locala.type == 20) || ("wxaf060266bfa9a35c".equals(locala.appId))) {
            bool = p.a.bIQ().bfi();
          }
          if ((!bool) || (locala.appId == null) || (locala.appId.length() <= 0) || (!com.tencent.mm.pluginsdk.model.app.g.bI((String)localObject1))) {
            break label1556;
          }
          localn.ljO.setText(com.tencent.mm.pluginsdk.model.app.g.a(parama1.vKB.vKW, localf, (String)localObject1));
          localn.ljO.setVisibility(0);
          localn.ljO.setCompoundDrawables(null, null, null, null);
          localn.wsl.setVisibility(0);
          localn.wsi.setVisibility(0);
          if ((localf == null) || (!localf.bJs())) {
            break label1539;
          }
          a(parama1, localn.ljO, paramau, locala, localf.field_packageName, paramau.field_msgSvrId);
          label714:
          a(parama1, localn.wsi, locala.appId);
          label728:
          if ((locala.gis == null) || (locala.gis.glm == 0)) {
            break label1715;
          }
          i = 1;
          label750:
          if (i != 0) {
            localn.wsl.setVisibility(8);
          }
          bool = false;
          localn.wrM.setVisibility(0);
          if ((locala.gis == null) || (locala.gis.glj != 1)) {
            break label1721;
          }
          i = 1;
          label800:
          if ((i != 0) || (!this.tIv)) {
            break label1733;
          }
          localChattingItemFooter = null;
          localObject1 = localChattingItemFooter;
          if (locala.type != 33)
          {
            localObject1 = localChattingItemFooter;
            if (locala.type != 36) {
              localObject1 = com.tencent.mm.ao.n.IZ().a(paramau.field_imgPath, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW), false);
            }
          }
          if ((localObject1 == null) || (((Bitmap)localObject1).isRecycled())) {
            break label1727;
          }
          localn.wrM.setImageBitmap((Bitmap)localObject1);
          label890:
          if (locala.type == 3) {
            localn.wsz.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
            {
              public final boolean onPreDraw()
              {
                GMTrace.i(2368540246016L, 17647);
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
                  localObject = new BitmapDrawable(com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject, R.g.aVh, j, i));
                  localn.wsz.setBackgroundDrawable((Drawable)localObject);
                  GMTrace.o(2368540246016L, 17647);
                  return true;
                }
              }
            });
          }
          label923:
          if ((locala.fwt != null) && (locala.fwt.length() != 0)) {
            break label1757;
          }
          localn.wsb.setVisibility(8);
          label952:
          localn.wsq.setOnClickListener(null);
          localn.wst.setVisibility(0);
          localn.wsm.setVisibility(8);
          localn.wsw.setVisibility(0);
          localn.wsu.setVisibility(8);
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
            paramInt = 1;
          }
        }
      }
      for (;;)
      {
        label1189:
        if (paramInt != 0)
        {
          if ((locala.title == null) || (locala.title.length() <= 0)) {
            break label6077;
          }
          localn.lVH.setVisibility(0);
          localn.lVH.setMaxLines(2);
          localn.lVH.setText(locala.title);
          label1243:
          localn.hqH.setVisibility(8);
          if (bool)
          {
            if ((locala.type != 33) && (locala.type != 36)) {
              break label6090;
            }
            paramString = com.tencent.mm.ao.n.IZ().kf(paramau.field_imgPath);
            localn.wrM.setImageResource(R.k.cJr);
            com.tencent.mm.modelappbrand.a.b.CT().a(localn.wrM, "file://" + paramString, null, null, ((com.tencent.mm.modelappbrand.g)com.tencent.mm.kernel.h.h(com.tencent.mm.modelappbrand.g.class)).aM(50, 50));
          }
        }
        label1352:
        if (!parama1.wqK) {
          if (com.tencent.mm.pluginsdk.model.app.g.g(localf))
          {
            localn.wss.setVisibility(0);
            c(parama1, localn.wss, dr.a(locala, paramau));
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
          GMTrace.o(2219290132480L, 16535);
          return;
          w.e("MicroMsg.ChattingItemAppMsgFrom", "amessage, msgid:%s, user:%s", new Object[] { Long.valueOf(paramau.field_msgId), paramString });
          localObject3 = null;
          locala = null;
          break;
          label1505:
          localObject1 = ((com.tencent.mm.x.d)localObject1).gir;
          break label438;
          label1515:
          localn.wsy.setBackgroundResource(R.g.aVv);
          break label465;
          label1529:
          localObject1 = localf.field_appName;
          break label535;
          label1539:
          a(parama1, localn.ljO, locala.appId);
          break label714;
          label1556:
          if (locala.type == 24)
          {
            localn.ljO.setText(ab.getContext().getString(R.l.dsQ));
            localn.wsl.setVisibility(0);
            localn.ljO.setVisibility(0);
            localn.wsi.setVisibility(8);
            break label728;
          }
          if ((locala.type == 19) || (((j)localObject3).glu == 19))
          {
            localn.ljO.setText(ab.getContext().getString(R.l.dfS));
            localn.wsl.setVisibility(0);
            localn.ljO.setVisibility(0);
            localn.wsi.setVisibility(8);
            break label728;
          }
          localn.wsl.setVisibility(8);
          localn.ljO.setVisibility(8);
          localn.wsi.setVisibility(8);
          break label728;
          label1715:
          i = 0;
          break label750;
          label1721:
          i = 0;
          break label800;
          label1727:
          bool = true;
          break label890;
          label1733:
          localn.wrM.setImageBitmap(BitmapFactory.decodeResource(parama1.getResources(), R.g.aYu));
          bool = false;
          break label923;
          label1757:
          localn.wsb.setVisibility(0);
          b(parama1, localn.wsb, dr.Wm(locala.fwt));
          break label952;
          if ((locala.title != null) && (locala.title.length() > 0))
          {
            localn.hqH.setVisibility(0);
            localn.hqH.setTextColor(parama1.vKB.vKW.getResources().getColor(R.e.white));
            label1838:
            localn.hqI.setVisibility(0);
            localn.hqI.setTextColor(parama1.vKB.vKW.getResources().getColor(R.e.white));
            localn.lVH.setVisibility(8);
            localn.wsm.setVisibility(4);
            localn.wsq.setVisibility(0);
            if (parama.wvC != paramau.field_msgId) {
              break label2059;
            }
            localn.wsq.setImageResource(R.g.aYe);
            label1923:
            localn.hqI.setMaxLines(2);
            if (bool)
            {
              parama = com.tencent.mm.pluginsdk.model.app.g.b(locala.appId, 1, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW));
              if ((parama != null) && (!parama.isRecycled())) {
                break label2073;
              }
              localn.wrM.setImageResource(R.k.cJd);
            }
          }
          for (;;)
          {
            parama = new cv.b();
            parama.eDr = paramau.field_msgId;
            parama.ePi = paramau.field_content;
            parama.eMk = paramau.field_imgPath;
            localn.wsq.setTag(parama);
            localn.wsq.setOnClickListener(parama1.wvd.wzg);
            parama = paramString;
            paramInt = 0;
            break;
            localn.hqH.setVisibility(8);
            break label1838;
            label2059:
            localn.wsq.setImageResource(R.g.aYf);
            break label1923;
            label2073:
            localn.wrM.setImageBitmap(parama);
          }
          if ((locala.title != null) && (locala.title.length() > 0))
          {
            localn.hqH.setVisibility(0);
            localn.hqH.setMaxLines(2);
          }
          for (;;)
          {
            localn.hqI.setVisibility(0);
            localn.lVH.setVisibility(8);
            localn.wsq.setVisibility(8);
            localn.wsm.setVisibility(4);
            localn.hqI.setMaxLines(2);
            localn.hqI.setText(bg.aF(locala.giv));
            n.a(localn, (String)localObject2, locala.giv);
            n.a(localn, Boolean.valueOf(true), paramau, locala.eAE, locala.title);
            if (!bool) {
              break label6226;
            }
            if (!bg.SM(locala.giw)) {
              break label2267;
            }
            localn.wrM.setImageResource(R.g.aTN);
            parama = paramString;
            paramInt = 0;
            break;
            localn.hqH.setVisibility(8);
          }
          label2267:
          localn.wrM.setImageResource(com.tencent.mm.pluginsdk.model.q.Oo(locala.giw));
          parama = paramString;
          paramInt = 0;
          break label1189;
          if ((locala.title != null) && (locala.title.length() > 0))
          {
            localn.hqH.setVisibility(0);
            label2319:
            localn.hqI.setVisibility(0);
            localn.lVH.setVisibility(8);
            localn.wsq.setVisibility(0);
            localn.wsq.setImageResource(R.g.bbn);
            localn.wsm.setVisibility(4);
            localn.hqI.setMaxLines(2);
            if (!bool) {
              break label6226;
            }
            parama = com.tencent.mm.pluginsdk.model.app.g.b(locala.appId, 1, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW));
            if ((parama != null) && (!parama.isRecycled())) {
              break label2454;
            }
            localn.wrM.setImageResource(R.k.cJo);
          }
          for (;;)
          {
            localn.wsq.setVisibility(8);
            parama = paramString;
            paramInt = 0;
            break;
            localn.hqH.setVisibility(8);
            break label2319;
            label2454:
            localn.wrM.setImageBitmap(parama);
          }
          localn.hqH.setVisibility(8);
          if ((locala.title != null) && (locala.title.length() > 0))
          {
            localn.lVH.setMaxLines(2);
            localn.lVH.setVisibility(0);
            localn.lVH.setText(locala.getTitle());
          }
          for (;;)
          {
            localn.hqI.setMaxLines(3);
            localn.wsq.setVisibility(8);
            localn.wsm.setVisibility(4);
            if (!bool) {
              break label6226;
            }
            parama = com.tencent.mm.pluginsdk.model.app.g.b(locala.appId, 1, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW));
            if ((parama != null) && (!parama.isRecycled())) {
              break label2670;
            }
            parama = new c.a();
            parama.gKR = R.k.cJr;
            parama.aP(com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 50), com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 50)).gKA = true;
            com.tencent.mm.ao.n.Jd().a(locala.thumburl, localn.wrM, parama.Jn());
            parama = paramString;
            paramInt = 0;
            break;
            localn.lVH.setVisibility(8);
          }
          label2670:
          localn.wrM.setImageBitmap(parama);
          parama = paramString;
          paramInt = 0;
          break label1189;
          localObject1 = ((com.tencent.mm.plugin.appbrand.k.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.b.class)).pn(locala.gkR);
          if (localObject1 != null)
          {
            parama = ((WxaAttributes)localObject1).field_nickname;
            label2719:
            if (localObject1 == null) {
              break label2949;
            }
            localObject1 = ((WxaAttributes)localObject1).field_brandIconURL;
            label2731:
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
            parama = paramString;
            paramInt = 0;
            break;
            parama = locala.eTp;
            break label2719;
            label2949:
            localObject1 = locala.gla;
            break label2731;
            localn.wsK.setText(R.l.cSi);
            continue;
            localn.wsK.setText(R.l.cSh);
          }
          localObject1 = ((com.tencent.mm.plugin.appbrand.k.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.b.class)).pn(locala.gkR);
          switch (locala.gkT)
          {
          default: 
            parama = paramString;
            paramInt = 1;
            break;
          case 2: 
          case 3: 
            if (localObject1 != null)
            {
              parama = ((WxaAttributes)localObject1).field_nickname;
              if (localObject1 == null) {
                break label3311;
              }
              localObject1 = ((WxaAttributes)localObject1).field_brandIconURL;
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
              localn.wsM.setVisibility(4);
              localn.wsN.setVisibility(0);
              com.tencent.mm.modelappbrand.a.b.CT().a(new b.h()
              {
                public final void CV()
                {
                  GMTrace.i(17902363213824L, 133383);
                  GMTrace.o(17902363213824L, 133383);
                }
                
                public final void CW()
                {
                  GMTrace.i(17902631649280L, 133385);
                  GMTrace.o(17902631649280L, 133385);
                }
                
                public final String CX()
                {
                  GMTrace.i(17902765867008L, 133386);
                  String str = "CHAT#" + com.tencent.mm.plugin.appbrand.n.g.aQ(this);
                  GMTrace.o(17902765867008L, 133386);
                  return str;
                }
                
                public final void j(Bitmap paramAnonymousBitmap)
                {
                  GMTrace.i(17902497431552L, 133384);
                  if ((paramAnonymousBitmap != null) && (!paramAnonymousBitmap.isRecycled()))
                  {
                    localn.wsM.setImageBitmap(paramAnonymousBitmap);
                    localn.wsM.setVisibility(0);
                    localn.wsN.setVisibility(4);
                    GMTrace.o(17902497431552L, 133384);
                    return;
                  }
                  localn.wsM.setVisibility(4);
                  localn.wsN.setVisibility(0);
                  GMTrace.o(17902497431552L, 133384);
                }
              }, "file://" + parama, null, ((com.tencent.mm.modelappbrand.g)com.tencent.mm.kernel.h.h(com.tencent.mm.modelappbrand.g.class)).aM(215, 172));
              parama = paramString;
              paramInt = 0;
              break;
              parama = locala.eTp;
              break label3059;
              localObject1 = locala.gla;
              break label3071;
              localn.wsK.setText(R.l.cSi);
              continue;
              localn.wsK.setText(R.l.cSh);
            }
          case 1: 
            label3059:
            label3071:
            label3311:
            if (localObject1 != null)
            {
              parama = ((WxaAttributes)localObject1).field_nickname;
              label3360:
              if (localObject1 == null) {
                break label3482;
              }
            }
            label3482:
            for (localObject1 = ((WxaAttributes)localObject1).field_brandIconURL;; localObject1 = null)
            {
              localn.wsz.setVisibility(8);
              localn.wsL.setVisibility(8);
              localn.wsE.setVisibility(0);
              localn.wsG.setText(parama);
              if (!bg.nm((String)localObject1)) {
                break label3488;
              }
              parama = com.tencent.mm.ao.n.IZ().kf(paramau.field_imgPath);
              com.tencent.mm.modelappbrand.a.b.CT().a(localn.wsF, "file://" + parama, com.tencent.mm.modelappbrand.a.a.CS(), e.grO);
              parama = paramString;
              paramInt = 0;
              break;
              parama = locala.title;
              break label3360;
            }
            label3488:
            com.tencent.mm.modelappbrand.a.b.CT().a(localn.wsF, (String)localObject1, com.tencent.mm.modelappbrand.a.a.CS(), e.grO);
            parama = paramString;
            paramInt = 0;
            break;
            localn.hqH.setVisibility(8);
            if ((locala.title != null) && (locala.title.trim().length() > 0))
            {
              localn.lVH.setVisibility(0);
              localn.lVH.setText(locala.getTitle());
            }
            for (;;)
            {
              localn.hqI.setMaxLines(3);
              localn.wsq.setVisibility(8);
              localn.wsm.setVisibility(0);
              if (!bool) {
                break label6226;
              }
              parama = com.tencent.mm.pluginsdk.model.app.g.b(locala.appId, 1, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW));
              if ((parama != null) && (!parama.isRecycled())) {
                break label3666;
              }
              localn.wrM.setImageResource(R.k.cJr);
              parama = paramString;
              paramInt = 0;
              break;
              localn.lVH.setVisibility(8);
            }
            label3666:
            localn.wrM.setImageBitmap(parama);
            parama = paramString;
            paramInt = 0;
            break;
            localn.lVH.setVisibility(0);
            if (locala.giQ == 1) {
              localn.lVH.setText(R.l.dVA);
            }
            for (;;)
            {
              if ((locala.title != null) && (locala.title.length() > 0))
              {
                localn.hqH.setVisibility(0);
                localn.hqH.setText(locala.getTitle());
              }
              localn.hqI.setMaxLines(4);
              localn.wsm.setVisibility(4);
              localn.wsq.setVisibility(8);
              if (!bool) {
                break label6226;
              }
              parama = com.tencent.mm.ao.n.IZ().a(paramau.field_imgPath, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW));
              if ((parama == null) || (parama.isRecycled())) {
                break label3896;
              }
              localn.wrM.setImageBitmap(parama);
              parama = paramString;
              paramInt = 0;
              break;
              if (locala.giQ == 2) {
                localn.lVH.setText(R.l.dVC);
              } else if (locala.giQ == 3) {
                localn.lVH.setText(R.l.dVB);
              } else {
                localn.lVH.setText(R.l.dVD);
              }
            }
            label3896:
            localn.wrM.setImageResource(R.k.cJr);
            parama = paramString;
            paramInt = 0;
            break;
            localn.hqH.setVisibility(0);
            localn.hqH.setText(locala.getTitle());
            localn.lVH.setVisibility(0);
            localn.lVH.setText(R.l.dgw);
            localn.hqI.setMaxLines(4);
            localn.wsm.setVisibility(4);
            localn.wsq.setVisibility(8);
            if (!bool) {
              break label6226;
            }
            parama = com.tencent.mm.ao.n.IZ().a(paramau.field_imgPath, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW));
            if ((parama != null) && (!parama.isRecycled()))
            {
              localn.wrM.setImageBitmap(parama);
              parama = paramString;
              paramInt = 0;
              break;
            }
            localn.wrM.setImageResource(R.k.cJr);
            parama = paramString;
            paramInt = 0;
            break;
            if ((locala.title != null) && (locala.title.length() > 0))
            {
              localn.hqH.setVisibility(0);
              localn.hqH.setText(locala.getTitle());
              localn.lVH.setVisibility(8);
            }
            localn.hqI.setMaxLines(4);
            localn.wsm.setVisibility(4);
            localn.wsq.setVisibility(8);
            if (!bool) {
              break label6226;
            }
            parama = com.tencent.mm.ao.n.IZ().a(paramau.field_imgPath, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW));
            if ((parama != null) && (!parama.isRecycled()))
            {
              localn.wrM.setImageBitmap(parama);
              parama = paramString;
              paramInt = 0;
              break;
            }
            localn.wrM.setImageResource(R.k.cJr);
            parama = paramString;
            paramInt = 0;
            break;
            if ((locala.title != null) && (locala.title.length() > 0)) {
              localn.hqH.setVisibility(0);
            }
            for (;;)
            {
              localn.hqI.setVisibility(0);
              localn.lVH.setVisibility(8);
              localn.wsq.setVisibility(8);
              localn.wsm.setVisibility(4);
              localn.hqI.setMaxLines(2);
              if (!bool) {
                break label6226;
              }
              parama = com.tencent.mm.pluginsdk.model.app.g.b(locala.appId, 1, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW));
              if ((parama != null) && (!parama.isRecycled())) {
                break label4355;
              }
              localn.wrM.setImageResource(R.k.cJr);
              parama = paramString;
              paramInt = 0;
              break;
              localn.hqH.setVisibility(8);
            }
            label4355:
            localn.wrM.setImageBitmap(parama);
            parama = paramString;
            paramInt = 0;
            break;
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
              parama = new dr(paramau, false, paramInt, "", 8, false, locala.title, locala.eTo, locala.eTp, locala.title, locala.giY, locala.url, false, false);
              localn.wsy.setTag(parama);
              paramInt = 0;
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
                  break label4789;
                }
                localn.wrM.setImageResource(R.k.cJr);
              }
            }
            for (;;)
            {
              parama = new dr(paramau, paramInt, "", parama1.cel(), locala.eTo, locala.eTp, locala.title, locala.gkF, locala.designerName, locala.designerRediretctUrl, locala.url);
              localn.wsy.setTag(parama);
              paramInt = 0;
              break;
              localn.hqH.setVisibility(8);
              break label4613;
              label4789:
              localn.wrM.setImageBitmap(parama);
            }
            if ((locala.title != null) && (locala.title.length() > 0))
            {
              localn.hqH.setVisibility(0);
              label4829:
              localn.hqI.setVisibility(0);
              localn.lVH.setVisibility(8);
              localn.wsq.setVisibility(8);
              localn.wsm.setVisibility(4);
              localn.hqI.setMaxLines(2);
              if (bool)
              {
                parama = com.tencent.mm.ao.n.IZ().a(paramau.field_imgPath, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW));
                if ((parama != null) && (!parama.isRecycled())) {
                  break label5086;
                }
                localn.wrM.setImageResource(R.k.cJr);
              }
              label4925:
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
                break label5098;
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
              paramInt = 0;
              break;
              localn.hqH.setVisibility(8);
              break label4829;
              label5086:
              localn.wrM.setImageBitmap(parama);
              break label4925;
              label5098:
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
                break label6226;
              }
              parama = com.tencent.mm.ao.n.IZ().a(paramau.field_imgPath, com.tencent.mm.br.a.getDensity(parama1.vKB.vKW));
              if (parama == null) {
                break label5336;
              }
              localn.wrM.setImageBitmap(parama);
              parama = paramString;
              paramInt = 0;
              break;
              localn.lVH.setVisibility(8);
            }
            label5336:
            localn.wrM.setImageResource(R.k.cJr);
            parama = paramString;
            paramInt = 0;
            break;
            localn.hqH.setVisibility(8);
            localn.lVH.setVisibility(0);
            if ((locala.title != null) && (locala.title.trim().length() > 0)) {
              localn.lVH.setText(com.tencent.mm.pluginsdk.ui.d.h.b(localn.lVH.getContext(), locala.title, localn.lVH.getTextSize()));
            }
            for (;;)
            {
              localn.hqI.setMaxLines(3);
              localn.wsq.setVisibility(8);
              localn.wsm.setVisibility(4);
              if (bool)
              {
                localn.wrM.setVisibility(8);
                localn.wsx.setVisibility(8);
              }
              n.a(parama1, localn, locala, paramau, bool);
              parama = paramString;
              paramInt = 0;
              break;
              localn.lVH.setText(com.tencent.mm.pluginsdk.ui.d.h.b(localn.lVH.getContext(), ab.getContext().getString(R.l.dvi), localn.lVH.getTextSize()));
            }
            n.a(parama1, localn, locala, bool);
            parama = paramString;
            paramInt = 0;
            break;
            if ((locala.title != null) && (locala.title.length() > 0))
            {
              localn.hqH.setVisibility(0);
              if (!bg.nm(locala.gjN))
              {
                localn.hqH.setTextColor(bg.aL(locala.gjN, parama1.vKB.vKW.getResources().getColor(R.e.black)));
                label5629:
                localn.hqI.setMaxLines(2);
                localn.hqI.setVisibility(0);
                if (bg.nm(locala.gjO)) {
                  break label5951;
                }
                localn.hqI.setTextColor(bg.aL(locala.gjO, parama1.vKB.vKW.getResources().getColor(R.e.aNR)));
                label5690:
                localn.lVH.setVisibility(8);
                localn.wsm.setVisibility(4);
                localn.wsq.setVisibility(8);
                localn.wsl.setVisibility(0);
                localn.ljO.setVisibility(0);
                if (bg.nm(locala.gjJ)) {
                  break label5978;
                }
                localn.ljO.setText(locala.gjJ);
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
                      GMTrace.i(17903436955648L, 133391);
                      if (paramAnonymousb.bitmap != null)
                      {
                        paramAnonymousString = paramAnonymousb.bitmap;
                        localn.wsz.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
                        {
                          public final boolean onPreDraw()
                          {
                            GMTrace.i(17897934028800L, 133350);
                            as.3.this.wvO.wsz.getViewTreeObserver().removeOnPreDrawListener(this);
                            int j = as.3.this.wvO.wsz.getHeight();
                            int k = as.3.this.wvO.wsz.getWidth();
                            int i = j;
                            if (j == 0) {
                              i = com.tencent.mm.br.a.V(as.3.this.wrC.vKB.vKW, R.f.aRI);
                            }
                            j = k;
                            if (k == 0) {
                              j = com.tencent.mm.br.a.V(as.3.this.wrC.vKB.vKW, R.f.aRJ);
                            }
                            BitmapDrawable localBitmapDrawable = new BitmapDrawable(com.tencent.mm.sdk.platformtools.d.a(paramAnonymousString, R.g.aVh, j, i));
                            as.3.this.wvO.wsz.setBackgroundDrawable(localBitmapDrawable);
                            GMTrace.o(17897934028800L, 133350);
                            return true;
                          }
                        });
                      }
                      GMTrace.o(17903436955648L, 133391);
                    }
                    
                    public final void ku(String paramAnonymousString)
                    {
                      GMTrace.i(17903302737920L, 133390);
                      GMTrace.o(17903302737920L, 133390);
                    }
                  });
                  parama = paramString;
                  paramInt = 0;
                  break;
                  localn.hqH.setTextColor(parama1.vKB.vKW.getResources().getColor(R.e.black));
                  break label5629;
                  localn.hqH.setVisibility(8);
                  break label5629;
                  label5951:
                  localn.hqI.setTextColor(parama1.vKB.vKW.getResources().getColor(R.e.aNR));
                  break label5690;
                  label5978:
                  localn.ljO.setText(R.l.dfR);
                  continue;
                }
                localn.wsz.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
                {
                  public final boolean onPreDraw()
                  {
                    GMTrace.i(17896457633792L, 133339);
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
                      localObject = new BitmapDrawable(com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject, R.g.aVh, j, i));
                      localn.wsz.setBackgroundDrawable((Drawable)localObject);
                      GMTrace.o(17896457633792L, 133339);
                      return true;
                    }
                  }
                });
                parama = paramString;
                paramInt = 0;
                break;
              }
            }
            localn.wrM.setImageBitmap(BitmapFactory.decodeResource(parama1.getResources(), R.g.aYu));
            parama = paramString;
            paramInt = 0;
            break;
            if (((j)localObject3).glu != 19) {
              break label6226;
            }
            n.a(parama1, localn, locala, bool);
            parama = paramString;
            paramInt = 0;
            break;
            label6077:
            localn.lVH.setVisibility(8);
            break label1243;
            label6090:
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
              break label1352;
            }
            localn.wrM.setImageResource(R.g.aTN);
            break label1352;
            localn.wss.setVisibility(8);
            localObject1 = parama;
            continue;
            localn.wss.setVisibility(8);
            localObject1 = parama;
          }
        }
        label6226:
        parama = paramString;
        paramInt = 0;
      }
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2219424350208L, 16536);
    int i = ((dr)paramView.getTag()).position;
    int j = l.Oz(this.wvE.cV(paramau.field_content, paramau.field_isSend));
    f.a locala = f.a.eS(this.wvE.cV(paramau.field_content, paramau.field_isSend));
    Object localObject = com.tencent.mm.pluginsdk.model.app.g.aP(locala.appId, false);
    if ((com.tencent.mm.pluginsdk.model.app.g.h((com.tencent.mm.pluginsdk.model.app.f)localObject)) && (!aa.am(paramau)))
    {
      if (locala.type != 6) {
        break label565;
      }
      com.tencent.mm.pluginsdk.model.app.b localb = l.OA(locala.eAE);
      if (((localb == null) || (!d.c(paramau, localb.field_fileFullPath))) && (!paramau.bTO())) {
        paramContextMenu.add(i, 111, 0, this.wvE.getString(R.l.dSi));
      }
    }
    if ((locala.giv <= 0) || ((locala.giv > 0) && (j >= 100))) {}
    boolean bool;
    switch (locala.type)
    {
    default: 
      bool = false;
      label267:
      if ((bool) && (!this.wvE.ceh())) {
        paramContextMenu.add(i, 114, 0, paramView.getContext().getString(R.l.dfZ));
      }
      if ((com.tencent.mm.bj.d.LL("favorite")) && ((localObject == null) || (!((com.tencent.mm.pluginsdk.model.app.f)localObject).bJs()))) {
        switch (locala.type)
        {
        }
      }
      break;
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
      GMTrace.o(2219424350208L, 16536);
      return true;
      label565:
      paramContextMenu.add(i, 111, 0, this.wvE.getString(R.l.dSi));
      break;
      bool = com.tencent.mm.af.f.Fx();
      break label267;
      bool = com.tencent.mm.af.f.Ft();
      break label267;
      bool = com.tencent.mm.af.f.Fw();
      break label267;
      bool = com.tencent.mm.af.f.Fo();
      break label267;
      bool = com.tencent.mm.af.f.Fm();
      break label267;
      bool = com.tencent.mm.af.f.Fv();
      break label267;
      bool = com.tencent.mm.af.f.Fp();
      break label267;
      bool = false;
      if ((locala.gjF != 5) && (locala.gjF != 6) && (locala.gjF != 2)) {
        break label267;
      }
      if (locala.gjF != 2) {
        paramContextMenu.clear();
      }
      paramContextMenu.add(i, 100, 0, this.wvE.getString(R.l.dgd));
      GMTrace.o(2219424350208L, 16536);
      return false;
      paramContextMenu.clear();
      paramContextMenu.add(i, 100, 0, this.wvE.getString(R.l.dgd));
      GMTrace.o(2219424350208L, 16536);
      return false;
      paramContextMenu.add(i, 116, 0, paramView.getContext().getString(R.l.dNH));
    }
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2219558567936L, 16537);
    switch (paramMenuItem.getItemId())
    {
    default: 
      GMTrace.o(2219558567936L, 16537);
      return false;
    case 100: 
      Object localObject = paramau.field_content;
      paramMenuItem = null;
      if (localObject != null) {
        paramMenuItem = f.a.eS((String)localObject);
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
      }
      bc.S(paramau.field_msgId);
      localObject = com.tencent.mm.pluginsdk.model.app.g.aP(paramMenuItem.appId, false);
      if ((localObject != null) && (((com.tencent.mm.pluginsdk.model.app.f)localObject).bJs())) {
        a(parama, paramMenuItem, paramau, (com.tencent.mm.pluginsdk.model.app.f)localObject);
      }
      GMTrace.o(2219558567936L, 16537);
      return false;
    case 111: 
      d.a(parama, paramau, a(parama, paramau));
      GMTrace.o(2219558567936L, 16537);
      return false;
    }
    paramMenuItem = paramau.field_content;
    if (paramMenuItem == null)
    {
      GMTrace.o(2219558567936L, 16537);
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
      GMTrace.o(2219558567936L, 16537);
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
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2219692785664L, 16538);
    com.tencent.mm.modelstat.a.a(paramau, a.a.gWs);
    Object localObject1 = paramau.field_content;
    paramView = Boolean.valueOf(false);
    if (localObject1 == null)
    {
      GMTrace.o(2219692785664L, 16538);
      return false;
    }
    f.a locala = f.a.eS(parama.cV((String)localObject1, paramau.field_isSend));
    localObject1 = j.eW((String)localObject1);
    if (locala == null)
    {
      GMTrace.o(2219692785664L, 16538);
      return false;
    }
    if (((j)localObject1).glu != 0)
    {
      paramView = Boolean.valueOf(true);
      locala.type = ((j)localObject1).glu;
    }
    localObject1 = com.tencent.mm.pluginsdk.model.app.g.aP(locala.appId, false);
    if ((localObject1 != null) && (((com.tencent.mm.pluginsdk.model.app.f)localObject1).bJs())) {
      a(parama, locala, c(parama, paramau), (com.tencent.mm.pluginsdk.model.app.f)localObject1, paramau.field_msgSvrId);
    }
    int j;
    Object localObject2;
    Object localObject3;
    int i;
    switch (locala.type)
    {
    default: 
      j = 1;
      if ((j == 0) || (locala.url == null) || (locala.url.equals(""))) {
        break label3021;
      }
      if (!bg.nm(locala.canvasPageXml))
      {
        paramView = new Intent();
        paramView.putExtra("sns_landig_pages_from_source", 5);
        paramView.putExtra("msg_id", paramau.field_msgId);
        paramView.putExtra("sns_landing_pages_xml", locala.canvasPageXml);
        paramView.putExtra("sns_landing_pages_share_thumb_url", paramau.field_imgPath);
        paramView.addFlags(268435456);
        com.tencent.mm.bj.d.b(parama.vKB.vKW, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", paramView);
        GMTrace.o(2219692785664L, 16538);
        return true;
      }
      break;
    case 3: 
      com.tencent.mm.plugin.report.service.g.ork.i(13043, new Object[] { Integer.valueOf(2), locala.description, locala.appId });
    case 4: 
      if ((com.tencent.mm.p.a.aR(parama.vKB.vKW)) || (com.tencent.mm.p.a.aP(parama.vKB.vKW)))
      {
        w.i("MicroMsg.ChattingItemAppMsgFrom", "Voip is running, can't do this");
        GMTrace.o(2219692785664L, 16538);
        return true;
      }
      if (a(parama, locala, paramau))
      {
        GMTrace.o(2219692785664L, 16538);
        return true;
      }
      localObject1 = com.tencent.mm.pluginsdk.model.app.p.s(locala.url, "message");
      localObject2 = com.tencent.mm.pluginsdk.model.app.p.s(locala.giu, "message");
      localObject3 = getPackageInfo(parama.vKB.vKW, locala.appId);
      if (localObject3 == null)
      {
        paramView = null;
        if (localObject3 != null) {
          break label604;
        }
      }
      for (i = 0;; i = ((PackageInfo)localObject3).versionCode)
      {
        a(parama, (String)localObject1, (String)localObject2, paramView, i, locala.appId, true, paramau.field_msgId, paramau.field_msgSvrId, paramau);
        GMTrace.o(2219692785664L, 16538);
        return true;
        paramView = ((PackageInfo)localObject3).versionName;
        break;
      }
    case 6: 
      if (!this.tIv)
      {
        com.tencent.mm.ui.base.u.fo(parama.vKB.vKW);
        GMTrace.o(2219692785664L, 16538);
        return true;
      }
      paramView = new Intent();
      paramView.setClassName(parama.vKB.vKW, "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
      paramView.putExtra("app_msg_id", paramau.field_msgId);
      parama.startActivity(paramView);
      GMTrace.o(2219692785664L, 16538);
      return true;
    case 7: 
      if ((localObject1 != null) && (((com.tencent.mm.pluginsdk.model.app.f)localObject1).bJs()) && (a(parama, (com.tencent.mm.pluginsdk.model.app.f)localObject1)))
      {
        GMTrace.o(2219692785664L, 16538);
        return true;
      }
      if ((locala.eAE == null) || (locala.eAE.length() == 0)) {
        parama.aB(paramau);
      }
      for (;;)
      {
        GMTrace.o(2219692785664L, 16538);
        return true;
        if (!this.tIv)
        {
          com.tencent.mm.ui.base.u.fo(parama.vKB.vKW);
          GMTrace.o(2219692785664L, 16538);
          return true;
        }
        paramView = new Intent();
        paramView.setClassName(parama.vKB.vKW, "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
        paramView.putExtra("app_msg_id", paramau.field_msgId);
        parama.startActivityForResult(paramView, 210);
      }
    case 10: 
      if (bg.nm(locala.giR))
      {
        GMTrace.o(2219692785664L, 16538);
        return false;
      }
      paramView = new Intent();
      paramView.setFlags(65536);
      paramView.putExtra("key_Product_xml", locala.giR);
      paramView.putExtra("key_ProductUI_getProductInfoScene", 1);
      if (paramau.field_imgPath == null) {
        paramView.putExtra("key_ProductUI_chatting_msgId", paramau.field_msgId);
      }
      com.tencent.mm.bj.d.b(parama.vKB.vKW, "scanner", ".ui.ProductUI", paramView);
      GMTrace.o(2219692785664L, 16538);
      return true;
    case 20: 
      if (bg.nm(locala.giU))
      {
        GMTrace.o(2219692785664L, 16538);
        return false;
      }
      paramView = new Intent();
      paramView.setFlags(65536);
      paramView.putExtra("key_TV_xml", locala.giU);
      paramView.putExtra("key_TV_getProductInfoScene", 1);
      if (paramau.field_imgPath == null) {
        paramView.putExtra("key_TVInfoUI_chatting_msgId", paramau.field_msgId);
      }
      com.tencent.mm.bj.d.b(parama.vKB.vKW, "shake", ".ui.TVInfoUI", paramView);
      GMTrace.o(2219692785664L, 16538);
      return true;
    case 13: 
      if (bg.nm(locala.giX))
      {
        GMTrace.o(2219692785664L, 16538);
        return false;
      }
      paramView = new Intent();
      paramView.setFlags(65536);
      paramView.putExtra("key_product_info", locala.giX);
      paramView.putExtra("key_product_scene", 1);
      com.tencent.mm.bj.d.b(parama.vKB.vKW, "product", ".ui.MallProductUI", paramView);
      GMTrace.o(2219692785664L, 16538);
      return true;
    case 19: 
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("message_id", paramau.field_msgId);
      ((Intent)localObject1).putExtra("record_xml", locala.giV);
      ((Intent)localObject1).putExtra("big_appmsg", paramView);
      b.a((Intent)localObject1, parama, paramau, this);
      com.tencent.mm.bj.d.b(parama.vKB.vKW, "record", ".ui.RecordMsgDetailUI", (Intent)localObject1);
      GMTrace.o(2219692785664L, 16538);
      return true;
    case 16: 
      if (bg.nm(locala.eLl))
      {
        GMTrace.o(2219692785664L, 16538);
        return false;
      }
      paramView = new Intent();
      paramView.setFlags(65536);
      paramView.putExtra("key_card_app_msg", locala.eLl);
      paramView.putExtra("key_from_scene", locala.gjF);
      com.tencent.mm.bj.d.b(parama.vKB.vKW, "card", ".ui.CardDetailUI", paramView);
      GMTrace.o(2219692785664L, 16538);
      return true;
    case 33: 
      w.i("MicroMsg.ChattingItemAppMsgFrom", "username: %s , path: %s ,appid %s ,url : %s, pkgType : %s, md5 : %s", new Object[] { locala.gkR, locala.gkQ, locala.gkS, locala.url, Integer.valueOf(locala.gkY), locala.gkU });
      localObject2 = parama.cci();
      localObject3 = a(parama, paramau);
      paramView = new Bundle();
      if ((parama instanceof AppBrandServiceChattingUI.a))
      {
        i = 10;
        paramView.putInt("stat_scene", i);
        paramView.putString("stat_msg_id", "msg_" + Long.toString(paramau.field_msgSvrId));
        paramView.putString("stat_chat_talker_username", (String)localObject2);
        paramView.putString("stat_send_msg_user", (String)localObject3);
        switch (locala.gkT)
        {
        default: 
          i = 1;
        }
      }
      for (;;)
      {
        j = i;
        if (i != 0) {
          break;
        }
        GMTrace.o(2219692785664L, 16538);
        return true;
        if (parama.wvi)
        {
          i = 2;
          break label1410;
        }
        if (s.fD((String)localObject2))
        {
          i = 7;
          break label1410;
        }
        i = 1;
        break label1410;
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("key_username", locala.gkR);
        if (parama.wvi)
        {
          ((Intent)localObject1).putExtra("key_from_scene", 1);
          ((Intent)localObject1).putExtra("key_scene_note", (String)localObject2 + ":" + (String)localObject3);
        }
        for (;;)
        {
          localObject2 = new WxaExposedParams.a();
          ((WxaExposedParams.a)localObject2).appId = locala.gkS;
          ((WxaExposedParams.a)localObject2).eDj = 6;
          ((WxaExposedParams.a)localObject2).hKB = locala.gkY;
          ((WxaExposedParams.a)localObject2).hKC = locala.gkV;
          ((Intent)localObject1).putExtra("key_scene_exposed_params", ((WxaExposedParams.a)localObject2).UI());
          ((Intent)localObject1).putExtra("_stat_obj", paramView);
          com.tencent.mm.bj.d.b(parama.vKB.vKW, "appbrand", ".ui.AppBrandProfileUI", (Intent)localObject1);
          i = 0;
          break;
          ((Intent)localObject1).putExtra("key_from_scene", 2);
          ((Intent)localObject1).putExtra("key_scene_note", (String)localObject2);
        }
        if ((parama instanceof AppBrandServiceChattingUI.a))
        {
          com.tencent.mm.modelappbrand.a.a((String)localObject2, 1073, locala, paramView);
          i = 0;
        }
        else if (s.fD((String)localObject2))
        {
          com.tencent.mm.modelappbrand.a.a((String)localObject2, 1074, locala, paramView);
          i = 0;
        }
        else
        {
          com.tencent.mm.modelappbrand.a.a((String)localObject2, (String)localObject3, parama.wvi, locala, paramView);
          i = 0;
          continue;
          com.tencent.mm.modelappbrand.a.b((String)localObject2, (String)localObject3, parama.wvi, locala, paramView);
          i = 0;
        }
      }
    case 36: 
      if ((bg.nm(locala.gkS)) && (bg.nm(locala.gkR)))
      {
        paramau = locala.url;
        if (parama.wvi) {}
        for (paramView = "groupmessage";; paramView = "singlemessage")
        {
          paramView = com.tencent.mm.pluginsdk.model.app.p.s(paramau, paramView);
          paramau = new Intent();
          paramau.putExtra("rawUrl", paramView);
          paramau.putExtra("webpageTitle", locala.title);
          paramau.putExtra("shortUrl", locala.url);
          com.tencent.mm.bj.d.b(parama.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramau);
          GMTrace.o(2219692785664L, 16538);
          return true;
        }
      }
      paramView = parama.cci();
      localObject1 = a(parama, paramau);
      localObject2 = new Bundle();
      if (parama.wvi) {
        i = 2;
      }
      for (;;)
      {
        ((Bundle)localObject2).putInt("stat_scene", i);
        ((Bundle)localObject2).putString("stat_msg_id", "msg_" + Long.toString(paramau.field_msgSvrId));
        ((Bundle)localObject2).putString("stat_chat_talker_username", paramView);
        ((Bundle)localObject2).putString("stat_send_msg_user", (String)localObject1);
        ((com.tencent.mm.plugin.appbrand.k.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.c.class)).a(parama.vKB.vKW, parama.cci(), a(parama, paramau), parama.wvi, locala);
        GMTrace.o(2219692785664L, 16538);
        return true;
        if (s.fD(paramView)) {
          i = 7;
        } else {
          i = 1;
        }
      }
    case 24: 
      paramView = new le();
      paramView.ePv.context = parama.vKB.vKW;
      paramView.ePv.eDr = paramau.field_msgId;
      paramView.ePv.eON = parama.wvi;
      paramView.ePv.ePw = locala.giV;
      com.tencent.mm.sdk.b.a.vgX.m(paramView);
      GMTrace.o(2219692785664L, 16538);
      return true;
    case 34: 
      label604:
      label1410:
      paramView = new Intent();
      paramView.putExtra("key_from_user_name", a(parama, paramau));
      paramView.putExtra("key_biz_uin", locala.gjH);
      paramView.putExtra("key_order_id", locala.gjI);
      if ((paramau.field_talker != null) && (!paramau.field_talker.equals("")) && (paramau.field_talker.endsWith("@chatroom"))) {
        paramView.putExtra("key_chatroom_name", paramau.field_talker);
      }
      com.tencent.mm.bj.d.b(parama.vKB.vKW, "card", ".ui.CardGiftAcceptUI", paramView);
      GMTrace.o(2219692785664L, 16538);
      return true;
    }
    localObject1 = locala.url;
    if (parama.wvi)
    {
      paramView = "groupmessage";
      localObject3 = com.tencent.mm.pluginsdk.model.app.p.s((String)localObject1, paramView);
      paramView = locala.url;
      localObject1 = getPackageInfo(parama.vKB.vKW, locala.appId);
      localObject2 = new Intent();
      ((Intent)localObject2).putExtra("rawUrl", (String)localObject3);
      ((Intent)localObject2).putExtra("webpageTitle", locala.title);
      if ((locala.appId != null) && (("wx751a1acca5688ba3".equals(locala.appId)) || ("wxfbc915ff7c30e335".equals(locala.appId)) || ("wx482a4001c37e2b74".equals(locala.appId))))
      {
        localObject3 = new Bundle();
        ((Bundle)localObject3).putString("jsapi_args_appid", locala.appId);
        ((Intent)localObject2).putExtra("jsapiargs", (Bundle)localObject3);
      }
      if (bg.nm(paramView)) {
        break label2967;
      }
      ((Intent)localObject2).putExtra("shortUrl", paramView);
      label2501:
      if (localObject1 != null) {
        break label2984;
      }
      paramView = null;
      label2508:
      ((Intent)localObject2).putExtra("version_name", paramView);
      if (localObject1 != null) {
        break label2993;
      }
      i = 0;
      label2526:
      ((Intent)localObject2).putExtra("version_code", i);
      if (!bg.nm(locala.eTo))
      {
        ((Intent)localObject2).putExtra("srcUsername", locala.eTo);
        ((Intent)localObject2).putExtra("srcDisplayname", locala.eTp);
      }
      ((Intent)localObject2).putExtra("msg_id", paramau.field_msgId);
      ((Intent)localObject2).putExtra("KPublisherId", "msg_" + Long.toString(paramau.field_msgSvrId));
      ((Intent)localObject2).putExtra("KAppId", locala.appId);
      ((Intent)localObject2).putExtra("geta8key_username", parama.cci());
      ((Intent)localObject2).putExtra("pre_username", a(parama, paramau));
      ((Intent)localObject2).putExtra("from_scence", 2);
      ((Intent)localObject2).putExtra("expid_str", paramau.fwE);
      i = t.H(a(parama, paramau), parama.cci());
      ((Intent)localObject2).putExtra("prePublishId", "msg_" + Long.toString(paramau.field_msgSvrId));
      ((Intent)localObject2).putExtra("preUsername", a(parama, paramau));
      ((Intent)localObject2).putExtra("preChatName", parama.cci());
      ((Intent)localObject2).putExtra("preChatTYPE", i);
      ((Intent)localObject2).putExtra("preMsgIndex", 0);
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
      ((Intent)localObject2).putExtra("share_report_pre_msg_url", locala.url);
      ((Intent)localObject2).putExtra("share_report_pre_msg_title", locala.title);
      ((Intent)localObject2).putExtra("share_report_pre_msg_desc", locala.description);
      ((Intent)localObject2).putExtra("share_report_pre_msg_icon_url", locala.thumburl);
      ((Intent)localObject2).putExtra("share_report_pre_msg_appid", locala.appId);
      ((Intent)localObject2).putExtra("share_report_from_scene", i);
      if (i == 5) {
        ((Intent)localObject2).putExtra("share_report_biz_username", parama.cci());
      }
      com.tencent.mm.bj.d.b(parama.vKB.vKW, "webview", ".ui.tools.WebViewUI", (Intent)localObject2);
      GMTrace.o(2219692785664L, 16538);
      return true;
      paramView = "singlemessage";
      break;
      label2967:
      ((Intent)localObject2).putExtra("shortUrl", locala.url);
      break label2501;
      label2984:
      paramView = ((PackageInfo)localObject1).versionName;
      break label2508;
      label2993:
      i = ((PackageInfo)localObject1).versionCode;
      break label2526;
      i = 2;
      continue;
      i = 3;
      continue;
      i = 5;
    }
    label3021:
    GMTrace.o(2219692785664L, 16538);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */