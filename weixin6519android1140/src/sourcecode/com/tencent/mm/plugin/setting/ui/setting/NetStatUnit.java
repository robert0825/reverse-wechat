package com.tencent.mm.plugin.setting.ui.setting;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.gmtrace.GMTrace;

class NetStatUnit
  extends View
{
  protected static int max;
  private int oGH;
  private int oGI;
  
  public NetStatUnit(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(4655878766592L, 34689);
    GMTrace.o(4655878766592L, 34689);
  }
  
  public NetStatUnit(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(4656012984320L, 34690);
    GMTrace.o(4656012984320L, 34690);
  }
  
  public NetStatUnit(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(4656147202048L, 34691);
    GMTrace.o(4656147202048L, 34691);
  }
  
  public final void cT(int paramInt1, int paramInt2)
  {
    GMTrace.i(4656281419776L, 34692);
    this.oGH = paramInt1;
    this.oGI = paramInt2;
    if (paramInt1 > 94371840) {
      this.oGH = 94371840;
    }
    if (paramInt2 > 94371840) {
      this.oGI = 94371840;
    }
    if (paramInt1 > paramInt2)
    {
      paramInt1 = (paramInt1 / 1572864 + 1) * 1572864;
      if (94371840 <= paramInt1) {
        break label94;
      }
      label63:
      if (3145728 >= paramInt1) {
        break label100;
      }
    }
    for (;;)
    {
      if (paramInt1 > max) {
        max = paramInt1;
      }
      GMTrace.o(4656281419776L, 34692);
      return;
      paramInt1 = paramInt2;
      break;
      label94:
      paramInt1 = 94371840;
      break label63;
      label100:
      paramInt1 = 3145728;
    }
  }
  
  @SuppressLint({"DrawAllocation"})
  public void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(4656415637504L, 34693);
    super.onDraw(paramCanvas);
    Paint localPaint = new Paint();
    Rect localRect1 = new Rect();
    getDrawingRect(localRect1);
    float f1 = localRect1.height() * this.oGI / max;
    float f2 = localRect1.width();
    Rect localRect2 = new Rect(localRect1.left, (int)(localRect1.bottom - f1), (int)(f2 * 0.6F + localRect1.left), localRect1.bottom);
    localPaint.setColor(-7829368);
    paramCanvas.drawRect(localRect2, localPaint);
    f1 = localRect1.height() * this.oGH / max;
    f2 = localRect1.width();
    localRect1 = new Rect(localRect1.left, (int)(localRect1.bottom - f1), (int)(f2 * 0.6F + localRect1.left), localRect1.bottom);
    localPaint.setColor(-16711936);
    paramCanvas.drawRect(localRect1, localPaint);
    GMTrace.o(4656415637504L, 34693);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\NetStatUnit.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */