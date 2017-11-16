package com.tencent.mm.plugin.g.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.j.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.Arrays;

public final class h
  extends j
{
  private static final byte[] jkM;
  private byte[] jkN;
  public byte[] jkO;
  public short jkP;
  public short jkQ;
  public int jkR;
  
  static
  {
    GMTrace.i(4796136292352L, 35734);
    jkM = new byte[] { 76, 0, 2, 21 };
    GMTrace.o(4796136292352L, 35734);
  }
  
  public h()
  {
    GMTrace.i(4795867856896L, 35732);
    this.jkN = null;
    this.jkO = null;
    this.jkP = -1;
    this.jkQ = -1;
    this.jkR = 0;
    GMTrace.o(4795867856896L, 35732);
  }
  
  final boolean Y(byte[] paramArrayOfByte)
  {
    GMTrace.i(4796002074624L, 35733);
    if (bg.bq(paramArrayOfByte))
    {
      w.e("MicroMsg.exdevice.IBeaconTLVSectionB", "valueByte is null or nil");
      GMTrace.o(4796002074624L, 35733);
      return false;
    }
    if (26 != this.mLength)
    {
      w.d("MicroMsg.exdevice.IBeaconTLVSectionB", "IBEACON_TLV_SECTION_B_LENGTH != mLength(%d) ", new Object[] { Integer.valueOf(this.mLength) });
      GMTrace.o(4796002074624L, 35733);
      return false;
    }
    a locala = new a(paramArrayOfByte.length);
    locala.v(paramArrayOfByte, paramArrayOfByte.length);
    paramArrayOfByte = new byte[4];
    locala.u(paramArrayOfByte, 4);
    if (!Arrays.equals(paramArrayOfByte, jkM))
    {
      w.d("MicroMsg.exdevice.IBeaconTLVSectionB", "Cannot find ibeacon cookies!!!");
      GMTrace.o(4796002074624L, 35733);
      return false;
    }
    this.jkN = paramArrayOfByte;
    this.jkO = new byte[16];
    locala.u(this.jkO, 16);
    try
    {
      this.jkP = locala.readShort();
      this.jkQ = locala.readShort();
      paramArrayOfByte = new byte[1];
      locala.u(paramArrayOfByte, 1);
      this.jkR = paramArrayOfByte[0];
      GMTrace.o(4796002074624L, 35733);
      return true;
    }
    catch (IOException paramArrayOfByte)
    {
      w.d("MicroMsg.exdevice.IBeaconTLVSectionB", "Read major/minor from autobuffer failed!!!");
      w.printErrStackTrace("MicroMsg.exdevice.IBeaconTLVSectionB", paramArrayOfByte, "", new Object[0]);
      GMTrace.o(4796002074624L, 35733);
    }
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\g\a\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */