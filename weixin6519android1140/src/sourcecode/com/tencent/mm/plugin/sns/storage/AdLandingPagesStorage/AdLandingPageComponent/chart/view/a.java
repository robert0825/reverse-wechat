package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.c;

public final class a
  extends View
{
  private c pFZ;
  
  public a(Context paramContext, c paramc)
  {
    super(paramContext);
    GMTrace.i(8210769510400L, 61175);
    this.pFZ = paramc;
    GMTrace.o(8210769510400L, 61175);
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(8210903728128L, 61176);
    super.onDraw(paramCanvas);
    int k = getHeight();
    int i = getWidth();
    int j = (int)(Math.min(k, i) / 2.0F * 0.8D);
    i = (int)(i / 2.0F);
    k = (int)(k / 2.0F);
    Bitmap localBitmap = this.pFZ.pFH;
    if (localBitmap != null)
    {
      j = (int)(j * 2 + this.pFZ.pFI * 2.0F);
      int m = localBitmap.getWidth() * j / localBitmap.getHeight();
      paramCanvas.drawBitmap(Bitmap.createScaledBitmap(localBitmap, m, j, false), i - (m >>> 1), k - (j >>> 1), null);
    }
    GMTrace.o(8210903728128L, 61176);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\chart\view\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */