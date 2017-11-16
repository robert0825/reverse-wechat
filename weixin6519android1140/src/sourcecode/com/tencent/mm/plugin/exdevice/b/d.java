package com.tencent.mm.plugin.exdevice.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.a;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public abstract class d
  extends c
{
  protected a kwU;
  private short kwV;
  private short kwW;
  
  public d(long paramLong, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    GMTrace.i(11204495933440L, 83480);
    this.kwU = null;
    this.kwV = -1;
    this.kwW = -1;
    w.i("MicroMsg.exdevice.ExDeviceCmdBaseReqResp", "onDeviceRequest deviceId = " + paramLong + " seq = " + paramInt1 + " cmdId = " + paramInt2);
    this.joF = paramLong;
    this.kwV = ((short)paramInt2);
    this.kwW = ((short)paramInt1);
    aj(paramArrayOfByte);
    GMTrace.o(11204495933440L, 83480);
  }
  
  protected abstract a aj(byte[] paramArrayOfByte);
  
  public final short atn()
  {
    GMTrace.i(11204764368896L, 83482);
    short s = this.kwV;
    GMTrace.o(11204764368896L, 83482);
    return s;
  }
  
  public final short ato()
  {
    GMTrace.i(11204898586624L, 83483);
    short s = this.kwW;
    GMTrace.o(11204898586624L, 83483);
    return s;
  }
  
  public final byte[] atp()
  {
    GMTrace.i(11205167022080L, 83485);
    try
    {
      byte[] arrayOfByte = this.kwT.toByteArray();
      GMTrace.o(11205167022080L, 83485);
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      w.e("MicroMsg.exdevice.ExDeviceCmdBaseReqResp", "mResp.toByteArray() Failed!!! %s", new Object[] { localIOException.getMessage() });
      w.printErrStackTrace("MicroMsg.exdevice.ExDeviceCmdBaseReqResp", localIOException, "", new Object[0]);
      GMTrace.o(11205167022080L, 83485);
    }
    return null;
  }
  
  public final a atq()
  {
    GMTrace.i(11205032804352L, 83484);
    a locala = this.kwU;
    GMTrace.o(11205032804352L, 83484);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */