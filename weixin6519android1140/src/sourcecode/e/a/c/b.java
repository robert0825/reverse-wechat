package e.a.c;

import java.io.InputStream;

public final class b
{
  public int uTi;
  public int yuZ;
  public InputStream yva;
  
  public static void b(short[] paramArrayOfShort)
  {
    int i = 0;
    while (i < paramArrayOfShort.length)
    {
      paramArrayOfShort[i] = 1024;
      i += 1;
    }
  }
  
  public final int d(short[] paramArrayOfShort, int paramInt)
  {
    int i = paramArrayOfShort[paramInt];
    int j = (this.yuZ >>> 11) * i;
    if ((this.uTi ^ 0x80000000) < (0x80000000 ^ j))
    {
      this.yuZ = j;
      paramArrayOfShort[paramInt] = ((short)(i + (2048 - i >>> 5)));
      if ((this.yuZ & 0xFF000000) == 0)
      {
        this.uTi = (this.uTi << 8 | this.yva.read());
        this.yuZ <<= 8;
      }
      return 0;
    }
    this.yuZ -= j;
    this.uTi -= j;
    paramArrayOfShort[paramInt] = ((short)(i - (i >>> 5)));
    if ((this.yuZ & 0xFF000000) == 0)
    {
      this.uTi = (this.uTi << 8 | this.yva.read());
      this.yuZ <<= 8;
    }
    return 1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\e\a\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */