package com.google.a.a;

public final class a
{
  private int aCF;
  private int aCG;
  private int aCH;
  private int aCI;
  private int aCJ = Integer.MAX_VALUE;
  private int aCK;
  private int aCL = 64;
  private int aCM = 67108864;
  private final byte[] buffer;
  private int bufferSize;
  
  a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.buffer = paramArrayOfByte;
    this.aCF = 0;
    this.bufferSize = (paramInt2 + 0);
    this.aCH = 0;
  }
  
  private byte[] cG(int paramInt)
  {
    if (paramInt < 0) {
      throw d.np();
    }
    if (this.aCH + paramInt > this.aCJ)
    {
      cH(this.aCJ - this.aCH);
      throw d.no();
    }
    if (paramInt <= this.bufferSize - this.aCH)
    {
      byte[] arrayOfByte = new byte[paramInt];
      System.arraycopy(this.buffer, this.aCH, arrayOfByte, 0, paramInt);
      this.aCH += paramInt;
      return arrayOfByte;
    }
    throw d.no();
  }
  
  private void cH(int paramInt)
  {
    if (paramInt < 0) {
      throw d.np();
    }
    if (this.aCH + paramInt > this.aCJ)
    {
      cH(this.aCJ - this.aCH);
      throw d.no();
    }
    if (paramInt <= this.bufferSize - this.aCH)
    {
      this.aCH += paramInt;
      return;
    }
    throw d.no();
  }
  
  private void nl()
  {
    this.bufferSize += this.aCG;
    int i = this.bufferSize;
    if (i > this.aCJ)
    {
      this.aCG = (i - this.aCJ);
      this.bufferSize -= this.aCG;
      return;
    }
    this.aCG = 0;
  }
  
  private byte nn()
  {
    if (this.aCH == this.bufferSize) {
      throw d.no();
    }
    byte[] arrayOfByte = this.buffer;
    int i = this.aCH;
    this.aCH = (i + 1);
    return arrayOfByte[i];
  }
  
  public final void a(e parame)
  {
    int i = nj();
    if (this.aCK >= this.aCL) {
      throw d.nu();
    }
    i = cD(i);
    this.aCK += 1;
    parame.a(this);
    cB(0);
    this.aCK -= 1;
    cE(i);
  }
  
  public final void cB(int paramInt)
  {
    if (this.aCI != paramInt) {
      throw d.ns();
    }
  }
  
  public final boolean cC(int paramInt)
  {
    switch (g.cN(paramInt))
    {
    default: 
      throw d.nt();
    case 0: 
      nj();
      return true;
    case 1: 
      nn();
      nn();
      nn();
      nn();
      nn();
      nn();
      nn();
      nn();
      return true;
    case 2: 
      cH(nj());
      return true;
    case 3: 
      int i;
      do
      {
        i = ni();
      } while ((i != 0) && (cC(i)));
      cB(g.au(g.cO(paramInt), 4));
      return true;
    case 4: 
      return false;
    }
    nn();
    nn();
    nn();
    nn();
    return true;
  }
  
  public final int cD(int paramInt)
  {
    if (paramInt < 0) {
      throw d.np();
    }
    paramInt = this.aCH + paramInt;
    int i = this.aCJ;
    if (paramInt > i) {
      throw d.no();
    }
    this.aCJ = paramInt;
    nl();
    return i;
  }
  
  public final void cE(int paramInt)
  {
    this.aCJ = paramInt;
    nl();
  }
  
  public final void cF(int paramInt)
  {
    if (paramInt > this.aCH - this.aCF) {
      throw new IllegalArgumentException("Position " + paramInt + " is beyond current " + (this.aCH - this.aCF));
    }
    if (paramInt < 0) {
      throw new IllegalArgumentException("Bad position " + paramInt);
    }
    this.aCH = (this.aCF + paramInt);
  }
  
  public final int getPosition()
  {
    return this.aCH - this.aCF;
  }
  
  public final int ni()
  {
    if (this.aCH == this.bufferSize) {}
    for (int i = 1; i != 0; i = 0)
    {
      this.aCI = 0;
      return 0;
    }
    this.aCI = nj();
    if (this.aCI == 0) {
      throw d.nr();
    }
    return this.aCI;
  }
  
  public final int nj()
  {
    int i = nn();
    if (i >= 0) {}
    int k;
    do
    {
      return i;
      i &= 0x7F;
      j = nn();
      if (j >= 0) {
        return i | j << 7;
      }
      i |= (j & 0x7F) << 7;
      j = nn();
      if (j >= 0) {
        return i | j << 14;
      }
      i |= (j & 0x7F) << 14;
      k = nn();
      if (k >= 0) {
        return i | k << 21;
      }
      j = nn();
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
      if (nn() >= 0) {
        break;
      }
      j += 1;
    }
    label133:
    throw d.nq();
  }
  
  public final long nk()
  {
    int i = 0;
    long l = 0L;
    while (i < 64)
    {
      int j = nn();
      l |= (j & 0x7F) << i;
      if ((j & 0x80) == 0) {
        return l;
      }
      i += 7;
    }
    throw d.nq();
  }
  
  public final int nm()
  {
    if (this.aCJ == Integer.MAX_VALUE) {
      return -1;
    }
    int i = this.aCH;
    return this.aCJ - i;
  }
  
  public final byte[] readBytes()
  {
    int i = nj();
    if ((i <= this.bufferSize - this.aCH) && (i > 0))
    {
      byte[] arrayOfByte = new byte[i];
      System.arraycopy(this.buffer, this.aCH, arrayOfByte, 0, i);
      this.aCH = (i + this.aCH);
      return arrayOfByte;
    }
    return cG(i);
  }
  
  public final String readString()
  {
    int i = nj();
    if ((i <= this.bufferSize - this.aCH) && (i > 0))
    {
      String str = new String(this.buffer, this.aCH, i, "UTF-8");
      this.aCH = (i + this.aCH);
      return str;
    }
    return new String(cG(i), "UTF-8");
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */