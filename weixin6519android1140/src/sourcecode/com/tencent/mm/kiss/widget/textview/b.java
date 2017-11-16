package com.tencent.mm.kiss.widget.textview;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public final class b
{
  public ConcurrentHashMap<String, LinkedList<f>> gaV;
  
  public b()
  {
    GMTrace.i(432315301888L, 3221);
    this.gaV = new ConcurrentHashMap();
    GMTrace.o(432315301888L, 3221);
  }
  
  /* Error */
  public final void a(f paramf)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 31
    //   5: sipush 3222
    //   8: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_1
    //   12: ifnull +10 -> 22
    //   15: aload_1
    //   16: getfield 38	com/tencent/mm/kiss/widget/textview/f:gbz	Ljava/lang/CharSequence;
    //   19: ifnonnull +15 -> 34
    //   22: ldc2_w 31
    //   25: sipush 3222
    //   28: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   31: aload_0
    //   32: monitorexit
    //   33: return
    //   34: aload_0
    //   35: getfield 24	com/tencent/mm/kiss/widget/textview/b:gaV	Ljava/util/concurrent/ConcurrentHashMap;
    //   38: aload_1
    //   39: getfield 38	com/tencent/mm/kiss/widget/textview/f:gbz	Ljava/lang/CharSequence;
    //   42: invokeinterface 44 1 0
    //   47: invokevirtual 48	java/util/concurrent/ConcurrentHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   50: checkcast 50	java/util/LinkedList
    //   53: astore_3
    //   54: aload_3
    //   55: astore_2
    //   56: aload_3
    //   57: ifnonnull +11 -> 68
    //   60: new 50	java/util/LinkedList
    //   63: dup
    //   64: invokespecial 51	java/util/LinkedList:<init>	()V
    //   67: astore_2
    //   68: aload_2
    //   69: aload_1
    //   70: invokevirtual 55	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   73: pop
    //   74: aload_0
    //   75: getfield 24	com/tencent/mm/kiss/widget/textview/b:gaV	Ljava/util/concurrent/ConcurrentHashMap;
    //   78: aload_1
    //   79: getfield 38	com/tencent/mm/kiss/widget/textview/f:gbz	Ljava/lang/CharSequence;
    //   82: invokeinterface 44 1 0
    //   87: aload_2
    //   88: invokevirtual 59	java/util/concurrent/ConcurrentHashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   91: pop
    //   92: ldc2_w 31
    //   95: sipush 3222
    //   98: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   101: goto -70 -> 31
    //   104: astore_1
    //   105: aload_0
    //   106: monitorexit
    //   107: aload_1
    //   108: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	this	b
    //   0	109	1	paramf	f
    //   55	33	2	localLinkedList1	LinkedList
    //   53	4	3	localLinkedList2	LinkedList
    // Exception table:
    //   from	to	target	type
    //   2	11	104	finally
    //   15	22	104	finally
    //   22	31	104	finally
    //   34	54	104	finally
    //   60	68	104	finally
    //   68	101	104	finally
  }
  
  /* Error */
  public final f n(CharSequence paramCharSequence)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 62
    //   5: sipush 3223
    //   8: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 24	com/tencent/mm/kiss/widget/textview/b:gaV	Ljava/util/concurrent/ConcurrentHashMap;
    //   15: aload_1
    //   16: invokeinterface 44 1 0
    //   21: invokevirtual 48	java/util/concurrent/ConcurrentHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   24: checkcast 50	java/util/LinkedList
    //   27: astore_1
    //   28: aload_1
    //   29: ifnull +10 -> 39
    //   32: aload_1
    //   33: invokevirtual 67	java/util/LinkedList:size	()I
    //   36: ifne +18 -> 54
    //   39: aconst_null
    //   40: astore_1
    //   41: ldc2_w 62
    //   44: sipush 3223
    //   47: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   50: aload_0
    //   51: monitorexit
    //   52: aload_1
    //   53: areturn
    //   54: aload_1
    //   55: invokevirtual 71	java/util/LinkedList:removeFirst	()Ljava/lang/Object;
    //   58: checkcast 34	com/tencent/mm/kiss/widget/textview/f
    //   61: astore_1
    //   62: ldc2_w 62
    //   65: sipush 3223
    //   68: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   71: goto -21 -> 50
    //   74: astore_1
    //   75: aload_0
    //   76: monitorexit
    //   77: aload_1
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	b
    //   0	79	1	paramCharSequence	CharSequence
    // Exception table:
    //   from	to	target	type
    //   2	28	74	finally
    //   32	39	74	finally
    //   41	50	74	finally
    //   54	71	74	finally
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\kiss\widget\textview\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */