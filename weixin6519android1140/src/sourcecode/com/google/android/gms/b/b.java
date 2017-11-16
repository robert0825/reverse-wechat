package com.google.android.gms.b;

import java.lang.reflect.Field;

public final class b<T>
  extends a.a
{
  private final T JP;
  
  private b(T paramT)
  {
    this.JP = paramT;
  }
  
  public static <T> T a(a parama)
  {
    if ((parama instanceof b)) {
      return (T)((b)parama).JP;
    }
    parama = parama.asBinder();
    Object localObject = parama.getClass().getDeclaredFields();
    if (localObject.length == 1)
    {
      localObject = localObject[0];
      if (!((Field)localObject).isAccessible())
      {
        ((Field)localObject).setAccessible(true);
        try
        {
          parama = ((Field)localObject).get(parama);
          return parama;
        }
        catch (NullPointerException parama)
        {
          throw new IllegalArgumentException("Binder object is null.", parama);
        }
        catch (IllegalArgumentException parama)
        {
          throw new IllegalArgumentException("remoteBinder is the wrong class.", parama);
        }
        catch (IllegalAccessException parama)
        {
          throw new IllegalArgumentException("Could not access the field in remoteBinder.", parama);
        }
      }
      throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
    }
    throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
  }
  
  public static <T> a ab(T paramT)
  {
    return new b(paramT);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */