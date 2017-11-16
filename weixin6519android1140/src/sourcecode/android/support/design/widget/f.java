package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.design.a.i;
import android.support.v4.d.d;
import android.support.v4.d.e;
import android.support.v4.view.z;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.animation.Interpolator;

final class f
{
  private static final boolean eT;
  private static final Paint eU;
  private boolean eV;
  float eW;
  private final Rect eX;
  private final Rect eY;
  private final RectF eZ;
  private boolean fA;
  private final TextPaint fB;
  Interpolator fC;
  private Interpolator fD;
  private float fE;
  private float fF;
  private float fG;
  private int fH;
  private float fI;
  private float fJ;
  private float fK;
  private int fL;
  private int fa = 16;
  private int fb = 16;
  float fc = 15.0F;
  float fe = 15.0F;
  int ff;
  int fg;
  private float fh;
  private float fi;
  private float fj;
  private float fk;
  private float fl;
  private float fn;
  Typeface fo;
  Typeface fp;
  private Typeface fq;
  private CharSequence fr;
  private boolean fs;
  private boolean ft;
  private Bitmap fu;
  private Paint fv;
  private float fw;
  private float fx;
  private float fy;
  private float fz;
  CharSequence mText;
  private final View mView;
  
  static
  {
    if (Build.VERSION.SDK_INT < 18) {}
    for (boolean bool = true;; bool = false)
    {
      eT = bool;
      eU = null;
      return;
    }
  }
  
  public f(View paramView)
  {
    this.mView = paramView;
    this.fB = new TextPaint(129);
    this.eY = new Rect();
    this.eX = new Rect();
    this.eZ = new RectF();
  }
  
  private void L()
  {
    if ((this.eY.width() > 0) && (this.eY.height() > 0) && (this.eX.width() > 0) && (this.eX.height() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      this.eV = bool;
      return;
    }
  }
  
  private void M()
  {
    f(this.eW);
  }
  
  private void O()
  {
    if (this.fu != null)
    {
      this.fu.recycle();
      this.fu = null;
    }
  }
  
  private static float a(float paramFloat1, float paramFloat2, float paramFloat3, Interpolator paramInterpolator)
  {
    float f = paramFloat3;
    if (paramInterpolator != null) {
      f = paramInterpolator.getInterpolation(paramFloat3);
    }
    return a.b(paramFloat1, paramFloat2, f);
  }
  
  private static boolean a(Rect paramRect, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return (paramRect.left == paramInt1) && (paramRect.top == paramInt2) && (paramRect.right == paramInt3) && (paramRect.bottom == paramInt4);
  }
  
  private static int b(int paramInt1, int paramInt2, float paramFloat)
  {
    float f1 = 1.0F - paramFloat;
    float f2 = Color.alpha(paramInt1);
    float f3 = Color.alpha(paramInt2);
    float f4 = Color.red(paramInt1);
    float f5 = Color.red(paramInt2);
    float f6 = Color.green(paramInt1);
    float f7 = Color.green(paramInt2);
    float f8 = Color.blue(paramInt1);
    float f9 = Color.blue(paramInt2);
    return Color.argb((int)(f2 * f1 + f3 * paramFloat), (int)(f4 * f1 + f5 * paramFloat), (int)(f6 * f1 + f7 * paramFloat), (int)(f1 * f8 + f9 * paramFloat));
  }
  
  private static boolean c(float paramFloat1, float paramFloat2)
  {
    return Math.abs(paramFloat1 - paramFloat2) < 0.001F;
  }
  
  private void f(float paramFloat)
  {
    this.eZ.left = a(this.eX.left, this.eY.left, paramFloat, this.fC);
    this.eZ.top = a(this.fh, this.fi, paramFloat, this.fC);
    this.eZ.right = a(this.eX.right, this.eY.right, paramFloat, this.fC);
    this.eZ.bottom = a(this.eX.bottom, this.eY.bottom, paramFloat, this.fC);
    this.fl = a(this.fj, this.fk, paramFloat, this.fC);
    this.fn = a(this.fh, this.fi, paramFloat, this.fC);
    g(a(this.fc, this.fe, paramFloat, this.fD));
    if (this.fg != this.ff) {
      this.fB.setColor(b(this.ff, this.fg, paramFloat));
    }
    for (;;)
    {
      this.fB.setShadowLayer(a(this.fI, this.fE, paramFloat, null), a(this.fJ, this.fF, paramFloat, null), a(this.fK, this.fG, paramFloat, null), b(this.fL, this.fH, paramFloat));
      z.F(this.mView);
      return;
      this.fB.setColor(this.fg);
    }
  }
  
  private void g(float paramFloat)
  {
    h(paramFloat);
    boolean bool;
    if ((eT) && (this.fy != 1.0F))
    {
      bool = true;
      this.ft = bool;
      if ((this.ft) && (this.fu == null) && (!this.eX.isEmpty()) && (!TextUtils.isEmpty(this.fr))) {
        break label77;
      }
    }
    for (;;)
    {
      z.F(this.mView);
      return;
      bool = false;
      break;
      label77:
      f(0.0F);
      this.fw = this.fB.ascent();
      this.fx = this.fB.descent();
      int i = Math.round(this.fB.measureText(this.fr, 0, this.fr.length()));
      int j = Math.round(this.fx - this.fw);
      if ((i > 0) && (j > 0))
      {
        this.fu = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
        new Canvas(this.fu).drawText(this.fr, 0, this.fr.length(), 0.0F, j - this.fB.descent(), this.fB);
        if (this.fv == null) {
          this.fv = new Paint(3);
        }
      }
    }
  }
  
  private void h(float paramFloat)
  {
    int k = 1;
    if (this.mText == null) {
      return;
    }
    float f1;
    int i;
    if (c(paramFloat, this.fe))
    {
      f1 = this.eY.width();
      paramFloat = this.fe;
      this.fy = 1.0F;
      if (this.fq == this.fo) {
        break label362;
      }
      this.fq = this.fo;
      i = 1;
    }
    for (;;)
    {
      int j = i;
      label97:
      Object localObject;
      boolean bool;
      label164:
      label227:
      label237:
      float f2;
      if (f1 > 0.0F)
      {
        if ((this.fz != paramFloat) || (this.fA) || (i != 0))
        {
          i = 1;
          this.fz = paramFloat;
          this.fA = false;
          j = i;
        }
      }
      else
      {
        if ((this.fr != null) && (j == 0)) {
          break;
        }
        this.fB.setTextSize(this.fz);
        this.fB.setTypeface(this.fq);
        localObject = this.fB;
        if (this.fy == 1.0F) {
          break label336;
        }
        bool = true;
        ((TextPaint)localObject).setLinearText(bool);
        localObject = TextUtils.ellipsize(this.mText, this.fB, f1, TextUtils.TruncateAt.END);
        if (TextUtils.equals((CharSequence)localObject, this.fr)) {
          break;
        }
        this.fr = ((CharSequence)localObject);
        CharSequence localCharSequence = this.fr;
        if (z.J(this.mView) != 1) {
          break label342;
        }
        i = k;
        if (i == 0) {
          break label348;
        }
        localObject = e.uR;
        this.fs = ((d)localObject).a(localCharSequence, localCharSequence.length());
        return;
        f1 = this.eX.width();
        f2 = this.fc;
        if (this.fq == this.fp) {
          break label356;
        }
        this.fq = this.fp;
      }
      label336:
      label342:
      label348:
      label356:
      for (i = 1;; i = 0)
      {
        if (c(paramFloat, this.fc))
        {
          this.fy = 1.0F;
          paramFloat = f2;
          break;
        }
        this.fy = (paramFloat / this.fc);
        paramFloat = f2;
        break;
        i = 0;
        break label97;
        bool = false;
        break label164;
        i = 0;
        break label227;
        localObject = e.uQ;
        break label237;
      }
      label362:
      i = 0;
    }
  }
  
  private Typeface q(int paramInt)
  {
    TypedArray localTypedArray = this.mView.getContext().obtainStyledAttributes(paramInt, new int[] { 16843692 });
    try
    {
      Object localObject1 = localTypedArray.getString(0);
      if (localObject1 != null)
      {
        localObject1 = Typeface.create((String)localObject1, 0);
        return (Typeface)localObject1;
      }
      return null;
    }
    finally
    {
      localTypedArray.recycle();
    }
  }
  
  public final void N()
  {
    int j = 1;
    float f2 = 0.0F;
    float f3;
    float f1;
    int i;
    if ((this.mView.getHeight() > 0) && (this.mView.getWidth() > 0))
    {
      f3 = this.fz;
      h(this.fe);
      if (this.fr == null) {
        break label402;
      }
      f1 = this.fB.measureText(this.fr, 0, this.fr.length());
      int k = this.fb;
      if (!this.fs) {
        break label407;
      }
      i = 1;
      label83:
      i = android.support.v4.view.f.getAbsoluteGravity(k, i);
      switch (i & 0x70)
      {
      default: 
        this.fi = ((this.fB.descent() - this.fB.ascent()) / 2.0F - this.fB.descent() + this.eY.centerY());
        label162:
        switch (i & 0x800007)
        {
        default: 
          this.fk = this.eY.left;
          label208:
          h(this.fc);
          f1 = f2;
          if (this.fr != null) {
            f1 = this.fB.measureText(this.fr, 0, this.fr.length());
          }
          k = this.fa;
          if (this.fs)
          {
            i = j;
            label264:
            i = android.support.v4.view.f.getAbsoluteGravity(k, i);
            switch (i & 0x70)
            {
            default: 
              this.fh = ((this.fB.descent() - this.fB.ascent()) / 2.0F - this.fB.descent() + this.eX.centerY());
              label342:
              switch (i & 0x800007)
              {
              default: 
                this.fj = this.eX.left;
              }
              break;
            }
          }
          break;
        }
        break;
      }
    }
    for (;;)
    {
      O();
      g(f3);
      M();
      return;
      label402:
      f1 = 0.0F;
      break;
      label407:
      i = 0;
      break label83;
      this.fi = this.eY.bottom;
      break label162;
      this.fi = (this.eY.top - this.fB.ascent());
      break label162;
      this.fk = (this.eY.centerX() - f1 / 2.0F);
      break label208;
      this.fk = (this.eY.right - f1);
      break label208;
      i = 0;
      break label264;
      this.fh = this.eX.bottom;
      break label342;
      this.fh = (this.eX.top - this.fB.ascent());
      break label342;
      this.fj = (this.eX.centerX() - f1 / 2.0F);
      continue;
      this.fj = (this.eX.right - f1);
    }
  }
  
  final void a(Interpolator paramInterpolator)
  {
    this.fD = paramInterpolator;
    N();
  }
  
  final void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!a(this.eX, paramInt1, paramInt2, paramInt3, paramInt4))
    {
      this.eX.set(paramInt1, paramInt2, paramInt3, paramInt4);
      this.fA = true;
      L();
    }
  }
  
  final void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!a(this.eY, paramInt1, paramInt2, paramInt3, paramInt4))
    {
      this.eY.set(paramInt1, paramInt2, paramInt3, paramInt4);
      this.fA = true;
      L();
    }
  }
  
  public final void draw(Canvas paramCanvas)
  {
    int j = paramCanvas.save();
    float f4;
    int i;
    float f1;
    label64:
    float f2;
    if ((this.fr != null) && (this.eV))
    {
      f4 = this.fl;
      float f3 = this.fn;
      if ((!this.ft) || (this.fu == null)) {
        break label128;
      }
      i = 1;
      if (i == 0) {
        break label134;
      }
      f1 = this.fw * this.fy;
      f2 = f3;
      if (i != 0) {
        f2 = f3 + f1;
      }
      if (this.fy != 1.0F) {
        paramCanvas.scale(this.fy, this.fy, f4, f2);
      }
      if (i == 0) {
        break label155;
      }
      paramCanvas.drawBitmap(this.fu, f4, f2, this.fv);
    }
    for (;;)
    {
      paramCanvas.restoreToCount(j);
      return;
      label128:
      i = 0;
      break;
      label134:
      this.fB.ascent();
      f1 = 0.0F;
      this.fB.descent();
      break label64;
      label155:
      paramCanvas.drawText(this.fr, 0, this.fr.length(), f4, f2, this.fB);
    }
  }
  
  final void e(float paramFloat)
  {
    float f;
    if (paramFloat < 0.0F) {
      f = 0.0F;
    }
    for (;;)
    {
      if (f != this.eW)
      {
        this.eW = f;
        M();
      }
      return;
      f = paramFloat;
      if (paramFloat > 1.0F) {
        f = 1.0F;
      }
    }
  }
  
  final void l(int paramInt)
  {
    if (this.fg != paramInt)
    {
      this.fg = paramInt;
      N();
    }
  }
  
  final void m(int paramInt)
  {
    if (this.fa != paramInt)
    {
      this.fa = paramInt;
      N();
    }
  }
  
  final void n(int paramInt)
  {
    if (this.fb != paramInt)
    {
      this.fb = paramInt;
      N();
    }
  }
  
  final void o(int paramInt)
  {
    TypedArray localTypedArray = this.mView.getContext().obtainStyledAttributes(paramInt, a.i.TextAppearance);
    if (localTypedArray.hasValue(a.i.TextAppearance_android_textColor)) {
      this.fg = localTypedArray.getColor(a.i.TextAppearance_android_textColor, this.fg);
    }
    if (localTypedArray.hasValue(a.i.TextAppearance_android_textSize)) {
      this.fe = localTypedArray.getDimensionPixelSize(a.i.TextAppearance_android_textSize, (int)this.fe);
    }
    this.fH = localTypedArray.getInt(a.i.TextAppearance_android_shadowColor, 0);
    this.fF = localTypedArray.getFloat(a.i.TextAppearance_android_shadowDx, 0.0F);
    this.fG = localTypedArray.getFloat(a.i.TextAppearance_android_shadowDy, 0.0F);
    this.fE = localTypedArray.getFloat(a.i.TextAppearance_android_shadowRadius, 0.0F);
    localTypedArray.recycle();
    if (Build.VERSION.SDK_INT >= 16) {
      this.fo = q(paramInt);
    }
    N();
  }
  
  final void p(int paramInt)
  {
    TypedArray localTypedArray = this.mView.getContext().obtainStyledAttributes(paramInt, a.i.TextAppearance);
    if (localTypedArray.hasValue(a.i.TextAppearance_android_textColor)) {
      this.ff = localTypedArray.getColor(a.i.TextAppearance_android_textColor, this.ff);
    }
    if (localTypedArray.hasValue(a.i.TextAppearance_android_textSize)) {
      this.fc = localTypedArray.getDimensionPixelSize(a.i.TextAppearance_android_textSize, (int)this.fc);
    }
    this.fL = localTypedArray.getInt(a.i.TextAppearance_android_shadowColor, 0);
    this.fJ = localTypedArray.getFloat(a.i.TextAppearance_android_shadowDx, 0.0F);
    this.fK = localTypedArray.getFloat(a.i.TextAppearance_android_shadowDy, 0.0F);
    this.fI = localTypedArray.getFloat(a.i.TextAppearance_android_shadowRadius, 0.0F);
    localTypedArray.recycle();
    if (Build.VERSION.SDK_INT >= 16) {
      this.fp = q(paramInt);
    }
    N();
  }
  
  final void setText(CharSequence paramCharSequence)
  {
    if ((paramCharSequence == null) || (!paramCharSequence.equals(this.mText)))
    {
      this.mText = paramCharSequence;
      this.fr = null;
      O();
      N();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */