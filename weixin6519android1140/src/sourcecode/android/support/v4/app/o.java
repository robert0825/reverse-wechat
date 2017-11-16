package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.u;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class o
  extends u
{
  private final l qg;
  private p qh = null;
  private Fragment qi = null;
  private ArrayList<Fragment.SavedState> ql = new ArrayList();
  private ArrayList<Fragment> qm = new ArrayList();
  
  public o(l paraml)
  {
    this.qg = paraml;
  }
  
  public abstract Fragment I(int paramInt);
  
  public final void a(Parcelable paramParcelable, ClassLoader paramClassLoader)
  {
    if (paramParcelable != null)
    {
      paramParcelable = (Bundle)paramParcelable;
      paramParcelable.setClassLoader(paramClassLoader);
      paramClassLoader = paramParcelable.getParcelableArray("states");
      this.ql.clear();
      this.qm.clear();
      int i;
      if (paramClassLoader != null)
      {
        i = 0;
        while (i < paramClassLoader.length)
        {
          this.ql.add((Fragment.SavedState)paramClassLoader[i]);
          i += 1;
        }
      }
      paramClassLoader = paramParcelable.keySet().iterator();
      while (paramClassLoader.hasNext())
      {
        Object localObject = (String)paramClassLoader.next();
        if (((String)localObject).startsWith("f"))
        {
          i = Integer.parseInt(((String)localObject).substring(1));
          localObject = this.qg.c(paramParcelable, (String)localObject);
          if (localObject != null)
          {
            while (this.qm.size() <= i) {
              this.qm.add(null);
            }
            ((Fragment)localObject).setMenuVisibility(false);
            this.qm.set(i, localObject);
          }
        }
      }
    }
  }
  
  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramObject = (Fragment)paramObject;
    if (this.qh == null) {
      this.qh = this.qg.aV();
    }
    while (this.ql.size() <= paramInt) {
      this.ql.add(null);
    }
    ArrayList localArrayList = this.ql;
    if (((Fragment)paramObject).isAdded()) {}
    for (paramViewGroup = this.qg.e((Fragment)paramObject);; paramViewGroup = null)
    {
      localArrayList.set(paramInt, paramViewGroup);
      this.qm.set(paramInt, null);
      this.qh.a((Fragment)paramObject);
      return;
    }
  }
  
  public final boolean a(View paramView, Object paramObject)
  {
    return ((Fragment)paramObject).mView == paramView;
  }
  
  public final Object b(ViewGroup paramViewGroup, int paramInt)
  {
    if (this.qm.size() > paramInt)
    {
      localObject = (Fragment)this.qm.get(paramInt);
      if (localObject != null) {
        return localObject;
      }
    }
    if (this.qh == null) {
      this.qh = this.qg.aV();
    }
    Fragment localFragment = I(paramInt);
    if (this.ql.size() > paramInt)
    {
      localObject = (Fragment.SavedState)this.ql.get(paramInt);
      if (localObject != null)
      {
        if (localFragment.mIndex >= 0) {
          throw new IllegalStateException("Fragment already active");
        }
        if ((localObject == null) || (((Fragment.SavedState)localObject).pc == null)) {
          break label144;
        }
      }
    }
    label144:
    for (Object localObject = ((Fragment.SavedState)localObject).pc;; localObject = null)
    {
      localFragment.oi = ((Bundle)localObject);
      while (this.qm.size() <= paramInt) {
        this.qm.add(null);
      }
    }
    localFragment.setMenuVisibility(false);
    localFragment.setUserVisibleHint(false);
    this.qm.set(paramInt, localFragment);
    this.qh.a(paramViewGroup.getId(), localFragment);
    return localFragment;
  }
  
  public final void ba()
  {
    if (this.qh != null)
    {
      this.qh.commitAllowingStateLoss();
      this.qh = null;
      this.qg.executePendingTransactions();
    }
  }
  
  public final Parcelable bb()
  {
    Object localObject1 = null;
    Object localObject2;
    if (this.ql.size() > 0)
    {
      localObject1 = new Bundle();
      localObject2 = new Fragment.SavedState[this.ql.size()];
      this.ql.toArray((Object[])localObject2);
      ((Bundle)localObject1).putParcelableArray("states", (Parcelable[])localObject2);
    }
    int i = 0;
    while (i < this.qm.size())
    {
      Fragment localFragment = (Fragment)this.qm.get(i);
      localObject2 = localObject1;
      if (localFragment != null)
      {
        localObject2 = localObject1;
        if (localFragment.isAdded())
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = new Bundle();
          }
          localObject1 = "f" + i;
          this.qg.a((Bundle)localObject2, (String)localObject1, localFragment);
        }
      }
      i += 1;
      localObject1 = localObject2;
    }
    return (Parcelable)localObject1;
  }
  
  public final void d(Object paramObject)
  {
    paramObject = (Fragment)paramObject;
    if (paramObject != this.qi)
    {
      if (this.qi != null)
      {
        this.qi.setMenuVisibility(false);
        this.qi.setUserVisibleHint(false);
      }
      if (paramObject != null)
      {
        ((Fragment)paramObject).setMenuVisibility(true);
        ((Fragment)paramObject).setUserVisibleHint(true);
      }
      this.qi = ((Fragment)paramObject);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\app\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */