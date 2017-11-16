package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.design.a.b;
import android.support.design.a.f;
import android.support.design.a.h;
import android.support.design.a.i;
import android.support.design.internal.NavigationMenuView;
import android.support.design.internal.ScrimInsetsFrameLayout;
import android.support.design.internal.a;
import android.support.design.internal.b.b;
import android.support.v4.os.c;
import android.support.v4.view.z;
import android.support.v7.view.g;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.f.a;
import android.support.v7.view.menu.l;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class NavigationView
  extends ScrimInsetsFrameLayout
{
  private static final int[] dd = { 16842912 };
  private static final int[] hW = { -16842910 };
  private final a hX;
  private final android.support.design.internal.b hY = new android.support.design.internal.b();
  private a hZ;
  private int ia;
  private MenuInflater ib;
  
  public NavigationView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NavigationView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    t.d(paramContext);
    this.hX = new a(paramContext);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.i.bV, paramInt, a.h.aR);
    setBackgroundDrawable(localTypedArray.getDrawable(a.i.bW));
    if (localTypedArray.hasValue(a.i.bZ)) {
      z.g(this, localTypedArray.getDimensionPixelSize(a.i.bZ, 0));
    }
    z.a(this, localTypedArray.getBoolean(a.i.bX, false));
    this.ia = localTypedArray.getDimensionPixelSize(a.i.bY, 0);
    ColorStateList localColorStateList;
    if (localTypedArray.hasValue(a.i.cc))
    {
      localColorStateList = localTypedArray.getColorStateList(a.i.cc);
      if (!localTypedArray.hasValue(a.i.cd)) {
        break label551;
      }
      paramInt = localTypedArray.getResourceId(a.i.cd, 0);
    }
    for (int i = 1;; i = 0)
    {
      paramAttributeSet = null;
      if (localTypedArray.hasValue(a.i.ce)) {
        paramAttributeSet = localTypedArray.getColorStateList(a.i.ce);
      }
      Object localObject = paramAttributeSet;
      if (i == 0)
      {
        localObject = paramAttributeSet;
        if (paramAttributeSet == null) {
          localObject = v(16842806);
        }
      }
      paramAttributeSet = localTypedArray.getDrawable(a.i.cb);
      this.hX.a(new f.a()
      {
        public final boolean a(f paramAnonymousf, MenuItem paramAnonymousMenuItem)
        {
          return (NavigationView.a(NavigationView.this) != null) && (NavigationView.a(NavigationView.this).af());
        }
        
        public final void b(f paramAnonymousf) {}
      });
      this.hY.mId = 1;
      this.hY.a(paramContext, this.hX);
      this.hY.a(localColorStateList);
      if (i != 0) {
        this.hY.e(paramInt);
      }
      this.hY.b((ColorStateList)localObject);
      this.hY.a(paramAttributeSet);
      this.hX.a(this.hY);
      paramContext = this.hY;
      if (paramContext.dk == null)
      {
        paramContext.dk = ((NavigationMenuView)paramContext.mLayoutInflater.inflate(a.f.aH, this, false));
        if (paramContext.jdField_do == null) {
          paramContext.jdField_do = new b.b(paramContext);
        }
        paramContext.dl = ((LinearLayout)paramContext.mLayoutInflater.inflate(a.f.aE, paramContext.dk, false));
        paramContext.dk.a(paramContext.jdField_do);
      }
      addView((View)paramContext.dk);
      if (localTypedArray.hasValue(a.i.cf))
      {
        paramInt = localTypedArray.getResourceId(a.i.cf, 0);
        this.hY.g(true);
        if (this.ib == null) {
          this.ib = new g(getContext());
        }
        this.ib.inflate(paramInt, this.hX);
        this.hY.g(false);
        this.hY.f(false);
      }
      if (localTypedArray.hasValue(a.i.ca))
      {
        paramInt = localTypedArray.getResourceId(a.i.ca, 0);
        paramContext = this.hY;
        paramAttributeSet = paramContext.mLayoutInflater.inflate(paramInt, paramContext.dl, false);
        paramContext.dl.addView(paramAttributeSet);
        paramContext.dk.setPadding(0, 0, 0, paramContext.dk.getPaddingBottom());
      }
      localTypedArray.recycle();
      return;
      localColorStateList = v(16842808);
      break;
      label551:
      paramInt = 0;
    }
  }
  
  private ColorStateList v(int paramInt)
  {
    Object localObject = new TypedValue();
    if (!getContext().getTheme().resolveAttribute(paramInt, (TypedValue)localObject, true)) {}
    ColorStateList localColorStateList;
    do
    {
      return null;
      localColorStateList = getResources().getColorStateList(((TypedValue)localObject).resourceId);
    } while (!getContext().getTheme().resolveAttribute(a.b.colorPrimary, (TypedValue)localObject, true));
    paramInt = ((TypedValue)localObject).data;
    int i = localColorStateList.getDefaultColor();
    localObject = hW;
    int[] arrayOfInt1 = dd;
    int[] arrayOfInt2 = EMPTY_STATE_SET;
    int j = localColorStateList.getColorForState(hW, i);
    return new ColorStateList(new int[][] { localObject, arrayOfInt1, arrayOfInt2 }, new int[] { j, paramInt, i });
  }
  
  protected final void a(Rect paramRect)
  {
    android.support.design.internal.b localb = this.hY;
    int i = paramRect.top;
    if (localb.dt != i)
    {
      localb.dt = i;
      if (localb.dl.getChildCount() == 0) {
        localb.dk.setPadding(0, localb.dt, 0, localb.dk.getPaddingBottom());
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    switch (View.MeasureSpec.getMode(paramInt1))
    {
    default: 
      i = paramInt1;
    }
    for (;;)
    {
      super.onMeasure(i, paramInt2);
      return;
      i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(paramInt1), this.ia), 1073741824);
      continue;
      i = View.MeasureSpec.makeMeasureSpec(this.ia, 1073741824);
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
      Object localObject1 = (SavedState)paramParcelable;
      super.onRestoreInstanceState(((SavedState)localObject1).getSuperState());
      paramParcelable = this.hX;
      localObject1 = ((SavedState)localObject1).ie.getSparseParcelableArray("android:menu:presenters");
      if ((localObject1 != null) && (!paramParcelable.Ky.isEmpty()))
      {
        Iterator localIterator = paramParcelable.Ky.iterator();
        while (localIterator.hasNext())
        {
          Object localObject2 = (WeakReference)localIterator.next();
          l locall = (l)((WeakReference)localObject2).get();
          if (locall == null)
          {
            paramParcelable.Ky.remove(localObject2);
          }
          else
          {
            int i = locall.getId();
            if (i > 0)
            {
              localObject2 = (Parcelable)((SparseArray)localObject1).get(i);
              if (localObject2 != null) {
                locall.onRestoreInstanceState((Parcelable)localObject2);
              }
            }
          }
        }
      }
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    localSavedState.ie = new Bundle();
    this.hX.dispatchSaveInstanceState(localSavedState.ie);
    return localSavedState;
  }
  
  public static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = android.support.v4.os.b.a(new c() {});
    public Bundle ie;
    
    public SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super();
      this.ie = paramParcel.readBundle(paramClassLoader);
    }
    
    public SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeBundle(this.ie);
    }
  }
  
  public static abstract interface a
  {
    public abstract boolean af();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\NavigationView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */