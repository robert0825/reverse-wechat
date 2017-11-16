package com.tencent.mm.plugin.sns.ui.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.l;

public class SnsTextProgressBar
  extends ProgressBar
{
  private String iJz;
  private int ini;
  private Context mContext;
  private Paint mPaint;
  private int rr;
  
  public SnsTextProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8332102336512L, 62079);
    this.mContext = paramContext;
    paramContext = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, i.l.plG, 0, 0);
    try
    {
      int i = paramContext.getInteger(i.l.plH, 18);
      this.ini = a.fromDPToPix(this.mContext, i);
      paramContext.recycle();
      GMTrace.o(8332102336512L, 62079);
      return;
    }
    finally
    {
      paramContext.recycle();
    }
  }
  
  @SuppressLint({"DrawAllocation"})
  protected void onDraw(Canvas paramCanvas)
  {
    try
    {
      GMTrace.i(8332370771968L, 62081);
      super.onDraw(paramCanvas);
      this.mPaint = new Paint();
      this.mPaint.setAntiAlias(true);
      this.mPaint.setColor(this.mContext.getResources().getColor(i.c.oXm));
      this.mPaint.setTextSize(this.ini);
      Rect localRect = new Rect();
      this.mPaint.getTextBounds(this.iJz, 0, this.iJz.length(), localRect);
      float f1 = getWidth() / 2 - localRect.centerX();
      float f2 = getHeight() / 2 - localRect.centerY();
      paramCanvas.drawText(this.iJz, f1, f2, this.mPaint);
      GMTrace.o(8332370771968L, 62081);
      return;
    }
    finally
    {
      paramCanvas = finally;
      throw paramCanvas;
    }
  }
  
  public void setProgress(int paramInt)
  {
    GMTrace.i(8332236554240L, 62080);
    this.rr = paramInt;
    this.iJz = (String.valueOf(paramInt) + "%");
    super.setProgress(paramInt);
    GMTrace.o(8332236554240L, 62080);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\widget\SnsTextProgressBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */