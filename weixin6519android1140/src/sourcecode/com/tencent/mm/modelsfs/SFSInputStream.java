package com.tencent.mm.modelsfs;

import com.tencent.gmtrace.GMTrace;
import java.io.IOException;
import java.io.InputStream;

public class SFSInputStream
  extends InputStream
{
  private long gTd;
  private long mNativePtr;
  
  public SFSInputStream(long paramLong)
  {
    GMTrace.i(13848853610496L, 103182);
    this.gTd = 0L;
    this.mNativePtr = paramLong;
    GMTrace.o(13848853610496L, 103182);
  }
  
  private static native int nativeClose(long paramLong);
  
  private static native int nativeRead(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  private static native long nativeSeek(long paramLong1, long paramLong2, int paramInt);
  
  private static native long nativeSize(long paramLong);
  
  public int available()
  {
    GMTrace.i(13848987828224L, 103183);
    if (this.mNativePtr == 0L) {
      throw new IOException("Stream already closed.");
    }
    long l1 = nativeSize(this.mNativePtr);
    if (l1 < 0L) {
      throw new IOException(SFSContext.nativeErrorMessage());
    }
    long l2 = nativeSeek(this.mNativePtr, 0L, 1);
    if (l2 < 0L) {
      throw new IOException(SFSContext.nativeErrorMessage());
    }
    int i = (int)(l1 - l2);
    GMTrace.o(13848987828224L, 103183);
    return i;
  }
  
  public void close()
  {
    GMTrace.i(13849122045952L, 103184);
    if (this.mNativePtr == 0L)
    {
      GMTrace.o(13849122045952L, 103184);
      return;
    }
    if (nativeClose(this.mNativePtr) == -1) {
      throw new IOException(SFSContext.nativeErrorMessage());
    }
    this.mNativePtr = 0L;
    GMTrace.o(13849122045952L, 103184);
  }
  
  protected void finalize()
  {
    GMTrace.i(13850061570048L, 103191);
    if (this.mNativePtr != 0L) {
      close();
    }
    super.finalize();
    GMTrace.o(13850061570048L, 103191);
  }
  
  public void mark(int paramInt)
  {
    GMTrace.i(13849390481408L, 103186);
    if (this.mNativePtr == 0L)
    {
      GMTrace.o(13849390481408L, 103186);
      return;
    }
    this.gTd = nativeSeek(this.mNativePtr, 0L, 1);
    GMTrace.o(13849390481408L, 103186);
  }
  
  public boolean markSupported()
  {
    GMTrace.i(13849256263680L, 103185);
    GMTrace.o(13849256263680L, 103185);
    return true;
  }
  
  public int read()
  {
    GMTrace.i(13849658916864L, 103188);
    if (this.mNativePtr == 0L) {
      throw new IOException("Stream already closed.");
    }
    byte[] arrayOfByte = new byte[1];
    do
    {
      i = nativeRead(this.mNativePtr, arrayOfByte, 0, 1);
    } while (i == 0);
    if (i == -1)
    {
      GMTrace.o(13849658916864L, 103188);
      return -1;
    }
    int i = arrayOfByte[0];
    GMTrace.o(13849658916864L, 103188);
    return i;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    GMTrace.i(13849793134592L, 103189);
    if (this.mNativePtr == 0L) {
      throw new IOException("Stream already closed.");
    }
    if (((paramInt1 | paramInt2) < 0) || (paramInt1 > paramArrayOfByte.length) || (paramArrayOfByte.length - paramInt1 < paramInt2)) {
      throw new ArrayIndexOutOfBoundsException("length = " + paramArrayOfByte.length + ", offset = " + paramInt1 + ", count = " + paramInt2);
    }
    paramInt1 = nativeRead(this.mNativePtr, paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt1 == 0)
    {
      GMTrace.o(13849793134592L, 103189);
      return -1;
    }
    if (paramInt1 == -1) {
      throw new IOException(SFSContext.nativeErrorMessage());
    }
    GMTrace.o(13849793134592L, 103189);
    return paramInt1;
  }
  
  public void reset()
  {
    GMTrace.i(13849524699136L, 103187);
    if (this.mNativePtr == 0L) {
      throw new IOException("Stream already closed.");
    }
    if (this.gTd < 0L) {
      throw new IOException("Previous call to mark() failed.");
    }
    if (nativeSeek(this.mNativePtr, this.gTd, 0) != this.gTd) {
      throw new IOException("Seeking to previous position failed.");
    }
    GMTrace.o(13849524699136L, 103187);
  }
  
  public long skip(long paramLong)
  {
    GMTrace.i(13849927352320L, 103190);
    if (this.mNativePtr == 0L) {
      throw new IOException("Stream already closed.");
    }
    if (paramLong < 0L) {
      throw new IOException("byteCount < 0: " + paramLong);
    }
    long l = nativeSeek(this.mNativePtr, 0L, 1);
    paramLong = nativeSeek(this.mNativePtr, paramLong, 1);
    if ((l == -1L) || (paramLong == -1L)) {
      throw new IOException(SFSContext.nativeErrorMessage());
    }
    GMTrace.o(13849927352320L, 103190);
    return paramLong - l;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsfs\SFSInputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */