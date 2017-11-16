package com.tencent.mm.plugin.freewifi.b;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class a
{
  private boolean lpu;
  private Map<String, b> lpv;
  
  public a()
  {
    GMTrace.i(7122532171776L, 53067);
    this.lpu = false;
    this.lpv = new LinkedHashMap()
    {
      protected final boolean removeEldestEntry(Map.Entry paramAnonymousEntry)
      {
        GMTrace.i(7124008566784L, 53078);
        if (size() > 512)
        {
          GMTrace.o(7124008566784L, 53078);
          return true;
        }
        GMTrace.o(7124008566784L, 53078);
        return false;
      }
    };
    GMTrace.o(7122532171776L, 53067);
  }
  
  private static String ci(String paramString1, String paramString2)
  {
    GMTrace.i(7122666389504L, 53068);
    paramString1 = paramString1 + "-" + paramString2;
    GMTrace.o(7122666389504L, 53068);
    return paramString1;
  }
  
  /* Error */
  public final void c(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 62
    //   5: ldc 64
    //   7: invokestatic 30	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_1
    //   11: invokestatic 70	com/tencent/mm/plugin/freewifi/m:yp	(Ljava/lang/String;)Z
    //   14: ifne +30 -> 44
    //   17: aload_2
    //   18: invokestatic 70	com/tencent/mm/plugin/freewifi/m:yp	(Ljava/lang/String;)Z
    //   21: ifne +23 -> 44
    //   24: aload_3
    //   25: invokestatic 70	com/tencent/mm/plugin/freewifi/m:yp	(Ljava/lang/String;)Z
    //   28: ifne +16 -> 44
    //   31: iload 4
    //   33: iconst_4
    //   34: if_icmpeq +21 -> 55
    //   37: iload 4
    //   39: bipush 31
    //   41: if_icmpeq +14 -> 55
    //   44: ldc2_w 62
    //   47: ldc 64
    //   49: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   52: aload_0
    //   53: monitorexit
    //   54: return
    //   55: new 11	com/tencent/mm/plugin/freewifi/b/a$b
    //   58: dup
    //   59: invokespecial 71	com/tencent/mm/plugin/freewifi/b/a$b:<init>	()V
    //   62: astore 5
    //   64: aload 5
    //   66: aload_3
    //   67: putfield 75	com/tencent/mm/plugin/freewifi/b/a$b:eCE	Ljava/lang/String;
    //   70: aload 5
    //   72: iload 4
    //   74: putfield 79	com/tencent/mm/plugin/freewifi/b/a$b:low	I
    //   77: aload_0
    //   78: getfield 37	com/tencent/mm/plugin/freewifi/b/a:lpv	Ljava/util/Map;
    //   81: aload_1
    //   82: aload_2
    //   83: invokestatic 81	com/tencent/mm/plugin/freewifi/b/a:ci	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   86: aload 5
    //   88: invokeinterface 87 3 0
    //   93: pop
    //   94: ldc2_w 62
    //   97: ldc 64
    //   99: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   102: goto -50 -> 52
    //   105: astore_1
    //   106: aload_0
    //   107: monitorexit
    //   108: aload_1
    //   109: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	110	0	this	a
    //   0	110	1	paramString1	String
    //   0	110	2	paramString2	String
    //   0	110	3	paramString3	String
    //   0	110	4	paramInt	int
    //   62	25	5	localb	b
    // Exception table:
    //   from	to	target	type
    //   2	31	105	finally
    //   44	52	105	finally
    //   55	102	105	finally
  }
  
  /* Error */
  public final b cj(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 90
    //   5: ldc 92
    //   7: invokestatic 30	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_1
    //   11: invokestatic 70	com/tencent/mm/plugin/freewifi/m:yp	(Ljava/lang/String;)Z
    //   14: ifne +10 -> 24
    //   17: aload_2
    //   18: invokestatic 70	com/tencent/mm/plugin/freewifi/m:yp	(Ljava/lang/String;)Z
    //   21: ifeq +17 -> 38
    //   24: aconst_null
    //   25: astore_1
    //   26: ldc2_w 90
    //   29: ldc 92
    //   31: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_1
    //   37: areturn
    //   38: aload_0
    //   39: getfield 37	com/tencent/mm/plugin/freewifi/b/a:lpv	Ljava/util/Map;
    //   42: aload_1
    //   43: aload_2
    //   44: invokestatic 81	com/tencent/mm/plugin/freewifi/b/a:ci	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   47: invokeinterface 96 2 0
    //   52: checkcast 11	com/tencent/mm/plugin/freewifi/b/a$b
    //   55: astore_1
    //   56: ldc2_w 90
    //   59: ldc 92
    //   61: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   64: goto -30 -> 34
    //   67: astore_1
    //   68: aload_0
    //   69: monitorexit
    //   70: aload_1
    //   71: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	72	0	this	a
    //   0	72	1	paramString1	String
    //   0	72	2	paramString2	String
    // Exception table:
    //   from	to	target	type
    //   2	24	67	finally
    //   26	34	67	finally
    //   38	64	67	finally
  }
  
  public final int size()
  {
    try
    {
      GMTrace.i(7123069042688L, 53071);
      int i = this.lpv.size();
      GMTrace.o(7123069042688L, 53071);
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private static final class a
  {
    public static a lpx;
    
    static
    {
      GMTrace.i(7122397954048L, 53066);
      lpx = new a();
      GMTrace.o(7122397954048L, 53066);
    }
  }
  
  public static final class b
  {
    String eCE;
    int low;
    
    public b()
    {
      GMTrace.i(7121592647680L, 53060);
      GMTrace.o(7121592647680L, 53060);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */