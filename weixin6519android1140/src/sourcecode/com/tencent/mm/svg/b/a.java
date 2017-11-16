package com.tencent.mm.svg.b;

import com.tencent.gmtrace.GMTrace;
import java.lang.reflect.Field;

public final class a<T>
{
  private String classname;
  private boolean fRu;
  public Field fRv;
  private String fieldName;
  public Object obj;
  
  public a(Object paramObject, String paramString)
  {
    GMTrace.i(3481205211136L, 25937);
    if (paramObject == null) {
      throw new IllegalArgumentException("obj cannot be null");
    }
    this.obj = paramObject;
    this.fieldName = paramString;
    this.classname = null;
    GMTrace.o(3481205211136L, 25937);
  }
  
  public final T get()
  {
    GMTrace.i(3481473646592L, 25939);
    prepare();
    if (this.fRv == null) {
      throw new NoSuchFieldException();
    }
    try
    {
      Object localObject = this.fRv.get(this.obj);
      GMTrace.o(3481473646592L, 25939);
      return (T)localObject;
    }
    catch (ClassCastException localClassCastException)
    {
      throw new IllegalArgumentException("unable to cast object");
    }
  }
  
  public final void prepare()
  {
    GMTrace.i(3481339428864L, 25938);
    if (this.fRu)
    {
      GMTrace.o(3481339428864L, 25938);
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
        GMTrace.o(3481339428864L, 25938);
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
    GMTrace.o(3481339428864L, 25938);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\svg\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */