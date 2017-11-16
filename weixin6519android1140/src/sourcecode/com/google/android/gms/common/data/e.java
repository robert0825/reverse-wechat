package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.w;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class e<T>
  implements Iterator<T>
{
  protected final b<T> ajs;
  protected int ajt;
  
  public e(b<T> paramb)
  {
    this.ajs = ((b)w.aa(paramb));
    this.ajt = -1;
  }
  
  public final boolean hasNext()
  {
    return this.ajt < this.ajs.getCount() - 1;
  }
  
  public final T next()
  {
    if (!hasNext()) {
      throw new NoSuchElementException("Cannot advance the iterator beyond " + this.ajt);
    }
    b localb = this.ajs;
    int i = this.ajt + 1;
    this.ajt = i;
    return (T)localb.get(i);
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\common\data\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */