package com.tencent.mm.plugin.nfc.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.nfc.c.a;
import java.io.Serializable;
import java.util.Arrays;

public final class c
  implements Serializable
{
  public byte[] nwX;
  
  public c(byte[] paramArrayOfByte)
  {
    GMTrace.i(8959570214912L, 66754);
    if (paramArrayOfByte == null) {
      throw new IllegalArgumentException("apdu is null");
    }
    paramArrayOfByte = (byte[])paramArrayOfByte.clone();
    if (paramArrayOfByte.length < 2) {
      throw new IllegalArgumentException("apdu must be at least 2 bytes long");
    }
    this.nwX = paramArrayOfByte;
    GMTrace.o(8959570214912L, 66754);
  }
  
  public final void a(c paramc)
  {
    GMTrace.i(8960107085824L, 66758);
    int j = this.nwX.length;
    this.nwX = Arrays.copyOf(this.nwX, this.nwX.length + paramc.nwX.length - 2);
    j -= 2;
    paramc = (byte[])paramc.nwX.clone();
    int m = paramc.length;
    int k = 0;
    while (k < m)
    {
      int i = paramc[k];
      this.nwX[j] = i;
      k += 1;
      j += 1;
    }
    GMTrace.o(8960107085824L, 66758);
  }
  
  public final short aUc()
  {
    GMTrace.i(8959704432640L, 66755);
    short s = (short)(this.nwX[(this.nwX.length - 2)] & 0xFF);
    GMTrace.o(8959704432640L, 66755);
    return s;
  }
  
  public final short aUd()
  {
    GMTrace.i(8959838650368L, 66756);
    short s = (short)(this.nwX[(this.nwX.length - 1)] & 0xFF);
    GMTrace.o(8959838650368L, 66756);
    return s;
  }
  
  public final boolean equals(Object paramObject)
  {
    GMTrace.i(8960241303552L, 66759);
    if (this == paramObject)
    {
      GMTrace.o(8960241303552L, 66759);
      return true;
    }
    if (!(paramObject instanceof c))
    {
      GMTrace.o(8960241303552L, 66759);
      return false;
    }
    paramObject = (c)paramObject;
    boolean bool = Arrays.equals(this.nwX, ((c)paramObject).nwX);
    GMTrace.o(8960241303552L, 66759);
    return bool;
  }
  
  public final int hashCode()
  {
    GMTrace.i(8960375521280L, 66760);
    int i = Arrays.hashCode(this.nwX);
    GMTrace.o(8960375521280L, 66760);
    return i;
  }
  
  public final String toString()
  {
    GMTrace.i(8959972868096L, 66757);
    String str = a.byteArrayToHexString(this.nwX);
    GMTrace.o(8959972868096L, 66757);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nfc\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */