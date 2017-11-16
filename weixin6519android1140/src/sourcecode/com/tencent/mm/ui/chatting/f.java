package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;

final class f
  extends ah.a
{
  public TextView wrL;
  
  public f(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2236470001664L, 16663);
    GMTrace.o(2236470001664L, 16663);
  }
  
  public final f dk(View paramView)
  {
    GMTrace.i(2236604219392L, 16664);
    super.dq(paramView);
    this.jRw = ((TextView)this.lFh.findViewById(R.h.boA));
    this.lCA = ((CheckBox)this.lFh.findViewById(R.h.bnd));
    this.npf = this.lFh.findViewById(R.h.bnX);
    this.oGJ = ((TextView)this.lFh.findViewById(R.h.boF));
    this.wrL = ((TextView)this.lFh.findViewById(R.h.beH));
    GMTrace.o(2236604219392L, 16664);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */