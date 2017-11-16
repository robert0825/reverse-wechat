package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;

public final class c
  extends h
{
  public c(View paramView, k paramk)
  {
    super(paramView, paramk);
    GMTrace.i(17158662782976L, 127842);
    this.sjw.setVisibility(0);
    this.eId.setVisibility(8);
    this.sjB.setVisibility(8);
    this.sjw.setTag(this);
    this.sjw.setOnClickListener(this.lXS);
    GMTrace.o(17158662782976L, 127842);
  }
  
  public final void a(com.tencent.mm.plugin.wenote.model.a.b paramb, int paramInt1, int paramInt2)
  {
    GMTrace.i(17158797000704L, 127843);
    this.sjz.setImageBitmap(com.tencent.mm.plugin.wenote.b.b.NM(com.tencent.mm.plugin.wenote.model.h.NE(((com.tencent.mm.plugin.wenote.model.a.c)paramb).scT)));
    this.sjx.setText(((com.tencent.mm.plugin.wenote.model.a.c)paramb).title);
    this.sjy.setText(((com.tencent.mm.plugin.wenote.model.a.c)paramb).content);
    super.a(paramb, paramInt1, paramInt2);
    GMTrace.o(17158797000704L, 127843);
  }
  
  public final int bIG()
  {
    GMTrace.i(17158931218432L, 127844);
    GMTrace.o(17158931218432L, 127844);
    return 5;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\ui\nativenote\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */