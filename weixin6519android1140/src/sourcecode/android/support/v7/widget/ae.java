package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

final class ae
  extends Drawable
{
  float Vl;
  private final RectF Vm;
  private final Rect Vn;
  float Vo;
  boolean Vp = false;
  boolean Vq = true;
  private PorterDuffColorFilter lx;
  private final Paint mPaint;
  private ColorStateList mv;
  private PorterDuff.Mode mw;
  
  public ae(int paramInt, float paramFloat)
  {
    this.Vl = paramFloat;
    this.mPaint = new Paint(5);
    this.mPaint.setColor(paramInt);
    this.Vm = new RectF();
    this.Vn = new Rect();
  }
  
  private PorterDuffColorFilter b(ColorStateList paramColorStateList, PorterDuff.Mode paramMode)
  {
    if ((paramColorStateList == null) || (paramMode == null)) {
      return null;
    }
    return new PorterDuffColorFilter(paramColorStateList.getColorForState(getState(), 0), paramMode);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    Paint localPaint = this.mPaint;
    if ((this.lx != null) && (localPaint.getColorFilter() == null)) {
      localPaint.setColorFilter(this.lx);
    }
    for (int i = 1;; i = 0)
    {
      paramCanvas.drawRoundRect(this.Vm, this.Vl, this.Vl, localPaint);
      if (i != 0) {
        localPaint.setColorFilter(null);
      }
      return;
    }
  }
  
  final void f(Rect paramRect)
  {
    Rect localRect = paramRect;
    if (paramRect == null) {
      localRect = getBounds();
    }
    this.Vm.set(localRect.left, localRect.top, localRect.right, localRect.bottom);
    this.Vn.set(localRect);
    if (this.Vp)
    {
      float f1 = af.a(this.Vo, this.Vl, this.Vq);
      float f2 = af.b(this.Vo, this.Vl, this.Vq);
      this.Vn.inset((int)Math.ceil(f2), (int)Math.ceil(f1));
      this.Vm.set(this.Vn);
    }
  }
  
  public final int getOpacity()
  {
    return -3;
  }
  
  public final void getOutline(Outline paramOutline)
  {
    paramOutline.setRoundRect(this.Vn, this.Vl);
  }
  
  public final boolean isStateful()
  {
    return ((this.mv != null) && (this.mv.isStateful())) || (super.isStateful());
  }
  
  protected final void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    f(paramRect);
  }
  
  protected final boolean onStateChange(int[] paramArrayOfInt)
  {
    if ((this.mv != null) && (this.mw != null))
    {
      this.lx = b(this.mv, this.mw);
      return true;
    }
    return false;
  }
  
  public final void setAlpha(int paramInt)
  {
    this.mPaint.setAlpha(paramInt);
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    this.mPaint.setColorFilter(paramColorFilter);
  }
  
  public final void setTintList(ColorStateList paramColorStateList)
  {
    this.mv = paramColorStateList;
    this.lx = b(this.mv, this.mw);
    invalidateSelf();
  }
  
  public final void setTintMode(PorterDuff.Mode paramMode)
  {
    this.mw = paramMode;
    this.lx = b(this.mv, this.mw);
    invalidateSelf();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\android\support\v7\widget\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */