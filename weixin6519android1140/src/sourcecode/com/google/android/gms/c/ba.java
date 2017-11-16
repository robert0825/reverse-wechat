package com.google.android.gms.c;

final class ba
  implements Cloneable
{
  static final bb axa = new bb();
  boolean axb = false;
  int[] axc;
  bb[] axd;
  int mSize;
  
  public ba()
  {
    this(10);
  }
  
  private ba(int paramInt)
  {
    paramInt = P(paramInt);
    this.axc = new int[paramInt];
    this.axd = new bb[paramInt];
    this.mSize = 0;
  }
  
  static int P(int paramInt)
  {
    int j = paramInt * 4;
    paramInt = 4;
    for (;;)
    {
      int i = j;
      if (paramInt < 32)
      {
        if (j <= (1 << paramInt) - 12) {
          i = (1 << paramInt) - 12;
        }
      }
      else {
        return i / 4;
      }
      paramInt += 1;
    }
  }
  
  public final bb cu(int paramInt)
  {
    if (this.axb) {
      gc();
    }
    return this.axd[paramInt];
  }
  
  final int cv(int paramInt)
  {
    int j = this.mSize;
    int i = 0;
    j -= 1;
    while (i <= j)
    {
      int k = i + j >>> 1;
      int m = this.axc[k];
      if (m < paramInt)
      {
        i = k + 1;
      }
      else
      {
        j = k;
        if (m <= paramInt) {
          return j;
        }
        j = k - 1;
      }
    }
    j = i ^ 0xFFFFFFFF;
    return j;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    label71:
    label93:
    label131:
    label138:
    label141:
    for (;;)
    {
      return true;
      if (!(paramObject instanceof ba)) {
        return false;
      }
      paramObject = (ba)paramObject;
      if (size() != ((ba)paramObject).size()) {
        return false;
      }
      Object localObject = this.axc;
      int[] arrayOfInt = ((ba)paramObject).axc;
      int j = this.mSize;
      int i = 0;
      if (i < j) {
        if (localObject[i] != arrayOfInt[i])
        {
          i = 0;
          if (i != 0)
          {
            localObject = this.axd;
            paramObject = ((ba)paramObject).axd;
            j = this.mSize;
            i = 0;
            if (i >= j) {
              break label138;
            }
            if (localObject[i].equals(paramObject[i])) {
              break label131;
            }
          }
        }
      }
      for (i = 0;; i = 1)
      {
        if (i != 0) {
          break label141;
        }
        return false;
        i += 1;
        break;
        i = 1;
        break label71;
        i += 1;
        break label93;
      }
    }
  }
  
  final void gc()
  {
    int m = this.mSize;
    int[] arrayOfInt = this.axc;
    bb[] arrayOfbb = this.axd;
    int i = 0;
    int k;
    for (int j = 0; i < m; j = k)
    {
      bb localbb = arrayOfbb[i];
      k = j;
      if (localbb != axa)
      {
        if (i != j)
        {
          arrayOfInt[j] = arrayOfInt[i];
          arrayOfbb[j] = localbb;
          arrayOfbb[i] = null;
        }
        k = j + 1;
      }
      i += 1;
    }
    this.axb = false;
    this.mSize = j;
  }
  
  public final int hashCode()
  {
    if (this.axb) {
      gc();
    }
    int j = 17;
    int i = 0;
    while (i < this.mSize)
    {
      j = (j * 31 + this.axc[i]) * 31 + this.axd[i].hashCode();
      i += 1;
    }
    return j;
  }
  
  public final boolean isEmpty()
  {
    return size() == 0;
  }
  
  public final ba lV()
  {
    int i = 0;
    int j = size();
    ba localba = new ba(j);
    System.arraycopy(this.axc, 0, localba.axc, 0, j);
    while (i < j)
    {
      if (this.axd[i] != null) {
        localba.axd[i] = this.axd[i].lW();
      }
      i += 1;
    }
    localba.mSize = j;
    return localba;
  }
  
  public final int size()
  {
    if (this.axb) {
      gc();
    }
    return this.mSize;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\c\ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */