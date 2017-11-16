package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.m;
import android.support.v4.view.o;
import android.support.v4.view.z;
import android.support.v7.a.a.a;
import android.support.v7.a.a.k;
import android.support.v7.app.ActionBar.LayoutParams;
import android.support.v7.view.c;
import android.support.v7.view.menu.f.a;
import android.support.v7.view.menu.l.a;
import android.support.v7.view.menu.p;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class Toolbar
  extends ViewGroup
{
  private Context Lo;
  ActionMenuView Lp;
  private boolean Lt;
  private boolean Lu;
  private int MQ;
  l.a MS;
  f.a MT;
  private final h Oc;
  private CharSequence YA;
  private ImageButton YB;
  View YC;
  int YD;
  int YE;
  private int YF;
  private int YG;
  private int YH;
  private int YI;
  private int YJ;
  private int YK;
  final ag YL = new ag();
  public CharSequence YM;
  CharSequence YN;
  private int YO;
  private int YP;
  private final ArrayList<View> YQ = new ArrayList();
  final ArrayList<View> YR = new ArrayList();
  private final int[] YS = new int[2];
  private b YT;
  private final ActionMenuView.d YU = new ActionMenuView.d()
  {
    public final boolean ed()
    {
      if (Toolbar.a(Toolbar.this) != null) {
        return Toolbar.a(Toolbar.this).ed();
      }
      return false;
    }
  };
  private aq YV;
  private ActionMenuPresenter YW;
  a YX;
  boolean YY;
  private final Runnable YZ = new Runnable()
  {
    public final void run()
    {
      Toolbar.this.showOverflowMenu();
    }
  };
  TextView Yv;
  TextView Yw;
  ImageButton Yx;
  private ImageView Yy;
  private Drawable Yz;
  private int tl = 8388627;
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.toolbarStyle);
  }
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = ap.a(getContext(), paramAttributeSet, a.k.Toolbar, paramInt);
    this.YD = paramContext.getResourceId(a.k.Toolbar_titleTextAppearance, 0);
    this.YE = paramContext.getResourceId(a.k.Toolbar_subtitleTextAppearance, 0);
    paramInt = a.k.Toolbar_android_gravity;
    int i = this.tl;
    this.tl = paramContext.Yu.getInteger(paramInt, i);
    this.YF = 48;
    paramInt = paramContext.getDimensionPixelOffset(a.k.Toolbar_titleMargins, 0);
    this.YK = paramInt;
    this.YJ = paramInt;
    this.YI = paramInt;
    this.YH = paramInt;
    paramInt = paramContext.getDimensionPixelOffset(a.k.Toolbar_titleMarginStart, -1);
    if (paramInt >= 0) {
      this.YH = paramInt;
    }
    paramInt = paramContext.getDimensionPixelOffset(a.k.Toolbar_titleMarginEnd, -1);
    if (paramInt >= 0) {
      this.YI = paramInt;
    }
    paramInt = paramContext.getDimensionPixelOffset(a.k.Toolbar_titleMarginTop, -1);
    if (paramInt >= 0) {
      this.YJ = paramInt;
    }
    paramInt = paramContext.getDimensionPixelOffset(a.k.Toolbar_titleMarginBottom, -1);
    if (paramInt >= 0) {
      this.YK = paramInt;
    }
    this.YG = paramContext.getDimensionPixelSize(a.k.Toolbar_maxButtonHeight, -1);
    paramInt = paramContext.getDimensionPixelOffset(a.k.Toolbar_contentInsetStart, Integer.MIN_VALUE);
    i = paramContext.getDimensionPixelOffset(a.k.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
    int j = paramContext.getDimensionPixelSize(a.k.Toolbar_contentInsetLeft, 0);
    int k = paramContext.getDimensionPixelSize(a.k.Toolbar_contentInsetRight, 0);
    paramAttributeSet = this.YL;
    paramAttributeSet.Vz = false;
    if (j != Integer.MIN_VALUE)
    {
      paramAttributeSet.Vx = j;
      paramAttributeSet.Vu = j;
    }
    if (k != Integer.MIN_VALUE)
    {
      paramAttributeSet.Vy = k;
      paramAttributeSet.Vv = k;
    }
    if ((paramInt != Integer.MIN_VALUE) || (i != Integer.MIN_VALUE)) {
      this.YL.ac(paramInt, i);
    }
    this.Yz = paramContext.getDrawable(a.k.Toolbar_collapseIcon);
    this.YA = paramContext.getText(a.k.Toolbar_collapseContentDescription);
    paramAttributeSet = paramContext.getText(a.k.Toolbar_title);
    if (!TextUtils.isEmpty(paramAttributeSet)) {
      setTitle(paramAttributeSet);
    }
    paramAttributeSet = paramContext.getText(a.k.Toolbar_subtitle);
    if (!TextUtils.isEmpty(paramAttributeSet)) {
      setSubtitle(paramAttributeSet);
    }
    this.Lo = getContext();
    setPopupTheme(paramContext.getResourceId(a.k.Toolbar_popupTheme, 0));
    paramAttributeSet = paramContext.getDrawable(a.k.Toolbar_navigationIcon);
    if (paramAttributeSet != null) {
      setNavigationIcon(paramAttributeSet);
    }
    paramAttributeSet = paramContext.getText(a.k.Toolbar_navigationContentDescription);
    if (!TextUtils.isEmpty(paramAttributeSet)) {
      setNavigationContentDescription(paramAttributeSet);
    }
    paramAttributeSet = paramContext.getDrawable(a.k.Toolbar_logo);
    if (paramAttributeSet != null) {
      setLogo(paramAttributeSet);
    }
    paramAttributeSet = paramContext.getText(a.k.Toolbar_logoDescription);
    if (!TextUtils.isEmpty(paramAttributeSet))
    {
      if (!TextUtils.isEmpty(paramAttributeSet)) {
        gT();
      }
      if (this.Yy != null) {
        this.Yy.setContentDescription(paramAttributeSet);
      }
    }
    if (paramContext.hasValue(a.k.Toolbar_titleTextColor))
    {
      paramInt = paramContext.bH(a.k.Toolbar_titleTextColor);
      this.YO = paramInt;
      if (this.Yv != null) {
        this.Yv.setTextColor(paramInt);
      }
    }
    if (paramContext.hasValue(a.k.Toolbar_subtitleTextColor))
    {
      paramInt = paramContext.bH(a.k.Toolbar_subtitleTextColor);
      this.YP = paramInt;
      if (this.Yw != null) {
        this.Yw.setTextColor(paramInt);
      }
    }
    paramContext.Yu.recycle();
    this.Oc = h.ex();
  }
  
  private int a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = localMarginLayoutParams.leftMargin - paramArrayOfInt[0];
    int j = localMarginLayoutParams.rightMargin - paramArrayOfInt[1];
    int k = Math.max(0, i) + Math.max(0, j);
    paramArrayOfInt[0] = Math.max(0, -i);
    paramArrayOfInt[1] = Math.max(0, -j);
    paramView.measure(getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + k + paramInt2, localMarginLayoutParams.width), getChildMeasureSpec(paramInt3, getPaddingTop() + getPaddingBottom() + localMarginLayoutParams.topMargin + localMarginLayoutParams.bottomMargin + paramInt4, localMarginLayoutParams.height));
    return paramView.getMeasuredWidth() + k;
  }
  
  private int a(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = localLayoutParams.leftMargin - paramArrayOfInt[0];
    paramInt1 = Math.max(0, i) + paramInt1;
    paramArrayOfInt[0] = Math.max(0, -i);
    paramInt2 = p(paramView, paramInt2);
    i = paramView.getMeasuredWidth();
    paramView.layout(paramInt1, paramInt2, paramInt1 + i, paramView.getMeasuredHeight() + paramInt2);
    return localLayoutParams.rightMargin + i + paramInt1;
  }
  
  private void a(List<View> paramList, int paramInt)
  {
    int i = 1;
    int j = 0;
    if (z.J(this) == 1) {}
    int m;
    int k;
    View localView;
    LayoutParams localLayoutParams;
    for (;;)
    {
      m = getChildCount();
      k = android.support.v4.view.f.getAbsoluteGravity(paramInt, z.J(this));
      paramList.clear();
      paramInt = j;
      if (i == 0) {
        break;
      }
      paramInt = m - 1;
      while (paramInt >= 0)
      {
        localView = getChildAt(paramInt);
        localLayoutParams = (LayoutParams)localView.getLayoutParams();
        if ((localLayoutParams.Zc == 0) && (bs(localView)) && (bI(localLayoutParams.gravity) == k)) {
          paramList.add(localView);
        }
        paramInt -= 1;
      }
      i = 0;
    }
    while (paramInt < m)
    {
      localView = getChildAt(paramInt);
      localLayoutParams = (LayoutParams)localView.getLayoutParams();
      if ((localLayoutParams.Zc == 0) && (bs(localView)) && (bI(localLayoutParams.gravity) == k)) {
        paramList.add(localView);
      }
      paramInt += 1;
    }
  }
  
  private int b(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = localLayoutParams.rightMargin - paramArrayOfInt[1];
    paramInt1 -= Math.max(0, i);
    paramArrayOfInt[1] = Math.max(0, -i);
    paramInt2 = p(paramView, paramInt2);
    i = paramView.getMeasuredWidth();
    paramView.layout(paramInt1 - i, paramInt2, paramInt1, paramView.getMeasuredHeight() + paramInt2);
    return paramInt1 - (localLayoutParams.leftMargin + i);
  }
  
  private int bI(int paramInt)
  {
    int j = z.J(this);
    int i = android.support.v4.view.f.getAbsoluteGravity(paramInt, j) & 0x7;
    paramInt = i;
    switch (i)
    {
    case 2: 
    case 4: 
    default: 
      if (j == 1) {
        paramInt = 5;
      }
      break;
    case 1: 
    case 3: 
    case 5: 
      return paramInt;
    }
    return 3;
  }
  
  private boolean bs(View paramView)
  {
    return (paramView != null) && (paramView.getParent() == this) && (paramView.getVisibility() != 8);
  }
  
  private static int bt(View paramView)
  {
    paramView = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = android.support.v4.view.l.a(paramView);
    return android.support.v4.view.l.b(paramView) + i;
  }
  
  private static int bu(View paramView)
  {
    paramView = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = paramView.topMargin;
    return paramView.bottomMargin + i;
  }
  
  private boolean bv(View paramView)
  {
    return (paramView.getParent() == this) || (this.YR.contains(paramView));
  }
  
  private void e(View paramView, boolean paramBoolean)
  {
    Object localObject = paramView.getLayoutParams();
    if (localObject == null) {
      localObject = new LayoutParams();
    }
    for (;;)
    {
      ((LayoutParams)localObject).Zc = 1;
      if ((!paramBoolean) || (this.YC == null)) {
        break;
      }
      paramView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.YR.add(paramView);
      return;
      if (!checkLayoutParams((ViewGroup.LayoutParams)localObject)) {
        localObject = f((ViewGroup.LayoutParams)localObject);
      } else {
        localObject = (LayoutParams)localObject;
      }
    }
    addView(paramView, (ViewGroup.LayoutParams)localObject);
  }
  
  private static LayoutParams f(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof LayoutParams)) {
      return new LayoutParams((LayoutParams)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ActionBar.LayoutParams)) {
      return new LayoutParams((ActionBar.LayoutParams)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new LayoutParams(paramLayoutParams);
  }
  
  private void gT()
  {
    if (this.Yy == null) {
      this.Yy = new ImageView(getContext());
    }
  }
  
  private void gU()
  {
    if (this.Lp == null)
    {
      this.Lp = new ActionMenuView(getContext());
      this.Lp.setPopupTheme(this.MQ);
      this.Lp.MX = this.YU;
      this.Lp.a(this.MS, this.MT);
      LayoutParams localLayoutParams = new LayoutParams();
      localLayoutParams.gravity = (0x800005 | this.YF & 0x70);
      this.Lp.setLayoutParams(localLayoutParams);
      e(this.Lp, false);
    }
  }
  
  private void gV()
  {
    if (this.Yx == null)
    {
      this.Yx = new ImageButton(getContext(), null, a.a.toolbarNavigationButtonStyle);
      LayoutParams localLayoutParams = new LayoutParams();
      localLayoutParams.gravity = (0x800003 | this.YF & 0x70);
      this.Yx.setLayoutParams(localLayoutParams);
    }
  }
  
  protected static LayoutParams gW()
  {
    return new LayoutParams();
  }
  
  private void i(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + localMarginLayoutParams.leftMargin + localMarginLayoutParams.rightMargin + paramInt2, localMarginLayoutParams.width);
    paramInt2 = getChildMeasureSpec(paramInt3, getPaddingTop() + getPaddingBottom() + localMarginLayoutParams.topMargin + localMarginLayoutParams.bottomMargin + 0, localMarginLayoutParams.height);
    paramInt3 = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = paramInt2;
    if (paramInt3 != 1073741824)
    {
      paramInt1 = paramInt2;
      if (paramInt4 >= 0)
      {
        paramInt1 = paramInt4;
        if (paramInt3 != 0) {
          paramInt1 = Math.min(View.MeasureSpec.getSize(paramInt2), paramInt4);
        }
        paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
      }
    }
    paramView.measure(i, paramInt1);
  }
  
  private int p(View paramView, int paramInt)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    int k = paramView.getMeasuredHeight();
    int j;
    int i;
    int m;
    if (paramInt > 0)
    {
      paramInt = (k - paramInt) / 2;
      j = localLayoutParams.gravity & 0x70;
      i = j;
      switch (j)
      {
      default: 
        i = this.tl & 0x70;
      }
      switch (i)
      {
      default: 
        i = getPaddingTop();
        j = getPaddingBottom();
        m = getHeight();
        paramInt = (m - i - j - k) / 2;
        if (paramInt < localLayoutParams.topMargin) {
          paramInt = localLayoutParams.topMargin;
        }
        break;
      }
    }
    for (;;)
    {
      return paramInt + i;
      paramInt = 0;
      break;
      return getPaddingTop() - paramInt;
      return getHeight() - getPaddingBottom() - k - localLayoutParams.bottomMargin - paramInt;
      j = m - j - k - paramInt - i;
      if (j < localLayoutParams.bottomMargin) {
        paramInt = Math.max(0, paramInt - (localLayoutParams.bottomMargin - j));
      }
    }
  }
  
  public final void a(android.support.v7.view.menu.f paramf, ActionMenuPresenter paramActionMenuPresenter)
  {
    if ((paramf == null) && (this.Lp == null)) {}
    android.support.v7.view.menu.f localf;
    do
    {
      return;
      gU();
      localf = this.Lp.dn;
    } while (localf == paramf);
    if (localf != null)
    {
      localf.b(this.YW);
      localf.b(this.YX);
    }
    if (this.YX == null) {
      this.YX = new a();
    }
    paramActionMenuPresenter.MA = true;
    if (paramf != null)
    {
      paramf.a(paramActionMenuPresenter, this.Lo);
      paramf.a(this.YX, this.Lo);
    }
    for (;;)
    {
      this.Lp.setPopupTheme(this.MQ);
      this.Lp.a(paramActionMenuPresenter);
      this.YW = paramActionMenuPresenter;
      return;
      paramActionMenuPresenter.a(this.Lo, null);
      this.YX.a(this.Lo, null);
      paramActionMenuPresenter.f(true);
      this.YX.f(true);
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return (super.checkLayoutParams(paramLayoutParams)) && ((paramLayoutParams instanceof LayoutParams));
  }
  
  public final void collapseActionView()
  {
    if (this.YX == null) {}
    for (android.support.v7.view.menu.h localh = null;; localh = this.YX.Zb)
    {
      if (localh != null) {
        localh.collapseActionView();
      }
      return;
    }
  }
  
  public final u gX()
  {
    if (this.YV == null) {
      this.YV = new aq(this);
    }
    return this.YV;
  }
  
  public final Menu getMenu()
  {
    gU();
    if (this.Lp.dn == null)
    {
      android.support.v7.view.menu.f localf = (android.support.v7.view.menu.f)this.Lp.getMenu();
      if (this.YX == null) {
        this.YX = new a();
      }
      this.Lp.MR.MA = true;
      localf.a(this.YX, this.Lo);
    }
    return this.Lp.getMenu();
  }
  
  public final CharSequence getNavigationContentDescription()
  {
    if (this.Yx != null) {
      return this.Yx.getContentDescription();
    }
    return null;
  }
  
  public final boolean isOverflowMenuShowing()
  {
    if (this.Lp != null)
    {
      ActionMenuView localActionMenuView = this.Lp;
      if ((localActionMenuView.MR != null) && (localActionMenuView.MR.isOverflowMenuShowing())) {}
      for (int i = 1; i != 0; i = 0) {
        return true;
      }
    }
    return false;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    removeCallbacks(this.YZ);
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i = o.d(paramMotionEvent);
    if (i == 9) {
      this.Lu = false;
    }
    if (!this.Lu)
    {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if ((i == 9) && (!bool)) {
        this.Lu = true;
      }
    }
    if ((i == 10) || (i == 3)) {
      this.Lu = false;
    }
    return true;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int k;
    int i1;
    int i4;
    int i;
    int i2;
    int i3;
    int i5;
    int[] arrayOfInt;
    int n;
    if (z.J(this) == 1)
    {
      k = 1;
      i1 = getWidth();
      i4 = getHeight();
      i = getPaddingLeft();
      i2 = getPaddingRight();
      i3 = getPaddingTop();
      i5 = getPaddingBottom();
      paramInt4 = i1 - i2;
      arrayOfInt = this.YS;
      arrayOfInt[1] = 0;
      arrayOfInt[0] = 0;
      n = z.U(this);
      if (!bs(this.Yx)) {
        break label1721;
      }
      if (k == 0) {
        break label888;
      }
      paramInt4 = b(this.Yx, paramInt4, arrayOfInt, n);
      paramInt1 = i;
    }
    for (;;)
    {
      label111:
      paramInt2 = paramInt4;
      paramInt3 = paramInt1;
      if (bs(this.YB))
      {
        if (k != 0)
        {
          paramInt2 = b(this.YB, paramInt4, arrayOfInt, n);
          paramInt3 = paramInt1;
        }
      }
      else
      {
        label151:
        paramInt1 = paramInt2;
        paramInt4 = paramInt3;
        if (bs(this.Lp))
        {
          if (k == 0) {
            break label927;
          }
          paramInt4 = a(this.Lp, paramInt3, arrayOfInt, n);
          paramInt1 = paramInt2;
        }
        label191:
        arrayOfInt[0] = Math.max(0, this.YL.Vu - paramInt4);
        arrayOfInt[1] = Math.max(0, this.YL.Vv - (i1 - i2 - paramInt1));
        paramInt3 = Math.max(paramInt4, this.YL.Vu);
        paramInt4 = Math.min(paramInt1, i1 - i2 - this.YL.Vv);
        paramInt2 = paramInt4;
        paramInt1 = paramInt3;
        if (bs(this.YC))
        {
          if (k == 0) {
            break label948;
          }
          paramInt2 = b(this.YC, paramInt4, arrayOfInt, n);
          paramInt1 = paramInt3;
        }
        label305:
        if (!bs(this.Yy)) {
          break label1715;
        }
        if (k == 0) {
          break label969;
        }
        paramInt2 = b(this.Yy, paramInt2, arrayOfInt, n);
        paramInt3 = paramInt1;
      }
      for (;;)
      {
        label338:
        paramBoolean = bs(this.Yv);
        boolean bool = bs(this.Yw);
        paramInt1 = 0;
        Object localObject1;
        if (paramBoolean)
        {
          localObject1 = (LayoutParams)this.Yv.getLayoutParams();
          paramInt1 = ((LayoutParams)localObject1).topMargin;
          paramInt4 = this.Yv.getMeasuredHeight();
          paramInt1 = ((LayoutParams)localObject1).bottomMargin + (paramInt1 + paramInt4) + 0;
        }
        int j;
        if (bool)
        {
          localObject1 = (LayoutParams)this.Yw.getLayoutParams();
          paramInt4 = ((LayoutParams)localObject1).topMargin;
          j = this.Yw.getMeasuredHeight();
        }
        for (int m = ((LayoutParams)localObject1).bottomMargin + (paramInt4 + j) + paramInt1;; m = paramInt1)
        {
          label476:
          Object localObject2;
          if (!paramBoolean)
          {
            paramInt4 = paramInt2;
            paramInt1 = paramInt3;
            if (!bool) {}
          }
          else
          {
            if (!paramBoolean) {
              break label987;
            }
            localObject1 = this.Yv;
            if (!bool) {
              break label996;
            }
            localObject2 = this.Yw;
            label487:
            localObject1 = (LayoutParams)((View)localObject1).getLayoutParams();
            localObject2 = (LayoutParams)((View)localObject2).getLayoutParams();
            if (((!paramBoolean) || (this.Yv.getMeasuredWidth() <= 0)) && ((!bool) || (this.Yw.getMeasuredWidth() <= 0))) {
              break label1005;
            }
            j = 1;
            label539:
            switch (this.tl & 0x70)
            {
            default: 
              paramInt1 = (i4 - i3 - i5 - m) / 2;
              if (paramInt1 < ((LayoutParams)localObject1).topMargin + this.YJ) {
                paramInt1 = ((LayoutParams)localObject1).topMargin + this.YJ;
              }
              break;
            }
          }
          label611:
          label616:
          label632:
          label888:
          label927:
          label948:
          label969:
          label987:
          label996:
          label1005:
          label1125:
          label1683:
          label1700:
          label1706:
          for (;;)
          {
            paramInt1 = i3 + paramInt1;
            if (k != 0) {
              if (j != 0)
              {
                paramInt4 = this.YH;
                paramInt4 -= arrayOfInt[1];
                paramInt2 -= Math.max(0, paramInt4);
                arrayOfInt[1] = Math.max(0, -paramInt4);
                if (!paramBoolean) {
                  break label1700;
                }
                localObject1 = (LayoutParams)this.Yv.getLayoutParams();
                paramInt4 = paramInt2 - this.Yv.getMeasuredWidth();
                k = this.Yv.getMeasuredHeight() + paramInt1;
                this.Yv.layout(paramInt4, paramInt1, paramInt2, k);
                m = this.YI;
                paramInt1 = k + ((LayoutParams)localObject1).bottomMargin;
                paramInt4 -= m;
              }
            }
            for (;;)
            {
              if (bool)
              {
                localObject1 = (LayoutParams)this.Yw.getLayoutParams();
                paramInt1 = ((LayoutParams)localObject1).topMargin + paramInt1;
                k = this.Yw.getMeasuredWidth();
                m = this.Yw.getMeasuredHeight();
                this.Yw.layout(paramInt2 - k, paramInt1, paramInt2, m + paramInt1);
                paramInt1 = this.YI;
                k = ((LayoutParams)localObject1).bottomMargin;
              }
              for (paramInt1 = paramInt2 - paramInt1;; paramInt1 = paramInt2)
              {
                if (j != 0) {}
                for (paramInt1 = Math.min(paramInt4, paramInt1);; paramInt1 = paramInt2)
                {
                  paramInt4 = paramInt1;
                  paramInt1 = paramInt3;
                  a(this.YQ, 3);
                  paramInt3 = this.YQ.size();
                  paramInt2 = 0;
                  for (;;)
                  {
                    if (paramInt2 < paramInt3)
                    {
                      paramInt1 = a((View)this.YQ.get(paramInt2), paramInt1, arrayOfInt, n);
                      paramInt2 += 1;
                      continue;
                      k = 0;
                      break;
                      paramInt1 = a(this.Yx, i, arrayOfInt, n);
                      break label111;
                      paramInt3 = a(this.YB, paramInt1, arrayOfInt, n);
                      paramInt2 = paramInt4;
                      break label151;
                      paramInt1 = b(this.Lp, paramInt2, arrayOfInt, n);
                      paramInt4 = paramInt3;
                      break label191;
                      paramInt1 = a(this.YC, paramInt3, arrayOfInt, n);
                      paramInt2 = paramInt4;
                      break label305;
                      paramInt3 = a(this.Yy, paramInt1, arrayOfInt, n);
                      break label338;
                      localObject1 = this.Yw;
                      break label476;
                      localObject2 = this.Yv;
                      break label487;
                      j = 0;
                      break label539;
                      paramInt1 = getPaddingTop();
                      paramInt1 = ((LayoutParams)localObject1).topMargin + paramInt1 + this.YJ;
                      break label616;
                      paramInt4 = i4 - i5 - m - paramInt1 - i3;
                      if (paramInt4 >= ((LayoutParams)localObject1).bottomMargin + this.YK) {
                        break label1706;
                      }
                      paramInt1 = Math.max(0, paramInt1 - (((LayoutParams)localObject2).bottomMargin + this.YK - paramInt4));
                      break label611;
                      paramInt1 = i4 - i5 - ((LayoutParams)localObject2).bottomMargin - this.YK - m;
                      break label616;
                      paramInt4 = 0;
                      break label632;
                      if (j != 0)
                      {
                        paramInt4 = this.YH;
                        paramInt4 -= arrayOfInt[0];
                        paramInt3 += Math.max(0, paramInt4);
                        arrayOfInt[0] = Math.max(0, -paramInt4);
                        if (!paramBoolean) {
                          break label1683;
                        }
                        localObject1 = (LayoutParams)this.Yv.getLayoutParams();
                        k = this.Yv.getMeasuredWidth() + paramInt3;
                        paramInt4 = this.Yv.getMeasuredHeight() + paramInt1;
                        this.Yv.layout(paramInt3, paramInt1, k, paramInt4);
                        m = this.YI;
                        paramInt1 = ((LayoutParams)localObject1).bottomMargin;
                        k += m;
                        paramInt1 += paramInt4;
                      }
                    }
                  }
                  for (;;)
                  {
                    if (bool)
                    {
                      localObject1 = (LayoutParams)this.Yw.getLayoutParams();
                      paramInt4 = paramInt1 + ((LayoutParams)localObject1).topMargin;
                      paramInt1 = this.Yw.getMeasuredWidth() + paramInt3;
                      m = this.Yw.getMeasuredHeight();
                      this.Yw.layout(paramInt3, paramInt4, paramInt1, m + paramInt4);
                      paramInt4 = this.YI;
                      m = ((LayoutParams)localObject1).bottomMargin;
                    }
                    for (m = paramInt4 + paramInt1;; m = paramInt3)
                    {
                      paramInt4 = paramInt2;
                      paramInt1 = paramInt3;
                      if (j == 0) {
                        break;
                      }
                      paramInt1 = Math.max(k, m);
                      paramInt4 = paramInt2;
                      break;
                      paramInt4 = 0;
                      break label1125;
                      a(this.YQ, 5);
                      j = this.YQ.size();
                      paramInt3 = 0;
                      paramInt2 = paramInt4;
                      while (paramInt3 < j)
                      {
                        paramInt2 = b((View)this.YQ.get(paramInt3), paramInt2, arrayOfInt, n);
                        paramInt3 += 1;
                      }
                      a(this.YQ, 1);
                      localObject1 = this.YQ;
                      k = arrayOfInt[0];
                      j = arrayOfInt[1];
                      m = ((List)localObject1).size();
                      paramInt4 = 0;
                      paramInt3 = 0;
                      while (paramInt4 < m)
                      {
                        localObject2 = (View)((List)localObject1).get(paramInt4);
                        LayoutParams localLayoutParams = (LayoutParams)((View)localObject2).getLayoutParams();
                        k = localLayoutParams.leftMargin - k;
                        j = localLayoutParams.rightMargin - j;
                        i3 = Math.max(0, k);
                        i4 = Math.max(0, j);
                        k = Math.max(0, -k);
                        j = Math.max(0, -j);
                        i5 = ((View)localObject2).getMeasuredWidth();
                        paramInt4 += 1;
                        paramInt3 += i5 + i3 + i4;
                      }
                      paramInt4 = (i1 - i - i2) / 2 + i - paramInt3 / 2;
                      paramInt3 = paramInt4 + paramInt3;
                      if (paramInt4 < paramInt1) {}
                      for (;;)
                      {
                        paramInt4 = this.YQ.size();
                        paramInt3 = 0;
                        paramInt2 = paramInt1;
                        paramInt1 = paramInt3;
                        while (paramInt1 < paramInt4)
                        {
                          paramInt2 = a((View)this.YQ.get(paramInt1), paramInt2, arrayOfInt, n);
                          paramInt1 += 1;
                        }
                        paramInt1 = paramInt4;
                        if (paramInt3 > paramInt2) {
                          paramInt1 = paramInt4 - (paramInt3 - paramInt2);
                        }
                      }
                      this.YQ.clear();
                      return;
                    }
                    k = paramInt3;
                  }
                }
              }
              paramInt4 = paramInt2;
            }
          }
        }
        label1715:
        paramInt3 = paramInt1;
      }
      label1721:
      paramInt1 = i;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    Object localObject1 = this.YS;
    int n;
    int i1;
    int i;
    int m;
    int k;
    if (at.bw(this))
    {
      n = 0;
      i1 = 1;
      i = 0;
      if (!bs(this.Yx)) {
        break label1057;
      }
      i(this.Yx, paramInt1, 0, paramInt2, this.YG);
      i = this.Yx.getMeasuredWidth() + bt(this.Yx);
      m = Math.max(0, this.Yx.getMeasuredHeight() + bu(this.Yx));
      k = at.combineMeasuredStates(0, z.N(this.Yx));
    }
    for (;;)
    {
      int i2 = i;
      i = k;
      int j = m;
      if (bs(this.YB))
      {
        i(this.YB, paramInt1, 0, paramInt2, this.YG);
        i2 = this.YB.getMeasuredWidth() + bt(this.YB);
        j = Math.max(m, this.YB.getMeasuredHeight() + bu(this.YB));
        i = at.combineMeasuredStates(k, z.N(this.YB));
      }
      Object localObject2 = this.YL;
      label206:
      int i3;
      if (((ag)localObject2).fs)
      {
        k = ((ag)localObject2).Vv;
        i3 = Math.max(k, i2) + 0;
        localObject1[i1] = Math.max(0, k - i2);
        i1 = 0;
        k = i;
        m = j;
        if (bs(this.Lp))
        {
          i(this.Lp, paramInt1, i3, paramInt2, this.YG);
          i1 = this.Lp.getMeasuredWidth() + bt(this.Lp);
          m = Math.max(j, this.Lp.getMeasuredHeight() + bu(this.Lp));
          k = at.combineMeasuredStates(i, z.N(this.Lp));
        }
        localObject2 = this.YL;
        if (!((ag)localObject2).fs) {
          break label668;
        }
        i = ((ag)localObject2).Vu;
        label340:
        i2 = i3 + Math.max(i, i1);
        localObject1[n] = Math.max(0, i - i1);
        n = i2;
        i = k;
        j = m;
        if (bs(this.YC))
        {
          n = i2 + a(this.YC, paramInt1, i2, paramInt2, 0, (int[])localObject1);
          j = Math.max(m, this.YC.getMeasuredHeight() + bu(this.YC));
          i = at.combineMeasuredStates(k, z.N(this.YC));
        }
        k = n;
        i1 = i;
        m = j;
        if (bs(this.Yy))
        {
          k = n + a(this.Yy, paramInt1, n, paramInt2, 0, (int[])localObject1);
          m = Math.max(j, this.Yy.getMeasuredHeight() + bu(this.Yy));
          i1 = at.combineMeasuredStates(i, z.N(this.Yy));
        }
        i2 = getChildCount();
        n = 0;
        i = i1;
        j = m;
        m = n;
        i1 = k;
        label542:
        if (m >= i2) {
          break label677;
        }
        localObject2 = getChildAt(m);
        if ((((LayoutParams)((View)localObject2).getLayoutParams()).Zc != 0) || (!bs((View)localObject2))) {
          break label1044;
        }
        i1 += a((View)localObject2, paramInt1, i1, paramInt2, 0, (int[])localObject1);
        k = Math.max(j, ((View)localObject2).getMeasuredHeight() + bu((View)localObject2));
        j = at.combineMeasuredStates(i, z.N((View)localObject2));
      }
      for (i = k;; i = k)
      {
        m += 1;
        k = i;
        i = j;
        j = k;
        break label542;
        n = 1;
        i1 = 0;
        break;
        k = ((ag)localObject2).Vu;
        break label206;
        label668:
        i = ((ag)localObject2).Vv;
        break label340;
        label677:
        n = 0;
        m = 0;
        int i4 = this.YJ + this.YK;
        int i5 = this.YH + this.YI;
        k = i;
        if (bs(this.Yv))
        {
          a(this.Yv, paramInt1, i1 + i5, paramInt2, i4, (int[])localObject1);
          k = this.Yv.getMeasuredWidth();
          n = bt(this.Yv) + k;
          m = this.Yv.getMeasuredHeight() + bu(this.Yv);
          k = at.combineMeasuredStates(i, z.N(this.Yv));
        }
        i3 = m;
        i2 = n;
        i = k;
        if (bs(this.Yw))
        {
          i2 = Math.max(n, a(this.Yw, paramInt1, i1 + i5, paramInt2, i4 + m, (int[])localObject1));
          i3 = m + (this.Yw.getMeasuredHeight() + bu(this.Yw));
          i = at.combineMeasuredStates(k, z.N(this.Yw));
        }
        k = Math.max(j, i3);
        j = getPaddingLeft();
        i3 = getPaddingRight();
        m = getPaddingTop();
        n = getPaddingBottom();
        j = z.resolveSizeAndState(Math.max(i2 + i1 + (j + i3), getSuggestedMinimumWidth()), paramInt1, 0xFF000000 & i);
        paramInt2 = z.resolveSizeAndState(Math.max(k + (m + n), getSuggestedMinimumHeight()), paramInt2, i << 16);
        if (!this.YY) {
          paramInt1 = 0;
        }
        for (;;)
        {
          if (paramInt1 != 0) {
            paramInt2 = 0;
          }
          setMeasuredDimension(j, paramInt2);
          return;
          i = getChildCount();
          paramInt1 = 0;
          for (;;)
          {
            if (paramInt1 >= i) {
              break label1039;
            }
            localObject1 = getChildAt(paramInt1);
            if ((bs((View)localObject1)) && (((View)localObject1).getMeasuredWidth() > 0) && (((View)localObject1).getMeasuredHeight() > 0))
            {
              paramInt1 = 0;
              break;
            }
            paramInt1 += 1;
          }
          label1039:
          paramInt1 = 1;
        }
        label1044:
        k = j;
        j = i;
      }
      label1057:
      k = 0;
      m = 0;
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    SavedState localSavedState = (SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if (this.Lp != null) {}
    for (paramParcelable = this.Lp.dn;; paramParcelable = null)
    {
      if ((localSavedState.Zd != 0) && (this.YX != null) && (paramParcelable != null))
      {
        paramParcelable = paramParcelable.findItem(localSavedState.Zd);
        if (paramParcelable != null) {
          m.b(paramParcelable);
        }
      }
      if (!localSavedState.Ze) {
        break;
      }
      removeCallbacks(this.YZ);
      post(this.YZ);
      return;
    }
  }
  
  public void onRtlPropertiesChanged(int paramInt)
  {
    boolean bool = true;
    if (Build.VERSION.SDK_INT >= 17) {
      super.onRtlPropertiesChanged(paramInt);
    }
    ag localag = this.YL;
    if (paramInt == 1) {
      if (bool != localag.fs)
      {
        localag.fs = bool;
        if (!localag.Vz) {
          break label164;
        }
        if (!bool) {
          break label109;
        }
        if (localag.vt == Integer.MIN_VALUE) {
          break label93;
        }
        paramInt = localag.vt;
        label63:
        localag.Vu = paramInt;
        if (localag.Vw == Integer.MIN_VALUE) {
          break label101;
        }
      }
    }
    label93:
    label101:
    for (paramInt = localag.Vw;; paramInt = localag.Vy)
    {
      localag.Vv = paramInt;
      return;
      bool = false;
      break;
      paramInt = localag.Vx;
      break label63;
    }
    label109:
    if (localag.Vw != Integer.MIN_VALUE)
    {
      paramInt = localag.Vw;
      localag.Vu = paramInt;
      if (localag.vt == Integer.MIN_VALUE) {
        break label156;
      }
    }
    label156:
    for (paramInt = localag.vt;; paramInt = localag.Vy)
    {
      localag.Vv = paramInt;
      return;
      paramInt = localag.Vx;
      break;
    }
    label164:
    localag.Vu = localag.Vx;
    localag.Vv = localag.Vy;
  }
  
  protected Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    if ((this.YX != null) && (this.YX.Zb != null)) {
      localSavedState.Zd = this.YX.Zb.getItemId();
    }
    localSavedState.Ze = isOverflowMenuShowing();
    return localSavedState;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = o.d(paramMotionEvent);
    if (i == 0) {
      this.Lt = false;
    }
    if (!this.Lt)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if ((i == 0) && (!bool)) {
        this.Lt = true;
      }
    }
    if ((i == 1) || (i == 3)) {
      this.Lt = false;
    }
    return true;
  }
  
  public final void setLogo(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      gT();
      if (!bv(this.Yy)) {
        e(this.Yy, true);
      }
    }
    for (;;)
    {
      if (this.Yy != null) {
        this.Yy.setImageDrawable(paramDrawable);
      }
      return;
      if ((this.Yy != null) && (bv(this.Yy)))
      {
        removeView(this.Yy);
        this.YR.remove(this.Yy);
      }
    }
  }
  
  public final void setNavigationContentDescription(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence)) {
      gV();
    }
    if (this.Yx != null) {
      this.Yx.setContentDescription(paramCharSequence);
    }
  }
  
  public final void setNavigationIcon(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      gV();
      if (!bv(this.Yx)) {
        e(this.Yx, true);
      }
    }
    for (;;)
    {
      if (this.Yx != null) {
        this.Yx.setImageDrawable(paramDrawable);
      }
      return;
      if ((this.Yx != null) && (bv(this.Yx)))
      {
        removeView(this.Yx);
        this.YR.remove(this.Yx);
      }
    }
  }
  
  public final void setNavigationOnClickListener(View.OnClickListener paramOnClickListener)
  {
    gV();
    this.Yx.setOnClickListener(paramOnClickListener);
  }
  
  public final void setPopupTheme(int paramInt)
  {
    if (this.MQ != paramInt)
    {
      this.MQ = paramInt;
      if (paramInt == 0) {
        this.Lo = getContext();
      }
    }
    else
    {
      return;
    }
    this.Lo = new ContextThemeWrapper(getContext(), paramInt);
  }
  
  public final void setSubtitle(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      if (this.Yw == null)
      {
        Context localContext = getContext();
        this.Yw = new TextView(localContext);
        this.Yw.setSingleLine();
        this.Yw.setEllipsize(TextUtils.TruncateAt.END);
        if (this.YE != 0) {
          this.Yw.setTextAppearance(localContext, this.YE);
        }
        if (this.YP != 0) {
          this.Yw.setTextColor(this.YP);
        }
      }
      if (!bv(this.Yw)) {
        e(this.Yw, true);
      }
    }
    for (;;)
    {
      if (this.Yw != null) {
        this.Yw.setText(paramCharSequence);
      }
      this.YN = paramCharSequence;
      return;
      if ((this.Yw != null) && (bv(this.Yw)))
      {
        removeView(this.Yw);
        this.YR.remove(this.Yw);
      }
    }
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      if (this.Yv == null)
      {
        Context localContext = getContext();
        this.Yv = new TextView(localContext);
        this.Yv.setSingleLine();
        this.Yv.setEllipsize(TextUtils.TruncateAt.END);
        if (this.YD != 0) {
          this.Yv.setTextAppearance(localContext, this.YD);
        }
        if (this.YO != 0) {
          this.Yv.setTextColor(this.YO);
        }
      }
      if (!bv(this.Yv)) {
        e(this.Yv, true);
      }
    }
    for (;;)
    {
      if (this.Yv != null) {
        this.Yv.setText(paramCharSequence);
      }
      this.YM = paramCharSequence;
      return;
      if ((this.Yv != null) && (bv(this.Yv)))
      {
        removeView(this.Yv);
        this.YR.remove(this.Yv);
      }
    }
  }
  
  public final boolean showOverflowMenu()
  {
    if (this.Lp != null)
    {
      ActionMenuView localActionMenuView = this.Lp;
      if ((localActionMenuView.MR != null) && (localActionMenuView.MR.showOverflowMenu())) {}
      for (int i = 1; i != 0; i = 0) {
        return true;
      }
    }
    return false;
  }
  
  public static class LayoutParams
    extends ActionBar.LayoutParams
  {
    int Zc = 0;
    
    public LayoutParams()
    {
      super(-2);
      this.gravity = 8388627;
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public LayoutParams(ActionBar.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public LayoutParams(LayoutParams paramLayoutParams)
    {
      super();
      this.Zc = paramLayoutParams.Zc;
    }
    
    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
      this.leftMargin = paramMarginLayoutParams.leftMargin;
      this.topMargin = paramMarginLayoutParams.topMargin;
      this.rightMargin = paramMarginLayoutParams.rightMargin;
      this.bottomMargin = paramMarginLayoutParams.bottomMargin;
    }
  }
  
  public static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator() {};
    int Zd;
    boolean Ze;
    
    public SavedState(Parcel paramParcel)
    {
      super();
      this.Zd = paramParcel.readInt();
      if (paramParcel.readInt() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.Ze = bool;
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
      paramParcel.writeInt(this.Zd);
      if (this.Ze) {}
      for (paramInt = 1;; paramInt = 0)
      {
        paramParcel.writeInt(paramInt);
        return;
      }
    }
  }
  
  private final class a
    implements android.support.v7.view.menu.l
  {
    android.support.v7.view.menu.h Zb;
    android.support.v7.view.menu.f dn;
    
    public a() {}
    
    public final boolean B()
    {
      return false;
    }
    
    public final void a(Context paramContext, android.support.v7.view.menu.f paramf)
    {
      if ((this.dn != null) && (this.Zb != null)) {
        this.dn.h(this.Zb);
      }
      this.dn = paramf;
    }
    
    public final void a(android.support.v7.view.menu.f paramf, boolean paramBoolean) {}
    
    public final boolean a(p paramp)
    {
      return false;
    }
    
    public final boolean b(android.support.v7.view.menu.h paramh)
    {
      Toolbar.b(Toolbar.this);
      if (Toolbar.c(Toolbar.this).getParent() != Toolbar.this) {
        Toolbar.this.addView(Toolbar.c(Toolbar.this));
      }
      Toolbar.this.YC = paramh.getActionView();
      this.Zb = paramh;
      if (Toolbar.this.YC.getParent() != Toolbar.this)
      {
        localObject = Toolbar.gW();
        ((Toolbar.LayoutParams)localObject).gravity = (0x800003 | Toolbar.d(Toolbar.this) & 0x70);
        ((Toolbar.LayoutParams)localObject).Zc = 2;
        Toolbar.this.YC.setLayoutParams((ViewGroup.LayoutParams)localObject);
        Toolbar.this.addView(Toolbar.this.YC);
      }
      Object localObject = Toolbar.this;
      int i = ((Toolbar)localObject).getChildCount() - 1;
      while (i >= 0)
      {
        View localView = ((Toolbar)localObject).getChildAt(i);
        if ((((Toolbar.LayoutParams)localView.getLayoutParams()).Zc != 2) && (localView != ((Toolbar)localObject).Lp))
        {
          ((Toolbar)localObject).removeViewAt(i);
          ((Toolbar)localObject).YR.add(localView);
        }
        i -= 1;
      }
      Toolbar.this.requestLayout();
      paramh.I(true);
      if ((Toolbar.this.YC instanceof c)) {
        ((c)Toolbar.this.YC).onActionViewExpanded();
      }
      return true;
    }
    
    public final boolean c(android.support.v7.view.menu.h paramh)
    {
      if ((Toolbar.this.YC instanceof c)) {
        ((c)Toolbar.this.YC).onActionViewCollapsed();
      }
      Toolbar.this.removeView(Toolbar.this.YC);
      Toolbar.this.removeView(Toolbar.c(Toolbar.this));
      Toolbar.this.YC = null;
      Toolbar localToolbar = Toolbar.this;
      int i = localToolbar.YR.size() - 1;
      while (i >= 0)
      {
        localToolbar.addView((View)localToolbar.YR.get(i));
        i -= 1;
      }
      localToolbar.YR.clear();
      this.Zb = null;
      Toolbar.this.requestLayout();
      paramh.I(false);
      return true;
    }
    
    public final void f(boolean paramBoolean)
    {
      int k = 0;
      int j;
      int m;
      int i;
      if (this.Zb != null)
      {
        j = k;
        if (this.dn != null)
        {
          m = this.dn.size();
          i = 0;
        }
      }
      for (;;)
      {
        j = k;
        if (i < m)
        {
          if (this.dn.getItem(i) == this.Zb) {
            j = 1;
          }
        }
        else
        {
          if (j == 0) {
            c(this.Zb);
          }
          return;
        }
        i += 1;
      }
    }
    
    public final int getId()
    {
      return 0;
    }
    
    public final void onRestoreInstanceState(Parcelable paramParcelable) {}
    
    public final Parcelable onSaveInstanceState()
    {
      return null;
    }
  }
  
  public static abstract interface b
  {
    public abstract boolean ed();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\Toolbar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */