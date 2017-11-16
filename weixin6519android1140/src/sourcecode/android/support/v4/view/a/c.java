package android.support.v4.view.a;

import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.List;

public final class c
{
  private static final a zz = new d();
  public final Object zA;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      zz = new c();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      zz = new b();
      return;
    }
  }
  
  public c()
  {
    this.zA = zz.a(this);
  }
  
  public c(Object paramObject)
  {
    this.zA = paramObject;
  }
  
  public static b ca()
  {
    return null;
  }
  
  public static boolean cb()
  {
    return false;
  }
  
  public static List<b> cc()
  {
    return null;
  }
  
  public static b cd()
  {
    return null;
  }
  
  static abstract interface a
  {
    public abstract Object a(c paramc);
  }
  
  static final class b
    extends c.d
  {
    public final Object a(final c paramc)
    {
      new d.1(new d.a()
      {
        public final boolean cb()
        {
          return c.cb();
        }
        
        public final List<Object> cc()
        {
          c.cc();
          new ArrayList();
          throw new NullPointerException();
        }
        
        public final Object ce()
        {
          c.ca();
          return null;
        }
      });
    }
  }
  
  static final class c
    extends c.d
  {
    public final Object a(final c paramc)
    {
      new e.1(new e.a()
      {
        public final boolean cb()
        {
          return c.cb();
        }
        
        public final List<Object> cc()
        {
          c.cc();
          new ArrayList();
          throw new NullPointerException();
        }
        
        public final Object ce()
        {
          c.ca();
          return null;
        }
        
        public final Object cf()
        {
          c.cd();
          return null;
        }
      });
    }
  }
  
  static class d
    implements c.a
  {
    public Object a(c paramc)
    {
      return null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\view\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */