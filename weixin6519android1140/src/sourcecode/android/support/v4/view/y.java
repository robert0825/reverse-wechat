package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.VelocityTracker;

public final class y
{
  static final c xo = new a();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      xo = new b();
      return;
    }
  }
  
  public static float a(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return xo.a(paramVelocityTracker, paramInt);
  }
  
  public static float b(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return xo.b(paramVelocityTracker, paramInt);
  }
  
  static final class a
    implements y.c
  {
    public final float a(VelocityTracker paramVelocityTracker, int paramInt)
    {
      return paramVelocityTracker.getXVelocity();
    }
    
    public final float b(VelocityTracker paramVelocityTracker, int paramInt)
    {
      return paramVelocityTracker.getYVelocity();
    }
  }
  
  static final class b
    implements y.c
  {
    public final float a(VelocityTracker paramVelocityTracker, int paramInt)
    {
      return paramVelocityTracker.getXVelocity(paramInt);
    }
    
    public final float b(VelocityTracker paramVelocityTracker, int paramInt)
    {
      return paramVelocityTracker.getYVelocity(paramInt);
    }
  }
  
  static abstract interface c
  {
    public abstract float a(VelocityTracker paramVelocityTracker, int paramInt);
    
    public abstract float b(VelocityTracker paramVelocityTracker, int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\view\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */