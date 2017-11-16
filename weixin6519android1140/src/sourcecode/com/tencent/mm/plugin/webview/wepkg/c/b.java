package com.tencent.mm.plugin.webview.wepkg.c;

import com.tencent.gmtrace.GMTrace;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class b
  extends InputStream
{
  private a rZm;
  private long size;
  
  public b(File paramFile, long paramLong1, long paramLong2)
  {
    GMTrace.i(12390175342592L, 92314);
    this.size = paramLong2;
    this.rZm = new a(new FileInputStream(paramFile));
    eo(paramLong1);
    this.rZm.bGq();
    GMTrace.o(12390175342592L, 92314);
  }
  
  private long bGr()
  {
    GMTrace.i(12391114866688L, 92321);
    long l1 = this.size;
    long l2 = this.rZm.count;
    GMTrace.o(12391114866688L, 92321);
    return l1 - l2;
  }
  
  private long en(long paramLong)
  {
    GMTrace.i(12390980648960L, 92320);
    paramLong = Math.min(bGr(), paramLong);
    GMTrace.o(12390980648960L, 92320);
    return paramLong;
  }
  
  private void eo(long paramLong)
  {
    GMTrace.i(12391249084416L, 92322);
    long l2;
    for (long l1 = 0L; l1 < paramLong; l1 += l2)
    {
      l2 = this.rZm.skip(paramLong - l1);
      if (l2 <= 0L) {
        break;
      }
    }
    if (l1 < paramLong) {
      throw new IOException("could not seek pos " + paramLong);
    }
    GMTrace.o(12391249084416L, 92322);
  }
  
  public final int available()
  {
    GMTrace.i(12390846431232L, 92319);
    int i = (int)en(this.rZm.available());
    GMTrace.o(12390846431232L, 92319);
    return i;
  }
  
  public final int read()
  {
    GMTrace.i(12390309560320L, 92315);
    if (bGr() <= 0L) {}
    for (int i = 1; i != 0; i = 0)
    {
      GMTrace.o(12390309560320L, 92315);
      return -1;
    }
    i = this.rZm.read();
    GMTrace.o(12390309560320L, 92315);
    return i;
  }
  
  public final int read(byte[] paramArrayOfByte)
  {
    GMTrace.i(12390443778048L, 92316);
    int i = read(paramArrayOfByte, 0, paramArrayOfByte.length);
    GMTrace.o(12390443778048L, 92316);
    return i;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    GMTrace.i(12390577995776L, 92317);
    long l = en(paramInt2);
    if ((l == 0L) && (paramInt2 > 0))
    {
      GMTrace.o(12390577995776L, 92317);
      return -1;
    }
    paramInt1 = this.rZm.read(paramArrayOfByte, paramInt1, (int)l);
    GMTrace.o(12390577995776L, 92317);
    return paramInt1;
  }
  
  public final long skip(long paramLong)
  {
    GMTrace.i(12390712213504L, 92318);
    paramLong = this.rZm.skip(en(paramLong));
    GMTrace.o(12390712213504L, 92318);
    return paramLong;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */