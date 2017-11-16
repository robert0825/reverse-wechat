package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;

public final class b
  extends h
{
  public b(View paramView, k paramk)
  {
    super(paramView, paramk);
    GMTrace.i(20584704507904L, 153368);
    this.sjw.setVisibility(8);
    this.eId.setVisibility(8);
    this.sjB.setVisibility(8);
    this.sjw.setOnClickListener(null);
    GMTrace.o(20584704507904L, 153368);
  }
  
  public final void a(com.tencent.mm.plugin.wenote.model.a.b paramb, int paramInt1, int paramInt2)
  {
    GMTrace.i(20584838725632L, 153369);
    super.a(paramb, paramInt1, paramInt2);
    if (paramb.getType() != -2)
    {
      GMTrace.o(20584838725632L, 153369);
      return;
    }
    if (this.shJ.sfG != 3)
    {
      GMTrace.o(20584838725632L, 153369);
      return;
    }
    this.sjF.setVisibility(0);
    GMTrace.o(20584838725632L, 153369);
  }
  
  public final int bIG()
  {
    GMTrace.i(20584972943360L, 153370);
    GMTrace.o(20584972943360L, 153370);
    return -2;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\ui\nativenote\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */