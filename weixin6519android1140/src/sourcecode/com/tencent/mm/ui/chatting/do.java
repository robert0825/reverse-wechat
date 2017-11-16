package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;

final class do
  extends ah.a
{
  TextView oIP;
  View wFl;
  ImageView wFm;
  ImageView wFn;
  TextView wFo;
  TextView wFp;
  TextView wtG;
  TextView wxX;
  
  public do(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2212310810624L, 16483);
    GMTrace.o(2212310810624L, 16483);
  }
  
  public final ah.a dx(View paramView)
  {
    GMTrace.i(2212445028352L, 16484);
    super.dq(paramView);
    this.jRw = ((TextView)paramView.findViewById(R.h.boA));
    this.wtG = ((TextView)paramView.findViewById(R.h.boE));
    this.oIP = ((TextView)paramView.findViewById(R.h.boG));
    this.wxX = ((TextView)paramView.findViewById(R.h.bni));
    this.wvA = paramView.findViewById(R.h.bne);
    this.wFp = ((TextView)paramView.findViewById(R.h.bnY));
    this.wFl = paramView.findViewById(R.h.bnC);
    this.wFm = ((ImageView)paramView.findViewById(R.h.bmb));
    this.wFn = ((ImageView)paramView.findViewById(R.h.bnD));
    this.wFo = ((TextView)paramView.findViewById(R.h.bmc));
    this.lCA = ((CheckBox)paramView.findViewById(R.h.bnd));
    this.npf = paramView.findViewById(R.h.bnX);
    this.type = 9;
    GMTrace.o(2212445028352L, 16484);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\do.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */