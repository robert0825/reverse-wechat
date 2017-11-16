package com.tencent.mm.network;

import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;

public final class ae
{
  private static ae hhT;
  private HashMap<Integer, a> hhU;
  
  static
  {
    GMTrace.i(13701750980608L, 102086);
    hhT = null;
    GMTrace.o(13701750980608L, 102086);
  }
  
  public ae()
  {
    GMTrace.i(13701348327424L, 102083);
    this.hhU = new HashMap();
    GMTrace.o(13701348327424L, 102083);
  }
  
  public static ae Pf()
  {
    try
    {
      GMTrace.i(13701482545152L, 102084);
      if (hhT == null) {
        hhT = new ae();
      }
      ae localae = hhT;
      GMTrace.o(13701482545152L, 102084);
      return localae;
    }
    finally {}
  }
  
  /* Error */
  public final int h(int paramInt, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 49
    //   5: ldc 51
    //   7: invokestatic 23	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: getfield 40	com/tencent/mm/network/ae:hhU	Ljava/util/HashMap;
    //   14: iload_1
    //   15: invokestatic 57	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   18: invokevirtual 61	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   21: checkcast 6	com/tencent/mm/network/ae$a
    //   24: astore 4
    //   26: aload_2
    //   27: ifnonnull +111 -> 138
    //   30: iconst_m1
    //   31: istore_3
    //   32: ldc 63
    //   34: ldc 65
    //   36: iconst_4
    //   37: anewarray 4	java/lang/Object
    //   40: dup
    //   41: iconst_0
    //   42: iload_1
    //   43: invokestatic 57	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   46: aastore
    //   47: dup
    //   48: iconst_1
    //   49: aload 4
    //   51: aastore
    //   52: dup
    //   53: iconst_2
    //   54: iload_3
    //   55: invokestatic 57	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   58: aastore
    //   59: dup
    //   60: iconst_3
    //   61: new 67	com/tencent/mm/sdk/platformtools/ah
    //   64: dup
    //   65: invokespecial 68	com/tencent/mm/sdk/platformtools/ah:<init>	()V
    //   68: aastore
    //   69: invokestatic 73	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   72: aload 4
    //   74: ifnonnull +76 -> 150
    //   77: aload_2
    //   78: ifnonnull +66 -> 144
    //   81: iconst_m1
    //   82: istore_3
    //   83: ldc 63
    //   85: ldc 75
    //   87: iconst_4
    //   88: anewarray 4	java/lang/Object
    //   91: dup
    //   92: iconst_0
    //   93: iload_1
    //   94: invokestatic 57	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   97: aastore
    //   98: dup
    //   99: iconst_1
    //   100: aload 4
    //   102: aastore
    //   103: dup
    //   104: iconst_2
    //   105: iload_3
    //   106: invokestatic 57	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   109: aastore
    //   110: dup
    //   111: iconst_3
    //   112: new 67	com/tencent/mm/sdk/platformtools/ah
    //   115: dup
    //   116: invokespecial 68	com/tencent/mm/sdk/platformtools/ah:<init>	()V
    //   119: aastore
    //   120: invokestatic 78	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   123: bipush -3
    //   125: istore_1
    //   126: ldc2_w 49
    //   129: ldc 51
    //   131: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   134: aload_0
    //   135: monitorexit
    //   136: iload_1
    //   137: ireturn
    //   138: aload_2
    //   139: arraylength
    //   140: istore_3
    //   141: goto -109 -> 32
    //   144: aload_2
    //   145: arraylength
    //   146: istore_3
    //   147: goto -64 -> 83
    //   150: aload 4
    //   152: invokeinterface 82 1 0
    //   157: istore_1
    //   158: ldc2_w 49
    //   161: ldc 51
    //   163: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   166: goto -32 -> 134
    //   169: astore_2
    //   170: aload_0
    //   171: monitorexit
    //   172: aload_2
    //   173: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	174	0	this	ae
    //   0	174	1	paramInt	int
    //   0	174	2	paramArrayOfByte	byte[]
    //   31	116	3	i	int
    //   24	127	4	locala	a
    // Exception table:
    //   from	to	target	type
    //   2	26	169	finally
    //   32	72	169	finally
    //   83	123	169	finally
    //   126	134	169	finally
    //   138	141	169	finally
    //   144	147	169	finally
    //   150	166	169	finally
  }
  
  public static abstract interface a
  {
    public abstract int Pg();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\network\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */