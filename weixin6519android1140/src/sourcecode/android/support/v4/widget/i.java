package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.widget.EdgeEffect;

public final class i
{
  private static final c BF = new a();
  private Object BE;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      BF = new d();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      BF = new b();
      return;
    }
  }
  
  public i(Context paramContext)
  {
    this.BE = BF.n(paramContext);
  }
  
  public final boolean ag(int paramInt)
  {
    return BF.k(this.BE, paramInt);
  }
  
  public final boolean cq()
  {
    return BF.J(this.BE);
  }
  
  public final boolean draw(Canvas paramCanvas)
  {
    return BF.a(this.BE, paramCanvas);
  }
  
  public final void finish()
  {
    BF.I(this.BE);
  }
  
  public final boolean h(float paramFloat1, float paramFloat2)
  {
    return BF.a(this.BE, paramFloat1, paramFloat2);
  }
  
  public final boolean isFinished()
  {
    return BF.H(this.BE);
  }
  
  public final void setSize(int paramInt1, int paramInt2)
  {
    BF.a(this.BE, paramInt1, paramInt2);
  }
  
  public final boolean u(float paramFloat)
  {
    return BF.a(this.BE, paramFloat);
  }
  
  static final class a
    implements i.c
  {
    public final boolean H(Object paramObject)
    {
      return true;
    }
    
    public final void I(Object paramObject) {}
    
    public final boolean J(Object paramObject)
    {
      return false;
    }
    
    public final void a(Object paramObject, int paramInt1, int paramInt2) {}
    
    public final boolean a(Object paramObject, float paramFloat)
    {
      return false;
    }
    
    public final boolean a(Object paramObject, float paramFloat1, float paramFloat2)
    {
      return false;
    }
    
    public final boolean a(Object paramObject, Canvas paramCanvas)
    {
      return false;
    }
    
    public final boolean k(Object paramObject, int paramInt)
    {
      return false;
    }
    
    public final Object n(Context paramContext)
    {
      return null;
    }
  }
  
  static class b
    implements i.c
  {
    public final boolean H(Object paramObject)
    {
      return ((EdgeEffect)paramObject).isFinished();
    }
    
    public final void I(Object paramObject)
    {
      ((EdgeEffect)paramObject).finish();
    }
    
    public final boolean J(Object paramObject)
    {
      paramObject = (EdgeEffect)paramObject;
      ((EdgeEffect)paramObject).onRelease();
      return ((EdgeEffect)paramObject).isFinished();
    }
    
    public final void a(Object paramObject, int paramInt1, int paramInt2)
    {
      ((EdgeEffect)paramObject).setSize(paramInt1, paramInt2);
    }
    
    public final boolean a(Object paramObject, float paramFloat)
    {
      return j.a(paramObject, paramFloat);
    }
    
    public boolean a(Object paramObject, float paramFloat1, float paramFloat2)
    {
      return j.a(paramObject, paramFloat1);
    }
    
    public final boolean a(Object paramObject, Canvas paramCanvas)
    {
      return ((EdgeEffect)paramObject).draw(paramCanvas);
    }
    
    public final boolean k(Object paramObject, int paramInt)
    {
      ((EdgeEffect)paramObject).onAbsorb(paramInt);
      return true;
    }
    
    public final Object n(Context paramContext)
    {
      return new EdgeEffect(paramContext);
    }
  }
  
  static abstract interface c
  {
    public abstract boolean H(Object paramObject);
    
    public abstract void I(Object paramObject);
    
    public abstract boolean J(Object paramObject);
    
    public abstract void a(Object paramObject, int paramInt1, int paramInt2);
    
    public abstract boolean a(Object paramObject, float paramFloat);
    
    public abstract boolean a(Object paramObject, float paramFloat1, float paramFloat2);
    
    public abstract boolean a(Object paramObject, Canvas paramCanvas);
    
    public abstract boolean k(Object paramObject, int paramInt);
    
    public abstract Object n(Context paramContext);
  }
  
  static final class d
    extends i.b
  {
    public final boolean a(Object paramObject, float paramFloat1, float paramFloat2)
    {
      ((EdgeEffect)paramObject).onPull(paramFloat1, paramFloat2);
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\widget\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */