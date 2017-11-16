package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.design.a.h;
import android.support.design.a.i;
import android.support.v4.os.b;
import android.support.v4.os.c;
import android.support.v4.view.ap;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@CoordinatorLayout.b(Behavior.class)
public class AppBarLayout
  extends LinearLayout
{
  private int dM = -1;
  private int dN = -1;
  private int dO = -1;
  boolean dP;
  float dQ;
  private int dR = 0;
  private ap dS;
  final List<a> dT;
  
  public AppBarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOrientation(1);
    t.d(paramContext);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.i.aV, 0, a.h.aN);
    this.dQ = paramContext.getDimensionPixelSize(a.i.ba, 0);
    setBackgroundDrawable(paramContext.getDrawable(a.i.aZ));
    boolean bool2;
    if (paramContext.hasValue(a.i.bb))
    {
      boolean bool1 = paramContext.getBoolean(a.i.bb, false);
      bool2 = z.aj(this);
      if (!bool1) {
        break label168;
      }
    }
    for (;;)
    {
      if (bool2) {
        j = 4;
      }
      this.dR = (j | i);
      requestLayout();
      paramContext.recycle();
      aa.u(this);
      this.dT = new ArrayList();
      z.g(this, this.dQ);
      z.b(this, new android.support.v4.view.t()
      {
        public final ap a(View paramAnonymousView, ap paramAnonymousap)
        {
          return AppBarLayout.a(AppBarLayout.this, paramAnonymousap);
        }
      });
      return;
      label168:
      i = 2;
    }
  }
  
  private void E()
  {
    this.dM = -1;
    this.dN = -1;
    this.dO = -1;
  }
  
  private LayoutParams a(AttributeSet paramAttributeSet)
  {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  private static LayoutParams a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof LinearLayout.LayoutParams)) {
      return new LayoutParams((LinearLayout.LayoutParams)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new LayoutParams(paramLayoutParams);
  }
  
  public final int F()
  {
    if (this.dM != -1) {
      return this.dM;
    }
    int k = getChildCount();
    int j = 0;
    int i = 0;
    if (j < k)
    {
      View localView = getChildAt(j);
      LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
      int n = localView.getMeasuredHeight();
      int m = localLayoutParams.ek;
      if ((m & 0x1) != 0)
      {
        int i1 = localLayoutParams.topMargin;
        i += localLayoutParams.bottomMargin + (n + i1);
        if ((m & 0x2) != 0) {
          i -= z.U(localView);
        }
      }
    }
    for (;;)
    {
      i = Math.max(0, i - G());
      this.dM = i;
      return i;
      j += 1;
      break;
    }
  }
  
  final int G()
  {
    if (this.dS != null) {
      return this.dS.getSystemWindowInsetTop();
    }
    return 0;
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof LayoutParams;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    E();
    this.dP = false;
    paramInt2 = getChildCount();
    paramInt1 = 0;
    for (;;)
    {
      if (paramInt1 < paramInt2)
      {
        if (((LayoutParams)getChildAt(paramInt1).getLayoutParams()).el != null) {
          this.dP = true;
        }
      }
      else {
        return;
      }
      paramInt1 += 1;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    E();
  }
  
  public void setOrientation(int paramInt)
  {
    if (paramInt != 1) {
      throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }
    super.setOrientation(paramInt);
  }
  
  public static class Behavior
    extends HeaderBehavior<AppBarLayout>
  {
    public int dV;
    private boolean dW;
    private boolean dX;
    private u dY;
    private int dZ = -1;
    private boolean ea;
    private float eb;
    private WeakReference<View> ec;
    private a ed;
    
    public Behavior() {}
    
    public Behavior(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    private void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout)
    {
      int k = H();
      int j = paramAppBarLayout.getChildCount();
      int i = 0;
      View localView;
      if (i < j)
      {
        localView = paramAppBarLayout.getChildAt(i);
        if ((localView.getTop() <= -k) && (localView.getBottom() >= -k)) {
          label49:
          if (localView != null)
          {
            AppBarLayout.LayoutParams localLayoutParams = (AppBarLayout.LayoutParams)localView.getLayoutParams();
            if ((localLayoutParams.ek & 0x11) == 17)
            {
              j = -localView.getTop();
              i = -localView.getBottom();
              if ((localLayoutParams.ek & 0x2) != 2) {
                break label158;
              }
              i = z.U(localView) + i;
            }
          }
        }
      }
      label158:
      for (;;)
      {
        if (k < (i + j) / 2) {}
        for (;;)
        {
          a(paramCoordinatorLayout, paramAppBarLayout, n.b(i, -paramAppBarLayout.F(), 0));
          return;
          i += 1;
          break;
          localView = null;
          break label49;
          i = j;
        }
      }
    }
    
    private void a(final CoordinatorLayout paramCoordinatorLayout, final AppBarLayout paramAppBarLayout, int paramInt)
    {
      int i = H();
      if (i == paramInt)
      {
        if ((this.dY != null) && (this.dY.ky.isRunning())) {
          this.dY.ky.cancel();
        }
        return;
      }
      if (this.dY == null)
      {
        this.dY = aa.av();
        this.dY.setInterpolator(a.dL);
        this.dY.a(new u.c()
        {
          public final void a(u paramAnonymousu)
          {
            AppBarLayout.Behavior.this.c(paramCoordinatorLayout, paramAppBarLayout, paramAnonymousu.ky.aw());
          }
        });
      }
      for (;;)
      {
        float f = Math.abs(i - paramInt) / paramCoordinatorLayout.getResources().getDisplayMetrics().density;
        this.dY.setDuration(Math.round(f * 1000.0F / 300.0F));
        this.dY.e(i, paramInt);
        this.dY.ky.start();
        return;
        this.dY.ky.cancel();
      }
    }
    
    private void j(AppBarLayout paramAppBarLayout)
    {
      List localList = AppBarLayout.h(paramAppBarLayout);
      int j = localList.size();
      int i = 0;
      while (i < j)
      {
        AppBarLayout.a locala = (AppBarLayout.a)localList.get(i);
        if (locala != null) {
          locala.a(paramAppBarLayout, super.I());
        }
        i += 1;
      }
    }
    
    final int H()
    {
      return super.I() + this.dV;
    }
    
    protected static class SavedState
      extends View.BaseSavedState
    {
      public static final Parcelable.Creator<SavedState> CREATOR = b.a(new c() {});
      int eh;
      float ei;
      boolean ej;
      
      public SavedState(Parcel paramParcel)
      {
        super();
        this.eh = paramParcel.readInt();
        this.ei = paramParcel.readFloat();
        if (paramParcel.readByte() != 0) {}
        for (boolean bool = true;; bool = false)
        {
          this.ej = bool;
          return;
        }
      }
      
      public SavedState(Parcelable paramParcelable)
      {
        super();
      }
      
      public void writeToParcel(Parcel paramParcel, int paramInt)
      {
        super.writeToParcel(paramParcel, paramInt);
        paramParcel.writeInt(this.eh);
        paramParcel.writeFloat(this.ei);
        if (this.ej) {}
        for (paramInt = 1;; paramInt = 0)
        {
          paramParcel.writeByte((byte)paramInt);
          return;
        }
      }
    }
    
    public static abstract class a
    {
      public abstract boolean J();
    }
  }
  
  public static class LayoutParams
    extends LinearLayout.LayoutParams
  {
    int ek = 1;
    Interpolator el;
    
    public LayoutParams()
    {
      super(-2);
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.i.aW);
      this.ek = paramAttributeSet.getInt(a.i.aX, 0);
      if (paramAttributeSet.hasValue(a.i.aY)) {
        this.el = AnimationUtils.loadInterpolator(paramContext, paramAttributeSet.getResourceId(a.i.aY, 0));
      }
      paramAttributeSet.recycle();
    }
    
    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
    
    public LayoutParams(LinearLayout.LayoutParams paramLayoutParams)
    {
      super();
    }
  }
  
  public static class ScrollingViewBehavior
    extends HeaderScrollingViewBehavior
  {
    public ScrollingViewBehavior() {}
    
    public ScrollingViewBehavior(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.i.cj);
      this.hV = paramContext.getDimensionPixelSize(a.i.ck, 0);
      paramContext.recycle();
    }
    
    public final boolean b(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
    {
      paramCoordinatorLayout = ((CoordinatorLayout.d)paramView2.getLayoutParams()).gJ;
      if ((paramCoordinatorLayout instanceof AppBarLayout.Behavior))
      {
        paramCoordinatorLayout = (AppBarLayout.Behavior)paramCoordinatorLayout;
        int i = paramView2.getBottom();
        int j = paramView1.getTop();
        z.j(paramView1, paramCoordinatorLayout.dV + (i - j) + this.hU - o(paramView2));
      }
      return false;
    }
    
    final View c(List<View> paramList)
    {
      int j = paramList.size();
      int i = 0;
      while (i < j)
      {
        View localView = (View)paramList.get(i);
        if ((localView instanceof AppBarLayout)) {
          return localView;
        }
        i += 1;
      }
      return null;
    }
    
    public final boolean e(View paramView)
    {
      return paramView instanceof AppBarLayout;
    }
    
    final float f(View paramView)
    {
      if ((paramView instanceof AppBarLayout))
      {
        paramView = (AppBarLayout)paramView;
        int j = paramView.F();
        int k = AppBarLayout.b(paramView);
        paramView = ((CoordinatorLayout.d)paramView.getLayoutParams()).gJ;
        if ((paramView instanceof AppBarLayout.Behavior)) {}
        for (int i = ((AppBarLayout.Behavior)paramView).H(); (k != 0) && (j + i <= k); i = 0) {
          return 0.0F;
        }
        j -= k;
        if (j != 0) {
          return i / j + 1.0F;
        }
      }
      return 0.0F;
    }
    
    final int g(View paramView)
    {
      if ((paramView instanceof AppBarLayout)) {
        return ((AppBarLayout)paramView).F();
      }
      return super.g(paramView);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(AppBarLayout paramAppBarLayout, int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\AppBarLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */