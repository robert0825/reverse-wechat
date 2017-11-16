package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.wenote.model.a.b;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;

public final class i
  extends h
{
  private ImageView sjN;
  private TextView sjO;
  
  public i(View paramView, k paramk)
  {
    super(paramView, paramk);
    GMTrace.i(20583630766080L, 153360);
    this.sjw.setVisibility(8);
    this.eId.setVisibility(8);
    this.sjB.setVisibility(8);
    this.sjw.setOnClickListener(null);
    this.sjN = ((ImageView)paramView.findViewById(R.h.bRF));
    this.sjO = ((TextView)paramView.findViewById(R.h.bRH));
    GMTrace.o(20583630766080L, 153360);
  }
  
  public final void a(b paramb, int paramInt1, int paramInt2)
  {
    GMTrace.i(20583764983808L, 153361);
    super.a(paramb, paramInt1, paramInt2);
    if (paramb.getType() != -4)
    {
      GMTrace.o(20583764983808L, 153361);
      return;
    }
    this.sjE.setVisibility(0);
    GMTrace.o(20583764983808L, 153361);
  }
  
  public final int bIG()
  {
    GMTrace.i(20583899201536L, 153362);
    GMTrace.o(20583899201536L, 153362);
    return -4;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\ui\nativenote\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */