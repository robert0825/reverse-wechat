package com.tencent.qqmusic.mediaplayer.seektable;

import android.os.Build.VERSION;
import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;

public class ParsableInputStreamWrapper
  implements Parsable, Closeable
{
  private final byte[] intBuffer;
  private final byte[] longBuffer;
  private long position;
  private final InputStream stream;
  
  public ParsableInputStreamWrapper(InputStream paramInputStream)
  {
    this.stream = paramInputStream;
    this.intBuffer = new byte[4];
    this.longBuffer = new byte[8];
    this.position = 0L;
  }
  
  public long available()
  {
    return this.stream.available();
  }
  
  public void close()
  {
    this.stream.close();
  }
  
  public void readBytes(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.position += this.stream.read(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public int readInt()
  {
    int i = this.stream.read(this.intBuffer);
    this.position += i;
    if (i != this.intBuffer.length) {
      return -1;
    }
    return (this.intBuffer[0] & 0xFF) << 24 | (this.intBuffer[1] & 0xFF) << 16 | (this.intBuffer[2] & 0xFF) << 8 | this.intBuffer[3] & 0xFF;
  }
  
  public int[] readIntArray(int paramInt)
  {
    int[] arrayOfInt = new int[paramInt];
    int i = 0;
    while (i < paramInt)
    {
      arrayOfInt[i] = readInt();
      i += 1;
    }
    return arrayOfInt;
  }
  
  public void readIntArrayInterleaved(int paramInt, int[]... paramVarArgs)
  {
    int i = 0;
    while (i < paramInt)
    {
      int k = paramVarArgs.length;
      int j = 0;
      while (j < k)
      {
        paramVarArgs[j][i] = readInt();
        j += 1;
      }
      i += 1;
    }
  }
  
  public long readLong()
  {
    int i = this.stream.read(this.longBuffer);
    this.position += i;
    if (i != this.longBuffer.length) {
      return -1L;
    }
    return (this.longBuffer[0] & 0xFF) << 56 | (this.longBuffer[1] & 0xFF) << 48 | (this.longBuffer[2] & 0xFF) << 40 | (this.longBuffer[3] & 0xFF) << 32 | (this.longBuffer[4] & 0xFF) << 24 | (this.longBuffer[5] & 0xFF) << 16 | (this.longBuffer[6] & 0xFF) << 8 | this.longBuffer[7] & 0xFF;
  }
  
  public long[] readLongArray(int paramInt)
  {
    long[] arrayOfLong = new long[paramInt];
    int i = 0;
    while (i < paramInt)
    {
      arrayOfLong[i] = readLong();
      i += 1;
    }
    return arrayOfLong;
  }
  
  public void readLongArrayInterleaved(int paramInt, long[]... paramVarArgs)
  {
    int i = 0;
    while (i < paramInt)
    {
      int k = paramVarArgs.length;
      int j = 0;
      while (j < k)
      {
        paramVarArgs[j][i] = readLong();
        j += 1;
      }
      i += 1;
    }
  }
  
  public String readString(int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    readBytes(arrayOfByte, 0, paramInt);
    if (Build.VERSION.SDK_INT >= 9) {
      return new String(arrayOfByte, Charset.defaultCharset());
    }
    return new String(arrayOfByte);
  }
  
  public long skip(long paramLong)
  {
    long l1 = 0L;
    long l2;
    long l3;
    do
    {
      l2 = l1;
      if (l1 == paramLong) {
        break;
      }
      l3 = this.stream.skip(paramLong - l1);
      l2 = l1 + l3;
      l1 = l2;
    } while (l3 > 0L);
    this.position += paramLong;
    return l2;
  }
  
  public long tell()
  {
    return this.position;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\seektable\ParsableInputStreamWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */