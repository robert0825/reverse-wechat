package android.support.v4.view.a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;

public final class b
{
  public static final e yZ = new j();
  public final Object za;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 22)
    {
      yZ = new c();
      return;
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      yZ = new b();
      return;
    }
    if (Build.VERSION.SDK_INT >= 19)
    {
      yZ = new i();
      return;
    }
    if (Build.VERSION.SDK_INT >= 18)
    {
      yZ = new h();
      return;
    }
    if (Build.VERSION.SDK_INT >= 17)
    {
      yZ = new g();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      yZ = new f();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      yZ = new d();
      return;
    }
  }
  
  public b(Object paramObject)
  {
    this.za = paramObject;
  }
  
  public static b a(b paramb)
  {
    paramb = yZ.l(paramb.za);
    if (paramb != null) {
      return new b(paramb);
    }
    return null;
  }
  
  public final boolean a(a parama)
  {
    return yZ.g(this.za, parama.zy);
  }
  
  public final void addAction(int paramInt)
  {
    yZ.b(this.za, paramInt);
  }
  
  public final void addChild(View paramView)
  {
    yZ.c(this.za, paramView);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      do
      {
        return true;
        if (paramObject == null) {
          return false;
        }
        if (getClass() != paramObject.getClass()) {
          return false;
        }
        paramObject = (b)paramObject;
        if (this.za != null) {
          break;
        }
      } while (((b)paramObject).za == null);
      return false;
    } while (this.za.equals(((b)paramObject).za));
    return false;
  }
  
  public final int getActions()
  {
    return yZ.m(this.za);
  }
  
  public final void getBoundsInParent(Rect paramRect)
  {
    yZ.a(this.za, paramRect);
  }
  
  public final void getBoundsInScreen(Rect paramRect)
  {
    yZ.b(this.za, paramRect);
  }
  
  public final CharSequence getClassName()
  {
    return yZ.n(this.za);
  }
  
  public final CharSequence getContentDescription()
  {
    return yZ.o(this.za);
  }
  
  public final CharSequence getPackageName()
  {
    return yZ.p(this.za);
  }
  
  public final int hashCode()
  {
    if (this.za == null) {
      return 0;
    }
    return this.za.hashCode();
  }
  
  public final boolean isAccessibilityFocused()
  {
    return yZ.E(this.za);
  }
  
  public final boolean isClickable()
  {
    return yZ.t(this.za);
  }
  
  public final boolean isEnabled()
  {
    return yZ.u(this.za);
  }
  
  public final boolean isFocusable()
  {
    return yZ.v(this.za);
  }
  
  public final boolean isFocused()
  {
    return yZ.w(this.za);
  }
  
  public final boolean isLongClickable()
  {
    return yZ.x(this.za);
  }
  
  public final boolean isSelected()
  {
    return yZ.A(this.za);
  }
  
  public final boolean isVisibleToUser()
  {
    return yZ.D(this.za);
  }
  
  public final void k(Object paramObject)
  {
    yZ.i(this.za, ((l)paramObject).za);
  }
  
  public final void recycle()
  {
    yZ.B(this.za);
  }
  
  public final void setAccessibilityFocused(boolean paramBoolean)
  {
    yZ.i(this.za, paramBoolean);
  }
  
  public final void setBoundsInParent(Rect paramRect)
  {
    yZ.c(this.za, paramRect);
  }
  
  public final void setBoundsInScreen(Rect paramRect)
  {
    yZ.d(this.za, paramRect);
  }
  
  public final void setClassName(CharSequence paramCharSequence)
  {
    yZ.b(this.za, paramCharSequence);
  }
  
  public final void setClickable(boolean paramBoolean)
  {
    yZ.a(this.za, paramBoolean);
  }
  
  public final void setContentDescription(CharSequence paramCharSequence)
  {
    yZ.c(this.za, paramCharSequence);
  }
  
  public final void setEnabled(boolean paramBoolean)
  {
    yZ.b(this.za, paramBoolean);
  }
  
  public final void setFocusable(boolean paramBoolean)
  {
    yZ.c(this.za, paramBoolean);
  }
  
  public final void setFocused(boolean paramBoolean)
  {
    yZ.d(this.za, paramBoolean);
  }
  
  public final void setLongClickable(boolean paramBoolean)
  {
    yZ.e(this.za, paramBoolean);
  }
  
  public final void setPackageName(CharSequence paramCharSequence)
  {
    yZ.d(this.za, paramCharSequence);
  }
  
  public final void setParent(View paramView)
  {
    yZ.d(this.za, paramView);
  }
  
  public final void setScrollable(boolean paramBoolean)
  {
    yZ.f(this.za, paramBoolean);
  }
  
  public final void setSelected(boolean paramBoolean)
  {
    yZ.g(this.za, paramBoolean);
  }
  
  public final void setSource(View paramView)
  {
    yZ.e(this.za, paramView);
  }
  
  public final void setText(CharSequence paramCharSequence)
  {
    yZ.e(this.za, paramCharSequence);
  }
  
  public final void setVisibleToUser(boolean paramBoolean)
  {
    yZ.h(this.za, paramBoolean);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.toString());
    Object localObject = new Rect();
    getBoundsInParent((Rect)localObject);
    localStringBuilder.append("; boundsInParent: " + localObject);
    getBoundsInScreen((Rect)localObject);
    localStringBuilder.append("; boundsInScreen: " + localObject);
    localStringBuilder.append("; packageName: ").append(getPackageName());
    localStringBuilder.append("; className: ").append(getClassName());
    localStringBuilder.append("; text: ").append(yZ.q(this.za));
    localStringBuilder.append("; contentDescription: ").append(getContentDescription());
    localStringBuilder.append("; viewId: ").append(yZ.F(this.za));
    localStringBuilder.append("; checkable: ").append(yZ.r(this.za));
    localStringBuilder.append("; checked: ").append(yZ.s(this.za));
    localStringBuilder.append("; focusable: ").append(isFocusable());
    localStringBuilder.append("; focused: ").append(isFocused());
    localStringBuilder.append("; selected: ").append(isSelected());
    localStringBuilder.append("; clickable: ").append(isClickable());
    localStringBuilder.append("; longClickable: ").append(isLongClickable());
    localStringBuilder.append("; enabled: ").append(isEnabled());
    localStringBuilder.append("; password: ").append(yZ.y(this.za));
    localStringBuilder.append("; scrollable: " + yZ.z(this.za));
    localStringBuilder.append("; [");
    int i = getActions();
    if (i != 0)
    {
      int j = 1 << Integer.numberOfTrailingZeros(i);
      i = (j ^ 0xFFFFFFFF) & i;
      switch (j)
      {
      default: 
        localObject = "ACTION_UNKNOWN";
      }
      for (;;)
      {
        localStringBuilder.append((String)localObject);
        if (i != 0) {
          localStringBuilder.append(", ");
        }
        break;
        localObject = "ACTION_FOCUS";
        continue;
        localObject = "ACTION_CLEAR_FOCUS";
        continue;
        localObject = "ACTION_SELECT";
        continue;
        localObject = "ACTION_CLEAR_SELECTION";
        continue;
        localObject = "ACTION_CLICK";
        continue;
        localObject = "ACTION_LONG_CLICK";
        continue;
        localObject = "ACTION_ACCESSIBILITY_FOCUS";
        continue;
        localObject = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
        continue;
        localObject = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
        continue;
        localObject = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
        continue;
        localObject = "ACTION_NEXT_HTML_ELEMENT";
        continue;
        localObject = "ACTION_PREVIOUS_HTML_ELEMENT";
        continue;
        localObject = "ACTION_SCROLL_FORWARD";
        continue;
        localObject = "ACTION_SCROLL_BACKWARD";
        continue;
        localObject = "ACTION_CUT";
        continue;
        localObject = "ACTION_COPY";
        continue;
        localObject = "ACTION_PASTE";
        continue;
        localObject = "ACTION_SET_SELECTION";
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public static final a zb = new a(1);
    public static final a zc = new a(2);
    public static final a zd = new a(4);
    public static final a ze = new a(8);
    public static final a zf = new a(16);
    public static final a zg = new a(32);
    public static final a zh = new a(64);
    public static final a zi = new a(128);
    public static final a zj = new a(256);
    public static final a zk = new a(512);
    public static final a zl = new a(1024);
    public static final a zm = new a(2048);
    public static final a zn = new a(4096);
    public static final a zo = new a(8192);
    public static final a zp = new a(16384);
    public static final a zq = new a(32768);
    public static final a zr = new a(65536);
    public static final a zt = new a(131072);
    public static final a zu = new a(262144);
    public static final a zv = new a(524288);
    public static final a zw = new a(1048576);
    public static final a zx = new a(2097152);
    public final Object zy;
    
    private a(int paramInt)
    {
      this(b.yZ.a(paramInt, null));
    }
    
    private a(Object paramObject)
    {
      this.zy = paramObject;
    }
  }
  
  static class b
    extends b.i
  {
    public final Object a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2)
    {
      return AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean1, false);
    }
    
    public final Object a(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
    {
      return AccessibilityNodeInfo.CollectionInfo.obtain(paramInt1, paramInt2, false, 0);
    }
    
    public final Object a(int paramInt, CharSequence paramCharSequence)
    {
      return new AccessibilityNodeInfo.AccessibilityAction(paramInt, null);
    }
    
    public final void a(Object paramObject, CharSequence paramCharSequence)
    {
      ((AccessibilityNodeInfo)paramObject).setError(paramCharSequence);
    }
    
    public final boolean g(Object paramObject1, Object paramObject2)
    {
      return ((AccessibilityNodeInfo)paramObject1).removeAction((AccessibilityNodeInfo.AccessibilityAction)paramObject2);
    }
  }
  
  static final class c
    extends b.b
  {}
  
  static class d
    extends b.j
  {
    public final boolean A(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isSelected();
    }
    
    public final void B(Object paramObject)
    {
      ((AccessibilityNodeInfo)paramObject).recycle();
    }
    
    public final void a(Object paramObject, Rect paramRect)
    {
      ((AccessibilityNodeInfo)paramObject).getBoundsInParent(paramRect);
    }
    
    public final void a(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setClickable(paramBoolean);
    }
    
    public final void b(Object paramObject, int paramInt)
    {
      ((AccessibilityNodeInfo)paramObject).addAction(paramInt);
    }
    
    public final void b(Object paramObject, Rect paramRect)
    {
      ((AccessibilityNodeInfo)paramObject).getBoundsInScreen(paramRect);
    }
    
    public final void b(Object paramObject, CharSequence paramCharSequence)
    {
      ((AccessibilityNodeInfo)paramObject).setClassName(paramCharSequence);
    }
    
    public final void b(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setEnabled(paramBoolean);
    }
    
    public final void c(Object paramObject, Rect paramRect)
    {
      ((AccessibilityNodeInfo)paramObject).setBoundsInParent(paramRect);
    }
    
    public final void c(Object paramObject, View paramView)
    {
      ((AccessibilityNodeInfo)paramObject).addChild(paramView);
    }
    
    public final void c(Object paramObject, CharSequence paramCharSequence)
    {
      ((AccessibilityNodeInfo)paramObject).setContentDescription(paramCharSequence);
    }
    
    public final void c(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setFocusable(paramBoolean);
    }
    
    public final void d(Object paramObject, Rect paramRect)
    {
      ((AccessibilityNodeInfo)paramObject).setBoundsInScreen(paramRect);
    }
    
    public final void d(Object paramObject, View paramView)
    {
      ((AccessibilityNodeInfo)paramObject).setParent(paramView);
    }
    
    public final void d(Object paramObject, CharSequence paramCharSequence)
    {
      ((AccessibilityNodeInfo)paramObject).setPackageName(paramCharSequence);
    }
    
    public final void d(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setFocused(paramBoolean);
    }
    
    public final void e(Object paramObject, View paramView)
    {
      ((AccessibilityNodeInfo)paramObject).setSource(paramView);
    }
    
    public final void e(Object paramObject, CharSequence paramCharSequence)
    {
      ((AccessibilityNodeInfo)paramObject).setText(paramCharSequence);
    }
    
    public final void e(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setLongClickable(paramBoolean);
    }
    
    public final void f(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setScrollable(paramBoolean);
    }
    
    public final void g(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setSelected(paramBoolean);
    }
    
    public final Object l(Object paramObject)
    {
      return AccessibilityNodeInfo.obtain((AccessibilityNodeInfo)paramObject);
    }
    
    public final int m(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).getActions();
    }
    
    public final CharSequence n(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).getClassName();
    }
    
    public final CharSequence o(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).getContentDescription();
    }
    
    public final CharSequence p(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).getPackageName();
    }
    
    public final CharSequence q(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).getText();
    }
    
    public final boolean r(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isCheckable();
    }
    
    public final boolean s(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isChecked();
    }
    
    public final boolean t(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isClickable();
    }
    
    public final boolean u(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isEnabled();
    }
    
    public final boolean v(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isFocusable();
    }
    
    public final boolean w(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isFocused();
    }
    
    public final boolean x(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isLongClickable();
    }
    
    public final boolean y(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isPassword();
    }
    
    public final boolean z(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isScrollable();
    }
  }
  
  public static abstract interface e
  {
    public abstract boolean A(Object paramObject);
    
    public abstract void B(Object paramObject);
    
    public abstract int C(Object paramObject);
    
    public abstract boolean D(Object paramObject);
    
    public abstract boolean E(Object paramObject);
    
    public abstract String F(Object paramObject);
    
    public abstract Object a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2);
    
    public abstract Object a(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3);
    
    public abstract Object a(int paramInt, CharSequence paramCharSequence);
    
    public abstract void a(Object paramObject, Rect paramRect);
    
    public abstract void a(Object paramObject, CharSequence paramCharSequence);
    
    public abstract void a(Object paramObject, boolean paramBoolean);
    
    public abstract void b(Object paramObject, int paramInt);
    
    public abstract void b(Object paramObject, Rect paramRect);
    
    public abstract void b(Object paramObject, CharSequence paramCharSequence);
    
    public abstract void b(Object paramObject, boolean paramBoolean);
    
    public abstract void c(Object paramObject, int paramInt);
    
    public abstract void c(Object paramObject, Rect paramRect);
    
    public abstract void c(Object paramObject, View paramView);
    
    public abstract void c(Object paramObject, CharSequence paramCharSequence);
    
    public abstract void c(Object paramObject, boolean paramBoolean);
    
    public abstract void d(Object paramObject, Rect paramRect);
    
    public abstract void d(Object paramObject, View paramView);
    
    public abstract void d(Object paramObject, CharSequence paramCharSequence);
    
    public abstract void d(Object paramObject, boolean paramBoolean);
    
    public abstract void e(Object paramObject, View paramView);
    
    public abstract void e(Object paramObject, CharSequence paramCharSequence);
    
    public abstract void e(Object paramObject, boolean paramBoolean);
    
    public abstract void f(Object paramObject, View paramView);
    
    public abstract void f(Object paramObject, boolean paramBoolean);
    
    public abstract void g(Object paramObject, boolean paramBoolean);
    
    public abstract boolean g(Object paramObject1, Object paramObject2);
    
    public abstract void h(Object paramObject1, Object paramObject2);
    
    public abstract void h(Object paramObject, boolean paramBoolean);
    
    public abstract void i(Object paramObject1, Object paramObject2);
    
    public abstract void i(Object paramObject, boolean paramBoolean);
    
    public abstract void j(Object paramObject, boolean paramBoolean);
    
    public abstract Object l(Object paramObject);
    
    public abstract int m(Object paramObject);
    
    public abstract CharSequence n(Object paramObject);
    
    public abstract CharSequence o(Object paramObject);
    
    public abstract CharSequence p(Object paramObject);
    
    public abstract CharSequence q(Object paramObject);
    
    public abstract boolean r(Object paramObject);
    
    public abstract boolean s(Object paramObject);
    
    public abstract boolean t(Object paramObject);
    
    public abstract boolean u(Object paramObject);
    
    public abstract boolean v(Object paramObject);
    
    public abstract boolean w(Object paramObject);
    
    public abstract boolean x(Object paramObject);
    
    public abstract boolean y(Object paramObject);
    
    public abstract boolean z(Object paramObject);
  }
  
  static class f
    extends b.d
  {
    public final int C(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).getMovementGranularities();
    }
    
    public final boolean D(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isVisibleToUser();
    }
    
    public final boolean E(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isAccessibilityFocused();
    }
    
    public final void c(Object paramObject, int paramInt)
    {
      ((AccessibilityNodeInfo)paramObject).setMovementGranularities(paramInt);
    }
    
    public final void h(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setVisibleToUser(paramBoolean);
    }
    
    public final void i(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setAccessibilityFocused(paramBoolean);
    }
  }
  
  static class g
    extends b.f
  {
    public final void f(Object paramObject, View paramView)
    {
      ((AccessibilityNodeInfo)paramObject).setLabelFor(paramView);
    }
  }
  
  static class h
    extends b.g
  {
    public final String F(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).getViewIdResourceName();
    }
  }
  
  static class i
    extends b.h
  {
    public Object a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2)
    {
      return AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean1);
    }
    
    public Object a(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
    {
      return AccessibilityNodeInfo.CollectionInfo.obtain(paramInt1, paramInt2, false);
    }
    
    public final void h(Object paramObject1, Object paramObject2)
    {
      ((AccessibilityNodeInfo)paramObject1).setCollectionInfo((AccessibilityNodeInfo.CollectionInfo)paramObject2);
    }
    
    public final void i(Object paramObject1, Object paramObject2)
    {
      ((AccessibilityNodeInfo)paramObject1).setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo)paramObject2);
    }
    
    public final void j(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setContentInvalid(true);
    }
  }
  
  static class j
    implements b.e
  {
    public boolean A(Object paramObject)
    {
      return false;
    }
    
    public void B(Object paramObject) {}
    
    public int C(Object paramObject)
    {
      return 0;
    }
    
    public boolean D(Object paramObject)
    {
      return false;
    }
    
    public boolean E(Object paramObject)
    {
      return false;
    }
    
    public String F(Object paramObject)
    {
      return null;
    }
    
    public Object a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2)
    {
      return null;
    }
    
    public Object a(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
    {
      return null;
    }
    
    public Object a(int paramInt, CharSequence paramCharSequence)
    {
      return null;
    }
    
    public void a(Object paramObject, Rect paramRect) {}
    
    public void a(Object paramObject, CharSequence paramCharSequence) {}
    
    public void a(Object paramObject, boolean paramBoolean) {}
    
    public void b(Object paramObject, int paramInt) {}
    
    public void b(Object paramObject, Rect paramRect) {}
    
    public void b(Object paramObject, CharSequence paramCharSequence) {}
    
    public void b(Object paramObject, boolean paramBoolean) {}
    
    public void c(Object paramObject, int paramInt) {}
    
    public void c(Object paramObject, Rect paramRect) {}
    
    public void c(Object paramObject, View paramView) {}
    
    public void c(Object paramObject, CharSequence paramCharSequence) {}
    
    public void c(Object paramObject, boolean paramBoolean) {}
    
    public void d(Object paramObject, Rect paramRect) {}
    
    public void d(Object paramObject, View paramView) {}
    
    public void d(Object paramObject, CharSequence paramCharSequence) {}
    
    public void d(Object paramObject, boolean paramBoolean) {}
    
    public void e(Object paramObject, View paramView) {}
    
    public void e(Object paramObject, CharSequence paramCharSequence) {}
    
    public void e(Object paramObject, boolean paramBoolean) {}
    
    public void f(Object paramObject, View paramView) {}
    
    public void f(Object paramObject, boolean paramBoolean) {}
    
    public void g(Object paramObject, boolean paramBoolean) {}
    
    public boolean g(Object paramObject1, Object paramObject2)
    {
      return false;
    }
    
    public void h(Object paramObject1, Object paramObject2) {}
    
    public void h(Object paramObject, boolean paramBoolean) {}
    
    public void i(Object paramObject1, Object paramObject2) {}
    
    public void i(Object paramObject, boolean paramBoolean) {}
    
    public void j(Object paramObject, boolean paramBoolean) {}
    
    public Object l(Object paramObject)
    {
      return null;
    }
    
    public int m(Object paramObject)
    {
      return 0;
    }
    
    public CharSequence n(Object paramObject)
    {
      return null;
    }
    
    public CharSequence o(Object paramObject)
    {
      return null;
    }
    
    public CharSequence p(Object paramObject)
    {
      return null;
    }
    
    public CharSequence q(Object paramObject)
    {
      return null;
    }
    
    public boolean r(Object paramObject)
    {
      return false;
    }
    
    public boolean s(Object paramObject)
    {
      return false;
    }
    
    public boolean t(Object paramObject)
    {
      return false;
    }
    
    public boolean u(Object paramObject)
    {
      return false;
    }
    
    public boolean v(Object paramObject)
    {
      return false;
    }
    
    public boolean w(Object paramObject)
    {
      return false;
    }
    
    public boolean x(Object paramObject)
    {
      return false;
    }
    
    public boolean y(Object paramObject)
    {
      return false;
    }
    
    public boolean z(Object paramObject)
    {
      return false;
    }
  }
  
  public static final class k
  {
    public final Object za;
    
    public k(Object paramObject)
    {
      this.za = paramObject;
    }
  }
  
  public static final class l
  {
    public final Object za;
    
    private l(Object paramObject)
    {
      this.za = paramObject;
    }
    
    public static l a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
    {
      return new l(b.yZ.a(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean, false));
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\view\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */