package com.tencent.tinker.c.a.a.a;

import com.tencent.tinker.a.a.i.e;
import com.tencent.tinker.a.a.o;
import com.tencent.tinker.a.a.t.a;
import com.tencent.tinker.a.a.t.a.a;
import com.tencent.tinker.c.a.c.c;
import java.util.Arrays;

public abstract class i<T extends Comparable<T>>
{
  protected final com.tencent.tinker.a.a.i yea;
  protected final com.tencent.tinker.c.a.b.a yec;
  private final c yed;
  
  public i(com.tencent.tinker.c.a.b.a parama, com.tencent.tinker.a.a.i parami, c paramc)
  {
    this.yec = parama;
    this.yea = parami;
    this.yed = paramc;
  }
  
  private int[] FN(int paramInt)
  {
    int i = 0;
    int[] arrayOfInt = new int[paramInt];
    int j = 0;
    while (i < paramInt)
    {
      j += o.a(this.yec.yeZ);
      arrayOfInt[i] = j;
      i += 1;
    }
    return arrayOfInt;
  }
  
  private static int a(int paramInt, T paramT)
  {
    if ((paramT instanceof t.a.a)) {
      paramInt = ((t.a.a)paramT).cNu;
    }
    return paramInt;
  }
  
  protected abstract t.a a(com.tencent.tinker.a.a.i parami);
  
  protected abstract T a(com.tencent.tinker.a.a.a.a parama);
  
  protected T a(com.tencent.tinker.c.a.c.a parama, T paramT)
  {
    return paramT;
  }
  
  protected void a(c paramc, int paramInt1, int paramInt2) {}
  
  protected void a(c paramc, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  protected abstract int e(T paramT);
  
  public final void execute()
  {
    int[] arrayOfInt1 = FN(o.b(this.yec.yeZ));
    int[] arrayOfInt2 = FN(o.b(this.yec.yeZ));
    int[] arrayOfInt3 = FN(o.b(this.yec.yeZ));
    Object localObject = a(this.yea);
    i.e locale;
    int k;
    if (((t.a)localObject).exists())
    {
      locale = this.yea.a((t.a)localObject);
      k = ((t.a)localObject).size;
    }
    for (;;)
    {
      int i2 = arrayOfInt1.length;
      int i3 = arrayOfInt2.length;
      int i4 = arrayOfInt3.length;
      int j = 0;
      int i = 0;
      int i1 = 0;
      int n = 0;
      int m = 0;
      while ((j < k) || (i < k + i3 - i2)) {
        if ((n < i3) && (arrayOfInt2[n] == i))
        {
          e(a(this.yec.yeZ));
          i += 1;
          n += 1;
        }
        else if ((i1 < i4) && (arrayOfInt3[i1] == i))
        {
          e(a(this.yec.yeZ));
          i += 1;
          i1 += 1;
        }
        else if (Arrays.binarySearch(arrayOfInt1, j) >= 0)
        {
          localObject = a(locale);
          a(this.yed, j, a(j, (Comparable)localObject));
          j += 1;
          m += 1;
        }
        else if (Arrays.binarySearch(arrayOfInt3, j) >= 0)
        {
          localObject = a(locale);
          a(this.yed, j, a(j, (Comparable)localObject));
          j += 1;
        }
        else if (j < k)
        {
          localObject = a(this.yed, a(locale));
          int i5 = e((Comparable)localObject);
          a(this.yed, j, a(j, (Comparable)localObject), i, i5);
          j += 1;
          i += 1;
        }
      }
      if ((n != i3) || (m != i2) || (i1 != i4)) {
        throw new IllegalStateException(String.format("bad patch operation sequence. addCounter: %d, addCount: %d, delCounter: %d, delCount: %d, replaceCounter: %d, replaceCount:%d", new Object[] { Integer.valueOf(n), Integer.valueOf(i3), Integer.valueOf(m), Integer.valueOf(i2), Integer.valueOf(i1), Integer.valueOf(i4) }));
      }
      return;
      k = 0;
      locale = null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tinker\c\a\a\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */