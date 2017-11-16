package com.tencent.mm.plugin.nfc.a;

import com.tencent.gmtrace.GMTrace;
import java.io.Serializable;
import java.util.Arrays;

public final class a
  implements Serializable
{
  private byte[] nwX;
  private transient int nwY;
  private transient int nwZ;
  private transient int nxa;
  
  public a(String paramString)
  {
    GMTrace.i(8958630690816L, 66747);
    this.nwX = com.tencent.mm.plugin.nfc.c.a.hexStringToByteArray(paramString);
    aUb();
    GMTrace.o(8958630690816L, 66747);
  }
  
  public a(byte[] paramArrayOfByte)
  {
    GMTrace.i(8958496473088L, 66746);
    this.nwX = ((byte[])paramArrayOfByte.clone());
    aUb();
    GMTrace.o(8958496473088L, 66746);
  }
  
  private void aUb()
  {
    GMTrace.i(8958764908544L, 66748);
    if (this.nwX.length < 4) {
      throw new IllegalArgumentException("apdu must be at least 4 bytes long");
    }
    if (this.nwX.length == 4)
    {
      GMTrace.o(8958764908544L, 66748);
      return;
    }
    int j = this.nwX[4] & 0xFF;
    if (this.nwX.length == 5)
    {
      i = j;
      if (j == 0) {
        i = 256;
      }
      this.nwZ = i;
      GMTrace.o(8958764908544L, 66748);
      return;
    }
    if (j != 0)
    {
      if (this.nwX.length == j + 5)
      {
        this.nwY = j;
        this.nxa = 5;
        GMTrace.o(8958764908544L, 66748);
        return;
      }
      if (this.nwX.length == j + 6)
      {
        this.nwY = j;
        this.nxa = 5;
        j = this.nwX[(this.nwX.length - 1)] & 0xFF;
        i = j;
        if (j == 0) {
          i = 256;
        }
        this.nwZ = i;
        GMTrace.o(8958764908544L, 66748);
        return;
      }
      throw new IllegalArgumentException("Invalid APDU: length=" + this.nwX.length + ", b1=" + j);
    }
    if (this.nwX.length < 7) {
      throw new IllegalArgumentException("Invalid APDU: length=" + this.nwX.length + ", b1=" + j);
    }
    int i = (this.nwX[5] & 0xFF) << 8 | this.nwX[6] & 0xFF;
    if (this.nwX.length == 7)
    {
      if (i == 0) {
        i = 65536;
      }
      for (;;)
      {
        this.nwZ = i;
        GMTrace.o(8958764908544L, 66748);
        return;
      }
    }
    if (i == 0) {
      throw new IllegalArgumentException("Invalid APDU: length=" + this.nwX.length + ", b1=" + j + ", b2||b3=" + i);
    }
    if (this.nwX.length == i + 7)
    {
      this.nwY = i;
      this.nxa = 7;
      GMTrace.o(8958764908544L, 66748);
      return;
    }
    if (this.nwX.length == i + 9)
    {
      this.nwY = i;
      this.nxa = 7;
      i = this.nwX.length - 2;
      j = this.nwX[i];
      j = this.nwX[(i + 1)] & 0xFF | (j & 0xFF) << 8;
      i = j;
      if (j == 0) {
        i = 65536;
      }
      this.nwZ = i;
      GMTrace.o(8958764908544L, 66748);
      return;
    }
    throw new IllegalArgumentException("Invalid APDU: length=" + this.nwX.length + ", b1=" + j + ", b2||b3=" + i);
  }
  
  public final boolean equals(Object paramObject)
  {
    GMTrace.i(8959301779456L, 66752);
    if (this == paramObject)
    {
      GMTrace.o(8959301779456L, 66752);
      return true;
    }
    if (!(paramObject instanceof a))
    {
      GMTrace.o(8959301779456L, 66752);
      return false;
    }
    paramObject = (a)paramObject;
    boolean bool = Arrays.equals(this.nwX, ((a)paramObject).nwX);
    GMTrace.o(8959301779456L, 66752);
    return bool;
  }
  
  public final byte[] getBytes()
  {
    GMTrace.i(8959033344000L, 66750);
    byte[] arrayOfByte = (byte[])this.nwX.clone();
    GMTrace.o(8959033344000L, 66750);
    return arrayOfByte;
  }
  
  public final int hashCode()
  {
    GMTrace.i(8959435997184L, 66753);
    int i = Arrays.hashCode(this.nwX);
    GMTrace.o(8959435997184L, 66753);
    return i;
  }
  
  public final void rP(int paramInt)
  {
    GMTrace.i(8958899126272L, 66749);
    this.nwZ = paramInt;
    this.nwX[(this.nwX.length - 1)] = ((byte)paramInt);
    GMTrace.o(8958899126272L, 66749);
  }
  
  public final String toString()
  {
    GMTrace.i(8959167561728L, 66751);
    String str = com.tencent.mm.plugin.nfc.c.a.byteArrayToHexString(this.nwX);
    GMTrace.o(8959167561728L, 66751);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nfc\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */