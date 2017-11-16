package com.tencent.mm.plugin.card.ui.view;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.card.a.f;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.ui.a.g;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.c.au;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.protocal.c.ul;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;

public final class b
  extends i
{
  private MMActivity iPC;
  private View jJT;
  private TextView jJU;
  private g jJV;
  private com.tencent.mm.plugin.card.base.b jwZ;
  
  public b()
  {
    GMTrace.i(4992765263872L, 37199);
    GMTrace.o(4992765263872L, 37199);
  }
  
  public final void MP()
  {
    GMTrace.i(4992899481600L, 37200);
    this.iPC = this.jKl.aly();
    this.jJV = this.jKl.alA();
    GMTrace.o(4992899481600L, 37200);
  }
  
  public final void amM()
  {
    GMTrace.i(4993302134784L, 37203);
    this.jJT.setVisibility(8);
    GMTrace.o(4993302134784L, 37203);
  }
  
  public final void destroy()
  {
    GMTrace.i(4993033699328L, 37201);
    super.destroy();
    this.iPC = null;
    this.jJV = null;
    GMTrace.o(4993033699328L, 37201);
  }
  
  public final void update()
  {
    GMTrace.i(4993167917056L, 37202);
    if (this.jJT == null)
    {
      this.jJT = ((ViewStub)findViewById(R.h.biY)).inflate();
      this.jJT.findViewById(R.h.biO).setOnClickListener(this.jKl.alz());
    }
    this.jwZ = this.jKl.alv();
    this.jJV = this.jKl.alA();
    boolean bool1 = this.jJV.aml();
    boolean bool2 = this.jJV.amm();
    Object localObject2;
    final Object localObject1;
    int i;
    Object localObject3;
    StateListDrawable localStateListDrawable;
    if (bool1)
    {
      this.jJT.setVisibility(0);
      w.i("MicroMsg.CardAcceptView", "updateAcceptView() acceptViewVisible:" + bool1 + " acceptViewEnabled:" + bool2);
      localObject2 = (Button)this.jJT.findViewById(R.h.biO);
      localObject1 = this.jJT.findViewById(R.h.biX);
      ((View)localObject1).setBackgroundDrawable(null);
      ((View)localObject1).setOnClickListener(null);
      i = this.iPC.getResources().getDimensionPixelSize(R.f.aRs);
      if (!bool2) {
        break label1131;
      }
      if (!TextUtils.isEmpty(this.jwZ.ajv().tZR)) {
        ((Button)localObject2).setText(this.jwZ.ajv().tZR);
      }
      if (!this.jwZ.ajc()) {
        break label858;
      }
      ((Button)localObject2).setTextColor(l.uD(this.jwZ.ajv().gjg));
      localObject1 = l.d(this.iPC, l.uD(this.jwZ.ajv().gjg), i);
      localObject3 = l.bN(l.uD(this.jwZ.ajv().gjg), i);
      localStateListDrawable = new StateListDrawable();
      localStateListDrawable.addState(new int[] { 16842919 }, (Drawable)localObject3);
      localStateListDrawable.addState(new int[0], (Drawable)localObject1);
      i = this.iPC.getResources().getColor(R.e.white);
      int j = l.uD(this.jwZ.ajv().gjg);
      ((Button)localObject2).setBackgroundDrawable(localStateListDrawable);
      ((Button)localObject2).setTextColor(new ColorStateList(new int[][] { { 16842919, 16842910 }, new int[0] }, new int[] { i, j }));
      localObject1 = (LinearLayout.LayoutParams)this.jJT.getLayoutParams();
      ((LinearLayout.LayoutParams)localObject1).topMargin = this.iPC.getResources().getDimensionPixelSize(R.f.aRb);
      this.jJT.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      this.jJT.findViewById(R.h.buH).setVisibility(8);
      localObject1 = this.jKl.alD();
      localObject2 = (CheckBox)this.jJT.findViewById(R.h.bjX);
      if ((((f)localObject1).ajU() == null) || (!((f)localObject1).ajU().jxV)) {
        break label840;
      }
      w.i("MicroMsg.CardAcceptView", "updateFollowBox() show followbox");
      ((CheckBox)localObject2).setVisibility(0);
      localObject3 = this.jwZ.ajv().uac;
      if ((localObject3 == null) || (TextUtils.isEmpty(((ul)localObject3).text))) {
        break label824;
      }
      ((CheckBox)localObject2).setText(((ul)localObject3).text);
      ((CheckBox)localObject2).setChecked(((f)localObject1).ajU().jxW);
      ((CheckBox)localObject2).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(4993570570240L, 37205);
          if (((CheckBox)paramAnonymousView).isChecked())
          {
            localObject1.ajU().jxW = true;
            GMTrace.o(4993570570240L, 37205);
            return;
          }
          localObject1.ajU().jxW = false;
          GMTrace.o(4993570570240L, 37205);
        }
      });
    }
    for (;;)
    {
      if ((!this.jwZ.ajd()) && (!this.jwZ.ajb()))
      {
        if ((this.jwZ.ajv().uad != null) && (!bg.nm(this.jwZ.ajv().uad.text)))
        {
          if (this.jJU == null) {
            this.jJU = ((TextView)this.jJT.findViewById(R.h.biV));
          }
          this.jJU.setText(this.jwZ.ajv().uad.text);
          if (!bg.nm(this.jwZ.ajv().uad.url))
          {
            this.jJU.setOnClickListener(this.jKl.alz());
            this.jJU.setTextColor(l.uD(this.jwZ.ajv().gjg));
          }
          this.jJU.setVisibility(0);
          GMTrace.o(4993167917056L, 37202);
          return;
          w.i("MicroMsg.CardAcceptView", "updateAcceptView(), mAcceptCardView is Gone");
          this.jJT.setVisibility(8);
          GMTrace.o(4993167917056L, 37202);
          return;
          label824:
          ((CheckBox)localObject2).setText(((f)localObject1).ajU().title);
          break;
          label840:
          w.i("MicroMsg.CardAcceptView", "updateFollowBox() not show followbox");
          ((CheckBox)localObject2).setVisibility(8);
          continue;
          label858:
          if ((this.jwZ.ajd()) || (this.jwZ.ajb()) || (this.jwZ.aje()))
          {
            localObject1 = l.bN(l.uD(this.jwZ.ajv().gjg), i);
            localObject3 = l.bN(l.aL(this.jwZ.ajv().gjg, 175), i);
            localStateListDrawable = new StateListDrawable();
            localStateListDrawable.addState(new int[] { 16842919 }, (Drawable)localObject3);
            localStateListDrawable.addState(new int[0], (Drawable)localObject1);
            ((Button)localObject2).setBackgroundDrawable(localStateListDrawable);
            ((Button)localObject2).setTextColor(this.iPC.getResources().getColor(R.e.aPs));
            localObject1 = (LinearLayout.LayoutParams)((Button)localObject2).getLayoutParams();
            ((LinearLayout.LayoutParams)localObject1).width = -1;
            ((Button)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
            continue;
          }
          localObject1 = l.bN(l.uD(this.jwZ.ajv().gjg), i);
          localObject3 = l.bN(l.aL(this.jwZ.ajv().gjg, 175), i);
          localStateListDrawable = new StateListDrawable();
          localStateListDrawable.addState(new int[] { 16842919 }, (Drawable)localObject3);
          localStateListDrawable.addState(new int[0], (Drawable)localObject1);
          ((Button)localObject2).setBackgroundDrawable(localStateListDrawable);
          ((Button)localObject2).setTextColor(this.iPC.getResources().getColor(R.e.aPs));
          continue;
          label1131:
          this.jJT.setEnabled(false);
          ((View)localObject1).setEnabled(false);
          ((Button)localObject2).setEnabled(false);
          if (this.jwZ.ajc()) {}
          for (localObject1 = this.jwZ.ajv().tZR;; localObject1 = this.jJV.ame())
          {
            ((Button)localObject2).setText((CharSequence)localObject1);
            if (!this.jwZ.ajc()) {
              break label1319;
            }
            ((Button)localObject2).setTextColor(l.aL(this.jwZ.ajv().gjg, 125));
            ((Button)localObject2).setBackgroundDrawable(l.d(this.iPC, l.aL(this.jwZ.ajv().gjg, 125), i));
            localObject1 = (LinearLayout.LayoutParams)this.jJT.getLayoutParams();
            ((LinearLayout.LayoutParams)localObject1).topMargin = this.iPC.getResources().getDimensionPixelSize(R.f.aRc);
            this.jJT.setLayoutParams((ViewGroup.LayoutParams)localObject1);
            this.jJT.findViewById(R.h.buH).setVisibility(8);
            break;
          }
          label1319:
          if ((this.jwZ.ajd()) || (this.jwZ.ajb()) || (this.jwZ.aje()))
          {
            ((Button)localObject2).setTextColor(this.iPC.getResources().getColor(R.e.aNR));
            ((Button)localObject2).setBackgroundDrawable(l.v(this.iPC, this.iPC.getResources().getColor(R.e.aNc)));
            localObject1 = (LinearLayout.LayoutParams)((Button)localObject2).getLayoutParams();
            ((LinearLayout.LayoutParams)localObject1).width = -1;
            ((Button)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
            continue;
          }
          ((Button)localObject2).setTextColor(this.iPC.getResources().getColor(R.e.aNR));
          ((Button)localObject2).setBackgroundDrawable(l.v(this.iPC, this.iPC.getResources().getColor(R.e.aNc)));
          continue;
        }
        if (this.jJU != null) {
          this.jJU.setVisibility(8);
        }
      }
    }
    GMTrace.o(4993167917056L, 37202);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\view\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */