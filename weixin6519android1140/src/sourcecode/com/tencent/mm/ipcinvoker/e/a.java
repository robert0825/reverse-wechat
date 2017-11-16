package com.tencent.mm.ipcinvoker.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;

public final class a<FieldType>
{
  private Class<?> fVQ;
  private String fVR;
  private boolean fVS;
  private Field mField;
  
  public a(Class<?> paramClass, String paramString)
  {
    GMTrace.i(18697334816768L, 139306);
    if (paramString.length() == 0) {
      throw new IllegalArgumentException("Both of invoker and fieldName can not be null or nil.");
    }
    this.fVQ = paramClass;
    this.fVR = paramString;
    GMTrace.o(18697334816768L, 139306);
  }
  
  private void prepare()
  {
    for (;;)
    {
      try
      {
        GMTrace.i(18697469034496L, 139307);
        if (this.fVS)
        {
          GMTrace.o(18697469034496L, 139307);
          return;
        }
        localClass1 = this.fVQ;
        if (localClass1 == null) {}
      }
      finally
      {
        try
        {
          Class localClass1;
          Field localField = localClass1.getDeclaredField(this.fVR);
          localField.setAccessible(true);
          this.mField = localField;
          this.fVS = true;
          GMTrace.o(18697469034496L, 139307);
        }
        catch (Exception localException)
        {
          Class localClass2 = ((Class)localObject).getSuperclass();
        }
        localObject = finally;
      }
    }
  }
  
  private FieldType vU()
  {
    Object localObject1 = null;
    try
    {
      GMTrace.i(18697603252224L, 139308);
      prepare();
      if (this.mField == null)
      {
        w.w("SDK.ReflectStaticFieldSmith", "Field %s is no exists.", new Object[] { this.fVR });
        GMTrace.o(18697603252224L, 139308);
        return (FieldType)localObject1;
      }
    }
    finally
    {
      try
      {
        localObject1 = this.mField.get(null);
        GMTrace.o(18697603252224L, 139308);
      }
      catch (ClassCastException localClassCastException)
      {
        throw new IllegalArgumentException("unable to cast object");
      }
      localObject2 = finally;
    }
  }
  
  /* Error */
  public final FieldType vV()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 109
    //   5: ldc 111
    //   7: invokestatic 28	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aconst_null
    //   11: astore_1
    //   12: aload_0
    //   13: invokespecial 113	com/tencent/mm/ipcinvoker/e/a:vU	()Ljava/lang/Object;
    //   16: astore_2
    //   17: aload_2
    //   18: astore_1
    //   19: ldc2_w 109
    //   22: ldc 111
    //   24: invokestatic 48	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_1
    //   30: areturn
    //   31: astore_2
    //   32: ldc 88
    //   34: ldc 115
    //   36: iconst_1
    //   37: anewarray 5	java/lang/Object
    //   40: dup
    //   41: iconst_0
    //   42: aload_2
    //   43: aastore
    //   44: invokestatic 117	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   47: goto -28 -> 19
    //   50: astore_1
    //   51: aload_0
    //   52: monitorexit
    //   53: aload_1
    //   54: athrow
    //   55: astore_2
    //   56: ldc 88
    //   58: ldc 115
    //   60: iconst_1
    //   61: anewarray 5	java/lang/Object
    //   64: dup
    //   65: iconst_0
    //   66: aload_2
    //   67: aastore
    //   68: invokestatic 117	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   71: goto -52 -> 19
    //   74: astore_2
    //   75: ldc 88
    //   77: ldc 115
    //   79: iconst_1
    //   80: anewarray 5	java/lang/Object
    //   83: dup
    //   84: iconst_0
    //   85: aload_2
    //   86: aastore
    //   87: invokestatic 117	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   90: goto -71 -> 19
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	93	0	this	a
    //   11	19	1	localObject1	Object
    //   50	4	1	localObject2	Object
    //   16	2	2	localObject3	Object
    //   31	12	2	localNoSuchFieldException	NoSuchFieldException
    //   55	12	2	localIllegalAccessException	IllegalAccessException
    //   74	12	2	localIllegalArgumentException	IllegalArgumentException
    // Exception table:
    //   from	to	target	type
    //   12	17	31	java/lang/NoSuchFieldException
    //   2	10	50	finally
    //   12	17	50	finally
    //   19	27	50	finally
    //   32	47	50	finally
    //   56	71	50	finally
    //   75	90	50	finally
    //   12	17	55	java/lang/IllegalAccessException
    //   12	17	74	java/lang/IllegalArgumentException
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ipcinvoker\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */