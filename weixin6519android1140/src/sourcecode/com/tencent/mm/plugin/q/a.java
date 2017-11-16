package com.tencent.mm.plugin.q;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.azp;
import java.util.List;

public final class a
{
  private static List<a> mEW;
  private static String mEX;
  
  /* Error */
  public static List<a> Bz(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 15
    //   6: ldc 17
    //   8: invokestatic 23	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: ifnull +30 -> 42
    //   15: aload_0
    //   16: getstatic 25	com/tencent/mm/plugin/q/a:mEX	Ljava/lang/String;
    //   19: invokevirtual 31	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   22: ifeq +20 -> 42
    //   25: getstatic 33	com/tencent/mm/plugin/q/a:mEW	Ljava/util/List;
    //   28: astore_0
    //   29: ldc2_w 15
    //   32: ldc 17
    //   34: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   37: ldc 2
    //   39: monitorexit
    //   40: aload_0
    //   41: areturn
    //   42: aconst_null
    //   43: astore_0
    //   44: ldc2_w 15
    //   47: ldc 17
    //   49: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   52: goto -15 -> 37
    //   55: astore_0
    //   56: ldc 2
    //   58: monitorexit
    //   59: aload_0
    //   60: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	61	0	paramString	String
    // Exception table:
    //   from	to	target	type
    //   3	11	55	finally
    //   15	37	55	finally
    //   44	52	55	finally
  }
  
  public static void i(String paramString, List<a> paramList)
  {
    try
    {
      GMTrace.i(18657472151552L, 139009);
      mEX = paramString;
      mEW = paramList;
      GMTrace.o(18657472151552L, 139009);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public static final class a
  {
    public String iAx;
    public int mEY;
    public azp mEZ;
    
    public a()
    {
      GMTrace.i(18657740587008L, 139011);
      GMTrace.o(18657740587008L, 139011);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\q\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */