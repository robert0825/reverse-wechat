package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;

public final class dq
  extends ah.a
{
  public ProgressBar nWt;
  public TextView wFs;
  ImageView wFt;
  public View wFu;
  ImageView wrU;
  ImageView wrV;
  TextView wsb;
  
  public dq(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2527319818240L, 18830);
    GMTrace.o(2527319818240L, 18830);
  }
  
  public final ah.a r(View paramView, boolean paramBoolean)
  {
    GMTrace.i(2527454035968L, 18831);
    super.dq(paramView);
    this.jRw = ((TextView)paramView.findViewById(R.h.boA));
    this.wrU = ((ImageView)paramView.findViewById(R.h.bnj));
    this.lCA = ((CheckBox)paramView.findViewById(R.h.bnd));
    this.npf = paramView.findViewById(R.h.bnX);
    this.wFu = paramView.findViewById(R.h.cjA);
    if (paramBoolean)
    {
      this.oGJ = ((TextView)paramView.findViewById(R.h.boF));
      this.nWt = ((ProgressBar)paramView.findViewById(R.h.bvn));
      this.type = 1;
    }
    for (;;)
    {
      this.wsb = ((TextView)paramView.findViewById(R.h.bmy));
      this.wFt = ((ImageView)paramView.findViewById(R.h.bnl));
      GMTrace.o(2527454035968L, 18831);
      return this;
      this.nWt = ((ProgressBar)paramView.findViewById(R.h.cjy));
      this.wFs = ((TextView)paramView.findViewById(R.h.cjz));
      this.oGJ = ((TextView)paramView.findViewById(R.h.boF));
      this.type = 3;
      this.wrV = ((ImageView)paramView.findViewById(R.h.boy));
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\dq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */