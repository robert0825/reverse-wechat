package com.tencent.mm.plugin.appbrand.ui.widget;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.memory.l;
import com.tencent.mm.modelappbrand.a.b.f;
import com.tencent.mm.sdk.platformtools.d;

public final class a
  implements b.f
{
  private final int iFa;
  private final int iFc;
  private final int iFe;
  
  public a(int paramInt1, int paramInt2)
  {
    GMTrace.i(20044880805888L, 149346);
    this.iFa = paramInt1;
    this.iFc = paramInt2;
    this.iFe = -1;
    GMTrace.o(20044880805888L, 149346);
  }
  
  public final String CX()
  {
    GMTrace.i(20045149241344L, 149348);
    GMTrace.o(20045149241344L, 149348);
    return "WxaNearbyShowcaseIcon";
  }
  
  public final Bitmap k(Bitmap paramBitmap)
  {
    GMTrace.i(20045015023616L, 149347);
    Bitmap localBitmap = d.a(paramBitmap, false, paramBitmap.getWidth() / 2, false);
    paramBitmap = Bitmap.createScaledBitmap(localBitmap, this.iFa, this.iFa, false);
    if (localBitmap != paramBitmap) {
      l.yn().h(localBitmap);
    }
    localBitmap = Bitmap.createBitmap(this.iFa + this.iFc * 2, this.iFa + this.iFc * 2, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    localCanvas.drawBitmap(paramBitmap, this.iFc, this.iFc, new Paint());
    l.yn().h(paramBitmap);
    paramBitmap = new Paint();
    paramBitmap.setColor(this.iFe);
    paramBitmap.setAntiAlias(true);
    paramBitmap.setStyle(Paint.Style.STROKE);
    paramBitmap.setStrokeWidth(this.iFc);
    localCanvas.drawCircle(this.iFa / 2 + this.iFc, this.iFa / 2 + this.iFc, this.iFa / 2, paramBitmap);
    GMTrace.o(20045015023616L, 149347);
    return localBitmap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\widget\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */