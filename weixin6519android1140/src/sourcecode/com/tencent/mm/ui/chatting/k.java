package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.sdk.platformtools.ab;

final class k
  extends ah.a
{
  public int wrJ;
  public ImageView wse;
  public TextView wsf;
  public TextView wsg;
  
  public k(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2269487562752L, 16909);
    this.wrJ = 0;
    GMTrace.o(2269487562752L, 16909);
  }
  
  public final k dn(View paramView)
  {
    GMTrace.i(2269621780480L, 16910);
    super.dq(paramView);
    this.jRw = ((TextView)this.lFh.findViewById(R.h.boA));
    this.lCA = ((CheckBox)this.lFh.findViewById(R.h.bnd));
    this.npf = this.lFh.findViewById(R.h.bnX);
    this.oGJ = ((TextView)this.lFh.findViewById(R.h.boF));
    this.wse = ((ImageView)this.lFh.findViewById(R.h.beQ));
    this.wsf = ((TextView)this.lFh.findViewById(R.h.beR));
    this.wsg = ((TextView)this.lFh.findViewById(R.h.beP));
    this.wrJ = ah.ft(ab.getContext());
    GMTrace.o(2269621780480L, 16910);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */