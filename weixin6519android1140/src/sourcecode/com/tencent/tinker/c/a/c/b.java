package com.tencent.tinker.c.a.c;

import com.tencent.tinker.a.a.j;
import com.tencent.tinker.a.b.a.c;
import com.tencent.tinker.a.b.a.d;
import com.tencent.tinker.a.b.a.e;
import com.tencent.tinker.a.b.a.f;
import com.tencent.tinker.a.b.a.g;
import com.tencent.tinker.a.b.a.h;
import java.io.EOFException;

public final class b
{
  public final a yfz;
  
  public b(a parama)
  {
    this.yfz = parama;
  }
  
  public final short[] a(short[] paramArrayOfShort)
  {
    h localh = new h(paramArrayOfShort.length);
    c localc = new c();
    f localf = new f(localh, localc);
    paramArrayOfShort = new d(new g(paramArrayOfShort));
    int i;
    try
    {
      paramArrayOfShort.a(new a(localc));
      paramArrayOfShort.a(new a(localf));
      i = localh.ydO;
      if (i == localh.ydW.length) {
        return localh.ydW;
      }
    }
    catch (EOFException paramArrayOfShort)
    {
      throw new j(paramArrayOfShort);
    }
    paramArrayOfShort = new short[i];
    System.arraycopy(localh.ydW, 0, paramArrayOfShort, 0, i);
    return paramArrayOfShort;
  }
  
  private final class a
    extends e
  {
    a(e parame)
    {
      super();
    }
    
    private int fg(int paramInt1, int paramInt2)
    {
      switch (paramInt2)
      {
      default: 
        return paramInt1;
      case 3: 
        return b.this.yfz.FO(paramInt1);
      case 2: 
        return b.this.yfz.FP(paramInt1);
      case 5: 
        return b.this.yfz.FR(paramInt1);
      }
      return b.this.yfz.FS(paramInt1);
    }
    
    public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong)
    {
      super.a(paramInt1, paramInt2, fg(paramInt3, paramInt4), paramInt4, paramInt5, paramLong);
    }
    
    public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong, int paramInt6)
    {
      super.a(paramInt1, paramInt2, fg(paramInt3, paramInt4), paramInt4, paramInt5, paramLong, paramInt6);
    }
    
    public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong, int paramInt6, int paramInt7)
    {
      super.a(paramInt1, paramInt2, fg(paramInt3, paramInt4), paramInt4, paramInt5, paramLong, paramInt6, paramInt7);
    }
    
    public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong, int paramInt6, int paramInt7, int paramInt8)
    {
      super.a(paramInt1, paramInt2, fg(paramInt3, paramInt4), paramInt4, paramInt5, paramLong, paramInt6, paramInt7, paramInt8);
    }
    
    public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
    {
      super.a(paramInt1, paramInt2, fg(paramInt3, paramInt4), paramInt4, paramInt5, paramLong, paramInt6, paramInt7, paramInt8, paramInt9);
    }
    
    public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
    {
      super.a(paramInt1, paramInt2, fg(paramInt3, paramInt4), paramInt4, paramInt5, paramLong, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
    }
    
    public final void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong, int paramInt6, int paramInt7)
    {
      super.b(paramInt1, paramInt2, fg(paramInt3, paramInt4), paramInt4, paramInt5, paramLong, paramInt6, paramInt7);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tinker\c\a\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */