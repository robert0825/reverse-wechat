package com.tencent.tinker.a.a;

import com.tencent.tinker.a.a.a.a;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class t
{
  public int fileSize;
  public byte[] ycS = new byte[20];
  public int ydA;
  public int ydB;
  public final a yde = new a(0, true);
  public final a ydf = new a(1, true);
  public final a ydg = new a(2, true);
  public final a ydh = new a(3, true);
  public final a ydi = new a(4, true);
  public final a ydj = new a(5, true);
  public final a ydk = new a(6, true);
  public final a ydl = new a(4096, true);
  public final a ydm = new a(4097, true);
  public final a ydn = new a(4098, true);
  public final a ydo = new a(4099, true);
  public final a ydp = new a(8192, false);
  public final a ydq = new a(8193, true);
  public final a ydr = new a(8194, false);
  public final a yds = new a(8195, false);
  public final a ydt = new a(8196, false);
  public final a ydu = new a(8197, false);
  public final a ydv = new a(8198, true);
  public final a[] ydw = { this.yde, this.ydf, this.ydg, this.ydh, this.ydi, this.ydj, this.ydk, this.ydl, this.ydm, this.ydn, this.ydo, this.ydp, this.ydq, this.ydr, this.yds, this.ydt, this.ydu, this.ydv };
  public int ydx;
  public int ydy;
  public int ydz;
  
  final void a(i.e parame)
  {
    int k = parame.ycQ.getInt();
    int i = 0;
    a locala;
    for (Object localObject = null; i < k; localObject = locala)
    {
      int m = parame.ycQ.getShort();
      parame.ycQ.getShort();
      a[] arrayOfa = this.ydw;
      int n = arrayOfa.length;
      int j = 0;
      while (j < n)
      {
        locala = arrayOfa[j];
        if (locala.ydC == m)
        {
          j = parame.ycQ.getInt();
          n = parame.ycQ.getInt();
          if (((locala.size == 0) || (locala.size == j)) && ((locala.cNu == -1) || (locala.cNu == n))) {
            break label185;
          }
          throw new j("Unexpected map value for 0x" + Integer.toHexString(m));
        }
        j += 1;
      }
      throw new IllegalArgumentException("No such map item: " + m);
      label185:
      locala.size = j;
      locala.cNu = n;
      if ((localObject != null) && (((a)localObject).cNu > locala.cNu)) {
        throw new j("Map is unsorted at " + localObject + ", " + locala);
      }
      i += 1;
    }
    this.yde.cNu = 0;
    Arrays.sort(this.ydw);
    i = 1;
    while (i < this.ydw.length)
    {
      if (this.ydw[i].cNu == -1) {
        this.ydw[i].cNu = this.ydw[(i - 1)].cNu;
      }
      i += 1;
    }
  }
  
  public final void b(i.e parame)
  {
    a[] arrayOfa = this.ydw;
    int m = arrayOfa.length;
    int i = 0;
    int k;
    for (int j = 0; i < m; j = k)
    {
      k = j;
      if (arrayOfa[i].exists()) {
        k = j + 1;
      }
      i += 1;
    }
    parame.writeInt(j);
    arrayOfa = this.ydw;
    j = arrayOfa.length;
    i = 0;
    while (i < j)
    {
      a locala = arrayOfa[i];
      if (locala.exists())
      {
        parame.writeShort(locala.ydC);
        parame.writeShort((short)0);
        parame.writeInt(locala.size);
        parame.writeInt(locala.cNu);
      }
      i += 1;
    }
  }
  
  public final void cqy()
  {
    int j = this.fileSize;
    int i = this.ydw.length;
    i -= 1;
    while (i >= 0)
    {
      a locala = this.ydw[i];
      int k = j;
      if (locala.cNu != -1)
      {
        if (locala.cNu > j) {
          throw new j("Map is unsorted at " + locala);
        }
        locala.ydE = (j - locala.cNu);
        k = locala.cNu;
      }
      i -= 1;
      j = k;
    }
    this.ydB = (this.yde.ydE + this.ydf.ydE + this.ydg.ydE + this.ydh.ydE + this.ydi.ydE + this.ydj.ydE + this.ydk.ydE);
    this.ydA = (this.fileSize - this.ydB);
  }
  
  public static final class a
    implements Comparable<a>
  {
    public int cNu = -1;
    public int size = 0;
    public final short ydC;
    public boolean ydD;
    public int ydE = 0;
    
    public a(int paramInt, boolean paramBoolean)
    {
      this.ydC = ((short)paramInt);
      this.ydD = paramBoolean;
      if (paramInt == 0)
      {
        this.cNu = 0;
        this.size = 1;
        this.ydE = 112;
      }
      while (paramInt != 4096) {
        return;
      }
      this.size = 1;
    }
    
    private static int Fr(int paramInt)
    {
      switch (paramInt)
      {
      default: 
        throw new IllegalArgumentException("unknown section type: " + paramInt);
      case 0: 
        return 0;
      case 1: 
        return 1;
      case 2: 
        return 2;
      case 3: 
        return 3;
      case 4: 
        return 4;
      case 5: 
        return 5;
      case 6: 
        return 6;
      case 8194: 
        return 7;
      case 4097: 
        return 8;
      case 8196: 
        return 9;
      case 4099: 
        return 10;
      case 4098: 
        return 11;
      case 8198: 
        return 12;
      case 8195: 
        return 13;
      case 8193: 
        return 14;
      case 8192: 
        return 15;
      case 8197: 
        return 16;
      }
      return 17;
    }
    
    public final boolean exists()
    {
      return this.size > 0;
    }
    
    public final String toString()
    {
      return String.format("Section[type=%#x,off=%#x,size=%#x]", new Object[] { Short.valueOf(this.ydC), Integer.valueOf(this.cNu), Integer.valueOf(this.size) });
    }
    
    public static abstract class a<T>
      implements Comparable<T>
    {
      public int cNu;
      
      public a(int paramInt)
      {
        this.cNu = paramInt;
      }
      
      public boolean equals(Object paramObject)
      {
        return compareTo(paramObject) == 0;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tinker\a\a\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */