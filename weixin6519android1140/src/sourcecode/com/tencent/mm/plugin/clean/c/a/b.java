package com.tencent.mm.plugin.clean.c.a;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.HashSet;

public final class b
  implements c
{
  private HashSet<Long> jTA;
  public HashMap<Long, ae> jTz;
  
  public b()
  {
    this((byte)0);
    GMTrace.i(7049249292288L, 52521);
    GMTrace.o(7049249292288L, 52521);
  }
  
  private b(byte paramByte)
  {
    GMTrace.i(17412468506624L, 129733);
    this.jTA = new HashSet(5);
    this.jTz = new HashMap(5);
    paramByte = 0;
    while (paramByte <= 5)
    {
      e.d(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7048712421376L, 52517);
          Looper.prepare();
          ae localae = new ae(Looper.myLooper());
          b.this.jTz.put(Long.valueOf(Thread.currentThread().getId()), localae);
          Looper.loop();
          GMTrace.o(7048712421376L, 52517);
        }
      }, "ThreadController_handler", 1).start();
      paramByte += 1;
    }
    GMTrace.o(17412468506624L, 129733);
  }
  
  private void e(Long paramLong)
  {
    try
    {
      GMTrace.i(7049517727744L, 52523);
      if (this.jTA.remove(paramLong)) {
        w.d("MicroMsg.ThreadController", "thread is idle, id=%d", new Object[] { paramLong });
      }
      GMTrace.o(7049517727744L, 52523);
      return;
    }
    finally {}
  }
  
  /* Error */
  public final boolean b(a parama)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 86
    //   5: ldc 88
    //   7: invokestatic 28	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_1
    //   11: aload_0
    //   12: putfield 94	com/tencent/mm/plugin/clean/c/a/a:jTy	Lcom/tencent/mm/plugin/clean/c/a/c;
    //   15: ldc 76
    //   17: ldc 96
    //   19: iconst_1
    //   20: anewarray 4	java/lang/Object
    //   23: dup
    //   24: iconst_0
    //   25: aload_0
    //   26: getfield 44	com/tencent/mm/plugin/clean/c/a/b:jTA	Ljava/util/HashSet;
    //   29: invokevirtual 100	java/util/HashSet:toString	()Ljava/lang/String;
    //   32: aastore
    //   33: invokestatic 83	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   36: aload_0
    //   37: getfield 49	com/tencent/mm/plugin/clean/c/a/b:jTz	Ljava/util/HashMap;
    //   40: invokevirtual 104	java/util/HashMap:entrySet	()Ljava/util/Set;
    //   43: invokeinterface 110 1 0
    //   48: astore_3
    //   49: aload_3
    //   50: invokeinterface 116 1 0
    //   55: ifeq +75 -> 130
    //   58: aload_3
    //   59: invokeinterface 120 1 0
    //   64: checkcast 122	java/util/Map$Entry
    //   67: astore 4
    //   69: aload_0
    //   70: getfield 44	com/tencent/mm/plugin/clean/c/a/b:jTA	Ljava/util/HashSet;
    //   73: aload 4
    //   75: invokeinterface 125 1 0
    //   80: invokevirtual 128	java/util/HashSet:contains	(Ljava/lang/Object;)Z
    //   83: ifne -34 -> 49
    //   86: aload 4
    //   88: invokeinterface 131 1 0
    //   93: checkcast 133	com/tencent/mm/sdk/platformtools/ae
    //   96: aload_1
    //   97: invokevirtual 137	com/tencent/mm/sdk/platformtools/ae:post	(Ljava/lang/Runnable;)Z
    //   100: pop
    //   101: aload_0
    //   102: getfield 44	com/tencent/mm/plugin/clean/c/a/b:jTA	Ljava/util/HashSet;
    //   105: aload 4
    //   107: invokeinterface 125 1 0
    //   112: invokevirtual 140	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   115: pop
    //   116: ldc2_w 86
    //   119: ldc 88
    //   121: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   124: iconst_1
    //   125: istore_2
    //   126: aload_0
    //   127: monitorexit
    //   128: iload_2
    //   129: ireturn
    //   130: ldc2_w 86
    //   133: ldc 88
    //   135: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   138: iconst_0
    //   139: istore_2
    //   140: goto -14 -> 126
    //   143: astore_1
    //   144: aload_0
    //   145: monitorexit
    //   146: aload_1
    //   147: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	148	0	this	b
    //   0	148	1	parama	a
    //   125	15	2	bool	boolean
    //   48	11	3	localIterator	java.util.Iterator
    //   67	39	4	localEntry	java.util.Map.Entry
    // Exception table:
    //   from	to	target	type
    //   2	49	143	finally
    //   49	124	143	finally
    //   130	138	143	finally
  }
  
  public final void f(Long paramLong)
  {
    GMTrace.i(7049651945472L, 52524);
    e(paramLong);
    GMTrace.o(7049651945472L, 52524);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\clean\c\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */