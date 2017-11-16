package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.game.c.bb;
import com.tencent.mm.plugin.game.c.be;
import com.tencent.mm.plugin.game.c.bf;
import com.tencent.mm.plugin.game.c.bn;
import com.tencent.mm.plugin.game.c.br;
import com.tencent.mm.plugin.game.c.cn;
import com.tencent.mm.plugin.game.c.x;
import com.tencent.mm.plugin.game.d.e.a.a;
import com.tencent.mm.plugin.game.model.ae.a;
import com.tencent.mm.plugin.game.model.ae.a.a;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.l;
import com.tencent.mm.plugin.game.model.l.b;
import com.tencent.mm.plugin.game.model.m;
import com.tencent.mm.plugin.game.widget.EllipsizingTextView;
import com.tencent.mm.plugin.game.widget.TextProgressBar;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyGameInfoView
  extends LinearLayout
{
  static Map<String, View> mdg;
  private int lNQ;
  private ae.a lOj;
  private j lUz;
  private LayoutInflater lVD;
  private int lVF;
  l.b lWM;
  e lWN;
  private View.OnClickListener lXy;
  private LinearLayout lgp;
  private Context mContext;
  Map<String, m> mdf;
  
  static
  {
    GMTrace.i(12716995510272L, 94749);
    mdg = new HashMap();
    GMTrace.o(12716995510272L, 94749);
  }
  
  public MyGameInfoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12715384897536L, 94737);
    this.lXy = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12728940888064L, 94838);
        if (!(paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.game.model.c))
        {
          w.e("MicroMsg.MyGameInfoView", "No button tag retrived, ignore click");
          GMTrace.o(12728940888064L, 94838);
          return;
        }
        paramAnonymousView = (com.tencent.mm.plugin.game.model.c)paramAnonymousView.getTag();
        if (!MyGameInfoView.c(MyGameInfoView.this).containsKey(paramAnonymousView.field_appId))
        {
          w.e("MicroMsg.MyGameInfoView", "No DownloadInfo found");
          GMTrace.o(12728940888064L, 94838);
          return;
        }
        m localm = (m)MyGameInfoView.c(MyGameInfoView.this).get(paramAnonymousView.field_appId);
        localm.cB(MyGameInfoView.a(MyGameInfoView.this));
        MyGameInfoView.d(MyGameInfoView.this).a(paramAnonymousView, localm);
        GMTrace.o(12728940888064L, 94838);
      }
    };
    this.lWM = new l.b()
    {
      public final void g(int paramAnonymousInt, String paramAnonymousString, boolean paramAnonymousBoolean)
      {
        GMTrace.i(12738604564480L, 94910);
        if ((!paramAnonymousBoolean) || (bg.nm(paramAnonymousString)))
        {
          GMTrace.o(12738604564480L, 94910);
          return;
        }
        String[] arrayOfString = new String[MyGameInfoView.c(MyGameInfoView.this).keySet().size()];
        MyGameInfoView.c(MyGameInfoView.this).keySet().toArray(arrayOfString);
        paramAnonymousInt = 0;
        while (paramAnonymousInt < arrayOfString.length)
        {
          m localm = (m)MyGameInfoView.c(MyGameInfoView.this).get(arrayOfString[paramAnonymousInt]);
          if ((localm != null) && (localm.lMw != null) && ((localm.lMw.field_appId.equals(paramAnonymousString)) || (localm.lMw.field_packageName.equals(paramAnonymousString))))
          {
            localm.cB(MyGameInfoView.a(MyGameInfoView.this));
            localm.aFo();
            Object localObject = (View)MyGameInfoView.aGL().get(localm.lMw.field_appId);
            if (localObject != null)
            {
              localObject = (MyGameInfoView.a)((View)localObject).getTag();
              MyGameInfoView.d(MyGameInfoView.this).a(((MyGameInfoView.a)localObject).lZQ, ((MyGameInfoView.a)localObject).lZP, localm.lMw, (m)MyGameInfoView.c(MyGameInfoView.this).get(localm.lMw.field_appId));
            }
          }
          paramAnonymousInt += 1;
        }
        GMTrace.o(12738604564480L, 94910);
      }
    };
    this.mContext = paramContext;
    this.lVD = ((LayoutInflater)getContext().getSystemService("layout_inflater"));
    GMTrace.o(12715384897536L, 94737);
  }
  
  private void a(ae.a parama)
  {
    GMTrace.i(12715787550720L, 94740);
    this.lgp.removeAllViews();
    if (!bg.cc(parama.lOk))
    {
      Iterator localIterator = parama.lOk.iterator();
      for (int i = 0;; i = 1)
      {
        ae.a.a locala;
        do
        {
          j = i;
          if (!localIterator.hasNext()) {
            break;
          }
          locala = (ae.a.a)localIterator.next();
        } while ((locala.lOm == null) || (bg.nm(locala.lOm.field_appId)) || (bg.nm(locala.lOm.field_appName)));
        Object localObject3 = locala.lOm;
        g(this.lgp);
        Object localObject4 = new a();
        Object localObject5 = this.lVD.inflate(R.i.cyL, this.lgp, false);
        ((a)localObject4).lZL = ((ViewGroup)((View)localObject5).findViewById(R.h.bLV));
        ((a)localObject4).mdi = ((ImageView)((View)localObject5).findViewById(R.h.bEd));
        ((a)localObject4).mdj = ((TextView)((View)localObject5).findViewById(R.h.bEK));
        ((a)localObject4).mdk = ((TextView)((View)localObject5).findViewById(R.h.bCQ));
        ((a)localObject4).lZP = ((Button)((View)localObject5).findViewById(R.h.bDT));
        ((a)localObject4).lZQ = ((TextProgressBar)((View)localObject5).findViewById(R.h.bDU));
        ((a)localObject4).lZQ.oX(14);
        ((a)localObject4).lZP.setOnClickListener(this.lXy);
        ((a)localObject4).lZQ.setOnClickListener(this.lXy);
        ((a)localObject4).mdl = ((TextView)((View)localObject5).findViewById(R.h.bEp));
        label366:
        label462:
        label495:
        Object localObject2;
        if ((((com.tencent.mm.plugin.game.model.c)localObject3).aFb()) && (!g.a(this.mContext, (f)localObject3)))
        {
          if (!bg.nm(((com.tencent.mm.plugin.game.model.c)localObject3).lLS.lRU))
          {
            com.tencent.mm.plugin.game.d.e.aGQ().g(((a)localObject4).mdi, ((com.tencent.mm.plugin.game.model.c)localObject3).lLS.lRU);
            if (bg.nm(((com.tencent.mm.plugin.game.model.c)localObject3).lLS.lRT)) {
              break label796;
            }
            ((a)localObject4).mdj.setText(((com.tencent.mm.plugin.game.model.c)localObject3).lLS.lRT);
            if (((com.tencent.mm.plugin.game.model.c)localObject3).lLS.lPv != null)
            {
              ((a)localObject4).mdl.setVisibility(0);
              ((a)localObject4).mdl.setText(((com.tencent.mm.plugin.game.model.c)localObject3).lLS.lPv.lPi);
            }
          }
          try
          {
            i = Color.parseColor(((com.tencent.mm.plugin.game.model.c)localObject3).lLS.lPv.lSk);
            ((a)localObject4).mdl.setTextColor(i);
            localObject1 = ((a)localObject4).mdl.getBackground();
            if ((localObject1 != null) && ((localObject1 instanceof GradientDrawable))) {
              ((GradientDrawable)localObject1).setStroke(1, i);
            }
          }
          catch (Exception localException)
          {
            for (;;)
            {
              Object localObject1;
              w.e("MicroMsg.MyGameInfoView", localException.getMessage());
              ((a)localObject4).mdl.setVisibility(8);
            }
          }
          if (bg.nm(((com.tencent.mm.plugin.game.model.c)localObject3).lLw)) {
            break label877;
          }
          ((a)localObject4).mdk.setText(((com.tencent.mm.plugin.game.model.c)localObject3).lLL);
          ((a)localObject4).mdk.setVisibility(0);
          ((a)localObject4).lZP.setTag(localObject3);
          ((a)localObject4).lZQ.setTag(localObject3);
          localObject2 = (m)this.mdf.get(((com.tencent.mm.plugin.game.model.c)localObject3).field_appId);
          localObject1 = localObject2;
          if (localObject2 == null) {
            localObject1 = new m((com.tencent.mm.plugin.game.model.c)localObject3);
          }
          this.lWN.a(((a)localObject4).lZQ, ((a)localObject4).lZP, (com.tencent.mm.plugin.game.model.c)localObject3, (m)localObject1);
          ((a)localObject4).lZL.setOnClickListener(this.lUz);
          ((a)localObject4).lZL.setTag(localObject3);
          ((View)localObject5).setTag(localObject4);
          mdg.put(((com.tencent.mm.plugin.game.model.c)localObject3).field_appId, localObject5);
          this.lgp.addView((View)localObject5);
          localObject1 = locala.lOn;
          if (bg.cc((List)localObject1)) {
            continue;
          }
          localObject1 = ((LinkedList)localObject1).iterator();
        }
        for (;;)
        {
          label651:
          if (((Iterator)localObject1).hasNext())
          {
            localObject2 = (x)((Iterator)localObject1).next();
            if (localObject2 != null)
            {
              switch (((x)localObject2).lQq)
              {
              }
              for (;;)
              {
                if (this.lVF != 2) {
                  break label2096;
                }
                ai.a(this.mContext, 1002, ((x)localObject2).lQp, locala.lOm.field_appId, this.lNQ, ai.zJ(((x)localObject2).lPF));
                break label651;
                com.tencent.mm.plugin.game.d.e.aGQ().a(((a)localObject4).mdi, ((com.tencent.mm.plugin.game.model.c)localObject3).field_appId, a.getDensity(this.mContext));
                break;
                label796:
                ((a)localObject4).mdj.setText(((com.tencent.mm.plugin.game.model.c)localObject3).field_appName);
                break label366;
                com.tencent.mm.plugin.game.d.e.aGQ().a(((a)localObject4).mdi, ((com.tencent.mm.plugin.game.model.c)localObject3).field_appId, a.getDensity(this.mContext));
                ((a)localObject4).mdj.setText(((com.tencent.mm.plugin.game.model.c)localObject3).field_appName);
                break label462;
                label877:
                ((a)localObject4).mdk.setVisibility(8);
                break label495;
                if ((bg.nm(((x)localObject2).lQn)) || (((x)localObject2).lQr == null) || (bg.nm(((x)localObject2).lQr.eBt))) {
                  break label651;
                }
                localObject3 = this.lVD.inflate(R.i.czi, null);
                localObject4 = (MyGameTextStyleView)((View)localObject3).findViewById(R.h.bFa);
                ((MyGameTextStyleView)localObject4).lNQ = this.lNQ;
                ((MyGameTextStyleView)localObject4).appId = locala.lOm.field_appId;
                if ((localObject2 == null) || (bg.nm(((x)localObject2).lQn)) || (((x)localObject2).lQr == null) || (bg.nm(((x)localObject2).lQr.eBt)))
                {
                  ((MyGameTextStyleView)localObject4).setVisibility(8);
                  if (((MyGameTextStyleView)localObject4).getVisibility() == 0)
                  {
                    h(this.lgp);
                    this.lgp.addView((View)localObject3);
                  }
                }
                else
                {
                  ((MyGameTextStyleView)localObject4).setVisibility(0);
                  label1080:
                  boolean bool;
                  if (((x)localObject2).lQn.length() > 4)
                  {
                    ((MyGameTextStyleView)localObject4).mdm.setText(((x)localObject2).lQn.substring(0, 4));
                    if (!bg.nm(((x)localObject2).lQo))
                    {
                      ((MyGameTextStyleView)localObject4).mdn.setText(((x)localObject2).lQo);
                      ((MyGameTextStyleView)localObject4).mdn.setVisibility(0);
                    }
                    ((MyGameTextStyleView)localObject4).ikm.setText(h.b(((MyGameTextStyleView)localObject4).mContext, ((x)localObject2).lQr.eBt, ((MyGameTextStyleView)localObject4).ikm.getTextSize()));
                    bool = ((x)localObject2).lQr.lRZ;
                    if (!bg.nm(((x)localObject2).lQr.lPj))
                    {
                      ((MyGameTextStyleView)localObject4).mdp.setText(h.b(((MyGameTextStyleView)localObject4).mContext, ((x)localObject2).lQr.lPj, ((MyGameTextStyleView)localObject4).mdp.getTextSize()));
                      ((MyGameTextStyleView)localObject4).mdp.setVisibility(0);
                    }
                    if (!bg.nm(((x)localObject2).lQr.lPD))
                    {
                      localObject5 = new e.a.a();
                      switch (((x)localObject2).lQr.lRX)
                      {
                      }
                    }
                  }
                  for (;;)
                  {
                    ((MyGameTextStyleView)localObject4).setTag(localObject2);
                    ((MyGameTextStyleView)localObject4).setOnClickListener((View.OnClickListener)localObject4);
                    break;
                    ((MyGameTextStyleView)localObject4).mdm.setText(((x)localObject2).lQn);
                    break label1080;
                    ((MyGameTextStyleView)localObject4).mdu.setVisibility(0);
                    com.tencent.mm.plugin.game.d.e.aGQ().a(((MyGameTextStyleView)localObject4).mdv, ((x)localObject2).lQr.lPD, ((e.a.a)localObject5).aGR());
                    continue;
                    ((MyGameTextStyleView)localObject4).mdr.setVisibility(0);
                    ((MyGameTextStyleView)localObject4).mdq.setVisibility(0);
                    ((e.a.a)localObject5).gKZ = true;
                    ((e.a.a)localObject5).mee = R.g.aWT;
                    com.tencent.mm.plugin.game.d.e.aGQ().a(((MyGameTextStyleView)localObject4).mds, ((x)localObject2).lQr.lPD, ((e.a.a)localObject5).aGR());
                    continue;
                    if (bool)
                    {
                      ((MyGameTextStyleView)localObject4).mdw.setVisibility(0);
                      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)((MyGameTextStyleView)localObject4).mdx.getLayoutParams();
                      if (((MyGameTextStyleView)localObject4).mdp.getLineCount() < 2) {
                        localLayoutParams.addRule(15);
                      }
                      for (;;)
                      {
                        ((MyGameTextStyleView)localObject4).mdx.setLayoutParams(localLayoutParams);
                        ((e.a.a)localObject5).meb = true;
                        com.tencent.mm.plugin.game.d.e.aGQ().a(((MyGameTextStyleView)localObject4).mdy, ((x)localObject2).lQr.lPD, ((e.a.a)localObject5).aGR());
                        MyGameTextStyleView.f(((MyGameTextStyleView)localObject4).mdz, ((x)localObject2).lQr.lRY);
                        break;
                        localLayoutParams.addRule(12);
                      }
                    }
                    ((MyGameTextStyleView)localObject4).mdq.setVisibility(0);
                    ((e.a.a)localObject5).meb = true;
                    ((e.a.a)localObject5).mee = R.g.aWU;
                    com.tencent.mm.plugin.game.d.e.aGQ().a(((MyGameTextStyleView)localObject4).mds, ((x)localObject2).lQr.lPD, ((e.a.a)localObject5).aGR());
                    MyGameTextStyleView.f(((MyGameTextStyleView)localObject4).mdt, ((x)localObject2).lQr.lRY);
                  }
                  if ((bg.nm(((x)localObject2).lQn)) || (((x)localObject2).lQs == null) || (bg.nm(((x)localObject2).lQs.lPD))) {
                    break label651;
                  }
                  localObject3 = this.lVD.inflate(R.i.czh, null);
                  localObject4 = (MyGamePicStyleView)((View)localObject3).findViewById(R.h.bEM);
                  ((MyGamePicStyleView)localObject4).lNQ = this.lNQ;
                  ((MyGamePicStyleView)localObject4).appId = locala.lOm.field_appId;
                  if ((localObject2 == null) || (bg.nm(((x)localObject2).lQn)) || (((x)localObject2).lQs == null) || (bg.nm(((x)localObject2).lQs.lPD)))
                  {
                    ((MyGamePicStyleView)localObject4).setVisibility(8);
                    if (((MyGamePicStyleView)localObject4).getVisibility() == 0)
                    {
                      h(this.lgp);
                      this.lgp.addView((View)localObject3);
                    }
                  }
                  else
                  {
                    ((MyGamePicStyleView)localObject4).setVisibility(0);
                    if (((x)localObject2).lQn.length() > 4) {
                      ((MyGamePicStyleView)localObject4).mdm.setText(((x)localObject2).lQn.substring(0, 4));
                    }
                    for (;;)
                    {
                      if (!bg.nm(((x)localObject2).lQo))
                      {
                        ((MyGamePicStyleView)localObject4).mdn.setText(((x)localObject2).lQo);
                        ((MyGamePicStyleView)localObject4).mdn.setVisibility(0);
                      }
                      localObject5 = new e.a.a();
                      ((e.a.a)localObject5).mee = R.g.aWR;
                      com.tencent.mm.plugin.game.d.e.aGQ().a(((MyGamePicStyleView)localObject4).mdo, ((x)localObject2).lQs.lPD, ((e.a.a)localObject5).aGR());
                      i = Math.round((com.tencent.mm.plugin.game.d.c.getScreenWidth(((MyGamePicStyleView)localObject4).mContext) - ((MyGamePicStyleView)localObject4).getPaddingLeft() - ((MyGamePicStyleView)localObject4).getPaddingRight()) / 690.0F * 80.0F);
                      localObject5 = (RelativeLayout.LayoutParams)((MyGamePicStyleView)localObject4).mdo.getLayoutParams();
                      ((RelativeLayout.LayoutParams)localObject5).height = i;
                      ((MyGamePicStyleView)localObject4).mdo.setLayoutParams((ViewGroup.LayoutParams)localObject5);
                      ((MyGamePicStyleView)localObject4).setTag(localObject2);
                      ((MyGamePicStyleView)localObject4).setOnClickListener((View.OnClickListener)localObject4);
                      break;
                      ((MyGamePicStyleView)localObject4).mdm.setText(((x)localObject2).lQn);
                    }
                    if ((bg.nm(((x)localObject2).lQn)) || (((x)localObject2).lQu == null) || (bg.nm(((x)localObject2).lQu.eBt))) {
                      break label651;
                    }
                    localObject3 = this.lVD.inflate(R.i.czj, null);
                    localObject4 = (MyGameVideoRecomStyleView)((View)localObject3).findViewById(R.h.bPk);
                    ((MyGameVideoRecomStyleView)localObject4).lNQ = this.lNQ;
                    ((MyGameVideoRecomStyleView)localObject4).hyD = locala.lOm.field_appId;
                    if ((localObject2 != null) && (!bg.nm(((x)localObject2).lQn)) && (((x)localObject2).lQu != null) && (!bg.nm(((x)localObject2).lQu.eBt))) {
                      break label2098;
                    }
                    ((MyGameVideoRecomStyleView)localObject4).setVisibility(8);
                    label2070:
                    if (((MyGameVideoRecomStyleView)localObject4).getVisibility() != 0) {
                      break label2355;
                    }
                    h(this.lgp);
                    this.lgp.addView((View)localObject3);
                  }
                }
              }
              label2096:
              continue;
              label2098:
              ((MyGameVideoRecomStyleView)localObject4).setVisibility(0);
              if (((x)localObject2).lQn.length() > 4)
              {
                ((MyGameVideoRecomStyleView)localObject4).mdA.setText(((x)localObject2).lQn.substring(0, 4));
                label2134:
                if (bg.nm(((x)localObject2).lQo)) {
                  break label2373;
                }
                ((MyGameVideoRecomStyleView)localObject4).mdB.setText(((x)localObject2).lQo);
                ((MyGameVideoRecomStyleView)localObject4).mdB.setVisibility(0);
                label2167:
                ((MyGameVideoRecomStyleView)localObject4).kHZ.setText(h.b(((MyGameVideoRecomStyleView)localObject4).mContext, ((x)localObject2).lQu.eBt, ((MyGameVideoRecomStyleView)localObject4).kHZ.getTextSize()));
                if (bg.nm(((x)localObject2).lQu.lTb)) {
                  break label2383;
                }
                ((MyGameVideoRecomStyleView)localObject4).mdC.setText(((x)localObject2).lQu.lTb);
                ((MyGameVideoRecomStyleView)localObject4).mdC.setVisibility(0);
                label2238:
                if (bg.nm(((x)localObject2).lQu.lTg)) {
                  break label2396;
                }
                ((MyGameVideoRecomStyleView)localObject4).mdD.setText(((x)localObject2).lQu.lTg);
                ((MyGameVideoRecomStyleView)localObject4).mdD.setVisibility(0);
                label2277:
                if (bg.nm(((x)localObject2).lQu.lSc)) {
                  break label2409;
                }
                ((MyGameVideoRecomStyleView)localObject4).mdE.setText(((x)localObject2).lQu.lSc);
                ((MyGameVideoRecomStyleView)localObject4).mdE.setVisibility(0);
                label2316:
                if (!bg.nm(((x)localObject2).lQu.lPD)) {
                  break label2422;
                }
                ((MyGameVideoRecomStyleView)localObject4).mdF.setVisibility(8);
              }
              for (;;)
              {
                ((MyGameVideoRecomStyleView)localObject4).setTag(localObject2);
                ((MyGameVideoRecomStyleView)localObject4).setOnClickListener((View.OnClickListener)localObject4);
                break label2070;
                label2355:
                break;
                ((MyGameVideoRecomStyleView)localObject4).mdA.setText(((x)localObject2).lQn);
                break label2134;
                label2373:
                ((MyGameVideoRecomStyleView)localObject4).setVisibility(8);
                break label2167;
                label2383:
                ((MyGameVideoRecomStyleView)localObject4).mdC.setVisibility(8);
                break label2238;
                label2396:
                ((MyGameVideoRecomStyleView)localObject4).mdD.setVisibility(8);
                break label2277;
                label2409:
                ((MyGameVideoRecomStyleView)localObject4).mdE.setVisibility(8);
                break label2316;
                label2422:
                ((MyGameVideoRecomStyleView)localObject4).mdF.setVisibility(0);
                localObject5 = new e.a.a();
                ((e.a.a)localObject5).meb = true;
                com.tencent.mm.plugin.game.d.e.aGQ().a(((MyGameVideoRecomStyleView)localObject4).iCN, ((x)localObject2).lQu.lPD, ((e.a.a)localObject5).aGR());
                if (bg.nm(((x)localObject2).lQu.lRY))
                {
                  ((MyGameVideoRecomStyleView)localObject4).mdH.setVisibility(8);
                }
                else
                {
                  com.tencent.mm.plugin.game.d.e.aGQ().g(((MyGameVideoRecomStyleView)localObject4).mdH, ((x)localObject2).lQu.lRY);
                  ((MyGameVideoRecomStyleView)localObject4).mdH.setVisibility(0);
                }
              }
            }
          }
        }
      }
    }
    int j = 0;
    if (j != 0) {
      g(this.lgp);
    }
    if ((parama.lOl != null) && (!bg.nm(parama.lOl.lPj)) && (!bg.nm(parama.lOl.lPE)))
    {
      View localView = this.lVD.inflate(R.i.czf, this, false);
      ((TextView)localView.findViewById(R.h.text)).setText(parama.lOl.lPj);
      localView.setTag(parama.lOl.lPE);
      localView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(12663174201344L, 94348);
          if ((paramAnonymousView.getTag() == null) || (!(paramAnonymousView.getTag() instanceof String)))
          {
            GMTrace.o(12663174201344L, 94348);
            return;
          }
          paramAnonymousView = (String)paramAnonymousView.getTag();
          int i = com.tencent.mm.plugin.game.d.c.p(MyGameInfoView.a(MyGameInfoView.this), paramAnonymousView, "game_center_mygame_more");
          ai.a(MyGameInfoView.a(MyGameInfoView.this), 10, 1002, 99, i, MyGameInfoView.b(MyGameInfoView.this), null);
          GMTrace.o(12663174201344L, 94348);
        }
      });
      this.lgp.addView(localView);
      g(this.lgp);
    }
    if (j != 0)
    {
      setVisibility(0);
      GMTrace.o(12715787550720L, 94740);
      return;
    }
    setVisibility(8);
    GMTrace.o(12715787550720L, 94740);
  }
  
  private void g(ViewGroup paramViewGroup)
  {
    GMTrace.i(12715921768448L, 94741);
    paramViewGroup.addView((ImageView)this.lVD.inflate(R.i.cyG, paramViewGroup, false));
    GMTrace.o(12715921768448L, 94741);
  }
  
  private void h(ViewGroup paramViewGroup)
  {
    GMTrace.i(12716055986176L, 94742);
    ImageView localImageView = (ImageView)this.lVD.inflate(R.i.cyG, paramViewGroup, false);
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)localImageView.getLayoutParams();
    localMarginLayoutParams.leftMargin = a.fromDPToPix(this.mContext, 15);
    localImageView.setLayoutParams(localMarginLayoutParams);
    paramViewGroup.addView(localImageView);
    GMTrace.o(12716055986176L, 94742);
  }
  
  public final void a(ae.a parama, int paramInt1, int paramInt2)
  {
    GMTrace.i(12715653332992L, 94739);
    if (parama == null)
    {
      setVisibility(8);
      GMTrace.o(12715653332992L, 94739);
      return;
    }
    this.lNQ = paramInt1;
    this.lVF = paramInt2;
    this.lUz.oJ(this.lNQ);
    setVisibility(0);
    if (this.lVF == 2) {
      ai.a(this.mContext, 1002, 0, null, this.lNQ, null);
    }
    this.lOj = parama;
    final LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.lOj.lOk.iterator();
    while (localIterator.hasNext()) {
      localLinkedList.add(((ae.a.a)localIterator.next()).lOm);
    }
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12700218294272L, 94624);
        try
        {
          Iterator localIterator = localLinkedList.iterator();
          while (localIterator.hasNext())
          {
            com.tencent.mm.plugin.game.model.c localc = (com.tencent.mm.plugin.game.model.c)localIterator.next();
            if (!MyGameInfoView.c(MyGameInfoView.this).containsKey(localc.field_appId)) {
              MyGameInfoView.a(MyGameInfoView.this, localc);
            }
          }
          GMTrace.o(12700218294272L, 94624);
        }
        catch (Exception localException)
        {
          w.i("MicroMsg.MyGameInfoView", localException.getMessage());
          GMTrace.o(12700218294272L, 94624);
          return;
        }
      }
    });
    a(parama);
    GMTrace.o(12715653332992L, 94739);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12715519115264L, 94738);
    super.onFinishInflate();
    this.lgp = ((LinearLayout)findViewById(R.h.bCP));
    this.lUz = new j();
    this.lWN = new e(this.mContext);
    this.mdf = new HashMap();
    l.a(this.lWM);
    w.i("MicroMsg.MyGameInfoView", "initView finished");
    GMTrace.o(12715519115264L, 94738);
  }
  
  private static final class a
  {
    public ViewGroup lZL;
    public Button lZP;
    public TextProgressBar lZQ;
    public ImageView mdi;
    public TextView mdj;
    public TextView mdk;
    public TextView mdl;
    
    public a()
    {
      GMTrace.i(12688407134208L, 94536);
      GMTrace.o(12688407134208L, 94536);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\MyGameInfoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */