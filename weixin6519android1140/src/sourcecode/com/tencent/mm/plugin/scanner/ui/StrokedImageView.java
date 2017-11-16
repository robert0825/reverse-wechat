package com.tencent.mm.plugin.scanner.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;

public class StrokedImageView
  extends ImageView
{
  private int color;
  
  public StrokedImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6155896094720L, 45865);
    this.color = paramContext.getResources().getColor(R.e.aOP);
    GMTrace.o(6155896094720L, 45865);
  }
  
  @SuppressLint({"DrawAllocation"})
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(6156030312448L, 45866);
    super.onDraw(paramCanvas);
    Rect localRect = paramCanvas.getClipBounds();
    localRect.left += 1;
    localRect.top += 1;
    localRect.bottom -= 1;
    localRect.right -= 1;
    Paint localPaint = new Paint();
    localPaint.setColor(this.color);
    localPaint.setStyle(Paint.Style.STROKE);
    localPaint.setAntiAlias(true);
    localPaint.setStrokeWidth(1.5F);
    paramCanvas.drawRect(localRect, localPaint);
    GMTrace.o(6156030312448L, 45866);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\StrokedImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */