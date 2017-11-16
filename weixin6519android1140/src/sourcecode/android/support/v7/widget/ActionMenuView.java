package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.f.a;
import android.support.v7.view.menu.f.b;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.l.a;
import android.support.v7.view.menu.m;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;

public class ActionMenuView
  extends LinearLayoutCompat
  implements f.b, m
{
  private Context Lo;
  private int MB;
  private int MQ;
  ActionMenuPresenter MR;
  private l.a MS;
  private f.a MT;
  private boolean MU;
  private int MV;
  private int MW;
  d MX;
  boolean Ms;
  f dn;
  
  public ActionMenuView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.QR = false;
    float f = paramContext.getResources().getDisplayMetrics().density;
    this.MB = ((int)(56.0F * f));
    this.MW = ((int)(f * 4.0F));
    this.Lo = paramContext;
    this.MQ = 0;
  }
  
  private boolean aB(int paramInt)
  {
    boolean bool2 = false;
    if (paramInt == 0) {
      return false;
    }
    View localView1 = getChildAt(paramInt - 1);
    View localView2 = getChildAt(paramInt);
    boolean bool1 = bool2;
    if (paramInt < getChildCount())
    {
      bool1 = bool2;
      if ((localView1 instanceof a)) {
        bool1 = ((a)localView1).dm() | false;
      }
    }
    if ((paramInt > 0) && ((localView2 instanceof a))) {
      return ((a)localView2).dl() | bool1;
    }
    return bool1;
  }
  
  private LayoutParams b(AttributeSet paramAttributeSet)
  {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  protected static LayoutParams c(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams != null)
    {
      if ((paramLayoutParams instanceof LayoutParams)) {}
      for (paramLayoutParams = new LayoutParams((LayoutParams)paramLayoutParams);; paramLayoutParams = new LayoutParams(paramLayoutParams))
      {
        if (paramLayoutParams.gravity <= 0) {
          paramLayoutParams.gravity = 16;
        }
        return paramLayoutParams;
      }
    }
    return ea();
  }
  
  static int d(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool2 = false;
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt3) - paramInt4, View.MeasureSpec.getMode(paramInt3));
    ActionMenuItemView localActionMenuItemView;
    if ((paramView instanceof ActionMenuItemView))
    {
      localActionMenuItemView = (ActionMenuItemView)paramView;
      if ((localActionMenuItemView == null) || (!localActionMenuItemView.hasText())) {
        break label184;
      }
      paramInt4 = 1;
      label57:
      if ((paramInt2 <= 0) || ((paramInt4 != 0) && (paramInt2 < 2))) {
        break label190;
      }
      paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1 * paramInt2, Integer.MIN_VALUE), i);
      int j = paramView.getMeasuredWidth();
      paramInt3 = j / paramInt1;
      paramInt2 = paramInt3;
      if (j % paramInt1 != 0) {
        paramInt2 = paramInt3 + 1;
      }
      paramInt3 = paramInt2;
      if (paramInt4 != 0)
      {
        paramInt3 = paramInt2;
        if (paramInt2 >= 2) {}
      }
    }
    label184:
    label190:
    for (paramInt3 = 2;; paramInt3 = 0)
    {
      boolean bool1 = bool2;
      if (!localLayoutParams.MZ)
      {
        bool1 = bool2;
        if (paramInt4 != 0) {
          bool1 = true;
        }
      }
      localLayoutParams.Nc = bool1;
      localLayoutParams.Na = paramInt3;
      paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt3 * paramInt1, 1073741824), i);
      return paramInt3;
      localActionMenuItemView = null;
      break;
      paramInt4 = 0;
      break label57;
    }
  }
  
  private static LayoutParams ea()
  {
    LayoutParams localLayoutParams = new LayoutParams();
    localLayoutParams.gravity = 16;
    return localLayoutParams;
  }
  
  public static LayoutParams eb()
  {
    LayoutParams localLayoutParams = ea();
    localLayoutParams.MZ = true;
    return localLayoutParams;
  }
  
  public final void a(f paramf)
  {
    this.dn = paramf;
  }
  
  public final void a(l.a parama, f.a parama1)
  {
    this.MS = parama;
    this.MT = parama1;
  }
  
  public final void a(ActionMenuPresenter paramActionMenuPresenter)
  {
    this.MR = paramActionMenuPresenter;
    this.MR.a(this);
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return (paramLayoutParams != null) && ((paramLayoutParams instanceof LayoutParams));
  }
  
  public final void dismissPopupMenus()
  {
    if (this.MR != null) {
      this.MR.dX();
    }
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return false;
  }
  
  public final boolean f(h paramh)
  {
    return this.dn.a(paramh, null, 0);
  }
  
  public final Menu getMenu()
  {
    ActionMenuPresenter localActionMenuPresenter;
    if (this.dn == null)
    {
      localObject = getContext();
      this.dn = new f((Context)localObject);
      this.dn.a(new c());
      this.MR = new ActionMenuPresenter((Context)localObject);
      this.MR.dW();
      localActionMenuPresenter = this.MR;
      if (this.MS == null) {
        break label108;
      }
    }
    label108:
    for (Object localObject = this.MS;; localObject = new b())
    {
      localActionMenuPresenter.dm = ((l.a)localObject);
      this.dn.a(this.MR, this.Lo);
      this.MR.a(this);
      return this.dn;
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8) {
      super.onConfigurationChanged(paramConfiguration);
    }
    if (this.MR != null)
    {
      this.MR.f(false);
      if (this.MR.isOverflowMenuShowing())
      {
        this.MR.hideOverflowMenu();
        this.MR.showOverflowMenu();
      }
    }
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    dismissPopupMenus();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!this.MU)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    int i1 = getChildCount();
    int n = (paramInt4 - paramInt2) / 2;
    int i2 = this.Rb;
    paramInt2 = 0;
    paramInt4 = paramInt3 - paramInt1 - getPaddingRight() - getPaddingLeft();
    int j = 0;
    paramBoolean = at.bw(this);
    int i = 0;
    label68:
    View localView;
    LayoutParams localLayoutParams;
    int k;
    int m;
    if (i < i1)
    {
      localView = getChildAt(i);
      if (localView.getVisibility() == 8) {
        break label665;
      }
      localLayoutParams = (LayoutParams)localView.getLayoutParams();
      if (localLayoutParams.MZ)
      {
        k = localView.getMeasuredWidth();
        j = k;
        if (aB(i)) {
          j = k + i2;
        }
        int i3 = localView.getMeasuredHeight();
        if (paramBoolean)
        {
          m = getPaddingLeft() + localLayoutParams.leftMargin;
          k = m + j;
          label168:
          int i4 = n - i3 / 2;
          localView.layout(m, i4, k, i3 + i4);
          k = paramInt4 - j;
          j = 1;
          paramInt4 = paramInt2;
          paramInt2 = k;
        }
      }
    }
    for (;;)
    {
      k = i + 1;
      i = paramInt4;
      paramInt4 = paramInt2;
      paramInt2 = i;
      i = k;
      break label68;
      k = getWidth() - getPaddingRight() - localLayoutParams.rightMargin;
      m = k - j;
      break label168;
      k = localView.getMeasuredWidth();
      m = localLayoutParams.leftMargin;
      paramInt4 -= localLayoutParams.rightMargin + (k + m);
      aB(i);
      k = paramInt2 + 1;
      paramInt2 = paramInt4;
      paramInt4 = k;
      continue;
      if ((i1 == 1) && (j == 0))
      {
        localView = getChildAt(0);
        paramInt2 = localView.getMeasuredWidth();
        paramInt4 = localView.getMeasuredHeight();
        paramInt1 = (paramInt3 - paramInt1) / 2 - paramInt2 / 2;
        paramInt3 = n - paramInt4 / 2;
        localView.layout(paramInt1, paramInt3, paramInt2 + paramInt1, paramInt4 + paramInt3);
        return;
      }
      if (j != 0)
      {
        paramInt1 = 0;
        label386:
        paramInt1 = paramInt2 - paramInt1;
        if (paramInt1 <= 0) {
          break label537;
        }
        paramInt1 = paramInt4 / paramInt1;
        label399:
        paramInt3 = Math.max(0, paramInt1);
        if (!paramBoolean) {
          break label542;
        }
        paramInt1 = getWidth() - getPaddingRight();
        paramInt2 = 0;
        label422:
        if (paramInt2 < i1)
        {
          localView = getChildAt(paramInt2);
          localLayoutParams = (LayoutParams)localView.getLayoutParams();
          if ((localView.getVisibility() == 8) || (localLayoutParams.MZ)) {
            break label662;
          }
          paramInt1 -= localLayoutParams.rightMargin;
          paramInt4 = localView.getMeasuredWidth();
          i = localView.getMeasuredHeight();
          j = n - i / 2;
          localView.layout(paramInt1 - paramInt4, j, paramInt1, i + j);
          paramInt1 -= localLayoutParams.leftMargin + paramInt4 + paramInt3;
        }
      }
      label537:
      label542:
      label549:
      label659:
      label662:
      for (;;)
      {
        paramInt2 += 1;
        break label422;
        break;
        paramInt1 = 1;
        break label386;
        paramInt1 = 0;
        break label399;
        paramInt1 = getPaddingLeft();
        paramInt2 = 0;
        if (paramInt2 < i1)
        {
          localView = getChildAt(paramInt2);
          localLayoutParams = (LayoutParams)localView.getLayoutParams();
          if ((localView.getVisibility() == 8) || (localLayoutParams.MZ)) {
            break label659;
          }
          paramInt1 += localLayoutParams.leftMargin;
          paramInt4 = localView.getMeasuredWidth();
          i = localView.getMeasuredHeight();
          j = n - i / 2;
          localView.layout(paramInt1, j, paramInt1 + paramInt4, i + j);
          paramInt1 = localLayoutParams.rightMargin + paramInt4 + paramInt3 + paramInt1;
        }
        for (;;)
        {
          paramInt2 += 1;
          break label549;
          break;
        }
      }
      label665:
      k = paramInt2;
      paramInt2 = paramInt4;
      paramInt4 = k;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool2 = this.MU;
    if (View.MeasureSpec.getMode(paramInt1) == 1073741824) {}
    int i;
    int j;
    int i7;
    int i6;
    int i4;
    int i8;
    int i9;
    for (boolean bool1 = true;; bool1 = false)
    {
      this.MU = bool1;
      if (bool2 != this.MU) {
        this.MV = 0;
      }
      i = View.MeasureSpec.getSize(paramInt1);
      if ((this.MU) && (this.dn != null) && (i != this.MV))
      {
        this.MV = i;
        this.dn.h(true);
      }
      j = getChildCount();
      if ((!this.MU) || (j <= 0)) {
        break label1304;
      }
      i7 = View.MeasureSpec.getMode(paramInt2);
      paramInt1 = View.MeasureSpec.getSize(paramInt1);
      i6 = View.MeasureSpec.getSize(paramInt2);
      i = getPaddingLeft();
      j = getPaddingRight();
      i4 = getPaddingTop() + getPaddingBottom();
      i8 = getChildMeasureSpec(paramInt2, i4, -2);
      i9 = paramInt1 - (i + j);
      paramInt1 = i9 / this.MB;
      paramInt2 = this.MB;
      if (paramInt1 != 0) {
        break;
      }
      setMeasuredDimension(i9, 0);
      return;
    }
    int i10 = this.MB + i9 % paramInt2 / paramInt1;
    paramInt2 = 0;
    int n = 0;
    int m = 0;
    int i1 = 0;
    int k = 0;
    long l1 = 0L;
    int i11 = getChildCount();
    int i2 = 0;
    Object localObject;
    LayoutParams localLayoutParams;
    label351:
    label369:
    int i3;
    label407:
    label418:
    long l2;
    if (i2 < i11)
    {
      localObject = getChildAt(i2);
      if (((View)localObject).getVisibility() == 8) {
        break label1438;
      }
      bool1 = localObject instanceof ActionMenuItemView;
      i1 += 1;
      if (bool1) {
        ((View)localObject).setPadding(this.MW, 0, this.MW, 0);
      }
      localLayoutParams = (LayoutParams)((View)localObject).getLayoutParams();
      localLayoutParams.Ne = false;
      localLayoutParams.Nb = 0;
      localLayoutParams.Na = 0;
      localLayoutParams.Nc = false;
      localLayoutParams.leftMargin = 0;
      localLayoutParams.rightMargin = 0;
      if ((bool1) && (((ActionMenuItemView)localObject).hasText()))
      {
        bool1 = true;
        localLayoutParams.Nd = bool1;
        if (!localLayoutParams.MZ) {
          break label512;
        }
        i = 1;
        i3 = d((View)localObject, i10, i, i8, i4);
        n = Math.max(n, i3);
        if (!localLayoutParams.Nc) {
          break label1431;
        }
        i = m + 1;
        if (!localLayoutParams.MZ) {
          break label1424;
        }
        j = 1;
        paramInt1 -= i3;
        m = Math.max(paramInt2, ((View)localObject).getMeasuredHeight());
        if (i3 != 1) {
          break label1386;
        }
        l2 = 1 << i2;
        paramInt2 = m;
        k = paramInt1;
        m = i;
        i3 = j;
        l1 = l2 | l1;
        paramInt1 = i1;
        j = k;
        i = paramInt2;
        k = i3;
        paramInt2 = n;
      }
    }
    for (;;)
    {
      i2 += 1;
      i1 = paramInt1;
      paramInt1 = j;
      n = paramInt2;
      paramInt2 = i;
      break;
      bool1 = false;
      break label351;
      label512:
      i = paramInt1;
      break label369;
      long l3;
      if ((k != 0) && (i1 == 2))
      {
        i3 = 1;
        i = 0;
        i2 = paramInt1;
        paramInt1 = i;
        l3 = l1;
        if (m <= 0) {
          break label863;
        }
        l3 = l1;
        if (i2 <= 0) {
          break label863;
        }
        i = Integer.MAX_VALUE;
        l2 = 0L;
        j = 0;
        i4 = 0;
        label573:
        if (i4 >= i11) {
          break label697;
        }
        localObject = (LayoutParams)getChildAt(i4).getLayoutParams();
        if (!((LayoutParams)localObject).Nc) {
          break label1371;
        }
        if (((LayoutParams)localObject).Na >= i) {
          break label660;
        }
        j = ((LayoutParams)localObject).Na;
        l2 = 1 << i4;
        i = 1;
      }
      for (;;)
      {
        int i5 = i4 + 1;
        i4 = j;
        j = i;
        i = i4;
        i4 = i5;
        break label573;
        i3 = 0;
        break;
        label660:
        if (((LayoutParams)localObject).Na == i)
        {
          l2 |= 1 << i4;
          i5 = j + 1;
          j = i;
          i = i5;
          continue;
          label697:
          l1 |= l2;
          l3 = l1;
          if (j <= i2)
          {
            j = 0;
            paramInt1 = i2;
            label721:
            if (j < i11)
            {
              localObject = getChildAt(j);
              localLayoutParams = (LayoutParams)((View)localObject).getLayoutParams();
              if ((1 << j & l2) == 0L)
              {
                if (localLayoutParams.Na != i + 1) {
                  break label1368;
                }
                l1 |= 1 << j;
              }
            }
          }
          label863:
          label1029:
          label1032:
          label1140:
          label1208:
          label1211:
          label1214:
          label1304:
          label1362:
          label1368:
          for (;;)
          {
            j += 1;
            break label721;
            if ((i3 != 0) && (localLayoutParams.Nd) && (paramInt1 == 1)) {
              ((View)localObject).setPadding(this.MW + i10, 0, this.MW, 0);
            }
            localLayoutParams.Na += 1;
            localLayoutParams.Ne = true;
            paramInt1 -= 1;
            continue;
            i = 1;
            i2 = paramInt1;
            paramInt1 = i;
            break;
            float f2;
            float f1;
            if ((k == 0) && (i1 == 1))
            {
              i = 1;
              if ((i2 <= 0) || (l3 == 0L) || ((i2 >= i1 - 1) && (i == 0) && (n <= 1))) {
                break label1211;
              }
              float f3 = Long.bitCount(l3);
              f2 = f3;
              if (i != 0) {
                break label1362;
              }
              f1 = f3;
              if ((1L & l3) != 0L)
              {
                f1 = f3;
                if (!((LayoutParams)getChildAt(0).getLayoutParams()).Nd) {
                  f1 = f3 - 0.5F;
                }
              }
              f2 = f1;
              if ((1 << i11 - 1 & l3) == 0L) {
                break label1362;
              }
              f2 = f1;
              if (((LayoutParams)getChildAt(i11 - 1).getLayoutParams()).Nd) {
                break label1362;
              }
            }
            for (f1 -= 0.5F;; f1 = f2)
            {
              if (f1 > 0.0F)
              {
                i = (int)(i2 * i10 / f1);
                j = 0;
                k = paramInt1;
                if (j >= i11) {
                  break label1214;
                }
                if ((1 << j & l3) == 0L) {
                  break label1208;
                }
                localObject = getChildAt(j);
                localLayoutParams = (LayoutParams)((View)localObject).getLayoutParams();
                if (!(localObject instanceof ActionMenuItemView)) {
                  break label1140;
                }
                localLayoutParams.Nb = i;
                localLayoutParams.Ne = true;
                if ((j == 0) && (!localLayoutParams.Nd)) {
                  localLayoutParams.leftMargin = (-i / 2);
                }
                paramInt1 = 1;
              }
              for (;;)
              {
                j += 1;
                break label1032;
                i = 0;
                break;
                i = 0;
                break label1029;
                if (localLayoutParams.MZ)
                {
                  localLayoutParams.Nb = i;
                  localLayoutParams.Ne = true;
                  localLayoutParams.rightMargin = (-i / 2);
                  paramInt1 = 1;
                }
                else
                {
                  if (j != 0) {
                    localLayoutParams.leftMargin = (i / 2);
                  }
                  if (j != i11 - 1) {
                    localLayoutParams.rightMargin = (i / 2);
                  }
                }
              }
              k = paramInt1;
              if (k != 0)
              {
                paramInt1 = 0;
                while (paramInt1 < i11)
                {
                  localObject = getChildAt(paramInt1);
                  localLayoutParams = (LayoutParams)((View)localObject).getLayoutParams();
                  if (localLayoutParams.Ne)
                  {
                    i = localLayoutParams.Na;
                    ((View)localObject).measure(View.MeasureSpec.makeMeasureSpec(localLayoutParams.Nb + i * i10, 1073741824), i8);
                  }
                  paramInt1 += 1;
                }
              }
              if (i7 != 1073741824) {}
              for (;;)
              {
                setMeasuredDimension(i9, paramInt2);
                return;
                i = 0;
                while (i < j)
                {
                  localObject = (LayoutParams)getChildAt(i).getLayoutParams();
                  ((LayoutParams)localObject).rightMargin = 0;
                  ((LayoutParams)localObject).leftMargin = 0;
                  i += 1;
                }
                super.onMeasure(paramInt1, paramInt2);
                return;
                paramInt2 = i6;
              }
            }
          }
        }
        else
        {
          label1371:
          i5 = i;
          i = j;
          j = i5;
        }
      }
      label1386:
      paramInt2 = i1;
      k = n;
      n = m;
      i1 = paramInt1;
      paramInt1 = paramInt2;
      paramInt2 = k;
      m = i;
      k = j;
      i = n;
      j = i1;
      continue;
      label1424:
      j = k;
      break label418;
      label1431:
      i = m;
      break label407;
      label1438:
      i = paramInt2;
      j = paramInt1;
      paramInt2 = n;
      paramInt1 = i1;
    }
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
  
  public static class LayoutParams
    extends LinearLayoutCompat.LayoutParams
  {
    @ViewDebug.ExportedProperty
    public boolean MZ;
    @ViewDebug.ExportedProperty
    public int Na;
    @ViewDebug.ExportedProperty
    public int Nb;
    @ViewDebug.ExportedProperty
    public boolean Nc;
    @ViewDebug.ExportedProperty
    public boolean Nd;
    boolean Ne;
    
    public LayoutParams()
    {
      super(-2);
      this.MZ = false;
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public LayoutParams(LayoutParams paramLayoutParams)
    {
      super();
      this.MZ = paramLayoutParams.MZ;
    }
    
    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
  }
  
  public static abstract interface a
  {
    public abstract boolean dl();
    
    public abstract boolean dm();
  }
  
  private final class b
    implements l.a
  {
    public b() {}
    
    public final void a(f paramf, boolean paramBoolean) {}
    
    public final boolean d(f paramf)
    {
      return false;
    }
  }
  
  private final class c
    implements f.a
  {
    public c() {}
    
    public final boolean a(f paramf, MenuItem paramMenuItem)
    {
      return (ActionMenuView.b(ActionMenuView.this) != null) && (ActionMenuView.b(ActionMenuView.this).ed());
    }
    
    public final void b(f paramf)
    {
      if (ActionMenuView.c(ActionMenuView.this) != null) {
        ActionMenuView.c(ActionMenuView.this).b(paramf);
      }
    }
  }
  
  public static abstract interface d
  {
    public abstract boolean ed();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\ActionMenuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */