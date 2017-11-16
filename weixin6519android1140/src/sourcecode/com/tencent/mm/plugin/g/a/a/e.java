package com.tencent.mm.plugin.g.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.j.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class e
{
  private final g jkm;
  public final h jkn;
  
  public e()
  {
    GMTrace.i(4800565477376L, 35767);
    this.jkm = new g();
    this.jkn = new h();
    GMTrace.o(4800565477376L, 35767);
  }
  
  public final boolean X(byte[] paramArrayOfByte)
  {
    GMTrace.i(4800699695104L, 35768);
    if (bg.bq(paramArrayOfByte))
    {
      w.e("MicroMsg.exdevice.IBeaconProtocal", "dataIn is null or nil");
      GMTrace.o(4800699695104L, 35768);
      return false;
    }
    a locala = new a(paramArrayOfByte.length);
    locala.v(paramArrayOfByte, paramArrayOfByte.length);
    boolean bool = this.jkm.a(locala);
    if (!bool)
    {
      w.d("MicroMsg.exdevice.IBeaconProtocal", "mSectionA.ParseTLV Failed!!!");
      GMTrace.o(4800699695104L, 35768);
      return bool;
    }
    bool = this.jkn.a(locala);
    if (!bool)
    {
      w.d("MicroMsg.exdevice.IBeaconProtocal", "mSectionB.ParseTLV Failed!!!");
      GMTrace.o(4800699695104L, 35768);
      return bool;
    }
    GMTrace.o(4800699695104L, 35768);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\g\a\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */