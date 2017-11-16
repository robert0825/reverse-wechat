package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.ab;

final class e
  extends ah.a
{
  public int maxSize;
  public ImageView wrF;
  public TextView wrG;
  public TextView wrH;
  public TextView wrI;
  public int wrJ;
  public int wrK;
  
  public e(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2505576546304L, 18668);
    this.wrJ = 0;
    this.wrK = 0;
    this.maxSize = 0;
    GMTrace.o(2505576546304L, 18668);
  }
  
  public final e dj(View paramView)
  {
    GMTrace.i(2505710764032L, 18669);
    super.dq(paramView);
    this.jRw = ((TextView)this.lFh.findViewById(R.h.boA));
    this.lCA = ((CheckBox)this.lFh.findViewById(R.h.bnd));
    this.npf = this.lFh.findViewById(R.h.bnX);
    this.oGJ = ((TextView)this.lFh.findViewById(R.h.boF));
    this.wrF = ((ImageView)this.lFh.findViewById(R.h.beG));
    this.wrG = ((TextView)this.lFh.findViewById(R.h.beI));
    this.wrH = ((TextView)this.lFh.findViewById(R.h.beF));
    this.wrI = ((TextView)this.lFh.findViewById(R.h.beJ));
    this.wvA = ((LinearLayout)this.lFh.findViewById(R.h.bne));
    this.wrJ = ah.ft(ab.getContext());
    this.wrK = a.V(ab.getContext(), R.f.aPF);
    this.maxSize = ((int)(a.W(ab.getContext(), R.f.aPF) * 1.45F));
    GMTrace.o(2505710764032L, 18669);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */