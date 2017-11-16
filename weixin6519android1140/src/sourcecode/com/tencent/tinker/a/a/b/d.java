package com.tencent.tinker.a.a.b;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public final class d
{
  public static byte[] b(InputStream paramInputStream, int paramInt)
  {
    int i = paramInt;
    if (paramInt <= 0) {
      i = 32768;
    }
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(i);
    byte[] arrayOfByte = new byte[' '];
    for (;;)
    {
      paramInt = paramInputStream.read(arrayOfByte);
      if (paramInt <= 0) {
        break;
      }
      localByteArrayOutputStream.write(arrayOfByte, 0, paramInt);
    }
    return localByteArrayOutputStream.toByteArray();
  }
  
  public static byte[] h(InputStream paramInputStream)
  {
    return b(paramInputStream, 32768);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tinker\a\a\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */