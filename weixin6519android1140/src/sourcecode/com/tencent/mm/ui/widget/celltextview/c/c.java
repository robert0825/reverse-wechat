package com.tencent.mm.ui.widget.celltextview.c;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends e
{
  private int Vw;
  private int vt;
  private ImageSpan xtw;
  
  public c(Paint paramPaint, String paramString, ImageSpan paramImageSpan, int paramInt1, int paramInt2, float paramFloat)
  {
    super(paramPaint, 2, paramString, paramFloat);
    GMTrace.i(18951811629056L, 141202);
    this.xtw = paramImageSpan;
    this.Vw = paramInt1;
    this.vt = paramInt2;
    this.xtF = paramFloat;
    GMTrace.o(18951811629056L, 141202);
  }
  
  public final float Eq(int paramInt)
  {
    GMTrace.i(18755048439808L, 139736);
    float f = this.xtw.getDrawable().getBounds().height() + paramInt;
    GMTrace.o(18755048439808L, 139736);
    return f;
  }
  
  public final void a(Canvas paramCanvas, RectF paramRectF, float paramFloat1, float paramFloat2)
  {
    GMTrace.i(18917317672960L, 140945);
    cjE();
    paramFloat1 = paramRectF.top + (int)((paramRectF.height() - xtH.descent() - xtH.ascent()) / 2.0F) + (xtH.getFontMetrics().bottom - xtH.getFontMetrics().top) / 2.0F - this.xtw.getDrawable().getBounds().height() / 2;
    int i = (int)(paramRectF.left + (paramRectF.width() - this.xtw.getDrawable().getBounds().width()) / 2.0F);
    w.i("ImageCell", "[draw] rect:%s drawX:%s drawY:%s", new Object[] { paramRectF, Integer.valueOf(i), Float.valueOf(paramFloat1) });
    this.xtw.draw(paramCanvas, "", this.Vw, this.vt, i, (int)paramRectF.top, (int)paramFloat1, (int)paramRectF.bottom, xtH);
    GMTrace.o(18917317672960L, 140945);
  }
  
  public final boolean cjB()
  {
    GMTrace.i(18754511568896L, 139732);
    GMTrace.o(18754511568896L, 139732);
    return false;
  }
  
  public final e cjC()
  {
    GMTrace.i(18755182657536L, 139737);
    c localc = new c(this.mPaint, this.iJz, this.xtw, this.Vw, this.vt, this.xtF);
    GMTrace.o(18755182657536L, 139737);
    return localc;
  }
  
  public final int getLength()
  {
    GMTrace.i(18754780004352L, 139734);
    int i = super.getLength();
    if (i <= 0)
    {
      GMTrace.o(18754780004352L, 139734);
      return 1;
    }
    GMTrace.o(18754780004352L, 139734);
    return i;
  }
  
  public final float getWidth()
  {
    GMTrace.i(18754645786624L, 139733);
    float f = this.xtw.getDrawable().getBounds().width();
    GMTrace.o(18754645786624L, 139733);
    return f;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\celltextview\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */