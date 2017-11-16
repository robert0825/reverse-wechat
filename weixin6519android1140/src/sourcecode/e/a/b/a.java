package e.a.b;

import e.a.c.b;
import java.io.InputStream;
import java.io.OutputStream;

public final class a
{
  short[] yuA = new short[12];
  short[] yuB = new short['À'];
  e.a.c.a[] yuC = new e.a.c.a[4];
  short[] yuD = new short[114];
  e.a.c.a yuE = new e.a.c.a(4);
  a yuF = new a();
  a yuG = new a();
  b yuH = new b();
  int yuI = -1;
  int yuJ = -1;
  int yuK;
  e.a.a.a yuu = new e.a.a.a();
  b yuv = new b();
  short[] yuw = new short['À'];
  short[] yux = new short[12];
  short[] yuy = new short[12];
  short[] yuz = new short[12];
  
  public a()
  {
    int i = 0;
    while (i < 4)
    {
      this.yuC[i] = new e.a.c.a(6);
      i += 1;
    }
  }
  
  public final boolean a(InputStream paramInputStream, OutputStream paramOutputStream, long paramLong)
  {
    this.yuv.yva = paramInputStream;
    paramInputStream = this.yuu;
    paramInputStream.ctJ();
    paramInputStream.yut = paramOutputStream;
    paramInputStream = this.yuu;
    paramInputStream.yus = 0;
    paramInputStream.yrt = 0;
    b.b(this.yuw);
    b.b(this.yuB);
    b.b(this.yux);
    b.b(this.yuy);
    b.b(this.yuz);
    b.b(this.yuA);
    b.b(this.yuD);
    paramInputStream = this.yuH;
    int k = paramInputStream.yuS;
    int m = paramInputStream.yuT;
    int j = 0;
    while (j < 1 << k + m)
    {
      b.b(paramInputStream.yuR[j].yuV);
      j += 1;
    }
    j = 0;
    while (j < 4)
    {
      b.b(this.yuC[j].yuX);
      j += 1;
    }
    this.yuF.ctL();
    this.yuG.ctL();
    b.b(this.yuE.yuX);
    paramInputStream = this.yuv;
    paramInputStream.uTi = 0;
    paramInputStream.yuZ = -1;
    j = 0;
    while (j < 5)
    {
      paramInputStream.uTi = (paramInputStream.uTi << 8 | paramInputStream.yva.read());
      j += 1;
    }
    m = 0;
    k = 0;
    int n = 0;
    long l1 = 0L;
    int i2 = 0;
    j = 0;
    int i1 = 0;
    int i3;
    int i4;
    int i5;
    int i6;
    if ((paramLong < 0L) || (l1 < paramLong))
    {
      i3 = (int)l1;
      i4 = this.yuK & i3;
      if (this.yuv.d(this.yuw, (i1 << 4) + i4) == 0)
      {
        paramInputStream = this.yuH;
        i3 = (int)l1;
        paramOutputStream = paramInputStream.yuR;
        i4 = paramInputStream.yuU;
        i5 = paramInputStream.yuS;
        paramInputStream = paramOutputStream[(((i2 & 0xFF) >>> 8 - paramInputStream.yuS) + ((i3 & i4) << i5))];
        int i;
        if (i1 < 7)
        {
          i2 = 1;
          if (i2 == 0)
          {
            paramOutputStream = this.yuv;
            i4 = this.yuu.Gy(m);
            i3 = 1;
          }
        }
        else
        {
          do
          {
            i5 = i4 >> 7 & 0x1;
            i4 = (byte)(i4 << 1);
            i6 = paramOutputStream.d(paramInputStream.yuV, (i5 + 1 << 8) + i3);
            i2 = i3 << 1 | i6;
            if (i5 != i6)
            {
              for (;;)
              {
                i3 = i2;
                if (i2 >= 256) {
                  break;
                }
                i2 = paramOutputStream.d(paramInputStream.yuV, i2) | i2 << 1;
              }
              i2 = 0;
              break;
            }
            i3 = i2;
          } while (i2 < 256);
          i3 = i2;
          i = (byte)i3;
          label514:
          paramInputStream = this.yuu;
          paramOutputStream = paramInputStream.yuq;
          i2 = paramInputStream.yrt;
          paramInputStream.yrt = (i2 + 1);
          paramOutputStream[i2] = i;
          if (paramInputStream.yrt >= paramInputStream.yur) {
            paramInputStream.ctK();
          }
          if (i1 >= 4) {
            break label626;
          }
          i1 = 0;
        }
        for (;;)
        {
          l1 = 1L + l1;
          i2 = i;
          break;
          paramOutputStream = this.yuv;
          i2 = 1;
          do
          {
            i3 = paramOutputStream.d(paramInputStream.yuV, i2) | i2 << 1;
            i2 = i3;
          } while (i3 < 256);
          i = (byte)i3;
          break label514;
          label626:
          if (i1 < 10) {
            i1 -= 3;
          } else {
            i1 -= 6;
          }
        }
      }
      if (this.yuv.d(this.yux, i1) == 1) {
        if (this.yuv.d(this.yuy, i1) == 0)
        {
          if (this.yuv.d(this.yuB, (i1 << 4) + i4) != 0) {
            break label1653;
          }
          if (i1 < 7)
          {
            i1 = 9;
            label717:
            i2 = m;
            i3 = 1;
            m = k;
            k = j;
            j = n;
            n = i2;
            i2 = i3;
          }
        }
      }
    }
    for (;;)
    {
      if (i2 == 0)
      {
        i4 = this.yuG.a(this.yuv, i4) + 2;
        if (i1 < 7)
        {
          i1 = 8;
          label777:
          i3 = m;
          m = n;
          i2 = i1;
          i1 = i3;
          n = k;
          k = j;
          j = i4;
        }
      }
      for (;;)
      {
        if ((m >= l1) || (m >= this.yuJ))
        {
          return false;
          i1 = 11;
          break label717;
          if (this.yuv.d(this.yuz, i1) == 0)
          {
            i2 = k;
            k = j;
            j = i2;
          }
          while (this.yuv.d(this.yuA, i1) == 0)
          {
            i2 = 0;
            i3 = j;
            j = n;
            n = i3;
            break;
          }
          for (;;)
          {
            i2 = j;
            j = n;
            n = i2;
          }
          i1 = 11;
          break label777;
          i2 = this.yuF.a(this.yuv, i4) + 2;
          if (i1 < 7)
          {
            n = 7;
            paramInputStream = this.yuC;
            i1 = i2 - 2;
            if (i1 >= 4) {
              break label1087;
            }
          }
          int i7;
          for (;;)
          {
            i5 = paramInputStream[i1].a(this.yuv);
            if (i5 < 4) {
              break label1384;
            }
            i7 = (i5 >> 1) - 1;
            i6 = (i5 & 0x1 | 0x2) << i7;
            if (i5 >= 14) {
              break label1135;
            }
            paramInputStream = this.yuD;
            paramOutputStream = this.yuv;
            i4 = 1;
            i1 = 0;
            i3 = 0;
            while (i3 < i7)
            {
              int i8 = paramOutputStream.d(paramInputStream, i6 - i5 - 1 + i4);
              i4 = (i4 << 1) + i8;
              i1 |= i8 << i3;
              i3 += 1;
            }
            n = 10;
            break;
            label1087:
            i1 = 3;
          }
          i4 = i2;
          i3 = k;
          i2 = n;
          k = j;
          i5 = i1 + i6;
          j = i4;
          n = i3;
          i1 = m;
          m = i5;
          continue;
          label1135:
          paramInputStream = this.yuv;
          i3 = i7 - 4;
          i1 = 0;
          while (i3 != 0)
          {
            paramInputStream.yuZ >>>= 1;
            i4 = paramInputStream.uTi - paramInputStream.yuZ >>> 31;
            paramInputStream.uTi -= (paramInputStream.yuZ & i4 - 1);
            i1 = i1 << 1 | 1 - i4;
            if ((paramInputStream.yuZ & 0xFF000000) == 0)
            {
              paramInputStream.uTi = (paramInputStream.uTi << 8 | paramInputStream.yva.read());
              paramInputStream.yuZ <<= 8;
            }
            i3 -= 1;
          }
          paramInputStream = this.yuE;
          paramOutputStream = this.yuv;
          i5 = 1;
          i4 = 0;
          i3 = 0;
          while (i3 < paramInputStream.yuY)
          {
            i7 = paramOutputStream.d(paramInputStream.yuX, i5);
            i5 = (i5 << 1) + i7;
            i4 |= i7 << i3;
            i3 += 1;
          }
          i4 = i6 + (i1 << 4) + i4;
          if (i4 < 0)
          {
            if (i4 == -1) {
              break label1587;
            }
            return false;
          }
          i3 = i2;
          i1 = k;
          i2 = n;
          k = j;
          j = i3;
          n = i1;
          i1 = m;
          m = i4;
          continue;
          label1384:
          i3 = i2;
          i1 = k;
          i2 = n;
          k = j;
          i4 = i5;
          j = i3;
          n = i1;
          i1 = m;
          m = i4;
          continue;
        }
        paramInputStream = this.yuu;
        i3 = paramInputStream.yrt - m - 1;
        if (i3 < 0)
        {
          i3 += paramInputStream.yur;
          i4 = j;
        }
        for (;;)
        {
          if (i4 != 0)
          {
            i5 = i3;
            if (i3 >= paramInputStream.yur) {
              i5 = 0;
            }
            paramOutputStream = paramInputStream.yuq;
            i3 = paramInputStream.yrt;
            paramInputStream.yrt = (i3 + 1);
            paramOutputStream[i3] = paramInputStream.yuq[i5];
            if (paramInputStream.yrt >= paramInputStream.yur) {
              paramInputStream.ctK();
            }
            i4 -= 1;
            i3 = i5 + 1;
          }
          else
          {
            long l2 = j;
            j = this.yuu.Gy(0);
            l1 = l2 + l1;
            i3 = i2;
            i2 = j;
            j = n;
            n = k;
            k = i1;
            i1 = i3;
            break;
            label1587:
            this.yuu.ctK();
            this.yuu.ctJ();
            this.yuv.yva = null;
            return true;
            i4 = j;
          }
        }
        i3 = n;
        i4 = i1;
        n = k;
        k = j;
        j = i2;
        i1 = m;
        m = i3;
        i2 = i4;
      }
      label1653:
      i3 = m;
      i2 = 0;
      m = k;
      k = j;
      j = n;
      n = i3;
    }
  }
  
  public final boolean cc(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte[0] & 0xFF;
    int m = i % 9;
    i /= 9;
    int n = i % 5;
    int k = i / 5;
    int j = 0;
    i = 0;
    while (j < 4)
    {
      i += ((paramArrayOfByte[(j + 1)] & 0xFF) << j * 8);
      j += 1;
    }
    if ((m > 8) || (n > 4) || (k > 4))
    {
      j = 0;
      if (j != 0) {
        break label225;
      }
    }
    label225:
    while (i < 0)
    {
      return false;
      paramArrayOfByte = this.yuH;
      if ((paramArrayOfByte.yuR == null) || (paramArrayOfByte.yuS != m) || (paramArrayOfByte.yuT != n))
      {
        paramArrayOfByte.yuT = n;
        paramArrayOfByte.yuU = ((1 << n) - 1);
        paramArrayOfByte.yuS = m;
        m = 1 << paramArrayOfByte.yuS + paramArrayOfByte.yuT;
        paramArrayOfByte.yuR = new a.b.a[m];
        j = 0;
        while (j < m)
        {
          paramArrayOfByte.yuR[j] = new a.b.a(paramArrayOfByte);
          j += 1;
        }
      }
      j = 1 << k;
      this.yuF.Gz(j);
      this.yuG.Gz(j);
      this.yuK = (j - 1);
      j = 1;
      break;
    }
    if (this.yuI != i)
    {
      this.yuI = i;
      this.yuJ = Math.max(this.yuI, 1);
      paramArrayOfByte = this.yuu;
      i = Math.max(this.yuJ, 4096);
      if ((paramArrayOfByte.yuq == null) || (paramArrayOfByte.yur != i)) {
        paramArrayOfByte.yuq = new byte[i];
      }
      paramArrayOfByte.yur = i;
      paramArrayOfByte.yrt = 0;
      paramArrayOfByte.yus = 0;
    }
    return true;
  }
  
  final class a
  {
    short[] yuL = new short[2];
    e.a.c.a[] yuM = new e.a.c.a[16];
    e.a.c.a[] yuN = new e.a.c.a[16];
    e.a.c.a yuO = new e.a.c.a(8);
    int yuP = 0;
    
    a() {}
    
    public final void Gz(int paramInt)
    {
      while (this.yuP < paramInt)
      {
        this.yuM[this.yuP] = new e.a.c.a(3);
        this.yuN[this.yuP] = new e.a.c.a(3);
        this.yuP += 1;
      }
    }
    
    public final int a(b paramb, int paramInt)
    {
      if (paramb.d(this.yuL, 0) == 0) {
        return this.yuM[paramInt].a(paramb);
      }
      if (paramb.d(this.yuL, 1) == 0) {
        return this.yuN[paramInt].a(paramb) + 8;
      }
      return this.yuO.a(paramb) + 8 + 8;
    }
    
    public final void ctL()
    {
      b.b(this.yuL);
      int i = 0;
      while (i < this.yuP)
      {
        b.b(this.yuM[i].yuX);
        b.b(this.yuN[i].yuX);
        i += 1;
      }
      b.b(this.yuO.yuX);
    }
  }
  
  final class b
  {
    a[] yuR;
    int yuS;
    int yuT;
    int yuU;
    
    b() {}
    
    final class a
    {
      short[] yuV = new short['̀'];
      
      a() {}
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\e\a\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */