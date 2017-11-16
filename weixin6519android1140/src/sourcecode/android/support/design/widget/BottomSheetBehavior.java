package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.design.a.i;
import android.support.v4.view.o;
import android.support.v4.view.p;
import android.support.v4.view.y;
import android.support.v4.view.z;
import android.support.v4.widget.u;
import android.support.v4.widget.u.a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public class BottomSheetBehavior<V extends View>
  extends CoordinatorLayout.Behavior<V>
{
  public int eA;
  private int eB;
  public boolean eC;
  private final u.a eD = new u.a()
  {
    public final int K()
    {
      if (BottomSheetBehavior.this.eq) {
        return BottomSheetBehavior.this.ev - BottomSheetBehavior.this.eo;
      }
      return BottomSheetBehavior.this.ep - BottomSheetBehavior.this.eo;
    }
    
    public final void a(View paramAnonymousView, float paramAnonymousFloat1, float paramAnonymousFloat2)
    {
      int j = 3;
      int i;
      if (paramAnonymousFloat2 < 0.0F) {
        i = BottomSheetBehavior.this.eo;
      }
      while (BottomSheetBehavior.this.er.p(paramAnonymousView.getLeft(), i))
      {
        BottomSheetBehavior.this.h(2);
        z.a(paramAnonymousView, new BottomSheetBehavior.b(BottomSheetBehavior.this, paramAnonymousView, j));
        return;
        if ((BottomSheetBehavior.this.eq) && (BottomSheetBehavior.this.a(paramAnonymousView, paramAnonymousFloat2)))
        {
          i = BottomSheetBehavior.this.ev;
          j = 5;
        }
        else if (paramAnonymousFloat2 == 0.0F)
        {
          i = paramAnonymousView.getTop();
          if (Math.abs(i - BottomSheetBehavior.this.eo) < Math.abs(i - BottomSheetBehavior.this.ep))
          {
            i = BottomSheetBehavior.this.eo;
          }
          else
          {
            i = BottomSheetBehavior.this.ep;
            j = 4;
          }
        }
        else
        {
          i = BottomSheetBehavior.this.ep;
          j = 4;
        }
      }
      BottomSheetBehavior.this.h(j);
    }
    
    public final void a(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      BottomSheetBehavior.this.i(paramAnonymousInt2);
    }
    
    public final boolean b(View paramAnonymousView, int paramAnonymousInt)
    {
      if (BottomSheetBehavior.this.mState == 1) {
        return false;
      }
      if (BottomSheetBehavior.this.eC) {
        return false;
      }
      if ((BottomSheetBehavior.this.mState == 3) && (BottomSheetBehavior.this.eA == paramAnonymousInt))
      {
        View localView = (View)BottomSheetBehavior.this.ex.get();
        if ((localView != null) && (z.h(localView, -1))) {
          return false;
        }
      }
      return (BottomSheetBehavior.this.ew != null) && (BottomSheetBehavior.this.ew.get() == paramAnonymousView);
    }
    
    public final int c(View paramAnonymousView, int paramAnonymousInt)
    {
      int j = BottomSheetBehavior.this.eo;
      if (BottomSheetBehavior.this.eq) {}
      for (int i = BottomSheetBehavior.this.ev;; i = BottomSheetBehavior.this.ep) {
        return n.b(paramAnonymousInt, j, i);
      }
    }
    
    public final int d(View paramAnonymousView, int paramAnonymousInt)
    {
      return paramAnonymousView.getLeft();
    }
    
    public final void j(int paramAnonymousInt)
    {
      if (paramAnonymousInt == 1) {
        BottomSheetBehavior.this.h(1);
      }
    }
  };
  private float em;
  private int en;
  public int eo;
  public int ep;
  public boolean eq;
  public u er;
  private boolean es;
  private int et;
  private boolean eu;
  public int ev;
  public WeakReference<V> ew;
  public WeakReference<View> ex;
  public a ey;
  private VelocityTracker ez;
  public int mState = 4;
  
  public BottomSheetBehavior() {}
  
  public BottomSheetBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.i.bc);
    g(paramAttributeSet.getDimensionPixelSize(a.i.be, 0));
    this.eq = paramAttributeSet.getBoolean(a.i.bd, false);
    paramAttributeSet.recycle();
    this.em = ViewConfiguration.get(paramContext).getScaledMaximumFlingVelocity();
  }
  
  private View h(View paramView)
  {
    if ((paramView instanceof p)) {
      return paramView;
    }
    if ((paramView instanceof ViewGroup))
    {
      paramView = (ViewGroup)paramView;
      int j = paramView.getChildCount();
      int i = 0;
      while (i < j)
      {
        View localView = h(paramView.getChildAt(i));
        if (localView != null) {
          return localView;
        }
        i += 1;
      }
    }
    return null;
  }
  
  public static <V extends View> BottomSheetBehavior<V> i(V paramV)
  {
    paramV = paramV.getLayoutParams();
    if (!(paramV instanceof CoordinatorLayout.d)) {
      throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }
    paramV = ((CoordinatorLayout.d)paramV).gJ;
    if (!(paramV instanceof BottomSheetBehavior)) {
      throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }
    return (BottomSheetBehavior)paramV;
  }
  
  private void reset()
  {
    this.eA = -1;
    if (this.ez != null)
    {
      this.ez.recycle();
      this.ez = null;
    }
  }
  
  public final void a(CoordinatorLayout paramCoordinatorLayout, V paramV, Parcelable paramParcelable)
  {
    paramParcelable = (SavedState)paramParcelable;
    super.a(paramCoordinatorLayout, paramV, paramParcelable.getSuperState());
    if ((paramParcelable.state == 1) || (paramParcelable.state == 2))
    {
      this.mState = 4;
      return;
    }
    this.mState = paramParcelable.state;
  }
  
  public final void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView)
  {
    int j = 3;
    if (paramV.getTop() == this.eo) {
      h(3);
    }
    while ((paramView != this.ex.get()) || (!this.eu)) {
      return;
    }
    int i;
    if (this.et > 0)
    {
      i = this.eo;
      if (!this.er.e(paramV, paramV.getLeft(), i)) {
        break label215;
      }
      h(2);
      z.a(paramV, new b(paramV, j));
    }
    for (;;)
    {
      this.eu = false;
      return;
      if (this.eq)
      {
        this.ez.computeCurrentVelocity(1000, this.em);
        if (a(paramV, y.b(this.ez, this.eA)))
        {
          i = this.ev;
          j = 5;
          break;
        }
      }
      if (this.et == 0)
      {
        i = paramV.getTop();
        if (Math.abs(i - this.eo) < Math.abs(i - this.ep))
        {
          i = this.eo;
          break;
        }
        i = this.ep;
        j = 4;
        break;
      }
      i = this.ep;
      j = 4;
      break;
      label215:
      h(j);
    }
  }
  
  public final void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt, int[] paramArrayOfInt)
  {
    if (paramView != (View)this.ex.get()) {
      return;
    }
    int i = paramV.getTop();
    int j = i - paramInt;
    if (paramInt > 0) {
      if (j < this.eo)
      {
        paramArrayOfInt[1] = (i - this.eo);
        z.j(paramV, -paramArrayOfInt[1]);
        h(3);
      }
    }
    for (;;)
    {
      i(paramV.getTop());
      this.et = paramInt;
      this.eu = true;
      return;
      paramArrayOfInt[1] = paramInt;
      z.j(paramV, -paramInt);
      h(1);
      continue;
      if ((paramInt < 0) && (!z.h(paramView, -1))) {
        if ((j <= this.ep) || (this.eq))
        {
          paramArrayOfInt[1] = paramInt;
          z.j(paramV, -paramInt);
          h(1);
        }
        else
        {
          paramArrayOfInt[1] = (i - this.ep);
          z.j(paramV, -paramArrayOfInt[1]);
          h(4);
        }
      }
    }
  }
  
  public final boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt)
  {
    if ((this.mState != 1) && (this.mState != 2))
    {
      if ((z.aa(paramCoordinatorLayout)) && (!z.aa(paramV))) {
        z.a(paramV, true);
      }
      paramCoordinatorLayout.e(paramV, paramInt);
    }
    this.ev = paramCoordinatorLayout.getHeight();
    this.eo = Math.max(0, this.ev - paramV.getHeight());
    this.ep = Math.max(this.ev - this.en, this.eo);
    if (this.mState == 3) {
      z.j(paramV, this.eo);
    }
    for (;;)
    {
      if (this.er == null) {
        this.er = u.a(paramCoordinatorLayout, this.eD);
      }
      this.ew = new WeakReference(paramV);
      this.ex = new WeakReference(h(paramV));
      return true;
      if ((this.eq) && (this.mState == 5)) {
        z.j(paramV, this.ev);
      } else if (this.mState == 4) {
        z.j(paramV, this.ep);
      }
    }
  }
  
  public final boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    if (!paramV.isShown()) {}
    int i;
    do
    {
      return false;
      i = o.d(paramMotionEvent);
      if (i == 0) {
        reset();
      }
      if (this.ez == null) {
        this.ez = VelocityTracker.obtain();
      }
      this.ez.addMovement(paramMotionEvent);
      switch (i)
      {
      }
      while ((!this.es) && (this.er.j(paramMotionEvent)))
      {
        return true;
        this.eC = false;
        this.eA = -1;
        if (this.es)
        {
          this.es = false;
          return false;
          int j = (int)paramMotionEvent.getX();
          this.eB = ((int)paramMotionEvent.getY());
          View localView = (View)this.ex.get();
          if ((localView != null) && (paramCoordinatorLayout.b(localView, j, this.eB)))
          {
            this.eA = paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex());
            this.eC = true;
          }
          if ((this.eA == -1) && (!paramCoordinatorLayout.b(paramV, j, this.eB))) {}
          for (boolean bool = true;; bool = false)
          {
            this.es = bool;
            break;
          }
        }
      }
      paramV = (View)this.ex.get();
    } while ((i != 2) || (paramV == null) || (this.es) || (this.mState == 1) || (paramCoordinatorLayout.b(paramV, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())) || (Math.abs(this.eB - paramMotionEvent.getY()) <= this.er.hQ));
    return true;
  }
  
  public final boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, float paramFloat1, float paramFloat2)
  {
    return (paramView == this.ex.get()) && ((this.mState != 3) || (super.a(paramCoordinatorLayout, paramV, paramView, paramFloat1, paramFloat2)));
  }
  
  public final boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt)
  {
    boolean bool = false;
    this.et = 0;
    this.eu = false;
    if ((paramInt & 0x2) != 0) {
      bool = true;
    }
    return bool;
  }
  
  public final boolean a(View paramView, float paramFloat)
  {
    if (paramView.getTop() < this.ep) {}
    while (Math.abs(paramView.getTop() + 0.1F * paramFloat - this.ep) / this.en <= 0.5F) {
      return false;
    }
    return true;
  }
  
  public final Parcelable b(CoordinatorLayout paramCoordinatorLayout, V paramV)
  {
    return new SavedState(super.b(paramCoordinatorLayout, paramV), this.mState);
  }
  
  public final boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    boolean bool2 = true;
    boolean bool1;
    if (!paramV.isShown()) {
      bool1 = false;
    }
    do
    {
      do
      {
        int i;
        do
        {
          do
          {
            return bool1;
            i = o.d(paramMotionEvent);
            if (this.mState != 1) {
              break;
            }
            bool1 = bool2;
          } while (i == 0);
          this.er.k(paramMotionEvent);
          if (i == 0) {
            reset();
          }
          if (this.ez == null) {
            this.ez = VelocityTracker.obtain();
          }
          this.ez.addMovement(paramMotionEvent);
          bool1 = bool2;
        } while (i != 2);
        bool1 = bool2;
      } while (this.es);
      bool1 = bool2;
    } while (Math.abs(this.eB - paramMotionEvent.getY()) <= this.er.hQ);
    this.er.n(paramV, paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex()));
    return true;
  }
  
  public final void g(int paramInt)
  {
    this.en = Math.max(0, paramInt);
    this.ep = (this.ev - paramInt);
  }
  
  public final void h(int paramInt)
  {
    if (this.mState == paramInt) {}
    do
    {
      return;
      this.mState = paramInt;
    } while (((View)this.ew.get() == null) || (this.ey == null));
    this.ey.k(paramInt);
  }
  
  public final void i(int paramInt)
  {
    if (((View)this.ew.get() != null) && (this.ey != null))
    {
      if (paramInt > this.ep) {
        this.ey.d((this.ep - paramInt) / this.en);
      }
    }
    else {
      return;
    }
    this.ey.d((this.ep - paramInt) / (this.ep - this.eo));
  }
  
  protected static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator() {};
    final int state;
    
    public SavedState(Parcel paramParcel)
    {
      super();
      this.state = paramParcel.readInt();
    }
    
    public SavedState(Parcelable paramParcelable, int paramInt)
    {
      super();
      this.state = paramInt;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.state);
    }
  }
  
  public static abstract class a
  {
    public abstract void d(float paramFloat);
    
    public abstract void k(int paramInt);
  }
  
  private final class b
    implements Runnable
  {
    private final int eF;
    private final View mView;
    
    public b(View paramView, int paramInt)
    {
      this.mView = paramView;
      this.eF = paramInt;
    }
    
    public final void run()
    {
      if ((BottomSheetBehavior.this.er != null) && (BottomSheetBehavior.this.er.cG()))
      {
        z.a(this.mView, this);
        return;
      }
      BottomSheetBehavior.this.h(this.eF);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\BottomSheetBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */