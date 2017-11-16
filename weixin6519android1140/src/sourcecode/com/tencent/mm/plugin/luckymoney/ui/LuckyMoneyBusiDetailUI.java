package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.g.a.hc;
import com.tencent.mm.g.a.hc.b;
import com.tencent.mm.plugin.luckymoney.b.aa;
import com.tencent.mm.plugin.luckymoney.b.af;
import com.tencent.mm.plugin.luckymoney.b.ag;
import com.tencent.mm.plugin.luckymoney.b.m;
import com.tencent.mm.plugin.luckymoney.b.n;
import com.tencent.mm.plugin.luckymoney.b.u;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.KeyboardLinearLayout.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMEditText.a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@com.tencent.mm.ui.base.a(3)
public class LuckyMoneyBusiDetailUI
  extends LuckyMoneyBaseUI
{
  private View Ks;
  private TextView jXT;
  private TextView jZU;
  private boolean knj;
  private View koo;
  private ListView mMY;
  private TextView mMZ;
  private ImageView mMg;
  private TextView mMi;
  private String mMo;
  private String mMp;
  private View mNa;
  private TextView mNb;
  private LuckyMoneyWishFooter mNc;
  private View mNd;
  private ImageView mNe;
  private View mNf;
  private ImageView mNg;
  private boolean mNh;
  private int mNi;
  private String mNj;
  private String mNk;
  private int mNl;
  private List<m> mNm;
  private Map<String, Integer> mNn;
  private i mNo;
  private String mNp;
  private boolean mNq;
  AbsListView.OnScrollListener mNr;
  private int vq;
  
  public LuckyMoneyBusiDetailUI()
  {
    GMTrace.i(9867687362560L, 73520);
    this.vq = 0;
    this.mNh = true;
    this.knj = false;
    this.mNl = 0;
    this.mNm = new LinkedList();
    this.mNn = new HashMap();
    this.mNp = "";
    this.mNq = false;
    this.mNr = new AbsListView.OnScrollListener()
    {
      private boolean mNs;
      private boolean mNt;
      
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        boolean bool = true;
        GMTrace.i(9837622591488L, 73296);
        if ((paramAnonymousInt3 == 0) || (!this.mNs))
        {
          GMTrace.o(9837622591488L, 73296);
          return;
        }
        if (paramAnonymousInt1 > 0) {}
        label70:
        label125:
        label128:
        for (;;)
        {
          if (this.mNt != bool)
          {
            if (bool)
            {
              LuckyMoneyBusiDetailUI.this.q(LuckyMoneyBusiDetailUI.this.getResources().getDrawable(a.e.snX));
              this.mNt = bool;
            }
          }
          else
          {
            GMTrace.o(9837622591488L, 73296);
            return;
            paramAnonymousAbsListView = paramAnonymousAbsListView.getChildAt(paramAnonymousInt1);
            if (paramAnonymousAbsListView == null) {
              break label125;
            }
          }
          for (paramAnonymousInt1 = 0 - paramAnonymousAbsListView.getTop();; paramAnonymousInt1 = 0)
          {
            if (paramAnonymousInt1 > 100) {
              break label128;
            }
            bool = false;
            break;
            LuckyMoneyBusiDetailUI.this.q(null);
            break label70;
          }
        }
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(9837488373760L, 73295);
        if (paramAnonymousAbsListView.getCount() == 0)
        {
          GMTrace.o(9837488373760L, 73295);
          return;
        }
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(9837488373760L, 73295);
          return;
          if (paramAnonymousAbsListView.getLastVisiblePosition() == paramAnonymousAbsListView.getCount() - 1)
          {
            if (!LuckyMoneyBusiDetailUI.this.mMW.aMd()) {
              LuckyMoneyBusiDetailUI.a(LuckyMoneyBusiDetailUI.this);
            }
            if ((LuckyMoneyBusiDetailUI.b(LuckyMoneyBusiDetailUI.this)) && (!LuckyMoneyBusiDetailUI.c(LuckyMoneyBusiDetailUI.this))) {
              LuckyMoneyBusiDetailUI.d(LuckyMoneyBusiDetailUI.this);
            }
          }
          this.mNs = false;
          GMTrace.o(9837488373760L, 73295);
          return;
          this.mNs = true;
        }
      }
    };
    GMTrace.o(9867687362560L, 73520);
  }
  
  private void a(final com.tencent.mm.plugin.luckymoney.b.e parame)
  {
    GMTrace.i(9868761104384L, 73528);
    if (parame == null)
    {
      GMTrace.o(9868761104384L, 73528);
      return;
    }
    boolean bool;
    label185:
    label262:
    label270:
    label338:
    label354:
    label375:
    Object localObject3;
    int i;
    label916:
    int j;
    if (parame.mIq == 1)
    {
      bool = true;
      this.mNh = bool;
      if (this.vq == 0)
      {
        this.mNj = parame.mIn;
        this.mNo.mQt = this.mNj;
        this.mNo.mQw = parame.mIy;
        if (parame != null)
        {
          localObject1 = this.vKB.vKW;
          if (parame.mIy != 2) {
            break label1269;
          }
          this.mMg.setImageResource(a.e.sob);
          if (parame.resourceId == 0) {
            break label1259;
          }
          w.i("MicroMsg.LuckyMoneyDetailUI", "busi logo load from file:" + parame.resourceId);
          localObject2 = new hc();
          ((hc)localObject2).eKl.eKn = parame.resourceId;
          ((hc)localObject2).eDO = new Runnable()
          {
            public final void run()
            {
              GMTrace.i(9789035773952L, 72934);
              if (localObject2.eKm.eKo)
              {
                w.i("MicroMsg.LuckyMoneyDetailUI", "Get res Ok, path=" + localObject2.eKm.eKp);
                ActionBarActivity localActionBarActivity = LuckyMoneyBusiDetailUI.this.vKB.vKW;
                n.e(LuckyMoneyBusiDetailUI.i(LuckyMoneyBusiDetailUI.this), localObject2.eKm.eKp, a.e.sob);
                GMTrace.o(9789035773952L, 72934);
                return;
              }
              w.i("MicroMsg.LuckyMoneyDetailUI", "Get res fail & load from url.");
              if (!bg.nm(parame.mIh)) {
                n.a(LuckyMoneyBusiDetailUI.i(LuckyMoneyBusiDetailUI.this), parame.mIh, parame.mIB);
              }
              GMTrace.o(9789035773952L, 72934);
            }
          };
          com.tencent.mm.sdk.b.a.vgX.a((b)localObject2, Looper.myLooper());
          n.a((Context)localObject1, this.mMZ, parame.mIg);
          n.a((Context)localObject1, this.mMi, parame.mIf);
          if ((parame.eYo != 2) || (this.mNi == 3)) {
            break label1298;
          }
          this.mNb.setText(com.tencent.mm.wallet_core.ui.e.r(parame.eYB / 100.0D));
          if (parame.mIo == 1) {
            break label1287;
          }
          this.mNo.mQu = true;
          this.mNa.setVisibility(0);
          if (bg.nm(parame.mFy)) {
            break label1350;
          }
          this.mNd.setVisibility(0);
          this.jZU.setText(parame.mFy);
          if (parame.mFw != 1) {
            break label1322;
          }
          if ((TextUtils.isEmpty(parame.mFx)) || (parame.mFx.startsWith("weixin://wxpay"))) {
            break label1310;
          }
          this.mNe.setVisibility(0);
          this.jZU.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(9811852787712L, 73104);
              if (!TextUtils.isEmpty(parame.mFx))
              {
                w.i("MicroMsg.LuckyMoneyDetailUI", "detail.changeUrl:" + parame.mFx);
                if (parame.mFx.startsWith("weixin://wxpay"))
                {
                  com.tencent.mm.wallet_core.ui.e.EQ(12);
                  com.tencent.mm.pluginsdk.wallet.g.T(LuckyMoneyBusiDetailUI.this.vKB.vKW, 1);
                  GMTrace.o(9811852787712L, 73104);
                  return;
                }
                com.tencent.mm.wallet_core.ui.e.EQ(7);
                paramAnonymousView = new Intent();
                paramAnonymousView.putExtra("rawUrl", parame.mFx);
                d.b(LuckyMoneyBusiDetailUI.this.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
                GMTrace.o(9811852787712L, 73104);
                return;
              }
              com.tencent.mm.wallet_core.ui.e.EQ(12);
              com.tencent.mm.pluginsdk.wallet.g.T(LuckyMoneyBusiDetailUI.this.vKB.vKW, 1);
              w.e("MicroMsg.LuckyMoneyDetailUI", "detail.changeUrl is empty");
              GMTrace.o(9811852787712L, 73104);
            }
          });
          if (bg.nm(parame.mIr)) {
            break label1370;
          }
          this.jXT.setText(parame.mIr);
        }
        if (parame != null)
        {
          localObject1 = parame.mIu;
          if ((localObject1 != null) && (((List)localObject1).size() > 0))
          {
            localObject2 = this.Ks.findViewById(a.f.ssD);
            localObject3 = this.Ks.findViewById(a.f.ssE);
            View localView1 = this.Ks.findViewById(a.f.ssF);
            ViewGroup localViewGroup1 = (ViewGroup)this.Ks.findViewById(a.f.ssA);
            ViewGroup localViewGroup2 = (ViewGroup)this.Ks.findViewById(a.f.ssB);
            ViewGroup localViewGroup3 = (ViewGroup)this.Ks.findViewById(a.f.ssC);
            View localView2 = this.Ks.findViewById(a.f.ssv);
            View localView3 = this.Ks.findViewById(a.f.ssw);
            g.c localc = new g.c();
            localc.textColor = getResources().getColor(a.c.smm);
            localc.mPT = true;
            localc.resourceId = parame.resourceId;
            localc.mPU = this.mNl;
            if (((List)localObject1).size() > 0)
            {
              g.a(this, localViewGroup1, (ag)((List)localObject1).get(0), localc);
              ((View)localObject2).setVisibility(0);
            }
            if (((List)localObject1).size() > 1)
            {
              g.a(this, localViewGroup2, (ag)((List)localObject1).get(1), localc);
              ((View)localObject3).setVisibility(0);
            }
            if (((List)localObject1).size() > 2)
            {
              g.a(this, localViewGroup3, (ag)((List)localObject1).get(2), localc);
              localView1.setVisibility(0);
            }
            if ((((View)localObject2).getVisibility() == 0) && ((((View)localObject3).getVisibility() == 0) || (localView1.getVisibility() == 0))) {
              localView2.setVisibility(0);
            }
            if ((((View)localObject3).getVisibility() == 0) && (localView1.getVisibility() == 0)) {
              localView3.setVisibility(0);
            }
            if ((((View)localObject2).getVisibility() == 0) || (((View)localObject3).getVisibility() == 0) || (localView1.getVisibility() == 0))
            {
              this.mNf.requestLayout();
              this.mNf.setVisibility(0);
            }
          }
          localObject1 = (ViewGroup)this.koo.findViewById(a.f.ssx);
          localObject2 = new g.c();
          ((g.c)localObject2).textColor = getResources().getColor(a.c.smm);
          ((g.c)localObject2).textSize = getResources().getDimensionPixelSize(a.d.aQP);
          g.a(this, (ViewGroup)localObject1, parame.mIv, (g.c)localObject2);
        }
        com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(qa(parame.mIy)), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
      }
      if (parame != null)
      {
        if (((parame.eYn != 3) && (parame.eYn != 2)) || (parame.mIp != 1) || (this.mNh) || (parame.mIs != 1)) {
          break label1381;
        }
        i = 1;
        if ((parame.mIt == null) || (parame.mIt.fPf != 1) || (bg.nm(parame.mIt.mHM))) {
          break label1386;
        }
        j = 1;
        label949:
        localObject1 = (TextView)this.koo.findViewById(a.f.ssJ);
        if ((i == 0) && (j == 0)) {
          break label1391;
        }
        ((TextView)localObject1).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(9833596059648L, 73266);
            com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(LuckyMoneyBusiDetailUI.qb(parame.mIy)), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(3) });
            n.a(LuckyMoneyBusiDetailUI.this, 1, false);
            GMTrace.o(9833596059648L, 73266);
          }
        });
        if (j != 0)
        {
          this.mNk = parame.mIt.mHM;
          ((TextView)localObject1).setText(parame.mIt.mHN);
        }
        com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(qa(parame.mIy)), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2) });
        ((TextView)localObject1).setVisibility(0);
        label1073:
        localObject2 = (TextView)this.koo.findViewById(a.f.ssH);
        if ((this.mNi == 1) || (this.mNi == 3) || (((TextView)localObject1).getVisibility() == 0)) {
          break label1401;
        }
        ((TextView)localObject2).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(9794941353984L, 72978);
            com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(LuckyMoneyBusiDetailUI.qb(parame.mIy)), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(4) });
            paramAnonymousView = new Intent();
            paramAnonymousView.setClass(LuckyMoneyBusiDetailUI.this.vKB.vKW, LuckyMoneyMyRecordUI.class);
            paramAnonymousView.putExtra("key_type", 2);
            LuckyMoneyBusiDetailUI.this.startActivity(paramAnonymousView);
            GMTrace.o(9794941353984L, 72978);
          }
        });
        ((TextView)localObject2).setVisibility(0);
      }
    }
    for (;;)
    {
      if (!this.mNq)
      {
        this.mMY.addFooterView(this.koo);
        this.mNq = true;
      }
      localObject1 = parame.mIz;
      if (localObject1 == null) {
        break label1443;
      }
      i = 0;
      while (i < ((List)localObject1).size())
      {
        localObject2 = (m)((List)localObject1).get(i);
        if (!this.mNn.containsKey(((m)localObject2).mIn))
        {
          this.mNm.add(((List)localObject1).get(i));
          this.mNn.put(((m)localObject2).mIn, Integer.valueOf(1));
        }
        i += 1;
      }
      bool = false;
      break;
      label1259:
      if (bg.nm(parame.mIh)) {
        break label185;
      }
      label1269:
      n.a(this.mMg, parame.mIh, parame.mIB);
      break label185;
      label1287:
      this.mNo.mQu = false;
      break label262;
      label1298:
      this.mNa.setVisibility(8);
      break label270;
      label1310:
      this.mNe.setVisibility(8);
      break label338;
      label1322:
      w.e("MicroMsg.LuckyMoneyDetailUI", "detail.jumpChange is false");
      this.jZU.setTextColor(getResources().getColor(a.c.sms));
      break label354;
      label1350:
      w.e("MicroMsg.LuckyMoneyDetailUI", "detail.changeWording is empty");
      this.mNd.setVisibility(8);
      break label354;
      label1370:
      this.jXT.setText(null);
      break label375;
      label1381:
      i = 0;
      break label916;
      label1386:
      j = 0;
      break label949;
      label1391:
      ((TextView)localObject1).setVisibility(8);
      break label1073;
      label1401:
      ((TextView)localObject2).setVisibility(8);
    }
    this.vq += ((List)localObject1).size();
    this.knj = false;
    this.mNo.aS(this.mNm);
    label1443:
    Object localObject1 = parame.mIx;
    final Object localObject2 = parame.mIA;
    this.mNg.setImageResource(a.e.soa);
    if (bg.nm((String)localObject1))
    {
      w.i("MicroMsg.LuckyMoneyDetailUI", "renderAdImage: no adImage");
      this.mNg.setVisibility(8);
    }
    for (;;)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(13051, new Object[] { Integer.valueOf(this.mNl), Integer.valueOf(1), parame.mIx, n.aR(parame.mIu), "", "", "", "", parame.mIg, Integer.valueOf(parame.resourceId) });
      GMTrace.o(9868761104384L, 73528);
      return;
      new DisplayMetrics();
      localObject3 = ab.getContext().getResources().getDisplayMetrics();
      if (localObject3 != null)
      {
        i = (int)((((DisplayMetrics)localObject3).widthPixels - getResources().getDimensionPixelSize(a.d.snp) * 2 - getResources().getDimensionPixelSize(a.d.sno) * 2) * 0.75F);
        localObject3 = this.mNg.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject3).height = i;
        this.mNg.setLayoutParams((ViewGroup.LayoutParams)localObject3);
      }
      n.a(this.mNg, (String)localObject1, (String)localObject2, false);
      this.mNg.setVisibility(0);
    }
  }
  
  private void aMC()
  {
    GMTrace.i(9868626886656L, 73527);
    this.knj = true;
    if ((this.vq > 0) && (this.mNm.size() > 0) && (this.mNm.get(this.mNm.size() - 1) != null))
    {
      l(new u(this.mMo, this.vq, this.mMp, bg.getLong(((m)this.mNm.get(this.mNm.size() - 1)).mIK, 0L), "v1.0", this.mNp));
      GMTrace.o(9868626886656L, 73527);
      return;
    }
    this.mNp = "";
    l(new u(this.mMo, 11, this.vq, this.mMp, "v1.0", this.mNp));
    GMTrace.o(9868626886656L, 73527);
  }
  
  private void aMD()
  {
    GMTrace.i(9868895322112L, 73529);
    if ((this.mNc != null) && (this.mNc.getVisibility() != 8)) {
      this.mNc.setVisibility(8);
    }
    GMTrace.o(9868895322112L, 73529);
  }
  
  private static int qa(int paramInt)
  {
    GMTrace.i(9869163757568L, 73531);
    if (paramInt == 2)
    {
      GMTrace.o(9869163757568L, 73531);
      return 13;
    }
    GMTrace.o(9869163757568L, 73531);
    return 7;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(9868090015744L, 73523);
    if ((paramk instanceof u))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (u)paramk;
        paramk = paramString.mJj;
        this.mNp = paramString.mJv;
        a(paramk);
        GMTrace.o(9868090015744L, 73523);
        return true;
      }
      h.bm(this, paramString);
      GMTrace.o(9868090015744L, 73523);
      return true;
    }
    if ((paramk instanceof aa))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        h.bm(this, getString(a.i.dCJ));
        this.mNo.mQu = false;
        aMD();
        paramString = (aa)paramk;
        if (this.mNm != null) {
          paramInt1 = 0;
        }
        for (;;)
        {
          if (paramInt1 < this.mNm.size())
          {
            paramk = (m)this.mNm.get(paramInt1);
            if (paramk.mIn.equalsIgnoreCase(paramString.mIn))
            {
              paramk.mIY = paramString.mIf;
              this.mNo.notifyDataSetChanged();
            }
          }
          else
          {
            GMTrace.o(9868090015744L, 73523);
            return true;
          }
          paramInt1 += 1;
        }
      }
      h.bm(this, paramString);
      GMTrace.o(9868090015744L, 73523);
      return true;
    }
    if ((paramk instanceof af))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        h.bm(this, getString(a.i.dCJ));
        GMTrace.o(9868090015744L, 73523);
        return true;
      }
      h.bm(this, paramString);
      GMTrace.o(9868090015744L, 73523);
      return true;
    }
    GMTrace.o(9868090015744L, 73523);
    return false;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(9867955798016L, 73522);
    if ((paramKeyEvent.getKeyCode() == 4) && (this.mNc.getVisibility() == 0))
    {
      this.mNc.setVisibility(8);
      GMTrace.o(9867955798016L, 73522);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(9867955798016L, 73522);
    return bool;
  }
  
  public void finish()
  {
    GMTrace.i(9868358451200L, 73525);
    if (getIntent().hasExtra("key_realname_guide_helper"))
    {
      RealnameGuideHelper localRealnameGuideHelper = (RealnameGuideHelper)getIntent().getParcelableExtra("key_realname_guide_helper");
      Bundle localBundle = new Bundle();
      localBundle.putString("realname_verify_process_jump_plugin", "luckymoney");
      localBundle.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyBusiDetailUI");
      boolean bool = localRealnameGuideHelper.b(this, localBundle, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(9794136047616L, 72972);
          w.i("MicroMsg.LuckyMoneyDetailUI", "RealnameGuideHelper dialog click cancel");
          GMTrace.o(9794136047616L, 72972);
        }
      });
      getIntent().removeExtra("key_realname_guide_helper");
      if (!bool) {
        super.finish();
      }
      GMTrace.o(9868358451200L, 73525);
      return;
    }
    super.finish();
    GMTrace.o(9868358451200L, 73525);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9868492668928L, 73526);
    int i = a.g.sMJ;
    GMTrace.o(9868492668928L, 73526);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(9868224233472L, 73524);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      GMTrace.o(9868224233472L, 73524);
      return;
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        String str = paramIntent.getStringExtra("Select_Conv_User");
        if (!bg.nm(str)) {
          if ((this.mNk != null) && (this.mNk.startsWith("wxpay://c2cbizmessagehandler/hongbao/festivalhongbao"))) {
            w.i("MicroMsg.LuckyMoneyDetailUI", "Not expected branch since 2015 fesitval");
          } else {
            l(new af(str.replaceAll(",", "|"), this.mMo, "v1.0"));
          }
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9867821580288L, 73521);
    super.onCreate(paramBundle);
    this.mMY = ((ListView)findViewById(a.f.ssI));
    this.mNo = new i(this.vKB.vKW);
    this.Ks = LayoutInflater.from(this).inflate(a.g.sMI, null);
    this.mMY.addHeaderView(this.Ks);
    this.mMY.setAdapter(this.mNo);
    this.Ks.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9788230467584L, 72928);
        LuckyMoneyBusiDetailUI.e(LuckyMoneyBusiDetailUI.this);
        GMTrace.o(9788230467584L, 72928);
      }
    });
    this.mMY.setOnScrollListener(this.mNr);
    this.mMY.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(9855876202496L, 73432);
        LuckyMoneyBusiDetailUI.e(LuckyMoneyBusiDetailUI.this);
        GMTrace.o(9855876202496L, 73432);
      }
    });
    this.koo = LayoutInflater.from(this).inflate(a.g.sMH, null);
    this.mMg = ((ImageView)this.Ks.findViewById(a.f.ssr));
    this.mMZ = ((TextView)this.Ks.findViewById(a.f.ssL));
    this.mMi = ((TextView)this.Ks.findViewById(a.f.ssN));
    this.mNa = this.Ks.findViewById(a.f.ssq);
    this.mNb = ((TextView)this.Ks.findViewById(a.f.ssp));
    this.mNd = this.Ks.findViewById(a.f.ssy);
    this.jZU = ((TextView)this.Ks.findViewById(a.f.ssK));
    this.mNe = ((ImageView)this.Ks.findViewById(a.f.ssz));
    this.jXT = ((TextView)this.Ks.findViewById(a.f.ssu));
    this.mNf = this.Ks.findViewById(a.f.ssG);
    this.mNg = ((ImageView)this.Ks.findViewById(a.f.sso));
    paramBundle = (ImageView)findViewById(a.f.sst);
    this.mNc = ((LuckyMoneyWishFooter)findViewById(a.f.ssM));
    this.mNc.a(new MMEditText.a()
    {
      public final void aME()
      {
        GMTrace.i(9828495785984L, 73228);
        if (LuckyMoneyBusiDetailUI.f(LuckyMoneyBusiDetailUI.this).getVisibility() == 0)
        {
          LuckyMoneyBusiDetailUI.f(LuckyMoneyBusiDetailUI.this).setVisibility(8);
          GMTrace.o(9828495785984L, 73228);
          return;
        }
        LuckyMoneyBusiDetailUI.this.vKB.vKW.finish();
        GMTrace.o(9828495785984L, 73228);
      }
    });
    this.mNc.a(new LuckyMoneyWishFooter.a()
    {
      public final void BF(String paramAnonymousString)
      {
        GMTrace.i(9832522317824L, 73258);
        if ((!bg.nm(paramAnonymousString)) && (!bg.nm(LuckyMoneyBusiDetailUI.g(LuckyMoneyBusiDetailUI.this))))
        {
          paramAnonymousString = new aa(LuckyMoneyBusiDetailUI.h(LuckyMoneyBusiDetailUI.this), paramAnonymousString, LuckyMoneyBusiDetailUI.g(LuckyMoneyBusiDetailUI.this), "v1.0");
          LuckyMoneyBusiDetailUI.this.l(paramAnonymousString);
          LuckyMoneyBusiDetailUI.e(LuckyMoneyBusiDetailUI.this);
        }
        GMTrace.o(9832522317824L, 73258);
      }
    });
    this.mNc.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9874666684416L, 73572);
        j.g(LuckyMoneyBusiDetailUI.this);
        GMTrace.o(9874666684416L, 73572);
      }
    });
    this.mNc.vJe = new KeyboardLinearLayout.a()
    {
      public final void oD(int paramAnonymousInt)
      {
        GMTrace.i(9815879319552L, 73134);
        if ((paramAnonymousInt == -2) && (LuckyMoneyBusiDetailUI.f(LuckyMoneyBusiDetailUI.this).mQQ)) {
          LuckyMoneyBusiDetailUI.f(LuckyMoneyBusiDetailUI.this).mQQ = false;
        }
        GMTrace.o(9815879319552L, 73134);
      }
    };
    this.mNo.mQv = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9789304209408L, 72936);
        LuckyMoneyBusiDetailUI.f(LuckyMoneyBusiDetailUI.this).setVisibility(0);
        GMTrace.o(9789304209408L, 72936);
      }
    };
    i locali = this.mNo;
    locali.mQx = new i.a(locali);
    this.mNc.aMS();
    paramBundle.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9802323329024L, 73033);
        LuckyMoneyBusiDetailUI.this.finish();
        GMTrace.o(9802323329024L, 73033);
      }
    });
    paramBundle = findViewById(a.f.sss);
    if (paramBundle != null)
    {
      paramBundle = paramBundle.getBackground();
      if ((paramBundle != null) && ((paramBundle instanceof BitmapDrawable)))
      {
        paramBundle = (BitmapDrawable)paramBundle;
        paramBundle.mutate();
        paramBundle.setTileModeX(Shader.TileMode.REPEAT);
      }
    }
    this.mMo = getIntent().getStringExtra("key_sendid");
    this.mMp = getIntent().getStringExtra("key_native_url");
    this.mNi = getIntent().getIntExtra("key_jump_from", 2);
    this.mNl = getIntent().getIntExtra("key_static_from_scene", 0);
    w.i("MicroMsg.LuckyMoneyDetailUI", "initData: sendid=%s , nativeurl=%s, jumpFrom=%d", new Object[] { this.mMo, this.mMp, Integer.valueOf(this.mNi) });
    if (this.mNi == 2) {}
    for (;;)
    {
      try
      {
        paramBundle = getIntent().getByteArrayExtra("key_detail_info");
        if (paramBundle != null)
        {
          paramBundle = (com.tencent.mm.plugin.luckymoney.b.e)new com.tencent.mm.plugin.luckymoney.b.e().aD(paramBundle);
          if (paramBundle != null)
          {
            a(paramBundle);
            if (getIntent().getBooleanExtra("play_sound", false)) {
              k.C(this, a.i.sTY);
            }
            GMTrace.o(9867821580288L, 73521);
            return;
          }
        }
      }
      catch (Exception paramBundle)
      {
        w.w("MicroMsg.LuckyMoneyDetailUI", "initData: parse LuckyMoneyDetail fail!" + paramBundle.getLocalizedMessage());
      }
      if ((bg.nm(this.mMo)) && (!bg.nm(this.mMp))) {
        paramBundle = Uri.parse(this.mMp);
      }
      try
      {
        this.mMo = paramBundle.getQueryParameter("sendid");
        if (!bg.nm(this.mMo)) {
          aMC();
        }
      }
      catch (Exception paramBundle)
      {
        for (;;)
        {
          w.w("MicroMsg.LuckyMoneyDetailUI", "initData: parse uri exp:" + paramBundle.getLocalizedMessage());
        }
        w.w("MicroMsg.LuckyMoneyDetailUI", "sendid null or nil, finish");
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(9869029539840L, 73530);
    super.onDestroy();
    if (this.mNc != null) {
      this.mNc.aMT();
    }
    GMTrace.o(9869029539840L, 73530);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\ui\LuckyMoneyBusiDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */