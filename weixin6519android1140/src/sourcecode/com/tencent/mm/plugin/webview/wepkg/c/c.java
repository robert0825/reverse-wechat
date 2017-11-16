package com.tencent.mm.plugin.webview.wepkg.c;

import com.tencent.gmtrace.GMTrace;
import java.io.FilterInputStream;
import java.io.InputStream;

public abstract class c
  extends FilterInputStream
{
  public c(InputStream paramInputStream)
  {
    super(paramInputStream);
    GMTrace.i(12391383302144L, 92323);
    GMTrace.o(12391383302144L, 92323);
  }
  
  public int available()
  {
    GMTrace.i(12392054390784L, 92328);
    int i = this.in.available();
    GMTrace.o(12392054390784L, 92328);
    return i;
  }
  
  public void close()
  {
    GMTrace.i(12392188608512L, 92329);
    this.in.close();
    GMTrace.o(12392188608512L, 92329);
  }
  
  public void mark(int paramInt)
  {
    try
    {
      GMTrace.i(12392322826240L, 92330);
      this.in.mark(paramInt);
      GMTrace.o(12392322826240L, 92330);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean markSupported()
  {
    GMTrace.i(12392591261696L, 92332);
    boolean bool = this.in.markSupported();
    GMTrace.o(12392591261696L, 92332);
    return bool;
  }
  
  public int read()
  {
    GMTrace.i(12391517519872L, 92324);
    int i = this.in.read();
    GMTrace.o(12391517519872L, 92324);
    return i;
  }
  
  public int read(byte[] paramArrayOfByte)
  {
    GMTrace.i(12391651737600L, 92325);
    int i = this.in.read(paramArrayOfByte);
    GMTrace.o(12391651737600L, 92325);
    return i;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    GMTrace.i(12391785955328L, 92326);
    paramInt1 = this.in.read(paramArrayOfByte, paramInt1, paramInt2);
    GMTrace.o(12391785955328L, 92326);
    return paramInt1;
  }
  
  public void reset()
  {
    try
    {
      GMTrace.i(12392457043968L, 92331);
      this.in.reset();
      GMTrace.o(12392457043968L, 92331);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public long skip(long paramLong)
  {
    GMTrace.i(12391920173056L, 92327);
    paramLong = this.in.skip(paramLong);
    GMTrace.o(12391920173056L, 92327);
    return paramLong;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */