package com.tencent.mm.plugin.luckymoney.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.luckymoney.b.af;
import com.tencent.mm.plugin.luckymoney.b.i;
import com.tencent.mm.plugin.luckymoney.b.n;
import com.tencent.mm.plugin.luckymoney.b.o;
import com.tencent.mm.plugin.luckymoney.b.s;
import com.tencent.mm.plugin.luckymoney.b.t;
import com.tencent.mm.plugin.luckymoney.b.u;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wallet_core.id_verify.util.a.a;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.b.a;
import java.io.IOException;

@com.tencent.mm.ui.base.a(3)
public class LuckyMoneyBusiReceiveUI
  extends LuckyMoneyBaseUI
{
  private com.tencent.mm.ui.base.r hsU;
  private ImageView mGV;
  private ImageView mMg;
  private TextView mMh;
  private Button mMj;
  private View mMn;
  private String mMo;
  private String mMp;
  private ImageView mNA;
  private TextView mNB;
  private View mNC;
  private TextView mND;
  private Button mNE;
  private TextView mNF;
  private CheckBox mNG;
  private int mNH;
  private String mNI;
  private int mNJ;
  private t mNK;
  private RealnameGuideHelper mNL;
  private TextView mNb;
  private int mNl;
  private TextView mNx;
  private TextView mNy;
  private View mNz;
  
  public LuckyMoneyBusiReceiveUI()
  {
    GMTrace.i(9803531288576L, 73042);
    this.hsU = null;
    this.mMp = null;
    this.mMo = null;
    this.mNI = null;
    this.mNJ = 0;
    this.mNl = 0;
    GMTrace.o(9803531288576L, 73042);
  }
  
  private void init()
  {
    GMTrace.i(9803799724032L, 73044);
    this.hsU = h.a(this.vKB.vKW, getString(a.i.bKJ), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(9797894144000L, 73000);
        if ((LuckyMoneyBusiReceiveUI.a(LuckyMoneyBusiReceiveUI.this) != null) && (LuckyMoneyBusiReceiveUI.a(LuckyMoneyBusiReceiveUI.this).isShowing())) {
          LuckyMoneyBusiReceiveUI.a(LuckyMoneyBusiReceiveUI.this).dismiss();
        }
        LuckyMoneyBusiReceiveUI.this.mMW.aMc();
        if ((LuckyMoneyBusiReceiveUI.b(LuckyMoneyBusiReceiveUI.this).getVisibility() == 8) || (LuckyMoneyBusiReceiveUI.c(LuckyMoneyBusiReceiveUI.this).getVisibility() == 4))
        {
          w.i("MicroMsg.LuckyMoneyBusiReceiveUI", "user cancel & finish");
          LuckyMoneyBusiReceiveUI.this.finish();
        }
        GMTrace.o(9797894144000L, 73000);
      }
    });
    if (this.mNH == 3)
    {
      b(new com.tencent.mm.plugin.luckymoney.b.r(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url")), false);
      GMTrace.o(9803799724032L, 73044);
      return;
    }
    if (this.mNH == 4)
    {
      b(new com.tencent.mm.plugin.luckymoney.b.r(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("key_wxapi_sign"), getIntent().getStringExtra("key_wxapi_package_name")), false);
      GMTrace.o(9803799724032L, 73044);
      return;
    }
    try
    {
      this.mMo = Uri.parse(bg.nl(this.mMp)).getQueryParameter("sendid");
      if (!bg.nm(this.mMo))
      {
        b(new t(this.mMo, this.mMp, this.mNH, getIntent().getStringExtra("packageExt")), false);
        GMTrace.o(9803799724032L, 73044);
        return;
      }
      finish();
      w.w("MicroMsg.LuckyMoneyBusiReceiveUI", "sendid null & finish");
      GMTrace.o(9803799724032L, 73044);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(9804202377216L, 73047);
    this.mMn = findViewById(a.f.sxE);
    this.mMg = ((ImageView)findViewById(a.f.sxI));
    this.mMh = ((TextView)findViewById(a.f.sxJ));
    this.mNy = ((TextView)findViewById(a.f.sxF));
    this.mNx = ((TextView)findViewById(a.f.sxM));
    this.mMj = ((Button)findViewById(a.f.sxG));
    this.mGV = ((ImageView)findViewById(a.f.sxP));
    this.mNz = findViewById(a.f.sxD);
    this.mNb = ((TextView)findViewById(a.f.sxC));
    this.mNA = ((ImageView)findViewById(a.f.sxQ));
    this.mNB = ((TextView)findViewById(a.f.sxO));
    this.mNC = findViewById(a.f.sxK);
    this.mND = ((TextView)findViewById(a.f.sxL));
    this.mNE = ((Button)findViewById(a.f.sxR));
    this.mNF = ((TextView)findViewById(a.f.sxH));
    this.mNG = ((CheckBox)findViewById(a.f.sxS));
    this.mGV.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9840306946048L, 73316);
        paramAnonymousView = new Bundle();
        paramAnonymousView.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyBusiReceiveUI");
        paramAnonymousView.putString("realname_verify_process_jump_plugin", "luckymoney");
        if ((LuckyMoneyBusiReceiveUI.d(LuckyMoneyBusiReceiveUI.this) != null) && (LuckyMoneyBusiReceiveUI.d(LuckyMoneyBusiReceiveUI.this).b(LuckyMoneyBusiReceiveUI.this, paramAnonymousView, null, true)))
        {
          LuckyMoneyBusiReceiveUI.e(LuckyMoneyBusiReceiveUI.this);
          GMTrace.o(9840306946048L, 73316);
          return;
        }
        LuckyMoneyBusiReceiveUI.this.finish();
        GMTrace.o(9840306946048L, 73316);
      }
    });
    sv(8);
    GMTrace.o(9804202377216L, 73047);
  }
  
  public final boolean d(int paramInt1, int paramInt2, final String paramString, final k paramk)
  {
    GMTrace.i(9804336594944L, 73048);
    if ((paramk instanceof t))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.mNK = ((t)paramk);
        this.mMo = this.mNK.mFr;
        this.mNJ = this.mNK.mIb;
        com.tencent.mm.plugin.report.service.g.ork.i(13050, new Object[] { Integer.valueOf(this.mNl), Integer.valueOf(1), this.mNK.mJh });
        if (this.mNK.eYo == 2)
        {
          b(new u(this.mMo, 11, 0, this.mMp, "v1.0"), false);
          GMTrace.o(9804336594944L, 73048);
          return true;
        }
        if ((this.hsU != null) && (this.hsU.isShowing())) {
          this.hsU.hide();
        }
        n.a(this.mMg, this.mNK.mJm, true);
        n.a(this.vKB.vKW, this.mMh, this.mNK.mJb);
        n.g(this.mNA, this.mNK.mIw);
        if ((this.mNK.eYo != 1) && (this.mNK.eYn != 4) && (this.mNK.eYn != 5) && (this.mNK.eYn != 1)) {
          if (!bg.nm(this.mNK.mJh))
          {
            this.mNI = this.mNK.mJh;
            if (this.mNK.mJi == 1) {
              this.mNG.setVisibility(8);
            }
          }
          else
          {
            this.mMj.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(9874398248960L, 73570);
                com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(10), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2) });
                if (LuckyMoneyBusiReceiveUI.f(LuckyMoneyBusiReceiveUI.this).isChecked()) {
                  com.tencent.mm.plugin.report.service.g.ork.i(13050, new Object[] { Integer.valueOf(LuckyMoneyBusiReceiveUI.g(LuckyMoneyBusiReceiveUI.this)), Integer.valueOf(2), LuckyMoneyBusiReceiveUI.h(LuckyMoneyBusiReceiveUI.this).mJh });
                }
                while ("0".equals(LuckyMoneyBusiReceiveUI.h(LuckyMoneyBusiReceiveUI.this).mJp))
                {
                  com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(LuckyMoneyBusiReceiveUI.this, LuckyMoneyBusiReceiveUI.this.mMW, LuckyMoneyBusiReceiveUI.h(LuckyMoneyBusiReceiveUI.this).mJq, LuckyMoneyBusiReceiveUI.h(LuckyMoneyBusiReceiveUI.this).mJr, LuckyMoneyBusiReceiveUI.h(LuckyMoneyBusiReceiveUI.this).mJs, LuckyMoneyBusiReceiveUI.h(LuckyMoneyBusiReceiveUI.this).mJt, new a.a()
                  {
                    public final boolean a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, boolean paramAnonymous2Boolean)
                    {
                      GMTrace.i(9808363126784L, 73078);
                      w.i("MicroMsg.LuckyMoneyBusiReceiveUI", "showDisclaimerDialog resultCode=" + paramAnonymous2Int1 + ";errCode=" + paramAnonymous2Int2 + ";errMsg=" + paramAnonymous2String + ";hadAgree = " + paramAnonymous2Boolean);
                      if ((paramAnonymous2Int1 == 0) || (paramAnonymous2Boolean)) {
                        LuckyMoneyBusiReceiveUI.i(LuckyMoneyBusiReceiveUI.this);
                      }
                      GMTrace.o(9808363126784L, 73078);
                      return true;
                    }
                  }, false, 1005);
                  GMTrace.o(9874398248960L, 73570);
                  return;
                  com.tencent.mm.plugin.report.service.g.ork.i(13050, new Object[] { Integer.valueOf(LuckyMoneyBusiReceiveUI.g(LuckyMoneyBusiReceiveUI.this)), Integer.valueOf(2), "" });
                }
                LuckyMoneyBusiReceiveUI.i(LuckyMoneyBusiReceiveUI.this);
                GMTrace.o(9874398248960L, 73570);
              }
            });
            if (bg.nm(this.mNK.mIc)) {
              break label473;
            }
            this.mNx.setText(this.mNK.mIc);
            label348:
            if (bg.nm(this.mNK.mJn)) {
              break label485;
            }
            this.mNy.setText(this.mNK.mJn);
          }
        }
        for (;;)
        {
          n.a(this.mMn, null);
          this.vKB.hqF.setVisibility(0);
          break;
          w.i("MicroMsg.LuckyMoneyBusiReceiveUI", "show checkbox for " + this.mNK.mJh);
          if (this.mNK.mJf == 1) {
            this.mNG.setChecked(true);
          }
          for (;;)
          {
            this.mNG.setText(this.mNK.mJg);
            break;
            this.mNG.setChecked(false);
          }
          label473:
          this.mNx.setVisibility(8);
          break label348;
          label485:
          this.mNy.setVisibility(8);
          continue;
          com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(11), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(3) });
          this.mNx.setVisibility(4);
          this.mNy.setText(this.mNK.mIc);
          this.mMj.setVisibility(8);
          if (this.mNJ == 1)
          {
            this.mNB.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(9813463400448L, 73116);
                com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(11), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(4) });
                paramAnonymousView = new Intent();
                paramAnonymousView.setClass(LuckyMoneyBusiReceiveUI.this.vKB.vKW, LuckyMoneyBusiDetailUI.class);
                paramAnonymousView.putExtra("key_native_url", LuckyMoneyBusiReceiveUI.j(LuckyMoneyBusiReceiveUI.this));
                paramAnonymousView.putExtra("key_sendid", LuckyMoneyBusiReceiveUI.h(LuckyMoneyBusiReceiveUI.this).mFr);
                paramAnonymousView.putExtra("key_static_from_scene", LuckyMoneyBusiReceiveUI.g(LuckyMoneyBusiReceiveUI.this));
                LuckyMoneyBusiReceiveUI.this.startActivity(paramAnonymousView);
                LuckyMoneyBusiReceiveUI.this.finish();
                GMTrace.o(9813463400448L, 73116);
              }
            });
            this.mNB.setVisibility(0);
          }
          else
          {
            this.mNB.setVisibility(8);
          }
        }
      }
    }
    else if ((paramk instanceof s))
    {
      n.c(this.mMj);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramk = (s)paramk;
        if (paramk.eYo == 2)
        {
          if ((paramk.jWn <= 1) || ((paramk.mIt != null) && (paramk.mIt.fPf != 1)))
          {
            w.i("MicroMsg.LuckyMoneyBusiReceiveUI", "can not atomic go detail");
            paramString = new Intent();
            paramString.putExtra("key_sendid", paramk.mFr);
            paramString.putExtra("key_static_from_scene", this.mNl);
            if (paramk.mJk != null) {
              paramString.putExtra("key_realname_guide_helper", paramk.mJk);
            }
            try
            {
              paramString.putExtra("key_detail_info", paramk.mJj.toByteArray());
              paramString.putExtra("key_jump_from", 2);
              if (com.tencent.mm.k.g.ut().getInt("PlayCoinSound", 0) > 0) {
                paramString.putExtra("play_sound", true);
              }
              d.b(this.vKB.vKW, "luckymoney", ".ui.LuckyMoneyBusiDetailUI", paramString);
              finish();
              GMTrace.o(9804336594944L, 73048);
              return true;
            }
            catch (IOException paramk)
            {
              for (;;)
              {
                w.w("MicroMsg.LuckyMoneyBusiReceiveUI", "luckyMoneyDetail.toByteArray() fail! " + paramk.getLocalizedMessage());
              }
            }
          }
          paramString = findViewById(a.f.sxN);
          TranslateAnimation localTranslateAnimation = new TranslateAnimation(0.0F, 0.0F, 0.0F, -paramString.getHeight());
          localTranslateAnimation.setDuration(400L);
          localTranslateAnimation.setFillAfter(true);
          localTranslateAnimation.setAnimationListener(new Animation.AnimationListener()
          {
            public final void onAnimationEnd(Animation paramAnonymousAnimation)
            {
              GMTrace.i(9821650681856L, 73177);
              paramString.setVisibility(8);
              GMTrace.o(9821650681856L, 73177);
            }
            
            public final void onAnimationRepeat(Animation paramAnonymousAnimation)
            {
              GMTrace.i(9821784899584L, 73178);
              GMTrace.o(9821784899584L, 73178);
            }
            
            public final void onAnimationStart(Animation paramAnonymousAnimation)
            {
              GMTrace.i(9821516464128L, 73176);
              GMTrace.o(9821516464128L, 73176);
            }
          });
          paramString.startAnimation(localTranslateAnimation);
          this.mNb.setText(com.tencent.mm.wallet_core.ui.e.r(paramk.eYB / 100.0D));
          this.mMh.setText(paramk.mJb);
          this.mNx.setVisibility(8);
          this.mNy.setVisibility(8);
          this.mNz.setVisibility(0);
          this.mMj.setVisibility(8);
          if (!bg.nm(paramk.mJe))
          {
            paramString = paramk.mJe;
            this.mNE.setText(paramString);
            this.mNF.setVisibility(0);
            com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(12), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
            w.i("MicroMsg.LuckyMoneyBusiReceiveUI", "totalNum:" + paramk.jWn);
            if ((paramk.jWn <= 1) && ((paramk.mIt == null) || (paramk.mIt.fPf != 1))) {
              break label1195;
            }
            w.i("MicroMsg.LuckyMoneyBusiReceiveUI", "can atomic");
            this.mNL = paramk.mJk;
            this.mNE.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(9798967885824L, 73008);
                LuckyMoneyBusiReceiveUI.k(LuckyMoneyBusiReceiveUI.this).setVisibility(4);
                LuckyMoneyBusiReceiveUI.l(LuckyMoneyBusiReceiveUI.this).setVisibility(8);
                LuckyMoneyBusiReceiveUI.m(LuckyMoneyBusiReceiveUI.this).setVisibility(8);
                if ((paramk.mIt != null) && (!bg.nm(paramk.mIt.mHN))) {}
                for (paramAnonymousView = paramk.mIt.mHN;; paramAnonymousView = LuckyMoneyBusiReceiveUI.this.getString(a.i.sVl))
                {
                  LuckyMoneyBusiReceiveUI.n(LuckyMoneyBusiReceiveUI.this).setText(paramAnonymousView);
                  LuckyMoneyBusiReceiveUI.o(LuckyMoneyBusiReceiveUI.this).setText(paramk.mJc);
                  LuckyMoneyBusiReceiveUI.p(LuckyMoneyBusiReceiveUI.this).setVisibility(0);
                  LuckyMoneyBusiReceiveUI.n(LuckyMoneyBusiReceiveUI.this).setOnClickListener(new View.OnClickListener()
                  {
                    public final void onClick(View paramAnonymous2View)
                    {
                      GMTrace.i(9882451312640L, 73630);
                      com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(12), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2) });
                      n.a(LuckyMoneyBusiReceiveUI.this, 1, false);
                      GMTrace.o(9882451312640L, 73630);
                    }
                  });
                  n.a(LuckyMoneyBusiReceiveUI.k(LuckyMoneyBusiReceiveUI.this), new Animation.AnimationListener()
                  {
                    public final void onAnimationEnd(Animation paramAnonymous2Animation)
                    {
                      GMTrace.i(9884733014016L, 73647);
                      GMTrace.o(9884733014016L, 73647);
                    }
                    
                    public final void onAnimationRepeat(Animation paramAnonymous2Animation)
                    {
                      GMTrace.i(9884598796288L, 73646);
                      GMTrace.o(9884598796288L, 73646);
                    }
                    
                    public final void onAnimationStart(Animation paramAnonymous2Animation)
                    {
                      GMTrace.i(9884464578560L, 73645);
                      LuckyMoneyBusiReceiveUI.k(LuckyMoneyBusiReceiveUI.this).setVisibility(0);
                      GMTrace.o(9884464578560L, 73645);
                    }
                  });
                  GMTrace.o(9798967885824L, 73008);
                  return;
                }
              }
            });
            label1165:
            this.mNE.setVisibility(0);
          }
        }
        for (;;)
        {
          GMTrace.o(9804336594944L, 73048);
          return true;
          paramString = getString(a.i.sVk);
          break;
          label1195:
          this.mNE.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(9812658094080L, 73110);
              LuckyMoneyBusiReceiveUI.this.finish();
              GMTrace.o(9812658094080L, 73110);
            }
          });
          break label1165;
          this.mNx.setVisibility(4);
          this.mNy.setText(paramk.mIc);
          this.mMj.setVisibility(8);
          if (this.mNJ == 1)
          {
            this.mNB.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(9832253882368L, 73256);
                paramAnonymousView = new Intent();
                paramAnonymousView.setClass(LuckyMoneyBusiReceiveUI.this.vKB.vKW, LuckyMoneyBusiDetailUI.class);
                if (paramk.mJk != null) {
                  paramAnonymousView.putExtra("key_realname_guide_helper", paramk.mJk);
                }
                paramAnonymousView.putExtra("key_native_url", LuckyMoneyBusiReceiveUI.j(LuckyMoneyBusiReceiveUI.this));
                paramAnonymousView.putExtra("key_sendid", paramk.mFr);
                paramAnonymousView.putExtra("key_static_from_scene", LuckyMoneyBusiReceiveUI.g(LuckyMoneyBusiReceiveUI.this));
                LuckyMoneyBusiReceiveUI.this.startActivity(paramAnonymousView);
                LuckyMoneyBusiReceiveUI.this.finish();
                GMTrace.o(9832253882368L, 73256);
              }
            });
            this.mNB.setVisibility(0);
          }
          else
          {
            this.mNB.setVisibility(8);
          }
        }
      }
      if (paramInt2 == 416)
      {
        if ((this.hsU != null) && (this.hsU.isShowing())) {
          this.hsU.hide();
        }
        paramString = new Bundle();
        paramString.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyBusiReceiveUI");
        paramString.putString("realname_verify_process_jump_plugin", "luckymoney");
        this.mMj.setBackgroundResource(a.e.snT);
        boolean bool = n.a(this, paramInt2, paramk, paramString, false, new DialogInterface.OnClickListener()new b.a
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(9788498903040L, 72930);
            GMTrace.o(9788498903040L, 72930);
          }
        }, new b.a()
        {
          public final Intent k(int paramAnonymousInt, Bundle paramAnonymousBundle)
          {
            GMTrace.i(9867150491648L, 73516);
            w.i("MicroMsg.LuckyMoneyBusiReceiveUI", "re");
            GMTrace.o(9867150491648L, 73516);
            return null;
          }
        }, 1005);
        GMTrace.o(9804336594944L, 73048);
        return bool;
      }
    }
    else
    {
      if ((paramk instanceof af))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          h.bm(this, getString(a.i.dCJ));
          com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(12), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(4) });
          finish();
          GMTrace.o(9804336594944L, 73048);
          return true;
        }
        h.bm(this, paramString);
        GMTrace.o(9804336594944L, 73048);
        return true;
      }
      if ((paramk instanceof com.tencent.mm.plugin.luckymoney.b.r))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          setResult(-1);
          l(new t(this.mMo, this.mMp, this.mNH, getIntent().getStringExtra("packageExt")));
          GMTrace.o(9804336594944L, 73048);
          return true;
        }
        if (this.mNH == 4)
        {
          finish();
          GMTrace.o(9804336594944L, 73048);
          return false;
        }
        setResult(0);
        finish();
        GMTrace.o(9804336594944L, 73048);
        return true;
      }
      if ((paramk instanceof o))
      {
        GMTrace.o(9804336594944L, 73048);
        return true;
      }
      if ((paramk instanceof u))
      {
        if ((this.hsU != null) && (this.hsU.isShowing())) {
          this.hsU.hide();
        }
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramk = (u)paramk;
          paramString = new Intent();
          paramString.setClass(this.vKB.vKW, LuckyMoneyBusiDetailUI.class);
          try
          {
            paramString.putExtra("key_detail_info", paramk.mJj.toByteArray());
            paramString.putExtra("key_jump_from", 2);
            paramString.putExtra("key_native_url", this.mMp);
            paramString.putExtra("key_sendid", this.mMo);
            paramString.putExtra("key_static_from_scene", this.mNl);
            startActivity(paramString);
            finish();
            GMTrace.o(9804336594944L, 73048);
            return true;
          }
          catch (IOException paramk)
          {
            for (;;)
            {
              w.w("MicroMsg.LuckyMoneyBusiReceiveUI", "luckyMoneyDetail.toByteArray() fail! " + paramk.getLocalizedMessage());
            }
          }
        }
      }
    }
    GMTrace.o(9804336594944L, 73048);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9804605030400L, 73050);
    int i = a.g.sMK;
    GMTrace.o(9804605030400L, 73050);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(9804470812672L, 73049);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      GMTrace.o(9804470812672L, 73049);
      return;
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        String str = paramIntent.getStringExtra("Select_Conv_User");
        com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(12), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(3), str });
        if (!bg.nm(str)) {
          l(new af(str, this.mMo, "v1.0"));
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9803665506304L, 73043);
    super.onCreate(paramBundle);
    this.mMp = getIntent().getStringExtra("key_native_url");
    this.mNH = getIntent().getIntExtra("key_way", 5);
    this.mNl = getIntent().getIntExtra("key_static_from_scene", 0);
    w.i("MicroMsg.LuckyMoneyBusiReceiveUI", "nativeurl=" + bg.nl(this.mMp) + ", mWay=" + this.mNH);
    init();
    com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(10), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
    MP();
    hN(980);
    GMTrace.o(9803665506304L, 73043);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(9804068159488L, 73046);
    super.onDestroy();
    if ((this.hsU != null) && (this.hsU.isShowing())) {
      this.hsU.dismiss();
    }
    hO(980);
    GMTrace.o(9804068159488L, 73046);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(9803933941760L, 73045);
    if ((paramIntent != null) && (paramIntent.hasExtra("key_is_realname_verify_process")))
    {
      if (paramIntent.getIntExtra("realname_verify_process_ret", 0) == -1)
      {
        w.i("MicroMsg.LuckyMoneyBusiReceiveUI", "new intent from realname verify process succ");
        init();
        GMTrace.o(9803933941760L, 73045);
        return;
      }
      w.i("MicroMsg.LuckyMoneyBusiReceiveUI", "new intent from realname verify process cancel");
      setResult(-1);
      finish();
    }
    GMTrace.o(9803933941760L, 73045);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\ui\LuckyMoneyBusiReceiveUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */