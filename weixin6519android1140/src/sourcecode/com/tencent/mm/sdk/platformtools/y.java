package com.tencent.mm.sdk.platformtools;

import com.tencent.gmtrace.GMTrace;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class y<K, V>
{
  private int createCount;
  private int evictionCount;
  private int hitCount;
  private final LinkedHashMap<K, V> map;
  private int maxSize;
  private int missCount;
  private int putCount;
  private int size;
  
  public y(int paramInt)
  {
    GMTrace.i(13907238322176L, 103617);
    if (paramInt <= 0) {
      throw new IllegalArgumentException("maxSize <= 0");
    }
    this.maxSize = paramInt;
    this.map = new LinkedHashMap(0, 0.75F, true);
    GMTrace.o(13907238322176L, 103617);
  }
  
  private int safeSizeOf(K paramK, V paramV)
  {
    GMTrace.i(13908446281728L, 103626);
    int i = sizeOf(paramK, paramV);
    if (i < 0) {
      throw new IllegalStateException("Negative size: " + paramK + "=" + paramV);
    }
    GMTrace.o(13908446281728L, 103626);
    return i;
  }
  
  /* Error */
  public final boolean bE(K paramK)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 85
    //   5: ldc 87
    //   7: invokestatic 30	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: aload_1
    //   12: invokevirtual 91	com/tencent/mm/sdk/platformtools/y:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   15: ifnull +17 -> 32
    //   18: iconst_1
    //   19: istore_2
    //   20: ldc2_w 85
    //   23: ldc 87
    //   25: invokestatic 50	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   28: aload_0
    //   29: monitorexit
    //   30: iload_2
    //   31: ireturn
    //   32: iconst_0
    //   33: istore_2
    //   34: ldc2_w 85
    //   37: ldc 87
    //   39: invokestatic 50	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   42: goto -14 -> 28
    //   45: astore_1
    //   46: aload_0
    //   47: monitorexit
    //   48: aload_1
    //   49: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	50	0	this	y
    //   0	50	1	paramK	K
    //   19	15	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	18	45	finally
    //   20	28	45	finally
    //   34	42	45	finally
  }
  
  public final boolean ba(K paramK)
  {
    try
    {
      GMTrace.i(13907372539904L, 103618);
      boolean bool = this.map.containsKey(paramK);
      GMTrace.o(13907372539904L, 103618);
      return bool;
    }
    finally
    {
      paramK = finally;
      throw paramK;
    }
  }
  
  public V create(K paramK)
  {
    GMTrace.i(13908312064000L, 103625);
    GMTrace.o(13908312064000L, 103625);
    return null;
  }
  
  public final int createCount()
  {
    try
    {
      GMTrace.i(13909251588096L, 103632);
      int i = this.createCount;
      GMTrace.o(13909251588096L, 103632);
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void entryRemoved(boolean paramBoolean, K paramK, V paramV1, V paramV2)
  {
    GMTrace.i(13908177846272L, 103624);
    GMTrace.o(13908177846272L, 103624);
  }
  
  public final int evictionCount()
  {
    try
    {
      GMTrace.i(13909520023552L, 103634);
      int i = this.evictionCount;
      GMTrace.o(13909520023552L, 103634);
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final V get(K paramK)
  {
    GMTrace.i(13907640975360L, 103620);
    if (paramK == null) {
      throw new NullPointerException("key == null");
    }
    Object localObject1;
    try
    {
      localObject1 = this.map.get(paramK);
      if (localObject1 != null)
      {
        this.hitCount += 1;
        GMTrace.o(13907640975360L, 103620);
        return (V)localObject1;
      }
      this.missCount += 1;
      localObject1 = create(paramK);
      if (localObject1 == null)
      {
        GMTrace.o(13907640975360L, 103620);
        return null;
      }
    }
    finally {}
    try
    {
      this.createCount += 1;
      Object localObject2 = this.map.put(paramK, localObject1);
      if (localObject2 != null) {
        this.map.put(paramK, localObject2);
      }
      for (;;)
      {
        if (localObject2 == null) {
          break;
        }
        entryRemoved(false, paramK, localObject1, localObject2);
        GMTrace.o(13907640975360L, 103620);
        return (V)localObject2;
        this.size += safeSizeOf(paramK, localObject1);
      }
      trimToSize(this.maxSize);
    }
    finally {}
    GMTrace.o(13907640975360L, 103620);
    return (V)localObject1;
  }
  
  public final int hitCount()
  {
    try
    {
      GMTrace.i(13908983152640L, 103630);
      int i = this.hitCount;
      GMTrace.o(13908983152640L, 103630);
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int maxSize()
  {
    try
    {
      GMTrace.i(13908848934912L, 103629);
      int i = this.maxSize;
      GMTrace.o(13908848934912L, 103629);
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int missCount()
  {
    try
    {
      GMTrace.i(13909117370368L, 103631);
      int i = this.missCount;
      GMTrace.o(13909117370368L, 103631);
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final V put(K paramK, V paramV)
  {
    GMTrace.i(13907775193088L, 103621);
    if ((paramK == null) || (paramV == null)) {
      throw new NullPointerException("key == null || value == null");
    }
    try
    {
      this.putCount += 1;
      this.size += safeSizeOf(paramK, paramV);
      Object localObject = this.map.put(paramK, paramV);
      if (localObject != null) {
        this.size -= safeSizeOf(paramK, localObject);
      }
      if (localObject != null) {
        entryRemoved(false, paramK, localObject, paramV);
      }
      trimToSize(this.maxSize);
      GMTrace.o(13907775193088L, 103621);
      return (V)localObject;
    }
    finally {}
  }
  
  public final int putCount()
  {
    try
    {
      GMTrace.i(13909385805824L, 103633);
      int i = this.putCount;
      GMTrace.o(13909385805824L, 103633);
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final V remove(K paramK)
  {
    GMTrace.i(13908043628544L, 103623);
    if (paramK == null) {
      throw new NullPointerException("key == null");
    }
    try
    {
      Object localObject = this.map.remove(paramK);
      if (localObject != null) {
        this.size -= safeSizeOf(paramK, localObject);
      }
      if (localObject != null) {
        entryRemoved(false, paramK, localObject, null);
      }
      GMTrace.o(13908043628544L, 103623);
      return (V)localObject;
    }
    finally {}
  }
  
  public final int size()
  {
    try
    {
      GMTrace.i(13908714717184L, 103628);
      int i = this.size;
      GMTrace.o(13908714717184L, 103628);
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int sizeOf(K paramK, V paramV)
  {
    GMTrace.i(13908580499456L, 103627);
    GMTrace.o(13908580499456L, 103627);
    return 1;
  }
  
  public final Map<K, V> snapshot()
  {
    try
    {
      GMTrace.i(13909654241280L, 103635);
      LinkedHashMap localLinkedHashMap = new LinkedHashMap(this.map);
      GMTrace.o(13909654241280L, 103635);
      return localLinkedHashMap;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String toString()
  {
    int i = 0;
    try
    {
      GMTrace.i(13909788459008L, 103636);
      int j = this.hitCount + this.missCount;
      if (j != 0) {
        i = this.hitCount * 100 / j;
      }
      String str = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[] { Integer.valueOf(this.maxSize), Integer.valueOf(this.hitCount), Integer.valueOf(this.missCount), Integer.valueOf(i) });
      GMTrace.o(13909788459008L, 103636);
      return str;
    }
    finally {}
  }
  
  public void trimToSize(int paramInt)
  {
    GMTrace.i(13907909410816L, 103622);
    Object localObject3;
    Object localObject2;
    try
    {
      if ((this.size < 0) || ((this.map.isEmpty()) && (this.size != 0))) {
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
      }
    }
    finally
    {
      throw ((Throwable)localObject1);
      if ((this.size <= paramInt) || (this.map.isEmpty()))
      {
        GMTrace.o(13907909410816L, 103622);
        return;
      }
      localObject3 = (Map.Entry)this.map.entrySet().iterator().next();
      localObject2 = ((Map.Entry)localObject3).getKey();
      localObject3 = ((Map.Entry)localObject3).getValue();
      this.map.remove(localObject2);
      this.size -= safeSizeOf(localObject2, localObject3);
      this.evictionCount += 1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */