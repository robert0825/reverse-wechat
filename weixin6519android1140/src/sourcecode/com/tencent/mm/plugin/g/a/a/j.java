package com.tencent.mm.plugin.g.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.j.a;
import com.tencent.mm.sdk.platformtools.w;

public abstract class j
{
  protected byte jkS;
  protected byte[] jkT;
  protected int mLength;
  
  public j()
  {
    GMTrace.i(4803384049664L, 35788);
    this.mLength = -1;
    this.jkS = 0;
    this.jkT = null;
    GMTrace.o(4803384049664L, 35788);
  }
  
  abstract boolean Y(byte[] paramArrayOfByte);
  
  public final boolean a(a parama)
  {
    GMTrace.i(4803518267392L, 35789);
    if (parama.getSize() == 0)
    {
      w.w("MicroMsg.exdevice.TLVBase", "autoBuffer is null or nil");
      GMTrace.o(4803518267392L, 35789);
      return false;
    }
    byte[] arrayOfByte = new byte[1];
    parama.u(arrayOfByte, 1);
    int i = arrayOfByte[0];
    if (i + 1 > parama.getSize())
    {
      w.w("MicroMsg.exdevice.TLVBase", "lengthInt(%d) + 1 > autoBuffer.getSize()(%d)", new Object[] { Integer.valueOf(i), Integer.valueOf(parama.getSize()) });
      GMTrace.o(4803518267392L, 35789);
      return false;
    }
    if (i <= 1)
    {
      w.w("MicroMsg.exdevice.TLVBase", "length(%d) <= 1", new Object[] { Integer.valueOf(i) });
      GMTrace.o(4803518267392L, 35789);
      return false;
    }
    this.mLength = i;
    parama.u(arrayOfByte, 1);
    this.jkS = arrayOfByte[0];
    this.jkT = new byte[this.mLength - 1];
    parama.u(this.jkT, this.jkT.length);
    boolean bool = Y(this.jkT);
    GMTrace.o(4803518267392L, 35789);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\g\a\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */