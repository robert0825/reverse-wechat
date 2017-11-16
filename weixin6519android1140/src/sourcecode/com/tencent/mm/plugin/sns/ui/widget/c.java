package com.tencent.mm.plugin.sns.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kiss.widget.textview.a.b;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public final class c
{
  private static c qoI;
  public int qoE;
  private com.tencent.mm.kiss.widget.textview.a.a qoJ;
  private com.tencent.mm.kiss.widget.textview.a.a qoK;
  
  static
  {
    GMTrace.i(8330894376960L, 62070);
    qoI = new c();
    GMTrace.o(8330894376960L, 62070);
  }
  
  public c()
  {
    GMTrace.i(8330089070592L, 62064);
    this.qoE = 0;
    this.qoJ = null;
    this.qoK = null;
    GMTrace.o(8330089070592L, 62064);
  }
  
  public static c bqr()
  {
    GMTrace.i(8330223288320L, 62065);
    c localc = qoI;
    GMTrace.o(8330223288320L, 62065);
    return localc;
  }
  
  public static float getTextSize()
  {
    GMTrace.i(8330760159232L, 62069);
    float f = com.tencent.mm.br.a.fromDPToPix(ab.getContext(), (int)(15.0F * com.tencent.mm.br.a.dZ(ab.getContext())));
    GMTrace.o(8330760159232L, 62069);
    return f;
  }
  
  public final com.tencent.mm.kiss.widget.textview.a.a bqq()
  {
    GMTrace.i(8330357506048L, 62066);
    int i = com.tencent.mm.br.a.fromDPToPix(ab.getContext(), (int)(15.0F * com.tencent.mm.br.a.dZ(ab.getContext())));
    if ((this.qoJ == null) || ((int)this.qoJ.gbV != i)) {
      this.qoJ = b.xW().fj(19).fk(ab.getContext().getResources().getColor(i.c.aOE)).K(i).gbE;
    }
    com.tencent.mm.kiss.widget.textview.a.a locala = this.qoJ;
    GMTrace.o(8330357506048L, 62066);
    return locala;
  }
  
  public final com.tencent.mm.kiss.widget.textview.a.a bqs()
  {
    GMTrace.i(8330491723776L, 62067);
    int i = com.tencent.mm.br.a.fromDPToPix(ab.getContext(), (int)(15.0F * com.tencent.mm.br.a.dZ(ab.getContext())));
    if ((this.qoK == null) || ((int)this.qoK.gbV != i))
    {
      localObject = b.xW().fj(19).fk(ab.getContext().getResources().getColor(i.c.aOE)).K(i);
      ((b)localObject).gbE.maxLines = 6;
      this.qoK = ((b)localObject).gbE;
    }
    Object localObject = this.qoK;
    GMTrace.o(8330491723776L, 62067);
    return (com.tencent.mm.kiss.widget.textview.a.a)localObject;
  }
  
  public final int bqt()
  {
    GMTrace.i(8330625941504L, 62068);
    if (this.qoE <= 0)
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      ((WindowManager)ab.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
      i = localDisplayMetrics.widthPixels;
      int j = (int)(ab.getResources().getDimension(i.d.aQE) + ab.getResources().getDimension(i.d.aQE));
      int k = (int)ab.getResources().getDimension(i.d.oXq);
      int m = (int)ab.getResources().getDimension(i.d.aQE);
      this.qoE = (i - k - j);
      w.i("MicroMsg.SnsPostDescPreloadTextViewConfig", "screenWidth " + i + " textViewWidth " + this.qoE + " padding: " + j + " marginLeft: " + k + " thisviewPadding: " + m);
    }
    int i = this.qoE;
    GMTrace.o(8330625941504L, 62068);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\widget\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */