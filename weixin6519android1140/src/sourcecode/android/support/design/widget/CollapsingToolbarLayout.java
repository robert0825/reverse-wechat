package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.a.e;
import android.support.design.a.h;
import android.support.design.a.i;
import android.support.v4.view.ap;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import java.util.List;

public class CollapsingToolbarLayout
  extends FrameLayout
{
  private ap dS;
  private boolean fM = true;
  private int fN;
  private Toolbar fO;
  private View fP;
  private View fQ;
  private int fR;
  private int fS;
  private int fT;
  private int fU;
  private final Rect fV = new Rect();
  private final f fW;
  private boolean fX;
  private boolean fY;
  private Drawable fZ;
  private Drawable ga;
  int gb;
  boolean gc;
  u gd;
  private AppBarLayout.a ge;
  private int gf;
  
  public CollapsingToolbarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public CollapsingToolbarLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    t.d(paramContext);
    this.fW = new f(this);
    this.fW.a(a.dL);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.i.bi, paramInt, a.h.aO);
    this.fW.m(paramAttributeSet.getInt(a.i.bm, 8388691));
    this.fW.n(paramAttributeSet.getInt(a.i.bj, 8388627));
    paramInt = paramAttributeSet.getDimensionPixelSize(a.i.bn, 0);
    this.fU = paramInt;
    this.fT = paramInt;
    this.fS = paramInt;
    this.fR = paramInt;
    if (paramAttributeSet.hasValue(a.i.bq)) {
      this.fR = paramAttributeSet.getDimensionPixelSize(a.i.bq, 0);
    }
    if (paramAttributeSet.hasValue(a.i.bp)) {
      this.fT = paramAttributeSet.getDimensionPixelSize(a.i.bp, 0);
    }
    if (paramAttributeSet.hasValue(a.i.br)) {
      this.fS = paramAttributeSet.getDimensionPixelSize(a.i.br, 0);
    }
    if (paramAttributeSet.hasValue(a.i.bo)) {
      this.fU = paramAttributeSet.getDimensionPixelSize(a.i.bo, 0);
    }
    this.fX = paramAttributeSet.getBoolean(a.i.bw, true);
    paramContext = paramAttributeSet.getText(a.i.bv);
    this.fW.setText(paramContext);
    this.fW.p(a.h.aK);
    this.fW.o(a.h.TextAppearance_AppCompat_Widget_ActionBar_Title);
    if (paramAttributeSet.hasValue(a.i.bt)) {
      this.fW.p(paramAttributeSet.getResourceId(a.i.bt, 0));
    }
    if (paramAttributeSet.hasValue(a.i.bk)) {
      this.fW.o(paramAttributeSet.getResourceId(a.i.bk, 0));
    }
    paramContext = paramAttributeSet.getDrawable(a.i.bl);
    if (this.fZ != paramContext)
    {
      if (this.fZ != null) {
        this.fZ.setCallback(null);
      }
      if (paramContext != null)
      {
        paramContext = paramContext.mutate();
        this.fZ = paramContext;
        if (this.fZ != null)
        {
          this.fZ.setBounds(0, 0, getWidth(), getHeight());
          this.fZ.setCallback(this);
          this.fZ.setAlpha(this.gb);
        }
        android.support.v4.view.z.F(this);
      }
    }
    else
    {
      Drawable localDrawable = paramAttributeSet.getDrawable(a.i.bu);
      if (this.ga != localDrawable)
      {
        if (this.ga != null) {
          this.ga.setCallback(null);
        }
        paramContext = (Context)localObject;
        if (localDrawable != null) {
          paramContext = localDrawable.mutate();
        }
        this.ga = paramContext;
        if (this.ga != null)
        {
          if (this.ga.isStateful()) {
            this.ga.setState(getDrawableState());
          }
          android.support.v4.b.a.a.b(this.ga, android.support.v4.view.z.J(this));
          paramContext = this.ga;
          if (getVisibility() != 0) {
            break label581;
          }
        }
      }
    }
    label581:
    for (boolean bool = true;; bool = false)
    {
      paramContext.setVisible(bool, false);
      this.ga.setCallback(this);
      this.ga.setAlpha(this.gb);
      android.support.v4.view.z.F(this);
      this.fN = paramAttributeSet.getResourceId(a.i.bx, -1);
      paramAttributeSet.recycle();
      setWillNotDraw(false);
      android.support.v4.view.z.b(this, new android.support.v4.view.t()
      {
        public final ap a(View paramAnonymousView, ap paramAnonymousap)
        {
          return CollapsingToolbarLayout.a(CollapsingToolbarLayout.this, paramAnonymousap);
        }
      });
      return;
      paramContext = null;
      break;
    }
  }
  
  private LayoutParams Q()
  {
    return new LayoutParams(super.generateDefaultLayoutParams());
  }
  
  private static int j(View paramView)
  {
    Object localObject = paramView.getLayoutParams();
    if ((localObject instanceof ViewGroup.MarginLayoutParams))
    {
      localObject = (ViewGroup.MarginLayoutParams)localObject;
      int i = paramView.getHeight();
      int j = ((ViewGroup.MarginLayoutParams)localObject).topMargin;
      return ((ViewGroup.MarginLayoutParams)localObject).bottomMargin + (i + j);
    }
    return paramView.getHeight();
  }
  
  private static z k(View paramView)
  {
    z localz2 = (z)paramView.getTag(a.e.ay);
    z localz1 = localz2;
    if (localz2 == null)
    {
      localz1 = new z(paramView);
      paramView.setTag(a.e.ay, localz1);
    }
    return localz1;
  }
  
  final void P()
  {
    if (!this.fM) {
      return;
    }
    this.fO = null;
    this.fP = null;
    if (this.fN != -1)
    {
      this.fO = ((Toolbar)findViewById(this.fN));
      if (this.fO != null)
      {
        Object localObject2 = this.fO;
        for (localObject1 = ((View)localObject2).getParent(); (localObject1 != this) && (localObject1 != null); localObject1 = ((ViewParent)localObject1).getParent()) {
          if ((localObject1 instanceof View)) {
            localObject2 = (View)localObject1;
          }
        }
        this.fP = ((View)localObject2);
      }
    }
    int i;
    if (this.fO == null)
    {
      int j = getChildCount();
      i = 0;
      if (i >= j) {
        break label252;
      }
      localObject1 = getChildAt(i);
      if (!(localObject1 instanceof Toolbar)) {
        break label245;
      }
    }
    label245:
    label252:
    for (Object localObject1 = (Toolbar)localObject1;; localObject1 = null)
    {
      this.fO = ((Toolbar)localObject1);
      if ((!this.fX) && (this.fQ != null))
      {
        localObject1 = this.fQ.getParent();
        if ((localObject1 instanceof ViewGroup)) {
          ((ViewGroup)localObject1).removeView(this.fQ);
        }
      }
      if ((this.fX) && (this.fO != null))
      {
        if (this.fQ == null) {
          this.fQ = new View(getContext());
        }
        if (this.fQ.getParent() == null) {
          this.fO.addView(this.fQ, -1, -1);
        }
      }
      this.fM = false;
      return;
      i += 1;
      break;
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof LayoutParams;
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    P();
    if ((this.fO == null) && (this.fZ != null) && (this.gb > 0))
    {
      this.fZ.mutate().setAlpha(this.gb);
      this.fZ.draw(paramCanvas);
    }
    if ((this.fX) && (this.fY)) {
      this.fW.draw(paramCanvas);
    }
    if ((this.ga != null) && (this.gb > 0)) {
      if (this.dS == null) {
        break label153;
      }
    }
    label153:
    for (int i = this.dS.getSystemWindowInsetTop();; i = 0)
    {
      if (i > 0)
      {
        this.ga.setBounds(0, -this.gf, getWidth(), i - this.gf);
        this.ga.mutate().setAlpha(this.gb);
        this.ga.draw(paramCanvas);
      }
      return;
    }
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    P();
    if ((paramView == this.fO) && (this.fZ != null) && (this.gb > 0))
    {
      this.fZ.mutate().setAlpha(this.gb);
      this.fZ.draw(paramCanvas);
    }
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    boolean bool2 = false;
    Drawable localDrawable = this.ga;
    boolean bool1 = bool2;
    if (localDrawable != null)
    {
      bool1 = bool2;
      if (localDrawable.isStateful()) {
        bool1 = localDrawable.setState(arrayOfInt) | false;
      }
    }
    localDrawable = this.fZ;
    bool2 = bool1;
    if (localDrawable != null)
    {
      bool2 = bool1;
      if (localDrawable.isStateful()) {
        bool2 = bool1 | localDrawable.setState(arrayOfInt);
      }
    }
    if (bool2) {
      invalidate();
    }
  }
  
  public FrameLayout.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    Object localObject = getParent();
    if ((localObject instanceof AppBarLayout))
    {
      if (this.ge == null) {
        this.ge = new a();
      }
      localObject = (AppBarLayout)localObject;
      AppBarLayout.a locala = this.ge;
      if ((locala != null) && (!((AppBarLayout)localObject).dT.contains(locala))) {
        ((AppBarLayout)localObject).dT.add(locala);
      }
    }
    android.support.v4.view.z.Z(this);
  }
  
  protected void onDetachedFromWindow()
  {
    Object localObject = getParent();
    if ((this.ge != null) && ((localObject instanceof AppBarLayout)))
    {
      localObject = (AppBarLayout)localObject;
      AppBarLayout.a locala = this.ge;
      if (locala != null) {
        ((AppBarLayout)localObject).dT.remove(locala);
      }
    }
    super.onDetachedFromWindow();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int j = 1;
    int k = 0;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.fX) && (this.fQ != null))
    {
      if ((!android.support.v4.view.z.al(this.fQ)) || (this.fQ.getVisibility() != 0)) {
        break label308;
      }
      paramBoolean = true;
      this.fY = paramBoolean;
      if (this.fY) {
        if ((this.fP == null) || (this.fP == this)) {
          break label417;
        }
      }
    }
    label154:
    label171:
    label308:
    label319:
    label328:
    label417:
    for (int i = ((LayoutParams)this.fP.getLayoutParams()).bottomMargin;; i = 0)
    {
      x.a(this, this.fQ, this.fV);
      this.fW.c(this.fV.left, paramInt4 - this.fV.height() - i, this.fV.right, paramInt4 - i);
      Object localObject;
      int m;
      int n;
      if (android.support.v4.view.z.J(this) == 1)
      {
        localObject = this.fW;
        if (j == 0) {
          break label319;
        }
        i = this.fT;
        m = this.fV.bottom;
        n = this.fS;
        if (j == 0) {
          break label328;
        }
      }
      for (j = this.fR;; j = this.fT)
      {
        ((f)localObject).b(i, m + n, paramInt3 - paramInt1 - j, paramInt4 - paramInt2 - this.fU);
        this.fW.N();
        paramInt2 = getChildCount();
        paramInt1 = k;
        while (paramInt1 < paramInt2)
        {
          localObject = getChildAt(paramInt1);
          if ((this.dS != null) && (!android.support.v4.view.z.aa((View)localObject)))
          {
            paramInt3 = this.dS.getSystemWindowInsetTop();
            if (((View)localObject).getTop() < paramInt3) {
              android.support.v4.view.z.j((View)localObject, paramInt3);
            }
          }
          k((View)localObject).ay();
          paramInt1 += 1;
        }
        paramBoolean = false;
        break;
        j = 0;
        break label154;
        i = this.fR;
        break label171;
      }
      if (this.fO != null)
      {
        if ((this.fX) && (TextUtils.isEmpty(this.fW.mText))) {
          this.fW.setText(this.fO.YM);
        }
        if ((this.fP == null) || (this.fP == this)) {
          setMinimumHeight(j(this.fO));
        }
      }
      else
      {
        return;
      }
      setMinimumHeight(j(this.fP));
      return;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    P();
    super.onMeasure(paramInt1, paramInt2);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.fZ != null) {
      this.fZ.setBounds(0, 0, paramInt1, paramInt2);
    }
  }
  
  final void r(int paramInt)
  {
    if (paramInt != this.gb)
    {
      if ((this.fZ != null) && (this.fO != null)) {
        android.support.v4.view.z.F(this.fO);
      }
      this.gb = paramInt;
      android.support.v4.view.z.F(this);
    }
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0) {}
    for (boolean bool = true;; bool = false)
    {
      if ((this.ga != null) && (this.ga.isVisible() != bool)) {
        this.ga.setVisible(bool, false);
      }
      if ((this.fZ != null) && (this.fZ.isVisible() != bool)) {
        this.fZ.setVisible(bool, false);
      }
      return;
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == this.fZ) || (paramDrawable == this.ga);
  }
  
  public static class LayoutParams
    extends FrameLayout.LayoutParams
  {
    int gh = 0;
    float gi = 0.5F;
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.i.bf);
      this.gh = paramContext.getInt(a.i.bg, 0);
      this.gi = paramContext.getFloat(a.i.bh, 0.5F);
      paramContext.recycle();
    }
    
    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public LayoutParams(FrameLayout.LayoutParams paramLayoutParams)
    {
      super();
    }
  }
  
  private final class a
    implements AppBarLayout.a
  {
    public a() {}
    
    public final void a(AppBarLayout paramAppBarLayout, int paramInt)
    {
      int k = 255;
      int n = 1;
      int m = 0;
      CollapsingToolbarLayout.b(CollapsingToolbarLayout.this, paramInt);
      int i;
      int i1;
      label60:
      Object localObject1;
      Object localObject2;
      Object localObject3;
      if (CollapsingToolbarLayout.a(CollapsingToolbarLayout.this) != null)
      {
        i = CollapsingToolbarLayout.a(CollapsingToolbarLayout.this).getSystemWindowInsetTop();
        i1 = paramAppBarLayout.F();
        int i2 = CollapsingToolbarLayout.this.getChildCount();
        j = 0;
        if (j >= i2) {
          break label193;
        }
        localObject1 = CollapsingToolbarLayout.this.getChildAt(j);
        localObject2 = (CollapsingToolbarLayout.LayoutParams)((View)localObject1).getLayoutParams();
        localObject3 = CollapsingToolbarLayout.l((View)localObject1);
        switch (((CollapsingToolbarLayout.LayoutParams)localObject2).gh)
        {
        }
      }
      for (;;)
      {
        j += 1;
        break label60;
        i = 0;
        break;
        if (CollapsingToolbarLayout.this.getHeight() - i + paramInt >= ((View)localObject1).getHeight())
        {
          ((z)localObject3).f(-paramInt);
          continue;
          float f = -paramInt;
          ((z)localObject3).f(Math.round(((CollapsingToolbarLayout.LayoutParams)localObject2).gi * f));
        }
      }
      label193:
      boolean bool;
      if ((CollapsingToolbarLayout.b(CollapsingToolbarLayout.this) != null) || (CollapsingToolbarLayout.c(CollapsingToolbarLayout.this) != null))
      {
        localObject2 = CollapsingToolbarLayout.this;
        if (CollapsingToolbarLayout.this.getHeight() + paramInt >= android.support.v4.view.z.U(CollapsingToolbarLayout.this) * 2 + i) {
          break label489;
        }
        bool = true;
        if ((!android.support.v4.view.z.aj((View)localObject2)) || (((CollapsingToolbarLayout)localObject2).isInEditMode())) {
          break label495;
        }
        j = n;
        label266:
        if (((CollapsingToolbarLayout)localObject2).gc != bool)
        {
          if (j == 0) {
            break label537;
          }
          j = m;
          if (bool) {
            j = 255;
          }
          ((CollapsingToolbarLayout)localObject2).P();
          if (((CollapsingToolbarLayout)localObject2).gd != null) {
            break label509;
          }
          ((CollapsingToolbarLayout)localObject2).gd = aa.av();
          ((CollapsingToolbarLayout)localObject2).gd.setDuration(600);
          localObject3 = ((CollapsingToolbarLayout)localObject2).gd;
          if (j <= ((CollapsingToolbarLayout)localObject2).gb) {
            break label501;
          }
          localObject1 = a.dJ;
          label349:
          ((u)localObject3).setInterpolator((Interpolator)localObject1);
          ((CollapsingToolbarLayout)localObject2).gd.a(new CollapsingToolbarLayout.2((CollapsingToolbarLayout)localObject2));
        }
      }
      for (;;)
      {
        ((CollapsingToolbarLayout)localObject2).gd.e(((CollapsingToolbarLayout)localObject2).gb, j);
        ((CollapsingToolbarLayout)localObject2).gd.ky.start();
        ((CollapsingToolbarLayout)localObject2).gc = bool;
        if ((CollapsingToolbarLayout.c(CollapsingToolbarLayout.this) != null) && (i > 0)) {
          android.support.v4.view.z.F(CollapsingToolbarLayout.this);
        }
        j = CollapsingToolbarLayout.this.getHeight();
        k = android.support.v4.view.z.U(CollapsingToolbarLayout.this);
        CollapsingToolbarLayout.d(CollapsingToolbarLayout.this).e(Math.abs(paramInt) / (j - k - i));
        if (Math.abs(paramInt) != i1) {
          break label562;
        }
        android.support.v4.view.z.g(paramAppBarLayout, paramAppBarLayout.dQ);
        return;
        label489:
        bool = false;
        break;
        label495:
        j = 0;
        break label266;
        label501:
        localObject1 = a.dK;
        break label349;
        label509:
        if (((CollapsingToolbarLayout)localObject2).gd.ky.isRunning()) {
          ((CollapsingToolbarLayout)localObject2).gd.ky.cancel();
        }
      }
      label537:
      if (bool) {}
      for (int j = k;; j = 0)
      {
        ((CollapsingToolbarLayout)localObject2).r(j);
        break;
      }
      label562:
      android.support.v4.view.z.g(paramAppBarLayout, 0.0F);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\CollapsingToolbarLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */