package com.google.android.gms.b;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.w;

public abstract class c<T>
{
  private final String anq;
  private T anr;
  
  public c(String paramString)
  {
    this.anq = paramString;
  }
  
  public final T D(Context paramContext)
  {
    if (this.anr == null)
    {
      w.aa(paramContext);
      paramContext = e.A(paramContext);
      if (paramContext == null) {
        throw new a("Could not get remote context.");
      }
      paramContext = paramContext.getClassLoader();
    }
    try
    {
      this.anr = e((IBinder)paramContext.loadClass(this.anq).newInstance());
      return (T)this.anr;
    }
    catch (ClassNotFoundException paramContext)
    {
      throw new a("Could not load creator class.", paramContext);
    }
    catch (InstantiationException paramContext)
    {
      throw new a("Could not instantiate creator.", paramContext);
    }
    catch (IllegalAccessException paramContext)
    {
      throw new a("Could not access creator.", paramContext);
    }
  }
  
  public abstract T e(IBinder paramIBinder);
  
  public static final class a
    extends Exception
  {
    public a(String paramString)
    {
      super();
    }
    
    public a(String paramString, Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */