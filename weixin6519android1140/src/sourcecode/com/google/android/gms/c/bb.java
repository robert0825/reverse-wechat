package com.google.android.gms.c;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class bb
  implements Cloneable
{
  private az<?, ?> axe;
  private Object axf;
  List<bg> axg = new ArrayList();
  
  private byte[] toByteArray()
  {
    byte[] arrayOfByte = new byte[li()];
    a(ax.b(arrayOfByte, 0, arrayOfByte.length));
    return arrayOfByte;
  }
  
  final void a(ax paramax)
  {
    if (this.axf != null) {
      this.axe.a(this.axf, paramax);
    }
    for (;;)
    {
      return;
      Iterator localIterator = this.axg.iterator();
      while (localIterator.hasNext())
      {
        bg localbg = (bg)localIterator.next();
        paramax.cr(localbg.tag);
        paramax.g(localbg.axj);
      }
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramObject == this) {
      bool1 = true;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (!(paramObject instanceof bb));
      paramObject = (bb)paramObject;
      if ((this.axf == null) || (((bb)paramObject).axf == null)) {
        break;
      }
      bool1 = bool2;
    } while (this.axe != ((bb)paramObject).axe);
    if (!this.axe.awY.isArray()) {
      return this.axf.equals(((bb)paramObject).axf);
    }
    if ((this.axf instanceof byte[])) {
      return Arrays.equals((byte[])this.axf, (byte[])((bb)paramObject).axf);
    }
    if ((this.axf instanceof int[])) {
      return Arrays.equals((int[])this.axf, (int[])((bb)paramObject).axf);
    }
    if ((this.axf instanceof long[])) {
      return Arrays.equals((long[])this.axf, (long[])((bb)paramObject).axf);
    }
    if ((this.axf instanceof float[])) {
      return Arrays.equals((float[])this.axf, (float[])((bb)paramObject).axf);
    }
    if ((this.axf instanceof double[])) {
      return Arrays.equals((double[])this.axf, (double[])((bb)paramObject).axf);
    }
    if ((this.axf instanceof boolean[])) {
      return Arrays.equals((boolean[])this.axf, (boolean[])((bb)paramObject).axf);
    }
    return Arrays.deepEquals((Object[])this.axf, (Object[])((bb)paramObject).axf);
    if ((this.axg != null) && (((bb)paramObject).axg != null)) {
      return this.axg.equals(((bb)paramObject).axg);
    }
    try
    {
      bool1 = Arrays.equals(toByteArray(), ((bb)paramObject).toByteArray());
      return bool1;
    }
    catch (IOException paramObject)
    {
      throw new IllegalStateException((Throwable)paramObject);
    }
  }
  
  public final int hashCode()
  {
    try
    {
      int i = Arrays.hashCode(toByteArray());
      return i + 527;
    }
    catch (IOException localIOException)
    {
      throw new IllegalStateException(localIOException);
    }
  }
  
  public final bb lW()
  {
    int i = 0;
    bb localbb = new bb();
    try
    {
      localbb.axe = this.axe;
      if (this.axg == null) {
        localbb.axg = null;
      }
      for (;;)
      {
        if (this.axf == null) {
          return localbb;
        }
        if (!(this.axf instanceof be)) {
          break;
        }
        localbb.axf = ((be)this.axf).lU();
        return localbb;
        localbb.axg.addAll(this.axg);
      }
      if (!(this.axf instanceof byte[])) {
        break label119;
      }
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError(localCloneNotSupportedException);
    }
    localCloneNotSupportedException.axf = ((byte[])this.axf).clone();
    return localCloneNotSupportedException;
    label119:
    Object localObject1;
    Object localObject2;
    if ((this.axf instanceof byte[][]))
    {
      localObject1 = (byte[][])this.axf;
      localObject2 = new byte[localObject1.length][];
      localCloneNotSupportedException.axf = localObject2;
      i = 0;
      while (i < localObject1.length)
      {
        localObject2[i] = ((byte[])localObject1[i].clone());
        i += 1;
      }
    }
    if ((this.axf instanceof boolean[]))
    {
      localCloneNotSupportedException.axf = ((boolean[])this.axf).clone();
      return localCloneNotSupportedException;
    }
    if ((this.axf instanceof int[]))
    {
      localCloneNotSupportedException.axf = ((int[])this.axf).clone();
      return localCloneNotSupportedException;
    }
    if ((this.axf instanceof long[]))
    {
      localCloneNotSupportedException.axf = ((long[])this.axf).clone();
      return localCloneNotSupportedException;
    }
    if ((this.axf instanceof float[]))
    {
      localCloneNotSupportedException.axf = ((float[])this.axf).clone();
      return localCloneNotSupportedException;
    }
    if ((this.axf instanceof double[]))
    {
      localCloneNotSupportedException.axf = ((double[])this.axf).clone();
      return localCloneNotSupportedException;
    }
    if ((this.axf instanceof be[]))
    {
      localObject1 = (be[])this.axf;
      localObject2 = new be[localObject1.length];
      localCloneNotSupportedException.axf = localObject2;
      while (i < localObject1.length)
      {
        localObject2[i] = localObject1[i].lU();
        i += 1;
      }
    }
    return localCloneNotSupportedException;
  }
  
  final int li()
  {
    int j;
    if (this.axf != null)
    {
      j = this.axe.ae(this.axf);
      return j;
    }
    Iterator localIterator = this.axg.iterator();
    bg localbg;
    for (int i = 0;; i = localbg.axj.length + (j + 0) + i)
    {
      j = i;
      if (!localIterator.hasNext()) {
        break;
      }
      localbg = (bg)localIterator.next();
      j = ax.cs(localbg.tag);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\c\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */