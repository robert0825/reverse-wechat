package com.tencent.mm.plugin.exdevice.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public final class b
  extends d
{
  public b(long paramLong, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    super(paramLong, paramInt1, paramInt2, paramArrayOfByte);
    GMTrace.i(11198724571136L, 83437);
    w.i("MicroMsg.exdevice.ExDeviceCmdAuth", "ExDeviceCmdAuth deviceId = " + paramLong + " seq = " + paramInt1 + " cmdId = " + paramInt2);
    GMTrace.o(11198724571136L, 83437);
  }
  
  public final void a(int paramInt, String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(11198858788864L, 83438);
    w.i("MicroMsg.exdevice.ExDeviceCmdAuth", "------setAuthResponse------ret = " + paramInt + "errMsg = " + paramString);
    com.tencent.mm.plugin.exdevice.e.b localb = new com.tencent.mm.plugin.exdevice.e.b();
    localb.kBB = J(paramInt, paramString);
    localb.kBi = com.tencent.mm.bm.b.aX(paramArrayOfByte);
    this.kwT = localb;
    this.kwR = 20001;
    GMTrace.o(11198858788864L, 83438);
  }
  
  protected final com.tencent.mm.bm.a aj(byte[] paramArrayOfByte)
  {
    GMTrace.i(11198993006592L, 83439);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      w.e("MicroMsg.exdevice.ExDeviceCmdAuth", "paras body is null");
      GMTrace.o(11198993006592L, 83439);
      return null;
    }
    com.tencent.mm.plugin.exdevice.e.a locala = new com.tencent.mm.plugin.exdevice.e.a();
    try
    {
      locala.aD(paramArrayOfByte);
      this.kwU = locala;
      w.i("MicroMsg.exdevice.ExDeviceCmdAuth", "------AuthRequest------ ClientVersion = " + locala.kBb + " DeviceName = " + locala.jhm + " Language = " + locala.kBh + " TimeZone = " + locala.kBg);
      GMTrace.o(11198993006592L, 83439);
      return locala;
    }
    catch (IOException paramArrayOfByte)
    {
      w.e("MicroMsg.exdevice.ExDeviceCmdAuth", "AuthRequest.parseFrom Failed!!! %s", new Object[] { paramArrayOfByte.getMessage() });
      w.printErrStackTrace("MicroMsg.exdevice.ExDeviceCmdAuth", paramArrayOfByte, "", new Object[0]);
      GMTrace.o(11198993006592L, 83439);
    }
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */