package android.support.design.widget;

import android.content.res.Resources;
import android.graphics.Canvas;
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
import android.support.design.a.c;
import android.support.v7.c.a.a;

final class o
  extends a
{
  static final double jdField_if = Math.cos(Math.toRadians(45.0D));
  float eS;
  final Paint ig;
  final Paint ih;
  final RectF ii;
  float ij;
  Path ik;
  float il;
  float im;
  float in;
  float io;
  private boolean iq = true;
  private final int ir;
  private final int is;
  private final int it;
  boolean iu = true;
  private boolean iv = false;
  
  public o(Resources paramResources, Drawable paramDrawable, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    super(paramDrawable);
    this.ir = paramResources.getColor(a.c.ac);
    this.is = paramResources.getColor(a.c.ab);
    this.it = paramResources.getColor(a.c.aa);
    this.ig = new Paint(5);
    this.ig.setStyle(Paint.Style.FILL);
    this.ij = Math.round(paramFloat1);
    this.ii = new RectF();
    this.ih = new Paint(this.ig);
    this.ih.setAntiAlias(false);
    d(paramFloat2, paramFloat3);
  }
  
  public static float a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (paramBoolean) {
      return (float)(1.5F * paramFloat1 + (1.0D - if) * paramFloat2);
    }
    return 1.5F * paramFloat1;
  }
  
  public static float b(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    float f = paramFloat1;
    if (paramBoolean) {
      f = (float)(paramFloat1 + (1.0D - if) * paramFloat2);
    }
    return f;
  }
  
  private static int k(float paramFloat)
  {
    int j = Math.round(paramFloat);
    int i = j;
    if (j % 2 == 1) {
      i = j - 1;
    }
    return i;
  }
  
  final void d(float paramFloat1, float paramFloat2)
  {
    if ((paramFloat1 < 0.0F) || (paramFloat2 < 0.0F)) {
      throw new IllegalArgumentException("invalid shadow size");
    }
    float f = k(paramFloat1);
    paramFloat2 = k(paramFloat2);
    paramFloat1 = f;
    if (f > paramFloat2)
    {
      if (!this.iv) {
        this.iv = true;
      }
      paramFloat1 = paramFloat2;
    }
    if ((this.io == paramFloat1) && (this.im == paramFloat2)) {
      return;
    }
    this.io = paramFloat1;
    this.im = paramFloat2;
    this.in = Math.round(paramFloat1 * 1.5F);
    this.il = paramFloat2;
    this.iq = true;
    invalidateSelf();
  }
  
  public final void draw(Canvas paramCanvas)
  {
    float f1;
    float f2;
    float f3;
    int i;
    int k;
    if (this.iq)
    {
      Object localObject = getBounds();
      f1 = this.im * 1.5F;
      this.ii.set(((Rect)localObject).left + this.im, ((Rect)localObject).top + f1, ((Rect)localObject).right - this.im, ((Rect)localObject).bottom - f1);
      this.mDrawable.setBounds((int)this.ii.left, (int)this.ii.top, (int)this.ii.right, (int)this.ii.bottom);
      localObject = new RectF(-this.ij, -this.ij, this.ij, this.ij);
      RectF localRectF = new RectF((RectF)localObject);
      localRectF.inset(-this.in, -this.in);
      if (this.ik == null)
      {
        this.ik = new Path();
        this.ik.setFillType(Path.FillType.EVEN_ODD);
        this.ik.moveTo(-this.ij, 0.0F);
        this.ik.rLineTo(-this.in, 0.0F);
        this.ik.arcTo(localRectF, 180.0F, 90.0F, false);
        this.ik.arcTo((RectF)localObject, 270.0F, -90.0F, false);
        this.ik.close();
        f1 = -localRectF.top;
        if (f1 > 0.0F)
        {
          f2 = this.ij / f1;
          f3 = (1.0F - f2) / 2.0F;
          localPaint = this.ig;
          i = this.ir;
          j = this.is;
          k = this.it;
          Shader.TileMode localTileMode = Shader.TileMode.CLAMP;
          localPaint.setShader(new RadialGradient(0.0F, 0.0F, f1, new int[] { 0, i, j, k }, new float[] { 0.0F, f2, f2 + f3, 1.0F }, localTileMode));
        }
        Paint localPaint = this.ih;
        f1 = ((RectF)localObject).top;
        f2 = localRectF.top;
        i = this.ir;
        j = this.is;
        k = this.it;
        localObject = Shader.TileMode.CLAMP;
        localPaint.setShader(new LinearGradient(0.0F, f1, 0.0F, f2, new int[] { i, j, k }, new float[] { 0.0F, 0.5F, 1.0F }, (Shader.TileMode)localObject));
        this.ih.setAntiAlias(false);
        this.iq = false;
      }
    }
    else
    {
      k = paramCanvas.save();
      paramCanvas.rotate(this.eS, this.ii.centerX(), this.ii.centerY());
      f1 = -this.ij - this.in;
      f2 = this.ij;
      if (this.ii.width() - 2.0F * f2 <= 0.0F) {
        break label1061;
      }
      i = 1;
      label535:
      if (this.ii.height() - 2.0F * f2 <= 0.0F) {
        break label1067;
      }
    }
    label1061:
    label1067:
    for (int j = 1;; j = 0)
    {
      float f6 = this.io;
      float f7 = this.io;
      f3 = this.io;
      float f8 = this.io;
      float f4 = this.io;
      float f5 = this.io;
      f3 = f2 / (f3 - f8 * 0.5F + f2);
      f6 = f2 / (f6 - f7 * 0.25F + f2);
      f4 = f2 / (f2 + (f4 - f5 * 1.0F));
      int m = paramCanvas.save();
      paramCanvas.translate(this.ii.left + f2, this.ii.top + f2);
      paramCanvas.scale(f3, f6);
      paramCanvas.drawPath(this.ik, this.ig);
      if (i != 0)
      {
        paramCanvas.scale(1.0F / f3, 1.0F);
        paramCanvas.drawRect(0.0F, f1, this.ii.width() - 2.0F * f2, -this.ij, this.ih);
      }
      paramCanvas.restoreToCount(m);
      m = paramCanvas.save();
      paramCanvas.translate(this.ii.right - f2, this.ii.bottom - f2);
      paramCanvas.scale(f3, f4);
      paramCanvas.rotate(180.0F);
      paramCanvas.drawPath(this.ik, this.ig);
      if (i != 0)
      {
        paramCanvas.scale(1.0F / f3, 1.0F);
        f5 = this.ii.width();
        f7 = -this.ij;
        paramCanvas.drawRect(0.0F, f1, f5 - 2.0F * f2, this.in + f7, this.ih);
      }
      paramCanvas.restoreToCount(m);
      i = paramCanvas.save();
      paramCanvas.translate(this.ii.left + f2, this.ii.bottom - f2);
      paramCanvas.scale(f3, f4);
      paramCanvas.rotate(270.0F);
      paramCanvas.drawPath(this.ik, this.ig);
      if (j != 0)
      {
        paramCanvas.scale(1.0F / f4, 1.0F);
        paramCanvas.drawRect(0.0F, f1, this.ii.height() - 2.0F * f2, -this.ij, this.ih);
      }
      paramCanvas.restoreToCount(i);
      i = paramCanvas.save();
      paramCanvas.translate(this.ii.right - f2, this.ii.top + f2);
      paramCanvas.scale(f3, f6);
      paramCanvas.rotate(90.0F);
      paramCanvas.drawPath(this.ik, this.ig);
      if (j != 0)
      {
        paramCanvas.scale(1.0F / f6, 1.0F);
        paramCanvas.drawRect(0.0F, f1, this.ii.height() - 2.0F * f2, -this.ij, this.ih);
      }
      paramCanvas.restoreToCount(i);
      paramCanvas.restoreToCount(k);
      super.draw(paramCanvas);
      return;
      this.ik.reset();
      break;
      i = 0;
      break label535;
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
    this.iq = true;
  }
  
  public final void setAlpha(int paramInt)
  {
    super.setAlpha(paramInt);
    this.ig.setAlpha(paramInt);
    this.ih.setAlpha(paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */