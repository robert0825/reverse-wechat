package com.tencent.mm.plugin.setting.ui.setting;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.sdk.platformtools.bg;

class NetStatRuler
  extends View
{
  public NetStatRuler(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(4660844822528L, 34726);
    GMTrace.o(4660844822528L, 34726);
  }
  
  public NetStatRuler(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(4660979040256L, 34727);
    GMTrace.o(4660979040256L, 34727);
  }
  
  public NetStatRuler(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(4661113257984L, 34728);
    GMTrace.o(4661113257984L, 34728);
  }
  
  @SuppressLint({"DrawAllocation"})
  public void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(4661247475712L, 34729);
    super.onDraw(paramCanvas);
    TextPaint localTextPaint = new TextPaint();
    localTextPaint.setAntiAlias(true);
    localTextPaint.setDither(true);
    localTextPaint.setTextSize(getContext().getResources().getDimensionPixelSize(R.f.aQS));
    Rect localRect = new Rect();
    getDrawingRect(localRect);
    float f1 = localRect.height();
    float f2 = localRect.left + getPaddingLeft();
    float f3 = localRect.top;
    float f4 = f1 / 3.0F;
    float f5 = localRect.top;
    float f6 = 2.0F * f1 / 3.0F;
    float f7 = localRect.top;
    localTextPaint.setColor(-7829368);
    paramCanvas.drawText(bg.eL(NetStatUnit.max * 2 / 3), f2, f3 + f4, localTextPaint);
    paramCanvas.drawText(bg.eL(NetStatUnit.max / 3), f2, f5 + f6, localTextPaint);
    paramCanvas.drawText(bg.eL(0L), f2, f7 + f1, localTextPaint);
    GMTrace.o(4661247475712L, 34729);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\NetStatRuler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */