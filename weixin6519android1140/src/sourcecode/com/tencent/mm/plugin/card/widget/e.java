package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.ao.a.a.c;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.protocal.c.jm;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.protocal.c.np;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class e
  extends a
{
  protected TextView hqH;
  private LinearLayout jBU;
  private RelativeLayout jMe;
  private TextView jMf;
  private View jMg;
  private ImageView jMh;
  private ImageView jMi;
  private ImageView jMj;
  private ImageView jMk;
  private ImageView jMl;
  
  public e(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(4892101967872L, 36449);
    GMTrace.o(4892101967872L, 36449);
  }
  
  private void anj()
  {
    GMTrace.i(4893175709696L, 36457);
    Object localObject = new c.a();
    ((c.a)localObject).gKF = com.tencent.mm.compatible.util.e.ghz;
    n.Je();
    ((c.a)localObject).gKX = null;
    ((c.a)localObject).gKE = com.tencent.mm.plugin.card.model.m.tZ(this.jwZ.ajw().tZq);
    ((c.a)localObject).gKC = true;
    ((c.a)localObject).gKZ = true;
    ((c.a)localObject).gLa = this.mContext.getResources().getDimensionPixelSize(R.f.aRr);
    ((c.a)localObject).gLb = true;
    ((c.a)localObject).gKA = true;
    ((c.a)localObject).gKR = R.g.aVg;
    localObject = ((c.a)localObject).Jn();
    n.Jd().a(this.jwZ.ajw().tZq, this.jMk, (c)localObject);
    w.i("MicroMsg.CardWidgetMembership", "the member back ground url is " + this.jwZ.ajw().tZq);
    GMTrace.o(4893175709696L, 36457);
  }
  
  public final void a(ShapeDrawable paramShapeDrawable)
  {
    GMTrace.i(4892907274240L, 36455);
    if (!TextUtils.isEmpty(this.jwZ.ajw().tZq))
    {
      this.jMk.setBackgroundDrawable(null);
      this.jMl.setVisibility(0);
      anj();
      GMTrace.o(4892907274240L, 36455);
      return;
    }
    if (this.jLI != null)
    {
      this.jMk.setBackgroundDrawable(paramShapeDrawable);
      this.jMl.setVisibility(8);
    }
    GMTrace.o(4892907274240L, 36455);
  }
  
  protected final void ane()
  {
    GMTrace.i(4892236185600L, 36450);
    this.hqH = ((TextView)and().findViewById(R.h.blL));
    this.jMe = ((RelativeLayout)and().findViewById(R.h.bkT));
    this.jBU = ((LinearLayout)and().findViewById(R.h.bjC));
    this.jMf = ((TextView)and().findViewById(R.h.bpJ));
    this.jMg = and().findViewById(R.h.bjA);
    this.jMh = ((ImageView)and().findViewById(R.h.bjB));
    this.jMi = ((ImageView)this.jLI.findViewById(R.h.bMP));
    this.jMj = ((ImageView)this.jLI.findViewById(R.h.bMO));
    this.jMk = ((ImageView)this.jLI.findViewById(R.h.bkQ));
    this.jMl = ((ImageView)this.jLI.findViewById(R.h.bkS));
    GMTrace.o(4892236185600L, 36450);
  }
  
  protected final void anf()
  {
    GMTrace.i(4892370403328L, 36451);
    if (this.jLK != null) {
      this.jLK.setText(this.jwZ.ajv().jyT);
    }
    Object localObject;
    if ((this.jwZ.ajv().tZI != null) && (this.jwZ.ajv().tZI.size() > 0))
    {
      localObject = (np)this.jwZ.ajv().tZI.get(0);
      if (!TextUtils.isEmpty(((np)localObject).title)) {
        this.hqH.setText(((np)localObject).title);
      }
    }
    else
    {
      if (!this.jwZ.ajr()) {
        break label492;
      }
      dA(true);
      this.jMk.setAlpha(255);
      if (this.jMk.getBackground() != null) {
        this.jMk.getBackground().setAlpha(255);
      }
      localObject = this.jwZ.ajw().code;
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        break label315;
      }
      w.e("MicroMsg.CardWidgetMembership", "don't updateCodeLayout, code is empty!");
      dA(false);
    }
    for (;;)
    {
      localObject = this.jMe.getLayoutParams();
      int i = this.mContext.getResources().getDimensionPixelSize(R.f.aQr);
      int j = this.mContext.getResources().getDisplayMetrics().widthPixels - i * 2;
      int k = j * 3 / 5;
      ((ViewGroup.LayoutParams)localObject).height = k;
      w.d("MicroMsg.CardWidgetMembership", "padding:%d,originWidth:%d,targetWidth:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
      this.jMe.setLayoutParams((ViewGroup.LayoutParams)localObject);
      GMTrace.o(4892370403328L, 36451);
      return;
      this.hqH.setText("");
      break;
      label315:
      this.jMg.setOnClickListener(this.hwh);
      this.jMh.setOnClickListener(this.hwh);
      this.jMf.setOnClickListener(this.hwh);
      switch (this.jwZ.ajw().tZf)
      {
      default: 
        break;
      case 0: 
        if (((String)localObject).length() <= 40) {
          this.jMf.setText(com.tencent.mm.plugin.card.b.m.uL((String)localObject));
        }
        break;
      case 1: 
      case 2: 
        if (((String)localObject).length() <= 40)
        {
          if (this.jwZ.ajk()) {
            this.jMf.setText(com.tencent.mm.plugin.card.b.m.uL((String)localObject));
          } else {
            this.jMf.setText("");
          }
        }
        else
        {
          this.jMf.setText("");
          continue;
          this.jMf.setText("");
          continue;
          label492:
          this.jMf.setText("");
          this.jMh.setVisibility(8);
          this.jMg.setVisibility(8);
          this.jMk.setAlpha(90);
          if (this.jMk.getBackground() != null) {
            this.jMk.getBackground().setAlpha(90);
          }
        }
        break;
      }
    }
  }
  
  public final void dA(boolean paramBoolean)
  {
    GMTrace.i(4892638838784L, 36453);
    if ((!TextUtils.isEmpty(this.jwZ.ajw().code)) && (paramBoolean) && (this.jwZ.ajw().tZf != 0) && (!this.jwZ.ajv().uaq))
    {
      this.jMh.setVisibility(0);
      this.jMg.setVisibility(0);
      GMTrace.o(4892638838784L, 36453);
      return;
    }
    this.jMh.setVisibility(8);
    this.jMg.setVisibility(8);
    GMTrace.o(4892638838784L, 36453);
  }
  
  public final void dB(boolean paramBoolean)
  {
    GMTrace.i(4893041491968L, 36456);
    if (!TextUtils.isEmpty(this.jwZ.ajw().tZq))
    {
      this.jMj.setVisibility(8);
      this.jMi.setVisibility(8);
      GMTrace.o(4893041491968L, 36456);
      return;
    }
    this.jMj.setVisibility(0);
    this.jMi.setVisibility(0);
    GMTrace.o(4893041491968L, 36456);
  }
  
  public final void l(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(4892504621056L, 36452);
    GMTrace.o(4892504621056L, 36452);
  }
  
  public final void lY(int paramInt)
  {
    GMTrace.i(4892773056512L, 36454);
    if (!TextUtils.isEmpty(this.jwZ.ajw().tZq))
    {
      this.jMk.setBackgroundDrawable(null);
      this.jMl.setVisibility(0);
      anj();
      GMTrace.o(4892773056512L, 36454);
      return;
    }
    if (this.jLI != null)
    {
      this.jMk.setBackgroundResource(paramInt);
      this.jMl.setVisibility(8);
    }
    GMTrace.o(4892773056512L, 36454);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\widget\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */