package com.tencent.mm.plugin.sns.ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ao;
import com.tencent.mm.plugin.sns.model.ao.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.tools.j;

public class SnsTranslateResultView
  extends LinearLayout
{
  private static final int qiv;
  private Drawable gKU;
  public TextView oyB;
  private TextView qit;
  public View qiu;
  private int qiw;
  private float qix;
  private int qiy;
  
  static
  {
    GMTrace.i(8638655627264L, 64363);
    qiv = Color.parseColor("#19000000");
    GMTrace.o(8638655627264L, 64363);
  }
  
  public SnsTranslateResultView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8637984538624L, 64358);
    this.qiw = -1;
    this.qix = -1.0F;
    this.qiy = -1;
    LayoutInflater.from(getContext()).inflate(i.g.pgJ, this);
    this.qit = ((TextView)findViewById(i.f.pee));
    this.oyB = ((TextView)findViewById(i.f.pef));
    this.qiu = findViewById(i.f.peq);
    this.gKU = getResources().getDrawable(i.e.oYx);
    this.gKU.setBounds(0, 0, (int)(this.oyB.getTextSize() * 0.8F), (int)(this.oyB.getTextSize() * 0.8F));
    this.gKU.setColorFilter(qiv, PorterDuff.Mode.SRC_IN);
    GMTrace.o(8637984538624L, 64358);
  }
  
  @TargetApi(11)
  public final void a(final ao.b paramb, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    GMTrace.i(8638521409536L, 64362);
    this.qiw = paramInt;
    if ((this.qix == -1.0F) && (this.qiy == -1)) {
      if (this.qiw == 2)
      {
        this.oyB.setTextSize(1, 14.0F * a.dZ(getContext()));
        if (this.qiw != 2) {
          break label230;
        }
        this.oyB.setTextColor(getContext().getResources().getColor(i.c.oXi));
        label85:
        if (bg.nm(paramString1)) {
          break label261;
        }
        this.oyB.setText(paramString1);
        h.e(this.oyB, 2);
        label109:
        this.oyB.setCompoundDrawables(null, null, null, null);
        if ((paramBoolean) && (d.et(11))) {
          j.a(this.oyB, new Animator.AnimatorListener()
          {
            public final void onAnimationCancel(Animator paramAnonymousAnimator)
            {
              GMTrace.i(8623220588544L, 64248);
              GMTrace.o(8623220588544L, 64248);
            }
            
            public final void onAnimationEnd(Animator paramAnonymousAnimator)
            {
              GMTrace.i(8623086370816L, 64247);
              if (paramb != null) {
                ao.a(paramb);
              }
              GMTrace.o(8623086370816L, 64247);
            }
            
            public final void onAnimationRepeat(Animator paramAnonymousAnimator)
            {
              GMTrace.i(8623354806272L, 64249);
              GMTrace.o(8623354806272L, 64249);
            }
            
            public final void onAnimationStart(Animator paramAnonymousAnimator)
            {
              GMTrace.i(8622952153088L, 64246);
              GMTrace.o(8622952153088L, 64246);
            }
          });
        }
        if (bg.nm(paramString2)) {
          break label274;
        }
        this.qit.setText(paramString2);
      }
    }
    for (;;)
    {
      this.qit.setVisibility(0);
      GMTrace.o(8638521409536L, 64362);
      return;
      if (this.qiw != 1) {
        break;
      }
      this.oyB.setTextSize(1, 15.0F * a.dZ(getContext()));
      break;
      this.oyB.setTextSize(this.qiy, this.qix);
      break;
      label230:
      if (this.qiw != 1) {
        break label85;
      }
      this.oyB.setTextColor(getContext().getResources().getColor(i.c.oXk));
      break label85;
      label261:
      this.oyB.setText(i.j.pkZ);
      break label109;
      label274:
      this.qit.setText(i.j.dhB);
    }
  }
  
  public final void ar(float paramFloat)
  {
    GMTrace.i(8638252974080L, 64360);
    this.oyB.setTextSize(1, paramFloat);
    this.qix = paramFloat;
    this.qiy = 1;
    GMTrace.o(8638252974080L, 64360);
  }
  
  public final void as(float paramFloat)
  {
    GMTrace.i(8638387191808L, 64361);
    this.oyB.setTextSize(0, paramFloat);
    this.qix = paramFloat;
    this.qiy = 0;
    GMTrace.o(8638387191808L, 64361);
  }
  
  public final void vA(int paramInt)
  {
    GMTrace.i(8638118756352L, 64359);
    this.oyB.setCompoundDrawables(this.gKU, null, null, null);
    this.oyB.setCompoundDrawablePadding(a.fromDPToPix(getContext(), 3));
    this.oyB.setText(i.j.plb);
    j.a(this.oyB, null);
    this.qit.setVisibility(4);
    this.qiw = paramInt;
    this.oyB.setTextSize(0, this.qit.getTextSize());
    this.oyB.setTextColor(getContext().getResources().getColor(i.c.oXj));
    GMTrace.o(8638118756352L, 64359);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsTranslateResultView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */