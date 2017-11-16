package com.tencent.mm.plugin.freewifi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.freewifi.g.b;
import com.tencent.mm.plugin.freewifi.model.j;

public final class i
{
  private b lof;
  
  public i()
  {
    GMTrace.i(7146422927360L, 53245);
    this.lof = j.aBf();
    GMTrace.o(7146422927360L, 53245);
  }
  
  public final void aZ(String paramString, int paramInt)
  {
    try
    {
      GMTrace.i(7146959798272L, 53249);
      this.lof.cl(paramString, String.valueOf(paramInt));
      GMTrace.o(7146959798272L, 53249);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  /* Error */
  public final int getInt(String paramString, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 56
    //   5: ldc 58
    //   7: invokestatic 22	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_1
    //   11: invokestatic 64	com/tencent/mm/plugin/freewifi/m:yp	(Ljava/lang/String;)Z
    //   14: ifeq +15 -> 29
    //   17: ldc2_w 56
    //   20: ldc 58
    //   22: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   25: aload_0
    //   26: monitorexit
    //   27: iload_2
    //   28: ireturn
    //   29: aload_0
    //   30: getfield 30	com/tencent/mm/plugin/freewifi/i:lof	Lcom/tencent/mm/plugin/freewifi/g/b;
    //   33: aload_1
    //   34: invokevirtual 68	com/tencent/mm/plugin/freewifi/g/b:yF	(Ljava/lang/String;)Ljava/lang/String;
    //   37: astore_1
    //   38: aload_1
    //   39: invokestatic 64	com/tencent/mm/plugin/freewifi/m:yp	(Ljava/lang/String;)Z
    //   42: istore 4
    //   44: iload 4
    //   46: ifeq +19 -> 65
    //   49: ldc2_w 56
    //   52: ldc 58
    //   54: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   57: goto -32 -> 25
    //   60: astore_1
    //   61: aload_0
    //   62: monitorexit
    //   63: aload_1
    //   64: athrow
    //   65: aload_1
    //   66: invokestatic 73	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   69: invokevirtual 77	java/lang/Integer:intValue	()I
    //   72: istore_3
    //   73: iload_3
    //   74: istore_2
    //   75: ldc2_w 56
    //   78: ldc 58
    //   80: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   83: goto -58 -> 25
    //   86: astore_1
    //   87: ldc2_w 56
    //   90: ldc 58
    //   92: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   95: goto -70 -> 25
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	i
    //   0	98	1	paramString	String
    //   0	98	2	paramInt	int
    //   72	2	3	i	int
    //   42	3	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	25	60	finally
    //   29	44	60	finally
    //   49	57	60	finally
    //   65	73	60	finally
    //   75	83	60	finally
    //   87	95	60	finally
    //   29	44	86	java/lang/Exception
    //   65	73	86	java/lang/Exception
  }
  
  /* Error */
  public final long nn(String paramString)
  {
    // Byte code:
    //   0: lconst_0
    //   1: lstore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: ldc2_w 80
    //   7: ldc 82
    //   9: invokestatic 22	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: aload_1
    //   13: invokestatic 64	com/tencent/mm/plugin/freewifi/m:yp	(Ljava/lang/String;)Z
    //   16: ifeq +15 -> 31
    //   19: ldc2_w 80
    //   22: ldc 82
    //   24: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   27: aload_0
    //   28: monitorexit
    //   29: lload_2
    //   30: lreturn
    //   31: aload_0
    //   32: getfield 30	com/tencent/mm/plugin/freewifi/i:lof	Lcom/tencent/mm/plugin/freewifi/g/b;
    //   35: aload_1
    //   36: invokevirtual 68	com/tencent/mm/plugin/freewifi/g/b:yF	(Ljava/lang/String;)Ljava/lang/String;
    //   39: astore_1
    //   40: aload_1
    //   41: invokestatic 64	com/tencent/mm/plugin/freewifi/m:yp	(Ljava/lang/String;)Z
    //   44: istore 6
    //   46: iload 6
    //   48: ifeq +19 -> 67
    //   51: ldc2_w 80
    //   54: ldc 82
    //   56: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   59: goto -32 -> 27
    //   62: astore_1
    //   63: aload_0
    //   64: monitorexit
    //   65: aload_1
    //   66: athrow
    //   67: aload_1
    //   68: invokestatic 87	java/lang/Long:valueOf	(Ljava/lang/String;)Ljava/lang/Long;
    //   71: invokevirtual 91	java/lang/Long:longValue	()J
    //   74: lstore 4
    //   76: lload 4
    //   78: lstore_2
    //   79: ldc2_w 80
    //   82: ldc 82
    //   84: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   87: goto -60 -> 27
    //   90: astore_1
    //   91: ldc2_w 80
    //   94: ldc 82
    //   96: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   99: goto -72 -> 27
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	102	0	this	i
    //   0	102	1	paramString	String
    //   1	78	2	l1	long
    //   74	3	4	l2	long
    //   44	3	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   4	27	62	finally
    //   31	46	62	finally
    //   51	59	62	finally
    //   67	76	62	finally
    //   79	87	62	finally
    //   91	99	62	finally
    //   31	46	90	java/lang/Exception
    //   67	76	90	java/lang/Exception
  }
  
  public final void w(String paramString, long paramLong)
  {
    try
    {
      GMTrace.i(7146825580544L, 53248);
      this.lof.cl(paramString, String.valueOf(paramLong));
      GMTrace.o(7146825580544L, 53248);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  private static final class a
  {
    public static i loq;
    
    static
    {
      GMTrace.i(7266547793920L, 54140);
      loq = new i();
      GMTrace.o(7266547793920L, 54140);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */