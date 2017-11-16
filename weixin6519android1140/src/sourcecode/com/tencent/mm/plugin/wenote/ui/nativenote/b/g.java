package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.k;
import com.tencent.mm.plugin.wenote.model.a.b;
import com.tencent.mm.plugin.wenote.model.a.f;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;

public final class g
  extends h
{
  public g(View paramView, k paramk)
  {
    super(paramView, paramk);
    GMTrace.i(17155978428416L, 127822);
    this.sjw.setVisibility(0);
    this.eId.setVisibility(8);
    this.sjB.setVisibility(8);
    this.sjw.setTag(this);
    this.sjw.setOnClickListener(this.lXS);
    GMTrace.o(17155978428416L, 127822);
  }
  
  public final void a(b paramb, int paramInt1, int paramInt2)
  {
    GMTrace.i(17156112646144L, 127823);
    this.sjz.setImageResource(R.k.cMd);
    this.sjx.setText(((f)paramb).mzo);
    this.sjy.setText(((f)paramb).gEy);
    super.a(paramb, paramInt1, paramInt2);
    GMTrace.o(17156112646144L, 127823);
  }
  
  public final int bIG()
  {
    GMTrace.i(17156246863872L, 127824);
    GMTrace.o(17156246863872L, 127824);
    return 3;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\ui\nativenote\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */