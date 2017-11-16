package android.support.v4.e;

public final class e<E>
  implements Cloneable
{
  public static final Object vj = new Object();
  public int mSize;
  public boolean vk = false;
  public long[] vl;
  public Object[] vm;
  
  public e()
  {
    this((byte)0);
  }
  
  private e(byte paramByte)
  {
    paramByte = b.Q(10);
    this.vl = new long[paramByte];
    this.vm = new Object[paramByte];
    this.mSize = 0;
  }
  
  private e<E> bD()
  {
    try
    {
      e locale = (e)super.clone();
      return localCloneNotSupportedException1;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException1)
    {
      try
      {
        locale.vl = ((long[])this.vl.clone());
        locale.vm = ((Object[])this.vm.clone());
        return locale;
      }
      catch (CloneNotSupportedException localCloneNotSupportedException2) {}
      localCloneNotSupportedException1 = localCloneNotSupportedException1;
      return null;
    }
  }
  
  private void gc()
  {
    int m = this.mSize;
    long[] arrayOfLong = this.vl;
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
          arrayOfLong[j] = arrayOfLong[i];
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
  
  private long keyAt(int paramInt)
  {
    if (this.vk) {
      gc();
    }
    return this.vl[paramInt];
  }
  
  public final E get(long paramLong)
  {
    int i = b.a(this.vl, this.mSize, paramLong);
    if ((i < 0) || (this.vm[i] == vj)) {
      return null;
    }
    return (E)this.vm[i];
  }
  
  public final void put(long paramLong, E paramE)
  {
    int i = b.a(this.vl, this.mSize, paramLong);
    if (i >= 0)
    {
      this.vm[i] = paramE;
      return;
    }
    int j = i ^ 0xFFFFFFFF;
    if ((j < this.mSize) && (this.vm[j] == vj))
    {
      this.vl[j] = paramLong;
      this.vm[j] = paramE;
      return;
    }
    i = j;
    if (this.vk)
    {
      i = j;
      if (this.mSize >= this.vl.length)
      {
        gc();
        i = b.a(this.vl, this.mSize, paramLong) ^ 0xFFFFFFFF;
      }
    }
    if (this.mSize >= this.vl.length)
    {
      j = b.Q(this.mSize + 1);
      long[] arrayOfLong = new long[j];
      Object[] arrayOfObject = new Object[j];
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\e\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */