package com.tencent.mm.t;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.by.a;

public final class b
  implements Cloneable
{
  private static Paint fWp;
  private float fy;
  private float lH;
  private Path mf;
  public int rz;
  
  static
  {
    GMTrace.i(19625987276800L, 146225);
    Paint localPaint = new Paint();
    fWp = localPaint;
    localPaint.setAntiAlias(true);
    fWp.setStyle(Paint.Style.STROKE);
    fWp.setStrokeCap(Paint.Cap.ROUND);
    GMTrace.o(19625987276800L, 146225);
  }
  
  public b(Path paramPath, float paramFloat, int paramInt)
  {
    GMTrace.i(19625718841344L, 146223);
    this.fy = 1.0F;
    this.lH = a.aC(5.0F);
    this.mf = paramPath;
    this.fy = paramFloat;
    this.rz = paramInt;
    GMTrace.o(19625718841344L, 146223);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    GMTrace.i(19625853059072L, 146224);
    fWp.setColor(this.rz);
    fWp.setStrokeWidth(this.lH * this.fy);
    if (!this.mf.isEmpty()) {
      paramCanvas.drawPath(this.mf, fWp);
    }
    GMTrace.o(19625853059072L, 146224);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\t\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */