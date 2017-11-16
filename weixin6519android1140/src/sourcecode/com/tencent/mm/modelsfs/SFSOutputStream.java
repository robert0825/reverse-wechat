package com.tencent.mm.modelsfs;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.OutputStream;

public class SFSOutputStream
  extends OutputStream
{
  private StackTraceElement[] gTx;
  private long mNativePtr;
  
  public SFSOutputStream(long paramLong)
  {
    GMTrace.i(13844692860928L, 103151);
    this.mNativePtr = paramLong;
    this.gTx = Thread.currentThread().getStackTrace();
    GMTrace.o(13844692860928L, 103151);
  }
  
  private static native int nativeClose(long paramLong);
  
  private static native int nativeWrite(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public void close()
  {
    GMTrace.i(13844827078656L, 103152);
    if (this.mNativePtr == 0L)
    {
      GMTrace.o(13844827078656L, 103152);
      return;
    }
    if (nativeClose(this.mNativePtr) == -1) {
      throw new IOException(SFSContext.nativeErrorMessage());
    }
    this.mNativePtr = 0L;
    GMTrace.o(13844827078656L, 103152);
  }
  
  protected void finalize()
  {
    GMTrace.i(13845229731840L, 103155);
    if (this.mNativePtr != 0L)
    {
      StringBuilder localStringBuilder = new StringBuilder("SFSOutputStream leaked:\n");
      StackTraceElement[] arrayOfStackTraceElement = this.gTx;
      int j = arrayOfStackTraceElement.length;
      int i = 0;
      while (i < j)
      {
        localStringBuilder.append(arrayOfStackTraceElement[i].toString()).append('\n');
        i += 1;
      }
      w.e("MicroMsg.SFSOutputStream", localStringBuilder.toString());
      close();
    }
    super.finalize();
    GMTrace.o(13845229731840L, 103155);
  }
  
  public void write(int paramInt)
  {
    GMTrace.i(13844961296384L, 103153);
    if (this.mNativePtr == 0L) {
      throw new IOException("Stream already closed.");
    }
    int i = (byte)paramInt;
    if (nativeWrite(this.mNativePtr, new byte[] { i }, 0, 1) != 1) {
      throw new IOException(SFSContext.nativeErrorMessage());
    }
    GMTrace.o(13844961296384L, 103153);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    GMTrace.i(13845095514112L, 103154);
    if (this.mNativePtr == 0L) {
      throw new IOException("Stream already closed.");
    }
    if (((paramInt1 | paramInt2) < 0) || (paramInt1 > paramArrayOfByte.length) || (paramArrayOfByte.length - paramInt1 < paramInt2)) {
      throw new ArrayIndexOutOfBoundsException("length = " + paramArrayOfByte.length + "offset = " + paramInt1 + "count = " + paramInt2);
    }
    if (nativeWrite(this.mNativePtr, paramArrayOfByte, paramInt1, paramInt2) != paramInt2) {
      throw new IOException(SFSContext.nativeErrorMessage());
    }
    GMTrace.o(13845095514112L, 103154);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsfs\SFSOutputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */