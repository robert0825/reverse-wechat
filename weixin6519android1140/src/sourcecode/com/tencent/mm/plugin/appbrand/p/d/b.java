package com.tencent.mm.plugin.appbrand.p.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.c.c;
import java.nio.ByteBuffer;

public final class b
  extends e
  implements a
{
  static final ByteBuffer iIh;
  private int code;
  private String iIi;
  
  static
  {
    GMTrace.i(10166858678272L, 75749);
    iIh = ByteBuffer.allocate(0);
    GMTrace.o(10166858678272L, 75749);
  }
  
  public b()
  {
    super(d.a.iIo);
    GMTrace.i(10165650718720L, 75740);
    cB(true);
    GMTrace.o(10165650718720L, 75740);
  }
  
  public b(int paramInt, String paramString)
  {
    super(d.a.iIo);
    GMTrace.i(10165919154176L, 75742);
    cB(true);
    if (paramString == null) {
      paramString = "";
    }
    for (;;)
    {
      int i = paramInt;
      if (paramInt == 1015)
      {
        paramString = "";
        i = 1005;
      }
      if (i == 1005)
      {
        if (paramString.length() > 0) {
          throw new com.tencent.mm.plugin.appbrand.p.c.b("A close frame must have a closecode if it has a reason");
        }
        GMTrace.o(10165919154176L, 75742);
        return;
      }
      paramString = com.tencent.mm.plugin.appbrand.p.f.b.sH(paramString);
      ByteBuffer localByteBuffer1 = ByteBuffer.allocate(4);
      localByteBuffer1.putInt(i);
      localByteBuffer1.position(2);
      ByteBuffer localByteBuffer2 = ByteBuffer.allocate(paramString.length + 2);
      localByteBuffer2.put(localByteBuffer1);
      localByteBuffer2.put(paramString);
      localByteBuffer2.rewind();
      l(localByteBuffer2);
      GMTrace.o(10165919154176L, 75742);
      return;
    }
  }
  
  public final int abN()
  {
    GMTrace.i(10166187589632L, 75744);
    int i = this.code;
    GMTrace.o(10166187589632L, 75744);
    return i;
  }
  
  public final ByteBuffer abO()
  {
    GMTrace.i(10166724460544L, 75748);
    if (this.code == 1005)
    {
      localByteBuffer = iIh;
      GMTrace.o(10166724460544L, 75748);
      return localByteBuffer;
    }
    ByteBuffer localByteBuffer = super.abO();
    GMTrace.o(10166724460544L, 75748);
    return localByteBuffer;
  }
  
  public final String getMessage()
  {
    GMTrace.i(10166321807360L, 75745);
    String str = this.iIi;
    GMTrace.o(10166321807360L, 75745);
    return str;
  }
  
  public final void l(ByteBuffer paramByteBuffer)
  {
    GMTrace.i(10166590242816L, 75747);
    super.l(paramByteBuffer);
    this.code = 1005;
    paramByteBuffer = super.abO();
    paramByteBuffer.mark();
    if (paramByteBuffer.remaining() >= 2)
    {
      ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
      localByteBuffer.position(2);
      localByteBuffer.putShort(paramByteBuffer.getShort());
      localByteBuffer.position(0);
      this.code = localByteBuffer.getInt();
      if ((this.code == 1006) || (this.code == 1015) || (this.code == 1005) || (this.code > 4999) || (this.code < 1000) || (this.code == 1004)) {
        throw new c("closecode must not be sent over the wire: " + this.code);
      }
    }
    paramByteBuffer.reset();
    if (this.code == 1005)
    {
      this.iIi = com.tencent.mm.plugin.appbrand.p.f.b.m(super.abO());
      GMTrace.o(10166590242816L, 75747);
      return;
    }
    paramByteBuffer = super.abO();
    int i = paramByteBuffer.position();
    try
    {
      paramByteBuffer.position(paramByteBuffer.position() + 2);
      this.iIi = com.tencent.mm.plugin.appbrand.p.f.b.m(paramByteBuffer);
      paramByteBuffer.position(i);
      GMTrace.o(10166590242816L, 75747);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw new c(localIllegalArgumentException);
    }
    finally
    {
      paramByteBuffer.position(i);
    }
  }
  
  public final String toString()
  {
    GMTrace.i(10166456025088L, 75746);
    String str = super.toString() + "code: " + this.code;
    GMTrace.o(10166456025088L, 75746);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\p\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */