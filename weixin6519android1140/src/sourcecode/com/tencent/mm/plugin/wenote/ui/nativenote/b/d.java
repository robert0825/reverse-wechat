package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.wenote.model.a.b;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;

public final class d
  extends a
{
  private TextView sjm;
  private View sjn;
  public LinearLayout sjo;
  
  public d(View paramView, k paramk)
  {
    super(paramView, paramk);
    GMTrace.i(20584033419264L, 153363);
    this.sjo = ((LinearLayout)paramView.findViewById(R.h.bRA));
    this.sjo.setVisibility(0);
    this.sjm = ((TextView)paramView.findViewById(R.h.bRC));
    this.sjn = paramView.findViewById(R.h.bRB);
    GMTrace.o(20584033419264L, 153363);
  }
  
  public final void a(b paramb, int paramInt1, int paramInt2)
  {
    GMTrace.i(20584167636992L, 153364);
    if (paramb.getType() != -3)
    {
      GMTrace.o(20584167636992L, 153364);
      return;
    }
    if (this.shJ.sfG == 3)
    {
      this.sjo.setVisibility(8);
      GMTrace.o(20584167636992L, 153364);
      return;
    }
    this.sjo.setVisibility(0);
    paramb = (com.tencent.mm.plugin.wenote.model.a.d)paramb;
    if (paramb.scS <= 0L)
    {
      GMTrace.o(20584167636992L, 153364);
      return;
    }
    Object localObject = this.sjm.getContext();
    long l = paramb.scS;
    if (l < 3600000L) {}
    for (paramb = "";; paramb = DateFormat.format(((Context)localObject).getString(R.l.dtZ), l))
    {
      localObject = this.sjm.getContext().getString(R.l.dLM);
      paramb = (String)localObject + " " + paramb;
      this.sjm.setText(paramb);
      GMTrace.o(20584167636992L, 153364);
      return;
    }
  }
  
  public final int bIG()
  {
    GMTrace.i(20584301854720L, 153365);
    GMTrace.o(20584301854720L, 153365);
    return -3;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\ui\nativenote\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */