package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.v4.b.b;

class d
  extends Drawable
{
  final Rect eI = new Rect();
  final RectF eJ = new RectF();
  float eK;
  int eL;
  int eM;
  int eN;
  int eO;
  private ColorStateList eP;
  private int eQ;
  boolean eR = true;
  float eS;
  final Paint mPaint = new Paint(1);
  
  public d()
  {
    this.mPaint.setStyle(Paint.Style.STROKE);
  }
  
  final void c(ColorStateList paramColorStateList)
  {
    if (paramColorStateList != null) {
      this.eQ = paramColorStateList.getColorForState(getState(), this.eQ);
    }
    this.eP = paramColorStateList;
    this.eR = true;
    invalidateSelf();
  }
  
  public void draw(Canvas paramCanvas)
  {
    if (this.eR)
    {
      localObject1 = this.mPaint;
      Object localObject2 = this.eI;
      copyBounds((Rect)localObject2);
      f1 = this.eK / ((Rect)localObject2).height();
      int i = b.h(this.eL, this.eQ);
      int j = b.h(this.eM, this.eQ);
      int k = b.h(b.i(this.eM, 0), this.eQ);
      int m = b.h(b.i(this.eO, 0), this.eQ);
      int n = b.h(this.eO, this.eQ);
      int i1 = b.h(this.eN, this.eQ);
      float f2 = ((Rect)localObject2).top;
      float f3 = ((Rect)localObject2).bottom;
      localObject2 = Shader.TileMode.CLAMP;
      ((Paint)localObject1).setShader(new LinearGradient(0.0F, f2, 0.0F, f3, new int[] { i, j, k, m, n, i1 }, new float[] { 0.0F, f1, 0.5F, 0.5F, 1.0F - f1, 1.0F }, (Shader.TileMode)localObject2));
      this.eR = false;
    }
    float f1 = this.mPaint.getStrokeWidth() / 2.0F;
    Object localObject1 = this.eJ;
    copyBounds(this.eI);
    ((RectF)localObject1).set(this.eI);
    ((RectF)localObject1).left += f1;
    ((RectF)localObject1).top += f1;
    ((RectF)localObject1).right -= f1;
    ((RectF)localObject1).bottom -= f1;
    paramCanvas.save();
    paramCanvas.rotate(this.eS, ((RectF)localObject1).centerX(), ((RectF)localObject1).centerY());
    paramCanvas.drawOval((RectF)localObject1, this.mPaint);
    paramCanvas.restore();
  }
  
  public int getOpacity()
  {
    if (this.eK > 0.0F) {
      return -3;
    }
    return -2;
  }
  
  public boolean getPadding(Rect paramRect)
  {
    int i = Math.round(this.eK);
    paramRect.set(i, i, i, i);
    return true;
  }
  
  public boolean isStateful()
  {
    return ((this.eP != null) && (this.eP.isStateful())) || (super.isStateful());
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    this.eR = true;
  }
  
  protected boolean onStateChange(int[] paramArrayOfInt)
  {
    if (this.eP != null)
    {
      int i = this.eP.getColorForState(paramArrayOfInt, this.eQ);
      if (i != this.eQ)
      {
        this.eR = true;
        this.eQ = i;
      }
    }
    if (this.eR) {
      invalidateSelf();
    }
    return this.eR;
  }
  
  public void setAlpha(int paramInt)
  {
    this.mPaint.setAlpha(paramInt);
    invalidateSelf();
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.mPaint.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */