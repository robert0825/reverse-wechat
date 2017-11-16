package android.support.v4.app;

import android.os.Parcelable;
import android.support.v4.view.u;
import android.view.View;
import android.view.ViewGroup;

public abstract class n
  extends u
{
  private final l qg;
  private p qh = null;
  private Fragment qi = null;
  
  public n(l paraml)
  {
    this.qg = paraml;
  }
  
  private static String b(int paramInt, long paramLong)
  {
    return "android:switcher:" + paramInt + ":" + paramLong;
  }
  
  public abstract Fragment I(int paramInt);
  
  public final void a(Parcelable paramParcelable, ClassLoader paramClassLoader) {}
  
  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    if (this.qh == null) {
      this.qh = this.qg.aV();
    }
    this.qh.b((Fragment)paramObject);
  }
  
  public final boolean a(View paramView, Object paramObject)
  {
    return ((Fragment)paramObject).mView == paramView;
  }
  
  public final Object b(ViewGroup paramViewGroup, int paramInt)
  {
    if (this.qh == null) {
      this.qh = this.qg.aV();
    }
    long l = paramInt;
    Object localObject = b(paramViewGroup.getId(), l);
    localObject = this.qg.l((String)localObject);
    if (localObject != null) {
      this.qh.c((Fragment)localObject);
    }
    for (paramViewGroup = (ViewGroup)localObject;; paramViewGroup = (ViewGroup)localObject)
    {
      if (paramViewGroup != this.qi)
      {
        paramViewGroup.setMenuVisibility(false);
        paramViewGroup.setUserVisibleHint(false);
      }
      return paramViewGroup;
      localObject = I(paramInt);
      this.qh.a(paramViewGroup.getId(), (Fragment)localObject, b(paramViewGroup.getId(), l));
    }
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
    return null;
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\android\support\v4\app\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */