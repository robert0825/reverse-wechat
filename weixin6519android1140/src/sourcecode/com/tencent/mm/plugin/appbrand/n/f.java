package com.tencent.mm.plugin.appbrand.n;

import com.tencent.gmtrace.GMTrace;

public final class f
{
  /* Error */
  public static <T> T a(Class<?> paramClass, String paramString, Object paramObject, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject, T paramT)
  {
    // Byte code:
    //   0: ldc2_w 9
    //   3: ldc 11
    //   5: invokestatic 17	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_2
    //   9: ifnonnull +13 -> 22
    //   12: new 19	java/lang/IllegalArgumentException
    //   15: dup
    //   16: ldc 21
    //   18: invokespecial 25	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   21: athrow
    //   22: aload_2
    //   23: invokevirtual 29	java/lang/Object:getClass	()Ljava/lang/Class;
    //   26: astore 6
    //   28: aconst_null
    //   29: astore 7
    //   31: aload 6
    //   33: ifnull +70 -> 103
    //   36: aload 6
    //   38: aload_1
    //   39: aload_3
    //   40: invokevirtual 35	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   43: astore 8
    //   45: aload 6
    //   47: invokevirtual 38	java/lang/Class:getSuperclass	()Ljava/lang/Class;
    //   50: astore 6
    //   52: aload 8
    //   54: astore 7
    //   56: goto -25 -> 31
    //   59: astore 8
    //   61: aload 7
    //   63: astore 8
    //   65: aload_0
    //   66: aload 6
    //   68: if_acmpne +12 -> 80
    //   71: aload 6
    //   73: aload_1
    //   74: aload_3
    //   75: invokevirtual 35	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   78: astore 8
    //   80: aload 6
    //   82: invokevirtual 38	java/lang/Class:getSuperclass	()Ljava/lang/Class;
    //   85: astore 6
    //   87: aload 8
    //   89: astore 7
    //   91: goto -60 -> 31
    //   94: astore_0
    //   95: aload 6
    //   97: invokevirtual 38	java/lang/Class:getSuperclass	()Ljava/lang/Class;
    //   100: pop
    //   101: aload_0
    //   102: athrow
    //   103: aload 7
    //   105: ifnonnull +14 -> 119
    //   108: ldc2_w 9
    //   111: ldc 11
    //   113: invokestatic 41	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   116: aload 5
    //   118: areturn
    //   119: aload 7
    //   121: iconst_1
    //   122: invokevirtual 47	java/lang/reflect/Method:setAccessible	(Z)V
    //   125: aload 7
    //   127: aload_2
    //   128: aload 4
    //   130: invokevirtual 51	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   133: astore_0
    //   134: ldc2_w 9
    //   137: ldc 11
    //   139: invokestatic 41	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   142: aload_0
    //   143: areturn
    //   144: astore_0
    //   145: ldc 53
    //   147: aload_0
    //   148: ldc 55
    //   150: iconst_0
    //   151: anewarray 4	java/lang/Object
    //   154: invokestatic 61	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   157: ldc2_w 9
    //   160: ldc 11
    //   162: invokestatic 41	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   165: aload 5
    //   167: areturn
    //   168: astore 8
    //   170: aload 7
    //   172: astore 8
    //   174: goto -94 -> 80
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	177	0	paramClass	Class<?>
    //   0	177	1	paramString	String
    //   0	177	2	paramObject	Object
    //   0	177	3	paramArrayOfClass	Class<?>[]
    //   0	177	4	paramArrayOfObject	Object[]
    //   0	177	5	paramT	T
    //   26	70	6	localClass	Class
    //   29	142	7	localObject1	Object
    //   43	10	8	localMethod	java.lang.reflect.Method
    //   59	1	8	localException1	Exception
    //   63	25	8	localObject2	Object
    //   168	1	8	localException2	Exception
    //   172	1	8	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   36	45	59	java/lang/Exception
    //   36	45	94	finally
    //   71	80	94	finally
    //   119	134	144	java/lang/Exception
    //   71	80	168	java/lang/Exception
  }
  
  public static <T> T a(String paramString, Object paramObject, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject, T paramT)
  {
    GMTrace.i(20015218688000L, 149125);
    paramString = a(null, paramString, paramObject, paramArrayOfClass, paramArrayOfObject, paramT);
    GMTrace.o(20015218688000L, 149125);
    return paramString;
  }
  
  public static <T> T e(String paramString, Object paramObject, T paramT)
  {
    GMTrace.i(20015352905728L, 149126);
    paramString = a(null, paramString, paramObject, null, null, paramT);
    GMTrace.o(20015352905728L, 149126);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\n\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */