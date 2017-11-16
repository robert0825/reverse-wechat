package com.google.android.gms.c;

import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class be
{
  protected volatile int axi = -1;
  
  public static final <T extends be> T a(T paramT, byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      paramArrayOfByte = new aw(paramArrayOfByte, 0, paramInt);
      paramT.a(paramArrayOfByte);
      paramArrayOfByte.ch(0);
      return paramT;
    }
    catch (bd paramT)
    {
      throw paramT;
    }
    catch (IOException paramT)
    {
      throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
    }
  }
  
  public static final byte[] c(be parambe)
  {
    byte[] arrayOfByte = new byte[parambe.mf()];
    int i = arrayOfByte.length;
    try
    {
      ax localax = ax.b(arrayOfByte, 0, i);
      parambe.a(localax);
      if (localax.awW.remaining() != 0) {
        throw new IllegalStateException("Did not write as much data as expected.");
      }
    }
    catch (IOException parambe)
    {
      throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", parambe);
    }
    return arrayOfByte;
  }
  
  public abstract be a(aw paramaw);
  
  public void a(ax paramax) {}
  
  public be lU()
  {
    return (be)super.clone();
  }
  
  protected int li()
  {
    return 0;
  }
  
  public final int me()
  {
    if (this.axi < 0) {
      mf();
    }
    return this.axi;
  }
  
  public final int mf()
  {
    int i = li();
    this.axi = i;
    return i;
  }
  
  public String toString()
  {
    return bf.d(this);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\c\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */