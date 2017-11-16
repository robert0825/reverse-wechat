package com.tencent.mapsdk.rastercore.tile.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public final class c
{
  private String a = "md5";
  private byte[] b;
  private int c = -1;
  
  public c(byte[] paramArrayOfByte, int paramInt)
  {
    this.b = paramArrayOfByte;
    this.c = paramInt;
  }
  
  public c(byte[] paramArrayOfByte, int paramInt, String paramString)
  {
    this.b = paramArrayOfByte;
    this.c = paramInt;
    this.a = paramString;
  }
  
  public final String a()
  {
    return this.a;
  }
  
  public final Bitmap b()
  {
    if (this.b == null) {
      return null;
    }
    return BitmapFactory.decodeByteArray(this.b, 0, this.b.length);
  }
  
  public final byte[] c()
  {
    return this.b;
  }
  
  public final int d()
  {
    return this.c;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\rastercore\tile\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */