package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.o;
import android.support.v4.view.p;
import android.support.v4.view.q;
import android.support.v4.view.r;
import android.support.v4.view.s;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;

public class SwipeRefreshLayout
  extends ViewGroup
  implements p, r
{
  private static final String Dj = SwipeRefreshLayout.class.getSimpleName();
  private static final int[] xC = { 16842766 };
  private int DA = -1;
  protected int DB;
  private float DC;
  protected int DD;
  private l DE;
  private Animation DF;
  private Animation DG;
  private Animation DH;
  private Animation DI;
  private float DJ;
  private boolean DK;
  private int DL;
  private int DM;
  private boolean DN;
  private Animation.AnimationListener DO = new Animation.AnimationListener()
  {
    public final void onAnimationEnd(Animation paramAnonymousAnimation)
    {
      if (SwipeRefreshLayout.a(SwipeRefreshLayout.this))
      {
        SwipeRefreshLayout.b(SwipeRefreshLayout.this).setAlpha(255);
        SwipeRefreshLayout.b(SwipeRefreshLayout.this).start();
        if ((SwipeRefreshLayout.c(SwipeRefreshLayout.this)) && (SwipeRefreshLayout.d(SwipeRefreshLayout.this) != null)) {
          SwipeRefreshLayout.d(SwipeRefreshLayout.this);
        }
        SwipeRefreshLayout.a(SwipeRefreshLayout.this, SwipeRefreshLayout.e(SwipeRefreshLayout.this).getTop());
        return;
      }
      SwipeRefreshLayout.f(SwipeRefreshLayout.this);
    }
    
    public final void onAnimationRepeat(Animation paramAnonymousAnimation) {}
    
    public final void onAnimationStart(Animation paramAnonymousAnimation) {}
  };
  private final Animation DP = new Animation()
  {
    public final void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
    {
      if (!SwipeRefreshLayout.i(SwipeRefreshLayout.this)) {}
      for (int i = (int)(SwipeRefreshLayout.j(SwipeRefreshLayout.this) - Math.abs(SwipeRefreshLayout.this.DD));; i = (int)SwipeRefreshLayout.j(SwipeRefreshLayout.this))
      {
        int j = SwipeRefreshLayout.this.DB;
        i = (int)((i - SwipeRefreshLayout.this.DB) * paramAnonymousFloat);
        int k = SwipeRefreshLayout.e(SwipeRefreshLayout.this).getTop();
        SwipeRefreshLayout.b(SwipeRefreshLayout.this, i + j - k);
        SwipeRefreshLayout.b(SwipeRefreshLayout.this).v(1.0F - paramAnonymousFloat);
        return;
      }
    }
  };
  private final Animation DQ = new Animation()
  {
    public final void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
    {
      SwipeRefreshLayout.b(SwipeRefreshLayout.this, paramAnonymousFloat);
    }
  };
  private a Dk;
  private boolean Dl = false;
  private float Dm = -1.0F;
  private float Dn;
  private final q Do;
  private final int[] Dp = new int[2];
  private final int[] Dq = new int[2];
  private boolean Dr;
  private int Ds;
  private int Dt;
  private boolean Du = false;
  private float Dv;
  private boolean Dw;
  private boolean Dx;
  private final DecelerateInterpolator Dy;
  private b Dz;
  private int eA = -1;
  private final s gH;
  private boolean hO;
  private int hQ;
  private View mN;
  private float wT;
  
  public SwipeRefreshLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.hQ = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    this.Ds = getResources().getInteger(17694721);
    setWillNotDraw(false);
    this.Dy = new DecelerateInterpolator(2.0F);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, xC);
    setEnabled(paramContext.getBoolean(0, true));
    paramContext.recycle();
    paramContext = getResources().getDisplayMetrics();
    this.DL = ((int)(paramContext.density * 40.0F));
    this.DM = ((int)(paramContext.density * 40.0F));
    this.Dz = new b(getContext());
    this.DE = new l(getContext(), this);
    this.DE.BJ.Cj = -328966;
    this.Dz.setImageDrawable(this.DE);
    this.Dz.setVisibility(8);
    addView(this.Dz);
    z.a(this);
    this.DJ = (paramContext.density * 64.0F);
    this.Dm = this.DJ;
    this.gH = new s(this);
    this.Do = new q(this);
    setNestedScrollingEnabled(true);
  }
  
  private void B(float paramFloat)
  {
    if (cD())
    {
      al((int)(255.0F * paramFloat));
      return;
    }
    z.e(this.Dz, paramFloat);
    z.f(this.Dz, paramFloat);
  }
  
  private void C(float paramFloat)
  {
    this.DE.u(true);
    float f2 = Math.min(1.0F, Math.abs(paramFloat / this.Dm));
    float f3 = (float)Math.max(f2 - 0.4D, 0.0D) * 5.0F / 3.0F;
    float f4 = Math.abs(paramFloat);
    float f5 = this.Dm;
    float f1;
    int i;
    int j;
    if (this.DN)
    {
      f1 = this.DJ - this.DD;
      f4 = Math.max(0.0F, Math.min(f4 - f5, f1 * 2.0F) / f1);
      f4 = (float)(f4 / 4.0F - Math.pow(f4 / 4.0F, 2.0D)) * 2.0F;
      i = this.DD;
      j = (int)(f1 * f2 + f1 * f4 * 2.0F);
      if (this.Dz.getVisibility() != 0) {
        this.Dz.setVisibility(0);
      }
      if (!this.Dw)
      {
        z.e(this.Dz, 1.0F);
        z.f(this.Dz, 1.0F);
      }
      if (this.Dw) {
        B(Math.min(1.0F, paramFloat / this.Dm));
      }
      if (paramFloat >= this.Dm) {
        break label332;
      }
      if ((this.DE.getAlpha() > 76) && (!d(this.DG))) {
        this.DG = o(this.DE.getAlpha(), 76);
      }
    }
    for (;;)
    {
      this.DE.w(Math.min(0.8F, f3 * 0.8F));
      this.DE.v(Math.min(1.0F, f3));
      this.DE.BJ.setRotation((-0.25F + f3 * 0.4F + f4 * 2.0F) * 0.5F);
      d(j + i - this.Dt, true);
      return;
      f1 = this.DJ;
      break;
      label332:
      if ((this.DE.getAlpha() < 255) && (!d(this.DH))) {
        this.DH = o(this.DE.getAlpha(), 255);
      }
    }
  }
  
  private void D(float paramFloat)
  {
    if (paramFloat > this.Dm)
    {
      if (this.Dl != true)
      {
        this.DK = true;
        cE();
        this.Dl = true;
        if (this.Dl)
        {
          i = this.Dt;
          localObject = this.DO;
          this.DB = i;
          this.DP.reset();
          this.DP.setDuration(200L);
          this.DP.setInterpolator(this.Dy);
          if (localObject != null) {
            this.Dz.Ao = ((Animation.AnimationListener)localObject);
          }
          this.Dz.clearAnimation();
          this.Dz.startAnimation(this.DP);
        }
      }
      else
      {
        return;
      }
      a(this.DO);
      return;
    }
    this.Dl = false;
    this.DE.w(0.0F);
    Object localObject = null;
    if (!this.Dw) {
      localObject = new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          if (!SwipeRefreshLayout.g(SwipeRefreshLayout.this)) {
            SwipeRefreshLayout.h(SwipeRefreshLayout.this);
          }
        }
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation) {}
        
        public final void onAnimationStart(Animation paramAnonymousAnimation) {}
      };
    }
    int i = this.Dt;
    if (this.Dw)
    {
      this.DB = i;
      if (cD())
      {
        this.DC = this.DE.getAlpha();
        this.DI = new Animation()
        {
          public final void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
          {
            float f1 = SwipeRefreshLayout.k(SwipeRefreshLayout.this);
            float f2 = -SwipeRefreshLayout.k(SwipeRefreshLayout.this);
            SwipeRefreshLayout.a(SwipeRefreshLayout.this, f1 + f2 * paramAnonymousFloat);
            SwipeRefreshLayout.b(SwipeRefreshLayout.this, paramAnonymousFloat);
          }
        };
        this.DI.setDuration(150L);
        if (localObject != null) {
          this.Dz.Ao = ((Animation.AnimationListener)localObject);
        }
        this.Dz.clearAnimation();
        this.Dz.startAnimation(this.DI);
      }
    }
    for (;;)
    {
      this.DE.u(false);
      return;
      this.DC = z.W(this.Dz);
      break;
      this.DB = i;
      this.DQ.reset();
      this.DQ.setDuration(200L);
      this.DQ.setInterpolator(this.Dy);
      if (localObject != null) {
        this.Dz.Ao = ((Animation.AnimationListener)localObject);
      }
      this.Dz.clearAnimation();
      this.Dz.startAnimation(this.DQ);
    }
  }
  
  private void a(Animation.AnimationListener paramAnimationListener)
  {
    this.DF = new Animation()
    {
      public final void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        SwipeRefreshLayout.a(SwipeRefreshLayout.this, 1.0F - paramAnonymousFloat);
      }
    };
    this.DF.setDuration(150L);
    this.Dz.Ao = paramAnimationListener;
    this.Dz.clearAnimation();
    this.Dz.startAnimation(this.DF);
  }
  
  private void al(int paramInt)
  {
    this.Dz.getBackground().setAlpha(paramInt);
    this.DE.setAlpha(paramInt);
  }
  
  private static boolean cD()
  {
    return Build.VERSION.SDK_INT < 11;
  }
  
  private void cE()
  {
    int i;
    if (this.mN == null) {
      i = 0;
    }
    for (;;)
    {
      if (i < getChildCount())
      {
        View localView = getChildAt(i);
        if (!localView.equals(this.Dz)) {
          this.mN = localView;
        }
      }
      else
      {
        return;
      }
      i += 1;
    }
  }
  
  private boolean cF()
  {
    if (Build.VERSION.SDK_INT < 14)
    {
      if ((this.mN instanceof AbsListView))
      {
        AbsListView localAbsListView = (AbsListView)this.mN;
        return (localAbsListView.getChildCount() > 0) && ((localAbsListView.getFirstVisiblePosition() > 0) || (localAbsListView.getChildAt(0).getTop() < localAbsListView.getPaddingTop()));
      }
      return (z.h(this.mN, -1)) || (this.mN.getScrollY() > 0);
    }
    return z.h(this.mN, -1);
  }
  
  private void d(int paramInt, boolean paramBoolean)
  {
    this.Dz.bringToFront();
    this.Dz.offsetTopAndBottom(paramInt);
    this.Dt = this.Dz.getTop();
    if ((paramBoolean) && (Build.VERSION.SDK_INT < 11)) {
      invalidate();
    }
  }
  
  private static boolean d(Animation paramAnimation)
  {
    return (paramAnimation != null) && (paramAnimation.hasStarted()) && (!paramAnimation.hasEnded());
  }
  
  private static float g(MotionEvent paramMotionEvent, int paramInt)
  {
    paramInt = o.b(paramMotionEvent, paramInt);
    if (paramInt < 0) {
      return -1.0F;
    }
    return o.e(paramMotionEvent, paramInt);
  }
  
  private void h(MotionEvent paramMotionEvent)
  {
    int i = o.e(paramMotionEvent);
    if (o.c(paramMotionEvent, i) == this.eA) {
      if (i != 0) {
        break label33;
      }
    }
    label33:
    for (i = 1;; i = 0)
    {
      this.eA = o.c(paramMotionEvent, i);
      return;
    }
  }
  
  private Animation o(final int paramInt1, final int paramInt2)
  {
    if ((this.Dw) && (cD())) {
      return null;
    }
    Animation local3 = new Animation()
    {
      public final void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        SwipeRefreshLayout.b(SwipeRefreshLayout.this).setAlpha((int)(paramInt1 + (paramInt2 - paramInt1) * paramAnonymousFloat));
      }
    };
    local3.setDuration(300L);
    this.Dz.Ao = null;
    this.Dz.clearAnimation();
    this.Dz.startAnimation(local3);
    return local3;
  }
  
  private void reset()
  {
    this.Dz.clearAnimation();
    this.DE.stop();
    this.Dz.setVisibility(8);
    al(255);
    if (this.Dw) {
      B(0.0F);
    }
    for (;;)
    {
      this.Dt = this.Dz.getTop();
      return;
      d(this.DD - this.Dt, true);
    }
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return this.Do.dispatchNestedFling(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return this.Do.dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return this.Do.dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return this.Do.dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    if (this.DA < 0) {}
    do
    {
      return paramInt2;
      if (paramInt2 == paramInt1 - 1) {
        return this.DA;
      }
    } while (paramInt2 < this.DA);
    return paramInt2 + 1;
  }
  
  public int getNestedScrollAxes()
  {
    return this.gH.wD;
  }
  
  public boolean hasNestedScrollingParent()
  {
    return this.Do.hasNestedScrollingParent();
  }
  
  public boolean isNestedScrollingEnabled()
  {
    return this.Do.wA;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    reset();
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    cE();
    int i = o.d(paramMotionEvent);
    if ((this.Dx) && (i == 0)) {
      this.Dx = false;
    }
    if ((!isEnabled()) || (this.Dx) || (cF()) || (this.Dl) || (this.Dr)) {
      return false;
    }
    switch (i)
    {
    }
    for (;;)
    {
      return this.hO;
      d(this.DD - this.Dz.getTop(), true);
      this.eA = o.c(paramMotionEvent, 0);
      this.hO = false;
      float f = g(paramMotionEvent, this.eA);
      if (f == -1.0F) {
        break;
      }
      this.Dv = f;
      continue;
      if (this.eA == -1) {
        break;
      }
      f = g(paramMotionEvent, this.eA);
      if (f == -1.0F) {
        break;
      }
      if ((f - this.Dv > this.hQ) && (!this.hO))
      {
        this.wT = (this.Dv + this.hQ);
        this.hO = true;
        this.DE.setAlpha(76);
        continue;
        h(paramMotionEvent);
        continue;
        this.hO = false;
        this.eA = -1;
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt1 = getMeasuredWidth();
    paramInt2 = getMeasuredHeight();
    if (getChildCount() == 0) {}
    do
    {
      return;
      if (this.mN == null) {
        cE();
      }
    } while (this.mN == null);
    View localView = this.mN;
    paramInt3 = getPaddingLeft();
    paramInt4 = getPaddingTop();
    localView.layout(paramInt3, paramInt4, paramInt1 - getPaddingLeft() - getPaddingRight() + paramInt3, paramInt2 - getPaddingTop() - getPaddingBottom() + paramInt4);
    paramInt2 = this.Dz.getMeasuredWidth();
    paramInt3 = this.Dz.getMeasuredHeight();
    this.Dz.layout(paramInt1 / 2 - paramInt2 / 2, this.Dt, paramInt1 / 2 + paramInt2 / 2, this.Dt + paramInt3);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.mN == null) {
      cE();
    }
    if (this.mN == null) {}
    for (;;)
    {
      return;
      this.mN.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), 1073741824));
      this.Dz.measure(View.MeasureSpec.makeMeasureSpec(this.DL, 1073741824), View.MeasureSpec.makeMeasureSpec(this.DM, 1073741824));
      if ((!this.DN) && (!this.Du))
      {
        this.Du = true;
        paramInt1 = -this.Dz.getMeasuredHeight();
        this.DD = paramInt1;
        this.Dt = paramInt1;
      }
      this.DA = -1;
      paramInt1 = 0;
      while (paramInt1 < getChildCount())
      {
        if (getChildAt(paramInt1) == this.Dz)
        {
          this.DA = paramInt1;
          return;
        }
        paramInt1 += 1;
      }
    }
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return dispatchNestedFling(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    if ((paramInt2 > 0) && (this.Dn > 0.0F))
    {
      if (paramInt2 <= this.Dn) {
        break label141;
      }
      paramArrayOfInt[1] = (paramInt2 - (int)this.Dn);
      this.Dn = 0.0F;
    }
    for (;;)
    {
      C(this.Dn);
      if ((this.DN) && (paramInt2 > 0) && (this.Dn == 0.0F) && (Math.abs(paramInt2 - paramArrayOfInt[1]) > 0)) {
        this.Dz.setVisibility(8);
      }
      paramView = this.Dp;
      if (dispatchNestedPreScroll(paramInt1 - paramArrayOfInt[0], paramInt2 - paramArrayOfInt[1], paramView, null))
      {
        paramArrayOfInt[0] += paramView[0];
        paramInt1 = paramArrayOfInt[1];
        paramView[1] += paramInt1;
      }
      return;
      label141:
      this.Dn -= paramInt2;
      paramArrayOfInt[1] = paramInt2;
    }
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, this.Dq);
    paramInt1 = this.Dq[1] + paramInt4;
    if ((paramInt1 < 0) && (!cF()))
    {
      float f = this.Dn;
      this.Dn = (Math.abs(paramInt1) + f);
      C(this.Dn);
    }
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    this.gH.wD = paramInt;
    startNestedScroll(paramInt & 0x2);
    this.Dn = 0.0F;
    this.Dr = true;
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    return (isEnabled()) && (!this.Dx) && (!this.Dl) && ((paramInt & 0x2) != 0);
  }
  
  public void onStopNestedScroll(View paramView)
  {
    this.gH.wD = 0;
    this.Dr = false;
    if (this.Dn > 0.0F)
    {
      D(this.Dn);
      this.Dn = 0.0F;
    }
    stopNestedScroll();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = o.d(paramMotionEvent);
    if ((this.Dx) && (i == 0)) {
      this.Dx = false;
    }
    if ((!isEnabled()) || (this.Dx) || (cF()) || (this.Dr)) {}
    do
    {
      return false;
      switch (i)
      {
      case 3: 
      case 4: 
      default: 
      case 0: 
      case 2: 
      case 5: 
      case 6: 
        for (;;)
        {
          return true;
          this.eA = o.c(paramMotionEvent, 0);
          this.hO = false;
          continue;
          i = o.b(paramMotionEvent, this.eA);
          if (i < 0) {
            break;
          }
          f1 = (o.e(paramMotionEvent, i) - this.wT) * 0.5F;
          if (this.hO)
          {
            if (f1 <= 0.0F) {
              break;
            }
            C(f1);
            continue;
            i = o.e(paramMotionEvent);
            if (i < 0) {
              break;
            }
            this.eA = o.c(paramMotionEvent, i);
            continue;
            h(paramMotionEvent);
          }
        }
      }
      i = o.b(paramMotionEvent, this.eA);
    } while (i < 0);
    float f1 = o.e(paramMotionEvent, i);
    float f2 = this.wT;
    this.hO = false;
    D((f1 - f2) * 0.5F);
    this.eA = -1;
    return false;
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    if (((Build.VERSION.SDK_INT >= 21) || (!(this.mN instanceof AbsListView))) && ((this.mN == null) || (z.ah(this.mN)))) {
      super.requestDisallowInterceptTouchEvent(paramBoolean);
    }
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    this.Do.setNestedScrollingEnabled(paramBoolean);
  }
  
  public boolean startNestedScroll(int paramInt)
  {
    return this.Do.startNestedScroll(paramInt);
  }
  
  public void stopNestedScroll()
  {
    this.Do.stopNestedScroll();
  }
  
  public static abstract interface a {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\android\support\v4\widget\SwipeRefreshLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */