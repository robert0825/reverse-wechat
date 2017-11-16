package com.tencent.mm.memory.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.memory.i;
import com.tencent.mm.memory.n;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;

public class a
  extends Drawable
  implements i
{
  public static final Paint gid;
  private static final ae gie;
  boolean DEBUG;
  public n gif;
  private Runnable gig;
  protected String tag;
  
  static
  {
    GMTrace.i(1279229165568L, 9531);
    Paint localPaint = new Paint();
    gid = localPaint;
    localPaint.setAntiAlias(true);
    gid.setFilterBitmap(false);
    gid.setColor(-1118482);
    gie = new ae(Looper.getMainLooper());
    GMTrace.o(1279229165568L, 9531);
  }
  
  public a(String paramString, n paramn)
  {
    GMTrace.i(1277752770560L, 9520);
    this.DEBUG = false;
    this.gig = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1279900254208L, 9536);
        w.d("MicroMsg.MaskBitmapDrawable", "refresh tag=%s", new Object[] { a.this.tag });
        a.this.invalidateSelf();
        GMTrace.o(1279900254208L, 9536);
      }
    };
    this.tag = paramString;
    this.gif = paramn;
    GMTrace.o(1277752770560L, 9520);
  }
  
  public void draw(Canvas paramCanvas)
  {
    GMTrace.i(1277886988288L, 9521);
    Rect localRect = getBounds();
    n localn = this.gif;
    if ((localn == null) || (localn.isRecycled()))
    {
      paramCanvas.drawColor(-1118482);
      GMTrace.o(1277886988288L, 9521);
      return;
    }
    Paint localPaint = gid;
    paramCanvas.drawBitmap(localn.bitmap, null, localRect, localPaint);
    GMTrace.o(1277886988288L, 9521);
  }
  
  public int getIntrinsicHeight()
  {
    GMTrace.i(1278826512384L, 9528);
    if (this.gif == null)
    {
      GMTrace.o(1278826512384L, 9528);
      return 0;
    }
    n localn = this.gif;
    if ((localn != null) && (!localn.isRecycled()))
    {
      int i = localn.bitmap.getHeight();
      GMTrace.o(1278826512384L, 9528);
      return i;
    }
    GMTrace.o(1278826512384L, 9528);
    return 0;
  }
  
  public int getIntrinsicWidth()
  {
    GMTrace.i(1278692294656L, 9527);
    if (this.gif == null)
    {
      GMTrace.o(1278692294656L, 9527);
      return 0;
    }
    n localn = this.gif;
    if ((localn != null) && (!localn.isRecycled()))
    {
      int i = localn.bitmap.getWidth();
      GMTrace.o(1278692294656L, 9527);
      return i;
    }
    GMTrace.o(1278692294656L, 9527);
    return 0;
  }
  
  public int getOpacity()
  {
    GMTrace.i(1278289641472L, 9524);
    GMTrace.o(1278289641472L, 9524);
    return 0;
  }
  
  public void setAlpha(int paramInt)
  {
    GMTrace.i(1278423859200L, 9525);
    GMTrace.o(1278423859200L, 9525);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    GMTrace.i(1278558076928L, 9526);
    GMTrace.o(1278558076928L, 9526);
  }
  
  public String toString()
  {
    GMTrace.i(1279094947840L, 9530);
    if (this.DEBUG)
    {
      String str2 = super.toString() + " code: " + hashCode();
      str1 = str2;
      if (this.gif != null) {
        str1 = str2 + this.gif;
      }
      GMTrace.o(1279094947840L, 9530);
      return str1;
    }
    String str1 = super.toString();
    GMTrace.o(1279094947840L, 9530);
    return str1;
  }
  
  public final void yl()
  {
    GMTrace.i(1278021206016L, 9522);
    if (this.gif != null) {
      this.gif.yl();
    }
    GMTrace.o(1278021206016L, 9522);
  }
  
  public final void ym()
  {
    GMTrace.i(1278155423744L, 9523);
    if (this.gif != null) {
      this.gif.ym();
    }
    GMTrace.o(1278155423744L, 9523);
  }
  
  public final n yu()
  {
    GMTrace.i(1278960730112L, 9529);
    if (this.gif != null)
    {
      n localn = this.gif;
      GMTrace.o(1278960730112L, 9529);
      return localn;
    }
    GMTrace.o(1278960730112L, 9529);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\memory\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */