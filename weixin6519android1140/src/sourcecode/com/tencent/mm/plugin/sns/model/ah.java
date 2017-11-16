package com.tencent.mm.plugin.sns.model;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.memory.a.a;
import com.tencent.mm.memory.n;
import com.tencent.mm.plugin.sns.data.i;
import java.util.HashMap;
import java.util.Map;

public final class ah
  extends a
{
  int alpha;
  long lFs;
  boolean lFt;
  private Map<String, Boolean> pvp;
  
  public ah(String paramString, n paramn, long paramLong)
  {
    super(paramString, paramn);
    GMTrace.i(8091852603392L, 60289);
    this.lFt = false;
    this.alpha = 255;
    this.pvp = new HashMap();
    if (paramLong != 0L)
    {
      this.lFs = paramLong;
      this.pvp.put(paramString, Boolean.valueOf(true));
      this.lFt = true;
      GMTrace.o(8091852603392L, 60289);
      return;
    }
    if (!this.pvp.containsKey(paramString))
    {
      this.lFs = SystemClock.uptimeMillis();
      this.pvp.put(paramString, Boolean.valueOf(true));
      this.lFt = true;
    }
    GMTrace.o(8091852603392L, 60289);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    GMTrace.i(8091986821120L, 60290);
    Rect localRect = getBounds();
    Bitmap localBitmap = this.gif.yq();
    if (!i.m(localBitmap))
    {
      paramCanvas.drawColor(-1118482);
      this.lFs = 0L;
      GMTrace.o(8091986821120L, 60290);
      return;
    }
    float f;
    if (this.lFt)
    {
      f = (float)(SystemClock.uptimeMillis() - this.lFs) / 150.0F;
      if (this.lFs == 0L) {
        f = 0.0F;
      }
      if (f >= 1.0F) {
        this.lFt = false;
      }
    }
    else
    {
      gid.setAlpha(this.alpha);
      paramCanvas.drawBitmap(localBitmap, null, localRect, gid);
      GMTrace.o(8091986821120L, 60290);
      return;
    }
    int i = (int)(f * this.alpha);
    gid.setAlpha(i);
    paramCanvas.drawBitmap(localBitmap, null, localRect, gid);
    invalidateSelf();
    GMTrace.o(8091986821120L, 60290);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */