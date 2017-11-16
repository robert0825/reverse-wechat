package com.tencent.mm.plugin.wenote.model.nativenote.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.gmtrace.GMTrace;

public final class a
  extends View
{
  public int jRR;
  private Paint mPaint;
  private int mType;
  private int ryr;
  private RectF sfL;
  private RectF sfM;
  private RectF sfN;
  private RectF sfO;
  public int sfP;
  private int sfQ;
  private int sfR;
  private a sfS;
  
  public a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, a parama)
  {
    super(paramContext);
    GMTrace.i(20608595263488L, 153546);
    this.mType = 2;
    this.mType = paramInt1;
    this.sfQ = paramInt2;
    this.ryr = paramInt3;
    this.sfP = (this.sfQ * 2 / 5);
    this.jRR = this.sfP;
    this.sfR = (this.sfP * 3 / 4);
    this.mPaint = new Paint(1);
    this.mPaint.setColor(paramInt4);
    this.sfS = parama;
    this.sfL = new RectF(this.jRR, this.sfQ, this.jRR + this.sfP * 2, this.sfQ + this.sfP * 2);
    this.sfM = new RectF(this.sfR - this.sfP, this.sfQ, this.sfR + this.sfP, this.sfQ + this.sfP * 2);
    this.sfN = new RectF(this.jRR, this.sfQ, this.jRR + this.sfP * 2, this.sfQ + this.sfP * 2);
    this.sfO = new RectF(this.jRR + this.ryr, this.sfQ, this.jRR + this.ryr + this.sfP * 2, this.sfQ + this.sfP * 2);
    GMTrace.o(20608595263488L, 153546);
  }
  
  public final int bhb()
  {
    GMTrace.i(20608729481216L, 153547);
    int i = this.sfQ;
    int j = this.sfP;
    int k = this.jRR;
    GMTrace.o(20608729481216L, 153547);
    return i + j * 2 + k;
  }
  
  public final int bqt()
  {
    GMTrace.i(20608863698944L, 153548);
    if ((this.mType == 3) || (this.mType == 4))
    {
      i = this.jRR;
      j = this.sfP;
      k = this.sfR;
      GMTrace.o(20608863698944L, 153548);
      return i + j + k;
    }
    int i = this.ryr;
    int j = this.jRR;
    int k = this.sfP;
    GMTrace.o(20608863698944L, 153548);
    return i + (j + k) * 2;
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(20608997916672L, 153549);
    switch (this.mType)
    {
    }
    for (;;)
    {
      GMTrace.o(20608997916672L, 153549);
      return;
      paramCanvas.drawRect(this.jRR + this.sfP, 0.0F, this.jRR + this.sfP + this.ryr, this.sfQ + this.sfP * 2, this.mPaint);
      paramCanvas.drawArc(this.sfN, 90.0F, 180.0F, true, this.mPaint);
      paramCanvas.drawArc(this.sfO, 270.0F, 180.0F, true, this.mPaint);
      GMTrace.o(20608997916672L, 153549);
      return;
      paramCanvas.drawRect(this.jRR + this.sfP + this.sfR - this.ryr, 0.0F, this.jRR + this.sfP + this.sfR, this.sfQ, this.mPaint);
      paramCanvas.drawArc(this.sfL, 90.0F, 180.0F, true, this.mPaint);
      paramCanvas.drawRect(this.jRR + this.sfP, this.sfQ, this.jRR + this.sfP + this.sfR, this.sfQ + this.sfP * 2, this.mPaint);
      GMTrace.o(20608997916672L, 153549);
      return;
      paramCanvas.drawRect(0.0F, 0.0F, this.ryr, this.sfQ, this.mPaint);
      paramCanvas.drawRect(0.0F, this.sfQ, this.sfR, this.sfQ + this.sfP * 2, this.mPaint);
      paramCanvas.drawArc(this.sfM, 270.0F, 180.0F, true, this.mPaint);
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(20609132134400L, 153550);
    if (this.sfS != null) {
      this.sfS.a(this.mType, paramMotionEvent);
    }
    GMTrace.o(20609132134400L, 153550);
    return true;
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt, MotionEvent paramMotionEvent);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */