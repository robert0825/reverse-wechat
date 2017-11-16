package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.g.a.hc;
import com.tencent.mm.g.a.hc.b;
import com.tencent.mm.plugin.luckymoney.b.aa;
import com.tencent.mm.plugin.luckymoney.b.ag;
import com.tencent.mm.plugin.luckymoney.b.m;
import com.tencent.mm.plugin.luckymoney.b.u;
import com.tencent.mm.plugin.luckymoney.particles.c;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wallet_core.model.x;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.KeyboardLinearLayout.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMEditText.a;
import com.tencent.mm.y.s;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class LuckyMoneyDetailUI
  extends LuckyMoneyBaseUI
{
  private View Ks;
  private TextView jXT;
  private TextView jZU;
  private long jro;
  private ImageView kIs;
  private boolean knj;
  private View koo;
  private SoundPool mFg;
  private com.tencent.mm.plugin.luckymoney.particles.b mGE;
  private int mIy;
  private ListView mMY;
  private TextView mMZ;
  private ImageView mMg;
  private TextView mMi;
  private String mMo;
  private String mMp;
  private ImageView mNU;
  private ImageView mNV;
  private View mNW;
  private ImageView mNX;
  private TextView mNY;
  private View mNZ;
  private View mNa;
  private TextView mNb;
  private LuckyMoneyWishFooter mNc;
  private View mNd;
  private ImageView mNe;
  private View mNf;
  private boolean mNh;
  private int mNi;
  private String mNj;
  private String mNk;
  private List<m> mNm;
  private Map<String, Integer> mNn;
  private i mNo;
  private String mNp;
  private boolean mNq;
  AbsListView.OnScrollListener mNr;
  private RelativeLayout mOa;
  private int[] mOb;
  private ViewGroup mOc;
  private Bitmap mOd;
  private Bitmap mOe;
  private Bitmap mOf;
  private Bitmap mOg;
  private Bitmap mOh;
  private Bitmap mOi;
  private Bitmap mOj;
  private Bitmap mOk;
  private final int mOl;
  private final int mOm;
  private int vq;
  
  public LuckyMoneyDetailUI()
  {
    GMTrace.i(9860305387520L, 73465);
    this.vq = 0;
    this.mNh = true;
    this.knj = false;
    this.mIy = -1;
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
        GMTrace.i(9809034215424L, 73083);
        if ((paramAnonymousInt3 == 0) || (!this.mNs))
        {
          GMTrace.o(9809034215424L, 73083);
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
              LuckyMoneyDetailUI.this.q(LuckyMoneyDetailUI.this.getResources().getDrawable(a.e.snX));
              this.mNt = bool;
            }
          }
          else
          {
            GMTrace.o(9809034215424L, 73083);
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
            LuckyMoneyDetailUI.this.q(null);
            break label70;
          }
        }
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(9808899997696L, 73082);
        if (paramAnonymousAbsListView.getCount() == 0)
        {
          GMTrace.o(9808899997696L, 73082);
          return;
        }
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(9808899997696L, 73082);
          return;
          if (paramAnonymousAbsListView.getLastVisiblePosition() == paramAnonymousAbsListView.getCount() - 1)
          {
            if (!LuckyMoneyDetailUI.this.mMW.aMd()) {
              LuckyMoneyDetailUI.a(LuckyMoneyDetailUI.this);
            }
            if ((LuckyMoneyDetailUI.b(LuckyMoneyDetailUI.this)) && (!LuckyMoneyDetailUI.c(LuckyMoneyDetailUI.this))) {
              LuckyMoneyDetailUI.d(LuckyMoneyDetailUI.this);
            }
          }
          this.mNs = false;
          GMTrace.o(9808899997696L, 73082);
          return;
          this.mNs = true;
        }
      }
    };
    this.mGE = new com.tencent.mm.plugin.luckymoney.particles.b()
    {
      public final com.tencent.mm.plugin.luckymoney.particles.a.b b(Random paramAnonymousRandom)
      {
        GMTrace.i(9840038510592L, 73314);
        switch (paramAnonymousRandom.nextInt(8))
        {
        default: 
          GMTrace.o(9840038510592L, 73314);
          return null;
        case 0: 
          if (LuckyMoneyDetailUI.e(LuckyMoneyDetailUI.this) == null) {
            LuckyMoneyDetailUI.a(LuckyMoneyDetailUI.this, LuckyMoneyDetailUI.a(LuckyMoneyDetailUI.this, a.e.soi));
          }
          paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyDetailUI.e(LuckyMoneyDetailUI.this));
          GMTrace.o(9840038510592L, 73314);
          return paramAnonymousRandom;
        case 1: 
          if (LuckyMoneyDetailUI.f(LuckyMoneyDetailUI.this) == null) {
            LuckyMoneyDetailUI.b(LuckyMoneyDetailUI.this, LuckyMoneyDetailUI.a(LuckyMoneyDetailUI.this, a.e.soj));
          }
          paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyDetailUI.f(LuckyMoneyDetailUI.this));
          GMTrace.o(9840038510592L, 73314);
          return paramAnonymousRandom;
        case 2: 
          if (LuckyMoneyDetailUI.g(LuckyMoneyDetailUI.this) == null) {
            LuckyMoneyDetailUI.c(LuckyMoneyDetailUI.this, LuckyMoneyDetailUI.a(LuckyMoneyDetailUI.this, a.e.sok));
          }
          paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyDetailUI.g(LuckyMoneyDetailUI.this));
          GMTrace.o(9840038510592L, 73314);
          return paramAnonymousRandom;
        case 3: 
          if (LuckyMoneyDetailUI.h(LuckyMoneyDetailUI.this) == null) {
            LuckyMoneyDetailUI.d(LuckyMoneyDetailUI.this, LuckyMoneyDetailUI.a(LuckyMoneyDetailUI.this, a.e.sod));
          }
          paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyDetailUI.h(LuckyMoneyDetailUI.this));
          GMTrace.o(9840038510592L, 73314);
          return paramAnonymousRandom;
        case 4: 
          if (LuckyMoneyDetailUI.i(LuckyMoneyDetailUI.this) == null) {
            LuckyMoneyDetailUI.e(LuckyMoneyDetailUI.this, LuckyMoneyDetailUI.a(LuckyMoneyDetailUI.this, a.e.soe));
          }
          paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyDetailUI.i(LuckyMoneyDetailUI.this));
          GMTrace.o(9840038510592L, 73314);
          return paramAnonymousRandom;
        case 5: 
          if (LuckyMoneyDetailUI.j(LuckyMoneyDetailUI.this) == null) {
            LuckyMoneyDetailUI.f(LuckyMoneyDetailUI.this, LuckyMoneyDetailUI.a(LuckyMoneyDetailUI.this, a.e.sof));
          }
          paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyDetailUI.j(LuckyMoneyDetailUI.this));
          GMTrace.o(9840038510592L, 73314);
          return paramAnonymousRandom;
        case 6: 
          if (LuckyMoneyDetailUI.k(LuckyMoneyDetailUI.this) == null) {
            LuckyMoneyDetailUI.g(LuckyMoneyDetailUI.this, LuckyMoneyDetailUI.a(LuckyMoneyDetailUI.this, a.e.sog));
          }
          paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyDetailUI.k(LuckyMoneyDetailUI.this));
          GMTrace.o(9840038510592L, 73314);
          return paramAnonymousRandom;
        }
        if (LuckyMoneyDetailUI.l(LuckyMoneyDetailUI.this) == null) {
          LuckyMoneyDetailUI.h(LuckyMoneyDetailUI.this, LuckyMoneyDetailUI.a(LuckyMoneyDetailUI.this, a.e.soh));
        }
        paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyDetailUI.l(LuckyMoneyDetailUI.this));
        GMTrace.o(9840038510592L, 73314);
        return paramAnonymousRandom;
      }
    };
    this.jro = 0L;
    this.mOl = 750;
    this.mOm = 240;
    GMTrace.o(9860305387520L, 73465);
  }
  
  private void a(final com.tencent.mm.plugin.luckymoney.b.e parame)
  {
    GMTrace.i(9861781782528L, 73476);
    if (parame == null)
    {
      GMTrace.o(9861781782528L, 73476);
      return;
    }
    boolean bool;
    Object localObject1;
    int i;
    label119:
    label156:
    final Object localObject2;
    label279:
    label331:
    label428:
    label479:
    label487:
    label555:
    label571:
    label592:
    label1109:
    int j;
    if (parame.mIq == 1)
    {
      bool = true;
      this.mNh = bool;
      if (this.vq == 0)
      {
        this.mNj = parame.mIn;
        localObject1 = this.mNj;
        if ((parame == null) || (parame.mIb != 0) || (parame.mIz == null) || (parame.mIz.size() <= 0) || (!((m)parame.mIz.get(0)).mIn.equals(localObject1)) || (parame.mIo == 1)) {
          break label1419;
        }
        i = 1;
        if (i == 0) {
          break label1424;
        }
        this.mNo.mQu = false;
        this.mNY.setVisibility(0);
        this.mNZ.setVisibility(0);
        this.jXT.setVisibility(8);
        this.mNo.mQw = parame.mIy;
        if (parame != null)
        {
          localObject1 = this.vKB.vKW;
          if (parame.mIy != 2) {
            break label1464;
          }
          this.mMg.setImageResource(a.e.sob);
          if (parame.resourceId == 0) {
            break label1446;
          }
          w.i("MicroMsg.LuckyMoneyDetailUI", "busi logo load from file:" + parame.resourceId);
          localObject2 = new hc();
          ((hc)localObject2).eKl.eKn = parame.resourceId;
          ((hc)localObject2).eDO = new Runnable()
          {
            public final void run()
            {
              GMTrace.i(9798162579456L, 73002);
              if (localObject2.eKm.eKo)
              {
                w.i("MicroMsg.LuckyMoneyDetailUI", "Get res Ok, path=" + localObject2.eKm.eKp);
                ActionBarActivity localActionBarActivity = LuckyMoneyDetailUI.this.vKB.vKW;
                com.tencent.mm.plugin.luckymoney.b.n.e(LuckyMoneyDetailUI.v(LuckyMoneyDetailUI.this), localObject2.eKm.eKp, a.e.sob);
                GMTrace.o(9798162579456L, 73002);
                return;
              }
              w.i("MicroMsg.LuckyMoneyDetailUI", "Get res fail & load from url.");
              com.tencent.mm.plugin.luckymoney.b.n.a(LuckyMoneyDetailUI.v(LuckyMoneyDetailUI.this), parame.mIh, parame.mIB);
              GMTrace.o(9798162579456L, 73002);
            }
          };
          com.tencent.mm.sdk.b.a.vgX.a((com.tencent.mm.sdk.b.b)localObject2, Looper.myLooper());
          com.tencent.mm.plugin.luckymoney.b.n.a((Context)localObject1, this.mMZ, parame.mIg);
          com.tencent.mm.plugin.luckymoney.b.n.a((Context)localObject1, this.mMi, parame.mIf);
          if (parame.mIb != 1) {
            break label1482;
          }
          this.mNU.setVisibility(0);
          this.mNU.setImageResource(a.e.son);
          if (!bg.nm(parame.mIw))
          {
            com.tencent.mm.plugin.luckymoney.b.n.d(this.mNV, parame.mIw, a.e.sop);
            this.mNV.setScaleType(ImageView.ScaleType.FIT_XY);
          }
          if (bg.nm(parame.mIx)) {
            break label1560;
          }
          w.i("MicroMsg.LuckyMoneyDetailUI", "hy: has url : %s", new Object[] { parame.mIx });
          this.mOa.setVisibility(4);
          com.tencent.mm.plugin.luckymoney.b.n.g(this.kIs, parame.mIx);
          com.tencent.mm.sdk.platformtools.af.i(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(20955279654912L, 156129);
              LuckyMoneyDetailUI.w(LuckyMoneyDetailUI.this);
              LuckyMoneyDetailUI.x(LuckyMoneyDetailUI.this).setVisibility(0);
              GMTrace.o(20955279654912L, 156129);
            }
          }, 500L);
          if ((parame.eYo != 2) || (this.mNi == 3)) {
            break label1592;
          }
          this.mNb.setText(com.tencent.mm.wallet_core.ui.e.r(parame.eYB / 100.0D));
          if (parame.mIo == 1) {
            break label1581;
          }
          this.mNo.mQu = true;
          this.mNa.setVisibility(0);
          if (bg.nm(parame.mFy)) {
            break label1645;
          }
          this.mNd.setVisibility(0);
          this.jZU.setText(parame.mFy);
          if (parame.mFw != 1) {
            break label1616;
          }
          if ((TextUtils.isEmpty(parame.mFx)) || (parame.mFx.startsWith("weixin://wxpay"))) {
            break label1604;
          }
          this.mNe.setVisibility(0);
          this.jZU.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(9829166874624L, 73233);
              if (!TextUtils.isEmpty(parame.mFx))
              {
                w.i("MicroMsg.LuckyMoneyDetailUI", "detail.changeUrl:" + parame.mFx);
                if (parame.mFx.startsWith("weixin://wxpay"))
                {
                  com.tencent.mm.wallet_core.ui.e.EQ(12);
                  com.tencent.mm.pluginsdk.wallet.g.T(LuckyMoneyDetailUI.this.vKB.vKW, 1);
                  com.tencent.mm.plugin.report.service.g.ork.i(13184, new Object[] { Integer.valueOf(0), parame.mFx });
                  GMTrace.o(9829166874624L, 73233);
                  return;
                }
                com.tencent.mm.wallet_core.ui.e.EQ(7);
                paramAnonymousView = new Intent();
                paramAnonymousView.putExtra("rawUrl", parame.mFx);
                com.tencent.mm.bj.d.b(LuckyMoneyDetailUI.this.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
                com.tencent.mm.plugin.report.service.g.ork.i(13184, new Object[] { Integer.valueOf(1), parame.mFx });
                GMTrace.o(9829166874624L, 73233);
                return;
              }
              com.tencent.mm.wallet_core.ui.e.EQ(12);
              com.tencent.mm.pluginsdk.wallet.g.T(LuckyMoneyDetailUI.this.vKB.vKW, 1);
              com.tencent.mm.plugin.report.service.g.ork.i(13184, new Object[] { Integer.valueOf(0), "" });
              w.e("MicroMsg.LuckyMoneyDetailUI", "detail.changeUrl is empty");
              GMTrace.o(9829166874624L, 73233);
            }
          });
          if (bg.nm(parame.mIr)) {
            break label1666;
          }
          this.jXT.setText(parame.mIr);
        }
        if (parame != null)
        {
          localObject1 = parame.mIu;
          if ((localObject1 != null) && (((List)localObject1).size() > 0))
          {
            localObject2 = this.Ks.findViewById(a.f.syj);
            View localView1 = this.Ks.findViewById(a.f.syk);
            View localView2 = this.Ks.findViewById(a.f.syl);
            ViewGroup localViewGroup1 = (ViewGroup)this.Ks.findViewById(a.f.syg);
            ViewGroup localViewGroup2 = (ViewGroup)this.Ks.findViewById(a.f.syh);
            ViewGroup localViewGroup3 = (ViewGroup)this.Ks.findViewById(a.f.syi);
            View localView3 = this.Ks.findViewById(a.f.sxY);
            View localView4 = this.Ks.findViewById(a.f.sxZ);
            g.c localc = new g.c();
            localc.textColor = getResources().getColor(a.c.smo);
            if (((List)localObject1).size() > 0)
            {
              g.a(this, localViewGroup1, (ag)((List)localObject1).get(0), localc);
              ((View)localObject2).setVisibility(0);
            }
            if (((List)localObject1).size() > 1)
            {
              g.a(this, localViewGroup2, (ag)((List)localObject1).get(1), localc);
              localView1.setVisibility(0);
            }
            if (((List)localObject1).size() > 2)
            {
              g.a(this, localViewGroup3, (ag)((List)localObject1).get(2), localc);
              localView2.setVisibility(0);
            }
            if ((((View)localObject2).getVisibility() == 0) && ((localView1.getVisibility() == 0) || (localView2.getVisibility() == 0))) {
              localView3.setVisibility(0);
            }
            if ((localView1.getVisibility() == 0) && (localView2.getVisibility() == 0)) {
              localView4.setVisibility(0);
            }
            if ((((View)localObject2).getVisibility() == 0) || (localView1.getVisibility() == 0) || (localView2.getVisibility() == 0))
            {
              this.mNf.requestLayout();
              this.mNf.setVisibility(0);
            }
          }
          localObject1 = (ViewGroup)this.koo.findViewById(a.f.sya);
          localObject2 = new g.c();
          ((g.c)localObject2).textColor = getResources().getColor(a.c.smo);
          ((g.c)localObject2).textSize = getResources().getDimensionPixelSize(a.d.aQP);
          g.a(this, (ViewGroup)localObject1, parame.mIv, (g.c)localObject2);
        }
        com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(qa(parame.mIy)), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
      }
      if (parame != null)
      {
        if (((parame.eYn != 3) && (parame.eYn != 2)) || (parame.mIp != 1) || (this.mNh) || (parame.mIs != 1)) {
          break label1677;
        }
        i = 1;
        if ((parame.mIt == null) || (parame.mIt.fPf != 1) || (bg.nm(parame.mIt.mHM))) {
          break label1682;
        }
        j = 1;
        label1142:
        localObject1 = (TextView)this.koo.findViewById(a.f.syp);
        if ((i == 0) && (j == 0)) {
          break label1687;
        }
        ((TextView)localObject1).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(9809571086336L, 73087);
            com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(LuckyMoneyDetailUI.qc(parame.mIy)), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(3) });
            com.tencent.mm.plugin.luckymoney.b.n.a(LuckyMoneyDetailUI.this, 1, false);
            GMTrace.o(9809571086336L, 73087);
          }
        });
        if (j != 0)
        {
          this.mNk = parame.mIt.mHM;
          ((TextView)localObject1).setText(parame.mIt.mHN);
        }
        com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(qa(parame.mIy)), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2) });
        ((TextView)localObject1).setVisibility(0);
      }
    }
    for (;;)
    {
      this.mIy = parame.mIy;
      ((TextView)this.koo.findViewById(a.f.syn)).setVisibility(8);
      if (!this.mNq)
      {
        this.mMY.addFooterView(this.koo);
        this.mNq = true;
      }
      localObject1 = parame.mIz;
      if (localObject1 == null) {
        break label1747;
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
      label1419:
      i = 0;
      break label119;
      label1424:
      this.jXT.setVisibility(0);
      this.mNo.mQt = this.mNj;
      break label156;
      label1446:
      com.tencent.mm.plugin.luckymoney.b.n.a(this.mMg, parame.mIh, parame.mIB);
      break label279;
      label1464:
      com.tencent.mm.plugin.luckymoney.b.n.a(this.mMg, parame.mIh, parame.mIB);
      break label279;
      label1482:
      if (parame.mIb == 2)
      {
        if (!s.fC(parame.mIB))
        {
          localObject1 = new com.tencent.mm.ac.h();
          ((com.tencent.mm.ac.h)localObject1).username = parame.mIB;
          com.tencent.mm.ac.n.Di().a((com.tencent.mm.ac.h)localObject1);
        }
        this.mNU.setVisibility(0);
        this.mNU.setImageResource(a.e.sol);
        break label331;
      }
      this.mNU.setVisibility(8);
      break label331;
      label1560:
      w.i("MicroMsg.LuckyMoneyDetailUI", "hy: no bg. set bg area to gone");
      this.mOa.setVisibility(8);
      break label428;
      label1581:
      this.mNo.mQu = false;
      break label479;
      label1592:
      this.mNa.setVisibility(8);
      break label487;
      label1604:
      this.mNe.setVisibility(8);
      break label555;
      label1616:
      w.e("MicroMsg.LuckyMoneyDetailUI", "detail.jumpChange is false");
      this.jZU.setTextColor(getResources().getColor(a.c.sms));
      break label571;
      label1645:
      w.e("MicroMsg.LuckyMoneyDetailUI", "detail.changeWording is empty");
      this.mNd.setVisibility(8);
      break label571;
      label1666:
      this.jXT.setText(null);
      break label592;
      label1677:
      i = 0;
      break label1109;
      label1682:
      j = 0;
      break label1142;
      label1687:
      ((TextView)localObject1).setVisibility(8);
    }
    this.vq += ((List)localObject1).size();
    this.knj = false;
    if (this.mNY.getVisibility() != 0)
    {
      this.jXT.setVisibility(0);
      this.mNo.aS(this.mNm);
    }
    label1747:
    if ((parame.mIb == 2) && (!bg.nm(parame.mIe)))
    {
      this.mFg = new SoundPool(2, 3, 0);
      this.mOb = new int[2];
    }
    try
    {
      this.mOb[0] = this.mFg.load(getResources().getAssets().openFd("most_lucky.m4a"), 0);
      this.mOb[1] = this.mFg.load(getResources().getAssets().openFd("whistle.m4a"), 0);
      this.mFg.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener()
      {
        public final void onLoadComplete(SoundPool paramAnonymousSoundPool, int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(20956219179008L, 156136);
          if (paramAnonymousInt2 == 0)
          {
            if (paramAnonymousInt1 == LuckyMoneyDetailUI.s(LuckyMoneyDetailUI.this)[0])
            {
              paramAnonymousSoundPool.play(paramAnonymousInt1, 1.0F, 1.0F, 0, 0, 1.0F);
              GMTrace.o(20956219179008L, 156136);
              return;
            }
            if ((paramAnonymousInt1 == LuckyMoneyDetailUI.s(LuckyMoneyDetailUI.this)[1]) && (parame.eYB >= 19000L)) {
              paramAnonymousSoundPool.play(paramAnonymousInt1, 1.0F, 1.0F, 0, 0, 1.0F);
            }
          }
          GMTrace.o(20956219179008L, 156136);
        }
      });
      this.Ks.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(9801786458112L, 73029);
          Object localObject = LuckyMoneyDetailUI.t(LuckyMoneyDetailUI.this);
          com.tencent.mm.plugin.luckymoney.particles.b localb = LuckyMoneyDetailUI.u(LuckyMoneyDetailUI.this);
          com.tencent.mm.plugin.luckymoney.particles.a locala = new com.tencent.mm.plugin.luckymoney.particles.a((ViewGroup)localObject);
          localObject = new c(((ViewGroup)localObject).getContext(), localb, new com.tencent.mm.plugin.luckymoney.particles.d(-100, ((ViewGroup)localObject).getHeight() / 2), (ViewGroup)localObject).w(600.0F, 150.0F).x(-1000.0F, 250.0F).ad(-200.0F).ae(1500.0F);
          ((c)localObject).mKT = 600.0F;
          ((c)localObject).mKU = 300.0F;
          localObject = ((c)localObject).aMk();
          ((c)localObject).mKw = com.tencent.mm.plugin.luckymoney.particles.e.aMo();
          locala.mKk = ((c)localObject).aMl().aMm();
          locala.x(100, 400L);
          localObject = LuckyMoneyDetailUI.t(LuckyMoneyDetailUI.this);
          localb = LuckyMoneyDetailUI.u(LuckyMoneyDetailUI.this);
          locala = new com.tencent.mm.plugin.luckymoney.particles.a((ViewGroup)localObject);
          localObject = new c(((ViewGroup)localObject).getContext(), localb, new com.tencent.mm.plugin.luckymoney.particles.d(((ViewGroup)localObject).getWidth() + 100, ((ViewGroup)localObject).getHeight() / 2), (ViewGroup)localObject).w(-600.0F, 150.0F).x(-1000.0F, 250.0F).ad(200.0F).ae(1500.0F);
          ((c)localObject).mKT = 600.0F;
          ((c)localObject).mKU = 300.0F;
          localObject = ((c)localObject).aMk();
          ((c)localObject).mKw = com.tencent.mm.plugin.luckymoney.particles.e.aMo();
          locala.mKk = ((c)localObject).aMl().aMm();
          locala.x(100, 400L);
          GMTrace.o(9801786458112L, 73029);
        }
      }, 300L);
      localObject1 = new x();
      ((x)localObject1).field_mNativeUrl = this.mMp;
      ((x)localObject1).field_hbType = parame.mIb;
      ((x)localObject1).field_receiveAmount = parame.eYB;
      ((x)localObject1).field_receiveTime = System.currentTimeMillis();
      ((x)localObject1).field_hbStatus = parame.eYn;
      ((x)localObject1).field_receiveStatus = parame.eYo;
      if (((x)localObject1).field_receiveAmount > 0L) {
        com.tencent.mm.plugin.wallet_core.model.n.byu().a((x)localObject1);
      }
      GMTrace.o(9861781782528L, 73476);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.e("MicroMsg.LuckyMoneyDetailUI", "load lucky money voice fail " + localIOException.getMessage());
      }
    }
  }
  
  private void aMC()
  {
    GMTrace.i(9861647564800L, 73475);
    this.knj = true;
    if ((this.vq > 0) && (this.mNm.size() > 0) && (this.mNm.get(this.mNm.size() - 1) != null))
    {
      l(new u(this.mMo, this.vq, this.mMp, bg.getLong(((m)this.mNm.get(this.mNm.size() - 1)).mIK, 0L), "v1.0", this.mNp));
      GMTrace.o(9861647564800L, 73475);
      return;
    }
    this.mNp = "";
    l(new u(this.mMo, 11, this.vq, this.mMp, "v1.0", this.mNp));
    GMTrace.o(9861647564800L, 73475);
  }
  
  private void aMD()
  {
    GMTrace.i(9861916000256L, 73477);
    if ((this.mNc != null) && (this.mNc.getVisibility() != 8)) {
      this.mNc.setVisibility(8);
    }
    GMTrace.o(9861916000256L, 73477);
  }
  
  private static int qa(int paramInt)
  {
    GMTrace.i(9862184435712L, 73479);
    if (paramInt == 2)
    {
      GMTrace.o(9862184435712L, 73479);
      return 13;
    }
    GMTrace.o(9862184435712L, 73479);
    return 7;
  }
  
  protected final void MP()
  {
    GMTrace.i(9860842258432L, 73469);
    oM(a.i.sUf);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(20955548090368L, 156131);
        LuckyMoneyDetailUI.this.finish();
        GMTrace.o(20955548090368L, 156131);
        return true;
      }
    });
    this.mMY = ((ListView)findViewById(a.f.syo));
    this.mNo = new i(this.vKB.vKW);
    this.Ks = LayoutInflater.from(this).inflate(a.g.sMM, null);
    this.mMY.addHeaderView(this.Ks);
    this.mMY.setAdapter(this.mNo);
    this.Ks.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20956353396736L, 156137);
        LuckyMoneyDetailUI.n(LuckyMoneyDetailUI.this);
        GMTrace.o(20956353396736L, 156137);
      }
    });
    this.mMY.setOnScrollListener(this.mNr);
    this.mMY.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(20955950743552L, 156134);
        LuckyMoneyDetailUI.n(LuckyMoneyDetailUI.this);
        GMTrace.o(20955950743552L, 156134);
      }
    });
    this.koo = LayoutInflater.from(this).inflate(a.g.sML, null);
    this.mMg = ((ImageView)this.Ks.findViewById(a.f.syq));
    this.mMZ = ((TextView)this.Ks.findViewById(a.f.syt));
    this.mNU = ((ImageView)this.Ks.findViewById(a.f.syb));
    this.mMi = ((TextView)this.Ks.findViewById(a.f.syv));
    this.mNa = this.Ks.findViewById(a.f.sxU);
    this.mNb = ((TextView)this.Ks.findViewById(a.f.sxT));
    this.mNd = this.Ks.findViewById(a.f.syd);
    this.jZU = ((TextView)this.Ks.findViewById(a.f.syr));
    this.mNe = ((ImageView)this.Ks.findViewById(a.f.syc));
    this.jXT = ((TextView)this.Ks.findViewById(a.f.sxX));
    this.mNV = ((ImageView)this.Ks.findViewById(a.f.sys));
    this.mNf = this.Ks.findViewById(a.f.sym);
    this.mNW = this.Ks.findViewById(a.f.sxW);
    this.mNX = ((ImageView)this.Ks.findViewById(a.f.sxV));
    this.mNY = ((TextView)this.Ks.findViewById(a.f.sye));
    this.mNZ = findViewById(a.f.syf);
    this.mOa = ((RelativeLayout)this.Ks.findViewById(a.f.sxW));
    this.kIs = ((ImageView)this.Ks.findViewById(a.f.sxV));
    this.mNc = ((LuckyMoneyWishFooter)findViewById(a.f.syu));
    this.mOc = ((ViewGroup)findViewById(a.f.syz));
    this.mNc.a(new MMEditText.a()
    {
      public final void aME()
      {
        GMTrace.i(20958903533568L, 156156);
        if (LuckyMoneyDetailUI.o(LuckyMoneyDetailUI.this).getVisibility() == 0)
        {
          LuckyMoneyDetailUI.o(LuckyMoneyDetailUI.this).setVisibility(8);
          GMTrace.o(20958903533568L, 156156);
          return;
        }
        LuckyMoneyDetailUI.this.vKB.vKW.finish();
        GMTrace.o(20958903533568L, 156156);
      }
    });
    this.mNc.a(new LuckyMoneyWishFooter.a()
    {
      public final void BF(String paramAnonymousString)
      {
        GMTrace.i(20955413872640L, 156130);
        if ((!bg.nm(paramAnonymousString)) && (!bg.nm(LuckyMoneyDetailUI.p(LuckyMoneyDetailUI.this))))
        {
          paramAnonymousString = new aa(LuckyMoneyDetailUI.q(LuckyMoneyDetailUI.this), paramAnonymousString, LuckyMoneyDetailUI.p(LuckyMoneyDetailUI.this), "v1.0");
          LuckyMoneyDetailUI.this.l(paramAnonymousString);
          LuckyMoneyDetailUI.n(LuckyMoneyDetailUI.this);
        }
        GMTrace.o(20955413872640L, 156130);
      }
    });
    this.mNc.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20956621832192L, 156139);
        j.g(LuckyMoneyDetailUI.this);
        GMTrace.o(20956621832192L, 156139);
      }
    });
    this.mNc.vJe = new KeyboardLinearLayout.a()
    {
      public final void oD(int paramAnonymousInt)
      {
        GMTrace.i(20958635098112L, 156154);
        if ((paramAnonymousInt == -2) && (LuckyMoneyDetailUI.o(LuckyMoneyDetailUI.this).mQQ)) {
          LuckyMoneyDetailUI.o(LuckyMoneyDetailUI.this).mQQ = false;
        }
        GMTrace.o(20958635098112L, 156154);
      }
    };
    this.mNo.mQv = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9808094691328L, 73076);
        LuckyMoneyDetailUI.o(LuckyMoneyDetailUI.this).setVisibility(0);
        GMTrace.o(9808094691328L, 73076);
      }
    };
    this.mNc.aMS();
    this.mNY.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20958769315840L, 156155);
        LuckyMoneyDetailUI.o(LuckyMoneyDetailUI.this).setVisibility(0);
        GMTrace.o(20958769315840L, 156155);
      }
    });
    GMTrace.o(9860842258432L, 73469);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(9861110693888L, 73471);
    if ((paramk instanceof u))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (u)paramk;
        paramk = paramString.mJj;
        this.mNp = paramString.mJv;
        a(paramk);
        GMTrace.o(9861110693888L, 73471);
        return true;
      }
      com.tencent.mm.ui.base.h.bm(this, paramString);
      GMTrace.o(9861110693888L, 73471);
      return true;
    }
    if ((paramk instanceof aa))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        com.tencent.mm.ui.base.h.bm(this, getString(a.i.dCJ));
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
            if (this.mNY.getVisibility() == 0)
            {
              this.mNY.setVisibility(8);
              this.jXT.setVisibility(0);
              this.mNZ.setVisibility(8);
              this.mNo.aS(this.mNm);
            }
            GMTrace.o(9861110693888L, 73471);
            return true;
          }
          paramInt1 += 1;
        }
      }
      com.tencent.mm.ui.base.h.bm(this, paramString);
      GMTrace.o(9861110693888L, 73471);
      return true;
    }
    if ((paramk instanceof com.tencent.mm.plugin.luckymoney.b.af))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        com.tencent.mm.ui.snackbar.a.e(this, getString(a.i.dCJ));
        GMTrace.o(9861110693888L, 73471);
        return true;
      }
      com.tencent.mm.ui.base.h.bm(this, paramString);
      GMTrace.o(9861110693888L, 73471);
      return true;
    }
    GMTrace.o(9861110693888L, 73471);
    return false;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(9860976476160L, 73470);
    if ((paramKeyEvent.getKeyCode() == 4) && (this.mNc.getVisibility() == 0))
    {
      this.mNc.setVisibility(8);
      GMTrace.o(9860976476160L, 73470);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(9860976476160L, 73470);
    return bool;
  }
  
  public void finish()
  {
    GMTrace.i(9861379129344L, 73473);
    if (getIntent().hasExtra("key_realname_guide_helper"))
    {
      RealnameGuideHelper localRealnameGuideHelper = (RealnameGuideHelper)getIntent().getParcelableExtra("key_realname_guide_helper");
      Bundle localBundle = new Bundle();
      localBundle.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyDetailUI");
      localBundle.putString("realname_verify_process_jump_plugin", "luckymoney");
      boolean bool = localRealnameGuideHelper.b(this, localBundle, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(20955816525824L, 156133);
          w.i("MicroMsg.LuckyMoneyDetailUI", "RealnameGuideHelper dialog click cancel");
          LuckyMoneyDetailUI.r(LuckyMoneyDetailUI.this);
          GMTrace.o(20955816525824L, 156133);
        }
      });
      getIntent().removeExtra("key_realname_guide_helper");
      if (!bool) {
        super.finish();
      }
      GMTrace.o(9861379129344L, 73473);
      return;
    }
    super.finish();
    GMTrace.o(9861379129344L, 73473);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9861513347072L, 73474);
    int i = a.g.sMN;
    GMTrace.o(9861513347072L, 73474);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(9861244911616L, 73472);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      GMTrace.o(9861244911616L, 73472);
      return;
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        String str = paramIntent.getStringExtra("Select_Conv_User");
        if (!bg.nm(str)) {
          if ((this.mNk != null) && (this.mNk.startsWith("wxpay://c2cbizmessagehandler/hongbao/festivalhongbao"))) {
            w.i("MicroMsg.LuckyMoneyDetailUI", "Not expected branch since 2015 fesitval");
          } else {
            l(new com.tencent.mm.plugin.luckymoney.b.af(str.replaceAll(",", "|"), this.mMo, "v1.0"));
          }
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9860439605248L, 73466);
    super.onCreate(paramBundle);
    MP();
    this.mMo = getIntent().getStringExtra("key_sendid");
    this.mMp = getIntent().getStringExtra("key_native_url");
    this.mNi = getIntent().getIntExtra("key_jump_from", 2);
    w.i("MicroMsg.LuckyMoneyDetailUI", "sendid=" + bg.nl(this.mMo) + ", nativeurl=" + bg.nl(this.mMp) + ", jumpFrom=" + this.mNi);
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
            a(0, getString(a.i.sUd), new MenuItem.OnMenuItemClickListener()
            {
              public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
              {
                GMTrace.i(9858157903872L, 73449);
                com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(LuckyMoneyDetailUI.qc(LuckyMoneyDetailUI.m(LuckyMoneyDetailUI.this))), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(4) });
                paramAnonymousMenuItem = new Intent();
                paramAnonymousMenuItem.setClass(LuckyMoneyDetailUI.this.vKB.vKW, LuckyMoneyMyRecordUI.class);
                paramAnonymousMenuItem.putExtra("key_type", 2);
                LuckyMoneyDetailUI.this.startActivity(paramAnonymousMenuItem);
                GMTrace.o(9858157903872L, 73449);
                return true;
              }
            });
            GMTrace.o(9860439605248L, 73466);
            return;
          }
        }
      }
      catch (Exception paramBundle)
      {
        w.w("MicroMsg.LuckyMoneyDetailUI", "Parse LuckyMoneyDetail fail!" + paramBundle.getLocalizedMessage());
      }
      if ((bg.nm(this.mMo)) && (!bg.nm(this.mMp))) {
        paramBundle = Uri.parse(this.mMp);
      }
      try
      {
        this.mMo = paramBundle.getQueryParameter("sendid");
        if (!bg.nm(this.mMo))
        {
          aMC();
          continue;
        }
        w.w("MicroMsg.LuckyMoneyDetailUI", "sendid null or nil, finish");
      }
      catch (Exception paramBundle)
      {
        for (;;) {}
      }
    }
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    GMTrace.i(20956756049920L, 156140);
    boolean bool = super.onCreatePanelMenu(paramInt, paramMenu);
    paramMenu = (TextView)findViewById(a.f.bcH);
    if (paramMenu != null) {
      paramMenu.setTextColor(getResources().getColor(a.c.smn));
    }
    GMTrace.o(20956756049920L, 156140);
    return bool;
  }
  
  protected void onDestroy()
  {
    GMTrace.i(9862050217984L, 73478);
    super.onDestroy();
    if (this.mNc != null) {
      this.mNc.aMT();
    }
    if (this.mFg != null)
    {
      this.mFg.release();
      int i = 0;
      while (i < this.mOb.length)
      {
        this.mFg.unload(this.mOb[i]);
        i += 1;
      }
    }
    GMTrace.o(9862050217984L, 73478);
  }
  
  protected void onPause()
  {
    GMTrace.i(9860708040704L, 73468);
    super.onPause();
    com.tencent.mm.modelstat.d.e("LuckyMoneyDetailUI", this.jro, bg.Pu());
    GMTrace.o(9860708040704L, 73468);
  }
  
  protected void onResume()
  {
    GMTrace.i(9860573822976L, 73467);
    super.onResume();
    this.jro = bg.Pu();
    GMTrace.o(9860573822976L, 73467);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\ui\LuckyMoneyDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */