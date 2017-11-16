package android.support.v7.widget;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.v7.b.a.a;
import android.support.v7.b.a.b;

final class af
  extends Drawable
{
  static a Vs;
  static final double jdField_if = Math.cos(Math.toRadians(45.0D));
  final int Vr;
  final RectF Vt;
  Paint ig;
  Paint ih;
  float ij;
  Path ik;
  float il;
  float im;
  float in;
  float io;
  private boolean iq = true;
  private final int ir;
  private final int it;
  boolean iu = true;
  private boolean iv = false;
  Paint mPaint;
  
  af(Resources paramResources, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.ir = paramResources.getColor(a.a.HX);
    this.it = paramResources.getColor(a.a.HW);
    this.Vr = paramResources.getDimensionPixelSize(a.b.HY);
    this.mPaint = new Paint(5);
    this.mPaint.setColor(paramInt);
    this.ig = new Paint(5);
    this.ig.setStyle(Paint.Style.FILL);
    this.ij = ((int)(paramFloat1 + 0.5F));
    this.Vt = new RectF();
    this.ih = new Paint(this.ig);
    this.ih.setAntiAlias(false);
    if (paramFloat2 < 0.0F) {
      throw new IllegalArgumentException("Invalid shadow size " + paramFloat2 + ". Must be >= 0");
    }
    if (paramFloat3 < 0.0F) {
      throw new IllegalArgumentException("Invalid max shadow size " + paramFloat3 + ". Must be >= 0");
    }
    paramFloat2 = k(paramFloat2);
    paramFloat3 = k(paramFloat3);
    paramFloat1 = paramFloat2;
    if (paramFloat2 > paramFloat3)
    {
      if (!this.iv) {
        this.iv = true;
      }
      paramFloat1 = paramFloat3;
    }
    if ((this.io != paramFloat1) || (this.im != paramFloat3))
    {
      this.io = paramFloat1;
      this.im = paramFloat3;
      this.in = ((int)(paramFloat1 * 1.5F + this.Vr + 0.5F));
      this.il = (this.Vr + paramFloat3);
      this.iq = true;
      invalidateSelf();
    }
  }
  
  static float a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (paramBoolean) {
      return (float)(1.5F * paramFloat1 + (1.0D - if) * paramFloat2);
    }
    return 1.5F * paramFloat1;
  }
  
  static float b(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    float f = paramFloat1;
    if (paramBoolean) {
      f = (float)(paramFloat1 + (1.0D - if) * paramFloat2);
    }
    return f;
  }
  
  private static int k(float paramFloat)
  {
    int j = (int)(0.5F + paramFloat);
    int i = j;
    if (j % 2 == 1) {
      i = j - 1;
    }
    return i;
  }
  
  public final void draw(Canvas paramCanvas)
  {
    int j = 1;
    float f1;
    float f2;
    float f3;
    int i;
    int k;
    float f4;
    if (this.iq)
    {
      Object localObject1 = getBounds();
      f1 = this.im * 1.5F;
      this.Vt.set(((Rect)localObject1).left + this.im, ((Rect)localObject1).top + f1, ((Rect)localObject1).right - this.im, ((Rect)localObject1).bottom - f1);
      localObject1 = new RectF(-this.ij, -this.ij, this.ij, this.ij);
      Object localObject2 = new RectF((RectF)localObject1);
      ((RectF)localObject2).inset(-this.in, -this.in);
      if (this.ik == null)
      {
        this.ik = new Path();
        this.ik.setFillType(Path.FillType.EVEN_ODD);
        this.ik.moveTo(-this.ij, 0.0F);
        this.ik.rLineTo(-this.in, 0.0F);
        this.ik.arcTo((RectF)localObject2, 180.0F, 90.0F, false);
        this.ik.arcTo((RectF)localObject1, 270.0F, -90.0F, false);
        this.ik.close();
        f1 = this.ij / (this.ij + this.in);
        localObject1 = this.ig;
        f2 = this.ij;
        f3 = this.in;
        i = this.ir;
        k = this.ir;
        int m = this.it;
        localObject2 = Shader.TileMode.CLAMP;
        ((Paint)localObject1).setShader(new RadialGradient(0.0F, 0.0F, f2 + f3, new int[] { i, k, m }, new float[] { 0.0F, f1, 1.0F }, (Shader.TileMode)localObject2));
        localObject1 = this.ih;
        f1 = -this.ij;
        f2 = this.in;
        f3 = -this.ij;
        f4 = this.in;
        i = this.ir;
        k = this.ir;
        m = this.it;
        localObject2 = Shader.TileMode.CLAMP;
        ((Paint)localObject1).setShader(new LinearGradient(0.0F, f1 + f2, 0.0F, f3 - f4, new int[] { i, k, m }, new float[] { 0.0F, 0.5F, 1.0F }, (Shader.TileMode)localObject2));
        this.ih.setAntiAlias(false);
        this.iq = false;
      }
    }
    else
    {
      paramCanvas.translate(0.0F, this.io / 2.0F);
      f1 = -this.ij - this.in;
      f2 = this.ij + this.Vr + this.io / 2.0F;
      if (this.Vt.width() - 2.0F * f2 <= 0.0F) {
        break label903;
      }
      i = 1;
      label504:
      if (this.Vt.height() - 2.0F * f2 <= 0.0F) {
        break label909;
      }
    }
    for (;;)
    {
      k = paramCanvas.save();
      paramCanvas.translate(this.Vt.left + f2, this.Vt.top + f2);
      paramCanvas.drawPath(this.ik, this.ig);
      if (i != 0) {
        paramCanvas.drawRect(0.0F, f1, this.Vt.width() - 2.0F * f2, -this.ij, this.ih);
      }
      paramCanvas.restoreToCount(k);
      k = paramCanvas.save();
      paramCanvas.translate(this.Vt.right - f2, this.Vt.bottom - f2);
      paramCanvas.rotate(180.0F);
      paramCanvas.drawPath(this.ik, this.ig);
      if (i != 0)
      {
        f3 = this.Vt.width();
        f4 = -this.ij;
        paramCanvas.drawRect(0.0F, f1, f3 - 2.0F * f2, this.in + f4, this.ih);
      }
      paramCanvas.restoreToCount(k);
      i = paramCanvas.save();
      paramCanvas.translate(this.Vt.left + f2, this.Vt.bottom - f2);
      paramCanvas.rotate(270.0F);
      paramCanvas.drawPath(this.ik, this.ig);
      if (j != 0) {
        paramCanvas.drawRect(0.0F, f1, this.Vt.height() - 2.0F * f2, -this.ij, this.ih);
      }
      paramCanvas.restoreToCount(i);
      i = paramCanvas.save();
      paramCanvas.translate(this.Vt.right - f2, this.Vt.top + f2);
      paramCanvas.rotate(90.0F);
      paramCanvas.drawPath(this.ik, this.ig);
      if (j != 0) {
        paramCanvas.drawRect(0.0F, f1, this.Vt.height() - 2.0F * f2, -this.ij, this.ih);
      }
      paramCanvas.restoreToCount(i);
      paramCanvas.translate(0.0F, -this.io / 2.0F);
      Vs.a(paramCanvas, this.Vt, this.ij, this.mPaint);
      return;
      this.ik.reset();
      break;
      label903:
      i = 0;
      break label504;
      label909:
      j = 0;
    }
  }
  
  public final int getOpacity()
  {
    return -3;
  }
  
  public final boolean getPadding(Rect paramRect)
  {
    int i = (int)Math.ceil(a(this.im, this.ij, this.iu));
    int j = (int)Math.ceil(b(this.im, this.ij, this.iu));
    paramRect.set(j, i, j, i);
    return true;
  }
  
  protected final void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    this.iq = true;
  }
  
  public final void setAlpha(int paramInt)
  {
    this.mPaint.setAlpha(paramInt);
    this.ig.setAlpha(paramInt);
    this.ih.setAlpha(paramInt);
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    this.mPaint.setColorFilter(paramColorFilter);
  }
  
  static abstract interface a
  {
    public abstract void a(Canvas paramCanvas, RectF paramRectF, float paramFloat, Paint paramPaint);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\android\support\v7\widget\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */