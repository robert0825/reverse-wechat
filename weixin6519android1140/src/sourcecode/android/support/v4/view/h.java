package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;

public final class h
{
  static final a wp = new b();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      wp = new d();
      return;
    }
    if (i >= 11)
    {
      wp = new c();
      return;
    }
  }
  
  public static k a(LayoutInflater paramLayoutInflater)
  {
    return wp.a(paramLayoutInflater);
  }
  
  public static void a(LayoutInflater paramLayoutInflater, k paramk)
  {
    wp.a(paramLayoutInflater, paramk);
  }
  
  static abstract interface a
  {
    public abstract k a(LayoutInflater paramLayoutInflater);
    
    public abstract void a(LayoutInflater paramLayoutInflater, k paramk);
  }
  
  static class b
    implements h.a
  {
    public final k a(LayoutInflater paramLayoutInflater)
    {
      paramLayoutInflater = paramLayoutInflater.getFactory();
      if ((paramLayoutInflater instanceof i.a)) {
        return ((i.a)paramLayoutInflater).wq;
      }
      return null;
    }
    
    public void a(LayoutInflater paramLayoutInflater, k paramk)
    {
      if (paramk != null) {}
      for (paramk = new i.a(paramk);; paramk = null)
      {
        paramLayoutInflater.setFactory(paramk);
        return;
      }
    }
  }
  
  static class c
    extends h.b
  {
    public void a(LayoutInflater paramLayoutInflater, k paramk)
    {
      if (paramk != null) {}
      for (paramk = new j.a(paramk);; paramk = null)
      {
        paramLayoutInflater.setFactory2(paramk);
        LayoutInflater.Factory localFactory = paramLayoutInflater.getFactory();
        if (!(localFactory instanceof LayoutInflater.Factory2)) {
          break;
        }
        j.a(paramLayoutInflater, (LayoutInflater.Factory2)localFactory);
        return;
      }
      j.a(paramLayoutInflater, paramk);
    }
  }
  
  static final class d
    extends h.c
  {
    public final void a(LayoutInflater paramLayoutInflater, k paramk)
    {
      if (paramk != null) {}
      for (paramk = new j.a(paramk);; paramk = null)
      {
        paramLayoutInflater.setFactory2(paramk);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\view\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */