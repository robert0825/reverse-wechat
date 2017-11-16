package com.google.a.a;

import java.io.IOException;

public abstract class e
{
  public volatile int aCP = -1;
  
  public static <T extends e> T a(T paramT, byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      paramArrayOfByte = new a(paramArrayOfByte, 0, paramInt);
      paramT.a(paramArrayOfByte);
      paramArrayOfByte.cB(0);
      return paramT;
    }
    catch (d paramT)
    {
      throw paramT;
    }
    catch (IOException paramT)
    {
      throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
    }
  }
  
  public static final byte[] b(e parame)
  {
    byte[] arrayOfByte = new byte[parame.nv()];
    int i = arrayOfByte.length;
    try
    {
      b localb = new b(arrayOfByte, 0, i);
      parame.a(localb);
      if (localb.aCN - localb.position != 0) {
        throw new IllegalStateException("Did not write as much data as expected.");
      }
    }
    catch (IOException parame)
    {
      throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", parame);
    }
    return arrayOfByte;
  }
  
  public abstract e a(a parama);
  
  public void a(b paramb) {}
  
  public final int nv()
  {
    int i = nw();
    this.aCP = i;
    return i;
  }
  
  public int nw()
  {
    return 0;
  }
  
  public String toString()
  {
    return f.c(this);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\a\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */