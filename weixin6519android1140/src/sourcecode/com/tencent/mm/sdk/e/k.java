package com.tencent.mm.sdk.e;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

public abstract class k<T, E>
{
  public int vmA;
  private final Hashtable<T, Object> vmB;
  private final HashSet<E> vmC;
  
  public k()
  {
    GMTrace.i(13961193848832L, 104019);
    this.vmA = 0;
    this.vmB = new Hashtable();
    this.vmC = new HashSet();
    GMTrace.o(13961193848832L, 104019);
  }
  
  private Vector<T> bRn()
  {
    try
    {
      GMTrace.i(13961999155200L, 104025);
      Vector localVector = new Vector();
      localVector.addAll(this.vmB.keySet());
      GMTrace.o(13961999155200L, 104025);
      return localVector;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void bRo()
  {
    GMTrace.i(13962401808384L, 104028);
    Object localObject1 = bRn();
    if (((Vector)localObject1).size() <= 0)
    {
      this.vmC.clear();
      GMTrace.o(13962401808384L, 104028);
      return;
    }
    for (;;)
    {
      final Object localObject4;
      final Object localObject6;
      synchronized (this.vmC)
      {
        ArrayList localArrayList = new ArrayList(this.vmC);
        this.vmC.clear();
        HashMap localHashMap = new HashMap();
        Iterator localIterator1 = ((Vector)localObject1).iterator();
        continue;
        if (!localIterator1.hasNext()) {
          break;
        }
        localObject4 = localIterator1.next();
        Object localObject5 = this.vmB.get(localObject4);
        Iterator localIterator2 = localArrayList.iterator();
        if (!localIterator2.hasNext()) {
          continue;
        }
        localObject6 = localIterator2.next();
        if ((localObject6 == null) || (localObject5 == null)) {
          continue;
        }
        if ((localObject5 instanceof Looper))
        {
          Looper localLooper = (Looper)localObject5;
          ??? = (ae)localHashMap.get(localLooper);
          localObject1 = ???;
          if (??? == null)
          {
            localObject1 = new ae(localLooper);
            localHashMap.put(localLooper, localObject1);
          }
          ((ae)localObject1).post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(13973944532992L, 104114);
              k.this.q(localObject4, localObject6);
              GMTrace.o(13973944532992L, 104114);
            }
          });
        }
      }
      q(localObject4, localObject6);
    }
    GMTrace.o(13962401808384L, 104028);
  }
  
  /* Error */
  public void a(T paramT, Looper paramLooper)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 130
    //   5: ldc -124
    //   7: invokestatic 28	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: getfield 35	com/tencent/mm/sdk/e/k:vmB	Ljava/util/Hashtable;
    //   14: aload_1
    //   15: invokevirtual 136	java/util/Hashtable:containsKey	(Ljava/lang/Object;)Z
    //   18: ifne +44 -> 62
    //   21: aload_2
    //   22: ifnull +24 -> 46
    //   25: aload_0
    //   26: getfield 35	com/tencent/mm/sdk/e/k:vmB	Ljava/util/Hashtable;
    //   29: aload_1
    //   30: aload_2
    //   31: invokevirtual 137	java/util/Hashtable:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   34: pop
    //   35: ldc2_w 130
    //   38: ldc -124
    //   40: invokestatic 43	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   43: aload_0
    //   44: monitorexit
    //   45: return
    //   46: aload_0
    //   47: getfield 35	com/tencent/mm/sdk/e/k:vmB	Ljava/util/Hashtable;
    //   50: aload_1
    //   51: new 5	java/lang/Object
    //   54: dup
    //   55: invokespecial 19	java/lang/Object:<init>	()V
    //   58: invokevirtual 137	java/util/Hashtable:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   61: pop
    //   62: ldc2_w 130
    //   65: ldc -124
    //   67: invokestatic 43	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   70: goto -27 -> 43
    //   73: astore_1
    //   74: aload_0
    //   75: monitorexit
    //   76: aload_1
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	k
    //   0	78	1	paramT	T
    //   0	78	2	paramLooper	Looper
    // Exception table:
    //   from	to	target	type
    //   2	21	73	finally
    //   25	43	73	finally
    //   46	62	73	finally
    //   62	70	73	finally
  }
  
  public final boolean bI(E paramE)
  {
    GMTrace.i(13962133372928L, 104026);
    synchronized (this.vmC)
    {
      boolean bool = this.vmC.add(paramE);
      GMTrace.o(13962133372928L, 104026);
      return bool;
    }
  }
  
  public final void doNotify()
  {
    GMTrace.i(13962267590656L, 104027);
    if (this.vmA > 0) {}
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        bRo();
      }
      GMTrace.o(13962267590656L, 104027);
      return;
    }
  }
  
  public final void lock()
  {
    GMTrace.i(13961328066560L, 104020);
    this.vmA += 1;
    GMTrace.o(13961328066560L, 104020);
  }
  
  public abstract void q(T paramT, E paramE);
  
  public final void remove(T paramT)
  {
    try
    {
      GMTrace.i(13961730719744L, 104023);
      this.vmB.remove(paramT);
      GMTrace.o(13961730719744L, 104023);
      return;
    }
    finally
    {
      paramT = finally;
      throw paramT;
    }
  }
  
  public final void removeAll()
  {
    try
    {
      GMTrace.i(13961864937472L, 104024);
      this.vmB.clear();
      GMTrace.o(13961864937472L, 104024);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void unlock()
  {
    GMTrace.i(13961462284288L, 104021);
    this.vmA -= 1;
    if (this.vmA <= 0)
    {
      this.vmA = 0;
      bRo();
    }
    GMTrace.o(13961462284288L, 104021);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\e\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */