package com.google.android.gms.c;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class p<K, V>
{
  p<K, V>.b auF;
  p<K, V>.c auG;
  p<K, V>.e auH;
  
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
      this.mSize = p.this.bA();
    }
    
    public final boolean hasNext()
    {
      return this.mIndex < this.mSize;
    }
    
    public final T next()
    {
      Object localObject = p.this.j(this.mIndex, this.vq);
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
      p.this.O(this.mIndex);
    }
  }
  
  final class b
    implements Set<Map.Entry<K, V>>
  {
    b() {}
    
    public final boolean addAll(Collection<? extends Map.Entry<K, V>> paramCollection)
    {
      int i = p.this.bA();
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramCollection.next();
        p.this.c(localEntry.getKey(), localEntry.getValue());
      }
      return i != p.this.bA();
    }
    
    public final void clear()
    {
      p.this.bC();
    }
    
    public final boolean contains(Object paramObject)
    {
      if (!(paramObject instanceof Map.Entry)) {}
      int i;
      do
      {
        return false;
        paramObject = (Map.Entry)paramObject;
        i = p.this.g(((Map.Entry)paramObject).getKey());
      } while (i < 0);
      return n.d(p.this.j(i, 1), ((Map.Entry)paramObject).getValue());
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
      return p.a(this, paramObject);
    }
    
    public final int hashCode()
    {
      int j = p.this.bA() - 1;
      int i = 0;
      if (j >= 0)
      {
        Object localObject1 = p.this.j(j, 0);
        Object localObject2 = p.this.j(j, 1);
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
      return p.this.bA() == 0;
    }
    
    public final Iterator<Map.Entry<K, V>> iterator()
    {
      return new p.d(p.this);
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
      return p.this.bA();
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
      p.this.bC();
    }
    
    public final boolean contains(Object paramObject)
    {
      return p.this.g(paramObject) >= 0;
    }
    
    public final boolean containsAll(Collection<?> paramCollection)
    {
      Map localMap = p.this.bB();
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
      return p.a(this, paramObject);
    }
    
    public final int hashCode()
    {
      int i = p.this.bA() - 1;
      int j = 0;
      if (i >= 0)
      {
        Object localObject = p.this.j(i, 0);
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
      return p.this.bA() == 0;
    }
    
    public final Iterator<K> iterator()
    {
      return new p.a(p.this, 0);
    }
    
    public final boolean remove(Object paramObject)
    {
      int i = p.this.g(paramObject);
      if (i >= 0)
      {
        p.this.O(i);
        return true;
      }
      return false;
    }
    
    public final boolean removeAll(Collection<?> paramCollection)
    {
      Map localMap = p.this.bB();
      int i = localMap.size();
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext()) {
        localMap.remove(paramCollection.next());
      }
      return i != localMap.size();
    }
    
    public final boolean retainAll(Collection<?> paramCollection)
    {
      Map localMap = p.this.bB();
      int i = localMap.size();
      Iterator localIterator = localMap.keySet().iterator();
      while (localIterator.hasNext()) {
        if (!paramCollection.contains(localIterator.next())) {
          localIterator.remove();
        }
      }
      return i != localMap.size();
    }
    
    public final int size()
    {
      return p.this.bA();
    }
    
    public final Object[] toArray()
    {
      return p.this.S(0);
    }
    
    public final <T> T[] toArray(T[] paramArrayOfT)
    {
      return p.this.a(paramArrayOfT, 0);
    }
  }
  
  final class d
    implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V>
  {
    int mIndex = -1;
    int vt = p.this.bA() - 1;
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
      } while ((!n.d(((Map.Entry)paramObject).getKey(), p.this.j(this.mIndex, 0))) || (!n.d(((Map.Entry)paramObject).getValue(), p.this.j(this.mIndex, 1))));
      return true;
    }
    
    public final K getKey()
    {
      if (!this.vu) {
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
      return (K)p.this.j(this.mIndex, 0);
    }
    
    public final V getValue()
    {
      if (!this.vu) {
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
      return (V)p.this.j(this.mIndex, 1);
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
      Object localObject1 = p.this.j(this.mIndex, 0);
      Object localObject2 = p.this.j(this.mIndex, 1);
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
      p.this.O(this.mIndex);
      this.mIndex -= 1;
      this.vt -= 1;
      this.vu = false;
    }
    
    public final V setValue(V paramV)
    {
      if (!this.vu) {
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
      return (V)p.this.a(this.mIndex, paramV);
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
      p.this.bC();
    }
    
    public final boolean contains(Object paramObject)
    {
      return p.this.h(paramObject) >= 0;
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
      return p.this.bA() == 0;
    }
    
    public final Iterator<V> iterator()
    {
      return new p.a(p.this, 1);
    }
    
    public final boolean remove(Object paramObject)
    {
      int i = p.this.h(paramObject);
      if (i >= 0)
      {
        p.this.O(i);
        return true;
      }
      return false;
    }
    
    public final boolean removeAll(Collection<?> paramCollection)
    {
      int i = 0;
      int j = p.this.bA();
      boolean bool = false;
      while (i < j)
      {
        int m = i;
        int k = j;
        if (paramCollection.contains(p.this.j(i, 1)))
        {
          p.this.O(i);
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
      int j = p.this.bA();
      boolean bool = false;
      while (i < j)
      {
        int m = i;
        int k = j;
        if (!paramCollection.contains(p.this.j(i, 1)))
        {
          p.this.O(i);
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
      return p.this.bA();
    }
    
    public final Object[] toArray()
    {
      return p.this.S(1);
    }
    
    public final <T> T[] toArray(T[] paramArrayOfT)
    {
      return p.this.a(paramArrayOfT, 1);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\c\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */