package android.support.v4.e;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class f<K, V>
{
  private int evictionCount;
  private int hitCount;
  private final LinkedHashMap<K, V> map = new LinkedHashMap(0, 0.75F, true);
  private int maxSize = 6;
  private int missCount;
  private int putCount;
  private int size;
  
  public f(int paramInt) {}
  
  private void trimToSize(int paramInt)
  {
    try
    {
      if ((this.size < 0) || ((this.map.isEmpty()) && (this.size != 0))) {
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
      }
    }
    finally
    {
      throw ((Throwable)localObject1);
      if ((this.size <= paramInt) || (this.map.isEmpty())) {
        return;
      }
      Map.Entry localEntry = (Map.Entry)this.map.entrySet().iterator().next();
      Object localObject2 = localEntry.getKey();
      localEntry.getValue();
      this.map.remove(localObject2);
      this.size -= 1;
      this.evictionCount += 1;
    }
  }
  
  public final V get(K paramK)
  {
    if (paramK == null) {
      throw new NullPointerException("key == null");
    }
    try
    {
      paramK = this.map.get(paramK);
      if (paramK != null)
      {
        this.hitCount += 1;
        return paramK;
      }
      this.missCount += 1;
      return null;
    }
    finally {}
  }
  
  public final V put(K paramK, V paramV)
  {
    if (paramK == null) {
      throw new NullPointerException("key == null || value == null");
    }
    try
    {
      this.putCount += 1;
      this.size += 1;
      paramK = this.map.put(paramK, paramV);
      if (paramK != null) {
        this.size -= 1;
      }
      trimToSize(this.maxSize);
      return paramK;
    }
    finally {}
  }
  
  public final String toString()
  {
    int i = 0;
    try
    {
      int j = this.hitCount + this.missCount;
      if (j != 0) {
        i = this.hitCount * 100 / j;
      }
      String str = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[] { Integer.valueOf(this.maxSize), Integer.valueOf(this.hitCount), Integer.valueOf(this.missCount), Integer.valueOf(i) });
      return str;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\e\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */