package android.support.design.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.a.d;
import android.support.design.a.h;
import android.support.design.a.i;
import android.support.v4.view.z;
import android.support.v7.widget.h;
import android.support.v7.widget.i;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewTreeObserver;

@CoordinatorLayout.b(a.class)
public class FloatingActionButton
  extends VisibilityAwareImageButton
{
  private ColorStateList ha;
  private PorterDuff.Mode hb;
  private int hc;
  private int hd;
  private int he;
  private boolean hf;
  private final Rect hg = new Rect();
  private i hh;
  private l hi;
  private int mSize;
  
  public FloatingActionButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public FloatingActionButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    t.d(paramContext);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.i.bI, paramInt, a.h.aQ);
    this.ha = localTypedArray.getColorStateList(a.i.bJ);
    switch (localTypedArray.getInt(a.i.bK, -1))
    {
    default: 
      paramContext = null;
    }
    for (;;)
    {
      this.hb = paramContext;
      this.hd = localTypedArray.getColor(a.i.bP, 0);
      this.mSize = localTypedArray.getInt(a.i.bN, 0);
      this.hc = localTypedArray.getDimensionPixelSize(a.i.bL, 0);
      float f1 = localTypedArray.getDimension(a.i.bM, 0.0F);
      float f2 = localTypedArray.getDimension(a.i.bO, 0.0F);
      this.hf = localTypedArray.getBoolean(a.i.bQ, false);
      localTypedArray.recycle();
      this.hh = new i(this, h.ex());
      this.hh.a(paramAttributeSet, paramInt);
      paramInt = (int)getResources().getDimension(a.d.aj);
      this.he = ((T() - paramInt) / 2);
      U().a(this.ha, this.hb, this.hd, this.hc);
      paramContext = U();
      if (paramContext.hE != f1)
      {
        paramContext.hE = f1;
        paramContext.i(f1);
      }
      paramContext = U();
      if (paramContext.hF != f2)
      {
        paramContext.hF = f2;
        paramContext.j(f2);
      }
      U().ab();
      return;
      paramContext = PorterDuff.Mode.SRC_OVER;
      continue;
      paramContext = PorterDuff.Mode.SRC_IN;
      continue;
      paramContext = PorterDuff.Mode.SRC_ATOP;
      continue;
      paramContext = PorterDuff.Mode.MULTIPLY;
      continue;
      paramContext = PorterDuff.Mode.SCREEN;
    }
  }
  
  private l U()
  {
    int i;
    Object localObject;
    if (this.hi == null)
    {
      i = Build.VERSION.SDK_INT;
      if (i < 21) {
        break label44;
      }
      localObject = new m(this, new b());
    }
    for (;;)
    {
      this.hi = ((l)localObject);
      return this.hi;
      label44:
      if (i >= 14) {
        localObject = new k(this, new b());
      } else {
        localObject = new j(this, new b());
      }
    }
  }
  
  private static int resolveAdjustedSize(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    switch (i)
    {
    case 0: 
    default: 
      return paramInt1;
    case -2147483648: 
      return Math.min(paramInt1, paramInt2);
    }
    return paramInt2;
  }
  
  final int T()
  {
    switch (this.mSize)
    {
    default: 
      return getResources().getDimensionPixelSize(a.d.al);
    }
    return getResources().getDimensionPixelSize(a.d.ak);
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    U().a(getDrawableState());
  }
  
  public ColorStateList getBackgroundTintList()
  {
    return this.ha;
  }
  
  public PorterDuff.Mode getBackgroundTintMode()
  {
    return this.hb;
  }
  
  @TargetApi(11)
  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    U().X();
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    l locall = U();
    if (locall.Z())
    {
      if (locall.hJ == null) {
        locall.hJ = new l.1(locall);
      }
      locall.hH.getViewTreeObserver().addOnPreDrawListener(locall.hJ);
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    l locall = U();
    if (locall.hJ != null)
    {
      locall.hH.getViewTreeObserver().removeOnPreDrawListener(locall.hJ);
      locall.hJ = null;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = T();
    paramInt1 = Math.min(resolveAdjustedSize(i, paramInt1), resolveAdjustedSize(i, paramInt2));
    setMeasuredDimension(this.hg.left + paramInt1 + this.hg.right, paramInt1 + this.hg.top + this.hg.bottom);
  }
  
  public void setBackgroundColor(int paramInt) {}
  
  public void setBackgroundDrawable(Drawable paramDrawable) {}
  
  public void setBackgroundResource(int paramInt) {}
  
  public void setBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (this.ha != paramColorStateList)
    {
      this.ha = paramColorStateList;
      U().setBackgroundTintList(paramColorStateList);
    }
  }
  
  public void setBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (this.hb != paramMode)
    {
      this.hb = paramMode;
      U().setBackgroundTintMode(paramMode);
    }
  }
  
  public void setImageResource(int paramInt)
  {
    this.hh.setImageResource(paramInt);
  }
  
  public static final class a
    extends CoordinatorLayout.Behavior<FloatingActionButton>
  {
    private static final boolean hj;
    private Rect fV;
    private u hk;
    private float hl;
    
    static
    {
      if (Build.VERSION.SDK_INT >= 11) {}
      for (boolean bool = true;; bool = false)
      {
        hj = bool;
        return;
      }
    }
    
    private boolean a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, FloatingActionButton paramFloatingActionButton)
    {
      int i = 0;
      if (((CoordinatorLayout.d)paramFloatingActionButton.getLayoutParams()).gN != paramAppBarLayout.getId()) {
        return false;
      }
      if (paramFloatingActionButton.la != 0) {
        return false;
      }
      if (this.fV == null) {
        this.fV = new Rect();
      }
      Rect localRect = this.fV;
      x.a(paramCoordinatorLayout, paramAppBarLayout, localRect);
      int j = localRect.bottom;
      int k = paramAppBarLayout.G();
      int m = z.U(paramAppBarLayout);
      if (m != 0)
      {
        i = m * 2 + k;
        if (j > i) {
          break label140;
        }
        FloatingActionButton.a(paramFloatingActionButton);
      }
      for (;;)
      {
        return true;
        m = paramAppBarLayout.getChildCount();
        if (m <= 0) {
          break;
        }
        i = z.U(paramAppBarLayout.getChildAt(m - 1)) * 2 + k;
        break;
        label140:
        FloatingActionButton.b(paramFloatingActionButton);
      }
    }
  }
  
  private final class b
    implements p
  {
    public b() {}
    
    public final float V()
    {
      return FloatingActionButton.this.T() / 2.0F;
    }
    
    public final boolean W()
    {
      return FloatingActionButton.e(FloatingActionButton.this);
    }
    
    public final void d(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      FloatingActionButton.c(FloatingActionButton.this).set(paramInt1, paramInt2, paramInt3, paramInt4);
      FloatingActionButton.this.setPadding(FloatingActionButton.d(FloatingActionButton.this) + paramInt1, FloatingActionButton.d(FloatingActionButton.this) + paramInt2, FloatingActionButton.d(FloatingActionButton.this) + paramInt3, FloatingActionButton.d(FloatingActionButton.this) + paramInt4);
    }
    
    public final void setBackgroundDrawable(Drawable paramDrawable)
    {
      FloatingActionButton.a(FloatingActionButton.this, paramDrawable);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\FloatingActionButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */