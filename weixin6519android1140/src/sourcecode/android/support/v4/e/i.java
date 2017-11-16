package android.support.v4.e;

public final class i
{
  public static abstract interface a<T>
  {
    public abstract T bE();
    
    public abstract boolean i(T paramT);
  }
  
  public static class b<T>
    implements i.a<T>
  {
    private final Object[] vv;
    private int vw;
    
    public b(int paramInt)
    {
      if (paramInt <= 0) {
        throw new IllegalArgumentException("The max pool size must be > 0");
      }
      this.vv = new Object[paramInt];
    }
    
    public T bE()
    {
      if (this.vw > 0)
      {
        int i = this.vw - 1;
        Object localObject = this.vv[i];
        this.vv[i] = null;
        this.vw -= 1;
        return (T)localObject;
      }
      return null;
    }
    
    public boolean i(T paramT)
    {
      boolean bool = false;
      int i = 0;
      if (i < this.vw) {
        if (this.vv[i] != paramT) {}
      }
      for (i = 1;; i = 0)
      {
        if (i == 0) {
          break label50;
        }
        throw new IllegalStateException("Already in the pool!");
        i += 1;
        break;
      }
      label50:
      if (this.vw < this.vv.length)
      {
        this.vv[this.vw] = paramT;
        this.vw += 1;
        bool = true;
      }
      return bool;
    }
  }
  
  public static final class c<T>
    extends i.b<T>
  {
    private final Object mLock = new Object();
    
    public c()
    {
      super();
    }
    
    public final T bE()
    {
      synchronized (this.mLock)
      {
        Object localObject2 = super.bE();
        return (T)localObject2;
      }
    }
    
    public final boolean i(T paramT)
    {
      synchronized (this.mLock)
      {
        boolean bool = super.i(paramT);
        return bool;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\e\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */