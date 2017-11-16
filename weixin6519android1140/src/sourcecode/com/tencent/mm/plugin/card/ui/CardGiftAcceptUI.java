package com.tencent.mm.plugin.card.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.ad.k;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.plugin.card.b.d;
import com.tencent.mm.plugin.card.b.m.3;
import com.tencent.mm.plugin.card.model.ag;
import com.tencent.mm.plugin.card.model.m;
import com.tencent.mm.plugin.card.model.q;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;

@com.tencent.mm.ui.base.a(3)
public class CardGiftAcceptUI
  extends MMActivity
  implements View.OnClickListener, com.tencent.mm.ad.e
{
  private final String TAG;
  private String eNE;
  private String eRY;
  private int gjH;
  private String gjI;
  private r hsU;
  private RelativeLayout jFA;
  private ag jFB;
  private q jFC;
  private RelativeLayout jFn;
  private RelativeLayout jFo;
  private ImageView jFp;
  private TextView jFq;
  private TextView jFr;
  private ImageView jFs;
  private Button jFt;
  private LinearLayout jFu;
  private TextView jFv;
  private LinearLayout jFw;
  private TextView jFx;
  private ImageView jFy;
  private ImageView jFz;
  
  public CardGiftAcceptUI()
  {
    GMTrace.i(4986188595200L, 37150);
    this.TAG = "MicroMsg.CardGiftAcceptUI";
    this.hsU = null;
    GMTrace.o(4986188595200L, 37150);
  }
  
  private void alK()
  {
    GMTrace.i(4987128119296L, 37157);
    q localq = new q(this.gjH, this.gjI, this.eNE, Boolean.valueOf(false));
    at.wS().a(localq, 0);
    if (this.hsU != null) {
      this.hsU.show();
    }
    GMTrace.o(4987128119296L, 37157);
  }
  
  private static Drawable b(Drawable paramDrawable, ColorStateList paramColorStateList)
  {
    GMTrace.i(19558744195072L, 145724);
    paramDrawable = android.support.v4.b.a.a.g(paramDrawable);
    android.support.v4.b.a.a.a(paramDrawable, paramColorStateList);
    GMTrace.o(19558744195072L, 145724);
    return paramDrawable;
  }
  
  private void bL(int paramInt1, int paramInt2)
  {
    GMTrace.i(17258520772608L, 128586);
    GradientDrawable localGradientDrawable = new GradientDrawable();
    localGradientDrawable.setColor(paramInt2);
    localGradientDrawable.setStroke(2, paramInt1);
    localGradientDrawable.setCornerRadius(6.0F);
    this.jFt.setBackground(localGradientDrawable);
    GMTrace.o(17258520772608L, 128586);
  }
  
  protected final void MP()
  {
    GMTrace.i(4986725466112L, 37154);
    this.jFn = ((RelativeLayout)findViewById(R.h.bjY));
    this.jFo = ((RelativeLayout)findViewById(R.h.bkf));
    this.jFp = ((ImageView)findViewById(R.h.bkh));
    this.jFq = ((TextView)findViewById(R.h.bki));
    this.jFr = ((TextView)findViewById(R.h.bkd));
    this.jFs = ((ImageView)findViewById(R.h.bJj));
    this.jFt = ((Button)findViewById(R.h.bkk));
    this.jFv = ((TextView)findViewById(R.h.bke));
    this.jFx = ((TextView)findViewById(R.h.bkg));
    this.jFA = ((RelativeLayout)findViewById(R.h.bkj));
    this.jFy = ((ImageView)findViewById(R.h.bkc));
    this.jFz = ((ImageView)findViewById(R.h.cbe));
    this.jFu = ((LinearLayout)findViewById(R.h.bSI));
    this.jFw = ((LinearLayout)findViewById(R.h.cbf));
    this.jFA.setOnClickListener(this);
    this.jFn.setOnClickListener(this);
    this.jFo.setOnClickListener(this);
    this.jFu.setOnClickListener(this);
    this.jFw.setOnClickListener(this);
    this.vKB.hqF.setVisibility(8);
    this.hsU = com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.bKJ), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(4973974781952L, 37059);
        if ((CardGiftAcceptUI.a(CardGiftAcceptUI.this) != null) && (CardGiftAcceptUI.a(CardGiftAcceptUI.this).isShowing())) {
          CardGiftAcceptUI.a(CardGiftAcceptUI.this).dismiss();
        }
        w.i("MicroMsg.CardGiftAcceptUI", "user cancel & finish");
        CardGiftAcceptUI.this.finish();
        GMTrace.o(4973974781952L, 37059);
      }
    });
    ag localag = new ag(this.gjH, this.gjI, this.eNE);
    at.wS().a(localag, 0);
    if (this.hsU != null) {
      this.hsU.show();
    }
    GMTrace.o(4986725466112L, 37154);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(4986993901568L, 37156);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof ag))
      {
        this.jFB = ((ag)paramk);
        w.i("MicroMsg.CardGiftAcceptUI", "ignore:%b", new Object[] { Boolean.valueOf(this.jFB.jAa) });
        if (!this.jFB.jAa)
        {
          if ((this.hsU != null) && (this.hsU.isShowing())) {
            this.hsU.dismiss();
          }
          if (this.jFB == null)
          {
            w.e("MicroMsg.CardGiftAcceptUI", "preAcceptGiftCard is null");
            paramString = this.jFo;
            paramk = new ScaleAnimation(0.0F, 0.96F, 0.0F, 0.96F, 1, 0.5F, 1, 0.5F);
            paramk.setDuration(300L);
            paramk.setInterpolator(new OvershootInterpolator());
            paramk.setFillAfter(true);
            ScaleAnimation localScaleAnimation = new ScaleAnimation(0.96F, 1.0F, 0.96F, 1.0F, 1, 0.5F, 1, 0.5F);
            localScaleAnimation.setDuration(100L);
            localScaleAnimation.setFillAfter(true);
            paramk.setAnimationListener(new m.3(paramString, localScaleAnimation));
            if (paramString != null) {
              paramString.startAnimation(paramk);
            }
            this.vKB.hqF.setVisibility(0);
            GMTrace.o(4986993901568L, 37156);
            return;
          }
          this.jFr.setText(this.jFB.content);
          this.jFq.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, this.jFB.eRY, this.jFq.getTextSize()));
          if (this.jFB.status == 0) {
            if (!bg.nm(this.jFB.jzZ))
            {
              this.jFt.setVisibility(0);
              this.jFt.setText(this.jFB.jzZ);
              this.jFt.setOnClickListener(this);
            }
          }
          for (;;)
          {
            if (!bg.nm(this.jFB.jAd))
            {
              this.jFt.setVisibility(8);
              this.jFw.setVisibility(8);
              this.jFu.setVisibility(0);
              this.jFv.setText(this.jFB.jAd);
            }
            if (!bg.nm(this.jFB.jAe))
            {
              this.jFu.setVisibility(8);
              this.jFw.setVisibility(0);
              this.jFx.setText(this.jFB.jAe);
            }
            if (!bg.nm(this.jFB.jzY))
            {
              paramInt1 = com.tencent.mm.br.a.fromDPToPix(this, 15);
              paramString = new c.a();
              paramString.gKF = com.tencent.mm.compatible.util.e.ghz;
              com.tencent.mm.ao.n.Je();
              paramString.gKX = null;
              paramString.gKE = m.tZ(this.jFB.jzY);
              paramString.gKC = true;
              paramString.gKZ = true;
              paramString.gLa = paramInt1;
              paramString.gKA = true;
              paramString.gKR = R.g.aYg;
              paramString = paramString.Jn();
              com.tencent.mm.ao.n.Jd().a(this.jFB.jzY, this.jFp, paramString);
            }
            if (!bg.nm(this.jFB.jAb)) {
              com.tencent.mm.ao.n.Jd().a(this.jFB.jAb, this.jFs);
            }
            if ((!bg.nm(this.jFB.jAc)) && (this.jFt.getVisibility() == 0))
            {
              paramInt1 = bg.aL(this.jFB.jAc, getResources().getColor(R.e.aNi));
              bL(paramInt1, getResources().getColor(R.e.aNh));
              this.jFt.setTextColor(paramInt1);
            }
            if ((!bg.nm(this.jFB.jAc)) && (this.jFv.getVisibility() == 0))
            {
              paramInt1 = bg.aL(this.jFB.jAc, getResources().getColor(R.e.aNi));
              this.jFv.setTextColor(paramInt1);
              paramInt2 = getResources().getColor(R.e.aNi);
              paramInt1 = paramInt2;
              if (!bg.nm(this.jFB.jAc)) {
                paramInt1 = bg.aL(this.jFB.jAc, paramInt2);
              }
              this.jFy.setImageDrawable(b(this.jFy.getDrawable(), ColorStateList.valueOf(paramInt1)));
            }
            if ((!bg.nm(this.jFB.jAc)) && (this.jFx.getVisibility() == 0))
            {
              paramInt1 = bg.aL(this.jFB.jAc, getResources().getColor(R.e.aNi));
              this.jFx.setTextColor(paramInt1);
              paramInt2 = getResources().getColor(R.e.aNi);
              paramInt1 = paramInt2;
              if (!bg.nm(this.jFB.jAc)) {
                paramInt1 = bg.aL(this.jFB.jAc, paramInt2);
              }
              this.jFz.setImageDrawable(b(this.jFz.getDrawable(), ColorStateList.valueOf(paramInt1)));
              paramString = (ViewGroup.MarginLayoutParams)this.jFt.getLayoutParams();
              paramString.topMargin -= com.tencent.mm.br.a.fromDPToPix(this, 20);
              this.jFt.setLayoutParams(paramString);
            }
            if ((this.jFt.getVisibility() != 0) || (this.jFw.getVisibility() != 8)) {
              break;
            }
            paramString = (ViewGroup.MarginLayoutParams)this.jFt.getLayoutParams();
            paramString.bottomMargin += com.tencent.mm.br.a.fromDPToPix(this, 28);
            this.jFt.setLayoutParams(paramString);
            break;
            this.jFt.setVisibility(0);
            this.jFt.setText(getResources().getString(R.l.dcE));
            this.jFt.setOnClickListener(this);
            continue;
            if ((this.jFB.status != 1) && (this.jFB.status == 2))
            {
              if (!bg.nm(this.jFB.jzZ))
              {
                this.jFt.setVisibility(0);
                this.jFt.setBackgroundDrawable(null);
                this.jFt.setText(this.jFB.jzZ);
                this.jFt.setTextColor(getResources().getColor(R.e.black));
                this.jFt.setTextSize(1, 17.0F);
                this.jFt.setOnClickListener(null);
              }
              else
              {
                this.jFt.setVisibility(8);
                this.jFt.setOnClickListener(null);
              }
            }
            else
            {
              this.jFt.setVisibility(8);
              this.jFt.setOnClickListener(null);
            }
          }
        }
        w.i("MicroMsg.CardGiftAcceptUI", "NetScenePreAcceptGiftCard ignore is true~so ignore it");
        alK();
        GMTrace.o(4986993901568L, 37156);
        return;
      }
      if ((paramk instanceof q))
      {
        if ((this.hsU != null) && (this.hsU.isShowing())) {
          this.hsU.dismiss();
        }
        w.i("MicroMsg.CardGiftAcceptUI", "accept gift card is success!");
        this.jFC = ((q)paramk);
        paramString = new Intent(this, CardGiftReceiveUI.class);
        paramString.putExtra("key_order_id", this.gjI);
        paramString.putExtra("key_biz_uin", this.gjH);
        paramString.putExtra("key_gift_into", this.jFC.jzJ);
        if (!bg.nm(this.eNE)) {}
        for (boolean bool = true;; bool = false)
        {
          paramString.putExtra("key_from_group_chat_room", bool);
          startActivity(paramString);
          finish();
          GMTrace.o(4986993901568L, 37156);
          return;
        }
      }
    }
    else
    {
      if ((this.hsU != null) && (this.hsU.isShowing())) {
        this.hsU.dismiss();
      }
      if ((paramk instanceof ag))
      {
        w.e("MicroMsg.CardGiftAcceptUI", "NetSceneGetCardGiftInfo onSceneEnd fail, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
        d.a(this, paramString, true);
        GMTrace.o(4986993901568L, 37156);
        return;
      }
      if ((paramk instanceof q))
      {
        w.e("MicroMsg.CardGiftAcceptUI", "NetSceneGetCardGiftInfo onSceneEnd fail, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
        d.a(this, paramString, true);
      }
    }
    GMTrace.o(4986993901568L, 37156);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4986322812928L, 37151);
    int i = R.i.cqU;
    GMTrace.o(4986322812928L, 37151);
    return i;
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(4986859683840L, 37155);
    if ((paramView.getId() == R.h.bkk) || (paramView.getId() == R.h.bSI))
    {
      if (this.jFt.getVisibility() == 0)
      {
        int i = bg.aL(this.jFB.jAc, getResources().getColor(R.e.aNi));
        bL(i, i);
        this.jFt.setTextColor(getResources().getColor(R.e.white));
      }
      alK();
      if (!bg.nm(this.eRY))
      {
        g.ork.i(13866, new Object[] { Integer.valueOf(2), this.gjI, o.getString(this.gjH), this.eRY });
        GMTrace.o(4986859683840L, 37155);
      }
    }
    else
    {
      if (paramView.getId() == R.h.bkj)
      {
        finish();
        GMTrace.o(4986859683840L, 37155);
        return;
      }
      if (paramView.getId() == R.h.bjY)
      {
        finish();
        GMTrace.o(4986859683840L, 37155);
        return;
      }
      if (paramView.getId() == R.h.cbf)
      {
        paramView = new q(this.gjH, this.gjI, this.eNE, Boolean.valueOf(true));
        at.wS().a(paramView, 0);
        if (this.hsU != null) {
          this.hsU.show();
        }
      }
    }
    GMTrace.o(4986859683840L, 37155);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4986457030656L, 37152);
    super.onCreate(paramBundle);
    this.gjI = getIntent().getStringExtra("key_order_id");
    this.gjH = getIntent().getIntExtra("key_biz_uin", -1);
    this.eRY = getIntent().getStringExtra("key_from_user_name");
    this.eNE = getIntent().getStringExtra("key_chatroom_name");
    w.i("MicroMsg.CardGiftAcceptUI", "onCreate, orderId:%s, bizUin:%s, fromUserName:%s", new Object[] { this.gjI, Integer.valueOf(this.gjH), this.eRY });
    if (this.gjH == -1)
    {
      w.e("MicroMsg.CardGiftAcceptUI", "bizUin is -1, fail!");
      d.a(this, "", true);
      GMTrace.o(4986457030656L, 37152);
      return;
    }
    if (this.gjI == null)
    {
      w.e("MicroMsg.CardGiftAcceptUI", "orderId is null, fail");
      d.a(this, "", true);
      GMTrace.o(4986457030656L, 37152);
      return;
    }
    if (!bg.nm(this.eRY)) {
      g.ork.i(13866, new Object[] { Integer.valueOf(1), this.gjI, o.getString(this.gjH), this.eRY });
    }
    MP();
    at.wS().a(1171, this);
    at.wS().a(1136, this);
    GMTrace.o(4986457030656L, 37152);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(4986591248384L, 37153);
    super.onDestroy();
    at.wS().b(1171, this);
    at.wS().b(1136, this);
    GMTrace.o(4986591248384L, 37153);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(4987262337024L, 37158);
    if (paramInt == 4)
    {
      w.e("MicroMsg.CardGiftAcceptUI", "onKeyDown finishUI");
      if ((this.hsU != null) && (this.hsU.isShowing())) {
        this.hsU.dismiss();
      }
      finish();
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(4987262337024L, 37158);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\card\ui\CardGiftAcceptUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */