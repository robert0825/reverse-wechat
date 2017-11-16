package android.support.v7.widget;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.ai;
import android.support.v4.view.am;
import android.support.v4.view.an;
import android.support.v4.view.r;
import android.support.v4.view.s;
import android.support.v4.view.z;
import android.support.v4.widget.q;
import android.support.v7.a.a.a;
import android.support.v7.a.a.f;
import android.support.v7.view.menu.l.a;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window.Callback;

public class ActionBarOverlayLayout
  extends ViewGroup
  implements r, t
{
  static final int[] xg = { a.a.actionBarSize, 16842841 };
  private final s Cy;
  private u GX;
  private boolean HM;
  private int LQ;
  public int LR = 0;
  private ContentFrameLayout LS;
  private ActionBarContainer LT;
  private Drawable LU;
  private boolean LV;
  public boolean LW;
  public boolean LX;
  private boolean LY;
  private int LZ;
  public int Ma;
  private final Rect Mb = new Rect();
  private final Rect Mc = new Rect();
  private final Rect Md = new Rect();
  private final Rect Me = new Rect();
  private final Rect Mf = new Rect();
  private final Rect Mg = new Rect();
  public a Mh;
  private final int Mi = 600;
  private q Mj;
  private ai Mk;
  private final am Ml = new an()
  {
    public final void as(View paramAnonymousView)
    {
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this, null);
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this);
    }
    
    public final void q(View paramAnonymousView)
    {
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this, null);
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this);
    }
  };
  private final Runnable Mm = new Runnable()
  {
    public final void run()
    {
      ActionBarOverlayLayout.b(ActionBarOverlayLayout.this);
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this, z.V(ActionBarOverlayLayout.d(ActionBarOverlayLayout.this)).r(0.0F).a(ActionBarOverlayLayout.c(ActionBarOverlayLayout.this)));
    }
  };
  private final Runnable Mn = new Runnable()
  {
    public final void run()
    {
      ActionBarOverlayLayout.b(ActionBarOverlayLayout.this);
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this, z.V(ActionBarOverlayLayout.d(ActionBarOverlayLayout.this)).r(-ActionBarOverlayLayout.d(ActionBarOverlayLayout.this).getHeight()).a(ActionBarOverlayLayout.c(ActionBarOverlayLayout.this)));
    }
  };
  
  public ActionBarOverlayLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
    this.Cy = new s(this);
  }
  
  private static boolean a(View paramView, Rect paramRect, boolean paramBoolean)
  {
    boolean bool = false;
    paramView = (LayoutParams)paramView.getLayoutParams();
    if (paramView.leftMargin != paramRect.left)
    {
      paramView.leftMargin = paramRect.left;
      bool = true;
    }
    if (paramView.topMargin != paramRect.top)
    {
      paramView.topMargin = paramRect.top;
      bool = true;
    }
    if (paramView.rightMargin != paramRect.right)
    {
      paramView.rightMargin = paramRect.right;
      bool = true;
    }
    if ((paramBoolean) && (paramView.bottomMargin != paramRect.bottom))
    {
      paramView.bottomMargin = paramRect.bottom;
      return true;
    }
    return bool;
  }
  
  private void az(int paramInt)
  {
    dR();
    paramInt = Math.max(0, Math.min(paramInt, this.LT.getHeight()));
    z.c(this.LT, -paramInt);
  }
  
  public static void dO() {}
  
  private void dP()
  {
    if (this.LS == null)
    {
      this.LS = ((ContentFrameLayout)findViewById(a.f.action_bar_activity_content));
      this.LT = ((ActionBarContainer)findViewById(a.f.action_bar_container));
      localObject = findViewById(a.f.action_bar);
      if (!(localObject instanceof u)) {
        break label61;
      }
    }
    for (Object localObject = (u)localObject;; localObject = ((Toolbar)localObject).gX())
    {
      this.GX = ((u)localObject);
      return;
      label61:
      if (!(localObject instanceof Toolbar)) {
        break;
      }
    }
    throw new IllegalStateException("Can't make a decor toolbar out of " + localObject.getClass().getSimpleName());
  }
  
  private void dR()
  {
    removeCallbacks(this.Mm);
    removeCallbacks(this.Mn);
    if (this.Mk != null) {
      this.Mk.cancel();
    }
  }
  
  private void init(Context paramContext)
  {
    boolean bool2 = true;
    TypedArray localTypedArray = getContext().getTheme().obtainStyledAttributes(xg);
    this.LQ = localTypedArray.getDimensionPixelSize(0, 0);
    this.LU = localTypedArray.getDrawable(1);
    if (this.LU == null)
    {
      bool1 = true;
      setWillNotDraw(bool1);
      localTypedArray.recycle();
      if (paramContext.getApplicationInfo().targetSdkVersion >= 19) {
        break label91;
      }
    }
    label91:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.LV = bool1;
      this.Mj = q.a(paramContext, null);
      return;
      bool1 = false;
      break;
    }
  }
  
  public final void a(Menu paramMenu, l.a parama)
  {
    dP();
    this.GX.a(paramMenu, parama);
  }
  
  public final void aA(int paramInt)
  {
    boolean bool = true;
    dP();
    switch (paramInt)
    {
    case 2: 
    case 5: 
    default: 
      return;
    }
    this.LW = true;
    if (getContext().getApplicationInfo().targetSdkVersion < 19) {}
    for (;;)
    {
      this.LV = bool;
      return;
      bool = false;
    }
  }
  
  public final void b(Window.Callback paramCallback)
  {
    dP();
    this.GX.b(paramCallback);
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof LayoutParams;
  }
  
  public final int dQ()
  {
    if (this.LT != null) {
      return -(int)z.S(this.LT);
    }
    return 0;
  }
  
  public final boolean dS()
  {
    dP();
    return this.GX.dS();
  }
  
  public final boolean dT()
  {
    dP();
    return this.GX.dT();
  }
  
  public final void dU()
  {
    dP();
    this.GX.dU();
  }
  
  public final void dV()
  {
    dP();
    this.GX.dismissPopupMenus();
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if ((this.LU != null) && (!this.LV)) {
      if (this.LT.getVisibility() != 0) {
        break label82;
      }
    }
    label82:
    for (int i = (int)(this.LT.getBottom() + z.S(this.LT) + 0.5F);; i = 0)
    {
      this.LU.setBounds(0, i, getWidth(), this.LU.getIntrinsicHeight() + i);
      this.LU.draw(paramCanvas);
      return;
    }
  }
  
  public final void e(CharSequence paramCharSequence)
  {
    dP();
    this.GX.e(paramCharSequence);
  }
  
  protected boolean fitSystemWindows(Rect paramRect)
  {
    dP();
    z.Y(this);
    boolean bool = a(this.LT, paramRect, false);
    this.Me.set(paramRect);
    at.a(this, this.Me, this.Mb);
    if (!this.Mc.equals(this.Mb))
    {
      this.Mc.set(this.Mb);
      bool = true;
    }
    if (bool) {
      requestLayout();
    }
    return true;
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new LayoutParams(paramLayoutParams);
  }
  
  public int getNestedScrollAxes()
  {
    return this.Cy.wD;
  }
  
  public final boolean hideOverflowMenu()
  {
    dP();
    return this.GX.hideOverflowMenu();
  }
  
  public final boolean isOverflowMenuShowing()
  {
    dP();
    return this.GX.isOverflowMenuShowing();
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8) {
      super.onConfigurationChanged(paramConfiguration);
    }
    init(getContext());
    z.Z(this);
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    dR();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt2 = getChildCount();
    paramInt3 = getPaddingLeft();
    getPaddingRight();
    paramInt4 = getPaddingTop();
    getPaddingBottom();
    paramInt1 = 0;
    while (paramInt1 < paramInt2)
    {
      View localView = getChildAt(paramInt1);
      if (localView.getVisibility() != 8)
      {
        LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
        int i = localView.getMeasuredWidth();
        int j = localView.getMeasuredHeight();
        int k = localLayoutParams.leftMargin + paramInt3;
        int m = localLayoutParams.topMargin + paramInt4;
        localView.layout(k, m, i + k, j + m);
      }
      paramInt1 += 1;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    dP();
    measureChildWithMargins(this.LT, paramInt1, 0, paramInt2, 0);
    Object localObject = (LayoutParams)this.LT.getLayoutParams();
    int i1 = Math.max(0, this.LT.getMeasuredWidth() + ((LayoutParams)localObject).leftMargin + ((LayoutParams)localObject).rightMargin);
    int i = this.LT.getMeasuredHeight();
    int j = ((LayoutParams)localObject).topMargin;
    int n = Math.max(0, ((LayoutParams)localObject).bottomMargin + (i + j));
    int m = at.combineMeasuredStates(0, z.N(this.LT));
    int k;
    if ((z.Y(this) & 0x100) != 0)
    {
      j = 1;
      if (j == 0) {
        break label444;
      }
      k = this.LQ;
      i = k;
      if (this.LX)
      {
        i = k;
        if (this.LT.LA != null) {
          i = k + this.LQ;
        }
      }
    }
    for (;;)
    {
      label153:
      this.Md.set(this.Mb);
      this.Mf.set(this.Me);
      if ((!this.LW) && (j == 0))
      {
        localObject = this.Md;
        ((Rect)localObject).top = (i + ((Rect)localObject).top);
        localObject = this.Md;
      }
      for (((Rect)localObject).bottom += 0;; ((Rect)localObject).bottom += 0)
      {
        a(this.LS, this.Md, true);
        if (!this.Mg.equals(this.Mf))
        {
          this.Mg.set(this.Mf);
          this.LS.e(this.Mf);
        }
        measureChildWithMargins(this.LS, paramInt1, 0, paramInt2, 0);
        localObject = (LayoutParams)this.LS.getLayoutParams();
        i = Math.max(i1, this.LS.getMeasuredWidth() + ((LayoutParams)localObject).leftMargin + ((LayoutParams)localObject).rightMargin);
        j = this.LS.getMeasuredHeight();
        k = ((LayoutParams)localObject).topMargin;
        j = Math.max(n, ((LayoutParams)localObject).bottomMargin + (j + k));
        k = at.combineMeasuredStates(m, z.N(this.LS));
        m = getPaddingLeft();
        n = getPaddingRight();
        j = Math.max(j + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight());
        setMeasuredDimension(z.resolveSizeAndState(Math.max(i + (m + n), getSuggestedMinimumWidth()), paramInt1, k), z.resolveSizeAndState(j, paramInt2, k << 16));
        return;
        j = 0;
        break;
        label444:
        if (this.LT.getVisibility() == 8) {
          break label506;
        }
        i = this.LT.getMeasuredHeight();
        break label153;
        localObject = this.Mf;
        ((Rect)localObject).top = (i + ((Rect)localObject).top);
        localObject = this.Mf;
      }
      label506:
      i = 0;
    }
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    int i = 0;
    if ((!this.HM) || (!paramBoolean)) {
      return false;
    }
    this.Mj.a(0, 0, (int)paramFloat2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
    if (this.Mj.getFinalY() > this.LT.getHeight()) {
      i = 1;
    }
    if (i != 0)
    {
      dR();
      this.Mn.run();
    }
    for (;;)
    {
      this.LY = true;
      return true;
      dR();
      this.Mm.run();
    }
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt) {}
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.LZ += paramInt2;
    az(this.LZ);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    this.Cy.wD = paramInt;
    this.LZ = dQ();
    dR();
    if (this.Mh != null) {
      this.Mh.db();
    }
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    if (((paramInt & 0x2) == 0) || (this.LT.getVisibility() != 0)) {
      return false;
    }
    return this.HM;
  }
  
  public void onStopNestedScroll(View paramView)
  {
    if ((this.HM) && (!this.LY))
    {
      if (this.LZ <= this.LT.getHeight())
      {
        dR();
        postDelayed(this.Mm, 600L);
      }
    }
    else {
      return;
    }
    dR();
    postDelayed(this.Mn, 600L);
  }
  
  public void onWindowSystemUiVisibilityChanged(int paramInt)
  {
    boolean bool = true;
    if (Build.VERSION.SDK_INT >= 16) {
      super.onWindowSystemUiVisibilityChanged(paramInt);
    }
    dP();
    int k = this.Ma;
    this.Ma = paramInt;
    int i;
    int j;
    if ((paramInt & 0x4) == 0)
    {
      i = 1;
      if ((paramInt & 0x100) == 0) {
        break label120;
      }
      j = 1;
      label49:
      if (this.Mh != null)
      {
        a locala = this.Mh;
        if (j != 0) {
          break label125;
        }
        label66:
        locala.A(bool);
        if ((i == 0) && (j != 0)) {
          break label131;
        }
        this.Mh.cZ();
      }
    }
    for (;;)
    {
      if ((((k ^ paramInt) & 0x100) != 0) && (this.Mh != null)) {
        z.Z(this);
      }
      return;
      i = 0;
      break;
      label120:
      j = 0;
      break label49;
      label125:
      bool = false;
      break label66;
      label131:
      this.Mh.da();
    }
  }
  
  protected void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
    this.LR = paramInt;
    if (this.Mh != null) {
      this.Mh.onWindowVisibilityChanged(paramInt);
    }
  }
  
  public final void setHideOnContentScrollEnabled(boolean paramBoolean)
  {
    if (paramBoolean != this.HM)
    {
      this.HM = paramBoolean;
      if (!paramBoolean)
      {
        dR();
        az(0);
      }
    }
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
  
  public final boolean showOverflowMenu()
  {
    dP();
    return this.GX.showOverflowMenu();
  }
  
  public static class LayoutParams
    extends ViewGroup.MarginLayoutParams
  {
    public LayoutParams()
    {
      super(-1);
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
  }
  
  public static abstract interface a
  {
    public abstract void A(boolean paramBoolean);
    
    public abstract void cZ();
    
    public abstract void da();
    
    public abstract void db();
    
    public abstract void onWindowVisibilityChanged(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\ActionBarOverlayLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */