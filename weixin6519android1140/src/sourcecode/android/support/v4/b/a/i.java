package android.support.v4.b.a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;

public abstract class i
  extends Drawable
{
  public float ij;
  final Bitmap mBitmap;
  public final Paint mPaint = new Paint(3);
  private int tk = 160;
  private int tl = 119;
  public final BitmapShader tm;
  private final Matrix tn = new Matrix();
  final Rect to = new Rect();
  private final RectF tp = new RectF();
  private boolean tq = true;
  public boolean tr;
  private int ts;
  private int tt;
  
  i(Resources paramResources, Bitmap paramBitmap)
  {
    if (paramResources != null) {
      this.tk = paramResources.getDisplayMetrics().densityDpi;
    }
    this.mBitmap = paramBitmap;
    if (this.mBitmap != null)
    {
      this.ts = this.mBitmap.getScaledWidth(this.tk);
      this.tt = this.mBitmap.getScaledHeight(this.tk);
      this.tm = new BitmapShader(this.mBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
      return;
    }
    this.tt = -1;
    this.ts = -1;
    this.tm = null;
  }
  
  private void bu()
  {
    this.ij = (Math.min(this.tt, this.ts) / 2);
  }
  
  public static boolean n(float paramFloat)
  {
    return paramFloat > 0.05F;
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, Rect paramRect1, Rect paramRect2)
  {
    throw new UnsupportedOperationException();
  }
  
  final void bs()
  {
    if (this.tq)
    {
      if (!this.tr) {
        break label220;
      }
      int i = Math.min(this.ts, this.tt);
      a(this.tl, i, i, getBounds(), this.to);
      i = Math.min(this.to.width(), this.to.height());
      int j = Math.max(0, (this.to.width() - i) / 2);
      int k = Math.max(0, (this.to.height() - i) / 2);
      this.to.inset(j, k);
      this.ij = (i * 0.5F);
    }
    for (;;)
    {
      this.tp.set(this.to);
      if (this.tm != null)
      {
        this.tn.setTranslate(this.tp.left, this.tp.top);
        this.tn.preScale(this.tp.width() / this.mBitmap.getWidth(), this.tp.height() / this.mBitmap.getHeight());
        this.tm.setLocalMatrix(this.tn);
        this.mPaint.setShader(this.tm);
      }
      this.tq = false;
      return;
      label220:
      a(this.tl, this.ts, this.tt, getBounds(), this.to);
    }
  }
  
  public final void bt()
  {
    this.tr = true;
    this.tq = true;
    bu();
    this.mPaint.setShader(this.tm);
    invalidateSelf();
  }
  
  public void draw(Canvas paramCanvas)
  {
    Bitmap localBitmap = this.mBitmap;
    if (localBitmap == null) {
      return;
    }
    bs();
    if (this.mPaint.getShader() == null)
    {
      paramCanvas.drawBitmap(localBitmap, null, this.to, this.mPaint);
      return;
    }
    paramCanvas.drawRoundRect(this.tp, this.ij, this.ij, this.mPaint);
  }
  
  public int getAlpha()
  {
    return this.mPaint.getAlpha();
  }
  
  public ColorFilter getColorFilter()
  {
    return this.mPaint.getColorFilter();
  }
  
  public int getIntrinsicHeight()
  {
    return this.tt;
  }
  
  public int getIntrinsicWidth()
  {
    return this.ts;
  }
  
  public int getOpacity()
  {
    if ((this.tl != 119) || (this.tr)) {}
    Bitmap localBitmap;
    do
    {
      return -3;
      localBitmap = this.mBitmap;
    } while ((localBitmap == null) || (localBitmap.hasAlpha()) || (this.mPaint.getAlpha() < 255) || (n(this.ij)));
    return -1;
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    if (this.tr) {
      bu();
    }
    this.tq = true;
  }
  
  public void setAlpha(int paramInt)
  {
    if (paramInt != this.mPaint.getAlpha())
    {
      this.mPaint.setAlpha(paramInt);
      invalidateSelf();
    }
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.mPaint.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
  
  public void setDither(boolean paramBoolean)
  {
    this.mPaint.setDither(paramBoolean);
    invalidateSelf();
  }
  
  public void setFilterBitmap(boolean paramBoolean)
  {
    this.mPaint.setFilterBitmap(paramBoolean);
    invalidateSelf();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\b\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */