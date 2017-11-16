package com.tencent.mm.plugin.ext.c;

import android.graphics.Rect;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.platformtools.w;

public final class d
{
  private static SparseArray<byte[]> kNT;
  
  static
  {
    GMTrace.i(20569403686912L, 153254);
    kNT = new SparseArray(1);
    GMTrace.o(20569403686912L, 153254);
  }
  
  private static int ap(byte[] paramArrayOfByte)
  {
    GMTrace.i(20569135251456L, 153252);
    int i = paramArrayOfByte[3];
    int j = paramArrayOfByte[2];
    int k = paramArrayOfByte[1];
    int m = paramArrayOfByte[0];
    GMTrace.o(20569135251456L, 153252);
    return i & 0xFF | (j & 0xFF) << 8 | (k & 0xFF) << 16 | (m & 0xFF) << 24;
  }
  
  static c avE()
  {
    GMTrace.i(20569001033728L, 153251);
    a locala = new a();
    GMTrace.o(20569001033728L, 153251);
    return locala;
  }
  
  public static b b(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    GMTrace.i(20569269469184L, 153253);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 14))
    {
      w.w("MicroMsg.ExtQbarYuvRetrieverFactory", "hy: invalid yuv handle file!!");
      GMTrace.o(20569269469184L, 153253);
      return null;
    }
    String str = null;
    if (paramBoolean) {
      str = g.n(paramArrayOfByte);
    }
    byte[] arrayOfByte2 = new byte[4];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte2, 0, 4);
    byte[] arrayOfByte3 = new byte[4];
    System.arraycopy(paramArrayOfByte, 4, arrayOfByte3, 0, 4);
    byte[] arrayOfByte4 = new byte[4];
    System.arraycopy(paramArrayOfByte, 8, arrayOfByte4, 0, 4);
    byte[] arrayOfByte5 = new byte[4];
    System.arraycopy(paramArrayOfByte, 12, arrayOfByte5, 0, 4);
    byte[] arrayOfByte6 = new byte[4];
    System.arraycopy(paramArrayOfByte, 16, arrayOfByte6, 0, 4);
    byte[] arrayOfByte7 = new byte[4];
    System.arraycopy(paramArrayOfByte, 20, arrayOfByte7, 0, 4);
    byte[] arrayOfByte8 = new byte[4];
    System.arraycopy(paramArrayOfByte, 24, arrayOfByte8, 0, 4);
    int i = paramArrayOfByte.length - 28;
    byte[] arrayOfByte1 = (byte[])kNT.get(i);
    if (arrayOfByte1 == null)
    {
      arrayOfByte1 = new byte[i];
      kNT.put(i, arrayOfByte1);
    }
    for (;;)
    {
      System.arraycopy(paramArrayOfByte, 28, arrayOfByte1, 0, i);
      i = ap(arrayOfByte2);
      int j = ap(arrayOfByte3);
      int k = ap(arrayOfByte4);
      int m = ap(arrayOfByte5);
      int n = ap(arrayOfByte6);
      int i1 = ap(arrayOfByte7);
      paramArrayOfByte = new b(arrayOfByte1, i, j, ap(arrayOfByte8), new Rect(k, m, n + k, i1 + m), str);
      w.i("MicroMsg.ExtQbarYuvRetrieverFactory", "hy: retrieved result: %s", new Object[] { paramArrayOfByte });
      GMTrace.o(20569269469184L, 153253);
      return paramArrayOfByte;
    }
  }
  
  public static final class a
    implements d.c
  {
    public a()
    {
      GMTrace.i(20569672122368L, 153256);
      GMTrace.o(20569672122368L, 153256);
    }
    
    public final d.b ab(String paramString, boolean paramBoolean)
    {
      GMTrace.i(20569806340096L, 153257);
      if (!FileOp.aZ(paramString))
      {
        w.w("MicroMsg.ExtQbarYuvRetrieverFactory", "hy: handle not exist");
        GMTrace.o(20569806340096L, 153257);
        return null;
      }
      paramString = d.b(FileOp.c(paramString, 0, -1), paramBoolean);
      GMTrace.o(20569806340096L, 153257);
      return paramString;
    }
  }
  
  public static final class b
  {
    public String eDW;
    byte[] eSn;
    int eSp;
    int kNU;
    int kNV;
    Rect kNW;
    
    public b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, Rect paramRect, String paramString)
    {
      GMTrace.i(20565511372800L, 153225);
      this.eSn = paramArrayOfByte;
      this.kNU = paramInt1;
      this.kNV = paramInt2;
      this.eSp = paramInt3;
      this.kNW = paramRect;
      this.eDW = paramString;
      GMTrace.o(20565511372800L, 153225);
    }
    
    public final String toString()
    {
      GMTrace.i(20565645590528L, 153226);
      StringBuilder localStringBuilder = new StringBuilder("RetrieveResult{yuvDataLength=");
      if (this.eSn != null) {}
      for (Object localObject = Integer.valueOf(this.eSn.length);; localObject = "null")
      {
        localObject = localObject + ", previewWidth=" + this.kNU + ", previewHeight=" + this.kNV + ", rotate=" + this.eSp + ", scanRect=" + this.kNW + ", md5=" + this.eDW + '}';
        GMTrace.o(20565645590528L, 153226);
        return (String)localObject;
      }
    }
  }
  
  static abstract interface c
  {
    public abstract d.b ab(String paramString, boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ext\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */