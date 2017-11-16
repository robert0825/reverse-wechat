package com.tencent.mm.plugin.sport.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.storage.s;

public final class g
  extends s
{
  public g(String paramString)
  {
    super(paramString);
    GMTrace.i(16730239795200L, 124650);
    GMTrace.o(16730239795200L, 124650);
  }
  
  public final long getLong(int paramInt, long paramLong)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(16730374012928L, 124651);
        Object localObject1 = get(paramInt);
        if ((localObject1 instanceof Long))
        {
          paramLong = ((Long)localObject1).longValue();
          GMTrace.o(16730374012928L, 124651);
          return paramLong;
        }
        if ((localObject1 instanceof Integer))
        {
          paramLong = ((Integer)localObject1).longValue();
          GMTrace.o(16730374012928L, 124651);
        }
        else
        {
          GMTrace.o(16730374012928L, 124651);
        }
      }
      finally {}
    }
  }
  
  /* Error */
  public final String getString(int paramInt, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 42
    //   5: ldc 44
    //   7: invokestatic 17	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: iconst_2
    //   12: invokevirtual 30	com/tencent/mm/plugin/sport/c/g:get	(I)Ljava/lang/Object;
    //   15: astore_3
    //   16: aload_3
    //   17: instanceof 46
    //   20: ifeq +20 -> 40
    //   23: aload_3
    //   24: checkcast 46	java/lang/String
    //   27: astore_2
    //   28: ldc2_w 42
    //   31: ldc 44
    //   33: invokestatic 20	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_2
    //   39: areturn
    //   40: ldc2_w 42
    //   43: ldc 44
    //   45: invokestatic 20	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   48: goto -12 -> 36
    //   51: astore_2
    //   52: aload_0
    //   53: monitorexit
    //   54: aload_2
    //   55: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	this	g
    //   0	56	1	paramInt	int
    //   0	56	2	paramString	String
    //   15	9	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	36	51	finally
    //   40	48	51	finally
  }
  
  public final void setString(int paramInt, String paramString)
  {
    try
    {
      GMTrace.i(16730508230656L, 124652);
      set(2, paramString);
      GMTrace.o(16730508230656L, 124652);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sport\c\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */