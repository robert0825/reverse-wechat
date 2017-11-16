package com.google.android.gms.c;

import java.util.Map;

public class q<K, V>
{
  static int vA;
  static Object[] vx;
  static int vy;
  static Object[] vz;
  int mSize = 0;
  int[] vB = n.vg;
  Object[] vC = n.vi;
  
  static void b(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    if (paramArrayOfInt.length == 8) {
      try
      {
        if (vA < 10)
        {
          paramArrayOfObject[0] = vz;
          paramArrayOfObject[1] = paramArrayOfInt;
          paramInt = (paramInt << 1) - 1;
          break label117;
          vz = paramArrayOfObject;
          vA += 1;
        }
        return;
      }
      finally {}
    }
    if (paramArrayOfInt.length == 4) {}
    for (;;)
    {
      try
      {
        if (vy < 10)
        {
          paramArrayOfObject[0] = vx;
          paramArrayOfObject[1] = paramArrayOfInt;
          paramInt = (paramInt << 1) - 1;
          break label134;
          vx = paramArrayOfObject;
          vy += 1;
        }
        return;
      }
      finally {}
      label117:
      while (paramInt >= 2)
      {
        paramArrayOfObject[paramInt] = null;
        paramInt -= 1;
      }
      break;
      return;
      label134:
      while (paramInt >= 2)
      {
        paramArrayOfObject[paramInt] = null;
        paramInt -= 1;
      }
    }
  }
  
  private K keyAt(int paramInt)
  {
    return (K)this.vC[(paramInt << 1)];
  }
  
  private V valueAt(int paramInt)
  {
    return (V)this.vC[((paramInt << 1) + 1)];
  }
  
  final int bF()
  {
    int m = this.mSize;
    int i;
    if (m == 0) {
      i = -1;
    }
    int j;
    do
    {
      do
      {
        return i;
        j = n.a(this.vB, m, 0);
        i = j;
      } while (j < 0);
      i = j;
    } while (this.vC[(j << 1)] == null);
    int k = j + 1;
    while ((k < m) && (this.vB[k] == 0))
    {
      if (this.vC[(k << 1)] == null) {
        return k;
      }
      k += 1;
    }
    j -= 1;
    for (;;)
    {
      if ((j < 0) || (this.vB[j] != 0)) {
        break label121;
      }
      i = j;
      if (this.vC[(j << 1)] == null) {
        break;
      }
      j -= 1;
    }
    label121:
    return k ^ 0xFFFFFFFF;
  }
  
  final void cc(int paramInt)
  {
    if (paramInt == 8) {}
    for (;;)
    {
      try
      {
        if (vz != null)
        {
          Object[] arrayOfObject1 = vz;
          this.vC = arrayOfObject1;
          vz = (Object[])arrayOfObject1[0];
          this.vB = ((int[])arrayOfObject1[1]);
          arrayOfObject1[1] = null;
          arrayOfObject1[0] = null;
          vA -= 1;
          return;
        }
        this.vB = new int[paramInt];
        this.vC = new Object[paramInt << 1];
        return;
      }
      finally {}
      if (paramInt == 4) {
        try
        {
          if (vx != null)
          {
            Object[] arrayOfObject2 = vx;
            this.vC = arrayOfObject2;
            vx = (Object[])arrayOfObject2[0];
            this.vB = ((int[])arrayOfObject2[1]);
            arrayOfObject2[1] = null;
            arrayOfObject2[0] = null;
            vy -= 1;
            return;
          }
        }
        finally {}
      }
    }
  }
  
  public void clear()
  {
    if (this.mSize != 0)
    {
      b(this.vB, this.vC, this.mSize);
      this.vB = n.vg;
      this.vC = n.vi;
      this.mSize = 0;
    }
  }
  
  public boolean containsKey(Object paramObject)
  {
    if (paramObject == null) {
      if (bF() < 0) {}
    }
    while (indexOf(paramObject, paramObject.hashCode()) >= 0)
    {
      return true;
      return false;
    }
    return false;
  }
  
  public boolean containsValue(Object paramObject)
  {
    return indexOfValue(paramObject) >= 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    for (;;)
    {
      return true;
      if ((paramObject instanceof Map))
      {
        paramObject = (Map)paramObject;
        if (size() != ((Map)paramObject).size()) {
          return false;
        }
        int i = 0;
        try
        {
          while (i < this.mSize)
          {
            Object localObject1 = keyAt(i);
            Object localObject2 = valueAt(i);
            Object localObject3 = ((Map)paramObject).get(localObject1);
            if (localObject2 == null)
            {
              if (localObject3 != null) {
                break label121;
              }
              if (!((Map)paramObject).containsKey(localObject1)) {
                break label121;
              }
            }
            else
            {
              boolean bool = localObject2.equals(localObject3);
              if (!bool) {
                return false;
              }
            }
            i += 1;
          }
          return false;
        }
        catch (NullPointerException paramObject)
        {
          return false;
        }
        catch (ClassCastException paramObject)
        {
          return false;
        }
      }
    }
    label121:
    return false;
  }
  
  public V get(Object paramObject)
  {
    if (paramObject == null) {}
    for (int i = bF(); i >= 0; i = indexOf(paramObject, paramObject.hashCode())) {
      return (V)this.vC[((i << 1) + 1)];
    }
    return null;
  }
  
  public int hashCode()
  {
    int[] arrayOfInt = this.vB;
    Object[] arrayOfObject = this.vC;
    int n = this.mSize;
    int i = 1;
    int j = 0;
    int k = 0;
    if (j < n)
    {
      Object localObject = arrayOfObject[i];
      int i1 = arrayOfInt[j];
      if (localObject == null) {}
      for (int m = 0;; m = localObject.hashCode())
      {
        k += (m ^ i1);
        j += 1;
        i += 2;
        break;
      }
    }
    return k;
  }
  
  final int indexOf(Object paramObject, int paramInt)
  {
    int m = this.mSize;
    int i;
    if (m == 0) {
      i = -1;
    }
    int j;
    do
    {
      do
      {
        return i;
        j = n.a(this.vB, m, paramInt);
        i = j;
      } while (j < 0);
      i = j;
    } while (paramObject.equals(this.vC[(j << 1)]));
    int k = j + 1;
    while ((k < m) && (this.vB[k] == paramInt))
    {
      if (paramObject.equals(this.vC[(k << 1)])) {
        return k;
      }
      k += 1;
    }
    j -= 1;
    for (;;)
    {
      if ((j < 0) || (this.vB[j] != paramInt)) {
        break label156;
      }
      i = j;
      if (paramObject.equals(this.vC[(j << 1)])) {
        break;
      }
      j -= 1;
    }
    label156:
    return k ^ 0xFFFFFFFF;
  }
  
  final int indexOfValue(Object paramObject)
  {
    int i = 1;
    int j = 1;
    int k = this.mSize * 2;
    Object[] arrayOfObject = this.vC;
    if (paramObject == null)
    {
      i = j;
      while (i < k)
      {
        if (arrayOfObject[i] == null) {
          return i >> 1;
        }
        i += 2;
      }
    }
    do
    {
      i += 2;
      if (i >= k) {
        break;
      }
    } while (!paramObject.equals(arrayOfObject[i]));
    return i >> 1;
    return -1;
  }
  
  public boolean isEmpty()
  {
    return this.mSize <= 0;
  }
  
  public V put(K paramK, V paramV)
  {
    int k = 8;
    int i;
    int j;
    if (paramK == null)
    {
      i = bF();
      j = 0;
    }
    while (i >= 0)
    {
      i = (i << 1) + 1;
      paramK = this.vC[i];
      this.vC[i] = paramV;
      return paramK;
      j = paramK.hashCode();
      i = indexOf(paramK, j);
    }
    int m = i ^ 0xFFFFFFFF;
    if (this.mSize >= this.vB.length)
    {
      if (this.mSize < 8) {
        break label267;
      }
      i = this.mSize + (this.mSize >> 1);
    }
    for (;;)
    {
      int[] arrayOfInt = this.vB;
      Object[] arrayOfObject = this.vC;
      cc(i);
      if (this.vB.length > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.vB, 0, arrayOfInt.length);
        System.arraycopy(arrayOfObject, 0, this.vC, 0, arrayOfObject.length);
      }
      b(arrayOfInt, arrayOfObject, this.mSize);
      if (m < this.mSize)
      {
        System.arraycopy(this.vB, m, this.vB, m + 1, this.mSize - m);
        System.arraycopy(this.vC, m << 1, this.vC, m + 1 << 1, this.mSize - m << 1);
      }
      this.vB[m] = j;
      this.vC[(m << 1)] = paramK;
      this.vC[((m << 1) + 1)] = paramV;
      this.mSize += 1;
      return null;
      label267:
      i = k;
      if (this.mSize < 4) {
        i = 4;
      }
    }
  }
  
  public V remove(Object paramObject)
  {
    if (paramObject == null) {}
    for (int i = bF(); i >= 0; i = indexOf(paramObject, paramObject.hashCode())) {
      return (V)removeAt(i);
    }
    return null;
  }
  
  public final V removeAt(int paramInt)
  {
    int i = 8;
    Object localObject = this.vC[((paramInt << 1) + 1)];
    if (this.mSize <= 1)
    {
      b(this.vB, this.vC, this.mSize);
      this.vB = n.vg;
      this.vC = n.vi;
      this.mSize = 0;
    }
    int[] arrayOfInt;
    Object[] arrayOfObject;
    do
    {
      return (V)localObject;
      if ((this.vB.length <= 8) || (this.mSize >= this.vB.length / 3)) {
        break;
      }
      if (this.mSize > 8) {
        i = this.mSize + (this.mSize >> 1);
      }
      arrayOfInt = this.vB;
      arrayOfObject = this.vC;
      cc(i);
      this.mSize -= 1;
      if (paramInt > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.vB, 0, paramInt);
        System.arraycopy(arrayOfObject, 0, this.vC, 0, paramInt << 1);
      }
    } while (paramInt >= this.mSize);
    System.arraycopy(arrayOfInt, paramInt + 1, this.vB, paramInt, this.mSize - paramInt);
    System.arraycopy(arrayOfObject, paramInt + 1 << 1, this.vC, paramInt << 1, this.mSize - paramInt << 1);
    return (V)localObject;
    this.mSize -= 1;
    if (paramInt < this.mSize)
    {
      System.arraycopy(this.vB, paramInt + 1, this.vB, paramInt, this.mSize - paramInt);
      System.arraycopy(this.vC, paramInt + 1 << 1, this.vC, paramInt << 1, this.mSize - paramInt << 1);
    }
    this.vC[(this.mSize << 1)] = null;
    this.vC[((this.mSize << 1) + 1)] = null;
    return (V)localObject;
  }
  
  public int size()
  {
    return this.mSize;
  }
  
  public String toString()
  {
    if (isEmpty()) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(this.mSize * 28);
    localStringBuilder.append('{');
    int i = 0;
    if (i < this.mSize)
    {
      if (i > 0) {
        localStringBuilder.append(", ");
      }
      Object localObject = keyAt(i);
      if (localObject != this)
      {
        localStringBuilder.append(localObject);
        label70:
        localStringBuilder.append('=');
        localObject = valueAt(i);
        if (localObject == this) {
          break label111;
        }
        localStringBuilder.append(localObject);
      }
      for (;;)
      {
        i += 1;
        break;
        localStringBuilder.append("(this Map)");
        break label70;
        label111:
        localStringBuilder.append("(this Map)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\c\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */