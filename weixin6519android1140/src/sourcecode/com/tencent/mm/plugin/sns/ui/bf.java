package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.c.c;

public final class bf
{
  private String mwK;
  private LinearLayout qjA;
  public TextView qjB;
  public TextView qjC;
  private View qjD;
  private View qjE;
  public com.tencent.mm.plugin.sns.storage.b qjF;
  public com.tencent.mm.plugin.sns.storage.a qjG;
  private View view;
  
  public bf(View paramView)
  {
    GMTrace.i(8683484348416L, 64697);
    this.view = paramView;
    this.mwK = v.eq(ab.getContext());
    w.i("MicroMsg.TimeLineAdView", "adView init lan " + this.mwK);
    this.qjB = ((TextView)this.view.findViewById(i.f.oYJ));
    this.qjC = ((TextView)this.view.findViewById(i.f.oYM));
    this.qjD = this.view.findViewById(i.f.oYK);
    this.qjE = this.view.findViewById(i.f.oYL);
    this.qjA = ((LinearLayout)this.view.findViewById(i.f.oYI));
    paramView = " " + this.view.getResources().getString(i.j.piw) + " ";
    this.qjB.setText(paramView);
    GMTrace.o(8683484348416L, 64697);
  }
  
  public final void a(View.OnClickListener paramOnClickListener1, View.OnClickListener paramOnClickListener2)
  {
    GMTrace.i(8683618566144L, 64698);
    this.qjC.setOnClickListener(paramOnClickListener1);
    this.qjB.setOnClickListener(paramOnClickListener2);
    if (this.qjD != null) {
      this.qjD.setOnClickListener(paramOnClickListener2);
    }
    if (this.qjA != null) {
      this.qjA.setOnClickListener(paramOnClickListener2);
    }
    GMTrace.o(8683618566144L, 64698);
  }
  
  public final void a(com.tencent.mm.plugin.sns.storage.b paramb, com.tencent.mm.plugin.sns.storage.a parama)
  {
    GMTrace.i(8683887001600L, 64700);
    this.qjG = parama;
    this.qjF = paramb;
    final Object localObject1 = "";
    if (paramb != null)
    {
      if ("zh_CN".equals(this.mwK)) {
        localObject1 = paramb.pCL;
      }
    }
    else
    {
      Object localObject2 = localObject1;
      if (paramb != null)
      {
        localObject2 = localObject1;
        if (bg.nm((String)localObject1)) {
          localObject2 = paramb.pCJ;
        }
      }
      Context localContext = this.qjC.getContext();
      localObject1 = localObject2;
      if (bg.nm((String)localObject2)) {
        localObject1 = localContext.getString(i.j.piA);
      }
      final int i = ((String)localObject1).length();
      localObject1 = new SpannableString((String)localObject1 + "ad_");
      localObject2 = localContext.getResources().getDrawable(i.i.pgT);
      if (!bg.nm(paramb.pCK)) {
        d.a("adId", paramb.pCK, false, 41, 0, new d.a()
        {
          public final void Ih(String paramAnonymousString)
          {
            GMTrace.i(8764954509312L, 65304);
            if (bg.nm(paramAnonymousString))
            {
              GMTrace.o(8764954509312L, 65304);
              return;
            }
            paramAnonymousString = Drawable.createFromPath(paramAnonymousString);
            if (paramAnonymousString != null)
            {
              paramAnonymousString.setBounds(0, 0, (int)(bf.this.qjC.getTextSize() * 1.3D), (int)(bf.this.qjC.getTextSize() * 1.3D));
              paramAnonymousString = new ImageSpan(paramAnonymousString, 0);
              localObject1.setSpan(paramAnonymousString, i, i + 3, 33);
              bf.this.qjC.setText(localObject1);
            }
            GMTrace.o(8764954509312L, 65304);
          }
          
          public final void bkK()
          {
            GMTrace.i(8764686073856L, 65302);
            GMTrace.o(8764686073856L, 65302);
          }
          
          public final void bkL()
          {
            GMTrace.i(8764820291584L, 65303);
            GMTrace.o(8764820291584L, 65303);
          }
        });
      }
      ((Drawable)localObject2).setBounds(0, 0, (int)(this.qjC.getTextSize() * 1.3D), (int)(this.qjC.getTextSize() * 1.3D));
      ((SpannableString)localObject1).setSpan(new ImageSpan((Drawable)localObject2, 0), i, i + 3, 33);
      this.qjC.setText((CharSequence)localObject1);
      if ((parama == null) || (bg.nm(parama.pCj))) {
        break label356;
      }
      this.qjE.setVisibility(0);
      label268:
      if (paramb != null)
      {
        if (!"zh_CN".equals(this.mwK)) {
          break label368;
        }
        paramb = paramb.pCU;
      }
    }
    for (;;)
    {
      if (!bg.nm(paramb)) {
        this.qjB.setText(paramb);
      }
      GMTrace.o(8683887001600L, 64700);
      return;
      if (("zh_TW".equals(this.mwK)) || ("zh_HK".equals(this.mwK)))
      {
        localObject1 = paramb.pCN;
        break;
      }
      localObject1 = paramb.pCM;
      break;
      label356:
      this.qjE.setVisibility(8);
      break label268;
      label368:
      if (("zh_TW".equals(this.mwK)) || ("zh_HK".equals(this.mwK))) {
        paramb = paramb.pCW;
      } else {
        paramb = paramb.pCV;
      }
    }
  }
  
  public final String bpS()
  {
    GMTrace.i(8683215912960L, 64695);
    if (this.qjG == null)
    {
      GMTrace.o(8683215912960L, 64695);
      return "";
    }
    if (this.qjG.pyc == null)
    {
      GMTrace.o(8683215912960L, 64695);
      return "";
    }
    String str = this.qjG.pyc;
    GMTrace.o(8683215912960L, 64695);
    return str;
  }
  
  public final int[] bpT()
  {
    GMTrace.i(8683350130688L, 64696);
    int[] arrayOfInt = new int[2];
    if (this.qjA != null)
    {
      this.qjD.getLocationInWindow(arrayOfInt);
      arrayOfInt[0] += this.qjD.getMeasuredWidth();
    }
    for (;;)
    {
      GMTrace.o(8683350130688L, 64696);
      return arrayOfInt;
      if (this.qjD != null)
      {
        this.qjD.getLocationInWindow(arrayOfInt);
        arrayOfInt[0] += this.qjD.getMeasuredWidth();
      }
    }
  }
  
  public final void r(Object paramObject1, Object paramObject2)
  {
    GMTrace.i(8683752783872L, 64699);
    this.qjC.setTag(paramObject1);
    this.qjB.setTag(paramObject2);
    if (this.qjD != null) {
      this.qjD.setTag(paramObject2);
    }
    if (this.qjA != null) {
      this.qjA.setTag(paramObject2);
    }
    GMTrace.o(8683752783872L, 64699);
  }
  
  public final void setVisibility(int paramInt)
  {
    GMTrace.i(8684021219328L, 64701);
    com.tencent.mm.storage.a locala;
    if ((this.qjF != null) && (this.qjF.pCI == 1))
    {
      this.qjC.setVisibility(8);
      locala = c.Cu().Te("Sns_CanvasAd_DetailLink_JumpWay");
      if (!locala.isValid()) {
        break label211;
      }
    }
    label211:
    for (int i = bg.getInt(locala.field_value, -1);; i = -1)
    {
      if ((i != -1) && (this.qjF != null) && (this.qjF.pCp) && (e.Im(this.qjF.ePi))) {
        this.qjC.setVisibility(paramInt);
      }
      this.qjB.setVisibility(paramInt);
      if (this.qjD != null) {
        this.qjD.setVisibility(paramInt);
      }
      if (this.qjA != null) {
        this.qjA.setVisibility(paramInt);
      }
      if ((this.qjG != null) && (!bg.nm(this.qjG.pCj)))
      {
        this.qjE.setVisibility(paramInt);
        GMTrace.o(8684021219328L, 64701);
        return;
        this.qjC.setVisibility(paramInt);
        break;
      }
      this.qjE.setVisibility(8);
      GMTrace.o(8684021219328L, 64701);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */