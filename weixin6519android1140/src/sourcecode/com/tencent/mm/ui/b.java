package com.tencent.mm.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.v.a.e;
import com.tencent.mm.v.a.g;

public final class b
{
  public TextView hqH;
  private View rPP;
  private ImageView vFC;
  public TextView vFD;
  private ImageView vFE;
  public ImageView vFF;
  private ImageView vFG;
  public ImageView vFH;
  private View vFI;
  
  public b(View paramView)
  {
    GMTrace.i(1908710309888L, 14221);
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (localLayoutParams == null) {
      localLayoutParams = new ViewGroup.LayoutParams(-2, -1);
    }
    for (;;)
    {
      paramView.setLayoutParams(localLayoutParams);
      this.hqH = ((TextView)paramView.findViewById(a.g.geo));
      this.vFD = ((TextView)paramView.findViewById(a.g.gec));
      this.vFE = ((ImageView)paramView.findViewById(a.g.gdH));
      this.vFF = ((ImageView)paramView.findViewById(a.g.gdJ));
      this.vFG = ((ImageView)paramView.findViewById(a.g.gdP));
      this.rPP = paramView.findViewById(a.g.gcV);
      this.vFC = ((ImageView)paramView.findViewById(a.g.gcW));
      this.vFH = ((ImageView)paramView.findViewById(a.g.gdR));
      this.vFI = paramView;
      GMTrace.o(1908710309888L, 14221);
      return;
      localLayoutParams.width = -2;
      localLayoutParams.height = -1;
    }
  }
  
  public final void h(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(1909247180800L, 14225);
    this.rPP.setOnClickListener(paramOnClickListener);
    GMTrace.o(1909247180800L, 14225);
  }
  
  public final void kP(boolean paramBoolean)
  {
    GMTrace.i(1908978745344L, 14223);
    ImageView localImageView = this.vFE;
    if (paramBoolean) {}
    for (int i = 0;; i = 8)
    {
      localImageView.setVisibility(i);
      GMTrace.o(1908978745344L, 14223);
      return;
    }
  }
  
  public final void kQ(boolean paramBoolean)
  {
    GMTrace.i(1909112963072L, 14224);
    ImageView localImageView = this.vFG;
    if (paramBoolean) {}
    for (int i = 0;; i = 8)
    {
      localImageView.setVisibility(i);
      GMTrace.o(1909112963072L, 14224);
      return;
    }
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    GMTrace.i(1908844527616L, 14222);
    this.hqH.setText(paramCharSequence);
    if (a.ed(this.hqH.getContext())) {
      this.hqH.setTextSize(0, a.W(this.hqH.getContext(), a.e.aPt) * a.eb(this.hqH.getContext()));
    }
    GMTrace.o(1908844527616L, 14222);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */