package com.tencent.mm.plugin.appbrand.p.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.f.b;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class e
  implements c
{
  protected static byte[] iIq;
  protected boolean iIr;
  protected d.a iIs;
  private ByteBuffer iIt;
  protected boolean iIu;
  
  static
  {
    GMTrace.i(10164576976896L, 75732);
    iIq = new byte[0];
    GMTrace.o(10164576976896L, 75732);
  }
  
  public e()
  {
    GMTrace.i(10162832146432L, 75719);
    GMTrace.o(10162832146432L, 75719);
  }
  
  public e(d.a parama)
  {
    GMTrace.i(10162966364160L, 75720);
    this.iIs = parama;
    this.iIt = ByteBuffer.wrap(iIq);
    GMTrace.o(10162966364160L, 75720);
  }
  
  public e(d paramd)
  {
    GMTrace.i(10163100581888L, 75721);
    this.iIr = paramd.abP();
    this.iIs = paramd.abR();
    this.iIt = paramd.abO();
    this.iIu = paramd.abQ();
    GMTrace.o(10163100581888L, 75721);
  }
  
  public final void a(d.a parama)
  {
    GMTrace.i(10163905888256L, 75727);
    this.iIs = parama;
    GMTrace.o(10163905888256L, 75727);
  }
  
  public ByteBuffer abO()
  {
    GMTrace.i(10163637452800L, 75725);
    ByteBuffer localByteBuffer = this.iIt;
    GMTrace.o(10163637452800L, 75725);
    return localByteBuffer;
  }
  
  public final boolean abP()
  {
    GMTrace.i(10163234799616L, 75722);
    boolean bool = this.iIr;
    GMTrace.o(10163234799616L, 75722);
    return bool;
  }
  
  public final boolean abQ()
  {
    GMTrace.i(10163503235072L, 75724);
    boolean bool = this.iIu;
    GMTrace.o(10163503235072L, 75724);
    return bool;
  }
  
  public final d.a abR()
  {
    GMTrace.i(10163369017344L, 75723);
    d.a locala = this.iIs;
    GMTrace.o(10163369017344L, 75723);
    return locala;
  }
  
  public final void cB(boolean paramBoolean)
  {
    GMTrace.i(10163771670528L, 75726);
    this.iIr = paramBoolean;
    GMTrace.o(10163771670528L, 75726);
  }
  
  public final void cC(boolean paramBoolean)
  {
    GMTrace.i(10164174323712L, 75729);
    this.iIu = paramBoolean;
    GMTrace.o(10164174323712L, 75729);
  }
  
  public final void e(d paramd)
  {
    GMTrace.i(10164308541440L, 75730);
    ByteBuffer localByteBuffer1 = paramd.abO();
    if (this.iIt == null)
    {
      this.iIt = ByteBuffer.allocate(localByteBuffer1.remaining());
      localByteBuffer1.mark();
      this.iIt.put(localByteBuffer1);
      localByteBuffer1.reset();
      this.iIr = paramd.abP();
      GMTrace.o(10164308541440L, 75730);
      return;
    }
    localByteBuffer1.mark();
    this.iIt.position(this.iIt.limit());
    this.iIt.limit(this.iIt.capacity());
    if (localByteBuffer1.remaining() > this.iIt.remaining())
    {
      ByteBuffer localByteBuffer2 = ByteBuffer.allocate(localByteBuffer1.remaining() + this.iIt.capacity());
      this.iIt.flip();
      localByteBuffer2.put(this.iIt);
      localByteBuffer2.put(localByteBuffer1);
      this.iIt = localByteBuffer2;
    }
    for (;;)
    {
      this.iIt.rewind();
      localByteBuffer1.reset();
      break;
      this.iIt.put(localByteBuffer1);
    }
  }
  
  public void l(ByteBuffer paramByteBuffer)
  {
    GMTrace.i(10164040105984L, 75728);
    this.iIt = paramByteBuffer;
    GMTrace.o(10164040105984L, 75728);
  }
  
  public String toString()
  {
    GMTrace.i(10164442759168L, 75731);
    String str = "Framedata{ optcode:" + this.iIs + ", fin:" + this.iIr + ", payloadlength:[pos:" + this.iIt.position() + ", len:" + this.iIt.remaining() + "], payload:" + Arrays.toString(b.sH(new String(this.iIt.array()))) + "}";
    GMTrace.o(10164442759168L, 75731);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\p\d\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */