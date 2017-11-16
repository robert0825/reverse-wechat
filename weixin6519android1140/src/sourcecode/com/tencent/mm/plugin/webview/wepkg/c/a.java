package com.tencent.mm.plugin.webview.wepkg.c;

import com.tencent.gmtrace.GMTrace;
import java.io.InputStream;

public final class a
  extends c
{
  int count;
  
  public a(InputStream paramInputStream)
  {
    super(paramInputStream);
    GMTrace.i(12392725479424L, 92333);
    GMTrace.o(12392725479424L, 92333);
  }
  
  public final int bGq()
  {
    try
    {
      GMTrace.i(12393396568064L, 92338);
      int i = this.count;
      this.count = 0;
      GMTrace.o(12393396568064L, 92338);
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int read()
  {
    GMTrace.i(12393128132608L, 92336);
    int j = super.read();
    int k = this.count;
    if (j >= 0) {}
    for (int i = 1;; i = 0)
    {
      this.count = (i + k);
      GMTrace.o(12393128132608L, 92336);
      return j;
    }
  }
  
  public final int read(byte[] paramArrayOfByte)
  {
    GMTrace.i(12392859697152L, 92334);
    int j = super.read(paramArrayOfByte);
    int k = this.count;
    if (j >= 0) {}
    for (int i = j;; i = 0)
    {
      this.count = (i + k);
      GMTrace.o(12392859697152L, 92334);
      return j;
    }
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    GMTrace.i(12392993914880L, 92335);
    paramInt2 = super.read(paramArrayOfByte, paramInt1, paramInt2);
    int i = this.count;
    if (paramInt2 >= 0) {}
    for (paramInt1 = paramInt2;; paramInt1 = 0)
    {
      this.count = (paramInt1 + i);
      GMTrace.o(12392993914880L, 92335);
      return paramInt2;
    }
  }
  
  public final long skip(long paramLong)
  {
    GMTrace.i(12393262350336L, 92337);
    paramLong = super.skip(paramLong);
    this.count = ((int)(this.count + paramLong));
    GMTrace.o(12393262350336L, 92337);
    return paramLong;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */