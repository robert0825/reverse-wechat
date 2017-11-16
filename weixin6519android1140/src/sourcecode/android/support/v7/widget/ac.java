package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.support.v4.view.a.b.e;
import android.support.v4.view.a.b.k;
import android.support.v4.view.z;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public final class ac
  extends a
{
  final RecyclerView Ub;
  final a Vj = new a()
  {
    public final void a(View paramAnonymousView, b paramAnonymousb)
    {
      super.a(paramAnonymousView, paramAnonymousb);
      if ((!ac.this.ga()) && (ac.this.Ub.SW != null)) {
        ac.this.Ub.SW.b(paramAnonymousView, paramAnonymousb);
      }
    }
    
    public final boolean performAccessibilityAction(View paramAnonymousView, int paramAnonymousInt, Bundle paramAnonymousBundle)
    {
      boolean bool2 = false;
      boolean bool1;
      if (super.performAccessibilityAction(paramAnonymousView, paramAnonymousInt, paramAnonymousBundle)) {
        bool1 = true;
      }
      do
      {
        do
        {
          return bool1;
          bool1 = bool2;
        } while (ac.this.ga());
        bool1 = bool2;
      } while (ac.this.Ub.SW == null);
      paramAnonymousView = ac.this.Ub.SW;
      paramAnonymousBundle = paramAnonymousView.Ub.SO;
      paramAnonymousView = paramAnonymousView.Ub.TC;
      return false;
    }
  };
  
  public ac(RecyclerView paramRecyclerView)
  {
    this.Ub = paramRecyclerView;
  }
  
  public final void a(View paramView, b paramb)
  {
    super.a(paramView, paramb);
    paramb.setClassName(RecyclerView.class.getName());
    if ((!ga()) && (this.Ub.SW != null))
    {
      paramView = this.Ub.SW;
      RecyclerView.m localm = paramView.Ub.SO;
      RecyclerView.q localq = paramView.Ub.TC;
      if ((z.h(paramView.Ub, -1)) || (z.g(paramView.Ub, -1)))
      {
        paramb.addAction(8192);
        paramb.setScrollable(true);
      }
      if ((z.h(paramView.Ub, 1)) || (z.g(paramView.Ub, 1)))
      {
        paramb.addAction(4096);
        paramb.setScrollable(true);
      }
      int i = paramView.a(localm, localq);
      int j = paramView.b(localm, localq);
      paramView = new b.k(b.yZ.a(i, j, false, 0));
      b.yZ.h(paramb.za, ((b.k)paramView).za);
    }
  }
  
  public final boolean ga()
  {
    RecyclerView localRecyclerView = this.Ub;
    return (!localRecyclerView.Td) || (localRecyclerView.Tm) || (localRecyclerView.SQ.es());
  }
  
  public final void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(RecyclerView.class.getName());
    if (((paramView instanceof RecyclerView)) && (!ga()))
    {
      paramView = (RecyclerView)paramView;
      if (paramView.SW != null) {
        paramView.SW.onInitializeAccessibilityEvent(paramAccessibilityEvent);
      }
    }
  }
  
  public final boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    boolean bool2 = false;
    boolean bool1;
    if (super.performAccessibilityAction(paramView, paramInt, paramBundle)) {
      bool1 = true;
    }
    int i;
    do
    {
      do
      {
        do
        {
          do
          {
            return bool1;
            bool1 = bool2;
          } while (ga());
          bool1 = bool2;
        } while (this.Ub.SW == null);
        paramView = this.Ub.SW;
        paramBundle = paramView.Ub.SO;
        paramBundle = paramView.Ub.TC;
        bool1 = bool2;
      } while (paramView.Ub == null);
      switch (paramInt)
      {
      default: 
        paramInt = 0;
        i = 0;
        if (i != 0) {
          break label126;
        }
        bool1 = bool2;
      }
    } while (paramInt == 0);
    label126:
    paramView.Ub.scrollBy(paramInt, i);
    return true;
    if (z.h(paramView.Ub, -1)) {}
    for (paramInt = -(paramView.mHeight - paramView.getPaddingTop() - paramView.getPaddingBottom());; paramInt = 0)
    {
      i = paramInt;
      int j;
      if (z.g(paramView.Ub, -1))
      {
        j = -(paramView.mWidth - paramView.getPaddingLeft() - paramView.getPaddingRight());
        i = paramInt;
        paramInt = j;
        break;
        if (!z.h(paramView.Ub, 1)) {
          break label283;
        }
      }
      label283:
      for (paramInt = paramView.mHeight - paramView.getPaddingTop() - paramView.getPaddingBottom();; paramInt = 0)
      {
        i = paramInt;
        if (z.g(paramView.Ub, 1))
        {
          j = paramView.mWidth;
          int k = paramView.getPaddingLeft();
          int m = paramView.getPaddingRight();
          i = paramInt;
          paramInt = j - k - m;
          break;
        }
        paramInt = 0;
        break;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */