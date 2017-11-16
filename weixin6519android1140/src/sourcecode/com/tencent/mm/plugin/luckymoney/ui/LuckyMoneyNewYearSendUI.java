package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcdntran.b;
import com.tencent.mm.modelcdntran.c;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.plugin.luckymoney.b.ac;
import com.tencent.mm.plugin.luckymoney.b.ad;
import com.tencent.mm.plugin.luckymoney.b.j;
import com.tencent.mm.plugin.luckymoney.b.j.a;
import com.tencent.mm.plugin.luckymoney.b.n;
import com.tencent.mm.plugin.luckymoney.b.v;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

@com.tencent.mm.ui.base.a(3)
public class LuckyMoneyNewYearSendUI
  extends LuckyMoneyBaseUI
{
  private Dialog hul;
  private View.OnClickListener hwh;
  private Button ktP;
  private Bitmap mBitmap;
  private int mChannel;
  private ae mHandler;
  private int mJD;
  private LinkedList<com.tencent.mm.plugin.luckymoney.b.k> mJE;
  private String mJw;
  private int mJy;
  private int mLR;
  private String mLV;
  private TextView mMi;
  private LuckyMoneyAutoScrollView mOY;
  private TextView mOZ;
  private String mPA;
  private boolean mPB;
  private String mPC;
  private int mPD;
  private ImageView mPe;
  private View mPf;
  private ImageView mPg;
  private boolean mPi;
  private String mPj;
  private String mPk;
  private int mPl;
  private j mPm;
  private View mPu;
  private View mPv;
  private ImageView mPw;
  private TextView mPx;
  private ImageView mPy;
  private LinearLayout mPz;
  
  public LuckyMoneyNewYearSendUI()
  {
    GMTrace.i(9844199260160L, 73345);
    this.hul = null;
    this.mPB = true;
    this.mJD = 0;
    this.mPi = false;
    this.mPC = "";
    this.mPj = "";
    this.mPk = "";
    this.mPD = 0;
    this.mHandler = new ae();
    this.hwh = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9819368980480L, 73160);
        if (paramAnonymousView.getId() == a.f.szz)
        {
          com.tencent.mm.plugin.report.service.g.ork.i(13079, new Object[] { Integer.valueOf(5), Integer.valueOf(1) });
          if ((LuckyMoneyNewYearSendUI.a(LuckyMoneyNewYearSendUI.this) == 1) && (LuckyMoneyNewYearSendUI.b(LuckyMoneyNewYearSendUI.this)) && (!TextUtils.isEmpty(LuckyMoneyNewYearSendUI.c(LuckyMoneyNewYearSendUI.this))) && (!TextUtils.isEmpty(LuckyMoneyNewYearSendUI.d(LuckyMoneyNewYearSendUI.this))) && (!TextUtils.isEmpty(LuckyMoneyNewYearSendUI.e(LuckyMoneyNewYearSendUI.this))) && (LuckyMoneyNewYearSendUI.f(LuckyMoneyNewYearSendUI.this) > 0))
          {
            w.i("MicroMsg.LuckyMoneyNewYearSendUI", "to send HB with last post image data!");
            LuckyMoneyNewYearSendUI.g(LuckyMoneyNewYearSendUI.this);
            GMTrace.o(9819368980480L, 73160);
            return;
          }
          if ((LuckyMoneyNewYearSendUI.a(LuckyMoneyNewYearSendUI.this) == 1) && (LuckyMoneyNewYearSendUI.b(LuckyMoneyNewYearSendUI.this)) && (!TextUtils.isEmpty(LuckyMoneyNewYearSendUI.c(LuckyMoneyNewYearSendUI.this))))
          {
            w.i("MicroMsg.LuckyMoneyNewYearSendUI", "to send HB with new image data!");
            LuckyMoneyNewYearSendUI.h(LuckyMoneyNewYearSendUI.this);
            if (LuckyMoneyNewYearSendUI.i(LuckyMoneyNewYearSendUI.this) == null) {
              LuckyMoneyNewYearSendUI.a(LuckyMoneyNewYearSendUI.this, new j());
            }
            paramAnonymousView = LuckyMoneyNewYearSendUI.i(LuckyMoneyNewYearSendUI.this);
            String str = LuckyMoneyNewYearSendUI.c(LuckyMoneyNewYearSendUI.this);
            Object localObject = new j.a()
            {
              public final void a(keep_SceneResult paramAnonymous2keep_SceneResult, String paramAnonymous2String, boolean paramAnonymous2Boolean)
              {
                GMTrace.i(9881377570816L, 73622);
                if (paramAnonymous2Boolean)
                {
                  w.i("MicroMsg.LuckyMoneyNewYearSendUI", "upload image success, to send HB");
                  LuckyMoneyNewYearSendUI.a(LuckyMoneyNewYearSendUI.this, paramAnonymous2keep_SceneResult.field_fileId);
                  LuckyMoneyNewYearSendUI.b(LuckyMoneyNewYearSendUI.this, paramAnonymous2keep_SceneResult.field_aesKey);
                  LuckyMoneyNewYearSendUI.a(LuckyMoneyNewYearSendUI.this, paramAnonymous2keep_SceneResult.field_fileLength);
                  LuckyMoneyNewYearSendUI.j(LuckyMoneyNewYearSendUI.this).post(new Runnable()
                  {
                    public final void run()
                    {
                      GMTrace.i(9838427897856L, 73302);
                      LuckyMoneyNewYearSendUI.g(LuckyMoneyNewYearSendUI.this);
                      GMTrace.o(9838427897856L, 73302);
                    }
                  });
                  GMTrace.o(9881377570816L, 73622);
                  return;
                }
                LuckyMoneyNewYearSendUI.j(LuckyMoneyNewYearSendUI.this).post(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(9831180140544L, 73248);
                    w.i("MicroMsg.LuckyMoneyNewYearSendUI", "upload image fail!");
                    if ((LuckyMoneyNewYearSendUI.k(LuckyMoneyNewYearSendUI.this) != null) && (LuckyMoneyNewYearSendUI.k(LuckyMoneyNewYearSendUI.this).isShowing())) {
                      LuckyMoneyNewYearSendUI.k(LuckyMoneyNewYearSendUI.this).hide();
                    }
                    com.tencent.mm.ui.base.h.bm(LuckyMoneyNewYearSendUI.this, LuckyMoneyNewYearSendUI.this.getString(a.i.sVr));
                    GMTrace.o(9831180140544L, 73248);
                  }
                });
                GMTrace.o(9881377570816L, 73622);
              }
            };
            paramAnonymousView.kBG = j.aMf();
            paramAnonymousView.mIR = ((j.a)localObject);
            paramAnonymousView.mIS = str;
            localObject = paramAnonymousView.kBG;
            w.i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: sendImg. imageId:%s", new Object[] { localObject });
            com.tencent.mm.modelcdntran.i locali = new com.tencent.mm.modelcdntran.i();
            locali.eYr = true;
            locali.gAB = paramAnonymousView;
            locali.field_mediaId = ((String)localObject);
            locali.field_fullpath = str;
            locali.field_thumbpath = "";
            locali.field_fileType = b.MediaType_FILE;
            locali.field_talker = "";
            locali.field_priority = b.gzd;
            locali.field_needStorage = false;
            locali.field_isStreamMedia = false;
            locali.field_appType = 0;
            locali.field_bzScene = 0;
            if (!com.tencent.mm.modelcdntran.g.Gk().c(locali)) {
              w.e("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: cdntra addSendTask failed. clientid:%s", new Object[] { localObject });
            }
            GMTrace.o(9819368980480L, 73160);
            return;
          }
          w.i("MicroMsg.LuckyMoneyNewYearSendUI", "to send HB with not image data!");
          LuckyMoneyNewYearSendUI.c(LuckyMoneyNewYearSendUI.this, "");
          LuckyMoneyNewYearSendUI.a(LuckyMoneyNewYearSendUI.this, "");
          LuckyMoneyNewYearSendUI.b(LuckyMoneyNewYearSendUI.this, "");
          LuckyMoneyNewYearSendUI.a(LuckyMoneyNewYearSendUI.this, 0);
          LuckyMoneyNewYearSendUI.g(LuckyMoneyNewYearSendUI.this);
          GMTrace.o(9819368980480L, 73160);
          return;
        }
        if (paramAnonymousView.getId() == a.f.szu)
        {
          LuckyMoneyNewYearSendUI.this.finish();
          com.tencent.mm.plugin.report.service.g.ork.i(13079, new Object[] { Integer.valueOf(6), Integer.valueOf(1) });
          GMTrace.o(9819368980480L, 73160);
          return;
        }
        if ((paramAnonymousView.getId() == a.f.szr) || (paramAnonymousView.getId() == a.f.szt))
        {
          LuckyMoneyNewYearSendUI.l(LuckyMoneyNewYearSendUI.this);
          com.tencent.mm.plugin.report.service.g.ork.i(13079, new Object[] { Integer.valueOf(2), Integer.valueOf(1) });
          GMTrace.o(9819368980480L, 73160);
          return;
        }
        if (paramAnonymousView.getId() == a.f.szv)
        {
          LuckyMoneyNewYearSendUI.a(LuckyMoneyNewYearSendUI.this, "");
          LuckyMoneyNewYearSendUI.b(LuckyMoneyNewYearSendUI.this, "");
          LuckyMoneyNewYearSendUI.a(LuckyMoneyNewYearSendUI.this, 0);
          LuckyMoneyNewYearSendUI.m(LuckyMoneyNewYearSendUI.this);
          com.tencent.mm.plugin.report.service.g.ork.i(13079, new Object[] { Integer.valueOf(3), Integer.valueOf(1) });
          GMTrace.o(9819368980480L, 73160);
          return;
        }
        if (paramAnonymousView.getId() == a.f.szy)
        {
          paramAnonymousView = LuckyMoneyNewYearSendUI.n(LuckyMoneyNewYearSendUI.this);
          paramAnonymousView.mMT = false;
          paramAnonymousView.mMK.setVisibility(0);
          paramAnonymousView.mML.setVisibility(0);
          paramAnonymousView.mMM.setVisibility(0);
          paramAnonymousView.mMN.setVisibility(4);
          paramAnonymousView.mMO.setVisibility(4);
          paramAnonymousView.mMP.setVisibility(4);
          LuckyMoneyNewYearSendUI.o(LuckyMoneyNewYearSendUI.this);
          com.tencent.mm.plugin.report.service.g.ork.i(13079, new Object[] { Integer.valueOf(4), Integer.valueOf(1) });
          GMTrace.o(9819368980480L, 73160);
          return;
        }
        if (paramAnonymousView.getId() == a.f.szw) {
          LuckyMoneyNewYearSendUI.p(LuckyMoneyNewYearSendUI.this);
        }
        GMTrace.o(9819368980480L, 73160);
      }
    };
    GMTrace.o(9844199260160L, 73345);
  }
  
  private void aMO()
  {
    GMTrace.i(9845004566528L, 73351);
    if (this.hul != null)
    {
      if (!this.hul.isShowing())
      {
        this.hul.show();
        GMTrace.o(9845004566528L, 73351);
      }
    }
    else {
      this.hul = com.tencent.mm.wallet_core.ui.g.a(this.vKB.vKW, true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(9790109515776L, 72942);
          if ((LuckyMoneyNewYearSendUI.k(LuckyMoneyNewYearSendUI.this) != null) && (LuckyMoneyNewYearSendUI.k(LuckyMoneyNewYearSendUI.this).isShowing())) {
            LuckyMoneyNewYearSendUI.k(LuckyMoneyNewYearSendUI.this).hide();
          }
          if ((LuckyMoneyNewYearSendUI.q(LuckyMoneyNewYearSendUI.this).getVisibility() == 8) || (LuckyMoneyNewYearSendUI.r(LuckyMoneyNewYearSendUI.this).getVisibility() == 4))
          {
            w.i("MicroMsg.LuckyMoneyNewYearSendUI", "usr cancel, & visibility not visiable, so finish");
            LuckyMoneyNewYearSendUI.this.finish();
          }
          LuckyMoneyNewYearSendUI.this.mMW.aMc();
          GMTrace.o(9790109515776L, 72942);
        }
      });
    }
    GMTrace.o(9845004566528L, 73351);
  }
  
  private void aMP()
  {
    GMTrace.i(9845138784256L, 73352);
    int i;
    if ((this.mJE != null) && (this.mJE.size() > 0))
    {
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xw();
      i = com.tencent.mm.kernel.a.ww();
      int j = this.mJE.size();
      int k = (int)(System.currentTimeMillis() % j);
      i = (new Random(i).nextInt(j) + k) % j;
      w.i("MicroMsg.LuckyMoneyNewYearSendUI", "genRandomAmountIndex retRand:" + i);
    }
    for (;;)
    {
      this.mPD = i;
      if ((this.mPD >= 0) && (this.mPD < this.mJE.size()))
      {
        this.mJy = ((com.tencent.mm.plugin.luckymoney.b.k)this.mJE.get(this.mPD)).mIU;
        this.mJw = ((com.tencent.mm.plugin.luckymoney.b.k)this.mJE.get(this.mPD)).mIV;
      }
      w.i("MicroMsg.LuckyMoneyNewYearSendUI", "mSelectIndex:" + this.mPD + " randomAmount:" + this.mJy + " randomWishing:" + this.mJw);
      this.mOY.BE(com.tencent.mm.wallet_core.ui.e.r(this.mJy / 100.0D));
      this.mOY.a(new LuckyMoneyAutoScrollView.a()
      {
        public final void aMz()
        {
          GMTrace.i(9856144637952L, 73434);
          if (LuckyMoneyNewYearSendUI.s(LuckyMoneyNewYearSendUI.this))
          {
            LuckyMoneyNewYearSendUI.t(LuckyMoneyNewYearSendUI.this).setVisibility(4);
            n.a(LuckyMoneyNewYearSendUI.this.vKB.vKW, LuckyMoneyNewYearSendUI.t(LuckyMoneyNewYearSendUI.this), LuckyMoneyNewYearSendUI.u(LuckyMoneyNewYearSendUI.this));
            AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
            localAlphaAnimation.setDuration(500L);
            localAlphaAnimation.setAnimationListener(new Animation.AnimationListener()
            {
              public final void onAnimationEnd(Animation paramAnonymous2Animation)
              {
                GMTrace.i(9857889468416L, 73447);
                GMTrace.o(9857889468416L, 73447);
              }
              
              public final void onAnimationRepeat(Animation paramAnonymous2Animation)
              {
                GMTrace.i(9857755250688L, 73446);
                GMTrace.o(9857755250688L, 73446);
              }
              
              public final void onAnimationStart(Animation paramAnonymous2Animation)
              {
                GMTrace.i(9857621032960L, 73445);
                LuckyMoneyNewYearSendUI.t(LuckyMoneyNewYearSendUI.this).setVisibility(0);
                GMTrace.o(9857621032960L, 73445);
              }
            });
            LuckyMoneyNewYearSendUI.t(LuckyMoneyNewYearSendUI.this).startAnimation(localAlphaAnimation);
            LuckyMoneyNewYearSendUI.v(LuckyMoneyNewYearSendUI.this);
            GMTrace.o(9856144637952L, 73434);
            return;
          }
          n.a(LuckyMoneyNewYearSendUI.this.vKB.vKW, LuckyMoneyNewYearSendUI.t(LuckyMoneyNewYearSendUI.this), LuckyMoneyNewYearSendUI.u(LuckyMoneyNewYearSendUI.this));
          LuckyMoneyNewYearSendUI.t(LuckyMoneyNewYearSendUI.this).invalidate();
          GMTrace.o(9856144637952L, 73434);
        }
      });
      GMTrace.o(9845138784256L, 73352);
      return;
      w.e("MicroMsg.LuckyMoneyNewYearSendUI", "genRandomAmountIndex yearMessList is empty!");
      i = -1;
    }
  }
  
  private void ar()
  {
    GMTrace.i(9844736131072L, 73349);
    w.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:updateView");
    if ((this.mPi) && (this.mJD == 1))
    {
      w.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:show the picture!");
      this.mPv.setVisibility(8);
      this.mPf.setVisibility(0);
      this.mPe.setVisibility(8);
      if ((this.mJE == null) || (this.mJE.size() <= 0)) {
        break label428;
      }
      w.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:year mess list is valid!");
      this.mPz.setVisibility(0);
      label99:
      if (this.mJD != 1) {
        break label448;
      }
      localLayoutParams = (LinearLayout.LayoutParams)this.mPe.getLayoutParams();
      localLayoutParams.topMargin = getResources().getDimensionPixelOffset(a.d.snB);
      localLayoutParams.bottomMargin = getResources().getDimensionPixelOffset(a.d.snz);
      this.mPe.setLayoutParams(localLayoutParams);
      this.mPe.invalidate();
    }
    for (;;)
    {
      if (!this.mPi) {
        break label505;
      }
      localLayoutParams = (LinearLayout.LayoutParams)this.mMi.getLayoutParams();
      localLayoutParams.bottomMargin = getResources().getDimensionPixelOffset(a.d.snx);
      this.mMi.setLayoutParams(localLayoutParams);
      this.mMi.invalidate();
      this.mMi.setTextSize(1, 17.0F);
      this.mOZ.setTextSize(1, 16.0F);
      this.mOY.cr(getResources().getDimensionPixelOffset(a.d.snF), getResources().getDimensionPixelOffset(a.d.snD));
      localLayoutParams = (LinearLayout.LayoutParams)this.mOY.getLayoutParams();
      localLayoutParams.topMargin = getResources().getDimensionPixelOffset(a.d.snt);
      this.mOY.setLayoutParams(localLayoutParams);
      this.mOY.invalidate();
      localLayoutParams = (LinearLayout.LayoutParams)this.mPz.getLayoutParams();
      localLayoutParams.topMargin = getResources().getDimensionPixelOffset(a.d.snv);
      this.mPz.setLayoutParams(localLayoutParams);
      this.mPz.invalidate();
      GMTrace.o(9844736131072L, 73349);
      return;
      if (this.mJD == 1)
      {
        w.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:show the camera btn!");
        this.mPv.setVisibility(0);
        this.mPf.setVisibility(8);
        this.mPe.setVisibility(0);
        break;
      }
      w.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:show the new year wording!");
      this.mPv.setVisibility(8);
      this.mPf.setVisibility(8);
      this.mPe.setVisibility(0);
      break;
      label428:
      w.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:year mess list is not valid!");
      this.mPz.setVisibility(8);
      break label99;
      label448:
      localLayoutParams = (LinearLayout.LayoutParams)this.mPe.getLayoutParams();
      localLayoutParams.topMargin = getResources().getDimensionPixelOffset(a.d.snA);
      localLayoutParams.bottomMargin = getResources().getDimensionPixelOffset(a.d.sny);
      this.mPe.setLayoutParams(localLayoutParams);
      this.mPe.invalidate();
    }
    label505:
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.mMi.getLayoutParams();
    localLayoutParams.bottomMargin = getResources().getDimensionPixelOffset(a.d.snw);
    this.mMi.setLayoutParams(localLayoutParams);
    this.mMi.invalidate();
    this.mMi.setTextSize(1, 20.0F);
    this.mOZ.setTextSize(1, 18.0F);
    this.mOY.cr(getResources().getDimensionPixelOffset(a.d.snE), getResources().getDimensionPixelOffset(a.d.snC));
    localLayoutParams = (LinearLayout.LayoutParams)this.mOY.getLayoutParams();
    localLayoutParams.topMargin = getResources().getDimensionPixelOffset(a.d.sns);
    this.mOY.setLayoutParams(localLayoutParams);
    this.mOY.invalidate();
    localLayoutParams = (LinearLayout.LayoutParams)this.mPz.getLayoutParams();
    localLayoutParams.topMargin = getResources().getDimensionPixelOffset(a.d.snu);
    this.mPz.setLayoutParams(localLayoutParams);
    this.mPz.invalidate();
    GMTrace.o(9844736131072L, 73349);
  }
  
  protected final void MP()
  {
    GMTrace.i(9844601913344L, 73348);
    sv(8);
    this.mPu = findViewById(a.f.szO);
    this.mOZ = ((TextView)findViewById(a.f.sxA));
    this.mOY = ((LuckyMoneyAutoScrollView)findViewById(a.f.szq));
    this.mMi = ((TextView)findViewById(a.f.szA));
    this.ktP = ((Button)findViewById(a.f.szz));
    this.ktP.setOnClickListener(this.hwh);
    ((ImageView)findViewById(a.f.szu)).setOnClickListener(this.hwh);
    this.mPv = findViewById(a.f.szs);
    this.mPw = ((ImageView)findViewById(a.f.szr));
    this.mPw.setOnClickListener(this.hwh);
    this.mPe = ((ImageView)findViewById(a.f.szB));
    this.mPx = ((TextView)findViewById(a.f.szt));
    this.mPx.setOnClickListener(this.hwh);
    this.mPf = findViewById(a.f.szx);
    this.mPg = ((ImageView)findViewById(a.f.szw));
    this.mPg.setOnClickListener(this.hwh);
    this.mPy = ((ImageView)findViewById(a.f.szv));
    this.mPy.setOnClickListener(this.hwh);
    this.mPz = ((LinearLayout)findViewById(a.f.szy));
    this.mPz.setOnClickListener(this.hwh);
    com.tencent.mm.kernel.h.xz();
    this.mPC = ((String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vtQ, ""));
    com.tencent.mm.kernel.h.xz();
    this.mPj = ((String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vtR, ""));
    com.tencent.mm.kernel.h.xz();
    this.mPk = ((String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vtS, ""));
    com.tencent.mm.kernel.h.xz();
    this.mPl = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vtT, Integer.valueOf(0))).intValue();
    if ((!TextUtils.isEmpty(this.mPC)) && (!TextUtils.isEmpty(this.mPj)) && (!TextUtils.isEmpty(this.mPk)) && (this.mPl > 0))
    {
      this.mPi = true;
      w.i("MicroMsg.LuckyMoneyNewYearSendUI", "last post image data is valid");
    }
    while ((this.mPi) && (!TextUtils.isEmpty(this.mPC)))
    {
      Bitmap localBitmap1 = n.ag(this.mPC, false);
      if (localBitmap1 != null)
      {
        w.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:get crop new year picture is ok!");
        Bitmap localBitmap2 = this.mBitmap;
        this.mBitmap = localBitmap1;
        this.mPg.setImageBitmap(this.mBitmap);
        if ((localBitmap2 != null) && (localBitmap2.isRecycled())) {
          localBitmap2.recycle();
        }
        GMTrace.o(9844601913344L, 73348);
        return;
        w.e("MicroMsg.LuckyMoneyNewYearSendUI", "count not fetch last post image data!");
      }
      else
      {
        w.e("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:get crop new year picture failed!");
        GMTrace.o(9844601913344L, 73348);
        return;
      }
    }
    w.e("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:initPictureImage() mIsShowPic:" + this.mPi + ", mImagePath:" + this.mPC);
    GMTrace.o(9844601913344L, 73348);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(9845273001984L, 73353);
    w.i("MicroMsg.LuckyMoneyNewYearSendUI", "onSceneEnd() errType:" + paramInt1 + " errCode:" + paramInt2 + " errMsg:" + paramString + " netsceneType:" + paramk.getType());
    if ((paramk instanceof v))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (v)paramk;
        this.mJy = paramString.mJy;
        this.mJw = paramString.mJw;
        this.mJD = paramString.mJD;
        this.mJE = paramString.mJE;
        if (this.mJD == 0) {
          w.e("MicroMsg.LuckyMoneyNewYearSendUI", "scenePicSwitch is 0, clear local picture data!");
        }
        for (;;)
        {
          aMP();
          ar();
          sv(0);
          n.a(this.mPu, null);
          GMTrace.o(9845273001984L, 73353);
          return true;
          w.i("MicroMsg.LuckyMoneyNewYearSendUI", "cans how picture!");
        }
      }
      finish();
    }
    for (;;)
    {
      GMTrace.o(9845273001984L, 73353);
      return false;
      if ((paramk instanceof ac))
      {
        if ((this.hul != null) && (this.hul.isShowing())) {
          this.hul.hide();
        }
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          w.i("MicroMsg.LuckyMoneyNewYearSendUI", "send hb success!");
          paramString = (ac)paramk;
          this.mLV = paramString.mJL;
          paramk = new PayInfo();
          paramk.eHG = paramString.mJK;
          paramk.ePL = 37;
          paramk.ePH = this.mChannel;
          com.tencent.mm.pluginsdk.wallet.g.a(this, paramk, 1);
          GMTrace.o(9845273001984L, 73353);
          return true;
        }
        w.e("MicroMsg.LuckyMoneyNewYearSendUI", "send hb failed!");
      }
      else if ((paramk instanceof ad))
      {
        if ((this.hul != null) && (this.hul.isShowing())) {
          this.hul.hide();
        }
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          w.i("MicroMsg.LuckyMoneyNewYearSendUI", "send hb success!");
          paramString = (ad)paramk;
          this.mLV = paramString.mJL;
          paramk = new PayInfo();
          paramk.eHG = paramString.mJK;
          paramk.ePL = 37;
          paramk.ePH = this.mChannel;
          com.tencent.mm.pluginsdk.wallet.g.a(this, paramk, 1);
          GMTrace.o(9845273001984L, 73353);
          return true;
        }
        w.e("MicroMsg.LuckyMoneyNewYearSendUI", "send hb failed!");
      }
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9844870348800L, 73350);
    int i = a.g.sMY;
    GMTrace.o(9844870348800L, 73350);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 0;
    GMTrace.i(9845407219712L, 73354);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(9845407219712L, 73354);
      return;
      if (paramInt2 == -1)
      {
        w.i("MicroMsg.LuckyMoneyNewYearSendUI", "do pay success!");
        com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(15), Integer.valueOf(3), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2) });
        paramInt1 = i;
        if (paramIntent != null)
        {
          paramInt1 = i;
          if (paramIntent.hasExtra("key_realname_guide_helper"))
          {
            paramIntent = (RealnameGuideHelper)paramIntent.getParcelableExtra("key_realname_guide_helper");
            paramInt1 = i;
            if (paramIntent != null) {
              if (paramIntent.b(this, null, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  GMTrace.i(9871982329856L, 73552);
                  LuckyMoneyNewYearSendUI.this.finish();
                  GMTrace.o(9871982329856L, 73552);
                }
              })) {
                break label220;
              }
            }
          }
        }
        label220:
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          com.tencent.mm.ui.base.h.bm(this, getString(a.i.dCJ));
          w.i("MicroMsg.LuckyMoneyNewYearSendUI", "sendLocalMsg() for hb!");
          n.z(this.mLV, this.mPA, 3);
          if (paramInt1 == 0) {
            finish();
          }
          GMTrace.o(9845407219712L, 73354);
          return;
        }
      }
      w.i("MicroMsg.LuckyMoneyNewYearSendUI", "do pay cancel or failed!");
      GMTrace.o(9845407219712L, 73354);
      return;
      if (paramIntent == null)
      {
        w.e("MicroMsg.LuckyMoneyNewYearSendUI", "onActivityResult() data is null for REQUEST_CODE_FROM_PIC");
        GMTrace.o(9845407219712L, 73354);
        return;
      }
      Object localObject;
      if (paramInt2 == -1)
      {
        w.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:select picture is ok!");
        localObject = paramIntent.getStringExtra("CropImage_OutputPath");
        paramIntent = paramIntent.getStringArrayListExtra("CropImage_OutputPath_List");
        if ((!TextUtils.isEmpty((CharSequence)localObject)) || ((paramIntent != null) && (paramIntent.size() > 0)))
        {
          if (!TextUtils.isEmpty((CharSequence)localObject)) {
            w.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:imagePath is valid!");
          }
          for (paramIntent = (Intent)localObject;; paramIntent = (String)paramIntent.get(0))
          {
            w.i("MicroMsg.LuckyMoneyNewYearSendUI", "REQUEST_CODE_FROM_PIC filePath %s", new Object[] { localObject });
            localObject = new Intent();
            ((Intent)localObject).putExtra("CropImageMode", 1);
            ((Intent)localObject).putExtra("CropImage_OutputPath", com.tencent.mm.compatible.util.e.fSi + "temp.avatar");
            ((Intent)localObject).putExtra("CropImage_ImgPath", paramIntent);
            ((Intent)localObject).putExtra("CropImage_Filter", false);
            ((Intent)localObject).putExtra("CropImage_from_scene", 1);
            com.tencent.mm.plugin.luckymoney.a.hnH.a(this, (Intent)localObject, 3);
            GMTrace.o(9845407219712L, 73354);
            return;
            w.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:imagePathList is valid!");
          }
        }
        w.e("MicroMsg.LuckyMoneyNewYearSendUI", "do select picture failed, imagePath and imagePathList is null!");
        GMTrace.o(9845407219712L, 73354);
        return;
      }
      w.i("MicroMsg.LuckyMoneyNewYearSendUI", "do select picture cancel or failed!");
      GMTrace.o(9845407219712L, 73354);
      return;
      if (paramIntent == null)
      {
        w.e("MicroMsg.LuckyMoneyNewYearSendUI", "onActivityResult() data is null for REQUEST_CODE_FROM_CROP");
        GMTrace.o(9845407219712L, 73354);
        return;
      }
      if (paramInt2 == -1)
      {
        w.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:select picture is ok!");
        paramIntent = paramIntent.getStringExtra("CropImage_OutputPath");
        w.i("MicroMsg.LuckyMoneyNewYearSendUI", "new crop image path:" + paramIntent);
        if ((!TextUtils.isEmpty(paramIntent)) && (paramIntent.equals(this.mPC))) {
          w.i("MicroMsg.LuckyMoneyNewYearSendUI", "the path is same as last image");
        }
        for (;;)
        {
          this.mPC = paramIntent;
          paramIntent = n.ag(this.mPC, false);
          if (paramIntent == null) {
            break;
          }
          w.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:get crop new year picture is ok!");
          localObject = this.mBitmap;
          this.mBitmap = paramIntent;
          this.mPg.setImageBitmap(this.mBitmap);
          this.mPi = true;
          ar();
          if ((localObject != null) && (((Bitmap)localObject).isRecycled())) {
            ((Bitmap)localObject).recycle();
          }
          GMTrace.o(9845407219712L, 73354);
          return;
          this.mPj = "";
          this.mPk = "";
          this.mPl = 0;
        }
        w.e("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:get crop new year picture failed!");
        GMTrace.o(9845407219712L, 73354);
        return;
      }
      w.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:do crop image fail for REQUEST_CODE_FROM_CROP");
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9844333477888L, 73346);
    super.onCreate(paramBundle);
    w.i("MicroMsg.LuckyMoneyNewYearSendUI", "lucky send ui create");
    this.mPA = getIntent().getStringExtra("key_username");
    this.mLR = getIntent().getIntExtra("key_way", 0);
    this.mChannel = getIntent().getIntExtra("pay_channel", -1);
    if (bg.nm(this.mPA))
    {
      w.w("MicroMsg.LuckyMoneyNewYearSendUI", "name null finish");
      finish();
    }
    MP();
    l(new v("v1.0"));
    com.tencent.mm.plugin.report.service.g.ork.i(13079, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
    GMTrace.o(9844333477888L, 73346);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(9844467695616L, 73347);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xy().xh().a(w.a.vtQ, this.mPC);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xy().xh().a(w.a.vtR, this.mPj);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xy().xh().a(w.a.vtS, this.mPk);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xy().xh().a(w.a.vtT, Integer.valueOf(this.mPl));
    super.onDestroy();
    if ((this.hul != null) && (this.hul.isShowing())) {
      this.hul.dismiss();
    }
    GMTrace.o(9844467695616L, 73347);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\ui\LuckyMoneyNewYearSendUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */