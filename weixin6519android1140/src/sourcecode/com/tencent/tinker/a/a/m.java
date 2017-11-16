package com.tencent.tinker.a.a;

import com.tencent.tinker.a.a.b.a;

public final class m
{
  private int type = -1;
  protected final a ycV;
  public int ycW;
  private int ycX;
  
  public m(a parama, int paramInt)
  {
    this.ycV = parama;
    this.type = paramInt;
  }
  
  public m(k paramk, int paramInt)
  {
    this(new k.1(paramk), paramInt);
  }
  
  private void Fq(int paramInt)
  {
    if (cqo() != paramInt) {
      throw new IllegalStateException(String.format("Expected %x but was %x", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(cqo()) }));
    }
  }
  
  public final int cqo()
  {
    if (this.type == -1)
    {
      int i = this.ycV.readByte() & 0xFF;
      this.type = (i & 0x1F);
      this.ycX = ((i & 0xE0) >> 5);
    }
    return this.type;
  }
  
  public final int cqp()
  {
    Fq(28);
    this.type = -1;
    return o.b(this.ycV);
  }
  
  public final int cqq()
  {
    Fq(29);
    this.type = -1;
    this.ycW = o.b(this.ycV);
    return o.b(this.ycV);
  }
  
  public final int cqr()
  {
    return o.b(this.ycV);
  }
  
  public final int cqs()
  {
    Fq(23);
    this.type = -1;
    return l.a(this.ycV, this.ycX, false);
  }
  
  public final int cqt()
  {
    Fq(24);
    this.type = -1;
    return l.a(this.ycV, this.ycX, false);
  }
  
  public final int cqu()
  {
    Fq(25);
    this.type = -1;
    return l.a(this.ycV, this.ycX, false);
  }
  
  public final int cqv()
  {
    Fq(27);
    this.type = -1;
    return l.a(this.ycV, this.ycX, false);
  }
  
  public final int cqw()
  {
    Fq(26);
    this.type = -1;
    return l.a(this.ycV, this.ycX, false);
  }
  
  public final void cqx()
  {
    Fq(30);
    this.type = -1;
  }
  
  public final boolean readBoolean()
  {
    Fq(31);
    this.type = -1;
    return this.ycX != 0;
  }
  
  public final byte readByte()
  {
    Fq(0);
    this.type = -1;
    return (byte)l.a(this.ycV, this.ycX);
  }
  
  public final char readChar()
  {
    Fq(3);
    this.type = -1;
    return (char)l.a(this.ycV, this.ycX, false);
  }
  
  public final double readDouble()
  {
    Fq(17);
    this.type = -1;
    a locala = this.ycV;
    int i = this.ycX;
    long l = 0L;
    while (i >= 0)
    {
      l = l >>> 8 | (locala.readByte() & 0xFF) << 56;
      i -= 1;
    }
    return Double.longBitsToDouble(l);
  }
  
  public final float readFloat()
  {
    Fq(16);
    this.type = -1;
    return Float.intBitsToFloat(l.a(this.ycV, this.ycX, true));
  }
  
  public final int readInt()
  {
    Fq(4);
    this.type = -1;
    return l.a(this.ycV, this.ycX);
  }
  
  public final long readLong()
  {
    Fq(6);
    this.type = -1;
    a locala = this.ycV;
    int j = this.ycX;
    long l = 0L;
    int i = j;
    while (i >= 0)
    {
      l = l >>> 8 | (locala.readByte() & 0xFF) << 56;
      i -= 1;
    }
    return l >> (7 - j) * 8;
  }
  
  public final short readShort()
  {
    Fq(2);
    this.type = -1;
    return (short)l.a(this.ycV, this.ycX);
  }
  
  public final void skipValue()
  {
    int j = 0;
    int i = 0;
    switch (cqo())
    {
    case 1: 
    case 5: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    case 14: 
    case 15: 
    case 18: 
    case 19: 
    case 20: 
    case 21: 
    case 22: 
    default: 
      throw new j("Unexpected type: " + Integer.toHexString(this.type));
    case 0: 
      readByte();
      return;
    case 2: 
      readShort();
      return;
    case 3: 
      readChar();
      return;
    case 4: 
      readInt();
      return;
    case 6: 
      readLong();
      return;
    case 16: 
      readFloat();
      return;
    case 17: 
      readDouble();
      return;
    case 23: 
      cqs();
      return;
    case 24: 
      cqt();
      return;
    case 25: 
      cqu();
      return;
    case 27: 
      cqv();
      return;
    case 26: 
      cqw();
      return;
    case 28: 
      j = cqp();
      while (i < j)
      {
        skipValue();
        i += 1;
      }
    case 29: 
      int k = cqq();
      i = j;
      while (i < k)
      {
        o.b(this.ycV);
        skipValue();
        i += 1;
      }
    case 30: 
      cqx();
      return;
    }
    readBoolean();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tinker\a\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */