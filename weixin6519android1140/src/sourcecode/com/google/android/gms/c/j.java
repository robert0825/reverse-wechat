package com.google.android.gms.c;

import android.os.Binder;

public abstract class j<T>
{
  private static final Object abs = new Object();
  public static a auq = null;
  private static int aur = 0;
  private static String aus = "com.google.android.providers.gsf.permission.READ_GSERVICES";
  private T afh = null;
  protected final String aut;
  protected final T auu;
  
  protected j(String paramString, T paramT)
  {
    this.aut = paramString;
    this.auu = paramT;
  }
  
  public static j<Float> a(String paramString, Float paramFloat)
  {
    new j(paramString, paramFloat) {};
  }
  
  public static j<Integer> a(String paramString, Integer paramInteger)
  {
    new j(paramString, paramInteger) {};
  }
  
  public static j<Long> a(String paramString, Long paramLong)
  {
    new j(paramString, paramLong) {};
  }
  
  public static j<Boolean> e(String paramString, boolean paramBoolean)
  {
    new j(paramString, Boolean.valueOf(paramBoolean)) {};
  }
  
  public static boolean isInitialized()
  {
    return auq != null;
  }
  
  public static j<String> j(String paramString1, String paramString2)
  {
    new j(paramString1, paramString2) {};
  }
  
  public static int lj()
  {
    return aur;
  }
  
  public final T get()
  {
    if (this.afh != null) {
      return (T)this.afh;
    }
    return (T)lk();
  }
  
  protected abstract T lk();
  
  public final T ll()
  {
    long l = Binder.clearCallingIdentity();
    try
    {
      Object localObject1 = get();
      return (T)localObject1;
    }
    finally
    {
      Binder.restoreCallingIdentity(l);
    }
  }
  
  private static abstract interface a
  {
    public abstract Boolean lm();
    
    public abstract Long ln();
    
    public abstract Integer lo();
    
    public abstract Float lp();
    
    public abstract String lq();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\c\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */