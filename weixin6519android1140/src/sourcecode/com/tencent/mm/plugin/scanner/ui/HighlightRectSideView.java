package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.compatible.f.a;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;

public class HighlightRectSideView
  extends View
{
  private aj htb;
  private Paint mk;
  private boolean[] ovN;
  private Rect ovO;
  private int ovP;
  private int ovQ;
  private int ovR;
  private int ovS;
  
  public HighlightRectSideView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6060601507840L, 45155);
    this.ovS = 0;
    this.htb = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(6084760698880L, 45335);
        HighlightRectSideView.a(HighlightRectSideView.this);
        HighlightRectSideView.this.invalidate();
        GMTrace.o(6084760698880L, 45335);
        return true;
      }
    }, true);
    paramContext = a.decodeResource(getResources(), R.g.aZJ);
    this.ovP = paramContext.getWidth();
    this.ovQ = paramContext.getHeight();
    if (this.ovQ != this.ovP) {
      w.e("MicroMsg.HighlightRectSideView", "width is not same as height");
    }
    this.ovR = (this.ovP * 6 / 24);
    this.ovN = new boolean[4];
    this.mk = new Paint();
    this.mk.setColor(6676738);
    this.mk.setAlpha(255);
    this.mk.setStrokeWidth(this.ovR);
    this.mk.setStyle(Paint.Style.STROKE);
    this.htb.z(300L, 300L);
    GMTrace.o(6060601507840L, 45155);
  }
  
  public final void a(boolean[] paramArrayOfBoolean)
  {
    int i = 0;
    GMTrace.i(6061138378752L, 45159);
    if ((paramArrayOfBoolean == null) || (4 != paramArrayOfBoolean.length))
    {
      GMTrace.o(6061138378752L, 45159);
      return;
    }
    w.d("MicroMsg.HighlightRectSideView", "%s, %s, %s, %s", new Object[] { Boolean.valueOf(paramArrayOfBoolean[0]), Boolean.valueOf(paramArrayOfBoolean[1]), Boolean.valueOf(paramArrayOfBoolean[2]), Boolean.valueOf(paramArrayOfBoolean[3]) });
    while (i < 4)
    {
      this.ovN[i] = paramArrayOfBoolean[i];
      i += 1;
    }
    invalidate();
    GMTrace.o(6061138378752L, 45159);
  }
  
  public final void i(Rect paramRect)
  {
    GMTrace.i(6060735725568L, 45156);
    this.ovO = paramRect;
    w.d("MicroMsg.HighlightRectSideView", "rect:%s", new Object[] { paramRect });
    GMTrace.o(6060735725568L, 45156);
  }
  
  protected void onDetachedFromWindow()
  {
    GMTrace.i(6060869943296L, 45157);
    super.onDetachedFromWindow();
    if (this.htb != null)
    {
      this.htb.stopTimer();
      this.htb = null;
    }
    GMTrace.o(6060869943296L, 45157);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(6061004161024L, 45158);
    super.onDraw(paramCanvas);
    int i = 0;
    if (i < 4) {
      if (this.ovN[i] != 0) {}
    }
    for (i = 0;; i = 1)
    {
      int j = this.ovR / 2;
      if ((this.ovN[0] != 0) && ((1 == i) || (this.ovS % 2 == 0))) {
        paramCanvas.drawLine(this.ovO.left + j, this.ovO.top + this.ovQ, this.ovO.left + j, this.ovO.bottom - this.ovQ, this.mk);
      }
      if ((this.ovN[1] != 0) && ((1 == i) || (this.ovS % 2 == 0))) {
        paramCanvas.drawLine(this.ovO.right - j, this.ovO.top + this.ovQ, this.ovO.right - j, this.ovO.bottom - this.ovQ, this.mk);
      }
      if ((this.ovN[2] != 0) && ((1 == i) || (this.ovS % 3 == 0))) {
        paramCanvas.drawLine(this.ovO.left + this.ovP, this.ovO.top + j, this.ovO.right - this.ovP, this.ovO.top + j, this.mk);
      }
      if ((this.ovN[3] != 0) && ((1 == i) || (this.ovS % 3 == 0))) {
        paramCanvas.drawLine(this.ovO.left + this.ovP, this.ovO.bottom - j, this.ovO.right - this.ovP, this.ovO.bottom - j, this.mk);
      }
      GMTrace.o(6061004161024L, 45158);
      return;
      i += 1;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\HighlightRectSideView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */