package android.support.v4.e;

public final class k<E>
  implements Cloneable
{
  private static final Object vj = new Object();
  private int mSize;
  private int[] vD;
  private boolean vk = false;
  private Object[] vm;
  
  public k()
  {
    this(10);
  }
  
  public k(int paramInt)
  {
    if (paramInt == 0) {
      this.vD = b.vg;
    }
    for (this.vm = b.vi;; this.vm = new Object[paramInt])
    {
      this.mSize = 0;
      return;
      paramInt = b.P(paramInt);
      this.vD = new int[paramInt];
    }
  }
  
  private k<E> bG()
  {
    try
    {
      k localk = (k)super.clone();
      return localCloneNotSupportedException1;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException1)
    {
      try
      {
        localk.vD = ((int[])this.vD.clone());
        localk.vm = ((Object[])this.vm.clone());
        return localk;
      }
      catch (CloneNotSupportedException localCloneNotSupportedException2) {}
      localCloneNotSupportedException1 = localCloneNotSupportedException1;
      return null;
    }
  }
  
  private void gc()
  {
    int m = this.mSize;
    int[] arrayOfInt = this.vD;
    Object[] arrayOfObject = this.vm;
    int i = 0;
    int k;
    for (int j = 0; i < m; j = k)
    {
      Object localObject = arrayOfObject[i];
      k = j;
      if (localObject != vj)
      {
        if (i != j)
        {
          arrayOfInt[j] = arrayOfInt[i];
          arrayOfObject[j] = localObject;
          arrayOfObject[i] = null;
        }
        k = j + 1;
      }
      i += 1;
    }
    this.vk = false;
    this.mSize = j;
  }
  
  public final void clear()
  {
    int j = this.mSize;
    Object[] arrayOfObject = this.vm;
    int i = 0;
    while (i < j)
    {
      arrayOfObject[i] = null;
      i += 1;
    }
    this.mSize = 0;
    this.vk = false;
  }
  
  public final E get(int paramInt)
  {
    paramInt = b.a(this.vD, this.mSize, paramInt);
    if ((paramInt < 0) || (this.vm[paramInt] == vj)) {
      return null;
    }
    return (E)this.vm[paramInt];
  }
  
  public final int indexOfKey(int paramInt)
  {
    if (this.vk) {
      gc();
    }
    return b.a(this.vD, this.mSize, paramInt);
  }
  
  public final int keyAt(int paramInt)
  {
    if (this.vk) {
      gc();
    }
    return this.vD[paramInt];
  }
  
  public final void put(int paramInt, E paramE)
  {
    int i = b.a(this.vD, this.mSize, paramInt);
    if (i >= 0)
    {
      this.vm[i] = paramE;
      return;
    }
    int j = i ^ 0xFFFFFFFF;
    if ((j < this.mSize) && (this.vm[j] == vj))
    {
      this.vD[j] = paramInt;
      this.vm[j] = paramE;
      return;
    }
    i = j;
    if (this.vk)
    {
      i = j;
      if (this.mSize >= this.vD.length)
      {
        gc();
        i = b.a(this.vD, this.mSize, paramInt) ^ 0xFFFFFFFF;
      }
    }
    if (this.mSize >= this.vD.length)
    {
      j = b.P(this.mSize + 1);
      int[] arrayOfInt = new int[j];
      Object[] arrayOfObject = new Object[j];
      System.arraycopy(this.vD, 0, arrayOfInt, 0, this.vD.length);
      System.arraycopy(this.vm, 0, arrayOfObject, 0, this.vm.length);
      this.vD = arrayOfInt;
      this.vm = arrayOfObject;
    }
    if (this.mSize - i != 0)
    {
      System.arraycopy(this.vD, i, this.vD, i + 1, this.mSize - i);
      System.arraycopy(this.vm, i, this.vm, i + 1, this.mSize - i);
    }
    this.vD[i] = paramInt;
    this.vm[i] = paramE;
    this.mSize += 1;
  }
  
  public final void remove(int paramInt)
  {
    paramInt = b.a(this.vD, this.mSize, paramInt);
    if ((paramInt >= 0) && (this.vm[paramInt] != vj))
    {
      this.vm[paramInt] = vj;
      this.vk = true;
    }
  }
  
  public final void removeAt(int paramInt)
  {
    if (this.vm[paramInt] != vj)
    {
      this.vm[paramInt] = vj;
      this.vk = true;
    }
  }
  
  public final int size()
  {
    if (this.vk) {
      gc();
    }
    return this.mSize;
  }
  
  public final String toString()
  {
    if (size() <= 0) {
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
      localStringBuilder.append(keyAt(i));
      localStringBuilder.append('=');
      Object localObject = valueAt(i);
      if (localObject != this) {
        localStringBuilder.append(localObject);
      }
      for (;;)
      {
        i += 1;
        break;
        localStringBuilder.append("(this Map)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public final E valueAt(int paramInt)
  {
    if (this.vk) {
      gc();
    }
    return (E)this.vm[paramInt];
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\e\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */