package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;

final class eb
  extends ah.a
{
  TextView ljO;
  TextView wxX;
  
  public eb(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2144933511168L, 15981);
    GMTrace.o(2144933511168L, 15981);
  }
  
  public final ah.a dx(View paramView)
  {
    GMTrace.i(2145067728896L, 15982);
    super.dq(paramView);
    this.jRw = ((TextView)paramView.findViewById(R.h.boA));
    this.oGJ = ((TextView)paramView.findViewById(R.h.boF));
    this.wxX = ((TextView)paramView.findViewById(R.h.bni));
    this.ljO = ((TextView)paramView.findViewById(R.h.bol));
    this.lCA = ((CheckBox)paramView.findViewById(R.h.bnd));
    this.npf = paramView.findViewById(R.h.bnX);
    this.type = 2;
    GMTrace.o(2145067728896L, 15982);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\eb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */