package com.tencent.mm.plugin.walletlock.gesture.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.ad.u;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.plugin.walletlock.a.a;
import com.tencent.mm.plugin.walletlock.a.b;
import com.tencent.mm.plugin.walletlock.a.d;
import com.tencent.mm.plugin.walletlock.a.e;
import com.tencent.mm.plugin.walletlock.a.g;
import com.tencent.mm.plugin.walletlock.gesture.a.e;
import com.tencent.mm.plugin.walletlock.gesture.a.f;
import com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView;
import com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView.a;
import com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView.b;
import com.tencent.mm.protocal.c.arb;
import com.tencent.mm.protocal.c.arc;
import com.tencent.mm.protocal.c.asc;
import com.tencent.mm.protocal.c.asd;
import com.tencent.mm.protocal.c.ayd;
import com.tencent.mm.protocal.c.aye;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i.a;
import java.util.List;

@com.tencent.mm.ui.base.a(19)
public class GestureGuardLogicUI
  extends MMActivity
  implements View.OnClickListener, PatternLockView.a
{
  private int lGn;
  private ae mHandler;
  private int mStatus;
  private String mToken;
  private int rxI;
  private int rxJ;
  private a[] rxK;
  private Animation rxL;
  private List<f> rxM;
  private List<f> rxN;
  private boolean rxO;
  private int rxP;
  private k rxQ;
  private k rxR;
  private String rxS;
  private ViewFlipper rxT;
  private Dialog rxU;
  private boolean rxV;
  private boolean rxW;
  private String rxX;
  private int rxz;
  
  public GestureGuardLogicUI()
  {
    GMTrace.i(20228624875520L, 150715);
    this.rxI = 0;
    this.rxJ = 0;
    this.lGn = 0;
    this.rxK = null;
    this.rxL = null;
    this.rxM = null;
    this.rxN = null;
    this.rxO = false;
    this.rxP = 0;
    this.rxQ = null;
    this.rxR = null;
    this.mToken = null;
    this.rxS = null;
    this.rxT = null;
    this.mHandler = new ae(Looper.getMainLooper());
    this.rxU = null;
    this.rxV = true;
    this.rxW = false;
    this.rxz = -1;
    GMTrace.o(20228624875520L, 150715);
  }
  
  private void N(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(20231175012352L, 150734);
    int i = paramInt - this.lGn;
    if (i == 0)
    {
      GMTrace.o(20231175012352L, 150734);
      return;
    }
    this.lGn = paramInt;
    if (paramBoolean) {
      if (i > 0)
      {
        this.rxT.setInAnimation(this, a.a.aMb);
        this.rxT.setOutAnimation(this, a.a.aMa);
      }
    }
    for (;;)
    {
      paramInt = i;
      if (i <= 0) {
        break label143;
      }
      paramInt = 0;
      while (paramInt < i)
      {
        this.rxT.showNext();
        paramInt += 1;
      }
      this.rxT.setInAnimation(this, a.a.gci);
      this.rxT.setOutAnimation(this, a.a.gcj);
      continue;
      this.rxT.setInAnimation(null);
      this.rxT.setOutAnimation(null);
    }
    GMTrace.o(20231175012352L, 150734);
    return;
    label143:
    while (paramInt < 0)
    {
      this.rxT.showPrevious();
      paramInt += 1;
    }
    GMTrace.o(20231175012352L, 150734);
  }
  
  private void a(String paramString, final a parama)
  {
    GMTrace.i(20231309230080L, 150735);
    TextView localTextView = this.rxK[this.lGn].rye;
    localTextView.getText().toString();
    localTextView.setText(paramString);
    localTextView.setTextColor(this.rxJ);
    localTextView.startAnimation(this.rxL);
    this.rxL.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(20220034940928L, 150651);
        GestureGuardLogicUI.q(GestureGuardLogicUI.this).setAnimationListener(null);
        if (parama != null) {
          parama.onDone();
        }
        GMTrace.o(20220034940928L, 150651);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(20219900723200L, 150650);
        GMTrace.o(20219900723200L, 150650);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(20219766505472L, 150649);
        GMTrace.o(20219766505472L, 150649);
      }
    });
    GMTrace.o(20231309230080L, 150735);
  }
  
  private void a(String paramString, List<f> paramList, final u.a parama)
  {
    GMTrace.i(20230369705984L, 150728);
    b(new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(20221108682752L, 150659);
        GestureGuardLogicUI.l(GestureGuardLogicUI.this)[GestureGuardLogicUI.m(GestureGuardLogicUI.this)].ryg.bAX();
        if ((GestureGuardLogicUI.n(GestureGuardLogicUI.this) != null) && (!GestureGuardLogicUI.n(GestureGuardLogicUI.this).gtZ)) {
          com.tencent.mm.kernel.h.wS().c(GestureGuardLogicUI.n(GestureGuardLogicUI.this));
        }
        GMTrace.o(20221108682752L, 150659);
      }
    });
    if (paramString == null)
    {
      bwR();
      parama.a(3, -6, getString(a.g.rwl), null, null);
      GMTrace.o(20230369705984L, 150728);
      return;
    }
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ayd();
    ((b.a)localObject).gtG = new aye();
    ((b.a)localObject).gtE = 688;
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/registernewpatternlock";
    localObject = ((b.a)localObject).DA();
    ayd localayd = (ayd)((com.tencent.mm.ad.b)localObject).gtC.gtK;
    localayd.uMC = new azp().be(paramString.getBytes());
    localayd.uMD = new azp().be(e.bP(paramList));
    u.a((com.tencent.mm.ad.b)localObject, new u.a()
    {
      public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
      {
        GMTrace.i(20222585077760L, 150670);
        w.i("MicroMsg.GestureGuardLogicUI", String.format("Scene doSwitchOn, errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString }));
        GestureGuardLogicUI.o(GestureGuardLogicUI.this);
        if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
        {
          com.tencent.mm.plugin.walletlock.gesture.a.d.a(((aye)paramAnonymousb.gtD.gtK).uHp);
          GestureGuardLogicUI.bAU();
          ((com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.walletlock.a.b.class)).xc(1);
        }
        com.tencent.mm.plugin.walletlock.b.i.rze.bBi();
        if (parama != null)
        {
          paramAnonymousInt1 = parama.a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString, paramAnonymousb, paramAnonymousk);
          GMTrace.o(20222585077760L, 150670);
          return paramAnonymousInt1;
        }
        GMTrace.o(20222585077760L, 150670);
        return 0;
      }
    }, false);
    GMTrace.o(20230369705984L, 150728);
  }
  
  private void b(DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(20231443447808L, 150736);
    if (this.rxU == null)
    {
      this.rxU = com.tencent.mm.ui.base.h.a(this, getString(a.g.rwo), false, paramOnCancelListener);
      GMTrace.o(20231443447808L, 150736);
      return;
    }
    this.rxU.show();
    GMTrace.o(20231443447808L, 150736);
  }
  
  private boolean bAQ()
  {
    GMTrace.i(20229967052800L, 150725);
    if ((this.mStatus != 20) && (this.mStatus != 0) && (this.mStatus != 2) && (this.mStatus != 1))
    {
      String str;
      if (this.rxV)
      {
        str = getIntent().getStringExtra("next_action");
        if ((!"next_action.modify_pattern".equals(str)) && ("next_action.switch_on_pattern".equals(str)))
        {
          str = getString(a.g.rwh);
          new i.a(this).lz(false).VA(str).BQ(a.g.rwe).a(new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(20237349027840L, 150780);
              paramAnonymousDialogInterface.dismiss();
              GestureGuardLogicUI.r(GestureGuardLogicUI.this);
              GestureGuardLogicUI.a(GestureGuardLogicUI.this, 0, 4, "user cancel when setting gesture");
              GMTrace.o(20237349027840L, 150780);
            }
          }).BR(a.g.rwc).b(new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(20223524601856L, 150677);
              paramAnonymousDialogInterface.dismiss();
              GMTrace.o(20223524601856L, 150677);
            }
          }).aax().show();
        }
      }
      for (;;)
      {
        GMTrace.o(20229967052800L, 150725);
        return true;
        str = getString(a.g.rwg);
        break;
        new i.a(this).lz(true).BO(a.g.rwi).BQ(a.g.rwd).a(new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(20236812156928L, 150776);
            paramAnonymousDialogInterface.dismiss();
            GMTrace.o(20236812156928L, 150776);
          }
        }).aax().show();
      }
    }
    bAT();
    GMTrace.o(20229967052800L, 150725);
    return false;
  }
  
  private void bAR()
  {
    GMTrace.i(20230101270528L, 150726);
    final Object localObject1 = this.rxK[this.lGn];
    switch (this.mStatus)
    {
    }
    for (;;)
    {
      GMTrace.o(20230101270528L, 150726);
      return;
      sq(getString(a.g.rwv));
      this.rxO = true;
      ((a)localObject1).ryg.ryw = false;
      ((a)localObject1).ryg.ryI = null;
      long l = Math.ceil((600L - com.tencent.mm.plugin.walletlock.gesture.a.d.bAI().rxH / 1000L) / 60.0D);
      ((a)localObject1).rye.setText(String.format(getString(a.g.rwp), new Object[] { Long.valueOf(l) }));
      ((a)localObject1).rye.setTextColor(getResources().getColor(a.b.rvM));
      GMTrace.o(20230101270528L, 150726);
      return;
      final Object localObject2 = getIntent().getStringExtra("next_action");
      if ((!"next_action.modify_pattern".equals(localObject2)) && ("next_action.switch_on_pattern".equals(localObject2))) {
        sq(getString(a.g.rwx));
      }
      for (;;)
      {
        this.rxO = false;
        ((a)localObject1).ryg.ryw = true;
        ((a)localObject1).ryg.ryI = this;
        ((a)localObject1).rye.setText(getString(a.g.rws));
        ((a)localObject1).rye.setTextColor(getResources().getColor(a.b.rvL));
        if (((a)localObject1).ryh.getVisibility() == 8) {
          break;
        }
        ((a)localObject1).ryh.setVisibility(8);
        GMTrace.o(20230101270528L, 150726);
        return;
        sq(getString(a.g.rww));
      }
      ((a)localObject1).rye.setText(getResources().getString(a.g.rwq));
      ((a)localObject1).rye.setTextColor(this.rxI);
      ((a)localObject1).ryg.bAX();
      ((a)localObject1).ryg.ryw = true;
      if (((a)localObject1).ryh.getVisibility() != 8)
      {
        ((a)localObject1).ryh.setVisibility(8);
        GMTrace.o(20230101270528L, 150726);
        return;
        localObject1 = getIntent().getStringExtra("next_action");
        final Object localObject3;
        Object localObject4;
        if ("next_action.modify_pattern".equals(localObject1))
        {
          if (this.rxW)
          {
            this.rxW = false;
            a(this.mToken, this.rxM, new u.a()
            {
              public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
              {
                GMTrace.i(20221913989120L, 150665);
                if (paramAnonymousInt2 == 0)
                {
                  Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(a.g.rwA), 0).show();
                  com.tencent.mm.plugin.report.service.g.ork.i(11474, new Object[0]);
                }
                for (;;)
                {
                  GestureGuardLogicUI.b(GestureGuardLogicUI.this);
                  GestureGuardLogicUI.d(GestureGuardLogicUI.this);
                  GestureGuardLogicUI.this.finish();
                  GMTrace.o(20221913989120L, 150665);
                  return 0;
                  Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(a.g.rwj), 0).show();
                }
              }
            });
            GMTrace.o(20230101270528L, 150726);
            return;
          }
          localObject1 = this.rxN;
          localObject2 = this.rxM;
          localObject3 = new u.a()
          {
            public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
            {
              GMTrace.i(20221645553664L, 150663);
              if (paramAnonymousInt2 == 0) {
                Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(a.g.rwA), 0).show();
              }
              for (;;)
              {
                GestureGuardLogicUI.a(GestureGuardLogicUI.this, null);
                GestureGuardLogicUI.d(GestureGuardLogicUI.this);
                GestureGuardLogicUI.this.finish();
                GMTrace.o(20221645553664L, 150663);
                return 0;
                Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(a.g.rwj), 0).show();
              }
            }
          };
          localObject4 = new b.a();
          b(new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymousDialogInterface)
            {
              GMTrace.i(20220840247296L, 150657);
              GestureGuardLogicUI.l(GestureGuardLogicUI.this)[GestureGuardLogicUI.m(GestureGuardLogicUI.this)].ryg.bAX();
              if ((GestureGuardLogicUI.p(GestureGuardLogicUI.this) != null) && (!GestureGuardLogicUI.p(GestureGuardLogicUI.this).gtZ)) {
                com.tencent.mm.kernel.h.wS().c(GestureGuardLogicUI.p(GestureGuardLogicUI.this));
              }
              GMTrace.o(20220840247296L, 150657);
            }
          });
          ((b.a)localObject4).gtF = new arb();
          ((b.a)localObject4).gtG = new arc();
          ((b.a)localObject4).gtE = 689;
          ((b.a)localObject4).uri = "/cgi-bin/micromsg-bin/oppatternlock";
          localObject4 = ((b.a)localObject4).DA();
          arb localarb = (arb)((com.tencent.mm.ad.b)localObject4).gtC.gtK;
          localarb.nJ = 1;
          localarb.uHn = new azp().be(e.bP((List)localObject1));
          localarb.uHo = new azp().be(e.bP((List)localObject2));
          u.a((com.tencent.mm.ad.b)localObject4, new u.a()
          {
            public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
            {
              GMTrace.i(20235738415104L, 150768);
              w.i("MicroMsg.GestureGuardLogicUI", String.format("Scene doModify, errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString }));
              GestureGuardLogicUI.o(GestureGuardLogicUI.this);
              if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
              {
                com.tencent.mm.plugin.walletlock.gesture.a.d.a(((arc)paramAnonymousb.gtD.gtK).uHp);
                GestureGuardLogicUI.bAU();
              }
              com.tencent.mm.plugin.walletlock.b.i.rze.bBi();
              if (localObject3 != null)
              {
                paramAnonymousInt1 = localObject3.a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString, paramAnonymousb, paramAnonymousk);
                GMTrace.o(20235738415104L, 150768);
                return paramAnonymousInt1;
              }
              GMTrace.o(20235738415104L, 150768);
              return 0;
            }
          }, false);
          GMTrace.o(20230101270528L, 150726);
          return;
        }
        if ("next_action.switch_on_pattern".equals(localObject1))
        {
          a(this.mToken, this.rxM, new u.a()
          {
            public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
            {
              GMTrace.i(20221377118208L, 150661);
              GestureGuardLogicUI.b(GestureGuardLogicUI.this);
              GestureGuardLogicUI.d(GestureGuardLogicUI.this);
              if (paramAnonymousInt2 == 0)
              {
                Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(a.g.rwz), 0).show();
                GestureGuardLogicUI.a(GestureGuardLogicUI.this, -1, 0, "open gesture ok");
              }
              for (;;)
              {
                GMTrace.o(20221377118208L, 150661);
                return 0;
                Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(a.g.rwj), 0).show();
                GestureGuardLogicUI.a(GestureGuardLogicUI.this, -1, -1, "open gesture failed");
              }
            }
          });
          GMTrace.o(20230101270528L, 150726);
          return;
        }
        if ("next_action.goto_protected_page".equals(localObject1))
        {
          a(this.mToken, this.rxM, new u.a()
          {
            public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
            {
              GMTrace.i(20237080592384L, 150778);
              if (paramAnonymousInt2 == 0)
              {
                com.tencent.mm.plugin.walletlock.gesture.a.d.ej(SystemClock.elapsedRealtime());
                Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(a.g.rwA), 0).show();
                GestureGuardLogicUI.e(GestureGuardLogicUI.this);
              }
              for (;;)
              {
                GestureGuardLogicUI.b(GestureGuardLogicUI.this);
                GestureGuardLogicUI.d(GestureGuardLogicUI.this);
                GMTrace.o(20237080592384L, 150778);
                return 0;
                Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(a.g.rwj), 0).show();
              }
            }
          });
          GMTrace.o(20230101270528L, 150726);
          return;
          ((a)localObject1).ryg.ryw = false;
          ((a)localObject1).ryg.a(PatternLockView.b.ryL);
          a(getResources().getString(a.g.rwr), new a()
          {
            public final void onDone()
            {
              GMTrace.i(20220303376384L, 150653);
              GestureGuardLogicUI.f(GestureGuardLogicUI.this).postDelayed(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(20222316642304L, 150668);
                  GestureGuardLogicUI.f(GestureGuardLogicUI.this).removeCallbacks(this);
                  GestureGuardLogicUI.25.this.ryc.ryg.bAX();
                  GestureGuardLogicUI.a(GestureGuardLogicUI.this, 16);
                  GestureGuardLogicUI.g(GestureGuardLogicUI.this);
                  GestureGuardLogicUI.h(GestureGuardLogicUI.this);
                  GMTrace.o(20222316642304L, 150668);
                }
              }, 500L);
              GMTrace.o(20220303376384L, 150653);
            }
          });
          GMTrace.o(20230101270528L, 150726);
          return;
          sq(getString(a.g.rwv));
          this.rxO = false;
          ((a)localObject1).ryg.ryw = true;
          ((a)localObject1).ryg.ryI = this;
          if ("next_action.goto_protected_page".equals(getIntent().getStringExtra("next_action"))) {
            if (!bg.nm(this.rxX)) {
              ((a)localObject1).rye.setText(this.rxX);
            }
          }
          for (;;)
          {
            ((a)localObject1).rye.setTextColor(this.rxI);
            if (((a)localObject1).ryh.getVisibility() == 0) {
              break;
            }
            ((a)localObject1).ryh.setVisibility(0);
            GMTrace.o(20230101270528L, 150726);
            return;
            ((a)localObject1).rye.setText(getString(a.g.rwu));
            continue;
            ((a)localObject1).rye.setText(getString(a.g.rwt));
          }
          localObject2 = getIntent().getStringExtra("next_action");
          if ("next_action.modify_pattern".equals(localObject2))
          {
            ((a)localObject1).ryg.bAX();
            N(1, true);
            this.mStatus = 16;
            break;
          }
          if ("next_action.switch_off_pattern".equals(localObject2))
          {
            localObject1 = this.rxN;
            localObject2 = new u.a()
            {
              public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
              {
                GMTrace.i(20238154334208L, 150786);
                if (paramAnonymousInt2 == 0) {
                  Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(a.g.rwy), 0).show();
                }
                for (;;)
                {
                  GestureGuardLogicUI.a(GestureGuardLogicUI.this, null);
                  GestureGuardLogicUI.this.finish();
                  GMTrace.o(20238154334208L, 150786);
                  return 0;
                  Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(a.g.rwj), 0).show();
                }
              }
            };
            b(new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymousDialogInterface)
              {
                GMTrace.i(20234933108736L, 150762);
                GestureGuardLogicUI.l(GestureGuardLogicUI.this)[GestureGuardLogicUI.m(GestureGuardLogicUI.this)].ryg.bAX();
                if ((GestureGuardLogicUI.p(GestureGuardLogicUI.this) != null) && (!GestureGuardLogicUI.p(GestureGuardLogicUI.this).gtZ)) {
                  com.tencent.mm.kernel.h.wS().c(GestureGuardLogicUI.p(GestureGuardLogicUI.this));
                }
                GMTrace.o(20234933108736L, 150762);
              }
            });
            localObject3 = new b.a();
            ((b.a)localObject3).gtF = new arb();
            ((b.a)localObject3).gtG = new arc();
            ((b.a)localObject3).gtE = 689;
            ((b.a)localObject3).uri = "/cgi-bin/micromsg-bin/oppatternlock";
            localObject3 = ((b.a)localObject3).DA();
            localObject4 = (arb)((com.tencent.mm.ad.b)localObject3).gtC.gtK;
            ((arb)localObject4).nJ = 3;
            ((arb)localObject4).uHn = new azp().be(e.bP((List)localObject1));
            u.a((com.tencent.mm.ad.b)localObject3, new u.a()
            {
              public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
              {
                GMTrace.i(20236275286016L, 150772);
                w.i("MicroMsg.GestureGuardLogicUI", String.format("Scene doSwitchOff, errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString }));
                GestureGuardLogicUI.o(GestureGuardLogicUI.this);
                if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
                {
                  com.tencent.mm.plugin.walletlock.gesture.a.d.a(((arc)paramAnonymousb.gtD.gtK).uHp);
                  com.tencent.mm.plugin.walletlock.b.g localg = com.tencent.mm.plugin.walletlock.b.g.rza;
                  com.tencent.mm.plugin.walletlock.b.g.jg(false);
                  GestureGuardLogicUI.i(GestureGuardLogicUI.this);
                  GestureGuardLogicUI.bAU();
                }
                if (localObject2 != null)
                {
                  paramAnonymousInt1 = localObject2.a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString, paramAnonymousb, paramAnonymousk);
                  GMTrace.o(20236275286016L, 150772);
                  return paramAnonymousInt1;
                }
                GMTrace.o(20236275286016L, 150772);
                return 0;
              }
            }, false);
            GMTrace.o(20230101270528L, 150726);
            return;
          }
          if ("next_action.goto_protected_page".equals(localObject2))
          {
            com.tencent.mm.plugin.walletlock.gesture.a.d.ej(SystemClock.elapsedRealtime());
            bAS();
            com.tencent.mm.plugin.walletlock.b.h.R(this.rxz, 1, 0);
            GMTrace.o(20230101270528L, 150726);
            return;
            l = SystemClock.elapsedRealtime();
            com.tencent.mm.plugin.walletlock.gesture.a.d.y(l, 0L);
            com.tencent.mm.plugin.walletlock.gesture.a.d.xe(this.rxP);
            com.tencent.mm.plugin.walletlock.gesture.a.d.bAx();
            if (this.rxP == 5)
            {
              this.rxO = true;
              com.tencent.mm.plugin.walletlock.gesture.a.d.x(l, 0L);
              ((a)localObject1).ryg.bAX();
              ((a)localObject1).ryg.ryw = false;
              this.mStatus = 20;
              bAR();
              localObject1 = new i.a(this);
              ((i.a)localObject1).lz(false).VA(String.format(getString(a.g.rwf), new Object[] { Long.valueOf(10L) }));
              ((i.a)localObject1).BQ(a.g.rwb).a(new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  GMTrace.i(20223256166400L, 150675);
                  paramAnonymousDialogInterface.dismiss();
                  GestureGuardLogicUI.this.onClick(GestureGuardLogicUI.l(GestureGuardLogicUI.this)[GestureGuardLogicUI.m(GestureGuardLogicUI.this)].ryh);
                  GMTrace.o(20223256166400L, 150675);
                }
              });
              ((i.a)localObject1).BR(a.g.rwa).b(new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  GMTrace.i(20236006850560L, 150770);
                  paramAnonymousDialogInterface.dismiss();
                  GestureGuardLogicUI.r(GestureGuardLogicUI.this);
                  GestureGuardLogicUI.this.finish();
                  GMTrace.o(20236006850560L, 150770);
                }
              });
              ((i.a)localObject1).aax().show();
            }
            for (;;)
            {
              localObject1 = getIntent().getStringExtra("next_action");
              w.i("MicroMsg.GestureGuardLogicUI", "alvinluo nextAction: %s", new Object[] { localObject1 });
              if (!"next_action.goto_protected_page".equals(localObject1)) {
                break;
              }
              if (this.rxP != 5) {
                break label1466;
              }
              com.tencent.mm.plugin.walletlock.b.h.R(this.rxz, 1, 2);
              GMTrace.o(20230101270528L, 150726);
              return;
              ((a)localObject1).ryg.ryw = false;
              ((a)localObject1).ryg.a(PatternLockView.b.ryL);
              a(String.format(getResources().getString(a.g.rwm), new Object[] { Integer.valueOf(5 - this.rxP) }), new a()
              {
                public final void onDone()
                {
                  GMTrace.i(20237617463296L, 150782);
                  GestureGuardLogicUI.a(GestureGuardLogicUI.this, 0);
                  localObject1.ryg.bAX();
                  localObject1.ryg.ryw = true;
                  GMTrace.o(20237617463296L, 150782);
                }
              });
            }
            label1466:
            com.tencent.mm.plugin.walletlock.b.h.R(this.rxz, 1, 1);
          }
        }
      }
    }
  }
  
  private void bAS()
  {
    GMTrace.i(20230503923712L, 150729);
    Intent localIntent = (Intent)getIntent().getParcelableExtra("page_intent");
    if (localIntent != null)
    {
      com.tencent.mm.plugin.walletlock.b.i.rze.jl(true);
      com.tencent.mm.plugin.walletlock.b.i.rze.jm(true);
      localIntent.addFlags(131072);
      startActivity(localIntent);
    }
    for (;;)
    {
      finish();
      GMTrace.o(20230503923712L, 150729);
      return;
      w.i("MicroMsg.GestureGuardLogicUI", "Protected page's intent not found, finish myself only.");
    }
  }
  
  private void bAT()
  {
    GMTrace.i(20230638141440L, 150730);
    String str = getIntent().getStringExtra("next_action");
    if ((this.mStatus == 20) || ("next_action.goto_protected_page".equals(str))) {
      com.tencent.mm.plugin.walletlock.b.i.rze.bBj();
    }
    GMTrace.o(20230638141440L, 150730);
  }
  
  private void bwR()
  {
    GMTrace.i(20231577665536L, 150737);
    if ((this.rxU != null) && (this.rxU.isShowing())) {
      this.rxU.dismiss();
    }
    GMTrace.o(20231577665536L, 150737);
  }
  
  private void s(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(20229832835072L, 150724);
    w.i("MicroMsg.GestureGuardLogicUI", "alvinluo gesture finishWithResult");
    Intent localIntent = new Intent();
    localIntent.putExtra("key_err_code", paramInt2);
    localIntent.putExtra("key_err_msg", paramString);
    setResult(paramInt1, localIntent);
    finish();
    GMTrace.o(20229832835072L, 150724);
  }
  
  protected final void MP()
  {
    GMTrace.i(20229161746432L, 150719);
    aLo();
    AW(a.g.ekF);
    this.rxL = AnimationUtils.loadAnimation(this, a.a.rvJ);
    this.rxI = getResources().getColor(a.b.rvL);
    this.rxJ = getResources().getColor(a.b.rvM);
    Intent localIntent = getIntent();
    String str = localIntent.getStringExtra("action");
    localIntent.getStringExtra("next_action");
    if ("action.switch_on_pattern".equals(str))
    {
      this.mStatus = 16;
      N(1, false);
    }
    while (!"action.verify_pattern".equals(str))
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(20235469979648L, 150766);
          if (GestureGuardLogicUI.a(GestureGuardLogicUI.this))
          {
            GMTrace.o(20235469979648L, 150766);
            return true;
          }
          GestureGuardLogicUI.a(GestureGuardLogicUI.this, 0, 4, "user cancel when setting gesture");
          GMTrace.o(20235469979648L, 150766);
          return true;
        }
      });
      w.i("MicroMsg.GestureGuardLogicUI", String.format("GuestureGuardLogicUI, initView done, before doRestBehavior. mStatus=%d", new Object[] { Integer.valueOf(this.mStatus) }));
      bAR();
      GMTrace.o(20229161746432L, 150719);
      return;
    }
    if (com.tencent.mm.plugin.walletlock.gesture.a.b.bAH()) {
      this.rxO = true;
    }
    for (this.mStatus = 20;; this.mStatus = 0)
    {
      N(0, false);
      break;
      this.rxO = false;
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(20231711883264L, 150738);
    GMTrace.o(20231711883264L, 150738);
    return 1;
  }
  
  public final void a(PatternLockView paramPatternLockView)
  {
    GMTrace.i(20231040794624L, 150733);
    paramPatternLockView.a(PatternLockView.b.ryK);
    GMTrace.o(20231040794624L, 150733);
  }
  
  public final void a(final PatternLockView paramPatternLockView, final List<f> paramList)
  {
    GMTrace.i(20230235488256L, 150727);
    if (this.mStatus == 16)
    {
      if (paramList.size() < 4)
      {
        paramPatternLockView.ryw = false;
        paramPatternLockView.a(PatternLockView.b.ryL);
        a(String.format(getString(a.g.rwn), new Object[] { Integer.valueOf(4) }), new a()
        {
          public final void onDone()
          {
            GMTrace.i(20236543721472L, 150774);
            paramPatternLockView.bAX();
            paramPatternLockView.ryw = true;
            GMTrace.o(20236543721472L, 150774);
          }
        });
        GMTrace.o(20230235488256L, 150727);
        return;
      }
      this.rxM = paramList;
      paramPatternLockView.bAX();
      this.mStatus = 17;
      N(2, true);
    }
    for (;;)
    {
      bAR();
      do
      {
        GMTrace.o(20230235488256L, 150727);
        return;
        if (this.mStatus == 0)
        {
          paramPatternLockView = new u.a()
          {
            public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
            {
              GMTrace.i(20219498070016L, 150647);
              if (paramAnonymousInt2 == 0)
              {
                GestureGuardLogicUI.i(GestureGuardLogicUI.this);
                GestureGuardLogicUI.j(GestureGuardLogicUI.this);
                com.tencent.mm.plugin.walletlock.gesture.a.d.bAP();
                com.tencent.mm.plugin.walletlock.gesture.a.d.bAJ();
                com.tencent.mm.plugin.walletlock.gesture.a.d.bAL();
                GestureGuardLogicUI.a(GestureGuardLogicUI.this, paramList);
                GestureGuardLogicUI.a(GestureGuardLogicUI.this, 1);
                GestureGuardLogicUI.h(GestureGuardLogicUI.this);
              }
              for (;;)
              {
                GMTrace.o(20219498070016L, 150647);
                return 0;
                if (paramAnonymousInt2 == -3)
                {
                  GestureGuardLogicUI.k(GestureGuardLogicUI.this);
                  GestureGuardLogicUI.a(GestureGuardLogicUI.this, 2);
                  GestureGuardLogicUI.h(GestureGuardLogicUI.this);
                }
                else
                {
                  Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(a.g.rwk), 0).show();
                }
              }
            }
          };
          Object localObject1 = com.tencent.mm.plugin.walletlock.gesture.a.d.bAN();
          Object localObject2 = com.tencent.mm.plugin.walletlock.gesture.a.d.bAM();
          com.tencent.mm.plugin.report.service.g.ork.i(11453, new Object[0]);
          b(new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymousDialogInterface)
            {
              GMTrace.i(20222987730944L, 150673);
              GestureGuardLogicUI.l(GestureGuardLogicUI.this)[GestureGuardLogicUI.m(GestureGuardLogicUI.this)].ryg.bAX();
              if ((GestureGuardLogicUI.p(GestureGuardLogicUI.this) != null) && (!GestureGuardLogicUI.p(GestureGuardLogicUI.this).gtZ)) {
                com.tencent.mm.kernel.h.wS().c(GestureGuardLogicUI.p(GestureGuardLogicUI.this));
              }
              GMTrace.o(20222987730944L, 150673);
            }
          });
          boolean bool2 = e.b((asd)localObject1);
          boolean bool3 = e.b((asc)localObject2);
          if (bool3) {
            if (bool2) {
              if (((asc)localObject2).version < ((asd)localObject1).uId) {
                bool1 = true;
              }
            }
          }
          for (;;)
          {
            w.i("MicroMsg.GestureGuardLogicUI", String.format("isInfoValid:%b, isBuffValid:%b, verify by server:%b", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool1) }));
            if (!bool1) {
              break;
            }
            localObject1 = new b.a();
            ((b.a)localObject1).gtF = new arb();
            ((b.a)localObject1).gtG = new arc();
            ((b.a)localObject1).gtE = 689;
            ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/oppatternlock";
            localObject1 = ((b.a)localObject1).DA();
            localObject2 = (arb)((com.tencent.mm.ad.b)localObject1).gtC.gtK;
            ((arb)localObject2).nJ = 2;
            ((arb)localObject2).uHn = new azp().be(e.bP(paramList));
            u.a((com.tencent.mm.ad.b)localObject1, new u.a()
            {
              public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
              {
                GMTrace.i(20238422769664L, 150788);
                w.i("MicroMsg.GestureGuardLogicUI", String.format("Scene verifyPattern, errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString }));
                GestureGuardLogicUI.o(GestureGuardLogicUI.this);
                if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0)) {
                  com.tencent.mm.plugin.walletlock.gesture.a.d.a(((arc)paramAnonymousb.gtD.gtK).uHp);
                }
                if (paramPatternLockView != null)
                {
                  paramAnonymousInt1 = paramPatternLockView.a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString, paramAnonymousb, paramAnonymousk);
                  GMTrace.o(20238422769664L, 150788);
                  return paramAnonymousInt1;
                }
                GMTrace.o(20238422769664L, 150788);
                return 0;
              }
            }, false);
            GMTrace.o(20230235488256L, 150727);
            return;
            bool1 = false;
            continue;
            bool1 = false;
            continue;
            bool1 = true;
          }
          bwR();
          localObject1 = com.tencent.mm.plugin.walletlock.gesture.a.d.bAM();
          if (localObject1 == null) {}
          for (boolean bool1 = true; bool1; bool1 = new String(((asc)localObject1).uIa.uNP.tJp).equals(com.tencent.mm.a.g.n(((StringBuilder)localObject2).toString().getBytes())))
          {
            paramPatternLockView.a(3, 0, null, null, null);
            GMTrace.o(20230235488256L, 150727);
            return;
            localObject2 = new StringBuilder();
            com.tencent.mm.kernel.h.xw();
            ((StringBuilder)localObject2).append(new o(com.tencent.mm.kernel.a.ww()).longValue());
            ((StringBuilder)localObject2).append('_');
            ((StringBuilder)localObject2).append(new String(e.bP(paramList)));
          }
          paramPatternLockView.a(3, -3, null, null, null);
          GMTrace.o(20230235488256L, 150727);
          return;
        }
      } while (this.mStatus != 17);
      if (this.rxM.equals(paramList))
      {
        paramPatternLockView.bAX();
        this.rxO = false;
        this.rxP = 0;
        com.tencent.mm.plugin.walletlock.gesture.a.d.bAP();
        com.tencent.mm.plugin.walletlock.gesture.a.d.bAJ();
        com.tencent.mm.plugin.walletlock.gesture.a.d.bAL();
        com.tencent.mm.plugin.walletlock.gesture.a.d.bAx();
        this.mStatus = 18;
      }
      else
      {
        this.mStatus = 19;
      }
    }
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(20230772359168L, 150731);
    a locala = this.rxK[this.lGn];
    if ((paramMotionEvent.getAction() == 2) || (paramMotionEvent.getAction() == 7))
    {
      int i = locala.ryf.getLeft();
      int j = locala.ryf.getTop();
      paramMotionEvent.offsetLocation(-i, -j - getWindow().findViewById(16908290).getTop());
      bool = locala.ryf.dispatchTouchEvent(paramMotionEvent);
      GMTrace.o(20230772359168L, 150731);
      return bool;
    }
    boolean bool = super.dispatchTouchEvent(paramMotionEvent);
    GMTrace.o(20230772359168L, 150731);
    return bool;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(20229295964160L, 150720);
    int i = a.e.rvY;
    GMTrace.o(20229295964160L, 150720);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(20229430181888L, 150721);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 == -1)
    {
      if (paramIntent == null)
      {
        w.e("MicroMsg.GestureGuardLogicUI", "hy: Intent data is null.");
        GMTrace.o(20229430181888L, 150721);
        return;
      }
      paramInt1 = paramIntent.getIntExtra("key_err_code", 0);
      if (paramInt1 == 0)
      {
        this.mToken = paramIntent.getStringExtra("key_token");
        this.rxS = paramIntent.getStringExtra("key_type");
        paramIntent = getIntent().getStringExtra("next_action");
        if (("next_action.goto_protected_page".equals(paramIntent)) || ("next_action.modify_pattern".equals(paramIntent)))
        {
          if ("next_action.modify_pattern".equals(paramIntent)) {
            this.rxW = true;
          }
          this.rxV = false;
          a(null);
          lh(false);
          this.mStatus = 16;
          N(1, false);
        }
        for (;;)
        {
          bAR();
          GMTrace.o(20229430181888L, 150721);
          return;
          if ("next_action.switch_off_pattern".equals(paramIntent))
          {
            paramIntent = this.mToken;
            final u.a local12 = new u.a()
            {
              public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
              {
                GMTrace.i(20220571811840L, 150655);
                if (paramAnonymousInt2 == 0)
                {
                  com.tencent.mm.plugin.walletlock.gesture.a.d.bAP();
                  com.tencent.mm.plugin.walletlock.gesture.a.d.bAJ();
                  com.tencent.mm.plugin.walletlock.gesture.a.d.bAL();
                  Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(a.g.rwy), 0).show();
                }
                for (;;)
                {
                  GestureGuardLogicUI.b(GestureGuardLogicUI.this);
                  GestureGuardLogicUI.c(GestureGuardLogicUI.this);
                  GestureGuardLogicUI.this.finish();
                  GMTrace.o(20220571811840L, 150655);
                  return 0;
                  Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(a.g.rwj), 0).show();
                }
              }
            };
            b(new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymousDialogInterface)
              {
                GMTrace.i(20237885898752L, 150784);
                GestureGuardLogicUI.l(GestureGuardLogicUI.this)[GestureGuardLogicUI.m(GestureGuardLogicUI.this)].ryg.bAX();
                if ((GestureGuardLogicUI.n(GestureGuardLogicUI.this) != null) && (!GestureGuardLogicUI.n(GestureGuardLogicUI.this).gtZ)) {
                  com.tencent.mm.kernel.h.wS().c(GestureGuardLogicUI.n(GestureGuardLogicUI.this));
                }
                GMTrace.o(20237885898752L, 150784);
              }
            });
            if (paramIntent == null)
            {
              bwR();
              local12.a(3, -6, getString(a.g.rwl), null, null);
            }
            else
            {
              Object localObject = new b.a();
              ((b.a)localObject).gtF = new ayd();
              ((b.a)localObject).gtG = new aye();
              ((b.a)localObject).gtE = 688;
              ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/registernewpatternlock";
              localObject = ((b.a)localObject).DA();
              ayd localayd = (ayd)((com.tencent.mm.ad.b)localObject).gtC.gtK;
              localayd.uMC = new azp().be(paramIntent.getBytes());
              localayd.nJ = 3;
              u.a((com.tencent.mm.ad.b)localObject, new u.a()
              {
                public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
                {
                  GMTrace.i(20235201544192L, 150764);
                  w.i("MicroMsg.GestureGuardLogicUI", String.format("Scene doSwitchOn, errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString }));
                  GestureGuardLogicUI.o(GestureGuardLogicUI.this);
                  if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
                  {
                    com.tencent.mm.plugin.walletlock.gesture.a.d.a(((aye)paramAnonymousb.gtD.gtK).uHp);
                    com.tencent.mm.plugin.walletlock.b.g localg = com.tencent.mm.plugin.walletlock.b.g.rza;
                    com.tencent.mm.plugin.walletlock.b.g.jg(false);
                    GestureGuardLogicUI.bAU();
                  }
                  com.tencent.mm.plugin.walletlock.b.i.rze.bBi();
                  if (local12 != null)
                  {
                    paramAnonymousInt1 = local12.a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString, paramAnonymousb, paramAnonymousk);
                    GMTrace.o(20235201544192L, 150764);
                    return paramAnonymousInt1;
                  }
                  GMTrace.o(20235201544192L, 150764);
                  return 0;
                }
              }, false);
            }
          }
          else
          {
            this.mStatus = 1;
          }
        }
      }
      if (paramInt1 == -1) {
        Toast.makeText(this, getString(a.g.rwj), 0).show();
      }
    }
    GMTrace.o(20229430181888L, 150721);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(20229564399616L, 150722);
    if (paramView.getId() == a.d.rvW)
    {
      paramView = new Intent();
      paramView.putExtra("action", "action.verify_paypwd");
      paramView.putExtra("key_wallet_lock_type", 1);
      com.tencent.mm.bj.d.b(this, "wallet", ".pwd.ui.WalletLockCheckPwdUI", paramView, 1001);
    }
    GMTrace.o(20229564399616L, 150722);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = 0;
    GMTrace.i(20228759093248L, 150716);
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    if ((!ab.getPackageName().equals(paramBundle.getPackage())) || (bg.nm(paramBundle.getStringExtra("action"))) || (bg.nm(paramBundle.getStringExtra("next_action"))))
    {
      w.w("MicroMsg.GestureGuardLogicUI", "Intent started this activity has no valid action desc.");
      finish();
      GMTrace.o(20228759093248L, 150716);
      return;
    }
    this.rxT = new ViewFlipper(this);
    this.rxK = new a[] { new a(this), new a(this), new a(this) };
    paramBundle = this.rxK;
    int j = paramBundle.length;
    while (i < j)
    {
      Object localObject = paramBundle[i];
      this.rxT.addView(((a)localObject).mView);
      ((a)localObject).ryg.ryI = this;
      ((a)localObject).ryh.setOnClickListener(this);
      i += 1;
    }
    setContentView(this.rxT);
    this.mToken = getIntent().getStringExtra("token");
    this.rxS = getIntent().getStringExtra("type");
    this.rxX = getIntent().getStringExtra("verify_title");
    this.rxz = getIntent().getIntExtra("scene", -1);
    if ("next_action.goto_protected_page".equals(getIntent().getStringExtra("next_action"))) {
      com.tencent.mm.plugin.walletlock.b.h.bBf();
    }
    MP();
    GMTrace.o(20228759093248L, 150716);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(20229027528704L, 150718);
    super.onDestroy();
    if (this.rxQ != null)
    {
      com.tencent.mm.kernel.h.wS().c(this.rxQ);
      this.rxQ = null;
    }
    if (this.rxR != null)
    {
      com.tencent.mm.kernel.h.wS().c(this.rxR);
      this.rxR = null;
    }
    if ((this.rxU != null) && (this.rxU.isShowing())) {
      this.rxU.dismiss();
    }
    if (this.rxT != null)
    {
      this.rxT.removeAllViews();
      this.rxT = null;
    }
    int i = 0;
    while (i < this.rxK.length)
    {
      a locala = this.rxK[i];
      locala.ryg.setOnClickListener(null);
      locala.ryh.setOnClickListener(null);
      locala.mView = null;
      locala.rye = null;
      locala.ryf = null;
      locala.ryg = null;
      locala.ryh = null;
      this.rxK[i] = null;
      i += 1;
    }
    this.rxK = null;
    GMTrace.o(20229027528704L, 150718);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(20229698617344L, 150723);
    if (paramInt == 4)
    {
      if (bAQ())
      {
        GMTrace.o(20229698617344L, 150723);
        return false;
      }
      s(0, 4, "user cancel when setting gesture");
      GMTrace.o(20229698617344L, 150723);
      return false;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(20229698617344L, 150723);
    return bool;
  }
  
  protected void onResume()
  {
    GMTrace.i(20228893310976L, 150717);
    super.onResume();
    if (this.mStatus == 0)
    {
      com.tencent.mm.plugin.walletlock.gesture.a.g localg = com.tencent.mm.plugin.walletlock.gesture.a.d.bAK();
      if (localg.rxG == -1L) {
        break label104;
      }
      e.a(localg);
      if (localg.rxH / 1000L >= 600L) {
        break label101;
      }
      com.tencent.mm.plugin.walletlock.gesture.a.d.y(localg.rxG, localg.rxH);
    }
    label101:
    label104:
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        this.rxP = com.tencent.mm.plugin.walletlock.gesture.a.d.bAO();
        if (this.rxP != -1) {}
      }
      else
      {
        this.rxP = 0;
      }
      GMTrace.o(20228893310976L, 150717);
      return;
      com.tencent.mm.plugin.walletlock.gesture.a.d.bAL();
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    GMTrace.i(20230906576896L, 150732);
    Object localObject = this.rxK[this.lGn];
    if (((a)localObject).ryg != null)
    {
      localObject = ((a)localObject).ryg;
      if ((!paramBoolean) || (this.rxO)) {
        break label59;
      }
    }
    label59:
    for (paramBoolean = true;; paramBoolean = false)
    {
      ((PatternLockView)localObject).ryw = paramBoolean;
      GMTrace.o(20230906576896L, 150732);
      return;
    }
  }
  
  private static abstract interface a
  {
    public abstract void onDone();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\walletlock\gesture\ui\GestureGuardLogicUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */