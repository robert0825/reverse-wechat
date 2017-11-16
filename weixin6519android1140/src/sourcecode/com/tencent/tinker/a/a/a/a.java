package com.tencent.tinker.a.a.a;

import com.tencent.tinker.a.a.c;
import com.tencent.tinker.a.a.d;
import com.tencent.tinker.a.a.e;
import com.tencent.tinker.a.a.e.a;
import com.tencent.tinker.a.a.e.b;
import com.tencent.tinker.a.a.f;
import com.tencent.tinker.a.a.g;
import com.tencent.tinker.a.a.g.a;
import com.tencent.tinker.a.a.g.b;
import com.tencent.tinker.a.a.h;
import com.tencent.tinker.a.a.j;
import com.tencent.tinker.a.a.k;
import com.tencent.tinker.a.a.m;
import com.tencent.tinker.a.a.n;
import com.tencent.tinker.a.a.o;
import com.tencent.tinker.a.a.p;
import com.tencent.tinker.a.a.q;
import com.tencent.tinker.a.a.r;
import com.tencent.tinker.a.a.s;
import com.tencent.tinker.a.a.u;
import java.io.ByteArrayOutputStream;
import java.io.UTFDataFormatException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class a
  implements com.tencent.tinker.a.a.b.a, com.tencent.tinker.a.a.b.b
{
  private static final short[] ycH = new short[0];
  private static final g.b[] ydH = new g.b[0];
  private static final g.a[] ydI = new g.a[0];
  public ByteBuffer ycQ;
  public int ydJ;
  private boolean ydK;
  
  public a()
  {
    this.ycQ = ByteBuffer.allocate(512);
    this.ycQ.order(ByteOrder.LITTLE_ENDIAN);
    this.ydJ = this.ycQ.position();
    this.ycQ.limit(this.ycQ.capacity());
    this.ydK = true;
  }
  
  public a(ByteBuffer paramByteBuffer)
  {
    this.ycQ = paramByteBuffer;
    this.ycQ.order(ByteOrder.LITTLE_ENDIAN);
    this.ydJ = paramByteBuffer.limit();
    this.ydK = false;
  }
  
  private short[] Fu(int paramInt)
  {
    Object localObject;
    if (paramInt == 0)
    {
      localObject = ycH;
      return (short[])localObject;
    }
    short[] arrayOfShort = new short[paramInt];
    int i = 0;
    for (;;)
    {
      localObject = arrayOfShort;
      if (i >= paramInt) {
        break;
      }
      arrayOfShort[i] = this.ycQ.getShort();
      i += 1;
    }
  }
  
  private e.a[] Fv(int paramInt)
  {
    int i = 0;
    e.a[] arrayOfa = new e.a[paramInt];
    int j = 0;
    while (i < paramInt)
    {
      j += o.b(this);
      arrayOfa[i] = new e.a(j, o.b(this));
      i += 1;
    }
    return arrayOfa;
  }
  
  private e.b[] Fw(int paramInt)
  {
    int i = 0;
    e.b[] arrayOfb = new e.b[paramInt];
    int j = 0;
    while (i < paramInt)
    {
      j += o.b(this);
      arrayOfb[i] = new e.b(j, o.b(this), o.b(this));
      i += 1;
    }
    return arrayOfb;
  }
  
  private byte[] Fx(int paramInt)
  {
    byte[] arrayOfByte = new byte[this.ycQ.position() - paramInt];
    this.ycQ.position(paramInt);
    this.ycQ.get(arrayOfByte);
    return arrayOfByte;
  }
  
  private void Fy(int paramInt)
  {
    int i = (short)paramInt;
    if (paramInt != (0xFFFF & i)) {
      throw new IllegalArgumentException("Expected an unsigned short: " + paramInt);
    }
    writeShort(i);
  }
  
  private void a(e.a[] paramArrayOfa)
  {
    int i = 0;
    int k = paramArrayOfa.length;
    int j = 0;
    while (i < k)
    {
      e.a locala = paramArrayOfa[i];
      o.a(this, locala.ycg - j);
      j = locala.ycg;
      o.a(this, locala.ych);
      i += 1;
    }
  }
  
  private void a(e.b[] paramArrayOfb)
  {
    int i = 0;
    int k = paramArrayOfb.length;
    int j = 0;
    while (i < k)
    {
      e.b localb = paramArrayOfb[i];
      o.a(this, localb.yci - j);
      j = localb.yci;
      o.a(this, localb.ych);
      o.a(this, localb.ycj);
      i += 1;
    }
  }
  
  private int cqA()
  {
    return o.b(this) - 1;
  }
  
  private int cqB()
  {
    return o.a(this);
  }
  
  private int cqz()
  {
    return o.b(this);
  }
  
  private int readUnsignedShort()
  {
    return this.ycQ.getShort() & 0xFFFF;
  }
  
  private void skip(int paramInt)
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException();
    }
    this.ycQ.position(this.ycQ.position() + paramInt);
  }
  
  public final void Fs(int paramInt)
  {
    if ((this.ycQ.position() + paramInt > this.ycQ.limit()) && (this.ydK))
    {
      byte[] arrayOfByte1 = this.ycQ.array();
      byte[] arrayOfByte2 = new byte[arrayOfByte1.length + paramInt + (arrayOfByte1.length >> 1)];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, this.ycQ.position());
      paramInt = this.ycQ.position();
      this.ycQ = ByteBuffer.wrap(arrayOfByte2);
      this.ycQ.order(ByteOrder.LITTLE_ENDIAN);
      this.ycQ.position(paramInt);
      this.ycQ.limit(this.ycQ.capacity());
    }
  }
  
  public final byte[] Ft(int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    this.ycQ.get(arrayOfByte);
    return arrayOfByte;
  }
  
  public int a(com.tencent.tinker.a.a.a parama)
  {
    int i = this.ycQ.position();
    writeByte(parama.ybU);
    a(parama.ybV);
    return i;
  }
  
  public int a(com.tencent.tinker.a.a.b paramb)
  {
    int j = this.ycQ.position();
    writeInt(paramb.ybW.length);
    paramb = paramb.ybW;
    int k = paramb.length;
    int i = 0;
    while (i < k)
    {
      writeInt(paramb[i]);
      i += 1;
    }
    return j;
  }
  
  public int a(c paramc)
  {
    int j = this.ycQ.position();
    writeInt(paramc.ybX.length);
    paramc = paramc.ybX;
    int k = paramc.length;
    int i = 0;
    while (i < k)
    {
      writeInt(paramc[i]);
      i += 1;
    }
    return j;
  }
  
  public int a(d paramd)
  {
    int j = this.ycQ.position();
    writeInt(paramd.ybY);
    writeInt(paramd.ybZ.length);
    writeInt(paramd.yca.length);
    writeInt(paramd.ycb.length);
    int[][] arrayOfInt = paramd.ybZ;
    int k = arrayOfInt.length;
    int i = 0;
    int[] arrayOfInt1;
    while (i < k)
    {
      arrayOfInt1 = arrayOfInt[i];
      writeInt(arrayOfInt1[0]);
      writeInt(arrayOfInt1[1]);
      i += 1;
    }
    arrayOfInt = paramd.yca;
    k = arrayOfInt.length;
    i = 0;
    while (i < k)
    {
      arrayOfInt1 = arrayOfInt[i];
      writeInt(arrayOfInt1[0]);
      writeInt(arrayOfInt1[1]);
      i += 1;
    }
    paramd = paramd.ycb;
    k = paramd.length;
    i = 0;
    while (i < k)
    {
      arrayOfInt = paramd[i];
      writeInt(arrayOfInt[0]);
      writeInt(arrayOfInt[1]);
      i += 1;
    }
    return j;
  }
  
  public int a(e parame)
  {
    int i = this.ycQ.position();
    o.a(this, parame.ycc.length);
    o.a(this, parame.ycd.length);
    o.a(this, parame.yce.length);
    o.a(this, parame.ycf.length);
    a(parame.ycc);
    a(parame.ycd);
    a(parame.yce);
    a(parame.ycf);
    return i;
  }
  
  public int a(f paramf)
  {
    int i = this.ycQ.position();
    writeInt(paramf.yck);
    writeInt(paramf.ych);
    writeInt(paramf.ycl);
    writeInt(paramf.ycm);
    writeInt(paramf.ycn);
    writeInt(paramf.yco);
    writeInt(paramf.ycp);
    writeInt(paramf.ycq);
    return i;
  }
  
  public int a(g paramg)
  {
    int k = 0;
    int m = this.ycQ.position();
    Fy(paramg.ycr);
    Fy(paramg.ycs);
    Fy(paramg.yct);
    Fy(paramg.ycw.length);
    writeInt(paramg.ycu);
    writeInt(paramg.ycv.length);
    Object localObject1 = paramg.ycv;
    Fs(localObject1.length * 2);
    int j = localObject1.length;
    int i = 0;
    while (i < j)
    {
      writeShort(localObject1[i]);
      i += 1;
    }
    if (this.ycQ.position() > this.ydJ) {
      this.ydJ = this.ycQ.position();
    }
    if (paramg.ycw.length > 0)
    {
      if ((paramg.ycv.length & 0x1) == 1) {
        writeShort((short)0);
      }
      int n = this.ycQ.position();
      i = paramg.ycw.length * 8;
      Fs(i * 1);
      skip(i);
      g.a[] arrayOfa = paramg.ycx;
      int i1 = this.ycQ.position();
      o.a(this, arrayOfa.length);
      localObject1 = new int[arrayOfa.length];
      i = 0;
      while (i < arrayOfa.length)
      {
        localObject1[i] = (this.ycQ.position() - i1);
        Object localObject2 = arrayOfa[i];
        int i2 = ((g.a)localObject2).ycA;
        int[] arrayOfInt = ((g.a)localObject2).ycy;
        localObject2 = ((g.a)localObject2).ycz;
        if (i2 != -1) {
          o.c(this, -arrayOfInt.length);
        }
        for (;;)
        {
          j = 0;
          while (j < arrayOfInt.length)
          {
            o.a(this, arrayOfInt[j]);
            o.a(this, localObject2[j]);
            j += 1;
          }
          o.c(this, arrayOfInt.length);
        }
        if (i2 != -1) {
          o.a(this, i2);
        }
        i += 1;
      }
      j = this.ycQ.position();
      this.ycQ.position(n);
      paramg = paramg.ycw;
      n = paramg.length;
      i = k;
      while (i < n)
      {
        arrayOfa = paramg[i];
        writeInt(arrayOfa.ycB);
        Fy(arrayOfa.ycC);
        Fy(localObject1[arrayOfa.ycD]);
        i += 1;
      }
      this.ycQ.position(j);
    }
    return m;
  }
  
  public int a(h paramh)
  {
    int j = this.ycQ.position();
    o.a(this, paramh.ycE);
    int k = paramh.ycF.length;
    o.a(this, k);
    int i = 0;
    while (i < k)
    {
      o.a(this, paramh.ycF[i] + 1);
      i += 1;
    }
    write(paramh.ycG);
    return j;
  }
  
  public int a(k paramk)
  {
    int i = this.ycQ.position();
    write(paramk.data);
    return i;
  }
  
  public int a(n paramn)
  {
    int i = this.ycQ.position();
    Fy(paramn.ycY);
    Fy(paramn.yck);
    writeInt(paramn.ycZ);
    return i;
  }
  
  public int a(p paramp)
  {
    int i = this.ycQ.position();
    Fy(paramp.ycY);
    Fy(paramp.yda);
    writeInt(paramp.ycZ);
    return i;
  }
  
  public int a(r paramr)
  {
    int i = this.ycQ.position();
    writeInt(paramr.ydb);
    writeInt(paramr.ydc);
    writeInt(paramr.ydd);
    return i;
  }
  
  public int a(s params)
  {
    int i = 0;
    int j = this.ycQ.position();
    long l;
    for (;;)
    {
      int m;
      try
      {
        o.a(this, params.value.length());
        params = params.value;
        l = 0L;
        int k = params.length();
        if (i >= k) {
          break;
        }
        m = params.charAt(i);
        if ((m != 0) && (m <= 127))
        {
          l += 1L;
          if (l <= 65535L) {
            break label127;
          }
          throw new UTFDataFormatException("String more than 65535 UTF bytes long");
        }
      }
      catch (UTFDataFormatException params)
      {
        throw new AssertionError(params);
      }
      if (m <= 2047)
      {
        l += 2L;
      }
      else
      {
        l += 3L;
        continue;
        label127:
        i += 1;
      }
    }
    i = (int)l;
    byte[] arrayOfByte = new byte[i];
    q.a(arrayOfByte, 0, params);
    write(arrayOfByte);
    writeByte(0);
    return j;
  }
  
  public int a(u paramu)
  {
    int j = this.ycQ.position();
    paramu = paramu.ydG;
    writeInt(paramu.length);
    int k = paramu.length;
    int i = 0;
    while (i < k)
    {
      writeShort(paramu[i]);
      i += 1;
    }
    return j;
  }
  
  public s cqa()
  {
    int j = 0;
    int k = this.ycQ.position();
    for (;;)
    {
      int i;
      try
      {
        int m = o.b(this);
        Object localObject = new char[m];
        i = (char)(readByte() & 0xFF);
        if (i == 0)
        {
          localObject = new String((char[])localObject, 0, j);
          if (((String)localObject).length() == m) {
            break label259;
          }
          throw new j("Declared length " + m + " doesn't match decoded length of " + ((String)localObject).length());
        }
      }
      catch (UTFDataFormatException localUTFDataFormatException)
      {
        throw new j(localUTFDataFormatException);
      }
      localUTFDataFormatException[j] = i;
      if (i < 128)
      {
        j += 1;
      }
      else
      {
        int n;
        int i1;
        label259:
        s locals;
        if ((i & 0xE0) == 192)
        {
          n = readByte() & 0xFF;
          if ((n & 0xC0) != 128) {
            throw new UTFDataFormatException("bad second byte");
          }
        }
        else
        {
          if ((i & 0xF0) == 224)
          {
            n = readByte() & 0xFF;
            i1 = readByte() & 0xFF;
            if (((n & 0xC0) == 128) && ((i1 & 0xC0) == 128)) {
              break label299;
            }
            throw new UTFDataFormatException("bad second or third byte");
          }
          throw new UTFDataFormatException("bad byte");
          locals = new s(k, localUTFDataFormatException);
          return locals;
        }
        locals[j] = ((char)((i & 0x1F) << 6 | n & 0x3F));
        j += 1;
        continue;
        label299:
        locals[j] = ((char)((i & 0xF) << 12 | (n & 0x3F) << 6 | i1 & 0x3F));
        j += 1;
      }
    }
  }
  
  public u cqb()
  {
    return new u(this.ycQ.position(), Fu(this.ycQ.getInt()));
  }
  
  public n cqc()
  {
    return new n(this.ycQ.position(), readUnsignedShort(), readUnsignedShort(), this.ycQ.getInt());
  }
  
  public p cqd()
  {
    return new p(this.ycQ.position(), readUnsignedShort(), readUnsignedShort(), this.ycQ.getInt());
  }
  
  public r cqe()
  {
    return new r(this.ycQ.position(), this.ycQ.getInt(), this.ycQ.getInt(), this.ycQ.getInt());
  }
  
  public f cqf()
  {
    return new f(this.ycQ.position(), this.ycQ.getInt(), this.ycQ.getInt(), this.ycQ.getInt(), this.ycQ.getInt(), this.ycQ.getInt(), this.ycQ.getInt(), this.ycQ.getInt(), this.ycQ.getInt());
  }
  
  public g cqg()
  {
    int k = this.ycQ.position();
    int m = readUnsignedShort();
    int n = readUnsignedShort();
    int i1 = readUnsignedShort();
    int i2 = readUnsignedShort();
    int i3 = this.ycQ.getInt();
    short[] arrayOfShort = Fu(this.ycQ.getInt());
    g.a[] arrayOfa;
    Object localObject;
    if (i2 > 0)
    {
      if ((arrayOfShort.length & 0x1) == 1) {
        skip(2);
      }
      int i4 = this.ycQ.position();
      skip(i2 * 8);
      int i5 = this.ycQ.position();
      int i6 = o.b(this);
      arrayOfa = new g.a[i6];
      int i = 0;
      int i7;
      int j;
      if (i < i6)
      {
        i7 = this.ycQ.position();
        int i8 = o.a(this);
        int i9 = Math.abs(i8);
        localObject = new int[i9];
        int[] arrayOfInt = new int[i9];
        j = 0;
        while (j < i9)
        {
          localObject[j] = o.b(this);
          arrayOfInt[j] = o.b(this);
          j += 1;
        }
        if (i8 <= 0) {}
        for (j = o.b(this);; j = -1)
        {
          arrayOfa[i] = new g.a((int[])localObject, arrayOfInt, j, i7 - i5);
          i += 1;
          break;
        }
      }
      i5 = this.ycQ.position();
      this.ycQ.position(i4);
      localObject = new g.b[i2];
      i = 0;
      if (i < i2)
      {
        i4 = this.ycQ.getInt();
        i6 = readUnsignedShort();
        i7 = readUnsignedShort();
        j = 0;
        for (;;)
        {
          if (j >= arrayOfa.length) {
            break label335;
          }
          if (arrayOfa[j].offset == i7)
          {
            localObject[i] = new g.b(i4, i6, j);
            i += 1;
            break;
          }
          j += 1;
        }
        label335:
        throw new IllegalArgumentException();
      }
      this.ycQ.position(i5);
    }
    for (;;)
    {
      return new g(k, m, n, i1, i3, arrayOfShort, (g.b[])localObject, arrayOfa);
      localObject = ydH;
      arrayOfa = ydI;
    }
  }
  
  /* Error */
  public h cqh()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 46	com/tencent/tinker/a/a/a/a:ycQ	Ljava/nio/ByteBuffer;
    //   4: invokevirtual 60	java/nio/ByteBuffer:position	()I
    //   7: istore_2
    //   8: aload_0
    //   9: invokestatic 90	com/tencent/tinker/a/a/o:b	(Lcom/tencent/tinker/a/a/b/a;)I
    //   12: istore_3
    //   13: aload_0
    //   14: invokestatic 90	com/tencent/tinker/a/a/o:b	(Lcom/tencent/tinker/a/a/b/a;)I
    //   17: istore 4
    //   19: iload 4
    //   21: newarray <illegal type>
    //   23: astore 5
    //   25: iconst_0
    //   26: istore_1
    //   27: iload_1
    //   28: iload 4
    //   30: if_icmpge +20 -> 50
    //   33: aload 5
    //   35: iload_1
    //   36: aload_0
    //   37: invokestatic 90	com/tencent/tinker/a/a/o:b	(Lcom/tencent/tinker/a/a/b/a;)I
    //   40: iconst_1
    //   41: isub
    //   42: iastore
    //   43: iload_1
    //   44: iconst_1
    //   45: iadd
    //   46: istore_1
    //   47: goto -20 -> 27
    //   50: new 499	java/io/ByteArrayOutputStream
    //   53: dup
    //   54: bipush 64
    //   56: invokespecial 501	java/io/ByteArrayOutputStream:<init>	(I)V
    //   59: astore 6
    //   61: new 10	com/tencent/tinker/a/a/a/a$1
    //   64: dup
    //   65: aload_0
    //   66: aload 6
    //   68: invokespecial 504	com/tencent/tinker/a/a/a/a$1:<init>	(Lcom/tencent/tinker/a/a/a/a;Ljava/io/ByteArrayOutputStream;)V
    //   71: astore 7
    //   73: aload_0
    //   74: getfield 46	com/tencent/tinker/a/a/a/a:ycQ	Ljava/nio/ByteBuffer;
    //   77: invokevirtual 506	java/nio/ByteBuffer:get	()B
    //   80: istore_1
    //   81: aload 6
    //   83: iload_1
    //   84: invokevirtual 508	java/io/ByteArrayOutputStream:write	(I)V
    //   87: iload_1
    //   88: tableswitch	default:+215->303, 0:+56->144, 1:+82->170, 2:+110->198, 3:+123->211, 4:+123->211, 5:+171->259, 6:+171->259, 7:+215->303, 8:+215->303, 9:+184->272
    //   144: new 324	com/tencent/tinker/a/a/h
    //   147: dup
    //   148: iload_2
    //   149: iload_3
    //   150: aload 5
    //   152: aload 6
    //   154: invokevirtual 511	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   157: invokespecial 514	com/tencent/tinker/a/a/h:<init>	(II[I[B)V
    //   160: astore 5
    //   162: aload 6
    //   164: invokevirtual 517	java/io/ByteArrayOutputStream:close	()V
    //   167: aload 5
    //   169: areturn
    //   170: aload 7
    //   172: aload_0
    //   173: invokespecial 519	com/tencent/tinker/a/a/a/a:cqz	()I
    //   176: invokestatic 141	com/tencent/tinker/a/a/o:a	(Lcom/tencent/tinker/a/a/b/b;I)I
    //   179: pop
    //   180: goto -107 -> 73
    //   183: astore 5
    //   185: aload 6
    //   187: ifnull +8 -> 195
    //   190: aload 6
    //   192: invokevirtual 517	java/io/ByteArrayOutputStream:close	()V
    //   195: aload 5
    //   197: athrow
    //   198: aload 7
    //   200: aload_0
    //   201: invokespecial 521	com/tencent/tinker/a/a/a/a:cqB	()I
    //   204: invokestatic 312	com/tencent/tinker/a/a/o:c	(Lcom/tencent/tinker/a/a/b/b;I)I
    //   207: pop
    //   208: goto -135 -> 73
    //   211: aload 7
    //   213: aload_0
    //   214: invokespecial 519	com/tencent/tinker/a/a/a/a:cqz	()I
    //   217: invokestatic 141	com/tencent/tinker/a/a/o:a	(Lcom/tencent/tinker/a/a/b/b;I)I
    //   220: pop
    //   221: aload 7
    //   223: aload_0
    //   224: invokespecial 523	com/tencent/tinker/a/a/a/a:cqA	()I
    //   227: invokestatic 525	com/tencent/tinker/a/a/o:b	(Lcom/tencent/tinker/a/a/b/b;I)I
    //   230: pop
    //   231: aload 7
    //   233: aload_0
    //   234: invokespecial 523	com/tencent/tinker/a/a/a/a:cqA	()I
    //   237: invokestatic 525	com/tencent/tinker/a/a/o:b	(Lcom/tencent/tinker/a/a/b/b;I)I
    //   240: pop
    //   241: iload_1
    //   242: iconst_4
    //   243: if_icmpne -170 -> 73
    //   246: aload 7
    //   248: aload_0
    //   249: invokespecial 523	com/tencent/tinker/a/a/a/a:cqA	()I
    //   252: invokestatic 525	com/tencent/tinker/a/a/o:b	(Lcom/tencent/tinker/a/a/b/b;I)I
    //   255: pop
    //   256: goto -183 -> 73
    //   259: aload 7
    //   261: aload_0
    //   262: invokespecial 519	com/tencent/tinker/a/a/a/a:cqz	()I
    //   265: invokestatic 141	com/tencent/tinker/a/a/o:a	(Lcom/tencent/tinker/a/a/b/b;I)I
    //   268: pop
    //   269: goto -196 -> 73
    //   272: aload 7
    //   274: aload_0
    //   275: invokespecial 523	com/tencent/tinker/a/a/a/a:cqA	()I
    //   278: invokestatic 525	com/tencent/tinker/a/a/o:b	(Lcom/tencent/tinker/a/a/b/b;I)I
    //   281: pop
    //   282: goto -209 -> 73
    //   285: astore 6
    //   287: aload 5
    //   289: areturn
    //   290: astore 6
    //   292: goto -97 -> 195
    //   295: astore 5
    //   297: aconst_null
    //   298: astore 6
    //   300: goto -115 -> 185
    //   303: goto -230 -> 73
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	306	0	this	a
    //   26	218	1	i	int
    //   7	142	2	j	int
    //   12	138	3	k	int
    //   17	14	4	m	int
    //   23	145	5	localObject1	Object
    //   183	105	5	localh	h
    //   295	1	5	localObject2	Object
    //   59	132	6	localByteArrayOutputStream	ByteArrayOutputStream
    //   285	1	6	localException1	Exception
    //   290	1	6	localException2	Exception
    //   298	1	6	localObject3	Object
    //   71	202	7	local1	1
    // Exception table:
    //   from	to	target	type
    //   61	73	183	finally
    //   73	87	183	finally
    //   144	162	183	finally
    //   170	180	183	finally
    //   198	208	183	finally
    //   211	241	183	finally
    //   246	256	183	finally
    //   259	269	183	finally
    //   272	282	183	finally
    //   162	167	285	java/lang/Exception
    //   190	195	290	java/lang/Exception
    //   50	61	295	finally
  }
  
  public e cqi()
  {
    int i = this.ycQ.position();
    int j = o.b(this);
    int k = o.b(this);
    int m = o.b(this);
    int n = o.b(this);
    return new e(i, Fv(j), Fv(k), Fw(m), Fw(n));
  }
  
  public com.tencent.tinker.a.a.a cqj()
  {
    int i = this.ycQ.position();
    byte b = this.ycQ.get();
    int j = this.ycQ.position();
    new m(this, 29).skipValue();
    return new com.tencent.tinker.a.a.a(i, b, new k(j, Fx(j)));
  }
  
  public com.tencent.tinker.a.a.b cqk()
  {
    int j = this.ycQ.position();
    int k = this.ycQ.getInt();
    int[] arrayOfInt = new int[k];
    int i = 0;
    while (i < k)
    {
      arrayOfInt[i] = this.ycQ.getInt();
      i += 1;
    }
    return new com.tencent.tinker.a.a.b(j, arrayOfInt);
  }
  
  public c cql()
  {
    int j = this.ycQ.position();
    int k = this.ycQ.getInt();
    int[] arrayOfInt = new int[k];
    int i = 0;
    while (i < k)
    {
      arrayOfInt[i] = this.ycQ.getInt();
      i += 1;
    }
    return new c(j, arrayOfInt);
  }
  
  public d cqm()
  {
    int j = this.ycQ.position();
    int k = this.ycQ.getInt();
    int i1 = this.ycQ.getInt();
    int n = this.ycQ.getInt();
    int m = this.ycQ.getInt();
    int[][] arrayOfInt1 = (int[][])Array.newInstance(Integer.TYPE, new int[] { i1, 2 });
    int i = 0;
    while (i < i1)
    {
      arrayOfInt1[i][0] = this.ycQ.getInt();
      arrayOfInt1[i][1] = this.ycQ.getInt();
      i += 1;
    }
    int[][] arrayOfInt2 = (int[][])Array.newInstance(Integer.TYPE, new int[] { n, 2 });
    i = 0;
    while (i < n)
    {
      arrayOfInt2[i][0] = this.ycQ.getInt();
      arrayOfInt2[i][1] = this.ycQ.getInt();
      i += 1;
    }
    int[][] arrayOfInt3 = (int[][])Array.newInstance(Integer.TYPE, new int[] { m, 2 });
    i = 0;
    while (i < m)
    {
      arrayOfInt3[i][0] = this.ycQ.getInt();
      arrayOfInt3[i][1] = this.ycQ.getInt();
      i += 1;
    }
    return new d(j, k, arrayOfInt1, arrayOfInt2, arrayOfInt3);
  }
  
  public k cqn()
  {
    int i = this.ycQ.position();
    new m(this, 28).skipValue();
    return new k(i, Fx(i));
  }
  
  public final byte readByte()
  {
    return this.ycQ.get();
  }
  
  public final void write(byte[] paramArrayOfByte)
  {
    Fs(paramArrayOfByte.length * 1);
    this.ycQ.put(paramArrayOfByte);
    if (this.ycQ.position() > this.ydJ) {
      this.ydJ = this.ycQ.position();
    }
  }
  
  public final void writeByte(int paramInt)
  {
    Fs(1);
    this.ycQ.put((byte)paramInt);
    if (this.ycQ.position() > this.ydJ) {
      this.ydJ = this.ycQ.position();
    }
  }
  
  public final void writeInt(int paramInt)
  {
    Fs(4);
    this.ycQ.putInt(paramInt);
    if (this.ycQ.position() > this.ydJ) {
      this.ydJ = this.ycQ.position();
    }
  }
  
  public final void writeShort(short paramShort)
  {
    Fs(2);
    this.ycQ.putShort(paramShort);
    if (this.ycQ.position() > this.ydJ) {
      this.ydJ = this.ycQ.position();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tinker\a\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */