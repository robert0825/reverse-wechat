package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.ih;
import com.tencent.mm.g.a.rk;
import com.tencent.mm.modelmulti.m;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.w;

public final class o
  extends b
{
  private TextView hqH;
  private ImageView iub;
  private View jcL;
  boolean xaC;
  private c xaD;
  private boolean xaq;
  
  public o(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(14504775647232L, 108069);
    this.xaq = false;
    this.jcL = null;
    this.xaC = false;
    if ((!this.xaq) && (this.view != null))
    {
      this.jcL = this.view.findViewById(R.h.chX);
      this.hqH = ((TextView)this.view.findViewById(R.h.chV));
      this.iub = ((ImageView)this.view.findViewById(R.h.chW));
      this.xaq = true;
      this.xaD = new c() {};
      a.vgX.b(this.xaD);
    }
    GMTrace.o(14504775647232L, 108069);
  }
  
  public final boolean abd()
  {
    GMTrace.i(14505044082688L, 108071);
    if (!this.xaC)
    {
      w.i("MicroMsg.TryNewInitBanner", "summerinit update but initFailed[%b] just ret update false", new Object[] { Boolean.valueOf(this.xaC) });
      this.jcL.setVisibility(8);
      GMTrace.o(14505044082688L, 108071);
      return false;
    }
    if (!m.JC())
    {
      w.i("MicroMsg.TryNewInitBanner", "summerinit update but not need init just update false");
      this.xaC = false;
      this.jcL.setVisibility(8);
      GMTrace.o(14505044082688L, 108071);
      return false;
    }
    this.hqH.setText(R.l.cYP);
    this.iub.setVisibility(0);
    this.jcL.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(14510412791808L, 108111);
        w.i("MicroMsg.TryNewInitBanner", "summerinit onClick trynewinit layout start try");
        o.this.setVisibility(8);
        a.vgX.m(new rk());
        w.i("MicroMsg.TryNewInitBanner", "summerinit onClick tryNeeInitAgain done callBack (now by event to notice initbanner)");
        GMTrace.o(14510412791808L, 108111);
      }
    });
    this.jcL.setVisibility(0);
    if (this.jcL.getVisibility() == 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.TryNewInitBanner", "summerinit update set visible [%b]", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(14505044082688L, 108071);
      return true;
    }
  }
  
  public final void destroy()
  {
    GMTrace.i(14505312518144L, 108073);
    a.vgX.c(this.xaD);
    GMTrace.o(14505312518144L, 108073);
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(14504909864960L, 108070);
    int i = R.i.cHd;
    GMTrace.o(14504909864960L, 108070);
    return i;
  }
  
  public final void setVisibility(int paramInt)
  {
    GMTrace.i(14505178300416L, 108072);
    if (this.jcL != null) {
      this.jcL.setVisibility(paramInt);
    }
    GMTrace.o(14505178300416L, 108072);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\a\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */