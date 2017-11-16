package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;

final class i
  extends ah.a
{
  protected ImageView lCC;
  protected ImageView lCw;
  protected View lhL;
  protected TextView ljO;
  protected TextView wsa;
  protected TextView wsb;
  protected ImageView wsc;
  
  public i(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2296465326080L, 17110);
    GMTrace.o(2296465326080L, 17110);
  }
  
  public final i dl(View paramView)
  {
    GMTrace.i(2296599543808L, 17111);
    super.dq(paramView);
    this.lCw = ((ImageView)paramView.findViewById(R.h.bmN));
    this.ljO = ((TextView)paramView.findViewById(R.h.bmK));
    this.wsa = ((TextView)paramView.findViewById(R.h.bmD));
    this.lhL = paramView.findViewById(R.h.bmE);
    this.wsb = ((TextView)paramView.findViewById(R.h.bmy));
    this.oGJ = ((TextView)paramView.findViewById(R.h.boF));
    this.wsc = ((ImageView)paramView.findViewById(R.h.bmF));
    this.lCA = ((CheckBox)paramView.findViewById(R.h.bnd));
    this.npf = paramView.findViewById(R.h.bnX);
    this.lCC = ((ImageView)paramView.findViewById(R.h.bnl));
    GMTrace.o(2296599543808L, 17111);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */