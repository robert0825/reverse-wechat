package com.tencent.mm.plugin.game.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;

public class TextProgressBar
  extends ProgressBar
{
  private String iJz;
  private int ini;
  private Context mContext;
  private Paint mPaint;
  private int rr;
  
  public TextProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12583448870912L, 93754);
    this.mContext = paramContext;
    GMTrace.o(12583448870912L, 93754);
  }
  
  public final void oX(int paramInt)
  {
    GMTrace.i(12583851524096L, 93757);
    this.ini = a.fromDPToPix(this.mContext, paramInt);
    GMTrace.o(12583851524096L, 93757);
  }
  
  @SuppressLint({"DrawAllocation"})
  protected void onDraw(Canvas paramCanvas)
  {
    try
    {
      GMTrace.i(12583717306368L, 93756);
      super.onDraw(paramCanvas);
      this.mPaint = new Paint();
      this.mPaint.setAntiAlias(true);
      this.mPaint.setColor(Color.rgb(69, 192, 26));
      this.mPaint.setTextSize(this.ini);
      Object localObject = new Rect();
      this.mPaint.getTextBounds(this.iJz, 0, this.iJz.length(), (Rect)localObject);
      float f1 = getWidth() / 2 - ((Rect)localObject).centerX();
      float f2 = getHeight() / 2 - ((Rect)localObject).centerY();
      paramCanvas.drawText(this.iJz, f1, f2, this.mPaint);
      float f3 = this.rr / 100.0F * getWidth();
      if (f3 > f1)
      {
        localObject = new Paint();
        ((Paint)localObject).setColor(-1);
        ((Paint)localObject).setAntiAlias(true);
        ((Paint)localObject).setTextSize(this.ini);
        RectF localRectF = new RectF(0.0F, 0.0F, f3, getHeight());
        paramCanvas.save();
        paramCanvas.clipRect(localRectF);
        paramCanvas.drawText(this.iJz, f1, f2, (Paint)localObject);
        paramCanvas.restore();
      }
      GMTrace.o(12583717306368L, 93756);
      return;
    }
    finally {}
  }
  
  public void setProgress(int paramInt)
  {
    GMTrace.i(12583583088640L, 93755);
    this.rr = paramInt;
    this.iJz = (String.valueOf(paramInt) + "%");
    super.setProgress(paramInt);
    GMTrace.o(12583583088640L, 93755);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\widget\TextProgressBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */