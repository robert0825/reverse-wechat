package android.support.v4.e;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class a<K, V>
  extends j<K, V>
  implements Map<K, V>
{
  g<K, V> ve;
  
  public a() {}
  
  public a(int paramInt)
  {
    super(paramInt);
  }
  
  private g<K, V> bz()
  {
    if (this.ve == null) {
      this.ve = new g()
      {
        protected final void O(int paramAnonymousInt)
        {
          a.this.removeAt(paramAnonymousInt);
        }
        
        protected final V a(int paramAnonymousInt, V paramAnonymousV)
        {
          return (V)a.this.setValueAt(paramAnonymousInt, paramAnonymousV);
        }
        
        protected final int bA()
        {
          return a.this.mSize;
        }
        
        protected final Map<K, V> bB()
        {
          return a.this;
        }
        
        protected final void bC()
        {
          a.this.clear();
        }
        
        protected final void c(K paramAnonymousK, V paramAnonymousV)
        {
          a.this.put(paramAnonymousK, paramAnonymousV);
        }
        
        protected final int g(Object paramAnonymousObject)
        {
          return a.this.indexOfKey(paramAnonymousObject);
        }
        
        protected final int h(Object paramAnonymousObject)
        {
          return a.this.indexOfValue(paramAnonymousObject);
        }
        
        protected final Object j(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          return a.this.vC[((paramAnonymousInt1 << 1) + paramAnonymousInt2)];
        }
      };
    }
    return this.ve;
  }
  
  public Set<Map.Entry<K, V>> entrySet()
  {
    g localg = bz();
    if (localg.vn == null) {
      localg.vn = new g.b(localg);
    }
    return localg.vn;
  }
  
  public Set<K> keySet()
  {
    g localg = bz();
    if (localg.vo == null) {
      localg.vo = new g.c(localg);
    }
    return localg.vo;
  }
  
  public void putAll(Map<? extends K, ? extends V> paramMap)
  {
    int i = this.mSize + paramMap.size();
    Object localObject;
    if (this.vB.length < i)
    {
      localObject = this.vB;
      Object[] arrayOfObject = this.vC;
      super.T(i);
      if (this.mSize > 0)
      {
        System.arraycopy(localObject, 0, this.vB, 0, this.mSize);
        System.arraycopy(arrayOfObject, 0, this.vC, 0, this.mSize << 1);
      }
      j.a((int[])localObject, arrayOfObject, this.mSize);
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
    g localg = bz();
    if (localg.vp == null) {
      localg.vp = new g.e(localg);
    }
    return localg.vp;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */