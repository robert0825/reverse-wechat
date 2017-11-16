package com.tencent.mm.plugin.luckymoney.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.plugin.luckymoney.b.ab;
import com.tencent.mm.plugin.luckymoney.b.i;
import com.tencent.mm.plugin.luckymoney.b.j;
import com.tencent.mm.plugin.luckymoney.b.j.a;
import com.tencent.mm.plugin.luckymoney.b.n;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wallet_core.id_verify.util.a.a;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.q;
import java.io.File;

@com.tencent.mm.ui.base.a(3)
public class LuckyMoneyNewYearReceiveUI
  extends LuckyMoneyBaseUI
{
  private r hsU;
  private String imagePath;
  private ImageView jXQ;
  private com.tencent.mm.sdk.platformtools.ae mHandler;
  private int mJD;
  private TextView mMi;
  private View mMn;
  private String mMo;
  private LuckyMoneyAutoScrollView mOY;
  private TextView mOZ;
  private TextView mPa;
  private LinearLayout mPb;
  private TextView mPc;
  private ImageView mPd;
  private ImageView mPe;
  private View mPf;
  private ImageView mPg;
  private boolean mPh;
  private boolean mPi;
  private String mPj;
  private String mPk;
  private int mPl;
  private j mPm;
  private boolean mPn;
  
  public LuckyMoneyNewYearReceiveUI()
  {
    GMTrace.i(9875337773056L, 73577);
    this.hsU = null;
    this.mPh = false;
    this.mJD = 0;
    this.mPi = false;
    this.mPj = "";
    this.mPk = "";
    this.imagePath = "";
    this.mHandler = new com.tencent.mm.sdk.platformtools.ae();
    this.mPn = false;
    GMTrace.o(9875337773056L, 73577);
  }
  
  private void a(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(9876277297152L, 73584);
    b(new ab(paramInt1, paramInt2, paramString1, paramString2, n.aMg(), q.zG(), getIntent().getStringExtra("key_username"), "v1.0", paramString3), false);
    GMTrace.o(9876277297152L, 73584);
  }
  
  private void aMN()
  {
    GMTrace.i(9876008861696L, 73582);
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9834267148288L, 73271);
        if (!new File(LuckyMoneyNewYearReceiveUI.h(LuckyMoneyNewYearReceiveUI.this)).exists())
        {
          w.e("MicroMsg.LuckyMoneyNewYearReceiveUI", "ljd:updateImageView() imagePath:" + LuckyMoneyNewYearReceiveUI.h(LuckyMoneyNewYearReceiveUI.this) + " is not exist!");
          GMTrace.o(9834267148288L, 73271);
          return;
        }
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(9860036952064L, 73463);
            LuckyMoneyNewYearReceiveUI.i(LuckyMoneyNewYearReceiveUI.this).setImageBitmap(this.liz);
            GMTrace.o(9860036952064L, 73463);
          }
          
          public final String toString()
          {
            GMTrace.i(9860171169792L, 73464);
            String str = super.toString() + "|renderView";
            GMTrace.o(9860171169792L, 73464);
            return str;
          }
        });
        GMTrace.o(9834267148288L, 73271);
      }
    });
    GMTrace.o(9876008861696L, 73582);
  }
  
  protected final void MP()
  {
    GMTrace.i(9875874643968L, 73581);
    this.mMn = findViewById(a.f.szH);
    this.mOY = ((LuckyMoneyAutoScrollView)findViewById(a.f.szC));
    this.mOZ = ((TextView)findViewById(a.f.sxA));
    this.mMi = ((TextView)findViewById(a.f.szN));
    this.jXQ = ((ImageView)findViewById(a.f.szD));
    this.mPb = ((LinearLayout)findViewById(a.f.szL));
    this.mPc = ((TextView)findViewById(a.f.szJ));
    this.mPd = ((ImageView)findViewById(a.f.szK));
    this.mPa = ((TextView)findViewById(a.f.szM));
    this.mPe = ((ImageView)findViewById(a.f.szB));
    this.mPf = findViewById(a.f.szx);
    this.mPg = ((ImageView)findViewById(a.f.szw));
    this.mPg.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9789841080320L, 72940);
        LuckyMoneyNewYearReceiveUI.a(LuckyMoneyNewYearReceiveUI.this);
        GMTrace.o(9789841080320L, 72940);
      }
    });
    ((ImageView)findViewById(a.f.szE)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9811584352256L, 73102);
        LuckyMoneyNewYearReceiveUI.this.finish();
        com.tencent.mm.plugin.report.service.g.ork.i(13079, new Object[] { Integer.valueOf(6), Integer.valueOf(2) });
        GMTrace.o(9811584352256L, 73102);
      }
    });
    sv(8);
    this.hsU = com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(a.i.bKJ), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(9866882056192L, 73514);
        if ((LuckyMoneyNewYearReceiveUI.b(LuckyMoneyNewYearReceiveUI.this) != null) && (LuckyMoneyNewYearReceiveUI.b(LuckyMoneyNewYearReceiveUI.this).isShowing())) {
          LuckyMoneyNewYearReceiveUI.b(LuckyMoneyNewYearReceiveUI.this).dismiss();
        }
        LuckyMoneyNewYearReceiveUI.this.mMW.aMc();
        if ((LuckyMoneyNewYearReceiveUI.c(LuckyMoneyNewYearReceiveUI.this).getVisibility() == 8) || (LuckyMoneyNewYearReceiveUI.d(LuckyMoneyNewYearReceiveUI.this).getVisibility() == 4))
        {
          w.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "usr cancel, & visibility not visiable, so finish");
          LuckyMoneyNewYearReceiveUI.this.finish();
        }
        GMTrace.o(9866882056192L, 73514);
      }
    });
    GMTrace.o(9875874643968L, 73581);
  }
  
  public final boolean d(int paramInt1, int paramInt2, final String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(9876143079424L, 73583);
    label249:
    label348:
    boolean bool;
    if ((paramk instanceof com.tencent.mm.plugin.luckymoney.b.ae))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (com.tencent.mm.plugin.luckymoney.b.ae)paramk;
        this.mJD = paramString.mJD;
        if (this.mJD == 1)
        {
          w.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "download image data!");
          if (TextUtils.isEmpty(this.mPk)) {
            w.e("MicroMsg.LuckyMoneyNewYearReceiveUI", "imageaeskey is empty!");
          }
          if ((TextUtils.isEmpty(this.mPj)) || (TextUtils.isEmpty(this.mPk)) || (this.mPl <= 0))
          {
            w.e("MicroMsg.LuckyMoneyNewYearReceiveUI", "ljd:doDownloadImage() the parameter is illegeal!");
            if (!paramString.aMj()) {
              break label817;
            }
            this.mPh = true;
            w.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "is Sender hb!");
            a.b.n(this.jXQ, q.zE());
            findViewById(a.f.szI).setVisibility(8);
            findViewById(a.f.szB).setVisibility(0);
            if ((paramString.aMj()) || (paramString.eYo != 0) || (paramString.eYn == 4) || (paramString.eYn == 5) || (paramString.eYn == 1)) {
              break label937;
            }
            if (!"0".equals(paramString.mJp)) {
              break label910;
            }
            com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, this.mMW, paramString.mJq, paramString.mJr, paramString.mJs, paramString.mJt, new a.a()
            {
              public final boolean a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, boolean paramAnonymousBoolean)
              {
                GMTrace.i(9878424780800L, 73600);
                w.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "showDisclaimerDialog resultCode=" + paramAnonymousInt1 + ";errCode=" + paramAnonymousInt2 + ";errMsg=" + paramAnonymousString + ";hadAgree = " + paramAnonymousBoolean);
                if (paramAnonymousInt1 == 1) {
                  LuckyMoneyNewYearReceiveUI.this.finish();
                }
                for (;;)
                {
                  GMTrace.o(9878424780800L, 73600);
                  return true;
                  if (paramAnonymousInt1 == 2) {
                    LuckyMoneyNewYearReceiveUI.a(LuckyMoneyNewYearReceiveUI.this, paramString.msgType, paramString.eqV, paramString.mFr, paramString.eYm, paramString.mJV);
                  } else if ((paramAnonymousInt1 == 0) && (paramAnonymousBoolean)) {
                    LuckyMoneyNewYearReceiveUI.a(LuckyMoneyNewYearReceiveUI.this, paramString.msgType, paramString.eqV, paramString.mFr, paramString.eYm, paramString.mJV);
                  }
                }
              }
            }, true, 1005);
            w.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "scenePicSwitch:" + this.mJD + ", imageId:" + this.mPj + ", imageLength:" + this.mPl);
            if ((this.mJD != 1) || (TextUtils.isEmpty(this.mPj)) || (TextUtils.isEmpty(this.mPk)) || (this.mPl <= 0)) {
              break label1169;
            }
            this.mPi = true;
            w.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "show the picture!");
            bool = true;
            if ((paramString.eYn == 5) || (paramString.eYn == 1)) {
              bool = false;
            }
            w.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "receiveScene.hbStatus is " + paramString.eYn + ", isValidStatus is " + bool);
            if ((!this.mPi) || (!bool)) {
              break label1185;
            }
            this.mPf.setVisibility(0);
            this.mPe.setVisibility(8);
            label435:
            if ((!this.mPi) || (!bool)) {
              break label1205;
            }
            paramString = (LinearLayout.LayoutParams)this.mMi.getLayoutParams();
            paramString.bottomMargin = getResources().getDimensionPixelOffset(a.d.snx);
            this.mMi.setLayoutParams(paramString);
            this.mMi.invalidate();
            this.mMi.setTextSize(1, 17.0F);
            this.mOZ.setTextSize(1, 16.0F);
            this.mOY.cr(getResources().getDimensionPixelOffset(a.d.snF), getResources().getDimensionPixelOffset(a.d.snD));
            paramString = (LinearLayout.LayoutParams)this.mOY.getLayoutParams();
            paramString.topMargin = getResources().getDimensionPixelOffset(a.d.snt);
            this.mOY.setLayoutParams(paramString);
            this.mOY.invalidate();
            label576:
            if (!this.mPh) {
              break label1354;
            }
            paramString = (LinearLayout.LayoutParams)this.mPb.getLayoutParams();
            if (!this.mPi) {
              break label1337;
            }
            paramString.topMargin = getResources().getDimensionPixelOffset(a.d.snH);
            label615:
            this.mPb.setLayoutParams(paramString);
            this.mPb.invalidate();
            this.mPc.setTextSize(1, 18.0F);
          }
        }
        for (;;)
        {
          GMTrace.o(9876143079424L, 73583);
          return true;
          w.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "ljd:doDownloadImage()!");
          if (this.mPm == null) {
            this.mPm = new j();
          }
          this.imagePath = (n.BD(this.mPj) + ".temp");
          if (!new File(this.imagePath).exists())
          {
            w.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "ljd:updateImageView() imagePath:" + this.imagePath + " is not exist!");
            this.mPm.a(this.mPj, this.mPk, this.mPl, this.imagePath, new j.a()
            {
              public final void a(final keep_SceneResult paramAnonymouskeep_SceneResult, String paramAnonymousString, final boolean paramAnonymousBoolean)
              {
                GMTrace.i(9859231645696L, 73457);
                LuckyMoneyNewYearReceiveUI.g(LuckyMoneyNewYearReceiveUI.this).post(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(9821248028672L, 73174);
                    if (paramAnonymousBoolean)
                    {
                      w.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "the download image data is success!");
                      if ((!TextUtils.isEmpty(paramAnonymouskeep_SceneResult.field_fileId)) && (paramAnonymouskeep_SceneResult.field_fileId.equals(LuckyMoneyNewYearReceiveUI.e(LuckyMoneyNewYearReceiveUI.this))))
                      {
                        LuckyMoneyNewYearReceiveUI.f(LuckyMoneyNewYearReceiveUI.this);
                        GMTrace.o(9821248028672L, 73174);
                      }
                    }
                    else
                    {
                      w.e("MicroMsg.LuckyMoneyNewYearReceiveUI", "download image fail!");
                      com.tencent.mm.ui.base.h.bm(LuckyMoneyNewYearReceiveUI.this, LuckyMoneyNewYearReceiveUI.this.getString(a.i.sUh));
                    }
                    GMTrace.o(9821248028672L, 73174);
                  }
                });
                GMTrace.o(9859231645696L, 73457);
              }
            });
            break;
          }
          w.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "ljd:imagePath file is exist! update image");
          aMN();
          break;
          w.e("MicroMsg.LuckyMoneyNewYearReceiveUI", "not to download image data!");
          break;
          label817:
          w.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "is receiver hb!");
          if (!TextUtils.isEmpty(getIntent().getStringExtra("key_username"))) {
            a.b.n(this.jXQ, getIntent().getStringExtra("key_username"));
          }
          for (;;)
          {
            n.a(this.vKB.vKW, this.mPa, paramString.mJR);
            this.mPh = false;
            break;
            if (!TextUtils.isEmpty(paramString.mIh)) {
              n.a(this.jXQ, paramString.mIh, paramString.mIB);
            }
          }
          label910:
          a(paramString.msgType, paramString.eqV, paramString.mFr, paramString.eYm, paramString.mJV);
          break label249;
          label937:
          if ((this.hsU != null) && (this.hsU.isShowing())) {
            this.hsU.hide();
          }
          if (paramString.eYn != 5)
          {
            this.mOY.BE(com.tencent.mm.wallet_core.ui.e.r(paramString.mJS / 100.0D));
            paramk = this.mOY;
            paramk.mMK.setVisibility(8);
            paramk.mML.setVisibility(8);
            paramk.mMM.setVisibility(8);
            paramk.mMN.setVisibility(0);
            paramk.mMO.setVisibility(0);
            paramk.mMP.setVisibility(0);
            n.a(this.vKB.vKW, this.mMi, paramString.mIf);
            this.mPc.setText(paramString.mIc);
            if ((paramString.eYn == 4) && (!TextUtils.isEmpty(paramString.mIc))) {
              this.mPd.setVisibility(8);
            }
          }
          for (;;)
          {
            sv(0);
            n.a(this.mMn, null);
            break;
            findViewById(a.f.szF).setVisibility(8);
            ((TextView)findViewById(a.f.szG)).setText(paramString.mIc);
            ((TextView)findViewById(a.f.szG)).setVisibility(0);
          }
          label1169:
          this.mPi = false;
          w.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "don't show the picture!");
          break label348;
          label1185:
          this.mPf.setVisibility(8);
          this.mPe.setVisibility(0);
          break label435;
          label1205:
          paramString = (LinearLayout.LayoutParams)this.mMi.getLayoutParams();
          paramString.bottomMargin = getResources().getDimensionPixelOffset(a.d.snw);
          this.mMi.setLayoutParams(paramString);
          this.mMi.invalidate();
          this.mMi.setTextSize(1, 20.0F);
          this.mOZ.setTextSize(1, 18.0F);
          this.mOY.cr(getResources().getDimensionPixelOffset(a.d.snE), getResources().getDimensionPixelOffset(a.d.snC));
          paramString = (LinearLayout.LayoutParams)this.mOY.getLayoutParams();
          paramString.topMargin = getResources().getDimensionPixelOffset(a.d.sns);
          this.mOY.setLayoutParams(paramString);
          this.mOY.invalidate();
          break label576;
          label1337:
          paramString.topMargin = getResources().getDimensionPixelOffset(a.d.snI);
          break label615;
          label1354:
          paramString = (LinearLayout.LayoutParams)this.mPb.getLayoutParams();
          paramString.topMargin = getResources().getDimensionPixelOffset(a.d.snG);
          this.mPb.setLayoutParams(paramString);
          this.mPb.invalidate();
          this.mPc.setTextSize(1, 12.0F);
        }
      }
      if ((this.hsU != null) && (this.hsU.isShowing())) {
        this.hsU.hide();
      }
      GMTrace.o(9876143079424L, 73583);
      return false;
    }
    if ((paramk instanceof ab))
    {
      if ((this.hsU != null) && (this.hsU.isShowing())) {
        this.hsU.hide();
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (ab)paramk;
        paramk = paramString.mJj;
        this.mPc.setText(paramString.mJj.mIc);
        this.mOY.BE(com.tencent.mm.wallet_core.ui.e.r(paramString.mJj.eYB / 100.0D));
        this.mOY.a(new LuckyMoneyAutoScrollView.a()
        {
          public final void aMz()
          {
            GMTrace.i(9838159462400L, 73300);
            LuckyMoneyNewYearReceiveUI.j(LuckyMoneyNewYearReceiveUI.this).setVisibility(4);
            n.a(LuckyMoneyNewYearReceiveUI.this.vKB.vKW, LuckyMoneyNewYearReceiveUI.j(LuckyMoneyNewYearReceiveUI.this), paramString.mJj.mIf);
            AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
            localAlphaAnimation.setDuration(500L);
            localAlphaAnimation.setAnimationListener(new Animation.AnimationListener()
            {
              public final void onAnimationEnd(Animation paramAnonymous2Animation)
              {
                GMTrace.i(9871713894400L, 73550);
                if (com.tencent.mm.k.g.ut().getInt("PlayCoinSound", 0) > 0) {
                  k.C(LuckyMoneyNewYearReceiveUI.this, a.i.sTY);
                }
                if (LuckyMoneyNewYearReceiveUI.7.this.mMu.mJk != null) {
                  LuckyMoneyNewYearReceiveUI.7.this.mMu.mJk.b(LuckyMoneyNewYearReceiveUI.this, null, null);
                }
                GMTrace.o(9871713894400L, 73550);
              }
              
              public final void onAnimationRepeat(Animation paramAnonymous2Animation)
              {
                GMTrace.i(9871579676672L, 73549);
                GMTrace.o(9871579676672L, 73549);
              }
              
              public final void onAnimationStart(Animation paramAnonymous2Animation)
              {
                GMTrace.i(9871445458944L, 73548);
                LuckyMoneyNewYearReceiveUI.j(LuckyMoneyNewYearReceiveUI.this).setVisibility(0);
                GMTrace.o(9871445458944L, 73548);
              }
            });
            LuckyMoneyNewYearReceiveUI.j(LuckyMoneyNewYearReceiveUI.this).startAnimation(localAlphaAnimation);
            GMTrace.o(9838159462400L, 73300);
          }
        });
        if ((paramk.eYn == 4) && (!TextUtils.isEmpty(paramString.mJj.mIc))) {
          this.mPd.setVisibility(8);
        }
        sv(0);
        n.a(this.mMn, null);
        GMTrace.o(9876143079424L, 73583);
        return true;
      }
      if (paramInt2 == 416)
      {
        if ((this.hsU != null) && (this.hsU.isShowing())) {
          this.hsU.hide();
        }
        this.mPn = true;
        paramString = new Bundle();
        paramString.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyNewYearReceiveUI");
        paramString.putString("realname_verify_process_jump_plugin", "luckymoney");
        bool = n.a(this, paramInt2, paramk, paramString, true, null, null, 1004);
        GMTrace.o(9876143079424L, 73583);
        return bool;
      }
    }
    GMTrace.o(9876143079424L, 73583);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9876411514880L, 73585);
    int i = a.g.sMZ;
    GMTrace.o(9876411514880L, 73585);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9875471990784L, 73578);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("key_native_url");
    this.mPj = getIntent().getStringExtra("key_image_id");
    this.mPk = getIntent().getStringExtra("key_image_aes_key");
    this.mPl = getIntent().getIntExtra("key_image_length", 0);
    w.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "imageId:" + this.mPj + ", imageLength:" + this.mPl);
    Uri localUri = Uri.parse(bg.nl(paramBundle));
    try
    {
      this.mMo = localUri.getQueryParameter("sendid");
      MP();
      if (!bg.nm(this.mMo))
      {
        b(new com.tencent.mm.plugin.luckymoney.b.ae(bg.getInt(localUri.getQueryParameter("channelid"), 1), this.mMo, paramBundle, 1, "v1.0"), false);
        if (this.hsU != null) {
          this.hsU.show();
        }
        GMTrace.o(9875471990784L, 73578);
        return;
      }
      finish();
      w.w("MicroMsg.LuckyMoneyNewYearReceiveUI", "sendid null & finish");
      GMTrace.o(9875471990784L, 73578);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(9875740426240L, 73580);
    super.onDestroy();
    if ((this.hsU != null) && (this.hsU.isShowing())) {
      this.hsU.dismiss();
    }
    GMTrace.o(9875740426240L, 73580);
  }
  
  protected void onResume()
  {
    GMTrace.i(9875606208512L, 73579);
    super.onResume();
    if (this.mPn) {
      finish();
    }
    GMTrace.o(9875606208512L, 73579);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\ui\LuckyMoneyNewYearReceiveUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */