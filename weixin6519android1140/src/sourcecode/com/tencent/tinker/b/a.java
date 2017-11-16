package com.tencent.tinker.b;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;

public final class a
{
  public static int a(InputStream paramInputStream1, InputStream paramInputStream2, File paramFile)
  {
    if (paramInputStream1 == null) {
      return 3;
    }
    if (paramFile == null) {
      return 4;
    }
    if (paramInputStream2 == null) {
      return 2;
    }
    paramInputStream1 = b.r(paramInputStream1);
    Object localObject2 = b.r(paramInputStream2);
    int m = paramInputStream1.length;
    int i = localObject2.length;
    paramInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[])localObject2, 0, i));
    paramInputStream2.skip(8L);
    long l1 = paramInputStream2.readLong();
    long l2 = paramInputStream2.readLong();
    int n = (int)paramInputStream2.readLong();
    paramInputStream2.close();
    paramInputStream2 = new ByteArrayInputStream((byte[])localObject2, 0, i);
    paramInputStream2.skip(32L);
    paramInputStream2 = new DataInputStream(new GZIPInputStream(paramInputStream2));
    Object localObject1 = new ByteArrayInputStream((byte[])localObject2, 0, i);
    ((InputStream)localObject1).skip(32L + l1);
    localObject1 = new GZIPInputStream((InputStream)localObject1);
    localObject2 = new ByteArrayInputStream((byte[])localObject2, 0, i);
    ((InputStream)localObject2).skip(l2 + l1 + 32L);
    GZIPInputStream localGZIPInputStream = new GZIPInputStream((InputStream)localObject2);
    localObject2 = new byte[n];
    int[] arrayOfInt = new int[3];
    i = 0;
    int j = 0;
    while (j < n)
    {
      int k = 0;
      while (k <= 2)
      {
        arrayOfInt[k] = paramInputStream2.readInt();
        k += 1;
      }
      if (arrayOfInt[0] + j > n) {
        throw new IOException("Corrupt by wrong patch file.");
      }
      if (!b.a((InputStream)localObject1, (byte[])localObject2, j, arrayOfInt[0])) {
        throw new IOException("Corrupt by wrong patch file.");
      }
      k = 0;
      while (k < arrayOfInt[0])
      {
        if ((i + k >= 0) && (i + k < m))
        {
          i1 = j + k;
          localObject2[i1] = ((byte)(localObject2[i1] + paramInputStream1[(i + k)]));
        }
        k += 1;
      }
      j = arrayOfInt[0] + j;
      int i1 = arrayOfInt[0];
      if (arrayOfInt[1] + j > n) {
        throw new IOException("Corrupt by wrong patch file.");
      }
      if (!b.a(localGZIPInputStream, (byte[])localObject2, j, arrayOfInt[1])) {
        throw new IOException("Corrupt by wrong patch file.");
      }
      k = arrayOfInt[1];
      i = i1 + i + arrayOfInt[2];
      j += k;
    }
    paramInputStream2.close();
    ((InputStream)localObject1).close();
    localGZIPInputStream.close();
    paramInputStream1 = new FileOutputStream(paramFile);
    try
    {
      paramInputStream1.write((byte[])localObject2);
      return 1;
    }
    finally
    {
      paramInputStream1.close();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tinker\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */