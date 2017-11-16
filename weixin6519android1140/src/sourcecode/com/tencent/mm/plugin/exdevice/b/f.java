package com.tencent.mm.plugin.exdevice.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.a;
import com.tencent.mm.bm.b;
import com.tencent.mm.plugin.exdevice.e.k;
import com.tencent.mm.plugin.exdevice.e.l;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public final class f
  extends d
{
  public f(long paramLong, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    super(paramLong, paramInt1, paramInt2, paramArrayOfByte);
    GMTrace.i(11200603619328L, 83451);
    w.i("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "ExDeviceCmdSendDataToManufacturer deviceId = " + paramLong + " seq = " + paramInt1 + " cmdId = " + paramInt2);
    GMTrace.o(11200603619328L, 83451);
  }
  
  protected final a aj(byte[] paramArrayOfByte)
  {
    GMTrace.i(11200872054784L, 83453);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      w.e("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "data is null");
      GMTrace.o(11200872054784L, 83453);
      return null;
    }
    k localk = new k();
    try
    {
      localk.aD(paramArrayOfByte);
      this.kwU = localk;
      w.i("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "SendDataToManufacturerSvrRequest cmd has been received");
      GMTrace.o(11200872054784L, 83453);
      return localk;
    }
    catch (IOException paramArrayOfByte)
    {
      w.e("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "SendDataToManufacturerSvrRequest.parseFrom Failed!!! %s", new Object[] { paramArrayOfByte.getMessage() });
      w.printErrStackTrace("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", paramArrayOfByte, "", new Object[0]);
      GMTrace.o(11200872054784L, 83453);
    }
    return null;
  }
  
  public final void b(int paramInt, String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(11200737837056L, 83452);
    w.i("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "setSendDataToManufacturerResponse ret = " + paramInt + paramString);
    l locall = new l();
    locall.kBB = J(paramInt, paramString);
    paramString = paramArrayOfByte;
    if (paramArrayOfByte == null) {
      paramString = new byte[0];
    }
    locall.jgP = new b(paramString);
    this.kwT = locall;
    this.kwR = 20002;
    GMTrace.o(11200737837056L, 83452);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */