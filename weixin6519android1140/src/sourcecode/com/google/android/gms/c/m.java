package com.google.android.gms.c;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class m<K, V>
  extends q<K, V>
  implements Map<K, V>
{
  p<K, V> aux;
  
  private p<K, V> lr()
  {
    if (this.aux == null) {
      this.aux = new p()
      {
        protected final void O(int paramAnonymousInt)
        {
          m.this.removeAt(paramAnonymousInt);
        }
        
        protected final V a(int paramAnonymousInt, V paramAnonymousV)
        {
          m localm = m.this;
          paramAnonymousInt = (paramAnonymousInt << 1) + 1;
          Object localObject = localm.vC[paramAnonymousInt];
          localm.vC[paramAnonymousInt] = paramAnonymousV;
          return (V)localObject;
        }
        
        protected final int bA()
        {
          return m.this.mSize;
        }
        
        protected final Map<K, V> bB()
        {
          return m.this;
        }
        
        protected final void bC()
        {
          m.this.clear();
        }
        
        protected final void c(K paramAnonymousK, V paramAnonymousV)
        {
          m.this.put(paramAnonymousK, paramAnonymousV);
        }
        
        protected final int g(Object paramAnonymousObject)
        {
          if (paramAnonymousObject == null) {
            return m.this.bF();
          }
          return m.this.indexOf(paramAnonymousObject, paramAnonymousObject.hashCode());
        }
        
        protected final int h(Object paramAnonymousObject)
        {
          return m.this.indexOfValue(paramAnonymousObject);
        }
        
        protected final Object j(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          return m.this.vC[((paramAnonymousInt1 << 1) + paramAnonymousInt2)];
        }
      };
    }
    return this.aux;
  }
  
  public Set<Map.Entry<K, V>> entrySet()
  {
    p localp = lr();
    if (localp.auF == null) {
      localp.auF = new p.b(localp);
    }
    return localp.auF;
  }
  
  public Set<K> keySet()
  {
    p localp = lr();
    if (localp.auG == null) {
      localp.auG = new p.c(localp);
    }
    return localp.auG;
  }
  
  public void putAll(Map<? extends K, ? extends V> paramMap)
  {
    int i = this.mSize + paramMap.size();
    Object localObject;
    if (this.vB.length < i)
    {
      localObject = this.vB;
      Object[] arrayOfObject = this.vC;
      super.cc(i);
      if (this.mSize > 0)
      {
        System.arraycopy(localObject, 0, this.vB, 0, this.mSize);
        System.arraycopy(arrayOfObject, 0, this.vC, 0, this.mSize << 1);
      }
      q.b((int[])localObject, arrayOfObject, this.mSize);
    }
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      localObject = (Map.Entry)paramMap.next();
      put(((Map.Entry)localObject).getKey(), ((Map.Entry)localObject).getValue());
    }
  }
  
  public Collection<V> values()
  {
    p localp = lr();
    if (localp.auH == null) {
      localp.auH = new p.e(localp);
    }
    return localp.auH;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\c\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */