package com.tencent.mm.plugin.luckymoney.particles.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.tencent.gmtrace.GMTrace;

public final class a
  extends b
{
  private final Bitmap bitmap;
  private final float mLf;
  private final float mLg;
  
  public a(Bitmap paramBitmap)
  {
    GMTrace.i(9908355334144L, 73823);
    this.bitmap = paramBitmap;
    this.mLf = (paramBitmap.getWidth() / 2.0F);
    this.mLg = (paramBitmap.getHeight() / 2.0F);
    GMTrace.o(9908355334144L, 73823);
  }
  
  protected final void a(Canvas paramCanvas, Matrix paramMatrix, Paint paramPaint, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    GMTrace.i(9908757987328L, 73826);
    paramMatrix.preTranslate(paramFloat1, paramFloat2);
    paramMatrix.preRotate(paramFloat3, this.mLf, this.mLg);
    paramCanvas.drawBitmap(this.bitmap, paramMatrix, paramPaint);
    GMTrace.o(9908757987328L, 73826);
  }
  
  public final int getHeight()
  {
    GMTrace.i(9908623769600L, 73825);
    int i = this.bitmap.getHeight();
    GMTrace.o(9908623769600L, 73825);
    return i;
  }
  
  public final int getWidth()
  {
    GMTrace.i(9908489551872L, 73824);
    int i = this.bitmap.getWidth();
    GMTrace.o(9908489551872L, 73824);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\particles\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */