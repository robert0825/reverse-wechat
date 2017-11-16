package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.plugin.sns.ui.a.a.c;
import com.tencent.mm.protocal.c.bfh;

public final class bh
{
  Context mContext;
  LinearLayout pYH;
  LinearLayout pYI;
  int pnx;
  FrameLayout pxF;
  private av pyk;
  SnsCommentShowAbLayout qkd;
  
  public bh(Context paramContext, av paramav, FrameLayout paramFrameLayout)
  {
    GMTrace.i(8715428167680L, 64935);
    this.qkd = null;
    this.pnx = -1;
    this.mContext = paramContext;
    this.pyk = paramav;
    this.pxF = paramFrameLayout;
    GMTrace.o(8715428167680L, 64935);
  }
  
  public final boolean bnb()
  {
    GMTrace.i(8715696603136L, 64937);
    if (this.qkd != null)
    {
      this.pxF.removeView(this.qkd);
      this.qkd = null;
      GMTrace.o(8715696603136L, 64937);
      return true;
    }
    GMTrace.o(8715696603136L, 64937);
    return false;
  }
  
  public final void c(View paramView1, View paramView2)
  {
    GMTrace.i(16046534688768L, 119556);
    paramView1 = (a.c)paramView1.getTag();
    Object localObject3 = ae.bjd().Is(paramView1.eEM);
    Object localObject1;
    Object localObject2;
    int i;
    if (localObject3 != null)
    {
      localObject1 = com.tencent.mm.modelsns.b.ha(740);
      localObject2 = ai.n((m)localObject3);
      localObject3 = ((com.tencent.mm.modelsns.b)localObject1).lu(i.g((m)localObject3)).hd(((m)localObject3).field_type).bC(((m)localObject3).uX(32)).lu(((m)localObject3).bmi()).lu(((m)localObject3).field_userName);
      if (localObject2 == null)
      {
        i = 0;
        localObject3 = ((com.tencent.mm.modelsns.b)localObject3).hd(i);
        if (localObject2 != null) {
          break label458;
        }
        i = 0;
        label116:
        ((com.tencent.mm.modelsns.b)localObject3).hd(i);
        ((com.tencent.mm.modelsns.b)localObject1).LR();
      }
    }
    else
    {
      paramView2.setVisibility(0);
      paramView2.startAnimation(this.pyk.pYF);
      this.pYH = ((LinearLayout)paramView2.findViewById(i.f.oZp));
      this.pYH.setOnClickListener(this.pyk.pxE.qmB);
      this.pYH.setOnTouchListener(this.pyk.pSw);
      this.pYI = ((LinearLayout)paramView2.findViewById(i.f.oZH));
      this.pYI.setOnClickListener(this.pyk.pxE.qmC);
      this.pYI.setOnTouchListener(this.pyk.pSw);
      this.pYI.setTag(paramView1);
      this.pYH.setTag(paramView1);
      paramView2 = (ImageView)this.pYI.findViewById(i.f.oZG);
      localObject1 = (ImageView)this.pYH.findViewById(i.f.oZh);
      localObject2 = (TextView)this.pYI.findViewById(i.f.oZI);
      localObject3 = (TextView)this.pYH.findViewById(i.f.oZq);
      if (!u.IP(paramView1.eUg)) {
        break label485;
      }
      this.pYH.setEnabled(false);
      this.pYI.setEnabled(false);
      ((TextView)localObject3).setTextColor(this.mContext.getResources().getColor(i.c.oXd));
      if (paramView1.jHw != 11) {
        break label467;
      }
      paramView2.setImageResource(i.i.pgZ);
      ((ImageView)localObject1).setImageResource(i.i.phc);
      label378:
      ((TextView)localObject2).setText(this.mContext.getString(i.j.pjT));
      ((TextView)localObject2).setTextColor(this.mContext.getResources().getColor(i.c.oXd));
    }
    for (;;)
    {
      if (paramView1.jHw == 11)
      {
        this.pYI.setBackgroundResource(i.e.oXR);
        this.pYH.setBackgroundResource(i.e.oXS);
      }
      GMTrace.o(16046534688768L, 119556);
      return;
      i = ((bfh)localObject2).uQO;
      break;
      label458:
      i = ((bfh)localObject2).uQR;
      break label116;
      label467:
      paramView2.setImageResource(i.i.phb);
      ((ImageView)localObject1).setImageResource(i.i.phd);
      break label378;
      label485:
      this.pYH.setEnabled(true);
      if (paramView1.jHw == 11)
      {
        paramView2.setImageResource(i.e.oXP);
        ((ImageView)localObject1).setImageResource(i.e.oXQ);
        ((TextView)localObject2).setTextColor(this.mContext.getResources().getColor(i.c.oXe));
        ((TextView)localObject3).setTextColor(this.mContext.getResources().getColor(i.c.oXe));
      }
      for (;;)
      {
        this.pYI.setEnabled(true);
        if (paramView1.qkW != 0) {
          break label632;
        }
        ((TextView)localObject2).setText(this.mContext.getString(i.j.pjT));
        break;
        paramView2.setImageResource(i.e.oXH);
        ((TextView)localObject2).setTextColor(this.mContext.getResources().getColor(i.c.white));
        ((TextView)localObject3).setTextColor(this.mContext.getResources().getColor(i.c.white));
      }
      label632:
      ((TextView)localObject2).setText(this.mContext.getString(i.j.pjt));
    }
  }
  
  final void cE(final View paramView)
  {
    GMTrace.i(8715562385408L, 64936);
    paramView.clearAnimation();
    paramView.startAnimation(this.pyk.pYG);
    this.pyk.pYG.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8546448048128L, 63676);
        if (paramView != null)
        {
          paramView.setVisibility(8);
          bh.this.bnb();
        }
        GMTrace.o(8546448048128L, 63676);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8546313830400L, 63675);
        GMTrace.o(8546313830400L, 63675);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8546179612672L, 63674);
        GMTrace.o(8546179612672L, 63674);
      }
    });
    GMTrace.o(8715562385408L, 64936);
  }
  
  final class a
  {
    View pmD;
    String pxZ;
    
    public a(String paramString, View paramView)
    {
      GMTrace.i(8657982980096L, 64507);
      this.pmD = null;
      this.pxZ = paramString;
      this.pmD = paramView;
      GMTrace.o(8657982980096L, 64507);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */