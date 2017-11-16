package com.tencent.mm.plugin.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.io.RandomAccessFile;

public final class e
  extends a
{
  public static final int hnh;
  public static final int hni;
  public static final int hnj;
  long duration;
  long hnk;
  long hnl;
  long hnm;
  
  static
  {
    GMTrace.i(16394158604288L, 122146);
    hnh = c.nq("vide");
    hni = c.nq("soun");
    hnj = c.nq("hint");
    GMTrace.o(16394158604288L, 122146);
  }
  
  public e(int paramInt1, long paramLong1, int paramInt2, long paramLong2)
  {
    super(paramInt1, paramLong1, paramInt2, 0L);
    GMTrace.i(16393890168832L, 122144);
    this.hnk = 0L;
    this.duration = 0L;
    this.hnl = 0L;
    this.hnm = 0L;
    GMTrace.o(16393890168832L, 122144);
  }
  
  public final boolean a(RandomAccessFile paramRandomAccessFile, byte[] paramArrayOfByte)
  {
    GMTrace.i(16394024386560L, 122145);
    int k = 0;
    int j = 0;
    int m = paramRandomAccessFile.read(paramArrayOfByte);
    int i = 0;
    while (m >= 8)
    {
      n = c.l(paramArrayOfByte, 0);
      i1 = c.l(paramArrayOfByte, 4);
      long l;
      if (i1 == a.hmb)
      {
        byte[] arrayOfByte = new byte[4];
        i = paramRandomAccessFile.read(arrayOfByte);
        if (i < 4) {
          i = -1;
        }
        while (i <= 0)
        {
          w.w("MicroMsg.MdiaAtom", "handle mdhd atom error.");
          GMTrace.o(16394024386560L, 122145);
          return false;
          i += 0;
          if (arrayOfByte[0] == 0)
          {
            if (!c.a(paramRandomAccessFile, 8L))
            {
              i = -1;
            }
            else
            {
              i1 = paramRandomAccessFile.read(paramArrayOfByte);
              if (i1 < 8)
              {
                i = -1;
              }
              else
              {
                i = i + 8 + i1;
                this.hnk = c.m(paramArrayOfByte, 0);
              }
            }
          }
          else {
            for (this.duration = c.m(paramArrayOfByte, 4);; this.duration = c.J(paramArrayOfByte))
            {
              break;
              if (!c.a(paramRandomAccessFile, 16L))
              {
                i = -1;
                break;
              }
              i1 = paramRandomAccessFile.read(arrayOfByte);
              if (i1 < 4)
              {
                i = -1;
                break;
              }
              this.hnk = c.m(arrayOfByte, 0);
              int i2 = paramRandomAccessFile.read(paramArrayOfByte);
              if (i2 < 8)
              {
                i = -1;
                break;
              }
              i = i2 + (i + 16 + i1);
            }
          }
        }
        l = n - m - i;
        i = k;
        k = 1;
        m = j;
        j = i;
        i = m;
      }
      for (;;)
      {
        if ((k != 0) && (j != 0))
        {
          i1 = i;
          n = j;
          m = k;
          if (i != 0) {
            break label532;
          }
        }
        if (c.a(paramRandomAccessFile, l)) {
          break;
        }
        GMTrace.o(16394024386560L, 122145);
        return false;
        if (i1 == a.hmc)
        {
          if (!c.a(paramRandomAccessFile, 8L)) {
            k = -1;
          }
          while (k <= 0)
          {
            w.w("MicroMsg.MdiaAtom", "handle hdlr atom error.");
            GMTrace.o(16394024386560L, 122145);
            return false;
            k = paramRandomAccessFile.read(paramArrayOfByte, 0, 4);
            if (k < 4)
            {
              k = -1;
            }
            else
            {
              this.hnl = c.l(paramArrayOfByte, 0);
              k += 8;
            }
          }
          l = n - m - k;
          k = i;
          i = j;
          j = 1;
        }
        else if (i1 == a.hlQ)
        {
          this.hnm = (paramRandomAccessFile.getFilePointer() - m);
          l = n - m;
          j = k;
          k = i;
          i = 1;
        }
        else
        {
          l = n - 8;
          m = i;
          i = j;
          j = k;
          k = m;
        }
      }
      n = paramRandomAccessFile.read(paramArrayOfByte);
      m = k;
      k = j;
      j = i;
      i = m;
      m = n;
    }
    m = i;
    int n = k;
    int i1 = j;
    label532:
    if ((m != 0) && (n != 0) && (i1 != 0))
    {
      GMTrace.o(16394024386560L, 122145);
      return true;
    }
    GMTrace.o(16394024386560L, 122145);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */