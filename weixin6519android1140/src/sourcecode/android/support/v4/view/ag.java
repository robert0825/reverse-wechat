package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;

public final class ag
{
  static final b yJ = new e();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      yJ = new d();
      return;
    }
    if (i >= 19)
    {
      yJ = new c();
      return;
    }
    if (i >= 14)
    {
      yJ = new a();
      return;
    }
  }
  
  public static void a(ViewParent paramViewParent, View paramView)
  {
    yJ.a(paramViewParent, paramView);
  }
  
  public static void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    yJ.a(paramViewParent, paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    yJ.a(paramViewParent, paramView, paramInt1, paramInt2, paramArrayOfInt);
  }
  
  public static boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2)
  {
    return yJ.a(paramViewParent, paramView, paramFloat1, paramFloat2);
  }
  
  public static boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return yJ.a(paramViewParent, paramView, paramFloat1, paramFloat2, paramBoolean);
  }
  
  public static boolean a(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    return yJ.a(paramViewParent, paramView1, paramView2, paramInt);
  }
  
  public static void b(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    yJ.b(paramViewParent, paramView1, paramView2, paramInt);
  }
  
  static class a
    extends ag.e
  {}
  
  static abstract interface b
  {
    public abstract void a(ViewParent paramViewParent, View paramView);
    
    public abstract void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
    
    public abstract void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt);
    
    public abstract boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2);
    
    public abstract boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean);
    
    public abstract boolean a(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt);
    
    public abstract void b(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt);
  }
  
  static class c
    extends ag.a
  {}
  
  static final class d
    extends ag.c
  {
    public final void a(ViewParent paramViewParent, View paramView)
    {
      try
      {
        paramViewParent.onStopNestedScroll(paramView);
        return;
      }
      catch (AbstractMethodError paramView)
      {
        new StringBuilder("ViewParent ").append(paramViewParent).append(" does not implement interface method onStopNestedScroll");
      }
    }
    
    public final void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      try
      {
        paramViewParent.onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
        return;
      }
      catch (AbstractMethodError paramView)
      {
        new StringBuilder("ViewParent ").append(paramViewParent).append(" does not implement interface method onNestedScroll");
      }
    }
    
    public final void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
    {
      try
      {
        paramViewParent.onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt);
        return;
      }
      catch (AbstractMethodError paramView)
      {
        new StringBuilder("ViewParent ").append(paramViewParent).append(" does not implement interface method onNestedPreScroll");
      }
    }
    
    public final boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2)
    {
      return ah.a(paramViewParent, paramView, paramFloat1, paramFloat2);
    }
    
    public final boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
    {
      return ah.a(paramViewParent, paramView, paramFloat1, paramFloat2, paramBoolean);
    }
    
    public final boolean a(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
    {
      return ah.a(paramViewParent, paramView1, paramView2, paramInt);
    }
    
    public final void b(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
    {
      try
      {
        paramViewParent.onNestedScrollAccepted(paramView1, paramView2, paramInt);
        return;
      }
      catch (AbstractMethodError paramView1)
      {
        new StringBuilder("ViewParent ").append(paramViewParent).append(" does not implement interface method onNestedScrollAccepted");
      }
    }
  }
  
  static class e
    implements ag.b
  {
    public void a(ViewParent paramViewParent, View paramView)
    {
      if ((paramViewParent instanceof r)) {
        ((r)paramViewParent).onStopNestedScroll(paramView);
      }
    }
    
    public void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      if ((paramViewParent instanceof r)) {
        ((r)paramViewParent).onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
      }
    }
    
    public void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
    {
      if ((paramViewParent instanceof r)) {
        ((r)paramViewParent).onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt);
      }
    }
    
    public boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2)
    {
      if ((paramViewParent instanceof r)) {
        return ((r)paramViewParent).onNestedPreFling(paramView, paramFloat1, paramFloat2);
      }
      return false;
    }
    
    public boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
    {
      if ((paramViewParent instanceof r)) {
        return ((r)paramViewParent).onNestedFling(paramView, paramFloat1, paramFloat2, paramBoolean);
      }
      return false;
    }
    
    public boolean a(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
    {
      if ((paramViewParent instanceof r)) {
        return ((r)paramViewParent).onStartNestedScroll(paramView1, paramView2, paramInt);
      }
      return false;
    }
    
    public void b(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
    {
      if ((paramViewParent instanceof r)) {
        ((r)paramViewParent).onNestedScrollAccepted(paramView1, paramView2, paramInt);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\view\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */