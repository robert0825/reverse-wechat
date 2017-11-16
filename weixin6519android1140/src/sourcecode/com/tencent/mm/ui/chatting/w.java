package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.ui.widget.MMTextView;

final class w
  extends ah.a
{
  View kJj;
  ImageView wrV;
  MMTextView wtD;
  ChattingTranslateView wtE;
  
  public w(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2187212095488L, 16296);
    GMTrace.o(2187212095488L, 16296);
  }
  
  public final ah.a r(View paramView, boolean paramBoolean)
  {
    GMTrace.i(2187346313216L, 16297);
    super.dq(paramView);
    this.jRw = ((TextView)paramView.findViewById(R.h.boA));
    this.oGJ = ((TextView)paramView.findViewById(R.h.boF));
    this.wtD = ((MMTextView)paramView.findViewById(R.h.bni));
    this.lCA = ((CheckBox)paramView.findViewById(R.h.bnd));
    this.npf = paramView.findViewById(R.h.bnX);
    this.kJj = paramView.findViewById(R.h.bng);
    this.wtE = ((ChattingTranslateView)paramView.findViewById(R.h.boD));
    if (paramBoolean) {}
    for (this.type = 2;; this.type = 4)
    {
      GMTrace.o(2187346313216L, 16297);
      return this;
      this.wrV = ((ImageView)paramView.findViewById(R.h.boy));
      this.wsh = ((ImageView)paramView.findViewById(R.h.bow));
      this.nWt = ((ProgressBar)paramView.findViewById(R.h.cjy));
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */