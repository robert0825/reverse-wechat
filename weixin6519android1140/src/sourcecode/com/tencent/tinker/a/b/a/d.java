package com.tencent.tinker.a.b.a;

import com.tencent.tinker.a.a.j;

public final class d
{
  private final g ydR;
  
  public d(g paramg)
  {
    this.ydR = paramg;
  }
  
  public final void a(e parame)
  {
    Object localObject = this.ydR;
    ((a)localObject).ydN.mSize = 0;
    ((a)localObject).ydO = 0;
    for (;;)
    {
      localObject = this.ydR;
      if (((a)localObject).ydO < ((g)localObject).ydW.length) {}
      int i1;
      int n;
      for (int i = 1; i != 0; i = 0)
      {
        i1 = this.ydR.ydO;
        n = this.ydR.read();
        j = n & 0xFF;
        if (j != 0)
        {
          i = j;
          if (j != 255) {}
        }
        else
        {
          i = n;
        }
        switch (i)
        {
        default: 
          throw new IllegalStateException("Unknown opcode: " + com.tencent.tinker.a.b.b.a.FG(i));
        }
      }
      parame.a(i1, n, 0, 1, 0, 0L);
      continue;
      parame.a(i1, n & 0xFF, 0, 1, i1 + (byte)b.FA(n), 0L);
      continue;
      parame.a(i1, n & 0xFF, 0, 1, 0, b.FA(n));
      continue;
      parame.a(i1, n & 0xFF, 0, 1, 0, (n >> 12 & 0xF) << 28 >> 28, n >> 8 & 0xF);
      continue;
      parame.a(i1, n & 0xFF, 0, 1, 0, 0L, b.FA(n));
      continue;
      parame.a(i1, n & 0xFF, 0, 1, 0, 0L, n >> 8 & 0xF, n >> 12 & 0xF);
      continue;
      i = b.FA(n);
      parame.a(i1, n & 0xFF, 0, 1, i1 + (short)this.ydR.read(), i);
      continue;
      i = n & 0xFF;
      int j = b.FA(n);
      parame.a(i1, i, this.ydR.read(), b.FD(i), 0, 0L, j);
      continue;
      j = n & 0xFF;
      int k = b.FA(n);
      long l = (short)this.ydR.read();
      if (j == 21) {}
      for (i = 16;; i = 48)
      {
        parame.a(i1, j, 0, 1, 0, l << i, k);
        break;
      }
      i = b.FA(n);
      parame.a(i1, n & 0xFF, 0, 1, 0, (short)this.ydR.read(), i);
      continue;
      i = b.FA(n);
      parame.a(i1, n & 0xFF, 0, 1, i1 + (short)this.ydR.read(), 0L, i);
      continue;
      i = b.FA(n);
      j = this.ydR.read();
      parame.a(i1, n & 0xFF, 0, 1, 0, (byte)b.FA(j), i, j & 0xFF);
      continue;
      i = n & 0xFF;
      parame.a(i1, i, this.ydR.read(), b.FD(i), 0, 0L, n >> 8 & 0xF, n >> 12 & 0xF);
      continue;
      parame.a(i1, n & 0xFF, 0, 1, 0, (short)this.ydR.read(), n >> 8 & 0xF, n >> 12 & 0xF);
      continue;
      parame.a(i1, n & 0xFF, 0, 1, i1 + (short)this.ydR.read(), 0L, n >> 8 & 0xF, n >> 12 & 0xF);
      continue;
      parame.a(i1, n & 0xFF, 0, 1, 0, 0L, b.FA(n), this.ydR.read());
      continue;
      i = b.FA(n);
      j = this.ydR.read();
      parame.a(i1, n & 0xFF, 0, 1, 0, 0L, i, j & 0xFF, b.FA(j));
      continue;
      i = b.FA(n);
      parame.a(i1, n & 0xFF, 0, 1, i1 + this.ydR.readInt(), i);
      continue;
      i = n & 0xFF;
      j = b.FA(n);
      parame.a(i1, i, this.ydR.readInt(), b.FD(i), 0, 0L, j);
      continue;
      i = b.FA(n);
      parame.a(i1, n & 0xFF, 0, 1, 0, this.ydR.readInt(), i);
      continue;
      i = n & 0xFF;
      j = b.FA(n);
      k = i1 + this.ydR.readInt();
      switch (i)
      {
      }
      for (;;)
      {
        parame.a(i1, i, 0, 1, k, 0L, j);
        break;
        this.ydR.fb(k + 1, i1);
      }
      i = b.FA(n);
      j = this.ydR.read();
      k = this.ydR.read();
      parame.a(i1, n & 0xFF, 0, 1, 0, i, j, k);
      continue;
      i = n & 0xFF;
      j = n >> 12 & 0xF;
      k = this.ydR.read();
      int i4 = this.ydR.read();
      int m = i4 & 0xF;
      int i2 = i4 >> 4 & 0xF;
      int i3 = i4 >> 8 & 0xF;
      i4 = i4 >> 12 & 0xF;
      int i5 = b.FD(i);
      switch (j)
      {
      default: 
        throw new j("bogus registerCount: " + new String(new char[] { Character.forDigit(j & 0xF, 16) }));
      case 0: 
        parame.a(i1, i, k, i5, 0, 0L);
        break;
      case 1: 
        parame.a(i1, i, k, i5, 0, 0L, m);
        break;
      case 2: 
        parame.a(i1, i, k, i5, 0, 0L, m, i2);
        break;
      case 3: 
        parame.a(i1, i, k, i5, 0, 0L, m, i2, i3);
        break;
      case 4: 
        parame.a(i1, i, k, i5, 0, 0L, m, i2, i3, i4);
        break;
      case 5: 
        parame.a(i1, i, k, i5, 0, 0L, m, i2, i3, i4, n >> 8 & 0xF);
        continue;
        i = n & 0xFF;
        j = b.FA(n);
        k = this.ydR.read();
        m = this.ydR.read();
        parame.b(i1, i, k, b.FD(i), 0, 0L, m, j);
        continue;
        i = b.FA(n);
        parame.a(i1, n & 0xFF, 0, 1, 0, this.ydR.readLong(), i);
        continue;
        i = this.ydR.read();
        i2 = this.ydR.readInt();
        switch (i)
        {
        case 3: 
        case 5: 
        case 6: 
        case 7: 
        default: 
          throw new j("bogus element_width: " + com.tencent.tinker.a.b.b.a.FH(i));
        case 1: 
          localObject = new byte[i2];
          i = 0;
          j = 1;
          m = 0;
          if (m < i2)
          {
            k = i;
            if (j != 0) {
              k = this.ydR.read();
            }
            localObject[m] = ((byte)(k & 0xFF));
            m += 1;
            if (j == 0) {}
            for (i = 1;; i = 0)
            {
              j = i;
              i = k >> 8;
              break;
            }
          }
          parame.a(i1, n, localObject, localObject.length, 1);
          break;
        case 2: 
          localObject = new short[i2];
          i = 0;
          while (i < i2)
          {
            localObject[i] = ((short)this.ydR.read());
            i += 1;
          }
          parame.a(i1, n, localObject, localObject.length, 2);
          break;
        case 4: 
          localObject = new int[i2];
          i = 0;
          while (i < i2)
          {
            localObject[i] = this.ydR.readInt();
            i += 1;
          }
          parame.a(i1, n, localObject, localObject.length, 4);
          break;
        case 8: 
          localObject = new long[i2];
          i = 0;
          while (i < i2)
          {
            localObject[i] = this.ydR.readLong();
            i += 1;
          }
          parame.a(i1, n, localObject, localObject.length, 8);
          continue;
          j = this.ydR.cqC();
          k = this.ydR.read();
          m = this.ydR.readInt();
          localObject = new int[k];
          i = 0;
          while (i < k)
          {
            localObject[i] = (this.ydR.readInt() + j);
            i += 1;
          }
          parame.b(i1, n, m, (int[])localObject);
          continue;
          j = this.ydR.cqC();
          k = this.ydR.read();
          localObject = new int[k];
          int[] arrayOfInt = new int[k];
          i = 0;
          while (i < k)
          {
            localObject[i] = this.ydR.readInt();
            i += 1;
          }
          i = 0;
          while (i < k)
          {
            arrayOfInt[i] = (this.ydR.readInt() + j);
            i += 1;
          }
          parame.a(i1, n, (int[])localObject, arrayOfInt);
        }
        break;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tinker\a\b\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */