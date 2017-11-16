package b.a.a.b.a;

import java.io.InputStream;
import java.util.LinkedList;

public final class a
{
  private int aCG = 0;
  public int aCH;
  public int aCI = 0;
  private int aCJ = Integer.MAX_VALUE;
  private int aCM = 67108864;
  public byte[] buffer;
  public int bufferSize;
  private InputStream yqZ;
  private int yra = 0;
  
  public a(byte[] paramArrayOfByte, int paramInt)
  {
    this.buffer = paramArrayOfByte;
    this.bufferSize = (paramInt + 0);
    this.aCH = 0;
    this.yqZ = null;
  }
  
  private int[] Gw(int paramInt)
  {
    int j = this.buffer[paramInt];
    int i = paramInt + 1;
    if (j >= 0) {
      return new int[] { j, i };
    }
    paramInt = j & 0x7F;
    j = this.buffer[i];
    if (j >= 0)
    {
      i += 1;
      paramInt |= j << 7;
    }
    int k;
    do
    {
      for (;;)
      {
        return new int[] { paramInt, i };
        paramInt |= (j & 0x7F) << 7;
        j = this.buffer[i];
        if (j >= 0)
        {
          i += 1;
          paramInt |= j << 14;
        }
        else
        {
          paramInt |= (j & 0x7F) << 14;
          j = this.buffer[i];
          if (j < 0) {
            break;
          }
          i += 1;
          paramInt |= j << 21;
        }
      }
      k = this.buffer[i];
      paramInt = paramInt | (j & 0x7F) << 21 | k << 28;
      j = i + 1;
      i = j;
    } while (k >= 0);
    paramInt = 0;
    for (;;)
    {
      if (paramInt >= 5) {
        throw b.csZ();
      }
      if (this.buffer[j] >= 0) {
        return new int[] { k, j + 1 };
      }
      paramInt += 1;
    }
  }
  
  private void cH(int paramInt)
  {
    if (paramInt < 0) {
      throw b.csY();
    }
    if (this.yra + this.aCH + paramInt > this.aCJ)
    {
      cH(this.aCJ - this.yra - this.aCH);
      throw b.csX();
    }
    if (paramInt < this.bufferSize - this.aCH) {
      this.aCH += paramInt;
    }
    for (;;)
    {
      return;
      int i = this.bufferSize - this.aCH;
      this.yra += i;
      this.aCH = 0;
      this.bufferSize = 0;
      while (i < paramInt)
      {
        if (this.yqZ == null) {}
        for (int j = -1; j <= 0; j = (int)this.yqZ.skip(paramInt - i)) {
          throw b.csX();
        }
        i += j;
        this.yra = (j + this.yra);
      }
    }
  }
  
  private byte nn()
  {
    if (this.aCH == this.bufferSize) {
      nk(true);
    }
    byte[] arrayOfByte = this.buffer;
    int i = this.aCH;
    this.aCH = (i + 1);
    return arrayOfByte[i];
  }
  
  public final LinkedList<byte[]> Gv(int paramInt)
  {
    LinkedList localLinkedList = new LinkedList();
    int i = nj();
    try
    {
      byte[] arrayOfByte = new byte[i];
      System.arraycopy(this.buffer, this.aCH, arrayOfByte, 0, i);
      localLinkedList.add(arrayOfByte);
      this.aCH = (i + this.aCH);
      i = this.aCH;
      if (this.aCH == this.bufferSize) {
        return localLinkedList;
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      throw new OutOfMemoryError("alloc bytes:" + i);
    }
    Object localObject = Gw(i);
    for (i = localObject[0];; i = localObject[0])
    {
      if (b.a.a.b.a.cO(i) != paramInt) {}
      do
      {
        return localLinkedList;
        this.aCH = localObject[1];
        i = nj();
        localObject = new byte[i];
        System.arraycopy(this.buffer, this.aCH, localObject, 0, i);
        localLinkedList.add(localObject);
        this.aCH = (i + this.aCH);
      } while (this.aCH == this.bufferSize);
      localObject = Gw(this.aCH);
    }
  }
  
  public final byte[] cG(int paramInt)
  {
    if (paramInt < 0) {
      throw b.csY();
    }
    if (this.yra + this.aCH + paramInt > this.aCJ)
    {
      cH(this.aCJ - this.yra - this.aCH);
      throw b.csX();
    }
    if (paramInt <= this.bufferSize - this.aCH)
    {
      localObject = new byte[paramInt];
      System.arraycopy(this.buffer, this.aCH, localObject, 0, paramInt);
      this.aCH += paramInt;
      return (byte[])localObject;
    }
    if (paramInt < 2048)
    {
      localObject = new byte[paramInt];
      i = this.bufferSize - this.aCH;
      System.arraycopy(this.buffer, this.aCH, localObject, 0, i);
      this.aCH = this.bufferSize;
      nk(true);
      for (;;)
      {
        if (paramInt - i <= this.bufferSize)
        {
          System.arraycopy(this.buffer, 0, localObject, i, paramInt - i);
          this.aCH = (paramInt - i);
          return (byte[])localObject;
        }
        System.arraycopy(this.buffer, 0, localObject, i, this.bufferSize);
        i += this.bufferSize;
        this.aCH = this.bufferSize;
        nk(true);
      }
    }
    int m = this.aCH;
    int n = this.bufferSize;
    this.yra += this.bufferSize;
    this.aCH = 0;
    this.bufferSize = 0;
    Object localObject = new LinkedList();
    int i = paramInt - (n - m);
    byte[] arrayOfByte1;
    if (i <= 0)
    {
      arrayOfByte1 = new byte[paramInt];
      i = n - m;
      System.arraycopy(this.buffer, m, arrayOfByte1, 0, i);
      paramInt = 0;
    }
    for (;;)
    {
      if (paramInt >= ((LinkedList)localObject).size())
      {
        return arrayOfByte1;
        arrayOfByte1 = new byte[Math.min(i, 2048)];
        int j = 0;
        for (;;)
        {
          if (j >= arrayOfByte1.length)
          {
            j = arrayOfByte1.length;
            ((LinkedList)localObject).add(arrayOfByte1);
            i -= j;
            break;
          }
          if (this.yqZ == null) {}
          for (int k = -1; k == -1; k = this.yqZ.read(arrayOfByte1, j, arrayOfByte1.length - j)) {
            throw b.csX();
          }
          this.yra += k;
          j += k;
        }
      }
      byte[] arrayOfByte2 = (byte[])((LinkedList)localObject).get(paramInt);
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, i, arrayOfByte2.length);
      i += arrayOfByte2.length;
      paramInt += 1;
    }
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
        throw b.csZ();
      }
      i = k;
      if (nn() >= 0) {
        break;
      }
      j += 1;
    }
  }
  
  public final long nk()
  {
    int i = 0;
    long l = 0L;
    for (;;)
    {
      if (i >= 64) {
        throw b.csZ();
      }
      int j = nn();
      l |= (j & 0x7F) << i;
      if ((j & 0x80) == 0) {
        return l;
      }
      i += 7;
    }
  }
  
  public final boolean nk(boolean paramBoolean)
  {
    if (this.aCH < this.bufferSize) {
      throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
    }
    if (this.yra + this.bufferSize == this.aCJ)
    {
      if (paramBoolean) {
        throw b.csX();
      }
      return false;
    }
    this.yra += this.bufferSize;
    this.aCH = 0;
    if (this.yqZ == null) {}
    for (int i = -1;; i = this.yqZ.read(this.buffer))
    {
      this.bufferSize = i;
      if (this.bufferSize != -1) {
        break label117;
      }
      this.bufferSize = 0;
      if (!paramBoolean) {
        break;
      }
      throw b.csX();
    }
    return false;
    label117:
    this.bufferSize += this.aCG;
    i = this.yra + this.bufferSize;
    if (i > this.aCJ)
    {
      this.aCG = (i - this.aCJ);
      this.bufferSize -= this.aCG;
    }
    for (;;)
    {
      i = this.yra + this.bufferSize + this.aCG;
      if ((i <= this.aCM) && (i >= 0)) {
        break;
      }
      throw b.ctb();
      this.aCG = 0;
    }
    return true;
  }
  
  public final double readDouble()
  {
    int i = nn();
    int j = nn();
    int k = nn();
    int m = nn();
    int n = nn();
    int i1 = nn();
    int i2 = nn();
    int i3 = nn();
    long l = i;
    return Double.longBitsToDouble((j & 0xFF) << 8 | l & 0xFF | (k & 0xFF) << 16 | (m & 0xFF) << 24 | (n & 0xFF) << 32 | (i1 & 0xFF) << 40 | (i2 & 0xFF) << 48 | (i3 & 0xFF) << 56);
  }
  
  public final float readFloat()
  {
    return Float.intBitsToFloat(nn() & 0xFF | (nn() & 0xFF) << 8 | (nn() & 0xFF) << 16 | (nn() & 0xFF) << 24);
  }
  
  public final String readString()
  {
    int i = nj();
    if ((i < this.bufferSize - this.aCH) && (i > 0))
    {
      String str = new String(this.buffer, this.aCH, i, "UTF-8");
      this.aCH = (i + this.aCH);
      return str;
    }
    return new String(cG(i), "UTF-8");
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\b\a\a\b\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */