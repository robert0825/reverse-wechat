package android.support.v4.b.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

public final class a
{
  static final b ta = new a();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23)
    {
      ta = new h();
      return;
    }
    if (i >= 21)
    {
      ta = new g();
      return;
    }
    if (i >= 19)
    {
      ta = new f();
      return;
    }
    if (i >= 17)
    {
      ta = new e();
      return;
    }
    if (i >= 11)
    {
      ta = new d();
      return;
    }
    if (i >= 5)
    {
      ta = new c();
      return;
    }
  }
  
  public static void a(Drawable paramDrawable, float paramFloat1, float paramFloat2)
  {
    ta.a(paramDrawable, paramFloat1, paramFloat2);
  }
  
  public static void a(Drawable paramDrawable, int paramInt)
  {
    ta.a(paramDrawable, paramInt);
  }
  
  public static void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ta.a(paramDrawable, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void a(Drawable paramDrawable, ColorStateList paramColorStateList)
  {
    ta.a(paramDrawable, paramColorStateList);
  }
  
  public static void a(Drawable paramDrawable, Resources.Theme paramTheme)
  {
    ta.a(paramDrawable, paramTheme);
  }
  
  public static void a(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    ta.a(paramDrawable, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
  }
  
  public static void a(Drawable paramDrawable, PorterDuff.Mode paramMode)
  {
    ta.a(paramDrawable, paramMode);
  }
  
  public static void a(Drawable paramDrawable, boolean paramBoolean)
  {
    ta.a(paramDrawable, paramBoolean);
  }
  
  public static void b(Drawable paramDrawable)
  {
    ta.b(paramDrawable);
  }
  
  public static void b(Drawable paramDrawable, int paramInt)
  {
    ta.b(paramDrawable, paramInt);
  }
  
  public static boolean c(Drawable paramDrawable)
  {
    return ta.c(paramDrawable);
  }
  
  public static int d(Drawable paramDrawable)
  {
    return ta.d(paramDrawable);
  }
  
  public static boolean e(Drawable paramDrawable)
  {
    return ta.e(paramDrawable);
  }
  
  public static ColorFilter f(Drawable paramDrawable)
  {
    return ta.f(paramDrawable);
  }
  
  public static Drawable g(Drawable paramDrawable)
  {
    return ta.g(paramDrawable);
  }
  
  public static <T extends Drawable> T h(Drawable paramDrawable)
  {
    Drawable localDrawable = paramDrawable;
    if ((paramDrawable instanceof c)) {
      localDrawable = ((c)paramDrawable).bp();
    }
    return localDrawable;
  }
  
  public static int i(Drawable paramDrawable)
  {
    return ta.i(paramDrawable);
  }
  
  static class a
    implements a.b
  {
    public void a(Drawable paramDrawable, float paramFloat1, float paramFloat2) {}
    
    public void a(Drawable paramDrawable, int paramInt)
    {
      if ((paramDrawable instanceof l)) {
        ((l)paramDrawable).setTint(paramInt);
      }
    }
    
    public void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
    
    public void a(Drawable paramDrawable, ColorStateList paramColorStateList)
    {
      if ((paramDrawable instanceof l)) {
        ((l)paramDrawable).setTintList(paramColorStateList);
      }
    }
    
    public void a(Drawable paramDrawable, Resources.Theme paramTheme) {}
    
    public void a(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    {
      paramDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet);
    }
    
    public void a(Drawable paramDrawable, PorterDuff.Mode paramMode)
    {
      if ((paramDrawable instanceof l)) {
        ((l)paramDrawable).setTintMode(paramMode);
      }
    }
    
    public void a(Drawable paramDrawable, boolean paramBoolean) {}
    
    public void b(Drawable paramDrawable) {}
    
    public void b(Drawable paramDrawable, int paramInt) {}
    
    public boolean c(Drawable paramDrawable)
    {
      return false;
    }
    
    public int d(Drawable paramDrawable)
    {
      return 0;
    }
    
    public boolean e(Drawable paramDrawable)
    {
      return false;
    }
    
    public ColorFilter f(Drawable paramDrawable)
    {
      return null;
    }
    
    public Drawable g(Drawable paramDrawable)
    {
      Object localObject = paramDrawable;
      if (!(paramDrawable instanceof l)) {
        localObject = new d(paramDrawable);
      }
      return (Drawable)localObject;
    }
    
    public int i(Drawable paramDrawable)
    {
      return 0;
    }
  }
  
  static abstract interface b
  {
    public abstract void a(Drawable paramDrawable, float paramFloat1, float paramFloat2);
    
    public abstract void a(Drawable paramDrawable, int paramInt);
    
    public abstract void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
    
    public abstract void a(Drawable paramDrawable, ColorStateList paramColorStateList);
    
    public abstract void a(Drawable paramDrawable, Resources.Theme paramTheme);
    
    public abstract void a(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme);
    
    public abstract void a(Drawable paramDrawable, PorterDuff.Mode paramMode);
    
    public abstract void a(Drawable paramDrawable, boolean paramBoolean);
    
    public abstract void b(Drawable paramDrawable);
    
    public abstract void b(Drawable paramDrawable, int paramInt);
    
    public abstract boolean c(Drawable paramDrawable);
    
    public abstract int d(Drawable paramDrawable);
    
    public abstract boolean e(Drawable paramDrawable);
    
    public abstract ColorFilter f(Drawable paramDrawable);
    
    public abstract Drawable g(Drawable paramDrawable);
    
    public abstract int i(Drawable paramDrawable);
  }
  
  static class c
    extends a.a
  {
    public Drawable g(Drawable paramDrawable)
    {
      Object localObject = paramDrawable;
      if (!(paramDrawable instanceof l)) {
        localObject = new e(paramDrawable);
      }
      return (Drawable)localObject;
    }
  }
  
  static class d
    extends a.c
  {
    public final void b(Drawable paramDrawable)
    {
      paramDrawable.jumpToCurrentState();
    }
    
    public Drawable g(Drawable paramDrawable)
    {
      Object localObject = paramDrawable;
      if (!(paramDrawable instanceof l)) {
        localObject = new f(paramDrawable);
      }
      return (Drawable)localObject;
    }
  }
  
  static class e
    extends a.d
  {
    public void b(Drawable paramDrawable, int paramInt)
    {
      if (!b.tc) {}
      try
      {
        Method localMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[] { Integer.TYPE });
        b.tb = localMethod;
        localMethod.setAccessible(true);
        b.tc = true;
        if (b.tb != null) {}
        try
        {
          b.tb.invoke(paramDrawable, new Object[] { Integer.valueOf(paramInt) });
          return;
        }
        catch (Exception paramDrawable)
        {
          b.tb = null;
          return;
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        for (;;) {}
      }
    }
    
    public int i(Drawable paramDrawable)
    {
      int i = b.i(paramDrawable);
      if (i >= 0) {
        return i;
      }
      return 0;
    }
  }
  
  static class f
    extends a.e
  {
    public final void a(Drawable paramDrawable, boolean paramBoolean)
    {
      paramDrawable.setAutoMirrored(paramBoolean);
    }
    
    public final boolean c(Drawable paramDrawable)
    {
      return paramDrawable.isAutoMirrored();
    }
    
    public final int d(Drawable paramDrawable)
    {
      return paramDrawable.getAlpha();
    }
    
    public Drawable g(Drawable paramDrawable)
    {
      Object localObject = paramDrawable;
      if (!(paramDrawable instanceof l)) {
        localObject = new g(paramDrawable);
      }
      return (Drawable)localObject;
    }
  }
  
  static class g
    extends a.f
  {
    public final void a(Drawable paramDrawable, float paramFloat1, float paramFloat2)
    {
      paramDrawable.setHotspot(paramFloat1, paramFloat2);
    }
    
    public final void a(Drawable paramDrawable, int paramInt)
    {
      paramDrawable.setTint(paramInt);
    }
    
    public final void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramDrawable.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    
    public final void a(Drawable paramDrawable, ColorStateList paramColorStateList)
    {
      paramDrawable.setTintList(paramColorStateList);
    }
    
    public final void a(Drawable paramDrawable, Resources.Theme paramTheme)
    {
      paramDrawable.applyTheme(paramTheme);
    }
    
    public final void a(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    {
      paramDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    }
    
    public final void a(Drawable paramDrawable, PorterDuff.Mode paramMode)
    {
      paramDrawable.setTintMode(paramMode);
    }
    
    public final boolean e(Drawable paramDrawable)
    {
      return paramDrawable.canApplyTheme();
    }
    
    public final ColorFilter f(Drawable paramDrawable)
    {
      return paramDrawable.getColorFilter();
    }
    
    public Drawable g(Drawable paramDrawable)
    {
      Object localObject = paramDrawable;
      if (!(paramDrawable instanceof l)) {
        localObject = new h(paramDrawable);
      }
      return (Drawable)localObject;
    }
  }
  
  static final class h
    extends a.g
  {
    public final void b(Drawable paramDrawable, int paramInt)
    {
      paramDrawable.setLayoutDirection(paramInt);
    }
    
    public final Drawable g(Drawable paramDrawable)
    {
      return paramDrawable;
    }
    
    public final int i(Drawable paramDrawable)
    {
      return paramDrawable.getLayoutDirection();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\b\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */