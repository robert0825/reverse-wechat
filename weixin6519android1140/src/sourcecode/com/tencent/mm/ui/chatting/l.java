package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;

final class l
  extends ah.a
{
  protected TextView jRv;
  protected TextView ljO;
  protected ProgressBar nWt;
  protected TextView wsb;
  protected ImageView wsh;
  
  public l(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2168018960384L, 16153);
    GMTrace.o(2168018960384L, 16153);
  }
  
  public final l jdMethod_do(View paramView)
  {
    GMTrace.i(2168153178112L, 16154);
    super.dq(paramView);
    this.jRv = ((TextView)paramView.findViewById(R.h.bni));
    this.nWt = ((ProgressBar)paramView.findViewById(R.h.cjy));
    this.wsh = ((ImageView)paramView.findViewById(R.h.bow));
    this.ljO = ((TextView)paramView.findViewById(R.h.bmK));
    this.wsb = ((TextView)paramView.findViewById(R.h.bmy));
    this.oGJ = ((TextView)paramView.findViewById(R.h.boF));
    this.lCA = ((CheckBox)paramView.findViewById(R.h.bnd));
    this.npf = paramView.findViewById(R.h.bnX);
    GMTrace.o(2168153178112L, 16154);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */