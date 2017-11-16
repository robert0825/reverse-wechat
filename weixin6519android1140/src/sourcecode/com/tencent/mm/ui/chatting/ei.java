package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;

final class ei
  extends ah.a
{
  TextView hqI;
  
  public ei(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2202110263296L, 16407);
    GMTrace.o(2202110263296L, 16407);
  }
  
  public final ah.a dz(View paramView)
  {
    GMTrace.i(2202244481024L, 16408);
    super.dq(paramView);
    this.jRw = ((TextView)paramView.findViewById(R.h.boA));
    this.oGJ = ((TextView)paramView.findViewById(R.h.boF));
    this.hqI = ((TextView)paramView.findViewById(R.h.bni));
    this.lCA = ((CheckBox)paramView.findViewById(R.h.bnd));
    this.npf = paramView.findViewById(R.h.bnX);
    this.type = 2;
    GMTrace.o(2202244481024L, 16408);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */