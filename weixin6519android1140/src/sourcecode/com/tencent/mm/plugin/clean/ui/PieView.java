package com.tencent.mm.plugin.clean.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.gmtrace.GMTrace;

public class PieView
  extends View
{
  public int eOh;
  private int hZC;
  private Paint jTH;
  private Paint jTI;
  private Paint jTJ;
  private Paint jTK;
  private Paint jTL;
  private Paint jTM;
  private Paint jTN;
  private int jTO;
  private int jTP;
  private int jTQ;
  private int jTR;
  public int jTS;
  private int jTT;
  public int jTU;
  private int jTV;
  
  public PieView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7057302355968L, 52581);
    this.hZC = 6;
    this.jTU = 0;
    this.eOh = 0;
    this.jTV = -90;
    MP();
    GMTrace.o(7057302355968L, 52581);
  }
  
  public PieView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(7057168138240L, 52580);
    this.hZC = 6;
    this.jTU = 0;
    this.eOh = 0;
    this.jTV = -90;
    MP();
    GMTrace.o(7057168138240L, 52580);
  }
  
  private void MP()
  {
    GMTrace.i(7057436573696L, 52582);
    this.jTH = mg(-1);
    this.jTI = mg(-657931);
    this.jTJ = mg(-2565928);
    this.jTK = mg(-15223279);
    this.jTL = mg(-7876878);
    this.jTM = mg(-7876878);
    this.jTN = mg(-1644567);
    GMTrace.o(7057436573696L, 52582);
  }
  
  private static Paint mg(int paramInt)
  {
    GMTrace.i(7057570791424L, 52583);
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    localPaint.setStyle(Paint.Style.FILL);
    localPaint.setColor(paramInt);
    GMTrace.o(7057570791424L, 52583);
    return localPaint;
  }
  
  private static int z(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(7057839226880L, 52585);
    if (paramInt2 - paramInt1 >= paramInt3)
    {
      GMTrace.o(7057839226880L, 52585);
      return paramInt1 + paramInt3;
    }
    if (paramInt1 - paramInt2 > paramInt3)
    {
      GMTrace.o(7057839226880L, 52585);
      return paramInt1 - paramInt3;
    }
    GMTrace.o(7057839226880L, 52585);
    return paramInt2;
  }
  
  public void draw(Canvas paramCanvas)
  {
    GMTrace.i(7057705009152L, 52584);
    float f1 = getMeasuredWidth() / 2;
    float f2 = getMeasuredHeight() / 2 + getTop();
    float f3 = getMeasuredHeight() / 3 + 15;
    RectF localRectF1 = new RectF(f1 - f3, f2 - f3, f1 + f3, f2 + f3);
    if (this.eOh == 0)
    {
      paramCanvas.drawCircle(f1, f2, f3, this.jTI);
      paramCanvas.drawArc(localRectF1, this.jTV, 45.0F, true, this.jTJ);
      paramCanvas.drawCircle(f1, f2, f3 - 15.0F, this.jTH);
      this.jTV += 4;
      this.jTV %= 360;
    }
    RectF localRectF2;
    int i;
    int j;
    if (this.eOh == 1)
    {
      f3 = 10.0F + f3;
      localRectF2 = new RectF(f1 - f3, f2 - f3, f1 + f3, f3 + f2);
      this.jTO = z(this.jTO, this.jTS, this.hZC);
      paramCanvas.drawArc(localRectF2, -90.0F, this.jTO, true, this.jTK);
      if (this.jTU > 0) {
        break label367;
      }
      if (this.jTO == this.jTS)
      {
        this.jTQ = z(this.jTQ, this.jTT, this.hZC);
        paramCanvas.drawArc(localRectF1, this.jTS - 90, this.jTQ, true, this.jTL);
      }
      if (this.jTQ == this.jTT)
      {
        i = this.jTS;
        j = this.jTT;
        this.jTP = z(this.jTP, 360 - i - j, this.hZC);
        paramCanvas.drawArc(localRectF1, this.jTS - 90 + this.jTT, this.jTP, true, this.jTM);
      }
    }
    for (;;)
    {
      invalidate();
      GMTrace.o(7057705009152L, 52584);
      return;
      label367:
      if (this.jTO == this.jTS)
      {
        this.jTR = z(this.jTR, this.jTU, this.hZC);
        paramCanvas.drawArc(localRectF2, this.jTS - 90, this.jTR, true, this.jTN);
      }
      if (this.jTR == this.jTU)
      {
        this.jTQ = z(this.jTQ, this.jTT, this.hZC);
        paramCanvas.drawArc(localRectF1, this.jTU - 90 + this.jTS, this.jTQ, true, this.jTL);
      }
      if (this.jTQ == this.jTT)
      {
        i = this.jTS;
        j = this.jTT;
        int k = this.jTU;
        this.jTP = z(this.jTP, 360 - i - j - k, this.hZC);
        paramCanvas.drawArc(localRectF1, this.jTS - 90 + this.jTT + this.jTU, this.jTP, true, this.jTM);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\clean\ui\PieView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */