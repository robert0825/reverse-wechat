package com.tencent.mm.plugin.appbrand.o;

import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.tencent.gmtrace.GMTrace;

public final class m
{
  public static ShapeDrawable g(int paramInt, float paramFloat)
  {
    GMTrace.i(18184220442624L, 135483);
    ShapeDrawable localShapeDrawable = new ShapeDrawable(new RoundRectShape(new float[] { paramFloat, paramFloat, paramFloat, paramFloat, paramFloat, paramFloat, paramFloat, paramFloat }, null, null));
    localShapeDrawable.getPaint().setColor(paramInt);
    GMTrace.o(18184220442624L, 135483);
    return localShapeDrawable;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\o\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */