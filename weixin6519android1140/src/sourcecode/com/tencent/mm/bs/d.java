package com.tencent.mm.bs;

import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.InputStream;

public final class d
{
  public byte[] jkV;
  public SparseArray<a> vew;
  
  private d(SparseArray<a> paramSparseArray, byte[] paramArrayOfByte)
  {
    GMTrace.i(368561881088L, 2746);
    this.vew = paramSparseArray;
    this.jkV = paramArrayOfByte;
    GMTrace.o(368561881088L, 2746);
  }
  
  public static d b(SparseArray<a> paramSparseArray, InputStream paramInputStream, int paramInt)
  {
    GMTrace.i(368696098816L, 2747);
    try
    {
      byte[] arrayOfByte = new byte[paramInt];
      if (paramInputStream.read(arrayOfByte, 0, arrayOfByte.length) != arrayOfByte.length) {
        w.e("MicroMsg.language.StringArraysCollection", "[cpan] newPluralsConllection failed. data length no equal.");
      }
      paramSparseArray = new d(paramSparseArray, arrayOfByte);
      GMTrace.o(368696098816L, 2747);
      return paramSparseArray;
    }
    catch (IOException paramSparseArray)
    {
      w.e("MicroMsg.language.StringArraysCollection", "[cpan] newPluralsConllection failed:%s", new Object[] { bg.f(paramSparseArray) });
      GMTrace.o(368696098816L, 2747);
    }
    return null;
  }
  
  static final class a
  {
    public final int qPV;
    public final int[] vex;
    
    public a(int paramInt, int[] paramArrayOfInt)
    {
      GMTrace.i(371917324288L, 2771);
      this.qPV = paramInt;
      this.vex = paramArrayOfInt;
      GMTrace.o(371917324288L, 2771);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bs\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */