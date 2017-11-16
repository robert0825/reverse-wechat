package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;

final class ec
  extends ah.a
{
  protected TextView hqI;
  protected ImageView wGI;
  
  public ec(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2246267895808L, 16736);
    GMTrace.o(2246267895808L, 16736);
  }
  
  public final ec dy(View paramView)
  {
    GMTrace.i(2246402113536L, 16737);
    super.dq(paramView);
    this.hqI = ((TextView)paramView.findViewById(R.h.bmB));
    this.wGI = ((ImageView)paramView.findViewById(R.h.bmN));
    this.lCA = ((CheckBox)paramView.findViewById(R.h.bnd));
    this.npf = paramView.findViewById(R.h.bnX);
    GMTrace.o(2246402113536L, 16737);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */