package com.google.android.gms.c;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class o<K, V>
{
  private int auA;
  private int auB;
  private int auC;
  private int auD;
  private int auE;
  private final LinkedHashMap<K, V> auz;
  private int size;
  
  private int l(K paramK, V paramV)
  {
    int i = X(paramV);
    if (i < 0) {
      throw new IllegalStateException("Negative size: " + paramK + "=" + paramV);
    }
    return i;
  }
  
  public int X(V paramV)
  {
    return 1;
  }
  
  public final V get(K paramK)
  {
    try
    {
      paramK = this.auz.get(paramK);
      if (paramK != null)
      {
        this.auD += 1;
        return paramK;
      }
      this.auE += 1;
      return null;
    }
    finally {}
  }
  
  public final V put(K paramK, V paramV)
  {
    if (paramV == null) {
      throw new NullPointerException("key == null || value == null");
    }
    try
    {
      this.auB += 1;
      this.size += l(paramK, paramV);
      paramV = this.auz.put(paramK, paramV);
      if (paramV != null) {
        this.size -= l(paramK, paramV);
      }
      trimToSize(this.auA);
      return paramV;
    }
    finally {}
  }
  
  public final String toString()
  {
    int i = 0;
    try
    {
      int j = this.auD + this.auE;
      if (j != 0) {
        i = this.auD * 100 / j;
      }
      String str = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[] { Integer.valueOf(this.auA), Integer.valueOf(this.auD), Integer.valueOf(this.auE), Integer.valueOf(i) });
      return str;
    }
    finally {}
  }
  
  public final void trimToSize(int paramInt)
  {
    try
    {
      if ((this.size < 0) || ((this.auz.isEmpty()) && (this.size != 0))) {
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
      }
    }
    finally
    {
      throw ((Throwable)localObject1);
      if ((this.size <= paramInt) || (this.auz.isEmpty())) {
        return;
      }
      Object localObject3 = (Map.Entry)this.auz.entrySet().iterator().next();
      Object localObject2 = ((Map.Entry)localObject3).getKey();
      localObject3 = ((Map.Entry)localObject3).getValue();
      this.auz.remove(localObject2);
      this.size -= l(localObject2, localObject3);
      this.auC += 1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\c\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */