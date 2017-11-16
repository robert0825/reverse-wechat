package com.tencent.mm.view.b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;

public final class c
  extends a
{
  public c(Context paramContext, b paramb)
  {
    super(paramContext, paramb);
    GMTrace.i(19643569799168L, 146356);
    GMTrace.o(19643569799168L, 146356);
  }
  
  protected final boolean ckL()
  {
    GMTrace.i(19643972452352L, 146359);
    GMTrace.o(19643972452352L, 146359);
    return false;
  }
  
  public final boolean ckM()
  {
    GMTrace.i(19643838234624L, 146358);
    GMTrace.o(19643838234624L, 146358);
    return false;
  }
  
  public final Rect ckN()
  {
    GMTrace.i(19643704016896L, 146357);
    if (super.ckN().isEmpty())
    {
      localRect = this.xAv;
      GMTrace.o(19643704016896L, 146357);
      return localRect;
    }
    Rect localRect = super.ckN();
    GMTrace.o(19643704016896L, 146357);
    return localRect;
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(19644106670080L, 146360);
    paramCanvas.drawColor(0);
    paramCanvas.setMatrix(this.evj);
    this.evi.onDraw(paramCanvas);
    GMTrace.o(19644106670080L, 146360);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\view\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */