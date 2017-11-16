package com.tencent.mm.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.RemoteViews.RemoteView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

@RemoteViews.RemoteView
public class QImageView
  extends View
{
  private static final a[] xso;
  private static final Matrix.ScaleToFit[] xsp;
  private int Ch;
  private boolean QR;
  private int ia;
  private ColorFilter ly;
  private Context mContext;
  public Drawable mDrawable;
  public Matrix mMatrix;
  private Uri mUri;
  private int tAm;
  private int xrZ;
  private a xsa;
  private boolean xsb;
  private boolean xsc;
  private int xsd;
  private boolean xse;
  private int[] xsf;
  private boolean xsg;
  private int xsh;
  private int xsi;
  private int xsj;
  private Matrix xsk;
  private final RectF xsl;
  private final RectF xsm;
  private boolean xsn;
  
  static
  {
    GMTrace.i(1621752807424L, 12083);
    xso = new a[] { a.xsq, a.xsr, a.xss, a.xst, a.xsu, a.xsv, a.xsw, a.xsx };
    xsp = new Matrix.ScaleToFit[] { Matrix.ScaleToFit.FILL, Matrix.ScaleToFit.START, Matrix.ScaleToFit.CENTER, Matrix.ScaleToFit.END };
    GMTrace.o(1621752807424L, 12083);
  }
  
  public QImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(1618263146496L, 12057);
    this.mContext = paramContext;
    cjo();
    GMTrace.o(1618263146496L, 12057);
  }
  
  public QImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1618397364224L, 12058);
    this.xrZ = 0;
    this.xsb = false;
    this.xsc = false;
    this.ia = Integer.MAX_VALUE;
    this.tAm = Integer.MAX_VALUE;
    this.Ch = 255;
    this.xsd = 256;
    this.xse = false;
    this.mDrawable = null;
    this.xsf = null;
    this.xsg = false;
    this.xsh = 0;
    this.xsk = null;
    this.xsl = new RectF();
    this.xsm = new RectF();
    this.QR = false;
    this.mContext = paramContext;
    cjo();
    this.QR = false;
    this.xsc = false;
    this.ia = Integer.MAX_VALUE;
    this.tAm = Integer.MAX_VALUE;
    this.xsn = false;
    GMTrace.o(1618397364224L, 12058);
  }
  
  private static int ac(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(1620544847872L, 12074);
    int i = View.MeasureSpec.getMode(paramInt3);
    paramInt3 = View.MeasureSpec.getSize(paramInt3);
    switch (i)
    {
    }
    for (;;)
    {
      GMTrace.o(1620544847872L, 12074);
      return paramInt1;
      paramInt1 = Math.min(paramInt1, paramInt2);
      continue;
      paramInt1 = Math.min(Math.min(paramInt1, paramInt3), paramInt2);
      continue;
      paramInt1 = paramInt3;
    }
  }
  
  private void cjo()
  {
    GMTrace.i(1618531581952L, 12059);
    this.mMatrix = new Matrix();
    this.xsa = a.xst;
    GMTrace.o(1618531581952L, 12059);
  }
  
  private void cjp()
  {
    Object localObject1 = null;
    GMTrace.i(1619739541504L, 12068);
    if (this.mDrawable != null)
    {
      GMTrace.o(1619739541504L, 12068);
      return;
    }
    Object localObject2 = getResources();
    if (localObject2 == null)
    {
      GMTrace.o(1619739541504L, 12068);
      return;
    }
    if (this.xrZ != 0) {}
    while (this.mUri != null)
    {
      try
      {
        localObject2 = ((Resources)localObject2).getDrawable(this.xrZ);
        localObject1 = localObject2;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.w("ImageView", "Unable to find resource: " + this.xrZ, new Object[] { localException });
          this.mUri = null;
        }
      }
      w((Drawable)localObject1);
      GMTrace.o(1619739541504L, 12068);
      return;
    }
    GMTrace.o(1619739541504L, 12068);
  }
  
  private void cjq()
  {
    float f2 = 0.0F;
    GMTrace.i(1620813283328L, 12076);
    if ((this.mDrawable == null) || (!this.xsb))
    {
      GMTrace.o(1620813283328L, 12076);
      return;
    }
    int j = this.xsi;
    int k = this.xsj;
    int m = getWidth() - getPaddingLeft() - getPaddingRight();
    int n = getHeight() - getPaddingTop() - getPaddingBottom();
    if (((j < 0) || (m == j)) && ((k < 0) || (n == k))) {}
    for (int i = 1; (j <= 0) || (k <= 0) || (a.xsr == this.xsa); i = 0)
    {
      this.mDrawable.setBounds(0, 0, m, n);
      this.xsk = null;
      GMTrace.o(1620813283328L, 12076);
      return;
    }
    this.mDrawable.setBounds(0, 0, j, k);
    if (a.xsq == this.xsa)
    {
      if (this.mMatrix.isIdentity())
      {
        this.xsk = null;
        GMTrace.o(1620813283328L, 12076);
        return;
      }
      this.xsk = this.mMatrix;
      GMTrace.o(1620813283328L, 12076);
      return;
    }
    if (i != 0)
    {
      this.xsk = null;
      GMTrace.o(1620813283328L, 12076);
      return;
    }
    if (a.xsv == this.xsa)
    {
      this.xsk = this.mMatrix;
      this.xsk.setTranslate((int)((m - j) * 0.5F + 0.5F), (int)((n - k) * 0.5F + 0.5F));
      GMTrace.o(1620813283328L, 12076);
      return;
    }
    float f1;
    float f3;
    if (a.xsw == this.xsa)
    {
      this.xsk = this.mMatrix;
      if (j * n > m * k)
      {
        f1 = n / k;
        f3 = (m - j * f1) * 0.5F;
      }
      for (;;)
      {
        this.xsk.setScale(f1, f1);
        this.xsk.postTranslate((int)(f3 + 0.5F), (int)(f2 + 0.5F));
        GMTrace.o(1620813283328L, 12076);
        return;
        f1 = m / j;
        f2 = n;
        float f4 = k;
        f3 = 0.0F;
        f2 = (f2 - f4 * f1) * 0.5F;
      }
    }
    if (a.xsx == this.xsa)
    {
      this.xsk = this.mMatrix;
      if ((j <= m) && (k <= n)) {}
      for (f1 = 1.0F;; f1 = Math.min(m / j, n / k))
      {
        f2 = (int)((m - j * f1) * 0.5F + 0.5F);
        f3 = (int)((n - k * f1) * 0.5F + 0.5F);
        this.xsk.setScale(f1, f1);
        this.xsk.postTranslate(f2, f3);
        GMTrace.o(1620813283328L, 12076);
        return;
      }
    }
    this.xsl.set(0.0F, 0.0F, j, k);
    this.xsm.set(0.0F, 0.0F, m, n);
    this.xsk = this.mMatrix;
    Matrix localMatrix = this.xsk;
    RectF localRectF1 = this.xsl;
    RectF localRectF2 = this.xsm;
    a locala = this.xsa;
    localMatrix.setRectToRect(localRectF1, localRectF2, xsp[(locala.xsy - 1)]);
    GMTrace.o(1620813283328L, 12076);
  }
  
  private void cjr()
  {
    GMTrace.i(1621484371968L, 12081);
    if ((this.mDrawable != null) && (this.xse))
    {
      this.mDrawable = this.mDrawable.mutate();
      this.mDrawable.setColorFilter(this.ly);
      this.mDrawable.setAlpha(this.Ch * this.xsd >> 8);
    }
    GMTrace.o(1621484371968L, 12081);
  }
  
  private void w(Drawable paramDrawable)
  {
    GMTrace.i(1620276412416L, 12072);
    if (this.mDrawable != null)
    {
      this.mDrawable.setCallback(null);
      unscheduleDrawable(this.mDrawable);
    }
    this.mDrawable = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      if (paramDrawable.isStateful()) {
        paramDrawable.setState(getDrawableState());
      }
      paramDrawable.setLevel(this.xsh);
      this.xsi = paramDrawable.getIntrinsicWidth();
      this.xsj = paramDrawable.getIntrinsicHeight();
      cjr();
      cjq();
    }
    GMTrace.o(1620276412416L, 12072);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(1620007976960L, 12070);
    if (parama == null) {
      throw new NullPointerException();
    }
    if (this.xsa != parama)
    {
      this.xsa = parama;
      if (this.xsa != a.xsv) {
        break label69;
      }
    }
    label69:
    for (boolean bool = true;; bool = false)
    {
      setWillNotCacheDrawing(bool);
      requestLayout();
      invalidate();
      GMTrace.o(1620007976960L, 12070);
      return;
    }
  }
  
  protected void drawableStateChanged()
  {
    GMTrace.i(1620947501056L, 12077);
    super.drawableStateChanged();
    Drawable localDrawable = this.mDrawable;
    if ((localDrawable != null) && (localDrawable.isStateful())) {
      localDrawable.setState(getDrawableState());
    }
    GMTrace.o(1620947501056L, 12077);
  }
  
  public int getBaseline()
  {
    GMTrace.i(1621215936512L, 12079);
    if (this.QR)
    {
      int i = getMeasuredHeight();
      GMTrace.o(1621215936512L, 12079);
      return i;
    }
    GMTrace.o(1621215936512L, 12079);
    return -1;
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    GMTrace.i(1618800017408L, 12061);
    if (paramDrawable == this.mDrawable)
    {
      invalidate();
      GMTrace.o(1618800017408L, 12061);
      return;
    }
    super.invalidateDrawable(paramDrawable);
    GMTrace.o(1618800017408L, 12061);
  }
  
  public int[] onCreateDrawableState(int paramInt)
  {
    GMTrace.i(1620142194688L, 12071);
    if (this.xsf == null)
    {
      arrayOfInt = super.onCreateDrawableState(paramInt);
      GMTrace.o(1620142194688L, 12071);
      return arrayOfInt;
    }
    if (!this.xsg)
    {
      arrayOfInt = this.xsf;
      GMTrace.o(1620142194688L, 12071);
      return arrayOfInt;
    }
    int[] arrayOfInt = mergeDrawableStates(super.onCreateDrawableState(this.xsf.length + paramInt), this.xsf);
    GMTrace.o(1620142194688L, 12071);
    return arrayOfInt;
  }
  
  public void onDetachedFromWindow()
  {
    GMTrace.i(1621618589696L, 12082);
    super.onDetachedFromWindow();
    GMTrace.o(1621618589696L, 12082);
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(1621081718784L, 12078);
    paramCanvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
    super.onDraw(paramCanvas);
    if (this.mDrawable == null)
    {
      GMTrace.o(1621081718784L, 12078);
      return;
    }
    if ((this.xsi == 0) || (this.xsj == 0))
    {
      GMTrace.o(1621081718784L, 12078);
      return;
    }
    if ((this.xsk == null) && (getPaddingTop() == 0) && (getPaddingLeft() == 0))
    {
      this.mDrawable.draw(paramCanvas);
      GMTrace.o(1621081718784L, 12078);
      return;
    }
    int i = paramCanvas.getSaveCount();
    paramCanvas.save();
    if (this.xsn)
    {
      int j = getScrollX();
      int k = getScrollY();
      paramCanvas.clipRect(getPaddingLeft() + j, getPaddingTop() + k, j + getRight() - getLeft() - getPaddingRight(), k + getBottom() - getTop() - getPaddingBottom());
    }
    paramCanvas.translate(getPaddingLeft(), getPaddingTop());
    if (this.xsk != null) {
      paramCanvas.concat(this.xsk);
    }
    this.mDrawable.draw(paramCanvas);
    paramCanvas.restoreToCount(i);
    GMTrace.o(1621081718784L, 12078);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(1620679065600L, 12075);
    this.xsb = true;
    cjq();
    GMTrace.o(1620679065600L, 12075);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(1620410630144L, 12073);
    cjp();
    float f = 0.0F;
    int m = 0;
    int k;
    int i;
    int j;
    if (this.mDrawable == null)
    {
      this.xsi = -1;
      this.xsj = -1;
      k = 0;
      i = 0;
      j = 0;
    }
    for (;;)
    {
      int i2 = getPaddingLeft();
      int i3 = getPaddingRight();
      int n = getPaddingTop();
      int i1 = getPaddingBottom();
      if ((m != 0) || (i != 0))
      {
        paramInt1 = ac(k + i2 + i3, this.ia, paramInt1);
        paramInt2 = ac(j + n + i1, this.tAm, paramInt2);
        if ((f == 0.0F) || (Math.abs((paramInt1 - i2 - i3) / (paramInt2 - n - i1) - f) <= 1.0E-7D)) {
          break label428;
        }
        if (m == 0) {
          break label422;
        }
        j = (int)((paramInt2 - n - i1) * f) + i2 + i3;
        if (j > paramInt1) {
          break label422;
        }
        k = 1;
        paramInt1 = j;
        j = k;
        label188:
        if ((j != 0) || (i == 0)) {
          break label411;
        }
        i = (int)((paramInt1 - i2 - i3) / f) + n + i1;
        if (i > paramInt2) {
          break label411;
        }
        paramInt2 = paramInt1;
        paramInt1 = i;
      }
      for (;;)
      {
        setMeasuredDimension(paramInt2, paramInt1);
        GMTrace.o(1620410630144L, 12073);
        return;
        j = this.xsi;
        k = this.xsj;
        i = j;
        if (j <= 0) {
          i = 1;
        }
        j = k;
        if (k <= 0) {
          j = 1;
        }
        if (!this.xsc) {
          break label439;
        }
        m = View.MeasureSpec.getMode(paramInt1);
        k = View.MeasureSpec.getMode(paramInt2);
        if (m != 1073741824)
        {
          m = 1;
          label310:
          if (k == 1073741824) {
            break label350;
          }
        }
        label350:
        for (k = 1;; k = 0)
        {
          f = i / j;
          n = k;
          k = i;
          i = n;
          break;
          m = 0;
          break label310;
        }
        i = Math.max(k + (i2 + i3), getSuggestedMinimumWidth());
        j = Math.max(j + (n + i1), getSuggestedMinimumHeight());
        i = resolveSize(i, paramInt1);
        paramInt1 = resolveSize(j, paramInt2);
        paramInt2 = i;
        continue;
        label411:
        i = paramInt1;
        paramInt1 = paramInt2;
        paramInt2 = i;
        continue;
        label422:
        j = 0;
        break label188;
        label428:
        i = paramInt1;
        paramInt1 = paramInt2;
        paramInt2 = i;
      }
      label439:
      n = 0;
      k = i;
      i = n;
    }
  }
  
  protected boolean onSetAlpha(int paramInt)
  {
    GMTrace.i(1618934235136L, 12062);
    if (getBackground() == null)
    {
      paramInt = (paramInt >> 7) + paramInt;
      if (this.xsd != paramInt)
      {
        this.xsd = paramInt;
        this.xse = true;
        cjr();
      }
      GMTrace.o(1618934235136L, 12062);
      return true;
    }
    GMTrace.o(1618934235136L, 12062);
    return false;
  }
  
  public final void setAlpha(int paramInt)
  {
    GMTrace.i(1621350154240L, 12080);
    paramInt &= 0xFF;
    if (this.Ch != paramInt)
    {
      this.Ch = paramInt;
      this.xse = true;
      cjr();
      invalidate();
    }
    GMTrace.o(1621350154240L, 12080);
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    GMTrace.i(1619471106048L, 12066);
    super.setBackgroundDrawable(paramDrawable);
    GMTrace.o(1619471106048L, 12066);
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    GMTrace.i(1619605323776L, 12067);
    setImageDrawable(new BitmapDrawable(this.mContext.getResources(), paramBitmap));
    GMTrace.o(1619605323776L, 12067);
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    GMTrace.i(1619336888320L, 12065);
    if (this.mDrawable != paramDrawable)
    {
      this.xrZ = 0;
      this.mUri = null;
      w(paramDrawable);
      invalidate();
    }
    GMTrace.o(1619336888320L, 12065);
  }
  
  public final void setImageResource(int paramInt)
  {
    GMTrace.i(1619068452864L, 12063);
    if ((this.mUri != null) || (this.xrZ != paramInt))
    {
      w(null);
      this.xrZ = paramInt;
      this.mUri = null;
      cjp();
      invalidate();
    }
    GMTrace.o(1619068452864L, 12063);
  }
  
  @TargetApi(11)
  public void setLayerType(int paramInt, Paint paramPaint)
  {
    GMTrace.i(1619202670592L, 12064);
    if (((this.mDrawable instanceof PictureDrawable)) && (paramInt != 1))
    {
      GMTrace.o(1619202670592L, 12064);
      return;
    }
    super.setLayerType(paramInt, paramPaint);
    GMTrace.o(1619202670592L, 12064);
  }
  
  public void setSelected(boolean paramBoolean)
  {
    GMTrace.i(1619873759232L, 12069);
    super.setSelected(paramBoolean);
    Drawable localDrawable = this.mDrawable;
    if (localDrawable != null)
    {
      int j = localDrawable.getIntrinsicWidth();
      int i = j;
      if (j < 0) {
        i = this.xsi;
      }
      int k = localDrawable.getIntrinsicHeight();
      j = k;
      if (k < 0) {
        j = this.xsj;
      }
      if ((i != this.xsi) || (j != this.xsj))
      {
        this.xsi = i;
        this.xsj = j;
        requestLayout();
      }
    }
    GMTrace.o(1619873759232L, 12069);
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    GMTrace.i(1618665799680L, 12060);
    if ((this.mDrawable == paramDrawable) || (super.verifyDrawable(paramDrawable)))
    {
      GMTrace.o(1618665799680L, 12060);
      return true;
    }
    GMTrace.o(1618665799680L, 12060);
    return false;
  }
  
  public static enum a
  {
    final int xsy;
    
    static
    {
      GMTrace.i(1613565526016L, 12022);
      xsq = new a("MATRIX", 0, 0);
      xsr = new a("FIT_XY", 1, 1);
      xss = new a("FIT_START", 2, 2);
      xst = new a("FIT_CENTER", 3, 3);
      xsu = new a("FIT_END", 4, 4);
      xsv = new a("CENTER", 5, 5);
      xsw = new a("CENTER_CROP", 6, 6);
      xsx = new a("CENTER_INSIDE", 7, 7);
      xsz = new a[] { xsq, xsr, xss, xst, xsu, xsv, xsw, xsx };
      GMTrace.o(1613565526016L, 12022);
    }
    
    private a(int paramInt)
    {
      GMTrace.i(1613431308288L, 12021);
      this.xsy = paramInt;
      GMTrace.o(1613431308288L, 12021);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\QImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */