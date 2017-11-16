package com.tencent.mm.plugin.a;

import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class h
  extends a
{
  long duration;
  private int[] hnA;
  private int[] hnB;
  private long[] hnC;
  private int[] hnD;
  private int[] hnE;
  private int[] hnF;
  long hnk;
  long[] hno;
  List<g> hnq;
  List<Pair> hnr;
  long hnu;
  private long hnv;
  private long hnw;
  private long hnx;
  private long hny;
  private int[] hnz;
  
  public h(int paramInt1, long paramLong1, int paramInt2, long paramLong2)
  {
    super(paramInt1, paramLong1, paramInt2, 0L);
    GMTrace.i(16392682209280L, 122135);
    this.hnq = new LinkedList();
    this.hnr = new LinkedList();
    GMTrace.o(16392682209280L, 122135);
  }
  
  private boolean PC()
  {
    GMTrace.i(16393487515648L, 122141);
    if (this.hnB != null) {}
    int m;
    for (int i = this.hnB.length;; i = this.hnC.length)
    {
      j = i - 1;
      m = this.hnz.length;
      i = 1;
      while (i < m)
      {
        this.hnz[(i - 1)] = (this.hnz[i] - this.hnz[(i - 1)]);
        i += 1;
      }
    }
    this.hnz[(m - 1)] = (j - this.hnz[(m - 1)] + 1);
    this.hnF = new int[j + 1];
    this.hnF[0] = 0;
    int j = 1;
    i = 0;
    int k;
    while (i < m)
    {
      int n = this.hnz[i];
      int i1 = this.hnA[i];
      k = 0;
      while (k < n)
      {
        this.hnF[j] = (this.hnF[(j - 1)] + i1);
        j += 1;
        k += 1;
      }
      i += 1;
    }
    i = 0;
    while (i < this.hno.length)
    {
      k = (int)this.hno[i];
      m = hD(k);
      j = this.hnF[(m - 1)] + 1;
      if (this.hnD.length == 1)
      {
        l2 = this.hnD[0] * (k - j);
        l1 = hE(m);
        this.hno[i] = (l2 + l1);
        i += 1;
      }
      else
      {
        l1 = 0L;
        for (;;)
        {
          l2 = l1;
          if (j > k) {
            break;
          }
          l1 += this.hnD[j];
          j += 1;
        }
      }
    }
    Object localObject = this.hnq.iterator();
    j = 0;
    long l2 = 0L;
    i = 1;
    long l1 = 0L;
    if (((Iterator)localObject).hasNext())
    {
      g localg = (g)((Iterator)localObject).next();
      localg.size = this.hnD[i];
      k = hD(i);
      if (k != j) {}
      for (localg.start = hE(k);; localg.start = l2)
      {
        l2 = localg.start + localg.size;
        l1 += localg.hns;
        localg.hns = (((float)l1 * 1.0F / (float)this.hnk * 1000.0F * 1000.0F));
        localg.id = i;
        i += 1;
        j = k;
        break;
      }
    }
    i = 0;
    while (i < this.hnE.length)
    {
      localObject = (g)this.hnq.get(this.hnE[i] - 1);
      ((g)localObject).hnt = 1;
      localObject = new Pair(Integer.valueOf(this.hnE[i] - 1), Long.valueOf(((g)localObject).hns));
      this.hnr.add(localObject);
      i += 1;
    }
    GMTrace.o(16393487515648L, 122141);
    return true;
  }
  
  private long a(RandomAccessFile paramRandomAccessFile, int paramInt)
  {
    GMTrace.i(16392950644736L, 122137);
    this.hnv = paramRandomAccessFile.getFilePointer();
    if (!c.a(paramRandomAccessFile, 4L))
    {
      GMTrace.o(16392950644736L, 122137);
      return -1L;
    }
    byte[] arrayOfByte = new byte[12];
    if (paramRandomAccessFile.read(arrayOfByte, 0, 4) < 4)
    {
      w.w("MicroMsg.StblAtom", "stsc read entry count error");
      GMTrace.o(16392950644736L, 122137);
      return -1L;
    }
    int i = c.l(arrayOfByte, 0);
    long l3 = 12L * i;
    if ((l3 > paramInt - 16) || (l3 <= 0L))
    {
      w.w("MicroMsg.StblAtom", "stsc error entryCount : " + i);
      GMTrace.o(16392950644736L, 122137);
      return -1L;
    }
    w.d("MicroMsg.StblAtom", "handle stsc entryCount : " + i);
    this.hnz = new int[i];
    this.hnA = new int[i];
    i = 0;
    long l1 = 0L;
    for (paramInt = paramRandomAccessFile.read(arrayOfByte);; paramInt = paramRandomAccessFile.read(arrayOfByte))
    {
      long l2 = l1;
      if (paramInt >= 12)
      {
        l1 += paramInt;
        this.hnz[i] = c.l(arrayOfByte, 0);
        this.hnA[i] = c.l(arrayOfByte, 4);
        i += 1;
        if (l1 >= l3)
        {
          w.d("MicroMsg.StblAtom", "read stsc atom end");
          l2 = l1;
        }
      }
      else
      {
        GMTrace.o(16392950644736L, 122137);
        return l2 + 8L;
      }
    }
  }
  
  private long b(RandomAccessFile paramRandomAccessFile, int paramInt)
  {
    GMTrace.i(16393084862464L, 122138);
    this.hnw = paramRandomAccessFile.getFilePointer();
    if (!c.a(paramRandomAccessFile, 4L))
    {
      GMTrace.o(16393084862464L, 122138);
      return -1L;
    }
    byte[] arrayOfByte = new byte[4];
    if (paramRandomAccessFile.read(arrayOfByte, 0, 4) < 4)
    {
      w.w("MicroMsg.StblAtom", "stco read entry count error");
      GMTrace.o(16393084862464L, 122138);
      return -1L;
    }
    int i = c.l(arrayOfByte, 0);
    long l3 = 4L * i;
    if ((l3 <= 0L) || (l3 > paramInt - 16))
    {
      w.w("MicroMsg.StblAtom", "stco error entryCount : " + i);
      GMTrace.o(16393084862464L, 122138);
      return -1L;
    }
    this.hnB = new int[i + 1];
    paramInt = 1;
    long l1 = 0L;
    i = paramRandomAccessFile.read(arrayOfByte);
    for (;;)
    {
      long l2 = l1;
      if (i >= 4)
      {
        l1 += i;
        this.hnB[paramInt] = c.l(arrayOfByte, 0);
        if (l1 >= l3)
        {
          w.d("MicroMsg.StblAtom", "read stco atom end");
          l2 = l1;
        }
      }
      else
      {
        GMTrace.o(16393084862464L, 122138);
        return l2 + 8L;
      }
      i = paramRandomAccessFile.read(arrayOfByte);
      paramInt += 1;
    }
  }
  
  private long c(RandomAccessFile paramRandomAccessFile, int paramInt)
  {
    GMTrace.i(16393219080192L, 122139);
    this.hnx = paramRandomAccessFile.getFilePointer();
    if (!c.a(paramRandomAccessFile, 4L))
    {
      GMTrace.o(16393219080192L, 122139);
      return -1L;
    }
    byte[] arrayOfByte = new byte[8];
    if (paramRandomAccessFile.read(arrayOfByte, 0, 4) < 4)
    {
      w.w("MicroMsg.StblAtom", "co64 read entry count error");
      GMTrace.o(16393219080192L, 122139);
      return -1L;
    }
    int i = c.l(arrayOfByte, 0);
    long l3 = 8L * i;
    if ((l3 <= 0L) || (l3 > paramInt - 16))
    {
      w.w("MicroMsg.StblAtom", "stco error entryCount : " + i);
      GMTrace.o(16393219080192L, 122139);
      return -1L;
    }
    this.hnC = new long[i + 1];
    paramInt = 1;
    i = paramRandomAccessFile.read(arrayOfByte);
    long l1 = 0L;
    for (;;)
    {
      long l2 = l1;
      if (i >= 8)
      {
        l1 += i;
        this.hnC[paramInt] = c.J(arrayOfByte);
        if (l1 >= l3)
        {
          w.d("MicroMsg.StblAtom", "read stco atom end");
          l2 = l1;
        }
      }
      else
      {
        GMTrace.o(16393219080192L, 122139);
        return l2 + 8L;
      }
      i = paramRandomAccessFile.read(arrayOfByte);
      paramInt += 1;
    }
  }
  
  private long d(RandomAccessFile paramRandomAccessFile, int paramInt)
  {
    GMTrace.i(16393353297920L, 122140);
    this.hny = paramRandomAccessFile.getFilePointer();
    if (!c.a(paramRandomAccessFile, 4L))
    {
      GMTrace.o(16393353297920L, 122140);
      return -1L;
    }
    byte[] arrayOfByte = new byte[4];
    if (paramRandomAccessFile.read(arrayOfByte, 0, 4) < 4)
    {
      w.w("MicroMsg.StblAtom", "stsz read sample size error");
      GMTrace.o(16393353297920L, 122140);
      return -1L;
    }
    int i = c.l(arrayOfByte, 0);
    if (i > 0)
    {
      this.hnD = new int[1];
      this.hnD[0] = i;
      w.i("MicroMsg.StblAtom", "all sample size is the same. size : " + i);
      GMTrace.o(16393353297920L, 122140);
      return 8L;
    }
    if (paramRandomAccessFile.read(arrayOfByte, 0, 4) < 4)
    {
      w.w("MicroMsg.StblAtom", "stsz read entry count error");
      GMTrace.o(16393353297920L, 122140);
      return -1L;
    }
    i = c.l(arrayOfByte, 0);
    long l3 = 4L * i;
    if ((l3 <= 0L) || (l3 > paramInt - 20))
    {
      w.w("MicroMsg.StblAtom", "stco error entryCount : " + i);
      GMTrace.o(16393353297920L, 122140);
      return -1L;
    }
    this.hnD = new int[i + 1];
    paramInt = 1;
    i = paramRandomAccessFile.read(arrayOfByte);
    long l1 = 0L;
    for (;;)
    {
      long l2 = l1;
      if (i >= 4)
      {
        l1 += i;
        this.hnD[paramInt] = c.l(arrayOfByte, 0);
        if (l1 >= l3)
        {
          w.d("MicroMsg.StblAtom", "read stsz atom end");
          l2 = l1;
        }
      }
      else
      {
        GMTrace.o(16393353297920L, 122140);
        return l2 + 12L;
      }
      i = paramRandomAccessFile.read(arrayOfByte);
      paramInt += 1;
    }
  }
  
  private long e(RandomAccessFile paramRandomAccessFile, int paramInt)
  {
    GMTrace.i(17457968316416L, 130072);
    if (!c.a(paramRandomAccessFile, 4L))
    {
      GMTrace.o(17457968316416L, 130072);
      return -1L;
    }
    byte[] arrayOfByte = new byte[4];
    if (paramRandomAccessFile.read(arrayOfByte, 0, 4) < 4)
    {
      w.w("MicroMsg.StblAtom", "stss rread entry count error");
      GMTrace.o(17457968316416L, 130072);
      return -1L;
    }
    int i = c.l(arrayOfByte, 0);
    long l3 = 4L * i;
    if ((l3 <= 0L) || (l3 > paramInt - 16))
    {
      w.w("MicroMsg.StblAtom", "stss error entryCount : " + i);
      GMTrace.o(17457968316416L, 130072);
      return -1L;
    }
    this.hnE = new int[i];
    paramInt = 0;
    i = paramRandomAccessFile.read(arrayOfByte);
    long l1 = 0L;
    for (;;)
    {
      long l2 = l1;
      if (i >= 4)
      {
        l1 += i;
        this.hnE[paramInt] = c.l(arrayOfByte, 0);
        if (l1 >= l3)
        {
          w.d("MicroMsg.StblAtom", "read stss atom end");
          l2 = l1;
        }
      }
      else
      {
        GMTrace.o(17457968316416L, 130072);
        return l2 + 8L;
      }
      i = paramRandomAccessFile.read(arrayOfByte);
      paramInt += 1;
    }
  }
  
  private int hD(int paramInt)
  {
    GMTrace.i(17458102534144L, 130073);
    int i = 0;
    if (i < this.hnF.length) {
      if (paramInt > this.hnF[i]) {}
    }
    for (;;)
    {
      GMTrace.o(17458102534144L, 130073);
      return i;
      i += 1;
      break;
      i = 0;
    }
  }
  
  private long hE(int paramInt)
  {
    GMTrace.i(17458236751872L, 130074);
    long l;
    if (this.hnB != null)
    {
      l = this.hnB[paramInt];
      GMTrace.o(17458236751872L, 130074);
      return l;
    }
    if (this.hnC != null)
    {
      l = this.hnC[paramInt];
      GMTrace.o(17458236751872L, 130074);
      return l;
    }
    GMTrace.o(17458236751872L, 130074);
    return 0L;
  }
  
  public final void c(RandomAccessFile paramRandomAccessFile)
  {
    GMTrace.i(16392816427008L, 122136);
    byte[] arrayOfByte1 = new byte[8];
    int i3 = paramRandomAccessFile.read(arrayOfByte1);
    int m = 0;
    int n = 0;
    int k = 0;
    int i = 0;
    int j = 0;
    int i5;
    int i1;
    long l1;
    label93:
    label108:
    byte[] arrayOfByte2;
    int i2;
    int i4;
    if (i3 >= 8)
    {
      i5 = c.l(arrayOfByte1, 0);
      i1 = c.l(arrayOfByte1, 4);
      l1 = 0L;
      if (i1 == a.hmu)
      {
        this.hnu = paramRandomAccessFile.getFilePointer();
        if (!c.a(paramRandomAccessFile, 4L)) {
          l1 = -1L;
        }
        long l2;
        for (;;)
        {
          m = n;
          n = 1;
          i1 = j;
          j = i;
          i = i1;
          if (c.a(paramRandomAccessFile, i5 - l1 - i3)) {
            break label692;
          }
          throw new IOException("skip file error.");
          arrayOfByte2 = new byte[8];
          if (paramRandomAccessFile.read(arrayOfByte2, 0, 4) < 4)
          {
            w.w("MicroMsg.StblAtom", "stts read entry count error");
            l1 = -1L;
          }
          else
          {
            m = c.l(arrayOfByte2, 0);
            l2 = m * 8L;
            if ((l2 <= i5 - 16) && (l2 > 0L)) {
              break;
            }
            w.w("MicroMsg.StblAtom", "stts error entryCount : " + m);
            l1 = -1L;
          }
        }
        i2 = 0;
        i1 = 0;
        this.hno = new long[(int)(this.duration / this.hnk) + 2];
        Object localObject = this.hno;
        m = 1;
        localObject[0] = 1L;
        i4 = paramRandomAccessFile.read(arrayOfByte2);
        l1 = 0L;
        label286:
        if (i4 < 8) {
          break label792;
        }
        l1 = i4 + l1;
        int i6 = c.l(arrayOfByte2, 0);
        int i7 = c.l(arrayOfByte2, 4);
        i4 = 0;
        while (i4 < i6)
        {
          localObject = new g();
          ((g)localObject).hns = i7;
          this.hnq.add(localObject);
          i2 += i7;
          i1 += 1;
          while ((i2 >= this.hnk) && (m < this.hno.length))
          {
            i2 = (int)(i2 - this.hnk);
            this.hno[m] = i1;
            m += 1;
          }
          i4 += 1;
        }
        if (l1 >= l2) {
          w.d("MicroMsg.StblAtom", "read stts Atom end");
        }
      }
    }
    label692:
    label792:
    for (;;)
    {
      if (m < this.hno.length) {
        this.hno[m] = i1;
      }
      l1 += 8L;
      break label93;
      i4 = paramRandomAccessFile.read(arrayOfByte2);
      break label286;
      if (i1 == a.hmx)
      {
        l1 = a(paramRandomAccessFile, i5);
        i2 = 1;
        i1 = m;
        k = i;
        i = j;
        j = k;
        k = i2;
        m = n;
        n = i1;
        break label108;
      }
      if (i1 == a.hmz)
      {
        l1 = b(paramRandomAccessFile, i5);
        i1 = 1;
        n = m;
        m = i;
        i = j;
        j = m;
        m = i1;
        break label108;
      }
      if (i1 == a.hmA)
      {
        l1 = c(paramRandomAccessFile, i5);
        i1 = 1;
        n = m;
        m = i;
        i = j;
        j = m;
        m = i1;
        break label108;
      }
      if (i1 == a.hmy)
      {
        l1 = d(paramRandomAccessFile, i5);
        i1 = m;
        m = 1;
        i = j;
        j = m;
        m = n;
        n = i1;
        break label108;
      }
      if (i1 == a.hmv)
      {
        l1 = e(paramRandomAccessFile, i5);
        i2 = 1;
        i1 = m;
        j = i;
        i = i2;
        m = n;
        n = i1;
        break label108;
        if ((n != 0) && (m != 0) && (k != 0) && (j != 0) && (i != 0))
        {
          w.i("MicroMsg.StblAtom", "read stbl atom finish");
          PC();
          GMTrace.o(16392816427008L, 122136);
          return;
        }
        i3 = paramRandomAccessFile.read(arrayOfByte1);
        i1 = j;
        i2 = m;
        m = n;
        j = i;
        i = i1;
        n = i2;
        break;
      }
      i1 = m;
      m = i;
      i = j;
      j = m;
      m = n;
      n = i1;
      break label108;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */