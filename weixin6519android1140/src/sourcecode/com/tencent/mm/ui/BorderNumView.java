package com.tencent.mm.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.platformtools.a.a;

public class BorderNumView
  extends View
{
  private static int vFM;
  private static int vFN;
  private static int vFO;
  private Context context;
  private Paint mPaint;
  private int vFL;
  
  static
  {
    GMTrace.i(2888499724288L, 21521);
    vFM = 22;
    vFN = 105;
    vFO = 100;
    GMTrace.o(2888499724288L, 21521);
  }
  
  public BorderNumView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(2887962853376L, 21517);
    this.context = null;
    this.vFL = 100;
    this.context = paramContext;
    init();
    GMTrace.o(2887962853376L, 21517);
  }
  
  public BorderNumView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(2888097071104L, 21518);
    this.context = null;
    this.vFL = 100;
    this.context = paramContext;
    init();
    GMTrace.o(2888097071104L, 21518);
  }
  
  private void init()
  {
    GMTrace.i(2888231288832L, 21519);
    this.mPaint = new Paint();
    GMTrace.o(2888231288832L, 21519);
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(2888365506560L, 21520);
    super.onDraw(paramCanvas);
    if (this.vFL < 100) {
      vFM += 15;
    }
    if (this.vFL >= 1000) {
      vFO -= 20;
    }
    float f1 = a.a.a(this.context, vFM);
    float f2 = a.a.a(this.context, vFN);
    String str = this.vFL;
    this.mPaint.setAntiAlias(true);
    this.mPaint.setTextSize(vFO);
    this.mPaint.setColor(-11491572);
    this.mPaint.setStyle(Paint.Style.STROKE);
    this.mPaint.setStrokeWidth(8.0F);
    paramCanvas.drawText(str, f1, f2, this.mPaint);
    this.mPaint.setTextSize(vFO);
    this.mPaint.setColor(-1770573);
    this.mPaint.setStyle(Paint.Style.FILL);
    this.mPaint.setStrokeWidth(8.0F);
    paramCanvas.drawText(str, f1, f2, this.mPaint);
    GMTrace.o(2888365506560L, 21520);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\BorderNumView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */