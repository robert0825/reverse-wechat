package com.tencent.mm.plugin.appbrand.canvas;

import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.n.c;
import java.util.Stack;

public final class d
  implements a
{
  public String fXC;
  public com.tencent.mm.plugin.appbrand.canvas.b.a hNM;
  public com.tencent.mm.plugin.appbrand.canvas.b.a hNN;
  public Stack<com.tencent.mm.plugin.appbrand.canvas.b.a> hNO;
  public Stack<com.tencent.mm.plugin.appbrand.canvas.b.a> hNP;
  public Paint hNQ;
  public Paint hNR;
  public e hNS;
  private a hNT;
  
  public d(a parama)
  {
    GMTrace.i(20000454737920L, 149015);
    this.hNQ = new Paint();
    this.hNT = parama;
    this.hNM = new com.tencent.mm.plugin.appbrand.canvas.b.a();
    this.hNN = new com.tencent.mm.plugin.appbrand.canvas.b.a();
    this.hNM.setStyle(Paint.Style.STROKE);
    this.hNN.setStyle(Paint.Style.FILL);
    this.hNM.setAntiAlias(true);
    this.hNN.setAntiAlias(true);
    this.hNM.setStrokeWidth(c.jM(1));
    this.hNN.setStrokeWidth(c.jM(1));
    this.hNO = new Stack();
    this.hNP = new Stack();
    this.hNQ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    GMTrace.o(20000454737920L, 149015);
  }
  
  public final void invalidate()
  {
    GMTrace.i(20000588955648L, 149016);
    this.hNT.invalidate();
    GMTrace.o(20000588955648L, 149016);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */