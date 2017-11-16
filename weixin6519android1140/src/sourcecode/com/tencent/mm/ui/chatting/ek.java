package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.br.a;
import com.tencent.mm.k.g;
import com.tencent.mm.kernel.h;
import com.tencent.mm.pluginsdk.ui.d.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.widget.MMCellTextView;
import com.tencent.mm.ui.widget.celltextview.CellTextView;

final class ek
  extends ah.a
{
  View kJj;
  MMCellTextView wHg;
  private int wHh;
  ImageView wrV;
  ChattingTranslateView wtE;
  
  public ek(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2512690085888L, 18721);
    this.wHh = 0;
    GMTrace.o(2512690085888L, 18721);
  }
  
  public final void a(CellTextView paramCellTextView)
  {
    GMTrace.i(18999861575680L, 141560);
    paramCellTextView.setMaxWidth(this.wHh);
    GMTrace.o(18999861575680L, 141560);
  }
  
  public final ah.a r(View paramView, boolean paramBoolean)
  {
    GMTrace.i(2512824303616L, 18722);
    super.dq(paramView);
    this.jRw = ((TextView)paramView.findViewById(R.h.boA));
    this.oGJ = ((TextView)paramView.findViewById(R.h.boF));
    this.wHg = ((MMCellTextView)paramView.findViewById(R.h.bni));
    this.lCA = ((CheckBox)paramView.findViewById(R.h.bnd));
    this.npf = paramView.findViewById(R.h.bnX);
    this.kJj = paramView.findViewById(R.h.bng);
    this.wtE = ((ChattingTranslateView)paramView.findViewById(R.h.boD));
    if (paramBoolean)
    {
      this.type = 2;
      this.wHh = ah.fs(ab.getContext());
      float f1 = a.dZ(this.wHg.getContext());
      float f2 = this.wHg.getTextSize();
      this.wHg.setTextSize(f1 * f2);
      this.wHg.setOnTouchListener(new dv(new k(this.wHg.getContext())));
      paramView = this.wHg;
      String str = g.ut().getValue("CellTextViewEnable");
      int i = bg.getInt(str, 1);
      paramBoolean = h.xy().xh().getBoolean(w.a.yvE, true);
      w.i("CellTextView", "[isOpenCellTextView] value:%s isCellTextViewOpen:%s local:%s", new Object[] { str, Integer.valueOf(i), Boolean.valueOf(paramBoolean) });
      if ((1 != i) || (!paramBoolean)) {
        break label330;
      }
    }
    label330:
    for (paramBoolean = true;; paramBoolean = false)
    {
      paramView.Dg = paramBoolean;
      GMTrace.o(2512824303616L, 18722);
      return this;
      this.wrV = ((ImageView)paramView.findViewById(R.h.boy));
      this.wsh = ((ImageView)paramView.findViewById(R.h.bow));
      this.nWt = ((ProgressBar)paramView.findViewById(R.h.cjy));
      this.type = 4;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ek.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */