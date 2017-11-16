package com.tencent.mm.plugin.appbrand.widget.e;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
  extends Drawable
{
  public float Vl;
  private final RectF iQY;
  private float iQZ;
  public final Paint mPaint;
  private final Path mf;
  
  public b()
  {
    GMTrace.i(18843632140288L, 140396);
    this.mPaint = new Paint(1);
    this.Vl = 0.0F;
    this.iQY = new RectF();
    this.mf = new Path();
    this.iQZ = a.fromDPToPix(ab.getContext(), 3);
    GMTrace.o(18843632140288L, 140396);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    GMTrace.i(18843766358016L, 140397);
    float f5 = this.iQY.width();
    float f6 = this.iQY.height();
    float f1 = this.iQY.left;
    float f2 = this.iQY.top;
    float f3 = this.iQY.right;
    float f4 = this.iQY.bottom;
    f5 = Math.min(this.Vl, Math.min(f5, f6) * 0.5F);
    paramCanvas.drawRoundRect(new RectF(f1 + this.iQZ, f2 + this.iQZ, f3 - this.iQZ, f4 - this.iQZ), f5, f5, this.mPaint);
    paramCanvas.drawPath(this.mf, this.mPaint);
    GMTrace.o(18843766358016L, 140397);
  }
  
  public final int getOpacity()
  {
    GMTrace.i(18844303228928L, 140401);
    GMTrace.o(18844303228928L, 140401);
    return -3;
  }
  
  public final void setAlpha(int paramInt)
  {
    GMTrace.i(18844034793472L, 140399);
    this.mPaint.setAlpha(paramInt);
    GMTrace.o(18844034793472L, 140399);
  }
  
  public final void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(18843900575744L, 140398);
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    this.iQY.set(paramInt1, paramInt2, paramInt3, paramInt4);
    float f = (paramInt1 + paramInt3) / 2.0F;
    this.mf.moveTo(f, paramInt4);
    this.mf.lineTo(f - this.iQZ, paramInt4 - this.iQZ);
    this.mf.lineTo(f + this.iQZ, paramInt4 - this.iQZ);
    this.mf.close();
    GMTrace.o(18843900575744L, 140398);
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    GMTrace.i(18844169011200L, 140400);
    this.mPaint.setColorFilter(paramColorFilter);
    GMTrace.o(18844169011200L, 140400);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\e\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */