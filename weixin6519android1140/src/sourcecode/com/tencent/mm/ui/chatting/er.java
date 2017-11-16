package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.storage.au;

final class er
  extends ah.a
{
  TextView wxX;
  
  public er(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2240362315776L, 16692);
    GMTrace.o(2240362315776L, 16692);
  }
  
  public static void a(er paramer, au paramau, int paramInt, En_5b8fbb1e.a parama)
  {
    GMTrace.i(2240630751232L, 16694);
    if (paramer == null)
    {
      GMTrace.o(2240630751232L, 16694);
      return;
    }
    paramer.wvA.setTag(new dr(paramau, parama.wqK, paramInt, null, 0, (byte)0));
    paramer.wvA.setOnClickListener(parama.wvd.wyW);
    paramer.wvA.setOnLongClickListener(parama.wvd.wyY);
    paramer.wvA.setOnTouchListener(parama.wvd.wza);
    GMTrace.o(2240630751232L, 16694);
  }
  
  public final ah.a dx(View paramView)
  {
    GMTrace.i(2240496533504L, 16693);
    super.dq(paramView);
    if (this.type == 39)
    {
      this.jRw = ((TextView)paramView.findViewById(R.h.boA));
      this.wxX = ((TextView)paramView.findViewById(R.h.bpa));
      this.wvA = paramView.findViewById(R.h.bne);
    }
    for (;;)
    {
      if (this.type == 39) {
        this.wsh = ((ImageView)paramView.findViewById(R.h.bow));
      }
      this.lCA = ((CheckBox)paramView.findViewById(R.h.bnd));
      this.npf = paramView.findViewById(R.h.bnX);
      GMTrace.o(2240496533504L, 16693);
      return this;
      this.jRw = ((TextView)paramView.findViewById(R.h.boA));
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\er.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */