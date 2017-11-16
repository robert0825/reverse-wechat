package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.KeyEvent;

public final class g
{
  static final d wo = new a();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      wo = new c();
      return;
    }
  }
  
  public static boolean a(KeyEvent paramKeyEvent)
  {
    return wo.metaStateHasNoModifiers(paramKeyEvent.getMetaState());
  }
  
  public static boolean a(KeyEvent paramKeyEvent, int paramInt)
  {
    return wo.metaStateHasModifiers(paramKeyEvent.getMetaState(), paramInt);
  }
  
  public static void b(KeyEvent paramKeyEvent)
  {
    wo.b(paramKeyEvent);
  }
  
  static class a
    implements g.d
  {
    private static int c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
    {
      int j = 1;
      int i;
      if ((paramInt2 & paramInt3) != 0)
      {
        i = 1;
        paramInt4 |= paramInt5;
        if ((paramInt2 & paramInt4) == 0) {
          break label51;
        }
        paramInt2 = j;
      }
      for (;;)
      {
        if (i != 0)
        {
          if (paramInt2 != 0)
          {
            throw new IllegalArgumentException("bad arguments");
            i = 0;
            break;
            label51:
            paramInt2 = 0;
            continue;
          }
          paramInt4 = paramInt1 & (paramInt4 ^ 0xFFFFFFFF);
        }
      }
      do
      {
        return paramInt4;
        paramInt4 = paramInt1;
      } while (paramInt2 == 0);
      return paramInt1 & (paramInt3 ^ 0xFFFFFFFF);
    }
    
    public void b(KeyEvent paramKeyEvent) {}
    
    public boolean metaStateHasModifiers(int paramInt1, int paramInt2)
    {
      return c(c(normalizeMetaState(paramInt1) & 0xF7, paramInt2, 1, 64, 128), paramInt2, 2, 16, 32) == paramInt2;
    }
    
    public boolean metaStateHasNoModifiers(int paramInt)
    {
      return (normalizeMetaState(paramInt) & 0xF7) == 0;
    }
    
    public int normalizeMetaState(int paramInt)
    {
      if ((paramInt & 0xC0) != 0) {
        paramInt |= 0x1;
      }
      for (;;)
      {
        int i = paramInt;
        if ((paramInt & 0x30) != 0) {
          i = paramInt | 0x2;
        }
        return i & 0xF7;
      }
    }
  }
  
  static class b
    extends g.a
  {
    public final void b(KeyEvent paramKeyEvent)
    {
      paramKeyEvent.startTracking();
    }
  }
  
  static final class c
    extends g.b
  {
    public final boolean metaStateHasModifiers(int paramInt1, int paramInt2)
    {
      return KeyEvent.metaStateHasModifiers(paramInt1, paramInt2);
    }
    
    public final boolean metaStateHasNoModifiers(int paramInt)
    {
      return KeyEvent.metaStateHasNoModifiers(paramInt);
    }
    
    public final int normalizeMetaState(int paramInt)
    {
      return KeyEvent.normalizeMetaState(paramInt);
    }
  }
  
  static abstract interface d
  {
    public abstract void b(KeyEvent paramKeyEvent);
    
    public abstract boolean metaStateHasModifiers(int paramInt1, int paramInt2);
    
    public abstract boolean metaStateHasNoModifiers(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\view\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */