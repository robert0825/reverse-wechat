package com.tencent.mm.compatible.loader;

import com.tencent.gmtrace.GMTrace;
import java.lang.reflect.Field;

public final class c<T>
{
  private String classname;
  private boolean fRu;
  private Field fRv;
  private String fieldName;
  private Object obj;
  
  public c(Object paramObject, String paramString1, String paramString2)
  {
    GMTrace.i(14006559440896L, 104357);
    if (paramObject == null) {
      throw new IllegalArgumentException("obj cannot be null");
    }
    this.obj = paramObject;
    this.fieldName = paramString1;
    this.classname = paramString2;
    GMTrace.o(14006559440896L, 104357);
  }
  
  private void prepare()
  {
    GMTrace.i(14006693658624L, 104358);
    if (this.fRu)
    {
      GMTrace.o(14006693658624L, 104358);
      return;
    }
    this.fRu = true;
    Class localClass = this.obj.getClass();
    while (localClass != null) {
      try
      {
        Field localField1 = localClass.getDeclaredField(this.fieldName);
        localField1.setAccessible(true);
        this.fRv = localField1;
        localClass.getSuperclass();
        GMTrace.o(14006693658624L, 104358);
        return;
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          try
          {
            if ((this.classname != null) && (!this.classname.equals("")))
            {
              Field[] arrayOfField = localClass.getDeclaredFields();
              int j = arrayOfField.length;
              i = 0;
              if (i < j)
              {
                Field localField2 = arrayOfField[i];
                if (!localField2.getType().getName().equals(this.classname)) {
                  continue;
                }
                localField2.setAccessible(true);
                this.fRv = localField2;
              }
            }
          }
          catch (Exception localException2)
          {
            int i;
            continue;
          }
          localClass = localClass.getSuperclass();
          break;
          i += 1;
        }
      }
      finally
      {
        localClass.getSuperclass();
      }
    }
    GMTrace.o(14006693658624L, 104358);
  }
  
  public final T get()
  {
    GMTrace.i(14006827876352L, 104359);
    prepare();
    if (this.fRv == null) {
      throw new NoSuchFieldException();
    }
    try
    {
      Object localObject = this.fRv.get(this.obj);
      GMTrace.o(14006827876352L, 104359);
      return (T)localObject;
    }
    catch (ClassCastException localClassCastException)
    {
      throw new IllegalArgumentException("unable to cast object");
    }
  }
  
  public final void set(T paramT)
  {
    GMTrace.i(14006962094080L, 104360);
    prepare();
    if (this.fRv == null) {
      throw new NoSuchFieldException();
    }
    this.fRv.set(this.obj, paramT);
    GMTrace.o(14006962094080L, 104360);
  }
  
  public final boolean tr()
  {
    GMTrace.i(14007096311808L, 104361);
    prepare();
    if (this.fRv != null)
    {
      GMTrace.o(14007096311808L, 104361);
      return true;
    }
    GMTrace.o(14007096311808L, 104361);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\loader\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */