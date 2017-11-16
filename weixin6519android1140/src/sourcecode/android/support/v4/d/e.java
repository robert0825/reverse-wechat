package android.support.v4.d;

import java.util.Locale;

public final class e
{
  public static final d uO = new e(null, false);
  public static final d uP = new e(null, true);
  public static final d uQ = new e(b.uX, false);
  public static final d uR = new e(b.uX, true);
  public static final d uS = new e(a.uV, false);
  public static final d uT = f.va;
  
  public static int M(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 2;
    case 0: 
      return 1;
    }
    return 0;
  }
  
  public static int N(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 2;
    case 0: 
    case 14: 
    case 15: 
      return 1;
    }
    return 0;
  }
  
  private static final class a
    implements e.c
  {
    public static final a uV = new a(true);
    public static final a uW = new a(false);
    private final boolean uU;
    
    private a(boolean paramBoolean)
    {
      this.uU = paramBoolean;
    }
    
    public final int a(CharSequence paramCharSequence, int paramInt1, int paramInt2)
    {
      int j = 1;
      int i = 0;
      paramInt1 = 0;
      for (;;)
      {
        if (i < paramInt2 + 0) {
          switch (e.M(Character.getDirectionality(paramCharSequence.charAt(i))))
          {
          default: 
            i += 1;
            break;
          case 0: 
            if (this.uU) {
              paramInt1 = 0;
            }
            break;
          }
        }
      }
      do
      {
        do
        {
          return paramInt1;
          paramInt1 = 1;
          break;
          paramInt1 = j;
        } while (!this.uU);
        paramInt1 = 1;
        break;
        if (paramInt1 == 0) {
          break label108;
        }
        paramInt1 = j;
      } while (this.uU);
      return 0;
      label108:
      return 2;
    }
  }
  
  private static final class b
    implements e.c
  {
    public static final b uX = new b();
    
    public final int a(CharSequence paramCharSequence, int paramInt1, int paramInt2)
    {
      paramInt1 = 0;
      int i = 2;
      while ((paramInt1 < paramInt2 + 0) && (i == 2))
      {
        i = e.N(Character.getDirectionality(paramCharSequence.charAt(paramInt1)));
        paramInt1 += 1;
      }
      return i;
    }
  }
  
  private static abstract interface c
  {
    public abstract int a(CharSequence paramCharSequence, int paramInt1, int paramInt2);
  }
  
  private static abstract class d
    implements d
  {
    private final e.c uY;
    
    public d(e.c paramc)
    {
      this.uY = paramc;
    }
    
    public final boolean a(CharSequence paramCharSequence, int paramInt)
    {
      boolean bool = false;
      if ((paramCharSequence == null) || (paramInt < 0) || (paramCharSequence.length() - paramInt < 0)) {
        throw new IllegalArgumentException();
      }
      if (this.uY == null)
      {
        bool = by();
        return bool;
      }
      switch (this.uY.a(paramCharSequence, 0, paramInt))
      {
      case 1: 
      default: 
        return by();
      }
      return true;
    }
    
    protected abstract boolean by();
  }
  
  private static final class e
    extends e.d
  {
    private final boolean uZ;
    
    public e(e.c paramc, boolean paramBoolean)
    {
      super();
      this.uZ = paramBoolean;
    }
    
    protected final boolean by()
    {
      return this.uZ;
    }
  }
  
  private static final class f
    extends e.d
  {
    public static final f va = new f();
    
    public f()
    {
      super();
    }
    
    protected final boolean by()
    {
      return f.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\d\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */