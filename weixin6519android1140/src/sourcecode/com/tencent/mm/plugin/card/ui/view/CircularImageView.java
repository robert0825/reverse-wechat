package com.tencent.mm.plugin.card.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;

public class CircularImageView
  extends ImageView
{
  private Paint jrC;
  
  public CircularImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(17258654990336L, 128587);
    GMTrace.o(17258654990336L, 128587);
  }
  
  public CircularImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(17258789208064L, 128588);
    this.jrC = new Paint();
    GMTrace.o(17258789208064L, 128588);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(17258923425792L, 128589);
    Object localObject1 = getDrawable();
    if (localObject1 != null)
    {
      Object localObject2 = ((BitmapDrawable)localObject1).getBitmap();
      localObject1 = Bitmap.createBitmap(((Bitmap)localObject2).getWidth(), ((Bitmap)localObject2).getHeight(), Bitmap.Config.ARGB_8888);
      Object localObject3 = new Canvas((Bitmap)localObject1);
      Rect localRect = new Rect(0, 0, ((Bitmap)localObject2).getWidth(), ((Bitmap)localObject2).getHeight());
      RectF localRectF = new RectF(localRect);
      this.jrC.setAntiAlias(true);
      this.jrC.setDither(true);
      this.jrC.setFlags(1);
      ((Canvas)localObject3).setDrawFilter(new PaintFlagsDrawFilter(0, 3));
      ((Canvas)localObject3).drawARGB(0, 0, 0, 0);
      ((Canvas)localObject3).drawRoundRect(localRectF, 20.0F, 20.0F, this.jrC);
      this.jrC.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
      ((Canvas)localObject3).drawBitmap((Bitmap)localObject2, localRect, localRect, this.jrC);
      localObject2 = new Rect(0, 0, ((Bitmap)localObject1).getWidth(), ((Bitmap)localObject1).getHeight());
      localObject3 = new Rect(0, 0, getWidth(), getHeight());
      this.jrC.reset();
      paramCanvas.drawBitmap((Bitmap)localObject1, (Rect)localObject2, (Rect)localObject3, this.jrC);
      paramCanvas.save();
      GMTrace.o(17258923425792L, 128589);
      return;
    }
    super.onDraw(paramCanvas);
    GMTrace.o(17258923425792L, 128589);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\card\ui\view\CircularImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */