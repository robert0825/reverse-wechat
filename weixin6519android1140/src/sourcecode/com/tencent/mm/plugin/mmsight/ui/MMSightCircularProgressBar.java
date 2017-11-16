package com.tencent.mm.plugin.mmsight.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.u.a.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;

public class MMSightCircularProgressBar
  extends View
{
  int duration;
  boolean isStart;
  private Paint jrC;
  float ngP;
  int ngQ;
  int ngR;
  private RectF ngS;
  b ngT;
  a ngU;
  private int ngV;
  private float strokeWidth;
  private float yD;
  
  public MMSightCircularProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7388417490944L, 55048);
    this.ngP = 0.0F;
    this.ngQ = 0;
    this.ngR = 0;
    this.duration = 0;
    this.strokeWidth = 0.0F;
    this.yD = 0.0F;
    this.isStart = false;
    this.ngV = Color.parseColor("#1AAD19");
    init();
    GMTrace.o(7388417490944L, 55048);
  }
  
  public MMSightCircularProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(7388551708672L, 55049);
    this.ngP = 0.0F;
    this.ngQ = 0;
    this.ngR = 0;
    this.duration = 0;
    this.strokeWidth = 0.0F;
    this.yD = 0.0F;
    this.isStart = false;
    this.ngV = Color.parseColor("#1AAD19");
    init();
    GMTrace.o(7388551708672L, 55049);
  }
  
  private void init()
  {
    GMTrace.i(7388685926400L, 55050);
    float f = getResources().getDimensionPixelSize(a.b.nkr);
    this.strokeWidth = getResources().getDimensionPixelSize(a.b.nkt);
    this.yD = (this.strokeWidth / 2.0F);
    this.ngS = new RectF(this.yD, this.yD, f - this.yD, f - this.yD);
    this.jrC = new Paint();
    this.jrC.setStyle(Paint.Style.STROKE);
    this.jrC.setStrokeWidth(this.strokeWidth);
    this.jrC.setColor(this.ngV);
    this.jrC.setAlpha(153);
    this.jrC.setAntiAlias(true);
    GMTrace.o(7388685926400L, 55050);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(7388820144128L, 55051);
    paramCanvas.save();
    paramCanvas.translate(this.yD, this.yD);
    paramCanvas.rotate(180.0F, this.ngS.right / 2.0F, this.ngS.bottom / 2.0F);
    paramCanvas.drawArc(this.ngS, 90.0F, 360.0F * (this.ngP / this.ngR), false, this.jrC);
    paramCanvas.restore();
    GMTrace.o(7388820144128L, 55051);
  }
  
  public static abstract interface a
  {
    public abstract void aQp();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\ui\MMSightCircularProgressBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */