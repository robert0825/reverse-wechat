package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.sdk.platformtools.ab;

final class x
  extends ah.a
{
  TextView jpV;
  public int wrJ;
  ImageView wrV;
  ImageView wtF;
  TextView wtG;
  TextView wtH;
  
  public x(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2297941721088L, 17121);
    GMTrace.o(2297941721088L, 17121);
  }
  
  public final ah.a r(View paramView, boolean paramBoolean)
  {
    GMTrace.i(2298075938816L, 17122);
    super.dq(paramView);
    this.wtF = ((ImageView)paramView.findViewById(R.h.bmU));
    this.jRw = ((TextView)paramView.findViewById(R.h.boA));
    this.wtG = ((TextView)paramView.findViewById(R.h.boE));
    this.wtH = ((TextView)paramView.findViewById(R.h.boG));
    this.jpV = ((TextView)paramView.findViewById(R.h.boc));
    this.oGJ = ((TextView)paramView.findViewById(R.h.boF));
    this.wvA = paramView.findViewById(R.h.bne);
    this.lCA = ((CheckBox)paramView.findViewById(R.h.bnd));
    this.npf = paramView.findViewById(R.h.bnX);
    if (paramBoolean) {}
    for (int i = 12;; i = 13)
    {
      this.type = i;
      if (!paramBoolean)
      {
        this.wsh = ((ImageView)paramView.findViewById(R.h.bow));
        this.wrV = ((ImageView)paramView.findViewById(R.h.boy));
        this.nWt = ((ProgressBar)paramView.findViewById(R.h.cjy));
      }
      this.wrJ = ah.ft(ab.getContext());
      GMTrace.o(2298075938816L, 17122);
      return this;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */