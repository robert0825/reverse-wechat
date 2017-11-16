package com.tencent.mm.plugin.card.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Message;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.g.a.bv;
import com.tencent.mm.plugin.card.a.g.a;
import com.tencent.mm.plugin.card.a.i.b;
import com.tencent.mm.plugin.card.b.d.a;
import com.tencent.mm.plugin.card.model.CardGiftInfo;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.plugin.card.sharecard.ui.CardConsumeCodeUI;
import com.tencent.mm.plugin.card.ui.a.a;
import com.tencent.mm.plugin.card.ui.view.i;
import com.tencent.mm.plugin.card.ui.view.k;
import com.tencent.mm.plugin.card.ui.view.y;
import com.tencent.mm.plugin.card.ui.view.z;
import com.tencent.mm.pluginsdk.ui.applet.o.a;
import com.tencent.mm.protocal.c.agi;
import com.tencent.mm.protocal.c.au;
import com.tencent.mm.protocal.c.bdu;
import com.tencent.mm.protocal.c.jm;
import com.tencent.mm.protocal.c.jo;
import com.tencent.mm.protocal.c.jp;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.protocal.c.np;
import com.tencent.mm.protocal.c.pu;
import com.tencent.mm.protocal.c.ql;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.MMVerticalTextView;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.u.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@SuppressLint({"UseSparseArrays"})
public final class e
  implements g.a, n, MMActivity.a
{
  ListView Ev;
  private final String TAG;
  LinearLayout dl;
  boolean eIE;
  View.OnClickListener hwh;
  public MMActivity iPC;
  private View jBw;
  public int jCn;
  public String jCo;
  public String jCp;
  public ArrayList<String> jCq;
  public ArrayList<String> jCr;
  public boolean jEA;
  i jEB;
  i jEC;
  com.tencent.mm.plugin.card.widget.g jED;
  public com.tencent.mm.plugin.card.ui.view.g jEE;
  m jEF;
  i jEG;
  i jEH;
  i jEI;
  i jEJ;
  i jEK;
  i jEL;
  i jEM;
  i jEN;
  com.tencent.mm.plugin.card.ui.view.d jEO;
  i jEP;
  public j jEQ;
  public boolean jER;
  com.tencent.mm.plugin.card.a.f jES;
  public String jET;
  public String jEU;
  public HashMap<Integer, String> jEV;
  public HashMap<String, String> jEW;
  public ArrayList<String> jEX;
  public d jEY;
  public a jEZ;
  com.tencent.mm.plugin.card.ui.a.g jEy;
  i jEz;
  private ae jFa;
  com.tencent.mm.sdk.b.c jFb;
  public com.tencent.mm.plugin.card.base.b jwZ;
  public List<com.tencent.mm.plugin.card.model.b> jxd;
  public ArrayList<jp> jxf;
  
  public e(MMActivity paramMMActivity, View paramView)
  {
    GMTrace.i(4964847976448L, 36991);
    this.TAG = "MicroMsg.CardDetailUIContoller";
    this.jEA = false;
    this.jER = true;
    this.jxd = new ArrayList();
    this.jET = "";
    this.jEU = "";
    this.jCn = 0;
    this.jCo = "";
    this.jCp = "";
    this.jCq = new ArrayList();
    this.jCr = new ArrayList();
    this.jEV = new HashMap();
    this.jEW = new HashMap();
    this.jEX = new ArrayList();
    this.eIE = false;
    this.jFa = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(18900406239232L, 140819);
        if ((paramAnonymousMessage.obj != null) && ((paramAnonymousMessage.obj instanceof e.c)))
        {
          paramAnonymousMessage = (e.c)paramAnonymousMessage.obj;
          if (paramAnonymousMessage.jFl == e.b.jFj)
          {
            if (e.this.jEE != null)
            {
              com.tencent.mm.plugin.card.b.d.a(e.this.iPC, paramAnonymousMessage.eAR, false);
              e.this.jEE.amP();
              GMTrace.o(18900406239232L, 140819);
            }
          }
          else if (paramAnonymousMessage.jFl == e.b.jFh)
          {
            if (e.this.jEE != null)
            {
              e.this.jEE.d(com.tencent.mm.plugin.card.b.c.jLd);
              GMTrace.o(18900406239232L, 140819);
            }
          }
          else if (e.this.jEE != null) {
            e.this.jEE.d(paramAnonymousMessage.jFm);
          }
        }
        GMTrace.o(18900406239232L, 140819);
      }
    };
    this.hwh = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        boolean bool = true;
        int i = 0;
        GMTrace.i(18898929844224L, 140808);
        if ((paramAnonymousView.getId() == R.h.biX) || (paramAnonymousView.getId() == R.h.biO))
        {
          if (e.this.jwZ.aja())
          {
            if (e.this.jEY != null)
            {
              e.this.jEY.alr();
              GMTrace.o(18898929844224L, 140808);
            }
          }
          else if ((e.this.jwZ.ajb()) && (e.this.jEY != null))
          {
            e.this.jEY.alp();
            GMTrace.o(18898929844224L, 140808);
          }
        }
        else
        {
          if ((paramAnonymousView.getId() == R.h.bCd) || (paramAnonymousView.getId() == R.h.bcr))
          {
            com.tencent.mm.plugin.card.b.b.P(e.this.iPC, e.this.jEZ.jEj);
            GMTrace.o(18898929844224L, 140808);
            return;
          }
          Object localObject;
          if ((paramAnonymousView.getId() == R.h.bpC) || (paramAnonymousView.getId() == R.h.bpt))
          {
            if (paramAnonymousView.getId() == R.h.bpC)
            {
              e.this.jER = false;
              if ((e.this.jEE instanceof com.tencent.mm.plugin.card.ui.view.q))
              {
                localObject = ((com.tencent.mm.plugin.card.ui.view.q)e.this.jEE).e(com.tencent.mm.plugin.card.b.c.jLf);
                e.this.jEQ.jIS = ((String)localObject);
              }
              localObject = e.this.jEQ;
              bool = e.this.jER;
              ((j)localObject).alW();
              ((j)localObject).jER = bool;
              if ((((j)localObject).hwd != null) && (!((j)localObject).hwd.isShowing()))
              {
                ((j)localObject).hwd.showAtLocation(paramAnonymousView.getRootView(), 17, 0, 0);
                ((j)localObject).hwd.setFocusable(true);
                ((j)localObject).hwd.setTouchable(true);
                ((j)localObject).hwd.setBackgroundDrawable(new ColorDrawable(16777215));
                ((j)localObject).hwd.setOutsideTouchable(true);
                if (!((j)localObject).jER) {
                  break label766;
                }
                ((j)localObject).jIO.setOnClickListener(((j)localObject).hwh);
                paramAnonymousView = ((j)localObject).jIK;
                if (((j)localObject).jBA == null) {
                  break label678;
                }
                ((j)localObject).jIK = com.tencent.mm.plugin.card.b.l.t(((j)localObject).jBA);
                label412:
                ((j)localObject).jIO.setImageBitmap(((j)localObject).jIK);
                ((j)localObject).jIR.add(0, paramAnonymousView);
                ((j)localObject).alY();
                ((j)localObject).hwf.setVisibility(8);
                ((j)localObject).jIN.setVisibility(0);
                paramAnonymousView = ((j)localObject).jwZ.ajw().code;
                if ((((j)localObject).jwZ.ajv().uan != null) && (((j)localObject).jwZ.ajv().uan.ugq)) {
                  break label720;
                }
                if (com.tencent.pb.common.c.h.isNullOrEmpty(((j)localObject).jwZ.ajw().tZs)) {
                  break label687;
                }
                paramAnonymousView = ((j)localObject).jwZ.ajw().tZs;
                label541:
                if ((TextUtils.isEmpty(paramAnonymousView)) || (paramAnonymousView.length() > 40)) {
                  break label740;
                }
                ((j)localObject).jIP.setText(com.tencent.mm.plugin.card.b.m.uL(paramAnonymousView));
                if (!((j)localObject).jwZ.ajk()) {
                  break label727;
                }
                ((j)localObject).jIP.setVisibility(0);
                label591:
                if (TextUtils.isEmpty(((j)localObject).jwZ.ajv().jWE)) {
                  break label753;
                }
                ((j)localObject).jIQ.setText(((j)localObject).jwZ.ajv().jWE);
                ((j)localObject).jIQ.setVisibility(0);
              }
            }
            for (;;)
            {
              ((j)localObject).hwd.update();
              GMTrace.o(18898929844224L, 140808);
              return;
              if (paramAnonymousView.getId() != R.h.bpt) {
                break;
              }
              e.this.jER = true;
              break;
              label678:
              ((j)localObject).jIK = null;
              break label412;
              label687:
              if (!((j)localObject).jwZ.ajp()) {
                break label541;
              }
              if (!com.tencent.pb.common.c.h.isNullOrEmpty(((j)localObject).jIS))
              {
                paramAnonymousView = ((j)localObject).jIS;
                break label541;
              }
              label720:
              paramAnonymousView = "";
              break label541;
              label727:
              ((j)localObject).jIP.setVisibility(8);
              break label591;
              label740:
              ((j)localObject).jIP.setVisibility(8);
              break label591;
              label753:
              ((j)localObject).jIQ.setVisibility(8);
            }
            label766:
            ((j)localObject).hwe.setOnClickListener(((j)localObject).hwh);
            ((j)localObject).hwe.setImageBitmap(((j)localObject).hwc);
            paramAnonymousView = ((j)localObject).jwZ.ajw().code;
            if ((((j)localObject).jwZ.ajv().uan == null) || (!((j)localObject).jwZ.ajv().uan.ugq)) {
              if (!com.tencent.pb.common.c.h.isNullOrEmpty(((j)localObject).jwZ.ajw().tZs))
              {
                paramAnonymousView = ((j)localObject).jwZ.ajw().tZs;
                label874:
                if ((TextUtils.isEmpty(paramAnonymousView)) || (paramAnonymousView.length() > 40)) {
                  break label1048;
                }
                ((j)localObject).jIL.setText(com.tencent.mm.plugin.card.b.m.uL(paramAnonymousView));
                if (!((j)localObject).jwZ.ajk()) {
                  break label1035;
                }
                ((j)localObject).jIL.setVisibility(0);
                label924:
                if (TextUtils.isEmpty(((j)localObject).jwZ.ajv().jWE)) {
                  break label1061;
                }
                ((j)localObject).jIM.setText(((j)localObject).jwZ.ajv().jWE);
                ((j)localObject).jIM.setVisibility(0);
              }
            }
            for (;;)
            {
              ((j)localObject).hwf.setVisibility(0);
              ((j)localObject).jIN.setVisibility(8);
              break;
              if (!((j)localObject).jwZ.ajp()) {
                break label874;
              }
              if (!com.tencent.pb.common.c.h.isNullOrEmpty(((j)localObject).jIS))
              {
                paramAnonymousView = ((j)localObject).jIS;
                break label874;
              }
              paramAnonymousView = "";
              break label874;
              label1035:
              ((j)localObject).jIL.setVisibility(8);
              break label924;
              label1048:
              ((j)localObject).jIL.setVisibility(8);
              break label924;
              label1061:
              ((j)localObject).jIM.setVisibility(8);
            }
          }
          int j;
          String str1;
          int k;
          String str2;
          if ((paramAnonymousView.getId() == R.h.bjG) || (paramAnonymousView.getId() == R.h.bjC) || (paramAnonymousView.getId() == R.h.bjB) || (paramAnonymousView.getId() == R.h.bpJ) || (paramAnonymousView.getId() == R.h.bjA))
          {
            if (paramAnonymousView.getId() == R.h.bjG)
            {
              if (e.this.jwZ.ajb())
              {
                paramAnonymousView = com.tencent.mm.plugin.report.service.g.ork;
                j = e.this.jwZ.ajv().jxG;
                localObject = e.this.jwZ.ajA();
                str1 = e.this.jwZ.ajz();
                k = e.this.jEZ.jBM;
                str2 = e.this.jEZ.jEj;
                if (e.this.jwZ.ajt()) {}
                for (i = 1;; i = 0)
                {
                  paramAnonymousView.i(11324, new Object[] { "CardConsumedCodeUI", Integer.valueOf(j), localObject, str1, Integer.valueOf(0), Integer.valueOf(k), str2, Integer.valueOf(i), "" });
                  if (e.this.jEY == null) {
                    break;
                  }
                  e.this.jEY.dy(true);
                  GMTrace.o(18898929844224L, 140808);
                  return;
                }
              }
              paramAnonymousView = new i.b();
              e.this.a(true, paramAnonymousView, false);
              GMTrace.o(18898929844224L, 140808);
              return;
            }
            if ((paramAnonymousView.getId() == R.h.bpJ) && (e.this.jwZ.ajv().uaq))
            {
              GMTrace.o(18898929844224L, 140808);
              return;
            }
            if (e.this.jwZ.ajb())
            {
              if (e.this.jEY != null)
              {
                e.this.jEY.dy(false);
                GMTrace.o(18898929844224L, 140808);
              }
            }
            else
            {
              paramAnonymousView = new i.b();
              e.this.a(false, paramAnonymousView, false);
              GMTrace.o(18898929844224L, 140808);
            }
          }
          else if (paramAnonymousView.getId() == R.h.bdq)
          {
            if (!TextUtils.isEmpty(e.this.jwZ.ajv().tZU))
            {
              com.tencent.mm.plugin.card.b.b.a(e.this.iPC, e.this.jwZ.ajv().tZU, 3);
              com.tencent.mm.plugin.report.service.g.ork.i(11941, new Object[] { Integer.valueOf(13), e.this.jwZ.ajz(), e.this.jwZ.ajA(), "", e.this.jwZ.ajv().tZT });
              GMTrace.o(18898929844224L, 140808);
            }
          }
          else
          {
            if (paramAnonymousView.getId() == R.h.bli)
            {
              com.tencent.mm.plugin.report.service.g.ork.i(11582, new Object[] { "OpenShareUserSelectView", Integer.valueOf(0), Integer.valueOf(e.this.jwZ.ajv().jxG), e.this.jwZ.ajA(), e.this.jwZ.ajz(), e.this.jEZ.jEj });
              paramAnonymousView = new Intent();
              paramAnonymousView.putExtra("KLabel_range_index", e.this.jCn);
              paramAnonymousView.putExtra("Klabel_name_list", e.this.jCo);
              paramAnonymousView.putExtra("Kother_user_name_list", e.this.jCp);
              paramAnonymousView.putExtra("k_sns_label_ui_title", e.this.iPC.getString(R.l.ddH));
              paramAnonymousView.putExtra("k_sns_label_ui_style", 0);
              paramAnonymousView.putExtra("Ktag_rangeFilterprivate", true);
              com.tencent.mm.bj.d.b(e.this.iPC, "sns", ".ui.SnsLabelUI", paramAnonymousView, 2);
              e.this.iPC.vKC = e.this;
              GMTrace.o(18898929844224L, 140808);
              return;
            }
            if (paramAnonymousView.getId() == R.h.blt)
            {
              if (e.this.jwZ.ajw().tZg != null)
              {
                localObject = e.this.jwZ.ajw().tZg;
                i = ((Integer)paramAnonymousView.getTag()).intValue();
                paramAnonymousView = (np)((LinkedList)localObject).get(i);
                if (com.tencent.mm.plugin.card.b.b.a(e.this.jwZ.ajz(), paramAnonymousView, e.this.jEZ.jBM, e.this.jEZ.jFf))
                {
                  com.tencent.mm.plugin.report.service.g.ork.i(11941, new Object[] { Integer.valueOf(19), e.this.jwZ.ajz(), e.this.jwZ.ajA(), "", paramAnonymousView.title });
                  GMTrace.o(18898929844224L, 140808);
                  return;
                }
                if ((paramAnonymousView != null) && (!TextUtils.isEmpty(paramAnonymousView.url)))
                {
                  com.tencent.mm.plugin.card.b.b.a(e.this.iPC, paramAnonymousView.url, 1);
                  localObject = com.tencent.mm.plugin.report.service.g.ork;
                  switch (i)
                  {
                  default: 
                    i = 10;
                  }
                }
                for (;;)
                {
                  ((com.tencent.mm.plugin.report.service.g)localObject).i(11941, new Object[] { Integer.valueOf(i), e.this.jwZ.ajz(), e.this.jwZ.ajA(), "", paramAnonymousView.title });
                  if (com.tencent.mm.plugin.card.b.l.a(paramAnonymousView, e.this.jwZ.ajz()))
                  {
                    localObject = e.this.jwZ.ajz();
                    paramAnonymousView = paramAnonymousView.title;
                    com.tencent.mm.plugin.card.b.l.uJ((String)localObject);
                    com.tencent.mm.plugin.card.b.b.a(e.this.iPC, e.this.jwZ.ajv().jyT);
                  }
                  GMTrace.o(18898929844224L, 140808);
                  return;
                  i = 10;
                  continue;
                  i = 11;
                  continue;
                  i = 12;
                  continue;
                  i = 16;
                }
              }
            }
            else if (paramAnonymousView.getId() == R.h.blu)
            {
              if (e.this.jwZ.ajw().tZg != null)
              {
                localObject = (np)e.this.jwZ.ajw().tZg.get(0);
                if (com.tencent.mm.plugin.card.b.b.a(e.this.jwZ.ajz(), (np)localObject, e.this.jEZ.jBM, e.this.jEZ.jFf))
                {
                  com.tencent.mm.plugin.report.service.g.ork.i(11941, new Object[] { Integer.valueOf(19), e.this.jwZ.ajz(), e.this.jwZ.ajA(), "", ((np)localObject).title });
                  GMTrace.o(18898929844224L, 140808);
                  return;
                }
                if ((localObject != null) && (!TextUtils.isEmpty(((np)localObject).url)))
                {
                  com.tencent.mm.plugin.card.b.b.a(e.this.iPC, ((np)localObject).url, 1);
                  com.tencent.mm.plugin.report.service.g.ork.i(11941, new Object[] { Integer.valueOf(10), e.this.jwZ.ajz(), e.this.jwZ.ajA(), "", ((np)localObject).title });
                  if (com.tencent.mm.plugin.card.b.l.a((np)localObject, e.this.jwZ.ajz()))
                  {
                    paramAnonymousView = e.this.jwZ.ajz();
                    localObject = ((np)localObject).title;
                    com.tencent.mm.plugin.card.b.l.uJ(paramAnonymousView);
                    com.tencent.mm.plugin.card.b.b.a(e.this.iPC, e.this.jwZ.ajv().jyT);
                  }
                }
                GMTrace.o(18898929844224L, 140808);
              }
            }
            else if ((paramAnonymousView.getId() == R.h.blT) || (paramAnonymousView.getId() == R.h.blb))
            {
              if (e.this.jwZ.ajw().tZn != null) {
                if (e.this.jwZ.ajn())
                {
                  if (e.this.jwZ.ajb())
                  {
                    if (e.this.jEY != null)
                    {
                      e.this.jEY.dy(false);
                      GMTrace.o(18898929844224L, 140808);
                    }
                  }
                  else
                  {
                    paramAnonymousView = new i.b();
                    e.this.a(false, paramAnonymousView, false);
                    GMTrace.o(18898929844224L, 140808);
                  }
                }
                else
                {
                  if (e.this.jwZ.ajo())
                  {
                    paramAnonymousView = new i.b();
                    com.tencent.mm.plugin.card.b.b.a(e.this.iPC, paramAnonymousView.jxv, paramAnonymousView.jxw, false, e.this.jwZ);
                    GMTrace.o(18898929844224L, 140808);
                    return;
                  }
                  paramAnonymousView = e.this.jwZ.ajw().tZn;
                  if (com.tencent.mm.plugin.card.b.b.a(e.this.jwZ.ajz(), paramAnonymousView, e.this.jEZ.jBM, e.this.jEZ.jFf))
                  {
                    com.tencent.mm.plugin.report.service.g.ork.i(11941, new Object[] { Integer.valueOf(20), e.this.jwZ.ajz(), e.this.jwZ.ajA(), "", paramAnonymousView.title });
                    GMTrace.o(18898929844224L, 140808);
                    return;
                  }
                  if ((paramAnonymousView != null) && (!TextUtils.isEmpty(paramAnonymousView.url)))
                  {
                    localObject = com.tencent.mm.plugin.card.b.l.r(paramAnonymousView.url, paramAnonymousView.uaJ);
                    com.tencent.mm.plugin.card.b.b.a(e.this.iPC, (String)localObject, 1);
                    com.tencent.mm.plugin.report.service.g.ork.i(11941, new Object[] { Integer.valueOf(9), e.this.jwZ.ajz(), e.this.jwZ.ajA(), "", paramAnonymousView.title });
                    if (com.tencent.mm.plugin.card.b.l.a(paramAnonymousView, e.this.jwZ.ajz()))
                    {
                      localObject = e.this.jwZ.ajz();
                      paramAnonymousView = paramAnonymousView.title;
                      com.tencent.mm.plugin.card.b.l.uJ((String)localObject);
                      com.tencent.mm.plugin.card.b.b.a(e.this.iPC, e.this.jwZ.ajv().jyT);
                    }
                  }
                  GMTrace.o(18898929844224L, 140808);
                }
              }
            }
            else
            {
              String str3;
              if ((paramAnonymousView.getId() == R.h.bjR) || (paramAnonymousView.getId() == R.h.biZ))
              {
                paramAnonymousView = e.this.jwZ.ajv().uaa;
                localObject = com.tencent.mm.plugin.report.service.g.ork;
                j = e.this.jwZ.ajv().jxG;
                str1 = e.this.jwZ.ajA();
                str2 = e.this.jwZ.ajz();
                k = e.this.jEZ.jBM;
                str3 = e.this.jEZ.jEj;
                if (e.this.jwZ.ajt()) {
                  i = 1;
                }
                ((com.tencent.mm.plugin.report.service.g)localObject).i(11324, new Object[] { "CardLeftRightIntroduceView", Integer.valueOf(j), str1, str2, Integer.valueOf(0), Integer.valueOf(k), str3, Integer.valueOf(i), "" });
                if ((paramAnonymousView != null) && (!TextUtils.isEmpty(paramAnonymousView.url)))
                {
                  com.tencent.mm.plugin.card.b.b.a(e.this.iPC, paramAnonymousView.url, 1);
                  GMTrace.o(18898929844224L, 140808);
                  return;
                }
                paramAnonymousView = new Intent();
                if ((e.this.jwZ instanceof CardInfo)) {
                  paramAnonymousView.putExtra("key_card_info_data", (CardInfo)e.this.jwZ);
                }
                for (;;)
                {
                  paramAnonymousView.setClass(e.this.iPC, CardDetailPreference.class);
                  e.this.iPC.startActivity(paramAnonymousView);
                  GMTrace.o(18898929844224L, 140808);
                  return;
                  if ((e.this.jwZ instanceof ShareCardInfo)) {
                    paramAnonymousView.putExtra("key_card_info_data", (ShareCardInfo)e.this.jwZ);
                  }
                }
              }
              if (paramAnonymousView.getId() == R.h.ceB)
              {
                if (com.tencent.mm.plugin.card.sharecard.a.b.uc(e.this.jwZ.ajA()) <= 1)
                {
                  GMTrace.o(18898929844224L, 140808);
                  return;
                }
                paramAnonymousView = e.this;
                if (!e.this.jEA) {}
                for (;;)
                {
                  paramAnonymousView.jEA = bool;
                  e.this.akN();
                  GMTrace.o(18898929844224L, 140808);
                  return;
                  bool = false;
                }
              }
              if (paramAnonymousView.getId() == R.h.bjd)
              {
                if ((e.this.jwZ.ajv().tZW != null) && (!TextUtils.isEmpty(e.this.jwZ.ajv().tZW.url)))
                {
                  com.tencent.mm.plugin.card.b.b.a(e.this.iPC, e.this.jwZ.ajv().tZW.url, 3);
                  com.tencent.mm.plugin.report.service.g.ork.i(11941, new Object[] { Integer.valueOf(3), e.this.jwZ.ajz(), e.this.jwZ.ajA(), "", e.this.jwZ.ajv().tZW.text });
                  GMTrace.o(18898929844224L, 140808);
                }
              }
              else if (paramAnonymousView.getId() == R.h.biV)
              {
                if ((e.this.jwZ.ajv().uad != null) && (!bg.nm(e.this.jwZ.ajv().uad.url)))
                {
                  com.tencent.mm.plugin.card.b.b.a(e.this.iPC, e.this.jwZ.ajv().uad.url, 1);
                  com.tencent.mm.plugin.report.service.g.ork.i(11941, new Object[] { Integer.valueOf(14), e.this.jwZ.ajz(), e.this.jwZ.ajA(), "", e.this.jwZ.ajv().uad.text });
                  GMTrace.o(18898929844224L, 140808);
                }
              }
              else if ((paramAnonymousView.getId() == R.h.ceG) || (paramAnonymousView.getId() == R.h.ceH))
              {
                if (e.this.jwZ.ajv().tZM > 0)
                {
                  if ((e.this.jxf == null) || (e.this.jxf.size() == 0))
                  {
                    com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CardDetailUIContoller", "mShopList == null || mShopList.size() == 0");
                    GMTrace.o(18898929844224L, 140808);
                    return;
                  }
                  paramAnonymousView = (jp)e.this.jxf.get(0);
                  com.tencent.mm.plugin.card.b.b.a(e.this.iPC, paramAnonymousView.eMl, paramAnonymousView.eNR, paramAnonymousView.gEy);
                  localObject = com.tencent.mm.plugin.report.service.g.ork;
                  j = e.this.jwZ.ajv().jxG;
                  str1 = e.this.jwZ.ajA();
                  str2 = e.this.jwZ.ajz();
                  k = e.this.jEZ.jBM;
                  str3 = e.this.jEZ.jEj;
                  if (e.this.jwZ.ajt()) {}
                  for (i = 1;; i = 0)
                  {
                    ((com.tencent.mm.plugin.report.service.g)localObject).i(11324, new Object[] { "UsedStoresView", Integer.valueOf(j), str1, str2, Integer.valueOf(0), Integer.valueOf(k), str3, Integer.valueOf(i), "" });
                    com.tencent.mm.plugin.report.service.g.ork.i(11941, new Object[] { Integer.valueOf(5), e.this.jwZ.ajz(), e.this.jwZ.ajA(), "", paramAnonymousView.name });
                    GMTrace.o(18898929844224L, 140808);
                    return;
                  }
                }
              }
              else
              {
                if (paramAnonymousView.getId() == R.h.chk)
                {
                  if ((e.this.jxf == null) || (e.this.jxf.size() == 0))
                  {
                    com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CardDetailUIContoller", "mShopList == null || mShopList.size() == 0");
                    GMTrace.o(18898929844224L, 140808);
                    return;
                  }
                  localObject = (jp)e.this.jxf.get(0);
                  paramAnonymousView = (String)paramAnonymousView.getTag();
                  if ((!TextUtils.isEmpty(paramAnonymousView)) && (paramAnonymousView.equals(e.this.iPC.getString(R.l.dch))))
                  {
                    e.this.alH();
                    GMTrace.o(18898929844224L, 140808);
                    return;
                  }
                  if (!TextUtils.isEmpty(((jp)localObject).jzu))
                  {
                    com.tencent.mm.plugin.card.b.b.a(e.this.iPC, ((jp)localObject).jzu, 1);
                    com.tencent.mm.plugin.report.service.g.ork.i(11941, new Object[] { Integer.valueOf(4), e.this.jwZ.ajz(), e.this.jwZ.ajA(), "", ((jp)localObject).name });
                  }
                  GMTrace.o(18898929844224L, 140808);
                  return;
                }
                if (paramAnonymousView.getId() == R.h.chf) {
                  e.this.alH();
                }
              }
            }
          }
        }
        GMTrace.o(18898929844224L, 140808);
      }
    };
    this.jFb = new com.tencent.mm.sdk.b.c() {};
    this.iPC = paramMMActivity;
    this.jBw = paramView;
    GMTrace.o(4964847976448L, 36991);
  }
  
  private String akP()
  {
    GMTrace.i(4967666548736L, 37012);
    String str;
    if ((!TextUtils.isEmpty(this.jCo)) && (!TextUtils.isEmpty(this.jCp)))
    {
      str = this.jCo + "," + com.tencent.mm.plugin.card.b.l.uH(this.jCp);
      GMTrace.o(4967666548736L, 37012);
      return str;
    }
    if (!TextUtils.isEmpty(this.jCo))
    {
      str = this.jCo;
      GMTrace.o(4967666548736L, 37012);
      return str;
    }
    if (!TextUtils.isEmpty(this.jCp))
    {
      str = com.tencent.mm.plugin.card.b.l.uH(this.jCp);
      GMTrace.o(4967666548736L, 37012);
      return str;
    }
    GMTrace.o(4967666548736L, 37012);
    return "";
  }
  
  private void alF()
  {
    GMTrace.i(4967398113280L, 37010);
    int i = R.g.aXV;
    if (this.jwZ.ajc()) {
      i = R.g.aUV;
    }
    this.iPC.a(0, i, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(18897050796032L, 140794);
        com.tencent.mm.plugin.report.service.g.ork.i(11582, new Object[] { "CardDetailUiMenu", Integer.valueOf(1), Integer.valueOf(e.this.jwZ.ajv().jxG), e.this.jwZ.ajA(), e.this.jwZ.ajz(), e.this.jEZ.jEj });
        paramAnonymousMenuItem = (String[])e.this.jEX.toArray(new String[e.this.jEX.size()]);
        com.tencent.mm.ui.base.h.a(e.this.iPC.vKB.vKW, null, paramAnonymousMenuItem, null, false, new h.c()
        {
          public final void hQ(int paramAnonymous2Int)
          {
            GMTrace.i(18897453449216L, 140797);
            Object localObject1 = (String)e.this.jEV.get(Integer.valueOf(paramAnonymous2Int));
            if (TextUtils.isEmpty((CharSequence)localObject1))
            {
              GMTrace.o(18897453449216L, 140797);
              return;
            }
            Object localObject2;
            Object localObject3;
            String str1;
            if (((String)localObject1).equals("menu_func_share_friend"))
            {
              localObject1 = e.this;
              com.tencent.mm.plugin.card.b.b.a(((e)localObject1).iPC, 1, (MMActivity.a)localObject1);
              ((e)localObject1).iPC.vKC = ((MMActivity.a)localObject1);
              localObject1 = com.tencent.mm.plugin.report.service.g.ork;
              int i = e.this.jwZ.ajv().jxG;
              localObject2 = e.this.jwZ.ajA();
              localObject3 = e.this.jwZ.ajz();
              int j = e.this.jEZ.jBM;
              str1 = e.this.jEZ.jEj;
              if (e.this.jwZ.ajt()) {}
              for (paramAnonymous2Int = 1;; paramAnonymous2Int = 0)
              {
                ((com.tencent.mm.plugin.report.service.g)localObject1).i(11324, new Object[] { "BrandContactView", Integer.valueOf(i), localObject2, localObject3, Integer.valueOf(0), Integer.valueOf(j), str1, Integer.valueOf(paramAnonymous2Int), "" });
                com.tencent.mm.plugin.report.service.g.ork.i(11582, new Object[] { "OperShareFriend", Integer.valueOf(1), Integer.valueOf(e.this.jwZ.ajv().jxG), e.this.jwZ.ajA(), e.this.jwZ.ajz(), e.this.jET });
                GMTrace.o(18897453449216L, 140797);
                return;
              }
            }
            if (((String)localObject1).equals("menu_func_gift"))
            {
              e.this.alG();
              GMTrace.o(18897453449216L, 140797);
              return;
            }
            if (((String)localObject1).equals("menu_func_delete"))
            {
              localObject1 = "";
              if (e.this.jwZ.ajc()) {
                localObject1 = e.this.iPC.getString(R.l.dcu);
              }
              com.tencent.mm.plugin.card.b.d.a(e.this.iPC, e.this.jEZ.jwL, (String)localObject1, new d.a()
              {
                public final void aiZ()
                {
                  GMTrace.i(18882286845952L, 140684);
                  if (e.this.jEY != null) {
                    e.this.jEY.alq();
                  }
                  GMTrace.o(18882286845952L, 140684);
                }
              });
              com.tencent.mm.plugin.report.service.g.ork.i(11582, new Object[] { "OperDelete", Integer.valueOf(1), Integer.valueOf(e.this.jwZ.ajv().jxG), e.this.jwZ.ajA(), e.this.jwZ.ajz(), "" });
              GMTrace.o(18897453449216L, 140797);
              return;
            }
            if (((String)localObject1).equals("menu_func_service"))
            {
              if (!TextUtils.isEmpty(e.this.jwZ.ajv().tZF))
              {
                com.tencent.mm.plugin.card.b.b.Q(e.this.iPC, e.this.jwZ.ajv().tZF);
                al.akt().m(e.this.jwZ.ajz(), e.this.jwZ.ajA(), 1);
              }
              com.tencent.mm.plugin.report.service.g.ork.i(11582, new Object[] { "OperService", Integer.valueOf(1), Integer.valueOf(e.this.jwZ.ajv().jxG), e.this.jwZ.ajA(), e.this.jwZ.ajz(), e.this.jEZ.jEj });
              GMTrace.o(18897453449216L, 140797);
              return;
            }
            if (((String)localObject1).equals("menu_func_report"))
            {
              if (!TextUtils.isEmpty(e.this.jwZ.ajw().tZj)) {
                com.tencent.mm.plugin.card.b.b.a(e.this.iPC, e.this.jwZ.ajw().tZj, e.this.getString(R.l.dds));
              }
              com.tencent.mm.plugin.report.service.g.ork.i(11582, new Object[] { "OperReport", Integer.valueOf(1), Integer.valueOf(e.this.jwZ.ajv().jxG), e.this.jwZ.ajA(), e.this.jwZ.ajz(), "" });
              GMTrace.o(18897453449216L, 140797);
              return;
            }
            if (((String)localObject1).equals("menu_func_share_timeline"))
            {
              com.tencent.mm.platformtools.j.a(new com.tencent.mm.plugin.card.model.m(e.this.jwZ.ajv().jxH));
              localObject1 = e.this.iPC;
              localObject3 = e.this.jwZ;
              str1 = e.this.jEZ.jwL;
              String str2 = e.this.jEZ.jEl;
              localObject2 = new Intent();
              ((Intent)localObject2).putExtra("Ksnsupload_link", ((com.tencent.mm.plugin.card.base.b)localObject3).ajv().tZO);
              ((Intent)localObject2).putExtra("KContentObjDesc", ((com.tencent.mm.plugin.card.base.b)localObject3).ajv().jyT);
              ((Intent)localObject2).putExtra("Ksnsupload_title", ((com.tencent.mm.plugin.card.base.b)localObject3).ajv().title);
              if (TextUtils.isEmpty(str2)) {
                ((Intent)localObject2).putExtra("KUploadProduct_UserData", str1 + "#");
              }
              for (;;)
              {
                ((Intent)localObject2).putExtra("Ksnsupload_imgurl", ((com.tencent.mm.plugin.card.base.b)localObject3).ajv().jxH);
                if (!TextUtils.isEmpty(((com.tencent.mm.plugin.card.base.b)localObject3).ajv().jxH)) {
                  ((Intent)localObject2).putExtra("KsnsUpload_imgPath", new com.tencent.mm.plugin.card.model.m(((com.tencent.mm.plugin.card.base.b)localObject3).ajv().jxH).Pm());
                }
                com.tencent.mm.sdk.platformtools.w.d("MicroMsg.CardActivityHelper", "doShareTimeLine KSnsUploadImgPath:" + ((Intent)localObject2).getStringExtra("KsnsUpload_imgPath"));
                ((Intent)localObject2).putExtra("src_username", com.tencent.mm.y.q.zE());
                ((Intent)localObject2).putExtra("src_displayname", com.tencent.mm.y.q.zG());
                ((Intent)localObject2).putExtra("Ksnsupload_appid", ((com.tencent.mm.plugin.card.base.b)localObject3).ajv().eSd);
                ((Intent)localObject2).putExtra("Ksnsupload_appname", ((com.tencent.mm.plugin.card.base.b)localObject3).ajv().tZF);
                ((Intent)localObject2).putExtra("Ksnsupload_type", 7);
                localObject3 = com.tencent.mm.y.u.gy("card_package");
                com.tencent.mm.y.u.Av().p((String)localObject3, true).o("prePublishId", "card_package");
                ((Intent)localObject2).putExtra("reportSessionId", (String)localObject3);
                com.tencent.mm.bj.d.a((Context)localObject1, "sns", ".ui.En_c4f742e5", (Intent)localObject2, false);
                com.tencent.mm.plugin.report.service.g.ork.i(11582, new Object[] { "OperShareTimeLine", Integer.valueOf(1), Integer.valueOf(e.this.jwZ.ajv().jxG), e.this.jwZ.ajA(), e.this.jwZ.ajz(), e.this.jEZ.jEj });
                GMTrace.o(18897453449216L, 140797);
                return;
                ((Intent)localObject2).putExtra("KUploadProduct_UserData", str1 + "#" + str2);
              }
            }
            if (((String)localObject1).equals("menu_func_delete_share_card"))
            {
              com.tencent.mm.plugin.card.b.d.a(e.this.iPC, e.this.jEZ.jwL, "", new d.a()
              {
                public final void aiZ()
                {
                  GMTrace.i(18881884192768L, 140681);
                  if (e.this.jEY != null) {
                    e.this.jEY.alt();
                  }
                  GMTrace.o(18881884192768L, 140681);
                }
              });
              GMTrace.o(18897453449216L, 140797);
              return;
            }
            localObject1 = (String)e.this.jEW.get(localObject1);
            if (!bg.nm((String)localObject1)) {
              com.tencent.mm.plugin.card.b.b.a(e.this.iPC, (String)localObject1, 0);
            }
            GMTrace.o(18897453449216L, 140797);
          }
        });
        GMTrace.o(18897050796032L, 140794);
        return true;
      }
    });
    GMTrace.o(4967398113280L, 37010);
  }
  
  private void l(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(4967129677824L, 37008);
    if (this.jED != null) {
      this.jED.l(paramBoolean1, paramBoolean2);
    }
    GMTrace.o(4967129677824L, 37008);
  }
  
  private void lQ(int paramInt)
  {
    GMTrace.i(4967263895552L, 37009);
    LinkedList localLinkedList = this.jwZ.ajw().tZl;
    if (localLinkedList == null)
    {
      GMTrace.o(4967263895552L, 37009);
      return;
    }
    this.jEW.clear();
    int j = 0;
    int i = paramInt;
    paramInt = j;
    while (paramInt < localLinkedList.size())
    {
      au localau = (au)localLinkedList.get(paramInt);
      j = i;
      if (!bg.nm(localau.text))
      {
        j = i;
        if (!bg.nm(localau.url))
        {
          this.jEX.add(localau.text);
          this.jEV.put(Integer.valueOf(i), localau.text);
          this.jEW.put(localau.text, localau.url);
          j = i + 1;
        }
      }
      paramInt += 1;
      i = j;
    }
    GMTrace.o(4967263895552L, 37009);
  }
  
  private void uq(String paramString)
  {
    GMTrace.i(4967800766464L, 37013);
    Intent localIntent = new Intent();
    if ((this.jwZ instanceof CardInfo)) {
      localIntent.putExtra("key_card_info_data", (CardInfo)this.jwZ);
    }
    for (;;)
    {
      localIntent.setClass(this.iPC, CardConsumeCodeUI.class);
      localIntent.putExtra("key_from_scene", this.jEZ.jtE);
      localIntent.putExtra("key_previous_scene", this.jEZ.jBM);
      localIntent.putExtra("key_mark_user", paramString);
      localIntent.putExtra("key_from_appbrand_type", this.jEZ.jFf);
      this.iPC.startActivityForResult(localIntent, 3);
      this.iPC.vKC = this;
      GMTrace.o(4967800766464L, 37013);
      return;
      if ((this.jwZ instanceof ShareCardInfo)) {
        localIntent.putExtra("key_card_info_data", (ShareCardInfo)this.jwZ);
      }
    }
  }
  
  public final void H(int paramInt, String paramString)
  {
    GMTrace.i(18899735150592L, 140814);
    com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CardDetailUIContoller", "onGetCodeFail! errCode = %d, errMsg=%s", new Object[] { Integer.valueOf(paramInt), paramString });
    Message localMessage = Message.obtain();
    c localc = new c();
    localc.jFl = b.jFj;
    localc.errCode = paramInt;
    if (paramInt == -1) {
      paramString = getString(R.l.dcB);
    }
    for (;;)
    {
      localc.eAR = paramString;
      localMessage.obj = localc;
      this.jFa.sendMessage(localMessage);
      GMTrace.o(18899735150592L, 140814);
      return;
      if (paramInt == 2) {
        paramString = getString(R.l.dcm);
      } else {
        paramString = getString(R.l.dcA);
      }
    }
  }
  
  public final void a(final int paramInt1, int paramInt2, final Intent paramIntent)
  {
    GMTrace.i(4967532331008L, 37011);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(4967532331008L, 37011);
      return;
      if (paramInt2 == -1)
      {
        this.jET = paramIntent.getStringExtra("Select_Conv_User");
        paramIntent = this.jET;
        if (this.jwZ.ajv() == null)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CardDetailUIContoller", "showGiftConfirmDialog mCardInfo.getCardTpInfo() == null");
          GMTrace.o(4967532331008L, 37011);
          return;
        }
        StringBuilder localStringBuilder = new StringBuilder();
        if (paramInt1 == 0) {
          if (!TextUtils.isEmpty(this.jwZ.ajx().uPK)) {
            localStringBuilder.append(this.jwZ.ajx().uPK);
          }
        }
        for (;;)
        {
          String str = this.jwZ.ajv().title + "\n" + this.jwZ.ajv().jyT;
          com.tencent.mm.pluginsdk.ui.applet.e.a(this.iPC.vKB, localStringBuilder.toString(), this.jwZ.ajv().jxH, str, null, true, this.iPC.getResources().getString(R.l.cUs), new o.a()
          {
            public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
            {
              GMTrace.i(18899332497408L, 140811);
              if (paramAnonymousBoolean)
              {
                e.this.jEU = paramAnonymousString;
                if (paramInt1 == 0)
                {
                  if (e.this.jEY != null) {
                    e.this.jEY.up(paramIntent);
                  }
                  com.tencent.mm.plugin.report.service.g.ork.i(11582, new Object[] { "OperGift", Integer.valueOf(1), Integer.valueOf(e.this.jwZ.ajv().jxG), e.this.jwZ.ajA(), e.this.jwZ.ajz(), e.this.jET });
                  com.tencent.mm.ui.base.h.bm(e.this.iPC, e.this.iPC.getResources().getString(R.l.dcL));
                  GMTrace.o(18899332497408L, 140811);
                  return;
                }
                if (paramInt1 == 1)
                {
                  paramAnonymousString = e.this;
                  paramAnonymousString.jwZ.ajx().uPK = (paramAnonymousString.getString(R.l.ddO) + paramAnonymousString.jES.getTitle());
                  com.tencent.mm.plugin.card.b.l.a(paramAnonymousString.jwZ, paramAnonymousString.jET, paramAnonymousString.jEZ.jEl, 2);
                  com.tencent.mm.plugin.card.b.l.bK(paramAnonymousString.jEU, paramAnonymousString.jET);
                  com.tencent.mm.ui.base.h.bm(e.this.iPC, e.this.iPC.getResources().getString(R.l.dcL));
                  GMTrace.o(18899332497408L, 140811);
                  return;
                }
                if (paramInt1 == 4)
                {
                  paramAnonymousString = e.this;
                  if (TextUtils.isEmpty(paramAnonymousString.jwZ.ajB())) {
                    paramAnonymousString.jwZ.tI(com.tencent.mm.y.q.zE());
                  }
                  paramAnonymousString.jwZ.ajx().uPK = (paramAnonymousString.getString(R.l.ddr) + paramAnonymousString.jES.getTitle());
                  com.tencent.mm.plugin.card.b.l.a(paramAnonymousString.jwZ, paramAnonymousString.jET, paramAnonymousString.jEZ.jEl, 23);
                  com.tencent.mm.plugin.card.b.l.bK(paramAnonymousString.jEU, paramAnonymousString.jET);
                  com.tencent.mm.plugin.report.service.g.ork.i(11582, new Object[] { "OpeRecommendCard", Integer.valueOf(e.this.jEZ.jtE), Integer.valueOf(e.this.jwZ.ajv().jxG), e.this.jwZ.ajA(), e.this.jwZ.ajz(), e.this.jET });
                  com.tencent.mm.ui.base.h.bm(e.this.iPC, e.this.iPC.getResources().getString(R.l.dcL));
                }
              }
              GMTrace.o(18899332497408L, 140811);
            }
          });
          GMTrace.o(4967532331008L, 37011);
          return;
          localStringBuilder.append(getString(R.l.edp));
          continue;
          if (paramInt1 == 1) {
            localStringBuilder.append(getString(R.l.ddO) + this.jES.getTitle());
          } else if (paramInt1 == 4) {
            localStringBuilder.append(getString(R.l.ddr) + this.jES.getTitle());
          }
        }
        if (paramInt2 != -1)
        {
          GMTrace.o(4967532331008L, 37011);
          return;
        }
        this.jCn = paramIntent.getIntExtra("Ktag_range_index", 0);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "mPrivateSelelct : %d", new Object[] { Integer.valueOf(this.jCn) });
        if (this.jCn >= 2)
        {
          this.jCo = paramIntent.getStringExtra("Klabel_name_list");
          this.jCp = paramIntent.getStringExtra("Kother_user_name_list");
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.CardDetailUIContoller", "mPrivateSelect : %d, names : %s", new Object[] { Integer.valueOf(this.jCn), this.jCo });
          if ((TextUtils.isEmpty(this.jCo)) && (TextUtils.isEmpty(this.jCp)))
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CardDetailUIContoller", "mLabelNameList by getIntent is empty");
            GMTrace.o(4967532331008L, 37011);
            return;
          }
          paramIntent = Arrays.asList(this.jCo.split(","));
          this.jCr = com.tencent.mm.plugin.card.b.l.ae(paramIntent);
          this.jCq = com.tencent.mm.plugin.card.b.l.ad(paramIntent);
          if ((this.jCp != null) && (this.jCp.length() > 0))
          {
            paramIntent = Arrays.asList(this.jCp.split(","));
            this.jCq.addAll(paramIntent);
          }
          if (this.jCr != null) {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "mPrivateIdsList size is " + this.jCr.size());
          }
          if (this.jCq != null)
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "mPrivateNamesList size is " + this.jCq.size());
            paramIntent = this.jCq.iterator();
            while (paramIntent.hasNext()) {
              com.tencent.mm.sdk.platformtools.w.d("MicroMsg.CardDetailUIContoller", "username : %s", new Object[] { (String)paramIntent.next() });
            }
          }
          if (this.jCn == 2)
          {
            this.jEO.ut(this.iPC.getString(R.l.ddG, new Object[] { akP() }));
            GMTrace.o(4967532331008L, 37011);
            return;
          }
          if (this.jCn == 3)
          {
            this.jEO.ut(this.iPC.getString(R.l.ddF, new Object[] { akP() }));
            GMTrace.o(4967532331008L, 37011);
            return;
          }
          this.jEO.ut(this.iPC.getString(R.l.ddE));
          GMTrace.o(4967532331008L, 37011);
          return;
        }
        this.jEO.ut(this.iPC.getString(R.l.ddE));
        GMTrace.o(4967532331008L, 37011);
        return;
        if (this.jEY != null) {
          this.jEY.alu();
        }
      }
    }
  }
  
  public final void a(com.tencent.mm.plugin.card.base.b paramb, a parama, ArrayList<jp> paramArrayList)
  {
    GMTrace.i(4964982194176L, 36992);
    this.jwZ = paramb;
    this.jEZ = parama;
    this.jxf = paramArrayList;
    GMTrace.o(4964982194176L, 36992);
  }
  
  public final void a(boolean paramBoolean1, i.b paramb, boolean paramBoolean2)
  {
    int j = 1;
    int i = 1;
    GMTrace.i(4966995460096L, 37007);
    if (paramBoolean1)
    {
      localObject1 = this.jwZ.ajw().tZn;
      if (this.jwZ.ajo())
      {
        com.tencent.mm.plugin.card.b.b.a(this.iPC, paramb.jxv, paramb.jxw, paramBoolean2, this.jwZ);
        com.tencent.mm.plugin.report.service.g.ork.i(11941, new Object[] { Integer.valueOf(17), this.jwZ.ajz(), this.jwZ.ajA(), "", this.jwZ.ajw().tZn.title });
        GMTrace.o(4966995460096L, 37007);
        return;
      }
      if ((localObject1 != null) && (!TextUtils.isEmpty(((np)localObject1).tZx)) && (!TextUtils.isEmpty(((np)localObject1).tZy)))
      {
        com.tencent.mm.plugin.card.b.b.a(this.jwZ.ajz(), (np)localObject1, this.jEZ.jBM, this.jEZ.jFf);
        localObject2 = com.tencent.mm.plugin.report.service.g.ork;
        str1 = this.jwZ.ajz();
        str2 = this.jwZ.ajA();
        if (((np)localObject1).title != null) {}
        for (paramb = ((np)localObject1).title;; paramb = "")
        {
          ((com.tencent.mm.plugin.report.service.g)localObject2).i(11941, new Object[] { Integer.valueOf(6), str1, str2, "", paramb });
          GMTrace.o(4966995460096L, 37007);
          return;
        }
      }
      if ((localObject1 != null) && (!TextUtils.isEmpty(((np)localObject1).url)))
      {
        paramb = com.tencent.mm.plugin.card.b.l.r(((np)localObject1).url, ((np)localObject1).uaJ);
        com.tencent.mm.plugin.card.b.b.a(this.iPC, paramb, 1);
        localObject2 = com.tencent.mm.plugin.report.service.g.ork;
        str1 = this.jwZ.ajz();
        str2 = this.jwZ.ajA();
        if (((np)localObject1).title != null) {}
        for (paramb = ((np)localObject1).title;; paramb = "")
        {
          ((com.tencent.mm.plugin.report.service.g)localObject2).i(11941, new Object[] { Integer.valueOf(6), str1, str2, "", paramb });
          GMTrace.o(4966995460096L, 37007);
          return;
        }
      }
      localObject1 = com.tencent.mm.plugin.report.service.g.ork;
      j = this.jwZ.ajv().jxG;
      localObject2 = this.jwZ.ajA();
      str1 = this.jwZ.ajz();
      k = this.jEZ.jBM;
      str2 = this.jEZ.jEj;
      if (this.jwZ.ajt()) {}
      for (;;)
      {
        ((com.tencent.mm.plugin.report.service.g)localObject1).i(11324, new Object[] { "CardConsumedCodeUI", Integer.valueOf(j), localObject2, str1, Integer.valueOf(0), Integer.valueOf(k), str2, Integer.valueOf(i), "" });
        uq(paramb.jxs);
        GMTrace.o(4966995460096L, 37007);
        return;
        i = 0;
      }
    }
    Object localObject1 = com.tencent.mm.plugin.report.service.g.ork;
    int k = this.jwZ.ajv().jxG;
    Object localObject2 = this.jwZ.ajA();
    String str1 = this.jwZ.ajz();
    int m = this.jEZ.jBM;
    String str2 = this.jEZ.jEj;
    if (this.jwZ.ajt()) {}
    for (i = j;; i = 0)
    {
      ((com.tencent.mm.plugin.report.service.g)localObject1).i(11324, new Object[] { "CardConsumedCodeUI", Integer.valueOf(k), localObject2, str1, Integer.valueOf(0), Integer.valueOf(m), str2, Integer.valueOf(i), "" });
      uq(paramb.jxs);
      GMTrace.o(4966995460096L, 37007);
      return;
    }
  }
  
  public final void ajV()
  {
    GMTrace.i(18899869368320L, 140815);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "on show TimeExpired! do update refresh code view!");
    Message localMessage = Message.obtain();
    c localc = new c();
    localc.jFl = b.jFh;
    localMessage.obj = localc;
    this.jFa.sendMessage(localMessage);
    GMTrace.o(18899869368320L, 140815);
  }
  
  public final void akN()
  {
    GMTrace.i(4966861242368L, 37006);
    if (this.jwZ == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CardDetailUIContoller", "doUpdate fail, mCardInfo == null");
      if (this.jEY != null) {
        this.jEY.als();
      }
      GMTrace.o(4966861242368L, 37006);
      return;
    }
    if (this.jwZ.ajv() == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CardDetailUIContoller", "doUpdate fail, mCardInfo.getCardTpInfo() == null");
      if (this.jEY != null) {
        this.jEY.als();
      }
      GMTrace.o(4966861242368L, 37006);
      return;
    }
    if (this.jwZ.ajw() == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CardDetailUIContoller", "doUpdate fail, mCardInfo.getDataInfo() == null");
      if (this.jEY != null) {
        this.jEY.als();
      }
      GMTrace.o(4966861242368L, 37006);
      return;
    }
    if (!this.jwZ.ajh())
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CardDetailUIContoller", "doUpdate fail, not support card type :%d", new Object[] { Integer.valueOf(this.jwZ.ajv().jxG) });
      if (!TextUtils.isEmpty(this.jwZ.ajv().tZO))
      {
        com.tencent.mm.plugin.card.b.b.a(this.iPC, this.jwZ.ajv().tZO, 0);
        if (this.jEY != null)
        {
          this.jEY.als();
          GMTrace.o(4966861242368L, 37006);
        }
      }
      else
      {
        com.tencent.mm.ui.base.h.a(this.iPC, getString(R.l.ddo), null, false, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(4956660695040L, 36930);
            paramAnonymousDialogInterface.dismiss();
            if (e.this.jEY != null) {
              e.this.jEY.als();
            }
            GMTrace.o(4956660695040L, 36930);
          }
        });
      }
      GMTrace.o(4966861242368L, 37006);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "doUpdate()");
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "doUpdate() showAcceptView:" + this.jwZ.ajv().uaj);
    Object localObject1 = this.jES;
    Object localObject2 = this.jwZ;
    Object localObject3 = this.jxf;
    int i = this.jEZ.jtE;
    ((com.tencent.mm.plugin.card.a.f)localObject1).jwZ = ((com.tencent.mm.plugin.card.base.b)localObject2);
    ((com.tencent.mm.plugin.card.a.f)localObject1).jxf = ((ArrayList)localObject3);
    ((com.tencent.mm.plugin.card.a.f)localObject1).jtE = i;
    if (this.jEy == null)
    {
      i = 0;
      if (i != 0)
      {
        this.jEy.release();
        this.jEy = null;
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "updateShowLogic, need recreate show logic, card_type:%d", new Object[] { Integer.valueOf(this.jwZ.ajv().jxG) });
      }
      if (this.jEy == null)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "updateShowLogic, mCardShowLogic == null, card_type:%d", new Object[] { Integer.valueOf(this.jwZ.ajv().jxG) });
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "createShowLogic, card_type:%d", new Object[] { Integer.valueOf(this.jwZ.ajv().jxG) });
        if (!this.jwZ.ajb()) {
          break label2204;
        }
        this.jEy = new com.tencent.mm.plugin.card.ui.a.h(this.iPC);
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "updateShowLogic, card_tye:%d", new Object[] { Integer.valueOf(this.jwZ.ajv().jxG) });
      this.jEy.a(this.jwZ, this.jEZ);
      this.jEy.amL();
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "");
      if (this.jEy.amt()) {
        break label2376;
      }
      this.iPC.sq("");
      label605:
      if (this.jwZ != null) {
        break label2393;
      }
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CardDetailUIContoller", "updateWidget, mCardInfo is null");
      if (!this.jEy.amu()) {
        break label2898;
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "updateShareUsersInfoLayout()");
      this.jEz.update();
      label647:
      if (!this.jEy.aml()) {
        break label2916;
      }
      if (this.jEP == null)
      {
        this.jEP = new com.tencent.mm.plugin.card.ui.view.b();
        this.jEP.a(this);
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "update CardAcceptView()");
      this.jEP.update();
      label700:
      boolean bool = this.jEy.amp();
      this.iPC.lf(bool);
      if (this.jEy.amq())
      {
        this.jEV.clear();
        this.jEX.clear();
        if (!this.jwZ.ajj()) {
          break label6763;
        }
        this.jEX.add(getString(R.l.elp));
        this.jEV.put(Integer.valueOf(0), "menu_func_share_friend");
        this.jEX.add(getString(R.l.elo));
        this.jEV.put(Integer.valueOf(1), "menu_func_share_timeline");
      }
    }
    label1073:
    label1275:
    label1368:
    label1421:
    label1474:
    label1527:
    label1580:
    label1633:
    label1686:
    label1739:
    label1912:
    label1927:
    label1944:
    label2204:
    label2376:
    label2393:
    label2424:
    label2755:
    label2760:
    label2898:
    label2916:
    label3133:
    label3191:
    label3293:
    label3748:
    label3914:
    label4031:
    label4248:
    label4385:
    label4617:
    label4702:
    label4717:
    label4746:
    label4761:
    label4786:
    label4811:
    label4836:
    label4861:
    label4886:
    label4911:
    label4936:
    label4961:
    label5489:
    label5884:
    label5995:
    label6186:
    label6221:
    label6237:
    label6338:
    label6565:
    label6586:
    label6596:
    label6641:
    label6676:
    label6693:
    label6735:
    label6753:
    label6758:
    label6763:
    for (i = 2;; i = 0)
    {
      int j = i;
      if (!TextUtils.isEmpty(this.jwZ.ajw().tZj))
      {
        this.jEX.add(getString(R.l.ddj));
        this.jEV.put(Integer.valueOf(i), "menu_func_report");
        j = i + 1;
      }
      lQ(j);
      if (this.jEX.size() > 0) {
        alF();
      }
      if (this.jEy.amr())
      {
        this.jEV.clear();
        this.jEX.clear();
        if ((!this.jwZ.aja()) || (!this.jwZ.aji())) {
          break label6758;
        }
        this.jEX.add(getString(R.l.ddi));
        this.jEV.put(Integer.valueOf(0), "menu_func_gift");
      }
      for (j = 1;; j = 0)
      {
        i = j;
        if (!TextUtils.isEmpty(this.jwZ.ajw().tZj))
        {
          this.jEX.add(getString(R.l.ddj));
          this.jEV.put(Integer.valueOf(j), "menu_func_report");
          i = j + 1;
        }
        if (this.jwZ.aja())
        {
          this.jEX.add(getString(R.l.cSt));
          this.jEV.put(Integer.valueOf(i), "menu_func_delete");
          j = i + 1;
          lQ(j);
          if (this.jEX.size() > 0) {
            alF();
          }
          if (this.jEy.ams())
          {
            this.jEV.clear();
            this.jEX.clear();
            if (TextUtils.isEmpty(this.jwZ.ajw().tZj)) {
              break label6753;
            }
            this.jEX.add(getString(R.l.ddj));
            this.jEV.put(Integer.valueOf(0), "menu_func_report");
          }
        }
        for (i = 1;; i = 0)
        {
          lQ(i);
          if (this.jEX.size() > 0) {
            alF();
          }
          if ((this.jED != null) && ((this.jED instanceof com.tencent.mm.plugin.card.widget.b))) {
            ((com.tencent.mm.plugin.card.widget.b)this.jED).ani();
          }
          l(this.jEy.amn(), this.jEy.amo());
          if ((!this.jwZ.ajc()) && (this.jEy.amw()))
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "update mFromUserView");
            this.jEB.update();
            if (this.jED != null) {
              this.jED.dB(this.jEy.alJ());
            }
            if (!this.eIE) {
              break label3133;
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "updateUIBackground onPause return");
            if (!this.jEy.amB()) {
              break label4761;
            }
            if (this.jEH == null)
            {
              this.jEH = new y();
              this.jEH.a(this);
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "update CardStatusView");
            this.jEH.update();
            if (!this.jEy.amK()) {
              break label4786;
            }
            if (this.jEG == null)
            {
              this.jEG = new com.tencent.mm.plugin.card.ui.view.c();
              this.jEG.a(this);
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "update mAdtitleView()");
            this.jEG.update();
            if (!this.jEy.amC()) {
              break label4811;
            }
            if (this.jEI == null)
            {
              this.jEI = new k();
              this.jEI.a(this);
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "update mCardDetailFieldView()");
            this.jEI.update();
            if (!this.jEy.amD()) {
              break label4836;
            }
            if (this.jEJ == null)
            {
              this.jEJ = new com.tencent.mm.plugin.card.ui.view.w();
              this.jEJ.a(this);
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "update CardSecondaryFieldView");
            this.jEJ.update();
            if (!this.jEy.amE()) {
              break label4861;
            }
            if (this.jEK == null)
            {
              this.jEK = new com.tencent.mm.plugin.card.ui.view.l();
              this.jEK.a(this);
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "update CardDetailTableView");
            this.jEK.update();
            if (!this.jEy.amF()) {
              break label4886;
            }
            if (this.jEL == null)
            {
              this.jEL = new z();
              this.jEL.a(this);
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "update CardThirdFieldView");
            this.jEL.update();
            if (!this.jEy.amH()) {
              break label4911;
            }
            if (this.jEM == null)
            {
              this.jEM = new com.tencent.mm.plugin.card.ui.view.e();
              this.jEM.a(this);
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "updateCardAnnoucementView");
            this.jEM.update();
            if (!this.jEy.amG()) {
              break label4936;
            }
            if (this.jEN == null)
            {
              this.jEN = new com.tencent.mm.plugin.card.ui.view.u();
              this.jEN.a(this);
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "updateCardOperateFieldView");
            this.jEN.update();
            if (this.jEy.amy()) {
              break label4961;
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "card is membership or share card or general coupon, not accept, don't updateCellData()");
            if (!this.jEy.amz()) {
              break label6693;
            }
            localObject1 = this.jwZ.ajw();
            this.jwZ.a((jm)localObject1);
            com.tencent.mm.plugin.card.b.l.j(this.jwZ);
            if (!this.jEy.amA()) {
              break label6676;
            }
            if (this.jEE != null) {
              break label6641;
            }
            if ((this.jwZ.ajv().uan == null) || (!this.jwZ.ajv().uan.ugq)) {
              break label6596;
            }
            this.jEE = new com.tencent.mm.plugin.card.ui.view.m();
            localObject1 = al.akD();
            if (((com.tencent.mm.plugin.card.a.g)localObject1).jwK == null) {
              ((com.tencent.mm.plugin.card.a.g)localObject1).jwK = new ArrayList();
            }
            if (this != null) {
              ((com.tencent.mm.plugin.card.a.g)localObject1).jwK.add(new WeakReference(this));
            }
            this.jEE.a(this);
            this.jEE.update();
            if (this.jED != null) {
              this.jED.dA(true);
            }
            if (!this.jEy.amI()) {
              break label6735;
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "update CardAdvertiseView");
            this.jEO.update();
          }
          for (;;)
          {
            this.jEQ.jwZ = this.jwZ;
            GMTrace.o(4966861242368L, 37006);
            return;
            if (this.jwZ.ajb())
            {
              if ((this.jEy instanceof com.tencent.mm.plugin.card.ui.a.h))
              {
                i = 0;
                break;
              }
              i = 1;
              break;
            }
            if (this.jwZ.ajc())
            {
              if ((this.jEy instanceof com.tencent.mm.plugin.card.ui.a.e))
              {
                i = 0;
                break;
              }
              i = 1;
              break;
            }
            if (this.jwZ.ajf())
            {
              if ((this.jEy instanceof com.tencent.mm.plugin.card.ui.a.b))
              {
                i = 0;
                break;
              }
              i = 1;
              break;
            }
            if (this.jwZ.ajd())
            {
              if ((this.jEy instanceof com.tencent.mm.plugin.card.ui.a.c))
              {
                i = 0;
                break;
              }
              i = 1;
              break;
            }
            if (this.jwZ.aje())
            {
              if ((this.jEy instanceof com.tencent.mm.plugin.card.ui.a.f))
              {
                i = 0;
                break;
              }
              i = 1;
              break;
            }
            if (this.jwZ.ajg())
            {
              if ((this.jEy instanceof com.tencent.mm.plugin.card.ui.a.d))
              {
                i = 0;
                break;
              }
              i = 1;
              break;
            }
            if ((this.jEy instanceof a))
            {
              i = 0;
              break;
            }
            i = 1;
            break;
            switch (this.jwZ.ajv().jxG)
            {
            default: 
              this.jEy = new a(this.iPC);
              break;
            case 0: 
              this.jEy = new com.tencent.mm.plugin.card.ui.a.c(this.iPC);
              break;
            case 10: 
              this.jEy = new com.tencent.mm.plugin.card.ui.a.e(this.iPC);
              break;
            case 11: 
              this.jEy = new com.tencent.mm.plugin.card.ui.a.b(this.iPC);
              break;
            case 20: 
              this.jEy = new com.tencent.mm.plugin.card.ui.a.f(this.iPC);
              break;
            case 30: 
              this.jEy = new com.tencent.mm.plugin.card.ui.a.d(this.iPC);
              break;
              this.iPC.sq(this.jES.getTitle());
              break label605;
              if (this.jED != null) {
                if (this.jwZ.ajc())
                {
                  if ((this.jED instanceof com.tencent.mm.plugin.card.widget.e)) {
                    break label2755;
                  }
                  i = 1;
                  if (i != 0)
                  {
                    localObject1 = this.jED.anb();
                    if (localObject1 != null) {
                      this.dl.removeView((View)localObject1);
                    }
                    this.dl.removeAllViews();
                    this.dl.invalidate();
                    this.jED.release();
                    this.jED = null;
                  }
                  if (this.jED == null)
                  {
                    if (!this.jwZ.ajc()) {
                      break label2760;
                    }
                    this.jED = new com.tencent.mm.plugin.card.widget.e(this.iPC);
                  }
                }
              }
              for (;;)
              {
                this.jED.k(this.jwZ);
                localObject1 = this.jED.anb();
                if (localObject1 != null)
                {
                  localObject2 = this.dl;
                  ((View)localObject1).setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                  ((LinearLayout)localObject2).addView((View)localObject1);
                }
                this.dl.invalidate();
                this.jED.setOnClickListener(this.hwh);
                l(false, false);
                if (this.jED == null) {
                  break;
                }
                if (this.jwZ.aje()) {
                  ((com.tencent.mm.plugin.card.widget.f)this.jED).jxf = this.jxf;
                }
                this.jED.f(this.jwZ);
                break;
                if (this.jwZ.ajf())
                {
                  if ((this.jED instanceof com.tencent.mm.plugin.card.widget.c)) {
                    break label2755;
                  }
                  i = 1;
                  break label2424;
                }
                if (this.jwZ.ajd())
                {
                  if ((this.jED instanceof com.tencent.mm.plugin.card.widget.b)) {
                    break label2755;
                  }
                  i = 1;
                  break label2424;
                }
                if (this.jwZ.aje())
                {
                  if ((this.jED instanceof com.tencent.mm.plugin.card.widget.f)) {
                    break label2755;
                  }
                  i = 1;
                  break label2424;
                }
                if ((this.jwZ.ajg()) && (!(this.jED instanceof com.tencent.mm.plugin.card.widget.d)))
                {
                  i = 1;
                  break label2424;
                }
                i = 0;
                break label2424;
                if (this.jwZ.ajf()) {
                  this.jED = new com.tencent.mm.plugin.card.widget.c(this.iPC);
                } else if (this.jwZ.ajd()) {
                  this.jED = new com.tencent.mm.plugin.card.widget.b(this.iPC);
                } else if (this.jwZ.aje()) {
                  this.jED = new com.tencent.mm.plugin.card.widget.f(this.iPC);
                } else if (this.jwZ.ajg()) {
                  this.jED = new com.tencent.mm.plugin.card.widget.d(this.iPC);
                } else {
                  this.jED = new com.tencent.mm.plugin.card.widget.b(this.iPC);
                }
              }
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "don't updateShareUsersInfoLayout()");
              this.jEz.amM();
              break label647;
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "don't update CardAcceptView()");
              if (this.jEP == null) {
                break label700;
              }
              this.jEP.amM();
              break label700;
              j = i;
              if (!this.jwZ.ajb()) {
                break label1073;
              }
              localObject1 = com.tencent.mm.y.q.zE();
              localObject2 = this.jwZ.ajB();
              if ((localObject1 != null) && (((String)localObject1).equals(localObject2)))
              {
                this.jEX.add(getString(R.l.cSt));
                this.jEV.put(Integer.valueOf(i), "menu_func_delete_share_card");
                j = i + 1;
                break label1073;
              }
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "the card is not belong mine");
              j = i;
              break label1073;
              if ((this.jwZ.ajc()) && (this.jEy.amw()))
              {
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "update mAcceptHeaderLayout for username");
                this.jEC.update();
                break label1275;
              }
              if (this.jEy.amx())
              {
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "update mAcceptHeaderLayout");
                this.jEC.update();
                break label1275;
              }
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "don't update mFromUserView and mAcceptHeaderLayout");
              this.jEC.amM();
              this.jEB.amM();
              break label1275;
              if ((this.jwZ.aja()) && (this.jwZ.ajc()))
              {
                this.jBw.findViewById(R.h.bjU).setBackgroundColor(this.iPC.getResources().getColor(R.e.aOz));
                com.tencent.mm.plugin.card.b.m.b(this.iPC, true);
                localObject3 = this.jBw.findViewById(R.h.btD);
                localObject2 = this.jBw.findViewById(R.h.bGc);
                localObject1 = this.jBw.findViewById(R.h.btB);
                if ((!this.jwZ.aja()) || (!this.jEy.amw())) {
                  break label4385;
                }
                if (!this.jwZ.ajd()) {
                  break label4248;
                }
                ((View)localObject3).setBackgroundResource(R.g.aVe);
                this.jBw.findViewById(R.h.bCe).setBackgroundResource(R.g.aUS);
                ((View)localObject1).setBackgroundResource(0);
                Object localObject5;
                if (this.jwZ.ajg())
                {
                  localObject4 = (TextView)this.jBw.findViewById(R.h.bit);
                  localObject5 = new BitmapDrawable(com.tencent.mm.sdk.platformtools.d.Ag(R.g.aVb));
                  ((BitmapDrawable)localObject5).setTileModeX(Shader.TileMode.REPEAT);
                  ((TextView)localObject4).setBackgroundDrawable((Drawable)localObject5);
                  ((TextView)localObject4).setVisibility(0);
                }
                localObject4 = new Rect(0, 0, 0, 0);
                ((View)localObject3).setPadding(((Rect)localObject4).left, ((Rect)localObject4).top, ((Rect)localObject4).right, ((Rect)localObject4).bottom);
                ((View)localObject3).invalidate();
                ((View)localObject1).setPadding(((Rect)localObject4).left, ((Rect)localObject4).top, ((Rect)localObject4).right, ((Rect)localObject4).bottom);
                ((View)localObject1).invalidate();
                if ((this.jwZ.ajb()) && (this.jEy.amu()) && (this.jEA))
                {
                  localObject5 = this.jBw.findViewById(R.h.cey);
                  ((View)localObject5).setPadding(((Rect)localObject4).left, ((Rect)localObject4).top, ((Rect)localObject4).right, ((Rect)localObject4).bottom);
                  ((View)localObject5).invalidate();
                }
                if ((this.jwZ.aja()) && (this.jEy.amw()))
                {
                  localObject5 = this.jBw.findViewById(R.h.bCe);
                  ((Rect)localObject4).left = this.iPC.getResources().getDimensionPixelOffset(R.f.aQq);
                  ((Rect)localObject4).right = this.iPC.getResources().getDimensionPixelOffset(R.f.aQq);
                  ((View)localObject5).setPadding(((Rect)localObject4).left, ((Rect)localObject4).top, ((Rect)localObject4).right, ((Rect)localObject4).bottom);
                  ((View)localObject5).invalidate();
                  if (this.jwZ.aje())
                  {
                    localObject4 = this.jBw.findViewById(R.h.bCf);
                    localObject5 = (LinearLayout.LayoutParams)((View)localObject4).getLayoutParams();
                    i = this.iPC.getResources().getDimensionPixelSize(R.f.aQN);
                    ((LinearLayout.LayoutParams)localObject5).rightMargin = i;
                    ((LinearLayout.LayoutParams)localObject5).leftMargin = i;
                    ((View)localObject4).setLayoutParams((ViewGroup.LayoutParams)localObject5);
                  }
                }
                if ((!this.jEy.amw()) && (!this.jEy.amu())) {
                  break label4617;
                }
                if ((this.jED != null) && (((this.jwZ.aja()) && (this.jwZ.ajd())) || (this.jwZ.ajb()))) {
                  this.jED.lY(0);
                }
                if ((this.jED != null) && (this.jwZ.aja()) && (this.jwZ.ajc()))
                {
                  i = this.iPC.getResources().getDimensionPixelOffset(R.f.aRr);
                  localObject4 = com.tencent.mm.plugin.card.b.l.bN(com.tencent.mm.plugin.card.b.l.uD(this.jwZ.ajv().gjg), i);
                  this.jED.a((ShapeDrawable)localObject4);
                }
                if ((this.jwZ.aja()) && (this.jwZ.ajc()))
                {
                  localObject4 = (LinearLayout.LayoutParams)((View)localObject3).getLayoutParams();
                  ((LinearLayout.LayoutParams)localObject4).bottomMargin = 0;
                  ((LinearLayout.LayoutParams)localObject4).topMargin = 0;
                  ((LinearLayout.LayoutParams)localObject4).rightMargin = 0;
                  ((LinearLayout.LayoutParams)localObject4).leftMargin = 0;
                  if (TextUtils.isEmpty(this.jwZ.ajv().tZT)) {
                    break label4702;
                  }
                  ((LinearLayout.LayoutParams)localObject4).weight = 0.0F;
                  ((LinearLayout.LayoutParams)localObject4).height = -2;
                  ((View)localObject3).setLayoutParams((ViewGroup.LayoutParams)localObject4);
                  localObject3 = (LinearLayout.LayoutParams)((View)localObject2).getLayoutParams();
                  i = this.iPC.getResources().getDimensionPixelSize(R.f.aQw);
                  ((LinearLayout.LayoutParams)localObject3).rightMargin = i;
                  ((LinearLayout.LayoutParams)localObject3).leftMargin = i;
                  if (!this.jwZ.ajc()) {
                    break label4717;
                  }
                  ((LinearLayout.LayoutParams)localObject3).topMargin = this.iPC.getResources().getDimensionPixelSize(R.f.aQt);
                  ((LinearLayout.LayoutParams)localObject3).bottomMargin = this.iPC.getResources().getDimensionPixelSize(R.f.aQu);
                  i = this.iPC.getResources().getDimensionPixelSize(R.f.aQr);
                  ((LinearLayout.LayoutParams)localObject3).rightMargin = i;
                  ((LinearLayout.LayoutParams)localObject3).leftMargin = i;
                  ((View)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject3);
                  localObject2 = (LinearLayout.LayoutParams)((View)localObject1).getLayoutParams();
                  ((LinearLayout.LayoutParams)localObject2).bottomMargin = 0;
                  ((LinearLayout.LayoutParams)localObject2).topMargin = 0;
                  ((LinearLayout.LayoutParams)localObject2).rightMargin = 0;
                  ((LinearLayout.LayoutParams)localObject2).leftMargin = 0;
                  if (this.jwZ.ajc()) {
                    ((LinearLayout.LayoutParams)localObject2).bottomMargin = this.iPC.getResources().getDimensionPixelSize(R.f.aQr);
                  }
                  if (TextUtils.isEmpty(this.jwZ.ajv().tZT)) {
                    break label4746;
                  }
                  ((LinearLayout.LayoutParams)localObject2).weight = 0.0F;
                  ((LinearLayout.LayoutParams)localObject2).height = -2;
                }
              }
              for (;;)
              {
                ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
                if (!TextUtils.isEmpty(this.jwZ.ajv().tZT))
                {
                  localObject1 = findViewById(R.h.bdp);
                  localObject2 = (LinearLayout.LayoutParams)((View)localObject1).getLayoutParams();
                  ((LinearLayout.LayoutParams)localObject2).height = 0;
                  ((LinearLayout.LayoutParams)localObject2).weight = 1.0F;
                  ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
                }
                this.jBw.invalidate();
                break;
                this.jBw.findViewById(R.h.bjU).setBackgroundColor(com.tencent.mm.plugin.card.b.l.uD(this.jwZ.ajv().gjg));
                com.tencent.mm.plugin.card.b.m.a(this.iPC, this.jwZ);
                break label3191;
                if (this.jwZ.ajc())
                {
                  this.jBw.findViewById(R.h.bCe).setBackgroundResource(0);
                  ((View)localObject1).setBackgroundColor(this.iPC.getResources().getColor(R.e.aOz));
                  break label3293;
                }
                if (this.jwZ.aje())
                {
                  ((View)localObject3).setBackgroundResource(R.g.aVe);
                  this.jBw.findViewById(R.h.bCe).setBackgroundResource(R.g.aUS);
                  ((View)localObject1).setBackgroundResource(0);
                  break label3293;
                }
                if ((this.jwZ.ajf()) || (!this.jwZ.ajg())) {
                  break label3293;
                }
                ((View)localObject1).setBackgroundColor(this.iPC.getResources().getColor(R.e.aOz));
                break label3293;
                if (this.jwZ.ajb())
                {
                  if ((this.jEy.amu()) && (this.jEA))
                  {
                    ((View)localObject3).setBackgroundResource(R.g.aVe);
                    ((View)localObject1).setBackgroundResource(0);
                    break label3293;
                  }
                  if ((this.jEy.amu()) && (!this.jEA))
                  {
                    ((View)localObject3).setBackgroundResource(R.g.aVc);
                    ((View)localObject1).setBackgroundResource(0);
                    break label3293;
                  }
                  ((View)localObject3).setBackgroundResource(0);
                  if (this.jEy.alJ())
                  {
                    ((View)localObject1).setBackgroundResource(R.g.aVc);
                    break label3293;
                  }
                  ((View)localObject1).setBackgroundResource(R.g.aVe);
                  break label3293;
                }
                if (this.jwZ.ajd())
                {
                  ((View)localObject3).setBackgroundResource(0);
                  if (this.jEy.alJ())
                  {
                    ((View)localObject1).setBackgroundResource(R.g.aVc);
                    break label3293;
                  }
                  ((View)localObject1).setBackgroundResource(R.g.aVe);
                  break label3293;
                }
                if (this.jwZ.aje())
                {
                  ((View)localObject3).setBackgroundResource(R.g.aVg);
                  ((View)localObject1).setBackgroundResource(0);
                  break label3293;
                }
                ((View)localObject3).setBackgroundResource(0);
                ((View)localObject1).setBackgroundColor(this.iPC.getResources().getColor(R.e.aOz));
                break label3293;
                if ((this.jED == null) || (((!this.jwZ.aja()) || (!this.jwZ.ajd())) && (!this.jwZ.ajb()))) {
                  break label3748;
                }
                if (this.jEy.alJ())
                {
                  this.jED.lY(R.g.aVf);
                  break label3748;
                }
                this.jED.lY(R.g.aVd);
                break label3748;
                ((LinearLayout.LayoutParams)localObject4).height = 0;
                ((LinearLayout.LayoutParams)localObject4).weight = 1.0F;
                break label3914;
                i = this.iPC.getResources().getDimensionPixelSize(R.f.aPC);
                ((LinearLayout.LayoutParams)localObject3).bottomMargin = i;
                ((LinearLayout.LayoutParams)localObject3).topMargin = i;
                break label4031;
                ((LinearLayout.LayoutParams)localObject2).height = 0;
                ((LinearLayout.LayoutParams)localObject2).weight = 1.0F;
              }
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "don't update CardStatusView");
              if (this.jEH == null) {
                break label1368;
              }
              this.jEH.amM();
              break label1368;
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "don't update AdTitleView()");
              if (this.jEG == null) {
                break label1421;
              }
              this.jEG.amM();
              break label1421;
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "don't update mCardDetailFieldView()");
              if (this.jEI == null) {
                break label1474;
              }
              this.jEI.amM();
              break label1474;
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "don't update CardSecondaryFieldView");
              if (this.jEJ == null) {
                break label1527;
              }
              this.jEJ.amM();
              break label1527;
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "don't update CardDetailTableView");
              if (this.jEK == null) {
                break label1580;
              }
              this.jEK.amM();
              break label1580;
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "don't update CardThirdFieldView");
              if (this.jEL == null) {
                break label1633;
              }
              this.jEL.amM();
              break label1633;
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "don't updateCardAnnoucementView");
              if (this.jEM == null) {
                break label1686;
              }
              this.jEM.amM();
              break label1686;
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "don't updateCardOperateFieldView");
              if (this.jEN == null) {
                break label1739;
              }
              this.jEN.amM();
              break label1739;
              this.jxd.clear();
              localObject1 = this.jxd;
              localObject2 = this.jES;
              ((com.tencent.mm.plugin.card.a.f)localObject2).jxd.clear();
              if ((((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajw().tZr != null) && (!bg.nm(((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajw().tZr.title)))
              {
                localObject3 = new com.tencent.mm.plugin.card.model.b();
                ((com.tencent.mm.plugin.card.model.b)localObject3).jxT = 1;
                ((com.tencent.mm.plugin.card.model.b)localObject3).title = ((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajw().tZr.title;
                ((com.tencent.mm.plugin.card.model.b)localObject3).jBl = "";
                ((com.tencent.mm.plugin.card.model.b)localObject3).url = "card://jump_card_gift";
                ((com.tencent.mm.plugin.card.model.b)localObject3).nDw = ((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajw().tZr.nDw;
                ((com.tencent.mm.plugin.card.a.f)localObject2).jxd.add(localObject3);
              }
              if ((((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajw().tZa != null) && (((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajw().tZa.size() > 0))
              {
                localObject3 = com.tencent.mm.plugin.card.b.l.ac(((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajw().tZa);
                if (localObject3 != null)
                {
                  ((com.tencent.mm.plugin.card.model.b)((List)localObject3).get(0)).jxU = false;
                  ((com.tencent.mm.plugin.card.a.f)localObject2).jxd.addAll((Collection)localObject3);
                }
              }
              if (((((com.tencent.mm.plugin.card.a.f)localObject2).jtE == 6) && (((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajw().tZe <= 0)) || ((com.tencent.mm.plugin.card.b.l.lX(((com.tencent.mm.plugin.card.a.f)localObject2).jtE)) && (((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajr()) && (((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.aja()) && (((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.aji())))
              {
                localObject3 = new com.tencent.mm.plugin.card.model.b();
                ((com.tencent.mm.plugin.card.model.b)localObject3).jxT = 1;
                ((com.tencent.mm.plugin.card.model.b)localObject3).title = ab.getContext().getString(R.l.ddi);
                ((com.tencent.mm.plugin.card.model.b)localObject3).jBl = "";
                ((com.tencent.mm.plugin.card.model.b)localObject3).url = "card://jump_gift";
                ((com.tencent.mm.plugin.card.a.f)localObject2).jxd.add(localObject3);
              }
              if ((((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajw().status != 0) && (((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajw().status != 1)) {
                i = ((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajw().status;
              }
              if ((((com.tencent.mm.plugin.card.a.f)localObject2).jtE != 3) && (((com.tencent.mm.plugin.card.a.f)localObject2).jtE == 6)) {
                i = ((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajw().tZe;
              }
              Object localObject4 = ((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajv().uaa;
              if (((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajw().tZk != null) {
                TextUtils.isEmpty(((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajw().tZk.title);
              }
              localObject3 = new com.tencent.mm.plugin.card.model.b();
              if (((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajg())
              {
                i = 0;
                ((com.tencent.mm.plugin.card.model.b)localObject3).jxU = false;
                ((com.tencent.mm.plugin.card.model.b)localObject3).jxT = 1;
                localObject4 = new StringBuilder();
                ((StringBuilder)localObject4).append(((com.tencent.mm.plugin.card.a.f)localObject2).getTitle());
                ((StringBuilder)localObject4).append(((com.tencent.mm.plugin.card.a.f)localObject2).getString(R.l.dcw));
                ((com.tencent.mm.plugin.card.model.b)localObject3).title = ((StringBuilder)localObject4).toString();
                ((com.tencent.mm.plugin.card.model.b)localObject3).jxI = "";
                ((com.tencent.mm.plugin.card.model.b)localObject3).jBl = "";
                ((com.tencent.mm.plugin.card.model.b)localObject3).url = "card://jump_detail";
                if (i != 0) {
                  ((com.tencent.mm.plugin.card.a.f)localObject2).jxd.add(localObject3);
                }
                if ((!((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.aje()) || (((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajv().tZM <= 0))
                {
                  if ((!((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajc()) || (((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajv().tZM <= 0))
                  {
                    if (((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajv().tZM <= 0) {
                      break label5995;
                    }
                    com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CardDetailDataMgr", "shop_count:" + ((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajv().tZM);
                    if ((((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajv().tZM > 0) && (((com.tencent.mm.plugin.card.a.f)localObject2).jxf != null) && (((com.tencent.mm.plugin.card.a.f)localObject2).jxf.size() > 0))
                    {
                      localObject3 = (jp)((com.tencent.mm.plugin.card.a.f)localObject2).jxf.get(0);
                      if ((localObject3 == null) || (((jp)localObject3).tZw >= 50000.0F)) {
                        break label6186;
                      }
                      localObject4 = new com.tencent.mm.plugin.card.model.b();
                      ((com.tencent.mm.plugin.card.model.b)localObject4).jxT = 2;
                      ((com.tencent.mm.plugin.card.model.b)localObject4).title = ((jp)localObject3).name;
                      ((com.tencent.mm.plugin.card.model.b)localObject4).jxI = ((com.tencent.mm.plugin.card.a.f)localObject2).iPC.getString(R.l.ddP, new Object[] { com.tencent.mm.plugin.card.b.l.d(((com.tencent.mm.plugin.card.a.f)localObject2).iPC, ((jp)localObject3).tZw), ((jp)localObject3).gEy });
                      ((com.tencent.mm.plugin.card.model.b)localObject4).jBl = "";
                      ((com.tencent.mm.plugin.card.model.b)localObject4).url = "card://jump_shop";
                      ((com.tencent.mm.plugin.card.model.b)localObject4).jxX = ((jp)localObject3).jxX;
                      ((com.tencent.mm.plugin.card.model.b)localObject4).gjg = ((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajv().gjg;
                      ((com.tencent.mm.plugin.card.a.f)localObject2).jxd.add(localObject4);
                    }
                  }
                  if ((((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajv().tZM <= 0) || (((com.tencent.mm.plugin.card.a.f)localObject2).jxf != null)) {
                    break label6237;
                  }
                  localObject3 = new com.tencent.mm.plugin.card.model.b();
                  ((com.tencent.mm.plugin.card.model.b)localObject3).jxT = 1;
                  if (TextUtils.isEmpty(((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajv().ual)) {
                    break label6221;
                  }
                  ((com.tencent.mm.plugin.card.model.b)localObject3).title = ((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajv().ual;
                  ((com.tencent.mm.plugin.card.model.b)localObject3).jxI = "";
                  ((com.tencent.mm.plugin.card.model.b)localObject3).jBl = "";
                  ((com.tencent.mm.plugin.card.model.b)localObject3).url = "card://jump_shop_list";
                  ((com.tencent.mm.plugin.card.a.f)localObject2).jxd.add(localObject3);
                }
              }
              while ((((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajv().tZM <= 0) || (((com.tencent.mm.plugin.card.a.f)localObject2).jxf == null) || (((com.tencent.mm.plugin.card.a.f)localObject2).jxf.size() <= 0)) {
                for (;;)
                {
                  if (((!((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajg()) || (((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajw().status != 3)) && (!TextUtils.isEmpty(((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajv().tZF))) {
                    ((com.tencent.mm.plugin.card.a.f)localObject2).jxd.add(((com.tencent.mm.plugin.card.a.f)localObject2).ajU());
                  }
                  ((List)localObject1).addAll(((com.tencent.mm.plugin.card.a.f)localObject2).jxd);
                  localObject1 = this.jEF;
                  localObject2 = this.jxd;
                  ((m)localObject1).jxd.clear();
                  ((m)localObject1).jxd.addAll((Collection)localObject2);
                  this.jEF.jJz = this.jwZ.ajg();
                  this.jEF.notifyDataSetChanged();
                  break;
                  if ((localObject4 != null) && (((pu)localObject4).ufP != null) && (((pu)localObject4).ufP.size() > 0) && (!TextUtils.isEmpty((CharSequence)((pu)localObject4).ufP.get(0))))
                  {
                    i = 0;
                    break label5489;
                  }
                  i = 1;
                  break label5489;
                  if (localObject3 == null) {
                    break label5884;
                  }
                  com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CardDetailDataMgr", "distance:" + ((jp)localObject3).tZw);
                  break label5884;
                  ((com.tencent.mm.plugin.card.model.b)localObject3).title = ((com.tencent.mm.plugin.card.a.f)localObject2).getString(R.l.dcc);
                }
              }
              localObject3 = new com.tencent.mm.plugin.card.model.b();
              ((com.tencent.mm.plugin.card.model.b)localObject3).jxT = 1;
              localObject4 = (jp)((com.tencent.mm.plugin.card.a.f)localObject2).jxf.get(0);
              if (!TextUtils.isEmpty(((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajv().ual))
              {
                ((com.tencent.mm.plugin.card.model.b)localObject3).title = ((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajv().ual;
                if ((!((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajc()) || (((jp)localObject4).tZw >= 2000.0F)) {
                  break label6586;
                }
                if ((((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajv().tZM <= 1) && ((((com.tencent.mm.plugin.card.a.f)localObject2).jxf == null) || (((com.tencent.mm.plugin.card.a.f)localObject2).jxf.size() <= 1))) {
                  break label6565;
                }
                ((com.tencent.mm.plugin.card.model.b)localObject3).jxI = ((com.tencent.mm.plugin.card.a.f)localObject2).iPC.getString(R.l.dde, new Object[] { com.tencent.mm.plugin.card.b.l.d(((com.tencent.mm.plugin.card.a.f)localObject2).iPC, ((jp)localObject4).tZw) });
              }
              for (;;)
              {
                ((com.tencent.mm.plugin.card.model.b)localObject3).jBl = "";
                ((com.tencent.mm.plugin.card.model.b)localObject3).url = "card://jump_shop_list";
                ((com.tencent.mm.plugin.card.a.f)localObject2).jxd.add(localObject3);
                break;
                if ((!((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajc()) && (((jp)localObject4).tZw < 5000.0F))
                {
                  if ((((com.tencent.mm.plugin.card.a.f)localObject2).jwZ.ajv().tZM == 1) || (((com.tencent.mm.plugin.card.a.f)localObject2).jxf.size() == 1))
                  {
                    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailDataMgr", "shop_count is 1 or mShopList size is 1");
                    break;
                  }
                  ((com.tencent.mm.plugin.card.model.b)localObject3).title = ((com.tencent.mm.plugin.card.a.f)localObject2).getString(R.l.dci);
                  break label6338;
                }
                ((com.tencent.mm.plugin.card.model.b)localObject3).title = ((com.tencent.mm.plugin.card.a.f)localObject2).getString(R.l.dcc);
                break label6338;
                ((com.tencent.mm.plugin.card.model.b)localObject3).jxI = com.tencent.mm.plugin.card.b.l.d(((com.tencent.mm.plugin.card.a.f)localObject2).iPC, ((jp)localObject4).tZw);
                continue;
                ((com.tencent.mm.plugin.card.model.b)localObject3).jxI = "";
              }
              if (this.jwZ.ajv().jxG == 10)
              {
                this.jEE = new com.tencent.mm.plugin.card.ui.view.q();
                break label1912;
              }
              this.jEE = new com.tencent.mm.plugin.card.ui.view.j();
              break label1912;
              if (!this.jEE.h(this.jwZ)) {
                break label1927;
              }
              this.jEE.d(this.jwZ);
              this.jEE.update();
              break label1927;
              if (this.jEE == null) {
                break label1927;
              }
              this.jEE.amM();
              break label1927;
              com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CardDetailUIContoller", "don't update CardCodeView");
              if (this.jEE != null) {
                this.jEE.amM();
              }
              if (this.jED == null) {
                break label1944;
              }
              this.jED.dA(false);
              break label1944;
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "don't update CardAdvertiseView");
              this.jEO.amM();
            }
          }
        }
      }
    }
  }
  
  public final com.tencent.mm.plugin.card.ui.a.g alA()
  {
    GMTrace.i(4966055936000L, 37000);
    com.tencent.mm.plugin.card.ui.a.g localg = this.jEy;
    GMTrace.o(4966055936000L, 37000);
    return localg;
  }
  
  public final d alB()
  {
    GMTrace.i(4966190153728L, 37001);
    d locald = this.jEY;
    GMTrace.o(4966190153728L, 37001);
    return locald;
  }
  
  public final a alC()
  {
    GMTrace.i(4966324371456L, 37002);
    a locala = this.jEZ;
    GMTrace.o(4966324371456L, 37002);
    return locala;
  }
  
  public final com.tencent.mm.plugin.card.a.f alD()
  {
    GMTrace.i(4966458589184L, 37003);
    com.tencent.mm.plugin.card.a.f localf = this.jES;
    GMTrace.o(4966458589184L, 37003);
    return localf;
  }
  
  public final j alE()
  {
    GMTrace.i(4966592806912L, 37004);
    j localj = this.jEQ;
    GMTrace.o(4966592806912L, 37004);
    return localj;
  }
  
  public final void alG()
  {
    GMTrace.i(16026133594112L, 119404);
    com.tencent.mm.plugin.card.b.b.a(this.iPC, 0, this);
    this.iPC.vKC = this;
    GMTrace.o(16026133594112L, 119404);
  }
  
  public final void alH()
  {
    GMTrace.i(16026267811840L, 119405);
    Object localObject = new Intent();
    int j;
    String str1;
    String str2;
    int k;
    String str3;
    if ((this.jwZ instanceof CardInfo))
    {
      ((Intent)localObject).putExtra("key_card_info_data", (CardInfo)this.jwZ);
      ((Intent)localObject).putExtra("key_from_appbrand_type", this.jEZ.jFf);
      ((Intent)localObject).setClass(this.iPC, CardShopUI.class);
      this.iPC.startActivity((Intent)localObject);
      localObject = com.tencent.mm.plugin.report.service.g.ork;
      j = this.jwZ.ajv().jxG;
      str1 = this.jwZ.ajA();
      str2 = this.jwZ.ajz();
      k = this.jEZ.jBM;
      str3 = this.jEZ.jEj;
      if (!this.jwZ.ajt()) {
        break label262;
      }
    }
    label262:
    for (int i = 1;; i = 0)
    {
      ((com.tencent.mm.plugin.report.service.g)localObject).i(11324, new Object[] { "UsedStoresView", Integer.valueOf(j), str1, str2, Integer.valueOf(0), Integer.valueOf(k), str3, Integer.valueOf(i), "" });
      GMTrace.o(16026267811840L, 119405);
      return;
      if (!(this.jwZ instanceof ShareCardInfo)) {
        break;
      }
      ((Intent)localObject).putExtra("key_card_info_data", (ShareCardInfo)this.jwZ);
      break;
    }
  }
  
  public final int alI()
  {
    GMTrace.i(4967934984192L, 37014);
    if (this.jES == null)
    {
      GMTrace.o(4967934984192L, 37014);
      return 0;
    }
    com.tencent.mm.plugin.card.a.f localf = this.jES;
    if (localf.jxe == null) {}
    for (boolean bool = false; bool; bool = localf.jxe.jxW)
    {
      GMTrace.o(4967934984192L, 37014);
      return 1;
    }
    GMTrace.o(4967934984192L, 37014);
    return 0;
  }
  
  public final boolean alJ()
  {
    GMTrace.i(4968069201920L, 37015);
    if (this.jEy == null)
    {
      GMTrace.o(4968069201920L, 37015);
      return false;
    }
    boolean bool = this.jEy.alJ();
    GMTrace.o(4968069201920L, 37015);
    return bool;
  }
  
  public final com.tencent.mm.plugin.card.base.b alv()
  {
    GMTrace.i(4965250629632L, 36994);
    com.tencent.mm.plugin.card.base.b localb = this.jwZ;
    GMTrace.o(4965250629632L, 36994);
    return localb;
  }
  
  public final boolean alw()
  {
    GMTrace.i(4965519065088L, 36996);
    boolean bool = this.jEA;
    GMTrace.o(4965519065088L, 36996);
    return bool;
  }
  
  public final void alx()
  {
    GMTrace.i(4965653282816L, 36997);
    this.jEA = false;
    GMTrace.o(4965653282816L, 36997);
  }
  
  public final MMActivity aly()
  {
    GMTrace.i(4965787500544L, 36998);
    MMActivity localMMActivity = this.iPC;
    GMTrace.o(4965787500544L, 36998);
    return localMMActivity;
  }
  
  public final View.OnClickListener alz()
  {
    GMTrace.i(4965921718272L, 36999);
    View.OnClickListener localOnClickListener = this.hwh;
    GMTrace.o(4965921718272L, 36999);
    return localOnClickListener;
  }
  
  public final void b(com.tencent.mm.plugin.card.b.c paramc)
  {
    GMTrace.i(18900003586048L, 140816);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "on onReceiveCodeUnavailable! do update refresh code view!");
    Message localMessage = Message.obtain();
    c localc = new c();
    localc.jFl = b.jFi;
    localc.jFm = paramc;
    localMessage.obj = localc;
    this.jFa.sendMessage(localMessage);
    GMTrace.o(18900003586048L, 140816);
  }
  
  public final void c(com.tencent.mm.plugin.card.b.c paramc)
  {
    GMTrace.i(18899600932864L, 140813);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "onGetCodeSuccess! do update code view!");
    Message localMessage = Message.obtain();
    c localc = new c();
    localc.jFl = b.jFg;
    localc.jFm = paramc;
    localMessage.obj = localc;
    this.jFa.sendMessage(localMessage);
    GMTrace.o(18899600932864L, 140813);
  }
  
  public final void d(com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(4965384847360L, 36995);
    if (paramb != null)
    {
      this.jwZ = paramb;
      if (this.jEY != null) {
        this.jEY.d(paramb);
      }
      akN();
    }
    GMTrace.o(4965384847360L, 36995);
  }
  
  public final View findViewById(int paramInt)
  {
    GMTrace.i(4965116411904L, 36993);
    View localView = this.jBw.findViewById(paramInt);
    GMTrace.o(4965116411904L, 36993);
    return localView;
  }
  
  public final String getString(int paramInt)
  {
    GMTrace.i(4966727024640L, 37005);
    String str = this.iPC.getString(paramInt);
    GMTrace.o(4966727024640L, 37005);
    return str;
  }
  
  public static final class a
  {
    public int jBM;
    public String jDT;
    public String jDU;
    public String jEj;
    public String jEk;
    public String jEl;
    public int jFf;
    public int jtE;
    public String jwL;
    public boolean jxS;
    
    public a()
    {
      GMTrace.i(4968874508288L, 37021);
      this.jtE = 3;
      this.jBM = -1;
      this.jwL = "";
      this.jEj = "";
      this.jEk = "";
      this.jEl = "";
      this.jDT = "";
      this.jDU = "";
      this.jxS = false;
      this.jFf = 0;
      GMTrace.o(4968874508288L, 37021);
    }
  }
  
  public static enum b
  {
    static
    {
      GMTrace.i(18899064061952L, 140809);
      jFg = 1;
      jFh = 2;
      jFi = 3;
      jFj = 4;
      jFk = new int[] { jFg, jFh, jFi, jFj };
      GMTrace.o(18899064061952L, 140809);
    }
  }
  
  private static final class c
  {
    String eAR;
    int errCode;
    int jFl;
    com.tencent.mm.plugin.card.b.c jFm;
    
    public c()
    {
      GMTrace.i(18897185013760L, 140795);
      GMTrace.o(18897185013760L, 140795);
    }
  }
  
  public static abstract interface d
  {
    public abstract void alo();
    
    public abstract void alp();
    
    public abstract void alq();
    
    public abstract void alr();
    
    public abstract void als();
    
    public abstract void alt();
    
    public abstract void alu();
    
    public abstract void d(com.tencent.mm.plugin.card.base.b paramb);
    
    public abstract void dy(boolean paramBoolean);
    
    public abstract void up(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */