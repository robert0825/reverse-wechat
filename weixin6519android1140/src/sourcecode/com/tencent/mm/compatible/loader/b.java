package com.tencent.mm.compatible.loader;

import com.tencent.gmtrace.GMTrace;

public final class b<E>
{
  static final Object vj;
  int mSize;
  boolean vk;
  long[] vl;
  Object[] vm;
  
  static
  {
    GMTrace.i(13791139987456L, 102752);
    vj = new Object();
    GMTrace.o(13791139987456L, 102752);
  }
  
  static int b(long[] paramArrayOfLong, int paramInt, long paramLong)
  {
    GMTrace.i(13791005769728L, 102751);
    int i = -1;
    int j = paramInt + 0;
    while (j - i > 1)
    {
      int k = (j + i) / 2;
      if (paramArrayOfLong[k] < paramLong) {
        i = k;
      } else {
        j = k;
      }
    }
    if (j == paramInt + 0)
    {
      GMTrace.o(13791005769728L, 102751);
      return paramInt + 0 ^ 0xFFFFFFFF;
    }
    if (paramArrayOfLong[j] == paramLong)
    {
      GMTrace.o(13791005769728L, 102751);
      return j;
    }
    GMTrace.o(13791005769728L, 102751);
    return j ^ 0xFFFFFFFF;
  }
  
  public final void put(long paramLong, E paramE)
  {
    GMTrace.i(13790871552000L, 102750);
    int i = b(this.vl, this.mSize, paramLong);
    if (i >= 0)
    {
      this.vm[i] = paramE;
      GMTrace.o(13790871552000L, 102750);
      return;
    }
    int j = i ^ 0xFFFFFFFF;
    if ((j < this.mSize) && (this.vm[j] == vj))
    {
      this.vl[j] = paramLong;
      this.vm[j] = paramE;
      GMTrace.o(13790871552000L, 102750);
      return;
    }
    i = j;
    long[] arrayOfLong;
    Object[] arrayOfObject;
    if (this.vk)
    {
      i = j;
      if (this.mSize >= this.vl.length)
      {
        int m = this.mSize;
        arrayOfLong = this.vl;
        arrayOfObject = this.vm;
        j = 0;
        i = 0;
        while (i < m)
        {
          Object localObject = arrayOfObject[i];
          int k = j;
          if (localObject != vj)
          {
            if (i != j)
            {
              arrayOfLong[j] = arrayOfLong[i];
              arrayOfObject[j] = localObject;
            }
            k = j + 1;
          }
          i += 1;
          j = k;
        }
        this.vk = false;
        this.mSize = j;
        i = b(this.vl, this.mSize, paramLong) ^ 0xFFFFFFFF;
      }
    }
    if (this.mSize >= this.vl.length)
    {
      j = a.P(this.mSize + 1);
      arrayOfLong = new long[j];
      arrayOfObject = new Object[j];
      System.arraycopy(this.vl, 0, arrayOfLong, 0, this.vl.length);
      System.arraycopy(this.vm, 0, arrayOfObject, 0, this.vm.length);
      this.vl = arrayOfLong;
      this.vm = arrayOfObject;
    }
    if (this.mSize - i != 0)
    {
      System.arraycopy(this.vl, i, this.vl, i + 1, this.mSize - i);
      System.arraycopy(this.vm, i, this.vm, i + 1, this.mSize - i);
    }
    this.vl[i] = paramLong;
    this.vm[i] = paramE;
    this.mSize += 1;
    GMTrace.o(13790871552000L, 102750);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\compatible\loader\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */