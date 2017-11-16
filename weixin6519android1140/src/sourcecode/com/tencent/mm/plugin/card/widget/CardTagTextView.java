package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;

public class CardTagTextView
  extends TextView
{
  public int fillColor;
  private int jDk;
  private RectF jLB;
  private Paint jLC;
  private int jLD;
  private int jLE;
  
  public CardTagTextView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(4886330605568L, 36406);
    this.jLB = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
    this.jLC = new Paint();
    this.jDk = 3;
    this.jLD = 9;
    this.jLE = 0;
    this.fillColor = 0;
    init();
    GMTrace.o(4886330605568L, 36406);
  }
  
  public CardTagTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(4886464823296L, 36407);
    this.jLB = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
    this.jLC = new Paint();
    this.jDk = 3;
    this.jLD = 9;
    this.jLE = 0;
    this.fillColor = 0;
    init();
    GMTrace.o(4886464823296L, 36407);
  }
  
  public CardTagTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(4886599041024L, 36408);
    this.jLB = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
    this.jLC = new Paint();
    this.jDk = 3;
    this.jLD = 9;
    this.jLE = 0;
    this.fillColor = 0;
    init();
    GMTrace.o(4886599041024L, 36408);
  }
  
  private void init()
  {
    GMTrace.i(4886733258752L, 36409);
    this.jDk = Math.round(a.getDensity(getContext()) * 0.5F);
    this.jLD = a.fromDPToPix(getContext(), 3);
    this.jLE = getCurrentTextColor();
    GMTrace.o(4886733258752L, 36409);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(4887001694208L, 36411);
    this.jLB.left = this.jLD;
    this.jLB.top = this.jDk;
    this.jLB.right = (getWidth() - this.jLD);
    this.jLB.bottom = (getHeight() - this.jDk);
    if (this.fillColor != 0)
    {
      this.jLC.setColor(this.fillColor);
      this.jLC.setStyle(Paint.Style.FILL);
      paramCanvas.drawRoundRect(this.jLB, getHeight() / 2 - this.jDk, getHeight() / 2 - this.jDk, this.jLC);
    }
    this.jLC.setColor(this.jLE);
    this.jLC.setStrokeWidth(this.jDk);
    this.jLC.setStyle(Paint.Style.STROKE);
    paramCanvas.drawRoundRect(this.jLB, getHeight() / 2 - this.jDk, getHeight() / 2 - this.jDk, this.jLC);
    super.onDraw(paramCanvas);
    GMTrace.o(4887001694208L, 36411);
  }
  
  public void setTextColor(int paramInt)
  {
    GMTrace.i(4886867476480L, 36410);
    this.jLE = paramInt;
    super.setTextColor(paramInt);
    GMTrace.o(4886867476480L, 36410);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\widget\CardTagTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */