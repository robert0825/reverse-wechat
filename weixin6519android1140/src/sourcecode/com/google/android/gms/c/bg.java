package com.google.android.gms.c;

import java.util.Arrays;

final class bg
{
  final byte[] axj;
  final int tag;
  
  bg(int paramInt, byte[] paramArrayOfByte)
  {
    this.tag = paramInt;
    this.axj = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof bg)) {
        return false;
      }
      paramObject = (bg)paramObject;
    } while ((this.tag == ((bg)paramObject).tag) && (Arrays.equals(this.axj, ((bg)paramObject).axj)));
    return false;
  }
  
  public final int hashCode()
  {
    return (this.tag + 527) * 31 + Arrays.hashCode(this.axj);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\c\bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */