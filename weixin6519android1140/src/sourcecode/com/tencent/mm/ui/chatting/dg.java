package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;

final class dg
  extends ah.a
{
  protected TextView hqI;
  protected TextView wBQ;
  protected TextView wBR;
  protected Button wBS;
  protected Button wBT;
  protected ImageView wBU;
  
  public dg(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2176877330432L, 16219);
    GMTrace.o(2176877330432L, 16219);
  }
  
  public final dg dw(View paramView)
  {
    GMTrace.i(2177011548160L, 16220);
    super.dq(paramView);
    this.hqI = ((TextView)paramView.findViewById(R.h.bmB));
    this.wBQ = ((TextView)paramView.findViewById(R.h.bmA));
    this.wBR = ((TextView)paramView.findViewById(R.h.bmO));
    this.wBS = ((Button)paramView.findViewById(R.h.bnO));
    this.wBT = ((Button)paramView.findViewById(R.h.bnN));
    this.wBU = ((ImageView)paramView.findViewById(R.h.boB));
    this.lCA = ((CheckBox)paramView.findViewById(R.h.bnd));
    this.npf = paramView.findViewById(R.h.bnX);
    GMTrace.o(2177011548160L, 16220);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\dg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */