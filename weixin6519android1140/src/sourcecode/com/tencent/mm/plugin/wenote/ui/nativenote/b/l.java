package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.k;
import com.tencent.mm.plugin.wenote.model.a.b;
import com.tencent.mm.plugin.wenote.model.a.i;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;

public final class l
  extends h
{
  public l(View paramView, k paramk)
  {
    super(paramView, paramk);
    GMTrace.i(20585644032000L, 153375);
    this.sjw.setVisibility(0);
    this.eId.setVisibility(8);
    this.sjB.setVisibility(8);
    this.sjw.setTag(this);
    this.sjw.setOnClickListener(this.lXS);
    GMTrace.o(20585644032000L, 153375);
  }
  
  public final void a(b paramb, int paramInt1, int paramInt2)
  {
    GMTrace.i(20585778249728L, 153376);
    this.sjz.setImageResource(R.k.cNa);
    this.sjx.setText(((i)paramb).title);
    this.sjy.setText(((i)paramb).content);
    super.a(paramb, paramInt1, paramInt2);
    GMTrace.o(20585778249728L, 153376);
  }
  
  public final int bIG()
  {
    GMTrace.i(20585912467456L, 153377);
    GMTrace.o(20585912467456L, 153377);
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\ui\nativenote\b\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */