package com.tencent.mm.ab;

import java.io.Closeable;

public abstract interface d
  extends Closeable
{
  public abstract int getAudioType();
  
  public abstract long getSize();
  
  public abstract void open();
  
  public abstract int readAt(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ab\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */