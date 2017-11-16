package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.design.a.h;
import android.support.design.a.i;
import android.support.v4.os.b;
import android.support.v4.os.c;
import android.support.v4.view.ap;
import android.support.v4.view.f;
import android.support.v4.view.o;
import android.support.v4.view.r;
import android.support.v4.view.s;
import android.support.v4.view.z;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout
  extends ViewGroup
  implements r
{
  static final String gj;
  static final Class<?>[] gk;
  static final ThreadLocal<Map<String, Constructor<Behavior>>> gl;
  static final Comparator<View> gn;
  static final g go;
  private ap dS;
  private View gA;
  private View gB;
  private e gC;
  private boolean gD;
  private boolean gE;
  private Drawable gF;
  private ViewGroup.OnHierarchyChangeListener gG;
  private final s gH = new s(this);
  final Comparator<View> gm = new Comparator() {};
  final List<View> gp = new ArrayList();
  private final List<View> gq = new ArrayList();
  private final List<View> gr = new ArrayList();
  final Rect gs = new Rect();
  final Rect gt = new Rect();
  private final Rect gu = new Rect();
  private final int[] gv = new int[2];
  private boolean gw;
  private boolean gx;
  private int[] gy;
  private View gz;
  
  static
  {
    Object localObject = CoordinatorLayout.class.getPackage();
    if (localObject != null)
    {
      localObject = ((Package)localObject).getName();
      gj = (String)localObject;
      if (Build.VERSION.SDK_INT < 21) {
        break label80;
      }
      gn = new f();
    }
    for (go = new h();; go = null)
    {
      gk = new Class[] { Context.class, AttributeSet.class };
      gl = new ThreadLocal();
      return;
      localObject = null;
      break;
      label80:
      gn = null;
    }
  }
  
  public CoordinatorLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public CoordinatorLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    t.d(paramContext);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.i.by, paramInt, a.h.aP);
    paramInt = paramAttributeSet.getResourceId(a.i.bF, 0);
    if (paramInt != 0)
    {
      paramContext = paramContext.getResources();
      this.gy = paramContext.getIntArray(paramInt);
      float f = paramContext.getDisplayMetrics().density;
      int j = this.gy.length;
      paramInt = i;
      while (paramInt < j)
      {
        paramContext = this.gy;
        paramContext[paramInt] = ((int)(paramContext[paramInt] * f));
        paramInt += 1;
      }
    }
    this.gF = paramAttributeSet.getDrawable(a.i.bG);
    paramAttributeSet.recycle();
    if (go != null) {
      go.a(this, new a());
    }
    super.setOnHierarchyChangeListener(new c());
  }
  
  private void R()
  {
    if (this.gz != null)
    {
      Behavior localBehavior = ((d)this.gz.getLayoutParams()).gJ;
      if (localBehavior != null)
      {
        long l = SystemClock.uptimeMillis();
        MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        localBehavior.b(this, this.gz, localMotionEvent);
        localMotionEvent.recycle();
      }
      this.gz = null;
    }
    int j = getChildCount();
    int i = 0;
    while (i < j)
    {
      ((d)getChildAt(i).getLayoutParams()).gQ = false;
      i += 1;
    }
    this.gw = false;
  }
  
  private void S()
  {
    int k = getChildCount();
    int j = 0;
    View localView1;
    d locald;
    int i;
    if (j < k)
    {
      localView1 = getChildAt(j);
      locald = (d)localView1.getLayoutParams();
      if (locald.gO != null)
      {
        i = 1;
        label39:
        if (i == 0) {
          break label161;
        }
      }
    }
    for (int n = 1;; n = 0)
    {
      if (n != this.gD)
      {
        if (n != 0)
        {
          if (this.gx)
          {
            if (this.gC == null) {
              this.gC = new e();
            }
            getViewTreeObserver().addOnPreDrawListener(this.gC);
          }
          this.gD = true;
        }
      }
      else
      {
        return;
        int m = getChildCount();
        i = 0;
        for (;;)
        {
          if (i >= m) {
            break label156;
          }
          View localView2 = getChildAt(i);
          if ((localView2 != localView1) && (locald.c(this, localView1, localView2)))
          {
            i = 1;
            break;
          }
          i += 1;
        }
        label156:
        i = 0;
        break label39;
        label161:
        j += 1;
        break;
      }
      if ((this.gx) && (this.gC != null)) {
        getViewTreeObserver().removeOnPreDrawListener(this.gC);
      }
      this.gD = false;
      return;
    }
  }
  
  static Behavior a(Context paramContext, AttributeSet paramAttributeSet, String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    String str;
    if (paramString.startsWith(".")) {
      str = paramContext.getPackageName() + paramString;
    }
    label225:
    for (;;)
    {
      try
      {
        paramString = (Map)gl.get();
        if (paramString != null) {
          break label225;
        }
        paramString = new HashMap();
        gl.set(paramString);
        Constructor localConstructor2 = (Constructor)paramString.get(str);
        Constructor localConstructor1 = localConstructor2;
        if (localConstructor2 == null)
        {
          localConstructor1 = Class.forName(str, true, paramContext.getClassLoader()).getConstructor(gk);
          localConstructor1.setAccessible(true);
          paramString.put(str, localConstructor1);
        }
        paramContext = (Behavior)localConstructor1.newInstance(new Object[] { paramContext, paramAttributeSet });
        return paramContext;
      }
      catch (Exception paramContext)
      {
        throw new RuntimeException("Could not inflate Behavior subclass " + str, paramContext);
      }
      str = paramString;
      if (paramString.indexOf('.') < 0)
      {
        str = paramString;
        if (!TextUtils.isEmpty(gj)) {
          str = gj + '.' + paramString;
        }
      }
    }
  }
  
  private void a(View paramView, int paramInt, Rect paramRect1, Rect paramRect2)
  {
    d locald = (d)paramView.getLayoutParams();
    int j = locald.gravity;
    int i = j;
    if (j == 0) {
      i = 17;
    }
    int n = f.getAbsoluteGravity(i, paramInt);
    i = f.getAbsoluteGravity(t(locald.gL), paramInt);
    int k = paramView.getMeasuredWidth();
    int m = paramView.getMeasuredHeight();
    switch (i & 0x7)
    {
    default: 
      paramInt = paramRect1.left;
      switch (i & 0x70)
      {
      default: 
        i = paramRect1.top;
        label138:
        j = paramInt;
        switch (n & 0x7)
        {
        default: 
          j = paramInt - k;
        case 5: 
          label178:
          paramInt = i;
          switch (n & 0x70)
          {
          }
          break;
        }
        break;
      }
      break;
    }
    for (paramInt = i - m;; paramInt = i - m / 2)
    {
      n = getWidth();
      i = getHeight();
      j = Math.max(getPaddingLeft() + locald.leftMargin, Math.min(j, n - getPaddingRight() - k - locald.rightMargin));
      paramInt = Math.max(getPaddingTop() + locald.topMargin, Math.min(paramInt, i - getPaddingBottom() - m - locald.bottomMargin));
      paramRect2.set(j, paramInt, j + k, paramInt + m);
      return;
      paramInt = paramRect1.right;
      break;
      paramInt = paramRect1.left;
      paramInt = paramRect1.width() / 2 + paramInt;
      break;
      i = paramRect1.bottom;
      break label138;
      i = paramRect1.top + paramRect1.height() / 2;
      break label138;
      j = paramInt - k / 2;
      break label178;
    }
  }
  
  private static void a(List<View> paramList, Comparator<View> paramComparator)
  {
    if ((paramList == null) || (paramList.size() < 2)) {}
    for (;;)
    {
      return;
      View[] arrayOfView = new View[paramList.size()];
      paramList.toArray(arrayOfView);
      int n = arrayOfView.length;
      int i = 0;
      while (i < n)
      {
        int j = i + 1;
        int m;
        for (int k = i; j < n; k = m)
        {
          m = k;
          if (paramComparator.compare(arrayOfView[j], arrayOfView[k]) < 0) {
            m = j;
          }
          j += 1;
        }
        if (i != k)
        {
          View localView = arrayOfView[k];
          arrayOfView[k] = arrayOfView[i];
          arrayOfView[i] = localView;
        }
        i += 1;
      }
      paramList.clear();
      i = 0;
      while (i < n)
      {
        paramList.add(arrayOfView[i]);
        i += 1;
      }
    }
  }
  
  private boolean a(MotionEvent paramMotionEvent, int paramInt)
  {
    boolean bool1 = false;
    int k = 0;
    int m = o.d(paramMotionEvent);
    List localList = this.gq;
    localList.clear();
    boolean bool2 = isChildrenDrawingOrderEnabled();
    int n = getChildCount();
    int i = n - 1;
    if (i >= 0)
    {
      if (bool2) {}
      for (j = getChildDrawingOrder(n, i);; j = i)
      {
        localList.add(getChildAt(j));
        i -= 1;
        break;
      }
    }
    if (gn != null) {
      Collections.sort(localList, gn);
    }
    n = localList.size();
    int j = 0;
    MotionEvent localMotionEvent = null;
    i = k;
    View localView;
    d locald;
    Behavior localBehavior;
    if (j < n)
    {
      localView = (View)localList.get(j);
      locald = (d)localView.getLayoutParams();
      localBehavior = locald.gJ;
      if (((bool1) || (i != 0)) && (m != 0))
      {
        if (localBehavior == null) {
          break label456;
        }
        if (localMotionEvent != null) {
          break label453;
        }
        long l = SystemClock.uptimeMillis();
        localMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        label199:
        switch (paramInt)
        {
        }
      }
    }
    label304:
    label359:
    label434:
    label443:
    label453:
    label456:
    for (;;)
    {
      j += 1;
      break;
      localBehavior.a(this, localView, localMotionEvent);
      continue;
      localBehavior.b(this, localView, localMotionEvent);
      continue;
      bool2 = bool1;
      if (!bool1)
      {
        bool2 = bool1;
        if (localBehavior == null) {}
      }
      switch (paramInt)
      {
      default: 
        bool2 = bool1;
        if (bool1)
        {
          this.gz = localView;
          bool2 = bool1;
        }
        bool1 = bool2;
        if (locald.gJ == null) {
          locald.gQ = false;
        }
        boolean bool3 = locald.gQ;
        if (locald.gQ)
        {
          bool2 = true;
          if ((!bool2) || (bool3)) {
            break label434;
          }
        }
        break;
      }
      for (i = 1;; i = 0)
      {
        if (bool2)
        {
          bool2 = bool1;
          if (i == 0) {
            break label443;
          }
        }
        break;
        bool1 = localBehavior.a(this, localView, paramMotionEvent);
        break label304;
        bool1 = localBehavior.b(this, localView, paramMotionEvent);
        break label304;
        bool2 = locald.gQ | false;
        locald.gQ = bool2;
        break label359;
      }
      bool2 = bool1;
      localList.clear();
      return bool2;
      break label199;
    }
  }
  
  private static d m(View paramView)
  {
    d locald = (d)paramView.getLayoutParams();
    View localView;
    if (!locald.gK)
    {
      Class localClass = paramView.getClass();
      paramView = null;
      for (;;)
      {
        localView = paramView;
        if (localClass == null) {
          break;
        }
        paramView = (b)localClass.getAnnotation(b.class);
        localView = paramView;
        if (paramView != null) {
          break;
        }
        localClass = localClass.getSuperclass();
      }
      if (localView == null) {}
    }
    try
    {
      locald.a((Behavior)localView.value().newInstance());
      locald.gK = true;
      return locald;
    }
    catch (Exception paramView)
    {
      for (;;)
      {
        new StringBuilder("Default behavior class ").append(localView.value().getName()).append(" could not be instantiated. Did you forget a default constructor?");
      }
    }
  }
  
  private int s(int paramInt)
  {
    if (this.gy == null)
    {
      new StringBuilder("No keylines defined for ").append(this).append(" - attempted index lookup ").append(paramInt);
      return 0;
    }
    if ((paramInt < 0) || (paramInt >= this.gy.length))
    {
      new StringBuilder("Keyline index ").append(paramInt).append(" out of range for ").append(this);
      return 0;
    }
    return this.gy[paramInt];
  }
  
  private static int t(int paramInt)
  {
    int i = paramInt;
    if (paramInt == 0) {
      i = 8388659;
    }
    return i;
  }
  
  private static int u(int paramInt)
  {
    int i = paramInt;
    if (paramInt == 0) {
      i = 8388661;
    }
    return i;
  }
  
  public final void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    measureChildWithMargins(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  final void a(View paramView, boolean paramBoolean, Rect paramRect)
  {
    if ((paramView.isLayoutRequested()) || (paramView.getVisibility() == 8))
    {
      paramRect.set(0, 0, 0, 0);
      return;
    }
    if (paramBoolean)
    {
      x.a(this, paramView, paramRect);
      return;
    }
    paramRect.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
  }
  
  public final boolean b(View paramView, int paramInt1, int paramInt2)
  {
    Rect localRect = this.gs;
    x.a(this, paramView, localRect);
    return localRect.contains(paramInt1, paramInt2);
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof d)) && (super.checkLayoutParams(paramLayoutParams));
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    paramView.getLayoutParams();
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    boolean bool2 = false;
    Drawable localDrawable = this.gF;
    boolean bool1 = bool2;
    if (localDrawable != null)
    {
      bool1 = bool2;
      if (localDrawable.isStateful()) {
        bool1 = localDrawable.setState(arrayOfInt) | false;
      }
    }
    if (bool1) {
      invalidate();
    }
  }
  
  public final void e(View paramView, int paramInt)
  {
    Object localObject = (d)paramView.getLayoutParams();
    if ((((d)localObject).gO == null) && (((d)localObject).gN != -1)) {}
    for (int i = 1; i != 0; i = 0) {
      throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }
    if (((d)localObject).gO != null)
    {
      localObject = ((d)localObject).gO;
      paramView.getLayoutParams();
      localRect1 = this.gs;
      localRect2 = this.gt;
      x.a(this, (View)localObject, localRect1);
      a(paramView, paramInt, localRect1, localRect2);
      paramView.layout(localRect2.left, localRect2.top, localRect2.right, localRect2.bottom);
      return;
    }
    if (((d)localObject).gM >= 0)
    {
      int j = ((d)localObject).gM;
      localObject = (d)paramView.getLayoutParams();
      int i2 = f.getAbsoluteGravity(u(((d)localObject).gravity), paramInt);
      int i1 = getWidth();
      int n = getHeight();
      int k = paramView.getMeasuredWidth();
      int m = paramView.getMeasuredHeight();
      i = j;
      if (paramInt == 1) {
        i = i1 - j;
      }
      paramInt = s(i) - k;
      switch (i2 & 0x7)
      {
      default: 
        switch (i2 & 0x70)
        {
        default: 
          i = 0;
        }
        break;
      }
      for (;;)
      {
        paramInt = Math.max(getPaddingLeft() + ((d)localObject).leftMargin, Math.min(paramInt, i1 - getPaddingRight() - k - ((d)localObject).rightMargin));
        i = Math.max(getPaddingTop() + ((d)localObject).topMargin, Math.min(i, n - getPaddingBottom() - m - ((d)localObject).bottomMargin));
        paramView.layout(paramInt, i, paramInt + k, i + m);
        return;
        paramInt += k;
        break;
        paramInt += k / 2;
        break;
        i = m + 0;
        continue;
        i = m / 2 + 0;
      }
    }
    localObject = (d)paramView.getLayoutParams();
    Rect localRect1 = this.gs;
    localRect1.set(getPaddingLeft() + ((d)localObject).leftMargin, getPaddingTop() + ((d)localObject).topMargin, getWidth() - getPaddingRight() - ((d)localObject).rightMargin, getHeight() - getPaddingBottom() - ((d)localObject).bottomMargin);
    if ((this.dS != null) && (z.aa(this)) && (!z.aa(paramView)))
    {
      localRect1.left += this.dS.getSystemWindowInsetLeft();
      localRect1.top += this.dS.getSystemWindowInsetTop();
      localRect1.right -= this.dS.getSystemWindowInsetRight();
      localRect1.bottom -= this.dS.getSystemWindowInsetBottom();
    }
    Rect localRect2 = this.gt;
    f.apply(t(((d)localObject).gravity), paramView.getMeasuredWidth(), paramView.getMeasuredHeight(), localRect1, localRect2, paramInt);
    paramView.layout(localRect2.left, localRect2.top, localRect2.right, localRect2.bottom);
  }
  
  public int getNestedScrollAxes()
  {
    return this.gH.wD;
  }
  
  protected int getSuggestedMinimumHeight()
  {
    return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
  }
  
  protected int getSuggestedMinimumWidth()
  {
    return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
  }
  
  final void i(boolean paramBoolean)
  {
    int k = z.J(this);
    int m = this.gp.size();
    int i = 0;
    while (i < m)
    {
      View localView = (View)this.gp.get(i);
      Object localObject1 = (d)localView.getLayoutParams();
      int j = 0;
      Object localObject3;
      while (j < i)
      {
        localObject2 = (View)this.gp.get(j);
        if (((d)localObject1).gP == localObject2)
        {
          localObject2 = (d)localView.getLayoutParams();
          if (((d)localObject2).gO != null)
          {
            localObject3 = this.gs;
            Rect localRect1 = this.gt;
            Rect localRect2 = this.gu;
            x.a(this, ((d)localObject2).gO, (Rect)localObject3);
            a(localView, false, localRect1);
            a(localView, k, (Rect)localObject3, localRect2);
            int n = localRect2.left - localRect1.left;
            int i1 = localRect2.top - localRect1.top;
            if (n != 0) {
              localView.offsetLeftAndRight(n);
            }
            if (i1 != 0) {
              localView.offsetTopAndBottom(i1);
            }
            if ((n != 0) || (i1 != 0))
            {
              localObject3 = ((d)localObject2).gJ;
              if (localObject3 != null) {
                ((Behavior)localObject3).b(this, localView, ((d)localObject2).gO);
              }
            }
          }
        }
        j += 1;
      }
      localObject1 = this.gs;
      Object localObject2 = this.gt;
      ((Rect)localObject1).set(((d)localView.getLayoutParams()).gT);
      a(localView, true, (Rect)localObject2);
      if (!((Rect)localObject1).equals(localObject2))
      {
        ((d)localView.getLayoutParams()).gT.set((Rect)localObject2);
        j = i + 1;
        if (j < m)
        {
          localObject1 = (View)this.gp.get(j);
          localObject2 = (d)((View)localObject1).getLayoutParams();
          localObject3 = ((d)localObject2).gJ;
          if ((localObject3 != null) && (((Behavior)localObject3).e(localView)))
          {
            if ((paramBoolean) || (!((d)localObject2).gS)) {
              break label388;
            }
            ((d)localObject2).gS = false;
          }
          for (;;)
          {
            j += 1;
            break;
            label388:
            ((Behavior)localObject3).b(this, (View)localObject1, localView);
            if (paramBoolean) {
              ((d)localObject2).gS = false;
            }
          }
        }
      }
      i += 1;
    }
  }
  
  public final List<View> n(View paramView)
  {
    d locald = (d)paramView.getLayoutParams();
    List localList = this.gr;
    localList.clear();
    int j = getChildCount();
    int i = 0;
    while (i < j)
    {
      View localView = getChildAt(i);
      if ((localView != paramView) && (locald.c(this, paramView, localView))) {
        localList.add(localView);
      }
      i += 1;
    }
    return localList;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    R();
    if (this.gD)
    {
      if (this.gC == null) {
        this.gC = new e();
      }
      getViewTreeObserver().addOnPreDrawListener(this.gC);
    }
    if ((this.dS == null) && (z.aa(this))) {
      z.Z(this);
    }
    this.gx = true;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    R();
    if ((this.gD) && (this.gC != null)) {
      getViewTreeObserver().removeOnPreDrawListener(this.gC);
    }
    if (this.gB != null) {
      onStopNestedScroll(this.gB);
    }
    this.gx = false;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.gE) && (this.gF != null)) {
      if (this.dS == null) {
        break label61;
      }
    }
    label61:
    for (int i = this.dS.getSystemWindowInsetTop();; i = 0)
    {
      if (i > 0)
      {
        this.gF.setBounds(0, 0, getWidth(), i);
        this.gF.draw(paramCanvas);
      }
      return;
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = o.d(paramMotionEvent);
    if (i == 0) {
      R();
    }
    boolean bool = a(paramMotionEvent, 0);
    if ((i == 1) || (i == 3)) {
      R();
    }
    return bool;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt2 = z.J(this);
    paramInt3 = this.gp.size();
    paramInt1 = 0;
    while (paramInt1 < paramInt3)
    {
      View localView = (View)this.gp.get(paramInt1);
      Behavior localBehavior = ((d)localView.getLayoutParams()).gJ;
      if ((localBehavior == null) || (!localBehavior.a(this, localView, paramInt2))) {
        e(localView, paramInt2);
      }
      paramInt1 += 1;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    this.gp.clear();
    int k = getChildCount();
    int j = 0;
    Object localObject3;
    int i;
    label165:
    Object localObject2;
    Object localObject1;
    if (j < k)
    {
      localObject3 = getChildAt(j);
      d locald = m((View)localObject3);
      if (locald.gN == -1)
      {
        locald.gP = null;
        locald.gO = null;
      }
      for (;;)
      {
        this.gp.add(localObject3);
        j += 1;
        break;
        if (locald.gO != null)
        {
          if (locald.gO.getId() == locald.gN) {
            break label165;
          }
          i = 0;
        }
        for (;;)
        {
          if (i != 0) {
            break label254;
          }
          locald.gO = findViewById(locald.gN);
          if (locald.gO == null) {
            break label372;
          }
          if (locald.gO != this) {
            break label267;
          }
          if (!isInEditMode()) {
            break label256;
          }
          locald.gP = null;
          locald.gO = null;
          break;
          localObject2 = locald.gO;
          for (localObject1 = locald.gO.getParent();; localObject1 = ((ViewParent)localObject1).getParent())
          {
            if (localObject1 == this) {
              break label244;
            }
            if ((localObject1 == null) || (localObject1 == localObject3))
            {
              locald.gP = null;
              locald.gO = null;
              i = 0;
              break;
            }
            if ((localObject1 instanceof View)) {
              localObject2 = (View)localObject1;
            }
          }
          label244:
          locald.gP = ((View)localObject2);
          i = 1;
        }
        label254:
        continue;
        label256:
        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
        label267:
        localObject2 = locald.gO;
        for (localObject1 = locald.gO.getParent();; localObject1 = ((ViewParent)localObject1).getParent())
        {
          if ((localObject1 == this) || (localObject1 == null)) {
            break label362;
          }
          if (localObject1 == localObject3)
          {
            if (isInEditMode())
            {
              locald.gP = null;
              locald.gO = null;
              break;
            }
            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
          }
          if ((localObject1 instanceof View)) {
            localObject2 = (View)localObject1;
          }
        }
        label362:
        locald.gP = ((View)localObject2);
        continue;
        label372:
        if (!isInEditMode()) {
          break label394;
        }
        locald.gP = null;
        locald.gO = null;
      }
      label394:
      throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(locald.gN) + " to anchor view " + localObject3);
    }
    a(this.gp, this.gm);
    S();
    int i5 = getPaddingLeft();
    int i6 = getPaddingTop();
    int i7 = getPaddingRight();
    int i8 = getPaddingBottom();
    int i9 = z.J(this);
    int i2;
    int i1;
    label548:
    int m;
    int n;
    label565:
    int i3;
    int i4;
    int i15;
    if (i9 == 1)
    {
      j = 1;
      int i10 = View.MeasureSpec.getMode(paramInt1);
      int i11 = View.MeasureSpec.getSize(paramInt1);
      int i12 = View.MeasureSpec.getMode(paramInt2);
      int i13 = View.MeasureSpec.getSize(paramInt2);
      i2 = getSuggestedMinimumWidth();
      i1 = getSuggestedMinimumHeight();
      if ((this.dS == null) || (!z.aa(this))) {
        break label891;
      }
      k = 1;
      int i14 = this.gp.size();
      m = 0;
      n = 0;
      if (m >= i14) {
        break label938;
      }
      localObject1 = (View)this.gp.get(m);
      localObject2 = (d)((View)localObject1).getLayoutParams();
      i3 = 0;
      i = i3;
      if (((d)localObject2).gM >= 0)
      {
        i = i3;
        if (i10 != 0)
        {
          i4 = s(((d)localObject2).gM);
          i15 = f.getAbsoluteGravity(u(((d)localObject2).gravity), i9) & 0x7;
          if (((i15 != 3) || (j != 0)) && ((i15 != 5) || (j == 0))) {
            break label897;
          }
          i = Math.max(0, i11 - i7 - i4);
        }
      }
      label684:
      if ((k == 0) || (z.aa((View)localObject1))) {
        break label966;
      }
      i3 = this.dS.getSystemWindowInsetLeft();
      int i16 = this.dS.getSystemWindowInsetRight();
      i4 = this.dS.getSystemWindowInsetTop();
      i15 = this.dS.getSystemWindowInsetBottom();
      i3 = View.MeasureSpec.makeMeasureSpec(i11 - (i3 + i16), i10);
      i4 = View.MeasureSpec.makeMeasureSpec(i13 - (i4 + i15), i12);
    }
    for (;;)
    {
      localObject3 = ((d)localObject2).gJ;
      if ((localObject3 == null) || (!((Behavior)localObject3).a(this, (View)localObject1, i3, i, i4, 0))) {
        a((View)localObject1, i3, i, i4, 0);
      }
      i2 = Math.max(i2, ((View)localObject1).getMeasuredWidth() + (i5 + i7) + ((d)localObject2).leftMargin + ((d)localObject2).rightMargin);
      i1 = Math.max(i1, ((View)localObject1).getMeasuredHeight() + (i6 + i8) + ((d)localObject2).topMargin + ((d)localObject2).bottomMargin);
      n = z.combineMeasuredStates(n, z.N((View)localObject1));
      m += 1;
      break label565;
      j = 0;
      break;
      label891:
      k = 0;
      break label548;
      label897:
      if ((i15 != 5) || (j != 0))
      {
        i = i3;
        if (i15 != 3) {
          break label684;
        }
        i = i3;
        if (j == 0) {
          break label684;
        }
      }
      i = Math.max(0, i4 - i5);
      break label684;
      label938:
      setMeasuredDimension(z.resolveSizeAndState(i2, paramInt1, 0xFF000000 & n), z.resolveSizeAndState(i1, paramInt2, n << 16));
      return;
      label966:
      i4 = paramInt2;
      i3 = paramInt1;
    }
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    int j = getChildCount();
    int i = 0;
    boolean bool = false;
    if (i < j)
    {
      paramView = getChildAt(i);
      Object localObject = (d)paramView.getLayoutParams();
      if (!((d)localObject).gR) {
        break label92;
      }
      localObject = ((d)localObject).gJ;
      if (localObject == null) {
        break label92;
      }
      bool = ((Behavior)localObject).a(this, paramView, paramFloat2, paramBoolean) | bool;
    }
    label92:
    for (;;)
    {
      i += 1;
      break;
      if (bool) {
        i(true);
      }
      return bool;
    }
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    int j = getChildCount();
    int i = 0;
    boolean bool = false;
    if (i < j)
    {
      View localView = getChildAt(i);
      Object localObject = (d)localView.getLayoutParams();
      if (!((d)localObject).gR) {
        break label85;
      }
      localObject = ((d)localObject).gJ;
      if (localObject == null) {
        break label85;
      }
      bool = ((Behavior)localObject).a(this, localView, paramView, paramFloat1, paramFloat2) | bool;
    }
    label85:
    for (;;)
    {
      i += 1;
      break;
      return bool;
    }
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    int j = 0;
    int i = 0;
    int k = 0;
    int i1 = getChildCount();
    int m = 0;
    label112:
    label129:
    int n;
    if (m < i1)
    {
      View localView = getChildAt(m);
      Object localObject = (d)localView.getLayoutParams();
      if (!((d)localObject).gR) {
        break label220;
      }
      localObject = ((d)localObject).gJ;
      if (localObject == null) {
        break label220;
      }
      int[] arrayOfInt = this.gv;
      this.gv[1] = 0;
      arrayOfInt[0] = 0;
      ((Behavior)localObject).a(this, localView, paramView, paramInt2, this.gv);
      if (paramInt1 > 0)
      {
        j = Math.max(j, this.gv[0]);
        if (paramInt2 <= 0) {
          break label181;
        }
        i = Math.max(i, this.gv[1]);
        n = 1;
        k = i;
        i = n;
      }
    }
    for (;;)
    {
      n = m + 1;
      m = k;
      k = i;
      i = m;
      m = n;
      break;
      j = Math.min(j, this.gv[0]);
      break label112;
      label181:
      i = Math.min(i, this.gv[1]);
      break label129;
      paramArrayOfInt[0] = j;
      paramArrayOfInt[1] = i;
      if (k != 0) {
        i(true);
      }
      return;
      label220:
      n = i;
      i = k;
      k = n;
    }
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt3 = getChildCount();
    paramInt2 = 0;
    paramInt1 = 0;
    if (paramInt2 < paramInt3)
    {
      paramView = getChildAt(paramInt2);
      Object localObject = (d)paramView.getLayoutParams();
      if (!((d)localObject).gR) {
        break label79;
      }
      localObject = ((d)localObject).gJ;
      if (localObject == null) {
        break label79;
      }
      ((Behavior)localObject).b(this, paramView, paramInt4);
      paramInt1 = 1;
    }
    label79:
    for (;;)
    {
      paramInt2 += 1;
      break;
      if (paramInt1 != 0) {
        i(true);
      }
      return;
    }
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    this.gH.wD = paramInt;
    this.gA = paramView1;
    this.gB = paramView2;
    int i = getChildCount();
    paramInt = 0;
    while (paramInt < i)
    {
      getChildAt(paramInt).getLayoutParams();
      paramInt += 1;
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState)) {
      super.onRestoreInstanceState(paramParcelable);
    }
    for (;;)
    {
      return;
      paramParcelable = (SavedState)paramParcelable;
      super.onRestoreInstanceState(paramParcelable.getSuperState());
      paramParcelable = paramParcelable.gV;
      int j = getChildCount();
      int i = 0;
      while (i < j)
      {
        View localView = getChildAt(i);
        int k = localView.getId();
        Behavior localBehavior = m(localView).gJ;
        if ((k != -1) && (localBehavior != null))
        {
          Parcelable localParcelable = (Parcelable)paramParcelable.get(k);
          if (localParcelable != null) {
            localBehavior.a(this, localView, localParcelable);
          }
        }
        i += 1;
      }
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    SparseArray localSparseArray = new SparseArray();
    int j = getChildCount();
    int i = 0;
    while (i < j)
    {
      Object localObject = getChildAt(i);
      int k = ((View)localObject).getId();
      Behavior localBehavior = ((d)((View)localObject).getLayoutParams()).gJ;
      if ((k != -1) && (localBehavior != null))
      {
        localObject = localBehavior.b(this, (View)localObject);
        if (localObject != null) {
          localSparseArray.append(k, localObject);
        }
      }
      i += 1;
    }
    localSavedState.gV = localSparseArray;
    return localSavedState;
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    int j = getChildCount();
    int i = 0;
    boolean bool1 = false;
    if (i < j)
    {
      paramView2 = getChildAt(i);
      d locald = (d)paramView2.getLayoutParams();
      Behavior localBehavior = locald.gJ;
      if (localBehavior != null)
      {
        boolean bool2 = localBehavior.a(this, paramView2, paramView1, paramInt);
        locald.gR = bool2;
        bool1 |= bool2;
      }
      for (;;)
      {
        i += 1;
        break;
        locald.gR = false;
      }
    }
    return bool1;
  }
  
  public void onStopNestedScroll(View paramView)
  {
    this.gH.wD = 0;
    int j = getChildCount();
    int i = 0;
    while (i < j)
    {
      View localView = getChildAt(i);
      d locald = (d)localView.getLayoutParams();
      if (locald.gR)
      {
        Behavior localBehavior = locald.gJ;
        if (localBehavior != null) {
          localBehavior.a(this, localView, paramView);
        }
        locald.gR = false;
        locald.gS = false;
      }
      i += 1;
    }
    this.gA = null;
    this.gB = null;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = o.d(paramMotionEvent);
    boolean bool2;
    if (this.gz == null)
    {
      bool2 = a(paramMotionEvent, 1);
      if (!bool2) {}
    }
    for (;;)
    {
      Behavior localBehavior = ((d)this.gz.getLayoutParams()).gJ;
      boolean bool1;
      if (localBehavior != null) {
        bool1 = localBehavior.b(this, this.gz, paramMotionEvent);
      }
      for (;;)
      {
        if (this.gz == null)
        {
          bool1 |= super.onTouchEvent(paramMotionEvent);
          paramMotionEvent = null;
        }
        for (;;)
        {
          if (paramMotionEvent != null) {
            paramMotionEvent.recycle();
          }
          if ((i == 1) || (i == 3)) {
            R();
          }
          return bool1;
          if (bool2)
          {
            long l = SystemClock.uptimeMillis();
            paramMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
            super.onTouchEvent(paramMotionEvent);
          }
          else
          {
            paramMotionEvent = null;
          }
        }
        bool1 = false;
        continue;
        bool1 = false;
      }
      bool2 = false;
    }
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    if ((paramBoolean) && (!this.gw))
    {
      R();
      this.gw = true;
    }
  }
  
  public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener paramOnHierarchyChangeListener)
  {
    this.gG = paramOnHierarchyChangeListener;
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0) {}
    for (boolean bool = true;; bool = false)
    {
      if ((this.gF != null) && (this.gF.isVisible() != bool)) {
        this.gF.setVisible(bool, false);
      }
      return;
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == this.gF);
  }
  
  public static abstract class Behavior<V extends View>
  {
    public Behavior() {}
    
    public Behavior(Context paramContext, AttributeSet paramAttributeSet) {}
    
    public static ap a(ap paramap)
    {
      return paramap;
    }
    
    public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, Parcelable paramParcelable) {}
    
    public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView) {}
    
    public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt, int[] paramArrayOfInt) {}
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, float paramFloat, boolean paramBoolean)
    {
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt)
    {
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
    {
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, float paramFloat1, float paramFloat2)
    {
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt)
    {
      return false;
    }
    
    public Parcelable b(CoordinatorLayout paramCoordinatorLayout, V paramV)
    {
      return View.BaseSavedState.EMPTY_STATE;
    }
    
    public void b(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt) {}
    
    public boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
    {
      return false;
    }
    
    public boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView)
    {
      return false;
    }
    
    public boolean e(View paramView)
    {
      return false;
    }
  }
  
  protected static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = b.a(new c() {});
    SparseArray<Parcelable> gV;
    
    public SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super();
      int j = paramParcel.readInt();
      int[] arrayOfInt = new int[j];
      paramParcel.readIntArray(arrayOfInt);
      paramParcel = paramParcel.readParcelableArray(paramClassLoader);
      this.gV = new SparseArray(j);
      int i = 0;
      while (i < j)
      {
        this.gV.append(arrayOfInt[i], paramParcel[i]);
        i += 1;
      }
    }
    
    public SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      int j = 0;
      super.writeToParcel(paramParcel, paramInt);
      if (this.gV != null) {}
      int[] arrayOfInt;
      Parcelable[] arrayOfParcelable;
      for (int i = this.gV.size();; i = 0)
      {
        paramParcel.writeInt(i);
        arrayOfInt = new int[i];
        arrayOfParcelable = new Parcelable[i];
        while (j < i)
        {
          arrayOfInt[j] = this.gV.keyAt(j);
          arrayOfParcelable[j] = ((Parcelable)this.gV.valueAt(j));
          j += 1;
        }
      }
      paramParcel.writeIntArray(arrayOfInt);
      paramParcel.writeParcelableArray(arrayOfParcelable, paramInt);
    }
  }
  
  private final class a
    implements android.support.v4.view.t
  {
    public a() {}
    
    public final ap a(View paramView, ap paramap)
    {
      return CoordinatorLayout.a(CoordinatorLayout.this, paramap);
    }
  }
  
  @Retention(RetentionPolicy.RUNTIME)
  public static @interface b
  {
    Class<? extends CoordinatorLayout.Behavior> value();
  }
  
  private final class c
    implements ViewGroup.OnHierarchyChangeListener
  {
    public c() {}
    
    public final void onChildViewAdded(View paramView1, View paramView2)
    {
      if (CoordinatorLayout.a(CoordinatorLayout.this) != null) {
        CoordinatorLayout.a(CoordinatorLayout.this).onChildViewAdded(paramView1, paramView2);
      }
    }
    
    public final void onChildViewRemoved(View paramView1, View paramView2)
    {
      CoordinatorLayout localCoordinatorLayout = CoordinatorLayout.this;
      int k = localCoordinatorLayout.gp.size();
      int j = 0;
      int i = 0;
      if (j < k)
      {
        View localView = (View)localCoordinatorLayout.gp.get(j);
        if (localView == paramView2) {
          i = 1;
        }
        for (;;)
        {
          j += 1;
          break;
          if (i != 0) {
            localView.getLayoutParams();
          }
        }
      }
      if (CoordinatorLayout.a(CoordinatorLayout.this) != null) {
        CoordinatorLayout.a(CoordinatorLayout.this).onChildViewRemoved(paramView1, paramView2);
      }
    }
  }
  
  public static final class d
    extends ViewGroup.MarginLayoutParams
  {
    CoordinatorLayout.Behavior gJ;
    boolean gK = false;
    public int gL = 0;
    public int gM = -1;
    int gN = -1;
    View gO;
    View gP;
    boolean gQ;
    boolean gR;
    boolean gS;
    final Rect gT = new Rect();
    Object gU;
    public int gravity = 0;
    
    public d()
    {
      super(-2);
    }
    
    d(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.i.bz);
      this.gravity = localTypedArray.getInteger(a.i.bA, 0);
      this.gN = localTypedArray.getResourceId(a.i.bB, -1);
      this.gL = localTypedArray.getInteger(a.i.bC, 0);
      this.gM = localTypedArray.getInteger(a.i.bE, -1);
      this.gK = localTypedArray.hasValue(a.i.bD);
      if (this.gK) {
        this.gJ = CoordinatorLayout.a(paramContext, paramAttributeSet, localTypedArray.getString(a.i.bD));
      }
      localTypedArray.recycle();
    }
    
    public d(d paramd)
    {
      super();
    }
    
    public d(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public d(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
    
    public final void a(CoordinatorLayout.Behavior paramBehavior)
    {
      if (this.gJ != paramBehavior)
      {
        this.gJ = paramBehavior;
        this.gU = null;
        this.gK = true;
      }
    }
    
    final boolean c(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
    {
      return (paramView2 == this.gP) || ((this.gJ != null) && (this.gJ.e(paramView2)));
    }
  }
  
  final class e
    implements ViewTreeObserver.OnPreDrawListener
  {
    e() {}
    
    public final boolean onPreDraw()
    {
      CoordinatorLayout.this.i(false);
      return true;
    }
  }
  
  static final class f
    implements Comparator<View>
  {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\CoordinatorLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */