package android.support.v4.e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class g<K, V>
{
  g<K, V>.b vn;
  g<K, V>.c vo;
  g<K, V>.e vp;
  
  public static <K, V> boolean a(Map<K, V> paramMap, Collection<?> paramCollection)
  {
    int i = paramMap.size();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext()) {
      if (!paramCollection.contains(localIterator.next())) {
        localIterator.remove();
      }
    }
    return i != paramMap.size();
  }
  
  public static <T> boolean a(Set<T> paramSet, Object paramObject)
  {
    if (paramSet == paramObject) {}
    for (;;)
    {
      return true;
      if ((paramObject instanceof Set))
      {
        paramObject = (Set)paramObject;
        try
        {
          if (paramSet.size() == ((Set)paramObject).size())
          {
            boolean bool = paramSet.containsAll((Collection)paramObject);
            if (bool) {}
          }
          else
          {
            return false;
          }
        }
        catch (NullPointerException paramSet)
        {
          return false;
        }
        catch (ClassCastException paramSet)
        {
          return false;
        }
      }
    }
    return false;
  }
  
  protected abstract void O(int paramInt);
  
  public final Object[] S(int paramInt)
  {
    int j = bA();
    Object[] arrayOfObject = new Object[j];
    int i = 0;
    while (i < j)
    {
      arrayOfObject[i] = j(i, paramInt);
      i += 1;
    }
    return arrayOfObject;
  }
  
  protected abstract V a(int paramInt, V paramV);
  
  public final <T> T[] a(T[] paramArrayOfT, int paramInt)
  {
    int j = bA();
    if (paramArrayOfT.length < j) {
      paramArrayOfT = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), j);
    }
    for (;;)
    {
      int i = 0;
      while (i < j)
      {
        paramArrayOfT[i] = j(i, paramInt);
        i += 1;
      }
      if (paramArrayOfT.length > j) {
        paramArrayOfT[j] = null;
      }
      return paramArrayOfT;
    }
  }
  
  protected abstract int bA();
  
  protected abstract Map<K, V> bB();
  
  protected abstract void bC();
  
  protected abstract void c(K paramK, V paramV);
  
  protected abstract int g(Object paramObject);
  
  protected abstract int h(Object paramObject);
  
  protected abstract Object j(int paramInt1, int paramInt2);
  
  final class a<T>
    implements Iterator<T>
  {
    int mIndex;
    int mSize;
    final int vq;
    boolean vr = false;
    
    a(int paramInt)
    {
      this.vq = paramInt;
      this.mSize = g.this.bA();
    }
    
    public final boolean hasNext()
    {
      return this.mIndex < this.mSize;
    }
    
    public final T next()
    {
      Object localObject = g.this.j(this.mIndex, this.vq);
      this.mIndex += 1;
      this.vr = true;
      return (T)localObject;
    }
    
    public final void remove()
    {
      if (!this.vr) {
        throw new IllegalStateException();
      }
      this.mIndex -= 1;
      this.mSize -= 1;
      this.vr = false;
      g.this.O(this.mIndex);
    }
  }
  
  final class b
    implements Set<Map.Entry<K, V>>
  {
    b() {}
    
    public final boolean addAll(Collection<? extends Map.Entry<K, V>> paramCollection)
    {
      int i = g.this.bA();
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramCollection.next();
        g.this.c(localEntry.getKey(), localEntry.getValue());
      }
      return i != g.this.bA();
    }
    
    public final void clear()
    {
      g.this.bC();
    }
    
    public final boolean contains(Object paramObject)
    {
      if (!(paramObject instanceof Map.Entry)) {}
      int i;
      do
      {
        return false;
        paramObject = (Map.Entry)paramObject;
        i = g.this.g(((Map.Entry)paramObject).getKey());
      } while (i < 0);
      return b.d(g.this.j(i, 1), ((Map.Entry)paramObject).getValue());
    }
    
    public final boolean containsAll(Collection<?> paramCollection)
    {
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext()) {
        if (!contains(paramCollection.next())) {
          return false;
        }
      }
      return true;
    }
    
    public final boolean equals(Object paramObject)
    {
      return g.a(this, paramObject);
    }
    
    public final int hashCode()
    {
      int j = g.this.bA() - 1;
      int i = 0;
      if (j >= 0)
      {
        Object localObject1 = g.this.j(j, 0);
        Object localObject2 = g.this.j(j, 1);
        int k;
        if (localObject1 == null)
        {
          k = 0;
          label45:
          if (localObject2 != null) {
            break label76;
          }
        }
        label76:
        for (int m = 0;; m = localObject2.hashCode())
        {
          j -= 1;
          i += (m ^ k);
          break;
          k = localObject1.hashCode();
          break label45;
        }
      }
      return i;
    }
    
    public final boolean isEmpty()
    {
      return g.this.bA() == 0;
    }
    
    public final Iterator<Map.Entry<K, V>> iterator()
    {
      return new g.d(g.this);
    }
    
    public final boolean remove(Object paramObject)
    {
      throw new UnsupportedOperationException();
    }
    
    public final boolean removeAll(Collection<?> paramCollection)
    {
      throw new UnsupportedOperationException();
    }
    
    public final boolean retainAll(Collection<?> paramCollection)
    {
      throw new UnsupportedOperationException();
    }
    
    public final int size()
    {
      return g.this.bA();
    }
    
    public final Object[] toArray()
    {
      throw new UnsupportedOperationException();
    }
    
    public final <T> T[] toArray(T[] paramArrayOfT)
    {
      throw new UnsupportedOperationException();
    }
  }
  
  final class c
    implements Set<K>
  {
    c() {}
    
    public final boolean add(K paramK)
    {
      throw new UnsupportedOperationException();
    }
    
    public final boolean addAll(Collection<? extends K> paramCollection)
    {
      throw new UnsupportedOperationException();
    }
    
    public final void clear()
    {
      g.this.bC();
    }
    
    public final boolean contains(Object paramObject)
    {
      return g.this.g(paramObject) >= 0;
    }
    
    public final boolean containsAll(Collection<?> paramCollection)
    {
      Map localMap = g.this.bB();
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext()) {
        if (!localMap.containsKey(paramCollection.next())) {
          return false;
        }
      }
      return true;
    }
    
    public final boolean equals(Object paramObject)
    {
      return g.a(this, paramObject);
    }
    
    public final int hashCode()
    {
      int i = g.this.bA() - 1;
      int j = 0;
      if (i >= 0)
      {
        Object localObject = g.this.j(i, 0);
        if (localObject == null) {}
        for (int k = 0;; k = localObject.hashCode())
        {
          j += k;
          i -= 1;
          break;
        }
      }
      return j;
    }
    
    public final boolean isEmpty()
    {
      return g.this.bA() == 0;
    }
    
    public final Iterator<K> iterator()
    {
      return new g.a(g.this, 0);
    }
    
    public final boolean remove(Object paramObject)
    {
      int i = g.this.g(paramObject);
      if (i >= 0)
      {
        g.this.O(i);
        return true;
      }
      return false;
    }
    
    public final boolean removeAll(Collection<?> paramCollection)
    {
      Map localMap = g.this.bB();
      int i = localMap.size();
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext()) {
        localMap.remove(paramCollection.next());
      }
      return i != localMap.size();
    }
    
    public final boolean retainAll(Collection<?> paramCollection)
    {
      return g.a(g.this.bB(), paramCollection);
    }
    
    public final int size()
    {
      return g.this.bA();
    }
    
    public final Object[] toArray()
    {
      return g.this.S(0);
    }
    
    public final <T> T[] toArray(T[] paramArrayOfT)
    {
      return g.this.a(paramArrayOfT, 0);
    }
  }
  
  final class d
    implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V>
  {
    int mIndex = -1;
    int vt = g.this.bA() - 1;
    boolean vu = false;
    
    d() {}
    
    public final boolean equals(Object paramObject)
    {
      if (!this.vu) {
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
      if (!(paramObject instanceof Map.Entry)) {}
      do
      {
        return false;
        paramObject = (Map.Entry)paramObject;
      } while ((!b.d(((Map.Entry)paramObject).getKey(), g.this.j(this.mIndex, 0))) || (!b.d(((Map.Entry)paramObject).getValue(), g.this.j(this.mIndex, 1))));
      return true;
    }
    
    public final K getKey()
    {
      if (!this.vu) {
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
      return (K)g.this.j(this.mIndex, 0);
    }
    
    public final V getValue()
    {
      if (!this.vu) {
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
      return (V)g.this.j(this.mIndex, 1);
    }
    
    public final boolean hasNext()
    {
      return this.mIndex < this.vt;
    }
    
    public final int hashCode()
    {
      int j = 0;
      if (!this.vu) {
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
      Object localObject1 = g.this.j(this.mIndex, 0);
      Object localObject2 = g.this.j(this.mIndex, 1);
      int i;
      if (localObject1 == null)
      {
        i = 0;
        if (localObject2 != null) {
          break label69;
        }
      }
      for (;;)
      {
        return j ^ i;
        i = localObject1.hashCode();
        break;
        label69:
        j = localObject2.hashCode();
      }
    }
    
    public final void remove()
    {
      if (!this.vu) {
        throw new IllegalStateException();
      }
      g.this.O(this.mIndex);
      this.mIndex -= 1;
      this.vt -= 1;
      this.vu = false;
    }
    
    public final V setValue(V paramV)
    {
      if (!this.vu) {
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
      return (V)g.this.a(this.mIndex, paramV);
    }
    
    public final String toString()
    {
      return getKey() + "=" + getValue();
    }
  }
  
  final class e
    implements Collection<V>
  {
    e() {}
    
    public final boolean add(V paramV)
    {
      throw new UnsupportedOperationException();
    }
    
    public final boolean addAll(Collection<? extends V> paramCollection)
    {
      throw new UnsupportedOperationException();
    }
    
    public final void clear()
    {
      g.this.bC();
    }
    
    public final boolean contains(Object paramObject)
    {
      return g.this.h(paramObject) >= 0;
    }
    
    public final boolean containsAll(Collection<?> paramCollection)
    {
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext()) {
        if (!contains(paramCollection.next())) {
          return false;
        }
      }
      return true;
    }
    
    public final boolean isEmpty()
    {
      return g.this.bA() == 0;
    }
    
    public final Iterator<V> iterator()
    {
      return new g.a(g.this, 1);
    }
    
    public final boolean remove(Object paramObject)
    {
      int i = g.this.h(paramObject);
      if (i >= 0)
      {
        g.this.O(i);
        return true;
      }
      return false;
    }
    
    public final boolean removeAll(Collection<?> paramCollection)
    {
      int i = 0;
      int j = g.this.bA();
      boolean bool = false;
      while (i < j)
      {
        int m = i;
        int k = j;
        if (paramCollection.contains(g.this.j(i, 1)))
        {
          g.this.O(i);
          m = i - 1;
          k = j - 1;
          bool = true;
        }
        i = m + 1;
        j = k;
      }
      return bool;
    }
    
    public final boolean retainAll(Collection<?> paramCollection)
    {
      int i = 0;
      int j = g.this.bA();
      boolean bool = false;
      while (i < j)
      {
        int m = i;
        int k = j;
        if (!paramCollection.contains(g.this.j(i, 1)))
        {
          g.this.O(i);
          m = i - 1;
          k = j - 1;
          bool = true;
        }
        i = m + 1;
        j = k;
      }
      return bool;
    }
    
    public final int size()
    {
      return g.this.bA();
    }
    
    public final Object[] toArray()
    {
      return g.this.S(1);
    }
    
    public final <T> T[] toArray(T[] paramArrayOfT)
    {
      return g.this.a(paramArrayOfT, 1);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\e\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */