package com.tencent.mm.plugin.voip.video;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;

public final class e
  extends View
{
  public int ev;
  private RectF iQY;
  private Matrix mMatrix;
  private Paint mPaint;
  public int qOB;
  public int qOC;
  public int qOD;
  
  public e(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(5382265110528L, 40101);
    this.mPaint = new Paint();
    this.mPaint.setStyle(Paint.Style.STROKE);
    this.mPaint.setColor(-65536);
    this.mPaint.setStrokeWidth(a.fromDPToPix(getContext(), 3));
    this.mMatrix = new Matrix();
    GMTrace.o(5382265110528L, 40101);
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(5382399328256L, 40102);
    if (this.iQY != null)
    {
      paramCanvas.save();
      paramCanvas.rotate(0.0F);
      paramCanvas.drawRect(this.iQY, this.mPaint);
      paramCanvas.restore();
    }
    GMTrace.o(5382399328256L, 40102);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\video\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */