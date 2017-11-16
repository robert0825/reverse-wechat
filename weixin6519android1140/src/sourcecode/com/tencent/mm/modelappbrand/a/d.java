package com.tencent.mm.modelappbrand.a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import com.tencent.gmtrace.GMTrace;

final class d
  extends BitmapDrawable
{
  d(Resources paramResources, Bitmap paramBitmap)
  {
    super(paramResources, paramBitmap);
    GMTrace.i(12923019722752L, 96284);
    GMTrace.o(12923019722752L, 96284);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    GMTrace.i(12923153940480L, 96285);
    if ((getBitmap() != null) && (!getBitmap().isRecycled())) {
      super.draw(paramCanvas);
    }
    GMTrace.o(12923153940480L, 96285);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelappbrand\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */