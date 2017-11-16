package com.google.android.gms.c;

public final class aw
{
  int awN;
  int awO;
  private int awP;
  int awQ;
  private int awR;
  private int awS = Integer.MAX_VALUE;
  private int awT;
  private int awU = 64;
  private int awV = 67108864;
  final byte[] buffer;
  
  aw(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.buffer = paramArrayOfByte;
    this.awN = 0;
    this.awO = (paramInt2 + 0);
    this.awQ = 0;
  }
  
  private void cn(int paramInt)
  {
    if (paramInt < 0) {
      throw bd.lY();
    }
    if (this.awQ + paramInt > this.awS)
    {
      cn(this.awS - this.awQ);
      throw bd.lX();
    }
    if (paramInt <= this.awO - this.awQ)
    {
      this.awQ += paramInt;
      return;
    }
    throw bd.lX();
  }
  
  private void lP()
  {
    this.awO += this.awP;
    int i = this.awO;
    if (i > this.awS)
    {
      this.awP = (i - this.awS);
      this.awO -= this.awP;
      return;
    }
    this.awP = 0;
  }
  
  private byte lR()
  {
    if (this.awQ == this.awO) {
      throw bd.lX();
    }
    byte[] arrayOfByte = this.buffer;
    int i = this.awQ;
    this.awQ = (i + 1);
    return arrayOfByte[i];
  }
  
  public final void a(be parambe)
  {
    int i = lM();
    if (this.awT >= this.awU) {
      throw bd.md();
    }
    i = cj(i);
    this.awT += 1;
    parambe.a(this);
    ch(0);
    this.awT -= 1;
    ck(i);
  }
  
  public final void ch(int paramInt)
  {
    if (this.awR != paramInt) {
      throw bd.mb();
    }
  }
  
  public final boolean ci(int paramInt)
  {
    switch (bh.cw(paramInt))
    {
    default: 
      throw bd.mc();
    case 0: 
      lM();
      return true;
    case 1: 
      lO();
      return true;
    case 2: 
      cn(lM());
      return true;
    case 3: 
      int i;
      do
      {
        i = lJ();
      } while ((i != 0) && (ci(i)));
      ch(bh.an(bh.cx(paramInt), 4));
      return true;
    case 4: 
      return false;
    }
    lN();
    return true;
  }
  
  public final int cj(int paramInt)
  {
    if (paramInt < 0) {
      throw bd.lY();
    }
    paramInt = this.awQ + paramInt;
    int i = this.awS;
    if (paramInt > i) {
      throw bd.lX();
    }
    this.awS = paramInt;
    lP();
    return i;
  }
  
  public final void ck(int paramInt)
  {
    this.awS = paramInt;
    lP();
  }
  
  public final void cl(int paramInt)
  {
    if (paramInt > this.awQ - this.awN) {
      throw new IllegalArgumentException("Position " + paramInt + " is beyond current " + (this.awQ - this.awN));
    }
    if (paramInt < 0) {
      throw new IllegalArgumentException("Bad position " + paramInt);
    }
    this.awQ = (this.awN + paramInt);
  }
  
  public final byte[] cm(int paramInt)
  {
    if (paramInt < 0) {
      throw bd.lY();
    }
    if (this.awQ + paramInt > this.awS)
    {
      cn(this.awS - this.awQ);
      throw bd.lX();
    }
    if (paramInt <= this.awO - this.awQ)
    {
      byte[] arrayOfByte = new byte[paramInt];
      System.arraycopy(this.buffer, this.awQ, arrayOfByte, 0, paramInt);
      this.awQ += paramInt;
      return arrayOfByte;
    }
    throw bd.lX();
  }
  
  public final int getPosition()
  {
    return this.awQ - this.awN;
  }
  
  public final int lJ()
  {
    if (this.awQ == this.awO) {}
    for (int i = 1; i != 0; i = 0)
    {
      this.awR = 0;
      return 0;
    }
    this.awR = lM();
    if (this.awR == 0) {
      throw bd.ma();
    }
    return this.awR;
  }
  
  public final long lK()
  {
    int i = 0;
    long l = 0L;
    while (i < 64)
    {
      int j = lR();
      l |= (j & 0x7F) << i;
      if ((j & 0x80) == 0) {
        return l;
      }
      i += 7;
    }
    throw bd.lZ();
  }
  
  public final boolean lL()
  {
    return lM() != 0;
  }
  
  public final int lM()
  {
    int i = lR();
    if (i >= 0) {}
    int k;
    do
    {
      return i;
      i &= 0x7F;
      j = lR();
      if (j >= 0) {
        return i | j << 7;
      }
      i |= (j & 0x7F) << 7;
      j = lR();
      if (j >= 0) {
        return i | j << 14;
      }
      i |= (j & 0x7F) << 14;
      k = lR();
      if (k >= 0) {
        return i | k << 21;
      }
      j = lR();
      k = i | (k & 0x7F) << 21 | j << 28;
      i = k;
    } while (j >= 0);
    int j = 0;
    for (;;)
    {
      if (j >= 5) {
        break label133;
      }
      i = k;
      if (lR() >= 0) {
        break;
      }
      j += 1;
    }
    label133:
    throw bd.lZ();
  }
  
  public final int lN()
  {
    return lR() & 0xFF | (lR() & 0xFF) << 8 | (lR() & 0xFF) << 16 | (lR() & 0xFF) << 24;
  }
  
  public final long lO()
  {
    int i = lR();
    int j = lR();
    int k = lR();
    int m = lR();
    int n = lR();
    int i1 = lR();
    int i2 = lR();
    int i3 = lR();
    long l = i;
    return (j & 0xFF) << 8 | l & 0xFF | (k & 0xFF) << 16 | (m & 0xFF) << 24 | (n & 0xFF) << 32 | (i1 & 0xFF) << 40 | (i2 & 0xFF) << 48 | (i3 & 0xFF) << 56;
  }
  
  public final int lQ()
  {
    if (this.awS == Integer.MAX_VALUE) {
      return -1;
    }
    int i = this.awQ;
    return this.awS - i;
  }
  
  public final String readString()
  {
    int i = lM();
    if ((i <= this.awO - this.awQ) && (i > 0))
    {
      String str = new String(this.buffer, this.awQ, i, "UTF-8");
      this.awQ = (i + this.awQ);
      return str;
    }
    return new String(cm(i), "UTF-8");
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\c\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */