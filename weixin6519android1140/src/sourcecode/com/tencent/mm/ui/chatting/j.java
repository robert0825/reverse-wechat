package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;

final class j
  extends ah.a
{
  protected TextView wsd;
  
  public j(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2178756378624L, 16233);
    GMTrace.o(2178756378624L, 16233);
  }
  
  public final j dm(View paramView)
  {
    GMTrace.i(2178890596352L, 16234);
    super.dq(paramView);
    this.wsd = ((TextView)paramView.findViewById(R.h.bLh));
    this.oGJ = ((TextView)paramView.findViewById(R.h.boF));
    this.lCA = ((CheckBox)paramView.findViewById(R.h.bnd));
    this.npf = paramView.findViewById(R.h.bnX);
    GMTrace.o(2178890596352L, 16234);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */