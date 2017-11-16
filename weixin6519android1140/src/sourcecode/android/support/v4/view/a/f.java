package android.support.v4.view.a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityRecord;

public final class f
{
  public static final c zG = new e();
  public final Object zH;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      zG = new d();
      return;
    }
    if (Build.VERSION.SDK_INT >= 15)
    {
      zG = new b();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      zG = new a();
      return;
    }
  }
  
  public f(Object paramObject)
  {
    this.zH = paramObject;
  }
  
  public static f cg()
  {
    return new f(zG.ch());
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
        paramObject = (f)paramObject;
        if (this.zH != null) {
          break;
        }
      } while (((f)paramObject).zH == null);
      return false;
    } while (this.zH.equals(((f)paramObject).zH));
    return false;
  }
  
  public final int hashCode()
  {
    if (this.zH == null) {
      return 0;
    }
    return this.zH.hashCode();
  }
  
  public final void setFromIndex(int paramInt)
  {
    zG.d(this.zH, paramInt);
  }
  
  public final void setItemCount(int paramInt)
  {
    zG.e(this.zH, paramInt);
  }
  
  public final void setScrollable(boolean paramBoolean)
  {
    zG.f(this.zH, paramBoolean);
  }
  
  public final void setToIndex(int paramInt)
  {
    zG.h(this.zH, paramInt);
  }
  
  static class a
    extends f.e
  {
    public final Object ch()
    {
      return AccessibilityRecord.obtain();
    }
    
    public final void d(Object paramObject, int paramInt)
    {
      ((AccessibilityRecord)paramObject).setFromIndex(paramInt);
    }
    
    public final void e(Object paramObject, int paramInt)
    {
      ((AccessibilityRecord)paramObject).setItemCount(paramInt);
    }
    
    public final void f(Object paramObject, int paramInt)
    {
      ((AccessibilityRecord)paramObject).setScrollX(paramInt);
    }
    
    public final void f(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityRecord)paramObject).setScrollable(paramBoolean);
    }
    
    public final void g(Object paramObject, int paramInt)
    {
      ((AccessibilityRecord)paramObject).setScrollY(paramInt);
    }
    
    public final void h(Object paramObject, int paramInt)
    {
      ((AccessibilityRecord)paramObject).setToIndex(paramInt);
    }
  }
  
  static class b
    extends f.a
  {
    public final void i(Object paramObject, int paramInt)
    {
      ((AccessibilityRecord)paramObject).setMaxScrollX(paramInt);
    }
    
    public final void j(Object paramObject, int paramInt)
    {
      ((AccessibilityRecord)paramObject).setMaxScrollY(paramInt);
    }
  }
  
  public static abstract interface c
  {
    public abstract Object ch();
    
    public abstract void d(Object paramObject, int paramInt);
    
    public abstract void e(Object paramObject, int paramInt);
    
    public abstract void f(Object paramObject, int paramInt);
    
    public abstract void f(Object paramObject, boolean paramBoolean);
    
    public abstract void g(Object paramObject, int paramInt);
    
    public abstract void h(Object paramObject, int paramInt);
    
    public abstract void i(Object paramObject, int paramInt);
    
    public abstract void j(Object paramObject, int paramInt);
  }
  
  static final class d
    extends f.b
  {}
  
  static class e
    implements f.c
  {
    public Object ch()
    {
      return null;
    }
    
    public void d(Object paramObject, int paramInt) {}
    
    public void e(Object paramObject, int paramInt) {}
    
    public void f(Object paramObject, int paramInt) {}
    
    public void f(Object paramObject, boolean paramBoolean) {}
    
    public void g(Object paramObject, int paramInt) {}
    
    public void h(Object paramObject, int paramInt) {}
    
    public void i(Object paramObject, int paramInt) {}
    
    public void j(Object paramObject, int paramInt) {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\view\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */