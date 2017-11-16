package com.tencent.mm.plugin.appbrand.widget;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.c;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.o.h;
import com.tencent.mm.plugin.appbrand.ui.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.v;
import java.util.ArrayList;
import java.util.Iterator;

public final class a
  extends LinearLayout
{
  public int Cj;
  public LinearLayout iIF;
  public View iIG;
  public TextView iIH;
  private TextView iII;
  private ImageView iIJ;
  private View iIK;
  public ImageButton iIL;
  public AppBrandOptionButton iIM;
  private ProgressBar iIN;
  private i iIO;
  public int iIP;
  private boolean iIQ;
  public View.OnClickListener iIR;
  public View.OnClickListener iIS;
  private long iIT;
  
  public a(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(10140686221312L, 75554);
    this.iIQ = false;
    this.iIR = null;
    this.iIS = null;
    this.iIT = 0L;
    setLayoutParams(new LinearLayout.LayoutParams(-1, b.bX(getContext())));
    setGravity(19);
    setBackgroundResource(o.c.aMB);
    this.iIF = ((LinearLayout)v.fb(getContext()).inflate(o.g.hCG, this, false));
    addView(this.iIF);
    addView(v.fb(getContext()).inflate(o.g.hCG, this, false));
    this.iIP = -1;
    this.Cj = getResources().getColor(o.c.aMB);
    this.iIG = findViewById(o.f.hAE);
    this.iIH = ((TextView)findViewById(o.f.hAF));
    this.iII = ((TextView)findViewById(o.f.hAG));
    this.iIJ = ((ImageView)findViewById(o.f.hAD));
    this.iIK = findViewById(o.f.hAC);
    this.iIL = ((ImageButton)findViewById(o.f.hAA));
    this.iIM = ((AppBrandOptionButton)findViewById(o.f.bcJ));
    this.iIN = ((ProgressBar)findViewById(o.f.hAB));
    this.iIO = new i();
    this.iIK.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(10040962449408L, 74811);
        a.a(a.this);
        GMTrace.o(10040962449408L, 74811);
      }
    });
    GMTrace.o(10140686221312L, 75554);
  }
  
  public final void abW()
  {
    GMTrace.i(19883953750016L, 148147);
    this.iII.clearAnimation();
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
    localAlphaAnimation.setDuration(500L);
    localAlphaAnimation.setStartOffset(0L);
    localAlphaAnimation.setRepeatMode(2);
    localAlphaAnimation.setRepeatCount(-1);
    this.iII.startAnimation(localAlphaAnimation);
    GMTrace.o(19883953750016L, 148147);
  }
  
  public final void abX()
  {
    GMTrace.i(17288853979136L, 128812);
    if (this.iIQ) {
      this.iIJ.setImageResource(o.h.hDF);
    }
    for (;;)
    {
      this.iIJ.setColorFilter(this.iIP, PorterDuff.Mode.SRC_ATOP);
      this.iIH.setTextColor(this.iIP);
      this.iII.setTextColor(this.iIP);
      this.iIL.setImageDrawable(g.c(getContext(), o.h.hDD, this.iIP));
      i locali = this.iIO;
      locali.lG = this.iIP;
      locali.invalidateSelf();
      this.iIN.setLayerType(1, null);
      this.iIN.setIndeterminateDrawable(this.iIO);
      this.iIM.setColor(this.iIP);
      GMTrace.o(17288853979136L, 128812);
      return;
      this.iIJ.setImageResource(o.h.hDG);
    }
  }
  
  public final void cD(boolean paramBoolean)
  {
    GMTrace.i(19884087967744L, 148148);
    if (paramBoolean)
    {
      setVisibility(8);
      GMTrace.o(19884087967744L, 148148);
      return;
    }
    setVisibility(0);
    GMTrace.o(19884087967744L, 148148);
  }
  
  public final void cE(boolean paramBoolean)
  {
    GMTrace.i(15437051985920L, 115015);
    if (paramBoolean)
    {
      this.iIM.setVisibility(0);
      GMTrace.o(15437051985920L, 115015);
      return;
    }
    this.iIM.setVisibility(8);
    GMTrace.o(15437051985920L, 115015);
  }
  
  public final void cF(boolean paramBoolean)
  {
    GMTrace.i(15437186203648L, 115016);
    if (paramBoolean)
    {
      this.iIL.setVisibility(0);
      GMTrace.o(15437186203648L, 115016);
      return;
    }
    this.iIL.setVisibility(8);
    GMTrace.o(15437186203648L, 115016);
  }
  
  public final void cG(boolean paramBoolean)
  {
    GMTrace.i(10141088874496L, 75557);
    this.iIQ = paramBoolean;
    abX();
    GMTrace.o(10141088874496L, 75557);
  }
  
  public final void cH(boolean paramBoolean)
  {
    GMTrace.i(10141223092224L, 75558);
    View localView = this.iIK;
    if (paramBoolean)
    {
      i = 8;
      localView.setVisibility(i);
      localView = this.iIG;
      if (!paramBoolean) {
        break label72;
      }
    }
    label72:
    for (int i = getContext().getResources().getDimensionPixelSize(o.d.aQq);; i = 0)
    {
      localView.setPadding(i, 0, 0, 0);
      GMTrace.o(10141223092224L, 75558);
      return;
      i = 0;
      break;
    }
  }
  
  public final void cI(boolean paramBoolean)
  {
    int j = 0;
    GMTrace.i(17288988196864L, 128813);
    Object localObject = this.iIN;
    if (paramBoolean) {}
    for (int i = 0;; i = 8)
    {
      ((ProgressBar)localObject).setVisibility(i);
      if (!paramBoolean) {
        break label188;
      }
      localObject = this.iIO;
      ((i)localObject).ln.clear();
      ((i)localObject).ln.add(i.a(((i)localObject).iJU));
      ((i)localObject).ln.add(i.a(((i)localObject).iJV));
      localObject = this.iIO;
      Iterator localIterator = ((i)localObject).ln.iterator();
      do
      {
        i = j;
        if (!localIterator.hasNext()) {
          break;
        }
      } while (!((Animator)localIterator.next()).isStarted());
      i = 1;
      if (i != 0) {
        break label178;
      }
      localIterator = ((i)localObject).ln.iterator();
      while (localIterator.hasNext()) {
        ((Animator)localIterator.next()).start();
      }
    }
    ((i)localObject).invalidateSelf();
    label178:
    GMTrace.o(17288988196864L, 128813);
    return;
    label188:
    localObject = this.iIO.ln.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((Animator)((Iterator)localObject).next()).end();
    }
    GMTrace.o(17288988196864L, 128813);
  }
  
  public final void sJ(String paramString)
  {
    GMTrace.i(17288585543680L, 128810);
    this.iIH.setText(paramString);
    GMTrace.o(17288585543680L, 128810);
  }
  
  public final void sK(String paramString)
  {
    GMTrace.i(19883819532288L, 148146);
    if (bg.nm(paramString)) {
      this.iII.setVisibility(8);
    }
    for (;;)
    {
      this.iII.clearAnimation();
      GMTrace.o(19883819532288L, 148146);
      return;
      this.iII.setVisibility(0);
      this.iII.setText(paramString);
    }
  }
  
  public final void sL(String paramString)
  {
    GMTrace.i(10140954656768L, 75556);
    if ("white".equals(paramString)) {
      this.iIP = -1;
    }
    for (;;)
    {
      abX();
      GMTrace.o(10140954656768L, 75556);
      return;
      if ("black".equals(paramString)) {
        this.iIP = -16777216;
      }
    }
  }
  
  public final void setBackgroundColor(int paramInt)
  {
    GMTrace.i(17288719761408L, 128811);
    this.Cj = paramInt;
    super.setBackgroundColor(paramInt);
    GMTrace.o(17288719761408L, 128811);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */