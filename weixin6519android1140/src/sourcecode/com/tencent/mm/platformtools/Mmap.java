package com.tencent.mm.platformtools;

import com.tencent.gmtrace.GMTrace;

public class Mmap
{
  private int fileSize;
  private String hjk;
  
  public Mmap()
  {
    GMTrace.i(13453448183808L, 100236);
    this.fileSize = 0;
    this.hjk = "";
    GMTrace.o(13453448183808L, 100236);
  }
  
  private static native int close(long paramLong);
  
  private static native long open(String paramString, int paramInt);
  
  private static native int read(long paramLong, int paramInt1, int paramInt2, Object paramObject);
  
  private static native int sync(long paramLong, int paramInt);
  
  private static native int write(long paramLong, int paramInt1, int paramInt2, Object paramObject);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\platformtools\Mmap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */