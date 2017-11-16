package com.tencent.mm.bs;

import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.InputStream;

public final class b
{
  public byte[] jkV;
  public SparseArray<a> veq;
  
  private b(SparseArray<a> paramSparseArray, byte[] paramArrayOfByte)
  {
    GMTrace.i(368159227904L, 2743);
    this.veq = paramSparseArray;
    this.jkV = paramArrayOfByte;
    GMTrace.o(368159227904L, 2743);
  }
  
  public static b a(SparseArray<a> paramSparseArray, InputStream paramInputStream, int paramInt)
  {
    GMTrace.i(368293445632L, 2744);
    try
    {
      byte[] arrayOfByte = new byte[paramInt];
      if (paramInputStream.read(arrayOfByte, 0, arrayOfByte.length) != arrayOfByte.length) {
        w.e("MicroMsg.language.PluralsCollection", "[cpan] newPluralsConllection failed. data length no equal.");
      }
      paramSparseArray = new b(paramSparseArray, arrayOfByte);
      GMTrace.o(368293445632L, 2744);
      return paramSparseArray;
    }
    catch (IOException paramSparseArray)
    {
      w.e("MicroMsg.language.PluralsCollection", "[cpan] newPluralsConllection failed:%s", new Object[] { bg.f(paramSparseArray) });
      GMTrace.o(368293445632L, 2744);
    }
    return null;
  }
  
  public final String getQuantityString(int paramInt1, int paramInt2, Object... paramVarArgs)
  {
    GMTrace.i(368427663360L, 2745);
    try
    {
      j = this.veq.indexOfKey(paramInt1);
      if (j < 0)
      {
        GMTrace.o(368427663360L, 2745);
        return null;
      }
      localObject1 = (a)this.veq.valueAt(j);
      k = ((a)localObject1).vet.length;
      paramInt1 = 0;
      i = 0;
    }
    catch (Exception paramVarArgs)
    {
      for (;;)
      {
        int j;
        int k;
        int i;
        Object localObject1 = null;
        w.e("MicroMsg.language.PluralsCollection", "[cpan] getString failed. %s", new Object[] { bg.f(paramVarArgs) });
        Object localObject2 = localObject1;
        continue;
        paramInt1 += 1;
      }
    }
    if (paramInt1 < k)
    {
      if (localObject1.vet[paramInt1] == paramInt2) {
        i = paramInt1;
      }
    }
    else
    {
      if (j <= this.veq.size() - 1) {
        if (i >= k - 1)
        {
          localObject2 = (a)this.veq.valueAt(j + 1);
          localObject1 = new String(this.jkV, localObject1.veu[i], localObject2.veu[0] - localObject1.veu[i]);
        }
      }
      for (;;)
      {
        try
        {
          if (!bg.nm((String)localObject1))
          {
            localObject2 = localObject1;
            if (paramVarArgs == null) {}
          }
          else
          {
            localObject2 = String.format((String)localObject1, paramVarArgs);
          }
          GMTrace.o(368427663360L, 2745);
          return (String)localObject2;
        }
        catch (Exception paramVarArgs)
        {
          continue;
        }
        localObject1 = new String(this.jkV, localObject1.veu[i], localObject1.veu[(i + 1)] - localObject1.veu[i]);
        continue;
        if (i >= k - 1) {
          localObject1 = new String(this.jkV, localObject1.veu[i], this.jkV.length - localObject1.veu[i]);
        } else {
          localObject1 = new String(this.jkV, localObject1.veu[i], localObject1.veu[(i + 1)] - localObject1.veu[i]);
        }
      }
    }
  }
  
  static final class a
  {
    public final int ves;
    public final int[] vet;
    public final int[] veu;
    
    public a(int paramInt, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
    {
      GMTrace.i(372051542016L, 2772);
      this.ves = paramInt;
      this.vet = paramArrayOfInt1;
      this.veu = paramArrayOfInt2;
      GMTrace.o(372051542016L, 2772);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bs\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */