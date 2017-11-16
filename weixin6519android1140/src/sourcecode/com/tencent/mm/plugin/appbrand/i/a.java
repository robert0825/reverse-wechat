package com.tencent.mm.plugin.appbrand.i;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public final class a
  extends InputStream
{
  public final ByteBuffer ixV;
  private int ixW;
  
  public a(ByteBuffer paramByteBuffer)
  {
    GMTrace.i(20011863244800L, 149100);
    this.ixV = paramByteBuffer;
    GMTrace.o(20011863244800L, 149100);
  }
  
  public final int available()
  {
    GMTrace.i(20011997462528L, 149101);
    int i = this.ixV.remaining();
    GMTrace.o(20011997462528L, 149101);
    return i;
  }
  
  public final void close()
  {
    GMTrace.i(20012400115712L, 149104);
    super.close();
    ByteBuffer localByteBuffer = this.ixV;
    Object localObject;
    if (localByteBuffer.getClass().getName().equals("java.nio.DirectByteBuffer")) {
      localObject = localByteBuffer.getClass();
    }
    try
    {
      localObject = ((Class)localObject).getDeclaredMethod("free", new Class[0]);
      boolean bool = ((Method)localObject).isAccessible();
      ((Method)localObject).setAccessible(true);
      ((Method)localObject).invoke(localByteBuffer, new Object[0]);
      ((Method)localObject).setAccessible(bool);
      System.gc();
      GMTrace.o(20012400115712L, 149104);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.d("MicroMsg.ByteBufferBackedInputStream", "free ByteBuffer, exp = %s", new Object[] { localException });
      }
    }
  }
  
  public final void mark(int paramInt)
  {
    try
    {
      GMTrace.i(20784957358080L, 154860);
      this.ixW = paramInt;
      GMTrace.o(20784957358080L, 154860);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean markSupported()
  {
    GMTrace.i(20785225793536L, 154862);
    GMTrace.o(20785225793536L, 154862);
    return true;
  }
  
  public final int read()
  {
    GMTrace.i(20012131680256L, 149102);
    if (this.ixV.hasRemaining())
    {
      int i = this.ixV.get();
      GMTrace.o(20012131680256L, 149102);
      return i & 0xFF;
    }
    GMTrace.o(20012131680256L, 149102);
    return -1;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    GMTrace.i(20012265897984L, 149103);
    if (!this.ixV.hasRemaining())
    {
      GMTrace.o(20012265897984L, 149103);
      return -1;
    }
    paramInt2 = Math.min(paramInt2, this.ixV.remaining());
    this.ixV.get(paramArrayOfByte, paramInt1, paramInt2);
    GMTrace.o(20012265897984L, 149103);
    return paramInt2;
  }
  
  public final void reset()
  {
    try
    {
      GMTrace.i(20785091575808L, 154861);
      this.ixV.position(this.ixW);
      GMTrace.o(20785091575808L, 154861);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\i\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */