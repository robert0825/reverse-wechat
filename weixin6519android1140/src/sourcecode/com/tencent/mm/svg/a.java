package com.tencent.mm.svg;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.LinkedList;

final class a<T>
{
  private HashMap<Looper, LinkedList<T>> vEj;
  private LinkedList<T> vEk;
  
  a()
  {
    GMTrace.i(3491808411648L, 26016);
    this.vEj = new HashMap();
    this.vEk = new LinkedList();
    GMTrace.o(3491808411648L, 26016);
  }
  
  /* Error */
  protected final void a(Looper paramLooper, T paramT)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 40
    //   5: sipush 26018
    //   8: invokestatic 23	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 28	com/tencent/mm/svg/a:vEj	Ljava/util/HashMap;
    //   15: aload_1
    //   16: invokevirtual 45	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   19: ifne +41 -> 60
    //   22: new 30	java/util/LinkedList
    //   25: dup
    //   26: invokespecial 31	java/util/LinkedList:<init>	()V
    //   29: astore_3
    //   30: aload_0
    //   31: getfield 28	com/tencent/mm/svg/a:vEj	Ljava/util/HashMap;
    //   34: aload_1
    //   35: aload_3
    //   36: invokevirtual 49	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   39: pop
    //   40: aload_3
    //   41: astore_1
    //   42: aload_1
    //   43: aload_2
    //   44: invokevirtual 52	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   47: pop
    //   48: ldc2_w 40
    //   51: sipush 26018
    //   54: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   57: aload_0
    //   58: monitorexit
    //   59: return
    //   60: aload_0
    //   61: getfield 28	com/tencent/mm/svg/a:vEj	Ljava/util/HashMap;
    //   64: aload_1
    //   65: invokevirtual 56	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   68: checkcast 30	java/util/LinkedList
    //   71: astore_1
    //   72: goto -30 -> 42
    //   75: astore_1
    //   76: aload_0
    //   77: monitorexit
    //   78: aload_1
    //   79: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	this	a
    //   0	80	1	paramLooper	Looper
    //   0	80	2	paramT	T
    //   29	12	3	localLinkedList	LinkedList
    // Exception table:
    //   from	to	target	type
    //   2	40	75	finally
    //   42	57	75	finally
    //   60	72	75	finally
  }
  
  protected final void b(Looper paramLooper)
  {
    try
    {
      GMTrace.i(3492211064832L, 26019);
      if (this.vEj.containsKey(paramLooper))
      {
        paramLooper = (LinkedList)this.vEj.remove(paramLooper);
        this.vEk.addAll(paramLooper);
      }
      GMTrace.o(3492211064832L, 26019);
      return;
    }
    finally {}
  }
  
  protected final T bVp()
  {
    try
    {
      GMTrace.i(3491942629376L, 26017);
      Object localObject1 = null;
      if (this.vEk.size() != 0) {
        localObject1 = this.vEk.poll();
      }
      GMTrace.o(3491942629376L, 26017);
      return (T)localObject1;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\svg\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */