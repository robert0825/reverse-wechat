package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import java.util.ArrayList;
import java.util.List;

final class r
  extends ah.a
{
  List<q> odp;
  TextView wsb;
  ChattingItemFooter wsr;
  LinearLayout wtq;
  t wtr;
  
  public r(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2164126646272L, 16124);
    this.wtr = new t();
    this.odp = new ArrayList();
    GMTrace.o(2164126646272L, 16124);
  }
  
  public final ah.a dp(View paramView)
  {
    GMTrace.i(2164260864000L, 16125);
    ViewGroup localViewGroup = (ViewGroup)this.wtr.odd.getParent();
    q localq = new q();
    localq.odd = paramView;
    localq.ikm = ((TextView)paramView.findViewById(R.h.title));
    localq.wtp = ((TextView)paramView.findViewById(R.h.summary));
    localq.ode = paramView.findViewById(R.h.bsq);
    localq.odf = ((ImageView)paramView.findViewById(R.h.bsp));
    localq.lho = ((ProgressBar)paramView.findViewById(R.h.bKJ));
    localq.odh = paramView.findViewById(R.h.bKz);
    localViewGroup.addView(paramView, localViewGroup.getChildCount() - 1);
    this.odp.add(localq);
    GMTrace.o(2164260864000L, 16125);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */